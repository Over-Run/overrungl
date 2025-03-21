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
/// struct VkDebugMarkerMarkerInfoEXT {
///     (int) VkStructureType sType;
///     const void* pNext;
///     const char* pMarkerName;
///     float color[4];
/// };
/// ```
public sealed class VkDebugMarkerMarkerInfoEXT extends GroupType {
    /// The struct layout of `VkDebugMarkerMarkerInfoEXT`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("pMarkerName"),
        MemoryLayout.sequenceLayout(4L, ValueLayout.JAVA_FLOAT).withName("color")
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
    /// The byte offset of `pMarkerName`.
    public static final long OFFSET_pMarkerName = LAYOUT.byteOffset(PathElement.groupElement("pMarkerName"));
    /// The memory layout of `pMarkerName`.
    public static final MemoryLayout LAYOUT_pMarkerName = LAYOUT.select(PathElement.groupElement("pMarkerName"));
    /// The [VarHandle] of `pMarkerName` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pMarkerName = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pMarkerName"));
    /// The byte offset of `color`.
    public static final long OFFSET_color = LAYOUT.byteOffset(PathElement.groupElement("color"));
    /// The memory layout of `color`.
    public static final MemoryLayout LAYOUT_color = LAYOUT.select(PathElement.groupElement("color"));
    /// The [VarHandle] of `color` of type `(MemorySegment base, long baseOffset, long index, long index0)MemorySegment`.
    public static final VarHandle VH_color = LAYOUT.arrayElementVarHandle(PathElement.groupElement("color"), PathElement.sequenceElement());

    /// Creates `VkDebugMarkerMarkerInfoEXT` with the given segment.
    /// @param segment the memory segment
    public VkDebugMarkerMarkerInfoEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkDebugMarkerMarkerInfoEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkDebugMarkerMarkerInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDebugMarkerMarkerInfoEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDebugMarkerMarkerInfoEXT(segment.reinterpret(LAYOUT.byteSize())); }

    /// Creates `VkDebugMarkerMarkerInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkDebugMarkerMarkerInfoEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDebugMarkerMarkerInfoEXT`
    public static VkDebugMarkerMarkerInfoEXT alloc(SegmentAllocator allocator) { return new VkDebugMarkerMarkerInfoEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkDebugMarkerMarkerInfoEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkDebugMarkerMarkerInfoEXT`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkDebugMarkerMarkerInfoEXT copyFrom(VkDebugMarkerMarkerInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }

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
    public VkDebugMarkerMarkerInfoEXT sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkDebugMarkerMarkerInfoEXT pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `pMarkerName` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pMarkerName(MemorySegment segment, long index) { return (MemorySegment) VH_pMarkerName.get(segment, 0L, index); }
    /// {@return `pMarkerName`}
    public MemorySegment pMarkerName() { return pMarkerName(this.segment(), 0L); }
    /// Sets `pMarkerName` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pMarkerName(MemorySegment segment, long index, MemorySegment value) { VH_pMarkerName.set(segment, 0L, index, value); }
    /// Sets `pMarkerName` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDebugMarkerMarkerInfoEXT pMarkerName(MemorySegment value) { pMarkerName(this.segment(), 0L, value); return this; }

    /// {@return `color` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment color(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_color, index), LAYOUT_color); }
    /// {@return `color` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    public static float color(MemorySegment segment, long index, long index0) { return (float) VH_color.get(segment, 0L, index, index0); }
    /// {@return `color`}
    public MemorySegment color() { return color(this.segment(), 0L); }
    /// {@return `color`}
    /// @param index0 the Index 0 of the array
    public float color(long index0) { return color(this.segment(), 0L, index0); }
    /// Sets `color` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void color(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_color, index), LAYOUT_color.byteSize()); }
    /// Sets `color` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    public static void color(MemorySegment segment, long index, long index0, float value) { VH_color.set(segment, 0L, index, index0, value); }
    /// Sets `color` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDebugMarkerMarkerInfoEXT color(MemorySegment value) { color(this.segment(), 0L, value); return this; }
    /// Sets `color` with the given value.
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public VkDebugMarkerMarkerInfoEXT color(long index0, float value) { color(this.segment(), 0L, index0, value); return this; }

    /// A buffer of [VkDebugMarkerMarkerInfoEXT].
    public static final class Buffer extends VkDebugMarkerMarkerInfoEXT {
        private final long elementCount;

        /// Creates `VkDebugMarkerMarkerInfoEXT.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkDebugMarkerMarkerInfoEXT`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkDebugMarkerMarkerInfoEXT`
        public VkDebugMarkerMarkerInfoEXT asSlice(long index) { return new VkDebugMarkerMarkerInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkDebugMarkerMarkerInfoEXT`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkDebugMarkerMarkerInfoEXT`
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

        /// {@return `pMarkerName` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment pMarkerNameAt(long index) { return pMarkerName(this.segment(), index); }
        /// Sets `pMarkerName` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer pMarkerNameAt(long index, MemorySegment value) { pMarkerName(this.segment(), index, value); return this; }

        /// {@return `color` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment colorAt(long index) { return color(this.segment(), index); }
        /// {@return `color` at the given index}
        /// @param index the index of the struct buffer
        /// @param index0 the Index 0 of the array
        public float colorAt(long index, long index0) { return color(this.segment(), index, index0); }
        /// Sets `color` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer colorAt(long index, MemorySegment value) { color(this.segment(), index, value); return this; }
        /// Sets `color` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param index0 the Index 0 of the array
        /// @param value the value
        /// @return `this`
        public Buffer colorAt(long index, long index0, float value) { color(this.segment(), index, index0, value); return this; }

    }
}
