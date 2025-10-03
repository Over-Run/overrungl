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

/// Represents `StdVideoH264PpsFlags`.
/// ## Layout
/// ```
/// struct StdVideoH264PpsFlags {
///     uint32_t transform_8x8_mode_flag : 1;
///     uint32_t redundant_pic_cnt_present_flag : 1;
///     uint32_t constrained_intra_pred_flag : 1;
///     uint32_t deblocking_filter_control_present_flag : 1;
///     uint32_t weighted_pred_flag : 1;
///     uint32_t bottom_field_pic_order_in_frame_present_flag : 1;
///     uint32_t entropy_coding_mode_flag : 1;
///     uint32_t pic_scaling_matrix_present_flag : 1;
/// };
/// ```
public final class StdVideoH264PpsFlags extends GroupType {
    /// The struct layout of `StdVideoH264PpsFlags`.
    public static final StructLayout LAYOUT = LayoutBuilder.bitfields(
        ValueLayout.JAVA_INT.withName("transform_8x8_mode_flag"), 1,
        ValueLayout.JAVA_INT.withName("redundant_pic_cnt_present_flag"), 1,
        ValueLayout.JAVA_INT.withName("constrained_intra_pred_flag"), 1,
        ValueLayout.JAVA_INT.withName("deblocking_filter_control_present_flag"), 1,
        ValueLayout.JAVA_INT.withName("weighted_pred_flag"), 1,
        ValueLayout.JAVA_INT.withName("bottom_field_pic_order_in_frame_present_flag"), 1,
        ValueLayout.JAVA_INT.withName("entropy_coding_mode_flag"), 1,
        ValueLayout.JAVA_INT.withName("pic_scaling_matrix_present_flag"), 1
    );

    /// Creates `StdVideoH264PpsFlags` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public StdVideoH264PpsFlags(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `StdVideoH264PpsFlags` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoH264PpsFlags of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoH264PpsFlags(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `StdVideoH264PpsFlags` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoH264PpsFlags ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoH264PpsFlags(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `StdVideoH264PpsFlags` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoH264PpsFlags ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoH264PpsFlags(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `StdVideoH264PpsFlags` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoH264PpsFlags`
    public static StdVideoH264PpsFlags alloc(SegmentAllocator allocator) { return new StdVideoH264PpsFlags(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `StdVideoH264PpsFlags` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `StdVideoH264PpsFlags`
    public static StdVideoH264PpsFlags alloc(SegmentAllocator allocator, long count) { return new StdVideoH264PpsFlags(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public StdVideoH264PpsFlags copyFrom(StdVideoH264PpsFlags src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public StdVideoH264PpsFlags reinterpret(long count) { return new StdVideoH264PpsFlags(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// Creates a slice of `StdVideoH264PpsFlags`.
    /// @param index the index of the struct buffer
    /// @return the slice of `StdVideoH264PpsFlags`
    public StdVideoH264PpsFlags asSlice(long index) { return new StdVideoH264PpsFlags(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `StdVideoH264PpsFlags`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `StdVideoH264PpsFlags`
    public StdVideoH264PpsFlags asSlice(long index, long count) { return new StdVideoH264PpsFlags(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `StdVideoH264PpsFlags` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public StdVideoH264PpsFlags at(long index, Consumer<StdVideoH264PpsFlags> func) { func.accept(asSlice(index)); return this; }

}
