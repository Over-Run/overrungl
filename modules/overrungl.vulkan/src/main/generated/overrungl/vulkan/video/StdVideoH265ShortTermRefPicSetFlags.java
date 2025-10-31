// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.video;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `StdVideoH265ShortTermRefPicSetFlags`.
/// ## Layout
/// ```
/// struct StdVideoH265ShortTermRefPicSetFlags {
///     uint32_t inter_ref_pic_set_prediction_flag : 1;
///     uint32_t delta_rps_sign : 1;
/// };
/// ```
public final class StdVideoH265ShortTermRefPicSetFlags extends GroupType {
    /// The struct layout of `StdVideoH265ShortTermRefPicSetFlags`.
    public static final StructLayout LAYOUT = LayoutBuilder.bitfields(
        ValueLayout.JAVA_INT.withName("inter_ref_pic_set_prediction_flag"), 1,
        ValueLayout.JAVA_INT.withName("delta_rps_sign"), 1
    );

    /// Creates `StdVideoH265ShortTermRefPicSetFlags` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public StdVideoH265ShortTermRefPicSetFlags(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `StdVideoH265ShortTermRefPicSetFlags` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoH265ShortTermRefPicSetFlags of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoH265ShortTermRefPicSetFlags(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `StdVideoH265ShortTermRefPicSetFlags` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoH265ShortTermRefPicSetFlags ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoH265ShortTermRefPicSetFlags(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `StdVideoH265ShortTermRefPicSetFlags` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoH265ShortTermRefPicSetFlags ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoH265ShortTermRefPicSetFlags(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `StdVideoH265ShortTermRefPicSetFlags` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoH265ShortTermRefPicSetFlags`
    public static StdVideoH265ShortTermRefPicSetFlags alloc(SegmentAllocator allocator) { return new StdVideoH265ShortTermRefPicSetFlags(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `StdVideoH265ShortTermRefPicSetFlags` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `StdVideoH265ShortTermRefPicSetFlags`
    public static StdVideoH265ShortTermRefPicSetFlags alloc(SegmentAllocator allocator, long count) { return new StdVideoH265ShortTermRefPicSetFlags(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public StdVideoH265ShortTermRefPicSetFlags copyFrom(StdVideoH265ShortTermRefPicSetFlags src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public StdVideoH265ShortTermRefPicSetFlags reinterpret(long count) { return new StdVideoH265ShortTermRefPicSetFlags(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// Creates a slice of `StdVideoH265ShortTermRefPicSetFlags`.
    /// @param index the index of the struct buffer
    /// @return the slice of `StdVideoH265ShortTermRefPicSetFlags`
    public StdVideoH265ShortTermRefPicSetFlags asSlice(long index) { return new StdVideoH265ShortTermRefPicSetFlags(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `StdVideoH265ShortTermRefPicSetFlags`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `StdVideoH265ShortTermRefPicSetFlags`
    public StdVideoH265ShortTermRefPicSetFlags asSlice(long index, long count) { return new StdVideoH265ShortTermRefPicSetFlags(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `StdVideoH265ShortTermRefPicSetFlags` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public StdVideoH265ShortTermRefPicSetFlags at(long index, Consumer<StdVideoH265ShortTermRefPicSetFlags> func) { func.accept(asSlice(index)); return this; }

}
