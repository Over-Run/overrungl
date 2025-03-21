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
package overrungl.vulkan.ext.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkDrawIndirectCountIndirectCommandEXT {
///     (uint64_t) VkDeviceAddress bufferAddress;
///     uint32_t stride;
///     uint32_t commandCount;
/// };
/// ```
public sealed class VkDrawIndirectCountIndirectCommandEXT extends GroupType {
    /// The struct layout of `VkDrawIndirectCountIndirectCommandEXT`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_LONG.withName("bufferAddress"),
        ValueLayout.JAVA_INT.withName("stride"),
        ValueLayout.JAVA_INT.withName("commandCount")
    );
    /// The byte offset of `bufferAddress`.
    public static final long OFFSET_bufferAddress = LAYOUT.byteOffset(PathElement.groupElement("bufferAddress"));
    /// The memory layout of `bufferAddress`.
    public static final MemoryLayout LAYOUT_bufferAddress = LAYOUT.select(PathElement.groupElement("bufferAddress"));
    /// The [VarHandle] of `bufferAddress` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_bufferAddress = LAYOUT.arrayElementVarHandle(PathElement.groupElement("bufferAddress"));
    /// The byte offset of `stride`.
    public static final long OFFSET_stride = LAYOUT.byteOffset(PathElement.groupElement("stride"));
    /// The memory layout of `stride`.
    public static final MemoryLayout LAYOUT_stride = LAYOUT.select(PathElement.groupElement("stride"));
    /// The [VarHandle] of `stride` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_stride = LAYOUT.arrayElementVarHandle(PathElement.groupElement("stride"));
    /// The byte offset of `commandCount`.
    public static final long OFFSET_commandCount = LAYOUT.byteOffset(PathElement.groupElement("commandCount"));
    /// The memory layout of `commandCount`.
    public static final MemoryLayout LAYOUT_commandCount = LAYOUT.select(PathElement.groupElement("commandCount"));
    /// The [VarHandle] of `commandCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_commandCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("commandCount"));

    /// Creates `VkDrawIndirectCountIndirectCommandEXT` with the given segment.
    /// @param segment the memory segment
    public VkDrawIndirectCountIndirectCommandEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkDrawIndirectCountIndirectCommandEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkDrawIndirectCountIndirectCommandEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDrawIndirectCountIndirectCommandEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDrawIndirectCountIndirectCommandEXT(segment.reinterpret(LAYOUT.byteSize())); }

    /// Creates `VkDrawIndirectCountIndirectCommandEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkDrawIndirectCountIndirectCommandEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDrawIndirectCountIndirectCommandEXT`
    public static VkDrawIndirectCountIndirectCommandEXT alloc(SegmentAllocator allocator) { return new VkDrawIndirectCountIndirectCommandEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkDrawIndirectCountIndirectCommandEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkDrawIndirectCountIndirectCommandEXT`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkDrawIndirectCountIndirectCommandEXT copyFrom(VkDrawIndirectCountIndirectCommandEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { if (this instanceof Buffer buf) return buf; else return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `bufferAddress` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long bufferAddress(MemorySegment segment, long index) { return (long) VH_bufferAddress.get(segment, 0L, index); }
    /// {@return `bufferAddress`}
    public long bufferAddress() { return bufferAddress(this.segment(), 0L); }
    /// Sets `bufferAddress` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void bufferAddress(MemorySegment segment, long index, long value) { VH_bufferAddress.set(segment, 0L, index, value); }
    /// Sets `bufferAddress` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDrawIndirectCountIndirectCommandEXT bufferAddress(long value) { bufferAddress(this.segment(), 0L, value); return this; }

    /// {@return `stride` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int stride(MemorySegment segment, long index) { return (int) VH_stride.get(segment, 0L, index); }
    /// {@return `stride`}
    public int stride() { return stride(this.segment(), 0L); }
    /// Sets `stride` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void stride(MemorySegment segment, long index, int value) { VH_stride.set(segment, 0L, index, value); }
    /// Sets `stride` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDrawIndirectCountIndirectCommandEXT stride(int value) { stride(this.segment(), 0L, value); return this; }

    /// {@return `commandCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int commandCount(MemorySegment segment, long index) { return (int) VH_commandCount.get(segment, 0L, index); }
    /// {@return `commandCount`}
    public int commandCount() { return commandCount(this.segment(), 0L); }
    /// Sets `commandCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void commandCount(MemorySegment segment, long index, int value) { VH_commandCount.set(segment, 0L, index, value); }
    /// Sets `commandCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDrawIndirectCountIndirectCommandEXT commandCount(int value) { commandCount(this.segment(), 0L, value); return this; }

    /// A buffer of [VkDrawIndirectCountIndirectCommandEXT].
    public static final class Buffer extends VkDrawIndirectCountIndirectCommandEXT {
        private final long elementCount;

        /// Creates `VkDrawIndirectCountIndirectCommandEXT.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkDrawIndirectCountIndirectCommandEXT`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkDrawIndirectCountIndirectCommandEXT`
        public VkDrawIndirectCountIndirectCommandEXT asSlice(long index) { return new VkDrawIndirectCountIndirectCommandEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkDrawIndirectCountIndirectCommandEXT`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkDrawIndirectCountIndirectCommandEXT`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `bufferAddress` at the given index}
        /// @param index the index of the struct buffer
        public long bufferAddressAt(long index) { return bufferAddress(this.segment(), index); }
        /// Sets `bufferAddress` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer bufferAddressAt(long index, long value) { bufferAddress(this.segment(), index, value); return this; }

        /// {@return `stride` at the given index}
        /// @param index the index of the struct buffer
        public int strideAt(long index) { return stride(this.segment(), index); }
        /// Sets `stride` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer strideAt(long index, int value) { stride(this.segment(), index, value); return this; }

        /// {@return `commandCount` at the given index}
        /// @param index the index of the struct buffer
        public int commandCountAt(long index) { return commandCount(this.segment(), index); }
        /// Sets `commandCount` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer commandCountAt(long index, int value) { commandCount(this.segment(), index, value); return this; }

    }
}
