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
package overrungl.vulkan.nv.struct;

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
/// ### aabbData
/// [VarHandle][#VH_aabbData] - [Getter][#aabbData()] - [Setter][#aabbData(MemorySegment)]
/// ### numAABBs
/// [VarHandle][#VH_numAABBs] - [Getter][#numAABBs()] - [Setter][#numAABBs(int)]
/// ### stride
/// [VarHandle][#VH_stride] - [Getter][#stride()] - [Setter][#stride(int)]
/// ### offset
/// [VarHandle][#VH_offset] - [Getter][#offset()] - [Setter][#offset(long)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkGeometryAABBNV {
///     VkStructureType sType;
///     const void * pNext;
///     VkBuffer aabbData;
///     uint32_t numAABBs;
///     uint32_t stride;
///     VkDeviceSize offset;
/// } VkGeometryAABBNV;
/// ```
public sealed class VkGeometryAABBNV extends Struct {
    /// The struct layout of `VkGeometryAABBNV`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("aabbData"),
        ValueLayout.JAVA_INT.withName("numAABBs"),
        ValueLayout.JAVA_INT.withName("stride"),
        ValueLayout.JAVA_LONG.withName("offset")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `aabbData` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_aabbData = LAYOUT.arrayElementVarHandle(PathElement.groupElement("aabbData"));
    /// The [VarHandle] of `numAABBs` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_numAABBs = LAYOUT.arrayElementVarHandle(PathElement.groupElement("numAABBs"));
    /// The [VarHandle] of `stride` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_stride = LAYOUT.arrayElementVarHandle(PathElement.groupElement("stride"));
    /// The [VarHandle] of `offset` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_offset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("offset"));

    /// Creates `VkGeometryAABBNV` with the given segment.
    /// @param segment the memory segment
    public VkGeometryAABBNV(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkGeometryAABBNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkGeometryAABBNV of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkGeometryAABBNV(segment); }

