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
package overrungl.vulkan.khr.union;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// union VkPerformanceCounterResultKHR {
///     int32_t int32;
///     int64_t int64;
///     uint32_t uint32;
///     uint64_t uint64;
///     float float32;
///     double float64;
/// };
/// ```
public sealed class VkPerformanceCounterResultKHR extends GroupType {
    /// The union layout of `VkPerformanceCounterResultKHR`.
    public static final GroupLayout LAYOUT = MemoryLayout.unionLayout(
        ValueLayout.JAVA_INT.withName("int32"),
        ValueLayout.JAVA_LONG.withName("int64"),
        ValueLayout.JAVA_INT.withName("uint32"),
        ValueLayout.JAVA_LONG.withName("uint64"),
        ValueLayout.JAVA_FLOAT.withName("float32"),
        ValueLayout.JAVA_DOUBLE.withName("float64")
    );
    /// The byte offset of `int32`.
    public static final long OFFSET_int32 = LAYOUT.byteOffset(PathElement.groupElement("int32"));
    /// The memory layout of `int32`.
    public static final MemoryLayout LAYOUT_int32 = LAYOUT.select(PathElement.groupElement("int32"));
    /// The [VarHandle] of `int32` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_int32 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("int32"));
    /// The byte offset of `int64`.
    public static final long OFFSET_int64 = LAYOUT.byteOffset(PathElement.groupElement("int64"));
    /// The memory layout of `int64`.
    public static final MemoryLayout LAYOUT_int64 = LAYOUT.select(PathElement.groupElement("int64"));
    /// The [VarHandle] of `int64` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_int64 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("int64"));
    /// The byte offset of `uint32`.
    public static final long OFFSET_uint32 = LAYOUT.byteOffset(PathElement.groupElement("uint32"));
    /// The memory layout of `uint32`.
    public static final MemoryLayout LAYOUT_uint32 = LAYOUT.select(PathElement.groupElement("uint32"));
    /// The [VarHandle] of `uint32` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_uint32 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("uint32"));
    /// The byte offset of `uint64`.
    public static final long OFFSET_uint64 = LAYOUT.byteOffset(PathElement.groupElement("uint64"));
    /// The memory layout of `uint64`.
    public static final MemoryLayout LAYOUT_uint64 = LAYOUT.select(PathElement.groupElement("uint64"));
    /// The [VarHandle] of `uint64` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_uint64 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("uint64"));
    /// The byte offset of `float32`.
    public static final long OFFSET_float32 = LAYOUT.byteOffset(PathElement.groupElement("float32"));
    /// The memory layout of `float32`.
    public static final MemoryLayout LAYOUT_float32 = LAYOUT.select(PathElement.groupElement("float32"));
    /// The [VarHandle] of `float32` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_float32 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("float32"));
    /// The byte offset of `float64`.
    public static final long OFFSET_float64 = LAYOUT.byteOffset(PathElement.groupElement("float64"));
    /// The memory layout of `float64`.
    public static final MemoryLayout LAYOUT_float64 = LAYOUT.select(PathElement.groupElement("float64"));
    /// The [VarHandle] of `float64` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_float64 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("float64"));

