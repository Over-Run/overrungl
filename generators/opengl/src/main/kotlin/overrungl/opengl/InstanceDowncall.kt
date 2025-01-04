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

import com.palantir.javapoet.TypeName
import overrungl.gen.CustomTypeSpec
import overrungl.gen.commentedFileHeader
import kotlin.io.path.Path

class InstanceDowncall(
    packageName: String,
    name: String,
    action: InstanceDowncall.() -> Unit
) {
    var modifier: String? = null
    var constructorModifier: String? = "public"
    var constructorParam: String? = null
    var constructorCode: String? = null
    var customCode: String? = null
    private val extends = mutableListOf<String>()
    private val permits = mutableListOf<String>()
    private val fields = mutableListOf<InstanceDowncallField>()
    private val methods = mutableListOf<InstanceDowncallMethod>()

    init {
        action()
        write(packageName, name)
    }

    fun extends(name: String) {
        extends.add(name)
    }

    fun permits(name: String) {
        permits.add(name)
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
        sb.append(
            """
                package $packageName;

                import java.lang.foreign.*;
                import java.lang.invoke.*;
                import overrungl.annotation.*;
                import overrungl.internal.RuntimeHelper;
                import overrungl.util.*;

                public
            """.trimIndent()
        )
        if (modifier != null) {
            sb.append(" ")
            sb.append(modifier)
        }
        sb.append(" class $name")
        if (extends.isNotEmpty()) {
            sb.append(" extends ")
            sb.append(extends.joinToString(", "))
        }
        if (permits.isNotEmpty()) {
            sb.append(" permits ")
            sb.append(permits.joinToString(", "))
        }
        sb.appendLine(" {")

        // fields
        fields.forEach {
            sb.append("    public")
            if (it.modifier != null) {
                sb.append(" ")
                sb.append(it.modifier)
            }
            sb.append(" final ${it.type} ${it.name}")
            if (it.value != null) {
                sb.append(" = ${it.value}")
            }
            sb.appendLine(";")
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

            sb.appendLine("        try { if (!Unmarshal.isNullPointer(PFN_${m.entrypoint}))")
            sb.append("            ")
            if (m.returnType.carrier != TypeName.VOID) {
                sb.append("return (${m.returnType.carrier}) ")
            }
            sb.append("MH_${m.entrypoint}.invokeExact(PFN_${m.entrypoint}")
            m.params.forEach {
                sb.append(", ${it.name}")
            }
            sb.appendLine(");")
            if (m.returnType.carrier != TypeName.VOID) {
                sb.appendLine("            else return ${m.returnType.nullValue};")
            }
            sb.appendLine("        }")
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
    val modifier: String? = null,
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
