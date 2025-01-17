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
/// [VarHandle][#VH_pNext] - [Getter][#pNext()] - [Setter][#pNext(java.lang.foreign.MemorySegment)]
/// ### groupCount
/// [VarHandle][#VH_groupCount] - [Getter][#groupCount()] - [Setter][#groupCount(int)]
/// ### pGroups
/// [VarHandle][#VH_pGroups] - [Getter][#pGroups()] - [Setter][#pGroups(java.lang.foreign.MemorySegment)]
/// ### pipelineCount
/// [VarHandle][#VH_pipelineCount] - [Getter][#pipelineCount()] - [Setter][#pipelineCount(int)]
/// ### pPipelines
/// [VarHandle][#VH_pPipelines] - [Getter][#pPipelines()] - [Setter][#pPipelines(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkGraphicsPipelineShaderGroupsCreateInfoNV {
///     VkStructureType sType;
///     const void * pNext;
///     uint32_t groupCount;
///     const VkGraphicsShaderGroupCreateInfoNV * pGroups;
///     uint32_t pipelineCount;
///     const VkPipeline * pPipelines;
/// } VkGraphicsPipelineShaderGroupsCreateInfoNV;
/// ```
public sealed class VkGraphicsPipelineShaderGroupsCreateInfoNV extends Struct {
    /// The struct layout of `VkGraphicsPipelineShaderGroupsCreateInfoNV`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("groupCount"),
        ValueLayout.ADDRESS.withName("pGroups"),
        ValueLayout.JAVA_INT.withName("pipelineCount"),
        ValueLayout.ADDRESS.withName("pPipelines")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `groupCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_groupCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("groupCount"));
    /// The [VarHandle] of `pGroups` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pGroups = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pGroups"));
    /// The [VarHandle] of `pipelineCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_pipelineCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pipelineCount"));
    /// The [VarHandle] of `pPipelines` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pPipelines = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pPipelines"));

    /// Creates `VkGraphicsPipelineShaderGroupsCreateInfoNV` with the given segment.
    /// @param segment the memory segment
    public VkGraphicsPipelineShaderGroupsCreateInfoNV(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkGraphicsPipelineShaderGroupsCreateInfoNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkGraphicsPipelineShaderGroupsCreateInfoNV of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkGraphicsPipelineShaderGroupsCreateInfoNV(segment); }

