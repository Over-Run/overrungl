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
/// struct VkRefreshObjectKHR {
///     (int) VkObjectType objectType;
///     uint64_t objectHandle;
///     ((uint32_t) VkFlags) VkRefreshObjectFlagsKHR flags;
/// };
/// ```
public sealed class VkRefreshObjectKHR extends GroupType {
    /// The struct layout of `VkRefreshObjectKHR`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("objectType"),
        ValueLayout.JAVA_LONG.withName("objectHandle"),
        ValueLayout.JAVA_INT.withName("flags")
    );
    /// The byte offset of `objectType`.
    public static final long OFFSET_objectType = LAYOUT.byteOffset(PathElement.groupElement("objectType"));
    /// The memory layout of `objectType`.
    public static final MemoryLayout LAYOUT_objectType = LAYOUT.select(PathElement.groupElement("objectType"));
    /// The [VarHandle] of `objectType` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_objectType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("objectType"));
    /// The byte offset of `objectHandle`.
    public static final long OFFSET_objectHandle = LAYOUT.byteOffset(PathElement.groupElement("objectHandle"));
    /// The memory layout of `objectHandle`.
    public static final MemoryLayout LAYOUT_objectHandle = LAYOUT.select(PathElement.groupElement("objectHandle"));
    /// The [VarHandle] of `objectHandle` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_objectHandle = LAYOUT.arrayElementVarHandle(PathElement.groupElement("objectHandle"));
    /// The byte offset of `flags`.
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    /// The memory layout of `flags`.
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    /// The [VarHandle] of `flags` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));

    /// Creates `VkRefreshObjectKHR` with the given segment.
    /// @param segment the memory segment
    public VkRefreshObjectKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkRefreshObjectKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkRefreshObjectKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkRefreshObjectKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkRefreshObjectKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkRefreshObjectKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkRefreshObjectKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkRefreshObjectKHR`
    public static VkRefreshObjectKHR alloc(SegmentAllocator allocator) { return new VkRefreshObjectKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkRefreshObjectKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkRefreshObjectKHR`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkRefreshObjectKHR copyFrom(VkRefreshObjectKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { if (this instanceof Buffer buf) return buf; else return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `objectType` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int objectType(MemorySegment segment, long index) { return (int) VH_objectType.get(segment, 0L, index); }
    /// {@return `objectType`}
    public int objectType() { return objectType(this.segment(), 0L); }
    /// Sets `objectType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void objectType(MemorySegment segment, long index, int value) { VH_objectType.set(segment, 0L, index, value); }
    /// Sets `objectType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRefreshObjectKHR objectType(int value) { objectType(this.segment(), 0L, value); return this; }

    /// {@return `objectHandle` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long objectHandle(MemorySegment segment, long index) { return (long) VH_objectHandle.get(segment, 0L, index); }
    /// {@return `objectHandle`}
    public long objectHandle() { return objectHandle(this.segment(), 0L); }
    /// Sets `objectHandle` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void objectHandle(MemorySegment segment, long index, long value) { VH_objectHandle.set(segment, 0L, index, value); }
    /// Sets `objectHandle` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRefreshObjectKHR objectHandle(long value) { objectHandle(this.segment(), 0L, value); return this; }

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
    public VkRefreshObjectKHR flags(int value) { flags(this.segment(), 0L, value); return this; }

    /// A buffer of [VkRefreshObjectKHR].
    public static final class Buffer extends VkRefreshObjectKHR {
        private final long elementCount;

        /// Creates `VkRefreshObjectKHR.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkRefreshObjectKHR`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkRefreshObjectKHR`
        public VkRefreshObjectKHR asSlice(long index) { return new VkRefreshObjectKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkRefreshObjectKHR`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkRefreshObjectKHR`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `objectType` at the given index}
        /// @param index the index of the struct buffer
        public int objectTypeAt(long index) { return objectType(this.segment(), index); }
        /// Sets `objectType` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer objectTypeAt(long index, int value) { objectType(this.segment(), index, value); return this; }

        /// {@return `objectHandle` at the given index}
        /// @param index the index of the struct buffer
        public long objectHandleAt(long index) { return objectHandle(this.segment(), index); }
        /// Sets `objectHandle` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer objectHandleAt(long index, long value) { objectHandle(this.segment(), index, value); return this; }

        /// {@return `flags` at the given index}
        /// @param index the index of the struct buffer
        public int flagsAt(long index) { return flags(this.segment(), index); }
        /// Sets `flags` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer flagsAt(long index, int value) { flags(this.segment(), index, value); return this; }

    }
}
