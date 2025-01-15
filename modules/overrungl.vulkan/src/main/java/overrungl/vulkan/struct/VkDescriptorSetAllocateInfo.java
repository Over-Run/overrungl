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
/// ### descriptorPool
/// [VarHandle][#VH_descriptorPool] - [Getter][#descriptorPool()] - [Setter][#descriptorPool(java.lang.foreign.MemorySegment)]
/// ### descriptorSetCount
/// [VarHandle][#VH_descriptorSetCount] - [Getter][#descriptorSetCount()] - [Setter][#descriptorSetCount(int)]
/// ### pSetLayouts
/// [VarHandle][#VH_pSetLayouts] - [Getter][#pSetLayouts()] - [Setter][#pSetLayouts(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkDescriptorSetAllocateInfo {
///     VkStructureType sType;
///     const void * pNext;
///     VkDescriptorPool descriptorPool;
///     uint32_t descriptorSetCount;
///     const VkDescriptorSetLayout * pSetLayouts;
/// } VkDescriptorSetAllocateInfo;
/// ```
public sealed class VkDescriptorSetAllocateInfo extends Struct {
    /// The struct layout of `VkDescriptorSetAllocateInfo`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("descriptorPool"),
        ValueLayout.JAVA_INT.withName("descriptorSetCount"),
        ValueLayout.ADDRESS.withName("pSetLayouts")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `descriptorPool` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_descriptorPool = LAYOUT.arrayElementVarHandle(PathElement.groupElement("descriptorPool"));
    /// The [VarHandle] of `descriptorSetCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_descriptorSetCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("descriptorSetCount"));
    /// The [VarHandle] of `pSetLayouts` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pSetLayouts = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pSetLayouts"));

    /// Creates `VkDescriptorSetAllocateInfo` with the given segment.
    /// @param segment the memory segment
    public VkDescriptorSetAllocateInfo(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkDescriptorSetAllocateInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDescriptorSetAllocateInfo of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkDescriptorSetAllocateInfo(segment); }

    /// Creates `VkDescriptorSetAllocateInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkDescriptorSetAllocateInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDescriptorSetAllocateInfo ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkDescriptorSetAllocateInfo(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkDescriptorSetAllocateInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkDescriptorSetAllocateInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDescriptorSetAllocateInfo`
    public static VkDescriptorSetAllocateInfo alloc(SegmentAllocator allocator) { return new VkDescriptorSetAllocateInfo(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkDescriptorSetAllocateInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkDescriptorSetAllocateInfo`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkDescriptorSetAllocateInfo` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDescriptorSetAllocateInfo`
    public static VkDescriptorSetAllocateInfo allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("const void *") java.lang.foreign.MemorySegment pNext, @CType("VkDescriptorPool") java.lang.foreign.MemorySegment descriptorPool, @CType("uint32_t") int descriptorSetCount, @CType("const VkDescriptorSetLayout *") java.lang.foreign.MemorySegment pSetLayouts) { return alloc(allocator).sType(sType).pNext(pNext).descriptorPool(descriptorPool).descriptorSetCount(descriptorSetCount).pSetLayouts(pSetLayouts); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkDescriptorSetAllocateInfo copyFrom(VkDescriptorSetAllocateInfo src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkDescriptorSetAllocateInfo.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkDescriptorSetAllocateInfo.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkDescriptorSetAllocateInfo.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDescriptorSetAllocateInfo sType(@CType("VkStructureType") int value) { VkDescriptorSetAllocateInfo.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkDescriptorSetAllocateInfo.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkDescriptorSetAllocateInfo.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkDescriptorSetAllocateInfo.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDescriptorSetAllocateInfo pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkDescriptorSetAllocateInfo.set_pNext(this.segment(), value); return this; }

    /// {@return `descriptorPool` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDescriptorPool") java.lang.foreign.MemorySegment get_descriptorPool(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_descriptorPool.get(segment, 0L, index); }
    /// {@return `descriptorPool`}
    /// @param segment the segment of the struct
    public static @CType("VkDescriptorPool") java.lang.foreign.MemorySegment get_descriptorPool(MemorySegment segment) { return VkDescriptorSetAllocateInfo.get_descriptorPool(segment, 0L); }
    /// {@return `descriptorPool`}
    public @CType("VkDescriptorPool") java.lang.foreign.MemorySegment descriptorPool() { return VkDescriptorSetAllocateInfo.get_descriptorPool(this.segment()); }
    /// Sets `descriptorPool` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_descriptorPool(MemorySegment segment, long index, @CType("VkDescriptorPool") java.lang.foreign.MemorySegment value) { VH_descriptorPool.set(segment, 0L, index, value); }
    /// Sets `descriptorPool` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_descriptorPool(MemorySegment segment, @CType("VkDescriptorPool") java.lang.foreign.MemorySegment value) { VkDescriptorSetAllocateInfo.set_descriptorPool(segment, 0L, value); }
    /// Sets `descriptorPool` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDescriptorSetAllocateInfo descriptorPool(@CType("VkDescriptorPool") java.lang.foreign.MemorySegment value) { VkDescriptorSetAllocateInfo.set_descriptorPool(this.segment(), value); return this; }

    /// {@return `descriptorSetCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_descriptorSetCount(MemorySegment segment, long index) { return (int) VH_descriptorSetCount.get(segment, 0L, index); }
    /// {@return `descriptorSetCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_descriptorSetCount(MemorySegment segment) { return VkDescriptorSetAllocateInfo.get_descriptorSetCount(segment, 0L); }
    /// {@return `descriptorSetCount`}
    public @CType("uint32_t") int descriptorSetCount() { return VkDescriptorSetAllocateInfo.get_descriptorSetCount(this.segment()); }
    /// Sets `descriptorSetCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_descriptorSetCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_descriptorSetCount.set(segment, 0L, index, value); }
    /// Sets `descriptorSetCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_descriptorSetCount(MemorySegment segment, @CType("uint32_t") int value) { VkDescriptorSetAllocateInfo.set_descriptorSetCount(segment, 0L, value); }
    /// Sets `descriptorSetCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDescriptorSetAllocateInfo descriptorSetCount(@CType("uint32_t") int value) { VkDescriptorSetAllocateInfo.set_descriptorSetCount(this.segment(), value); return this; }

    /// {@return `pSetLayouts` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const VkDescriptorSetLayout *") java.lang.foreign.MemorySegment get_pSetLayouts(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pSetLayouts.get(segment, 0L, index); }
    /// {@return `pSetLayouts`}
    /// @param segment the segment of the struct
    public static @CType("const VkDescriptorSetLayout *") java.lang.foreign.MemorySegment get_pSetLayouts(MemorySegment segment) { return VkDescriptorSetAllocateInfo.get_pSetLayouts(segment, 0L); }
    /// {@return `pSetLayouts`}
    public @CType("const VkDescriptorSetLayout *") java.lang.foreign.MemorySegment pSetLayouts() { return VkDescriptorSetAllocateInfo.get_pSetLayouts(this.segment()); }
    /// Sets `pSetLayouts` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pSetLayouts(MemorySegment segment, long index, @CType("const VkDescriptorSetLayout *") java.lang.foreign.MemorySegment value) { VH_pSetLayouts.set(segment, 0L, index, value); }
    /// Sets `pSetLayouts` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pSetLayouts(MemorySegment segment, @CType("const VkDescriptorSetLayout *") java.lang.foreign.MemorySegment value) { VkDescriptorSetAllocateInfo.set_pSetLayouts(segment, 0L, value); }
    /// Sets `pSetLayouts` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDescriptorSetAllocateInfo pSetLayouts(@CType("const VkDescriptorSetLayout *") java.lang.foreign.MemorySegment value) { VkDescriptorSetAllocateInfo.set_pSetLayouts(this.segment(), value); return this; }

    /// A buffer of [VkDescriptorSetAllocateInfo].
    public static final class Buffer extends VkDescriptorSetAllocateInfo {
        private final long elementCount;

        /// Creates `VkDescriptorSetAllocateInfo.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkDescriptorSetAllocateInfo`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkDescriptorSetAllocateInfo`
        public VkDescriptorSetAllocateInfo asSlice(long index) { return new VkDescriptorSetAllocateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkDescriptorSetAllocateInfo`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkDescriptorSetAllocateInfo`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkDescriptorSetAllocateInfo.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkDescriptorSetAllocateInfo.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkDescriptorSetAllocateInfo.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkDescriptorSetAllocateInfo.set_pNext(this.segment(), index, value); return this; }

        /// {@return `descriptorPool` at the given index}
        /// @param index the index
        public @CType("VkDescriptorPool") java.lang.foreign.MemorySegment descriptorPoolAt(long index) { return VkDescriptorSetAllocateInfo.get_descriptorPool(this.segment(), index); }
        /// Sets `descriptorPool` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer descriptorPoolAt(long index, @CType("VkDescriptorPool") java.lang.foreign.MemorySegment value) { VkDescriptorSetAllocateInfo.set_descriptorPool(this.segment(), index, value); return this; }

        /// {@return `descriptorSetCount` at the given index}
        /// @param index the index
        public @CType("uint32_t") int descriptorSetCountAt(long index) { return VkDescriptorSetAllocateInfo.get_descriptorSetCount(this.segment(), index); }
        /// Sets `descriptorSetCount` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer descriptorSetCountAt(long index, @CType("uint32_t") int value) { VkDescriptorSetAllocateInfo.set_descriptorSetCount(this.segment(), index, value); return this; }

        /// {@return `pSetLayouts` at the given index}
        /// @param index the index
        public @CType("const VkDescriptorSetLayout *") java.lang.foreign.MemorySegment pSetLayoutsAt(long index) { return VkDescriptorSetAllocateInfo.get_pSetLayouts(this.segment(), index); }
        /// Sets `pSetLayouts` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pSetLayoutsAt(long index, @CType("const VkDescriptorSetLayout *") java.lang.foreign.MemorySegment value) { VkDescriptorSetAllocateInfo.set_pSetLayouts(this.segment(), index, value); return this; }

    }
}
