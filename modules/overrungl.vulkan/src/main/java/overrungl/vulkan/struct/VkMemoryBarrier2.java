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
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkMemoryBarrier2 {
///     VkStructureType sType;
///     const void * pNext;
///     VkPipelineStageFlags2 srcStageMask;
///     VkAccessFlags2 srcAccessMask;
///     VkPipelineStageFlags2 dstStageMask;
///     VkAccessFlags2 dstAccessMask;
/// } VkMemoryBarrier2;
/// ```
public sealed class VkMemoryBarrier2 extends Struct {
    /// The struct layout of `VkMemoryBarrier2`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("srcStageMask"),
        ValueLayout.JAVA_LONG.withName("srcAccessMask"),
        ValueLayout.JAVA_LONG.withName("dstStageMask"),
        ValueLayout.JAVA_LONG.withName("dstAccessMask")
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

    /// Creates `VkMemoryBarrier2` with the given segment.
    /// @param segment the memory segment
    public VkMemoryBarrier2(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkMemoryBarrier2` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkMemoryBarrier2 of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkMemoryBarrier2(segment); }

    /// Creates `VkMemoryBarrier2` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkMemoryBarrier2` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkMemoryBarrier2 ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkMemoryBarrier2(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkMemoryBarrier2` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkMemoryBarrier2` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkMemoryBarrier2`
    public static VkMemoryBarrier2 alloc(SegmentAllocator allocator) { return new VkMemoryBarrier2(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkMemoryBarrier2` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkMemoryBarrier2`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkMemoryBarrier2` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkMemoryBarrier2`
    public static VkMemoryBarrier2 allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("const void *") java.lang.foreign.MemorySegment pNext, @CType("VkPipelineStageFlags2") long srcStageMask, @CType("VkAccessFlags2") long srcAccessMask, @CType("VkPipelineStageFlags2") long dstStageMask, @CType("VkAccessFlags2") long dstAccessMask) { return alloc(allocator).sType(sType).pNext(pNext).srcStageMask(srcStageMask).srcAccessMask(srcAccessMask).dstStageMask(dstStageMask).dstAccessMask(dstAccessMask); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkMemoryBarrier2 copyFrom(VkMemoryBarrier2 src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkMemoryBarrier2.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkMemoryBarrier2.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkMemoryBarrier2.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkMemoryBarrier2 sType(@CType("VkStructureType") int value) { VkMemoryBarrier2.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkMemoryBarrier2.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkMemoryBarrier2.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkMemoryBarrier2.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkMemoryBarrier2 pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkMemoryBarrier2.set_pNext(this.segment(), value); return this; }

    /// {@return `srcStageMask` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkPipelineStageFlags2") long get_srcStageMask(MemorySegment segment, long index) { return (long) VH_srcStageMask.get(segment, 0L, index); }
    /// {@return `srcStageMask`}
    /// @param segment the segment of the struct
    public static @CType("VkPipelineStageFlags2") long get_srcStageMask(MemorySegment segment) { return VkMemoryBarrier2.get_srcStageMask(segment, 0L); }
    /// {@return `srcStageMask`}
    public @CType("VkPipelineStageFlags2") long srcStageMask() { return VkMemoryBarrier2.get_srcStageMask(this.segment()); }
    /// Sets `srcStageMask` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_srcStageMask(MemorySegment segment, long index, @CType("VkPipelineStageFlags2") long value) { VH_srcStageMask.set(segment, 0L, index, value); }
    /// Sets `srcStageMask` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_srcStageMask(MemorySegment segment, @CType("VkPipelineStageFlags2") long value) { VkMemoryBarrier2.set_srcStageMask(segment, 0L, value); }
    /// Sets `srcStageMask` with the given value.
    /// @param value the value
    /// @return `this`
    public VkMemoryBarrier2 srcStageMask(@CType("VkPipelineStageFlags2") long value) { VkMemoryBarrier2.set_srcStageMask(this.segment(), value); return this; }

    /// {@return `srcAccessMask` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkAccessFlags2") long get_srcAccessMask(MemorySegment segment, long index) { return (long) VH_srcAccessMask.get(segment, 0L, index); }
    /// {@return `srcAccessMask`}
    /// @param segment the segment of the struct
    public static @CType("VkAccessFlags2") long get_srcAccessMask(MemorySegment segment) { return VkMemoryBarrier2.get_srcAccessMask(segment, 0L); }
    /// {@return `srcAccessMask`}
    public @CType("VkAccessFlags2") long srcAccessMask() { return VkMemoryBarrier2.get_srcAccessMask(this.segment()); }
    /// Sets `srcAccessMask` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_srcAccessMask(MemorySegment segment, long index, @CType("VkAccessFlags2") long value) { VH_srcAccessMask.set(segment, 0L, index, value); }
    /// Sets `srcAccessMask` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_srcAccessMask(MemorySegment segment, @CType("VkAccessFlags2") long value) { VkMemoryBarrier2.set_srcAccessMask(segment, 0L, value); }
    /// Sets `srcAccessMask` with the given value.
    /// @param value the value
    /// @return `this`
    public VkMemoryBarrier2 srcAccessMask(@CType("VkAccessFlags2") long value) { VkMemoryBarrier2.set_srcAccessMask(this.segment(), value); return this; }

    /// {@return `dstStageMask` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkPipelineStageFlags2") long get_dstStageMask(MemorySegment segment, long index) { return (long) VH_dstStageMask.get(segment, 0L, index); }
    /// {@return `dstStageMask`}
    /// @param segment the segment of the struct
    public static @CType("VkPipelineStageFlags2") long get_dstStageMask(MemorySegment segment) { return VkMemoryBarrier2.get_dstStageMask(segment, 0L); }
    /// {@return `dstStageMask`}
    public @CType("VkPipelineStageFlags2") long dstStageMask() { return VkMemoryBarrier2.get_dstStageMask(this.segment()); }
    /// Sets `dstStageMask` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_dstStageMask(MemorySegment segment, long index, @CType("VkPipelineStageFlags2") long value) { VH_dstStageMask.set(segment, 0L, index, value); }
    /// Sets `dstStageMask` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_dstStageMask(MemorySegment segment, @CType("VkPipelineStageFlags2") long value) { VkMemoryBarrier2.set_dstStageMask(segment, 0L, value); }
    /// Sets `dstStageMask` with the given value.
    /// @param value the value
    /// @return `this`
    public VkMemoryBarrier2 dstStageMask(@CType("VkPipelineStageFlags2") long value) { VkMemoryBarrier2.set_dstStageMask(this.segment(), value); return this; }

    /// {@return `dstAccessMask` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkAccessFlags2") long get_dstAccessMask(MemorySegment segment, long index) { return (long) VH_dstAccessMask.get(segment, 0L, index); }
    /// {@return `dstAccessMask`}
    /// @param segment the segment of the struct
    public static @CType("VkAccessFlags2") long get_dstAccessMask(MemorySegment segment) { return VkMemoryBarrier2.get_dstAccessMask(segment, 0L); }
    /// {@return `dstAccessMask`}
    public @CType("VkAccessFlags2") long dstAccessMask() { return VkMemoryBarrier2.get_dstAccessMask(this.segment()); }
    /// Sets `dstAccessMask` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_dstAccessMask(MemorySegment segment, long index, @CType("VkAccessFlags2") long value) { VH_dstAccessMask.set(segment, 0L, index, value); }
    /// Sets `dstAccessMask` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_dstAccessMask(MemorySegment segment, @CType("VkAccessFlags2") long value) { VkMemoryBarrier2.set_dstAccessMask(segment, 0L, value); }
    /// Sets `dstAccessMask` with the given value.
    /// @param value the value
    /// @return `this`
    public VkMemoryBarrier2 dstAccessMask(@CType("VkAccessFlags2") long value) { VkMemoryBarrier2.set_dstAccessMask(this.segment(), value); return this; }

    /// A buffer of [VkMemoryBarrier2].
    public static final class Buffer extends VkMemoryBarrier2 {
        private final long elementCount;

        /// Creates `VkMemoryBarrier2.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkMemoryBarrier2`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkMemoryBarrier2`
        public VkMemoryBarrier2 asSlice(long index) { return new VkMemoryBarrier2(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkMemoryBarrier2`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkMemoryBarrier2`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkMemoryBarrier2.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkMemoryBarrier2.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkMemoryBarrier2.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkMemoryBarrier2.set_pNext(this.segment(), index, value); return this; }

        /// {@return `srcStageMask` at the given index}
        /// @param index the index
        public @CType("VkPipelineStageFlags2") long srcStageMaskAt(long index) { return VkMemoryBarrier2.get_srcStageMask(this.segment(), index); }
        /// Sets `srcStageMask` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer srcStageMaskAt(long index, @CType("VkPipelineStageFlags2") long value) { VkMemoryBarrier2.set_srcStageMask(this.segment(), index, value); return this; }

        /// {@return `srcAccessMask` at the given index}
        /// @param index the index
        public @CType("VkAccessFlags2") long srcAccessMaskAt(long index) { return VkMemoryBarrier2.get_srcAccessMask(this.segment(), index); }
        /// Sets `srcAccessMask` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer srcAccessMaskAt(long index, @CType("VkAccessFlags2") long value) { VkMemoryBarrier2.set_srcAccessMask(this.segment(), index, value); return this; }

        /// {@return `dstStageMask` at the given index}
        /// @param index the index
        public @CType("VkPipelineStageFlags2") long dstStageMaskAt(long index) { return VkMemoryBarrier2.get_dstStageMask(this.segment(), index); }
        /// Sets `dstStageMask` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer dstStageMaskAt(long index, @CType("VkPipelineStageFlags2") long value) { VkMemoryBarrier2.set_dstStageMask(this.segment(), index, value); return this; }

        /// {@return `dstAccessMask` at the given index}
        /// @param index the index
        public @CType("VkAccessFlags2") long dstAccessMaskAt(long index) { return VkMemoryBarrier2.get_dstAccessMask(this.segment(), index); }
        /// Sets `dstAccessMask` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer dstAccessMaskAt(long index, @CType("VkAccessFlags2") long value) { VkMemoryBarrier2.set_dstAccessMask(this.segment(), index, value); return this; }

    }
}
