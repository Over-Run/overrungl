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
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct StdVideoH265SequenceParameterSetVui {
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
///     const StdVideoH265HrdParameters* pHrdParameters;
/// };
/// ```
public sealed class StdVideoH265SequenceParameterSetVui extends GroupType {
    /// The struct layout of `StdVideoH265SequenceParameterSetVui`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        overrungl.vulkan.video.StdVideoH265SpsVuiFlags.LAYOUT.withName("flags"),
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
    /// The byte offset of `flags`.
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    /// The memory layout of `flags`.
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    /// The byte offset of `aspect_ratio_idc`.
    public static final long OFFSET_aspect_ratio_idc = LAYOUT.byteOffset(PathElement.groupElement("aspect_ratio_idc"));
    /// The memory layout of `aspect_ratio_idc`.
    public static final MemoryLayout LAYOUT_aspect_ratio_idc = LAYOUT.select(PathElement.groupElement("aspect_ratio_idc"));
    /// The [VarHandle] of `aspect_ratio_idc` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_aspect_ratio_idc = LAYOUT.arrayElementVarHandle(PathElement.groupElement("aspect_ratio_idc"));
    /// The byte offset of `sar_width`.
    public static final long OFFSET_sar_width = LAYOUT.byteOffset(PathElement.groupElement("sar_width"));
    /// The memory layout of `sar_width`.
    public static final MemoryLayout LAYOUT_sar_width = LAYOUT.select(PathElement.groupElement("sar_width"));
    /// The [VarHandle] of `sar_width` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_sar_width = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sar_width"));
    /// The byte offset of `sar_height`.
    public static final long OFFSET_sar_height = LAYOUT.byteOffset(PathElement.groupElement("sar_height"));
    /// The memory layout of `sar_height`.
    public static final MemoryLayout LAYOUT_sar_height = LAYOUT.select(PathElement.groupElement("sar_height"));
    /// The [VarHandle] of `sar_height` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_sar_height = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sar_height"));
    /// The byte offset of `video_format`.
    public static final long OFFSET_video_format = LAYOUT.byteOffset(PathElement.groupElement("video_format"));
    /// The memory layout of `video_format`.
    public static final MemoryLayout LAYOUT_video_format = LAYOUT.select(PathElement.groupElement("video_format"));
    /// The [VarHandle] of `video_format` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_video_format = LAYOUT.arrayElementVarHandle(PathElement.groupElement("video_format"));
    /// The byte offset of `colour_primaries`.
    public static final long OFFSET_colour_primaries = LAYOUT.byteOffset(PathElement.groupElement("colour_primaries"));
    /// The memory layout of `colour_primaries`.
    public static final MemoryLayout LAYOUT_colour_primaries = LAYOUT.select(PathElement.groupElement("colour_primaries"));
    /// The [VarHandle] of `colour_primaries` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_colour_primaries = LAYOUT.arrayElementVarHandle(PathElement.groupElement("colour_primaries"));
    /// The byte offset of `transfer_characteristics`.
    public static final long OFFSET_transfer_characteristics = LAYOUT.byteOffset(PathElement.groupElement("transfer_characteristics"));
    /// The memory layout of `transfer_characteristics`.
    public static final MemoryLayout LAYOUT_transfer_characteristics = LAYOUT.select(PathElement.groupElement("transfer_characteristics"));
    /// The [VarHandle] of `transfer_characteristics` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_transfer_characteristics = LAYOUT.arrayElementVarHandle(PathElement.groupElement("transfer_characteristics"));
    /// The byte offset of `matrix_coeffs`.
    public static final long OFFSET_matrix_coeffs = LAYOUT.byteOffset(PathElement.groupElement("matrix_coeffs"));
    /// The memory layout of `matrix_coeffs`.
    public static final MemoryLayout LAYOUT_matrix_coeffs = LAYOUT.select(PathElement.groupElement("matrix_coeffs"));
    /// The [VarHandle] of `matrix_coeffs` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_matrix_coeffs = LAYOUT.arrayElementVarHandle(PathElement.groupElement("matrix_coeffs"));
    /// The byte offset of `chroma_sample_loc_type_top_field`.
    public static final long OFFSET_chroma_sample_loc_type_top_field = LAYOUT.byteOffset(PathElement.groupElement("chroma_sample_loc_type_top_field"));
    /// The memory layout of `chroma_sample_loc_type_top_field`.
    public static final MemoryLayout LAYOUT_chroma_sample_loc_type_top_field = LAYOUT.select(PathElement.groupElement("chroma_sample_loc_type_top_field"));
    /// The [VarHandle] of `chroma_sample_loc_type_top_field` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_chroma_sample_loc_type_top_field = LAYOUT.arrayElementVarHandle(PathElement.groupElement("chroma_sample_loc_type_top_field"));
    /// The byte offset of `chroma_sample_loc_type_bottom_field`.
    public static final long OFFSET_chroma_sample_loc_type_bottom_field = LAYOUT.byteOffset(PathElement.groupElement("chroma_sample_loc_type_bottom_field"));
    /// The memory layout of `chroma_sample_loc_type_bottom_field`.
    public static final MemoryLayout LAYOUT_chroma_sample_loc_type_bottom_field = LAYOUT.select(PathElement.groupElement("chroma_sample_loc_type_bottom_field"));
    /// The [VarHandle] of `chroma_sample_loc_type_bottom_field` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_chroma_sample_loc_type_bottom_field = LAYOUT.arrayElementVarHandle(PathElement.groupElement("chroma_sample_loc_type_bottom_field"));
    /// The byte offset of `reserved1`.
    public static final long OFFSET_reserved1 = LAYOUT.byteOffset(PathElement.groupElement("reserved1"));
    /// The memory layout of `reserved1`.
    public static final MemoryLayout LAYOUT_reserved1 = LAYOUT.select(PathElement.groupElement("reserved1"));
    /// The [VarHandle] of `reserved1` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_reserved1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("reserved1"));
    /// The byte offset of `reserved2`.
    public static final long OFFSET_reserved2 = LAYOUT.byteOffset(PathElement.groupElement("reserved2"));
    /// The memory layout of `reserved2`.
    public static final MemoryLayout LAYOUT_reserved2 = LAYOUT.select(PathElement.groupElement("reserved2"));
    /// The [VarHandle] of `reserved2` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_reserved2 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("reserved2"));
    /// The byte offset of `def_disp_win_left_offset`.
    public static final long OFFSET_def_disp_win_left_offset = LAYOUT.byteOffset(PathElement.groupElement("def_disp_win_left_offset"));
    /// The memory layout of `def_disp_win_left_offset`.
    public static final MemoryLayout LAYOUT_def_disp_win_left_offset = LAYOUT.select(PathElement.groupElement("def_disp_win_left_offset"));
    /// The [VarHandle] of `def_disp_win_left_offset` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_def_disp_win_left_offset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("def_disp_win_left_offset"));
    /// The byte offset of `def_disp_win_right_offset`.
    public static final long OFFSET_def_disp_win_right_offset = LAYOUT.byteOffset(PathElement.groupElement("def_disp_win_right_offset"));
    /// The memory layout of `def_disp_win_right_offset`.
    public static final MemoryLayout LAYOUT_def_disp_win_right_offset = LAYOUT.select(PathElement.groupElement("def_disp_win_right_offset"));
    /// The [VarHandle] of `def_disp_win_right_offset` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_def_disp_win_right_offset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("def_disp_win_right_offset"));
    /// The byte offset of `def_disp_win_top_offset`.
    public static final long OFFSET_def_disp_win_top_offset = LAYOUT.byteOffset(PathElement.groupElement("def_disp_win_top_offset"));
    /// The memory layout of `def_disp_win_top_offset`.
    public static final MemoryLayout LAYOUT_def_disp_win_top_offset = LAYOUT.select(PathElement.groupElement("def_disp_win_top_offset"));
    /// The [VarHandle] of `def_disp_win_top_offset` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_def_disp_win_top_offset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("def_disp_win_top_offset"));
    /// The byte offset of `def_disp_win_bottom_offset`.
    public static final long OFFSET_def_disp_win_bottom_offset = LAYOUT.byteOffset(PathElement.groupElement("def_disp_win_bottom_offset"));
    /// The memory layout of `def_disp_win_bottom_offset`.
    public static final MemoryLayout LAYOUT_def_disp_win_bottom_offset = LAYOUT.select(PathElement.groupElement("def_disp_win_bottom_offset"));
    /// The [VarHandle] of `def_disp_win_bottom_offset` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_def_disp_win_bottom_offset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("def_disp_win_bottom_offset"));
    /// The byte offset of `vui_num_units_in_tick`.
    public static final long OFFSET_vui_num_units_in_tick = LAYOUT.byteOffset(PathElement.groupElement("vui_num_units_in_tick"));
    /// The memory layout of `vui_num_units_in_tick`.
    public static final MemoryLayout LAYOUT_vui_num_units_in_tick = LAYOUT.select(PathElement.groupElement("vui_num_units_in_tick"));
    /// The [VarHandle] of `vui_num_units_in_tick` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_vui_num_units_in_tick = LAYOUT.arrayElementVarHandle(PathElement.groupElement("vui_num_units_in_tick"));
    /// The byte offset of `vui_time_scale`.
    public static final long OFFSET_vui_time_scale = LAYOUT.byteOffset(PathElement.groupElement("vui_time_scale"));
    /// The memory layout of `vui_time_scale`.
    public static final MemoryLayout LAYOUT_vui_time_scale = LAYOUT.select(PathElement.groupElement("vui_time_scale"));
    /// The [VarHandle] of `vui_time_scale` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_vui_time_scale = LAYOUT.arrayElementVarHandle(PathElement.groupElement("vui_time_scale"));
    /// The byte offset of `vui_num_ticks_poc_diff_one_minus1`.
    public static final long OFFSET_vui_num_ticks_poc_diff_one_minus1 = LAYOUT.byteOffset(PathElement.groupElement("vui_num_ticks_poc_diff_one_minus1"));
    /// The memory layout of `vui_num_ticks_poc_diff_one_minus1`.
    public static final MemoryLayout LAYOUT_vui_num_ticks_poc_diff_one_minus1 = LAYOUT.select(PathElement.groupElement("vui_num_ticks_poc_diff_one_minus1"));
    /// The [VarHandle] of `vui_num_ticks_poc_diff_one_minus1` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_vui_num_ticks_poc_diff_one_minus1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("vui_num_ticks_poc_diff_one_minus1"));
    /// The byte offset of `min_spatial_segmentation_idc`.
    public static final long OFFSET_min_spatial_segmentation_idc = LAYOUT.byteOffset(PathElement.groupElement("min_spatial_segmentation_idc"));
    /// The memory layout of `min_spatial_segmentation_idc`.
    public static final MemoryLayout LAYOUT_min_spatial_segmentation_idc = LAYOUT.select(PathElement.groupElement("min_spatial_segmentation_idc"));
    /// The [VarHandle] of `min_spatial_segmentation_idc` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_min_spatial_segmentation_idc = LAYOUT.arrayElementVarHandle(PathElement.groupElement("min_spatial_segmentation_idc"));
    /// The byte offset of `reserved3`.
    public static final long OFFSET_reserved3 = LAYOUT.byteOffset(PathElement.groupElement("reserved3"));
    /// The memory layout of `reserved3`.
    public static final MemoryLayout LAYOUT_reserved3 = LAYOUT.select(PathElement.groupElement("reserved3"));
    /// The [VarHandle] of `reserved3` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_reserved3 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("reserved3"));
    /// The byte offset of `max_bytes_per_pic_denom`.
    public static final long OFFSET_max_bytes_per_pic_denom = LAYOUT.byteOffset(PathElement.groupElement("max_bytes_per_pic_denom"));
    /// The memory layout of `max_bytes_per_pic_denom`.
    public static final MemoryLayout LAYOUT_max_bytes_per_pic_denom = LAYOUT.select(PathElement.groupElement("max_bytes_per_pic_denom"));
    /// The [VarHandle] of `max_bytes_per_pic_denom` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_max_bytes_per_pic_denom = LAYOUT.arrayElementVarHandle(PathElement.groupElement("max_bytes_per_pic_denom"));
    /// The byte offset of `max_bits_per_min_cu_denom`.
    public static final long OFFSET_max_bits_per_min_cu_denom = LAYOUT.byteOffset(PathElement.groupElement("max_bits_per_min_cu_denom"));
    /// The memory layout of `max_bits_per_min_cu_denom`.
    public static final MemoryLayout LAYOUT_max_bits_per_min_cu_denom = LAYOUT.select(PathElement.groupElement("max_bits_per_min_cu_denom"));
    /// The [VarHandle] of `max_bits_per_min_cu_denom` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_max_bits_per_min_cu_denom = LAYOUT.arrayElementVarHandle(PathElement.groupElement("max_bits_per_min_cu_denom"));
    /// The byte offset of `log2_max_mv_length_horizontal`.
    public static final long OFFSET_log2_max_mv_length_horizontal = LAYOUT.byteOffset(PathElement.groupElement("log2_max_mv_length_horizontal"));
    /// The memory layout of `log2_max_mv_length_horizontal`.
    public static final MemoryLayout LAYOUT_log2_max_mv_length_horizontal = LAYOUT.select(PathElement.groupElement("log2_max_mv_length_horizontal"));
    /// The [VarHandle] of `log2_max_mv_length_horizontal` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_log2_max_mv_length_horizontal = LAYOUT.arrayElementVarHandle(PathElement.groupElement("log2_max_mv_length_horizontal"));
    /// The byte offset of `log2_max_mv_length_vertical`.
    public static final long OFFSET_log2_max_mv_length_vertical = LAYOUT.byteOffset(PathElement.groupElement("log2_max_mv_length_vertical"));
    /// The memory layout of `log2_max_mv_length_vertical`.
    public static final MemoryLayout LAYOUT_log2_max_mv_length_vertical = LAYOUT.select(PathElement.groupElement("log2_max_mv_length_vertical"));
    /// The [VarHandle] of `log2_max_mv_length_vertical` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_log2_max_mv_length_vertical = LAYOUT.arrayElementVarHandle(PathElement.groupElement("log2_max_mv_length_vertical"));
    /// The byte offset of `pHrdParameters`.
    public static final long OFFSET_pHrdParameters = LAYOUT.byteOffset(PathElement.groupElement("pHrdParameters"));
    /// The memory layout of `pHrdParameters`.
    public static final MemoryLayout LAYOUT_pHrdParameters = LAYOUT.select(PathElement.groupElement("pHrdParameters"));
    /// The [VarHandle] of `pHrdParameters` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pHrdParameters = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pHrdParameters"));

    /// Creates `StdVideoH265SequenceParameterSetVui` with the given segment.
    /// @param segment the memory segment
    public StdVideoH265SequenceParameterSetVui(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `StdVideoH265SequenceParameterSetVui` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `StdVideoH265SequenceParameterSetVui` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoH265SequenceParameterSetVui ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoH265SequenceParameterSetVui(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `StdVideoH265SequenceParameterSetVui` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `StdVideoH265SequenceParameterSetVui` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoH265SequenceParameterSetVui`
    public static StdVideoH265SequenceParameterSetVui alloc(SegmentAllocator allocator) { return new StdVideoH265SequenceParameterSetVui(allocator.allocate(LAYOUT)); }

    /// Allocates a `StdVideoH265SequenceParameterSetVui` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `StdVideoH265SequenceParameterSetVui`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public StdVideoH265SequenceParameterSetVui copyFrom(StdVideoH265SequenceParameterSetVui src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { if (this instanceof Buffer buf) return buf; else return new Buffer(this.segment(), this.estimateCount()); }

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
    public StdVideoH265SequenceParameterSetVui flags(MemorySegment value) { flags(this.segment(), 0L, value); return this; }

    /// {@return `aspect_ratio_idc` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int aspect_ratio_idc(MemorySegment segment, long index) { return (int) VH_aspect_ratio_idc.get(segment, 0L, index); }
    /// {@return `aspect_ratio_idc`}
    public int aspect_ratio_idc() { return aspect_ratio_idc(this.segment(), 0L); }
    /// Sets `aspect_ratio_idc` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void aspect_ratio_idc(MemorySegment segment, long index, int value) { VH_aspect_ratio_idc.set(segment, 0L, index, value); }
    /// Sets `aspect_ratio_idc` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265SequenceParameterSetVui aspect_ratio_idc(int value) { aspect_ratio_idc(this.segment(), 0L, value); return this; }

    /// {@return `sar_width` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static short sar_width(MemorySegment segment, long index) { return (short) VH_sar_width.get(segment, 0L, index); }
    /// {@return `sar_width`}
    public short sar_width() { return sar_width(this.segment(), 0L); }
    /// Sets `sar_width` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void sar_width(MemorySegment segment, long index, short value) { VH_sar_width.set(segment, 0L, index, value); }
    /// Sets `sar_width` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265SequenceParameterSetVui sar_width(short value) { sar_width(this.segment(), 0L, value); return this; }

    /// {@return `sar_height` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static short sar_height(MemorySegment segment, long index) { return (short) VH_sar_height.get(segment, 0L, index); }
    /// {@return `sar_height`}
    public short sar_height() { return sar_height(this.segment(), 0L); }
    /// Sets `sar_height` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void sar_height(MemorySegment segment, long index, short value) { VH_sar_height.set(segment, 0L, index, value); }
    /// Sets `sar_height` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265SequenceParameterSetVui sar_height(short value) { sar_height(this.segment(), 0L, value); return this; }

    /// {@return `video_format` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte video_format(MemorySegment segment, long index) { return (byte) VH_video_format.get(segment, 0L, index); }
    /// {@return `video_format`}
    public byte video_format() { return video_format(this.segment(), 0L); }
    /// Sets `video_format` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void video_format(MemorySegment segment, long index, byte value) { VH_video_format.set(segment, 0L, index, value); }
    /// Sets `video_format` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265SequenceParameterSetVui video_format(byte value) { video_format(this.segment(), 0L, value); return this; }

    /// {@return `colour_primaries` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte colour_primaries(MemorySegment segment, long index) { return (byte) VH_colour_primaries.get(segment, 0L, index); }
    /// {@return `colour_primaries`}
    public byte colour_primaries() { return colour_primaries(this.segment(), 0L); }
    /// Sets `colour_primaries` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void colour_primaries(MemorySegment segment, long index, byte value) { VH_colour_primaries.set(segment, 0L, index, value); }
    /// Sets `colour_primaries` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265SequenceParameterSetVui colour_primaries(byte value) { colour_primaries(this.segment(), 0L, value); return this; }

    /// {@return `transfer_characteristics` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte transfer_characteristics(MemorySegment segment, long index) { return (byte) VH_transfer_characteristics.get(segment, 0L, index); }
    /// {@return `transfer_characteristics`}
    public byte transfer_characteristics() { return transfer_characteristics(this.segment(), 0L); }
    /// Sets `transfer_characteristics` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void transfer_characteristics(MemorySegment segment, long index, byte value) { VH_transfer_characteristics.set(segment, 0L, index, value); }
    /// Sets `transfer_characteristics` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265SequenceParameterSetVui transfer_characteristics(byte value) { transfer_characteristics(this.segment(), 0L, value); return this; }

    /// {@return `matrix_coeffs` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte matrix_coeffs(MemorySegment segment, long index) { return (byte) VH_matrix_coeffs.get(segment, 0L, index); }
    /// {@return `matrix_coeffs`}
    public byte matrix_coeffs() { return matrix_coeffs(this.segment(), 0L); }
    /// Sets `matrix_coeffs` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void matrix_coeffs(MemorySegment segment, long index, byte value) { VH_matrix_coeffs.set(segment, 0L, index, value); }
    /// Sets `matrix_coeffs` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265SequenceParameterSetVui matrix_coeffs(byte value) { matrix_coeffs(this.segment(), 0L, value); return this; }

    /// {@return `chroma_sample_loc_type_top_field` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte chroma_sample_loc_type_top_field(MemorySegment segment, long index) { return (byte) VH_chroma_sample_loc_type_top_field.get(segment, 0L, index); }
    /// {@return `chroma_sample_loc_type_top_field`}
    public byte chroma_sample_loc_type_top_field() { return chroma_sample_loc_type_top_field(this.segment(), 0L); }
    /// Sets `chroma_sample_loc_type_top_field` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void chroma_sample_loc_type_top_field(MemorySegment segment, long index, byte value) { VH_chroma_sample_loc_type_top_field.set(segment, 0L, index, value); }
    /// Sets `chroma_sample_loc_type_top_field` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265SequenceParameterSetVui chroma_sample_loc_type_top_field(byte value) { chroma_sample_loc_type_top_field(this.segment(), 0L, value); return this; }

    /// {@return `chroma_sample_loc_type_bottom_field` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte chroma_sample_loc_type_bottom_field(MemorySegment segment, long index) { return (byte) VH_chroma_sample_loc_type_bottom_field.get(segment, 0L, index); }
    /// {@return `chroma_sample_loc_type_bottom_field`}
    public byte chroma_sample_loc_type_bottom_field() { return chroma_sample_loc_type_bottom_field(this.segment(), 0L); }
    /// Sets `chroma_sample_loc_type_bottom_field` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void chroma_sample_loc_type_bottom_field(MemorySegment segment, long index, byte value) { VH_chroma_sample_loc_type_bottom_field.set(segment, 0L, index, value); }
    /// Sets `chroma_sample_loc_type_bottom_field` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265SequenceParameterSetVui chroma_sample_loc_type_bottom_field(byte value) { chroma_sample_loc_type_bottom_field(this.segment(), 0L, value); return this; }

    /// {@return `reserved1` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte reserved1(MemorySegment segment, long index) { return (byte) VH_reserved1.get(segment, 0L, index); }
    /// {@return `reserved1`}
    public byte reserved1() { return reserved1(this.segment(), 0L); }
    /// Sets `reserved1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void reserved1(MemorySegment segment, long index, byte value) { VH_reserved1.set(segment, 0L, index, value); }
    /// Sets `reserved1` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265SequenceParameterSetVui reserved1(byte value) { reserved1(this.segment(), 0L, value); return this; }

    /// {@return `reserved2` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte reserved2(MemorySegment segment, long index) { return (byte) VH_reserved2.get(segment, 0L, index); }
    /// {@return `reserved2`}
    public byte reserved2() { return reserved2(this.segment(), 0L); }
    /// Sets `reserved2` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void reserved2(MemorySegment segment, long index, byte value) { VH_reserved2.set(segment, 0L, index, value); }
    /// Sets `reserved2` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265SequenceParameterSetVui reserved2(byte value) { reserved2(this.segment(), 0L, value); return this; }

    /// {@return `def_disp_win_left_offset` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static short def_disp_win_left_offset(MemorySegment segment, long index) { return (short) VH_def_disp_win_left_offset.get(segment, 0L, index); }
    /// {@return `def_disp_win_left_offset`}
    public short def_disp_win_left_offset() { return def_disp_win_left_offset(this.segment(), 0L); }
    /// Sets `def_disp_win_left_offset` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void def_disp_win_left_offset(MemorySegment segment, long index, short value) { VH_def_disp_win_left_offset.set(segment, 0L, index, value); }
    /// Sets `def_disp_win_left_offset` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265SequenceParameterSetVui def_disp_win_left_offset(short value) { def_disp_win_left_offset(this.segment(), 0L, value); return this; }

    /// {@return `def_disp_win_right_offset` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static short def_disp_win_right_offset(MemorySegment segment, long index) { return (short) VH_def_disp_win_right_offset.get(segment, 0L, index); }
    /// {@return `def_disp_win_right_offset`}
    public short def_disp_win_right_offset() { return def_disp_win_right_offset(this.segment(), 0L); }
    /// Sets `def_disp_win_right_offset` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void def_disp_win_right_offset(MemorySegment segment, long index, short value) { VH_def_disp_win_right_offset.set(segment, 0L, index, value); }
    /// Sets `def_disp_win_right_offset` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265SequenceParameterSetVui def_disp_win_right_offset(short value) { def_disp_win_right_offset(this.segment(), 0L, value); return this; }

    /// {@return `def_disp_win_top_offset` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static short def_disp_win_top_offset(MemorySegment segment, long index) { return (short) VH_def_disp_win_top_offset.get(segment, 0L, index); }
    /// {@return `def_disp_win_top_offset`}
    public short def_disp_win_top_offset() { return def_disp_win_top_offset(this.segment(), 0L); }
    /// Sets `def_disp_win_top_offset` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void def_disp_win_top_offset(MemorySegment segment, long index, short value) { VH_def_disp_win_top_offset.set(segment, 0L, index, value); }
    /// Sets `def_disp_win_top_offset` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265SequenceParameterSetVui def_disp_win_top_offset(short value) { def_disp_win_top_offset(this.segment(), 0L, value); return this; }

    /// {@return `def_disp_win_bottom_offset` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static short def_disp_win_bottom_offset(MemorySegment segment, long index) { return (short) VH_def_disp_win_bottom_offset.get(segment, 0L, index); }
    /// {@return `def_disp_win_bottom_offset`}
    public short def_disp_win_bottom_offset() { return def_disp_win_bottom_offset(this.segment(), 0L); }
    /// Sets `def_disp_win_bottom_offset` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void def_disp_win_bottom_offset(MemorySegment segment, long index, short value) { VH_def_disp_win_bottom_offset.set(segment, 0L, index, value); }
    /// Sets `def_disp_win_bottom_offset` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265SequenceParameterSetVui def_disp_win_bottom_offset(short value) { def_disp_win_bottom_offset(this.segment(), 0L, value); return this; }

    /// {@return `vui_num_units_in_tick` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int vui_num_units_in_tick(MemorySegment segment, long index) { return (int) VH_vui_num_units_in_tick.get(segment, 0L, index); }
    /// {@return `vui_num_units_in_tick`}
    public int vui_num_units_in_tick() { return vui_num_units_in_tick(this.segment(), 0L); }
    /// Sets `vui_num_units_in_tick` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void vui_num_units_in_tick(MemorySegment segment, long index, int value) { VH_vui_num_units_in_tick.set(segment, 0L, index, value); }
    /// Sets `vui_num_units_in_tick` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265SequenceParameterSetVui vui_num_units_in_tick(int value) { vui_num_units_in_tick(this.segment(), 0L, value); return this; }

    /// {@return `vui_time_scale` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int vui_time_scale(MemorySegment segment, long index) { return (int) VH_vui_time_scale.get(segment, 0L, index); }
    /// {@return `vui_time_scale`}
    public int vui_time_scale() { return vui_time_scale(this.segment(), 0L); }
    /// Sets `vui_time_scale` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void vui_time_scale(MemorySegment segment, long index, int value) { VH_vui_time_scale.set(segment, 0L, index, value); }
    /// Sets `vui_time_scale` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265SequenceParameterSetVui vui_time_scale(int value) { vui_time_scale(this.segment(), 0L, value); return this; }

    /// {@return `vui_num_ticks_poc_diff_one_minus1` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int vui_num_ticks_poc_diff_one_minus1(MemorySegment segment, long index) { return (int) VH_vui_num_ticks_poc_diff_one_minus1.get(segment, 0L, index); }
    /// {@return `vui_num_ticks_poc_diff_one_minus1`}
    public int vui_num_ticks_poc_diff_one_minus1() { return vui_num_ticks_poc_diff_one_minus1(this.segment(), 0L); }
    /// Sets `vui_num_ticks_poc_diff_one_minus1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void vui_num_ticks_poc_diff_one_minus1(MemorySegment segment, long index, int value) { VH_vui_num_ticks_poc_diff_one_minus1.set(segment, 0L, index, value); }
    /// Sets `vui_num_ticks_poc_diff_one_minus1` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265SequenceParameterSetVui vui_num_ticks_poc_diff_one_minus1(int value) { vui_num_ticks_poc_diff_one_minus1(this.segment(), 0L, value); return this; }

    /// {@return `min_spatial_segmentation_idc` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static short min_spatial_segmentation_idc(MemorySegment segment, long index) { return (short) VH_min_spatial_segmentation_idc.get(segment, 0L, index); }
    /// {@return `min_spatial_segmentation_idc`}
    public short min_spatial_segmentation_idc() { return min_spatial_segmentation_idc(this.segment(), 0L); }
    /// Sets `min_spatial_segmentation_idc` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void min_spatial_segmentation_idc(MemorySegment segment, long index, short value) { VH_min_spatial_segmentation_idc.set(segment, 0L, index, value); }
    /// Sets `min_spatial_segmentation_idc` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265SequenceParameterSetVui min_spatial_segmentation_idc(short value) { min_spatial_segmentation_idc(this.segment(), 0L, value); return this; }

    /// {@return `reserved3` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static short reserved3(MemorySegment segment, long index) { return (short) VH_reserved3.get(segment, 0L, index); }
    /// {@return `reserved3`}
    public short reserved3() { return reserved3(this.segment(), 0L); }
    /// Sets `reserved3` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void reserved3(MemorySegment segment, long index, short value) { VH_reserved3.set(segment, 0L, index, value); }
    /// Sets `reserved3` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265SequenceParameterSetVui reserved3(short value) { reserved3(this.segment(), 0L, value); return this; }

    /// {@return `max_bytes_per_pic_denom` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte max_bytes_per_pic_denom(MemorySegment segment, long index) { return (byte) VH_max_bytes_per_pic_denom.get(segment, 0L, index); }
    /// {@return `max_bytes_per_pic_denom`}
    public byte max_bytes_per_pic_denom() { return max_bytes_per_pic_denom(this.segment(), 0L); }
    /// Sets `max_bytes_per_pic_denom` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void max_bytes_per_pic_denom(MemorySegment segment, long index, byte value) { VH_max_bytes_per_pic_denom.set(segment, 0L, index, value); }
    /// Sets `max_bytes_per_pic_denom` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265SequenceParameterSetVui max_bytes_per_pic_denom(byte value) { max_bytes_per_pic_denom(this.segment(), 0L, value); return this; }

    /// {@return `max_bits_per_min_cu_denom` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte max_bits_per_min_cu_denom(MemorySegment segment, long index) { return (byte) VH_max_bits_per_min_cu_denom.get(segment, 0L, index); }
    /// {@return `max_bits_per_min_cu_denom`}
    public byte max_bits_per_min_cu_denom() { return max_bits_per_min_cu_denom(this.segment(), 0L); }
    /// Sets `max_bits_per_min_cu_denom` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void max_bits_per_min_cu_denom(MemorySegment segment, long index, byte value) { VH_max_bits_per_min_cu_denom.set(segment, 0L, index, value); }
    /// Sets `max_bits_per_min_cu_denom` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265SequenceParameterSetVui max_bits_per_min_cu_denom(byte value) { max_bits_per_min_cu_denom(this.segment(), 0L, value); return this; }

    /// {@return `log2_max_mv_length_horizontal` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte log2_max_mv_length_horizontal(MemorySegment segment, long index) { return (byte) VH_log2_max_mv_length_horizontal.get(segment, 0L, index); }
    /// {@return `log2_max_mv_length_horizontal`}
    public byte log2_max_mv_length_horizontal() { return log2_max_mv_length_horizontal(this.segment(), 0L); }
    /// Sets `log2_max_mv_length_horizontal` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void log2_max_mv_length_horizontal(MemorySegment segment, long index, byte value) { VH_log2_max_mv_length_horizontal.set(segment, 0L, index, value); }
    /// Sets `log2_max_mv_length_horizontal` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265SequenceParameterSetVui log2_max_mv_length_horizontal(byte value) { log2_max_mv_length_horizontal(this.segment(), 0L, value); return this; }

    /// {@return `log2_max_mv_length_vertical` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte log2_max_mv_length_vertical(MemorySegment segment, long index) { return (byte) VH_log2_max_mv_length_vertical.get(segment, 0L, index); }
    /// {@return `log2_max_mv_length_vertical`}
    public byte log2_max_mv_length_vertical() { return log2_max_mv_length_vertical(this.segment(), 0L); }
    /// Sets `log2_max_mv_length_vertical` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void log2_max_mv_length_vertical(MemorySegment segment, long index, byte value) { VH_log2_max_mv_length_vertical.set(segment, 0L, index, value); }
    /// Sets `log2_max_mv_length_vertical` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265SequenceParameterSetVui log2_max_mv_length_vertical(byte value) { log2_max_mv_length_vertical(this.segment(), 0L, value); return this; }

    /// {@return `pHrdParameters` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pHrdParameters(MemorySegment segment, long index) { return (MemorySegment) VH_pHrdParameters.get(segment, 0L, index); }
    /// {@return `pHrdParameters`}
    public MemorySegment pHrdParameters() { return pHrdParameters(this.segment(), 0L); }
    /// Sets `pHrdParameters` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pHrdParameters(MemorySegment segment, long index, MemorySegment value) { VH_pHrdParameters.set(segment, 0L, index, value); }
    /// Sets `pHrdParameters` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265SequenceParameterSetVui pHrdParameters(MemorySegment value) { pHrdParameters(this.segment(), 0L, value); return this; }

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
        /// @param index the index of the struct buffer
        public MemorySegment flagsAt(long index) { return flags(this.segment(), index); }
        /// Sets `flags` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer flagsAt(long index, MemorySegment value) { flags(this.segment(), index, value); return this; }

        /// {@return `aspect_ratio_idc` at the given index}
        /// @param index the index of the struct buffer
        public int aspect_ratio_idcAt(long index) { return aspect_ratio_idc(this.segment(), index); }
        /// Sets `aspect_ratio_idc` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer aspect_ratio_idcAt(long index, int value) { aspect_ratio_idc(this.segment(), index, value); return this; }

        /// {@return `sar_width` at the given index}
        /// @param index the index of the struct buffer
        public short sar_widthAt(long index) { return sar_width(this.segment(), index); }
        /// Sets `sar_width` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer sar_widthAt(long index, short value) { sar_width(this.segment(), index, value); return this; }

        /// {@return `sar_height` at the given index}
        /// @param index the index of the struct buffer
        public short sar_heightAt(long index) { return sar_height(this.segment(), index); }
        /// Sets `sar_height` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer sar_heightAt(long index, short value) { sar_height(this.segment(), index, value); return this; }

        /// {@return `video_format` at the given index}
        /// @param index the index of the struct buffer
        public byte video_formatAt(long index) { return video_format(this.segment(), index); }
        /// Sets `video_format` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer video_formatAt(long index, byte value) { video_format(this.segment(), index, value); return this; }

        /// {@return `colour_primaries` at the given index}
        /// @param index the index of the struct buffer
        public byte colour_primariesAt(long index) { return colour_primaries(this.segment(), index); }
        /// Sets `colour_primaries` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer colour_primariesAt(long index, byte value) { colour_primaries(this.segment(), index, value); return this; }

        /// {@return `transfer_characteristics` at the given index}
        /// @param index the index of the struct buffer
        public byte transfer_characteristicsAt(long index) { return transfer_characteristics(this.segment(), index); }
        /// Sets `transfer_characteristics` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer transfer_characteristicsAt(long index, byte value) { transfer_characteristics(this.segment(), index, value); return this; }

        /// {@return `matrix_coeffs` at the given index}
        /// @param index the index of the struct buffer
        public byte matrix_coeffsAt(long index) { return matrix_coeffs(this.segment(), index); }
        /// Sets `matrix_coeffs` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer matrix_coeffsAt(long index, byte value) { matrix_coeffs(this.segment(), index, value); return this; }

        /// {@return `chroma_sample_loc_type_top_field` at the given index}
        /// @param index the index of the struct buffer
        public byte chroma_sample_loc_type_top_fieldAt(long index) { return chroma_sample_loc_type_top_field(this.segment(), index); }
        /// Sets `chroma_sample_loc_type_top_field` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer chroma_sample_loc_type_top_fieldAt(long index, byte value) { chroma_sample_loc_type_top_field(this.segment(), index, value); return this; }

        /// {@return `chroma_sample_loc_type_bottom_field` at the given index}
        /// @param index the index of the struct buffer
        public byte chroma_sample_loc_type_bottom_fieldAt(long index) { return chroma_sample_loc_type_bottom_field(this.segment(), index); }
        /// Sets `chroma_sample_loc_type_bottom_field` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer chroma_sample_loc_type_bottom_fieldAt(long index, byte value) { chroma_sample_loc_type_bottom_field(this.segment(), index, value); return this; }

        /// {@return `reserved1` at the given index}
        /// @param index the index of the struct buffer
        public byte reserved1At(long index) { return reserved1(this.segment(), index); }
        /// Sets `reserved1` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer reserved1At(long index, byte value) { reserved1(this.segment(), index, value); return this; }

        /// {@return `reserved2` at the given index}
        /// @param index the index of the struct buffer
        public byte reserved2At(long index) { return reserved2(this.segment(), index); }
        /// Sets `reserved2` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer reserved2At(long index, byte value) { reserved2(this.segment(), index, value); return this; }

        /// {@return `def_disp_win_left_offset` at the given index}
        /// @param index the index of the struct buffer
        public short def_disp_win_left_offsetAt(long index) { return def_disp_win_left_offset(this.segment(), index); }
        /// Sets `def_disp_win_left_offset` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer def_disp_win_left_offsetAt(long index, short value) { def_disp_win_left_offset(this.segment(), index, value); return this; }

        /// {@return `def_disp_win_right_offset` at the given index}
        /// @param index the index of the struct buffer
        public short def_disp_win_right_offsetAt(long index) { return def_disp_win_right_offset(this.segment(), index); }
        /// Sets `def_disp_win_right_offset` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer def_disp_win_right_offsetAt(long index, short value) { def_disp_win_right_offset(this.segment(), index, value); return this; }

        /// {@return `def_disp_win_top_offset` at the given index}
        /// @param index the index of the struct buffer
        public short def_disp_win_top_offsetAt(long index) { return def_disp_win_top_offset(this.segment(), index); }
        /// Sets `def_disp_win_top_offset` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer def_disp_win_top_offsetAt(long index, short value) { def_disp_win_top_offset(this.segment(), index, value); return this; }

        /// {@return `def_disp_win_bottom_offset` at the given index}
        /// @param index the index of the struct buffer
        public short def_disp_win_bottom_offsetAt(long index) { return def_disp_win_bottom_offset(this.segment(), index); }
        /// Sets `def_disp_win_bottom_offset` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer def_disp_win_bottom_offsetAt(long index, short value) { def_disp_win_bottom_offset(this.segment(), index, value); return this; }

        /// {@return `vui_num_units_in_tick` at the given index}
        /// @param index the index of the struct buffer
        public int vui_num_units_in_tickAt(long index) { return vui_num_units_in_tick(this.segment(), index); }
        /// Sets `vui_num_units_in_tick` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer vui_num_units_in_tickAt(long index, int value) { vui_num_units_in_tick(this.segment(), index, value); return this; }

        /// {@return `vui_time_scale` at the given index}
        /// @param index the index of the struct buffer
        public int vui_time_scaleAt(long index) { return vui_time_scale(this.segment(), index); }
        /// Sets `vui_time_scale` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer vui_time_scaleAt(long index, int value) { vui_time_scale(this.segment(), index, value); return this; }

        /// {@return `vui_num_ticks_poc_diff_one_minus1` at the given index}
        /// @param index the index of the struct buffer
        public int vui_num_ticks_poc_diff_one_minus1At(long index) { return vui_num_ticks_poc_diff_one_minus1(this.segment(), index); }
        /// Sets `vui_num_ticks_poc_diff_one_minus1` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer vui_num_ticks_poc_diff_one_minus1At(long index, int value) { vui_num_ticks_poc_diff_one_minus1(this.segment(), index, value); return this; }

        /// {@return `min_spatial_segmentation_idc` at the given index}
        /// @param index the index of the struct buffer
        public short min_spatial_segmentation_idcAt(long index) { return min_spatial_segmentation_idc(this.segment(), index); }
        /// Sets `min_spatial_segmentation_idc` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer min_spatial_segmentation_idcAt(long index, short value) { min_spatial_segmentation_idc(this.segment(), index, value); return this; }

        /// {@return `reserved3` at the given index}
        /// @param index the index of the struct buffer
        public short reserved3At(long index) { return reserved3(this.segment(), index); }
        /// Sets `reserved3` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer reserved3At(long index, short value) { reserved3(this.segment(), index, value); return this; }

        /// {@return `max_bytes_per_pic_denom` at the given index}
        /// @param index the index of the struct buffer
        public byte max_bytes_per_pic_denomAt(long index) { return max_bytes_per_pic_denom(this.segment(), index); }
        /// Sets `max_bytes_per_pic_denom` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer max_bytes_per_pic_denomAt(long index, byte value) { max_bytes_per_pic_denom(this.segment(), index, value); return this; }

        /// {@return `max_bits_per_min_cu_denom` at the given index}
        /// @param index the index of the struct buffer
        public byte max_bits_per_min_cu_denomAt(long index) { return max_bits_per_min_cu_denom(this.segment(), index); }
        /// Sets `max_bits_per_min_cu_denom` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer max_bits_per_min_cu_denomAt(long index, byte value) { max_bits_per_min_cu_denom(this.segment(), index, value); return this; }

        /// {@return `log2_max_mv_length_horizontal` at the given index}
        /// @param index the index of the struct buffer
        public byte log2_max_mv_length_horizontalAt(long index) { return log2_max_mv_length_horizontal(this.segment(), index); }
        /// Sets `log2_max_mv_length_horizontal` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer log2_max_mv_length_horizontalAt(long index, byte value) { log2_max_mv_length_horizontal(this.segment(), index, value); return this; }

        /// {@return `log2_max_mv_length_vertical` at the given index}
        /// @param index the index of the struct buffer
        public byte log2_max_mv_length_verticalAt(long index) { return log2_max_mv_length_vertical(this.segment(), index); }
        /// Sets `log2_max_mv_length_vertical` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer log2_max_mv_length_verticalAt(long index, byte value) { log2_max_mv_length_vertical(this.segment(), index, value); return this; }

        /// {@return `pHrdParameters` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment pHrdParametersAt(long index) { return pHrdParameters(this.segment(), index); }
        /// Sets `pHrdParameters` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer pHrdParametersAt(long index, MemorySegment value) { pHrdParameters(this.segment(), index, value); return this; }

    }
}
