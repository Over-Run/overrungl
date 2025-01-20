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
package overrungl.vulkan.mesa.struct;

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
/// ### maximumRequestedAlignment
/// [VarHandle][#VH_maximumRequestedAlignment] - [Getter][#maximumRequestedAlignment()] - [Setter][#maximumRequestedAlignment(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkImageAlignmentControlCreateInfoMESA {
///     VkStructureType sType;
///     const void * pNext;
///     uint32_t maximumRequestedAlignment;
/// } VkImageAlignmentControlCreateInfoMESA;
/// ```
public sealed class VkImageAlignmentControlCreateInfoMESA extends Struct {
    /// The struct layout of `VkImageAlignmentControlCreateInfoMESA`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("maximumRequestedAlignment")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `maximumRequestedAlignment` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maximumRequestedAlignment = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maximumRequestedAlignment"));

    /// Creates `VkImageAlignmentControlCreateInfoMESA` with the given segment.
    /// @param segment the memory segment
    public VkImageAlignmentControlCreateInfoMESA(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkImageAlignmentControlCreateInfoMESA` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkImageAlignmentControlCreateInfoMESA of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkImageAlignmentControlCreateInfoMESA(segment); }

    /// Creates `VkImageAlignmentControlCreateInfoMESA` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkImageAlignmentControlCreateInfoMESA` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkImageAlignmentControlCreateInfoMESA ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkImageAlignmentControlCreateInfoMESA(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkImageAlignmentControlCreateInfoMESA` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkImageAlignmentControlCreateInfoMESA` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkImageAlignmentControlCreateInfoMESA`
    public static VkImageAlignmentControlCreateInfoMESA alloc(SegmentAllocator allocator) { return new VkImageAlignmentControlCreateInfoMESA(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkImageAlignmentControlCreateInfoMESA` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkImageAlignmentControlCreateInfoMESA`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkImageAlignmentControlCreateInfoMESA` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkImageAlignmentControlCreateInfoMESA`
    public static VkImageAlignmentControlCreateInfoMESA allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("const void *") MemorySegment pNext, @CType("uint32_t") int maximumRequestedAlignment) { return alloc(allocator).sType(sType).pNext(pNext).maximumRequestedAlignment(maximumRequestedAlignment); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkImageAlignmentControlCreateInfoMESA copyFrom(VkImageAlignmentControlCreateInfoMESA src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkImageAlignmentControlCreateInfoMESA.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkImageAlignmentControlCreateInfoMESA.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkImageAlignmentControlCreateInfoMESA.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageAlignmentControlCreateInfoMESA sType(@CType("VkStructureType") int value) { VkImageAlignmentControlCreateInfoMESA.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") MemorySegment get_pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") MemorySegment get_pNext(MemorySegment segment) { return VkImageAlignmentControlCreateInfoMESA.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("const void *") MemorySegment pNext() { return VkImageAlignmentControlCreateInfoMESA.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") MemorySegment value) { VkImageAlignmentControlCreateInfoMESA.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageAlignmentControlCreateInfoMESA pNext(@CType("const void *") MemorySegment value) { VkImageAlignmentControlCreateInfoMESA.set_pNext(this.segment(), value); return this; }

    /// {@return `maximumRequestedAlignment` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maximumRequestedAlignment(MemorySegment segment, long index) { return (int) VH_maximumRequestedAlignment.get(segment, 0L, index); }
    /// {@return `maximumRequestedAlignment`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maximumRequestedAlignment(MemorySegment segment) { return VkImageAlignmentControlCreateInfoMESA.get_maximumRequestedAlignment(segment, 0L); }
    /// {@return `maximumRequestedAlignment`}
    public @CType("uint32_t") int maximumRequestedAlignment() { return VkImageAlignmentControlCreateInfoMESA.get_maximumRequestedAlignment(this.segment()); }
    /// Sets `maximumRequestedAlignment` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maximumRequestedAlignment(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maximumRequestedAlignment.set(segment, 0L, index, value); }
    /// Sets `maximumRequestedAlignment` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maximumRequestedAlignment(MemorySegment segment, @CType("uint32_t") int value) { VkImageAlignmentControlCreateInfoMESA.set_maximumRequestedAlignment(segment, 0L, value); }
    /// Sets `maximumRequestedAlignment` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageAlignmentControlCreateInfoMESA maximumRequestedAlignment(@CType("uint32_t") int value) { VkImageAlignmentControlCreateInfoMESA.set_maximumRequestedAlignment(this.segment(), value); return this; }

    /// A buffer of [VkImageAlignmentControlCreateInfoMESA].
    public static final class Buffer extends VkImageAlignmentControlCreateInfoMESA {
        private final long elementCount;

        /// Creates `VkImageAlignmentControlCreateInfoMESA.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkImageAlignmentControlCreateInfoMESA`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkImageAlignmentControlCreateInfoMESA`
        public VkImageAlignmentControlCreateInfoMESA asSlice(long index) { return new VkImageAlignmentControlCreateInfoMESA(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkImageAlignmentControlCreateInfoMESA`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkImageAlignmentControlCreateInfoMESA`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkImageAlignmentControlCreateInfoMESA.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkImageAlignmentControlCreateInfoMESA.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("const void *") MemorySegment pNextAt(long index) { return VkImageAlignmentControlCreateInfoMESA.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("const void *") MemorySegment value) { VkImageAlignmentControlCreateInfoMESA.set_pNext(this.segment(), index, value); return this; }

        /// {@return `maximumRequestedAlignment` at the given index}
        /// @param index the index
        public @CType("uint32_t") int maximumRequestedAlignmentAt(long index) { return VkImageAlignmentControlCreateInfoMESA.get_maximumRequestedAlignment(this.segment(), index); }
        /// Sets `maximumRequestedAlignment` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maximumRequestedAlignmentAt(long index, @CType("uint32_t") int value) { VkImageAlignmentControlCreateInfoMESA.set_maximumRequestedAlignment(this.segment(), index, value); return this; }

    }
}