    /// Creates `VkGraphicsPipelineShaderGroupsCreateInfoNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkGraphicsPipelineShaderGroupsCreateInfoNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkGraphicsPipelineShaderGroupsCreateInfoNV ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkGraphicsPipelineShaderGroupsCreateInfoNV(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkGraphicsPipelineShaderGroupsCreateInfoNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkGraphicsPipelineShaderGroupsCreateInfoNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkGraphicsPipelineShaderGroupsCreateInfoNV`
    public static VkGraphicsPipelineShaderGroupsCreateInfoNV alloc(SegmentAllocator allocator) { return new VkGraphicsPipelineShaderGroupsCreateInfoNV(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkGraphicsPipelineShaderGroupsCreateInfoNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkGraphicsPipelineShaderGroupsCreateInfoNV`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkGraphicsPipelineShaderGroupsCreateInfoNV` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkGraphicsPipelineShaderGroupsCreateInfoNV`
    public static VkGraphicsPipelineShaderGroupsCreateInfoNV allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("const void *") java.lang.foreign.MemorySegment pNext, @CType("uint32_t") int groupCount, @CType("const VkGraphicsShaderGroupCreateInfoNV *") java.lang.foreign.MemorySegment pGroups, @CType("uint32_t") int pipelineCount, @CType("const VkPipeline *") java.lang.foreign.MemorySegment pPipelines) { return alloc(allocator).sType(sType).pNext(pNext).groupCount(groupCount).pGroups(pGroups).pipelineCount(pipelineCount).pPipelines(pPipelines); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkGraphicsPipelineShaderGroupsCreateInfoNV copyFrom(VkGraphicsPipelineShaderGroupsCreateInfoNV src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkGraphicsPipelineShaderGroupsCreateInfoNV.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkGraphicsPipelineShaderGroupsCreateInfoNV.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkGraphicsPipelineShaderGroupsCreateInfoNV.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkGraphicsPipelineShaderGroupsCreateInfoNV sType(@CType("VkStructureType") int value) { VkGraphicsPipelineShaderGroupsCreateInfoNV.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkGraphicsPipelineShaderGroupsCreateInfoNV.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkGraphicsPipelineShaderGroupsCreateInfoNV.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkGraphicsPipelineShaderGroupsCreateInfoNV.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkGraphicsPipelineShaderGroupsCreateInfoNV pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkGraphicsPipelineShaderGroupsCreateInfoNV.set_pNext(this.segment(), value); return this; }

    /// {@return `groupCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_groupCount(MemorySegment segment, long index) { return (int) VH_groupCount.get(segment, 0L, index); }
    /// {@return `groupCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_groupCount(MemorySegment segment) { return VkGraphicsPipelineShaderGroupsCreateInfoNV.get_groupCount(segment, 0L); }
    /// {@return `groupCount`}
    public @CType("uint32_t") int groupCount() { return VkGraphicsPipelineShaderGroupsCreateInfoNV.get_groupCount(this.segment()); }
    /// Sets `groupCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_groupCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_groupCount.set(segment, 0L, index, value); }
    /// Sets `groupCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_groupCount(MemorySegment segment, @CType("uint32_t") int value) { VkGraphicsPipelineShaderGroupsCreateInfoNV.set_groupCount(segment, 0L, value); }
    /// Sets `groupCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkGraphicsPipelineShaderGroupsCreateInfoNV groupCount(@CType("uint32_t") int value) { VkGraphicsPipelineShaderGroupsCreateInfoNV.set_groupCount(this.segment(), value); return this; }

    /// {@return `pGroups` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const VkGraphicsShaderGroupCreateInfoNV *") java.lang.foreign.MemorySegment get_pGroups(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pGroups.get(segment, 0L, index); }
    /// {@return `pGroups`}
    /// @param segment the segment of the struct
    public static @CType("const VkGraphicsShaderGroupCreateInfoNV *") java.lang.foreign.MemorySegment get_pGroups(MemorySegment segment) { return VkGraphicsPipelineShaderGroupsCreateInfoNV.get_pGroups(segment, 0L); }
    /// {@return `pGroups`}
    public @CType("const VkGraphicsShaderGroupCreateInfoNV *") java.lang.foreign.MemorySegment pGroups() { return VkGraphicsPipelineShaderGroupsCreateInfoNV.get_pGroups(this.segment()); }
    /// Sets `pGroups` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pGroups(MemorySegment segment, long index, @CType("const VkGraphicsShaderGroupCreateInfoNV *") java.lang.foreign.MemorySegment value) { VH_pGroups.set(segment, 0L, index, value); }
    /// Sets `pGroups` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pGroups(MemorySegment segment, @CType("const VkGraphicsShaderGroupCreateInfoNV *") java.lang.foreign.MemorySegment value) { VkGraphicsPipelineShaderGroupsCreateInfoNV.set_pGroups(segment, 0L, value); }
    /// Sets `pGroups` with the given value.
    /// @param value the value
    /// @return `this`
    public VkGraphicsPipelineShaderGroupsCreateInfoNV pGroups(@CType("const VkGraphicsShaderGroupCreateInfoNV *") java.lang.foreign.MemorySegment value) { VkGraphicsPipelineShaderGroupsCreateInfoNV.set_pGroups(this.segment(), value); return this; }

    /// {@return `pipelineCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_pipelineCount(MemorySegment segment, long index) { return (int) VH_pipelineCount.get(segment, 0L, index); }
    /// {@return `pipelineCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_pipelineCount(MemorySegment segment) { return VkGraphicsPipelineShaderGroupsCreateInfoNV.get_pipelineCount(segment, 0L); }
    /// {@return `pipelineCount`}
    public @CType("uint32_t") int pipelineCount() { return VkGraphicsPipelineShaderGroupsCreateInfoNV.get_pipelineCount(this.segment()); }
    /// Sets `pipelineCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pipelineCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_pipelineCount.set(segment, 0L, index, value); }
    /// Sets `pipelineCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pipelineCount(MemorySegment segment, @CType("uint32_t") int value) { VkGraphicsPipelineShaderGroupsCreateInfoNV.set_pipelineCount(segment, 0L, value); }
    /// Sets `pipelineCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkGraphicsPipelineShaderGroupsCreateInfoNV pipelineCount(@CType("uint32_t") int value) { VkGraphicsPipelineShaderGroupsCreateInfoNV.set_pipelineCount(this.segment(), value); return this; }

    /// {@return `pPipelines` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const VkPipeline *") java.lang.foreign.MemorySegment get_pPipelines(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pPipelines.get(segment, 0L, index); }
    /// {@return `pPipelines`}
    /// @param segment the segment of the struct
    public static @CType("const VkPipeline *") java.lang.foreign.MemorySegment get_pPipelines(MemorySegment segment) { return VkGraphicsPipelineShaderGroupsCreateInfoNV.get_pPipelines(segment, 0L); }
    /// {@return `pPipelines`}
    public @CType("const VkPipeline *") java.lang.foreign.MemorySegment pPipelines() { return VkGraphicsPipelineShaderGroupsCreateInfoNV.get_pPipelines(this.segment()); }
    /// Sets `pPipelines` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pPipelines(MemorySegment segment, long index, @CType("const VkPipeline *") java.lang.foreign.MemorySegment value) { VH_pPipelines.set(segment, 0L, index, value); }
    /// Sets `pPipelines` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pPipelines(MemorySegment segment, @CType("const VkPipeline *") java.lang.foreign.MemorySegment value) { VkGraphicsPipelineShaderGroupsCreateInfoNV.set_pPipelines(segment, 0L, value); }
    /// Sets `pPipelines` with the given value.
    /// @param value the value
    /// @return `this`
    public VkGraphicsPipelineShaderGroupsCreateInfoNV pPipelines(@CType("const VkPipeline *") java.lang.foreign.MemorySegment value) { VkGraphicsPipelineShaderGroupsCreateInfoNV.set_pPipelines(this.segment(), value); return this; }

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
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkGraphicsPipelineShaderGroupsCreateInfoNV.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkGraphicsPipelineShaderGroupsCreateInfoNV.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkGraphicsPipelineShaderGroupsCreateInfoNV.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkGraphicsPipelineShaderGroupsCreateInfoNV.set_pNext(this.segment(), index, value); return this; }

        /// {@return `groupCount` at the given index}
        /// @param index the index
        public @CType("uint32_t") int groupCountAt(long index) { return VkGraphicsPipelineShaderGroupsCreateInfoNV.get_groupCount(this.segment(), index); }
        /// Sets `groupCount` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer groupCountAt(long index, @CType("uint32_t") int value) { VkGraphicsPipelineShaderGroupsCreateInfoNV.set_groupCount(this.segment(), index, value); return this; }

        /// {@return `pGroups` at the given index}
        /// @param index the index
        public @CType("const VkGraphicsShaderGroupCreateInfoNV *") java.lang.foreign.MemorySegment pGroupsAt(long index) { return VkGraphicsPipelineShaderGroupsCreateInfoNV.get_pGroups(this.segment(), index); }
        /// Sets `pGroups` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pGroupsAt(long index, @CType("const VkGraphicsShaderGroupCreateInfoNV *") java.lang.foreign.MemorySegment value) { VkGraphicsPipelineShaderGroupsCreateInfoNV.set_pGroups(this.segment(), index, value); return this; }

        /// {@return `pipelineCount` at the given index}
        /// @param index the index
        public @CType("uint32_t") int pipelineCountAt(long index) { return VkGraphicsPipelineShaderGroupsCreateInfoNV.get_pipelineCount(this.segment(), index); }
        /// Sets `pipelineCount` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pipelineCountAt(long index, @CType("uint32_t") int value) { VkGraphicsPipelineShaderGroupsCreateInfoNV.set_pipelineCount(this.segment(), index, value); return this; }

        /// {@return `pPipelines` at the given index}
        /// @param index the index
        public @CType("const VkPipeline *") java.lang.foreign.MemorySegment pPipelinesAt(long index) { return VkGraphicsPipelineShaderGroupsCreateInfoNV.get_pPipelines(this.segment(), index); }
        /// Sets `pPipelines` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pPipelinesAt(long index, @CType("const VkPipeline *") java.lang.foreign.MemorySegment value) { VkGraphicsPipelineShaderGroupsCreateInfoNV.set_pPipelines(this.segment(), index, value); return this; }

    }
}
