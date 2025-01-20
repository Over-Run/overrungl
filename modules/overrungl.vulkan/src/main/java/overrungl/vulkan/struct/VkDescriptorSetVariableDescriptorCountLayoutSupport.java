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
/// [VarHandle][#VH_pNext] - [Getter][#pNext()] - [Setter][#pNext(MemorySegment)]
/// ### maxVariableDescriptorCount
/// [VarHandle][#VH_maxVariableDescriptorCount] - [Getter][#maxVariableDescriptorCount()] - [Setter][#maxVariableDescriptorCount(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkDescriptorSetVariableDescriptorCountLayoutSupport {
///     VkStructureType sType;
///     void * pNext;
///     uint32_t maxVariableDescriptorCount;
/// } VkDescriptorSetVariableDescriptorCountLayoutSupport;
/// ```
public sealed class VkDescriptorSetVariableDescriptorCountLayoutSupport extends Struct {
    /// The struct layout of `VkDescriptorSetVariableDescriptorCountLayoutSupport`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("maxVariableDescriptorCount")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `maxVariableDescriptorCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxVariableDescriptorCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxVariableDescriptorCount"));

    /// Creates `VkDescriptorSetVariableDescriptorCountLayoutSupport` with the given segment.
    /// @param segment the memory segment
    public VkDescriptorSetVariableDescriptorCountLayoutSupport(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkDescriptorSetVariableDescriptorCountLayoutSupport` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDescriptorSetVariableDescriptorCountLayoutSupport of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkDescriptorSetVariableDescriptorCountLayoutSupport(segment); }

    /// Creates `VkDescriptorSetVariableDescriptorCountLayoutSupport` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkDescriptorSetVariableDescriptorCountLayoutSupport` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDescriptorSetVariableDescriptorCountLayoutSupport ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkDescriptorSetVariableDescriptorCountLayoutSupport(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkDescriptorSetVariableDescriptorCountLayoutSupport` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkDescriptorSetVariableDescriptorCountLayoutSupport` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDescriptorSetVariableDescriptorCountLayoutSupport`
    public static VkDescriptorSetVariableDescriptorCountLayoutSupport alloc(SegmentAllocator allocator) { return new VkDescriptorSetVariableDescriptorCountLayoutSupport(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkDescriptorSetVariableDescriptorCountLayoutSupport` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkDescriptorSetVariableDescriptorCountLayoutSupport`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkDescriptorSetVariableDescriptorCountLayoutSupport` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDescriptorSetVariableDescriptorCountLayoutSupport`
    public static VkDescriptorSetVariableDescriptorCountLayoutSupport allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("void *") MemorySegment pNext, @CType("uint32_t") int maxVariableDescriptorCount) { return alloc(allocator).sType(sType).pNext(pNext).maxVariableDescriptorCount(maxVariableDescriptorCount); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkDescriptorSetVariableDescriptorCountLayoutSupport copyFrom(VkDescriptorSetVariableDescriptorCountLayoutSupport src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkDescriptorSetVariableDescriptorCountLayoutSupport.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkDescriptorSetVariableDescriptorCountLayoutSupport.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkDescriptorSetVariableDescriptorCountLayoutSupport.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDescriptorSetVariableDescriptorCountLayoutSupport sType(@CType("VkStructureType") int value) { VkDescriptorSetVariableDescriptorCountLayoutSupport.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") MemorySegment get_pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") MemorySegment get_pNext(MemorySegment segment) { return VkDescriptorSetVariableDescriptorCountLayoutSupport.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("void *") MemorySegment pNext() { return VkDescriptorSetVariableDescriptorCountLayoutSupport.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") MemorySegment value) { VkDescriptorSetVariableDescriptorCountLayoutSupport.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDescriptorSetVariableDescriptorCountLayoutSupport pNext(@CType("void *") MemorySegment value) { VkDescriptorSetVariableDescriptorCountLayoutSupport.set_pNext(this.segment(), value); return this; }

    /// {@return `maxVariableDescriptorCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxVariableDescriptorCount(MemorySegment segment, long index) { return (int) VH_maxVariableDescriptorCount.get(segment, 0L, index); }
    /// {@return `maxVariableDescriptorCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxVariableDescriptorCount(MemorySegment segment) { return VkDescriptorSetVariableDescriptorCountLayoutSupport.get_maxVariableDescriptorCount(segment, 0L); }
    /// {@return `maxVariableDescriptorCount`}
    public @CType("uint32_t") int maxVariableDescriptorCount() { return VkDescriptorSetVariableDescriptorCountLayoutSupport.get_maxVariableDescriptorCount(this.segment()); }
    /// Sets `maxVariableDescriptorCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxVariableDescriptorCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxVariableDescriptorCount.set(segment, 0L, index, value); }
    /// Sets `maxVariableDescriptorCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxVariableDescriptorCount(MemorySegment segment, @CType("uint32_t") int value) { VkDescriptorSetVariableDescriptorCountLayoutSupport.set_maxVariableDescriptorCount(segment, 0L, value); }
    /// Sets `maxVariableDescriptorCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDescriptorSetVariableDescriptorCountLayoutSupport maxVariableDescriptorCount(@CType("uint32_t") int value) { VkDescriptorSetVariableDescriptorCountLayoutSupport.set_maxVariableDescriptorCount(this.segment(), value); return this; }

    /// A buffer of [VkDescriptorSetVariableDescriptorCountLayoutSupport].
    public static final class Buffer extends VkDescriptorSetVariableDescriptorCountLayoutSupport {
        private final long elementCount;

        /// Creates `VkDescriptorSetVariableDescriptorCountLayoutSupport.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkDescriptorSetVariableDescriptorCountLayoutSupport`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkDescriptorSetVariableDescriptorCountLayoutSupport`
        public VkDescriptorSetVariableDescriptorCountLayoutSupport asSlice(long index) { return new VkDescriptorSetVariableDescriptorCountLayoutSupport(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkDescriptorSetVariableDescriptorCountLayoutSupport`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkDescriptorSetVariableDescriptorCountLayoutSupport`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkDescriptorSetVariableDescriptorCountLayoutSupport.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkDescriptorSetVariableDescriptorCountLayoutSupport.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("void *") MemorySegment pNextAt(long index) { return VkDescriptorSetVariableDescriptorCountLayoutSupport.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("void *") MemorySegment value) { VkDescriptorSetVariableDescriptorCountLayoutSupport.set_pNext(this.segment(), index, value); return this; }

        /// {@return `maxVariableDescriptorCount` at the given index}
        /// @param index the index
        public @CType("uint32_t") int maxVariableDescriptorCountAt(long index) { return VkDescriptorSetVariableDescriptorCountLayoutSupport.get_maxVariableDescriptorCount(this.segment(), index); }
        /// Sets `maxVariableDescriptorCount` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maxVariableDescriptorCountAt(long index, @CType("uint32_t") int value) { VkDescriptorSetVariableDescriptorCountLayoutSupport.set_maxVariableDescriptorCount(this.segment(), index, value); return this; }

    }
}
