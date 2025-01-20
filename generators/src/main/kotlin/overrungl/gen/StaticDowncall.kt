/*
 * MIT License
 *
 * Copyright (c) 2024-2025 Overrun Organization
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

import java.nio.file.Files
import kotlin.io.path.Path

class StaticDowncall(
    packageName: String,
    name: String,
    private val symbolLookup: String,
    private val writeWholeFile: Boolean = false,
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

        operator fun String.invoke(value: String) {
            fields.add(FieldGroupMember(this, value))
        }
    }

    operator fun CustomTypeSpec.invoke(nameAndValue: Pair<String, String>) {
        fields.add(DowncallField(this, nameAndValue.first, nameAndValue.second))
    }

    operator fun CustomTypeSpec.invoke(builder: FieldGroupBuilder.() -> Unit) {
        fields.add(DowncallFieldGroup(this, FieldGroupBuilder().also(builder).fields))
    }

    operator fun CustomTypeSpec.invoke(name: String): DowncallParameter {
        return DowncallParameter(this, name)
    }

    operator fun String.invoke(
        returnType: CustomTypeSpec,
        vararg params: DowncallParameter,
        entrypoint: String?,
        code: String? = null,
        overload: Boolean = false,
        optional: Boolean = false,
        addNow: Boolean = true
    ): DowncallMethod {
        val method = DowncallMethod(
            returnType = returnType,
            name = this,
            parameters = params.toList(),
            entrypoint = entrypoint,
            code = code,
            overload = overload,
            optional = optional,
        )
        if (addNow) methods.add(method)
        return method
    }

    operator fun DowncallMethod.unaryPlus(): DowncallMethod {
        methods.add(this)
        return this
    }

    fun write(packageName: String, name: String) {
        val path = Path("${packageName.replace('.', '/')}/$name.java")
        val wholeFile = StringBuilder()
        if (writeWholeFile) {
            wholeFile.appendLine(commentedFileHeader)
            wholeFile.appendLine("package $packageName;")
            if (methods.isNotEmpty()) {
                wholeFile.appendLine(
                    """
                        import java.lang.foreign.*;
                        import java.lang.invoke.*;
                        import overrungl.annotation.*;
                        import overrungl.internal.*;
                        import overrungl.util.*;
                    """.trimIndent()
                )
            }
            wholeFile.appendLine(
                """
                    public final class $name {
                        $GENERATOR_BEGIN
                        $GENERATOR_END

                        private $name() {
                        }
                    }
                """.trimIndent()
            )
        }

        val sb = StringBuilder()

        sb.appendLine(formatter_off)

        // fields
        sb.appendLine("    //region Fields")
        fields.forEach {
            it.append(sb)
        }
        sb.appendLine("    //endregion")

        if (methods.isNotEmpty()) {
            val list = mutableListOf<DowncallMethod>().also { l ->
                methods.forEach {
                    if (it.entrypoint != null) {
                        val functionDescriptor = it.functionDescriptor
                        val indexOf = l.indexOfFirst { e -> e.entrypoint == it.entrypoint }
                        val m1 = if (indexOf != -1) l[indexOf] else null
                        if (m1 != null) {
                            if (functionDescriptor != m1.functionDescriptor) {
                                error("Redefining method ${it.name} (entrypoint ${it.entrypoint}, descriptor $functionDescriptor) with method ${m1.name} (entrypoint ${m1.entrypoint}, descriptor ${m1.functionDescriptor})")
                            }
                        } else {
                            l.add(it)
                        }
                    }
                }
            }

            // method handles
            sb.appendLine("    /// Method handles.")
            sb.appendLine("    public static final class Handles {")
            list.forEach {
                sb.appendLine(
                    """
                        |        /// The method handle of `${it.entrypoint}`.
                        |        public static final MethodHandle MH_${it.entrypoint} = RuntimeHelper.downcall(${it.functionDescriptor});
                    """.trimMargin()
                )
                nativeImageDowncallDescriptors.add(it.functionDescriptor)
            }
            list.forEach {
                sb.appendLine(
                    """
                        |        /// The function address of `${it.entrypoint}`.
                        |        public final MemorySegment PFN_${it.entrypoint};
                    """.trimMargin()
                )
            }
            sb.appendLine("        private Handles() {")
            list.forEach {
                if (it.optional) {
                    sb.appendLine("""            PFN_${it.entrypoint} = $symbolLookup.find("${it.entrypoint}").orElse(MemorySegment.NULL);""")
                } else {
                    sb.appendLine("""            PFN_${it.entrypoint} = $symbolLookup.findOrThrow("${it.entrypoint}");""")
                }
            }
            sb.appendLine("        }")
            sb.appendLine(
                """
                    |        private static volatile Handles instance;
                    |        private static Handles get() {
                    |            if (instance == null) {
                    |                synchronized (Handles.class) {
                    |                    if (instance == null) { instance = new Handles(); }
                    |                }
                    |            }
                    |            return instance;
                    |        }
                """.trimMargin()
            )
            sb.appendLine("    }")

            sb.appendLine()

            // methods
            methods.forEach { m ->
                val chosenReturnType = m.returnType.selectTypeName(m.overload)
                val returnVoid = chosenReturnType == "void"
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

                        AllocatorRequirement.STACK ->
                            m.parameters.firstOrNull { p ->
                                p.type.javaType == Arena_ || p.type.javaType == SegmentAllocator_
                            }

                        AllocatorRequirement.BY_VALUE_SEGMENT_ALLOCATOR, AllocatorRequirement.SEGMENT_ALLOCATOR ->
                            m.parameters.firstOrNull { p ->
                                p.type.javaType == Arena_ || p.type.javaType == SegmentAllocator_
                            } ?: error("A segment allocator or an Arena is required by ${m.name}")

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
                            if (p.marshalRef(m.overload)) DowncallParameter(address, "__overrungl_ref_${p.name}")
                            else p
                        }

                    // optional
                    if (m.optional) {
                        sb.appendLine("""        if (Handles.MH_${m.entrypoint} == null) throw new SymbolNotFoundError("Symbol not found: ${m.entrypoint}");""")
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
                        b.append("Handles.MH_${m.entrypoint}.invokeExact(Handles.get().PFN_${m.entrypoint}")
                        writtenParams.forEach { p ->
                            b.append(", ")
                            if (m.overload) {
                                p.type.processor.marshal(
                                    ProcessorContext(
                                        allocatorName = allocatorName,
                                        b
                                    ) { it.append(p.name) })
                            } else {
                                b.append(p.name)
                            }
                        }
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
                sb.appendLine()
            }
        }

        sb.appendLine(formatter_on)

        val replaceSrc = if (writeWholeFile) wholeFile.toString() else Files.readString(path)
        writeString(path, replaceCode(replaceSrc, sb.toString()))
    }
}

sealed interface DowncallFieldSpec {
    fun append(builder: StringBuilder)
}

data class DowncallField(
    val type: CustomTypeSpec,
    val name: String,
    val value: String
) : DowncallFieldSpec {
    override fun append(builder: StringBuilder) {
        builder.appendLine("    public static final ${type.javaType} $name = $value;")
    }
}

data class DowncallFieldGroup(
    val type: CustomTypeSpec,
    val members: List<FieldGroupMember>
) : DowncallFieldSpec {
    override fun append(builder: StringBuilder) {
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
)
