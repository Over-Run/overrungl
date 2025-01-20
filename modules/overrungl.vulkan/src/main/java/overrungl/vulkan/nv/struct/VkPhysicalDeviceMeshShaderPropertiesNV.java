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
/// [VarHandle][#VH_pNext] - [Getter][#pNext()] - [Setter][#pNext(MemorySegment)]
/// ### maxDrawMeshTasksCount
/// [VarHandle][#VH_maxDrawMeshTasksCount] - [Getter][#maxDrawMeshTasksCount()] - [Setter][#maxDrawMeshTasksCount(int)]
/// ### maxTaskWorkGroupInvocations
/// [VarHandle][#VH_maxTaskWorkGroupInvocations] - [Getter][#maxTaskWorkGroupInvocations()] - [Setter][#maxTaskWorkGroupInvocations(int)]
/// ### maxTaskWorkGroupSize
/// [Byte offset][#OFFSET_maxTaskWorkGroupSize] - [Memory layout][#ML_maxTaskWorkGroupSize] - [Getter][#maxTaskWorkGroupSize()] - [Setter][#maxTaskWorkGroupSize(MemorySegment)]
/// ### maxTaskTotalMemorySize
/// [VarHandle][#VH_maxTaskTotalMemorySize] - [Getter][#maxTaskTotalMemorySize()] - [Setter][#maxTaskTotalMemorySize(int)]
/// ### maxTaskOutputCount
/// [VarHandle][#VH_maxTaskOutputCount] - [Getter][#maxTaskOutputCount()] - [Setter][#maxTaskOutputCount(int)]
/// ### maxMeshWorkGroupInvocations
/// [VarHandle][#VH_maxMeshWorkGroupInvocations] - [Getter][#maxMeshWorkGroupInvocations()] - [Setter][#maxMeshWorkGroupInvocations(int)]
/// ### maxMeshWorkGroupSize
/// [Byte offset][#OFFSET_maxMeshWorkGroupSize] - [Memory layout][#ML_maxMeshWorkGroupSize] - [Getter][#maxMeshWorkGroupSize()] - [Setter][#maxMeshWorkGroupSize(MemorySegment)]
/// ### maxMeshTotalMemorySize
/// [VarHandle][#VH_maxMeshTotalMemorySize] - [Getter][#maxMeshTotalMemorySize()] - [Setter][#maxMeshTotalMemorySize(int)]
/// ### maxMeshOutputVertices
/// [VarHandle][#VH_maxMeshOutputVertices] - [Getter][#maxMeshOutputVertices()] - [Setter][#maxMeshOutputVertices(int)]
/// ### maxMeshOutputPrimitives
/// [VarHandle][#VH_maxMeshOutputPrimitives] - [Getter][#maxMeshOutputPrimitives()] - [Setter][#maxMeshOutputPrimitives(int)]
/// ### maxMeshMultiviewViewCount
/// [VarHandle][#VH_maxMeshMultiviewViewCount] - [Getter][#maxMeshMultiviewViewCount()] - [Setter][#maxMeshMultiviewViewCount(int)]
/// ### meshOutputPerVertexGranularity
/// [VarHandle][#VH_meshOutputPerVertexGranularity] - [Getter][#meshOutputPerVertexGranularity()] - [Setter][#meshOutputPerVertexGranularity(int)]
/// ### meshOutputPerPrimitiveGranularity
/// [VarHandle][#VH_meshOutputPerPrimitiveGranularity] - [Getter][#meshOutputPerPrimitiveGranularity()] - [Setter][#meshOutputPerPrimitiveGranularity(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPhysicalDeviceMeshShaderPropertiesNV {
///     VkStructureType sType;
///     void * pNext;
///     uint32_t maxDrawMeshTasksCount;
///     uint32_t maxTaskWorkGroupInvocations;
///     uint32_t[3] maxTaskWorkGroupSize;
///     uint32_t maxTaskTotalMemorySize;
///     uint32_t maxTaskOutputCount;
///     uint32_t maxMeshWorkGroupInvocations;
///     uint32_t[3] maxMeshWorkGroupSize;
///     uint32_t maxMeshTotalMemorySize;
///     uint32_t maxMeshOutputVertices;
///     uint32_t maxMeshOutputPrimitives;
///     uint32_t maxMeshMultiviewViewCount;
///     uint32_t meshOutputPerVertexGranularity;
///     uint32_t meshOutputPerPrimitiveGranularity;
/// } VkPhysicalDeviceMeshShaderPropertiesNV;
/// ```
public sealed class VkPhysicalDeviceMeshShaderPropertiesNV extends Struct {
    /// The struct layout of `VkPhysicalDeviceMeshShaderPropertiesNV`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("maxDrawMeshTasksCount"),
        ValueLayout.JAVA_INT.withName("maxTaskWorkGroupInvocations"),
        MemoryLayout.sequenceLayout(3, ValueLayout.JAVA_INT).withName("maxTaskWorkGroupSize"),
        ValueLayout.JAVA_INT.withName("maxTaskTotalMemorySize"),
        ValueLayout.JAVA_INT.withName("maxTaskOutputCount"),
        ValueLayout.JAVA_INT.withName("maxMeshWorkGroupInvocations"),
        MemoryLayout.sequenceLayout(3, ValueLayout.JAVA_INT).withName("maxMeshWorkGroupSize"),
        ValueLayout.JAVA_INT.withName("maxMeshTotalMemorySize"),
        ValueLayout.JAVA_INT.withName("maxMeshOutputVertices"),
        ValueLayout.JAVA_INT.withName("maxMeshOutputPrimitives"),
        ValueLayout.JAVA_INT.withName("maxMeshMultiviewViewCount"),
        ValueLayout.JAVA_INT.withName("meshOutputPerVertexGranularity"),
        ValueLayout.JAVA_INT.withName("meshOutputPerPrimitiveGranularity")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `maxDrawMeshTasksCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxDrawMeshTasksCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxDrawMeshTasksCount"));
    /// The [VarHandle] of `maxTaskWorkGroupInvocations` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxTaskWorkGroupInvocations = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxTaskWorkGroupInvocations"));
    /// The byte offset of `maxTaskWorkGroupSize`.
    public static final long OFFSET_maxTaskWorkGroupSize = LAYOUT.byteOffset(PathElement.groupElement("maxTaskWorkGroupSize"));
    /// The memory layout of `maxTaskWorkGroupSize`.
    public static final MemoryLayout ML_maxTaskWorkGroupSize = LAYOUT.select(PathElement.groupElement("maxTaskWorkGroupSize"));
    /// The [VarHandle] of `maxTaskTotalMemorySize` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxTaskTotalMemorySize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxTaskTotalMemorySize"));
    /// The [VarHandle] of `maxTaskOutputCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxTaskOutputCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxTaskOutputCount"));
    /// The [VarHandle] of `maxMeshWorkGroupInvocations` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxMeshWorkGroupInvocations = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxMeshWorkGroupInvocations"));
    /// The byte offset of `maxMeshWorkGroupSize`.
    public static final long OFFSET_maxMeshWorkGroupSize = LAYOUT.byteOffset(PathElement.groupElement("maxMeshWorkGroupSize"));
    /// The memory layout of `maxMeshWorkGroupSize`.
    public static final MemoryLayout ML_maxMeshWorkGroupSize = LAYOUT.select(PathElement.groupElement("maxMeshWorkGroupSize"));
    /// The [VarHandle] of `maxMeshTotalMemorySize` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxMeshTotalMemorySize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxMeshTotalMemorySize"));
    /// The [VarHandle] of `maxMeshOutputVertices` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxMeshOutputVertices = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxMeshOutputVertices"));
    /// The [VarHandle] of `maxMeshOutputPrimitives` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxMeshOutputPrimitives = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxMeshOutputPrimitives"));
    /// The [VarHandle] of `maxMeshMultiviewViewCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxMeshMultiviewViewCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxMeshMultiviewViewCount"));
    /// The [VarHandle] of `meshOutputPerVertexGranularity` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_meshOutputPerVertexGranularity = LAYOUT.arrayElementVarHandle(PathElement.groupElement("meshOutputPerVertexGranularity"));
    /// The [VarHandle] of `meshOutputPerPrimitiveGranularity` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_meshOutputPerPrimitiveGranularity = LAYOUT.arrayElementVarHandle(PathElement.groupElement("meshOutputPerPrimitiveGranularity"));

