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
import java.util.function.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// union VkPipelineExecutableStatisticValueKHR {
///     (uint32_t) VkBool32 b32;
///     int64_t i64;
///     uint64_t u64;
///     double f64;
/// };
/// ```
public final class VkPipelineExecutableStatisticValueKHR extends GroupType {
    /// The union layout of `VkPipelineExecutableStatisticValueKHR`.
    public static final GroupLayout LAYOUT = MemoryLayout.unionLayout(
        ValueLayout.JAVA_INT.withName("b32"),
        ValueLayout.JAVA_LONG.withName("i64"),
        ValueLayout.JAVA_LONG.withName("u64"),
        ValueLayout.JAVA_DOUBLE.withName("f64")
    );
    /// The byte offset of `b32`.
    public static final long OFFSET_b32 = LAYOUT.byteOffset(PathElement.groupElement("b32"));
    /// The memory layout of `b32`.
    public static final MemoryLayout LAYOUT_b32 = LAYOUT.select(PathElement.groupElement("b32"));
    /// The [VarHandle] of `b32` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_b32 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("b32"));
    /// The byte offset of `i64`.
    public static final long OFFSET_i64 = LAYOUT.byteOffset(PathElement.groupElement("i64"));
    /// The memory layout of `i64`.
    public static final MemoryLayout LAYOUT_i64 = LAYOUT.select(PathElement.groupElement("i64"));
    /// The [VarHandle] of `i64` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_i64 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("i64"));
    /// The byte offset of `u64`.
    public static final long OFFSET_u64 = LAYOUT.byteOffset(PathElement.groupElement("u64"));
    /// The memory layout of `u64`.
    public static final MemoryLayout LAYOUT_u64 = LAYOUT.select(PathElement.groupElement("u64"));
    /// The [VarHandle] of `u64` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_u64 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("u64"));
    /// The byte offset of `f64`.
    public static final long OFFSET_f64 = LAYOUT.byteOffset(PathElement.groupElement("f64"));
    /// The memory layout of `f64`.
    public static final MemoryLayout LAYOUT_f64 = LAYOUT.select(PathElement.groupElement("f64"));
    /// The [VarHandle] of `f64` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_f64 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("f64"));

