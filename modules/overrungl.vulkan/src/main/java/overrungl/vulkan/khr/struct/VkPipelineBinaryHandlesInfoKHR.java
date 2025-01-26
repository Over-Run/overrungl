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
/// struct VkPipelineBinaryHandlesInfoKHR {
///     VkStructureType sType;
///     const void* pNext;
///     uint32_t pipelineBinaryCount;
///     VkPipelineBinaryKHR* pPipelineBinaries;
/// };
/// ```
public sealed class VkPipelineBinaryHandlesInfoKHR extends GroupType {
    /// The struct layout of `VkPipelineBinaryHandlesInfoKHR`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("pipelineBinaryCount"),
        ValueLayout.ADDRESS.withName("pPipelineBinaries")
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
    /// The byte offset of `pipelineBinaryCount`.
    public static final long OFFSET_pipelineBinaryCount = LAYOUT.byteOffset(PathElement.groupElement("pipelineBinaryCount"));
    /// The memory layout of `pipelineBinaryCount`.
    public static final MemoryLayout LAYOUT_pipelineBinaryCount = LAYOUT.select(PathElement.groupElement("pipelineBinaryCount"));
    /// The [VarHandle] of `pipelineBinaryCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pipelineBinaryCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pipelineBinaryCount"));
    /// The byte offset of `pPipelineBinaries`.
    public static final long OFFSET_pPipelineBinaries = LAYOUT.byteOffset(PathElement.groupElement("pPipelineBinaries"));
    /// The memory layout of `pPipelineBinaries`.
    public static final MemoryLayout LAYOUT_pPipelineBinaries = LAYOUT.select(PathElement.groupElement("pPipelineBinaries"));
    /// The [VarHandle] of `pPipelineBinaries` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pPipelineBinaries = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pPipelineBinaries"));

    /// Creates `VkPipelineBinaryHandlesInfoKHR` with the given segment.
    /// @param segment the memory segment
    public VkPipelineBinaryHandlesInfoKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPipelineBinaryHandlesInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPipelineBinaryHandlesInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineBinaryHandlesInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineBinaryHandlesInfoKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPipelineBinaryHandlesInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkPipelineBinaryHandlesInfoKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPipelineBinaryHandlesInfoKHR`
    public static VkPipelineBinaryHandlesInfoKHR alloc(SegmentAllocator allocator) { return new VkPipelineBinaryHandlesInfoKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPipelineBinaryHandlesInfoKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPipelineBinaryHandlesInfoKHR`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPipelineBinaryHandlesInfoKHR copyFrom(VkPipelineBinaryHandlesInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }

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
    public VkPipelineBinaryHandlesInfoKHR sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPipelineBinaryHandlesInfoKHR pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `pipelineBinaryCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int pipelineBinaryCount(MemorySegment segment, long index) { return (int) VH_pipelineBinaryCount.get(segment, 0L, index); }
    /// {@return `pipelineBinaryCount`}
    public int pipelineBinaryCount() { return pipelineBinaryCount(this.segment(), 0L); }
    /// Sets `pipelineBinaryCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pipelineBinaryCount(MemorySegment segment, long index, int value) { VH_pipelineBinaryCount.set(segment, 0L, index, value); }
    /// Sets `pipelineBinaryCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineBinaryHandlesInfoKHR pipelineBinaryCount(int value) { pipelineBinaryCount(this.segment(), 0L, value); return this; }

    /// {@return `pPipelineBinaries` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pPipelineBinaries(MemorySegment segment, long index) { return (MemorySegment) VH_pPipelineBinaries.get(segment, 0L, index); }
    /// {@return `pPipelineBinaries`}
    public MemorySegment pPipelineBinaries() { return pPipelineBinaries(this.segment(), 0L); }
    /// Sets `pPipelineBinaries` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pPipelineBinaries(MemorySegment segment, long index, MemorySegment value) { VH_pPipelineBinaries.set(segment, 0L, index, value); }
    /// Sets `pPipelineBinaries` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineBinaryHandlesInfoKHR pPipelineBinaries(MemorySegment value) { pPipelineBinaries(this.segment(), 0L, value); return this; }

    /// A buffer of [VkPipelineBinaryHandlesInfoKHR].
    public static final class Buffer extends VkPipelineBinaryHandlesInfoKHR {
        private final long elementCount;

        /// Creates `VkPipelineBinaryHandlesInfoKHR.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkPipelineBinaryHandlesInfoKHR`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkPipelineBinaryHandlesInfoKHR`
        public VkPipelineBinaryHandlesInfoKHR asSlice(long index) { return new VkPipelineBinaryHandlesInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkPipelineBinaryHandlesInfoKHR`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkPipelineBinaryHandlesInfoKHR`
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

        /// {@return `pipelineBinaryCount` at the given index}
        /// @param index the index of the struct buffer
        public int pipelineBinaryCountAt(long index) { return pipelineBinaryCount(this.segment(), index); }
        /// Sets `pipelineBinaryCount` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer pipelineBinaryCountAt(long index, int value) { pipelineBinaryCount(this.segment(), index, value); return this; }

        /// {@return `pPipelineBinaries` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment pPipelineBinariesAt(long index) { return pPipelineBinaries(this.segment(), index); }
        /// Sets `pPipelineBinaries` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer pPipelineBinariesAt(long index, MemorySegment value) { pPipelineBinaries(this.segment(), index, value); return this; }

    }
}
