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
package overrungl.vulkan.google.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkRefreshCycleDurationGOOGLE {
///     uint64_t refreshDuration;
/// };
/// ```
public sealed class VkRefreshCycleDurationGOOGLE extends GroupType {
    /// The struct layout of `VkRefreshCycleDurationGOOGLE`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_LONG.withName("refreshDuration")
    );
    /// The byte offset of `refreshDuration`.
    public static final long OFFSET_refreshDuration = LAYOUT.byteOffset(PathElement.groupElement("refreshDuration"));
    /// The memory layout of `refreshDuration`.
    public static final MemoryLayout LAYOUT_refreshDuration = LAYOUT.select(PathElement.groupElement("refreshDuration"));
    /// The [VarHandle] of `refreshDuration` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_refreshDuration = LAYOUT.arrayElementVarHandle(PathElement.groupElement("refreshDuration"));

    /// Creates `VkRefreshCycleDurationGOOGLE` with the given segment.
    /// @param segment the memory segment
    public VkRefreshCycleDurationGOOGLE(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkRefreshCycleDurationGOOGLE` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkRefreshCycleDurationGOOGLE` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkRefreshCycleDurationGOOGLE ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkRefreshCycleDurationGOOGLE(segment.reinterpret(LAYOUT.byteSize())); }

    /// Creates `VkRefreshCycleDurationGOOGLE` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkRefreshCycleDurationGOOGLE` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkRefreshCycleDurationGOOGLE`
    public static VkRefreshCycleDurationGOOGLE alloc(SegmentAllocator allocator) { return new VkRefreshCycleDurationGOOGLE(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkRefreshCycleDurationGOOGLE` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkRefreshCycleDurationGOOGLE`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkRefreshCycleDurationGOOGLE` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param refreshDuration `refreshDuration`
    /// @return the allocated `VkRefreshCycleDurationGOOGLE`
    public static VkRefreshCycleDurationGOOGLE allocInit(SegmentAllocator allocator, long refreshDuration) {
        return alloc(allocator).refreshDuration(refreshDuration);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkRefreshCycleDurationGOOGLE copyFrom(VkRefreshCycleDurationGOOGLE src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { if (this instanceof Buffer buf) return buf; else return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `refreshDuration` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long refreshDuration(MemorySegment segment, long index) { return (long) VH_refreshDuration.get(segment, 0L, index); }
    /// {@return `refreshDuration`}
    public long refreshDuration() { return refreshDuration(this.segment(), 0L); }
    /// Sets `refreshDuration` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void refreshDuration(MemorySegment segment, long index, long value) { VH_refreshDuration.set(segment, 0L, index, value); }
    /// Sets `refreshDuration` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRefreshCycleDurationGOOGLE refreshDuration(long value) { refreshDuration(this.segment(), 0L, value); return this; }

    /// A buffer of [VkRefreshCycleDurationGOOGLE].
    public static final class Buffer extends VkRefreshCycleDurationGOOGLE {
        private final long elementCount;

        /// Creates `VkRefreshCycleDurationGOOGLE.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkRefreshCycleDurationGOOGLE`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkRefreshCycleDurationGOOGLE`
        public VkRefreshCycleDurationGOOGLE asSlice(long index) { return new VkRefreshCycleDurationGOOGLE(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkRefreshCycleDurationGOOGLE`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkRefreshCycleDurationGOOGLE`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `refreshDuration` at the given index}
        /// @param index the index of the struct buffer
        public long refreshDurationAt(long index) { return refreshDuration(this.segment(), index); }
        /// Sets `refreshDuration` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer refreshDurationAt(long index, long value) { refreshDuration(this.segment(), index, value); return this; }

    }
}
