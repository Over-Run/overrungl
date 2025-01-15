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
package overrungl.vulkan.khr.struct;

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
/// ### maxGeometryCount
/// [VarHandle][#VH_maxGeometryCount] - [Getter][#maxGeometryCount()] - [Setter][#maxGeometryCount(long)]
/// ### maxInstanceCount
/// [VarHandle][#VH_maxInstanceCount] - [Getter][#maxInstanceCount()] - [Setter][#maxInstanceCount(long)]
/// ### maxPrimitiveCount
/// [VarHandle][#VH_maxPrimitiveCount] - [Getter][#maxPrimitiveCount()] - [Setter][#maxPrimitiveCount(long)]
/// ### maxPerStageDescriptorAccelerationStructures
/// [VarHandle][#VH_maxPerStageDescriptorAccelerationStructures] - [Getter][#maxPerStageDescriptorAccelerationStructures()] - [Setter][#maxPerStageDescriptorAccelerationStructures(int)]
/// ### maxPerStageDescriptorUpdateAfterBindAccelerationStructures
/// [VarHandle][#VH_maxPerStageDescriptorUpdateAfterBindAccelerationStructures] - [Getter][#maxPerStageDescriptorUpdateAfterBindAccelerationStructures()] - [Setter][#maxPerStageDescriptorUpdateAfterBindAccelerationStructures(int)]
/// ### maxDescriptorSetAccelerationStructures
/// [VarHandle][#VH_maxDescriptorSetAccelerationStructures] - [Getter][#maxDescriptorSetAccelerationStructures()] - [Setter][#maxDescriptorSetAccelerationStructures(int)]
/// ### maxDescriptorSetUpdateAfterBindAccelerationStructures
/// [VarHandle][#VH_maxDescriptorSetUpdateAfterBindAccelerationStructures] - [Getter][#maxDescriptorSetUpdateAfterBindAccelerationStructures()] - [Setter][#maxDescriptorSetUpdateAfterBindAccelerationStructures(int)]
/// ### minAccelerationStructureScratchOffsetAlignment
/// [VarHandle][#VH_minAccelerationStructureScratchOffsetAlignment] - [Getter][#minAccelerationStructureScratchOffsetAlignment()] - [Setter][#minAccelerationStructureScratchOffsetAlignment(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPhysicalDeviceAccelerationStructurePropertiesKHR {
///     VkStructureType sType;
///     void * pNext;
///     uint64_t maxGeometryCount;
///     uint64_t maxInstanceCount;
///     uint64_t maxPrimitiveCount;
///     uint32_t maxPerStageDescriptorAccelerationStructures;
///     uint32_t maxPerStageDescriptorUpdateAfterBindAccelerationStructures;
///     uint32_t maxDescriptorSetAccelerationStructures;
///     uint32_t maxDescriptorSetUpdateAfterBindAccelerationStructures;
///     uint32_t minAccelerationStructureScratchOffsetAlignment;
/// } VkPhysicalDeviceAccelerationStructurePropertiesKHR;
/// ```
public sealed class VkPhysicalDeviceAccelerationStructurePropertiesKHR extends Struct {
    /// The struct layout of `VkPhysicalDeviceAccelerationStructurePropertiesKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
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
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `maxGeometryCount` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_maxGeometryCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxGeometryCount"));
    /// The [VarHandle] of `maxInstanceCount` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_maxInstanceCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxInstanceCount"));
    /// The [VarHandle] of `maxPrimitiveCount` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_maxPrimitiveCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxPrimitiveCount"));
    /// The [VarHandle] of `maxPerStageDescriptorAccelerationStructures` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxPerStageDescriptorAccelerationStructures = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxPerStageDescriptorAccelerationStructures"));
    /// The [VarHandle] of `maxPerStageDescriptorUpdateAfterBindAccelerationStructures` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxPerStageDescriptorUpdateAfterBindAccelerationStructures = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxPerStageDescriptorUpdateAfterBindAccelerationStructures"));
    /// The [VarHandle] of `maxDescriptorSetAccelerationStructures` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxDescriptorSetAccelerationStructures = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxDescriptorSetAccelerationStructures"));
    /// The [VarHandle] of `maxDescriptorSetUpdateAfterBindAccelerationStructures` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxDescriptorSetUpdateAfterBindAccelerationStructures = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxDescriptorSetUpdateAfterBindAccelerationStructures"));
    /// The [VarHandle] of `minAccelerationStructureScratchOffsetAlignment` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_minAccelerationStructureScratchOffsetAlignment = LAYOUT.arrayElementVarHandle(PathElement.groupElement("minAccelerationStructureScratchOffsetAlignment"));

