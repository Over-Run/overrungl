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
/// ### int32
/// [VarHandle][#VH_int32] - [Getter][#int32()] - [Setter][#int32(int)]
/// ### int64
/// [VarHandle][#VH_int64] - [Getter][#int64()] - [Setter][#int64(long)]
/// ### uint32
/// [VarHandle][#VH_uint32] - [Getter][#uint32()] - [Setter][#uint32(int)]
/// ### uint64
/// [VarHandle][#VH_uint64] - [Getter][#uint64()] - [Setter][#uint64(long)]
/// ### float32
/// [VarHandle][#VH_float32] - [Getter][#float32()] - [Setter][#float32(float)]
/// ### float64
/// [VarHandle][#VH_float64] - [Getter][#float64()] - [Setter][#float64(double)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef union VkPerformanceCounterResultKHR {
///     int32_t int32;
///     int64_t int64;
///     uint32_t uint32;
///     uint64_t uint64;
///     float float32;
///     double float64;
/// } VkPerformanceCounterResultKHR;
/// ```
public final class VkPerformanceCounterResultKHR extends Union {
    /// The union layout of `VkPerformanceCounterResultKHR`.
    public static final UnionLayout LAYOUT = MemoryLayout.unionLayout(
        ValueLayout.JAVA_INT.withName("int32"),
        ValueLayout.JAVA_LONG.withName("int64"),
        ValueLayout.JAVA_INT.withName("uint32"),
        ValueLayout.JAVA_LONG.withName("uint64"),
        ValueLayout.JAVA_FLOAT.withName("float32"),
        ValueLayout.JAVA_DOUBLE.withName("float64")
    );
    /// The [VarHandle] of `int32` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_int32 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("int32"));
    /// The [VarHandle] of `int64` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_int64 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("int64"));
    /// The [VarHandle] of `uint32` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_uint32 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("uint32"));
    /// The [VarHandle] of `uint64` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_uint64 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("uint64"));
    /// The [VarHandle] of `float32` of type `(MemorySegment base, long baseOffset, long index)float`.
    public static final VarHandle VH_float32 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("float32"));
    /// The [VarHandle] of `float64` of type `(MemorySegment base, long baseOffset, long index)double`.
    public static final VarHandle VH_float64 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("float64"));

    /// Creates `VkPerformanceCounterResultKHR` with the given segment.
    /// @param segment the memory segment
    public VkPerformanceCounterResultKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPerformanceCounterResultKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPerformanceCounterResultKHR of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPerformanceCounterResultKHR(segment); }

    /// Creates `VkPerformanceCounterResultKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPerformanceCounterResultKHR ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPerformanceCounterResultKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPerformanceCounterResultKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPerformanceCounterResultKHR ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkPerformanceCounterResultKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkPerformanceCounterResultKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPerformanceCounterResultKHR`
    public static VkPerformanceCounterResultKHR alloc(SegmentAllocator allocator) { return new VkPerformanceCounterResultKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPerformanceCounterResultKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPerformanceCounterResultKHR`
    public static VkPerformanceCounterResultKHR alloc(SegmentAllocator allocator, long count) { return new VkPerformanceCounterResultKHR(allocator.allocate(LAYOUT, count)); }

    /// {@return `int32` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("int32_t") int get_int32(MemorySegment segment, long index) { return (int) VH_int32.get(segment, 0L, index); }
    /// {@return `int32`}
    /// @param segment the segment of the struct
    public static @CType("int32_t") int get_int32(MemorySegment segment) { return VkPerformanceCounterResultKHR.get_int32(segment, 0L); }
    /// {@return `int32` at the given index}
    /// @param index the index
    public @CType("int32_t") int int32At(long index) { return VkPerformanceCounterResultKHR.get_int32(this.segment(), index); }
    /// {@return `int32`}
    public @CType("int32_t") int int32() { return VkPerformanceCounterResultKHR.get_int32(this.segment()); }
    /// Sets `int32` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_int32(MemorySegment segment, long index, @CType("int32_t") int value) { VH_int32.set(segment, 0L, index, value); }
    /// Sets `int32` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_int32(MemorySegment segment, @CType("int32_t") int value) { VkPerformanceCounterResultKHR.set_int32(segment, 0L, value); }
    /// Sets `int32` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPerformanceCounterResultKHR int32At(long index, @CType("int32_t") int value) { VkPerformanceCounterResultKHR.set_int32(this.segment(), index, value); return this; }
    /// Sets `int32` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPerformanceCounterResultKHR int32(@CType("int32_t") int value) { VkPerformanceCounterResultKHR.set_int32(this.segment(), value); return this; }

    /// {@return `int64` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("int64_t") long get_int64(MemorySegment segment, long index) { return (long) VH_int64.get(segment, 0L, index); }
    /// {@return `int64`}
    /// @param segment the segment of the struct
    public static @CType("int64_t") long get_int64(MemorySegment segment) { return VkPerformanceCounterResultKHR.get_int64(segment, 0L); }
    /// {@return `int64` at the given index}
    /// @param index the index
    public @CType("int64_t") long int64At(long index) { return VkPerformanceCounterResultKHR.get_int64(this.segment(), index); }
    /// {@return `int64`}
    public @CType("int64_t") long int64() { return VkPerformanceCounterResultKHR.get_int64(this.segment()); }
    /// Sets `int64` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_int64(MemorySegment segment, long index, @CType("int64_t") long value) { VH_int64.set(segment, 0L, index, value); }
    /// Sets `int64` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_int64(MemorySegment segment, @CType("int64_t") long value) { VkPerformanceCounterResultKHR.set_int64(segment, 0L, value); }
    /// Sets `int64` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPerformanceCounterResultKHR int64At(long index, @CType("int64_t") long value) { VkPerformanceCounterResultKHR.set_int64(this.segment(), index, value); return this; }
    /// Sets `int64` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPerformanceCounterResultKHR int64(@CType("int64_t") long value) { VkPerformanceCounterResultKHR.set_int64(this.segment(), value); return this; }

    /// {@return `uint32` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_uint32(MemorySegment segment, long index) { return (int) VH_uint32.get(segment, 0L, index); }
    /// {@return `uint32`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_uint32(MemorySegment segment) { return VkPerformanceCounterResultKHR.get_uint32(segment, 0L); }
    /// {@return `uint32` at the given index}
    /// @param index the index
    public @CType("uint32_t") int uint32At(long index) { return VkPerformanceCounterResultKHR.get_uint32(this.segment(), index); }
    /// {@return `uint32`}
    public @CType("uint32_t") int uint32() { return VkPerformanceCounterResultKHR.get_uint32(this.segment()); }
    /// Sets `uint32` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_uint32(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_uint32.set(segment, 0L, index, value); }
    /// Sets `uint32` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_uint32(MemorySegment segment, @CType("uint32_t") int value) { VkPerformanceCounterResultKHR.set_uint32(segment, 0L, value); }
    /// Sets `uint32` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPerformanceCounterResultKHR uint32At(long index, @CType("uint32_t") int value) { VkPerformanceCounterResultKHR.set_uint32(this.segment(), index, value); return this; }
    /// Sets `uint32` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPerformanceCounterResultKHR uint32(@CType("uint32_t") int value) { VkPerformanceCounterResultKHR.set_uint32(this.segment(), value); return this; }

    /// {@return `uint64` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint64_t") long get_uint64(MemorySegment segment, long index) { return (long) VH_uint64.get(segment, 0L, index); }
    /// {@return `uint64`}
    /// @param segment the segment of the struct
    public static @CType("uint64_t") long get_uint64(MemorySegment segment) { return VkPerformanceCounterResultKHR.get_uint64(segment, 0L); }
    /// {@return `uint64` at the given index}
    /// @param index the index
    public @CType("uint64_t") long uint64At(long index) { return VkPerformanceCounterResultKHR.get_uint64(this.segment(), index); }
    /// {@return `uint64`}
    public @CType("uint64_t") long uint64() { return VkPerformanceCounterResultKHR.get_uint64(this.segment()); }
    /// Sets `uint64` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_uint64(MemorySegment segment, long index, @CType("uint64_t") long value) { VH_uint64.set(segment, 0L, index, value); }
    /// Sets `uint64` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_uint64(MemorySegment segment, @CType("uint64_t") long value) { VkPerformanceCounterResultKHR.set_uint64(segment, 0L, value); }
    /// Sets `uint64` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPerformanceCounterResultKHR uint64At(long index, @CType("uint64_t") long value) { VkPerformanceCounterResultKHR.set_uint64(this.segment(), index, value); return this; }
    /// Sets `uint64` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPerformanceCounterResultKHR uint64(@CType("uint64_t") long value) { VkPerformanceCounterResultKHR.set_uint64(this.segment(), value); return this; }

    /// {@return `float32` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("float") float get_float32(MemorySegment segment, long index) { return (float) VH_float32.get(segment, 0L, index); }
    /// {@return `float32`}
    /// @param segment the segment of the struct
    public static @CType("float") float get_float32(MemorySegment segment) { return VkPerformanceCounterResultKHR.get_float32(segment, 0L); }
    /// {@return `float32` at the given index}
    /// @param index the index
    public @CType("float") float float32At(long index) { return VkPerformanceCounterResultKHR.get_float32(this.segment(), index); }
    /// {@return `float32`}
    public @CType("float") float float32() { return VkPerformanceCounterResultKHR.get_float32(this.segment()); }
    /// Sets `float32` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_float32(MemorySegment segment, long index, @CType("float") float value) { VH_float32.set(segment, 0L, index, value); }
    /// Sets `float32` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_float32(MemorySegment segment, @CType("float") float value) { VkPerformanceCounterResultKHR.set_float32(segment, 0L, value); }
    /// Sets `float32` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPerformanceCounterResultKHR float32At(long index, @CType("float") float value) { VkPerformanceCounterResultKHR.set_float32(this.segment(), index, value); return this; }
    /// Sets `float32` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPerformanceCounterResultKHR float32(@CType("float") float value) { VkPerformanceCounterResultKHR.set_float32(this.segment(), value); return this; }

    /// {@return `float64` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("double") double get_float64(MemorySegment segment, long index) { return (double) VH_float64.get(segment, 0L, index); }
    /// {@return `float64`}
    /// @param segment the segment of the struct
    public static @CType("double") double get_float64(MemorySegment segment) { return VkPerformanceCounterResultKHR.get_float64(segment, 0L); }
    /// {@return `float64` at the given index}
    /// @param index the index
    public @CType("double") double float64At(long index) { return VkPerformanceCounterResultKHR.get_float64(this.segment(), index); }
    /// {@return `float64`}
    public @CType("double") double float64() { return VkPerformanceCounterResultKHR.get_float64(this.segment()); }
    /// Sets `float64` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_float64(MemorySegment segment, long index, @CType("double") double value) { VH_float64.set(segment, 0L, index, value); }
    /// Sets `float64` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_float64(MemorySegment segment, @CType("double") double value) { VkPerformanceCounterResultKHR.set_float64(segment, 0L, value); }
    /// Sets `float64` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPerformanceCounterResultKHR float64At(long index, @CType("double") double value) { VkPerformanceCounterResultKHR.set_float64(this.segment(), index, value); return this; }
    /// Sets `float64` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPerformanceCounterResultKHR float64(@CType("double") double value) { VkPerformanceCounterResultKHR.set_float64(this.segment(), value); return this; }

}
