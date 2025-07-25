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
package overrungl.vulkan.ext.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkSampleLocationEXT {
///     float x;
///     float y;
/// };
/// ```
public final class VkSampleLocationEXT extends GroupType {
    /// The struct layout of `VkSampleLocationEXT`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_FLOAT.withName("x"),
        ValueLayout.JAVA_FLOAT.withName("y")
    );
    /// The byte offset of `x`.
    public static final long OFFSET_x = LAYOUT.byteOffset(PathElement.groupElement("x"));
    /// The memory layout of `x`.
    public static final MemoryLayout LAYOUT_x = LAYOUT.select(PathElement.groupElement("x"));
    /// The [VarHandle] of `x` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_x = LAYOUT.arrayElementVarHandle(PathElement.groupElement("x"));
    /// The byte offset of `y`.
    public static final long OFFSET_y = LAYOUT.byteOffset(PathElement.groupElement("y"));
    /// The memory layout of `y`.
    public static final MemoryLayout LAYOUT_y = LAYOUT.select(PathElement.groupElement("y"));
    /// The [VarHandle] of `y` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_y = LAYOUT.arrayElementVarHandle(PathElement.groupElement("y"));

    /// Creates `VkSampleLocationEXT` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkSampleLocationEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkSampleLocationEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSampleLocationEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSampleLocationEXT(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkSampleLocationEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSampleLocationEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSampleLocationEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkSampleLocationEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSampleLocationEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkSampleLocationEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkSampleLocationEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkSampleLocationEXT`
    public static VkSampleLocationEXT alloc(SegmentAllocator allocator) { return new VkSampleLocationEXT(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkSampleLocationEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkSampleLocationEXT`
    public static VkSampleLocationEXT alloc(SegmentAllocator allocator, long count) { return new VkSampleLocationEXT(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkSampleLocationEXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param x `x`
    /// @param y `y`
    /// @return the allocated `VkSampleLocationEXT`
    public static VkSampleLocationEXT allocInit(SegmentAllocator allocator, float x, float y) {
        return alloc(allocator).x(x).y(y);
    }

    /// Allocates a `VkSampleLocationEXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param x `x`
    /// @return the allocated `VkSampleLocationEXT`
    public static VkSampleLocationEXT allocInit(SegmentAllocator allocator, float x) {
        return alloc(allocator).x(x);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkSampleLocationEXT copyFrom(VkSampleLocationEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkSampleLocationEXT reinterpret(long count) { return new VkSampleLocationEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// {@return `x` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static float x(MemorySegment segment, long index) { return (float) VH_x.get(segment, 0L, index); }
    /// {@return `x`}
    public float x() { return x(this.segment(), 0L); }
    /// Sets `x` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void x(MemorySegment segment, long index, float value) { VH_x.set(segment, 0L, index, value); }
    /// Sets `x` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSampleLocationEXT x(float value) { x(this.segment(), 0L, value); return this; }

    /// {@return `y` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static float y(MemorySegment segment, long index) { return (float) VH_y.get(segment, 0L, index); }
    /// {@return `y`}
    public float y() { return y(this.segment(), 0L); }
    /// Sets `y` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void y(MemorySegment segment, long index, float value) { VH_y.set(segment, 0L, index, value); }
    /// Sets `y` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSampleLocationEXT y(float value) { y(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkSampleLocationEXT`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkSampleLocationEXT`
    public VkSampleLocationEXT asSlice(long index) { return new VkSampleLocationEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkSampleLocationEXT`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkSampleLocationEXT`
    public VkSampleLocationEXT asSlice(long index, long count) { return new VkSampleLocationEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkSampleLocationEXT` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkSampleLocationEXT at(long index, Consumer<VkSampleLocationEXT> func) { func.accept(asSlice(index)); return this; }

    /// {@return `x` at the given index}
    /// @param index the index of the struct buffer
    public float xAt(long index) { return x(this.segment(), index); }
    /// Sets `x` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSampleLocationEXT xAt(long index, float value) { x(this.segment(), index, value); return this; }

    /// {@return `y` at the given index}
    /// @param index the index of the struct buffer
    public float yAt(long index) { return y(this.segment(), index); }
    /// Sets `y` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSampleLocationEXT yAt(long index, float value) { y(this.segment(), index, value); return this; }

}
