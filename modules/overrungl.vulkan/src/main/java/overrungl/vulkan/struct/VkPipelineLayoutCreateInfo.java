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
/// ### setLayoutCount
/// [VarHandle][#VH_setLayoutCount] - [Getter][#setLayoutCount()] - [Setter][#setLayoutCount(int)]
/// ### pSetLayouts
/// [VarHandle][#VH_pSetLayouts] - [Getter][#pSetLayouts()] - [Setter][#pSetLayouts(java.lang.foreign.MemorySegment)]
/// ### pushConstantRangeCount
/// [VarHandle][#VH_pushConstantRangeCount] - [Getter][#pushConstantRangeCount()] - [Setter][#pushConstantRangeCount(int)]
/// ### pPushConstantRanges
/// [VarHandle][#VH_pPushConstantRanges] - [Getter][#pPushConstantRanges()] - [Setter][#pPushConstantRanges(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPipelineLayoutCreateInfo {
///     VkStructureType sType;
///     const void * pNext;
///     VkPipelineLayoutCreateFlags flags;
///     uint32_t setLayoutCount;
///     const VkDescriptorSetLayout * pSetLayouts;
///     uint32_t pushConstantRangeCount;
///     const VkPushConstantRange * pPushConstantRanges;
/// } VkPipelineLayoutCreateInfo;
/// ```
public final class VkPipelineLayoutCreateInfo extends Struct {
    /// The struct layout of `VkPipelineLayoutCreateInfo`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("setLayoutCount"),
        ValueLayout.ADDRESS.withName("pSetLayouts"),
        ValueLayout.JAVA_INT.withName("pushConstantRangeCount"),
        ValueLayout.ADDRESS.withName("pPushConstantRanges")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `flags` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    /// The [VarHandle] of `setLayoutCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_setLayoutCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("setLayoutCount"));
    /// The [VarHandle] of `pSetLayouts` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pSetLayouts = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pSetLayouts"));
    /// The [VarHandle] of `pushConstantRangeCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_pushConstantRangeCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pushConstantRangeCount"));
    /// The [VarHandle] of `pPushConstantRanges` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pPushConstantRanges = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pPushConstantRanges"));

    /// Creates `VkPipelineLayoutCreateInfo` with the given segment.
    /// @param segment the memory segment
    public VkPipelineLayoutCreateInfo(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPipelineLayoutCreateInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineLayoutCreateInfo of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPipelineLayoutCreateInfo(segment); }

    /// Creates `VkPipelineLayoutCreateInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineLayoutCreateInfo ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPipelineLayoutCreateInfo(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPipelineLayoutCreateInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineLayoutCreateInfo ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkPipelineLayoutCreateInfo(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkPipelineLayoutCreateInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPipelineLayoutCreateInfo`
    public static VkPipelineLayoutCreateInfo alloc(SegmentAllocator allocator) { return new VkPipelineLayoutCreateInfo(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPipelineLayoutCreateInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPipelineLayoutCreateInfo`
    public static VkPipelineLayoutCreateInfo alloc(SegmentAllocator allocator, long count) { return new VkPipelineLayoutCreateInfo(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPipelineLayoutCreateInfo.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkPipelineLayoutCreateInfo.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPipelineLayoutCreateInfo.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPipelineLayoutCreateInfo.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPipelineLayoutCreateInfo sTypeAt(long index, @CType("VkStructureType") int value) { VkPipelineLayoutCreateInfo.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineLayoutCreateInfo sType(@CType("VkStructureType") int value) { VkPipelineLayoutCreateInfo.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkPipelineLayoutCreateInfo.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkPipelineLayoutCreateInfo.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkPipelineLayoutCreateInfo.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkPipelineLayoutCreateInfo.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPipelineLayoutCreateInfo pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkPipelineLayoutCreateInfo.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineLayoutCreateInfo pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkPipelineLayoutCreateInfo.set_pNext(this.segment(), value); return this; }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkPipelineLayoutCreateFlags") int get_flags(MemorySegment segment, long index) { return (int) VH_flags.get(segment, 0L, index); }
    /// {@return `flags`}
    /// @param segment the segment of the struct
    public static @CType("VkPipelineLayoutCreateFlags") int get_flags(MemorySegment segment) { return VkPipelineLayoutCreateInfo.get_flags(segment, 0L); }
    /// {@return `flags` at the given index}
    /// @param index the index
    public @CType("VkPipelineLayoutCreateFlags") int flagsAt(long index) { return VkPipelineLayoutCreateInfo.get_flags(this.segment(), index); }
    /// {@return `flags`}
    public @CType("VkPipelineLayoutCreateFlags") int flags() { return VkPipelineLayoutCreateInfo.get_flags(this.segment()); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_flags(MemorySegment segment, long index, @CType("VkPipelineLayoutCreateFlags") int value) { VH_flags.set(segment, 0L, index, value); }
    /// Sets `flags` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_flags(MemorySegment segment, @CType("VkPipelineLayoutCreateFlags") int value) { VkPipelineLayoutCreateInfo.set_flags(segment, 0L, value); }
    /// Sets `flags` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPipelineLayoutCreateInfo flagsAt(long index, @CType("VkPipelineLayoutCreateFlags") int value) { VkPipelineLayoutCreateInfo.set_flags(this.segment(), index, value); return this; }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineLayoutCreateInfo flags(@CType("VkPipelineLayoutCreateFlags") int value) { VkPipelineLayoutCreateInfo.set_flags(this.segment(), value); return this; }

    /// {@return `setLayoutCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_setLayoutCount(MemorySegment segment, long index) { return (int) VH_setLayoutCount.get(segment, 0L, index); }
    /// {@return `setLayoutCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_setLayoutCount(MemorySegment segment) { return VkPipelineLayoutCreateInfo.get_setLayoutCount(segment, 0L); }
    /// {@return `setLayoutCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int setLayoutCountAt(long index) { return VkPipelineLayoutCreateInfo.get_setLayoutCount(this.segment(), index); }
    /// {@return `setLayoutCount`}
    public @CType("uint32_t") int setLayoutCount() { return VkPipelineLayoutCreateInfo.get_setLayoutCount(this.segment()); }
    /// Sets `setLayoutCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_setLayoutCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_setLayoutCount.set(segment, 0L, index, value); }
    /// Sets `setLayoutCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_setLayoutCount(MemorySegment segment, @CType("uint32_t") int value) { VkPipelineLayoutCreateInfo.set_setLayoutCount(segment, 0L, value); }
    /// Sets `setLayoutCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPipelineLayoutCreateInfo setLayoutCountAt(long index, @CType("uint32_t") int value) { VkPipelineLayoutCreateInfo.set_setLayoutCount(this.segment(), index, value); return this; }
    /// Sets `setLayoutCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineLayoutCreateInfo setLayoutCount(@CType("uint32_t") int value) { VkPipelineLayoutCreateInfo.set_setLayoutCount(this.segment(), value); return this; }

    /// {@return `pSetLayouts` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const VkDescriptorSetLayout *") java.lang.foreign.MemorySegment get_pSetLayouts(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pSetLayouts.get(segment, 0L, index); }
    /// {@return `pSetLayouts`}
    /// @param segment the segment of the struct
    public static @CType("const VkDescriptorSetLayout *") java.lang.foreign.MemorySegment get_pSetLayouts(MemorySegment segment) { return VkPipelineLayoutCreateInfo.get_pSetLayouts(segment, 0L); }
    /// {@return `pSetLayouts` at the given index}
    /// @param index the index
    public @CType("const VkDescriptorSetLayout *") java.lang.foreign.MemorySegment pSetLayoutsAt(long index) { return VkPipelineLayoutCreateInfo.get_pSetLayouts(this.segment(), index); }
    /// {@return `pSetLayouts`}
    public @CType("const VkDescriptorSetLayout *") java.lang.foreign.MemorySegment pSetLayouts() { return VkPipelineLayoutCreateInfo.get_pSetLayouts(this.segment()); }
    /// Sets `pSetLayouts` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pSetLayouts(MemorySegment segment, long index, @CType("const VkDescriptorSetLayout *") java.lang.foreign.MemorySegment value) { VH_pSetLayouts.set(segment, 0L, index, value); }
    /// Sets `pSetLayouts` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pSetLayouts(MemorySegment segment, @CType("const VkDescriptorSetLayout *") java.lang.foreign.MemorySegment value) { VkPipelineLayoutCreateInfo.set_pSetLayouts(segment, 0L, value); }
    /// Sets `pSetLayouts` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPipelineLayoutCreateInfo pSetLayoutsAt(long index, @CType("const VkDescriptorSetLayout *") java.lang.foreign.MemorySegment value) { VkPipelineLayoutCreateInfo.set_pSetLayouts(this.segment(), index, value); return this; }
    /// Sets `pSetLayouts` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineLayoutCreateInfo pSetLayouts(@CType("const VkDescriptorSetLayout *") java.lang.foreign.MemorySegment value) { VkPipelineLayoutCreateInfo.set_pSetLayouts(this.segment(), value); return this; }

    /// {@return `pushConstantRangeCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_pushConstantRangeCount(MemorySegment segment, long index) { return (int) VH_pushConstantRangeCount.get(segment, 0L, index); }
    /// {@return `pushConstantRangeCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_pushConstantRangeCount(MemorySegment segment) { return VkPipelineLayoutCreateInfo.get_pushConstantRangeCount(segment, 0L); }
    /// {@return `pushConstantRangeCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int pushConstantRangeCountAt(long index) { return VkPipelineLayoutCreateInfo.get_pushConstantRangeCount(this.segment(), index); }
    /// {@return `pushConstantRangeCount`}
    public @CType("uint32_t") int pushConstantRangeCount() { return VkPipelineLayoutCreateInfo.get_pushConstantRangeCount(this.segment()); }
    /// Sets `pushConstantRangeCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pushConstantRangeCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_pushConstantRangeCount.set(segment, 0L, index, value); }
    /// Sets `pushConstantRangeCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pushConstantRangeCount(MemorySegment segment, @CType("uint32_t") int value) { VkPipelineLayoutCreateInfo.set_pushConstantRangeCount(segment, 0L, value); }
    /// Sets `pushConstantRangeCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPipelineLayoutCreateInfo pushConstantRangeCountAt(long index, @CType("uint32_t") int value) { VkPipelineLayoutCreateInfo.set_pushConstantRangeCount(this.segment(), index, value); return this; }
    /// Sets `pushConstantRangeCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineLayoutCreateInfo pushConstantRangeCount(@CType("uint32_t") int value) { VkPipelineLayoutCreateInfo.set_pushConstantRangeCount(this.segment(), value); return this; }

    /// {@return `pPushConstantRanges` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const VkPushConstantRange *") java.lang.foreign.MemorySegment get_pPushConstantRanges(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pPushConstantRanges.get(segment, 0L, index); }
    /// {@return `pPushConstantRanges`}
    /// @param segment the segment of the struct
    public static @CType("const VkPushConstantRange *") java.lang.foreign.MemorySegment get_pPushConstantRanges(MemorySegment segment) { return VkPipelineLayoutCreateInfo.get_pPushConstantRanges(segment, 0L); }
    /// {@return `pPushConstantRanges` at the given index}
    /// @param index the index
    public @CType("const VkPushConstantRange *") java.lang.foreign.MemorySegment pPushConstantRangesAt(long index) { return VkPipelineLayoutCreateInfo.get_pPushConstantRanges(this.segment(), index); }
    /// {@return `pPushConstantRanges`}
    public @CType("const VkPushConstantRange *") java.lang.foreign.MemorySegment pPushConstantRanges() { return VkPipelineLayoutCreateInfo.get_pPushConstantRanges(this.segment()); }
    /// Sets `pPushConstantRanges` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pPushConstantRanges(MemorySegment segment, long index, @CType("const VkPushConstantRange *") java.lang.foreign.MemorySegment value) { VH_pPushConstantRanges.set(segment, 0L, index, value); }
    /// Sets `pPushConstantRanges` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pPushConstantRanges(MemorySegment segment, @CType("const VkPushConstantRange *") java.lang.foreign.MemorySegment value) { VkPipelineLayoutCreateInfo.set_pPushConstantRanges(segment, 0L, value); }
    /// Sets `pPushConstantRanges` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPipelineLayoutCreateInfo pPushConstantRangesAt(long index, @CType("const VkPushConstantRange *") java.lang.foreign.MemorySegment value) { VkPipelineLayoutCreateInfo.set_pPushConstantRanges(this.segment(), index, value); return this; }
    /// Sets `pPushConstantRanges` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineLayoutCreateInfo pPushConstantRanges(@CType("const VkPushConstantRange *") java.lang.foreign.MemorySegment value) { VkPipelineLayoutCreateInfo.set_pPushConstantRanges(this.segment(), value); return this; }

}
