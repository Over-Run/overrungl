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
package overrungl.vulkan.intel.union;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.annotation.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Members
/// ### value32
/// [VarHandle][#VH_value32] - [Getter][#value32()] - [Setter][#value32(int)]
/// ### value64
/// [VarHandle][#VH_value64] - [Getter][#value64()] - [Setter][#value64(long)]
/// ### valueFloat
/// [VarHandle][#VH_valueFloat] - [Getter][#valueFloat()] - [Setter][#valueFloat(float)]
/// ### valueBool
/// [VarHandle][#VH_valueBool] - [Getter][#valueBool()] - [Setter][#valueBool(int)]
/// ### valueString
/// [VarHandle][#VH_valueString] - [Getter][#valueString()] - [Setter][#valueString(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef union VkPerformanceValueDataINTEL {
///     uint32_t value32;
///     uint64_t value64;
///     float valueFloat;
///     VkBool32 valueBool;
///     const char * valueString;
/// } VkPerformanceValueDataINTEL;
/// ```
public final class VkPerformanceValueDataINTEL extends Union {
    /// The union layout of `VkPerformanceValueDataINTEL`.
    public static final UnionLayout LAYOUT = MemoryLayout.unionLayout(
        ValueLayout.JAVA_INT.withName("value32"),
        ValueLayout.JAVA_LONG.withName("value64"),
        ValueLayout.JAVA_FLOAT.withName("valueFloat"),
        ValueLayout.JAVA_INT.withName("valueBool"),
        ValueLayout.ADDRESS.withName("valueString")
    );
    /// The [VarHandle] of `value32` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_value32 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("value32"));
    /// The [VarHandle] of `value64` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_value64 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("value64"));
    /// The [VarHandle] of `valueFloat` of type `(MemorySegment base, long baseOffset, long index)float`.
    public static final VarHandle VH_valueFloat = LAYOUT.arrayElementVarHandle(PathElement.groupElement("valueFloat"));
    /// The [VarHandle] of `valueBool` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_valueBool = LAYOUT.arrayElementVarHandle(PathElement.groupElement("valueBool"));
    /// The [VarHandle] of `valueString` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_valueString = LAYOUT.arrayElementVarHandle(PathElement.groupElement("valueString"));

