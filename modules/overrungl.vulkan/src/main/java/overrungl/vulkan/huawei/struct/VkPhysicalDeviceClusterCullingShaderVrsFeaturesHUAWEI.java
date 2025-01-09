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
package overrungl.vulkan.huawei.struct;

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
/// ### clusterShadingRate
/// [VarHandle][#VH_clusterShadingRate] - [Getter][#clusterShadingRate()] - [Setter][#clusterShadingRate(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI {
///     VkStructureType sType;
///     void * pNext;
///     VkBool32 clusterShadingRate;
/// } VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI;
/// ```
public final class VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI extends Struct {
    /// The struct layout of `VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("clusterShadingRate")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `clusterShadingRate` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_clusterShadingRate = LAYOUT.arrayElementVarHandle(PathElement.groupElement("clusterShadingRate"));

    /// Creates `VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI(segment); }

    /// Creates `VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI`
    public static VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI`
    public static VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI`
    public VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI asSlice(long index) { return new VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI`
    public VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI asSlice(long index, long count) { return new VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI sTypeAt(long index, @CType("VkStructureType") int value) { VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI sType(@CType("VkStructureType") int value) { VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI.set_pNext(this.segment(), value); return this; }

    /// {@return `clusterShadingRate` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_clusterShadingRate(MemorySegment segment, long index) { return (int) VH_clusterShadingRate.get(segment, 0L, index); }
    /// {@return `clusterShadingRate`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_clusterShadingRate(MemorySegment segment) { return VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI.get_clusterShadingRate(segment, 0L); }
    /// {@return `clusterShadingRate` at the given index}
    /// @param index the index
    public @CType("VkBool32") int clusterShadingRateAt(long index) { return VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI.get_clusterShadingRate(this.segment(), index); }
    /// {@return `clusterShadingRate`}
    public @CType("VkBool32") int clusterShadingRate() { return VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI.get_clusterShadingRate(this.segment()); }
    /// Sets `clusterShadingRate` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_clusterShadingRate(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_clusterShadingRate.set(segment, 0L, index, value); }
    /// Sets `clusterShadingRate` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_clusterShadingRate(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI.set_clusterShadingRate(segment, 0L, value); }
    /// Sets `clusterShadingRate` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI clusterShadingRateAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI.set_clusterShadingRate(this.segment(), index, value); return this; }
    /// Sets `clusterShadingRate` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI clusterShadingRate(@CType("VkBool32") int value) { VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI.set_clusterShadingRate(this.segment(), value); return this; }

}
