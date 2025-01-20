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
/// ### srcAccessMask
/// [VarHandle][#VH_srcAccessMask] - [Getter][#srcAccessMask()] - [Setter][#srcAccessMask(int)]
/// ### dstAccessMask
/// [VarHandle][#VH_dstAccessMask] - [Getter][#dstAccessMask()] - [Setter][#dstAccessMask(int)]
/// ### srcQueueFamilyIndex
/// [VarHandle][#VH_srcQueueFamilyIndex] - [Getter][#srcQueueFamilyIndex()] - [Setter][#srcQueueFamilyIndex(int)]
/// ### dstQueueFamilyIndex
/// [VarHandle][#VH_dstQueueFamilyIndex] - [Getter][#dstQueueFamilyIndex()] - [Setter][#dstQueueFamilyIndex(int)]
/// ### buffer
/// [VarHandle][#VH_buffer] - [Getter][#buffer()] - [Setter][#buffer(MemorySegment)]
/// ### offset
/// [VarHandle][#VH_offset] - [Getter][#offset()] - [Setter][#offset(long)]
/// ### size
/// [VarHandle][#VH_size] - [Getter][#size()] - [Setter][#size(long)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkBufferMemoryBarrier {
///     VkStructureType sType;
///     const void * pNext;
///     VkAccessFlags srcAccessMask;
///     VkAccessFlags dstAccessMask;
///     uint32_t srcQueueFamilyIndex;
///     uint32_t dstQueueFamilyIndex;
///     VkBuffer buffer;
///     VkDeviceSize offset;
///     VkDeviceSize size;
/// } VkBufferMemoryBarrier;
/// ```
public sealed class VkBufferMemoryBarrier extends Struct {
    /// The struct layout of `VkBufferMemoryBarrier`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("srcAccessMask"),
        ValueLayout.JAVA_INT.withName("dstAccessMask"),
        ValueLayout.JAVA_INT.withName("srcQueueFamilyIndex"),
        ValueLayout.JAVA_INT.withName("dstQueueFamilyIndex"),
        ValueLayout.ADDRESS.withName("buffer"),
        ValueLayout.JAVA_LONG.withName("offset"),
        ValueLayout.JAVA_LONG.withName("size")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `srcAccessMask` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_srcAccessMask = LAYOUT.arrayElementVarHandle(PathElement.groupElement("srcAccessMask"));
    /// The [VarHandle] of `dstAccessMask` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_dstAccessMask = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dstAccessMask"));
    /// The [VarHandle] of `srcQueueFamilyIndex` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_srcQueueFamilyIndex = LAYOUT.arrayElementVarHandle(PathElement.groupElement("srcQueueFamilyIndex"));
    /// The [VarHandle] of `dstQueueFamilyIndex` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_dstQueueFamilyIndex = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dstQueueFamilyIndex"));
    /// The [VarHandle] of `buffer` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_buffer = LAYOUT.arrayElementVarHandle(PathElement.groupElement("buffer"));
    /// The [VarHandle] of `offset` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_offset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("offset"));
    /// The [VarHandle] of `size` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_size = LAYOUT.arrayElementVarHandle(PathElement.groupElement("size"));

