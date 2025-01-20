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
/// ### srcImage
/// [VarHandle][#VH_srcImage] - [Getter][#srcImage()] - [Setter][#srcImage(MemorySegment)]
/// ### srcImageLayout
/// [VarHandle][#VH_srcImageLayout] - [Getter][#srcImageLayout()] - [Setter][#srcImageLayout(int)]
/// ### dstImage
/// [VarHandle][#VH_dstImage] - [Getter][#dstImage()] - [Setter][#dstImage(MemorySegment)]
/// ### dstImageLayout
/// [VarHandle][#VH_dstImageLayout] - [Getter][#dstImageLayout()] - [Setter][#dstImageLayout(int)]
/// ### regionCount
/// [VarHandle][#VH_regionCount] - [Getter][#regionCount()] - [Setter][#regionCount(int)]
/// ### pRegions
/// [VarHandle][#VH_pRegions] - [Getter][#pRegions()] - [Setter][#pRegions(MemorySegment)]
/// ### filter
/// [VarHandle][#VH_filter] - [Getter][#filter()] - [Setter][#filter(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkBlitImageInfo2 {
///     VkStructureType sType;
///     const void * pNext;
///     VkImage srcImage;
///     VkImageLayout srcImageLayout;
///     VkImage dstImage;
///     VkImageLayout dstImageLayout;
///     uint32_t regionCount;
///     const VkImageBlit2 * pRegions;
///     VkFilter filter;
/// } VkBlitImageInfo2;
/// ```
public sealed class VkBlitImageInfo2 extends Struct {
    /// The struct layout of `VkBlitImageInfo2`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("srcImage"),
        ValueLayout.JAVA_INT.withName("srcImageLayout"),
        ValueLayout.ADDRESS.withName("dstImage"),
        ValueLayout.JAVA_INT.withName("dstImageLayout"),
        ValueLayout.JAVA_INT.withName("regionCount"),
        ValueLayout.ADDRESS.withName("pRegions"),
        ValueLayout.JAVA_INT.withName("filter")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `srcImage` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_srcImage = LAYOUT.arrayElementVarHandle(PathElement.groupElement("srcImage"));
    /// The [VarHandle] of `srcImageLayout` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_srcImageLayout = LAYOUT.arrayElementVarHandle(PathElement.groupElement("srcImageLayout"));
    /// The [VarHandle] of `dstImage` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_dstImage = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dstImage"));
    /// The [VarHandle] of `dstImageLayout` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_dstImageLayout = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dstImageLayout"));
    /// The [VarHandle] of `regionCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_regionCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("regionCount"));
    /// The [VarHandle] of `pRegions` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pRegions = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pRegions"));
    /// The [VarHandle] of `filter` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_filter = LAYOUT.arrayElementVarHandle(PathElement.groupElement("filter"));