    /// Creates `VkPhysicalDeviceAccelerationStructurePropertiesKHR` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceAccelerationStructurePropertiesKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceAccelerationStructurePropertiesKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceAccelerationStructurePropertiesKHR of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceAccelerationStructurePropertiesKHR(segment); }

    /// Creates `VkPhysicalDeviceAccelerationStructurePropertiesKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceAccelerationStructurePropertiesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceAccelerationStructurePropertiesKHR ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceAccelerationStructurePropertiesKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDeviceAccelerationStructurePropertiesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkPhysicalDeviceAccelerationStructurePropertiesKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceAccelerationStructurePropertiesKHR`
    public static VkPhysicalDeviceAccelerationStructurePropertiesKHR alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceAccelerationStructurePropertiesKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceAccelerationStructurePropertiesKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceAccelerationStructurePropertiesKHR`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkPhysicalDeviceAccelerationStructurePropertiesKHR` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceAccelerationStructurePropertiesKHR`
    public static VkPhysicalDeviceAccelerationStructurePropertiesKHR allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("void *") java.lang.foreign.MemorySegment pNext, @CType("uint64_t") long maxGeometryCount, @CType("uint64_t") long maxInstanceCount, @CType("uint64_t") long maxPrimitiveCount, @CType("uint32_t") int maxPerStageDescriptorAccelerationStructures, @CType("uint32_t") int maxPerStageDescriptorUpdateAfterBindAccelerationStructures, @CType("uint32_t") int maxDescriptorSetAccelerationStructures, @CType("uint32_t") int maxDescriptorSetUpdateAfterBindAccelerationStructures, @CType("uint32_t") int minAccelerationStructureScratchOffsetAlignment) { return alloc(allocator).sType(sType).pNext(pNext).maxGeometryCount(maxGeometryCount).maxInstanceCount(maxInstanceCount).maxPrimitiveCount(maxPrimitiveCount).maxPerStageDescriptorAccelerationStructures(maxPerStageDescriptorAccelerationStructures).maxPerStageDescriptorUpdateAfterBindAccelerationStructures(maxPerStageDescriptorUpdateAfterBindAccelerationStructures).maxDescriptorSetAccelerationStructures(maxDescriptorSetAccelerationStructures).maxDescriptorSetUpdateAfterBindAccelerationStructures(maxDescriptorSetUpdateAfterBindAccelerationStructures).minAccelerationStructureScratchOffsetAlignment(minAccelerationStructureScratchOffsetAlignment); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceAccelerationStructurePropertiesKHR copyFrom(VkPhysicalDeviceAccelerationStructurePropertiesKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPhysicalDeviceAccelerationStructurePropertiesKHR.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPhysicalDeviceAccelerationStructurePropertiesKHR.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPhysicalDeviceAccelerationStructurePropertiesKHR.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceAccelerationStructurePropertiesKHR sType(@CType("VkStructureType") int value) { VkPhysicalDeviceAccelerationStructurePropertiesKHR.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkPhysicalDeviceAccelerationStructurePropertiesKHR.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkPhysicalDeviceAccelerationStructurePropertiesKHR.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceAccelerationStructurePropertiesKHR.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceAccelerationStructurePropertiesKHR pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceAccelerationStructurePropertiesKHR.set_pNext(this.segment(), value); return this; }

    /// {@return `maxGeometryCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint64_t") long get_maxGeometryCount(MemorySegment segment, long index) { return (long) VH_maxGeometryCount.get(segment, 0L, index); }
    /// {@return `maxGeometryCount`}
    /// @param segment the segment of the struct
    public static @CType("uint64_t") long get_maxGeometryCount(MemorySegment segment) { return VkPhysicalDeviceAccelerationStructurePropertiesKHR.get_maxGeometryCount(segment, 0L); }
    /// {@return `maxGeometryCount`}
    public @CType("uint64_t") long maxGeometryCount() { return VkPhysicalDeviceAccelerationStructurePropertiesKHR.get_maxGeometryCount(this.segment()); }
    /// Sets `maxGeometryCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxGeometryCount(MemorySegment segment, long index, @CType("uint64_t") long value) { VH_maxGeometryCount.set(segment, 0L, index, value); }
    /// Sets `maxGeometryCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxGeometryCount(MemorySegment segment, @CType("uint64_t") long value) { VkPhysicalDeviceAccelerationStructurePropertiesKHR.set_maxGeometryCount(segment, 0L, value); }
    /// Sets `maxGeometryCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceAccelerationStructurePropertiesKHR maxGeometryCount(@CType("uint64_t") long value) { VkPhysicalDeviceAccelerationStructurePropertiesKHR.set_maxGeometryCount(this.segment(), value); return this; }

