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
/// [VarHandle][#VH_pNext] - [Getter][#pNext()] - [Setter][#pNext(MemorySegment)]
/// ### bufferOffset
/// [VarHandle][#VH_bufferOffset] - [Getter][#bufferOffset()] - [Setter][#bufferOffset(long)]
/// ### bufferRowLength
/// [VarHandle][#VH_bufferRowLength] - [Getter][#bufferRowLength()] - [Setter][#bufferRowLength(int)]
/// ### bufferImageHeight
/// [VarHandle][#VH_bufferImageHeight] - [Getter][#bufferImageHeight()] - [Setter][#bufferImageHeight(int)]
/// ### imageSubresource
/// [Byte offset][#OFFSET_imageSubresource] - [Memory layout][#ML_imageSubresource] - [Getter][#imageSubresource()] - [Setter][#imageSubresource(MemorySegment)]
/// ### imageOffset
/// [Byte offset][#OFFSET_imageOffset] - [Memory layout][#ML_imageOffset] - [Getter][#imageOffset()] - [Setter][#imageOffset(MemorySegment)]
/// ### imageExtent
/// [Byte offset][#OFFSET_imageExtent] - [Memory layout][#ML_imageExtent] - [Getter][#imageExtent()] - [Setter][#imageExtent(MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkBufferImageCopy2 {
///     VkStructureType sType;
///     const void * pNext;
///     VkDeviceSize bufferOffset;
///     uint32_t bufferRowLength;
///     uint32_t bufferImageHeight;
///     VkImageSubresourceLayers imageSubresource;
///     VkOffset3D imageOffset;
///     VkExtent3D imageExtent;
/// } VkBufferImageCopy2;
/// ```
public sealed class VkBufferImageCopy2 extends Struct {
    /// The struct layout of `VkBufferImageCopy2`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("bufferOffset"),
        ValueLayout.JAVA_INT.withName("bufferRowLength"),
        ValueLayout.JAVA_INT.withName("bufferImageHeight"),
        overrungl.vulkan.struct.VkImageSubresourceLayers.LAYOUT.withName("imageSubresource"),
        overrungl.vulkan.struct.VkOffset3D.LAYOUT.withName("imageOffset"),
        overrungl.vulkan.struct.VkExtent3D.LAYOUT.withName("imageExtent")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `bufferOffset` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_bufferOffset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("bufferOffset"));
    /// The [VarHandle] of `bufferRowLength` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_bufferRowLength = LAYOUT.arrayElementVarHandle(PathElement.groupElement("bufferRowLength"));
    /// The [VarHandle] of `bufferImageHeight` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_bufferImageHeight = LAYOUT.arrayElementVarHandle(PathElement.groupElement("bufferImageHeight"));
    /// The byte offset of `imageSubresource`.
    public static final long OFFSET_imageSubresource = LAYOUT.byteOffset(PathElement.groupElement("imageSubresource"));
    /// The memory layout of `imageSubresource`.
    public static final MemoryLayout ML_imageSubresource = LAYOUT.select(PathElement.groupElement("imageSubresource"));
    /// The byte offset of `imageOffset`.
    public static final long OFFSET_imageOffset = LAYOUT.byteOffset(PathElement.groupElement("imageOffset"));
    /// The memory layout of `imageOffset`.
    public static final MemoryLayout ML_imageOffset = LAYOUT.select(PathElement.groupElement("imageOffset"));
    /// The byte offset of `imageExtent`.
    public static final long OFFSET_imageExtent = LAYOUT.byteOffset(PathElement.groupElement("imageExtent"));
    /// The memory layout of `imageExtent`.
    public static final MemoryLayout ML_imageExtent = LAYOUT.select(PathElement.groupElement("imageExtent"));

    /// Creates `VkBufferImageCopy2` with the given segment.
    /// @param segment the memory segment
    public VkBufferImageCopy2(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkBufferImageCopy2` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkBufferImageCopy2 of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkBufferImageCopy2(segment); }

    /// Creates `VkBufferImageCopy2` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkBufferImageCopy2` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkBufferImageCopy2 ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkBufferImageCopy2(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkBufferImageCopy2` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkBufferImageCopy2` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkBufferImageCopy2`
    public static VkBufferImageCopy2 alloc(SegmentAllocator allocator) { return new VkBufferImageCopy2(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkBufferImageCopy2` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkBufferImageCopy2`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkBufferImageCopy2` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkBufferImageCopy2`
    public static VkBufferImageCopy2 allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("const void *") MemorySegment pNext, @CType("VkDeviceSize") long bufferOffset, @CType("uint32_t") int bufferRowLength, @CType("uint32_t") int bufferImageHeight, @CType("VkImageSubresourceLayers") MemorySegment imageSubresource, @CType("VkOffset3D") MemorySegment imageOffset, @CType("VkExtent3D") MemorySegment imageExtent) { return alloc(allocator).sType(sType).pNext(pNext).bufferOffset(bufferOffset).bufferRowLength(bufferRowLength).bufferImageHeight(bufferImageHeight).imageSubresource(imageSubresource).imageOffset(imageOffset).imageExtent(imageExtent); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkBufferImageCopy2 copyFrom(VkBufferImageCopy2 src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkBufferImageCopy2.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkBufferImageCopy2.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkBufferImageCopy2.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBufferImageCopy2 sType(@CType("VkStructureType") int value) { VkBufferImageCopy2.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") MemorySegment get_pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") MemorySegment get_pNext(MemorySegment segment) { return VkBufferImageCopy2.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("const void *") MemorySegment pNext() { return VkBufferImageCopy2.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") MemorySegment value) { VkBufferImageCopy2.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBufferImageCopy2 pNext(@CType("const void *") MemorySegment value) { VkBufferImageCopy2.set_pNext(this.segment(), value); return this; }

    /// {@return `bufferOffset` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDeviceSize") long get_bufferOffset(MemorySegment segment, long index) { return (long) VH_bufferOffset.get(segment, 0L, index); }
    /// {@return `bufferOffset`}
    /// @param segment the segment of the struct
    public static @CType("VkDeviceSize") long get_bufferOffset(MemorySegment segment) { return VkBufferImageCopy2.get_bufferOffset(segment, 0L); }
    /// {@return `bufferOffset`}
    public @CType("VkDeviceSize") long bufferOffset() { return VkBufferImageCopy2.get_bufferOffset(this.segment()); }
    /// Sets `bufferOffset` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_bufferOffset(MemorySegment segment, long index, @CType("VkDeviceSize") long value) { VH_bufferOffset.set(segment, 0L, index, value); }
    /// Sets `bufferOffset` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_bufferOffset(MemorySegment segment, @CType("VkDeviceSize") long value) { VkBufferImageCopy2.set_bufferOffset(segment, 0L, value); }
    /// Sets `bufferOffset` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBufferImageCopy2 bufferOffset(@CType("VkDeviceSize") long value) { VkBufferImageCopy2.set_bufferOffset(this.segment(), value); return this; }

    /// {@return `bufferRowLength` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_bufferRowLength(MemorySegment segment, long index) { return (int) VH_bufferRowLength.get(segment, 0L, index); }
    /// {@return `bufferRowLength`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_bufferRowLength(MemorySegment segment) { return VkBufferImageCopy2.get_bufferRowLength(segment, 0L); }
    /// {@return `bufferRowLength`}
    public @CType("uint32_t") int bufferRowLength() { return VkBufferImageCopy2.get_bufferRowLength(this.segment()); }
    /// Sets `bufferRowLength` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_bufferRowLength(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_bufferRowLength.set(segment, 0L, index, value); }
    /// Sets `bufferRowLength` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_bufferRowLength(MemorySegment segment, @CType("uint32_t") int value) { VkBufferImageCopy2.set_bufferRowLength(segment, 0L, value); }
    /// Sets `bufferRowLength` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBufferImageCopy2 bufferRowLength(@CType("uint32_t") int value) { VkBufferImageCopy2.set_bufferRowLength(this.segment(), value); return this; }

    /// {@return `bufferImageHeight` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_bufferImageHeight(MemorySegment segment, long index) { return (int) VH_bufferImageHeight.get(segment, 0L, index); }
    /// {@return `bufferImageHeight`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_bufferImageHeight(MemorySegment segment) { return VkBufferImageCopy2.get_bufferImageHeight(segment, 0L); }
    /// {@return `bufferImageHeight`}
    public @CType("uint32_t") int bufferImageHeight() { return VkBufferImageCopy2.get_bufferImageHeight(this.segment()); }
    /// Sets `bufferImageHeight` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_bufferImageHeight(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_bufferImageHeight.set(segment, 0L, index, value); }
    /// Sets `bufferImageHeight` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_bufferImageHeight(MemorySegment segment, @CType("uint32_t") int value) { VkBufferImageCopy2.set_bufferImageHeight(segment, 0L, value); }
    /// Sets `bufferImageHeight` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBufferImageCopy2 bufferImageHeight(@CType("uint32_t") int value) { VkBufferImageCopy2.set_bufferImageHeight(this.segment(), value); return this; }

    /// {@return `imageSubresource` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkImageSubresourceLayers") MemorySegment get_imageSubresource(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_imageSubresource, index), ML_imageSubresource); }
    /// {@return `imageSubresource`}
    /// @param segment the segment of the struct
    public static @CType("VkImageSubresourceLayers") MemorySegment get_imageSubresource(MemorySegment segment) { return VkBufferImageCopy2.get_imageSubresource(segment, 0L); }
    /// {@return `imageSubresource`}
    public @CType("VkImageSubresourceLayers") MemorySegment imageSubresource() { return VkBufferImageCopy2.get_imageSubresource(this.segment()); }
    /// Sets `imageSubresource` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_imageSubresource(MemorySegment segment, long index, @CType("VkImageSubresourceLayers") MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_imageSubresource, index), ML_imageSubresource.byteSize()); }
    /// Sets `imageSubresource` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_imageSubresource(MemorySegment segment, @CType("VkImageSubresourceLayers") MemorySegment value) { VkBufferImageCopy2.set_imageSubresource(segment, 0L, value); }
    /// Sets `imageSubresource` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBufferImageCopy2 imageSubresource(@CType("VkImageSubresourceLayers") MemorySegment value) { VkBufferImageCopy2.set_imageSubresource(this.segment(), value); return this; }

    /// {@return `imageOffset` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkOffset3D") MemorySegment get_imageOffset(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_imageOffset, index), ML_imageOffset); }
    /// {@return `imageOffset`}
    /// @param segment the segment of the struct
    public static @CType("VkOffset3D") MemorySegment get_imageOffset(MemorySegment segment) { return VkBufferImageCopy2.get_imageOffset(segment, 0L); }
    /// {@return `imageOffset`}
    public @CType("VkOffset3D") MemorySegment imageOffset() { return VkBufferImageCopy2.get_imageOffset(this.segment()); }
    /// Sets `imageOffset` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_imageOffset(MemorySegment segment, long index, @CType("VkOffset3D") MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_imageOffset, index), ML_imageOffset.byteSize()); }
    /// Sets `imageOffset` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_imageOffset(MemorySegment segment, @CType("VkOffset3D") MemorySegment value) { VkBufferImageCopy2.set_imageOffset(segment, 0L, value); }
    /// Sets `imageOffset` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBufferImageCopy2 imageOffset(@CType("VkOffset3D") MemorySegment value) { VkBufferImageCopy2.set_imageOffset(this.segment(), value); return this; }

    /// {@return `imageExtent` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkExtent3D") MemorySegment get_imageExtent(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_imageExtent, index), ML_imageExtent); }
    /// {@return `imageExtent`}
    /// @param segment the segment of the struct
    public static @CType("VkExtent3D") MemorySegment get_imageExtent(MemorySegment segment) { return VkBufferImageCopy2.get_imageExtent(segment, 0L); }
    /// {@return `imageExtent`}
    public @CType("VkExtent3D") MemorySegment imageExtent() { return VkBufferImageCopy2.get_imageExtent(this.segment()); }
    /// Sets `imageExtent` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_imageExtent(MemorySegment segment, long index, @CType("VkExtent3D") MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_imageExtent, index), ML_imageExtent.byteSize()); }
    /// Sets `imageExtent` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_imageExtent(MemorySegment segment, @CType("VkExtent3D") MemorySegment value) { VkBufferImageCopy2.set_imageExtent(segment, 0L, value); }
    /// Sets `imageExtent` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBufferImageCopy2 imageExtent(@CType("VkExtent3D") MemorySegment value) { VkBufferImageCopy2.set_imageExtent(this.segment(), value); return this; }

    /// A buffer of [VkBufferImageCopy2].
    public static final class Buffer extends VkBufferImageCopy2 {
        private final long elementCount;

        /// Creates `VkBufferImageCopy2.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkBufferImageCopy2`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkBufferImageCopy2`
        public VkBufferImageCopy2 asSlice(long index) { return new VkBufferImageCopy2(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkBufferImageCopy2`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkBufferImageCopy2`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkBufferImageCopy2.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkBufferImageCopy2.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("const void *") MemorySegment pNextAt(long index) { return VkBufferImageCopy2.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("const void *") MemorySegment value) { VkBufferImageCopy2.set_pNext(this.segment(), index, value); return this; }

        /// {@return `bufferOffset` at the given index}
        /// @param index the index
        public @CType("VkDeviceSize") long bufferOffsetAt(long index) { return VkBufferImageCopy2.get_bufferOffset(this.segment(), index); }
        /// Sets `bufferOffset` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer bufferOffsetAt(long index, @CType("VkDeviceSize") long value) { VkBufferImageCopy2.set_bufferOffset(this.segment(), index, value); return this; }

        /// {@return `bufferRowLength` at the given index}
        /// @param index the index
        public @CType("uint32_t") int bufferRowLengthAt(long index) { return VkBufferImageCopy2.get_bufferRowLength(this.segment(), index); }
        /// Sets `bufferRowLength` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer bufferRowLengthAt(long index, @CType("uint32_t") int value) { VkBufferImageCopy2.set_bufferRowLength(this.segment(), index, value); return this; }

        /// {@return `bufferImageHeight` at the given index}
        /// @param index the index
        public @CType("uint32_t") int bufferImageHeightAt(long index) { return VkBufferImageCopy2.get_bufferImageHeight(this.segment(), index); }
        /// Sets `bufferImageHeight` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer bufferImageHeightAt(long index, @CType("uint32_t") int value) { VkBufferImageCopy2.set_bufferImageHeight(this.segment(), index, value); return this; }

        /// {@return `imageSubresource` at the given index}
        /// @param index the index
        public @CType("VkImageSubresourceLayers") MemorySegment imageSubresourceAt(long index) { return VkBufferImageCopy2.get_imageSubresource(this.segment(), index); }
        /// Sets `imageSubresource` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer imageSubresourceAt(long index, @CType("VkImageSubresourceLayers") MemorySegment value) { VkBufferImageCopy2.set_imageSubresource(this.segment(), index, value); return this; }

        /// {@return `imageOffset` at the given index}
        /// @param index the index
        public @CType("VkOffset3D") MemorySegment imageOffsetAt(long index) { return VkBufferImageCopy2.get_imageOffset(this.segment(), index); }
        /// Sets `imageOffset` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer imageOffsetAt(long index, @CType("VkOffset3D") MemorySegment value) { VkBufferImageCopy2.set_imageOffset(this.segment(), index, value); return this; }

        /// {@return `imageExtent` at the given index}
        /// @param index the index
        public @CType("VkExtent3D") MemorySegment imageExtentAt(long index) { return VkBufferImageCopy2.get_imageExtent(this.segment(), index); }
        /// Sets `imageExtent` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer imageExtentAt(long index, @CType("VkExtent3D") MemorySegment value) { VkBufferImageCopy2.set_imageExtent(this.segment(), index, value); return this; }

    }
}
