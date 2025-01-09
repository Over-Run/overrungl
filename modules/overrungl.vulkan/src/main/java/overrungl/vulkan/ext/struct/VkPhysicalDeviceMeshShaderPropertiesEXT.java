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
package overrungl.vulkan.ext.struct;

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
/// ### maxTaskWorkGroupTotalCount
/// [VarHandle][#VH_maxTaskWorkGroupTotalCount] - [Getter][#maxTaskWorkGroupTotalCount()] - [Setter][#maxTaskWorkGroupTotalCount(int)]
/// ### maxTaskWorkGroupCount
/// [Byte offset][#OFFSET_maxTaskWorkGroupCount] - [Memory layout][#ML_maxTaskWorkGroupCount] - [Getter][#maxTaskWorkGroupCount()] - [Setter][#maxTaskWorkGroupCount(java.lang.foreign.MemorySegment)]
/// ### maxTaskWorkGroupInvocations
/// [VarHandle][#VH_maxTaskWorkGroupInvocations] - [Getter][#maxTaskWorkGroupInvocations()] - [Setter][#maxTaskWorkGroupInvocations(int)]
/// ### maxTaskWorkGroupSize
/// [Byte offset][#OFFSET_maxTaskWorkGroupSize] - [Memory layout][#ML_maxTaskWorkGroupSize] - [Getter][#maxTaskWorkGroupSize()] - [Setter][#maxTaskWorkGroupSize(java.lang.foreign.MemorySegment)]
/// ### maxTaskPayloadSize
/// [VarHandle][#VH_maxTaskPayloadSize] - [Getter][#maxTaskPayloadSize()] - [Setter][#maxTaskPayloadSize(int)]
/// ### maxTaskSharedMemorySize
/// [VarHandle][#VH_maxTaskSharedMemorySize] - [Getter][#maxTaskSharedMemorySize()] - [Setter][#maxTaskSharedMemorySize(int)]
/// ### maxTaskPayloadAndSharedMemorySize
/// [VarHandle][#VH_maxTaskPayloadAndSharedMemorySize] - [Getter][#maxTaskPayloadAndSharedMemorySize()] - [Setter][#maxTaskPayloadAndSharedMemorySize(int)]
/// ### maxMeshWorkGroupTotalCount
/// [VarHandle][#VH_maxMeshWorkGroupTotalCount] - [Getter][#maxMeshWorkGroupTotalCount()] - [Setter][#maxMeshWorkGroupTotalCount(int)]
/// ### maxMeshWorkGroupCount
/// [Byte offset][#OFFSET_maxMeshWorkGroupCount] - [Memory layout][#ML_maxMeshWorkGroupCount] - [Getter][#maxMeshWorkGroupCount()] - [Setter][#maxMeshWorkGroupCount(java.lang.foreign.MemorySegment)]
/// ### maxMeshWorkGroupInvocations
/// [VarHandle][#VH_maxMeshWorkGroupInvocations] - [Getter][#maxMeshWorkGroupInvocations()] - [Setter][#maxMeshWorkGroupInvocations(int)]
/// ### maxMeshWorkGroupSize
/// [Byte offset][#OFFSET_maxMeshWorkGroupSize] - [Memory layout][#ML_maxMeshWorkGroupSize] - [Getter][#maxMeshWorkGroupSize()] - [Setter][#maxMeshWorkGroupSize(java.lang.foreign.MemorySegment)]
/// ### maxMeshSharedMemorySize
/// [VarHandle][#VH_maxMeshSharedMemorySize] - [Getter][#maxMeshSharedMemorySize()] - [Setter][#maxMeshSharedMemorySize(int)]
/// ### maxMeshPayloadAndSharedMemorySize
/// [VarHandle][#VH_maxMeshPayloadAndSharedMemorySize] - [Getter][#maxMeshPayloadAndSharedMemorySize()] - [Setter][#maxMeshPayloadAndSharedMemorySize(int)]
/// ### maxMeshOutputMemorySize
/// [VarHandle][#VH_maxMeshOutputMemorySize] - [Getter][#maxMeshOutputMemorySize()] - [Setter][#maxMeshOutputMemorySize(int)]
/// ### maxMeshPayloadAndOutputMemorySize
/// [VarHandle][#VH_maxMeshPayloadAndOutputMemorySize] - [Getter][#maxMeshPayloadAndOutputMemorySize()] - [Setter][#maxMeshPayloadAndOutputMemorySize(int)]
/// ### maxMeshOutputComponents
/// [VarHandle][#VH_maxMeshOutputComponents] - [Getter][#maxMeshOutputComponents()] - [Setter][#maxMeshOutputComponents(int)]
/// ### maxMeshOutputVertices
/// [VarHandle][#VH_maxMeshOutputVertices] - [Getter][#maxMeshOutputVertices()] - [Setter][#maxMeshOutputVertices(int)]
/// ### maxMeshOutputPrimitives
/// [VarHandle][#VH_maxMeshOutputPrimitives] - [Getter][#maxMeshOutputPrimitives()] - [Setter][#maxMeshOutputPrimitives(int)]
/// ### maxMeshOutputLayers
/// [VarHandle][#VH_maxMeshOutputLayers] - [Getter][#maxMeshOutputLayers()] - [Setter][#maxMeshOutputLayers(int)]
/// ### maxMeshMultiviewViewCount
/// [VarHandle][#VH_maxMeshMultiviewViewCount] - [Getter][#maxMeshMultiviewViewCount()] - [Setter][#maxMeshMultiviewViewCount(int)]
/// ### meshOutputPerVertexGranularity
/// [VarHandle][#VH_meshOutputPerVertexGranularity] - [Getter][#meshOutputPerVertexGranularity()] - [Setter][#meshOutputPerVertexGranularity(int)]
/// ### meshOutputPerPrimitiveGranularity
/// [VarHandle][#VH_meshOutputPerPrimitiveGranularity] - [Getter][#meshOutputPerPrimitiveGranularity()] - [Setter][#meshOutputPerPrimitiveGranularity(int)]
/// ### maxPreferredTaskWorkGroupInvocations
/// [VarHandle][#VH_maxPreferredTaskWorkGroupInvocations] - [Getter][#maxPreferredTaskWorkGroupInvocations()] - [Setter][#maxPreferredTaskWorkGroupInvocations(int)]
/// ### maxPreferredMeshWorkGroupInvocations
/// [VarHandle][#VH_maxPreferredMeshWorkGroupInvocations] - [Getter][#maxPreferredMeshWorkGroupInvocations()] - [Setter][#maxPreferredMeshWorkGroupInvocations(int)]
/// ### prefersLocalInvocationVertexOutput
/// [VarHandle][#VH_prefersLocalInvocationVertexOutput] - [Getter][#prefersLocalInvocationVertexOutput()] - [Setter][#prefersLocalInvocationVertexOutput(int)]
/// ### prefersLocalInvocationPrimitiveOutput
/// [VarHandle][#VH_prefersLocalInvocationPrimitiveOutput] - [Getter][#prefersLocalInvocationPrimitiveOutput()] - [Setter][#prefersLocalInvocationPrimitiveOutput(int)]
/// ### prefersCompactVertexOutput
/// [VarHandle][#VH_prefersCompactVertexOutput] - [Getter][#prefersCompactVertexOutput()] - [Setter][#prefersCompactVertexOutput(int)]
/// ### prefersCompactPrimitiveOutput
/// [VarHandle][#VH_prefersCompactPrimitiveOutput] - [Getter][#prefersCompactPrimitiveOutput()] - [Setter][#prefersCompactPrimitiveOutput(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPhysicalDeviceMeshShaderPropertiesEXT {
///     VkStructureType sType;
///     void * pNext;
///     uint32_t maxTaskWorkGroupTotalCount;
///     uint32_t[3] maxTaskWorkGroupCount;
///     uint32_t maxTaskWorkGroupInvocations;
///     uint32_t[3] maxTaskWorkGroupSize;
///     uint32_t maxTaskPayloadSize;
///     uint32_t maxTaskSharedMemorySize;
///     uint32_t maxTaskPayloadAndSharedMemorySize;
///     uint32_t maxMeshWorkGroupTotalCount;
///     uint32_t[3] maxMeshWorkGroupCount;
///     uint32_t maxMeshWorkGroupInvocations;
///     uint32_t[3] maxMeshWorkGroupSize;
///     uint32_t maxMeshSharedMemorySize;
///     uint32_t maxMeshPayloadAndSharedMemorySize;
///     uint32_t maxMeshOutputMemorySize;
///     uint32_t maxMeshPayloadAndOutputMemorySize;
///     uint32_t maxMeshOutputComponents;
///     uint32_t maxMeshOutputVertices;
///     uint32_t maxMeshOutputPrimitives;
///     uint32_t maxMeshOutputLayers;
///     uint32_t maxMeshMultiviewViewCount;
///     uint32_t meshOutputPerVertexGranularity;
///     uint32_t meshOutputPerPrimitiveGranularity;
///     uint32_t maxPreferredTaskWorkGroupInvocations;
///     uint32_t maxPreferredMeshWorkGroupInvocations;
///     VkBool32 prefersLocalInvocationVertexOutput;
///     VkBool32 prefersLocalInvocationPrimitiveOutput;
///     VkBool32 prefersCompactVertexOutput;
///     VkBool32 prefersCompactPrimitiveOutput;
/// } VkPhysicalDeviceMeshShaderPropertiesEXT;
/// ```
public final class VkPhysicalDeviceMeshShaderPropertiesEXT extends Struct {
    /// The struct layout of `VkPhysicalDeviceMeshShaderPropertiesEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("maxTaskWorkGroupTotalCount"),
        MemoryLayout.sequenceLayout(3, ValueLayout.JAVA_INT).withName("maxTaskWorkGroupCount"),
        ValueLayout.JAVA_INT.withName("maxTaskWorkGroupInvocations"),
        MemoryLayout.sequenceLayout(3, ValueLayout.JAVA_INT).withName("maxTaskWorkGroupSize"),
        ValueLayout.JAVA_INT.withName("maxTaskPayloadSize"),
        ValueLayout.JAVA_INT.withName("maxTaskSharedMemorySize"),
        ValueLayout.JAVA_INT.withName("maxTaskPayloadAndSharedMemorySize"),
        ValueLayout.JAVA_INT.withName("maxMeshWorkGroupTotalCount"),
        MemoryLayout.sequenceLayout(3, ValueLayout.JAVA_INT).withName("maxMeshWorkGroupCount"),
        ValueLayout.JAVA_INT.withName("maxMeshWorkGroupInvocations"),
        MemoryLayout.sequenceLayout(3, ValueLayout.JAVA_INT).withName("maxMeshWorkGroupSize"),
        ValueLayout.JAVA_INT.withName("maxMeshSharedMemorySize"),
        ValueLayout.JAVA_INT.withName("maxMeshPayloadAndSharedMemorySize"),
        ValueLayout.JAVA_INT.withName("maxMeshOutputMemorySize"),
        ValueLayout.JAVA_INT.withName("maxMeshPayloadAndOutputMemorySize"),
        ValueLayout.JAVA_INT.withName("maxMeshOutputComponents"),
        ValueLayout.JAVA_INT.withName("maxMeshOutputVertices"),
        ValueLayout.JAVA_INT.withName("maxMeshOutputPrimitives"),
        ValueLayout.JAVA_INT.withName("maxMeshOutputLayers"),
        ValueLayout.JAVA_INT.withName("maxMeshMultiviewViewCount"),
        ValueLayout.JAVA_INT.withName("meshOutputPerVertexGranularity"),
        ValueLayout.JAVA_INT.withName("meshOutputPerPrimitiveGranularity"),
        ValueLayout.JAVA_INT.withName("maxPreferredTaskWorkGroupInvocations"),
        ValueLayout.JAVA_INT.withName("maxPreferredMeshWorkGroupInvocations"),
        ValueLayout.JAVA_INT.withName("prefersLocalInvocationVertexOutput"),
        ValueLayout.JAVA_INT.withName("prefersLocalInvocationPrimitiveOutput"),
        ValueLayout.JAVA_INT.withName("prefersCompactVertexOutput"),
        ValueLayout.JAVA_INT.withName("prefersCompactPrimitiveOutput")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `maxTaskWorkGroupTotalCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxTaskWorkGroupTotalCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxTaskWorkGroupTotalCount"));
    /// The byte offset of `maxTaskWorkGroupCount`.
    public static final long OFFSET_maxTaskWorkGroupCount = LAYOUT.byteOffset(PathElement.groupElement("maxTaskWorkGroupCount"));
    /// The memory layout of `maxTaskWorkGroupCount`.
    public static final MemoryLayout ML_maxTaskWorkGroupCount = LAYOUT.select(PathElement.groupElement("maxTaskWorkGroupCount"));
    /// The [VarHandle] of `maxTaskWorkGroupInvocations` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxTaskWorkGroupInvocations = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxTaskWorkGroupInvocations"));
    /// The byte offset of `maxTaskWorkGroupSize`.
    public static final long OFFSET_maxTaskWorkGroupSize = LAYOUT.byteOffset(PathElement.groupElement("maxTaskWorkGroupSize"));
    /// The memory layout of `maxTaskWorkGroupSize`.
    public static final MemoryLayout ML_maxTaskWorkGroupSize = LAYOUT.select(PathElement.groupElement("maxTaskWorkGroupSize"));
    /// The [VarHandle] of `maxTaskPayloadSize` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxTaskPayloadSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxTaskPayloadSize"));
    /// The [VarHandle] of `maxTaskSharedMemorySize` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxTaskSharedMemorySize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxTaskSharedMemorySize"));
    /// The [VarHandle] of `maxTaskPayloadAndSharedMemorySize` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxTaskPayloadAndSharedMemorySize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxTaskPayloadAndSharedMemorySize"));
    /// The [VarHandle] of `maxMeshWorkGroupTotalCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxMeshWorkGroupTotalCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxMeshWorkGroupTotalCount"));
    /// The byte offset of `maxMeshWorkGroupCount`.
    public static final long OFFSET_maxMeshWorkGroupCount = LAYOUT.byteOffset(PathElement.groupElement("maxMeshWorkGroupCount"));
    /// The memory layout of `maxMeshWorkGroupCount`.
    public static final MemoryLayout ML_maxMeshWorkGroupCount = LAYOUT.select(PathElement.groupElement("maxMeshWorkGroupCount"));
    /// The [VarHandle] of `maxMeshWorkGroupInvocations` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxMeshWorkGroupInvocations = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxMeshWorkGroupInvocations"));
    /// The byte offset of `maxMeshWorkGroupSize`.
    public static final long OFFSET_maxMeshWorkGroupSize = LAYOUT.byteOffset(PathElement.groupElement("maxMeshWorkGroupSize"));
    /// The memory layout of `maxMeshWorkGroupSize`.
    public static final MemoryLayout ML_maxMeshWorkGroupSize = LAYOUT.select(PathElement.groupElement("maxMeshWorkGroupSize"));
    /// The [VarHandle] of `maxMeshSharedMemorySize` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxMeshSharedMemorySize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxMeshSharedMemorySize"));
    /// The [VarHandle] of `maxMeshPayloadAndSharedMemorySize` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxMeshPayloadAndSharedMemorySize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxMeshPayloadAndSharedMemorySize"));
    /// The [VarHandle] of `maxMeshOutputMemorySize` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxMeshOutputMemorySize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxMeshOutputMemorySize"));
    /// The [VarHandle] of `maxMeshPayloadAndOutputMemorySize` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxMeshPayloadAndOutputMemorySize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxMeshPayloadAndOutputMemorySize"));
    /// The [VarHandle] of `maxMeshOutputComponents` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxMeshOutputComponents = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxMeshOutputComponents"));
    /// The [VarHandle] of `maxMeshOutputVertices` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxMeshOutputVertices = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxMeshOutputVertices"));
    /// The [VarHandle] of `maxMeshOutputPrimitives` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxMeshOutputPrimitives = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxMeshOutputPrimitives"));
    /// The [VarHandle] of `maxMeshOutputLayers` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxMeshOutputLayers = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxMeshOutputLayers"));
    /// The [VarHandle] of `maxMeshMultiviewViewCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxMeshMultiviewViewCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxMeshMultiviewViewCount"));
    /// The [VarHandle] of `meshOutputPerVertexGranularity` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_meshOutputPerVertexGranularity = LAYOUT.arrayElementVarHandle(PathElement.groupElement("meshOutputPerVertexGranularity"));
    /// The [VarHandle] of `meshOutputPerPrimitiveGranularity` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_meshOutputPerPrimitiveGranularity = LAYOUT.arrayElementVarHandle(PathElement.groupElement("meshOutputPerPrimitiveGranularity"));
    /// The [VarHandle] of `maxPreferredTaskWorkGroupInvocations` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxPreferredTaskWorkGroupInvocations = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxPreferredTaskWorkGroupInvocations"));
    /// The [VarHandle] of `maxPreferredMeshWorkGroupInvocations` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxPreferredMeshWorkGroupInvocations = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxPreferredMeshWorkGroupInvocations"));
    /// The [VarHandle] of `prefersLocalInvocationVertexOutput` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_prefersLocalInvocationVertexOutput = LAYOUT.arrayElementVarHandle(PathElement.groupElement("prefersLocalInvocationVertexOutput"));
    /// The [VarHandle] of `prefersLocalInvocationPrimitiveOutput` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_prefersLocalInvocationPrimitiveOutput = LAYOUT.arrayElementVarHandle(PathElement.groupElement("prefersLocalInvocationPrimitiveOutput"));
    /// The [VarHandle] of `prefersCompactVertexOutput` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_prefersCompactVertexOutput = LAYOUT.arrayElementVarHandle(PathElement.groupElement("prefersCompactVertexOutput"));
    /// The [VarHandle] of `prefersCompactPrimitiveOutput` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_prefersCompactPrimitiveOutput = LAYOUT.arrayElementVarHandle(PathElement.groupElement("prefersCompactPrimitiveOutput"));

