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
package overrungl.vulkan.khr.union;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.annotation.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Members
/// ### b32
/// [VarHandle][#VH_b32] - [Getter][#b32()] - [Setter][#b32(int)]
/// ### i64
/// [VarHandle][#VH_i64] - [Getter][#i64()] - [Setter][#i64(long)]
/// ### u64
/// [VarHandle][#VH_u64] - [Getter][#u64()] - [Setter][#u64(long)]
/// ### f64
/// [VarHandle][#VH_f64] - [Getter][#f64()] - [Setter][#f64(double)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef union VkPipelineExecutableStatisticValueKHR {
///     VkBool32 b32;
///     int64_t i64;
///     uint64_t u64;
///     double f64;
/// } VkPipelineExecutableStatisticValueKHR;
/// ```
public final class VkPipelineExecutableStatisticValueKHR extends Union {
    /// The union layout of `VkPipelineExecutableStatisticValueKHR`.
    public static final UnionLayout LAYOUT = MemoryLayout.unionLayout(
        ValueLayout.JAVA_INT.withName("b32"),
        ValueLayout.JAVA_LONG.withName("i64"),
        ValueLayout.JAVA_LONG.withName("u64"),
        ValueLayout.JAVA_DOUBLE.withName("f64")
    );
    /// The [VarHandle] of `b32` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_b32 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("b32"));
    /// The [VarHandle] of `i64` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_i64 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("i64"));
    /// The [VarHandle] of `u64` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_u64 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("u64"));
    /// The [VarHandle] of `f64` of type `(MemorySegment base, long baseOffset, long index)double`.
    public static final VarHandle VH_f64 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("f64"));

    /// Creates `VkPipelineExecutableStatisticValueKHR` with the given segment.
    /// @param segment the memory segment
    public VkPipelineExecutableStatisticValueKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPipelineExecutableStatisticValueKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineExecutableStatisticValueKHR of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPipelineExecutableStatisticValueKHR(segment); }

    /// Creates `VkPipelineExecutableStatisticValueKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineExecutableStatisticValueKHR ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPipelineExecutableStatisticValueKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPipelineExecutableStatisticValueKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineExecutableStatisticValueKHR ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkPipelineExecutableStatisticValueKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkPipelineExecutableStatisticValueKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPipelineExecutableStatisticValueKHR`
    public static VkPipelineExecutableStatisticValueKHR alloc(SegmentAllocator allocator) { return new VkPipelineExecutableStatisticValueKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPipelineExecutableStatisticValueKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPipelineExecutableStatisticValueKHR`
    public static VkPipelineExecutableStatisticValueKHR alloc(SegmentAllocator allocator, long count) { return new VkPipelineExecutableStatisticValueKHR(allocator.allocate(LAYOUT, count)); }

    /// {@return `b32` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_b32(MemorySegment segment, long index) { return (int) VH_b32.get(segment, 0L, index); }
    /// {@return `b32`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_b32(MemorySegment segment) { return VkPipelineExecutableStatisticValueKHR.get_b32(segment, 0L); }
    /// {@return `b32` at the given index}
    /// @param index the index
    public @CType("VkBool32") int b32At(long index) { return VkPipelineExecutableStatisticValueKHR.get_b32(this.segment(), index); }
    /// {@return `b32`}
    public @CType("VkBool32") int b32() { return VkPipelineExecutableStatisticValueKHR.get_b32(this.segment()); }
    /// Sets `b32` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_b32(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_b32.set(segment, 0L, index, value); }
    /// Sets `b32` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_b32(MemorySegment segment, @CType("VkBool32") int value) { VkPipelineExecutableStatisticValueKHR.set_b32(segment, 0L, value); }
    /// Sets `b32` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPipelineExecutableStatisticValueKHR b32At(long index, @CType("VkBool32") int value) { VkPipelineExecutableStatisticValueKHR.set_b32(this.segment(), index, value); return this; }
    /// Sets `b32` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineExecutableStatisticValueKHR b32(@CType("VkBool32") int value) { VkPipelineExecutableStatisticValueKHR.set_b32(this.segment(), value); return this; }

    /// {@return `i64` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("int64_t") long get_i64(MemorySegment segment, long index) { return (long) VH_i64.get(segment, 0L, index); }
    /// {@return `i64`}
    /// @param segment the segment of the struct
    public static @CType("int64_t") long get_i64(MemorySegment segment) { return VkPipelineExecutableStatisticValueKHR.get_i64(segment, 0L); }
    /// {@return `i64` at the given index}
    /// @param index the index
    public @CType("int64_t") long i64At(long index) { return VkPipelineExecutableStatisticValueKHR.get_i64(this.segment(), index); }
    /// {@return `i64`}
    public @CType("int64_t") long i64() { return VkPipelineExecutableStatisticValueKHR.get_i64(this.segment()); }
    /// Sets `i64` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_i64(MemorySegment segment, long index, @CType("int64_t") long value) { VH_i64.set(segment, 0L, index, value); }
    /// Sets `i64` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_i64(MemorySegment segment, @CType("int64_t") long value) { VkPipelineExecutableStatisticValueKHR.set_i64(segment, 0L, value); }
    /// Sets `i64` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPipelineExecutableStatisticValueKHR i64At(long index, @CType("int64_t") long value) { VkPipelineExecutableStatisticValueKHR.set_i64(this.segment(), index, value); return this; }
    /// Sets `i64` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineExecutableStatisticValueKHR i64(@CType("int64_t") long value) { VkPipelineExecutableStatisticValueKHR.set_i64(this.segment(), value); return this; }

    /// {@return `u64` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint64_t") long get_u64(MemorySegment segment, long index) { return (long) VH_u64.get(segment, 0L, index); }
    /// {@return `u64`}
    /// @param segment the segment of the struct
    public static @CType("uint64_t") long get_u64(MemorySegment segment) { return VkPipelineExecutableStatisticValueKHR.get_u64(segment, 0L); }
    /// {@return `u64` at the given index}
    /// @param index the index
    public @CType("uint64_t") long u64At(long index) { return VkPipelineExecutableStatisticValueKHR.get_u64(this.segment(), index); }
    /// {@return `u64`}
    public @CType("uint64_t") long u64() { return VkPipelineExecutableStatisticValueKHR.get_u64(this.segment()); }
    /// Sets `u64` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_u64(MemorySegment segment, long index, @CType("uint64_t") long value) { VH_u64.set(segment, 0L, index, value); }
    /// Sets `u64` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_u64(MemorySegment segment, @CType("uint64_t") long value) { VkPipelineExecutableStatisticValueKHR.set_u64(segment, 0L, value); }
    /// Sets `u64` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPipelineExecutableStatisticValueKHR u64At(long index, @CType("uint64_t") long value) { VkPipelineExecutableStatisticValueKHR.set_u64(this.segment(), index, value); return this; }
    /// Sets `u64` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineExecutableStatisticValueKHR u64(@CType("uint64_t") long value) { VkPipelineExecutableStatisticValueKHR.set_u64(this.segment(), value); return this; }

    /// {@return `f64` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("double") double get_f64(MemorySegment segment, long index) { return (double) VH_f64.get(segment, 0L, index); }
    /// {@return `f64`}
    /// @param segment the segment of the struct
    public static @CType("double") double get_f64(MemorySegment segment) { return VkPipelineExecutableStatisticValueKHR.get_f64(segment, 0L); }
    /// {@return `f64` at the given index}
    /// @param index the index
    public @CType("double") double f64At(long index) { return VkPipelineExecutableStatisticValueKHR.get_f64(this.segment(), index); }
    /// {@return `f64`}
    public @CType("double") double f64() { return VkPipelineExecutableStatisticValueKHR.get_f64(this.segment()); }
    /// Sets `f64` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_f64(MemorySegment segment, long index, @CType("double") double value) { VH_f64.set(segment, 0L, index, value); }
    /// Sets `f64` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_f64(MemorySegment segment, @CType("double") double value) { VkPipelineExecutableStatisticValueKHR.set_f64(segment, 0L, value); }
    /// Sets `f64` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPipelineExecutableStatisticValueKHR f64At(long index, @CType("double") double value) { VkPipelineExecutableStatisticValueKHR.set_f64(this.segment(), index, value); return this; }
    /// Sets `f64` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineExecutableStatisticValueKHR f64(@CType("double") double value) { VkPipelineExecutableStatisticValueKHR.set_f64(this.segment(), value); return this; }

}
