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
package overrungl.vulkan.khr.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkDisplayPlanePropertiesKHR {
///     (uint64_t) VkDisplayKHR currentDisplay;
///     uint32_t currentStackIndex;
/// };
/// ```
public sealed class VkDisplayPlanePropertiesKHR extends GroupType {
    /// The struct layout of `VkDisplayPlanePropertiesKHR`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_LONG.withName("currentDisplay"),
        ValueLayout.JAVA_INT.withName("currentStackIndex")
    );
    /// The byte offset of `currentDisplay`.
    public static final long OFFSET_currentDisplay = LAYOUT.byteOffset(PathElement.groupElement("currentDisplay"));
    /// The memory layout of `currentDisplay`.
    public static final MemoryLayout LAYOUT_currentDisplay = LAYOUT.select(PathElement.groupElement("currentDisplay"));
    /// The [VarHandle] of `currentDisplay` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_currentDisplay = LAYOUT.arrayElementVarHandle(PathElement.groupElement("currentDisplay"));
    /// The byte offset of `currentStackIndex`.
    public static final long OFFSET_currentStackIndex = LAYOUT.byteOffset(PathElement.groupElement("currentStackIndex"));
    /// The memory layout of `currentStackIndex`.
    public static final MemoryLayout LAYOUT_currentStackIndex = LAYOUT.select(PathElement.groupElement("currentStackIndex"));
    /// The [VarHandle] of `currentStackIndex` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_currentStackIndex = LAYOUT.arrayElementVarHandle(PathElement.groupElement("currentStackIndex"));

    /// Creates `VkDisplayPlanePropertiesKHR` with the given segment.
    /// @param segment the memory segment
    public VkDisplayPlanePropertiesKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkDisplayPlanePropertiesKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkDisplayPlanePropertiesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDisplayPlanePropertiesKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDisplayPlanePropertiesKHR(segment.reinterpret(LAYOUT.byteSize())); }

    /// Creates `VkDisplayPlanePropertiesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkDisplayPlanePropertiesKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDisplayPlanePropertiesKHR`
    public static VkDisplayPlanePropertiesKHR alloc(SegmentAllocator allocator) { return new VkDisplayPlanePropertiesKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkDisplayPlanePropertiesKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkDisplayPlanePropertiesKHR`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkDisplayPlanePropertiesKHR copyFrom(VkDisplayPlanePropertiesKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { if (this instanceof Buffer buf) return buf; else return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `currentDisplay` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long currentDisplay(MemorySegment segment, long index) { return (long) VH_currentDisplay.get(segment, 0L, index); }
    /// {@return `currentDisplay`}
    public long currentDisplay() { return currentDisplay(this.segment(), 0L); }
    /// Sets `currentDisplay` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void currentDisplay(MemorySegment segment, long index, long value) { VH_currentDisplay.set(segment, 0L, index, value); }
    /// Sets `currentDisplay` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDisplayPlanePropertiesKHR currentDisplay(long value) { currentDisplay(this.segment(), 0L, value); return this; }

    /// {@return `currentStackIndex` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int currentStackIndex(MemorySegment segment, long index) { return (int) VH_currentStackIndex.get(segment, 0L, index); }
    /// {@return `currentStackIndex`}
    public int currentStackIndex() { return currentStackIndex(this.segment(), 0L); }
    /// Sets `currentStackIndex` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void currentStackIndex(MemorySegment segment, long index, int value) { VH_currentStackIndex.set(segment, 0L, index, value); }
    /// Sets `currentStackIndex` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDisplayPlanePropertiesKHR currentStackIndex(int value) { currentStackIndex(this.segment(), 0L, value); return this; }

    /// A buffer of [VkDisplayPlanePropertiesKHR].
    public static final class Buffer extends VkDisplayPlanePropertiesKHR {
        private final long elementCount;

        /// Creates `VkDisplayPlanePropertiesKHR.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkDisplayPlanePropertiesKHR`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkDisplayPlanePropertiesKHR`
        public VkDisplayPlanePropertiesKHR asSlice(long index) { return new VkDisplayPlanePropertiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkDisplayPlanePropertiesKHR`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkDisplayPlanePropertiesKHR`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `currentDisplay` at the given index}
        /// @param index the index of the struct buffer
        public long currentDisplayAt(long index) { return currentDisplay(this.segment(), index); }
        /// Sets `currentDisplay` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer currentDisplayAt(long index, long value) { currentDisplay(this.segment(), index, value); return this; }

        /// {@return `currentStackIndex` at the given index}
        /// @param index the index of the struct buffer
        public int currentStackIndexAt(long index) { return currentStackIndex(this.segment(), index); }
        /// Sets `currentStackIndex` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer currentStackIndexAt(long index, int value) { currentStackIndex(this.segment(), index, value); return this; }

    }
}
