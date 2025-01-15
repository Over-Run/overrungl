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
/// ### GmType
/// [VarHandle][#VH_GmType] - [Getter][#GmType()] - [Setter][#GmType(byte)]
/// ### gm_params
/// [VarHandle][#VH_gm_params] - [Getter][#gm_params()] - [Setter][#gm_params(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct StdVideoAV1GlobalMotion {
///     uint8_t [ ] GmType;
///     int32_t [ ][ ] gm_params;
/// } StdVideoAV1GlobalMotion;
/// ```
public sealed class StdVideoAV1GlobalMotion extends Struct {
    /// The struct layout of `StdVideoAV1GlobalMotion`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_BYTE.withName("GmType"),
        ValueLayout.JAVA_INT.withName("gm_params")
    );
    /// The [VarHandle] of `GmType` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_GmType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("GmType"));
    /// The [VarHandle] of `gm_params` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_gm_params = LAYOUT.arrayElementVarHandle(PathElement.groupElement("gm_params"));

    /// Creates `StdVideoAV1GlobalMotion` with the given segment.
    /// @param segment the memory segment
    public StdVideoAV1GlobalMotion(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `StdVideoAV1GlobalMotion` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoAV1GlobalMotion of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new StdVideoAV1GlobalMotion(segment); }

    /// Creates `StdVideoAV1GlobalMotion` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `StdVideoAV1GlobalMotion` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoAV1GlobalMotion ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new StdVideoAV1GlobalMotion(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `StdVideoAV1GlobalMotion` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `StdVideoAV1GlobalMotion` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoAV1GlobalMotion`
    public static StdVideoAV1GlobalMotion alloc(SegmentAllocator allocator) { return new StdVideoAV1GlobalMotion(allocator.allocate(LAYOUT)); }

    /// Allocates a `StdVideoAV1GlobalMotion` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `StdVideoAV1GlobalMotion`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `StdVideoAV1GlobalMotion` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoAV1GlobalMotion`
    public static StdVideoAV1GlobalMotion allocInit(SegmentAllocator allocator, @CType("uint8_t [ ]") byte GmType, @CType("int32_t [ ][ ]") int gm_params) { return alloc(allocator).GmType(GmType).gm_params(gm_params); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public StdVideoAV1GlobalMotion copyFrom(StdVideoAV1GlobalMotion src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `GmType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t [ ]") byte get_GmType(MemorySegment segment, long index) { return (byte) VH_GmType.get(segment, 0L, index); }
    /// {@return `GmType`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t [ ]") byte get_GmType(MemorySegment segment) { return StdVideoAV1GlobalMotion.get_GmType(segment, 0L); }
    /// {@return `GmType`}
    public @CType("uint8_t [ ]") byte GmType() { return StdVideoAV1GlobalMotion.get_GmType(this.segment()); }
    /// Sets `GmType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_GmType(MemorySegment segment, long index, @CType("uint8_t [ ]") byte value) { VH_GmType.set(segment, 0L, index, value); }
    /// Sets `GmType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_GmType(MemorySegment segment, @CType("uint8_t [ ]") byte value) { StdVideoAV1GlobalMotion.set_GmType(segment, 0L, value); }
    /// Sets `GmType` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoAV1GlobalMotion GmType(@CType("uint8_t [ ]") byte value) { StdVideoAV1GlobalMotion.set_GmType(this.segment(), value); return this; }

    /// {@return `gm_params` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("int32_t [ ][ ]") int get_gm_params(MemorySegment segment, long index) { return (int) VH_gm_params.get(segment, 0L, index); }
    /// {@return `gm_params`}
    /// @param segment the segment of the struct
    public static @CType("int32_t [ ][ ]") int get_gm_params(MemorySegment segment) { return StdVideoAV1GlobalMotion.get_gm_params(segment, 0L); }
    /// {@return `gm_params`}
    public @CType("int32_t [ ][ ]") int gm_params() { return StdVideoAV1GlobalMotion.get_gm_params(this.segment()); }
    /// Sets `gm_params` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_gm_params(MemorySegment segment, long index, @CType("int32_t [ ][ ]") int value) { VH_gm_params.set(segment, 0L, index, value); }
    /// Sets `gm_params` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_gm_params(MemorySegment segment, @CType("int32_t [ ][ ]") int value) { StdVideoAV1GlobalMotion.set_gm_params(segment, 0L, value); }
    /// Sets `gm_params` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoAV1GlobalMotion gm_params(@CType("int32_t [ ][ ]") int value) { StdVideoAV1GlobalMotion.set_gm_params(this.segment(), value); return this; }

    /// A buffer of [StdVideoAV1GlobalMotion].
    public static final class Buffer extends StdVideoAV1GlobalMotion {
        private final long elementCount;

        /// Creates `StdVideoAV1GlobalMotion.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `StdVideoAV1GlobalMotion`.
        /// @param index the index of the struct buffer
        /// @return the slice of `StdVideoAV1GlobalMotion`
        public StdVideoAV1GlobalMotion asSlice(long index) { return new StdVideoAV1GlobalMotion(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `StdVideoAV1GlobalMotion`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `StdVideoAV1GlobalMotion`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `GmType` at the given index}
        /// @param index the index
        public @CType("uint8_t [ ]") byte GmTypeAt(long index) { return StdVideoAV1GlobalMotion.get_GmType(this.segment(), index); }
        /// Sets `GmType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer GmTypeAt(long index, @CType("uint8_t [ ]") byte value) { StdVideoAV1GlobalMotion.set_GmType(this.segment(), index, value); return this; }

        /// {@return `gm_params` at the given index}
        /// @param index the index
        public @CType("int32_t [ ][ ]") int gm_paramsAt(long index) { return StdVideoAV1GlobalMotion.get_gm_params(this.segment(), index); }
        /// Sets `gm_params` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer gm_paramsAt(long index, @CType("int32_t [ ][ ]") int value) { StdVideoAV1GlobalMotion.set_gm_params(this.segment(), index, value); return this; }

    }
}
