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
import java.util.function.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct StdVideoEncodeH265PictureInfo {
///     (struct StdVideoEncodeH265PictureInfoFlags) StdVideoEncodeH265PictureInfoFlags flags;
///     (int) StdVideoH265PictureType pic_type;
///     uint8_t sps_video_parameter_set_id;
///     uint8_t pps_seq_parameter_set_id;
///     uint8_t pps_pic_parameter_set_id;
///     uint8_t short_term_ref_pic_set_idx;
///     int32_t PicOrderCntVal;
///     uint8_t TemporalId;
///     uint8_t reserved1[7];
///     const StdVideoEncodeH265ReferenceListsInfo* pRefLists;
///     const StdVideoH265ShortTermRefPicSet* pShortTermRefPicSet;
///     const StdVideoEncodeH265LongTermRefPics* pLongTermRefPics;
/// };
/// ```
public final class StdVideoEncodeH265PictureInfo extends GroupType {
    /// The struct layout of `StdVideoEncodeH265PictureInfo`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        overrungl.vulkan.video.StdVideoEncodeH265PictureInfoFlags.LAYOUT.withName("flags"),
        ValueLayout.JAVA_INT.withName("pic_type"),
        ValueLayout.JAVA_BYTE.withName("sps_video_parameter_set_id"),
        ValueLayout.JAVA_BYTE.withName("pps_seq_parameter_set_id"),
        ValueLayout.JAVA_BYTE.withName("pps_pic_parameter_set_id"),
        ValueLayout.JAVA_BYTE.withName("short_term_ref_pic_set_idx"),
        ValueLayout.JAVA_INT.withName("PicOrderCntVal"),
        ValueLayout.JAVA_BYTE.withName("TemporalId"),
        MemoryLayout.sequenceLayout(7, ValueLayout.JAVA_BYTE).withName("reserved1"),
        ValueLayout.ADDRESS.withName("pRefLists"),
        ValueLayout.ADDRESS.withName("pShortTermRefPicSet"),
        ValueLayout.ADDRESS.withName("pLongTermRefPics")
    );
    /// The byte offset of `flags`.
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    /// The memory layout of `flags`.
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    /// The byte offset of `pic_type`.
    public static final long OFFSET_pic_type = LAYOUT.byteOffset(PathElement.groupElement("pic_type"));
    /// The memory layout of `pic_type`.
    public static final MemoryLayout LAYOUT_pic_type = LAYOUT.select(PathElement.groupElement("pic_type"));
    /// The [VarHandle] of `pic_type` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pic_type = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pic_type"));
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
    /// The byte offset of `short_term_ref_pic_set_idx`.
    public static final long OFFSET_short_term_ref_pic_set_idx = LAYOUT.byteOffset(PathElement.groupElement("short_term_ref_pic_set_idx"));
    /// The memory layout of `short_term_ref_pic_set_idx`.
    public static final MemoryLayout LAYOUT_short_term_ref_pic_set_idx = LAYOUT.select(PathElement.groupElement("short_term_ref_pic_set_idx"));
    /// The [VarHandle] of `short_term_ref_pic_set_idx` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_short_term_ref_pic_set_idx = LAYOUT.arrayElementVarHandle(PathElement.groupElement("short_term_ref_pic_set_idx"));
    /// The byte offset of `PicOrderCntVal`.
    public static final long OFFSET_PicOrderCntVal = LAYOUT.byteOffset(PathElement.groupElement("PicOrderCntVal"));
    /// The memory layout of `PicOrderCntVal`.
    public static final MemoryLayout LAYOUT_PicOrderCntVal = LAYOUT.select(PathElement.groupElement("PicOrderCntVal"));
    /// The [VarHandle] of `PicOrderCntVal` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_PicOrderCntVal = LAYOUT.arrayElementVarHandle(PathElement.groupElement("PicOrderCntVal"));
    /// The byte offset of `TemporalId`.
    public static final long OFFSET_TemporalId = LAYOUT.byteOffset(PathElement.groupElement("TemporalId"));
    /// The memory layout of `TemporalId`.
    public static final MemoryLayout LAYOUT_TemporalId = LAYOUT.select(PathElement.groupElement("TemporalId"));
    /// The [VarHandle] of `TemporalId` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_TemporalId = LAYOUT.arrayElementVarHandle(PathElement.groupElement("TemporalId"));
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
    /// The byte offset of `pShortTermRefPicSet`.
    public static final long OFFSET_pShortTermRefPicSet = LAYOUT.byteOffset(PathElement.groupElement("pShortTermRefPicSet"));
    /// The memory layout of `pShortTermRefPicSet`.
    public static final MemoryLayout LAYOUT_pShortTermRefPicSet = LAYOUT.select(PathElement.groupElement("pShortTermRefPicSet"));
    /// The [VarHandle] of `pShortTermRefPicSet` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pShortTermRefPicSet = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pShortTermRefPicSet"));
    /// The byte offset of `pLongTermRefPics`.
    public static final long OFFSET_pLongTermRefPics = LAYOUT.byteOffset(PathElement.groupElement("pLongTermRefPics"));
    /// The memory layout of `pLongTermRefPics`.
    public static final MemoryLayout LAYOUT_pLongTermRefPics = LAYOUT.select(PathElement.groupElement("pLongTermRefPics"));
    /// The [VarHandle] of `pLongTermRefPics` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pLongTermRefPics = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pLongTermRefPics"));

    /// Creates `StdVideoEncodeH265PictureInfo` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public StdVideoEncodeH265PictureInfo(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `StdVideoEncodeH265PictureInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoEncodeH265PictureInfo of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoEncodeH265PictureInfo(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `StdVideoEncodeH265PictureInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoEncodeH265PictureInfo ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoEncodeH265PictureInfo(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `StdVideoEncodeH265PictureInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoEncodeH265PictureInfo ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoEncodeH265PictureInfo(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `StdVideoEncodeH265PictureInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoEncodeH265PictureInfo`
    public static StdVideoEncodeH265PictureInfo alloc(SegmentAllocator allocator) { return new StdVideoEncodeH265PictureInfo(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `StdVideoEncodeH265PictureInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `StdVideoEncodeH265PictureInfo`
    public static StdVideoEncodeH265PictureInfo alloc(SegmentAllocator allocator, long count) { return new StdVideoEncodeH265PictureInfo(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public StdVideoEncodeH265PictureInfo copyFrom(StdVideoEncodeH265PictureInfo src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public StdVideoEncodeH265PictureInfo reinterpret(long count) { return new StdVideoEncodeH265PictureInfo(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public StdVideoEncodeH265PictureInfo flags(MemorySegment value) { flags(this.segment(), 0L, value); return this; }
    /// Accepts `flags` with the given function.
    /// @param func the function
    /// @return `this`
    public StdVideoEncodeH265PictureInfo flags(Consumer<overrungl.vulkan.video.StdVideoEncodeH265PictureInfoFlags> func) { func.accept(overrungl.vulkan.video.StdVideoEncodeH265PictureInfoFlags.of(flags())); return this; }

    /// {@return `pic_type` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int pic_type(MemorySegment segment, long index) { return (int) VH_pic_type.get(segment, 0L, index); }
    /// {@return `pic_type`}
    public int pic_type() { return pic_type(this.segment(), 0L); }
    /// Sets `pic_type` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pic_type(MemorySegment segment, long index, int value) { VH_pic_type.set(segment, 0L, index, value); }
    /// Sets `pic_type` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265PictureInfo pic_type(int value) { pic_type(this.segment(), 0L, value); return this; }

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
    public StdVideoEncodeH265PictureInfo sps_video_parameter_set_id(byte value) { sps_video_parameter_set_id(this.segment(), 0L, value); return this; }

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
    public StdVideoEncodeH265PictureInfo pps_seq_parameter_set_id(byte value) { pps_seq_parameter_set_id(this.segment(), 0L, value); return this; }

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
    public StdVideoEncodeH265PictureInfo pps_pic_parameter_set_id(byte value) { pps_pic_parameter_set_id(this.segment(), 0L, value); return this; }

    /// {@return `short_term_ref_pic_set_idx` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte short_term_ref_pic_set_idx(MemorySegment segment, long index) { return (byte) VH_short_term_ref_pic_set_idx.get(segment, 0L, index); }
    /// {@return `short_term_ref_pic_set_idx`}
    public byte short_term_ref_pic_set_idx() { return short_term_ref_pic_set_idx(this.segment(), 0L); }
    /// Sets `short_term_ref_pic_set_idx` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void short_term_ref_pic_set_idx(MemorySegment segment, long index, byte value) { VH_short_term_ref_pic_set_idx.set(segment, 0L, index, value); }
    /// Sets `short_term_ref_pic_set_idx` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265PictureInfo short_term_ref_pic_set_idx(byte value) { short_term_ref_pic_set_idx(this.segment(), 0L, value); return this; }

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
    public StdVideoEncodeH265PictureInfo PicOrderCntVal(int value) { PicOrderCntVal(this.segment(), 0L, value); return this; }

    /// {@return `TemporalId` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte TemporalId(MemorySegment segment, long index) { return (byte) VH_TemporalId.get(segment, 0L, index); }
    /// {@return `TemporalId`}
    public byte TemporalId() { return TemporalId(this.segment(), 0L); }
    /// Sets `TemporalId` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void TemporalId(MemorySegment segment, long index, byte value) { VH_TemporalId.set(segment, 0L, index, value); }
    /// Sets `TemporalId` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265PictureInfo TemporalId(byte value) { TemporalId(this.segment(), 0L, value); return this; }

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
    public StdVideoEncodeH265PictureInfo reserved1(MemorySegment value) { reserved1(this.segment(), 0L, value); return this; }
    /// Sets `reserved1` with the given value.
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265PictureInfo reserved1(long index0, byte value) { reserved1(this.segment(), 0L, index0, value); return this; }

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
    public StdVideoEncodeH265PictureInfo pRefLists(MemorySegment value) { pRefLists(this.segment(), 0L, value); return this; }

    /// {@return `pShortTermRefPicSet` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pShortTermRefPicSet(MemorySegment segment, long index) { return (MemorySegment) VH_pShortTermRefPicSet.get(segment, 0L, index); }
    /// {@return `pShortTermRefPicSet`}
    public MemorySegment pShortTermRefPicSet() { return pShortTermRefPicSet(this.segment(), 0L); }
    /// Sets `pShortTermRefPicSet` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pShortTermRefPicSet(MemorySegment segment, long index, MemorySegment value) { VH_pShortTermRefPicSet.set(segment, 0L, index, value); }
    /// Sets `pShortTermRefPicSet` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265PictureInfo pShortTermRefPicSet(MemorySegment value) { pShortTermRefPicSet(this.segment(), 0L, value); return this; }

    /// {@return `pLongTermRefPics` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pLongTermRefPics(MemorySegment segment, long index) { return (MemorySegment) VH_pLongTermRefPics.get(segment, 0L, index); }
    /// {@return `pLongTermRefPics`}
    public MemorySegment pLongTermRefPics() { return pLongTermRefPics(this.segment(), 0L); }
    /// Sets `pLongTermRefPics` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pLongTermRefPics(MemorySegment segment, long index, MemorySegment value) { VH_pLongTermRefPics.set(segment, 0L, index, value); }
    /// Sets `pLongTermRefPics` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265PictureInfo pLongTermRefPics(MemorySegment value) { pLongTermRefPics(this.segment(), 0L, value); return this; }

    /// Creates a slice of `StdVideoEncodeH265PictureInfo`.
    /// @param index the index of the struct buffer
    /// @return the slice of `StdVideoEncodeH265PictureInfo`
    public StdVideoEncodeH265PictureInfo asSlice(long index) { return new StdVideoEncodeH265PictureInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `StdVideoEncodeH265PictureInfo`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `StdVideoEncodeH265PictureInfo`
    public StdVideoEncodeH265PictureInfo asSlice(long index, long count) { return new StdVideoEncodeH265PictureInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `StdVideoEncodeH265PictureInfo` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public StdVideoEncodeH265PictureInfo at(long index, Consumer<StdVideoEncodeH265PictureInfo> func) { func.accept(asSlice(index)); return this; }

    /// {@return `flags` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment flagsAt(long index) { return flags(this.segment(), index); }
    /// Sets `flags` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265PictureInfo flagsAt(long index, MemorySegment value) { flags(this.segment(), index, value); return this; }
    /// Accepts `flags` with the given function.
    /// @param index the index of the struct buffer
    /// @param func the function
    /// @return `this`
    public StdVideoEncodeH265PictureInfo flagsAt(long index, Consumer<overrungl.vulkan.video.StdVideoEncodeH265PictureInfoFlags> func) { func.accept(overrungl.vulkan.video.StdVideoEncodeH265PictureInfoFlags.of(flagsAt(index))); return this; }

    /// {@return `pic_type` at the given index}
    /// @param index the index of the struct buffer
    public int pic_typeAt(long index) { return pic_type(this.segment(), index); }
    /// Sets `pic_type` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265PictureInfo pic_typeAt(long index, int value) { pic_type(this.segment(), index, value); return this; }

    /// {@return `sps_video_parameter_set_id` at the given index}
    /// @param index the index of the struct buffer
    public byte sps_video_parameter_set_idAt(long index) { return sps_video_parameter_set_id(this.segment(), index); }
    /// Sets `sps_video_parameter_set_id` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265PictureInfo sps_video_parameter_set_idAt(long index, byte value) { sps_video_parameter_set_id(this.segment(), index, value); return this; }

    /// {@return `pps_seq_parameter_set_id` at the given index}
    /// @param index the index of the struct buffer
    public byte pps_seq_parameter_set_idAt(long index) { return pps_seq_parameter_set_id(this.segment(), index); }
    /// Sets `pps_seq_parameter_set_id` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265PictureInfo pps_seq_parameter_set_idAt(long index, byte value) { pps_seq_parameter_set_id(this.segment(), index, value); return this; }

    /// {@return `pps_pic_parameter_set_id` at the given index}
    /// @param index the index of the struct buffer
    public byte pps_pic_parameter_set_idAt(long index) { return pps_pic_parameter_set_id(this.segment(), index); }
    /// Sets `pps_pic_parameter_set_id` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265PictureInfo pps_pic_parameter_set_idAt(long index, byte value) { pps_pic_parameter_set_id(this.segment(), index, value); return this; }

    /// {@return `short_term_ref_pic_set_idx` at the given index}
    /// @param index the index of the struct buffer
    public byte short_term_ref_pic_set_idxAt(long index) { return short_term_ref_pic_set_idx(this.segment(), index); }
    /// Sets `short_term_ref_pic_set_idx` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265PictureInfo short_term_ref_pic_set_idxAt(long index, byte value) { short_term_ref_pic_set_idx(this.segment(), index, value); return this; }

    /// {@return `PicOrderCntVal` at the given index}
    /// @param index the index of the struct buffer
    public int PicOrderCntValAt(long index) { return PicOrderCntVal(this.segment(), index); }
    /// Sets `PicOrderCntVal` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265PictureInfo PicOrderCntValAt(long index, int value) { PicOrderCntVal(this.segment(), index, value); return this; }

    /// {@return `TemporalId` at the given index}
    /// @param index the index of the struct buffer
    public byte TemporalIdAt(long index) { return TemporalId(this.segment(), index); }
    /// Sets `TemporalId` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265PictureInfo TemporalIdAt(long index, byte value) { TemporalId(this.segment(), index, value); return this; }

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
    public StdVideoEncodeH265PictureInfo reserved1At(long index, MemorySegment value) { reserved1(this.segment(), index, value); return this; }
    /// Sets `reserved1` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265PictureInfo reserved1At(long index, long index0, byte value) { reserved1(this.segment(), index, index0, value); return this; }

    /// {@return `pRefLists` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pRefListsAt(long index) { return pRefLists(this.segment(), index); }
    /// Sets `pRefLists` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265PictureInfo pRefListsAt(long index, MemorySegment value) { pRefLists(this.segment(), index, value); return this; }

    /// {@return `pShortTermRefPicSet` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pShortTermRefPicSetAt(long index) { return pShortTermRefPicSet(this.segment(), index); }
    /// Sets `pShortTermRefPicSet` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265PictureInfo pShortTermRefPicSetAt(long index, MemorySegment value) { pShortTermRefPicSet(this.segment(), index, value); return this; }

    /// {@return `pLongTermRefPics` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pLongTermRefPicsAt(long index) { return pLongTermRefPics(this.segment(), index); }
    /// Sets `pLongTermRefPics` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265PictureInfo pLongTermRefPicsAt(long index, MemorySegment value) { pLongTermRefPics(this.segment(), index, value); return this; }

}
