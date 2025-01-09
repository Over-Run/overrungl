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
package overrungl.vulkan.ext.struct;

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
/// ### stageFlags
/// [VarHandle][#VH_stageFlags] - [Getter][#stageFlags()] - [Setter][#stageFlags(int)]
/// ### layout
/// [VarHandle][#VH_layout] - [Getter][#layout()] - [Setter][#layout(java.lang.foreign.MemorySegment)]
/// ### firstSet
/// [VarHandle][#VH_firstSet] - [Getter][#firstSet()] - [Setter][#firstSet(int)]
/// ### setCount
/// [VarHandle][#VH_setCount] - [Getter][#setCount()] - [Setter][#setCount(int)]
/// ### pBufferIndices
/// [VarHandle][#VH_pBufferIndices] - [Getter][#pBufferIndices()] - [Setter][#pBufferIndices(java.lang.foreign.MemorySegment)]
/// ### pOffsets
/// [VarHandle][#VH_pOffsets] - [Getter][#pOffsets()] - [Setter][#pOffsets(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkSetDescriptorBufferOffsetsInfoEXT {
///     VkStructureType sType;
///     const void * pNext;
///     VkShaderStageFlags stageFlags;
///     VkPipelineLayout layout;
///     uint32_t firstSet;
///     uint32_t setCount;
///     const uint32_t * pBufferIndices;
///     const VkDeviceSize * pOffsets;
/// } VkSetDescriptorBufferOffsetsInfoEXT;
/// ```
public final class VkSetDescriptorBufferOffsetsInfoEXT extends Struct {
    /// The struct layout of `VkSetDescriptorBufferOffsetsInfoEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("stageFlags"),
        ValueLayout.ADDRESS.withName("layout"),
        ValueLayout.JAVA_INT.withName("firstSet"),
        ValueLayout.JAVA_INT.withName("setCount"),
        ValueLayout.ADDRESS.withName("pBufferIndices"),
        ValueLayout.ADDRESS.withName("pOffsets")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `stageFlags` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_stageFlags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("stageFlags"));
    /// The [VarHandle] of `layout` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_layout = LAYOUT.arrayElementVarHandle(PathElement.groupElement("layout"));
    /// The [VarHandle] of `firstSet` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_firstSet = LAYOUT.arrayElementVarHandle(PathElement.groupElement("firstSet"));
    /// The [VarHandle] of `setCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_setCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("setCount"));
    /// The [VarHandle] of `pBufferIndices` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pBufferIndices = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pBufferIndices"));
    /// The [VarHandle] of `pOffsets` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pOffsets = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pOffsets"));

    /// Creates `VkSetDescriptorBufferOffsetsInfoEXT` with the given segment.
    /// @param segment the memory segment
    public VkSetDescriptorBufferOffsetsInfoEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkSetDescriptorBufferOffsetsInfoEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSetDescriptorBufferOffsetsInfoEXT of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkSetDescriptorBufferOffsetsInfoEXT(segment); }

    /// Creates `VkSetDescriptorBufferOffsetsInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSetDescriptorBufferOffsetsInfoEXT ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkSetDescriptorBufferOffsetsInfoEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkSetDescriptorBufferOffsetsInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSetDescriptorBufferOffsetsInfoEXT ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkSetDescriptorBufferOffsetsInfoEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkSetDescriptorBufferOffsetsInfoEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkSetDescriptorBufferOffsetsInfoEXT`
    public static VkSetDescriptorBufferOffsetsInfoEXT alloc(SegmentAllocator allocator) { return new VkSetDescriptorBufferOffsetsInfoEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkSetDescriptorBufferOffsetsInfoEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkSetDescriptorBufferOffsetsInfoEXT`
    public static VkSetDescriptorBufferOffsetsInfoEXT alloc(SegmentAllocator allocator, long count) { return new VkSetDescriptorBufferOffsetsInfoEXT(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkSetDescriptorBufferOffsetsInfoEXT.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkSetDescriptorBufferOffsetsInfoEXT.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkSetDescriptorBufferOffsetsInfoEXT.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkSetDescriptorBufferOffsetsInfoEXT.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkSetDescriptorBufferOffsetsInfoEXT sTypeAt(long index, @CType("VkStructureType") int value) { VkSetDescriptorBufferOffsetsInfoEXT.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSetDescriptorBufferOffsetsInfoEXT sType(@CType("VkStructureType") int value) { VkSetDescriptorBufferOffsetsInfoEXT.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkSetDescriptorBufferOffsetsInfoEXT.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkSetDescriptorBufferOffsetsInfoEXT.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkSetDescriptorBufferOffsetsInfoEXT.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkSetDescriptorBufferOffsetsInfoEXT.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkSetDescriptorBufferOffsetsInfoEXT pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkSetDescriptorBufferOffsetsInfoEXT.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSetDescriptorBufferOffsetsInfoEXT pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkSetDescriptorBufferOffsetsInfoEXT.set_pNext(this.segment(), value); return this; }

    /// {@return `stageFlags` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkShaderStageFlags") int get_stageFlags(MemorySegment segment, long index) { return (int) VH_stageFlags.get(segment, 0L, index); }
    /// {@return `stageFlags`}
    /// @param segment the segment of the struct
    public static @CType("VkShaderStageFlags") int get_stageFlags(MemorySegment segment) { return VkSetDescriptorBufferOffsetsInfoEXT.get_stageFlags(segment, 0L); }
    /// {@return `stageFlags` at the given index}
    /// @param index the index
    public @CType("VkShaderStageFlags") int stageFlagsAt(long index) { return VkSetDescriptorBufferOffsetsInfoEXT.get_stageFlags(this.segment(), index); }
    /// {@return `stageFlags`}
    public @CType("VkShaderStageFlags") int stageFlags() { return VkSetDescriptorBufferOffsetsInfoEXT.get_stageFlags(this.segment()); }
    /// Sets `stageFlags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_stageFlags(MemorySegment segment, long index, @CType("VkShaderStageFlags") int value) { VH_stageFlags.set(segment, 0L, index, value); }
    /// Sets `stageFlags` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_stageFlags(MemorySegment segment, @CType("VkShaderStageFlags") int value) { VkSetDescriptorBufferOffsetsInfoEXT.set_stageFlags(segment, 0L, value); }
    /// Sets `stageFlags` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkSetDescriptorBufferOffsetsInfoEXT stageFlagsAt(long index, @CType("VkShaderStageFlags") int value) { VkSetDescriptorBufferOffsetsInfoEXT.set_stageFlags(this.segment(), index, value); return this; }
    /// Sets `stageFlags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSetDescriptorBufferOffsetsInfoEXT stageFlags(@CType("VkShaderStageFlags") int value) { VkSetDescriptorBufferOffsetsInfoEXT.set_stageFlags(this.segment(), value); return this; }

    /// {@return `layout` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkPipelineLayout") java.lang.foreign.MemorySegment get_layout(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_layout.get(segment, 0L, index); }
    /// {@return `layout`}
    /// @param segment the segment of the struct
    public static @CType("VkPipelineLayout") java.lang.foreign.MemorySegment get_layout(MemorySegment segment) { return VkSetDescriptorBufferOffsetsInfoEXT.get_layout(segment, 0L); }
    /// {@return `layout` at the given index}
    /// @param index the index
    public @CType("VkPipelineLayout") java.lang.foreign.MemorySegment layoutAt(long index) { return VkSetDescriptorBufferOffsetsInfoEXT.get_layout(this.segment(), index); }
    /// {@return `layout`}
    public @CType("VkPipelineLayout") java.lang.foreign.MemorySegment layout() { return VkSetDescriptorBufferOffsetsInfoEXT.get_layout(this.segment()); }
    /// Sets `layout` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_layout(MemorySegment segment, long index, @CType("VkPipelineLayout") java.lang.foreign.MemorySegment value) { VH_layout.set(segment, 0L, index, value); }
    /// Sets `layout` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_layout(MemorySegment segment, @CType("VkPipelineLayout") java.lang.foreign.MemorySegment value) { VkSetDescriptorBufferOffsetsInfoEXT.set_layout(segment, 0L, value); }
    /// Sets `layout` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkSetDescriptorBufferOffsetsInfoEXT layoutAt(long index, @CType("VkPipelineLayout") java.lang.foreign.MemorySegment value) { VkSetDescriptorBufferOffsetsInfoEXT.set_layout(this.segment(), index, value); return this; }
    /// Sets `layout` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSetDescriptorBufferOffsetsInfoEXT layout(@CType("VkPipelineLayout") java.lang.foreign.MemorySegment value) { VkSetDescriptorBufferOffsetsInfoEXT.set_layout(this.segment(), value); return this; }

    /// {@return `firstSet` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_firstSet(MemorySegment segment, long index) { return (int) VH_firstSet.get(segment, 0L, index); }
    /// {@return `firstSet`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_firstSet(MemorySegment segment) { return VkSetDescriptorBufferOffsetsInfoEXT.get_firstSet(segment, 0L); }
    /// {@return `firstSet` at the given index}
    /// @param index the index
    public @CType("uint32_t") int firstSetAt(long index) { return VkSetDescriptorBufferOffsetsInfoEXT.get_firstSet(this.segment(), index); }
    /// {@return `firstSet`}
    public @CType("uint32_t") int firstSet() { return VkSetDescriptorBufferOffsetsInfoEXT.get_firstSet(this.segment()); }
    /// Sets `firstSet` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_firstSet(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_firstSet.set(segment, 0L, index, value); }
    /// Sets `firstSet` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_firstSet(MemorySegment segment, @CType("uint32_t") int value) { VkSetDescriptorBufferOffsetsInfoEXT.set_firstSet(segment, 0L, value); }
    /// Sets `firstSet` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkSetDescriptorBufferOffsetsInfoEXT firstSetAt(long index, @CType("uint32_t") int value) { VkSetDescriptorBufferOffsetsInfoEXT.set_firstSet(this.segment(), index, value); return this; }
    /// Sets `firstSet` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSetDescriptorBufferOffsetsInfoEXT firstSet(@CType("uint32_t") int value) { VkSetDescriptorBufferOffsetsInfoEXT.set_firstSet(this.segment(), value); return this; }

    /// {@return `setCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_setCount(MemorySegment segment, long index) { return (int) VH_setCount.get(segment, 0L, index); }
    /// {@return `setCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_setCount(MemorySegment segment) { return VkSetDescriptorBufferOffsetsInfoEXT.get_setCount(segment, 0L); }
    /// {@return `setCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int setCountAt(long index) { return VkSetDescriptorBufferOffsetsInfoEXT.get_setCount(this.segment(), index); }
    /// {@return `setCount`}
    public @CType("uint32_t") int setCount() { return VkSetDescriptorBufferOffsetsInfoEXT.get_setCount(this.segment()); }
    /// Sets `setCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_setCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_setCount.set(segment, 0L, index, value); }
    /// Sets `setCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_setCount(MemorySegment segment, @CType("uint32_t") int value) { VkSetDescriptorBufferOffsetsInfoEXT.set_setCount(segment, 0L, value); }
    /// Sets `setCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkSetDescriptorBufferOffsetsInfoEXT setCountAt(long index, @CType("uint32_t") int value) { VkSetDescriptorBufferOffsetsInfoEXT.set_setCount(this.segment(), index, value); return this; }
    /// Sets `setCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSetDescriptorBufferOffsetsInfoEXT setCount(@CType("uint32_t") int value) { VkSetDescriptorBufferOffsetsInfoEXT.set_setCount(this.segment(), value); return this; }

    /// {@return `pBufferIndices` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const uint32_t *") java.lang.foreign.MemorySegment get_pBufferIndices(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pBufferIndices.get(segment, 0L, index); }
    /// {@return `pBufferIndices`}
    /// @param segment the segment of the struct
    public static @CType("const uint32_t *") java.lang.foreign.MemorySegment get_pBufferIndices(MemorySegment segment) { return VkSetDescriptorBufferOffsetsInfoEXT.get_pBufferIndices(segment, 0L); }
    /// {@return `pBufferIndices` at the given index}
    /// @param index the index
    public @CType("const uint32_t *") java.lang.foreign.MemorySegment pBufferIndicesAt(long index) { return VkSetDescriptorBufferOffsetsInfoEXT.get_pBufferIndices(this.segment(), index); }
    /// {@return `pBufferIndices`}
    public @CType("const uint32_t *") java.lang.foreign.MemorySegment pBufferIndices() { return VkSetDescriptorBufferOffsetsInfoEXT.get_pBufferIndices(this.segment()); }
    /// Sets `pBufferIndices` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pBufferIndices(MemorySegment segment, long index, @CType("const uint32_t *") java.lang.foreign.MemorySegment value) { VH_pBufferIndices.set(segment, 0L, index, value); }
    /// Sets `pBufferIndices` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pBufferIndices(MemorySegment segment, @CType("const uint32_t *") java.lang.foreign.MemorySegment value) { VkSetDescriptorBufferOffsetsInfoEXT.set_pBufferIndices(segment, 0L, value); }
    /// Sets `pBufferIndices` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkSetDescriptorBufferOffsetsInfoEXT pBufferIndicesAt(long index, @CType("const uint32_t *") java.lang.foreign.MemorySegment value) { VkSetDescriptorBufferOffsetsInfoEXT.set_pBufferIndices(this.segment(), index, value); return this; }
    /// Sets `pBufferIndices` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSetDescriptorBufferOffsetsInfoEXT pBufferIndices(@CType("const uint32_t *") java.lang.foreign.MemorySegment value) { VkSetDescriptorBufferOffsetsInfoEXT.set_pBufferIndices(this.segment(), value); return this; }

    /// {@return `pOffsets` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const VkDeviceSize *") java.lang.foreign.MemorySegment get_pOffsets(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pOffsets.get(segment, 0L, index); }
    /// {@return `pOffsets`}
    /// @param segment the segment of the struct
    public static @CType("const VkDeviceSize *") java.lang.foreign.MemorySegment get_pOffsets(MemorySegment segment) { return VkSetDescriptorBufferOffsetsInfoEXT.get_pOffsets(segment, 0L); }
    /// {@return `pOffsets` at the given index}
    /// @param index the index
    public @CType("const VkDeviceSize *") java.lang.foreign.MemorySegment pOffsetsAt(long index) { return VkSetDescriptorBufferOffsetsInfoEXT.get_pOffsets(this.segment(), index); }
    /// {@return `pOffsets`}
    public @CType("const VkDeviceSize *") java.lang.foreign.MemorySegment pOffsets() { return VkSetDescriptorBufferOffsetsInfoEXT.get_pOffsets(this.segment()); }
    /// Sets `pOffsets` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pOffsets(MemorySegment segment, long index, @CType("const VkDeviceSize *") java.lang.foreign.MemorySegment value) { VH_pOffsets.set(segment, 0L, index, value); }
    /// Sets `pOffsets` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pOffsets(MemorySegment segment, @CType("const VkDeviceSize *") java.lang.foreign.MemorySegment value) { VkSetDescriptorBufferOffsetsInfoEXT.set_pOffsets(segment, 0L, value); }
    /// Sets `pOffsets` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkSetDescriptorBufferOffsetsInfoEXT pOffsetsAt(long index, @CType("const VkDeviceSize *") java.lang.foreign.MemorySegment value) { VkSetDescriptorBufferOffsetsInfoEXT.set_pOffsets(this.segment(), index, value); return this; }
    /// Sets `pOffsets` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSetDescriptorBufferOffsetsInfoEXT pOffsets(@CType("const VkDeviceSize *") java.lang.foreign.MemorySegment value) { VkSetDescriptorBufferOffsetsInfoEXT.set_pOffsets(this.segment(), value); return this; }

}
