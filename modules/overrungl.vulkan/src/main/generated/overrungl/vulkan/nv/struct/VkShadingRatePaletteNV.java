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
//@formatter:off
package overrungl.vulkan.nv.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkShadingRatePaletteNV {
///     uint32_t shadingRatePaletteEntryCount;
///     const VkShadingRatePaletteEntryNV* pShadingRatePaletteEntries;
/// };
/// ```
public sealed class VkShadingRatePaletteNV extends GroupType {
    /// The struct layout of `VkShadingRatePaletteNV`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("shadingRatePaletteEntryCount"),
        ValueLayout.ADDRESS.withName("pShadingRatePaletteEntries")
    );
    /// The byte offset of `shadingRatePaletteEntryCount`.
    public static final long OFFSET_shadingRatePaletteEntryCount = LAYOUT.byteOffset(PathElement.groupElement("shadingRatePaletteEntryCount"));
    /// The memory layout of `shadingRatePaletteEntryCount`.
    public static final MemoryLayout LAYOUT_shadingRatePaletteEntryCount = LAYOUT.select(PathElement.groupElement("shadingRatePaletteEntryCount"));
    /// The [VarHandle] of `shadingRatePaletteEntryCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_shadingRatePaletteEntryCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shadingRatePaletteEntryCount"));
    /// The byte offset of `pShadingRatePaletteEntries`.
    public static final long OFFSET_pShadingRatePaletteEntries = LAYOUT.byteOffset(PathElement.groupElement("pShadingRatePaletteEntries"));
    /// The memory layout of `pShadingRatePaletteEntries`.
    public static final MemoryLayout LAYOUT_pShadingRatePaletteEntries = LAYOUT.select(PathElement.groupElement("pShadingRatePaletteEntries"));
    /// The [VarHandle] of `pShadingRatePaletteEntries` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pShadingRatePaletteEntries = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pShadingRatePaletteEntries"));

    /// Creates `VkShadingRatePaletteNV` with the given segment.
    /// @param segment the memory segment
    public VkShadingRatePaletteNV(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkShadingRatePaletteNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkShadingRatePaletteNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkShadingRatePaletteNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkShadingRatePaletteNV(segment.reinterpret(LAYOUT.byteSize())); }

    /// Creates `VkShadingRatePaletteNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkShadingRatePaletteNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkShadingRatePaletteNV`
    public static VkShadingRatePaletteNV alloc(SegmentAllocator allocator) { return new VkShadingRatePaletteNV(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkShadingRatePaletteNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkShadingRatePaletteNV`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkShadingRatePaletteNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param shadingRatePaletteEntryCount `shadingRatePaletteEntryCount`
    /// @param pShadingRatePaletteEntries `pShadingRatePaletteEntries`
    /// @return the allocated `VkShadingRatePaletteNV`
    public static VkShadingRatePaletteNV allocInit(SegmentAllocator allocator, int shadingRatePaletteEntryCount, MemorySegment pShadingRatePaletteEntries) {
        return alloc(allocator).shadingRatePaletteEntryCount(shadingRatePaletteEntryCount).pShadingRatePaletteEntries(pShadingRatePaletteEntries);
    }

    /// Allocates a `VkShadingRatePaletteNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param shadingRatePaletteEntryCount `shadingRatePaletteEntryCount`
    /// @return the allocated `VkShadingRatePaletteNV`
    public static VkShadingRatePaletteNV allocInit(SegmentAllocator allocator, int shadingRatePaletteEntryCount) {
        return alloc(allocator).shadingRatePaletteEntryCount(shadingRatePaletteEntryCount);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkShadingRatePaletteNV copyFrom(VkShadingRatePaletteNV src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { if (this instanceof Buffer buf) return buf; else return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `shadingRatePaletteEntryCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int shadingRatePaletteEntryCount(MemorySegment segment, long index) { return (int) VH_shadingRatePaletteEntryCount.get(segment, 0L, index); }
    /// {@return `shadingRatePaletteEntryCount`}
    public int shadingRatePaletteEntryCount() { return shadingRatePaletteEntryCount(this.segment(), 0L); }
    /// Sets `shadingRatePaletteEntryCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void shadingRatePaletteEntryCount(MemorySegment segment, long index, int value) { VH_shadingRatePaletteEntryCount.set(segment, 0L, index, value); }
    /// Sets `shadingRatePaletteEntryCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkShadingRatePaletteNV shadingRatePaletteEntryCount(int value) { shadingRatePaletteEntryCount(this.segment(), 0L, value); return this; }

    /// {@return `pShadingRatePaletteEntries` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pShadingRatePaletteEntries(MemorySegment segment, long index) { return (MemorySegment) VH_pShadingRatePaletteEntries.get(segment, 0L, index); }
    /// {@return `pShadingRatePaletteEntries`}
    public MemorySegment pShadingRatePaletteEntries() { return pShadingRatePaletteEntries(this.segment(), 0L); }
    /// Sets `pShadingRatePaletteEntries` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pShadingRatePaletteEntries(MemorySegment segment, long index, MemorySegment value) { VH_pShadingRatePaletteEntries.set(segment, 0L, index, value); }
    /// Sets `pShadingRatePaletteEntries` with the given value.
    /// @param value the value
    /// @return `this`
    public VkShadingRatePaletteNV pShadingRatePaletteEntries(MemorySegment value) { pShadingRatePaletteEntries(this.segment(), 0L, value); return this; }

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
        /// @param index the index of the struct buffer
        public int shadingRatePaletteEntryCountAt(long index) { return shadingRatePaletteEntryCount(this.segment(), index); }
        /// Sets `shadingRatePaletteEntryCount` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer shadingRatePaletteEntryCountAt(long index, int value) { shadingRatePaletteEntryCount(this.segment(), index, value); return this; }

        /// {@return `pShadingRatePaletteEntries` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment pShadingRatePaletteEntriesAt(long index) { return pShadingRatePaletteEntries(this.segment(), index); }
        /// Sets `pShadingRatePaletteEntries` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer pShadingRatePaletteEntriesAt(long index, MemorySegment value) { pShadingRatePaletteEntries(this.segment(), index, value); return this; }

    }
}
