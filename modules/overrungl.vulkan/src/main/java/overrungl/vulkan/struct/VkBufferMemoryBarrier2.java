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
/// ### srcQueueFamilyIndex
/// [VarHandle][#VH_srcQueueFamilyIndex] - [Getter][#srcQueueFamilyIndex()] - [Setter][#srcQueueFamilyIndex(int)]
/// ### dstQueueFamilyIndex
/// [VarHandle][#VH_dstQueueFamilyIndex] - [Getter][#dstQueueFamilyIndex()] - [Setter][#dstQueueFamilyIndex(int)]
/// ### buffer
/// [VarHandle][#VH_buffer] - [Getter][#buffer()] - [Setter][#buffer(java.lang.foreign.MemorySegment)]
/// ### offset
/// [VarHandle][#VH_offset] - [Getter][#offset()] - [Setter][#offset(long)]
/// ### size
/// [VarHandle][#VH_size] - [Getter][#size()] - [Setter][#size(long)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkBufferMemoryBarrier2 {
///     VkStructureType sType;
///     const void * pNext;
///     VkPipelineStageFlags2 srcStageMask;
///     VkAccessFlags2 srcAccessMask;
///     VkPipelineStageFlags2 dstStageMask;
///     VkAccessFlags2 dstAccessMask;
///     uint32_t srcQueueFamilyIndex;
///     uint32_t dstQueueFamilyIndex;
///     VkBuffer buffer;
///     VkDeviceSize offset;
///     VkDeviceSize size;
/// } VkBufferMemoryBarrier2;
/// ```
public final class VkBufferMemoryBarrier2 extends Struct {
    /// The struct layout of `VkBufferMemoryBarrier2`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("srcStageMask"),
        ValueLayout.JAVA_LONG.withName("srcAccessMask"),
        ValueLayout.JAVA_LONG.withName("dstStageMask"),
        ValueLayout.JAVA_LONG.withName("dstAccessMask"),
        ValueLayout.JAVA_INT.withName("srcQueueFamilyIndex"),
        ValueLayout.JAVA_INT.withName("dstQueueFamilyIndex"),
        ValueLayout.ADDRESS.withName("buffer"),
        ValueLayout.JAVA_LONG.withName("offset"),
        ValueLayout.JAVA_LONG.withName("size")
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
    /// The [VarHandle] of `srcQueueFamilyIndex` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_srcQueueFamilyIndex = LAYOUT.arrayElementVarHandle(PathElement.groupElement("srcQueueFamilyIndex"));
    /// The [VarHandle] of `dstQueueFamilyIndex` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_dstQueueFamilyIndex = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dstQueueFamilyIndex"));
    /// The [VarHandle] of `buffer` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_buffer = LAYOUT.arrayElementVarHandle(PathElement.groupElement("buffer"));
    /// The [VarHandle] of `offset` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_offset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("offset"));
    /// The [VarHandle] of `size` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_size = LAYOUT.arrayElementVarHandle(PathElement.groupElement("size"));

