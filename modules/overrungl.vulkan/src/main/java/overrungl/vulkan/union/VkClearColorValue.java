/*
 * MIT License
 *
 * Copyright (c) 2022-2025 Overrun Organization
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

// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.union;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.annotation.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Members
/// ### float32
/// [Byte offset][#OFFSET_float32] - [Memory layout][#ML_float32] - [Getter][#float32()] - [Setter][#float32(java.lang.foreign.MemorySegment)]
/// ### int32
/// [Byte offset][#OFFSET_int32] - [Memory layout][#ML_int32] - [Getter][#int32()] - [Setter][#int32(java.lang.foreign.MemorySegment)]
/// ### uint32
/// [Byte offset][#OFFSET_uint32] - [Memory layout][#ML_uint32] - [Getter][#uint32()] - [Setter][#uint32(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef union VkClearColorValue {
///     float[4] float32;
///     int32_t[4] int32;
///     uint32_t[4] uint32;
/// } VkClearColorValue;
/// ```
public final class VkClearColorValue extends Union {
    /// The union layout of `VkClearColorValue`.
    public static final UnionLayout LAYOUT = MemoryLayout.unionLayout(
        MemoryLayout.sequenceLayout(4, ValueLayout.JAVA_FLOAT).withName("float32"),
        MemoryLayout.sequenceLayout(4, ValueLayout.JAVA_INT).withName("int32"),
        MemoryLayout.sequenceLayout(4, ValueLayout.JAVA_INT).withName("uint32")
    );
    /// The byte offset of `float32`.
    public static final long OFFSET_float32 = LAYOUT.byteOffset(PathElement.groupElement("float32"));
    /// The memory layout of `float32`.
    public static final MemoryLayout ML_float32 = LAYOUT.select(PathElement.groupElement("float32"));
    /// The byte offset of `int32`.
    public static final long OFFSET_int32 = LAYOUT.byteOffset(PathElement.groupElement("int32"));
    /// The memory layout of `int32`.
    public static final MemoryLayout ML_int32 = LAYOUT.select(PathElement.groupElement("int32"));
    /// The byte offset of `uint32`.
    public static final long OFFSET_uint32 = LAYOUT.byteOffset(PathElement.groupElement("uint32"));
    /// The memory layout of `uint32`.
    public static final MemoryLayout ML_uint32 = LAYOUT.select(PathElement.groupElement("uint32"));

    /// Creates `VkClearColorValue` with the given segment.
    /// @param segment the memory segment
    public VkClearColorValue(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkClearColorValue` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkClearColorValue of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkClearColorValue(segment); }

    /// Creates `VkClearColorValue` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkClearColorValue ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkClearColorValue(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkClearColorValue` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkClearColorValue ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkClearColorValue(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkClearColorValue` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkClearColorValue`
    public static VkClearColorValue alloc(SegmentAllocator allocator) { return new VkClearColorValue(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkClearColorValue` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkClearColorValue`
    public static VkClearColorValue alloc(SegmentAllocator allocator, long count) { return new VkClearColorValue(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `VkClearColorValue`.
    /// @param index the index of the union buffer
    /// @return the slice of `VkClearColorValue`
    public VkClearColorValue asSlice(long index) { return new VkClearColorValue(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `VkClearColorValue`.
    /// @param index the index of the union buffer
    /// @param count the count
    /// @return the slice of `VkClearColorValue`
    public VkClearColorValue asSlice(long index, long count) { return new VkClearColorValue(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

    /// {@return `float32` at the given index}
    /// @param segment the segment of the union
    /// @param index   the index
    public static @CType("float[4]") java.lang.foreign.MemorySegment get_float32(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_float32, index), ML_float32); }
    /// {@return `float32`}
    /// @param segment the segment of the union
    public static @CType("float[4]") java.lang.foreign.MemorySegment get_float32(MemorySegment segment) { return VkClearColorValue.get_float32(segment, 0L); }
    /// {@return `float32` at the given index}
    /// @param index the index
    public @CType("float[4]") java.lang.foreign.MemorySegment float32At(long index) { return VkClearColorValue.get_float32(this.segment(), index); }
    /// {@return `float32`}
    public @CType("float[4]") java.lang.foreign.MemorySegment float32() { return VkClearColorValue.get_float32(this.segment()); }
    /// Sets `float32` with the given value at the given index.
    /// @param segment the segment of the union
    /// @param index   the index
    /// @param value   the value
    public static void set_float32(MemorySegment segment, long index, @CType("float[4]") java.lang.foreign.MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_float32, index), ML_float32.byteSize()); }
    /// Sets `float32` with the given value.
    /// @param segment the segment of the union
    /// @param value   the value
    public static void set_float32(MemorySegment segment, @CType("float[4]") java.lang.foreign.MemorySegment value) { VkClearColorValue.set_float32(segment, 0L, value); }
    /// Sets `float32` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkClearColorValue float32At(long index, @CType("float[4]") java.lang.foreign.MemorySegment value) { VkClearColorValue.set_float32(this.segment(), index, value); return this; }
    /// Sets `float32` with the given value.
    /// @param value the value
    /// @return `this`
    public VkClearColorValue float32(@CType("float[4]") java.lang.foreign.MemorySegment value) { VkClearColorValue.set_float32(this.segment(), value); return this; }

    /// {@return `int32` at the given index}
    /// @param segment the segment of the union
    /// @param index   the index
    public static @CType("int32_t[4]") java.lang.foreign.MemorySegment get_int32(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_int32, index), ML_int32); }
    /// {@return `int32`}
    /// @param segment the segment of the union
    public static @CType("int32_t[4]") java.lang.foreign.MemorySegment get_int32(MemorySegment segment) { return VkClearColorValue.get_int32(segment, 0L); }
    /// {@return `int32` at the given index}
    /// @param index the index
    public @CType("int32_t[4]") java.lang.foreign.MemorySegment int32At(long index) { return VkClearColorValue.get_int32(this.segment(), index); }
    /// {@return `int32`}
    public @CType("int32_t[4]") java.lang.foreign.MemorySegment int32() { return VkClearColorValue.get_int32(this.segment()); }
    /// Sets `int32` with the given value at the given index.
    /// @param segment the segment of the union
    /// @param index   the index
    /// @param value   the value
    public static void set_int32(MemorySegment segment, long index, @CType("int32_t[4]") java.lang.foreign.MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_int32, index), ML_int32.byteSize()); }
    /// Sets `int32` with the given value.
    /// @param segment the segment of the union
    /// @param value   the value
    public static void set_int32(MemorySegment segment, @CType("int32_t[4]") java.lang.foreign.MemorySegment value) { VkClearColorValue.set_int32(segment, 0L, value); }
    /// Sets `int32` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkClearColorValue int32At(long index, @CType("int32_t[4]") java.lang.foreign.MemorySegment value) { VkClearColorValue.set_int32(this.segment(), index, value); return this; }
    /// Sets `int32` with the given value.
    /// @param value the value
    /// @return `this`
    public VkClearColorValue int32(@CType("int32_t[4]") java.lang.foreign.MemorySegment value) { VkClearColorValue.set_int32(this.segment(), value); return this; }

    /// {@return `uint32` at the given index}
    /// @param segment the segment of the union
    /// @param index   the index
    public static @CType("uint32_t[4]") java.lang.foreign.MemorySegment get_uint32(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_uint32, index), ML_uint32); }
    /// {@return `uint32`}
    /// @param segment the segment of the union
    public static @CType("uint32_t[4]") java.lang.foreign.MemorySegment get_uint32(MemorySegment segment) { return VkClearColorValue.get_uint32(segment, 0L); }
    /// {@return `uint32` at the given index}
    /// @param index the index
    public @CType("uint32_t[4]") java.lang.foreign.MemorySegment uint32At(long index) { return VkClearColorValue.get_uint32(this.segment(), index); }
    /// {@return `uint32`}
    public @CType("uint32_t[4]") java.lang.foreign.MemorySegment uint32() { return VkClearColorValue.get_uint32(this.segment()); }
    /// Sets `uint32` with the given value at the given index.
    /// @param segment the segment of the union
    /// @param index   the index
    /// @param value   the value
    public static void set_uint32(MemorySegment segment, long index, @CType("uint32_t[4]") java.lang.foreign.MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_uint32, index), ML_uint32.byteSize()); }
    /// Sets `uint32` with the given value.
    /// @param segment the segment of the union
    /// @param value   the value
    public static void set_uint32(MemorySegment segment, @CType("uint32_t[4]") java.lang.foreign.MemorySegment value) { VkClearColorValue.set_uint32(segment, 0L, value); }
    /// Sets `uint32` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkClearColorValue uint32At(long index, @CType("uint32_t[4]") java.lang.foreign.MemorySegment value) { VkClearColorValue.set_uint32(this.segment(), index, value); return this; }
    /// Sets `uint32` with the given value.
    /// @param value the value
    /// @return `this`
    public VkClearColorValue uint32(@CType("uint32_t[4]") java.lang.foreign.MemorySegment value) { VkClearColorValue.set_uint32(this.segment(), value); return this; }

}
