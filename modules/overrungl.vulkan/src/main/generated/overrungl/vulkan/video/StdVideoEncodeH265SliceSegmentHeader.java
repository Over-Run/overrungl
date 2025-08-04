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
package overrungl.vulkan.video;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct StdVideoEncodeH265SliceSegmentHeader {
///     (struct StdVideoEncodeH265SliceSegmentHeaderFlags) StdVideoEncodeH265SliceSegmentHeaderFlags flags;
///     (int) StdVideoH265SliceType slice_type;
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
///     const StdVideoEncodeH265WeightTable* pWeightTable;
/// };
/// ```
public final class StdVideoEncodeH265SliceSegmentHeader extends GroupType {
    /// The struct layout of `StdVideoEncodeH265SliceSegmentHeader`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        overrungl.vulkan.video.StdVideoEncodeH265SliceSegmentHeaderFlags.LAYOUT.withName("flags"),
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
    /// The byte offset of `flags`.
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    /// The memory layout of `flags`.
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    /// The byte offset of `slice_type`.
    public static final long OFFSET_slice_type = LAYOUT.byteOffset(PathElement.groupElement("slice_type"));
    /// The memory layout of `slice_type`.
    public static final MemoryLayout LAYOUT_slice_type = LAYOUT.select(PathElement.groupElement("slice_type"));
    /// The [VarHandle] of `slice_type` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_slice_type = LAYOUT.arrayElementVarHandle(PathElement.groupElement("slice_type"));
    /// The byte offset of `slice_segment_address`.
    public static final long OFFSET_slice_segment_address = LAYOUT.byteOffset(PathElement.groupElement("slice_segment_address"));
    /// The memory layout of `slice_segment_address`.
    public static final MemoryLayout LAYOUT_slice_segment_address = LAYOUT.select(PathElement.groupElement("slice_segment_address"));
    /// The [VarHandle] of `slice_segment_address` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_slice_segment_address = LAYOUT.arrayElementVarHandle(PathElement.groupElement("slice_segment_address"));
    /// The byte offset of `collocated_ref_idx`.
    public static final long OFFSET_collocated_ref_idx = LAYOUT.byteOffset(PathElement.groupElement("collocated_ref_idx"));
    /// The memory layout of `collocated_ref_idx`.
    public static final MemoryLayout LAYOUT_collocated_ref_idx = LAYOUT.select(PathElement.groupElement("collocated_ref_idx"));
    /// The [VarHandle] of `collocated_ref_idx` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_collocated_ref_idx = LAYOUT.arrayElementVarHandle(PathElement.groupElement("collocated_ref_idx"));
    /// The byte offset of `MaxNumMergeCand`.
    public static final long OFFSET_MaxNumMergeCand = LAYOUT.byteOffset(PathElement.groupElement("MaxNumMergeCand"));
    /// The memory layout of `MaxNumMergeCand`.
    public static final MemoryLayout LAYOUT_MaxNumMergeCand = LAYOUT.select(PathElement.groupElement("MaxNumMergeCand"));
    /// The [VarHandle] of `MaxNumMergeCand` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_MaxNumMergeCand = LAYOUT.arrayElementVarHandle(PathElement.groupElement("MaxNumMergeCand"));
    /// The byte offset of `slice_cb_qp_offset`.
    public static final long OFFSET_slice_cb_qp_offset = LAYOUT.byteOffset(PathElement.groupElement("slice_cb_qp_offset"));
    /// The memory layout of `slice_cb_qp_offset`.
    public static final MemoryLayout LAYOUT_slice_cb_qp_offset = LAYOUT.select(PathElement.groupElement("slice_cb_qp_offset"));
    /// The [VarHandle] of `slice_cb_qp_offset` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_slice_cb_qp_offset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("slice_cb_qp_offset"));
    /// The byte offset of `slice_cr_qp_offset`.
    public static final long OFFSET_slice_cr_qp_offset = LAYOUT.byteOffset(PathElement.groupElement("slice_cr_qp_offset"));
    /// The memory layout of `slice_cr_qp_offset`.
    public static final MemoryLayout LAYOUT_slice_cr_qp_offset = LAYOUT.select(PathElement.groupElement("slice_cr_qp_offset"));
    /// The [VarHandle] of `slice_cr_qp_offset` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_slice_cr_qp_offset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("slice_cr_qp_offset"));
    /// The byte offset of `slice_beta_offset_div2`.
    public static final long OFFSET_slice_beta_offset_div2 = LAYOUT.byteOffset(PathElement.groupElement("slice_beta_offset_div2"));
    /// The memory layout of `slice_beta_offset_div2`.
    public static final MemoryLayout LAYOUT_slice_beta_offset_div2 = LAYOUT.select(PathElement.groupElement("slice_beta_offset_div2"));
    /// The [VarHandle] of `slice_beta_offset_div2` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_slice_beta_offset_div2 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("slice_beta_offset_div2"));
    /// The byte offset of `slice_tc_offset_div2`.
    public static final long OFFSET_slice_tc_offset_div2 = LAYOUT.byteOffset(PathElement.groupElement("slice_tc_offset_div2"));
    /// The memory layout of `slice_tc_offset_div2`.
    public static final MemoryLayout LAYOUT_slice_tc_offset_div2 = LAYOUT.select(PathElement.groupElement("slice_tc_offset_div2"));
    /// The [VarHandle] of `slice_tc_offset_div2` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_slice_tc_offset_div2 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("slice_tc_offset_div2"));
    /// The byte offset of `slice_act_y_qp_offset`.
    public static final long OFFSET_slice_act_y_qp_offset = LAYOUT.byteOffset(PathElement.groupElement("slice_act_y_qp_offset"));
    /// The memory layout of `slice_act_y_qp_offset`.
    public static final MemoryLayout LAYOUT_slice_act_y_qp_offset = LAYOUT.select(PathElement.groupElement("slice_act_y_qp_offset"));
    /// The [VarHandle] of `slice_act_y_qp_offset` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_slice_act_y_qp_offset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("slice_act_y_qp_offset"));
    /// The byte offset of `slice_act_cb_qp_offset`.
    public static final long OFFSET_slice_act_cb_qp_offset = LAYOUT.byteOffset(PathElement.groupElement("slice_act_cb_qp_offset"));
    /// The memory layout of `slice_act_cb_qp_offset`.
    public static final MemoryLayout LAYOUT_slice_act_cb_qp_offset = LAYOUT.select(PathElement.groupElement("slice_act_cb_qp_offset"));
    /// The [VarHandle] of `slice_act_cb_qp_offset` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_slice_act_cb_qp_offset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("slice_act_cb_qp_offset"));
    /// The byte offset of `slice_act_cr_qp_offset`.
    public static final long OFFSET_slice_act_cr_qp_offset = LAYOUT.byteOffset(PathElement.groupElement("slice_act_cr_qp_offset"));
    /// The memory layout of `slice_act_cr_qp_offset`.
    public static final MemoryLayout LAYOUT_slice_act_cr_qp_offset = LAYOUT.select(PathElement.groupElement("slice_act_cr_qp_offset"));
    /// The [VarHandle] of `slice_act_cr_qp_offset` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_slice_act_cr_qp_offset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("slice_act_cr_qp_offset"));
    /// The byte offset of `slice_qp_delta`.
    public static final long OFFSET_slice_qp_delta = LAYOUT.byteOffset(PathElement.groupElement("slice_qp_delta"));
    /// The memory layout of `slice_qp_delta`.
    public static final MemoryLayout LAYOUT_slice_qp_delta = LAYOUT.select(PathElement.groupElement("slice_qp_delta"));
    /// The [VarHandle] of `slice_qp_delta` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_slice_qp_delta = LAYOUT.arrayElementVarHandle(PathElement.groupElement("slice_qp_delta"));
    /// The byte offset of `reserved1`.
    public static final long OFFSET_reserved1 = LAYOUT.byteOffset(PathElement.groupElement("reserved1"));
    /// The memory layout of `reserved1`.
    public static final MemoryLayout LAYOUT_reserved1 = LAYOUT.select(PathElement.groupElement("reserved1"));
    /// The [VarHandle] of `reserved1` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_reserved1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("reserved1"));
    /// The byte offset of `pWeightTable`.
    public static final long OFFSET_pWeightTable = LAYOUT.byteOffset(PathElement.groupElement("pWeightTable"));
    /// The memory layout of `pWeightTable`.
    public static final MemoryLayout LAYOUT_pWeightTable = LAYOUT.select(PathElement.groupElement("pWeightTable"));
    /// The [VarHandle] of `pWeightTable` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pWeightTable = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pWeightTable"));

    /// Creates `StdVideoEncodeH265SliceSegmentHeader` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public StdVideoEncodeH265SliceSegmentHeader(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `StdVideoEncodeH265SliceSegmentHeader` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoEncodeH265SliceSegmentHeader of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoEncodeH265SliceSegmentHeader(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `StdVideoEncodeH265SliceSegmentHeader` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoEncodeH265SliceSegmentHeader ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoEncodeH265SliceSegmentHeader(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `StdVideoEncodeH265SliceSegmentHeader` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoEncodeH265SliceSegmentHeader ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoEncodeH265SliceSegmentHeader(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `StdVideoEncodeH265SliceSegmentHeader` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoEncodeH265SliceSegmentHeader`
    public static StdVideoEncodeH265SliceSegmentHeader alloc(SegmentAllocator allocator) { return new StdVideoEncodeH265SliceSegmentHeader(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `StdVideoEncodeH265SliceSegmentHeader` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `StdVideoEncodeH265SliceSegmentHeader`
    public static StdVideoEncodeH265SliceSegmentHeader alloc(SegmentAllocator allocator, long count) { return new StdVideoEncodeH265SliceSegmentHeader(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public StdVideoEncodeH265SliceSegmentHeader copyFrom(StdVideoEncodeH265SliceSegmentHeader src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public StdVideoEncodeH265SliceSegmentHeader reinterpret(long count) { return new StdVideoEncodeH265SliceSegmentHeader(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment flags(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_flags, index), LAYOUT_flags); }
    /// {@return `flags`}
    public MemorySegment flags() { return flags(this.segment(), 0L); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void flags(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_flags, index), LAYOUT_flags.byteSize()); }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265SliceSegmentHeader flags(MemorySegment value) { flags(this.segment(), 0L, value); return this; }
    /// Accepts `flags` with the given function.
    /// @param func the function
    /// @return `this`
    public StdVideoEncodeH265SliceSegmentHeader flags(Consumer<overrungl.vulkan.video.StdVideoEncodeH265SliceSegmentHeaderFlags> func) { func.accept(overrungl.vulkan.video.StdVideoEncodeH265SliceSegmentHeaderFlags.of(flags())); return this; }

    /// {@return `slice_type` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int slice_type(MemorySegment segment, long index) { return (int) VH_slice_type.get(segment, 0L, index); }
    /// {@return `slice_type`}
    public int slice_type() { return slice_type(this.segment(), 0L); }
    /// Sets `slice_type` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void slice_type(MemorySegment segment, long index, int value) { VH_slice_type.set(segment, 0L, index, value); }
    /// Sets `slice_type` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265SliceSegmentHeader slice_type(int value) { slice_type(this.segment(), 0L, value); return this; }

    /// {@return `slice_segment_address` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int slice_segment_address(MemorySegment segment, long index) { return (int) VH_slice_segment_address.get(segment, 0L, index); }
    /// {@return `slice_segment_address`}
    public int slice_segment_address() { return slice_segment_address(this.segment(), 0L); }
    /// Sets `slice_segment_address` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void slice_segment_address(MemorySegment segment, long index, int value) { VH_slice_segment_address.set(segment, 0L, index, value); }
    /// Sets `slice_segment_address` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265SliceSegmentHeader slice_segment_address(int value) { slice_segment_address(this.segment(), 0L, value); return this; }

    /// {@return `collocated_ref_idx` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte collocated_ref_idx(MemorySegment segment, long index) { return (byte) VH_collocated_ref_idx.get(segment, 0L, index); }
    /// {@return `collocated_ref_idx`}
    public byte collocated_ref_idx() { return collocated_ref_idx(this.segment(), 0L); }
    /// Sets `collocated_ref_idx` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void collocated_ref_idx(MemorySegment segment, long index, byte value) { VH_collocated_ref_idx.set(segment, 0L, index, value); }
    /// Sets `collocated_ref_idx` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265SliceSegmentHeader collocated_ref_idx(byte value) { collocated_ref_idx(this.segment(), 0L, value); return this; }

    /// {@return `MaxNumMergeCand` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte MaxNumMergeCand(MemorySegment segment, long index) { return (byte) VH_MaxNumMergeCand.get(segment, 0L, index); }
    /// {@return `MaxNumMergeCand`}
    public byte MaxNumMergeCand() { return MaxNumMergeCand(this.segment(), 0L); }
    /// Sets `MaxNumMergeCand` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void MaxNumMergeCand(MemorySegment segment, long index, byte value) { VH_MaxNumMergeCand.set(segment, 0L, index, value); }
    /// Sets `MaxNumMergeCand` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265SliceSegmentHeader MaxNumMergeCand(byte value) { MaxNumMergeCand(this.segment(), 0L, value); return this; }

    /// {@return `slice_cb_qp_offset` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte slice_cb_qp_offset(MemorySegment segment, long index) { return (byte) VH_slice_cb_qp_offset.get(segment, 0L, index); }
    /// {@return `slice_cb_qp_offset`}
    public byte slice_cb_qp_offset() { return slice_cb_qp_offset(this.segment(), 0L); }
    /// Sets `slice_cb_qp_offset` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void slice_cb_qp_offset(MemorySegment segment, long index, byte value) { VH_slice_cb_qp_offset.set(segment, 0L, index, value); }
    /// Sets `slice_cb_qp_offset` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265SliceSegmentHeader slice_cb_qp_offset(byte value) { slice_cb_qp_offset(this.segment(), 0L, value); return this; }

    /// {@return `slice_cr_qp_offset` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte slice_cr_qp_offset(MemorySegment segment, long index) { return (byte) VH_slice_cr_qp_offset.get(segment, 0L, index); }
    /// {@return `slice_cr_qp_offset`}
    public byte slice_cr_qp_offset() { return slice_cr_qp_offset(this.segment(), 0L); }
    /// Sets `slice_cr_qp_offset` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void slice_cr_qp_offset(MemorySegment segment, long index, byte value) { VH_slice_cr_qp_offset.set(segment, 0L, index, value); }
    /// Sets `slice_cr_qp_offset` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265SliceSegmentHeader slice_cr_qp_offset(byte value) { slice_cr_qp_offset(this.segment(), 0L, value); return this; }

    /// {@return `slice_beta_offset_div2` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte slice_beta_offset_div2(MemorySegment segment, long index) { return (byte) VH_slice_beta_offset_div2.get(segment, 0L, index); }
    /// {@return `slice_beta_offset_div2`}
    public byte slice_beta_offset_div2() { return slice_beta_offset_div2(this.segment(), 0L); }
    /// Sets `slice_beta_offset_div2` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void slice_beta_offset_div2(MemorySegment segment, long index, byte value) { VH_slice_beta_offset_div2.set(segment, 0L, index, value); }
    /// Sets `slice_beta_offset_div2` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265SliceSegmentHeader slice_beta_offset_div2(byte value) { slice_beta_offset_div2(this.segment(), 0L, value); return this; }

    /// {@return `slice_tc_offset_div2` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte slice_tc_offset_div2(MemorySegment segment, long index) { return (byte) VH_slice_tc_offset_div2.get(segment, 0L, index); }
    /// {@return `slice_tc_offset_div2`}
    public byte slice_tc_offset_div2() { return slice_tc_offset_div2(this.segment(), 0L); }
    /// Sets `slice_tc_offset_div2` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void slice_tc_offset_div2(MemorySegment segment, long index, byte value) { VH_slice_tc_offset_div2.set(segment, 0L, index, value); }
    /// Sets `slice_tc_offset_div2` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265SliceSegmentHeader slice_tc_offset_div2(byte value) { slice_tc_offset_div2(this.segment(), 0L, value); return this; }

    /// {@return `slice_act_y_qp_offset` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte slice_act_y_qp_offset(MemorySegment segment, long index) { return (byte) VH_slice_act_y_qp_offset.get(segment, 0L, index); }
    /// {@return `slice_act_y_qp_offset`}
    public byte slice_act_y_qp_offset() { return slice_act_y_qp_offset(this.segment(), 0L); }
    /// Sets `slice_act_y_qp_offset` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void slice_act_y_qp_offset(MemorySegment segment, long index, byte value) { VH_slice_act_y_qp_offset.set(segment, 0L, index, value); }
    /// Sets `slice_act_y_qp_offset` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265SliceSegmentHeader slice_act_y_qp_offset(byte value) { slice_act_y_qp_offset(this.segment(), 0L, value); return this; }

    /// {@return `slice_act_cb_qp_offset` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte slice_act_cb_qp_offset(MemorySegment segment, long index) { return (byte) VH_slice_act_cb_qp_offset.get(segment, 0L, index); }
    /// {@return `slice_act_cb_qp_offset`}
    public byte slice_act_cb_qp_offset() { return slice_act_cb_qp_offset(this.segment(), 0L); }
    /// Sets `slice_act_cb_qp_offset` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void slice_act_cb_qp_offset(MemorySegment segment, long index, byte value) { VH_slice_act_cb_qp_offset.set(segment, 0L, index, value); }
    /// Sets `slice_act_cb_qp_offset` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265SliceSegmentHeader slice_act_cb_qp_offset(byte value) { slice_act_cb_qp_offset(this.segment(), 0L, value); return this; }

    /// {@return `slice_act_cr_qp_offset` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte slice_act_cr_qp_offset(MemorySegment segment, long index) { return (byte) VH_slice_act_cr_qp_offset.get(segment, 0L, index); }
    /// {@return `slice_act_cr_qp_offset`}
    public byte slice_act_cr_qp_offset() { return slice_act_cr_qp_offset(this.segment(), 0L); }
    /// Sets `slice_act_cr_qp_offset` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void slice_act_cr_qp_offset(MemorySegment segment, long index, byte value) { VH_slice_act_cr_qp_offset.set(segment, 0L, index, value); }
    /// Sets `slice_act_cr_qp_offset` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265SliceSegmentHeader slice_act_cr_qp_offset(byte value) { slice_act_cr_qp_offset(this.segment(), 0L, value); return this; }

    /// {@return `slice_qp_delta` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte slice_qp_delta(MemorySegment segment, long index) { return (byte) VH_slice_qp_delta.get(segment, 0L, index); }
    /// {@return `slice_qp_delta`}
    public byte slice_qp_delta() { return slice_qp_delta(this.segment(), 0L); }
    /// Sets `slice_qp_delta` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void slice_qp_delta(MemorySegment segment, long index, byte value) { VH_slice_qp_delta.set(segment, 0L, index, value); }
    /// Sets `slice_qp_delta` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265SliceSegmentHeader slice_qp_delta(byte value) { slice_qp_delta(this.segment(), 0L, value); return this; }

    /// {@return `reserved1` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static short reserved1(MemorySegment segment, long index) { return (short) VH_reserved1.get(segment, 0L, index); }
    /// {@return `reserved1`}
    public short reserved1() { return reserved1(this.segment(), 0L); }
    /// Sets `reserved1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void reserved1(MemorySegment segment, long index, short value) { VH_reserved1.set(segment, 0L, index, value); }
    /// Sets `reserved1` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265SliceSegmentHeader reserved1(short value) { reserved1(this.segment(), 0L, value); return this; }

    /// {@return `pWeightTable` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pWeightTable(MemorySegment segment, long index) { return (MemorySegment) VH_pWeightTable.get(segment, 0L, index); }
    /// {@return `pWeightTable`}
    public MemorySegment pWeightTable() { return pWeightTable(this.segment(), 0L); }
    /// Sets `pWeightTable` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pWeightTable(MemorySegment segment, long index, MemorySegment value) { VH_pWeightTable.set(segment, 0L, index, value); }
    /// Sets `pWeightTable` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265SliceSegmentHeader pWeightTable(MemorySegment value) { pWeightTable(this.segment(), 0L, value); return this; }

    /// Creates a slice of `StdVideoEncodeH265SliceSegmentHeader`.
    /// @param index the index of the struct buffer
    /// @return the slice of `StdVideoEncodeH265SliceSegmentHeader`
    public StdVideoEncodeH265SliceSegmentHeader asSlice(long index) { return new StdVideoEncodeH265SliceSegmentHeader(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `StdVideoEncodeH265SliceSegmentHeader`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `StdVideoEncodeH265SliceSegmentHeader`
    public StdVideoEncodeH265SliceSegmentHeader asSlice(long index, long count) { return new StdVideoEncodeH265SliceSegmentHeader(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `StdVideoEncodeH265SliceSegmentHeader` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public StdVideoEncodeH265SliceSegmentHeader at(long index, Consumer<StdVideoEncodeH265SliceSegmentHeader> func) { func.accept(asSlice(index)); return this; }

    /// {@return `flags` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment flagsAt(long index) { return flags(this.segment(), index); }
    /// Sets `flags` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265SliceSegmentHeader flagsAt(long index, MemorySegment value) { flags(this.segment(), index, value); return this; }
    /// Accepts `flags` with the given function.
    /// @param index the index of the struct buffer
    /// @param func the function
    /// @return `this`
    public StdVideoEncodeH265SliceSegmentHeader flagsAt(long index, Consumer<overrungl.vulkan.video.StdVideoEncodeH265SliceSegmentHeaderFlags> func) { func.accept(overrungl.vulkan.video.StdVideoEncodeH265SliceSegmentHeaderFlags.of(flagsAt(index))); return this; }

    /// {@return `slice_type` at the given index}
    /// @param index the index of the struct buffer
    public int slice_typeAt(long index) { return slice_type(this.segment(), index); }
    /// Sets `slice_type` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265SliceSegmentHeader slice_typeAt(long index, int value) { slice_type(this.segment(), index, value); return this; }

    /// {@return `slice_segment_address` at the given index}
    /// @param index the index of the struct buffer
    public int slice_segment_addressAt(long index) { return slice_segment_address(this.segment(), index); }
    /// Sets `slice_segment_address` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265SliceSegmentHeader slice_segment_addressAt(long index, int value) { slice_segment_address(this.segment(), index, value); return this; }

    /// {@return `collocated_ref_idx` at the given index}
    /// @param index the index of the struct buffer
    public byte collocated_ref_idxAt(long index) { return collocated_ref_idx(this.segment(), index); }
    /// Sets `collocated_ref_idx` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265SliceSegmentHeader collocated_ref_idxAt(long index, byte value) { collocated_ref_idx(this.segment(), index, value); return this; }

    /// {@return `MaxNumMergeCand` at the given index}
    /// @param index the index of the struct buffer
    public byte MaxNumMergeCandAt(long index) { return MaxNumMergeCand(this.segment(), index); }
    /// Sets `MaxNumMergeCand` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265SliceSegmentHeader MaxNumMergeCandAt(long index, byte value) { MaxNumMergeCand(this.segment(), index, value); return this; }

    /// {@return `slice_cb_qp_offset` at the given index}
    /// @param index the index of the struct buffer
    public byte slice_cb_qp_offsetAt(long index) { return slice_cb_qp_offset(this.segment(), index); }
    /// Sets `slice_cb_qp_offset` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265SliceSegmentHeader slice_cb_qp_offsetAt(long index, byte value) { slice_cb_qp_offset(this.segment(), index, value); return this; }

    /// {@return `slice_cr_qp_offset` at the given index}
    /// @param index the index of the struct buffer
    public byte slice_cr_qp_offsetAt(long index) { return slice_cr_qp_offset(this.segment(), index); }
    /// Sets `slice_cr_qp_offset` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265SliceSegmentHeader slice_cr_qp_offsetAt(long index, byte value) { slice_cr_qp_offset(this.segment(), index, value); return this; }

    /// {@return `slice_beta_offset_div2` at the given index}
    /// @param index the index of the struct buffer
    public byte slice_beta_offset_div2At(long index) { return slice_beta_offset_div2(this.segment(), index); }
    /// Sets `slice_beta_offset_div2` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265SliceSegmentHeader slice_beta_offset_div2At(long index, byte value) { slice_beta_offset_div2(this.segment(), index, value); return this; }

    /// {@return `slice_tc_offset_div2` at the given index}
    /// @param index the index of the struct buffer
    public byte slice_tc_offset_div2At(long index) { return slice_tc_offset_div2(this.segment(), index); }
    /// Sets `slice_tc_offset_div2` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265SliceSegmentHeader slice_tc_offset_div2At(long index, byte value) { slice_tc_offset_div2(this.segment(), index, value); return this; }

    /// {@return `slice_act_y_qp_offset` at the given index}
    /// @param index the index of the struct buffer
    public byte slice_act_y_qp_offsetAt(long index) { return slice_act_y_qp_offset(this.segment(), index); }
    /// Sets `slice_act_y_qp_offset` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265SliceSegmentHeader slice_act_y_qp_offsetAt(long index, byte value) { slice_act_y_qp_offset(this.segment(), index, value); return this; }

    /// {@return `slice_act_cb_qp_offset` at the given index}
    /// @param index the index of the struct buffer
    public byte slice_act_cb_qp_offsetAt(long index) { return slice_act_cb_qp_offset(this.segment(), index); }
    /// Sets `slice_act_cb_qp_offset` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265SliceSegmentHeader slice_act_cb_qp_offsetAt(long index, byte value) { slice_act_cb_qp_offset(this.segment(), index, value); return this; }

    /// {@return `slice_act_cr_qp_offset` at the given index}
    /// @param index the index of the struct buffer
    public byte slice_act_cr_qp_offsetAt(long index) { return slice_act_cr_qp_offset(this.segment(), index); }
    /// Sets `slice_act_cr_qp_offset` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265SliceSegmentHeader slice_act_cr_qp_offsetAt(long index, byte value) { slice_act_cr_qp_offset(this.segment(), index, value); return this; }

    /// {@return `slice_qp_delta` at the given index}
    /// @param index the index of the struct buffer
    public byte slice_qp_deltaAt(long index) { return slice_qp_delta(this.segment(), index); }
    /// Sets `slice_qp_delta` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265SliceSegmentHeader slice_qp_deltaAt(long index, byte value) { slice_qp_delta(this.segment(), index, value); return this; }

    /// {@return `reserved1` at the given index}
    /// @param index the index of the struct buffer
    public short reserved1At(long index) { return reserved1(this.segment(), index); }
    /// Sets `reserved1` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265SliceSegmentHeader reserved1At(long index, short value) { reserved1(this.segment(), index, value); return this; }

    /// {@return `pWeightTable` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pWeightTableAt(long index) { return pWeightTable(this.segment(), index); }
    /// Sets `pWeightTable` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265SliceSegmentHeader pWeightTableAt(long index, MemorySegment value) { pWeightTable(this.segment(), index, value); return this; }

}
