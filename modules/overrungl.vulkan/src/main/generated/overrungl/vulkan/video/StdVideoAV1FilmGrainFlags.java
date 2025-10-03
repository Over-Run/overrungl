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

/// Represents `StdVideoAV1FilmGrainFlags`.
/// ## Layout
/// ```
/// struct StdVideoAV1FilmGrainFlags {
///     uint32_t chroma_scaling_from_luma : 1;
///     uint32_t overlap_flag : 1;
///     uint32_t clip_to_restricted_range : 1;
///     uint32_t update_grain : 1;
///     uint32_t reserved : 28;
/// };
/// ```
public final class StdVideoAV1FilmGrainFlags extends GroupType {
    /// The struct layout of `StdVideoAV1FilmGrainFlags`.
    public static final StructLayout LAYOUT = LayoutBuilder.bitfields(
        ValueLayout.JAVA_INT.withName("chroma_scaling_from_luma"), 1,
        ValueLayout.JAVA_INT.withName("overlap_flag"), 1,
        ValueLayout.JAVA_INT.withName("clip_to_restricted_range"), 1,
        ValueLayout.JAVA_INT.withName("update_grain"), 1,
        ValueLayout.JAVA_INT.withName("reserved"), 28
    );

    /// Creates `StdVideoAV1FilmGrainFlags` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public StdVideoAV1FilmGrainFlags(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `StdVideoAV1FilmGrainFlags` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoAV1FilmGrainFlags of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoAV1FilmGrainFlags(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `StdVideoAV1FilmGrainFlags` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoAV1FilmGrainFlags ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoAV1FilmGrainFlags(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `StdVideoAV1FilmGrainFlags` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoAV1FilmGrainFlags ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoAV1FilmGrainFlags(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `StdVideoAV1FilmGrainFlags` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoAV1FilmGrainFlags`
    public static StdVideoAV1FilmGrainFlags alloc(SegmentAllocator allocator) { return new StdVideoAV1FilmGrainFlags(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `StdVideoAV1FilmGrainFlags` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `StdVideoAV1FilmGrainFlags`
    public static StdVideoAV1FilmGrainFlags alloc(SegmentAllocator allocator, long count) { return new StdVideoAV1FilmGrainFlags(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public StdVideoAV1FilmGrainFlags copyFrom(StdVideoAV1FilmGrainFlags src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public StdVideoAV1FilmGrainFlags reinterpret(long count) { return new StdVideoAV1FilmGrainFlags(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// Creates a slice of `StdVideoAV1FilmGrainFlags`.
    /// @param index the index of the struct buffer
    /// @return the slice of `StdVideoAV1FilmGrainFlags`
    public StdVideoAV1FilmGrainFlags asSlice(long index) { return new StdVideoAV1FilmGrainFlags(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `StdVideoAV1FilmGrainFlags`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `StdVideoAV1FilmGrainFlags`
    public StdVideoAV1FilmGrainFlags asSlice(long index, long count) { return new StdVideoAV1FilmGrainFlags(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `StdVideoAV1FilmGrainFlags` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public StdVideoAV1FilmGrainFlags at(long index, Consumer<StdVideoAV1FilmGrainFlags> func) { func.accept(asSlice(index)); return this; }

}
