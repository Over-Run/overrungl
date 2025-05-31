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
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkPhysicalDeviceRayTracingPropertiesNV {
///     (int) VkStructureType sType;
///     void* pNext;
///     uint32_t shaderGroupHandleSize;
///     uint32_t maxRecursionDepth;
///     uint32_t maxShaderGroupStride;
///     uint32_t shaderGroupBaseAlignment;
///     uint64_t maxGeometryCount;
///     uint64_t maxInstanceCount;
///     uint64_t maxTriangleCount;
///     uint32_t maxDescriptorSetAccelerationStructures;
/// };
/// ```
public sealed class VkPhysicalDeviceRayTracingPropertiesNV extends GroupType {
    /// The struct layout of `VkPhysicalDeviceRayTracingPropertiesNV`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
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
    /// The byte offset of `shaderGroupHandleSize`.
    public static final long OFFSET_shaderGroupHandleSize = LAYOUT.byteOffset(PathElement.groupElement("shaderGroupHandleSize"));
    /// The memory layout of `shaderGroupHandleSize`.
    public static final MemoryLayout LAYOUT_shaderGroupHandleSize = LAYOUT.select(PathElement.groupElement("shaderGroupHandleSize"));
    /// The [VarHandle] of `shaderGroupHandleSize` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_shaderGroupHandleSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderGroupHandleSize"));
    /// The byte offset of `maxRecursionDepth`.
    public static final long OFFSET_maxRecursionDepth = LAYOUT.byteOffset(PathElement.groupElement("maxRecursionDepth"));
    /// The memory layout of `maxRecursionDepth`.
    public static final MemoryLayout LAYOUT_maxRecursionDepth = LAYOUT.select(PathElement.groupElement("maxRecursionDepth"));
    /// The [VarHandle] of `maxRecursionDepth` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxRecursionDepth = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxRecursionDepth"));
    /// The byte offset of `maxShaderGroupStride`.
    public static final long OFFSET_maxShaderGroupStride = LAYOUT.byteOffset(PathElement.groupElement("maxShaderGroupStride"));
    /// The memory layout of `maxShaderGroupStride`.
    public static final MemoryLayout LAYOUT_maxShaderGroupStride = LAYOUT.select(PathElement.groupElement("maxShaderGroupStride"));
    /// The [VarHandle] of `maxShaderGroupStride` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxShaderGroupStride = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxShaderGroupStride"));
    /// The byte offset of `shaderGroupBaseAlignment`.
    public static final long OFFSET_shaderGroupBaseAlignment = LAYOUT.byteOffset(PathElement.groupElement("shaderGroupBaseAlignment"));
    /// The memory layout of `shaderGroupBaseAlignment`.
    public static final MemoryLayout LAYOUT_shaderGroupBaseAlignment = LAYOUT.select(PathElement.groupElement("shaderGroupBaseAlignment"));
    /// The [VarHandle] of `shaderGroupBaseAlignment` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_shaderGroupBaseAlignment = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderGroupBaseAlignment"));
    /// The byte offset of `maxGeometryCount`.
    public static final long OFFSET_maxGeometryCount = LAYOUT.byteOffset(PathElement.groupElement("maxGeometryCount"));
    /// The memory layout of `maxGeometryCount`.
    public static final MemoryLayout LAYOUT_maxGeometryCount = LAYOUT.select(PathElement.groupElement("maxGeometryCount"));
    /// The [VarHandle] of `maxGeometryCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxGeometryCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxGeometryCount"));
    /// The byte offset of `maxInstanceCount`.
    public static final long OFFSET_maxInstanceCount = LAYOUT.byteOffset(PathElement.groupElement("maxInstanceCount"));
    /// The memory layout of `maxInstanceCount`.
    public static final MemoryLayout LAYOUT_maxInstanceCount = LAYOUT.select(PathElement.groupElement("maxInstanceCount"));
    /// The [VarHandle] of `maxInstanceCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxInstanceCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxInstanceCount"));
    /// The byte offset of `maxTriangleCount`.
    public static final long OFFSET_maxTriangleCount = LAYOUT.byteOffset(PathElement.groupElement("maxTriangleCount"));
    /// The memory layout of `maxTriangleCount`.
    public static final MemoryLayout LAYOUT_maxTriangleCount = LAYOUT.select(PathElement.groupElement("maxTriangleCount"));
    /// The [VarHandle] of `maxTriangleCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxTriangleCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxTriangleCount"));
    /// The byte offset of `maxDescriptorSetAccelerationStructures`.
    public static final long OFFSET_maxDescriptorSetAccelerationStructures = LAYOUT.byteOffset(PathElement.groupElement("maxDescriptorSetAccelerationStructures"));
    /// The memory layout of `maxDescriptorSetAccelerationStructures`.
    public static final MemoryLayout LAYOUT_maxDescriptorSetAccelerationStructures = LAYOUT.select(PathElement.groupElement("maxDescriptorSetAccelerationStructures"));
    /// The [VarHandle] of `maxDescriptorSetAccelerationStructures` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxDescriptorSetAccelerationStructures = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxDescriptorSetAccelerationStructures"));

    /// Creates `VkPhysicalDeviceRayTracingPropertiesNV` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceRayTracingPropertiesNV(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceRayTracingPropertiesNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceRayTracingPropertiesNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceRayTracingPropertiesNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceRayTracingPropertiesNV(segment.reinterpret(LAYOUT.byteSize())); }

    /// Creates `VkPhysicalDeviceRayTracingPropertiesNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPhysicalDeviceRayTracingPropertiesNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceRayTracingPropertiesNV`
    public static VkPhysicalDeviceRayTracingPropertiesNV alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceRayTracingPropertiesNV(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceRayTracingPropertiesNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceRayTracingPropertiesNV`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceRayTracingPropertiesNV copyFrom(VkPhysicalDeviceRayTracingPropertiesNV src) { this.segment().copyFrom(src.segment()); return this; }

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
    public VkPhysicalDeviceRayTracingPropertiesNV sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceRayTracingPropertiesNV pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `shaderGroupHandleSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int shaderGroupHandleSize(MemorySegment segment, long index) { return (int) VH_shaderGroupHandleSize.get(segment, 0L, index); }
    /// {@return `shaderGroupHandleSize`}
    public int shaderGroupHandleSize() { return shaderGroupHandleSize(this.segment(), 0L); }
    /// Sets `shaderGroupHandleSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void shaderGroupHandleSize(MemorySegment segment, long index, int value) { VH_shaderGroupHandleSize.set(segment, 0L, index, value); }
    /// Sets `shaderGroupHandleSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceRayTracingPropertiesNV shaderGroupHandleSize(int value) { shaderGroupHandleSize(this.segment(), 0L, value); return this; }

    /// {@return `maxRecursionDepth` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxRecursionDepth(MemorySegment segment, long index) { return (int) VH_maxRecursionDepth.get(segment, 0L, index); }
    /// {@return `maxRecursionDepth`}
    public int maxRecursionDepth() { return maxRecursionDepth(this.segment(), 0L); }
    /// Sets `maxRecursionDepth` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxRecursionDepth(MemorySegment segment, long index, int value) { VH_maxRecursionDepth.set(segment, 0L, index, value); }
    /// Sets `maxRecursionDepth` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceRayTracingPropertiesNV maxRecursionDepth(int value) { maxRecursionDepth(this.segment(), 0L, value); return this; }

    /// {@return `maxShaderGroupStride` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxShaderGroupStride(MemorySegment segment, long index) { return (int) VH_maxShaderGroupStride.get(segment, 0L, index); }
    /// {@return `maxShaderGroupStride`}
    public int maxShaderGroupStride() { return maxShaderGroupStride(this.segment(), 0L); }
    /// Sets `maxShaderGroupStride` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxShaderGroupStride(MemorySegment segment, long index, int value) { VH_maxShaderGroupStride.set(segment, 0L, index, value); }
    /// Sets `maxShaderGroupStride` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceRayTracingPropertiesNV maxShaderGroupStride(int value) { maxShaderGroupStride(this.segment(), 0L, value); return this; }

    /// {@return `shaderGroupBaseAlignment` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int shaderGroupBaseAlignment(MemorySegment segment, long index) { return (int) VH_shaderGroupBaseAlignment.get(segment, 0L, index); }
    /// {@return `shaderGroupBaseAlignment`}
    public int shaderGroupBaseAlignment() { return shaderGroupBaseAlignment(this.segment(), 0L); }
    /// Sets `shaderGroupBaseAlignment` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void shaderGroupBaseAlignment(MemorySegment segment, long index, int value) { VH_shaderGroupBaseAlignment.set(segment, 0L, index, value); }
    /// Sets `shaderGroupBaseAlignment` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceRayTracingPropertiesNV shaderGroupBaseAlignment(int value) { shaderGroupBaseAlignment(this.segment(), 0L, value); return this; }

    /// {@return `maxGeometryCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long maxGeometryCount(MemorySegment segment, long index) { return (long) VH_maxGeometryCount.get(segment, 0L, index); }
    /// {@return `maxGeometryCount`}
    public long maxGeometryCount() { return maxGeometryCount(this.segment(), 0L); }
    /// Sets `maxGeometryCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxGeometryCount(MemorySegment segment, long index, long value) { VH_maxGeometryCount.set(segment, 0L, index, value); }
    /// Sets `maxGeometryCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceRayTracingPropertiesNV maxGeometryCount(long value) { maxGeometryCount(this.segment(), 0L, value); return this; }

    /// {@return `maxInstanceCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long maxInstanceCount(MemorySegment segment, long index) { return (long) VH_maxInstanceCount.get(segment, 0L, index); }
    /// {@return `maxInstanceCount`}
    public long maxInstanceCount() { return maxInstanceCount(this.segment(), 0L); }
    /// Sets `maxInstanceCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxInstanceCount(MemorySegment segment, long index, long value) { VH_maxInstanceCount.set(segment, 0L, index, value); }
    /// Sets `maxInstanceCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceRayTracingPropertiesNV maxInstanceCount(long value) { maxInstanceCount(this.segment(), 0L, value); return this; }

    /// {@return `maxTriangleCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long maxTriangleCount(MemorySegment segment, long index) { return (long) VH_maxTriangleCount.get(segment, 0L, index); }
    /// {@return `maxTriangleCount`}
    public long maxTriangleCount() { return maxTriangleCount(this.segment(), 0L); }
    /// Sets `maxTriangleCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxTriangleCount(MemorySegment segment, long index, long value) { VH_maxTriangleCount.set(segment, 0L, index, value); }
    /// Sets `maxTriangleCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceRayTracingPropertiesNV maxTriangleCount(long value) { maxTriangleCount(this.segment(), 0L, value); return this; }

    /// {@return `maxDescriptorSetAccelerationStructures` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxDescriptorSetAccelerationStructures(MemorySegment segment, long index) { return (int) VH_maxDescriptorSetAccelerationStructures.get(segment, 0L, index); }
    /// {@return `maxDescriptorSetAccelerationStructures`}
    public int maxDescriptorSetAccelerationStructures() { return maxDescriptorSetAccelerationStructures(this.segment(), 0L); }
    /// Sets `maxDescriptorSetAccelerationStructures` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxDescriptorSetAccelerationStructures(MemorySegment segment, long index, int value) { VH_maxDescriptorSetAccelerationStructures.set(segment, 0L, index, value); }
    /// Sets `maxDescriptorSetAccelerationStructures` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceRayTracingPropertiesNV maxDescriptorSetAccelerationStructures(int value) { maxDescriptorSetAccelerationStructures(this.segment(), 0L, value); return this; }

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

        /// {@return `shaderGroupHandleSize` at the given index}
        /// @param index the index of the struct buffer
        public int shaderGroupHandleSizeAt(long index) { return shaderGroupHandleSize(this.segment(), index); }
        /// Sets `shaderGroupHandleSize` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer shaderGroupHandleSizeAt(long index, int value) { shaderGroupHandleSize(this.segment(), index, value); return this; }

        /// {@return `maxRecursionDepth` at the given index}
        /// @param index the index of the struct buffer
        public int maxRecursionDepthAt(long index) { return maxRecursionDepth(this.segment(), index); }
        /// Sets `maxRecursionDepth` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer maxRecursionDepthAt(long index, int value) { maxRecursionDepth(this.segment(), index, value); return this; }

        /// {@return `maxShaderGroupStride` at the given index}
        /// @param index the index of the struct buffer
        public int maxShaderGroupStrideAt(long index) { return maxShaderGroupStride(this.segment(), index); }
        /// Sets `maxShaderGroupStride` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer maxShaderGroupStrideAt(long index, int value) { maxShaderGroupStride(this.segment(), index, value); return this; }

        /// {@return `shaderGroupBaseAlignment` at the given index}
        /// @param index the index of the struct buffer
        public int shaderGroupBaseAlignmentAt(long index) { return shaderGroupBaseAlignment(this.segment(), index); }
        /// Sets `shaderGroupBaseAlignment` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer shaderGroupBaseAlignmentAt(long index, int value) { shaderGroupBaseAlignment(this.segment(), index, value); return this; }

        /// {@return `maxGeometryCount` at the given index}
        /// @param index the index of the struct buffer
        public long maxGeometryCountAt(long index) { return maxGeometryCount(this.segment(), index); }
        /// Sets `maxGeometryCount` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer maxGeometryCountAt(long index, long value) { maxGeometryCount(this.segment(), index, value); return this; }

        /// {@return `maxInstanceCount` at the given index}
        /// @param index the index of the struct buffer
        public long maxInstanceCountAt(long index) { return maxInstanceCount(this.segment(), index); }
        /// Sets `maxInstanceCount` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer maxInstanceCountAt(long index, long value) { maxInstanceCount(this.segment(), index, value); return this; }

        /// {@return `maxTriangleCount` at the given index}
        /// @param index the index of the struct buffer
        public long maxTriangleCountAt(long index) { return maxTriangleCount(this.segment(), index); }
        /// Sets `maxTriangleCount` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer maxTriangleCountAt(long index, long value) { maxTriangleCount(this.segment(), index, value); return this; }

        /// {@return `maxDescriptorSetAccelerationStructures` at the given index}
        /// @param index the index of the struct buffer
        public int maxDescriptorSetAccelerationStructuresAt(long index) { return maxDescriptorSetAccelerationStructures(this.segment(), index); }
        /// Sets `maxDescriptorSetAccelerationStructures` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer maxDescriptorSetAccelerationStructuresAt(long index, int value) { maxDescriptorSetAccelerationStructures(this.segment(), index, value); return this; }

    }
}
