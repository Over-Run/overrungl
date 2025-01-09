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
/// ### temporal_id
/// [VarHandle][#VH_temporal_id] - [Getter][#temporal_id()] - [Setter][#temporal_id(byte)]
/// ### spatial_id
/// [VarHandle][#VH_spatial_id] - [Getter][#spatial_id()] - [Setter][#spatial_id(byte)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct StdVideoEncodeAV1ExtensionHeader {
///     uint8_t temporal_id;
///     uint8_t spatial_id;
/// } StdVideoEncodeAV1ExtensionHeader;
/// ```
public final class StdVideoEncodeAV1ExtensionHeader extends Struct {
    /// The struct layout of `StdVideoEncodeAV1ExtensionHeader`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_BYTE.withName("temporal_id"),
        ValueLayout.JAVA_BYTE.withName("spatial_id")
    );
    /// The [VarHandle] of `temporal_id` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_temporal_id = LAYOUT.arrayElementVarHandle(PathElement.groupElement("temporal_id"));
    /// The [VarHandle] of `spatial_id` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_spatial_id = LAYOUT.arrayElementVarHandle(PathElement.groupElement("spatial_id"));

    /// Creates `StdVideoEncodeAV1ExtensionHeader` with the given segment.
    /// @param segment the memory segment
    public StdVideoEncodeAV1ExtensionHeader(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `StdVideoEncodeAV1ExtensionHeader` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoEncodeAV1ExtensionHeader of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new StdVideoEncodeAV1ExtensionHeader(segment); }

    /// Creates `StdVideoEncodeAV1ExtensionHeader` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoEncodeAV1ExtensionHeader ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new StdVideoEncodeAV1ExtensionHeader(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `StdVideoEncodeAV1ExtensionHeader` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoEncodeAV1ExtensionHeader ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new StdVideoEncodeAV1ExtensionHeader(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `StdVideoEncodeAV1ExtensionHeader` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoEncodeAV1ExtensionHeader`
    public static StdVideoEncodeAV1ExtensionHeader alloc(SegmentAllocator allocator) { return new StdVideoEncodeAV1ExtensionHeader(allocator.allocate(LAYOUT)); }

    /// Allocates a `StdVideoEncodeAV1ExtensionHeader` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `StdVideoEncodeAV1ExtensionHeader`
    public static StdVideoEncodeAV1ExtensionHeader alloc(SegmentAllocator allocator, long count) { return new StdVideoEncodeAV1ExtensionHeader(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `StdVideoEncodeAV1ExtensionHeader`.
    /// @param index the index of the struct buffer
    /// @return the slice of `StdVideoEncodeAV1ExtensionHeader`
    public StdVideoEncodeAV1ExtensionHeader asSlice(long index) { return new StdVideoEncodeAV1ExtensionHeader(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `StdVideoEncodeAV1ExtensionHeader`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `StdVideoEncodeAV1ExtensionHeader`
    public StdVideoEncodeAV1ExtensionHeader asSlice(long index, long count) { return new StdVideoEncodeAV1ExtensionHeader(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

    /// {@return `temporal_id` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t") byte get_temporal_id(MemorySegment segment, long index) { return (byte) VH_temporal_id.get(segment, 0L, index); }
    /// {@return `temporal_id`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t") byte get_temporal_id(MemorySegment segment) { return StdVideoEncodeAV1ExtensionHeader.get_temporal_id(segment, 0L); }
    /// {@return `temporal_id` at the given index}
    /// @param index the index
    public @CType("uint8_t") byte temporal_idAt(long index) { return StdVideoEncodeAV1ExtensionHeader.get_temporal_id(this.segment(), index); }
    /// {@return `temporal_id`}
    public @CType("uint8_t") byte temporal_id() { return StdVideoEncodeAV1ExtensionHeader.get_temporal_id(this.segment()); }
    /// Sets `temporal_id` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_temporal_id(MemorySegment segment, long index, @CType("uint8_t") byte value) { VH_temporal_id.set(segment, 0L, index, value); }
    /// Sets `temporal_id` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_temporal_id(MemorySegment segment, @CType("uint8_t") byte value) { StdVideoEncodeAV1ExtensionHeader.set_temporal_id(segment, 0L, value); }
    /// Sets `temporal_id` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeAV1ExtensionHeader temporal_idAt(long index, @CType("uint8_t") byte value) { StdVideoEncodeAV1ExtensionHeader.set_temporal_id(this.segment(), index, value); return this; }
    /// Sets `temporal_id` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeAV1ExtensionHeader temporal_id(@CType("uint8_t") byte value) { StdVideoEncodeAV1ExtensionHeader.set_temporal_id(this.segment(), value); return this; }

    /// {@return `spatial_id` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t") byte get_spatial_id(MemorySegment segment, long index) { return (byte) VH_spatial_id.get(segment, 0L, index); }
    /// {@return `spatial_id`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t") byte get_spatial_id(MemorySegment segment) { return StdVideoEncodeAV1ExtensionHeader.get_spatial_id(segment, 0L); }
    /// {@return `spatial_id` at the given index}
    /// @param index the index
    public @CType("uint8_t") byte spatial_idAt(long index) { return StdVideoEncodeAV1ExtensionHeader.get_spatial_id(this.segment(), index); }
    /// {@return `spatial_id`}
    public @CType("uint8_t") byte spatial_id() { return StdVideoEncodeAV1ExtensionHeader.get_spatial_id(this.segment()); }
    /// Sets `spatial_id` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_spatial_id(MemorySegment segment, long index, @CType("uint8_t") byte value) { VH_spatial_id.set(segment, 0L, index, value); }
    /// Sets `spatial_id` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_spatial_id(MemorySegment segment, @CType("uint8_t") byte value) { StdVideoEncodeAV1ExtensionHeader.set_spatial_id(segment, 0L, value); }
    /// Sets `spatial_id` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeAV1ExtensionHeader spatial_idAt(long index, @CType("uint8_t") byte value) { StdVideoEncodeAV1ExtensionHeader.set_spatial_id(this.segment(), index, value); return this; }
    /// Sets `spatial_id` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeAV1ExtensionHeader spatial_id(@CType("uint8_t") byte value) { StdVideoEncodeAV1ExtensionHeader.set_spatial_id(this.segment(), value); return this; }

}
