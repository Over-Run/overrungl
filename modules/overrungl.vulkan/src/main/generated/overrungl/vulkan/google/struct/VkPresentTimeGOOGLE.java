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
/// struct VkPresentTimeGOOGLE {
///     uint32_t presentID;
///     uint64_t desiredPresentTime;
/// };
/// ```
public sealed class VkPresentTimeGOOGLE extends GroupType {
    /// The struct layout of `VkPresentTimeGOOGLE`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("presentID"),
        ValueLayout.JAVA_LONG.withName("desiredPresentTime")
    );
    /// The byte offset of `presentID`.
    public static final long OFFSET_presentID = LAYOUT.byteOffset(PathElement.groupElement("presentID"));
    /// The memory layout of `presentID`.
    public static final MemoryLayout LAYOUT_presentID = LAYOUT.select(PathElement.groupElement("presentID"));
    /// The [VarHandle] of `presentID` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_presentID = LAYOUT.arrayElementVarHandle(PathElement.groupElement("presentID"));
    /// The byte offset of `desiredPresentTime`.
    public static final long OFFSET_desiredPresentTime = LAYOUT.byteOffset(PathElement.groupElement("desiredPresentTime"));
    /// The memory layout of `desiredPresentTime`.
    public static final MemoryLayout LAYOUT_desiredPresentTime = LAYOUT.select(PathElement.groupElement("desiredPresentTime"));
    /// The [VarHandle] of `desiredPresentTime` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_desiredPresentTime = LAYOUT.arrayElementVarHandle(PathElement.groupElement("desiredPresentTime"));

    /// Creates `VkPresentTimeGOOGLE` with the given segment.
    /// @param segment the memory segment
    public VkPresentTimeGOOGLE(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPresentTimeGOOGLE` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPresentTimeGOOGLE` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPresentTimeGOOGLE ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPresentTimeGOOGLE(segment.reinterpret(LAYOUT.byteSize())); }

    /// Creates `VkPresentTimeGOOGLE` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPresentTimeGOOGLE` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPresentTimeGOOGLE`
    public static VkPresentTimeGOOGLE alloc(SegmentAllocator allocator) { return new VkPresentTimeGOOGLE(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPresentTimeGOOGLE` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPresentTimeGOOGLE`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkPresentTimeGOOGLE` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param presentID `presentID`
    /// @param desiredPresentTime `desiredPresentTime`
    /// @return the allocated `VkPresentTimeGOOGLE`
    public static VkPresentTimeGOOGLE allocInit(SegmentAllocator allocator, int presentID, long desiredPresentTime) {
        return alloc(allocator).presentID(presentID).desiredPresentTime(desiredPresentTime);
    }

    /// Allocates a `VkPresentTimeGOOGLE` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param presentID `presentID`
    /// @return the allocated `VkPresentTimeGOOGLE`
    public static VkPresentTimeGOOGLE allocInit(SegmentAllocator allocator, int presentID) {
        return alloc(allocator).presentID(presentID);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPresentTimeGOOGLE copyFrom(VkPresentTimeGOOGLE src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { if (this instanceof Buffer buf) return buf; else return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `presentID` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int presentID(MemorySegment segment, long index) { return (int) VH_presentID.get(segment, 0L, index); }
    /// {@return `presentID`}
    public int presentID() { return presentID(this.segment(), 0L); }
    /// Sets `presentID` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void presentID(MemorySegment segment, long index, int value) { VH_presentID.set(segment, 0L, index, value); }
    /// Sets `presentID` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPresentTimeGOOGLE presentID(int value) { presentID(this.segment(), 0L, value); return this; }

    /// {@return `desiredPresentTime` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long desiredPresentTime(MemorySegment segment, long index) { return (long) VH_desiredPresentTime.get(segment, 0L, index); }
    /// {@return `desiredPresentTime`}
    public long desiredPresentTime() { return desiredPresentTime(this.segment(), 0L); }
    /// Sets `desiredPresentTime` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void desiredPresentTime(MemorySegment segment, long index, long value) { VH_desiredPresentTime.set(segment, 0L, index, value); }
    /// Sets `desiredPresentTime` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPresentTimeGOOGLE desiredPresentTime(long value) { desiredPresentTime(this.segment(), 0L, value); return this; }

    /// A buffer of [VkPresentTimeGOOGLE].
    public static final class Buffer extends VkPresentTimeGOOGLE {
        private final long elementCount;

        /// Creates `VkPresentTimeGOOGLE.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkPresentTimeGOOGLE`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkPresentTimeGOOGLE`
        public VkPresentTimeGOOGLE asSlice(long index) { return new VkPresentTimeGOOGLE(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkPresentTimeGOOGLE`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkPresentTimeGOOGLE`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `presentID` at the given index}
        /// @param index the index of the struct buffer
        public int presentIDAt(long index) { return presentID(this.segment(), index); }
        /// Sets `presentID` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer presentIDAt(long index, int value) { presentID(this.segment(), index, value); return this; }

        /// {@return `desiredPresentTime` at the given index}
        /// @param index the index of the struct buffer
        public long desiredPresentTimeAt(long index) { return desiredPresentTime(this.segment(), index); }
        /// Sets `desiredPresentTime` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer desiredPresentTimeAt(long index, long value) { desiredPresentTime(this.segment(), index, value); return this; }

    }
}
