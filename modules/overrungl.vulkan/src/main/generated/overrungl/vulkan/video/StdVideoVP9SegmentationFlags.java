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

/// Represents `StdVideoVP9SegmentationFlags`.
/// ## Layout
/// ```
/// struct StdVideoVP9SegmentationFlags {
///     uint32_t segmentation_update_map : 1;
///     uint32_t segmentation_temporal_update : 1;
///     uint32_t segmentation_update_data : 1;
///     uint32_t segmentation_abs_or_delta_update : 1;
///     uint32_t reserved : 28;
/// };
/// ```
public final class StdVideoVP9SegmentationFlags extends GroupType {
    /// The struct layout of `StdVideoVP9SegmentationFlags`.
    public static final StructLayout LAYOUT = LayoutBuilder.bitfields(
        ValueLayout.JAVA_INT.withName("segmentation_update_map"), 1,
        ValueLayout.JAVA_INT.withName("segmentation_temporal_update"), 1,
        ValueLayout.JAVA_INT.withName("segmentation_update_data"), 1,
        ValueLayout.JAVA_INT.withName("segmentation_abs_or_delta_update"), 1,
        ValueLayout.JAVA_INT.withName("reserved"), 28
    );

    /// Creates `StdVideoVP9SegmentationFlags` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public StdVideoVP9SegmentationFlags(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `StdVideoVP9SegmentationFlags` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoVP9SegmentationFlags of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoVP9SegmentationFlags(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `StdVideoVP9SegmentationFlags` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoVP9SegmentationFlags ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoVP9SegmentationFlags(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `StdVideoVP9SegmentationFlags` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoVP9SegmentationFlags ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoVP9SegmentationFlags(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `StdVideoVP9SegmentationFlags` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoVP9SegmentationFlags`
    public static StdVideoVP9SegmentationFlags alloc(SegmentAllocator allocator) { return new StdVideoVP9SegmentationFlags(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `StdVideoVP9SegmentationFlags` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `StdVideoVP9SegmentationFlags`
    public static StdVideoVP9SegmentationFlags alloc(SegmentAllocator allocator, long count) { return new StdVideoVP9SegmentationFlags(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public StdVideoVP9SegmentationFlags copyFrom(StdVideoVP9SegmentationFlags src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public StdVideoVP9SegmentationFlags reinterpret(long count) { return new StdVideoVP9SegmentationFlags(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// Creates a slice of `StdVideoVP9SegmentationFlags`.
    /// @param index the index of the struct buffer
    /// @return the slice of `StdVideoVP9SegmentationFlags`
    public StdVideoVP9SegmentationFlags asSlice(long index) { return new StdVideoVP9SegmentationFlags(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `StdVideoVP9SegmentationFlags`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `StdVideoVP9SegmentationFlags`
    public StdVideoVP9SegmentationFlags asSlice(long index, long count) { return new StdVideoVP9SegmentationFlags(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `StdVideoVP9SegmentationFlags` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public StdVideoVP9SegmentationFlags at(long index, Consumer<StdVideoVP9SegmentationFlags> func) { func.accept(asSlice(index)); return this; }

}
