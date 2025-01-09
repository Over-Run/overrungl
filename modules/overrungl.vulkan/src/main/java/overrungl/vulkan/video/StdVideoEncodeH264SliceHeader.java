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
/// [VarHandle][#VH_flags] - [Getter][#flags()] - [Setter][#flags(java.lang.foreign.MemorySegment)]
/// ### first_mb_in_slice
/// [VarHandle][#VH_first_mb_in_slice] - [Getter][#first_mb_in_slice()] - [Setter][#first_mb_in_slice(int)]
/// ### slice_type
/// [VarHandle][#VH_slice_type] - [Getter][#slice_type()] - [Setter][#slice_type(int)]
/// ### slice_alpha_c0_offset_div2
/// [VarHandle][#VH_slice_alpha_c0_offset_div2] - [Getter][#slice_alpha_c0_offset_div2()] - [Setter][#slice_alpha_c0_offset_div2(byte)]
/// ### slice_beta_offset_div2
/// [VarHandle][#VH_slice_beta_offset_div2] - [Getter][#slice_beta_offset_div2()] - [Setter][#slice_beta_offset_div2(byte)]
/// ### slice_qp_delta
/// [VarHandle][#VH_slice_qp_delta] - [Getter][#slice_qp_delta()] - [Setter][#slice_qp_delta(byte)]
/// ### reserved1
/// [VarHandle][#VH_reserved1] - [Getter][#reserved1()] - [Setter][#reserved1(byte)]
/// ### cabac_init_idc
/// [VarHandle][#VH_cabac_init_idc] - [Getter][#cabac_init_idc()] - [Setter][#cabac_init_idc(int)]
/// ### disable_deblocking_filter_idc
/// [VarHandle][#VH_disable_deblocking_filter_idc] - [Getter][#disable_deblocking_filter_idc()] - [Setter][#disable_deblocking_filter_idc(int)]
/// ### pWeightTable
/// [VarHandle][#VH_pWeightTable] - [Getter][#pWeightTable()] - [Setter][#pWeightTable(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct StdVideoEncodeH264SliceHeader {
///     StdVideoEncodeH264SliceHeaderFlags flags;
///     uint32_t first_mb_in_slice;
///     StdVideoH264SliceType slice_type;
///     int8_t slice_alpha_c0_offset_div2;
///     int8_t slice_beta_offset_div2;
///     int8_t slice_qp_delta;
///     uint8_t reserved1;
///     StdVideoH264CabacInitIdc cabac_init_idc;
///     StdVideoH264DisableDeblockingFilterIdc disable_deblocking_filter_idc;
///     const StdVideoEncodeH264WeightTable * pWeightTable;
/// } StdVideoEncodeH264SliceHeader;
/// ```
public final class StdVideoEncodeH264SliceHeader extends Struct {
    /// The struct layout of `StdVideoEncodeH264SliceHeader`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        StdVideoEncodeH264SliceHeaderFlags.LAYOUT.withName("flags"),
        ValueLayout.JAVA_INT.withName("first_mb_in_slice"),
        ValueLayout.JAVA_INT.withName("slice_type"),
        ValueLayout.JAVA_BYTE.withName("slice_alpha_c0_offset_div2"),
        ValueLayout.JAVA_BYTE.withName("slice_beta_offset_div2"),
        ValueLayout.JAVA_BYTE.withName("slice_qp_delta"),
        ValueLayout.JAVA_BYTE.withName("reserved1"),
        ValueLayout.JAVA_INT.withName("cabac_init_idc"),
        ValueLayout.JAVA_INT.withName("disable_deblocking_filter_idc"),
        ValueLayout.ADDRESS.withName("pWeightTable")
    );
    /// The [VarHandle] of `flags` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    /// The [VarHandle] of `first_mb_in_slice` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_first_mb_in_slice = LAYOUT.arrayElementVarHandle(PathElement.groupElement("first_mb_in_slice"));
    /// The [VarHandle] of `slice_type` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_slice_type = LAYOUT.arrayElementVarHandle(PathElement.groupElement("slice_type"));
    /// The [VarHandle] of `slice_alpha_c0_offset_div2` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_slice_alpha_c0_offset_div2 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("slice_alpha_c0_offset_div2"));
    /// The [VarHandle] of `slice_beta_offset_div2` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_slice_beta_offset_div2 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("slice_beta_offset_div2"));
    /// The [VarHandle] of `slice_qp_delta` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_slice_qp_delta = LAYOUT.arrayElementVarHandle(PathElement.groupElement("slice_qp_delta"));
    /// The [VarHandle] of `reserved1` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_reserved1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("reserved1"));
    /// The [VarHandle] of `cabac_init_idc` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_cabac_init_idc = LAYOUT.arrayElementVarHandle(PathElement.groupElement("cabac_init_idc"));
    /// The [VarHandle] of `disable_deblocking_filter_idc` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_disable_deblocking_filter_idc = LAYOUT.arrayElementVarHandle(PathElement.groupElement("disable_deblocking_filter_idc"));
    /// The [VarHandle] of `pWeightTable` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pWeightTable = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pWeightTable"));

    /// Creates `StdVideoEncodeH264SliceHeader` with the given segment.
    /// @param segment the memory segment
    public StdVideoEncodeH264SliceHeader(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `StdVideoEncodeH264SliceHeader` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoEncodeH264SliceHeader of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new StdVideoEncodeH264SliceHeader(segment); }

    /// Creates `StdVideoEncodeH264SliceHeader` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoEncodeH264SliceHeader ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new StdVideoEncodeH264SliceHeader(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `StdVideoEncodeH264SliceHeader` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoEncodeH264SliceHeader ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new StdVideoEncodeH264SliceHeader(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `StdVideoEncodeH264SliceHeader` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoEncodeH264SliceHeader`
    public static StdVideoEncodeH264SliceHeader alloc(SegmentAllocator allocator) { return new StdVideoEncodeH264SliceHeader(allocator.allocate(LAYOUT)); }

    /// Allocates a `StdVideoEncodeH264SliceHeader` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `StdVideoEncodeH264SliceHeader`
    public static StdVideoEncodeH264SliceHeader alloc(SegmentAllocator allocator, long count) { return new StdVideoEncodeH264SliceHeader(allocator.allocate(LAYOUT, count)); }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("StdVideoEncodeH264SliceHeaderFlags") java.lang.foreign.MemorySegment get_flags(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_flags.get(segment, 0L, index); }
    /// {@return `flags`}
    /// @param segment the segment of the struct
    public static @CType("StdVideoEncodeH264SliceHeaderFlags") java.lang.foreign.MemorySegment get_flags(MemorySegment segment) { return StdVideoEncodeH264SliceHeader.get_flags(segment, 0L); }
    /// {@return `flags` at the given index}
    /// @param index the index
    public @CType("StdVideoEncodeH264SliceHeaderFlags") java.lang.foreign.MemorySegment flagsAt(long index) { return StdVideoEncodeH264SliceHeader.get_flags(this.segment(), index); }
    /// {@return `flags`}
    public @CType("StdVideoEncodeH264SliceHeaderFlags") java.lang.foreign.MemorySegment flags() { return StdVideoEncodeH264SliceHeader.get_flags(this.segment()); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_flags(MemorySegment segment, long index, @CType("StdVideoEncodeH264SliceHeaderFlags") java.lang.foreign.MemorySegment value) { VH_flags.set(segment, 0L, index, value); }
    /// Sets `flags` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_flags(MemorySegment segment, @CType("StdVideoEncodeH264SliceHeaderFlags") java.lang.foreign.MemorySegment value) { StdVideoEncodeH264SliceHeader.set_flags(segment, 0L, value); }
    /// Sets `flags` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264SliceHeader flagsAt(long index, @CType("StdVideoEncodeH264SliceHeaderFlags") java.lang.foreign.MemorySegment value) { StdVideoEncodeH264SliceHeader.set_flags(this.segment(), index, value); return this; }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264SliceHeader flags(@CType("StdVideoEncodeH264SliceHeaderFlags") java.lang.foreign.MemorySegment value) { StdVideoEncodeH264SliceHeader.set_flags(this.segment(), value); return this; }

    /// {@return `first_mb_in_slice` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_first_mb_in_slice(MemorySegment segment, long index) { return (int) VH_first_mb_in_slice.get(segment, 0L, index); }
    /// {@return `first_mb_in_slice`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_first_mb_in_slice(MemorySegment segment) { return StdVideoEncodeH264SliceHeader.get_first_mb_in_slice(segment, 0L); }
    /// {@return `first_mb_in_slice` at the given index}
    /// @param index the index
    public @CType("uint32_t") int first_mb_in_sliceAt(long index) { return StdVideoEncodeH264SliceHeader.get_first_mb_in_slice(this.segment(), index); }
    /// {@return `first_mb_in_slice`}
    public @CType("uint32_t") int first_mb_in_slice() { return StdVideoEncodeH264SliceHeader.get_first_mb_in_slice(this.segment()); }
    /// Sets `first_mb_in_slice` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_first_mb_in_slice(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_first_mb_in_slice.set(segment, 0L, index, value); }
    /// Sets `first_mb_in_slice` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_first_mb_in_slice(MemorySegment segment, @CType("uint32_t") int value) { StdVideoEncodeH264SliceHeader.set_first_mb_in_slice(segment, 0L, value); }
    /// Sets `first_mb_in_slice` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264SliceHeader first_mb_in_sliceAt(long index, @CType("uint32_t") int value) { StdVideoEncodeH264SliceHeader.set_first_mb_in_slice(this.segment(), index, value); return this; }
    /// Sets `first_mb_in_slice` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264SliceHeader first_mb_in_slice(@CType("uint32_t") int value) { StdVideoEncodeH264SliceHeader.set_first_mb_in_slice(this.segment(), value); return this; }

    /// {@return `slice_type` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("StdVideoH264SliceType") int get_slice_type(MemorySegment segment, long index) { return (int) VH_slice_type.get(segment, 0L, index); }
    /// {@return `slice_type`}
    /// @param segment the segment of the struct
    public static @CType("StdVideoH264SliceType") int get_slice_type(MemorySegment segment) { return StdVideoEncodeH264SliceHeader.get_slice_type(segment, 0L); }
    /// {@return `slice_type` at the given index}
    /// @param index the index
    public @CType("StdVideoH264SliceType") int slice_typeAt(long index) { return StdVideoEncodeH264SliceHeader.get_slice_type(this.segment(), index); }
    /// {@return `slice_type`}
    public @CType("StdVideoH264SliceType") int slice_type() { return StdVideoEncodeH264SliceHeader.get_slice_type(this.segment()); }
    /// Sets `slice_type` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_slice_type(MemorySegment segment, long index, @CType("StdVideoH264SliceType") int value) { VH_slice_type.set(segment, 0L, index, value); }
    /// Sets `slice_type` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_slice_type(MemorySegment segment, @CType("StdVideoH264SliceType") int value) { StdVideoEncodeH264SliceHeader.set_slice_type(segment, 0L, value); }
    /// Sets `slice_type` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264SliceHeader slice_typeAt(long index, @CType("StdVideoH264SliceType") int value) { StdVideoEncodeH264SliceHeader.set_slice_type(this.segment(), index, value); return this; }
    /// Sets `slice_type` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264SliceHeader slice_type(@CType("StdVideoH264SliceType") int value) { StdVideoEncodeH264SliceHeader.set_slice_type(this.segment(), value); return this; }

    /// {@return `slice_alpha_c0_offset_div2` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("int8_t") byte get_slice_alpha_c0_offset_div2(MemorySegment segment, long index) { return (byte) VH_slice_alpha_c0_offset_div2.get(segment, 0L, index); }
    /// {@return `slice_alpha_c0_offset_div2`}
    /// @param segment the segment of the struct
    public static @CType("int8_t") byte get_slice_alpha_c0_offset_div2(MemorySegment segment) { return StdVideoEncodeH264SliceHeader.get_slice_alpha_c0_offset_div2(segment, 0L); }
    /// {@return `slice_alpha_c0_offset_div2` at the given index}
    /// @param index the index
    public @CType("int8_t") byte slice_alpha_c0_offset_div2At(long index) { return StdVideoEncodeH264SliceHeader.get_slice_alpha_c0_offset_div2(this.segment(), index); }
    /// {@return `slice_alpha_c0_offset_div2`}
    public @CType("int8_t") byte slice_alpha_c0_offset_div2() { return StdVideoEncodeH264SliceHeader.get_slice_alpha_c0_offset_div2(this.segment()); }
    /// Sets `slice_alpha_c0_offset_div2` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_slice_alpha_c0_offset_div2(MemorySegment segment, long index, @CType("int8_t") byte value) { VH_slice_alpha_c0_offset_div2.set(segment, 0L, index, value); }
    /// Sets `slice_alpha_c0_offset_div2` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_slice_alpha_c0_offset_div2(MemorySegment segment, @CType("int8_t") byte value) { StdVideoEncodeH264SliceHeader.set_slice_alpha_c0_offset_div2(segment, 0L, value); }
    /// Sets `slice_alpha_c0_offset_div2` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264SliceHeader slice_alpha_c0_offset_div2At(long index, @CType("int8_t") byte value) { StdVideoEncodeH264SliceHeader.set_slice_alpha_c0_offset_div2(this.segment(), index, value); return this; }
    /// Sets `slice_alpha_c0_offset_div2` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264SliceHeader slice_alpha_c0_offset_div2(@CType("int8_t") byte value) { StdVideoEncodeH264SliceHeader.set_slice_alpha_c0_offset_div2(this.segment(), value); return this; }

    /// {@return `slice_beta_offset_div2` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("int8_t") byte get_slice_beta_offset_div2(MemorySegment segment, long index) { return (byte) VH_slice_beta_offset_div2.get(segment, 0L, index); }
    /// {@return `slice_beta_offset_div2`}
    /// @param segment the segment of the struct
    public static @CType("int8_t") byte get_slice_beta_offset_div2(MemorySegment segment) { return StdVideoEncodeH264SliceHeader.get_slice_beta_offset_div2(segment, 0L); }
    /// {@return `slice_beta_offset_div2` at the given index}
    /// @param index the index
    public @CType("int8_t") byte slice_beta_offset_div2At(long index) { return StdVideoEncodeH264SliceHeader.get_slice_beta_offset_div2(this.segment(), index); }
    /// {@return `slice_beta_offset_div2`}
    public @CType("int8_t") byte slice_beta_offset_div2() { return StdVideoEncodeH264SliceHeader.get_slice_beta_offset_div2(this.segment()); }
    /// Sets `slice_beta_offset_div2` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_slice_beta_offset_div2(MemorySegment segment, long index, @CType("int8_t") byte value) { VH_slice_beta_offset_div2.set(segment, 0L, index, value); }
    /// Sets `slice_beta_offset_div2` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_slice_beta_offset_div2(MemorySegment segment, @CType("int8_t") byte value) { StdVideoEncodeH264SliceHeader.set_slice_beta_offset_div2(segment, 0L, value); }
    /// Sets `slice_beta_offset_div2` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264SliceHeader slice_beta_offset_div2At(long index, @CType("int8_t") byte value) { StdVideoEncodeH264SliceHeader.set_slice_beta_offset_div2(this.segment(), index, value); return this; }
    /// Sets `slice_beta_offset_div2` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264SliceHeader slice_beta_offset_div2(@CType("int8_t") byte value) { StdVideoEncodeH264SliceHeader.set_slice_beta_offset_div2(this.segment(), value); return this; }

    /// {@return `slice_qp_delta` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("int8_t") byte get_slice_qp_delta(MemorySegment segment, long index) { return (byte) VH_slice_qp_delta.get(segment, 0L, index); }
    /// {@return `slice_qp_delta`}
    /// @param segment the segment of the struct
    public static @CType("int8_t") byte get_slice_qp_delta(MemorySegment segment) { return StdVideoEncodeH264SliceHeader.get_slice_qp_delta(segment, 0L); }
    /// {@return `slice_qp_delta` at the given index}
    /// @param index the index
    public @CType("int8_t") byte slice_qp_deltaAt(long index) { return StdVideoEncodeH264SliceHeader.get_slice_qp_delta(this.segment(), index); }
    /// {@return `slice_qp_delta`}
    public @CType("int8_t") byte slice_qp_delta() { return StdVideoEncodeH264SliceHeader.get_slice_qp_delta(this.segment()); }
    /// Sets `slice_qp_delta` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_slice_qp_delta(MemorySegment segment, long index, @CType("int8_t") byte value) { VH_slice_qp_delta.set(segment, 0L, index, value); }
    /// Sets `slice_qp_delta` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_slice_qp_delta(MemorySegment segment, @CType("int8_t") byte value) { StdVideoEncodeH264SliceHeader.set_slice_qp_delta(segment, 0L, value); }
    /// Sets `slice_qp_delta` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264SliceHeader slice_qp_deltaAt(long index, @CType("int8_t") byte value) { StdVideoEncodeH264SliceHeader.set_slice_qp_delta(this.segment(), index, value); return this; }
    /// Sets `slice_qp_delta` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264SliceHeader slice_qp_delta(@CType("int8_t") byte value) { StdVideoEncodeH264SliceHeader.set_slice_qp_delta(this.segment(), value); return this; }

    /// {@return `reserved1` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t") byte get_reserved1(MemorySegment segment, long index) { return (byte) VH_reserved1.get(segment, 0L, index); }
    /// {@return `reserved1`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t") byte get_reserved1(MemorySegment segment) { return StdVideoEncodeH264SliceHeader.get_reserved1(segment, 0L); }
    /// {@return `reserved1` at the given index}
    /// @param index the index
    public @CType("uint8_t") byte reserved1At(long index) { return StdVideoEncodeH264SliceHeader.get_reserved1(this.segment(), index); }
    /// {@return `reserved1`}
    public @CType("uint8_t") byte reserved1() { return StdVideoEncodeH264SliceHeader.get_reserved1(this.segment()); }
    /// Sets `reserved1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_reserved1(MemorySegment segment, long index, @CType("uint8_t") byte value) { VH_reserved1.set(segment, 0L, index, value); }
    /// Sets `reserved1` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_reserved1(MemorySegment segment, @CType("uint8_t") byte value) { StdVideoEncodeH264SliceHeader.set_reserved1(segment, 0L, value); }
    /// Sets `reserved1` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264SliceHeader reserved1At(long index, @CType("uint8_t") byte value) { StdVideoEncodeH264SliceHeader.set_reserved1(this.segment(), index, value); return this; }
    /// Sets `reserved1` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264SliceHeader reserved1(@CType("uint8_t") byte value) { StdVideoEncodeH264SliceHeader.set_reserved1(this.segment(), value); return this; }

    /// {@return `cabac_init_idc` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("StdVideoH264CabacInitIdc") int get_cabac_init_idc(MemorySegment segment, long index) { return (int) VH_cabac_init_idc.get(segment, 0L, index); }
    /// {@return `cabac_init_idc`}
    /// @param segment the segment of the struct
    public static @CType("StdVideoH264CabacInitIdc") int get_cabac_init_idc(MemorySegment segment) { return StdVideoEncodeH264SliceHeader.get_cabac_init_idc(segment, 0L); }
    /// {@return `cabac_init_idc` at the given index}
    /// @param index the index
    public @CType("StdVideoH264CabacInitIdc") int cabac_init_idcAt(long index) { return StdVideoEncodeH264SliceHeader.get_cabac_init_idc(this.segment(), index); }
    /// {@return `cabac_init_idc`}
    public @CType("StdVideoH264CabacInitIdc") int cabac_init_idc() { return StdVideoEncodeH264SliceHeader.get_cabac_init_idc(this.segment()); }
    /// Sets `cabac_init_idc` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_cabac_init_idc(MemorySegment segment, long index, @CType("StdVideoH264CabacInitIdc") int value) { VH_cabac_init_idc.set(segment, 0L, index, value); }
    /// Sets `cabac_init_idc` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_cabac_init_idc(MemorySegment segment, @CType("StdVideoH264CabacInitIdc") int value) { StdVideoEncodeH264SliceHeader.set_cabac_init_idc(segment, 0L, value); }
    /// Sets `cabac_init_idc` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264SliceHeader cabac_init_idcAt(long index, @CType("StdVideoH264CabacInitIdc") int value) { StdVideoEncodeH264SliceHeader.set_cabac_init_idc(this.segment(), index, value); return this; }
    /// Sets `cabac_init_idc` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264SliceHeader cabac_init_idc(@CType("StdVideoH264CabacInitIdc") int value) { StdVideoEncodeH264SliceHeader.set_cabac_init_idc(this.segment(), value); return this; }

    /// {@return `disable_deblocking_filter_idc` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("StdVideoH264DisableDeblockingFilterIdc") int get_disable_deblocking_filter_idc(MemorySegment segment, long index) { return (int) VH_disable_deblocking_filter_idc.get(segment, 0L, index); }
    /// {@return `disable_deblocking_filter_idc`}
    /// @param segment the segment of the struct
    public static @CType("StdVideoH264DisableDeblockingFilterIdc") int get_disable_deblocking_filter_idc(MemorySegment segment) { return StdVideoEncodeH264SliceHeader.get_disable_deblocking_filter_idc(segment, 0L); }
    /// {@return `disable_deblocking_filter_idc` at the given index}
    /// @param index the index
    public @CType("StdVideoH264DisableDeblockingFilterIdc") int disable_deblocking_filter_idcAt(long index) { return StdVideoEncodeH264SliceHeader.get_disable_deblocking_filter_idc(this.segment(), index); }
    /// {@return `disable_deblocking_filter_idc`}
    public @CType("StdVideoH264DisableDeblockingFilterIdc") int disable_deblocking_filter_idc() { return StdVideoEncodeH264SliceHeader.get_disable_deblocking_filter_idc(this.segment()); }
    /// Sets `disable_deblocking_filter_idc` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_disable_deblocking_filter_idc(MemorySegment segment, long index, @CType("StdVideoH264DisableDeblockingFilterIdc") int value) { VH_disable_deblocking_filter_idc.set(segment, 0L, index, value); }
    /// Sets `disable_deblocking_filter_idc` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_disable_deblocking_filter_idc(MemorySegment segment, @CType("StdVideoH264DisableDeblockingFilterIdc") int value) { StdVideoEncodeH264SliceHeader.set_disable_deblocking_filter_idc(segment, 0L, value); }
    /// Sets `disable_deblocking_filter_idc` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264SliceHeader disable_deblocking_filter_idcAt(long index, @CType("StdVideoH264DisableDeblockingFilterIdc") int value) { StdVideoEncodeH264SliceHeader.set_disable_deblocking_filter_idc(this.segment(), index, value); return this; }
    /// Sets `disable_deblocking_filter_idc` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264SliceHeader disable_deblocking_filter_idc(@CType("StdVideoH264DisableDeblockingFilterIdc") int value) { StdVideoEncodeH264SliceHeader.set_disable_deblocking_filter_idc(this.segment(), value); return this; }

    /// {@return `pWeightTable` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const StdVideoEncodeH264WeightTable *") java.lang.foreign.MemorySegment get_pWeightTable(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pWeightTable.get(segment, 0L, index); }
    /// {@return `pWeightTable`}
    /// @param segment the segment of the struct
    public static @CType("const StdVideoEncodeH264WeightTable *") java.lang.foreign.MemorySegment get_pWeightTable(MemorySegment segment) { return StdVideoEncodeH264SliceHeader.get_pWeightTable(segment, 0L); }
    /// {@return `pWeightTable` at the given index}
    /// @param index the index
    public @CType("const StdVideoEncodeH264WeightTable *") java.lang.foreign.MemorySegment pWeightTableAt(long index) { return StdVideoEncodeH264SliceHeader.get_pWeightTable(this.segment(), index); }
    /// {@return `pWeightTable`}
    public @CType("const StdVideoEncodeH264WeightTable *") java.lang.foreign.MemorySegment pWeightTable() { return StdVideoEncodeH264SliceHeader.get_pWeightTable(this.segment()); }
    /// Sets `pWeightTable` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pWeightTable(MemorySegment segment, long index, @CType("const StdVideoEncodeH264WeightTable *") java.lang.foreign.MemorySegment value) { VH_pWeightTable.set(segment, 0L, index, value); }
    /// Sets `pWeightTable` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pWeightTable(MemorySegment segment, @CType("const StdVideoEncodeH264WeightTable *") java.lang.foreign.MemorySegment value) { StdVideoEncodeH264SliceHeader.set_pWeightTable(segment, 0L, value); }
    /// Sets `pWeightTable` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264SliceHeader pWeightTableAt(long index, @CType("const StdVideoEncodeH264WeightTable *") java.lang.foreign.MemorySegment value) { StdVideoEncodeH264SliceHeader.set_pWeightTable(this.segment(), index, value); return this; }
    /// Sets `pWeightTable` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264SliceHeader pWeightTable(@CType("const StdVideoEncodeH264WeightTable *") java.lang.foreign.MemorySegment value) { StdVideoEncodeH264SliceHeader.set_pWeightTable(this.segment(), value); return this; }

}
