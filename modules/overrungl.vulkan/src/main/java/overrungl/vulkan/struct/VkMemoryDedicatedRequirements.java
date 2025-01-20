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
/// ### prefersDedicatedAllocation
/// [VarHandle][#VH_prefersDedicatedAllocation] - [Getter][#prefersDedicatedAllocation()] - [Setter][#prefersDedicatedAllocation(int)]
/// ### requiresDedicatedAllocation
/// [VarHandle][#VH_requiresDedicatedAllocation] - [Getter][#requiresDedicatedAllocation()] - [Setter][#requiresDedicatedAllocation(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkMemoryDedicatedRequirements {
///     VkStructureType sType;
///     void * pNext;
///     VkBool32 prefersDedicatedAllocation;
///     VkBool32 requiresDedicatedAllocation;
/// } VkMemoryDedicatedRequirements;
/// ```
public sealed class VkMemoryDedicatedRequirements extends Struct {
    /// The struct layout of `VkMemoryDedicatedRequirements`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("prefersDedicatedAllocation"),
        ValueLayout.JAVA_INT.withName("requiresDedicatedAllocation")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `prefersDedicatedAllocation` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_prefersDedicatedAllocation = LAYOUT.arrayElementVarHandle(PathElement.groupElement("prefersDedicatedAllocation"));
    /// The [VarHandle] of `requiresDedicatedAllocation` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_requiresDedicatedAllocation = LAYOUT.arrayElementVarHandle(PathElement.groupElement("requiresDedicatedAllocation"));

