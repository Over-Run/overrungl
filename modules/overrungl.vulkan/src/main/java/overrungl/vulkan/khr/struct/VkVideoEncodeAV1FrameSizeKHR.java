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
/// ### intraFrameSize
/// [VarHandle][#VH_intraFrameSize] - [Getter][#intraFrameSize()] - [Setter][#intraFrameSize(int)]
/// ### predictiveFrameSize
/// [VarHandle][#VH_predictiveFrameSize] - [Getter][#predictiveFrameSize()] - [Setter][#predictiveFrameSize(int)]
/// ### bipredictiveFrameSize
/// [VarHandle][#VH_bipredictiveFrameSize] - [Getter][#bipredictiveFrameSize()] - [Setter][#bipredictiveFrameSize(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkVideoEncodeAV1FrameSizeKHR {
///     uint32_t intraFrameSize;
///     uint32_t predictiveFrameSize;
///     uint32_t bipredictiveFrameSize;
/// } VkVideoEncodeAV1FrameSizeKHR;
/// ```
public sealed class VkVideoEncodeAV1FrameSizeKHR extends Struct {
    /// The struct layout of `VkVideoEncodeAV1FrameSizeKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("intraFrameSize"),
        ValueLayout.JAVA_INT.withName("predictiveFrameSize"),
        ValueLayout.JAVA_INT.withName("bipredictiveFrameSize")
    );
    /// The [VarHandle] of `intraFrameSize` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_intraFrameSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("intraFrameSize"));
    /// The [VarHandle] of `predictiveFrameSize` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_predictiveFrameSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("predictiveFrameSize"));
    /// The [VarHandle] of `bipredictiveFrameSize` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_bipredictiveFrameSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("bipredictiveFrameSize"));

    /// Creates `VkVideoEncodeAV1FrameSizeKHR` with the given segment.
    /// @param segment the memory segment
    public VkVideoEncodeAV1FrameSizeKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkVideoEncodeAV1FrameSizeKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeAV1FrameSizeKHR of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkVideoEncodeAV1FrameSizeKHR(segment); }

    /// Creates `VkVideoEncodeAV1FrameSizeKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkVideoEncodeAV1FrameSizeKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeAV1FrameSizeKHR ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkVideoEncodeAV1FrameSizeKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkVideoEncodeAV1FrameSizeKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkVideoEncodeAV1FrameSizeKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkVideoEncodeAV1FrameSizeKHR`
    public static VkVideoEncodeAV1FrameSizeKHR alloc(SegmentAllocator allocator) { return new VkVideoEncodeAV1FrameSizeKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkVideoEncodeAV1FrameSizeKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkVideoEncodeAV1FrameSizeKHR`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkVideoEncodeAV1FrameSizeKHR` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkVideoEncodeAV1FrameSizeKHR`
    public static VkVideoEncodeAV1FrameSizeKHR allocInit(SegmentAllocator allocator, @CType("uint32_t") int intraFrameSize, @CType("uint32_t") int predictiveFrameSize, @CType("uint32_t") int bipredictiveFrameSize) { return alloc(allocator).intraFrameSize(intraFrameSize).predictiveFrameSize(predictiveFrameSize).bipredictiveFrameSize(bipredictiveFrameSize); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkVideoEncodeAV1FrameSizeKHR copyFrom(VkVideoEncodeAV1FrameSizeKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `intraFrameSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_intraFrameSize(MemorySegment segment, long index) { return (int) VH_intraFrameSize.get(segment, 0L, index); }
    /// {@return `intraFrameSize`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_intraFrameSize(MemorySegment segment) { return VkVideoEncodeAV1FrameSizeKHR.get_intraFrameSize(segment, 0L); }
    /// {@return `intraFrameSize`}
    public @CType("uint32_t") int intraFrameSize() { return VkVideoEncodeAV1FrameSizeKHR.get_intraFrameSize(this.segment()); }
    /// Sets `intraFrameSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_intraFrameSize(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_intraFrameSize.set(segment, 0L, index, value); }
    /// Sets `intraFrameSize` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_intraFrameSize(MemorySegment segment, @CType("uint32_t") int value) { VkVideoEncodeAV1FrameSizeKHR.set_intraFrameSize(segment, 0L, value); }
    /// Sets `intraFrameSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1FrameSizeKHR intraFrameSize(@CType("uint32_t") int value) { VkVideoEncodeAV1FrameSizeKHR.set_intraFrameSize(this.segment(), value); return this; }

    /// {@return `predictiveFrameSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_predictiveFrameSize(MemorySegment segment, long index) { return (int) VH_predictiveFrameSize.get(segment, 0L, index); }
    /// {@return `predictiveFrameSize`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_predictiveFrameSize(MemorySegment segment) { return VkVideoEncodeAV1FrameSizeKHR.get_predictiveFrameSize(segment, 0L); }
    /// {@return `predictiveFrameSize`}
    public @CType("uint32_t") int predictiveFrameSize() { return VkVideoEncodeAV1FrameSizeKHR.get_predictiveFrameSize(this.segment()); }
    /// Sets `predictiveFrameSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_predictiveFrameSize(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_predictiveFrameSize.set(segment, 0L, index, value); }
    /// Sets `predictiveFrameSize` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_predictiveFrameSize(MemorySegment segment, @CType("uint32_t") int value) { VkVideoEncodeAV1FrameSizeKHR.set_predictiveFrameSize(segment, 0L, value); }
    /// Sets `predictiveFrameSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1FrameSizeKHR predictiveFrameSize(@CType("uint32_t") int value) { VkVideoEncodeAV1FrameSizeKHR.set_predictiveFrameSize(this.segment(), value); return this; }

    /// {@return `bipredictiveFrameSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_bipredictiveFrameSize(MemorySegment segment, long index) { return (int) VH_bipredictiveFrameSize.get(segment, 0L, index); }
    /// {@return `bipredictiveFrameSize`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_bipredictiveFrameSize(MemorySegment segment) { return VkVideoEncodeAV1FrameSizeKHR.get_bipredictiveFrameSize(segment, 0L); }
    /// {@return `bipredictiveFrameSize`}
    public @CType("uint32_t") int bipredictiveFrameSize() { return VkVideoEncodeAV1FrameSizeKHR.get_bipredictiveFrameSize(this.segment()); }
    /// Sets `bipredictiveFrameSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_bipredictiveFrameSize(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_bipredictiveFrameSize.set(segment, 0L, index, value); }
    /// Sets `bipredictiveFrameSize` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_bipredictiveFrameSize(MemorySegment segment, @CType("uint32_t") int value) { VkVideoEncodeAV1FrameSizeKHR.set_bipredictiveFrameSize(segment, 0L, value); }
    /// Sets `bipredictiveFrameSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1FrameSizeKHR bipredictiveFrameSize(@CType("uint32_t") int value) { VkVideoEncodeAV1FrameSizeKHR.set_bipredictiveFrameSize(this.segment(), value); return this; }

    /// A buffer of [VkVideoEncodeAV1FrameSizeKHR].
    public static final class Buffer extends VkVideoEncodeAV1FrameSizeKHR {
        private final long elementCount;

        /// Creates `VkVideoEncodeAV1FrameSizeKHR.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkVideoEncodeAV1FrameSizeKHR`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkVideoEncodeAV1FrameSizeKHR`
        public VkVideoEncodeAV1FrameSizeKHR asSlice(long index) { return new VkVideoEncodeAV1FrameSizeKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkVideoEncodeAV1FrameSizeKHR`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkVideoEncodeAV1FrameSizeKHR`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `intraFrameSize` at the given index}
        /// @param index the index
        public @CType("uint32_t") int intraFrameSizeAt(long index) { return VkVideoEncodeAV1FrameSizeKHR.get_intraFrameSize(this.segment(), index); }
        /// Sets `intraFrameSize` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer intraFrameSizeAt(long index, @CType("uint32_t") int value) { VkVideoEncodeAV1FrameSizeKHR.set_intraFrameSize(this.segment(), index, value); return this; }

        /// {@return `predictiveFrameSize` at the given index}
        /// @param index the index
        public @CType("uint32_t") int predictiveFrameSizeAt(long index) { return VkVideoEncodeAV1FrameSizeKHR.get_predictiveFrameSize(this.segment(), index); }
        /// Sets `predictiveFrameSize` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer predictiveFrameSizeAt(long index, @CType("uint32_t") int value) { VkVideoEncodeAV1FrameSizeKHR.set_predictiveFrameSize(this.segment(), index, value); return this; }

        /// {@return `bipredictiveFrameSize` at the given index}
        /// @param index the index
        public @CType("uint32_t") int bipredictiveFrameSizeAt(long index) { return VkVideoEncodeAV1FrameSizeKHR.get_bipredictiveFrameSize(this.segment(), index); }
        /// Sets `bipredictiveFrameSize` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer bipredictiveFrameSizeAt(long index, @CType("uint32_t") int value) { VkVideoEncodeAV1FrameSizeKHR.set_bipredictiveFrameSize(this.segment(), index, value); return this; }

    }
}
