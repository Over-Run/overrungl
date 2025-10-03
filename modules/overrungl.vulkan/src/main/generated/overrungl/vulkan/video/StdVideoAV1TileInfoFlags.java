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

/// Represents `StdVideoAV1TileInfoFlags`.
/// ## Layout
/// ```
/// struct StdVideoAV1TileInfoFlags {
///     uint32_t uniform_tile_spacing_flag : 1;
///     uint32_t reserved : 31;
/// };
/// ```
public final class StdVideoAV1TileInfoFlags extends GroupType {
    /// The struct layout of `StdVideoAV1TileInfoFlags`.
    public static final StructLayout LAYOUT = LayoutBuilder.bitfields(
        ValueLayout.JAVA_INT.withName("uniform_tile_spacing_flag"), 1,
        ValueLayout.JAVA_INT.withName("reserved"), 31
    );

    /// Creates `StdVideoAV1TileInfoFlags` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public StdVideoAV1TileInfoFlags(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `StdVideoAV1TileInfoFlags` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoAV1TileInfoFlags of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoAV1TileInfoFlags(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `StdVideoAV1TileInfoFlags` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoAV1TileInfoFlags ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoAV1TileInfoFlags(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `StdVideoAV1TileInfoFlags` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoAV1TileInfoFlags ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoAV1TileInfoFlags(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `StdVideoAV1TileInfoFlags` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoAV1TileInfoFlags`
    public static StdVideoAV1TileInfoFlags alloc(SegmentAllocator allocator) { return new StdVideoAV1TileInfoFlags(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `StdVideoAV1TileInfoFlags` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `StdVideoAV1TileInfoFlags`
    public static StdVideoAV1TileInfoFlags alloc(SegmentAllocator allocator, long count) { return new StdVideoAV1TileInfoFlags(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public StdVideoAV1TileInfoFlags copyFrom(StdVideoAV1TileInfoFlags src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public StdVideoAV1TileInfoFlags reinterpret(long count) { return new StdVideoAV1TileInfoFlags(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// Creates a slice of `StdVideoAV1TileInfoFlags`.
    /// @param index the index of the struct buffer
    /// @return the slice of `StdVideoAV1TileInfoFlags`
    public StdVideoAV1TileInfoFlags asSlice(long index) { return new StdVideoAV1TileInfoFlags(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `StdVideoAV1TileInfoFlags`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `StdVideoAV1TileInfoFlags`
    public StdVideoAV1TileInfoFlags asSlice(long index, long count) { return new StdVideoAV1TileInfoFlags(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `StdVideoAV1TileInfoFlags` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public StdVideoAV1TileInfoFlags at(long index, Consumer<StdVideoAV1TileInfoFlags> func) { func.accept(asSlice(index)); return this; }

}
