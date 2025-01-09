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
package overrungl.vulkan.amd.struct;

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
/// ### shaderEngineCount
/// [VarHandle][#VH_shaderEngineCount] - [Getter][#shaderEngineCount()] - [Setter][#shaderEngineCount(int)]
/// ### shaderArraysPerEngineCount
/// [VarHandle][#VH_shaderArraysPerEngineCount] - [Getter][#shaderArraysPerEngineCount()] - [Setter][#shaderArraysPerEngineCount(int)]
/// ### computeUnitsPerShaderArray
/// [VarHandle][#VH_computeUnitsPerShaderArray] - [Getter][#computeUnitsPerShaderArray()] - [Setter][#computeUnitsPerShaderArray(int)]
/// ### simdPerComputeUnit
/// [VarHandle][#VH_simdPerComputeUnit] - [Getter][#simdPerComputeUnit()] - [Setter][#simdPerComputeUnit(int)]
/// ### wavefrontsPerSimd
/// [VarHandle][#VH_wavefrontsPerSimd] - [Getter][#wavefrontsPerSimd()] - [Setter][#wavefrontsPerSimd(int)]
/// ### wavefrontSize
/// [VarHandle][#VH_wavefrontSize] - [Getter][#wavefrontSize()] - [Setter][#wavefrontSize(int)]
/// ### sgprsPerSimd
/// [VarHandle][#VH_sgprsPerSimd] - [Getter][#sgprsPerSimd()] - [Setter][#sgprsPerSimd(int)]
/// ### minSgprAllocation
/// [VarHandle][#VH_minSgprAllocation] - [Getter][#minSgprAllocation()] - [Setter][#minSgprAllocation(int)]
/// ### maxSgprAllocation
/// [VarHandle][#VH_maxSgprAllocation] - [Getter][#maxSgprAllocation()] - [Setter][#maxSgprAllocation(int)]
/// ### sgprAllocationGranularity
/// [VarHandle][#VH_sgprAllocationGranularity] - [Getter][#sgprAllocationGranularity()] - [Setter][#sgprAllocationGranularity(int)]
/// ### vgprsPerSimd
/// [VarHandle][#VH_vgprsPerSimd] - [Getter][#vgprsPerSimd()] - [Setter][#vgprsPerSimd(int)]
/// ### minVgprAllocation
/// [VarHandle][#VH_minVgprAllocation] - [Getter][#minVgprAllocation()] - [Setter][#minVgprAllocation(int)]
/// ### maxVgprAllocation
/// [VarHandle][#VH_maxVgprAllocation] - [Getter][#maxVgprAllocation()] - [Setter][#maxVgprAllocation(int)]
/// ### vgprAllocationGranularity
/// [VarHandle][#VH_vgprAllocationGranularity] - [Getter][#vgprAllocationGranularity()] - [Setter][#vgprAllocationGranularity(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPhysicalDeviceShaderCorePropertiesAMD {
///     VkStructureType sType;
///     void * pNext;
///     uint32_t shaderEngineCount;
///     uint32_t shaderArraysPerEngineCount;
///     uint32_t computeUnitsPerShaderArray;
///     uint32_t simdPerComputeUnit;
///     uint32_t wavefrontsPerSimd;
///     uint32_t wavefrontSize;
///     uint32_t sgprsPerSimd;
///     uint32_t minSgprAllocation;
///     uint32_t maxSgprAllocation;
///     uint32_t sgprAllocationGranularity;
///     uint32_t vgprsPerSimd;
///     uint32_t minVgprAllocation;
///     uint32_t maxVgprAllocation;
///     uint32_t vgprAllocationGranularity;
/// } VkPhysicalDeviceShaderCorePropertiesAMD;
/// ```
public final class VkPhysicalDeviceShaderCorePropertiesAMD extends Struct {
    /// The struct layout of `VkPhysicalDeviceShaderCorePropertiesAMD`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("shaderEngineCount"),
        ValueLayout.JAVA_INT.withName("shaderArraysPerEngineCount"),
        ValueLayout.JAVA_INT.withName("computeUnitsPerShaderArray"),
        ValueLayout.JAVA_INT.withName("simdPerComputeUnit"),
        ValueLayout.JAVA_INT.withName("wavefrontsPerSimd"),
        ValueLayout.JAVA_INT.withName("wavefrontSize"),
        ValueLayout.JAVA_INT.withName("sgprsPerSimd"),
        ValueLayout.JAVA_INT.withName("minSgprAllocation"),
        ValueLayout.JAVA_INT.withName("maxSgprAllocation"),
        ValueLayout.JAVA_INT.withName("sgprAllocationGranularity"),
        ValueLayout.JAVA_INT.withName("vgprsPerSimd"),
        ValueLayout.JAVA_INT.withName("minVgprAllocation"),
        ValueLayout.JAVA_INT.withName("maxVgprAllocation"),
        ValueLayout.JAVA_INT.withName("vgprAllocationGranularity")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `shaderEngineCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_shaderEngineCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderEngineCount"));
    /// The [VarHandle] of `shaderArraysPerEngineCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_shaderArraysPerEngineCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderArraysPerEngineCount"));
    /// The [VarHandle] of `computeUnitsPerShaderArray` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_computeUnitsPerShaderArray = LAYOUT.arrayElementVarHandle(PathElement.groupElement("computeUnitsPerShaderArray"));
    /// The [VarHandle] of `simdPerComputeUnit` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_simdPerComputeUnit = LAYOUT.arrayElementVarHandle(PathElement.groupElement("simdPerComputeUnit"));
    /// The [VarHandle] of `wavefrontsPerSimd` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_wavefrontsPerSimd = LAYOUT.arrayElementVarHandle(PathElement.groupElement("wavefrontsPerSimd"));
    /// The [VarHandle] of `wavefrontSize` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_wavefrontSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("wavefrontSize"));
    /// The [VarHandle] of `sgprsPerSimd` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sgprsPerSimd = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sgprsPerSimd"));
    /// The [VarHandle] of `minSgprAllocation` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_minSgprAllocation = LAYOUT.arrayElementVarHandle(PathElement.groupElement("minSgprAllocation"));
    /// The [VarHandle] of `maxSgprAllocation` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxSgprAllocation = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxSgprAllocation"));
    /// The [VarHandle] of `sgprAllocationGranularity` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sgprAllocationGranularity = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sgprAllocationGranularity"));
    /// The [VarHandle] of `vgprsPerSimd` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_vgprsPerSimd = LAYOUT.arrayElementVarHandle(PathElement.groupElement("vgprsPerSimd"));
    /// The [VarHandle] of `minVgprAllocation` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_minVgprAllocation = LAYOUT.arrayElementVarHandle(PathElement.groupElement("minVgprAllocation"));
    /// The [VarHandle] of `maxVgprAllocation` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxVgprAllocation = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxVgprAllocation"));
    /// The [VarHandle] of `vgprAllocationGranularity` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_vgprAllocationGranularity = LAYOUT.arrayElementVarHandle(PathElement.groupElement("vgprAllocationGranularity"));

