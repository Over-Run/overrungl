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

/// Represents `VkImageBlit`.
/// ## Layout
/// ```
/// struct VkImageBlit {
///     (struct VkImageSubresourceLayers) VkImageSubresourceLayers srcSubresource;
///     (struct VkOffset3D) VkOffset3D srcOffsets[2];
///     (struct VkImageSubresourceLayers) VkImageSubresourceLayers dstSubresource;
///     (struct VkOffset3D) VkOffset3D dstOffsets[2];
/// };
/// ```
public final class VkImageBlit extends GroupType {
    /// The struct layout of `VkImageBlit`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        overrungl.vulkan.struct.VkImageSubresourceLayers.LAYOUT.withName("srcSubresource"),
        MemoryLayout.sequenceLayout(2, overrungl.vulkan.struct.VkOffset3D.LAYOUT).withName("srcOffsets"),
        overrungl.vulkan.struct.VkImageSubresourceLayers.LAYOUT.withName("dstSubresource"),
        MemoryLayout.sequenceLayout(2, overrungl.vulkan.struct.VkOffset3D.LAYOUT).withName("dstOffsets")
    );
    /// The byte offset of `srcSubresource`.
    public static final long OFFSET_srcSubresource = LAYOUT.byteOffset(PathElement.groupElement("srcSubresource"));
    /// The memory layout of `srcSubresource`.
    public static final MemoryLayout LAYOUT_srcSubresource = LAYOUT.select(PathElement.groupElement("srcSubresource"));
    /// The byte offset of `srcOffsets`.
    public static final long OFFSET_srcOffsets = LAYOUT.byteOffset(PathElement.groupElement("srcOffsets"));
    /// The memory layout of `srcOffsets`.
    public static final MemoryLayout LAYOUT_srcOffsets = LAYOUT.select(PathElement.groupElement("srcOffsets"));
    /// The byte offset of `dstSubresource`.
    public static final long OFFSET_dstSubresource = LAYOUT.byteOffset(PathElement.groupElement("dstSubresource"));
    /// The memory layout of `dstSubresource`.
    public static final MemoryLayout LAYOUT_dstSubresource = LAYOUT.select(PathElement.groupElement("dstSubresource"));
    /// The byte offset of `dstOffsets`.
    public static final long OFFSET_dstOffsets = LAYOUT.byteOffset(PathElement.groupElement("dstOffsets"));
    /// The memory layout of `dstOffsets`.
    public static final MemoryLayout LAYOUT_dstOffsets = LAYOUT.select(PathElement.groupElement("dstOffsets"));

    /// Creates `VkImageBlit` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkImageBlit(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkImageBlit` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkImageBlit of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkImageBlit(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkImageBlit` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkImageBlit ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkImageBlit(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkImageBlit` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkImageBlit ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkImageBlit(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkImageBlit` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkImageBlit`
    public static VkImageBlit alloc(SegmentAllocator allocator) { return new VkImageBlit(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkImageBlit` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkImageBlit`
    public static VkImageBlit alloc(SegmentAllocator allocator, long count) { return new VkImageBlit(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkImageBlit copyFrom(VkImageBlit src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkImageBlit reinterpret(long count) { return new VkImageBlit(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// {@return `srcSubresource` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment srcSubresource(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_srcSubresource, index), LAYOUT_srcSubresource); }
    /// {@return `srcSubresource`}
    public MemorySegment srcSubresource() { return srcSubresource(this.segment(), 0L); }
    /// Sets `srcSubresource` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void srcSubresource(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_srcSubresource, index), LAYOUT_srcSubresource.byteSize()); }
    /// Sets `srcSubresource` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageBlit srcSubresource(MemorySegment value) { srcSubresource(this.segment(), 0L, value); return this; }
    /// Accepts `srcSubresource` with the given function.
    /// @param func the function
    /// @return `this`
    public VkImageBlit srcSubresource(Consumer<overrungl.vulkan.struct.VkImageSubresourceLayers> func) { func.accept(overrungl.vulkan.struct.VkImageSubresourceLayers.of(srcSubresource())); return this; }

    /// {@return `srcOffsets` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment srcOffsets(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_srcOffsets, index), LAYOUT_srcOffsets); }
    /// {@return `srcOffsets`}
    public MemorySegment srcOffsets() { return srcOffsets(this.segment(), 0L); }
    /// Sets `srcOffsets` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void srcOffsets(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_srcOffsets, index), LAYOUT_srcOffsets.byteSize()); }
    /// Sets `srcOffsets` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageBlit srcOffsets(MemorySegment value) { srcOffsets(this.segment(), 0L, value); return this; }
    /// Accepts `srcOffsets` with the given function.
    /// @param func the function
    /// @return `this`
    public VkImageBlit srcOffsets(Consumer<overrungl.vulkan.struct.VkOffset3D> func) { func.accept(overrungl.vulkan.struct.VkOffset3D.of(srcOffsets())); return this; }

    /// {@return `dstSubresource` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment dstSubresource(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_dstSubresource, index), LAYOUT_dstSubresource); }
    /// {@return `dstSubresource`}
    public MemorySegment dstSubresource() { return dstSubresource(this.segment(), 0L); }
    /// Sets `dstSubresource` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void dstSubresource(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_dstSubresource, index), LAYOUT_dstSubresource.byteSize()); }
    /// Sets `dstSubresource` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageBlit dstSubresource(MemorySegment value) { dstSubresource(this.segment(), 0L, value); return this; }
    /// Accepts `dstSubresource` with the given function.
    /// @param func the function
    /// @return `this`
    public VkImageBlit dstSubresource(Consumer<overrungl.vulkan.struct.VkImageSubresourceLayers> func) { func.accept(overrungl.vulkan.struct.VkImageSubresourceLayers.of(dstSubresource())); return this; }

    /// {@return `dstOffsets` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment dstOffsets(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_dstOffsets, index), LAYOUT_dstOffsets); }
    /// {@return `dstOffsets`}
    public MemorySegment dstOffsets() { return dstOffsets(this.segment(), 0L); }
    /// Sets `dstOffsets` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void dstOffsets(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_dstOffsets, index), LAYOUT_dstOffsets.byteSize()); }
    /// Sets `dstOffsets` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageBlit dstOffsets(MemorySegment value) { dstOffsets(this.segment(), 0L, value); return this; }
    /// Accepts `dstOffsets` with the given function.
    /// @param func the function
    /// @return `this`
    public VkImageBlit dstOffsets(Consumer<overrungl.vulkan.struct.VkOffset3D> func) { func.accept(overrungl.vulkan.struct.VkOffset3D.of(dstOffsets())); return this; }

    /// Creates a slice of `VkImageBlit`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkImageBlit`
    public VkImageBlit asSlice(long index) { return new VkImageBlit(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkImageBlit`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkImageBlit`
    public VkImageBlit asSlice(long index, long count) { return new VkImageBlit(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkImageBlit` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkImageBlit at(long index, Consumer<VkImageBlit> func) { func.accept(asSlice(index)); return this; }

    /// {@return `srcSubresource` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment srcSubresourceAt(long index) { return srcSubresource(this.segment(), index); }
    /// Sets `srcSubresource` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkImageBlit srcSubresourceAt(long index, MemorySegment value) { srcSubresource(this.segment(), index, value); return this; }
    /// Accepts `srcSubresource` with the given function.
    /// @param index the index of the struct buffer
    /// @param func the function
    /// @return `this`
    public VkImageBlit srcSubresourceAt(long index, Consumer<overrungl.vulkan.struct.VkImageSubresourceLayers> func) { func.accept(overrungl.vulkan.struct.VkImageSubresourceLayers.of(srcSubresourceAt(index))); return this; }

    /// {@return `srcOffsets` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment srcOffsetsAt(long index) { return srcOffsets(this.segment(), index); }
    /// Sets `srcOffsets` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkImageBlit srcOffsetsAt(long index, MemorySegment value) { srcOffsets(this.segment(), index, value); return this; }
    /// Accepts `srcOffsets` with the given function.
    /// @param index the index of the struct buffer
    /// @param func the function
    /// @return `this`
    public VkImageBlit srcOffsetsAt(long index, Consumer<overrungl.vulkan.struct.VkOffset3D> func) { func.accept(overrungl.vulkan.struct.VkOffset3D.of(srcOffsetsAt(index))); return this; }

    /// {@return `dstSubresource` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment dstSubresourceAt(long index) { return dstSubresource(this.segment(), index); }
    /// Sets `dstSubresource` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkImageBlit dstSubresourceAt(long index, MemorySegment value) { dstSubresource(this.segment(), index, value); return this; }
    /// Accepts `dstSubresource` with the given function.
    /// @param index the index of the struct buffer
    /// @param func the function
    /// @return `this`
    public VkImageBlit dstSubresourceAt(long index, Consumer<overrungl.vulkan.struct.VkImageSubresourceLayers> func) { func.accept(overrungl.vulkan.struct.VkImageSubresourceLayers.of(dstSubresourceAt(index))); return this; }

    /// {@return `dstOffsets` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment dstOffsetsAt(long index) { return dstOffsets(this.segment(), index); }
    /// Sets `dstOffsets` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkImageBlit dstOffsetsAt(long index, MemorySegment value) { dstOffsets(this.segment(), index, value); return this; }
    /// Accepts `dstOffsets` with the given function.
    /// @param index the index of the struct buffer
    /// @param func the function
    /// @return `this`
    public VkImageBlit dstOffsetsAt(long index, Consumer<overrungl.vulkan.struct.VkOffset3D> func) { func.accept(overrungl.vulkan.struct.VkOffset3D.of(dstOffsetsAt(index))); return this; }

}
