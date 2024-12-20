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

package overrungl.gen.refactor

import com.palantir.javapoet.CodeBlock
import com.palantir.javapoet.TypeName
import java.nio.file.Files
import kotlin.io.path.Path

class StaticDowncall(
    packageName: String,
    name: String,
    private val symbolLookup: String,
    action: StaticDowncall.() -> Unit
) {
    private val fields = mutableListOf<DowncallField>()
    private val methods = mutableListOf<DowncallMethod>()

    init {
        action()
        write(packageName, name)
    }

    operator fun CustomTypeSpecNew.invoke(nameAndValue: Pair<String, String>, javadoc: String? = null) {
        fields.add(DowncallField(this, nameAndValue.first, nameAndValue.second, javadoc))
    }

    operator fun CustomTypeSpecNew.invoke(name: String, javadoc: String? = null): DowncallParameter {
        return DowncallParameter(this, name, javadoc)
    }

    operator fun String.invoke(
        returnType: CustomTypeSpecNew,
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

    fun write(packageName: String, name: String) {
        val path = Path("${packageName.replace('.', '/')}/$name.java")
        val sb = StringBuilder()

        // fields
        fields.forEach {
            if (it.javadoc != null) {
                sb.appendLine(it.javadoc.prependIndent("    /// "))
            }
            sb.appendLine("    public static final ${it.type.javaType} ${it.name} = ${it.value};")
        }

        // method handles
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

        sb.appendLine()

        // methods
        methods.forEach {
            if (it.javadoc != null) {
                sb.appendLine(it.javadoc.prependIndent("    /// "))
            }
            sb.appendLine("    public static ${if (it.overload) it.returnType.javaTypeWithC() else it.returnType.carrierWithC()} ${it.name}(${it.parameters.joinToString { p -> "${if (it.overload) p.type.javaTypeWithC() else p.type.carrierWithC()} ${p.name}" }}) {")
            if (it.code != null) {
                sb.appendLine(it.code.prependIndent("        "))
            } else {
                val hasRefParam = it.parameters.any { p -> p.ref }
                val allocatorName: String? =
                    if (hasRefParam) {
                        it.parameters.firstOrNull { p -> p.type.javaType == Arena_ || p.type.javaType == SegmentAllocator_ }?.name
                            ?: error("${it.name} contains ref parameters, which requires an Arena or a SegmentAllocator")
                    } else null
                val refParams = it.parameters.filter { p -> p.ref }
                val writtenParams =
                    it.parameters.map { p -> if (p.ref) DowncallParameter(address, "__${p.name}", null) }
                sb.appendLine("        try${if (hasRefParam) " (var _stack = MemoryStack.pushLocal())" else ""} {")
                refParams.forEach { p ->
                    sb.appendLine(
                        "            var __${p.name} = ${
                            CodeBlock.builder().also { b ->
                                p.type.processor.marshal(
                                    ProcessorContext(allocatorName), b
                                ) { b1 -> b1.add("$1L", p.name) }
                            }.build()
                        };"
                    )
                }
                sb.appendLine("            ${if (it.returnType.carrier != TypeName.VOID) "return (${it.returnType.carrier}) " else ""}MH_${it.entrypoint}.invokeExact(${it.parameters.joinToString { p -> p.name }});")
                sb.appendLine("""        } catch (Throwable e) { throw new RuntimeException("error in ${it.entrypoint}", e); }""")
            }
            sb.appendLine("    }")
        }

        Files.writeString(path, replaceCode(Files.readString(path), sb.toString()))
    }
}

data class DowncallField(val type: CustomTypeSpecNew, val name: String, val value: String, val javadoc: String?)
