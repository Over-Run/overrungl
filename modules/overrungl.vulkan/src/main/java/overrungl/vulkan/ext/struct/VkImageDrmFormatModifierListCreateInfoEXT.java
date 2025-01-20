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
package overrungl.vulkan.ext.struct;

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
/// ### drmFormatModifierCount
/// [VarHandle][#VH_drmFormatModifierCount] - [Getter][#drmFormatModifierCount()] - [Setter][#drmFormatModifierCount(int)]
/// ### pDrmFormatModifiers
/// [VarHandle][#VH_pDrmFormatModifiers] - [Getter][#pDrmFormatModifiers()] - [Setter][#pDrmFormatModifiers(MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkImageDrmFormatModifierListCreateInfoEXT {
///     VkStructureType sType;
///     const void * pNext;
///     uint32_t drmFormatModifierCount;
///     const uint64_t * pDrmFormatModifiers;
/// } VkImageDrmFormatModifierListCreateInfoEXT;
/// ```
public sealed class VkImageDrmFormatModifierListCreateInfoEXT extends Struct {
    /// The struct layout of `VkImageDrmFormatModifierListCreateInfoEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("drmFormatModifierCount"),
        ValueLayout.ADDRESS.withName("pDrmFormatModifiers")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `drmFormatModifierCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_drmFormatModifierCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("drmFormatModifierCount"));
    /// The [VarHandle] of `pDrmFormatModifiers` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pDrmFormatModifiers = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pDrmFormatModifiers"));

    /// Creates `VkImageDrmFormatModifierListCreateInfoEXT` with the given segment.
    /// @param segment the memory segment
    public VkImageDrmFormatModifierListCreateInfoEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkImageDrmFormatModifierListCreateInfoEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkImageDrmFormatModifierListCreateInfoEXT of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkImageDrmFormatModifierListCreateInfoEXT(segment); }

    /// Creates `VkImageDrmFormatModifierListCreateInfoEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkImageDrmFormatModifierListCreateInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkImageDrmFormatModifierListCreateInfoEXT ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkImageDrmFormatModifierListCreateInfoEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkImageDrmFormatModifierListCreateInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkImageDrmFormatModifierListCreateInfoEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkImageDrmFormatModifierListCreateInfoEXT`
    public static VkImageDrmFormatModifierListCreateInfoEXT alloc(SegmentAllocator allocator) { return new VkImageDrmFormatModifierListCreateInfoEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkImageDrmFormatModifierListCreateInfoEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkImageDrmFormatModifierListCreateInfoEXT`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkImageDrmFormatModifierListCreateInfoEXT` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkImageDrmFormatModifierListCreateInfoEXT`
    public static VkImageDrmFormatModifierListCreateInfoEXT allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("const void *") MemorySegment pNext, @CType("uint32_t") int drmFormatModifierCount, @CType("const uint64_t *") MemorySegment pDrmFormatModifiers) { return alloc(allocator).sType(sType).pNext(pNext).drmFormatModifierCount(drmFormatModifierCount).pDrmFormatModifiers(pDrmFormatModifiers); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkImageDrmFormatModifierListCreateInfoEXT copyFrom(VkImageDrmFormatModifierListCreateInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkImageDrmFormatModifierListCreateInfoEXT.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkImageDrmFormatModifierListCreateInfoEXT.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkImageDrmFormatModifierListCreateInfoEXT.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageDrmFormatModifierListCreateInfoEXT sType(@CType("VkStructureType") int value) { VkImageDrmFormatModifierListCreateInfoEXT.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") MemorySegment get_pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") MemorySegment get_pNext(MemorySegment segment) { return VkImageDrmFormatModifierListCreateInfoEXT.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("const void *") MemorySegment pNext() { return VkImageDrmFormatModifierListCreateInfoEXT.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") MemorySegment value) { VkImageDrmFormatModifierListCreateInfoEXT.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageDrmFormatModifierListCreateInfoEXT pNext(@CType("const void *") MemorySegment value) { VkImageDrmFormatModifierListCreateInfoEXT.set_pNext(this.segment(), value); return this; }

    /// {@return `drmFormatModifierCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_drmFormatModifierCount(MemorySegment segment, long index) { return (int) VH_drmFormatModifierCount.get(segment, 0L, index); }
    /// {@return `drmFormatModifierCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_drmFormatModifierCount(MemorySegment segment) { return VkImageDrmFormatModifierListCreateInfoEXT.get_drmFormatModifierCount(segment, 0L); }
    /// {@return `drmFormatModifierCount`}
    public @CType("uint32_t") int drmFormatModifierCount() { return VkImageDrmFormatModifierListCreateInfoEXT.get_drmFormatModifierCount(this.segment()); }
    /// Sets `drmFormatModifierCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_drmFormatModifierCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_drmFormatModifierCount.set(segment, 0L, index, value); }
    /// Sets `drmFormatModifierCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_drmFormatModifierCount(MemorySegment segment, @CType("uint32_t") int value) { VkImageDrmFormatModifierListCreateInfoEXT.set_drmFormatModifierCount(segment, 0L, value); }
    /// Sets `drmFormatModifierCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageDrmFormatModifierListCreateInfoEXT drmFormatModifierCount(@CType("uint32_t") int value) { VkImageDrmFormatModifierListCreateInfoEXT.set_drmFormatModifierCount(this.segment(), value); return this; }

    /// {@return `pDrmFormatModifiers` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const uint64_t *") MemorySegment get_pDrmFormatModifiers(MemorySegment segment, long index) { return (MemorySegment) VH_pDrmFormatModifiers.get(segment, 0L, index); }
    /// {@return `pDrmFormatModifiers`}
    /// @param segment the segment of the struct
    public static @CType("const uint64_t *") MemorySegment get_pDrmFormatModifiers(MemorySegment segment) { return VkImageDrmFormatModifierListCreateInfoEXT.get_pDrmFormatModifiers(segment, 0L); }
    /// {@return `pDrmFormatModifiers`}
    public @CType("const uint64_t *") MemorySegment pDrmFormatModifiers() { return VkImageDrmFormatModifierListCreateInfoEXT.get_pDrmFormatModifiers(this.segment()); }
    /// Sets `pDrmFormatModifiers` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pDrmFormatModifiers(MemorySegment segment, long index, @CType("const uint64_t *") MemorySegment value) { VH_pDrmFormatModifiers.set(segment, 0L, index, value); }
    /// Sets `pDrmFormatModifiers` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pDrmFormatModifiers(MemorySegment segment, @CType("const uint64_t *") MemorySegment value) { VkImageDrmFormatModifierListCreateInfoEXT.set_pDrmFormatModifiers(segment, 0L, value); }
    /// Sets `pDrmFormatModifiers` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageDrmFormatModifierListCreateInfoEXT pDrmFormatModifiers(@CType("const uint64_t *") MemorySegment value) { VkImageDrmFormatModifierListCreateInfoEXT.set_pDrmFormatModifiers(this.segment(), value); return this; }

    /// A buffer of [VkImageDrmFormatModifierListCreateInfoEXT].
    public static final class Buffer extends VkImageDrmFormatModifierListCreateInfoEXT {
        private final long elementCount;

        /// Creates `VkImageDrmFormatModifierListCreateInfoEXT.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkImageDrmFormatModifierListCreateInfoEXT`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkImageDrmFormatModifierListCreateInfoEXT`
        public VkImageDrmFormatModifierListCreateInfoEXT asSlice(long index) { return new VkImageDrmFormatModifierListCreateInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkImageDrmFormatModifierListCreateInfoEXT`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkImageDrmFormatModifierListCreateInfoEXT`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkImageDrmFormatModifierListCreateInfoEXT.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkImageDrmFormatModifierListCreateInfoEXT.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("const void *") MemorySegment pNextAt(long index) { return VkImageDrmFormatModifierListCreateInfoEXT.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("const void *") MemorySegment value) { VkImageDrmFormatModifierListCreateInfoEXT.set_pNext(this.segment(), index, value); return this; }

        /// {@return `drmFormatModifierCount` at the given index}
        /// @param index the index
        public @CType("uint32_t") int drmFormatModifierCountAt(long index) { return VkImageDrmFormatModifierListCreateInfoEXT.get_drmFormatModifierCount(this.segment(), index); }
        /// Sets `drmFormatModifierCount` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer drmFormatModifierCountAt(long index, @CType("uint32_t") int value) { VkImageDrmFormatModifierListCreateInfoEXT.set_drmFormatModifierCount(this.segment(), index, value); return this; }

        /// {@return `pDrmFormatModifiers` at the given index}
        /// @param index the index
        public @CType("const uint64_t *") MemorySegment pDrmFormatModifiersAt(long index) { return VkImageDrmFormatModifierListCreateInfoEXT.get_pDrmFormatModifiers(this.segment(), index); }
        /// Sets `pDrmFormatModifiers` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pDrmFormatModifiersAt(long index, @CType("const uint64_t *") MemorySegment value) { VkImageDrmFormatModifierListCreateInfoEXT.set_pDrmFormatModifiers(this.segment(), index, value); return this; }

    }
}
