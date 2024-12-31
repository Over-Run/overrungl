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

import com.palantir.javapoet.ArrayTypeName
import com.palantir.javapoet.ClassName
import java.nio.file.Files
import kotlin.io.path.Path

class Struct(
    private val packageName: String,
    private val name: String,
    private val cType: String? = null,
    private val javadoc: String? = null,
    private val opaque: Boolean = false,
    action: Struct.() -> Unit
) {
    private val members = mutableListOf<StructMember>()
    val pointerType: CustomTypeSpec by lazy {
        val className = ClassName.get(packageName, name)
        CustomTypeSpec(
            MemorySegment_,
            className,
            processor = StructProcessor(className),
            layout = "ValueLayout.ADDRESS.withTargetLayout($className.LAYOUT)",
            cType = cType
        )
    }
    val byValueType: CustomTypeSpec by lazy {
        val className = ClassName.get(packageName, name)
        CustomTypeSpec(
            MemorySegment_,
            className,
            processor = StructProcessor(className),
            layout = "$className.LAYOUT",
            cType = cType,
            allocatorRequirement = AllocatorRequirement.BY_VALUE_SEGMENT_ALLOCATOR
        )
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

    operator fun CustomTypeSpec.invoke(name: String, javadoc: String? = null) {
        members.add(ValueStructMember(this, name, javadoc))
    }

    operator fun ByValueWrapper.invoke(name: String, javadoc: String? = null) {
        members.add(ByValueStructStructMember(this.struct, name, javadoc))
    }

    fun fixedSize(type: CustomTypeSpec, name: String, size: Long, javadoc: String? = null) {
        members.add(FixedSizeStructMember(type, size, name, javadoc))
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
            sb.appendLine("/// ### ${it.name}")
            if (!opaque) {
                sb.appendLine(
                    when (it) {
                        is ValueStructMember -> "/// [VarHandle][#VH_${it.name}] - [Getter][#${it.name}()] - [Setter][#${it.name}(${it.type.carrier})]"
                        is ByValueStructStructMember -> "/// [Byte offset][#OFFSET_${it.name}] - [Memory layout][#ML_${it.name}] - [Getter][#${it.name}()] - [Setter][#${it.name}(${it.type.carrier})]"
                        is FixedSizeStructMember -> "/// [Byte offset handle][#MH_${it.name}] - [Memory layout][#ML_${it.name}] - Getter - Setter"
                    }
                )
            }
            if (it.javadoc != null) {
                sb.appendLine("///")
                sb.appendLine(it.javadoc!!.prependIndent("/// "))
                sb.append("///")
                sb.appendLine()
            }
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
        sb.appendLine(members.joinToString(",\n") {
            """        ${it.type.layout}.withName("${it.name}")"""
        })
        sb.appendLine("    );")

        if (!opaque) {
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
                            |    /// The memory layout of `${it.name}`.
                            |    public static final MemoryLayout ML_${it.name} = LAYOUT.select(PathElement.groupElement("${it.name}"));
                        """.trimMargin()
                    )

                    is FixedSizeStructMember -> sb.appendLine(
                        """
                            |    /// The byte offset handle of `${it.name}` of type `(long baseOffset, long elementIndex)long`.
                            |    public static final MethodHandle MH_${it.name} = LAYOUT.byteOffsetHandle(PathElement.sequenceElement(), PathElement.groupElement("${it.name}"));
                            |    /// The memory layout of `${it.name}`.
                            |    public static final MemoryLayout ML_${it.name} = LAYOUT.select(PathElement.groupElement("${it.name}"));
                        """.trimMargin()
                    )
                }
            }
        }

        // constructor
        sb.appendLine(
            """
                |
                |    /// Creates `$name` with the given segment.
                |    /// @param segment the memory segment
                |    public $name(MemorySegment segment) { super(segment, LAYOUT); }
                |
            """.trimMargin()
        )

        // allocators
        sb.appendLine(
            """
                |    /// Allocates a `$name` with the given segment allocator.
                |    /// @param allocator the segment allocator
                |    /// @return the allocated `$name`
                |    public static $name alloc(SegmentAllocator allocator) { return new $name(allocator.allocate(LAYOUT)); }
                |
                |    /// Allocates a `$name` with the given segment allocator and count.
                |    /// @param allocator the segment allocator
                |    /// @param count     the count
                |    /// @return the allocated `$name`
                |    public static $name alloc(SegmentAllocator allocator, long count) { return new $name(allocator.allocate(LAYOUT, count)); }
                |
            """.trimMargin()
        )

        if (!opaque) {
            members.forEach {
                // getters
                when (it) {
                    is ValueStructMember, is ByValueStructStructMember -> {
                        // static
                        sb.appendLine(
                            """
                                |    /// {@return `${it.name}` at the given index}
                                |    /// @param segment the segment of the struct
                                |    /// @param index   the index
                                |    public static ${it.type.carrierWithC()} get_${it.name}(MemorySegment segment, long index) { ${
                                when (it) {
                                    is ValueStructMember ->
                                        "return (${it.type.carrier}) VH_${it.name}.get(segment, 0L, index);"

                                    is ByValueStructStructMember ->
                                        """return segment.asSlice(LAYOUT.scale(OFFSET_${it.name}, index), ML_${it.name});"""

                                    else -> error("should not reach here")
                                }
                            } }
                            """.trimMargin()
                        )
                        sb.appendLine(
                            """
                                |    /// {@return `${it.name}`}
                                |    /// @param segment the segment of the struct
                                |    public static ${it.type.carrierWithC()} get_${it.name}(MemorySegment segment) { return $name.get_${it.name}(segment, 0L); }
                            """.trimMargin()
                        )
                        // instance
                        sb.appendLine(
                            """
                                |    /// {@return `${it.name}` at the given index}
                                |    /// @param index the index
                                |    public ${it.type.carrierWithC()} ${it.name}At(long index) { return $name.get_${it.name}(this.segment(), index); }
                            """.trimMargin()
                        )
                        sb.appendLine(
                            """
                                |    /// {@return `${it.name}`}
                                |    public ${it.type.carrierWithC()} ${it.name}() { return $name.get_${it.name}(this.segment()); }
                            """.trimMargin()
                        )
                    }

                    is FixedSizeStructMember -> {
                        // static
                        sb.appendLine(
                            """
                                |    /// {@return `${it.name}` at the given index}
                                |    /// @param segment      the segment of the struct
                                |    /// @param index        the index of the struct buffer
                                |    /// @param elementIndex the index of the element
                                |    public static ${it.type.carrierWithC()} get_${it.name}(MemorySegment segment, long index, long elementIndex) {
                                |        try { return segment.asSlice(LAYOUT.scale((long) MH_${it.name}.invokeExact(0L, elementIndex), index), ML_${it.name}); }
                                |        catch (Throwable e) { throw new RuntimeException(e); }
                                |    }
                            """.trimMargin()
                        )
                        sb.appendLine(
                            """
                                |    /// {@return `${it.name}`}
                                |    /// @param segment      the segment of the struct
                                |    /// @param elementIndex the index of the element
                                |    public static ${it.type.carrierWithC()} get_${it.name}(MemorySegment segment, long elementIndex) { return $name.get_${it.name}(segment, 0L, elementIndex); }
                            """.trimMargin()
                        )
                        // instance
                        sb.appendLine(
                            """
                                |    /// {@return `${it.name}` at the given index}
                                |    /// @param index        the index of the struct buffer
                                |    /// @param elementIndex the index of the element
                                |    public ${it.type.carrierWithC()} ${it.name}At(long index, long elementIndex) { return $name.get_${it.name}(this.segment(), index, elementIndex); }
                            """.trimMargin()
                        )
                        sb.appendLine(
                            """
                                |    /// {@return `${it.name}`}
                                |    /// @param elementIndex the index of the element
                                |    public ${it.type.carrierWithC()} ${it.name}(long elementIndex) { return $name.get_${it.name}(this.segment(), elementIndex); }
                            """.trimMargin()
                        )
                    }
                }

                // setters
                when (it) {
                    is ValueStructMember, is ByValueStructStructMember -> {
                        // static
                        sb.appendLine(
                            """
                                |    /// Sets `${it.name}` with the given value at the given index.
                                |    /// @param segment the segment of the struct
                                |    /// @param index   the index
                                |    /// @param value   the value
                                |    public static void set_${it.name}(MemorySegment segment, long index, ${it.type.carrierWithC()} value) { ${
                                when (it) {
                                    is ValueStructMember -> "VH_${it.name}.set(segment, 0L, index, value);"
                                    is ByValueStructStructMember -> """MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_${it.name}, index), ML_${it.name}.byteSize());"""
                                    else -> error("should not reach here")
                                }
                            } }
                            """.trimMargin()
                        )
                        sb.appendLine(
                            """
                                |    /// Sets `${it.name}` with the given value.
                                |    /// @param segment the segment of the struct
                                |    /// @param value   the value
                                |    public static void set_${it.name}(MemorySegment segment, ${it.type.carrierWithC()} value) { $name.set_${it.name}(segment, 0L, value); }
                            """.trimMargin()
                        )
                        // instance
                        sb.appendLine(
                            """
                                |    /// Sets `${it.name}` with the given value at the given index.
                                |    /// @param index the index
                                |    /// @param value the value
                                |    /// @return `this`
                                |    public $name ${it.name}At(long index, ${it.type.carrierWithC()} value) { $name.set_${it.name}(this.segment(), index, value); return this; }
                            """.trimMargin()
                        )
                        sb.appendLine(
                            """
                                |    /// Sets `${it.name}` with the given value.
                                |    /// @param value the value
                                |    /// @return `this`
                                |    public $name ${it.name}(${it.type.carrierWithC()} value) { $name.set_${it.name}(this.segment(), value); return this; }
                            """.trimMargin()
                        )
                    }

                    is FixedSizeStructMember -> {
                        // static
                        sb.appendLine(
                            """
                                |    /// Sets `${it.name}` with the given value at the given index.
                                |    /// @param segment      the segment of the struct
                                |    /// @param index        the index of the struct buffer
                                |    /// @param elementIndex the index of the element
                                |    /// @param value        the value
                                |    public static void set_${it.name}(MemorySegment segment, long index, long elementIndex, ${it.type.carrierWithC()} value) {
                                |        try { MemorySegment.copy(value, 0L, segment, LAYOUT.scale((long) MH_${it.name}.invokeExact(0L, elementIndex), index), ML_${it.name}.byteSize()); }
                                |        catch (Throwable e) { throw new RuntimeException(e); }
                                |    }
                            """.trimMargin()
                        )
                        sb.appendLine(
                            """
                                |    /// Sets `${it.name}` with the given value.
                                |    /// @param segment      the segment of the struct
                                |    /// @param elementIndex the index of the element
                                |    /// @param value        the value
                                |    public static void set_${it.name}(MemorySegment segment, long elementIndex, ${it.type.carrierWithC()} value) { $name.set_${it.name}(segment, 0L, elementIndex, value); }
                            """.trimMargin()
                        )
                        // instance
                        sb.appendLine(
                            """
                                |    /// Sets `${it.name}` with the given value at the given index.
                                |    /// @param index        the index of the struct buffer
                                |    /// @param elementIndex the index of the element
                                |    /// @param value        the value
                                |    /// @return `this`
                                |    public $name ${it.name}At(long index, long elementIndex, ${it.type.carrierWithC()} value) { $name.set_${it.name}(this.segment(), index, elementIndex, value); return this; }
                            """.trimMargin()
                        )
                        sb.appendLine(
                            """
                                |    /// Sets `${it.name}` with the given value.
                                |    /// @param elementIndex the index of the element
                                |    /// @param value        the value
                                |    /// @return `this`
                                |    public $name ${it.name}(long elementIndex, ${it.type.carrierWithC()} value) { $name.set_${it.name}(this.segment(), elementIndex, value); return this; }
                            """.trimMargin()
                        )
                    }
                }

                sb.appendLine()
            }
        }

        doLast.invoke(sb)
        sb.appendLine("}")

        Files.writeString(Path(packageName.replace('.', '/'), "$name.java"), sb.toString())
    }
}

sealed interface StructMember {
    val type: CustomTypeSpec
    val name: String
    val javadoc: String?
}

data class ValueStructMember(
    override val type: CustomTypeSpec,
    override val name: String,
    override val javadoc: String?
) : StructMember

data class ByValueStructStructMember(
    val struct: Struct,
    override val name: String,
    override val javadoc: String?
) : StructMember {
    override val type: CustomTypeSpec = struct.byValueType
}

data class FixedSizeStructMember(
    val componentType: CustomTypeSpec,
    val size: Long,
    override val name: String,
    override val javadoc: String?
) : StructMember {
    override val type: CustomTypeSpec
        get() = CustomTypeSpec(
            carrier = MemorySegment_,
            javaType = ArrayTypeName.of(componentType.javaType),
            processor = IdentityValueProcessor,
            layout = "MemoryLayout.sequenceLayout(${size}L, ${componentType.layout})",
            cType = "${componentType.cType}[$size]",
            allocatorRequirement = AllocatorRequirement.STACK
        )
}
