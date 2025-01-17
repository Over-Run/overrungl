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
/// ### qpI
/// [VarHandle][#VH_qpI] - [Getter][#qpI()] - [Setter][#qpI(int)]
/// ### qpP
/// [VarHandle][#VH_qpP] - [Getter][#qpP()] - [Setter][#qpP(int)]
/// ### qpB
/// [VarHandle][#VH_qpB] - [Getter][#qpB()] - [Setter][#qpB(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkVideoEncodeH264QpKHR {
///     int32_t qpI;
///     int32_t qpP;
///     int32_t qpB;
/// } VkVideoEncodeH264QpKHR;
/// ```
public sealed class VkVideoEncodeH264QpKHR extends Struct {
    /// The struct layout of `VkVideoEncodeH264QpKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("qpI"),
        ValueLayout.JAVA_INT.withName("qpP"),
        ValueLayout.JAVA_INT.withName("qpB")
    );
    /// The [VarHandle] of `qpI` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_qpI = LAYOUT.arrayElementVarHandle(PathElement.groupElement("qpI"));
    /// The [VarHandle] of `qpP` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_qpP = LAYOUT.arrayElementVarHandle(PathElement.groupElement("qpP"));
    /// The [VarHandle] of `qpB` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_qpB = LAYOUT.arrayElementVarHandle(PathElement.groupElement("qpB"));

    /// Creates `VkVideoEncodeH264QpKHR` with the given segment.
    /// @param segment the memory segment
    public VkVideoEncodeH264QpKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkVideoEncodeH264QpKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeH264QpKHR of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkVideoEncodeH264QpKHR(segment); }

    /// Creates `VkVideoEncodeH264QpKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkVideoEncodeH264QpKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeH264QpKHR ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkVideoEncodeH264QpKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkVideoEncodeH264QpKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkVideoEncodeH264QpKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkVideoEncodeH264QpKHR`
    public static VkVideoEncodeH264QpKHR alloc(SegmentAllocator allocator) { return new VkVideoEncodeH264QpKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkVideoEncodeH264QpKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkVideoEncodeH264QpKHR`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkVideoEncodeH264QpKHR` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkVideoEncodeH264QpKHR`
    public static VkVideoEncodeH264QpKHR allocInit(SegmentAllocator allocator, @CType("int32_t") int qpI, @CType("int32_t") int qpP, @CType("int32_t") int qpB) { return alloc(allocator).qpI(qpI).qpP(qpP).qpB(qpB); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkVideoEncodeH264QpKHR copyFrom(VkVideoEncodeH264QpKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `qpI` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("int32_t") int get_qpI(MemorySegment segment, long index) { return (int) VH_qpI.get(segment, 0L, index); }
    /// {@return `qpI`}
    /// @param segment the segment of the struct
    public static @CType("int32_t") int get_qpI(MemorySegment segment) { return VkVideoEncodeH264QpKHR.get_qpI(segment, 0L); }
    /// {@return `qpI`}
    public @CType("int32_t") int qpI() { return VkVideoEncodeH264QpKHR.get_qpI(this.segment()); }
    /// Sets `qpI` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_qpI(MemorySegment segment, long index, @CType("int32_t") int value) { VH_qpI.set(segment, 0L, index, value); }
    /// Sets `qpI` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_qpI(MemorySegment segment, @CType("int32_t") int value) { VkVideoEncodeH264QpKHR.set_qpI(segment, 0L, value); }
    /// Sets `qpI` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH264QpKHR qpI(@CType("int32_t") int value) { VkVideoEncodeH264QpKHR.set_qpI(this.segment(), value); return this; }

    /// {@return `qpP` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("int32_t") int get_qpP(MemorySegment segment, long index) { return (int) VH_qpP.get(segment, 0L, index); }
    /// {@return `qpP`}
    /// @param segment the segment of the struct
    public static @CType("int32_t") int get_qpP(MemorySegment segment) { return VkVideoEncodeH264QpKHR.get_qpP(segment, 0L); }
    /// {@return `qpP`}
    public @CType("int32_t") int qpP() { return VkVideoEncodeH264QpKHR.get_qpP(this.segment()); }
    /// Sets `qpP` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_qpP(MemorySegment segment, long index, @CType("int32_t") int value) { VH_qpP.set(segment, 0L, index, value); }
    /// Sets `qpP` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_qpP(MemorySegment segment, @CType("int32_t") int value) { VkVideoEncodeH264QpKHR.set_qpP(segment, 0L, value); }
    /// Sets `qpP` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH264QpKHR qpP(@CType("int32_t") int value) { VkVideoEncodeH264QpKHR.set_qpP(this.segment(), value); return this; }

    /// {@return `qpB` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("int32_t") int get_qpB(MemorySegment segment, long index) { return (int) VH_qpB.get(segment, 0L, index); }
    /// {@return `qpB`}
    /// @param segment the segment of the struct
    public static @CType("int32_t") int get_qpB(MemorySegment segment) { return VkVideoEncodeH264QpKHR.get_qpB(segment, 0L); }
    /// {@return `qpB`}
    public @CType("int32_t") int qpB() { return VkVideoEncodeH264QpKHR.get_qpB(this.segment()); }
    /// Sets `qpB` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_qpB(MemorySegment segment, long index, @CType("int32_t") int value) { VH_qpB.set(segment, 0L, index, value); }
    /// Sets `qpB` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_qpB(MemorySegment segment, @CType("int32_t") int value) { VkVideoEncodeH264QpKHR.set_qpB(segment, 0L, value); }
    /// Sets `qpB` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH264QpKHR qpB(@CType("int32_t") int value) { VkVideoEncodeH264QpKHR.set_qpB(this.segment(), value); return this; }

    /// A buffer of [VkVideoEncodeH264QpKHR].
    public static final class Buffer extends VkVideoEncodeH264QpKHR {
        private final long elementCount;

        /// Creates `VkVideoEncodeH264QpKHR.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkVideoEncodeH264QpKHR`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkVideoEncodeH264QpKHR`
        public VkVideoEncodeH264QpKHR asSlice(long index) { return new VkVideoEncodeH264QpKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkVideoEncodeH264QpKHR`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkVideoEncodeH264QpKHR`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `qpI` at the given index}
        /// @param index the index
        public @CType("int32_t") int qpIAt(long index) { return VkVideoEncodeH264QpKHR.get_qpI(this.segment(), index); }
        /// Sets `qpI` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer qpIAt(long index, @CType("int32_t") int value) { VkVideoEncodeH264QpKHR.set_qpI(this.segment(), index, value); return this; }

        /// {@return `qpP` at the given index}
        /// @param index the index
        public @CType("int32_t") int qpPAt(long index) { return VkVideoEncodeH264QpKHR.get_qpP(this.segment(), index); }
        /// Sets `qpP` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer qpPAt(long index, @CType("int32_t") int value) { VkVideoEncodeH264QpKHR.set_qpP(this.segment(), index, value); return this; }

        /// {@return `qpB` at the given index}
        /// @param index the index
        public @CType("int32_t") int qpBAt(long index) { return VkVideoEncodeH264QpKHR.get_qpB(this.segment(), index); }
        /// Sets `qpB` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer qpBAt(long index, @CType("int32_t") int value) { VkVideoEncodeH264QpKHR.set_qpB(this.segment(), index, value); return this; }

    }
}
