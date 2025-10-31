// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.video;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `StdVideoEncodeH264ReferenceListsInfoFlags`.
/// ## Layout
/// ```
/// struct StdVideoEncodeH264ReferenceListsInfoFlags {
///     uint32_t ref_pic_list_modification_flag_l0 : 1;
///     uint32_t ref_pic_list_modification_flag_l1 : 1;
///     uint32_t reserved : 30;
/// };
/// ```
public final class StdVideoEncodeH264ReferenceListsInfoFlags extends GroupType {
    /// The struct layout of `StdVideoEncodeH264ReferenceListsInfoFlags`.
    public static final StructLayout LAYOUT = LayoutBuilder.bitfields(
        ValueLayout.JAVA_INT.withName("ref_pic_list_modification_flag_l0"), 1,
        ValueLayout.JAVA_INT.withName("ref_pic_list_modification_flag_l1"), 1,
        ValueLayout.JAVA_INT.withName("reserved"), 30
    );

    /// Creates `StdVideoEncodeH264ReferenceListsInfoFlags` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public StdVideoEncodeH264ReferenceListsInfoFlags(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `StdVideoEncodeH264ReferenceListsInfoFlags` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoEncodeH264ReferenceListsInfoFlags of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoEncodeH264ReferenceListsInfoFlags(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `StdVideoEncodeH264ReferenceListsInfoFlags` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoEncodeH264ReferenceListsInfoFlags ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoEncodeH264ReferenceListsInfoFlags(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `StdVideoEncodeH264ReferenceListsInfoFlags` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoEncodeH264ReferenceListsInfoFlags ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoEncodeH264ReferenceListsInfoFlags(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `StdVideoEncodeH264ReferenceListsInfoFlags` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoEncodeH264ReferenceListsInfoFlags`
    public static StdVideoEncodeH264ReferenceListsInfoFlags alloc(SegmentAllocator allocator) { return new StdVideoEncodeH264ReferenceListsInfoFlags(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `StdVideoEncodeH264ReferenceListsInfoFlags` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `StdVideoEncodeH264ReferenceListsInfoFlags`
    public static StdVideoEncodeH264ReferenceListsInfoFlags alloc(SegmentAllocator allocator, long count) { return new StdVideoEncodeH264ReferenceListsInfoFlags(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public StdVideoEncodeH264ReferenceListsInfoFlags copyFrom(StdVideoEncodeH264ReferenceListsInfoFlags src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public StdVideoEncodeH264ReferenceListsInfoFlags reinterpret(long count) { return new StdVideoEncodeH264ReferenceListsInfoFlags(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// Creates a slice of `StdVideoEncodeH264ReferenceListsInfoFlags`.
    /// @param index the index of the struct buffer
    /// @return the slice of `StdVideoEncodeH264ReferenceListsInfoFlags`
    public StdVideoEncodeH264ReferenceListsInfoFlags asSlice(long index) { return new StdVideoEncodeH264ReferenceListsInfoFlags(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `StdVideoEncodeH264ReferenceListsInfoFlags`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `StdVideoEncodeH264ReferenceListsInfoFlags`
    public StdVideoEncodeH264ReferenceListsInfoFlags asSlice(long index, long count) { return new StdVideoEncodeH264ReferenceListsInfoFlags(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `StdVideoEncodeH264ReferenceListsInfoFlags` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public StdVideoEncodeH264ReferenceListsInfoFlags at(long index, Consumer<StdVideoEncodeH264ReferenceListsInfoFlags> func) { func.accept(asSlice(index)); return this; }

}
