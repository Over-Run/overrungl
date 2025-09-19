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
//@formatter:off
package overrungl.vulkan.nv.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkCoarseSampleLocationNV`.
/// ## Layout
/// ```
/// struct VkCoarseSampleLocationNV {
///     uint32_t pixelX;
///     uint32_t pixelY;
///     uint32_t sample;
/// };
/// ```
public final class VkCoarseSampleLocationNV extends GroupType {
    /// The struct layout of `VkCoarseSampleLocationNV`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("pixelX"),
        ValueLayout.JAVA_INT.withName("pixelY"),
        ValueLayout.JAVA_INT.withName("sample")
    );
    /// The byte offset of `pixelX`.
    public static final long OFFSET_pixelX = LAYOUT.byteOffset(PathElement.groupElement("pixelX"));
    /// The memory layout of `pixelX`.
    public static final MemoryLayout LAYOUT_pixelX = LAYOUT.select(PathElement.groupElement("pixelX"));
    /// The [VarHandle] of `pixelX` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pixelX = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pixelX"));
    /// The byte offset of `pixelY`.
    public static final long OFFSET_pixelY = LAYOUT.byteOffset(PathElement.groupElement("pixelY"));
    /// The memory layout of `pixelY`.
    public static final MemoryLayout LAYOUT_pixelY = LAYOUT.select(PathElement.groupElement("pixelY"));
    /// The [VarHandle] of `pixelY` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pixelY = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pixelY"));
    /// The byte offset of `sample`.
    public static final long OFFSET_sample = LAYOUT.byteOffset(PathElement.groupElement("sample"));
    /// The memory layout of `sample`.
    public static final MemoryLayout LAYOUT_sample = LAYOUT.select(PathElement.groupElement("sample"));
    /// The [VarHandle] of `sample` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_sample = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sample"));

    /// Creates `VkCoarseSampleLocationNV` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkCoarseSampleLocationNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkCoarseSampleLocationNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkCoarseSampleLocationNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkCoarseSampleLocationNV(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkCoarseSampleLocationNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkCoarseSampleLocationNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkCoarseSampleLocationNV(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkCoarseSampleLocationNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkCoarseSampleLocationNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkCoarseSampleLocationNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkCoarseSampleLocationNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkCoarseSampleLocationNV`
    public static VkCoarseSampleLocationNV alloc(SegmentAllocator allocator) { return new VkCoarseSampleLocationNV(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkCoarseSampleLocationNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkCoarseSampleLocationNV`
    public static VkCoarseSampleLocationNV alloc(SegmentAllocator allocator, long count) { return new VkCoarseSampleLocationNV(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkCoarseSampleLocationNV copyFrom(VkCoarseSampleLocationNV src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkCoarseSampleLocationNV reinterpret(long count) { return new VkCoarseSampleLocationNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// {@return `pixelX` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int pixelX(MemorySegment segment, long index) { return (int) VH_pixelX.get(segment, 0L, index); }
    /// {@return `pixelX`}
    public int pixelX() { return pixelX(this.segment(), 0L); }
    /// Sets `pixelX` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pixelX(MemorySegment segment, long index, int value) { VH_pixelX.set(segment, 0L, index, value); }
    /// Sets `pixelX` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCoarseSampleLocationNV pixelX(int value) { pixelX(this.segment(), 0L, value); return this; }

    /// {@return `pixelY` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int pixelY(MemorySegment segment, long index) { return (int) VH_pixelY.get(segment, 0L, index); }
    /// {@return `pixelY`}
    public int pixelY() { return pixelY(this.segment(), 0L); }
    /// Sets `pixelY` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pixelY(MemorySegment segment, long index, int value) { VH_pixelY.set(segment, 0L, index, value); }
    /// Sets `pixelY` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCoarseSampleLocationNV pixelY(int value) { pixelY(this.segment(), 0L, value); return this; }

    /// {@return `sample` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int sample(MemorySegment segment, long index) { return (int) VH_sample.get(segment, 0L, index); }
    /// {@return `sample`}
    public int sample() { return sample(this.segment(), 0L); }
    /// Sets `sample` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void sample(MemorySegment segment, long index, int value) { VH_sample.set(segment, 0L, index, value); }
    /// Sets `sample` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCoarseSampleLocationNV sample(int value) { sample(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkCoarseSampleLocationNV`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkCoarseSampleLocationNV`
    public VkCoarseSampleLocationNV asSlice(long index) { return new VkCoarseSampleLocationNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkCoarseSampleLocationNV`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkCoarseSampleLocationNV`
    public VkCoarseSampleLocationNV asSlice(long index, long count) { return new VkCoarseSampleLocationNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkCoarseSampleLocationNV` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkCoarseSampleLocationNV at(long index, Consumer<VkCoarseSampleLocationNV> func) { func.accept(asSlice(index)); return this; }

    /// {@return `pixelX` at the given index}
    /// @param index the index of the struct buffer
    public int pixelXAt(long index) { return pixelX(this.segment(), index); }
    /// Sets `pixelX` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkCoarseSampleLocationNV pixelXAt(long index, int value) { pixelX(this.segment(), index, value); return this; }

    /// {@return `pixelY` at the given index}
    /// @param index the index of the struct buffer
    public int pixelYAt(long index) { return pixelY(this.segment(), index); }
    /// Sets `pixelY` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkCoarseSampleLocationNV pixelYAt(long index, int value) { pixelY(this.segment(), index, value); return this; }

    /// {@return `sample` at the given index}
    /// @param index the index of the struct buffer
    public int sampleAt(long index) { return sample(this.segment(), index); }
    /// Sets `sample` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkCoarseSampleLocationNV sampleAt(long index, int value) { sample(this.segment(), index, value); return this; }

}
