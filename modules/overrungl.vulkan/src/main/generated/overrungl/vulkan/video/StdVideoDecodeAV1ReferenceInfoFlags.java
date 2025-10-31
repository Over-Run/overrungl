// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.video;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `StdVideoDecodeAV1ReferenceInfoFlags`.
/// ## Layout
/// ```
/// struct StdVideoDecodeAV1ReferenceInfoFlags {
///     uint32_t disable_frame_end_update_cdf : 1;
///     uint32_t segmentation_enabled : 1;
///     uint32_t reserved : 30;
/// };
/// ```
public final class StdVideoDecodeAV1ReferenceInfoFlags extends GroupType {
    /// The struct layout of `StdVideoDecodeAV1ReferenceInfoFlags`.
    public static final StructLayout LAYOUT = LayoutBuilder.bitfields(
        ValueLayout.JAVA_INT.withName("disable_frame_end_update_cdf"), 1,
        ValueLayout.JAVA_INT.withName("segmentation_enabled"), 1,
        ValueLayout.JAVA_INT.withName("reserved"), 30
    );

    /// Creates `StdVideoDecodeAV1ReferenceInfoFlags` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public StdVideoDecodeAV1ReferenceInfoFlags(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `StdVideoDecodeAV1ReferenceInfoFlags` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoDecodeAV1ReferenceInfoFlags of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoDecodeAV1ReferenceInfoFlags(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `StdVideoDecodeAV1ReferenceInfoFlags` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoDecodeAV1ReferenceInfoFlags ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoDecodeAV1ReferenceInfoFlags(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `StdVideoDecodeAV1ReferenceInfoFlags` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoDecodeAV1ReferenceInfoFlags ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoDecodeAV1ReferenceInfoFlags(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `StdVideoDecodeAV1ReferenceInfoFlags` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoDecodeAV1ReferenceInfoFlags`
    public static StdVideoDecodeAV1ReferenceInfoFlags alloc(SegmentAllocator allocator) { return new StdVideoDecodeAV1ReferenceInfoFlags(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `StdVideoDecodeAV1ReferenceInfoFlags` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `StdVideoDecodeAV1ReferenceInfoFlags`
    public static StdVideoDecodeAV1ReferenceInfoFlags alloc(SegmentAllocator allocator, long count) { return new StdVideoDecodeAV1ReferenceInfoFlags(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public StdVideoDecodeAV1ReferenceInfoFlags copyFrom(StdVideoDecodeAV1ReferenceInfoFlags src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public StdVideoDecodeAV1ReferenceInfoFlags reinterpret(long count) { return new StdVideoDecodeAV1ReferenceInfoFlags(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// Creates a slice of `StdVideoDecodeAV1ReferenceInfoFlags`.
    /// @param index the index of the struct buffer
    /// @return the slice of `StdVideoDecodeAV1ReferenceInfoFlags`
    public StdVideoDecodeAV1ReferenceInfoFlags asSlice(long index) { return new StdVideoDecodeAV1ReferenceInfoFlags(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `StdVideoDecodeAV1ReferenceInfoFlags`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `StdVideoDecodeAV1ReferenceInfoFlags`
    public StdVideoDecodeAV1ReferenceInfoFlags asSlice(long index, long count) { return new StdVideoDecodeAV1ReferenceInfoFlags(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `StdVideoDecodeAV1ReferenceInfoFlags` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public StdVideoDecodeAV1ReferenceInfoFlags at(long index, Consumer<StdVideoDecodeAV1ReferenceInfoFlags> func) { func.accept(asSlice(index)); return this; }

}
