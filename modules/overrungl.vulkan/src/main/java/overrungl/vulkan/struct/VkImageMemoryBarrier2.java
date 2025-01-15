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
/// ### srcStageMask
/// [VarHandle][#VH_srcStageMask] - [Getter][#srcStageMask()] - [Setter][#srcStageMask(long)]
/// ### srcAccessMask
/// [VarHandle][#VH_srcAccessMask] - [Getter][#srcAccessMask()] - [Setter][#srcAccessMask(long)]
/// ### dstStageMask
/// [VarHandle][#VH_dstStageMask] - [Getter][#dstStageMask()] - [Setter][#dstStageMask(long)]
/// ### dstAccessMask
/// [VarHandle][#VH_dstAccessMask] - [Getter][#dstAccessMask()] - [Setter][#dstAccessMask(long)]
/// ### oldLayout
/// [VarHandle][#VH_oldLayout] - [Getter][#oldLayout()] - [Setter][#oldLayout(int)]
/// ### newLayout
/// [VarHandle][#VH_newLayout] - [Getter][#newLayout()] - [Setter][#newLayout(int)]
/// ### srcQueueFamilyIndex
/// [VarHandle][#VH_srcQueueFamilyIndex] - [Getter][#srcQueueFamilyIndex()] - [Setter][#srcQueueFamilyIndex(int)]
/// ### dstQueueFamilyIndex
/// [VarHandle][#VH_dstQueueFamilyIndex] - [Getter][#dstQueueFamilyIndex()] - [Setter][#dstQueueFamilyIndex(int)]
/// ### image
/// [VarHandle][#VH_image] - [Getter][#image()] - [Setter][#image(java.lang.foreign.MemorySegment)]
/// ### subresourceRange
/// [Byte offset][#OFFSET_subresourceRange] - [Memory layout][#ML_subresourceRange] - [Getter][#subresourceRange()] - [Setter][#subresourceRange(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkImageMemoryBarrier2 {
///     VkStructureType sType;
///     const void * pNext;
///     VkPipelineStageFlags2 srcStageMask;
///     VkAccessFlags2 srcAccessMask;
///     VkPipelineStageFlags2 dstStageMask;
///     VkAccessFlags2 dstAccessMask;
///     VkImageLayout oldLayout;
///     VkImageLayout newLayout;
///     uint32_t srcQueueFamilyIndex;
///     uint32_t dstQueueFamilyIndex;
///     VkImage image;
///     VkImageSubresourceRange subresourceRange;
/// } VkImageMemoryBarrier2;
/// ```
public sealed class VkImageMemoryBarrier2 extends Struct {
    /// The struct layout of `VkImageMemoryBarrier2`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("srcStageMask"),
        ValueLayout.JAVA_LONG.withName("srcAccessMask"),
        ValueLayout.JAVA_LONG.withName("dstStageMask"),
        ValueLayout.JAVA_LONG.withName("dstAccessMask"),
        ValueLayout.JAVA_INT.withName("oldLayout"),
        ValueLayout.JAVA_INT.withName("newLayout"),
        ValueLayout.JAVA_INT.withName("srcQueueFamilyIndex"),
        ValueLayout.JAVA_INT.withName("dstQueueFamilyIndex"),
        ValueLayout.ADDRESS.withName("image"),
        overrungl.vulkan.struct.VkImageSubresourceRange.LAYOUT.withName("subresourceRange")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `srcStageMask` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_srcStageMask = LAYOUT.arrayElementVarHandle(PathElement.groupElement("srcStageMask"));
    /// The [VarHandle] of `srcAccessMask` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_srcAccessMask = LAYOUT.arrayElementVarHandle(PathElement.groupElement("srcAccessMask"));
    /// The [VarHandle] of `dstStageMask` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_dstStageMask = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dstStageMask"));
    /// The [VarHandle] of `dstAccessMask` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_dstAccessMask = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dstAccessMask"));
    /// The [VarHandle] of `oldLayout` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_oldLayout = LAYOUT.arrayElementVarHandle(PathElement.groupElement("oldLayout"));
    /// The [VarHandle] of `newLayout` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_newLayout = LAYOUT.arrayElementVarHandle(PathElement.groupElement("newLayout"));
    /// The [VarHandle] of `srcQueueFamilyIndex` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_srcQueueFamilyIndex = LAYOUT.arrayElementVarHandle(PathElement.groupElement("srcQueueFamilyIndex"));
    /// The [VarHandle] of `dstQueueFamilyIndex` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_dstQueueFamilyIndex = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dstQueueFamilyIndex"));
    /// The [VarHandle] of `image` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_image = LAYOUT.arrayElementVarHandle(PathElement.groupElement("image"));
    /// The byte offset of `subresourceRange`.
    public static final long OFFSET_subresourceRange = LAYOUT.byteOffset(PathElement.groupElement("subresourceRange"));
    /// The memory layout of `subresourceRange`.
    public static final MemoryLayout ML_subresourceRange = LAYOUT.select(PathElement.groupElement("subresourceRange"));

