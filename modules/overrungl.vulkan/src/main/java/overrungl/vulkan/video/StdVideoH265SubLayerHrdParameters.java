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
/// ### bit_rate_value_minus1
/// [VarHandle][#VH_bit_rate_value_minus1] - [Getter][#bit_rate_value_minus1()] - [Setter][#bit_rate_value_minus1(int)]
/// ### cpb_size_value_minus1
/// [VarHandle][#VH_cpb_size_value_minus1] - [Getter][#cpb_size_value_minus1()] - [Setter][#cpb_size_value_minus1(int)]
/// ### cpb_size_du_value_minus1
/// [VarHandle][#VH_cpb_size_du_value_minus1] - [Getter][#cpb_size_du_value_minus1()] - [Setter][#cpb_size_du_value_minus1(int)]
/// ### bit_rate_du_value_minus1
/// [VarHandle][#VH_bit_rate_du_value_minus1] - [Getter][#bit_rate_du_value_minus1()] - [Setter][#bit_rate_du_value_minus1(int)]
/// ### cbr_flag
/// [VarHandle][#VH_cbr_flag] - [Getter][#cbr_flag()] - [Setter][#cbr_flag(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct StdVideoH265SubLayerHrdParameters {
///     uint32_t [ ] bit_rate_value_minus1;
///     uint32_t [ ] cpb_size_value_minus1;
///     uint32_t [ ] cpb_size_du_value_minus1;
///     uint32_t [ ] bit_rate_du_value_minus1;
///     uint32_t cbr_flag;
/// } StdVideoH265SubLayerHrdParameters;
/// ```
public sealed class StdVideoH265SubLayerHrdParameters extends Struct {
    /// The struct layout of `StdVideoH265SubLayerHrdParameters`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("bit_rate_value_minus1"),
        ValueLayout.JAVA_INT.withName("cpb_size_value_minus1"),
        ValueLayout.JAVA_INT.withName("cpb_size_du_value_minus1"),
        ValueLayout.JAVA_INT.withName("bit_rate_du_value_minus1"),
        ValueLayout.JAVA_INT.withName("cbr_flag")
    );
    /// The [VarHandle] of `bit_rate_value_minus1` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_bit_rate_value_minus1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("bit_rate_value_minus1"));
    /// The [VarHandle] of `cpb_size_value_minus1` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_cpb_size_value_minus1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("cpb_size_value_minus1"));
    /// The [VarHandle] of `cpb_size_du_value_minus1` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_cpb_size_du_value_minus1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("cpb_size_du_value_minus1"));
    /// The [VarHandle] of `bit_rate_du_value_minus1` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_bit_rate_du_value_minus1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("bit_rate_du_value_minus1"));
    /// The [VarHandle] of `cbr_flag` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_cbr_flag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("cbr_flag"));

    /// Creates `StdVideoH265SubLayerHrdParameters` with the given segment.
    /// @param segment the memory segment
    public StdVideoH265SubLayerHrdParameters(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `StdVideoH265SubLayerHrdParameters` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoH265SubLayerHrdParameters of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new StdVideoH265SubLayerHrdParameters(segment); }

    /// Creates `StdVideoH265SubLayerHrdParameters` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `StdVideoH265SubLayerHrdParameters` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoH265SubLayerHrdParameters ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new StdVideoH265SubLayerHrdParameters(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `StdVideoH265SubLayerHrdParameters` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `StdVideoH265SubLayerHrdParameters` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoH265SubLayerHrdParameters`
    public static StdVideoH265SubLayerHrdParameters alloc(SegmentAllocator allocator) { return new StdVideoH265SubLayerHrdParameters(allocator.allocate(LAYOUT)); }

    /// Allocates a `StdVideoH265SubLayerHrdParameters` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `StdVideoH265SubLayerHrdParameters`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `StdVideoH265SubLayerHrdParameters` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoH265SubLayerHrdParameters`
    public static StdVideoH265SubLayerHrdParameters allocInit(SegmentAllocator allocator, @CType("uint32_t [ ]") int bit_rate_value_minus1, @CType("uint32_t [ ]") int cpb_size_value_minus1, @CType("uint32_t [ ]") int cpb_size_du_value_minus1, @CType("uint32_t [ ]") int bit_rate_du_value_minus1, @CType("uint32_t") int cbr_flag) { return alloc(allocator).bit_rate_value_minus1(bit_rate_value_minus1).cpb_size_value_minus1(cpb_size_value_minus1).cpb_size_du_value_minus1(cpb_size_du_value_minus1).bit_rate_du_value_minus1(bit_rate_du_value_minus1).cbr_flag(cbr_flag); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public StdVideoH265SubLayerHrdParameters copyFrom(StdVideoH265SubLayerHrdParameters src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `bit_rate_value_minus1` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t [ ]") int get_bit_rate_value_minus1(MemorySegment segment, long index) { return (int) VH_bit_rate_value_minus1.get(segment, 0L, index); }
    /// {@return `bit_rate_value_minus1`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t [ ]") int get_bit_rate_value_minus1(MemorySegment segment) { return StdVideoH265SubLayerHrdParameters.get_bit_rate_value_minus1(segment, 0L); }
    /// {@return `bit_rate_value_minus1`}
    public @CType("uint32_t [ ]") int bit_rate_value_minus1() { return StdVideoH265SubLayerHrdParameters.get_bit_rate_value_minus1(this.segment()); }
    /// Sets `bit_rate_value_minus1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_bit_rate_value_minus1(MemorySegment segment, long index, @CType("uint32_t [ ]") int value) { VH_bit_rate_value_minus1.set(segment, 0L, index, value); }
    /// Sets `bit_rate_value_minus1` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_bit_rate_value_minus1(MemorySegment segment, @CType("uint32_t [ ]") int value) { StdVideoH265SubLayerHrdParameters.set_bit_rate_value_minus1(segment, 0L, value); }
    /// Sets `bit_rate_value_minus1` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265SubLayerHrdParameters bit_rate_value_minus1(@CType("uint32_t [ ]") int value) { StdVideoH265SubLayerHrdParameters.set_bit_rate_value_minus1(this.segment(), value); return this; }

    /// {@return `cpb_size_value_minus1` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t [ ]") int get_cpb_size_value_minus1(MemorySegment segment, long index) { return (int) VH_cpb_size_value_minus1.get(segment, 0L, index); }
    /// {@return `cpb_size_value_minus1`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t [ ]") int get_cpb_size_value_minus1(MemorySegment segment) { return StdVideoH265SubLayerHrdParameters.get_cpb_size_value_minus1(segment, 0L); }
    /// {@return `cpb_size_value_minus1`}
    public @CType("uint32_t [ ]") int cpb_size_value_minus1() { return StdVideoH265SubLayerHrdParameters.get_cpb_size_value_minus1(this.segment()); }
    /// Sets `cpb_size_value_minus1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_cpb_size_value_minus1(MemorySegment segment, long index, @CType("uint32_t [ ]") int value) { VH_cpb_size_value_minus1.set(segment, 0L, index, value); }
    /// Sets `cpb_size_value_minus1` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_cpb_size_value_minus1(MemorySegment segment, @CType("uint32_t [ ]") int value) { StdVideoH265SubLayerHrdParameters.set_cpb_size_value_minus1(segment, 0L, value); }
    /// Sets `cpb_size_value_minus1` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265SubLayerHrdParameters cpb_size_value_minus1(@CType("uint32_t [ ]") int value) { StdVideoH265SubLayerHrdParameters.set_cpb_size_value_minus1(this.segment(), value); return this; }

    /// {@return `cpb_size_du_value_minus1` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t [ ]") int get_cpb_size_du_value_minus1(MemorySegment segment, long index) { return (int) VH_cpb_size_du_value_minus1.get(segment, 0L, index); }
    /// {@return `cpb_size_du_value_minus1`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t [ ]") int get_cpb_size_du_value_minus1(MemorySegment segment) { return StdVideoH265SubLayerHrdParameters.get_cpb_size_du_value_minus1(segment, 0L); }
    /// {@return `cpb_size_du_value_minus1`}
    public @CType("uint32_t [ ]") int cpb_size_du_value_minus1() { return StdVideoH265SubLayerHrdParameters.get_cpb_size_du_value_minus1(this.segment()); }
    /// Sets `cpb_size_du_value_minus1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_cpb_size_du_value_minus1(MemorySegment segment, long index, @CType("uint32_t [ ]") int value) { VH_cpb_size_du_value_minus1.set(segment, 0L, index, value); }
    /// Sets `cpb_size_du_value_minus1` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_cpb_size_du_value_minus1(MemorySegment segment, @CType("uint32_t [ ]") int value) { StdVideoH265SubLayerHrdParameters.set_cpb_size_du_value_minus1(segment, 0L, value); }
    /// Sets `cpb_size_du_value_minus1` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265SubLayerHrdParameters cpb_size_du_value_minus1(@CType("uint32_t [ ]") int value) { StdVideoH265SubLayerHrdParameters.set_cpb_size_du_value_minus1(this.segment(), value); return this; }

    /// {@return `bit_rate_du_value_minus1` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t [ ]") int get_bit_rate_du_value_minus1(MemorySegment segment, long index) { return (int) VH_bit_rate_du_value_minus1.get(segment, 0L, index); }
    /// {@return `bit_rate_du_value_minus1`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t [ ]") int get_bit_rate_du_value_minus1(MemorySegment segment) { return StdVideoH265SubLayerHrdParameters.get_bit_rate_du_value_minus1(segment, 0L); }
    /// {@return `bit_rate_du_value_minus1`}
    public @CType("uint32_t [ ]") int bit_rate_du_value_minus1() { return StdVideoH265SubLayerHrdParameters.get_bit_rate_du_value_minus1(this.segment()); }
    /// Sets `bit_rate_du_value_minus1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_bit_rate_du_value_minus1(MemorySegment segment, long index, @CType("uint32_t [ ]") int value) { VH_bit_rate_du_value_minus1.set(segment, 0L, index, value); }
    /// Sets `bit_rate_du_value_minus1` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_bit_rate_du_value_minus1(MemorySegment segment, @CType("uint32_t [ ]") int value) { StdVideoH265SubLayerHrdParameters.set_bit_rate_du_value_minus1(segment, 0L, value); }
    /// Sets `bit_rate_du_value_minus1` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265SubLayerHrdParameters bit_rate_du_value_minus1(@CType("uint32_t [ ]") int value) { StdVideoH265SubLayerHrdParameters.set_bit_rate_du_value_minus1(this.segment(), value); return this; }

    /// {@return `cbr_flag` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_cbr_flag(MemorySegment segment, long index) { return (int) VH_cbr_flag.get(segment, 0L, index); }
    /// {@return `cbr_flag`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_cbr_flag(MemorySegment segment) { return StdVideoH265SubLayerHrdParameters.get_cbr_flag(segment, 0L); }
    /// {@return `cbr_flag`}
    public @CType("uint32_t") int cbr_flag() { return StdVideoH265SubLayerHrdParameters.get_cbr_flag(this.segment()); }
    /// Sets `cbr_flag` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_cbr_flag(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_cbr_flag.set(segment, 0L, index, value); }
    /// Sets `cbr_flag` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_cbr_flag(MemorySegment segment, @CType("uint32_t") int value) { StdVideoH265SubLayerHrdParameters.set_cbr_flag(segment, 0L, value); }
    /// Sets `cbr_flag` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265SubLayerHrdParameters cbr_flag(@CType("uint32_t") int value) { StdVideoH265SubLayerHrdParameters.set_cbr_flag(this.segment(), value); return this; }

    /// A buffer of [StdVideoH265SubLayerHrdParameters].
    public static final class Buffer extends StdVideoH265SubLayerHrdParameters {
        private final long elementCount;

        /// Creates `StdVideoH265SubLayerHrdParameters.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `StdVideoH265SubLayerHrdParameters`.
        /// @param index the index of the struct buffer
        /// @return the slice of `StdVideoH265SubLayerHrdParameters`
        public StdVideoH265SubLayerHrdParameters asSlice(long index) { return new StdVideoH265SubLayerHrdParameters(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `StdVideoH265SubLayerHrdParameters`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `StdVideoH265SubLayerHrdParameters`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `bit_rate_value_minus1` at the given index}
        /// @param index the index
        public @CType("uint32_t [ ]") int bit_rate_value_minus1At(long index) { return StdVideoH265SubLayerHrdParameters.get_bit_rate_value_minus1(this.segment(), index); }
        /// Sets `bit_rate_value_minus1` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer bit_rate_value_minus1At(long index, @CType("uint32_t [ ]") int value) { StdVideoH265SubLayerHrdParameters.set_bit_rate_value_minus1(this.segment(), index, value); return this; }

        /// {@return `cpb_size_value_minus1` at the given index}
        /// @param index the index
        public @CType("uint32_t [ ]") int cpb_size_value_minus1At(long index) { return StdVideoH265SubLayerHrdParameters.get_cpb_size_value_minus1(this.segment(), index); }
        /// Sets `cpb_size_value_minus1` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer cpb_size_value_minus1At(long index, @CType("uint32_t [ ]") int value) { StdVideoH265SubLayerHrdParameters.set_cpb_size_value_minus1(this.segment(), index, value); return this; }

        /// {@return `cpb_size_du_value_minus1` at the given index}
        /// @param index the index
        public @CType("uint32_t [ ]") int cpb_size_du_value_minus1At(long index) { return StdVideoH265SubLayerHrdParameters.get_cpb_size_du_value_minus1(this.segment(), index); }
        /// Sets `cpb_size_du_value_minus1` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer cpb_size_du_value_minus1At(long index, @CType("uint32_t [ ]") int value) { StdVideoH265SubLayerHrdParameters.set_cpb_size_du_value_minus1(this.segment(), index, value); return this; }

        /// {@return `bit_rate_du_value_minus1` at the given index}
        /// @param index the index
        public @CType("uint32_t [ ]") int bit_rate_du_value_minus1At(long index) { return StdVideoH265SubLayerHrdParameters.get_bit_rate_du_value_minus1(this.segment(), index); }
        /// Sets `bit_rate_du_value_minus1` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer bit_rate_du_value_minus1At(long index, @CType("uint32_t [ ]") int value) { StdVideoH265SubLayerHrdParameters.set_bit_rate_du_value_minus1(this.segment(), index, value); return this; }

        /// {@return `cbr_flag` at the given index}
        /// @param index the index
        public @CType("uint32_t") int cbr_flagAt(long index) { return StdVideoH265SubLayerHrdParameters.get_cbr_flag(this.segment(), index); }
        /// Sets `cbr_flag` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer cbr_flagAt(long index, @CType("uint32_t") int value) { StdVideoH265SubLayerHrdParameters.set_cbr_flag(this.segment(), index, value); return this; }

    }
}