    /// Creates `VkPhysicalDeviceMeshShaderPropertiesNV` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceMeshShaderPropertiesNV(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceMeshShaderPropertiesNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceMeshShaderPropertiesNV of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceMeshShaderPropertiesNV(segment); }

    /// Creates `VkPhysicalDeviceMeshShaderPropertiesNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceMeshShaderPropertiesNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceMeshShaderPropertiesNV ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceMeshShaderPropertiesNV(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDeviceMeshShaderPropertiesNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkPhysicalDeviceMeshShaderPropertiesNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceMeshShaderPropertiesNV`
    public static VkPhysicalDeviceMeshShaderPropertiesNV alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceMeshShaderPropertiesNV(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceMeshShaderPropertiesNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceMeshShaderPropertiesNV`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkPhysicalDeviceMeshShaderPropertiesNV` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceMeshShaderPropertiesNV`
    public static VkPhysicalDeviceMeshShaderPropertiesNV allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("void *") MemorySegment pNext, @CType("uint32_t") int maxDrawMeshTasksCount, @CType("uint32_t") int maxTaskWorkGroupInvocations, @CType("uint32_t[3]") MemorySegment maxTaskWorkGroupSize, @CType("uint32_t") int maxTaskTotalMemorySize, @CType("uint32_t") int maxTaskOutputCount, @CType("uint32_t") int maxMeshWorkGroupInvocations, @CType("uint32_t[3]") MemorySegment maxMeshWorkGroupSize, @CType("uint32_t") int maxMeshTotalMemorySize, @CType("uint32_t") int maxMeshOutputVertices, @CType("uint32_t") int maxMeshOutputPrimitives, @CType("uint32_t") int maxMeshMultiviewViewCount, @CType("uint32_t") int meshOutputPerVertexGranularity, @CType("uint32_t") int meshOutputPerPrimitiveGranularity) { return alloc(allocator).sType(sType).pNext(pNext).maxDrawMeshTasksCount(maxDrawMeshTasksCount).maxTaskWorkGroupInvocations(maxTaskWorkGroupInvocations).maxTaskWorkGroupSize(maxTaskWorkGroupSize).maxTaskTotalMemorySize(maxTaskTotalMemorySize).maxTaskOutputCount(maxTaskOutputCount).maxMeshWorkGroupInvocations(maxMeshWorkGroupInvocations).maxMeshWorkGroupSize(maxMeshWorkGroupSize).maxMeshTotalMemorySize(maxMeshTotalMemorySize).maxMeshOutputVertices(maxMeshOutputVertices).maxMeshOutputPrimitives(maxMeshOutputPrimitives).maxMeshMultiviewViewCount(maxMeshMultiviewViewCount).meshOutputPerVertexGranularity(meshOutputPerVertexGranularity).meshOutputPerPrimitiveGranularity(meshOutputPerPrimitiveGranularity); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceMeshShaderPropertiesNV copyFrom(VkPhysicalDeviceMeshShaderPropertiesNV src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPhysicalDeviceMeshShaderPropertiesNV.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPhysicalDeviceMeshShaderPropertiesNV.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPhysicalDeviceMeshShaderPropertiesNV.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMeshShaderPropertiesNV sType(@CType("VkStructureType") int value) { VkPhysicalDeviceMeshShaderPropertiesNV.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") MemorySegment get_pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") MemorySegment get_pNext(MemorySegment segment) { return VkPhysicalDeviceMeshShaderPropertiesNV.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("void *") MemorySegment pNext() { return VkPhysicalDeviceMeshShaderPropertiesNV.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") MemorySegment value) { VkPhysicalDeviceMeshShaderPropertiesNV.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMeshShaderPropertiesNV pNext(@CType("void *") MemorySegment value) { VkPhysicalDeviceMeshShaderPropertiesNV.set_pNext(this.segment(), value); return this; }

    /// {@return `maxDrawMeshTasksCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxDrawMeshTasksCount(MemorySegment segment, long index) { return (int) VH_maxDrawMeshTasksCount.get(segment, 0L, index); }
    /// {@return `maxDrawMeshTasksCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxDrawMeshTasksCount(MemorySegment segment) { return VkPhysicalDeviceMeshShaderPropertiesNV.get_maxDrawMeshTasksCount(segment, 0L); }
    /// {@return `maxDrawMeshTasksCount`}
    public @CType("uint32_t") int maxDrawMeshTasksCount() { return VkPhysicalDeviceMeshShaderPropertiesNV.get_maxDrawMeshTasksCount(this.segment()); }
    /// Sets `maxDrawMeshTasksCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxDrawMeshTasksCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxDrawMeshTasksCount.set(segment, 0L, index, value); }
    /// Sets `maxDrawMeshTasksCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxDrawMeshTasksCount(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceMeshShaderPropertiesNV.set_maxDrawMeshTasksCount(segment, 0L, value); }
    /// Sets `maxDrawMeshTasksCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMeshShaderPropertiesNV maxDrawMeshTasksCount(@CType("uint32_t") int value) { VkPhysicalDeviceMeshShaderPropertiesNV.set_maxDrawMeshTasksCount(this.segment(), value); return this; }

    /// {@return `maxTaskWorkGroupInvocations` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxTaskWorkGroupInvocations(MemorySegment segment, long index) { return (int) VH_maxTaskWorkGroupInvocations.get(segment, 0L, index); }
    /// {@return `maxTaskWorkGroupInvocations`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxTaskWorkGroupInvocations(MemorySegment segment) { return VkPhysicalDeviceMeshShaderPropertiesNV.get_maxTaskWorkGroupInvocations(segment, 0L); }
    /// {@return `maxTaskWorkGroupInvocations`}
    public @CType("uint32_t") int maxTaskWorkGroupInvocations() { return VkPhysicalDeviceMeshShaderPropertiesNV.get_maxTaskWorkGroupInvocations(this.segment()); }
    /// Sets `maxTaskWorkGroupInvocations` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxTaskWorkGroupInvocations(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxTaskWorkGroupInvocations.set(segment, 0L, index, value); }
    /// Sets `maxTaskWorkGroupInvocations` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxTaskWorkGroupInvocations(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceMeshShaderPropertiesNV.set_maxTaskWorkGroupInvocations(segment, 0L, value); }
    /// Sets `maxTaskWorkGroupInvocations` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMeshShaderPropertiesNV maxTaskWorkGroupInvocations(@CType("uint32_t") int value) { VkPhysicalDeviceMeshShaderPropertiesNV.set_maxTaskWorkGroupInvocations(this.segment(), value); return this; }

    /// {@return `maxTaskWorkGroupSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t[3]") MemorySegment get_maxTaskWorkGroupSize(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_maxTaskWorkGroupSize, index), ML_maxTaskWorkGroupSize); }
    /// {@return `maxTaskWorkGroupSize`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t[3]") MemorySegment get_maxTaskWorkGroupSize(MemorySegment segment) { return VkPhysicalDeviceMeshShaderPropertiesNV.get_maxTaskWorkGroupSize(segment, 0L); }
    /// {@return `maxTaskWorkGroupSize`}
    public @CType("uint32_t[3]") MemorySegment maxTaskWorkGroupSize() { return VkPhysicalDeviceMeshShaderPropertiesNV.get_maxTaskWorkGroupSize(this.segment()); }
    /// Sets `maxTaskWorkGroupSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxTaskWorkGroupSize(MemorySegment segment, long index, @CType("uint32_t[3]") MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_maxTaskWorkGroupSize, index), ML_maxTaskWorkGroupSize.byteSize()); }
    /// Sets `maxTaskWorkGroupSize` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxTaskWorkGroupSize(MemorySegment segment, @CType("uint32_t[3]") MemorySegment value) { VkPhysicalDeviceMeshShaderPropertiesNV.set_maxTaskWorkGroupSize(segment, 0L, value); }
    /// Sets `maxTaskWorkGroupSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMeshShaderPropertiesNV maxTaskWorkGroupSize(@CType("uint32_t[3]") MemorySegment value) { VkPhysicalDeviceMeshShaderPropertiesNV.set_maxTaskWorkGroupSize(this.segment(), value); return this; }

    /// {@return `maxTaskTotalMemorySize` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxTaskTotalMemorySize(MemorySegment segment, long index) { return (int) VH_maxTaskTotalMemorySize.get(segment, 0L, index); }
    /// {@return `maxTaskTotalMemorySize`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxTaskTotalMemorySize(MemorySegment segment) { return VkPhysicalDeviceMeshShaderPropertiesNV.get_maxTaskTotalMemorySize(segment, 0L); }
    /// {@return `maxTaskTotalMemorySize`}
    public @CType("uint32_t") int maxTaskTotalMemorySize() { return VkPhysicalDeviceMeshShaderPropertiesNV.get_maxTaskTotalMemorySize(this.segment()); }
    /// Sets `maxTaskTotalMemorySize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxTaskTotalMemorySize(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxTaskTotalMemorySize.set(segment, 0L, index, value); }
    /// Sets `maxTaskTotalMemorySize` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxTaskTotalMemorySize(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceMeshShaderPropertiesNV.set_maxTaskTotalMemorySize(segment, 0L, value); }
    /// Sets `maxTaskTotalMemorySize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMeshShaderPropertiesNV maxTaskTotalMemorySize(@CType("uint32_t") int value) { VkPhysicalDeviceMeshShaderPropertiesNV.set_maxTaskTotalMemorySize(this.segment(), value); return this; }

    /// {@return `maxTaskOutputCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxTaskOutputCount(MemorySegment segment, long index) { return (int) VH_maxTaskOutputCount.get(segment, 0L, index); }
    /// {@return `maxTaskOutputCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxTaskOutputCount(MemorySegment segment) { return VkPhysicalDeviceMeshShaderPropertiesNV.get_maxTaskOutputCount(segment, 0L); }
    /// {@return `maxTaskOutputCount`}
    public @CType("uint32_t") int maxTaskOutputCount() { return VkPhysicalDeviceMeshShaderPropertiesNV.get_maxTaskOutputCount(this.segment()); }
    /// Sets `maxTaskOutputCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxTaskOutputCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxTaskOutputCount.set(segment, 0L, index, value); }
    /// Sets `maxTaskOutputCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxTaskOutputCount(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceMeshShaderPropertiesNV.set_maxTaskOutputCount(segment, 0L, value); }
    /// Sets `maxTaskOutputCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMeshShaderPropertiesNV maxTaskOutputCount(@CType("uint32_t") int value) { VkPhysicalDeviceMeshShaderPropertiesNV.set_maxTaskOutputCount(this.segment(), value); return this; }

    /// {@return `maxMeshWorkGroupInvocations` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxMeshWorkGroupInvocations(MemorySegment segment, long index) { return (int) VH_maxMeshWorkGroupInvocations.get(segment, 0L, index); }
    /// {@return `maxMeshWorkGroupInvocations`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxMeshWorkGroupInvocations(MemorySegment segment) { return VkPhysicalDeviceMeshShaderPropertiesNV.get_maxMeshWorkGroupInvocations(segment, 0L); }
    /// {@return `maxMeshWorkGroupInvocations`}
    public @CType("uint32_t") int maxMeshWorkGroupInvocations() { return VkPhysicalDeviceMeshShaderPropertiesNV.get_maxMeshWorkGroupInvocations(this.segment()); }
    /// Sets `maxMeshWorkGroupInvocations` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxMeshWorkGroupInvocations(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxMeshWorkGroupInvocations.set(segment, 0L, index, value); }
    /// Sets `maxMeshWorkGroupInvocations` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxMeshWorkGroupInvocations(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceMeshShaderPropertiesNV.set_maxMeshWorkGroupInvocations(segment, 0L, value); }
    /// Sets `maxMeshWorkGroupInvocations` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMeshShaderPropertiesNV maxMeshWorkGroupInvocations(@CType("uint32_t") int value) { VkPhysicalDeviceMeshShaderPropertiesNV.set_maxMeshWorkGroupInvocations(this.segment(), value); return this; }

    /// {@return `maxMeshWorkGroupSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t[3]") MemorySegment get_maxMeshWorkGroupSize(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_maxMeshWorkGroupSize, index), ML_maxMeshWorkGroupSize); }
    /// {@return `maxMeshWorkGroupSize`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t[3]") MemorySegment get_maxMeshWorkGroupSize(MemorySegment segment) { return VkPhysicalDeviceMeshShaderPropertiesNV.get_maxMeshWorkGroupSize(segment, 0L); }
    /// {@return `maxMeshWorkGroupSize`}
    public @CType("uint32_t[3]") MemorySegment maxMeshWorkGroupSize() { return VkPhysicalDeviceMeshShaderPropertiesNV.get_maxMeshWorkGroupSize(this.segment()); }
    /// Sets `maxMeshWorkGroupSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxMeshWorkGroupSize(MemorySegment segment, long index, @CType("uint32_t[3]") MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_maxMeshWorkGroupSize, index), ML_maxMeshWorkGroupSize.byteSize()); }
    /// Sets `maxMeshWorkGroupSize` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxMeshWorkGroupSize(MemorySegment segment, @CType("uint32_t[3]") MemorySegment value) { VkPhysicalDeviceMeshShaderPropertiesNV.set_maxMeshWorkGroupSize(segment, 0L, value); }
    /// Sets `maxMeshWorkGroupSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMeshShaderPropertiesNV maxMeshWorkGroupSize(@CType("uint32_t[3]") MemorySegment value) { VkPhysicalDeviceMeshShaderPropertiesNV.set_maxMeshWorkGroupSize(this.segment(), value); return this; }

    /// {@return `maxMeshTotalMemorySize` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxMeshTotalMemorySize(MemorySegment segment, long index) { return (int) VH_maxMeshTotalMemorySize.get(segment, 0L, index); }
    /// {@return `maxMeshTotalMemorySize`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxMeshTotalMemorySize(MemorySegment segment) { return VkPhysicalDeviceMeshShaderPropertiesNV.get_maxMeshTotalMemorySize(segment, 0L); }
    /// {@return `maxMeshTotalMemorySize`}
    public @CType("uint32_t") int maxMeshTotalMemorySize() { return VkPhysicalDeviceMeshShaderPropertiesNV.get_maxMeshTotalMemorySize(this.segment()); }
    /// Sets `maxMeshTotalMemorySize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxMeshTotalMemorySize(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxMeshTotalMemorySize.set(segment, 0L, index, value); }
    /// Sets `maxMeshTotalMemorySize` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxMeshTotalMemorySize(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceMeshShaderPropertiesNV.set_maxMeshTotalMemorySize(segment, 0L, value); }
    /// Sets `maxMeshTotalMemorySize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMeshShaderPropertiesNV maxMeshTotalMemorySize(@CType("uint32_t") int value) { VkPhysicalDeviceMeshShaderPropertiesNV.set_maxMeshTotalMemorySize(this.segment(), value); return this; }

    /// {@return `maxMeshOutputVertices` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxMeshOutputVertices(MemorySegment segment, long index) { return (int) VH_maxMeshOutputVertices.get(segment, 0L, index); }
    /// {@return `maxMeshOutputVertices`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxMeshOutputVertices(MemorySegment segment) { return VkPhysicalDeviceMeshShaderPropertiesNV.get_maxMeshOutputVertices(segment, 0L); }
    /// {@return `maxMeshOutputVertices`}
    public @CType("uint32_t") int maxMeshOutputVertices() { return VkPhysicalDeviceMeshShaderPropertiesNV.get_maxMeshOutputVertices(this.segment()); }
    /// Sets `maxMeshOutputVertices` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxMeshOutputVertices(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxMeshOutputVertices.set(segment, 0L, index, value); }
    /// Sets `maxMeshOutputVertices` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxMeshOutputVertices(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceMeshShaderPropertiesNV.set_maxMeshOutputVertices(segment, 0L, value); }
    /// Sets `maxMeshOutputVertices` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMeshShaderPropertiesNV maxMeshOutputVertices(@CType("uint32_t") int value) { VkPhysicalDeviceMeshShaderPropertiesNV.set_maxMeshOutputVertices(this.segment(), value); return this; }

    /// {@return `maxMeshOutputPrimitives` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxMeshOutputPrimitives(MemorySegment segment, long index) { return (int) VH_maxMeshOutputPrimitives.get(segment, 0L, index); }
    /// {@return `maxMeshOutputPrimitives`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxMeshOutputPrimitives(MemorySegment segment) { return VkPhysicalDeviceMeshShaderPropertiesNV.get_maxMeshOutputPrimitives(segment, 0L); }
    /// {@return `maxMeshOutputPrimitives`}
    public @CType("uint32_t") int maxMeshOutputPrimitives() { return VkPhysicalDeviceMeshShaderPropertiesNV.get_maxMeshOutputPrimitives(this.segment()); }
    /// Sets `maxMeshOutputPrimitives` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxMeshOutputPrimitives(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxMeshOutputPrimitives.set(segment, 0L, index, value); }
    /// Sets `maxMeshOutputPrimitives` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxMeshOutputPrimitives(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceMeshShaderPropertiesNV.set_maxMeshOutputPrimitives(segment, 0L, value); }
    /// Sets `maxMeshOutputPrimitives` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMeshShaderPropertiesNV maxMeshOutputPrimitives(@CType("uint32_t") int value) { VkPhysicalDeviceMeshShaderPropertiesNV.set_maxMeshOutputPrimitives(this.segment(), value); return this; }

    /// {@return `maxMeshMultiviewViewCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxMeshMultiviewViewCount(MemorySegment segment, long index) { return (int) VH_maxMeshMultiviewViewCount.get(segment, 0L, index); }
    /// {@return `maxMeshMultiviewViewCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxMeshMultiviewViewCount(MemorySegment segment) { return VkPhysicalDeviceMeshShaderPropertiesNV.get_maxMeshMultiviewViewCount(segment, 0L); }
    /// {@return `maxMeshMultiviewViewCount`}
    public @CType("uint32_t") int maxMeshMultiviewViewCount() { return VkPhysicalDeviceMeshShaderPropertiesNV.get_maxMeshMultiviewViewCount(this.segment()); }
    /// Sets `maxMeshMultiviewViewCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxMeshMultiviewViewCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxMeshMultiviewViewCount.set(segment, 0L, index, value); }
    /// Sets `maxMeshMultiviewViewCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxMeshMultiviewViewCount(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceMeshShaderPropertiesNV.set_maxMeshMultiviewViewCount(segment, 0L, value); }
    /// Sets `maxMeshMultiviewViewCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMeshShaderPropertiesNV maxMeshMultiviewViewCount(@CType("uint32_t") int value) { VkPhysicalDeviceMeshShaderPropertiesNV.set_maxMeshMultiviewViewCount(this.segment(), value); return this; }

    /// {@return `meshOutputPerVertexGranularity` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_meshOutputPerVertexGranularity(MemorySegment segment, long index) { return (int) VH_meshOutputPerVertexGranularity.get(segment, 0L, index); }
    /// {@return `meshOutputPerVertexGranularity`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_meshOutputPerVertexGranularity(MemorySegment segment) { return VkPhysicalDeviceMeshShaderPropertiesNV.get_meshOutputPerVertexGranularity(segment, 0L); }
    /// {@return `meshOutputPerVertexGranularity`}
    public @CType("uint32_t") int meshOutputPerVertexGranularity() { return VkPhysicalDeviceMeshShaderPropertiesNV.get_meshOutputPerVertexGranularity(this.segment()); }
    /// Sets `meshOutputPerVertexGranularity` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_meshOutputPerVertexGranularity(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_meshOutputPerVertexGranularity.set(segment, 0L, index, value); }
    /// Sets `meshOutputPerVertexGranularity` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_meshOutputPerVertexGranularity(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceMeshShaderPropertiesNV.set_meshOutputPerVertexGranularity(segment, 0L, value); }
    /// Sets `meshOutputPerVertexGranularity` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMeshShaderPropertiesNV meshOutputPerVertexGranularity(@CType("uint32_t") int value) { VkPhysicalDeviceMeshShaderPropertiesNV.set_meshOutputPerVertexGranularity(this.segment(), value); return this; }

    /// {@return `meshOutputPerPrimitiveGranularity` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_meshOutputPerPrimitiveGranularity(MemorySegment segment, long index) { return (int) VH_meshOutputPerPrimitiveGranularity.get(segment, 0L, index); }
    /// {@return `meshOutputPerPrimitiveGranularity`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_meshOutputPerPrimitiveGranularity(MemorySegment segment) { return VkPhysicalDeviceMeshShaderPropertiesNV.get_meshOutputPerPrimitiveGranularity(segment, 0L); }
    /// {@return `meshOutputPerPrimitiveGranularity`}
    public @CType("uint32_t") int meshOutputPerPrimitiveGranularity() { return VkPhysicalDeviceMeshShaderPropertiesNV.get_meshOutputPerPrimitiveGranularity(this.segment()); }
    /// Sets `meshOutputPerPrimitiveGranularity` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_meshOutputPerPrimitiveGranularity(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_meshOutputPerPrimitiveGranularity.set(segment, 0L, index, value); }
    /// Sets `meshOutputPerPrimitiveGranularity` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_meshOutputPerPrimitiveGranularity(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceMeshShaderPropertiesNV.set_meshOutputPerPrimitiveGranularity(segment, 0L, value); }
    /// Sets `meshOutputPerPrimitiveGranularity` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMeshShaderPropertiesNV meshOutputPerPrimitiveGranularity(@CType("uint32_t") int value) { VkPhysicalDeviceMeshShaderPropertiesNV.set_meshOutputPerPrimitiveGranularity(this.segment(), value); return this; }

    /// A buffer of [VkPhysicalDeviceMeshShaderPropertiesNV].
    public static final class Buffer extends VkPhysicalDeviceMeshShaderPropertiesNV {
        private final long elementCount;

        /// Creates `VkPhysicalDeviceMeshShaderPropertiesNV.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkPhysicalDeviceMeshShaderPropertiesNV`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkPhysicalDeviceMeshShaderPropertiesNV`
        public VkPhysicalDeviceMeshShaderPropertiesNV asSlice(long index) { return new VkPhysicalDeviceMeshShaderPropertiesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkPhysicalDeviceMeshShaderPropertiesNV`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkPhysicalDeviceMeshShaderPropertiesNV`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkPhysicalDeviceMeshShaderPropertiesNV.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkPhysicalDeviceMeshShaderPropertiesNV.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("void *") MemorySegment pNextAt(long index) { return VkPhysicalDeviceMeshShaderPropertiesNV.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("void *") MemorySegment value) { VkPhysicalDeviceMeshShaderPropertiesNV.set_pNext(this.segment(), index, value); return this; }

        /// {@return `maxDrawMeshTasksCount` at the given index}
        /// @param index the index
        public @CType("uint32_t") int maxDrawMeshTasksCountAt(long index) { return VkPhysicalDeviceMeshShaderPropertiesNV.get_maxDrawMeshTasksCount(this.segment(), index); }
        /// Sets `maxDrawMeshTasksCount` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maxDrawMeshTasksCountAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceMeshShaderPropertiesNV.set_maxDrawMeshTasksCount(this.segment(), index, value); return this; }

        /// {@return `maxTaskWorkGroupInvocations` at the given index}
        /// @param index the index
        public @CType("uint32_t") int maxTaskWorkGroupInvocationsAt(long index) { return VkPhysicalDeviceMeshShaderPropertiesNV.get_maxTaskWorkGroupInvocations(this.segment(), index); }
        /// Sets `maxTaskWorkGroupInvocations` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maxTaskWorkGroupInvocationsAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceMeshShaderPropertiesNV.set_maxTaskWorkGroupInvocations(this.segment(), index, value); return this; }

        /// {@return `maxTaskWorkGroupSize` at the given index}
        /// @param index the index
        public @CType("uint32_t[3]") MemorySegment maxTaskWorkGroupSizeAt(long index) { return VkPhysicalDeviceMeshShaderPropertiesNV.get_maxTaskWorkGroupSize(this.segment(), index); }
        /// Sets `maxTaskWorkGroupSize` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maxTaskWorkGroupSizeAt(long index, @CType("uint32_t[3]") MemorySegment value) { VkPhysicalDeviceMeshShaderPropertiesNV.set_maxTaskWorkGroupSize(this.segment(), index, value); return this; }

        /// {@return `maxTaskTotalMemorySize` at the given index}
        /// @param index the index
        public @CType("uint32_t") int maxTaskTotalMemorySizeAt(long index) { return VkPhysicalDeviceMeshShaderPropertiesNV.get_maxTaskTotalMemorySize(this.segment(), index); }
        /// Sets `maxTaskTotalMemorySize` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maxTaskTotalMemorySizeAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceMeshShaderPropertiesNV.set_maxTaskTotalMemorySize(this.segment(), index, value); return this; }

        /// {@return `maxTaskOutputCount` at the given index}
        /// @param index the index
        public @CType("uint32_t") int maxTaskOutputCountAt(long index) { return VkPhysicalDeviceMeshShaderPropertiesNV.get_maxTaskOutputCount(this.segment(), index); }
        /// Sets `maxTaskOutputCount` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maxTaskOutputCountAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceMeshShaderPropertiesNV.set_maxTaskOutputCount(this.segment(), index, value); return this; }

        /// {@return `maxMeshWorkGroupInvocations` at the given index}
        /// @param index the index
        public @CType("uint32_t") int maxMeshWorkGroupInvocationsAt(long index) { return VkPhysicalDeviceMeshShaderPropertiesNV.get_maxMeshWorkGroupInvocations(this.segment(), index); }
        /// Sets `maxMeshWorkGroupInvocations` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maxMeshWorkGroupInvocationsAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceMeshShaderPropertiesNV.set_maxMeshWorkGroupInvocations(this.segment(), index, value); return this; }

        /// {@return `maxMeshWorkGroupSize` at the given index}
        /// @param index the index
        public @CType("uint32_t[3]") MemorySegment maxMeshWorkGroupSizeAt(long index) { return VkPhysicalDeviceMeshShaderPropertiesNV.get_maxMeshWorkGroupSize(this.segment(), index); }
        /// Sets `maxMeshWorkGroupSize` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maxMeshWorkGroupSizeAt(long index, @CType("uint32_t[3]") MemorySegment value) { VkPhysicalDeviceMeshShaderPropertiesNV.set_maxMeshWorkGroupSize(this.segment(), index, value); return this; }

        /// {@return `maxMeshTotalMemorySize` at the given index}
        /// @param index the index
        public @CType("uint32_t") int maxMeshTotalMemorySizeAt(long index) { return VkPhysicalDeviceMeshShaderPropertiesNV.get_maxMeshTotalMemorySize(this.segment(), index); }
        /// Sets `maxMeshTotalMemorySize` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maxMeshTotalMemorySizeAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceMeshShaderPropertiesNV.set_maxMeshTotalMemorySize(this.segment(), index, value); return this; }

        /// {@return `maxMeshOutputVertices` at the given index}
        /// @param index the index
        public @CType("uint32_t") int maxMeshOutputVerticesAt(long index) { return VkPhysicalDeviceMeshShaderPropertiesNV.get_maxMeshOutputVertices(this.segment(), index); }
        /// Sets `maxMeshOutputVertices` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maxMeshOutputVerticesAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceMeshShaderPropertiesNV.set_maxMeshOutputVertices(this.segment(), index, value); return this; }

        /// {@return `maxMeshOutputPrimitives` at the given index}
        /// @param index the index
        public @CType("uint32_t") int maxMeshOutputPrimitivesAt(long index) { return VkPhysicalDeviceMeshShaderPropertiesNV.get_maxMeshOutputPrimitives(this.segment(), index); }
        /// Sets `maxMeshOutputPrimitives` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maxMeshOutputPrimitivesAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceMeshShaderPropertiesNV.set_maxMeshOutputPrimitives(this.segment(), index, value); return this; }

        /// {@return `maxMeshMultiviewViewCount` at the given index}
        /// @param index the index
        public @CType("uint32_t") int maxMeshMultiviewViewCountAt(long index) { return VkPhysicalDeviceMeshShaderPropertiesNV.get_maxMeshMultiviewViewCount(this.segment(), index); }
        /// Sets `maxMeshMultiviewViewCount` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maxMeshMultiviewViewCountAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceMeshShaderPropertiesNV.set_maxMeshMultiviewViewCount(this.segment(), index, value); return this; }

        /// {@return `meshOutputPerVertexGranularity` at the given index}
        /// @param index the index
        public @CType("uint32_t") int meshOutputPerVertexGranularityAt(long index) { return VkPhysicalDeviceMeshShaderPropertiesNV.get_meshOutputPerVertexGranularity(this.segment(), index); }
        /// Sets `meshOutputPerVertexGranularity` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer meshOutputPerVertexGranularityAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceMeshShaderPropertiesNV.set_meshOutputPerVertexGranularity(this.segment(), index, value); return this; }

        /// {@return `meshOutputPerPrimitiveGranularity` at the given index}
        /// @param index the index
        public @CType("uint32_t") int meshOutputPerPrimitiveGranularityAt(long index) { return VkPhysicalDeviceMeshShaderPropertiesNV.get_meshOutputPerPrimitiveGranularity(this.segment(), index); }
        /// Sets `meshOutputPerPrimitiveGranularity` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer meshOutputPerPrimitiveGranularityAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceMeshShaderPropertiesNV.set_meshOutputPerPrimitiveGranularity(this.segment(), index, value); return this; }

    }
}