    /// Creates `VkBlitImageInfo2` with the given segment.
    /// @param segment the memory segment
    public VkBlitImageInfo2(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkBlitImageInfo2` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkBlitImageInfo2 of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkBlitImageInfo2(segment); }

    /// Creates `VkBlitImageInfo2` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkBlitImageInfo2` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkBlitImageInfo2 ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkBlitImageInfo2(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkBlitImageInfo2` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkBlitImageInfo2` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkBlitImageInfo2`
    public static VkBlitImageInfo2 alloc(SegmentAllocator allocator) { return new VkBlitImageInfo2(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkBlitImageInfo2` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkBlitImageInfo2`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkBlitImageInfo2` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkBlitImageInfo2`
    public static VkBlitImageInfo2 allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("const void *") MemorySegment pNext, @CType("VkImage") MemorySegment srcImage, @CType("VkImageLayout") int srcImageLayout, @CType("VkImage") MemorySegment dstImage, @CType("VkImageLayout") int dstImageLayout, @CType("uint32_t") int regionCount, @CType("const VkImageBlit2 *") MemorySegment pRegions, @CType("VkFilter") int filter) { return alloc(allocator).sType(sType).pNext(pNext).srcImage(srcImage).srcImageLayout(srcImageLayout).dstImage(dstImage).dstImageLayout(dstImageLayout).regionCount(regionCount).pRegions(pRegions).filter(filter); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkBlitImageInfo2 copyFrom(VkBlitImageInfo2 src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkBlitImageInfo2.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkBlitImageInfo2.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkBlitImageInfo2.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBlitImageInfo2 sType(@CType("VkStructureType") int value) { VkBlitImageInfo2.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") MemorySegment get_pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") MemorySegment get_pNext(MemorySegment segment) { return VkBlitImageInfo2.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("const void *") MemorySegment pNext() { return VkBlitImageInfo2.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") MemorySegment value) { VkBlitImageInfo2.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBlitImageInfo2 pNext(@CType("const void *") MemorySegment value) { VkBlitImageInfo2.set_pNext(this.segment(), value); return this; }

    /// {@return `srcImage` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkImage") MemorySegment get_srcImage(MemorySegment segment, long index) { return (MemorySegment) VH_srcImage.get(segment, 0L, index); }
    /// {@return `srcImage`}
    /// @param segment the segment of the struct
    public static @CType("VkImage") MemorySegment get_srcImage(MemorySegment segment) { return VkBlitImageInfo2.get_srcImage(segment, 0L); }
    /// {@return `srcImage`}
    public @CType("VkImage") MemorySegment srcImage() { return VkBlitImageInfo2.get_srcImage(this.segment()); }
    /// Sets `srcImage` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_srcImage(MemorySegment segment, long index, @CType("VkImage") MemorySegment value) { VH_srcImage.set(segment, 0L, index, value); }
    /// Sets `srcImage` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_srcImage(MemorySegment segment, @CType("VkImage") MemorySegment value) { VkBlitImageInfo2.set_srcImage(segment, 0L, value); }
    /// Sets `srcImage` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBlitImageInfo2 srcImage(@CType("VkImage") MemorySegment value) { VkBlitImageInfo2.set_srcImage(this.segment(), value); return this; }

    /// {@return `srcImageLayout` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkImageLayout") int get_srcImageLayout(MemorySegment segment, long index) { return (int) VH_srcImageLayout.get(segment, 0L, index); }
    /// {@return `srcImageLayout`}
    /// @param segment the segment of the struct
    public static @CType("VkImageLayout") int get_srcImageLayout(MemorySegment segment) { return VkBlitImageInfo2.get_srcImageLayout(segment, 0L); }
    /// {@return `srcImageLayout`}
    public @CType("VkImageLayout") int srcImageLayout() { return VkBlitImageInfo2.get_srcImageLayout(this.segment()); }
    /// Sets `srcImageLayout` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_srcImageLayout(MemorySegment segment, long index, @CType("VkImageLayout") int value) { VH_srcImageLayout.set(segment, 0L, index, value); }
    /// Sets `srcImageLayout` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_srcImageLayout(MemorySegment segment, @CType("VkImageLayout") int value) { VkBlitImageInfo2.set_srcImageLayout(segment, 0L, value); }
    /// Sets `srcImageLayout` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBlitImageInfo2 srcImageLayout(@CType("VkImageLayout") int value) { VkBlitImageInfo2.set_srcImageLayout(this.segment(), value); return this; }

    /// {@return `dstImage` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkImage") MemorySegment get_dstImage(MemorySegment segment, long index) { return (MemorySegment) VH_dstImage.get(segment, 0L, index); }
    /// {@return `dstImage`}
    /// @param segment the segment of the struct
    public static @CType("VkImage") MemorySegment get_dstImage(MemorySegment segment) { return VkBlitImageInfo2.get_dstImage(segment, 0L); }
    /// {@return `dstImage`}
    public @CType("VkImage") MemorySegment dstImage() { return VkBlitImageInfo2.get_dstImage(this.segment()); }
    /// Sets `dstImage` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_dstImage(MemorySegment segment, long index, @CType("VkImage") MemorySegment value) { VH_dstImage.set(segment, 0L, index, value); }
    /// Sets `dstImage` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_dstImage(MemorySegment segment, @CType("VkImage") MemorySegment value) { VkBlitImageInfo2.set_dstImage(segment, 0L, value); }
    /// Sets `dstImage` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBlitImageInfo2 dstImage(@CType("VkImage") MemorySegment value) { VkBlitImageInfo2.set_dstImage(this.segment(), value); return this; }

    /// {@return `dstImageLayout` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkImageLayout") int get_dstImageLayout(MemorySegment segment, long index) { return (int) VH_dstImageLayout.get(segment, 0L, index); }
    /// {@return `dstImageLayout`}
    /// @param segment the segment of the struct
    public static @CType("VkImageLayout") int get_dstImageLayout(MemorySegment segment) { return VkBlitImageInfo2.get_dstImageLayout(segment, 0L); }
    /// {@return `dstImageLayout`}
    public @CType("VkImageLayout") int dstImageLayout() { return VkBlitImageInfo2.get_dstImageLayout(this.segment()); }
    /// Sets `dstImageLayout` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_dstImageLayout(MemorySegment segment, long index, @CType("VkImageLayout") int value) { VH_dstImageLayout.set(segment, 0L, index, value); }
    /// Sets `dstImageLayout` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_dstImageLayout(MemorySegment segment, @CType("VkImageLayout") int value) { VkBlitImageInfo2.set_dstImageLayout(segment, 0L, value); }
    /// Sets `dstImageLayout` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBlitImageInfo2 dstImageLayout(@CType("VkImageLayout") int value) { VkBlitImageInfo2.set_dstImageLayout(this.segment(), value); return this; }

    /// {@return `regionCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_regionCount(MemorySegment segment, long index) { return (int) VH_regionCount.get(segment, 0L, index); }
    /// {@return `regionCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_regionCount(MemorySegment segment) { return VkBlitImageInfo2.get_regionCount(segment, 0L); }
    /// {@return `regionCount`}
    public @CType("uint32_t") int regionCount() { return VkBlitImageInfo2.get_regionCount(this.segment()); }
    /// Sets `regionCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_regionCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_regionCount.set(segment, 0L, index, value); }
    /// Sets `regionCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_regionCount(MemorySegment segment, @CType("uint32_t") int value) { VkBlitImageInfo2.set_regionCount(segment, 0L, value); }
    /// Sets `regionCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBlitImageInfo2 regionCount(@CType("uint32_t") int value) { VkBlitImageInfo2.set_regionCount(this.segment(), value); return this; }

    /// {@return `pRegions` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const VkImageBlit2 *") MemorySegment get_pRegions(MemorySegment segment, long index) { return (MemorySegment) VH_pRegions.get(segment, 0L, index); }
    /// {@return `pRegions`}
    /// @param segment the segment of the struct
    public static @CType("const VkImageBlit2 *") MemorySegment get_pRegions(MemorySegment segment) { return VkBlitImageInfo2.get_pRegions(segment, 0L); }
    /// {@return `pRegions`}
    public @CType("const VkImageBlit2 *") MemorySegment pRegions() { return VkBlitImageInfo2.get_pRegions(this.segment()); }
    /// Sets `pRegions` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pRegions(MemorySegment segment, long index, @CType("const VkImageBlit2 *") MemorySegment value) { VH_pRegions.set(segment, 0L, index, value); }
    /// Sets `pRegions` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pRegions(MemorySegment segment, @CType("const VkImageBlit2 *") MemorySegment value) { VkBlitImageInfo2.set_pRegions(segment, 0L, value); }
    /// Sets `pRegions` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBlitImageInfo2 pRegions(@CType("const VkImageBlit2 *") MemorySegment value) { VkBlitImageInfo2.set_pRegions(this.segment(), value); return this; }

    /// {@return `filter` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkFilter") int get_filter(MemorySegment segment, long index) { return (int) VH_filter.get(segment, 0L, index); }
    /// {@return `filter`}
    /// @param segment the segment of the struct
    public static @CType("VkFilter") int get_filter(MemorySegment segment) { return VkBlitImageInfo2.get_filter(segment, 0L); }
    /// {@return `filter`}
    public @CType("VkFilter") int filter() { return VkBlitImageInfo2.get_filter(this.segment()); }
    /// Sets `filter` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_filter(MemorySegment segment, long index, @CType("VkFilter") int value) { VH_filter.set(segment, 0L, index, value); }
    /// Sets `filter` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_filter(MemorySegment segment, @CType("VkFilter") int value) { VkBlitImageInfo2.set_filter(segment, 0L, value); }
    /// Sets `filter` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBlitImageInfo2 filter(@CType("VkFilter") int value) { VkBlitImageInfo2.set_filter(this.segment(), value); return this; }

    /// A buffer of [VkBlitImageInfo2].
    public static final class Buffer extends VkBlitImageInfo2 {
        private final long elementCount;

        /// Creates `VkBlitImageInfo2.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkBlitImageInfo2`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkBlitImageInfo2`
        public VkBlitImageInfo2 asSlice(long index) { return new VkBlitImageInfo2(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkBlitImageInfo2`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkBlitImageInfo2`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkBlitImageInfo2.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkBlitImageInfo2.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("const void *") MemorySegment pNextAt(long index) { return VkBlitImageInfo2.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("const void *") MemorySegment value) { VkBlitImageInfo2.set_pNext(this.segment(), index, value); return this; }

        /// {@return `srcImage` at the given index}
        /// @param index the index
        public @CType("VkImage") MemorySegment srcImageAt(long index) { return VkBlitImageInfo2.get_srcImage(this.segment(), index); }
        /// Sets `srcImage` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer srcImageAt(long index, @CType("VkImage") MemorySegment value) { VkBlitImageInfo2.set_srcImage(this.segment(), index, value); return this; }

        /// {@return `srcImageLayout` at the given index}
        /// @param index the index
        public @CType("VkImageLayout") int srcImageLayoutAt(long index) { return VkBlitImageInfo2.get_srcImageLayout(this.segment(), index); }
        /// Sets `srcImageLayout` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer srcImageLayoutAt(long index, @CType("VkImageLayout") int value) { VkBlitImageInfo2.set_srcImageLayout(this.segment(), index, value); return this; }

        /// {@return `dstImage` at the given index}
        /// @param index the index
        public @CType("VkImage") MemorySegment dstImageAt(long index) { return VkBlitImageInfo2.get_dstImage(this.segment(), index); }
        /// Sets `dstImage` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer dstImageAt(long index, @CType("VkImage") MemorySegment value) { VkBlitImageInfo2.set_dstImage(this.segment(), index, value); return this; }

        /// {@return `dstImageLayout` at the given index}
        /// @param index the index
        public @CType("VkImageLayout") int dstImageLayoutAt(long index) { return VkBlitImageInfo2.get_dstImageLayout(this.segment(), index); }
        /// Sets `dstImageLayout` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer dstImageLayoutAt(long index, @CType("VkImageLayout") int value) { VkBlitImageInfo2.set_dstImageLayout(this.segment(), index, value); return this; }

        /// {@return `regionCount` at the given index}
        /// @param index the index
        public @CType("uint32_t") int regionCountAt(long index) { return VkBlitImageInfo2.get_regionCount(this.segment(), index); }
        /// Sets `regionCount` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer regionCountAt(long index, @CType("uint32_t") int value) { VkBlitImageInfo2.set_regionCount(this.segment(), index, value); return this; }

        /// {@return `pRegions` at the given index}
        /// @param index the index
        public @CType("const VkImageBlit2 *") MemorySegment pRegionsAt(long index) { return VkBlitImageInfo2.get_pRegions(this.segment(), index); }
        /// Sets `pRegions` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pRegionsAt(long index, @CType("const VkImageBlit2 *") MemorySegment value) { VkBlitImageInfo2.set_pRegions(this.segment(), index, value); return this; }

        /// {@return `filter` at the given index}
        /// @param index the index
        public @CType("VkFilter") int filterAt(long index) { return VkBlitImageInfo2.get_filter(this.segment(), index); }
        /// Sets `filter` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer filterAt(long index, @CType("VkFilter") int value) { VkBlitImageInfo2.set_filter(this.segment(), index, value); return this; }

    }
}
