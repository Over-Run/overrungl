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
package overrungl.vulkan.nv.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkPhysicalDeviceMeshShaderPropertiesNV {
///     (int) VkStructureType sType;
///     void* pNext;
///     uint32_t maxDrawMeshTasksCount;
///     uint32_t maxTaskWorkGroupInvocations;
///     uint32_t maxTaskWorkGroupSize[3];
///     uint32_t maxTaskTotalMemorySize;
///     uint32_t maxTaskOutputCount;
///     uint32_t maxMeshWorkGroupInvocations;
///     uint32_t maxMeshWorkGroupSize[3];
///     uint32_t maxMeshTotalMemorySize;
///     uint32_t maxMeshOutputVertices;
///     uint32_t maxMeshOutputPrimitives;
///     uint32_t maxMeshMultiviewViewCount;
///     uint32_t meshOutputPerVertexGranularity;
///     uint32_t meshOutputPerPrimitiveGranularity;
/// };
/// ```
public final class VkPhysicalDeviceMeshShaderPropertiesNV extends GroupType {
    /// The struct layout of `VkPhysicalDeviceMeshShaderPropertiesNV`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
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
    /// The byte offset of `maxDrawMeshTasksCount`.
    public static final long OFFSET_maxDrawMeshTasksCount = LAYOUT.byteOffset(PathElement.groupElement("maxDrawMeshTasksCount"));
    /// The memory layout of `maxDrawMeshTasksCount`.
    public static final MemoryLayout LAYOUT_maxDrawMeshTasksCount = LAYOUT.select(PathElement.groupElement("maxDrawMeshTasksCount"));
    /// The [VarHandle] of `maxDrawMeshTasksCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxDrawMeshTasksCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxDrawMeshTasksCount"));
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
    /// The byte offset of `maxTaskTotalMemorySize`.
    public static final long OFFSET_maxTaskTotalMemorySize = LAYOUT.byteOffset(PathElement.groupElement("maxTaskTotalMemorySize"));
    /// The memory layout of `maxTaskTotalMemorySize`.
    public static final MemoryLayout LAYOUT_maxTaskTotalMemorySize = LAYOUT.select(PathElement.groupElement("maxTaskTotalMemorySize"));
    /// The [VarHandle] of `maxTaskTotalMemorySize` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxTaskTotalMemorySize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxTaskTotalMemorySize"));
    /// The byte offset of `maxTaskOutputCount`.
    public static final long OFFSET_maxTaskOutputCount = LAYOUT.byteOffset(PathElement.groupElement("maxTaskOutputCount"));
    /// The memory layout of `maxTaskOutputCount`.
    public static final MemoryLayout LAYOUT_maxTaskOutputCount = LAYOUT.select(PathElement.groupElement("maxTaskOutputCount"));
    /// The [VarHandle] of `maxTaskOutputCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxTaskOutputCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxTaskOutputCount"));
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
    /// The byte offset of `maxMeshTotalMemorySize`.
    public static final long OFFSET_maxMeshTotalMemorySize = LAYOUT.byteOffset(PathElement.groupElement("maxMeshTotalMemorySize"));
    /// The memory layout of `maxMeshTotalMemorySize`.
    public static final MemoryLayout LAYOUT_maxMeshTotalMemorySize = LAYOUT.select(PathElement.groupElement("maxMeshTotalMemorySize"));
    /// The [VarHandle] of `maxMeshTotalMemorySize` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxMeshTotalMemorySize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxMeshTotalMemorySize"));
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

    /// Creates `VkPhysicalDeviceMeshShaderPropertiesNV` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPhysicalDeviceMeshShaderPropertiesNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPhysicalDeviceMeshShaderPropertiesNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceMeshShaderPropertiesNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceMeshShaderPropertiesNV(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceMeshShaderPropertiesNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceMeshShaderPropertiesNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceMeshShaderPropertiesNV(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPhysicalDeviceMeshShaderPropertiesNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceMeshShaderPropertiesNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceMeshShaderPropertiesNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPhysicalDeviceMeshShaderPropertiesNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceMeshShaderPropertiesNV`
    public static VkPhysicalDeviceMeshShaderPropertiesNV alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceMeshShaderPropertiesNV(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPhysicalDeviceMeshShaderPropertiesNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceMeshShaderPropertiesNV`
    public static VkPhysicalDeviceMeshShaderPropertiesNV alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceMeshShaderPropertiesNV(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceMeshShaderPropertiesNV copyFrom(VkPhysicalDeviceMeshShaderPropertiesNV src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPhysicalDeviceMeshShaderPropertiesNV reinterpret(long count) { return new VkPhysicalDeviceMeshShaderPropertiesNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkPhysicalDeviceMeshShaderPropertiesNV sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceMeshShaderPropertiesNV pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `maxDrawMeshTasksCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxDrawMeshTasksCount(MemorySegment segment, long index) { return (int) VH_maxDrawMeshTasksCount.get(segment, 0L, index); }
    /// {@return `maxDrawMeshTasksCount`}
    public int maxDrawMeshTasksCount() { return maxDrawMeshTasksCount(this.segment(), 0L); }
    /// Sets `maxDrawMeshTasksCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxDrawMeshTasksCount(MemorySegment segment, long index, int value) { VH_maxDrawMeshTasksCount.set(segment, 0L, index, value); }
    /// Sets `maxDrawMeshTasksCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMeshShaderPropertiesNV maxDrawMeshTasksCount(int value) { maxDrawMeshTasksCount(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceMeshShaderPropertiesNV maxTaskWorkGroupInvocations(int value) { maxTaskWorkGroupInvocations(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceMeshShaderPropertiesNV maxTaskWorkGroupSize(MemorySegment value) { maxTaskWorkGroupSize(this.segment(), 0L, value); return this; }
    /// Sets `maxTaskWorkGroupSize` with the given value.
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMeshShaderPropertiesNV maxTaskWorkGroupSize(long index0, int value) { maxTaskWorkGroupSize(this.segment(), 0L, index0, value); return this; }

    /// {@return `maxTaskTotalMemorySize` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxTaskTotalMemorySize(MemorySegment segment, long index) { return (int) VH_maxTaskTotalMemorySize.get(segment, 0L, index); }
    /// {@return `maxTaskTotalMemorySize`}
    public int maxTaskTotalMemorySize() { return maxTaskTotalMemorySize(this.segment(), 0L); }
    /// Sets `maxTaskTotalMemorySize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxTaskTotalMemorySize(MemorySegment segment, long index, int value) { VH_maxTaskTotalMemorySize.set(segment, 0L, index, value); }
    /// Sets `maxTaskTotalMemorySize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMeshShaderPropertiesNV maxTaskTotalMemorySize(int value) { maxTaskTotalMemorySize(this.segment(), 0L, value); return this; }

    /// {@return `maxTaskOutputCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxTaskOutputCount(MemorySegment segment, long index) { return (int) VH_maxTaskOutputCount.get(segment, 0L, index); }
    /// {@return `maxTaskOutputCount`}
    public int maxTaskOutputCount() { return maxTaskOutputCount(this.segment(), 0L); }
    /// Sets `maxTaskOutputCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxTaskOutputCount(MemorySegment segment, long index, int value) { VH_maxTaskOutputCount.set(segment, 0L, index, value); }
    /// Sets `maxTaskOutputCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMeshShaderPropertiesNV maxTaskOutputCount(int value) { maxTaskOutputCount(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceMeshShaderPropertiesNV maxMeshWorkGroupInvocations(int value) { maxMeshWorkGroupInvocations(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceMeshShaderPropertiesNV maxMeshWorkGroupSize(MemorySegment value) { maxMeshWorkGroupSize(this.segment(), 0L, value); return this; }
    /// Sets `maxMeshWorkGroupSize` with the given value.
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMeshShaderPropertiesNV maxMeshWorkGroupSize(long index0, int value) { maxMeshWorkGroupSize(this.segment(), 0L, index0, value); return this; }

    /// {@return `maxMeshTotalMemorySize` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxMeshTotalMemorySize(MemorySegment segment, long index) { return (int) VH_maxMeshTotalMemorySize.get(segment, 0L, index); }
    /// {@return `maxMeshTotalMemorySize`}
    public int maxMeshTotalMemorySize() { return maxMeshTotalMemorySize(this.segment(), 0L); }
    /// Sets `maxMeshTotalMemorySize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxMeshTotalMemorySize(MemorySegment segment, long index, int value) { VH_maxMeshTotalMemorySize.set(segment, 0L, index, value); }
    /// Sets `maxMeshTotalMemorySize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMeshShaderPropertiesNV maxMeshTotalMemorySize(int value) { maxMeshTotalMemorySize(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceMeshShaderPropertiesNV maxMeshOutputVertices(int value) { maxMeshOutputVertices(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceMeshShaderPropertiesNV maxMeshOutputPrimitives(int value) { maxMeshOutputPrimitives(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceMeshShaderPropertiesNV maxMeshMultiviewViewCount(int value) { maxMeshMultiviewViewCount(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceMeshShaderPropertiesNV meshOutputPerVertexGranularity(int value) { meshOutputPerVertexGranularity(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceMeshShaderPropertiesNV meshOutputPerPrimitiveGranularity(int value) { meshOutputPerPrimitiveGranularity(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkPhysicalDeviceMeshShaderPropertiesNV`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDeviceMeshShaderPropertiesNV`
    public VkPhysicalDeviceMeshShaderPropertiesNV asSlice(long index) { return new VkPhysicalDeviceMeshShaderPropertiesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPhysicalDeviceMeshShaderPropertiesNV`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDeviceMeshShaderPropertiesNV`
    public VkPhysicalDeviceMeshShaderPropertiesNV asSlice(long index, long count) { return new VkPhysicalDeviceMeshShaderPropertiesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPhysicalDeviceMeshShaderPropertiesNV` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPhysicalDeviceMeshShaderPropertiesNV at(long index, Consumer<VkPhysicalDeviceMeshShaderPropertiesNV> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMeshShaderPropertiesNV sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMeshShaderPropertiesNV pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `maxDrawMeshTasksCount` at the given index}
    /// @param index the index of the struct buffer
    public int maxDrawMeshTasksCountAt(long index) { return maxDrawMeshTasksCount(this.segment(), index); }
    /// Sets `maxDrawMeshTasksCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMeshShaderPropertiesNV maxDrawMeshTasksCountAt(long index, int value) { maxDrawMeshTasksCount(this.segment(), index, value); return this; }

    /// {@return `maxTaskWorkGroupInvocations` at the given index}
    /// @param index the index of the struct buffer
    public int maxTaskWorkGroupInvocationsAt(long index) { return maxTaskWorkGroupInvocations(this.segment(), index); }
    /// Sets `maxTaskWorkGroupInvocations` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMeshShaderPropertiesNV maxTaskWorkGroupInvocationsAt(long index, int value) { maxTaskWorkGroupInvocations(this.segment(), index, value); return this; }

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
    public VkPhysicalDeviceMeshShaderPropertiesNV maxTaskWorkGroupSizeAt(long index, MemorySegment value) { maxTaskWorkGroupSize(this.segment(), index, value); return this; }
    /// Sets `maxTaskWorkGroupSize` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMeshShaderPropertiesNV maxTaskWorkGroupSizeAt(long index, long index0, int value) { maxTaskWorkGroupSize(this.segment(), index, index0, value); return this; }

    /// {@return `maxTaskTotalMemorySize` at the given index}
    /// @param index the index of the struct buffer
    public int maxTaskTotalMemorySizeAt(long index) { return maxTaskTotalMemorySize(this.segment(), index); }
    /// Sets `maxTaskTotalMemorySize` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMeshShaderPropertiesNV maxTaskTotalMemorySizeAt(long index, int value) { maxTaskTotalMemorySize(this.segment(), index, value); return this; }

    /// {@return `maxTaskOutputCount` at the given index}
    /// @param index the index of the struct buffer
    public int maxTaskOutputCountAt(long index) { return maxTaskOutputCount(this.segment(), index); }
    /// Sets `maxTaskOutputCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMeshShaderPropertiesNV maxTaskOutputCountAt(long index, int value) { maxTaskOutputCount(this.segment(), index, value); return this; }

    /// {@return `maxMeshWorkGroupInvocations` at the given index}
    /// @param index the index of the struct buffer
    public int maxMeshWorkGroupInvocationsAt(long index) { return maxMeshWorkGroupInvocations(this.segment(), index); }
    /// Sets `maxMeshWorkGroupInvocations` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMeshShaderPropertiesNV maxMeshWorkGroupInvocationsAt(long index, int value) { maxMeshWorkGroupInvocations(this.segment(), index, value); return this; }

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
    public VkPhysicalDeviceMeshShaderPropertiesNV maxMeshWorkGroupSizeAt(long index, MemorySegment value) { maxMeshWorkGroupSize(this.segment(), index, value); return this; }
    /// Sets `maxMeshWorkGroupSize` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMeshShaderPropertiesNV maxMeshWorkGroupSizeAt(long index, long index0, int value) { maxMeshWorkGroupSize(this.segment(), index, index0, value); return this; }

    /// {@return `maxMeshTotalMemorySize` at the given index}
    /// @param index the index of the struct buffer
    public int maxMeshTotalMemorySizeAt(long index) { return maxMeshTotalMemorySize(this.segment(), index); }
    /// Sets `maxMeshTotalMemorySize` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMeshShaderPropertiesNV maxMeshTotalMemorySizeAt(long index, int value) { maxMeshTotalMemorySize(this.segment(), index, value); return this; }

    /// {@return `maxMeshOutputVertices` at the given index}
    /// @param index the index of the struct buffer
    public int maxMeshOutputVerticesAt(long index) { return maxMeshOutputVertices(this.segment(), index); }
    /// Sets `maxMeshOutputVertices` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMeshShaderPropertiesNV maxMeshOutputVerticesAt(long index, int value) { maxMeshOutputVertices(this.segment(), index, value); return this; }

    /// {@return `maxMeshOutputPrimitives` at the given index}
    /// @param index the index of the struct buffer
    public int maxMeshOutputPrimitivesAt(long index) { return maxMeshOutputPrimitives(this.segment(), index); }
    /// Sets `maxMeshOutputPrimitives` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMeshShaderPropertiesNV maxMeshOutputPrimitivesAt(long index, int value) { maxMeshOutputPrimitives(this.segment(), index, value); return this; }

    /// {@return `maxMeshMultiviewViewCount` at the given index}
    /// @param index the index of the struct buffer
    public int maxMeshMultiviewViewCountAt(long index) { return maxMeshMultiviewViewCount(this.segment(), index); }
    /// Sets `maxMeshMultiviewViewCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMeshShaderPropertiesNV maxMeshMultiviewViewCountAt(long index, int value) { maxMeshMultiviewViewCount(this.segment(), index, value); return this; }

    /// {@return `meshOutputPerVertexGranularity` at the given index}
    /// @param index the index of the struct buffer
    public int meshOutputPerVertexGranularityAt(long index) { return meshOutputPerVertexGranularity(this.segment(), index); }
    /// Sets `meshOutputPerVertexGranularity` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMeshShaderPropertiesNV meshOutputPerVertexGranularityAt(long index, int value) { meshOutputPerVertexGranularity(this.segment(), index, value); return this; }

    /// {@return `meshOutputPerPrimitiveGranularity` at the given index}
    /// @param index the index of the struct buffer
    public int meshOutputPerPrimitiveGranularityAt(long index) { return meshOutputPerPrimitiveGranularity(this.segment(), index); }
    /// Sets `meshOutputPerPrimitiveGranularity` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMeshShaderPropertiesNV meshOutputPerPrimitiveGranularityAt(long index, int value) { meshOutputPerPrimitiveGranularity(this.segment(), index, value); return this; }

}
