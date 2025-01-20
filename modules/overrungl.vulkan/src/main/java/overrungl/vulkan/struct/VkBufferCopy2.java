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
/// ### srcOffset
/// [VarHandle][#VH_srcOffset] - [Getter][#srcOffset()] - [Setter][#srcOffset(long)]
/// ### dstOffset
/// [VarHandle][#VH_dstOffset] - [Getter][#dstOffset()] - [Setter][#dstOffset(long)]
/// ### size
/// [VarHandle][#VH_size] - [Getter][#size()] - [Setter][#size(long)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkBufferCopy2 {
///     VkStructureType sType;
///     const void * pNext;
///     VkDeviceSize srcOffset;
///     VkDeviceSize dstOffset;
///     VkDeviceSize size;
/// } VkBufferCopy2;
/// ```
public sealed class VkBufferCopy2 extends Struct {
    /// The struct layout of `VkBufferCopy2`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("srcOffset"),
        ValueLayout.JAVA_LONG.withName("dstOffset"),
        ValueLayout.JAVA_LONG.withName("size")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `srcOffset` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_srcOffset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("srcOffset"));
    /// The [VarHandle] of `dstOffset` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_dstOffset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dstOffset"));
    /// The [VarHandle] of `size` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_size = LAYOUT.arrayElementVarHandle(PathElement.groupElement("size"));

    /// Creates `VkBufferCopy2` with the given segment.
    /// @param segment the memory segment
    public VkBufferCopy2(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkBufferCopy2` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkBufferCopy2 of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkBufferCopy2(segment); }

    /// Creates `VkBufferCopy2` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkBufferCopy2` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkBufferCopy2 ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkBufferCopy2(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkBufferCopy2` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkBufferCopy2` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkBufferCopy2`
    public static VkBufferCopy2 alloc(SegmentAllocator allocator) { return new VkBufferCopy2(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkBufferCopy2` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkBufferCopy2`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkBufferCopy2` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkBufferCopy2`
    public static VkBufferCopy2 allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("const void *") MemorySegment pNext, @CType("VkDeviceSize") long srcOffset, @CType("VkDeviceSize") long dstOffset, @CType("VkDeviceSize") long size) { return alloc(allocator).sType(sType).pNext(pNext).srcOffset(srcOffset).dstOffset(dstOffset).size(size); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkBufferCopy2 copyFrom(VkBufferCopy2 src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkBufferCopy2.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkBufferCopy2.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkBufferCopy2.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBufferCopy2 sType(@CType("VkStructureType") int value) { VkBufferCopy2.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") MemorySegment get_pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") MemorySegment get_pNext(MemorySegment segment) { return VkBufferCopy2.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("const void *") MemorySegment pNext() { return VkBufferCopy2.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") MemorySegment value) { VkBufferCopy2.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBufferCopy2 pNext(@CType("const void *") MemorySegment value) { VkBufferCopy2.set_pNext(this.segment(), value); return this; }

    /// {@return `srcOffset` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDeviceSize") long get_srcOffset(MemorySegment segment, long index) { return (long) VH_srcOffset.get(segment, 0L, index); }
    /// {@return `srcOffset`}
    /// @param segment the segment of the struct
    public static @CType("VkDeviceSize") long get_srcOffset(MemorySegment segment) { return VkBufferCopy2.get_srcOffset(segment, 0L); }
    /// {@return `srcOffset`}
    public @CType("VkDeviceSize") long srcOffset() { return VkBufferCopy2.get_srcOffset(this.segment()); }
    /// Sets `srcOffset` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_srcOffset(MemorySegment segment, long index, @CType("VkDeviceSize") long value) { VH_srcOffset.set(segment, 0L, index, value); }
    /// Sets `srcOffset` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_srcOffset(MemorySegment segment, @CType("VkDeviceSize") long value) { VkBufferCopy2.set_srcOffset(segment, 0L, value); }
    /// Sets `srcOffset` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBufferCopy2 srcOffset(@CType("VkDeviceSize") long value) { VkBufferCopy2.set_srcOffset(this.segment(), value); return this; }

    /// {@return `dstOffset` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDeviceSize") long get_dstOffset(MemorySegment segment, long index) { return (long) VH_dstOffset.get(segment, 0L, index); }
    /// {@return `dstOffset`}
    /// @param segment the segment of the struct
    public static @CType("VkDeviceSize") long get_dstOffset(MemorySegment segment) { return VkBufferCopy2.get_dstOffset(segment, 0L); }
    /// {@return `dstOffset`}
    public @CType("VkDeviceSize") long dstOffset() { return VkBufferCopy2.get_dstOffset(this.segment()); }
    /// Sets `dstOffset` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_dstOffset(MemorySegment segment, long index, @CType("VkDeviceSize") long value) { VH_dstOffset.set(segment, 0L, index, value); }
    /// Sets `dstOffset` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_dstOffset(MemorySegment segment, @CType("VkDeviceSize") long value) { VkBufferCopy2.set_dstOffset(segment, 0L, value); }
    /// Sets `dstOffset` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBufferCopy2 dstOffset(@CType("VkDeviceSize") long value) { VkBufferCopy2.set_dstOffset(this.segment(), value); return this; }

    /// {@return `size` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDeviceSize") long get_size(MemorySegment segment, long index) { return (long) VH_size.get(segment, 0L, index); }
    /// {@return `size`}
    /// @param segment the segment of the struct
    public static @CType("VkDeviceSize") long get_size(MemorySegment segment) { return VkBufferCopy2.get_size(segment, 0L); }
    /// {@return `size`}
    public @CType("VkDeviceSize") long size() { return VkBufferCopy2.get_size(this.segment()); }
    /// Sets `size` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_size(MemorySegment segment, long index, @CType("VkDeviceSize") long value) { VH_size.set(segment, 0L, index, value); }
    /// Sets `size` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_size(MemorySegment segment, @CType("VkDeviceSize") long value) { VkBufferCopy2.set_size(segment, 0L, value); }
    /// Sets `size` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBufferCopy2 size(@CType("VkDeviceSize") long value) { VkBufferCopy2.set_size(this.segment(), value); return this; }

    /// A buffer of [VkBufferCopy2].
    public static final class Buffer extends VkBufferCopy2 {
        private final long elementCount;

        /// Creates `VkBufferCopy2.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkBufferCopy2`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkBufferCopy2`
        public VkBufferCopy2 asSlice(long index) { return new VkBufferCopy2(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkBufferCopy2`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkBufferCopy2`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkBufferCopy2.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkBufferCopy2.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("const void *") MemorySegment pNextAt(long index) { return VkBufferCopy2.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("const void *") MemorySegment value) { VkBufferCopy2.set_pNext(this.segment(), index, value); return this; }

        /// {@return `srcOffset` at the given index}
        /// @param index the index
        public @CType("VkDeviceSize") long srcOffsetAt(long index) { return VkBufferCopy2.get_srcOffset(this.segment(), index); }
        /// Sets `srcOffset` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer srcOffsetAt(long index, @CType("VkDeviceSize") long value) { VkBufferCopy2.set_srcOffset(this.segment(), index, value); return this; }

        /// {@return `dstOffset` at the given index}
        /// @param index the index
        public @CType("VkDeviceSize") long dstOffsetAt(long index) { return VkBufferCopy2.get_dstOffset(this.segment(), index); }
        /// Sets `dstOffset` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer dstOffsetAt(long index, @CType("VkDeviceSize") long value) { VkBufferCopy2.set_dstOffset(this.segment(), index, value); return this; }

        /// {@return `size` at the given index}
        /// @param index the index
        public @CType("VkDeviceSize") long sizeAt(long index) { return VkBufferCopy2.get_size(this.segment(), index); }
        /// Sets `size` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sizeAt(long index, @CType("VkDeviceSize") long value) { VkBufferCopy2.set_size(this.segment(), index, value); return this; }

    }
}
