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
/// ### uniform_tile_spacing_flag
/// [VarHandle][#VH_uniform_tile_spacing_flag] - [Getter][#uniform_tile_spacing_flag()] - [Setter][#uniform_tile_spacing_flag(int)]
/// ### reserved
/// [VarHandle][#VH_reserved] - [Getter][#reserved()] - [Setter][#reserved(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct StdVideoAV1TileInfoFlags {
///     uint32_t : 1 uniform_tile_spacing_flag;
///     uint32_t : 31 reserved;
/// } StdVideoAV1TileInfoFlags;
/// ```
public sealed class StdVideoAV1TileInfoFlags extends Struct {
    /// The struct layout of `StdVideoAV1TileInfoFlags`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("uniform_tile_spacing_flag"),
        ValueLayout.JAVA_INT.withName("reserved")
    );
    /// The [VarHandle] of `uniform_tile_spacing_flag` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_uniform_tile_spacing_flag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("uniform_tile_spacing_flag"));
    /// The [VarHandle] of `reserved` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_reserved = LAYOUT.arrayElementVarHandle(PathElement.groupElement("reserved"));

    /// Creates `StdVideoAV1TileInfoFlags` with the given segment.
    /// @param segment the memory segment
    public StdVideoAV1TileInfoFlags(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `StdVideoAV1TileInfoFlags` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoAV1TileInfoFlags of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new StdVideoAV1TileInfoFlags(segment); }

    /// Creates `StdVideoAV1TileInfoFlags` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `StdVideoAV1TileInfoFlags` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoAV1TileInfoFlags ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new StdVideoAV1TileInfoFlags(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `StdVideoAV1TileInfoFlags` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `StdVideoAV1TileInfoFlags` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoAV1TileInfoFlags`
    public static StdVideoAV1TileInfoFlags alloc(SegmentAllocator allocator) { return new StdVideoAV1TileInfoFlags(allocator.allocate(LAYOUT)); }

    /// Allocates a `StdVideoAV1TileInfoFlags` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `StdVideoAV1TileInfoFlags`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `StdVideoAV1TileInfoFlags` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoAV1TileInfoFlags`
    public static StdVideoAV1TileInfoFlags allocInit(SegmentAllocator allocator, @CType("uint32_t : 1") int uniform_tile_spacing_flag, @CType("uint32_t : 31") int reserved) { return alloc(allocator).uniform_tile_spacing_flag(uniform_tile_spacing_flag).reserved(reserved); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public StdVideoAV1TileInfoFlags copyFrom(StdVideoAV1TileInfoFlags src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `uniform_tile_spacing_flag` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_uniform_tile_spacing_flag(MemorySegment segment, long index) { return (int) VH_uniform_tile_spacing_flag.get(segment, 0L, index); }
    /// {@return `uniform_tile_spacing_flag`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_uniform_tile_spacing_flag(MemorySegment segment) { return StdVideoAV1TileInfoFlags.get_uniform_tile_spacing_flag(segment, 0L); }
    /// {@return `uniform_tile_spacing_flag`}
    public @CType("uint32_t : 1") int uniform_tile_spacing_flag() { return StdVideoAV1TileInfoFlags.get_uniform_tile_spacing_flag(this.segment()); }
    /// Sets `uniform_tile_spacing_flag` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_uniform_tile_spacing_flag(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_uniform_tile_spacing_flag.set(segment, 0L, index, value); }
    /// Sets `uniform_tile_spacing_flag` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_uniform_tile_spacing_flag(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoAV1TileInfoFlags.set_uniform_tile_spacing_flag(segment, 0L, value); }
    /// Sets `uniform_tile_spacing_flag` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoAV1TileInfoFlags uniform_tile_spacing_flag(@CType("uint32_t : 1") int value) { StdVideoAV1TileInfoFlags.set_uniform_tile_spacing_flag(this.segment(), value); return this; }

    /// {@return `reserved` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 31") int get_reserved(MemorySegment segment, long index) { return (int) VH_reserved.get(segment, 0L, index); }
    /// {@return `reserved`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 31") int get_reserved(MemorySegment segment) { return StdVideoAV1TileInfoFlags.get_reserved(segment, 0L); }
    /// {@return `reserved`}
    public @CType("uint32_t : 31") int reserved() { return StdVideoAV1TileInfoFlags.get_reserved(this.segment()); }
    /// Sets `reserved` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_reserved(MemorySegment segment, long index, @CType("uint32_t : 31") int value) { VH_reserved.set(segment, 0L, index, value); }
    /// Sets `reserved` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_reserved(MemorySegment segment, @CType("uint32_t : 31") int value) { StdVideoAV1TileInfoFlags.set_reserved(segment, 0L, value); }
    /// Sets `reserved` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoAV1TileInfoFlags reserved(@CType("uint32_t : 31") int value) { StdVideoAV1TileInfoFlags.set_reserved(this.segment(), value); return this; }

    /// A buffer of [StdVideoAV1TileInfoFlags].
    public static final class Buffer extends StdVideoAV1TileInfoFlags {
        private final long elementCount;

        /// Creates `StdVideoAV1TileInfoFlags.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `StdVideoAV1TileInfoFlags`.
        /// @param index the index of the struct buffer
        /// @return the slice of `StdVideoAV1TileInfoFlags`
        public StdVideoAV1TileInfoFlags asSlice(long index) { return new StdVideoAV1TileInfoFlags(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `StdVideoAV1TileInfoFlags`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `StdVideoAV1TileInfoFlags`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `uniform_tile_spacing_flag` at the given index}
        /// @param index the index
        public @CType("uint32_t : 1") int uniform_tile_spacing_flagAt(long index) { return StdVideoAV1TileInfoFlags.get_uniform_tile_spacing_flag(this.segment(), index); }
        /// Sets `uniform_tile_spacing_flag` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer uniform_tile_spacing_flagAt(long index, @CType("uint32_t : 1") int value) { StdVideoAV1TileInfoFlags.set_uniform_tile_spacing_flag(this.segment(), index, value); return this; }

        /// {@return `reserved` at the given index}
        /// @param index the index
        public @CType("uint32_t : 31") int reservedAt(long index) { return StdVideoAV1TileInfoFlags.get_reserved(this.segment(), index); }
        /// Sets `reserved` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer reservedAt(long index, @CType("uint32_t : 31") int value) { StdVideoAV1TileInfoFlags.set_reserved(this.segment(), index, value); return this; }

    }
}
