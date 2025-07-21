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
package overrungl.vulkan.video;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct StdVideoEncodeAV1ExtensionHeader {
///     uint8_t temporal_id;
///     uint8_t spatial_id;
/// };
/// ```
public final class StdVideoEncodeAV1ExtensionHeader extends GroupType {
    /// The struct layout of `StdVideoEncodeAV1ExtensionHeader`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_BYTE.withName("temporal_id"),
        ValueLayout.JAVA_BYTE.withName("spatial_id")
    );
    /// The byte offset of `temporal_id`.
    public static final long OFFSET_temporal_id = LAYOUT.byteOffset(PathElement.groupElement("temporal_id"));
    /// The memory layout of `temporal_id`.
    public static final MemoryLayout LAYOUT_temporal_id = LAYOUT.select(PathElement.groupElement("temporal_id"));
    /// The [VarHandle] of `temporal_id` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_temporal_id = LAYOUT.arrayElementVarHandle(PathElement.groupElement("temporal_id"));
    /// The byte offset of `spatial_id`.
    public static final long OFFSET_spatial_id = LAYOUT.byteOffset(PathElement.groupElement("spatial_id"));
    /// The memory layout of `spatial_id`.
    public static final MemoryLayout LAYOUT_spatial_id = LAYOUT.select(PathElement.groupElement("spatial_id"));
    /// The [VarHandle] of `spatial_id` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_spatial_id = LAYOUT.arrayElementVarHandle(PathElement.groupElement("spatial_id"));

    /// Creates `StdVideoEncodeAV1ExtensionHeader` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public StdVideoEncodeAV1ExtensionHeader(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `StdVideoEncodeAV1ExtensionHeader` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoEncodeAV1ExtensionHeader of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoEncodeAV1ExtensionHeader(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `StdVideoEncodeAV1ExtensionHeader` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoEncodeAV1ExtensionHeader ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoEncodeAV1ExtensionHeader(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `StdVideoEncodeAV1ExtensionHeader` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoEncodeAV1ExtensionHeader ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoEncodeAV1ExtensionHeader(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `StdVideoEncodeAV1ExtensionHeader` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoEncodeAV1ExtensionHeader`
    public static StdVideoEncodeAV1ExtensionHeader alloc(SegmentAllocator allocator) { return new StdVideoEncodeAV1ExtensionHeader(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `StdVideoEncodeAV1ExtensionHeader` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `StdVideoEncodeAV1ExtensionHeader`
    public static StdVideoEncodeAV1ExtensionHeader alloc(SegmentAllocator allocator, long count) { return new StdVideoEncodeAV1ExtensionHeader(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `StdVideoEncodeAV1ExtensionHeader` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param temporal_id `temporal_id`
    /// @param spatial_id `spatial_id`
    /// @return the allocated `StdVideoEncodeAV1ExtensionHeader`
    public static StdVideoEncodeAV1ExtensionHeader allocInit(SegmentAllocator allocator, byte temporal_id, byte spatial_id) {
        return alloc(allocator).temporal_id(temporal_id).spatial_id(spatial_id);
    }

    /// Allocates a `StdVideoEncodeAV1ExtensionHeader` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param temporal_id `temporal_id`
    /// @return the allocated `StdVideoEncodeAV1ExtensionHeader`
    public static StdVideoEncodeAV1ExtensionHeader allocInit(SegmentAllocator allocator, byte temporal_id) {
        return alloc(allocator).temporal_id(temporal_id);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public StdVideoEncodeAV1ExtensionHeader copyFrom(StdVideoEncodeAV1ExtensionHeader src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public StdVideoEncodeAV1ExtensionHeader reinterpret(long count) { return new StdVideoEncodeAV1ExtensionHeader(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// {@return `temporal_id` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte temporal_id(MemorySegment segment, long index) { return (byte) VH_temporal_id.get(segment, 0L, index); }
    /// {@return `temporal_id`}
    public byte temporal_id() { return temporal_id(this.segment(), 0L); }
    /// Sets `temporal_id` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void temporal_id(MemorySegment segment, long index, byte value) { VH_temporal_id.set(segment, 0L, index, value); }
    /// Sets `temporal_id` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeAV1ExtensionHeader temporal_id(byte value) { temporal_id(this.segment(), 0L, value); return this; }

    /// {@return `spatial_id` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte spatial_id(MemorySegment segment, long index) { return (byte) VH_spatial_id.get(segment, 0L, index); }
    /// {@return `spatial_id`}
    public byte spatial_id() { return spatial_id(this.segment(), 0L); }
    /// Sets `spatial_id` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void spatial_id(MemorySegment segment, long index, byte value) { VH_spatial_id.set(segment, 0L, index, value); }
    /// Sets `spatial_id` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeAV1ExtensionHeader spatial_id(byte value) { spatial_id(this.segment(), 0L, value); return this; }

    /// Creates a slice of `StdVideoEncodeAV1ExtensionHeader`.
    /// @param index the index of the struct buffer
    /// @return the slice of `StdVideoEncodeAV1ExtensionHeader`
    public StdVideoEncodeAV1ExtensionHeader asSlice(long index) { return new StdVideoEncodeAV1ExtensionHeader(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `StdVideoEncodeAV1ExtensionHeader`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `StdVideoEncodeAV1ExtensionHeader`
    public StdVideoEncodeAV1ExtensionHeader asSlice(long index, long count) { return new StdVideoEncodeAV1ExtensionHeader(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `StdVideoEncodeAV1ExtensionHeader` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public StdVideoEncodeAV1ExtensionHeader at(long index, Consumer<StdVideoEncodeAV1ExtensionHeader> func) { func.accept(asSlice(index)); return this; }

    /// {@return `temporal_id` at the given index}
    /// @param index the index of the struct buffer
    public byte temporal_idAt(long index) { return temporal_id(this.segment(), index); }
    /// Sets `temporal_id` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeAV1ExtensionHeader temporal_idAt(long index, byte value) { temporal_id(this.segment(), index, value); return this; }

    /// {@return `spatial_id` at the given index}
    /// @param index the index of the struct buffer
    public byte spatial_idAt(long index) { return spatial_id(this.segment(), index); }
    /// Sets `spatial_id` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeAV1ExtensionHeader spatial_idAt(long index, byte value) { spatial_id(this.segment(), index, value); return this; }

}
