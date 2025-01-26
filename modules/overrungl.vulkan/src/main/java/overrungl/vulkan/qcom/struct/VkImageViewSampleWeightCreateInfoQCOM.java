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
package overrungl.vulkan.qcom.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkImageViewSampleWeightCreateInfoQCOM {
///     (int) VkStructureType sType;
///     const void* pNext;
///     (struct VkOffset2D) VkOffset2D filterCenter;
///     (struct VkExtent2D) VkExtent2D filterSize;
///     uint32_t numPhases;
/// };
/// ```
public sealed class VkImageViewSampleWeightCreateInfoQCOM extends GroupType {
    /// The struct layout of `VkImageViewSampleWeightCreateInfoQCOM`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        overrungl.vulkan.struct.VkOffset2D.LAYOUT.withName("filterCenter"),
        overrungl.vulkan.struct.VkExtent2D.LAYOUT.withName("filterSize"),
        ValueLayout.JAVA_INT.withName("numPhases")
    );
    /// The byte offset of `sType`.
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    /// The memory layout of `sType`.
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The byte offset of `pNext`.
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    /// The memory layout of `pNext`.
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The byte offset of `filterCenter`.
    public static final long OFFSET_filterCenter = LAYOUT.byteOffset(PathElement.groupElement("filterCenter"));
    /// The memory layout of `filterCenter`.
    public static final MemoryLayout LAYOUT_filterCenter = LAYOUT.select(PathElement.groupElement("filterCenter"));
    /// The byte offset of `filterSize`.
    public static final long OFFSET_filterSize = LAYOUT.byteOffset(PathElement.groupElement("filterSize"));
    /// The memory layout of `filterSize`.
    public static final MemoryLayout LAYOUT_filterSize = LAYOUT.select(PathElement.groupElement("filterSize"));
    /// The byte offset of `numPhases`.
    public static final long OFFSET_numPhases = LAYOUT.byteOffset(PathElement.groupElement("numPhases"));
    /// The memory layout of `numPhases`.
    public static final MemoryLayout LAYOUT_numPhases = LAYOUT.select(PathElement.groupElement("numPhases"));
    /// The [VarHandle] of `numPhases` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_numPhases = LAYOUT.arrayElementVarHandle(PathElement.groupElement("numPhases"));

    /// Creates `VkImageViewSampleWeightCreateInfoQCOM` with the given segment.
    /// @param segment the memory segment
    public VkImageViewSampleWeightCreateInfoQCOM(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkImageViewSampleWeightCreateInfoQCOM` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkImageViewSampleWeightCreateInfoQCOM` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkImageViewSampleWeightCreateInfoQCOM ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkImageViewSampleWeightCreateInfoQCOM(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkImageViewSampleWeightCreateInfoQCOM` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkImageViewSampleWeightCreateInfoQCOM` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkImageViewSampleWeightCreateInfoQCOM`
    public static VkImageViewSampleWeightCreateInfoQCOM alloc(SegmentAllocator allocator) { return new VkImageViewSampleWeightCreateInfoQCOM(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkImageViewSampleWeightCreateInfoQCOM` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkImageViewSampleWeightCreateInfoQCOM`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkImageViewSampleWeightCreateInfoQCOM copyFrom(VkImageViewSampleWeightCreateInfoQCOM src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { if (this instanceof Buffer buf) return buf; else return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    public int sType() { return sType(this.segment(), 0L); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void sType(MemorySegment segment, long index, int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageViewSampleWeightCreateInfoQCOM sType(int value) { sType(this.segment(), 0L, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    public MemorySegment pNext() { return pNext(this.segment(), 0L); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pNext(MemorySegment segment, long index, MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageViewSampleWeightCreateInfoQCOM pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `filterCenter` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment filterCenter(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_filterCenter, index), LAYOUT_filterCenter); }
    /// {@return `filterCenter`}
    public MemorySegment filterCenter() { return filterCenter(this.segment(), 0L); }
    /// Sets `filterCenter` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void filterCenter(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_filterCenter, index), LAYOUT_filterCenter.byteSize()); }
    /// Sets `filterCenter` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageViewSampleWeightCreateInfoQCOM filterCenter(MemorySegment value) { filterCenter(this.segment(), 0L, value); return this; }

    /// {@return `filterSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment filterSize(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_filterSize, index), LAYOUT_filterSize); }
    /// {@return `filterSize`}
    public MemorySegment filterSize() { return filterSize(this.segment(), 0L); }
    /// Sets `filterSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void filterSize(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_filterSize, index), LAYOUT_filterSize.byteSize()); }
    /// Sets `filterSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageViewSampleWeightCreateInfoQCOM filterSize(MemorySegment value) { filterSize(this.segment(), 0L, value); return this; }

    /// {@return `numPhases` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int numPhases(MemorySegment segment, long index) { return (int) VH_numPhases.get(segment, 0L, index); }
    /// {@return `numPhases`}
    public int numPhases() { return numPhases(this.segment(), 0L); }
    /// Sets `numPhases` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void numPhases(MemorySegment segment, long index, int value) { VH_numPhases.set(segment, 0L, index, value); }
    /// Sets `numPhases` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageViewSampleWeightCreateInfoQCOM numPhases(int value) { numPhases(this.segment(), 0L, value); return this; }

    /// A buffer of [VkImageViewSampleWeightCreateInfoQCOM].
    public static final class Buffer extends VkImageViewSampleWeightCreateInfoQCOM {
        private final long elementCount;

        /// Creates `VkImageViewSampleWeightCreateInfoQCOM.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkImageViewSampleWeightCreateInfoQCOM`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkImageViewSampleWeightCreateInfoQCOM`
        public VkImageViewSampleWeightCreateInfoQCOM asSlice(long index) { return new VkImageViewSampleWeightCreateInfoQCOM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkImageViewSampleWeightCreateInfoQCOM`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkImageViewSampleWeightCreateInfoQCOM`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index of the struct buffer
        public int sTypeAt(long index) { return sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

        /// {@return `filterCenter` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment filterCenterAt(long index) { return filterCenter(this.segment(), index); }
        /// Sets `filterCenter` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer filterCenterAt(long index, MemorySegment value) { filterCenter(this.segment(), index, value); return this; }

        /// {@return `filterSize` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment filterSizeAt(long index) { return filterSize(this.segment(), index); }
        /// Sets `filterSize` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer filterSizeAt(long index, MemorySegment value) { filterSize(this.segment(), index, value); return this; }

        /// {@return `numPhases` at the given index}
        /// @param index the index of the struct buffer
        public int numPhasesAt(long index) { return numPhases(this.segment(), index); }
        /// Sets `numPhases` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer numPhasesAt(long index, int value) { numPhases(this.segment(), index, value); return this; }

    }
}
