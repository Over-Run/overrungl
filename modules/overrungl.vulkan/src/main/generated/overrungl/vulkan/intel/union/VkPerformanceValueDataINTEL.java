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
package overrungl.vulkan.intel.union;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPerformanceValueDataINTEL`.
/// ## Layout
/// ```
/// union VkPerformanceValueDataINTEL {
///     uint32_t value32;
///     uint64_t value64;
///     float valueFloat;
///     (uint32_t) VkBool32 valueBool;
///     const char* valueString;
/// };
/// ```
public final class VkPerformanceValueDataINTEL extends GroupType {
    /// The union layout of `VkPerformanceValueDataINTEL`.
    public static final UnionLayout LAYOUT = MemoryLayout.unionLayout(
        ValueLayout.JAVA_INT.withName("value32"),
        ValueLayout.JAVA_LONG.withName("value64"),
        ValueLayout.JAVA_FLOAT.withName("valueFloat"),
        ValueLayout.JAVA_INT.withName("valueBool"),
        ValueLayout.ADDRESS.withName("valueString")
    );
    /// The byte offset of `value32`.
    public static final long OFFSET_value32 = LAYOUT.byteOffset(PathElement.groupElement("value32"));
    /// The memory layout of `value32`.
    public static final MemoryLayout LAYOUT_value32 = LAYOUT.select(PathElement.groupElement("value32"));
    /// The [VarHandle] of `value32` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_value32 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("value32"));
    /// The byte offset of `value64`.
    public static final long OFFSET_value64 = LAYOUT.byteOffset(PathElement.groupElement("value64"));
    /// The memory layout of `value64`.
    public static final MemoryLayout LAYOUT_value64 = LAYOUT.select(PathElement.groupElement("value64"));
    /// The [VarHandle] of `value64` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_value64 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("value64"));
    /// The byte offset of `valueFloat`.
    public static final long OFFSET_valueFloat = LAYOUT.byteOffset(PathElement.groupElement("valueFloat"));
    /// The memory layout of `valueFloat`.
    public static final MemoryLayout LAYOUT_valueFloat = LAYOUT.select(PathElement.groupElement("valueFloat"));
    /// The [VarHandle] of `valueFloat` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_valueFloat = LAYOUT.arrayElementVarHandle(PathElement.groupElement("valueFloat"));
    /// The byte offset of `valueBool`.
    public static final long OFFSET_valueBool = LAYOUT.byteOffset(PathElement.groupElement("valueBool"));
    /// The memory layout of `valueBool`.
    public static final MemoryLayout LAYOUT_valueBool = LAYOUT.select(PathElement.groupElement("valueBool"));
    /// The [VarHandle] of `valueBool` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_valueBool = LAYOUT.arrayElementVarHandle(PathElement.groupElement("valueBool"));
    /// The byte offset of `valueString`.
    public static final long OFFSET_valueString = LAYOUT.byteOffset(PathElement.groupElement("valueString"));
    /// The memory layout of `valueString`.
    public static final MemoryLayout LAYOUT_valueString = LAYOUT.select(PathElement.groupElement("valueString"));
    /// The [VarHandle] of `valueString` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_valueString = LAYOUT.arrayElementVarHandle(PathElement.groupElement("valueString"));

