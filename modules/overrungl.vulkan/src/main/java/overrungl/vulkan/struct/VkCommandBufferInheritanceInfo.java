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
/// struct VkCommandBufferInheritanceInfo {
///     VkStructureType sType;
///     const void* pNext;
///     VkRenderPass renderPass;
///     uint32_t subpass;
///     VkFramebuffer framebuffer;
///     VkBool32 occlusionQueryEnable;
///     VkQueryControlFlags queryFlags;
///     VkQueryPipelineStatisticFlags pipelineStatistics;
/// };
/// ```
public sealed class VkCommandBufferInheritanceInfo extends GroupType {
    /// The struct layout of `VkCommandBufferInheritanceInfo`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("renderPass"),
        ValueLayout.JAVA_INT.withName("subpass"),
        ValueLayout.JAVA_LONG.withName("framebuffer"),
        ValueLayout.JAVA_INT.withName("occlusionQueryEnable"),
        ValueLayout.JAVA_INT.withName("queryFlags"),
        ValueLayout.JAVA_INT.withName("pipelineStatistics")
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
    /// The byte offset of `renderPass`.
    public static final long OFFSET_renderPass = LAYOUT.byteOffset(PathElement.groupElement("renderPass"));
    /// The memory layout of `renderPass`.
    public static final MemoryLayout LAYOUT_renderPass = LAYOUT.select(PathElement.groupElement("renderPass"));
    /// The [VarHandle] of `renderPass` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_renderPass = LAYOUT.arrayElementVarHandle(PathElement.groupElement("renderPass"));
    /// The byte offset of `subpass`.
    public static final long OFFSET_subpass = LAYOUT.byteOffset(PathElement.groupElement("subpass"));
    /// The memory layout of `subpass`.
    public static final MemoryLayout LAYOUT_subpass = LAYOUT.select(PathElement.groupElement("subpass"));
    /// The [VarHandle] of `subpass` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_subpass = LAYOUT.arrayElementVarHandle(PathElement.groupElement("subpass"));
    /// The byte offset of `framebuffer`.
    public static final long OFFSET_framebuffer = LAYOUT.byteOffset(PathElement.groupElement("framebuffer"));
    /// The memory layout of `framebuffer`.
    public static final MemoryLayout LAYOUT_framebuffer = LAYOUT.select(PathElement.groupElement("framebuffer"));
    /// The [VarHandle] of `framebuffer` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_framebuffer = LAYOUT.arrayElementVarHandle(PathElement.groupElement("framebuffer"));
    /// The byte offset of `occlusionQueryEnable`.
    public static final long OFFSET_occlusionQueryEnable = LAYOUT.byteOffset(PathElement.groupElement("occlusionQueryEnable"));
    /// The memory layout of `occlusionQueryEnable`.
    public static final MemoryLayout LAYOUT_occlusionQueryEnable = LAYOUT.select(PathElement.groupElement("occlusionQueryEnable"));
    /// The [VarHandle] of `occlusionQueryEnable` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_occlusionQueryEnable = LAYOUT.arrayElementVarHandle(PathElement.groupElement("occlusionQueryEnable"));
    /// The byte offset of `queryFlags`.
    public static final long OFFSET_queryFlags = LAYOUT.byteOffset(PathElement.groupElement("queryFlags"));
    /// The memory layout of `queryFlags`.
    public static final MemoryLayout LAYOUT_queryFlags = LAYOUT.select(PathElement.groupElement("queryFlags"));
    /// The [VarHandle] of `queryFlags` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_queryFlags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("queryFlags"));
    /// The byte offset of `pipelineStatistics`.
    public static final long OFFSET_pipelineStatistics = LAYOUT.byteOffset(PathElement.groupElement("pipelineStatistics"));
    /// The memory layout of `pipelineStatistics`.
    public static final MemoryLayout LAYOUT_pipelineStatistics = LAYOUT.select(PathElement.groupElement("pipelineStatistics"));
    /// The [VarHandle] of `pipelineStatistics` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pipelineStatistics = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pipelineStatistics"));

