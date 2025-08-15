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
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceClusterAccelerationStructurePropertiesNV`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceClusterAccelerationStructurePropertiesNV {
///     (int) VkStructureType sType;
///     void* pNext;
///     uint32_t maxVerticesPerCluster;
///     uint32_t maxTrianglesPerCluster;
///     uint32_t clusterScratchByteAlignment;
///     uint32_t clusterByteAlignment;
///     uint32_t clusterTemplateByteAlignment;
///     uint32_t clusterBottomLevelByteAlignment;
///     uint32_t clusterTemplateBoundsByteAlignment;
///     uint32_t maxClusterGeometryIndex;
/// };
/// ```
public final class VkPhysicalDeviceClusterAccelerationStructurePropertiesNV extends GroupType {
    /// The struct layout of `VkPhysicalDeviceClusterAccelerationStructurePropertiesNV`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("maxVerticesPerCluster"),
        ValueLayout.JAVA_INT.withName("maxTrianglesPerCluster"),
        ValueLayout.JAVA_INT.withName("clusterScratchByteAlignment"),
        ValueLayout.JAVA_INT.withName("clusterByteAlignment"),
        ValueLayout.JAVA_INT.withName("clusterTemplateByteAlignment"),
        ValueLayout.JAVA_INT.withName("clusterBottomLevelByteAlignment"),
        ValueLayout.JAVA_INT.withName("clusterTemplateBoundsByteAlignment"),
        ValueLayout.JAVA_INT.withName("maxClusterGeometryIndex")
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
    /// The byte offset of `maxVerticesPerCluster`.
    public static final long OFFSET_maxVerticesPerCluster = LAYOUT.byteOffset(PathElement.groupElement("maxVerticesPerCluster"));
    /// The memory layout of `maxVerticesPerCluster`.
    public static final MemoryLayout LAYOUT_maxVerticesPerCluster = LAYOUT.select(PathElement.groupElement("maxVerticesPerCluster"));
    /// The [VarHandle] of `maxVerticesPerCluster` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxVerticesPerCluster = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxVerticesPerCluster"));
    /// The byte offset of `maxTrianglesPerCluster`.
    public static final long OFFSET_maxTrianglesPerCluster = LAYOUT.byteOffset(PathElement.groupElement("maxTrianglesPerCluster"));
    /// The memory layout of `maxTrianglesPerCluster`.
    public static final MemoryLayout LAYOUT_maxTrianglesPerCluster = LAYOUT.select(PathElement.groupElement("maxTrianglesPerCluster"));
    /// The [VarHandle] of `maxTrianglesPerCluster` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxTrianglesPerCluster = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxTrianglesPerCluster"));
    /// The byte offset of `clusterScratchByteAlignment`.
    public static final long OFFSET_clusterScratchByteAlignment = LAYOUT.byteOffset(PathElement.groupElement("clusterScratchByteAlignment"));
    /// The memory layout of `clusterScratchByteAlignment`.
    public static final MemoryLayout LAYOUT_clusterScratchByteAlignment = LAYOUT.select(PathElement.groupElement("clusterScratchByteAlignment"));
    /// The [VarHandle] of `clusterScratchByteAlignment` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_clusterScratchByteAlignment = LAYOUT.arrayElementVarHandle(PathElement.groupElement("clusterScratchByteAlignment"));
    /// The byte offset of `clusterByteAlignment`.
    public static final long OFFSET_clusterByteAlignment = LAYOUT.byteOffset(PathElement.groupElement("clusterByteAlignment"));
    /// The memory layout of `clusterByteAlignment`.
    public static final MemoryLayout LAYOUT_clusterByteAlignment = LAYOUT.select(PathElement.groupElement("clusterByteAlignment"));
    /// The [VarHandle] of `clusterByteAlignment` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_clusterByteAlignment = LAYOUT.arrayElementVarHandle(PathElement.groupElement("clusterByteAlignment"));
    /// The byte offset of `clusterTemplateByteAlignment`.
    public static final long OFFSET_clusterTemplateByteAlignment = LAYOUT.byteOffset(PathElement.groupElement("clusterTemplateByteAlignment"));
    /// The memory layout of `clusterTemplateByteAlignment`.
    public static final MemoryLayout LAYOUT_clusterTemplateByteAlignment = LAYOUT.select(PathElement.groupElement("clusterTemplateByteAlignment"));
    /// The [VarHandle] of `clusterTemplateByteAlignment` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_clusterTemplateByteAlignment = LAYOUT.arrayElementVarHandle(PathElement.groupElement("clusterTemplateByteAlignment"));
    /// The byte offset of `clusterBottomLevelByteAlignment`.
    public static final long OFFSET_clusterBottomLevelByteAlignment = LAYOUT.byteOffset(PathElement.groupElement("clusterBottomLevelByteAlignment"));
    /// The memory layout of `clusterBottomLevelByteAlignment`.
    public static final MemoryLayout LAYOUT_clusterBottomLevelByteAlignment = LAYOUT.select(PathElement.groupElement("clusterBottomLevelByteAlignment"));
    /// The [VarHandle] of `clusterBottomLevelByteAlignment` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_clusterBottomLevelByteAlignment = LAYOUT.arrayElementVarHandle(PathElement.groupElement("clusterBottomLevelByteAlignment"));
    /// The byte offset of `clusterTemplateBoundsByteAlignment`.
    public static final long OFFSET_clusterTemplateBoundsByteAlignment = LAYOUT.byteOffset(PathElement.groupElement("clusterTemplateBoundsByteAlignment"));
    /// The memory layout of `clusterTemplateBoundsByteAlignment`.
    public static final MemoryLayout LAYOUT_clusterTemplateBoundsByteAlignment = LAYOUT.select(PathElement.groupElement("clusterTemplateBoundsByteAlignment"));
    /// The [VarHandle] of `clusterTemplateBoundsByteAlignment` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_clusterTemplateBoundsByteAlignment = LAYOUT.arrayElementVarHandle(PathElement.groupElement("clusterTemplateBoundsByteAlignment"));
    /// The byte offset of `maxClusterGeometryIndex`.
    public static final long OFFSET_maxClusterGeometryIndex = LAYOUT.byteOffset(PathElement.groupElement("maxClusterGeometryIndex"));
    /// The memory layout of `maxClusterGeometryIndex`.
    public static final MemoryLayout LAYOUT_maxClusterGeometryIndex = LAYOUT.select(PathElement.groupElement("maxClusterGeometryIndex"));
    /// The [VarHandle] of `maxClusterGeometryIndex` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxClusterGeometryIndex = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxClusterGeometryIndex"));

