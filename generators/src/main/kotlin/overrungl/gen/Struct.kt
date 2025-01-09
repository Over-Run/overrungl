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

import com.palantir.javapoet.ArrayTypeName
import com.palantir.javapoet.ClassName
import java.nio.file.Files
import kotlin.io.path.Path

class Struct(
    private val packageName: String,
    private val name: String,
    private val cType: String? = null,
    private val opaque: Boolean = false,
    private val union: Boolean = false,
    action: Struct.() -> Unit
) {
    private val kindString = if (union) "union" else "struct"
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
    val imports = mutableListOf<String>()

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

    fun fixedSize(type: CustomTypeSpec, name: String, size: String) {
        members.add(FixedSizeStructMember(type, size, name))
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
        imports.forEach {
            sb.appendLine("import $it;")
        }
        sb.appendLine()

        // javadoc
        sb.appendLine("/// ## Members")
        members.forEach {
            sb.appendLine("/// ### ${it.name}")
            if (!opaque) {
                sb.appendLine(
                    when (it) {
                        is ValueStructMember -> "/// [VarHandle][#VH_${it.name}] - [Getter][#${it.name}()] - [Setter][#${it.name}(${it.type.carrier})]"
                        is ByValueStructStructMember, is FixedSizeStructMember ->
                            "/// [Byte offset][#OFFSET_${it.name}] - [Memory layout][#ML_${it.name}] - [Getter][#${it.name}()] - [Setter][#${it.name}(${it.type.carrier})]"
                    }
                )
            }
        }
        sb.appendLine(
            """
                /// ## Layout
                /// [Java definition][#LAYOUT]
                /// ```c
                /// typedef $kindString ${if (cType != null) "$cType " else ""}{
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
                public final class $name extends ${if (union) "Union" else "Struct"} {
                    /// The $kindString layout of `$cType`.
                    public static final ${if (union) "Union" else "Struct"}Layout LAYOUT = ${if (union) "MemoryLayout.unionLayout" else "LayoutBuilder.struct"}(
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

                    is ByValueStructStructMember, is FixedSizeStructMember -> sb.appendLine(
                        """
                            |    /// The byte offset of `${it.name}`.
                            |    public static final long OFFSET_${it.name} = LAYOUT.byteOffset(PathElement.groupElement("${it.name}"));
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
                |    /// Creates `$name` with the given segment.
                |    /// @param segment the memory segment
                |    /// @return the created instance or `null` if the segment is `NULL`
                |    public static $name of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new $name(segment); }
                |
                |    /// Creates `$name` with the given segment.
                |    ///
                |    /// Reinterprets the segment if zero-length.
                |    /// @param segment the memory segment
                |    /// @return the created instance or `null` if the segment is `NULL`
                |    public static $name ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new $name(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }
                |
                |    /// Creates `$name` with the given segment.
                |    ///
                |    /// Reinterprets the segment if zero-length.
                |    /// @param segment the memory segment
                |    /// @param count   the count of the buffer
                |    /// @return the created instance or `null` if the segment is `NULL`
                |    public static $name ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new $name(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }
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

        // slice
        sb.appendLine(
            """
                |    /// Creates a slice of `$name`.
                |    /// @param index the index of the $kindString buffer
                |    /// @return the slice of `$name`
                |    public $name asSlice(long index) { return new $name(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }
                |
                |    /// Creates a slice of `$name`.
                |    /// @param index the index of the $kindString buffer
                |    /// @param count the count
                |    /// @return the slice of `$name`
                |    public $name asSlice(long index, long count) { return new $name(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }
                |
            """.trimMargin()
        )

        if (!opaque) {
            members.forEach {
                // getters
                when (it) {
                    is ValueStructMember, is ByValueStructStructMember, is FixedSizeStructMember -> {
                        // static
                        sb.appendLine(
                            """
                                |    /// {@return `${it.name}` at the given index}
                                |    /// @param segment the segment of the $kindString
                                |    /// @param index   the index
                                |    public static ${it.type.carrierWithC()} get_${it.name}(MemorySegment segment, long index) { ${
                                when (it) {
                                    is ValueStructMember ->
                                        "return (${it.type.carrier}) VH_${it.name}.get(segment, 0L, index);"

                                    is ByValueStructStructMember, is FixedSizeStructMember ->
                                        """return segment.asSlice(LAYOUT.scale(OFFSET_${it.name}, index), ML_${it.name});"""
                                }
                            } }
                            """.trimMargin()
                        )
                        sb.appendLine(
                            """
                                |    /// {@return `${it.name}`}
                                |    /// @param segment the segment of the $kindString
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
                }

                // setters
                when (it) {
                    is ValueStructMember, is ByValueStructStructMember, is FixedSizeStructMember -> {
                        // static
                        sb.appendLine(
                            """
                                |    /// Sets `${it.name}` with the given value at the given index.
                                |    /// @param segment the segment of the $kindString
                                |    /// @param index   the index
                                |    /// @param value   the value
                                |    public static void set_${it.name}(MemorySegment segment, long index, ${it.type.carrierWithC()} value) { ${
                                when (it) {
                                    is ValueStructMember -> "VH_${it.name}.set(segment, 0L, index, value);"
                                    is ByValueStructStructMember, is FixedSizeStructMember -> """MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_${it.name}, index), ML_${it.name}.byteSize());"""
                                }
                            } }
                            """.trimMargin()
                        )
                        sb.appendLine(
                            """
                                |    /// Sets `${it.name}` with the given value.
                                |    /// @param segment the segment of the $kindString
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
                }

                sb.appendLine()
            }
        }

        doLast.invoke(sb)
        sb.appendLine("}")

        val base = Path(packageName.replace('.', '/'))
        Files.createDirectories(base)
        writeString(base.resolve("$name.java"), sb.toString())
    }
}

sealed interface StructMember {
    val type: CustomTypeSpec
    val name: String
}

data class ValueStructMember(
    override val type: CustomTypeSpec,
    override val name: String
) : StructMember

data class ByValueStructStructMember(
    val struct: Struct,
    override val name: String
) : StructMember {
    override val type: CustomTypeSpec = struct.byValueType
}

data class FixedSizeStructMember(
    val componentType: CustomTypeSpec,
    val size: String,
    override val name: String
) : StructMember {
    override val type: CustomTypeSpec
        get() = CustomTypeSpec(
            carrier = MemorySegment_,
            javaType = ArrayTypeName.of(componentType.javaType),
            processor = IdentityValueProcessor,
            layout = "MemoryLayout.sequenceLayout(${size}, ${componentType.layout})",
            cType = "${componentType.cType}[$size]",
            allocatorRequirement = AllocatorRequirement.STACK
        )
}
