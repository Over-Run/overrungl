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
/// ### slice_type
/// [VarHandle][#VH_slice_type] - [Getter][#slice_type()] - [Setter][#slice_type(int)]
/// ### slice_segment_address
/// [VarHandle][#VH_slice_segment_address] - [Getter][#slice_segment_address()] - [Setter][#slice_segment_address(int)]
/// ### collocated_ref_idx
/// [VarHandle][#VH_collocated_ref_idx] - [Getter][#collocated_ref_idx()] - [Setter][#collocated_ref_idx(byte)]
/// ### MaxNumMergeCand
/// [VarHandle][#VH_MaxNumMergeCand] - [Getter][#MaxNumMergeCand()] - [Setter][#MaxNumMergeCand(byte)]
/// ### slice_cb_qp_offset
/// [VarHandle][#VH_slice_cb_qp_offset] - [Getter][#slice_cb_qp_offset()] - [Setter][#slice_cb_qp_offset(byte)]
/// ### slice_cr_qp_offset
/// [VarHandle][#VH_slice_cr_qp_offset] - [Getter][#slice_cr_qp_offset()] - [Setter][#slice_cr_qp_offset(byte)]
/// ### slice_beta_offset_div2
/// [VarHandle][#VH_slice_beta_offset_div2] - [Getter][#slice_beta_offset_div2()] - [Setter][#slice_beta_offset_div2(byte)]
/// ### slice_tc_offset_div2
/// [VarHandle][#VH_slice_tc_offset_div2] - [Getter][#slice_tc_offset_div2()] - [Setter][#slice_tc_offset_div2(byte)]
/// ### slice_act_y_qp_offset
/// [VarHandle][#VH_slice_act_y_qp_offset] - [Getter][#slice_act_y_qp_offset()] - [Setter][#slice_act_y_qp_offset(byte)]
/// ### slice_act_cb_qp_offset
/// [VarHandle][#VH_slice_act_cb_qp_offset] - [Getter][#slice_act_cb_qp_offset()] - [Setter][#slice_act_cb_qp_offset(byte)]
/// ### slice_act_cr_qp_offset
/// [VarHandle][#VH_slice_act_cr_qp_offset] - [Getter][#slice_act_cr_qp_offset()] - [Setter][#slice_act_cr_qp_offset(byte)]
/// ### slice_qp_delta
/// [VarHandle][#VH_slice_qp_delta] - [Getter][#slice_qp_delta()] - [Setter][#slice_qp_delta(byte)]
/// ### reserved1
/// [VarHandle][#VH_reserved1] - [Getter][#reserved1()] - [Setter][#reserved1(short)]
/// ### pWeightTable
/// [VarHandle][#VH_pWeightTable] - [Getter][#pWeightTable()] - [Setter][#pWeightTable(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct StdVideoEncodeH265SliceSegmentHeader {
///     StdVideoEncodeH265SliceSegmentHeaderFlags flags;
///     StdVideoH265SliceType slice_type;
///     uint32_t slice_segment_address;
///     uint8_t collocated_ref_idx;
///     uint8_t MaxNumMergeCand;
///     int8_t slice_cb_qp_offset;
///     int8_t slice_cr_qp_offset;
///     int8_t slice_beta_offset_div2;
///     int8_t slice_tc_offset_div2;
///     int8_t slice_act_y_qp_offset;
///     int8_t slice_act_cb_qp_offset;
///     int8_t slice_act_cr_qp_offset;
///     int8_t slice_qp_delta;
///     uint16_t reserved1;
///     const StdVideoEncodeH265WeightTable * pWeightTable;
/// } StdVideoEncodeH265SliceSegmentHeader;
/// ```
public sealed class StdVideoEncodeH265SliceSegmentHeader extends Struct {
    /// The struct layout of `StdVideoEncodeH265SliceSegmentHeader`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        StdVideoEncodeH265SliceSegmentHeaderFlags.LAYOUT.withName("flags"),
        ValueLayout.JAVA_INT.withName("slice_type"),
        ValueLayout.JAVA_INT.withName("slice_segment_address"),
        ValueLayout.JAVA_BYTE.withName("collocated_ref_idx"),
        ValueLayout.JAVA_BYTE.withName("MaxNumMergeCand"),
        ValueLayout.JAVA_BYTE.withName("slice_cb_qp_offset"),
        ValueLayout.JAVA_BYTE.withName("slice_cr_qp_offset"),
        ValueLayout.JAVA_BYTE.withName("slice_beta_offset_div2"),
        ValueLayout.JAVA_BYTE.withName("slice_tc_offset_div2"),
        ValueLayout.JAVA_BYTE.withName("slice_act_y_qp_offset"),
        ValueLayout.JAVA_BYTE.withName("slice_act_cb_qp_offset"),
        ValueLayout.JAVA_BYTE.withName("slice_act_cr_qp_offset"),
        ValueLayout.JAVA_BYTE.withName("slice_qp_delta"),
        ValueLayout.JAVA_SHORT.withName("reserved1"),
        ValueLayout.ADDRESS.withName("pWeightTable")
    );
    /// The [VarHandle] of `flags` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    /// The [VarHandle] of `slice_type` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_slice_type = LAYOUT.arrayElementVarHandle(PathElement.groupElement("slice_type"));
    /// The [VarHandle] of `slice_segment_address` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_slice_segment_address = LAYOUT.arrayElementVarHandle(PathElement.groupElement("slice_segment_address"));
    /// The [VarHandle] of `collocated_ref_idx` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_collocated_ref_idx = LAYOUT.arrayElementVarHandle(PathElement.groupElement("collocated_ref_idx"));
    /// The [VarHandle] of `MaxNumMergeCand` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_MaxNumMergeCand = LAYOUT.arrayElementVarHandle(PathElement.groupElement("MaxNumMergeCand"));
    /// The [VarHandle] of `slice_cb_qp_offset` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_slice_cb_qp_offset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("slice_cb_qp_offset"));
    /// The [VarHandle] of `slice_cr_qp_offset` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_slice_cr_qp_offset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("slice_cr_qp_offset"));
    /// The [VarHandle] of `slice_beta_offset_div2` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_slice_beta_offset_div2 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("slice_beta_offset_div2"));
    /// The [VarHandle] of `slice_tc_offset_div2` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_slice_tc_offset_div2 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("slice_tc_offset_div2"));
    /// The [VarHandle] of `slice_act_y_qp_offset` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_slice_act_y_qp_offset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("slice_act_y_qp_offset"));
    /// The [VarHandle] of `slice_act_cb_qp_offset` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_slice_act_cb_qp_offset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("slice_act_cb_qp_offset"));
    /// The [VarHandle] of `slice_act_cr_qp_offset` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_slice_act_cr_qp_offset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("slice_act_cr_qp_offset"));
    /// The [VarHandle] of `slice_qp_delta` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_slice_qp_delta = LAYOUT.arrayElementVarHandle(PathElement.groupElement("slice_qp_delta"));
    /// The [VarHandle] of `reserved1` of type `(MemorySegment base, long baseOffset, long index)short`.
    public static final VarHandle VH_reserved1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("reserved1"));
    /// The [VarHandle] of `pWeightTable` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pWeightTable = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pWeightTable"));

    /// Creates `StdVideoEncodeH265SliceSegmentHeader` with the given segment.
    /// @param segment the memory segment
    public StdVideoEncodeH265SliceSegmentHeader(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `StdVideoEncodeH265SliceSegmentHeader` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoEncodeH265SliceSegmentHeader of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new StdVideoEncodeH265SliceSegmentHeader(segment); }

    /// Creates `StdVideoEncodeH265SliceSegmentHeader` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `StdVideoEncodeH265SliceSegmentHeader` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoEncodeH265SliceSegmentHeader ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new StdVideoEncodeH265SliceSegmentHeader(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `StdVideoEncodeH265SliceSegmentHeader` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `StdVideoEncodeH265SliceSegmentHeader` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoEncodeH265SliceSegmentHeader`
    public static StdVideoEncodeH265SliceSegmentHeader alloc(SegmentAllocator allocator) { return new StdVideoEncodeH265SliceSegmentHeader(allocator.allocate(LAYOUT)); }

    /// Allocates a `StdVideoEncodeH265SliceSegmentHeader` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `StdVideoEncodeH265SliceSegmentHeader`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `StdVideoEncodeH265SliceSegmentHeader` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoEncodeH265SliceSegmentHeader`
    public static StdVideoEncodeH265SliceSegmentHeader allocInit(SegmentAllocator allocator, @CType("StdVideoEncodeH265SliceSegmentHeaderFlags") java.lang.foreign.MemorySegment flags, @CType("StdVideoH265SliceType") int slice_type, @CType("uint32_t") int slice_segment_address, @CType("uint8_t") byte collocated_ref_idx, @CType("uint8_t") byte MaxNumMergeCand, @CType("int8_t") byte slice_cb_qp_offset, @CType("int8_t") byte slice_cr_qp_offset, @CType("int8_t") byte slice_beta_offset_div2, @CType("int8_t") byte slice_tc_offset_div2, @CType("int8_t") byte slice_act_y_qp_offset, @CType("int8_t") byte slice_act_cb_qp_offset, @CType("int8_t") byte slice_act_cr_qp_offset, @CType("int8_t") byte slice_qp_delta, @CType("uint16_t") short reserved1, @CType("const StdVideoEncodeH265WeightTable *") java.lang.foreign.MemorySegment pWeightTable) { return alloc(allocator).flags(flags).slice_type(slice_type).slice_segment_address(slice_segment_address).collocated_ref_idx(collocated_ref_idx).MaxNumMergeCand(MaxNumMergeCand).slice_cb_qp_offset(slice_cb_qp_offset).slice_cr_qp_offset(slice_cr_qp_offset).slice_beta_offset_div2(slice_beta_offset_div2).slice_tc_offset_div2(slice_tc_offset_div2).slice_act_y_qp_offset(slice_act_y_qp_offset).slice_act_cb_qp_offset(slice_act_cb_qp_offset).slice_act_cr_qp_offset(slice_act_cr_qp_offset).slice_qp_delta(slice_qp_delta).reserved1(reserved1).pWeightTable(pWeightTable); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public StdVideoEncodeH265SliceSegmentHeader copyFrom(StdVideoEncodeH265SliceSegmentHeader src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("StdVideoEncodeH265SliceSegmentHeaderFlags") java.lang.foreign.MemorySegment get_flags(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_flags.get(segment, 0L, index); }
    /// {@return `flags`}
    /// @param segment the segment of the struct
    public static @CType("StdVideoEncodeH265SliceSegmentHeaderFlags") java.lang.foreign.MemorySegment get_flags(MemorySegment segment) { return StdVideoEncodeH265SliceSegmentHeader.get_flags(segment, 0L); }
    /// {@return `flags`}
    public @CType("StdVideoEncodeH265SliceSegmentHeaderFlags") java.lang.foreign.MemorySegment flags() { return StdVideoEncodeH265SliceSegmentHeader.get_flags(this.segment()); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_flags(MemorySegment segment, long index, @CType("StdVideoEncodeH265SliceSegmentHeaderFlags") java.lang.foreign.MemorySegment value) { VH_flags.set(segment, 0L, index, value); }
    /// Sets `flags` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_flags(MemorySegment segment, @CType("StdVideoEncodeH265SliceSegmentHeaderFlags") java.lang.foreign.MemorySegment value) { StdVideoEncodeH265SliceSegmentHeader.set_flags(segment, 0L, value); }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265SliceSegmentHeader flags(@CType("StdVideoEncodeH265SliceSegmentHeaderFlags") java.lang.foreign.MemorySegment value) { StdVideoEncodeH265SliceSegmentHeader.set_flags(this.segment(), value); return this; }

    /// {@return `slice_type` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("StdVideoH265SliceType") int get_slice_type(MemorySegment segment, long index) { return (int) VH_slice_type.get(segment, 0L, index); }
    /// {@return `slice_type`}
    /// @param segment the segment of the struct
    public static @CType("StdVideoH265SliceType") int get_slice_type(MemorySegment segment) { return StdVideoEncodeH265SliceSegmentHeader.get_slice_type(segment, 0L); }
    /// {@return `slice_type`}
    public @CType("StdVideoH265SliceType") int slice_type() { return StdVideoEncodeH265SliceSegmentHeader.get_slice_type(this.segment()); }
    /// Sets `slice_type` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_slice_type(MemorySegment segment, long index, @CType("StdVideoH265SliceType") int value) { VH_slice_type.set(segment, 0L, index, value); }
    /// Sets `slice_type` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_slice_type(MemorySegment segment, @CType("StdVideoH265SliceType") int value) { StdVideoEncodeH265SliceSegmentHeader.set_slice_type(segment, 0L, value); }
    /// Sets `slice_type` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265SliceSegmentHeader slice_type(@CType("StdVideoH265SliceType") int value) { StdVideoEncodeH265SliceSegmentHeader.set_slice_type(this.segment(), value); return this; }

    /// {@return `slice_segment_address` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_slice_segment_address(MemorySegment segment, long index) { return (int) VH_slice_segment_address.get(segment, 0L, index); }
    /// {@return `slice_segment_address`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_slice_segment_address(MemorySegment segment) { return StdVideoEncodeH265SliceSegmentHeader.get_slice_segment_address(segment, 0L); }
    /// {@return `slice_segment_address`}
    public @CType("uint32_t") int slice_segment_address() { return StdVideoEncodeH265SliceSegmentHeader.get_slice_segment_address(this.segment()); }
    /// Sets `slice_segment_address` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_slice_segment_address(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_slice_segment_address.set(segment, 0L, index, value); }
    /// Sets `slice_segment_address` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_slice_segment_address(MemorySegment segment, @CType("uint32_t") int value) { StdVideoEncodeH265SliceSegmentHeader.set_slice_segment_address(segment, 0L, value); }
    /// Sets `slice_segment_address` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265SliceSegmentHeader slice_segment_address(@CType("uint32_t") int value) { StdVideoEncodeH265SliceSegmentHeader.set_slice_segment_address(this.segment(), value); return this; }

    /// {@return `collocated_ref_idx` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t") byte get_collocated_ref_idx(MemorySegment segment, long index) { return (byte) VH_collocated_ref_idx.get(segment, 0L, index); }
    /// {@return `collocated_ref_idx`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t") byte get_collocated_ref_idx(MemorySegment segment) { return StdVideoEncodeH265SliceSegmentHeader.get_collocated_ref_idx(segment, 0L); }
    /// {@return `collocated_ref_idx`}
    public @CType("uint8_t") byte collocated_ref_idx() { return StdVideoEncodeH265SliceSegmentHeader.get_collocated_ref_idx(this.segment()); }
    /// Sets `collocated_ref_idx` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_collocated_ref_idx(MemorySegment segment, long index, @CType("uint8_t") byte value) { VH_collocated_ref_idx.set(segment, 0L, index, value); }
    /// Sets `collocated_ref_idx` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_collocated_ref_idx(MemorySegment segment, @CType("uint8_t") byte value) { StdVideoEncodeH265SliceSegmentHeader.set_collocated_ref_idx(segment, 0L, value); }
    /// Sets `collocated_ref_idx` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265SliceSegmentHeader collocated_ref_idx(@CType("uint8_t") byte value) { StdVideoEncodeH265SliceSegmentHeader.set_collocated_ref_idx(this.segment(), value); return this; }

    /// {@return `MaxNumMergeCand` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t") byte get_MaxNumMergeCand(MemorySegment segment, long index) { return (byte) VH_MaxNumMergeCand.get(segment, 0L, index); }
    /// {@return `MaxNumMergeCand`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t") byte get_MaxNumMergeCand(MemorySegment segment) { return StdVideoEncodeH265SliceSegmentHeader.get_MaxNumMergeCand(segment, 0L); }
    /// {@return `MaxNumMergeCand`}
    public @CType("uint8_t") byte MaxNumMergeCand() { return StdVideoEncodeH265SliceSegmentHeader.get_MaxNumMergeCand(this.segment()); }
    /// Sets `MaxNumMergeCand` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_MaxNumMergeCand(MemorySegment segment, long index, @CType("uint8_t") byte value) { VH_MaxNumMergeCand.set(segment, 0L, index, value); }
    /// Sets `MaxNumMergeCand` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_MaxNumMergeCand(MemorySegment segment, @CType("uint8_t") byte value) { StdVideoEncodeH265SliceSegmentHeader.set_MaxNumMergeCand(segment, 0L, value); }
    /// Sets `MaxNumMergeCand` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265SliceSegmentHeader MaxNumMergeCand(@CType("uint8_t") byte value) { StdVideoEncodeH265SliceSegmentHeader.set_MaxNumMergeCand(this.segment(), value); return this; }

    /// {@return `slice_cb_qp_offset` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("int8_t") byte get_slice_cb_qp_offset(MemorySegment segment, long index) { return (byte) VH_slice_cb_qp_offset.get(segment, 0L, index); }
    /// {@return `slice_cb_qp_offset`}
    /// @param segment the segment of the struct
    public static @CType("int8_t") byte get_slice_cb_qp_offset(MemorySegment segment) { return StdVideoEncodeH265SliceSegmentHeader.get_slice_cb_qp_offset(segment, 0L); }
    /// {@return `slice_cb_qp_offset`}
    public @CType("int8_t") byte slice_cb_qp_offset() { return StdVideoEncodeH265SliceSegmentHeader.get_slice_cb_qp_offset(this.segment()); }
    /// Sets `slice_cb_qp_offset` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_slice_cb_qp_offset(MemorySegment segment, long index, @CType("int8_t") byte value) { VH_slice_cb_qp_offset.set(segment, 0L, index, value); }
    /// Sets `slice_cb_qp_offset` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_slice_cb_qp_offset(MemorySegment segment, @CType("int8_t") byte value) { StdVideoEncodeH265SliceSegmentHeader.set_slice_cb_qp_offset(segment, 0L, value); }
    /// Sets `slice_cb_qp_offset` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265SliceSegmentHeader slice_cb_qp_offset(@CType("int8_t") byte value) { StdVideoEncodeH265SliceSegmentHeader.set_slice_cb_qp_offset(this.segment(), value); return this; }

    /// {@return `slice_cr_qp_offset` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("int8_t") byte get_slice_cr_qp_offset(MemorySegment segment, long index) { return (byte) VH_slice_cr_qp_offset.get(segment, 0L, index); }
    /// {@return `slice_cr_qp_offset`}
    /// @param segment the segment of the struct
    public static @CType("int8_t") byte get_slice_cr_qp_offset(MemorySegment segment) { return StdVideoEncodeH265SliceSegmentHeader.get_slice_cr_qp_offset(segment, 0L); }
    /// {@return `slice_cr_qp_offset`}
    public @CType("int8_t") byte slice_cr_qp_offset() { return StdVideoEncodeH265SliceSegmentHeader.get_slice_cr_qp_offset(this.segment()); }
    /// Sets `slice_cr_qp_offset` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_slice_cr_qp_offset(MemorySegment segment, long index, @CType("int8_t") byte value) { VH_slice_cr_qp_offset.set(segment, 0L, index, value); }
    /// Sets `slice_cr_qp_offset` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_slice_cr_qp_offset(MemorySegment segment, @CType("int8_t") byte value) { StdVideoEncodeH265SliceSegmentHeader.set_slice_cr_qp_offset(segment, 0L, value); }
    /// Sets `slice_cr_qp_offset` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265SliceSegmentHeader slice_cr_qp_offset(@CType("int8_t") byte value) { StdVideoEncodeH265SliceSegmentHeader.set_slice_cr_qp_offset(this.segment(), value); return this; }

    /// {@return `slice_beta_offset_div2` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("int8_t") byte get_slice_beta_offset_div2(MemorySegment segment, long index) { return (byte) VH_slice_beta_offset_div2.get(segment, 0L, index); }
    /// {@return `slice_beta_offset_div2`}
    /// @param segment the segment of the struct
    public static @CType("int8_t") byte get_slice_beta_offset_div2(MemorySegment segment) { return StdVideoEncodeH265SliceSegmentHeader.get_slice_beta_offset_div2(segment, 0L); }
    /// {@return `slice_beta_offset_div2`}
    public @CType("int8_t") byte slice_beta_offset_div2() { return StdVideoEncodeH265SliceSegmentHeader.get_slice_beta_offset_div2(this.segment()); }
    /// Sets `slice_beta_offset_div2` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_slice_beta_offset_div2(MemorySegment segment, long index, @CType("int8_t") byte value) { VH_slice_beta_offset_div2.set(segment, 0L, index, value); }
    /// Sets `slice_beta_offset_div2` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_slice_beta_offset_div2(MemorySegment segment, @CType("int8_t") byte value) { StdVideoEncodeH265SliceSegmentHeader.set_slice_beta_offset_div2(segment, 0L, value); }
    /// Sets `slice_beta_offset_div2` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265SliceSegmentHeader slice_beta_offset_div2(@CType("int8_t") byte value) { StdVideoEncodeH265SliceSegmentHeader.set_slice_beta_offset_div2(this.segment(), value); return this; }

    /// {@return `slice_tc_offset_div2` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("int8_t") byte get_slice_tc_offset_div2(MemorySegment segment, long index) { return (byte) VH_slice_tc_offset_div2.get(segment, 0L, index); }
    /// {@return `slice_tc_offset_div2`}
    /// @param segment the segment of the struct
    public static @CType("int8_t") byte get_slice_tc_offset_div2(MemorySegment segment) { return StdVideoEncodeH265SliceSegmentHeader.get_slice_tc_offset_div2(segment, 0L); }
    /// {@return `slice_tc_offset_div2`}
    public @CType("int8_t") byte slice_tc_offset_div2() { return StdVideoEncodeH265SliceSegmentHeader.get_slice_tc_offset_div2(this.segment()); }
    /// Sets `slice_tc_offset_div2` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_slice_tc_offset_div2(MemorySegment segment, long index, @CType("int8_t") byte value) { VH_slice_tc_offset_div2.set(segment, 0L, index, value); }
    /// Sets `slice_tc_offset_div2` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_slice_tc_offset_div2(MemorySegment segment, @CType("int8_t") byte value) { StdVideoEncodeH265SliceSegmentHeader.set_slice_tc_offset_div2(segment, 0L, value); }
    /// Sets `slice_tc_offset_div2` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265SliceSegmentHeader slice_tc_offset_div2(@CType("int8_t") byte value) { StdVideoEncodeH265SliceSegmentHeader.set_slice_tc_offset_div2(this.segment(), value); return this; }

    /// {@return `slice_act_y_qp_offset` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("int8_t") byte get_slice_act_y_qp_offset(MemorySegment segment, long index) { return (byte) VH_slice_act_y_qp_offset.get(segment, 0L, index); }
    /// {@return `slice_act_y_qp_offset`}
    /// @param segment the segment of the struct
    public static @CType("int8_t") byte get_slice_act_y_qp_offset(MemorySegment segment) { return StdVideoEncodeH265SliceSegmentHeader.get_slice_act_y_qp_offset(segment, 0L); }
    /// {@return `slice_act_y_qp_offset`}
    public @CType("int8_t") byte slice_act_y_qp_offset() { return StdVideoEncodeH265SliceSegmentHeader.get_slice_act_y_qp_offset(this.segment()); }
    /// Sets `slice_act_y_qp_offset` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_slice_act_y_qp_offset(MemorySegment segment, long index, @CType("int8_t") byte value) { VH_slice_act_y_qp_offset.set(segment, 0L, index, value); }
    /// Sets `slice_act_y_qp_offset` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_slice_act_y_qp_offset(MemorySegment segment, @CType("int8_t") byte value) { StdVideoEncodeH265SliceSegmentHeader.set_slice_act_y_qp_offset(segment, 0L, value); }
    /// Sets `slice_act_y_qp_offset` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265SliceSegmentHeader slice_act_y_qp_offset(@CType("int8_t") byte value) { StdVideoEncodeH265SliceSegmentHeader.set_slice_act_y_qp_offset(this.segment(), value); return this; }

    /// {@return `slice_act_cb_qp_offset` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("int8_t") byte get_slice_act_cb_qp_offset(MemorySegment segment, long index) { return (byte) VH_slice_act_cb_qp_offset.get(segment, 0L, index); }
    /// {@return `slice_act_cb_qp_offset`}
    /// @param segment the segment of the struct
    public static @CType("int8_t") byte get_slice_act_cb_qp_offset(MemorySegment segment) { return StdVideoEncodeH265SliceSegmentHeader.get_slice_act_cb_qp_offset(segment, 0L); }
    /// {@return `slice_act_cb_qp_offset`}
    public @CType("int8_t") byte slice_act_cb_qp_offset() { return StdVideoEncodeH265SliceSegmentHeader.get_slice_act_cb_qp_offset(this.segment()); }
    /// Sets `slice_act_cb_qp_offset` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_slice_act_cb_qp_offset(MemorySegment segment, long index, @CType("int8_t") byte value) { VH_slice_act_cb_qp_offset.set(segment, 0L, index, value); }
    /// Sets `slice_act_cb_qp_offset` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_slice_act_cb_qp_offset(MemorySegment segment, @CType("int8_t") byte value) { StdVideoEncodeH265SliceSegmentHeader.set_slice_act_cb_qp_offset(segment, 0L, value); }
    /// Sets `slice_act_cb_qp_offset` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265SliceSegmentHeader slice_act_cb_qp_offset(@CType("int8_t") byte value) { StdVideoEncodeH265SliceSegmentHeader.set_slice_act_cb_qp_offset(this.segment(), value); return this; }

    /// {@return `slice_act_cr_qp_offset` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("int8_t") byte get_slice_act_cr_qp_offset(MemorySegment segment, long index) { return (byte) VH_slice_act_cr_qp_offset.get(segment, 0L, index); }
    /// {@return `slice_act_cr_qp_offset`}
    /// @param segment the segment of the struct
    public static @CType("int8_t") byte get_slice_act_cr_qp_offset(MemorySegment segment) { return StdVideoEncodeH265SliceSegmentHeader.get_slice_act_cr_qp_offset(segment, 0L); }
    /// {@return `slice_act_cr_qp_offset`}
    public @CType("int8_t") byte slice_act_cr_qp_offset() { return StdVideoEncodeH265SliceSegmentHeader.get_slice_act_cr_qp_offset(this.segment()); }
    /// Sets `slice_act_cr_qp_offset` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_slice_act_cr_qp_offset(MemorySegment segment, long index, @CType("int8_t") byte value) { VH_slice_act_cr_qp_offset.set(segment, 0L, index, value); }
    /// Sets `slice_act_cr_qp_offset` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_slice_act_cr_qp_offset(MemorySegment segment, @CType("int8_t") byte value) { StdVideoEncodeH265SliceSegmentHeader.set_slice_act_cr_qp_offset(segment, 0L, value); }
    /// Sets `slice_act_cr_qp_offset` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265SliceSegmentHeader slice_act_cr_qp_offset(@CType("int8_t") byte value) { StdVideoEncodeH265SliceSegmentHeader.set_slice_act_cr_qp_offset(this.segment(), value); return this; }

    /// {@return `slice_qp_delta` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("int8_t") byte get_slice_qp_delta(MemorySegment segment, long index) { return (byte) VH_slice_qp_delta.get(segment, 0L, index); }
    /// {@return `slice_qp_delta`}
    /// @param segment the segment of the struct
    public static @CType("int8_t") byte get_slice_qp_delta(MemorySegment segment) { return StdVideoEncodeH265SliceSegmentHeader.get_slice_qp_delta(segment, 0L); }
    /// {@return `slice_qp_delta`}
    public @CType("int8_t") byte slice_qp_delta() { return StdVideoEncodeH265SliceSegmentHeader.get_slice_qp_delta(this.segment()); }
    /// Sets `slice_qp_delta` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_slice_qp_delta(MemorySegment segment, long index, @CType("int8_t") byte value) { VH_slice_qp_delta.set(segment, 0L, index, value); }
    /// Sets `slice_qp_delta` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_slice_qp_delta(MemorySegment segment, @CType("int8_t") byte value) { StdVideoEncodeH265SliceSegmentHeader.set_slice_qp_delta(segment, 0L, value); }
    /// Sets `slice_qp_delta` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265SliceSegmentHeader slice_qp_delta(@CType("int8_t") byte value) { StdVideoEncodeH265SliceSegmentHeader.set_slice_qp_delta(this.segment(), value); return this; }

    /// {@return `reserved1` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint16_t") short get_reserved1(MemorySegment segment, long index) { return (short) VH_reserved1.get(segment, 0L, index); }
    /// {@return `reserved1`}
    /// @param segment the segment of the struct
    public static @CType("uint16_t") short get_reserved1(MemorySegment segment) { return StdVideoEncodeH265SliceSegmentHeader.get_reserved1(segment, 0L); }
    /// {@return `reserved1`}
    public @CType("uint16_t") short reserved1() { return StdVideoEncodeH265SliceSegmentHeader.get_reserved1(this.segment()); }
    /// Sets `reserved1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_reserved1(MemorySegment segment, long index, @CType("uint16_t") short value) { VH_reserved1.set(segment, 0L, index, value); }
    /// Sets `reserved1` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_reserved1(MemorySegment segment, @CType("uint16_t") short value) { StdVideoEncodeH265SliceSegmentHeader.set_reserved1(segment, 0L, value); }
    /// Sets `reserved1` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265SliceSegmentHeader reserved1(@CType("uint16_t") short value) { StdVideoEncodeH265SliceSegmentHeader.set_reserved1(this.segment(), value); return this; }

    /// {@return `pWeightTable` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const StdVideoEncodeH265WeightTable *") java.lang.foreign.MemorySegment get_pWeightTable(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pWeightTable.get(segment, 0L, index); }
    /// {@return `pWeightTable`}
    /// @param segment the segment of the struct
    public static @CType("const StdVideoEncodeH265WeightTable *") java.lang.foreign.MemorySegment get_pWeightTable(MemorySegment segment) { return StdVideoEncodeH265SliceSegmentHeader.get_pWeightTable(segment, 0L); }
    /// {@return `pWeightTable`}
    public @CType("const StdVideoEncodeH265WeightTable *") java.lang.foreign.MemorySegment pWeightTable() { return StdVideoEncodeH265SliceSegmentHeader.get_pWeightTable(this.segment()); }
    /// Sets `pWeightTable` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pWeightTable(MemorySegment segment, long index, @CType("const StdVideoEncodeH265WeightTable *") java.lang.foreign.MemorySegment value) { VH_pWeightTable.set(segment, 0L, index, value); }
    /// Sets `pWeightTable` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pWeightTable(MemorySegment segment, @CType("const StdVideoEncodeH265WeightTable *") java.lang.foreign.MemorySegment value) { StdVideoEncodeH265SliceSegmentHeader.set_pWeightTable(segment, 0L, value); }
    /// Sets `pWeightTable` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265SliceSegmentHeader pWeightTable(@CType("const StdVideoEncodeH265WeightTable *") java.lang.foreign.MemorySegment value) { StdVideoEncodeH265SliceSegmentHeader.set_pWeightTable(this.segment(), value); return this; }

    /// A buffer of [StdVideoEncodeH265SliceSegmentHeader].
    public static final class Buffer extends StdVideoEncodeH265SliceSegmentHeader {
        private final long elementCount;

        /// Creates `StdVideoEncodeH265SliceSegmentHeader.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `StdVideoEncodeH265SliceSegmentHeader`.
        /// @param index the index of the struct buffer
        /// @return the slice of `StdVideoEncodeH265SliceSegmentHeader`
        public StdVideoEncodeH265SliceSegmentHeader asSlice(long index) { return new StdVideoEncodeH265SliceSegmentHeader(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `StdVideoEncodeH265SliceSegmentHeader`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `StdVideoEncodeH265SliceSegmentHeader`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `flags` at the given index}
        /// @param index the index
        public @CType("StdVideoEncodeH265SliceSegmentHeaderFlags") java.lang.foreign.MemorySegment flagsAt(long index) { return StdVideoEncodeH265SliceSegmentHeader.get_flags(this.segment(), index); }
        /// Sets `flags` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer flagsAt(long index, @CType("StdVideoEncodeH265SliceSegmentHeaderFlags") java.lang.foreign.MemorySegment value) { StdVideoEncodeH265SliceSegmentHeader.set_flags(this.segment(), index, value); return this; }

        /// {@return `slice_type` at the given index}
        /// @param index the index
        public @CType("StdVideoH265SliceType") int slice_typeAt(long index) { return StdVideoEncodeH265SliceSegmentHeader.get_slice_type(this.segment(), index); }
        /// Sets `slice_type` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer slice_typeAt(long index, @CType("StdVideoH265SliceType") int value) { StdVideoEncodeH265SliceSegmentHeader.set_slice_type(this.segment(), index, value); return this; }

        /// {@return `slice_segment_address` at the given index}
        /// @param index the index
        public @CType("uint32_t") int slice_segment_addressAt(long index) { return StdVideoEncodeH265SliceSegmentHeader.get_slice_segment_address(this.segment(), index); }
        /// Sets `slice_segment_address` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer slice_segment_addressAt(long index, @CType("uint32_t") int value) { StdVideoEncodeH265SliceSegmentHeader.set_slice_segment_address(this.segment(), index, value); return this; }

        /// {@return `collocated_ref_idx` at the given index}
        /// @param index the index
        public @CType("uint8_t") byte collocated_ref_idxAt(long index) { return StdVideoEncodeH265SliceSegmentHeader.get_collocated_ref_idx(this.segment(), index); }
        /// Sets `collocated_ref_idx` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer collocated_ref_idxAt(long index, @CType("uint8_t") byte value) { StdVideoEncodeH265SliceSegmentHeader.set_collocated_ref_idx(this.segment(), index, value); return this; }

        /// {@return `MaxNumMergeCand` at the given index}
        /// @param index the index
        public @CType("uint8_t") byte MaxNumMergeCandAt(long index) { return StdVideoEncodeH265SliceSegmentHeader.get_MaxNumMergeCand(this.segment(), index); }
        /// Sets `MaxNumMergeCand` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer MaxNumMergeCandAt(long index, @CType("uint8_t") byte value) { StdVideoEncodeH265SliceSegmentHeader.set_MaxNumMergeCand(this.segment(), index, value); return this; }

        /// {@return `slice_cb_qp_offset` at the given index}
        /// @param index the index
        public @CType("int8_t") byte slice_cb_qp_offsetAt(long index) { return StdVideoEncodeH265SliceSegmentHeader.get_slice_cb_qp_offset(this.segment(), index); }
        /// Sets `slice_cb_qp_offset` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer slice_cb_qp_offsetAt(long index, @CType("int8_t") byte value) { StdVideoEncodeH265SliceSegmentHeader.set_slice_cb_qp_offset(this.segment(), index, value); return this; }

        /// {@return `slice_cr_qp_offset` at the given index}
        /// @param index the index
        public @CType("int8_t") byte slice_cr_qp_offsetAt(long index) { return StdVideoEncodeH265SliceSegmentHeader.get_slice_cr_qp_offset(this.segment(), index); }
        /// Sets `slice_cr_qp_offset` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer slice_cr_qp_offsetAt(long index, @CType("int8_t") byte value) { StdVideoEncodeH265SliceSegmentHeader.set_slice_cr_qp_offset(this.segment(), index, value); return this; }

        /// {@return `slice_beta_offset_div2` at the given index}
        /// @param index the index
        public @CType("int8_t") byte slice_beta_offset_div2At(long index) { return StdVideoEncodeH265SliceSegmentHeader.get_slice_beta_offset_div2(this.segment(), index); }
        /// Sets `slice_beta_offset_div2` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer slice_beta_offset_div2At(long index, @CType("int8_t") byte value) { StdVideoEncodeH265SliceSegmentHeader.set_slice_beta_offset_div2(this.segment(), index, value); return this; }

        /// {@return `slice_tc_offset_div2` at the given index}
        /// @param index the index
        public @CType("int8_t") byte slice_tc_offset_div2At(long index) { return StdVideoEncodeH265SliceSegmentHeader.get_slice_tc_offset_div2(this.segment(), index); }
        /// Sets `slice_tc_offset_div2` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer slice_tc_offset_div2At(long index, @CType("int8_t") byte value) { StdVideoEncodeH265SliceSegmentHeader.set_slice_tc_offset_div2(this.segment(), index, value); return this; }

        /// {@return `slice_act_y_qp_offset` at the given index}
        /// @param index the index
        public @CType("int8_t") byte slice_act_y_qp_offsetAt(long index) { return StdVideoEncodeH265SliceSegmentHeader.get_slice_act_y_qp_offset(this.segment(), index); }
        /// Sets `slice_act_y_qp_offset` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer slice_act_y_qp_offsetAt(long index, @CType("int8_t") byte value) { StdVideoEncodeH265SliceSegmentHeader.set_slice_act_y_qp_offset(this.segment(), index, value); return this; }

        /// {@return `slice_act_cb_qp_offset` at the given index}
        /// @param index the index
        public @CType("int8_t") byte slice_act_cb_qp_offsetAt(long index) { return StdVideoEncodeH265SliceSegmentHeader.get_slice_act_cb_qp_offset(this.segment(), index); }
        /// Sets `slice_act_cb_qp_offset` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer slice_act_cb_qp_offsetAt(long index, @CType("int8_t") byte value) { StdVideoEncodeH265SliceSegmentHeader.set_slice_act_cb_qp_offset(this.segment(), index, value); return this; }

        /// {@return `slice_act_cr_qp_offset` at the given index}
        /// @param index the index
        public @CType("int8_t") byte slice_act_cr_qp_offsetAt(long index) { return StdVideoEncodeH265SliceSegmentHeader.get_slice_act_cr_qp_offset(this.segment(), index); }
        /// Sets `slice_act_cr_qp_offset` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer slice_act_cr_qp_offsetAt(long index, @CType("int8_t") byte value) { StdVideoEncodeH265SliceSegmentHeader.set_slice_act_cr_qp_offset(this.segment(), index, value); return this; }

        /// {@return `slice_qp_delta` at the given index}
        /// @param index the index
        public @CType("int8_t") byte slice_qp_deltaAt(long index) { return StdVideoEncodeH265SliceSegmentHeader.get_slice_qp_delta(this.segment(), index); }
        /// Sets `slice_qp_delta` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer slice_qp_deltaAt(long index, @CType("int8_t") byte value) { StdVideoEncodeH265SliceSegmentHeader.set_slice_qp_delta(this.segment(), index, value); return this; }

        /// {@return `reserved1` at the given index}
        /// @param index the index
        public @CType("uint16_t") short reserved1At(long index) { return StdVideoEncodeH265SliceSegmentHeader.get_reserved1(this.segment(), index); }
        /// Sets `reserved1` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer reserved1At(long index, @CType("uint16_t") short value) { StdVideoEncodeH265SliceSegmentHeader.set_reserved1(this.segment(), index, value); return this; }

        /// {@return `pWeightTable` at the given index}
        /// @param index the index
        public @CType("const StdVideoEncodeH265WeightTable *") java.lang.foreign.MemorySegment pWeightTableAt(long index) { return StdVideoEncodeH265SliceSegmentHeader.get_pWeightTable(this.segment(), index); }
        /// Sets `pWeightTable` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pWeightTableAt(long index, @CType("const StdVideoEncodeH265WeightTable *") java.lang.foreign.MemorySegment value) { StdVideoEncodeH265SliceSegmentHeader.set_pWeightTable(this.segment(), index, value); return this; }

    }
}
