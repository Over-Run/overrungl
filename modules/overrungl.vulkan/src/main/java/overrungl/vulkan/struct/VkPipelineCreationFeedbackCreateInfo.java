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
package overrungl.vulkan.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkPipelineCreationFeedbackCreateInfo {
///     (int) VkStructureType sType;
///     const void* pNext;
///     VkPipelineCreationFeedback* pPipelineCreationFeedback;
///     uint32_t pipelineStageCreationFeedbackCount;
///     VkPipelineCreationFeedback* pPipelineStageCreationFeedbacks;
/// };
/// ```
public sealed class VkPipelineCreationFeedbackCreateInfo extends GroupType {
    /// The struct layout of `VkPipelineCreationFeedbackCreateInfo`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("pPipelineCreationFeedback"),
        ValueLayout.JAVA_INT.withName("pipelineStageCreationFeedbackCount"),
        ValueLayout.ADDRESS.withName("pPipelineStageCreationFeedbacks")
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
    /// The byte offset of `pPipelineCreationFeedback`.
    public static final long OFFSET_pPipelineCreationFeedback = LAYOUT.byteOffset(PathElement.groupElement("pPipelineCreationFeedback"));
    /// The memory layout of `pPipelineCreationFeedback`.
    public static final MemoryLayout LAYOUT_pPipelineCreationFeedback = LAYOUT.select(PathElement.groupElement("pPipelineCreationFeedback"));
    /// The [VarHandle] of `pPipelineCreationFeedback` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pPipelineCreationFeedback = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pPipelineCreationFeedback"));
    /// The byte offset of `pipelineStageCreationFeedbackCount`.
    public static final long OFFSET_pipelineStageCreationFeedbackCount = LAYOUT.byteOffset(PathElement.groupElement("pipelineStageCreationFeedbackCount"));
    /// The memory layout of `pipelineStageCreationFeedbackCount`.
    public static final MemoryLayout LAYOUT_pipelineStageCreationFeedbackCount = LAYOUT.select(PathElement.groupElement("pipelineStageCreationFeedbackCount"));
    /// The [VarHandle] of `pipelineStageCreationFeedbackCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pipelineStageCreationFeedbackCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pipelineStageCreationFeedbackCount"));
    /// The byte offset of `pPipelineStageCreationFeedbacks`.
    public static final long OFFSET_pPipelineStageCreationFeedbacks = LAYOUT.byteOffset(PathElement.groupElement("pPipelineStageCreationFeedbacks"));
    /// The memory layout of `pPipelineStageCreationFeedbacks`.
    public static final MemoryLayout LAYOUT_pPipelineStageCreationFeedbacks = LAYOUT.select(PathElement.groupElement("pPipelineStageCreationFeedbacks"));
    /// The [VarHandle] of `pPipelineStageCreationFeedbacks` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pPipelineStageCreationFeedbacks = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pPipelineStageCreationFeedbacks"));

    /// Creates `VkPipelineCreationFeedbackCreateInfo` with the given segment.
    /// @param segment the memory segment
    public VkPipelineCreationFeedbackCreateInfo(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPipelineCreationFeedbackCreateInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPipelineCreationFeedbackCreateInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineCreationFeedbackCreateInfo ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineCreationFeedbackCreateInfo(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPipelineCreationFeedbackCreateInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkPipelineCreationFeedbackCreateInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPipelineCreationFeedbackCreateInfo`
    public static VkPipelineCreationFeedbackCreateInfo alloc(SegmentAllocator allocator) { return new VkPipelineCreationFeedbackCreateInfo(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPipelineCreationFeedbackCreateInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPipelineCreationFeedbackCreateInfo`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPipelineCreationFeedbackCreateInfo copyFrom(VkPipelineCreationFeedbackCreateInfo src) { this.segment().copyFrom(src.segment()); return this; }

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
    public VkPipelineCreationFeedbackCreateInfo sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPipelineCreationFeedbackCreateInfo pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `pPipelineCreationFeedback` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pPipelineCreationFeedback(MemorySegment segment, long index) { return (MemorySegment) VH_pPipelineCreationFeedback.get(segment, 0L, index); }
    /// {@return `pPipelineCreationFeedback`}
    public MemorySegment pPipelineCreationFeedback() { return pPipelineCreationFeedback(this.segment(), 0L); }
    /// Sets `pPipelineCreationFeedback` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pPipelineCreationFeedback(MemorySegment segment, long index, MemorySegment value) { VH_pPipelineCreationFeedback.set(segment, 0L, index, value); }
    /// Sets `pPipelineCreationFeedback` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineCreationFeedbackCreateInfo pPipelineCreationFeedback(MemorySegment value) { pPipelineCreationFeedback(this.segment(), 0L, value); return this; }

    /// {@return `pipelineStageCreationFeedbackCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int pipelineStageCreationFeedbackCount(MemorySegment segment, long index) { return (int) VH_pipelineStageCreationFeedbackCount.get(segment, 0L, index); }
    /// {@return `pipelineStageCreationFeedbackCount`}
    public int pipelineStageCreationFeedbackCount() { return pipelineStageCreationFeedbackCount(this.segment(), 0L); }
    /// Sets `pipelineStageCreationFeedbackCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pipelineStageCreationFeedbackCount(MemorySegment segment, long index, int value) { VH_pipelineStageCreationFeedbackCount.set(segment, 0L, index, value); }
    /// Sets `pipelineStageCreationFeedbackCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineCreationFeedbackCreateInfo pipelineStageCreationFeedbackCount(int value) { pipelineStageCreationFeedbackCount(this.segment(), 0L, value); return this; }

    /// {@return `pPipelineStageCreationFeedbacks` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pPipelineStageCreationFeedbacks(MemorySegment segment, long index) { return (MemorySegment) VH_pPipelineStageCreationFeedbacks.get(segment, 0L, index); }
    /// {@return `pPipelineStageCreationFeedbacks`}
    public MemorySegment pPipelineStageCreationFeedbacks() { return pPipelineStageCreationFeedbacks(this.segment(), 0L); }
    /// Sets `pPipelineStageCreationFeedbacks` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pPipelineStageCreationFeedbacks(MemorySegment segment, long index, MemorySegment value) { VH_pPipelineStageCreationFeedbacks.set(segment, 0L, index, value); }
    /// Sets `pPipelineStageCreationFeedbacks` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineCreationFeedbackCreateInfo pPipelineStageCreationFeedbacks(MemorySegment value) { pPipelineStageCreationFeedbacks(this.segment(), 0L, value); return this; }

    /// A buffer of [VkPipelineCreationFeedbackCreateInfo].
    public static final class Buffer extends VkPipelineCreationFeedbackCreateInfo {
        private final long elementCount;

        /// Creates `VkPipelineCreationFeedbackCreateInfo.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkPipelineCreationFeedbackCreateInfo`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkPipelineCreationFeedbackCreateInfo`
        public VkPipelineCreationFeedbackCreateInfo asSlice(long index) { return new VkPipelineCreationFeedbackCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkPipelineCreationFeedbackCreateInfo`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkPipelineCreationFeedbackCreateInfo`
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

        /// {@return `pPipelineCreationFeedback` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment pPipelineCreationFeedbackAt(long index) { return pPipelineCreationFeedback(this.segment(), index); }
        /// Sets `pPipelineCreationFeedback` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer pPipelineCreationFeedbackAt(long index, MemorySegment value) { pPipelineCreationFeedback(this.segment(), index, value); return this; }

        /// {@return `pipelineStageCreationFeedbackCount` at the given index}
        /// @param index the index of the struct buffer
        public int pipelineStageCreationFeedbackCountAt(long index) { return pipelineStageCreationFeedbackCount(this.segment(), index); }
        /// Sets `pipelineStageCreationFeedbackCount` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer pipelineStageCreationFeedbackCountAt(long index, int value) { pipelineStageCreationFeedbackCount(this.segment(), index, value); return this; }

        /// {@return `pPipelineStageCreationFeedbacks` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment pPipelineStageCreationFeedbacksAt(long index) { return pPipelineStageCreationFeedbacks(this.segment(), index); }
        /// Sets `pPipelineStageCreationFeedbacks` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer pPipelineStageCreationFeedbacksAt(long index, MemorySegment value) { pPipelineStageCreationFeedbacks(this.segment(), index, value); return this; }

    }
}