    /// {@return `maxInstanceCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint64_t") long get_maxInstanceCount(MemorySegment segment, long index) { return (long) VH_maxInstanceCount.get(segment, 0L, index); }
    /// {@return `maxInstanceCount`}
    /// @param segment the segment of the struct
    public static @CType("uint64_t") long get_maxInstanceCount(MemorySegment segment) { return VkPhysicalDeviceAccelerationStructurePropertiesKHR.get_maxInstanceCount(segment, 0L); }
    /// {@return `maxInstanceCount`}
    public @CType("uint64_t") long maxInstanceCount() { return VkPhysicalDeviceAccelerationStructurePropertiesKHR.get_maxInstanceCount(this.segment()); }
    /// Sets `maxInstanceCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxInstanceCount(MemorySegment segment, long index, @CType("uint64_t") long value) { VH_maxInstanceCount.set(segment, 0L, index, value); }
    /// Sets `maxInstanceCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxInstanceCount(MemorySegment segment, @CType("uint64_t") long value) { VkPhysicalDeviceAccelerationStructurePropertiesKHR.set_maxInstanceCount(segment, 0L, value); }
    /// Sets `maxInstanceCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceAccelerationStructurePropertiesKHR maxInstanceCount(@CType("uint64_t") long value) { VkPhysicalDeviceAccelerationStructurePropertiesKHR.set_maxInstanceCount(this.segment(), value); return this; }

    /// {@return `maxPrimitiveCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint64_t") long get_maxPrimitiveCount(MemorySegment segment, long index) { return (long) VH_maxPrimitiveCount.get(segment, 0L, index); }
    /// {@return `maxPrimitiveCount`}
    /// @param segment the segment of the struct
    public static @CType("uint64_t") long get_maxPrimitiveCount(MemorySegment segment) { return VkPhysicalDeviceAccelerationStructurePropertiesKHR.get_maxPrimitiveCount(segment, 0L); }
    /// {@return `maxPrimitiveCount`}
    public @CType("uint64_t") long maxPrimitiveCount() { return VkPhysicalDeviceAccelerationStructurePropertiesKHR.get_maxPrimitiveCount(this.segment()); }
    /// Sets `maxPrimitiveCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxPrimitiveCount(MemorySegment segment, long index, @CType("uint64_t") long value) { VH_maxPrimitiveCount.set(segment, 0L, index, value); }
    /// Sets `maxPrimitiveCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxPrimitiveCount(MemorySegment segment, @CType("uint64_t") long value) { VkPhysicalDeviceAccelerationStructurePropertiesKHR.set_maxPrimitiveCount(segment, 0L, value); }
    /// Sets `maxPrimitiveCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceAccelerationStructurePropertiesKHR maxPrimitiveCount(@CType("uint64_t") long value) { VkPhysicalDeviceAccelerationStructurePropertiesKHR.set_maxPrimitiveCount(this.segment(), value); return this; }

    /// {@return `maxPerStageDescriptorAccelerationStructures` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxPerStageDescriptorAccelerationStructures(MemorySegment segment, long index) { return (int) VH_maxPerStageDescriptorAccelerationStructures.get(segment, 0L, index); }
    /// {@return `maxPerStageDescriptorAccelerationStructures`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxPerStageDescriptorAccelerationStructures(MemorySegment segment) { return VkPhysicalDeviceAccelerationStructurePropertiesKHR.get_maxPerStageDescriptorAccelerationStructures(segment, 0L); }
    /// {@return `maxPerStageDescriptorAccelerationStructures`}
    public @CType("uint32_t") int maxPerStageDescriptorAccelerationStructures() { return VkPhysicalDeviceAccelerationStructurePropertiesKHR.get_maxPerStageDescriptorAccelerationStructures(this.segment()); }
    /// Sets `maxPerStageDescriptorAccelerationStructures` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxPerStageDescriptorAccelerationStructures(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxPerStageDescriptorAccelerationStructures.set(segment, 0L, index, value); }
    /// Sets `maxPerStageDescriptorAccelerationStructures` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxPerStageDescriptorAccelerationStructures(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceAccelerationStructurePropertiesKHR.set_maxPerStageDescriptorAccelerationStructures(segment, 0L, value); }
    /// Sets `maxPerStageDescriptorAccelerationStructures` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceAccelerationStructurePropertiesKHR maxPerStageDescriptorAccelerationStructures(@CType("uint32_t") int value) { VkPhysicalDeviceAccelerationStructurePropertiesKHR.set_maxPerStageDescriptorAccelerationStructures(this.segment(), value); return this; }

