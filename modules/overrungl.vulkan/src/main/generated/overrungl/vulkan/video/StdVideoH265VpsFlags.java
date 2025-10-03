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

/// Represents `StdVideoH265VpsFlags`.
/// ## Layout
/// ```
/// struct StdVideoH265VpsFlags {
///     uint32_t vps_temporal_id_nesting_flag : 1;
///     uint32_t vps_sub_layer_ordering_info_present_flag : 1;
///     uint32_t vps_timing_info_present_flag : 1;
///     uint32_t vps_poc_proportional_to_timing_flag : 1;
/// };
/// ```
public final class StdVideoH265VpsFlags extends GroupType {
    /// The struct layout of `StdVideoH265VpsFlags`.
    public static final StructLayout LAYOUT = LayoutBuilder.bitfields(
        ValueLayout.JAVA_INT.withName("vps_temporal_id_nesting_flag"), 1,
        ValueLayout.JAVA_INT.withName("vps_sub_layer_ordering_info_present_flag"), 1,
        ValueLayout.JAVA_INT.withName("vps_timing_info_present_flag"), 1,
        ValueLayout.JAVA_INT.withName("vps_poc_proportional_to_timing_flag"), 1
    );

    /// Creates `StdVideoH265VpsFlags` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public StdVideoH265VpsFlags(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `StdVideoH265VpsFlags` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoH265VpsFlags of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoH265VpsFlags(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `StdVideoH265VpsFlags` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoH265VpsFlags ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoH265VpsFlags(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `StdVideoH265VpsFlags` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoH265VpsFlags ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoH265VpsFlags(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `StdVideoH265VpsFlags` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoH265VpsFlags`
    public static StdVideoH265VpsFlags alloc(SegmentAllocator allocator) { return new StdVideoH265VpsFlags(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `StdVideoH265VpsFlags` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `StdVideoH265VpsFlags`
    public static StdVideoH265VpsFlags alloc(SegmentAllocator allocator, long count) { return new StdVideoH265VpsFlags(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public StdVideoH265VpsFlags copyFrom(StdVideoH265VpsFlags src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public StdVideoH265VpsFlags reinterpret(long count) { return new StdVideoH265VpsFlags(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// Creates a slice of `StdVideoH265VpsFlags`.
    /// @param index the index of the struct buffer
    /// @return the slice of `StdVideoH265VpsFlags`
    public StdVideoH265VpsFlags asSlice(long index) { return new StdVideoH265VpsFlags(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `StdVideoH265VpsFlags`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `StdVideoH265VpsFlags`
    public StdVideoH265VpsFlags asSlice(long index, long count) { return new StdVideoH265VpsFlags(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `StdVideoH265VpsFlags` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public StdVideoH265VpsFlags at(long index, Consumer<StdVideoH265VpsFlags> func) { func.accept(asSlice(index)); return this; }

}
