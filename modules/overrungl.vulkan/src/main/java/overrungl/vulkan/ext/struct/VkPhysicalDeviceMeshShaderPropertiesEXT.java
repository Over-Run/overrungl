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
package overrungl.vulkan.ext.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkPhysicalDeviceMeshShaderPropertiesEXT {
///     (int) VkStructureType sType;
///     void* pNext;
///     uint32_t maxTaskWorkGroupTotalCount;
///     uint32_t maxTaskWorkGroupCount[3];
///     uint32_t maxTaskWorkGroupInvocations;
///     uint32_t maxTaskWorkGroupSize[3];
///     uint32_t maxTaskPayloadSize;
///     uint32_t maxTaskSharedMemorySize;
///     uint32_t maxTaskPayloadAndSharedMemorySize;
///     uint32_t maxMeshWorkGroupTotalCount;
///     uint32_t maxMeshWorkGroupCount[3];
///     uint32_t maxMeshWorkGroupInvocations;
///     uint32_t maxMeshWorkGroupSize[3];
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
///     (uint32_t) VkBool32 prefersLocalInvocationVertexOutput;
///     (uint32_t) VkBool32 prefersLocalInvocationPrimitiveOutput;
///     (uint32_t) VkBool32 prefersCompactVertexOutput;
///     (uint32_t) VkBool32 prefersCompactPrimitiveOutput;
/// };
/// ```
public sealed class VkPhysicalDeviceMeshShaderPropertiesEXT extends GroupType {
    /// The struct layout of `VkPhysicalDeviceMeshShaderPropertiesEXT`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("maxTaskWorkGroupTotalCount"),
        MemoryLayout.sequenceLayout(3L, ValueLayout.JAVA_INT).withName("maxTaskWorkGroupCount"),
        ValueLayout.JAVA_INT.withName("maxTaskWorkGroupInvocations"),
        MemoryLayout.sequenceLayout(3L, ValueLayout.JAVA_INT).withName("maxTaskWorkGroupSize"),
        ValueLayout.JAVA_INT.withName("maxTaskPayloadSize"),
        ValueLayout.JAVA_INT.withName("maxTaskSharedMemorySize"),
        ValueLayout.JAVA_INT.withName("maxTaskPayloadAndSharedMemorySize"),
        ValueLayout.JAVA_INT.withName("maxMeshWorkGroupTotalCount"),
        MemoryLayout.sequenceLayout(3L, ValueLayout.JAVA_INT).withName("maxMeshWorkGroupCount"),
        ValueLayout.JAVA_INT.withName("maxMeshWorkGroupInvocations"),
        MemoryLayout.sequenceLayout(3L, ValueLayout.JAVA_INT).withName("maxMeshWorkGroupSize"),
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
    /// The byte offset of `maxTaskWorkGroupTotalCount`.
    public static final long OFFSET_maxTaskWorkGroupTotalCount = LAYOUT.byteOffset(PathElement.groupElement("maxTaskWorkGroupTotalCount"));
    /// The memory layout of `maxTaskWorkGroupTotalCount`.
    public static final MemoryLayout LAYOUT_maxTaskWorkGroupTotalCount = LAYOUT.select(PathElement.groupElement("maxTaskWorkGroupTotalCount"));
    /// The [VarHandle] of `maxTaskWorkGroupTotalCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxTaskWorkGroupTotalCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxTaskWorkGroupTotalCount"));
    /// The byte offset of `maxTaskWorkGroupCount`.
    public static final long OFFSET_maxTaskWorkGroupCount = LAYOUT.byteOffset(PathElement.groupElement("maxTaskWorkGroupCount"));
    /// The memory layout of `maxTaskWorkGroupCount`.
    public static final MemoryLayout LAYOUT_maxTaskWorkGroupCount = LAYOUT.select(PathElement.groupElement("maxTaskWorkGroupCount"));
    /// The [VarHandle] of `maxTaskWorkGroupCount` of type `(MemorySegment base, long baseOffset, long index, long index0)MemorySegment`.
    public static final VarHandle VH_maxTaskWorkGroupCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxTaskWorkGroupCount"), PathElement.sequenceElement());
    /// The byte offset of `maxTaskWorkGroupInvocations`.
    public static final long OFFSET_maxTaskWorkGroupInvocations = LAYOUT.byteOffset(PathElement.groupElement("maxTaskWorkGroupInvocations"));
    /// The memory layout of `maxTaskWorkGroupInvocations`.
    public static final MemoryLayout LAYOUT_maxTaskWorkGroupInvocations = LAYOUT.select(PathElement.groupElement("maxTaskWorkGroupInvocations"));
    /// The [VarHandle] of `maxTaskWorkGroupInvocations` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxTaskWorkGroupInvocations = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxTaskWorkGroupInvocations"));
    /// The byte offset of `maxTaskWorkGroupSize`.
    public static final long OFFSET_maxTaskWorkGroupSize = LAYOUT.byteOffset(PathElement.groupElement("maxTaskWorkGroupSize"));
    /// The memory layout of `maxTaskWorkGroupSize`.
    public static final MemoryLayout LAYOUT_maxTaskWorkGroupSize = LAYOUT.select(PathElement.groupElement("maxTaskWorkGroupSize"));
    /// The [VarHandle] of `maxTaskWorkGroupSize` of type `(MemorySegment base, long baseOffset, long index, long index0)MemorySegment`.
    public static final VarHandle VH_maxTaskWorkGroupSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxTaskWorkGroupSize"), PathElement.sequenceElement());
    /// The byte offset of `maxTaskPayloadSize`.
    public static final long OFFSET_maxTaskPayloadSize = LAYOUT.byteOffset(PathElement.groupElement("maxTaskPayloadSize"));
    /// The memory layout of `maxTaskPayloadSize`.
    public static final MemoryLayout LAYOUT_maxTaskPayloadSize = LAYOUT.select(PathElement.groupElement("maxTaskPayloadSize"));
    /// The [VarHandle] of `maxTaskPayloadSize` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxTaskPayloadSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxTaskPayloadSize"));
    /// The byte offset of `maxTaskSharedMemorySize`.
    public static final long OFFSET_maxTaskSharedMemorySize = LAYOUT.byteOffset(PathElement.groupElement("maxTaskSharedMemorySize"));
    /// The memory layout of `maxTaskSharedMemorySize`.
    public static final MemoryLayout LAYOUT_maxTaskSharedMemorySize = LAYOUT.select(PathElement.groupElement("maxTaskSharedMemorySize"));
    /// The [VarHandle] of `maxTaskSharedMemorySize` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxTaskSharedMemorySize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxTaskSharedMemorySize"));
    /// The byte offset of `maxTaskPayloadAndSharedMemorySize`.
    public static final long OFFSET_maxTaskPayloadAndSharedMemorySize = LAYOUT.byteOffset(PathElement.groupElement("maxTaskPayloadAndSharedMemorySize"));
    /// The memory layout of `maxTaskPayloadAndSharedMemorySize`.
    public static final MemoryLayout LAYOUT_maxTaskPayloadAndSharedMemorySize = LAYOUT.select(PathElement.groupElement("maxTaskPayloadAndSharedMemorySize"));
    /// The [VarHandle] of `maxTaskPayloadAndSharedMemorySize` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxTaskPayloadAndSharedMemorySize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxTaskPayloadAndSharedMemorySize"));
    /// The byte offset of `maxMeshWorkGroupTotalCount`.
    public static final long OFFSET_maxMeshWorkGroupTotalCount = LAYOUT.byteOffset(PathElement.groupElement("maxMeshWorkGroupTotalCount"));
    /// The memory layout of `maxMeshWorkGroupTotalCount`.
    public static final MemoryLayout LAYOUT_maxMeshWorkGroupTotalCount = LAYOUT.select(PathElement.groupElement("maxMeshWorkGroupTotalCount"));
    /// The [VarHandle] of `maxMeshWorkGroupTotalCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxMeshWorkGroupTotalCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxMeshWorkGroupTotalCount"));
    /// The byte offset of `maxMeshWorkGroupCount`.
    public static final long OFFSET_maxMeshWorkGroupCount = LAYOUT.byteOffset(PathElement.groupElement("maxMeshWorkGroupCount"));
    /// The memory layout of `maxMeshWorkGroupCount`.
    public static final MemoryLayout LAYOUT_maxMeshWorkGroupCount = LAYOUT.select(PathElement.groupElement("maxMeshWorkGroupCount"));
    /// The [VarHandle] of `maxMeshWorkGroupCount` of type `(MemorySegment base, long baseOffset, long index, long index0)MemorySegment`.
    public static final VarHandle VH_maxMeshWorkGroupCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxMeshWorkGroupCount"), PathElement.sequenceElement());
    /// The byte offset of `maxMeshWorkGroupInvocations`.
    public static final long OFFSET_maxMeshWorkGroupInvocations = LAYOUT.byteOffset(PathElement.groupElement("maxMeshWorkGroupInvocations"));
    /// The memory layout of `maxMeshWorkGroupInvocations`.
    public static final MemoryLayout LAYOUT_maxMeshWorkGroupInvocations = LAYOUT.select(PathElement.groupElement("maxMeshWorkGroupInvocations"));
    /// The [VarHandle] of `maxMeshWorkGroupInvocations` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxMeshWorkGroupInvocations = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxMeshWorkGroupInvocations"));
    /// The byte offset of `maxMeshWorkGroupSize`.
    public static final long OFFSET_maxMeshWorkGroupSize = LAYOUT.byteOffset(PathElement.groupElement("maxMeshWorkGroupSize"));
    /// The memory layout of `maxMeshWorkGroupSize`.
    public static final MemoryLayout LAYOUT_maxMeshWorkGroupSize = LAYOUT.select(PathElement.groupElement("maxMeshWorkGroupSize"));
    /// The [VarHandle] of `maxMeshWorkGroupSize` of type `(MemorySegment base, long baseOffset, long index, long index0)MemorySegment`.
    public static final VarHandle VH_maxMeshWorkGroupSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxMeshWorkGroupSize"), PathElement.sequenceElement());
    /// The byte offset of `maxMeshSharedMemorySize`.
    public static final long OFFSET_maxMeshSharedMemorySize = LAYOUT.byteOffset(PathElement.groupElement("maxMeshSharedMemorySize"));
    /// The memory layout of `maxMeshSharedMemorySize`.
    public static final MemoryLayout LAYOUT_maxMeshSharedMemorySize = LAYOUT.select(PathElement.groupElement("maxMeshSharedMemorySize"));
    /// The [VarHandle] of `maxMeshSharedMemorySize` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxMeshSharedMemorySize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxMeshSharedMemorySize"));
    /// The byte offset of `maxMeshPayloadAndSharedMemorySize`.
    public static final long OFFSET_maxMeshPayloadAndSharedMemorySize = LAYOUT.byteOffset(PathElement.groupElement("maxMeshPayloadAndSharedMemorySize"));
    /// The memory layout of `maxMeshPayloadAndSharedMemorySize`.
    public static final MemoryLayout LAYOUT_maxMeshPayloadAndSharedMemorySize = LAYOUT.select(PathElement.groupElement("maxMeshPayloadAndSharedMemorySize"));
    /// The [VarHandle] of `maxMeshPayloadAndSharedMemorySize` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxMeshPayloadAndSharedMemorySize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxMeshPayloadAndSharedMemorySize"));
    /// The byte offset of `maxMeshOutputMemorySize`.
    public static final long OFFSET_maxMeshOutputMemorySize = LAYOUT.byteOffset(PathElement.groupElement("maxMeshOutputMemorySize"));
    /// The memory layout of `maxMeshOutputMemorySize`.
    public static final MemoryLayout LAYOUT_maxMeshOutputMemorySize = LAYOUT.select(PathElement.groupElement("maxMeshOutputMemorySize"));
    /// The [VarHandle] of `maxMeshOutputMemorySize` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxMeshOutputMemorySize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxMeshOutputMemorySize"));
    /// The byte offset of `maxMeshPayloadAndOutputMemorySize`.
    public static final long OFFSET_maxMeshPayloadAndOutputMemorySize = LAYOUT.byteOffset(PathElement.groupElement("maxMeshPayloadAndOutputMemorySize"));
    /// The memory layout of `maxMeshPayloadAndOutputMemorySize`.
    public static final MemoryLayout LAYOUT_maxMeshPayloadAndOutputMemorySize = LAYOUT.select(PathElement.groupElement("maxMeshPayloadAndOutputMemorySize"));
    /// The [VarHandle] of `maxMeshPayloadAndOutputMemorySize` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxMeshPayloadAndOutputMemorySize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxMeshPayloadAndOutputMemorySize"));
    /// The byte offset of `maxMeshOutputComponents`.
    public static final long OFFSET_maxMeshOutputComponents = LAYOUT.byteOffset(PathElement.groupElement("maxMeshOutputComponents"));
    /// The memory layout of `maxMeshOutputComponents`.
    public static final MemoryLayout LAYOUT_maxMeshOutputComponents = LAYOUT.select(PathElement.groupElement("maxMeshOutputComponents"));
    /// The [VarHandle] of `maxMeshOutputComponents` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxMeshOutputComponents = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxMeshOutputComponents"));
    /// The byte offset of `maxMeshOutputVertices`.
    public static final long OFFSET_maxMeshOutputVertices = LAYOUT.byteOffset(PathElement.groupElement("maxMeshOutputVertices"));
    /// The memory layout of `maxMeshOutputVertices`.
    public static final MemoryLayout LAYOUT_maxMeshOutputVertices = LAYOUT.select(PathElement.groupElement("maxMeshOutputVertices"));
    /// The [VarHandle] of `maxMeshOutputVertices` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxMeshOutputVertices = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxMeshOutputVertices"));
    /// The byte offset of `maxMeshOutputPrimitives`.
    public static final long OFFSET_maxMeshOutputPrimitives = LAYOUT.byteOffset(PathElement.groupElement("maxMeshOutputPrimitives"));
    /// The memory layout of `maxMeshOutputPrimitives`.
    public static final MemoryLayout LAYOUT_maxMeshOutputPrimitives = LAYOUT.select(PathElement.groupElement("maxMeshOutputPrimitives"));
    /// The [VarHandle] of `maxMeshOutputPrimitives` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxMeshOutputPrimitives = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxMeshOutputPrimitives"));
    /// The byte offset of `maxMeshOutputLayers`.
    public static final long OFFSET_maxMeshOutputLayers = LAYOUT.byteOffset(PathElement.groupElement("maxMeshOutputLayers"));
    /// The memory layout of `maxMeshOutputLayers`.
    public static final MemoryLayout LAYOUT_maxMeshOutputLayers = LAYOUT.select(PathElement.groupElement("maxMeshOutputLayers"));
    /// The [VarHandle] of `maxMeshOutputLayers` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxMeshOutputLayers = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxMeshOutputLayers"));
    /// The byte offset of `maxMeshMultiviewViewCount`.
    public static final long OFFSET_maxMeshMultiviewViewCount = LAYOUT.byteOffset(PathElement.groupElement("maxMeshMultiviewViewCount"));
    /// The memory layout of `maxMeshMultiviewViewCount`.
    public static final MemoryLayout LAYOUT_maxMeshMultiviewViewCount = LAYOUT.select(PathElement.groupElement("maxMeshMultiviewViewCount"));
    /// The [VarHandle] of `maxMeshMultiviewViewCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxMeshMultiviewViewCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxMeshMultiviewViewCount"));
    /// The byte offset of `meshOutputPerVertexGranularity`.
    public static final long OFFSET_meshOutputPerVertexGranularity = LAYOUT.byteOffset(PathElement.groupElement("meshOutputPerVertexGranularity"));
    /// The memory layout of `meshOutputPerVertexGranularity`.
    public static final MemoryLayout LAYOUT_meshOutputPerVertexGranularity = LAYOUT.select(PathElement.groupElement("meshOutputPerVertexGranularity"));
    /// The [VarHandle] of `meshOutputPerVertexGranularity` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_meshOutputPerVertexGranularity = LAYOUT.arrayElementVarHandle(PathElement.groupElement("meshOutputPerVertexGranularity"));
    /// The byte offset of `meshOutputPerPrimitiveGranularity`.
    public static final long OFFSET_meshOutputPerPrimitiveGranularity = LAYOUT.byteOffset(PathElement.groupElement("meshOutputPerPrimitiveGranularity"));
    /// The memory layout of `meshOutputPerPrimitiveGranularity`.
    public static final MemoryLayout LAYOUT_meshOutputPerPrimitiveGranularity = LAYOUT.select(PathElement.groupElement("meshOutputPerPrimitiveGranularity"));
    /// The [VarHandle] of `meshOutputPerPrimitiveGranularity` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_meshOutputPerPrimitiveGranularity = LAYOUT.arrayElementVarHandle(PathElement.groupElement("meshOutputPerPrimitiveGranularity"));
    /// The byte offset of `maxPreferredTaskWorkGroupInvocations`.
    public static final long OFFSET_maxPreferredTaskWorkGroupInvocations = LAYOUT.byteOffset(PathElement.groupElement("maxPreferredTaskWorkGroupInvocations"));
    /// The memory layout of `maxPreferredTaskWorkGroupInvocations`.
    public static final MemoryLayout LAYOUT_maxPreferredTaskWorkGroupInvocations = LAYOUT.select(PathElement.groupElement("maxPreferredTaskWorkGroupInvocations"));
    /// The [VarHandle] of `maxPreferredTaskWorkGroupInvocations` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxPreferredTaskWorkGroupInvocations = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxPreferredTaskWorkGroupInvocations"));
    /// The byte offset of `maxPreferredMeshWorkGroupInvocations`.
    public static final long OFFSET_maxPreferredMeshWorkGroupInvocations = LAYOUT.byteOffset(PathElement.groupElement("maxPreferredMeshWorkGroupInvocations"));
    /// The memory layout of `maxPreferredMeshWorkGroupInvocations`.
    public static final MemoryLayout LAYOUT_maxPreferredMeshWorkGroupInvocations = LAYOUT.select(PathElement.groupElement("maxPreferredMeshWorkGroupInvocations"));
    /// The [VarHandle] of `maxPreferredMeshWorkGroupInvocations` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxPreferredMeshWorkGroupInvocations = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxPreferredMeshWorkGroupInvocations"));
    /// The byte offset of `prefersLocalInvocationVertexOutput`.
    public static final long OFFSET_prefersLocalInvocationVertexOutput = LAYOUT.byteOffset(PathElement.groupElement("prefersLocalInvocationVertexOutput"));
    /// The memory layout of `prefersLocalInvocationVertexOutput`.
    public static final MemoryLayout LAYOUT_prefersLocalInvocationVertexOutput = LAYOUT.select(PathElement.groupElement("prefersLocalInvocationVertexOutput"));
    /// The [VarHandle] of `prefersLocalInvocationVertexOutput` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_prefersLocalInvocationVertexOutput = LAYOUT.arrayElementVarHandle(PathElement.groupElement("prefersLocalInvocationVertexOutput"));
    /// The byte offset of `prefersLocalInvocationPrimitiveOutput`.
    public static final long OFFSET_prefersLocalInvocationPrimitiveOutput = LAYOUT.byteOffset(PathElement.groupElement("prefersLocalInvocationPrimitiveOutput"));
    /// The memory layout of `prefersLocalInvocationPrimitiveOutput`.
    public static final MemoryLayout LAYOUT_prefersLocalInvocationPrimitiveOutput = LAYOUT.select(PathElement.groupElement("prefersLocalInvocationPrimitiveOutput"));
    /// The [VarHandle] of `prefersLocalInvocationPrimitiveOutput` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_prefersLocalInvocationPrimitiveOutput = LAYOUT.arrayElementVarHandle(PathElement.groupElement("prefersLocalInvocationPrimitiveOutput"));
    /// The byte offset of `prefersCompactVertexOutput`.
    public static final long OFFSET_prefersCompactVertexOutput = LAYOUT.byteOffset(PathElement.groupElement("prefersCompactVertexOutput"));
    /// The memory layout of `prefersCompactVertexOutput`.
    public static final MemoryLayout LAYOUT_prefersCompactVertexOutput = LAYOUT.select(PathElement.groupElement("prefersCompactVertexOutput"));
    /// The [VarHandle] of `prefersCompactVertexOutput` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_prefersCompactVertexOutput = LAYOUT.arrayElementVarHandle(PathElement.groupElement("prefersCompactVertexOutput"));
    /// The byte offset of `prefersCompactPrimitiveOutput`.
    public static final long OFFSET_prefersCompactPrimitiveOutput = LAYOUT.byteOffset(PathElement.groupElement("prefersCompactPrimitiveOutput"));
    /// The memory layout of `prefersCompactPrimitiveOutput`.
    public static final MemoryLayout LAYOUT_prefersCompactPrimitiveOutput = LAYOUT.select(PathElement.groupElement("prefersCompactPrimitiveOutput"));
    /// The [VarHandle] of `prefersCompactPrimitiveOutput` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_prefersCompactPrimitiveOutput = LAYOUT.arrayElementVarHandle(PathElement.groupElement("prefersCompactPrimitiveOutput"));

    /// Creates `VkPhysicalDeviceMeshShaderPropertiesEXT` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceMeshShaderPropertiesEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceMeshShaderPropertiesEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceMeshShaderPropertiesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceMeshShaderPropertiesEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceMeshShaderPropertiesEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDeviceMeshShaderPropertiesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkPhysicalDeviceMeshShaderPropertiesEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceMeshShaderPropertiesEXT`
    public static VkPhysicalDeviceMeshShaderPropertiesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceMeshShaderPropertiesEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceMeshShaderPropertiesEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceMeshShaderPropertiesEXT`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceMeshShaderPropertiesEXT copyFrom(VkPhysicalDeviceMeshShaderPropertiesEXT src) { this.segment().copyFrom(src.segment()); return this; }

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
    public VkPhysicalDeviceMeshShaderPropertiesEXT sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceMeshShaderPropertiesEXT pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `maxTaskWorkGroupTotalCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxTaskWorkGroupTotalCount(MemorySegment segment, long index) { return (int) VH_maxTaskWorkGroupTotalCount.get(segment, 0L, index); }
    /// {@return `maxTaskWorkGroupTotalCount`}
    public int maxTaskWorkGroupTotalCount() { return maxTaskWorkGroupTotalCount(this.segment(), 0L); }
    /// Sets `maxTaskWorkGroupTotalCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxTaskWorkGroupTotalCount(MemorySegment segment, long index, int value) { VH_maxTaskWorkGroupTotalCount.set(segment, 0L, index, value); }
    /// Sets `maxTaskWorkGroupTotalCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMeshShaderPropertiesEXT maxTaskWorkGroupTotalCount(int value) { maxTaskWorkGroupTotalCount(this.segment(), 0L, value); return this; }

    /// {@return `maxTaskWorkGroupCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment maxTaskWorkGroupCount(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_maxTaskWorkGroupCount, index), LAYOUT_maxTaskWorkGroupCount); }
    /// {@return `maxTaskWorkGroupCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    public static int maxTaskWorkGroupCount(MemorySegment segment, long index, long index0) { return (int) VH_maxTaskWorkGroupCount.get(segment, 0L, index, index0); }
    /// {@return `maxTaskWorkGroupCount`}
    public MemorySegment maxTaskWorkGroupCount() { return maxTaskWorkGroupCount(this.segment(), 0L); }
    /// {@return `maxTaskWorkGroupCount`}
    /// @param index0 the Index 0 of the array
    public int maxTaskWorkGroupCount(long index0) { return maxTaskWorkGroupCount(this.segment(), 0L, index0); }
    /// Sets `maxTaskWorkGroupCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxTaskWorkGroupCount(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_maxTaskWorkGroupCount, index), LAYOUT_maxTaskWorkGroupCount.byteSize()); }
    /// Sets `maxTaskWorkGroupCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    public static void maxTaskWorkGroupCount(MemorySegment segment, long index, long index0, int value) { VH_maxTaskWorkGroupCount.set(segment, 0L, index, index0, value); }
    /// Sets `maxTaskWorkGroupCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMeshShaderPropertiesEXT maxTaskWorkGroupCount(MemorySegment value) { maxTaskWorkGroupCount(this.segment(), 0L, value); return this; }
    /// Sets `maxTaskWorkGroupCount` with the given value.
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMeshShaderPropertiesEXT maxTaskWorkGroupCount(long index0, int value) { maxTaskWorkGroupCount(this.segment(), 0L, index0, value); return this; }

    /// {@return `maxTaskWorkGroupInvocations` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxTaskWorkGroupInvocations(MemorySegment segment, long index) { return (int) VH_maxTaskWorkGroupInvocations.get(segment, 0L, index); }
    /// {@return `maxTaskWorkGroupInvocations`}
    public int maxTaskWorkGroupInvocations() { return maxTaskWorkGroupInvocations(this.segment(), 0L); }
    /// Sets `maxTaskWorkGroupInvocations` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxTaskWorkGroupInvocations(MemorySegment segment, long index, int value) { VH_maxTaskWorkGroupInvocations.set(segment, 0L, index, value); }
    /// Sets `maxTaskWorkGroupInvocations` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMeshShaderPropertiesEXT maxTaskWorkGroupInvocations(int value) { maxTaskWorkGroupInvocations(this.segment(), 0L, value); return this; }

    /// {@return `maxTaskWorkGroupSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment maxTaskWorkGroupSize(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_maxTaskWorkGroupSize, index), LAYOUT_maxTaskWorkGroupSize); }
    /// {@return `maxTaskWorkGroupSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    public static int maxTaskWorkGroupSize(MemorySegment segment, long index, long index0) { return (int) VH_maxTaskWorkGroupSize.get(segment, 0L, index, index0); }
    /// {@return `maxTaskWorkGroupSize`}
    public MemorySegment maxTaskWorkGroupSize() { return maxTaskWorkGroupSize(this.segment(), 0L); }
    /// {@return `maxTaskWorkGroupSize`}
    /// @param index0 the Index 0 of the array
    public int maxTaskWorkGroupSize(long index0) { return maxTaskWorkGroupSize(this.segment(), 0L, index0); }
    /// Sets `maxTaskWorkGroupSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxTaskWorkGroupSize(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_maxTaskWorkGroupSize, index), LAYOUT_maxTaskWorkGroupSize.byteSize()); }
    /// Sets `maxTaskWorkGroupSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    public static void maxTaskWorkGroupSize(MemorySegment segment, long index, long index0, int value) { VH_maxTaskWorkGroupSize.set(segment, 0L, index, index0, value); }
    /// Sets `maxTaskWorkGroupSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMeshShaderPropertiesEXT maxTaskWorkGroupSize(MemorySegment value) { maxTaskWorkGroupSize(this.segment(), 0L, value); return this; }
    /// Sets `maxTaskWorkGroupSize` with the given value.
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMeshShaderPropertiesEXT maxTaskWorkGroupSize(long index0, int value) { maxTaskWorkGroupSize(this.segment(), 0L, index0, value); return this; }

    /// {@return `maxTaskPayloadSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxTaskPayloadSize(MemorySegment segment, long index) { return (int) VH_maxTaskPayloadSize.get(segment, 0L, index); }
    /// {@return `maxTaskPayloadSize`}
    public int maxTaskPayloadSize() { return maxTaskPayloadSize(this.segment(), 0L); }
    /// Sets `maxTaskPayloadSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxTaskPayloadSize(MemorySegment segment, long index, int value) { VH_maxTaskPayloadSize.set(segment, 0L, index, value); }
    /// Sets `maxTaskPayloadSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMeshShaderPropertiesEXT maxTaskPayloadSize(int value) { maxTaskPayloadSize(this.segment(), 0L, value); return this; }

    /// {@return `maxTaskSharedMemorySize` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxTaskSharedMemorySize(MemorySegment segment, long index) { return (int) VH_maxTaskSharedMemorySize.get(segment, 0L, index); }
    /// {@return `maxTaskSharedMemorySize`}
    public int maxTaskSharedMemorySize() { return maxTaskSharedMemorySize(this.segment(), 0L); }
    /// Sets `maxTaskSharedMemorySize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxTaskSharedMemorySize(MemorySegment segment, long index, int value) { VH_maxTaskSharedMemorySize.set(segment, 0L, index, value); }
    /// Sets `maxTaskSharedMemorySize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMeshShaderPropertiesEXT maxTaskSharedMemorySize(int value) { maxTaskSharedMemorySize(this.segment(), 0L, value); return this; }

    /// {@return `maxTaskPayloadAndSharedMemorySize` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxTaskPayloadAndSharedMemorySize(MemorySegment segment, long index) { return (int) VH_maxTaskPayloadAndSharedMemorySize.get(segment, 0L, index); }
    /// {@return `maxTaskPayloadAndSharedMemorySize`}
    public int maxTaskPayloadAndSharedMemorySize() { return maxTaskPayloadAndSharedMemorySize(this.segment(), 0L); }
    /// Sets `maxTaskPayloadAndSharedMemorySize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxTaskPayloadAndSharedMemorySize(MemorySegment segment, long index, int value) { VH_maxTaskPayloadAndSharedMemorySize.set(segment, 0L, index, value); }
    /// Sets `maxTaskPayloadAndSharedMemorySize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMeshShaderPropertiesEXT maxTaskPayloadAndSharedMemorySize(int value) { maxTaskPayloadAndSharedMemorySize(this.segment(), 0L, value); return this; }

    /// {@return `maxMeshWorkGroupTotalCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxMeshWorkGroupTotalCount(MemorySegment segment, long index) { return (int) VH_maxMeshWorkGroupTotalCount.get(segment, 0L, index); }
    /// {@return `maxMeshWorkGroupTotalCount`}
    public int maxMeshWorkGroupTotalCount() { return maxMeshWorkGroupTotalCount(this.segment(), 0L); }
    /// Sets `maxMeshWorkGroupTotalCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxMeshWorkGroupTotalCount(MemorySegment segment, long index, int value) { VH_maxMeshWorkGroupTotalCount.set(segment, 0L, index, value); }
    /// Sets `maxMeshWorkGroupTotalCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMeshShaderPropertiesEXT maxMeshWorkGroupTotalCount(int value) { maxMeshWorkGroupTotalCount(this.segment(), 0L, value); return this; }

    /// {@return `maxMeshWorkGroupCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment maxMeshWorkGroupCount(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_maxMeshWorkGroupCount, index), LAYOUT_maxMeshWorkGroupCount); }
    /// {@return `maxMeshWorkGroupCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    public static int maxMeshWorkGroupCount(MemorySegment segment, long index, long index0) { return (int) VH_maxMeshWorkGroupCount.get(segment, 0L, index, index0); }
    /// {@return `maxMeshWorkGroupCount`}
    public MemorySegment maxMeshWorkGroupCount() { return maxMeshWorkGroupCount(this.segment(), 0L); }
    /// {@return `maxMeshWorkGroupCount`}
    /// @param index0 the Index 0 of the array
    public int maxMeshWorkGroupCount(long index0) { return maxMeshWorkGroupCount(this.segment(), 0L, index0); }
    /// Sets `maxMeshWorkGroupCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxMeshWorkGroupCount(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_maxMeshWorkGroupCount, index), LAYOUT_maxMeshWorkGroupCount.byteSize()); }
    /// Sets `maxMeshWorkGroupCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    public static void maxMeshWorkGroupCount(MemorySegment segment, long index, long index0, int value) { VH_maxMeshWorkGroupCount.set(segment, 0L, index, index0, value); }
    /// Sets `maxMeshWorkGroupCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMeshShaderPropertiesEXT maxMeshWorkGroupCount(MemorySegment value) { maxMeshWorkGroupCount(this.segment(), 0L, value); return this; }
    /// Sets `maxMeshWorkGroupCount` with the given value.
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMeshShaderPropertiesEXT maxMeshWorkGroupCount(long index0, int value) { maxMeshWorkGroupCount(this.segment(), 0L, index0, value); return this; }

    /// {@return `maxMeshWorkGroupInvocations` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxMeshWorkGroupInvocations(MemorySegment segment, long index) { return (int) VH_maxMeshWorkGroupInvocations.get(segment, 0L, index); }
    /// {@return `maxMeshWorkGroupInvocations`}
    public int maxMeshWorkGroupInvocations() { return maxMeshWorkGroupInvocations(this.segment(), 0L); }
    /// Sets `maxMeshWorkGroupInvocations` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxMeshWorkGroupInvocations(MemorySegment segment, long index, int value) { VH_maxMeshWorkGroupInvocations.set(segment, 0L, index, value); }
    /// Sets `maxMeshWorkGroupInvocations` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMeshShaderPropertiesEXT maxMeshWorkGroupInvocations(int value) { maxMeshWorkGroupInvocations(this.segment(), 0L, value); return this; }

    /// {@return `maxMeshWorkGroupSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment maxMeshWorkGroupSize(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_maxMeshWorkGroupSize, index), LAYOUT_maxMeshWorkGroupSize); }
    /// {@return `maxMeshWorkGroupSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    public static int maxMeshWorkGroupSize(MemorySegment segment, long index, long index0) { return (int) VH_maxMeshWorkGroupSize.get(segment, 0L, index, index0); }
    /// {@return `maxMeshWorkGroupSize`}
    public MemorySegment maxMeshWorkGroupSize() { return maxMeshWorkGroupSize(this.segment(), 0L); }
    /// {@return `maxMeshWorkGroupSize`}
    /// @param index0 the Index 0 of the array
    public int maxMeshWorkGroupSize(long index0) { return maxMeshWorkGroupSize(this.segment(), 0L, index0); }
    /// Sets `maxMeshWorkGroupSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxMeshWorkGroupSize(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_maxMeshWorkGroupSize, index), LAYOUT_maxMeshWorkGroupSize.byteSize()); }
    /// Sets `maxMeshWorkGroupSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    public static void maxMeshWorkGroupSize(MemorySegment segment, long index, long index0, int value) { VH_maxMeshWorkGroupSize.set(segment, 0L, index, index0, value); }
    /// Sets `maxMeshWorkGroupSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMeshShaderPropertiesEXT maxMeshWorkGroupSize(MemorySegment value) { maxMeshWorkGroupSize(this.segment(), 0L, value); return this; }
    /// Sets `maxMeshWorkGroupSize` with the given value.
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMeshShaderPropertiesEXT maxMeshWorkGroupSize(long index0, int value) { maxMeshWorkGroupSize(this.segment(), 0L, index0, value); return this; }

    /// {@return `maxMeshSharedMemorySize` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxMeshSharedMemorySize(MemorySegment segment, long index) { return (int) VH_maxMeshSharedMemorySize.get(segment, 0L, index); }
    /// {@return `maxMeshSharedMemorySize`}
    public int maxMeshSharedMemorySize() { return maxMeshSharedMemorySize(this.segment(), 0L); }
    /// Sets `maxMeshSharedMemorySize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxMeshSharedMemorySize(MemorySegment segment, long index, int value) { VH_maxMeshSharedMemorySize.set(segment, 0L, index, value); }
    /// Sets `maxMeshSharedMemorySize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMeshShaderPropertiesEXT maxMeshSharedMemorySize(int value) { maxMeshSharedMemorySize(this.segment(), 0L, value); return this; }

    /// {@return `maxMeshPayloadAndSharedMemorySize` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxMeshPayloadAndSharedMemorySize(MemorySegment segment, long index) { return (int) VH_maxMeshPayloadAndSharedMemorySize.get(segment, 0L, index); }
    /// {@return `maxMeshPayloadAndSharedMemorySize`}
    public int maxMeshPayloadAndSharedMemorySize() { return maxMeshPayloadAndSharedMemorySize(this.segment(), 0L); }
    /// Sets `maxMeshPayloadAndSharedMemorySize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxMeshPayloadAndSharedMemorySize(MemorySegment segment, long index, int value) { VH_maxMeshPayloadAndSharedMemorySize.set(segment, 0L, index, value); }
    /// Sets `maxMeshPayloadAndSharedMemorySize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMeshShaderPropertiesEXT maxMeshPayloadAndSharedMemorySize(int value) { maxMeshPayloadAndSharedMemorySize(this.segment(), 0L, value); return this; }

    /// {@return `maxMeshOutputMemorySize` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxMeshOutputMemorySize(MemorySegment segment, long index) { return (int) VH_maxMeshOutputMemorySize.get(segment, 0L, index); }
    /// {@return `maxMeshOutputMemorySize`}
    public int maxMeshOutputMemorySize() { return maxMeshOutputMemorySize(this.segment(), 0L); }
    /// Sets `maxMeshOutputMemorySize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxMeshOutputMemorySize(MemorySegment segment, long index, int value) { VH_maxMeshOutputMemorySize.set(segment, 0L, index, value); }
    /// Sets `maxMeshOutputMemorySize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMeshShaderPropertiesEXT maxMeshOutputMemorySize(int value) { maxMeshOutputMemorySize(this.segment(), 0L, value); return this; }

    /// {@return `maxMeshPayloadAndOutputMemorySize` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxMeshPayloadAndOutputMemorySize(MemorySegment segment, long index) { return (int) VH_maxMeshPayloadAndOutputMemorySize.get(segment, 0L, index); }
    /// {@return `maxMeshPayloadAndOutputMemorySize`}
    public int maxMeshPayloadAndOutputMemorySize() { return maxMeshPayloadAndOutputMemorySize(this.segment(), 0L); }
    /// Sets `maxMeshPayloadAndOutputMemorySize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxMeshPayloadAndOutputMemorySize(MemorySegment segment, long index, int value) { VH_maxMeshPayloadAndOutputMemorySize.set(segment, 0L, index, value); }
    /// Sets `maxMeshPayloadAndOutputMemorySize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMeshShaderPropertiesEXT maxMeshPayloadAndOutputMemorySize(int value) { maxMeshPayloadAndOutputMemorySize(this.segment(), 0L, value); return this; }

    /// {@return `maxMeshOutputComponents` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxMeshOutputComponents(MemorySegment segment, long index) { return (int) VH_maxMeshOutputComponents.get(segment, 0L, index); }
    /// {@return `maxMeshOutputComponents`}
    public int maxMeshOutputComponents() { return maxMeshOutputComponents(this.segment(), 0L); }
    /// Sets `maxMeshOutputComponents` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxMeshOutputComponents(MemorySegment segment, long index, int value) { VH_maxMeshOutputComponents.set(segment, 0L, index, value); }
    /// Sets `maxMeshOutputComponents` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMeshShaderPropertiesEXT maxMeshOutputComponents(int value) { maxMeshOutputComponents(this.segment(), 0L, value); return this; }

    /// {@return `maxMeshOutputVertices` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxMeshOutputVertices(MemorySegment segment, long index) { return (int) VH_maxMeshOutputVertices.get(segment, 0L, index); }
    /// {@return `maxMeshOutputVertices`}
    public int maxMeshOutputVertices() { return maxMeshOutputVertices(this.segment(), 0L); }
    /// Sets `maxMeshOutputVertices` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxMeshOutputVertices(MemorySegment segment, long index, int value) { VH_maxMeshOutputVertices.set(segment, 0L, index, value); }
    /// Sets `maxMeshOutputVertices` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMeshShaderPropertiesEXT maxMeshOutputVertices(int value) { maxMeshOutputVertices(this.segment(), 0L, value); return this; }

    /// {@return `maxMeshOutputPrimitives` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxMeshOutputPrimitives(MemorySegment segment, long index) { return (int) VH_maxMeshOutputPrimitives.get(segment, 0L, index); }
    /// {@return `maxMeshOutputPrimitives`}
    public int maxMeshOutputPrimitives() { return maxMeshOutputPrimitives(this.segment(), 0L); }
    /// Sets `maxMeshOutputPrimitives` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxMeshOutputPrimitives(MemorySegment segment, long index, int value) { VH_maxMeshOutputPrimitives.set(segment, 0L, index, value); }
    /// Sets `maxMeshOutputPrimitives` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMeshShaderPropertiesEXT maxMeshOutputPrimitives(int value) { maxMeshOutputPrimitives(this.segment(), 0L, value); return this; }

    /// {@return `maxMeshOutputLayers` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxMeshOutputLayers(MemorySegment segment, long index) { return (int) VH_maxMeshOutputLayers.get(segment, 0L, index); }
    /// {@return `maxMeshOutputLayers`}
    public int maxMeshOutputLayers() { return maxMeshOutputLayers(this.segment(), 0L); }
    /// Sets `maxMeshOutputLayers` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxMeshOutputLayers(MemorySegment segment, long index, int value) { VH_maxMeshOutputLayers.set(segment, 0L, index, value); }
    /// Sets `maxMeshOutputLayers` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMeshShaderPropertiesEXT maxMeshOutputLayers(int value) { maxMeshOutputLayers(this.segment(), 0L, value); return this; }

    /// {@return `maxMeshMultiviewViewCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxMeshMultiviewViewCount(MemorySegment segment, long index) { return (int) VH_maxMeshMultiviewViewCount.get(segment, 0L, index); }
    /// {@return `maxMeshMultiviewViewCount`}
    public int maxMeshMultiviewViewCount() { return maxMeshMultiviewViewCount(this.segment(), 0L); }
    /// Sets `maxMeshMultiviewViewCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxMeshMultiviewViewCount(MemorySegment segment, long index, int value) { VH_maxMeshMultiviewViewCount.set(segment, 0L, index, value); }
    /// Sets `maxMeshMultiviewViewCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMeshShaderPropertiesEXT maxMeshMultiviewViewCount(int value) { maxMeshMultiviewViewCount(this.segment(), 0L, value); return this; }

    /// {@return `meshOutputPerVertexGranularity` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int meshOutputPerVertexGranularity(MemorySegment segment, long index) { return (int) VH_meshOutputPerVertexGranularity.get(segment, 0L, index); }
    /// {@return `meshOutputPerVertexGranularity`}
    public int meshOutputPerVertexGranularity() { return meshOutputPerVertexGranularity(this.segment(), 0L); }
    /// Sets `meshOutputPerVertexGranularity` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void meshOutputPerVertexGranularity(MemorySegment segment, long index, int value) { VH_meshOutputPerVertexGranularity.set(segment, 0L, index, value); }
    /// Sets `meshOutputPerVertexGranularity` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMeshShaderPropertiesEXT meshOutputPerVertexGranularity(int value) { meshOutputPerVertexGranularity(this.segment(), 0L, value); return this; }

    /// {@return `meshOutputPerPrimitiveGranularity` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int meshOutputPerPrimitiveGranularity(MemorySegment segment, long index) { return (int) VH_meshOutputPerPrimitiveGranularity.get(segment, 0L, index); }
    /// {@return `meshOutputPerPrimitiveGranularity`}
    public int meshOutputPerPrimitiveGranularity() { return meshOutputPerPrimitiveGranularity(this.segment(), 0L); }
    /// Sets `meshOutputPerPrimitiveGranularity` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void meshOutputPerPrimitiveGranularity(MemorySegment segment, long index, int value) { VH_meshOutputPerPrimitiveGranularity.set(segment, 0L, index, value); }
    /// Sets `meshOutputPerPrimitiveGranularity` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMeshShaderPropertiesEXT meshOutputPerPrimitiveGranularity(int value) { meshOutputPerPrimitiveGranularity(this.segment(), 0L, value); return this; }

    /// {@return `maxPreferredTaskWorkGroupInvocations` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxPreferredTaskWorkGroupInvocations(MemorySegment segment, long index) { return (int) VH_maxPreferredTaskWorkGroupInvocations.get(segment, 0L, index); }
    /// {@return `maxPreferredTaskWorkGroupInvocations`}
    public int maxPreferredTaskWorkGroupInvocations() { return maxPreferredTaskWorkGroupInvocations(this.segment(), 0L); }
    /// Sets `maxPreferredTaskWorkGroupInvocations` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxPreferredTaskWorkGroupInvocations(MemorySegment segment, long index, int value) { VH_maxPreferredTaskWorkGroupInvocations.set(segment, 0L, index, value); }
    /// Sets `maxPreferredTaskWorkGroupInvocations` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMeshShaderPropertiesEXT maxPreferredTaskWorkGroupInvocations(int value) { maxPreferredTaskWorkGroupInvocations(this.segment(), 0L, value); return this; }

    /// {@return `maxPreferredMeshWorkGroupInvocations` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxPreferredMeshWorkGroupInvocations(MemorySegment segment, long index) { return (int) VH_maxPreferredMeshWorkGroupInvocations.get(segment, 0L, index); }
    /// {@return `maxPreferredMeshWorkGroupInvocations`}
    public int maxPreferredMeshWorkGroupInvocations() { return maxPreferredMeshWorkGroupInvocations(this.segment(), 0L); }
    /// Sets `maxPreferredMeshWorkGroupInvocations` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxPreferredMeshWorkGroupInvocations(MemorySegment segment, long index, int value) { VH_maxPreferredMeshWorkGroupInvocations.set(segment, 0L, index, value); }
    /// Sets `maxPreferredMeshWorkGroupInvocations` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMeshShaderPropertiesEXT maxPreferredMeshWorkGroupInvocations(int value) { maxPreferredMeshWorkGroupInvocations(this.segment(), 0L, value); return this; }

    /// {@return `prefersLocalInvocationVertexOutput` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int prefersLocalInvocationVertexOutput(MemorySegment segment, long index) { return (int) VH_prefersLocalInvocationVertexOutput.get(segment, 0L, index); }
    /// {@return `prefersLocalInvocationVertexOutput`}
    public int prefersLocalInvocationVertexOutput() { return prefersLocalInvocationVertexOutput(this.segment(), 0L); }
    /// Sets `prefersLocalInvocationVertexOutput` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void prefersLocalInvocationVertexOutput(MemorySegment segment, long index, int value) { VH_prefersLocalInvocationVertexOutput.set(segment, 0L, index, value); }
    /// Sets `prefersLocalInvocationVertexOutput` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMeshShaderPropertiesEXT prefersLocalInvocationVertexOutput(int value) { prefersLocalInvocationVertexOutput(this.segment(), 0L, value); return this; }

    /// {@return `prefersLocalInvocationPrimitiveOutput` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int prefersLocalInvocationPrimitiveOutput(MemorySegment segment, long index) { return (int) VH_prefersLocalInvocationPrimitiveOutput.get(segment, 0L, index); }
    /// {@return `prefersLocalInvocationPrimitiveOutput`}
    public int prefersLocalInvocationPrimitiveOutput() { return prefersLocalInvocationPrimitiveOutput(this.segment(), 0L); }
    /// Sets `prefersLocalInvocationPrimitiveOutput` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void prefersLocalInvocationPrimitiveOutput(MemorySegment segment, long index, int value) { VH_prefersLocalInvocationPrimitiveOutput.set(segment, 0L, index, value); }
    /// Sets `prefersLocalInvocationPrimitiveOutput` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMeshShaderPropertiesEXT prefersLocalInvocationPrimitiveOutput(int value) { prefersLocalInvocationPrimitiveOutput(this.segment(), 0L, value); return this; }

    /// {@return `prefersCompactVertexOutput` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int prefersCompactVertexOutput(MemorySegment segment, long index) { return (int) VH_prefersCompactVertexOutput.get(segment, 0L, index); }
    /// {@return `prefersCompactVertexOutput`}
    public int prefersCompactVertexOutput() { return prefersCompactVertexOutput(this.segment(), 0L); }
    /// Sets `prefersCompactVertexOutput` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void prefersCompactVertexOutput(MemorySegment segment, long index, int value) { VH_prefersCompactVertexOutput.set(segment, 0L, index, value); }
    /// Sets `prefersCompactVertexOutput` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMeshShaderPropertiesEXT prefersCompactVertexOutput(int value) { prefersCompactVertexOutput(this.segment(), 0L, value); return this; }

    /// {@return `prefersCompactPrimitiveOutput` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int prefersCompactPrimitiveOutput(MemorySegment segment, long index) { return (int) VH_prefersCompactPrimitiveOutput.get(segment, 0L, index); }
    /// {@return `prefersCompactPrimitiveOutput`}
    public int prefersCompactPrimitiveOutput() { return prefersCompactPrimitiveOutput(this.segment(), 0L); }
    /// Sets `prefersCompactPrimitiveOutput` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void prefersCompactPrimitiveOutput(MemorySegment segment, long index, int value) { VH_prefersCompactPrimitiveOutput.set(segment, 0L, index, value); }
    /// Sets `prefersCompactPrimitiveOutput` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMeshShaderPropertiesEXT prefersCompactPrimitiveOutput(int value) { prefersCompactPrimitiveOutput(this.segment(), 0L, value); return this; }

    /// A buffer of [VkPhysicalDeviceMeshShaderPropertiesEXT].
    public static final class Buffer extends VkPhysicalDeviceMeshShaderPropertiesEXT {
        private final long elementCount;

        /// Creates `VkPhysicalDeviceMeshShaderPropertiesEXT.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkPhysicalDeviceMeshShaderPropertiesEXT`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkPhysicalDeviceMeshShaderPropertiesEXT`
        public VkPhysicalDeviceMeshShaderPropertiesEXT asSlice(long index) { return new VkPhysicalDeviceMeshShaderPropertiesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkPhysicalDeviceMeshShaderPropertiesEXT`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkPhysicalDeviceMeshShaderPropertiesEXT`
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

        /// {@return `maxTaskWorkGroupTotalCount` at the given index}
        /// @param index the index of the struct buffer
        public int maxTaskWorkGroupTotalCountAt(long index) { return maxTaskWorkGroupTotalCount(this.segment(), index); }
        /// Sets `maxTaskWorkGroupTotalCount` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer maxTaskWorkGroupTotalCountAt(long index, int value) { maxTaskWorkGroupTotalCount(this.segment(), index, value); return this; }

        /// {@return `maxTaskWorkGroupCount` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment maxTaskWorkGroupCountAt(long index) { return maxTaskWorkGroupCount(this.segment(), index); }
        /// {@return `maxTaskWorkGroupCount` at the given index}
        /// @param index the index of the struct buffer
        /// @param index0 the Index 0 of the array
        public int maxTaskWorkGroupCountAt(long index, long index0) { return maxTaskWorkGroupCount(this.segment(), index, index0); }
        /// Sets `maxTaskWorkGroupCount` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer maxTaskWorkGroupCountAt(long index, MemorySegment value) { maxTaskWorkGroupCount(this.segment(), index, value); return this; }
        /// Sets `maxTaskWorkGroupCount` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param index0 the Index 0 of the array
        /// @param value the value
        /// @return `this`
        public Buffer maxTaskWorkGroupCountAt(long index, long index0, int value) { maxTaskWorkGroupCount(this.segment(), index, index0, value); return this; }

        /// {@return `maxTaskWorkGroupInvocations` at the given index}
        /// @param index the index of the struct buffer
        public int maxTaskWorkGroupInvocationsAt(long index) { return maxTaskWorkGroupInvocations(this.segment(), index); }
        /// Sets `maxTaskWorkGroupInvocations` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer maxTaskWorkGroupInvocationsAt(long index, int value) { maxTaskWorkGroupInvocations(this.segment(), index, value); return this; }

        /// {@return `maxTaskWorkGroupSize` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment maxTaskWorkGroupSizeAt(long index) { return maxTaskWorkGroupSize(this.segment(), index); }
        /// {@return `maxTaskWorkGroupSize` at the given index}
        /// @param index the index of the struct buffer
        /// @param index0 the Index 0 of the array
        public int maxTaskWorkGroupSizeAt(long index, long index0) { return maxTaskWorkGroupSize(this.segment(), index, index0); }
        /// Sets `maxTaskWorkGroupSize` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer maxTaskWorkGroupSizeAt(long index, MemorySegment value) { maxTaskWorkGroupSize(this.segment(), index, value); return this; }
        /// Sets `maxTaskWorkGroupSize` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param index0 the Index 0 of the array
        /// @param value the value
        /// @return `this`
        public Buffer maxTaskWorkGroupSizeAt(long index, long index0, int value) { maxTaskWorkGroupSize(this.segment(), index, index0, value); return this; }

        /// {@return `maxTaskPayloadSize` at the given index}
        /// @param index the index of the struct buffer
        public int maxTaskPayloadSizeAt(long index) { return maxTaskPayloadSize(this.segment(), index); }
        /// Sets `maxTaskPayloadSize` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer maxTaskPayloadSizeAt(long index, int value) { maxTaskPayloadSize(this.segment(), index, value); return this; }

        /// {@return `maxTaskSharedMemorySize` at the given index}
        /// @param index the index of the struct buffer
        public int maxTaskSharedMemorySizeAt(long index) { return maxTaskSharedMemorySize(this.segment(), index); }
        /// Sets `maxTaskSharedMemorySize` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer maxTaskSharedMemorySizeAt(long index, int value) { maxTaskSharedMemorySize(this.segment(), index, value); return this; }

        /// {@return `maxTaskPayloadAndSharedMemorySize` at the given index}
        /// @param index the index of the struct buffer
        public int maxTaskPayloadAndSharedMemorySizeAt(long index) { return maxTaskPayloadAndSharedMemorySize(this.segment(), index); }
        /// Sets `maxTaskPayloadAndSharedMemorySize` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer maxTaskPayloadAndSharedMemorySizeAt(long index, int value) { maxTaskPayloadAndSharedMemorySize(this.segment(), index, value); return this; }

        /// {@return `maxMeshWorkGroupTotalCount` at the given index}
        /// @param index the index of the struct buffer
        public int maxMeshWorkGroupTotalCountAt(long index) { return maxMeshWorkGroupTotalCount(this.segment(), index); }
        /// Sets `maxMeshWorkGroupTotalCount` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer maxMeshWorkGroupTotalCountAt(long index, int value) { maxMeshWorkGroupTotalCount(this.segment(), index, value); return this; }

        /// {@return `maxMeshWorkGroupCount` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment maxMeshWorkGroupCountAt(long index) { return maxMeshWorkGroupCount(this.segment(), index); }
        /// {@return `maxMeshWorkGroupCount` at the given index}
        /// @param index the index of the struct buffer
        /// @param index0 the Index 0 of the array
        public int maxMeshWorkGroupCountAt(long index, long index0) { return maxMeshWorkGroupCount(this.segment(), index, index0); }
        /// Sets `maxMeshWorkGroupCount` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer maxMeshWorkGroupCountAt(long index, MemorySegment value) { maxMeshWorkGroupCount(this.segment(), index, value); return this; }
        /// Sets `maxMeshWorkGroupCount` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param index0 the Index 0 of the array
        /// @param value the value
        /// @return `this`
        public Buffer maxMeshWorkGroupCountAt(long index, long index0, int value) { maxMeshWorkGroupCount(this.segment(), index, index0, value); return this; }

        /// {@return `maxMeshWorkGroupInvocations` at the given index}
        /// @param index the index of the struct buffer
        public int maxMeshWorkGroupInvocationsAt(long index) { return maxMeshWorkGroupInvocations(this.segment(), index); }
        /// Sets `maxMeshWorkGroupInvocations` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer maxMeshWorkGroupInvocationsAt(long index, int value) { maxMeshWorkGroupInvocations(this.segment(), index, value); return this; }

        /// {@return `maxMeshWorkGroupSize` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment maxMeshWorkGroupSizeAt(long index) { return maxMeshWorkGroupSize(this.segment(), index); }
        /// {@return `maxMeshWorkGroupSize` at the given index}
        /// @param index the index of the struct buffer
        /// @param index0 the Index 0 of the array
        public int maxMeshWorkGroupSizeAt(long index, long index0) { return maxMeshWorkGroupSize(this.segment(), index, index0); }
        /// Sets `maxMeshWorkGroupSize` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer maxMeshWorkGroupSizeAt(long index, MemorySegment value) { maxMeshWorkGroupSize(this.segment(), index, value); return this; }
        /// Sets `maxMeshWorkGroupSize` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param index0 the Index 0 of the array
        /// @param value the value
        /// @return `this`
        public Buffer maxMeshWorkGroupSizeAt(long index, long index0, int value) { maxMeshWorkGroupSize(this.segment(), index, index0, value); return this; }

        /// {@return `maxMeshSharedMemorySize` at the given index}
        /// @param index the index of the struct buffer
        public int maxMeshSharedMemorySizeAt(long index) { return maxMeshSharedMemorySize(this.segment(), index); }
        /// Sets `maxMeshSharedMemorySize` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer maxMeshSharedMemorySizeAt(long index, int value) { maxMeshSharedMemorySize(this.segment(), index, value); return this; }

        /// {@return `maxMeshPayloadAndSharedMemorySize` at the given index}
        /// @param index the index of the struct buffer
        public int maxMeshPayloadAndSharedMemorySizeAt(long index) { return maxMeshPayloadAndSharedMemorySize(this.segment(), index); }
        /// Sets `maxMeshPayloadAndSharedMemorySize` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer maxMeshPayloadAndSharedMemorySizeAt(long index, int value) { maxMeshPayloadAndSharedMemorySize(this.segment(), index, value); return this; }

        /// {@return `maxMeshOutputMemorySize` at the given index}
        /// @param index the index of the struct buffer
        public int maxMeshOutputMemorySizeAt(long index) { return maxMeshOutputMemorySize(this.segment(), index); }
        /// Sets `maxMeshOutputMemorySize` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer maxMeshOutputMemorySizeAt(long index, int value) { maxMeshOutputMemorySize(this.segment(), index, value); return this; }

        /// {@return `maxMeshPayloadAndOutputMemorySize` at the given index}
        /// @param index the index of the struct buffer
        public int maxMeshPayloadAndOutputMemorySizeAt(long index) { return maxMeshPayloadAndOutputMemorySize(this.segment(), index); }
        /// Sets `maxMeshPayloadAndOutputMemorySize` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer maxMeshPayloadAndOutputMemorySizeAt(long index, int value) { maxMeshPayloadAndOutputMemorySize(this.segment(), index, value); return this; }

        /// {@return `maxMeshOutputComponents` at the given index}
        /// @param index the index of the struct buffer
        public int maxMeshOutputComponentsAt(long index) { return maxMeshOutputComponents(this.segment(), index); }
        /// Sets `maxMeshOutputComponents` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer maxMeshOutputComponentsAt(long index, int value) { maxMeshOutputComponents(this.segment(), index, value); return this; }

        /// {@return `maxMeshOutputVertices` at the given index}
        /// @param index the index of the struct buffer
        public int maxMeshOutputVerticesAt(long index) { return maxMeshOutputVertices(this.segment(), index); }
        /// Sets `maxMeshOutputVertices` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer maxMeshOutputVerticesAt(long index, int value) { maxMeshOutputVertices(this.segment(), index, value); return this; }

        /// {@return `maxMeshOutputPrimitives` at the given index}
        /// @param index the index of the struct buffer
        public int maxMeshOutputPrimitivesAt(long index) { return maxMeshOutputPrimitives(this.segment(), index); }
        /// Sets `maxMeshOutputPrimitives` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer maxMeshOutputPrimitivesAt(long index, int value) { maxMeshOutputPrimitives(this.segment(), index, value); return this; }

        /// {@return `maxMeshOutputLayers` at the given index}
        /// @param index the index of the struct buffer
        public int maxMeshOutputLayersAt(long index) { return maxMeshOutputLayers(this.segment(), index); }
        /// Sets `maxMeshOutputLayers` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer maxMeshOutputLayersAt(long index, int value) { maxMeshOutputLayers(this.segment(), index, value); return this; }

        /// {@return `maxMeshMultiviewViewCount` at the given index}
        /// @param index the index of the struct buffer
        public int maxMeshMultiviewViewCountAt(long index) { return maxMeshMultiviewViewCount(this.segment(), index); }
        /// Sets `maxMeshMultiviewViewCount` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer maxMeshMultiviewViewCountAt(long index, int value) { maxMeshMultiviewViewCount(this.segment(), index, value); return this; }

        /// {@return `meshOutputPerVertexGranularity` at the given index}
        /// @param index the index of the struct buffer
        public int meshOutputPerVertexGranularityAt(long index) { return meshOutputPerVertexGranularity(this.segment(), index); }
        /// Sets `meshOutputPerVertexGranularity` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer meshOutputPerVertexGranularityAt(long index, int value) { meshOutputPerVertexGranularity(this.segment(), index, value); return this; }

        /// {@return `meshOutputPerPrimitiveGranularity` at the given index}
        /// @param index the index of the struct buffer
        public int meshOutputPerPrimitiveGranularityAt(long index) { return meshOutputPerPrimitiveGranularity(this.segment(), index); }
        /// Sets `meshOutputPerPrimitiveGranularity` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer meshOutputPerPrimitiveGranularityAt(long index, int value) { meshOutputPerPrimitiveGranularity(this.segment(), index, value); return this; }

        /// {@return `maxPreferredTaskWorkGroupInvocations` at the given index}
        /// @param index the index of the struct buffer
        public int maxPreferredTaskWorkGroupInvocationsAt(long index) { return maxPreferredTaskWorkGroupInvocations(this.segment(), index); }
        /// Sets `maxPreferredTaskWorkGroupInvocations` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer maxPreferredTaskWorkGroupInvocationsAt(long index, int value) { maxPreferredTaskWorkGroupInvocations(this.segment(), index, value); return this; }

        /// {@return `maxPreferredMeshWorkGroupInvocations` at the given index}
        /// @param index the index of the struct buffer
        public int maxPreferredMeshWorkGroupInvocationsAt(long index) { return maxPreferredMeshWorkGroupInvocations(this.segment(), index); }
        /// Sets `maxPreferredMeshWorkGroupInvocations` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer maxPreferredMeshWorkGroupInvocationsAt(long index, int value) { maxPreferredMeshWorkGroupInvocations(this.segment(), index, value); return this; }

        /// {@return `prefersLocalInvocationVertexOutput` at the given index}
        /// @param index the index of the struct buffer
        public int prefersLocalInvocationVertexOutputAt(long index) { return prefersLocalInvocationVertexOutput(this.segment(), index); }
        /// Sets `prefersLocalInvocationVertexOutput` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer prefersLocalInvocationVertexOutputAt(long index, int value) { prefersLocalInvocationVertexOutput(this.segment(), index, value); return this; }

        /// {@return `prefersLocalInvocationPrimitiveOutput` at the given index}
        /// @param index the index of the struct buffer
        public int prefersLocalInvocationPrimitiveOutputAt(long index) { return prefersLocalInvocationPrimitiveOutput(this.segment(), index); }
        /// Sets `prefersLocalInvocationPrimitiveOutput` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer prefersLocalInvocationPrimitiveOutputAt(long index, int value) { prefersLocalInvocationPrimitiveOutput(this.segment(), index, value); return this; }

        /// {@return `prefersCompactVertexOutput` at the given index}
        /// @param index the index of the struct buffer
        public int prefersCompactVertexOutputAt(long index) { return prefersCompactVertexOutput(this.segment(), index); }
        /// Sets `prefersCompactVertexOutput` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer prefersCompactVertexOutputAt(long index, int value) { prefersCompactVertexOutput(this.segment(), index, value); return this; }

        /// {@return `prefersCompactPrimitiveOutput` at the given index}
        /// @param index the index of the struct buffer
        public int prefersCompactPrimitiveOutputAt(long index) { return prefersCompactPrimitiveOutput(this.segment(), index); }
        /// Sets `prefersCompactPrimitiveOutput` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer prefersCompactPrimitiveOutputAt(long index, int value) { prefersCompactPrimitiveOutput(this.segment(), index, value); return this; }

    }
}
