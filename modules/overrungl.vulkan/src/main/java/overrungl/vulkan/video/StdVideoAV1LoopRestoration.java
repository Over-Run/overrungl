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
/// ### FrameRestorationType
/// [VarHandle][#VH_FrameRestorationType] - [Getter][#FrameRestorationType()] - [Setter][#FrameRestorationType(int)]
/// ### LoopRestorationSize
/// [VarHandle][#VH_LoopRestorationSize] - [Getter][#LoopRestorationSize()] - [Setter][#LoopRestorationSize(short)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct StdVideoAV1LoopRestoration {
///     StdVideoAV1FrameRestorationType [ ] FrameRestorationType;
///     uint16_t [ ] LoopRestorationSize;
/// } StdVideoAV1LoopRestoration;
/// ```
public sealed class StdVideoAV1LoopRestoration extends Struct {
    /// The struct layout of `StdVideoAV1LoopRestoration`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("FrameRestorationType"),
        ValueLayout.JAVA_SHORT.withName("LoopRestorationSize")
    );
    /// The [VarHandle] of `FrameRestorationType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_FrameRestorationType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("FrameRestorationType"));
    /// The [VarHandle] of `LoopRestorationSize` of type `(MemorySegment base, long baseOffset, long index)short`.
    public static final VarHandle VH_LoopRestorationSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("LoopRestorationSize"));

    /// Creates `StdVideoAV1LoopRestoration` with the given segment.
    /// @param segment the memory segment
    public StdVideoAV1LoopRestoration(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `StdVideoAV1LoopRestoration` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoAV1LoopRestoration of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new StdVideoAV1LoopRestoration(segment); }

    /// Creates `StdVideoAV1LoopRestoration` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `StdVideoAV1LoopRestoration` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoAV1LoopRestoration ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new StdVideoAV1LoopRestoration(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `StdVideoAV1LoopRestoration` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `StdVideoAV1LoopRestoration` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoAV1LoopRestoration`
    public static StdVideoAV1LoopRestoration alloc(SegmentAllocator allocator) { return new StdVideoAV1LoopRestoration(allocator.allocate(LAYOUT)); }

    /// Allocates a `StdVideoAV1LoopRestoration` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `StdVideoAV1LoopRestoration`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `StdVideoAV1LoopRestoration` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoAV1LoopRestoration`
    public static StdVideoAV1LoopRestoration allocInit(SegmentAllocator allocator, @CType("StdVideoAV1FrameRestorationType [ ]") int FrameRestorationType, @CType("uint16_t [ ]") short LoopRestorationSize) { return alloc(allocator).FrameRestorationType(FrameRestorationType).LoopRestorationSize(LoopRestorationSize); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public StdVideoAV1LoopRestoration copyFrom(StdVideoAV1LoopRestoration src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `FrameRestorationType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("StdVideoAV1FrameRestorationType [ ]") int get_FrameRestorationType(MemorySegment segment, long index) { return (int) VH_FrameRestorationType.get(segment, 0L, index); }
    /// {@return `FrameRestorationType`}
    /// @param segment the segment of the struct
    public static @CType("StdVideoAV1FrameRestorationType [ ]") int get_FrameRestorationType(MemorySegment segment) { return StdVideoAV1LoopRestoration.get_FrameRestorationType(segment, 0L); }
    /// {@return `FrameRestorationType`}
    public @CType("StdVideoAV1FrameRestorationType [ ]") int FrameRestorationType() { return StdVideoAV1LoopRestoration.get_FrameRestorationType(this.segment()); }
    /// Sets `FrameRestorationType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_FrameRestorationType(MemorySegment segment, long index, @CType("StdVideoAV1FrameRestorationType [ ]") int value) { VH_FrameRestorationType.set(segment, 0L, index, value); }
    /// Sets `FrameRestorationType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_FrameRestorationType(MemorySegment segment, @CType("StdVideoAV1FrameRestorationType [ ]") int value) { StdVideoAV1LoopRestoration.set_FrameRestorationType(segment, 0L, value); }
    /// Sets `FrameRestorationType` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoAV1LoopRestoration FrameRestorationType(@CType("StdVideoAV1FrameRestorationType [ ]") int value) { StdVideoAV1LoopRestoration.set_FrameRestorationType(this.segment(), value); return this; }

    /// {@return `LoopRestorationSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint16_t [ ]") short get_LoopRestorationSize(MemorySegment segment, long index) { return (short) VH_LoopRestorationSize.get(segment, 0L, index); }
    /// {@return `LoopRestorationSize`}
    /// @param segment the segment of the struct
    public static @CType("uint16_t [ ]") short get_LoopRestorationSize(MemorySegment segment) { return StdVideoAV1LoopRestoration.get_LoopRestorationSize(segment, 0L); }
    /// {@return `LoopRestorationSize`}
    public @CType("uint16_t [ ]") short LoopRestorationSize() { return StdVideoAV1LoopRestoration.get_LoopRestorationSize(this.segment()); }
    /// Sets `LoopRestorationSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_LoopRestorationSize(MemorySegment segment, long index, @CType("uint16_t [ ]") short value) { VH_LoopRestorationSize.set(segment, 0L, index, value); }
    /// Sets `LoopRestorationSize` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_LoopRestorationSize(MemorySegment segment, @CType("uint16_t [ ]") short value) { StdVideoAV1LoopRestoration.set_LoopRestorationSize(segment, 0L, value); }
    /// Sets `LoopRestorationSize` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoAV1LoopRestoration LoopRestorationSize(@CType("uint16_t [ ]") short value) { StdVideoAV1LoopRestoration.set_LoopRestorationSize(this.segment(), value); return this; }

    /// A buffer of [StdVideoAV1LoopRestoration].
    public static final class Buffer extends StdVideoAV1LoopRestoration {
        private final long elementCount;

        /// Creates `StdVideoAV1LoopRestoration.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `StdVideoAV1LoopRestoration`.
        /// @param index the index of the struct buffer
        /// @return the slice of `StdVideoAV1LoopRestoration`
        public StdVideoAV1LoopRestoration asSlice(long index) { return new StdVideoAV1LoopRestoration(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `StdVideoAV1LoopRestoration`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `StdVideoAV1LoopRestoration`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `FrameRestorationType` at the given index}
        /// @param index the index
        public @CType("StdVideoAV1FrameRestorationType [ ]") int FrameRestorationTypeAt(long index) { return StdVideoAV1LoopRestoration.get_FrameRestorationType(this.segment(), index); }
        /// Sets `FrameRestorationType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer FrameRestorationTypeAt(long index, @CType("StdVideoAV1FrameRestorationType [ ]") int value) { StdVideoAV1LoopRestoration.set_FrameRestorationType(this.segment(), index, value); return this; }

        /// {@return `LoopRestorationSize` at the given index}
        /// @param index the index
        public @CType("uint16_t [ ]") short LoopRestorationSizeAt(long index) { return StdVideoAV1LoopRestoration.get_LoopRestorationSize(this.segment(), index); }
        /// Sets `LoopRestorationSize` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer LoopRestorationSizeAt(long index, @CType("uint16_t [ ]") short value) { StdVideoAV1LoopRestoration.set_LoopRestorationSize(this.segment(), index, value); return this; }

    }
}
