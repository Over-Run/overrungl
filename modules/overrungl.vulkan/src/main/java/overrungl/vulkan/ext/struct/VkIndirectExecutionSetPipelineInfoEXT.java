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
package overrungl.vulkan.ext.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkIndirectExecutionSetPipelineInfoEXT {
///     (int) VkStructureType sType;
///     const void* pNext;
///     (uint64_t) VkPipeline initialPipeline;
///     uint32_t maxPipelineCount;
/// };
/// ```
public sealed class VkIndirectExecutionSetPipelineInfoEXT extends GroupType {
    /// The struct layout of `VkIndirectExecutionSetPipelineInfoEXT`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("initialPipeline"),
        ValueLayout.JAVA_INT.withName("maxPipelineCount")
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
    /// The byte offset of `initialPipeline`.
    public static final long OFFSET_initialPipeline = LAYOUT.byteOffset(PathElement.groupElement("initialPipeline"));
    /// The memory layout of `initialPipeline`.
    public static final MemoryLayout LAYOUT_initialPipeline = LAYOUT.select(PathElement.groupElement("initialPipeline"));
    /// The [VarHandle] of `initialPipeline` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_initialPipeline = LAYOUT.arrayElementVarHandle(PathElement.groupElement("initialPipeline"));
    /// The byte offset of `maxPipelineCount`.
    public static final long OFFSET_maxPipelineCount = LAYOUT.byteOffset(PathElement.groupElement("maxPipelineCount"));
    /// The memory layout of `maxPipelineCount`.
    public static final MemoryLayout LAYOUT_maxPipelineCount = LAYOUT.select(PathElement.groupElement("maxPipelineCount"));
    /// The [VarHandle] of `maxPipelineCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxPipelineCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxPipelineCount"));

    /// Creates `VkIndirectExecutionSetPipelineInfoEXT` with the given segment.
    /// @param segment the memory segment
    public VkIndirectExecutionSetPipelineInfoEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkIndirectExecutionSetPipelineInfoEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkIndirectExecutionSetPipelineInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkIndirectExecutionSetPipelineInfoEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkIndirectExecutionSetPipelineInfoEXT(segment.reinterpret(LAYOUT.byteSize())); }

    /// Creates `VkIndirectExecutionSetPipelineInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkIndirectExecutionSetPipelineInfoEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkIndirectExecutionSetPipelineInfoEXT`
    public static VkIndirectExecutionSetPipelineInfoEXT alloc(SegmentAllocator allocator) { return new VkIndirectExecutionSetPipelineInfoEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkIndirectExecutionSetPipelineInfoEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkIndirectExecutionSetPipelineInfoEXT`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkIndirectExecutionSetPipelineInfoEXT copyFrom(VkIndirectExecutionSetPipelineInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }

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
    public VkIndirectExecutionSetPipelineInfoEXT sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkIndirectExecutionSetPipelineInfoEXT pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `initialPipeline` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long initialPipeline(MemorySegment segment, long index) { return (long) VH_initialPipeline.get(segment, 0L, index); }
    /// {@return `initialPipeline`}
    public long initialPipeline() { return initialPipeline(this.segment(), 0L); }
    /// Sets `initialPipeline` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void initialPipeline(MemorySegment segment, long index, long value) { VH_initialPipeline.set(segment, 0L, index, value); }
    /// Sets `initialPipeline` with the given value.
    /// @param value the value
    /// @return `this`
    public VkIndirectExecutionSetPipelineInfoEXT initialPipeline(long value) { initialPipeline(this.segment(), 0L, value); return this; }

    /// {@return `maxPipelineCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxPipelineCount(MemorySegment segment, long index) { return (int) VH_maxPipelineCount.get(segment, 0L, index); }
    /// {@return `maxPipelineCount`}
    public int maxPipelineCount() { return maxPipelineCount(this.segment(), 0L); }
    /// Sets `maxPipelineCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxPipelineCount(MemorySegment segment, long index, int value) { VH_maxPipelineCount.set(segment, 0L, index, value); }
    /// Sets `maxPipelineCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkIndirectExecutionSetPipelineInfoEXT maxPipelineCount(int value) { maxPipelineCount(this.segment(), 0L, value); return this; }

    /// A buffer of [VkIndirectExecutionSetPipelineInfoEXT].
    public static final class Buffer extends VkIndirectExecutionSetPipelineInfoEXT {
        private final long elementCount;

        /// Creates `VkIndirectExecutionSetPipelineInfoEXT.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkIndirectExecutionSetPipelineInfoEXT`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkIndirectExecutionSetPipelineInfoEXT`
        public VkIndirectExecutionSetPipelineInfoEXT asSlice(long index) { return new VkIndirectExecutionSetPipelineInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkIndirectExecutionSetPipelineInfoEXT`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkIndirectExecutionSetPipelineInfoEXT`
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

        /// {@return `initialPipeline` at the given index}
        /// @param index the index of the struct buffer
        public long initialPipelineAt(long index) { return initialPipeline(this.segment(), index); }
        /// Sets `initialPipeline` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer initialPipelineAt(long index, long value) { initialPipeline(this.segment(), index, value); return this; }

        /// {@return `maxPipelineCount` at the given index}
        /// @param index the index of the struct buffer
        public int maxPipelineCountAt(long index) { return maxPipelineCount(this.segment(), index); }
        /// Sets `maxPipelineCount` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer maxPipelineCountAt(long index, int value) { maxPipelineCount(this.segment(), index, value); return this; }

    }
}
