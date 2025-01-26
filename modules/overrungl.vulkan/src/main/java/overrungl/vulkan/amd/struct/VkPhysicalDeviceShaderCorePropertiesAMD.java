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
package overrungl.vulkan.amd.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkPhysicalDeviceShaderCorePropertiesAMD {
///     (int) VkStructureType sType;
///     void* pNext;
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
/// };
/// ```
public sealed class VkPhysicalDeviceShaderCorePropertiesAMD extends GroupType {
    /// The struct layout of `VkPhysicalDeviceShaderCorePropertiesAMD`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
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
    /// The byte offset of `shaderEngineCount`.
    public static final long OFFSET_shaderEngineCount = LAYOUT.byteOffset(PathElement.groupElement("shaderEngineCount"));
    /// The memory layout of `shaderEngineCount`.
    public static final MemoryLayout LAYOUT_shaderEngineCount = LAYOUT.select(PathElement.groupElement("shaderEngineCount"));
    /// The [VarHandle] of `shaderEngineCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_shaderEngineCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderEngineCount"));
    /// The byte offset of `shaderArraysPerEngineCount`.
    public static final long OFFSET_shaderArraysPerEngineCount = LAYOUT.byteOffset(PathElement.groupElement("shaderArraysPerEngineCount"));
    /// The memory layout of `shaderArraysPerEngineCount`.
    public static final MemoryLayout LAYOUT_shaderArraysPerEngineCount = LAYOUT.select(PathElement.groupElement("shaderArraysPerEngineCount"));
    /// The [VarHandle] of `shaderArraysPerEngineCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_shaderArraysPerEngineCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderArraysPerEngineCount"));
    /// The byte offset of `computeUnitsPerShaderArray`.
    public static final long OFFSET_computeUnitsPerShaderArray = LAYOUT.byteOffset(PathElement.groupElement("computeUnitsPerShaderArray"));
    /// The memory layout of `computeUnitsPerShaderArray`.
    public static final MemoryLayout LAYOUT_computeUnitsPerShaderArray = LAYOUT.select(PathElement.groupElement("computeUnitsPerShaderArray"));
    /// The [VarHandle] of `computeUnitsPerShaderArray` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_computeUnitsPerShaderArray = LAYOUT.arrayElementVarHandle(PathElement.groupElement("computeUnitsPerShaderArray"));
    /// The byte offset of `simdPerComputeUnit`.
    public static final long OFFSET_simdPerComputeUnit = LAYOUT.byteOffset(PathElement.groupElement("simdPerComputeUnit"));
    /// The memory layout of `simdPerComputeUnit`.
    public static final MemoryLayout LAYOUT_simdPerComputeUnit = LAYOUT.select(PathElement.groupElement("simdPerComputeUnit"));
    /// The [VarHandle] of `simdPerComputeUnit` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_simdPerComputeUnit = LAYOUT.arrayElementVarHandle(PathElement.groupElement("simdPerComputeUnit"));
    /// The byte offset of `wavefrontsPerSimd`.
    public static final long OFFSET_wavefrontsPerSimd = LAYOUT.byteOffset(PathElement.groupElement("wavefrontsPerSimd"));
    /// The memory layout of `wavefrontsPerSimd`.
    public static final MemoryLayout LAYOUT_wavefrontsPerSimd = LAYOUT.select(PathElement.groupElement("wavefrontsPerSimd"));
    /// The [VarHandle] of `wavefrontsPerSimd` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_wavefrontsPerSimd = LAYOUT.arrayElementVarHandle(PathElement.groupElement("wavefrontsPerSimd"));
    /// The byte offset of `wavefrontSize`.
    public static final long OFFSET_wavefrontSize = LAYOUT.byteOffset(PathElement.groupElement("wavefrontSize"));
    /// The memory layout of `wavefrontSize`.
    public static final MemoryLayout LAYOUT_wavefrontSize = LAYOUT.select(PathElement.groupElement("wavefrontSize"));
    /// The [VarHandle] of `wavefrontSize` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_wavefrontSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("wavefrontSize"));
    /// The byte offset of `sgprsPerSimd`.
    public static final long OFFSET_sgprsPerSimd = LAYOUT.byteOffset(PathElement.groupElement("sgprsPerSimd"));
    /// The memory layout of `sgprsPerSimd`.
    public static final MemoryLayout LAYOUT_sgprsPerSimd = LAYOUT.select(PathElement.groupElement("sgprsPerSimd"));
    /// The [VarHandle] of `sgprsPerSimd` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_sgprsPerSimd = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sgprsPerSimd"));
    /// The byte offset of `minSgprAllocation`.
    public static final long OFFSET_minSgprAllocation = LAYOUT.byteOffset(PathElement.groupElement("minSgprAllocation"));
    /// The memory layout of `minSgprAllocation`.
    public static final MemoryLayout LAYOUT_minSgprAllocation = LAYOUT.select(PathElement.groupElement("minSgprAllocation"));
    /// The [VarHandle] of `minSgprAllocation` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_minSgprAllocation = LAYOUT.arrayElementVarHandle(PathElement.groupElement("minSgprAllocation"));
    /// The byte offset of `maxSgprAllocation`.
    public static final long OFFSET_maxSgprAllocation = LAYOUT.byteOffset(PathElement.groupElement("maxSgprAllocation"));
    /// The memory layout of `maxSgprAllocation`.
    public static final MemoryLayout LAYOUT_maxSgprAllocation = LAYOUT.select(PathElement.groupElement("maxSgprAllocation"));
    /// The [VarHandle] of `maxSgprAllocation` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxSgprAllocation = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxSgprAllocation"));
    /// The byte offset of `sgprAllocationGranularity`.
    public static final long OFFSET_sgprAllocationGranularity = LAYOUT.byteOffset(PathElement.groupElement("sgprAllocationGranularity"));
    /// The memory layout of `sgprAllocationGranularity`.
    public static final MemoryLayout LAYOUT_sgprAllocationGranularity = LAYOUT.select(PathElement.groupElement("sgprAllocationGranularity"));
    /// The [VarHandle] of `sgprAllocationGranularity` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_sgprAllocationGranularity = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sgprAllocationGranularity"));
    /// The byte offset of `vgprsPerSimd`.
    public static final long OFFSET_vgprsPerSimd = LAYOUT.byteOffset(PathElement.groupElement("vgprsPerSimd"));
    /// The memory layout of `vgprsPerSimd`.
    public static final MemoryLayout LAYOUT_vgprsPerSimd = LAYOUT.select(PathElement.groupElement("vgprsPerSimd"));
    /// The [VarHandle] of `vgprsPerSimd` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_vgprsPerSimd = LAYOUT.arrayElementVarHandle(PathElement.groupElement("vgprsPerSimd"));
    /// The byte offset of `minVgprAllocation`.
    public static final long OFFSET_minVgprAllocation = LAYOUT.byteOffset(PathElement.groupElement("minVgprAllocation"));
    /// The memory layout of `minVgprAllocation`.
    public static final MemoryLayout LAYOUT_minVgprAllocation = LAYOUT.select(PathElement.groupElement("minVgprAllocation"));
    /// The [VarHandle] of `minVgprAllocation` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_minVgprAllocation = LAYOUT.arrayElementVarHandle(PathElement.groupElement("minVgprAllocation"));
    /// The byte offset of `maxVgprAllocation`.
    public static final long OFFSET_maxVgprAllocation = LAYOUT.byteOffset(PathElement.groupElement("maxVgprAllocation"));
    /// The memory layout of `maxVgprAllocation`.
    public static final MemoryLayout LAYOUT_maxVgprAllocation = LAYOUT.select(PathElement.groupElement("maxVgprAllocation"));
    /// The [VarHandle] of `maxVgprAllocation` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxVgprAllocation = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxVgprAllocation"));
    /// The byte offset of `vgprAllocationGranularity`.
    public static final long OFFSET_vgprAllocationGranularity = LAYOUT.byteOffset(PathElement.groupElement("vgprAllocationGranularity"));
    /// The memory layout of `vgprAllocationGranularity`.
    public static final MemoryLayout LAYOUT_vgprAllocationGranularity = LAYOUT.select(PathElement.groupElement("vgprAllocationGranularity"));
    /// The [VarHandle] of `vgprAllocationGranularity` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_vgprAllocationGranularity = LAYOUT.arrayElementVarHandle(PathElement.groupElement("vgprAllocationGranularity"));

    /// Creates `VkPhysicalDeviceShaderCorePropertiesAMD` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceShaderCorePropertiesAMD(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceShaderCorePropertiesAMD` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceShaderCorePropertiesAMD` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceShaderCorePropertiesAMD ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderCorePropertiesAMD(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDeviceShaderCorePropertiesAMD` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkPhysicalDeviceShaderCorePropertiesAMD` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceShaderCorePropertiesAMD`
    public static VkPhysicalDeviceShaderCorePropertiesAMD alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceShaderCorePropertiesAMD(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceShaderCorePropertiesAMD` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceShaderCorePropertiesAMD`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceShaderCorePropertiesAMD copyFrom(VkPhysicalDeviceShaderCorePropertiesAMD src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { if (this instanceof Buffer buf) return buf; else return new Buffer(this.segment(), this.estimateCount()); }

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
    public VkPhysicalDeviceShaderCorePropertiesAMD sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceShaderCorePropertiesAMD pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `shaderEngineCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int shaderEngineCount(MemorySegment segment, long index) { return (int) VH_shaderEngineCount.get(segment, 0L, index); }
    /// {@return `shaderEngineCount`}
    public int shaderEngineCount() { return shaderEngineCount(this.segment(), 0L); }
    /// Sets `shaderEngineCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void shaderEngineCount(MemorySegment segment, long index, int value) { VH_shaderEngineCount.set(segment, 0L, index, value); }
    /// Sets `shaderEngineCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderCorePropertiesAMD shaderEngineCount(int value) { shaderEngineCount(this.segment(), 0L, value); return this; }

    /// {@return `shaderArraysPerEngineCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int shaderArraysPerEngineCount(MemorySegment segment, long index) { return (int) VH_shaderArraysPerEngineCount.get(segment, 0L, index); }
    /// {@return `shaderArraysPerEngineCount`}
    public int shaderArraysPerEngineCount() { return shaderArraysPerEngineCount(this.segment(), 0L); }
    /// Sets `shaderArraysPerEngineCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void shaderArraysPerEngineCount(MemorySegment segment, long index, int value) { VH_shaderArraysPerEngineCount.set(segment, 0L, index, value); }
    /// Sets `shaderArraysPerEngineCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderCorePropertiesAMD shaderArraysPerEngineCount(int value) { shaderArraysPerEngineCount(this.segment(), 0L, value); return this; }

    /// {@return `computeUnitsPerShaderArray` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int computeUnitsPerShaderArray(MemorySegment segment, long index) { return (int) VH_computeUnitsPerShaderArray.get(segment, 0L, index); }
    /// {@return `computeUnitsPerShaderArray`}
    public int computeUnitsPerShaderArray() { return computeUnitsPerShaderArray(this.segment(), 0L); }
    /// Sets `computeUnitsPerShaderArray` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void computeUnitsPerShaderArray(MemorySegment segment, long index, int value) { VH_computeUnitsPerShaderArray.set(segment, 0L, index, value); }
    /// Sets `computeUnitsPerShaderArray` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderCorePropertiesAMD computeUnitsPerShaderArray(int value) { computeUnitsPerShaderArray(this.segment(), 0L, value); return this; }

    /// {@return `simdPerComputeUnit` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int simdPerComputeUnit(MemorySegment segment, long index) { return (int) VH_simdPerComputeUnit.get(segment, 0L, index); }
    /// {@return `simdPerComputeUnit`}
    public int simdPerComputeUnit() { return simdPerComputeUnit(this.segment(), 0L); }
    /// Sets `simdPerComputeUnit` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void simdPerComputeUnit(MemorySegment segment, long index, int value) { VH_simdPerComputeUnit.set(segment, 0L, index, value); }
    /// Sets `simdPerComputeUnit` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderCorePropertiesAMD simdPerComputeUnit(int value) { simdPerComputeUnit(this.segment(), 0L, value); return this; }

    /// {@return `wavefrontsPerSimd` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int wavefrontsPerSimd(MemorySegment segment, long index) { return (int) VH_wavefrontsPerSimd.get(segment, 0L, index); }
    /// {@return `wavefrontsPerSimd`}
    public int wavefrontsPerSimd() { return wavefrontsPerSimd(this.segment(), 0L); }
    /// Sets `wavefrontsPerSimd` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void wavefrontsPerSimd(MemorySegment segment, long index, int value) { VH_wavefrontsPerSimd.set(segment, 0L, index, value); }
    /// Sets `wavefrontsPerSimd` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderCorePropertiesAMD wavefrontsPerSimd(int value) { wavefrontsPerSimd(this.segment(), 0L, value); return this; }

    /// {@return `wavefrontSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int wavefrontSize(MemorySegment segment, long index) { return (int) VH_wavefrontSize.get(segment, 0L, index); }
    /// {@return `wavefrontSize`}
    public int wavefrontSize() { return wavefrontSize(this.segment(), 0L); }
    /// Sets `wavefrontSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void wavefrontSize(MemorySegment segment, long index, int value) { VH_wavefrontSize.set(segment, 0L, index, value); }
    /// Sets `wavefrontSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderCorePropertiesAMD wavefrontSize(int value) { wavefrontSize(this.segment(), 0L, value); return this; }

    /// {@return `sgprsPerSimd` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int sgprsPerSimd(MemorySegment segment, long index) { return (int) VH_sgprsPerSimd.get(segment, 0L, index); }
    /// {@return `sgprsPerSimd`}
    public int sgprsPerSimd() { return sgprsPerSimd(this.segment(), 0L); }
    /// Sets `sgprsPerSimd` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void sgprsPerSimd(MemorySegment segment, long index, int value) { VH_sgprsPerSimd.set(segment, 0L, index, value); }
    /// Sets `sgprsPerSimd` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderCorePropertiesAMD sgprsPerSimd(int value) { sgprsPerSimd(this.segment(), 0L, value); return this; }

    /// {@return `minSgprAllocation` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int minSgprAllocation(MemorySegment segment, long index) { return (int) VH_minSgprAllocation.get(segment, 0L, index); }
    /// {@return `minSgprAllocation`}
    public int minSgprAllocation() { return minSgprAllocation(this.segment(), 0L); }
    /// Sets `minSgprAllocation` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void minSgprAllocation(MemorySegment segment, long index, int value) { VH_minSgprAllocation.set(segment, 0L, index, value); }
    /// Sets `minSgprAllocation` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderCorePropertiesAMD minSgprAllocation(int value) { minSgprAllocation(this.segment(), 0L, value); return this; }

    /// {@return `maxSgprAllocation` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxSgprAllocation(MemorySegment segment, long index) { return (int) VH_maxSgprAllocation.get(segment, 0L, index); }
    /// {@return `maxSgprAllocation`}
    public int maxSgprAllocation() { return maxSgprAllocation(this.segment(), 0L); }
    /// Sets `maxSgprAllocation` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxSgprAllocation(MemorySegment segment, long index, int value) { VH_maxSgprAllocation.set(segment, 0L, index, value); }
    /// Sets `maxSgprAllocation` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderCorePropertiesAMD maxSgprAllocation(int value) { maxSgprAllocation(this.segment(), 0L, value); return this; }

    /// {@return `sgprAllocationGranularity` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int sgprAllocationGranularity(MemorySegment segment, long index) { return (int) VH_sgprAllocationGranularity.get(segment, 0L, index); }
    /// {@return `sgprAllocationGranularity`}
    public int sgprAllocationGranularity() { return sgprAllocationGranularity(this.segment(), 0L); }
    /// Sets `sgprAllocationGranularity` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void sgprAllocationGranularity(MemorySegment segment, long index, int value) { VH_sgprAllocationGranularity.set(segment, 0L, index, value); }
    /// Sets `sgprAllocationGranularity` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderCorePropertiesAMD sgprAllocationGranularity(int value) { sgprAllocationGranularity(this.segment(), 0L, value); return this; }

    /// {@return `vgprsPerSimd` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int vgprsPerSimd(MemorySegment segment, long index) { return (int) VH_vgprsPerSimd.get(segment, 0L, index); }
    /// {@return `vgprsPerSimd`}
    public int vgprsPerSimd() { return vgprsPerSimd(this.segment(), 0L); }
    /// Sets `vgprsPerSimd` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void vgprsPerSimd(MemorySegment segment, long index, int value) { VH_vgprsPerSimd.set(segment, 0L, index, value); }
    /// Sets `vgprsPerSimd` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderCorePropertiesAMD vgprsPerSimd(int value) { vgprsPerSimd(this.segment(), 0L, value); return this; }

    /// {@return `minVgprAllocation` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int minVgprAllocation(MemorySegment segment, long index) { return (int) VH_minVgprAllocation.get(segment, 0L, index); }
    /// {@return `minVgprAllocation`}
    public int minVgprAllocation() { return minVgprAllocation(this.segment(), 0L); }
    /// Sets `minVgprAllocation` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void minVgprAllocation(MemorySegment segment, long index, int value) { VH_minVgprAllocation.set(segment, 0L, index, value); }
    /// Sets `minVgprAllocation` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderCorePropertiesAMD minVgprAllocation(int value) { minVgprAllocation(this.segment(), 0L, value); return this; }

    /// {@return `maxVgprAllocation` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxVgprAllocation(MemorySegment segment, long index) { return (int) VH_maxVgprAllocation.get(segment, 0L, index); }
    /// {@return `maxVgprAllocation`}
    public int maxVgprAllocation() { return maxVgprAllocation(this.segment(), 0L); }
    /// Sets `maxVgprAllocation` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxVgprAllocation(MemorySegment segment, long index, int value) { VH_maxVgprAllocation.set(segment, 0L, index, value); }
    /// Sets `maxVgprAllocation` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderCorePropertiesAMD maxVgprAllocation(int value) { maxVgprAllocation(this.segment(), 0L, value); return this; }

    /// {@return `vgprAllocationGranularity` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int vgprAllocationGranularity(MemorySegment segment, long index) { return (int) VH_vgprAllocationGranularity.get(segment, 0L, index); }
    /// {@return `vgprAllocationGranularity`}
    public int vgprAllocationGranularity() { return vgprAllocationGranularity(this.segment(), 0L); }
    /// Sets `vgprAllocationGranularity` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void vgprAllocationGranularity(MemorySegment segment, long index, int value) { VH_vgprAllocationGranularity.set(segment, 0L, index, value); }
    /// Sets `vgprAllocationGranularity` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderCorePropertiesAMD vgprAllocationGranularity(int value) { vgprAllocationGranularity(this.segment(), 0L, value); return this; }

    /// A buffer of [VkPhysicalDeviceShaderCorePropertiesAMD].
    public static final class Buffer extends VkPhysicalDeviceShaderCorePropertiesAMD {
        private final long elementCount;

        /// Creates `VkPhysicalDeviceShaderCorePropertiesAMD.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkPhysicalDeviceShaderCorePropertiesAMD`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkPhysicalDeviceShaderCorePropertiesAMD`
        public VkPhysicalDeviceShaderCorePropertiesAMD asSlice(long index) { return new VkPhysicalDeviceShaderCorePropertiesAMD(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkPhysicalDeviceShaderCorePropertiesAMD`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkPhysicalDeviceShaderCorePropertiesAMD`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index of the struct buffer
        public int sTypeAt(long index) { return sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

        /// {@return `shaderEngineCount` at the given index}
        /// @param index the index of the struct buffer
        public int shaderEngineCountAt(long index) { return shaderEngineCount(this.segment(), index); }
        /// Sets `shaderEngineCount` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer shaderEngineCountAt(long index, int value) { shaderEngineCount(this.segment(), index, value); return this; }

        /// {@return `shaderArraysPerEngineCount` at the given index}
        /// @param index the index of the struct buffer
        public int shaderArraysPerEngineCountAt(long index) { return shaderArraysPerEngineCount(this.segment(), index); }
        /// Sets `shaderArraysPerEngineCount` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer shaderArraysPerEngineCountAt(long index, int value) { shaderArraysPerEngineCount(this.segment(), index, value); return this; }

        /// {@return `computeUnitsPerShaderArray` at the given index}
        /// @param index the index of the struct buffer
        public int computeUnitsPerShaderArrayAt(long index) { return computeUnitsPerShaderArray(this.segment(), index); }
        /// Sets `computeUnitsPerShaderArray` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer computeUnitsPerShaderArrayAt(long index, int value) { computeUnitsPerShaderArray(this.segment(), index, value); return this; }

        /// {@return `simdPerComputeUnit` at the given index}
        /// @param index the index of the struct buffer
        public int simdPerComputeUnitAt(long index) { return simdPerComputeUnit(this.segment(), index); }
        /// Sets `simdPerComputeUnit` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer simdPerComputeUnitAt(long index, int value) { simdPerComputeUnit(this.segment(), index, value); return this; }

        /// {@return `wavefrontsPerSimd` at the given index}
        /// @param index the index of the struct buffer
        public int wavefrontsPerSimdAt(long index) { return wavefrontsPerSimd(this.segment(), index); }
        /// Sets `wavefrontsPerSimd` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer wavefrontsPerSimdAt(long index, int value) { wavefrontsPerSimd(this.segment(), index, value); return this; }

        /// {@return `wavefrontSize` at the given index}
        /// @param index the index of the struct buffer
        public int wavefrontSizeAt(long index) { return wavefrontSize(this.segment(), index); }
        /// Sets `wavefrontSize` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer wavefrontSizeAt(long index, int value) { wavefrontSize(this.segment(), index, value); return this; }

        /// {@return `sgprsPerSimd` at the given index}
        /// @param index the index of the struct buffer
        public int sgprsPerSimdAt(long index) { return sgprsPerSimd(this.segment(), index); }
        /// Sets `sgprsPerSimd` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer sgprsPerSimdAt(long index, int value) { sgprsPerSimd(this.segment(), index, value); return this; }

        /// {@return `minSgprAllocation` at the given index}
        /// @param index the index of the struct buffer
        public int minSgprAllocationAt(long index) { return minSgprAllocation(this.segment(), index); }
        /// Sets `minSgprAllocation` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer minSgprAllocationAt(long index, int value) { minSgprAllocation(this.segment(), index, value); return this; }

        /// {@return `maxSgprAllocation` at the given index}
        /// @param index the index of the struct buffer
        public int maxSgprAllocationAt(long index) { return maxSgprAllocation(this.segment(), index); }
        /// Sets `maxSgprAllocation` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer maxSgprAllocationAt(long index, int value) { maxSgprAllocation(this.segment(), index, value); return this; }

        /// {@return `sgprAllocationGranularity` at the given index}
        /// @param index the index of the struct buffer
        public int sgprAllocationGranularityAt(long index) { return sgprAllocationGranularity(this.segment(), index); }
        /// Sets `sgprAllocationGranularity` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer sgprAllocationGranularityAt(long index, int value) { sgprAllocationGranularity(this.segment(), index, value); return this; }

        /// {@return `vgprsPerSimd` at the given index}
        /// @param index the index of the struct buffer
        public int vgprsPerSimdAt(long index) { return vgprsPerSimd(this.segment(), index); }
        /// Sets `vgprsPerSimd` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer vgprsPerSimdAt(long index, int value) { vgprsPerSimd(this.segment(), index, value); return this; }

        /// {@return `minVgprAllocation` at the given index}
        /// @param index the index of the struct buffer
        public int minVgprAllocationAt(long index) { return minVgprAllocation(this.segment(), index); }
        /// Sets `minVgprAllocation` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer minVgprAllocationAt(long index, int value) { minVgprAllocation(this.segment(), index, value); return this; }

        /// {@return `maxVgprAllocation` at the given index}
        /// @param index the index of the struct buffer
        public int maxVgprAllocationAt(long index) { return maxVgprAllocation(this.segment(), index); }
        /// Sets `maxVgprAllocation` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer maxVgprAllocationAt(long index, int value) { maxVgprAllocation(this.segment(), index, value); return this; }

        /// {@return `vgprAllocationGranularity` at the given index}
        /// @param index the index of the struct buffer
        public int vgprAllocationGranularityAt(long index) { return vgprAllocationGranularity(this.segment(), index); }
        /// Sets `vgprAllocationGranularity` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer vgprAllocationGranularityAt(long index, int value) { vgprAllocationGranularity(this.segment(), index, value); return this; }

    }
}
