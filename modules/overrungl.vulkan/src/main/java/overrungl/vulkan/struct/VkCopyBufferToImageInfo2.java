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
/// ### srcBuffer
/// [VarHandle][#VH_srcBuffer] - [Getter][#srcBuffer()] - [Setter][#srcBuffer(java.lang.foreign.MemorySegment)]
/// ### dstImage
/// [VarHandle][#VH_dstImage] - [Getter][#dstImage()] - [Setter][#dstImage(java.lang.foreign.MemorySegment)]
/// ### dstImageLayout
/// [VarHandle][#VH_dstImageLayout] - [Getter][#dstImageLayout()] - [Setter][#dstImageLayout(int)]
/// ### regionCount
/// [VarHandle][#VH_regionCount] - [Getter][#regionCount()] - [Setter][#regionCount(int)]
/// ### pRegions
/// [VarHandle][#VH_pRegions] - [Getter][#pRegions()] - [Setter][#pRegions(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkCopyBufferToImageInfo2 {
///     VkStructureType sType;
///     const void * pNext;
///     VkBuffer srcBuffer;
///     VkImage dstImage;
///     VkImageLayout dstImageLayout;
///     uint32_t regionCount;
///     const VkBufferImageCopy2 * pRegions;
/// } VkCopyBufferToImageInfo2;
/// ```
public sealed class VkCopyBufferToImageInfo2 extends Struct {
    /// The struct layout of `VkCopyBufferToImageInfo2`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("srcBuffer"),
        ValueLayout.ADDRESS.withName("dstImage"),
        ValueLayout.JAVA_INT.withName("dstImageLayout"),
        ValueLayout.JAVA_INT.withName("regionCount"),
        ValueLayout.ADDRESS.withName("pRegions")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `srcBuffer` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_srcBuffer = LAYOUT.arrayElementVarHandle(PathElement.groupElement("srcBuffer"));
    /// The [VarHandle] of `dstImage` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_dstImage = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dstImage"));
    /// The [VarHandle] of `dstImageLayout` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_dstImageLayout = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dstImageLayout"));
    /// The [VarHandle] of `regionCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_regionCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("regionCount"));
    /// The [VarHandle] of `pRegions` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pRegions = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pRegions"));

