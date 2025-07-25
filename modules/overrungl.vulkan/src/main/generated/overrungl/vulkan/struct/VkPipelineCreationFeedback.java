/*
 * MIT License
 *
 * Copyright (c) 2022-2025 Overrun Organization
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 */

// This file is auto-generated. DO NOT EDIT!
//@formatter:off
package overrungl.vulkan.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkPipelineCreationFeedback {
///     ((uint32_t) VkFlags) VkPipelineCreationFeedbackFlags flags;
///     uint64_t duration;
/// };
/// ```
public final class VkPipelineCreationFeedback extends GroupType {
    /// The struct layout of `VkPipelineCreationFeedback`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
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

    /// Creates `VkPipelineCreationFeedback` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPipelineCreationFeedback(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPipelineCreationFeedback` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineCreationFeedback of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineCreationFeedback(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPipelineCreationFeedback` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineCreationFeedback ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineCreationFeedback(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPipelineCreationFeedback` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineCreationFeedback ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineCreationFeedback(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPipelineCreationFeedback` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPipelineCreationFeedback`
    public static VkPipelineCreationFeedback alloc(SegmentAllocator allocator) { return new VkPipelineCreationFeedback(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPipelineCreationFeedback` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPipelineCreationFeedback`
    public static VkPipelineCreationFeedback alloc(SegmentAllocator allocator, long count) { return new VkPipelineCreationFeedback(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkPipelineCreationFeedback` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param flags `flags`
    /// @param duration `duration`
    /// @return the allocated `VkPipelineCreationFeedback`
    public static VkPipelineCreationFeedback allocInit(SegmentAllocator allocator, int flags, long duration) {
        return alloc(allocator).flags(flags).duration(duration);
    }

    /// Allocates a `VkPipelineCreationFeedback` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param flags `flags`
    /// @return the allocated `VkPipelineCreationFeedback`
    public static VkPipelineCreationFeedback allocInit(SegmentAllocator allocator, int flags) {
        return alloc(allocator).flags(flags);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPipelineCreationFeedback copyFrom(VkPipelineCreationFeedback src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPipelineCreationFeedback reinterpret(long count) { return new VkPipelineCreationFeedback(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkPipelineCreationFeedback flags(int value) { flags(this.segment(), 0L, value); return this; }

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
    public VkPipelineCreationFeedback duration(long value) { duration(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkPipelineCreationFeedback`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPipelineCreationFeedback`
    public VkPipelineCreationFeedback asSlice(long index) { return new VkPipelineCreationFeedback(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPipelineCreationFeedback`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPipelineCreationFeedback`
    public VkPipelineCreationFeedback asSlice(long index, long count) { return new VkPipelineCreationFeedback(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPipelineCreationFeedback` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPipelineCreationFeedback at(long index, Consumer<VkPipelineCreationFeedback> func) { func.accept(asSlice(index)); return this; }

    /// {@return `flags` at the given index}
    /// @param index the index of the struct buffer
    public int flagsAt(long index) { return flags(this.segment(), index); }
    /// Sets `flags` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPipelineCreationFeedback flagsAt(long index, int value) { flags(this.segment(), index, value); return this; }

    /// {@return `duration` at the given index}
    /// @param index the index of the struct buffer
    public long durationAt(long index) { return duration(this.segment(), index); }
    /// Sets `duration` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPipelineCreationFeedback durationAt(long index, long value) { duration(this.segment(), index, value); return this; }

}
