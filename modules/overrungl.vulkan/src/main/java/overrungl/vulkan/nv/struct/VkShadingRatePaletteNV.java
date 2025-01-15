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
/// ### shadingRatePaletteEntryCount
/// [VarHandle][#VH_shadingRatePaletteEntryCount] - [Getter][#shadingRatePaletteEntryCount()] - [Setter][#shadingRatePaletteEntryCount(int)]
/// ### pShadingRatePaletteEntries
/// [VarHandle][#VH_pShadingRatePaletteEntries] - [Getter][#pShadingRatePaletteEntries()] - [Setter][#pShadingRatePaletteEntries(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkShadingRatePaletteNV {
///     uint32_t shadingRatePaletteEntryCount;
///     const VkShadingRatePaletteEntryNV * pShadingRatePaletteEntries;
/// } VkShadingRatePaletteNV;
/// ```
public sealed class VkShadingRatePaletteNV extends Struct {
    /// The struct layout of `VkShadingRatePaletteNV`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("shadingRatePaletteEntryCount"),
        ValueLayout.ADDRESS.withName("pShadingRatePaletteEntries")
    );
    /// The [VarHandle] of `shadingRatePaletteEntryCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_shadingRatePaletteEntryCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shadingRatePaletteEntryCount"));
    /// The [VarHandle] of `pShadingRatePaletteEntries` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pShadingRatePaletteEntries = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pShadingRatePaletteEntries"));

    /// Creates `VkShadingRatePaletteNV` with the given segment.
    /// @param segment the memory segment
    public VkShadingRatePaletteNV(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkShadingRatePaletteNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkShadingRatePaletteNV of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkShadingRatePaletteNV(segment); }

    /// Creates `VkShadingRatePaletteNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkShadingRatePaletteNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkShadingRatePaletteNV ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkShadingRatePaletteNV(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkShadingRatePaletteNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkShadingRatePaletteNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkShadingRatePaletteNV`
    public static VkShadingRatePaletteNV alloc(SegmentAllocator allocator) { return new VkShadingRatePaletteNV(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkShadingRatePaletteNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkShadingRatePaletteNV`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkShadingRatePaletteNV` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkShadingRatePaletteNV`
    public static VkShadingRatePaletteNV allocInit(SegmentAllocator allocator, @CType("uint32_t") int shadingRatePaletteEntryCount, @CType("const VkShadingRatePaletteEntryNV *") java.lang.foreign.MemorySegment pShadingRatePaletteEntries) { return alloc(allocator).shadingRatePaletteEntryCount(shadingRatePaletteEntryCount).pShadingRatePaletteEntries(pShadingRatePaletteEntries); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkShadingRatePaletteNV copyFrom(VkShadingRatePaletteNV src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `shadingRatePaletteEntryCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_shadingRatePaletteEntryCount(MemorySegment segment, long index) { return (int) VH_shadingRatePaletteEntryCount.get(segment, 0L, index); }
    /// {@return `shadingRatePaletteEntryCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_shadingRatePaletteEntryCount(MemorySegment segment) { return VkShadingRatePaletteNV.get_shadingRatePaletteEntryCount(segment, 0L); }
    /// {@return `shadingRatePaletteEntryCount`}
    public @CType("uint32_t") int shadingRatePaletteEntryCount() { return VkShadingRatePaletteNV.get_shadingRatePaletteEntryCount(this.segment()); }
    /// Sets `shadingRatePaletteEntryCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_shadingRatePaletteEntryCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_shadingRatePaletteEntryCount.set(segment, 0L, index, value); }
    /// Sets `shadingRatePaletteEntryCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_shadingRatePaletteEntryCount(MemorySegment segment, @CType("uint32_t") int value) { VkShadingRatePaletteNV.set_shadingRatePaletteEntryCount(segment, 0L, value); }
    /// Sets `shadingRatePaletteEntryCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkShadingRatePaletteNV shadingRatePaletteEntryCount(@CType("uint32_t") int value) { VkShadingRatePaletteNV.set_shadingRatePaletteEntryCount(this.segment(), value); return this; }

    /// {@return `pShadingRatePaletteEntries` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const VkShadingRatePaletteEntryNV *") java.lang.foreign.MemorySegment get_pShadingRatePaletteEntries(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pShadingRatePaletteEntries.get(segment, 0L, index); }
    /// {@return `pShadingRatePaletteEntries`}
    /// @param segment the segment of the struct
    public static @CType("const VkShadingRatePaletteEntryNV *") java.lang.foreign.MemorySegment get_pShadingRatePaletteEntries(MemorySegment segment) { return VkShadingRatePaletteNV.get_pShadingRatePaletteEntries(segment, 0L); }
    /// {@return `pShadingRatePaletteEntries`}
    public @CType("const VkShadingRatePaletteEntryNV *") java.lang.foreign.MemorySegment pShadingRatePaletteEntries() { return VkShadingRatePaletteNV.get_pShadingRatePaletteEntries(this.segment()); }
    /// Sets `pShadingRatePaletteEntries` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pShadingRatePaletteEntries(MemorySegment segment, long index, @CType("const VkShadingRatePaletteEntryNV *") java.lang.foreign.MemorySegment value) { VH_pShadingRatePaletteEntries.set(segment, 0L, index, value); }
    /// Sets `pShadingRatePaletteEntries` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pShadingRatePaletteEntries(MemorySegment segment, @CType("const VkShadingRatePaletteEntryNV *") java.lang.foreign.MemorySegment value) { VkShadingRatePaletteNV.set_pShadingRatePaletteEntries(segment, 0L, value); }
    /// Sets `pShadingRatePaletteEntries` with the given value.
    /// @param value the value
    /// @return `this`
    public VkShadingRatePaletteNV pShadingRatePaletteEntries(@CType("const VkShadingRatePaletteEntryNV *") java.lang.foreign.MemorySegment value) { VkShadingRatePaletteNV.set_pShadingRatePaletteEntries(this.segment(), value); return this; }

    /// A buffer of [VkShadingRatePaletteNV].
    public static final class Buffer extends VkShadingRatePaletteNV {
        private final long elementCount;

        /// Creates `VkShadingRatePaletteNV.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkShadingRatePaletteNV`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkShadingRatePaletteNV`
        public VkShadingRatePaletteNV asSlice(long index) { return new VkShadingRatePaletteNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkShadingRatePaletteNV`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkShadingRatePaletteNV`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `shadingRatePaletteEntryCount` at the given index}
        /// @param index the index
        public @CType("uint32_t") int shadingRatePaletteEntryCountAt(long index) { return VkShadingRatePaletteNV.get_shadingRatePaletteEntryCount(this.segment(), index); }
        /// Sets `shadingRatePaletteEntryCount` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer shadingRatePaletteEntryCountAt(long index, @CType("uint32_t") int value) { VkShadingRatePaletteNV.set_shadingRatePaletteEntryCount(this.segment(), index, value); return this; }

        /// {@return `pShadingRatePaletteEntries` at the given index}
        /// @param index the index
        public @CType("const VkShadingRatePaletteEntryNV *") java.lang.foreign.MemorySegment pShadingRatePaletteEntriesAt(long index) { return VkShadingRatePaletteNV.get_pShadingRatePaletteEntries(this.segment(), index); }
        /// Sets `pShadingRatePaletteEntries` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pShadingRatePaletteEntriesAt(long index, @CType("const VkShadingRatePaletteEntryNV *") java.lang.foreign.MemorySegment value) { VkShadingRatePaletteNV.set_pShadingRatePaletteEntries(this.segment(), index, value); return this; }

    }
}
