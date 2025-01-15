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
package overrungl.vulkan.video;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.annotation.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Members
/// ### used_for_long_term_reference
/// [VarHandle][#VH_used_for_long_term_reference] - [Getter][#used_for_long_term_reference()] - [Setter][#used_for_long_term_reference(int)]
/// ### reserved
/// [VarHandle][#VH_reserved] - [Getter][#reserved()] - [Setter][#reserved(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct StdVideoEncodeH264ReferenceInfoFlags {
///     uint32_t : 1 used_for_long_term_reference;
///     uint32_t : 31 reserved;
/// } StdVideoEncodeH264ReferenceInfoFlags;
/// ```
public sealed class StdVideoEncodeH264ReferenceInfoFlags extends Struct {
    /// The struct layout of `StdVideoEncodeH264ReferenceInfoFlags`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("used_for_long_term_reference"),
        ValueLayout.JAVA_INT.withName("reserved")
    );
    /// The [VarHandle] of `used_for_long_term_reference` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_used_for_long_term_reference = LAYOUT.arrayElementVarHandle(PathElement.groupElement("used_for_long_term_reference"));
    /// The [VarHandle] of `reserved` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_reserved = LAYOUT.arrayElementVarHandle(PathElement.groupElement("reserved"));

    /// Creates `StdVideoEncodeH264ReferenceInfoFlags` with the given segment.
    /// @param segment the memory segment
    public StdVideoEncodeH264ReferenceInfoFlags(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `StdVideoEncodeH264ReferenceInfoFlags` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoEncodeH264ReferenceInfoFlags of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new StdVideoEncodeH264ReferenceInfoFlags(segment); }

    /// Creates `StdVideoEncodeH264ReferenceInfoFlags` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `StdVideoEncodeH264ReferenceInfoFlags` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoEncodeH264ReferenceInfoFlags ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new StdVideoEncodeH264ReferenceInfoFlags(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `StdVideoEncodeH264ReferenceInfoFlags` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `StdVideoEncodeH264ReferenceInfoFlags` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoEncodeH264ReferenceInfoFlags`
    public static StdVideoEncodeH264ReferenceInfoFlags alloc(SegmentAllocator allocator) { return new StdVideoEncodeH264ReferenceInfoFlags(allocator.allocate(LAYOUT)); }

    /// Allocates a `StdVideoEncodeH264ReferenceInfoFlags` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `StdVideoEncodeH264ReferenceInfoFlags`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `StdVideoEncodeH264ReferenceInfoFlags` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoEncodeH264ReferenceInfoFlags`
    public static StdVideoEncodeH264ReferenceInfoFlags allocInit(SegmentAllocator allocator, @CType("uint32_t : 1") int used_for_long_term_reference, @CType("uint32_t : 31") int reserved) { return alloc(allocator).used_for_long_term_reference(used_for_long_term_reference).reserved(reserved); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public StdVideoEncodeH264ReferenceInfoFlags copyFrom(StdVideoEncodeH264ReferenceInfoFlags src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `used_for_long_term_reference` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_used_for_long_term_reference(MemorySegment segment, long index) { return (int) VH_used_for_long_term_reference.get(segment, 0L, index); }
    /// {@return `used_for_long_term_reference`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_used_for_long_term_reference(MemorySegment segment) { return StdVideoEncodeH264ReferenceInfoFlags.get_used_for_long_term_reference(segment, 0L); }
    /// {@return `used_for_long_term_reference`}
    public @CType("uint32_t : 1") int used_for_long_term_reference() { return StdVideoEncodeH264ReferenceInfoFlags.get_used_for_long_term_reference(this.segment()); }
    /// Sets `used_for_long_term_reference` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_used_for_long_term_reference(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_used_for_long_term_reference.set(segment, 0L, index, value); }
    /// Sets `used_for_long_term_reference` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_used_for_long_term_reference(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoEncodeH264ReferenceInfoFlags.set_used_for_long_term_reference(segment, 0L, value); }
    /// Sets `used_for_long_term_reference` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264ReferenceInfoFlags used_for_long_term_reference(@CType("uint32_t : 1") int value) { StdVideoEncodeH264ReferenceInfoFlags.set_used_for_long_term_reference(this.segment(), value); return this; }

    /// {@return `reserved` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 31") int get_reserved(MemorySegment segment, long index) { return (int) VH_reserved.get(segment, 0L, index); }
    /// {@return `reserved`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 31") int get_reserved(MemorySegment segment) { return StdVideoEncodeH264ReferenceInfoFlags.get_reserved(segment, 0L); }
    /// {@return `reserved`}
    public @CType("uint32_t : 31") int reserved() { return StdVideoEncodeH264ReferenceInfoFlags.get_reserved(this.segment()); }
    /// Sets `reserved` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_reserved(MemorySegment segment, long index, @CType("uint32_t : 31") int value) { VH_reserved.set(segment, 0L, index, value); }
    /// Sets `reserved` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_reserved(MemorySegment segment, @CType("uint32_t : 31") int value) { StdVideoEncodeH264ReferenceInfoFlags.set_reserved(segment, 0L, value); }
    /// Sets `reserved` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264ReferenceInfoFlags reserved(@CType("uint32_t : 31") int value) { StdVideoEncodeH264ReferenceInfoFlags.set_reserved(this.segment(), value); return this; }

    /// A buffer of [StdVideoEncodeH264ReferenceInfoFlags].
    public static final class Buffer extends StdVideoEncodeH264ReferenceInfoFlags {
        private final long elementCount;

        /// Creates `StdVideoEncodeH264ReferenceInfoFlags.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `StdVideoEncodeH264ReferenceInfoFlags`.
        /// @param index the index of the struct buffer
        /// @return the slice of `StdVideoEncodeH264ReferenceInfoFlags`
        public StdVideoEncodeH264ReferenceInfoFlags asSlice(long index) { return new StdVideoEncodeH264ReferenceInfoFlags(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `StdVideoEncodeH264ReferenceInfoFlags`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `StdVideoEncodeH264ReferenceInfoFlags`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `used_for_long_term_reference` at the given index}
        /// @param index the index
        public @CType("uint32_t : 1") int used_for_long_term_referenceAt(long index) { return StdVideoEncodeH264ReferenceInfoFlags.get_used_for_long_term_reference(this.segment(), index); }
        /// Sets `used_for_long_term_reference` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer used_for_long_term_referenceAt(long index, @CType("uint32_t : 1") int value) { StdVideoEncodeH264ReferenceInfoFlags.set_used_for_long_term_reference(this.segment(), index, value); return this; }

        /// {@return `reserved` at the given index}
        /// @param index the index
        public @CType("uint32_t : 31") int reservedAt(long index) { return StdVideoEncodeH264ReferenceInfoFlags.get_reserved(this.segment(), index); }
        /// Sets `reserved` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer reservedAt(long index, @CType("uint32_t : 31") int value) { StdVideoEncodeH264ReferenceInfoFlags.set_reserved(this.segment(), index, value); return this; }

    }
}
