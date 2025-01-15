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
package overrungl.vulkan.nv.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.annotation.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Members
/// ### pixelX
/// [VarHandle][#VH_pixelX] - [Getter][#pixelX()] - [Setter][#pixelX(int)]
/// ### pixelY
/// [VarHandle][#VH_pixelY] - [Getter][#pixelY()] - [Setter][#pixelY(int)]
/// ### sample
/// [VarHandle][#VH_sample] - [Getter][#sample()] - [Setter][#sample(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkCoarseSampleLocationNV {
///     uint32_t pixelX;
///     uint32_t pixelY;
///     uint32_t sample;
/// } VkCoarseSampleLocationNV;
/// ```
public sealed class VkCoarseSampleLocationNV extends Struct {
    /// The struct layout of `VkCoarseSampleLocationNV`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("pixelX"),
        ValueLayout.JAVA_INT.withName("pixelY"),
        ValueLayout.JAVA_INT.withName("sample")
    );
    /// The [VarHandle] of `pixelX` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_pixelX = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pixelX"));
    /// The [VarHandle] of `pixelY` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_pixelY = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pixelY"));
    /// The [VarHandle] of `sample` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sample = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sample"));

    /// Creates `VkCoarseSampleLocationNV` with the given segment.
    /// @param segment the memory segment
    public VkCoarseSampleLocationNV(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkCoarseSampleLocationNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkCoarseSampleLocationNV of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkCoarseSampleLocationNV(segment); }

    /// Creates `VkCoarseSampleLocationNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkCoarseSampleLocationNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkCoarseSampleLocationNV ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkCoarseSampleLocationNV(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkCoarseSampleLocationNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkCoarseSampleLocationNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkCoarseSampleLocationNV`
    public static VkCoarseSampleLocationNV alloc(SegmentAllocator allocator) { return new VkCoarseSampleLocationNV(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkCoarseSampleLocationNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkCoarseSampleLocationNV`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkCoarseSampleLocationNV` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkCoarseSampleLocationNV`
    public static VkCoarseSampleLocationNV allocInit(SegmentAllocator allocator, @CType("uint32_t") int pixelX, @CType("uint32_t") int pixelY, @CType("uint32_t") int sample) { return alloc(allocator).pixelX(pixelX).pixelY(pixelY).sample(sample); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkCoarseSampleLocationNV copyFrom(VkCoarseSampleLocationNV src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `pixelX` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_pixelX(MemorySegment segment, long index) { return (int) VH_pixelX.get(segment, 0L, index); }
    /// {@return `pixelX`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_pixelX(MemorySegment segment) { return VkCoarseSampleLocationNV.get_pixelX(segment, 0L); }
    /// {@return `pixelX`}
    public @CType("uint32_t") int pixelX() { return VkCoarseSampleLocationNV.get_pixelX(this.segment()); }
    /// Sets `pixelX` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pixelX(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_pixelX.set(segment, 0L, index, value); }
    /// Sets `pixelX` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pixelX(MemorySegment segment, @CType("uint32_t") int value) { VkCoarseSampleLocationNV.set_pixelX(segment, 0L, value); }
    /// Sets `pixelX` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCoarseSampleLocationNV pixelX(@CType("uint32_t") int value) { VkCoarseSampleLocationNV.set_pixelX(this.segment(), value); return this; }

    /// {@return `pixelY` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_pixelY(MemorySegment segment, long index) { return (int) VH_pixelY.get(segment, 0L, index); }
    /// {@return `pixelY`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_pixelY(MemorySegment segment) { return VkCoarseSampleLocationNV.get_pixelY(segment, 0L); }
    /// {@return `pixelY`}
    public @CType("uint32_t") int pixelY() { return VkCoarseSampleLocationNV.get_pixelY(this.segment()); }
    /// Sets `pixelY` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pixelY(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_pixelY.set(segment, 0L, index, value); }
    /// Sets `pixelY` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pixelY(MemorySegment segment, @CType("uint32_t") int value) { VkCoarseSampleLocationNV.set_pixelY(segment, 0L, value); }
    /// Sets `pixelY` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCoarseSampleLocationNV pixelY(@CType("uint32_t") int value) { VkCoarseSampleLocationNV.set_pixelY(this.segment(), value); return this; }

    /// {@return `sample` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_sample(MemorySegment segment, long index) { return (int) VH_sample.get(segment, 0L, index); }
    /// {@return `sample`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_sample(MemorySegment segment) { return VkCoarseSampleLocationNV.get_sample(segment, 0L); }
    /// {@return `sample`}
    public @CType("uint32_t") int sample() { return VkCoarseSampleLocationNV.get_sample(this.segment()); }
    /// Sets `sample` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sample(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_sample.set(segment, 0L, index, value); }
    /// Sets `sample` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sample(MemorySegment segment, @CType("uint32_t") int value) { VkCoarseSampleLocationNV.set_sample(segment, 0L, value); }
    /// Sets `sample` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCoarseSampleLocationNV sample(@CType("uint32_t") int value) { VkCoarseSampleLocationNV.set_sample(this.segment(), value); return this; }

    /// A buffer of [VkCoarseSampleLocationNV].
    public static final class Buffer extends VkCoarseSampleLocationNV {
        private final long elementCount;

        /// Creates `VkCoarseSampleLocationNV.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkCoarseSampleLocationNV`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkCoarseSampleLocationNV`
        public VkCoarseSampleLocationNV asSlice(long index) { return new VkCoarseSampleLocationNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkCoarseSampleLocationNV`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkCoarseSampleLocationNV`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `pixelX` at the given index}
        /// @param index the index
        public @CType("uint32_t") int pixelXAt(long index) { return VkCoarseSampleLocationNV.get_pixelX(this.segment(), index); }
        /// Sets `pixelX` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pixelXAt(long index, @CType("uint32_t") int value) { VkCoarseSampleLocationNV.set_pixelX(this.segment(), index, value); return this; }

        /// {@return `pixelY` at the given index}
        /// @param index the index
        public @CType("uint32_t") int pixelYAt(long index) { return VkCoarseSampleLocationNV.get_pixelY(this.segment(), index); }
        /// Sets `pixelY` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pixelYAt(long index, @CType("uint32_t") int value) { VkCoarseSampleLocationNV.set_pixelY(this.segment(), index, value); return this; }

        /// {@return `sample` at the given index}
        /// @param index the index
        public @CType("uint32_t") int sampleAt(long index) { return VkCoarseSampleLocationNV.get_sample(this.segment(), index); }
        /// Sets `sample` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sampleAt(long index, @CType("uint32_t") int value) { VkCoarseSampleLocationNV.set_sample(this.segment(), index, value); return this; }

    }
}