    /// Creates `VkBufferMemoryBarrier2` with the given segment.
    /// @param segment the memory segment
    public VkBufferMemoryBarrier2(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkBufferMemoryBarrier2` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkBufferMemoryBarrier2 of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkBufferMemoryBarrier2(segment); }

    /// Creates `VkBufferMemoryBarrier2` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkBufferMemoryBarrier2 ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkBufferMemoryBarrier2(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkBufferMemoryBarrier2` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkBufferMemoryBarrier2 ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkBufferMemoryBarrier2(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkBufferMemoryBarrier2` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkBufferMemoryBarrier2`
    public static VkBufferMemoryBarrier2 alloc(SegmentAllocator allocator) { return new VkBufferMemoryBarrier2(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkBufferMemoryBarrier2` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkBufferMemoryBarrier2`
    public static VkBufferMemoryBarrier2 alloc(SegmentAllocator allocator, long count) { return new VkBufferMemoryBarrier2(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkBufferMemoryBarrier2.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkBufferMemoryBarrier2.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkBufferMemoryBarrier2.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkBufferMemoryBarrier2.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkBufferMemoryBarrier2 sTypeAt(long index, @CType("VkStructureType") int value) { VkBufferMemoryBarrier2.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBufferMemoryBarrier2 sType(@CType("VkStructureType") int value) { VkBufferMemoryBarrier2.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkBufferMemoryBarrier2.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkBufferMemoryBarrier2.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkBufferMemoryBarrier2.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkBufferMemoryBarrier2.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkBufferMemoryBarrier2 pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkBufferMemoryBarrier2.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBufferMemoryBarrier2 pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkBufferMemoryBarrier2.set_pNext(this.segment(), value); return this; }

    /// {@return `srcStageMask` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkPipelineStageFlags2") long get_srcStageMask(MemorySegment segment, long index) { return (long) VH_srcStageMask.get(segment, 0L, index); }
    /// {@return `srcStageMask`}
    /// @param segment the segment of the struct
    public static @CType("VkPipelineStageFlags2") long get_srcStageMask(MemorySegment segment) { return VkBufferMemoryBarrier2.get_srcStageMask(segment, 0L); }
    /// {@return `srcStageMask` at the given index}
    /// @param index the index
    public @CType("VkPipelineStageFlags2") long srcStageMaskAt(long index) { return VkBufferMemoryBarrier2.get_srcStageMask(this.segment(), index); }
    /// {@return `srcStageMask`}
    public @CType("VkPipelineStageFlags2") long srcStageMask() { return VkBufferMemoryBarrier2.get_srcStageMask(this.segment()); }
    /// Sets `srcStageMask` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_srcStageMask(MemorySegment segment, long index, @CType("VkPipelineStageFlags2") long value) { VH_srcStageMask.set(segment, 0L, index, value); }
    /// Sets `srcStageMask` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_srcStageMask(MemorySegment segment, @CType("VkPipelineStageFlags2") long value) { VkBufferMemoryBarrier2.set_srcStageMask(segment, 0L, value); }
    /// Sets `srcStageMask` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkBufferMemoryBarrier2 srcStageMaskAt(long index, @CType("VkPipelineStageFlags2") long value) { VkBufferMemoryBarrier2.set_srcStageMask(this.segment(), index, value); return this; }
    /// Sets `srcStageMask` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBufferMemoryBarrier2 srcStageMask(@CType("VkPipelineStageFlags2") long value) { VkBufferMemoryBarrier2.set_srcStageMask(this.segment(), value); return this; }

    /// {@return `srcAccessMask` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkAccessFlags2") long get_srcAccessMask(MemorySegment segment, long index) { return (long) VH_srcAccessMask.get(segment, 0L, index); }
    /// {@return `srcAccessMask`}
    /// @param segment the segment of the struct
    public static @CType("VkAccessFlags2") long get_srcAccessMask(MemorySegment segment) { return VkBufferMemoryBarrier2.get_srcAccessMask(segment, 0L); }
    /// {@return `srcAccessMask` at the given index}
    /// @param index the index
    public @CType("VkAccessFlags2") long srcAccessMaskAt(long index) { return VkBufferMemoryBarrier2.get_srcAccessMask(this.segment(), index); }
    /// {@return `srcAccessMask`}
    public @CType("VkAccessFlags2") long srcAccessMask() { return VkBufferMemoryBarrier2.get_srcAccessMask(this.segment()); }
    /// Sets `srcAccessMask` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_srcAccessMask(MemorySegment segment, long index, @CType("VkAccessFlags2") long value) { VH_srcAccessMask.set(segment, 0L, index, value); }
    /// Sets `srcAccessMask` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_srcAccessMask(MemorySegment segment, @CType("VkAccessFlags2") long value) { VkBufferMemoryBarrier2.set_srcAccessMask(segment, 0L, value); }
    /// Sets `srcAccessMask` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkBufferMemoryBarrier2 srcAccessMaskAt(long index, @CType("VkAccessFlags2") long value) { VkBufferMemoryBarrier2.set_srcAccessMask(this.segment(), index, value); return this; }
    /// Sets `srcAccessMask` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBufferMemoryBarrier2 srcAccessMask(@CType("VkAccessFlags2") long value) { VkBufferMemoryBarrier2.set_srcAccessMask(this.segment(), value); return this; }

    /// {@return `dstStageMask` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkPipelineStageFlags2") long get_dstStageMask(MemorySegment segment, long index) { return (long) VH_dstStageMask.get(segment, 0L, index); }
    /// {@return `dstStageMask`}
    /// @param segment the segment of the struct
    public static @CType("VkPipelineStageFlags2") long get_dstStageMask(MemorySegment segment) { return VkBufferMemoryBarrier2.get_dstStageMask(segment, 0L); }
    /// {@return `dstStageMask` at the given index}
    /// @param index the index
    public @CType("VkPipelineStageFlags2") long dstStageMaskAt(long index) { return VkBufferMemoryBarrier2.get_dstStageMask(this.segment(), index); }
    /// {@return `dstStageMask`}
    public @CType("VkPipelineStageFlags2") long dstStageMask() { return VkBufferMemoryBarrier2.get_dstStageMask(this.segment()); }
    /// Sets `dstStageMask` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_dstStageMask(MemorySegment segment, long index, @CType("VkPipelineStageFlags2") long value) { VH_dstStageMask.set(segment, 0L, index, value); }
    /// Sets `dstStageMask` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_dstStageMask(MemorySegment segment, @CType("VkPipelineStageFlags2") long value) { VkBufferMemoryBarrier2.set_dstStageMask(segment, 0L, value); }
    /// Sets `dstStageMask` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkBufferMemoryBarrier2 dstStageMaskAt(long index, @CType("VkPipelineStageFlags2") long value) { VkBufferMemoryBarrier2.set_dstStageMask(this.segment(), index, value); return this; }
    /// Sets `dstStageMask` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBufferMemoryBarrier2 dstStageMask(@CType("VkPipelineStageFlags2") long value) { VkBufferMemoryBarrier2.set_dstStageMask(this.segment(), value); return this; }

    /// {@return `dstAccessMask` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkAccessFlags2") long get_dstAccessMask(MemorySegment segment, long index) { return (long) VH_dstAccessMask.get(segment, 0L, index); }
    /// {@return `dstAccessMask`}
    /// @param segment the segment of the struct
    public static @CType("VkAccessFlags2") long get_dstAccessMask(MemorySegment segment) { return VkBufferMemoryBarrier2.get_dstAccessMask(segment, 0L); }
    /// {@return `dstAccessMask` at the given index}
    /// @param index the index
    public @CType("VkAccessFlags2") long dstAccessMaskAt(long index) { return VkBufferMemoryBarrier2.get_dstAccessMask(this.segment(), index); }
    /// {@return `dstAccessMask`}
    public @CType("VkAccessFlags2") long dstAccessMask() { return VkBufferMemoryBarrier2.get_dstAccessMask(this.segment()); }
    /// Sets `dstAccessMask` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_dstAccessMask(MemorySegment segment, long index, @CType("VkAccessFlags2") long value) { VH_dstAccessMask.set(segment, 0L, index, value); }
    /// Sets `dstAccessMask` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_dstAccessMask(MemorySegment segment, @CType("VkAccessFlags2") long value) { VkBufferMemoryBarrier2.set_dstAccessMask(segment, 0L, value); }
    /// Sets `dstAccessMask` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkBufferMemoryBarrier2 dstAccessMaskAt(long index, @CType("VkAccessFlags2") long value) { VkBufferMemoryBarrier2.set_dstAccessMask(this.segment(), index, value); return this; }
    /// Sets `dstAccessMask` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBufferMemoryBarrier2 dstAccessMask(@CType("VkAccessFlags2") long value) { VkBufferMemoryBarrier2.set_dstAccessMask(this.segment(), value); return this; }

    /// {@return `srcQueueFamilyIndex` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_srcQueueFamilyIndex(MemorySegment segment, long index) { return (int) VH_srcQueueFamilyIndex.get(segment, 0L, index); }
    /// {@return `srcQueueFamilyIndex`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_srcQueueFamilyIndex(MemorySegment segment) { return VkBufferMemoryBarrier2.get_srcQueueFamilyIndex(segment, 0L); }
    /// {@return `srcQueueFamilyIndex` at the given index}
    /// @param index the index
    public @CType("uint32_t") int srcQueueFamilyIndexAt(long index) { return VkBufferMemoryBarrier2.get_srcQueueFamilyIndex(this.segment(), index); }
    /// {@return `srcQueueFamilyIndex`}
    public @CType("uint32_t") int srcQueueFamilyIndex() { return VkBufferMemoryBarrier2.get_srcQueueFamilyIndex(this.segment()); }
    /// Sets `srcQueueFamilyIndex` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_srcQueueFamilyIndex(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_srcQueueFamilyIndex.set(segment, 0L, index, value); }
    /// Sets `srcQueueFamilyIndex` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_srcQueueFamilyIndex(MemorySegment segment, @CType("uint32_t") int value) { VkBufferMemoryBarrier2.set_srcQueueFamilyIndex(segment, 0L, value); }
    /// Sets `srcQueueFamilyIndex` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkBufferMemoryBarrier2 srcQueueFamilyIndexAt(long index, @CType("uint32_t") int value) { VkBufferMemoryBarrier2.set_srcQueueFamilyIndex(this.segment(), index, value); return this; }
    /// Sets `srcQueueFamilyIndex` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBufferMemoryBarrier2 srcQueueFamilyIndex(@CType("uint32_t") int value) { VkBufferMemoryBarrier2.set_srcQueueFamilyIndex(this.segment(), value); return this; }

    /// {@return `dstQueueFamilyIndex` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_dstQueueFamilyIndex(MemorySegment segment, long index) { return (int) VH_dstQueueFamilyIndex.get(segment, 0L, index); }
    /// {@return `dstQueueFamilyIndex`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_dstQueueFamilyIndex(MemorySegment segment) { return VkBufferMemoryBarrier2.get_dstQueueFamilyIndex(segment, 0L); }
    /// {@return `dstQueueFamilyIndex` at the given index}
    /// @param index the index
    public @CType("uint32_t") int dstQueueFamilyIndexAt(long index) { return VkBufferMemoryBarrier2.get_dstQueueFamilyIndex(this.segment(), index); }
    /// {@return `dstQueueFamilyIndex`}
    public @CType("uint32_t") int dstQueueFamilyIndex() { return VkBufferMemoryBarrier2.get_dstQueueFamilyIndex(this.segment()); }
    /// Sets `dstQueueFamilyIndex` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_dstQueueFamilyIndex(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_dstQueueFamilyIndex.set(segment, 0L, index, value); }
    /// Sets `dstQueueFamilyIndex` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_dstQueueFamilyIndex(MemorySegment segment, @CType("uint32_t") int value) { VkBufferMemoryBarrier2.set_dstQueueFamilyIndex(segment, 0L, value); }
    /// Sets `dstQueueFamilyIndex` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkBufferMemoryBarrier2 dstQueueFamilyIndexAt(long index, @CType("uint32_t") int value) { VkBufferMemoryBarrier2.set_dstQueueFamilyIndex(this.segment(), index, value); return this; }
    /// Sets `dstQueueFamilyIndex` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBufferMemoryBarrier2 dstQueueFamilyIndex(@CType("uint32_t") int value) { VkBufferMemoryBarrier2.set_dstQueueFamilyIndex(this.segment(), value); return this; }

    /// {@return `buffer` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBuffer") java.lang.foreign.MemorySegment get_buffer(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_buffer.get(segment, 0L, index); }
    /// {@return `buffer`}
    /// @param segment the segment of the struct
    public static @CType("VkBuffer") java.lang.foreign.MemorySegment get_buffer(MemorySegment segment) { return VkBufferMemoryBarrier2.get_buffer(segment, 0L); }
    /// {@return `buffer` at the given index}
    /// @param index the index
    public @CType("VkBuffer") java.lang.foreign.MemorySegment bufferAt(long index) { return VkBufferMemoryBarrier2.get_buffer(this.segment(), index); }
    /// {@return `buffer`}
    public @CType("VkBuffer") java.lang.foreign.MemorySegment buffer() { return VkBufferMemoryBarrier2.get_buffer(this.segment()); }
    /// Sets `buffer` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_buffer(MemorySegment segment, long index, @CType("VkBuffer") java.lang.foreign.MemorySegment value) { VH_buffer.set(segment, 0L, index, value); }
    /// Sets `buffer` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_buffer(MemorySegment segment, @CType("VkBuffer") java.lang.foreign.MemorySegment value) { VkBufferMemoryBarrier2.set_buffer(segment, 0L, value); }
    /// Sets `buffer` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkBufferMemoryBarrier2 bufferAt(long index, @CType("VkBuffer") java.lang.foreign.MemorySegment value) { VkBufferMemoryBarrier2.set_buffer(this.segment(), index, value); return this; }
    /// Sets `buffer` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBufferMemoryBarrier2 buffer(@CType("VkBuffer") java.lang.foreign.MemorySegment value) { VkBufferMemoryBarrier2.set_buffer(this.segment(), value); return this; }

    /// {@return `offset` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDeviceSize") long get_offset(MemorySegment segment, long index) { return (long) VH_offset.get(segment, 0L, index); }
    /// {@return `offset`}
    /// @param segment the segment of the struct
    public static @CType("VkDeviceSize") long get_offset(MemorySegment segment) { return VkBufferMemoryBarrier2.get_offset(segment, 0L); }
    /// {@return `offset` at the given index}
    /// @param index the index
    public @CType("VkDeviceSize") long offsetAt(long index) { return VkBufferMemoryBarrier2.get_offset(this.segment(), index); }
    /// {@return `offset`}
    public @CType("VkDeviceSize") long offset() { return VkBufferMemoryBarrier2.get_offset(this.segment()); }
    /// Sets `offset` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_offset(MemorySegment segment, long index, @CType("VkDeviceSize") long value) { VH_offset.set(segment, 0L, index, value); }
    /// Sets `offset` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_offset(MemorySegment segment, @CType("VkDeviceSize") long value) { VkBufferMemoryBarrier2.set_offset(segment, 0L, value); }
    /// Sets `offset` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkBufferMemoryBarrier2 offsetAt(long index, @CType("VkDeviceSize") long value) { VkBufferMemoryBarrier2.set_offset(this.segment(), index, value); return this; }
    /// Sets `offset` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBufferMemoryBarrier2 offset(@CType("VkDeviceSize") long value) { VkBufferMemoryBarrier2.set_offset(this.segment(), value); return this; }

    /// {@return `size` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDeviceSize") long get_size(MemorySegment segment, long index) { return (long) VH_size.get(segment, 0L, index); }
    /// {@return `size`}
    /// @param segment the segment of the struct
    public static @CType("VkDeviceSize") long get_size(MemorySegment segment) { return VkBufferMemoryBarrier2.get_size(segment, 0L); }
    /// {@return `size` at the given index}
    /// @param index the index
    public @CType("VkDeviceSize") long sizeAt(long index) { return VkBufferMemoryBarrier2.get_size(this.segment(), index); }
    /// {@return `size`}
    public @CType("VkDeviceSize") long size() { return VkBufferMemoryBarrier2.get_size(this.segment()); }
    /// Sets `size` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_size(MemorySegment segment, long index, @CType("VkDeviceSize") long value) { VH_size.set(segment, 0L, index, value); }
    /// Sets `size` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_size(MemorySegment segment, @CType("VkDeviceSize") long value) { VkBufferMemoryBarrier2.set_size(segment, 0L, value); }
    /// Sets `size` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkBufferMemoryBarrier2 sizeAt(long index, @CType("VkDeviceSize") long value) { VkBufferMemoryBarrier2.set_size(this.segment(), index, value); return this; }
    /// Sets `size` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBufferMemoryBarrier2 size(@CType("VkDeviceSize") long value) { VkBufferMemoryBarrier2.set_size(this.segment(), value); return this; }

}
