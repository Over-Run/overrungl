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
package overrungl.vulkan.khr.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkSurfaceFormatKHR {
///     (int) VkFormat format;
///     (int) VkColorSpaceKHR colorSpace;
/// };
/// ```
public sealed class VkSurfaceFormatKHR extends GroupType {
    /// The struct layout of `VkSurfaceFormatKHR`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("format"),
        ValueLayout.JAVA_INT.withName("colorSpace")
    );
    /// The byte offset of `format`.
    public static final long OFFSET_format = LAYOUT.byteOffset(PathElement.groupElement("format"));
    /// The memory layout of `format`.
    public static final MemoryLayout LAYOUT_format = LAYOUT.select(PathElement.groupElement("format"));
    /// The [VarHandle] of `format` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_format = LAYOUT.arrayElementVarHandle(PathElement.groupElement("format"));
    /// The byte offset of `colorSpace`.
    public static final long OFFSET_colorSpace = LAYOUT.byteOffset(PathElement.groupElement("colorSpace"));
    /// The memory layout of `colorSpace`.
    public static final MemoryLayout LAYOUT_colorSpace = LAYOUT.select(PathElement.groupElement("colorSpace"));
    /// The [VarHandle] of `colorSpace` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_colorSpace = LAYOUT.arrayElementVarHandle(PathElement.groupElement("colorSpace"));

    /// Creates `VkSurfaceFormatKHR` with the given segment.
    /// @param segment the memory segment
    public VkSurfaceFormatKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkSurfaceFormatKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkSurfaceFormatKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSurfaceFormatKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSurfaceFormatKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkSurfaceFormatKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkSurfaceFormatKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkSurfaceFormatKHR`
    public static VkSurfaceFormatKHR alloc(SegmentAllocator allocator) { return new VkSurfaceFormatKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkSurfaceFormatKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkSurfaceFormatKHR`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkSurfaceFormatKHR copyFrom(VkSurfaceFormatKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { if (this instanceof Buffer buf) return buf; else return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `format` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int format(MemorySegment segment, long index) { return (int) VH_format.get(segment, 0L, index); }
    /// {@return `format`}
    public int format() { return format(this.segment(), 0L); }
    /// Sets `format` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void format(MemorySegment segment, long index, int value) { VH_format.set(segment, 0L, index, value); }
    /// Sets `format` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSurfaceFormatKHR format(int value) { format(this.segment(), 0L, value); return this; }

    /// {@return `colorSpace` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int colorSpace(MemorySegment segment, long index) { return (int) VH_colorSpace.get(segment, 0L, index); }
    /// {@return `colorSpace`}
    public int colorSpace() { return colorSpace(this.segment(), 0L); }
    /// Sets `colorSpace` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void colorSpace(MemorySegment segment, long index, int value) { VH_colorSpace.set(segment, 0L, index, value); }
    /// Sets `colorSpace` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSurfaceFormatKHR colorSpace(int value) { colorSpace(this.segment(), 0L, value); return this; }

    /// A buffer of [VkSurfaceFormatKHR].
    public static final class Buffer extends VkSurfaceFormatKHR {
        private final long elementCount;

        /// Creates `VkSurfaceFormatKHR.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkSurfaceFormatKHR`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkSurfaceFormatKHR`
        public VkSurfaceFormatKHR asSlice(long index) { return new VkSurfaceFormatKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkSurfaceFormatKHR`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkSurfaceFormatKHR`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `format` at the given index}
        /// @param index the index of the struct buffer
        public int formatAt(long index) { return format(this.segment(), index); }
        /// Sets `format` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer formatAt(long index, int value) { format(this.segment(), index, value); return this; }

        /// {@return `colorSpace` at the given index}
        /// @param index the index of the struct buffer
        public int colorSpaceAt(long index) { return colorSpace(this.segment(), index); }
        /// Sets `colorSpace` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer colorSpaceAt(long index, int value) { colorSpace(this.segment(), index, value); return this; }

    }
}
