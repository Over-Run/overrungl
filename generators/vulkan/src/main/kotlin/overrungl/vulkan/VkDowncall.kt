/*
 * MIT License
 *
 * Copyright (c) 2025 Overrun Organization
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 */

package overrungl.vulkan

import overrungl.gen.commentedFileHeader
import overrungl.gen.file.DefinitionFunction
import overrungl.gen.file.Interpreter
import overrungl.gen.file.functionDescriptor
import overrungl.gen.file.writeFunction
import overrungl.gen.nativeImageDowncallDescriptors
import overrungl.gen.writeString
import kotlin.io.path.Path
import kotlin.io.path.createParentDirectories

data class VkFunction(val function: DefinitionFunction, val handlesInstance: String)

class VkDowncall(
    private val packageName: String,
    private val className: String,
    action: VkDowncall.() -> Unit
) {
    val fields = mutableListOf<VkDowncallField>()
    private val handleFields = mutableListOf<VkDowncallField>()
    private val pfnFields = mutableListOf<VkDowncallField>()
    private val addedField = mutableSetOf<String>()
    private val methods = mutableListOf<VkFunction>()
    var customCode: String? = null

    init {
        action(this)
    }

    fun addReqTypes(interpreter: Interpreter, list: List<String>) {
        list.forEach { reqType ->
            vkEnumTypeMapping[reqType]?.forEach {
                val macro = interpreter.macros()[it]!!
                if (!addedField.contains(macro.name)) {
                    fields.add(VkDowncallField(macro.type, macro.name, macro.value))
                    addedField.add(macro.name)
                }
            }
        }
    }

    fun addReqEnums(interpreter: Interpreter, list: List<String>) {
        list.forEach { reqEnum ->
            val macro = interpreter.macros()[reqEnum]!!
            if (!addedField.contains(macro.name)) {
                fields.add(VkDowncallField(macro.type, macro.name, macro.value))
                addedField.add(macro.name)
            }
        }
    }

    fun addReqCommand(
        interpreter: Interpreter,
        list: List<String>,
        commandAliasMap: Map<String, MutableList<String>>
    ) {
        list.forEach { reqCommand ->
            val functions = interpreter.functions()
            val cmd = functions[reqCommand]
                ?: functions[(commandAliasMap[reqCommand] ?: error(reqCommand)).find(functions::containsKey)]
                ?: error(reqCommand)
            val descriptor = functionDescriptor(cmd)
            nativeImageDowncallDescriptors.add(descriptor)
            handleFields.add(
                VkDowncallField(
                    "MethodHandle",
                    "MH_${reqCommand}",
                    "RuntimeHelper.downcall($descriptor)"
                )
            )
            pfnFields.add(
                VkDowncallField(
                    "MemorySegment",
                    "PFN_${reqCommand}",
                    null,
                    modifier = "public final"
                )
            )

            val first = cmd.parameters[0]
            val function = cmd.copy(
                name = reqCommand, entrypoint = reqCommand, parameters =
                    if (first.type is VkDispatchableHandleIntermediate) cmd.parameters.toMutableList()
                        .also {
                            it[0] = first.copy(
                                type = VkDispatchableHandle(
                                    name = (first.type as VkDispatchableHandleIntermediate).name,
                                    originalName = first.type.originalName
                                )
                            )
                        }
                    else cmd.parameters
            )
            methods.add(
                VkFunction(
                    function,
                    handlesInstance =
                        if (first.type is VkDispatchableHandleIntermediate) "${first.name}.capabilities()"
                        else "VK.globalCommands()"
                )
            )
            if (first.type is VkDispatchableHandleIntermediate) {
                when (val it = (first.type as VkDispatchableHandleIntermediate).name) {
                    "VkInstance", "VkPhysicalDevice" -> instanceCommands.add(function.name)
                    "VkDevice", "VkQueue", "VkCommandBuffer" -> deviceCommands.add(function.name)
                    else -> error(it)
                }
            }
        }
    }

    fun write() {
        val sb = StringBuilder()
        sb.appendLine(commentedFileHeader)
        sb.appendLine("package $packageName;")
        if (handleFields.isNotEmpty()) {
            sb.appendLine(
                """
                    import java.lang.foreign.*;
                    import java.lang.invoke.*;
                    import overrungl.internal.RuntimeHelper;
                    import overrungl.util.*;
                """.trimIndent()
            )
        }
        if (packageName != vulkanPackage) sb.appendLine("import overrungl.vulkan.*;")
        sb.appendLine("public final class $className {")

        fun writeFields(list: List<VkDowncallField>, indent: Int) {
            list.forEach {
                sb.append(" ".repeat(indent))
                sb.append("${it.modifier} ${it.type} ${it.name}")
                if (it.value != null) {
                    sb.append(" = ")
                    sb.append(it.value)
                }
                sb.appendLine(";")
            }
        }
        writeFields(fields, 4)
        if (handleFields.isNotEmpty()) {
            sb.appendLine("    public static final class Handles {")
            writeFields(handleFields, 8)
            sb.appendLine("        private Handles() {}")
            sb.appendLine("    }")
        }
        sb.appendLine()

        sb.appendLine(
            """
                |    private $className() {}
            """.trimMargin()
        )
        sb.appendLine()

        methods.forEach { m ->
            writeFunction(sb, m.function, handlesInstance = m.handlesInstance)
        }

        if (customCode != null) {
            sb.appendLine("    // --- OverrunGL custom code ---")
            sb.appendLine(customCode!!.prependIndent("    "))
        }

        sb.appendLine("}")

        writeString(Path(packageName.replace('.', '/'), "$className.java").createParentDirectories(), sb.toString())
    }
}

data class VkDowncallField(
    val type: String,
    val name: String,
    val value: String?,
    val modifier: String? = "public static final"
)
