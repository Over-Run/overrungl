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
package overrungl.vulkan.khr.struct;

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
/// ### groupCount
/// [VarHandle][#VH_groupCount] - [Getter][#groupCount()] - [Setter][#groupCount(int)]
/// ### pGroups
/// [VarHandle][#VH_pGroups] - [Getter][#pGroups()] - [Setter][#pGroups(java.lang.foreign.MemorySegment)]
/// ### maxPipelineRayRecursionDepth
/// [VarHandle][#VH_maxPipelineRayRecursionDepth] - [Getter][#maxPipelineRayRecursionDepth()] - [Setter][#maxPipelineRayRecursionDepth(int)]
/// ### pLibraryInfo
/// [VarHandle][#VH_pLibraryInfo] - [Getter][#pLibraryInfo()] - [Setter][#pLibraryInfo(java.lang.foreign.MemorySegment)]
/// ### pLibraryInterface
/// [VarHandle][#VH_pLibraryInterface] - [Getter][#pLibraryInterface()] - [Setter][#pLibraryInterface(java.lang.foreign.MemorySegment)]
/// ### pDynamicState
/// [VarHandle][#VH_pDynamicState] - [Getter][#pDynamicState()] - [Setter][#pDynamicState(java.lang.foreign.MemorySegment)]
/// ### layout
/// [VarHandle][#VH_layout] - [Getter][#layout()] - [Setter][#layout(java.lang.foreign.MemorySegment)]
/// ### basePipelineHandle
/// [VarHandle][#VH_basePipelineHandle] - [Getter][#basePipelineHandle()] - [Setter][#basePipelineHandle(java.lang.foreign.MemorySegment)]
/// ### basePipelineIndex
/// [VarHandle][#VH_basePipelineIndex] - [Getter][#basePipelineIndex()] - [Setter][#basePipelineIndex(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkRayTracingPipelineCreateInfoKHR {
///     VkStructureType sType;
///     const void * pNext;
///     VkPipelineCreateFlags flags;
///     uint32_t stageCount;
///     const VkPipelineShaderStageCreateInfo * pStages;
///     uint32_t groupCount;
///     const VkRayTracingShaderGroupCreateInfoKHR * pGroups;
///     uint32_t maxPipelineRayRecursionDepth;
///     const VkPipelineLibraryCreateInfoKHR * pLibraryInfo;
///     const VkRayTracingPipelineInterfaceCreateInfoKHR * pLibraryInterface;
///     const VkPipelineDynamicStateCreateInfo * pDynamicState;
///     VkPipelineLayout layout;
///     VkPipeline basePipelineHandle;
///     int32_t basePipelineIndex;
/// } VkRayTracingPipelineCreateInfoKHR;
/// ```
public sealed class VkRayTracingPipelineCreateInfoKHR extends Struct {
    /// The struct layout of `VkRayTracingPipelineCreateInfoKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("stageCount"),
        ValueLayout.ADDRESS.withName("pStages"),
        ValueLayout.JAVA_INT.withName("groupCount"),
        ValueLayout.ADDRESS.withName("pGroups"),
        ValueLayout.JAVA_INT.withName("maxPipelineRayRecursionDepth"),
        ValueLayout.ADDRESS.withName("pLibraryInfo"),
        ValueLayout.ADDRESS.withName("pLibraryInterface"),
        ValueLayout.ADDRESS.withName("pDynamicState"),
        ValueLayout.ADDRESS.withName("layout"),
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
    /// The [VarHandle] of `groupCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_groupCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("groupCount"));
    /// The [VarHandle] of `pGroups` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pGroups = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pGroups"));
    /// The [VarHandle] of `maxPipelineRayRecursionDepth` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxPipelineRayRecursionDepth = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxPipelineRayRecursionDepth"));
    /// The [VarHandle] of `pLibraryInfo` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pLibraryInfo = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pLibraryInfo"));
    /// The [VarHandle] of `pLibraryInterface` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pLibraryInterface = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pLibraryInterface"));
    /// The [VarHandle] of `pDynamicState` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pDynamicState = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pDynamicState"));
    /// The [VarHandle] of `layout` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_layout = LAYOUT.arrayElementVarHandle(PathElement.groupElement("layout"));
    /// The [VarHandle] of `basePipelineHandle` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_basePipelineHandle = LAYOUT.arrayElementVarHandle(PathElement.groupElement("basePipelineHandle"));
    /// The [VarHandle] of `basePipelineIndex` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_basePipelineIndex = LAYOUT.arrayElementVarHandle(PathElement.groupElement("basePipelineIndex"));

