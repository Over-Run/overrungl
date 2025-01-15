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
/// ### sType
/// [VarHandle][#VH_sType] - [Getter][#sType()] - [Setter][#sType(int)]
/// ### pNext
/// [VarHandle][#VH_pNext] - [Getter][#pNext()] - [Setter][#pNext(java.lang.foreign.MemorySegment)]
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
/// typedef struct VkImageResolve2 {
///     VkStructureType sType;
///     const void * pNext;
///     VkImageSubresourceLayers srcSubresource;
///     VkOffset3D srcOffset;
///     VkImageSubresourceLayers dstSubresource;
///     VkOffset3D dstOffset;
///     VkExtent3D extent;
/// } VkImageResolve2;
/// ```
public sealed class VkImageResolve2 extends Struct {
    /// The struct layout of `VkImageResolve2`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        overrungl.vulkan.struct.VkImageSubresourceLayers.LAYOUT.withName("srcSubresource"),
        overrungl.vulkan.struct.VkOffset3D.LAYOUT.withName("srcOffset"),
        overrungl.vulkan.struct.VkImageSubresourceLayers.LAYOUT.withName("dstSubresource"),
        overrungl.vulkan.struct.VkOffset3D.LAYOUT.withName("dstOffset"),
        overrungl.vulkan.struct.VkExtent3D.LAYOUT.withName("extent")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
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

