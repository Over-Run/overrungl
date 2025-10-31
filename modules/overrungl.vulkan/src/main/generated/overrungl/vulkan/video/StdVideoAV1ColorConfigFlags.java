// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.video;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `StdVideoAV1ColorConfigFlags`.
/// ## Layout
/// ```
/// struct StdVideoAV1ColorConfigFlags {
///     uint32_t mono_chrome : 1;
///     uint32_t color_range : 1;
///     uint32_t separate_uv_delta_q : 1;
///     uint32_t color_description_present_flag : 1;
///     uint32_t reserved : 28;
/// };
/// ```
public final class StdVideoAV1ColorConfigFlags extends GroupType {
    /// The struct layout of `StdVideoAV1ColorConfigFlags`.
    public static final StructLayout LAYOUT = LayoutBuilder.bitfields(
        ValueLayout.JAVA_INT.withName("mono_chrome"), 1,
        ValueLayout.JAVA_INT.withName("color_range"), 1,
        ValueLayout.JAVA_INT.withName("separate_uv_delta_q"), 1,
        ValueLayout.JAVA_INT.withName("color_description_present_flag"), 1,
        ValueLayout.JAVA_INT.withName("reserved"), 28
    );

    /// Creates `StdVideoAV1ColorConfigFlags` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public StdVideoAV1ColorConfigFlags(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `StdVideoAV1ColorConfigFlags` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoAV1ColorConfigFlags of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoAV1ColorConfigFlags(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `StdVideoAV1ColorConfigFlags` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoAV1ColorConfigFlags ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoAV1ColorConfigFlags(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `StdVideoAV1ColorConfigFlags` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoAV1ColorConfigFlags ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoAV1ColorConfigFlags(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `StdVideoAV1ColorConfigFlags` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoAV1ColorConfigFlags`
    public static StdVideoAV1ColorConfigFlags alloc(SegmentAllocator allocator) { return new StdVideoAV1ColorConfigFlags(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `StdVideoAV1ColorConfigFlags` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `StdVideoAV1ColorConfigFlags`
    public static StdVideoAV1ColorConfigFlags alloc(SegmentAllocator allocator, long count) { return new StdVideoAV1ColorConfigFlags(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public StdVideoAV1ColorConfigFlags copyFrom(StdVideoAV1ColorConfigFlags src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public StdVideoAV1ColorConfigFlags reinterpret(long count) { return new StdVideoAV1ColorConfigFlags(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// Creates a slice of `StdVideoAV1ColorConfigFlags`.
    /// @param index the index of the struct buffer
    /// @return the slice of `StdVideoAV1ColorConfigFlags`
    public StdVideoAV1ColorConfigFlags asSlice(long index) { return new StdVideoAV1ColorConfigFlags(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `StdVideoAV1ColorConfigFlags`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `StdVideoAV1ColorConfigFlags`
    public StdVideoAV1ColorConfigFlags asSlice(long index, long count) { return new StdVideoAV1ColorConfigFlags(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `StdVideoAV1ColorConfigFlags` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public StdVideoAV1ColorConfigFlags at(long index, Consumer<StdVideoAV1ColorConfigFlags> func) { func.accept(asSlice(index)); return this; }

}
