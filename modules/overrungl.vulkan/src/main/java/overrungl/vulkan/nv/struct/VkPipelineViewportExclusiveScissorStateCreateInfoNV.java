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
/// ### exclusiveScissorCount
/// [VarHandle][#VH_exclusiveScissorCount] - [Getter][#exclusiveScissorCount()] - [Setter][#exclusiveScissorCount(int)]
/// ### pExclusiveScissors
/// [VarHandle][#VH_pExclusiveScissors] - [Getter][#pExclusiveScissors()] - [Setter][#pExclusiveScissors(MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPipelineViewportExclusiveScissorStateCreateInfoNV {
///     VkStructureType sType;
///     const void * pNext;
///     uint32_t exclusiveScissorCount;
///     const VkRect2D * pExclusiveScissors;
/// } VkPipelineViewportExclusiveScissorStateCreateInfoNV;
/// ```
public sealed class VkPipelineViewportExclusiveScissorStateCreateInfoNV extends Struct {
    /// The struct layout of `VkPipelineViewportExclusiveScissorStateCreateInfoNV`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("exclusiveScissorCount"),
        ValueLayout.ADDRESS.withName("pExclusiveScissors")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `exclusiveScissorCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_exclusiveScissorCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("exclusiveScissorCount"));
    /// The [VarHandle] of `pExclusiveScissors` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pExclusiveScissors = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pExclusiveScissors"));

    /// Creates `VkPipelineViewportExclusiveScissorStateCreateInfoNV` with the given segment.
    /// @param segment the memory segment
    public VkPipelineViewportExclusiveScissorStateCreateInfoNV(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPipelineViewportExclusiveScissorStateCreateInfoNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineViewportExclusiveScissorStateCreateInfoNV of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPipelineViewportExclusiveScissorStateCreateInfoNV(segment); }

    /// Creates `VkPipelineViewportExclusiveScissorStateCreateInfoNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPipelineViewportExclusiveScissorStateCreateInfoNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineViewportExclusiveScissorStateCreateInfoNV ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPipelineViewportExclusiveScissorStateCreateInfoNV(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPipelineViewportExclusiveScissorStateCreateInfoNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkPipelineViewportExclusiveScissorStateCreateInfoNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPipelineViewportExclusiveScissorStateCreateInfoNV`
    public static VkPipelineViewportExclusiveScissorStateCreateInfoNV alloc(SegmentAllocator allocator) { return new VkPipelineViewportExclusiveScissorStateCreateInfoNV(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPipelineViewportExclusiveScissorStateCreateInfoNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPipelineViewportExclusiveScissorStateCreateInfoNV`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkPipelineViewportExclusiveScissorStateCreateInfoNV` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPipelineViewportExclusiveScissorStateCreateInfoNV`
    public static VkPipelineViewportExclusiveScissorStateCreateInfoNV allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("const void *") MemorySegment pNext, @CType("uint32_t") int exclusiveScissorCount, @CType("const VkRect2D *") MemorySegment pExclusiveScissors) { return alloc(allocator).sType(sType).pNext(pNext).exclusiveScissorCount(exclusiveScissorCount).pExclusiveScissors(pExclusiveScissors); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPipelineViewportExclusiveScissorStateCreateInfoNV copyFrom(VkPipelineViewportExclusiveScissorStateCreateInfoNV src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPipelineViewportExclusiveScissorStateCreateInfoNV.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPipelineViewportExclusiveScissorStateCreateInfoNV.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPipelineViewportExclusiveScissorStateCreateInfoNV.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineViewportExclusiveScissorStateCreateInfoNV sType(@CType("VkStructureType") int value) { VkPipelineViewportExclusiveScissorStateCreateInfoNV.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") MemorySegment get_pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") MemorySegment get_pNext(MemorySegment segment) { return VkPipelineViewportExclusiveScissorStateCreateInfoNV.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("const void *") MemorySegment pNext() { return VkPipelineViewportExclusiveScissorStateCreateInfoNV.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") MemorySegment value) { VkPipelineViewportExclusiveScissorStateCreateInfoNV.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineViewportExclusiveScissorStateCreateInfoNV pNext(@CType("const void *") MemorySegment value) { VkPipelineViewportExclusiveScissorStateCreateInfoNV.set_pNext(this.segment(), value); return this; }

    /// {@return `exclusiveScissorCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_exclusiveScissorCount(MemorySegment segment, long index) { return (int) VH_exclusiveScissorCount.get(segment, 0L, index); }
    /// {@return `exclusiveScissorCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_exclusiveScissorCount(MemorySegment segment) { return VkPipelineViewportExclusiveScissorStateCreateInfoNV.get_exclusiveScissorCount(segment, 0L); }
    /// {@return `exclusiveScissorCount`}
    public @CType("uint32_t") int exclusiveScissorCount() { return VkPipelineViewportExclusiveScissorStateCreateInfoNV.get_exclusiveScissorCount(this.segment()); }
    /// Sets `exclusiveScissorCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_exclusiveScissorCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_exclusiveScissorCount.set(segment, 0L, index, value); }
    /// Sets `exclusiveScissorCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_exclusiveScissorCount(MemorySegment segment, @CType("uint32_t") int value) { VkPipelineViewportExclusiveScissorStateCreateInfoNV.set_exclusiveScissorCount(segment, 0L, value); }
    /// Sets `exclusiveScissorCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineViewportExclusiveScissorStateCreateInfoNV exclusiveScissorCount(@CType("uint32_t") int value) { VkPipelineViewportExclusiveScissorStateCreateInfoNV.set_exclusiveScissorCount(this.segment(), value); return this; }

    /// {@return `pExclusiveScissors` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const VkRect2D *") MemorySegment get_pExclusiveScissors(MemorySegment segment, long index) { return (MemorySegment) VH_pExclusiveScissors.get(segment, 0L, index); }
    /// {@return `pExclusiveScissors`}
    /// @param segment the segment of the struct
    public static @CType("const VkRect2D *") MemorySegment get_pExclusiveScissors(MemorySegment segment) { return VkPipelineViewportExclusiveScissorStateCreateInfoNV.get_pExclusiveScissors(segment, 0L); }
    /// {@return `pExclusiveScissors`}
    public @CType("const VkRect2D *") MemorySegment pExclusiveScissors() { return VkPipelineViewportExclusiveScissorStateCreateInfoNV.get_pExclusiveScissors(this.segment()); }
    /// Sets `pExclusiveScissors` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pExclusiveScissors(MemorySegment segment, long index, @CType("const VkRect2D *") MemorySegment value) { VH_pExclusiveScissors.set(segment, 0L, index, value); }
    /// Sets `pExclusiveScissors` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pExclusiveScissors(MemorySegment segment, @CType("const VkRect2D *") MemorySegment value) { VkPipelineViewportExclusiveScissorStateCreateInfoNV.set_pExclusiveScissors(segment, 0L, value); }
    /// Sets `pExclusiveScissors` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineViewportExclusiveScissorStateCreateInfoNV pExclusiveScissors(@CType("const VkRect2D *") MemorySegment value) { VkPipelineViewportExclusiveScissorStateCreateInfoNV.set_pExclusiveScissors(this.segment(), value); return this; }

    /// A buffer of [VkPipelineViewportExclusiveScissorStateCreateInfoNV].
    public static final class Buffer extends VkPipelineViewportExclusiveScissorStateCreateInfoNV {
        private final long elementCount;

        /// Creates `VkPipelineViewportExclusiveScissorStateCreateInfoNV.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkPipelineViewportExclusiveScissorStateCreateInfoNV`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkPipelineViewportExclusiveScissorStateCreateInfoNV`
        public VkPipelineViewportExclusiveScissorStateCreateInfoNV asSlice(long index) { return new VkPipelineViewportExclusiveScissorStateCreateInfoNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkPipelineViewportExclusiveScissorStateCreateInfoNV`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkPipelineViewportExclusiveScissorStateCreateInfoNV`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkPipelineViewportExclusiveScissorStateCreateInfoNV.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkPipelineViewportExclusiveScissorStateCreateInfoNV.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("const void *") MemorySegment pNextAt(long index) { return VkPipelineViewportExclusiveScissorStateCreateInfoNV.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("const void *") MemorySegment value) { VkPipelineViewportExclusiveScissorStateCreateInfoNV.set_pNext(this.segment(), index, value); return this; }

        /// {@return `exclusiveScissorCount` at the given index}
        /// @param index the index
        public @CType("uint32_t") int exclusiveScissorCountAt(long index) { return VkPipelineViewportExclusiveScissorStateCreateInfoNV.get_exclusiveScissorCount(this.segment(), index); }
        /// Sets `exclusiveScissorCount` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer exclusiveScissorCountAt(long index, @CType("uint32_t") int value) { VkPipelineViewportExclusiveScissorStateCreateInfoNV.set_exclusiveScissorCount(this.segment(), index, value); return this; }

        /// {@return `pExclusiveScissors` at the given index}
        /// @param index the index
        public @CType("const VkRect2D *") MemorySegment pExclusiveScissorsAt(long index) { return VkPipelineViewportExclusiveScissorStateCreateInfoNV.get_pExclusiveScissors(this.segment(), index); }
        /// Sets `pExclusiveScissors` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pExclusiveScissorsAt(long index, @CType("const VkRect2D *") MemorySegment value) { VkPipelineViewportExclusiveScissorStateCreateInfoNV.set_pExclusiveScissors(this.segment(), index, value); return this; }

    }
}
