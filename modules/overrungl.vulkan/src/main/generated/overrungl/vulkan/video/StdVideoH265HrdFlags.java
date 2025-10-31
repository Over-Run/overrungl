// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.video;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `StdVideoH265HrdFlags`.
/// ## Layout
/// ```
/// struct StdVideoH265HrdFlags {
///     uint32_t nal_hrd_parameters_present_flag : 1;
///     uint32_t vcl_hrd_parameters_present_flag : 1;
///     uint32_t sub_pic_hrd_params_present_flag : 1;
///     uint32_t sub_pic_cpb_params_in_pic_timing_sei_flag : 1;
///     uint32_t fixed_pic_rate_general_flag : 8;
///     uint32_t fixed_pic_rate_within_cvs_flag : 8;
///     uint32_t low_delay_hrd_flag : 8;
/// };
/// ```
public final class StdVideoH265HrdFlags extends GroupType {
    /// The struct layout of `StdVideoH265HrdFlags`.
    public static final StructLayout LAYOUT = LayoutBuilder.bitfields(
        ValueLayout.JAVA_INT.withName("nal_hrd_parameters_present_flag"), 1,
        ValueLayout.JAVA_INT.withName("vcl_hrd_parameters_present_flag"), 1,
        ValueLayout.JAVA_INT.withName("sub_pic_hrd_params_present_flag"), 1,
        ValueLayout.JAVA_INT.withName("sub_pic_cpb_params_in_pic_timing_sei_flag"), 1,
        ValueLayout.JAVA_INT.withName("fixed_pic_rate_general_flag"), 8,
        ValueLayout.JAVA_INT.withName("fixed_pic_rate_within_cvs_flag"), 8,
        ValueLayout.JAVA_INT.withName("low_delay_hrd_flag"), 8
    );

    /// Creates `StdVideoH265HrdFlags` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public StdVideoH265HrdFlags(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `StdVideoH265HrdFlags` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoH265HrdFlags of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoH265HrdFlags(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `StdVideoH265HrdFlags` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoH265HrdFlags ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoH265HrdFlags(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `StdVideoH265HrdFlags` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoH265HrdFlags ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoH265HrdFlags(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `StdVideoH265HrdFlags` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoH265HrdFlags`
    public static StdVideoH265HrdFlags alloc(SegmentAllocator allocator) { return new StdVideoH265HrdFlags(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `StdVideoH265HrdFlags` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `StdVideoH265HrdFlags`
    public static StdVideoH265HrdFlags alloc(SegmentAllocator allocator, long count) { return new StdVideoH265HrdFlags(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public StdVideoH265HrdFlags copyFrom(StdVideoH265HrdFlags src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public StdVideoH265HrdFlags reinterpret(long count) { return new StdVideoH265HrdFlags(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// Creates a slice of `StdVideoH265HrdFlags`.
    /// @param index the index of the struct buffer
    /// @return the slice of `StdVideoH265HrdFlags`
    public StdVideoH265HrdFlags asSlice(long index) { return new StdVideoH265HrdFlags(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `StdVideoH265HrdFlags`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `StdVideoH265HrdFlags`
    public StdVideoH265HrdFlags asSlice(long index, long count) { return new StdVideoH265HrdFlags(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `StdVideoH265HrdFlags` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public StdVideoH265HrdFlags at(long index, Consumer<StdVideoH265HrdFlags> func) { func.accept(asSlice(index)); return this; }

}
