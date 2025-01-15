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
package overrungl.vulkan.nv.struct;

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
/// ### shaderGroupHandleSize
/// [VarHandle][#VH_shaderGroupHandleSize] - [Getter][#shaderGroupHandleSize()] - [Setter][#shaderGroupHandleSize(int)]
/// ### maxRecursionDepth
/// [VarHandle][#VH_maxRecursionDepth] - [Getter][#maxRecursionDepth()] - [Setter][#maxRecursionDepth(int)]
/// ### maxShaderGroupStride
/// [VarHandle][#VH_maxShaderGroupStride] - [Getter][#maxShaderGroupStride()] - [Setter][#maxShaderGroupStride(int)]
/// ### shaderGroupBaseAlignment
/// [VarHandle][#VH_shaderGroupBaseAlignment] - [Getter][#shaderGroupBaseAlignment()] - [Setter][#shaderGroupBaseAlignment(int)]
/// ### maxGeometryCount
/// [VarHandle][#VH_maxGeometryCount] - [Getter][#maxGeometryCount()] - [Setter][#maxGeometryCount(long)]
/// ### maxInstanceCount
/// [VarHandle][#VH_maxInstanceCount] - [Getter][#maxInstanceCount()] - [Setter][#maxInstanceCount(long)]
/// ### maxTriangleCount
/// [VarHandle][#VH_maxTriangleCount] - [Getter][#maxTriangleCount()] - [Setter][#maxTriangleCount(long)]
/// ### maxDescriptorSetAccelerationStructures
/// [VarHandle][#VH_maxDescriptorSetAccelerationStructures] - [Getter][#maxDescriptorSetAccelerationStructures()] - [Setter][#maxDescriptorSetAccelerationStructures(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPhysicalDeviceRayTracingPropertiesNV {
///     VkStructureType sType;
///     void * pNext;
///     uint32_t shaderGroupHandleSize;
///     uint32_t maxRecursionDepth;
///     uint32_t maxShaderGroupStride;
///     uint32_t shaderGroupBaseAlignment;
///     uint64_t maxGeometryCount;
///     uint64_t maxInstanceCount;
///     uint64_t maxTriangleCount;
///     uint32_t maxDescriptorSetAccelerationStructures;
/// } VkPhysicalDeviceRayTracingPropertiesNV;
/// ```
public sealed class VkPhysicalDeviceRayTracingPropertiesNV extends Struct {
    /// The struct layout of `VkPhysicalDeviceRayTracingPropertiesNV`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("shaderGroupHandleSize"),
        ValueLayout.JAVA_INT.withName("maxRecursionDepth"),
        ValueLayout.JAVA_INT.withName("maxShaderGroupStride"),
        ValueLayout.JAVA_INT.withName("shaderGroupBaseAlignment"),
        ValueLayout.JAVA_LONG.withName("maxGeometryCount"),
        ValueLayout.JAVA_LONG.withName("maxInstanceCount"),
        ValueLayout.JAVA_LONG.withName("maxTriangleCount"),
        ValueLayout.JAVA_INT.withName("maxDescriptorSetAccelerationStructures")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `shaderGroupHandleSize` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_shaderGroupHandleSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderGroupHandleSize"));
    /// The [VarHandle] of `maxRecursionDepth` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxRecursionDepth = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxRecursionDepth"));
    /// The [VarHandle] of `maxShaderGroupStride` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxShaderGroupStride = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxShaderGroupStride"));
    /// The [VarHandle] of `shaderGroupBaseAlignment` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_shaderGroupBaseAlignment = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderGroupBaseAlignment"));
    /// The [VarHandle] of `maxGeometryCount` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_maxGeometryCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxGeometryCount"));
    /// The [VarHandle] of `maxInstanceCount` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_maxInstanceCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxInstanceCount"));
    /// The [VarHandle] of `maxTriangleCount` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_maxTriangleCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxTriangleCount"));
    /// The [VarHandle] of `maxDescriptorSetAccelerationStructures` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxDescriptorSetAccelerationStructures = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxDescriptorSetAccelerationStructures"));

    /// Creates `VkPhysicalDeviceRayTracingPropertiesNV` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceRayTracingPropertiesNV(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceRayTracingPropertiesNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceRayTracingPropertiesNV of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceRayTracingPropertiesNV(segment); }

