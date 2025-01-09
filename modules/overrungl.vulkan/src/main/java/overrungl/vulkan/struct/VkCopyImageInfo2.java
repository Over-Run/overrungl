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
/// ### srcImage
/// [VarHandle][#VH_srcImage] - [Getter][#srcImage()] - [Setter][#srcImage(java.lang.foreign.MemorySegment)]
/// ### srcImageLayout
/// [VarHandle][#VH_srcImageLayout] - [Getter][#srcImageLayout()] - [Setter][#srcImageLayout(int)]
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
/// typedef struct VkCopyImageInfo2 {
///     VkStructureType sType;
///     const void * pNext;
///     VkImage srcImage;
///     VkImageLayout srcImageLayout;
///     VkImage dstImage;
///     VkImageLayout dstImageLayout;
///     uint32_t regionCount;
///     const VkImageCopy2 * pRegions;
/// } VkCopyImageInfo2;
/// ```
public final class VkCopyImageInfo2 extends Struct {
    /// The struct layout of `VkCopyImageInfo2`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("srcImage"),
        ValueLayout.JAVA_INT.withName("srcImageLayout"),
        ValueLayout.ADDRESS.withName("dstImage"),
        ValueLayout.JAVA_INT.withName("dstImageLayout"),
        ValueLayout.JAVA_INT.withName("regionCount"),
        ValueLayout.ADDRESS.withName("pRegions")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `srcImage` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_srcImage = LAYOUT.arrayElementVarHandle(PathElement.groupElement("srcImage"));
    /// The [VarHandle] of `srcImageLayout` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_srcImageLayout = LAYOUT.arrayElementVarHandle(PathElement.groupElement("srcImageLayout"));
    /// The [VarHandle] of `dstImage` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_dstImage = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dstImage"));
    /// The [VarHandle] of `dstImageLayout` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_dstImageLayout = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dstImageLayout"));
    /// The [VarHandle] of `regionCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_regionCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("regionCount"));
    /// The [VarHandle] of `pRegions` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pRegions = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pRegions"));

