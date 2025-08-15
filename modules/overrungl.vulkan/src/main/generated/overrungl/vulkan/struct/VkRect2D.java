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
package overrungl.vulkan.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkRect2D`.
/// ## Layout
/// ```
/// struct VkRect2D {
///     (struct VkOffset2D) VkOffset2D offset;
///     (struct VkExtent2D) VkExtent2D extent;
/// };
/// ```
public final class VkRect2D extends GroupType {
    /// The struct layout of `VkRect2D`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        overrungl.vulkan.struct.VkOffset2D.LAYOUT.withName("offset"),
        overrungl.vulkan.struct.VkExtent2D.LAYOUT.withName("extent")
    );
    /// The byte offset of `offset`.
    public static final long OFFSET_offset = LAYOUT.byteOffset(PathElement.groupElement("offset"));
    /// The memory layout of `offset`.
    public static final MemoryLayout LAYOUT_offset = LAYOUT.select(PathElement.groupElement("offset"));
    /// The byte offset of `extent`.
    public static final long OFFSET_extent = LAYOUT.byteOffset(PathElement.groupElement("extent"));
    /// The memory layout of `extent`.
    public static final MemoryLayout LAYOUT_extent = LAYOUT.select(PathElement.groupElement("extent"));

    /// Creates `VkRect2D` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkRect2D(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkRect2D` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkRect2D of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkRect2D(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkRect2D` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkRect2D ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkRect2D(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkRect2D` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkRect2D ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkRect2D(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkRect2D` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkRect2D`
    public static VkRect2D alloc(SegmentAllocator allocator) { return new VkRect2D(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkRect2D` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkRect2D`
    public static VkRect2D alloc(SegmentAllocator allocator, long count) { return new VkRect2D(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkRect2D copyFrom(VkRect2D src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkRect2D reinterpret(long count) { return new VkRect2D(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// {@return `offset` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment offset(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_offset, index), LAYOUT_offset); }
    /// {@return `offset`}
    public MemorySegment offset() { return offset(this.segment(), 0L); }
    /// Sets `offset` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void offset(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_offset, index), LAYOUT_offset.byteSize()); }
    /// Sets `offset` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRect2D offset(MemorySegment value) { offset(this.segment(), 0L, value); return this; }
    /// Accepts `offset` with the given function.
    /// @param func the function
    /// @return `this`
    public VkRect2D offset(Consumer<overrungl.vulkan.struct.VkOffset2D> func) { func.accept(overrungl.vulkan.struct.VkOffset2D.of(offset())); return this; }

    /// {@return `extent` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment extent(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_extent, index), LAYOUT_extent); }
    /// {@return `extent`}
    public MemorySegment extent() { return extent(this.segment(), 0L); }
    /// Sets `extent` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void extent(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_extent, index), LAYOUT_extent.byteSize()); }
    /// Sets `extent` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRect2D extent(MemorySegment value) { extent(this.segment(), 0L, value); return this; }
    /// Accepts `extent` with the given function.
    /// @param func the function
    /// @return `this`
    public VkRect2D extent(Consumer<overrungl.vulkan.struct.VkExtent2D> func) { func.accept(overrungl.vulkan.struct.VkExtent2D.of(extent())); return this; }

    /// Creates a slice of `VkRect2D`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkRect2D`
    public VkRect2D asSlice(long index) { return new VkRect2D(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkRect2D`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkRect2D`
    public VkRect2D asSlice(long index, long count) { return new VkRect2D(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkRect2D` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkRect2D at(long index, Consumer<VkRect2D> func) { func.accept(asSlice(index)); return this; }

    /// {@return `offset` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment offsetAt(long index) { return offset(this.segment(), index); }
    /// Sets `offset` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkRect2D offsetAt(long index, MemorySegment value) { offset(this.segment(), index, value); return this; }
    /// Accepts `offset` with the given function.
    /// @param index the index of the struct buffer
    /// @param func the function
    /// @return `this`
    public VkRect2D offsetAt(long index, Consumer<overrungl.vulkan.struct.VkOffset2D> func) { func.accept(overrungl.vulkan.struct.VkOffset2D.of(offsetAt(index))); return this; }

    /// {@return `extent` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment extentAt(long index) { return extent(this.segment(), index); }
    /// Sets `extent` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkRect2D extentAt(long index, MemorySegment value) { extent(this.segment(), index, value); return this; }
    /// Accepts `extent` with the given function.
    /// @param index the index of the struct buffer
    /// @param func the function
    /// @return `this`
    public VkRect2D extentAt(long index, Consumer<overrungl.vulkan.struct.VkExtent2D> func) { func.accept(overrungl.vulkan.struct.VkExtent2D.of(extentAt(index))); return this; }

}
