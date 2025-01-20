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

package overrungl.opengl

import overrungl.gen.CustomTypeSpec
import overrungl.gen.commentedFileHeader
import overrungl.gen.writeString
import kotlin.io.path.Path

class InstanceDowncall(
    val packageName: String,
    val name: String,
    action: InstanceDowncall.() -> Unit
) {
    var modifier: String? = null
    var constructorModifier: String? = "public"
    var constructorParam: String? = null
    var handlesConstructorCode: String? = null
    var constructorCode: String? = null
    var customCode: String? = null
    private val extends = mutableListOf<String>()
    private val fields = mutableListOf<InstanceDowncallField>()
    val handleFields = mutableListOf<InstanceDowncallField>()
    val pfnFields = mutableListOf<InstanceDowncallField>()
    private val methods = mutableListOf<InstanceDowncallMethod>()

    init {
        action()
        write(packageName, name)
    }

    fun extends(name: String) {
        extends.add(name)
    }

    fun field(field: InstanceDowncallField) {
        if (fields.none { it.name == field.name })
            fields.add(field)
    }

    fun method(method: InstanceDowncallMethod) {
        methods.add(method)
    }

    fun write(packageName: String, name: String) {
        val path = Path("${packageName.replace('.', '/')}/$name.java")
        val sb = StringBuilder()

        sb.appendLine(commentedFileHeader)
        sb.appendLine("package $packageName;")
        sb.appendLine()
        if (handleFields.isNotEmpty()) {
            sb.appendLine(
                """
                    import java.lang.foreign.*;
                    import java.lang.invoke.*;
                    import overrungl.annotation.*;
                    import overrungl.internal.RuntimeHelper;
                    import overrungl.util.*;

                """.trimIndent()
            )
        }
        sb.append("public")
        if (modifier != null) {
            sb.append(" ")
            sb.append(modifier)
        }
        sb.append(" class $name")
        if (extends.isNotEmpty()) {
            sb.append(" extends ")
            sb.append(extends.joinToString(", "))
        }
        sb.appendLine(" {")

        // fields
        fun writeFields(list: List<InstanceDowncallField>, indent: Int) {
            list.forEach {
                sb.append(" ".repeat(indent))
                if (it.modifier != null) {
                    sb.append(it.modifier)
                }
                sb.append(" ${it.type} ${it.name}")
                if (it.value != null) {
                    sb.append(" = ${it.value}")
                }
                sb.appendLine(";")
            }
        }
        writeFields(fields, 4)
        if (handleFields.isNotEmpty()) {
            sb.appendLine("    public static final class Handles {")
            writeFields(handleFields, 8)
            writeFields(pfnFields, 8)
            sb.append("        private Handles(")
            if (constructorParam != null) {
                sb.append(constructorParam)
            }
            sb.appendLine(") {")
            if (handlesConstructorCode != null) {
                sb.appendLine(handlesConstructorCode!!.prependIndent("            "))
            }
            sb.appendLine("        }")
            sb.appendLine("    }")
        }

        // constructor
        sb.appendLine()
        sb.append("    ")
        if (constructorModifier != null) {
            sb.append(constructorModifier)
            sb.append(" ")
        }
        sb.append("$name(")
        if (constructorParam != null) {
            sb.append(constructorParam)
        }
        sb.appendLine(") {")
        if (constructorCode != null) {
            sb.appendLine(constructorCode!!.prependIndent("        "))
        }
        sb.appendLine("    }")
        sb.appendLine()

        // methods
        methods.forEach { m ->
            sb.append("    public ${m.returnType.carrierWithC()} ${m.name}(")
            sb.append(m.params.joinToString(", ") { p -> "${p.type.carrierWithC()} ${p.name}" })
            sb.appendLine(") {")

            sb.appendLine("""        if (Unmarshal.isNullPointer(handles.PFN_${m.entrypoint})) throw new SymbolNotFoundError("Symbol not found: ${m.entrypoint}");""")
            sb.append("        try { ")
            if (m.returnType.carrier != "void") {
                sb.append("return (${m.returnType.carrier}) ")
            }
            sb.append("Handles.MH_${m.entrypoint}.invokeExact(handles.PFN_${m.entrypoint}")
            m.params.forEach {
                sb.append(", ${it.name}")
            }
            sb.appendLine("); }")
            sb.appendLine("""        catch (Throwable e) { throw new RuntimeException("error in ${m.entrypoint}", e); }""")

            sb.appendLine("    }")
            sb.appendLine()
        }

        if (customCode != null) {
            sb.appendLine("    // --- OverrunGL custom code ---")
            sb.appendLine(customCode!!.prependIndent("    "))
        }

        sb.appendLine("}")

        writeString(path, sb.toString())
    }
}

data class InstanceDowncallField(
    val modifier: String?,
    val type: String,
    val name: String,
    val value: String? = null,
)

data class InstanceDowncallParameter(
    val type: CustomTypeSpec,
    val name: String,
)

data class InstanceDowncallMethod(
    val returnType: CustomTypeSpec,
    val name: String,
    val params: List<InstanceDowncallParameter>,
    val entrypoint: String,
)
