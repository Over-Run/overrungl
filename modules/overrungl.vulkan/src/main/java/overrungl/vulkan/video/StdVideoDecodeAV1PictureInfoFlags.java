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
/// ### error_resilient_mode
/// [VarHandle][#VH_error_resilient_mode] - [Getter][#error_resilient_mode()] - [Setter][#error_resilient_mode(int)]
/// ### disable_cdf_update
/// [VarHandle][#VH_disable_cdf_update] - [Getter][#disable_cdf_update()] - [Setter][#disable_cdf_update(int)]
/// ### use_superres
/// [VarHandle][#VH_use_superres] - [Getter][#use_superres()] - [Setter][#use_superres(int)]
/// ### render_and_frame_size_different
/// [VarHandle][#VH_render_and_frame_size_different] - [Getter][#render_and_frame_size_different()] - [Setter][#render_and_frame_size_different(int)]
/// ### allow_screen_content_tools
/// [VarHandle][#VH_allow_screen_content_tools] - [Getter][#allow_screen_content_tools()] - [Setter][#allow_screen_content_tools(int)]
/// ### is_filter_switchable
/// [VarHandle][#VH_is_filter_switchable] - [Getter][#is_filter_switchable()] - [Setter][#is_filter_switchable(int)]
/// ### force_integer_mv
/// [VarHandle][#VH_force_integer_mv] - [Getter][#force_integer_mv()] - [Setter][#force_integer_mv(int)]
/// ### frame_size_override_flag
/// [VarHandle][#VH_frame_size_override_flag] - [Getter][#frame_size_override_flag()] - [Setter][#frame_size_override_flag(int)]
/// ### buffer_removal_time_present_flag
/// [VarHandle][#VH_buffer_removal_time_present_flag] - [Getter][#buffer_removal_time_present_flag()] - [Setter][#buffer_removal_time_present_flag(int)]
/// ### allow_intrabc
/// [VarHandle][#VH_allow_intrabc] - [Getter][#allow_intrabc()] - [Setter][#allow_intrabc(int)]
/// ### frame_refs_short_signaling
/// [VarHandle][#VH_frame_refs_short_signaling] - [Getter][#frame_refs_short_signaling()] - [Setter][#frame_refs_short_signaling(int)]
/// ### allow_high_precision_mv
/// [VarHandle][#VH_allow_high_precision_mv] - [Getter][#allow_high_precision_mv()] - [Setter][#allow_high_precision_mv(int)]
/// ### is_motion_mode_switchable
/// [VarHandle][#VH_is_motion_mode_switchable] - [Getter][#is_motion_mode_switchable()] - [Setter][#is_motion_mode_switchable(int)]
/// ### use_ref_frame_mvs
/// [VarHandle][#VH_use_ref_frame_mvs] - [Getter][#use_ref_frame_mvs()] - [Setter][#use_ref_frame_mvs(int)]
/// ### disable_frame_end_update_cdf
/// [VarHandle][#VH_disable_frame_end_update_cdf] - [Getter][#disable_frame_end_update_cdf()] - [Setter][#disable_frame_end_update_cdf(int)]
/// ### allow_warped_motion
/// [VarHandle][#VH_allow_warped_motion] - [Getter][#allow_warped_motion()] - [Setter][#allow_warped_motion(int)]
/// ### reduced_tx_set
/// [VarHandle][#VH_reduced_tx_set] - [Getter][#reduced_tx_set()] - [Setter][#reduced_tx_set(int)]
/// ### reference_select
/// [VarHandle][#VH_reference_select] - [Getter][#reference_select()] - [Setter][#reference_select(int)]
/// ### skip_mode_present
/// [VarHandle][#VH_skip_mode_present] - [Getter][#skip_mode_present()] - [Setter][#skip_mode_present(int)]
/// ### delta_q_present
/// [VarHandle][#VH_delta_q_present] - [Getter][#delta_q_present()] - [Setter][#delta_q_present(int)]
/// ### delta_lf_present
/// [VarHandle][#VH_delta_lf_present] - [Getter][#delta_lf_present()] - [Setter][#delta_lf_present(int)]
/// ### delta_lf_multi
/// [VarHandle][#VH_delta_lf_multi] - [Getter][#delta_lf_multi()] - [Setter][#delta_lf_multi(int)]
/// ### segmentation_enabled
/// [VarHandle][#VH_segmentation_enabled] - [Getter][#segmentation_enabled()] - [Setter][#segmentation_enabled(int)]
/// ### segmentation_update_map
/// [VarHandle][#VH_segmentation_update_map] - [Getter][#segmentation_update_map()] - [Setter][#segmentation_update_map(int)]
/// ### segmentation_temporal_update
/// [VarHandle][#VH_segmentation_temporal_update] - [Getter][#segmentation_temporal_update()] - [Setter][#segmentation_temporal_update(int)]
/// ### segmentation_update_data
/// [VarHandle][#VH_segmentation_update_data] - [Getter][#segmentation_update_data()] - [Setter][#segmentation_update_data(int)]
/// ### UsesLr
/// [VarHandle][#VH_UsesLr] - [Getter][#UsesLr()] - [Setter][#UsesLr(int)]
/// ### usesChromaLr
/// [VarHandle][#VH_usesChromaLr] - [Getter][#usesChromaLr()] - [Setter][#usesChromaLr(int)]
/// ### apply_grain
/// [VarHandle][#VH_apply_grain] - [Getter][#apply_grain()] - [Setter][#apply_grain(int)]
/// ### reserved
/// [VarHandle][#VH_reserved] - [Getter][#reserved()] - [Setter][#reserved(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct StdVideoDecodeAV1PictureInfoFlags {
///     uint32_t : 1 error_resilient_mode;
///     uint32_t : 1 disable_cdf_update;
///     uint32_t : 1 use_superres;
///     uint32_t : 1 render_and_frame_size_different;
///     uint32_t : 1 allow_screen_content_tools;
///     uint32_t : 1 is_filter_switchable;
///     uint32_t : 1 force_integer_mv;
///     uint32_t : 1 frame_size_override_flag;
///     uint32_t : 1 buffer_removal_time_present_flag;
///     uint32_t : 1 allow_intrabc;
///     uint32_t : 1 frame_refs_short_signaling;
///     uint32_t : 1 allow_high_precision_mv;
///     uint32_t : 1 is_motion_mode_switchable;
///     uint32_t : 1 use_ref_frame_mvs;
///     uint32_t : 1 disable_frame_end_update_cdf;
///     uint32_t : 1 allow_warped_motion;
///     uint32_t : 1 reduced_tx_set;
///     uint32_t : 1 reference_select;
///     uint32_t : 1 skip_mode_present;
///     uint32_t : 1 delta_q_present;
///     uint32_t : 1 delta_lf_present;
///     uint32_t : 1 delta_lf_multi;
///     uint32_t : 1 segmentation_enabled;
///     uint32_t : 1 segmentation_update_map;
///     uint32_t : 1 segmentation_temporal_update;
///     uint32_t : 1 segmentation_update_data;
///     uint32_t : 1 UsesLr;
///     uint32_t : 1 usesChromaLr;
///     uint32_t : 1 apply_grain;
///     uint32_t : 3 reserved;
/// } StdVideoDecodeAV1PictureInfoFlags;
/// ```
public sealed class StdVideoDecodeAV1PictureInfoFlags extends Struct {
    /// The struct layout of `StdVideoDecodeAV1PictureInfoFlags`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("error_resilient_mode"),
        ValueLayout.JAVA_INT.withName("disable_cdf_update"),
        ValueLayout.JAVA_INT.withName("use_superres"),
        ValueLayout.JAVA_INT.withName("render_and_frame_size_different"),
        ValueLayout.JAVA_INT.withName("allow_screen_content_tools"),
        ValueLayout.JAVA_INT.withName("is_filter_switchable"),
        ValueLayout.JAVA_INT.withName("force_integer_mv"),
        ValueLayout.JAVA_INT.withName("frame_size_override_flag"),
        ValueLayout.JAVA_INT.withName("buffer_removal_time_present_flag"),
        ValueLayout.JAVA_INT.withName("allow_intrabc"),
        ValueLayout.JAVA_INT.withName("frame_refs_short_signaling"),
        ValueLayout.JAVA_INT.withName("allow_high_precision_mv"),
        ValueLayout.JAVA_INT.withName("is_motion_mode_switchable"),
        ValueLayout.JAVA_INT.withName("use_ref_frame_mvs"),
        ValueLayout.JAVA_INT.withName("disable_frame_end_update_cdf"),
        ValueLayout.JAVA_INT.withName("allow_warped_motion"),
        ValueLayout.JAVA_INT.withName("reduced_tx_set"),
        ValueLayout.JAVA_INT.withName("reference_select"),
        ValueLayout.JAVA_INT.withName("skip_mode_present"),
        ValueLayout.JAVA_INT.withName("delta_q_present"),
        ValueLayout.JAVA_INT.withName("delta_lf_present"),
        ValueLayout.JAVA_INT.withName("delta_lf_multi"),
        ValueLayout.JAVA_INT.withName("segmentation_enabled"),
        ValueLayout.JAVA_INT.withName("segmentation_update_map"),
        ValueLayout.JAVA_INT.withName("segmentation_temporal_update"),
        ValueLayout.JAVA_INT.withName("segmentation_update_data"),
        ValueLayout.JAVA_INT.withName("UsesLr"),
        ValueLayout.JAVA_INT.withName("usesChromaLr"),
        ValueLayout.JAVA_INT.withName("apply_grain"),
        ValueLayout.JAVA_INT.withName("reserved")
    );
    /// The [VarHandle] of `error_resilient_mode` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_error_resilient_mode = LAYOUT.arrayElementVarHandle(PathElement.groupElement("error_resilient_mode"));
    /// The [VarHandle] of `disable_cdf_update` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_disable_cdf_update = LAYOUT.arrayElementVarHandle(PathElement.groupElement("disable_cdf_update"));
    /// The [VarHandle] of `use_superres` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_use_superres = LAYOUT.arrayElementVarHandle(PathElement.groupElement("use_superres"));
    /// The [VarHandle] of `render_and_frame_size_different` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_render_and_frame_size_different = LAYOUT.arrayElementVarHandle(PathElement.groupElement("render_and_frame_size_different"));
    /// The [VarHandle] of `allow_screen_content_tools` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_allow_screen_content_tools = LAYOUT.arrayElementVarHandle(PathElement.groupElement("allow_screen_content_tools"));
    /// The [VarHandle] of `is_filter_switchable` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_is_filter_switchable = LAYOUT.arrayElementVarHandle(PathElement.groupElement("is_filter_switchable"));
    /// The [VarHandle] of `force_integer_mv` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_force_integer_mv = LAYOUT.arrayElementVarHandle(PathElement.groupElement("force_integer_mv"));
    /// The [VarHandle] of `frame_size_override_flag` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_frame_size_override_flag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("frame_size_override_flag"));
    /// The [VarHandle] of `buffer_removal_time_present_flag` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_buffer_removal_time_present_flag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("buffer_removal_time_present_flag"));
    /// The [VarHandle] of `allow_intrabc` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_allow_intrabc = LAYOUT.arrayElementVarHandle(PathElement.groupElement("allow_intrabc"));
    /// The [VarHandle] of `frame_refs_short_signaling` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_frame_refs_short_signaling = LAYOUT.arrayElementVarHandle(PathElement.groupElement("frame_refs_short_signaling"));
    /// The [VarHandle] of `allow_high_precision_mv` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_allow_high_precision_mv = LAYOUT.arrayElementVarHandle(PathElement.groupElement("allow_high_precision_mv"));
    /// The [VarHandle] of `is_motion_mode_switchable` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_is_motion_mode_switchable = LAYOUT.arrayElementVarHandle(PathElement.groupElement("is_motion_mode_switchable"));
    /// The [VarHandle] of `use_ref_frame_mvs` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_use_ref_frame_mvs = LAYOUT.arrayElementVarHandle(PathElement.groupElement("use_ref_frame_mvs"));
    /// The [VarHandle] of `disable_frame_end_update_cdf` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_disable_frame_end_update_cdf = LAYOUT.arrayElementVarHandle(PathElement.groupElement("disable_frame_end_update_cdf"));
    /// The [VarHandle] of `allow_warped_motion` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_allow_warped_motion = LAYOUT.arrayElementVarHandle(PathElement.groupElement("allow_warped_motion"));
    /// The [VarHandle] of `reduced_tx_set` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_reduced_tx_set = LAYOUT.arrayElementVarHandle(PathElement.groupElement("reduced_tx_set"));
    /// The [VarHandle] of `reference_select` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_reference_select = LAYOUT.arrayElementVarHandle(PathElement.groupElement("reference_select"));
    /// The [VarHandle] of `skip_mode_present` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_skip_mode_present = LAYOUT.arrayElementVarHandle(PathElement.groupElement("skip_mode_present"));
    /// The [VarHandle] of `delta_q_present` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_delta_q_present = LAYOUT.arrayElementVarHandle(PathElement.groupElement("delta_q_present"));
    /// The [VarHandle] of `delta_lf_present` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_delta_lf_present = LAYOUT.arrayElementVarHandle(PathElement.groupElement("delta_lf_present"));
    /// The [VarHandle] of `delta_lf_multi` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_delta_lf_multi = LAYOUT.arrayElementVarHandle(PathElement.groupElement("delta_lf_multi"));
    /// The [VarHandle] of `segmentation_enabled` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_segmentation_enabled = LAYOUT.arrayElementVarHandle(PathElement.groupElement("segmentation_enabled"));
    /// The [VarHandle] of `segmentation_update_map` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_segmentation_update_map = LAYOUT.arrayElementVarHandle(PathElement.groupElement("segmentation_update_map"));
    /// The [VarHandle] of `segmentation_temporal_update` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_segmentation_temporal_update = LAYOUT.arrayElementVarHandle(PathElement.groupElement("segmentation_temporal_update"));
    /// The [VarHandle] of `segmentation_update_data` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_segmentation_update_data = LAYOUT.arrayElementVarHandle(PathElement.groupElement("segmentation_update_data"));
    /// The [VarHandle] of `UsesLr` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_UsesLr = LAYOUT.arrayElementVarHandle(PathElement.groupElement("UsesLr"));
    /// The [VarHandle] of `usesChromaLr` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_usesChromaLr = LAYOUT.arrayElementVarHandle(PathElement.groupElement("usesChromaLr"));
    /// The [VarHandle] of `apply_grain` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_apply_grain = LAYOUT.arrayElementVarHandle(PathElement.groupElement("apply_grain"));
    /// The [VarHandle] of `reserved` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_reserved = LAYOUT.arrayElementVarHandle(PathElement.groupElement("reserved"));

    /// Creates `StdVideoDecodeAV1PictureInfoFlags` with the given segment.
    /// @param segment the memory segment
    public StdVideoDecodeAV1PictureInfoFlags(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `StdVideoDecodeAV1PictureInfoFlags` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoDecodeAV1PictureInfoFlags of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new StdVideoDecodeAV1PictureInfoFlags(segment); }

    /// Creates `StdVideoDecodeAV1PictureInfoFlags` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `StdVideoDecodeAV1PictureInfoFlags` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoDecodeAV1PictureInfoFlags ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new StdVideoDecodeAV1PictureInfoFlags(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `StdVideoDecodeAV1PictureInfoFlags` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `StdVideoDecodeAV1PictureInfoFlags` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoDecodeAV1PictureInfoFlags`
    public static StdVideoDecodeAV1PictureInfoFlags alloc(SegmentAllocator allocator) { return new StdVideoDecodeAV1PictureInfoFlags(allocator.allocate(LAYOUT)); }

    /// Allocates a `StdVideoDecodeAV1PictureInfoFlags` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `StdVideoDecodeAV1PictureInfoFlags`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `StdVideoDecodeAV1PictureInfoFlags` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoDecodeAV1PictureInfoFlags`
    public static StdVideoDecodeAV1PictureInfoFlags allocInit(SegmentAllocator allocator, @CType("uint32_t : 1") int error_resilient_mode, @CType("uint32_t : 1") int disable_cdf_update, @CType("uint32_t : 1") int use_superres, @CType("uint32_t : 1") int render_and_frame_size_different, @CType("uint32_t : 1") int allow_screen_content_tools, @CType("uint32_t : 1") int is_filter_switchable, @CType("uint32_t : 1") int force_integer_mv, @CType("uint32_t : 1") int frame_size_override_flag, @CType("uint32_t : 1") int buffer_removal_time_present_flag, @CType("uint32_t : 1") int allow_intrabc, @CType("uint32_t : 1") int frame_refs_short_signaling, @CType("uint32_t : 1") int allow_high_precision_mv, @CType("uint32_t : 1") int is_motion_mode_switchable, @CType("uint32_t : 1") int use_ref_frame_mvs, @CType("uint32_t : 1") int disable_frame_end_update_cdf, @CType("uint32_t : 1") int allow_warped_motion, @CType("uint32_t : 1") int reduced_tx_set, @CType("uint32_t : 1") int reference_select, @CType("uint32_t : 1") int skip_mode_present, @CType("uint32_t : 1") int delta_q_present, @CType("uint32_t : 1") int delta_lf_present, @CType("uint32_t : 1") int delta_lf_multi, @CType("uint32_t : 1") int segmentation_enabled, @CType("uint32_t : 1") int segmentation_update_map, @CType("uint32_t : 1") int segmentation_temporal_update, @CType("uint32_t : 1") int segmentation_update_data, @CType("uint32_t : 1") int UsesLr, @CType("uint32_t : 1") int usesChromaLr, @CType("uint32_t : 1") int apply_grain, @CType("uint32_t : 3") int reserved) { return alloc(allocator).error_resilient_mode(error_resilient_mode).disable_cdf_update(disable_cdf_update).use_superres(use_superres).render_and_frame_size_different(render_and_frame_size_different).allow_screen_content_tools(allow_screen_content_tools).is_filter_switchable(is_filter_switchable).force_integer_mv(force_integer_mv).frame_size_override_flag(frame_size_override_flag).buffer_removal_time_present_flag(buffer_removal_time_present_flag).allow_intrabc(allow_intrabc).frame_refs_short_signaling(frame_refs_short_signaling).allow_high_precision_mv(allow_high_precision_mv).is_motion_mode_switchable(is_motion_mode_switchable).use_ref_frame_mvs(use_ref_frame_mvs).disable_frame_end_update_cdf(disable_frame_end_update_cdf).allow_warped_motion(allow_warped_motion).reduced_tx_set(reduced_tx_set).reference_select(reference_select).skip_mode_present(skip_mode_present).delta_q_present(delta_q_present).delta_lf_present(delta_lf_present).delta_lf_multi(delta_lf_multi).segmentation_enabled(segmentation_enabled).segmentation_update_map(segmentation_update_map).segmentation_temporal_update(segmentation_temporal_update).segmentation_update_data(segmentation_update_data).UsesLr(UsesLr).usesChromaLr(usesChromaLr).apply_grain(apply_grain).reserved(reserved); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public StdVideoDecodeAV1PictureInfoFlags copyFrom(StdVideoDecodeAV1PictureInfoFlags src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `error_resilient_mode` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_error_resilient_mode(MemorySegment segment, long index) { return (int) VH_error_resilient_mode.get(segment, 0L, index); }
    /// {@return `error_resilient_mode`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_error_resilient_mode(MemorySegment segment) { return StdVideoDecodeAV1PictureInfoFlags.get_error_resilient_mode(segment, 0L); }
    /// {@return `error_resilient_mode`}
    public @CType("uint32_t : 1") int error_resilient_mode() { return StdVideoDecodeAV1PictureInfoFlags.get_error_resilient_mode(this.segment()); }
    /// Sets `error_resilient_mode` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_error_resilient_mode(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_error_resilient_mode.set(segment, 0L, index, value); }
    /// Sets `error_resilient_mode` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_error_resilient_mode(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoDecodeAV1PictureInfoFlags.set_error_resilient_mode(segment, 0L, value); }
    /// Sets `error_resilient_mode` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoDecodeAV1PictureInfoFlags error_resilient_mode(@CType("uint32_t : 1") int value) { StdVideoDecodeAV1PictureInfoFlags.set_error_resilient_mode(this.segment(), value); return this; }

    /// {@return `disable_cdf_update` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_disable_cdf_update(MemorySegment segment, long index) { return (int) VH_disable_cdf_update.get(segment, 0L, index); }
    /// {@return `disable_cdf_update`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_disable_cdf_update(MemorySegment segment) { return StdVideoDecodeAV1PictureInfoFlags.get_disable_cdf_update(segment, 0L); }
    /// {@return `disable_cdf_update`}
    public @CType("uint32_t : 1") int disable_cdf_update() { return StdVideoDecodeAV1PictureInfoFlags.get_disable_cdf_update(this.segment()); }
    /// Sets `disable_cdf_update` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_disable_cdf_update(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_disable_cdf_update.set(segment, 0L, index, value); }
    /// Sets `disable_cdf_update` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_disable_cdf_update(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoDecodeAV1PictureInfoFlags.set_disable_cdf_update(segment, 0L, value); }
    /// Sets `disable_cdf_update` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoDecodeAV1PictureInfoFlags disable_cdf_update(@CType("uint32_t : 1") int value) { StdVideoDecodeAV1PictureInfoFlags.set_disable_cdf_update(this.segment(), value); return this; }

    /// {@return `use_superres` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_use_superres(MemorySegment segment, long index) { return (int) VH_use_superres.get(segment, 0L, index); }
    /// {@return `use_superres`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_use_superres(MemorySegment segment) { return StdVideoDecodeAV1PictureInfoFlags.get_use_superres(segment, 0L); }
    /// {@return `use_superres`}
    public @CType("uint32_t : 1") int use_superres() { return StdVideoDecodeAV1PictureInfoFlags.get_use_superres(this.segment()); }
    /// Sets `use_superres` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_use_superres(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_use_superres.set(segment, 0L, index, value); }
    /// Sets `use_superres` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_use_superres(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoDecodeAV1PictureInfoFlags.set_use_superres(segment, 0L, value); }
    /// Sets `use_superres` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoDecodeAV1PictureInfoFlags use_superres(@CType("uint32_t : 1") int value) { StdVideoDecodeAV1PictureInfoFlags.set_use_superres(this.segment(), value); return this; }

    /// {@return `render_and_frame_size_different` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_render_and_frame_size_different(MemorySegment segment, long index) { return (int) VH_render_and_frame_size_different.get(segment, 0L, index); }
    /// {@return `render_and_frame_size_different`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_render_and_frame_size_different(MemorySegment segment) { return StdVideoDecodeAV1PictureInfoFlags.get_render_and_frame_size_different(segment, 0L); }
    /// {@return `render_and_frame_size_different`}
    public @CType("uint32_t : 1") int render_and_frame_size_different() { return StdVideoDecodeAV1PictureInfoFlags.get_render_and_frame_size_different(this.segment()); }
    /// Sets `render_and_frame_size_different` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_render_and_frame_size_different(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_render_and_frame_size_different.set(segment, 0L, index, value); }
    /// Sets `render_and_frame_size_different` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_render_and_frame_size_different(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoDecodeAV1PictureInfoFlags.set_render_and_frame_size_different(segment, 0L, value); }
    /// Sets `render_and_frame_size_different` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoDecodeAV1PictureInfoFlags render_and_frame_size_different(@CType("uint32_t : 1") int value) { StdVideoDecodeAV1PictureInfoFlags.set_render_and_frame_size_different(this.segment(), value); return this; }

    /// {@return `allow_screen_content_tools` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_allow_screen_content_tools(MemorySegment segment, long index) { return (int) VH_allow_screen_content_tools.get(segment, 0L, index); }
    /// {@return `allow_screen_content_tools`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_allow_screen_content_tools(MemorySegment segment) { return StdVideoDecodeAV1PictureInfoFlags.get_allow_screen_content_tools(segment, 0L); }
    /// {@return `allow_screen_content_tools`}
    public @CType("uint32_t : 1") int allow_screen_content_tools() { return StdVideoDecodeAV1PictureInfoFlags.get_allow_screen_content_tools(this.segment()); }
    /// Sets `allow_screen_content_tools` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_allow_screen_content_tools(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_allow_screen_content_tools.set(segment, 0L, index, value); }
    /// Sets `allow_screen_content_tools` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_allow_screen_content_tools(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoDecodeAV1PictureInfoFlags.set_allow_screen_content_tools(segment, 0L, value); }
    /// Sets `allow_screen_content_tools` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoDecodeAV1PictureInfoFlags allow_screen_content_tools(@CType("uint32_t : 1") int value) { StdVideoDecodeAV1PictureInfoFlags.set_allow_screen_content_tools(this.segment(), value); return this; }

    /// {@return `is_filter_switchable` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_is_filter_switchable(MemorySegment segment, long index) { return (int) VH_is_filter_switchable.get(segment, 0L, index); }
    /// {@return `is_filter_switchable`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_is_filter_switchable(MemorySegment segment) { return StdVideoDecodeAV1PictureInfoFlags.get_is_filter_switchable(segment, 0L); }
    /// {@return `is_filter_switchable`}
    public @CType("uint32_t : 1") int is_filter_switchable() { return StdVideoDecodeAV1PictureInfoFlags.get_is_filter_switchable(this.segment()); }
    /// Sets `is_filter_switchable` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_is_filter_switchable(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_is_filter_switchable.set(segment, 0L, index, value); }
    /// Sets `is_filter_switchable` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_is_filter_switchable(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoDecodeAV1PictureInfoFlags.set_is_filter_switchable(segment, 0L, value); }
    /// Sets `is_filter_switchable` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoDecodeAV1PictureInfoFlags is_filter_switchable(@CType("uint32_t : 1") int value) { StdVideoDecodeAV1PictureInfoFlags.set_is_filter_switchable(this.segment(), value); return this; }

    /// {@return `force_integer_mv` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_force_integer_mv(MemorySegment segment, long index) { return (int) VH_force_integer_mv.get(segment, 0L, index); }
    /// {@return `force_integer_mv`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_force_integer_mv(MemorySegment segment) { return StdVideoDecodeAV1PictureInfoFlags.get_force_integer_mv(segment, 0L); }
    /// {@return `force_integer_mv`}
    public @CType("uint32_t : 1") int force_integer_mv() { return StdVideoDecodeAV1PictureInfoFlags.get_force_integer_mv(this.segment()); }
    /// Sets `force_integer_mv` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_force_integer_mv(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_force_integer_mv.set(segment, 0L, index, value); }
    /// Sets `force_integer_mv` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_force_integer_mv(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoDecodeAV1PictureInfoFlags.set_force_integer_mv(segment, 0L, value); }
    /// Sets `force_integer_mv` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoDecodeAV1PictureInfoFlags force_integer_mv(@CType("uint32_t : 1") int value) { StdVideoDecodeAV1PictureInfoFlags.set_force_integer_mv(this.segment(), value); return this; }

    /// {@return `frame_size_override_flag` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_frame_size_override_flag(MemorySegment segment, long index) { return (int) VH_frame_size_override_flag.get(segment, 0L, index); }
    /// {@return `frame_size_override_flag`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_frame_size_override_flag(MemorySegment segment) { return StdVideoDecodeAV1PictureInfoFlags.get_frame_size_override_flag(segment, 0L); }
    /// {@return `frame_size_override_flag`}
    public @CType("uint32_t : 1") int frame_size_override_flag() { return StdVideoDecodeAV1PictureInfoFlags.get_frame_size_override_flag(this.segment()); }
    /// Sets `frame_size_override_flag` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_frame_size_override_flag(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_frame_size_override_flag.set(segment, 0L, index, value); }
    /// Sets `frame_size_override_flag` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_frame_size_override_flag(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoDecodeAV1PictureInfoFlags.set_frame_size_override_flag(segment, 0L, value); }
    /// Sets `frame_size_override_flag` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoDecodeAV1PictureInfoFlags frame_size_override_flag(@CType("uint32_t : 1") int value) { StdVideoDecodeAV1PictureInfoFlags.set_frame_size_override_flag(this.segment(), value); return this; }

    /// {@return `buffer_removal_time_present_flag` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_buffer_removal_time_present_flag(MemorySegment segment, long index) { return (int) VH_buffer_removal_time_present_flag.get(segment, 0L, index); }
    /// {@return `buffer_removal_time_present_flag`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_buffer_removal_time_present_flag(MemorySegment segment) { return StdVideoDecodeAV1PictureInfoFlags.get_buffer_removal_time_present_flag(segment, 0L); }
    /// {@return `buffer_removal_time_present_flag`}
    public @CType("uint32_t : 1") int buffer_removal_time_present_flag() { return StdVideoDecodeAV1PictureInfoFlags.get_buffer_removal_time_present_flag(this.segment()); }
    /// Sets `buffer_removal_time_present_flag` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_buffer_removal_time_present_flag(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_buffer_removal_time_present_flag.set(segment, 0L, index, value); }
    /// Sets `buffer_removal_time_present_flag` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_buffer_removal_time_present_flag(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoDecodeAV1PictureInfoFlags.set_buffer_removal_time_present_flag(segment, 0L, value); }
    /// Sets `buffer_removal_time_present_flag` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoDecodeAV1PictureInfoFlags buffer_removal_time_present_flag(@CType("uint32_t : 1") int value) { StdVideoDecodeAV1PictureInfoFlags.set_buffer_removal_time_present_flag(this.segment(), value); return this; }

    /// {@return `allow_intrabc` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_allow_intrabc(MemorySegment segment, long index) { return (int) VH_allow_intrabc.get(segment, 0L, index); }
    /// {@return `allow_intrabc`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_allow_intrabc(MemorySegment segment) { return StdVideoDecodeAV1PictureInfoFlags.get_allow_intrabc(segment, 0L); }
    /// {@return `allow_intrabc`}
    public @CType("uint32_t : 1") int allow_intrabc() { return StdVideoDecodeAV1PictureInfoFlags.get_allow_intrabc(this.segment()); }
    /// Sets `allow_intrabc` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_allow_intrabc(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_allow_intrabc.set(segment, 0L, index, value); }
    /// Sets `allow_intrabc` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_allow_intrabc(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoDecodeAV1PictureInfoFlags.set_allow_intrabc(segment, 0L, value); }
    /// Sets `allow_intrabc` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoDecodeAV1PictureInfoFlags allow_intrabc(@CType("uint32_t : 1") int value) { StdVideoDecodeAV1PictureInfoFlags.set_allow_intrabc(this.segment(), value); return this; }

    /// {@return `frame_refs_short_signaling` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_frame_refs_short_signaling(MemorySegment segment, long index) { return (int) VH_frame_refs_short_signaling.get(segment, 0L, index); }
    /// {@return `frame_refs_short_signaling`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_frame_refs_short_signaling(MemorySegment segment) { return StdVideoDecodeAV1PictureInfoFlags.get_frame_refs_short_signaling(segment, 0L); }
    /// {@return `frame_refs_short_signaling`}
    public @CType("uint32_t : 1") int frame_refs_short_signaling() { return StdVideoDecodeAV1PictureInfoFlags.get_frame_refs_short_signaling(this.segment()); }
    /// Sets `frame_refs_short_signaling` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_frame_refs_short_signaling(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_frame_refs_short_signaling.set(segment, 0L, index, value); }
    /// Sets `frame_refs_short_signaling` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_frame_refs_short_signaling(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoDecodeAV1PictureInfoFlags.set_frame_refs_short_signaling(segment, 0L, value); }
    /// Sets `frame_refs_short_signaling` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoDecodeAV1PictureInfoFlags frame_refs_short_signaling(@CType("uint32_t : 1") int value) { StdVideoDecodeAV1PictureInfoFlags.set_frame_refs_short_signaling(this.segment(), value); return this; }

    /// {@return `allow_high_precision_mv` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_allow_high_precision_mv(MemorySegment segment, long index) { return (int) VH_allow_high_precision_mv.get(segment, 0L, index); }
    /// {@return `allow_high_precision_mv`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_allow_high_precision_mv(MemorySegment segment) { return StdVideoDecodeAV1PictureInfoFlags.get_allow_high_precision_mv(segment, 0L); }
    /// {@return `allow_high_precision_mv`}
    public @CType("uint32_t : 1") int allow_high_precision_mv() { return StdVideoDecodeAV1PictureInfoFlags.get_allow_high_precision_mv(this.segment()); }
    /// Sets `allow_high_precision_mv` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_allow_high_precision_mv(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_allow_high_precision_mv.set(segment, 0L, index, value); }
    /// Sets `allow_high_precision_mv` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_allow_high_precision_mv(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoDecodeAV1PictureInfoFlags.set_allow_high_precision_mv(segment, 0L, value); }
    /// Sets `allow_high_precision_mv` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoDecodeAV1PictureInfoFlags allow_high_precision_mv(@CType("uint32_t : 1") int value) { StdVideoDecodeAV1PictureInfoFlags.set_allow_high_precision_mv(this.segment(), value); return this; }

    /// {@return `is_motion_mode_switchable` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_is_motion_mode_switchable(MemorySegment segment, long index) { return (int) VH_is_motion_mode_switchable.get(segment, 0L, index); }
    /// {@return `is_motion_mode_switchable`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_is_motion_mode_switchable(MemorySegment segment) { return StdVideoDecodeAV1PictureInfoFlags.get_is_motion_mode_switchable(segment, 0L); }
    /// {@return `is_motion_mode_switchable`}
    public @CType("uint32_t : 1") int is_motion_mode_switchable() { return StdVideoDecodeAV1PictureInfoFlags.get_is_motion_mode_switchable(this.segment()); }
    /// Sets `is_motion_mode_switchable` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_is_motion_mode_switchable(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_is_motion_mode_switchable.set(segment, 0L, index, value); }
    /// Sets `is_motion_mode_switchable` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_is_motion_mode_switchable(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoDecodeAV1PictureInfoFlags.set_is_motion_mode_switchable(segment, 0L, value); }
    /// Sets `is_motion_mode_switchable` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoDecodeAV1PictureInfoFlags is_motion_mode_switchable(@CType("uint32_t : 1") int value) { StdVideoDecodeAV1PictureInfoFlags.set_is_motion_mode_switchable(this.segment(), value); return this; }

    /// {@return `use_ref_frame_mvs` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_use_ref_frame_mvs(MemorySegment segment, long index) { return (int) VH_use_ref_frame_mvs.get(segment, 0L, index); }
    /// {@return `use_ref_frame_mvs`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_use_ref_frame_mvs(MemorySegment segment) { return StdVideoDecodeAV1PictureInfoFlags.get_use_ref_frame_mvs(segment, 0L); }
    /// {@return `use_ref_frame_mvs`}
    public @CType("uint32_t : 1") int use_ref_frame_mvs() { return StdVideoDecodeAV1PictureInfoFlags.get_use_ref_frame_mvs(this.segment()); }
    /// Sets `use_ref_frame_mvs` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_use_ref_frame_mvs(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_use_ref_frame_mvs.set(segment, 0L, index, value); }
    /// Sets `use_ref_frame_mvs` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_use_ref_frame_mvs(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoDecodeAV1PictureInfoFlags.set_use_ref_frame_mvs(segment, 0L, value); }
    /// Sets `use_ref_frame_mvs` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoDecodeAV1PictureInfoFlags use_ref_frame_mvs(@CType("uint32_t : 1") int value) { StdVideoDecodeAV1PictureInfoFlags.set_use_ref_frame_mvs(this.segment(), value); return this; }

    /// {@return `disable_frame_end_update_cdf` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_disable_frame_end_update_cdf(MemorySegment segment, long index) { return (int) VH_disable_frame_end_update_cdf.get(segment, 0L, index); }
    /// {@return `disable_frame_end_update_cdf`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_disable_frame_end_update_cdf(MemorySegment segment) { return StdVideoDecodeAV1PictureInfoFlags.get_disable_frame_end_update_cdf(segment, 0L); }
    /// {@return `disable_frame_end_update_cdf`}
    public @CType("uint32_t : 1") int disable_frame_end_update_cdf() { return StdVideoDecodeAV1PictureInfoFlags.get_disable_frame_end_update_cdf(this.segment()); }
    /// Sets `disable_frame_end_update_cdf` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_disable_frame_end_update_cdf(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_disable_frame_end_update_cdf.set(segment, 0L, index, value); }
    /// Sets `disable_frame_end_update_cdf` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_disable_frame_end_update_cdf(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoDecodeAV1PictureInfoFlags.set_disable_frame_end_update_cdf(segment, 0L, value); }
    /// Sets `disable_frame_end_update_cdf` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoDecodeAV1PictureInfoFlags disable_frame_end_update_cdf(@CType("uint32_t : 1") int value) { StdVideoDecodeAV1PictureInfoFlags.set_disable_frame_end_update_cdf(this.segment(), value); return this; }

    /// {@return `allow_warped_motion` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_allow_warped_motion(MemorySegment segment, long index) { return (int) VH_allow_warped_motion.get(segment, 0L, index); }
    /// {@return `allow_warped_motion`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_allow_warped_motion(MemorySegment segment) { return StdVideoDecodeAV1PictureInfoFlags.get_allow_warped_motion(segment, 0L); }
    /// {@return `allow_warped_motion`}
    public @CType("uint32_t : 1") int allow_warped_motion() { return StdVideoDecodeAV1PictureInfoFlags.get_allow_warped_motion(this.segment()); }
    /// Sets `allow_warped_motion` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_allow_warped_motion(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_allow_warped_motion.set(segment, 0L, index, value); }
    /// Sets `allow_warped_motion` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_allow_warped_motion(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoDecodeAV1PictureInfoFlags.set_allow_warped_motion(segment, 0L, value); }
    /// Sets `allow_warped_motion` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoDecodeAV1PictureInfoFlags allow_warped_motion(@CType("uint32_t : 1") int value) { StdVideoDecodeAV1PictureInfoFlags.set_allow_warped_motion(this.segment(), value); return this; }

    /// {@return `reduced_tx_set` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_reduced_tx_set(MemorySegment segment, long index) { return (int) VH_reduced_tx_set.get(segment, 0L, index); }
    /// {@return `reduced_tx_set`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_reduced_tx_set(MemorySegment segment) { return StdVideoDecodeAV1PictureInfoFlags.get_reduced_tx_set(segment, 0L); }
    /// {@return `reduced_tx_set`}
    public @CType("uint32_t : 1") int reduced_tx_set() { return StdVideoDecodeAV1PictureInfoFlags.get_reduced_tx_set(this.segment()); }
    /// Sets `reduced_tx_set` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_reduced_tx_set(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_reduced_tx_set.set(segment, 0L, index, value); }
    /// Sets `reduced_tx_set` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_reduced_tx_set(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoDecodeAV1PictureInfoFlags.set_reduced_tx_set(segment, 0L, value); }
    /// Sets `reduced_tx_set` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoDecodeAV1PictureInfoFlags reduced_tx_set(@CType("uint32_t : 1") int value) { StdVideoDecodeAV1PictureInfoFlags.set_reduced_tx_set(this.segment(), value); return this; }

    /// {@return `reference_select` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_reference_select(MemorySegment segment, long index) { return (int) VH_reference_select.get(segment, 0L, index); }
    /// {@return `reference_select`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_reference_select(MemorySegment segment) { return StdVideoDecodeAV1PictureInfoFlags.get_reference_select(segment, 0L); }
    /// {@return `reference_select`}
    public @CType("uint32_t : 1") int reference_select() { return StdVideoDecodeAV1PictureInfoFlags.get_reference_select(this.segment()); }
    /// Sets `reference_select` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_reference_select(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_reference_select.set(segment, 0L, index, value); }
    /// Sets `reference_select` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_reference_select(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoDecodeAV1PictureInfoFlags.set_reference_select(segment, 0L, value); }
    /// Sets `reference_select` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoDecodeAV1PictureInfoFlags reference_select(@CType("uint32_t : 1") int value) { StdVideoDecodeAV1PictureInfoFlags.set_reference_select(this.segment(), value); return this; }

    /// {@return `skip_mode_present` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_skip_mode_present(MemorySegment segment, long index) { return (int) VH_skip_mode_present.get(segment, 0L, index); }
    /// {@return `skip_mode_present`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_skip_mode_present(MemorySegment segment) { return StdVideoDecodeAV1PictureInfoFlags.get_skip_mode_present(segment, 0L); }
    /// {@return `skip_mode_present`}
    public @CType("uint32_t : 1") int skip_mode_present() { return StdVideoDecodeAV1PictureInfoFlags.get_skip_mode_present(this.segment()); }
    /// Sets `skip_mode_present` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_skip_mode_present(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_skip_mode_present.set(segment, 0L, index, value); }
    /// Sets `skip_mode_present` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_skip_mode_present(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoDecodeAV1PictureInfoFlags.set_skip_mode_present(segment, 0L, value); }
    /// Sets `skip_mode_present` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoDecodeAV1PictureInfoFlags skip_mode_present(@CType("uint32_t : 1") int value) { StdVideoDecodeAV1PictureInfoFlags.set_skip_mode_present(this.segment(), value); return this; }

    /// {@return `delta_q_present` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_delta_q_present(MemorySegment segment, long index) { return (int) VH_delta_q_present.get(segment, 0L, index); }
    /// {@return `delta_q_present`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_delta_q_present(MemorySegment segment) { return StdVideoDecodeAV1PictureInfoFlags.get_delta_q_present(segment, 0L); }
    /// {@return `delta_q_present`}
    public @CType("uint32_t : 1") int delta_q_present() { return StdVideoDecodeAV1PictureInfoFlags.get_delta_q_present(this.segment()); }
    /// Sets `delta_q_present` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_delta_q_present(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_delta_q_present.set(segment, 0L, index, value); }
    /// Sets `delta_q_present` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_delta_q_present(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoDecodeAV1PictureInfoFlags.set_delta_q_present(segment, 0L, value); }
    /// Sets `delta_q_present` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoDecodeAV1PictureInfoFlags delta_q_present(@CType("uint32_t : 1") int value) { StdVideoDecodeAV1PictureInfoFlags.set_delta_q_present(this.segment(), value); return this; }

    /// {@return `delta_lf_present` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_delta_lf_present(MemorySegment segment, long index) { return (int) VH_delta_lf_present.get(segment, 0L, index); }
    /// {@return `delta_lf_present`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_delta_lf_present(MemorySegment segment) { return StdVideoDecodeAV1PictureInfoFlags.get_delta_lf_present(segment, 0L); }
    /// {@return `delta_lf_present`}
    public @CType("uint32_t : 1") int delta_lf_present() { return StdVideoDecodeAV1PictureInfoFlags.get_delta_lf_present(this.segment()); }
    /// Sets `delta_lf_present` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_delta_lf_present(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_delta_lf_present.set(segment, 0L, index, value); }
    /// Sets `delta_lf_present` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_delta_lf_present(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoDecodeAV1PictureInfoFlags.set_delta_lf_present(segment, 0L, value); }
    /// Sets `delta_lf_present` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoDecodeAV1PictureInfoFlags delta_lf_present(@CType("uint32_t : 1") int value) { StdVideoDecodeAV1PictureInfoFlags.set_delta_lf_present(this.segment(), value); return this; }

    /// {@return `delta_lf_multi` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_delta_lf_multi(MemorySegment segment, long index) { return (int) VH_delta_lf_multi.get(segment, 0L, index); }
    /// {@return `delta_lf_multi`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_delta_lf_multi(MemorySegment segment) { return StdVideoDecodeAV1PictureInfoFlags.get_delta_lf_multi(segment, 0L); }
    /// {@return `delta_lf_multi`}
    public @CType("uint32_t : 1") int delta_lf_multi() { return StdVideoDecodeAV1PictureInfoFlags.get_delta_lf_multi(this.segment()); }
    /// Sets `delta_lf_multi` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_delta_lf_multi(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_delta_lf_multi.set(segment, 0L, index, value); }
    /// Sets `delta_lf_multi` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_delta_lf_multi(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoDecodeAV1PictureInfoFlags.set_delta_lf_multi(segment, 0L, value); }
    /// Sets `delta_lf_multi` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoDecodeAV1PictureInfoFlags delta_lf_multi(@CType("uint32_t : 1") int value) { StdVideoDecodeAV1PictureInfoFlags.set_delta_lf_multi(this.segment(), value); return this; }

    /// {@return `segmentation_enabled` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_segmentation_enabled(MemorySegment segment, long index) { return (int) VH_segmentation_enabled.get(segment, 0L, index); }
    /// {@return `segmentation_enabled`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_segmentation_enabled(MemorySegment segment) { return StdVideoDecodeAV1PictureInfoFlags.get_segmentation_enabled(segment, 0L); }
    /// {@return `segmentation_enabled`}
    public @CType("uint32_t : 1") int segmentation_enabled() { return StdVideoDecodeAV1PictureInfoFlags.get_segmentation_enabled(this.segment()); }
    /// Sets `segmentation_enabled` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_segmentation_enabled(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_segmentation_enabled.set(segment, 0L, index, value); }
    /// Sets `segmentation_enabled` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_segmentation_enabled(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoDecodeAV1PictureInfoFlags.set_segmentation_enabled(segment, 0L, value); }
    /// Sets `segmentation_enabled` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoDecodeAV1PictureInfoFlags segmentation_enabled(@CType("uint32_t : 1") int value) { StdVideoDecodeAV1PictureInfoFlags.set_segmentation_enabled(this.segment(), value); return this; }

    /// {@return `segmentation_update_map` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_segmentation_update_map(MemorySegment segment, long index) { return (int) VH_segmentation_update_map.get(segment, 0L, index); }
    /// {@return `segmentation_update_map`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_segmentation_update_map(MemorySegment segment) { return StdVideoDecodeAV1PictureInfoFlags.get_segmentation_update_map(segment, 0L); }
    /// {@return `segmentation_update_map`}
    public @CType("uint32_t : 1") int segmentation_update_map() { return StdVideoDecodeAV1PictureInfoFlags.get_segmentation_update_map(this.segment()); }
    /// Sets `segmentation_update_map` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_segmentation_update_map(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_segmentation_update_map.set(segment, 0L, index, value); }
    /// Sets `segmentation_update_map` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_segmentation_update_map(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoDecodeAV1PictureInfoFlags.set_segmentation_update_map(segment, 0L, value); }
    /// Sets `segmentation_update_map` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoDecodeAV1PictureInfoFlags segmentation_update_map(@CType("uint32_t : 1") int value) { StdVideoDecodeAV1PictureInfoFlags.set_segmentation_update_map(this.segment(), value); return this; }

    /// {@return `segmentation_temporal_update` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_segmentation_temporal_update(MemorySegment segment, long index) { return (int) VH_segmentation_temporal_update.get(segment, 0L, index); }
    /// {@return `segmentation_temporal_update`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_segmentation_temporal_update(MemorySegment segment) { return StdVideoDecodeAV1PictureInfoFlags.get_segmentation_temporal_update(segment, 0L); }
    /// {@return `segmentation_temporal_update`}
    public @CType("uint32_t : 1") int segmentation_temporal_update() { return StdVideoDecodeAV1PictureInfoFlags.get_segmentation_temporal_update(this.segment()); }
    /// Sets `segmentation_temporal_update` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_segmentation_temporal_update(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_segmentation_temporal_update.set(segment, 0L, index, value); }
    /// Sets `segmentation_temporal_update` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_segmentation_temporal_update(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoDecodeAV1PictureInfoFlags.set_segmentation_temporal_update(segment, 0L, value); }
    /// Sets `segmentation_temporal_update` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoDecodeAV1PictureInfoFlags segmentation_temporal_update(@CType("uint32_t : 1") int value) { StdVideoDecodeAV1PictureInfoFlags.set_segmentation_temporal_update(this.segment(), value); return this; }

    /// {@return `segmentation_update_data` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_segmentation_update_data(MemorySegment segment, long index) { return (int) VH_segmentation_update_data.get(segment, 0L, index); }
    /// {@return `segmentation_update_data`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_segmentation_update_data(MemorySegment segment) { return StdVideoDecodeAV1PictureInfoFlags.get_segmentation_update_data(segment, 0L); }
    /// {@return `segmentation_update_data`}
    public @CType("uint32_t : 1") int segmentation_update_data() { return StdVideoDecodeAV1PictureInfoFlags.get_segmentation_update_data(this.segment()); }
    /// Sets `segmentation_update_data` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_segmentation_update_data(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_segmentation_update_data.set(segment, 0L, index, value); }
    /// Sets `segmentation_update_data` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_segmentation_update_data(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoDecodeAV1PictureInfoFlags.set_segmentation_update_data(segment, 0L, value); }
    /// Sets `segmentation_update_data` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoDecodeAV1PictureInfoFlags segmentation_update_data(@CType("uint32_t : 1") int value) { StdVideoDecodeAV1PictureInfoFlags.set_segmentation_update_data(this.segment(), value); return this; }

    /// {@return `UsesLr` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_UsesLr(MemorySegment segment, long index) { return (int) VH_UsesLr.get(segment, 0L, index); }
    /// {@return `UsesLr`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_UsesLr(MemorySegment segment) { return StdVideoDecodeAV1PictureInfoFlags.get_UsesLr(segment, 0L); }
    /// {@return `UsesLr`}
    public @CType("uint32_t : 1") int UsesLr() { return StdVideoDecodeAV1PictureInfoFlags.get_UsesLr(this.segment()); }
    /// Sets `UsesLr` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_UsesLr(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_UsesLr.set(segment, 0L, index, value); }
    /// Sets `UsesLr` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_UsesLr(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoDecodeAV1PictureInfoFlags.set_UsesLr(segment, 0L, value); }
    /// Sets `UsesLr` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoDecodeAV1PictureInfoFlags UsesLr(@CType("uint32_t : 1") int value) { StdVideoDecodeAV1PictureInfoFlags.set_UsesLr(this.segment(), value); return this; }

    /// {@return `usesChromaLr` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_usesChromaLr(MemorySegment segment, long index) { return (int) VH_usesChromaLr.get(segment, 0L, index); }
    /// {@return `usesChromaLr`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_usesChromaLr(MemorySegment segment) { return StdVideoDecodeAV1PictureInfoFlags.get_usesChromaLr(segment, 0L); }
    /// {@return `usesChromaLr`}
    public @CType("uint32_t : 1") int usesChromaLr() { return StdVideoDecodeAV1PictureInfoFlags.get_usesChromaLr(this.segment()); }
    /// Sets `usesChromaLr` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_usesChromaLr(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_usesChromaLr.set(segment, 0L, index, value); }
    /// Sets `usesChromaLr` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_usesChromaLr(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoDecodeAV1PictureInfoFlags.set_usesChromaLr(segment, 0L, value); }
    /// Sets `usesChromaLr` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoDecodeAV1PictureInfoFlags usesChromaLr(@CType("uint32_t : 1") int value) { StdVideoDecodeAV1PictureInfoFlags.set_usesChromaLr(this.segment(), value); return this; }

    /// {@return `apply_grain` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_apply_grain(MemorySegment segment, long index) { return (int) VH_apply_grain.get(segment, 0L, index); }
    /// {@return `apply_grain`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_apply_grain(MemorySegment segment) { return StdVideoDecodeAV1PictureInfoFlags.get_apply_grain(segment, 0L); }
    /// {@return `apply_grain`}
    public @CType("uint32_t : 1") int apply_grain() { return StdVideoDecodeAV1PictureInfoFlags.get_apply_grain(this.segment()); }
    /// Sets `apply_grain` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_apply_grain(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_apply_grain.set(segment, 0L, index, value); }
    /// Sets `apply_grain` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_apply_grain(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoDecodeAV1PictureInfoFlags.set_apply_grain(segment, 0L, value); }
    /// Sets `apply_grain` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoDecodeAV1PictureInfoFlags apply_grain(@CType("uint32_t : 1") int value) { StdVideoDecodeAV1PictureInfoFlags.set_apply_grain(this.segment(), value); return this; }

    /// {@return `reserved` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 3") int get_reserved(MemorySegment segment, long index) { return (int) VH_reserved.get(segment, 0L, index); }
    /// {@return `reserved`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 3") int get_reserved(MemorySegment segment) { return StdVideoDecodeAV1PictureInfoFlags.get_reserved(segment, 0L); }
    /// {@return `reserved`}
    public @CType("uint32_t : 3") int reserved() { return StdVideoDecodeAV1PictureInfoFlags.get_reserved(this.segment()); }
    /// Sets `reserved` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_reserved(MemorySegment segment, long index, @CType("uint32_t : 3") int value) { VH_reserved.set(segment, 0L, index, value); }
    /// Sets `reserved` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_reserved(MemorySegment segment, @CType("uint32_t : 3") int value) { StdVideoDecodeAV1PictureInfoFlags.set_reserved(segment, 0L, value); }
    /// Sets `reserved` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoDecodeAV1PictureInfoFlags reserved(@CType("uint32_t : 3") int value) { StdVideoDecodeAV1PictureInfoFlags.set_reserved(this.segment(), value); return this; }

    /// A buffer of [StdVideoDecodeAV1PictureInfoFlags].
    public static final class Buffer extends StdVideoDecodeAV1PictureInfoFlags {
        private final long elementCount;

        /// Creates `StdVideoDecodeAV1PictureInfoFlags.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `StdVideoDecodeAV1PictureInfoFlags`.
        /// @param index the index of the struct buffer
        /// @return the slice of `StdVideoDecodeAV1PictureInfoFlags`
        public StdVideoDecodeAV1PictureInfoFlags asSlice(long index) { return new StdVideoDecodeAV1PictureInfoFlags(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `StdVideoDecodeAV1PictureInfoFlags`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `StdVideoDecodeAV1PictureInfoFlags`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `error_resilient_mode` at the given index}
        /// @param index the index
        public @CType("uint32_t : 1") int error_resilient_modeAt(long index) { return StdVideoDecodeAV1PictureInfoFlags.get_error_resilient_mode(this.segment(), index); }
        /// Sets `error_resilient_mode` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer error_resilient_modeAt(long index, @CType("uint32_t : 1") int value) { StdVideoDecodeAV1PictureInfoFlags.set_error_resilient_mode(this.segment(), index, value); return this; }

        /// {@return `disable_cdf_update` at the given index}
        /// @param index the index
        public @CType("uint32_t : 1") int disable_cdf_updateAt(long index) { return StdVideoDecodeAV1PictureInfoFlags.get_disable_cdf_update(this.segment(), index); }
        /// Sets `disable_cdf_update` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer disable_cdf_updateAt(long index, @CType("uint32_t : 1") int value) { StdVideoDecodeAV1PictureInfoFlags.set_disable_cdf_update(this.segment(), index, value); return this; }

        /// {@return `use_superres` at the given index}
        /// @param index the index
        public @CType("uint32_t : 1") int use_superresAt(long index) { return StdVideoDecodeAV1PictureInfoFlags.get_use_superres(this.segment(), index); }
        /// Sets `use_superres` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer use_superresAt(long index, @CType("uint32_t : 1") int value) { StdVideoDecodeAV1PictureInfoFlags.set_use_superres(this.segment(), index, value); return this; }

        /// {@return `render_and_frame_size_different` at the given index}
        /// @param index the index
        public @CType("uint32_t : 1") int render_and_frame_size_differentAt(long index) { return StdVideoDecodeAV1PictureInfoFlags.get_render_and_frame_size_different(this.segment(), index); }
        /// Sets `render_and_frame_size_different` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer render_and_frame_size_differentAt(long index, @CType("uint32_t : 1") int value) { StdVideoDecodeAV1PictureInfoFlags.set_render_and_frame_size_different(this.segment(), index, value); return this; }

        /// {@return `allow_screen_content_tools` at the given index}
        /// @param index the index
        public @CType("uint32_t : 1") int allow_screen_content_toolsAt(long index) { return StdVideoDecodeAV1PictureInfoFlags.get_allow_screen_content_tools(this.segment(), index); }
        /// Sets `allow_screen_content_tools` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer allow_screen_content_toolsAt(long index, @CType("uint32_t : 1") int value) { StdVideoDecodeAV1PictureInfoFlags.set_allow_screen_content_tools(this.segment(), index, value); return this; }

        /// {@return `is_filter_switchable` at the given index}
        /// @param index the index
        public @CType("uint32_t : 1") int is_filter_switchableAt(long index) { return StdVideoDecodeAV1PictureInfoFlags.get_is_filter_switchable(this.segment(), index); }
        /// Sets `is_filter_switchable` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer is_filter_switchableAt(long index, @CType("uint32_t : 1") int value) { StdVideoDecodeAV1PictureInfoFlags.set_is_filter_switchable(this.segment(), index, value); return this; }

        /// {@return `force_integer_mv` at the given index}
        /// @param index the index
        public @CType("uint32_t : 1") int force_integer_mvAt(long index) { return StdVideoDecodeAV1PictureInfoFlags.get_force_integer_mv(this.segment(), index); }
        /// Sets `force_integer_mv` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer force_integer_mvAt(long index, @CType("uint32_t : 1") int value) { StdVideoDecodeAV1PictureInfoFlags.set_force_integer_mv(this.segment(), index, value); return this; }

        /// {@return `frame_size_override_flag` at the given index}
        /// @param index the index
        public @CType("uint32_t : 1") int frame_size_override_flagAt(long index) { return StdVideoDecodeAV1PictureInfoFlags.get_frame_size_override_flag(this.segment(), index); }
        /// Sets `frame_size_override_flag` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer frame_size_override_flagAt(long index, @CType("uint32_t : 1") int value) { StdVideoDecodeAV1PictureInfoFlags.set_frame_size_override_flag(this.segment(), index, value); return this; }

        /// {@return `buffer_removal_time_present_flag` at the given index}
        /// @param index the index
        public @CType("uint32_t : 1") int buffer_removal_time_present_flagAt(long index) { return StdVideoDecodeAV1PictureInfoFlags.get_buffer_removal_time_present_flag(this.segment(), index); }
        /// Sets `buffer_removal_time_present_flag` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer buffer_removal_time_present_flagAt(long index, @CType("uint32_t : 1") int value) { StdVideoDecodeAV1PictureInfoFlags.set_buffer_removal_time_present_flag(this.segment(), index, value); return this; }

        /// {@return `allow_intrabc` at the given index}
        /// @param index the index
        public @CType("uint32_t : 1") int allow_intrabcAt(long index) { return StdVideoDecodeAV1PictureInfoFlags.get_allow_intrabc(this.segment(), index); }
        /// Sets `allow_intrabc` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer allow_intrabcAt(long index, @CType("uint32_t : 1") int value) { StdVideoDecodeAV1PictureInfoFlags.set_allow_intrabc(this.segment(), index, value); return this; }

        /// {@return `frame_refs_short_signaling` at the given index}
        /// @param index the index
        public @CType("uint32_t : 1") int frame_refs_short_signalingAt(long index) { return StdVideoDecodeAV1PictureInfoFlags.get_frame_refs_short_signaling(this.segment(), index); }
        /// Sets `frame_refs_short_signaling` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer frame_refs_short_signalingAt(long index, @CType("uint32_t : 1") int value) { StdVideoDecodeAV1PictureInfoFlags.set_frame_refs_short_signaling(this.segment(), index, value); return this; }

        /// {@return `allow_high_precision_mv` at the given index}
        /// @param index the index
        public @CType("uint32_t : 1") int allow_high_precision_mvAt(long index) { return StdVideoDecodeAV1PictureInfoFlags.get_allow_high_precision_mv(this.segment(), index); }
        /// Sets `allow_high_precision_mv` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer allow_high_precision_mvAt(long index, @CType("uint32_t : 1") int value) { StdVideoDecodeAV1PictureInfoFlags.set_allow_high_precision_mv(this.segment(), index, value); return this; }

        /// {@return `is_motion_mode_switchable` at the given index}
        /// @param index the index
        public @CType("uint32_t : 1") int is_motion_mode_switchableAt(long index) { return StdVideoDecodeAV1PictureInfoFlags.get_is_motion_mode_switchable(this.segment(), index); }
        /// Sets `is_motion_mode_switchable` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer is_motion_mode_switchableAt(long index, @CType("uint32_t : 1") int value) { StdVideoDecodeAV1PictureInfoFlags.set_is_motion_mode_switchable(this.segment(), index, value); return this; }

        /// {@return `use_ref_frame_mvs` at the given index}
        /// @param index the index
        public @CType("uint32_t : 1") int use_ref_frame_mvsAt(long index) { return StdVideoDecodeAV1PictureInfoFlags.get_use_ref_frame_mvs(this.segment(), index); }
        /// Sets `use_ref_frame_mvs` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer use_ref_frame_mvsAt(long index, @CType("uint32_t : 1") int value) { StdVideoDecodeAV1PictureInfoFlags.set_use_ref_frame_mvs(this.segment(), index, value); return this; }

        /// {@return `disable_frame_end_update_cdf` at the given index}
        /// @param index the index
        public @CType("uint32_t : 1") int disable_frame_end_update_cdfAt(long index) { return StdVideoDecodeAV1PictureInfoFlags.get_disable_frame_end_update_cdf(this.segment(), index); }
        /// Sets `disable_frame_end_update_cdf` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer disable_frame_end_update_cdfAt(long index, @CType("uint32_t : 1") int value) { StdVideoDecodeAV1PictureInfoFlags.set_disable_frame_end_update_cdf(this.segment(), index, value); return this; }

        /// {@return `allow_warped_motion` at the given index}
        /// @param index the index
        public @CType("uint32_t : 1") int allow_warped_motionAt(long index) { return StdVideoDecodeAV1PictureInfoFlags.get_allow_warped_motion(this.segment(), index); }
        /// Sets `allow_warped_motion` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer allow_warped_motionAt(long index, @CType("uint32_t : 1") int value) { StdVideoDecodeAV1PictureInfoFlags.set_allow_warped_motion(this.segment(), index, value); return this; }

        /// {@return `reduced_tx_set` at the given index}
        /// @param index the index
        public @CType("uint32_t : 1") int reduced_tx_setAt(long index) { return StdVideoDecodeAV1PictureInfoFlags.get_reduced_tx_set(this.segment(), index); }
        /// Sets `reduced_tx_set` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer reduced_tx_setAt(long index, @CType("uint32_t : 1") int value) { StdVideoDecodeAV1PictureInfoFlags.set_reduced_tx_set(this.segment(), index, value); return this; }

        /// {@return `reference_select` at the given index}
        /// @param index the index
        public @CType("uint32_t : 1") int reference_selectAt(long index) { return StdVideoDecodeAV1PictureInfoFlags.get_reference_select(this.segment(), index); }
        /// Sets `reference_select` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer reference_selectAt(long index, @CType("uint32_t : 1") int value) { StdVideoDecodeAV1PictureInfoFlags.set_reference_select(this.segment(), index, value); return this; }

        /// {@return `skip_mode_present` at the given index}
        /// @param index the index
        public @CType("uint32_t : 1") int skip_mode_presentAt(long index) { return StdVideoDecodeAV1PictureInfoFlags.get_skip_mode_present(this.segment(), index); }
        /// Sets `skip_mode_present` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer skip_mode_presentAt(long index, @CType("uint32_t : 1") int value) { StdVideoDecodeAV1PictureInfoFlags.set_skip_mode_present(this.segment(), index, value); return this; }

        /// {@return `delta_q_present` at the given index}
        /// @param index the index
        public @CType("uint32_t : 1") int delta_q_presentAt(long index) { return StdVideoDecodeAV1PictureInfoFlags.get_delta_q_present(this.segment(), index); }
        /// Sets `delta_q_present` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer delta_q_presentAt(long index, @CType("uint32_t : 1") int value) { StdVideoDecodeAV1PictureInfoFlags.set_delta_q_present(this.segment(), index, value); return this; }

        /// {@return `delta_lf_present` at the given index}
        /// @param index the index
        public @CType("uint32_t : 1") int delta_lf_presentAt(long index) { return StdVideoDecodeAV1PictureInfoFlags.get_delta_lf_present(this.segment(), index); }
        /// Sets `delta_lf_present` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer delta_lf_presentAt(long index, @CType("uint32_t : 1") int value) { StdVideoDecodeAV1PictureInfoFlags.set_delta_lf_present(this.segment(), index, value); return this; }

        /// {@return `delta_lf_multi` at the given index}
        /// @param index the index
        public @CType("uint32_t : 1") int delta_lf_multiAt(long index) { return StdVideoDecodeAV1PictureInfoFlags.get_delta_lf_multi(this.segment(), index); }
        /// Sets `delta_lf_multi` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer delta_lf_multiAt(long index, @CType("uint32_t : 1") int value) { StdVideoDecodeAV1PictureInfoFlags.set_delta_lf_multi(this.segment(), index, value); return this; }

        /// {@return `segmentation_enabled` at the given index}
        /// @param index the index
        public @CType("uint32_t : 1") int segmentation_enabledAt(long index) { return StdVideoDecodeAV1PictureInfoFlags.get_segmentation_enabled(this.segment(), index); }
        /// Sets `segmentation_enabled` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer segmentation_enabledAt(long index, @CType("uint32_t : 1") int value) { StdVideoDecodeAV1PictureInfoFlags.set_segmentation_enabled(this.segment(), index, value); return this; }

        /// {@return `segmentation_update_map` at the given index}
        /// @param index the index
        public @CType("uint32_t : 1") int segmentation_update_mapAt(long index) { return StdVideoDecodeAV1PictureInfoFlags.get_segmentation_update_map(this.segment(), index); }
        /// Sets `segmentation_update_map` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer segmentation_update_mapAt(long index, @CType("uint32_t : 1") int value) { StdVideoDecodeAV1PictureInfoFlags.set_segmentation_update_map(this.segment(), index, value); return this; }

        /// {@return `segmentation_temporal_update` at the given index}
        /// @param index the index
        public @CType("uint32_t : 1") int segmentation_temporal_updateAt(long index) { return StdVideoDecodeAV1PictureInfoFlags.get_segmentation_temporal_update(this.segment(), index); }
        /// Sets `segmentation_temporal_update` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer segmentation_temporal_updateAt(long index, @CType("uint32_t : 1") int value) { StdVideoDecodeAV1PictureInfoFlags.set_segmentation_temporal_update(this.segment(), index, value); return this; }

        /// {@return `segmentation_update_data` at the given index}
        /// @param index the index
        public @CType("uint32_t : 1") int segmentation_update_dataAt(long index) { return StdVideoDecodeAV1PictureInfoFlags.get_segmentation_update_data(this.segment(), index); }
        /// Sets `segmentation_update_data` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer segmentation_update_dataAt(long index, @CType("uint32_t : 1") int value) { StdVideoDecodeAV1PictureInfoFlags.set_segmentation_update_data(this.segment(), index, value); return this; }

        /// {@return `UsesLr` at the given index}
        /// @param index the index
        public @CType("uint32_t : 1") int UsesLrAt(long index) { return StdVideoDecodeAV1PictureInfoFlags.get_UsesLr(this.segment(), index); }
        /// Sets `UsesLr` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer UsesLrAt(long index, @CType("uint32_t : 1") int value) { StdVideoDecodeAV1PictureInfoFlags.set_UsesLr(this.segment(), index, value); return this; }

        /// {@return `usesChromaLr` at the given index}
        /// @param index the index
        public @CType("uint32_t : 1") int usesChromaLrAt(long index) { return StdVideoDecodeAV1PictureInfoFlags.get_usesChromaLr(this.segment(), index); }
        /// Sets `usesChromaLr` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer usesChromaLrAt(long index, @CType("uint32_t : 1") int value) { StdVideoDecodeAV1PictureInfoFlags.set_usesChromaLr(this.segment(), index, value); return this; }

        /// {@return `apply_grain` at the given index}
        /// @param index the index
        public @CType("uint32_t : 1") int apply_grainAt(long index) { return StdVideoDecodeAV1PictureInfoFlags.get_apply_grain(this.segment(), index); }
        /// Sets `apply_grain` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer apply_grainAt(long index, @CType("uint32_t : 1") int value) { StdVideoDecodeAV1PictureInfoFlags.set_apply_grain(this.segment(), index, value); return this; }

        /// {@return `reserved` at the given index}
        /// @param index the index
        public @CType("uint32_t : 3") int reservedAt(long index) { return StdVideoDecodeAV1PictureInfoFlags.get_reserved(this.segment(), index); }
        /// Sets `reserved` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer reservedAt(long index, @CType("uint32_t : 3") int value) { StdVideoDecodeAV1PictureInfoFlags.set_reserved(this.segment(), index, value); return this; }

    }
}