    /// Creates `VkImageResolve2` with the given segment.
    /// @param segment the memory segment
    public VkImageResolve2(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkImageResolve2` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkImageResolve2 of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkImageResolve2(segment); }

    /// Creates `VkImageResolve2` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkImageResolve2` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkImageResolve2 ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkImageResolve2(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkImageResolve2` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkImageResolve2` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkImageResolve2`
    public static VkImageResolve2 alloc(SegmentAllocator allocator) { return new VkImageResolve2(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkImageResolve2` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkImageResolve2`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkImageResolve2` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkImageResolve2`
    public static VkImageResolve2 allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("const void *") java.lang.foreign.MemorySegment pNext, @CType("VkImageSubresourceLayers") java.lang.foreign.MemorySegment srcSubresource, @CType("VkOffset3D") java.lang.foreign.MemorySegment srcOffset, @CType("VkImageSubresourceLayers") java.lang.foreign.MemorySegment dstSubresource, @CType("VkOffset3D") java.lang.foreign.MemorySegment dstOffset, @CType("VkExtent3D") java.lang.foreign.MemorySegment extent) { return alloc(allocator).sType(sType).pNext(pNext).srcSubresource(srcSubresource).srcOffset(srcOffset).dstSubresource(dstSubresource).dstOffset(dstOffset).extent(extent); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkImageResolve2 copyFrom(VkImageResolve2 src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkImageResolve2.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkImageResolve2.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkImageResolve2.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageResolve2 sType(@CType("VkStructureType") int value) { VkImageResolve2.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkImageResolve2.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkImageResolve2.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkImageResolve2.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageResolve2 pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkImageResolve2.set_pNext(this.segment(), value); return this; }

    /// {@return `srcSubresource` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkImageSubresourceLayers") java.lang.foreign.MemorySegment get_srcSubresource(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_srcSubresource, index), ML_srcSubresource); }
    /// {@return `srcSubresource`}
    /// @param segment the segment of the struct
    public static @CType("VkImageSubresourceLayers") java.lang.foreign.MemorySegment get_srcSubresource(MemorySegment segment) { return VkImageResolve2.get_srcSubresource(segment, 0L); }
    /// {@return `srcSubresource`}
    public @CType("VkImageSubresourceLayers") java.lang.foreign.MemorySegment srcSubresource() { return VkImageResolve2.get_srcSubresource(this.segment()); }
    /// Sets `srcSubresource` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_srcSubresource(MemorySegment segment, long index, @CType("VkImageSubresourceLayers") java.lang.foreign.MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_srcSubresource, index), ML_srcSubresource.byteSize()); }
    /// Sets `srcSubresource` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_srcSubresource(MemorySegment segment, @CType("VkImageSubresourceLayers") java.lang.foreign.MemorySegment value) { VkImageResolve2.set_srcSubresource(segment, 0L, value); }
    /// Sets `srcSubresource` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageResolve2 srcSubresource(@CType("VkImageSubresourceLayers") java.lang.foreign.MemorySegment value) { VkImageResolve2.set_srcSubresource(this.segment(), value); return this; }

    /// {@return `srcOffset` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkOffset3D") java.lang.foreign.MemorySegment get_srcOffset(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_srcOffset, index), ML_srcOffset); }
    /// {@return `srcOffset`}
    /// @param segment the segment of the struct
    public static @CType("VkOffset3D") java.lang.foreign.MemorySegment get_srcOffset(MemorySegment segment) { return VkImageResolve2.get_srcOffset(segment, 0L); }
    /// {@return `srcOffset`}
    public @CType("VkOffset3D") java.lang.foreign.MemorySegment srcOffset() { return VkImageResolve2.get_srcOffset(this.segment()); }
    /// Sets `srcOffset` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_srcOffset(MemorySegment segment, long index, @CType("VkOffset3D") java.lang.foreign.MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_srcOffset, index), ML_srcOffset.byteSize()); }
    /// Sets `srcOffset` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_srcOffset(MemorySegment segment, @CType("VkOffset3D") java.lang.foreign.MemorySegment value) { VkImageResolve2.set_srcOffset(segment, 0L, value); }
    /// Sets `srcOffset` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageResolve2 srcOffset(@CType("VkOffset3D") java.lang.foreign.MemorySegment value) { VkImageResolve2.set_srcOffset(this.segment(), value); return this; }

    /// {@return `dstSubresource` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkImageSubresourceLayers") java.lang.foreign.MemorySegment get_dstSubresource(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_dstSubresource, index), ML_dstSubresource); }
    /// {@return `dstSubresource`}
    /// @param segment the segment of the struct
    public static @CType("VkImageSubresourceLayers") java.lang.foreign.MemorySegment get_dstSubresource(MemorySegment segment) { return VkImageResolve2.get_dstSubresource(segment, 0L); }
    /// {@return `dstSubresource`}
    public @CType("VkImageSubresourceLayers") java.lang.foreign.MemorySegment dstSubresource() { return VkImageResolve2.get_dstSubresource(this.segment()); }
    /// Sets `dstSubresource` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_dstSubresource(MemorySegment segment, long index, @CType("VkImageSubresourceLayers") java.lang.foreign.MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_dstSubresource, index), ML_dstSubresource.byteSize()); }
    /// Sets `dstSubresource` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_dstSubresource(MemorySegment segment, @CType("VkImageSubresourceLayers") java.lang.foreign.MemorySegment value) { VkImageResolve2.set_dstSubresource(segment, 0L, value); }
    /// Sets `dstSubresource` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageResolve2 dstSubresource(@CType("VkImageSubresourceLayers") java.lang.foreign.MemorySegment value) { VkImageResolve2.set_dstSubresource(this.segment(), value); return this; }

    /// {@return `dstOffset` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkOffset3D") java.lang.foreign.MemorySegment get_dstOffset(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_dstOffset, index), ML_dstOffset); }
    /// {@return `dstOffset`}
    /// @param segment the segment of the struct
    public static @CType("VkOffset3D") java.lang.foreign.MemorySegment get_dstOffset(MemorySegment segment) { return VkImageResolve2.get_dstOffset(segment, 0L); }
    /// {@return `dstOffset`}
    public @CType("VkOffset3D") java.lang.foreign.MemorySegment dstOffset() { return VkImageResolve2.get_dstOffset(this.segment()); }
    /// Sets `dstOffset` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_dstOffset(MemorySegment segment, long index, @CType("VkOffset3D") java.lang.foreign.MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_dstOffset, index), ML_dstOffset.byteSize()); }
    /// Sets `dstOffset` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_dstOffset(MemorySegment segment, @CType("VkOffset3D") java.lang.foreign.MemorySegment value) { VkImageResolve2.set_dstOffset(segment, 0L, value); }
    /// Sets `dstOffset` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageResolve2 dstOffset(@CType("VkOffset3D") java.lang.foreign.MemorySegment value) { VkImageResolve2.set_dstOffset(this.segment(), value); return this; }

    /// {@return `extent` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkExtent3D") java.lang.foreign.MemorySegment get_extent(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_extent, index), ML_extent); }
    /// {@return `extent`}
    /// @param segment the segment of the struct
    public static @CType("VkExtent3D") java.lang.foreign.MemorySegment get_extent(MemorySegment segment) { return VkImageResolve2.get_extent(segment, 0L); }
    /// {@return `extent`}
    public @CType("VkExtent3D") java.lang.foreign.MemorySegment extent() { return VkImageResolve2.get_extent(this.segment()); }
    /// Sets `extent` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_extent(MemorySegment segment, long index, @CType("VkExtent3D") java.lang.foreign.MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_extent, index), ML_extent.byteSize()); }
    /// Sets `extent` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_extent(MemorySegment segment, @CType("VkExtent3D") java.lang.foreign.MemorySegment value) { VkImageResolve2.set_extent(segment, 0L, value); }
    /// Sets `extent` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageResolve2 extent(@CType("VkExtent3D") java.lang.foreign.MemorySegment value) { VkImageResolve2.set_extent(this.segment(), value); return this; }

    /// A buffer of [VkImageResolve2].
    public static final class Buffer extends VkImageResolve2 {
        private final long elementCount;

        /// Creates `VkImageResolve2.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkImageResolve2`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkImageResolve2`
        public VkImageResolve2 asSlice(long index) { return new VkImageResolve2(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkImageResolve2`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkImageResolve2`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkImageResolve2.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkImageResolve2.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkImageResolve2.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkImageResolve2.set_pNext(this.segment(), index, value); return this; }

        /// {@return `srcSubresource` at the given index}
        /// @param index the index
        public @CType("VkImageSubresourceLayers") java.lang.foreign.MemorySegment srcSubresourceAt(long index) { return VkImageResolve2.get_srcSubresource(this.segment(), index); }
        /// Sets `srcSubresource` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer srcSubresourceAt(long index, @CType("VkImageSubresourceLayers") java.lang.foreign.MemorySegment value) { VkImageResolve2.set_srcSubresource(this.segment(), index, value); return this; }

        /// {@return `srcOffset` at the given index}
        /// @param index the index
        public @CType("VkOffset3D") java.lang.foreign.MemorySegment srcOffsetAt(long index) { return VkImageResolve2.get_srcOffset(this.segment(), index); }
        /// Sets `srcOffset` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer srcOffsetAt(long index, @CType("VkOffset3D") java.lang.foreign.MemorySegment value) { VkImageResolve2.set_srcOffset(this.segment(), index, value); return this; }

        /// {@return `dstSubresource` at the given index}
        /// @param index the index
        public @CType("VkImageSubresourceLayers") java.lang.foreign.MemorySegment dstSubresourceAt(long index) { return VkImageResolve2.get_dstSubresource(this.segment(), index); }
        /// Sets `dstSubresource` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer dstSubresourceAt(long index, @CType("VkImageSubresourceLayers") java.lang.foreign.MemorySegment value) { VkImageResolve2.set_dstSubresource(this.segment(), index, value); return this; }

        /// {@return `dstOffset` at the given index}
        /// @param index the index
        public @CType("VkOffset3D") java.lang.foreign.MemorySegment dstOffsetAt(long index) { return VkImageResolve2.get_dstOffset(this.segment(), index); }
        /// Sets `dstOffset` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer dstOffsetAt(long index, @CType("VkOffset3D") java.lang.foreign.MemorySegment value) { VkImageResolve2.set_dstOffset(this.segment(), index, value); return this; }

        /// {@return `extent` at the given index}
        /// @param index the index
        public @CType("VkExtent3D") java.lang.foreign.MemorySegment extentAt(long index) { return VkImageResolve2.get_extent(this.segment(), index); }
        /// Sets `extent` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer extentAt(long index, @CType("VkExtent3D") java.lang.foreign.MemorySegment value) { VkImageResolve2.set_extent(this.segment(), index, value); return this; }

    }
}
