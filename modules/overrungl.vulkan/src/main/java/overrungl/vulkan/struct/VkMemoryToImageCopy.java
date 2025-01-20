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
/// ### pHostPointer
/// [VarHandle][#VH_pHostPointer] - [Getter][#pHostPointer()] - [Setter][#pHostPointer(MemorySegment)]
/// ### memoryRowLength
/// [VarHandle][#VH_memoryRowLength] - [Getter][#memoryRowLength()] - [Setter][#memoryRowLength(int)]
/// ### memoryImageHeight
/// [VarHandle][#VH_memoryImageHeight] - [Getter][#memoryImageHeight()] - [Setter][#memoryImageHeight(int)]
/// ### imageSubresource
/// [Byte offset][#OFFSET_imageSubresource] - [Memory layout][#ML_imageSubresource] - [Getter][#imageSubresource()] - [Setter][#imageSubresource(MemorySegment)]
/// ### imageOffset
/// [Byte offset][#OFFSET_imageOffset] - [Memory layout][#ML_imageOffset] - [Getter][#imageOffset()] - [Setter][#imageOffset(MemorySegment)]
/// ### imageExtent
/// [Byte offset][#OFFSET_imageExtent] - [Memory layout][#ML_imageExtent] - [Getter][#imageExtent()] - [Setter][#imageExtent(MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkMemoryToImageCopy {
///     VkStructureType sType;
///     const void * pNext;
///     const void * pHostPointer;
///     uint32_t memoryRowLength;
///     uint32_t memoryImageHeight;
///     VkImageSubresourceLayers imageSubresource;
///     VkOffset3D imageOffset;
///     VkExtent3D imageExtent;
/// } VkMemoryToImageCopy;
/// ```
public sealed class VkMemoryToImageCopy extends Struct {
    /// The struct layout of `VkMemoryToImageCopy`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("pHostPointer"),
        ValueLayout.JAVA_INT.withName("memoryRowLength"),
        ValueLayout.JAVA_INT.withName("memoryImageHeight"),
        overrungl.vulkan.struct.VkImageSubresourceLayers.LAYOUT.withName("imageSubresource"),
        overrungl.vulkan.struct.VkOffset3D.LAYOUT.withName("imageOffset"),
        overrungl.vulkan.struct.VkExtent3D.LAYOUT.withName("imageExtent")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `pHostPointer` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pHostPointer = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pHostPointer"));
    /// The [VarHandle] of `memoryRowLength` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_memoryRowLength = LAYOUT.arrayElementVarHandle(PathElement.groupElement("memoryRowLength"));
    /// The [VarHandle] of `memoryImageHeight` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_memoryImageHeight = LAYOUT.arrayElementVarHandle(PathElement.groupElement("memoryImageHeight"));
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

