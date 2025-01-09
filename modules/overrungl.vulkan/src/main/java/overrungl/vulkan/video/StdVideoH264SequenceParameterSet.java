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
/// ### profile_idc
/// [VarHandle][#VH_profile_idc] - [Getter][#profile_idc()] - [Setter][#profile_idc(int)]
/// ### level_idc
/// [VarHandle][#VH_level_idc] - [Getter][#level_idc()] - [Setter][#level_idc(int)]
/// ### chroma_format_idc
/// [VarHandle][#VH_chroma_format_idc] - [Getter][#chroma_format_idc()] - [Setter][#chroma_format_idc(int)]
/// ### seq_parameter_set_id
/// [VarHandle][#VH_seq_parameter_set_id] - [Getter][#seq_parameter_set_id()] - [Setter][#seq_parameter_set_id(byte)]
/// ### bit_depth_luma_minus8
/// [VarHandle][#VH_bit_depth_luma_minus8] - [Getter][#bit_depth_luma_minus8()] - [Setter][#bit_depth_luma_minus8(byte)]
/// ### bit_depth_chroma_minus8
/// [VarHandle][#VH_bit_depth_chroma_minus8] - [Getter][#bit_depth_chroma_minus8()] - [Setter][#bit_depth_chroma_minus8(byte)]
/// ### log2_max_frame_num_minus4
/// [VarHandle][#VH_log2_max_frame_num_minus4] - [Getter][#log2_max_frame_num_minus4()] - [Setter][#log2_max_frame_num_minus4(byte)]
/// ### pic_order_cnt_type
/// [VarHandle][#VH_pic_order_cnt_type] - [Getter][#pic_order_cnt_type()] - [Setter][#pic_order_cnt_type(int)]
/// ### offset_for_non_ref_pic
/// [VarHandle][#VH_offset_for_non_ref_pic] - [Getter][#offset_for_non_ref_pic()] - [Setter][#offset_for_non_ref_pic(int)]
/// ### offset_for_top_to_bottom_field
/// [VarHandle][#VH_offset_for_top_to_bottom_field] - [Getter][#offset_for_top_to_bottom_field()] - [Setter][#offset_for_top_to_bottom_field(int)]
/// ### log2_max_pic_order_cnt_lsb_minus4
/// [VarHandle][#VH_log2_max_pic_order_cnt_lsb_minus4] - [Getter][#log2_max_pic_order_cnt_lsb_minus4()] - [Setter][#log2_max_pic_order_cnt_lsb_minus4(byte)]
/// ### num_ref_frames_in_pic_order_cnt_cycle
/// [VarHandle][#VH_num_ref_frames_in_pic_order_cnt_cycle] - [Getter][#num_ref_frames_in_pic_order_cnt_cycle()] - [Setter][#num_ref_frames_in_pic_order_cnt_cycle(byte)]
/// ### max_num_ref_frames
/// [VarHandle][#VH_max_num_ref_frames] - [Getter][#max_num_ref_frames()] - [Setter][#max_num_ref_frames(byte)]
/// ### reserved1
/// [VarHandle][#VH_reserved1] - [Getter][#reserved1()] - [Setter][#reserved1(byte)]
/// ### pic_width_in_mbs_minus1
/// [VarHandle][#VH_pic_width_in_mbs_minus1] - [Getter][#pic_width_in_mbs_minus1()] - [Setter][#pic_width_in_mbs_minus1(int)]
/// ### pic_height_in_map_units_minus1
/// [VarHandle][#VH_pic_height_in_map_units_minus1] - [Getter][#pic_height_in_map_units_minus1()] - [Setter][#pic_height_in_map_units_minus1(int)]
/// ### frame_crop_left_offset
/// [VarHandle][#VH_frame_crop_left_offset] - [Getter][#frame_crop_left_offset()] - [Setter][#frame_crop_left_offset(int)]
/// ### frame_crop_right_offset
/// [VarHandle][#VH_frame_crop_right_offset] - [Getter][#frame_crop_right_offset()] - [Setter][#frame_crop_right_offset(int)]
/// ### frame_crop_top_offset
/// [VarHandle][#VH_frame_crop_top_offset] - [Getter][#frame_crop_top_offset()] - [Setter][#frame_crop_top_offset(int)]
/// ### frame_crop_bottom_offset
/// [VarHandle][#VH_frame_crop_bottom_offset] - [Getter][#frame_crop_bottom_offset()] - [Setter][#frame_crop_bottom_offset(int)]
/// ### reserved2
/// [VarHandle][#VH_reserved2] - [Getter][#reserved2()] - [Setter][#reserved2(int)]
/// ### pOffsetForRefFrame
/// [VarHandle][#VH_pOffsetForRefFrame] - [Getter][#pOffsetForRefFrame()] - [Setter][#pOffsetForRefFrame(java.lang.foreign.MemorySegment)]
/// ### pScalingLists
/// [VarHandle][#VH_pScalingLists] - [Getter][#pScalingLists()] - [Setter][#pScalingLists(java.lang.foreign.MemorySegment)]
/// ### pSequenceParameterSetVui
/// [VarHandle][#VH_pSequenceParameterSetVui] - [Getter][#pSequenceParameterSetVui()] - [Setter][#pSequenceParameterSetVui(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct StdVideoH264SequenceParameterSet {
///     StdVideoH264SpsFlags flags;
///     StdVideoH264ProfileIdc profile_idc;
///     StdVideoH264LevelIdc level_idc;
///     StdVideoH264ChromaFormatIdc chroma_format_idc;
///     uint8_t seq_parameter_set_id;
///     uint8_t bit_depth_luma_minus8;
///     uint8_t bit_depth_chroma_minus8;
///     uint8_t log2_max_frame_num_minus4;
///     StdVideoH264PocType pic_order_cnt_type;
///     int32_t offset_for_non_ref_pic;
///     int32_t offset_for_top_to_bottom_field;
///     uint8_t log2_max_pic_order_cnt_lsb_minus4;
///     uint8_t num_ref_frames_in_pic_order_cnt_cycle;
///     uint8_t max_num_ref_frames;
///     uint8_t reserved1;
///     uint32_t pic_width_in_mbs_minus1;
///     uint32_t pic_height_in_map_units_minus1;
///     uint32_t frame_crop_left_offset;
///     uint32_t frame_crop_right_offset;
///     uint32_t frame_crop_top_offset;
///     uint32_t frame_crop_bottom_offset;
///     uint32_t reserved2;
///     const int32_t * pOffsetForRefFrame;
///     const StdVideoH264ScalingLists * pScalingLists;
///     const StdVideoH264SequenceParameterSetVui * pSequenceParameterSetVui;
/// } StdVideoH264SequenceParameterSet;
/// ```
public final class StdVideoH264SequenceParameterSet extends Struct {
    /// The struct layout of `StdVideoH264SequenceParameterSet`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        StdVideoH264SpsFlags.LAYOUT.withName("flags"),
        ValueLayout.JAVA_INT.withName("profile_idc"),
        ValueLayout.JAVA_INT.withName("level_idc"),
        ValueLayout.JAVA_INT.withName("chroma_format_idc"),
        ValueLayout.JAVA_BYTE.withName("seq_parameter_set_id"),
        ValueLayout.JAVA_BYTE.withName("bit_depth_luma_minus8"),
        ValueLayout.JAVA_BYTE.withName("bit_depth_chroma_minus8"),
        ValueLayout.JAVA_BYTE.withName("log2_max_frame_num_minus4"),
        ValueLayout.JAVA_INT.withName("pic_order_cnt_type"),
        ValueLayout.JAVA_INT.withName("offset_for_non_ref_pic"),
        ValueLayout.JAVA_INT.withName("offset_for_top_to_bottom_field"),
        ValueLayout.JAVA_BYTE.withName("log2_max_pic_order_cnt_lsb_minus4"),
        ValueLayout.JAVA_BYTE.withName("num_ref_frames_in_pic_order_cnt_cycle"),
        ValueLayout.JAVA_BYTE.withName("max_num_ref_frames"),
        ValueLayout.JAVA_BYTE.withName("reserved1"),
        ValueLayout.JAVA_INT.withName("pic_width_in_mbs_minus1"),
        ValueLayout.JAVA_INT.withName("pic_height_in_map_units_minus1"),
        ValueLayout.JAVA_INT.withName("frame_crop_left_offset"),
        ValueLayout.JAVA_INT.withName("frame_crop_right_offset"),
        ValueLayout.JAVA_INT.withName("frame_crop_top_offset"),
        ValueLayout.JAVA_INT.withName("frame_crop_bottom_offset"),
        ValueLayout.JAVA_INT.withName("reserved2"),
        ValueLayout.ADDRESS.withName("pOffsetForRefFrame"),
        ValueLayout.ADDRESS.withName("pScalingLists"),
        ValueLayout.ADDRESS.withName("pSequenceParameterSetVui")
    );
    /// The [VarHandle] of `flags` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    /// The [VarHandle] of `profile_idc` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_profile_idc = LAYOUT.arrayElementVarHandle(PathElement.groupElement("profile_idc"));
    /// The [VarHandle] of `level_idc` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_level_idc = LAYOUT.arrayElementVarHandle(PathElement.groupElement("level_idc"));
    /// The [VarHandle] of `chroma_format_idc` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_chroma_format_idc = LAYOUT.arrayElementVarHandle(PathElement.groupElement("chroma_format_idc"));
    /// The [VarHandle] of `seq_parameter_set_id` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_seq_parameter_set_id = LAYOUT.arrayElementVarHandle(PathElement.groupElement("seq_parameter_set_id"));
    /// The [VarHandle] of `bit_depth_luma_minus8` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_bit_depth_luma_minus8 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("bit_depth_luma_minus8"));
    /// The [VarHandle] of `bit_depth_chroma_minus8` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_bit_depth_chroma_minus8 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("bit_depth_chroma_minus8"));
    /// The [VarHandle] of `log2_max_frame_num_minus4` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_log2_max_frame_num_minus4 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("log2_max_frame_num_minus4"));
    /// The [VarHandle] of `pic_order_cnt_type` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_pic_order_cnt_type = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pic_order_cnt_type"));
    /// The [VarHandle] of `offset_for_non_ref_pic` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_offset_for_non_ref_pic = LAYOUT.arrayElementVarHandle(PathElement.groupElement("offset_for_non_ref_pic"));
    /// The [VarHandle] of `offset_for_top_to_bottom_field` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_offset_for_top_to_bottom_field = LAYOUT.arrayElementVarHandle(PathElement.groupElement("offset_for_top_to_bottom_field"));
    /// The [VarHandle] of `log2_max_pic_order_cnt_lsb_minus4` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_log2_max_pic_order_cnt_lsb_minus4 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("log2_max_pic_order_cnt_lsb_minus4"));
    /// The [VarHandle] of `num_ref_frames_in_pic_order_cnt_cycle` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_num_ref_frames_in_pic_order_cnt_cycle = LAYOUT.arrayElementVarHandle(PathElement.groupElement("num_ref_frames_in_pic_order_cnt_cycle"));
    /// The [VarHandle] of `max_num_ref_frames` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_max_num_ref_frames = LAYOUT.arrayElementVarHandle(PathElement.groupElement("max_num_ref_frames"));
    /// The [VarHandle] of `reserved1` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_reserved1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("reserved1"));
    /// The [VarHandle] of `pic_width_in_mbs_minus1` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_pic_width_in_mbs_minus1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pic_width_in_mbs_minus1"));
    /// The [VarHandle] of `pic_height_in_map_units_minus1` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_pic_height_in_map_units_minus1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pic_height_in_map_units_minus1"));
    /// The [VarHandle] of `frame_crop_left_offset` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_frame_crop_left_offset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("frame_crop_left_offset"));
    /// The [VarHandle] of `frame_crop_right_offset` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_frame_crop_right_offset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("frame_crop_right_offset"));
    /// The [VarHandle] of `frame_crop_top_offset` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_frame_crop_top_offset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("frame_crop_top_offset"));
    /// The [VarHandle] of `frame_crop_bottom_offset` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_frame_crop_bottom_offset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("frame_crop_bottom_offset"));
    /// The [VarHandle] of `reserved2` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_reserved2 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("reserved2"));
    /// The [VarHandle] of `pOffsetForRefFrame` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pOffsetForRefFrame = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pOffsetForRefFrame"));
    /// The [VarHandle] of `pScalingLists` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pScalingLists = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pScalingLists"));
    /// The [VarHandle] of `pSequenceParameterSetVui` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pSequenceParameterSetVui = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pSequenceParameterSetVui"));

    /// Creates `StdVideoH264SequenceParameterSet` with the given segment.
    /// @param segment the memory segment
    public StdVideoH264SequenceParameterSet(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `StdVideoH264SequenceParameterSet` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoH264SequenceParameterSet of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new StdVideoH264SequenceParameterSet(segment); }

    /// Creates `StdVideoH264SequenceParameterSet` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoH264SequenceParameterSet ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new StdVideoH264SequenceParameterSet(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `StdVideoH264SequenceParameterSet` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoH264SequenceParameterSet ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new StdVideoH264SequenceParameterSet(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `StdVideoH264SequenceParameterSet` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoH264SequenceParameterSet`
    public static StdVideoH264SequenceParameterSet alloc(SegmentAllocator allocator) { return new StdVideoH264SequenceParameterSet(allocator.allocate(LAYOUT)); }

    /// Allocates a `StdVideoH264SequenceParameterSet` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `StdVideoH264SequenceParameterSet`
    public static StdVideoH264SequenceParameterSet alloc(SegmentAllocator allocator, long count) { return new StdVideoH264SequenceParameterSet(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `StdVideoH264SequenceParameterSet`.
    /// @param index the index of the struct buffer
    /// @return the slice of `StdVideoH264SequenceParameterSet`
    public StdVideoH264SequenceParameterSet asSlice(long index) { return new StdVideoH264SequenceParameterSet(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `StdVideoH264SequenceParameterSet`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `StdVideoH264SequenceParameterSet`
    public StdVideoH264SequenceParameterSet asSlice(long index, long count) { return new StdVideoH264SequenceParameterSet(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("StdVideoH264SpsFlags") java.lang.foreign.MemorySegment get_flags(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_flags.get(segment, 0L, index); }
    /// {@return `flags`}
    /// @param segment the segment of the struct
    public static @CType("StdVideoH264SpsFlags") java.lang.foreign.MemorySegment get_flags(MemorySegment segment) { return StdVideoH264SequenceParameterSet.get_flags(segment, 0L); }
    /// {@return `flags` at the given index}
    /// @param index the index
    public @CType("StdVideoH264SpsFlags") java.lang.foreign.MemorySegment flagsAt(long index) { return StdVideoH264SequenceParameterSet.get_flags(this.segment(), index); }
    /// {@return `flags`}
    public @CType("StdVideoH264SpsFlags") java.lang.foreign.MemorySegment flags() { return StdVideoH264SequenceParameterSet.get_flags(this.segment()); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_flags(MemorySegment segment, long index, @CType("StdVideoH264SpsFlags") java.lang.foreign.MemorySegment value) { VH_flags.set(segment, 0L, index, value); }
    /// Sets `flags` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_flags(MemorySegment segment, @CType("StdVideoH264SpsFlags") java.lang.foreign.MemorySegment value) { StdVideoH264SequenceParameterSet.set_flags(segment, 0L, value); }
    /// Sets `flags` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoH264SequenceParameterSet flagsAt(long index, @CType("StdVideoH264SpsFlags") java.lang.foreign.MemorySegment value) { StdVideoH264SequenceParameterSet.set_flags(this.segment(), index, value); return this; }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH264SequenceParameterSet flags(@CType("StdVideoH264SpsFlags") java.lang.foreign.MemorySegment value) { StdVideoH264SequenceParameterSet.set_flags(this.segment(), value); return this; }

    /// {@return `profile_idc` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("StdVideoH264ProfileIdc") int get_profile_idc(MemorySegment segment, long index) { return (int) VH_profile_idc.get(segment, 0L, index); }
    /// {@return `profile_idc`}
    /// @param segment the segment of the struct
    public static @CType("StdVideoH264ProfileIdc") int get_profile_idc(MemorySegment segment) { return StdVideoH264SequenceParameterSet.get_profile_idc(segment, 0L); }
    /// {@return `profile_idc` at the given index}
    /// @param index the index
    public @CType("StdVideoH264ProfileIdc") int profile_idcAt(long index) { return StdVideoH264SequenceParameterSet.get_profile_idc(this.segment(), index); }
    /// {@return `profile_idc`}
    public @CType("StdVideoH264ProfileIdc") int profile_idc() { return StdVideoH264SequenceParameterSet.get_profile_idc(this.segment()); }
    /// Sets `profile_idc` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_profile_idc(MemorySegment segment, long index, @CType("StdVideoH264ProfileIdc") int value) { VH_profile_idc.set(segment, 0L, index, value); }
    /// Sets `profile_idc` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_profile_idc(MemorySegment segment, @CType("StdVideoH264ProfileIdc") int value) { StdVideoH264SequenceParameterSet.set_profile_idc(segment, 0L, value); }
    /// Sets `profile_idc` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoH264SequenceParameterSet profile_idcAt(long index, @CType("StdVideoH264ProfileIdc") int value) { StdVideoH264SequenceParameterSet.set_profile_idc(this.segment(), index, value); return this; }
    /// Sets `profile_idc` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH264SequenceParameterSet profile_idc(@CType("StdVideoH264ProfileIdc") int value) { StdVideoH264SequenceParameterSet.set_profile_idc(this.segment(), value); return this; }

    /// {@return `level_idc` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("StdVideoH264LevelIdc") int get_level_idc(MemorySegment segment, long index) { return (int) VH_level_idc.get(segment, 0L, index); }
    /// {@return `level_idc`}
    /// @param segment the segment of the struct
    public static @CType("StdVideoH264LevelIdc") int get_level_idc(MemorySegment segment) { return StdVideoH264SequenceParameterSet.get_level_idc(segment, 0L); }
    /// {@return `level_idc` at the given index}
    /// @param index the index
    public @CType("StdVideoH264LevelIdc") int level_idcAt(long index) { return StdVideoH264SequenceParameterSet.get_level_idc(this.segment(), index); }
    /// {@return `level_idc`}
    public @CType("StdVideoH264LevelIdc") int level_idc() { return StdVideoH264SequenceParameterSet.get_level_idc(this.segment()); }
    /// Sets `level_idc` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_level_idc(MemorySegment segment, long index, @CType("StdVideoH264LevelIdc") int value) { VH_level_idc.set(segment, 0L, index, value); }
    /// Sets `level_idc` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_level_idc(MemorySegment segment, @CType("StdVideoH264LevelIdc") int value) { StdVideoH264SequenceParameterSet.set_level_idc(segment, 0L, value); }
    /// Sets `level_idc` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoH264SequenceParameterSet level_idcAt(long index, @CType("StdVideoH264LevelIdc") int value) { StdVideoH264SequenceParameterSet.set_level_idc(this.segment(), index, value); return this; }
    /// Sets `level_idc` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH264SequenceParameterSet level_idc(@CType("StdVideoH264LevelIdc") int value) { StdVideoH264SequenceParameterSet.set_level_idc(this.segment(), value); return this; }

    /// {@return `chroma_format_idc` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("StdVideoH264ChromaFormatIdc") int get_chroma_format_idc(MemorySegment segment, long index) { return (int) VH_chroma_format_idc.get(segment, 0L, index); }
    /// {@return `chroma_format_idc`}
    /// @param segment the segment of the struct
    public static @CType("StdVideoH264ChromaFormatIdc") int get_chroma_format_idc(MemorySegment segment) { return StdVideoH264SequenceParameterSet.get_chroma_format_idc(segment, 0L); }
    /// {@return `chroma_format_idc` at the given index}
    /// @param index the index
    public @CType("StdVideoH264ChromaFormatIdc") int chroma_format_idcAt(long index) { return StdVideoH264SequenceParameterSet.get_chroma_format_idc(this.segment(), index); }
    /// {@return `chroma_format_idc`}
    public @CType("StdVideoH264ChromaFormatIdc") int chroma_format_idc() { return StdVideoH264SequenceParameterSet.get_chroma_format_idc(this.segment()); }
    /// Sets `chroma_format_idc` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_chroma_format_idc(MemorySegment segment, long index, @CType("StdVideoH264ChromaFormatIdc") int value) { VH_chroma_format_idc.set(segment, 0L, index, value); }
    /// Sets `chroma_format_idc` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_chroma_format_idc(MemorySegment segment, @CType("StdVideoH264ChromaFormatIdc") int value) { StdVideoH264SequenceParameterSet.set_chroma_format_idc(segment, 0L, value); }
    /// Sets `chroma_format_idc` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoH264SequenceParameterSet chroma_format_idcAt(long index, @CType("StdVideoH264ChromaFormatIdc") int value) { StdVideoH264SequenceParameterSet.set_chroma_format_idc(this.segment(), index, value); return this; }
    /// Sets `chroma_format_idc` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH264SequenceParameterSet chroma_format_idc(@CType("StdVideoH264ChromaFormatIdc") int value) { StdVideoH264SequenceParameterSet.set_chroma_format_idc(this.segment(), value); return this; }

    /// {@return `seq_parameter_set_id` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t") byte get_seq_parameter_set_id(MemorySegment segment, long index) { return (byte) VH_seq_parameter_set_id.get(segment, 0L, index); }
    /// {@return `seq_parameter_set_id`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t") byte get_seq_parameter_set_id(MemorySegment segment) { return StdVideoH264SequenceParameterSet.get_seq_parameter_set_id(segment, 0L); }
    /// {@return `seq_parameter_set_id` at the given index}
    /// @param index the index
    public @CType("uint8_t") byte seq_parameter_set_idAt(long index) { return StdVideoH264SequenceParameterSet.get_seq_parameter_set_id(this.segment(), index); }
    /// {@return `seq_parameter_set_id`}
    public @CType("uint8_t") byte seq_parameter_set_id() { return StdVideoH264SequenceParameterSet.get_seq_parameter_set_id(this.segment()); }
    /// Sets `seq_parameter_set_id` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_seq_parameter_set_id(MemorySegment segment, long index, @CType("uint8_t") byte value) { VH_seq_parameter_set_id.set(segment, 0L, index, value); }
    /// Sets `seq_parameter_set_id` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_seq_parameter_set_id(MemorySegment segment, @CType("uint8_t") byte value) { StdVideoH264SequenceParameterSet.set_seq_parameter_set_id(segment, 0L, value); }
    /// Sets `seq_parameter_set_id` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoH264SequenceParameterSet seq_parameter_set_idAt(long index, @CType("uint8_t") byte value) { StdVideoH264SequenceParameterSet.set_seq_parameter_set_id(this.segment(), index, value); return this; }
    /// Sets `seq_parameter_set_id` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH264SequenceParameterSet seq_parameter_set_id(@CType("uint8_t") byte value) { StdVideoH264SequenceParameterSet.set_seq_parameter_set_id(this.segment(), value); return this; }

    /// {@return `bit_depth_luma_minus8` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t") byte get_bit_depth_luma_minus8(MemorySegment segment, long index) { return (byte) VH_bit_depth_luma_minus8.get(segment, 0L, index); }
    /// {@return `bit_depth_luma_minus8`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t") byte get_bit_depth_luma_minus8(MemorySegment segment) { return StdVideoH264SequenceParameterSet.get_bit_depth_luma_minus8(segment, 0L); }
    /// {@return `bit_depth_luma_minus8` at the given index}
    /// @param index the index
    public @CType("uint8_t") byte bit_depth_luma_minus8At(long index) { return StdVideoH264SequenceParameterSet.get_bit_depth_luma_minus8(this.segment(), index); }
    /// {@return `bit_depth_luma_minus8`}
    public @CType("uint8_t") byte bit_depth_luma_minus8() { return StdVideoH264SequenceParameterSet.get_bit_depth_luma_minus8(this.segment()); }
    /// Sets `bit_depth_luma_minus8` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_bit_depth_luma_minus8(MemorySegment segment, long index, @CType("uint8_t") byte value) { VH_bit_depth_luma_minus8.set(segment, 0L, index, value); }
    /// Sets `bit_depth_luma_minus8` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_bit_depth_luma_minus8(MemorySegment segment, @CType("uint8_t") byte value) { StdVideoH264SequenceParameterSet.set_bit_depth_luma_minus8(segment, 0L, value); }
    /// Sets `bit_depth_luma_minus8` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoH264SequenceParameterSet bit_depth_luma_minus8At(long index, @CType("uint8_t") byte value) { StdVideoH264SequenceParameterSet.set_bit_depth_luma_minus8(this.segment(), index, value); return this; }
    /// Sets `bit_depth_luma_minus8` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH264SequenceParameterSet bit_depth_luma_minus8(@CType("uint8_t") byte value) { StdVideoH264SequenceParameterSet.set_bit_depth_luma_minus8(this.segment(), value); return this; }

    /// {@return `bit_depth_chroma_minus8` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t") byte get_bit_depth_chroma_minus8(MemorySegment segment, long index) { return (byte) VH_bit_depth_chroma_minus8.get(segment, 0L, index); }
    /// {@return `bit_depth_chroma_minus8`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t") byte get_bit_depth_chroma_minus8(MemorySegment segment) { return StdVideoH264SequenceParameterSet.get_bit_depth_chroma_minus8(segment, 0L); }
    /// {@return `bit_depth_chroma_minus8` at the given index}
    /// @param index the index
    public @CType("uint8_t") byte bit_depth_chroma_minus8At(long index) { return StdVideoH264SequenceParameterSet.get_bit_depth_chroma_minus8(this.segment(), index); }
    /// {@return `bit_depth_chroma_minus8`}
    public @CType("uint8_t") byte bit_depth_chroma_minus8() { return StdVideoH264SequenceParameterSet.get_bit_depth_chroma_minus8(this.segment()); }
    /// Sets `bit_depth_chroma_minus8` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_bit_depth_chroma_minus8(MemorySegment segment, long index, @CType("uint8_t") byte value) { VH_bit_depth_chroma_minus8.set(segment, 0L, index, value); }
    /// Sets `bit_depth_chroma_minus8` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_bit_depth_chroma_minus8(MemorySegment segment, @CType("uint8_t") byte value) { StdVideoH264SequenceParameterSet.set_bit_depth_chroma_minus8(segment, 0L, value); }
    /// Sets `bit_depth_chroma_minus8` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoH264SequenceParameterSet bit_depth_chroma_minus8At(long index, @CType("uint8_t") byte value) { StdVideoH264SequenceParameterSet.set_bit_depth_chroma_minus8(this.segment(), index, value); return this; }
    /// Sets `bit_depth_chroma_minus8` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH264SequenceParameterSet bit_depth_chroma_minus8(@CType("uint8_t") byte value) { StdVideoH264SequenceParameterSet.set_bit_depth_chroma_minus8(this.segment(), value); return this; }

    /// {@return `log2_max_frame_num_minus4` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t") byte get_log2_max_frame_num_minus4(MemorySegment segment, long index) { return (byte) VH_log2_max_frame_num_minus4.get(segment, 0L, index); }
    /// {@return `log2_max_frame_num_minus4`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t") byte get_log2_max_frame_num_minus4(MemorySegment segment) { return StdVideoH264SequenceParameterSet.get_log2_max_frame_num_minus4(segment, 0L); }
    /// {@return `log2_max_frame_num_minus4` at the given index}
    /// @param index the index
    public @CType("uint8_t") byte log2_max_frame_num_minus4At(long index) { return StdVideoH264SequenceParameterSet.get_log2_max_frame_num_minus4(this.segment(), index); }
    /// {@return `log2_max_frame_num_minus4`}
    public @CType("uint8_t") byte log2_max_frame_num_minus4() { return StdVideoH264SequenceParameterSet.get_log2_max_frame_num_minus4(this.segment()); }
    /// Sets `log2_max_frame_num_minus4` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_log2_max_frame_num_minus4(MemorySegment segment, long index, @CType("uint8_t") byte value) { VH_log2_max_frame_num_minus4.set(segment, 0L, index, value); }
    /// Sets `log2_max_frame_num_minus4` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_log2_max_frame_num_minus4(MemorySegment segment, @CType("uint8_t") byte value) { StdVideoH264SequenceParameterSet.set_log2_max_frame_num_minus4(segment, 0L, value); }
    /// Sets `log2_max_frame_num_minus4` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoH264SequenceParameterSet log2_max_frame_num_minus4At(long index, @CType("uint8_t") byte value) { StdVideoH264SequenceParameterSet.set_log2_max_frame_num_minus4(this.segment(), index, value); return this; }
    /// Sets `log2_max_frame_num_minus4` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH264SequenceParameterSet log2_max_frame_num_minus4(@CType("uint8_t") byte value) { StdVideoH264SequenceParameterSet.set_log2_max_frame_num_minus4(this.segment(), value); return this; }

    /// {@return `pic_order_cnt_type` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("StdVideoH264PocType") int get_pic_order_cnt_type(MemorySegment segment, long index) { return (int) VH_pic_order_cnt_type.get(segment, 0L, index); }
    /// {@return `pic_order_cnt_type`}
    /// @param segment the segment of the struct
    public static @CType("StdVideoH264PocType") int get_pic_order_cnt_type(MemorySegment segment) { return StdVideoH264SequenceParameterSet.get_pic_order_cnt_type(segment, 0L); }
    /// {@return `pic_order_cnt_type` at the given index}
    /// @param index the index
    public @CType("StdVideoH264PocType") int pic_order_cnt_typeAt(long index) { return StdVideoH264SequenceParameterSet.get_pic_order_cnt_type(this.segment(), index); }
    /// {@return `pic_order_cnt_type`}
    public @CType("StdVideoH264PocType") int pic_order_cnt_type() { return StdVideoH264SequenceParameterSet.get_pic_order_cnt_type(this.segment()); }
    /// Sets `pic_order_cnt_type` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pic_order_cnt_type(MemorySegment segment, long index, @CType("StdVideoH264PocType") int value) { VH_pic_order_cnt_type.set(segment, 0L, index, value); }
    /// Sets `pic_order_cnt_type` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pic_order_cnt_type(MemorySegment segment, @CType("StdVideoH264PocType") int value) { StdVideoH264SequenceParameterSet.set_pic_order_cnt_type(segment, 0L, value); }
    /// Sets `pic_order_cnt_type` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoH264SequenceParameterSet pic_order_cnt_typeAt(long index, @CType("StdVideoH264PocType") int value) { StdVideoH264SequenceParameterSet.set_pic_order_cnt_type(this.segment(), index, value); return this; }
    /// Sets `pic_order_cnt_type` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH264SequenceParameterSet pic_order_cnt_type(@CType("StdVideoH264PocType") int value) { StdVideoH264SequenceParameterSet.set_pic_order_cnt_type(this.segment(), value); return this; }

    /// {@return `offset_for_non_ref_pic` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("int32_t") int get_offset_for_non_ref_pic(MemorySegment segment, long index) { return (int) VH_offset_for_non_ref_pic.get(segment, 0L, index); }
    /// {@return `offset_for_non_ref_pic`}
    /// @param segment the segment of the struct
    public static @CType("int32_t") int get_offset_for_non_ref_pic(MemorySegment segment) { return StdVideoH264SequenceParameterSet.get_offset_for_non_ref_pic(segment, 0L); }
    /// {@return `offset_for_non_ref_pic` at the given index}
    /// @param index the index
    public @CType("int32_t") int offset_for_non_ref_picAt(long index) { return StdVideoH264SequenceParameterSet.get_offset_for_non_ref_pic(this.segment(), index); }
    /// {@return `offset_for_non_ref_pic`}
    public @CType("int32_t") int offset_for_non_ref_pic() { return StdVideoH264SequenceParameterSet.get_offset_for_non_ref_pic(this.segment()); }
    /// Sets `offset_for_non_ref_pic` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_offset_for_non_ref_pic(MemorySegment segment, long index, @CType("int32_t") int value) { VH_offset_for_non_ref_pic.set(segment, 0L, index, value); }
    /// Sets `offset_for_non_ref_pic` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_offset_for_non_ref_pic(MemorySegment segment, @CType("int32_t") int value) { StdVideoH264SequenceParameterSet.set_offset_for_non_ref_pic(segment, 0L, value); }
    /// Sets `offset_for_non_ref_pic` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoH264SequenceParameterSet offset_for_non_ref_picAt(long index, @CType("int32_t") int value) { StdVideoH264SequenceParameterSet.set_offset_for_non_ref_pic(this.segment(), index, value); return this; }
    /// Sets `offset_for_non_ref_pic` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH264SequenceParameterSet offset_for_non_ref_pic(@CType("int32_t") int value) { StdVideoH264SequenceParameterSet.set_offset_for_non_ref_pic(this.segment(), value); return this; }

    /// {@return `offset_for_top_to_bottom_field` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("int32_t") int get_offset_for_top_to_bottom_field(MemorySegment segment, long index) { return (int) VH_offset_for_top_to_bottom_field.get(segment, 0L, index); }
    /// {@return `offset_for_top_to_bottom_field`}
    /// @param segment the segment of the struct
    public static @CType("int32_t") int get_offset_for_top_to_bottom_field(MemorySegment segment) { return StdVideoH264SequenceParameterSet.get_offset_for_top_to_bottom_field(segment, 0L); }
    /// {@return `offset_for_top_to_bottom_field` at the given index}
    /// @param index the index
    public @CType("int32_t") int offset_for_top_to_bottom_fieldAt(long index) { return StdVideoH264SequenceParameterSet.get_offset_for_top_to_bottom_field(this.segment(), index); }
    /// {@return `offset_for_top_to_bottom_field`}
    public @CType("int32_t") int offset_for_top_to_bottom_field() { return StdVideoH264SequenceParameterSet.get_offset_for_top_to_bottom_field(this.segment()); }
    /// Sets `offset_for_top_to_bottom_field` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_offset_for_top_to_bottom_field(MemorySegment segment, long index, @CType("int32_t") int value) { VH_offset_for_top_to_bottom_field.set(segment, 0L, index, value); }
    /// Sets `offset_for_top_to_bottom_field` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_offset_for_top_to_bottom_field(MemorySegment segment, @CType("int32_t") int value) { StdVideoH264SequenceParameterSet.set_offset_for_top_to_bottom_field(segment, 0L, value); }
    /// Sets `offset_for_top_to_bottom_field` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoH264SequenceParameterSet offset_for_top_to_bottom_fieldAt(long index, @CType("int32_t") int value) { StdVideoH264SequenceParameterSet.set_offset_for_top_to_bottom_field(this.segment(), index, value); return this; }
    /// Sets `offset_for_top_to_bottom_field` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH264SequenceParameterSet offset_for_top_to_bottom_field(@CType("int32_t") int value) { StdVideoH264SequenceParameterSet.set_offset_for_top_to_bottom_field(this.segment(), value); return this; }

    /// {@return `log2_max_pic_order_cnt_lsb_minus4` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t") byte get_log2_max_pic_order_cnt_lsb_minus4(MemorySegment segment, long index) { return (byte) VH_log2_max_pic_order_cnt_lsb_minus4.get(segment, 0L, index); }
    /// {@return `log2_max_pic_order_cnt_lsb_minus4`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t") byte get_log2_max_pic_order_cnt_lsb_minus4(MemorySegment segment) { return StdVideoH264SequenceParameterSet.get_log2_max_pic_order_cnt_lsb_minus4(segment, 0L); }
    /// {@return `log2_max_pic_order_cnt_lsb_minus4` at the given index}
    /// @param index the index
    public @CType("uint8_t") byte log2_max_pic_order_cnt_lsb_minus4At(long index) { return StdVideoH264SequenceParameterSet.get_log2_max_pic_order_cnt_lsb_minus4(this.segment(), index); }
    /// {@return `log2_max_pic_order_cnt_lsb_minus4`}
    public @CType("uint8_t") byte log2_max_pic_order_cnt_lsb_minus4() { return StdVideoH264SequenceParameterSet.get_log2_max_pic_order_cnt_lsb_minus4(this.segment()); }
    /// Sets `log2_max_pic_order_cnt_lsb_minus4` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_log2_max_pic_order_cnt_lsb_minus4(MemorySegment segment, long index, @CType("uint8_t") byte value) { VH_log2_max_pic_order_cnt_lsb_minus4.set(segment, 0L, index, value); }
    /// Sets `log2_max_pic_order_cnt_lsb_minus4` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_log2_max_pic_order_cnt_lsb_minus4(MemorySegment segment, @CType("uint8_t") byte value) { StdVideoH264SequenceParameterSet.set_log2_max_pic_order_cnt_lsb_minus4(segment, 0L, value); }
    /// Sets `log2_max_pic_order_cnt_lsb_minus4` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoH264SequenceParameterSet log2_max_pic_order_cnt_lsb_minus4At(long index, @CType("uint8_t") byte value) { StdVideoH264SequenceParameterSet.set_log2_max_pic_order_cnt_lsb_minus4(this.segment(), index, value); return this; }
    /// Sets `log2_max_pic_order_cnt_lsb_minus4` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH264SequenceParameterSet log2_max_pic_order_cnt_lsb_minus4(@CType("uint8_t") byte value) { StdVideoH264SequenceParameterSet.set_log2_max_pic_order_cnt_lsb_minus4(this.segment(), value); return this; }

    /// {@return `num_ref_frames_in_pic_order_cnt_cycle` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t") byte get_num_ref_frames_in_pic_order_cnt_cycle(MemorySegment segment, long index) { return (byte) VH_num_ref_frames_in_pic_order_cnt_cycle.get(segment, 0L, index); }
    /// {@return `num_ref_frames_in_pic_order_cnt_cycle`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t") byte get_num_ref_frames_in_pic_order_cnt_cycle(MemorySegment segment) { return StdVideoH264SequenceParameterSet.get_num_ref_frames_in_pic_order_cnt_cycle(segment, 0L); }
    /// {@return `num_ref_frames_in_pic_order_cnt_cycle` at the given index}
    /// @param index the index
    public @CType("uint8_t") byte num_ref_frames_in_pic_order_cnt_cycleAt(long index) { return StdVideoH264SequenceParameterSet.get_num_ref_frames_in_pic_order_cnt_cycle(this.segment(), index); }
    /// {@return `num_ref_frames_in_pic_order_cnt_cycle`}
    public @CType("uint8_t") byte num_ref_frames_in_pic_order_cnt_cycle() { return StdVideoH264SequenceParameterSet.get_num_ref_frames_in_pic_order_cnt_cycle(this.segment()); }
    /// Sets `num_ref_frames_in_pic_order_cnt_cycle` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_num_ref_frames_in_pic_order_cnt_cycle(MemorySegment segment, long index, @CType("uint8_t") byte value) { VH_num_ref_frames_in_pic_order_cnt_cycle.set(segment, 0L, index, value); }
    /// Sets `num_ref_frames_in_pic_order_cnt_cycle` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_num_ref_frames_in_pic_order_cnt_cycle(MemorySegment segment, @CType("uint8_t") byte value) { StdVideoH264SequenceParameterSet.set_num_ref_frames_in_pic_order_cnt_cycle(segment, 0L, value); }
    /// Sets `num_ref_frames_in_pic_order_cnt_cycle` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoH264SequenceParameterSet num_ref_frames_in_pic_order_cnt_cycleAt(long index, @CType("uint8_t") byte value) { StdVideoH264SequenceParameterSet.set_num_ref_frames_in_pic_order_cnt_cycle(this.segment(), index, value); return this; }
    /// Sets `num_ref_frames_in_pic_order_cnt_cycle` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH264SequenceParameterSet num_ref_frames_in_pic_order_cnt_cycle(@CType("uint8_t") byte value) { StdVideoH264SequenceParameterSet.set_num_ref_frames_in_pic_order_cnt_cycle(this.segment(), value); return this; }

    /// {@return `max_num_ref_frames` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t") byte get_max_num_ref_frames(MemorySegment segment, long index) { return (byte) VH_max_num_ref_frames.get(segment, 0L, index); }
    /// {@return `max_num_ref_frames`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t") byte get_max_num_ref_frames(MemorySegment segment) { return StdVideoH264SequenceParameterSet.get_max_num_ref_frames(segment, 0L); }
    /// {@return `max_num_ref_frames` at the given index}
    /// @param index the index
    public @CType("uint8_t") byte max_num_ref_framesAt(long index) { return StdVideoH264SequenceParameterSet.get_max_num_ref_frames(this.segment(), index); }
    /// {@return `max_num_ref_frames`}
    public @CType("uint8_t") byte max_num_ref_frames() { return StdVideoH264SequenceParameterSet.get_max_num_ref_frames(this.segment()); }
    /// Sets `max_num_ref_frames` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_max_num_ref_frames(MemorySegment segment, long index, @CType("uint8_t") byte value) { VH_max_num_ref_frames.set(segment, 0L, index, value); }
    /// Sets `max_num_ref_frames` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_max_num_ref_frames(MemorySegment segment, @CType("uint8_t") byte value) { StdVideoH264SequenceParameterSet.set_max_num_ref_frames(segment, 0L, value); }
    /// Sets `max_num_ref_frames` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoH264SequenceParameterSet max_num_ref_framesAt(long index, @CType("uint8_t") byte value) { StdVideoH264SequenceParameterSet.set_max_num_ref_frames(this.segment(), index, value); return this; }
    /// Sets `max_num_ref_frames` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH264SequenceParameterSet max_num_ref_frames(@CType("uint8_t") byte value) { StdVideoH264SequenceParameterSet.set_max_num_ref_frames(this.segment(), value); return this; }

    /// {@return `reserved1` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t") byte get_reserved1(MemorySegment segment, long index) { return (byte) VH_reserved1.get(segment, 0L, index); }
    /// {@return `reserved1`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t") byte get_reserved1(MemorySegment segment) { return StdVideoH264SequenceParameterSet.get_reserved1(segment, 0L); }
    /// {@return `reserved1` at the given index}
    /// @param index the index
    public @CType("uint8_t") byte reserved1At(long index) { return StdVideoH264SequenceParameterSet.get_reserved1(this.segment(), index); }
    /// {@return `reserved1`}
    public @CType("uint8_t") byte reserved1() { return StdVideoH264SequenceParameterSet.get_reserved1(this.segment()); }
    /// Sets `reserved1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_reserved1(MemorySegment segment, long index, @CType("uint8_t") byte value) { VH_reserved1.set(segment, 0L, index, value); }
    /// Sets `reserved1` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_reserved1(MemorySegment segment, @CType("uint8_t") byte value) { StdVideoH264SequenceParameterSet.set_reserved1(segment, 0L, value); }
    /// Sets `reserved1` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoH264SequenceParameterSet reserved1At(long index, @CType("uint8_t") byte value) { StdVideoH264SequenceParameterSet.set_reserved1(this.segment(), index, value); return this; }
    /// Sets `reserved1` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH264SequenceParameterSet reserved1(@CType("uint8_t") byte value) { StdVideoH264SequenceParameterSet.set_reserved1(this.segment(), value); return this; }

    /// {@return `pic_width_in_mbs_minus1` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_pic_width_in_mbs_minus1(MemorySegment segment, long index) { return (int) VH_pic_width_in_mbs_minus1.get(segment, 0L, index); }
    /// {@return `pic_width_in_mbs_minus1`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_pic_width_in_mbs_minus1(MemorySegment segment) { return StdVideoH264SequenceParameterSet.get_pic_width_in_mbs_minus1(segment, 0L); }
    /// {@return `pic_width_in_mbs_minus1` at the given index}
    /// @param index the index
    public @CType("uint32_t") int pic_width_in_mbs_minus1At(long index) { return StdVideoH264SequenceParameterSet.get_pic_width_in_mbs_minus1(this.segment(), index); }
    /// {@return `pic_width_in_mbs_minus1`}
    public @CType("uint32_t") int pic_width_in_mbs_minus1() { return StdVideoH264SequenceParameterSet.get_pic_width_in_mbs_minus1(this.segment()); }
    /// Sets `pic_width_in_mbs_minus1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pic_width_in_mbs_minus1(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_pic_width_in_mbs_minus1.set(segment, 0L, index, value); }
    /// Sets `pic_width_in_mbs_minus1` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pic_width_in_mbs_minus1(MemorySegment segment, @CType("uint32_t") int value) { StdVideoH264SequenceParameterSet.set_pic_width_in_mbs_minus1(segment, 0L, value); }
    /// Sets `pic_width_in_mbs_minus1` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoH264SequenceParameterSet pic_width_in_mbs_minus1At(long index, @CType("uint32_t") int value) { StdVideoH264SequenceParameterSet.set_pic_width_in_mbs_minus1(this.segment(), index, value); return this; }
    /// Sets `pic_width_in_mbs_minus1` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH264SequenceParameterSet pic_width_in_mbs_minus1(@CType("uint32_t") int value) { StdVideoH264SequenceParameterSet.set_pic_width_in_mbs_minus1(this.segment(), value); return this; }

    /// {@return `pic_height_in_map_units_minus1` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_pic_height_in_map_units_minus1(MemorySegment segment, long index) { return (int) VH_pic_height_in_map_units_minus1.get(segment, 0L, index); }
    /// {@return `pic_height_in_map_units_minus1`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_pic_height_in_map_units_minus1(MemorySegment segment) { return StdVideoH264SequenceParameterSet.get_pic_height_in_map_units_minus1(segment, 0L); }
    /// {@return `pic_height_in_map_units_minus1` at the given index}
    /// @param index the index
    public @CType("uint32_t") int pic_height_in_map_units_minus1At(long index) { return StdVideoH264SequenceParameterSet.get_pic_height_in_map_units_minus1(this.segment(), index); }
    /// {@return `pic_height_in_map_units_minus1`}
    public @CType("uint32_t") int pic_height_in_map_units_minus1() { return StdVideoH264SequenceParameterSet.get_pic_height_in_map_units_minus1(this.segment()); }
    /// Sets `pic_height_in_map_units_minus1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pic_height_in_map_units_minus1(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_pic_height_in_map_units_minus1.set(segment, 0L, index, value); }
    /// Sets `pic_height_in_map_units_minus1` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pic_height_in_map_units_minus1(MemorySegment segment, @CType("uint32_t") int value) { StdVideoH264SequenceParameterSet.set_pic_height_in_map_units_minus1(segment, 0L, value); }
    /// Sets `pic_height_in_map_units_minus1` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoH264SequenceParameterSet pic_height_in_map_units_minus1At(long index, @CType("uint32_t") int value) { StdVideoH264SequenceParameterSet.set_pic_height_in_map_units_minus1(this.segment(), index, value); return this; }
    /// Sets `pic_height_in_map_units_minus1` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH264SequenceParameterSet pic_height_in_map_units_minus1(@CType("uint32_t") int value) { StdVideoH264SequenceParameterSet.set_pic_height_in_map_units_minus1(this.segment(), value); return this; }

    /// {@return `frame_crop_left_offset` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_frame_crop_left_offset(MemorySegment segment, long index) { return (int) VH_frame_crop_left_offset.get(segment, 0L, index); }
    /// {@return `frame_crop_left_offset`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_frame_crop_left_offset(MemorySegment segment) { return StdVideoH264SequenceParameterSet.get_frame_crop_left_offset(segment, 0L); }
    /// {@return `frame_crop_left_offset` at the given index}
    /// @param index the index
    public @CType("uint32_t") int frame_crop_left_offsetAt(long index) { return StdVideoH264SequenceParameterSet.get_frame_crop_left_offset(this.segment(), index); }
    /// {@return `frame_crop_left_offset`}
    public @CType("uint32_t") int frame_crop_left_offset() { return StdVideoH264SequenceParameterSet.get_frame_crop_left_offset(this.segment()); }
    /// Sets `frame_crop_left_offset` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_frame_crop_left_offset(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_frame_crop_left_offset.set(segment, 0L, index, value); }
    /// Sets `frame_crop_left_offset` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_frame_crop_left_offset(MemorySegment segment, @CType("uint32_t") int value) { StdVideoH264SequenceParameterSet.set_frame_crop_left_offset(segment, 0L, value); }
    /// Sets `frame_crop_left_offset` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoH264SequenceParameterSet frame_crop_left_offsetAt(long index, @CType("uint32_t") int value) { StdVideoH264SequenceParameterSet.set_frame_crop_left_offset(this.segment(), index, value); return this; }
    /// Sets `frame_crop_left_offset` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH264SequenceParameterSet frame_crop_left_offset(@CType("uint32_t") int value) { StdVideoH264SequenceParameterSet.set_frame_crop_left_offset(this.segment(), value); return this; }

    /// {@return `frame_crop_right_offset` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_frame_crop_right_offset(MemorySegment segment, long index) { return (int) VH_frame_crop_right_offset.get(segment, 0L, index); }
    /// {@return `frame_crop_right_offset`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_frame_crop_right_offset(MemorySegment segment) { return StdVideoH264SequenceParameterSet.get_frame_crop_right_offset(segment, 0L); }
    /// {@return `frame_crop_right_offset` at the given index}
    /// @param index the index
    public @CType("uint32_t") int frame_crop_right_offsetAt(long index) { return StdVideoH264SequenceParameterSet.get_frame_crop_right_offset(this.segment(), index); }
    /// {@return `frame_crop_right_offset`}
    public @CType("uint32_t") int frame_crop_right_offset() { return StdVideoH264SequenceParameterSet.get_frame_crop_right_offset(this.segment()); }
    /// Sets `frame_crop_right_offset` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_frame_crop_right_offset(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_frame_crop_right_offset.set(segment, 0L, index, value); }
    /// Sets `frame_crop_right_offset` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_frame_crop_right_offset(MemorySegment segment, @CType("uint32_t") int value) { StdVideoH264SequenceParameterSet.set_frame_crop_right_offset(segment, 0L, value); }
    /// Sets `frame_crop_right_offset` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoH264SequenceParameterSet frame_crop_right_offsetAt(long index, @CType("uint32_t") int value) { StdVideoH264SequenceParameterSet.set_frame_crop_right_offset(this.segment(), index, value); return this; }
    /// Sets `frame_crop_right_offset` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH264SequenceParameterSet frame_crop_right_offset(@CType("uint32_t") int value) { StdVideoH264SequenceParameterSet.set_frame_crop_right_offset(this.segment(), value); return this; }

    /// {@return `frame_crop_top_offset` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_frame_crop_top_offset(MemorySegment segment, long index) { return (int) VH_frame_crop_top_offset.get(segment, 0L, index); }
    /// {@return `frame_crop_top_offset`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_frame_crop_top_offset(MemorySegment segment) { return StdVideoH264SequenceParameterSet.get_frame_crop_top_offset(segment, 0L); }
    /// {@return `frame_crop_top_offset` at the given index}
    /// @param index the index
    public @CType("uint32_t") int frame_crop_top_offsetAt(long index) { return StdVideoH264SequenceParameterSet.get_frame_crop_top_offset(this.segment(), index); }
    /// {@return `frame_crop_top_offset`}
    public @CType("uint32_t") int frame_crop_top_offset() { return StdVideoH264SequenceParameterSet.get_frame_crop_top_offset(this.segment()); }
    /// Sets `frame_crop_top_offset` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_frame_crop_top_offset(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_frame_crop_top_offset.set(segment, 0L, index, value); }
    /// Sets `frame_crop_top_offset` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_frame_crop_top_offset(MemorySegment segment, @CType("uint32_t") int value) { StdVideoH264SequenceParameterSet.set_frame_crop_top_offset(segment, 0L, value); }
    /// Sets `frame_crop_top_offset` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoH264SequenceParameterSet frame_crop_top_offsetAt(long index, @CType("uint32_t") int value) { StdVideoH264SequenceParameterSet.set_frame_crop_top_offset(this.segment(), index, value); return this; }
    /// Sets `frame_crop_top_offset` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH264SequenceParameterSet frame_crop_top_offset(@CType("uint32_t") int value) { StdVideoH264SequenceParameterSet.set_frame_crop_top_offset(this.segment(), value); return this; }

    /// {@return `frame_crop_bottom_offset` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_frame_crop_bottom_offset(MemorySegment segment, long index) { return (int) VH_frame_crop_bottom_offset.get(segment, 0L, index); }
    /// {@return `frame_crop_bottom_offset`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_frame_crop_bottom_offset(MemorySegment segment) { return StdVideoH264SequenceParameterSet.get_frame_crop_bottom_offset(segment, 0L); }
    /// {@return `frame_crop_bottom_offset` at the given index}
    /// @param index the index
    public @CType("uint32_t") int frame_crop_bottom_offsetAt(long index) { return StdVideoH264SequenceParameterSet.get_frame_crop_bottom_offset(this.segment(), index); }
    /// {@return `frame_crop_bottom_offset`}
    public @CType("uint32_t") int frame_crop_bottom_offset() { return StdVideoH264SequenceParameterSet.get_frame_crop_bottom_offset(this.segment()); }
    /// Sets `frame_crop_bottom_offset` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_frame_crop_bottom_offset(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_frame_crop_bottom_offset.set(segment, 0L, index, value); }
    /// Sets `frame_crop_bottom_offset` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_frame_crop_bottom_offset(MemorySegment segment, @CType("uint32_t") int value) { StdVideoH264SequenceParameterSet.set_frame_crop_bottom_offset(segment, 0L, value); }
    /// Sets `frame_crop_bottom_offset` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoH264SequenceParameterSet frame_crop_bottom_offsetAt(long index, @CType("uint32_t") int value) { StdVideoH264SequenceParameterSet.set_frame_crop_bottom_offset(this.segment(), index, value); return this; }
    /// Sets `frame_crop_bottom_offset` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH264SequenceParameterSet frame_crop_bottom_offset(@CType("uint32_t") int value) { StdVideoH264SequenceParameterSet.set_frame_crop_bottom_offset(this.segment(), value); return this; }

    /// {@return `reserved2` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_reserved2(MemorySegment segment, long index) { return (int) VH_reserved2.get(segment, 0L, index); }
    /// {@return `reserved2`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_reserved2(MemorySegment segment) { return StdVideoH264SequenceParameterSet.get_reserved2(segment, 0L); }
    /// {@return `reserved2` at the given index}
    /// @param index the index
    public @CType("uint32_t") int reserved2At(long index) { return StdVideoH264SequenceParameterSet.get_reserved2(this.segment(), index); }
    /// {@return `reserved2`}
    public @CType("uint32_t") int reserved2() { return StdVideoH264SequenceParameterSet.get_reserved2(this.segment()); }
    /// Sets `reserved2` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_reserved2(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_reserved2.set(segment, 0L, index, value); }
    /// Sets `reserved2` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_reserved2(MemorySegment segment, @CType("uint32_t") int value) { StdVideoH264SequenceParameterSet.set_reserved2(segment, 0L, value); }
    /// Sets `reserved2` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoH264SequenceParameterSet reserved2At(long index, @CType("uint32_t") int value) { StdVideoH264SequenceParameterSet.set_reserved2(this.segment(), index, value); return this; }
    /// Sets `reserved2` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH264SequenceParameterSet reserved2(@CType("uint32_t") int value) { StdVideoH264SequenceParameterSet.set_reserved2(this.segment(), value); return this; }

    /// {@return `pOffsetForRefFrame` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const int32_t *") java.lang.foreign.MemorySegment get_pOffsetForRefFrame(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pOffsetForRefFrame.get(segment, 0L, index); }
    /// {@return `pOffsetForRefFrame`}
    /// @param segment the segment of the struct
    public static @CType("const int32_t *") java.lang.foreign.MemorySegment get_pOffsetForRefFrame(MemorySegment segment) { return StdVideoH264SequenceParameterSet.get_pOffsetForRefFrame(segment, 0L); }
    /// {@return `pOffsetForRefFrame` at the given index}
    /// @param index the index
    public @CType("const int32_t *") java.lang.foreign.MemorySegment pOffsetForRefFrameAt(long index) { return StdVideoH264SequenceParameterSet.get_pOffsetForRefFrame(this.segment(), index); }
    /// {@return `pOffsetForRefFrame`}
    public @CType("const int32_t *") java.lang.foreign.MemorySegment pOffsetForRefFrame() { return StdVideoH264SequenceParameterSet.get_pOffsetForRefFrame(this.segment()); }
    /// Sets `pOffsetForRefFrame` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pOffsetForRefFrame(MemorySegment segment, long index, @CType("const int32_t *") java.lang.foreign.MemorySegment value) { VH_pOffsetForRefFrame.set(segment, 0L, index, value); }
    /// Sets `pOffsetForRefFrame` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pOffsetForRefFrame(MemorySegment segment, @CType("const int32_t *") java.lang.foreign.MemorySegment value) { StdVideoH264SequenceParameterSet.set_pOffsetForRefFrame(segment, 0L, value); }
    /// Sets `pOffsetForRefFrame` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoH264SequenceParameterSet pOffsetForRefFrameAt(long index, @CType("const int32_t *") java.lang.foreign.MemorySegment value) { StdVideoH264SequenceParameterSet.set_pOffsetForRefFrame(this.segment(), index, value); return this; }
    /// Sets `pOffsetForRefFrame` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH264SequenceParameterSet pOffsetForRefFrame(@CType("const int32_t *") java.lang.foreign.MemorySegment value) { StdVideoH264SequenceParameterSet.set_pOffsetForRefFrame(this.segment(), value); return this; }

    /// {@return `pScalingLists` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const StdVideoH264ScalingLists *") java.lang.foreign.MemorySegment get_pScalingLists(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pScalingLists.get(segment, 0L, index); }
    /// {@return `pScalingLists`}
    /// @param segment the segment of the struct
    public static @CType("const StdVideoH264ScalingLists *") java.lang.foreign.MemorySegment get_pScalingLists(MemorySegment segment) { return StdVideoH264SequenceParameterSet.get_pScalingLists(segment, 0L); }
    /// {@return `pScalingLists` at the given index}
    /// @param index the index
    public @CType("const StdVideoH264ScalingLists *") java.lang.foreign.MemorySegment pScalingListsAt(long index) { return StdVideoH264SequenceParameterSet.get_pScalingLists(this.segment(), index); }
    /// {@return `pScalingLists`}
    public @CType("const StdVideoH264ScalingLists *") java.lang.foreign.MemorySegment pScalingLists() { return StdVideoH264SequenceParameterSet.get_pScalingLists(this.segment()); }
    /// Sets `pScalingLists` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pScalingLists(MemorySegment segment, long index, @CType("const StdVideoH264ScalingLists *") java.lang.foreign.MemorySegment value) { VH_pScalingLists.set(segment, 0L, index, value); }
    /// Sets `pScalingLists` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pScalingLists(MemorySegment segment, @CType("const StdVideoH264ScalingLists *") java.lang.foreign.MemorySegment value) { StdVideoH264SequenceParameterSet.set_pScalingLists(segment, 0L, value); }
    /// Sets `pScalingLists` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoH264SequenceParameterSet pScalingListsAt(long index, @CType("const StdVideoH264ScalingLists *") java.lang.foreign.MemorySegment value) { StdVideoH264SequenceParameterSet.set_pScalingLists(this.segment(), index, value); return this; }
    /// Sets `pScalingLists` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH264SequenceParameterSet pScalingLists(@CType("const StdVideoH264ScalingLists *") java.lang.foreign.MemorySegment value) { StdVideoH264SequenceParameterSet.set_pScalingLists(this.segment(), value); return this; }

    /// {@return `pSequenceParameterSetVui` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const StdVideoH264SequenceParameterSetVui *") java.lang.foreign.MemorySegment get_pSequenceParameterSetVui(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pSequenceParameterSetVui.get(segment, 0L, index); }
    /// {@return `pSequenceParameterSetVui`}
    /// @param segment the segment of the struct
    public static @CType("const StdVideoH264SequenceParameterSetVui *") java.lang.foreign.MemorySegment get_pSequenceParameterSetVui(MemorySegment segment) { return StdVideoH264SequenceParameterSet.get_pSequenceParameterSetVui(segment, 0L); }
    /// {@return `pSequenceParameterSetVui` at the given index}
    /// @param index the index
    public @CType("const StdVideoH264SequenceParameterSetVui *") java.lang.foreign.MemorySegment pSequenceParameterSetVuiAt(long index) { return StdVideoH264SequenceParameterSet.get_pSequenceParameterSetVui(this.segment(), index); }
    /// {@return `pSequenceParameterSetVui`}
    public @CType("const StdVideoH264SequenceParameterSetVui *") java.lang.foreign.MemorySegment pSequenceParameterSetVui() { return StdVideoH264SequenceParameterSet.get_pSequenceParameterSetVui(this.segment()); }
    /// Sets `pSequenceParameterSetVui` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pSequenceParameterSetVui(MemorySegment segment, long index, @CType("const StdVideoH264SequenceParameterSetVui *") java.lang.foreign.MemorySegment value) { VH_pSequenceParameterSetVui.set(segment, 0L, index, value); }
    /// Sets `pSequenceParameterSetVui` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pSequenceParameterSetVui(MemorySegment segment, @CType("const StdVideoH264SequenceParameterSetVui *") java.lang.foreign.MemorySegment value) { StdVideoH264SequenceParameterSet.set_pSequenceParameterSetVui(segment, 0L, value); }
    /// Sets `pSequenceParameterSetVui` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoH264SequenceParameterSet pSequenceParameterSetVuiAt(long index, @CType("const StdVideoH264SequenceParameterSetVui *") java.lang.foreign.MemorySegment value) { StdVideoH264SequenceParameterSet.set_pSequenceParameterSetVui(this.segment(), index, value); return this; }
    /// Sets `pSequenceParameterSetVui` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH264SequenceParameterSet pSequenceParameterSetVui(@CType("const StdVideoH264SequenceParameterSetVui *") java.lang.foreign.MemorySegment value) { StdVideoH264SequenceParameterSet.set_pSequenceParameterSetVui(this.segment(), value); return this; }

}
