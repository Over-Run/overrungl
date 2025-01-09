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
/// ### first_slice_segment_in_pic_flag
/// [VarHandle][#VH_first_slice_segment_in_pic_flag] - [Getter][#first_slice_segment_in_pic_flag()] - [Setter][#first_slice_segment_in_pic_flag(int)]
/// ### dependent_slice_segment_flag
/// [VarHandle][#VH_dependent_slice_segment_flag] - [Getter][#dependent_slice_segment_flag()] - [Setter][#dependent_slice_segment_flag(int)]
/// ### slice_sao_luma_flag
/// [VarHandle][#VH_slice_sao_luma_flag] - [Getter][#slice_sao_luma_flag()] - [Setter][#slice_sao_luma_flag(int)]
/// ### slice_sao_chroma_flag
/// [VarHandle][#VH_slice_sao_chroma_flag] - [Getter][#slice_sao_chroma_flag()] - [Setter][#slice_sao_chroma_flag(int)]
/// ### num_ref_idx_active_override_flag
/// [VarHandle][#VH_num_ref_idx_active_override_flag] - [Getter][#num_ref_idx_active_override_flag()] - [Setter][#num_ref_idx_active_override_flag(int)]
/// ### mvd_l1_zero_flag
/// [VarHandle][#VH_mvd_l1_zero_flag] - [Getter][#mvd_l1_zero_flag()] - [Setter][#mvd_l1_zero_flag(int)]
/// ### cabac_init_flag
/// [VarHandle][#VH_cabac_init_flag] - [Getter][#cabac_init_flag()] - [Setter][#cabac_init_flag(int)]
/// ### cu_chroma_qp_offset_enabled_flag
/// [VarHandle][#VH_cu_chroma_qp_offset_enabled_flag] - [Getter][#cu_chroma_qp_offset_enabled_flag()] - [Setter][#cu_chroma_qp_offset_enabled_flag(int)]
/// ### deblocking_filter_override_flag
/// [VarHandle][#VH_deblocking_filter_override_flag] - [Getter][#deblocking_filter_override_flag()] - [Setter][#deblocking_filter_override_flag(int)]
/// ### slice_deblocking_filter_disabled_flag
/// [VarHandle][#VH_slice_deblocking_filter_disabled_flag] - [Getter][#slice_deblocking_filter_disabled_flag()] - [Setter][#slice_deblocking_filter_disabled_flag(int)]
/// ### collocated_from_l0_flag
/// [VarHandle][#VH_collocated_from_l0_flag] - [Getter][#collocated_from_l0_flag()] - [Setter][#collocated_from_l0_flag(int)]
/// ### slice_loop_filter_across_slices_enabled_flag
/// [VarHandle][#VH_slice_loop_filter_across_slices_enabled_flag] - [Getter][#slice_loop_filter_across_slices_enabled_flag()] - [Setter][#slice_loop_filter_across_slices_enabled_flag(int)]
/// ### reserved
/// [VarHandle][#VH_reserved] - [Getter][#reserved()] - [Setter][#reserved(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct StdVideoEncodeH265SliceSegmentHeaderFlags {
///     uint32_t : 1 first_slice_segment_in_pic_flag;
///     uint32_t : 1 dependent_slice_segment_flag;
///     uint32_t : 1 slice_sao_luma_flag;
///     uint32_t : 1 slice_sao_chroma_flag;
///     uint32_t : 1 num_ref_idx_active_override_flag;
///     uint32_t : 1 mvd_l1_zero_flag;
///     uint32_t : 1 cabac_init_flag;
///     uint32_t : 1 cu_chroma_qp_offset_enabled_flag;
///     uint32_t : 1 deblocking_filter_override_flag;
///     uint32_t : 1 slice_deblocking_filter_disabled_flag;
///     uint32_t : 1 collocated_from_l0_flag;
///     uint32_t : 1 slice_loop_filter_across_slices_enabled_flag;
///     uint32_t : 20 reserved;
/// } StdVideoEncodeH265SliceSegmentHeaderFlags;
/// ```
public final class StdVideoEncodeH265SliceSegmentHeaderFlags extends Struct {
    /// The struct layout of `StdVideoEncodeH265SliceSegmentHeaderFlags`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("first_slice_segment_in_pic_flag"),
        ValueLayout.JAVA_INT.withName("dependent_slice_segment_flag"),
        ValueLayout.JAVA_INT.withName("slice_sao_luma_flag"),
        ValueLayout.JAVA_INT.withName("slice_sao_chroma_flag"),
        ValueLayout.JAVA_INT.withName("num_ref_idx_active_override_flag"),
        ValueLayout.JAVA_INT.withName("mvd_l1_zero_flag"),
        ValueLayout.JAVA_INT.withName("cabac_init_flag"),
        ValueLayout.JAVA_INT.withName("cu_chroma_qp_offset_enabled_flag"),
        ValueLayout.JAVA_INT.withName("deblocking_filter_override_flag"),
        ValueLayout.JAVA_INT.withName("slice_deblocking_filter_disabled_flag"),
        ValueLayout.JAVA_INT.withName("collocated_from_l0_flag"),
        ValueLayout.JAVA_INT.withName("slice_loop_filter_across_slices_enabled_flag"),
        ValueLayout.JAVA_INT.withName("reserved")
    );
    /// The [VarHandle] of `first_slice_segment_in_pic_flag` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_first_slice_segment_in_pic_flag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("first_slice_segment_in_pic_flag"));
    /// The [VarHandle] of `dependent_slice_segment_flag` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_dependent_slice_segment_flag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dependent_slice_segment_flag"));
    /// The [VarHandle] of `slice_sao_luma_flag` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_slice_sao_luma_flag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("slice_sao_luma_flag"));
    /// The [VarHandle] of `slice_sao_chroma_flag` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_slice_sao_chroma_flag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("slice_sao_chroma_flag"));
    /// The [VarHandle] of `num_ref_idx_active_override_flag` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_num_ref_idx_active_override_flag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("num_ref_idx_active_override_flag"));
    /// The [VarHandle] of `mvd_l1_zero_flag` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_mvd_l1_zero_flag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("mvd_l1_zero_flag"));
    /// The [VarHandle] of `cabac_init_flag` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_cabac_init_flag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("cabac_init_flag"));
    /// The [VarHandle] of `cu_chroma_qp_offset_enabled_flag` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_cu_chroma_qp_offset_enabled_flag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("cu_chroma_qp_offset_enabled_flag"));
    /// The [VarHandle] of `deblocking_filter_override_flag` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_deblocking_filter_override_flag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("deblocking_filter_override_flag"));
    /// The [VarHandle] of `slice_deblocking_filter_disabled_flag` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_slice_deblocking_filter_disabled_flag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("slice_deblocking_filter_disabled_flag"));
    /// The [VarHandle] of `collocated_from_l0_flag` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_collocated_from_l0_flag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("collocated_from_l0_flag"));
    /// The [VarHandle] of `slice_loop_filter_across_slices_enabled_flag` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_slice_loop_filter_across_slices_enabled_flag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("slice_loop_filter_across_slices_enabled_flag"));
    /// The [VarHandle] of `reserved` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_reserved = LAYOUT.arrayElementVarHandle(PathElement.groupElement("reserved"));

    /// Creates `StdVideoEncodeH265SliceSegmentHeaderFlags` with the given segment.
    /// @param segment the memory segment
    public StdVideoEncodeH265SliceSegmentHeaderFlags(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `StdVideoEncodeH265SliceSegmentHeaderFlags` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoEncodeH265SliceSegmentHeaderFlags of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new StdVideoEncodeH265SliceSegmentHeaderFlags(segment); }

    /// Creates `StdVideoEncodeH265SliceSegmentHeaderFlags` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoEncodeH265SliceSegmentHeaderFlags ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new StdVideoEncodeH265SliceSegmentHeaderFlags(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `StdVideoEncodeH265SliceSegmentHeaderFlags` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoEncodeH265SliceSegmentHeaderFlags ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new StdVideoEncodeH265SliceSegmentHeaderFlags(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `StdVideoEncodeH265SliceSegmentHeaderFlags` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoEncodeH265SliceSegmentHeaderFlags`
    public static StdVideoEncodeH265SliceSegmentHeaderFlags alloc(SegmentAllocator allocator) { return new StdVideoEncodeH265SliceSegmentHeaderFlags(allocator.allocate(LAYOUT)); }

    /// Allocates a `StdVideoEncodeH265SliceSegmentHeaderFlags` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `StdVideoEncodeH265SliceSegmentHeaderFlags`
    public static StdVideoEncodeH265SliceSegmentHeaderFlags alloc(SegmentAllocator allocator, long count) { return new StdVideoEncodeH265SliceSegmentHeaderFlags(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `StdVideoEncodeH265SliceSegmentHeaderFlags`.
    /// @param index the index of the struct buffer
    /// @return the slice of `StdVideoEncodeH265SliceSegmentHeaderFlags`
    public StdVideoEncodeH265SliceSegmentHeaderFlags asSlice(long index) { return new StdVideoEncodeH265SliceSegmentHeaderFlags(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `StdVideoEncodeH265SliceSegmentHeaderFlags`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `StdVideoEncodeH265SliceSegmentHeaderFlags`
    public StdVideoEncodeH265SliceSegmentHeaderFlags asSlice(long index, long count) { return new StdVideoEncodeH265SliceSegmentHeaderFlags(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

    /// {@return `first_slice_segment_in_pic_flag` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_first_slice_segment_in_pic_flag(MemorySegment segment, long index) { return (int) VH_first_slice_segment_in_pic_flag.get(segment, 0L, index); }
    /// {@return `first_slice_segment_in_pic_flag`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_first_slice_segment_in_pic_flag(MemorySegment segment) { return StdVideoEncodeH265SliceSegmentHeaderFlags.get_first_slice_segment_in_pic_flag(segment, 0L); }
    /// {@return `first_slice_segment_in_pic_flag` at the given index}
    /// @param index the index
    public @CType("uint32_t : 1") int first_slice_segment_in_pic_flagAt(long index) { return StdVideoEncodeH265SliceSegmentHeaderFlags.get_first_slice_segment_in_pic_flag(this.segment(), index); }
    /// {@return `first_slice_segment_in_pic_flag`}
    public @CType("uint32_t : 1") int first_slice_segment_in_pic_flag() { return StdVideoEncodeH265SliceSegmentHeaderFlags.get_first_slice_segment_in_pic_flag(this.segment()); }
    /// Sets `first_slice_segment_in_pic_flag` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_first_slice_segment_in_pic_flag(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_first_slice_segment_in_pic_flag.set(segment, 0L, index, value); }
    /// Sets `first_slice_segment_in_pic_flag` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_first_slice_segment_in_pic_flag(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoEncodeH265SliceSegmentHeaderFlags.set_first_slice_segment_in_pic_flag(segment, 0L, value); }
    /// Sets `first_slice_segment_in_pic_flag` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265SliceSegmentHeaderFlags first_slice_segment_in_pic_flagAt(long index, @CType("uint32_t : 1") int value) { StdVideoEncodeH265SliceSegmentHeaderFlags.set_first_slice_segment_in_pic_flag(this.segment(), index, value); return this; }
    /// Sets `first_slice_segment_in_pic_flag` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265SliceSegmentHeaderFlags first_slice_segment_in_pic_flag(@CType("uint32_t : 1") int value) { StdVideoEncodeH265SliceSegmentHeaderFlags.set_first_slice_segment_in_pic_flag(this.segment(), value); return this; }

    /// {@return `dependent_slice_segment_flag` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_dependent_slice_segment_flag(MemorySegment segment, long index) { return (int) VH_dependent_slice_segment_flag.get(segment, 0L, index); }
    /// {@return `dependent_slice_segment_flag`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_dependent_slice_segment_flag(MemorySegment segment) { return StdVideoEncodeH265SliceSegmentHeaderFlags.get_dependent_slice_segment_flag(segment, 0L); }
    /// {@return `dependent_slice_segment_flag` at the given index}
    /// @param index the index
    public @CType("uint32_t : 1") int dependent_slice_segment_flagAt(long index) { return StdVideoEncodeH265SliceSegmentHeaderFlags.get_dependent_slice_segment_flag(this.segment(), index); }
    /// {@return `dependent_slice_segment_flag`}
    public @CType("uint32_t : 1") int dependent_slice_segment_flag() { return StdVideoEncodeH265SliceSegmentHeaderFlags.get_dependent_slice_segment_flag(this.segment()); }
    /// Sets `dependent_slice_segment_flag` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_dependent_slice_segment_flag(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_dependent_slice_segment_flag.set(segment, 0L, index, value); }
    /// Sets `dependent_slice_segment_flag` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_dependent_slice_segment_flag(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoEncodeH265SliceSegmentHeaderFlags.set_dependent_slice_segment_flag(segment, 0L, value); }
    /// Sets `dependent_slice_segment_flag` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265SliceSegmentHeaderFlags dependent_slice_segment_flagAt(long index, @CType("uint32_t : 1") int value) { StdVideoEncodeH265SliceSegmentHeaderFlags.set_dependent_slice_segment_flag(this.segment(), index, value); return this; }
    /// Sets `dependent_slice_segment_flag` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265SliceSegmentHeaderFlags dependent_slice_segment_flag(@CType("uint32_t : 1") int value) { StdVideoEncodeH265SliceSegmentHeaderFlags.set_dependent_slice_segment_flag(this.segment(), value); return this; }

    /// {@return `slice_sao_luma_flag` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_slice_sao_luma_flag(MemorySegment segment, long index) { return (int) VH_slice_sao_luma_flag.get(segment, 0L, index); }
    /// {@return `slice_sao_luma_flag`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_slice_sao_luma_flag(MemorySegment segment) { return StdVideoEncodeH265SliceSegmentHeaderFlags.get_slice_sao_luma_flag(segment, 0L); }
    /// {@return `slice_sao_luma_flag` at the given index}
    /// @param index the index
    public @CType("uint32_t : 1") int slice_sao_luma_flagAt(long index) { return StdVideoEncodeH265SliceSegmentHeaderFlags.get_slice_sao_luma_flag(this.segment(), index); }
    /// {@return `slice_sao_luma_flag`}
    public @CType("uint32_t : 1") int slice_sao_luma_flag() { return StdVideoEncodeH265SliceSegmentHeaderFlags.get_slice_sao_luma_flag(this.segment()); }
    /// Sets `slice_sao_luma_flag` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_slice_sao_luma_flag(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_slice_sao_luma_flag.set(segment, 0L, index, value); }
    /// Sets `slice_sao_luma_flag` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_slice_sao_luma_flag(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoEncodeH265SliceSegmentHeaderFlags.set_slice_sao_luma_flag(segment, 0L, value); }
    /// Sets `slice_sao_luma_flag` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265SliceSegmentHeaderFlags slice_sao_luma_flagAt(long index, @CType("uint32_t : 1") int value) { StdVideoEncodeH265SliceSegmentHeaderFlags.set_slice_sao_luma_flag(this.segment(), index, value); return this; }
    /// Sets `slice_sao_luma_flag` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265SliceSegmentHeaderFlags slice_sao_luma_flag(@CType("uint32_t : 1") int value) { StdVideoEncodeH265SliceSegmentHeaderFlags.set_slice_sao_luma_flag(this.segment(), value); return this; }

    /// {@return `slice_sao_chroma_flag` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_slice_sao_chroma_flag(MemorySegment segment, long index) { return (int) VH_slice_sao_chroma_flag.get(segment, 0L, index); }
    /// {@return `slice_sao_chroma_flag`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_slice_sao_chroma_flag(MemorySegment segment) { return StdVideoEncodeH265SliceSegmentHeaderFlags.get_slice_sao_chroma_flag(segment, 0L); }
    /// {@return `slice_sao_chroma_flag` at the given index}
    /// @param index the index
    public @CType("uint32_t : 1") int slice_sao_chroma_flagAt(long index) { return StdVideoEncodeH265SliceSegmentHeaderFlags.get_slice_sao_chroma_flag(this.segment(), index); }
    /// {@return `slice_sao_chroma_flag`}
    public @CType("uint32_t : 1") int slice_sao_chroma_flag() { return StdVideoEncodeH265SliceSegmentHeaderFlags.get_slice_sao_chroma_flag(this.segment()); }
    /// Sets `slice_sao_chroma_flag` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_slice_sao_chroma_flag(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_slice_sao_chroma_flag.set(segment, 0L, index, value); }
    /// Sets `slice_sao_chroma_flag` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_slice_sao_chroma_flag(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoEncodeH265SliceSegmentHeaderFlags.set_slice_sao_chroma_flag(segment, 0L, value); }
    /// Sets `slice_sao_chroma_flag` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265SliceSegmentHeaderFlags slice_sao_chroma_flagAt(long index, @CType("uint32_t : 1") int value) { StdVideoEncodeH265SliceSegmentHeaderFlags.set_slice_sao_chroma_flag(this.segment(), index, value); return this; }
    /// Sets `slice_sao_chroma_flag` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265SliceSegmentHeaderFlags slice_sao_chroma_flag(@CType("uint32_t : 1") int value) { StdVideoEncodeH265SliceSegmentHeaderFlags.set_slice_sao_chroma_flag(this.segment(), value); return this; }

    /// {@return `num_ref_idx_active_override_flag` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_num_ref_idx_active_override_flag(MemorySegment segment, long index) { return (int) VH_num_ref_idx_active_override_flag.get(segment, 0L, index); }
    /// {@return `num_ref_idx_active_override_flag`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_num_ref_idx_active_override_flag(MemorySegment segment) { return StdVideoEncodeH265SliceSegmentHeaderFlags.get_num_ref_idx_active_override_flag(segment, 0L); }
    /// {@return `num_ref_idx_active_override_flag` at the given index}
    /// @param index the index
    public @CType("uint32_t : 1") int num_ref_idx_active_override_flagAt(long index) { return StdVideoEncodeH265SliceSegmentHeaderFlags.get_num_ref_idx_active_override_flag(this.segment(), index); }
    /// {@return `num_ref_idx_active_override_flag`}
    public @CType("uint32_t : 1") int num_ref_idx_active_override_flag() { return StdVideoEncodeH265SliceSegmentHeaderFlags.get_num_ref_idx_active_override_flag(this.segment()); }
    /// Sets `num_ref_idx_active_override_flag` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_num_ref_idx_active_override_flag(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_num_ref_idx_active_override_flag.set(segment, 0L, index, value); }
    /// Sets `num_ref_idx_active_override_flag` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_num_ref_idx_active_override_flag(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoEncodeH265SliceSegmentHeaderFlags.set_num_ref_idx_active_override_flag(segment, 0L, value); }
    /// Sets `num_ref_idx_active_override_flag` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265SliceSegmentHeaderFlags num_ref_idx_active_override_flagAt(long index, @CType("uint32_t : 1") int value) { StdVideoEncodeH265SliceSegmentHeaderFlags.set_num_ref_idx_active_override_flag(this.segment(), index, value); return this; }
    /// Sets `num_ref_idx_active_override_flag` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265SliceSegmentHeaderFlags num_ref_idx_active_override_flag(@CType("uint32_t : 1") int value) { StdVideoEncodeH265SliceSegmentHeaderFlags.set_num_ref_idx_active_override_flag(this.segment(), value); return this; }

    /// {@return `mvd_l1_zero_flag` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_mvd_l1_zero_flag(MemorySegment segment, long index) { return (int) VH_mvd_l1_zero_flag.get(segment, 0L, index); }
    /// {@return `mvd_l1_zero_flag`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_mvd_l1_zero_flag(MemorySegment segment) { return StdVideoEncodeH265SliceSegmentHeaderFlags.get_mvd_l1_zero_flag(segment, 0L); }
    /// {@return `mvd_l1_zero_flag` at the given index}
    /// @param index the index
    public @CType("uint32_t : 1") int mvd_l1_zero_flagAt(long index) { return StdVideoEncodeH265SliceSegmentHeaderFlags.get_mvd_l1_zero_flag(this.segment(), index); }
    /// {@return `mvd_l1_zero_flag`}
    public @CType("uint32_t : 1") int mvd_l1_zero_flag() { return StdVideoEncodeH265SliceSegmentHeaderFlags.get_mvd_l1_zero_flag(this.segment()); }
    /// Sets `mvd_l1_zero_flag` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_mvd_l1_zero_flag(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_mvd_l1_zero_flag.set(segment, 0L, index, value); }
    /// Sets `mvd_l1_zero_flag` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_mvd_l1_zero_flag(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoEncodeH265SliceSegmentHeaderFlags.set_mvd_l1_zero_flag(segment, 0L, value); }
    /// Sets `mvd_l1_zero_flag` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265SliceSegmentHeaderFlags mvd_l1_zero_flagAt(long index, @CType("uint32_t : 1") int value) { StdVideoEncodeH265SliceSegmentHeaderFlags.set_mvd_l1_zero_flag(this.segment(), index, value); return this; }
    /// Sets `mvd_l1_zero_flag` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265SliceSegmentHeaderFlags mvd_l1_zero_flag(@CType("uint32_t : 1") int value) { StdVideoEncodeH265SliceSegmentHeaderFlags.set_mvd_l1_zero_flag(this.segment(), value); return this; }

    /// {@return `cabac_init_flag` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_cabac_init_flag(MemorySegment segment, long index) { return (int) VH_cabac_init_flag.get(segment, 0L, index); }
    /// {@return `cabac_init_flag`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_cabac_init_flag(MemorySegment segment) { return StdVideoEncodeH265SliceSegmentHeaderFlags.get_cabac_init_flag(segment, 0L); }
    /// {@return `cabac_init_flag` at the given index}
    /// @param index the index
    public @CType("uint32_t : 1") int cabac_init_flagAt(long index) { return StdVideoEncodeH265SliceSegmentHeaderFlags.get_cabac_init_flag(this.segment(), index); }
    /// {@return `cabac_init_flag`}
    public @CType("uint32_t : 1") int cabac_init_flag() { return StdVideoEncodeH265SliceSegmentHeaderFlags.get_cabac_init_flag(this.segment()); }
    /// Sets `cabac_init_flag` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_cabac_init_flag(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_cabac_init_flag.set(segment, 0L, index, value); }
    /// Sets `cabac_init_flag` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_cabac_init_flag(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoEncodeH265SliceSegmentHeaderFlags.set_cabac_init_flag(segment, 0L, value); }
    /// Sets `cabac_init_flag` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265SliceSegmentHeaderFlags cabac_init_flagAt(long index, @CType("uint32_t : 1") int value) { StdVideoEncodeH265SliceSegmentHeaderFlags.set_cabac_init_flag(this.segment(), index, value); return this; }
    /// Sets `cabac_init_flag` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265SliceSegmentHeaderFlags cabac_init_flag(@CType("uint32_t : 1") int value) { StdVideoEncodeH265SliceSegmentHeaderFlags.set_cabac_init_flag(this.segment(), value); return this; }

    /// {@return `cu_chroma_qp_offset_enabled_flag` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_cu_chroma_qp_offset_enabled_flag(MemorySegment segment, long index) { return (int) VH_cu_chroma_qp_offset_enabled_flag.get(segment, 0L, index); }
    /// {@return `cu_chroma_qp_offset_enabled_flag`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_cu_chroma_qp_offset_enabled_flag(MemorySegment segment) { return StdVideoEncodeH265SliceSegmentHeaderFlags.get_cu_chroma_qp_offset_enabled_flag(segment, 0L); }
    /// {@return `cu_chroma_qp_offset_enabled_flag` at the given index}
    /// @param index the index
    public @CType("uint32_t : 1") int cu_chroma_qp_offset_enabled_flagAt(long index) { return StdVideoEncodeH265SliceSegmentHeaderFlags.get_cu_chroma_qp_offset_enabled_flag(this.segment(), index); }
    /// {@return `cu_chroma_qp_offset_enabled_flag`}
    public @CType("uint32_t : 1") int cu_chroma_qp_offset_enabled_flag() { return StdVideoEncodeH265SliceSegmentHeaderFlags.get_cu_chroma_qp_offset_enabled_flag(this.segment()); }
    /// Sets `cu_chroma_qp_offset_enabled_flag` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_cu_chroma_qp_offset_enabled_flag(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_cu_chroma_qp_offset_enabled_flag.set(segment, 0L, index, value); }
    /// Sets `cu_chroma_qp_offset_enabled_flag` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_cu_chroma_qp_offset_enabled_flag(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoEncodeH265SliceSegmentHeaderFlags.set_cu_chroma_qp_offset_enabled_flag(segment, 0L, value); }
    /// Sets `cu_chroma_qp_offset_enabled_flag` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265SliceSegmentHeaderFlags cu_chroma_qp_offset_enabled_flagAt(long index, @CType("uint32_t : 1") int value) { StdVideoEncodeH265SliceSegmentHeaderFlags.set_cu_chroma_qp_offset_enabled_flag(this.segment(), index, value); return this; }
    /// Sets `cu_chroma_qp_offset_enabled_flag` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265SliceSegmentHeaderFlags cu_chroma_qp_offset_enabled_flag(@CType("uint32_t : 1") int value) { StdVideoEncodeH265SliceSegmentHeaderFlags.set_cu_chroma_qp_offset_enabled_flag(this.segment(), value); return this; }

    /// {@return `deblocking_filter_override_flag` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_deblocking_filter_override_flag(MemorySegment segment, long index) { return (int) VH_deblocking_filter_override_flag.get(segment, 0L, index); }
    /// {@return `deblocking_filter_override_flag`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_deblocking_filter_override_flag(MemorySegment segment) { return StdVideoEncodeH265SliceSegmentHeaderFlags.get_deblocking_filter_override_flag(segment, 0L); }
    /// {@return `deblocking_filter_override_flag` at the given index}
    /// @param index the index
    public @CType("uint32_t : 1") int deblocking_filter_override_flagAt(long index) { return StdVideoEncodeH265SliceSegmentHeaderFlags.get_deblocking_filter_override_flag(this.segment(), index); }
    /// {@return `deblocking_filter_override_flag`}
    public @CType("uint32_t : 1") int deblocking_filter_override_flag() { return StdVideoEncodeH265SliceSegmentHeaderFlags.get_deblocking_filter_override_flag(this.segment()); }
    /// Sets `deblocking_filter_override_flag` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_deblocking_filter_override_flag(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_deblocking_filter_override_flag.set(segment, 0L, index, value); }
    /// Sets `deblocking_filter_override_flag` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_deblocking_filter_override_flag(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoEncodeH265SliceSegmentHeaderFlags.set_deblocking_filter_override_flag(segment, 0L, value); }
    /// Sets `deblocking_filter_override_flag` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265SliceSegmentHeaderFlags deblocking_filter_override_flagAt(long index, @CType("uint32_t : 1") int value) { StdVideoEncodeH265SliceSegmentHeaderFlags.set_deblocking_filter_override_flag(this.segment(), index, value); return this; }
    /// Sets `deblocking_filter_override_flag` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265SliceSegmentHeaderFlags deblocking_filter_override_flag(@CType("uint32_t : 1") int value) { StdVideoEncodeH265SliceSegmentHeaderFlags.set_deblocking_filter_override_flag(this.segment(), value); return this; }

    /// {@return `slice_deblocking_filter_disabled_flag` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_slice_deblocking_filter_disabled_flag(MemorySegment segment, long index) { return (int) VH_slice_deblocking_filter_disabled_flag.get(segment, 0L, index); }
    /// {@return `slice_deblocking_filter_disabled_flag`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_slice_deblocking_filter_disabled_flag(MemorySegment segment) { return StdVideoEncodeH265SliceSegmentHeaderFlags.get_slice_deblocking_filter_disabled_flag(segment, 0L); }
    /// {@return `slice_deblocking_filter_disabled_flag` at the given index}
    /// @param index the index
    public @CType("uint32_t : 1") int slice_deblocking_filter_disabled_flagAt(long index) { return StdVideoEncodeH265SliceSegmentHeaderFlags.get_slice_deblocking_filter_disabled_flag(this.segment(), index); }
    /// {@return `slice_deblocking_filter_disabled_flag`}
    public @CType("uint32_t : 1") int slice_deblocking_filter_disabled_flag() { return StdVideoEncodeH265SliceSegmentHeaderFlags.get_slice_deblocking_filter_disabled_flag(this.segment()); }
    /// Sets `slice_deblocking_filter_disabled_flag` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_slice_deblocking_filter_disabled_flag(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_slice_deblocking_filter_disabled_flag.set(segment, 0L, index, value); }
    /// Sets `slice_deblocking_filter_disabled_flag` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_slice_deblocking_filter_disabled_flag(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoEncodeH265SliceSegmentHeaderFlags.set_slice_deblocking_filter_disabled_flag(segment, 0L, value); }
    /// Sets `slice_deblocking_filter_disabled_flag` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265SliceSegmentHeaderFlags slice_deblocking_filter_disabled_flagAt(long index, @CType("uint32_t : 1") int value) { StdVideoEncodeH265SliceSegmentHeaderFlags.set_slice_deblocking_filter_disabled_flag(this.segment(), index, value); return this; }
    /// Sets `slice_deblocking_filter_disabled_flag` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265SliceSegmentHeaderFlags slice_deblocking_filter_disabled_flag(@CType("uint32_t : 1") int value) { StdVideoEncodeH265SliceSegmentHeaderFlags.set_slice_deblocking_filter_disabled_flag(this.segment(), value); return this; }

    /// {@return `collocated_from_l0_flag` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_collocated_from_l0_flag(MemorySegment segment, long index) { return (int) VH_collocated_from_l0_flag.get(segment, 0L, index); }
    /// {@return `collocated_from_l0_flag`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_collocated_from_l0_flag(MemorySegment segment) { return StdVideoEncodeH265SliceSegmentHeaderFlags.get_collocated_from_l0_flag(segment, 0L); }
    /// {@return `collocated_from_l0_flag` at the given index}
    /// @param index the index
    public @CType("uint32_t : 1") int collocated_from_l0_flagAt(long index) { return StdVideoEncodeH265SliceSegmentHeaderFlags.get_collocated_from_l0_flag(this.segment(), index); }
    /// {@return `collocated_from_l0_flag`}
    public @CType("uint32_t : 1") int collocated_from_l0_flag() { return StdVideoEncodeH265SliceSegmentHeaderFlags.get_collocated_from_l0_flag(this.segment()); }
    /// Sets `collocated_from_l0_flag` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_collocated_from_l0_flag(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_collocated_from_l0_flag.set(segment, 0L, index, value); }
    /// Sets `collocated_from_l0_flag` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_collocated_from_l0_flag(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoEncodeH265SliceSegmentHeaderFlags.set_collocated_from_l0_flag(segment, 0L, value); }
    /// Sets `collocated_from_l0_flag` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265SliceSegmentHeaderFlags collocated_from_l0_flagAt(long index, @CType("uint32_t : 1") int value) { StdVideoEncodeH265SliceSegmentHeaderFlags.set_collocated_from_l0_flag(this.segment(), index, value); return this; }
    /// Sets `collocated_from_l0_flag` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265SliceSegmentHeaderFlags collocated_from_l0_flag(@CType("uint32_t : 1") int value) { StdVideoEncodeH265SliceSegmentHeaderFlags.set_collocated_from_l0_flag(this.segment(), value); return this; }

    /// {@return `slice_loop_filter_across_slices_enabled_flag` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_slice_loop_filter_across_slices_enabled_flag(MemorySegment segment, long index) { return (int) VH_slice_loop_filter_across_slices_enabled_flag.get(segment, 0L, index); }
    /// {@return `slice_loop_filter_across_slices_enabled_flag`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_slice_loop_filter_across_slices_enabled_flag(MemorySegment segment) { return StdVideoEncodeH265SliceSegmentHeaderFlags.get_slice_loop_filter_across_slices_enabled_flag(segment, 0L); }
    /// {@return `slice_loop_filter_across_slices_enabled_flag` at the given index}
    /// @param index the index
    public @CType("uint32_t : 1") int slice_loop_filter_across_slices_enabled_flagAt(long index) { return StdVideoEncodeH265SliceSegmentHeaderFlags.get_slice_loop_filter_across_slices_enabled_flag(this.segment(), index); }
    /// {@return `slice_loop_filter_across_slices_enabled_flag`}
    public @CType("uint32_t : 1") int slice_loop_filter_across_slices_enabled_flag() { return StdVideoEncodeH265SliceSegmentHeaderFlags.get_slice_loop_filter_across_slices_enabled_flag(this.segment()); }
    /// Sets `slice_loop_filter_across_slices_enabled_flag` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_slice_loop_filter_across_slices_enabled_flag(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_slice_loop_filter_across_slices_enabled_flag.set(segment, 0L, index, value); }
    /// Sets `slice_loop_filter_across_slices_enabled_flag` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_slice_loop_filter_across_slices_enabled_flag(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoEncodeH265SliceSegmentHeaderFlags.set_slice_loop_filter_across_slices_enabled_flag(segment, 0L, value); }
    /// Sets `slice_loop_filter_across_slices_enabled_flag` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265SliceSegmentHeaderFlags slice_loop_filter_across_slices_enabled_flagAt(long index, @CType("uint32_t : 1") int value) { StdVideoEncodeH265SliceSegmentHeaderFlags.set_slice_loop_filter_across_slices_enabled_flag(this.segment(), index, value); return this; }
    /// Sets `slice_loop_filter_across_slices_enabled_flag` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265SliceSegmentHeaderFlags slice_loop_filter_across_slices_enabled_flag(@CType("uint32_t : 1") int value) { StdVideoEncodeH265SliceSegmentHeaderFlags.set_slice_loop_filter_across_slices_enabled_flag(this.segment(), value); return this; }

    /// {@return `reserved` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 20") int get_reserved(MemorySegment segment, long index) { return (int) VH_reserved.get(segment, 0L, index); }
    /// {@return `reserved`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 20") int get_reserved(MemorySegment segment) { return StdVideoEncodeH265SliceSegmentHeaderFlags.get_reserved(segment, 0L); }
    /// {@return `reserved` at the given index}
    /// @param index the index
    public @CType("uint32_t : 20") int reservedAt(long index) { return StdVideoEncodeH265SliceSegmentHeaderFlags.get_reserved(this.segment(), index); }
    /// {@return `reserved`}
    public @CType("uint32_t : 20") int reserved() { return StdVideoEncodeH265SliceSegmentHeaderFlags.get_reserved(this.segment()); }
    /// Sets `reserved` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_reserved(MemorySegment segment, long index, @CType("uint32_t : 20") int value) { VH_reserved.set(segment, 0L, index, value); }
    /// Sets `reserved` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_reserved(MemorySegment segment, @CType("uint32_t : 20") int value) { StdVideoEncodeH265SliceSegmentHeaderFlags.set_reserved(segment, 0L, value); }
    /// Sets `reserved` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265SliceSegmentHeaderFlags reservedAt(long index, @CType("uint32_t : 20") int value) { StdVideoEncodeH265SliceSegmentHeaderFlags.set_reserved(this.segment(), index, value); return this; }
    /// Sets `reserved` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265SliceSegmentHeaderFlags reserved(@CType("uint32_t : 20") int value) { StdVideoEncodeH265SliceSegmentHeaderFlags.set_reserved(this.segment(), value); return this; }

}
