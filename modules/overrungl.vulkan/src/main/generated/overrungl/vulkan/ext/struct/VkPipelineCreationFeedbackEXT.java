// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPipelineCreationFeedbackEXT`.
/// ## Layout
/// ```
/// struct VkPipelineCreationFeedbackEXT {
///     ((uint32_t) VkFlags) VkPipelineCreationFeedbackFlags flags;
///     uint64_t duration;
/// };
/// ```
public final class VkPipelineCreationFeedbackEXT extends GroupType {
    /// The struct layout of `VkPipelineCreationFeedbackEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_LONG.withName("duration")
    );
    /// The byte offset of `flags`.
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    /// The memory layout of `flags`.
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    /// The [VarHandle] of `flags` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    /// The byte offset of `duration`.
    public static final long OFFSET_duration = LAYOUT.byteOffset(PathElement.groupElement("duration"));
    /// The memory layout of `duration`.
    public static final MemoryLayout LAYOUT_duration = LAYOUT.select(PathElement.groupElement("duration"));
    /// The [VarHandle] of `duration` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_duration = LAYOUT.arrayElementVarHandle(PathElement.groupElement("duration"));

    /// Creates `VkPipelineCreationFeedbackEXT` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPipelineCreationFeedbackEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPipelineCreationFeedbackEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineCreationFeedbackEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineCreationFeedbackEXT(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPipelineCreationFeedbackEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineCreationFeedbackEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineCreationFeedbackEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPipelineCreationFeedbackEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineCreationFeedbackEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineCreationFeedbackEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPipelineCreationFeedbackEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPipelineCreationFeedbackEXT`
    public static VkPipelineCreationFeedbackEXT alloc(SegmentAllocator allocator) { return new VkPipelineCreationFeedbackEXT(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPipelineCreationFeedbackEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPipelineCreationFeedbackEXT`
    public static VkPipelineCreationFeedbackEXT alloc(SegmentAllocator allocator, long count) { return new VkPipelineCreationFeedbackEXT(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPipelineCreationFeedbackEXT copyFrom(VkPipelineCreationFeedbackEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPipelineCreationFeedbackEXT reinterpret(long count) { return new VkPipelineCreationFeedbackEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int flags(MemorySegment segment, long index) { return (int) VH_flags.get(segment, 0L, index); }
    /// {@return `flags`}
    public int flags() { return flags(this.segment(), 0L); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void flags(MemorySegment segment, long index, int value) { VH_flags.set(segment, 0L, index, value); }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineCreationFeedbackEXT flags(int value) { flags(this.segment(), 0L, value); return this; }

    /// {@return `duration` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long duration(MemorySegment segment, long index) { return (long) VH_duration.get(segment, 0L, index); }
    /// {@return `duration`}
    public long duration() { return duration(this.segment(), 0L); }
    /// Sets `duration` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void duration(MemorySegment segment, long index, long value) { VH_duration.set(segment, 0L, index, value); }
    /// Sets `duration` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineCreationFeedbackEXT duration(long value) { duration(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkPipelineCreationFeedbackEXT`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPipelineCreationFeedbackEXT`
    public VkPipelineCreationFeedbackEXT asSlice(long index) { return new VkPipelineCreationFeedbackEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPipelineCreationFeedbackEXT`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPipelineCreationFeedbackEXT`
    public VkPipelineCreationFeedbackEXT asSlice(long index, long count) { return new VkPipelineCreationFeedbackEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPipelineCreationFeedbackEXT` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPipelineCreationFeedbackEXT at(long index, Consumer<VkPipelineCreationFeedbackEXT> func) { func.accept(asSlice(index)); return this; }

    /// {@return `flags` at the given index}
    /// @param index the index of the struct buffer
    public int flagsAt(long index) { return flags(this.segment(), index); }
    /// Sets `flags` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPipelineCreationFeedbackEXT flagsAt(long index, int value) { flags(this.segment(), index, value); return this; }

    /// {@return `duration` at the given index}
    /// @param index the index of the struct buffer
    public long durationAt(long index) { return duration(this.segment(), index); }
    /// Sets `duration` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPipelineCreationFeedbackEXT durationAt(long index, long value) { duration(this.segment(), index, value); return this; }

}
