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
/// struct VkMicromapTriangleEXT {
///     uint32_t dataOffset;
///     uint16_t subdivisionLevel;
///     uint16_t format;
/// };
/// ```
public sealed class VkMicromapTriangleEXT extends GroupType {
    /// The struct layout of `VkMicromapTriangleEXT`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("dataOffset"),
        ValueLayout.JAVA_SHORT.withName("subdivisionLevel"),
        ValueLayout.JAVA_SHORT.withName("format")
    );
    /// The byte offset of `dataOffset`.
    public static final long OFFSET_dataOffset = LAYOUT.byteOffset(PathElement.groupElement("dataOffset"));
    /// The memory layout of `dataOffset`.
    public static final MemoryLayout LAYOUT_dataOffset = LAYOUT.select(PathElement.groupElement("dataOffset"));
    /// The [VarHandle] of `dataOffset` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_dataOffset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dataOffset"));
    /// The byte offset of `subdivisionLevel`.
    public static final long OFFSET_subdivisionLevel = LAYOUT.byteOffset(PathElement.groupElement("subdivisionLevel"));
    /// The memory layout of `subdivisionLevel`.
    public static final MemoryLayout LAYOUT_subdivisionLevel = LAYOUT.select(PathElement.groupElement("subdivisionLevel"));
    /// The [VarHandle] of `subdivisionLevel` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_subdivisionLevel = LAYOUT.arrayElementVarHandle(PathElement.groupElement("subdivisionLevel"));
    /// The byte offset of `format`.
    public static final long OFFSET_format = LAYOUT.byteOffset(PathElement.groupElement("format"));
    /// The memory layout of `format`.
    public static final MemoryLayout LAYOUT_format = LAYOUT.select(PathElement.groupElement("format"));
    /// The [VarHandle] of `format` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_format = LAYOUT.arrayElementVarHandle(PathElement.groupElement("format"));

    /// Creates `VkMicromapTriangleEXT` with the given segment.
    /// @param segment the memory segment
    public VkMicromapTriangleEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkMicromapTriangleEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkMicromapTriangleEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkMicromapTriangleEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkMicromapTriangleEXT(segment.reinterpret(LAYOUT.byteSize())); }

    /// Creates `VkMicromapTriangleEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkMicromapTriangleEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkMicromapTriangleEXT`
    public static VkMicromapTriangleEXT alloc(SegmentAllocator allocator) { return new VkMicromapTriangleEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkMicromapTriangleEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkMicromapTriangleEXT`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkMicromapTriangleEXT copyFrom(VkMicromapTriangleEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { if (this instanceof Buffer buf) return buf; else return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `dataOffset` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int dataOffset(MemorySegment segment, long index) { return (int) VH_dataOffset.get(segment, 0L, index); }
    /// {@return `dataOffset`}
    public int dataOffset() { return dataOffset(this.segment(), 0L); }
    /// Sets `dataOffset` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void dataOffset(MemorySegment segment, long index, int value) { VH_dataOffset.set(segment, 0L, index, value); }
    /// Sets `dataOffset` with the given value.
    /// @param value the value
    /// @return `this`
    public VkMicromapTriangleEXT dataOffset(int value) { dataOffset(this.segment(), 0L, value); return this; }

    /// {@return `subdivisionLevel` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static short subdivisionLevel(MemorySegment segment, long index) { return (short) VH_subdivisionLevel.get(segment, 0L, index); }
    /// {@return `subdivisionLevel`}
    public short subdivisionLevel() { return subdivisionLevel(this.segment(), 0L); }
    /// Sets `subdivisionLevel` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void subdivisionLevel(MemorySegment segment, long index, short value) { VH_subdivisionLevel.set(segment, 0L, index, value); }
    /// Sets `subdivisionLevel` with the given value.
    /// @param value the value
    /// @return `this`
    public VkMicromapTriangleEXT subdivisionLevel(short value) { subdivisionLevel(this.segment(), 0L, value); return this; }

    /// {@return `format` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static short format(MemorySegment segment, long index) { return (short) VH_format.get(segment, 0L, index); }
    /// {@return `format`}
    public short format() { return format(this.segment(), 0L); }
    /// Sets `format` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void format(MemorySegment segment, long index, short value) { VH_format.set(segment, 0L, index, value); }
    /// Sets `format` with the given value.
    /// @param value the value
    /// @return `this`
    public VkMicromapTriangleEXT format(short value) { format(this.segment(), 0L, value); return this; }

    /// A buffer of [VkMicromapTriangleEXT].
    public static final class Buffer extends VkMicromapTriangleEXT {
        private final long elementCount;

        /// Creates `VkMicromapTriangleEXT.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkMicromapTriangleEXT`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkMicromapTriangleEXT`
        public VkMicromapTriangleEXT asSlice(long index) { return new VkMicromapTriangleEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkMicromapTriangleEXT`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkMicromapTriangleEXT`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `dataOffset` at the given index}
        /// @param index the index of the struct buffer
        public int dataOffsetAt(long index) { return dataOffset(this.segment(), index); }
        /// Sets `dataOffset` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer dataOffsetAt(long index, int value) { dataOffset(this.segment(), index, value); return this; }

        /// {@return `subdivisionLevel` at the given index}
        /// @param index the index of the struct buffer
        public short subdivisionLevelAt(long index) { return subdivisionLevel(this.segment(), index); }
        /// Sets `subdivisionLevel` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer subdivisionLevelAt(long index, short value) { subdivisionLevel(this.segment(), index, value); return this; }

        /// {@return `format` at the given index}
        /// @param index the index of the struct buffer
        public short formatAt(long index) { return format(this.segment(), index); }
        /// Sets `format` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer formatAt(long index, short value) { format(this.segment(), index, value); return this; }

    }
}
