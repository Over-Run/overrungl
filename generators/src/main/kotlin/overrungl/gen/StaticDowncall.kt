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

import com.palantir.javapoet.TypeName
import java.nio.file.Files
import kotlin.io.path.Path

class StaticDowncall(
    packageName: String,
    name: String,
    private val symbolLookup: String,
    action: StaticDowncall.() -> Unit
) {
    private val fields = mutableListOf<DowncallFieldSpec>()
    private val methods = mutableListOf<DowncallMethod>()

    init {
        action()
        write(packageName, name)
    }

    class FieldGroupBuilder {
        internal val fields = mutableListOf<FieldGroupMember>()

        operator fun String.invoke(value: String, javadoc: String? = null) {
            fields.add(FieldGroupMember(this, value, javadoc))
        }
    }

    operator fun CustomTypeSpec.invoke(nameAndValue: Pair<String, String>, javadoc: String? = null) {
        fields.add(DowncallField(this, nameAndValue.first, nameAndValue.second, javadoc))
    }

    operator fun CustomTypeSpec.invoke(javadoc: String? = null, builder: FieldGroupBuilder.() -> Unit) {
        fields.add(DowncallFieldGroup(this, javadoc, FieldGroupBuilder().also(builder).fields))
    }

    operator fun CustomTypeSpec.invoke(name: String, javadoc: String? = null): DowncallParameter {
        return DowncallParameter(this, name, javadoc)
    }

    operator fun String.invoke(
        returnType: CustomTypeSpec,
        vararg params: DowncallParameter,
        entrypoint: String?,
        javadoc: String? = null,
        code: String? = null,
        overload: Boolean = false
    ): DowncallMethod {
        val method = DowncallMethod(
            returnType,
            this,
            params.toList(),
            entrypoint,
            javadoc,
            code,
            overload
        )
        methods.add(method)
        return method
    }

    operator fun DowncallMethod.unaryPlus() {
        methods.add(this)
    }

    fun write(packageName: String, name: String) {
        val path = Path("${packageName.replace('.', '/')}/$name.java")
        val sb = StringBuilder()

        sb.appendLine("    //@formatter:off")

        // fields
        fields.forEach {
            it.append(sb)
        }

        // method handles
        sb.appendLine("    //region Method handles")
        mutableListOf<String>().also { l ->
            methods.forEach {
                if (it.entrypoint != null && it.entrypoint !in l) {
                    sb.appendLine(
                        """
                            |    /// The method handle of `${it.entrypoint}`.
                            |    public static final MethodHandle MH_${it.entrypoint} = RuntimeHelper.downcall($symbolLookup, "${it.entrypoint}", ${it.functionDescriptor()});
                        """.trimMargin()
                    )
                    l.add(it.entrypoint)
                }
            }
        }
        sb.appendLine("    //endregion")

        sb.appendLine()

        // methods
        methods.forEach { m ->
            val chosenReturnType = m.returnType.selectTypeName(m.overload)
            val returnVoid = chosenReturnType == TypeName.VOID
            if (m.javadoc != null) {
                sb.appendLine(m.javadoc.prependIndent("    ///"))
            }
            sb.appendLine(
                "    public static ${m.returnType.typeNameWithC(chosenReturnType)} ${m.name}(${
                    m.parameters.joinToString { p ->
                        p.toString(p.type.selectTypeName(m.overload))
                    }
                }) {"
            )
            if (m.code != null) {
                sb.appendLine(m.code.prependIndent("        "))
            } else {
                val finalAllocatorRequirement = if (m.overload) m.allocatorRequirement else AllocatorRequirement.NO
                val allocatorParam: DowncallParameter? = if (m.overload) when (finalAllocatorRequirement) {
                    AllocatorRequirement.NO -> null

                    AllocatorRequirement.STACK, AllocatorRequirement.SEGMENT_ALLOCATOR ->
                        m.parameters.firstOrNull { p ->
                            p.type.javaType == Arena_ || p.type.javaType == SegmentAllocator_
                        } ?: (if (finalAllocatorRequirement == AllocatorRequirement.STACK) null
                        else error("A segment allocator or an Arena is required by ${m.name}"))

                    AllocatorRequirement.ARENA ->
                        m.parameters.firstOrNull { p ->
                            p.type.javaType == Arena_
                        } ?: error("An arena is required by ${m.name}")
                } else null
                val useMemStack = finalAllocatorRequirement == AllocatorRequirement.STACK && allocatorParam == null
                val allocatorName = if (useMemStack) "__overrungl_stack" else allocatorParam?.name
                val refParams = m.parameters.filter { p -> p.marshalRef(m.overload) }
                val writtenParams =
                    m.parameters.map { p ->
                        if (p.marshalRef(m.overload)) DowncallParameter(address, "__overrungl_ref_${p.name}", null)
                        else p
                    }

                // header
                sb.append("        try ")
                if (useMemStack) {
                    sb.append("(var __overrungl_stack = MemoryStack.pushLocal()) ")
                }
                sb.appendLine("{")

                // ref
                refParams.forEach { p ->
                    sb.append("            var __overrungl_ref_${p.name} = ")
                    p.type.processor.marshal(
                        ProcessorContext(
                            allocatorName = allocatorName, sb
                        ) { it.append(p.name) })
                    sb.appendLine(";")
                }

                // invocation
                sb.append("            ")
                if (!returnVoid) {
                    if (refParams.isNotEmpty()) {
                        sb.append("var __overrungl_result = ")
                    } else {
                        sb.append("return ")
                    }
                }
                val invocation = { b: StringBuilder ->
                    if (!returnVoid) {
                        b.append("(${m.returnType.carrier}) ")
                    }
                    b.append("MH_${m.entrypoint}.invokeExact(")
                    b.append(writtenParams.joinToString { p ->
                        if (m.overload) {
                            buildString {
                                p.type.processor.marshal(
                                    ProcessorContext(
                                        allocatorName = allocatorName,
                                        this
                                    ) { it.append(p.name) })
                            }
                        } else p.name
                    })
                    b.append(")")
                    Unit
                }
                if (m.overload) {
                    m.returnType.processor.unmarshal(ProcessorContext(allocatorName = null, sb, invocation))
                } else {
                    invocation(sb)
                }
                sb.appendLine(";")

                // ref
                if (refParams.isNotEmpty()) {
                    refParams.forEach { p ->
                        sb.append("            ")
                        p.type.processor.copy(
                            ProcessorContext(
                                allocatorName = null,
                                sb
                            ) { it.append("__overrungl_ref_${p.name}, ${p.name}") })
                        sb.appendLine(";")
                    }
                    if (!returnVoid) {
                        sb.appendLine("            return __overrungl_result;")
                    }
                }

                sb.appendLine("""        } catch (Throwable e) { throw new RuntimeException("error in ${m.entrypoint}", e); }""")
            }
            sb.appendLine("    }")
        }

        sb.appendLine("    //@formatter:on")

        Files.writeString(path, replaceCode(Files.readString(path), sb.toString()))
    }
}

