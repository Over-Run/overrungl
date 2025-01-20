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
/// ### flags
/// [VarHandle][#VH_flags] - [Getter][#flags()] - [Setter][#flags(MemorySegment)]
/// ### tick_divisor_minus2
/// [VarHandle][#VH_tick_divisor_minus2] - [Getter][#tick_divisor_minus2()] - [Setter][#tick_divisor_minus2(byte)]
/// ### du_cpb_removal_delay_increment_length_minus1
/// [VarHandle][#VH_du_cpb_removal_delay_increment_length_minus1] - [Getter][#du_cpb_removal_delay_increment_length_minus1()] - [Setter][#du_cpb_removal_delay_increment_length_minus1(byte)]
/// ### dpb_output_delay_du_length_minus1
/// [VarHandle][#VH_dpb_output_delay_du_length_minus1] - [Getter][#dpb_output_delay_du_length_minus1()] - [Setter][#dpb_output_delay_du_length_minus1(byte)]
/// ### bit_rate_scale
/// [VarHandle][#VH_bit_rate_scale] - [Getter][#bit_rate_scale()] - [Setter][#bit_rate_scale(byte)]
/// ### cpb_size_scale
/// [VarHandle][#VH_cpb_size_scale] - [Getter][#cpb_size_scale()] - [Setter][#cpb_size_scale(byte)]
/// ### cpb_size_du_scale
/// [VarHandle][#VH_cpb_size_du_scale] - [Getter][#cpb_size_du_scale()] - [Setter][#cpb_size_du_scale(byte)]
/// ### initial_cpb_removal_delay_length_minus1
/// [VarHandle][#VH_initial_cpb_removal_delay_length_minus1] - [Getter][#initial_cpb_removal_delay_length_minus1()] - [Setter][#initial_cpb_removal_delay_length_minus1(byte)]
/// ### au_cpb_removal_delay_length_minus1
/// [VarHandle][#VH_au_cpb_removal_delay_length_minus1] - [Getter][#au_cpb_removal_delay_length_minus1()] - [Setter][#au_cpb_removal_delay_length_minus1(byte)]
/// ### dpb_output_delay_length_minus1
/// [VarHandle][#VH_dpb_output_delay_length_minus1] - [Getter][#dpb_output_delay_length_minus1()] - [Setter][#dpb_output_delay_length_minus1(byte)]
/// ### cpb_cnt_minus1
/// [VarHandle][#VH_cpb_cnt_minus1] - [Getter][#cpb_cnt_minus1()] - [Setter][#cpb_cnt_minus1(byte)]
/// ### elemental_duration_in_tc_minus1
/// [VarHandle][#VH_elemental_duration_in_tc_minus1] - [Getter][#elemental_duration_in_tc_minus1()] - [Setter][#elemental_duration_in_tc_minus1(short)]
/// ### reserved
/// [VarHandle][#VH_reserved] - [Getter][#reserved()] - [Setter][#reserved(short)]
/// ### pSubLayerHrdParametersNal
/// [VarHandle][#VH_pSubLayerHrdParametersNal] - [Getter][#pSubLayerHrdParametersNal()] - [Setter][#pSubLayerHrdParametersNal(MemorySegment)]
/// ### pSubLayerHrdParametersVcl
/// [VarHandle][#VH_pSubLayerHrdParametersVcl] - [Getter][#pSubLayerHrdParametersVcl()] - [Setter][#pSubLayerHrdParametersVcl(MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct StdVideoH265HrdParameters {
///     StdVideoH265HrdFlags flags;
///     uint8_t tick_divisor_minus2;
///     uint8_t du_cpb_removal_delay_increment_length_minus1;
///     uint8_t dpb_output_delay_du_length_minus1;
///     uint8_t bit_rate_scale;
///     uint8_t cpb_size_scale;
///     uint8_t cpb_size_du_scale;
///     uint8_t initial_cpb_removal_delay_length_minus1;
///     uint8_t au_cpb_removal_delay_length_minus1;
///     uint8_t dpb_output_delay_length_minus1;
///     uint8_t [ ] cpb_cnt_minus1;
///     uint16_t [ ] elemental_duration_in_tc_minus1;
///     uint16_t [3] reserved;
///     const StdVideoH265SubLayerHrdParameters * pSubLayerHrdParametersNal;
///     const StdVideoH265SubLayerHrdParameters * pSubLayerHrdParametersVcl;
/// } StdVideoH265HrdParameters;
/// ```
public sealed class StdVideoH265HrdParameters extends Struct {
    /// The struct layout of `StdVideoH265HrdParameters`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        StdVideoH265HrdFlags.LAYOUT.withName("flags"),
        ValueLayout.JAVA_BYTE.withName("tick_divisor_minus2"),
        ValueLayout.JAVA_BYTE.withName("du_cpb_removal_delay_increment_length_minus1"),
        ValueLayout.JAVA_BYTE.withName("dpb_output_delay_du_length_minus1"),
        ValueLayout.JAVA_BYTE.withName("bit_rate_scale"),
        ValueLayout.JAVA_BYTE.withName("cpb_size_scale"),
        ValueLayout.JAVA_BYTE.withName("cpb_size_du_scale"),
        ValueLayout.JAVA_BYTE.withName("initial_cpb_removal_delay_length_minus1"),
        ValueLayout.JAVA_BYTE.withName("au_cpb_removal_delay_length_minus1"),
        ValueLayout.JAVA_BYTE.withName("dpb_output_delay_length_minus1"),
        ValueLayout.JAVA_BYTE.withName("cpb_cnt_minus1"),
        ValueLayout.JAVA_SHORT.withName("elemental_duration_in_tc_minus1"),
        ValueLayout.JAVA_SHORT.withName("reserved"),
        ValueLayout.ADDRESS.withName("pSubLayerHrdParametersNal"),
        ValueLayout.ADDRESS.withName("pSubLayerHrdParametersVcl")
    );
    /// The [VarHandle] of `flags` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    /// The [VarHandle] of `tick_divisor_minus2` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_tick_divisor_minus2 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("tick_divisor_minus2"));
    /// The [VarHandle] of `du_cpb_removal_delay_increment_length_minus1` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_du_cpb_removal_delay_increment_length_minus1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("du_cpb_removal_delay_increment_length_minus1"));
    /// The [VarHandle] of `dpb_output_delay_du_length_minus1` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_dpb_output_delay_du_length_minus1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dpb_output_delay_du_length_minus1"));
    /// The [VarHandle] of `bit_rate_scale` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_bit_rate_scale = LAYOUT.arrayElementVarHandle(PathElement.groupElement("bit_rate_scale"));
    /// The [VarHandle] of `cpb_size_scale` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_cpb_size_scale = LAYOUT.arrayElementVarHandle(PathElement.groupElement("cpb_size_scale"));
    /// The [VarHandle] of `cpb_size_du_scale` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_cpb_size_du_scale = LAYOUT.arrayElementVarHandle(PathElement.groupElement("cpb_size_du_scale"));
    /// The [VarHandle] of `initial_cpb_removal_delay_length_minus1` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_initial_cpb_removal_delay_length_minus1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("initial_cpb_removal_delay_length_minus1"));
    /// The [VarHandle] of `au_cpb_removal_delay_length_minus1` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_au_cpb_removal_delay_length_minus1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("au_cpb_removal_delay_length_minus1"));
    /// The [VarHandle] of `dpb_output_delay_length_minus1` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_dpb_output_delay_length_minus1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dpb_output_delay_length_minus1"));
    /// The [VarHandle] of `cpb_cnt_minus1` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_cpb_cnt_minus1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("cpb_cnt_minus1"));
    /// The [VarHandle] of `elemental_duration_in_tc_minus1` of type `(MemorySegment base, long baseOffset, long index)short`.
    public static final VarHandle VH_elemental_duration_in_tc_minus1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("elemental_duration_in_tc_minus1"));
    /// The [VarHandle] of `reserved` of type `(MemorySegment base, long baseOffset, long index)short`.
    public static final VarHandle VH_reserved = LAYOUT.arrayElementVarHandle(PathElement.groupElement("reserved"));
    /// The [VarHandle] of `pSubLayerHrdParametersNal` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pSubLayerHrdParametersNal = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pSubLayerHrdParametersNal"));
    /// The [VarHandle] of `pSubLayerHrdParametersVcl` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pSubLayerHrdParametersVcl = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pSubLayerHrdParametersVcl"));

    /// Creates `StdVideoH265HrdParameters` with the given segment.
    /// @param segment the memory segment
    public StdVideoH265HrdParameters(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `StdVideoH265HrdParameters` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoH265HrdParameters of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new StdVideoH265HrdParameters(segment); }

    /// Creates `StdVideoH265HrdParameters` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `StdVideoH265HrdParameters` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoH265HrdParameters ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new StdVideoH265HrdParameters(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `StdVideoH265HrdParameters` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `StdVideoH265HrdParameters` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoH265HrdParameters`
    public static StdVideoH265HrdParameters alloc(SegmentAllocator allocator) { return new StdVideoH265HrdParameters(allocator.allocate(LAYOUT)); }

    /// Allocates a `StdVideoH265HrdParameters` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `StdVideoH265HrdParameters`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `StdVideoH265HrdParameters` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoH265HrdParameters`
    public static StdVideoH265HrdParameters allocInit(SegmentAllocator allocator, @CType("StdVideoH265HrdFlags") MemorySegment flags, @CType("uint8_t") byte tick_divisor_minus2, @CType("uint8_t") byte du_cpb_removal_delay_increment_length_minus1, @CType("uint8_t") byte dpb_output_delay_du_length_minus1, @CType("uint8_t") byte bit_rate_scale, @CType("uint8_t") byte cpb_size_scale, @CType("uint8_t") byte cpb_size_du_scale, @CType("uint8_t") byte initial_cpb_removal_delay_length_minus1, @CType("uint8_t") byte au_cpb_removal_delay_length_minus1, @CType("uint8_t") byte dpb_output_delay_length_minus1, @CType("uint8_t [ ]") byte cpb_cnt_minus1, @CType("uint16_t [ ]") short elemental_duration_in_tc_minus1, @CType("uint16_t [3]") short reserved, @CType("const StdVideoH265SubLayerHrdParameters *") MemorySegment pSubLayerHrdParametersNal, @CType("const StdVideoH265SubLayerHrdParameters *") MemorySegment pSubLayerHrdParametersVcl) { return alloc(allocator).flags(flags).tick_divisor_minus2(tick_divisor_minus2).du_cpb_removal_delay_increment_length_minus1(du_cpb_removal_delay_increment_length_minus1).dpb_output_delay_du_length_minus1(dpb_output_delay_du_length_minus1).bit_rate_scale(bit_rate_scale).cpb_size_scale(cpb_size_scale).cpb_size_du_scale(cpb_size_du_scale).initial_cpb_removal_delay_length_minus1(initial_cpb_removal_delay_length_minus1).au_cpb_removal_delay_length_minus1(au_cpb_removal_delay_length_minus1).dpb_output_delay_length_minus1(dpb_output_delay_length_minus1).cpb_cnt_minus1(cpb_cnt_minus1).elemental_duration_in_tc_minus1(elemental_duration_in_tc_minus1).reserved(reserved).pSubLayerHrdParametersNal(pSubLayerHrdParametersNal).pSubLayerHrdParametersVcl(pSubLayerHrdParametersVcl); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public StdVideoH265HrdParameters copyFrom(StdVideoH265HrdParameters src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("StdVideoH265HrdFlags") MemorySegment get_flags(MemorySegment segment, long index) { return (MemorySegment) VH_flags.get(segment, 0L, index); }
    /// {@return `flags`}
    /// @param segment the segment of the struct
    public static @CType("StdVideoH265HrdFlags") MemorySegment get_flags(MemorySegment segment) { return StdVideoH265HrdParameters.get_flags(segment, 0L); }
    /// {@return `flags`}
    public @CType("StdVideoH265HrdFlags") MemorySegment flags() { return StdVideoH265HrdParameters.get_flags(this.segment()); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_flags(MemorySegment segment, long index, @CType("StdVideoH265HrdFlags") MemorySegment value) { VH_flags.set(segment, 0L, index, value); }
    /// Sets `flags` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_flags(MemorySegment segment, @CType("StdVideoH265HrdFlags") MemorySegment value) { StdVideoH265HrdParameters.set_flags(segment, 0L, value); }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265HrdParameters flags(@CType("StdVideoH265HrdFlags") MemorySegment value) { StdVideoH265HrdParameters.set_flags(this.segment(), value); return this; }

    /// {@return `tick_divisor_minus2` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t") byte get_tick_divisor_minus2(MemorySegment segment, long index) { return (byte) VH_tick_divisor_minus2.get(segment, 0L, index); }
    /// {@return `tick_divisor_minus2`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t") byte get_tick_divisor_minus2(MemorySegment segment) { return StdVideoH265HrdParameters.get_tick_divisor_minus2(segment, 0L); }
    /// {@return `tick_divisor_minus2`}
    public @CType("uint8_t") byte tick_divisor_minus2() { return StdVideoH265HrdParameters.get_tick_divisor_minus2(this.segment()); }
    /// Sets `tick_divisor_minus2` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_tick_divisor_minus2(MemorySegment segment, long index, @CType("uint8_t") byte value) { VH_tick_divisor_minus2.set(segment, 0L, index, value); }
    /// Sets `tick_divisor_minus2` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_tick_divisor_minus2(MemorySegment segment, @CType("uint8_t") byte value) { StdVideoH265HrdParameters.set_tick_divisor_minus2(segment, 0L, value); }
    /// Sets `tick_divisor_minus2` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265HrdParameters tick_divisor_minus2(@CType("uint8_t") byte value) { StdVideoH265HrdParameters.set_tick_divisor_minus2(this.segment(), value); return this; }

    /// {@return `du_cpb_removal_delay_increment_length_minus1` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t") byte get_du_cpb_removal_delay_increment_length_minus1(MemorySegment segment, long index) { return (byte) VH_du_cpb_removal_delay_increment_length_minus1.get(segment, 0L, index); }
    /// {@return `du_cpb_removal_delay_increment_length_minus1`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t") byte get_du_cpb_removal_delay_increment_length_minus1(MemorySegment segment) { return StdVideoH265HrdParameters.get_du_cpb_removal_delay_increment_length_minus1(segment, 0L); }
    /// {@return `du_cpb_removal_delay_increment_length_minus1`}
    public @CType("uint8_t") byte du_cpb_removal_delay_increment_length_minus1() { return StdVideoH265HrdParameters.get_du_cpb_removal_delay_increment_length_minus1(this.segment()); }
    /// Sets `du_cpb_removal_delay_increment_length_minus1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_du_cpb_removal_delay_increment_length_minus1(MemorySegment segment, long index, @CType("uint8_t") byte value) { VH_du_cpb_removal_delay_increment_length_minus1.set(segment, 0L, index, value); }
    /// Sets `du_cpb_removal_delay_increment_length_minus1` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_du_cpb_removal_delay_increment_length_minus1(MemorySegment segment, @CType("uint8_t") byte value) { StdVideoH265HrdParameters.set_du_cpb_removal_delay_increment_length_minus1(segment, 0L, value); }
    /// Sets `du_cpb_removal_delay_increment_length_minus1` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265HrdParameters du_cpb_removal_delay_increment_length_minus1(@CType("uint8_t") byte value) { StdVideoH265HrdParameters.set_du_cpb_removal_delay_increment_length_minus1(this.segment(), value); return this; }

    /// {@return `dpb_output_delay_du_length_minus1` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t") byte get_dpb_output_delay_du_length_minus1(MemorySegment segment, long index) { return (byte) VH_dpb_output_delay_du_length_minus1.get(segment, 0L, index); }
    /// {@return `dpb_output_delay_du_length_minus1`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t") byte get_dpb_output_delay_du_length_minus1(MemorySegment segment) { return StdVideoH265HrdParameters.get_dpb_output_delay_du_length_minus1(segment, 0L); }
    /// {@return `dpb_output_delay_du_length_minus1`}
    public @CType("uint8_t") byte dpb_output_delay_du_length_minus1() { return StdVideoH265HrdParameters.get_dpb_output_delay_du_length_minus1(this.segment()); }
    /// Sets `dpb_output_delay_du_length_minus1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_dpb_output_delay_du_length_minus1(MemorySegment segment, long index, @CType("uint8_t") byte value) { VH_dpb_output_delay_du_length_minus1.set(segment, 0L, index, value); }
    /// Sets `dpb_output_delay_du_length_minus1` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_dpb_output_delay_du_length_minus1(MemorySegment segment, @CType("uint8_t") byte value) { StdVideoH265HrdParameters.set_dpb_output_delay_du_length_minus1(segment, 0L, value); }
    /// Sets `dpb_output_delay_du_length_minus1` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265HrdParameters dpb_output_delay_du_length_minus1(@CType("uint8_t") byte value) { StdVideoH265HrdParameters.set_dpb_output_delay_du_length_minus1(this.segment(), value); return this; }

    /// {@return `bit_rate_scale` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t") byte get_bit_rate_scale(MemorySegment segment, long index) { return (byte) VH_bit_rate_scale.get(segment, 0L, index); }
    /// {@return `bit_rate_scale`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t") byte get_bit_rate_scale(MemorySegment segment) { return StdVideoH265HrdParameters.get_bit_rate_scale(segment, 0L); }
    /// {@return `bit_rate_scale`}
    public @CType("uint8_t") byte bit_rate_scale() { return StdVideoH265HrdParameters.get_bit_rate_scale(this.segment()); }
    /// Sets `bit_rate_scale` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_bit_rate_scale(MemorySegment segment, long index, @CType("uint8_t") byte value) { VH_bit_rate_scale.set(segment, 0L, index, value); }
    /// Sets `bit_rate_scale` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_bit_rate_scale(MemorySegment segment, @CType("uint8_t") byte value) { StdVideoH265HrdParameters.set_bit_rate_scale(segment, 0L, value); }
    /// Sets `bit_rate_scale` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265HrdParameters bit_rate_scale(@CType("uint8_t") byte value) { StdVideoH265HrdParameters.set_bit_rate_scale(this.segment(), value); return this; }

    /// {@return `cpb_size_scale` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t") byte get_cpb_size_scale(MemorySegment segment, long index) { return (byte) VH_cpb_size_scale.get(segment, 0L, index); }
    /// {@return `cpb_size_scale`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t") byte get_cpb_size_scale(MemorySegment segment) { return StdVideoH265HrdParameters.get_cpb_size_scale(segment, 0L); }
    /// {@return `cpb_size_scale`}
    public @CType("uint8_t") byte cpb_size_scale() { return StdVideoH265HrdParameters.get_cpb_size_scale(this.segment()); }
    /// Sets `cpb_size_scale` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_cpb_size_scale(MemorySegment segment, long index, @CType("uint8_t") byte value) { VH_cpb_size_scale.set(segment, 0L, index, value); }
    /// Sets `cpb_size_scale` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_cpb_size_scale(MemorySegment segment, @CType("uint8_t") byte value) { StdVideoH265HrdParameters.set_cpb_size_scale(segment, 0L, value); }
    /// Sets `cpb_size_scale` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265HrdParameters cpb_size_scale(@CType("uint8_t") byte value) { StdVideoH265HrdParameters.set_cpb_size_scale(this.segment(), value); return this; }

    /// {@return `cpb_size_du_scale` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t") byte get_cpb_size_du_scale(MemorySegment segment, long index) { return (byte) VH_cpb_size_du_scale.get(segment, 0L, index); }
    /// {@return `cpb_size_du_scale`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t") byte get_cpb_size_du_scale(MemorySegment segment) { return StdVideoH265HrdParameters.get_cpb_size_du_scale(segment, 0L); }
    /// {@return `cpb_size_du_scale`}
    public @CType("uint8_t") byte cpb_size_du_scale() { return StdVideoH265HrdParameters.get_cpb_size_du_scale(this.segment()); }
    /// Sets `cpb_size_du_scale` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_cpb_size_du_scale(MemorySegment segment, long index, @CType("uint8_t") byte value) { VH_cpb_size_du_scale.set(segment, 0L, index, value); }
    /// Sets `cpb_size_du_scale` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_cpb_size_du_scale(MemorySegment segment, @CType("uint8_t") byte value) { StdVideoH265HrdParameters.set_cpb_size_du_scale(segment, 0L, value); }
    /// Sets `cpb_size_du_scale` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265HrdParameters cpb_size_du_scale(@CType("uint8_t") byte value) { StdVideoH265HrdParameters.set_cpb_size_du_scale(this.segment(), value); return this; }

    /// {@return `initial_cpb_removal_delay_length_minus1` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t") byte get_initial_cpb_removal_delay_length_minus1(MemorySegment segment, long index) { return (byte) VH_initial_cpb_removal_delay_length_minus1.get(segment, 0L, index); }
    /// {@return `initial_cpb_removal_delay_length_minus1`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t") byte get_initial_cpb_removal_delay_length_minus1(MemorySegment segment) { return StdVideoH265HrdParameters.get_initial_cpb_removal_delay_length_minus1(segment, 0L); }
    /// {@return `initial_cpb_removal_delay_length_minus1`}
    public @CType("uint8_t") byte initial_cpb_removal_delay_length_minus1() { return StdVideoH265HrdParameters.get_initial_cpb_removal_delay_length_minus1(this.segment()); }
    /// Sets `initial_cpb_removal_delay_length_minus1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_initial_cpb_removal_delay_length_minus1(MemorySegment segment, long index, @CType("uint8_t") byte value) { VH_initial_cpb_removal_delay_length_minus1.set(segment, 0L, index, value); }
    /// Sets `initial_cpb_removal_delay_length_minus1` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_initial_cpb_removal_delay_length_minus1(MemorySegment segment, @CType("uint8_t") byte value) { StdVideoH265HrdParameters.set_initial_cpb_removal_delay_length_minus1(segment, 0L, value); }
    /// Sets `initial_cpb_removal_delay_length_minus1` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265HrdParameters initial_cpb_removal_delay_length_minus1(@CType("uint8_t") byte value) { StdVideoH265HrdParameters.set_initial_cpb_removal_delay_length_minus1(this.segment(), value); return this; }

    /// {@return `au_cpb_removal_delay_length_minus1` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t") byte get_au_cpb_removal_delay_length_minus1(MemorySegment segment, long index) { return (byte) VH_au_cpb_removal_delay_length_minus1.get(segment, 0L, index); }
    /// {@return `au_cpb_removal_delay_length_minus1`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t") byte get_au_cpb_removal_delay_length_minus1(MemorySegment segment) { return StdVideoH265HrdParameters.get_au_cpb_removal_delay_length_minus1(segment, 0L); }
    /// {@return `au_cpb_removal_delay_length_minus1`}
    public @CType("uint8_t") byte au_cpb_removal_delay_length_minus1() { return StdVideoH265HrdParameters.get_au_cpb_removal_delay_length_minus1(this.segment()); }
    /// Sets `au_cpb_removal_delay_length_minus1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_au_cpb_removal_delay_length_minus1(MemorySegment segment, long index, @CType("uint8_t") byte value) { VH_au_cpb_removal_delay_length_minus1.set(segment, 0L, index, value); }
    /// Sets `au_cpb_removal_delay_length_minus1` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_au_cpb_removal_delay_length_minus1(MemorySegment segment, @CType("uint8_t") byte value) { StdVideoH265HrdParameters.set_au_cpb_removal_delay_length_minus1(segment, 0L, value); }
    /// Sets `au_cpb_removal_delay_length_minus1` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265HrdParameters au_cpb_removal_delay_length_minus1(@CType("uint8_t") byte value) { StdVideoH265HrdParameters.set_au_cpb_removal_delay_length_minus1(this.segment(), value); return this; }

    /// {@return `dpb_output_delay_length_minus1` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t") byte get_dpb_output_delay_length_minus1(MemorySegment segment, long index) { return (byte) VH_dpb_output_delay_length_minus1.get(segment, 0L, index); }
    /// {@return `dpb_output_delay_length_minus1`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t") byte get_dpb_output_delay_length_minus1(MemorySegment segment) { return StdVideoH265HrdParameters.get_dpb_output_delay_length_minus1(segment, 0L); }
    /// {@return `dpb_output_delay_length_minus1`}
    public @CType("uint8_t") byte dpb_output_delay_length_minus1() { return StdVideoH265HrdParameters.get_dpb_output_delay_length_minus1(this.segment()); }
    /// Sets `dpb_output_delay_length_minus1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_dpb_output_delay_length_minus1(MemorySegment segment, long index, @CType("uint8_t") byte value) { VH_dpb_output_delay_length_minus1.set(segment, 0L, index, value); }
    /// Sets `dpb_output_delay_length_minus1` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_dpb_output_delay_length_minus1(MemorySegment segment, @CType("uint8_t") byte value) { StdVideoH265HrdParameters.set_dpb_output_delay_length_minus1(segment, 0L, value); }
    /// Sets `dpb_output_delay_length_minus1` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265HrdParameters dpb_output_delay_length_minus1(@CType("uint8_t") byte value) { StdVideoH265HrdParameters.set_dpb_output_delay_length_minus1(this.segment(), value); return this; }

    /// {@return `cpb_cnt_minus1` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t [ ]") byte get_cpb_cnt_minus1(MemorySegment segment, long index) { return (byte) VH_cpb_cnt_minus1.get(segment, 0L, index); }
    /// {@return `cpb_cnt_minus1`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t [ ]") byte get_cpb_cnt_minus1(MemorySegment segment) { return StdVideoH265HrdParameters.get_cpb_cnt_minus1(segment, 0L); }
    /// {@return `cpb_cnt_minus1`}
    public @CType("uint8_t [ ]") byte cpb_cnt_minus1() { return StdVideoH265HrdParameters.get_cpb_cnt_minus1(this.segment()); }
    /// Sets `cpb_cnt_minus1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_cpb_cnt_minus1(MemorySegment segment, long index, @CType("uint8_t [ ]") byte value) { VH_cpb_cnt_minus1.set(segment, 0L, index, value); }
    /// Sets `cpb_cnt_minus1` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_cpb_cnt_minus1(MemorySegment segment, @CType("uint8_t [ ]") byte value) { StdVideoH265HrdParameters.set_cpb_cnt_minus1(segment, 0L, value); }
    /// Sets `cpb_cnt_minus1` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265HrdParameters cpb_cnt_minus1(@CType("uint8_t [ ]") byte value) { StdVideoH265HrdParameters.set_cpb_cnt_minus1(this.segment(), value); return this; }

    /// {@return `elemental_duration_in_tc_minus1` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint16_t [ ]") short get_elemental_duration_in_tc_minus1(MemorySegment segment, long index) { return (short) VH_elemental_duration_in_tc_minus1.get(segment, 0L, index); }
    /// {@return `elemental_duration_in_tc_minus1`}
    /// @param segment the segment of the struct
    public static @CType("uint16_t [ ]") short get_elemental_duration_in_tc_minus1(MemorySegment segment) { return StdVideoH265HrdParameters.get_elemental_duration_in_tc_minus1(segment, 0L); }
    /// {@return `elemental_duration_in_tc_minus1`}
    public @CType("uint16_t [ ]") short elemental_duration_in_tc_minus1() { return StdVideoH265HrdParameters.get_elemental_duration_in_tc_minus1(this.segment()); }
    /// Sets `elemental_duration_in_tc_minus1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_elemental_duration_in_tc_minus1(MemorySegment segment, long index, @CType("uint16_t [ ]") short value) { VH_elemental_duration_in_tc_minus1.set(segment, 0L, index, value); }
    /// Sets `elemental_duration_in_tc_minus1` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_elemental_duration_in_tc_minus1(MemorySegment segment, @CType("uint16_t [ ]") short value) { StdVideoH265HrdParameters.set_elemental_duration_in_tc_minus1(segment, 0L, value); }
    /// Sets `elemental_duration_in_tc_minus1` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265HrdParameters elemental_duration_in_tc_minus1(@CType("uint16_t [ ]") short value) { StdVideoH265HrdParameters.set_elemental_duration_in_tc_minus1(this.segment(), value); return this; }

    /// {@return `reserved` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint16_t [3]") short get_reserved(MemorySegment segment, long index) { return (short) VH_reserved.get(segment, 0L, index); }
    /// {@return `reserved`}
    /// @param segment the segment of the struct
    public static @CType("uint16_t [3]") short get_reserved(MemorySegment segment) { return StdVideoH265HrdParameters.get_reserved(segment, 0L); }
    /// {@return `reserved`}
    public @CType("uint16_t [3]") short reserved() { return StdVideoH265HrdParameters.get_reserved(this.segment()); }
    /// Sets `reserved` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_reserved(MemorySegment segment, long index, @CType("uint16_t [3]") short value) { VH_reserved.set(segment, 0L, index, value); }
    /// Sets `reserved` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_reserved(MemorySegment segment, @CType("uint16_t [3]") short value) { StdVideoH265HrdParameters.set_reserved(segment, 0L, value); }
    /// Sets `reserved` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265HrdParameters reserved(@CType("uint16_t [3]") short value) { StdVideoH265HrdParameters.set_reserved(this.segment(), value); return this; }

    /// {@return `pSubLayerHrdParametersNal` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const StdVideoH265SubLayerHrdParameters *") MemorySegment get_pSubLayerHrdParametersNal(MemorySegment segment, long index) { return (MemorySegment) VH_pSubLayerHrdParametersNal.get(segment, 0L, index); }
    /// {@return `pSubLayerHrdParametersNal`}
    /// @param segment the segment of the struct
    public static @CType("const StdVideoH265SubLayerHrdParameters *") MemorySegment get_pSubLayerHrdParametersNal(MemorySegment segment) { return StdVideoH265HrdParameters.get_pSubLayerHrdParametersNal(segment, 0L); }
    /// {@return `pSubLayerHrdParametersNal`}
    public @CType("const StdVideoH265SubLayerHrdParameters *") MemorySegment pSubLayerHrdParametersNal() { return StdVideoH265HrdParameters.get_pSubLayerHrdParametersNal(this.segment()); }
    /// Sets `pSubLayerHrdParametersNal` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pSubLayerHrdParametersNal(MemorySegment segment, long index, @CType("const StdVideoH265SubLayerHrdParameters *") MemorySegment value) { VH_pSubLayerHrdParametersNal.set(segment, 0L, index, value); }
    /// Sets `pSubLayerHrdParametersNal` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pSubLayerHrdParametersNal(MemorySegment segment, @CType("const StdVideoH265SubLayerHrdParameters *") MemorySegment value) { StdVideoH265HrdParameters.set_pSubLayerHrdParametersNal(segment, 0L, value); }
    /// Sets `pSubLayerHrdParametersNal` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265HrdParameters pSubLayerHrdParametersNal(@CType("const StdVideoH265SubLayerHrdParameters *") MemorySegment value) { StdVideoH265HrdParameters.set_pSubLayerHrdParametersNal(this.segment(), value); return this; }

    /// {@return `pSubLayerHrdParametersVcl` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const StdVideoH265SubLayerHrdParameters *") MemorySegment get_pSubLayerHrdParametersVcl(MemorySegment segment, long index) { return (MemorySegment) VH_pSubLayerHrdParametersVcl.get(segment, 0L, index); }
    /// {@return `pSubLayerHrdParametersVcl`}
    /// @param segment the segment of the struct
    public static @CType("const StdVideoH265SubLayerHrdParameters *") MemorySegment get_pSubLayerHrdParametersVcl(MemorySegment segment) { return StdVideoH265HrdParameters.get_pSubLayerHrdParametersVcl(segment, 0L); }
    /// {@return `pSubLayerHrdParametersVcl`}
    public @CType("const StdVideoH265SubLayerHrdParameters *") MemorySegment pSubLayerHrdParametersVcl() { return StdVideoH265HrdParameters.get_pSubLayerHrdParametersVcl(this.segment()); }
    /// Sets `pSubLayerHrdParametersVcl` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pSubLayerHrdParametersVcl(MemorySegment segment, long index, @CType("const StdVideoH265SubLayerHrdParameters *") MemorySegment value) { VH_pSubLayerHrdParametersVcl.set(segment, 0L, index, value); }
    /// Sets `pSubLayerHrdParametersVcl` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pSubLayerHrdParametersVcl(MemorySegment segment, @CType("const StdVideoH265SubLayerHrdParameters *") MemorySegment value) { StdVideoH265HrdParameters.set_pSubLayerHrdParametersVcl(segment, 0L, value); }
    /// Sets `pSubLayerHrdParametersVcl` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265HrdParameters pSubLayerHrdParametersVcl(@CType("const StdVideoH265SubLayerHrdParameters *") MemorySegment value) { StdVideoH265HrdParameters.set_pSubLayerHrdParametersVcl(this.segment(), value); return this; }

    /// A buffer of [StdVideoH265HrdParameters].
    public static final class Buffer extends StdVideoH265HrdParameters {
        private final long elementCount;

        /// Creates `StdVideoH265HrdParameters.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `StdVideoH265HrdParameters`.
        /// @param index the index of the struct buffer
        /// @return the slice of `StdVideoH265HrdParameters`
        public StdVideoH265HrdParameters asSlice(long index) { return new StdVideoH265HrdParameters(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `StdVideoH265HrdParameters`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `StdVideoH265HrdParameters`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `flags` at the given index}
        /// @param index the index
        public @CType("StdVideoH265HrdFlags") MemorySegment flagsAt(long index) { return StdVideoH265HrdParameters.get_flags(this.segment(), index); }
        /// Sets `flags` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer flagsAt(long index, @CType("StdVideoH265HrdFlags") MemorySegment value) { StdVideoH265HrdParameters.set_flags(this.segment(), index, value); return this; }

        /// {@return `tick_divisor_minus2` at the given index}
        /// @param index the index
        public @CType("uint8_t") byte tick_divisor_minus2At(long index) { return StdVideoH265HrdParameters.get_tick_divisor_minus2(this.segment(), index); }
        /// Sets `tick_divisor_minus2` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer tick_divisor_minus2At(long index, @CType("uint8_t") byte value) { StdVideoH265HrdParameters.set_tick_divisor_minus2(this.segment(), index, value); return this; }

        /// {@return `du_cpb_removal_delay_increment_length_minus1` at the given index}
        /// @param index the index
        public @CType("uint8_t") byte du_cpb_removal_delay_increment_length_minus1At(long index) { return StdVideoH265HrdParameters.get_du_cpb_removal_delay_increment_length_minus1(this.segment(), index); }
        /// Sets `du_cpb_removal_delay_increment_length_minus1` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer du_cpb_removal_delay_increment_length_minus1At(long index, @CType("uint8_t") byte value) { StdVideoH265HrdParameters.set_du_cpb_removal_delay_increment_length_minus1(this.segment(), index, value); return this; }

        /// {@return `dpb_output_delay_du_length_minus1` at the given index}
        /// @param index the index
        public @CType("uint8_t") byte dpb_output_delay_du_length_minus1At(long index) { return StdVideoH265HrdParameters.get_dpb_output_delay_du_length_minus1(this.segment(), index); }
        /// Sets `dpb_output_delay_du_length_minus1` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer dpb_output_delay_du_length_minus1At(long index, @CType("uint8_t") byte value) { StdVideoH265HrdParameters.set_dpb_output_delay_du_length_minus1(this.segment(), index, value); return this; }

        /// {@return `bit_rate_scale` at the given index}
        /// @param index the index
        public @CType("uint8_t") byte bit_rate_scaleAt(long index) { return StdVideoH265HrdParameters.get_bit_rate_scale(this.segment(), index); }
        /// Sets `bit_rate_scale` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer bit_rate_scaleAt(long index, @CType("uint8_t") byte value) { StdVideoH265HrdParameters.set_bit_rate_scale(this.segment(), index, value); return this; }

        /// {@return `cpb_size_scale` at the given index}
        /// @param index the index
        public @CType("uint8_t") byte cpb_size_scaleAt(long index) { return StdVideoH265HrdParameters.get_cpb_size_scale(this.segment(), index); }
        /// Sets `cpb_size_scale` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer cpb_size_scaleAt(long index, @CType("uint8_t") byte value) { StdVideoH265HrdParameters.set_cpb_size_scale(this.segment(), index, value); return this; }

        /// {@return `cpb_size_du_scale` at the given index}
        /// @param index the index
        public @CType("uint8_t") byte cpb_size_du_scaleAt(long index) { return StdVideoH265HrdParameters.get_cpb_size_du_scale(this.segment(), index); }
        /// Sets `cpb_size_du_scale` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer cpb_size_du_scaleAt(long index, @CType("uint8_t") byte value) { StdVideoH265HrdParameters.set_cpb_size_du_scale(this.segment(), index, value); return this; }

        /// {@return `initial_cpb_removal_delay_length_minus1` at the given index}
        /// @param index the index
        public @CType("uint8_t") byte initial_cpb_removal_delay_length_minus1At(long index) { return StdVideoH265HrdParameters.get_initial_cpb_removal_delay_length_minus1(this.segment(), index); }
        /// Sets `initial_cpb_removal_delay_length_minus1` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer initial_cpb_removal_delay_length_minus1At(long index, @CType("uint8_t") byte value) { StdVideoH265HrdParameters.set_initial_cpb_removal_delay_length_minus1(this.segment(), index, value); return this; }

        /// {@return `au_cpb_removal_delay_length_minus1` at the given index}
        /// @param index the index
        public @CType("uint8_t") byte au_cpb_removal_delay_length_minus1At(long index) { return StdVideoH265HrdParameters.get_au_cpb_removal_delay_length_minus1(this.segment(), index); }
        /// Sets `au_cpb_removal_delay_length_minus1` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer au_cpb_removal_delay_length_minus1At(long index, @CType("uint8_t") byte value) { StdVideoH265HrdParameters.set_au_cpb_removal_delay_length_minus1(this.segment(), index, value); return this; }

        /// {@return `dpb_output_delay_length_minus1` at the given index}
        /// @param index the index
        public @CType("uint8_t") byte dpb_output_delay_length_minus1At(long index) { return StdVideoH265HrdParameters.get_dpb_output_delay_length_minus1(this.segment(), index); }
        /// Sets `dpb_output_delay_length_minus1` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer dpb_output_delay_length_minus1At(long index, @CType("uint8_t") byte value) { StdVideoH265HrdParameters.set_dpb_output_delay_length_minus1(this.segment(), index, value); return this; }

        /// {@return `cpb_cnt_minus1` at the given index}
        /// @param index the index
        public @CType("uint8_t [ ]") byte cpb_cnt_minus1At(long index) { return StdVideoH265HrdParameters.get_cpb_cnt_minus1(this.segment(), index); }
        /// Sets `cpb_cnt_minus1` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer cpb_cnt_minus1At(long index, @CType("uint8_t [ ]") byte value) { StdVideoH265HrdParameters.set_cpb_cnt_minus1(this.segment(), index, value); return this; }

        /// {@return `elemental_duration_in_tc_minus1` at the given index}
        /// @param index the index
        public @CType("uint16_t [ ]") short elemental_duration_in_tc_minus1At(long index) { return StdVideoH265HrdParameters.get_elemental_duration_in_tc_minus1(this.segment(), index); }
        /// Sets `elemental_duration_in_tc_minus1` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer elemental_duration_in_tc_minus1At(long index, @CType("uint16_t [ ]") short value) { StdVideoH265HrdParameters.set_elemental_duration_in_tc_minus1(this.segment(), index, value); return this; }

        /// {@return `reserved` at the given index}
        /// @param index the index
        public @CType("uint16_t [3]") short reservedAt(long index) { return StdVideoH265HrdParameters.get_reserved(this.segment(), index); }
        /// Sets `reserved` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer reservedAt(long index, @CType("uint16_t [3]") short value) { StdVideoH265HrdParameters.set_reserved(this.segment(), index, value); return this; }

        /// {@return `pSubLayerHrdParametersNal` at the given index}
        /// @param index the index
        public @CType("const StdVideoH265SubLayerHrdParameters *") MemorySegment pSubLayerHrdParametersNalAt(long index) { return StdVideoH265HrdParameters.get_pSubLayerHrdParametersNal(this.segment(), index); }
        /// Sets `pSubLayerHrdParametersNal` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pSubLayerHrdParametersNalAt(long index, @CType("const StdVideoH265SubLayerHrdParameters *") MemorySegment value) { StdVideoH265HrdParameters.set_pSubLayerHrdParametersNal(this.segment(), index, value); return this; }

        /// {@return `pSubLayerHrdParametersVcl` at the given index}
        /// @param index the index
        public @CType("const StdVideoH265SubLayerHrdParameters *") MemorySegment pSubLayerHrdParametersVclAt(long index) { return StdVideoH265HrdParameters.get_pSubLayerHrdParametersVcl(this.segment(), index); }
        /// Sets `pSubLayerHrdParametersVcl` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pSubLayerHrdParametersVclAt(long index, @CType("const StdVideoH265SubLayerHrdParameters *") MemorySegment value) { StdVideoH265HrdParameters.set_pSubLayerHrdParametersVcl(this.segment(), index, value); return this; }

    }
}
