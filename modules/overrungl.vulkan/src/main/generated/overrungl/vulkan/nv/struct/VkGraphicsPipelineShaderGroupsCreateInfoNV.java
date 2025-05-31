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
/// struct VkGraphicsPipelineShaderGroupsCreateInfoNV {
///     (int) VkStructureType sType;
///     const void* pNext;
///     uint32_t groupCount;
///     const VkGraphicsShaderGroupCreateInfoNV* pGroups;
///     uint32_t pipelineCount;
///     const VkPipeline* pPipelines;
/// };
/// ```
public sealed class VkGraphicsPipelineShaderGroupsCreateInfoNV extends GroupType {
    /// The struct layout of `VkGraphicsPipelineShaderGroupsCreateInfoNV`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("groupCount"),
        ValueLayout.ADDRESS.withName("pGroups"),
        ValueLayout.JAVA_INT.withName("pipelineCount"),
        ValueLayout.ADDRESS.withName("pPipelines")
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
    /// The byte offset of `groupCount`.
    public static final long OFFSET_groupCount = LAYOUT.byteOffset(PathElement.groupElement("groupCount"));
    /// The memory layout of `groupCount`.
    public static final MemoryLayout LAYOUT_groupCount = LAYOUT.select(PathElement.groupElement("groupCount"));
    /// The [VarHandle] of `groupCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_groupCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("groupCount"));
    /// The byte offset of `pGroups`.
    public static final long OFFSET_pGroups = LAYOUT.byteOffset(PathElement.groupElement("pGroups"));
    /// The memory layout of `pGroups`.
    public static final MemoryLayout LAYOUT_pGroups = LAYOUT.select(PathElement.groupElement("pGroups"));
    /// The [VarHandle] of `pGroups` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pGroups = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pGroups"));
    /// The byte offset of `pipelineCount`.
    public static final long OFFSET_pipelineCount = LAYOUT.byteOffset(PathElement.groupElement("pipelineCount"));
    /// The memory layout of `pipelineCount`.
    public static final MemoryLayout LAYOUT_pipelineCount = LAYOUT.select(PathElement.groupElement("pipelineCount"));
    /// The [VarHandle] of `pipelineCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pipelineCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pipelineCount"));
    /// The byte offset of `pPipelines`.
    public static final long OFFSET_pPipelines = LAYOUT.byteOffset(PathElement.groupElement("pPipelines"));
    /// The memory layout of `pPipelines`.
    public static final MemoryLayout LAYOUT_pPipelines = LAYOUT.select(PathElement.groupElement("pPipelines"));
    /// The [VarHandle] of `pPipelines` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pPipelines = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pPipelines"));

    /// Creates `VkGraphicsPipelineShaderGroupsCreateInfoNV` with the given segment.
    /// @param segment the memory segment
    public VkGraphicsPipelineShaderGroupsCreateInfoNV(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkGraphicsPipelineShaderGroupsCreateInfoNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkGraphicsPipelineShaderGroupsCreateInfoNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkGraphicsPipelineShaderGroupsCreateInfoNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkGraphicsPipelineShaderGroupsCreateInfoNV(segment.reinterpret(LAYOUT.byteSize())); }

