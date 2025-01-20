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
package overrungl.vulkan.intel.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.annotation.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Members
/// ### type
/// [VarHandle][#VH_type] - [Getter][#type()] - [Setter][#type(int)]
/// ### data
/// [Byte offset][#OFFSET_data] - [Memory layout][#ML_data] - [Getter][#data()] - [Setter][#data(MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPerformanceValueINTEL {
///     VkPerformanceValueTypeINTEL type;
///     VkPerformanceValueDataINTEL data;
/// } VkPerformanceValueINTEL;
/// ```
public sealed class VkPerformanceValueINTEL extends Struct {
    /// The struct layout of `VkPerformanceValueINTEL`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("type"),
        overrungl.vulkan.intel.union.VkPerformanceValueDataINTEL.LAYOUT.withName("data")
    );
    /// The [VarHandle] of `type` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_type = LAYOUT.arrayElementVarHandle(PathElement.groupElement("type"));
    /// The byte offset of `data`.
    public static final long OFFSET_data = LAYOUT.byteOffset(PathElement.groupElement("data"));
    /// The memory layout of `data`.
    public static final MemoryLayout ML_data = LAYOUT.select(PathElement.groupElement("data"));

    /// Creates `VkPerformanceValueINTEL` with the given segment.
    /// @param segment the memory segment
    public VkPerformanceValueINTEL(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPerformanceValueINTEL` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPerformanceValueINTEL of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPerformanceValueINTEL(segment); }

    /// Creates `VkPerformanceValueINTEL` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPerformanceValueINTEL` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPerformanceValueINTEL ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPerformanceValueINTEL(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPerformanceValueINTEL` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkPerformanceValueINTEL` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPerformanceValueINTEL`
    public static VkPerformanceValueINTEL alloc(SegmentAllocator allocator) { return new VkPerformanceValueINTEL(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPerformanceValueINTEL` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPerformanceValueINTEL`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkPerformanceValueINTEL` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPerformanceValueINTEL`
    public static VkPerformanceValueINTEL allocInit(SegmentAllocator allocator, @CType("VkPerformanceValueTypeINTEL") int type, @CType("VkPerformanceValueDataINTEL") MemorySegment data) { return alloc(allocator).type(type).data(data); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPerformanceValueINTEL copyFrom(VkPerformanceValueINTEL src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `type` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkPerformanceValueTypeINTEL") int get_type(MemorySegment segment, long index) { return (int) VH_type.get(segment, 0L, index); }
    /// {@return `type`}
    /// @param segment the segment of the struct
    public static @CType("VkPerformanceValueTypeINTEL") int get_type(MemorySegment segment) { return VkPerformanceValueINTEL.get_type(segment, 0L); }
    /// {@return `type`}
    public @CType("VkPerformanceValueTypeINTEL") int type() { return VkPerformanceValueINTEL.get_type(this.segment()); }
    /// Sets `type` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_type(MemorySegment segment, long index, @CType("VkPerformanceValueTypeINTEL") int value) { VH_type.set(segment, 0L, index, value); }
    /// Sets `type` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_type(MemorySegment segment, @CType("VkPerformanceValueTypeINTEL") int value) { VkPerformanceValueINTEL.set_type(segment, 0L, value); }
    /// Sets `type` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPerformanceValueINTEL type(@CType("VkPerformanceValueTypeINTEL") int value) { VkPerformanceValueINTEL.set_type(this.segment(), value); return this; }

    /// {@return `data` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkPerformanceValueDataINTEL") MemorySegment get_data(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_data, index), ML_data); }
    /// {@return `data`}
    /// @param segment the segment of the struct
    public static @CType("VkPerformanceValueDataINTEL") MemorySegment get_data(MemorySegment segment) { return VkPerformanceValueINTEL.get_data(segment, 0L); }
    /// {@return `data`}
    public @CType("VkPerformanceValueDataINTEL") MemorySegment data() { return VkPerformanceValueINTEL.get_data(this.segment()); }
    /// Sets `data` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_data(MemorySegment segment, long index, @CType("VkPerformanceValueDataINTEL") MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_data, index), ML_data.byteSize()); }
    /// Sets `data` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_data(MemorySegment segment, @CType("VkPerformanceValueDataINTEL") MemorySegment value) { VkPerformanceValueINTEL.set_data(segment, 0L, value); }
    /// Sets `data` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPerformanceValueINTEL data(@CType("VkPerformanceValueDataINTEL") MemorySegment value) { VkPerformanceValueINTEL.set_data(this.segment(), value); return this; }

    /// A buffer of [VkPerformanceValueINTEL].
    public static final class Buffer extends VkPerformanceValueINTEL {
        private final long elementCount;

        /// Creates `VkPerformanceValueINTEL.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkPerformanceValueINTEL`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkPerformanceValueINTEL`
        public VkPerformanceValueINTEL asSlice(long index) { return new VkPerformanceValueINTEL(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkPerformanceValueINTEL`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkPerformanceValueINTEL`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `type` at the given index}
        /// @param index the index
        public @CType("VkPerformanceValueTypeINTEL") int typeAt(long index) { return VkPerformanceValueINTEL.get_type(this.segment(), index); }
        /// Sets `type` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer typeAt(long index, @CType("VkPerformanceValueTypeINTEL") int value) { VkPerformanceValueINTEL.set_type(this.segment(), index, value); return this; }

        /// {@return `data` at the given index}
        /// @param index the index
        public @CType("VkPerformanceValueDataINTEL") MemorySegment dataAt(long index) { return VkPerformanceValueINTEL.get_data(this.segment(), index); }
        /// Sets `data` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer dataAt(long index, @CType("VkPerformanceValueDataINTEL") MemorySegment value) { VkPerformanceValueINTEL.set_data(this.segment(), index, value); return this; }

    }
}
