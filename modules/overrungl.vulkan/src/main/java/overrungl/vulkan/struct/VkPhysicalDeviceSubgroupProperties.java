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
/// ### subgroupSize
/// [VarHandle][#VH_subgroupSize] - [Getter][#subgroupSize()] - [Setter][#subgroupSize(int)]
/// ### supportedStages
/// [VarHandle][#VH_supportedStages] - [Getter][#supportedStages()] - [Setter][#supportedStages(int)]
/// ### supportedOperations
/// [VarHandle][#VH_supportedOperations] - [Getter][#supportedOperations()] - [Setter][#supportedOperations(int)]
/// ### quadOperationsInAllStages
/// [VarHandle][#VH_quadOperationsInAllStages] - [Getter][#quadOperationsInAllStages()] - [Setter][#quadOperationsInAllStages(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPhysicalDeviceSubgroupProperties {
///     VkStructureType sType;
///     void * pNext;
///     uint32_t subgroupSize;
///     VkShaderStageFlags supportedStages;
///     VkSubgroupFeatureFlags supportedOperations;
///     VkBool32 quadOperationsInAllStages;
/// } VkPhysicalDeviceSubgroupProperties;
/// ```
public final class VkPhysicalDeviceSubgroupProperties extends Struct {
    /// The struct layout of `VkPhysicalDeviceSubgroupProperties`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("subgroupSize"),
        ValueLayout.JAVA_INT.withName("supportedStages"),
        ValueLayout.JAVA_INT.withName("supportedOperations"),
        ValueLayout.JAVA_INT.withName("quadOperationsInAllStages")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `subgroupSize` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_subgroupSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("subgroupSize"));
    /// The [VarHandle] of `supportedStages` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_supportedStages = LAYOUT.arrayElementVarHandle(PathElement.groupElement("supportedStages"));
    /// The [VarHandle] of `supportedOperations` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_supportedOperations = LAYOUT.arrayElementVarHandle(PathElement.groupElement("supportedOperations"));
    /// The [VarHandle] of `quadOperationsInAllStages` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_quadOperationsInAllStages = LAYOUT.arrayElementVarHandle(PathElement.groupElement("quadOperationsInAllStages"));

    /// Creates `VkPhysicalDeviceSubgroupProperties` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceSubgroupProperties(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceSubgroupProperties` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceSubgroupProperties of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceSubgroupProperties(segment); }

    /// Creates `VkPhysicalDeviceSubgroupProperties` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceSubgroupProperties ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceSubgroupProperties(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDeviceSubgroupProperties` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceSubgroupProperties ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceSubgroupProperties(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkPhysicalDeviceSubgroupProperties` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceSubgroupProperties`
    public static VkPhysicalDeviceSubgroupProperties alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceSubgroupProperties(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceSubgroupProperties` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceSubgroupProperties`
    public static VkPhysicalDeviceSubgroupProperties alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceSubgroupProperties(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPhysicalDeviceSubgroupProperties.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkPhysicalDeviceSubgroupProperties.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPhysicalDeviceSubgroupProperties.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPhysicalDeviceSubgroupProperties.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceSubgroupProperties sTypeAt(long index, @CType("VkStructureType") int value) { VkPhysicalDeviceSubgroupProperties.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceSubgroupProperties sType(@CType("VkStructureType") int value) { VkPhysicalDeviceSubgroupProperties.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkPhysicalDeviceSubgroupProperties.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkPhysicalDeviceSubgroupProperties.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkPhysicalDeviceSubgroupProperties.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceSubgroupProperties.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceSubgroupProperties pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceSubgroupProperties.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceSubgroupProperties pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceSubgroupProperties.set_pNext(this.segment(), value); return this; }

    /// {@return `subgroupSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_subgroupSize(MemorySegment segment, long index) { return (int) VH_subgroupSize.get(segment, 0L, index); }
    /// {@return `subgroupSize`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_subgroupSize(MemorySegment segment) { return VkPhysicalDeviceSubgroupProperties.get_subgroupSize(segment, 0L); }
    /// {@return `subgroupSize` at the given index}
    /// @param index the index
    public @CType("uint32_t") int subgroupSizeAt(long index) { return VkPhysicalDeviceSubgroupProperties.get_subgroupSize(this.segment(), index); }
    /// {@return `subgroupSize`}
    public @CType("uint32_t") int subgroupSize() { return VkPhysicalDeviceSubgroupProperties.get_subgroupSize(this.segment()); }
    /// Sets `subgroupSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_subgroupSize(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_subgroupSize.set(segment, 0L, index, value); }
    /// Sets `subgroupSize` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_subgroupSize(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceSubgroupProperties.set_subgroupSize(segment, 0L, value); }
    /// Sets `subgroupSize` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceSubgroupProperties subgroupSizeAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceSubgroupProperties.set_subgroupSize(this.segment(), index, value); return this; }
    /// Sets `subgroupSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceSubgroupProperties subgroupSize(@CType("uint32_t") int value) { VkPhysicalDeviceSubgroupProperties.set_subgroupSize(this.segment(), value); return this; }

    /// {@return `supportedStages` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkShaderStageFlags") int get_supportedStages(MemorySegment segment, long index) { return (int) VH_supportedStages.get(segment, 0L, index); }
    /// {@return `supportedStages`}
    /// @param segment the segment of the struct
    public static @CType("VkShaderStageFlags") int get_supportedStages(MemorySegment segment) { return VkPhysicalDeviceSubgroupProperties.get_supportedStages(segment, 0L); }
    /// {@return `supportedStages` at the given index}
    /// @param index the index
    public @CType("VkShaderStageFlags") int supportedStagesAt(long index) { return VkPhysicalDeviceSubgroupProperties.get_supportedStages(this.segment(), index); }
    /// {@return `supportedStages`}
    public @CType("VkShaderStageFlags") int supportedStages() { return VkPhysicalDeviceSubgroupProperties.get_supportedStages(this.segment()); }
    /// Sets `supportedStages` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_supportedStages(MemorySegment segment, long index, @CType("VkShaderStageFlags") int value) { VH_supportedStages.set(segment, 0L, index, value); }
    /// Sets `supportedStages` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_supportedStages(MemorySegment segment, @CType("VkShaderStageFlags") int value) { VkPhysicalDeviceSubgroupProperties.set_supportedStages(segment, 0L, value); }
    /// Sets `supportedStages` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceSubgroupProperties supportedStagesAt(long index, @CType("VkShaderStageFlags") int value) { VkPhysicalDeviceSubgroupProperties.set_supportedStages(this.segment(), index, value); return this; }
    /// Sets `supportedStages` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceSubgroupProperties supportedStages(@CType("VkShaderStageFlags") int value) { VkPhysicalDeviceSubgroupProperties.set_supportedStages(this.segment(), value); return this; }

    /// {@return `supportedOperations` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkSubgroupFeatureFlags") int get_supportedOperations(MemorySegment segment, long index) { return (int) VH_supportedOperations.get(segment, 0L, index); }
    /// {@return `supportedOperations`}
    /// @param segment the segment of the struct
    public static @CType("VkSubgroupFeatureFlags") int get_supportedOperations(MemorySegment segment) { return VkPhysicalDeviceSubgroupProperties.get_supportedOperations(segment, 0L); }
    /// {@return `supportedOperations` at the given index}
    /// @param index the index
    public @CType("VkSubgroupFeatureFlags") int supportedOperationsAt(long index) { return VkPhysicalDeviceSubgroupProperties.get_supportedOperations(this.segment(), index); }
    /// {@return `supportedOperations`}
    public @CType("VkSubgroupFeatureFlags") int supportedOperations() { return VkPhysicalDeviceSubgroupProperties.get_supportedOperations(this.segment()); }
    /// Sets `supportedOperations` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_supportedOperations(MemorySegment segment, long index, @CType("VkSubgroupFeatureFlags") int value) { VH_supportedOperations.set(segment, 0L, index, value); }
    /// Sets `supportedOperations` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_supportedOperations(MemorySegment segment, @CType("VkSubgroupFeatureFlags") int value) { VkPhysicalDeviceSubgroupProperties.set_supportedOperations(segment, 0L, value); }
    /// Sets `supportedOperations` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceSubgroupProperties supportedOperationsAt(long index, @CType("VkSubgroupFeatureFlags") int value) { VkPhysicalDeviceSubgroupProperties.set_supportedOperations(this.segment(), index, value); return this; }
    /// Sets `supportedOperations` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceSubgroupProperties supportedOperations(@CType("VkSubgroupFeatureFlags") int value) { VkPhysicalDeviceSubgroupProperties.set_supportedOperations(this.segment(), value); return this; }

    /// {@return `quadOperationsInAllStages` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_quadOperationsInAllStages(MemorySegment segment, long index) { return (int) VH_quadOperationsInAllStages.get(segment, 0L, index); }
    /// {@return `quadOperationsInAllStages`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_quadOperationsInAllStages(MemorySegment segment) { return VkPhysicalDeviceSubgroupProperties.get_quadOperationsInAllStages(segment, 0L); }
    /// {@return `quadOperationsInAllStages` at the given index}
    /// @param index the index
    public @CType("VkBool32") int quadOperationsInAllStagesAt(long index) { return VkPhysicalDeviceSubgroupProperties.get_quadOperationsInAllStages(this.segment(), index); }
    /// {@return `quadOperationsInAllStages`}
    public @CType("VkBool32") int quadOperationsInAllStages() { return VkPhysicalDeviceSubgroupProperties.get_quadOperationsInAllStages(this.segment()); }
    /// Sets `quadOperationsInAllStages` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_quadOperationsInAllStages(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_quadOperationsInAllStages.set(segment, 0L, index, value); }
    /// Sets `quadOperationsInAllStages` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_quadOperationsInAllStages(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceSubgroupProperties.set_quadOperationsInAllStages(segment, 0L, value); }
    /// Sets `quadOperationsInAllStages` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceSubgroupProperties quadOperationsInAllStagesAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceSubgroupProperties.set_quadOperationsInAllStages(this.segment(), index, value); return this; }
    /// Sets `quadOperationsInAllStages` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceSubgroupProperties quadOperationsInAllStages(@CType("VkBool32") int value) { VkPhysicalDeviceSubgroupProperties.set_quadOperationsInAllStages(this.segment(), value); return this; }

}
