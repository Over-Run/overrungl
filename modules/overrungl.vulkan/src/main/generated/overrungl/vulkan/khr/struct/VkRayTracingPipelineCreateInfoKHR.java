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
package overrungl.vulkan.khr.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkRayTracingPipelineCreateInfoKHR {
///     (int) VkStructureType sType;
///     const void* pNext;
///     ((uint32_t) VkFlags) VkPipelineCreateFlags flags;
///     uint32_t stageCount;
///     const VkPipelineShaderStageCreateInfo* pStages;
///     uint32_t groupCount;
///     const VkRayTracingShaderGroupCreateInfoKHR* pGroups;
///     uint32_t maxPipelineRayRecursionDepth;
///     const VkPipelineLibraryCreateInfoKHR* pLibraryInfo;
///     const VkRayTracingPipelineInterfaceCreateInfoKHR* pLibraryInterface;
///     const VkPipelineDynamicStateCreateInfo* pDynamicState;
///     (uint64_t) VkPipelineLayout layout;
///     (uint64_t) VkPipeline basePipelineHandle;
///     int32_t basePipelineIndex;
/// };
/// ```
public final class VkRayTracingPipelineCreateInfoKHR extends GroupType {
    /// The struct layout of `VkRayTracingPipelineCreateInfoKHR`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
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
        ValueLayout.JAVA_LONG.withName("layout"),
        ValueLayout.JAVA_LONG.withName("basePipelineHandle"),
        ValueLayout.JAVA_INT.withName("basePipelineIndex")
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
    /// The byte offset of `flags`.
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    /// The memory layout of `flags`.
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    /// The [VarHandle] of `flags` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
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
    /// The byte offset of `maxPipelineRayRecursionDepth`.
    public static final long OFFSET_maxPipelineRayRecursionDepth = LAYOUT.byteOffset(PathElement.groupElement("maxPipelineRayRecursionDepth"));
    /// The memory layout of `maxPipelineRayRecursionDepth`.
    public static final MemoryLayout LAYOUT_maxPipelineRayRecursionDepth = LAYOUT.select(PathElement.groupElement("maxPipelineRayRecursionDepth"));
    /// The [VarHandle] of `maxPipelineRayRecursionDepth` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxPipelineRayRecursionDepth = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxPipelineRayRecursionDepth"));
    /// The byte offset of `pLibraryInfo`.
    public static final long OFFSET_pLibraryInfo = LAYOUT.byteOffset(PathElement.groupElement("pLibraryInfo"));
    /// The memory layout of `pLibraryInfo`.
    public static final MemoryLayout LAYOUT_pLibraryInfo = LAYOUT.select(PathElement.groupElement("pLibraryInfo"));
    /// The [VarHandle] of `pLibraryInfo` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pLibraryInfo = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pLibraryInfo"));
    /// The byte offset of `pLibraryInterface`.
    public static final long OFFSET_pLibraryInterface = LAYOUT.byteOffset(PathElement.groupElement("pLibraryInterface"));
    /// The memory layout of `pLibraryInterface`.
    public static final MemoryLayout LAYOUT_pLibraryInterface = LAYOUT.select(PathElement.groupElement("pLibraryInterface"));
    /// The [VarHandle] of `pLibraryInterface` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pLibraryInterface = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pLibraryInterface"));
    /// The byte offset of `pDynamicState`.
    public static final long OFFSET_pDynamicState = LAYOUT.byteOffset(PathElement.groupElement("pDynamicState"));
    /// The memory layout of `pDynamicState`.
    public static final MemoryLayout LAYOUT_pDynamicState = LAYOUT.select(PathElement.groupElement("pDynamicState"));
    /// The [VarHandle] of `pDynamicState` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pDynamicState = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pDynamicState"));
    /// The byte offset of `layout`.
    public static final long OFFSET_layout = LAYOUT.byteOffset(PathElement.groupElement("layout"));
    /// The memory layout of `layout`.
    public static final MemoryLayout LAYOUT_layout = LAYOUT.select(PathElement.groupElement("layout"));
    /// The [VarHandle] of `layout` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_layout = LAYOUT.arrayElementVarHandle(PathElement.groupElement("layout"));
    /// The byte offset of `basePipelineHandle`.
    public static final long OFFSET_basePipelineHandle = LAYOUT.byteOffset(PathElement.groupElement("basePipelineHandle"));
    /// The memory layout of `basePipelineHandle`.
    public static final MemoryLayout LAYOUT_basePipelineHandle = LAYOUT.select(PathElement.groupElement("basePipelineHandle"));
    /// The [VarHandle] of `basePipelineHandle` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_basePipelineHandle = LAYOUT.arrayElementVarHandle(PathElement.groupElement("basePipelineHandle"));
    /// The byte offset of `basePipelineIndex`.
    public static final long OFFSET_basePipelineIndex = LAYOUT.byteOffset(PathElement.groupElement("basePipelineIndex"));
    /// The memory layout of `basePipelineIndex`.
    public static final MemoryLayout LAYOUT_basePipelineIndex = LAYOUT.select(PathElement.groupElement("basePipelineIndex"));
    /// The [VarHandle] of `basePipelineIndex` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_basePipelineIndex = LAYOUT.arrayElementVarHandle(PathElement.groupElement("basePipelineIndex"));

    /// Creates `VkRayTracingPipelineCreateInfoKHR` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkRayTracingPipelineCreateInfoKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkRayTracingPipelineCreateInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkRayTracingPipelineCreateInfoKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkRayTracingPipelineCreateInfoKHR(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkRayTracingPipelineCreateInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkRayTracingPipelineCreateInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkRayTracingPipelineCreateInfoKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkRayTracingPipelineCreateInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkRayTracingPipelineCreateInfoKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkRayTracingPipelineCreateInfoKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkRayTracingPipelineCreateInfoKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkRayTracingPipelineCreateInfoKHR`
    public static VkRayTracingPipelineCreateInfoKHR alloc(SegmentAllocator allocator) { return new VkRayTracingPipelineCreateInfoKHR(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkRayTracingPipelineCreateInfoKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkRayTracingPipelineCreateInfoKHR`
    public static VkRayTracingPipelineCreateInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkRayTracingPipelineCreateInfoKHR(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkRayTracingPipelineCreateInfoKHR copyFrom(VkRayTracingPipelineCreateInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkRayTracingPipelineCreateInfoKHR reinterpret(long count) { return new VkRayTracingPipelineCreateInfoKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkRayTracingPipelineCreateInfoKHR sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkRayTracingPipelineCreateInfoKHR pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int flags(MemorySegment segment, long index) { return (int) VH_flags.get(segment, 0L, index); }
    /// {@return `flags`}
    public int flags() { return flags(this.segment(), 0L); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void flags(MemorySegment segment, long index, int value) { VH_flags.set(segment, 0L, index, value); }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRayTracingPipelineCreateInfoKHR flags(int value) { flags(this.segment(), 0L, value); return this; }

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
    public VkRayTracingPipelineCreateInfoKHR stageCount(int value) { stageCount(this.segment(), 0L, value); return this; }

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
    public VkRayTracingPipelineCreateInfoKHR pStages(MemorySegment value) { pStages(this.segment(), 0L, value); return this; }

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
    public VkRayTracingPipelineCreateInfoKHR groupCount(int value) { groupCount(this.segment(), 0L, value); return this; }

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
    public VkRayTracingPipelineCreateInfoKHR pGroups(MemorySegment value) { pGroups(this.segment(), 0L, value); return this; }

    /// {@return `maxPipelineRayRecursionDepth` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxPipelineRayRecursionDepth(MemorySegment segment, long index) { return (int) VH_maxPipelineRayRecursionDepth.get(segment, 0L, index); }
    /// {@return `maxPipelineRayRecursionDepth`}
    public int maxPipelineRayRecursionDepth() { return maxPipelineRayRecursionDepth(this.segment(), 0L); }
    /// Sets `maxPipelineRayRecursionDepth` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxPipelineRayRecursionDepth(MemorySegment segment, long index, int value) { VH_maxPipelineRayRecursionDepth.set(segment, 0L, index, value); }
    /// Sets `maxPipelineRayRecursionDepth` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRayTracingPipelineCreateInfoKHR maxPipelineRayRecursionDepth(int value) { maxPipelineRayRecursionDepth(this.segment(), 0L, value); return this; }

    /// {@return `pLibraryInfo` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pLibraryInfo(MemorySegment segment, long index) { return (MemorySegment) VH_pLibraryInfo.get(segment, 0L, index); }
    /// {@return `pLibraryInfo`}
    public MemorySegment pLibraryInfo() { return pLibraryInfo(this.segment(), 0L); }
    /// Sets `pLibraryInfo` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pLibraryInfo(MemorySegment segment, long index, MemorySegment value) { VH_pLibraryInfo.set(segment, 0L, index, value); }
    /// Sets `pLibraryInfo` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRayTracingPipelineCreateInfoKHR pLibraryInfo(MemorySegment value) { pLibraryInfo(this.segment(), 0L, value); return this; }

    /// {@return `pLibraryInterface` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pLibraryInterface(MemorySegment segment, long index) { return (MemorySegment) VH_pLibraryInterface.get(segment, 0L, index); }
    /// {@return `pLibraryInterface`}
    public MemorySegment pLibraryInterface() { return pLibraryInterface(this.segment(), 0L); }
    /// Sets `pLibraryInterface` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pLibraryInterface(MemorySegment segment, long index, MemorySegment value) { VH_pLibraryInterface.set(segment, 0L, index, value); }
    /// Sets `pLibraryInterface` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRayTracingPipelineCreateInfoKHR pLibraryInterface(MemorySegment value) { pLibraryInterface(this.segment(), 0L, value); return this; }

    /// {@return `pDynamicState` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pDynamicState(MemorySegment segment, long index) { return (MemorySegment) VH_pDynamicState.get(segment, 0L, index); }
    /// {@return `pDynamicState`}
    public MemorySegment pDynamicState() { return pDynamicState(this.segment(), 0L); }
    /// Sets `pDynamicState` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pDynamicState(MemorySegment segment, long index, MemorySegment value) { VH_pDynamicState.set(segment, 0L, index, value); }
    /// Sets `pDynamicState` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRayTracingPipelineCreateInfoKHR pDynamicState(MemorySegment value) { pDynamicState(this.segment(), 0L, value); return this; }

    /// {@return `layout` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long layout(MemorySegment segment, long index) { return (long) VH_layout.get(segment, 0L, index); }
    /// {@return `layout`}
    public long layout() { return layout(this.segment(), 0L); }
    /// Sets `layout` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void layout(MemorySegment segment, long index, long value) { VH_layout.set(segment, 0L, index, value); }
    /// Sets `layout` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRayTracingPipelineCreateInfoKHR layout(long value) { layout(this.segment(), 0L, value); return this; }

    /// {@return `basePipelineHandle` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long basePipelineHandle(MemorySegment segment, long index) { return (long) VH_basePipelineHandle.get(segment, 0L, index); }
    /// {@return `basePipelineHandle`}
    public long basePipelineHandle() { return basePipelineHandle(this.segment(), 0L); }
    /// Sets `basePipelineHandle` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void basePipelineHandle(MemorySegment segment, long index, long value) { VH_basePipelineHandle.set(segment, 0L, index, value); }
    /// Sets `basePipelineHandle` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRayTracingPipelineCreateInfoKHR basePipelineHandle(long value) { basePipelineHandle(this.segment(), 0L, value); return this; }

    /// {@return `basePipelineIndex` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int basePipelineIndex(MemorySegment segment, long index) { return (int) VH_basePipelineIndex.get(segment, 0L, index); }
    /// {@return `basePipelineIndex`}
    public int basePipelineIndex() { return basePipelineIndex(this.segment(), 0L); }
    /// Sets `basePipelineIndex` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void basePipelineIndex(MemorySegment segment, long index, int value) { VH_basePipelineIndex.set(segment, 0L, index, value); }
    /// Sets `basePipelineIndex` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRayTracingPipelineCreateInfoKHR basePipelineIndex(int value) { basePipelineIndex(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkRayTracingPipelineCreateInfoKHR`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkRayTracingPipelineCreateInfoKHR`
    public VkRayTracingPipelineCreateInfoKHR asSlice(long index) { return new VkRayTracingPipelineCreateInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkRayTracingPipelineCreateInfoKHR`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkRayTracingPipelineCreateInfoKHR`
    public VkRayTracingPipelineCreateInfoKHR asSlice(long index, long count) { return new VkRayTracingPipelineCreateInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkRayTracingPipelineCreateInfoKHR` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkRayTracingPipelineCreateInfoKHR at(long index, Consumer<VkRayTracingPipelineCreateInfoKHR> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkRayTracingPipelineCreateInfoKHR sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkRayTracingPipelineCreateInfoKHR pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `flags` at the given index}
    /// @param index the index of the struct buffer
    public int flagsAt(long index) { return flags(this.segment(), index); }
    /// Sets `flags` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkRayTracingPipelineCreateInfoKHR flagsAt(long index, int value) { flags(this.segment(), index, value); return this; }

    /// {@return `stageCount` at the given index}
    /// @param index the index of the struct buffer
    public int stageCountAt(long index) { return stageCount(this.segment(), index); }
    /// Sets `stageCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkRayTracingPipelineCreateInfoKHR stageCountAt(long index, int value) { stageCount(this.segment(), index, value); return this; }

    /// {@return `pStages` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pStagesAt(long index) { return pStages(this.segment(), index); }
    /// Sets `pStages` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkRayTracingPipelineCreateInfoKHR pStagesAt(long index, MemorySegment value) { pStages(this.segment(), index, value); return this; }

    /// {@return `groupCount` at the given index}
    /// @param index the index of the struct buffer
    public int groupCountAt(long index) { return groupCount(this.segment(), index); }
    /// Sets `groupCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkRayTracingPipelineCreateInfoKHR groupCountAt(long index, int value) { groupCount(this.segment(), index, value); return this; }

    /// {@return `pGroups` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pGroupsAt(long index) { return pGroups(this.segment(), index); }
    /// Sets `pGroups` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkRayTracingPipelineCreateInfoKHR pGroupsAt(long index, MemorySegment value) { pGroups(this.segment(), index, value); return this; }

    /// {@return `maxPipelineRayRecursionDepth` at the given index}
    /// @param index the index of the struct buffer
    public int maxPipelineRayRecursionDepthAt(long index) { return maxPipelineRayRecursionDepth(this.segment(), index); }
    /// Sets `maxPipelineRayRecursionDepth` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkRayTracingPipelineCreateInfoKHR maxPipelineRayRecursionDepthAt(long index, int value) { maxPipelineRayRecursionDepth(this.segment(), index, value); return this; }

    /// {@return `pLibraryInfo` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pLibraryInfoAt(long index) { return pLibraryInfo(this.segment(), index); }
    /// Sets `pLibraryInfo` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkRayTracingPipelineCreateInfoKHR pLibraryInfoAt(long index, MemorySegment value) { pLibraryInfo(this.segment(), index, value); return this; }

    /// {@return `pLibraryInterface` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pLibraryInterfaceAt(long index) { return pLibraryInterface(this.segment(), index); }
    /// Sets `pLibraryInterface` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkRayTracingPipelineCreateInfoKHR pLibraryInterfaceAt(long index, MemorySegment value) { pLibraryInterface(this.segment(), index, value); return this; }

    /// {@return `pDynamicState` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pDynamicStateAt(long index) { return pDynamicState(this.segment(), index); }
    /// Sets `pDynamicState` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkRayTracingPipelineCreateInfoKHR pDynamicStateAt(long index, MemorySegment value) { pDynamicState(this.segment(), index, value); return this; }

    /// {@return `layout` at the given index}
    /// @param index the index of the struct buffer
    public long layoutAt(long index) { return layout(this.segment(), index); }
    /// Sets `layout` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkRayTracingPipelineCreateInfoKHR layoutAt(long index, long value) { layout(this.segment(), index, value); return this; }

    /// {@return `basePipelineHandle` at the given index}
    /// @param index the index of the struct buffer
    public long basePipelineHandleAt(long index) { return basePipelineHandle(this.segment(), index); }
    /// Sets `basePipelineHandle` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkRayTracingPipelineCreateInfoKHR basePipelineHandleAt(long index, long value) { basePipelineHandle(this.segment(), index, value); return this; }

    /// {@return `basePipelineIndex` at the given index}
    /// @param index the index of the struct buffer
    public int basePipelineIndexAt(long index) { return basePipelineIndex(this.segment(), index); }
    /// Sets `basePipelineIndex` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkRayTracingPipelineCreateInfoKHR basePipelineIndexAt(long index, int value) { basePipelineIndex(this.segment(), index, value); return this; }

}
