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
/// ### srcBuffer
/// [VarHandle][#VH_srcBuffer] - [Getter][#srcBuffer()] - [Setter][#srcBuffer(MemorySegment)]
/// ### dstBuffer
/// [VarHandle][#VH_dstBuffer] - [Getter][#dstBuffer()] - [Setter][#dstBuffer(MemorySegment)]
/// ### regionCount
/// [VarHandle][#VH_regionCount] - [Getter][#regionCount()] - [Setter][#regionCount(int)]
/// ### pRegions
/// [VarHandle][#VH_pRegions] - [Getter][#pRegions()] - [Setter][#pRegions(MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkCopyBufferInfo2 {
///     VkStructureType sType;
///     const void * pNext;
///     VkBuffer srcBuffer;
///     VkBuffer dstBuffer;
///     uint32_t regionCount;
///     const VkBufferCopy2 * pRegions;
/// } VkCopyBufferInfo2;
/// ```
public sealed class VkCopyBufferInfo2 extends Struct {
    /// The struct layout of `VkCopyBufferInfo2`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("srcBuffer"),
        ValueLayout.ADDRESS.withName("dstBuffer"),
        ValueLayout.JAVA_INT.withName("regionCount"),
        ValueLayout.ADDRESS.withName("pRegions")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `srcBuffer` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_srcBuffer = LAYOUT.arrayElementVarHandle(PathElement.groupElement("srcBuffer"));
    /// The [VarHandle] of `dstBuffer` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_dstBuffer = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dstBuffer"));
    /// The [VarHandle] of `regionCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_regionCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("regionCount"));
    /// The [VarHandle] of `pRegions` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pRegions = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pRegions"));

