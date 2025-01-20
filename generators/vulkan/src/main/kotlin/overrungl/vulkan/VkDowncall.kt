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
import overrungl.gen.writeString
import kotlin.io.path.Path

class VkDowncall(
    private val packageName: String,
    private val className: String,
    write: Boolean = true,
    action: VkDowncall.() -> Unit
) {
    var modifier: String? = null
    val imports = mutableSetOf<String>()
    val extends = mutableListOf<String>()
    val fields = mutableListOf<VkDowncallField>()
    val aliasFields = mutableListOf<VkDowncallField>()
    val handleFields = mutableListOf<VkDowncallField>()
    val pfnFields = mutableListOf<VkDowncallField>()
    val addedField = mutableSetOf<String>()
    val methods = mutableListOf<VkDowncallMethod>()
    var constructor: String? = null
    var handlesConstructor: String? = null
    var customCode: String? = null

    init {
        action(this)
        if (write) {
            write()
        }
    }

    fun addReqTypes(list: List<String>) {
        list.forEach { reqType ->
            vkEnums[reqType]?.also { enumType ->
                val type = enumType.javaType()
                enumType.enums.forEach { enum ->
                    val name = enum.name
                    if (enum.alias != null) {
                        aliasFields.add(VkDowncallField(type, name, enum.alias))
                    } else {
                        if (!addedField.contains(name)) {
                            fields.add(
                                VkDowncallField(
                                    type,
                                    name,
                                    enum.value
                                        ?: if (enum.bitpos != null) "0x${"%08x".format(1L shl enum.bitpos.toInt())}${if (type == "long") "L" else ""}"
                                        else error("both enum.value and enum.bitpos are null")
                                )
                            )
                            addedField.add(name)
                        }
                    }
                    vkEnumClass[name] = "$packageName.$className"
                }
            }
        }
    }

    fun addReqEnums(list: List<VkRequireEnum>) {
        list.forEach { reqEnum ->
            if (reqEnum.api != null && reqEnum.api == "vulkansc") return@forEach
            val name = reqEnum.name
            if (reqEnum.alias != null) {
                val alias = reqEnum.alias
                val enumType = vkEnums[reqEnum.extends]
                val enumConstant = enumConstants[alias]
                aliasFields.add(
                    VkDowncallField(
                        enumType?.javaType() ?: (enumConstant?.type ?: error(name)),
                        name,
                        alias
                    )
                )
                if (enumType == null) {
                    enumConstants[name] = VkEnumConstant(enumConstant!!.type, name, alias)
                }
            } else {
                if (!addedField.contains(name)) {
                    if (reqEnum.extends != null) {
                        val enumType = vkEnums[reqEnum.extends]!!
                        val type = enumType.javaType()
                        val value = if (reqEnum.bitpos != null) {
                            "0x${"%08x".format(1L shl reqEnum.bitpos.toInt())}${if (type == "long") "L" else ""}"
                        } else if (reqEnum.offset != null) {
                            buildString {
                                if (reqEnum.dir != null) {
                                    append(reqEnum.dir)
                                }
                                append(extBase + (reqEnum.extnumber!!.toInt() - 1) * extBlockSize + reqEnum.offset.toInt())
                            }
                        } else reqEnum.value ?: error(reqEnum.name)
                        fields.add(VkDowncallField(type, name, value))
                    } else if (reqEnum.value != null) {
                        val value = reqEnum.value
                        val type = if (value.contains('"')) "String" else "int"
                        fields.add(VkDowncallField(type, name, value))
                        enumConstants[name] = VkEnumConstant(type, name, value)
                    } else {
                        val enumConstant = enumConstants[name] ?: error(name)
                        fields.add(
                            VkDowncallField(
                                enumConstant.type,
                                name,
                                enumConstant.value
                            )
                        )
                    }
                    addedField.add(name)
                }
            }
            vkEnumClass.putIfAbsent(name, "$packageName.$className")
        }
    }

    fun addReqCommand(
        list: List<String>,
        commandMap: Map<String, VkCommand>,
        commandAliasMap: Map<String, MutableList<String>>
    ) {
        list.forEach { reqCommand ->
            val cmd = commandMap[reqCommand]
                ?: commandMap[(commandAliasMap[reqCommand] ?: error(reqCommand)).find(commandMap::containsKey)]
                ?: error(reqCommand)
            val descriptor = buildString {
                append("FunctionDescriptor.of")
                if (cmd.type.javaName == "void") {
                    append("Void")
                }
                append("(")
                if (cmd.type.javaName != "void") {
                    append(cmd.type.layout)
                    if (cmd.params.isNotEmpty()) {
                        append(", ")
                    }
                }
                append(cmd.params.joinToString(", ") { it.type.layout.toString() })
                append(")")
            }
            downcallDescriptors.add(descriptor)
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

            methods.add(
                VkDowncallMethod(
                    cmd.type,
                    reqCommand,
                    cmd.params.map { VkDowncallParam(it.type, it.name) }
                )
            )
        }
    }

    fun write() {
        val sb = StringBuilder()
        sb.appendLine(commentedFileHeader)
        sb.appendLine(
            """
                package $packageName;
                import java.lang.foreign.*;
                import java.lang.invoke.*;
                import overrungl.annotation.*;
                import overrungl.internal.RuntimeHelper;
                import overrungl.util.*;
            """.trimIndent()
        )
        if (packageName != vulkanPackage) sb.appendLine("import overrungl.vulkan.*;")
        imports.sorted().forEach { sb.appendLine("import $it;") }
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
        // write aliases later to avoid forward declaration
        writeFields(aliasFields, 4)
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
            sb.append("    public ${m.type.annotatedTypeName()} ${m.name.substring(2)}(")
            sb.append(m.parameters.joinToString(", ") { "${it.type.annotatedTypeName()} ${it.name}" })
            sb.appendLine(") {")
            sb.appendLine("""        if (Unmarshal.isNullPointer(handles.PFN_${m.name})) throw new SymbolNotFoundError("Symbol not found: ${m.name}");""")
            sb.append("        try { ")
            if (m.type.javaName != "void") {
                sb.append("return (${m.type.javaName}) ")
            }
            sb.appendLine("Handles.MH_${m.name}.invokeExact(handles.PFN_${m.name}, ${m.parameters.joinToString(", ") { it.name }}); }")
            sb.appendLine("""        catch (Throwable e) { throw new RuntimeException("error in ${m.name}", e); }""")
            sb.appendLine("    }")
            sb.appendLine()
        }

        if (customCode != null) {
            sb.appendLine("    // --- OverrunGL custom code ---")
            sb.appendLine(customCode!!.prependIndent("    "))
        }

        sb.appendLine("}")

        writeString(Path(packageName.replace('.', '/'), "$className.java"), sb.toString())
    }
}

data class VkDowncallField(
    val type: String,
    val name: String,
    val value: String?,
    val modifier: String? = "public static final"
)

data class VkDowncallParam(val type: VkType, val name: String)

data class VkDowncallMethod(
    val type: VkType,
    val name: String,
    val parameters: List<VkDowncallParam>,
)