    /// Creates `VkRayTracingPipelineCreateInfoKHR` with the given segment.
    /// @param segment the memory segment
    public VkRayTracingPipelineCreateInfoKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkRayTracingPipelineCreateInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkRayTracingPipelineCreateInfoKHR of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkRayTracingPipelineCreateInfoKHR(segment); }

    /// Creates `VkRayTracingPipelineCreateInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkRayTracingPipelineCreateInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkRayTracingPipelineCreateInfoKHR ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkRayTracingPipelineCreateInfoKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkRayTracingPipelineCreateInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkRayTracingPipelineCreateInfoKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkRayTracingPipelineCreateInfoKHR`
    public static VkRayTracingPipelineCreateInfoKHR alloc(SegmentAllocator allocator) { return new VkRayTracingPipelineCreateInfoKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkRayTracingPipelineCreateInfoKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkRayTracingPipelineCreateInfoKHR`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkRayTracingPipelineCreateInfoKHR` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkRayTracingPipelineCreateInfoKHR`
    public static VkRayTracingPipelineCreateInfoKHR allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("const void *") java.lang.foreign.MemorySegment pNext, @CType("VkPipelineCreateFlags") int flags, @CType("uint32_t") int stageCount, @CType("const VkPipelineShaderStageCreateInfo *") java.lang.foreign.MemorySegment pStages, @CType("uint32_t") int groupCount, @CType("const VkRayTracingShaderGroupCreateInfoKHR *") java.lang.foreign.MemorySegment pGroups, @CType("uint32_t") int maxPipelineRayRecursionDepth, @CType("const VkPipelineLibraryCreateInfoKHR *") java.lang.foreign.MemorySegment pLibraryInfo, @CType("const VkRayTracingPipelineInterfaceCreateInfoKHR *") java.lang.foreign.MemorySegment pLibraryInterface, @CType("const VkPipelineDynamicStateCreateInfo *") java.lang.foreign.MemorySegment pDynamicState, @CType("VkPipelineLayout") java.lang.foreign.MemorySegment layout, @CType("VkPipeline") java.lang.foreign.MemorySegment basePipelineHandle, @CType("int32_t") int basePipelineIndex) { return alloc(allocator).sType(sType).pNext(pNext).flags(flags).stageCount(stageCount).pStages(pStages).groupCount(groupCount).pGroups(pGroups).maxPipelineRayRecursionDepth(maxPipelineRayRecursionDepth).pLibraryInfo(pLibraryInfo).pLibraryInterface(pLibraryInterface).pDynamicState(pDynamicState).layout(layout).basePipelineHandle(basePipelineHandle).basePipelineIndex(basePipelineIndex); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkRayTracingPipelineCreateInfoKHR copyFrom(VkRayTracingPipelineCreateInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkRayTracingPipelineCreateInfoKHR.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkRayTracingPipelineCreateInfoKHR.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkRayTracingPipelineCreateInfoKHR.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRayTracingPipelineCreateInfoKHR sType(@CType("VkStructureType") int value) { VkRayTracingPipelineCreateInfoKHR.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkRayTracingPipelineCreateInfoKHR.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkRayTracingPipelineCreateInfoKHR.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkRayTracingPipelineCreateInfoKHR.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRayTracingPipelineCreateInfoKHR pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkRayTracingPipelineCreateInfoKHR.set_pNext(this.segment(), value); return this; }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkPipelineCreateFlags") int get_flags(MemorySegment segment, long index) { return (int) VH_flags.get(segment, 0L, index); }
    /// {@return `flags`}
    /// @param segment the segment of the struct
    public static @CType("VkPipelineCreateFlags") int get_flags(MemorySegment segment) { return VkRayTracingPipelineCreateInfoKHR.get_flags(segment, 0L); }
    /// {@return `flags`}
    public @CType("VkPipelineCreateFlags") int flags() { return VkRayTracingPipelineCreateInfoKHR.get_flags(this.segment()); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_flags(MemorySegment segment, long index, @CType("VkPipelineCreateFlags") int value) { VH_flags.set(segment, 0L, index, value); }
    /// Sets `flags` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_flags(MemorySegment segment, @CType("VkPipelineCreateFlags") int value) { VkRayTracingPipelineCreateInfoKHR.set_flags(segment, 0L, value); }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRayTracingPipelineCreateInfoKHR flags(@CType("VkPipelineCreateFlags") int value) { VkRayTracingPipelineCreateInfoKHR.set_flags(this.segment(), value); return this; }

    /// {@return `stageCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_stageCount(MemorySegment segment, long index) { return (int) VH_stageCount.get(segment, 0L, index); }
    /// {@return `stageCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_stageCount(MemorySegment segment) { return VkRayTracingPipelineCreateInfoKHR.get_stageCount(segment, 0L); }
    /// {@return `stageCount`}
    public @CType("uint32_t") int stageCount() { return VkRayTracingPipelineCreateInfoKHR.get_stageCount(this.segment()); }
    /// Sets `stageCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_stageCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_stageCount.set(segment, 0L, index, value); }
    /// Sets `stageCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_stageCount(MemorySegment segment, @CType("uint32_t") int value) { VkRayTracingPipelineCreateInfoKHR.set_stageCount(segment, 0L, value); }
    /// Sets `stageCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRayTracingPipelineCreateInfoKHR stageCount(@CType("uint32_t") int value) { VkRayTracingPipelineCreateInfoKHR.set_stageCount(this.segment(), value); return this; }

    /// {@return `pStages` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const VkPipelineShaderStageCreateInfo *") java.lang.foreign.MemorySegment get_pStages(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pStages.get(segment, 0L, index); }
    /// {@return `pStages`}
    /// @param segment the segment of the struct
    public static @CType("const VkPipelineShaderStageCreateInfo *") java.lang.foreign.MemorySegment get_pStages(MemorySegment segment) { return VkRayTracingPipelineCreateInfoKHR.get_pStages(segment, 0L); }
    /// {@return `pStages`}
    public @CType("const VkPipelineShaderStageCreateInfo *") java.lang.foreign.MemorySegment pStages() { return VkRayTracingPipelineCreateInfoKHR.get_pStages(this.segment()); }
    /// Sets `pStages` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pStages(MemorySegment segment, long index, @CType("const VkPipelineShaderStageCreateInfo *") java.lang.foreign.MemorySegment value) { VH_pStages.set(segment, 0L, index, value); }
    /// Sets `pStages` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pStages(MemorySegment segment, @CType("const VkPipelineShaderStageCreateInfo *") java.lang.foreign.MemorySegment value) { VkRayTracingPipelineCreateInfoKHR.set_pStages(segment, 0L, value); }
    /// Sets `pStages` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRayTracingPipelineCreateInfoKHR pStages(@CType("const VkPipelineShaderStageCreateInfo *") java.lang.foreign.MemorySegment value) { VkRayTracingPipelineCreateInfoKHR.set_pStages(this.segment(), value); return this; }

    /// {@return `groupCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_groupCount(MemorySegment segment, long index) { return (int) VH_groupCount.get(segment, 0L, index); }
    /// {@return `groupCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_groupCount(MemorySegment segment) { return VkRayTracingPipelineCreateInfoKHR.get_groupCount(segment, 0L); }
    /// {@return `groupCount`}
    public @CType("uint32_t") int groupCount() { return VkRayTracingPipelineCreateInfoKHR.get_groupCount(this.segment()); }
    /// Sets `groupCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_groupCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_groupCount.set(segment, 0L, index, value); }
    /// Sets `groupCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_groupCount(MemorySegment segment, @CType("uint32_t") int value) { VkRayTracingPipelineCreateInfoKHR.set_groupCount(segment, 0L, value); }
    /// Sets `groupCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRayTracingPipelineCreateInfoKHR groupCount(@CType("uint32_t") int value) { VkRayTracingPipelineCreateInfoKHR.set_groupCount(this.segment(), value); return this; }

    /// {@return `pGroups` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const VkRayTracingShaderGroupCreateInfoKHR *") java.lang.foreign.MemorySegment get_pGroups(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pGroups.get(segment, 0L, index); }
    /// {@return `pGroups`}
    /// @param segment the segment of the struct
    public static @CType("const VkRayTracingShaderGroupCreateInfoKHR *") java.lang.foreign.MemorySegment get_pGroups(MemorySegment segment) { return VkRayTracingPipelineCreateInfoKHR.get_pGroups(segment, 0L); }
    /// {@return `pGroups`}
    public @CType("const VkRayTracingShaderGroupCreateInfoKHR *") java.lang.foreign.MemorySegment pGroups() { return VkRayTracingPipelineCreateInfoKHR.get_pGroups(this.segment()); }
    /// Sets `pGroups` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pGroups(MemorySegment segment, long index, @CType("const VkRayTracingShaderGroupCreateInfoKHR *") java.lang.foreign.MemorySegment value) { VH_pGroups.set(segment, 0L, index, value); }
    /// Sets `pGroups` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pGroups(MemorySegment segment, @CType("const VkRayTracingShaderGroupCreateInfoKHR *") java.lang.foreign.MemorySegment value) { VkRayTracingPipelineCreateInfoKHR.set_pGroups(segment, 0L, value); }
    /// Sets `pGroups` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRayTracingPipelineCreateInfoKHR pGroups(@CType("const VkRayTracingShaderGroupCreateInfoKHR *") java.lang.foreign.MemorySegment value) { VkRayTracingPipelineCreateInfoKHR.set_pGroups(this.segment(), value); return this; }

    /// {@return `maxPipelineRayRecursionDepth` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxPipelineRayRecursionDepth(MemorySegment segment, long index) { return (int) VH_maxPipelineRayRecursionDepth.get(segment, 0L, index); }
    /// {@return `maxPipelineRayRecursionDepth`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxPipelineRayRecursionDepth(MemorySegment segment) { return VkRayTracingPipelineCreateInfoKHR.get_maxPipelineRayRecursionDepth(segment, 0L); }
    /// {@return `maxPipelineRayRecursionDepth`}
    public @CType("uint32_t") int maxPipelineRayRecursionDepth() { return VkRayTracingPipelineCreateInfoKHR.get_maxPipelineRayRecursionDepth(this.segment()); }
    /// Sets `maxPipelineRayRecursionDepth` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxPipelineRayRecursionDepth(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxPipelineRayRecursionDepth.set(segment, 0L, index, value); }
    /// Sets `maxPipelineRayRecursionDepth` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxPipelineRayRecursionDepth(MemorySegment segment, @CType("uint32_t") int value) { VkRayTracingPipelineCreateInfoKHR.set_maxPipelineRayRecursionDepth(segment, 0L, value); }
    /// Sets `maxPipelineRayRecursionDepth` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRayTracingPipelineCreateInfoKHR maxPipelineRayRecursionDepth(@CType("uint32_t") int value) { VkRayTracingPipelineCreateInfoKHR.set_maxPipelineRayRecursionDepth(this.segment(), value); return this; }

    /// {@return `pLibraryInfo` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const VkPipelineLibraryCreateInfoKHR *") java.lang.foreign.MemorySegment get_pLibraryInfo(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pLibraryInfo.get(segment, 0L, index); }
    /// {@return `pLibraryInfo`}
    /// @param segment the segment of the struct
    public static @CType("const VkPipelineLibraryCreateInfoKHR *") java.lang.foreign.MemorySegment get_pLibraryInfo(MemorySegment segment) { return VkRayTracingPipelineCreateInfoKHR.get_pLibraryInfo(segment, 0L); }
    /// {@return `pLibraryInfo`}
    public @CType("const VkPipelineLibraryCreateInfoKHR *") java.lang.foreign.MemorySegment pLibraryInfo() { return VkRayTracingPipelineCreateInfoKHR.get_pLibraryInfo(this.segment()); }
    /// Sets `pLibraryInfo` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pLibraryInfo(MemorySegment segment, long index, @CType("const VkPipelineLibraryCreateInfoKHR *") java.lang.foreign.MemorySegment value) { VH_pLibraryInfo.set(segment, 0L, index, value); }
    /// Sets `pLibraryInfo` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pLibraryInfo(MemorySegment segment, @CType("const VkPipelineLibraryCreateInfoKHR *") java.lang.foreign.MemorySegment value) { VkRayTracingPipelineCreateInfoKHR.set_pLibraryInfo(segment, 0L, value); }
    /// Sets `pLibraryInfo` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRayTracingPipelineCreateInfoKHR pLibraryInfo(@CType("const VkPipelineLibraryCreateInfoKHR *") java.lang.foreign.MemorySegment value) { VkRayTracingPipelineCreateInfoKHR.set_pLibraryInfo(this.segment(), value); return this; }

    /// {@return `pLibraryInterface` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const VkRayTracingPipelineInterfaceCreateInfoKHR *") java.lang.foreign.MemorySegment get_pLibraryInterface(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pLibraryInterface.get(segment, 0L, index); }
    /// {@return `pLibraryInterface`}
    /// @param segment the segment of the struct
    public static @CType("const VkRayTracingPipelineInterfaceCreateInfoKHR *") java.lang.foreign.MemorySegment get_pLibraryInterface(MemorySegment segment) { return VkRayTracingPipelineCreateInfoKHR.get_pLibraryInterface(segment, 0L); }
    /// {@return `pLibraryInterface`}
    public @CType("const VkRayTracingPipelineInterfaceCreateInfoKHR *") java.lang.foreign.MemorySegment pLibraryInterface() { return VkRayTracingPipelineCreateInfoKHR.get_pLibraryInterface(this.segment()); }
    /// Sets `pLibraryInterface` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pLibraryInterface(MemorySegment segment, long index, @CType("const VkRayTracingPipelineInterfaceCreateInfoKHR *") java.lang.foreign.MemorySegment value) { VH_pLibraryInterface.set(segment, 0L, index, value); }
    /// Sets `pLibraryInterface` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pLibraryInterface(MemorySegment segment, @CType("const VkRayTracingPipelineInterfaceCreateInfoKHR *") java.lang.foreign.MemorySegment value) { VkRayTracingPipelineCreateInfoKHR.set_pLibraryInterface(segment, 0L, value); }
    /// Sets `pLibraryInterface` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRayTracingPipelineCreateInfoKHR pLibraryInterface(@CType("const VkRayTracingPipelineInterfaceCreateInfoKHR *") java.lang.foreign.MemorySegment value) { VkRayTracingPipelineCreateInfoKHR.set_pLibraryInterface(this.segment(), value); return this; }

    /// {@return `pDynamicState` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const VkPipelineDynamicStateCreateInfo *") java.lang.foreign.MemorySegment get_pDynamicState(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pDynamicState.get(segment, 0L, index); }
    /// {@return `pDynamicState`}
    /// @param segment the segment of the struct
    public static @CType("const VkPipelineDynamicStateCreateInfo *") java.lang.foreign.MemorySegment get_pDynamicState(MemorySegment segment) { return VkRayTracingPipelineCreateInfoKHR.get_pDynamicState(segment, 0L); }
    /// {@return `pDynamicState`}
    public @CType("const VkPipelineDynamicStateCreateInfo *") java.lang.foreign.MemorySegment pDynamicState() { return VkRayTracingPipelineCreateInfoKHR.get_pDynamicState(this.segment()); }
    /// Sets `pDynamicState` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pDynamicState(MemorySegment segment, long index, @CType("const VkPipelineDynamicStateCreateInfo *") java.lang.foreign.MemorySegment value) { VH_pDynamicState.set(segment, 0L, index, value); }
    /// Sets `pDynamicState` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pDynamicState(MemorySegment segment, @CType("const VkPipelineDynamicStateCreateInfo *") java.lang.foreign.MemorySegment value) { VkRayTracingPipelineCreateInfoKHR.set_pDynamicState(segment, 0L, value); }
    /// Sets `pDynamicState` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRayTracingPipelineCreateInfoKHR pDynamicState(@CType("const VkPipelineDynamicStateCreateInfo *") java.lang.foreign.MemorySegment value) { VkRayTracingPipelineCreateInfoKHR.set_pDynamicState(this.segment(), value); return this; }

    /// {@return `layout` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkPipelineLayout") java.lang.foreign.MemorySegment get_layout(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_layout.get(segment, 0L, index); }
    /// {@return `layout`}
    /// @param segment the segment of the struct
    public static @CType("VkPipelineLayout") java.lang.foreign.MemorySegment get_layout(MemorySegment segment) { return VkRayTracingPipelineCreateInfoKHR.get_layout(segment, 0L); }
    /// {@return `layout`}
    public @CType("VkPipelineLayout") java.lang.foreign.MemorySegment layout() { return VkRayTracingPipelineCreateInfoKHR.get_layout(this.segment()); }
    /// Sets `layout` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_layout(MemorySegment segment, long index, @CType("VkPipelineLayout") java.lang.foreign.MemorySegment value) { VH_layout.set(segment, 0L, index, value); }
    /// Sets `layout` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_layout(MemorySegment segment, @CType("VkPipelineLayout") java.lang.foreign.MemorySegment value) { VkRayTracingPipelineCreateInfoKHR.set_layout(segment, 0L, value); }
    /// Sets `layout` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRayTracingPipelineCreateInfoKHR layout(@CType("VkPipelineLayout") java.lang.foreign.MemorySegment value) { VkRayTracingPipelineCreateInfoKHR.set_layout(this.segment(), value); return this; }

    /// {@return `basePipelineHandle` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkPipeline") java.lang.foreign.MemorySegment get_basePipelineHandle(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_basePipelineHandle.get(segment, 0L, index); }
    /// {@return `basePipelineHandle`}
    /// @param segment the segment of the struct
    public static @CType("VkPipeline") java.lang.foreign.MemorySegment get_basePipelineHandle(MemorySegment segment) { return VkRayTracingPipelineCreateInfoKHR.get_basePipelineHandle(segment, 0L); }
    /// {@return `basePipelineHandle`}
    public @CType("VkPipeline") java.lang.foreign.MemorySegment basePipelineHandle() { return VkRayTracingPipelineCreateInfoKHR.get_basePipelineHandle(this.segment()); }
    /// Sets `basePipelineHandle` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_basePipelineHandle(MemorySegment segment, long index, @CType("VkPipeline") java.lang.foreign.MemorySegment value) { VH_basePipelineHandle.set(segment, 0L, index, value); }
    /// Sets `basePipelineHandle` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_basePipelineHandle(MemorySegment segment, @CType("VkPipeline") java.lang.foreign.MemorySegment value) { VkRayTracingPipelineCreateInfoKHR.set_basePipelineHandle(segment, 0L, value); }
    /// Sets `basePipelineHandle` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRayTracingPipelineCreateInfoKHR basePipelineHandle(@CType("VkPipeline") java.lang.foreign.MemorySegment value) { VkRayTracingPipelineCreateInfoKHR.set_basePipelineHandle(this.segment(), value); return this; }

    /// {@return `basePipelineIndex` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("int32_t") int get_basePipelineIndex(MemorySegment segment, long index) { return (int) VH_basePipelineIndex.get(segment, 0L, index); }
    /// {@return `basePipelineIndex`}
    /// @param segment the segment of the struct
    public static @CType("int32_t") int get_basePipelineIndex(MemorySegment segment) { return VkRayTracingPipelineCreateInfoKHR.get_basePipelineIndex(segment, 0L); }
    /// {@return `basePipelineIndex`}
    public @CType("int32_t") int basePipelineIndex() { return VkRayTracingPipelineCreateInfoKHR.get_basePipelineIndex(this.segment()); }
    /// Sets `basePipelineIndex` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_basePipelineIndex(MemorySegment segment, long index, @CType("int32_t") int value) { VH_basePipelineIndex.set(segment, 0L, index, value); }
    /// Sets `basePipelineIndex` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_basePipelineIndex(MemorySegment segment, @CType("int32_t") int value) { VkRayTracingPipelineCreateInfoKHR.set_basePipelineIndex(segment, 0L, value); }
    /// Sets `basePipelineIndex` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRayTracingPipelineCreateInfoKHR basePipelineIndex(@CType("int32_t") int value) { VkRayTracingPipelineCreateInfoKHR.set_basePipelineIndex(this.segment(), value); return this; }

    /// A buffer of [VkRayTracingPipelineCreateInfoKHR].
    public static final class Buffer extends VkRayTracingPipelineCreateInfoKHR {
        private final long elementCount;

        /// Creates `VkRayTracingPipelineCreateInfoKHR.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkRayTracingPipelineCreateInfoKHR`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkRayTracingPipelineCreateInfoKHR`
        public VkRayTracingPipelineCreateInfoKHR asSlice(long index) { return new VkRayTracingPipelineCreateInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkRayTracingPipelineCreateInfoKHR`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkRayTracingPipelineCreateInfoKHR`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkRayTracingPipelineCreateInfoKHR.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkRayTracingPipelineCreateInfoKHR.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkRayTracingPipelineCreateInfoKHR.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkRayTracingPipelineCreateInfoKHR.set_pNext(this.segment(), index, value); return this; }

        /// {@return `flags` at the given index}
        /// @param index the index
        public @CType("VkPipelineCreateFlags") int flagsAt(long index) { return VkRayTracingPipelineCreateInfoKHR.get_flags(this.segment(), index); }
        /// Sets `flags` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer flagsAt(long index, @CType("VkPipelineCreateFlags") int value) { VkRayTracingPipelineCreateInfoKHR.set_flags(this.segment(), index, value); return this; }

        /// {@return `stageCount` at the given index}
        /// @param index the index
        public @CType("uint32_t") int stageCountAt(long index) { return VkRayTracingPipelineCreateInfoKHR.get_stageCount(this.segment(), index); }
        /// Sets `stageCount` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer stageCountAt(long index, @CType("uint32_t") int value) { VkRayTracingPipelineCreateInfoKHR.set_stageCount(this.segment(), index, value); return this; }

        /// {@return `pStages` at the given index}
        /// @param index the index
        public @CType("const VkPipelineShaderStageCreateInfo *") java.lang.foreign.MemorySegment pStagesAt(long index) { return VkRayTracingPipelineCreateInfoKHR.get_pStages(this.segment(), index); }
        /// Sets `pStages` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pStagesAt(long index, @CType("const VkPipelineShaderStageCreateInfo *") java.lang.foreign.MemorySegment value) { VkRayTracingPipelineCreateInfoKHR.set_pStages(this.segment(), index, value); return this; }

        /// {@return `groupCount` at the given index}
        /// @param index the index
        public @CType("uint32_t") int groupCountAt(long index) { return VkRayTracingPipelineCreateInfoKHR.get_groupCount(this.segment(), index); }
        /// Sets `groupCount` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer groupCountAt(long index, @CType("uint32_t") int value) { VkRayTracingPipelineCreateInfoKHR.set_groupCount(this.segment(), index, value); return this; }

        /// {@return `pGroups` at the given index}
        /// @param index the index
        public @CType("const VkRayTracingShaderGroupCreateInfoKHR *") java.lang.foreign.MemorySegment pGroupsAt(long index) { return VkRayTracingPipelineCreateInfoKHR.get_pGroups(this.segment(), index); }
        /// Sets `pGroups` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pGroupsAt(long index, @CType("const VkRayTracingShaderGroupCreateInfoKHR *") java.lang.foreign.MemorySegment value) { VkRayTracingPipelineCreateInfoKHR.set_pGroups(this.segment(), index, value); return this; }

        /// {@return `maxPipelineRayRecursionDepth` at the given index}
        /// @param index the index
        public @CType("uint32_t") int maxPipelineRayRecursionDepthAt(long index) { return VkRayTracingPipelineCreateInfoKHR.get_maxPipelineRayRecursionDepth(this.segment(), index); }
        /// Sets `maxPipelineRayRecursionDepth` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maxPipelineRayRecursionDepthAt(long index, @CType("uint32_t") int value) { VkRayTracingPipelineCreateInfoKHR.set_maxPipelineRayRecursionDepth(this.segment(), index, value); return this; }

        /// {@return `pLibraryInfo` at the given index}
        /// @param index the index
        public @CType("const VkPipelineLibraryCreateInfoKHR *") java.lang.foreign.MemorySegment pLibraryInfoAt(long index) { return VkRayTracingPipelineCreateInfoKHR.get_pLibraryInfo(this.segment(), index); }
        /// Sets `pLibraryInfo` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pLibraryInfoAt(long index, @CType("const VkPipelineLibraryCreateInfoKHR *") java.lang.foreign.MemorySegment value) { VkRayTracingPipelineCreateInfoKHR.set_pLibraryInfo(this.segment(), index, value); return this; }

        /// {@return `pLibraryInterface` at the given index}
        /// @param index the index
        public @CType("const VkRayTracingPipelineInterfaceCreateInfoKHR *") java.lang.foreign.MemorySegment pLibraryInterfaceAt(long index) { return VkRayTracingPipelineCreateInfoKHR.get_pLibraryInterface(this.segment(), index); }
        /// Sets `pLibraryInterface` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pLibraryInterfaceAt(long index, @CType("const VkRayTracingPipelineInterfaceCreateInfoKHR *") java.lang.foreign.MemorySegment value) { VkRayTracingPipelineCreateInfoKHR.set_pLibraryInterface(this.segment(), index, value); return this; }

        /// {@return `pDynamicState` at the given index}
        /// @param index the index
        public @CType("const VkPipelineDynamicStateCreateInfo *") java.lang.foreign.MemorySegment pDynamicStateAt(long index) { return VkRayTracingPipelineCreateInfoKHR.get_pDynamicState(this.segment(), index); }
        /// Sets `pDynamicState` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pDynamicStateAt(long index, @CType("const VkPipelineDynamicStateCreateInfo *") java.lang.foreign.MemorySegment value) { VkRayTracingPipelineCreateInfoKHR.set_pDynamicState(this.segment(), index, value); return this; }

        /// {@return `layout` at the given index}
        /// @param index the index
        public @CType("VkPipelineLayout") java.lang.foreign.MemorySegment layoutAt(long index) { return VkRayTracingPipelineCreateInfoKHR.get_layout(this.segment(), index); }
        /// Sets `layout` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer layoutAt(long index, @CType("VkPipelineLayout") java.lang.foreign.MemorySegment value) { VkRayTracingPipelineCreateInfoKHR.set_layout(this.segment(), index, value); return this; }

        /// {@return `basePipelineHandle` at the given index}
        /// @param index the index
        public @CType("VkPipeline") java.lang.foreign.MemorySegment basePipelineHandleAt(long index) { return VkRayTracingPipelineCreateInfoKHR.get_basePipelineHandle(this.segment(), index); }
        /// Sets `basePipelineHandle` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer basePipelineHandleAt(long index, @CType("VkPipeline") java.lang.foreign.MemorySegment value) { VkRayTracingPipelineCreateInfoKHR.set_basePipelineHandle(this.segment(), index, value); return this; }

        /// {@return `basePipelineIndex` at the given index}
        /// @param index the index
        public @CType("int32_t") int basePipelineIndexAt(long index) { return VkRayTracingPipelineCreateInfoKHR.get_basePipelineIndex(this.segment(), index); }
        /// Sets `basePipelineIndex` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer basePipelineIndexAt(long index, @CType("int32_t") int value) { VkRayTracingPipelineCreateInfoKHR.set_basePipelineIndex(this.segment(), index, value); return this; }

    }
}