    /// Creates `VkPhysicalDeviceShaderCorePropertiesAMD` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceShaderCorePropertiesAMD(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceShaderCorePropertiesAMD` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceShaderCorePropertiesAMD of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderCorePropertiesAMD(segment); }

    /// Creates `VkPhysicalDeviceShaderCorePropertiesAMD` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceShaderCorePropertiesAMD ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderCorePropertiesAMD(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDeviceShaderCorePropertiesAMD` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceShaderCorePropertiesAMD ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderCorePropertiesAMD(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkPhysicalDeviceShaderCorePropertiesAMD` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceShaderCorePropertiesAMD`
    public static VkPhysicalDeviceShaderCorePropertiesAMD alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceShaderCorePropertiesAMD(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceShaderCorePropertiesAMD` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceShaderCorePropertiesAMD`
    public static VkPhysicalDeviceShaderCorePropertiesAMD alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceShaderCorePropertiesAMD(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPhysicalDeviceShaderCorePropertiesAMD.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkPhysicalDeviceShaderCorePropertiesAMD.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPhysicalDeviceShaderCorePropertiesAMD.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPhysicalDeviceShaderCorePropertiesAMD.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderCorePropertiesAMD sTypeAt(long index, @CType("VkStructureType") int value) { VkPhysicalDeviceShaderCorePropertiesAMD.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderCorePropertiesAMD sType(@CType("VkStructureType") int value) { VkPhysicalDeviceShaderCorePropertiesAMD.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkPhysicalDeviceShaderCorePropertiesAMD.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkPhysicalDeviceShaderCorePropertiesAMD.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkPhysicalDeviceShaderCorePropertiesAMD.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceShaderCorePropertiesAMD.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderCorePropertiesAMD pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceShaderCorePropertiesAMD.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderCorePropertiesAMD pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceShaderCorePropertiesAMD.set_pNext(this.segment(), value); return this; }

    /// {@return `shaderEngineCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_shaderEngineCount(MemorySegment segment, long index) { return (int) VH_shaderEngineCount.get(segment, 0L, index); }
    /// {@return `shaderEngineCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_shaderEngineCount(MemorySegment segment) { return VkPhysicalDeviceShaderCorePropertiesAMD.get_shaderEngineCount(segment, 0L); }
    /// {@return `shaderEngineCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int shaderEngineCountAt(long index) { return VkPhysicalDeviceShaderCorePropertiesAMD.get_shaderEngineCount(this.segment(), index); }
    /// {@return `shaderEngineCount`}
    public @CType("uint32_t") int shaderEngineCount() { return VkPhysicalDeviceShaderCorePropertiesAMD.get_shaderEngineCount(this.segment()); }
    /// Sets `shaderEngineCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_shaderEngineCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_shaderEngineCount.set(segment, 0L, index, value); }
    /// Sets `shaderEngineCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_shaderEngineCount(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceShaderCorePropertiesAMD.set_shaderEngineCount(segment, 0L, value); }
    /// Sets `shaderEngineCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderCorePropertiesAMD shaderEngineCountAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceShaderCorePropertiesAMD.set_shaderEngineCount(this.segment(), index, value); return this; }
    /// Sets `shaderEngineCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderCorePropertiesAMD shaderEngineCount(@CType("uint32_t") int value) { VkPhysicalDeviceShaderCorePropertiesAMD.set_shaderEngineCount(this.segment(), value); return this; }

    /// {@return `shaderArraysPerEngineCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_shaderArraysPerEngineCount(MemorySegment segment, long index) { return (int) VH_shaderArraysPerEngineCount.get(segment, 0L, index); }
    /// {@return `shaderArraysPerEngineCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_shaderArraysPerEngineCount(MemorySegment segment) { return VkPhysicalDeviceShaderCorePropertiesAMD.get_shaderArraysPerEngineCount(segment, 0L); }
    /// {@return `shaderArraysPerEngineCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int shaderArraysPerEngineCountAt(long index) { return VkPhysicalDeviceShaderCorePropertiesAMD.get_shaderArraysPerEngineCount(this.segment(), index); }
    /// {@return `shaderArraysPerEngineCount`}
    public @CType("uint32_t") int shaderArraysPerEngineCount() { return VkPhysicalDeviceShaderCorePropertiesAMD.get_shaderArraysPerEngineCount(this.segment()); }
    /// Sets `shaderArraysPerEngineCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_shaderArraysPerEngineCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_shaderArraysPerEngineCount.set(segment, 0L, index, value); }
    /// Sets `shaderArraysPerEngineCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_shaderArraysPerEngineCount(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceShaderCorePropertiesAMD.set_shaderArraysPerEngineCount(segment, 0L, value); }
    /// Sets `shaderArraysPerEngineCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderCorePropertiesAMD shaderArraysPerEngineCountAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceShaderCorePropertiesAMD.set_shaderArraysPerEngineCount(this.segment(), index, value); return this; }
    /// Sets `shaderArraysPerEngineCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderCorePropertiesAMD shaderArraysPerEngineCount(@CType("uint32_t") int value) { VkPhysicalDeviceShaderCorePropertiesAMD.set_shaderArraysPerEngineCount(this.segment(), value); return this; }

    /// {@return `computeUnitsPerShaderArray` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_computeUnitsPerShaderArray(MemorySegment segment, long index) { return (int) VH_computeUnitsPerShaderArray.get(segment, 0L, index); }
    /// {@return `computeUnitsPerShaderArray`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_computeUnitsPerShaderArray(MemorySegment segment) { return VkPhysicalDeviceShaderCorePropertiesAMD.get_computeUnitsPerShaderArray(segment, 0L); }
    /// {@return `computeUnitsPerShaderArray` at the given index}
    /// @param index the index
    public @CType("uint32_t") int computeUnitsPerShaderArrayAt(long index) { return VkPhysicalDeviceShaderCorePropertiesAMD.get_computeUnitsPerShaderArray(this.segment(), index); }
    /// {@return `computeUnitsPerShaderArray`}
    public @CType("uint32_t") int computeUnitsPerShaderArray() { return VkPhysicalDeviceShaderCorePropertiesAMD.get_computeUnitsPerShaderArray(this.segment()); }
    /// Sets `computeUnitsPerShaderArray` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_computeUnitsPerShaderArray(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_computeUnitsPerShaderArray.set(segment, 0L, index, value); }
    /// Sets `computeUnitsPerShaderArray` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_computeUnitsPerShaderArray(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceShaderCorePropertiesAMD.set_computeUnitsPerShaderArray(segment, 0L, value); }
    /// Sets `computeUnitsPerShaderArray` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderCorePropertiesAMD computeUnitsPerShaderArrayAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceShaderCorePropertiesAMD.set_computeUnitsPerShaderArray(this.segment(), index, value); return this; }
    /// Sets `computeUnitsPerShaderArray` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderCorePropertiesAMD computeUnitsPerShaderArray(@CType("uint32_t") int value) { VkPhysicalDeviceShaderCorePropertiesAMD.set_computeUnitsPerShaderArray(this.segment(), value); return this; }

    /// {@return `simdPerComputeUnit` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_simdPerComputeUnit(MemorySegment segment, long index) { return (int) VH_simdPerComputeUnit.get(segment, 0L, index); }
    /// {@return `simdPerComputeUnit`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_simdPerComputeUnit(MemorySegment segment) { return VkPhysicalDeviceShaderCorePropertiesAMD.get_simdPerComputeUnit(segment, 0L); }
    /// {@return `simdPerComputeUnit` at the given index}
    /// @param index the index
    public @CType("uint32_t") int simdPerComputeUnitAt(long index) { return VkPhysicalDeviceShaderCorePropertiesAMD.get_simdPerComputeUnit(this.segment(), index); }
    /// {@return `simdPerComputeUnit`}
    public @CType("uint32_t") int simdPerComputeUnit() { return VkPhysicalDeviceShaderCorePropertiesAMD.get_simdPerComputeUnit(this.segment()); }
    /// Sets `simdPerComputeUnit` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_simdPerComputeUnit(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_simdPerComputeUnit.set(segment, 0L, index, value); }
    /// Sets `simdPerComputeUnit` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_simdPerComputeUnit(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceShaderCorePropertiesAMD.set_simdPerComputeUnit(segment, 0L, value); }
    /// Sets `simdPerComputeUnit` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderCorePropertiesAMD simdPerComputeUnitAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceShaderCorePropertiesAMD.set_simdPerComputeUnit(this.segment(), index, value); return this; }
    /// Sets `simdPerComputeUnit` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderCorePropertiesAMD simdPerComputeUnit(@CType("uint32_t") int value) { VkPhysicalDeviceShaderCorePropertiesAMD.set_simdPerComputeUnit(this.segment(), value); return this; }

    /// {@return `wavefrontsPerSimd` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_wavefrontsPerSimd(MemorySegment segment, long index) { return (int) VH_wavefrontsPerSimd.get(segment, 0L, index); }
    /// {@return `wavefrontsPerSimd`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_wavefrontsPerSimd(MemorySegment segment) { return VkPhysicalDeviceShaderCorePropertiesAMD.get_wavefrontsPerSimd(segment, 0L); }
    /// {@return `wavefrontsPerSimd` at the given index}
    /// @param index the index
    public @CType("uint32_t") int wavefrontsPerSimdAt(long index) { return VkPhysicalDeviceShaderCorePropertiesAMD.get_wavefrontsPerSimd(this.segment(), index); }
    /// {@return `wavefrontsPerSimd`}
    public @CType("uint32_t") int wavefrontsPerSimd() { return VkPhysicalDeviceShaderCorePropertiesAMD.get_wavefrontsPerSimd(this.segment()); }
    /// Sets `wavefrontsPerSimd` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_wavefrontsPerSimd(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_wavefrontsPerSimd.set(segment, 0L, index, value); }
    /// Sets `wavefrontsPerSimd` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_wavefrontsPerSimd(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceShaderCorePropertiesAMD.set_wavefrontsPerSimd(segment, 0L, value); }
    /// Sets `wavefrontsPerSimd` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderCorePropertiesAMD wavefrontsPerSimdAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceShaderCorePropertiesAMD.set_wavefrontsPerSimd(this.segment(), index, value); return this; }
    /// Sets `wavefrontsPerSimd` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderCorePropertiesAMD wavefrontsPerSimd(@CType("uint32_t") int value) { VkPhysicalDeviceShaderCorePropertiesAMD.set_wavefrontsPerSimd(this.segment(), value); return this; }

    /// {@return `wavefrontSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_wavefrontSize(MemorySegment segment, long index) { return (int) VH_wavefrontSize.get(segment, 0L, index); }
    /// {@return `wavefrontSize`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_wavefrontSize(MemorySegment segment) { return VkPhysicalDeviceShaderCorePropertiesAMD.get_wavefrontSize(segment, 0L); }
    /// {@return `wavefrontSize` at the given index}
    /// @param index the index
    public @CType("uint32_t") int wavefrontSizeAt(long index) { return VkPhysicalDeviceShaderCorePropertiesAMD.get_wavefrontSize(this.segment(), index); }
    /// {@return `wavefrontSize`}
    public @CType("uint32_t") int wavefrontSize() { return VkPhysicalDeviceShaderCorePropertiesAMD.get_wavefrontSize(this.segment()); }
    /// Sets `wavefrontSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_wavefrontSize(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_wavefrontSize.set(segment, 0L, index, value); }
    /// Sets `wavefrontSize` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_wavefrontSize(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceShaderCorePropertiesAMD.set_wavefrontSize(segment, 0L, value); }
    /// Sets `wavefrontSize` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderCorePropertiesAMD wavefrontSizeAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceShaderCorePropertiesAMD.set_wavefrontSize(this.segment(), index, value); return this; }
    /// Sets `wavefrontSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderCorePropertiesAMD wavefrontSize(@CType("uint32_t") int value) { VkPhysicalDeviceShaderCorePropertiesAMD.set_wavefrontSize(this.segment(), value); return this; }

    /// {@return `sgprsPerSimd` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_sgprsPerSimd(MemorySegment segment, long index) { return (int) VH_sgprsPerSimd.get(segment, 0L, index); }
    /// {@return `sgprsPerSimd`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_sgprsPerSimd(MemorySegment segment) { return VkPhysicalDeviceShaderCorePropertiesAMD.get_sgprsPerSimd(segment, 0L); }
    /// {@return `sgprsPerSimd` at the given index}
    /// @param index the index
    public @CType("uint32_t") int sgprsPerSimdAt(long index) { return VkPhysicalDeviceShaderCorePropertiesAMD.get_sgprsPerSimd(this.segment(), index); }
    /// {@return `sgprsPerSimd`}
    public @CType("uint32_t") int sgprsPerSimd() { return VkPhysicalDeviceShaderCorePropertiesAMD.get_sgprsPerSimd(this.segment()); }
    /// Sets `sgprsPerSimd` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sgprsPerSimd(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_sgprsPerSimd.set(segment, 0L, index, value); }
    /// Sets `sgprsPerSimd` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sgprsPerSimd(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceShaderCorePropertiesAMD.set_sgprsPerSimd(segment, 0L, value); }
    /// Sets `sgprsPerSimd` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderCorePropertiesAMD sgprsPerSimdAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceShaderCorePropertiesAMD.set_sgprsPerSimd(this.segment(), index, value); return this; }
    /// Sets `sgprsPerSimd` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderCorePropertiesAMD sgprsPerSimd(@CType("uint32_t") int value) { VkPhysicalDeviceShaderCorePropertiesAMD.set_sgprsPerSimd(this.segment(), value); return this; }

    /// {@return `minSgprAllocation` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_minSgprAllocation(MemorySegment segment, long index) { return (int) VH_minSgprAllocation.get(segment, 0L, index); }
    /// {@return `minSgprAllocation`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_minSgprAllocation(MemorySegment segment) { return VkPhysicalDeviceShaderCorePropertiesAMD.get_minSgprAllocation(segment, 0L); }
    /// {@return `minSgprAllocation` at the given index}
    /// @param index the index
    public @CType("uint32_t") int minSgprAllocationAt(long index) { return VkPhysicalDeviceShaderCorePropertiesAMD.get_minSgprAllocation(this.segment(), index); }
    /// {@return `minSgprAllocation`}
    public @CType("uint32_t") int minSgprAllocation() { return VkPhysicalDeviceShaderCorePropertiesAMD.get_minSgprAllocation(this.segment()); }
    /// Sets `minSgprAllocation` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_minSgprAllocation(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_minSgprAllocation.set(segment, 0L, index, value); }
    /// Sets `minSgprAllocation` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_minSgprAllocation(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceShaderCorePropertiesAMD.set_minSgprAllocation(segment, 0L, value); }
    /// Sets `minSgprAllocation` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderCorePropertiesAMD minSgprAllocationAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceShaderCorePropertiesAMD.set_minSgprAllocation(this.segment(), index, value); return this; }
    /// Sets `minSgprAllocation` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderCorePropertiesAMD minSgprAllocation(@CType("uint32_t") int value) { VkPhysicalDeviceShaderCorePropertiesAMD.set_minSgprAllocation(this.segment(), value); return this; }

    /// {@return `maxSgprAllocation` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxSgprAllocation(MemorySegment segment, long index) { return (int) VH_maxSgprAllocation.get(segment, 0L, index); }
    /// {@return `maxSgprAllocation`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxSgprAllocation(MemorySegment segment) { return VkPhysicalDeviceShaderCorePropertiesAMD.get_maxSgprAllocation(segment, 0L); }
    /// {@return `maxSgprAllocation` at the given index}
    /// @param index the index
    public @CType("uint32_t") int maxSgprAllocationAt(long index) { return VkPhysicalDeviceShaderCorePropertiesAMD.get_maxSgprAllocation(this.segment(), index); }
    /// {@return `maxSgprAllocation`}
    public @CType("uint32_t") int maxSgprAllocation() { return VkPhysicalDeviceShaderCorePropertiesAMD.get_maxSgprAllocation(this.segment()); }
    /// Sets `maxSgprAllocation` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxSgprAllocation(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxSgprAllocation.set(segment, 0L, index, value); }
    /// Sets `maxSgprAllocation` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxSgprAllocation(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceShaderCorePropertiesAMD.set_maxSgprAllocation(segment, 0L, value); }
    /// Sets `maxSgprAllocation` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderCorePropertiesAMD maxSgprAllocationAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceShaderCorePropertiesAMD.set_maxSgprAllocation(this.segment(), index, value); return this; }
    /// Sets `maxSgprAllocation` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderCorePropertiesAMD maxSgprAllocation(@CType("uint32_t") int value) { VkPhysicalDeviceShaderCorePropertiesAMD.set_maxSgprAllocation(this.segment(), value); return this; }

    /// {@return `sgprAllocationGranularity` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_sgprAllocationGranularity(MemorySegment segment, long index) { return (int) VH_sgprAllocationGranularity.get(segment, 0L, index); }
    /// {@return `sgprAllocationGranularity`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_sgprAllocationGranularity(MemorySegment segment) { return VkPhysicalDeviceShaderCorePropertiesAMD.get_sgprAllocationGranularity(segment, 0L); }
    /// {@return `sgprAllocationGranularity` at the given index}
    /// @param index the index
    public @CType("uint32_t") int sgprAllocationGranularityAt(long index) { return VkPhysicalDeviceShaderCorePropertiesAMD.get_sgprAllocationGranularity(this.segment(), index); }
    /// {@return `sgprAllocationGranularity`}
    public @CType("uint32_t") int sgprAllocationGranularity() { return VkPhysicalDeviceShaderCorePropertiesAMD.get_sgprAllocationGranularity(this.segment()); }
    /// Sets `sgprAllocationGranularity` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sgprAllocationGranularity(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_sgprAllocationGranularity.set(segment, 0L, index, value); }
    /// Sets `sgprAllocationGranularity` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sgprAllocationGranularity(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceShaderCorePropertiesAMD.set_sgprAllocationGranularity(segment, 0L, value); }
    /// Sets `sgprAllocationGranularity` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderCorePropertiesAMD sgprAllocationGranularityAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceShaderCorePropertiesAMD.set_sgprAllocationGranularity(this.segment(), index, value); return this; }
    /// Sets `sgprAllocationGranularity` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderCorePropertiesAMD sgprAllocationGranularity(@CType("uint32_t") int value) { VkPhysicalDeviceShaderCorePropertiesAMD.set_sgprAllocationGranularity(this.segment(), value); return this; }

    /// {@return `vgprsPerSimd` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_vgprsPerSimd(MemorySegment segment, long index) { return (int) VH_vgprsPerSimd.get(segment, 0L, index); }
    /// {@return `vgprsPerSimd`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_vgprsPerSimd(MemorySegment segment) { return VkPhysicalDeviceShaderCorePropertiesAMD.get_vgprsPerSimd(segment, 0L); }
    /// {@return `vgprsPerSimd` at the given index}
    /// @param index the index
    public @CType("uint32_t") int vgprsPerSimdAt(long index) { return VkPhysicalDeviceShaderCorePropertiesAMD.get_vgprsPerSimd(this.segment(), index); }
    /// {@return `vgprsPerSimd`}
    public @CType("uint32_t") int vgprsPerSimd() { return VkPhysicalDeviceShaderCorePropertiesAMD.get_vgprsPerSimd(this.segment()); }
    /// Sets `vgprsPerSimd` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_vgprsPerSimd(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_vgprsPerSimd.set(segment, 0L, index, value); }
    /// Sets `vgprsPerSimd` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_vgprsPerSimd(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceShaderCorePropertiesAMD.set_vgprsPerSimd(segment, 0L, value); }
    /// Sets `vgprsPerSimd` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderCorePropertiesAMD vgprsPerSimdAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceShaderCorePropertiesAMD.set_vgprsPerSimd(this.segment(), index, value); return this; }
    /// Sets `vgprsPerSimd` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderCorePropertiesAMD vgprsPerSimd(@CType("uint32_t") int value) { VkPhysicalDeviceShaderCorePropertiesAMD.set_vgprsPerSimd(this.segment(), value); return this; }

    /// {@return `minVgprAllocation` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_minVgprAllocation(MemorySegment segment, long index) { return (int) VH_minVgprAllocation.get(segment, 0L, index); }
    /// {@return `minVgprAllocation`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_minVgprAllocation(MemorySegment segment) { return VkPhysicalDeviceShaderCorePropertiesAMD.get_minVgprAllocation(segment, 0L); }
    /// {@return `minVgprAllocation` at the given index}
    /// @param index the index
    public @CType("uint32_t") int minVgprAllocationAt(long index) { return VkPhysicalDeviceShaderCorePropertiesAMD.get_minVgprAllocation(this.segment(), index); }
    /// {@return `minVgprAllocation`}
    public @CType("uint32_t") int minVgprAllocation() { return VkPhysicalDeviceShaderCorePropertiesAMD.get_minVgprAllocation(this.segment()); }
    /// Sets `minVgprAllocation` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_minVgprAllocation(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_minVgprAllocation.set(segment, 0L, index, value); }
    /// Sets `minVgprAllocation` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_minVgprAllocation(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceShaderCorePropertiesAMD.set_minVgprAllocation(segment, 0L, value); }
    /// Sets `minVgprAllocation` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderCorePropertiesAMD minVgprAllocationAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceShaderCorePropertiesAMD.set_minVgprAllocation(this.segment(), index, value); return this; }
    /// Sets `minVgprAllocation` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderCorePropertiesAMD minVgprAllocation(@CType("uint32_t") int value) { VkPhysicalDeviceShaderCorePropertiesAMD.set_minVgprAllocation(this.segment(), value); return this; }

    /// {@return `maxVgprAllocation` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxVgprAllocation(MemorySegment segment, long index) { return (int) VH_maxVgprAllocation.get(segment, 0L, index); }
    /// {@return `maxVgprAllocation`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxVgprAllocation(MemorySegment segment) { return VkPhysicalDeviceShaderCorePropertiesAMD.get_maxVgprAllocation(segment, 0L); }
    /// {@return `maxVgprAllocation` at the given index}
    /// @param index the index
    public @CType("uint32_t") int maxVgprAllocationAt(long index) { return VkPhysicalDeviceShaderCorePropertiesAMD.get_maxVgprAllocation(this.segment(), index); }
    /// {@return `maxVgprAllocation`}
    public @CType("uint32_t") int maxVgprAllocation() { return VkPhysicalDeviceShaderCorePropertiesAMD.get_maxVgprAllocation(this.segment()); }
    /// Sets `maxVgprAllocation` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxVgprAllocation(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxVgprAllocation.set(segment, 0L, index, value); }
    /// Sets `maxVgprAllocation` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxVgprAllocation(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceShaderCorePropertiesAMD.set_maxVgprAllocation(segment, 0L, value); }
    /// Sets `maxVgprAllocation` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderCorePropertiesAMD maxVgprAllocationAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceShaderCorePropertiesAMD.set_maxVgprAllocation(this.segment(), index, value); return this; }
    /// Sets `maxVgprAllocation` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderCorePropertiesAMD maxVgprAllocation(@CType("uint32_t") int value) { VkPhysicalDeviceShaderCorePropertiesAMD.set_maxVgprAllocation(this.segment(), value); return this; }

    /// {@return `vgprAllocationGranularity` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_vgprAllocationGranularity(MemorySegment segment, long index) { return (int) VH_vgprAllocationGranularity.get(segment, 0L, index); }
    /// {@return `vgprAllocationGranularity`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_vgprAllocationGranularity(MemorySegment segment) { return VkPhysicalDeviceShaderCorePropertiesAMD.get_vgprAllocationGranularity(segment, 0L); }
    /// {@return `vgprAllocationGranularity` at the given index}
    /// @param index the index
    public @CType("uint32_t") int vgprAllocationGranularityAt(long index) { return VkPhysicalDeviceShaderCorePropertiesAMD.get_vgprAllocationGranularity(this.segment(), index); }
    /// {@return `vgprAllocationGranularity`}
    public @CType("uint32_t") int vgprAllocationGranularity() { return VkPhysicalDeviceShaderCorePropertiesAMD.get_vgprAllocationGranularity(this.segment()); }
    /// Sets `vgprAllocationGranularity` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_vgprAllocationGranularity(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_vgprAllocationGranularity.set(segment, 0L, index, value); }
    /// Sets `vgprAllocationGranularity` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_vgprAllocationGranularity(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceShaderCorePropertiesAMD.set_vgprAllocationGranularity(segment, 0L, value); }
    /// Sets `vgprAllocationGranularity` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderCorePropertiesAMD vgprAllocationGranularityAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceShaderCorePropertiesAMD.set_vgprAllocationGranularity(this.segment(), index, value); return this; }
    /// Sets `vgprAllocationGranularity` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderCorePropertiesAMD vgprAllocationGranularity(@CType("uint32_t") int value) { VkPhysicalDeviceShaderCorePropertiesAMD.set_vgprAllocationGranularity(this.segment(), value); return this; }

}
