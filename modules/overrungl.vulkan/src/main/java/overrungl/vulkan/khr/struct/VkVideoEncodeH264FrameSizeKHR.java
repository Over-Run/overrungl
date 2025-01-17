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
package overrungl.vulkan.khr.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.annotation.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Members
/// ### frameISize
/// [VarHandle][#VH_frameISize] - [Getter][#frameISize()] - [Setter][#frameISize(int)]
/// ### framePSize
/// [VarHandle][#VH_framePSize] - [Getter][#framePSize()] - [Setter][#framePSize(int)]
/// ### frameBSize
/// [VarHandle][#VH_frameBSize] - [Getter][#frameBSize()] - [Setter][#frameBSize(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkVideoEncodeH264FrameSizeKHR {
///     uint32_t frameISize;
///     uint32_t framePSize;
///     uint32_t frameBSize;
/// } VkVideoEncodeH264FrameSizeKHR;
/// ```
public sealed class VkVideoEncodeH264FrameSizeKHR extends Struct {
    /// The struct layout of `VkVideoEncodeH264FrameSizeKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("frameISize"),
        ValueLayout.JAVA_INT.withName("framePSize"),
        ValueLayout.JAVA_INT.withName("frameBSize")
    );
    /// The [VarHandle] of `frameISize` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_frameISize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("frameISize"));
    /// The [VarHandle] of `framePSize` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_framePSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("framePSize"));
    /// The [VarHandle] of `frameBSize` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_frameBSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("frameBSize"));

    /// Creates `VkVideoEncodeH264FrameSizeKHR` with the given segment.
    /// @param segment the memory segment
    public VkVideoEncodeH264FrameSizeKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkVideoEncodeH264FrameSizeKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeH264FrameSizeKHR of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkVideoEncodeH264FrameSizeKHR(segment); }

    /// Creates `VkVideoEncodeH264FrameSizeKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkVideoEncodeH264FrameSizeKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeH264FrameSizeKHR ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkVideoEncodeH264FrameSizeKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkVideoEncodeH264FrameSizeKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkVideoEncodeH264FrameSizeKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkVideoEncodeH264FrameSizeKHR`
    public static VkVideoEncodeH264FrameSizeKHR alloc(SegmentAllocator allocator) { return new VkVideoEncodeH264FrameSizeKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkVideoEncodeH264FrameSizeKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkVideoEncodeH264FrameSizeKHR`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkVideoEncodeH264FrameSizeKHR` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkVideoEncodeH264FrameSizeKHR`
    public static VkVideoEncodeH264FrameSizeKHR allocInit(SegmentAllocator allocator, @CType("uint32_t") int frameISize, @CType("uint32_t") int framePSize, @CType("uint32_t") int frameBSize) { return alloc(allocator).frameISize(frameISize).framePSize(framePSize).frameBSize(frameBSize); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkVideoEncodeH264FrameSizeKHR copyFrom(VkVideoEncodeH264FrameSizeKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `frameISize` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_frameISize(MemorySegment segment, long index) { return (int) VH_frameISize.get(segment, 0L, index); }
    /// {@return `frameISize`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_frameISize(MemorySegment segment) { return VkVideoEncodeH264FrameSizeKHR.get_frameISize(segment, 0L); }
    /// {@return `frameISize`}
    public @CType("uint32_t") int frameISize() { return VkVideoEncodeH264FrameSizeKHR.get_frameISize(this.segment()); }
    /// Sets `frameISize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_frameISize(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_frameISize.set(segment, 0L, index, value); }
    /// Sets `frameISize` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_frameISize(MemorySegment segment, @CType("uint32_t") int value) { VkVideoEncodeH264FrameSizeKHR.set_frameISize(segment, 0L, value); }
    /// Sets `frameISize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH264FrameSizeKHR frameISize(@CType("uint32_t") int value) { VkVideoEncodeH264FrameSizeKHR.set_frameISize(this.segment(), value); return this; }

    /// {@return `framePSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_framePSize(MemorySegment segment, long index) { return (int) VH_framePSize.get(segment, 0L, index); }
    /// {@return `framePSize`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_framePSize(MemorySegment segment) { return VkVideoEncodeH264FrameSizeKHR.get_framePSize(segment, 0L); }
    /// {@return `framePSize`}
    public @CType("uint32_t") int framePSize() { return VkVideoEncodeH264FrameSizeKHR.get_framePSize(this.segment()); }
    /// Sets `framePSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_framePSize(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_framePSize.set(segment, 0L, index, value); }
    /// Sets `framePSize` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_framePSize(MemorySegment segment, @CType("uint32_t") int value) { VkVideoEncodeH264FrameSizeKHR.set_framePSize(segment, 0L, value); }
    /// Sets `framePSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH264FrameSizeKHR framePSize(@CType("uint32_t") int value) { VkVideoEncodeH264FrameSizeKHR.set_framePSize(this.segment(), value); return this; }

    /// {@return `frameBSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_frameBSize(MemorySegment segment, long index) { return (int) VH_frameBSize.get(segment, 0L, index); }
    /// {@return `frameBSize`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_frameBSize(MemorySegment segment) { return VkVideoEncodeH264FrameSizeKHR.get_frameBSize(segment, 0L); }
    /// {@return `frameBSize`}
    public @CType("uint32_t") int frameBSize() { return VkVideoEncodeH264FrameSizeKHR.get_frameBSize(this.segment()); }
    /// Sets `frameBSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_frameBSize(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_frameBSize.set(segment, 0L, index, value); }
    /// Sets `frameBSize` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_frameBSize(MemorySegment segment, @CType("uint32_t") int value) { VkVideoEncodeH264FrameSizeKHR.set_frameBSize(segment, 0L, value); }
    /// Sets `frameBSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH264FrameSizeKHR frameBSize(@CType("uint32_t") int value) { VkVideoEncodeH264FrameSizeKHR.set_frameBSize(this.segment(), value); return this; }

    /// A buffer of [VkVideoEncodeH264FrameSizeKHR].
    public static final class Buffer extends VkVideoEncodeH264FrameSizeKHR {
        private final long elementCount;

        /// Creates `VkVideoEncodeH264FrameSizeKHR.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkVideoEncodeH264FrameSizeKHR`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkVideoEncodeH264FrameSizeKHR`
        public VkVideoEncodeH264FrameSizeKHR asSlice(long index) { return new VkVideoEncodeH264FrameSizeKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkVideoEncodeH264FrameSizeKHR`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkVideoEncodeH264FrameSizeKHR`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `frameISize` at the given index}
        /// @param index the index
        public @CType("uint32_t") int frameISizeAt(long index) { return VkVideoEncodeH264FrameSizeKHR.get_frameISize(this.segment(), index); }
        /// Sets `frameISize` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer frameISizeAt(long index, @CType("uint32_t") int value) { VkVideoEncodeH264FrameSizeKHR.set_frameISize(this.segment(), index, value); return this; }

        /// {@return `framePSize` at the given index}
        /// @param index the index
        public @CType("uint32_t") int framePSizeAt(long index) { return VkVideoEncodeH264FrameSizeKHR.get_framePSize(this.segment(), index); }
        /// Sets `framePSize` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer framePSizeAt(long index, @CType("uint32_t") int value) { VkVideoEncodeH264FrameSizeKHR.set_framePSize(this.segment(), index, value); return this; }

        /// {@return `frameBSize` at the given index}
        /// @param index the index
        public @CType("uint32_t") int frameBSizeAt(long index) { return VkVideoEncodeH264FrameSizeKHR.get_frameBSize(this.segment(), index); }
        /// Sets `frameBSize` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer frameBSizeAt(long index, @CType("uint32_t") int value) { VkVideoEncodeH264FrameSizeKHR.set_frameBSize(this.segment(), index, value); return this; }

    }
}
