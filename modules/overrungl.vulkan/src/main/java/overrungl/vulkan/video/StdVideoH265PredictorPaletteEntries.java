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
/// struct StdVideoH265PredictorPaletteEntries {
///     uint16_t PredictorPaletteEntries[3][128];
/// };
/// ```
public sealed class StdVideoH265PredictorPaletteEntries extends GroupType {
    /// The struct layout of `StdVideoH265PredictorPaletteEntries`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        MemoryLayout.sequenceLayout(128, MemoryLayout.sequenceLayout(3, ValueLayout.JAVA_SHORT)).withName("PredictorPaletteEntries")
    );
    /// The byte offset of `PredictorPaletteEntries`.
    public static final long OFFSET_PredictorPaletteEntries = LAYOUT.byteOffset(PathElement.groupElement("PredictorPaletteEntries"));
    /// The memory layout of `PredictorPaletteEntries`.
    public static final MemoryLayout LAYOUT_PredictorPaletteEntries = LAYOUT.select(PathElement.groupElement("PredictorPaletteEntries"));
    /// The [VarHandle] of `PredictorPaletteEntries` of type `(MemorySegment base, long baseOffset, long index, long index0, long index1)MemorySegment`.
    public static final VarHandle VH_PredictorPaletteEntries = LAYOUT.arrayElementVarHandle(PathElement.groupElement("PredictorPaletteEntries"), PathElement.sequenceElement(), PathElement.sequenceElement());

    /// Creates `StdVideoH265PredictorPaletteEntries` with the given segment.
    /// @param segment the memory segment
    public StdVideoH265PredictorPaletteEntries(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `StdVideoH265PredictorPaletteEntries` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `StdVideoH265PredictorPaletteEntries` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoH265PredictorPaletteEntries ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoH265PredictorPaletteEntries(segment.reinterpret(LAYOUT.byteSize())); }

    /// Creates `StdVideoH265PredictorPaletteEntries` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `StdVideoH265PredictorPaletteEntries` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoH265PredictorPaletteEntries`
    public static StdVideoH265PredictorPaletteEntries alloc(SegmentAllocator allocator) { return new StdVideoH265PredictorPaletteEntries(allocator.allocate(LAYOUT)); }

    /// Allocates a `StdVideoH265PredictorPaletteEntries` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `StdVideoH265PredictorPaletteEntries`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public StdVideoH265PredictorPaletteEntries copyFrom(StdVideoH265PredictorPaletteEntries src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { if (this instanceof Buffer buf) return buf; else return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `PredictorPaletteEntries` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment PredictorPaletteEntries(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_PredictorPaletteEntries, index), LAYOUT_PredictorPaletteEntries); }
    /// {@return `PredictorPaletteEntries` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param index1 the Index 1 of the array
    public static short PredictorPaletteEntries(MemorySegment segment, long index, long index0, long index1) { return (short) VH_PredictorPaletteEntries.get(segment, 0L, index, index0, index1); }
    /// {@return `PredictorPaletteEntries`}
    public MemorySegment PredictorPaletteEntries() { return PredictorPaletteEntries(this.segment(), 0L); }
    /// {@return `PredictorPaletteEntries`}
    /// @param index0 the Index 0 of the array
    /// @param index1 the Index 1 of the array
    public short PredictorPaletteEntries(long index0, long index1) { return PredictorPaletteEntries(this.segment(), 0L, index0, index1); }
    /// Sets `PredictorPaletteEntries` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void PredictorPaletteEntries(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_PredictorPaletteEntries, index), LAYOUT_PredictorPaletteEntries.byteSize()); }
    /// Sets `PredictorPaletteEntries` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param index1 the Index 1 of the array
    /// @param value the value
    public static void PredictorPaletteEntries(MemorySegment segment, long index, long index0, long index1, short value) { VH_PredictorPaletteEntries.set(segment, 0L, index, index0, index1, value); }
    /// Sets `PredictorPaletteEntries` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265PredictorPaletteEntries PredictorPaletteEntries(MemorySegment value) { PredictorPaletteEntries(this.segment(), 0L, value); return this; }
    /// Sets `PredictorPaletteEntries` with the given value.
    /// @param index0 the Index 0 of the array
    /// @param index1 the Index 1 of the array
    /// @param value the value
    /// @return `this`
    public StdVideoH265PredictorPaletteEntries PredictorPaletteEntries(long index0, long index1, short value) { PredictorPaletteEntries(this.segment(), 0L, index0, index1, value); return this; }

    /// A buffer of [StdVideoH265PredictorPaletteEntries].
    public static final class Buffer extends StdVideoH265PredictorPaletteEntries {
        private final long elementCount;

        /// Creates `StdVideoH265PredictorPaletteEntries.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `StdVideoH265PredictorPaletteEntries`.
        /// @param index the index of the struct buffer
        /// @return the slice of `StdVideoH265PredictorPaletteEntries`
        public StdVideoH265PredictorPaletteEntries asSlice(long index) { return new StdVideoH265PredictorPaletteEntries(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `StdVideoH265PredictorPaletteEntries`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `StdVideoH265PredictorPaletteEntries`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `PredictorPaletteEntries` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment PredictorPaletteEntriesAt(long index) { return PredictorPaletteEntries(this.segment(), index); }
        /// {@return `PredictorPaletteEntries` at the given index}
        /// @param index the index of the struct buffer
        /// @param index0 the Index 0 of the array
        /// @param index1 the Index 1 of the array
        public short PredictorPaletteEntriesAt(long index, long index0, long index1) { return PredictorPaletteEntries(this.segment(), index, index0, index1); }
        /// Sets `PredictorPaletteEntries` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer PredictorPaletteEntriesAt(long index, MemorySegment value) { PredictorPaletteEntries(this.segment(), index, value); return this; }
        /// Sets `PredictorPaletteEntries` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param index0 the Index 0 of the array
        /// @param index1 the Index 1 of the array
        /// @param value the value
        /// @return `this`
        public Buffer PredictorPaletteEntriesAt(long index, long index0, long index1, short value) { PredictorPaletteEntries(this.segment(), index, index0, index1, value); return this; }

    }
}
