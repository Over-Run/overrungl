// This file is auto-generated. DO NOT EDIT!
//@formatter:off
package overrungl.vulkan.video;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `StdVideoH265SpsFlags`.
/// ## Layout
/// ```
/// struct StdVideoH265SpsFlags {
///     uint32_t sps_temporal_id_nesting_flag : 1;
///     uint32_t separate_colour_plane_flag : 1;
///     uint32_t conformance_window_flag : 1;
///     uint32_t sps_sub_layer_ordering_info_present_flag : 1;
///     uint32_t scaling_list_enabled_flag : 1;
///     uint32_t sps_scaling_list_data_present_flag : 1;
///     uint32_t amp_enabled_flag : 1;
///     uint32_t sample_adaptive_offset_enabled_flag : 1;
///     uint32_t pcm_enabled_flag : 1;
///     uint32_t pcm_loop_filter_disabled_flag : 1;
///     uint32_t long_term_ref_pics_present_flag : 1;
///     uint32_t sps_temporal_mvp_enabled_flag : 1;
///     uint32_t strong_intra_smoothing_enabled_flag : 1;
///     uint32_t vui_parameters_present_flag : 1;
///     uint32_t sps_extension_present_flag : 1;
///     uint32_t sps_range_extension_flag : 1;
///     uint32_t transform_skip_rotation_enabled_flag : 1;
///     uint32_t transform_skip_context_enabled_flag : 1;
///     uint32_t implicit_rdpcm_enabled_flag : 1;
///     uint32_t explicit_rdpcm_enabled_flag : 1;
///     uint32_t extended_precision_processing_flag : 1;
///     uint32_t intra_smoothing_disabled_flag : 1;
///     uint32_t high_precision_offsets_enabled_flag : 1;
///     uint32_t persistent_rice_adaptation_enabled_flag : 1;
///     uint32_t cabac_bypass_alignment_enabled_flag : 1;
///     uint32_t sps_scc_extension_flag : 1;
///     uint32_t sps_curr_pic_ref_enabled_flag : 1;
///     uint32_t palette_mode_enabled_flag : 1;
///     uint32_t sps_palette_predictor_initializers_present_flag : 1;
///     uint32_t intra_boundary_filtering_disabled_flag : 1;
/// };
/// ```
public final class StdVideoH265SpsFlags extends GroupType {
    /// The struct layout of `StdVideoH265SpsFlags`.
    public static final StructLayout LAYOUT = LayoutBuilder.bitfields(
        ValueLayout.JAVA_INT.withName("sps_temporal_id_nesting_flag"), 1,
        ValueLayout.JAVA_INT.withName("separate_colour_plane_flag"), 1,
        ValueLayout.JAVA_INT.withName("conformance_window_flag"), 1,
        ValueLayout.JAVA_INT.withName("sps_sub_layer_ordering_info_present_flag"), 1,
        ValueLayout.JAVA_INT.withName("scaling_list_enabled_flag"), 1,
        ValueLayout.JAVA_INT.withName("sps_scaling_list_data_present_flag"), 1,
        ValueLayout.JAVA_INT.withName("amp_enabled_flag"), 1,
        ValueLayout.JAVA_INT.withName("sample_adaptive_offset_enabled_flag"), 1,
        ValueLayout.JAVA_INT.withName("pcm_enabled_flag"), 1,
        ValueLayout.JAVA_INT.withName("pcm_loop_filter_disabled_flag"), 1,
        ValueLayout.JAVA_INT.withName("long_term_ref_pics_present_flag"), 1,
        ValueLayout.JAVA_INT.withName("sps_temporal_mvp_enabled_flag"), 1,
        ValueLayout.JAVA_INT.withName("strong_intra_smoothing_enabled_flag"), 1,
        ValueLayout.JAVA_INT.withName("vui_parameters_present_flag"), 1,
        ValueLayout.JAVA_INT.withName("sps_extension_present_flag"), 1,
        ValueLayout.JAVA_INT.withName("sps_range_extension_flag"), 1,
        ValueLayout.JAVA_INT.withName("transform_skip_rotation_enabled_flag"), 1,
        ValueLayout.JAVA_INT.withName("transform_skip_context_enabled_flag"), 1,
        ValueLayout.JAVA_INT.withName("implicit_rdpcm_enabled_flag"), 1,
        ValueLayout.JAVA_INT.withName("explicit_rdpcm_enabled_flag"), 1,
        ValueLayout.JAVA_INT.withName("extended_precision_processing_flag"), 1,
        ValueLayout.JAVA_INT.withName("intra_smoothing_disabled_flag"), 1,
        ValueLayout.JAVA_INT.withName("high_precision_offsets_enabled_flag"), 1,
        ValueLayout.JAVA_INT.withName("persistent_rice_adaptation_enabled_flag"), 1,
        ValueLayout.JAVA_INT.withName("cabac_bypass_alignment_enabled_flag"), 1,
        ValueLayout.JAVA_INT.withName("sps_scc_extension_flag"), 1,
        ValueLayout.JAVA_INT.withName("sps_curr_pic_ref_enabled_flag"), 1,
        ValueLayout.JAVA_INT.withName("palette_mode_enabled_flag"), 1,
        ValueLayout.JAVA_INT.withName("sps_palette_predictor_initializers_present_flag"), 1,
        ValueLayout.JAVA_INT.withName("intra_boundary_filtering_disabled_flag"), 1
    );

    /// Creates `StdVideoH265SpsFlags` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public StdVideoH265SpsFlags(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `StdVideoH265SpsFlags` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoH265SpsFlags of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoH265SpsFlags(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `StdVideoH265SpsFlags` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoH265SpsFlags ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoH265SpsFlags(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `StdVideoH265SpsFlags` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoH265SpsFlags ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoH265SpsFlags(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `StdVideoH265SpsFlags` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoH265SpsFlags`
    public static StdVideoH265SpsFlags alloc(SegmentAllocator allocator) { return new StdVideoH265SpsFlags(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `StdVideoH265SpsFlags` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `StdVideoH265SpsFlags`
    public static StdVideoH265SpsFlags alloc(SegmentAllocator allocator, long count) { return new StdVideoH265SpsFlags(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public StdVideoH265SpsFlags copyFrom(StdVideoH265SpsFlags src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public StdVideoH265SpsFlags reinterpret(long count) { return new StdVideoH265SpsFlags(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// Creates a slice of `StdVideoH265SpsFlags`.
    /// @param index the index of the struct buffer
    /// @return the slice of `StdVideoH265SpsFlags`
    public StdVideoH265SpsFlags asSlice(long index) { return new StdVideoH265SpsFlags(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `StdVideoH265SpsFlags`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `StdVideoH265SpsFlags`
    public StdVideoH265SpsFlags asSlice(long index, long count) { return new StdVideoH265SpsFlags(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `StdVideoH265SpsFlags` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public StdVideoH265SpsFlags at(long index, Consumer<StdVideoH265SpsFlags> func) { func.accept(asSlice(index)); return this; }

}
