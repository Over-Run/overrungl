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
/// struct StdVideoDecodeH265PictureInfo {
///     (struct StdVideoDecodeH265PictureInfoFlags) StdVideoDecodeH265PictureInfoFlags flags;
///     uint8_t sps_video_parameter_set_id;
///     uint8_t pps_seq_parameter_set_id;
///     uint8_t pps_pic_parameter_set_id;
///     uint8_t NumDeltaPocsOfRefRpsIdx;
///     int32_t PicOrderCntVal;
///     uint16_t NumBitsForSTRefPicSetInSlice;
///     uint16_t reserved;
///     uint8_t RefPicSetStCurrBefore[8];
///     uint8_t RefPicSetStCurrAfter[8];
///     uint8_t RefPicSetLtCurr[8];
/// };
/// ```
public sealed class StdVideoDecodeH265PictureInfo extends GroupType {
    /// The struct layout of `StdVideoDecodeH265PictureInfo`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        overrungl.vulkan.video.StdVideoDecodeH265PictureInfoFlags.LAYOUT.withName("flags"),
        ValueLayout.JAVA_BYTE.withName("sps_video_parameter_set_id"),
        ValueLayout.JAVA_BYTE.withName("pps_seq_parameter_set_id"),
        ValueLayout.JAVA_BYTE.withName("pps_pic_parameter_set_id"),
        ValueLayout.JAVA_BYTE.withName("NumDeltaPocsOfRefRpsIdx"),
        ValueLayout.JAVA_INT.withName("PicOrderCntVal"),
        ValueLayout.JAVA_SHORT.withName("NumBitsForSTRefPicSetInSlice"),
        ValueLayout.JAVA_SHORT.withName("reserved"),
        MemoryLayout.sequenceLayout(8, ValueLayout.JAVA_BYTE).withName("RefPicSetStCurrBefore"),
        MemoryLayout.sequenceLayout(8, ValueLayout.JAVA_BYTE).withName("RefPicSetStCurrAfter"),
        MemoryLayout.sequenceLayout(8, ValueLayout.JAVA_BYTE).withName("RefPicSetLtCurr")
    );
    /// The byte offset of `flags`.
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    /// The memory layout of `flags`.
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    /// The byte offset of `sps_video_parameter_set_id`.
    public static final long OFFSET_sps_video_parameter_set_id = LAYOUT.byteOffset(PathElement.groupElement("sps_video_parameter_set_id"));
    /// The memory layout of `sps_video_parameter_set_id`.
    public static final MemoryLayout LAYOUT_sps_video_parameter_set_id = LAYOUT.select(PathElement.groupElement("sps_video_parameter_set_id"));
    /// The [VarHandle] of `sps_video_parameter_set_id` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_sps_video_parameter_set_id = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sps_video_parameter_set_id"));
    /// The byte offset of `pps_seq_parameter_set_id`.
    public static final long OFFSET_pps_seq_parameter_set_id = LAYOUT.byteOffset(PathElement.groupElement("pps_seq_parameter_set_id"));
    /// The memory layout of `pps_seq_parameter_set_id`.
    public static final MemoryLayout LAYOUT_pps_seq_parameter_set_id = LAYOUT.select(PathElement.groupElement("pps_seq_parameter_set_id"));
    /// The [VarHandle] of `pps_seq_parameter_set_id` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pps_seq_parameter_set_id = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pps_seq_parameter_set_id"));
    /// The byte offset of `pps_pic_parameter_set_id`.
    public static final long OFFSET_pps_pic_parameter_set_id = LAYOUT.byteOffset(PathElement.groupElement("pps_pic_parameter_set_id"));
    /// The memory layout of `pps_pic_parameter_set_id`.
    public static final MemoryLayout LAYOUT_pps_pic_parameter_set_id = LAYOUT.select(PathElement.groupElement("pps_pic_parameter_set_id"));
    /// The [VarHandle] of `pps_pic_parameter_set_id` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pps_pic_parameter_set_id = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pps_pic_parameter_set_id"));
    /// The byte offset of `NumDeltaPocsOfRefRpsIdx`.
    public static final long OFFSET_NumDeltaPocsOfRefRpsIdx = LAYOUT.byteOffset(PathElement.groupElement("NumDeltaPocsOfRefRpsIdx"));
    /// The memory layout of `NumDeltaPocsOfRefRpsIdx`.
    public static final MemoryLayout LAYOUT_NumDeltaPocsOfRefRpsIdx = LAYOUT.select(PathElement.groupElement("NumDeltaPocsOfRefRpsIdx"));
    /// The [VarHandle] of `NumDeltaPocsOfRefRpsIdx` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_NumDeltaPocsOfRefRpsIdx = LAYOUT.arrayElementVarHandle(PathElement.groupElement("NumDeltaPocsOfRefRpsIdx"));
    /// The byte offset of `PicOrderCntVal`.
    public static final long OFFSET_PicOrderCntVal = LAYOUT.byteOffset(PathElement.groupElement("PicOrderCntVal"));
    /// The memory layout of `PicOrderCntVal`.
    public static final MemoryLayout LAYOUT_PicOrderCntVal = LAYOUT.select(PathElement.groupElement("PicOrderCntVal"));
    /// The [VarHandle] of `PicOrderCntVal` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_PicOrderCntVal = LAYOUT.arrayElementVarHandle(PathElement.groupElement("PicOrderCntVal"));
    /// The byte offset of `NumBitsForSTRefPicSetInSlice`.
    public static final long OFFSET_NumBitsForSTRefPicSetInSlice = LAYOUT.byteOffset(PathElement.groupElement("NumBitsForSTRefPicSetInSlice"));
    /// The memory layout of `NumBitsForSTRefPicSetInSlice`.
    public static final MemoryLayout LAYOUT_NumBitsForSTRefPicSetInSlice = LAYOUT.select(PathElement.groupElement("NumBitsForSTRefPicSetInSlice"));
    /// The [VarHandle] of `NumBitsForSTRefPicSetInSlice` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_NumBitsForSTRefPicSetInSlice = LAYOUT.arrayElementVarHandle(PathElement.groupElement("NumBitsForSTRefPicSetInSlice"));
    /// The byte offset of `reserved`.
    public static final long OFFSET_reserved = LAYOUT.byteOffset(PathElement.groupElement("reserved"));
    /// The memory layout of `reserved`.
    public static final MemoryLayout LAYOUT_reserved = LAYOUT.select(PathElement.groupElement("reserved"));
    /// The [VarHandle] of `reserved` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_reserved = LAYOUT.arrayElementVarHandle(PathElement.groupElement("reserved"));
    /// The byte offset of `RefPicSetStCurrBefore`.
    public static final long OFFSET_RefPicSetStCurrBefore = LAYOUT.byteOffset(PathElement.groupElement("RefPicSetStCurrBefore"));
    /// The memory layout of `RefPicSetStCurrBefore`.
    public static final MemoryLayout LAYOUT_RefPicSetStCurrBefore = LAYOUT.select(PathElement.groupElement("RefPicSetStCurrBefore"));
    /// The [VarHandle] of `RefPicSetStCurrBefore` of type `(MemorySegment base, long baseOffset, long index, long index0)MemorySegment`.
    public static final VarHandle VH_RefPicSetStCurrBefore = LAYOUT.arrayElementVarHandle(PathElement.groupElement("RefPicSetStCurrBefore"), PathElement.sequenceElement());
    /// The byte offset of `RefPicSetStCurrAfter`.
    public static final long OFFSET_RefPicSetStCurrAfter = LAYOUT.byteOffset(PathElement.groupElement("RefPicSetStCurrAfter"));
    /// The memory layout of `RefPicSetStCurrAfter`.
    public static final MemoryLayout LAYOUT_RefPicSetStCurrAfter = LAYOUT.select(PathElement.groupElement("RefPicSetStCurrAfter"));
    /// The [VarHandle] of `RefPicSetStCurrAfter` of type `(MemorySegment base, long baseOffset, long index, long index0)MemorySegment`.
    public static final VarHandle VH_RefPicSetStCurrAfter = LAYOUT.arrayElementVarHandle(PathElement.groupElement("RefPicSetStCurrAfter"), PathElement.sequenceElement());
    /// The byte offset of `RefPicSetLtCurr`.
    public static final long OFFSET_RefPicSetLtCurr = LAYOUT.byteOffset(PathElement.groupElement("RefPicSetLtCurr"));
    /// The memory layout of `RefPicSetLtCurr`.
    public static final MemoryLayout LAYOUT_RefPicSetLtCurr = LAYOUT.select(PathElement.groupElement("RefPicSetLtCurr"));
    /// The [VarHandle] of `RefPicSetLtCurr` of type `(MemorySegment base, long baseOffset, long index, long index0)MemorySegment`.
    public static final VarHandle VH_RefPicSetLtCurr = LAYOUT.arrayElementVarHandle(PathElement.groupElement("RefPicSetLtCurr"), PathElement.sequenceElement());

    /// Creates `StdVideoDecodeH265PictureInfo` with the given segment.
    /// @param segment the memory segment
    public StdVideoDecodeH265PictureInfo(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `StdVideoDecodeH265PictureInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `StdVideoDecodeH265PictureInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoDecodeH265PictureInfo ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoDecodeH265PictureInfo(segment.reinterpret(LAYOUT.byteSize())); }

    /// Creates `StdVideoDecodeH265PictureInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `StdVideoDecodeH265PictureInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoDecodeH265PictureInfo`
    public static StdVideoDecodeH265PictureInfo alloc(SegmentAllocator allocator) { return new StdVideoDecodeH265PictureInfo(allocator.allocate(LAYOUT)); }

    /// Allocates a `StdVideoDecodeH265PictureInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `StdVideoDecodeH265PictureInfo`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public StdVideoDecodeH265PictureInfo copyFrom(StdVideoDecodeH265PictureInfo src) { this.segment().copyFrom(src.segment()); return this; }

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
    public StdVideoDecodeH265PictureInfo flags(MemorySegment value) { flags(this.segment(), 0L, value); return this; }

    /// {@return `sps_video_parameter_set_id` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte sps_video_parameter_set_id(MemorySegment segment, long index) { return (byte) VH_sps_video_parameter_set_id.get(segment, 0L, index); }
    /// {@return `sps_video_parameter_set_id`}
    public byte sps_video_parameter_set_id() { return sps_video_parameter_set_id(this.segment(), 0L); }
    /// Sets `sps_video_parameter_set_id` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void sps_video_parameter_set_id(MemorySegment segment, long index, byte value) { VH_sps_video_parameter_set_id.set(segment, 0L, index, value); }
    /// Sets `sps_video_parameter_set_id` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoDecodeH265PictureInfo sps_video_parameter_set_id(byte value) { sps_video_parameter_set_id(this.segment(), 0L, value); return this; }

    /// {@return `pps_seq_parameter_set_id` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte pps_seq_parameter_set_id(MemorySegment segment, long index) { return (byte) VH_pps_seq_parameter_set_id.get(segment, 0L, index); }
    /// {@return `pps_seq_parameter_set_id`}
    public byte pps_seq_parameter_set_id() { return pps_seq_parameter_set_id(this.segment(), 0L); }
    /// Sets `pps_seq_parameter_set_id` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pps_seq_parameter_set_id(MemorySegment segment, long index, byte value) { VH_pps_seq_parameter_set_id.set(segment, 0L, index, value); }
    /// Sets `pps_seq_parameter_set_id` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoDecodeH265PictureInfo pps_seq_parameter_set_id(byte value) { pps_seq_parameter_set_id(this.segment(), 0L, value); return this; }

    /// {@return `pps_pic_parameter_set_id` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte pps_pic_parameter_set_id(MemorySegment segment, long index) { return (byte) VH_pps_pic_parameter_set_id.get(segment, 0L, index); }
    /// {@return `pps_pic_parameter_set_id`}
    public byte pps_pic_parameter_set_id() { return pps_pic_parameter_set_id(this.segment(), 0L); }
    /// Sets `pps_pic_parameter_set_id` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pps_pic_parameter_set_id(MemorySegment segment, long index, byte value) { VH_pps_pic_parameter_set_id.set(segment, 0L, index, value); }
    /// Sets `pps_pic_parameter_set_id` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoDecodeH265PictureInfo pps_pic_parameter_set_id(byte value) { pps_pic_parameter_set_id(this.segment(), 0L, value); return this; }

    /// {@return `NumDeltaPocsOfRefRpsIdx` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte NumDeltaPocsOfRefRpsIdx(MemorySegment segment, long index) { return (byte) VH_NumDeltaPocsOfRefRpsIdx.get(segment, 0L, index); }
    /// {@return `NumDeltaPocsOfRefRpsIdx`}
    public byte NumDeltaPocsOfRefRpsIdx() { return NumDeltaPocsOfRefRpsIdx(this.segment(), 0L); }
    /// Sets `NumDeltaPocsOfRefRpsIdx` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void NumDeltaPocsOfRefRpsIdx(MemorySegment segment, long index, byte value) { VH_NumDeltaPocsOfRefRpsIdx.set(segment, 0L, index, value); }
    /// Sets `NumDeltaPocsOfRefRpsIdx` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoDecodeH265PictureInfo NumDeltaPocsOfRefRpsIdx(byte value) { NumDeltaPocsOfRefRpsIdx(this.segment(), 0L, value); return this; }

    /// {@return `PicOrderCntVal` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int PicOrderCntVal(MemorySegment segment, long index) { return (int) VH_PicOrderCntVal.get(segment, 0L, index); }
    /// {@return `PicOrderCntVal`}
    public int PicOrderCntVal() { return PicOrderCntVal(this.segment(), 0L); }
    /// Sets `PicOrderCntVal` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void PicOrderCntVal(MemorySegment segment, long index, int value) { VH_PicOrderCntVal.set(segment, 0L, index, value); }
    /// Sets `PicOrderCntVal` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoDecodeH265PictureInfo PicOrderCntVal(int value) { PicOrderCntVal(this.segment(), 0L, value); return this; }

    /// {@return `NumBitsForSTRefPicSetInSlice` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static short NumBitsForSTRefPicSetInSlice(MemorySegment segment, long index) { return (short) VH_NumBitsForSTRefPicSetInSlice.get(segment, 0L, index); }
    /// {@return `NumBitsForSTRefPicSetInSlice`}
    public short NumBitsForSTRefPicSetInSlice() { return NumBitsForSTRefPicSetInSlice(this.segment(), 0L); }
    /// Sets `NumBitsForSTRefPicSetInSlice` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void NumBitsForSTRefPicSetInSlice(MemorySegment segment, long index, short value) { VH_NumBitsForSTRefPicSetInSlice.set(segment, 0L, index, value); }
    /// Sets `NumBitsForSTRefPicSetInSlice` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoDecodeH265PictureInfo NumBitsForSTRefPicSetInSlice(short value) { NumBitsForSTRefPicSetInSlice(this.segment(), 0L, value); return this; }

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
    public StdVideoDecodeH265PictureInfo reserved(short value) { reserved(this.segment(), 0L, value); return this; }

    /// {@return `RefPicSetStCurrBefore` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment RefPicSetStCurrBefore(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_RefPicSetStCurrBefore, index), LAYOUT_RefPicSetStCurrBefore); }
    /// {@return `RefPicSetStCurrBefore` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    public static byte RefPicSetStCurrBefore(MemorySegment segment, long index, long index0) { return (byte) VH_RefPicSetStCurrBefore.get(segment, 0L, index, index0); }
    /// {@return `RefPicSetStCurrBefore`}
    public MemorySegment RefPicSetStCurrBefore() { return RefPicSetStCurrBefore(this.segment(), 0L); }
    /// {@return `RefPicSetStCurrBefore`}
    /// @param index0 the Index 0 of the array
    public byte RefPicSetStCurrBefore(long index0) { return RefPicSetStCurrBefore(this.segment(), 0L, index0); }
    /// Sets `RefPicSetStCurrBefore` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void RefPicSetStCurrBefore(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_RefPicSetStCurrBefore, index), LAYOUT_RefPicSetStCurrBefore.byteSize()); }
    /// Sets `RefPicSetStCurrBefore` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    public static void RefPicSetStCurrBefore(MemorySegment segment, long index, long index0, byte value) { VH_RefPicSetStCurrBefore.set(segment, 0L, index, index0, value); }
    /// Sets `RefPicSetStCurrBefore` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoDecodeH265PictureInfo RefPicSetStCurrBefore(MemorySegment value) { RefPicSetStCurrBefore(this.segment(), 0L, value); return this; }
    /// Sets `RefPicSetStCurrBefore` with the given value.
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public StdVideoDecodeH265PictureInfo RefPicSetStCurrBefore(long index0, byte value) { RefPicSetStCurrBefore(this.segment(), 0L, index0, value); return this; }

    /// {@return `RefPicSetStCurrAfter` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment RefPicSetStCurrAfter(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_RefPicSetStCurrAfter, index), LAYOUT_RefPicSetStCurrAfter); }
    /// {@return `RefPicSetStCurrAfter` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    public static byte RefPicSetStCurrAfter(MemorySegment segment, long index, long index0) { return (byte) VH_RefPicSetStCurrAfter.get(segment, 0L, index, index0); }
    /// {@return `RefPicSetStCurrAfter`}
    public MemorySegment RefPicSetStCurrAfter() { return RefPicSetStCurrAfter(this.segment(), 0L); }
    /// {@return `RefPicSetStCurrAfter`}
    /// @param index0 the Index 0 of the array
    public byte RefPicSetStCurrAfter(long index0) { return RefPicSetStCurrAfter(this.segment(), 0L, index0); }
    /// Sets `RefPicSetStCurrAfter` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void RefPicSetStCurrAfter(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_RefPicSetStCurrAfter, index), LAYOUT_RefPicSetStCurrAfter.byteSize()); }
    /// Sets `RefPicSetStCurrAfter` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    public static void RefPicSetStCurrAfter(MemorySegment segment, long index, long index0, byte value) { VH_RefPicSetStCurrAfter.set(segment, 0L, index, index0, value); }
    /// Sets `RefPicSetStCurrAfter` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoDecodeH265PictureInfo RefPicSetStCurrAfter(MemorySegment value) { RefPicSetStCurrAfter(this.segment(), 0L, value); return this; }
    /// Sets `RefPicSetStCurrAfter` with the given value.
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public StdVideoDecodeH265PictureInfo RefPicSetStCurrAfter(long index0, byte value) { RefPicSetStCurrAfter(this.segment(), 0L, index0, value); return this; }

    /// {@return `RefPicSetLtCurr` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment RefPicSetLtCurr(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_RefPicSetLtCurr, index), LAYOUT_RefPicSetLtCurr); }
    /// {@return `RefPicSetLtCurr` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    public static byte RefPicSetLtCurr(MemorySegment segment, long index, long index0) { return (byte) VH_RefPicSetLtCurr.get(segment, 0L, index, index0); }
    /// {@return `RefPicSetLtCurr`}
    public MemorySegment RefPicSetLtCurr() { return RefPicSetLtCurr(this.segment(), 0L); }
    /// {@return `RefPicSetLtCurr`}
    /// @param index0 the Index 0 of the array
    public byte RefPicSetLtCurr(long index0) { return RefPicSetLtCurr(this.segment(), 0L, index0); }
    /// Sets `RefPicSetLtCurr` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void RefPicSetLtCurr(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_RefPicSetLtCurr, index), LAYOUT_RefPicSetLtCurr.byteSize()); }
    /// Sets `RefPicSetLtCurr` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    public static void RefPicSetLtCurr(MemorySegment segment, long index, long index0, byte value) { VH_RefPicSetLtCurr.set(segment, 0L, index, index0, value); }
    /// Sets `RefPicSetLtCurr` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoDecodeH265PictureInfo RefPicSetLtCurr(MemorySegment value) { RefPicSetLtCurr(this.segment(), 0L, value); return this; }
    /// Sets `RefPicSetLtCurr` with the given value.
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public StdVideoDecodeH265PictureInfo RefPicSetLtCurr(long index0, byte value) { RefPicSetLtCurr(this.segment(), 0L, index0, value); return this; }

    /// A buffer of [StdVideoDecodeH265PictureInfo].
    public static final class Buffer extends StdVideoDecodeH265PictureInfo {
        private final long elementCount;

        /// Creates `StdVideoDecodeH265PictureInfo.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `StdVideoDecodeH265PictureInfo`.
        /// @param index the index of the struct buffer
        /// @return the slice of `StdVideoDecodeH265PictureInfo`
        public StdVideoDecodeH265PictureInfo asSlice(long index) { return new StdVideoDecodeH265PictureInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `StdVideoDecodeH265PictureInfo`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `StdVideoDecodeH265PictureInfo`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `flags` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment flagsAt(long index) { return flags(this.segment(), index); }
        /// Sets `flags` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer flagsAt(long index, MemorySegment value) { flags(this.segment(), index, value); return this; }

        /// {@return `sps_video_parameter_set_id` at the given index}
        /// @param index the index of the struct buffer
        public byte sps_video_parameter_set_idAt(long index) { return sps_video_parameter_set_id(this.segment(), index); }
        /// Sets `sps_video_parameter_set_id` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer sps_video_parameter_set_idAt(long index, byte value) { sps_video_parameter_set_id(this.segment(), index, value); return this; }

        /// {@return `pps_seq_parameter_set_id` at the given index}
        /// @param index the index of the struct buffer
        public byte pps_seq_parameter_set_idAt(long index) { return pps_seq_parameter_set_id(this.segment(), index); }
        /// Sets `pps_seq_parameter_set_id` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer pps_seq_parameter_set_idAt(long index, byte value) { pps_seq_parameter_set_id(this.segment(), index, value); return this; }

        /// {@return `pps_pic_parameter_set_id` at the given index}
        /// @param index the index of the struct buffer
        public byte pps_pic_parameter_set_idAt(long index) { return pps_pic_parameter_set_id(this.segment(), index); }
        /// Sets `pps_pic_parameter_set_id` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer pps_pic_parameter_set_idAt(long index, byte value) { pps_pic_parameter_set_id(this.segment(), index, value); return this; }

        /// {@return `NumDeltaPocsOfRefRpsIdx` at the given index}
        /// @param index the index of the struct buffer
        public byte NumDeltaPocsOfRefRpsIdxAt(long index) { return NumDeltaPocsOfRefRpsIdx(this.segment(), index); }
        /// Sets `NumDeltaPocsOfRefRpsIdx` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer NumDeltaPocsOfRefRpsIdxAt(long index, byte value) { NumDeltaPocsOfRefRpsIdx(this.segment(), index, value); return this; }

        /// {@return `PicOrderCntVal` at the given index}
        /// @param index the index of the struct buffer
        public int PicOrderCntValAt(long index) { return PicOrderCntVal(this.segment(), index); }
        /// Sets `PicOrderCntVal` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer PicOrderCntValAt(long index, int value) { PicOrderCntVal(this.segment(), index, value); return this; }

        /// {@return `NumBitsForSTRefPicSetInSlice` at the given index}
        /// @param index the index of the struct buffer
        public short NumBitsForSTRefPicSetInSliceAt(long index) { return NumBitsForSTRefPicSetInSlice(this.segment(), index); }
        /// Sets `NumBitsForSTRefPicSetInSlice` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer NumBitsForSTRefPicSetInSliceAt(long index, short value) { NumBitsForSTRefPicSetInSlice(this.segment(), index, value); return this; }

        /// {@return `reserved` at the given index}
        /// @param index the index of the struct buffer
        public short reservedAt(long index) { return reserved(this.segment(), index); }
        /// Sets `reserved` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer reservedAt(long index, short value) { reserved(this.segment(), index, value); return this; }

        /// {@return `RefPicSetStCurrBefore` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment RefPicSetStCurrBeforeAt(long index) { return RefPicSetStCurrBefore(this.segment(), index); }
        /// {@return `RefPicSetStCurrBefore` at the given index}
        /// @param index the index of the struct buffer
        /// @param index0 the Index 0 of the array
        public byte RefPicSetStCurrBeforeAt(long index, long index0) { return RefPicSetStCurrBefore(this.segment(), index, index0); }
        /// Sets `RefPicSetStCurrBefore` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer RefPicSetStCurrBeforeAt(long index, MemorySegment value) { RefPicSetStCurrBefore(this.segment(), index, value); return this; }
        /// Sets `RefPicSetStCurrBefore` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param index0 the Index 0 of the array
        /// @param value the value
        /// @return `this`
        public Buffer RefPicSetStCurrBeforeAt(long index, long index0, byte value) { RefPicSetStCurrBefore(this.segment(), index, index0, value); return this; }

        /// {@return `RefPicSetStCurrAfter` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment RefPicSetStCurrAfterAt(long index) { return RefPicSetStCurrAfter(this.segment(), index); }
        /// {@return `RefPicSetStCurrAfter` at the given index}
        /// @param index the index of the struct buffer
        /// @param index0 the Index 0 of the array
        public byte RefPicSetStCurrAfterAt(long index, long index0) { return RefPicSetStCurrAfter(this.segment(), index, index0); }
        /// Sets `RefPicSetStCurrAfter` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer RefPicSetStCurrAfterAt(long index, MemorySegment value) { RefPicSetStCurrAfter(this.segment(), index, value); return this; }
        /// Sets `RefPicSetStCurrAfter` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param index0 the Index 0 of the array
        /// @param value the value
        /// @return `this`
        public Buffer RefPicSetStCurrAfterAt(long index, long index0, byte value) { RefPicSetStCurrAfter(this.segment(), index, index0, value); return this; }

        /// {@return `RefPicSetLtCurr` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment RefPicSetLtCurrAt(long index) { return RefPicSetLtCurr(this.segment(), index); }
        /// {@return `RefPicSetLtCurr` at the given index}
        /// @param index the index of the struct buffer
        /// @param index0 the Index 0 of the array
        public byte RefPicSetLtCurrAt(long index, long index0) { return RefPicSetLtCurr(this.segment(), index, index0); }
        /// Sets `RefPicSetLtCurr` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer RefPicSetLtCurrAt(long index, MemorySegment value) { RefPicSetLtCurr(this.segment(), index, value); return this; }
        /// Sets `RefPicSetLtCurr` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param index0 the Index 0 of the array
        /// @param value the value
        /// @return `this`
        public Buffer RefPicSetLtCurrAt(long index, long index0, byte value) { RefPicSetLtCurr(this.segment(), index, index0, value); return this; }

    }
}
