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
/// struct VkPhysicalDeviceDisplacementMicromapPropertiesNV {
///     (int) VkStructureType sType;
///     void* pNext;
///     uint32_t maxDisplacementMicromapSubdivisionLevel;
/// };
/// ```
public sealed class VkPhysicalDeviceDisplacementMicromapPropertiesNV extends GroupType {
    /// The struct layout of `VkPhysicalDeviceDisplacementMicromapPropertiesNV`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("maxDisplacementMicromapSubdivisionLevel")
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
    /// The byte offset of `maxDisplacementMicromapSubdivisionLevel`.
    public static final long OFFSET_maxDisplacementMicromapSubdivisionLevel = LAYOUT.byteOffset(PathElement.groupElement("maxDisplacementMicromapSubdivisionLevel"));
    /// The memory layout of `maxDisplacementMicromapSubdivisionLevel`.
    public static final MemoryLayout LAYOUT_maxDisplacementMicromapSubdivisionLevel = LAYOUT.select(PathElement.groupElement("maxDisplacementMicromapSubdivisionLevel"));
    /// The [VarHandle] of `maxDisplacementMicromapSubdivisionLevel` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxDisplacementMicromapSubdivisionLevel = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxDisplacementMicromapSubdivisionLevel"));

    /// Creates `VkPhysicalDeviceDisplacementMicromapPropertiesNV` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceDisplacementMicromapPropertiesNV(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceDisplacementMicromapPropertiesNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceDisplacementMicromapPropertiesNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceDisplacementMicromapPropertiesNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceDisplacementMicromapPropertiesNV(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDeviceDisplacementMicromapPropertiesNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkPhysicalDeviceDisplacementMicromapPropertiesNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceDisplacementMicromapPropertiesNV`
    public static VkPhysicalDeviceDisplacementMicromapPropertiesNV alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceDisplacementMicromapPropertiesNV(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceDisplacementMicromapPropertiesNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceDisplacementMicromapPropertiesNV`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceDisplacementMicromapPropertiesNV copyFrom(VkPhysicalDeviceDisplacementMicromapPropertiesNV src) { this.segment().copyFrom(src.segment()); return this; }

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
    public VkPhysicalDeviceDisplacementMicromapPropertiesNV sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceDisplacementMicromapPropertiesNV pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `maxDisplacementMicromapSubdivisionLevel` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxDisplacementMicromapSubdivisionLevel(MemorySegment segment, long index) { return (int) VH_maxDisplacementMicromapSubdivisionLevel.get(segment, 0L, index); }
    /// {@return `maxDisplacementMicromapSubdivisionLevel`}
    public int maxDisplacementMicromapSubdivisionLevel() { return maxDisplacementMicromapSubdivisionLevel(this.segment(), 0L); }
    /// Sets `maxDisplacementMicromapSubdivisionLevel` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxDisplacementMicromapSubdivisionLevel(MemorySegment segment, long index, int value) { VH_maxDisplacementMicromapSubdivisionLevel.set(segment, 0L, index, value); }
    /// Sets `maxDisplacementMicromapSubdivisionLevel` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDisplacementMicromapPropertiesNV maxDisplacementMicromapSubdivisionLevel(int value) { maxDisplacementMicromapSubdivisionLevel(this.segment(), 0L, value); return this; }

    /// A buffer of [VkPhysicalDeviceDisplacementMicromapPropertiesNV].
    public static final class Buffer extends VkPhysicalDeviceDisplacementMicromapPropertiesNV {
        private final long elementCount;

        /// Creates `VkPhysicalDeviceDisplacementMicromapPropertiesNV.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkPhysicalDeviceDisplacementMicromapPropertiesNV`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkPhysicalDeviceDisplacementMicromapPropertiesNV`
        public VkPhysicalDeviceDisplacementMicromapPropertiesNV asSlice(long index) { return new VkPhysicalDeviceDisplacementMicromapPropertiesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkPhysicalDeviceDisplacementMicromapPropertiesNV`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkPhysicalDeviceDisplacementMicromapPropertiesNV`
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

        /// {@return `maxDisplacementMicromapSubdivisionLevel` at the given index}
        /// @param index the index of the struct buffer
        public int maxDisplacementMicromapSubdivisionLevelAt(long index) { return maxDisplacementMicromapSubdivisionLevel(this.segment(), index); }
        /// Sets `maxDisplacementMicromapSubdivisionLevel` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer maxDisplacementMicromapSubdivisionLevelAt(long index, int value) { maxDisplacementMicromapSubdivisionLevel(this.segment(), index, value); return this; }

    }
}