    /// {@return `maxPerStageDescriptorUpdateAfterBindAccelerationStructures` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxPerStageDescriptorUpdateAfterBindAccelerationStructures(MemorySegment segment, long index) { return (int) VH_maxPerStageDescriptorUpdateAfterBindAccelerationStructures.get(segment, 0L, index); }
    /// {@return `maxPerStageDescriptorUpdateAfterBindAccelerationStructures`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxPerStageDescriptorUpdateAfterBindAccelerationStructures(MemorySegment segment) { return VkPhysicalDeviceAccelerationStructurePropertiesKHR.get_maxPerStageDescriptorUpdateAfterBindAccelerationStructures(segment, 0L); }
    /// {@return `maxPerStageDescriptorUpdateAfterBindAccelerationStructures`}
    public @CType("uint32_t") int maxPerStageDescriptorUpdateAfterBindAccelerationStructures() { return VkPhysicalDeviceAccelerationStructurePropertiesKHR.get_maxPerStageDescriptorUpdateAfterBindAccelerationStructures(this.segment()); }
    /// Sets `maxPerStageDescriptorUpdateAfterBindAccelerationStructures` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxPerStageDescriptorUpdateAfterBindAccelerationStructures(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxPerStageDescriptorUpdateAfterBindAccelerationStructures.set(segment, 0L, index, value); }
    /// Sets `maxPerStageDescriptorUpdateAfterBindAccelerationStructures` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxPerStageDescriptorUpdateAfterBindAccelerationStructures(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceAccelerationStructurePropertiesKHR.set_maxPerStageDescriptorUpdateAfterBindAccelerationStructures(segment, 0L, value); }
    /// Sets `maxPerStageDescriptorUpdateAfterBindAccelerationStructures` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceAccelerationStructurePropertiesKHR maxPerStageDescriptorUpdateAfterBindAccelerationStructures(@CType("uint32_t") int value) { VkPhysicalDeviceAccelerationStructurePropertiesKHR.set_maxPerStageDescriptorUpdateAfterBindAccelerationStructures(this.segment(), value); return this; }

    /// {@return `maxDescriptorSetAccelerationStructures` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxDescriptorSetAccelerationStructures(MemorySegment segment, long index) { return (int) VH_maxDescriptorSetAccelerationStructures.get(segment, 0L, index); }
    /// {@return `maxDescriptorSetAccelerationStructures`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxDescriptorSetAccelerationStructures(MemorySegment segment) { return VkPhysicalDeviceAccelerationStructurePropertiesKHR.get_maxDescriptorSetAccelerationStructures(segment, 0L); }
    /// {@return `maxDescriptorSetAccelerationStructures`}
    public @CType("uint32_t") int maxDescriptorSetAccelerationStructures() { return VkPhysicalDeviceAccelerationStructurePropertiesKHR.get_maxDescriptorSetAccelerationStructures(this.segment()); }
    /// Sets `maxDescriptorSetAccelerationStructures` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxDescriptorSetAccelerationStructures(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxDescriptorSetAccelerationStructures.set(segment, 0L, index, value); }
    /// Sets `maxDescriptorSetAccelerationStructures` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxDescriptorSetAccelerationStructures(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceAccelerationStructurePropertiesKHR.set_maxDescriptorSetAccelerationStructures(segment, 0L, value); }
    /// Sets `maxDescriptorSetAccelerationStructures` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceAccelerationStructurePropertiesKHR maxDescriptorSetAccelerationStructures(@CType("uint32_t") int value) { VkPhysicalDeviceAccelerationStructurePropertiesKHR.set_maxDescriptorSetAccelerationStructures(this.segment(), value); return this; }

