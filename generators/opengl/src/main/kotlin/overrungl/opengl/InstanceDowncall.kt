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

import overrungl.gen.commentedFileHeader
import overrungl.gen.file.DefinitionFunction
import overrungl.gen.file.writeFunction
import overrungl.gen.writeString
import kotlin.io.path.Path
import kotlin.io.path.createParentDirectories

class InstanceDowncall(
    private val packageName: String,
    private val name: String,
    private val description: String,
    action: InstanceDowncall.() -> Unit
) {
    var modifier: String? = null
    var constructorModifier: String? = "public"
    var constructorParam: String? = null
    var handlesConstructorCode: String? = null
    var constructorCode: String? = null
    private val extends = mutableListOf<String>()
    private val fields = mutableListOf<InstanceDowncallField>()
    val handleFields = mutableListOf<InstanceDowncallField>()
    val pfnFields = mutableListOf<InstanceDowncallField>()
    private val methods = mutableListOf<DefinitionFunction>()

    init {
        action()
        write()
    }

    fun extends(name: String) {
        extends.add(name)
    }

    fun field(field: InstanceDowncallField) {
        if (fields.none { it.name == field.name })
            fields.add(field)
    }

    fun method(method: DefinitionFunction) {
        methods.add(method)
    }

    fun write() {
        val path = Path("src/main/generated/${packageName.replace('.', '/')}/$name.java")
            .createParentDirectories()
        val sb = StringBuilder()

        sb.appendLine(commentedFileHeader)
        sb.appendLine("package $packageName;")
        if (handleFields.isNotEmpty()) {
            sb.appendLine(
                """
                    import java.lang.foreign.*;
                    import java.lang.invoke.*;
                    import org.jspecify.annotations.*;
                    import overrungl.util.*;
                """.trimIndent()
            )
            if (packageName != openglPackage) sb.appendLine("import overrungl.opengl.*;")
            sb.appendLine("import static overrungl.internal.RuntimeHelper.*;")
        }
        sb.appendLine("/// $description")
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
            writeFunction(sb, m, handlesInstance = "handles", staticMethod = false)
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