    /// Creates `VkPerformanceValueDataINTEL` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this union buffer
    public VkPerformanceValueDataINTEL(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPerformanceValueDataINTEL` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPerformanceValueDataINTEL of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPerformanceValueDataINTEL(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPerformanceValueDataINTEL` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPerformanceValueDataINTEL ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPerformanceValueDataINTEL(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPerformanceValueDataINTEL` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPerformanceValueDataINTEL ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPerformanceValueDataINTEL(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPerformanceValueDataINTEL` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPerformanceValueDataINTEL`
    public static VkPerformanceValueDataINTEL alloc(SegmentAllocator allocator) { return new VkPerformanceValueDataINTEL(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPerformanceValueDataINTEL` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPerformanceValueDataINTEL`
    public static VkPerformanceValueDataINTEL alloc(SegmentAllocator allocator, long count) { return new VkPerformanceValueDataINTEL(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPerformanceValueDataINTEL copyFrom(VkPerformanceValueDataINTEL src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPerformanceValueDataINTEL reinterpret(long count) { return new VkPerformanceValueDataINTEL(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// {@return `value32` at the given index}
    /// @param segment the segment of the union
    /// @param index the index of the union buffer
    public static int value32(MemorySegment segment, long index) { return (int) VH_value32.get(segment, 0L, index); }
    /// {@return `value32`}
    public int value32() { return value32(this.segment(), 0L); }
    /// Sets `value32` with the given value at the given index.
    /// @param segment the segment of the union
    /// @param index the index of the union buffer
    /// @param value the value
    public static void value32(MemorySegment segment, long index, int value) { VH_value32.set(segment, 0L, index, value); }
    /// Sets `value32` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPerformanceValueDataINTEL value32(int value) { value32(this.segment(), 0L, value); return this; }

    /// {@return `value64` at the given index}
    /// @param segment the segment of the union
    /// @param index the index of the union buffer
    public static long value64(MemorySegment segment, long index) { return (long) VH_value64.get(segment, 0L, index); }
    /// {@return `value64`}
    public long value64() { return value64(this.segment(), 0L); }
    /// Sets `value64` with the given value at the given index.
    /// @param segment the segment of the union
    /// @param index the index of the union buffer
    /// @param value the value
    public static void value64(MemorySegment segment, long index, long value) { VH_value64.set(segment, 0L, index, value); }
    /// Sets `value64` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPerformanceValueDataINTEL value64(long value) { value64(this.segment(), 0L, value); return this; }

    /// {@return `valueFloat` at the given index}
    /// @param segment the segment of the union
    /// @param index the index of the union buffer
    public static float valueFloat(MemorySegment segment, long index) { return (float) VH_valueFloat.get(segment, 0L, index); }
    /// {@return `valueFloat`}
    public float valueFloat() { return valueFloat(this.segment(), 0L); }
    /// Sets `valueFloat` with the given value at the given index.
    /// @param segment the segment of the union
    /// @param index the index of the union buffer
    /// @param value the value
    public static void valueFloat(MemorySegment segment, long index, float value) { VH_valueFloat.set(segment, 0L, index, value); }
    /// Sets `valueFloat` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPerformanceValueDataINTEL valueFloat(float value) { valueFloat(this.segment(), 0L, value); return this; }

    /// {@return `valueBool` at the given index}
    /// @param segment the segment of the union
    /// @param index the index of the union buffer
    public static int valueBool(MemorySegment segment, long index) { return (int) VH_valueBool.get(segment, 0L, index); }
    /// {@return `valueBool`}
    public int valueBool() { return valueBool(this.segment(), 0L); }
    /// Sets `valueBool` with the given value at the given index.
    /// @param segment the segment of the union
    /// @param index the index of the union buffer
    /// @param value the value
    public static void valueBool(MemorySegment segment, long index, int value) { VH_valueBool.set(segment, 0L, index, value); }
    /// Sets `valueBool` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPerformanceValueDataINTEL valueBool(int value) { valueBool(this.segment(), 0L, value); return this; }

    /// {@return `valueString` at the given index}
    /// @param segment the segment of the union
    /// @param index the index of the union buffer
    public static MemorySegment valueString(MemorySegment segment, long index) { return (MemorySegment) VH_valueString.get(segment, 0L, index); }
    /// {@return `valueString`}
    public MemorySegment valueString() { return valueString(this.segment(), 0L); }
    /// Sets `valueString` with the given value at the given index.
    /// @param segment the segment of the union
    /// @param index the index of the union buffer
    /// @param value the value
    public static void valueString(MemorySegment segment, long index, MemorySegment value) { VH_valueString.set(segment, 0L, index, value); }
    /// Sets `valueString` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPerformanceValueDataINTEL valueString(MemorySegment value) { valueString(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkPerformanceValueDataINTEL`.
    /// @param index the index of the union buffer
    /// @return the slice of `VkPerformanceValueDataINTEL`
    public VkPerformanceValueDataINTEL asSlice(long index) { return new VkPerformanceValueDataINTEL(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPerformanceValueDataINTEL`.
    /// @param index the index of the union buffer
    /// @param count the count
    /// @return the slice of `VkPerformanceValueDataINTEL`
    public VkPerformanceValueDataINTEL asSlice(long index, long count) { return new VkPerformanceValueDataINTEL(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPerformanceValueDataINTEL` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPerformanceValueDataINTEL at(long index, Consumer<VkPerformanceValueDataINTEL> func) { func.accept(asSlice(index)); return this; }

    /// {@return `value32` at the given index}
    /// @param index the index of the union buffer
    public int value32At(long index) { return value32(this.segment(), index); }
    /// Sets `value32` with the given value at the given index.
    /// @param index the index of the union buffer
    /// @param value the value
    /// @return `this`
    public VkPerformanceValueDataINTEL value32At(long index, int value) { value32(this.segment(), index, value); return this; }

    /// {@return `value64` at the given index}
    /// @param index the index of the union buffer
    public long value64At(long index) { return value64(this.segment(), index); }
    /// Sets `value64` with the given value at the given index.
    /// @param index the index of the union buffer
    /// @param value the value
    /// @return `this`
    public VkPerformanceValueDataINTEL value64At(long index, long value) { value64(this.segment(), index, value); return this; }

    /// {@return `valueFloat` at the given index}
    /// @param index the index of the union buffer
    public float valueFloatAt(long index) { return valueFloat(this.segment(), index); }
    /// Sets `valueFloat` with the given value at the given index.
    /// @param index the index of the union buffer
    /// @param value the value
    /// @return `this`
    public VkPerformanceValueDataINTEL valueFloatAt(long index, float value) { valueFloat(this.segment(), index, value); return this; }

    /// {@return `valueBool` at the given index}
    /// @param index the index of the union buffer
    public int valueBoolAt(long index) { return valueBool(this.segment(), index); }
    /// Sets `valueBool` with the given value at the given index.
    /// @param index the index of the union buffer
    /// @param value the value
    /// @return `this`
    public VkPerformanceValueDataINTEL valueBoolAt(long index, int value) { valueBool(this.segment(), index, value); return this; }

    /// {@return `valueString` at the given index}
    /// @param index the index of the union buffer
    public MemorySegment valueStringAt(long index) { return valueString(this.segment(), index); }
    /// Sets `valueString` with the given value at the given index.
    /// @param index the index of the union buffer
    /// @param value the value
    /// @return `this`
    public VkPerformanceValueDataINTEL valueStringAt(long index, MemorySegment value) { valueString(this.segment(), index, value); return this; }

}
