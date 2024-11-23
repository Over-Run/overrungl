/*
 * MIT License
 *
 * Copyright (c) 2024 Overrun Organization
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

package io.github.overrun.marshalgen

data class FieldSpec(
    val type: ClassRef,
    val name: String,
    val value: String,
    val javadoc: JavadocSpec?
) : Spec {
    override fun appendString(indent: Int, builder: StringBuilder, classRefs: ClassRefs) {
        val indentStr = " ".repeat(indent)
        builder.apply {
            javadoc?.also {
                appendLine(it.build(indent))
            }
            appendLine("$indentStr${type.simpleName(classRefs)} $name = $value;")
        }
    }
}

class FieldListSpec(
    private val type: ClassRef,
    private val pairs: MutableList<Triple<String, String, JavadocSpec?>>,
    private val javadoc: JavadocSpec?
) : Spec {
    override fun appendString(indent: Int, builder: StringBuilder, classRefs: ClassRefs) {
        val indentStr = " ".repeat(indent)
        builder.apply {
            javadoc?.also {
                appendLine(it.build(indent))
            }
            append("$indentStr${type.simpleName(classRefs)} ")
            appendLine(
                pairs.joinToString(
                    ",\n$indentStr$indentStr",
                    postfix = ";"
                ) { (name, value, javadoc) ->
                    buildString {
                        javadoc?.also {
                            appendLine(it.build(indent - 4))
                            append("$indentStr$indentStr")
                        }
                        append("$name = $value")
                    }
                })
        }
    }

    operator fun String.invoke(value: String, javadoc: JavadocSpec? = null) {
        pairs.add(Triple(this, value, javadoc))
    }
}