    /// Creates `VkMemoryDedicatedRequirements` with the given segment.
    /// @param segment the memory segment
    public VkMemoryDedicatedRequirements(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkMemoryDedicatedRequirements` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkMemoryDedicatedRequirements of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkMemoryDedicatedRequirements(segment); }

    /// Creates `VkMemoryDedicatedRequirements` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkMemoryDedicatedRequirements` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkMemoryDedicatedRequirements ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkMemoryDedicatedRequirements(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkMemoryDedicatedRequirements` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkMemoryDedicatedRequirements` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkMemoryDedicatedRequirements`
    public static VkMemoryDedicatedRequirements alloc(SegmentAllocator allocator) { return new VkMemoryDedicatedRequirements(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkMemoryDedicatedRequirements` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkMemoryDedicatedRequirements`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkMemoryDedicatedRequirements` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkMemoryDedicatedRequirements`
    public static VkMemoryDedicatedRequirements allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("void *") MemorySegment pNext, @CType("VkBool32") int prefersDedicatedAllocation, @CType("VkBool32") int requiresDedicatedAllocation) { return alloc(allocator).sType(sType).pNext(pNext).prefersDedicatedAllocation(prefersDedicatedAllocation).requiresDedicatedAllocation(requiresDedicatedAllocation); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkMemoryDedicatedRequirements copyFrom(VkMemoryDedicatedRequirements src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkMemoryDedicatedRequirements.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkMemoryDedicatedRequirements.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkMemoryDedicatedRequirements.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkMemoryDedicatedRequirements sType(@CType("VkStructureType") int value) { VkMemoryDedicatedRequirements.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") MemorySegment get_pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") MemorySegment get_pNext(MemorySegment segment) { return VkMemoryDedicatedRequirements.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("void *") MemorySegment pNext() { return VkMemoryDedicatedRequirements.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") MemorySegment value) { VkMemoryDedicatedRequirements.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkMemoryDedicatedRequirements pNext(@CType("void *") MemorySegment value) { VkMemoryDedicatedRequirements.set_pNext(this.segment(), value); return this; }

    /// {@return `prefersDedicatedAllocation` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_prefersDedicatedAllocation(MemorySegment segment, long index) { return (int) VH_prefersDedicatedAllocation.get(segment, 0L, index); }
    /// {@return `prefersDedicatedAllocation`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_prefersDedicatedAllocation(MemorySegment segment) { return VkMemoryDedicatedRequirements.get_prefersDedicatedAllocation(segment, 0L); }
    /// {@return `prefersDedicatedAllocation`}
    public @CType("VkBool32") int prefersDedicatedAllocation() { return VkMemoryDedicatedRequirements.get_prefersDedicatedAllocation(this.segment()); }
    /// Sets `prefersDedicatedAllocation` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_prefersDedicatedAllocation(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_prefersDedicatedAllocation.set(segment, 0L, index, value); }
    /// Sets `prefersDedicatedAllocation` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_prefersDedicatedAllocation(MemorySegment segment, @CType("VkBool32") int value) { VkMemoryDedicatedRequirements.set_prefersDedicatedAllocation(segment, 0L, value); }
    /// Sets `prefersDedicatedAllocation` with the given value.
    /// @param value the value
    /// @return `this`
    public VkMemoryDedicatedRequirements prefersDedicatedAllocation(@CType("VkBool32") int value) { VkMemoryDedicatedRequirements.set_prefersDedicatedAllocation(this.segment(), value); return this; }

    /// {@return `requiresDedicatedAllocation` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_requiresDedicatedAllocation(MemorySegment segment, long index) { return (int) VH_requiresDedicatedAllocation.get(segment, 0L, index); }
    /// {@return `requiresDedicatedAllocation`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_requiresDedicatedAllocation(MemorySegment segment) { return VkMemoryDedicatedRequirements.get_requiresDedicatedAllocation(segment, 0L); }
    /// {@return `requiresDedicatedAllocation`}
    public @CType("VkBool32") int requiresDedicatedAllocation() { return VkMemoryDedicatedRequirements.get_requiresDedicatedAllocation(this.segment()); }
    /// Sets `requiresDedicatedAllocation` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_requiresDedicatedAllocation(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_requiresDedicatedAllocation.set(segment, 0L, index, value); }
    /// Sets `requiresDedicatedAllocation` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_requiresDedicatedAllocation(MemorySegment segment, @CType("VkBool32") int value) { VkMemoryDedicatedRequirements.set_requiresDedicatedAllocation(segment, 0L, value); }
    /// Sets `requiresDedicatedAllocation` with the given value.
    /// @param value the value
    /// @return `this`
    public VkMemoryDedicatedRequirements requiresDedicatedAllocation(@CType("VkBool32") int value) { VkMemoryDedicatedRequirements.set_requiresDedicatedAllocation(this.segment(), value); return this; }

    /// A buffer of [VkMemoryDedicatedRequirements].
    public static final class Buffer extends VkMemoryDedicatedRequirements {
        private final long elementCount;

        /// Creates `VkMemoryDedicatedRequirements.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkMemoryDedicatedRequirements`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkMemoryDedicatedRequirements`
        public VkMemoryDedicatedRequirements asSlice(long index) { return new VkMemoryDedicatedRequirements(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkMemoryDedicatedRequirements`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkMemoryDedicatedRequirements`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkMemoryDedicatedRequirements.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkMemoryDedicatedRequirements.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("void *") MemorySegment pNextAt(long index) { return VkMemoryDedicatedRequirements.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("void *") MemorySegment value) { VkMemoryDedicatedRequirements.set_pNext(this.segment(), index, value); return this; }

        /// {@return `prefersDedicatedAllocation` at the given index}
        /// @param index the index
        public @CType("VkBool32") int prefersDedicatedAllocationAt(long index) { return VkMemoryDedicatedRequirements.get_prefersDedicatedAllocation(this.segment(), index); }
        /// Sets `prefersDedicatedAllocation` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer prefersDedicatedAllocationAt(long index, @CType("VkBool32") int value) { VkMemoryDedicatedRequirements.set_prefersDedicatedAllocation(this.segment(), index, value); return this; }

        /// {@return `requiresDedicatedAllocation` at the given index}
        /// @param index the index
        public @CType("VkBool32") int requiresDedicatedAllocationAt(long index) { return VkMemoryDedicatedRequirements.get_requiresDedicatedAllocation(this.segment(), index); }
        /// Sets `requiresDedicatedAllocation` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer requiresDedicatedAllocationAt(long index, @CType("VkBool32") int value) { VkMemoryDedicatedRequirements.set_requiresDedicatedAllocation(this.segment(), index, value); return this; }

    }
}
