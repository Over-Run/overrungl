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
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct StdVideoEncodeAV1ExtensionHeader {
///     uint8_t temporal_id;
///     uint8_t spatial_id;
/// };
/// ```
public sealed class StdVideoEncodeAV1ExtensionHeader extends GroupType {
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
    /// @param segment the memory segment
    public StdVideoEncodeAV1ExtensionHeader(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `StdVideoEncodeAV1ExtensionHeader` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `StdVideoEncodeAV1ExtensionHeader` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoEncodeAV1ExtensionHeader ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoEncodeAV1ExtensionHeader(segment.reinterpret(LAYOUT.byteSize())); }

    /// Creates `StdVideoEncodeAV1ExtensionHeader` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `StdVideoEncodeAV1ExtensionHeader` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoEncodeAV1ExtensionHeader`
    public static StdVideoEncodeAV1ExtensionHeader alloc(SegmentAllocator allocator) { return new StdVideoEncodeAV1ExtensionHeader(allocator.allocate(LAYOUT)); }

    /// Allocates a `StdVideoEncodeAV1ExtensionHeader` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `StdVideoEncodeAV1ExtensionHeader`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public StdVideoEncodeAV1ExtensionHeader copyFrom(StdVideoEncodeAV1ExtensionHeader src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { if (this instanceof Buffer buf) return buf; else return new Buffer(this.segment(), this.estimateCount()); }

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

    /// A buffer of [StdVideoEncodeAV1ExtensionHeader].
    public static final class Buffer extends StdVideoEncodeAV1ExtensionHeader {
        private final long elementCount;

        /// Creates `StdVideoEncodeAV1ExtensionHeader.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `StdVideoEncodeAV1ExtensionHeader`.
        /// @param index the index of the struct buffer
        /// @return the slice of `StdVideoEncodeAV1ExtensionHeader`
        public StdVideoEncodeAV1ExtensionHeader asSlice(long index) { return new StdVideoEncodeAV1ExtensionHeader(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `StdVideoEncodeAV1ExtensionHeader`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `StdVideoEncodeAV1ExtensionHeader`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `temporal_id` at the given index}
        /// @param index the index of the struct buffer
        public byte temporal_idAt(long index) { return temporal_id(this.segment(), index); }
        /// Sets `temporal_id` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer temporal_idAt(long index, byte value) { temporal_id(this.segment(), index, value); return this; }

        /// {@return `spatial_id` at the given index}
        /// @param index the index of the struct buffer
        public byte spatial_idAt(long index) { return spatial_id(this.segment(), index); }
        /// Sets `spatial_id` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer spatial_idAt(long index, byte value) { spatial_id(this.segment(), index, value); return this; }

    }
}
