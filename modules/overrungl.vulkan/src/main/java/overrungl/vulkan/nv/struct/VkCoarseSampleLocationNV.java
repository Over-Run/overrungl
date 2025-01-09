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
public final class VkCoarseSampleLocationNV extends Struct {
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
    public static VkCoarseSampleLocationNV ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkCoarseSampleLocationNV(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkCoarseSampleLocationNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkCoarseSampleLocationNV`
    public static VkCoarseSampleLocationNV alloc(SegmentAllocator allocator) { return new VkCoarseSampleLocationNV(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkCoarseSampleLocationNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkCoarseSampleLocationNV`
    public static VkCoarseSampleLocationNV alloc(SegmentAllocator allocator, long count) { return new VkCoarseSampleLocationNV(allocator.allocate(LAYOUT, count)); }

    /// {@return `pixelX` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_pixelX(MemorySegment segment, long index) { return (int) VH_pixelX.get(segment, 0L, index); }
    /// {@return `pixelX`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_pixelX(MemorySegment segment) { return VkCoarseSampleLocationNV.get_pixelX(segment, 0L); }
    /// {@return `pixelX` at the given index}
    /// @param index the index
    public @CType("uint32_t") int pixelXAt(long index) { return VkCoarseSampleLocationNV.get_pixelX(this.segment(), index); }
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
    /// Sets `pixelX` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkCoarseSampleLocationNV pixelXAt(long index, @CType("uint32_t") int value) { VkCoarseSampleLocationNV.set_pixelX(this.segment(), index, value); return this; }
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
    /// {@return `pixelY` at the given index}
    /// @param index the index
    public @CType("uint32_t") int pixelYAt(long index) { return VkCoarseSampleLocationNV.get_pixelY(this.segment(), index); }
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
    /// Sets `pixelY` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkCoarseSampleLocationNV pixelYAt(long index, @CType("uint32_t") int value) { VkCoarseSampleLocationNV.set_pixelY(this.segment(), index, value); return this; }
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
    /// {@return `sample` at the given index}
    /// @param index the index
    public @CType("uint32_t") int sampleAt(long index) { return VkCoarseSampleLocationNV.get_sample(this.segment(), index); }
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
    /// Sets `sample` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkCoarseSampleLocationNV sampleAt(long index, @CType("uint32_t") int value) { VkCoarseSampleLocationNV.set_sample(this.segment(), index, value); return this; }
    /// Sets `sample` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCoarseSampleLocationNV sample(@CType("uint32_t") int value) { VkCoarseSampleLocationNV.set_sample(this.segment(), value); return this; }

}
