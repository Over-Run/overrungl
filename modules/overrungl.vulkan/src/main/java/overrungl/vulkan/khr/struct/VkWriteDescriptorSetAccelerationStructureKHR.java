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
/// ### accelerationStructureCount
/// [VarHandle][#VH_accelerationStructureCount] - [Getter][#accelerationStructureCount()] - [Setter][#accelerationStructureCount(int)]
/// ### pAccelerationStructures
/// [VarHandle][#VH_pAccelerationStructures] - [Getter][#pAccelerationStructures()] - [Setter][#pAccelerationStructures(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkWriteDescriptorSetAccelerationStructureKHR {
///     VkStructureType sType;
///     const void * pNext;
///     uint32_t accelerationStructureCount;
///     const VkAccelerationStructureKHR * pAccelerationStructures;
/// } VkWriteDescriptorSetAccelerationStructureKHR;
/// ```
public final class VkWriteDescriptorSetAccelerationStructureKHR extends Struct {
    /// The struct layout of `VkWriteDescriptorSetAccelerationStructureKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("accelerationStructureCount"),
        ValueLayout.ADDRESS.withName("pAccelerationStructures")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `accelerationStructureCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_accelerationStructureCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("accelerationStructureCount"));
    /// The [VarHandle] of `pAccelerationStructures` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pAccelerationStructures = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pAccelerationStructures"));

    /// Creates `VkWriteDescriptorSetAccelerationStructureKHR` with the given segment.
    /// @param segment the memory segment
    public VkWriteDescriptorSetAccelerationStructureKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkWriteDescriptorSetAccelerationStructureKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkWriteDescriptorSetAccelerationStructureKHR of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkWriteDescriptorSetAccelerationStructureKHR(segment); }

    /// Creates `VkWriteDescriptorSetAccelerationStructureKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkWriteDescriptorSetAccelerationStructureKHR ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkWriteDescriptorSetAccelerationStructureKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkWriteDescriptorSetAccelerationStructureKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkWriteDescriptorSetAccelerationStructureKHR ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkWriteDescriptorSetAccelerationStructureKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkWriteDescriptorSetAccelerationStructureKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkWriteDescriptorSetAccelerationStructureKHR`
    public static VkWriteDescriptorSetAccelerationStructureKHR alloc(SegmentAllocator allocator) { return new VkWriteDescriptorSetAccelerationStructureKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkWriteDescriptorSetAccelerationStructureKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkWriteDescriptorSetAccelerationStructureKHR`
    public static VkWriteDescriptorSetAccelerationStructureKHR alloc(SegmentAllocator allocator, long count) { return new VkWriteDescriptorSetAccelerationStructureKHR(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkWriteDescriptorSetAccelerationStructureKHR.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkWriteDescriptorSetAccelerationStructureKHR.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkWriteDescriptorSetAccelerationStructureKHR.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkWriteDescriptorSetAccelerationStructureKHR.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkWriteDescriptorSetAccelerationStructureKHR sTypeAt(long index, @CType("VkStructureType") int value) { VkWriteDescriptorSetAccelerationStructureKHR.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkWriteDescriptorSetAccelerationStructureKHR sType(@CType("VkStructureType") int value) { VkWriteDescriptorSetAccelerationStructureKHR.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkWriteDescriptorSetAccelerationStructureKHR.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkWriteDescriptorSetAccelerationStructureKHR.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkWriteDescriptorSetAccelerationStructureKHR.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkWriteDescriptorSetAccelerationStructureKHR.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkWriteDescriptorSetAccelerationStructureKHR pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkWriteDescriptorSetAccelerationStructureKHR.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkWriteDescriptorSetAccelerationStructureKHR pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkWriteDescriptorSetAccelerationStructureKHR.set_pNext(this.segment(), value); return this; }

    /// {@return `accelerationStructureCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_accelerationStructureCount(MemorySegment segment, long index) { return (int) VH_accelerationStructureCount.get(segment, 0L, index); }
    /// {@return `accelerationStructureCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_accelerationStructureCount(MemorySegment segment) { return VkWriteDescriptorSetAccelerationStructureKHR.get_accelerationStructureCount(segment, 0L); }
    /// {@return `accelerationStructureCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int accelerationStructureCountAt(long index) { return VkWriteDescriptorSetAccelerationStructureKHR.get_accelerationStructureCount(this.segment(), index); }
    /// {@return `accelerationStructureCount`}
    public @CType("uint32_t") int accelerationStructureCount() { return VkWriteDescriptorSetAccelerationStructureKHR.get_accelerationStructureCount(this.segment()); }
    /// Sets `accelerationStructureCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_accelerationStructureCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_accelerationStructureCount.set(segment, 0L, index, value); }
    /// Sets `accelerationStructureCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_accelerationStructureCount(MemorySegment segment, @CType("uint32_t") int value) { VkWriteDescriptorSetAccelerationStructureKHR.set_accelerationStructureCount(segment, 0L, value); }
    /// Sets `accelerationStructureCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkWriteDescriptorSetAccelerationStructureKHR accelerationStructureCountAt(long index, @CType("uint32_t") int value) { VkWriteDescriptorSetAccelerationStructureKHR.set_accelerationStructureCount(this.segment(), index, value); return this; }
    /// Sets `accelerationStructureCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkWriteDescriptorSetAccelerationStructureKHR accelerationStructureCount(@CType("uint32_t") int value) { VkWriteDescriptorSetAccelerationStructureKHR.set_accelerationStructureCount(this.segment(), value); return this; }

    /// {@return `pAccelerationStructures` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const VkAccelerationStructureKHR *") java.lang.foreign.MemorySegment get_pAccelerationStructures(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pAccelerationStructures.get(segment, 0L, index); }
    /// {@return `pAccelerationStructures`}
    /// @param segment the segment of the struct
    public static @CType("const VkAccelerationStructureKHR *") java.lang.foreign.MemorySegment get_pAccelerationStructures(MemorySegment segment) { return VkWriteDescriptorSetAccelerationStructureKHR.get_pAccelerationStructures(segment, 0L); }
    /// {@return `pAccelerationStructures` at the given index}
    /// @param index the index
    public @CType("const VkAccelerationStructureKHR *") java.lang.foreign.MemorySegment pAccelerationStructuresAt(long index) { return VkWriteDescriptorSetAccelerationStructureKHR.get_pAccelerationStructures(this.segment(), index); }
    /// {@return `pAccelerationStructures`}
    public @CType("const VkAccelerationStructureKHR *") java.lang.foreign.MemorySegment pAccelerationStructures() { return VkWriteDescriptorSetAccelerationStructureKHR.get_pAccelerationStructures(this.segment()); }
    /// Sets `pAccelerationStructures` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pAccelerationStructures(MemorySegment segment, long index, @CType("const VkAccelerationStructureKHR *") java.lang.foreign.MemorySegment value) { VH_pAccelerationStructures.set(segment, 0L, index, value); }
    /// Sets `pAccelerationStructures` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pAccelerationStructures(MemorySegment segment, @CType("const VkAccelerationStructureKHR *") java.lang.foreign.MemorySegment value) { VkWriteDescriptorSetAccelerationStructureKHR.set_pAccelerationStructures(segment, 0L, value); }
    /// Sets `pAccelerationStructures` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkWriteDescriptorSetAccelerationStructureKHR pAccelerationStructuresAt(long index, @CType("const VkAccelerationStructureKHR *") java.lang.foreign.MemorySegment value) { VkWriteDescriptorSetAccelerationStructureKHR.set_pAccelerationStructures(this.segment(), index, value); return this; }
    /// Sets `pAccelerationStructures` with the given value.
    /// @param value the value
    /// @return `this`
    public VkWriteDescriptorSetAccelerationStructureKHR pAccelerationStructures(@CType("const VkAccelerationStructureKHR *") java.lang.foreign.MemorySegment value) { VkWriteDescriptorSetAccelerationStructureKHR.set_pAccelerationStructures(this.segment(), value); return this; }

}
