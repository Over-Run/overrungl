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
package overrungl.vulkan.amdx.struct;

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
/// [VarHandle][#VH_pNext] - [Getter][#pNext()] - [Setter][#pNext(MemorySegment)]
/// ### flags
/// [VarHandle][#VH_flags] - [Getter][#flags()] - [Setter][#flags(int)]
/// ### stageCount
/// [VarHandle][#VH_stageCount] - [Getter][#stageCount()] - [Setter][#stageCount(int)]
/// ### pStages
/// [VarHandle][#VH_pStages] - [Getter][#pStages()] - [Setter][#pStages(MemorySegment)]
/// ### pLibraryInfo
/// [VarHandle][#VH_pLibraryInfo] - [Getter][#pLibraryInfo()] - [Setter][#pLibraryInfo(MemorySegment)]
/// ### layout
/// [VarHandle][#VH_layout] - [Getter][#layout()] - [Setter][#layout(MemorySegment)]
/// ### basePipelineHandle
/// [VarHandle][#VH_basePipelineHandle] - [Getter][#basePipelineHandle()] - [Setter][#basePipelineHandle(MemorySegment)]
/// ### basePipelineIndex
/// [VarHandle][#VH_basePipelineIndex] - [Getter][#basePipelineIndex()] - [Setter][#basePipelineIndex(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkExecutionGraphPipelineCreateInfoAMDX {
///     VkStructureType sType;
///     const void * pNext;
///     VkPipelineCreateFlags flags;
///     uint32_t stageCount;
///     const VkPipelineShaderStageCreateInfo * pStages;
///     const VkPipelineLibraryCreateInfoKHR * pLibraryInfo;
///     VkPipelineLayout layout;
///     VkPipeline basePipelineHandle;
///     int32_t basePipelineIndex;
/// } VkExecutionGraphPipelineCreateInfoAMDX;
/// ```
public sealed class VkExecutionGraphPipelineCreateInfoAMDX extends Struct {
    /// The struct layout of `VkExecutionGraphPipelineCreateInfoAMDX`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("stageCount"),
        ValueLayout.ADDRESS.withName("pStages"),
        ValueLayout.ADDRESS.withName("pLibraryInfo"),
        ValueLayout.ADDRESS.withName("layout"),
        ValueLayout.ADDRESS.withName("basePipelineHandle"),
        ValueLayout.JAVA_INT.withName("basePipelineIndex")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `flags` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    /// The [VarHandle] of `stageCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_stageCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("stageCount"));
    /// The [VarHandle] of `pStages` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pStages = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pStages"));
    /// The [VarHandle] of `pLibraryInfo` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pLibraryInfo = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pLibraryInfo"));
    /// The [VarHandle] of `layout` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_layout = LAYOUT.arrayElementVarHandle(PathElement.groupElement("layout"));
    /// The [VarHandle] of `basePipelineHandle` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_basePipelineHandle = LAYOUT.arrayElementVarHandle(PathElement.groupElement("basePipelineHandle"));
    /// The [VarHandle] of `basePipelineIndex` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_basePipelineIndex = LAYOUT.arrayElementVarHandle(PathElement.groupElement("basePipelineIndex"));

