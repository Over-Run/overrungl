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
/// ### aspect_ratio_idc
/// [VarHandle][#VH_aspect_ratio_idc] - [Getter][#aspect_ratio_idc()] - [Setter][#aspect_ratio_idc(int)]
/// ### sar_width
/// [VarHandle][#VH_sar_width] - [Getter][#sar_width()] - [Setter][#sar_width(short)]
/// ### sar_height
/// [VarHandle][#VH_sar_height] - [Getter][#sar_height()] - [Setter][#sar_height(short)]
/// ### video_format
/// [VarHandle][#VH_video_format] - [Getter][#video_format()] - [Setter][#video_format(byte)]
/// ### colour_primaries
/// [VarHandle][#VH_colour_primaries] - [Getter][#colour_primaries()] - [Setter][#colour_primaries(byte)]
/// ### transfer_characteristics
/// [VarHandle][#VH_transfer_characteristics] - [Getter][#transfer_characteristics()] - [Setter][#transfer_characteristics(byte)]
/// ### matrix_coeffs
/// [VarHandle][#VH_matrix_coeffs] - [Getter][#matrix_coeffs()] - [Setter][#matrix_coeffs(byte)]
/// ### chroma_sample_loc_type_top_field
/// [VarHandle][#VH_chroma_sample_loc_type_top_field] - [Getter][#chroma_sample_loc_type_top_field()] - [Setter][#chroma_sample_loc_type_top_field(byte)]
/// ### chroma_sample_loc_type_bottom_field
/// [VarHandle][#VH_chroma_sample_loc_type_bottom_field] - [Getter][#chroma_sample_loc_type_bottom_field()] - [Setter][#chroma_sample_loc_type_bottom_field(byte)]
/// ### reserved1
/// [VarHandle][#VH_reserved1] - [Getter][#reserved1()] - [Setter][#reserved1(byte)]
/// ### reserved2
/// [VarHandle][#VH_reserved2] - [Getter][#reserved2()] - [Setter][#reserved2(byte)]
/// ### def_disp_win_left_offset
/// [VarHandle][#VH_def_disp_win_left_offset] - [Getter][#def_disp_win_left_offset()] - [Setter][#def_disp_win_left_offset(short)]
/// ### def_disp_win_right_offset
/// [VarHandle][#VH_def_disp_win_right_offset] - [Getter][#def_disp_win_right_offset()] - [Setter][#def_disp_win_right_offset(short)]
/// ### def_disp_win_top_offset
/// [VarHandle][#VH_def_disp_win_top_offset] - [Getter][#def_disp_win_top_offset()] - [Setter][#def_disp_win_top_offset(short)]
/// ### def_disp_win_bottom_offset
/// [VarHandle][#VH_def_disp_win_bottom_offset] - [Getter][#def_disp_win_bottom_offset()] - [Setter][#def_disp_win_bottom_offset(short)]
/// ### vui_num_units_in_tick
/// [VarHandle][#VH_vui_num_units_in_tick] - [Getter][#vui_num_units_in_tick()] - [Setter][#vui_num_units_in_tick(int)]
/// ### vui_time_scale
/// [VarHandle][#VH_vui_time_scale] - [Getter][#vui_time_scale()] - [Setter][#vui_time_scale(int)]
/// ### vui_num_ticks_poc_diff_one_minus1
/// [VarHandle][#VH_vui_num_ticks_poc_diff_one_minus1] - [Getter][#vui_num_ticks_poc_diff_one_minus1()] - [Setter][#vui_num_ticks_poc_diff_one_minus1(int)]
/// ### min_spatial_segmentation_idc
/// [VarHandle][#VH_min_spatial_segmentation_idc] - [Getter][#min_spatial_segmentation_idc()] - [Setter][#min_spatial_segmentation_idc(short)]
/// ### reserved3
/// [VarHandle][#VH_reserved3] - [Getter][#reserved3()] - [Setter][#reserved3(short)]
/// ### max_bytes_per_pic_denom
/// [VarHandle][#VH_max_bytes_per_pic_denom] - [Getter][#max_bytes_per_pic_denom()] - [Setter][#max_bytes_per_pic_denom(byte)]
/// ### max_bits_per_min_cu_denom
/// [VarHandle][#VH_max_bits_per_min_cu_denom] - [Getter][#max_bits_per_min_cu_denom()] - [Setter][#max_bits_per_min_cu_denom(byte)]
/// ### log2_max_mv_length_horizontal
/// [VarHandle][#VH_log2_max_mv_length_horizontal] - [Getter][#log2_max_mv_length_horizontal()] - [Setter][#log2_max_mv_length_horizontal(byte)]
/// ### log2_max_mv_length_vertical
/// [VarHandle][#VH_log2_max_mv_length_vertical] - [Getter][#log2_max_mv_length_vertical()] - [Setter][#log2_max_mv_length_vertical(byte)]
/// ### pHrdParameters
/// [VarHandle][#VH_pHrdParameters] - [Getter][#pHrdParameters()] - [Setter][#pHrdParameters(MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct StdVideoH265SequenceParameterSetVui {
///     StdVideoH265SpsVuiFlags flags;
///     StdVideoH265AspectRatioIdc aspect_ratio_idc;
///     uint16_t sar_width;
///     uint16_t sar_height;
///     uint8_t video_format;
///     uint8_t colour_primaries;
///     uint8_t transfer_characteristics;
///     uint8_t matrix_coeffs;
///     uint8_t chroma_sample_loc_type_top_field;
///     uint8_t chroma_sample_loc_type_bottom_field;
///     uint8_t reserved1;
///     uint8_t reserved2;
///     uint16_t def_disp_win_left_offset;
///     uint16_t def_disp_win_right_offset;
///     uint16_t def_disp_win_top_offset;
///     uint16_t def_disp_win_bottom_offset;
///     uint32_t vui_num_units_in_tick;
///     uint32_t vui_time_scale;
///     uint32_t vui_num_ticks_poc_diff_one_minus1;
///     uint16_t min_spatial_segmentation_idc;
///     uint16_t reserved3;
///     uint8_t max_bytes_per_pic_denom;
///     uint8_t max_bits_per_min_cu_denom;
///     uint8_t log2_max_mv_length_horizontal;
///     uint8_t log2_max_mv_length_vertical;
///     const StdVideoH265HrdParameters * pHrdParameters;
/// } StdVideoH265SequenceParameterSetVui;
/// ```
public sealed class StdVideoH265SequenceParameterSetVui extends Struct {
    /// The struct layout of `StdVideoH265SequenceParameterSetVui`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        StdVideoH265SpsVuiFlags.LAYOUT.withName("flags"),
        ValueLayout.JAVA_INT.withName("aspect_ratio_idc"),
        ValueLayout.JAVA_SHORT.withName("sar_width"),
        ValueLayout.JAVA_SHORT.withName("sar_height"),
        ValueLayout.JAVA_BYTE.withName("video_format"),
        ValueLayout.JAVA_BYTE.withName("colour_primaries"),
        ValueLayout.JAVA_BYTE.withName("transfer_characteristics"),
        ValueLayout.JAVA_BYTE.withName("matrix_coeffs"),
        ValueLayout.JAVA_BYTE.withName("chroma_sample_loc_type_top_field"),
        ValueLayout.JAVA_BYTE.withName("chroma_sample_loc_type_bottom_field"),
        ValueLayout.JAVA_BYTE.withName("reserved1"),
        ValueLayout.JAVA_BYTE.withName("reserved2"),
        ValueLayout.JAVA_SHORT.withName("def_disp_win_left_offset"),
        ValueLayout.JAVA_SHORT.withName("def_disp_win_right_offset"),
        ValueLayout.JAVA_SHORT.withName("def_disp_win_top_offset"),
        ValueLayout.JAVA_SHORT.withName("def_disp_win_bottom_offset"),
        ValueLayout.JAVA_INT.withName("vui_num_units_in_tick"),
        ValueLayout.JAVA_INT.withName("vui_time_scale"),
        ValueLayout.JAVA_INT.withName("vui_num_ticks_poc_diff_one_minus1"),
        ValueLayout.JAVA_SHORT.withName("min_spatial_segmentation_idc"),
        ValueLayout.JAVA_SHORT.withName("reserved3"),
        ValueLayout.JAVA_BYTE.withName("max_bytes_per_pic_denom"),
        ValueLayout.JAVA_BYTE.withName("max_bits_per_min_cu_denom"),
        ValueLayout.JAVA_BYTE.withName("log2_max_mv_length_horizontal"),
        ValueLayout.JAVA_BYTE.withName("log2_max_mv_length_vertical"),
        ValueLayout.ADDRESS.withName("pHrdParameters")
    );
    /// The [VarHandle] of `flags` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    /// The [VarHandle] of `aspect_ratio_idc` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_aspect_ratio_idc = LAYOUT.arrayElementVarHandle(PathElement.groupElement("aspect_ratio_idc"));
    /// The [VarHandle] of `sar_width` of type `(MemorySegment base, long baseOffset, long index)short`.
    public static final VarHandle VH_sar_width = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sar_width"));
    /// The [VarHandle] of `sar_height` of type `(MemorySegment base, long baseOffset, long index)short`.
    public static final VarHandle VH_sar_height = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sar_height"));
    /// The [VarHandle] of `video_format` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_video_format = LAYOUT.arrayElementVarHandle(PathElement.groupElement("video_format"));
    /// The [VarHandle] of `colour_primaries` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_colour_primaries = LAYOUT.arrayElementVarHandle(PathElement.groupElement("colour_primaries"));
    /// The [VarHandle] of `transfer_characteristics` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_transfer_characteristics = LAYOUT.arrayElementVarHandle(PathElement.groupElement("transfer_characteristics"));
    /// The [VarHandle] of `matrix_coeffs` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_matrix_coeffs = LAYOUT.arrayElementVarHandle(PathElement.groupElement("matrix_coeffs"));
    /// The [VarHandle] of `chroma_sample_loc_type_top_field` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_chroma_sample_loc_type_top_field = LAYOUT.arrayElementVarHandle(PathElement.groupElement("chroma_sample_loc_type_top_field"));
    /// The [VarHandle] of `chroma_sample_loc_type_bottom_field` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_chroma_sample_loc_type_bottom_field = LAYOUT.arrayElementVarHandle(PathElement.groupElement("chroma_sample_loc_type_bottom_field"));
    /// The [VarHandle] of `reserved1` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_reserved1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("reserved1"));
    /// The [VarHandle] of `reserved2` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_reserved2 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("reserved2"));
    /// The [VarHandle] of `def_disp_win_left_offset` of type `(MemorySegment base, long baseOffset, long index)short`.
    public static final VarHandle VH_def_disp_win_left_offset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("def_disp_win_left_offset"));
    /// The [VarHandle] of `def_disp_win_right_offset` of type `(MemorySegment base, long baseOffset, long index)short`.
    public static final VarHandle VH_def_disp_win_right_offset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("def_disp_win_right_offset"));
    /// The [VarHandle] of `def_disp_win_top_offset` of type `(MemorySegment base, long baseOffset, long index)short`.
    public static final VarHandle VH_def_disp_win_top_offset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("def_disp_win_top_offset"));
    /// The [VarHandle] of `def_disp_win_bottom_offset` of type `(MemorySegment base, long baseOffset, long index)short`.
    public static final VarHandle VH_def_disp_win_bottom_offset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("def_disp_win_bottom_offset"));
    /// The [VarHandle] of `vui_num_units_in_tick` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_vui_num_units_in_tick = LAYOUT.arrayElementVarHandle(PathElement.groupElement("vui_num_units_in_tick"));
    /// The [VarHandle] of `vui_time_scale` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_vui_time_scale = LAYOUT.arrayElementVarHandle(PathElement.groupElement("vui_time_scale"));
    /// The [VarHandle] of `vui_num_ticks_poc_diff_one_minus1` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_vui_num_ticks_poc_diff_one_minus1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("vui_num_ticks_poc_diff_one_minus1"));
    /// The [VarHandle] of `min_spatial_segmentation_idc` of type `(MemorySegment base, long baseOffset, long index)short`.
    public static final VarHandle VH_min_spatial_segmentation_idc = LAYOUT.arrayElementVarHandle(PathElement.groupElement("min_spatial_segmentation_idc"));
    /// The [VarHandle] of `reserved3` of type `(MemorySegment base, long baseOffset, long index)short`.
    public static final VarHandle VH_reserved3 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("reserved3"));
    /// The [VarHandle] of `max_bytes_per_pic_denom` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_max_bytes_per_pic_denom = LAYOUT.arrayElementVarHandle(PathElement.groupElement("max_bytes_per_pic_denom"));
    /// The [VarHandle] of `max_bits_per_min_cu_denom` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_max_bits_per_min_cu_denom = LAYOUT.arrayElementVarHandle(PathElement.groupElement("max_bits_per_min_cu_denom"));
    /// The [VarHandle] of `log2_max_mv_length_horizontal` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_log2_max_mv_length_horizontal = LAYOUT.arrayElementVarHandle(PathElement.groupElement("log2_max_mv_length_horizontal"));
    /// The [VarHandle] of `log2_max_mv_length_vertical` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_log2_max_mv_length_vertical = LAYOUT.arrayElementVarHandle(PathElement.groupElement("log2_max_mv_length_vertical"));
    /// The [VarHandle] of `pHrdParameters` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pHrdParameters = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pHrdParameters"));

    /// Creates `StdVideoH265SequenceParameterSetVui` with the given segment.
    /// @param segment the memory segment
    public StdVideoH265SequenceParameterSetVui(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `StdVideoH265SequenceParameterSetVui` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoH265SequenceParameterSetVui of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new StdVideoH265SequenceParameterSetVui(segment); }

    /// Creates `StdVideoH265SequenceParameterSetVui` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `StdVideoH265SequenceParameterSetVui` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoH265SequenceParameterSetVui ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new StdVideoH265SequenceParameterSetVui(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `StdVideoH265SequenceParameterSetVui` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `StdVideoH265SequenceParameterSetVui` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoH265SequenceParameterSetVui`
    public static StdVideoH265SequenceParameterSetVui alloc(SegmentAllocator allocator) { return new StdVideoH265SequenceParameterSetVui(allocator.allocate(LAYOUT)); }

    /// Allocates a `StdVideoH265SequenceParameterSetVui` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `StdVideoH265SequenceParameterSetVui`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `StdVideoH265SequenceParameterSetVui` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoH265SequenceParameterSetVui`
    public static StdVideoH265SequenceParameterSetVui allocInit(SegmentAllocator allocator, @CType("StdVideoH265SpsVuiFlags") MemorySegment flags, @CType("StdVideoH265AspectRatioIdc") int aspect_ratio_idc, @CType("uint16_t") short sar_width, @CType("uint16_t") short sar_height, @CType("uint8_t") byte video_format, @CType("uint8_t") byte colour_primaries, @CType("uint8_t") byte transfer_characteristics, @CType("uint8_t") byte matrix_coeffs, @CType("uint8_t") byte chroma_sample_loc_type_top_field, @CType("uint8_t") byte chroma_sample_loc_type_bottom_field, @CType("uint8_t") byte reserved1, @CType("uint8_t") byte reserved2, @CType("uint16_t") short def_disp_win_left_offset, @CType("uint16_t") short def_disp_win_right_offset, @CType("uint16_t") short def_disp_win_top_offset, @CType("uint16_t") short def_disp_win_bottom_offset, @CType("uint32_t") int vui_num_units_in_tick, @CType("uint32_t") int vui_time_scale, @CType("uint32_t") int vui_num_ticks_poc_diff_one_minus1, @CType("uint16_t") short min_spatial_segmentation_idc, @CType("uint16_t") short reserved3, @CType("uint8_t") byte max_bytes_per_pic_denom, @CType("uint8_t") byte max_bits_per_min_cu_denom, @CType("uint8_t") byte log2_max_mv_length_horizontal, @CType("uint8_t") byte log2_max_mv_length_vertical, @CType("const StdVideoH265HrdParameters *") MemorySegment pHrdParameters) { return alloc(allocator).flags(flags).aspect_ratio_idc(aspect_ratio_idc).sar_width(sar_width).sar_height(sar_height).video_format(video_format).colour_primaries(colour_primaries).transfer_characteristics(transfer_characteristics).matrix_coeffs(matrix_coeffs).chroma_sample_loc_type_top_field(chroma_sample_loc_type_top_field).chroma_sample_loc_type_bottom_field(chroma_sample_loc_type_bottom_field).reserved1(reserved1).reserved2(reserved2).def_disp_win_left_offset(def_disp_win_left_offset).def_disp_win_right_offset(def_disp_win_right_offset).def_disp_win_top_offset(def_disp_win_top_offset).def_disp_win_bottom_offset(def_disp_win_bottom_offset).vui_num_units_in_tick(vui_num_units_in_tick).vui_time_scale(vui_time_scale).vui_num_ticks_poc_diff_one_minus1(vui_num_ticks_poc_diff_one_minus1).min_spatial_segmentation_idc(min_spatial_segmentation_idc).reserved3(reserved3).max_bytes_per_pic_denom(max_bytes_per_pic_denom).max_bits_per_min_cu_denom(max_bits_per_min_cu_denom).log2_max_mv_length_horizontal(log2_max_mv_length_horizontal).log2_max_mv_length_vertical(log2_max_mv_length_vertical).pHrdParameters(pHrdParameters); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public StdVideoH265SequenceParameterSetVui copyFrom(StdVideoH265SequenceParameterSetVui src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("StdVideoH265SpsVuiFlags") MemorySegment get_flags(MemorySegment segment, long index) { return (MemorySegment) VH_flags.get(segment, 0L, index); }
    /// {@return `flags`}
    /// @param segment the segment of the struct
    public static @CType("StdVideoH265SpsVuiFlags") MemorySegment get_flags(MemorySegment segment) { return StdVideoH265SequenceParameterSetVui.get_flags(segment, 0L); }
    /// {@return `flags`}
    public @CType("StdVideoH265SpsVuiFlags") MemorySegment flags() { return StdVideoH265SequenceParameterSetVui.get_flags(this.segment()); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_flags(MemorySegment segment, long index, @CType("StdVideoH265SpsVuiFlags") MemorySegment value) { VH_flags.set(segment, 0L, index, value); }
    /// Sets `flags` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_flags(MemorySegment segment, @CType("StdVideoH265SpsVuiFlags") MemorySegment value) { StdVideoH265SequenceParameterSetVui.set_flags(segment, 0L, value); }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265SequenceParameterSetVui flags(@CType("StdVideoH265SpsVuiFlags") MemorySegment value) { StdVideoH265SequenceParameterSetVui.set_flags(this.segment(), value); return this; }

    /// {@return `aspect_ratio_idc` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("StdVideoH265AspectRatioIdc") int get_aspect_ratio_idc(MemorySegment segment, long index) { return (int) VH_aspect_ratio_idc.get(segment, 0L, index); }
    /// {@return `aspect_ratio_idc`}
    /// @param segment the segment of the struct
    public static @CType("StdVideoH265AspectRatioIdc") int get_aspect_ratio_idc(MemorySegment segment) { return StdVideoH265SequenceParameterSetVui.get_aspect_ratio_idc(segment, 0L); }
    /// {@return `aspect_ratio_idc`}
    public @CType("StdVideoH265AspectRatioIdc") int aspect_ratio_idc() { return StdVideoH265SequenceParameterSetVui.get_aspect_ratio_idc(this.segment()); }
    /// Sets `aspect_ratio_idc` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_aspect_ratio_idc(MemorySegment segment, long index, @CType("StdVideoH265AspectRatioIdc") int value) { VH_aspect_ratio_idc.set(segment, 0L, index, value); }
    /// Sets `aspect_ratio_idc` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_aspect_ratio_idc(MemorySegment segment, @CType("StdVideoH265AspectRatioIdc") int value) { StdVideoH265SequenceParameterSetVui.set_aspect_ratio_idc(segment, 0L, value); }
    /// Sets `aspect_ratio_idc` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265SequenceParameterSetVui aspect_ratio_idc(@CType("StdVideoH265AspectRatioIdc") int value) { StdVideoH265SequenceParameterSetVui.set_aspect_ratio_idc(this.segment(), value); return this; }

    /// {@return `sar_width` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint16_t") short get_sar_width(MemorySegment segment, long index) { return (short) VH_sar_width.get(segment, 0L, index); }
    /// {@return `sar_width`}
    /// @param segment the segment of the struct
    public static @CType("uint16_t") short get_sar_width(MemorySegment segment) { return StdVideoH265SequenceParameterSetVui.get_sar_width(segment, 0L); }
    /// {@return `sar_width`}
    public @CType("uint16_t") short sar_width() { return StdVideoH265SequenceParameterSetVui.get_sar_width(this.segment()); }
    /// Sets `sar_width` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sar_width(MemorySegment segment, long index, @CType("uint16_t") short value) { VH_sar_width.set(segment, 0L, index, value); }
    /// Sets `sar_width` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sar_width(MemorySegment segment, @CType("uint16_t") short value) { StdVideoH265SequenceParameterSetVui.set_sar_width(segment, 0L, value); }
    /// Sets `sar_width` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265SequenceParameterSetVui sar_width(@CType("uint16_t") short value) { StdVideoH265SequenceParameterSetVui.set_sar_width(this.segment(), value); return this; }

    /// {@return `sar_height` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint16_t") short get_sar_height(MemorySegment segment, long index) { return (short) VH_sar_height.get(segment, 0L, index); }
    /// {@return `sar_height`}
    /// @param segment the segment of the struct
    public static @CType("uint16_t") short get_sar_height(MemorySegment segment) { return StdVideoH265SequenceParameterSetVui.get_sar_height(segment, 0L); }
    /// {@return `sar_height`}
    public @CType("uint16_t") short sar_height() { return StdVideoH265SequenceParameterSetVui.get_sar_height(this.segment()); }
    /// Sets `sar_height` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sar_height(MemorySegment segment, long index, @CType("uint16_t") short value) { VH_sar_height.set(segment, 0L, index, value); }
    /// Sets `sar_height` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sar_height(MemorySegment segment, @CType("uint16_t") short value) { StdVideoH265SequenceParameterSetVui.set_sar_height(segment, 0L, value); }
    /// Sets `sar_height` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265SequenceParameterSetVui sar_height(@CType("uint16_t") short value) { StdVideoH265SequenceParameterSetVui.set_sar_height(this.segment(), value); return this; }

    /// {@return `video_format` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t") byte get_video_format(MemorySegment segment, long index) { return (byte) VH_video_format.get(segment, 0L, index); }
    /// {@return `video_format`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t") byte get_video_format(MemorySegment segment) { return StdVideoH265SequenceParameterSetVui.get_video_format(segment, 0L); }
    /// {@return `video_format`}
    public @CType("uint8_t") byte video_format() { return StdVideoH265SequenceParameterSetVui.get_video_format(this.segment()); }
    /// Sets `video_format` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_video_format(MemorySegment segment, long index, @CType("uint8_t") byte value) { VH_video_format.set(segment, 0L, index, value); }
    /// Sets `video_format` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_video_format(MemorySegment segment, @CType("uint8_t") byte value) { StdVideoH265SequenceParameterSetVui.set_video_format(segment, 0L, value); }
    /// Sets `video_format` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265SequenceParameterSetVui video_format(@CType("uint8_t") byte value) { StdVideoH265SequenceParameterSetVui.set_video_format(this.segment(), value); return this; }

    /// {@return `colour_primaries` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t") byte get_colour_primaries(MemorySegment segment, long index) { return (byte) VH_colour_primaries.get(segment, 0L, index); }
    /// {@return `colour_primaries`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t") byte get_colour_primaries(MemorySegment segment) { return StdVideoH265SequenceParameterSetVui.get_colour_primaries(segment, 0L); }
    /// {@return `colour_primaries`}
    public @CType("uint8_t") byte colour_primaries() { return StdVideoH265SequenceParameterSetVui.get_colour_primaries(this.segment()); }
    /// Sets `colour_primaries` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_colour_primaries(MemorySegment segment, long index, @CType("uint8_t") byte value) { VH_colour_primaries.set(segment, 0L, index, value); }
    /// Sets `colour_primaries` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_colour_primaries(MemorySegment segment, @CType("uint8_t") byte value) { StdVideoH265SequenceParameterSetVui.set_colour_primaries(segment, 0L, value); }
    /// Sets `colour_primaries` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265SequenceParameterSetVui colour_primaries(@CType("uint8_t") byte value) { StdVideoH265SequenceParameterSetVui.set_colour_primaries(this.segment(), value); return this; }

    /// {@return `transfer_characteristics` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t") byte get_transfer_characteristics(MemorySegment segment, long index) { return (byte) VH_transfer_characteristics.get(segment, 0L, index); }
    /// {@return `transfer_characteristics`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t") byte get_transfer_characteristics(MemorySegment segment) { return StdVideoH265SequenceParameterSetVui.get_transfer_characteristics(segment, 0L); }
    /// {@return `transfer_characteristics`}
    public @CType("uint8_t") byte transfer_characteristics() { return StdVideoH265SequenceParameterSetVui.get_transfer_characteristics(this.segment()); }
    /// Sets `transfer_characteristics` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_transfer_characteristics(MemorySegment segment, long index, @CType("uint8_t") byte value) { VH_transfer_characteristics.set(segment, 0L, index, value); }
    /// Sets `transfer_characteristics` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_transfer_characteristics(MemorySegment segment, @CType("uint8_t") byte value) { StdVideoH265SequenceParameterSetVui.set_transfer_characteristics(segment, 0L, value); }
    /// Sets `transfer_characteristics` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265SequenceParameterSetVui transfer_characteristics(@CType("uint8_t") byte value) { StdVideoH265SequenceParameterSetVui.set_transfer_characteristics(this.segment(), value); return this; }

    /// {@return `matrix_coeffs` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t") byte get_matrix_coeffs(MemorySegment segment, long index) { return (byte) VH_matrix_coeffs.get(segment, 0L, index); }
    /// {@return `matrix_coeffs`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t") byte get_matrix_coeffs(MemorySegment segment) { return StdVideoH265SequenceParameterSetVui.get_matrix_coeffs(segment, 0L); }
    /// {@return `matrix_coeffs`}
    public @CType("uint8_t") byte matrix_coeffs() { return StdVideoH265SequenceParameterSetVui.get_matrix_coeffs(this.segment()); }
    /// Sets `matrix_coeffs` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_matrix_coeffs(MemorySegment segment, long index, @CType("uint8_t") byte value) { VH_matrix_coeffs.set(segment, 0L, index, value); }
    /// Sets `matrix_coeffs` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_matrix_coeffs(MemorySegment segment, @CType("uint8_t") byte value) { StdVideoH265SequenceParameterSetVui.set_matrix_coeffs(segment, 0L, value); }
    /// Sets `matrix_coeffs` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265SequenceParameterSetVui matrix_coeffs(@CType("uint8_t") byte value) { StdVideoH265SequenceParameterSetVui.set_matrix_coeffs(this.segment(), value); return this; }

    /// {@return `chroma_sample_loc_type_top_field` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t") byte get_chroma_sample_loc_type_top_field(MemorySegment segment, long index) { return (byte) VH_chroma_sample_loc_type_top_field.get(segment, 0L, index); }
    /// {@return `chroma_sample_loc_type_top_field`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t") byte get_chroma_sample_loc_type_top_field(MemorySegment segment) { return StdVideoH265SequenceParameterSetVui.get_chroma_sample_loc_type_top_field(segment, 0L); }
    /// {@return `chroma_sample_loc_type_top_field`}
    public @CType("uint8_t") byte chroma_sample_loc_type_top_field() { return StdVideoH265SequenceParameterSetVui.get_chroma_sample_loc_type_top_field(this.segment()); }
    /// Sets `chroma_sample_loc_type_top_field` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_chroma_sample_loc_type_top_field(MemorySegment segment, long index, @CType("uint8_t") byte value) { VH_chroma_sample_loc_type_top_field.set(segment, 0L, index, value); }
    /// Sets `chroma_sample_loc_type_top_field` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_chroma_sample_loc_type_top_field(MemorySegment segment, @CType("uint8_t") byte value) { StdVideoH265SequenceParameterSetVui.set_chroma_sample_loc_type_top_field(segment, 0L, value); }
    /// Sets `chroma_sample_loc_type_top_field` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265SequenceParameterSetVui chroma_sample_loc_type_top_field(@CType("uint8_t") byte value) { StdVideoH265SequenceParameterSetVui.set_chroma_sample_loc_type_top_field(this.segment(), value); return this; }

    /// {@return `chroma_sample_loc_type_bottom_field` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t") byte get_chroma_sample_loc_type_bottom_field(MemorySegment segment, long index) { return (byte) VH_chroma_sample_loc_type_bottom_field.get(segment, 0L, index); }
    /// {@return `chroma_sample_loc_type_bottom_field`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t") byte get_chroma_sample_loc_type_bottom_field(MemorySegment segment) { return StdVideoH265SequenceParameterSetVui.get_chroma_sample_loc_type_bottom_field(segment, 0L); }
    /// {@return `chroma_sample_loc_type_bottom_field`}
    public @CType("uint8_t") byte chroma_sample_loc_type_bottom_field() { return StdVideoH265SequenceParameterSetVui.get_chroma_sample_loc_type_bottom_field(this.segment()); }
    /// Sets `chroma_sample_loc_type_bottom_field` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_chroma_sample_loc_type_bottom_field(MemorySegment segment, long index, @CType("uint8_t") byte value) { VH_chroma_sample_loc_type_bottom_field.set(segment, 0L, index, value); }
    /// Sets `chroma_sample_loc_type_bottom_field` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_chroma_sample_loc_type_bottom_field(MemorySegment segment, @CType("uint8_t") byte value) { StdVideoH265SequenceParameterSetVui.set_chroma_sample_loc_type_bottom_field(segment, 0L, value); }
    /// Sets `chroma_sample_loc_type_bottom_field` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265SequenceParameterSetVui chroma_sample_loc_type_bottom_field(@CType("uint8_t") byte value) { StdVideoH265SequenceParameterSetVui.set_chroma_sample_loc_type_bottom_field(this.segment(), value); return this; }

    /// {@return `reserved1` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t") byte get_reserved1(MemorySegment segment, long index) { return (byte) VH_reserved1.get(segment, 0L, index); }
    /// {@return `reserved1`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t") byte get_reserved1(MemorySegment segment) { return StdVideoH265SequenceParameterSetVui.get_reserved1(segment, 0L); }
    /// {@return `reserved1`}
    public @CType("uint8_t") byte reserved1() { return StdVideoH265SequenceParameterSetVui.get_reserved1(this.segment()); }
    /// Sets `reserved1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_reserved1(MemorySegment segment, long index, @CType("uint8_t") byte value) { VH_reserved1.set(segment, 0L, index, value); }
    /// Sets `reserved1` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_reserved1(MemorySegment segment, @CType("uint8_t") byte value) { StdVideoH265SequenceParameterSetVui.set_reserved1(segment, 0L, value); }
    /// Sets `reserved1` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265SequenceParameterSetVui reserved1(@CType("uint8_t") byte value) { StdVideoH265SequenceParameterSetVui.set_reserved1(this.segment(), value); return this; }

    /// {@return `reserved2` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t") byte get_reserved2(MemorySegment segment, long index) { return (byte) VH_reserved2.get(segment, 0L, index); }
    /// {@return `reserved2`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t") byte get_reserved2(MemorySegment segment) { return StdVideoH265SequenceParameterSetVui.get_reserved2(segment, 0L); }
    /// {@return `reserved2`}
    public @CType("uint8_t") byte reserved2() { return StdVideoH265SequenceParameterSetVui.get_reserved2(this.segment()); }
    /// Sets `reserved2` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_reserved2(MemorySegment segment, long index, @CType("uint8_t") byte value) { VH_reserved2.set(segment, 0L, index, value); }
    /// Sets `reserved2` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_reserved2(MemorySegment segment, @CType("uint8_t") byte value) { StdVideoH265SequenceParameterSetVui.set_reserved2(segment, 0L, value); }
    /// Sets `reserved2` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265SequenceParameterSetVui reserved2(@CType("uint8_t") byte value) { StdVideoH265SequenceParameterSetVui.set_reserved2(this.segment(), value); return this; }

    /// {@return `def_disp_win_left_offset` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint16_t") short get_def_disp_win_left_offset(MemorySegment segment, long index) { return (short) VH_def_disp_win_left_offset.get(segment, 0L, index); }
    /// {@return `def_disp_win_left_offset`}
    /// @param segment the segment of the struct
    public static @CType("uint16_t") short get_def_disp_win_left_offset(MemorySegment segment) { return StdVideoH265SequenceParameterSetVui.get_def_disp_win_left_offset(segment, 0L); }
    /// {@return `def_disp_win_left_offset`}
    public @CType("uint16_t") short def_disp_win_left_offset() { return StdVideoH265SequenceParameterSetVui.get_def_disp_win_left_offset(this.segment()); }
    /// Sets `def_disp_win_left_offset` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_def_disp_win_left_offset(MemorySegment segment, long index, @CType("uint16_t") short value) { VH_def_disp_win_left_offset.set(segment, 0L, index, value); }
    /// Sets `def_disp_win_left_offset` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_def_disp_win_left_offset(MemorySegment segment, @CType("uint16_t") short value) { StdVideoH265SequenceParameterSetVui.set_def_disp_win_left_offset(segment, 0L, value); }
    /// Sets `def_disp_win_left_offset` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265SequenceParameterSetVui def_disp_win_left_offset(@CType("uint16_t") short value) { StdVideoH265SequenceParameterSetVui.set_def_disp_win_left_offset(this.segment(), value); return this; }

    /// {@return `def_disp_win_right_offset` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint16_t") short get_def_disp_win_right_offset(MemorySegment segment, long index) { return (short) VH_def_disp_win_right_offset.get(segment, 0L, index); }
    /// {@return `def_disp_win_right_offset`}
    /// @param segment the segment of the struct
    public static @CType("uint16_t") short get_def_disp_win_right_offset(MemorySegment segment) { return StdVideoH265SequenceParameterSetVui.get_def_disp_win_right_offset(segment, 0L); }
    /// {@return `def_disp_win_right_offset`}
    public @CType("uint16_t") short def_disp_win_right_offset() { return StdVideoH265SequenceParameterSetVui.get_def_disp_win_right_offset(this.segment()); }
    /// Sets `def_disp_win_right_offset` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_def_disp_win_right_offset(MemorySegment segment, long index, @CType("uint16_t") short value) { VH_def_disp_win_right_offset.set(segment, 0L, index, value); }
    /// Sets `def_disp_win_right_offset` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_def_disp_win_right_offset(MemorySegment segment, @CType("uint16_t") short value) { StdVideoH265SequenceParameterSetVui.set_def_disp_win_right_offset(segment, 0L, value); }
    /// Sets `def_disp_win_right_offset` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265SequenceParameterSetVui def_disp_win_right_offset(@CType("uint16_t") short value) { StdVideoH265SequenceParameterSetVui.set_def_disp_win_right_offset(this.segment(), value); return this; }

    /// {@return `def_disp_win_top_offset` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint16_t") short get_def_disp_win_top_offset(MemorySegment segment, long index) { return (short) VH_def_disp_win_top_offset.get(segment, 0L, index); }
    /// {@return `def_disp_win_top_offset`}
    /// @param segment the segment of the struct
    public static @CType("uint16_t") short get_def_disp_win_top_offset(MemorySegment segment) { return StdVideoH265SequenceParameterSetVui.get_def_disp_win_top_offset(segment, 0L); }
    /// {@return `def_disp_win_top_offset`}
    public @CType("uint16_t") short def_disp_win_top_offset() { return StdVideoH265SequenceParameterSetVui.get_def_disp_win_top_offset(this.segment()); }
    /// Sets `def_disp_win_top_offset` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_def_disp_win_top_offset(MemorySegment segment, long index, @CType("uint16_t") short value) { VH_def_disp_win_top_offset.set(segment, 0L, index, value); }
    /// Sets `def_disp_win_top_offset` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_def_disp_win_top_offset(MemorySegment segment, @CType("uint16_t") short value) { StdVideoH265SequenceParameterSetVui.set_def_disp_win_top_offset(segment, 0L, value); }
    /// Sets `def_disp_win_top_offset` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265SequenceParameterSetVui def_disp_win_top_offset(@CType("uint16_t") short value) { StdVideoH265SequenceParameterSetVui.set_def_disp_win_top_offset(this.segment(), value); return this; }

    /// {@return `def_disp_win_bottom_offset` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint16_t") short get_def_disp_win_bottom_offset(MemorySegment segment, long index) { return (short) VH_def_disp_win_bottom_offset.get(segment, 0L, index); }
    /// {@return `def_disp_win_bottom_offset`}
    /// @param segment the segment of the struct
    public static @CType("uint16_t") short get_def_disp_win_bottom_offset(MemorySegment segment) { return StdVideoH265SequenceParameterSetVui.get_def_disp_win_bottom_offset(segment, 0L); }
    /// {@return `def_disp_win_bottom_offset`}
    public @CType("uint16_t") short def_disp_win_bottom_offset() { return StdVideoH265SequenceParameterSetVui.get_def_disp_win_bottom_offset(this.segment()); }
    /// Sets `def_disp_win_bottom_offset` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_def_disp_win_bottom_offset(MemorySegment segment, long index, @CType("uint16_t") short value) { VH_def_disp_win_bottom_offset.set(segment, 0L, index, value); }
    /// Sets `def_disp_win_bottom_offset` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_def_disp_win_bottom_offset(MemorySegment segment, @CType("uint16_t") short value) { StdVideoH265SequenceParameterSetVui.set_def_disp_win_bottom_offset(segment, 0L, value); }
    /// Sets `def_disp_win_bottom_offset` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265SequenceParameterSetVui def_disp_win_bottom_offset(@CType("uint16_t") short value) { StdVideoH265SequenceParameterSetVui.set_def_disp_win_bottom_offset(this.segment(), value); return this; }

    /// {@return `vui_num_units_in_tick` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_vui_num_units_in_tick(MemorySegment segment, long index) { return (int) VH_vui_num_units_in_tick.get(segment, 0L, index); }
    /// {@return `vui_num_units_in_tick`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_vui_num_units_in_tick(MemorySegment segment) { return StdVideoH265SequenceParameterSetVui.get_vui_num_units_in_tick(segment, 0L); }
    /// {@return `vui_num_units_in_tick`}
    public @CType("uint32_t") int vui_num_units_in_tick() { return StdVideoH265SequenceParameterSetVui.get_vui_num_units_in_tick(this.segment()); }
    /// Sets `vui_num_units_in_tick` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_vui_num_units_in_tick(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_vui_num_units_in_tick.set(segment, 0L, index, value); }
    /// Sets `vui_num_units_in_tick` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_vui_num_units_in_tick(MemorySegment segment, @CType("uint32_t") int value) { StdVideoH265SequenceParameterSetVui.set_vui_num_units_in_tick(segment, 0L, value); }
    /// Sets `vui_num_units_in_tick` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265SequenceParameterSetVui vui_num_units_in_tick(@CType("uint32_t") int value) { StdVideoH265SequenceParameterSetVui.set_vui_num_units_in_tick(this.segment(), value); return this; }

    /// {@return `vui_time_scale` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_vui_time_scale(MemorySegment segment, long index) { return (int) VH_vui_time_scale.get(segment, 0L, index); }
    /// {@return `vui_time_scale`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_vui_time_scale(MemorySegment segment) { return StdVideoH265SequenceParameterSetVui.get_vui_time_scale(segment, 0L); }
    /// {@return `vui_time_scale`}
    public @CType("uint32_t") int vui_time_scale() { return StdVideoH265SequenceParameterSetVui.get_vui_time_scale(this.segment()); }
    /// Sets `vui_time_scale` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_vui_time_scale(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_vui_time_scale.set(segment, 0L, index, value); }
    /// Sets `vui_time_scale` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_vui_time_scale(MemorySegment segment, @CType("uint32_t") int value) { StdVideoH265SequenceParameterSetVui.set_vui_time_scale(segment, 0L, value); }
    /// Sets `vui_time_scale` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265SequenceParameterSetVui vui_time_scale(@CType("uint32_t") int value) { StdVideoH265SequenceParameterSetVui.set_vui_time_scale(this.segment(), value); return this; }

    /// {@return `vui_num_ticks_poc_diff_one_minus1` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_vui_num_ticks_poc_diff_one_minus1(MemorySegment segment, long index) { return (int) VH_vui_num_ticks_poc_diff_one_minus1.get(segment, 0L, index); }
    /// {@return `vui_num_ticks_poc_diff_one_minus1`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_vui_num_ticks_poc_diff_one_minus1(MemorySegment segment) { return StdVideoH265SequenceParameterSetVui.get_vui_num_ticks_poc_diff_one_minus1(segment, 0L); }
    /// {@return `vui_num_ticks_poc_diff_one_minus1`}
    public @CType("uint32_t") int vui_num_ticks_poc_diff_one_minus1() { return StdVideoH265SequenceParameterSetVui.get_vui_num_ticks_poc_diff_one_minus1(this.segment()); }
    /// Sets `vui_num_ticks_poc_diff_one_minus1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_vui_num_ticks_poc_diff_one_minus1(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_vui_num_ticks_poc_diff_one_minus1.set(segment, 0L, index, value); }
    /// Sets `vui_num_ticks_poc_diff_one_minus1` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_vui_num_ticks_poc_diff_one_minus1(MemorySegment segment, @CType("uint32_t") int value) { StdVideoH265SequenceParameterSetVui.set_vui_num_ticks_poc_diff_one_minus1(segment, 0L, value); }
    /// Sets `vui_num_ticks_poc_diff_one_minus1` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265SequenceParameterSetVui vui_num_ticks_poc_diff_one_minus1(@CType("uint32_t") int value) { StdVideoH265SequenceParameterSetVui.set_vui_num_ticks_poc_diff_one_minus1(this.segment(), value); return this; }

    /// {@return `min_spatial_segmentation_idc` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint16_t") short get_min_spatial_segmentation_idc(MemorySegment segment, long index) { return (short) VH_min_spatial_segmentation_idc.get(segment, 0L, index); }
    /// {@return `min_spatial_segmentation_idc`}
    /// @param segment the segment of the struct
    public static @CType("uint16_t") short get_min_spatial_segmentation_idc(MemorySegment segment) { return StdVideoH265SequenceParameterSetVui.get_min_spatial_segmentation_idc(segment, 0L); }
    /// {@return `min_spatial_segmentation_idc`}
    public @CType("uint16_t") short min_spatial_segmentation_idc() { return StdVideoH265SequenceParameterSetVui.get_min_spatial_segmentation_idc(this.segment()); }
    /// Sets `min_spatial_segmentation_idc` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_min_spatial_segmentation_idc(MemorySegment segment, long index, @CType("uint16_t") short value) { VH_min_spatial_segmentation_idc.set(segment, 0L, index, value); }
    /// Sets `min_spatial_segmentation_idc` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_min_spatial_segmentation_idc(MemorySegment segment, @CType("uint16_t") short value) { StdVideoH265SequenceParameterSetVui.set_min_spatial_segmentation_idc(segment, 0L, value); }
    /// Sets `min_spatial_segmentation_idc` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265SequenceParameterSetVui min_spatial_segmentation_idc(@CType("uint16_t") short value) { StdVideoH265SequenceParameterSetVui.set_min_spatial_segmentation_idc(this.segment(), value); return this; }

    /// {@return `reserved3` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint16_t") short get_reserved3(MemorySegment segment, long index) { return (short) VH_reserved3.get(segment, 0L, index); }
    /// {@return `reserved3`}
    /// @param segment the segment of the struct
    public static @CType("uint16_t") short get_reserved3(MemorySegment segment) { return StdVideoH265SequenceParameterSetVui.get_reserved3(segment, 0L); }
    /// {@return `reserved3`}
    public @CType("uint16_t") short reserved3() { return StdVideoH265SequenceParameterSetVui.get_reserved3(this.segment()); }
    /// Sets `reserved3` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_reserved3(MemorySegment segment, long index, @CType("uint16_t") short value) { VH_reserved3.set(segment, 0L, index, value); }
    /// Sets `reserved3` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_reserved3(MemorySegment segment, @CType("uint16_t") short value) { StdVideoH265SequenceParameterSetVui.set_reserved3(segment, 0L, value); }
    /// Sets `reserved3` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265SequenceParameterSetVui reserved3(@CType("uint16_t") short value) { StdVideoH265SequenceParameterSetVui.set_reserved3(this.segment(), value); return this; }

    /// {@return `max_bytes_per_pic_denom` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t") byte get_max_bytes_per_pic_denom(MemorySegment segment, long index) { return (byte) VH_max_bytes_per_pic_denom.get(segment, 0L, index); }
    /// {@return `max_bytes_per_pic_denom`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t") byte get_max_bytes_per_pic_denom(MemorySegment segment) { return StdVideoH265SequenceParameterSetVui.get_max_bytes_per_pic_denom(segment, 0L); }
    /// {@return `max_bytes_per_pic_denom`}
    public @CType("uint8_t") byte max_bytes_per_pic_denom() { return StdVideoH265SequenceParameterSetVui.get_max_bytes_per_pic_denom(this.segment()); }
    /// Sets `max_bytes_per_pic_denom` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_max_bytes_per_pic_denom(MemorySegment segment, long index, @CType("uint8_t") byte value) { VH_max_bytes_per_pic_denom.set(segment, 0L, index, value); }
    /// Sets `max_bytes_per_pic_denom` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_max_bytes_per_pic_denom(MemorySegment segment, @CType("uint8_t") byte value) { StdVideoH265SequenceParameterSetVui.set_max_bytes_per_pic_denom(segment, 0L, value); }
    /// Sets `max_bytes_per_pic_denom` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265SequenceParameterSetVui max_bytes_per_pic_denom(@CType("uint8_t") byte value) { StdVideoH265SequenceParameterSetVui.set_max_bytes_per_pic_denom(this.segment(), value); return this; }

    /// {@return `max_bits_per_min_cu_denom` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t") byte get_max_bits_per_min_cu_denom(MemorySegment segment, long index) { return (byte) VH_max_bits_per_min_cu_denom.get(segment, 0L, index); }
    /// {@return `max_bits_per_min_cu_denom`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t") byte get_max_bits_per_min_cu_denom(MemorySegment segment) { return StdVideoH265SequenceParameterSetVui.get_max_bits_per_min_cu_denom(segment, 0L); }
    /// {@return `max_bits_per_min_cu_denom`}
    public @CType("uint8_t") byte max_bits_per_min_cu_denom() { return StdVideoH265SequenceParameterSetVui.get_max_bits_per_min_cu_denom(this.segment()); }
    /// Sets `max_bits_per_min_cu_denom` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_max_bits_per_min_cu_denom(MemorySegment segment, long index, @CType("uint8_t") byte value) { VH_max_bits_per_min_cu_denom.set(segment, 0L, index, value); }
    /// Sets `max_bits_per_min_cu_denom` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_max_bits_per_min_cu_denom(MemorySegment segment, @CType("uint8_t") byte value) { StdVideoH265SequenceParameterSetVui.set_max_bits_per_min_cu_denom(segment, 0L, value); }
    /// Sets `max_bits_per_min_cu_denom` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265SequenceParameterSetVui max_bits_per_min_cu_denom(@CType("uint8_t") byte value) { StdVideoH265SequenceParameterSetVui.set_max_bits_per_min_cu_denom(this.segment(), value); return this; }

    /// {@return `log2_max_mv_length_horizontal` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t") byte get_log2_max_mv_length_horizontal(MemorySegment segment, long index) { return (byte) VH_log2_max_mv_length_horizontal.get(segment, 0L, index); }
    /// {@return `log2_max_mv_length_horizontal`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t") byte get_log2_max_mv_length_horizontal(MemorySegment segment) { return StdVideoH265SequenceParameterSetVui.get_log2_max_mv_length_horizontal(segment, 0L); }
    /// {@return `log2_max_mv_length_horizontal`}
    public @CType("uint8_t") byte log2_max_mv_length_horizontal() { return StdVideoH265SequenceParameterSetVui.get_log2_max_mv_length_horizontal(this.segment()); }
    /// Sets `log2_max_mv_length_horizontal` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_log2_max_mv_length_horizontal(MemorySegment segment, long index, @CType("uint8_t") byte value) { VH_log2_max_mv_length_horizontal.set(segment, 0L, index, value); }
    /// Sets `log2_max_mv_length_horizontal` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_log2_max_mv_length_horizontal(MemorySegment segment, @CType("uint8_t") byte value) { StdVideoH265SequenceParameterSetVui.set_log2_max_mv_length_horizontal(segment, 0L, value); }
    /// Sets `log2_max_mv_length_horizontal` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265SequenceParameterSetVui log2_max_mv_length_horizontal(@CType("uint8_t") byte value) { StdVideoH265SequenceParameterSetVui.set_log2_max_mv_length_horizontal(this.segment(), value); return this; }

    /// {@return `log2_max_mv_length_vertical` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t") byte get_log2_max_mv_length_vertical(MemorySegment segment, long index) { return (byte) VH_log2_max_mv_length_vertical.get(segment, 0L, index); }
    /// {@return `log2_max_mv_length_vertical`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t") byte get_log2_max_mv_length_vertical(MemorySegment segment) { return StdVideoH265SequenceParameterSetVui.get_log2_max_mv_length_vertical(segment, 0L); }
    /// {@return `log2_max_mv_length_vertical`}
    public @CType("uint8_t") byte log2_max_mv_length_vertical() { return StdVideoH265SequenceParameterSetVui.get_log2_max_mv_length_vertical(this.segment()); }
    /// Sets `log2_max_mv_length_vertical` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_log2_max_mv_length_vertical(MemorySegment segment, long index, @CType("uint8_t") byte value) { VH_log2_max_mv_length_vertical.set(segment, 0L, index, value); }
    /// Sets `log2_max_mv_length_vertical` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_log2_max_mv_length_vertical(MemorySegment segment, @CType("uint8_t") byte value) { StdVideoH265SequenceParameterSetVui.set_log2_max_mv_length_vertical(segment, 0L, value); }
    /// Sets `log2_max_mv_length_vertical` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265SequenceParameterSetVui log2_max_mv_length_vertical(@CType("uint8_t") byte value) { StdVideoH265SequenceParameterSetVui.set_log2_max_mv_length_vertical(this.segment(), value); return this; }

    /// {@return `pHrdParameters` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const StdVideoH265HrdParameters *") MemorySegment get_pHrdParameters(MemorySegment segment, long index) { return (MemorySegment) VH_pHrdParameters.get(segment, 0L, index); }
    /// {@return `pHrdParameters`}
    /// @param segment the segment of the struct
    public static @CType("const StdVideoH265HrdParameters *") MemorySegment get_pHrdParameters(MemorySegment segment) { return StdVideoH265SequenceParameterSetVui.get_pHrdParameters(segment, 0L); }
    /// {@return `pHrdParameters`}
    public @CType("const StdVideoH265HrdParameters *") MemorySegment pHrdParameters() { return StdVideoH265SequenceParameterSetVui.get_pHrdParameters(this.segment()); }
    /// Sets `pHrdParameters` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pHrdParameters(MemorySegment segment, long index, @CType("const StdVideoH265HrdParameters *") MemorySegment value) { VH_pHrdParameters.set(segment, 0L, index, value); }
    /// Sets `pHrdParameters` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pHrdParameters(MemorySegment segment, @CType("const StdVideoH265HrdParameters *") MemorySegment value) { StdVideoH265SequenceParameterSetVui.set_pHrdParameters(segment, 0L, value); }
    /// Sets `pHrdParameters` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265SequenceParameterSetVui pHrdParameters(@CType("const StdVideoH265HrdParameters *") MemorySegment value) { StdVideoH265SequenceParameterSetVui.set_pHrdParameters(this.segment(), value); return this; }

    /// A buffer of [StdVideoH265SequenceParameterSetVui].
    public static final class Buffer extends StdVideoH265SequenceParameterSetVui {
        private final long elementCount;

        /// Creates `StdVideoH265SequenceParameterSetVui.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `StdVideoH265SequenceParameterSetVui`.
        /// @param index the index of the struct buffer
        /// @return the slice of `StdVideoH265SequenceParameterSetVui`
        public StdVideoH265SequenceParameterSetVui asSlice(long index) { return new StdVideoH265SequenceParameterSetVui(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `StdVideoH265SequenceParameterSetVui`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `StdVideoH265SequenceParameterSetVui`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `flags` at the given index}
        /// @param index the index
        public @CType("StdVideoH265SpsVuiFlags") MemorySegment flagsAt(long index) { return StdVideoH265SequenceParameterSetVui.get_flags(this.segment(), index); }
        /// Sets `flags` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer flagsAt(long index, @CType("StdVideoH265SpsVuiFlags") MemorySegment value) { StdVideoH265SequenceParameterSetVui.set_flags(this.segment(), index, value); return this; }

        /// {@return `aspect_ratio_idc` at the given index}
        /// @param index the index
        public @CType("StdVideoH265AspectRatioIdc") int aspect_ratio_idcAt(long index) { return StdVideoH265SequenceParameterSetVui.get_aspect_ratio_idc(this.segment(), index); }
        /// Sets `aspect_ratio_idc` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer aspect_ratio_idcAt(long index, @CType("StdVideoH265AspectRatioIdc") int value) { StdVideoH265SequenceParameterSetVui.set_aspect_ratio_idc(this.segment(), index, value); return this; }

        /// {@return `sar_width` at the given index}
        /// @param index the index
        public @CType("uint16_t") short sar_widthAt(long index) { return StdVideoH265SequenceParameterSetVui.get_sar_width(this.segment(), index); }
        /// Sets `sar_width` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sar_widthAt(long index, @CType("uint16_t") short value) { StdVideoH265SequenceParameterSetVui.set_sar_width(this.segment(), index, value); return this; }

        /// {@return `sar_height` at the given index}
        /// @param index the index
        public @CType("uint16_t") short sar_heightAt(long index) { return StdVideoH265SequenceParameterSetVui.get_sar_height(this.segment(), index); }
        /// Sets `sar_height` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sar_heightAt(long index, @CType("uint16_t") short value) { StdVideoH265SequenceParameterSetVui.set_sar_height(this.segment(), index, value); return this; }

        /// {@return `video_format` at the given index}
        /// @param index the index
        public @CType("uint8_t") byte video_formatAt(long index) { return StdVideoH265SequenceParameterSetVui.get_video_format(this.segment(), index); }
        /// Sets `video_format` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer video_formatAt(long index, @CType("uint8_t") byte value) { StdVideoH265SequenceParameterSetVui.set_video_format(this.segment(), index, value); return this; }

        /// {@return `colour_primaries` at the given index}
        /// @param index the index
        public @CType("uint8_t") byte colour_primariesAt(long index) { return StdVideoH265SequenceParameterSetVui.get_colour_primaries(this.segment(), index); }
        /// Sets `colour_primaries` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer colour_primariesAt(long index, @CType("uint8_t") byte value) { StdVideoH265SequenceParameterSetVui.set_colour_primaries(this.segment(), index, value); return this; }

        /// {@return `transfer_characteristics` at the given index}
        /// @param index the index
        public @CType("uint8_t") byte transfer_characteristicsAt(long index) { return StdVideoH265SequenceParameterSetVui.get_transfer_characteristics(this.segment(), index); }
        /// Sets `transfer_characteristics` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer transfer_characteristicsAt(long index, @CType("uint8_t") byte value) { StdVideoH265SequenceParameterSetVui.set_transfer_characteristics(this.segment(), index, value); return this; }

        /// {@return `matrix_coeffs` at the given index}
        /// @param index the index
        public @CType("uint8_t") byte matrix_coeffsAt(long index) { return StdVideoH265SequenceParameterSetVui.get_matrix_coeffs(this.segment(), index); }
        /// Sets `matrix_coeffs` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer matrix_coeffsAt(long index, @CType("uint8_t") byte value) { StdVideoH265SequenceParameterSetVui.set_matrix_coeffs(this.segment(), index, value); return this; }

        /// {@return `chroma_sample_loc_type_top_field` at the given index}
        /// @param index the index
        public @CType("uint8_t") byte chroma_sample_loc_type_top_fieldAt(long index) { return StdVideoH265SequenceParameterSetVui.get_chroma_sample_loc_type_top_field(this.segment(), index); }
        /// Sets `chroma_sample_loc_type_top_field` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer chroma_sample_loc_type_top_fieldAt(long index, @CType("uint8_t") byte value) { StdVideoH265SequenceParameterSetVui.set_chroma_sample_loc_type_top_field(this.segment(), index, value); return this; }

        /// {@return `chroma_sample_loc_type_bottom_field` at the given index}
        /// @param index the index
        public @CType("uint8_t") byte chroma_sample_loc_type_bottom_fieldAt(long index) { return StdVideoH265SequenceParameterSetVui.get_chroma_sample_loc_type_bottom_field(this.segment(), index); }
        /// Sets `chroma_sample_loc_type_bottom_field` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer chroma_sample_loc_type_bottom_fieldAt(long index, @CType("uint8_t") byte value) { StdVideoH265SequenceParameterSetVui.set_chroma_sample_loc_type_bottom_field(this.segment(), index, value); return this; }

        /// {@return `reserved1` at the given index}
        /// @param index the index
        public @CType("uint8_t") byte reserved1At(long index) { return StdVideoH265SequenceParameterSetVui.get_reserved1(this.segment(), index); }
        /// Sets `reserved1` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer reserved1At(long index, @CType("uint8_t") byte value) { StdVideoH265SequenceParameterSetVui.set_reserved1(this.segment(), index, value); return this; }

        /// {@return `reserved2` at the given index}
        /// @param index the index
        public @CType("uint8_t") byte reserved2At(long index) { return StdVideoH265SequenceParameterSetVui.get_reserved2(this.segment(), index); }
        /// Sets `reserved2` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer reserved2At(long index, @CType("uint8_t") byte value) { StdVideoH265SequenceParameterSetVui.set_reserved2(this.segment(), index, value); return this; }

        /// {@return `def_disp_win_left_offset` at the given index}
        /// @param index the index
        public @CType("uint16_t") short def_disp_win_left_offsetAt(long index) { return StdVideoH265SequenceParameterSetVui.get_def_disp_win_left_offset(this.segment(), index); }
        /// Sets `def_disp_win_left_offset` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer def_disp_win_left_offsetAt(long index, @CType("uint16_t") short value) { StdVideoH265SequenceParameterSetVui.set_def_disp_win_left_offset(this.segment(), index, value); return this; }

        /// {@return `def_disp_win_right_offset` at the given index}
        /// @param index the index
        public @CType("uint16_t") short def_disp_win_right_offsetAt(long index) { return StdVideoH265SequenceParameterSetVui.get_def_disp_win_right_offset(this.segment(), index); }
        /// Sets `def_disp_win_right_offset` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer def_disp_win_right_offsetAt(long index, @CType("uint16_t") short value) { StdVideoH265SequenceParameterSetVui.set_def_disp_win_right_offset(this.segment(), index, value); return this; }

        /// {@return `def_disp_win_top_offset` at the given index}
        /// @param index the index
        public @CType("uint16_t") short def_disp_win_top_offsetAt(long index) { return StdVideoH265SequenceParameterSetVui.get_def_disp_win_top_offset(this.segment(), index); }
        /// Sets `def_disp_win_top_offset` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer def_disp_win_top_offsetAt(long index, @CType("uint16_t") short value) { StdVideoH265SequenceParameterSetVui.set_def_disp_win_top_offset(this.segment(), index, value); return this; }

        /// {@return `def_disp_win_bottom_offset` at the given index}
        /// @param index the index
        public @CType("uint16_t") short def_disp_win_bottom_offsetAt(long index) { return StdVideoH265SequenceParameterSetVui.get_def_disp_win_bottom_offset(this.segment(), index); }
        /// Sets `def_disp_win_bottom_offset` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer def_disp_win_bottom_offsetAt(long index, @CType("uint16_t") short value) { StdVideoH265SequenceParameterSetVui.set_def_disp_win_bottom_offset(this.segment(), index, value); return this; }

        /// {@return `vui_num_units_in_tick` at the given index}
        /// @param index the index
        public @CType("uint32_t") int vui_num_units_in_tickAt(long index) { return StdVideoH265SequenceParameterSetVui.get_vui_num_units_in_tick(this.segment(), index); }
        /// Sets `vui_num_units_in_tick` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer vui_num_units_in_tickAt(long index, @CType("uint32_t") int value) { StdVideoH265SequenceParameterSetVui.set_vui_num_units_in_tick(this.segment(), index, value); return this; }

        /// {@return `vui_time_scale` at the given index}
        /// @param index the index
        public @CType("uint32_t") int vui_time_scaleAt(long index) { return StdVideoH265SequenceParameterSetVui.get_vui_time_scale(this.segment(), index); }
        /// Sets `vui_time_scale` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer vui_time_scaleAt(long index, @CType("uint32_t") int value) { StdVideoH265SequenceParameterSetVui.set_vui_time_scale(this.segment(), index, value); return this; }

        /// {@return `vui_num_ticks_poc_diff_one_minus1` at the given index}
        /// @param index the index
        public @CType("uint32_t") int vui_num_ticks_poc_diff_one_minus1At(long index) { return StdVideoH265SequenceParameterSetVui.get_vui_num_ticks_poc_diff_one_minus1(this.segment(), index); }
        /// Sets `vui_num_ticks_poc_diff_one_minus1` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer vui_num_ticks_poc_diff_one_minus1At(long index, @CType("uint32_t") int value) { StdVideoH265SequenceParameterSetVui.set_vui_num_ticks_poc_diff_one_minus1(this.segment(), index, value); return this; }

        /// {@return `min_spatial_segmentation_idc` at the given index}
        /// @param index the index
        public @CType("uint16_t") short min_spatial_segmentation_idcAt(long index) { return StdVideoH265SequenceParameterSetVui.get_min_spatial_segmentation_idc(this.segment(), index); }
        /// Sets `min_spatial_segmentation_idc` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer min_spatial_segmentation_idcAt(long index, @CType("uint16_t") short value) { StdVideoH265SequenceParameterSetVui.set_min_spatial_segmentation_idc(this.segment(), index, value); return this; }

        /// {@return `reserved3` at the given index}
        /// @param index the index
        public @CType("uint16_t") short reserved3At(long index) { return StdVideoH265SequenceParameterSetVui.get_reserved3(this.segment(), index); }
        /// Sets `reserved3` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer reserved3At(long index, @CType("uint16_t") short value) { StdVideoH265SequenceParameterSetVui.set_reserved3(this.segment(), index, value); return this; }

        /// {@return `max_bytes_per_pic_denom` at the given index}
        /// @param index the index
        public @CType("uint8_t") byte max_bytes_per_pic_denomAt(long index) { return StdVideoH265SequenceParameterSetVui.get_max_bytes_per_pic_denom(this.segment(), index); }
        /// Sets `max_bytes_per_pic_denom` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer max_bytes_per_pic_denomAt(long index, @CType("uint8_t") byte value) { StdVideoH265SequenceParameterSetVui.set_max_bytes_per_pic_denom(this.segment(), index, value); return this; }

        /// {@return `max_bits_per_min_cu_denom` at the given index}
        /// @param index the index
        public @CType("uint8_t") byte max_bits_per_min_cu_denomAt(long index) { return StdVideoH265SequenceParameterSetVui.get_max_bits_per_min_cu_denom(this.segment(), index); }
        /// Sets `max_bits_per_min_cu_denom` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer max_bits_per_min_cu_denomAt(long index, @CType("uint8_t") byte value) { StdVideoH265SequenceParameterSetVui.set_max_bits_per_min_cu_denom(this.segment(), index, value); return this; }

        /// {@return `log2_max_mv_length_horizontal` at the given index}
        /// @param index the index
        public @CType("uint8_t") byte log2_max_mv_length_horizontalAt(long index) { return StdVideoH265SequenceParameterSetVui.get_log2_max_mv_length_horizontal(this.segment(), index); }
        /// Sets `log2_max_mv_length_horizontal` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer log2_max_mv_length_horizontalAt(long index, @CType("uint8_t") byte value) { StdVideoH265SequenceParameterSetVui.set_log2_max_mv_length_horizontal(this.segment(), index, value); return this; }

        /// {@return `log2_max_mv_length_vertical` at the given index}
        /// @param index the index
        public @CType("uint8_t") byte log2_max_mv_length_verticalAt(long index) { return StdVideoH265SequenceParameterSetVui.get_log2_max_mv_length_vertical(this.segment(), index); }
        /// Sets `log2_max_mv_length_vertical` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer log2_max_mv_length_verticalAt(long index, @CType("uint8_t") byte value) { StdVideoH265SequenceParameterSetVui.set_log2_max_mv_length_vertical(this.segment(), index, value); return this; }

        /// {@return `pHrdParameters` at the given index}
        /// @param index the index
        public @CType("const StdVideoH265HrdParameters *") MemorySegment pHrdParametersAt(long index) { return StdVideoH265SequenceParameterSetVui.get_pHrdParameters(this.segment(), index); }
        /// Sets `pHrdParameters` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pHrdParametersAt(long index, @CType("const StdVideoH265HrdParameters *") MemorySegment value) { StdVideoH265SequenceParameterSetVui.set_pHrdParameters(this.segment(), index, value); return this; }

    }
}