    /// Creates `VkCommandBufferInheritanceInfo` with the given segment.
    /// @param segment the memory segment
    public VkCommandBufferInheritanceInfo(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkCommandBufferInheritanceInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkCommandBufferInheritanceInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkCommandBufferInheritanceInfo ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkCommandBufferInheritanceInfo(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkCommandBufferInheritanceInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkCommandBufferInheritanceInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkCommandBufferInheritanceInfo`
    public static VkCommandBufferInheritanceInfo alloc(SegmentAllocator allocator) { return new VkCommandBufferInheritanceInfo(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkCommandBufferInheritanceInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkCommandBufferInheritanceInfo`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkCommandBufferInheritanceInfo copyFrom(VkCommandBufferInheritanceInfo src) { this.segment().copyFrom(src.segment()); return this; }

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
    public VkCommandBufferInheritanceInfo sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkCommandBufferInheritanceInfo pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `renderPass` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long renderPass(MemorySegment segment, long index) { return (long) VH_renderPass.get(segment, 0L, index); }
    /// {@return `renderPass`}
    public long renderPass() { return renderPass(this.segment(), 0L); }
    /// Sets `renderPass` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void renderPass(MemorySegment segment, long index, long value) { VH_renderPass.set(segment, 0L, index, value); }
    /// Sets `renderPass` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCommandBufferInheritanceInfo renderPass(long value) { renderPass(this.segment(), 0L, value); return this; }

    /// {@return `subpass` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int subpass(MemorySegment segment, long index) { return (int) VH_subpass.get(segment, 0L, index); }
    /// {@return `subpass`}
    public int subpass() { return subpass(this.segment(), 0L); }
    /// Sets `subpass` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void subpass(MemorySegment segment, long index, int value) { VH_subpass.set(segment, 0L, index, value); }
    /// Sets `subpass` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCommandBufferInheritanceInfo subpass(int value) { subpass(this.segment(), 0L, value); return this; }

    /// {@return `framebuffer` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long framebuffer(MemorySegment segment, long index) { return (long) VH_framebuffer.get(segment, 0L, index); }
    /// {@return `framebuffer`}
    public long framebuffer() { return framebuffer(this.segment(), 0L); }
    /// Sets `framebuffer` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void framebuffer(MemorySegment segment, long index, long value) { VH_framebuffer.set(segment, 0L, index, value); }
    /// Sets `framebuffer` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCommandBufferInheritanceInfo framebuffer(long value) { framebuffer(this.segment(), 0L, value); return this; }

    /// {@return `occlusionQueryEnable` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int occlusionQueryEnable(MemorySegment segment, long index) { return (int) VH_occlusionQueryEnable.get(segment, 0L, index); }
    /// {@return `occlusionQueryEnable`}
    public int occlusionQueryEnable() { return occlusionQueryEnable(this.segment(), 0L); }
    /// Sets `occlusionQueryEnable` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void occlusionQueryEnable(MemorySegment segment, long index, int value) { VH_occlusionQueryEnable.set(segment, 0L, index, value); }
    /// Sets `occlusionQueryEnable` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCommandBufferInheritanceInfo occlusionQueryEnable(int value) { occlusionQueryEnable(this.segment(), 0L, value); return this; }

    /// {@return `queryFlags` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int queryFlags(MemorySegment segment, long index) { return (int) VH_queryFlags.get(segment, 0L, index); }
    /// {@return `queryFlags`}
    public int queryFlags() { return queryFlags(this.segment(), 0L); }
    /// Sets `queryFlags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void queryFlags(MemorySegment segment, long index, int value) { VH_queryFlags.set(segment, 0L, index, value); }
    /// Sets `queryFlags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCommandBufferInheritanceInfo queryFlags(int value) { queryFlags(this.segment(), 0L, value); return this; }

    /// {@return `pipelineStatistics` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int pipelineStatistics(MemorySegment segment, long index) { return (int) VH_pipelineStatistics.get(segment, 0L, index); }
    /// {@return `pipelineStatistics`}
    public int pipelineStatistics() { return pipelineStatistics(this.segment(), 0L); }
    /// Sets `pipelineStatistics` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pipelineStatistics(MemorySegment segment, long index, int value) { VH_pipelineStatistics.set(segment, 0L, index, value); }
    /// Sets `pipelineStatistics` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCommandBufferInheritanceInfo pipelineStatistics(int value) { pipelineStatistics(this.segment(), 0L, value); return this; }

    /// A buffer of [VkCommandBufferInheritanceInfo].
    public static final class Buffer extends VkCommandBufferInheritanceInfo {
        private final long elementCount;

        /// Creates `VkCommandBufferInheritanceInfo.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkCommandBufferInheritanceInfo`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkCommandBufferInheritanceInfo`
        public VkCommandBufferInheritanceInfo asSlice(long index) { return new VkCommandBufferInheritanceInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkCommandBufferInheritanceInfo`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkCommandBufferInheritanceInfo`
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

        /// {@return `renderPass` at the given index}
        /// @param index the index of the struct buffer
        public long renderPassAt(long index) { return renderPass(this.segment(), index); }
        /// Sets `renderPass` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer renderPassAt(long index, long value) { renderPass(this.segment(), index, value); return this; }

        /// {@return `subpass` at the given index}
        /// @param index the index of the struct buffer
        public int subpassAt(long index) { return subpass(this.segment(), index); }
        /// Sets `subpass` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer subpassAt(long index, int value) { subpass(this.segment(), index, value); return this; }

        /// {@return `framebuffer` at the given index}
        /// @param index the index of the struct buffer
        public long framebufferAt(long index) { return framebuffer(this.segment(), index); }
        /// Sets `framebuffer` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer framebufferAt(long index, long value) { framebuffer(this.segment(), index, value); return this; }

        /// {@return `occlusionQueryEnable` at the given index}
        /// @param index the index of the struct buffer
        public int occlusionQueryEnableAt(long index) { return occlusionQueryEnable(this.segment(), index); }
        /// Sets `occlusionQueryEnable` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer occlusionQueryEnableAt(long index, int value) { occlusionQueryEnable(this.segment(), index, value); return this; }

        /// {@return `queryFlags` at the given index}
        /// @param index the index of the struct buffer
        public int queryFlagsAt(long index) { return queryFlags(this.segment(), index); }
        /// Sets `queryFlags` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer queryFlagsAt(long index, int value) { queryFlags(this.segment(), index, value); return this; }

        /// {@return `pipelineStatistics` at the given index}
        /// @param index the index of the struct buffer
        public int pipelineStatisticsAt(long index) { return pipelineStatistics(this.segment(), index); }
        /// Sets `pipelineStatistics` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer pipelineStatisticsAt(long index, int value) { pipelineStatistics(this.segment(), index, value); return this; }

    }
}