    /// Creates `VkPerformanceValueDataINTEL` with the given segment.
    /// @param segment the memory segment
    public VkPerformanceValueDataINTEL(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPerformanceValueDataINTEL` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPerformanceValueDataINTEL of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPerformanceValueDataINTEL(segment); }

    /// Creates `VkPerformanceValueDataINTEL` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPerformanceValueDataINTEL ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPerformanceValueDataINTEL(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPerformanceValueDataINTEL` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPerformanceValueDataINTEL ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkPerformanceValueDataINTEL(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkPerformanceValueDataINTEL` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPerformanceValueDataINTEL`
    public static VkPerformanceValueDataINTEL alloc(SegmentAllocator allocator) { return new VkPerformanceValueDataINTEL(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPerformanceValueDataINTEL` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPerformanceValueDataINTEL`
    public static VkPerformanceValueDataINTEL alloc(SegmentAllocator allocator, long count) { return new VkPerformanceValueDataINTEL(allocator.allocate(LAYOUT, count)); }

    /// {@return `value32` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_value32(MemorySegment segment, long index) { return (int) VH_value32.get(segment, 0L, index); }
    /// {@return `value32`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_value32(MemorySegment segment) { return VkPerformanceValueDataINTEL.get_value32(segment, 0L); }
    /// {@return `value32` at the given index}
    /// @param index the index
    public @CType("uint32_t") int value32At(long index) { return VkPerformanceValueDataINTEL.get_value32(this.segment(), index); }
    /// {@return `value32`}
    public @CType("uint32_t") int value32() { return VkPerformanceValueDataINTEL.get_value32(this.segment()); }
    /// Sets `value32` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_value32(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_value32.set(segment, 0L, index, value); }
    /// Sets `value32` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_value32(MemorySegment segment, @CType("uint32_t") int value) { VkPerformanceValueDataINTEL.set_value32(segment, 0L, value); }
    /// Sets `value32` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPerformanceValueDataINTEL value32At(long index, @CType("uint32_t") int value) { VkPerformanceValueDataINTEL.set_value32(this.segment(), index, value); return this; }
    /// Sets `value32` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPerformanceValueDataINTEL value32(@CType("uint32_t") int value) { VkPerformanceValueDataINTEL.set_value32(this.segment(), value); return this; }

    /// {@return `value64` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint64_t") long get_value64(MemorySegment segment, long index) { return (long) VH_value64.get(segment, 0L, index); }
    /// {@return `value64`}
    /// @param segment the segment of the struct
    public static @CType("uint64_t") long get_value64(MemorySegment segment) { return VkPerformanceValueDataINTEL.get_value64(segment, 0L); }
    /// {@return `value64` at the given index}
    /// @param index the index
    public @CType("uint64_t") long value64At(long index) { return VkPerformanceValueDataINTEL.get_value64(this.segment(), index); }
    /// {@return `value64`}
    public @CType("uint64_t") long value64() { return VkPerformanceValueDataINTEL.get_value64(this.segment()); }
    /// Sets `value64` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_value64(MemorySegment segment, long index, @CType("uint64_t") long value) { VH_value64.set(segment, 0L, index, value); }
    /// Sets `value64` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_value64(MemorySegment segment, @CType("uint64_t") long value) { VkPerformanceValueDataINTEL.set_value64(segment, 0L, value); }
    /// Sets `value64` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPerformanceValueDataINTEL value64At(long index, @CType("uint64_t") long value) { VkPerformanceValueDataINTEL.set_value64(this.segment(), index, value); return this; }
    /// Sets `value64` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPerformanceValueDataINTEL value64(@CType("uint64_t") long value) { VkPerformanceValueDataINTEL.set_value64(this.segment(), value); return this; }

    /// {@return `valueFloat` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("float") float get_valueFloat(MemorySegment segment, long index) { return (float) VH_valueFloat.get(segment, 0L, index); }
    /// {@return `valueFloat`}
    /// @param segment the segment of the struct
    public static @CType("float") float get_valueFloat(MemorySegment segment) { return VkPerformanceValueDataINTEL.get_valueFloat(segment, 0L); }
    /// {@return `valueFloat` at the given index}
    /// @param index the index
    public @CType("float") float valueFloatAt(long index) { return VkPerformanceValueDataINTEL.get_valueFloat(this.segment(), index); }
    /// {@return `valueFloat`}
    public @CType("float") float valueFloat() { return VkPerformanceValueDataINTEL.get_valueFloat(this.segment()); }
    /// Sets `valueFloat` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_valueFloat(MemorySegment segment, long index, @CType("float") float value) { VH_valueFloat.set(segment, 0L, index, value); }
    /// Sets `valueFloat` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_valueFloat(MemorySegment segment, @CType("float") float value) { VkPerformanceValueDataINTEL.set_valueFloat(segment, 0L, value); }
    /// Sets `valueFloat` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPerformanceValueDataINTEL valueFloatAt(long index, @CType("float") float value) { VkPerformanceValueDataINTEL.set_valueFloat(this.segment(), index, value); return this; }
    /// Sets `valueFloat` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPerformanceValueDataINTEL valueFloat(@CType("float") float value) { VkPerformanceValueDataINTEL.set_valueFloat(this.segment(), value); return this; }

    /// {@return `valueBool` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_valueBool(MemorySegment segment, long index) { return (int) VH_valueBool.get(segment, 0L, index); }
    /// {@return `valueBool`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_valueBool(MemorySegment segment) { return VkPerformanceValueDataINTEL.get_valueBool(segment, 0L); }
    /// {@return `valueBool` at the given index}
    /// @param index the index
    public @CType("VkBool32") int valueBoolAt(long index) { return VkPerformanceValueDataINTEL.get_valueBool(this.segment(), index); }
    /// {@return `valueBool`}
    public @CType("VkBool32") int valueBool() { return VkPerformanceValueDataINTEL.get_valueBool(this.segment()); }
    /// Sets `valueBool` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_valueBool(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_valueBool.set(segment, 0L, index, value); }
    /// Sets `valueBool` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_valueBool(MemorySegment segment, @CType("VkBool32") int value) { VkPerformanceValueDataINTEL.set_valueBool(segment, 0L, value); }
    /// Sets `valueBool` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPerformanceValueDataINTEL valueBoolAt(long index, @CType("VkBool32") int value) { VkPerformanceValueDataINTEL.set_valueBool(this.segment(), index, value); return this; }
    /// Sets `valueBool` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPerformanceValueDataINTEL valueBool(@CType("VkBool32") int value) { VkPerformanceValueDataINTEL.set_valueBool(this.segment(), value); return this; }

    /// {@return `valueString` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const char *") java.lang.foreign.MemorySegment get_valueString(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_valueString.get(segment, 0L, index); }
    /// {@return `valueString`}
    /// @param segment the segment of the struct
    public static @CType("const char *") java.lang.foreign.MemorySegment get_valueString(MemorySegment segment) { return VkPerformanceValueDataINTEL.get_valueString(segment, 0L); }
    /// {@return `valueString` at the given index}
    /// @param index the index
    public @CType("const char *") java.lang.foreign.MemorySegment valueStringAt(long index) { return VkPerformanceValueDataINTEL.get_valueString(this.segment(), index); }
    /// {@return `valueString`}
    public @CType("const char *") java.lang.foreign.MemorySegment valueString() { return VkPerformanceValueDataINTEL.get_valueString(this.segment()); }
    /// Sets `valueString` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_valueString(MemorySegment segment, long index, @CType("const char *") java.lang.foreign.MemorySegment value) { VH_valueString.set(segment, 0L, index, value); }
    /// Sets `valueString` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_valueString(MemorySegment segment, @CType("const char *") java.lang.foreign.MemorySegment value) { VkPerformanceValueDataINTEL.set_valueString(segment, 0L, value); }
    /// Sets `valueString` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPerformanceValueDataINTEL valueStringAt(long index, @CType("const char *") java.lang.foreign.MemorySegment value) { VkPerformanceValueDataINTEL.set_valueString(this.segment(), index, value); return this; }
    /// Sets `valueString` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPerformanceValueDataINTEL valueString(@CType("const char *") java.lang.foreign.MemorySegment value) { VkPerformanceValueDataINTEL.set_valueString(this.segment(), value); return this; }

}