    /// Creates `VkPhysicalDeviceRayTracingPropertiesNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceRayTracingPropertiesNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceRayTracingPropertiesNV ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceRayTracingPropertiesNV(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDeviceRayTracingPropertiesNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkPhysicalDeviceRayTracingPropertiesNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceRayTracingPropertiesNV`
    public static VkPhysicalDeviceRayTracingPropertiesNV alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceRayTracingPropertiesNV(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceRayTracingPropertiesNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceRayTracingPropertiesNV`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkPhysicalDeviceRayTracingPropertiesNV` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceRayTracingPropertiesNV`
    public static VkPhysicalDeviceRayTracingPropertiesNV allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("void *") java.lang.foreign.MemorySegment pNext, @CType("uint32_t") int shaderGroupHandleSize, @CType("uint32_t") int maxRecursionDepth, @CType("uint32_t") int maxShaderGroupStride, @CType("uint32_t") int shaderGroupBaseAlignment, @CType("uint64_t") long maxGeometryCount, @CType("uint64_t") long maxInstanceCount, @CType("uint64_t") long maxTriangleCount, @CType("uint32_t") int maxDescriptorSetAccelerationStructures) { return alloc(allocator).sType(sType).pNext(pNext).shaderGroupHandleSize(shaderGroupHandleSize).maxRecursionDepth(maxRecursionDepth).maxShaderGroupStride(maxShaderGroupStride).shaderGroupBaseAlignment(shaderGroupBaseAlignment).maxGeometryCount(maxGeometryCount).maxInstanceCount(maxInstanceCount).maxTriangleCount(maxTriangleCount).maxDescriptorSetAccelerationStructures(maxDescriptorSetAccelerationStructures); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceRayTracingPropertiesNV copyFrom(VkPhysicalDeviceRayTracingPropertiesNV src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPhysicalDeviceRayTracingPropertiesNV.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPhysicalDeviceRayTracingPropertiesNV.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPhysicalDeviceRayTracingPropertiesNV.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceRayTracingPropertiesNV sType(@CType("VkStructureType") int value) { VkPhysicalDeviceRayTracingPropertiesNV.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkPhysicalDeviceRayTracingPropertiesNV.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkPhysicalDeviceRayTracingPropertiesNV.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceRayTracingPropertiesNV.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceRayTracingPropertiesNV pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceRayTracingPropertiesNV.set_pNext(this.segment(), value); return this; }

    /// {@return `shaderGroupHandleSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_shaderGroupHandleSize(MemorySegment segment, long index) { return (int) VH_shaderGroupHandleSize.get(segment, 0L, index); }
    /// {@return `shaderGroupHandleSize`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_shaderGroupHandleSize(MemorySegment segment) { return VkPhysicalDeviceRayTracingPropertiesNV.get_shaderGroupHandleSize(segment, 0L); }
    /// {@return `shaderGroupHandleSize`}
    public @CType("uint32_t") int shaderGroupHandleSize() { return VkPhysicalDeviceRayTracingPropertiesNV.get_shaderGroupHandleSize(this.segment()); }
    /// Sets `shaderGroupHandleSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_shaderGroupHandleSize(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_shaderGroupHandleSize.set(segment, 0L, index, value); }
    /// Sets `shaderGroupHandleSize` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_shaderGroupHandleSize(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceRayTracingPropertiesNV.set_shaderGroupHandleSize(segment, 0L, value); }
    /// Sets `shaderGroupHandleSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceRayTracingPropertiesNV shaderGroupHandleSize(@CType("uint32_t") int value) { VkPhysicalDeviceRayTracingPropertiesNV.set_shaderGroupHandleSize(this.segment(), value); return this; }

    /// {@return `maxRecursionDepth` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxRecursionDepth(MemorySegment segment, long index) { return (int) VH_maxRecursionDepth.get(segment, 0L, index); }
    /// {@return `maxRecursionDepth`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxRecursionDepth(MemorySegment segment) { return VkPhysicalDeviceRayTracingPropertiesNV.get_maxRecursionDepth(segment, 0L); }
    /// {@return `maxRecursionDepth`}
    public @CType("uint32_t") int maxRecursionDepth() { return VkPhysicalDeviceRayTracingPropertiesNV.get_maxRecursionDepth(this.segment()); }
    /// Sets `maxRecursionDepth` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxRecursionDepth(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxRecursionDepth.set(segment, 0L, index, value); }
    /// Sets `maxRecursionDepth` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxRecursionDepth(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceRayTracingPropertiesNV.set_maxRecursionDepth(segment, 0L, value); }
    /// Sets `maxRecursionDepth` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceRayTracingPropertiesNV maxRecursionDepth(@CType("uint32_t") int value) { VkPhysicalDeviceRayTracingPropertiesNV.set_maxRecursionDepth(this.segment(), value); return this; }

    /// {@return `maxShaderGroupStride` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxShaderGroupStride(MemorySegment segment, long index) { return (int) VH_maxShaderGroupStride.get(segment, 0L, index); }
    /// {@return `maxShaderGroupStride`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxShaderGroupStride(MemorySegment segment) { return VkPhysicalDeviceRayTracingPropertiesNV.get_maxShaderGroupStride(segment, 0L); }
    /// {@return `maxShaderGroupStride`}
    public @CType("uint32_t") int maxShaderGroupStride() { return VkPhysicalDeviceRayTracingPropertiesNV.get_maxShaderGroupStride(this.segment()); }
    /// Sets `maxShaderGroupStride` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxShaderGroupStride(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxShaderGroupStride.set(segment, 0L, index, value); }
    /// Sets `maxShaderGroupStride` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxShaderGroupStride(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceRayTracingPropertiesNV.set_maxShaderGroupStride(segment, 0L, value); }
    /// Sets `maxShaderGroupStride` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceRayTracingPropertiesNV maxShaderGroupStride(@CType("uint32_t") int value) { VkPhysicalDeviceRayTracingPropertiesNV.set_maxShaderGroupStride(this.segment(), value); return this; }

    /// {@return `shaderGroupBaseAlignment` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_shaderGroupBaseAlignment(MemorySegment segment, long index) { return (int) VH_shaderGroupBaseAlignment.get(segment, 0L, index); }
    /// {@return `shaderGroupBaseAlignment`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_shaderGroupBaseAlignment(MemorySegment segment) { return VkPhysicalDeviceRayTracingPropertiesNV.get_shaderGroupBaseAlignment(segment, 0L); }
    /// {@return `shaderGroupBaseAlignment`}
    public @CType("uint32_t") int shaderGroupBaseAlignment() { return VkPhysicalDeviceRayTracingPropertiesNV.get_shaderGroupBaseAlignment(this.segment()); }
    /// Sets `shaderGroupBaseAlignment` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_shaderGroupBaseAlignment(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_shaderGroupBaseAlignment.set(segment, 0L, index, value); }
    /// Sets `shaderGroupBaseAlignment` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_shaderGroupBaseAlignment(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceRayTracingPropertiesNV.set_shaderGroupBaseAlignment(segment, 0L, value); }
    /// Sets `shaderGroupBaseAlignment` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceRayTracingPropertiesNV shaderGroupBaseAlignment(@CType("uint32_t") int value) { VkPhysicalDeviceRayTracingPropertiesNV.set_shaderGroupBaseAlignment(this.segment(), value); return this; }

    /// {@return `maxGeometryCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint64_t") long get_maxGeometryCount(MemorySegment segment, long index) { return (long) VH_maxGeometryCount.get(segment, 0L, index); }
    /// {@return `maxGeometryCount`}
    /// @param segment the segment of the struct
    public static @CType("uint64_t") long get_maxGeometryCount(MemorySegment segment) { return VkPhysicalDeviceRayTracingPropertiesNV.get_maxGeometryCount(segment, 0L); }
    /// {@return `maxGeometryCount`}
    public @CType("uint64_t") long maxGeometryCount() { return VkPhysicalDeviceRayTracingPropertiesNV.get_maxGeometryCount(this.segment()); }
    /// Sets `maxGeometryCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxGeometryCount(MemorySegment segment, long index, @CType("uint64_t") long value) { VH_maxGeometryCount.set(segment, 0L, index, value); }
    /// Sets `maxGeometryCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxGeometryCount(MemorySegment segment, @CType("uint64_t") long value) { VkPhysicalDeviceRayTracingPropertiesNV.set_maxGeometryCount(segment, 0L, value); }
    /// Sets `maxGeometryCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceRayTracingPropertiesNV maxGeometryCount(@CType("uint64_t") long value) { VkPhysicalDeviceRayTracingPropertiesNV.set_maxGeometryCount(this.segment(), value); return this; }

    /// {@return `maxInstanceCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint64_t") long get_maxInstanceCount(MemorySegment segment, long index) { return (long) VH_maxInstanceCount.get(segment, 0L, index); }
    /// {@return `maxInstanceCount`}
    /// @param segment the segment of the struct
    public static @CType("uint64_t") long get_maxInstanceCount(MemorySegment segment) { return VkPhysicalDeviceRayTracingPropertiesNV.get_maxInstanceCount(segment, 0L); }
    /// {@return `maxInstanceCount`}
    public @CType("uint64_t") long maxInstanceCount() { return VkPhysicalDeviceRayTracingPropertiesNV.get_maxInstanceCount(this.segment()); }
    /// Sets `maxInstanceCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxInstanceCount(MemorySegment segment, long index, @CType("uint64_t") long value) { VH_maxInstanceCount.set(segment, 0L, index, value); }
    /// Sets `maxInstanceCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxInstanceCount(MemorySegment segment, @CType("uint64_t") long value) { VkPhysicalDeviceRayTracingPropertiesNV.set_maxInstanceCount(segment, 0L, value); }
    /// Sets `maxInstanceCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceRayTracingPropertiesNV maxInstanceCount(@CType("uint64_t") long value) { VkPhysicalDeviceRayTracingPropertiesNV.set_maxInstanceCount(this.segment(), value); return this; }

    /// {@return `maxTriangleCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint64_t") long get_maxTriangleCount(MemorySegment segment, long index) { return (long) VH_maxTriangleCount.get(segment, 0L, index); }
    /// {@return `maxTriangleCount`}
    /// @param segment the segment of the struct
    public static @CType("uint64_t") long get_maxTriangleCount(MemorySegment segment) { return VkPhysicalDeviceRayTracingPropertiesNV.get_maxTriangleCount(segment, 0L); }
    /// {@return `maxTriangleCount`}
    public @CType("uint64_t") long maxTriangleCount() { return VkPhysicalDeviceRayTracingPropertiesNV.get_maxTriangleCount(this.segment()); }
    /// Sets `maxTriangleCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxTriangleCount(MemorySegment segment, long index, @CType("uint64_t") long value) { VH_maxTriangleCount.set(segment, 0L, index, value); }
    /// Sets `maxTriangleCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxTriangleCount(MemorySegment segment, @CType("uint64_t") long value) { VkPhysicalDeviceRayTracingPropertiesNV.set_maxTriangleCount(segment, 0L, value); }
    /// Sets `maxTriangleCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceRayTracingPropertiesNV maxTriangleCount(@CType("uint64_t") long value) { VkPhysicalDeviceRayTracingPropertiesNV.set_maxTriangleCount(this.segment(), value); return this; }

    /// {@return `maxDescriptorSetAccelerationStructures` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxDescriptorSetAccelerationStructures(MemorySegment segment, long index) { return (int) VH_maxDescriptorSetAccelerationStructures.get(segment, 0L, index); }
    /// {@return `maxDescriptorSetAccelerationStructures`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxDescriptorSetAccelerationStructures(MemorySegment segment) { return VkPhysicalDeviceRayTracingPropertiesNV.get_maxDescriptorSetAccelerationStructures(segment, 0L); }
    /// {@return `maxDescriptorSetAccelerationStructures`}
    public @CType("uint32_t") int maxDescriptorSetAccelerationStructures() { return VkPhysicalDeviceRayTracingPropertiesNV.get_maxDescriptorSetAccelerationStructures(this.segment()); }
    /// Sets `maxDescriptorSetAccelerationStructures` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxDescriptorSetAccelerationStructures(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxDescriptorSetAccelerationStructures.set(segment, 0L, index, value); }
    /// Sets `maxDescriptorSetAccelerationStructures` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxDescriptorSetAccelerationStructures(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceRayTracingPropertiesNV.set_maxDescriptorSetAccelerationStructures(segment, 0L, value); }
    /// Sets `maxDescriptorSetAccelerationStructures` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceRayTracingPropertiesNV maxDescriptorSetAccelerationStructures(@CType("uint32_t") int value) { VkPhysicalDeviceRayTracingPropertiesNV.set_maxDescriptorSetAccelerationStructures(this.segment(), value); return this; }

    /// A buffer of [VkPhysicalDeviceRayTracingPropertiesNV].
    public static final class Buffer extends VkPhysicalDeviceRayTracingPropertiesNV {
        private final long elementCount;

        /// Creates `VkPhysicalDeviceRayTracingPropertiesNV.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkPhysicalDeviceRayTracingPropertiesNV`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkPhysicalDeviceRayTracingPropertiesNV`
        public VkPhysicalDeviceRayTracingPropertiesNV asSlice(long index) { return new VkPhysicalDeviceRayTracingPropertiesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkPhysicalDeviceRayTracingPropertiesNV`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkPhysicalDeviceRayTracingPropertiesNV`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkPhysicalDeviceRayTracingPropertiesNV.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkPhysicalDeviceRayTracingPropertiesNV.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkPhysicalDeviceRayTracingPropertiesNV.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceRayTracingPropertiesNV.set_pNext(this.segment(), index, value); return this; }

        /// {@return `shaderGroupHandleSize` at the given index}
        /// @param index the index
        public @CType("uint32_t") int shaderGroupHandleSizeAt(long index) { return VkPhysicalDeviceRayTracingPropertiesNV.get_shaderGroupHandleSize(this.segment(), index); }
        /// Sets `shaderGroupHandleSize` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer shaderGroupHandleSizeAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceRayTracingPropertiesNV.set_shaderGroupHandleSize(this.segment(), index, value); return this; }

        /// {@return `maxRecursionDepth` at the given index}
        /// @param index the index
        public @CType("uint32_t") int maxRecursionDepthAt(long index) { return VkPhysicalDeviceRayTracingPropertiesNV.get_maxRecursionDepth(this.segment(), index); }
        /// Sets `maxRecursionDepth` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maxRecursionDepthAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceRayTracingPropertiesNV.set_maxRecursionDepth(this.segment(), index, value); return this; }

        /// {@return `maxShaderGroupStride` at the given index}
        /// @param index the index
        public @CType("uint32_t") int maxShaderGroupStrideAt(long index) { return VkPhysicalDeviceRayTracingPropertiesNV.get_maxShaderGroupStride(this.segment(), index); }
        /// Sets `maxShaderGroupStride` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maxShaderGroupStrideAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceRayTracingPropertiesNV.set_maxShaderGroupStride(this.segment(), index, value); return this; }

        /// {@return `shaderGroupBaseAlignment` at the given index}
        /// @param index the index
        public @CType("uint32_t") int shaderGroupBaseAlignmentAt(long index) { return VkPhysicalDeviceRayTracingPropertiesNV.get_shaderGroupBaseAlignment(this.segment(), index); }
        /// Sets `shaderGroupBaseAlignment` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer shaderGroupBaseAlignmentAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceRayTracingPropertiesNV.set_shaderGroupBaseAlignment(this.segment(), index, value); return this; }

        /// {@return `maxGeometryCount` at the given index}
        /// @param index the index
        public @CType("uint64_t") long maxGeometryCountAt(long index) { return VkPhysicalDeviceRayTracingPropertiesNV.get_maxGeometryCount(this.segment(), index); }
        /// Sets `maxGeometryCount` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maxGeometryCountAt(long index, @CType("uint64_t") long value) { VkPhysicalDeviceRayTracingPropertiesNV.set_maxGeometryCount(this.segment(), index, value); return this; }

        /// {@return `maxInstanceCount` at the given index}
        /// @param index the index
        public @CType("uint64_t") long maxInstanceCountAt(long index) { return VkPhysicalDeviceRayTracingPropertiesNV.get_maxInstanceCount(this.segment(), index); }
        /// Sets `maxInstanceCount` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maxInstanceCountAt(long index, @CType("uint64_t") long value) { VkPhysicalDeviceRayTracingPropertiesNV.set_maxInstanceCount(this.segment(), index, value); return this; }

        /// {@return `maxTriangleCount` at the given index}
        /// @param index the index
        public @CType("uint64_t") long maxTriangleCountAt(long index) { return VkPhysicalDeviceRayTracingPropertiesNV.get_maxTriangleCount(this.segment(), index); }
        /// Sets `maxTriangleCount` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maxTriangleCountAt(long index, @CType("uint64_t") long value) { VkPhysicalDeviceRayTracingPropertiesNV.set_maxTriangleCount(this.segment(), index, value); return this; }

        /// {@return `maxDescriptorSetAccelerationStructures` at the given index}
        /// @param index the index
        public @CType("uint32_t") int maxDescriptorSetAccelerationStructuresAt(long index) { return VkPhysicalDeviceRayTracingPropertiesNV.get_maxDescriptorSetAccelerationStructures(this.segment(), index); }
        /// Sets `maxDescriptorSetAccelerationStructures` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maxDescriptorSetAccelerationStructuresAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceRayTracingPropertiesNV.set_maxDescriptorSetAccelerationStructures(this.segment(), index, value); return this; }

    }
}
