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
/// ### matrix_coefficients
/// [VarHandle][#VH_matrix_coefficients] - [Getter][#matrix_coefficients()] - [Setter][#matrix_coefficients(byte)]
/// ### num_units_in_tick
/// [VarHandle][#VH_num_units_in_tick] - [Getter][#num_units_in_tick()] - [Setter][#num_units_in_tick(int)]
/// ### time_scale
/// [VarHandle][#VH_time_scale] - [Getter][#time_scale()] - [Setter][#time_scale(int)]
/// ### max_num_reorder_frames
/// [VarHandle][#VH_max_num_reorder_frames] - [Getter][#max_num_reorder_frames()] - [Setter][#max_num_reorder_frames(byte)]
/// ### max_dec_frame_buffering
/// [VarHandle][#VH_max_dec_frame_buffering] - [Getter][#max_dec_frame_buffering()] - [Setter][#max_dec_frame_buffering(byte)]
/// ### chroma_sample_loc_type_top_field
/// [VarHandle][#VH_chroma_sample_loc_type_top_field] - [Getter][#chroma_sample_loc_type_top_field()] - [Setter][#chroma_sample_loc_type_top_field(byte)]
/// ### chroma_sample_loc_type_bottom_field
/// [VarHandle][#VH_chroma_sample_loc_type_bottom_field] - [Getter][#chroma_sample_loc_type_bottom_field()] - [Setter][#chroma_sample_loc_type_bottom_field(byte)]
/// ### reserved1
/// [VarHandle][#VH_reserved1] - [Getter][#reserved1()] - [Setter][#reserved1(int)]
/// ### pHrdParameters
/// [VarHandle][#VH_pHrdParameters] - [Getter][#pHrdParameters()] - [Setter][#pHrdParameters(MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct StdVideoH264SequenceParameterSetVui {
///     StdVideoH264SpsVuiFlags flags;
///     StdVideoH264AspectRatioIdc aspect_ratio_idc;
///     uint16_t sar_width;
///     uint16_t sar_height;
///     uint8_t video_format;
///     uint8_t colour_primaries;
///     uint8_t transfer_characteristics;
///     uint8_t matrix_coefficients;
///     uint32_t num_units_in_tick;
///     uint32_t time_scale;
///     uint8_t max_num_reorder_frames;
///     uint8_t max_dec_frame_buffering;
///     uint8_t chroma_sample_loc_type_top_field;
///     uint8_t chroma_sample_loc_type_bottom_field;
///     uint32_t reserved1;
///     const StdVideoH264HrdParameters * pHrdParameters;
/// } StdVideoH264SequenceParameterSetVui;
/// ```
public sealed class StdVideoH264SequenceParameterSetVui extends Struct {
    /// The struct layout of `StdVideoH264SequenceParameterSetVui`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        StdVideoH264SpsVuiFlags.LAYOUT.withName("flags"),
        ValueLayout.JAVA_INT.withName("aspect_ratio_idc"),
        ValueLayout.JAVA_SHORT.withName("sar_width"),
        ValueLayout.JAVA_SHORT.withName("sar_height"),
        ValueLayout.JAVA_BYTE.withName("video_format"),
        ValueLayout.JAVA_BYTE.withName("colour_primaries"),
        ValueLayout.JAVA_BYTE.withName("transfer_characteristics"),
        ValueLayout.JAVA_BYTE.withName("matrix_coefficients"),
        ValueLayout.JAVA_INT.withName("num_units_in_tick"),
        ValueLayout.JAVA_INT.withName("time_scale"),
        ValueLayout.JAVA_BYTE.withName("max_num_reorder_frames"),
        ValueLayout.JAVA_BYTE.withName("max_dec_frame_buffering"),
        ValueLayout.JAVA_BYTE.withName("chroma_sample_loc_type_top_field"),
        ValueLayout.JAVA_BYTE.withName("chroma_sample_loc_type_bottom_field"),
        ValueLayout.JAVA_INT.withName("reserved1"),
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
    /// The [VarHandle] of `matrix_coefficients` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_matrix_coefficients = LAYOUT.arrayElementVarHandle(PathElement.groupElement("matrix_coefficients"));
    /// The [VarHandle] of `num_units_in_tick` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_num_units_in_tick = LAYOUT.arrayElementVarHandle(PathElement.groupElement("num_units_in_tick"));
    /// The [VarHandle] of `time_scale` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_time_scale = LAYOUT.arrayElementVarHandle(PathElement.groupElement("time_scale"));
    /// The [VarHandle] of `max_num_reorder_frames` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_max_num_reorder_frames = LAYOUT.arrayElementVarHandle(PathElement.groupElement("max_num_reorder_frames"));
    /// The [VarHandle] of `max_dec_frame_buffering` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_max_dec_frame_buffering = LAYOUT.arrayElementVarHandle(PathElement.groupElement("max_dec_frame_buffering"));
    /// The [VarHandle] of `chroma_sample_loc_type_top_field` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_chroma_sample_loc_type_top_field = LAYOUT.arrayElementVarHandle(PathElement.groupElement("chroma_sample_loc_type_top_field"));
    /// The [VarHandle] of `chroma_sample_loc_type_bottom_field` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_chroma_sample_loc_type_bottom_field = LAYOUT.arrayElementVarHandle(PathElement.groupElement("chroma_sample_loc_type_bottom_field"));
    /// The [VarHandle] of `reserved1` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_reserved1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("reserved1"));
    /// The [VarHandle] of `pHrdParameters` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pHrdParameters = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pHrdParameters"));

