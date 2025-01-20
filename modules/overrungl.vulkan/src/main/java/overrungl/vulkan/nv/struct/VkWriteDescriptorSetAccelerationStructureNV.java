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
/// ### accelerationStructureCount
/// [VarHandle][#VH_accelerationStructureCount] - [Getter][#accelerationStructureCount()] - [Setter][#accelerationStructureCount(int)]
/// ### pAccelerationStructures
/// [VarHandle][#VH_pAccelerationStructures] - [Getter][#pAccelerationStructures()] - [Setter][#pAccelerationStructures(MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkWriteDescriptorSetAccelerationStructureNV {
///     VkStructureType sType;
///     const void * pNext;
///     uint32_t accelerationStructureCount;
///     const VkAccelerationStructureNV * pAccelerationStructures;
/// } VkWriteDescriptorSetAccelerationStructureNV;
/// ```
public sealed class VkWriteDescriptorSetAccelerationStructureNV extends Struct {
    /// The struct layout of `VkWriteDescriptorSetAccelerationStructureNV`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("accelerationStructureCount"),
        ValueLayout.ADDRESS.withName("pAccelerationStructures")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `accelerationStructureCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_accelerationStructureCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("accelerationStructureCount"));
    /// The [VarHandle] of `pAccelerationStructures` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pAccelerationStructures = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pAccelerationStructures"));

    /// Creates `VkWriteDescriptorSetAccelerationStructureNV` with the given segment.
    /// @param segment the memory segment
    public VkWriteDescriptorSetAccelerationStructureNV(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkWriteDescriptorSetAccelerationStructureNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkWriteDescriptorSetAccelerationStructureNV of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkWriteDescriptorSetAccelerationStructureNV(segment); }

    /// Creates `VkWriteDescriptorSetAccelerationStructureNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkWriteDescriptorSetAccelerationStructureNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkWriteDescriptorSetAccelerationStructureNV ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkWriteDescriptorSetAccelerationStructureNV(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkWriteDescriptorSetAccelerationStructureNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkWriteDescriptorSetAccelerationStructureNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkWriteDescriptorSetAccelerationStructureNV`
    public static VkWriteDescriptorSetAccelerationStructureNV alloc(SegmentAllocator allocator) { return new VkWriteDescriptorSetAccelerationStructureNV(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkWriteDescriptorSetAccelerationStructureNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkWriteDescriptorSetAccelerationStructureNV`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkWriteDescriptorSetAccelerationStructureNV` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkWriteDescriptorSetAccelerationStructureNV`
    public static VkWriteDescriptorSetAccelerationStructureNV allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("const void *") MemorySegment pNext, @CType("uint32_t") int accelerationStructureCount, @CType("const VkAccelerationStructureNV *") MemorySegment pAccelerationStructures) { return alloc(allocator).sType(sType).pNext(pNext).accelerationStructureCount(accelerationStructureCount).pAccelerationStructures(pAccelerationStructures); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkWriteDescriptorSetAccelerationStructureNV copyFrom(VkWriteDescriptorSetAccelerationStructureNV src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkWriteDescriptorSetAccelerationStructureNV.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkWriteDescriptorSetAccelerationStructureNV.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkWriteDescriptorSetAccelerationStructureNV.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkWriteDescriptorSetAccelerationStructureNV sType(@CType("VkStructureType") int value) { VkWriteDescriptorSetAccelerationStructureNV.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") MemorySegment get_pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") MemorySegment get_pNext(MemorySegment segment) { return VkWriteDescriptorSetAccelerationStructureNV.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("const void *") MemorySegment pNext() { return VkWriteDescriptorSetAccelerationStructureNV.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") MemorySegment value) { VkWriteDescriptorSetAccelerationStructureNV.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkWriteDescriptorSetAccelerationStructureNV pNext(@CType("const void *") MemorySegment value) { VkWriteDescriptorSetAccelerationStructureNV.set_pNext(this.segment(), value); return this; }

    /// {@return `accelerationStructureCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_accelerationStructureCount(MemorySegment segment, long index) { return (int) VH_accelerationStructureCount.get(segment, 0L, index); }
    /// {@return `accelerationStructureCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_accelerationStructureCount(MemorySegment segment) { return VkWriteDescriptorSetAccelerationStructureNV.get_accelerationStructureCount(segment, 0L); }
    /// {@return `accelerationStructureCount`}
    public @CType("uint32_t") int accelerationStructureCount() { return VkWriteDescriptorSetAccelerationStructureNV.get_accelerationStructureCount(this.segment()); }
    /// Sets `accelerationStructureCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_accelerationStructureCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_accelerationStructureCount.set(segment, 0L, index, value); }
    /// Sets `accelerationStructureCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_accelerationStructureCount(MemorySegment segment, @CType("uint32_t") int value) { VkWriteDescriptorSetAccelerationStructureNV.set_accelerationStructureCount(segment, 0L, value); }
    /// Sets `accelerationStructureCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkWriteDescriptorSetAccelerationStructureNV accelerationStructureCount(@CType("uint32_t") int value) { VkWriteDescriptorSetAccelerationStructureNV.set_accelerationStructureCount(this.segment(), value); return this; }

    /// {@return `pAccelerationStructures` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const VkAccelerationStructureNV *") MemorySegment get_pAccelerationStructures(MemorySegment segment, long index) { return (MemorySegment) VH_pAccelerationStructures.get(segment, 0L, index); }
    /// {@return `pAccelerationStructures`}
    /// @param segment the segment of the struct
    public static @CType("const VkAccelerationStructureNV *") MemorySegment get_pAccelerationStructures(MemorySegment segment) { return VkWriteDescriptorSetAccelerationStructureNV.get_pAccelerationStructures(segment, 0L); }
    /// {@return `pAccelerationStructures`}
    public @CType("const VkAccelerationStructureNV *") MemorySegment pAccelerationStructures() { return VkWriteDescriptorSetAccelerationStructureNV.get_pAccelerationStructures(this.segment()); }
    /// Sets `pAccelerationStructures` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pAccelerationStructures(MemorySegment segment, long index, @CType("const VkAccelerationStructureNV *") MemorySegment value) { VH_pAccelerationStructures.set(segment, 0L, index, value); }
    /// Sets `pAccelerationStructures` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pAccelerationStructures(MemorySegment segment, @CType("const VkAccelerationStructureNV *") MemorySegment value) { VkWriteDescriptorSetAccelerationStructureNV.set_pAccelerationStructures(segment, 0L, value); }
    /// Sets `pAccelerationStructures` with the given value.
    /// @param value the value
    /// @return `this`
    public VkWriteDescriptorSetAccelerationStructureNV pAccelerationStructures(@CType("const VkAccelerationStructureNV *") MemorySegment value) { VkWriteDescriptorSetAccelerationStructureNV.set_pAccelerationStructures(this.segment(), value); return this; }

    /// A buffer of [VkWriteDescriptorSetAccelerationStructureNV].
    public static final class Buffer extends VkWriteDescriptorSetAccelerationStructureNV {
        private final long elementCount;

        /// Creates `VkWriteDescriptorSetAccelerationStructureNV.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkWriteDescriptorSetAccelerationStructureNV`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkWriteDescriptorSetAccelerationStructureNV`
        public VkWriteDescriptorSetAccelerationStructureNV asSlice(long index) { return new VkWriteDescriptorSetAccelerationStructureNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkWriteDescriptorSetAccelerationStructureNV`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkWriteDescriptorSetAccelerationStructureNV`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkWriteDescriptorSetAccelerationStructureNV.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkWriteDescriptorSetAccelerationStructureNV.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("const void *") MemorySegment pNextAt(long index) { return VkWriteDescriptorSetAccelerationStructureNV.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("const void *") MemorySegment value) { VkWriteDescriptorSetAccelerationStructureNV.set_pNext(this.segment(), index, value); return this; }

        /// {@return `accelerationStructureCount` at the given index}
        /// @param index the index
        public @CType("uint32_t") int accelerationStructureCountAt(long index) { return VkWriteDescriptorSetAccelerationStructureNV.get_accelerationStructureCount(this.segment(), index); }
        /// Sets `accelerationStructureCount` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer accelerationStructureCountAt(long index, @CType("uint32_t") int value) { VkWriteDescriptorSetAccelerationStructureNV.set_accelerationStructureCount(this.segment(), index, value); return this; }

        /// {@return `pAccelerationStructures` at the given index}
        /// @param index the index
        public @CType("const VkAccelerationStructureNV *") MemorySegment pAccelerationStructuresAt(long index) { return VkWriteDescriptorSetAccelerationStructureNV.get_pAccelerationStructures(this.segment(), index); }
        /// Sets `pAccelerationStructures` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pAccelerationStructuresAt(long index, @CType("const VkAccelerationStructureNV *") MemorySegment value) { VkWriteDescriptorSetAccelerationStructureNV.set_pAccelerationStructures(this.segment(), index, value); return this; }

    }
}
