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

data class MethodSpec(
    private val returnType: ClassRef,
    private val name: String,
    private val parameters: List<ParameterSpec>,
    private val javadocSpec: JavadocSpec?,
    private val annotations: MutableList<AnnotationSpec> = mutableListOf(),
    private var defaultCode: String? = null,
    private var static: Boolean = false
) : AnnotatedSpec, Spec {
    var returnCarrierOverloads: Boolean = true
    var returnShouldAnnotateCType: Boolean = true

    private fun internalAppendString(indent: Int, builder: StringBuilder, classRefs: ClassRefs) {
        builder.apply {
            javadocSpec?.also {
                appendLine(it.build(indent))
            }

            returnType.also {
                if (returnShouldAnnotateCType && it.cType != null) {
                    at(CType, "value" to { _ -> listOf(""""${it.cType}"""") })
                }
                if (it.canonicalType != null) {
                    at(CanonicalType, "value" to { _ -> listOf(""""${it.canonicalType}"""") })
                }
            }

            // annotations
            annotations.sortedBy { it.type.simpleName(classRefs) }
                .forEach {
                    it.appendString(indent, this, classRefs)
                    appendLine()
                }

            // signature
            append("    ")
            if (defaultCode != null) {
                if (static) {
                    append("static ")
                } else {
                    append("default ")
                }
            }
            append("${returnType.simpleName(classRefs)} ${name}(")
            append(parameters.joinToString(", ") { param ->
                buildString {
                    param.type.also {
                        param.annotations.sortedBy { annotation -> annotation.type.simpleName(classRefs) }
                            .forEach { annotation ->
                                annotation.appendString(0, this, classRefs)
                                append(" ")
                            }

                        append("${it.simpleName(classRefs)} ${param.name}")
                    }
                }
            })
            append(")")
            // body
            if (defaultCode != null) {
                appendLine(" {")
                appendLine(defaultCode?.prependIndent("        "))
                appendLine("    }")
            } else {
                appendLine(";")
            }
            appendLine()
        }
    }

    override fun appendString(indent: Int, builder: StringBuilder, classRefs: ClassRefs) {
        parameters.forEach { param ->
            param.type.also {
                if (it.cType != null) {
                    param.at(CType, "value" to { _ -> listOf(""""${it.cType}"""") })
                }
                if (it.canonicalType != null) {
                    param.at(CanonicalType, "value" to { _ -> listOf(""""${it.canonicalType}"""") })
                }
            }
        }

        internalAppendString(indent, builder, classRefs)

        if (!static && !annotations.any { it.type == Skip }) {
            // generate carrier overload
            if ((returnCarrierOverloads && returnType.let { it.carrier != null && it.carrier != it }) ||
                parameters.any { it.type.let { ref -> ref.carrier != null && ref.carrier != ref } }
            ) {
                val pList = parameters.map { it.copy(type = it.type.carrier ?: it.type) }
                copy(
                    returnType = if (returnCarrierOverloads) returnType.let { it.carrier ?: it } else returnType,
                    name = if (parameters == pList) "${name}_" else name,
                    parameters = pList,
                    javadocSpec = javadocSpec,
                    defaultCode = null
                ).internalAppendString(indent, builder, classRefs)
            }

            // generate default parameter overload
            if (parameters.any { it.defaultValue != null }) {
                copy(
                    parameters = parameters.filter { it.defaultValue == null },
                    javadocSpec = javadocSpec?.withParams {
                        it.filter { p ->
                            parameters.filter { s -> s.defaultValue == null }.any { s -> s.name == p.first }
                        }
                    },
                    defaultCode = null
                ).also {
                    it.skip(
                        """
                        ${if (returnType == void) "" else "return "}this.$name(${parameters.joinToString(", ") { param -> param.defaultValue ?: param.name }});
                    """.trimIndent()
                    )
                }.internalAppendString(indent, builder, classRefs)
            }
        }
    }

    override fun at(classRef: ClassRef, vararg values: AnnotationKV) {
        annotations.add(AnnotationSpec(classRef, *values))
    }

    fun critical(allowHeapAccess: Boolean) {
        at(Critical, "allowHeapAccess" to { listOf(allowHeapAccess.toString()) })
    }

    fun entrypoint(name: String) {
        at(Entrypoint, "value" to { listOf(""""$name"""") })
    }

    fun override() {
        at(override)
    }

    fun skip() {
        at(Skip)
    }

    fun default(string: String) {
        defaultCode = string
    }

    fun static(string: String) {
        defaultCode = string
        static = true
    }

    fun skip(string: String) {
        skip()
        default(string)
    }
}

@MarshalGen
data class ParameterSpec(
    val type: ClassRef,
    val name: String,
    internal val annotations: MutableList<AnnotationSpec> = mutableListOf(),
    internal var defaultValue: String? = null
) : AnnotatedSpec {

    override fun at(classRef: ClassRef, vararg values: AnnotationKV) {
        annotations.add(AnnotationSpec(classRef, *values))
    }

    fun default(value: String) {
        defaultValue = value
    }

    fun ref() {
        at(Ref)
    }

    operator fun invoke(action: ParameterSpec.() -> Unit): ParameterSpec =
        apply(action)
}
