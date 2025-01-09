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
/// ### FeatureEnabled
/// [VarHandle][#VH_FeatureEnabled] - [Getter][#FeatureEnabled()] - [Setter][#FeatureEnabled(byte)]
/// ### FeatureData
/// [VarHandle][#VH_FeatureData] - [Getter][#FeatureData()] - [Setter][#FeatureData(short)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct StdVideoAV1Segmentation {
///     uint8_t [ ] FeatureEnabled;
///     int16_t [ ][ ] FeatureData;
/// } StdVideoAV1Segmentation;
/// ```
public final class StdVideoAV1Segmentation extends Struct {
    /// The struct layout of `StdVideoAV1Segmentation`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_BYTE.withName("FeatureEnabled"),
        ValueLayout.JAVA_SHORT.withName("FeatureData")
    );
    /// The [VarHandle] of `FeatureEnabled` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_FeatureEnabled = LAYOUT.arrayElementVarHandle(PathElement.groupElement("FeatureEnabled"));
    /// The [VarHandle] of `FeatureData` of type `(MemorySegment base, long baseOffset, long index)short`.
    public static final VarHandle VH_FeatureData = LAYOUT.arrayElementVarHandle(PathElement.groupElement("FeatureData"));

    /// Creates `StdVideoAV1Segmentation` with the given segment.
    /// @param segment the memory segment
    public StdVideoAV1Segmentation(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `StdVideoAV1Segmentation` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoAV1Segmentation of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new StdVideoAV1Segmentation(segment); }

    /// Creates `StdVideoAV1Segmentation` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoAV1Segmentation ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new StdVideoAV1Segmentation(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `StdVideoAV1Segmentation` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoAV1Segmentation ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new StdVideoAV1Segmentation(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `StdVideoAV1Segmentation` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoAV1Segmentation`
    public static StdVideoAV1Segmentation alloc(SegmentAllocator allocator) { return new StdVideoAV1Segmentation(allocator.allocate(LAYOUT)); }

    /// Allocates a `StdVideoAV1Segmentation` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `StdVideoAV1Segmentation`
    public static StdVideoAV1Segmentation alloc(SegmentAllocator allocator, long count) { return new StdVideoAV1Segmentation(allocator.allocate(LAYOUT, count)); }

    /// {@return `FeatureEnabled` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t [ ]") byte get_FeatureEnabled(MemorySegment segment, long index) { return (byte) VH_FeatureEnabled.get(segment, 0L, index); }
    /// {@return `FeatureEnabled`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t [ ]") byte get_FeatureEnabled(MemorySegment segment) { return StdVideoAV1Segmentation.get_FeatureEnabled(segment, 0L); }
    /// {@return `FeatureEnabled` at the given index}
    /// @param index the index
    public @CType("uint8_t [ ]") byte FeatureEnabledAt(long index) { return StdVideoAV1Segmentation.get_FeatureEnabled(this.segment(), index); }
    /// {@return `FeatureEnabled`}
    public @CType("uint8_t [ ]") byte FeatureEnabled() { return StdVideoAV1Segmentation.get_FeatureEnabled(this.segment()); }
    /// Sets `FeatureEnabled` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_FeatureEnabled(MemorySegment segment, long index, @CType("uint8_t [ ]") byte value) { VH_FeatureEnabled.set(segment, 0L, index, value); }
    /// Sets `FeatureEnabled` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_FeatureEnabled(MemorySegment segment, @CType("uint8_t [ ]") byte value) { StdVideoAV1Segmentation.set_FeatureEnabled(segment, 0L, value); }
    /// Sets `FeatureEnabled` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoAV1Segmentation FeatureEnabledAt(long index, @CType("uint8_t [ ]") byte value) { StdVideoAV1Segmentation.set_FeatureEnabled(this.segment(), index, value); return this; }
    /// Sets `FeatureEnabled` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoAV1Segmentation FeatureEnabled(@CType("uint8_t [ ]") byte value) { StdVideoAV1Segmentation.set_FeatureEnabled(this.segment(), value); return this; }

    /// {@return `FeatureData` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("int16_t [ ][ ]") short get_FeatureData(MemorySegment segment, long index) { return (short) VH_FeatureData.get(segment, 0L, index); }
    /// {@return `FeatureData`}
    /// @param segment the segment of the struct
    public static @CType("int16_t [ ][ ]") short get_FeatureData(MemorySegment segment) { return StdVideoAV1Segmentation.get_FeatureData(segment, 0L); }
    /// {@return `FeatureData` at the given index}
    /// @param index the index
    public @CType("int16_t [ ][ ]") short FeatureDataAt(long index) { return StdVideoAV1Segmentation.get_FeatureData(this.segment(), index); }
    /// {@return `FeatureData`}
    public @CType("int16_t [ ][ ]") short FeatureData() { return StdVideoAV1Segmentation.get_FeatureData(this.segment()); }
    /// Sets `FeatureData` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_FeatureData(MemorySegment segment, long index, @CType("int16_t [ ][ ]") short value) { VH_FeatureData.set(segment, 0L, index, value); }
    /// Sets `FeatureData` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_FeatureData(MemorySegment segment, @CType("int16_t [ ][ ]") short value) { StdVideoAV1Segmentation.set_FeatureData(segment, 0L, value); }
    /// Sets `FeatureData` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoAV1Segmentation FeatureDataAt(long index, @CType("int16_t [ ][ ]") short value) { StdVideoAV1Segmentation.set_FeatureData(this.segment(), index, value); return this; }
    /// Sets `FeatureData` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoAV1Segmentation FeatureData(@CType("int16_t [ ][ ]") short value) { StdVideoAV1Segmentation.set_FeatureData(this.segment(), value); return this; }

}
