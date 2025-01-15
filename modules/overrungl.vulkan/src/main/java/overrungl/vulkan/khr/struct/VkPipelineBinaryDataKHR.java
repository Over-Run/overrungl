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
package overrungl.vulkan.khr.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.annotation.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Members
/// ### dataSize
/// [VarHandle][#VH_dataSize] - [Getter][#dataSize()] - [Setter][#dataSize(long)]
/// ### pData
/// [VarHandle][#VH_pData] - [Getter][#pData()] - [Setter][#pData(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPipelineBinaryDataKHR {
///     size_t dataSize;
///     void * pData;
/// } VkPipelineBinaryDataKHR;
/// ```
public sealed class VkPipelineBinaryDataKHR extends Struct {
    /// The struct layout of `VkPipelineBinaryDataKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_LONG.withName("dataSize"),
        ValueLayout.ADDRESS.withName("pData")
    );
    /// The [VarHandle] of `dataSize` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_dataSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dataSize"));
    /// The [VarHandle] of `pData` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pData = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pData"));

    /// Creates `VkPipelineBinaryDataKHR` with the given segment.
    /// @param segment the memory segment
    public VkPipelineBinaryDataKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPipelineBinaryDataKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineBinaryDataKHR of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPipelineBinaryDataKHR(segment); }

    /// Creates `VkPipelineBinaryDataKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPipelineBinaryDataKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineBinaryDataKHR ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPipelineBinaryDataKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPipelineBinaryDataKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkPipelineBinaryDataKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPipelineBinaryDataKHR`
    public static VkPipelineBinaryDataKHR alloc(SegmentAllocator allocator) { return new VkPipelineBinaryDataKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPipelineBinaryDataKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPipelineBinaryDataKHR`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkPipelineBinaryDataKHR` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPipelineBinaryDataKHR`
    public static VkPipelineBinaryDataKHR allocInit(SegmentAllocator allocator, @CType("size_t") long dataSize, @CType("void *") java.lang.foreign.MemorySegment pData) { return alloc(allocator).dataSize(dataSize).pData(pData); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPipelineBinaryDataKHR copyFrom(VkPipelineBinaryDataKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `dataSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("size_t") long get_dataSize(MemorySegment segment, long index) { return (long) VH_dataSize.get(segment, 0L, index); }
    /// {@return `dataSize`}
    /// @param segment the segment of the struct
    public static @CType("size_t") long get_dataSize(MemorySegment segment) { return VkPipelineBinaryDataKHR.get_dataSize(segment, 0L); }
    /// {@return `dataSize`}
    public @CType("size_t") long dataSize() { return VkPipelineBinaryDataKHR.get_dataSize(this.segment()); }
    /// Sets `dataSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_dataSize(MemorySegment segment, long index, @CType("size_t") long value) { VH_dataSize.set(segment, 0L, index, value); }
    /// Sets `dataSize` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_dataSize(MemorySegment segment, @CType("size_t") long value) { VkPipelineBinaryDataKHR.set_dataSize(segment, 0L, value); }
    /// Sets `dataSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineBinaryDataKHR dataSize(@CType("size_t") long value) { VkPipelineBinaryDataKHR.set_dataSize(this.segment(), value); return this; }

    /// {@return `pData` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pData(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pData.get(segment, 0L, index); }
    /// {@return `pData`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pData(MemorySegment segment) { return VkPipelineBinaryDataKHR.get_pData(segment, 0L); }
    /// {@return `pData`}
    public @CType("void *") java.lang.foreign.MemorySegment pData() { return VkPipelineBinaryDataKHR.get_pData(this.segment()); }
    /// Sets `pData` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pData(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pData.set(segment, 0L, index, value); }
    /// Sets `pData` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pData(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkPipelineBinaryDataKHR.set_pData(segment, 0L, value); }
    /// Sets `pData` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineBinaryDataKHR pData(@CType("void *") java.lang.foreign.MemorySegment value) { VkPipelineBinaryDataKHR.set_pData(this.segment(), value); return this; }

    /// A buffer of [VkPipelineBinaryDataKHR].
    public static final class Buffer extends VkPipelineBinaryDataKHR {
        private final long elementCount;

        /// Creates `VkPipelineBinaryDataKHR.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkPipelineBinaryDataKHR`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkPipelineBinaryDataKHR`
        public VkPipelineBinaryDataKHR asSlice(long index) { return new VkPipelineBinaryDataKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkPipelineBinaryDataKHR`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkPipelineBinaryDataKHR`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `dataSize` at the given index}
        /// @param index the index
        public @CType("size_t") long dataSizeAt(long index) { return VkPipelineBinaryDataKHR.get_dataSize(this.segment(), index); }
        /// Sets `dataSize` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer dataSizeAt(long index, @CType("size_t") long value) { VkPipelineBinaryDataKHR.set_dataSize(this.segment(), index, value); return this; }

        /// {@return `pData` at the given index}
        /// @param index the index
        public @CType("void *") java.lang.foreign.MemorySegment pDataAt(long index) { return VkPipelineBinaryDataKHR.get_pData(this.segment(), index); }
        /// Sets `pData` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pDataAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkPipelineBinaryDataKHR.set_pData(this.segment(), index, value); return this; }

    }
}
