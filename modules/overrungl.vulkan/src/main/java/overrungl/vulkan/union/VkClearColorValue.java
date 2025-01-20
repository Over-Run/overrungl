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
/// [Byte offset][#OFFSET_float32] - [Memory layout][#ML_float32] - [Getter][#float32()] - [Setter][#float32(MemorySegment)]
/// ### int32
/// [Byte offset][#OFFSET_int32] - [Memory layout][#ML_int32] - [Getter][#int32()] - [Setter][#int32(MemorySegment)]
/// ### uint32
/// [Byte offset][#OFFSET_uint32] - [Memory layout][#ML_uint32] - [Getter][#uint32()] - [Setter][#uint32(MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef union VkClearColorValue {
///     float[4] float32;
///     int32_t[4] int32;
///     uint32_t[4] uint32;
/// } VkClearColorValue;
/// ```
public sealed class VkClearColorValue extends Union {
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
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

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
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkClearColorValue` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkClearColorValue`
    public static VkClearColorValue alloc(SegmentAllocator allocator) { return new VkClearColorValue(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkClearColorValue` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkClearColorValue`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkClearColorValue copyFrom(VkClearColorValue src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `float32` at the given index}
    /// @param segment the segment of the union
    /// @param index   the index
    public static @CType("float[4]") MemorySegment get_float32(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_float32, index), ML_float32); }
    /// {@return `float32`}
    /// @param segment the segment of the union
    public static @CType("float[4]") MemorySegment get_float32(MemorySegment segment) { return VkClearColorValue.get_float32(segment, 0L); }
    /// {@return `float32`}
    public @CType("float[4]") MemorySegment float32() { return VkClearColorValue.get_float32(this.segment()); }
    /// Sets `float32` with the given value at the given index.
    /// @param segment the segment of the union
    /// @param index   the index
    /// @param value   the value
    public static void set_float32(MemorySegment segment, long index, @CType("float[4]") MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_float32, index), ML_float32.byteSize()); }
    /// Sets `float32` with the given value.
    /// @param segment the segment of the union
    /// @param value   the value
    public static void set_float32(MemorySegment segment, @CType("float[4]") MemorySegment value) { VkClearColorValue.set_float32(segment, 0L, value); }
    /// Sets `float32` with the given value.
    /// @param value the value
    /// @return `this`
    public VkClearColorValue float32(@CType("float[4]") MemorySegment value) { VkClearColorValue.set_float32(this.segment(), value); return this; }

    /// {@return `int32` at the given index}
    /// @param segment the segment of the union
    /// @param index   the index
    public static @CType("int32_t[4]") MemorySegment get_int32(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_int32, index), ML_int32); }
    /// {@return `int32`}
    /// @param segment the segment of the union
    public static @CType("int32_t[4]") MemorySegment get_int32(MemorySegment segment) { return VkClearColorValue.get_int32(segment, 0L); }
    /// {@return `int32`}
    public @CType("int32_t[4]") MemorySegment int32() { return VkClearColorValue.get_int32(this.segment()); }
    /// Sets `int32` with the given value at the given index.
    /// @param segment the segment of the union
    /// @param index   the index
    /// @param value   the value
    public static void set_int32(MemorySegment segment, long index, @CType("int32_t[4]") MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_int32, index), ML_int32.byteSize()); }
    /// Sets `int32` with the given value.
    /// @param segment the segment of the union
    /// @param value   the value
    public static void set_int32(MemorySegment segment, @CType("int32_t[4]") MemorySegment value) { VkClearColorValue.set_int32(segment, 0L, value); }
    /// Sets `int32` with the given value.
    /// @param value the value
    /// @return `this`
    public VkClearColorValue int32(@CType("int32_t[4]") MemorySegment value) { VkClearColorValue.set_int32(this.segment(), value); return this; }

    /// {@return `uint32` at the given index}
    /// @param segment the segment of the union
    /// @param index   the index
    public static @CType("uint32_t[4]") MemorySegment get_uint32(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_uint32, index), ML_uint32); }
    /// {@return `uint32`}
    /// @param segment the segment of the union
    public static @CType("uint32_t[4]") MemorySegment get_uint32(MemorySegment segment) { return VkClearColorValue.get_uint32(segment, 0L); }
    /// {@return `uint32`}
    public @CType("uint32_t[4]") MemorySegment uint32() { return VkClearColorValue.get_uint32(this.segment()); }
    /// Sets `uint32` with the given value at the given index.
    /// @param segment the segment of the union
    /// @param index   the index
    /// @param value   the value
    public static void set_uint32(MemorySegment segment, long index, @CType("uint32_t[4]") MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_uint32, index), ML_uint32.byteSize()); }
    /// Sets `uint32` with the given value.
    /// @param segment the segment of the union
    /// @param value   the value
    public static void set_uint32(MemorySegment segment, @CType("uint32_t[4]") MemorySegment value) { VkClearColorValue.set_uint32(segment, 0L, value); }
    /// Sets `uint32` with the given value.
    /// @param value the value
    /// @return `this`
    public VkClearColorValue uint32(@CType("uint32_t[4]") MemorySegment value) { VkClearColorValue.set_uint32(this.segment(), value); return this; }

    /// A buffer of [VkClearColorValue].
    public static final class Buffer extends VkClearColorValue {
        private final long elementCount;

        /// Creates `VkClearColorValue.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkClearColorValue`.
        /// @param index the index of the union buffer
        /// @return the slice of `VkClearColorValue`
        public VkClearColorValue asSlice(long index) { return new VkClearColorValue(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkClearColorValue`.
        /// @param index the index of the union buffer
        /// @param count the count
        /// @return the slice of `VkClearColorValue`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `float32` at the given index}
        /// @param index the index
        public @CType("float[4]") MemorySegment float32At(long index) { return VkClearColorValue.get_float32(this.segment(), index); }
        /// Sets `float32` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer float32At(long index, @CType("float[4]") MemorySegment value) { VkClearColorValue.set_float32(this.segment(), index, value); return this; }

        /// {@return `int32` at the given index}
        /// @param index the index
        public @CType("int32_t[4]") MemorySegment int32At(long index) { return VkClearColorValue.get_int32(this.segment(), index); }
        /// Sets `int32` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer int32At(long index, @CType("int32_t[4]") MemorySegment value) { VkClearColorValue.set_int32(this.segment(), index, value); return this; }

        /// {@return `uint32` at the given index}
        /// @param index the index
        public @CType("uint32_t[4]") MemorySegment uint32At(long index) { return VkClearColorValue.get_uint32(this.segment(), index); }
        /// Sets `uint32` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer uint32At(long index, @CType("uint32_t[4]") MemorySegment value) { VkClearColorValue.set_uint32(this.segment(), index, value); return this; }

    }
}
