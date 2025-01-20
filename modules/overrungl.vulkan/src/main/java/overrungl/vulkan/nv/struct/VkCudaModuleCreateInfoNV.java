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
/// ### dataSize
/// [VarHandle][#VH_dataSize] - [Getter][#dataSize()] - [Setter][#dataSize(long)]
/// ### pData
/// [VarHandle][#VH_pData] - [Getter][#pData()] - [Setter][#pData(MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkCudaModuleCreateInfoNV {
///     VkStructureType sType;
///     const void * pNext;
///     size_t dataSize;
///     const void * pData;
/// } VkCudaModuleCreateInfoNV;
/// ```
public sealed class VkCudaModuleCreateInfoNV extends Struct {
    /// The struct layout of `VkCudaModuleCreateInfoNV`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("dataSize"),
        ValueLayout.ADDRESS.withName("pData")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `dataSize` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_dataSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dataSize"));
    /// The [VarHandle] of `pData` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pData = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pData"));

    /// Creates `VkCudaModuleCreateInfoNV` with the given segment.
    /// @param segment the memory segment
    public VkCudaModuleCreateInfoNV(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkCudaModuleCreateInfoNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkCudaModuleCreateInfoNV of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkCudaModuleCreateInfoNV(segment); }

    /// Creates `VkCudaModuleCreateInfoNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkCudaModuleCreateInfoNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkCudaModuleCreateInfoNV ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkCudaModuleCreateInfoNV(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkCudaModuleCreateInfoNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkCudaModuleCreateInfoNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkCudaModuleCreateInfoNV`
    public static VkCudaModuleCreateInfoNV alloc(SegmentAllocator allocator) { return new VkCudaModuleCreateInfoNV(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkCudaModuleCreateInfoNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkCudaModuleCreateInfoNV`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkCudaModuleCreateInfoNV` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkCudaModuleCreateInfoNV`
    public static VkCudaModuleCreateInfoNV allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("const void *") MemorySegment pNext, @CType("size_t") long dataSize, @CType("const void *") MemorySegment pData) { return alloc(allocator).sType(sType).pNext(pNext).dataSize(dataSize).pData(pData); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkCudaModuleCreateInfoNV copyFrom(VkCudaModuleCreateInfoNV src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkCudaModuleCreateInfoNV.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkCudaModuleCreateInfoNV.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkCudaModuleCreateInfoNV.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCudaModuleCreateInfoNV sType(@CType("VkStructureType") int value) { VkCudaModuleCreateInfoNV.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") MemorySegment get_pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") MemorySegment get_pNext(MemorySegment segment) { return VkCudaModuleCreateInfoNV.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("const void *") MemorySegment pNext() { return VkCudaModuleCreateInfoNV.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") MemorySegment value) { VkCudaModuleCreateInfoNV.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCudaModuleCreateInfoNV pNext(@CType("const void *") MemorySegment value) { VkCudaModuleCreateInfoNV.set_pNext(this.segment(), value); return this; }

    /// {@return `dataSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("size_t") long get_dataSize(MemorySegment segment, long index) { return (long) VH_dataSize.get(segment, 0L, index); }
    /// {@return `dataSize`}
    /// @param segment the segment of the struct
    public static @CType("size_t") long get_dataSize(MemorySegment segment) { return VkCudaModuleCreateInfoNV.get_dataSize(segment, 0L); }
    /// {@return `dataSize`}
    public @CType("size_t") long dataSize() { return VkCudaModuleCreateInfoNV.get_dataSize(this.segment()); }
    /// Sets `dataSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_dataSize(MemorySegment segment, long index, @CType("size_t") long value) { VH_dataSize.set(segment, 0L, index, value); }
    /// Sets `dataSize` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_dataSize(MemorySegment segment, @CType("size_t") long value) { VkCudaModuleCreateInfoNV.set_dataSize(segment, 0L, value); }
    /// Sets `dataSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCudaModuleCreateInfoNV dataSize(@CType("size_t") long value) { VkCudaModuleCreateInfoNV.set_dataSize(this.segment(), value); return this; }

    /// {@return `pData` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") MemorySegment get_pData(MemorySegment segment, long index) { return (MemorySegment) VH_pData.get(segment, 0L, index); }
    /// {@return `pData`}
    /// @param segment the segment of the struct
    public static @CType("const void *") MemorySegment get_pData(MemorySegment segment) { return VkCudaModuleCreateInfoNV.get_pData(segment, 0L); }
    /// {@return `pData`}
    public @CType("const void *") MemorySegment pData() { return VkCudaModuleCreateInfoNV.get_pData(this.segment()); }
    /// Sets `pData` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pData(MemorySegment segment, long index, @CType("const void *") MemorySegment value) { VH_pData.set(segment, 0L, index, value); }
    /// Sets `pData` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pData(MemorySegment segment, @CType("const void *") MemorySegment value) { VkCudaModuleCreateInfoNV.set_pData(segment, 0L, value); }
    /// Sets `pData` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCudaModuleCreateInfoNV pData(@CType("const void *") MemorySegment value) { VkCudaModuleCreateInfoNV.set_pData(this.segment(), value); return this; }

    /// A buffer of [VkCudaModuleCreateInfoNV].
    public static final class Buffer extends VkCudaModuleCreateInfoNV {
        private final long elementCount;

        /// Creates `VkCudaModuleCreateInfoNV.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkCudaModuleCreateInfoNV`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkCudaModuleCreateInfoNV`
        public VkCudaModuleCreateInfoNV asSlice(long index) { return new VkCudaModuleCreateInfoNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkCudaModuleCreateInfoNV`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkCudaModuleCreateInfoNV`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkCudaModuleCreateInfoNV.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkCudaModuleCreateInfoNV.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("const void *") MemorySegment pNextAt(long index) { return VkCudaModuleCreateInfoNV.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("const void *") MemorySegment value) { VkCudaModuleCreateInfoNV.set_pNext(this.segment(), index, value); return this; }

        /// {@return `dataSize` at the given index}
        /// @param index the index
        public @CType("size_t") long dataSizeAt(long index) { return VkCudaModuleCreateInfoNV.get_dataSize(this.segment(), index); }
        /// Sets `dataSize` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer dataSizeAt(long index, @CType("size_t") long value) { VkCudaModuleCreateInfoNV.set_dataSize(this.segment(), index, value); return this; }

        /// {@return `pData` at the given index}
        /// @param index the index
        public @CType("const void *") MemorySegment pDataAt(long index) { return VkCudaModuleCreateInfoNV.get_pData(this.segment(), index); }
        /// Sets `pData` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pDataAt(long index, @CType("const void *") MemorySegment value) { VkCudaModuleCreateInfoNV.set_pData(this.segment(), index, value); return this; }

    }
}