    /// Creates `VkCopyImageInfo2` with the given segment.
    /// @param segment the memory segment
    public VkCopyImageInfo2(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkCopyImageInfo2` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkCopyImageInfo2 of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkCopyImageInfo2(segment); }

    /// Creates `VkCopyImageInfo2` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkCopyImageInfo2 ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkCopyImageInfo2(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkCopyImageInfo2` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkCopyImageInfo2 ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkCopyImageInfo2(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkCopyImageInfo2` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkCopyImageInfo2`
    public static VkCopyImageInfo2 alloc(SegmentAllocator allocator) { return new VkCopyImageInfo2(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkCopyImageInfo2` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkCopyImageInfo2`
    public static VkCopyImageInfo2 alloc(SegmentAllocator allocator, long count) { return new VkCopyImageInfo2(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkCopyImageInfo2.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkCopyImageInfo2.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkCopyImageInfo2.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkCopyImageInfo2.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkCopyImageInfo2 sTypeAt(long index, @CType("VkStructureType") int value) { VkCopyImageInfo2.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCopyImageInfo2 sType(@CType("VkStructureType") int value) { VkCopyImageInfo2.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkCopyImageInfo2.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkCopyImageInfo2.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkCopyImageInfo2.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkCopyImageInfo2.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkCopyImageInfo2 pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkCopyImageInfo2.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCopyImageInfo2 pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkCopyImageInfo2.set_pNext(this.segment(), value); return this; }

    /// {@return `srcImage` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkImage") java.lang.foreign.MemorySegment get_srcImage(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_srcImage.get(segment, 0L, index); }
    /// {@return `srcImage`}
    /// @param segment the segment of the struct
    public static @CType("VkImage") java.lang.foreign.MemorySegment get_srcImage(MemorySegment segment) { return VkCopyImageInfo2.get_srcImage(segment, 0L); }
    /// {@return `srcImage` at the given index}
    /// @param index the index
    public @CType("VkImage") java.lang.foreign.MemorySegment srcImageAt(long index) { return VkCopyImageInfo2.get_srcImage(this.segment(), index); }
    /// {@return `srcImage`}
    public @CType("VkImage") java.lang.foreign.MemorySegment srcImage() { return VkCopyImageInfo2.get_srcImage(this.segment()); }
    /// Sets `srcImage` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_srcImage(MemorySegment segment, long index, @CType("VkImage") java.lang.foreign.MemorySegment value) { VH_srcImage.set(segment, 0L, index, value); }
    /// Sets `srcImage` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_srcImage(MemorySegment segment, @CType("VkImage") java.lang.foreign.MemorySegment value) { VkCopyImageInfo2.set_srcImage(segment, 0L, value); }
    /// Sets `srcImage` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkCopyImageInfo2 srcImageAt(long index, @CType("VkImage") java.lang.foreign.MemorySegment value) { VkCopyImageInfo2.set_srcImage(this.segment(), index, value); return this; }
    /// Sets `srcImage` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCopyImageInfo2 srcImage(@CType("VkImage") java.lang.foreign.MemorySegment value) { VkCopyImageInfo2.set_srcImage(this.segment(), value); return this; }

    /// {@return `srcImageLayout` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkImageLayout") int get_srcImageLayout(MemorySegment segment, long index) { return (int) VH_srcImageLayout.get(segment, 0L, index); }
    /// {@return `srcImageLayout`}
    /// @param segment the segment of the struct
    public static @CType("VkImageLayout") int get_srcImageLayout(MemorySegment segment) { return VkCopyImageInfo2.get_srcImageLayout(segment, 0L); }
    /// {@return `srcImageLayout` at the given index}
    /// @param index the index
    public @CType("VkImageLayout") int srcImageLayoutAt(long index) { return VkCopyImageInfo2.get_srcImageLayout(this.segment(), index); }
    /// {@return `srcImageLayout`}
    public @CType("VkImageLayout") int srcImageLayout() { return VkCopyImageInfo2.get_srcImageLayout(this.segment()); }
    /// Sets `srcImageLayout` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_srcImageLayout(MemorySegment segment, long index, @CType("VkImageLayout") int value) { VH_srcImageLayout.set(segment, 0L, index, value); }
    /// Sets `srcImageLayout` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_srcImageLayout(MemorySegment segment, @CType("VkImageLayout") int value) { VkCopyImageInfo2.set_srcImageLayout(segment, 0L, value); }
    /// Sets `srcImageLayout` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkCopyImageInfo2 srcImageLayoutAt(long index, @CType("VkImageLayout") int value) { VkCopyImageInfo2.set_srcImageLayout(this.segment(), index, value); return this; }
    /// Sets `srcImageLayout` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCopyImageInfo2 srcImageLayout(@CType("VkImageLayout") int value) { VkCopyImageInfo2.set_srcImageLayout(this.segment(), value); return this; }

    /// {@return `dstImage` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkImage") java.lang.foreign.MemorySegment get_dstImage(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_dstImage.get(segment, 0L, index); }
    /// {@return `dstImage`}
    /// @param segment the segment of the struct
    public static @CType("VkImage") java.lang.foreign.MemorySegment get_dstImage(MemorySegment segment) { return VkCopyImageInfo2.get_dstImage(segment, 0L); }
    /// {@return `dstImage` at the given index}
    /// @param index the index
    public @CType("VkImage") java.lang.foreign.MemorySegment dstImageAt(long index) { return VkCopyImageInfo2.get_dstImage(this.segment(), index); }
    /// {@return `dstImage`}
    public @CType("VkImage") java.lang.foreign.MemorySegment dstImage() { return VkCopyImageInfo2.get_dstImage(this.segment()); }
    /// Sets `dstImage` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_dstImage(MemorySegment segment, long index, @CType("VkImage") java.lang.foreign.MemorySegment value) { VH_dstImage.set(segment, 0L, index, value); }
    /// Sets `dstImage` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_dstImage(MemorySegment segment, @CType("VkImage") java.lang.foreign.MemorySegment value) { VkCopyImageInfo2.set_dstImage(segment, 0L, value); }
    /// Sets `dstImage` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkCopyImageInfo2 dstImageAt(long index, @CType("VkImage") java.lang.foreign.MemorySegment value) { VkCopyImageInfo2.set_dstImage(this.segment(), index, value); return this; }
    /// Sets `dstImage` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCopyImageInfo2 dstImage(@CType("VkImage") java.lang.foreign.MemorySegment value) { VkCopyImageInfo2.set_dstImage(this.segment(), value); return this; }

    /// {@return `dstImageLayout` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkImageLayout") int get_dstImageLayout(MemorySegment segment, long index) { return (int) VH_dstImageLayout.get(segment, 0L, index); }
    /// {@return `dstImageLayout`}
    /// @param segment the segment of the struct
    public static @CType("VkImageLayout") int get_dstImageLayout(MemorySegment segment) { return VkCopyImageInfo2.get_dstImageLayout(segment, 0L); }
    /// {@return `dstImageLayout` at the given index}
    /// @param index the index
    public @CType("VkImageLayout") int dstImageLayoutAt(long index) { return VkCopyImageInfo2.get_dstImageLayout(this.segment(), index); }
    /// {@return `dstImageLayout`}
    public @CType("VkImageLayout") int dstImageLayout() { return VkCopyImageInfo2.get_dstImageLayout(this.segment()); }
    /// Sets `dstImageLayout` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_dstImageLayout(MemorySegment segment, long index, @CType("VkImageLayout") int value) { VH_dstImageLayout.set(segment, 0L, index, value); }
    /// Sets `dstImageLayout` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_dstImageLayout(MemorySegment segment, @CType("VkImageLayout") int value) { VkCopyImageInfo2.set_dstImageLayout(segment, 0L, value); }
    /// Sets `dstImageLayout` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkCopyImageInfo2 dstImageLayoutAt(long index, @CType("VkImageLayout") int value) { VkCopyImageInfo2.set_dstImageLayout(this.segment(), index, value); return this; }
    /// Sets `dstImageLayout` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCopyImageInfo2 dstImageLayout(@CType("VkImageLayout") int value) { VkCopyImageInfo2.set_dstImageLayout(this.segment(), value); return this; }

    /// {@return `regionCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_regionCount(MemorySegment segment, long index) { return (int) VH_regionCount.get(segment, 0L, index); }
    /// {@return `regionCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_regionCount(MemorySegment segment) { return VkCopyImageInfo2.get_regionCount(segment, 0L); }
    /// {@return `regionCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int regionCountAt(long index) { return VkCopyImageInfo2.get_regionCount(this.segment(), index); }
    /// {@return `regionCount`}
    public @CType("uint32_t") int regionCount() { return VkCopyImageInfo2.get_regionCount(this.segment()); }
    /// Sets `regionCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_regionCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_regionCount.set(segment, 0L, index, value); }
    /// Sets `regionCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_regionCount(MemorySegment segment, @CType("uint32_t") int value) { VkCopyImageInfo2.set_regionCount(segment, 0L, value); }
    /// Sets `regionCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkCopyImageInfo2 regionCountAt(long index, @CType("uint32_t") int value) { VkCopyImageInfo2.set_regionCount(this.segment(), index, value); return this; }
    /// Sets `regionCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCopyImageInfo2 regionCount(@CType("uint32_t") int value) { VkCopyImageInfo2.set_regionCount(this.segment(), value); return this; }

    /// {@return `pRegions` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const VkImageCopy2 *") java.lang.foreign.MemorySegment get_pRegions(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pRegions.get(segment, 0L, index); }
    /// {@return `pRegions`}
    /// @param segment the segment of the struct
    public static @CType("const VkImageCopy2 *") java.lang.foreign.MemorySegment get_pRegions(MemorySegment segment) { return VkCopyImageInfo2.get_pRegions(segment, 0L); }
    /// {@return `pRegions` at the given index}
    /// @param index the index
    public @CType("const VkImageCopy2 *") java.lang.foreign.MemorySegment pRegionsAt(long index) { return VkCopyImageInfo2.get_pRegions(this.segment(), index); }
    /// {@return `pRegions`}
    public @CType("const VkImageCopy2 *") java.lang.foreign.MemorySegment pRegions() { return VkCopyImageInfo2.get_pRegions(this.segment()); }
    /// Sets `pRegions` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pRegions(MemorySegment segment, long index, @CType("const VkImageCopy2 *") java.lang.foreign.MemorySegment value) { VH_pRegions.set(segment, 0L, index, value); }
    /// Sets `pRegions` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pRegions(MemorySegment segment, @CType("const VkImageCopy2 *") java.lang.foreign.MemorySegment value) { VkCopyImageInfo2.set_pRegions(segment, 0L, value); }
    /// Sets `pRegions` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkCopyImageInfo2 pRegionsAt(long index, @CType("const VkImageCopy2 *") java.lang.foreign.MemorySegment value) { VkCopyImageInfo2.set_pRegions(this.segment(), index, value); return this; }
    /// Sets `pRegions` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCopyImageInfo2 pRegions(@CType("const VkImageCopy2 *") java.lang.foreign.MemorySegment value) { VkCopyImageInfo2.set_pRegions(this.segment(), value); return this; }

}
