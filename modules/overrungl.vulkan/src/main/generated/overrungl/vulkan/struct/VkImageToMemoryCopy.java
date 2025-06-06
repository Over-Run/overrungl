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
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkImageToMemoryCopy {
///     (int) VkStructureType sType;
///     const void* pNext;
///     void* pHostPointer;
///     uint32_t memoryRowLength;
///     uint32_t memoryImageHeight;
///     (struct VkImageSubresourceLayers) VkImageSubresourceLayers imageSubresource;
///     (struct VkOffset3D) VkOffset3D imageOffset;
///     (struct VkExtent3D) VkExtent3D imageExtent;
/// };
/// ```
public sealed class VkImageToMemoryCopy extends GroupType {
    /// The struct layout of `VkImageToMemoryCopy`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("pHostPointer"),
        ValueLayout.JAVA_INT.withName("memoryRowLength"),
        ValueLayout.JAVA_INT.withName("memoryImageHeight"),
        overrungl.vulkan.struct.VkImageSubresourceLayers.LAYOUT.withName("imageSubresource"),
        overrungl.vulkan.struct.VkOffset3D.LAYOUT.withName("imageOffset"),
        overrungl.vulkan.struct.VkExtent3D.LAYOUT.withName("imageExtent")
    );
    /// The byte offset of `sType`.
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    /// The memory layout of `sType`.
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The byte offset of `pNext`.
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    /// The memory layout of `pNext`.
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The byte offset of `pHostPointer`.
    public static final long OFFSET_pHostPointer = LAYOUT.byteOffset(PathElement.groupElement("pHostPointer"));
    /// The memory layout of `pHostPointer`.
    public static final MemoryLayout LAYOUT_pHostPointer = LAYOUT.select(PathElement.groupElement("pHostPointer"));
    /// The [VarHandle] of `pHostPointer` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pHostPointer = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pHostPointer"));
    /// The byte offset of `memoryRowLength`.
    public static final long OFFSET_memoryRowLength = LAYOUT.byteOffset(PathElement.groupElement("memoryRowLength"));
    /// The memory layout of `memoryRowLength`.
    public static final MemoryLayout LAYOUT_memoryRowLength = LAYOUT.select(PathElement.groupElement("memoryRowLength"));
    /// The [VarHandle] of `memoryRowLength` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_memoryRowLength = LAYOUT.arrayElementVarHandle(PathElement.groupElement("memoryRowLength"));
    /// The byte offset of `memoryImageHeight`.
    public static final long OFFSET_memoryImageHeight = LAYOUT.byteOffset(PathElement.groupElement("memoryImageHeight"));
    /// The memory layout of `memoryImageHeight`.
    public static final MemoryLayout LAYOUT_memoryImageHeight = LAYOUT.select(PathElement.groupElement("memoryImageHeight"));
    /// The [VarHandle] of `memoryImageHeight` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_memoryImageHeight = LAYOUT.arrayElementVarHandle(PathElement.groupElement("memoryImageHeight"));
    /// The byte offset of `imageSubresource`.
    public static final long OFFSET_imageSubresource = LAYOUT.byteOffset(PathElement.groupElement("imageSubresource"));
    /// The memory layout of `imageSubresource`.
    public static final MemoryLayout LAYOUT_imageSubresource = LAYOUT.select(PathElement.groupElement("imageSubresource"));
    /// The byte offset of `imageOffset`.
    public static final long OFFSET_imageOffset = LAYOUT.byteOffset(PathElement.groupElement("imageOffset"));
    /// The memory layout of `imageOffset`.
    public static final MemoryLayout LAYOUT_imageOffset = LAYOUT.select(PathElement.groupElement("imageOffset"));
    /// The byte offset of `imageExtent`.
    public static final long OFFSET_imageExtent = LAYOUT.byteOffset(PathElement.groupElement("imageExtent"));
    /// The memory layout of `imageExtent`.
    public static final MemoryLayout LAYOUT_imageExtent = LAYOUT.select(PathElement.groupElement("imageExtent"));

    /// Creates `VkImageToMemoryCopy` with the given segment.
    /// @param segment the memory segment
    public VkImageToMemoryCopy(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkImageToMemoryCopy` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkImageToMemoryCopy` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkImageToMemoryCopy ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkImageToMemoryCopy(segment.reinterpret(LAYOUT.byteSize())); }

    /// Creates `VkImageToMemoryCopy` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkImageToMemoryCopy` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkImageToMemoryCopy`
    public static VkImageToMemoryCopy alloc(SegmentAllocator allocator) { return new VkImageToMemoryCopy(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkImageToMemoryCopy` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkImageToMemoryCopy`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkImageToMemoryCopy` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param pHostPointer `pHostPointer`
    /// @param memoryRowLength `memoryRowLength`
    /// @param memoryImageHeight `memoryImageHeight`
    /// @param imageSubresource `imageSubresource`
    /// @param imageOffset `imageOffset`
    /// @param imageExtent `imageExtent`
    /// @return the allocated `VkImageToMemoryCopy`
    public static VkImageToMemoryCopy allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, MemorySegment pHostPointer, int memoryRowLength, int memoryImageHeight, MemorySegment imageSubresource, MemorySegment imageOffset, MemorySegment imageExtent) {
        return alloc(allocator).sType(sType).pNext(pNext).pHostPointer(pHostPointer).memoryRowLength(memoryRowLength).memoryImageHeight(memoryImageHeight).imageSubresource(imageSubresource).imageOffset(imageOffset).imageExtent(imageExtent);
    }

    /// Allocates a `VkImageToMemoryCopy` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param pHostPointer `pHostPointer`
    /// @param memoryRowLength `memoryRowLength`
    /// @param memoryImageHeight `memoryImageHeight`
    /// @param imageSubresource `imageSubresource`
    /// @param imageOffset `imageOffset`
    /// @return the allocated `VkImageToMemoryCopy`
    public static VkImageToMemoryCopy allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, MemorySegment pHostPointer, int memoryRowLength, int memoryImageHeight, MemorySegment imageSubresource, MemorySegment imageOffset) {
        return alloc(allocator).sType(sType).pNext(pNext).pHostPointer(pHostPointer).memoryRowLength(memoryRowLength).memoryImageHeight(memoryImageHeight).imageSubresource(imageSubresource).imageOffset(imageOffset);
    }

    /// Allocates a `VkImageToMemoryCopy` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param pHostPointer `pHostPointer`
    /// @param memoryRowLength `memoryRowLength`
    /// @param memoryImageHeight `memoryImageHeight`
    /// @param imageSubresource `imageSubresource`
    /// @return the allocated `VkImageToMemoryCopy`
    public static VkImageToMemoryCopy allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, MemorySegment pHostPointer, int memoryRowLength, int memoryImageHeight, MemorySegment imageSubresource) {
        return alloc(allocator).sType(sType).pNext(pNext).pHostPointer(pHostPointer).memoryRowLength(memoryRowLength).memoryImageHeight(memoryImageHeight).imageSubresource(imageSubresource);
    }

    /// Allocates a `VkImageToMemoryCopy` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param pHostPointer `pHostPointer`
    /// @param memoryRowLength `memoryRowLength`
    /// @param memoryImageHeight `memoryImageHeight`
    /// @return the allocated `VkImageToMemoryCopy`
    public static VkImageToMemoryCopy allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, MemorySegment pHostPointer, int memoryRowLength, int memoryImageHeight) {
        return alloc(allocator).sType(sType).pNext(pNext).pHostPointer(pHostPointer).memoryRowLength(memoryRowLength).memoryImageHeight(memoryImageHeight);
    }

    /// Allocates a `VkImageToMemoryCopy` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param pHostPointer `pHostPointer`
    /// @param memoryRowLength `memoryRowLength`
    /// @return the allocated `VkImageToMemoryCopy`
    public static VkImageToMemoryCopy allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, MemorySegment pHostPointer, int memoryRowLength) {
        return alloc(allocator).sType(sType).pNext(pNext).pHostPointer(pHostPointer).memoryRowLength(memoryRowLength);
    }

    /// Allocates a `VkImageToMemoryCopy` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param pHostPointer `pHostPointer`
    /// @return the allocated `VkImageToMemoryCopy`
    public static VkImageToMemoryCopy allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, MemorySegment pHostPointer) {
        return alloc(allocator).sType(sType).pNext(pNext).pHostPointer(pHostPointer);
    }

    /// Allocates a `VkImageToMemoryCopy` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @return the allocated `VkImageToMemoryCopy`
    public static VkImageToMemoryCopy allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext) {
        return alloc(allocator).sType(sType).pNext(pNext);
    }

    /// Allocates a `VkImageToMemoryCopy` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @return the allocated `VkImageToMemoryCopy`
    public static VkImageToMemoryCopy allocInit(SegmentAllocator allocator, int sType) {
        return alloc(allocator).sType(sType);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkImageToMemoryCopy copyFrom(VkImageToMemoryCopy src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { if (this instanceof Buffer buf) return buf; else return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    public int sType() { return sType(this.segment(), 0L); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void sType(MemorySegment segment, long index, int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageToMemoryCopy sType(int value) { sType(this.segment(), 0L, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    public MemorySegment pNext() { return pNext(this.segment(), 0L); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pNext(MemorySegment segment, long index, MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageToMemoryCopy pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `pHostPointer` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pHostPointer(MemorySegment segment, long index) { return (MemorySegment) VH_pHostPointer.get(segment, 0L, index); }
    /// {@return `pHostPointer`}
    public MemorySegment pHostPointer() { return pHostPointer(this.segment(), 0L); }
    /// Sets `pHostPointer` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pHostPointer(MemorySegment segment, long index, MemorySegment value) { VH_pHostPointer.set(segment, 0L, index, value); }
    /// Sets `pHostPointer` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageToMemoryCopy pHostPointer(MemorySegment value) { pHostPointer(this.segment(), 0L, value); return this; }

    /// {@return `memoryRowLength` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int memoryRowLength(MemorySegment segment, long index) { return (int) VH_memoryRowLength.get(segment, 0L, index); }
    /// {@return `memoryRowLength`}
    public int memoryRowLength() { return memoryRowLength(this.segment(), 0L); }
    /// Sets `memoryRowLength` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void memoryRowLength(MemorySegment segment, long index, int value) { VH_memoryRowLength.set(segment, 0L, index, value); }
    /// Sets `memoryRowLength` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageToMemoryCopy memoryRowLength(int value) { memoryRowLength(this.segment(), 0L, value); return this; }

    /// {@return `memoryImageHeight` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int memoryImageHeight(MemorySegment segment, long index) { return (int) VH_memoryImageHeight.get(segment, 0L, index); }
    /// {@return `memoryImageHeight`}
    public int memoryImageHeight() { return memoryImageHeight(this.segment(), 0L); }
    /// Sets `memoryImageHeight` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void memoryImageHeight(MemorySegment segment, long index, int value) { VH_memoryImageHeight.set(segment, 0L, index, value); }
    /// Sets `memoryImageHeight` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageToMemoryCopy memoryImageHeight(int value) { memoryImageHeight(this.segment(), 0L, value); return this; }

    /// {@return `imageSubresource` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment imageSubresource(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_imageSubresource, index), LAYOUT_imageSubresource); }
    /// {@return `imageSubresource`}
    public MemorySegment imageSubresource() { return imageSubresource(this.segment(), 0L); }
    /// Sets `imageSubresource` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void imageSubresource(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_imageSubresource, index), LAYOUT_imageSubresource.byteSize()); }
    /// Sets `imageSubresource` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageToMemoryCopy imageSubresource(MemorySegment value) { imageSubresource(this.segment(), 0L, value); return this; }

    /// {@return `imageOffset` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment imageOffset(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_imageOffset, index), LAYOUT_imageOffset); }
    /// {@return `imageOffset`}
    public MemorySegment imageOffset() { return imageOffset(this.segment(), 0L); }
    /// Sets `imageOffset` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void imageOffset(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_imageOffset, index), LAYOUT_imageOffset.byteSize()); }
    /// Sets `imageOffset` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageToMemoryCopy imageOffset(MemorySegment value) { imageOffset(this.segment(), 0L, value); return this; }

    /// {@return `imageExtent` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment imageExtent(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_imageExtent, index), LAYOUT_imageExtent); }
    /// {@return `imageExtent`}
    public MemorySegment imageExtent() { return imageExtent(this.segment(), 0L); }
    /// Sets `imageExtent` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void imageExtent(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_imageExtent, index), LAYOUT_imageExtent.byteSize()); }
    /// Sets `imageExtent` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageToMemoryCopy imageExtent(MemorySegment value) { imageExtent(this.segment(), 0L, value); return this; }

    /// A buffer of [VkImageToMemoryCopy].
    public static final class Buffer extends VkImageToMemoryCopy {
        private final long elementCount;

        /// Creates `VkImageToMemoryCopy.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkImageToMemoryCopy`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkImageToMemoryCopy`
        public VkImageToMemoryCopy asSlice(long index) { return new VkImageToMemoryCopy(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkImageToMemoryCopy`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkImageToMemoryCopy`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index of the struct buffer
        public int sTypeAt(long index) { return sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

        /// {@return `pHostPointer` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment pHostPointerAt(long index) { return pHostPointer(this.segment(), index); }
        /// Sets `pHostPointer` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer pHostPointerAt(long index, MemorySegment value) { pHostPointer(this.segment(), index, value); return this; }

        /// {@return `memoryRowLength` at the given index}
        /// @param index the index of the struct buffer
        public int memoryRowLengthAt(long index) { return memoryRowLength(this.segment(), index); }
        /// Sets `memoryRowLength` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer memoryRowLengthAt(long index, int value) { memoryRowLength(this.segment(), index, value); return this; }

        /// {@return `memoryImageHeight` at the given index}
        /// @param index the index of the struct buffer
        public int memoryImageHeightAt(long index) { return memoryImageHeight(this.segment(), index); }
        /// Sets `memoryImageHeight` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer memoryImageHeightAt(long index, int value) { memoryImageHeight(this.segment(), index, value); return this; }

        /// {@return `imageSubresource` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment imageSubresourceAt(long index) { return imageSubresource(this.segment(), index); }
        /// Sets `imageSubresource` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer imageSubresourceAt(long index, MemorySegment value) { imageSubresource(this.segment(), index, value); return this; }

        /// {@return `imageOffset` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment imageOffsetAt(long index) { return imageOffset(this.segment(), index); }
        /// Sets `imageOffset` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer imageOffsetAt(long index, MemorySegment value) { imageOffset(this.segment(), index, value); return this; }

        /// {@return `imageExtent` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment imageExtentAt(long index) { return imageExtent(this.segment(), index); }
        /// Sets `imageExtent` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer imageExtentAt(long index, MemorySegment value) { imageExtent(this.segment(), index, value); return this; }

    }
}