    /// Creates `VkPhysicalDeviceMeshShaderPropertiesEXT` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceMeshShaderPropertiesEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceMeshShaderPropertiesEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceMeshShaderPropertiesEXT of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceMeshShaderPropertiesEXT(segment); }

    /// Creates `VkPhysicalDeviceMeshShaderPropertiesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceMeshShaderPropertiesEXT ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceMeshShaderPropertiesEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDeviceMeshShaderPropertiesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceMeshShaderPropertiesEXT ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceMeshShaderPropertiesEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkPhysicalDeviceMeshShaderPropertiesEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceMeshShaderPropertiesEXT`
    public static VkPhysicalDeviceMeshShaderPropertiesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceMeshShaderPropertiesEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceMeshShaderPropertiesEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceMeshShaderPropertiesEXT`
    public static VkPhysicalDeviceMeshShaderPropertiesEXT alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceMeshShaderPropertiesEXT(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `VkPhysicalDeviceMeshShaderPropertiesEXT`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDeviceMeshShaderPropertiesEXT`
    public VkPhysicalDeviceMeshShaderPropertiesEXT asSlice(long index) { return new VkPhysicalDeviceMeshShaderPropertiesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `VkPhysicalDeviceMeshShaderPropertiesEXT`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDeviceMeshShaderPropertiesEXT`
    public VkPhysicalDeviceMeshShaderPropertiesEXT asSlice(long index, long count) { return new VkPhysicalDeviceMeshShaderPropertiesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPhysicalDeviceMeshShaderPropertiesEXT.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkPhysicalDeviceMeshShaderPropertiesEXT.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPhysicalDeviceMeshShaderPropertiesEXT.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPhysicalDeviceMeshShaderPropertiesEXT.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMeshShaderPropertiesEXT sTypeAt(long index, @CType("VkStructureType") int value) { VkPhysicalDeviceMeshShaderPropertiesEXT.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMeshShaderPropertiesEXT sType(@CType("VkStructureType") int value) { VkPhysicalDeviceMeshShaderPropertiesEXT.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkPhysicalDeviceMeshShaderPropertiesEXT.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkPhysicalDeviceMeshShaderPropertiesEXT.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkPhysicalDeviceMeshShaderPropertiesEXT.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceMeshShaderPropertiesEXT.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMeshShaderPropertiesEXT pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceMeshShaderPropertiesEXT.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMeshShaderPropertiesEXT pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceMeshShaderPropertiesEXT.set_pNext(this.segment(), value); return this; }

    /// {@return `maxTaskWorkGroupTotalCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxTaskWorkGroupTotalCount(MemorySegment segment, long index) { return (int) VH_maxTaskWorkGroupTotalCount.get(segment, 0L, index); }
    /// {@return `maxTaskWorkGroupTotalCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxTaskWorkGroupTotalCount(MemorySegment segment) { return VkPhysicalDeviceMeshShaderPropertiesEXT.get_maxTaskWorkGroupTotalCount(segment, 0L); }
    /// {@return `maxTaskWorkGroupTotalCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int maxTaskWorkGroupTotalCountAt(long index) { return VkPhysicalDeviceMeshShaderPropertiesEXT.get_maxTaskWorkGroupTotalCount(this.segment(), index); }
    /// {@return `maxTaskWorkGroupTotalCount`}
    public @CType("uint32_t") int maxTaskWorkGroupTotalCount() { return VkPhysicalDeviceMeshShaderPropertiesEXT.get_maxTaskWorkGroupTotalCount(this.segment()); }
    /// Sets `maxTaskWorkGroupTotalCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxTaskWorkGroupTotalCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxTaskWorkGroupTotalCount.set(segment, 0L, index, value); }
    /// Sets `maxTaskWorkGroupTotalCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxTaskWorkGroupTotalCount(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceMeshShaderPropertiesEXT.set_maxTaskWorkGroupTotalCount(segment, 0L, value); }
    /// Sets `maxTaskWorkGroupTotalCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMeshShaderPropertiesEXT maxTaskWorkGroupTotalCountAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceMeshShaderPropertiesEXT.set_maxTaskWorkGroupTotalCount(this.segment(), index, value); return this; }
    /// Sets `maxTaskWorkGroupTotalCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMeshShaderPropertiesEXT maxTaskWorkGroupTotalCount(@CType("uint32_t") int value) { VkPhysicalDeviceMeshShaderPropertiesEXT.set_maxTaskWorkGroupTotalCount(this.segment(), value); return this; }

    /// {@return `maxTaskWorkGroupCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t[3]") java.lang.foreign.MemorySegment get_maxTaskWorkGroupCount(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_maxTaskWorkGroupCount, index), ML_maxTaskWorkGroupCount); }
    /// {@return `maxTaskWorkGroupCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t[3]") java.lang.foreign.MemorySegment get_maxTaskWorkGroupCount(MemorySegment segment) { return VkPhysicalDeviceMeshShaderPropertiesEXT.get_maxTaskWorkGroupCount(segment, 0L); }
    /// {@return `maxTaskWorkGroupCount` at the given index}
    /// @param index the index
    public @CType("uint32_t[3]") java.lang.foreign.MemorySegment maxTaskWorkGroupCountAt(long index) { return VkPhysicalDeviceMeshShaderPropertiesEXT.get_maxTaskWorkGroupCount(this.segment(), index); }
    /// {@return `maxTaskWorkGroupCount`}
    public @CType("uint32_t[3]") java.lang.foreign.MemorySegment maxTaskWorkGroupCount() { return VkPhysicalDeviceMeshShaderPropertiesEXT.get_maxTaskWorkGroupCount(this.segment()); }
    /// Sets `maxTaskWorkGroupCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxTaskWorkGroupCount(MemorySegment segment, long index, @CType("uint32_t[3]") java.lang.foreign.MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_maxTaskWorkGroupCount, index), ML_maxTaskWorkGroupCount.byteSize()); }
    /// Sets `maxTaskWorkGroupCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxTaskWorkGroupCount(MemorySegment segment, @CType("uint32_t[3]") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceMeshShaderPropertiesEXT.set_maxTaskWorkGroupCount(segment, 0L, value); }
    /// Sets `maxTaskWorkGroupCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMeshShaderPropertiesEXT maxTaskWorkGroupCountAt(long index, @CType("uint32_t[3]") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceMeshShaderPropertiesEXT.set_maxTaskWorkGroupCount(this.segment(), index, value); return this; }
    /// Sets `maxTaskWorkGroupCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMeshShaderPropertiesEXT maxTaskWorkGroupCount(@CType("uint32_t[3]") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceMeshShaderPropertiesEXT.set_maxTaskWorkGroupCount(this.segment(), value); return this; }

    /// {@return `maxTaskWorkGroupInvocations` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxTaskWorkGroupInvocations(MemorySegment segment, long index) { return (int) VH_maxTaskWorkGroupInvocations.get(segment, 0L, index); }
    /// {@return `maxTaskWorkGroupInvocations`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxTaskWorkGroupInvocations(MemorySegment segment) { return VkPhysicalDeviceMeshShaderPropertiesEXT.get_maxTaskWorkGroupInvocations(segment, 0L); }
    /// {@return `maxTaskWorkGroupInvocations` at the given index}
    /// @param index the index
    public @CType("uint32_t") int maxTaskWorkGroupInvocationsAt(long index) { return VkPhysicalDeviceMeshShaderPropertiesEXT.get_maxTaskWorkGroupInvocations(this.segment(), index); }
    /// {@return `maxTaskWorkGroupInvocations`}
    public @CType("uint32_t") int maxTaskWorkGroupInvocations() { return VkPhysicalDeviceMeshShaderPropertiesEXT.get_maxTaskWorkGroupInvocations(this.segment()); }
    /// Sets `maxTaskWorkGroupInvocations` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxTaskWorkGroupInvocations(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxTaskWorkGroupInvocations.set(segment, 0L, index, value); }
    /// Sets `maxTaskWorkGroupInvocations` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxTaskWorkGroupInvocations(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceMeshShaderPropertiesEXT.set_maxTaskWorkGroupInvocations(segment, 0L, value); }
    /// Sets `maxTaskWorkGroupInvocations` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMeshShaderPropertiesEXT maxTaskWorkGroupInvocationsAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceMeshShaderPropertiesEXT.set_maxTaskWorkGroupInvocations(this.segment(), index, value); return this; }
    /// Sets `maxTaskWorkGroupInvocations` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMeshShaderPropertiesEXT maxTaskWorkGroupInvocations(@CType("uint32_t") int value) { VkPhysicalDeviceMeshShaderPropertiesEXT.set_maxTaskWorkGroupInvocations(this.segment(), value); return this; }

    /// {@return `maxTaskWorkGroupSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t[3]") java.lang.foreign.MemorySegment get_maxTaskWorkGroupSize(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_maxTaskWorkGroupSize, index), ML_maxTaskWorkGroupSize); }
    /// {@return `maxTaskWorkGroupSize`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t[3]") java.lang.foreign.MemorySegment get_maxTaskWorkGroupSize(MemorySegment segment) { return VkPhysicalDeviceMeshShaderPropertiesEXT.get_maxTaskWorkGroupSize(segment, 0L); }
    /// {@return `maxTaskWorkGroupSize` at the given index}
    /// @param index the index
    public @CType("uint32_t[3]") java.lang.foreign.MemorySegment maxTaskWorkGroupSizeAt(long index) { return VkPhysicalDeviceMeshShaderPropertiesEXT.get_maxTaskWorkGroupSize(this.segment(), index); }
    /// {@return `maxTaskWorkGroupSize`}
    public @CType("uint32_t[3]") java.lang.foreign.MemorySegment maxTaskWorkGroupSize() { return VkPhysicalDeviceMeshShaderPropertiesEXT.get_maxTaskWorkGroupSize(this.segment()); }
    /// Sets `maxTaskWorkGroupSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxTaskWorkGroupSize(MemorySegment segment, long index, @CType("uint32_t[3]") java.lang.foreign.MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_maxTaskWorkGroupSize, index), ML_maxTaskWorkGroupSize.byteSize()); }
    /// Sets `maxTaskWorkGroupSize` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxTaskWorkGroupSize(MemorySegment segment, @CType("uint32_t[3]") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceMeshShaderPropertiesEXT.set_maxTaskWorkGroupSize(segment, 0L, value); }
    /// Sets `maxTaskWorkGroupSize` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMeshShaderPropertiesEXT maxTaskWorkGroupSizeAt(long index, @CType("uint32_t[3]") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceMeshShaderPropertiesEXT.set_maxTaskWorkGroupSize(this.segment(), index, value); return this; }
    /// Sets `maxTaskWorkGroupSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMeshShaderPropertiesEXT maxTaskWorkGroupSize(@CType("uint32_t[3]") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceMeshShaderPropertiesEXT.set_maxTaskWorkGroupSize(this.segment(), value); return this; }

    /// {@return `maxTaskPayloadSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxTaskPayloadSize(MemorySegment segment, long index) { return (int) VH_maxTaskPayloadSize.get(segment, 0L, index); }
    /// {@return `maxTaskPayloadSize`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxTaskPayloadSize(MemorySegment segment) { return VkPhysicalDeviceMeshShaderPropertiesEXT.get_maxTaskPayloadSize(segment, 0L); }
    /// {@return `maxTaskPayloadSize` at the given index}
    /// @param index the index
    public @CType("uint32_t") int maxTaskPayloadSizeAt(long index) { return VkPhysicalDeviceMeshShaderPropertiesEXT.get_maxTaskPayloadSize(this.segment(), index); }
    /// {@return `maxTaskPayloadSize`}
    public @CType("uint32_t") int maxTaskPayloadSize() { return VkPhysicalDeviceMeshShaderPropertiesEXT.get_maxTaskPayloadSize(this.segment()); }
    /// Sets `maxTaskPayloadSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxTaskPayloadSize(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxTaskPayloadSize.set(segment, 0L, index, value); }
    /// Sets `maxTaskPayloadSize` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxTaskPayloadSize(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceMeshShaderPropertiesEXT.set_maxTaskPayloadSize(segment, 0L, value); }
    /// Sets `maxTaskPayloadSize` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMeshShaderPropertiesEXT maxTaskPayloadSizeAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceMeshShaderPropertiesEXT.set_maxTaskPayloadSize(this.segment(), index, value); return this; }
    /// Sets `maxTaskPayloadSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMeshShaderPropertiesEXT maxTaskPayloadSize(@CType("uint32_t") int value) { VkPhysicalDeviceMeshShaderPropertiesEXT.set_maxTaskPayloadSize(this.segment(), value); return this; }

    /// {@return `maxTaskSharedMemorySize` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxTaskSharedMemorySize(MemorySegment segment, long index) { return (int) VH_maxTaskSharedMemorySize.get(segment, 0L, index); }
    /// {@return `maxTaskSharedMemorySize`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxTaskSharedMemorySize(MemorySegment segment) { return VkPhysicalDeviceMeshShaderPropertiesEXT.get_maxTaskSharedMemorySize(segment, 0L); }
    /// {@return `maxTaskSharedMemorySize` at the given index}
    /// @param index the index
    public @CType("uint32_t") int maxTaskSharedMemorySizeAt(long index) { return VkPhysicalDeviceMeshShaderPropertiesEXT.get_maxTaskSharedMemorySize(this.segment(), index); }
    /// {@return `maxTaskSharedMemorySize`}
    public @CType("uint32_t") int maxTaskSharedMemorySize() { return VkPhysicalDeviceMeshShaderPropertiesEXT.get_maxTaskSharedMemorySize(this.segment()); }
    /// Sets `maxTaskSharedMemorySize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxTaskSharedMemorySize(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxTaskSharedMemorySize.set(segment, 0L, index, value); }
    /// Sets `maxTaskSharedMemorySize` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxTaskSharedMemorySize(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceMeshShaderPropertiesEXT.set_maxTaskSharedMemorySize(segment, 0L, value); }
    /// Sets `maxTaskSharedMemorySize` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMeshShaderPropertiesEXT maxTaskSharedMemorySizeAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceMeshShaderPropertiesEXT.set_maxTaskSharedMemorySize(this.segment(), index, value); return this; }
    /// Sets `maxTaskSharedMemorySize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMeshShaderPropertiesEXT maxTaskSharedMemorySize(@CType("uint32_t") int value) { VkPhysicalDeviceMeshShaderPropertiesEXT.set_maxTaskSharedMemorySize(this.segment(), value); return this; }

    /// {@return `maxTaskPayloadAndSharedMemorySize` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxTaskPayloadAndSharedMemorySize(MemorySegment segment, long index) { return (int) VH_maxTaskPayloadAndSharedMemorySize.get(segment, 0L, index); }
    /// {@return `maxTaskPayloadAndSharedMemorySize`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxTaskPayloadAndSharedMemorySize(MemorySegment segment) { return VkPhysicalDeviceMeshShaderPropertiesEXT.get_maxTaskPayloadAndSharedMemorySize(segment, 0L); }
    /// {@return `maxTaskPayloadAndSharedMemorySize` at the given index}
    /// @param index the index
    public @CType("uint32_t") int maxTaskPayloadAndSharedMemorySizeAt(long index) { return VkPhysicalDeviceMeshShaderPropertiesEXT.get_maxTaskPayloadAndSharedMemorySize(this.segment(), index); }
    /// {@return `maxTaskPayloadAndSharedMemorySize`}
    public @CType("uint32_t") int maxTaskPayloadAndSharedMemorySize() { return VkPhysicalDeviceMeshShaderPropertiesEXT.get_maxTaskPayloadAndSharedMemorySize(this.segment()); }
    /// Sets `maxTaskPayloadAndSharedMemorySize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxTaskPayloadAndSharedMemorySize(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxTaskPayloadAndSharedMemorySize.set(segment, 0L, index, value); }
    /// Sets `maxTaskPayloadAndSharedMemorySize` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxTaskPayloadAndSharedMemorySize(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceMeshShaderPropertiesEXT.set_maxTaskPayloadAndSharedMemorySize(segment, 0L, value); }
    /// Sets `maxTaskPayloadAndSharedMemorySize` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMeshShaderPropertiesEXT maxTaskPayloadAndSharedMemorySizeAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceMeshShaderPropertiesEXT.set_maxTaskPayloadAndSharedMemorySize(this.segment(), index, value); return this; }
    /// Sets `maxTaskPayloadAndSharedMemorySize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMeshShaderPropertiesEXT maxTaskPayloadAndSharedMemorySize(@CType("uint32_t") int value) { VkPhysicalDeviceMeshShaderPropertiesEXT.set_maxTaskPayloadAndSharedMemorySize(this.segment(), value); return this; }

    /// {@return `maxMeshWorkGroupTotalCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxMeshWorkGroupTotalCount(MemorySegment segment, long index) { return (int) VH_maxMeshWorkGroupTotalCount.get(segment, 0L, index); }
    /// {@return `maxMeshWorkGroupTotalCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxMeshWorkGroupTotalCount(MemorySegment segment) { return VkPhysicalDeviceMeshShaderPropertiesEXT.get_maxMeshWorkGroupTotalCount(segment, 0L); }
    /// {@return `maxMeshWorkGroupTotalCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int maxMeshWorkGroupTotalCountAt(long index) { return VkPhysicalDeviceMeshShaderPropertiesEXT.get_maxMeshWorkGroupTotalCount(this.segment(), index); }
    /// {@return `maxMeshWorkGroupTotalCount`}
    public @CType("uint32_t") int maxMeshWorkGroupTotalCount() { return VkPhysicalDeviceMeshShaderPropertiesEXT.get_maxMeshWorkGroupTotalCount(this.segment()); }
    /// Sets `maxMeshWorkGroupTotalCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxMeshWorkGroupTotalCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxMeshWorkGroupTotalCount.set(segment, 0L, index, value); }
    /// Sets `maxMeshWorkGroupTotalCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxMeshWorkGroupTotalCount(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceMeshShaderPropertiesEXT.set_maxMeshWorkGroupTotalCount(segment, 0L, value); }
    /// Sets `maxMeshWorkGroupTotalCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMeshShaderPropertiesEXT maxMeshWorkGroupTotalCountAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceMeshShaderPropertiesEXT.set_maxMeshWorkGroupTotalCount(this.segment(), index, value); return this; }
    /// Sets `maxMeshWorkGroupTotalCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMeshShaderPropertiesEXT maxMeshWorkGroupTotalCount(@CType("uint32_t") int value) { VkPhysicalDeviceMeshShaderPropertiesEXT.set_maxMeshWorkGroupTotalCount(this.segment(), value); return this; }

    /// {@return `maxMeshWorkGroupCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t[3]") java.lang.foreign.MemorySegment get_maxMeshWorkGroupCount(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_maxMeshWorkGroupCount, index), ML_maxMeshWorkGroupCount); }
    /// {@return `maxMeshWorkGroupCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t[3]") java.lang.foreign.MemorySegment get_maxMeshWorkGroupCount(MemorySegment segment) { return VkPhysicalDeviceMeshShaderPropertiesEXT.get_maxMeshWorkGroupCount(segment, 0L); }
    /// {@return `maxMeshWorkGroupCount` at the given index}
    /// @param index the index
    public @CType("uint32_t[3]") java.lang.foreign.MemorySegment maxMeshWorkGroupCountAt(long index) { return VkPhysicalDeviceMeshShaderPropertiesEXT.get_maxMeshWorkGroupCount(this.segment(), index); }
    /// {@return `maxMeshWorkGroupCount`}
    public @CType("uint32_t[3]") java.lang.foreign.MemorySegment maxMeshWorkGroupCount() { return VkPhysicalDeviceMeshShaderPropertiesEXT.get_maxMeshWorkGroupCount(this.segment()); }
    /// Sets `maxMeshWorkGroupCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxMeshWorkGroupCount(MemorySegment segment, long index, @CType("uint32_t[3]") java.lang.foreign.MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_maxMeshWorkGroupCount, index), ML_maxMeshWorkGroupCount.byteSize()); }
    /// Sets `maxMeshWorkGroupCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxMeshWorkGroupCount(MemorySegment segment, @CType("uint32_t[3]") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceMeshShaderPropertiesEXT.set_maxMeshWorkGroupCount(segment, 0L, value); }
    /// Sets `maxMeshWorkGroupCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMeshShaderPropertiesEXT maxMeshWorkGroupCountAt(long index, @CType("uint32_t[3]") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceMeshShaderPropertiesEXT.set_maxMeshWorkGroupCount(this.segment(), index, value); return this; }
    /// Sets `maxMeshWorkGroupCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMeshShaderPropertiesEXT maxMeshWorkGroupCount(@CType("uint32_t[3]") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceMeshShaderPropertiesEXT.set_maxMeshWorkGroupCount(this.segment(), value); return this; }

    /// {@return `maxMeshWorkGroupInvocations` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxMeshWorkGroupInvocations(MemorySegment segment, long index) { return (int) VH_maxMeshWorkGroupInvocations.get(segment, 0L, index); }
    /// {@return `maxMeshWorkGroupInvocations`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxMeshWorkGroupInvocations(MemorySegment segment) { return VkPhysicalDeviceMeshShaderPropertiesEXT.get_maxMeshWorkGroupInvocations(segment, 0L); }
    /// {@return `maxMeshWorkGroupInvocations` at the given index}
    /// @param index the index
    public @CType("uint32_t") int maxMeshWorkGroupInvocationsAt(long index) { return VkPhysicalDeviceMeshShaderPropertiesEXT.get_maxMeshWorkGroupInvocations(this.segment(), index); }
    /// {@return `maxMeshWorkGroupInvocations`}
    public @CType("uint32_t") int maxMeshWorkGroupInvocations() { return VkPhysicalDeviceMeshShaderPropertiesEXT.get_maxMeshWorkGroupInvocations(this.segment()); }
    /// Sets `maxMeshWorkGroupInvocations` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxMeshWorkGroupInvocations(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxMeshWorkGroupInvocations.set(segment, 0L, index, value); }
    /// Sets `maxMeshWorkGroupInvocations` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxMeshWorkGroupInvocations(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceMeshShaderPropertiesEXT.set_maxMeshWorkGroupInvocations(segment, 0L, value); }
    /// Sets `maxMeshWorkGroupInvocations` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMeshShaderPropertiesEXT maxMeshWorkGroupInvocationsAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceMeshShaderPropertiesEXT.set_maxMeshWorkGroupInvocations(this.segment(), index, value); return this; }
    /// Sets `maxMeshWorkGroupInvocations` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMeshShaderPropertiesEXT maxMeshWorkGroupInvocations(@CType("uint32_t") int value) { VkPhysicalDeviceMeshShaderPropertiesEXT.set_maxMeshWorkGroupInvocations(this.segment(), value); return this; }

    /// {@return `maxMeshWorkGroupSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t[3]") java.lang.foreign.MemorySegment get_maxMeshWorkGroupSize(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_maxMeshWorkGroupSize, index), ML_maxMeshWorkGroupSize); }
    /// {@return `maxMeshWorkGroupSize`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t[3]") java.lang.foreign.MemorySegment get_maxMeshWorkGroupSize(MemorySegment segment) { return VkPhysicalDeviceMeshShaderPropertiesEXT.get_maxMeshWorkGroupSize(segment, 0L); }
    /// {@return `maxMeshWorkGroupSize` at the given index}
    /// @param index the index
    public @CType("uint32_t[3]") java.lang.foreign.MemorySegment maxMeshWorkGroupSizeAt(long index) { return VkPhysicalDeviceMeshShaderPropertiesEXT.get_maxMeshWorkGroupSize(this.segment(), index); }
    /// {@return `maxMeshWorkGroupSize`}
    public @CType("uint32_t[3]") java.lang.foreign.MemorySegment maxMeshWorkGroupSize() { return VkPhysicalDeviceMeshShaderPropertiesEXT.get_maxMeshWorkGroupSize(this.segment()); }
    /// Sets `maxMeshWorkGroupSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxMeshWorkGroupSize(MemorySegment segment, long index, @CType("uint32_t[3]") java.lang.foreign.MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_maxMeshWorkGroupSize, index), ML_maxMeshWorkGroupSize.byteSize()); }
    /// Sets `maxMeshWorkGroupSize` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxMeshWorkGroupSize(MemorySegment segment, @CType("uint32_t[3]") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceMeshShaderPropertiesEXT.set_maxMeshWorkGroupSize(segment, 0L, value); }
    /// Sets `maxMeshWorkGroupSize` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMeshShaderPropertiesEXT maxMeshWorkGroupSizeAt(long index, @CType("uint32_t[3]") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceMeshShaderPropertiesEXT.set_maxMeshWorkGroupSize(this.segment(), index, value); return this; }
    /// Sets `maxMeshWorkGroupSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMeshShaderPropertiesEXT maxMeshWorkGroupSize(@CType("uint32_t[3]") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceMeshShaderPropertiesEXT.set_maxMeshWorkGroupSize(this.segment(), value); return this; }

    /// {@return `maxMeshSharedMemorySize` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxMeshSharedMemorySize(MemorySegment segment, long index) { return (int) VH_maxMeshSharedMemorySize.get(segment, 0L, index); }
    /// {@return `maxMeshSharedMemorySize`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxMeshSharedMemorySize(MemorySegment segment) { return VkPhysicalDeviceMeshShaderPropertiesEXT.get_maxMeshSharedMemorySize(segment, 0L); }
    /// {@return `maxMeshSharedMemorySize` at the given index}
    /// @param index the index
    public @CType("uint32_t") int maxMeshSharedMemorySizeAt(long index) { return VkPhysicalDeviceMeshShaderPropertiesEXT.get_maxMeshSharedMemorySize(this.segment(), index); }
    /// {@return `maxMeshSharedMemorySize`}
    public @CType("uint32_t") int maxMeshSharedMemorySize() { return VkPhysicalDeviceMeshShaderPropertiesEXT.get_maxMeshSharedMemorySize(this.segment()); }
    /// Sets `maxMeshSharedMemorySize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxMeshSharedMemorySize(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxMeshSharedMemorySize.set(segment, 0L, index, value); }
    /// Sets `maxMeshSharedMemorySize` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxMeshSharedMemorySize(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceMeshShaderPropertiesEXT.set_maxMeshSharedMemorySize(segment, 0L, value); }
    /// Sets `maxMeshSharedMemorySize` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMeshShaderPropertiesEXT maxMeshSharedMemorySizeAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceMeshShaderPropertiesEXT.set_maxMeshSharedMemorySize(this.segment(), index, value); return this; }
    /// Sets `maxMeshSharedMemorySize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMeshShaderPropertiesEXT maxMeshSharedMemorySize(@CType("uint32_t") int value) { VkPhysicalDeviceMeshShaderPropertiesEXT.set_maxMeshSharedMemorySize(this.segment(), value); return this; }

    /// {@return `maxMeshPayloadAndSharedMemorySize` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxMeshPayloadAndSharedMemorySize(MemorySegment segment, long index) { return (int) VH_maxMeshPayloadAndSharedMemorySize.get(segment, 0L, index); }
    /// {@return `maxMeshPayloadAndSharedMemorySize`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxMeshPayloadAndSharedMemorySize(MemorySegment segment) { return VkPhysicalDeviceMeshShaderPropertiesEXT.get_maxMeshPayloadAndSharedMemorySize(segment, 0L); }
    /// {@return `maxMeshPayloadAndSharedMemorySize` at the given index}
    /// @param index the index
    public @CType("uint32_t") int maxMeshPayloadAndSharedMemorySizeAt(long index) { return VkPhysicalDeviceMeshShaderPropertiesEXT.get_maxMeshPayloadAndSharedMemorySize(this.segment(), index); }
    /// {@return `maxMeshPayloadAndSharedMemorySize`}
    public @CType("uint32_t") int maxMeshPayloadAndSharedMemorySize() { return VkPhysicalDeviceMeshShaderPropertiesEXT.get_maxMeshPayloadAndSharedMemorySize(this.segment()); }
    /// Sets `maxMeshPayloadAndSharedMemorySize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxMeshPayloadAndSharedMemorySize(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxMeshPayloadAndSharedMemorySize.set(segment, 0L, index, value); }
    /// Sets `maxMeshPayloadAndSharedMemorySize` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxMeshPayloadAndSharedMemorySize(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceMeshShaderPropertiesEXT.set_maxMeshPayloadAndSharedMemorySize(segment, 0L, value); }
    /// Sets `maxMeshPayloadAndSharedMemorySize` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMeshShaderPropertiesEXT maxMeshPayloadAndSharedMemorySizeAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceMeshShaderPropertiesEXT.set_maxMeshPayloadAndSharedMemorySize(this.segment(), index, value); return this; }
    /// Sets `maxMeshPayloadAndSharedMemorySize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMeshShaderPropertiesEXT maxMeshPayloadAndSharedMemorySize(@CType("uint32_t") int value) { VkPhysicalDeviceMeshShaderPropertiesEXT.set_maxMeshPayloadAndSharedMemorySize(this.segment(), value); return this; }

    /// {@return `maxMeshOutputMemorySize` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxMeshOutputMemorySize(MemorySegment segment, long index) { return (int) VH_maxMeshOutputMemorySize.get(segment, 0L, index); }
    /// {@return `maxMeshOutputMemorySize`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxMeshOutputMemorySize(MemorySegment segment) { return VkPhysicalDeviceMeshShaderPropertiesEXT.get_maxMeshOutputMemorySize(segment, 0L); }
    /// {@return `maxMeshOutputMemorySize` at the given index}
    /// @param index the index
    public @CType("uint32_t") int maxMeshOutputMemorySizeAt(long index) { return VkPhysicalDeviceMeshShaderPropertiesEXT.get_maxMeshOutputMemorySize(this.segment(), index); }
    /// {@return `maxMeshOutputMemorySize`}
    public @CType("uint32_t") int maxMeshOutputMemorySize() { return VkPhysicalDeviceMeshShaderPropertiesEXT.get_maxMeshOutputMemorySize(this.segment()); }
    /// Sets `maxMeshOutputMemorySize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxMeshOutputMemorySize(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxMeshOutputMemorySize.set(segment, 0L, index, value); }
    /// Sets `maxMeshOutputMemorySize` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxMeshOutputMemorySize(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceMeshShaderPropertiesEXT.set_maxMeshOutputMemorySize(segment, 0L, value); }
    /// Sets `maxMeshOutputMemorySize` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMeshShaderPropertiesEXT maxMeshOutputMemorySizeAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceMeshShaderPropertiesEXT.set_maxMeshOutputMemorySize(this.segment(), index, value); return this; }
    /// Sets `maxMeshOutputMemorySize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMeshShaderPropertiesEXT maxMeshOutputMemorySize(@CType("uint32_t") int value) { VkPhysicalDeviceMeshShaderPropertiesEXT.set_maxMeshOutputMemorySize(this.segment(), value); return this; }

    /// {@return `maxMeshPayloadAndOutputMemorySize` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxMeshPayloadAndOutputMemorySize(MemorySegment segment, long index) { return (int) VH_maxMeshPayloadAndOutputMemorySize.get(segment, 0L, index); }
    /// {@return `maxMeshPayloadAndOutputMemorySize`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxMeshPayloadAndOutputMemorySize(MemorySegment segment) { return VkPhysicalDeviceMeshShaderPropertiesEXT.get_maxMeshPayloadAndOutputMemorySize(segment, 0L); }
    /// {@return `maxMeshPayloadAndOutputMemorySize` at the given index}
    /// @param index the index
    public @CType("uint32_t") int maxMeshPayloadAndOutputMemorySizeAt(long index) { return VkPhysicalDeviceMeshShaderPropertiesEXT.get_maxMeshPayloadAndOutputMemorySize(this.segment(), index); }
    /// {@return `maxMeshPayloadAndOutputMemorySize`}
    public @CType("uint32_t") int maxMeshPayloadAndOutputMemorySize() { return VkPhysicalDeviceMeshShaderPropertiesEXT.get_maxMeshPayloadAndOutputMemorySize(this.segment()); }
    /// Sets `maxMeshPayloadAndOutputMemorySize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxMeshPayloadAndOutputMemorySize(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxMeshPayloadAndOutputMemorySize.set(segment, 0L, index, value); }
    /// Sets `maxMeshPayloadAndOutputMemorySize` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxMeshPayloadAndOutputMemorySize(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceMeshShaderPropertiesEXT.set_maxMeshPayloadAndOutputMemorySize(segment, 0L, value); }
    /// Sets `maxMeshPayloadAndOutputMemorySize` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMeshShaderPropertiesEXT maxMeshPayloadAndOutputMemorySizeAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceMeshShaderPropertiesEXT.set_maxMeshPayloadAndOutputMemorySize(this.segment(), index, value); return this; }
    /// Sets `maxMeshPayloadAndOutputMemorySize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMeshShaderPropertiesEXT maxMeshPayloadAndOutputMemorySize(@CType("uint32_t") int value) { VkPhysicalDeviceMeshShaderPropertiesEXT.set_maxMeshPayloadAndOutputMemorySize(this.segment(), value); return this; }

    /// {@return `maxMeshOutputComponents` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxMeshOutputComponents(MemorySegment segment, long index) { return (int) VH_maxMeshOutputComponents.get(segment, 0L, index); }
    /// {@return `maxMeshOutputComponents`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxMeshOutputComponents(MemorySegment segment) { return VkPhysicalDeviceMeshShaderPropertiesEXT.get_maxMeshOutputComponents(segment, 0L); }
    /// {@return `maxMeshOutputComponents` at the given index}
    /// @param index the index
    public @CType("uint32_t") int maxMeshOutputComponentsAt(long index) { return VkPhysicalDeviceMeshShaderPropertiesEXT.get_maxMeshOutputComponents(this.segment(), index); }
    /// {@return `maxMeshOutputComponents`}
    public @CType("uint32_t") int maxMeshOutputComponents() { return VkPhysicalDeviceMeshShaderPropertiesEXT.get_maxMeshOutputComponents(this.segment()); }
    /// Sets `maxMeshOutputComponents` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxMeshOutputComponents(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxMeshOutputComponents.set(segment, 0L, index, value); }
    /// Sets `maxMeshOutputComponents` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxMeshOutputComponents(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceMeshShaderPropertiesEXT.set_maxMeshOutputComponents(segment, 0L, value); }
    /// Sets `maxMeshOutputComponents` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMeshShaderPropertiesEXT maxMeshOutputComponentsAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceMeshShaderPropertiesEXT.set_maxMeshOutputComponents(this.segment(), index, value); return this; }
    /// Sets `maxMeshOutputComponents` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMeshShaderPropertiesEXT maxMeshOutputComponents(@CType("uint32_t") int value) { VkPhysicalDeviceMeshShaderPropertiesEXT.set_maxMeshOutputComponents(this.segment(), value); return this; }

    /// {@return `maxMeshOutputVertices` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxMeshOutputVertices(MemorySegment segment, long index) { return (int) VH_maxMeshOutputVertices.get(segment, 0L, index); }
    /// {@return `maxMeshOutputVertices`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxMeshOutputVertices(MemorySegment segment) { return VkPhysicalDeviceMeshShaderPropertiesEXT.get_maxMeshOutputVertices(segment, 0L); }
    /// {@return `maxMeshOutputVertices` at the given index}
    /// @param index the index
    public @CType("uint32_t") int maxMeshOutputVerticesAt(long index) { return VkPhysicalDeviceMeshShaderPropertiesEXT.get_maxMeshOutputVertices(this.segment(), index); }
    /// {@return `maxMeshOutputVertices`}
    public @CType("uint32_t") int maxMeshOutputVertices() { return VkPhysicalDeviceMeshShaderPropertiesEXT.get_maxMeshOutputVertices(this.segment()); }
    /// Sets `maxMeshOutputVertices` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxMeshOutputVertices(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxMeshOutputVertices.set(segment, 0L, index, value); }
    /// Sets `maxMeshOutputVertices` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxMeshOutputVertices(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceMeshShaderPropertiesEXT.set_maxMeshOutputVertices(segment, 0L, value); }
    /// Sets `maxMeshOutputVertices` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMeshShaderPropertiesEXT maxMeshOutputVerticesAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceMeshShaderPropertiesEXT.set_maxMeshOutputVertices(this.segment(), index, value); return this; }
    /// Sets `maxMeshOutputVertices` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMeshShaderPropertiesEXT maxMeshOutputVertices(@CType("uint32_t") int value) { VkPhysicalDeviceMeshShaderPropertiesEXT.set_maxMeshOutputVertices(this.segment(), value); return this; }

    /// {@return `maxMeshOutputPrimitives` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxMeshOutputPrimitives(MemorySegment segment, long index) { return (int) VH_maxMeshOutputPrimitives.get(segment, 0L, index); }
    /// {@return `maxMeshOutputPrimitives`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxMeshOutputPrimitives(MemorySegment segment) { return VkPhysicalDeviceMeshShaderPropertiesEXT.get_maxMeshOutputPrimitives(segment, 0L); }
    /// {@return `maxMeshOutputPrimitives` at the given index}
    /// @param index the index
    public @CType("uint32_t") int maxMeshOutputPrimitivesAt(long index) { return VkPhysicalDeviceMeshShaderPropertiesEXT.get_maxMeshOutputPrimitives(this.segment(), index); }
    /// {@return `maxMeshOutputPrimitives`}
    public @CType("uint32_t") int maxMeshOutputPrimitives() { return VkPhysicalDeviceMeshShaderPropertiesEXT.get_maxMeshOutputPrimitives(this.segment()); }
    /// Sets `maxMeshOutputPrimitives` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxMeshOutputPrimitives(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxMeshOutputPrimitives.set(segment, 0L, index, value); }
    /// Sets `maxMeshOutputPrimitives` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxMeshOutputPrimitives(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceMeshShaderPropertiesEXT.set_maxMeshOutputPrimitives(segment, 0L, value); }
    /// Sets `maxMeshOutputPrimitives` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMeshShaderPropertiesEXT maxMeshOutputPrimitivesAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceMeshShaderPropertiesEXT.set_maxMeshOutputPrimitives(this.segment(), index, value); return this; }
    /// Sets `maxMeshOutputPrimitives` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMeshShaderPropertiesEXT maxMeshOutputPrimitives(@CType("uint32_t") int value) { VkPhysicalDeviceMeshShaderPropertiesEXT.set_maxMeshOutputPrimitives(this.segment(), value); return this; }

    /// {@return `maxMeshOutputLayers` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxMeshOutputLayers(MemorySegment segment, long index) { return (int) VH_maxMeshOutputLayers.get(segment, 0L, index); }
    /// {@return `maxMeshOutputLayers`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxMeshOutputLayers(MemorySegment segment) { return VkPhysicalDeviceMeshShaderPropertiesEXT.get_maxMeshOutputLayers(segment, 0L); }
    /// {@return `maxMeshOutputLayers` at the given index}
    /// @param index the index
    public @CType("uint32_t") int maxMeshOutputLayersAt(long index) { return VkPhysicalDeviceMeshShaderPropertiesEXT.get_maxMeshOutputLayers(this.segment(), index); }
    /// {@return `maxMeshOutputLayers`}
    public @CType("uint32_t") int maxMeshOutputLayers() { return VkPhysicalDeviceMeshShaderPropertiesEXT.get_maxMeshOutputLayers(this.segment()); }
    /// Sets `maxMeshOutputLayers` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxMeshOutputLayers(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxMeshOutputLayers.set(segment, 0L, index, value); }
    /// Sets `maxMeshOutputLayers` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxMeshOutputLayers(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceMeshShaderPropertiesEXT.set_maxMeshOutputLayers(segment, 0L, value); }
    /// Sets `maxMeshOutputLayers` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMeshShaderPropertiesEXT maxMeshOutputLayersAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceMeshShaderPropertiesEXT.set_maxMeshOutputLayers(this.segment(), index, value); return this; }
    /// Sets `maxMeshOutputLayers` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMeshShaderPropertiesEXT maxMeshOutputLayers(@CType("uint32_t") int value) { VkPhysicalDeviceMeshShaderPropertiesEXT.set_maxMeshOutputLayers(this.segment(), value); return this; }

    /// {@return `maxMeshMultiviewViewCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxMeshMultiviewViewCount(MemorySegment segment, long index) { return (int) VH_maxMeshMultiviewViewCount.get(segment, 0L, index); }
    /// {@return `maxMeshMultiviewViewCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxMeshMultiviewViewCount(MemorySegment segment) { return VkPhysicalDeviceMeshShaderPropertiesEXT.get_maxMeshMultiviewViewCount(segment, 0L); }
    /// {@return `maxMeshMultiviewViewCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int maxMeshMultiviewViewCountAt(long index) { return VkPhysicalDeviceMeshShaderPropertiesEXT.get_maxMeshMultiviewViewCount(this.segment(), index); }
    /// {@return `maxMeshMultiviewViewCount`}
    public @CType("uint32_t") int maxMeshMultiviewViewCount() { return VkPhysicalDeviceMeshShaderPropertiesEXT.get_maxMeshMultiviewViewCount(this.segment()); }
    /// Sets `maxMeshMultiviewViewCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxMeshMultiviewViewCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxMeshMultiviewViewCount.set(segment, 0L, index, value); }
    /// Sets `maxMeshMultiviewViewCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxMeshMultiviewViewCount(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceMeshShaderPropertiesEXT.set_maxMeshMultiviewViewCount(segment, 0L, value); }
    /// Sets `maxMeshMultiviewViewCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMeshShaderPropertiesEXT maxMeshMultiviewViewCountAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceMeshShaderPropertiesEXT.set_maxMeshMultiviewViewCount(this.segment(), index, value); return this; }
    /// Sets `maxMeshMultiviewViewCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMeshShaderPropertiesEXT maxMeshMultiviewViewCount(@CType("uint32_t") int value) { VkPhysicalDeviceMeshShaderPropertiesEXT.set_maxMeshMultiviewViewCount(this.segment(), value); return this; }

    /// {@return `meshOutputPerVertexGranularity` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_meshOutputPerVertexGranularity(MemorySegment segment, long index) { return (int) VH_meshOutputPerVertexGranularity.get(segment, 0L, index); }
    /// {@return `meshOutputPerVertexGranularity`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_meshOutputPerVertexGranularity(MemorySegment segment) { return VkPhysicalDeviceMeshShaderPropertiesEXT.get_meshOutputPerVertexGranularity(segment, 0L); }
    /// {@return `meshOutputPerVertexGranularity` at the given index}
    /// @param index the index
    public @CType("uint32_t") int meshOutputPerVertexGranularityAt(long index) { return VkPhysicalDeviceMeshShaderPropertiesEXT.get_meshOutputPerVertexGranularity(this.segment(), index); }
    /// {@return `meshOutputPerVertexGranularity`}
    public @CType("uint32_t") int meshOutputPerVertexGranularity() { return VkPhysicalDeviceMeshShaderPropertiesEXT.get_meshOutputPerVertexGranularity(this.segment()); }
    /// Sets `meshOutputPerVertexGranularity` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_meshOutputPerVertexGranularity(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_meshOutputPerVertexGranularity.set(segment, 0L, index, value); }
    /// Sets `meshOutputPerVertexGranularity` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_meshOutputPerVertexGranularity(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceMeshShaderPropertiesEXT.set_meshOutputPerVertexGranularity(segment, 0L, value); }
    /// Sets `meshOutputPerVertexGranularity` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMeshShaderPropertiesEXT meshOutputPerVertexGranularityAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceMeshShaderPropertiesEXT.set_meshOutputPerVertexGranularity(this.segment(), index, value); return this; }
    /// Sets `meshOutputPerVertexGranularity` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMeshShaderPropertiesEXT meshOutputPerVertexGranularity(@CType("uint32_t") int value) { VkPhysicalDeviceMeshShaderPropertiesEXT.set_meshOutputPerVertexGranularity(this.segment(), value); return this; }

    /// {@return `meshOutputPerPrimitiveGranularity` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_meshOutputPerPrimitiveGranularity(MemorySegment segment, long index) { return (int) VH_meshOutputPerPrimitiveGranularity.get(segment, 0L, index); }
    /// {@return `meshOutputPerPrimitiveGranularity`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_meshOutputPerPrimitiveGranularity(MemorySegment segment) { return VkPhysicalDeviceMeshShaderPropertiesEXT.get_meshOutputPerPrimitiveGranularity(segment, 0L); }
    /// {@return `meshOutputPerPrimitiveGranularity` at the given index}
    /// @param index the index
    public @CType("uint32_t") int meshOutputPerPrimitiveGranularityAt(long index) { return VkPhysicalDeviceMeshShaderPropertiesEXT.get_meshOutputPerPrimitiveGranularity(this.segment(), index); }
    /// {@return `meshOutputPerPrimitiveGranularity`}
    public @CType("uint32_t") int meshOutputPerPrimitiveGranularity() { return VkPhysicalDeviceMeshShaderPropertiesEXT.get_meshOutputPerPrimitiveGranularity(this.segment()); }
    /// Sets `meshOutputPerPrimitiveGranularity` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_meshOutputPerPrimitiveGranularity(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_meshOutputPerPrimitiveGranularity.set(segment, 0L, index, value); }
    /// Sets `meshOutputPerPrimitiveGranularity` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_meshOutputPerPrimitiveGranularity(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceMeshShaderPropertiesEXT.set_meshOutputPerPrimitiveGranularity(segment, 0L, value); }
    /// Sets `meshOutputPerPrimitiveGranularity` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMeshShaderPropertiesEXT meshOutputPerPrimitiveGranularityAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceMeshShaderPropertiesEXT.set_meshOutputPerPrimitiveGranularity(this.segment(), index, value); return this; }
    /// Sets `meshOutputPerPrimitiveGranularity` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMeshShaderPropertiesEXT meshOutputPerPrimitiveGranularity(@CType("uint32_t") int value) { VkPhysicalDeviceMeshShaderPropertiesEXT.set_meshOutputPerPrimitiveGranularity(this.segment(), value); return this; }

    /// {@return `maxPreferredTaskWorkGroupInvocations` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxPreferredTaskWorkGroupInvocations(MemorySegment segment, long index) { return (int) VH_maxPreferredTaskWorkGroupInvocations.get(segment, 0L, index); }
    /// {@return `maxPreferredTaskWorkGroupInvocations`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxPreferredTaskWorkGroupInvocations(MemorySegment segment) { return VkPhysicalDeviceMeshShaderPropertiesEXT.get_maxPreferredTaskWorkGroupInvocations(segment, 0L); }
    /// {@return `maxPreferredTaskWorkGroupInvocations` at the given index}
    /// @param index the index
    public @CType("uint32_t") int maxPreferredTaskWorkGroupInvocationsAt(long index) { return VkPhysicalDeviceMeshShaderPropertiesEXT.get_maxPreferredTaskWorkGroupInvocations(this.segment(), index); }
    /// {@return `maxPreferredTaskWorkGroupInvocations`}
    public @CType("uint32_t") int maxPreferredTaskWorkGroupInvocations() { return VkPhysicalDeviceMeshShaderPropertiesEXT.get_maxPreferredTaskWorkGroupInvocations(this.segment()); }
    /// Sets `maxPreferredTaskWorkGroupInvocations` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxPreferredTaskWorkGroupInvocations(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxPreferredTaskWorkGroupInvocations.set(segment, 0L, index, value); }
    /// Sets `maxPreferredTaskWorkGroupInvocations` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxPreferredTaskWorkGroupInvocations(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceMeshShaderPropertiesEXT.set_maxPreferredTaskWorkGroupInvocations(segment, 0L, value); }
    /// Sets `maxPreferredTaskWorkGroupInvocations` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMeshShaderPropertiesEXT maxPreferredTaskWorkGroupInvocationsAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceMeshShaderPropertiesEXT.set_maxPreferredTaskWorkGroupInvocations(this.segment(), index, value); return this; }
    /// Sets `maxPreferredTaskWorkGroupInvocations` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMeshShaderPropertiesEXT maxPreferredTaskWorkGroupInvocations(@CType("uint32_t") int value) { VkPhysicalDeviceMeshShaderPropertiesEXT.set_maxPreferredTaskWorkGroupInvocations(this.segment(), value); return this; }

    /// {@return `maxPreferredMeshWorkGroupInvocations` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxPreferredMeshWorkGroupInvocations(MemorySegment segment, long index) { return (int) VH_maxPreferredMeshWorkGroupInvocations.get(segment, 0L, index); }
    /// {@return `maxPreferredMeshWorkGroupInvocations`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxPreferredMeshWorkGroupInvocations(MemorySegment segment) { return VkPhysicalDeviceMeshShaderPropertiesEXT.get_maxPreferredMeshWorkGroupInvocations(segment, 0L); }
    /// {@return `maxPreferredMeshWorkGroupInvocations` at the given index}
    /// @param index the index
    public @CType("uint32_t") int maxPreferredMeshWorkGroupInvocationsAt(long index) { return VkPhysicalDeviceMeshShaderPropertiesEXT.get_maxPreferredMeshWorkGroupInvocations(this.segment(), index); }
    /// {@return `maxPreferredMeshWorkGroupInvocations`}
    public @CType("uint32_t") int maxPreferredMeshWorkGroupInvocations() { return VkPhysicalDeviceMeshShaderPropertiesEXT.get_maxPreferredMeshWorkGroupInvocations(this.segment()); }
    /// Sets `maxPreferredMeshWorkGroupInvocations` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxPreferredMeshWorkGroupInvocations(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxPreferredMeshWorkGroupInvocations.set(segment, 0L, index, value); }
    /// Sets `maxPreferredMeshWorkGroupInvocations` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxPreferredMeshWorkGroupInvocations(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceMeshShaderPropertiesEXT.set_maxPreferredMeshWorkGroupInvocations(segment, 0L, value); }
    /// Sets `maxPreferredMeshWorkGroupInvocations` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMeshShaderPropertiesEXT maxPreferredMeshWorkGroupInvocationsAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceMeshShaderPropertiesEXT.set_maxPreferredMeshWorkGroupInvocations(this.segment(), index, value); return this; }
    /// Sets `maxPreferredMeshWorkGroupInvocations` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMeshShaderPropertiesEXT maxPreferredMeshWorkGroupInvocations(@CType("uint32_t") int value) { VkPhysicalDeviceMeshShaderPropertiesEXT.set_maxPreferredMeshWorkGroupInvocations(this.segment(), value); return this; }

    /// {@return `prefersLocalInvocationVertexOutput` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_prefersLocalInvocationVertexOutput(MemorySegment segment, long index) { return (int) VH_prefersLocalInvocationVertexOutput.get(segment, 0L, index); }
    /// {@return `prefersLocalInvocationVertexOutput`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_prefersLocalInvocationVertexOutput(MemorySegment segment) { return VkPhysicalDeviceMeshShaderPropertiesEXT.get_prefersLocalInvocationVertexOutput(segment, 0L); }
    /// {@return `prefersLocalInvocationVertexOutput` at the given index}
    /// @param index the index
    public @CType("VkBool32") int prefersLocalInvocationVertexOutputAt(long index) { return VkPhysicalDeviceMeshShaderPropertiesEXT.get_prefersLocalInvocationVertexOutput(this.segment(), index); }
    /// {@return `prefersLocalInvocationVertexOutput`}
    public @CType("VkBool32") int prefersLocalInvocationVertexOutput() { return VkPhysicalDeviceMeshShaderPropertiesEXT.get_prefersLocalInvocationVertexOutput(this.segment()); }
    /// Sets `prefersLocalInvocationVertexOutput` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_prefersLocalInvocationVertexOutput(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_prefersLocalInvocationVertexOutput.set(segment, 0L, index, value); }
    /// Sets `prefersLocalInvocationVertexOutput` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_prefersLocalInvocationVertexOutput(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceMeshShaderPropertiesEXT.set_prefersLocalInvocationVertexOutput(segment, 0L, value); }
    /// Sets `prefersLocalInvocationVertexOutput` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMeshShaderPropertiesEXT prefersLocalInvocationVertexOutputAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceMeshShaderPropertiesEXT.set_prefersLocalInvocationVertexOutput(this.segment(), index, value); return this; }
    /// Sets `prefersLocalInvocationVertexOutput` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMeshShaderPropertiesEXT prefersLocalInvocationVertexOutput(@CType("VkBool32") int value) { VkPhysicalDeviceMeshShaderPropertiesEXT.set_prefersLocalInvocationVertexOutput(this.segment(), value); return this; }

    /// {@return `prefersLocalInvocationPrimitiveOutput` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_prefersLocalInvocationPrimitiveOutput(MemorySegment segment, long index) { return (int) VH_prefersLocalInvocationPrimitiveOutput.get(segment, 0L, index); }
    /// {@return `prefersLocalInvocationPrimitiveOutput`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_prefersLocalInvocationPrimitiveOutput(MemorySegment segment) { return VkPhysicalDeviceMeshShaderPropertiesEXT.get_prefersLocalInvocationPrimitiveOutput(segment, 0L); }
    /// {@return `prefersLocalInvocationPrimitiveOutput` at the given index}
    /// @param index the index
    public @CType("VkBool32") int prefersLocalInvocationPrimitiveOutputAt(long index) { return VkPhysicalDeviceMeshShaderPropertiesEXT.get_prefersLocalInvocationPrimitiveOutput(this.segment(), index); }
    /// {@return `prefersLocalInvocationPrimitiveOutput`}
    public @CType("VkBool32") int prefersLocalInvocationPrimitiveOutput() { return VkPhysicalDeviceMeshShaderPropertiesEXT.get_prefersLocalInvocationPrimitiveOutput(this.segment()); }
    /// Sets `prefersLocalInvocationPrimitiveOutput` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_prefersLocalInvocationPrimitiveOutput(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_prefersLocalInvocationPrimitiveOutput.set(segment, 0L, index, value); }
    /// Sets `prefersLocalInvocationPrimitiveOutput` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_prefersLocalInvocationPrimitiveOutput(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceMeshShaderPropertiesEXT.set_prefersLocalInvocationPrimitiveOutput(segment, 0L, value); }
    /// Sets `prefersLocalInvocationPrimitiveOutput` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMeshShaderPropertiesEXT prefersLocalInvocationPrimitiveOutputAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceMeshShaderPropertiesEXT.set_prefersLocalInvocationPrimitiveOutput(this.segment(), index, value); return this; }
    /// Sets `prefersLocalInvocationPrimitiveOutput` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMeshShaderPropertiesEXT prefersLocalInvocationPrimitiveOutput(@CType("VkBool32") int value) { VkPhysicalDeviceMeshShaderPropertiesEXT.set_prefersLocalInvocationPrimitiveOutput(this.segment(), value); return this; }

    /// {@return `prefersCompactVertexOutput` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_prefersCompactVertexOutput(MemorySegment segment, long index) { return (int) VH_prefersCompactVertexOutput.get(segment, 0L, index); }
    /// {@return `prefersCompactVertexOutput`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_prefersCompactVertexOutput(MemorySegment segment) { return VkPhysicalDeviceMeshShaderPropertiesEXT.get_prefersCompactVertexOutput(segment, 0L); }
    /// {@return `prefersCompactVertexOutput` at the given index}
    /// @param index the index
    public @CType("VkBool32") int prefersCompactVertexOutputAt(long index) { return VkPhysicalDeviceMeshShaderPropertiesEXT.get_prefersCompactVertexOutput(this.segment(), index); }
    /// {@return `prefersCompactVertexOutput`}
    public @CType("VkBool32") int prefersCompactVertexOutput() { return VkPhysicalDeviceMeshShaderPropertiesEXT.get_prefersCompactVertexOutput(this.segment()); }
    /// Sets `prefersCompactVertexOutput` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_prefersCompactVertexOutput(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_prefersCompactVertexOutput.set(segment, 0L, index, value); }
    /// Sets `prefersCompactVertexOutput` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_prefersCompactVertexOutput(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceMeshShaderPropertiesEXT.set_prefersCompactVertexOutput(segment, 0L, value); }
    /// Sets `prefersCompactVertexOutput` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMeshShaderPropertiesEXT prefersCompactVertexOutputAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceMeshShaderPropertiesEXT.set_prefersCompactVertexOutput(this.segment(), index, value); return this; }
    /// Sets `prefersCompactVertexOutput` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMeshShaderPropertiesEXT prefersCompactVertexOutput(@CType("VkBool32") int value) { VkPhysicalDeviceMeshShaderPropertiesEXT.set_prefersCompactVertexOutput(this.segment(), value); return this; }

    /// {@return `prefersCompactPrimitiveOutput` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_prefersCompactPrimitiveOutput(MemorySegment segment, long index) { return (int) VH_prefersCompactPrimitiveOutput.get(segment, 0L, index); }
    /// {@return `prefersCompactPrimitiveOutput`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_prefersCompactPrimitiveOutput(MemorySegment segment) { return VkPhysicalDeviceMeshShaderPropertiesEXT.get_prefersCompactPrimitiveOutput(segment, 0L); }
    /// {@return `prefersCompactPrimitiveOutput` at the given index}
    /// @param index the index
    public @CType("VkBool32") int prefersCompactPrimitiveOutputAt(long index) { return VkPhysicalDeviceMeshShaderPropertiesEXT.get_prefersCompactPrimitiveOutput(this.segment(), index); }
    /// {@return `prefersCompactPrimitiveOutput`}
    public @CType("VkBool32") int prefersCompactPrimitiveOutput() { return VkPhysicalDeviceMeshShaderPropertiesEXT.get_prefersCompactPrimitiveOutput(this.segment()); }
    /// Sets `prefersCompactPrimitiveOutput` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_prefersCompactPrimitiveOutput(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_prefersCompactPrimitiveOutput.set(segment, 0L, index, value); }
    /// Sets `prefersCompactPrimitiveOutput` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_prefersCompactPrimitiveOutput(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceMeshShaderPropertiesEXT.set_prefersCompactPrimitiveOutput(segment, 0L, value); }
    /// Sets `prefersCompactPrimitiveOutput` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMeshShaderPropertiesEXT prefersCompactPrimitiveOutputAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceMeshShaderPropertiesEXT.set_prefersCompactPrimitiveOutput(this.segment(), index, value); return this; }
    /// Sets `prefersCompactPrimitiveOutput` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMeshShaderPropertiesEXT prefersCompactPrimitiveOutput(@CType("VkBool32") int value) { VkPhysicalDeviceMeshShaderPropertiesEXT.set_prefersCompactPrimitiveOutput(this.segment(), value); return this; }

}
