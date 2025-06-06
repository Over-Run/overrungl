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
//@formatter:off
package overrungl.vulkan.khr.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkPipelineBinaryDataInfoKHR {
///     (int) VkStructureType sType;
///     void* pNext;
///     (uint64_t) VkPipelineBinaryKHR pipelineBinary;
/// };
/// ```
public sealed class VkPipelineBinaryDataInfoKHR extends GroupType {
    /// The struct layout of `VkPipelineBinaryDataInfoKHR`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("pipelineBinary")
    );
    /// The byte offset of `sType`.
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    /// The memory layout of `sType`.
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The byte offset of `pNext`.
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    /// The memory layout of `pNext`.
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The byte offset of `pipelineBinary`.
    public static final long OFFSET_pipelineBinary = LAYOUT.byteOffset(PathElement.groupElement("pipelineBinary"));
    /// The memory layout of `pipelineBinary`.
    public static final MemoryLayout LAYOUT_pipelineBinary = LAYOUT.select(PathElement.groupElement("pipelineBinary"));
    /// The [VarHandle] of `pipelineBinary` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pipelineBinary = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pipelineBinary"));

    /// Creates `VkPipelineBinaryDataInfoKHR` with the given segment.
    /// @param segment the memory segment
    public VkPipelineBinaryDataInfoKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPipelineBinaryDataInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPipelineBinaryDataInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineBinaryDataInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineBinaryDataInfoKHR(segment.reinterpret(LAYOUT.byteSize())); }

    /// Creates `VkPipelineBinaryDataInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPipelineBinaryDataInfoKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPipelineBinaryDataInfoKHR`
    public static VkPipelineBinaryDataInfoKHR alloc(SegmentAllocator allocator) { return new VkPipelineBinaryDataInfoKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPipelineBinaryDataInfoKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPipelineBinaryDataInfoKHR`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkPipelineBinaryDataInfoKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param pipelineBinary `pipelineBinary`
    /// @return the allocated `VkPipelineBinaryDataInfoKHR`
    public static VkPipelineBinaryDataInfoKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, long pipelineBinary) {
        return alloc(allocator).sType(sType).pNext(pNext).pipelineBinary(pipelineBinary);
    }

    /// Allocates a `VkPipelineBinaryDataInfoKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @return the allocated `VkPipelineBinaryDataInfoKHR`
    public static VkPipelineBinaryDataInfoKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext) {
        return alloc(allocator).sType(sType).pNext(pNext);
    }

    /// Allocates a `VkPipelineBinaryDataInfoKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @return the allocated `VkPipelineBinaryDataInfoKHR`
    public static VkPipelineBinaryDataInfoKHR allocInit(SegmentAllocator allocator, int sType) {
        return alloc(allocator).sType(sType);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPipelineBinaryDataInfoKHR copyFrom(VkPipelineBinaryDataInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { if (this instanceof Buffer buf) return buf; else return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    public int sType() { return sType(this.segment(), 0L); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void sType(MemorySegment segment, long index, int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineBinaryDataInfoKHR sType(int value) { sType(this.segment(), 0L, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    public MemorySegment pNext() { return pNext(this.segment(), 0L); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pNext(MemorySegment segment, long index, MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineBinaryDataInfoKHR pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `pipelineBinary` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long pipelineBinary(MemorySegment segment, long index) { return (long) VH_pipelineBinary.get(segment, 0L, index); }
    /// {@return `pipelineBinary`}
    public long pipelineBinary() { return pipelineBinary(this.segment(), 0L); }
    /// Sets `pipelineBinary` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pipelineBinary(MemorySegment segment, long index, long value) { VH_pipelineBinary.set(segment, 0L, index, value); }
    /// Sets `pipelineBinary` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineBinaryDataInfoKHR pipelineBinary(long value) { pipelineBinary(this.segment(), 0L, value); return this; }

    /// A buffer of [VkPipelineBinaryDataInfoKHR].
    public static final class Buffer extends VkPipelineBinaryDataInfoKHR {
        private final long elementCount;

        /// Creates `VkPipelineBinaryDataInfoKHR.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkPipelineBinaryDataInfoKHR`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkPipelineBinaryDataInfoKHR`
        public VkPipelineBinaryDataInfoKHR asSlice(long index) { return new VkPipelineBinaryDataInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkPipelineBinaryDataInfoKHR`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkPipelineBinaryDataInfoKHR`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index of the struct buffer
        public int sTypeAt(long index) { return sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

        /// {@return `pipelineBinary` at the given index}
        /// @param index the index of the struct buffer
        public long pipelineBinaryAt(long index) { return pipelineBinary(this.segment(), index); }
        /// Sets `pipelineBinary` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer pipelineBinaryAt(long index, long value) { pipelineBinary(this.segment(), index, value); return this; }

    }
}
