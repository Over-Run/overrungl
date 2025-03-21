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
/// struct StdVideoEncodeH264ReferenceInfo {
///     (struct StdVideoEncodeH264ReferenceInfoFlags) StdVideoEncodeH264ReferenceInfoFlags flags;
///     (int) StdVideoH264PictureType primary_pic_type;
///     uint32_t FrameNum;
///     int32_t PicOrderCnt;
///     uint16_t long_term_pic_num;
///     uint16_t long_term_frame_idx;
///     uint8_t temporal_id;
/// };
/// ```
public sealed class StdVideoEncodeH264ReferenceInfo extends GroupType {
    /// The struct layout of `StdVideoEncodeH264ReferenceInfo`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        overrungl.vulkan.video.StdVideoEncodeH264ReferenceInfoFlags.LAYOUT.withName("flags"),
        ValueLayout.JAVA_INT.withName("primary_pic_type"),
        ValueLayout.JAVA_INT.withName("FrameNum"),
        ValueLayout.JAVA_INT.withName("PicOrderCnt"),
        ValueLayout.JAVA_SHORT.withName("long_term_pic_num"),
        ValueLayout.JAVA_SHORT.withName("long_term_frame_idx"),
        ValueLayout.JAVA_BYTE.withName("temporal_id")
    );
    /// The byte offset of `flags`.
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    /// The memory layout of `flags`.
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    /// The byte offset of `primary_pic_type`.
    public static final long OFFSET_primary_pic_type = LAYOUT.byteOffset(PathElement.groupElement("primary_pic_type"));
    /// The memory layout of `primary_pic_type`.
    public static final MemoryLayout LAYOUT_primary_pic_type = LAYOUT.select(PathElement.groupElement("primary_pic_type"));
    /// The [VarHandle] of `primary_pic_type` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_primary_pic_type = LAYOUT.arrayElementVarHandle(PathElement.groupElement("primary_pic_type"));
    /// The byte offset of `FrameNum`.
    public static final long OFFSET_FrameNum = LAYOUT.byteOffset(PathElement.groupElement("FrameNum"));
    /// The memory layout of `FrameNum`.
    public static final MemoryLayout LAYOUT_FrameNum = LAYOUT.select(PathElement.groupElement("FrameNum"));
    /// The [VarHandle] of `FrameNum` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_FrameNum = LAYOUT.arrayElementVarHandle(PathElement.groupElement("FrameNum"));
    /// The byte offset of `PicOrderCnt`.
    public static final long OFFSET_PicOrderCnt = LAYOUT.byteOffset(PathElement.groupElement("PicOrderCnt"));
    /// The memory layout of `PicOrderCnt`.
    public static final MemoryLayout LAYOUT_PicOrderCnt = LAYOUT.select(PathElement.groupElement("PicOrderCnt"));
    /// The [VarHandle] of `PicOrderCnt` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_PicOrderCnt = LAYOUT.arrayElementVarHandle(PathElement.groupElement("PicOrderCnt"));
    /// The byte offset of `long_term_pic_num`.
    public static final long OFFSET_long_term_pic_num = LAYOUT.byteOffset(PathElement.groupElement("long_term_pic_num"));
    /// The memory layout of `long_term_pic_num`.
    public static final MemoryLayout LAYOUT_long_term_pic_num = LAYOUT.select(PathElement.groupElement("long_term_pic_num"));
    /// The [VarHandle] of `long_term_pic_num` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_long_term_pic_num = LAYOUT.arrayElementVarHandle(PathElement.groupElement("long_term_pic_num"));
    /// The byte offset of `long_term_frame_idx`.
    public static final long OFFSET_long_term_frame_idx = LAYOUT.byteOffset(PathElement.groupElement("long_term_frame_idx"));
    /// The memory layout of `long_term_frame_idx`.
    public static final MemoryLayout LAYOUT_long_term_frame_idx = LAYOUT.select(PathElement.groupElement("long_term_frame_idx"));
    /// The [VarHandle] of `long_term_frame_idx` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_long_term_frame_idx = LAYOUT.arrayElementVarHandle(PathElement.groupElement("long_term_frame_idx"));
    /// The byte offset of `temporal_id`.
    public static final long OFFSET_temporal_id = LAYOUT.byteOffset(PathElement.groupElement("temporal_id"));
    /// The memory layout of `temporal_id`.
    public static final MemoryLayout LAYOUT_temporal_id = LAYOUT.select(PathElement.groupElement("temporal_id"));
    /// The [VarHandle] of `temporal_id` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_temporal_id = LAYOUT.arrayElementVarHandle(PathElement.groupElement("temporal_id"));

    /// Creates `StdVideoEncodeH264ReferenceInfo` with the given segment.
    /// @param segment the memory segment
    public StdVideoEncodeH264ReferenceInfo(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `StdVideoEncodeH264ReferenceInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `StdVideoEncodeH264ReferenceInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoEncodeH264ReferenceInfo ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoEncodeH264ReferenceInfo(segment.reinterpret(LAYOUT.byteSize())); }

    /// Creates `StdVideoEncodeH264ReferenceInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `StdVideoEncodeH264ReferenceInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoEncodeH264ReferenceInfo`
    public static StdVideoEncodeH264ReferenceInfo alloc(SegmentAllocator allocator) { return new StdVideoEncodeH264ReferenceInfo(allocator.allocate(LAYOUT)); }

    /// Allocates a `StdVideoEncodeH264ReferenceInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `StdVideoEncodeH264ReferenceInfo`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public StdVideoEncodeH264ReferenceInfo copyFrom(StdVideoEncodeH264ReferenceInfo src) { this.segment().copyFrom(src.segment()); return this; }

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
    public StdVideoEncodeH264ReferenceInfo flags(MemorySegment value) { flags(this.segment(), 0L, value); return this; }

    /// {@return `primary_pic_type` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int primary_pic_type(MemorySegment segment, long index) { return (int) VH_primary_pic_type.get(segment, 0L, index); }
    /// {@return `primary_pic_type`}
    public int primary_pic_type() { return primary_pic_type(this.segment(), 0L); }
    /// Sets `primary_pic_type` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void primary_pic_type(MemorySegment segment, long index, int value) { VH_primary_pic_type.set(segment, 0L, index, value); }
    /// Sets `primary_pic_type` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264ReferenceInfo primary_pic_type(int value) { primary_pic_type(this.segment(), 0L, value); return this; }

    /// {@return `FrameNum` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int FrameNum(MemorySegment segment, long index) { return (int) VH_FrameNum.get(segment, 0L, index); }
    /// {@return `FrameNum`}
    public int FrameNum() { return FrameNum(this.segment(), 0L); }
    /// Sets `FrameNum` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void FrameNum(MemorySegment segment, long index, int value) { VH_FrameNum.set(segment, 0L, index, value); }
    /// Sets `FrameNum` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264ReferenceInfo FrameNum(int value) { FrameNum(this.segment(), 0L, value); return this; }

    /// {@return `PicOrderCnt` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int PicOrderCnt(MemorySegment segment, long index) { return (int) VH_PicOrderCnt.get(segment, 0L, index); }
    /// {@return `PicOrderCnt`}
    public int PicOrderCnt() { return PicOrderCnt(this.segment(), 0L); }
    /// Sets `PicOrderCnt` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void PicOrderCnt(MemorySegment segment, long index, int value) { VH_PicOrderCnt.set(segment, 0L, index, value); }
    /// Sets `PicOrderCnt` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264ReferenceInfo PicOrderCnt(int value) { PicOrderCnt(this.segment(), 0L, value); return this; }

    /// {@return `long_term_pic_num` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static short long_term_pic_num(MemorySegment segment, long index) { return (short) VH_long_term_pic_num.get(segment, 0L, index); }
    /// {@return `long_term_pic_num`}
    public short long_term_pic_num() { return long_term_pic_num(this.segment(), 0L); }
    /// Sets `long_term_pic_num` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void long_term_pic_num(MemorySegment segment, long index, short value) { VH_long_term_pic_num.set(segment, 0L, index, value); }
    /// Sets `long_term_pic_num` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264ReferenceInfo long_term_pic_num(short value) { long_term_pic_num(this.segment(), 0L, value); return this; }

    /// {@return `long_term_frame_idx` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static short long_term_frame_idx(MemorySegment segment, long index) { return (short) VH_long_term_frame_idx.get(segment, 0L, index); }
    /// {@return `long_term_frame_idx`}
    public short long_term_frame_idx() { return long_term_frame_idx(this.segment(), 0L); }
    /// Sets `long_term_frame_idx` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void long_term_frame_idx(MemorySegment segment, long index, short value) { VH_long_term_frame_idx.set(segment, 0L, index, value); }
    /// Sets `long_term_frame_idx` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264ReferenceInfo long_term_frame_idx(short value) { long_term_frame_idx(this.segment(), 0L, value); return this; }

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
    public StdVideoEncodeH264ReferenceInfo temporal_id(byte value) { temporal_id(this.segment(), 0L, value); return this; }

    /// A buffer of [StdVideoEncodeH264ReferenceInfo].
    public static final class Buffer extends StdVideoEncodeH264ReferenceInfo {
        private final long elementCount;

        /// Creates `StdVideoEncodeH264ReferenceInfo.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `StdVideoEncodeH264ReferenceInfo`.
        /// @param index the index of the struct buffer
        /// @return the slice of `StdVideoEncodeH264ReferenceInfo`
        public StdVideoEncodeH264ReferenceInfo asSlice(long index) { return new StdVideoEncodeH264ReferenceInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `StdVideoEncodeH264ReferenceInfo`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `StdVideoEncodeH264ReferenceInfo`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `flags` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment flagsAt(long index) { return flags(this.segment(), index); }
        /// Sets `flags` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer flagsAt(long index, MemorySegment value) { flags(this.segment(), index, value); return this; }

        /// {@return `primary_pic_type` at the given index}
        /// @param index the index of the struct buffer
        public int primary_pic_typeAt(long index) { return primary_pic_type(this.segment(), index); }
        /// Sets `primary_pic_type` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer primary_pic_typeAt(long index, int value) { primary_pic_type(this.segment(), index, value); return this; }

        /// {@return `FrameNum` at the given index}
        /// @param index the index of the struct buffer
        public int FrameNumAt(long index) { return FrameNum(this.segment(), index); }
        /// Sets `FrameNum` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer FrameNumAt(long index, int value) { FrameNum(this.segment(), index, value); return this; }

        /// {@return `PicOrderCnt` at the given index}
        /// @param index the index of the struct buffer
        public int PicOrderCntAt(long index) { return PicOrderCnt(this.segment(), index); }
        /// Sets `PicOrderCnt` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer PicOrderCntAt(long index, int value) { PicOrderCnt(this.segment(), index, value); return this; }

        /// {@return `long_term_pic_num` at the given index}
        /// @param index the index of the struct buffer
        public short long_term_pic_numAt(long index) { return long_term_pic_num(this.segment(), index); }
        /// Sets `long_term_pic_num` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer long_term_pic_numAt(long index, short value) { long_term_pic_num(this.segment(), index, value); return this; }

        /// {@return `long_term_frame_idx` at the given index}
        /// @param index the index of the struct buffer
        public short long_term_frame_idxAt(long index) { return long_term_frame_idx(this.segment(), index); }
        /// Sets `long_term_frame_idx` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer long_term_frame_idxAt(long index, short value) { long_term_frame_idx(this.segment(), index, value); return this; }

        /// {@return `temporal_id` at the given index}
        /// @param index the index of the struct buffer
        public byte temporal_idAt(long index) { return temporal_id(this.segment(), index); }
        /// Sets `temporal_id` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer temporal_idAt(long index, byte value) { temporal_id(this.segment(), index, value); return this; }

    }
}
