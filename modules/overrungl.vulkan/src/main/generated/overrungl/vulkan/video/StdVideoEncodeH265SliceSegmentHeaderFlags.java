// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.video;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `StdVideoEncodeH265SliceSegmentHeaderFlags`.
/// ## Layout
/// ```
/// struct StdVideoEncodeH265SliceSegmentHeaderFlags {
///     uint32_t first_slice_segment_in_pic_flag : 1;
///     uint32_t dependent_slice_segment_flag : 1;
///     uint32_t slice_sao_luma_flag : 1;
///     uint32_t slice_sao_chroma_flag : 1;
///     uint32_t num_ref_idx_active_override_flag : 1;
///     uint32_t mvd_l1_zero_flag : 1;
///     uint32_t cabac_init_flag : 1;
///     uint32_t cu_chroma_qp_offset_enabled_flag : 1;
///     uint32_t deblocking_filter_override_flag : 1;
///     uint32_t slice_deblocking_filter_disabled_flag : 1;
///     uint32_t collocated_from_l0_flag : 1;
///     uint32_t slice_loop_filter_across_slices_enabled_flag : 1;
///     uint32_t reserved : 20;
/// };
/// ```
public final class StdVideoEncodeH265SliceSegmentHeaderFlags extends GroupType {
    /// The struct layout of `StdVideoEncodeH265SliceSegmentHeaderFlags`.
    public static final StructLayout LAYOUT = LayoutBuilder.bitfields(
        ValueLayout.JAVA_INT.withName("first_slice_segment_in_pic_flag"), 1,
        ValueLayout.JAVA_INT.withName("dependent_slice_segment_flag"), 1,
        ValueLayout.JAVA_INT.withName("slice_sao_luma_flag"), 1,
        ValueLayout.JAVA_INT.withName("slice_sao_chroma_flag"), 1,
        ValueLayout.JAVA_INT.withName("num_ref_idx_active_override_flag"), 1,
        ValueLayout.JAVA_INT.withName("mvd_l1_zero_flag"), 1,
        ValueLayout.JAVA_INT.withName("cabac_init_flag"), 1,
        ValueLayout.JAVA_INT.withName("cu_chroma_qp_offset_enabled_flag"), 1,
        ValueLayout.JAVA_INT.withName("deblocking_filter_override_flag"), 1,
        ValueLayout.JAVA_INT.withName("slice_deblocking_filter_disabled_flag"), 1,
        ValueLayout.JAVA_INT.withName("collocated_from_l0_flag"), 1,
        ValueLayout.JAVA_INT.withName("slice_loop_filter_across_slices_enabled_flag"), 1,
        ValueLayout.JAVA_INT.withName("reserved"), 20
    );

    /// Creates `StdVideoEncodeH265SliceSegmentHeaderFlags` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public StdVideoEncodeH265SliceSegmentHeaderFlags(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `StdVideoEncodeH265SliceSegmentHeaderFlags` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoEncodeH265SliceSegmentHeaderFlags of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoEncodeH265SliceSegmentHeaderFlags(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `StdVideoEncodeH265SliceSegmentHeaderFlags` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoEncodeH265SliceSegmentHeaderFlags ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoEncodeH265SliceSegmentHeaderFlags(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `StdVideoEncodeH265SliceSegmentHeaderFlags` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoEncodeH265SliceSegmentHeaderFlags ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoEncodeH265SliceSegmentHeaderFlags(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `StdVideoEncodeH265SliceSegmentHeaderFlags` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoEncodeH265SliceSegmentHeaderFlags`
    public static StdVideoEncodeH265SliceSegmentHeaderFlags alloc(SegmentAllocator allocator) { return new StdVideoEncodeH265SliceSegmentHeaderFlags(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `StdVideoEncodeH265SliceSegmentHeaderFlags` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `StdVideoEncodeH265SliceSegmentHeaderFlags`
    public static StdVideoEncodeH265SliceSegmentHeaderFlags alloc(SegmentAllocator allocator, long count) { return new StdVideoEncodeH265SliceSegmentHeaderFlags(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public StdVideoEncodeH265SliceSegmentHeaderFlags copyFrom(StdVideoEncodeH265SliceSegmentHeaderFlags src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public StdVideoEncodeH265SliceSegmentHeaderFlags reinterpret(long count) { return new StdVideoEncodeH265SliceSegmentHeaderFlags(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// Creates a slice of `StdVideoEncodeH265SliceSegmentHeaderFlags`.
    /// @param index the index of the struct buffer
    /// @return the slice of `StdVideoEncodeH265SliceSegmentHeaderFlags`
    public StdVideoEncodeH265SliceSegmentHeaderFlags asSlice(long index) { return new StdVideoEncodeH265SliceSegmentHeaderFlags(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `StdVideoEncodeH265SliceSegmentHeaderFlags`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `StdVideoEncodeH265SliceSegmentHeaderFlags`
    public StdVideoEncodeH265SliceSegmentHeaderFlags asSlice(long index, long count) { return new StdVideoEncodeH265SliceSegmentHeaderFlags(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `StdVideoEncodeH265SliceSegmentHeaderFlags` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public StdVideoEncodeH265SliceSegmentHeaderFlags at(long index, Consumer<StdVideoEncodeH265SliceSegmentHeaderFlags> func) { func.accept(asSlice(index)); return this; }

}
