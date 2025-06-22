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
package overrungl.util;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct LongPtr {
///     jlong value;
/// };
/// ```
public sealed class LongPtr extends GroupType {
    /// The struct layout of `LongPtr`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_LONG.withName("value")
    );
    /// The byte offset of `value`.
    public static final long OFFSET_value = LAYOUT.byteOffset(PathElement.groupElement("value"));
    /// The memory layout of `value`.
    public static final MemoryLayout LAYOUT_value = LAYOUT.select(PathElement.groupElement("value"));
    /// The [VarHandle] of `value` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_value = LAYOUT.arrayElementVarHandle(PathElement.groupElement("value"));

    /// Creates `LongPtr` with the given segment.
    /// @param segment the memory segment
    public LongPtr(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `LongPtr` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `LongPtr` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static LongPtr ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new LongPtr(segment.reinterpret(LAYOUT.byteSize())); }

    /// Creates `LongPtr` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `LongPtr` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `LongPtr`
    public static LongPtr alloc(SegmentAllocator allocator) { return new LongPtr(allocator.allocate(LAYOUT)); }

    /// Allocates a `LongPtr` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `LongPtr`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `LongPtr` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param value `value`
    /// @return the allocated `LongPtr`
    public static LongPtr allocInit(SegmentAllocator allocator, long value) {
        return alloc(allocator).value(value);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public LongPtr copyFrom(LongPtr src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { if (this instanceof Buffer buf) return buf; else return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `value` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long value(MemorySegment segment, long index) { return (long) VH_value.get(segment, 0L, index); }
    /// {@return `value`}
    public long value() { return value(this.segment(), 0L); }
    /// Sets `value` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void value(MemorySegment segment, long index, long value) { VH_value.set(segment, 0L, index, value); }
    /// Sets `value` with the given value.
    /// @param value the value
    /// @return `this`
    public LongPtr value(long value) { value(this.segment(), 0L, value); return this; }

    /// A buffer of [LongPtr].
    public static final class Buffer extends LongPtr {
        private final long elementCount;

        /// Creates `LongPtr.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `LongPtr`.
        /// @param index the index of the struct buffer
        /// @return the slice of `LongPtr`
        public LongPtr asSlice(long index) { return new LongPtr(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `LongPtr`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `LongPtr`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `value` at the given index}
        /// @param index the index of the struct buffer
        public long valueAt(long index) { return value(this.segment(), index); }
        /// Sets `value` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer valueAt(long index, long value) { value(this.segment(), index, value); return this; }

    }
}
