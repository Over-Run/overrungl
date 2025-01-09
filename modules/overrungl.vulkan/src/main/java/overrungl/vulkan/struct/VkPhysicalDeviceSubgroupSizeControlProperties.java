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
/// ### minSubgroupSize
/// [VarHandle][#VH_minSubgroupSize] - [Getter][#minSubgroupSize()] - [Setter][#minSubgroupSize(int)]
/// ### maxSubgroupSize
/// [VarHandle][#VH_maxSubgroupSize] - [Getter][#maxSubgroupSize()] - [Setter][#maxSubgroupSize(int)]
/// ### maxComputeWorkgroupSubgroups
/// [VarHandle][#VH_maxComputeWorkgroupSubgroups] - [Getter][#maxComputeWorkgroupSubgroups()] - [Setter][#maxComputeWorkgroupSubgroups(int)]
/// ### requiredSubgroupSizeStages
/// [VarHandle][#VH_requiredSubgroupSizeStages] - [Getter][#requiredSubgroupSizeStages()] - [Setter][#requiredSubgroupSizeStages(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPhysicalDeviceSubgroupSizeControlProperties {
///     VkStructureType sType;
///     void * pNext;
///     uint32_t minSubgroupSize;
///     uint32_t maxSubgroupSize;
///     uint32_t maxComputeWorkgroupSubgroups;
///     VkShaderStageFlags requiredSubgroupSizeStages;
/// } VkPhysicalDeviceSubgroupSizeControlProperties;
/// ```
public final class VkPhysicalDeviceSubgroupSizeControlProperties extends Struct {
    /// The struct layout of `VkPhysicalDeviceSubgroupSizeControlProperties`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("minSubgroupSize"),
        ValueLayout.JAVA_INT.withName("maxSubgroupSize"),
        ValueLayout.JAVA_INT.withName("maxComputeWorkgroupSubgroups"),
        ValueLayout.JAVA_INT.withName("requiredSubgroupSizeStages")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `minSubgroupSize` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_minSubgroupSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("minSubgroupSize"));
    /// The [VarHandle] of `maxSubgroupSize` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxSubgroupSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxSubgroupSize"));
    /// The [VarHandle] of `maxComputeWorkgroupSubgroups` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxComputeWorkgroupSubgroups = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxComputeWorkgroupSubgroups"));
    /// The [VarHandle] of `requiredSubgroupSizeStages` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_requiredSubgroupSizeStages = LAYOUT.arrayElementVarHandle(PathElement.groupElement("requiredSubgroupSizeStages"));

    /// Creates `VkPhysicalDeviceSubgroupSizeControlProperties` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceSubgroupSizeControlProperties(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceSubgroupSizeControlProperties` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceSubgroupSizeControlProperties of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceSubgroupSizeControlProperties(segment); }

    /// Creates `VkPhysicalDeviceSubgroupSizeControlProperties` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceSubgroupSizeControlProperties ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceSubgroupSizeControlProperties(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDeviceSubgroupSizeControlProperties` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceSubgroupSizeControlProperties ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceSubgroupSizeControlProperties(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkPhysicalDeviceSubgroupSizeControlProperties` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceSubgroupSizeControlProperties`
    public static VkPhysicalDeviceSubgroupSizeControlProperties alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceSubgroupSizeControlProperties(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceSubgroupSizeControlProperties` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceSubgroupSizeControlProperties`
    public static VkPhysicalDeviceSubgroupSizeControlProperties alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceSubgroupSizeControlProperties(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPhysicalDeviceSubgroupSizeControlProperties.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkPhysicalDeviceSubgroupSizeControlProperties.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPhysicalDeviceSubgroupSizeControlProperties.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPhysicalDeviceSubgroupSizeControlProperties.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceSubgroupSizeControlProperties sTypeAt(long index, @CType("VkStructureType") int value) { VkPhysicalDeviceSubgroupSizeControlProperties.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceSubgroupSizeControlProperties sType(@CType("VkStructureType") int value) { VkPhysicalDeviceSubgroupSizeControlProperties.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkPhysicalDeviceSubgroupSizeControlProperties.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkPhysicalDeviceSubgroupSizeControlProperties.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkPhysicalDeviceSubgroupSizeControlProperties.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceSubgroupSizeControlProperties.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceSubgroupSizeControlProperties pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceSubgroupSizeControlProperties.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceSubgroupSizeControlProperties pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceSubgroupSizeControlProperties.set_pNext(this.segment(), value); return this; }

    /// {@return `minSubgroupSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_minSubgroupSize(MemorySegment segment, long index) { return (int) VH_minSubgroupSize.get(segment, 0L, index); }
    /// {@return `minSubgroupSize`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_minSubgroupSize(MemorySegment segment) { return VkPhysicalDeviceSubgroupSizeControlProperties.get_minSubgroupSize(segment, 0L); }
    /// {@return `minSubgroupSize` at the given index}
    /// @param index the index
    public @CType("uint32_t") int minSubgroupSizeAt(long index) { return VkPhysicalDeviceSubgroupSizeControlProperties.get_minSubgroupSize(this.segment(), index); }
    /// {@return `minSubgroupSize`}
    public @CType("uint32_t") int minSubgroupSize() { return VkPhysicalDeviceSubgroupSizeControlProperties.get_minSubgroupSize(this.segment()); }
    /// Sets `minSubgroupSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_minSubgroupSize(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_minSubgroupSize.set(segment, 0L, index, value); }
    /// Sets `minSubgroupSize` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_minSubgroupSize(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceSubgroupSizeControlProperties.set_minSubgroupSize(segment, 0L, value); }
    /// Sets `minSubgroupSize` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceSubgroupSizeControlProperties minSubgroupSizeAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceSubgroupSizeControlProperties.set_minSubgroupSize(this.segment(), index, value); return this; }
    /// Sets `minSubgroupSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceSubgroupSizeControlProperties minSubgroupSize(@CType("uint32_t") int value) { VkPhysicalDeviceSubgroupSizeControlProperties.set_minSubgroupSize(this.segment(), value); return this; }

    /// {@return `maxSubgroupSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxSubgroupSize(MemorySegment segment, long index) { return (int) VH_maxSubgroupSize.get(segment, 0L, index); }
    /// {@return `maxSubgroupSize`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxSubgroupSize(MemorySegment segment) { return VkPhysicalDeviceSubgroupSizeControlProperties.get_maxSubgroupSize(segment, 0L); }
    /// {@return `maxSubgroupSize` at the given index}
    /// @param index the index
    public @CType("uint32_t") int maxSubgroupSizeAt(long index) { return VkPhysicalDeviceSubgroupSizeControlProperties.get_maxSubgroupSize(this.segment(), index); }
    /// {@return `maxSubgroupSize`}
    public @CType("uint32_t") int maxSubgroupSize() { return VkPhysicalDeviceSubgroupSizeControlProperties.get_maxSubgroupSize(this.segment()); }
    /// Sets `maxSubgroupSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxSubgroupSize(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxSubgroupSize.set(segment, 0L, index, value); }
    /// Sets `maxSubgroupSize` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxSubgroupSize(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceSubgroupSizeControlProperties.set_maxSubgroupSize(segment, 0L, value); }
    /// Sets `maxSubgroupSize` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceSubgroupSizeControlProperties maxSubgroupSizeAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceSubgroupSizeControlProperties.set_maxSubgroupSize(this.segment(), index, value); return this; }
    /// Sets `maxSubgroupSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceSubgroupSizeControlProperties maxSubgroupSize(@CType("uint32_t") int value) { VkPhysicalDeviceSubgroupSizeControlProperties.set_maxSubgroupSize(this.segment(), value); return this; }

    /// {@return `maxComputeWorkgroupSubgroups` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxComputeWorkgroupSubgroups(MemorySegment segment, long index) { return (int) VH_maxComputeWorkgroupSubgroups.get(segment, 0L, index); }
    /// {@return `maxComputeWorkgroupSubgroups`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxComputeWorkgroupSubgroups(MemorySegment segment) { return VkPhysicalDeviceSubgroupSizeControlProperties.get_maxComputeWorkgroupSubgroups(segment, 0L); }
    /// {@return `maxComputeWorkgroupSubgroups` at the given index}
    /// @param index the index
    public @CType("uint32_t") int maxComputeWorkgroupSubgroupsAt(long index) { return VkPhysicalDeviceSubgroupSizeControlProperties.get_maxComputeWorkgroupSubgroups(this.segment(), index); }
    /// {@return `maxComputeWorkgroupSubgroups`}
    public @CType("uint32_t") int maxComputeWorkgroupSubgroups() { return VkPhysicalDeviceSubgroupSizeControlProperties.get_maxComputeWorkgroupSubgroups(this.segment()); }
    /// Sets `maxComputeWorkgroupSubgroups` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxComputeWorkgroupSubgroups(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxComputeWorkgroupSubgroups.set(segment, 0L, index, value); }
    /// Sets `maxComputeWorkgroupSubgroups` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxComputeWorkgroupSubgroups(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceSubgroupSizeControlProperties.set_maxComputeWorkgroupSubgroups(segment, 0L, value); }
    /// Sets `maxComputeWorkgroupSubgroups` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceSubgroupSizeControlProperties maxComputeWorkgroupSubgroupsAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceSubgroupSizeControlProperties.set_maxComputeWorkgroupSubgroups(this.segment(), index, value); return this; }
    /// Sets `maxComputeWorkgroupSubgroups` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceSubgroupSizeControlProperties maxComputeWorkgroupSubgroups(@CType("uint32_t") int value) { VkPhysicalDeviceSubgroupSizeControlProperties.set_maxComputeWorkgroupSubgroups(this.segment(), value); return this; }

    /// {@return `requiredSubgroupSizeStages` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkShaderStageFlags") int get_requiredSubgroupSizeStages(MemorySegment segment, long index) { return (int) VH_requiredSubgroupSizeStages.get(segment, 0L, index); }
    /// {@return `requiredSubgroupSizeStages`}
    /// @param segment the segment of the struct
    public static @CType("VkShaderStageFlags") int get_requiredSubgroupSizeStages(MemorySegment segment) { return VkPhysicalDeviceSubgroupSizeControlProperties.get_requiredSubgroupSizeStages(segment, 0L); }
    /// {@return `requiredSubgroupSizeStages` at the given index}
    /// @param index the index
    public @CType("VkShaderStageFlags") int requiredSubgroupSizeStagesAt(long index) { return VkPhysicalDeviceSubgroupSizeControlProperties.get_requiredSubgroupSizeStages(this.segment(), index); }
    /// {@return `requiredSubgroupSizeStages`}
    public @CType("VkShaderStageFlags") int requiredSubgroupSizeStages() { return VkPhysicalDeviceSubgroupSizeControlProperties.get_requiredSubgroupSizeStages(this.segment()); }
    /// Sets `requiredSubgroupSizeStages` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_requiredSubgroupSizeStages(MemorySegment segment, long index, @CType("VkShaderStageFlags") int value) { VH_requiredSubgroupSizeStages.set(segment, 0L, index, value); }
    /// Sets `requiredSubgroupSizeStages` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_requiredSubgroupSizeStages(MemorySegment segment, @CType("VkShaderStageFlags") int value) { VkPhysicalDeviceSubgroupSizeControlProperties.set_requiredSubgroupSizeStages(segment, 0L, value); }
    /// Sets `requiredSubgroupSizeStages` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceSubgroupSizeControlProperties requiredSubgroupSizeStagesAt(long index, @CType("VkShaderStageFlags") int value) { VkPhysicalDeviceSubgroupSizeControlProperties.set_requiredSubgroupSizeStages(this.segment(), index, value); return this; }
    /// Sets `requiredSubgroupSizeStages` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceSubgroupSizeControlProperties requiredSubgroupSizeStages(@CType("VkShaderStageFlags") int value) { VkPhysicalDeviceSubgroupSizeControlProperties.set_requiredSubgroupSizeStages(this.segment(), value); return this; }

}
