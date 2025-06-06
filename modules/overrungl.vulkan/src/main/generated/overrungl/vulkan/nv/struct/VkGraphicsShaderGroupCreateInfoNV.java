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
package overrungl.vulkan.nv.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkGraphicsShaderGroupCreateInfoNV {
///     (int) VkStructureType sType;
///     const void* pNext;
///     uint32_t stageCount;
///     const VkPipelineShaderStageCreateInfo* pStages;
///     const VkPipelineVertexInputStateCreateInfo* pVertexInputState;
///     const VkPipelineTessellationStateCreateInfo* pTessellationState;
/// };
/// ```
public sealed class VkGraphicsShaderGroupCreateInfoNV extends GroupType {
    /// The struct layout of `VkGraphicsShaderGroupCreateInfoNV`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("stageCount"),
        ValueLayout.ADDRESS.withName("pStages"),
        ValueLayout.ADDRESS.withName("pVertexInputState"),
        ValueLayout.ADDRESS.withName("pTessellationState")
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
    /// The byte offset of `stageCount`.
    public static final long OFFSET_stageCount = LAYOUT.byteOffset(PathElement.groupElement("stageCount"));
    /// The memory layout of `stageCount`.
    public static final MemoryLayout LAYOUT_stageCount = LAYOUT.select(PathElement.groupElement("stageCount"));
    /// The [VarHandle] of `stageCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_stageCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("stageCount"));
    /// The byte offset of `pStages`.
    public static final long OFFSET_pStages = LAYOUT.byteOffset(PathElement.groupElement("pStages"));
    /// The memory layout of `pStages`.
    public static final MemoryLayout LAYOUT_pStages = LAYOUT.select(PathElement.groupElement("pStages"));
    /// The [VarHandle] of `pStages` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pStages = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pStages"));
    /// The byte offset of `pVertexInputState`.
    public static final long OFFSET_pVertexInputState = LAYOUT.byteOffset(PathElement.groupElement("pVertexInputState"));
    /// The memory layout of `pVertexInputState`.
    public static final MemoryLayout LAYOUT_pVertexInputState = LAYOUT.select(PathElement.groupElement("pVertexInputState"));
    /// The [VarHandle] of `pVertexInputState` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pVertexInputState = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pVertexInputState"));
    /// The byte offset of `pTessellationState`.
    public static final long OFFSET_pTessellationState = LAYOUT.byteOffset(PathElement.groupElement("pTessellationState"));
    /// The memory layout of `pTessellationState`.
    public static final MemoryLayout LAYOUT_pTessellationState = LAYOUT.select(PathElement.groupElement("pTessellationState"));
    /// The [VarHandle] of `pTessellationState` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pTessellationState = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pTessellationState"));

    /// Creates `VkGraphicsShaderGroupCreateInfoNV` with the given segment.
    /// @param segment the memory segment
    public VkGraphicsShaderGroupCreateInfoNV(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkGraphicsShaderGroupCreateInfoNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkGraphicsShaderGroupCreateInfoNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkGraphicsShaderGroupCreateInfoNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkGraphicsShaderGroupCreateInfoNV(segment.reinterpret(LAYOUT.byteSize())); }

    /// Creates `VkGraphicsShaderGroupCreateInfoNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkGraphicsShaderGroupCreateInfoNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkGraphicsShaderGroupCreateInfoNV`
    public static VkGraphicsShaderGroupCreateInfoNV alloc(SegmentAllocator allocator) { return new VkGraphicsShaderGroupCreateInfoNV(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkGraphicsShaderGroupCreateInfoNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkGraphicsShaderGroupCreateInfoNV`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkGraphicsShaderGroupCreateInfoNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param stageCount `stageCount`
    /// @param pStages `pStages`
    /// @param pVertexInputState `pVertexInputState`
    /// @param pTessellationState `pTessellationState`
    /// @return the allocated `VkGraphicsShaderGroupCreateInfoNV`
    public static VkGraphicsShaderGroupCreateInfoNV allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int stageCount, MemorySegment pStages, MemorySegment pVertexInputState, MemorySegment pTessellationState) {
        return alloc(allocator).sType(sType).pNext(pNext).stageCount(stageCount).pStages(pStages).pVertexInputState(pVertexInputState).pTessellationState(pTessellationState);
    }

    /// Allocates a `VkGraphicsShaderGroupCreateInfoNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param stageCount `stageCount`
    /// @param pStages `pStages`
    /// @param pVertexInputState `pVertexInputState`
    /// @return the allocated `VkGraphicsShaderGroupCreateInfoNV`
    public static VkGraphicsShaderGroupCreateInfoNV allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int stageCount, MemorySegment pStages, MemorySegment pVertexInputState) {
        return alloc(allocator).sType(sType).pNext(pNext).stageCount(stageCount).pStages(pStages).pVertexInputState(pVertexInputState);
    }

    /// Allocates a `VkGraphicsShaderGroupCreateInfoNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param stageCount `stageCount`
    /// @param pStages `pStages`
    /// @return the allocated `VkGraphicsShaderGroupCreateInfoNV`
    public static VkGraphicsShaderGroupCreateInfoNV allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int stageCount, MemorySegment pStages) {
        return alloc(allocator).sType(sType).pNext(pNext).stageCount(stageCount).pStages(pStages);
    }

    /// Allocates a `VkGraphicsShaderGroupCreateInfoNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param stageCount `stageCount`
    /// @return the allocated `VkGraphicsShaderGroupCreateInfoNV`
    public static VkGraphicsShaderGroupCreateInfoNV allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int stageCount) {
        return alloc(allocator).sType(sType).pNext(pNext).stageCount(stageCount);
    }

    /// Allocates a `VkGraphicsShaderGroupCreateInfoNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @return the allocated `VkGraphicsShaderGroupCreateInfoNV`
    public static VkGraphicsShaderGroupCreateInfoNV allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext) {
        return alloc(allocator).sType(sType).pNext(pNext);
    }

    /// Allocates a `VkGraphicsShaderGroupCreateInfoNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @return the allocated `VkGraphicsShaderGroupCreateInfoNV`
    public static VkGraphicsShaderGroupCreateInfoNV allocInit(SegmentAllocator allocator, int sType) {
        return alloc(allocator).sType(sType);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkGraphicsShaderGroupCreateInfoNV copyFrom(VkGraphicsShaderGroupCreateInfoNV src) { this.segment().copyFrom(src.segment()); return this; }

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
    public VkGraphicsShaderGroupCreateInfoNV sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkGraphicsShaderGroupCreateInfoNV pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `stageCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int stageCount(MemorySegment segment, long index) { return (int) VH_stageCount.get(segment, 0L, index); }
    /// {@return `stageCount`}
    public int stageCount() { return stageCount(this.segment(), 0L); }
    /// Sets `stageCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void stageCount(MemorySegment segment, long index, int value) { VH_stageCount.set(segment, 0L, index, value); }
    /// Sets `stageCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkGraphicsShaderGroupCreateInfoNV stageCount(int value) { stageCount(this.segment(), 0L, value); return this; }

    /// {@return `pStages` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pStages(MemorySegment segment, long index) { return (MemorySegment) VH_pStages.get(segment, 0L, index); }
    /// {@return `pStages`}
    public MemorySegment pStages() { return pStages(this.segment(), 0L); }
    /// Sets `pStages` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pStages(MemorySegment segment, long index, MemorySegment value) { VH_pStages.set(segment, 0L, index, value); }
    /// Sets `pStages` with the given value.
    /// @param value the value
    /// @return `this`
    public VkGraphicsShaderGroupCreateInfoNV pStages(MemorySegment value) { pStages(this.segment(), 0L, value); return this; }

    /// {@return `pVertexInputState` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pVertexInputState(MemorySegment segment, long index) { return (MemorySegment) VH_pVertexInputState.get(segment, 0L, index); }
    /// {@return `pVertexInputState`}
    public MemorySegment pVertexInputState() { return pVertexInputState(this.segment(), 0L); }
    /// Sets `pVertexInputState` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pVertexInputState(MemorySegment segment, long index, MemorySegment value) { VH_pVertexInputState.set(segment, 0L, index, value); }
    /// Sets `pVertexInputState` with the given value.
    /// @param value the value
    /// @return `this`
    public VkGraphicsShaderGroupCreateInfoNV pVertexInputState(MemorySegment value) { pVertexInputState(this.segment(), 0L, value); return this; }

    /// {@return `pTessellationState` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pTessellationState(MemorySegment segment, long index) { return (MemorySegment) VH_pTessellationState.get(segment, 0L, index); }
    /// {@return `pTessellationState`}
    public MemorySegment pTessellationState() { return pTessellationState(this.segment(), 0L); }
    /// Sets `pTessellationState` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pTessellationState(MemorySegment segment, long index, MemorySegment value) { VH_pTessellationState.set(segment, 0L, index, value); }
    /// Sets `pTessellationState` with the given value.
    /// @param value the value
    /// @return `this`
    public VkGraphicsShaderGroupCreateInfoNV pTessellationState(MemorySegment value) { pTessellationState(this.segment(), 0L, value); return this; }

    /// A buffer of [VkGraphicsShaderGroupCreateInfoNV].
    public static final class Buffer extends VkGraphicsShaderGroupCreateInfoNV {
        private final long elementCount;

        /// Creates `VkGraphicsShaderGroupCreateInfoNV.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkGraphicsShaderGroupCreateInfoNV`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkGraphicsShaderGroupCreateInfoNV`
        public VkGraphicsShaderGroupCreateInfoNV asSlice(long index) { return new VkGraphicsShaderGroupCreateInfoNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkGraphicsShaderGroupCreateInfoNV`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkGraphicsShaderGroupCreateInfoNV`
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

        /// {@return `stageCount` at the given index}
        /// @param index the index of the struct buffer
        public int stageCountAt(long index) { return stageCount(this.segment(), index); }
        /// Sets `stageCount` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer stageCountAt(long index, int value) { stageCount(this.segment(), index, value); return this; }

        /// {@return `pStages` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment pStagesAt(long index) { return pStages(this.segment(), index); }
        /// Sets `pStages` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer pStagesAt(long index, MemorySegment value) { pStages(this.segment(), index, value); return this; }

        /// {@return `pVertexInputState` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment pVertexInputStateAt(long index) { return pVertexInputState(this.segment(), index); }
        /// Sets `pVertexInputState` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer pVertexInputStateAt(long index, MemorySegment value) { pVertexInputState(this.segment(), index, value); return this; }

        /// {@return `pTessellationState` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment pTessellationStateAt(long index) { return pTessellationState(this.segment(), index); }
        /// Sets `pTessellationState` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer pTessellationStateAt(long index, MemorySegment value) { pTessellationState(this.segment(), index, value); return this; }

    }
}