    /// Creates `VkMemoryToImageCopy` with the given segment.
    /// @param segment the memory segment
    public VkMemoryToImageCopy(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkMemoryToImageCopy` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkMemoryToImageCopy of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkMemoryToImageCopy(segment); }

    /// Creates `VkMemoryToImageCopy` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkMemoryToImageCopy` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkMemoryToImageCopy ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkMemoryToImageCopy(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkMemoryToImageCopy` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkMemoryToImageCopy` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkMemoryToImageCopy`
    public static VkMemoryToImageCopy alloc(SegmentAllocator allocator) { return new VkMemoryToImageCopy(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkMemoryToImageCopy` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkMemoryToImageCopy`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkMemoryToImageCopy` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkMemoryToImageCopy`
    public static VkMemoryToImageCopy allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("const void *") MemorySegment pNext, @CType("const void *") MemorySegment pHostPointer, @CType("uint32_t") int memoryRowLength, @CType("uint32_t") int memoryImageHeight, @CType("VkImageSubresourceLayers") MemorySegment imageSubresource, @CType("VkOffset3D") MemorySegment imageOffset, @CType("VkExtent3D") MemorySegment imageExtent) { return alloc(allocator).sType(sType).pNext(pNext).pHostPointer(pHostPointer).memoryRowLength(memoryRowLength).memoryImageHeight(memoryImageHeight).imageSubresource(imageSubresource).imageOffset(imageOffset).imageExtent(imageExtent); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkMemoryToImageCopy copyFrom(VkMemoryToImageCopy src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkMemoryToImageCopy.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkMemoryToImageCopy.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkMemoryToImageCopy.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkMemoryToImageCopy sType(@CType("VkStructureType") int value) { VkMemoryToImageCopy.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") MemorySegment get_pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") MemorySegment get_pNext(MemorySegment segment) { return VkMemoryToImageCopy.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("const void *") MemorySegment pNext() { return VkMemoryToImageCopy.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") MemorySegment value) { VkMemoryToImageCopy.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkMemoryToImageCopy pNext(@CType("const void *") MemorySegment value) { VkMemoryToImageCopy.set_pNext(this.segment(), value); return this; }

    /// {@return `pHostPointer` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") MemorySegment get_pHostPointer(MemorySegment segment, long index) { return (MemorySegment) VH_pHostPointer.get(segment, 0L, index); }
    /// {@return `pHostPointer`}
    /// @param segment the segment of the struct
    public static @CType("const void *") MemorySegment get_pHostPointer(MemorySegment segment) { return VkMemoryToImageCopy.get_pHostPointer(segment, 0L); }
    /// {@return `pHostPointer`}
    public @CType("const void *") MemorySegment pHostPointer() { return VkMemoryToImageCopy.get_pHostPointer(this.segment()); }
    /// Sets `pHostPointer` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pHostPointer(MemorySegment segment, long index, @CType("const void *") MemorySegment value) { VH_pHostPointer.set(segment, 0L, index, value); }
    /// Sets `pHostPointer` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pHostPointer(MemorySegment segment, @CType("const void *") MemorySegment value) { VkMemoryToImageCopy.set_pHostPointer(segment, 0L, value); }
    /// Sets `pHostPointer` with the given value.
    /// @param value the value
    /// @return `this`
    public VkMemoryToImageCopy pHostPointer(@CType("const void *") MemorySegment value) { VkMemoryToImageCopy.set_pHostPointer(this.segment(), value); return this; }

    /// {@return `memoryRowLength` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_memoryRowLength(MemorySegment segment, long index) { return (int) VH_memoryRowLength.get(segment, 0L, index); }
    /// {@return `memoryRowLength`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_memoryRowLength(MemorySegment segment) { return VkMemoryToImageCopy.get_memoryRowLength(segment, 0L); }
    /// {@return `memoryRowLength`}
    public @CType("uint32_t") int memoryRowLength() { return VkMemoryToImageCopy.get_memoryRowLength(this.segment()); }
    /// Sets `memoryRowLength` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_memoryRowLength(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_memoryRowLength.set(segment, 0L, index, value); }
    /// Sets `memoryRowLength` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_memoryRowLength(MemorySegment segment, @CType("uint32_t") int value) { VkMemoryToImageCopy.set_memoryRowLength(segment, 0L, value); }
    /// Sets `memoryRowLength` with the given value.
    /// @param value the value
    /// @return `this`
    public VkMemoryToImageCopy memoryRowLength(@CType("uint32_t") int value) { VkMemoryToImageCopy.set_memoryRowLength(this.segment(), value); return this; }

    /// {@return `memoryImageHeight` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_memoryImageHeight(MemorySegment segment, long index) { return (int) VH_memoryImageHeight.get(segment, 0L, index); }
    /// {@return `memoryImageHeight`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_memoryImageHeight(MemorySegment segment) { return VkMemoryToImageCopy.get_memoryImageHeight(segment, 0L); }
    /// {@return `memoryImageHeight`}
    public @CType("uint32_t") int memoryImageHeight() { return VkMemoryToImageCopy.get_memoryImageHeight(this.segment()); }
    /// Sets `memoryImageHeight` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_memoryImageHeight(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_memoryImageHeight.set(segment, 0L, index, value); }
    /// Sets `memoryImageHeight` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_memoryImageHeight(MemorySegment segment, @CType("uint32_t") int value) { VkMemoryToImageCopy.set_memoryImageHeight(segment, 0L, value); }
    /// Sets `memoryImageHeight` with the given value.
    /// @param value the value
    /// @return `this`
    public VkMemoryToImageCopy memoryImageHeight(@CType("uint32_t") int value) { VkMemoryToImageCopy.set_memoryImageHeight(this.segment(), value); return this; }

    /// {@return `imageSubresource` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkImageSubresourceLayers") MemorySegment get_imageSubresource(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_imageSubresource, index), ML_imageSubresource); }
    /// {@return `imageSubresource`}
    /// @param segment the segment of the struct
    public static @CType("VkImageSubresourceLayers") MemorySegment get_imageSubresource(MemorySegment segment) { return VkMemoryToImageCopy.get_imageSubresource(segment, 0L); }
    /// {@return `imageSubresource`}
    public @CType("VkImageSubresourceLayers") MemorySegment imageSubresource() { return VkMemoryToImageCopy.get_imageSubresource(this.segment()); }
    /// Sets `imageSubresource` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_imageSubresource(MemorySegment segment, long index, @CType("VkImageSubresourceLayers") MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_imageSubresource, index), ML_imageSubresource.byteSize()); }
    /// Sets `imageSubresource` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_imageSubresource(MemorySegment segment, @CType("VkImageSubresourceLayers") MemorySegment value) { VkMemoryToImageCopy.set_imageSubresource(segment, 0L, value); }
    /// Sets `imageSubresource` with the given value.
    /// @param value the value
    /// @return `this`
    public VkMemoryToImageCopy imageSubresource(@CType("VkImageSubresourceLayers") MemorySegment value) { VkMemoryToImageCopy.set_imageSubresource(this.segment(), value); return this; }

    /// {@return `imageOffset` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkOffset3D") MemorySegment get_imageOffset(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_imageOffset, index), ML_imageOffset); }
    /// {@return `imageOffset`}
    /// @param segment the segment of the struct
    public static @CType("VkOffset3D") MemorySegment get_imageOffset(MemorySegment segment) { return VkMemoryToImageCopy.get_imageOffset(segment, 0L); }
    /// {@return `imageOffset`}
    public @CType("VkOffset3D") MemorySegment imageOffset() { return VkMemoryToImageCopy.get_imageOffset(this.segment()); }
    /// Sets `imageOffset` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_imageOffset(MemorySegment segment, long index, @CType("VkOffset3D") MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_imageOffset, index), ML_imageOffset.byteSize()); }
    /// Sets `imageOffset` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_imageOffset(MemorySegment segment, @CType("VkOffset3D") MemorySegment value) { VkMemoryToImageCopy.set_imageOffset(segment, 0L, value); }
    /// Sets `imageOffset` with the given value.
    /// @param value the value
    /// @return `this`
    public VkMemoryToImageCopy imageOffset(@CType("VkOffset3D") MemorySegment value) { VkMemoryToImageCopy.set_imageOffset(this.segment(), value); return this; }

    /// {@return `imageExtent` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkExtent3D") MemorySegment get_imageExtent(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_imageExtent, index), ML_imageExtent); }
    /// {@return `imageExtent`}
    /// @param segment the segment of the struct
    public static @CType("VkExtent3D") MemorySegment get_imageExtent(MemorySegment segment) { return VkMemoryToImageCopy.get_imageExtent(segment, 0L); }
    /// {@return `imageExtent`}
    public @CType("VkExtent3D") MemorySegment imageExtent() { return VkMemoryToImageCopy.get_imageExtent(this.segment()); }
    /// Sets `imageExtent` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_imageExtent(MemorySegment segment, long index, @CType("VkExtent3D") MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_imageExtent, index), ML_imageExtent.byteSize()); }
    /// Sets `imageExtent` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_imageExtent(MemorySegment segment, @CType("VkExtent3D") MemorySegment value) { VkMemoryToImageCopy.set_imageExtent(segment, 0L, value); }
    /// Sets `imageExtent` with the given value.
    /// @param value the value
    /// @return `this`
    public VkMemoryToImageCopy imageExtent(@CType("VkExtent3D") MemorySegment value) { VkMemoryToImageCopy.set_imageExtent(this.segment(), value); return this; }

    /// A buffer of [VkMemoryToImageCopy].
    public static final class Buffer extends VkMemoryToImageCopy {
        private final long elementCount;

        /// Creates `VkMemoryToImageCopy.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkMemoryToImageCopy`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkMemoryToImageCopy`
        public VkMemoryToImageCopy asSlice(long index) { return new VkMemoryToImageCopy(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkMemoryToImageCopy`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkMemoryToImageCopy`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkMemoryToImageCopy.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkMemoryToImageCopy.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("const void *") MemorySegment pNextAt(long index) { return VkMemoryToImageCopy.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("const void *") MemorySegment value) { VkMemoryToImageCopy.set_pNext(this.segment(), index, value); return this; }

        /// {@return `pHostPointer` at the given index}
        /// @param index the index
        public @CType("const void *") MemorySegment pHostPointerAt(long index) { return VkMemoryToImageCopy.get_pHostPointer(this.segment(), index); }
        /// Sets `pHostPointer` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pHostPointerAt(long index, @CType("const void *") MemorySegment value) { VkMemoryToImageCopy.set_pHostPointer(this.segment(), index, value); return this; }

        /// {@return `memoryRowLength` at the given index}
        /// @param index the index
        public @CType("uint32_t") int memoryRowLengthAt(long index) { return VkMemoryToImageCopy.get_memoryRowLength(this.segment(), index); }
        /// Sets `memoryRowLength` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer memoryRowLengthAt(long index, @CType("uint32_t") int value) { VkMemoryToImageCopy.set_memoryRowLength(this.segment(), index, value); return this; }

        /// {@return `memoryImageHeight` at the given index}
        /// @param index the index
        public @CType("uint32_t") int memoryImageHeightAt(long index) { return VkMemoryToImageCopy.get_memoryImageHeight(this.segment(), index); }
        /// Sets `memoryImageHeight` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer memoryImageHeightAt(long index, @CType("uint32_t") int value) { VkMemoryToImageCopy.set_memoryImageHeight(this.segment(), index, value); return this; }

        /// {@return `imageSubresource` at the given index}
        /// @param index the index
        public @CType("VkImageSubresourceLayers") MemorySegment imageSubresourceAt(long index) { return VkMemoryToImageCopy.get_imageSubresource(this.segment(), index); }
        /// Sets `imageSubresource` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer imageSubresourceAt(long index, @CType("VkImageSubresourceLayers") MemorySegment value) { VkMemoryToImageCopy.set_imageSubresource(this.segment(), index, value); return this; }

        /// {@return `imageOffset` at the given index}
        /// @param index the index
        public @CType("VkOffset3D") MemorySegment imageOffsetAt(long index) { return VkMemoryToImageCopy.get_imageOffset(this.segment(), index); }
        /// Sets `imageOffset` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer imageOffsetAt(long index, @CType("VkOffset3D") MemorySegment value) { VkMemoryToImageCopy.set_imageOffset(this.segment(), index, value); return this; }

        /// {@return `imageExtent` at the given index}
        /// @param index the index
        public @CType("VkExtent3D") MemorySegment imageExtentAt(long index) { return VkMemoryToImageCopy.get_imageExtent(this.segment(), index); }
        /// Sets `imageExtent` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer imageExtentAt(long index, @CType("VkExtent3D") MemorySegment value) { VkMemoryToImageCopy.set_imageExtent(this.segment(), index, value); return this; }

    }
}
