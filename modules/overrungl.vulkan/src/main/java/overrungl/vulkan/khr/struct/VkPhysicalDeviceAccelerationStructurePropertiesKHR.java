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
public final class VkPhysicalDeviceAccelerationStructurePropertiesKHR extends Struct {
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
    public static VkPhysicalDeviceAccelerationStructurePropertiesKHR ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceAccelerationStructurePropertiesKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkPhysicalDeviceAccelerationStructurePropertiesKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceAccelerationStructurePropertiesKHR`
    public static VkPhysicalDeviceAccelerationStructurePropertiesKHR alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceAccelerationStructurePropertiesKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceAccelerationStructurePropertiesKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceAccelerationStructurePropertiesKHR`
    public static VkPhysicalDeviceAccelerationStructurePropertiesKHR alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceAccelerationStructurePropertiesKHR(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `VkPhysicalDeviceAccelerationStructurePropertiesKHR`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDeviceAccelerationStructurePropertiesKHR`
    public VkPhysicalDeviceAccelerationStructurePropertiesKHR asSlice(long index) { return new VkPhysicalDeviceAccelerationStructurePropertiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `VkPhysicalDeviceAccelerationStructurePropertiesKHR`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDeviceAccelerationStructurePropertiesKHR`
    public VkPhysicalDeviceAccelerationStructurePropertiesKHR asSlice(long index, long count) { return new VkPhysicalDeviceAccelerationStructurePropertiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPhysicalDeviceAccelerationStructurePropertiesKHR.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkPhysicalDeviceAccelerationStructurePropertiesKHR.get_sType(this.segment(), index); }
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
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceAccelerationStructurePropertiesKHR sTypeAt(long index, @CType("VkStructureType") int value) { VkPhysicalDeviceAccelerationStructurePropertiesKHR.set_sType(this.segment(), index, value); return this; }
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
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkPhysicalDeviceAccelerationStructurePropertiesKHR.get_pNext(this.segment(), index); }
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
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceAccelerationStructurePropertiesKHR pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceAccelerationStructurePropertiesKHR.set_pNext(this.segment(), index, value); return this; }
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
    /// {@return `maxGeometryCount` at the given index}
    /// @param index the index
    public @CType("uint64_t") long maxGeometryCountAt(long index) { return VkPhysicalDeviceAccelerationStructurePropertiesKHR.get_maxGeometryCount(this.segment(), index); }
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
    /// Sets `maxGeometryCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceAccelerationStructurePropertiesKHR maxGeometryCountAt(long index, @CType("uint64_t") long value) { VkPhysicalDeviceAccelerationStructurePropertiesKHR.set_maxGeometryCount(this.segment(), index, value); return this; }
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
    /// {@return `maxInstanceCount` at the given index}
    /// @param index the index
    public @CType("uint64_t") long maxInstanceCountAt(long index) { return VkPhysicalDeviceAccelerationStructurePropertiesKHR.get_maxInstanceCount(this.segment(), index); }
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
    /// Sets `maxInstanceCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceAccelerationStructurePropertiesKHR maxInstanceCountAt(long index, @CType("uint64_t") long value) { VkPhysicalDeviceAccelerationStructurePropertiesKHR.set_maxInstanceCount(this.segment(), index, value); return this; }
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
    /// {@return `maxPrimitiveCount` at the given index}
    /// @param index the index
    public @CType("uint64_t") long maxPrimitiveCountAt(long index) { return VkPhysicalDeviceAccelerationStructurePropertiesKHR.get_maxPrimitiveCount(this.segment(), index); }
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
    /// Sets `maxPrimitiveCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceAccelerationStructurePropertiesKHR maxPrimitiveCountAt(long index, @CType("uint64_t") long value) { VkPhysicalDeviceAccelerationStructurePropertiesKHR.set_maxPrimitiveCount(this.segment(), index, value); return this; }
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
    /// {@return `maxPerStageDescriptorAccelerationStructures` at the given index}
    /// @param index the index
    public @CType("uint32_t") int maxPerStageDescriptorAccelerationStructuresAt(long index) { return VkPhysicalDeviceAccelerationStructurePropertiesKHR.get_maxPerStageDescriptorAccelerationStructures(this.segment(), index); }
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
    /// Sets `maxPerStageDescriptorAccelerationStructures` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceAccelerationStructurePropertiesKHR maxPerStageDescriptorAccelerationStructuresAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceAccelerationStructurePropertiesKHR.set_maxPerStageDescriptorAccelerationStructures(this.segment(), index, value); return this; }
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
    /// {@return `maxPerStageDescriptorUpdateAfterBindAccelerationStructures` at the given index}
    /// @param index the index
    public @CType("uint32_t") int maxPerStageDescriptorUpdateAfterBindAccelerationStructuresAt(long index) { return VkPhysicalDeviceAccelerationStructurePropertiesKHR.get_maxPerStageDescriptorUpdateAfterBindAccelerationStructures(this.segment(), index); }
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
    /// Sets `maxPerStageDescriptorUpdateAfterBindAccelerationStructures` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceAccelerationStructurePropertiesKHR maxPerStageDescriptorUpdateAfterBindAccelerationStructuresAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceAccelerationStructurePropertiesKHR.set_maxPerStageDescriptorUpdateAfterBindAccelerationStructures(this.segment(), index, value); return this; }
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
    /// {@return `maxDescriptorSetAccelerationStructures` at the given index}
    /// @param index the index
    public @CType("uint32_t") int maxDescriptorSetAccelerationStructuresAt(long index) { return VkPhysicalDeviceAccelerationStructurePropertiesKHR.get_maxDescriptorSetAccelerationStructures(this.segment(), index); }
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
    /// Sets `maxDescriptorSetAccelerationStructures` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceAccelerationStructurePropertiesKHR maxDescriptorSetAccelerationStructuresAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceAccelerationStructurePropertiesKHR.set_maxDescriptorSetAccelerationStructures(this.segment(), index, value); return this; }
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
    /// {@return `maxDescriptorSetUpdateAfterBindAccelerationStructures` at the given index}
    /// @param index the index
    public @CType("uint32_t") int maxDescriptorSetUpdateAfterBindAccelerationStructuresAt(long index) { return VkPhysicalDeviceAccelerationStructurePropertiesKHR.get_maxDescriptorSetUpdateAfterBindAccelerationStructures(this.segment(), index); }
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
    /// Sets `maxDescriptorSetUpdateAfterBindAccelerationStructures` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceAccelerationStructurePropertiesKHR maxDescriptorSetUpdateAfterBindAccelerationStructuresAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceAccelerationStructurePropertiesKHR.set_maxDescriptorSetUpdateAfterBindAccelerationStructures(this.segment(), index, value); return this; }
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
    /// {@return `minAccelerationStructureScratchOffsetAlignment` at the given index}
    /// @param index the index
    public @CType("uint32_t") int minAccelerationStructureScratchOffsetAlignmentAt(long index) { return VkPhysicalDeviceAccelerationStructurePropertiesKHR.get_minAccelerationStructureScratchOffsetAlignment(this.segment(), index); }
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
    /// Sets `minAccelerationStructureScratchOffsetAlignment` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceAccelerationStructurePropertiesKHR minAccelerationStructureScratchOffsetAlignmentAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceAccelerationStructurePropertiesKHR.set_minAccelerationStructureScratchOffsetAlignment(this.segment(), index, value); return this; }
    /// Sets `minAccelerationStructureScratchOffsetAlignment` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceAccelerationStructurePropertiesKHR minAccelerationStructureScratchOffsetAlignment(@CType("uint32_t") int value) { VkPhysicalDeviceAccelerationStructurePropertiesKHR.set_minAccelerationStructureScratchOffsetAlignment(this.segment(), value); return this; }

}