    /// Creates `VkExecutionGraphPipelineCreateInfoAMDX` with the given segment.
    /// @param segment the memory segment
    public VkExecutionGraphPipelineCreateInfoAMDX(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkExecutionGraphPipelineCreateInfoAMDX` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkExecutionGraphPipelineCreateInfoAMDX of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkExecutionGraphPipelineCreateInfoAMDX(segment); }

    /// Creates `VkExecutionGraphPipelineCreateInfoAMDX` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkExecutionGraphPipelineCreateInfoAMDX` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkExecutionGraphPipelineCreateInfoAMDX ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkExecutionGraphPipelineCreateInfoAMDX(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkExecutionGraphPipelineCreateInfoAMDX` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkExecutionGraphPipelineCreateInfoAMDX` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkExecutionGraphPipelineCreateInfoAMDX`
    public static VkExecutionGraphPipelineCreateInfoAMDX alloc(SegmentAllocator allocator) { return new VkExecutionGraphPipelineCreateInfoAMDX(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkExecutionGraphPipelineCreateInfoAMDX` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkExecutionGraphPipelineCreateInfoAMDX`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkExecutionGraphPipelineCreateInfoAMDX` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkExecutionGraphPipelineCreateInfoAMDX`
    public static VkExecutionGraphPipelineCreateInfoAMDX allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("const void *") MemorySegment pNext, @CType("VkPipelineCreateFlags") int flags, @CType("uint32_t") int stageCount, @CType("const VkPipelineShaderStageCreateInfo *") MemorySegment pStages, @CType("const VkPipelineLibraryCreateInfoKHR *") MemorySegment pLibraryInfo, @CType("VkPipelineLayout") MemorySegment layout, @CType("VkPipeline") MemorySegment basePipelineHandle, @CType("int32_t") int basePipelineIndex) { return alloc(allocator).sType(sType).pNext(pNext).flags(flags).stageCount(stageCount).pStages(pStages).pLibraryInfo(pLibraryInfo).layout(layout).basePipelineHandle(basePipelineHandle).basePipelineIndex(basePipelineIndex); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkExecutionGraphPipelineCreateInfoAMDX copyFrom(VkExecutionGraphPipelineCreateInfoAMDX src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkExecutionGraphPipelineCreateInfoAMDX.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkExecutionGraphPipelineCreateInfoAMDX.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkExecutionGraphPipelineCreateInfoAMDX.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkExecutionGraphPipelineCreateInfoAMDX sType(@CType("VkStructureType") int value) { VkExecutionGraphPipelineCreateInfoAMDX.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") MemorySegment get_pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") MemorySegment get_pNext(MemorySegment segment) { return VkExecutionGraphPipelineCreateInfoAMDX.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("const void *") MemorySegment pNext() { return VkExecutionGraphPipelineCreateInfoAMDX.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") MemorySegment value) { VkExecutionGraphPipelineCreateInfoAMDX.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkExecutionGraphPipelineCreateInfoAMDX pNext(@CType("const void *") MemorySegment value) { VkExecutionGraphPipelineCreateInfoAMDX.set_pNext(this.segment(), value); return this; }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkPipelineCreateFlags") int get_flags(MemorySegment segment, long index) { return (int) VH_flags.get(segment, 0L, index); }
    /// {@return `flags`}
    /// @param segment the segment of the struct
    public static @CType("VkPipelineCreateFlags") int get_flags(MemorySegment segment) { return VkExecutionGraphPipelineCreateInfoAMDX.get_flags(segment, 0L); }
    /// {@return `flags`}
    public @CType("VkPipelineCreateFlags") int flags() { return VkExecutionGraphPipelineCreateInfoAMDX.get_flags(this.segment()); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_flags(MemorySegment segment, long index, @CType("VkPipelineCreateFlags") int value) { VH_flags.set(segment, 0L, index, value); }
    /// Sets `flags` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_flags(MemorySegment segment, @CType("VkPipelineCreateFlags") int value) { VkExecutionGraphPipelineCreateInfoAMDX.set_flags(segment, 0L, value); }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkExecutionGraphPipelineCreateInfoAMDX flags(@CType("VkPipelineCreateFlags") int value) { VkExecutionGraphPipelineCreateInfoAMDX.set_flags(this.segment(), value); return this; }

    /// {@return `stageCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_stageCount(MemorySegment segment, long index) { return (int) VH_stageCount.get(segment, 0L, index); }
    /// {@return `stageCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_stageCount(MemorySegment segment) { return VkExecutionGraphPipelineCreateInfoAMDX.get_stageCount(segment, 0L); }
    /// {@return `stageCount`}
    public @CType("uint32_t") int stageCount() { return VkExecutionGraphPipelineCreateInfoAMDX.get_stageCount(this.segment()); }
    /// Sets `stageCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_stageCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_stageCount.set(segment, 0L, index, value); }
    /// Sets `stageCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_stageCount(MemorySegment segment, @CType("uint32_t") int value) { VkExecutionGraphPipelineCreateInfoAMDX.set_stageCount(segment, 0L, value); }
    /// Sets `stageCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkExecutionGraphPipelineCreateInfoAMDX stageCount(@CType("uint32_t") int value) { VkExecutionGraphPipelineCreateInfoAMDX.set_stageCount(this.segment(), value); return this; }

    /// {@return `pStages` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const VkPipelineShaderStageCreateInfo *") MemorySegment get_pStages(MemorySegment segment, long index) { return (MemorySegment) VH_pStages.get(segment, 0L, index); }
    /// {@return `pStages`}
    /// @param segment the segment of the struct
    public static @CType("const VkPipelineShaderStageCreateInfo *") MemorySegment get_pStages(MemorySegment segment) { return VkExecutionGraphPipelineCreateInfoAMDX.get_pStages(segment, 0L); }
    /// {@return `pStages`}
    public @CType("const VkPipelineShaderStageCreateInfo *") MemorySegment pStages() { return VkExecutionGraphPipelineCreateInfoAMDX.get_pStages(this.segment()); }
    /// Sets `pStages` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pStages(MemorySegment segment, long index, @CType("const VkPipelineShaderStageCreateInfo *") MemorySegment value) { VH_pStages.set(segment, 0L, index, value); }
    /// Sets `pStages` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pStages(MemorySegment segment, @CType("const VkPipelineShaderStageCreateInfo *") MemorySegment value) { VkExecutionGraphPipelineCreateInfoAMDX.set_pStages(segment, 0L, value); }
    /// Sets `pStages` with the given value.
    /// @param value the value
    /// @return `this`
    public VkExecutionGraphPipelineCreateInfoAMDX pStages(@CType("const VkPipelineShaderStageCreateInfo *") MemorySegment value) { VkExecutionGraphPipelineCreateInfoAMDX.set_pStages(this.segment(), value); return this; }

    /// {@return `pLibraryInfo` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const VkPipelineLibraryCreateInfoKHR *") MemorySegment get_pLibraryInfo(MemorySegment segment, long index) { return (MemorySegment) VH_pLibraryInfo.get(segment, 0L, index); }
    /// {@return `pLibraryInfo`}
    /// @param segment the segment of the struct
    public static @CType("const VkPipelineLibraryCreateInfoKHR *") MemorySegment get_pLibraryInfo(MemorySegment segment) { return VkExecutionGraphPipelineCreateInfoAMDX.get_pLibraryInfo(segment, 0L); }
    /// {@return `pLibraryInfo`}
    public @CType("const VkPipelineLibraryCreateInfoKHR *") MemorySegment pLibraryInfo() { return VkExecutionGraphPipelineCreateInfoAMDX.get_pLibraryInfo(this.segment()); }
    /// Sets `pLibraryInfo` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pLibraryInfo(MemorySegment segment, long index, @CType("const VkPipelineLibraryCreateInfoKHR *") MemorySegment value) { VH_pLibraryInfo.set(segment, 0L, index, value); }
    /// Sets `pLibraryInfo` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pLibraryInfo(MemorySegment segment, @CType("const VkPipelineLibraryCreateInfoKHR *") MemorySegment value) { VkExecutionGraphPipelineCreateInfoAMDX.set_pLibraryInfo(segment, 0L, value); }
    /// Sets `pLibraryInfo` with the given value.
    /// @param value the value
    /// @return `this`
    public VkExecutionGraphPipelineCreateInfoAMDX pLibraryInfo(@CType("const VkPipelineLibraryCreateInfoKHR *") MemorySegment value) { VkExecutionGraphPipelineCreateInfoAMDX.set_pLibraryInfo(this.segment(), value); return this; }

    /// {@return `layout` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkPipelineLayout") MemorySegment get_layout(MemorySegment segment, long index) { return (MemorySegment) VH_layout.get(segment, 0L, index); }
    /// {@return `layout`}
    /// @param segment the segment of the struct
    public static @CType("VkPipelineLayout") MemorySegment get_layout(MemorySegment segment) { return VkExecutionGraphPipelineCreateInfoAMDX.get_layout(segment, 0L); }
    /// {@return `layout`}
    public @CType("VkPipelineLayout") MemorySegment layout() { return VkExecutionGraphPipelineCreateInfoAMDX.get_layout(this.segment()); }
    /// Sets `layout` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_layout(MemorySegment segment, long index, @CType("VkPipelineLayout") MemorySegment value) { VH_layout.set(segment, 0L, index, value); }
    /// Sets `layout` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_layout(MemorySegment segment, @CType("VkPipelineLayout") MemorySegment value) { VkExecutionGraphPipelineCreateInfoAMDX.set_layout(segment, 0L, value); }
    /// Sets `layout` with the given value.
    /// @param value the value
    /// @return `this`
    public VkExecutionGraphPipelineCreateInfoAMDX layout(@CType("VkPipelineLayout") MemorySegment value) { VkExecutionGraphPipelineCreateInfoAMDX.set_layout(this.segment(), value); return this; }

    /// {@return `basePipelineHandle` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkPipeline") MemorySegment get_basePipelineHandle(MemorySegment segment, long index) { return (MemorySegment) VH_basePipelineHandle.get(segment, 0L, index); }
    /// {@return `basePipelineHandle`}
    /// @param segment the segment of the struct
    public static @CType("VkPipeline") MemorySegment get_basePipelineHandle(MemorySegment segment) { return VkExecutionGraphPipelineCreateInfoAMDX.get_basePipelineHandle(segment, 0L); }
    /// {@return `basePipelineHandle`}
    public @CType("VkPipeline") MemorySegment basePipelineHandle() { return VkExecutionGraphPipelineCreateInfoAMDX.get_basePipelineHandle(this.segment()); }
    /// Sets `basePipelineHandle` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_basePipelineHandle(MemorySegment segment, long index, @CType("VkPipeline") MemorySegment value) { VH_basePipelineHandle.set(segment, 0L, index, value); }
    /// Sets `basePipelineHandle` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_basePipelineHandle(MemorySegment segment, @CType("VkPipeline") MemorySegment value) { VkExecutionGraphPipelineCreateInfoAMDX.set_basePipelineHandle(segment, 0L, value); }
    /// Sets `basePipelineHandle` with the given value.
    /// @param value the value
    /// @return `this`
    public VkExecutionGraphPipelineCreateInfoAMDX basePipelineHandle(@CType("VkPipeline") MemorySegment value) { VkExecutionGraphPipelineCreateInfoAMDX.set_basePipelineHandle(this.segment(), value); return this; }

    /// {@return `basePipelineIndex` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("int32_t") int get_basePipelineIndex(MemorySegment segment, long index) { return (int) VH_basePipelineIndex.get(segment, 0L, index); }
    /// {@return `basePipelineIndex`}
    /// @param segment the segment of the struct
    public static @CType("int32_t") int get_basePipelineIndex(MemorySegment segment) { return VkExecutionGraphPipelineCreateInfoAMDX.get_basePipelineIndex(segment, 0L); }
    /// {@return `basePipelineIndex`}
    public @CType("int32_t") int basePipelineIndex() { return VkExecutionGraphPipelineCreateInfoAMDX.get_basePipelineIndex(this.segment()); }
    /// Sets `basePipelineIndex` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_basePipelineIndex(MemorySegment segment, long index, @CType("int32_t") int value) { VH_basePipelineIndex.set(segment, 0L, index, value); }
    /// Sets `basePipelineIndex` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_basePipelineIndex(MemorySegment segment, @CType("int32_t") int value) { VkExecutionGraphPipelineCreateInfoAMDX.set_basePipelineIndex(segment, 0L, value); }
    /// Sets `basePipelineIndex` with the given value.
    /// @param value the value
    /// @return `this`
    public VkExecutionGraphPipelineCreateInfoAMDX basePipelineIndex(@CType("int32_t") int value) { VkExecutionGraphPipelineCreateInfoAMDX.set_basePipelineIndex(this.segment(), value); return this; }

    /// A buffer of [VkExecutionGraphPipelineCreateInfoAMDX].
    public static final class Buffer extends VkExecutionGraphPipelineCreateInfoAMDX {
        private final long elementCount;

        /// Creates `VkExecutionGraphPipelineCreateInfoAMDX.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkExecutionGraphPipelineCreateInfoAMDX`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkExecutionGraphPipelineCreateInfoAMDX`
        public VkExecutionGraphPipelineCreateInfoAMDX asSlice(long index) { return new VkExecutionGraphPipelineCreateInfoAMDX(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkExecutionGraphPipelineCreateInfoAMDX`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkExecutionGraphPipelineCreateInfoAMDX`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkExecutionGraphPipelineCreateInfoAMDX.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkExecutionGraphPipelineCreateInfoAMDX.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("const void *") MemorySegment pNextAt(long index) { return VkExecutionGraphPipelineCreateInfoAMDX.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("const void *") MemorySegment value) { VkExecutionGraphPipelineCreateInfoAMDX.set_pNext(this.segment(), index, value); return this; }

        /// {@return `flags` at the given index}
        /// @param index the index
        public @CType("VkPipelineCreateFlags") int flagsAt(long index) { return VkExecutionGraphPipelineCreateInfoAMDX.get_flags(this.segment(), index); }
        /// Sets `flags` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer flagsAt(long index, @CType("VkPipelineCreateFlags") int value) { VkExecutionGraphPipelineCreateInfoAMDX.set_flags(this.segment(), index, value); return this; }

        /// {@return `stageCount` at the given index}
        /// @param index the index
        public @CType("uint32_t") int stageCountAt(long index) { return VkExecutionGraphPipelineCreateInfoAMDX.get_stageCount(this.segment(), index); }
        /// Sets `stageCount` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer stageCountAt(long index, @CType("uint32_t") int value) { VkExecutionGraphPipelineCreateInfoAMDX.set_stageCount(this.segment(), index, value); return this; }

        /// {@return `pStages` at the given index}
        /// @param index the index
        public @CType("const VkPipelineShaderStageCreateInfo *") MemorySegment pStagesAt(long index) { return VkExecutionGraphPipelineCreateInfoAMDX.get_pStages(this.segment(), index); }
        /// Sets `pStages` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pStagesAt(long index, @CType("const VkPipelineShaderStageCreateInfo *") MemorySegment value) { VkExecutionGraphPipelineCreateInfoAMDX.set_pStages(this.segment(), index, value); return this; }

        /// {@return `pLibraryInfo` at the given index}
        /// @param index the index
        public @CType("const VkPipelineLibraryCreateInfoKHR *") MemorySegment pLibraryInfoAt(long index) { return VkExecutionGraphPipelineCreateInfoAMDX.get_pLibraryInfo(this.segment(), index); }
        /// Sets `pLibraryInfo` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pLibraryInfoAt(long index, @CType("const VkPipelineLibraryCreateInfoKHR *") MemorySegment value) { VkExecutionGraphPipelineCreateInfoAMDX.set_pLibraryInfo(this.segment(), index, value); return this; }

        /// {@return `layout` at the given index}
        /// @param index the index
        public @CType("VkPipelineLayout") MemorySegment layoutAt(long index) { return VkExecutionGraphPipelineCreateInfoAMDX.get_layout(this.segment(), index); }
        /// Sets `layout` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer layoutAt(long index, @CType("VkPipelineLayout") MemorySegment value) { VkExecutionGraphPipelineCreateInfoAMDX.set_layout(this.segment(), index, value); return this; }

        /// {@return `basePipelineHandle` at the given index}
        /// @param index the index
        public @CType("VkPipeline") MemorySegment basePipelineHandleAt(long index) { return VkExecutionGraphPipelineCreateInfoAMDX.get_basePipelineHandle(this.segment(), index); }
        /// Sets `basePipelineHandle` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer basePipelineHandleAt(long index, @CType("VkPipeline") MemorySegment value) { VkExecutionGraphPipelineCreateInfoAMDX.set_basePipelineHandle(this.segment(), index, value); return this; }

        /// {@return `basePipelineIndex` at the given index}
        /// @param index the index
        public @CType("int32_t") int basePipelineIndexAt(long index) { return VkExecutionGraphPipelineCreateInfoAMDX.get_basePipelineIndex(this.segment(), index); }
        /// Sets `basePipelineIndex` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer basePipelineIndexAt(long index, @CType("int32_t") int value) { VkExecutionGraphPipelineCreateInfoAMDX.set_basePipelineIndex(this.segment(), index, value); return this; }

    }
}