    /// Creates `VkPerformanceCounterResultKHR` with the given segment.
    /// @param segment the memory segment
    public VkPerformanceCounterResultKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPerformanceCounterResultKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPerformanceCounterResultKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPerformanceCounterResultKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPerformanceCounterResultKHR(segment.reinterpret(LAYOUT.byteSize())); }

    /// Creates `VkPerformanceCounterResultKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPerformanceCounterResultKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPerformanceCounterResultKHR`
    public static VkPerformanceCounterResultKHR alloc(SegmentAllocator allocator) { return new VkPerformanceCounterResultKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPerformanceCounterResultKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPerformanceCounterResultKHR`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkPerformanceCounterResultKHR` with the given segment allocator and `int32`.
    /// @param allocator the segment allocator
    /// @param int32 `int32`
    /// @return the allocated `VkPerformanceCounterResultKHR`
    public static VkPerformanceCounterResultKHR allocWith_int32(SegmentAllocator allocator, int int32) {
        return alloc(allocator).int32(int32);
    }

    /// Allocates a `VkPerformanceCounterResultKHR` with the given segment allocator and `int64`.
    /// @param allocator the segment allocator
    /// @param int64 `int64`
    /// @return the allocated `VkPerformanceCounterResultKHR`
    public static VkPerformanceCounterResultKHR allocWith_int64(SegmentAllocator allocator, long int64) {
        return alloc(allocator).int64(int64);
    }

    /// Allocates a `VkPerformanceCounterResultKHR` with the given segment allocator and `uint32`.
    /// @param allocator the segment allocator
    /// @param uint32 `uint32`
    /// @return the allocated `VkPerformanceCounterResultKHR`
    public static VkPerformanceCounterResultKHR allocWith_uint32(SegmentAllocator allocator, int uint32) {
        return alloc(allocator).uint32(uint32);
    }

    /// Allocates a `VkPerformanceCounterResultKHR` with the given segment allocator and `uint64`.
    /// @param allocator the segment allocator
    /// @param uint64 `uint64`
    /// @return the allocated `VkPerformanceCounterResultKHR`
    public static VkPerformanceCounterResultKHR allocWith_uint64(SegmentAllocator allocator, long uint64) {
        return alloc(allocator).uint64(uint64);
    }

    /// Allocates a `VkPerformanceCounterResultKHR` with the given segment allocator and `float32`.
    /// @param allocator the segment allocator
    /// @param float32 `float32`
    /// @return the allocated `VkPerformanceCounterResultKHR`
    public static VkPerformanceCounterResultKHR allocWith_float32(SegmentAllocator allocator, float float32) {
        return alloc(allocator).float32(float32);
    }

    /// Allocates a `VkPerformanceCounterResultKHR` with the given segment allocator and `float64`.
    /// @param allocator the segment allocator
    /// @param float64 `float64`
    /// @return the allocated `VkPerformanceCounterResultKHR`
    public static VkPerformanceCounterResultKHR allocWith_float64(SegmentAllocator allocator, double float64) {
        return alloc(allocator).float64(float64);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPerformanceCounterResultKHR copyFrom(VkPerformanceCounterResultKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { if (this instanceof Buffer buf) return buf; else return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `int32` at the given index}
    /// @param segment the segment of the union
    /// @param index the index of the union buffer
    public static int int32(MemorySegment segment, long index) { return (int) VH_int32.get(segment, 0L, index); }
    /// {@return `int32`}
    public int int32() { return int32(this.segment(), 0L); }
    /// Sets `int32` with the given value at the given index.
    /// @param segment the segment of the union
    /// @param index the index of the union buffer
    /// @param value the value
    public static void int32(MemorySegment segment, long index, int value) { VH_int32.set(segment, 0L, index, value); }
    /// Sets `int32` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPerformanceCounterResultKHR int32(int value) { int32(this.segment(), 0L, value); return this; }

    /// {@return `int64` at the given index}
    /// @param segment the segment of the union
    /// @param index the index of the union buffer
    public static long int64(MemorySegment segment, long index) { return (long) VH_int64.get(segment, 0L, index); }
    /// {@return `int64`}
    public long int64() { return int64(this.segment(), 0L); }
    /// Sets `int64` with the given value at the given index.
    /// @param segment the segment of the union
    /// @param index the index of the union buffer
    /// @param value the value
    public static void int64(MemorySegment segment, long index, long value) { VH_int64.set(segment, 0L, index, value); }
    /// Sets `int64` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPerformanceCounterResultKHR int64(long value) { int64(this.segment(), 0L, value); return this; }

    /// {@return `uint32` at the given index}
    /// @param segment the segment of the union
    /// @param index the index of the union buffer
    public static int uint32(MemorySegment segment, long index) { return (int) VH_uint32.get(segment, 0L, index); }
    /// {@return `uint32`}
    public int uint32() { return uint32(this.segment(), 0L); }
    /// Sets `uint32` with the given value at the given index.
    /// @param segment the segment of the union
    /// @param index the index of the union buffer
    /// @param value the value
    public static void uint32(MemorySegment segment, long index, int value) { VH_uint32.set(segment, 0L, index, value); }
    /// Sets `uint32` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPerformanceCounterResultKHR uint32(int value) { uint32(this.segment(), 0L, value); return this; }

    /// {@return `uint64` at the given index}
    /// @param segment the segment of the union
    /// @param index the index of the union buffer
    public static long uint64(MemorySegment segment, long index) { return (long) VH_uint64.get(segment, 0L, index); }
    /// {@return `uint64`}
    public long uint64() { return uint64(this.segment(), 0L); }
    /// Sets `uint64` with the given value at the given index.
    /// @param segment the segment of the union
    /// @param index the index of the union buffer
    /// @param value the value
    public static void uint64(MemorySegment segment, long index, long value) { VH_uint64.set(segment, 0L, index, value); }
    /// Sets `uint64` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPerformanceCounterResultKHR uint64(long value) { uint64(this.segment(), 0L, value); return this; }

    /// {@return `float32` at the given index}
    /// @param segment the segment of the union
    /// @param index the index of the union buffer
    public static float float32(MemorySegment segment, long index) { return (float) VH_float32.get(segment, 0L, index); }
    /// {@return `float32`}
    public float float32() { return float32(this.segment(), 0L); }
    /// Sets `float32` with the given value at the given index.
    /// @param segment the segment of the union
    /// @param index the index of the union buffer
    /// @param value the value
    public static void float32(MemorySegment segment, long index, float value) { VH_float32.set(segment, 0L, index, value); }
    /// Sets `float32` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPerformanceCounterResultKHR float32(float value) { float32(this.segment(), 0L, value); return this; }

    /// {@return `float64` at the given index}
    /// @param segment the segment of the union
    /// @param index the index of the union buffer
    public static double float64(MemorySegment segment, long index) { return (double) VH_float64.get(segment, 0L, index); }
    /// {@return `float64`}
    public double float64() { return float64(this.segment(), 0L); }
    /// Sets `float64` with the given value at the given index.
    /// @param segment the segment of the union
    /// @param index the index of the union buffer
    /// @param value the value
    public static void float64(MemorySegment segment, long index, double value) { VH_float64.set(segment, 0L, index, value); }
    /// Sets `float64` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPerformanceCounterResultKHR float64(double value) { float64(this.segment(), 0L, value); return this; }

    /// A buffer of [VkPerformanceCounterResultKHR].
    public static final class Buffer extends VkPerformanceCounterResultKHR {
        private final long elementCount;

        /// Creates `VkPerformanceCounterResultKHR.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkPerformanceCounterResultKHR`.
        /// @param index the index of the union buffer
        /// @return the slice of `VkPerformanceCounterResultKHR`
        public VkPerformanceCounterResultKHR asSlice(long index) { return new VkPerformanceCounterResultKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkPerformanceCounterResultKHR`.
        /// @param index the index of the union buffer
        /// @param count the count
        /// @return the slice of `VkPerformanceCounterResultKHR`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `int32` at the given index}
        /// @param index the index of the union buffer
        public int int32At(long index) { return int32(this.segment(), index); }
        /// Sets `int32` with the given value at the given index.
        /// @param index the index of the union buffer
        /// @param value the value
        /// @return `this`
        public Buffer int32At(long index, int value) { int32(this.segment(), index, value); return this; }

        /// {@return `int64` at the given index}
        /// @param index the index of the union buffer
        public long int64At(long index) { return int64(this.segment(), index); }
        /// Sets `int64` with the given value at the given index.
        /// @param index the index of the union buffer
        /// @param value the value
        /// @return `this`
        public Buffer int64At(long index, long value) { int64(this.segment(), index, value); return this; }

        /// {@return `uint32` at the given index}
        /// @param index the index of the union buffer
        public int uint32At(long index) { return uint32(this.segment(), index); }
        /// Sets `uint32` with the given value at the given index.
        /// @param index the index of the union buffer
        /// @param value the value
        /// @return `this`
        public Buffer uint32At(long index, int value) { uint32(this.segment(), index, value); return this; }

        /// {@return `uint64` at the given index}
        /// @param index the index of the union buffer
        public long uint64At(long index) { return uint64(this.segment(), index); }
        /// Sets `uint64` with the given value at the given index.
        /// @param index the index of the union buffer
        /// @param value the value
        /// @return `this`
        public Buffer uint64At(long index, long value) { uint64(this.segment(), index, value); return this; }

        /// {@return `float32` at the given index}
        /// @param index the index of the union buffer
        public float float32At(long index) { return float32(this.segment(), index); }
        /// Sets `float32` with the given value at the given index.
        /// @param index the index of the union buffer
        /// @param value the value
        /// @return `this`
        public Buffer float32At(long index, float value) { float32(this.segment(), index, value); return this; }

        /// {@return `float64` at the given index}
        /// @param index the index of the union buffer
        public double float64At(long index) { return float64(this.segment(), index); }
        /// Sets `float64` with the given value at the given index.
        /// @param index the index of the union buffer
        /// @param value the value
        /// @return `this`
        public Buffer float64At(long index, double value) { float64(this.segment(), index, value); return this; }

    }
}
