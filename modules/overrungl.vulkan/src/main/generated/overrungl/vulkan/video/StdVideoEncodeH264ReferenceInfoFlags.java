// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.video;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `StdVideoEncodeH264ReferenceInfoFlags`.
/// ## Layout
/// ```
/// struct StdVideoEncodeH264ReferenceInfoFlags {
///     uint32_t used_for_long_term_reference : 1;
///     uint32_t reserved : 31;
/// };
/// ```
public final class StdVideoEncodeH264ReferenceInfoFlags extends GroupType {
    /// The struct layout of `StdVideoEncodeH264ReferenceInfoFlags`.
    public static final StructLayout LAYOUT = LayoutBuilder.bitfields(
        ValueLayout.JAVA_INT.withName("used_for_long_term_reference"), 1,
        ValueLayout.JAVA_INT.withName("reserved"), 31
    );

    /// Creates `StdVideoEncodeH264ReferenceInfoFlags` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public StdVideoEncodeH264ReferenceInfoFlags(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `StdVideoEncodeH264ReferenceInfoFlags` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoEncodeH264ReferenceInfoFlags of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoEncodeH264ReferenceInfoFlags(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `StdVideoEncodeH264ReferenceInfoFlags` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoEncodeH264ReferenceInfoFlags ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoEncodeH264ReferenceInfoFlags(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `StdVideoEncodeH264ReferenceInfoFlags` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoEncodeH264ReferenceInfoFlags ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoEncodeH264ReferenceInfoFlags(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `StdVideoEncodeH264ReferenceInfoFlags` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoEncodeH264ReferenceInfoFlags`
    public static StdVideoEncodeH264ReferenceInfoFlags alloc(SegmentAllocator allocator) { return new StdVideoEncodeH264ReferenceInfoFlags(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `StdVideoEncodeH264ReferenceInfoFlags` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `StdVideoEncodeH264ReferenceInfoFlags`
    public static StdVideoEncodeH264ReferenceInfoFlags alloc(SegmentAllocator allocator, long count) { return new StdVideoEncodeH264ReferenceInfoFlags(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public StdVideoEncodeH264ReferenceInfoFlags copyFrom(StdVideoEncodeH264ReferenceInfoFlags src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public StdVideoEncodeH264ReferenceInfoFlags reinterpret(long count) { return new StdVideoEncodeH264ReferenceInfoFlags(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// Creates a slice of `StdVideoEncodeH264ReferenceInfoFlags`.
    /// @param index the index of the struct buffer
    /// @return the slice of `StdVideoEncodeH264ReferenceInfoFlags`
    public StdVideoEncodeH264ReferenceInfoFlags asSlice(long index) { return new StdVideoEncodeH264ReferenceInfoFlags(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `StdVideoEncodeH264ReferenceInfoFlags`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `StdVideoEncodeH264ReferenceInfoFlags`
    public StdVideoEncodeH264ReferenceInfoFlags asSlice(long index, long count) { return new StdVideoEncodeH264ReferenceInfoFlags(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `StdVideoEncodeH264ReferenceInfoFlags` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public StdVideoEncodeH264ReferenceInfoFlags at(long index, Consumer<StdVideoEncodeH264ReferenceInfoFlags> func) { func.accept(asSlice(index)); return this; }

}
