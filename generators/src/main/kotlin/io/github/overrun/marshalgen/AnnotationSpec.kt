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

typealias AnnotationKV = Pair<String, (ClassRefs) -> List<String>>

class AnnotationSpec(val type: ClassRef, vararg val values: AnnotationKV) {
    fun appendString(indent: Int, builder: StringBuilder, classRefs: ClassRefs) {
        builder.append(" ".repeat(indent))
        builder.append("@${type.simpleName(classRefs)}")
        values.map { (first, second1) ->
            second1.invoke(classRefs).let { second ->
                first to
                    if (second.size == 1) second.first()
                    else second.joinToString(", ", prefix = "{", postfix = "}")
            }
        }.also {
            if (it.size == 1 && it.first().first == "value") {
                builder.append("(${it.first().second})")
            } else if (it.isNotEmpty()) {
                builder.append("(${it.joinToString(", ") { (first, second) -> "$first = $second" }})")
            }
        }
    }
}

interface AnnotatedSpec {
    fun at(classRef: ClassRef, vararg values: AnnotationKV)

    fun byValue() {
        at(ByValue)
    }

    fun convert(target: BoolConvert) {
        at(Convert, "value" to { listOf("${ProcessorType_BoolConvert.simpleName(it)}.${target.name}") })
    }

    fun charset(name: String) {
        at(StrCharset, "value" to { listOf(""""$name"""") })
    }

    fun sized(size: Long) {
        at(Sized, "value" to { listOf("${size}L") })
    }
}
