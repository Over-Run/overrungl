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
/// struct VkDebugUtilsLabelEXT {
///     (int) VkStructureType sType;
///     const void* pNext;
///     const char* pLabelName;
///     float color[4];
/// };
/// ```
public sealed class VkDebugUtilsLabelEXT extends GroupType {
    /// The struct layout of `VkDebugUtilsLabelEXT`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("pLabelName"),
        MemoryLayout.sequenceLayout(4, ValueLayout.JAVA_FLOAT).withName("color")
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
    /// The byte offset of `pLabelName`.
    public static final long OFFSET_pLabelName = LAYOUT.byteOffset(PathElement.groupElement("pLabelName"));
    /// The memory layout of `pLabelName`.
    public static final MemoryLayout LAYOUT_pLabelName = LAYOUT.select(PathElement.groupElement("pLabelName"));
    /// The [VarHandle] of `pLabelName` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pLabelName = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pLabelName"));
    /// The byte offset of `color`.
    public static final long OFFSET_color = LAYOUT.byteOffset(PathElement.groupElement("color"));
    /// The memory layout of `color`.
    public static final MemoryLayout LAYOUT_color = LAYOUT.select(PathElement.groupElement("color"));
    /// The [VarHandle] of `color` of type `(MemorySegment base, long baseOffset, long index, long index0)MemorySegment`.
    public static final VarHandle VH_color = LAYOUT.arrayElementVarHandle(PathElement.groupElement("color"), PathElement.sequenceElement());

    /// Creates `VkDebugUtilsLabelEXT` with the given segment.
    /// @param segment the memory segment
    public VkDebugUtilsLabelEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkDebugUtilsLabelEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkDebugUtilsLabelEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDebugUtilsLabelEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDebugUtilsLabelEXT(segment.reinterpret(LAYOUT.byteSize())); }

    /// Creates `VkDebugUtilsLabelEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkDebugUtilsLabelEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDebugUtilsLabelEXT`
    public static VkDebugUtilsLabelEXT alloc(SegmentAllocator allocator) { return new VkDebugUtilsLabelEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkDebugUtilsLabelEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkDebugUtilsLabelEXT`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkDebugUtilsLabelEXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param pLabelName `pLabelName`
    /// @param color `color`
    /// @return the allocated `VkDebugUtilsLabelEXT`
    public static VkDebugUtilsLabelEXT allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, MemorySegment pLabelName, MemorySegment color) {
        return alloc(allocator).sType(sType).pNext(pNext).pLabelName(pLabelName).color(color);
    }

    /// Allocates a `VkDebugUtilsLabelEXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param pLabelName `pLabelName`
    /// @return the allocated `VkDebugUtilsLabelEXT`
    public static VkDebugUtilsLabelEXT allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, MemorySegment pLabelName) {
        return alloc(allocator).sType(sType).pNext(pNext).pLabelName(pLabelName);
    }

    /// Allocates a `VkDebugUtilsLabelEXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @return the allocated `VkDebugUtilsLabelEXT`
    public static VkDebugUtilsLabelEXT allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext) {
        return alloc(allocator).sType(sType).pNext(pNext);
    }

    /// Allocates a `VkDebugUtilsLabelEXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @return the allocated `VkDebugUtilsLabelEXT`
    public static VkDebugUtilsLabelEXT allocInit(SegmentAllocator allocator, int sType) {
        return alloc(allocator).sType(sType);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkDebugUtilsLabelEXT copyFrom(VkDebugUtilsLabelEXT src) { this.segment().copyFrom(src.segment()); return this; }

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
    public VkDebugUtilsLabelEXT sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkDebugUtilsLabelEXT pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `pLabelName` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pLabelName(MemorySegment segment, long index) { return (MemorySegment) VH_pLabelName.get(segment, 0L, index); }
    /// {@return `pLabelName`}
    public MemorySegment pLabelName() { return pLabelName(this.segment(), 0L); }
    /// Sets `pLabelName` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pLabelName(MemorySegment segment, long index, MemorySegment value) { VH_pLabelName.set(segment, 0L, index, value); }
    /// Sets `pLabelName` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDebugUtilsLabelEXT pLabelName(MemorySegment value) { pLabelName(this.segment(), 0L, value); return this; }

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
    public VkDebugUtilsLabelEXT color(MemorySegment value) { color(this.segment(), 0L, value); return this; }
    /// Sets `color` with the given value.
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public VkDebugUtilsLabelEXT color(long index0, float value) { color(this.segment(), 0L, index0, value); return this; }

    /// A buffer of [VkDebugUtilsLabelEXT].
    public static final class Buffer extends VkDebugUtilsLabelEXT {
        private final long elementCount;

        /// Creates `VkDebugUtilsLabelEXT.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkDebugUtilsLabelEXT`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkDebugUtilsLabelEXT`
        public VkDebugUtilsLabelEXT asSlice(long index) { return new VkDebugUtilsLabelEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkDebugUtilsLabelEXT`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkDebugUtilsLabelEXT`
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

        /// {@return `pLabelName` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment pLabelNameAt(long index) { return pLabelName(this.segment(), index); }
        /// Sets `pLabelName` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer pLabelNameAt(long index, MemorySegment value) { pLabelName(this.segment(), index, value); return this; }

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
