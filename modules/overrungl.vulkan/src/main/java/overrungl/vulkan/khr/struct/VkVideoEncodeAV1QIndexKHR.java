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
/// ### intraQIndex
/// [VarHandle][#VH_intraQIndex] - [Getter][#intraQIndex()] - [Setter][#intraQIndex(int)]
/// ### predictiveQIndex
/// [VarHandle][#VH_predictiveQIndex] - [Getter][#predictiveQIndex()] - [Setter][#predictiveQIndex(int)]
/// ### bipredictiveQIndex
/// [VarHandle][#VH_bipredictiveQIndex] - [Getter][#bipredictiveQIndex()] - [Setter][#bipredictiveQIndex(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkVideoEncodeAV1QIndexKHR {
///     uint32_t intraQIndex;
///     uint32_t predictiveQIndex;
///     uint32_t bipredictiveQIndex;
/// } VkVideoEncodeAV1QIndexKHR;
/// ```
public sealed class VkVideoEncodeAV1QIndexKHR extends Struct {
    /// The struct layout of `VkVideoEncodeAV1QIndexKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("intraQIndex"),
        ValueLayout.JAVA_INT.withName("predictiveQIndex"),
        ValueLayout.JAVA_INT.withName("bipredictiveQIndex")
    );
    /// The [VarHandle] of `intraQIndex` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_intraQIndex = LAYOUT.arrayElementVarHandle(PathElement.groupElement("intraQIndex"));
    /// The [VarHandle] of `predictiveQIndex` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_predictiveQIndex = LAYOUT.arrayElementVarHandle(PathElement.groupElement("predictiveQIndex"));
    /// The [VarHandle] of `bipredictiveQIndex` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_bipredictiveQIndex = LAYOUT.arrayElementVarHandle(PathElement.groupElement("bipredictiveQIndex"));

    /// Creates `VkVideoEncodeAV1QIndexKHR` with the given segment.
    /// @param segment the memory segment
    public VkVideoEncodeAV1QIndexKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkVideoEncodeAV1QIndexKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeAV1QIndexKHR of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkVideoEncodeAV1QIndexKHR(segment); }

    /// Creates `VkVideoEncodeAV1QIndexKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkVideoEncodeAV1QIndexKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeAV1QIndexKHR ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkVideoEncodeAV1QIndexKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkVideoEncodeAV1QIndexKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkVideoEncodeAV1QIndexKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkVideoEncodeAV1QIndexKHR`
    public static VkVideoEncodeAV1QIndexKHR alloc(SegmentAllocator allocator) { return new VkVideoEncodeAV1QIndexKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkVideoEncodeAV1QIndexKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkVideoEncodeAV1QIndexKHR`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkVideoEncodeAV1QIndexKHR` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkVideoEncodeAV1QIndexKHR`
    public static VkVideoEncodeAV1QIndexKHR allocInit(SegmentAllocator allocator, @CType("uint32_t") int intraQIndex, @CType("uint32_t") int predictiveQIndex, @CType("uint32_t") int bipredictiveQIndex) { return alloc(allocator).intraQIndex(intraQIndex).predictiveQIndex(predictiveQIndex).bipredictiveQIndex(bipredictiveQIndex); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkVideoEncodeAV1QIndexKHR copyFrom(VkVideoEncodeAV1QIndexKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `intraQIndex` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_intraQIndex(MemorySegment segment, long index) { return (int) VH_intraQIndex.get(segment, 0L, index); }
    /// {@return `intraQIndex`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_intraQIndex(MemorySegment segment) { return VkVideoEncodeAV1QIndexKHR.get_intraQIndex(segment, 0L); }
    /// {@return `intraQIndex`}
    public @CType("uint32_t") int intraQIndex() { return VkVideoEncodeAV1QIndexKHR.get_intraQIndex(this.segment()); }
    /// Sets `intraQIndex` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_intraQIndex(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_intraQIndex.set(segment, 0L, index, value); }
    /// Sets `intraQIndex` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_intraQIndex(MemorySegment segment, @CType("uint32_t") int value) { VkVideoEncodeAV1QIndexKHR.set_intraQIndex(segment, 0L, value); }
    /// Sets `intraQIndex` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1QIndexKHR intraQIndex(@CType("uint32_t") int value) { VkVideoEncodeAV1QIndexKHR.set_intraQIndex(this.segment(), value); return this; }

    /// {@return `predictiveQIndex` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_predictiveQIndex(MemorySegment segment, long index) { return (int) VH_predictiveQIndex.get(segment, 0L, index); }
    /// {@return `predictiveQIndex`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_predictiveQIndex(MemorySegment segment) { return VkVideoEncodeAV1QIndexKHR.get_predictiveQIndex(segment, 0L); }
    /// {@return `predictiveQIndex`}
    public @CType("uint32_t") int predictiveQIndex() { return VkVideoEncodeAV1QIndexKHR.get_predictiveQIndex(this.segment()); }
    /// Sets `predictiveQIndex` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_predictiveQIndex(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_predictiveQIndex.set(segment, 0L, index, value); }
    /// Sets `predictiveQIndex` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_predictiveQIndex(MemorySegment segment, @CType("uint32_t") int value) { VkVideoEncodeAV1QIndexKHR.set_predictiveQIndex(segment, 0L, value); }
    /// Sets `predictiveQIndex` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1QIndexKHR predictiveQIndex(@CType("uint32_t") int value) { VkVideoEncodeAV1QIndexKHR.set_predictiveQIndex(this.segment(), value); return this; }

    /// {@return `bipredictiveQIndex` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_bipredictiveQIndex(MemorySegment segment, long index) { return (int) VH_bipredictiveQIndex.get(segment, 0L, index); }
    /// {@return `bipredictiveQIndex`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_bipredictiveQIndex(MemorySegment segment) { return VkVideoEncodeAV1QIndexKHR.get_bipredictiveQIndex(segment, 0L); }
    /// {@return `bipredictiveQIndex`}
    public @CType("uint32_t") int bipredictiveQIndex() { return VkVideoEncodeAV1QIndexKHR.get_bipredictiveQIndex(this.segment()); }
    /// Sets `bipredictiveQIndex` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_bipredictiveQIndex(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_bipredictiveQIndex.set(segment, 0L, index, value); }
    /// Sets `bipredictiveQIndex` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_bipredictiveQIndex(MemorySegment segment, @CType("uint32_t") int value) { VkVideoEncodeAV1QIndexKHR.set_bipredictiveQIndex(segment, 0L, value); }
    /// Sets `bipredictiveQIndex` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1QIndexKHR bipredictiveQIndex(@CType("uint32_t") int value) { VkVideoEncodeAV1QIndexKHR.set_bipredictiveQIndex(this.segment(), value); return this; }

    /// A buffer of [VkVideoEncodeAV1QIndexKHR].
    public static final class Buffer extends VkVideoEncodeAV1QIndexKHR {
        private final long elementCount;

        /// Creates `VkVideoEncodeAV1QIndexKHR.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkVideoEncodeAV1QIndexKHR`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkVideoEncodeAV1QIndexKHR`
        public VkVideoEncodeAV1QIndexKHR asSlice(long index) { return new VkVideoEncodeAV1QIndexKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkVideoEncodeAV1QIndexKHR`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkVideoEncodeAV1QIndexKHR`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `intraQIndex` at the given index}
        /// @param index the index
        public @CType("uint32_t") int intraQIndexAt(long index) { return VkVideoEncodeAV1QIndexKHR.get_intraQIndex(this.segment(), index); }
        /// Sets `intraQIndex` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer intraQIndexAt(long index, @CType("uint32_t") int value) { VkVideoEncodeAV1QIndexKHR.set_intraQIndex(this.segment(), index, value); return this; }

        /// {@return `predictiveQIndex` at the given index}
        /// @param index the index
        public @CType("uint32_t") int predictiveQIndexAt(long index) { return VkVideoEncodeAV1QIndexKHR.get_predictiveQIndex(this.segment(), index); }
        /// Sets `predictiveQIndex` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer predictiveQIndexAt(long index, @CType("uint32_t") int value) { VkVideoEncodeAV1QIndexKHR.set_predictiveQIndex(this.segment(), index, value); return this; }

        /// {@return `bipredictiveQIndex` at the given index}
        /// @param index the index
        public @CType("uint32_t") int bipredictiveQIndexAt(long index) { return VkVideoEncodeAV1QIndexKHR.get_bipredictiveQIndex(this.segment(), index); }
        /// Sets `bipredictiveQIndex` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer bipredictiveQIndexAt(long index, @CType("uint32_t") int value) { VkVideoEncodeAV1QIndexKHR.set_bipredictiveQIndex(this.segment(), index, value); return this; }

    }
}