    /// Creates `VkCopyBufferInfo2` with the given segment.
    /// @param segment the memory segment
    public VkCopyBufferInfo2(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkCopyBufferInfo2` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkCopyBufferInfo2 of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkCopyBufferInfo2(segment); }

    /// Creates `VkCopyBufferInfo2` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkCopyBufferInfo2` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkCopyBufferInfo2 ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkCopyBufferInfo2(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkCopyBufferInfo2` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkCopyBufferInfo2` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkCopyBufferInfo2`
    public static VkCopyBufferInfo2 alloc(SegmentAllocator allocator) { return new VkCopyBufferInfo2(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkCopyBufferInfo2` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkCopyBufferInfo2`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkCopyBufferInfo2` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkCopyBufferInfo2`
    public static VkCopyBufferInfo2 allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("const void *") MemorySegment pNext, @CType("VkBuffer") MemorySegment srcBuffer, @CType("VkBuffer") MemorySegment dstBuffer, @CType("uint32_t") int regionCount, @CType("const VkBufferCopy2 *") MemorySegment pRegions) { return alloc(allocator).sType(sType).pNext(pNext).srcBuffer(srcBuffer).dstBuffer(dstBuffer).regionCount(regionCount).pRegions(pRegions); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkCopyBufferInfo2 copyFrom(VkCopyBufferInfo2 src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkCopyBufferInfo2.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkCopyBufferInfo2.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkCopyBufferInfo2.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCopyBufferInfo2 sType(@CType("VkStructureType") int value) { VkCopyBufferInfo2.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") MemorySegment get_pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") MemorySegment get_pNext(MemorySegment segment) { return VkCopyBufferInfo2.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("const void *") MemorySegment pNext() { return VkCopyBufferInfo2.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") MemorySegment value) { VkCopyBufferInfo2.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCopyBufferInfo2 pNext(@CType("const void *") MemorySegment value) { VkCopyBufferInfo2.set_pNext(this.segment(), value); return this; }

    /// {@return `srcBuffer` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBuffer") MemorySegment get_srcBuffer(MemorySegment segment, long index) { return (MemorySegment) VH_srcBuffer.get(segment, 0L, index); }
    /// {@return `srcBuffer`}
    /// @param segment the segment of the struct
    public static @CType("VkBuffer") MemorySegment get_srcBuffer(MemorySegment segment) { return VkCopyBufferInfo2.get_srcBuffer(segment, 0L); }
    /// {@return `srcBuffer`}
    public @CType("VkBuffer") MemorySegment srcBuffer() { return VkCopyBufferInfo2.get_srcBuffer(this.segment()); }
    /// Sets `srcBuffer` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_srcBuffer(MemorySegment segment, long index, @CType("VkBuffer") MemorySegment value) { VH_srcBuffer.set(segment, 0L, index, value); }
    /// Sets `srcBuffer` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_srcBuffer(MemorySegment segment, @CType("VkBuffer") MemorySegment value) { VkCopyBufferInfo2.set_srcBuffer(segment, 0L, value); }
    /// Sets `srcBuffer` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCopyBufferInfo2 srcBuffer(@CType("VkBuffer") MemorySegment value) { VkCopyBufferInfo2.set_srcBuffer(this.segment(), value); return this; }

    /// {@return `dstBuffer` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBuffer") MemorySegment get_dstBuffer(MemorySegment segment, long index) { return (MemorySegment) VH_dstBuffer.get(segment, 0L, index); }
    /// {@return `dstBuffer`}
    /// @param segment the segment of the struct
    public static @CType("VkBuffer") MemorySegment get_dstBuffer(MemorySegment segment) { return VkCopyBufferInfo2.get_dstBuffer(segment, 0L); }
    /// {@return `dstBuffer`}
    public @CType("VkBuffer") MemorySegment dstBuffer() { return VkCopyBufferInfo2.get_dstBuffer(this.segment()); }
    /// Sets `dstBuffer` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_dstBuffer(MemorySegment segment, long index, @CType("VkBuffer") MemorySegment value) { VH_dstBuffer.set(segment, 0L, index, value); }
    /// Sets `dstBuffer` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_dstBuffer(MemorySegment segment, @CType("VkBuffer") MemorySegment value) { VkCopyBufferInfo2.set_dstBuffer(segment, 0L, value); }
    /// Sets `dstBuffer` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCopyBufferInfo2 dstBuffer(@CType("VkBuffer") MemorySegment value) { VkCopyBufferInfo2.set_dstBuffer(this.segment(), value); return this; }

    /// {@return `regionCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_regionCount(MemorySegment segment, long index) { return (int) VH_regionCount.get(segment, 0L, index); }
    /// {@return `regionCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_regionCount(MemorySegment segment) { return VkCopyBufferInfo2.get_regionCount(segment, 0L); }
    /// {@return `regionCount`}
    public @CType("uint32_t") int regionCount() { return VkCopyBufferInfo2.get_regionCount(this.segment()); }
    /// Sets `regionCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_regionCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_regionCount.set(segment, 0L, index, value); }
    /// Sets `regionCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_regionCount(MemorySegment segment, @CType("uint32_t") int value) { VkCopyBufferInfo2.set_regionCount(segment, 0L, value); }
    /// Sets `regionCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCopyBufferInfo2 regionCount(@CType("uint32_t") int value) { VkCopyBufferInfo2.set_regionCount(this.segment(), value); return this; }

    /// {@return `pRegions` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const VkBufferCopy2 *") MemorySegment get_pRegions(MemorySegment segment, long index) { return (MemorySegment) VH_pRegions.get(segment, 0L, index); }
    /// {@return `pRegions`}
    /// @param segment the segment of the struct
    public static @CType("const VkBufferCopy2 *") MemorySegment get_pRegions(MemorySegment segment) { return VkCopyBufferInfo2.get_pRegions(segment, 0L); }
    /// {@return `pRegions`}
    public @CType("const VkBufferCopy2 *") MemorySegment pRegions() { return VkCopyBufferInfo2.get_pRegions(this.segment()); }
    /// Sets `pRegions` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pRegions(MemorySegment segment, long index, @CType("const VkBufferCopy2 *") MemorySegment value) { VH_pRegions.set(segment, 0L, index, value); }
    /// Sets `pRegions` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pRegions(MemorySegment segment, @CType("const VkBufferCopy2 *") MemorySegment value) { VkCopyBufferInfo2.set_pRegions(segment, 0L, value); }
    /// Sets `pRegions` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCopyBufferInfo2 pRegions(@CType("const VkBufferCopy2 *") MemorySegment value) { VkCopyBufferInfo2.set_pRegions(this.segment(), value); return this; }

    /// A buffer of [VkCopyBufferInfo2].
    public static final class Buffer extends VkCopyBufferInfo2 {
        private final long elementCount;

        /// Creates `VkCopyBufferInfo2.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkCopyBufferInfo2`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkCopyBufferInfo2`
        public VkCopyBufferInfo2 asSlice(long index) { return new VkCopyBufferInfo2(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkCopyBufferInfo2`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkCopyBufferInfo2`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkCopyBufferInfo2.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkCopyBufferInfo2.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("const void *") MemorySegment pNextAt(long index) { return VkCopyBufferInfo2.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("const void *") MemorySegment value) { VkCopyBufferInfo2.set_pNext(this.segment(), index, value); return this; }

        /// {@return `srcBuffer` at the given index}
        /// @param index the index
        public @CType("VkBuffer") MemorySegment srcBufferAt(long index) { return VkCopyBufferInfo2.get_srcBuffer(this.segment(), index); }
        /// Sets `srcBuffer` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer srcBufferAt(long index, @CType("VkBuffer") MemorySegment value) { VkCopyBufferInfo2.set_srcBuffer(this.segment(), index, value); return this; }

        /// {@return `dstBuffer` at the given index}
        /// @param index the index
        public @CType("VkBuffer") MemorySegment dstBufferAt(long index) { return VkCopyBufferInfo2.get_dstBuffer(this.segment(), index); }
        /// Sets `dstBuffer` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer dstBufferAt(long index, @CType("VkBuffer") MemorySegment value) { VkCopyBufferInfo2.set_dstBuffer(this.segment(), index, value); return this; }

        /// {@return `regionCount` at the given index}
        /// @param index the index
        public @CType("uint32_t") int regionCountAt(long index) { return VkCopyBufferInfo2.get_regionCount(this.segment(), index); }
        /// Sets `regionCount` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer regionCountAt(long index, @CType("uint32_t") int value) { VkCopyBufferInfo2.set_regionCount(this.segment(), index, value); return this; }

        /// {@return `pRegions` at the given index}
        /// @param index the index
        public @CType("const VkBufferCopy2 *") MemorySegment pRegionsAt(long index) { return VkCopyBufferInfo2.get_pRegions(this.segment(), index); }
        /// Sets `pRegions` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pRegionsAt(long index, @CType("const VkBufferCopy2 *") MemorySegment value) { VkCopyBufferInfo2.set_pRegions(this.segment(), index, value); return this; }

    }
}
