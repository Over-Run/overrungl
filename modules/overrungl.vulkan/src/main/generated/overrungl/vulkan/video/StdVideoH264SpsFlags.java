// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.video;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `StdVideoH264SpsFlags`.
/// ## Layout
/// ```
/// struct StdVideoH264SpsFlags {
///     uint32_t constraint_set0_flag : 1;
///     uint32_t constraint_set1_flag : 1;
///     uint32_t constraint_set2_flag : 1;
///     uint32_t constraint_set3_flag : 1;
///     uint32_t constraint_set4_flag : 1;
///     uint32_t constraint_set5_flag : 1;
///     uint32_t direct_8x8_inference_flag : 1;
///     uint32_t mb_adaptive_frame_field_flag : 1;
///     uint32_t frame_mbs_only_flag : 1;
///     uint32_t delta_pic_order_always_zero_flag : 1;
///     uint32_t separate_colour_plane_flag : 1;
///     uint32_t gaps_in_frame_num_value_allowed_flag : 1;
///     uint32_t qpprime_y_zero_transform_bypass_flag : 1;
///     uint32_t frame_cropping_flag : 1;
///     uint32_t seq_scaling_matrix_present_flag : 1;
///     uint32_t vui_parameters_present_flag : 1;
/// };
/// ```
public final class StdVideoH264SpsFlags extends GroupType {
    /// The struct layout of `StdVideoH264SpsFlags`.
    public static final StructLayout LAYOUT = LayoutBuilder.bitfields(
        ValueLayout.JAVA_INT.withName("constraint_set0_flag"), 1,
        ValueLayout.JAVA_INT.withName("constraint_set1_flag"), 1,
        ValueLayout.JAVA_INT.withName("constraint_set2_flag"), 1,
        ValueLayout.JAVA_INT.withName("constraint_set3_flag"), 1,
        ValueLayout.JAVA_INT.withName("constraint_set4_flag"), 1,
        ValueLayout.JAVA_INT.withName("constraint_set5_flag"), 1,
        ValueLayout.JAVA_INT.withName("direct_8x8_inference_flag"), 1,
        ValueLayout.JAVA_INT.withName("mb_adaptive_frame_field_flag"), 1,
        ValueLayout.JAVA_INT.withName("frame_mbs_only_flag"), 1,
        ValueLayout.JAVA_INT.withName("delta_pic_order_always_zero_flag"), 1,
        ValueLayout.JAVA_INT.withName("separate_colour_plane_flag"), 1,
        ValueLayout.JAVA_INT.withName("gaps_in_frame_num_value_allowed_flag"), 1,
        ValueLayout.JAVA_INT.withName("qpprime_y_zero_transform_bypass_flag"), 1,
        ValueLayout.JAVA_INT.withName("frame_cropping_flag"), 1,
        ValueLayout.JAVA_INT.withName("seq_scaling_matrix_present_flag"), 1,
        ValueLayout.JAVA_INT.withName("vui_parameters_present_flag"), 1
    );

    /// Creates `StdVideoH264SpsFlags` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public StdVideoH264SpsFlags(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `StdVideoH264SpsFlags` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoH264SpsFlags of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoH264SpsFlags(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `StdVideoH264SpsFlags` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoH264SpsFlags ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoH264SpsFlags(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `StdVideoH264SpsFlags` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoH264SpsFlags ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoH264SpsFlags(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `StdVideoH264SpsFlags` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoH264SpsFlags`
    public static StdVideoH264SpsFlags alloc(SegmentAllocator allocator) { return new StdVideoH264SpsFlags(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `StdVideoH264SpsFlags` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `StdVideoH264SpsFlags`
    public static StdVideoH264SpsFlags alloc(SegmentAllocator allocator, long count) { return new StdVideoH264SpsFlags(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public StdVideoH264SpsFlags copyFrom(StdVideoH264SpsFlags src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public StdVideoH264SpsFlags reinterpret(long count) { return new StdVideoH264SpsFlags(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// Creates a slice of `StdVideoH264SpsFlags`.
    /// @param index the index of the struct buffer
    /// @return the slice of `StdVideoH264SpsFlags`
    public StdVideoH264SpsFlags asSlice(long index) { return new StdVideoH264SpsFlags(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `StdVideoH264SpsFlags`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `StdVideoH264SpsFlags`
    public StdVideoH264SpsFlags asSlice(long index, long count) { return new StdVideoH264SpsFlags(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `StdVideoH264SpsFlags` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public StdVideoH264SpsFlags at(long index, Consumer<StdVideoH264SpsFlags> func) { func.accept(asSlice(index)); return this; }

}
