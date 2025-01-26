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

class VkDowncall(
    private val packageName: String,
    private val className: String,
    action: VkDowncall.() -> Unit
) {
    var modifier: String? = null
    val extends = mutableListOf<String>()
    val fields = mutableListOf<VkDowncallField>()
    private val handleFields = mutableListOf<VkDowncallField>()
    private val pfnFields = mutableListOf<VkDowncallField>()
    private val addedField = mutableSetOf<String>()
    private val methods = mutableListOf<DefinitionFunction>()
    var constructor: String? = null
    var handlesConstructor: String? = null
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

            methods.add(cmd.copy(name = reqCommand.substring(2), entrypoint = reqCommand))
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
        sb.append("public ")
        if (modifier != null) {
            sb.append("$modifier ")
        }
        sb.append("class $className")
        if (extends.isNotEmpty()) {
            sb.append(" extends ${extends.joinToString(", ")}")
        }
        sb.appendLine(" {")

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
            sb.appendLine("    private final Handles handles;")
            sb.appendLine("    public static final class Handles {")
            writeFields(handleFields, 8)
            writeFields(pfnFields, 8)
            if (handlesConstructor != null) {
                sb.appendLine(handlesConstructor!!.prependIndent("        "))
            }
            sb.appendLine("    }")
        }
        sb.appendLine()

        if (constructor != null) {
            sb.appendLine(constructor!!.prependIndent("    "))
        }
        sb.appendLine()

        methods.forEach { m ->
            writeFunction(sb, m, handlesInstance = "handles", staticMethod = false)
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
