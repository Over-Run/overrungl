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
/// ### nal_hrd_parameters_present_flag
/// [VarHandle][#VH_nal_hrd_parameters_present_flag] - [Getter][#nal_hrd_parameters_present_flag()] - [Setter][#nal_hrd_parameters_present_flag(int)]
/// ### vcl_hrd_parameters_present_flag
/// [VarHandle][#VH_vcl_hrd_parameters_present_flag] - [Getter][#vcl_hrd_parameters_present_flag()] - [Setter][#vcl_hrd_parameters_present_flag(int)]
/// ### sub_pic_hrd_params_present_flag
/// [VarHandle][#VH_sub_pic_hrd_params_present_flag] - [Getter][#sub_pic_hrd_params_present_flag()] - [Setter][#sub_pic_hrd_params_present_flag(int)]
/// ### sub_pic_cpb_params_in_pic_timing_sei_flag
/// [VarHandle][#VH_sub_pic_cpb_params_in_pic_timing_sei_flag] - [Getter][#sub_pic_cpb_params_in_pic_timing_sei_flag()] - [Setter][#sub_pic_cpb_params_in_pic_timing_sei_flag(int)]
/// ### fixed_pic_rate_general_flag
/// [VarHandle][#VH_fixed_pic_rate_general_flag] - [Getter][#fixed_pic_rate_general_flag()] - [Setter][#fixed_pic_rate_general_flag(int)]
/// ### fixed_pic_rate_within_cvs_flag
/// [VarHandle][#VH_fixed_pic_rate_within_cvs_flag] - [Getter][#fixed_pic_rate_within_cvs_flag()] - [Setter][#fixed_pic_rate_within_cvs_flag(int)]
/// ### low_delay_hrd_flag
/// [VarHandle][#VH_low_delay_hrd_flag] - [Getter][#low_delay_hrd_flag()] - [Setter][#low_delay_hrd_flag(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct StdVideoH265HrdFlags {
///     uint32_t : 1 nal_hrd_parameters_present_flag;
///     uint32_t : 1 vcl_hrd_parameters_present_flag;
///     uint32_t : 1 sub_pic_hrd_params_present_flag;
///     uint32_t : 1 sub_pic_cpb_params_in_pic_timing_sei_flag;
///     uint32_t : 8 fixed_pic_rate_general_flag;
///     uint32_t : 8 fixed_pic_rate_within_cvs_flag;
///     uint32_t : 8 low_delay_hrd_flag;
/// } StdVideoH265HrdFlags;
/// ```
public sealed class StdVideoH265HrdFlags extends Struct {
    /// The struct layout of `StdVideoH265HrdFlags`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("nal_hrd_parameters_present_flag"),
        ValueLayout.JAVA_INT.withName("vcl_hrd_parameters_present_flag"),
        ValueLayout.JAVA_INT.withName("sub_pic_hrd_params_present_flag"),
        ValueLayout.JAVA_INT.withName("sub_pic_cpb_params_in_pic_timing_sei_flag"),
        ValueLayout.JAVA_INT.withName("fixed_pic_rate_general_flag"),
        ValueLayout.JAVA_INT.withName("fixed_pic_rate_within_cvs_flag"),
        ValueLayout.JAVA_INT.withName("low_delay_hrd_flag")
    );
    /// The [VarHandle] of `nal_hrd_parameters_present_flag` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_nal_hrd_parameters_present_flag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("nal_hrd_parameters_present_flag"));
    /// The [VarHandle] of `vcl_hrd_parameters_present_flag` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_vcl_hrd_parameters_present_flag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("vcl_hrd_parameters_present_flag"));
    /// The [VarHandle] of `sub_pic_hrd_params_present_flag` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sub_pic_hrd_params_present_flag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sub_pic_hrd_params_present_flag"));
    /// The [VarHandle] of `sub_pic_cpb_params_in_pic_timing_sei_flag` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sub_pic_cpb_params_in_pic_timing_sei_flag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sub_pic_cpb_params_in_pic_timing_sei_flag"));
    /// The [VarHandle] of `fixed_pic_rate_general_flag` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_fixed_pic_rate_general_flag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("fixed_pic_rate_general_flag"));
    /// The [VarHandle] of `fixed_pic_rate_within_cvs_flag` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_fixed_pic_rate_within_cvs_flag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("fixed_pic_rate_within_cvs_flag"));
    /// The [VarHandle] of `low_delay_hrd_flag` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_low_delay_hrd_flag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("low_delay_hrd_flag"));

    /// Creates `StdVideoH265HrdFlags` with the given segment.
    /// @param segment the memory segment
    public StdVideoH265HrdFlags(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `StdVideoH265HrdFlags` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoH265HrdFlags of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new StdVideoH265HrdFlags(segment); }

    /// Creates `StdVideoH265HrdFlags` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `StdVideoH265HrdFlags` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoH265HrdFlags ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new StdVideoH265HrdFlags(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `StdVideoH265HrdFlags` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `StdVideoH265HrdFlags` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoH265HrdFlags`
    public static StdVideoH265HrdFlags alloc(SegmentAllocator allocator) { return new StdVideoH265HrdFlags(allocator.allocate(LAYOUT)); }

    /// Allocates a `StdVideoH265HrdFlags` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `StdVideoH265HrdFlags`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `StdVideoH265HrdFlags` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoH265HrdFlags`
    public static StdVideoH265HrdFlags allocInit(SegmentAllocator allocator, @CType("uint32_t : 1") int nal_hrd_parameters_present_flag, @CType("uint32_t : 1") int vcl_hrd_parameters_present_flag, @CType("uint32_t : 1") int sub_pic_hrd_params_present_flag, @CType("uint32_t : 1") int sub_pic_cpb_params_in_pic_timing_sei_flag, @CType("uint32_t : 8") int fixed_pic_rate_general_flag, @CType("uint32_t : 8") int fixed_pic_rate_within_cvs_flag, @CType("uint32_t : 8") int low_delay_hrd_flag) { return alloc(allocator).nal_hrd_parameters_present_flag(nal_hrd_parameters_present_flag).vcl_hrd_parameters_present_flag(vcl_hrd_parameters_present_flag).sub_pic_hrd_params_present_flag(sub_pic_hrd_params_present_flag).sub_pic_cpb_params_in_pic_timing_sei_flag(sub_pic_cpb_params_in_pic_timing_sei_flag).fixed_pic_rate_general_flag(fixed_pic_rate_general_flag).fixed_pic_rate_within_cvs_flag(fixed_pic_rate_within_cvs_flag).low_delay_hrd_flag(low_delay_hrd_flag); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public StdVideoH265HrdFlags copyFrom(StdVideoH265HrdFlags src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `nal_hrd_parameters_present_flag` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_nal_hrd_parameters_present_flag(MemorySegment segment, long index) { return (int) VH_nal_hrd_parameters_present_flag.get(segment, 0L, index); }
    /// {@return `nal_hrd_parameters_present_flag`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_nal_hrd_parameters_present_flag(MemorySegment segment) { return StdVideoH265HrdFlags.get_nal_hrd_parameters_present_flag(segment, 0L); }
    /// {@return `nal_hrd_parameters_present_flag`}
    public @CType("uint32_t : 1") int nal_hrd_parameters_present_flag() { return StdVideoH265HrdFlags.get_nal_hrd_parameters_present_flag(this.segment()); }
    /// Sets `nal_hrd_parameters_present_flag` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_nal_hrd_parameters_present_flag(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_nal_hrd_parameters_present_flag.set(segment, 0L, index, value); }
    /// Sets `nal_hrd_parameters_present_flag` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_nal_hrd_parameters_present_flag(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoH265HrdFlags.set_nal_hrd_parameters_present_flag(segment, 0L, value); }
    /// Sets `nal_hrd_parameters_present_flag` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265HrdFlags nal_hrd_parameters_present_flag(@CType("uint32_t : 1") int value) { StdVideoH265HrdFlags.set_nal_hrd_parameters_present_flag(this.segment(), value); return this; }

    /// {@return `vcl_hrd_parameters_present_flag` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_vcl_hrd_parameters_present_flag(MemorySegment segment, long index) { return (int) VH_vcl_hrd_parameters_present_flag.get(segment, 0L, index); }
    /// {@return `vcl_hrd_parameters_present_flag`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_vcl_hrd_parameters_present_flag(MemorySegment segment) { return StdVideoH265HrdFlags.get_vcl_hrd_parameters_present_flag(segment, 0L); }
    /// {@return `vcl_hrd_parameters_present_flag`}
    public @CType("uint32_t : 1") int vcl_hrd_parameters_present_flag() { return StdVideoH265HrdFlags.get_vcl_hrd_parameters_present_flag(this.segment()); }
    /// Sets `vcl_hrd_parameters_present_flag` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_vcl_hrd_parameters_present_flag(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_vcl_hrd_parameters_present_flag.set(segment, 0L, index, value); }
    /// Sets `vcl_hrd_parameters_present_flag` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_vcl_hrd_parameters_present_flag(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoH265HrdFlags.set_vcl_hrd_parameters_present_flag(segment, 0L, value); }
    /// Sets `vcl_hrd_parameters_present_flag` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265HrdFlags vcl_hrd_parameters_present_flag(@CType("uint32_t : 1") int value) { StdVideoH265HrdFlags.set_vcl_hrd_parameters_present_flag(this.segment(), value); return this; }

    /// {@return `sub_pic_hrd_params_present_flag` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_sub_pic_hrd_params_present_flag(MemorySegment segment, long index) { return (int) VH_sub_pic_hrd_params_present_flag.get(segment, 0L, index); }
    /// {@return `sub_pic_hrd_params_present_flag`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_sub_pic_hrd_params_present_flag(MemorySegment segment) { return StdVideoH265HrdFlags.get_sub_pic_hrd_params_present_flag(segment, 0L); }
    /// {@return `sub_pic_hrd_params_present_flag`}
    public @CType("uint32_t : 1") int sub_pic_hrd_params_present_flag() { return StdVideoH265HrdFlags.get_sub_pic_hrd_params_present_flag(this.segment()); }
    /// Sets `sub_pic_hrd_params_present_flag` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sub_pic_hrd_params_present_flag(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_sub_pic_hrd_params_present_flag.set(segment, 0L, index, value); }
    /// Sets `sub_pic_hrd_params_present_flag` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sub_pic_hrd_params_present_flag(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoH265HrdFlags.set_sub_pic_hrd_params_present_flag(segment, 0L, value); }
    /// Sets `sub_pic_hrd_params_present_flag` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265HrdFlags sub_pic_hrd_params_present_flag(@CType("uint32_t : 1") int value) { StdVideoH265HrdFlags.set_sub_pic_hrd_params_present_flag(this.segment(), value); return this; }

    /// {@return `sub_pic_cpb_params_in_pic_timing_sei_flag` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_sub_pic_cpb_params_in_pic_timing_sei_flag(MemorySegment segment, long index) { return (int) VH_sub_pic_cpb_params_in_pic_timing_sei_flag.get(segment, 0L, index); }
    /// {@return `sub_pic_cpb_params_in_pic_timing_sei_flag`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_sub_pic_cpb_params_in_pic_timing_sei_flag(MemorySegment segment) { return StdVideoH265HrdFlags.get_sub_pic_cpb_params_in_pic_timing_sei_flag(segment, 0L); }
    /// {@return `sub_pic_cpb_params_in_pic_timing_sei_flag`}
    public @CType("uint32_t : 1") int sub_pic_cpb_params_in_pic_timing_sei_flag() { return StdVideoH265HrdFlags.get_sub_pic_cpb_params_in_pic_timing_sei_flag(this.segment()); }
    /// Sets `sub_pic_cpb_params_in_pic_timing_sei_flag` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sub_pic_cpb_params_in_pic_timing_sei_flag(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_sub_pic_cpb_params_in_pic_timing_sei_flag.set(segment, 0L, index, value); }
    /// Sets `sub_pic_cpb_params_in_pic_timing_sei_flag` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sub_pic_cpb_params_in_pic_timing_sei_flag(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoH265HrdFlags.set_sub_pic_cpb_params_in_pic_timing_sei_flag(segment, 0L, value); }
    /// Sets `sub_pic_cpb_params_in_pic_timing_sei_flag` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265HrdFlags sub_pic_cpb_params_in_pic_timing_sei_flag(@CType("uint32_t : 1") int value) { StdVideoH265HrdFlags.set_sub_pic_cpb_params_in_pic_timing_sei_flag(this.segment(), value); return this; }

    /// {@return `fixed_pic_rate_general_flag` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 8") int get_fixed_pic_rate_general_flag(MemorySegment segment, long index) { return (int) VH_fixed_pic_rate_general_flag.get(segment, 0L, index); }
    /// {@return `fixed_pic_rate_general_flag`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 8") int get_fixed_pic_rate_general_flag(MemorySegment segment) { return StdVideoH265HrdFlags.get_fixed_pic_rate_general_flag(segment, 0L); }
    /// {@return `fixed_pic_rate_general_flag`}
    public @CType("uint32_t : 8") int fixed_pic_rate_general_flag() { return StdVideoH265HrdFlags.get_fixed_pic_rate_general_flag(this.segment()); }
    /// Sets `fixed_pic_rate_general_flag` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_fixed_pic_rate_general_flag(MemorySegment segment, long index, @CType("uint32_t : 8") int value) { VH_fixed_pic_rate_general_flag.set(segment, 0L, index, value); }
    /// Sets `fixed_pic_rate_general_flag` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_fixed_pic_rate_general_flag(MemorySegment segment, @CType("uint32_t : 8") int value) { StdVideoH265HrdFlags.set_fixed_pic_rate_general_flag(segment, 0L, value); }
    /// Sets `fixed_pic_rate_general_flag` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265HrdFlags fixed_pic_rate_general_flag(@CType("uint32_t : 8") int value) { StdVideoH265HrdFlags.set_fixed_pic_rate_general_flag(this.segment(), value); return this; }

    /// {@return `fixed_pic_rate_within_cvs_flag` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 8") int get_fixed_pic_rate_within_cvs_flag(MemorySegment segment, long index) { return (int) VH_fixed_pic_rate_within_cvs_flag.get(segment, 0L, index); }
    /// {@return `fixed_pic_rate_within_cvs_flag`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 8") int get_fixed_pic_rate_within_cvs_flag(MemorySegment segment) { return StdVideoH265HrdFlags.get_fixed_pic_rate_within_cvs_flag(segment, 0L); }
    /// {@return `fixed_pic_rate_within_cvs_flag`}
    public @CType("uint32_t : 8") int fixed_pic_rate_within_cvs_flag() { return StdVideoH265HrdFlags.get_fixed_pic_rate_within_cvs_flag(this.segment()); }
    /// Sets `fixed_pic_rate_within_cvs_flag` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_fixed_pic_rate_within_cvs_flag(MemorySegment segment, long index, @CType("uint32_t : 8") int value) { VH_fixed_pic_rate_within_cvs_flag.set(segment, 0L, index, value); }
    /// Sets `fixed_pic_rate_within_cvs_flag` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_fixed_pic_rate_within_cvs_flag(MemorySegment segment, @CType("uint32_t : 8") int value) { StdVideoH265HrdFlags.set_fixed_pic_rate_within_cvs_flag(segment, 0L, value); }
    /// Sets `fixed_pic_rate_within_cvs_flag` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265HrdFlags fixed_pic_rate_within_cvs_flag(@CType("uint32_t : 8") int value) { StdVideoH265HrdFlags.set_fixed_pic_rate_within_cvs_flag(this.segment(), value); return this; }

    /// {@return `low_delay_hrd_flag` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 8") int get_low_delay_hrd_flag(MemorySegment segment, long index) { return (int) VH_low_delay_hrd_flag.get(segment, 0L, index); }
    /// {@return `low_delay_hrd_flag`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 8") int get_low_delay_hrd_flag(MemorySegment segment) { return StdVideoH265HrdFlags.get_low_delay_hrd_flag(segment, 0L); }
    /// {@return `low_delay_hrd_flag`}
    public @CType("uint32_t : 8") int low_delay_hrd_flag() { return StdVideoH265HrdFlags.get_low_delay_hrd_flag(this.segment()); }
    /// Sets `low_delay_hrd_flag` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_low_delay_hrd_flag(MemorySegment segment, long index, @CType("uint32_t : 8") int value) { VH_low_delay_hrd_flag.set(segment, 0L, index, value); }
    /// Sets `low_delay_hrd_flag` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_low_delay_hrd_flag(MemorySegment segment, @CType("uint32_t : 8") int value) { StdVideoH265HrdFlags.set_low_delay_hrd_flag(segment, 0L, value); }
    /// Sets `low_delay_hrd_flag` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265HrdFlags low_delay_hrd_flag(@CType("uint32_t : 8") int value) { StdVideoH265HrdFlags.set_low_delay_hrd_flag(this.segment(), value); return this; }

    /// A buffer of [StdVideoH265HrdFlags].
    public static final class Buffer extends StdVideoH265HrdFlags {
        private final long elementCount;

        /// Creates `StdVideoH265HrdFlags.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `StdVideoH265HrdFlags`.
        /// @param index the index of the struct buffer
        /// @return the slice of `StdVideoH265HrdFlags`
        public StdVideoH265HrdFlags asSlice(long index) { return new StdVideoH265HrdFlags(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `StdVideoH265HrdFlags`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `StdVideoH265HrdFlags`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `nal_hrd_parameters_present_flag` at the given index}
        /// @param index the index
        public @CType("uint32_t : 1") int nal_hrd_parameters_present_flagAt(long index) { return StdVideoH265HrdFlags.get_nal_hrd_parameters_present_flag(this.segment(), index); }
        /// Sets `nal_hrd_parameters_present_flag` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer nal_hrd_parameters_present_flagAt(long index, @CType("uint32_t : 1") int value) { StdVideoH265HrdFlags.set_nal_hrd_parameters_present_flag(this.segment(), index, value); return this; }

        /// {@return `vcl_hrd_parameters_present_flag` at the given index}
        /// @param index the index
        public @CType("uint32_t : 1") int vcl_hrd_parameters_present_flagAt(long index) { return StdVideoH265HrdFlags.get_vcl_hrd_parameters_present_flag(this.segment(), index); }
        /// Sets `vcl_hrd_parameters_present_flag` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer vcl_hrd_parameters_present_flagAt(long index, @CType("uint32_t : 1") int value) { StdVideoH265HrdFlags.set_vcl_hrd_parameters_present_flag(this.segment(), index, value); return this; }

        /// {@return `sub_pic_hrd_params_present_flag` at the given index}
        /// @param index the index
        public @CType("uint32_t : 1") int sub_pic_hrd_params_present_flagAt(long index) { return StdVideoH265HrdFlags.get_sub_pic_hrd_params_present_flag(this.segment(), index); }
        /// Sets `sub_pic_hrd_params_present_flag` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sub_pic_hrd_params_present_flagAt(long index, @CType("uint32_t : 1") int value) { StdVideoH265HrdFlags.set_sub_pic_hrd_params_present_flag(this.segment(), index, value); return this; }

        /// {@return `sub_pic_cpb_params_in_pic_timing_sei_flag` at the given index}
        /// @param index the index
        public @CType("uint32_t : 1") int sub_pic_cpb_params_in_pic_timing_sei_flagAt(long index) { return StdVideoH265HrdFlags.get_sub_pic_cpb_params_in_pic_timing_sei_flag(this.segment(), index); }
        /// Sets `sub_pic_cpb_params_in_pic_timing_sei_flag` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sub_pic_cpb_params_in_pic_timing_sei_flagAt(long index, @CType("uint32_t : 1") int value) { StdVideoH265HrdFlags.set_sub_pic_cpb_params_in_pic_timing_sei_flag(this.segment(), index, value); return this; }

        /// {@return `fixed_pic_rate_general_flag` at the given index}
        /// @param index the index
        public @CType("uint32_t : 8") int fixed_pic_rate_general_flagAt(long index) { return StdVideoH265HrdFlags.get_fixed_pic_rate_general_flag(this.segment(), index); }
        /// Sets `fixed_pic_rate_general_flag` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer fixed_pic_rate_general_flagAt(long index, @CType("uint32_t : 8") int value) { StdVideoH265HrdFlags.set_fixed_pic_rate_general_flag(this.segment(), index, value); return this; }

        /// {@return `fixed_pic_rate_within_cvs_flag` at the given index}
        /// @param index the index
        public @CType("uint32_t : 8") int fixed_pic_rate_within_cvs_flagAt(long index) { return StdVideoH265HrdFlags.get_fixed_pic_rate_within_cvs_flag(this.segment(), index); }
        /// Sets `fixed_pic_rate_within_cvs_flag` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer fixed_pic_rate_within_cvs_flagAt(long index, @CType("uint32_t : 8") int value) { StdVideoH265HrdFlags.set_fixed_pic_rate_within_cvs_flag(this.segment(), index, value); return this; }

        /// {@return `low_delay_hrd_flag` at the given index}
        /// @param index the index
        public @CType("uint32_t : 8") int low_delay_hrd_flagAt(long index) { return StdVideoH265HrdFlags.get_low_delay_hrd_flag(this.segment(), index); }
        /// Sets `low_delay_hrd_flag` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer low_delay_hrd_flagAt(long index, @CType("uint32_t : 8") int value) { StdVideoH265HrdFlags.set_low_delay_hrd_flag(this.segment(), index, value); return this; }

    }
}
