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

import java.nio.file.Files
import kotlin.io.path.Path
import kotlin.io.path.createDirectories

@DslMarker
annotation class MarshalGen

@MarshalGen
class DowncallSpec(private val qualifiedName: String, private var javadoc: JavadocSpec?) {
    private val packageName = qualifiedName.substringBeforeLast('.')
    private val simpleName = qualifiedName.substringAfterLast('.')
    val classRefs = ClassRefs()
    private val superclasses = mutableListOf<ClassRef>()
    private val specs = mutableListOf<Spec>()

    init {
        classRefs.import(qualifiedName)
    }

    fun extends(vararg superclasses: ClassRef) {
        superclasses.forEach { this.superclasses.add(it) }
    }

    operator fun ClassRef.invoke(declaration: Pair<String, String>, javadoc: JavadocSpec? = null) {
        specs.add(FieldSpec(this, declaration.first, declaration.second, javadoc))
    }

    operator fun ClassRef.invoke(javadoc: JavadocSpec? = null, action: FieldListSpec.() -> Unit) {
        specs.add(FieldListSpec(this, mutableListOf(), javadoc).also(action))
    }

    operator fun ClassRef.invoke(
        methodName: String,
        vararg parameters: ParameterSpec,
        entrypoint: String? = null,
        javadoc: JavadocSpec? = null,
        action: (MethodSpec.() -> Unit)? = null
    ) {
        specs.add(MethodSpec(this, methodName, parameters.toList(), javadoc).also {
            entrypoint?.also(it::entrypoint)
            action?.invoke(it)
        })
    }

    operator fun ClassRef.times(name: String): ParameterSpec =
        ParameterSpec(this, name)

    operator fun Spec.unaryPlus() {
        this@DowncallSpec.specs.add(this)
    }

    private fun downcallLoadMethod(symbolLookup: String, downcallOptions: String?): String =
        "${Downcall.simpleName(classRefs)}.load(${handles.simpleName(classRefs)}.lookup(), $symbolLookup${if (downcallOptions != null) ", $downcallOptions" else ""})"

    fun instanceField(symbolLookup: String, downcallOptions: String? = null) {
        classRef(qualifiedName)("INSTANCE" to downcallLoadMethod(symbolLookup, downcallOptions))
    }

    fun instanceGetter(symbolLookup: String, downcallOptions: String? = null) {
        classRef(qualifiedName).also {
            it("getInstance") {
                static(
                    """
                    final class Holder {
                        static final ${it.simpleName(this@DowncallSpec.classRefs)} INSTANCE = ${
                        this@DowncallSpec.downcallLoadMethod(symbolLookup, downcallOptions)
                    };
                    }
                    return Holder.INSTANCE;
                """.trimIndent()
                )
            }
        }
    }

    fun generate() {
        Files.writeString(
            Path(packageName.replace('.', '/'))
                .createDirectories()
                .resolve("$simpleName.java"),
            buildString {
                appendLine(fileHeader)
                appendLine("package $packageName;")
                val s = buildString {
                    javadoc?.also {
                        appendLine(it.build(0))
                    }
                    append("public interface $simpleName")
                    if (superclasses.isNotEmpty()) {
                        append(" extends ")
                        append(superclasses.joinToString(separator = ", ") { it.simpleName(classRefs) })
                    }
                    appendLine(" {")
                    specs.forEach { it.appendString(4, this, classRefs) }
                    appendLine("}")
                }

                // imports
                classRefs.appendString(this, qualifiedName)
                appendLine()
                append(s)
            }
        )
    }
}

fun downcall(name: String, javadoc: JavadocSpec? = null, action: DowncallSpec.() -> Unit) {
    DowncallSpec(name, javadoc).also {
        it.action()
        it.generate()
    }
}
