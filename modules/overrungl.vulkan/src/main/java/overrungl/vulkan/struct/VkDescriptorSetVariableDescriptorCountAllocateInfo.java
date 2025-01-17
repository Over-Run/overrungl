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
package overrungl.vulkan.struct;

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
/// ### descriptorSetCount
/// [VarHandle][#VH_descriptorSetCount] - [Getter][#descriptorSetCount()] - [Setter][#descriptorSetCount(int)]
/// ### pDescriptorCounts
/// [VarHandle][#VH_pDescriptorCounts] - [Getter][#pDescriptorCounts()] - [Setter][#pDescriptorCounts(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkDescriptorSetVariableDescriptorCountAllocateInfo {
///     VkStructureType sType;
///     const void * pNext;
///     uint32_t descriptorSetCount;
///     const uint32_t * pDescriptorCounts;
/// } VkDescriptorSetVariableDescriptorCountAllocateInfo;
/// ```
public sealed class VkDescriptorSetVariableDescriptorCountAllocateInfo extends Struct {
    /// The struct layout of `VkDescriptorSetVariableDescriptorCountAllocateInfo`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("descriptorSetCount"),
        ValueLayout.ADDRESS.withName("pDescriptorCounts")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `descriptorSetCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_descriptorSetCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("descriptorSetCount"));
    /// The [VarHandle] of `pDescriptorCounts` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pDescriptorCounts = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pDescriptorCounts"));

    /// Creates `VkDescriptorSetVariableDescriptorCountAllocateInfo` with the given segment.
    /// @param segment the memory segment
    public VkDescriptorSetVariableDescriptorCountAllocateInfo(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkDescriptorSetVariableDescriptorCountAllocateInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDescriptorSetVariableDescriptorCountAllocateInfo of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkDescriptorSetVariableDescriptorCountAllocateInfo(segment); }

    /// Creates `VkDescriptorSetVariableDescriptorCountAllocateInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkDescriptorSetVariableDescriptorCountAllocateInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDescriptorSetVariableDescriptorCountAllocateInfo ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkDescriptorSetVariableDescriptorCountAllocateInfo(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkDescriptorSetVariableDescriptorCountAllocateInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkDescriptorSetVariableDescriptorCountAllocateInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDescriptorSetVariableDescriptorCountAllocateInfo`
    public static VkDescriptorSetVariableDescriptorCountAllocateInfo alloc(SegmentAllocator allocator) { return new VkDescriptorSetVariableDescriptorCountAllocateInfo(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkDescriptorSetVariableDescriptorCountAllocateInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkDescriptorSetVariableDescriptorCountAllocateInfo`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkDescriptorSetVariableDescriptorCountAllocateInfo` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDescriptorSetVariableDescriptorCountAllocateInfo`
    public static VkDescriptorSetVariableDescriptorCountAllocateInfo allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("const void *") java.lang.foreign.MemorySegment pNext, @CType("uint32_t") int descriptorSetCount, @CType("const uint32_t *") java.lang.foreign.MemorySegment pDescriptorCounts) { return alloc(allocator).sType(sType).pNext(pNext).descriptorSetCount(descriptorSetCount).pDescriptorCounts(pDescriptorCounts); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkDescriptorSetVariableDescriptorCountAllocateInfo copyFrom(VkDescriptorSetVariableDescriptorCountAllocateInfo src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkDescriptorSetVariableDescriptorCountAllocateInfo.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkDescriptorSetVariableDescriptorCountAllocateInfo.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkDescriptorSetVariableDescriptorCountAllocateInfo.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDescriptorSetVariableDescriptorCountAllocateInfo sType(@CType("VkStructureType") int value) { VkDescriptorSetVariableDescriptorCountAllocateInfo.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkDescriptorSetVariableDescriptorCountAllocateInfo.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkDescriptorSetVariableDescriptorCountAllocateInfo.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkDescriptorSetVariableDescriptorCountAllocateInfo.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDescriptorSetVariableDescriptorCountAllocateInfo pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkDescriptorSetVariableDescriptorCountAllocateInfo.set_pNext(this.segment(), value); return this; }

    /// {@return `descriptorSetCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_descriptorSetCount(MemorySegment segment, long index) { return (int) VH_descriptorSetCount.get(segment, 0L, index); }
    /// {@return `descriptorSetCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_descriptorSetCount(MemorySegment segment) { return VkDescriptorSetVariableDescriptorCountAllocateInfo.get_descriptorSetCount(segment, 0L); }
    /// {@return `descriptorSetCount`}
    public @CType("uint32_t") int descriptorSetCount() { return VkDescriptorSetVariableDescriptorCountAllocateInfo.get_descriptorSetCount(this.segment()); }
    /// Sets `descriptorSetCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_descriptorSetCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_descriptorSetCount.set(segment, 0L, index, value); }
    /// Sets `descriptorSetCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_descriptorSetCount(MemorySegment segment, @CType("uint32_t") int value) { VkDescriptorSetVariableDescriptorCountAllocateInfo.set_descriptorSetCount(segment, 0L, value); }
    /// Sets `descriptorSetCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDescriptorSetVariableDescriptorCountAllocateInfo descriptorSetCount(@CType("uint32_t") int value) { VkDescriptorSetVariableDescriptorCountAllocateInfo.set_descriptorSetCount(this.segment(), value); return this; }

    /// {@return `pDescriptorCounts` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const uint32_t *") java.lang.foreign.MemorySegment get_pDescriptorCounts(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pDescriptorCounts.get(segment, 0L, index); }
    /// {@return `pDescriptorCounts`}
    /// @param segment the segment of the struct
    public static @CType("const uint32_t *") java.lang.foreign.MemorySegment get_pDescriptorCounts(MemorySegment segment) { return VkDescriptorSetVariableDescriptorCountAllocateInfo.get_pDescriptorCounts(segment, 0L); }
    /// {@return `pDescriptorCounts`}
    public @CType("const uint32_t *") java.lang.foreign.MemorySegment pDescriptorCounts() { return VkDescriptorSetVariableDescriptorCountAllocateInfo.get_pDescriptorCounts(this.segment()); }
    /// Sets `pDescriptorCounts` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pDescriptorCounts(MemorySegment segment, long index, @CType("const uint32_t *") java.lang.foreign.MemorySegment value) { VH_pDescriptorCounts.set(segment, 0L, index, value); }
    /// Sets `pDescriptorCounts` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pDescriptorCounts(MemorySegment segment, @CType("const uint32_t *") java.lang.foreign.MemorySegment value) { VkDescriptorSetVariableDescriptorCountAllocateInfo.set_pDescriptorCounts(segment, 0L, value); }
    /// Sets `pDescriptorCounts` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDescriptorSetVariableDescriptorCountAllocateInfo pDescriptorCounts(@CType("const uint32_t *") java.lang.foreign.MemorySegment value) { VkDescriptorSetVariableDescriptorCountAllocateInfo.set_pDescriptorCounts(this.segment(), value); return this; }

    /// A buffer of [VkDescriptorSetVariableDescriptorCountAllocateInfo].
    public static final class Buffer extends VkDescriptorSetVariableDescriptorCountAllocateInfo {
        private final long elementCount;

        /// Creates `VkDescriptorSetVariableDescriptorCountAllocateInfo.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkDescriptorSetVariableDescriptorCountAllocateInfo`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkDescriptorSetVariableDescriptorCountAllocateInfo`
        public VkDescriptorSetVariableDescriptorCountAllocateInfo asSlice(long index) { return new VkDescriptorSetVariableDescriptorCountAllocateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkDescriptorSetVariableDescriptorCountAllocateInfo`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkDescriptorSetVariableDescriptorCountAllocateInfo`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkDescriptorSetVariableDescriptorCountAllocateInfo.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkDescriptorSetVariableDescriptorCountAllocateInfo.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkDescriptorSetVariableDescriptorCountAllocateInfo.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkDescriptorSetVariableDescriptorCountAllocateInfo.set_pNext(this.segment(), index, value); return this; }

        /// {@return `descriptorSetCount` at the given index}
        /// @param index the index
        public @CType("uint32_t") int descriptorSetCountAt(long index) { return VkDescriptorSetVariableDescriptorCountAllocateInfo.get_descriptorSetCount(this.segment(), index); }
        /// Sets `descriptorSetCount` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer descriptorSetCountAt(long index, @CType("uint32_t") int value) { VkDescriptorSetVariableDescriptorCountAllocateInfo.set_descriptorSetCount(this.segment(), index, value); return this; }

        /// {@return `pDescriptorCounts` at the given index}
        /// @param index the index
        public @CType("const uint32_t *") java.lang.foreign.MemorySegment pDescriptorCountsAt(long index) { return VkDescriptorSetVariableDescriptorCountAllocateInfo.get_pDescriptorCounts(this.segment(), index); }
        /// Sets `pDescriptorCounts` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pDescriptorCountsAt(long index, @CType("const uint32_t *") java.lang.foreign.MemorySegment value) { VkDescriptorSetVariableDescriptorCountAllocateInfo.set_pDescriptorCounts(this.segment(), index, value); return this; }

    }
}