    /// Creates `VkCopyBufferToImageInfo2` with the given segment.
    /// @param segment the memory segment
    public VkCopyBufferToImageInfo2(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkCopyBufferToImageInfo2` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkCopyBufferToImageInfo2 of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkCopyBufferToImageInfo2(segment); }

    /// Creates `VkCopyBufferToImageInfo2` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkCopyBufferToImageInfo2` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkCopyBufferToImageInfo2 ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkCopyBufferToImageInfo2(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkCopyBufferToImageInfo2` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkCopyBufferToImageInfo2` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkCopyBufferToImageInfo2`
    public static VkCopyBufferToImageInfo2 alloc(SegmentAllocator allocator) { return new VkCopyBufferToImageInfo2(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkCopyBufferToImageInfo2` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkCopyBufferToImageInfo2`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkCopyBufferToImageInfo2` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkCopyBufferToImageInfo2`
    public static VkCopyBufferToImageInfo2 allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("const void *") java.lang.foreign.MemorySegment pNext, @CType("VkBuffer") java.lang.foreign.MemorySegment srcBuffer, @CType("VkImage") java.lang.foreign.MemorySegment dstImage, @CType("VkImageLayout") int dstImageLayout, @CType("uint32_t") int regionCount, @CType("const VkBufferImageCopy2 *") java.lang.foreign.MemorySegment pRegions) { return alloc(allocator).sType(sType).pNext(pNext).srcBuffer(srcBuffer).dstImage(dstImage).dstImageLayout(dstImageLayout).regionCount(regionCount).pRegions(pRegions); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkCopyBufferToImageInfo2 copyFrom(VkCopyBufferToImageInfo2 src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkCopyBufferToImageInfo2.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkCopyBufferToImageInfo2.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkCopyBufferToImageInfo2.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCopyBufferToImageInfo2 sType(@CType("VkStructureType") int value) { VkCopyBufferToImageInfo2.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkCopyBufferToImageInfo2.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkCopyBufferToImageInfo2.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkCopyBufferToImageInfo2.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCopyBufferToImageInfo2 pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkCopyBufferToImageInfo2.set_pNext(this.segment(), value); return this; }

    /// {@return `srcBuffer` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBuffer") java.lang.foreign.MemorySegment get_srcBuffer(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_srcBuffer.get(segment, 0L, index); }
    /// {@return `srcBuffer`}
    /// @param segment the segment of the struct
    public static @CType("VkBuffer") java.lang.foreign.MemorySegment get_srcBuffer(MemorySegment segment) { return VkCopyBufferToImageInfo2.get_srcBuffer(segment, 0L); }
    /// {@return `srcBuffer`}
    public @CType("VkBuffer") java.lang.foreign.MemorySegment srcBuffer() { return VkCopyBufferToImageInfo2.get_srcBuffer(this.segment()); }
    /// Sets `srcBuffer` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_srcBuffer(MemorySegment segment, long index, @CType("VkBuffer") java.lang.foreign.MemorySegment value) { VH_srcBuffer.set(segment, 0L, index, value); }
    /// Sets `srcBuffer` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_srcBuffer(MemorySegment segment, @CType("VkBuffer") java.lang.foreign.MemorySegment value) { VkCopyBufferToImageInfo2.set_srcBuffer(segment, 0L, value); }
    /// Sets `srcBuffer` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCopyBufferToImageInfo2 srcBuffer(@CType("VkBuffer") java.lang.foreign.MemorySegment value) { VkCopyBufferToImageInfo2.set_srcBuffer(this.segment(), value); return this; }

    /// {@return `dstImage` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkImage") java.lang.foreign.MemorySegment get_dstImage(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_dstImage.get(segment, 0L, index); }
    /// {@return `dstImage`}
    /// @param segment the segment of the struct
    public static @CType("VkImage") java.lang.foreign.MemorySegment get_dstImage(MemorySegment segment) { return VkCopyBufferToImageInfo2.get_dstImage(segment, 0L); }
    /// {@return `dstImage`}
    public @CType("VkImage") java.lang.foreign.MemorySegment dstImage() { return VkCopyBufferToImageInfo2.get_dstImage(this.segment()); }
    /// Sets `dstImage` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_dstImage(MemorySegment segment, long index, @CType("VkImage") java.lang.foreign.MemorySegment value) { VH_dstImage.set(segment, 0L, index, value); }
    /// Sets `dstImage` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_dstImage(MemorySegment segment, @CType("VkImage") java.lang.foreign.MemorySegment value) { VkCopyBufferToImageInfo2.set_dstImage(segment, 0L, value); }
    /// Sets `dstImage` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCopyBufferToImageInfo2 dstImage(@CType("VkImage") java.lang.foreign.MemorySegment value) { VkCopyBufferToImageInfo2.set_dstImage(this.segment(), value); return this; }

    /// {@return `dstImageLayout` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkImageLayout") int get_dstImageLayout(MemorySegment segment, long index) { return (int) VH_dstImageLayout.get(segment, 0L, index); }
    /// {@return `dstImageLayout`}
    /// @param segment the segment of the struct
    public static @CType("VkImageLayout") int get_dstImageLayout(MemorySegment segment) { return VkCopyBufferToImageInfo2.get_dstImageLayout(segment, 0L); }
    /// {@return `dstImageLayout`}
    public @CType("VkImageLayout") int dstImageLayout() { return VkCopyBufferToImageInfo2.get_dstImageLayout(this.segment()); }
    /// Sets `dstImageLayout` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_dstImageLayout(MemorySegment segment, long index, @CType("VkImageLayout") int value) { VH_dstImageLayout.set(segment, 0L, index, value); }
    /// Sets `dstImageLayout` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_dstImageLayout(MemorySegment segment, @CType("VkImageLayout") int value) { VkCopyBufferToImageInfo2.set_dstImageLayout(segment, 0L, value); }
    /// Sets `dstImageLayout` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCopyBufferToImageInfo2 dstImageLayout(@CType("VkImageLayout") int value) { VkCopyBufferToImageInfo2.set_dstImageLayout(this.segment(), value); return this; }

    /// {@return `regionCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_regionCount(MemorySegment segment, long index) { return (int) VH_regionCount.get(segment, 0L, index); }
    /// {@return `regionCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_regionCount(MemorySegment segment) { return VkCopyBufferToImageInfo2.get_regionCount(segment, 0L); }
    /// {@return `regionCount`}
    public @CType("uint32_t") int regionCount() { return VkCopyBufferToImageInfo2.get_regionCount(this.segment()); }
    /// Sets `regionCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_regionCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_regionCount.set(segment, 0L, index, value); }
    /// Sets `regionCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_regionCount(MemorySegment segment, @CType("uint32_t") int value) { VkCopyBufferToImageInfo2.set_regionCount(segment, 0L, value); }
    /// Sets `regionCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCopyBufferToImageInfo2 regionCount(@CType("uint32_t") int value) { VkCopyBufferToImageInfo2.set_regionCount(this.segment(), value); return this; }

    /// {@return `pRegions` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const VkBufferImageCopy2 *") java.lang.foreign.MemorySegment get_pRegions(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pRegions.get(segment, 0L, index); }
    /// {@return `pRegions`}
    /// @param segment the segment of the struct
    public static @CType("const VkBufferImageCopy2 *") java.lang.foreign.MemorySegment get_pRegions(MemorySegment segment) { return VkCopyBufferToImageInfo2.get_pRegions(segment, 0L); }
    /// {@return `pRegions`}
    public @CType("const VkBufferImageCopy2 *") java.lang.foreign.MemorySegment pRegions() { return VkCopyBufferToImageInfo2.get_pRegions(this.segment()); }
    /// Sets `pRegions` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pRegions(MemorySegment segment, long index, @CType("const VkBufferImageCopy2 *") java.lang.foreign.MemorySegment value) { VH_pRegions.set(segment, 0L, index, value); }
    /// Sets `pRegions` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pRegions(MemorySegment segment, @CType("const VkBufferImageCopy2 *") java.lang.foreign.MemorySegment value) { VkCopyBufferToImageInfo2.set_pRegions(segment, 0L, value); }
    /// Sets `pRegions` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCopyBufferToImageInfo2 pRegions(@CType("const VkBufferImageCopy2 *") java.lang.foreign.MemorySegment value) { VkCopyBufferToImageInfo2.set_pRegions(this.segment(), value); return this; }

    /// A buffer of [VkCopyBufferToImageInfo2].
    public static final class Buffer extends VkCopyBufferToImageInfo2 {
        private final long elementCount;

        /// Creates `VkCopyBufferToImageInfo2.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkCopyBufferToImageInfo2`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkCopyBufferToImageInfo2`
        public VkCopyBufferToImageInfo2 asSlice(long index) { return new VkCopyBufferToImageInfo2(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkCopyBufferToImageInfo2`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkCopyBufferToImageInfo2`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkCopyBufferToImageInfo2.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkCopyBufferToImageInfo2.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkCopyBufferToImageInfo2.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkCopyBufferToImageInfo2.set_pNext(this.segment(), index, value); return this; }

        /// {@return `srcBuffer` at the given index}
        /// @param index the index
        public @CType("VkBuffer") java.lang.foreign.MemorySegment srcBufferAt(long index) { return VkCopyBufferToImageInfo2.get_srcBuffer(this.segment(), index); }
        /// Sets `srcBuffer` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer srcBufferAt(long index, @CType("VkBuffer") java.lang.foreign.MemorySegment value) { VkCopyBufferToImageInfo2.set_srcBuffer(this.segment(), index, value); return this; }

        /// {@return `dstImage` at the given index}
        /// @param index the index
        public @CType("VkImage") java.lang.foreign.MemorySegment dstImageAt(long index) { return VkCopyBufferToImageInfo2.get_dstImage(this.segment(), index); }
        /// Sets `dstImage` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer dstImageAt(long index, @CType("VkImage") java.lang.foreign.MemorySegment value) { VkCopyBufferToImageInfo2.set_dstImage(this.segment(), index, value); return this; }

        /// {@return `dstImageLayout` at the given index}
        /// @param index the index
        public @CType("VkImageLayout") int dstImageLayoutAt(long index) { return VkCopyBufferToImageInfo2.get_dstImageLayout(this.segment(), index); }
        /// Sets `dstImageLayout` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer dstImageLayoutAt(long index, @CType("VkImageLayout") int value) { VkCopyBufferToImageInfo2.set_dstImageLayout(this.segment(), index, value); return this; }

        /// {@return `regionCount` at the given index}
        /// @param index the index
        public @CType("uint32_t") int regionCountAt(long index) { return VkCopyBufferToImageInfo2.get_regionCount(this.segment(), index); }
        /// Sets `regionCount` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer regionCountAt(long index, @CType("uint32_t") int value) { VkCopyBufferToImageInfo2.set_regionCount(this.segment(), index, value); return this; }

        /// {@return `pRegions` at the given index}
        /// @param index the index
        public @CType("const VkBufferImageCopy2 *") java.lang.foreign.MemorySegment pRegionsAt(long index) { return VkCopyBufferToImageInfo2.get_pRegions(this.segment(), index); }
        /// Sets `pRegions` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pRegionsAt(long index, @CType("const VkBufferImageCopy2 *") java.lang.foreign.MemorySegment value) { VkCopyBufferToImageInfo2.set_pRegions(this.segment(), index, value); return this; }

    }
}