    /// {@return `maxDescriptorSetUpdateAfterBindAccelerationStructures` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxDescriptorSetUpdateAfterBindAccelerationStructures(MemorySegment segment, long index) { return (int) VH_maxDescriptorSetUpdateAfterBindAccelerationStructures.get(segment, 0L, index); }
    /// {@return `maxDescriptorSetUpdateAfterBindAccelerationStructures`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxDescriptorSetUpdateAfterBindAccelerationStructures(MemorySegment segment) { return VkPhysicalDeviceAccelerationStructurePropertiesKHR.get_maxDescriptorSetUpdateAfterBindAccelerationStructures(segment, 0L); }
    /// {@return `maxDescriptorSetUpdateAfterBindAccelerationStructures`}
    public @CType("uint32_t") int maxDescriptorSetUpdateAfterBindAccelerationStructures() { return VkPhysicalDeviceAccelerationStructurePropertiesKHR.get_maxDescriptorSetUpdateAfterBindAccelerationStructures(this.segment()); }
    /// Sets `maxDescriptorSetUpdateAfterBindAccelerationStructures` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxDescriptorSetUpdateAfterBindAccelerationStructures(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxDescriptorSetUpdateAfterBindAccelerationStructures.set(segment, 0L, index, value); }
    /// Sets `maxDescriptorSetUpdateAfterBindAccelerationStructures` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxDescriptorSetUpdateAfterBindAccelerationStructures(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceAccelerationStructurePropertiesKHR.set_maxDescriptorSetUpdateAfterBindAccelerationStructures(segment, 0L, value); }
    /// Sets `maxDescriptorSetUpdateAfterBindAccelerationStructures` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceAccelerationStructurePropertiesKHR maxDescriptorSetUpdateAfterBindAccelerationStructures(@CType("uint32_t") int value) { VkPhysicalDeviceAccelerationStructurePropertiesKHR.set_maxDescriptorSetUpdateAfterBindAccelerationStructures(this.segment(), value); return this; }

