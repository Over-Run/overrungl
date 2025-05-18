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
/// struct StdVideoEncodeH264PictureInfo {
///     (struct StdVideoEncodeH264PictureInfoFlags) StdVideoEncodeH264PictureInfoFlags flags;
///     uint8_t seq_parameter_set_id;
///     uint8_t pic_parameter_set_id;
///     uint16_t idr_pic_id;
///     (int) StdVideoH264PictureType primary_pic_type;
///     uint32_t frame_num;
///     int32_t PicOrderCnt;
///     uint8_t temporal_id;
///     uint8_t reserved1[3];
///     const StdVideoEncodeH264ReferenceListsInfo* pRefLists;
/// };
/// ```
public sealed class StdVideoEncodeH264PictureInfo extends GroupType {
    /// The struct layout of `StdVideoEncodeH264PictureInfo`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        overrungl.vulkan.video.StdVideoEncodeH264PictureInfoFlags.LAYOUT.withName("flags"),
        ValueLayout.JAVA_BYTE.withName("seq_parameter_set_id"),
        ValueLayout.JAVA_BYTE.withName("pic_parameter_set_id"),
        ValueLayout.JAVA_SHORT.withName("idr_pic_id"),
        ValueLayout.JAVA_INT.withName("primary_pic_type"),
        ValueLayout.JAVA_INT.withName("frame_num"),
        ValueLayout.JAVA_INT.withName("PicOrderCnt"),
        ValueLayout.JAVA_BYTE.withName("temporal_id"),
        MemoryLayout.sequenceLayout(3, ValueLayout.JAVA_BYTE).withName("reserved1"),
        ValueLayout.ADDRESS.withName("pRefLists")
    );
    /// The byte offset of `flags`.
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    /// The memory layout of `flags`.
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    /// The byte offset of `seq_parameter_set_id`.
    public static final long OFFSET_seq_parameter_set_id = LAYOUT.byteOffset(PathElement.groupElement("seq_parameter_set_id"));
    /// The memory layout of `seq_parameter_set_id`.
    public static final MemoryLayout LAYOUT_seq_parameter_set_id = LAYOUT.select(PathElement.groupElement("seq_parameter_set_id"));
    /// The [VarHandle] of `seq_parameter_set_id` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_seq_parameter_set_id = LAYOUT.arrayElementVarHandle(PathElement.groupElement("seq_parameter_set_id"));
    /// The byte offset of `pic_parameter_set_id`.
    public static final long OFFSET_pic_parameter_set_id = LAYOUT.byteOffset(PathElement.groupElement("pic_parameter_set_id"));
    /// The memory layout of `pic_parameter_set_id`.
    public static final MemoryLayout LAYOUT_pic_parameter_set_id = LAYOUT.select(PathElement.groupElement("pic_parameter_set_id"));
    /// The [VarHandle] of `pic_parameter_set_id` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pic_parameter_set_id = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pic_parameter_set_id"));
    /// The byte offset of `idr_pic_id`.
    public static final long OFFSET_idr_pic_id = LAYOUT.byteOffset(PathElement.groupElement("idr_pic_id"));
    /// The memory layout of `idr_pic_id`.
    public static final MemoryLayout LAYOUT_idr_pic_id = LAYOUT.select(PathElement.groupElement("idr_pic_id"));
    /// The [VarHandle] of `idr_pic_id` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_idr_pic_id = LAYOUT.arrayElementVarHandle(PathElement.groupElement("idr_pic_id"));
    /// The byte offset of `primary_pic_type`.
    public static final long OFFSET_primary_pic_type = LAYOUT.byteOffset(PathElement.groupElement("primary_pic_type"));
    /// The memory layout of `primary_pic_type`.
    public static final MemoryLayout LAYOUT_primary_pic_type = LAYOUT.select(PathElement.groupElement("primary_pic_type"));
    /// The [VarHandle] of `primary_pic_type` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_primary_pic_type = LAYOUT.arrayElementVarHandle(PathElement.groupElement("primary_pic_type"));
    /// The byte offset of `frame_num`.
    public static final long OFFSET_frame_num = LAYOUT.byteOffset(PathElement.groupElement("frame_num"));
    /// The memory layout of `frame_num`.
    public static final MemoryLayout LAYOUT_frame_num = LAYOUT.select(PathElement.groupElement("frame_num"));
    /// The [VarHandle] of `frame_num` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_frame_num = LAYOUT.arrayElementVarHandle(PathElement.groupElement("frame_num"));
    /// The byte offset of `PicOrderCnt`.
    public static final long OFFSET_PicOrderCnt = LAYOUT.byteOffset(PathElement.groupElement("PicOrderCnt"));
    /// The memory layout of `PicOrderCnt`.
    public static final MemoryLayout LAYOUT_PicOrderCnt = LAYOUT.select(PathElement.groupElement("PicOrderCnt"));
    /// The [VarHandle] of `PicOrderCnt` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_PicOrderCnt = LAYOUT.arrayElementVarHandle(PathElement.groupElement("PicOrderCnt"));
    /// The byte offset of `temporal_id`.
    public static final long OFFSET_temporal_id = LAYOUT.byteOffset(PathElement.groupElement("temporal_id"));
    /// The memory layout of `temporal_id`.
    public static final MemoryLayout LAYOUT_temporal_id = LAYOUT.select(PathElement.groupElement("temporal_id"));
    /// The [VarHandle] of `temporal_id` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_temporal_id = LAYOUT.arrayElementVarHandle(PathElement.groupElement("temporal_id"));
    /// The byte offset of `reserved1`.
    public static final long OFFSET_reserved1 = LAYOUT.byteOffset(PathElement.groupElement("reserved1"));
    /// The memory layout of `reserved1`.
    public static final MemoryLayout LAYOUT_reserved1 = LAYOUT.select(PathElement.groupElement("reserved1"));
    /// The [VarHandle] of `reserved1` of type `(MemorySegment base, long baseOffset, long index, long index0)MemorySegment`.
    public static final VarHandle VH_reserved1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("reserved1"), PathElement.sequenceElement());
    /// The byte offset of `pRefLists`.
    public static final long OFFSET_pRefLists = LAYOUT.byteOffset(PathElement.groupElement("pRefLists"));
    /// The memory layout of `pRefLists`.
    public static final MemoryLayout LAYOUT_pRefLists = LAYOUT.select(PathElement.groupElement("pRefLists"));
    /// The [VarHandle] of `pRefLists` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pRefLists = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pRefLists"));

    /// Creates `StdVideoEncodeH264PictureInfo` with the given segment.
    /// @param segment the memory segment
    public StdVideoEncodeH264PictureInfo(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `StdVideoEncodeH264PictureInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `StdVideoEncodeH264PictureInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoEncodeH264PictureInfo ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoEncodeH264PictureInfo(segment.reinterpret(LAYOUT.byteSize())); }

    /// Creates `StdVideoEncodeH264PictureInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `StdVideoEncodeH264PictureInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoEncodeH264PictureInfo`
    public static StdVideoEncodeH264PictureInfo alloc(SegmentAllocator allocator) { return new StdVideoEncodeH264PictureInfo(allocator.allocate(LAYOUT)); }

    /// Allocates a `StdVideoEncodeH264PictureInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `StdVideoEncodeH264PictureInfo`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public StdVideoEncodeH264PictureInfo copyFrom(StdVideoEncodeH264PictureInfo src) { this.segment().copyFrom(src.segment()); return this; }

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
    public StdVideoEncodeH264PictureInfo flags(MemorySegment value) { flags(this.segment(), 0L, value); return this; }

    /// {@return `seq_parameter_set_id` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte seq_parameter_set_id(MemorySegment segment, long index) { return (byte) VH_seq_parameter_set_id.get(segment, 0L, index); }
    /// {@return `seq_parameter_set_id`}
    public byte seq_parameter_set_id() { return seq_parameter_set_id(this.segment(), 0L); }
    /// Sets `seq_parameter_set_id` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void seq_parameter_set_id(MemorySegment segment, long index, byte value) { VH_seq_parameter_set_id.set(segment, 0L, index, value); }
    /// Sets `seq_parameter_set_id` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264PictureInfo seq_parameter_set_id(byte value) { seq_parameter_set_id(this.segment(), 0L, value); return this; }

    /// {@return `pic_parameter_set_id` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte pic_parameter_set_id(MemorySegment segment, long index) { return (byte) VH_pic_parameter_set_id.get(segment, 0L, index); }
    /// {@return `pic_parameter_set_id`}
    public byte pic_parameter_set_id() { return pic_parameter_set_id(this.segment(), 0L); }
    /// Sets `pic_parameter_set_id` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pic_parameter_set_id(MemorySegment segment, long index, byte value) { VH_pic_parameter_set_id.set(segment, 0L, index, value); }
    /// Sets `pic_parameter_set_id` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264PictureInfo pic_parameter_set_id(byte value) { pic_parameter_set_id(this.segment(), 0L, value); return this; }

    /// {@return `idr_pic_id` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static short idr_pic_id(MemorySegment segment, long index) { return (short) VH_idr_pic_id.get(segment, 0L, index); }
    /// {@return `idr_pic_id`}
    public short idr_pic_id() { return idr_pic_id(this.segment(), 0L); }
    /// Sets `idr_pic_id` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void idr_pic_id(MemorySegment segment, long index, short value) { VH_idr_pic_id.set(segment, 0L, index, value); }
    /// Sets `idr_pic_id` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264PictureInfo idr_pic_id(short value) { idr_pic_id(this.segment(), 0L, value); return this; }

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
    public StdVideoEncodeH264PictureInfo primary_pic_type(int value) { primary_pic_type(this.segment(), 0L, value); return this; }

    /// {@return `frame_num` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int frame_num(MemorySegment segment, long index) { return (int) VH_frame_num.get(segment, 0L, index); }
    /// {@return `frame_num`}
    public int frame_num() { return frame_num(this.segment(), 0L); }
    /// Sets `frame_num` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void frame_num(MemorySegment segment, long index, int value) { VH_frame_num.set(segment, 0L, index, value); }
    /// Sets `frame_num` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264PictureInfo frame_num(int value) { frame_num(this.segment(), 0L, value); return this; }

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
    public StdVideoEncodeH264PictureInfo PicOrderCnt(int value) { PicOrderCnt(this.segment(), 0L, value); return this; }

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
    public StdVideoEncodeH264PictureInfo temporal_id(byte value) { temporal_id(this.segment(), 0L, value); return this; }

    /// {@return `reserved1` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment reserved1(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_reserved1, index), LAYOUT_reserved1); }
    /// {@return `reserved1` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    public static byte reserved1(MemorySegment segment, long index, long index0) { return (byte) VH_reserved1.get(segment, 0L, index, index0); }
    /// {@return `reserved1`}
    public MemorySegment reserved1() { return reserved1(this.segment(), 0L); }
    /// {@return `reserved1`}
    /// @param index0 the Index 0 of the array
    public byte reserved1(long index0) { return reserved1(this.segment(), 0L, index0); }
    /// Sets `reserved1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void reserved1(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_reserved1, index), LAYOUT_reserved1.byteSize()); }
    /// Sets `reserved1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    public static void reserved1(MemorySegment segment, long index, long index0, byte value) { VH_reserved1.set(segment, 0L, index, index0, value); }
    /// Sets `reserved1` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264PictureInfo reserved1(MemorySegment value) { reserved1(this.segment(), 0L, value); return this; }
    /// Sets `reserved1` with the given value.
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264PictureInfo reserved1(long index0, byte value) { reserved1(this.segment(), 0L, index0, value); return this; }

    /// {@return `pRefLists` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pRefLists(MemorySegment segment, long index) { return (MemorySegment) VH_pRefLists.get(segment, 0L, index); }
    /// {@return `pRefLists`}
    public MemorySegment pRefLists() { return pRefLists(this.segment(), 0L); }
    /// Sets `pRefLists` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pRefLists(MemorySegment segment, long index, MemorySegment value) { VH_pRefLists.set(segment, 0L, index, value); }
    /// Sets `pRefLists` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264PictureInfo pRefLists(MemorySegment value) { pRefLists(this.segment(), 0L, value); return this; }

    /// A buffer of [StdVideoEncodeH264PictureInfo].
    public static final class Buffer extends StdVideoEncodeH264PictureInfo {
        private final long elementCount;

        /// Creates `StdVideoEncodeH264PictureInfo.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `StdVideoEncodeH264PictureInfo`.
        /// @param index the index of the struct buffer
        /// @return the slice of `StdVideoEncodeH264PictureInfo`
        public StdVideoEncodeH264PictureInfo asSlice(long index) { return new StdVideoEncodeH264PictureInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `StdVideoEncodeH264PictureInfo`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `StdVideoEncodeH264PictureInfo`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `flags` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment flagsAt(long index) { return flags(this.segment(), index); }
        /// Sets `flags` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer flagsAt(long index, MemorySegment value) { flags(this.segment(), index, value); return this; }

        /// {@return `seq_parameter_set_id` at the given index}
        /// @param index the index of the struct buffer
        public byte seq_parameter_set_idAt(long index) { return seq_parameter_set_id(this.segment(), index); }
        /// Sets `seq_parameter_set_id` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer seq_parameter_set_idAt(long index, byte value) { seq_parameter_set_id(this.segment(), index, value); return this; }

        /// {@return `pic_parameter_set_id` at the given index}
        /// @param index the index of the struct buffer
        public byte pic_parameter_set_idAt(long index) { return pic_parameter_set_id(this.segment(), index); }
        /// Sets `pic_parameter_set_id` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer pic_parameter_set_idAt(long index, byte value) { pic_parameter_set_id(this.segment(), index, value); return this; }

        /// {@return `idr_pic_id` at the given index}
        /// @param index the index of the struct buffer
        public short idr_pic_idAt(long index) { return idr_pic_id(this.segment(), index); }
        /// Sets `idr_pic_id` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer idr_pic_idAt(long index, short value) { idr_pic_id(this.segment(), index, value); return this; }

        /// {@return `primary_pic_type` at the given index}
        /// @param index the index of the struct buffer
        public int primary_pic_typeAt(long index) { return primary_pic_type(this.segment(), index); }
        /// Sets `primary_pic_type` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer primary_pic_typeAt(long index, int value) { primary_pic_type(this.segment(), index, value); return this; }

        /// {@return `frame_num` at the given index}
        /// @param index the index of the struct buffer
        public int frame_numAt(long index) { return frame_num(this.segment(), index); }
        /// Sets `frame_num` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer frame_numAt(long index, int value) { frame_num(this.segment(), index, value); return this; }

        /// {@return `PicOrderCnt` at the given index}
        /// @param index the index of the struct buffer
        public int PicOrderCntAt(long index) { return PicOrderCnt(this.segment(), index); }
        /// Sets `PicOrderCnt` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer PicOrderCntAt(long index, int value) { PicOrderCnt(this.segment(), index, value); return this; }

        /// {@return `temporal_id` at the given index}
        /// @param index the index of the struct buffer
        public byte temporal_idAt(long index) { return temporal_id(this.segment(), index); }
        /// Sets `temporal_id` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer temporal_idAt(long index, byte value) { temporal_id(this.segment(), index, value); return this; }

        /// {@return `reserved1` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment reserved1At(long index) { return reserved1(this.segment(), index); }
        /// {@return `reserved1` at the given index}
        /// @param index the index of the struct buffer
        /// @param index0 the Index 0 of the array
        public byte reserved1At(long index, long index0) { return reserved1(this.segment(), index, index0); }
        /// Sets `reserved1` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer reserved1At(long index, MemorySegment value) { reserved1(this.segment(), index, value); return this; }
        /// Sets `reserved1` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param index0 the Index 0 of the array
        /// @param value the value
        /// @return `this`
        public Buffer reserved1At(long index, long index0, byte value) { reserved1(this.segment(), index, index0, value); return this; }

        /// {@return `pRefLists` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment pRefListsAt(long index) { return pRefLists(this.segment(), index); }
        /// Sets `pRefLists` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer pRefListsAt(long index, MemorySegment value) { pRefLists(this.segment(), index, value); return this; }

    }
}