    /// Creates `VkBufferMemoryBarrier` with the given segment.
    /// @param segment the memory segment
    public VkBufferMemoryBarrier(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkBufferMemoryBarrier` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkBufferMemoryBarrier of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkBufferMemoryBarrier(segment); }

    /// Creates `VkBufferMemoryBarrier` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkBufferMemoryBarrier` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkBufferMemoryBarrier ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkBufferMemoryBarrier(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkBufferMemoryBarrier` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkBufferMemoryBarrier` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkBufferMemoryBarrier`
    public static VkBufferMemoryBarrier alloc(SegmentAllocator allocator) { return new VkBufferMemoryBarrier(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkBufferMemoryBarrier` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkBufferMemoryBarrier`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkBufferMemoryBarrier` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkBufferMemoryBarrier`
    public static VkBufferMemoryBarrier allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("const void *") MemorySegment pNext, @CType("VkAccessFlags") int srcAccessMask, @CType("VkAccessFlags") int dstAccessMask, @CType("uint32_t") int srcQueueFamilyIndex, @CType("uint32_t") int dstQueueFamilyIndex, @CType("VkBuffer") MemorySegment buffer, @CType("VkDeviceSize") long offset, @CType("VkDeviceSize") long size) { return alloc(allocator).sType(sType).pNext(pNext).srcAccessMask(srcAccessMask).dstAccessMask(dstAccessMask).srcQueueFamilyIndex(srcQueueFamilyIndex).dstQueueFamilyIndex(dstQueueFamilyIndex).buffer(buffer).offset(offset).size(size); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkBufferMemoryBarrier copyFrom(VkBufferMemoryBarrier src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkBufferMemoryBarrier.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkBufferMemoryBarrier.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkBufferMemoryBarrier.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBufferMemoryBarrier sType(@CType("VkStructureType") int value) { VkBufferMemoryBarrier.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") MemorySegment get_pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") MemorySegment get_pNext(MemorySegment segment) { return VkBufferMemoryBarrier.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("const void *") MemorySegment pNext() { return VkBufferMemoryBarrier.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") MemorySegment value) { VkBufferMemoryBarrier.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBufferMemoryBarrier pNext(@CType("const void *") MemorySegment value) { VkBufferMemoryBarrier.set_pNext(this.segment(), value); return this; }

    /// {@return `srcAccessMask` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkAccessFlags") int get_srcAccessMask(MemorySegment segment, long index) { return (int) VH_srcAccessMask.get(segment, 0L, index); }
    /// {@return `srcAccessMask`}
    /// @param segment the segment of the struct
    public static @CType("VkAccessFlags") int get_srcAccessMask(MemorySegment segment) { return VkBufferMemoryBarrier.get_srcAccessMask(segment, 0L); }
    /// {@return `srcAccessMask`}
    public @CType("VkAccessFlags") int srcAccessMask() { return VkBufferMemoryBarrier.get_srcAccessMask(this.segment()); }
    /// Sets `srcAccessMask` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_srcAccessMask(MemorySegment segment, long index, @CType("VkAccessFlags") int value) { VH_srcAccessMask.set(segment, 0L, index, value); }
    /// Sets `srcAccessMask` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_srcAccessMask(MemorySegment segment, @CType("VkAccessFlags") int value) { VkBufferMemoryBarrier.set_srcAccessMask(segment, 0L, value); }
    /// Sets `srcAccessMask` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBufferMemoryBarrier srcAccessMask(@CType("VkAccessFlags") int value) { VkBufferMemoryBarrier.set_srcAccessMask(this.segment(), value); return this; }

    /// {@return `dstAccessMask` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkAccessFlags") int get_dstAccessMask(MemorySegment segment, long index) { return (int) VH_dstAccessMask.get(segment, 0L, index); }
    /// {@return `dstAccessMask`}
    /// @param segment the segment of the struct
    public static @CType("VkAccessFlags") int get_dstAccessMask(MemorySegment segment) { return VkBufferMemoryBarrier.get_dstAccessMask(segment, 0L); }
    /// {@return `dstAccessMask`}
    public @CType("VkAccessFlags") int dstAccessMask() { return VkBufferMemoryBarrier.get_dstAccessMask(this.segment()); }
    /// Sets `dstAccessMask` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_dstAccessMask(MemorySegment segment, long index, @CType("VkAccessFlags") int value) { VH_dstAccessMask.set(segment, 0L, index, value); }
    /// Sets `dstAccessMask` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_dstAccessMask(MemorySegment segment, @CType("VkAccessFlags") int value) { VkBufferMemoryBarrier.set_dstAccessMask(segment, 0L, value); }
    /// Sets `dstAccessMask` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBufferMemoryBarrier dstAccessMask(@CType("VkAccessFlags") int value) { VkBufferMemoryBarrier.set_dstAccessMask(this.segment(), value); return this; }

    /// {@return `srcQueueFamilyIndex` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_srcQueueFamilyIndex(MemorySegment segment, long index) { return (int) VH_srcQueueFamilyIndex.get(segment, 0L, index); }
    /// {@return `srcQueueFamilyIndex`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_srcQueueFamilyIndex(MemorySegment segment) { return VkBufferMemoryBarrier.get_srcQueueFamilyIndex(segment, 0L); }
    /// {@return `srcQueueFamilyIndex`}
    public @CType("uint32_t") int srcQueueFamilyIndex() { return VkBufferMemoryBarrier.get_srcQueueFamilyIndex(this.segment()); }
    /// Sets `srcQueueFamilyIndex` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_srcQueueFamilyIndex(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_srcQueueFamilyIndex.set(segment, 0L, index, value); }
    /// Sets `srcQueueFamilyIndex` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_srcQueueFamilyIndex(MemorySegment segment, @CType("uint32_t") int value) { VkBufferMemoryBarrier.set_srcQueueFamilyIndex(segment, 0L, value); }
    /// Sets `srcQueueFamilyIndex` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBufferMemoryBarrier srcQueueFamilyIndex(@CType("uint32_t") int value) { VkBufferMemoryBarrier.set_srcQueueFamilyIndex(this.segment(), value); return this; }

    /// {@return `dstQueueFamilyIndex` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_dstQueueFamilyIndex(MemorySegment segment, long index) { return (int) VH_dstQueueFamilyIndex.get(segment, 0L, index); }
    /// {@return `dstQueueFamilyIndex`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_dstQueueFamilyIndex(MemorySegment segment) { return VkBufferMemoryBarrier.get_dstQueueFamilyIndex(segment, 0L); }
    /// {@return `dstQueueFamilyIndex`}
    public @CType("uint32_t") int dstQueueFamilyIndex() { return VkBufferMemoryBarrier.get_dstQueueFamilyIndex(this.segment()); }
    /// Sets `dstQueueFamilyIndex` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_dstQueueFamilyIndex(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_dstQueueFamilyIndex.set(segment, 0L, index, value); }
    /// Sets `dstQueueFamilyIndex` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_dstQueueFamilyIndex(MemorySegment segment, @CType("uint32_t") int value) { VkBufferMemoryBarrier.set_dstQueueFamilyIndex(segment, 0L, value); }
    /// Sets `dstQueueFamilyIndex` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBufferMemoryBarrier dstQueueFamilyIndex(@CType("uint32_t") int value) { VkBufferMemoryBarrier.set_dstQueueFamilyIndex(this.segment(), value); return this; }

    /// {@return `buffer` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBuffer") MemorySegment get_buffer(MemorySegment segment, long index) { return (MemorySegment) VH_buffer.get(segment, 0L, index); }
    /// {@return `buffer`}
    /// @param segment the segment of the struct
    public static @CType("VkBuffer") MemorySegment get_buffer(MemorySegment segment) { return VkBufferMemoryBarrier.get_buffer(segment, 0L); }
    /// {@return `buffer`}
    public @CType("VkBuffer") MemorySegment buffer() { return VkBufferMemoryBarrier.get_buffer(this.segment()); }
    /// Sets `buffer` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_buffer(MemorySegment segment, long index, @CType("VkBuffer") MemorySegment value) { VH_buffer.set(segment, 0L, index, value); }
    /// Sets `buffer` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_buffer(MemorySegment segment, @CType("VkBuffer") MemorySegment value) { VkBufferMemoryBarrier.set_buffer(segment, 0L, value); }
    /// Sets `buffer` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBufferMemoryBarrier buffer(@CType("VkBuffer") MemorySegment value) { VkBufferMemoryBarrier.set_buffer(this.segment(), value); return this; }

    /// {@return `offset` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDeviceSize") long get_offset(MemorySegment segment, long index) { return (long) VH_offset.get(segment, 0L, index); }
    /// {@return `offset`}
    /// @param segment the segment of the struct
    public static @CType("VkDeviceSize") long get_offset(MemorySegment segment) { return VkBufferMemoryBarrier.get_offset(segment, 0L); }
    /// {@return `offset`}
    public @CType("VkDeviceSize") long offset() { return VkBufferMemoryBarrier.get_offset(this.segment()); }
    /// Sets `offset` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_offset(MemorySegment segment, long index, @CType("VkDeviceSize") long value) { VH_offset.set(segment, 0L, index, value); }
    /// Sets `offset` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_offset(MemorySegment segment, @CType("VkDeviceSize") long value) { VkBufferMemoryBarrier.set_offset(segment, 0L, value); }
    /// Sets `offset` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBufferMemoryBarrier offset(@CType("VkDeviceSize") long value) { VkBufferMemoryBarrier.set_offset(this.segment(), value); return this; }

    /// {@return `size` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDeviceSize") long get_size(MemorySegment segment, long index) { return (long) VH_size.get(segment, 0L, index); }
    /// {@return `size`}
    /// @param segment the segment of the struct
    public static @CType("VkDeviceSize") long get_size(MemorySegment segment) { return VkBufferMemoryBarrier.get_size(segment, 0L); }
    /// {@return `size`}
    public @CType("VkDeviceSize") long size() { return VkBufferMemoryBarrier.get_size(this.segment()); }
    /// Sets `size` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_size(MemorySegment segment, long index, @CType("VkDeviceSize") long value) { VH_size.set(segment, 0L, index, value); }
    /// Sets `size` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_size(MemorySegment segment, @CType("VkDeviceSize") long value) { VkBufferMemoryBarrier.set_size(segment, 0L, value); }
    /// Sets `size` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBufferMemoryBarrier size(@CType("VkDeviceSize") long value) { VkBufferMemoryBarrier.set_size(this.segment(), value); return this; }

    /// A buffer of [VkBufferMemoryBarrier].
    public static final class Buffer extends VkBufferMemoryBarrier {
        private final long elementCount;

        /// Creates `VkBufferMemoryBarrier.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkBufferMemoryBarrier`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkBufferMemoryBarrier`
        public VkBufferMemoryBarrier asSlice(long index) { return new VkBufferMemoryBarrier(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkBufferMemoryBarrier`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkBufferMemoryBarrier`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkBufferMemoryBarrier.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkBufferMemoryBarrier.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("const void *") MemorySegment pNextAt(long index) { return VkBufferMemoryBarrier.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("const void *") MemorySegment value) { VkBufferMemoryBarrier.set_pNext(this.segment(), index, value); return this; }

        /// {@return `srcAccessMask` at the given index}
        /// @param index the index
        public @CType("VkAccessFlags") int srcAccessMaskAt(long index) { return VkBufferMemoryBarrier.get_srcAccessMask(this.segment(), index); }
        /// Sets `srcAccessMask` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer srcAccessMaskAt(long index, @CType("VkAccessFlags") int value) { VkBufferMemoryBarrier.set_srcAccessMask(this.segment(), index, value); return this; }

        /// {@return `dstAccessMask` at the given index}
        /// @param index the index
        public @CType("VkAccessFlags") int dstAccessMaskAt(long index) { return VkBufferMemoryBarrier.get_dstAccessMask(this.segment(), index); }
        /// Sets `dstAccessMask` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer dstAccessMaskAt(long index, @CType("VkAccessFlags") int value) { VkBufferMemoryBarrier.set_dstAccessMask(this.segment(), index, value); return this; }

        /// {@return `srcQueueFamilyIndex` at the given index}
        /// @param index the index
        public @CType("uint32_t") int srcQueueFamilyIndexAt(long index) { return VkBufferMemoryBarrier.get_srcQueueFamilyIndex(this.segment(), index); }
        /// Sets `srcQueueFamilyIndex` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer srcQueueFamilyIndexAt(long index, @CType("uint32_t") int value) { VkBufferMemoryBarrier.set_srcQueueFamilyIndex(this.segment(), index, value); return this; }

        /// {@return `dstQueueFamilyIndex` at the given index}
        /// @param index the index
        public @CType("uint32_t") int dstQueueFamilyIndexAt(long index) { return VkBufferMemoryBarrier.get_dstQueueFamilyIndex(this.segment(), index); }
        /// Sets `dstQueueFamilyIndex` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer dstQueueFamilyIndexAt(long index, @CType("uint32_t") int value) { VkBufferMemoryBarrier.set_dstQueueFamilyIndex(this.segment(), index, value); return this; }

        /// {@return `buffer` at the given index}
        /// @param index the index
        public @CType("VkBuffer") MemorySegment bufferAt(long index) { return VkBufferMemoryBarrier.get_buffer(this.segment(), index); }
        /// Sets `buffer` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer bufferAt(long index, @CType("VkBuffer") MemorySegment value) { VkBufferMemoryBarrier.set_buffer(this.segment(), index, value); return this; }

        /// {@return `offset` at the given index}
        /// @param index the index
        public @CType("VkDeviceSize") long offsetAt(long index) { return VkBufferMemoryBarrier.get_offset(this.segment(), index); }
        /// Sets `offset` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer offsetAt(long index, @CType("VkDeviceSize") long value) { VkBufferMemoryBarrier.set_offset(this.segment(), index, value); return this; }

        /// {@return `size` at the given index}
        /// @param index the index
        public @CType("VkDeviceSize") long sizeAt(long index) { return VkBufferMemoryBarrier.get_size(this.segment(), index); }
        /// Sets `size` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sizeAt(long index, @CType("VkDeviceSize") long value) { VkBufferMemoryBarrier.set_size(this.segment(), index, value); return this; }

    }
}
