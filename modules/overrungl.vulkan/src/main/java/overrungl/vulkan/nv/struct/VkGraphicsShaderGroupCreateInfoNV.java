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
/// ### stageCount
/// [VarHandle][#VH_stageCount] - [Getter][#stageCount()] - [Setter][#stageCount(int)]
/// ### pStages
/// [VarHandle][#VH_pStages] - [Getter][#pStages()] - [Setter][#pStages(java.lang.foreign.MemorySegment)]
/// ### pVertexInputState
/// [VarHandle][#VH_pVertexInputState] - [Getter][#pVertexInputState()] - [Setter][#pVertexInputState(java.lang.foreign.MemorySegment)]
/// ### pTessellationState
/// [VarHandle][#VH_pTessellationState] - [Getter][#pTessellationState()] - [Setter][#pTessellationState(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkGraphicsShaderGroupCreateInfoNV {
///     VkStructureType sType;
///     const void * pNext;
///     uint32_t stageCount;
///     const VkPipelineShaderStageCreateInfo * pStages;
///     const VkPipelineVertexInputStateCreateInfo * pVertexInputState;
///     const VkPipelineTessellationStateCreateInfo * pTessellationState;
/// } VkGraphicsShaderGroupCreateInfoNV;
/// ```
public final class VkGraphicsShaderGroupCreateInfoNV extends Struct {
    /// The struct layout of `VkGraphicsShaderGroupCreateInfoNV`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("stageCount"),
        ValueLayout.ADDRESS.withName("pStages"),
        ValueLayout.ADDRESS.withName("pVertexInputState"),
        ValueLayout.ADDRESS.withName("pTessellationState")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `stageCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_stageCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("stageCount"));
    /// The [VarHandle] of `pStages` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pStages = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pStages"));
    /// The [VarHandle] of `pVertexInputState` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pVertexInputState = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pVertexInputState"));
    /// The [VarHandle] of `pTessellationState` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pTessellationState = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pTessellationState"));

    /// Creates `VkGraphicsShaderGroupCreateInfoNV` with the given segment.
    /// @param segment the memory segment
    public VkGraphicsShaderGroupCreateInfoNV(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkGraphicsShaderGroupCreateInfoNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkGraphicsShaderGroupCreateInfoNV of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkGraphicsShaderGroupCreateInfoNV(segment); }

    /// Creates `VkGraphicsShaderGroupCreateInfoNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkGraphicsShaderGroupCreateInfoNV ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkGraphicsShaderGroupCreateInfoNV(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkGraphicsShaderGroupCreateInfoNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkGraphicsShaderGroupCreateInfoNV ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkGraphicsShaderGroupCreateInfoNV(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkGraphicsShaderGroupCreateInfoNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkGraphicsShaderGroupCreateInfoNV`
    public static VkGraphicsShaderGroupCreateInfoNV alloc(SegmentAllocator allocator) { return new VkGraphicsShaderGroupCreateInfoNV(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkGraphicsShaderGroupCreateInfoNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkGraphicsShaderGroupCreateInfoNV`
    public static VkGraphicsShaderGroupCreateInfoNV alloc(SegmentAllocator allocator, long count) { return new VkGraphicsShaderGroupCreateInfoNV(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `VkGraphicsShaderGroupCreateInfoNV`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkGraphicsShaderGroupCreateInfoNV`
    public VkGraphicsShaderGroupCreateInfoNV asSlice(long index) { return new VkGraphicsShaderGroupCreateInfoNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `VkGraphicsShaderGroupCreateInfoNV`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkGraphicsShaderGroupCreateInfoNV`
    public VkGraphicsShaderGroupCreateInfoNV asSlice(long index, long count) { return new VkGraphicsShaderGroupCreateInfoNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkGraphicsShaderGroupCreateInfoNV.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkGraphicsShaderGroupCreateInfoNV.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkGraphicsShaderGroupCreateInfoNV.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkGraphicsShaderGroupCreateInfoNV.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkGraphicsShaderGroupCreateInfoNV sTypeAt(long index, @CType("VkStructureType") int value) { VkGraphicsShaderGroupCreateInfoNV.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkGraphicsShaderGroupCreateInfoNV sType(@CType("VkStructureType") int value) { VkGraphicsShaderGroupCreateInfoNV.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkGraphicsShaderGroupCreateInfoNV.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkGraphicsShaderGroupCreateInfoNV.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkGraphicsShaderGroupCreateInfoNV.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkGraphicsShaderGroupCreateInfoNV.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkGraphicsShaderGroupCreateInfoNV pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkGraphicsShaderGroupCreateInfoNV.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkGraphicsShaderGroupCreateInfoNV pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkGraphicsShaderGroupCreateInfoNV.set_pNext(this.segment(), value); return this; }

    /// {@return `stageCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_stageCount(MemorySegment segment, long index) { return (int) VH_stageCount.get(segment, 0L, index); }
    /// {@return `stageCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_stageCount(MemorySegment segment) { return VkGraphicsShaderGroupCreateInfoNV.get_stageCount(segment, 0L); }
    /// {@return `stageCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int stageCountAt(long index) { return VkGraphicsShaderGroupCreateInfoNV.get_stageCount(this.segment(), index); }
    /// {@return `stageCount`}
    public @CType("uint32_t") int stageCount() { return VkGraphicsShaderGroupCreateInfoNV.get_stageCount(this.segment()); }
    /// Sets `stageCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_stageCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_stageCount.set(segment, 0L, index, value); }
    /// Sets `stageCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_stageCount(MemorySegment segment, @CType("uint32_t") int value) { VkGraphicsShaderGroupCreateInfoNV.set_stageCount(segment, 0L, value); }
    /// Sets `stageCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkGraphicsShaderGroupCreateInfoNV stageCountAt(long index, @CType("uint32_t") int value) { VkGraphicsShaderGroupCreateInfoNV.set_stageCount(this.segment(), index, value); return this; }
    /// Sets `stageCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkGraphicsShaderGroupCreateInfoNV stageCount(@CType("uint32_t") int value) { VkGraphicsShaderGroupCreateInfoNV.set_stageCount(this.segment(), value); return this; }

    /// {@return `pStages` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const VkPipelineShaderStageCreateInfo *") java.lang.foreign.MemorySegment get_pStages(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pStages.get(segment, 0L, index); }
    /// {@return `pStages`}
    /// @param segment the segment of the struct
    public static @CType("const VkPipelineShaderStageCreateInfo *") java.lang.foreign.MemorySegment get_pStages(MemorySegment segment) { return VkGraphicsShaderGroupCreateInfoNV.get_pStages(segment, 0L); }
    /// {@return `pStages` at the given index}
    /// @param index the index
    public @CType("const VkPipelineShaderStageCreateInfo *") java.lang.foreign.MemorySegment pStagesAt(long index) { return VkGraphicsShaderGroupCreateInfoNV.get_pStages(this.segment(), index); }
    /// {@return `pStages`}
    public @CType("const VkPipelineShaderStageCreateInfo *") java.lang.foreign.MemorySegment pStages() { return VkGraphicsShaderGroupCreateInfoNV.get_pStages(this.segment()); }
    /// Sets `pStages` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pStages(MemorySegment segment, long index, @CType("const VkPipelineShaderStageCreateInfo *") java.lang.foreign.MemorySegment value) { VH_pStages.set(segment, 0L, index, value); }
    /// Sets `pStages` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pStages(MemorySegment segment, @CType("const VkPipelineShaderStageCreateInfo *") java.lang.foreign.MemorySegment value) { VkGraphicsShaderGroupCreateInfoNV.set_pStages(segment, 0L, value); }
    /// Sets `pStages` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkGraphicsShaderGroupCreateInfoNV pStagesAt(long index, @CType("const VkPipelineShaderStageCreateInfo *") java.lang.foreign.MemorySegment value) { VkGraphicsShaderGroupCreateInfoNV.set_pStages(this.segment(), index, value); return this; }
    /// Sets `pStages` with the given value.
    /// @param value the value
    /// @return `this`
    public VkGraphicsShaderGroupCreateInfoNV pStages(@CType("const VkPipelineShaderStageCreateInfo *") java.lang.foreign.MemorySegment value) { VkGraphicsShaderGroupCreateInfoNV.set_pStages(this.segment(), value); return this; }

    /// {@return `pVertexInputState` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const VkPipelineVertexInputStateCreateInfo *") java.lang.foreign.MemorySegment get_pVertexInputState(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pVertexInputState.get(segment, 0L, index); }
    /// {@return `pVertexInputState`}
    /// @param segment the segment of the struct
    public static @CType("const VkPipelineVertexInputStateCreateInfo *") java.lang.foreign.MemorySegment get_pVertexInputState(MemorySegment segment) { return VkGraphicsShaderGroupCreateInfoNV.get_pVertexInputState(segment, 0L); }
    /// {@return `pVertexInputState` at the given index}
    /// @param index the index
    public @CType("const VkPipelineVertexInputStateCreateInfo *") java.lang.foreign.MemorySegment pVertexInputStateAt(long index) { return VkGraphicsShaderGroupCreateInfoNV.get_pVertexInputState(this.segment(), index); }
    /// {@return `pVertexInputState`}
    public @CType("const VkPipelineVertexInputStateCreateInfo *") java.lang.foreign.MemorySegment pVertexInputState() { return VkGraphicsShaderGroupCreateInfoNV.get_pVertexInputState(this.segment()); }
    /// Sets `pVertexInputState` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pVertexInputState(MemorySegment segment, long index, @CType("const VkPipelineVertexInputStateCreateInfo *") java.lang.foreign.MemorySegment value) { VH_pVertexInputState.set(segment, 0L, index, value); }
    /// Sets `pVertexInputState` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pVertexInputState(MemorySegment segment, @CType("const VkPipelineVertexInputStateCreateInfo *") java.lang.foreign.MemorySegment value) { VkGraphicsShaderGroupCreateInfoNV.set_pVertexInputState(segment, 0L, value); }
    /// Sets `pVertexInputState` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkGraphicsShaderGroupCreateInfoNV pVertexInputStateAt(long index, @CType("const VkPipelineVertexInputStateCreateInfo *") java.lang.foreign.MemorySegment value) { VkGraphicsShaderGroupCreateInfoNV.set_pVertexInputState(this.segment(), index, value); return this; }
    /// Sets `pVertexInputState` with the given value.
    /// @param value the value
    /// @return `this`
    public VkGraphicsShaderGroupCreateInfoNV pVertexInputState(@CType("const VkPipelineVertexInputStateCreateInfo *") java.lang.foreign.MemorySegment value) { VkGraphicsShaderGroupCreateInfoNV.set_pVertexInputState(this.segment(), value); return this; }

    /// {@return `pTessellationState` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const VkPipelineTessellationStateCreateInfo *") java.lang.foreign.MemorySegment get_pTessellationState(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pTessellationState.get(segment, 0L, index); }
    /// {@return `pTessellationState`}
    /// @param segment the segment of the struct
    public static @CType("const VkPipelineTessellationStateCreateInfo *") java.lang.foreign.MemorySegment get_pTessellationState(MemorySegment segment) { return VkGraphicsShaderGroupCreateInfoNV.get_pTessellationState(segment, 0L); }
    /// {@return `pTessellationState` at the given index}
    /// @param index the index
    public @CType("const VkPipelineTessellationStateCreateInfo *") java.lang.foreign.MemorySegment pTessellationStateAt(long index) { return VkGraphicsShaderGroupCreateInfoNV.get_pTessellationState(this.segment(), index); }
    /// {@return `pTessellationState`}
    public @CType("const VkPipelineTessellationStateCreateInfo *") java.lang.foreign.MemorySegment pTessellationState() { return VkGraphicsShaderGroupCreateInfoNV.get_pTessellationState(this.segment()); }
    /// Sets `pTessellationState` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pTessellationState(MemorySegment segment, long index, @CType("const VkPipelineTessellationStateCreateInfo *") java.lang.foreign.MemorySegment value) { VH_pTessellationState.set(segment, 0L, index, value); }
    /// Sets `pTessellationState` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pTessellationState(MemorySegment segment, @CType("const VkPipelineTessellationStateCreateInfo *") java.lang.foreign.MemorySegment value) { VkGraphicsShaderGroupCreateInfoNV.set_pTessellationState(segment, 0L, value); }
    /// Sets `pTessellationState` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkGraphicsShaderGroupCreateInfoNV pTessellationStateAt(long index, @CType("const VkPipelineTessellationStateCreateInfo *") java.lang.foreign.MemorySegment value) { VkGraphicsShaderGroupCreateInfoNV.set_pTessellationState(this.segment(), index, value); return this; }
    /// Sets `pTessellationState` with the given value.
    /// @param value the value
    /// @return `this`
    public VkGraphicsShaderGroupCreateInfoNV pTessellationState(@CType("const VkPipelineTessellationStateCreateInfo *") java.lang.foreign.MemorySegment value) { VkGraphicsShaderGroupCreateInfoNV.set_pTessellationState(this.segment(), value); return this; }

}
