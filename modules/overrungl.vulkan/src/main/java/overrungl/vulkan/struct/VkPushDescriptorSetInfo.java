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
/// ### set
/// [VarHandle][#VH_set] - [Getter][#set()] - [Setter][#set(int)]
/// ### descriptorWriteCount
/// [VarHandle][#VH_descriptorWriteCount] - [Getter][#descriptorWriteCount()] - [Setter][#descriptorWriteCount(int)]
/// ### pDescriptorWrites
/// [VarHandle][#VH_pDescriptorWrites] - [Getter][#pDescriptorWrites()] - [Setter][#pDescriptorWrites(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPushDescriptorSetInfo {
///     VkStructureType sType;
///     const void * pNext;
///     VkShaderStageFlags stageFlags;
///     VkPipelineLayout layout;
///     uint32_t set;
///     uint32_t descriptorWriteCount;
///     const VkWriteDescriptorSet * pDescriptorWrites;
/// } VkPushDescriptorSetInfo;
/// ```
public final class VkPushDescriptorSetInfo extends Struct {
    /// The struct layout of `VkPushDescriptorSetInfo`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("stageFlags"),
        ValueLayout.ADDRESS.withName("layout"),
        ValueLayout.JAVA_INT.withName("set"),
        ValueLayout.JAVA_INT.withName("descriptorWriteCount"),
        ValueLayout.ADDRESS.withName("pDescriptorWrites")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `stageFlags` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_stageFlags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("stageFlags"));
    /// The [VarHandle] of `layout` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_layout = LAYOUT.arrayElementVarHandle(PathElement.groupElement("layout"));
    /// The [VarHandle] of `set` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_set = LAYOUT.arrayElementVarHandle(PathElement.groupElement("set"));
    /// The [VarHandle] of `descriptorWriteCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_descriptorWriteCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("descriptorWriteCount"));
    /// The [VarHandle] of `pDescriptorWrites` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pDescriptorWrites = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pDescriptorWrites"));

    /// Creates `VkPushDescriptorSetInfo` with the given segment.
    /// @param segment the memory segment
    public VkPushDescriptorSetInfo(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPushDescriptorSetInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPushDescriptorSetInfo of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPushDescriptorSetInfo(segment); }

    /// Creates `VkPushDescriptorSetInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPushDescriptorSetInfo ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPushDescriptorSetInfo(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPushDescriptorSetInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPushDescriptorSetInfo ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkPushDescriptorSetInfo(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkPushDescriptorSetInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPushDescriptorSetInfo`
    public static VkPushDescriptorSetInfo alloc(SegmentAllocator allocator) { return new VkPushDescriptorSetInfo(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPushDescriptorSetInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPushDescriptorSetInfo`
    public static VkPushDescriptorSetInfo alloc(SegmentAllocator allocator, long count) { return new VkPushDescriptorSetInfo(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `VkPushDescriptorSetInfo`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPushDescriptorSetInfo`
    public VkPushDescriptorSetInfo asSlice(long index) { return new VkPushDescriptorSetInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `VkPushDescriptorSetInfo`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPushDescriptorSetInfo`
    public VkPushDescriptorSetInfo asSlice(long index, long count) { return new VkPushDescriptorSetInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPushDescriptorSetInfo.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkPushDescriptorSetInfo.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPushDescriptorSetInfo.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPushDescriptorSetInfo.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPushDescriptorSetInfo sTypeAt(long index, @CType("VkStructureType") int value) { VkPushDescriptorSetInfo.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPushDescriptorSetInfo sType(@CType("VkStructureType") int value) { VkPushDescriptorSetInfo.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkPushDescriptorSetInfo.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkPushDescriptorSetInfo.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkPushDescriptorSetInfo.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkPushDescriptorSetInfo.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPushDescriptorSetInfo pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkPushDescriptorSetInfo.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPushDescriptorSetInfo pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkPushDescriptorSetInfo.set_pNext(this.segment(), value); return this; }

    /// {@return `stageFlags` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkShaderStageFlags") int get_stageFlags(MemorySegment segment, long index) { return (int) VH_stageFlags.get(segment, 0L, index); }
    /// {@return `stageFlags`}
    /// @param segment the segment of the struct
    public static @CType("VkShaderStageFlags") int get_stageFlags(MemorySegment segment) { return VkPushDescriptorSetInfo.get_stageFlags(segment, 0L); }
    /// {@return `stageFlags` at the given index}
    /// @param index the index
    public @CType("VkShaderStageFlags") int stageFlagsAt(long index) { return VkPushDescriptorSetInfo.get_stageFlags(this.segment(), index); }
    /// {@return `stageFlags`}
    public @CType("VkShaderStageFlags") int stageFlags() { return VkPushDescriptorSetInfo.get_stageFlags(this.segment()); }
    /// Sets `stageFlags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_stageFlags(MemorySegment segment, long index, @CType("VkShaderStageFlags") int value) { VH_stageFlags.set(segment, 0L, index, value); }
    /// Sets `stageFlags` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_stageFlags(MemorySegment segment, @CType("VkShaderStageFlags") int value) { VkPushDescriptorSetInfo.set_stageFlags(segment, 0L, value); }
    /// Sets `stageFlags` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPushDescriptorSetInfo stageFlagsAt(long index, @CType("VkShaderStageFlags") int value) { VkPushDescriptorSetInfo.set_stageFlags(this.segment(), index, value); return this; }
    /// Sets `stageFlags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPushDescriptorSetInfo stageFlags(@CType("VkShaderStageFlags") int value) { VkPushDescriptorSetInfo.set_stageFlags(this.segment(), value); return this; }

    /// {@return `layout` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkPipelineLayout") java.lang.foreign.MemorySegment get_layout(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_layout.get(segment, 0L, index); }
    /// {@return `layout`}
    /// @param segment the segment of the struct
    public static @CType("VkPipelineLayout") java.lang.foreign.MemorySegment get_layout(MemorySegment segment) { return VkPushDescriptorSetInfo.get_layout(segment, 0L); }
    /// {@return `layout` at the given index}
    /// @param index the index
    public @CType("VkPipelineLayout") java.lang.foreign.MemorySegment layoutAt(long index) { return VkPushDescriptorSetInfo.get_layout(this.segment(), index); }
    /// {@return `layout`}
    public @CType("VkPipelineLayout") java.lang.foreign.MemorySegment layout() { return VkPushDescriptorSetInfo.get_layout(this.segment()); }
    /// Sets `layout` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_layout(MemorySegment segment, long index, @CType("VkPipelineLayout") java.lang.foreign.MemorySegment value) { VH_layout.set(segment, 0L, index, value); }
    /// Sets `layout` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_layout(MemorySegment segment, @CType("VkPipelineLayout") java.lang.foreign.MemorySegment value) { VkPushDescriptorSetInfo.set_layout(segment, 0L, value); }
    /// Sets `layout` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPushDescriptorSetInfo layoutAt(long index, @CType("VkPipelineLayout") java.lang.foreign.MemorySegment value) { VkPushDescriptorSetInfo.set_layout(this.segment(), index, value); return this; }
    /// Sets `layout` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPushDescriptorSetInfo layout(@CType("VkPipelineLayout") java.lang.foreign.MemorySegment value) { VkPushDescriptorSetInfo.set_layout(this.segment(), value); return this; }

    /// {@return `set` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_set(MemorySegment segment, long index) { return (int) VH_set.get(segment, 0L, index); }
    /// {@return `set`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_set(MemorySegment segment) { return VkPushDescriptorSetInfo.get_set(segment, 0L); }
    /// {@return `set` at the given index}
    /// @param index the index
    public @CType("uint32_t") int setAt(long index) { return VkPushDescriptorSetInfo.get_set(this.segment(), index); }
    /// {@return `set`}
    public @CType("uint32_t") int set() { return VkPushDescriptorSetInfo.get_set(this.segment()); }
    /// Sets `set` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_set(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_set.set(segment, 0L, index, value); }
    /// Sets `set` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_set(MemorySegment segment, @CType("uint32_t") int value) { VkPushDescriptorSetInfo.set_set(segment, 0L, value); }
    /// Sets `set` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPushDescriptorSetInfo setAt(long index, @CType("uint32_t") int value) { VkPushDescriptorSetInfo.set_set(this.segment(), index, value); return this; }
    /// Sets `set` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPushDescriptorSetInfo set(@CType("uint32_t") int value) { VkPushDescriptorSetInfo.set_set(this.segment(), value); return this; }

    /// {@return `descriptorWriteCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_descriptorWriteCount(MemorySegment segment, long index) { return (int) VH_descriptorWriteCount.get(segment, 0L, index); }
    /// {@return `descriptorWriteCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_descriptorWriteCount(MemorySegment segment) { return VkPushDescriptorSetInfo.get_descriptorWriteCount(segment, 0L); }
    /// {@return `descriptorWriteCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int descriptorWriteCountAt(long index) { return VkPushDescriptorSetInfo.get_descriptorWriteCount(this.segment(), index); }
    /// {@return `descriptorWriteCount`}
    public @CType("uint32_t") int descriptorWriteCount() { return VkPushDescriptorSetInfo.get_descriptorWriteCount(this.segment()); }
    /// Sets `descriptorWriteCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_descriptorWriteCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_descriptorWriteCount.set(segment, 0L, index, value); }
    /// Sets `descriptorWriteCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_descriptorWriteCount(MemorySegment segment, @CType("uint32_t") int value) { VkPushDescriptorSetInfo.set_descriptorWriteCount(segment, 0L, value); }
    /// Sets `descriptorWriteCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPushDescriptorSetInfo descriptorWriteCountAt(long index, @CType("uint32_t") int value) { VkPushDescriptorSetInfo.set_descriptorWriteCount(this.segment(), index, value); return this; }
    /// Sets `descriptorWriteCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPushDescriptorSetInfo descriptorWriteCount(@CType("uint32_t") int value) { VkPushDescriptorSetInfo.set_descriptorWriteCount(this.segment(), value); return this; }

    /// {@return `pDescriptorWrites` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const VkWriteDescriptorSet *") java.lang.foreign.MemorySegment get_pDescriptorWrites(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pDescriptorWrites.get(segment, 0L, index); }
    /// {@return `pDescriptorWrites`}
    /// @param segment the segment of the struct
    public static @CType("const VkWriteDescriptorSet *") java.lang.foreign.MemorySegment get_pDescriptorWrites(MemorySegment segment) { return VkPushDescriptorSetInfo.get_pDescriptorWrites(segment, 0L); }
    /// {@return `pDescriptorWrites` at the given index}
    /// @param index the index
    public @CType("const VkWriteDescriptorSet *") java.lang.foreign.MemorySegment pDescriptorWritesAt(long index) { return VkPushDescriptorSetInfo.get_pDescriptorWrites(this.segment(), index); }
    /// {@return `pDescriptorWrites`}
    public @CType("const VkWriteDescriptorSet *") java.lang.foreign.MemorySegment pDescriptorWrites() { return VkPushDescriptorSetInfo.get_pDescriptorWrites(this.segment()); }
    /// Sets `pDescriptorWrites` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pDescriptorWrites(MemorySegment segment, long index, @CType("const VkWriteDescriptorSet *") java.lang.foreign.MemorySegment value) { VH_pDescriptorWrites.set(segment, 0L, index, value); }
    /// Sets `pDescriptorWrites` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pDescriptorWrites(MemorySegment segment, @CType("const VkWriteDescriptorSet *") java.lang.foreign.MemorySegment value) { VkPushDescriptorSetInfo.set_pDescriptorWrites(segment, 0L, value); }
    /// Sets `pDescriptorWrites` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPushDescriptorSetInfo pDescriptorWritesAt(long index, @CType("const VkWriteDescriptorSet *") java.lang.foreign.MemorySegment value) { VkPushDescriptorSetInfo.set_pDescriptorWrites(this.segment(), index, value); return this; }
    /// Sets `pDescriptorWrites` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPushDescriptorSetInfo pDescriptorWrites(@CType("const VkWriteDescriptorSet *") java.lang.foreign.MemorySegment value) { VkPushDescriptorSetInfo.set_pDescriptorWrites(this.segment(), value); return this; }

}
