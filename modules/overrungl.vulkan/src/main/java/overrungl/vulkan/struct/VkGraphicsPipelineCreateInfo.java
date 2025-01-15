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
/// ### flags
/// [VarHandle][#VH_flags] - [Getter][#flags()] - [Setter][#flags(int)]
/// ### stageCount
/// [VarHandle][#VH_stageCount] - [Getter][#stageCount()] - [Setter][#stageCount(int)]
/// ### pStages
/// [VarHandle][#VH_pStages] - [Getter][#pStages()] - [Setter][#pStages(java.lang.foreign.MemorySegment)]
/// ### pVertexInputState
/// [VarHandle][#VH_pVertexInputState] - [Getter][#pVertexInputState()] - [Setter][#pVertexInputState(java.lang.foreign.MemorySegment)]
/// ### pInputAssemblyState
/// [VarHandle][#VH_pInputAssemblyState] - [Getter][#pInputAssemblyState()] - [Setter][#pInputAssemblyState(java.lang.foreign.MemorySegment)]
/// ### pTessellationState
/// [VarHandle][#VH_pTessellationState] - [Getter][#pTessellationState()] - [Setter][#pTessellationState(java.lang.foreign.MemorySegment)]
/// ### pViewportState
/// [VarHandle][#VH_pViewportState] - [Getter][#pViewportState()] - [Setter][#pViewportState(java.lang.foreign.MemorySegment)]
/// ### pRasterizationState
/// [VarHandle][#VH_pRasterizationState] - [Getter][#pRasterizationState()] - [Setter][#pRasterizationState(java.lang.foreign.MemorySegment)]
/// ### pMultisampleState
/// [VarHandle][#VH_pMultisampleState] - [Getter][#pMultisampleState()] - [Setter][#pMultisampleState(java.lang.foreign.MemorySegment)]
/// ### pDepthStencilState
/// [VarHandle][#VH_pDepthStencilState] - [Getter][#pDepthStencilState()] - [Setter][#pDepthStencilState(java.lang.foreign.MemorySegment)]
/// ### pColorBlendState
/// [VarHandle][#VH_pColorBlendState] - [Getter][#pColorBlendState()] - [Setter][#pColorBlendState(java.lang.foreign.MemorySegment)]
/// ### pDynamicState
/// [VarHandle][#VH_pDynamicState] - [Getter][#pDynamicState()] - [Setter][#pDynamicState(java.lang.foreign.MemorySegment)]
/// ### layout
/// [VarHandle][#VH_layout] - [Getter][#layout()] - [Setter][#layout(java.lang.foreign.MemorySegment)]
/// ### renderPass
/// [VarHandle][#VH_renderPass] - [Getter][#renderPass()] - [Setter][#renderPass(java.lang.foreign.MemorySegment)]
/// ### subpass
/// [VarHandle][#VH_subpass] - [Getter][#subpass()] - [Setter][#subpass(int)]
/// ### basePipelineHandle
/// [VarHandle][#VH_basePipelineHandle] - [Getter][#basePipelineHandle()] - [Setter][#basePipelineHandle(java.lang.foreign.MemorySegment)]
/// ### basePipelineIndex
/// [VarHandle][#VH_basePipelineIndex] - [Getter][#basePipelineIndex()] - [Setter][#basePipelineIndex(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkGraphicsPipelineCreateInfo {
///     VkStructureType sType;
///     const void * pNext;
///     VkPipelineCreateFlags flags;
///     uint32_t stageCount;
///     const VkPipelineShaderStageCreateInfo * pStages;
///     const VkPipelineVertexInputStateCreateInfo * pVertexInputState;
///     const VkPipelineInputAssemblyStateCreateInfo * pInputAssemblyState;
///     const VkPipelineTessellationStateCreateInfo * pTessellationState;
///     const VkPipelineViewportStateCreateInfo * pViewportState;
///     const VkPipelineRasterizationStateCreateInfo * pRasterizationState;
///     const VkPipelineMultisampleStateCreateInfo * pMultisampleState;
///     const VkPipelineDepthStencilStateCreateInfo * pDepthStencilState;
///     const VkPipelineColorBlendStateCreateInfo * pColorBlendState;
///     const VkPipelineDynamicStateCreateInfo * pDynamicState;
///     VkPipelineLayout layout;
///     VkRenderPass renderPass;
///     uint32_t subpass;
///     VkPipeline basePipelineHandle;
///     int32_t basePipelineIndex;
/// } VkGraphicsPipelineCreateInfo;
/// ```
public sealed class VkGraphicsPipelineCreateInfo extends Struct {
    /// The struct layout of `VkGraphicsPipelineCreateInfo`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("stageCount"),
        ValueLayout.ADDRESS.withName("pStages"),
        ValueLayout.ADDRESS.withName("pVertexInputState"),
        ValueLayout.ADDRESS.withName("pInputAssemblyState"),
        ValueLayout.ADDRESS.withName("pTessellationState"),
        ValueLayout.ADDRESS.withName("pViewportState"),
        ValueLayout.ADDRESS.withName("pRasterizationState"),
        ValueLayout.ADDRESS.withName("pMultisampleState"),
        ValueLayout.ADDRESS.withName("pDepthStencilState"),
        ValueLayout.ADDRESS.withName("pColorBlendState"),
        ValueLayout.ADDRESS.withName("pDynamicState"),
        ValueLayout.ADDRESS.withName("layout"),
        ValueLayout.ADDRESS.withName("renderPass"),
        ValueLayout.JAVA_INT.withName("subpass"),
        ValueLayout.ADDRESS.withName("basePipelineHandle"),
        ValueLayout.JAVA_INT.withName("basePipelineIndex")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `flags` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    /// The [VarHandle] of `stageCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_stageCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("stageCount"));
    /// The [VarHandle] of `pStages` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pStages = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pStages"));
    /// The [VarHandle] of `pVertexInputState` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pVertexInputState = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pVertexInputState"));
    /// The [VarHandle] of `pInputAssemblyState` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pInputAssemblyState = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pInputAssemblyState"));
    /// The [VarHandle] of `pTessellationState` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pTessellationState = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pTessellationState"));
    /// The [VarHandle] of `pViewportState` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pViewportState = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pViewportState"));
    /// The [VarHandle] of `pRasterizationState` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pRasterizationState = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pRasterizationState"));
    /// The [VarHandle] of `pMultisampleState` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pMultisampleState = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pMultisampleState"));
    /// The [VarHandle] of `pDepthStencilState` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pDepthStencilState = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pDepthStencilState"));
    /// The [VarHandle] of `pColorBlendState` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pColorBlendState = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pColorBlendState"));
    /// The [VarHandle] of `pDynamicState` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pDynamicState = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pDynamicState"));
    /// The [VarHandle] of `layout` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_layout = LAYOUT.arrayElementVarHandle(PathElement.groupElement("layout"));
    /// The [VarHandle] of `renderPass` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_renderPass = LAYOUT.arrayElementVarHandle(PathElement.groupElement("renderPass"));
    /// The [VarHandle] of `subpass` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_subpass = LAYOUT.arrayElementVarHandle(PathElement.groupElement("subpass"));
    /// The [VarHandle] of `basePipelineHandle` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_basePipelineHandle = LAYOUT.arrayElementVarHandle(PathElement.groupElement("basePipelineHandle"));
    /// The [VarHandle] of `basePipelineIndex` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_basePipelineIndex = LAYOUT.arrayElementVarHandle(PathElement.groupElement("basePipelineIndex"));