    /// Creates `VkGraphicsPipelineShaderGroupsCreateInfoNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkGraphicsPipelineShaderGroupsCreateInfoNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkGraphicsPipelineShaderGroupsCreateInfoNV`
    public static VkGraphicsPipelineShaderGroupsCreateInfoNV alloc(SegmentAllocator allocator) { return new VkGraphicsPipelineShaderGroupsCreateInfoNV(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkGraphicsPipelineShaderGroupsCreateInfoNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkGraphicsPipelineShaderGroupsCreateInfoNV`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkGraphicsPipelineShaderGroupsCreateInfoNV copyFrom(VkGraphicsPipelineShaderGroupsCreateInfoNV src) { this.segment().copyFrom(src.segment()); return this; }

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
    public VkGraphicsPipelineShaderGroupsCreateInfoNV sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkGraphicsPipelineShaderGroupsCreateInfoNV pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `groupCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int groupCount(MemorySegment segment, long index) { return (int) VH_groupCount.get(segment, 0L, index); }
    /// {@return `groupCount`}
    public int groupCount() { return groupCount(this.segment(), 0L); }
    /// Sets `groupCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void groupCount(MemorySegment segment, long index, int value) { VH_groupCount.set(segment, 0L, index, value); }
    /// Sets `groupCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkGraphicsPipelineShaderGroupsCreateInfoNV groupCount(int value) { groupCount(this.segment(), 0L, value); return this; }

    /// {@return `pGroups` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pGroups(MemorySegment segment, long index) { return (MemorySegment) VH_pGroups.get(segment, 0L, index); }
    /// {@return `pGroups`}
    public MemorySegment pGroups() { return pGroups(this.segment(), 0L); }
    /// Sets `pGroups` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pGroups(MemorySegment segment, long index, MemorySegment value) { VH_pGroups.set(segment, 0L, index, value); }
    /// Sets `pGroups` with the given value.
    /// @param value the value
    /// @return `this`
    public VkGraphicsPipelineShaderGroupsCreateInfoNV pGroups(MemorySegment value) { pGroups(this.segment(), 0L, value); return this; }

    /// {@return `pipelineCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int pipelineCount(MemorySegment segment, long index) { return (int) VH_pipelineCount.get(segment, 0L, index); }
    /// {@return `pipelineCount`}
    public int pipelineCount() { return pipelineCount(this.segment(), 0L); }
    /// Sets `pipelineCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pipelineCount(MemorySegment segment, long index, int value) { VH_pipelineCount.set(segment, 0L, index, value); }
    /// Sets `pipelineCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkGraphicsPipelineShaderGroupsCreateInfoNV pipelineCount(int value) { pipelineCount(this.segment(), 0L, value); return this; }

    /// {@return `pPipelines` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pPipelines(MemorySegment segment, long index) { return (MemorySegment) VH_pPipelines.get(segment, 0L, index); }
    /// {@return `pPipelines`}
    public MemorySegment pPipelines() { return pPipelines(this.segment(), 0L); }
    /// Sets `pPipelines` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pPipelines(MemorySegment segment, long index, MemorySegment value) { VH_pPipelines.set(segment, 0L, index, value); }
    /// Sets `pPipelines` with the given value.
    /// @param value the value
    /// @return `this`
    public VkGraphicsPipelineShaderGroupsCreateInfoNV pPipelines(MemorySegment value) { pPipelines(this.segment(), 0L, value); return this; }

    /// A buffer of [VkGraphicsPipelineShaderGroupsCreateInfoNV].
    public static final class Buffer extends VkGraphicsPipelineShaderGroupsCreateInfoNV {
        private final long elementCount;

        /// Creates `VkGraphicsPipelineShaderGroupsCreateInfoNV.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkGraphicsPipelineShaderGroupsCreateInfoNV`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkGraphicsPipelineShaderGroupsCreateInfoNV`
        public VkGraphicsPipelineShaderGroupsCreateInfoNV asSlice(long index) { return new VkGraphicsPipelineShaderGroupsCreateInfoNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkGraphicsPipelineShaderGroupsCreateInfoNV`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkGraphicsPipelineShaderGroupsCreateInfoNV`
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

        /// {@return `groupCount` at the given index}
        /// @param index the index of the struct buffer
        public int groupCountAt(long index) { return groupCount(this.segment(), index); }
        /// Sets `groupCount` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer groupCountAt(long index, int value) { groupCount(this.segment(), index, value); return this; }

        /// {@return `pGroups` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment pGroupsAt(long index) { return pGroups(this.segment(), index); }
        /// Sets `pGroups` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer pGroupsAt(long index, MemorySegment value) { pGroups(this.segment(), index, value); return this; }

        /// {@return `pipelineCount` at the given index}
        /// @param index the index of the struct buffer
        public int pipelineCountAt(long index) { return pipelineCount(this.segment(), index); }
        /// Sets `pipelineCount` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer pipelineCountAt(long index, int value) { pipelineCount(this.segment(), index, value); return this; }

        /// {@return `pPipelines` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment pPipelinesAt(long index) { return pPipelines(this.segment(), index); }
        /// Sets `pPipelines` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer pPipelinesAt(long index, MemorySegment value) { pPipelines(this.segment(), index, value); return this; }

    }
}
