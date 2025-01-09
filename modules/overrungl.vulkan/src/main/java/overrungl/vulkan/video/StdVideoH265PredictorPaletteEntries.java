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
package overrungl.vulkan.video;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.annotation.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Members
/// ### PredictorPaletteEntries
/// [VarHandle][#VH_PredictorPaletteEntries] - [Getter][#PredictorPaletteEntries()] - [Setter][#PredictorPaletteEntries(short)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct StdVideoH265PredictorPaletteEntries {
///     uint16_t [ ][ ] PredictorPaletteEntries;
/// } StdVideoH265PredictorPaletteEntries;
/// ```
public final class StdVideoH265PredictorPaletteEntries extends Struct {
    /// The struct layout of `StdVideoH265PredictorPaletteEntries`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_SHORT.withName("PredictorPaletteEntries")
    );
    /// The [VarHandle] of `PredictorPaletteEntries` of type `(MemorySegment base, long baseOffset, long index)short`.
    public static final VarHandle VH_PredictorPaletteEntries = LAYOUT.arrayElementVarHandle(PathElement.groupElement("PredictorPaletteEntries"));

    /// Creates `StdVideoH265PredictorPaletteEntries` with the given segment.
    /// @param segment the memory segment
    public StdVideoH265PredictorPaletteEntries(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `StdVideoH265PredictorPaletteEntries` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoH265PredictorPaletteEntries of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new StdVideoH265PredictorPaletteEntries(segment); }

    /// Creates `StdVideoH265PredictorPaletteEntries` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoH265PredictorPaletteEntries ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new StdVideoH265PredictorPaletteEntries(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `StdVideoH265PredictorPaletteEntries` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoH265PredictorPaletteEntries ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new StdVideoH265PredictorPaletteEntries(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `StdVideoH265PredictorPaletteEntries` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoH265PredictorPaletteEntries`
    public static StdVideoH265PredictorPaletteEntries alloc(SegmentAllocator allocator) { return new StdVideoH265PredictorPaletteEntries(allocator.allocate(LAYOUT)); }

    /// Allocates a `StdVideoH265PredictorPaletteEntries` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `StdVideoH265PredictorPaletteEntries`
    public static StdVideoH265PredictorPaletteEntries alloc(SegmentAllocator allocator, long count) { return new StdVideoH265PredictorPaletteEntries(allocator.allocate(LAYOUT, count)); }

    /// {@return `PredictorPaletteEntries` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint16_t [ ][ ]") short get_PredictorPaletteEntries(MemorySegment segment, long index) { return (short) VH_PredictorPaletteEntries.get(segment, 0L, index); }
    /// {@return `PredictorPaletteEntries`}
    /// @param segment the segment of the struct
    public static @CType("uint16_t [ ][ ]") short get_PredictorPaletteEntries(MemorySegment segment) { return StdVideoH265PredictorPaletteEntries.get_PredictorPaletteEntries(segment, 0L); }
    /// {@return `PredictorPaletteEntries` at the given index}
    /// @param index the index
    public @CType("uint16_t [ ][ ]") short PredictorPaletteEntriesAt(long index) { return StdVideoH265PredictorPaletteEntries.get_PredictorPaletteEntries(this.segment(), index); }
    /// {@return `PredictorPaletteEntries`}
    public @CType("uint16_t [ ][ ]") short PredictorPaletteEntries() { return StdVideoH265PredictorPaletteEntries.get_PredictorPaletteEntries(this.segment()); }
    /// Sets `PredictorPaletteEntries` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_PredictorPaletteEntries(MemorySegment segment, long index, @CType("uint16_t [ ][ ]") short value) { VH_PredictorPaletteEntries.set(segment, 0L, index, value); }
    /// Sets `PredictorPaletteEntries` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_PredictorPaletteEntries(MemorySegment segment, @CType("uint16_t [ ][ ]") short value) { StdVideoH265PredictorPaletteEntries.set_PredictorPaletteEntries(segment, 0L, value); }
    /// Sets `PredictorPaletteEntries` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoH265PredictorPaletteEntries PredictorPaletteEntriesAt(long index, @CType("uint16_t [ ][ ]") short value) { StdVideoH265PredictorPaletteEntries.set_PredictorPaletteEntries(this.segment(), index, value); return this; }
    /// Sets `PredictorPaletteEntries` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265PredictorPaletteEntries PredictorPaletteEntries(@CType("uint16_t [ ][ ]") short value) { StdVideoH265PredictorPaletteEntries.set_PredictorPaletteEntries(this.segment(), value); return this; }

}
