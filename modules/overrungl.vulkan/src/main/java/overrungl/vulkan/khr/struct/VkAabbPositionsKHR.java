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
/// ### minX
/// [VarHandle][#VH_minX] - [Getter][#minX()] - [Setter][#minX(float)]
/// ### minY
/// [VarHandle][#VH_minY] - [Getter][#minY()] - [Setter][#minY(float)]
/// ### minZ
/// [VarHandle][#VH_minZ] - [Getter][#minZ()] - [Setter][#minZ(float)]
/// ### maxX
/// [VarHandle][#VH_maxX] - [Getter][#maxX()] - [Setter][#maxX(float)]
/// ### maxY
/// [VarHandle][#VH_maxY] - [Getter][#maxY()] - [Setter][#maxY(float)]
/// ### maxZ
/// [VarHandle][#VH_maxZ] - [Getter][#maxZ()] - [Setter][#maxZ(float)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkAabbPositionsKHR {
///     float minX;
///     float minY;
///     float minZ;
///     float maxX;
///     float maxY;
///     float maxZ;
/// } VkAabbPositionsKHR;
/// ```
public final class VkAabbPositionsKHR extends Struct {
    /// The struct layout of `VkAabbPositionsKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_FLOAT.withName("minX"),
        ValueLayout.JAVA_FLOAT.withName("minY"),
        ValueLayout.JAVA_FLOAT.withName("minZ"),
        ValueLayout.JAVA_FLOAT.withName("maxX"),
        ValueLayout.JAVA_FLOAT.withName("maxY"),
        ValueLayout.JAVA_FLOAT.withName("maxZ")
    );
    /// The [VarHandle] of `minX` of type `(MemorySegment base, long baseOffset, long index)float`.
    public static final VarHandle VH_minX = LAYOUT.arrayElementVarHandle(PathElement.groupElement("minX"));
    /// The [VarHandle] of `minY` of type `(MemorySegment base, long baseOffset, long index)float`.
    public static final VarHandle VH_minY = LAYOUT.arrayElementVarHandle(PathElement.groupElement("minY"));
    /// The [VarHandle] of `minZ` of type `(MemorySegment base, long baseOffset, long index)float`.
    public static final VarHandle VH_minZ = LAYOUT.arrayElementVarHandle(PathElement.groupElement("minZ"));
    /// The [VarHandle] of `maxX` of type `(MemorySegment base, long baseOffset, long index)float`.
    public static final VarHandle VH_maxX = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxX"));
    /// The [VarHandle] of `maxY` of type `(MemorySegment base, long baseOffset, long index)float`.
    public static final VarHandle VH_maxY = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxY"));
    /// The [VarHandle] of `maxZ` of type `(MemorySegment base, long baseOffset, long index)float`.
    public static final VarHandle VH_maxZ = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxZ"));

    /// Creates `VkAabbPositionsKHR` with the given segment.
    /// @param segment the memory segment
    public VkAabbPositionsKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkAabbPositionsKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkAabbPositionsKHR of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkAabbPositionsKHR(segment); }

    /// Creates `VkAabbPositionsKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkAabbPositionsKHR ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkAabbPositionsKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkAabbPositionsKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkAabbPositionsKHR ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkAabbPositionsKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkAabbPositionsKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkAabbPositionsKHR`
    public static VkAabbPositionsKHR alloc(SegmentAllocator allocator) { return new VkAabbPositionsKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkAabbPositionsKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkAabbPositionsKHR`
    public static VkAabbPositionsKHR alloc(SegmentAllocator allocator, long count) { return new VkAabbPositionsKHR(allocator.allocate(LAYOUT, count)); }

    /// {@return `minX` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("float") float get_minX(MemorySegment segment, long index) { return (float) VH_minX.get(segment, 0L, index); }
    /// {@return `minX`}
    /// @param segment the segment of the struct
    public static @CType("float") float get_minX(MemorySegment segment) { return VkAabbPositionsKHR.get_minX(segment, 0L); }
    /// {@return `minX` at the given index}
    /// @param index the index
    public @CType("float") float minXAt(long index) { return VkAabbPositionsKHR.get_minX(this.segment(), index); }
    /// {@return `minX`}
    public @CType("float") float minX() { return VkAabbPositionsKHR.get_minX(this.segment()); }
    /// Sets `minX` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_minX(MemorySegment segment, long index, @CType("float") float value) { VH_minX.set(segment, 0L, index, value); }
    /// Sets `minX` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_minX(MemorySegment segment, @CType("float") float value) { VkAabbPositionsKHR.set_minX(segment, 0L, value); }
    /// Sets `minX` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkAabbPositionsKHR minXAt(long index, @CType("float") float value) { VkAabbPositionsKHR.set_minX(this.segment(), index, value); return this; }
    /// Sets `minX` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAabbPositionsKHR minX(@CType("float") float value) { VkAabbPositionsKHR.set_minX(this.segment(), value); return this; }

    /// {@return `minY` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("float") float get_minY(MemorySegment segment, long index) { return (float) VH_minY.get(segment, 0L, index); }
    /// {@return `minY`}
    /// @param segment the segment of the struct
    public static @CType("float") float get_minY(MemorySegment segment) { return VkAabbPositionsKHR.get_minY(segment, 0L); }
    /// {@return `minY` at the given index}
    /// @param index the index
    public @CType("float") float minYAt(long index) { return VkAabbPositionsKHR.get_minY(this.segment(), index); }
    /// {@return `minY`}
    public @CType("float") float minY() { return VkAabbPositionsKHR.get_minY(this.segment()); }
    /// Sets `minY` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_minY(MemorySegment segment, long index, @CType("float") float value) { VH_minY.set(segment, 0L, index, value); }
    /// Sets `minY` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_minY(MemorySegment segment, @CType("float") float value) { VkAabbPositionsKHR.set_minY(segment, 0L, value); }
    /// Sets `minY` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkAabbPositionsKHR minYAt(long index, @CType("float") float value) { VkAabbPositionsKHR.set_minY(this.segment(), index, value); return this; }
    /// Sets `minY` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAabbPositionsKHR minY(@CType("float") float value) { VkAabbPositionsKHR.set_minY(this.segment(), value); return this; }

    /// {@return `minZ` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("float") float get_minZ(MemorySegment segment, long index) { return (float) VH_minZ.get(segment, 0L, index); }
    /// {@return `minZ`}
    /// @param segment the segment of the struct
    public static @CType("float") float get_minZ(MemorySegment segment) { return VkAabbPositionsKHR.get_minZ(segment, 0L); }
    /// {@return `minZ` at the given index}
    /// @param index the index
    public @CType("float") float minZAt(long index) { return VkAabbPositionsKHR.get_minZ(this.segment(), index); }
    /// {@return `minZ`}
    public @CType("float") float minZ() { return VkAabbPositionsKHR.get_minZ(this.segment()); }
    /// Sets `minZ` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_minZ(MemorySegment segment, long index, @CType("float") float value) { VH_minZ.set(segment, 0L, index, value); }
    /// Sets `minZ` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_minZ(MemorySegment segment, @CType("float") float value) { VkAabbPositionsKHR.set_minZ(segment, 0L, value); }
    /// Sets `minZ` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkAabbPositionsKHR minZAt(long index, @CType("float") float value) { VkAabbPositionsKHR.set_minZ(this.segment(), index, value); return this; }
    /// Sets `minZ` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAabbPositionsKHR minZ(@CType("float") float value) { VkAabbPositionsKHR.set_minZ(this.segment(), value); return this; }

    /// {@return `maxX` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("float") float get_maxX(MemorySegment segment, long index) { return (float) VH_maxX.get(segment, 0L, index); }
    /// {@return `maxX`}
    /// @param segment the segment of the struct
    public static @CType("float") float get_maxX(MemorySegment segment) { return VkAabbPositionsKHR.get_maxX(segment, 0L); }
    /// {@return `maxX` at the given index}
    /// @param index the index
    public @CType("float") float maxXAt(long index) { return VkAabbPositionsKHR.get_maxX(this.segment(), index); }
    /// {@return `maxX`}
    public @CType("float") float maxX() { return VkAabbPositionsKHR.get_maxX(this.segment()); }
    /// Sets `maxX` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxX(MemorySegment segment, long index, @CType("float") float value) { VH_maxX.set(segment, 0L, index, value); }
    /// Sets `maxX` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxX(MemorySegment segment, @CType("float") float value) { VkAabbPositionsKHR.set_maxX(segment, 0L, value); }
    /// Sets `maxX` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkAabbPositionsKHR maxXAt(long index, @CType("float") float value) { VkAabbPositionsKHR.set_maxX(this.segment(), index, value); return this; }
    /// Sets `maxX` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAabbPositionsKHR maxX(@CType("float") float value) { VkAabbPositionsKHR.set_maxX(this.segment(), value); return this; }

    /// {@return `maxY` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("float") float get_maxY(MemorySegment segment, long index) { return (float) VH_maxY.get(segment, 0L, index); }
    /// {@return `maxY`}
    /// @param segment the segment of the struct
    public static @CType("float") float get_maxY(MemorySegment segment) { return VkAabbPositionsKHR.get_maxY(segment, 0L); }
    /// {@return `maxY` at the given index}
    /// @param index the index
    public @CType("float") float maxYAt(long index) { return VkAabbPositionsKHR.get_maxY(this.segment(), index); }
    /// {@return `maxY`}
    public @CType("float") float maxY() { return VkAabbPositionsKHR.get_maxY(this.segment()); }
    /// Sets `maxY` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxY(MemorySegment segment, long index, @CType("float") float value) { VH_maxY.set(segment, 0L, index, value); }
    /// Sets `maxY` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxY(MemorySegment segment, @CType("float") float value) { VkAabbPositionsKHR.set_maxY(segment, 0L, value); }
    /// Sets `maxY` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkAabbPositionsKHR maxYAt(long index, @CType("float") float value) { VkAabbPositionsKHR.set_maxY(this.segment(), index, value); return this; }
    /// Sets `maxY` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAabbPositionsKHR maxY(@CType("float") float value) { VkAabbPositionsKHR.set_maxY(this.segment(), value); return this; }

    /// {@return `maxZ` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("float") float get_maxZ(MemorySegment segment, long index) { return (float) VH_maxZ.get(segment, 0L, index); }
    /// {@return `maxZ`}
    /// @param segment the segment of the struct
    public static @CType("float") float get_maxZ(MemorySegment segment) { return VkAabbPositionsKHR.get_maxZ(segment, 0L); }
    /// {@return `maxZ` at the given index}
    /// @param index the index
    public @CType("float") float maxZAt(long index) { return VkAabbPositionsKHR.get_maxZ(this.segment(), index); }
    /// {@return `maxZ`}
    public @CType("float") float maxZ() { return VkAabbPositionsKHR.get_maxZ(this.segment()); }
    /// Sets `maxZ` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxZ(MemorySegment segment, long index, @CType("float") float value) { VH_maxZ.set(segment, 0L, index, value); }
    /// Sets `maxZ` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxZ(MemorySegment segment, @CType("float") float value) { VkAabbPositionsKHR.set_maxZ(segment, 0L, value); }
    /// Sets `maxZ` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkAabbPositionsKHR maxZAt(long index, @CType("float") float value) { VkAabbPositionsKHR.set_maxZ(this.segment(), index, value); return this; }
    /// Sets `maxZ` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAabbPositionsKHR maxZ(@CType("float") float value) { VkAabbPositionsKHR.set_maxZ(this.segment(), value); return this; }

}
