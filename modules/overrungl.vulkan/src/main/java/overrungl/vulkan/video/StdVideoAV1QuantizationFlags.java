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
/// ### using_qmatrix
/// [VarHandle][#VH_using_qmatrix] - [Getter][#using_qmatrix()] - [Setter][#using_qmatrix(int)]
/// ### diff_uv_delta
/// [VarHandle][#VH_diff_uv_delta] - [Getter][#diff_uv_delta()] - [Setter][#diff_uv_delta(int)]
/// ### reserved
/// [VarHandle][#VH_reserved] - [Getter][#reserved()] - [Setter][#reserved(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct StdVideoAV1QuantizationFlags {
///     uint32_t : 1 using_qmatrix;
///     uint32_t : 1 diff_uv_delta;
///     uint32_t : 30 reserved;
/// } StdVideoAV1QuantizationFlags;
/// ```
public sealed class StdVideoAV1QuantizationFlags extends Struct {
    /// The struct layout of `StdVideoAV1QuantizationFlags`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("using_qmatrix"),
        ValueLayout.JAVA_INT.withName("diff_uv_delta"),
        ValueLayout.JAVA_INT.withName("reserved")
    );
    /// The [VarHandle] of `using_qmatrix` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_using_qmatrix = LAYOUT.arrayElementVarHandle(PathElement.groupElement("using_qmatrix"));
    /// The [VarHandle] of `diff_uv_delta` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_diff_uv_delta = LAYOUT.arrayElementVarHandle(PathElement.groupElement("diff_uv_delta"));
    /// The [VarHandle] of `reserved` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_reserved = LAYOUT.arrayElementVarHandle(PathElement.groupElement("reserved"));

    /// Creates `StdVideoAV1QuantizationFlags` with the given segment.
    /// @param segment the memory segment
    public StdVideoAV1QuantizationFlags(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `StdVideoAV1QuantizationFlags` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoAV1QuantizationFlags of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new StdVideoAV1QuantizationFlags(segment); }

    /// Creates `StdVideoAV1QuantizationFlags` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `StdVideoAV1QuantizationFlags` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoAV1QuantizationFlags ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new StdVideoAV1QuantizationFlags(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `StdVideoAV1QuantizationFlags` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `StdVideoAV1QuantizationFlags` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoAV1QuantizationFlags`
    public static StdVideoAV1QuantizationFlags alloc(SegmentAllocator allocator) { return new StdVideoAV1QuantizationFlags(allocator.allocate(LAYOUT)); }

    /// Allocates a `StdVideoAV1QuantizationFlags` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `StdVideoAV1QuantizationFlags`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `StdVideoAV1QuantizationFlags` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoAV1QuantizationFlags`
    public static StdVideoAV1QuantizationFlags allocInit(SegmentAllocator allocator, @CType("uint32_t : 1") int using_qmatrix, @CType("uint32_t : 1") int diff_uv_delta, @CType("uint32_t : 30") int reserved) { return alloc(allocator).using_qmatrix(using_qmatrix).diff_uv_delta(diff_uv_delta).reserved(reserved); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public StdVideoAV1QuantizationFlags copyFrom(StdVideoAV1QuantizationFlags src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `using_qmatrix` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_using_qmatrix(MemorySegment segment, long index) { return (int) VH_using_qmatrix.get(segment, 0L, index); }
    /// {@return `using_qmatrix`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_using_qmatrix(MemorySegment segment) { return StdVideoAV1QuantizationFlags.get_using_qmatrix(segment, 0L); }
    /// {@return `using_qmatrix`}
    public @CType("uint32_t : 1") int using_qmatrix() { return StdVideoAV1QuantizationFlags.get_using_qmatrix(this.segment()); }
    /// Sets `using_qmatrix` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_using_qmatrix(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_using_qmatrix.set(segment, 0L, index, value); }
    /// Sets `using_qmatrix` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_using_qmatrix(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoAV1QuantizationFlags.set_using_qmatrix(segment, 0L, value); }
    /// Sets `using_qmatrix` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoAV1QuantizationFlags using_qmatrix(@CType("uint32_t : 1") int value) { StdVideoAV1QuantizationFlags.set_using_qmatrix(this.segment(), value); return this; }

    /// {@return `diff_uv_delta` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_diff_uv_delta(MemorySegment segment, long index) { return (int) VH_diff_uv_delta.get(segment, 0L, index); }
    /// {@return `diff_uv_delta`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_diff_uv_delta(MemorySegment segment) { return StdVideoAV1QuantizationFlags.get_diff_uv_delta(segment, 0L); }
    /// {@return `diff_uv_delta`}
    public @CType("uint32_t : 1") int diff_uv_delta() { return StdVideoAV1QuantizationFlags.get_diff_uv_delta(this.segment()); }
    /// Sets `diff_uv_delta` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_diff_uv_delta(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_diff_uv_delta.set(segment, 0L, index, value); }
    /// Sets `diff_uv_delta` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_diff_uv_delta(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoAV1QuantizationFlags.set_diff_uv_delta(segment, 0L, value); }
    /// Sets `diff_uv_delta` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoAV1QuantizationFlags diff_uv_delta(@CType("uint32_t : 1") int value) { StdVideoAV1QuantizationFlags.set_diff_uv_delta(this.segment(), value); return this; }

    /// {@return `reserved` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 30") int get_reserved(MemorySegment segment, long index) { return (int) VH_reserved.get(segment, 0L, index); }
    /// {@return `reserved`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 30") int get_reserved(MemorySegment segment) { return StdVideoAV1QuantizationFlags.get_reserved(segment, 0L); }
    /// {@return `reserved`}
    public @CType("uint32_t : 30") int reserved() { return StdVideoAV1QuantizationFlags.get_reserved(this.segment()); }
    /// Sets `reserved` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_reserved(MemorySegment segment, long index, @CType("uint32_t : 30") int value) { VH_reserved.set(segment, 0L, index, value); }
    /// Sets `reserved` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_reserved(MemorySegment segment, @CType("uint32_t : 30") int value) { StdVideoAV1QuantizationFlags.set_reserved(segment, 0L, value); }
    /// Sets `reserved` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoAV1QuantizationFlags reserved(@CType("uint32_t : 30") int value) { StdVideoAV1QuantizationFlags.set_reserved(this.segment(), value); return this; }

    /// A buffer of [StdVideoAV1QuantizationFlags].
    public static final class Buffer extends StdVideoAV1QuantizationFlags {
        private final long elementCount;

        /// Creates `StdVideoAV1QuantizationFlags.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `StdVideoAV1QuantizationFlags`.
        /// @param index the index of the struct buffer
        /// @return the slice of `StdVideoAV1QuantizationFlags`
        public StdVideoAV1QuantizationFlags asSlice(long index) { return new StdVideoAV1QuantizationFlags(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `StdVideoAV1QuantizationFlags`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `StdVideoAV1QuantizationFlags`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `using_qmatrix` at the given index}
        /// @param index the index
        public @CType("uint32_t : 1") int using_qmatrixAt(long index) { return StdVideoAV1QuantizationFlags.get_using_qmatrix(this.segment(), index); }
        /// Sets `using_qmatrix` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer using_qmatrixAt(long index, @CType("uint32_t : 1") int value) { StdVideoAV1QuantizationFlags.set_using_qmatrix(this.segment(), index, value); return this; }

        /// {@return `diff_uv_delta` at the given index}
        /// @param index the index
        public @CType("uint32_t : 1") int diff_uv_deltaAt(long index) { return StdVideoAV1QuantizationFlags.get_diff_uv_delta(this.segment(), index); }
        /// Sets `diff_uv_delta` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer diff_uv_deltaAt(long index, @CType("uint32_t : 1") int value) { StdVideoAV1QuantizationFlags.set_diff_uv_delta(this.segment(), index, value); return this; }

        /// {@return `reserved` at the given index}
        /// @param index the index
        public @CType("uint32_t : 30") int reservedAt(long index) { return StdVideoAV1QuantizationFlags.get_reserved(this.segment(), index); }
        /// Sets `reserved` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer reservedAt(long index, @CType("uint32_t : 30") int value) { StdVideoAV1QuantizationFlags.set_reserved(this.segment(), index, value); return this; }

    }
}