    /// Creates `VkPhysicalDeviceClusterAccelerationStructurePropertiesNV` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPhysicalDeviceClusterAccelerationStructurePropertiesNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPhysicalDeviceClusterAccelerationStructurePropertiesNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceClusterAccelerationStructurePropertiesNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceClusterAccelerationStructurePropertiesNV(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceClusterAccelerationStructurePropertiesNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceClusterAccelerationStructurePropertiesNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceClusterAccelerationStructurePropertiesNV(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPhysicalDeviceClusterAccelerationStructurePropertiesNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceClusterAccelerationStructurePropertiesNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceClusterAccelerationStructurePropertiesNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPhysicalDeviceClusterAccelerationStructurePropertiesNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceClusterAccelerationStructurePropertiesNV`
    public static VkPhysicalDeviceClusterAccelerationStructurePropertiesNV alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceClusterAccelerationStructurePropertiesNV(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPhysicalDeviceClusterAccelerationStructurePropertiesNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceClusterAccelerationStructurePropertiesNV`
    public static VkPhysicalDeviceClusterAccelerationStructurePropertiesNV alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceClusterAccelerationStructurePropertiesNV(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceClusterAccelerationStructurePropertiesNV copyFrom(VkPhysicalDeviceClusterAccelerationStructurePropertiesNV src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPhysicalDeviceClusterAccelerationStructurePropertiesNV reinterpret(long count) { return new VkPhysicalDeviceClusterAccelerationStructurePropertiesNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkPhysicalDeviceClusterAccelerationStructurePropertiesNV sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceClusterAccelerationStructurePropertiesNV pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `maxVerticesPerCluster` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxVerticesPerCluster(MemorySegment segment, long index) { return (int) VH_maxVerticesPerCluster.get(segment, 0L, index); }
    /// {@return `maxVerticesPerCluster`}
    public int maxVerticesPerCluster() { return maxVerticesPerCluster(this.segment(), 0L); }
    /// Sets `maxVerticesPerCluster` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxVerticesPerCluster(MemorySegment segment, long index, int value) { VH_maxVerticesPerCluster.set(segment, 0L, index, value); }
    /// Sets `maxVerticesPerCluster` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceClusterAccelerationStructurePropertiesNV maxVerticesPerCluster(int value) { maxVerticesPerCluster(this.segment(), 0L, value); return this; }

    /// {@return `maxTrianglesPerCluster` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxTrianglesPerCluster(MemorySegment segment, long index) { return (int) VH_maxTrianglesPerCluster.get(segment, 0L, index); }
    /// {@return `maxTrianglesPerCluster`}
    public int maxTrianglesPerCluster() { return maxTrianglesPerCluster(this.segment(), 0L); }
    /// Sets `maxTrianglesPerCluster` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxTrianglesPerCluster(MemorySegment segment, long index, int value) { VH_maxTrianglesPerCluster.set(segment, 0L, index, value); }
    /// Sets `maxTrianglesPerCluster` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceClusterAccelerationStructurePropertiesNV maxTrianglesPerCluster(int value) { maxTrianglesPerCluster(this.segment(), 0L, value); return this; }

    /// {@return `clusterScratchByteAlignment` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int clusterScratchByteAlignment(MemorySegment segment, long index) { return (int) VH_clusterScratchByteAlignment.get(segment, 0L, index); }
    /// {@return `clusterScratchByteAlignment`}
    public int clusterScratchByteAlignment() { return clusterScratchByteAlignment(this.segment(), 0L); }
    /// Sets `clusterScratchByteAlignment` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void clusterScratchByteAlignment(MemorySegment segment, long index, int value) { VH_clusterScratchByteAlignment.set(segment, 0L, index, value); }
    /// Sets `clusterScratchByteAlignment` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceClusterAccelerationStructurePropertiesNV clusterScratchByteAlignment(int value) { clusterScratchByteAlignment(this.segment(), 0L, value); return this; }

    /// {@return `clusterByteAlignment` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int clusterByteAlignment(MemorySegment segment, long index) { return (int) VH_clusterByteAlignment.get(segment, 0L, index); }
    /// {@return `clusterByteAlignment`}
    public int clusterByteAlignment() { return clusterByteAlignment(this.segment(), 0L); }
    /// Sets `clusterByteAlignment` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void clusterByteAlignment(MemorySegment segment, long index, int value) { VH_clusterByteAlignment.set(segment, 0L, index, value); }
    /// Sets `clusterByteAlignment` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceClusterAccelerationStructurePropertiesNV clusterByteAlignment(int value) { clusterByteAlignment(this.segment(), 0L, value); return this; }

    /// {@return `clusterTemplateByteAlignment` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int clusterTemplateByteAlignment(MemorySegment segment, long index) { return (int) VH_clusterTemplateByteAlignment.get(segment, 0L, index); }
    /// {@return `clusterTemplateByteAlignment`}
    public int clusterTemplateByteAlignment() { return clusterTemplateByteAlignment(this.segment(), 0L); }
    /// Sets `clusterTemplateByteAlignment` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void clusterTemplateByteAlignment(MemorySegment segment, long index, int value) { VH_clusterTemplateByteAlignment.set(segment, 0L, index, value); }
    /// Sets `clusterTemplateByteAlignment` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceClusterAccelerationStructurePropertiesNV clusterTemplateByteAlignment(int value) { clusterTemplateByteAlignment(this.segment(), 0L, value); return this; }

    /// {@return `clusterBottomLevelByteAlignment` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int clusterBottomLevelByteAlignment(MemorySegment segment, long index) { return (int) VH_clusterBottomLevelByteAlignment.get(segment, 0L, index); }
    /// {@return `clusterBottomLevelByteAlignment`}
    public int clusterBottomLevelByteAlignment() { return clusterBottomLevelByteAlignment(this.segment(), 0L); }
    /// Sets `clusterBottomLevelByteAlignment` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void clusterBottomLevelByteAlignment(MemorySegment segment, long index, int value) { VH_clusterBottomLevelByteAlignment.set(segment, 0L, index, value); }
    /// Sets `clusterBottomLevelByteAlignment` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceClusterAccelerationStructurePropertiesNV clusterBottomLevelByteAlignment(int value) { clusterBottomLevelByteAlignment(this.segment(), 0L, value); return this; }

    /// {@return `clusterTemplateBoundsByteAlignment` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int clusterTemplateBoundsByteAlignment(MemorySegment segment, long index) { return (int) VH_clusterTemplateBoundsByteAlignment.get(segment, 0L, index); }
    /// {@return `clusterTemplateBoundsByteAlignment`}
    public int clusterTemplateBoundsByteAlignment() { return clusterTemplateBoundsByteAlignment(this.segment(), 0L); }
    /// Sets `clusterTemplateBoundsByteAlignment` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void clusterTemplateBoundsByteAlignment(MemorySegment segment, long index, int value) { VH_clusterTemplateBoundsByteAlignment.set(segment, 0L, index, value); }
    /// Sets `clusterTemplateBoundsByteAlignment` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceClusterAccelerationStructurePropertiesNV clusterTemplateBoundsByteAlignment(int value) { clusterTemplateBoundsByteAlignment(this.segment(), 0L, value); return this; }

    /// {@return `maxClusterGeometryIndex` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxClusterGeometryIndex(MemorySegment segment, long index) { return (int) VH_maxClusterGeometryIndex.get(segment, 0L, index); }
    /// {@return `maxClusterGeometryIndex`}
    public int maxClusterGeometryIndex() { return maxClusterGeometryIndex(this.segment(), 0L); }
    /// Sets `maxClusterGeometryIndex` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxClusterGeometryIndex(MemorySegment segment, long index, int value) { VH_maxClusterGeometryIndex.set(segment, 0L, index, value); }
    /// Sets `maxClusterGeometryIndex` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceClusterAccelerationStructurePropertiesNV maxClusterGeometryIndex(int value) { maxClusterGeometryIndex(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkPhysicalDeviceClusterAccelerationStructurePropertiesNV`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDeviceClusterAccelerationStructurePropertiesNV`
    public VkPhysicalDeviceClusterAccelerationStructurePropertiesNV asSlice(long index) { return new VkPhysicalDeviceClusterAccelerationStructurePropertiesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPhysicalDeviceClusterAccelerationStructurePropertiesNV`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDeviceClusterAccelerationStructurePropertiesNV`
    public VkPhysicalDeviceClusterAccelerationStructurePropertiesNV asSlice(long index, long count) { return new VkPhysicalDeviceClusterAccelerationStructurePropertiesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPhysicalDeviceClusterAccelerationStructurePropertiesNV` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPhysicalDeviceClusterAccelerationStructurePropertiesNV at(long index, Consumer<VkPhysicalDeviceClusterAccelerationStructurePropertiesNV> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceClusterAccelerationStructurePropertiesNV sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceClusterAccelerationStructurePropertiesNV pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `maxVerticesPerCluster` at the given index}
    /// @param index the index of the struct buffer
    public int maxVerticesPerClusterAt(long index) { return maxVerticesPerCluster(this.segment(), index); }
    /// Sets `maxVerticesPerCluster` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceClusterAccelerationStructurePropertiesNV maxVerticesPerClusterAt(long index, int value) { maxVerticesPerCluster(this.segment(), index, value); return this; }

    /// {@return `maxTrianglesPerCluster` at the given index}
    /// @param index the index of the struct buffer
    public int maxTrianglesPerClusterAt(long index) { return maxTrianglesPerCluster(this.segment(), index); }
    /// Sets `maxTrianglesPerCluster` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceClusterAccelerationStructurePropertiesNV maxTrianglesPerClusterAt(long index, int value) { maxTrianglesPerCluster(this.segment(), index, value); return this; }

    /// {@return `clusterScratchByteAlignment` at the given index}
    /// @param index the index of the struct buffer
    public int clusterScratchByteAlignmentAt(long index) { return clusterScratchByteAlignment(this.segment(), index); }
    /// Sets `clusterScratchByteAlignment` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceClusterAccelerationStructurePropertiesNV clusterScratchByteAlignmentAt(long index, int value) { clusterScratchByteAlignment(this.segment(), index, value); return this; }

    /// {@return `clusterByteAlignment` at the given index}
    /// @param index the index of the struct buffer
    public int clusterByteAlignmentAt(long index) { return clusterByteAlignment(this.segment(), index); }
    /// Sets `clusterByteAlignment` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceClusterAccelerationStructurePropertiesNV clusterByteAlignmentAt(long index, int value) { clusterByteAlignment(this.segment(), index, value); return this; }

    /// {@return `clusterTemplateByteAlignment` at the given index}
    /// @param index the index of the struct buffer
    public int clusterTemplateByteAlignmentAt(long index) { return clusterTemplateByteAlignment(this.segment(), index); }
    /// Sets `clusterTemplateByteAlignment` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceClusterAccelerationStructurePropertiesNV clusterTemplateByteAlignmentAt(long index, int value) { clusterTemplateByteAlignment(this.segment(), index, value); return this; }

    /// {@return `clusterBottomLevelByteAlignment` at the given index}
    /// @param index the index of the struct buffer
    public int clusterBottomLevelByteAlignmentAt(long index) { return clusterBottomLevelByteAlignment(this.segment(), index); }
    /// Sets `clusterBottomLevelByteAlignment` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceClusterAccelerationStructurePropertiesNV clusterBottomLevelByteAlignmentAt(long index, int value) { clusterBottomLevelByteAlignment(this.segment(), index, value); return this; }

    /// {@return `clusterTemplateBoundsByteAlignment` at the given index}
    /// @param index the index of the struct buffer
    public int clusterTemplateBoundsByteAlignmentAt(long index) { return clusterTemplateBoundsByteAlignment(this.segment(), index); }
    /// Sets `clusterTemplateBoundsByteAlignment` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceClusterAccelerationStructurePropertiesNV clusterTemplateBoundsByteAlignmentAt(long index, int value) { clusterTemplateBoundsByteAlignment(this.segment(), index, value); return this; }

    /// {@return `maxClusterGeometryIndex` at the given index}
    /// @param index the index of the struct buffer
    public int maxClusterGeometryIndexAt(long index) { return maxClusterGeometryIndex(this.segment(), index); }
    /// Sets `maxClusterGeometryIndex` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceClusterAccelerationStructurePropertiesNV maxClusterGeometryIndexAt(long index, int value) { maxClusterGeometryIndex(this.segment(), index, value); return this; }

}