    /// Creates `StdVideoH264SequenceParameterSetVui` with the given segment.
    /// @param segment the memory segment
    public StdVideoH264SequenceParameterSetVui(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `StdVideoH264SequenceParameterSetVui` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoH264SequenceParameterSetVui of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new StdVideoH264SequenceParameterSetVui(segment); }

    /// Creates `StdVideoH264SequenceParameterSetVui` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `StdVideoH264SequenceParameterSetVui` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoH264SequenceParameterSetVui ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new StdVideoH264SequenceParameterSetVui(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `StdVideoH264SequenceParameterSetVui` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `StdVideoH264SequenceParameterSetVui` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoH264SequenceParameterSetVui`
    public static StdVideoH264SequenceParameterSetVui alloc(SegmentAllocator allocator) { return new StdVideoH264SequenceParameterSetVui(allocator.allocate(LAYOUT)); }

    /// Allocates a `StdVideoH264SequenceParameterSetVui` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `StdVideoH264SequenceParameterSetVui`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `StdVideoH264SequenceParameterSetVui` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoH264SequenceParameterSetVui`
    public static StdVideoH264SequenceParameterSetVui allocInit(SegmentAllocator allocator, @CType("StdVideoH264SpsVuiFlags") MemorySegment flags, @CType("StdVideoH264AspectRatioIdc") int aspect_ratio_idc, @CType("uint16_t") short sar_width, @CType("uint16_t") short sar_height, @CType("uint8_t") byte video_format, @CType("uint8_t") byte colour_primaries, @CType("uint8_t") byte transfer_characteristics, @CType("uint8_t") byte matrix_coefficients, @CType("uint32_t") int num_units_in_tick, @CType("uint32_t") int time_scale, @CType("uint8_t") byte max_num_reorder_frames, @CType("uint8_t") byte max_dec_frame_buffering, @CType("uint8_t") byte chroma_sample_loc_type_top_field, @CType("uint8_t") byte chroma_sample_loc_type_bottom_field, @CType("uint32_t") int reserved1, @CType("const StdVideoH264HrdParameters *") MemorySegment pHrdParameters) { return alloc(allocator).flags(flags).aspect_ratio_idc(aspect_ratio_idc).sar_width(sar_width).sar_height(sar_height).video_format(video_format).colour_primaries(colour_primaries).transfer_characteristics(transfer_characteristics).matrix_coefficients(matrix_coefficients).num_units_in_tick(num_units_in_tick).time_scale(time_scale).max_num_reorder_frames(max_num_reorder_frames).max_dec_frame_buffering(max_dec_frame_buffering).chroma_sample_loc_type_top_field(chroma_sample_loc_type_top_field).chroma_sample_loc_type_bottom_field(chroma_sample_loc_type_bottom_field).reserved1(reserved1).pHrdParameters(pHrdParameters); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public StdVideoH264SequenceParameterSetVui copyFrom(StdVideoH264SequenceParameterSetVui src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("StdVideoH264SpsVuiFlags") MemorySegment get_flags(MemorySegment segment, long index) { return (MemorySegment) VH_flags.get(segment, 0L, index); }
    /// {@return `flags`}
    /// @param segment the segment of the struct
    public static @CType("StdVideoH264SpsVuiFlags") MemorySegment get_flags(MemorySegment segment) { return StdVideoH264SequenceParameterSetVui.get_flags(segment, 0L); }
    /// {@return `flags`}
    public @CType("StdVideoH264SpsVuiFlags") MemorySegment flags() { return StdVideoH264SequenceParameterSetVui.get_flags(this.segment()); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_flags(MemorySegment segment, long index, @CType("StdVideoH264SpsVuiFlags") MemorySegment value) { VH_flags.set(segment, 0L, index, value); }
    /// Sets `flags` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_flags(MemorySegment segment, @CType("StdVideoH264SpsVuiFlags") MemorySegment value) { StdVideoH264SequenceParameterSetVui.set_flags(segment, 0L, value); }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH264SequenceParameterSetVui flags(@CType("StdVideoH264SpsVuiFlags") MemorySegment value) { StdVideoH264SequenceParameterSetVui.set_flags(this.segment(), value); return this; }

    /// {@return `aspect_ratio_idc` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("StdVideoH264AspectRatioIdc") int get_aspect_ratio_idc(MemorySegment segment, long index) { return (int) VH_aspect_ratio_idc.get(segment, 0L, index); }
    /// {@return `aspect_ratio_idc`}
    /// @param segment the segment of the struct
    public static @CType("StdVideoH264AspectRatioIdc") int get_aspect_ratio_idc(MemorySegment segment) { return StdVideoH264SequenceParameterSetVui.get_aspect_ratio_idc(segment, 0L); }
    /// {@return `aspect_ratio_idc`}
    public @CType("StdVideoH264AspectRatioIdc") int aspect_ratio_idc() { return StdVideoH264SequenceParameterSetVui.get_aspect_ratio_idc(this.segment()); }
    /// Sets `aspect_ratio_idc` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_aspect_ratio_idc(MemorySegment segment, long index, @CType("StdVideoH264AspectRatioIdc") int value) { VH_aspect_ratio_idc.set(segment, 0L, index, value); }
    /// Sets `aspect_ratio_idc` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_aspect_ratio_idc(MemorySegment segment, @CType("StdVideoH264AspectRatioIdc") int value) { StdVideoH264SequenceParameterSetVui.set_aspect_ratio_idc(segment, 0L, value); }
    /// Sets `aspect_ratio_idc` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH264SequenceParameterSetVui aspect_ratio_idc(@CType("StdVideoH264AspectRatioIdc") int value) { StdVideoH264SequenceParameterSetVui.set_aspect_ratio_idc(this.segment(), value); return this; }

    /// {@return `sar_width` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint16_t") short get_sar_width(MemorySegment segment, long index) { return (short) VH_sar_width.get(segment, 0L, index); }
    /// {@return `sar_width`}
    /// @param segment the segment of the struct
    public static @CType("uint16_t") short get_sar_width(MemorySegment segment) { return StdVideoH264SequenceParameterSetVui.get_sar_width(segment, 0L); }
    /// {@return `sar_width`}
    public @CType("uint16_t") short sar_width() { return StdVideoH264SequenceParameterSetVui.get_sar_width(this.segment()); }
    /// Sets `sar_width` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sar_width(MemorySegment segment, long index, @CType("uint16_t") short value) { VH_sar_width.set(segment, 0L, index, value); }
    /// Sets `sar_width` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sar_width(MemorySegment segment, @CType("uint16_t") short value) { StdVideoH264SequenceParameterSetVui.set_sar_width(segment, 0L, value); }
    /// Sets `sar_width` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH264SequenceParameterSetVui sar_width(@CType("uint16_t") short value) { StdVideoH264SequenceParameterSetVui.set_sar_width(this.segment(), value); return this; }

    /// {@return `sar_height` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint16_t") short get_sar_height(MemorySegment segment, long index) { return (short) VH_sar_height.get(segment, 0L, index); }
    /// {@return `sar_height`}
    /// @param segment the segment of the struct
    public static @CType("uint16_t") short get_sar_height(MemorySegment segment) { return StdVideoH264SequenceParameterSetVui.get_sar_height(segment, 0L); }
    /// {@return `sar_height`}
    public @CType("uint16_t") short sar_height() { return StdVideoH264SequenceParameterSetVui.get_sar_height(this.segment()); }
    /// Sets `sar_height` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sar_height(MemorySegment segment, long index, @CType("uint16_t") short value) { VH_sar_height.set(segment, 0L, index, value); }
    /// Sets `sar_height` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sar_height(MemorySegment segment, @CType("uint16_t") short value) { StdVideoH264SequenceParameterSetVui.set_sar_height(segment, 0L, value); }
    /// Sets `sar_height` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH264SequenceParameterSetVui sar_height(@CType("uint16_t") short value) { StdVideoH264SequenceParameterSetVui.set_sar_height(this.segment(), value); return this; }

    /// {@return `video_format` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t") byte get_video_format(MemorySegment segment, long index) { return (byte) VH_video_format.get(segment, 0L, index); }
    /// {@return `video_format`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t") byte get_video_format(MemorySegment segment) { return StdVideoH264SequenceParameterSetVui.get_video_format(segment, 0L); }
    /// {@return `video_format`}
    public @CType("uint8_t") byte video_format() { return StdVideoH264SequenceParameterSetVui.get_video_format(this.segment()); }
    /// Sets `video_format` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_video_format(MemorySegment segment, long index, @CType("uint8_t") byte value) { VH_video_format.set(segment, 0L, index, value); }
    /// Sets `video_format` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_video_format(MemorySegment segment, @CType("uint8_t") byte value) { StdVideoH264SequenceParameterSetVui.set_video_format(segment, 0L, value); }
    /// Sets `video_format` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH264SequenceParameterSetVui video_format(@CType("uint8_t") byte value) { StdVideoH264SequenceParameterSetVui.set_video_format(this.segment(), value); return this; }

    /// {@return `colour_primaries` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t") byte get_colour_primaries(MemorySegment segment, long index) { return (byte) VH_colour_primaries.get(segment, 0L, index); }
    /// {@return `colour_primaries`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t") byte get_colour_primaries(MemorySegment segment) { return StdVideoH264SequenceParameterSetVui.get_colour_primaries(segment, 0L); }
    /// {@return `colour_primaries`}
    public @CType("uint8_t") byte colour_primaries() { return StdVideoH264SequenceParameterSetVui.get_colour_primaries(this.segment()); }
    /// Sets `colour_primaries` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_colour_primaries(MemorySegment segment, long index, @CType("uint8_t") byte value) { VH_colour_primaries.set(segment, 0L, index, value); }
    /// Sets `colour_primaries` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_colour_primaries(MemorySegment segment, @CType("uint8_t") byte value) { StdVideoH264SequenceParameterSetVui.set_colour_primaries(segment, 0L, value); }
    /// Sets `colour_primaries` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH264SequenceParameterSetVui colour_primaries(@CType("uint8_t") byte value) { StdVideoH264SequenceParameterSetVui.set_colour_primaries(this.segment(), value); return this; }

    /// {@return `transfer_characteristics` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t") byte get_transfer_characteristics(MemorySegment segment, long index) { return (byte) VH_transfer_characteristics.get(segment, 0L, index); }
    /// {@return `transfer_characteristics`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t") byte get_transfer_characteristics(MemorySegment segment) { return StdVideoH264SequenceParameterSetVui.get_transfer_characteristics(segment, 0L); }
    /// {@return `transfer_characteristics`}
    public @CType("uint8_t") byte transfer_characteristics() { return StdVideoH264SequenceParameterSetVui.get_transfer_characteristics(this.segment()); }
    /// Sets `transfer_characteristics` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_transfer_characteristics(MemorySegment segment, long index, @CType("uint8_t") byte value) { VH_transfer_characteristics.set(segment, 0L, index, value); }
    /// Sets `transfer_characteristics` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_transfer_characteristics(MemorySegment segment, @CType("uint8_t") byte value) { StdVideoH264SequenceParameterSetVui.set_transfer_characteristics(segment, 0L, value); }
    /// Sets `transfer_characteristics` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH264SequenceParameterSetVui transfer_characteristics(@CType("uint8_t") byte value) { StdVideoH264SequenceParameterSetVui.set_transfer_characteristics(this.segment(), value); return this; }

    /// {@return `matrix_coefficients` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t") byte get_matrix_coefficients(MemorySegment segment, long index) { return (byte) VH_matrix_coefficients.get(segment, 0L, index); }
    /// {@return `matrix_coefficients`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t") byte get_matrix_coefficients(MemorySegment segment) { return StdVideoH264SequenceParameterSetVui.get_matrix_coefficients(segment, 0L); }
    /// {@return `matrix_coefficients`}
    public @CType("uint8_t") byte matrix_coefficients() { return StdVideoH264SequenceParameterSetVui.get_matrix_coefficients(this.segment()); }
    /// Sets `matrix_coefficients` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_matrix_coefficients(MemorySegment segment, long index, @CType("uint8_t") byte value) { VH_matrix_coefficients.set(segment, 0L, index, value); }
    /// Sets `matrix_coefficients` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_matrix_coefficients(MemorySegment segment, @CType("uint8_t") byte value) { StdVideoH264SequenceParameterSetVui.set_matrix_coefficients(segment, 0L, value); }
    /// Sets `matrix_coefficients` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH264SequenceParameterSetVui matrix_coefficients(@CType("uint8_t") byte value) { StdVideoH264SequenceParameterSetVui.set_matrix_coefficients(this.segment(), value); return this; }

    /// {@return `num_units_in_tick` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_num_units_in_tick(MemorySegment segment, long index) { return (int) VH_num_units_in_tick.get(segment, 0L, index); }
    /// {@return `num_units_in_tick`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_num_units_in_tick(MemorySegment segment) { return StdVideoH264SequenceParameterSetVui.get_num_units_in_tick(segment, 0L); }
    /// {@return `num_units_in_tick`}
    public @CType("uint32_t") int num_units_in_tick() { return StdVideoH264SequenceParameterSetVui.get_num_units_in_tick(this.segment()); }
    /// Sets `num_units_in_tick` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_num_units_in_tick(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_num_units_in_tick.set(segment, 0L, index, value); }
    /// Sets `num_units_in_tick` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_num_units_in_tick(MemorySegment segment, @CType("uint32_t") int value) { StdVideoH264SequenceParameterSetVui.set_num_units_in_tick(segment, 0L, value); }
    /// Sets `num_units_in_tick` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH264SequenceParameterSetVui num_units_in_tick(@CType("uint32_t") int value) { StdVideoH264SequenceParameterSetVui.set_num_units_in_tick(this.segment(), value); return this; }

    /// {@return `time_scale` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_time_scale(MemorySegment segment, long index) { return (int) VH_time_scale.get(segment, 0L, index); }
    /// {@return `time_scale`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_time_scale(MemorySegment segment) { return StdVideoH264SequenceParameterSetVui.get_time_scale(segment, 0L); }
    /// {@return `time_scale`}
    public @CType("uint32_t") int time_scale() { return StdVideoH264SequenceParameterSetVui.get_time_scale(this.segment()); }
    /// Sets `time_scale` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_time_scale(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_time_scale.set(segment, 0L, index, value); }
    /// Sets `time_scale` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_time_scale(MemorySegment segment, @CType("uint32_t") int value) { StdVideoH264SequenceParameterSetVui.set_time_scale(segment, 0L, value); }
    /// Sets `time_scale` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH264SequenceParameterSetVui time_scale(@CType("uint32_t") int value) { StdVideoH264SequenceParameterSetVui.set_time_scale(this.segment(), value); return this; }

    /// {@return `max_num_reorder_frames` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t") byte get_max_num_reorder_frames(MemorySegment segment, long index) { return (byte) VH_max_num_reorder_frames.get(segment, 0L, index); }
    /// {@return `max_num_reorder_frames`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t") byte get_max_num_reorder_frames(MemorySegment segment) { return StdVideoH264SequenceParameterSetVui.get_max_num_reorder_frames(segment, 0L); }
    /// {@return `max_num_reorder_frames`}
    public @CType("uint8_t") byte max_num_reorder_frames() { return StdVideoH264SequenceParameterSetVui.get_max_num_reorder_frames(this.segment()); }
    /// Sets `max_num_reorder_frames` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_max_num_reorder_frames(MemorySegment segment, long index, @CType("uint8_t") byte value) { VH_max_num_reorder_frames.set(segment, 0L, index, value); }
    /// Sets `max_num_reorder_frames` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_max_num_reorder_frames(MemorySegment segment, @CType("uint8_t") byte value) { StdVideoH264SequenceParameterSetVui.set_max_num_reorder_frames(segment, 0L, value); }
    /// Sets `max_num_reorder_frames` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH264SequenceParameterSetVui max_num_reorder_frames(@CType("uint8_t") byte value) { StdVideoH264SequenceParameterSetVui.set_max_num_reorder_frames(this.segment(), value); return this; }

    /// {@return `max_dec_frame_buffering` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t") byte get_max_dec_frame_buffering(MemorySegment segment, long index) { return (byte) VH_max_dec_frame_buffering.get(segment, 0L, index); }
    /// {@return `max_dec_frame_buffering`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t") byte get_max_dec_frame_buffering(MemorySegment segment) { return StdVideoH264SequenceParameterSetVui.get_max_dec_frame_buffering(segment, 0L); }
    /// {@return `max_dec_frame_buffering`}
    public @CType("uint8_t") byte max_dec_frame_buffering() { return StdVideoH264SequenceParameterSetVui.get_max_dec_frame_buffering(this.segment()); }
    /// Sets `max_dec_frame_buffering` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_max_dec_frame_buffering(MemorySegment segment, long index, @CType("uint8_t") byte value) { VH_max_dec_frame_buffering.set(segment, 0L, index, value); }
    /// Sets `max_dec_frame_buffering` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_max_dec_frame_buffering(MemorySegment segment, @CType("uint8_t") byte value) { StdVideoH264SequenceParameterSetVui.set_max_dec_frame_buffering(segment, 0L, value); }
    /// Sets `max_dec_frame_buffering` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH264SequenceParameterSetVui max_dec_frame_buffering(@CType("uint8_t") byte value) { StdVideoH264SequenceParameterSetVui.set_max_dec_frame_buffering(this.segment(), value); return this; }

    /// {@return `chroma_sample_loc_type_top_field` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t") byte get_chroma_sample_loc_type_top_field(MemorySegment segment, long index) { return (byte) VH_chroma_sample_loc_type_top_field.get(segment, 0L, index); }
    /// {@return `chroma_sample_loc_type_top_field`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t") byte get_chroma_sample_loc_type_top_field(MemorySegment segment) { return StdVideoH264SequenceParameterSetVui.get_chroma_sample_loc_type_top_field(segment, 0L); }
    /// {@return `chroma_sample_loc_type_top_field`}
    public @CType("uint8_t") byte chroma_sample_loc_type_top_field() { return StdVideoH264SequenceParameterSetVui.get_chroma_sample_loc_type_top_field(this.segment()); }
    /// Sets `chroma_sample_loc_type_top_field` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_chroma_sample_loc_type_top_field(MemorySegment segment, long index, @CType("uint8_t") byte value) { VH_chroma_sample_loc_type_top_field.set(segment, 0L, index, value); }
    /// Sets `chroma_sample_loc_type_top_field` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_chroma_sample_loc_type_top_field(MemorySegment segment, @CType("uint8_t") byte value) { StdVideoH264SequenceParameterSetVui.set_chroma_sample_loc_type_top_field(segment, 0L, value); }
    /// Sets `chroma_sample_loc_type_top_field` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH264SequenceParameterSetVui chroma_sample_loc_type_top_field(@CType("uint8_t") byte value) { StdVideoH264SequenceParameterSetVui.set_chroma_sample_loc_type_top_field(this.segment(), value); return this; }

    /// {@return `chroma_sample_loc_type_bottom_field` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t") byte get_chroma_sample_loc_type_bottom_field(MemorySegment segment, long index) { return (byte) VH_chroma_sample_loc_type_bottom_field.get(segment, 0L, index); }
    /// {@return `chroma_sample_loc_type_bottom_field`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t") byte get_chroma_sample_loc_type_bottom_field(MemorySegment segment) { return StdVideoH264SequenceParameterSetVui.get_chroma_sample_loc_type_bottom_field(segment, 0L); }
    /// {@return `chroma_sample_loc_type_bottom_field`}
    public @CType("uint8_t") byte chroma_sample_loc_type_bottom_field() { return StdVideoH264SequenceParameterSetVui.get_chroma_sample_loc_type_bottom_field(this.segment()); }
    /// Sets `chroma_sample_loc_type_bottom_field` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_chroma_sample_loc_type_bottom_field(MemorySegment segment, long index, @CType("uint8_t") byte value) { VH_chroma_sample_loc_type_bottom_field.set(segment, 0L, index, value); }
    /// Sets `chroma_sample_loc_type_bottom_field` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_chroma_sample_loc_type_bottom_field(MemorySegment segment, @CType("uint8_t") byte value) { StdVideoH264SequenceParameterSetVui.set_chroma_sample_loc_type_bottom_field(segment, 0L, value); }
    /// Sets `chroma_sample_loc_type_bottom_field` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH264SequenceParameterSetVui chroma_sample_loc_type_bottom_field(@CType("uint8_t") byte value) { StdVideoH264SequenceParameterSetVui.set_chroma_sample_loc_type_bottom_field(this.segment(), value); return this; }

    /// {@return `reserved1` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_reserved1(MemorySegment segment, long index) { return (int) VH_reserved1.get(segment, 0L, index); }
    /// {@return `reserved1`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_reserved1(MemorySegment segment) { return StdVideoH264SequenceParameterSetVui.get_reserved1(segment, 0L); }
    /// {@return `reserved1`}
    public @CType("uint32_t") int reserved1() { return StdVideoH264SequenceParameterSetVui.get_reserved1(this.segment()); }
    /// Sets `reserved1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_reserved1(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_reserved1.set(segment, 0L, index, value); }
    /// Sets `reserved1` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_reserved1(MemorySegment segment, @CType("uint32_t") int value) { StdVideoH264SequenceParameterSetVui.set_reserved1(segment, 0L, value); }
    /// Sets `reserved1` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH264SequenceParameterSetVui reserved1(@CType("uint32_t") int value) { StdVideoH264SequenceParameterSetVui.set_reserved1(this.segment(), value); return this; }

    /// {@return `pHrdParameters` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const StdVideoH264HrdParameters *") MemorySegment get_pHrdParameters(MemorySegment segment, long index) { return (MemorySegment) VH_pHrdParameters.get(segment, 0L, index); }
    /// {@return `pHrdParameters`}
    /// @param segment the segment of the struct
    public static @CType("const StdVideoH264HrdParameters *") MemorySegment get_pHrdParameters(MemorySegment segment) { return StdVideoH264SequenceParameterSetVui.get_pHrdParameters(segment, 0L); }
    /// {@return `pHrdParameters`}
    public @CType("const StdVideoH264HrdParameters *") MemorySegment pHrdParameters() { return StdVideoH264SequenceParameterSetVui.get_pHrdParameters(this.segment()); }
    /// Sets `pHrdParameters` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pHrdParameters(MemorySegment segment, long index, @CType("const StdVideoH264HrdParameters *") MemorySegment value) { VH_pHrdParameters.set(segment, 0L, index, value); }
    /// Sets `pHrdParameters` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pHrdParameters(MemorySegment segment, @CType("const StdVideoH264HrdParameters *") MemorySegment value) { StdVideoH264SequenceParameterSetVui.set_pHrdParameters(segment, 0L, value); }
    /// Sets `pHrdParameters` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH264SequenceParameterSetVui pHrdParameters(@CType("const StdVideoH264HrdParameters *") MemorySegment value) { StdVideoH264SequenceParameterSetVui.set_pHrdParameters(this.segment(), value); return this; }

    /// A buffer of [StdVideoH264SequenceParameterSetVui].
    public static final class Buffer extends StdVideoH264SequenceParameterSetVui {
        private final long elementCount;

        /// Creates `StdVideoH264SequenceParameterSetVui.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `StdVideoH264SequenceParameterSetVui`.
        /// @param index the index of the struct buffer
        /// @return the slice of `StdVideoH264SequenceParameterSetVui`
        public StdVideoH264SequenceParameterSetVui asSlice(long index) { return new StdVideoH264SequenceParameterSetVui(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `StdVideoH264SequenceParameterSetVui`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `StdVideoH264SequenceParameterSetVui`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `flags` at the given index}
        /// @param index the index
        public @CType("StdVideoH264SpsVuiFlags") MemorySegment flagsAt(long index) { return StdVideoH264SequenceParameterSetVui.get_flags(this.segment(), index); }
        /// Sets `flags` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer flagsAt(long index, @CType("StdVideoH264SpsVuiFlags") MemorySegment value) { StdVideoH264SequenceParameterSetVui.set_flags(this.segment(), index, value); return this; }

        /// {@return `aspect_ratio_idc` at the given index}
        /// @param index the index
        public @CType("StdVideoH264AspectRatioIdc") int aspect_ratio_idcAt(long index) { return StdVideoH264SequenceParameterSetVui.get_aspect_ratio_idc(this.segment(), index); }
        /// Sets `aspect_ratio_idc` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer aspect_ratio_idcAt(long index, @CType("StdVideoH264AspectRatioIdc") int value) { StdVideoH264SequenceParameterSetVui.set_aspect_ratio_idc(this.segment(), index, value); return this; }

        /// {@return `sar_width` at the given index}
        /// @param index the index
        public @CType("uint16_t") short sar_widthAt(long index) { return StdVideoH264SequenceParameterSetVui.get_sar_width(this.segment(), index); }
        /// Sets `sar_width` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sar_widthAt(long index, @CType("uint16_t") short value) { StdVideoH264SequenceParameterSetVui.set_sar_width(this.segment(), index, value); return this; }

        /// {@return `sar_height` at the given index}
        /// @param index the index
        public @CType("uint16_t") short sar_heightAt(long index) { return StdVideoH264SequenceParameterSetVui.get_sar_height(this.segment(), index); }
        /// Sets `sar_height` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sar_heightAt(long index, @CType("uint16_t") short value) { StdVideoH264SequenceParameterSetVui.set_sar_height(this.segment(), index, value); return this; }

        /// {@return `video_format` at the given index}
        /// @param index the index
        public @CType("uint8_t") byte video_formatAt(long index) { return StdVideoH264SequenceParameterSetVui.get_video_format(this.segment(), index); }
        /// Sets `video_format` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer video_formatAt(long index, @CType("uint8_t") byte value) { StdVideoH264SequenceParameterSetVui.set_video_format(this.segment(), index, value); return this; }

        /// {@return `colour_primaries` at the given index}
        /// @param index the index
        public @CType("uint8_t") byte colour_primariesAt(long index) { return StdVideoH264SequenceParameterSetVui.get_colour_primaries(this.segment(), index); }
        /// Sets `colour_primaries` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer colour_primariesAt(long index, @CType("uint8_t") byte value) { StdVideoH264SequenceParameterSetVui.set_colour_primaries(this.segment(), index, value); return this; }

        /// {@return `transfer_characteristics` at the given index}
        /// @param index the index
        public @CType("uint8_t") byte transfer_characteristicsAt(long index) { return StdVideoH264SequenceParameterSetVui.get_transfer_characteristics(this.segment(), index); }
        /// Sets `transfer_characteristics` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer transfer_characteristicsAt(long index, @CType("uint8_t") byte value) { StdVideoH264SequenceParameterSetVui.set_transfer_characteristics(this.segment(), index, value); return this; }

        /// {@return `matrix_coefficients` at the given index}
        /// @param index the index
        public @CType("uint8_t") byte matrix_coefficientsAt(long index) { return StdVideoH264SequenceParameterSetVui.get_matrix_coefficients(this.segment(), index); }
        /// Sets `matrix_coefficients` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer matrix_coefficientsAt(long index, @CType("uint8_t") byte value) { StdVideoH264SequenceParameterSetVui.set_matrix_coefficients(this.segment(), index, value); return this; }

        /// {@return `num_units_in_tick` at the given index}
        /// @param index the index
        public @CType("uint32_t") int num_units_in_tickAt(long index) { return StdVideoH264SequenceParameterSetVui.get_num_units_in_tick(this.segment(), index); }
        /// Sets `num_units_in_tick` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer num_units_in_tickAt(long index, @CType("uint32_t") int value) { StdVideoH264SequenceParameterSetVui.set_num_units_in_tick(this.segment(), index, value); return this; }

        /// {@return `time_scale` at the given index}
        /// @param index the index
        public @CType("uint32_t") int time_scaleAt(long index) { return StdVideoH264SequenceParameterSetVui.get_time_scale(this.segment(), index); }
        /// Sets `time_scale` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer time_scaleAt(long index, @CType("uint32_t") int value) { StdVideoH264SequenceParameterSetVui.set_time_scale(this.segment(), index, value); return this; }

        /// {@return `max_num_reorder_frames` at the given index}
        /// @param index the index
        public @CType("uint8_t") byte max_num_reorder_framesAt(long index) { return StdVideoH264SequenceParameterSetVui.get_max_num_reorder_frames(this.segment(), index); }
        /// Sets `max_num_reorder_frames` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer max_num_reorder_framesAt(long index, @CType("uint8_t") byte value) { StdVideoH264SequenceParameterSetVui.set_max_num_reorder_frames(this.segment(), index, value); return this; }

        /// {@return `max_dec_frame_buffering` at the given index}
        /// @param index the index
        public @CType("uint8_t") byte max_dec_frame_bufferingAt(long index) { return StdVideoH264SequenceParameterSetVui.get_max_dec_frame_buffering(this.segment(), index); }
        /// Sets `max_dec_frame_buffering` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer max_dec_frame_bufferingAt(long index, @CType("uint8_t") byte value) { StdVideoH264SequenceParameterSetVui.set_max_dec_frame_buffering(this.segment(), index, value); return this; }

        /// {@return `chroma_sample_loc_type_top_field` at the given index}
        /// @param index the index
        public @CType("uint8_t") byte chroma_sample_loc_type_top_fieldAt(long index) { return StdVideoH264SequenceParameterSetVui.get_chroma_sample_loc_type_top_field(this.segment(), index); }
        /// Sets `chroma_sample_loc_type_top_field` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer chroma_sample_loc_type_top_fieldAt(long index, @CType("uint8_t") byte value) { StdVideoH264SequenceParameterSetVui.set_chroma_sample_loc_type_top_field(this.segment(), index, value); return this; }

        /// {@return `chroma_sample_loc_type_bottom_field` at the given index}
        /// @param index the index
        public @CType("uint8_t") byte chroma_sample_loc_type_bottom_fieldAt(long index) { return StdVideoH264SequenceParameterSetVui.get_chroma_sample_loc_type_bottom_field(this.segment(), index); }
        /// Sets `chroma_sample_loc_type_bottom_field` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer chroma_sample_loc_type_bottom_fieldAt(long index, @CType("uint8_t") byte value) { StdVideoH264SequenceParameterSetVui.set_chroma_sample_loc_type_bottom_field(this.segment(), index, value); return this; }

        /// {@return `reserved1` at the given index}
        /// @param index the index
        public @CType("uint32_t") int reserved1At(long index) { return StdVideoH264SequenceParameterSetVui.get_reserved1(this.segment(), index); }
        /// Sets `reserved1` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer reserved1At(long index, @CType("uint32_t") int value) { StdVideoH264SequenceParameterSetVui.set_reserved1(this.segment(), index, value); return this; }

        /// {@return `pHrdParameters` at the given index}
        /// @param index the index
        public @CType("const StdVideoH264HrdParameters *") MemorySegment pHrdParametersAt(long index) { return StdVideoH264SequenceParameterSetVui.get_pHrdParameters(this.segment(), index); }
        /// Sets `pHrdParameters` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pHrdParametersAt(long index, @CType("const StdVideoH264HrdParameters *") MemorySegment value) { StdVideoH264SequenceParameterSetVui.set_pHrdParameters(this.segment(), index, value); return this; }

    }
}