    /// Creates `VkImageMemoryBarrier2` with the given segment.
    /// @param segment the memory segment
    public VkImageMemoryBarrier2(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkImageMemoryBarrier2` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkImageMemoryBarrier2 of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkImageMemoryBarrier2(segment); }

    /// Creates `VkImageMemoryBarrier2` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkImageMemoryBarrier2` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkImageMemoryBarrier2 ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkImageMemoryBarrier2(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkImageMemoryBarrier2` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkImageMemoryBarrier2` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkImageMemoryBarrier2`
    public static VkImageMemoryBarrier2 alloc(SegmentAllocator allocator) { return new VkImageMemoryBarrier2(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkImageMemoryBarrier2` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkImageMemoryBarrier2`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkImageMemoryBarrier2` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkImageMemoryBarrier2`
    public static VkImageMemoryBarrier2 allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("const void *") java.lang.foreign.MemorySegment pNext, @CType("VkPipelineStageFlags2") long srcStageMask, @CType("VkAccessFlags2") long srcAccessMask, @CType("VkPipelineStageFlags2") long dstStageMask, @CType("VkAccessFlags2") long dstAccessMask, @CType("VkImageLayout") int oldLayout, @CType("VkImageLayout") int newLayout, @CType("uint32_t") int srcQueueFamilyIndex, @CType("uint32_t") int dstQueueFamilyIndex, @CType("VkImage") java.lang.foreign.MemorySegment image, @CType("VkImageSubresourceRange") java.lang.foreign.MemorySegment subresourceRange) { return alloc(allocator).sType(sType).pNext(pNext).srcStageMask(srcStageMask).srcAccessMask(srcAccessMask).dstStageMask(dstStageMask).dstAccessMask(dstAccessMask).oldLayout(oldLayout).newLayout(newLayout).srcQueueFamilyIndex(srcQueueFamilyIndex).dstQueueFamilyIndex(dstQueueFamilyIndex).image(image).subresourceRange(subresourceRange); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkImageMemoryBarrier2 copyFrom(VkImageMemoryBarrier2 src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkImageMemoryBarrier2.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkImageMemoryBarrier2.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkImageMemoryBarrier2.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageMemoryBarrier2 sType(@CType("VkStructureType") int value) { VkImageMemoryBarrier2.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkImageMemoryBarrier2.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkImageMemoryBarrier2.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkImageMemoryBarrier2.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageMemoryBarrier2 pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkImageMemoryBarrier2.set_pNext(this.segment(), value); return this; }

    /// {@return `srcStageMask` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkPipelineStageFlags2") long get_srcStageMask(MemorySegment segment, long index) { return (long) VH_srcStageMask.get(segment, 0L, index); }
    /// {@return `srcStageMask`}
    /// @param segment the segment of the struct
    public static @CType("VkPipelineStageFlags2") long get_srcStageMask(MemorySegment segment) { return VkImageMemoryBarrier2.get_srcStageMask(segment, 0L); }
    /// {@return `srcStageMask`}
    public @CType("VkPipelineStageFlags2") long srcStageMask() { return VkImageMemoryBarrier2.get_srcStageMask(this.segment()); }
    /// Sets `srcStageMask` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_srcStageMask(MemorySegment segment, long index, @CType("VkPipelineStageFlags2") long value) { VH_srcStageMask.set(segment, 0L, index, value); }
    /// Sets `srcStageMask` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_srcStageMask(MemorySegment segment, @CType("VkPipelineStageFlags2") long value) { VkImageMemoryBarrier2.set_srcStageMask(segment, 0L, value); }
    /// Sets `srcStageMask` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageMemoryBarrier2 srcStageMask(@CType("VkPipelineStageFlags2") long value) { VkImageMemoryBarrier2.set_srcStageMask(this.segment(), value); return this; }

    /// {@return `srcAccessMask` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkAccessFlags2") long get_srcAccessMask(MemorySegment segment, long index) { return (long) VH_srcAccessMask.get(segment, 0L, index); }
    /// {@return `srcAccessMask`}
    /// @param segment the segment of the struct
    public static @CType("VkAccessFlags2") long get_srcAccessMask(MemorySegment segment) { return VkImageMemoryBarrier2.get_srcAccessMask(segment, 0L); }
    /// {@return `srcAccessMask`}
    public @CType("VkAccessFlags2") long srcAccessMask() { return VkImageMemoryBarrier2.get_srcAccessMask(this.segment()); }
    /// Sets `srcAccessMask` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_srcAccessMask(MemorySegment segment, long index, @CType("VkAccessFlags2") long value) { VH_srcAccessMask.set(segment, 0L, index, value); }
    /// Sets `srcAccessMask` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_srcAccessMask(MemorySegment segment, @CType("VkAccessFlags2") long value) { VkImageMemoryBarrier2.set_srcAccessMask(segment, 0L, value); }
    /// Sets `srcAccessMask` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageMemoryBarrier2 srcAccessMask(@CType("VkAccessFlags2") long value) { VkImageMemoryBarrier2.set_srcAccessMask(this.segment(), value); return this; }

    /// {@return `dstStageMask` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkPipelineStageFlags2") long get_dstStageMask(MemorySegment segment, long index) { return (long) VH_dstStageMask.get(segment, 0L, index); }
    /// {@return `dstStageMask`}
    /// @param segment the segment of the struct
    public static @CType("VkPipelineStageFlags2") long get_dstStageMask(MemorySegment segment) { return VkImageMemoryBarrier2.get_dstStageMask(segment, 0L); }
    /// {@return `dstStageMask`}
    public @CType("VkPipelineStageFlags2") long dstStageMask() { return VkImageMemoryBarrier2.get_dstStageMask(this.segment()); }
    /// Sets `dstStageMask` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_dstStageMask(MemorySegment segment, long index, @CType("VkPipelineStageFlags2") long value) { VH_dstStageMask.set(segment, 0L, index, value); }
    /// Sets `dstStageMask` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_dstStageMask(MemorySegment segment, @CType("VkPipelineStageFlags2") long value) { VkImageMemoryBarrier2.set_dstStageMask(segment, 0L, value); }
    /// Sets `dstStageMask` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageMemoryBarrier2 dstStageMask(@CType("VkPipelineStageFlags2") long value) { VkImageMemoryBarrier2.set_dstStageMask(this.segment(), value); return this; }

    /// {@return `dstAccessMask` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkAccessFlags2") long get_dstAccessMask(MemorySegment segment, long index) { return (long) VH_dstAccessMask.get(segment, 0L, index); }
    /// {@return `dstAccessMask`}
    /// @param segment the segment of the struct
    public static @CType("VkAccessFlags2") long get_dstAccessMask(MemorySegment segment) { return VkImageMemoryBarrier2.get_dstAccessMask(segment, 0L); }
    /// {@return `dstAccessMask`}
    public @CType("VkAccessFlags2") long dstAccessMask() { return VkImageMemoryBarrier2.get_dstAccessMask(this.segment()); }
    /// Sets `dstAccessMask` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_dstAccessMask(MemorySegment segment, long index, @CType("VkAccessFlags2") long value) { VH_dstAccessMask.set(segment, 0L, index, value); }
    /// Sets `dstAccessMask` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_dstAccessMask(MemorySegment segment, @CType("VkAccessFlags2") long value) { VkImageMemoryBarrier2.set_dstAccessMask(segment, 0L, value); }
    /// Sets `dstAccessMask` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageMemoryBarrier2 dstAccessMask(@CType("VkAccessFlags2") long value) { VkImageMemoryBarrier2.set_dstAccessMask(this.segment(), value); return this; }

    /// {@return `oldLayout` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkImageLayout") int get_oldLayout(MemorySegment segment, long index) { return (int) VH_oldLayout.get(segment, 0L, index); }
    /// {@return `oldLayout`}
    /// @param segment the segment of the struct
    public static @CType("VkImageLayout") int get_oldLayout(MemorySegment segment) { return VkImageMemoryBarrier2.get_oldLayout(segment, 0L); }
    /// {@return `oldLayout`}
    public @CType("VkImageLayout") int oldLayout() { return VkImageMemoryBarrier2.get_oldLayout(this.segment()); }
    /// Sets `oldLayout` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_oldLayout(MemorySegment segment, long index, @CType("VkImageLayout") int value) { VH_oldLayout.set(segment, 0L, index, value); }
    /// Sets `oldLayout` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_oldLayout(MemorySegment segment, @CType("VkImageLayout") int value) { VkImageMemoryBarrier2.set_oldLayout(segment, 0L, value); }
    /// Sets `oldLayout` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageMemoryBarrier2 oldLayout(@CType("VkImageLayout") int value) { VkImageMemoryBarrier2.set_oldLayout(this.segment(), value); return this; }

    /// {@return `newLayout` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkImageLayout") int get_newLayout(MemorySegment segment, long index) { return (int) VH_newLayout.get(segment, 0L, index); }
    /// {@return `newLayout`}
    /// @param segment the segment of the struct
    public static @CType("VkImageLayout") int get_newLayout(MemorySegment segment) { return VkImageMemoryBarrier2.get_newLayout(segment, 0L); }
    /// {@return `newLayout`}
    public @CType("VkImageLayout") int newLayout() { return VkImageMemoryBarrier2.get_newLayout(this.segment()); }
    /// Sets `newLayout` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_newLayout(MemorySegment segment, long index, @CType("VkImageLayout") int value) { VH_newLayout.set(segment, 0L, index, value); }
    /// Sets `newLayout` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_newLayout(MemorySegment segment, @CType("VkImageLayout") int value) { VkImageMemoryBarrier2.set_newLayout(segment, 0L, value); }
    /// Sets `newLayout` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageMemoryBarrier2 newLayout(@CType("VkImageLayout") int value) { VkImageMemoryBarrier2.set_newLayout(this.segment(), value); return this; }

    /// {@return `srcQueueFamilyIndex` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_srcQueueFamilyIndex(MemorySegment segment, long index) { return (int) VH_srcQueueFamilyIndex.get(segment, 0L, index); }
    /// {@return `srcQueueFamilyIndex`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_srcQueueFamilyIndex(MemorySegment segment) { return VkImageMemoryBarrier2.get_srcQueueFamilyIndex(segment, 0L); }
    /// {@return `srcQueueFamilyIndex`}
    public @CType("uint32_t") int srcQueueFamilyIndex() { return VkImageMemoryBarrier2.get_srcQueueFamilyIndex(this.segment()); }
    /// Sets `srcQueueFamilyIndex` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_srcQueueFamilyIndex(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_srcQueueFamilyIndex.set(segment, 0L, index, value); }
    /// Sets `srcQueueFamilyIndex` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_srcQueueFamilyIndex(MemorySegment segment, @CType("uint32_t") int value) { VkImageMemoryBarrier2.set_srcQueueFamilyIndex(segment, 0L, value); }
    /// Sets `srcQueueFamilyIndex` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageMemoryBarrier2 srcQueueFamilyIndex(@CType("uint32_t") int value) { VkImageMemoryBarrier2.set_srcQueueFamilyIndex(this.segment(), value); return this; }

    /// {@return `dstQueueFamilyIndex` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_dstQueueFamilyIndex(MemorySegment segment, long index) { return (int) VH_dstQueueFamilyIndex.get(segment, 0L, index); }
    /// {@return `dstQueueFamilyIndex`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_dstQueueFamilyIndex(MemorySegment segment) { return VkImageMemoryBarrier2.get_dstQueueFamilyIndex(segment, 0L); }
    /// {@return `dstQueueFamilyIndex`}
    public @CType("uint32_t") int dstQueueFamilyIndex() { return VkImageMemoryBarrier2.get_dstQueueFamilyIndex(this.segment()); }
    /// Sets `dstQueueFamilyIndex` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_dstQueueFamilyIndex(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_dstQueueFamilyIndex.set(segment, 0L, index, value); }
    /// Sets `dstQueueFamilyIndex` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_dstQueueFamilyIndex(MemorySegment segment, @CType("uint32_t") int value) { VkImageMemoryBarrier2.set_dstQueueFamilyIndex(segment, 0L, value); }
    /// Sets `dstQueueFamilyIndex` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageMemoryBarrier2 dstQueueFamilyIndex(@CType("uint32_t") int value) { VkImageMemoryBarrier2.set_dstQueueFamilyIndex(this.segment(), value); return this; }

    /// {@return `image` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkImage") java.lang.foreign.MemorySegment get_image(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_image.get(segment, 0L, index); }
    /// {@return `image`}
    /// @param segment the segment of the struct
    public static @CType("VkImage") java.lang.foreign.MemorySegment get_image(MemorySegment segment) { return VkImageMemoryBarrier2.get_image(segment, 0L); }
    /// {@return `image`}
    public @CType("VkImage") java.lang.foreign.MemorySegment image() { return VkImageMemoryBarrier2.get_image(this.segment()); }
    /// Sets `image` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_image(MemorySegment segment, long index, @CType("VkImage") java.lang.foreign.MemorySegment value) { VH_image.set(segment, 0L, index, value); }
    /// Sets `image` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_image(MemorySegment segment, @CType("VkImage") java.lang.foreign.MemorySegment value) { VkImageMemoryBarrier2.set_image(segment, 0L, value); }
    /// Sets `image` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageMemoryBarrier2 image(@CType("VkImage") java.lang.foreign.MemorySegment value) { VkImageMemoryBarrier2.set_image(this.segment(), value); return this; }

    /// {@return `subresourceRange` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkImageSubresourceRange") java.lang.foreign.MemorySegment get_subresourceRange(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_subresourceRange, index), ML_subresourceRange); }
    /// {@return `subresourceRange`}
    /// @param segment the segment of the struct
    public static @CType("VkImageSubresourceRange") java.lang.foreign.MemorySegment get_subresourceRange(MemorySegment segment) { return VkImageMemoryBarrier2.get_subresourceRange(segment, 0L); }
    /// {@return `subresourceRange`}
    public @CType("VkImageSubresourceRange") java.lang.foreign.MemorySegment subresourceRange() { return VkImageMemoryBarrier2.get_subresourceRange(this.segment()); }
    /// Sets `subresourceRange` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_subresourceRange(MemorySegment segment, long index, @CType("VkImageSubresourceRange") java.lang.foreign.MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_subresourceRange, index), ML_subresourceRange.byteSize()); }
    /// Sets `subresourceRange` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_subresourceRange(MemorySegment segment, @CType("VkImageSubresourceRange") java.lang.foreign.MemorySegment value) { VkImageMemoryBarrier2.set_subresourceRange(segment, 0L, value); }
    /// Sets `subresourceRange` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageMemoryBarrier2 subresourceRange(@CType("VkImageSubresourceRange") java.lang.foreign.MemorySegment value) { VkImageMemoryBarrier2.set_subresourceRange(this.segment(), value); return this; }

    /// A buffer of [VkImageMemoryBarrier2].
    public static final class Buffer extends VkImageMemoryBarrier2 {
        private final long elementCount;

        /// Creates `VkImageMemoryBarrier2.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkImageMemoryBarrier2`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkImageMemoryBarrier2`
        public VkImageMemoryBarrier2 asSlice(long index) { return new VkImageMemoryBarrier2(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkImageMemoryBarrier2`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkImageMemoryBarrier2`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkImageMemoryBarrier2.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkImageMemoryBarrier2.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkImageMemoryBarrier2.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkImageMemoryBarrier2.set_pNext(this.segment(), index, value); return this; }

        /// {@return `srcStageMask` at the given index}
        /// @param index the index
        public @CType("VkPipelineStageFlags2") long srcStageMaskAt(long index) { return VkImageMemoryBarrier2.get_srcStageMask(this.segment(), index); }
        /// Sets `srcStageMask` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer srcStageMaskAt(long index, @CType("VkPipelineStageFlags2") long value) { VkImageMemoryBarrier2.set_srcStageMask(this.segment(), index, value); return this; }

        /// {@return `srcAccessMask` at the given index}
        /// @param index the index
        public @CType("VkAccessFlags2") long srcAccessMaskAt(long index) { return VkImageMemoryBarrier2.get_srcAccessMask(this.segment(), index); }
        /// Sets `srcAccessMask` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer srcAccessMaskAt(long index, @CType("VkAccessFlags2") long value) { VkImageMemoryBarrier2.set_srcAccessMask(this.segment(), index, value); return this; }

        /// {@return `dstStageMask` at the given index}
        /// @param index the index
        public @CType("VkPipelineStageFlags2") long dstStageMaskAt(long index) { return VkImageMemoryBarrier2.get_dstStageMask(this.segment(), index); }
        /// Sets `dstStageMask` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer dstStageMaskAt(long index, @CType("VkPipelineStageFlags2") long value) { VkImageMemoryBarrier2.set_dstStageMask(this.segment(), index, value); return this; }

        /// {@return `dstAccessMask` at the given index}
        /// @param index the index
        public @CType("VkAccessFlags2") long dstAccessMaskAt(long index) { return VkImageMemoryBarrier2.get_dstAccessMask(this.segment(), index); }
        /// Sets `dstAccessMask` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer dstAccessMaskAt(long index, @CType("VkAccessFlags2") long value) { VkImageMemoryBarrier2.set_dstAccessMask(this.segment(), index, value); return this; }

        /// {@return `oldLayout` at the given index}
        /// @param index the index
        public @CType("VkImageLayout") int oldLayoutAt(long index) { return VkImageMemoryBarrier2.get_oldLayout(this.segment(), index); }
        /// Sets `oldLayout` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer oldLayoutAt(long index, @CType("VkImageLayout") int value) { VkImageMemoryBarrier2.set_oldLayout(this.segment(), index, value); return this; }

        /// {@return `newLayout` at the given index}
        /// @param index the index
        public @CType("VkImageLayout") int newLayoutAt(long index) { return VkImageMemoryBarrier2.get_newLayout(this.segment(), index); }
        /// Sets `newLayout` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer newLayoutAt(long index, @CType("VkImageLayout") int value) { VkImageMemoryBarrier2.set_newLayout(this.segment(), index, value); return this; }

        /// {@return `srcQueueFamilyIndex` at the given index}
        /// @param index the index
        public @CType("uint32_t") int srcQueueFamilyIndexAt(long index) { return VkImageMemoryBarrier2.get_srcQueueFamilyIndex(this.segment(), index); }
        /// Sets `srcQueueFamilyIndex` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer srcQueueFamilyIndexAt(long index, @CType("uint32_t") int value) { VkImageMemoryBarrier2.set_srcQueueFamilyIndex(this.segment(), index, value); return this; }

        /// {@return `dstQueueFamilyIndex` at the given index}
        /// @param index the index
        public @CType("uint32_t") int dstQueueFamilyIndexAt(long index) { return VkImageMemoryBarrier2.get_dstQueueFamilyIndex(this.segment(), index); }
        /// Sets `dstQueueFamilyIndex` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer dstQueueFamilyIndexAt(long index, @CType("uint32_t") int value) { VkImageMemoryBarrier2.set_dstQueueFamilyIndex(this.segment(), index, value); return this; }

        /// {@return `image` at the given index}
        /// @param index the index
        public @CType("VkImage") java.lang.foreign.MemorySegment imageAt(long index) { return VkImageMemoryBarrier2.get_image(this.segment(), index); }
        /// Sets `image` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer imageAt(long index, @CType("VkImage") java.lang.foreign.MemorySegment value) { VkImageMemoryBarrier2.set_image(this.segment(), index, value); return this; }

        /// {@return `subresourceRange` at the given index}
        /// @param index the index
        public @CType("VkImageSubresourceRange") java.lang.foreign.MemorySegment subresourceRangeAt(long index) { return VkImageMemoryBarrier2.get_subresourceRange(this.segment(), index); }
        /// Sets `subresourceRange` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer subresourceRangeAt(long index, @CType("VkImageSubresourceRange") java.lang.foreign.MemorySegment value) { VkImageMemoryBarrier2.set_subresourceRange(this.segment(), index, value); return this; }

    }
}
