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
package overrungl.vulkan.struct;

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
/// ### renderPass
/// [VarHandle][#VH_renderPass] - [Getter][#renderPass()] - [Setter][#renderPass(java.lang.foreign.MemorySegment)]
/// ### subpass
/// [VarHandle][#VH_subpass] - [Getter][#subpass()] - [Setter][#subpass(int)]
/// ### framebuffer
/// [VarHandle][#VH_framebuffer] - [Getter][#framebuffer()] - [Setter][#framebuffer(java.lang.foreign.MemorySegment)]
/// ### occlusionQueryEnable
/// [VarHandle][#VH_occlusionQueryEnable] - [Getter][#occlusionQueryEnable()] - [Setter][#occlusionQueryEnable(int)]
/// ### queryFlags
/// [VarHandle][#VH_queryFlags] - [Getter][#queryFlags()] - [Setter][#queryFlags(int)]
/// ### pipelineStatistics
/// [VarHandle][#VH_pipelineStatistics] - [Getter][#pipelineStatistics()] - [Setter][#pipelineStatistics(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkCommandBufferInheritanceInfo {
///     VkStructureType sType;
///     const void * pNext;
///     VkRenderPass renderPass;
///     uint32_t subpass;
///     VkFramebuffer framebuffer;
///     VkBool32 occlusionQueryEnable;
///     VkQueryControlFlags queryFlags;
///     VkQueryPipelineStatisticFlags pipelineStatistics;
/// } VkCommandBufferInheritanceInfo;
/// ```
public final class VkCommandBufferInheritanceInfo extends Struct {
    /// The struct layout of `VkCommandBufferInheritanceInfo`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("renderPass"),
        ValueLayout.JAVA_INT.withName("subpass"),
        ValueLayout.ADDRESS.withName("framebuffer"),
        ValueLayout.JAVA_INT.withName("occlusionQueryEnable"),
        ValueLayout.JAVA_INT.withName("queryFlags"),
        ValueLayout.JAVA_INT.withName("pipelineStatistics")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `renderPass` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_renderPass = LAYOUT.arrayElementVarHandle(PathElement.groupElement("renderPass"));
    /// The [VarHandle] of `subpass` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_subpass = LAYOUT.arrayElementVarHandle(PathElement.groupElement("subpass"));
    /// The [VarHandle] of `framebuffer` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_framebuffer = LAYOUT.arrayElementVarHandle(PathElement.groupElement("framebuffer"));
    /// The [VarHandle] of `occlusionQueryEnable` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_occlusionQueryEnable = LAYOUT.arrayElementVarHandle(PathElement.groupElement("occlusionQueryEnable"));
    /// The [VarHandle] of `queryFlags` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_queryFlags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("queryFlags"));
    /// The [VarHandle] of `pipelineStatistics` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_pipelineStatistics = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pipelineStatistics"));

    /// Creates `VkCommandBufferInheritanceInfo` with the given segment.
    /// @param segment the memory segment
    public VkCommandBufferInheritanceInfo(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkCommandBufferInheritanceInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkCommandBufferInheritanceInfo of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkCommandBufferInheritanceInfo(segment); }

    /// Creates `VkCommandBufferInheritanceInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkCommandBufferInheritanceInfo ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkCommandBufferInheritanceInfo(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkCommandBufferInheritanceInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkCommandBufferInheritanceInfo ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkCommandBufferInheritanceInfo(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkCommandBufferInheritanceInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkCommandBufferInheritanceInfo`
    public static VkCommandBufferInheritanceInfo alloc(SegmentAllocator allocator) { return new VkCommandBufferInheritanceInfo(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkCommandBufferInheritanceInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkCommandBufferInheritanceInfo`
    public static VkCommandBufferInheritanceInfo alloc(SegmentAllocator allocator, long count) { return new VkCommandBufferInheritanceInfo(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkCommandBufferInheritanceInfo.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkCommandBufferInheritanceInfo.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkCommandBufferInheritanceInfo.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkCommandBufferInheritanceInfo.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkCommandBufferInheritanceInfo sTypeAt(long index, @CType("VkStructureType") int value) { VkCommandBufferInheritanceInfo.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCommandBufferInheritanceInfo sType(@CType("VkStructureType") int value) { VkCommandBufferInheritanceInfo.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkCommandBufferInheritanceInfo.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkCommandBufferInheritanceInfo.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkCommandBufferInheritanceInfo.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkCommandBufferInheritanceInfo.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkCommandBufferInheritanceInfo pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkCommandBufferInheritanceInfo.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCommandBufferInheritanceInfo pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkCommandBufferInheritanceInfo.set_pNext(this.segment(), value); return this; }

    /// {@return `renderPass` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkRenderPass") java.lang.foreign.MemorySegment get_renderPass(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_renderPass.get(segment, 0L, index); }
    /// {@return `renderPass`}
    /// @param segment the segment of the struct
    public static @CType("VkRenderPass") java.lang.foreign.MemorySegment get_renderPass(MemorySegment segment) { return VkCommandBufferInheritanceInfo.get_renderPass(segment, 0L); }
    /// {@return `renderPass` at the given index}
    /// @param index the index
    public @CType("VkRenderPass") java.lang.foreign.MemorySegment renderPassAt(long index) { return VkCommandBufferInheritanceInfo.get_renderPass(this.segment(), index); }
    /// {@return `renderPass`}
    public @CType("VkRenderPass") java.lang.foreign.MemorySegment renderPass() { return VkCommandBufferInheritanceInfo.get_renderPass(this.segment()); }
    /// Sets `renderPass` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_renderPass(MemorySegment segment, long index, @CType("VkRenderPass") java.lang.foreign.MemorySegment value) { VH_renderPass.set(segment, 0L, index, value); }
    /// Sets `renderPass` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_renderPass(MemorySegment segment, @CType("VkRenderPass") java.lang.foreign.MemorySegment value) { VkCommandBufferInheritanceInfo.set_renderPass(segment, 0L, value); }
    /// Sets `renderPass` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkCommandBufferInheritanceInfo renderPassAt(long index, @CType("VkRenderPass") java.lang.foreign.MemorySegment value) { VkCommandBufferInheritanceInfo.set_renderPass(this.segment(), index, value); return this; }
    /// Sets `renderPass` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCommandBufferInheritanceInfo renderPass(@CType("VkRenderPass") java.lang.foreign.MemorySegment value) { VkCommandBufferInheritanceInfo.set_renderPass(this.segment(), value); return this; }

    /// {@return `subpass` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_subpass(MemorySegment segment, long index) { return (int) VH_subpass.get(segment, 0L, index); }
    /// {@return `subpass`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_subpass(MemorySegment segment) { return VkCommandBufferInheritanceInfo.get_subpass(segment, 0L); }
    /// {@return `subpass` at the given index}
    /// @param index the index
    public @CType("uint32_t") int subpassAt(long index) { return VkCommandBufferInheritanceInfo.get_subpass(this.segment(), index); }
    /// {@return `subpass`}
    public @CType("uint32_t") int subpass() { return VkCommandBufferInheritanceInfo.get_subpass(this.segment()); }
    /// Sets `subpass` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_subpass(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_subpass.set(segment, 0L, index, value); }
    /// Sets `subpass` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_subpass(MemorySegment segment, @CType("uint32_t") int value) { VkCommandBufferInheritanceInfo.set_subpass(segment, 0L, value); }
    /// Sets `subpass` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkCommandBufferInheritanceInfo subpassAt(long index, @CType("uint32_t") int value) { VkCommandBufferInheritanceInfo.set_subpass(this.segment(), index, value); return this; }
    /// Sets `subpass` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCommandBufferInheritanceInfo subpass(@CType("uint32_t") int value) { VkCommandBufferInheritanceInfo.set_subpass(this.segment(), value); return this; }

    /// {@return `framebuffer` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkFramebuffer") java.lang.foreign.MemorySegment get_framebuffer(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_framebuffer.get(segment, 0L, index); }
    /// {@return `framebuffer`}
    /// @param segment the segment of the struct
    public static @CType("VkFramebuffer") java.lang.foreign.MemorySegment get_framebuffer(MemorySegment segment) { return VkCommandBufferInheritanceInfo.get_framebuffer(segment, 0L); }
    /// {@return `framebuffer` at the given index}
    /// @param index the index
    public @CType("VkFramebuffer") java.lang.foreign.MemorySegment framebufferAt(long index) { return VkCommandBufferInheritanceInfo.get_framebuffer(this.segment(), index); }
    /// {@return `framebuffer`}
    public @CType("VkFramebuffer") java.lang.foreign.MemorySegment framebuffer() { return VkCommandBufferInheritanceInfo.get_framebuffer(this.segment()); }
    /// Sets `framebuffer` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_framebuffer(MemorySegment segment, long index, @CType("VkFramebuffer") java.lang.foreign.MemorySegment value) { VH_framebuffer.set(segment, 0L, index, value); }
    /// Sets `framebuffer` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_framebuffer(MemorySegment segment, @CType("VkFramebuffer") java.lang.foreign.MemorySegment value) { VkCommandBufferInheritanceInfo.set_framebuffer(segment, 0L, value); }
    /// Sets `framebuffer` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkCommandBufferInheritanceInfo framebufferAt(long index, @CType("VkFramebuffer") java.lang.foreign.MemorySegment value) { VkCommandBufferInheritanceInfo.set_framebuffer(this.segment(), index, value); return this; }
    /// Sets `framebuffer` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCommandBufferInheritanceInfo framebuffer(@CType("VkFramebuffer") java.lang.foreign.MemorySegment value) { VkCommandBufferInheritanceInfo.set_framebuffer(this.segment(), value); return this; }

    /// {@return `occlusionQueryEnable` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_occlusionQueryEnable(MemorySegment segment, long index) { return (int) VH_occlusionQueryEnable.get(segment, 0L, index); }
    /// {@return `occlusionQueryEnable`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_occlusionQueryEnable(MemorySegment segment) { return VkCommandBufferInheritanceInfo.get_occlusionQueryEnable(segment, 0L); }
    /// {@return `occlusionQueryEnable` at the given index}
    /// @param index the index
    public @CType("VkBool32") int occlusionQueryEnableAt(long index) { return VkCommandBufferInheritanceInfo.get_occlusionQueryEnable(this.segment(), index); }
    /// {@return `occlusionQueryEnable`}
    public @CType("VkBool32") int occlusionQueryEnable() { return VkCommandBufferInheritanceInfo.get_occlusionQueryEnable(this.segment()); }
    /// Sets `occlusionQueryEnable` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_occlusionQueryEnable(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_occlusionQueryEnable.set(segment, 0L, index, value); }
    /// Sets `occlusionQueryEnable` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_occlusionQueryEnable(MemorySegment segment, @CType("VkBool32") int value) { VkCommandBufferInheritanceInfo.set_occlusionQueryEnable(segment, 0L, value); }
    /// Sets `occlusionQueryEnable` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkCommandBufferInheritanceInfo occlusionQueryEnableAt(long index, @CType("VkBool32") int value) { VkCommandBufferInheritanceInfo.set_occlusionQueryEnable(this.segment(), index, value); return this; }
    /// Sets `occlusionQueryEnable` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCommandBufferInheritanceInfo occlusionQueryEnable(@CType("VkBool32") int value) { VkCommandBufferInheritanceInfo.set_occlusionQueryEnable(this.segment(), value); return this; }

    /// {@return `queryFlags` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkQueryControlFlags") int get_queryFlags(MemorySegment segment, long index) { return (int) VH_queryFlags.get(segment, 0L, index); }
    /// {@return `queryFlags`}
    /// @param segment the segment of the struct
    public static @CType("VkQueryControlFlags") int get_queryFlags(MemorySegment segment) { return VkCommandBufferInheritanceInfo.get_queryFlags(segment, 0L); }
    /// {@return `queryFlags` at the given index}
    /// @param index the index
    public @CType("VkQueryControlFlags") int queryFlagsAt(long index) { return VkCommandBufferInheritanceInfo.get_queryFlags(this.segment(), index); }
    /// {@return `queryFlags`}
    public @CType("VkQueryControlFlags") int queryFlags() { return VkCommandBufferInheritanceInfo.get_queryFlags(this.segment()); }
    /// Sets `queryFlags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_queryFlags(MemorySegment segment, long index, @CType("VkQueryControlFlags") int value) { VH_queryFlags.set(segment, 0L, index, value); }
    /// Sets `queryFlags` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_queryFlags(MemorySegment segment, @CType("VkQueryControlFlags") int value) { VkCommandBufferInheritanceInfo.set_queryFlags(segment, 0L, value); }
    /// Sets `queryFlags` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkCommandBufferInheritanceInfo queryFlagsAt(long index, @CType("VkQueryControlFlags") int value) { VkCommandBufferInheritanceInfo.set_queryFlags(this.segment(), index, value); return this; }
    /// Sets `queryFlags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCommandBufferInheritanceInfo queryFlags(@CType("VkQueryControlFlags") int value) { VkCommandBufferInheritanceInfo.set_queryFlags(this.segment(), value); return this; }

    /// {@return `pipelineStatistics` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkQueryPipelineStatisticFlags") int get_pipelineStatistics(MemorySegment segment, long index) { return (int) VH_pipelineStatistics.get(segment, 0L, index); }
    /// {@return `pipelineStatistics`}
    /// @param segment the segment of the struct
    public static @CType("VkQueryPipelineStatisticFlags") int get_pipelineStatistics(MemorySegment segment) { return VkCommandBufferInheritanceInfo.get_pipelineStatistics(segment, 0L); }
    /// {@return `pipelineStatistics` at the given index}
    /// @param index the index
    public @CType("VkQueryPipelineStatisticFlags") int pipelineStatisticsAt(long index) { return VkCommandBufferInheritanceInfo.get_pipelineStatistics(this.segment(), index); }
    /// {@return `pipelineStatistics`}
    public @CType("VkQueryPipelineStatisticFlags") int pipelineStatistics() { return VkCommandBufferInheritanceInfo.get_pipelineStatistics(this.segment()); }
    /// Sets `pipelineStatistics` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pipelineStatistics(MemorySegment segment, long index, @CType("VkQueryPipelineStatisticFlags") int value) { VH_pipelineStatistics.set(segment, 0L, index, value); }
    /// Sets `pipelineStatistics` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pipelineStatistics(MemorySegment segment, @CType("VkQueryPipelineStatisticFlags") int value) { VkCommandBufferInheritanceInfo.set_pipelineStatistics(segment, 0L, value); }
    /// Sets `pipelineStatistics` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkCommandBufferInheritanceInfo pipelineStatisticsAt(long index, @CType("VkQueryPipelineStatisticFlags") int value) { VkCommandBufferInheritanceInfo.set_pipelineStatistics(this.segment(), index, value); return this; }
    /// Sets `pipelineStatistics` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCommandBufferInheritanceInfo pipelineStatistics(@CType("VkQueryPipelineStatisticFlags") int value) { VkCommandBufferInheritanceInfo.set_pipelineStatistics(this.segment(), value); return this; }

}
