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

import com.palantir.javapoet.ClassName
import java.nio.file.Files
import kotlin.io.path.Path

class Struct(
    private val packageName: String,
    private val name: String,
    private val cType: String? = null,
    private val javadoc: String? = null,
    action: Struct.() -> Unit
) {
    private val members = mutableListOf<StructMember>()
    val type: CustomTypeSpec by lazy {
        val className = ClassName.get(packageName, name)
        CustomTypeSpec(MemorySegment_, className, layout = "$className.LAYOUT", cType = cType)
    }
    private var doLast: (StringBuilder) -> Unit = {}
    val byValue: ByValueWrapper by lazy { ByValueWrapper(this) }

    @JvmInline
    value class ByValueWrapper(val struct: Struct)

    init {
        action(this)
        write()
    }

    fun doLast(action: (StringBuilder) -> Unit) {
        doLast = action
    }

    operator fun CustomTypeSpec.invoke(name: String) {
        members.add(ValueStructMember(this, name))
    }

    operator fun ByValueWrapper.invoke(name: String) {
        members.add(ByValueStructStructMember(this.struct, name))
    }

    fun write() {
        val sb = StringBuilder()
        sb.appendLine(commentedFileHeader)
        sb.appendLine(
            """
                package $packageName;

                import java.lang.foreign.*;
                import java.lang.foreign.MemoryLayout.PathElement;
                import java.lang.invoke.*;
                import overrungl.annotation.*;
                import overrungl.struct.*;
                import overrungl.util.*;

            """.trimIndent()
        )

        // javadoc
        if (javadoc != null) {
            sb.appendLine(javadoc.prependIndent("/// "))
            sb.appendLine("///")
        }
        sb.appendLine("/// ## Members")
        members.forEach {
            sb.appendLine(
                """
                    /// ### ${it.name}
                    /// ${
                    when (it) {
                        is ValueStructMember -> "[VarHandle][#VH_${it.name}]"
                        is ByValueStructStructMember -> "[Byte offset][#OFFSET_${it.name}]"
                    }
                } - [Getter][#${it.name}()] - [Setter][#${it.name}(${it.type.carrier})]
                """.trimIndent()
            )
        }
        sb.appendLine(
            """
                /// ## Layout
                /// [Java definition][#LAYOUT]
                /// ```c
                /// typedef struct ${if (cType != null) "$cType " else ""}{
            """.trimIndent()
        )
        members.forEach {
            sb.append("///     ${it.type.cType ?: it.type.carrier} ${it.name};\n")
        }
        sb.appendLine(
            """
                /// } $name;
                /// ```
            """.trimIndent()
        )

        sb.appendLine(
            """
                public final class $name extends Struct {
                    /// The struct layout of `$cType`.
                    public static final StructLayout LAYOUT = LayoutBuilder.struct(
            """.trimIndent()
        )
        sb.appendLine(members.joinToString(", \n") {
            """        ${it.type.layout}.withName("${it.name}")"""
        })
        sb.appendLine("    );")

        // VarHandles
        members.forEach {
            when (it) {
                is ValueStructMember -> sb.appendLine(
                    """
                        |    /// The [VarHandle] of `${it.name}` of type `(MemorySegment base, long baseOffset, long index)${it.type.carrier}`.
                        |    public static final VarHandle VH_${it.name} = LAYOUT.arrayElementVarHandle(PathElement.groupElement("${it.name}"));
                    """.trimMargin()
                )

                is ByValueStructStructMember -> sb.appendLine(
                    """
                        |    /// The byte offset of `${it.name}`.
                        |    public static final long OFFSET_${it.name} = LAYOUT.byteOffset(PathElement.groupElement("${it.name}"));
                    """.trimMargin()
                )
            }
        }

        // constructors
        sb.appendLine(
            """
                |
                |    /// Creates `$name` with the given segment.
                |    /// @param segment the memory segment
                |    public $name(MemorySegment segment) { super(segment, LAYOUT); }
                |
                |    /// Allocates a `$name` with the given segment allocator.
                |    /// @param allocator the segment allocator
                |    public $name(SegmentAllocator allocator) { this(allocator.allocate(LAYOUT)); }
                |
                |    /// Allocates a `$name` with the given segment allocator and count.
                |    /// @param allocator the segment allocator
                |    /// @param count     the count
                |    public $name(SegmentAllocator allocator, long count) { this(allocator.allocate(LAYOUT, count)); }
                |
            """.trimMargin()
        )

        members.forEach {
            // getters
            sb.appendLine(
                """
                    |    /// {@return `${it.name}` at the given index}
                    |    /// @param index the index
                    |    public ${it.type.carrierWithC()} ${it.name}At(long index) { ${
                    when (it) {
                        is ValueStructMember ->
                            "return (${it.type.carrier}) VH_${it.name}.get(this.segment(), 0L, index);"

                        is ByValueStructStructMember ->
                            """return this.segment().asSlice(LAYOUT.scale(OFFSET_${it.name}, index), ${it.struct.type.javaType}.LAYOUT);"""
                    }
                } }
                """.trimMargin()
            )

            sb.appendLine(
                """
                    |    /// {@return `${it.name}`}
                    |    public ${it.type.carrierWithC()} ${it.name}() { return this.${it.name}At(0L); }
                """.trimMargin()
            )

            // setters
            sb.appendLine(
                """
                    |    /// Sets `${it.name}` with the given value at the given index.
                    |    /// @param index the index
                    |    /// @param value the value
                    |    /// @return `this`
                    |    public $name ${it.name}At(long index, ${it.type.carrierWithC()} value) { ${
                    when (it) {
                        is ValueStructMember -> "VH_${it.name}.set(this.segment(), 0L, index, value);"
                        is ByValueStructStructMember -> """MemorySegment.copy(value, 0L, this.segment(), LAYOUT.scale(OFFSET_${it.name}, index), value.byteSize());"""
                    }
                } return this; }
                """.trimMargin()
            )
            sb.appendLine(
                """
                    |    /// Sets `${it.name}` with the given value.
                    |    /// @param value the value
                    |    /// @return `this`
                    |    public $name ${it.name}(${it.type.carrierWithC()} value) { return this.${it.name}At(0L, value); }
                """.trimMargin()
            )

            sb.appendLine()
        }

        doLast.invoke(sb)
        sb.appendLine("}")

        Files.writeString(Path(packageName.replace('.', '/'), "$name.java"), sb.toString())
    }
}

sealed interface StructMember {
    val type: CustomTypeSpec
    val name: String
}

data class ValueStructMember(override val type: CustomTypeSpec, override val name: String) : StructMember
data class ByValueStructStructMember(val struct: Struct, override val name: String) : StructMember {
    override val type: CustomTypeSpec = struct.type
}