    /// Creates `VkGraphicsPipelineCreateInfo` with the given segment.
    /// @param segment the memory segment
    public VkGraphicsPipelineCreateInfo(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkGraphicsPipelineCreateInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkGraphicsPipelineCreateInfo of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkGraphicsPipelineCreateInfo(segment); }

    /// Creates `VkGraphicsPipelineCreateInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkGraphicsPipelineCreateInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkGraphicsPipelineCreateInfo ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkGraphicsPipelineCreateInfo(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkGraphicsPipelineCreateInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkGraphicsPipelineCreateInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkGraphicsPipelineCreateInfo`
    public static VkGraphicsPipelineCreateInfo alloc(SegmentAllocator allocator) { return new VkGraphicsPipelineCreateInfo(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkGraphicsPipelineCreateInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkGraphicsPipelineCreateInfo`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkGraphicsPipelineCreateInfo` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkGraphicsPipelineCreateInfo`
    public static VkGraphicsPipelineCreateInfo allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("const void *") java.lang.foreign.MemorySegment pNext, @CType("VkPipelineCreateFlags") int flags, @CType("uint32_t") int stageCount, @CType("const VkPipelineShaderStageCreateInfo *") java.lang.foreign.MemorySegment pStages, @CType("const VkPipelineVertexInputStateCreateInfo *") java.lang.foreign.MemorySegment pVertexInputState, @CType("const VkPipelineInputAssemblyStateCreateInfo *") java.lang.foreign.MemorySegment pInputAssemblyState, @CType("const VkPipelineTessellationStateCreateInfo *") java.lang.foreign.MemorySegment pTessellationState, @CType("const VkPipelineViewportStateCreateInfo *") java.lang.foreign.MemorySegment pViewportState, @CType("const VkPipelineRasterizationStateCreateInfo *") java.lang.foreign.MemorySegment pRasterizationState, @CType("const VkPipelineMultisampleStateCreateInfo *") java.lang.foreign.MemorySegment pMultisampleState, @CType("const VkPipelineDepthStencilStateCreateInfo *") java.lang.foreign.MemorySegment pDepthStencilState, @CType("const VkPipelineColorBlendStateCreateInfo *") java.lang.foreign.MemorySegment pColorBlendState, @CType("const VkPipelineDynamicStateCreateInfo *") java.lang.foreign.MemorySegment pDynamicState, @CType("VkPipelineLayout") java.lang.foreign.MemorySegment layout, @CType("VkRenderPass") java.lang.foreign.MemorySegment renderPass, @CType("uint32_t") int subpass, @CType("VkPipeline") java.lang.foreign.MemorySegment basePipelineHandle, @CType("int32_t") int basePipelineIndex) { return alloc(allocator).sType(sType).pNext(pNext).flags(flags).stageCount(stageCount).pStages(pStages).pVertexInputState(pVertexInputState).pInputAssemblyState(pInputAssemblyState).pTessellationState(pTessellationState).pViewportState(pViewportState).pRasterizationState(pRasterizationState).pMultisampleState(pMultisampleState).pDepthStencilState(pDepthStencilState).pColorBlendState(pColorBlendState).pDynamicState(pDynamicState).layout(layout).renderPass(renderPass).subpass(subpass).basePipelineHandle(basePipelineHandle).basePipelineIndex(basePipelineIndex); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkGraphicsPipelineCreateInfo copyFrom(VkGraphicsPipelineCreateInfo src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkGraphicsPipelineCreateInfo.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkGraphicsPipelineCreateInfo.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkGraphicsPipelineCreateInfo.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkGraphicsPipelineCreateInfo sType(@CType("VkStructureType") int value) { VkGraphicsPipelineCreateInfo.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkGraphicsPipelineCreateInfo.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkGraphicsPipelineCreateInfo.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkGraphicsPipelineCreateInfo.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkGraphicsPipelineCreateInfo pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkGraphicsPipelineCreateInfo.set_pNext(this.segment(), value); return this; }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkPipelineCreateFlags") int get_flags(MemorySegment segment, long index) { return (int) VH_flags.get(segment, 0L, index); }
    /// {@return `flags`}
    /// @param segment the segment of the struct
    public static @CType("VkPipelineCreateFlags") int get_flags(MemorySegment segment) { return VkGraphicsPipelineCreateInfo.get_flags(segment, 0L); }
    /// {@return `flags`}
    public @CType("VkPipelineCreateFlags") int flags() { return VkGraphicsPipelineCreateInfo.get_flags(this.segment()); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_flags(MemorySegment segment, long index, @CType("VkPipelineCreateFlags") int value) { VH_flags.set(segment, 0L, index, value); }
    /// Sets `flags` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_flags(MemorySegment segment, @CType("VkPipelineCreateFlags") int value) { VkGraphicsPipelineCreateInfo.set_flags(segment, 0L, value); }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkGraphicsPipelineCreateInfo flags(@CType("VkPipelineCreateFlags") int value) { VkGraphicsPipelineCreateInfo.set_flags(this.segment(), value); return this; }

    /// {@return `stageCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_stageCount(MemorySegment segment, long index) { return (int) VH_stageCount.get(segment, 0L, index); }
    /// {@return `stageCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_stageCount(MemorySegment segment) { return VkGraphicsPipelineCreateInfo.get_stageCount(segment, 0L); }
    /// {@return `stageCount`}
    public @CType("uint32_t") int stageCount() { return VkGraphicsPipelineCreateInfo.get_stageCount(this.segment()); }
    /// Sets `stageCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_stageCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_stageCount.set(segment, 0L, index, value); }
    /// Sets `stageCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_stageCount(MemorySegment segment, @CType("uint32_t") int value) { VkGraphicsPipelineCreateInfo.set_stageCount(segment, 0L, value); }
    /// Sets `stageCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkGraphicsPipelineCreateInfo stageCount(@CType("uint32_t") int value) { VkGraphicsPipelineCreateInfo.set_stageCount(this.segment(), value); return this; }

    /// {@return `pStages` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const VkPipelineShaderStageCreateInfo *") java.lang.foreign.MemorySegment get_pStages(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pStages.get(segment, 0L, index); }
    /// {@return `pStages`}
    /// @param segment the segment of the struct
    public static @CType("const VkPipelineShaderStageCreateInfo *") java.lang.foreign.MemorySegment get_pStages(MemorySegment segment) { return VkGraphicsPipelineCreateInfo.get_pStages(segment, 0L); }
    /// {@return `pStages`}
    public @CType("const VkPipelineShaderStageCreateInfo *") java.lang.foreign.MemorySegment pStages() { return VkGraphicsPipelineCreateInfo.get_pStages(this.segment()); }
    /// Sets `pStages` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pStages(MemorySegment segment, long index, @CType("const VkPipelineShaderStageCreateInfo *") java.lang.foreign.MemorySegment value) { VH_pStages.set(segment, 0L, index, value); }
    /// Sets `pStages` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pStages(MemorySegment segment, @CType("const VkPipelineShaderStageCreateInfo *") java.lang.foreign.MemorySegment value) { VkGraphicsPipelineCreateInfo.set_pStages(segment, 0L, value); }
    /// Sets `pStages` with the given value.
    /// @param value the value
    /// @return `this`
    public VkGraphicsPipelineCreateInfo pStages(@CType("const VkPipelineShaderStageCreateInfo *") java.lang.foreign.MemorySegment value) { VkGraphicsPipelineCreateInfo.set_pStages(this.segment(), value); return this; }

    /// {@return `pVertexInputState` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const VkPipelineVertexInputStateCreateInfo *") java.lang.foreign.MemorySegment get_pVertexInputState(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pVertexInputState.get(segment, 0L, index); }
    /// {@return `pVertexInputState`}
    /// @param segment the segment of the struct
    public static @CType("const VkPipelineVertexInputStateCreateInfo *") java.lang.foreign.MemorySegment get_pVertexInputState(MemorySegment segment) { return VkGraphicsPipelineCreateInfo.get_pVertexInputState(segment, 0L); }
    /// {@return `pVertexInputState`}
    public @CType("const VkPipelineVertexInputStateCreateInfo *") java.lang.foreign.MemorySegment pVertexInputState() { return VkGraphicsPipelineCreateInfo.get_pVertexInputState(this.segment()); }
    /// Sets `pVertexInputState` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pVertexInputState(MemorySegment segment, long index, @CType("const VkPipelineVertexInputStateCreateInfo *") java.lang.foreign.MemorySegment value) { VH_pVertexInputState.set(segment, 0L, index, value); }
    /// Sets `pVertexInputState` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pVertexInputState(MemorySegment segment, @CType("const VkPipelineVertexInputStateCreateInfo *") java.lang.foreign.MemorySegment value) { VkGraphicsPipelineCreateInfo.set_pVertexInputState(segment, 0L, value); }
    /// Sets `pVertexInputState` with the given value.
    /// @param value the value
    /// @return `this`
    public VkGraphicsPipelineCreateInfo pVertexInputState(@CType("const VkPipelineVertexInputStateCreateInfo *") java.lang.foreign.MemorySegment value) { VkGraphicsPipelineCreateInfo.set_pVertexInputState(this.segment(), value); return this; }

    /// {@return `pInputAssemblyState` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const VkPipelineInputAssemblyStateCreateInfo *") java.lang.foreign.MemorySegment get_pInputAssemblyState(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pInputAssemblyState.get(segment, 0L, index); }
    /// {@return `pInputAssemblyState`}
    /// @param segment the segment of the struct
    public static @CType("const VkPipelineInputAssemblyStateCreateInfo *") java.lang.foreign.MemorySegment get_pInputAssemblyState(MemorySegment segment) { return VkGraphicsPipelineCreateInfo.get_pInputAssemblyState(segment, 0L); }
    /// {@return `pInputAssemblyState`}
    public @CType("const VkPipelineInputAssemblyStateCreateInfo *") java.lang.foreign.MemorySegment pInputAssemblyState() { return VkGraphicsPipelineCreateInfo.get_pInputAssemblyState(this.segment()); }
    /// Sets `pInputAssemblyState` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pInputAssemblyState(MemorySegment segment, long index, @CType("const VkPipelineInputAssemblyStateCreateInfo *") java.lang.foreign.MemorySegment value) { VH_pInputAssemblyState.set(segment, 0L, index, value); }
    /// Sets `pInputAssemblyState` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pInputAssemblyState(MemorySegment segment, @CType("const VkPipelineInputAssemblyStateCreateInfo *") java.lang.foreign.MemorySegment value) { VkGraphicsPipelineCreateInfo.set_pInputAssemblyState(segment, 0L, value); }
    /// Sets `pInputAssemblyState` with the given value.
    /// @param value the value
    /// @return `this`
    public VkGraphicsPipelineCreateInfo pInputAssemblyState(@CType("const VkPipelineInputAssemblyStateCreateInfo *") java.lang.foreign.MemorySegment value) { VkGraphicsPipelineCreateInfo.set_pInputAssemblyState(this.segment(), value); return this; }

    /// {@return `pTessellationState` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const VkPipelineTessellationStateCreateInfo *") java.lang.foreign.MemorySegment get_pTessellationState(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pTessellationState.get(segment, 0L, index); }
    /// {@return `pTessellationState`}
    /// @param segment the segment of the struct
    public static @CType("const VkPipelineTessellationStateCreateInfo *") java.lang.foreign.MemorySegment get_pTessellationState(MemorySegment segment) { return VkGraphicsPipelineCreateInfo.get_pTessellationState(segment, 0L); }
    /// {@return `pTessellationState`}
    public @CType("const VkPipelineTessellationStateCreateInfo *") java.lang.foreign.MemorySegment pTessellationState() { return VkGraphicsPipelineCreateInfo.get_pTessellationState(this.segment()); }
    /// Sets `pTessellationState` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pTessellationState(MemorySegment segment, long index, @CType("const VkPipelineTessellationStateCreateInfo *") java.lang.foreign.MemorySegment value) { VH_pTessellationState.set(segment, 0L, index, value); }
    /// Sets `pTessellationState` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pTessellationState(MemorySegment segment, @CType("const VkPipelineTessellationStateCreateInfo *") java.lang.foreign.MemorySegment value) { VkGraphicsPipelineCreateInfo.set_pTessellationState(segment, 0L, value); }
    /// Sets `pTessellationState` with the given value.
    /// @param value the value
    /// @return `this`
    public VkGraphicsPipelineCreateInfo pTessellationState(@CType("const VkPipelineTessellationStateCreateInfo *") java.lang.foreign.MemorySegment value) { VkGraphicsPipelineCreateInfo.set_pTessellationState(this.segment(), value); return this; }

    /// {@return `pViewportState` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const VkPipelineViewportStateCreateInfo *") java.lang.foreign.MemorySegment get_pViewportState(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pViewportState.get(segment, 0L, index); }
    /// {@return `pViewportState`}
    /// @param segment the segment of the struct
    public static @CType("const VkPipelineViewportStateCreateInfo *") java.lang.foreign.MemorySegment get_pViewportState(MemorySegment segment) { return VkGraphicsPipelineCreateInfo.get_pViewportState(segment, 0L); }
    /// {@return `pViewportState`}
    public @CType("const VkPipelineViewportStateCreateInfo *") java.lang.foreign.MemorySegment pViewportState() { return VkGraphicsPipelineCreateInfo.get_pViewportState(this.segment()); }
    /// Sets `pViewportState` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pViewportState(MemorySegment segment, long index, @CType("const VkPipelineViewportStateCreateInfo *") java.lang.foreign.MemorySegment value) { VH_pViewportState.set(segment, 0L, index, value); }
    /// Sets `pViewportState` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pViewportState(MemorySegment segment, @CType("const VkPipelineViewportStateCreateInfo *") java.lang.foreign.MemorySegment value) { VkGraphicsPipelineCreateInfo.set_pViewportState(segment, 0L, value); }
    /// Sets `pViewportState` with the given value.
    /// @param value the value
    /// @return `this`
    public VkGraphicsPipelineCreateInfo pViewportState(@CType("const VkPipelineViewportStateCreateInfo *") java.lang.foreign.MemorySegment value) { VkGraphicsPipelineCreateInfo.set_pViewportState(this.segment(), value); return this; }

    /// {@return `pRasterizationState` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const VkPipelineRasterizationStateCreateInfo *") java.lang.foreign.MemorySegment get_pRasterizationState(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pRasterizationState.get(segment, 0L, index); }
    /// {@return `pRasterizationState`}
    /// @param segment the segment of the struct
    public static @CType("const VkPipelineRasterizationStateCreateInfo *") java.lang.foreign.MemorySegment get_pRasterizationState(MemorySegment segment) { return VkGraphicsPipelineCreateInfo.get_pRasterizationState(segment, 0L); }
    /// {@return `pRasterizationState`}
    public @CType("const VkPipelineRasterizationStateCreateInfo *") java.lang.foreign.MemorySegment pRasterizationState() { return VkGraphicsPipelineCreateInfo.get_pRasterizationState(this.segment()); }
    /// Sets `pRasterizationState` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pRasterizationState(MemorySegment segment, long index, @CType("const VkPipelineRasterizationStateCreateInfo *") java.lang.foreign.MemorySegment value) { VH_pRasterizationState.set(segment, 0L, index, value); }
    /// Sets `pRasterizationState` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pRasterizationState(MemorySegment segment, @CType("const VkPipelineRasterizationStateCreateInfo *") java.lang.foreign.MemorySegment value) { VkGraphicsPipelineCreateInfo.set_pRasterizationState(segment, 0L, value); }
    /// Sets `pRasterizationState` with the given value.
    /// @param value the value
    /// @return `this`
    public VkGraphicsPipelineCreateInfo pRasterizationState(@CType("const VkPipelineRasterizationStateCreateInfo *") java.lang.foreign.MemorySegment value) { VkGraphicsPipelineCreateInfo.set_pRasterizationState(this.segment(), value); return this; }

    /// {@return `pMultisampleState` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const VkPipelineMultisampleStateCreateInfo *") java.lang.foreign.MemorySegment get_pMultisampleState(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pMultisampleState.get(segment, 0L, index); }
    /// {@return `pMultisampleState`}
    /// @param segment the segment of the struct
    public static @CType("const VkPipelineMultisampleStateCreateInfo *") java.lang.foreign.MemorySegment get_pMultisampleState(MemorySegment segment) { return VkGraphicsPipelineCreateInfo.get_pMultisampleState(segment, 0L); }
    /// {@return `pMultisampleState`}
    public @CType("const VkPipelineMultisampleStateCreateInfo *") java.lang.foreign.MemorySegment pMultisampleState() { return VkGraphicsPipelineCreateInfo.get_pMultisampleState(this.segment()); }
    /// Sets `pMultisampleState` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pMultisampleState(MemorySegment segment, long index, @CType("const VkPipelineMultisampleStateCreateInfo *") java.lang.foreign.MemorySegment value) { VH_pMultisampleState.set(segment, 0L, index, value); }
    /// Sets `pMultisampleState` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pMultisampleState(MemorySegment segment, @CType("const VkPipelineMultisampleStateCreateInfo *") java.lang.foreign.MemorySegment value) { VkGraphicsPipelineCreateInfo.set_pMultisampleState(segment, 0L, value); }
    /// Sets `pMultisampleState` with the given value.
    /// @param value the value
    /// @return `this`
    public VkGraphicsPipelineCreateInfo pMultisampleState(@CType("const VkPipelineMultisampleStateCreateInfo *") java.lang.foreign.MemorySegment value) { VkGraphicsPipelineCreateInfo.set_pMultisampleState(this.segment(), value); return this; }

    /// {@return `pDepthStencilState` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const VkPipelineDepthStencilStateCreateInfo *") java.lang.foreign.MemorySegment get_pDepthStencilState(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pDepthStencilState.get(segment, 0L, index); }
    /// {@return `pDepthStencilState`}
    /// @param segment the segment of the struct
    public static @CType("const VkPipelineDepthStencilStateCreateInfo *") java.lang.foreign.MemorySegment get_pDepthStencilState(MemorySegment segment) { return VkGraphicsPipelineCreateInfo.get_pDepthStencilState(segment, 0L); }
    /// {@return `pDepthStencilState`}
    public @CType("const VkPipelineDepthStencilStateCreateInfo *") java.lang.foreign.MemorySegment pDepthStencilState() { return VkGraphicsPipelineCreateInfo.get_pDepthStencilState(this.segment()); }
    /// Sets `pDepthStencilState` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pDepthStencilState(MemorySegment segment, long index, @CType("const VkPipelineDepthStencilStateCreateInfo *") java.lang.foreign.MemorySegment value) { VH_pDepthStencilState.set(segment, 0L, index, value); }
    /// Sets `pDepthStencilState` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pDepthStencilState(MemorySegment segment, @CType("const VkPipelineDepthStencilStateCreateInfo *") java.lang.foreign.MemorySegment value) { VkGraphicsPipelineCreateInfo.set_pDepthStencilState(segment, 0L, value); }
    /// Sets `pDepthStencilState` with the given value.
    /// @param value the value
    /// @return `this`
    public VkGraphicsPipelineCreateInfo pDepthStencilState(@CType("const VkPipelineDepthStencilStateCreateInfo *") java.lang.foreign.MemorySegment value) { VkGraphicsPipelineCreateInfo.set_pDepthStencilState(this.segment(), value); return this; }

    /// {@return `pColorBlendState` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const VkPipelineColorBlendStateCreateInfo *") java.lang.foreign.MemorySegment get_pColorBlendState(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pColorBlendState.get(segment, 0L, index); }
    /// {@return `pColorBlendState`}
    /// @param segment the segment of the struct
    public static @CType("const VkPipelineColorBlendStateCreateInfo *") java.lang.foreign.MemorySegment get_pColorBlendState(MemorySegment segment) { return VkGraphicsPipelineCreateInfo.get_pColorBlendState(segment, 0L); }
    /// {@return `pColorBlendState`}
    public @CType("const VkPipelineColorBlendStateCreateInfo *") java.lang.foreign.MemorySegment pColorBlendState() { return VkGraphicsPipelineCreateInfo.get_pColorBlendState(this.segment()); }
    /// Sets `pColorBlendState` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pColorBlendState(MemorySegment segment, long index, @CType("const VkPipelineColorBlendStateCreateInfo *") java.lang.foreign.MemorySegment value) { VH_pColorBlendState.set(segment, 0L, index, value); }
    /// Sets `pColorBlendState` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pColorBlendState(MemorySegment segment, @CType("const VkPipelineColorBlendStateCreateInfo *") java.lang.foreign.MemorySegment value) { VkGraphicsPipelineCreateInfo.set_pColorBlendState(segment, 0L, value); }
    /// Sets `pColorBlendState` with the given value.
    /// @param value the value
    /// @return `this`
    public VkGraphicsPipelineCreateInfo pColorBlendState(@CType("const VkPipelineColorBlendStateCreateInfo *") java.lang.foreign.MemorySegment value) { VkGraphicsPipelineCreateInfo.set_pColorBlendState(this.segment(), value); return this; }

    /// {@return `pDynamicState` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const VkPipelineDynamicStateCreateInfo *") java.lang.foreign.MemorySegment get_pDynamicState(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pDynamicState.get(segment, 0L, index); }
    /// {@return `pDynamicState`}
    /// @param segment the segment of the struct
    public static @CType("const VkPipelineDynamicStateCreateInfo *") java.lang.foreign.MemorySegment get_pDynamicState(MemorySegment segment) { return VkGraphicsPipelineCreateInfo.get_pDynamicState(segment, 0L); }
    /// {@return `pDynamicState`}
    public @CType("const VkPipelineDynamicStateCreateInfo *") java.lang.foreign.MemorySegment pDynamicState() { return VkGraphicsPipelineCreateInfo.get_pDynamicState(this.segment()); }
    /// Sets `pDynamicState` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pDynamicState(MemorySegment segment, long index, @CType("const VkPipelineDynamicStateCreateInfo *") java.lang.foreign.MemorySegment value) { VH_pDynamicState.set(segment, 0L, index, value); }
    /// Sets `pDynamicState` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pDynamicState(MemorySegment segment, @CType("const VkPipelineDynamicStateCreateInfo *") java.lang.foreign.MemorySegment value) { VkGraphicsPipelineCreateInfo.set_pDynamicState(segment, 0L, value); }
    /// Sets `pDynamicState` with the given value.
    /// @param value the value
    /// @return `this`
    public VkGraphicsPipelineCreateInfo pDynamicState(@CType("const VkPipelineDynamicStateCreateInfo *") java.lang.foreign.MemorySegment value) { VkGraphicsPipelineCreateInfo.set_pDynamicState(this.segment(), value); return this; }

    /// {@return `layout` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkPipelineLayout") java.lang.foreign.MemorySegment get_layout(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_layout.get(segment, 0L, index); }
    /// {@return `layout`}
    /// @param segment the segment of the struct
    public static @CType("VkPipelineLayout") java.lang.foreign.MemorySegment get_layout(MemorySegment segment) { return VkGraphicsPipelineCreateInfo.get_layout(segment, 0L); }
    /// {@return `layout`}
    public @CType("VkPipelineLayout") java.lang.foreign.MemorySegment layout() { return VkGraphicsPipelineCreateInfo.get_layout(this.segment()); }
    /// Sets `layout` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_layout(MemorySegment segment, long index, @CType("VkPipelineLayout") java.lang.foreign.MemorySegment value) { VH_layout.set(segment, 0L, index, value); }
    /// Sets `layout` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_layout(MemorySegment segment, @CType("VkPipelineLayout") java.lang.foreign.MemorySegment value) { VkGraphicsPipelineCreateInfo.set_layout(segment, 0L, value); }
    /// Sets `layout` with the given value.
    /// @param value the value
    /// @return `this`
    public VkGraphicsPipelineCreateInfo layout(@CType("VkPipelineLayout") java.lang.foreign.MemorySegment value) { VkGraphicsPipelineCreateInfo.set_layout(this.segment(), value); return this; }

    /// {@return `renderPass` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkRenderPass") java.lang.foreign.MemorySegment get_renderPass(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_renderPass.get(segment, 0L, index); }
    /// {@return `renderPass`}
    /// @param segment the segment of the struct
    public static @CType("VkRenderPass") java.lang.foreign.MemorySegment get_renderPass(MemorySegment segment) { return VkGraphicsPipelineCreateInfo.get_renderPass(segment, 0L); }
    /// {@return `renderPass`}
    public @CType("VkRenderPass") java.lang.foreign.MemorySegment renderPass() { return VkGraphicsPipelineCreateInfo.get_renderPass(this.segment()); }
    /// Sets `renderPass` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_renderPass(MemorySegment segment, long index, @CType("VkRenderPass") java.lang.foreign.MemorySegment value) { VH_renderPass.set(segment, 0L, index, value); }
    /// Sets `renderPass` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_renderPass(MemorySegment segment, @CType("VkRenderPass") java.lang.foreign.MemorySegment value) { VkGraphicsPipelineCreateInfo.set_renderPass(segment, 0L, value); }
    /// Sets `renderPass` with the given value.
    /// @param value the value
    /// @return `this`
    public VkGraphicsPipelineCreateInfo renderPass(@CType("VkRenderPass") java.lang.foreign.MemorySegment value) { VkGraphicsPipelineCreateInfo.set_renderPass(this.segment(), value); return this; }

    /// {@return `subpass` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_subpass(MemorySegment segment, long index) { return (int) VH_subpass.get(segment, 0L, index); }
    /// {@return `subpass`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_subpass(MemorySegment segment) { return VkGraphicsPipelineCreateInfo.get_subpass(segment, 0L); }
    /// {@return `subpass`}
    public @CType("uint32_t") int subpass() { return VkGraphicsPipelineCreateInfo.get_subpass(this.segment()); }
    /// Sets `subpass` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_subpass(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_subpass.set(segment, 0L, index, value); }
    /// Sets `subpass` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_subpass(MemorySegment segment, @CType("uint32_t") int value) { VkGraphicsPipelineCreateInfo.set_subpass(segment, 0L, value); }
    /// Sets `subpass` with the given value.
    /// @param value the value
    /// @return `this`
    public VkGraphicsPipelineCreateInfo subpass(@CType("uint32_t") int value) { VkGraphicsPipelineCreateInfo.set_subpass(this.segment(), value); return this; }

    /// {@return `basePipelineHandle` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkPipeline") java.lang.foreign.MemorySegment get_basePipelineHandle(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_basePipelineHandle.get(segment, 0L, index); }
    /// {@return `basePipelineHandle`}
    /// @param segment the segment of the struct
    public static @CType("VkPipeline") java.lang.foreign.MemorySegment get_basePipelineHandle(MemorySegment segment) { return VkGraphicsPipelineCreateInfo.get_basePipelineHandle(segment, 0L); }
    /// {@return `basePipelineHandle`}
    public @CType("VkPipeline") java.lang.foreign.MemorySegment basePipelineHandle() { return VkGraphicsPipelineCreateInfo.get_basePipelineHandle(this.segment()); }
    /// Sets `basePipelineHandle` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_basePipelineHandle(MemorySegment segment, long index, @CType("VkPipeline") java.lang.foreign.MemorySegment value) { VH_basePipelineHandle.set(segment, 0L, index, value); }
    /// Sets `basePipelineHandle` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_basePipelineHandle(MemorySegment segment, @CType("VkPipeline") java.lang.foreign.MemorySegment value) { VkGraphicsPipelineCreateInfo.set_basePipelineHandle(segment, 0L, value); }
    /// Sets `basePipelineHandle` with the given value.
    /// @param value the value
    /// @return `this`
    public VkGraphicsPipelineCreateInfo basePipelineHandle(@CType("VkPipeline") java.lang.foreign.MemorySegment value) { VkGraphicsPipelineCreateInfo.set_basePipelineHandle(this.segment(), value); return this; }

    /// {@return `basePipelineIndex` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("int32_t") int get_basePipelineIndex(MemorySegment segment, long index) { return (int) VH_basePipelineIndex.get(segment, 0L, index); }
    /// {@return `basePipelineIndex`}
    /// @param segment the segment of the struct
    public static @CType("int32_t") int get_basePipelineIndex(MemorySegment segment) { return VkGraphicsPipelineCreateInfo.get_basePipelineIndex(segment, 0L); }
    /// {@return `basePipelineIndex`}
    public @CType("int32_t") int basePipelineIndex() { return VkGraphicsPipelineCreateInfo.get_basePipelineIndex(this.segment()); }
    /// Sets `basePipelineIndex` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_basePipelineIndex(MemorySegment segment, long index, @CType("int32_t") int value) { VH_basePipelineIndex.set(segment, 0L, index, value); }
    /// Sets `basePipelineIndex` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_basePipelineIndex(MemorySegment segment, @CType("int32_t") int value) { VkGraphicsPipelineCreateInfo.set_basePipelineIndex(segment, 0L, value); }
    /// Sets `basePipelineIndex` with the given value.
    /// @param value the value
    /// @return `this`
    public VkGraphicsPipelineCreateInfo basePipelineIndex(@CType("int32_t") int value) { VkGraphicsPipelineCreateInfo.set_basePipelineIndex(this.segment(), value); return this; }

    /// A buffer of [VkGraphicsPipelineCreateInfo].
    public static final class Buffer extends VkGraphicsPipelineCreateInfo {
        private final long elementCount;

        /// Creates `VkGraphicsPipelineCreateInfo.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkGraphicsPipelineCreateInfo`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkGraphicsPipelineCreateInfo`
        public VkGraphicsPipelineCreateInfo asSlice(long index) { return new VkGraphicsPipelineCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkGraphicsPipelineCreateInfo`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkGraphicsPipelineCreateInfo`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkGraphicsPipelineCreateInfo.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkGraphicsPipelineCreateInfo.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkGraphicsPipelineCreateInfo.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkGraphicsPipelineCreateInfo.set_pNext(this.segment(), index, value); return this; }

        /// {@return `flags` at the given index}
        /// @param index the index
        public @CType("VkPipelineCreateFlags") int flagsAt(long index) { return VkGraphicsPipelineCreateInfo.get_flags(this.segment(), index); }
        /// Sets `flags` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer flagsAt(long index, @CType("VkPipelineCreateFlags") int value) { VkGraphicsPipelineCreateInfo.set_flags(this.segment(), index, value); return this; }

        /// {@return `stageCount` at the given index}
        /// @param index the index
        public @CType("uint32_t") int stageCountAt(long index) { return VkGraphicsPipelineCreateInfo.get_stageCount(this.segment(), index); }
        /// Sets `stageCount` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer stageCountAt(long index, @CType("uint32_t") int value) { VkGraphicsPipelineCreateInfo.set_stageCount(this.segment(), index, value); return this; }

        /// {@return `pStages` at the given index}
        /// @param index the index
        public @CType("const VkPipelineShaderStageCreateInfo *") java.lang.foreign.MemorySegment pStagesAt(long index) { return VkGraphicsPipelineCreateInfo.get_pStages(this.segment(), index); }
        /// Sets `pStages` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pStagesAt(long index, @CType("const VkPipelineShaderStageCreateInfo *") java.lang.foreign.MemorySegment value) { VkGraphicsPipelineCreateInfo.set_pStages(this.segment(), index, value); return this; }

        /// {@return `pVertexInputState` at the given index}
        /// @param index the index
        public @CType("const VkPipelineVertexInputStateCreateInfo *") java.lang.foreign.MemorySegment pVertexInputStateAt(long index) { return VkGraphicsPipelineCreateInfo.get_pVertexInputState(this.segment(), index); }
        /// Sets `pVertexInputState` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pVertexInputStateAt(long index, @CType("const VkPipelineVertexInputStateCreateInfo *") java.lang.foreign.MemorySegment value) { VkGraphicsPipelineCreateInfo.set_pVertexInputState(this.segment(), index, value); return this; }

        /// {@return `pInputAssemblyState` at the given index}
        /// @param index the index
        public @CType("const VkPipelineInputAssemblyStateCreateInfo *") java.lang.foreign.MemorySegment pInputAssemblyStateAt(long index) { return VkGraphicsPipelineCreateInfo.get_pInputAssemblyState(this.segment(), index); }
        /// Sets `pInputAssemblyState` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pInputAssemblyStateAt(long index, @CType("const VkPipelineInputAssemblyStateCreateInfo *") java.lang.foreign.MemorySegment value) { VkGraphicsPipelineCreateInfo.set_pInputAssemblyState(this.segment(), index, value); return this; }

        /// {@return `pTessellationState` at the given index}
        /// @param index the index
        public @CType("const VkPipelineTessellationStateCreateInfo *") java.lang.foreign.MemorySegment pTessellationStateAt(long index) { return VkGraphicsPipelineCreateInfo.get_pTessellationState(this.segment(), index); }
        /// Sets `pTessellationState` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pTessellationStateAt(long index, @CType("const VkPipelineTessellationStateCreateInfo *") java.lang.foreign.MemorySegment value) { VkGraphicsPipelineCreateInfo.set_pTessellationState(this.segment(), index, value); return this; }

        /// {@return `pViewportState` at the given index}
        /// @param index the index
        public @CType("const VkPipelineViewportStateCreateInfo *") java.lang.foreign.MemorySegment pViewportStateAt(long index) { return VkGraphicsPipelineCreateInfo.get_pViewportState(this.segment(), index); }
        /// Sets `pViewportState` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pViewportStateAt(long index, @CType("const VkPipelineViewportStateCreateInfo *") java.lang.foreign.MemorySegment value) { VkGraphicsPipelineCreateInfo.set_pViewportState(this.segment(), index, value); return this; }

        /// {@return `pRasterizationState` at the given index}
        /// @param index the index
        public @CType("const VkPipelineRasterizationStateCreateInfo *") java.lang.foreign.MemorySegment pRasterizationStateAt(long index) { return VkGraphicsPipelineCreateInfo.get_pRasterizationState(this.segment(), index); }
        /// Sets `pRasterizationState` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pRasterizationStateAt(long index, @CType("const VkPipelineRasterizationStateCreateInfo *") java.lang.foreign.MemorySegment value) { VkGraphicsPipelineCreateInfo.set_pRasterizationState(this.segment(), index, value); return this; }

        /// {@return `pMultisampleState` at the given index}
        /// @param index the index
        public @CType("const VkPipelineMultisampleStateCreateInfo *") java.lang.foreign.MemorySegment pMultisampleStateAt(long index) { return VkGraphicsPipelineCreateInfo.get_pMultisampleState(this.segment(), index); }
        /// Sets `pMultisampleState` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pMultisampleStateAt(long index, @CType("const VkPipelineMultisampleStateCreateInfo *") java.lang.foreign.MemorySegment value) { VkGraphicsPipelineCreateInfo.set_pMultisampleState(this.segment(), index, value); return this; }

        /// {@return `pDepthStencilState` at the given index}
        /// @param index the index
        public @CType("const VkPipelineDepthStencilStateCreateInfo *") java.lang.foreign.MemorySegment pDepthStencilStateAt(long index) { return VkGraphicsPipelineCreateInfo.get_pDepthStencilState(this.segment(), index); }
        /// Sets `pDepthStencilState` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pDepthStencilStateAt(long index, @CType("const VkPipelineDepthStencilStateCreateInfo *") java.lang.foreign.MemorySegment value) { VkGraphicsPipelineCreateInfo.set_pDepthStencilState(this.segment(), index, value); return this; }

        /// {@return `pColorBlendState` at the given index}
        /// @param index the index
        public @CType("const VkPipelineColorBlendStateCreateInfo *") java.lang.foreign.MemorySegment pColorBlendStateAt(long index) { return VkGraphicsPipelineCreateInfo.get_pColorBlendState(this.segment(), index); }
        /// Sets `pColorBlendState` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pColorBlendStateAt(long index, @CType("const VkPipelineColorBlendStateCreateInfo *") java.lang.foreign.MemorySegment value) { VkGraphicsPipelineCreateInfo.set_pColorBlendState(this.segment(), index, value); return this; }

        /// {@return `pDynamicState` at the given index}
        /// @param index the index
        public @CType("const VkPipelineDynamicStateCreateInfo *") java.lang.foreign.MemorySegment pDynamicStateAt(long index) { return VkGraphicsPipelineCreateInfo.get_pDynamicState(this.segment(), index); }
        /// Sets `pDynamicState` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pDynamicStateAt(long index, @CType("const VkPipelineDynamicStateCreateInfo *") java.lang.foreign.MemorySegment value) { VkGraphicsPipelineCreateInfo.set_pDynamicState(this.segment(), index, value); return this; }

        /// {@return `layout` at the given index}
        /// @param index the index
        public @CType("VkPipelineLayout") java.lang.foreign.MemorySegment layoutAt(long index) { return VkGraphicsPipelineCreateInfo.get_layout(this.segment(), index); }
        /// Sets `layout` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer layoutAt(long index, @CType("VkPipelineLayout") java.lang.foreign.MemorySegment value) { VkGraphicsPipelineCreateInfo.set_layout(this.segment(), index, value); return this; }

        /// {@return `renderPass` at the given index}
        /// @param index the index
        public @CType("VkRenderPass") java.lang.foreign.MemorySegment renderPassAt(long index) { return VkGraphicsPipelineCreateInfo.get_renderPass(this.segment(), index); }
        /// Sets `renderPass` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer renderPassAt(long index, @CType("VkRenderPass") java.lang.foreign.MemorySegment value) { VkGraphicsPipelineCreateInfo.set_renderPass(this.segment(), index, value); return this; }

        /// {@return `subpass` at the given index}
        /// @param index the index
        public @CType("uint32_t") int subpassAt(long index) { return VkGraphicsPipelineCreateInfo.get_subpass(this.segment(), index); }
        /// Sets `subpass` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer subpassAt(long index, @CType("uint32_t") int value) { VkGraphicsPipelineCreateInfo.set_subpass(this.segment(), index, value); return this; }

        /// {@return `basePipelineHandle` at the given index}
        /// @param index the index
        public @CType("VkPipeline") java.lang.foreign.MemorySegment basePipelineHandleAt(long index) { return VkGraphicsPipelineCreateInfo.get_basePipelineHandle(this.segment(), index); }
        /// Sets `basePipelineHandle` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer basePipelineHandleAt(long index, @CType("VkPipeline") java.lang.foreign.MemorySegment value) { VkGraphicsPipelineCreateInfo.set_basePipelineHandle(this.segment(), index, value); return this; }

        /// {@return `basePipelineIndex` at the given index}
        /// @param index the index
        public @CType("int32_t") int basePipelineIndexAt(long index) { return VkGraphicsPipelineCreateInfo.get_basePipelineIndex(this.segment(), index); }
        /// Sets `basePipelineIndex` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer basePipelineIndexAt(long index, @CType("int32_t") int value) { VkGraphicsPipelineCreateInfo.set_basePipelineIndex(this.segment(), index, value); return this; }

    }
}
