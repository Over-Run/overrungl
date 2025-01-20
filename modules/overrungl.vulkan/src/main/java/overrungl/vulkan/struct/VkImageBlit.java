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
/// [Byte offset][#OFFSET_srcSubresource] - [Memory layout][#ML_srcSubresource] - [Getter][#srcSubresource()] - [Setter][#srcSubresource(MemorySegment)]
/// ### srcOffsets
/// [Byte offset][#OFFSET_srcOffsets] - [Memory layout][#ML_srcOffsets] - [Getter][#srcOffsets()] - [Setter][#srcOffsets(MemorySegment)]
/// ### dstSubresource
/// [Byte offset][#OFFSET_dstSubresource] - [Memory layout][#ML_dstSubresource] - [Getter][#dstSubresource()] - [Setter][#dstSubresource(MemorySegment)]
/// ### dstOffsets
/// [Byte offset][#OFFSET_dstOffsets] - [Memory layout][#ML_dstOffsets] - [Getter][#dstOffsets()] - [Setter][#dstOffsets(MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkImageBlit {
///     VkImageSubresourceLayers srcSubresource;
///     VkOffset3D[2] srcOffsets;
///     VkImageSubresourceLayers dstSubresource;
///     VkOffset3D[2] dstOffsets;
/// } VkImageBlit;
/// ```
public sealed class VkImageBlit extends Struct {
    /// The struct layout of `VkImageBlit`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        overrungl.vulkan.struct.VkImageSubresourceLayers.LAYOUT.withName("srcSubresource"),
        MemoryLayout.sequenceLayout(2, VkOffset3D.LAYOUT).withName("srcOffsets"),
        overrungl.vulkan.struct.VkImageSubresourceLayers.LAYOUT.withName("dstSubresource"),
        MemoryLayout.sequenceLayout(2, VkOffset3D.LAYOUT).withName("dstOffsets")
    );
    /// The byte offset of `srcSubresource`.
    public static final long OFFSET_srcSubresource = LAYOUT.byteOffset(PathElement.groupElement("srcSubresource"));
    /// The memory layout of `srcSubresource`.
    public static final MemoryLayout ML_srcSubresource = LAYOUT.select(PathElement.groupElement("srcSubresource"));
    /// The byte offset of `srcOffsets`.
    public static final long OFFSET_srcOffsets = LAYOUT.byteOffset(PathElement.groupElement("srcOffsets"));
    /// The memory layout of `srcOffsets`.
    public static final MemoryLayout ML_srcOffsets = LAYOUT.select(PathElement.groupElement("srcOffsets"));
    /// The byte offset of `dstSubresource`.
    public static final long OFFSET_dstSubresource = LAYOUT.byteOffset(PathElement.groupElement("dstSubresource"));
    /// The memory layout of `dstSubresource`.
    public static final MemoryLayout ML_dstSubresource = LAYOUT.select(PathElement.groupElement("dstSubresource"));
    /// The byte offset of `dstOffsets`.
    public static final long OFFSET_dstOffsets = LAYOUT.byteOffset(PathElement.groupElement("dstOffsets"));
    /// The memory layout of `dstOffsets`.
    public static final MemoryLayout ML_dstOffsets = LAYOUT.select(PathElement.groupElement("dstOffsets"));

    /// Creates `VkImageBlit` with the given segment.
    /// @param segment the memory segment
    public VkImageBlit(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkImageBlit` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkImageBlit of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkImageBlit(segment); }

    /// Creates `VkImageBlit` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkImageBlit` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkImageBlit ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkImageBlit(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkImageBlit` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkImageBlit` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkImageBlit`
    public static VkImageBlit alloc(SegmentAllocator allocator) { return new VkImageBlit(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkImageBlit` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkImageBlit`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkImageBlit` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkImageBlit`
    public static VkImageBlit allocInit(SegmentAllocator allocator, @CType("VkImageSubresourceLayers") MemorySegment srcSubresource, @CType("VkOffset3D[2]") MemorySegment srcOffsets, @CType("VkImageSubresourceLayers") MemorySegment dstSubresource, @CType("VkOffset3D[2]") MemorySegment dstOffsets) { return alloc(allocator).srcSubresource(srcSubresource).srcOffsets(srcOffsets).dstSubresource(dstSubresource).dstOffsets(dstOffsets); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkImageBlit copyFrom(VkImageBlit src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `srcSubresource` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkImageSubresourceLayers") MemorySegment get_srcSubresource(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_srcSubresource, index), ML_srcSubresource); }
    /// {@return `srcSubresource`}
    /// @param segment the segment of the struct
    public static @CType("VkImageSubresourceLayers") MemorySegment get_srcSubresource(MemorySegment segment) { return VkImageBlit.get_srcSubresource(segment, 0L); }
    /// {@return `srcSubresource`}
    public @CType("VkImageSubresourceLayers") MemorySegment srcSubresource() { return VkImageBlit.get_srcSubresource(this.segment()); }
    /// Sets `srcSubresource` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_srcSubresource(MemorySegment segment, long index, @CType("VkImageSubresourceLayers") MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_srcSubresource, index), ML_srcSubresource.byteSize()); }
    /// Sets `srcSubresource` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_srcSubresource(MemorySegment segment, @CType("VkImageSubresourceLayers") MemorySegment value) { VkImageBlit.set_srcSubresource(segment, 0L, value); }
    /// Sets `srcSubresource` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageBlit srcSubresource(@CType("VkImageSubresourceLayers") MemorySegment value) { VkImageBlit.set_srcSubresource(this.segment(), value); return this; }

    /// {@return `srcOffsets` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkOffset3D[2]") MemorySegment get_srcOffsets(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_srcOffsets, index), ML_srcOffsets); }
    /// {@return `srcOffsets`}
    /// @param segment the segment of the struct
    public static @CType("VkOffset3D[2]") MemorySegment get_srcOffsets(MemorySegment segment) { return VkImageBlit.get_srcOffsets(segment, 0L); }
    /// {@return `srcOffsets`}
    public @CType("VkOffset3D[2]") MemorySegment srcOffsets() { return VkImageBlit.get_srcOffsets(this.segment()); }
    /// Sets `srcOffsets` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_srcOffsets(MemorySegment segment, long index, @CType("VkOffset3D[2]") MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_srcOffsets, index), ML_srcOffsets.byteSize()); }
    /// Sets `srcOffsets` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_srcOffsets(MemorySegment segment, @CType("VkOffset3D[2]") MemorySegment value) { VkImageBlit.set_srcOffsets(segment, 0L, value); }
    /// Sets `srcOffsets` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageBlit srcOffsets(@CType("VkOffset3D[2]") MemorySegment value) { VkImageBlit.set_srcOffsets(this.segment(), value); return this; }

    /// {@return `dstSubresource` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkImageSubresourceLayers") MemorySegment get_dstSubresource(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_dstSubresource, index), ML_dstSubresource); }
    /// {@return `dstSubresource`}
    /// @param segment the segment of the struct
    public static @CType("VkImageSubresourceLayers") MemorySegment get_dstSubresource(MemorySegment segment) { return VkImageBlit.get_dstSubresource(segment, 0L); }
    /// {@return `dstSubresource`}
    public @CType("VkImageSubresourceLayers") MemorySegment dstSubresource() { return VkImageBlit.get_dstSubresource(this.segment()); }
    /// Sets `dstSubresource` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_dstSubresource(MemorySegment segment, long index, @CType("VkImageSubresourceLayers") MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_dstSubresource, index), ML_dstSubresource.byteSize()); }
    /// Sets `dstSubresource` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_dstSubresource(MemorySegment segment, @CType("VkImageSubresourceLayers") MemorySegment value) { VkImageBlit.set_dstSubresource(segment, 0L, value); }
    /// Sets `dstSubresource` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageBlit dstSubresource(@CType("VkImageSubresourceLayers") MemorySegment value) { VkImageBlit.set_dstSubresource(this.segment(), value); return this; }

    /// {@return `dstOffsets` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkOffset3D[2]") MemorySegment get_dstOffsets(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_dstOffsets, index), ML_dstOffsets); }
    /// {@return `dstOffsets`}
    /// @param segment the segment of the struct
    public static @CType("VkOffset3D[2]") MemorySegment get_dstOffsets(MemorySegment segment) { return VkImageBlit.get_dstOffsets(segment, 0L); }
    /// {@return `dstOffsets`}
    public @CType("VkOffset3D[2]") MemorySegment dstOffsets() { return VkImageBlit.get_dstOffsets(this.segment()); }
    /// Sets `dstOffsets` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_dstOffsets(MemorySegment segment, long index, @CType("VkOffset3D[2]") MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_dstOffsets, index), ML_dstOffsets.byteSize()); }
    /// Sets `dstOffsets` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_dstOffsets(MemorySegment segment, @CType("VkOffset3D[2]") MemorySegment value) { VkImageBlit.set_dstOffsets(segment, 0L, value); }
    /// Sets `dstOffsets` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageBlit dstOffsets(@CType("VkOffset3D[2]") MemorySegment value) { VkImageBlit.set_dstOffsets(this.segment(), value); return this; }

    /// A buffer of [VkImageBlit].
    public static final class Buffer extends VkImageBlit {
        private final long elementCount;

        /// Creates `VkImageBlit.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkImageBlit`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkImageBlit`
        public VkImageBlit asSlice(long index) { return new VkImageBlit(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkImageBlit`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkImageBlit`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `srcSubresource` at the given index}
        /// @param index the index
        public @CType("VkImageSubresourceLayers") MemorySegment srcSubresourceAt(long index) { return VkImageBlit.get_srcSubresource(this.segment(), index); }
        /// Sets `srcSubresource` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer srcSubresourceAt(long index, @CType("VkImageSubresourceLayers") MemorySegment value) { VkImageBlit.set_srcSubresource(this.segment(), index, value); return this; }

        /// {@return `srcOffsets` at the given index}
        /// @param index the index
        public @CType("VkOffset3D[2]") MemorySegment srcOffsetsAt(long index) { return VkImageBlit.get_srcOffsets(this.segment(), index); }
        /// Sets `srcOffsets` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer srcOffsetsAt(long index, @CType("VkOffset3D[2]") MemorySegment value) { VkImageBlit.set_srcOffsets(this.segment(), index, value); return this; }

        /// {@return `dstSubresource` at the given index}
        /// @param index the index
        public @CType("VkImageSubresourceLayers") MemorySegment dstSubresourceAt(long index) { return VkImageBlit.get_dstSubresource(this.segment(), index); }
        /// Sets `dstSubresource` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer dstSubresourceAt(long index, @CType("VkImageSubresourceLayers") MemorySegment value) { VkImageBlit.set_dstSubresource(this.segment(), index, value); return this; }

        /// {@return `dstOffsets` at the given index}
        /// @param index the index
        public @CType("VkOffset3D[2]") MemorySegment dstOffsetsAt(long index) { return VkImageBlit.get_dstOffsets(this.segment(), index); }
        /// Sets `dstOffsets` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer dstOffsetsAt(long index, @CType("VkOffset3D[2]") MemorySegment value) { VkImageBlit.set_dstOffsets(this.segment(), index, value); return this; }

    }
}
