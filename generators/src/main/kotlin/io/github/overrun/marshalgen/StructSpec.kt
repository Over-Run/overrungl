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

class StructSpec(private val qualifiedName: String, private val cType: String?, private var javadoc: JavadocSpec?) {
    private val packageName = qualifiedName.substringBeforeLast('.')
    private val simpleName = qualifiedName.substringAfterLast('.')
    val classRefs = ClassRefs()
    private val superclasses = mutableListOf<ClassRef>()
    private val specs = mutableListOf<Spec>()
    private val members = mutableListOf<StructMemberSpec>()
    val self: StructClassRef = StructClassRef(
        classRef(
            qualifiedName,
            address,
            cType,
            null
        ).let { it layout { refs -> "${it.simpleName(refs)}.OF.layout()" } },
        members
    )
    private var doLastAction: (StructSpec.() -> Unit)? = null

    init {
        classRefs.import(qualifiedName)
        StructRegistration.structs.add(self)
    }

    fun extends(vararg superclasses: ClassRef) {
        superclasses.forEach { this.superclasses.add(it) }
    }

    operator fun ClassRef.invoke(name: String): StructMemberSpec = StructMemberSpec(this, name, null).also {
        members.add(it)
    }

    operator fun Spec.unaryPlus() {
        specs.add(this)
    }

    fun doLast(action: StructSpec.() -> Unit) {
        doLastAction = action
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
                    if (javadoc == null) {
                        javadoc = JavadocSpec()
                    }
                    // javadoc
                    javadoc?.apply {
                        +"## Members"
                        members.forEach {
                            +"### ${it.name}"
                            if (it.type is StructClassRef) {
                                +"Definition of [${it.type.qualifiedName}]"
                            }else {
                                +"[Getter](#${it.name}()) - [Setter](#${it.name}(${(it.type.carrier ?: it.type).qualifiedName}))"
                            }
                            if (it.javadoc != null) {
                                +it.javadoc!!.build(0).trimMargin("/// ")
                            }
                        }
                        +"## Layout"
                        +buildString {
                            appendLine("```")
                            appendLine("typedef struct${if (cType != null) " $cType" else ""} {")
                            members.forEach {
                                appendLine("    ${it.type.cType ?: it.type.canonicalType ?: it.type.simpleName(classRefs)} ${it.name};")
                            }
                            appendLine("} $simpleName;")
                            appendLine("```")
                        }
                    }
                    extends(Struct.T(self))

                    // allocator
                    specs.add(FieldSpec(StructAllocator.T(self), "OF", buildString {
                        append("new ")
                        append(StructAllocator.T().simpleName(classRefs))
                        append("(")
                        append(handles.simpleName(classRefs))
                        append(".lookup(), ")
                        append(LayoutBuilder.simpleName(classRefs))
                        appendLine(".struct()")
                        members.forEach {
                            appendLine(
                                """        .add(${
                                    it.type.let { type ->
                                        type.memoryLayout?.invoke(classRefs) ?: throw IllegalStateException(
                                            "No memory layout for ${type.qualifiedName} c ${type.cType} canonical ${type.canonicalType}"
                                        )
                                    }
                                }, "${it.name}")"""
                            )
                        }
                        append("        .build())")
                    }, javadoc { +"The struct allocator." }))

                    specs.add(literal(""))

                    // slice
                    specs.add(MethodSpec(
                        self,
                        "slice",
                        listOf(ParameterSpec(java_long, "index"), ParameterSpec(java_long, "count")),
                        null
                    ).apply {
                        override()
                        returnCarrierOverloads = false
                        returnShouldAnnotateCType = false
                    })
                    specs.add(MethodSpec(
                        self,
                        "slice",
                        listOf(ParameterSpec(java_long, "index")),
                        null
                    ).apply {
                        override()
                        returnCarrierOverloads = false
                        returnShouldAnnotateCType = false
                    })

                    // accessors
                    expandMembers(null, members).forEach {
                        // getter
                        specs.add(MethodSpec(
                            it.type.carrier?.c(it.type.cType) ?: it.type,
                            it.name,
                            listOf(),
                            javadoc {
                                +"{@return `${it.name}`}"
                            }
                        ))

                        // setter
                        specs.add(MethodSpec(
                            self,
                            it.name,
                            listOf(ParameterSpec(it.type.carrier?.c(it.type.cType) ?: it.type, it.name)),
                            javadoc {
                                +"Sets `${it.name}` with the given value."
                                it.name param "the value"
                                returns("`this`")
                            }
                        ).apply {
                            returnCarrierOverloads = false
                            returnShouldAnnotateCType = false
                        })
                    }

                    doLastAction?.invoke(this@StructSpec)

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

private fun expandMembers(basename: String?, members: List<StructMemberSpec>): List<StructMemberSpec> {
    if (basename == null && members.all { it.type !is StructClassRef }) {
        return members
    }

    val list = mutableListOf<StructMemberSpec>()
    members.forEach {
        if (it.type is StructClassRef) {
            list.addAll(
                expandMembers(
                    if (basename == null) it.name
                    else "$basename\$${it.name}",
                    it.type.members
                )
            )
        } else {
            list.add(
                if (basename == null) it
                else it.copy(name = "$basename\$${it.name}")
            )
        }
    }
    return list
}

fun struct(name: String, cType: String? = null, javadoc: JavadocSpec? = null, action: StructSpec.() -> Unit): ClassRef {
    val s = StructSpec(name, cType, javadoc).apply {
        action()
        generate()
    }
    return s.self
}

data class StructMemberSpec(val type: ClassRef, val name: String, var javadoc: JavadocSpec?) {
    infix fun javadoc(action: JavadocSpec.() -> Unit) {
        javadoc = JavadocSpec().apply(action)
    }
}

object StructRegistration {
    internal val structs = mutableListOf<ClassRef>()

    fun generate(qualifiedName: String) {
        val classRefs = ClassRefs()
        val packageName = qualifiedName.substringBeforeLast('.')
        val javaName = qualifiedName.substringAfterLast('.')
        Files.writeString(Path(packageName.replace('.', '/'))
            .createDirectories()
            .resolve("$javaName.java"), buildString {
            appendLine(fileHeader)
            appendLine("package $packageName;")
            appendLine("import static overrun.marshal.gen.processor.ProcessorTypes.registerStruct;")
            appendLine("final class $javaName {")
            appendLine("    private $javaName() { }")
            appendLine("    static void registerAll() {")
            structs.forEach {
                val simpleName = it.simpleName(classRefs)
                appendLine("        registerStruct($simpleName.class, $simpleName.OF);")
            }
            appendLine("    }")
            appendLine("}")
        })
    }
}