    /// {@return `minAccelerationStructureScratchOffsetAlignment` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_minAccelerationStructureScratchOffsetAlignment(MemorySegment segment, long index) { return (int) VH_minAccelerationStructureScratchOffsetAlignment.get(segment, 0L, index); }
    /// {@return `minAccelerationStructureScratchOffsetAlignment`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_minAccelerationStructureScratchOffsetAlignment(MemorySegment segment) { return VkPhysicalDeviceAccelerationStructurePropertiesKHR.get_minAccelerationStructureScratchOffsetAlignment(segment, 0L); }
    /// {@return `minAccelerationStructureScratchOffsetAlignment`}
    public @CType("uint32_t") int minAccelerationStructureScratchOffsetAlignment() { return VkPhysicalDeviceAccelerationStructurePropertiesKHR.get_minAccelerationStructureScratchOffsetAlignment(this.segment()); }
    /// Sets `minAccelerationStructureScratchOffsetAlignment` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_minAccelerationStructureScratchOffsetAlignment(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_minAccelerationStructureScratchOffsetAlignment.set(segment, 0L, index, value); }
    /// Sets `minAccelerationStructureScratchOffsetAlignment` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_minAccelerationStructureScratchOffsetAlignment(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceAccelerationStructurePropertiesKHR.set_minAccelerationStructureScratchOffsetAlignment(segment, 0L, value); }
    /// Sets `minAccelerationStructureScratchOffsetAlignment` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceAccelerationStructurePropertiesKHR minAccelerationStructureScratchOffsetAlignment(@CType("uint32_t") int value) { VkPhysicalDeviceAccelerationStructurePropertiesKHR.set_minAccelerationStructureScratchOffsetAlignment(this.segment(), value); return this; }

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
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkPhysicalDeviceAccelerationStructurePropertiesKHR.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkPhysicalDeviceAccelerationStructurePropertiesKHR.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkPhysicalDeviceAccelerationStructurePropertiesKHR.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceAccelerationStructurePropertiesKHR.set_pNext(this.segment(), index, value); return this; }

        /// {@return `maxGeometryCount` at the given index}
        /// @param index the index
        public @CType("uint64_t") long maxGeometryCountAt(long index) { return VkPhysicalDeviceAccelerationStructurePropertiesKHR.get_maxGeometryCount(this.segment(), index); }
        /// Sets `maxGeometryCount` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maxGeometryCountAt(long index, @CType("uint64_t") long value) { VkPhysicalDeviceAccelerationStructurePropertiesKHR.set_maxGeometryCount(this.segment(), index, value); return this; }

        /// {@return `maxInstanceCount` at the given index}
        /// @param index the index
        public @CType("uint64_t") long maxInstanceCountAt(long index) { return VkPhysicalDeviceAccelerationStructurePropertiesKHR.get_maxInstanceCount(this.segment(), index); }
        /// Sets `maxInstanceCount` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maxInstanceCountAt(long index, @CType("uint64_t") long value) { VkPhysicalDeviceAccelerationStructurePropertiesKHR.set_maxInstanceCount(this.segment(), index, value); return this; }

        /// {@return `maxPrimitiveCount` at the given index}
        /// @param index the index
        public @CType("uint64_t") long maxPrimitiveCountAt(long index) { return VkPhysicalDeviceAccelerationStructurePropertiesKHR.get_maxPrimitiveCount(this.segment(), index); }
        /// Sets `maxPrimitiveCount` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maxPrimitiveCountAt(long index, @CType("uint64_t") long value) { VkPhysicalDeviceAccelerationStructurePropertiesKHR.set_maxPrimitiveCount(this.segment(), index, value); return this; }

        /// {@return `maxPerStageDescriptorAccelerationStructures` at the given index}
        /// @param index the index
        public @CType("uint32_t") int maxPerStageDescriptorAccelerationStructuresAt(long index) { return VkPhysicalDeviceAccelerationStructurePropertiesKHR.get_maxPerStageDescriptorAccelerationStructures(this.segment(), index); }
        /// Sets `maxPerStageDescriptorAccelerationStructures` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maxPerStageDescriptorAccelerationStructuresAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceAccelerationStructurePropertiesKHR.set_maxPerStageDescriptorAccelerationStructures(this.segment(), index, value); return this; }

        /// {@return `maxPerStageDescriptorUpdateAfterBindAccelerationStructures` at the given index}
        /// @param index the index
        public @CType("uint32_t") int maxPerStageDescriptorUpdateAfterBindAccelerationStructuresAt(long index) { return VkPhysicalDeviceAccelerationStructurePropertiesKHR.get_maxPerStageDescriptorUpdateAfterBindAccelerationStructures(this.segment(), index); }
        /// Sets `maxPerStageDescriptorUpdateAfterBindAccelerationStructures` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maxPerStageDescriptorUpdateAfterBindAccelerationStructuresAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceAccelerationStructurePropertiesKHR.set_maxPerStageDescriptorUpdateAfterBindAccelerationStructures(this.segment(), index, value); return this; }

        /// {@return `maxDescriptorSetAccelerationStructures` at the given index}
        /// @param index the index
        public @CType("uint32_t") int maxDescriptorSetAccelerationStructuresAt(long index) { return VkPhysicalDeviceAccelerationStructurePropertiesKHR.get_maxDescriptorSetAccelerationStructures(this.segment(), index); }
        /// Sets `maxDescriptorSetAccelerationStructures` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maxDescriptorSetAccelerationStructuresAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceAccelerationStructurePropertiesKHR.set_maxDescriptorSetAccelerationStructures(this.segment(), index, value); return this; }

        /// {@return `maxDescriptorSetUpdateAfterBindAccelerationStructures` at the given index}
        /// @param index the index
        public @CType("uint32_t") int maxDescriptorSetUpdateAfterBindAccelerationStructuresAt(long index) { return VkPhysicalDeviceAccelerationStructurePropertiesKHR.get_maxDescriptorSetUpdateAfterBindAccelerationStructures(this.segment(), index); }
        /// Sets `maxDescriptorSetUpdateAfterBindAccelerationStructures` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maxDescriptorSetUpdateAfterBindAccelerationStructuresAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceAccelerationStructurePropertiesKHR.set_maxDescriptorSetUpdateAfterBindAccelerationStructures(this.segment(), index, value); return this; }

        /// {@return `minAccelerationStructureScratchOffsetAlignment` at the given index}
        /// @param index the index
        public @CType("uint32_t") int minAccelerationStructureScratchOffsetAlignmentAt(long index) { return VkPhysicalDeviceAccelerationStructurePropertiesKHR.get_minAccelerationStructureScratchOffsetAlignment(this.segment(), index); }
        /// Sets `minAccelerationStructureScratchOffsetAlignment` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer minAccelerationStructureScratchOffsetAlignmentAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceAccelerationStructurePropertiesKHR.set_minAccelerationStructureScratchOffsetAlignment(this.segment(), index, value); return this; }

    }
}
