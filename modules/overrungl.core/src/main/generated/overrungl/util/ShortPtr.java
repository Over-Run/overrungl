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
/// struct ShortPtr {
///     jshort value;
/// };
/// ```
public sealed class ShortPtr extends GroupType {
    /// The struct layout of `ShortPtr`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_SHORT.withName("value")
    );
    /// The byte offset of `value`.
    public static final long OFFSET_value = LAYOUT.byteOffset(PathElement.groupElement("value"));
    /// The memory layout of `value`.
    public static final MemoryLayout LAYOUT_value = LAYOUT.select(PathElement.groupElement("value"));
    /// The [VarHandle] of `value` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_value = LAYOUT.arrayElementVarHandle(PathElement.groupElement("value"));

    /// Creates `ShortPtr` with the given segment.
    /// @param segment the memory segment
    public ShortPtr(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `ShortPtr` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `ShortPtr` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static ShortPtr ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new ShortPtr(segment.reinterpret(LAYOUT.byteSize())); }

    /// Creates `ShortPtr` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `ShortPtr` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `ShortPtr`
    public static ShortPtr alloc(SegmentAllocator allocator) { return new ShortPtr(allocator.allocate(LAYOUT)); }

    /// Allocates a `ShortPtr` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `ShortPtr`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `ShortPtr` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param value `value`
    /// @return the allocated `ShortPtr`
    public static ShortPtr allocInit(SegmentAllocator allocator, short value) {
        return alloc(allocator).value(value);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public ShortPtr copyFrom(ShortPtr src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { if (this instanceof Buffer buf) return buf; else return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `value` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static short value(MemorySegment segment, long index) { return (short) VH_value.get(segment, 0L, index); }
    /// {@return `value`}
    public short value() { return value(this.segment(), 0L); }
    /// Sets `value` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void value(MemorySegment segment, long index, short value) { VH_value.set(segment, 0L, index, value); }
    /// Sets `value` with the given value.
    /// @param value the value
    /// @return `this`
    public ShortPtr value(short value) { value(this.segment(), 0L, value); return this; }

    /// A buffer of [ShortPtr].
    public static final class Buffer extends ShortPtr {
        private final long elementCount;

        /// Creates `ShortPtr.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `ShortPtr`.
        /// @param index the index of the struct buffer
        /// @return the slice of `ShortPtr`
        public ShortPtr asSlice(long index) { return new ShortPtr(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `ShortPtr`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `ShortPtr`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `value` at the given index}
        /// @param index the index of the struct buffer
        public short valueAt(long index) { return value(this.segment(), index); }
        /// Sets `value` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer valueAt(long index, short value) { value(this.segment(), index, value); return this; }

    }
}
