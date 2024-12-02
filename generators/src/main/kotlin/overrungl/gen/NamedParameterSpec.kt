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

package overrungl.gen

import com.palantir.javapoet.AnnotationSpec
import com.palantir.javapoet.CodeBlock
import com.palantir.javapoet.ParameterSpec

class NamedParameterSpec(val type: CustomTypeSpec, val name: String, val javadoc: CodeBlock?) {
    class Builder(val type: CustomTypeSpec, val name: String) {
        var javadoc: CodeBlock? = null

        fun build(): NamedParameterSpec = NamedParameterSpec(type, name, javadoc)
    }

    fun toSpec(): ParameterSpec = ParameterSpec.builder(type.carrier, name)
        .also {
            type.cType?.also { s ->
                it.addAnnotation(
                    AnnotationSpec.builder(CType).addMember("value", "$1S", s).build()
                )
            }
            javadoc?.also(it::addJavadoc)
        }
        .build()
}