    /// Creates `VkGeometryAABBNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkGeometryAABBNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkGeometryAABBNV ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkGeometryAABBNV(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkGeometryAABBNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkGeometryAABBNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkGeometryAABBNV`
    public static VkGeometryAABBNV alloc(SegmentAllocator allocator) { return new VkGeometryAABBNV(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkGeometryAABBNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkGeometryAABBNV`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkGeometryAABBNV` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkGeometryAABBNV`
    public static VkGeometryAABBNV allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("const void *") MemorySegment pNext, @CType("VkBuffer") MemorySegment aabbData, @CType("uint32_t") int numAABBs, @CType("uint32_t") int stride, @CType("VkDeviceSize") long offset) { return alloc(allocator).sType(sType).pNext(pNext).aabbData(aabbData).numAABBs(numAABBs).stride(stride).offset(offset); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkGeometryAABBNV copyFrom(VkGeometryAABBNV src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkGeometryAABBNV.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkGeometryAABBNV.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkGeometryAABBNV.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkGeometryAABBNV sType(@CType("VkStructureType") int value) { VkGeometryAABBNV.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") MemorySegment get_pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") MemorySegment get_pNext(MemorySegment segment) { return VkGeometryAABBNV.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("const void *") MemorySegment pNext() { return VkGeometryAABBNV.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") MemorySegment value) { VkGeometryAABBNV.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkGeometryAABBNV pNext(@CType("const void *") MemorySegment value) { VkGeometryAABBNV.set_pNext(this.segment(), value); return this; }

    /// {@return `aabbData` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBuffer") MemorySegment get_aabbData(MemorySegment segment, long index) { return (MemorySegment) VH_aabbData.get(segment, 0L, index); }
    /// {@return `aabbData`}
    /// @param segment the segment of the struct
    public static @CType("VkBuffer") MemorySegment get_aabbData(MemorySegment segment) { return VkGeometryAABBNV.get_aabbData(segment, 0L); }
    /// {@return `aabbData`}
    public @CType("VkBuffer") MemorySegment aabbData() { return VkGeometryAABBNV.get_aabbData(this.segment()); }
    /// Sets `aabbData` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_aabbData(MemorySegment segment, long index, @CType("VkBuffer") MemorySegment value) { VH_aabbData.set(segment, 0L, index, value); }
    /// Sets `aabbData` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_aabbData(MemorySegment segment, @CType("VkBuffer") MemorySegment value) { VkGeometryAABBNV.set_aabbData(segment, 0L, value); }
    /// Sets `aabbData` with the given value.
    /// @param value the value
    /// @return `this`
    public VkGeometryAABBNV aabbData(@CType("VkBuffer") MemorySegment value) { VkGeometryAABBNV.set_aabbData(this.segment(), value); return this; }

    /// {@return `numAABBs` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_numAABBs(MemorySegment segment, long index) { return (int) VH_numAABBs.get(segment, 0L, index); }
    /// {@return `numAABBs`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_numAABBs(MemorySegment segment) { return VkGeometryAABBNV.get_numAABBs(segment, 0L); }
    /// {@return `numAABBs`}
    public @CType("uint32_t") int numAABBs() { return VkGeometryAABBNV.get_numAABBs(this.segment()); }
    /// Sets `numAABBs` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_numAABBs(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_numAABBs.set(segment, 0L, index, value); }
    /// Sets `numAABBs` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_numAABBs(MemorySegment segment, @CType("uint32_t") int value) { VkGeometryAABBNV.set_numAABBs(segment, 0L, value); }
    /// Sets `numAABBs` with the given value.
    /// @param value the value
    /// @return `this`
    public VkGeometryAABBNV numAABBs(@CType("uint32_t") int value) { VkGeometryAABBNV.set_numAABBs(this.segment(), value); return this; }

    /// {@return `stride` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_stride(MemorySegment segment, long index) { return (int) VH_stride.get(segment, 0L, index); }
    /// {@return `stride`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_stride(MemorySegment segment) { return VkGeometryAABBNV.get_stride(segment, 0L); }
    /// {@return `stride`}
    public @CType("uint32_t") int stride() { return VkGeometryAABBNV.get_stride(this.segment()); }
    /// Sets `stride` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_stride(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_stride.set(segment, 0L, index, value); }
    /// Sets `stride` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_stride(MemorySegment segment, @CType("uint32_t") int value) { VkGeometryAABBNV.set_stride(segment, 0L, value); }
    /// Sets `stride` with the given value.
    /// @param value the value
    /// @return `this`
    public VkGeometryAABBNV stride(@CType("uint32_t") int value) { VkGeometryAABBNV.set_stride(this.segment(), value); return this; }

    /// {@return `offset` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDeviceSize") long get_offset(MemorySegment segment, long index) { return (long) VH_offset.get(segment, 0L, index); }
    /// {@return `offset`}
    /// @param segment the segment of the struct
    public static @CType("VkDeviceSize") long get_offset(MemorySegment segment) { return VkGeometryAABBNV.get_offset(segment, 0L); }
    /// {@return `offset`}
    public @CType("VkDeviceSize") long offset() { return VkGeometryAABBNV.get_offset(this.segment()); }
    /// Sets `offset` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_offset(MemorySegment segment, long index, @CType("VkDeviceSize") long value) { VH_offset.set(segment, 0L, index, value); }
    /// Sets `offset` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_offset(MemorySegment segment, @CType("VkDeviceSize") long value) { VkGeometryAABBNV.set_offset(segment, 0L, value); }
    /// Sets `offset` with the given value.
    /// @param value the value
    /// @return `this`
    public VkGeometryAABBNV offset(@CType("VkDeviceSize") long value) { VkGeometryAABBNV.set_offset(this.segment(), value); return this; }

    /// A buffer of [VkGeometryAABBNV].
    public static final class Buffer extends VkGeometryAABBNV {
        private final long elementCount;

        /// Creates `VkGeometryAABBNV.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkGeometryAABBNV`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkGeometryAABBNV`
        public VkGeometryAABBNV asSlice(long index) { return new VkGeometryAABBNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkGeometryAABBNV`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkGeometryAABBNV`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkGeometryAABBNV.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkGeometryAABBNV.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("const void *") MemorySegment pNextAt(long index) { return VkGeometryAABBNV.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("const void *") MemorySegment value) { VkGeometryAABBNV.set_pNext(this.segment(), index, value); return this; }

        /// {@return `aabbData` at the given index}
        /// @param index the index
        public @CType("VkBuffer") MemorySegment aabbDataAt(long index) { return VkGeometryAABBNV.get_aabbData(this.segment(), index); }
        /// Sets `aabbData` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer aabbDataAt(long index, @CType("VkBuffer") MemorySegment value) { VkGeometryAABBNV.set_aabbData(this.segment(), index, value); return this; }

        /// {@return `numAABBs` at the given index}
        /// @param index the index
        public @CType("uint32_t") int numAABBsAt(long index) { return VkGeometryAABBNV.get_numAABBs(this.segment(), index); }
        /// Sets `numAABBs` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer numAABBsAt(long index, @CType("uint32_t") int value) { VkGeometryAABBNV.set_numAABBs(this.segment(), index, value); return this; }

        /// {@return `stride` at the given index}
        /// @param index the index
        public @CType("uint32_t") int strideAt(long index) { return VkGeometryAABBNV.get_stride(this.segment(), index); }
        /// Sets `stride` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer strideAt(long index, @CType("uint32_t") int value) { VkGeometryAABBNV.set_stride(this.segment(), index, value); return this; }

        /// {@return `offset` at the given index}
        /// @param index the index
        public @CType("VkDeviceSize") long offsetAt(long index) { return VkGeometryAABBNV.get_offset(this.segment(), index); }
        /// Sets `offset` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer offsetAt(long index, @CType("VkDeviceSize") long value) { VkGeometryAABBNV.set_offset(this.segment(), index, value); return this; }

    }
}
