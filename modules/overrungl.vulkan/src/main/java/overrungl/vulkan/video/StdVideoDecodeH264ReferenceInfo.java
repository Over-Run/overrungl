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
/// struct StdVideoDecodeH264ReferenceInfo {
///     (struct StdVideoDecodeH264ReferenceInfoFlags) StdVideoDecodeH264ReferenceInfoFlags flags;
///     uint16_t FrameNum;
///     uint16_t reserved;
///     int32_t PicOrderCnt[2];
/// };
/// ```
public sealed class StdVideoDecodeH264ReferenceInfo extends GroupType {
    /// The struct layout of `StdVideoDecodeH264ReferenceInfo`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        overrungl.vulkan.video.StdVideoDecodeH264ReferenceInfoFlags.LAYOUT.withName("flags"),
        ValueLayout.JAVA_SHORT.withName("FrameNum"),
        ValueLayout.JAVA_SHORT.withName("reserved"),
        MemoryLayout.sequenceLayout(2L, ValueLayout.JAVA_INT).withName("PicOrderCnt")
    );
    /// The byte offset of `flags`.
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    /// The memory layout of `flags`.
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    /// The byte offset of `FrameNum`.
    public static final long OFFSET_FrameNum = LAYOUT.byteOffset(PathElement.groupElement("FrameNum"));
    /// The memory layout of `FrameNum`.
    public static final MemoryLayout LAYOUT_FrameNum = LAYOUT.select(PathElement.groupElement("FrameNum"));
    /// The [VarHandle] of `FrameNum` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_FrameNum = LAYOUT.arrayElementVarHandle(PathElement.groupElement("FrameNum"));
    /// The byte offset of `reserved`.
    public static final long OFFSET_reserved = LAYOUT.byteOffset(PathElement.groupElement("reserved"));
    /// The memory layout of `reserved`.
    public static final MemoryLayout LAYOUT_reserved = LAYOUT.select(PathElement.groupElement("reserved"));
    /// The [VarHandle] of `reserved` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_reserved = LAYOUT.arrayElementVarHandle(PathElement.groupElement("reserved"));
    /// The byte offset of `PicOrderCnt`.
    public static final long OFFSET_PicOrderCnt = LAYOUT.byteOffset(PathElement.groupElement("PicOrderCnt"));
    /// The memory layout of `PicOrderCnt`.
    public static final MemoryLayout LAYOUT_PicOrderCnt = LAYOUT.select(PathElement.groupElement("PicOrderCnt"));
    /// The [VarHandle] of `PicOrderCnt` of type `(MemorySegment base, long baseOffset, long index, long index0)MemorySegment`.
    public static final VarHandle VH_PicOrderCnt = LAYOUT.arrayElementVarHandle(PathElement.groupElement("PicOrderCnt"), PathElement.sequenceElement());

    /// Creates `StdVideoDecodeH264ReferenceInfo` with the given segment.
    /// @param segment the memory segment
    public StdVideoDecodeH264ReferenceInfo(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `StdVideoDecodeH264ReferenceInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `StdVideoDecodeH264ReferenceInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoDecodeH264ReferenceInfo ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoDecodeH264ReferenceInfo(segment.reinterpret(LAYOUT.byteSize())); }

    /// Creates `StdVideoDecodeH264ReferenceInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `StdVideoDecodeH264ReferenceInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoDecodeH264ReferenceInfo`
    public static StdVideoDecodeH264ReferenceInfo alloc(SegmentAllocator allocator) { return new StdVideoDecodeH264ReferenceInfo(allocator.allocate(LAYOUT)); }

    /// Allocates a `StdVideoDecodeH264ReferenceInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `StdVideoDecodeH264ReferenceInfo`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public StdVideoDecodeH264ReferenceInfo copyFrom(StdVideoDecodeH264ReferenceInfo src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { if (this instanceof Buffer buf) return buf; else return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment flags(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_flags, index), LAYOUT_flags); }
    /// {@return `flags`}
    public MemorySegment flags() { return flags(this.segment(), 0L); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void flags(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_flags, index), LAYOUT_flags.byteSize()); }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoDecodeH264ReferenceInfo flags(MemorySegment value) { flags(this.segment(), 0L, value); return this; }

    /// {@return `FrameNum` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static short FrameNum(MemorySegment segment, long index) { return (short) VH_FrameNum.get(segment, 0L, index); }
    /// {@return `FrameNum`}
    public short FrameNum() { return FrameNum(this.segment(), 0L); }
    /// Sets `FrameNum` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void FrameNum(MemorySegment segment, long index, short value) { VH_FrameNum.set(segment, 0L, index, value); }
    /// Sets `FrameNum` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoDecodeH264ReferenceInfo FrameNum(short value) { FrameNum(this.segment(), 0L, value); return this; }

    /// {@return `reserved` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static short reserved(MemorySegment segment, long index) { return (short) VH_reserved.get(segment, 0L, index); }
    /// {@return `reserved`}
    public short reserved() { return reserved(this.segment(), 0L); }
    /// Sets `reserved` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void reserved(MemorySegment segment, long index, short value) { VH_reserved.set(segment, 0L, index, value); }
    /// Sets `reserved` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoDecodeH264ReferenceInfo reserved(short value) { reserved(this.segment(), 0L, value); return this; }

    /// {@return `PicOrderCnt` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment PicOrderCnt(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_PicOrderCnt, index), LAYOUT_PicOrderCnt); }
    /// {@return `PicOrderCnt` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    public static int PicOrderCnt(MemorySegment segment, long index, long index0) { return (int) VH_PicOrderCnt.get(segment, 0L, index, index0); }
    /// {@return `PicOrderCnt`}
    public MemorySegment PicOrderCnt() { return PicOrderCnt(this.segment(), 0L); }
    /// {@return `PicOrderCnt`}
    /// @param index0 the Index 0 of the array
    public int PicOrderCnt(long index0) { return PicOrderCnt(this.segment(), 0L, index0); }
    /// Sets `PicOrderCnt` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void PicOrderCnt(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_PicOrderCnt, index), LAYOUT_PicOrderCnt.byteSize()); }
    /// Sets `PicOrderCnt` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    public static void PicOrderCnt(MemorySegment segment, long index, long index0, int value) { VH_PicOrderCnt.set(segment, 0L, index, index0, value); }
    /// Sets `PicOrderCnt` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoDecodeH264ReferenceInfo PicOrderCnt(MemorySegment value) { PicOrderCnt(this.segment(), 0L, value); return this; }
    /// Sets `PicOrderCnt` with the given value.
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public StdVideoDecodeH264ReferenceInfo PicOrderCnt(long index0, int value) { PicOrderCnt(this.segment(), 0L, index0, value); return this; }

    /// A buffer of [StdVideoDecodeH264ReferenceInfo].
    public static final class Buffer extends StdVideoDecodeH264ReferenceInfo {
        private final long elementCount;

        /// Creates `StdVideoDecodeH264ReferenceInfo.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `StdVideoDecodeH264ReferenceInfo`.
        /// @param index the index of the struct buffer
        /// @return the slice of `StdVideoDecodeH264ReferenceInfo`
        public StdVideoDecodeH264ReferenceInfo asSlice(long index) { return new StdVideoDecodeH264ReferenceInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `StdVideoDecodeH264ReferenceInfo`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `StdVideoDecodeH264ReferenceInfo`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `flags` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment flagsAt(long index) { return flags(this.segment(), index); }
        /// Sets `flags` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer flagsAt(long index, MemorySegment value) { flags(this.segment(), index, value); return this; }

        /// {@return `FrameNum` at the given index}
        /// @param index the index of the struct buffer
        public short FrameNumAt(long index) { return FrameNum(this.segment(), index); }
        /// Sets `FrameNum` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer FrameNumAt(long index, short value) { FrameNum(this.segment(), index, value); return this; }

        /// {@return `reserved` at the given index}
        /// @param index the index of the struct buffer
        public short reservedAt(long index) { return reserved(this.segment(), index); }
        /// Sets `reserved` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer reservedAt(long index, short value) { reserved(this.segment(), index, value); return this; }

        /// {@return `PicOrderCnt` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment PicOrderCntAt(long index) { return PicOrderCnt(this.segment(), index); }
        /// {@return `PicOrderCnt` at the given index}
        /// @param index the index of the struct buffer
        /// @param index0 the Index 0 of the array
        public int PicOrderCntAt(long index, long index0) { return PicOrderCnt(this.segment(), index, index0); }
        /// Sets `PicOrderCnt` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer PicOrderCntAt(long index, MemorySegment value) { PicOrderCnt(this.segment(), index, value); return this; }
        /// Sets `PicOrderCnt` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param index0 the Index 0 of the array
        /// @param value the value
        /// @return `this`
        public Buffer PicOrderCntAt(long index, long index0, int value) { PicOrderCnt(this.segment(), index, index0, value); return this; }

    }
}
