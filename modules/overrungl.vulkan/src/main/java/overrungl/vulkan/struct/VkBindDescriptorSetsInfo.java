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
/// ### stageFlags
/// [VarHandle][#VH_stageFlags] - [Getter][#stageFlags()] - [Setter][#stageFlags(int)]
/// ### layout
/// [VarHandle][#VH_layout] - [Getter][#layout()] - [Setter][#layout(java.lang.foreign.MemorySegment)]
/// ### firstSet
/// [VarHandle][#VH_firstSet] - [Getter][#firstSet()] - [Setter][#firstSet(int)]
/// ### descriptorSetCount
/// [VarHandle][#VH_descriptorSetCount] - [Getter][#descriptorSetCount()] - [Setter][#descriptorSetCount(int)]
/// ### pDescriptorSets
/// [VarHandle][#VH_pDescriptorSets] - [Getter][#pDescriptorSets()] - [Setter][#pDescriptorSets(java.lang.foreign.MemorySegment)]
/// ### dynamicOffsetCount
/// [VarHandle][#VH_dynamicOffsetCount] - [Getter][#dynamicOffsetCount()] - [Setter][#dynamicOffsetCount(int)]
/// ### pDynamicOffsets
/// [VarHandle][#VH_pDynamicOffsets] - [Getter][#pDynamicOffsets()] - [Setter][#pDynamicOffsets(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkBindDescriptorSetsInfo {
///     VkStructureType sType;
///     const void * pNext;
///     VkShaderStageFlags stageFlags;
///     VkPipelineLayout layout;
///     uint32_t firstSet;
///     uint32_t descriptorSetCount;
///     const VkDescriptorSet * pDescriptorSets;
///     uint32_t dynamicOffsetCount;
///     const uint32_t * pDynamicOffsets;
/// } VkBindDescriptorSetsInfo;
/// ```
public sealed class VkBindDescriptorSetsInfo extends Struct {
    /// The struct layout of `VkBindDescriptorSetsInfo`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("stageFlags"),
        ValueLayout.ADDRESS.withName("layout"),
        ValueLayout.JAVA_INT.withName("firstSet"),
        ValueLayout.JAVA_INT.withName("descriptorSetCount"),
        ValueLayout.ADDRESS.withName("pDescriptorSets"),
        ValueLayout.JAVA_INT.withName("dynamicOffsetCount"),
        ValueLayout.ADDRESS.withName("pDynamicOffsets")
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
    /// The [VarHandle] of `descriptorSetCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_descriptorSetCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("descriptorSetCount"));
    /// The [VarHandle] of `pDescriptorSets` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pDescriptorSets = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pDescriptorSets"));
    /// The [VarHandle] of `dynamicOffsetCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_dynamicOffsetCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dynamicOffsetCount"));
    /// The [VarHandle] of `pDynamicOffsets` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pDynamicOffsets = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pDynamicOffsets"));

    /// Creates `VkBindDescriptorSetsInfo` with the given segment.
    /// @param segment the memory segment
    public VkBindDescriptorSetsInfo(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkBindDescriptorSetsInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkBindDescriptorSetsInfo of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkBindDescriptorSetsInfo(segment); }

    /// Creates `VkBindDescriptorSetsInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkBindDescriptorSetsInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkBindDescriptorSetsInfo ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkBindDescriptorSetsInfo(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkBindDescriptorSetsInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkBindDescriptorSetsInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkBindDescriptorSetsInfo`
    public static VkBindDescriptorSetsInfo alloc(SegmentAllocator allocator) { return new VkBindDescriptorSetsInfo(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkBindDescriptorSetsInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkBindDescriptorSetsInfo`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkBindDescriptorSetsInfo` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkBindDescriptorSetsInfo`
    public static VkBindDescriptorSetsInfo allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("const void *") java.lang.foreign.MemorySegment pNext, @CType("VkShaderStageFlags") int stageFlags, @CType("VkPipelineLayout") java.lang.foreign.MemorySegment layout, @CType("uint32_t") int firstSet, @CType("uint32_t") int descriptorSetCount, @CType("const VkDescriptorSet *") java.lang.foreign.MemorySegment pDescriptorSets, @CType("uint32_t") int dynamicOffsetCount, @CType("const uint32_t *") java.lang.foreign.MemorySegment pDynamicOffsets) { return alloc(allocator).sType(sType).pNext(pNext).stageFlags(stageFlags).layout(layout).firstSet(firstSet).descriptorSetCount(descriptorSetCount).pDescriptorSets(pDescriptorSets).dynamicOffsetCount(dynamicOffsetCount).pDynamicOffsets(pDynamicOffsets); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkBindDescriptorSetsInfo copyFrom(VkBindDescriptorSetsInfo src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkBindDescriptorSetsInfo.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkBindDescriptorSetsInfo.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkBindDescriptorSetsInfo.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBindDescriptorSetsInfo sType(@CType("VkStructureType") int value) { VkBindDescriptorSetsInfo.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkBindDescriptorSetsInfo.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkBindDescriptorSetsInfo.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkBindDescriptorSetsInfo.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBindDescriptorSetsInfo pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkBindDescriptorSetsInfo.set_pNext(this.segment(), value); return this; }

    /// {@return `stageFlags` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkShaderStageFlags") int get_stageFlags(MemorySegment segment, long index) { return (int) VH_stageFlags.get(segment, 0L, index); }
    /// {@return `stageFlags`}
    /// @param segment the segment of the struct
    public static @CType("VkShaderStageFlags") int get_stageFlags(MemorySegment segment) { return VkBindDescriptorSetsInfo.get_stageFlags(segment, 0L); }
    /// {@return `stageFlags`}
    public @CType("VkShaderStageFlags") int stageFlags() { return VkBindDescriptorSetsInfo.get_stageFlags(this.segment()); }
    /// Sets `stageFlags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_stageFlags(MemorySegment segment, long index, @CType("VkShaderStageFlags") int value) { VH_stageFlags.set(segment, 0L, index, value); }
    /// Sets `stageFlags` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_stageFlags(MemorySegment segment, @CType("VkShaderStageFlags") int value) { VkBindDescriptorSetsInfo.set_stageFlags(segment, 0L, value); }
    /// Sets `stageFlags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBindDescriptorSetsInfo stageFlags(@CType("VkShaderStageFlags") int value) { VkBindDescriptorSetsInfo.set_stageFlags(this.segment(), value); return this; }

    /// {@return `layout` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkPipelineLayout") java.lang.foreign.MemorySegment get_layout(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_layout.get(segment, 0L, index); }
    /// {@return `layout`}
    /// @param segment the segment of the struct
    public static @CType("VkPipelineLayout") java.lang.foreign.MemorySegment get_layout(MemorySegment segment) { return VkBindDescriptorSetsInfo.get_layout(segment, 0L); }
    /// {@return `layout`}
    public @CType("VkPipelineLayout") java.lang.foreign.MemorySegment layout() { return VkBindDescriptorSetsInfo.get_layout(this.segment()); }
    /// Sets `layout` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_layout(MemorySegment segment, long index, @CType("VkPipelineLayout") java.lang.foreign.MemorySegment value) { VH_layout.set(segment, 0L, index, value); }
    /// Sets `layout` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_layout(MemorySegment segment, @CType("VkPipelineLayout") java.lang.foreign.MemorySegment value) { VkBindDescriptorSetsInfo.set_layout(segment, 0L, value); }
    /// Sets `layout` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBindDescriptorSetsInfo layout(@CType("VkPipelineLayout") java.lang.foreign.MemorySegment value) { VkBindDescriptorSetsInfo.set_layout(this.segment(), value); return this; }

    /// {@return `firstSet` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_firstSet(MemorySegment segment, long index) { return (int) VH_firstSet.get(segment, 0L, index); }
    /// {@return `firstSet`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_firstSet(MemorySegment segment) { return VkBindDescriptorSetsInfo.get_firstSet(segment, 0L); }
    /// {@return `firstSet`}
    public @CType("uint32_t") int firstSet() { return VkBindDescriptorSetsInfo.get_firstSet(this.segment()); }
    /// Sets `firstSet` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_firstSet(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_firstSet.set(segment, 0L, index, value); }
    /// Sets `firstSet` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_firstSet(MemorySegment segment, @CType("uint32_t") int value) { VkBindDescriptorSetsInfo.set_firstSet(segment, 0L, value); }
    /// Sets `firstSet` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBindDescriptorSetsInfo firstSet(@CType("uint32_t") int value) { VkBindDescriptorSetsInfo.set_firstSet(this.segment(), value); return this; }

    /// {@return `descriptorSetCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_descriptorSetCount(MemorySegment segment, long index) { return (int) VH_descriptorSetCount.get(segment, 0L, index); }
    /// {@return `descriptorSetCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_descriptorSetCount(MemorySegment segment) { return VkBindDescriptorSetsInfo.get_descriptorSetCount(segment, 0L); }
    /// {@return `descriptorSetCount`}
    public @CType("uint32_t") int descriptorSetCount() { return VkBindDescriptorSetsInfo.get_descriptorSetCount(this.segment()); }
    /// Sets `descriptorSetCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_descriptorSetCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_descriptorSetCount.set(segment, 0L, index, value); }
    /// Sets `descriptorSetCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_descriptorSetCount(MemorySegment segment, @CType("uint32_t") int value) { VkBindDescriptorSetsInfo.set_descriptorSetCount(segment, 0L, value); }
    /// Sets `descriptorSetCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBindDescriptorSetsInfo descriptorSetCount(@CType("uint32_t") int value) { VkBindDescriptorSetsInfo.set_descriptorSetCount(this.segment(), value); return this; }

    /// {@return `pDescriptorSets` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const VkDescriptorSet *") java.lang.foreign.MemorySegment get_pDescriptorSets(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pDescriptorSets.get(segment, 0L, index); }
    /// {@return `pDescriptorSets`}
    /// @param segment the segment of the struct
    public static @CType("const VkDescriptorSet *") java.lang.foreign.MemorySegment get_pDescriptorSets(MemorySegment segment) { return VkBindDescriptorSetsInfo.get_pDescriptorSets(segment, 0L); }
    /// {@return `pDescriptorSets`}
    public @CType("const VkDescriptorSet *") java.lang.foreign.MemorySegment pDescriptorSets() { return VkBindDescriptorSetsInfo.get_pDescriptorSets(this.segment()); }
    /// Sets `pDescriptorSets` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pDescriptorSets(MemorySegment segment, long index, @CType("const VkDescriptorSet *") java.lang.foreign.MemorySegment value) { VH_pDescriptorSets.set(segment, 0L, index, value); }
    /// Sets `pDescriptorSets` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pDescriptorSets(MemorySegment segment, @CType("const VkDescriptorSet *") java.lang.foreign.MemorySegment value) { VkBindDescriptorSetsInfo.set_pDescriptorSets(segment, 0L, value); }
    /// Sets `pDescriptorSets` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBindDescriptorSetsInfo pDescriptorSets(@CType("const VkDescriptorSet *") java.lang.foreign.MemorySegment value) { VkBindDescriptorSetsInfo.set_pDescriptorSets(this.segment(), value); return this; }

    /// {@return `dynamicOffsetCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_dynamicOffsetCount(MemorySegment segment, long index) { return (int) VH_dynamicOffsetCount.get(segment, 0L, index); }
    /// {@return `dynamicOffsetCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_dynamicOffsetCount(MemorySegment segment) { return VkBindDescriptorSetsInfo.get_dynamicOffsetCount(segment, 0L); }
    /// {@return `dynamicOffsetCount`}
    public @CType("uint32_t") int dynamicOffsetCount() { return VkBindDescriptorSetsInfo.get_dynamicOffsetCount(this.segment()); }
    /// Sets `dynamicOffsetCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_dynamicOffsetCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_dynamicOffsetCount.set(segment, 0L, index, value); }
    /// Sets `dynamicOffsetCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_dynamicOffsetCount(MemorySegment segment, @CType("uint32_t") int value) { VkBindDescriptorSetsInfo.set_dynamicOffsetCount(segment, 0L, value); }
    /// Sets `dynamicOffsetCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBindDescriptorSetsInfo dynamicOffsetCount(@CType("uint32_t") int value) { VkBindDescriptorSetsInfo.set_dynamicOffsetCount(this.segment(), value); return this; }

    /// {@return `pDynamicOffsets` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const uint32_t *") java.lang.foreign.MemorySegment get_pDynamicOffsets(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pDynamicOffsets.get(segment, 0L, index); }
    /// {@return `pDynamicOffsets`}
    /// @param segment the segment of the struct
    public static @CType("const uint32_t *") java.lang.foreign.MemorySegment get_pDynamicOffsets(MemorySegment segment) { return VkBindDescriptorSetsInfo.get_pDynamicOffsets(segment, 0L); }
    /// {@return `pDynamicOffsets`}
    public @CType("const uint32_t *") java.lang.foreign.MemorySegment pDynamicOffsets() { return VkBindDescriptorSetsInfo.get_pDynamicOffsets(this.segment()); }
    /// Sets `pDynamicOffsets` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pDynamicOffsets(MemorySegment segment, long index, @CType("const uint32_t *") java.lang.foreign.MemorySegment value) { VH_pDynamicOffsets.set(segment, 0L, index, value); }
    /// Sets `pDynamicOffsets` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pDynamicOffsets(MemorySegment segment, @CType("const uint32_t *") java.lang.foreign.MemorySegment value) { VkBindDescriptorSetsInfo.set_pDynamicOffsets(segment, 0L, value); }
    /// Sets `pDynamicOffsets` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBindDescriptorSetsInfo pDynamicOffsets(@CType("const uint32_t *") java.lang.foreign.MemorySegment value) { VkBindDescriptorSetsInfo.set_pDynamicOffsets(this.segment(), value); return this; }

    /// A buffer of [VkBindDescriptorSetsInfo].
    public static final class Buffer extends VkBindDescriptorSetsInfo {
        private final long elementCount;

        /// Creates `VkBindDescriptorSetsInfo.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkBindDescriptorSetsInfo`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkBindDescriptorSetsInfo`
        public VkBindDescriptorSetsInfo asSlice(long index) { return new VkBindDescriptorSetsInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkBindDescriptorSetsInfo`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkBindDescriptorSetsInfo`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkBindDescriptorSetsInfo.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkBindDescriptorSetsInfo.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkBindDescriptorSetsInfo.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkBindDescriptorSetsInfo.set_pNext(this.segment(), index, value); return this; }

        /// {@return `stageFlags` at the given index}
        /// @param index the index
        public @CType("VkShaderStageFlags") int stageFlagsAt(long index) { return VkBindDescriptorSetsInfo.get_stageFlags(this.segment(), index); }
        /// Sets `stageFlags` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer stageFlagsAt(long index, @CType("VkShaderStageFlags") int value) { VkBindDescriptorSetsInfo.set_stageFlags(this.segment(), index, value); return this; }

        /// {@return `layout` at the given index}
        /// @param index the index
        public @CType("VkPipelineLayout") java.lang.foreign.MemorySegment layoutAt(long index) { return VkBindDescriptorSetsInfo.get_layout(this.segment(), index); }
        /// Sets `layout` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer layoutAt(long index, @CType("VkPipelineLayout") java.lang.foreign.MemorySegment value) { VkBindDescriptorSetsInfo.set_layout(this.segment(), index, value); return this; }

        /// {@return `firstSet` at the given index}
        /// @param index the index
        public @CType("uint32_t") int firstSetAt(long index) { return VkBindDescriptorSetsInfo.get_firstSet(this.segment(), index); }
        /// Sets `firstSet` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer firstSetAt(long index, @CType("uint32_t") int value) { VkBindDescriptorSetsInfo.set_firstSet(this.segment(), index, value); return this; }

        /// {@return `descriptorSetCount` at the given index}
        /// @param index the index
        public @CType("uint32_t") int descriptorSetCountAt(long index) { return VkBindDescriptorSetsInfo.get_descriptorSetCount(this.segment(), index); }
        /// Sets `descriptorSetCount` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer descriptorSetCountAt(long index, @CType("uint32_t") int value) { VkBindDescriptorSetsInfo.set_descriptorSetCount(this.segment(), index, value); return this; }

        /// {@return `pDescriptorSets` at the given index}
        /// @param index the index
        public @CType("const VkDescriptorSet *") java.lang.foreign.MemorySegment pDescriptorSetsAt(long index) { return VkBindDescriptorSetsInfo.get_pDescriptorSets(this.segment(), index); }
        /// Sets `pDescriptorSets` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pDescriptorSetsAt(long index, @CType("const VkDescriptorSet *") java.lang.foreign.MemorySegment value) { VkBindDescriptorSetsInfo.set_pDescriptorSets(this.segment(), index, value); return this; }

        /// {@return `dynamicOffsetCount` at the given index}
        /// @param index the index
        public @CType("uint32_t") int dynamicOffsetCountAt(long index) { return VkBindDescriptorSetsInfo.get_dynamicOffsetCount(this.segment(), index); }
        /// Sets `dynamicOffsetCount` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer dynamicOffsetCountAt(long index, @CType("uint32_t") int value) { VkBindDescriptorSetsInfo.set_dynamicOffsetCount(this.segment(), index, value); return this; }

        /// {@return `pDynamicOffsets` at the given index}
        /// @param index the index
        public @CType("const uint32_t *") java.lang.foreign.MemorySegment pDynamicOffsetsAt(long index) { return VkBindDescriptorSetsInfo.get_pDynamicOffsets(this.segment(), index); }
        /// Sets `pDynamicOffsets` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pDynamicOffsetsAt(long index, @CType("const uint32_t *") java.lang.foreign.MemorySegment value) { VkBindDescriptorSetsInfo.set_pDynamicOffsets(this.segment(), index, value); return this; }

    }
}
