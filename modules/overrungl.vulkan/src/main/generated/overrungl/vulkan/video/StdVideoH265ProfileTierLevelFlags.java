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

/// Represents `StdVideoH265ProfileTierLevelFlags`.
/// ## Layout
/// ```
/// struct StdVideoH265ProfileTierLevelFlags {
///     uint32_t general_tier_flag : 1;
///     uint32_t general_progressive_source_flag : 1;
///     uint32_t general_interlaced_source_flag : 1;
///     uint32_t general_non_packed_constraint_flag : 1;
///     uint32_t general_frame_only_constraint_flag : 1;
/// };
/// ```
public final class StdVideoH265ProfileTierLevelFlags extends GroupType {
    /// The struct layout of `StdVideoH265ProfileTierLevelFlags`.
    public static final StructLayout LAYOUT = LayoutBuilder.bitfields(
        ValueLayout.JAVA_INT.withName("general_tier_flag"), 1,
        ValueLayout.JAVA_INT.withName("general_progressive_source_flag"), 1,
        ValueLayout.JAVA_INT.withName("general_interlaced_source_flag"), 1,
        ValueLayout.JAVA_INT.withName("general_non_packed_constraint_flag"), 1,
        ValueLayout.JAVA_INT.withName("general_frame_only_constraint_flag"), 1
    );

    /// Creates `StdVideoH265ProfileTierLevelFlags` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public StdVideoH265ProfileTierLevelFlags(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `StdVideoH265ProfileTierLevelFlags` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoH265ProfileTierLevelFlags of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoH265ProfileTierLevelFlags(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `StdVideoH265ProfileTierLevelFlags` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoH265ProfileTierLevelFlags ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoH265ProfileTierLevelFlags(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `StdVideoH265ProfileTierLevelFlags` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoH265ProfileTierLevelFlags ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoH265ProfileTierLevelFlags(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `StdVideoH265ProfileTierLevelFlags` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoH265ProfileTierLevelFlags`
    public static StdVideoH265ProfileTierLevelFlags alloc(SegmentAllocator allocator) { return new StdVideoH265ProfileTierLevelFlags(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `StdVideoH265ProfileTierLevelFlags` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `StdVideoH265ProfileTierLevelFlags`
    public static StdVideoH265ProfileTierLevelFlags alloc(SegmentAllocator allocator, long count) { return new StdVideoH265ProfileTierLevelFlags(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public StdVideoH265ProfileTierLevelFlags copyFrom(StdVideoH265ProfileTierLevelFlags src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public StdVideoH265ProfileTierLevelFlags reinterpret(long count) { return new StdVideoH265ProfileTierLevelFlags(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// Creates a slice of `StdVideoH265ProfileTierLevelFlags`.
    /// @param index the index of the struct buffer
    /// @return the slice of `StdVideoH265ProfileTierLevelFlags`
    public StdVideoH265ProfileTierLevelFlags asSlice(long index) { return new StdVideoH265ProfileTierLevelFlags(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `StdVideoH265ProfileTierLevelFlags`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `StdVideoH265ProfileTierLevelFlags`
    public StdVideoH265ProfileTierLevelFlags asSlice(long index, long count) { return new StdVideoH265ProfileTierLevelFlags(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `StdVideoH265ProfileTierLevelFlags` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public StdVideoH265ProfileTierLevelFlags at(long index, Consumer<StdVideoH265ProfileTierLevelFlags> func) { func.accept(asSlice(index)); return this; }

}
