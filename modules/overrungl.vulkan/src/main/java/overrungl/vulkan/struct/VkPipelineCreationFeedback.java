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
package overrungl.vulkan.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.annotation.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Members
/// ### flags
/// [VarHandle][#VH_flags] - [Getter][#flags()] - [Setter][#flags(int)]
/// ### duration
/// [VarHandle][#VH_duration] - [Getter][#duration()] - [Setter][#duration(long)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPipelineCreationFeedback {
///     VkPipelineCreationFeedbackFlags flags;
///     uint64_t duration;
/// } VkPipelineCreationFeedback;
/// ```
public sealed class VkPipelineCreationFeedback extends Struct {
    /// The struct layout of `VkPipelineCreationFeedback`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_LONG.withName("duration")
    );
    /// The [VarHandle] of `flags` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    /// The [VarHandle] of `duration` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_duration = LAYOUT.arrayElementVarHandle(PathElement.groupElement("duration"));

    /// Creates `VkPipelineCreationFeedback` with the given segment.
    /// @param segment the memory segment
    public VkPipelineCreationFeedback(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPipelineCreationFeedback` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineCreationFeedback of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPipelineCreationFeedback(segment); }

    /// Creates `VkPipelineCreationFeedback` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPipelineCreationFeedback` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineCreationFeedback ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPipelineCreationFeedback(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPipelineCreationFeedback` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkPipelineCreationFeedback` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPipelineCreationFeedback`
    public static VkPipelineCreationFeedback alloc(SegmentAllocator allocator) { return new VkPipelineCreationFeedback(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPipelineCreationFeedback` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPipelineCreationFeedback`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkPipelineCreationFeedback` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPipelineCreationFeedback`
    public static VkPipelineCreationFeedback allocInit(SegmentAllocator allocator, @CType("VkPipelineCreationFeedbackFlags") int flags, @CType("uint64_t") long duration) { return alloc(allocator).flags(flags).duration(duration); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPipelineCreationFeedback copyFrom(VkPipelineCreationFeedback src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkPipelineCreationFeedbackFlags") int get_flags(MemorySegment segment, long index) { return (int) VH_flags.get(segment, 0L, index); }
    /// {@return `flags`}
    /// @param segment the segment of the struct
    public static @CType("VkPipelineCreationFeedbackFlags") int get_flags(MemorySegment segment) { return VkPipelineCreationFeedback.get_flags(segment, 0L); }
    /// {@return `flags`}
    public @CType("VkPipelineCreationFeedbackFlags") int flags() { return VkPipelineCreationFeedback.get_flags(this.segment()); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_flags(MemorySegment segment, long index, @CType("VkPipelineCreationFeedbackFlags") int value) { VH_flags.set(segment, 0L, index, value); }
    /// Sets `flags` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_flags(MemorySegment segment, @CType("VkPipelineCreationFeedbackFlags") int value) { VkPipelineCreationFeedback.set_flags(segment, 0L, value); }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineCreationFeedback flags(@CType("VkPipelineCreationFeedbackFlags") int value) { VkPipelineCreationFeedback.set_flags(this.segment(), value); return this; }

    /// {@return `duration` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint64_t") long get_duration(MemorySegment segment, long index) { return (long) VH_duration.get(segment, 0L, index); }
    /// {@return `duration`}
    /// @param segment the segment of the struct
    public static @CType("uint64_t") long get_duration(MemorySegment segment) { return VkPipelineCreationFeedback.get_duration(segment, 0L); }
    /// {@return `duration`}
    public @CType("uint64_t") long duration() { return VkPipelineCreationFeedback.get_duration(this.segment()); }
    /// Sets `duration` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_duration(MemorySegment segment, long index, @CType("uint64_t") long value) { VH_duration.set(segment, 0L, index, value); }
    /// Sets `duration` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_duration(MemorySegment segment, @CType("uint64_t") long value) { VkPipelineCreationFeedback.set_duration(segment, 0L, value); }
    /// Sets `duration` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineCreationFeedback duration(@CType("uint64_t") long value) { VkPipelineCreationFeedback.set_duration(this.segment(), value); return this; }

    /// A buffer of [VkPipelineCreationFeedback].
    public static final class Buffer extends VkPipelineCreationFeedback {
        private final long elementCount;

        /// Creates `VkPipelineCreationFeedback.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkPipelineCreationFeedback`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkPipelineCreationFeedback`
        public VkPipelineCreationFeedback asSlice(long index) { return new VkPipelineCreationFeedback(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkPipelineCreationFeedback`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkPipelineCreationFeedback`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `flags` at the given index}
        /// @param index the index
        public @CType("VkPipelineCreationFeedbackFlags") int flagsAt(long index) { return VkPipelineCreationFeedback.get_flags(this.segment(), index); }
        /// Sets `flags` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer flagsAt(long index, @CType("VkPipelineCreationFeedbackFlags") int value) { VkPipelineCreationFeedback.set_flags(this.segment(), index, value); return this; }

        /// {@return `duration` at the given index}
        /// @param index the index
        public @CType("uint64_t") long durationAt(long index) { return VkPipelineCreationFeedback.get_duration(this.segment(), index); }
        /// Sets `duration` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer durationAt(long index, @CType("uint64_t") long value) { VkPipelineCreationFeedback.set_duration(this.segment(), index, value); return this; }

    }
}
