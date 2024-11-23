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

typealias JavadocParam = Pair<String, String>

@MarshalGen
data class JavadocSpec(
    private val paragraphs: MutableList<String> = mutableListOf(),
    private val params: MutableList<JavadocParam> = mutableListOf(),
    private val sees: MutableList<String> = mutableListOf(),
    private var returns: String? = null
) {
    operator fun String.unaryPlus() {
        paragraphs.add(this)
    }

    infix fun String.param(string: String) {
        params.add(this to string)
    }

    fun see(string: String) {
        sees.add(string)
    }

    fun returns(string: String) {
        returns = string
    }

    fun withParams(params: (List<JavadocParam>) -> List<JavadocParam>): JavadocSpec = copy(
        paragraphs = paragraphs.toMutableList(),
        params = params.invoke(this.params).toMutableList(),
        sees = sees.toMutableList()
    )

    fun build(indent: Int): String = buildString {
        val indentStr = " ".repeat(indent)
        append(
            paragraphs.joinToString("\n\n").prependIndent("$indentStr/// ")
        )
        if (params.isNotEmpty()) {
            appendLine()
            append(params.joinToString("\n") { (name, string) ->
                "@param $name $string"
            }.prependIndent("$indentStr/// "))
        }
        returns?.also {
            appendLine()
            append("$indentStr/// @return $returns")
        }
        if (sees.isNotEmpty()) {
            appendLine()
            append(sees.joinToString("\n") {
                "@see $it"
            }.prependIndent("$indentStr/// "))
        }
    }
}

fun javadoc(action: JavadocSpec.() -> Unit): JavadocSpec =
    JavadocSpec().apply(action)