sealed interface DowncallFieldSpec {
    fun append(builder: StringBuilder)
}

data class DowncallField(
    val type: CustomTypeSpec,
    val name: String,
    val value: String,
    val javadoc: String?
) : DowncallFieldSpec {
    override fun append(builder: StringBuilder) {
        if (javadoc != null) {
            builder.appendLine(javadoc.prependIndent("    ///"))
        }
        builder.appendLine("    public static final ${type.javaType} $name = $value;")
    }
}

data class DowncallFieldGroup(
    val type: CustomTypeSpec,
    val javadoc: String?,
    val members: List<FieldGroupMember>
) : DowncallFieldSpec {
    override fun append(builder: StringBuilder) {
        if (javadoc != null) {
            builder.appendLine(javadoc.prependIndent("    ///"))
        }
        if (members.any { it.javadoc != null }) {
            builder.appendLine("    ///#### Documentation of fields")
            members.filter { it.javadoc != null }.forEach {
                builder.appendLine("    ///##### ${it.name}")
                builder.appendLine(it.javadoc!!.prependIndent("    ///"))
            }
        }
        builder.appendLine("    public static final ${type.javaType}")
        members.forEachIndexed { index, it ->
            if (index != 0) {
                builder.appendLine(",")
            }
            builder.append("        ${it.name} = ${it.value}")
        }
        builder.appendLine(";")
    }
}

data class FieldGroupMember(
    val name: String,
    val value: String,
    val javadoc: String?
)
