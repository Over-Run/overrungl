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
package overrungl.vulkan.ext.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT {
///     (int) VkStructureType sType;
///     void* pNext;
///     (uint32_t) VkBool32 ycbcr2plane444Formats;
/// };
/// ```
public sealed class VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT extends GroupType {
    /// The struct layout of `VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("ycbcr2plane444Formats")
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
    /// The byte offset of `ycbcr2plane444Formats`.
    public static final long OFFSET_ycbcr2plane444Formats = LAYOUT.byteOffset(PathElement.groupElement("ycbcr2plane444Formats"));
    /// The memory layout of `ycbcr2plane444Formats`.
    public static final MemoryLayout LAYOUT_ycbcr2plane444Formats = LAYOUT.select(PathElement.groupElement("ycbcr2plane444Formats"));
    /// The [VarHandle] of `ycbcr2plane444Formats` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_ycbcr2plane444Formats = LAYOUT.arrayElementVarHandle(PathElement.groupElement("ycbcr2plane444Formats"));

    /// Creates `VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT`
    public static VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT copyFrom(VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT src) { this.segment().copyFrom(src.segment()); return this; }

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
    public VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `ycbcr2plane444Formats` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int ycbcr2plane444Formats(MemorySegment segment, long index) { return (int) VH_ycbcr2plane444Formats.get(segment, 0L, index); }
    /// {@return `ycbcr2plane444Formats`}
    public int ycbcr2plane444Formats() { return ycbcr2plane444Formats(this.segment(), 0L); }
    /// Sets `ycbcr2plane444Formats` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void ycbcr2plane444Formats(MemorySegment segment, long index, int value) { VH_ycbcr2plane444Formats.set(segment, 0L, index, value); }
    /// Sets `ycbcr2plane444Formats` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT ycbcr2plane444Formats(int value) { ycbcr2plane444Formats(this.segment(), 0L, value); return this; }

    /// A buffer of [VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT].
    public static final class Buffer extends VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT {
        private final long elementCount;

        /// Creates `VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT`
        public VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT asSlice(long index) { return new VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT`
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

        /// {@return `ycbcr2plane444Formats` at the given index}
        /// @param index the index of the struct buffer
        public int ycbcr2plane444FormatsAt(long index) { return ycbcr2plane444Formats(this.segment(), index); }
        /// Sets `ycbcr2plane444Formats` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer ycbcr2plane444FormatsAt(long index, int value) { ycbcr2plane444Formats(this.segment(), index, value); return this; }

    }
}
