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
/// struct StdVideoAV1LoopRestoration {
///     StdVideoAV1FrameRestorationType FrameRestorationType[3];
///     uint16_t LoopRestorationSize[3];
/// };
/// ```
public sealed class StdVideoAV1LoopRestoration extends GroupType {
    /// The struct layout of `StdVideoAV1LoopRestoration`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        MemoryLayout.sequenceLayout(3L, ValueLayout.JAVA_INT).withName("FrameRestorationType"),
        MemoryLayout.sequenceLayout(3L, ValueLayout.JAVA_SHORT).withName("LoopRestorationSize")
    );
    /// The byte offset of `FrameRestorationType`.
    public static final long OFFSET_FrameRestorationType = LAYOUT.byteOffset(PathElement.groupElement("FrameRestorationType"));
    /// The memory layout of `FrameRestorationType`.
    public static final MemoryLayout LAYOUT_FrameRestorationType = LAYOUT.select(PathElement.groupElement("FrameRestorationType"));
    /// The [VarHandle] of `FrameRestorationType` of type `(MemorySegment base, long baseOffset, long index, long index0)MemorySegment`.
    public static final VarHandle VH_FrameRestorationType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("FrameRestorationType"), PathElement.sequenceElement());
    /// The byte offset of `LoopRestorationSize`.
    public static final long OFFSET_LoopRestorationSize = LAYOUT.byteOffset(PathElement.groupElement("LoopRestorationSize"));
    /// The memory layout of `LoopRestorationSize`.
    public static final MemoryLayout LAYOUT_LoopRestorationSize = LAYOUT.select(PathElement.groupElement("LoopRestorationSize"));
    /// The [VarHandle] of `LoopRestorationSize` of type `(MemorySegment base, long baseOffset, long index, long index0)MemorySegment`.
    public static final VarHandle VH_LoopRestorationSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("LoopRestorationSize"), PathElement.sequenceElement());

    /// Creates `StdVideoAV1LoopRestoration` with the given segment.
    /// @param segment the memory segment
    public StdVideoAV1LoopRestoration(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `StdVideoAV1LoopRestoration` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `StdVideoAV1LoopRestoration` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoAV1LoopRestoration ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoAV1LoopRestoration(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `StdVideoAV1LoopRestoration` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `StdVideoAV1LoopRestoration` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoAV1LoopRestoration`
    public static StdVideoAV1LoopRestoration alloc(SegmentAllocator allocator) { return new StdVideoAV1LoopRestoration(allocator.allocate(LAYOUT)); }

    /// Allocates a `StdVideoAV1LoopRestoration` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `StdVideoAV1LoopRestoration`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public StdVideoAV1LoopRestoration copyFrom(StdVideoAV1LoopRestoration src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { if (this instanceof Buffer buf) return buf; else return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `FrameRestorationType` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment FrameRestorationType(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_FrameRestorationType, index), LAYOUT_FrameRestorationType); }
    /// {@return `FrameRestorationType` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    public static int FrameRestorationType(MemorySegment segment, long index, long index0) { return (int) VH_FrameRestorationType.get(segment, 0L, index, index0); }
    /// {@return `FrameRestorationType`}
    public MemorySegment FrameRestorationType() { return FrameRestorationType(this.segment(), 0L); }
    /// {@return `FrameRestorationType`}
    /// @param index0 the Index 0 of the array
    public int FrameRestorationType(long index0) { return FrameRestorationType(this.segment(), 0L, index0); }
    /// Sets `FrameRestorationType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void FrameRestorationType(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_FrameRestorationType, index), LAYOUT_FrameRestorationType.byteSize()); }
    /// Sets `FrameRestorationType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    public static void FrameRestorationType(MemorySegment segment, long index, long index0, int value) { VH_FrameRestorationType.set(segment, 0L, index, index0, value); }
    /// Sets `FrameRestorationType` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoAV1LoopRestoration FrameRestorationType(MemorySegment value) { FrameRestorationType(this.segment(), 0L, value); return this; }
    /// Sets `FrameRestorationType` with the given value.
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public StdVideoAV1LoopRestoration FrameRestorationType(long index0, int value) { FrameRestorationType(this.segment(), 0L, index0, value); return this; }

    /// {@return `LoopRestorationSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment LoopRestorationSize(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_LoopRestorationSize, index), LAYOUT_LoopRestorationSize); }
    /// {@return `LoopRestorationSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    public static short LoopRestorationSize(MemorySegment segment, long index, long index0) { return (short) VH_LoopRestorationSize.get(segment, 0L, index, index0); }
    /// {@return `LoopRestorationSize`}
    public MemorySegment LoopRestorationSize() { return LoopRestorationSize(this.segment(), 0L); }
    /// {@return `LoopRestorationSize`}
    /// @param index0 the Index 0 of the array
    public short LoopRestorationSize(long index0) { return LoopRestorationSize(this.segment(), 0L, index0); }
    /// Sets `LoopRestorationSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void LoopRestorationSize(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_LoopRestorationSize, index), LAYOUT_LoopRestorationSize.byteSize()); }
    /// Sets `LoopRestorationSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    public static void LoopRestorationSize(MemorySegment segment, long index, long index0, short value) { VH_LoopRestorationSize.set(segment, 0L, index, index0, value); }
    /// Sets `LoopRestorationSize` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoAV1LoopRestoration LoopRestorationSize(MemorySegment value) { LoopRestorationSize(this.segment(), 0L, value); return this; }
    /// Sets `LoopRestorationSize` with the given value.
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public StdVideoAV1LoopRestoration LoopRestorationSize(long index0, short value) { LoopRestorationSize(this.segment(), 0L, index0, value); return this; }

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
        /// @param index the index of the struct buffer
        public MemorySegment FrameRestorationTypeAt(long index) { return FrameRestorationType(this.segment(), index); }
        /// {@return `FrameRestorationType` at the given index}
        /// @param index the index of the struct buffer
        /// @param index0 the Index 0 of the array
        public int FrameRestorationTypeAt(long index, long index0) { return FrameRestorationType(this.segment(), index, index0); }
        /// Sets `FrameRestorationType` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer FrameRestorationTypeAt(long index, MemorySegment value) { FrameRestorationType(this.segment(), index, value); return this; }
        /// Sets `FrameRestorationType` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param index0 the Index 0 of the array
        /// @param value the value
        /// @return `this`
        public Buffer FrameRestorationTypeAt(long index, long index0, int value) { FrameRestorationType(this.segment(), index, index0, value); return this; }

        /// {@return `LoopRestorationSize` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment LoopRestorationSizeAt(long index) { return LoopRestorationSize(this.segment(), index); }
        /// {@return `LoopRestorationSize` at the given index}
        /// @param index the index of the struct buffer
        /// @param index0 the Index 0 of the array
        public short LoopRestorationSizeAt(long index, long index0) { return LoopRestorationSize(this.segment(), index, index0); }
        /// Sets `LoopRestorationSize` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer LoopRestorationSizeAt(long index, MemorySegment value) { LoopRestorationSize(this.segment(), index, value); return this; }
        /// Sets `LoopRestorationSize` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param index0 the Index 0 of the array
        /// @param value the value
        /// @return `this`
        public Buffer LoopRestorationSizeAt(long index, long index0, short value) { LoopRestorationSize(this.segment(), index, index0, value); return this; }

    }
}
