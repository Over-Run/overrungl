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

class Upcall(
    val packageName: String,
    val name: String,
    action: Upcall.() -> Unit
) {
    var targetMethod: UpcallMethod? = null
    var interfaceMethod: UpcallMethod? = null
    var wrapperCode: String? = null

    init {
        action(this)
        write()
        nativeImageUpcallDescriptors.add("$packageName.$name.DESCRIPTOR")
    }

    operator fun CustomTypeSpec.invoke(name: String): UpcallMethodParameter =
        UpcallMethodParameter(this, name)

    operator fun String.invoke(
        returnType: CustomTypeSpec,
        vararg parameters: UpcallMethodParameter,
        code: String? = null,
        overload: String? = null
    ): UpcallMethod {
        return UpcallMethod(
            name = this,
            returnType = returnType,
            parameters = parameters.toList(),
            code = code,
            overload = overload
        )
    }

    fun write() {
        val targetMethodNotNull = targetMethod!!
        val allocatorRequirement = if (interfaceMethod == null) AllocatorRequirement.NO
        else targetMethodNotNull.parameters
            .map { it.type.allocatorRequirement }
            .reduceOrNull(AllocatorRequirement::stricter)
            ?: AllocatorRequirement.NO

        val sb = StringBuilder()

        sb.appendLine(commentedFileHeader)
        sb.appendLine(
            """
                package $packageName;

                import java.lang.foreign.*;
                import java.lang.invoke.*;
                import overrungl.annotation.*;
                import overrungl.upcall.*;
                import overrungl.util.*;
            """.trimIndent()
        )
        sb.appendLine()

        sb.appendLine("@FunctionalInterface")
        sb.appendLine("public interface $name extends Upcall {")

        // function descriptor
        sb.append(
            """
                |    /// The function descriptor.
                |    FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of
            """.trimMargin()
        )
        val returnVoid = targetMethodNotNull.returnType.carrier == "void"
        if (returnVoid) {
            sb.append("Void(")
        } else {
            sb.append("(")
            sb.append(targetMethodNotNull.returnType.layout)
        }
        if (targetMethodNotNull.parameters.isNotEmpty()) {
            if (!returnVoid) {
                sb.append(", ")
            }
            sb.append(targetMethodNotNull.parameters.joinToString(separator = ", ") { it.type.layout.toString() })
        }
        sb.appendLine(");")
        sb.appendLine(
            """
                |    /// The method handle of the target method.
                |    MethodHandle HANDLE = Upcall.findTarget($name.class, "${targetMethodNotNull.name}", DESCRIPTOR);
            """.trimMargin()
        )
        sb.appendLine()

        // interface method
        interfaceMethod?.also { m ->
            sb.appendLine("    /// The interface target method of the upcall.")
            sb.append(
                "    ",
                m.returnType.javaTypeWithC(),
                " ",
                m.name,
                "(",
                m.parameters.joinToString(separator = ", ") { "${it.type.javaTypeWithC()} ${it.name}" },
                ");"
            )
            sb.appendLine()
            sb.appendLine()
        }

        // target method
        sb.appendLine("    /// The target method of the upcall.")
        sb.append("    ")
        if (targetMethodNotNull.code != null || targetMethodNotNull.overload != null) {
            sb.append("default ")
        }
        sb.append(
            targetMethodNotNull.returnType.carrierWithC(),
            " ",
            targetMethodNotNull.name,
            "(",
            targetMethodNotNull.parameters.joinToString(separator = ", ") { "${it.type.carrierWithC()} ${it.name}" },
            ")"
        )
        if (targetMethodNotNull.code != null) {
            sb.appendLine(" {")
            sb.appendLine(targetMethodNotNull.code.prependIndent("        "))
            sb.appendLine("    }")
        } else if (targetMethodNotNull.overload != null) {
            sb.appendLine(" {")
            sb.append("        ")
            if (!returnVoid) {
                sb.append("return ")
            }
            targetMethodNotNull.returnType.processor.marshal(ProcessorContext(allocatorName = null, sb) {
                it.append(targetMethodNotNull.overload)
                it.append("(")
                targetMethodNotNull.parameters.forEachIndexed { index, p ->
                    if (index != 0) {
                        it.append(", ")
                    }
                    p.type.processor.unmarshal(ProcessorContext(allocatorName = null, it) { b1 ->
                        b1.append(p.name)
                    })
                }
                it.append(")")
            })
            sb.appendLine(";")
            sb.appendLine("    }")
        } else {
            sb.appendLine(";")
        }
        sb.appendLine()

        // stub
        sb.appendLine(
            """
                |    @Override
                |    default MemorySegment stub(Arena arena) { return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, arena); }
                |
            """.trimMargin()
        )

        // invoker
        sb.appendLine("    /// A static invoker of the target method.")
        sb.appendLine("    /// @param stub the upcall stub")
        sb.append("""    static ${targetMethodNotNull.returnType.carrierWithC()} invoke(MemorySegment stub""")
        targetMethodNotNull.parameters.forEach { sb.append(", ", it.type.carrierWithC(), " ", it.name) }
        sb.appendLine(") {")
        sb.append("        try { ")
        if (!returnVoid) {
            sb.append("return (${targetMethodNotNull.returnType.carrier}) ")
        }
        sb.append("HANDLE.invokeExact(stub")
        targetMethodNotNull.parameters.forEach { sb.append(", ", it.name) }
        sb.appendLine("); }")
        sb.appendLine("""        catch (Throwable e) { throw new RuntimeException("error in $name::invoke (static invoker)", e); }""")
        sb.appendLine("    }")
        sb.appendLine()

        // wrapper
        val allocatorName = when (allocatorRequirement) {
            AllocatorRequirement.NO -> null
            AllocatorRequirement.STACK -> "__overrungl_stack"
            AllocatorRequirement.BY_VALUE_SEGMENT_ALLOCATOR -> TODO()
            AllocatorRequirement.SEGMENT_ALLOCATOR -> "allocator"
            AllocatorRequirement.ARENA -> "arena"
        }
        sb.appendLine(
            """
                |    /// A wrapper for the target method.
                |    /// @param stub the upcall stub
            """.trimMargin()
        )
        when (allocatorRequirement) {
            AllocatorRequirement.SEGMENT_ALLOCATOR -> {
                sb.appendLine("    /// @param allocator the allocator")
            }

            AllocatorRequirement.ARENA -> {
                sb.appendLine("    /// @param arena the arena")
            }

            else -> {}
        }
        sb.append(
            """
                |    /// @return an instance that wraps the static invoker
                |    static $name wrap(
            """.trimMargin()
        )
        sb.append("MemorySegment stub")
        when (allocatorRequirement) {
            AllocatorRequirement.SEGMENT_ALLOCATOR -> {
                sb.append(", SegmentAllocator allocator")
            }

            AllocatorRequirement.ARENA -> {
                sb.append(", Arena arena")
            }

            else -> {}
        }
        sb.appendLine(") {")
        if (wrapperCode != null) {
            sb.appendLine(wrapperCode!!.prependIndent("        "))
        } else {
            sb.append(
                "        return (${
                    (if (interfaceMethod != null) interfaceMethod!!
                    else targetMethodNotNull).parameters.joinToString(
                        separator = ", "
                    ) { it.name }
                }) ->"
            )
            if (allocatorRequirement == AllocatorRequirement.STACK) {
                sb.appendLine(" { try (var __overrungl_stack = MemoryStack.pushLocal()) {")
            } else {
                sb.appendLine()
            }
            sb.append("            ")
            if (allocatorRequirement == AllocatorRequirement.STACK && !returnVoid) {
                sb.append("return ")
            }
            if (interfaceMethod != null) {
                targetMethodNotNull.returnType.processor.unmarshal(ProcessorContext(allocatorName = allocatorName, sb) {
                    it.append("invoke(stub")
                    targetMethodNotNull.parameters.forEach { p ->
                        it.append(", ")
                        p.type.processor.marshal(ProcessorContext(allocatorName = allocatorName, it) { b ->
                            b.append(p.name)
                        })
                    }
                    it.append(")")
                })
            } else {
                sb.append("invoke(stub")
                targetMethodNotNull.parameters.forEach { p ->
                    sb.append(", ")
                    sb.append(p.name)
                }
                sb.append(")")
            }
            sb.appendLine(";")
            if (allocatorRequirement == AllocatorRequirement.STACK) {
                sb.appendLine("        } };")
            }
        }
        sb.appendLine("    }")

        sb.appendLine("}")

        val base = Path(packageName.replace('.', '/'))
        Files.createDirectories(base)
        val path = base.resolve("$name.java")
        writeString(path, sb.toString())
    }
}

data class UpcallMethodParameter(
    val type: CustomTypeSpec,
    val name: String
)

data class UpcallMethod(
    val name: String,
    val returnType: CustomTypeSpec,
    val parameters: List<UpcallMethodParameter>,
    val code: String?,
    val overload: String?
)