    /// Creates `VkPipelineExecutableStatisticValueKHR` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this union buffer
    public VkPipelineExecutableStatisticValueKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPipelineExecutableStatisticValueKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineExecutableStatisticValueKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineExecutableStatisticValueKHR(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPipelineExecutableStatisticValueKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineExecutableStatisticValueKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineExecutableStatisticValueKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPipelineExecutableStatisticValueKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineExecutableStatisticValueKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineExecutableStatisticValueKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPipelineExecutableStatisticValueKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPipelineExecutableStatisticValueKHR`
    public static VkPipelineExecutableStatisticValueKHR alloc(SegmentAllocator allocator) { return new VkPipelineExecutableStatisticValueKHR(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPipelineExecutableStatisticValueKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPipelineExecutableStatisticValueKHR`
    public static VkPipelineExecutableStatisticValueKHR alloc(SegmentAllocator allocator, long count) { return new VkPipelineExecutableStatisticValueKHR(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkPipelineExecutableStatisticValueKHR` with the given segment allocator and `b32`.
    /// @param allocator the segment allocator
    /// @param b32 `b32`
    /// @return the allocated `VkPipelineExecutableStatisticValueKHR`
    public static VkPipelineExecutableStatisticValueKHR allocWith_b32(SegmentAllocator allocator, int b32) {
        return alloc(allocator).b32(b32);
    }

    /// Allocates a `VkPipelineExecutableStatisticValueKHR` with the given segment allocator and `i64`.
    /// @param allocator the segment allocator
    /// @param i64 `i64`
    /// @return the allocated `VkPipelineExecutableStatisticValueKHR`
    public static VkPipelineExecutableStatisticValueKHR allocWith_i64(SegmentAllocator allocator, long i64) {
        return alloc(allocator).i64(i64);
    }

    /// Allocates a `VkPipelineExecutableStatisticValueKHR` with the given segment allocator and `u64`.
    /// @param allocator the segment allocator
    /// @param u64 `u64`
    /// @return the allocated `VkPipelineExecutableStatisticValueKHR`
    public static VkPipelineExecutableStatisticValueKHR allocWith_u64(SegmentAllocator allocator, long u64) {
        return alloc(allocator).u64(u64);
    }

    /// Allocates a `VkPipelineExecutableStatisticValueKHR` with the given segment allocator and `f64`.
    /// @param allocator the segment allocator
    /// @param f64 `f64`
    /// @return the allocated `VkPipelineExecutableStatisticValueKHR`
    public static VkPipelineExecutableStatisticValueKHR allocWith_f64(SegmentAllocator allocator, double f64) {
        return alloc(allocator).f64(f64);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPipelineExecutableStatisticValueKHR copyFrom(VkPipelineExecutableStatisticValueKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPipelineExecutableStatisticValueKHR reinterpret(long count) { return new VkPipelineExecutableStatisticValueKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// {@return `b32` at the given index}
    /// @param segment the segment of the union
    /// @param index the index of the union buffer
    public static int b32(MemorySegment segment, long index) { return (int) VH_b32.get(segment, 0L, index); }
    /// {@return `b32`}
    public int b32() { return b32(this.segment(), 0L); }
    /// Sets `b32` with the given value at the given index.
    /// @param segment the segment of the union
    /// @param index the index of the union buffer
    /// @param value the value
    public static void b32(MemorySegment segment, long index, int value) { VH_b32.set(segment, 0L, index, value); }
    /// Sets `b32` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineExecutableStatisticValueKHR b32(int value) { b32(this.segment(), 0L, value); return this; }

    /// {@return `i64` at the given index}
    /// @param segment the segment of the union
    /// @param index the index of the union buffer
    public static long i64(MemorySegment segment, long index) { return (long) VH_i64.get(segment, 0L, index); }
    /// {@return `i64`}
    public long i64() { return i64(this.segment(), 0L); }
    /// Sets `i64` with the given value at the given index.
    /// @param segment the segment of the union
    /// @param index the index of the union buffer
    /// @param value the value
    public static void i64(MemorySegment segment, long index, long value) { VH_i64.set(segment, 0L, index, value); }
    /// Sets `i64` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineExecutableStatisticValueKHR i64(long value) { i64(this.segment(), 0L, value); return this; }

    /// {@return `u64` at the given index}
    /// @param segment the segment of the union
    /// @param index the index of the union buffer
    public static long u64(MemorySegment segment, long index) { return (long) VH_u64.get(segment, 0L, index); }
    /// {@return `u64`}
    public long u64() { return u64(this.segment(), 0L); }
    /// Sets `u64` with the given value at the given index.
    /// @param segment the segment of the union
    /// @param index the index of the union buffer
    /// @param value the value
    public static void u64(MemorySegment segment, long index, long value) { VH_u64.set(segment, 0L, index, value); }
    /// Sets `u64` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineExecutableStatisticValueKHR u64(long value) { u64(this.segment(), 0L, value); return this; }

    /// {@return `f64` at the given index}
    /// @param segment the segment of the union
    /// @param index the index of the union buffer
    public static double f64(MemorySegment segment, long index) { return (double) VH_f64.get(segment, 0L, index); }
    /// {@return `f64`}
    public double f64() { return f64(this.segment(), 0L); }
    /// Sets `f64` with the given value at the given index.
    /// @param segment the segment of the union
    /// @param index the index of the union buffer
    /// @param value the value
    public static void f64(MemorySegment segment, long index, double value) { VH_f64.set(segment, 0L, index, value); }
    /// Sets `f64` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineExecutableStatisticValueKHR f64(double value) { f64(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkPipelineExecutableStatisticValueKHR`.
    /// @param index the index of the union buffer
    /// @return the slice of `VkPipelineExecutableStatisticValueKHR`
    public VkPipelineExecutableStatisticValueKHR asSlice(long index) { return new VkPipelineExecutableStatisticValueKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPipelineExecutableStatisticValueKHR`.
    /// @param index the index of the union buffer
    /// @param count the count
    /// @return the slice of `VkPipelineExecutableStatisticValueKHR`
    public VkPipelineExecutableStatisticValueKHR asSlice(long index, long count) { return new VkPipelineExecutableStatisticValueKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPipelineExecutableStatisticValueKHR` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPipelineExecutableStatisticValueKHR at(long index, Consumer<VkPipelineExecutableStatisticValueKHR> func) { func.accept(asSlice(index)); return this; }

    /// {@return `b32` at the given index}
    /// @param index the index of the union buffer
    public int b32At(long index) { return b32(this.segment(), index); }
    /// Sets `b32` with the given value at the given index.
    /// @param index the index of the union buffer
    /// @param value the value
    /// @return `this`
    public VkPipelineExecutableStatisticValueKHR b32At(long index, int value) { b32(this.segment(), index, value); return this; }

    /// {@return `i64` at the given index}
    /// @param index the index of the union buffer
    public long i64At(long index) { return i64(this.segment(), index); }
    /// Sets `i64` with the given value at the given index.
    /// @param index the index of the union buffer
    /// @param value the value
    /// @return `this`
    public VkPipelineExecutableStatisticValueKHR i64At(long index, long value) { i64(this.segment(), index, value); return this; }

    /// {@return `u64` at the given index}
    /// @param index the index of the union buffer
    public long u64At(long index) { return u64(this.segment(), index); }
    /// Sets `u64` with the given value at the given index.
    /// @param index the index of the union buffer
    /// @param value the value
    /// @return `this`
    public VkPipelineExecutableStatisticValueKHR u64At(long index, long value) { u64(this.segment(), index, value); return this; }

    /// {@return `f64` at the given index}
    /// @param index the index of the union buffer
    public double f64At(long index) { return f64(this.segment(), index); }
    /// Sets `f64` with the given value at the given index.
    /// @param index the index of the union buffer
    /// @param value the value
    /// @return `this`
    public VkPipelineExecutableStatisticValueKHR f64At(long index, double value) { f64(this.segment(), index, value); return this; }

}
