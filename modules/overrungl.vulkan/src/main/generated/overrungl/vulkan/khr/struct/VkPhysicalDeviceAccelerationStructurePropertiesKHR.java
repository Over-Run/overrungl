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
package overrungl.vulkan.khr.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkPhysicalDeviceAccelerationStructurePropertiesKHR {
///     (int) VkStructureType sType;
///     void* pNext;
///     uint64_t maxGeometryCount;
///     uint64_t maxInstanceCount;
///     uint64_t maxPrimitiveCount;
///     uint32_t maxPerStageDescriptorAccelerationStructures;
///     uint32_t maxPerStageDescriptorUpdateAfterBindAccelerationStructures;
///     uint32_t maxDescriptorSetAccelerationStructures;
///     uint32_t maxDescriptorSetUpdateAfterBindAccelerationStructures;
///     uint32_t minAccelerationStructureScratchOffsetAlignment;
/// };
/// ```
public sealed class VkPhysicalDeviceAccelerationStructurePropertiesKHR extends GroupType {
    /// The struct layout of `VkPhysicalDeviceAccelerationStructurePropertiesKHR`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("maxGeometryCount"),
        ValueLayout.JAVA_LONG.withName("maxInstanceCount"),
        ValueLayout.JAVA_LONG.withName("maxPrimitiveCount"),
        ValueLayout.JAVA_INT.withName("maxPerStageDescriptorAccelerationStructures"),
        ValueLayout.JAVA_INT.withName("maxPerStageDescriptorUpdateAfterBindAccelerationStructures"),
        ValueLayout.JAVA_INT.withName("maxDescriptorSetAccelerationStructures"),
        ValueLayout.JAVA_INT.withName("maxDescriptorSetUpdateAfterBindAccelerationStructures"),
        ValueLayout.JAVA_INT.withName("minAccelerationStructureScratchOffsetAlignment")
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
    /// The byte offset of `maxPrimitiveCount`.
    public static final long OFFSET_maxPrimitiveCount = LAYOUT.byteOffset(PathElement.groupElement("maxPrimitiveCount"));
    /// The memory layout of `maxPrimitiveCount`.
    public static final MemoryLayout LAYOUT_maxPrimitiveCount = LAYOUT.select(PathElement.groupElement("maxPrimitiveCount"));
    /// The [VarHandle] of `maxPrimitiveCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxPrimitiveCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxPrimitiveCount"));
    /// The byte offset of `maxPerStageDescriptorAccelerationStructures`.
    public static final long OFFSET_maxPerStageDescriptorAccelerationStructures = LAYOUT.byteOffset(PathElement.groupElement("maxPerStageDescriptorAccelerationStructures"));
    /// The memory layout of `maxPerStageDescriptorAccelerationStructures`.
    public static final MemoryLayout LAYOUT_maxPerStageDescriptorAccelerationStructures = LAYOUT.select(PathElement.groupElement("maxPerStageDescriptorAccelerationStructures"));
    /// The [VarHandle] of `maxPerStageDescriptorAccelerationStructures` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxPerStageDescriptorAccelerationStructures = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxPerStageDescriptorAccelerationStructures"));
    /// The byte offset of `maxPerStageDescriptorUpdateAfterBindAccelerationStructures`.
    public static final long OFFSET_maxPerStageDescriptorUpdateAfterBindAccelerationStructures = LAYOUT.byteOffset(PathElement.groupElement("maxPerStageDescriptorUpdateAfterBindAccelerationStructures"));
    /// The memory layout of `maxPerStageDescriptorUpdateAfterBindAccelerationStructures`.
    public static final MemoryLayout LAYOUT_maxPerStageDescriptorUpdateAfterBindAccelerationStructures = LAYOUT.select(PathElement.groupElement("maxPerStageDescriptorUpdateAfterBindAccelerationStructures"));
    /// The [VarHandle] of `maxPerStageDescriptorUpdateAfterBindAccelerationStructures` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxPerStageDescriptorUpdateAfterBindAccelerationStructures = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxPerStageDescriptorUpdateAfterBindAccelerationStructures"));
    /// The byte offset of `maxDescriptorSetAccelerationStructures`.
    public static final long OFFSET_maxDescriptorSetAccelerationStructures = LAYOUT.byteOffset(PathElement.groupElement("maxDescriptorSetAccelerationStructures"));
    /// The memory layout of `maxDescriptorSetAccelerationStructures`.
    public static final MemoryLayout LAYOUT_maxDescriptorSetAccelerationStructures = LAYOUT.select(PathElement.groupElement("maxDescriptorSetAccelerationStructures"));
    /// The [VarHandle] of `maxDescriptorSetAccelerationStructures` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxDescriptorSetAccelerationStructures = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxDescriptorSetAccelerationStructures"));
    /// The byte offset of `maxDescriptorSetUpdateAfterBindAccelerationStructures`.
    public static final long OFFSET_maxDescriptorSetUpdateAfterBindAccelerationStructures = LAYOUT.byteOffset(PathElement.groupElement("maxDescriptorSetUpdateAfterBindAccelerationStructures"));
    /// The memory layout of `maxDescriptorSetUpdateAfterBindAccelerationStructures`.
    public static final MemoryLayout LAYOUT_maxDescriptorSetUpdateAfterBindAccelerationStructures = LAYOUT.select(PathElement.groupElement("maxDescriptorSetUpdateAfterBindAccelerationStructures"));
    /// The [VarHandle] of `maxDescriptorSetUpdateAfterBindAccelerationStructures` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxDescriptorSetUpdateAfterBindAccelerationStructures = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxDescriptorSetUpdateAfterBindAccelerationStructures"));
    /// The byte offset of `minAccelerationStructureScratchOffsetAlignment`.
    public static final long OFFSET_minAccelerationStructureScratchOffsetAlignment = LAYOUT.byteOffset(PathElement.groupElement("minAccelerationStructureScratchOffsetAlignment"));
    /// The memory layout of `minAccelerationStructureScratchOffsetAlignment`.
    public static final MemoryLayout LAYOUT_minAccelerationStructureScratchOffsetAlignment = LAYOUT.select(PathElement.groupElement("minAccelerationStructureScratchOffsetAlignment"));
    /// The [VarHandle] of `minAccelerationStructureScratchOffsetAlignment` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_minAccelerationStructureScratchOffsetAlignment = LAYOUT.arrayElementVarHandle(PathElement.groupElement("minAccelerationStructureScratchOffsetAlignment"));

    /// Creates `VkPhysicalDeviceAccelerationStructurePropertiesKHR` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceAccelerationStructurePropertiesKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceAccelerationStructurePropertiesKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceAccelerationStructurePropertiesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceAccelerationStructurePropertiesKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceAccelerationStructurePropertiesKHR(segment.reinterpret(LAYOUT.byteSize())); }

    /// Creates `VkPhysicalDeviceAccelerationStructurePropertiesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPhysicalDeviceAccelerationStructurePropertiesKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceAccelerationStructurePropertiesKHR`
    public static VkPhysicalDeviceAccelerationStructurePropertiesKHR alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceAccelerationStructurePropertiesKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceAccelerationStructurePropertiesKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceAccelerationStructurePropertiesKHR`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceAccelerationStructurePropertiesKHR copyFrom(VkPhysicalDeviceAccelerationStructurePropertiesKHR src) { this.segment().copyFrom(src.segment()); return this; }

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
    public VkPhysicalDeviceAccelerationStructurePropertiesKHR sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceAccelerationStructurePropertiesKHR pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceAccelerationStructurePropertiesKHR maxGeometryCount(long value) { maxGeometryCount(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceAccelerationStructurePropertiesKHR maxInstanceCount(long value) { maxInstanceCount(this.segment(), 0L, value); return this; }

    /// {@return `maxPrimitiveCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long maxPrimitiveCount(MemorySegment segment, long index) { return (long) VH_maxPrimitiveCount.get(segment, 0L, index); }
    /// {@return `maxPrimitiveCount`}
    public long maxPrimitiveCount() { return maxPrimitiveCount(this.segment(), 0L); }
    /// Sets `maxPrimitiveCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxPrimitiveCount(MemorySegment segment, long index, long value) { VH_maxPrimitiveCount.set(segment, 0L, index, value); }
    /// Sets `maxPrimitiveCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceAccelerationStructurePropertiesKHR maxPrimitiveCount(long value) { maxPrimitiveCount(this.segment(), 0L, value); return this; }

    /// {@return `maxPerStageDescriptorAccelerationStructures` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxPerStageDescriptorAccelerationStructures(MemorySegment segment, long index) { return (int) VH_maxPerStageDescriptorAccelerationStructures.get(segment, 0L, index); }
    /// {@return `maxPerStageDescriptorAccelerationStructures`}
    public int maxPerStageDescriptorAccelerationStructures() { return maxPerStageDescriptorAccelerationStructures(this.segment(), 0L); }
    /// Sets `maxPerStageDescriptorAccelerationStructures` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxPerStageDescriptorAccelerationStructures(MemorySegment segment, long index, int value) { VH_maxPerStageDescriptorAccelerationStructures.set(segment, 0L, index, value); }
    /// Sets `maxPerStageDescriptorAccelerationStructures` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceAccelerationStructurePropertiesKHR maxPerStageDescriptorAccelerationStructures(int value) { maxPerStageDescriptorAccelerationStructures(this.segment(), 0L, value); return this; }

    /// {@return `maxPerStageDescriptorUpdateAfterBindAccelerationStructures` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxPerStageDescriptorUpdateAfterBindAccelerationStructures(MemorySegment segment, long index) { return (int) VH_maxPerStageDescriptorUpdateAfterBindAccelerationStructures.get(segment, 0L, index); }
    /// {@return `maxPerStageDescriptorUpdateAfterBindAccelerationStructures`}
    public int maxPerStageDescriptorUpdateAfterBindAccelerationStructures() { return maxPerStageDescriptorUpdateAfterBindAccelerationStructures(this.segment(), 0L); }
    /// Sets `maxPerStageDescriptorUpdateAfterBindAccelerationStructures` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxPerStageDescriptorUpdateAfterBindAccelerationStructures(MemorySegment segment, long index, int value) { VH_maxPerStageDescriptorUpdateAfterBindAccelerationStructures.set(segment, 0L, index, value); }
    /// Sets `maxPerStageDescriptorUpdateAfterBindAccelerationStructures` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceAccelerationStructurePropertiesKHR maxPerStageDescriptorUpdateAfterBindAccelerationStructures(int value) { maxPerStageDescriptorUpdateAfterBindAccelerationStructures(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceAccelerationStructurePropertiesKHR maxDescriptorSetAccelerationStructures(int value) { maxDescriptorSetAccelerationStructures(this.segment(), 0L, value); return this; }

    /// {@return `maxDescriptorSetUpdateAfterBindAccelerationStructures` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxDescriptorSetUpdateAfterBindAccelerationStructures(MemorySegment segment, long index) { return (int) VH_maxDescriptorSetUpdateAfterBindAccelerationStructures.get(segment, 0L, index); }
    /// {@return `maxDescriptorSetUpdateAfterBindAccelerationStructures`}
    public int maxDescriptorSetUpdateAfterBindAccelerationStructures() { return maxDescriptorSetUpdateAfterBindAccelerationStructures(this.segment(), 0L); }
    /// Sets `maxDescriptorSetUpdateAfterBindAccelerationStructures` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxDescriptorSetUpdateAfterBindAccelerationStructures(MemorySegment segment, long index, int value) { VH_maxDescriptorSetUpdateAfterBindAccelerationStructures.set(segment, 0L, index, value); }
    /// Sets `maxDescriptorSetUpdateAfterBindAccelerationStructures` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceAccelerationStructurePropertiesKHR maxDescriptorSetUpdateAfterBindAccelerationStructures(int value) { maxDescriptorSetUpdateAfterBindAccelerationStructures(this.segment(), 0L, value); return this; }

    /// {@return `minAccelerationStructureScratchOffsetAlignment` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int minAccelerationStructureScratchOffsetAlignment(MemorySegment segment, long index) { return (int) VH_minAccelerationStructureScratchOffsetAlignment.get(segment, 0L, index); }
    /// {@return `minAccelerationStructureScratchOffsetAlignment`}
    public int minAccelerationStructureScratchOffsetAlignment() { return minAccelerationStructureScratchOffsetAlignment(this.segment(), 0L); }
    /// Sets `minAccelerationStructureScratchOffsetAlignment` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void minAccelerationStructureScratchOffsetAlignment(MemorySegment segment, long index, int value) { VH_minAccelerationStructureScratchOffsetAlignment.set(segment, 0L, index, value); }
    /// Sets `minAccelerationStructureScratchOffsetAlignment` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceAccelerationStructurePropertiesKHR minAccelerationStructureScratchOffsetAlignment(int value) { minAccelerationStructureScratchOffsetAlignment(this.segment(), 0L, value); return this; }

    /// A buffer of [VkPhysicalDeviceAccelerationStructurePropertiesKHR].
    public static final class Buffer extends VkPhysicalDeviceAccelerationStructurePropertiesKHR {
        private final long elementCount;

        /// Creates `VkPhysicalDeviceAccelerationStructurePropertiesKHR.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkPhysicalDeviceAccelerationStructurePropertiesKHR`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkPhysicalDeviceAccelerationStructurePropertiesKHR`
        public VkPhysicalDeviceAccelerationStructurePropertiesKHR asSlice(long index) { return new VkPhysicalDeviceAccelerationStructurePropertiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkPhysicalDeviceAccelerationStructurePropertiesKHR`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkPhysicalDeviceAccelerationStructurePropertiesKHR`
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

        /// {@return `maxPrimitiveCount` at the given index}
        /// @param index the index of the struct buffer
        public long maxPrimitiveCountAt(long index) { return maxPrimitiveCount(this.segment(), index); }
        /// Sets `maxPrimitiveCount` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer maxPrimitiveCountAt(long index, long value) { maxPrimitiveCount(this.segment(), index, value); return this; }

        /// {@return `maxPerStageDescriptorAccelerationStructures` at the given index}
        /// @param index the index of the struct buffer
        public int maxPerStageDescriptorAccelerationStructuresAt(long index) { return maxPerStageDescriptorAccelerationStructures(this.segment(), index); }
        /// Sets `maxPerStageDescriptorAccelerationStructures` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer maxPerStageDescriptorAccelerationStructuresAt(long index, int value) { maxPerStageDescriptorAccelerationStructures(this.segment(), index, value); return this; }

        /// {@return `maxPerStageDescriptorUpdateAfterBindAccelerationStructures` at the given index}
        /// @param index the index of the struct buffer
        public int maxPerStageDescriptorUpdateAfterBindAccelerationStructuresAt(long index) { return maxPerStageDescriptorUpdateAfterBindAccelerationStructures(this.segment(), index); }
        /// Sets `maxPerStageDescriptorUpdateAfterBindAccelerationStructures` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer maxPerStageDescriptorUpdateAfterBindAccelerationStructuresAt(long index, int value) { maxPerStageDescriptorUpdateAfterBindAccelerationStructures(this.segment(), index, value); return this; }

        /// {@return `maxDescriptorSetAccelerationStructures` at the given index}
        /// @param index the index of the struct buffer
        public int maxDescriptorSetAccelerationStructuresAt(long index) { return maxDescriptorSetAccelerationStructures(this.segment(), index); }
        /// Sets `maxDescriptorSetAccelerationStructures` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer maxDescriptorSetAccelerationStructuresAt(long index, int value) { maxDescriptorSetAccelerationStructures(this.segment(), index, value); return this; }

        /// {@return `maxDescriptorSetUpdateAfterBindAccelerationStructures` at the given index}
        /// @param index the index of the struct buffer
        public int maxDescriptorSetUpdateAfterBindAccelerationStructuresAt(long index) { return maxDescriptorSetUpdateAfterBindAccelerationStructures(this.segment(), index); }
        /// Sets `maxDescriptorSetUpdateAfterBindAccelerationStructures` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer maxDescriptorSetUpdateAfterBindAccelerationStructuresAt(long index, int value) { maxDescriptorSetUpdateAfterBindAccelerationStructures(this.segment(), index, value); return this; }

        /// {@return `minAccelerationStructureScratchOffsetAlignment` at the given index}
        /// @param index the index of the struct buffer
        public int minAccelerationStructureScratchOffsetAlignmentAt(long index) { return minAccelerationStructureScratchOffsetAlignment(this.segment(), index); }
        /// Sets `minAccelerationStructureScratchOffsetAlignment` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer minAccelerationStructureScratchOffsetAlignmentAt(long index, int value) { minAccelerationStructureScratchOffsetAlignment(this.segment(), index, value); return this; }

    }
}
