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
/// struct VkPipelineBinaryCreateInfoKHR {
///     (int) VkStructureType sType;
///     const void* pNext;
///     const VkPipelineBinaryKeysAndDataKHR* pKeysAndDataInfo;
///     (uint64_t) VkPipeline pipeline;
///     const VkPipelineCreateInfoKHR* pPipelineCreateInfo;
/// };
/// ```
public sealed class VkPipelineBinaryCreateInfoKHR extends GroupType {
    /// The struct layout of `VkPipelineBinaryCreateInfoKHR`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("pKeysAndDataInfo"),
        ValueLayout.JAVA_LONG.withName("pipeline"),
        ValueLayout.ADDRESS.withName("pPipelineCreateInfo")
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
    /// The byte offset of `pKeysAndDataInfo`.
    public static final long OFFSET_pKeysAndDataInfo = LAYOUT.byteOffset(PathElement.groupElement("pKeysAndDataInfo"));
    /// The memory layout of `pKeysAndDataInfo`.
    public static final MemoryLayout LAYOUT_pKeysAndDataInfo = LAYOUT.select(PathElement.groupElement("pKeysAndDataInfo"));
    /// The [VarHandle] of `pKeysAndDataInfo` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pKeysAndDataInfo = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pKeysAndDataInfo"));
    /// The byte offset of `pipeline`.
    public static final long OFFSET_pipeline = LAYOUT.byteOffset(PathElement.groupElement("pipeline"));
    /// The memory layout of `pipeline`.
    public static final MemoryLayout LAYOUT_pipeline = LAYOUT.select(PathElement.groupElement("pipeline"));
    /// The [VarHandle] of `pipeline` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pipeline = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pipeline"));
    /// The byte offset of `pPipelineCreateInfo`.
    public static final long OFFSET_pPipelineCreateInfo = LAYOUT.byteOffset(PathElement.groupElement("pPipelineCreateInfo"));
    /// The memory layout of `pPipelineCreateInfo`.
    public static final MemoryLayout LAYOUT_pPipelineCreateInfo = LAYOUT.select(PathElement.groupElement("pPipelineCreateInfo"));
    /// The [VarHandle] of `pPipelineCreateInfo` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pPipelineCreateInfo = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pPipelineCreateInfo"));

    /// Creates `VkPipelineBinaryCreateInfoKHR` with the given segment.
    /// @param segment the memory segment
    public VkPipelineBinaryCreateInfoKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPipelineBinaryCreateInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPipelineBinaryCreateInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineBinaryCreateInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineBinaryCreateInfoKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPipelineBinaryCreateInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkPipelineBinaryCreateInfoKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPipelineBinaryCreateInfoKHR`
    public static VkPipelineBinaryCreateInfoKHR alloc(SegmentAllocator allocator) { return new VkPipelineBinaryCreateInfoKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPipelineBinaryCreateInfoKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPipelineBinaryCreateInfoKHR`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPipelineBinaryCreateInfoKHR copyFrom(VkPipelineBinaryCreateInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }

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
    public VkPipelineBinaryCreateInfoKHR sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPipelineBinaryCreateInfoKHR pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `pKeysAndDataInfo` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pKeysAndDataInfo(MemorySegment segment, long index) { return (MemorySegment) VH_pKeysAndDataInfo.get(segment, 0L, index); }
    /// {@return `pKeysAndDataInfo`}
    public MemorySegment pKeysAndDataInfo() { return pKeysAndDataInfo(this.segment(), 0L); }
    /// Sets `pKeysAndDataInfo` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pKeysAndDataInfo(MemorySegment segment, long index, MemorySegment value) { VH_pKeysAndDataInfo.set(segment, 0L, index, value); }
    /// Sets `pKeysAndDataInfo` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineBinaryCreateInfoKHR pKeysAndDataInfo(MemorySegment value) { pKeysAndDataInfo(this.segment(), 0L, value); return this; }

    /// {@return `pipeline` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long pipeline(MemorySegment segment, long index) { return (long) VH_pipeline.get(segment, 0L, index); }
    /// {@return `pipeline`}
    public long pipeline() { return pipeline(this.segment(), 0L); }
    /// Sets `pipeline` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pipeline(MemorySegment segment, long index, long value) { VH_pipeline.set(segment, 0L, index, value); }
    /// Sets `pipeline` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineBinaryCreateInfoKHR pipeline(long value) { pipeline(this.segment(), 0L, value); return this; }

    /// {@return `pPipelineCreateInfo` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pPipelineCreateInfo(MemorySegment segment, long index) { return (MemorySegment) VH_pPipelineCreateInfo.get(segment, 0L, index); }
    /// {@return `pPipelineCreateInfo`}
    public MemorySegment pPipelineCreateInfo() { return pPipelineCreateInfo(this.segment(), 0L); }
    /// Sets `pPipelineCreateInfo` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pPipelineCreateInfo(MemorySegment segment, long index, MemorySegment value) { VH_pPipelineCreateInfo.set(segment, 0L, index, value); }
    /// Sets `pPipelineCreateInfo` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineBinaryCreateInfoKHR pPipelineCreateInfo(MemorySegment value) { pPipelineCreateInfo(this.segment(), 0L, value); return this; }

    /// A buffer of [VkPipelineBinaryCreateInfoKHR].
    public static final class Buffer extends VkPipelineBinaryCreateInfoKHR {
        private final long elementCount;

        /// Creates `VkPipelineBinaryCreateInfoKHR.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkPipelineBinaryCreateInfoKHR`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkPipelineBinaryCreateInfoKHR`
        public VkPipelineBinaryCreateInfoKHR asSlice(long index) { return new VkPipelineBinaryCreateInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkPipelineBinaryCreateInfoKHR`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkPipelineBinaryCreateInfoKHR`
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

        /// {@return `pKeysAndDataInfo` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment pKeysAndDataInfoAt(long index) { return pKeysAndDataInfo(this.segment(), index); }
        /// Sets `pKeysAndDataInfo` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer pKeysAndDataInfoAt(long index, MemorySegment value) { pKeysAndDataInfo(this.segment(), index, value); return this; }

        /// {@return `pipeline` at the given index}
        /// @param index the index of the struct buffer
        public long pipelineAt(long index) { return pipeline(this.segment(), index); }
        /// Sets `pipeline` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer pipelineAt(long index, long value) { pipeline(this.segment(), index, value); return this; }

        /// {@return `pPipelineCreateInfo` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment pPipelineCreateInfoAt(long index) { return pPipelineCreateInfo(this.segment(), index); }
        /// Sets `pPipelineCreateInfo` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer pPipelineCreateInfoAt(long index, MemorySegment value) { pPipelineCreateInfo(this.segment(), index, value); return this; }

    }
}
