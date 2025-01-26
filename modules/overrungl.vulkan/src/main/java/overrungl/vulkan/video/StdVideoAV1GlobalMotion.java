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
/// struct StdVideoAV1GlobalMotion {
///     uint8_t GmType[8];
///     int32_t gm_params[8][6];
/// };
/// ```
public sealed class StdVideoAV1GlobalMotion extends GroupType {
    /// The struct layout of `StdVideoAV1GlobalMotion`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        MemoryLayout.sequenceLayout(8L, ValueLayout.JAVA_BYTE).withName("GmType"),
        MemoryLayout.sequenceLayout(6L, MemoryLayout.sequenceLayout(8L, ValueLayout.JAVA_INT)).withName("gm_params")
    );
    /// The byte offset of `GmType`.
    public static final long OFFSET_GmType = LAYOUT.byteOffset(PathElement.groupElement("GmType"));
    /// The memory layout of `GmType`.
    public static final MemoryLayout LAYOUT_GmType = LAYOUT.select(PathElement.groupElement("GmType"));
    /// The [VarHandle] of `GmType` of type `(MemorySegment base, long baseOffset, long index, long index0)MemorySegment`.
    public static final VarHandle VH_GmType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("GmType"), PathElement.sequenceElement());
    /// The byte offset of `gm_params`.
    public static final long OFFSET_gm_params = LAYOUT.byteOffset(PathElement.groupElement("gm_params"));
    /// The memory layout of `gm_params`.
    public static final MemoryLayout LAYOUT_gm_params = LAYOUT.select(PathElement.groupElement("gm_params"));
    /// The [VarHandle] of `gm_params` of type `(MemorySegment base, long baseOffset, long index, long index0, long index1)MemorySegment`.
    public static final VarHandle VH_gm_params = LAYOUT.arrayElementVarHandle(PathElement.groupElement("gm_params"), PathElement.sequenceElement(), PathElement.sequenceElement());

    /// Creates `StdVideoAV1GlobalMotion` with the given segment.
    /// @param segment the memory segment
    public StdVideoAV1GlobalMotion(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `StdVideoAV1GlobalMotion` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `StdVideoAV1GlobalMotion` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoAV1GlobalMotion ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoAV1GlobalMotion(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `StdVideoAV1GlobalMotion` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `StdVideoAV1GlobalMotion` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoAV1GlobalMotion`
    public static StdVideoAV1GlobalMotion alloc(SegmentAllocator allocator) { return new StdVideoAV1GlobalMotion(allocator.allocate(LAYOUT)); }

    /// Allocates a `StdVideoAV1GlobalMotion` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `StdVideoAV1GlobalMotion`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public StdVideoAV1GlobalMotion copyFrom(StdVideoAV1GlobalMotion src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { if (this instanceof Buffer buf) return buf; else return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `GmType` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment GmType(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_GmType, index), LAYOUT_GmType); }
    /// {@return `GmType` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    public static byte GmType(MemorySegment segment, long index, long index0) { return (byte) VH_GmType.get(segment, 0L, index, index0); }
    /// {@return `GmType`}
    public MemorySegment GmType() { return GmType(this.segment(), 0L); }
    /// {@return `GmType`}
    /// @param index0 the Index 0 of the array
    public byte GmType(long index0) { return GmType(this.segment(), 0L, index0); }
    /// Sets `GmType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void GmType(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_GmType, index), LAYOUT_GmType.byteSize()); }
    /// Sets `GmType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    public static void GmType(MemorySegment segment, long index, long index0, byte value) { VH_GmType.set(segment, 0L, index, index0, value); }
    /// Sets `GmType` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoAV1GlobalMotion GmType(MemorySegment value) { GmType(this.segment(), 0L, value); return this; }
    /// Sets `GmType` with the given value.
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public StdVideoAV1GlobalMotion GmType(long index0, byte value) { GmType(this.segment(), 0L, index0, value); return this; }

    /// {@return `gm_params` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment gm_params(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_gm_params, index), LAYOUT_gm_params); }
    /// {@return `gm_params` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param index1 the Index 1 of the array
    public static int gm_params(MemorySegment segment, long index, long index0, long index1) { return (int) VH_gm_params.get(segment, 0L, index, index0, index1); }
    /// {@return `gm_params`}
    public MemorySegment gm_params() { return gm_params(this.segment(), 0L); }
    /// {@return `gm_params`}
    /// @param index0 the Index 0 of the array
    /// @param index1 the Index 1 of the array
    public int gm_params(long index0, long index1) { return gm_params(this.segment(), 0L, index0, index1); }
    /// Sets `gm_params` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void gm_params(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_gm_params, index), LAYOUT_gm_params.byteSize()); }
    /// Sets `gm_params` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param index1 the Index 1 of the array
    /// @param value the value
    public static void gm_params(MemorySegment segment, long index, long index0, long index1, int value) { VH_gm_params.set(segment, 0L, index, index0, index1, value); }
    /// Sets `gm_params` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoAV1GlobalMotion gm_params(MemorySegment value) { gm_params(this.segment(), 0L, value); return this; }
    /// Sets `gm_params` with the given value.
    /// @param index0 the Index 0 of the array
    /// @param index1 the Index 1 of the array
    /// @param value the value
    /// @return `this`
    public StdVideoAV1GlobalMotion gm_params(long index0, long index1, int value) { gm_params(this.segment(), 0L, index0, index1, value); return this; }

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
        /// @param index the index of the struct buffer
        public MemorySegment GmTypeAt(long index) { return GmType(this.segment(), index); }
        /// {@return `GmType` at the given index}
        /// @param index the index of the struct buffer
        /// @param index0 the Index 0 of the array
        public byte GmTypeAt(long index, long index0) { return GmType(this.segment(), index, index0); }
        /// Sets `GmType` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer GmTypeAt(long index, MemorySegment value) { GmType(this.segment(), index, value); return this; }
        /// Sets `GmType` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param index0 the Index 0 of the array
        /// @param value the value
        /// @return `this`
        public Buffer GmTypeAt(long index, long index0, byte value) { GmType(this.segment(), index, index0, value); return this; }

        /// {@return `gm_params` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment gm_paramsAt(long index) { return gm_params(this.segment(), index); }
        /// {@return `gm_params` at the given index}
        /// @param index the index of the struct buffer
        /// @param index0 the Index 0 of the array
        /// @param index1 the Index 1 of the array
        public int gm_paramsAt(long index, long index0, long index1) { return gm_params(this.segment(), index, index0, index1); }
        /// Sets `gm_params` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer gm_paramsAt(long index, MemorySegment value) { gm_params(this.segment(), index, value); return this; }
        /// Sets `gm_params` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param index0 the Index 0 of the array
        /// @param index1 the Index 1 of the array
        /// @param value the value
        /// @return `this`
        public Buffer gm_paramsAt(long index, long index0, long index1, int value) { gm_params(this.segment(), index, index0, index1, value); return this; }

    }
}
