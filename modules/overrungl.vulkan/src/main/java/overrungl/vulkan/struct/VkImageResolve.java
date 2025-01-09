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
package overrungl.vulkan.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.annotation.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Members
/// ### srcSubresource
/// [Byte offset][#OFFSET_srcSubresource] - [Memory layout][#ML_srcSubresource] - [Getter][#srcSubresource()] - [Setter][#srcSubresource(java.lang.foreign.MemorySegment)]
/// ### srcOffset
/// [Byte offset][#OFFSET_srcOffset] - [Memory layout][#ML_srcOffset] - [Getter][#srcOffset()] - [Setter][#srcOffset(java.lang.foreign.MemorySegment)]
/// ### dstSubresource
/// [Byte offset][#OFFSET_dstSubresource] - [Memory layout][#ML_dstSubresource] - [Getter][#dstSubresource()] - [Setter][#dstSubresource(java.lang.foreign.MemorySegment)]
/// ### dstOffset
/// [Byte offset][#OFFSET_dstOffset] - [Memory layout][#ML_dstOffset] - [Getter][#dstOffset()] - [Setter][#dstOffset(java.lang.foreign.MemorySegment)]
/// ### extent
/// [Byte offset][#OFFSET_extent] - [Memory layout][#ML_extent] - [Getter][#extent()] - [Setter][#extent(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkImageResolve {
///     VkImageSubresourceLayers srcSubresource;
///     VkOffset3D srcOffset;
///     VkImageSubresourceLayers dstSubresource;
///     VkOffset3D dstOffset;
///     VkExtent3D extent;
/// } VkImageResolve;
/// ```
public final class VkImageResolve extends Struct {
    /// The struct layout of `VkImageResolve`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        overrungl.vulkan.struct.VkImageSubresourceLayers.LAYOUT.withName("srcSubresource"),
        overrungl.vulkan.struct.VkOffset3D.LAYOUT.withName("srcOffset"),
        overrungl.vulkan.struct.VkImageSubresourceLayers.LAYOUT.withName("dstSubresource"),
        overrungl.vulkan.struct.VkOffset3D.LAYOUT.withName("dstOffset"),
        overrungl.vulkan.struct.VkExtent3D.LAYOUT.withName("extent")
    );
    /// The byte offset of `srcSubresource`.
    public static final long OFFSET_srcSubresource = LAYOUT.byteOffset(PathElement.groupElement("srcSubresource"));
    /// The memory layout of `srcSubresource`.
    public static final MemoryLayout ML_srcSubresource = LAYOUT.select(PathElement.groupElement("srcSubresource"));
    /// The byte offset of `srcOffset`.
    public static final long OFFSET_srcOffset = LAYOUT.byteOffset(PathElement.groupElement("srcOffset"));
    /// The memory layout of `srcOffset`.
    public static final MemoryLayout ML_srcOffset = LAYOUT.select(PathElement.groupElement("srcOffset"));
    /// The byte offset of `dstSubresource`.
    public static final long OFFSET_dstSubresource = LAYOUT.byteOffset(PathElement.groupElement("dstSubresource"));
    /// The memory layout of `dstSubresource`.
    public static final MemoryLayout ML_dstSubresource = LAYOUT.select(PathElement.groupElement("dstSubresource"));
    /// The byte offset of `dstOffset`.
    public static final long OFFSET_dstOffset = LAYOUT.byteOffset(PathElement.groupElement("dstOffset"));
    /// The memory layout of `dstOffset`.
    public static final MemoryLayout ML_dstOffset = LAYOUT.select(PathElement.groupElement("dstOffset"));
    /// The byte offset of `extent`.
    public static final long OFFSET_extent = LAYOUT.byteOffset(PathElement.groupElement("extent"));
    /// The memory layout of `extent`.
    public static final MemoryLayout ML_extent = LAYOUT.select(PathElement.groupElement("extent"));

    /// Creates `VkImageResolve` with the given segment.
    /// @param segment the memory segment
    public VkImageResolve(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkImageResolve` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkImageResolve of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkImageResolve(segment); }

    /// Creates `VkImageResolve` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkImageResolve ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkImageResolve(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkImageResolve` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkImageResolve ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkImageResolve(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkImageResolve` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkImageResolve`
    public static VkImageResolve alloc(SegmentAllocator allocator) { return new VkImageResolve(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkImageResolve` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkImageResolve`
    public static VkImageResolve alloc(SegmentAllocator allocator, long count) { return new VkImageResolve(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `VkImageResolve`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkImageResolve`
    public VkImageResolve asSlice(long index) { return new VkImageResolve(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `VkImageResolve`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkImageResolve`
    public VkImageResolve asSlice(long index, long count) { return new VkImageResolve(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

    /// {@return `srcSubresource` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkImageSubresourceLayers") java.lang.foreign.MemorySegment get_srcSubresource(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_srcSubresource, index), ML_srcSubresource); }
    /// {@return `srcSubresource`}
    /// @param segment the segment of the struct
    public static @CType("VkImageSubresourceLayers") java.lang.foreign.MemorySegment get_srcSubresource(MemorySegment segment) { return VkImageResolve.get_srcSubresource(segment, 0L); }
    /// {@return `srcSubresource` at the given index}
    /// @param index the index
    public @CType("VkImageSubresourceLayers") java.lang.foreign.MemorySegment srcSubresourceAt(long index) { return VkImageResolve.get_srcSubresource(this.segment(), index); }
    /// {@return `srcSubresource`}
    public @CType("VkImageSubresourceLayers") java.lang.foreign.MemorySegment srcSubresource() { return VkImageResolve.get_srcSubresource(this.segment()); }
    /// Sets `srcSubresource` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_srcSubresource(MemorySegment segment, long index, @CType("VkImageSubresourceLayers") java.lang.foreign.MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_srcSubresource, index), ML_srcSubresource.byteSize()); }
    /// Sets `srcSubresource` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_srcSubresource(MemorySegment segment, @CType("VkImageSubresourceLayers") java.lang.foreign.MemorySegment value) { VkImageResolve.set_srcSubresource(segment, 0L, value); }
    /// Sets `srcSubresource` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkImageResolve srcSubresourceAt(long index, @CType("VkImageSubresourceLayers") java.lang.foreign.MemorySegment value) { VkImageResolve.set_srcSubresource(this.segment(), index, value); return this; }
    /// Sets `srcSubresource` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageResolve srcSubresource(@CType("VkImageSubresourceLayers") java.lang.foreign.MemorySegment value) { VkImageResolve.set_srcSubresource(this.segment(), value); return this; }

    /// {@return `srcOffset` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkOffset3D") java.lang.foreign.MemorySegment get_srcOffset(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_srcOffset, index), ML_srcOffset); }
    /// {@return `srcOffset`}
    /// @param segment the segment of the struct
    public static @CType("VkOffset3D") java.lang.foreign.MemorySegment get_srcOffset(MemorySegment segment) { return VkImageResolve.get_srcOffset(segment, 0L); }
    /// {@return `srcOffset` at the given index}
    /// @param index the index
    public @CType("VkOffset3D") java.lang.foreign.MemorySegment srcOffsetAt(long index) { return VkImageResolve.get_srcOffset(this.segment(), index); }
    /// {@return `srcOffset`}
    public @CType("VkOffset3D") java.lang.foreign.MemorySegment srcOffset() { return VkImageResolve.get_srcOffset(this.segment()); }
    /// Sets `srcOffset` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_srcOffset(MemorySegment segment, long index, @CType("VkOffset3D") java.lang.foreign.MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_srcOffset, index), ML_srcOffset.byteSize()); }
    /// Sets `srcOffset` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_srcOffset(MemorySegment segment, @CType("VkOffset3D") java.lang.foreign.MemorySegment value) { VkImageResolve.set_srcOffset(segment, 0L, value); }
    /// Sets `srcOffset` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkImageResolve srcOffsetAt(long index, @CType("VkOffset3D") java.lang.foreign.MemorySegment value) { VkImageResolve.set_srcOffset(this.segment(), index, value); return this; }
    /// Sets `srcOffset` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageResolve srcOffset(@CType("VkOffset3D") java.lang.foreign.MemorySegment value) { VkImageResolve.set_srcOffset(this.segment(), value); return this; }

    /// {@return `dstSubresource` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkImageSubresourceLayers") java.lang.foreign.MemorySegment get_dstSubresource(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_dstSubresource, index), ML_dstSubresource); }
    /// {@return `dstSubresource`}
    /// @param segment the segment of the struct
    public static @CType("VkImageSubresourceLayers") java.lang.foreign.MemorySegment get_dstSubresource(MemorySegment segment) { return VkImageResolve.get_dstSubresource(segment, 0L); }
    /// {@return `dstSubresource` at the given index}
    /// @param index the index
    public @CType("VkImageSubresourceLayers") java.lang.foreign.MemorySegment dstSubresourceAt(long index) { return VkImageResolve.get_dstSubresource(this.segment(), index); }
    /// {@return `dstSubresource`}
    public @CType("VkImageSubresourceLayers") java.lang.foreign.MemorySegment dstSubresource() { return VkImageResolve.get_dstSubresource(this.segment()); }
    /// Sets `dstSubresource` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_dstSubresource(MemorySegment segment, long index, @CType("VkImageSubresourceLayers") java.lang.foreign.MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_dstSubresource, index), ML_dstSubresource.byteSize()); }
    /// Sets `dstSubresource` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_dstSubresource(MemorySegment segment, @CType("VkImageSubresourceLayers") java.lang.foreign.MemorySegment value) { VkImageResolve.set_dstSubresource(segment, 0L, value); }
    /// Sets `dstSubresource` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkImageResolve dstSubresourceAt(long index, @CType("VkImageSubresourceLayers") java.lang.foreign.MemorySegment value) { VkImageResolve.set_dstSubresource(this.segment(), index, value); return this; }
    /// Sets `dstSubresource` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageResolve dstSubresource(@CType("VkImageSubresourceLayers") java.lang.foreign.MemorySegment value) { VkImageResolve.set_dstSubresource(this.segment(), value); return this; }

    /// {@return `dstOffset` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkOffset3D") java.lang.foreign.MemorySegment get_dstOffset(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_dstOffset, index), ML_dstOffset); }
    /// {@return `dstOffset`}
    /// @param segment the segment of the struct
    public static @CType("VkOffset3D") java.lang.foreign.MemorySegment get_dstOffset(MemorySegment segment) { return VkImageResolve.get_dstOffset(segment, 0L); }
    /// {@return `dstOffset` at the given index}
    /// @param index the index
    public @CType("VkOffset3D") java.lang.foreign.MemorySegment dstOffsetAt(long index) { return VkImageResolve.get_dstOffset(this.segment(), index); }
    /// {@return `dstOffset`}
    public @CType("VkOffset3D") java.lang.foreign.MemorySegment dstOffset() { return VkImageResolve.get_dstOffset(this.segment()); }
    /// Sets `dstOffset` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_dstOffset(MemorySegment segment, long index, @CType("VkOffset3D") java.lang.foreign.MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_dstOffset, index), ML_dstOffset.byteSize()); }
    /// Sets `dstOffset` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_dstOffset(MemorySegment segment, @CType("VkOffset3D") java.lang.foreign.MemorySegment value) { VkImageResolve.set_dstOffset(segment, 0L, value); }
    /// Sets `dstOffset` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkImageResolve dstOffsetAt(long index, @CType("VkOffset3D") java.lang.foreign.MemorySegment value) { VkImageResolve.set_dstOffset(this.segment(), index, value); return this; }
    /// Sets `dstOffset` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageResolve dstOffset(@CType("VkOffset3D") java.lang.foreign.MemorySegment value) { VkImageResolve.set_dstOffset(this.segment(), value); return this; }

    /// {@return `extent` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkExtent3D") java.lang.foreign.MemorySegment get_extent(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_extent, index), ML_extent); }
    /// {@return `extent`}
    /// @param segment the segment of the struct
    public static @CType("VkExtent3D") java.lang.foreign.MemorySegment get_extent(MemorySegment segment) { return VkImageResolve.get_extent(segment, 0L); }
    /// {@return `extent` at the given index}
    /// @param index the index
    public @CType("VkExtent3D") java.lang.foreign.MemorySegment extentAt(long index) { return VkImageResolve.get_extent(this.segment(), index); }
    /// {@return `extent`}
    public @CType("VkExtent3D") java.lang.foreign.MemorySegment extent() { return VkImageResolve.get_extent(this.segment()); }
    /// Sets `extent` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_extent(MemorySegment segment, long index, @CType("VkExtent3D") java.lang.foreign.MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_extent, index), ML_extent.byteSize()); }
    /// Sets `extent` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_extent(MemorySegment segment, @CType("VkExtent3D") java.lang.foreign.MemorySegment value) { VkImageResolve.set_extent(segment, 0L, value); }
    /// Sets `extent` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkImageResolve extentAt(long index, @CType("VkExtent3D") java.lang.foreign.MemorySegment value) { VkImageResolve.set_extent(this.segment(), index, value); return this; }
    /// Sets `extent` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageResolve extent(@CType("VkExtent3D") java.lang.foreign.MemorySegment value) { VkImageResolve.set_extent(this.segment(), value); return this; }

}
