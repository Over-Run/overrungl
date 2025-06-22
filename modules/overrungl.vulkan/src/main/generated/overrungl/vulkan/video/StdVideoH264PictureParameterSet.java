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
import java.util.function.*;

/// ## Layout
/// ```
/// struct StdVideoH264PictureParameterSet {
///     (struct StdVideoH264PpsFlags) StdVideoH264PpsFlags flags;
///     uint8_t seq_parameter_set_id;
///     uint8_t pic_parameter_set_id;
///     uint8_t num_ref_idx_l0_default_active_minus1;
///     uint8_t num_ref_idx_l1_default_active_minus1;
///     (int) StdVideoH264WeightedBipredIdc weighted_bipred_idc;
///     int8_t pic_init_qp_minus26;
///     int8_t pic_init_qs_minus26;
///     int8_t chroma_qp_index_offset;
///     int8_t second_chroma_qp_index_offset;
///     const StdVideoH264ScalingLists* pScalingLists;
/// };
/// ```
public sealed class StdVideoH264PictureParameterSet extends GroupType {
    /// The struct layout of `StdVideoH264PictureParameterSet`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        overrungl.vulkan.video.StdVideoH264PpsFlags.LAYOUT.withName("flags"),
        ValueLayout.JAVA_BYTE.withName("seq_parameter_set_id"),
        ValueLayout.JAVA_BYTE.withName("pic_parameter_set_id"),
        ValueLayout.JAVA_BYTE.withName("num_ref_idx_l0_default_active_minus1"),
        ValueLayout.JAVA_BYTE.withName("num_ref_idx_l1_default_active_minus1"),
        ValueLayout.JAVA_INT.withName("weighted_bipred_idc"),
        ValueLayout.JAVA_BYTE.withName("pic_init_qp_minus26"),
        ValueLayout.JAVA_BYTE.withName("pic_init_qs_minus26"),
        ValueLayout.JAVA_BYTE.withName("chroma_qp_index_offset"),
        ValueLayout.JAVA_BYTE.withName("second_chroma_qp_index_offset"),
        ValueLayout.ADDRESS.withName("pScalingLists")
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
    /// The byte offset of `num_ref_idx_l0_default_active_minus1`.
    public static final long OFFSET_num_ref_idx_l0_default_active_minus1 = LAYOUT.byteOffset(PathElement.groupElement("num_ref_idx_l0_default_active_minus1"));
    /// The memory layout of `num_ref_idx_l0_default_active_minus1`.
    public static final MemoryLayout LAYOUT_num_ref_idx_l0_default_active_minus1 = LAYOUT.select(PathElement.groupElement("num_ref_idx_l0_default_active_minus1"));
    /// The [VarHandle] of `num_ref_idx_l0_default_active_minus1` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_num_ref_idx_l0_default_active_minus1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("num_ref_idx_l0_default_active_minus1"));
    /// The byte offset of `num_ref_idx_l1_default_active_minus1`.
    public static final long OFFSET_num_ref_idx_l1_default_active_minus1 = LAYOUT.byteOffset(PathElement.groupElement("num_ref_idx_l1_default_active_minus1"));
    /// The memory layout of `num_ref_idx_l1_default_active_minus1`.
    public static final MemoryLayout LAYOUT_num_ref_idx_l1_default_active_minus1 = LAYOUT.select(PathElement.groupElement("num_ref_idx_l1_default_active_minus1"));
    /// The [VarHandle] of `num_ref_idx_l1_default_active_minus1` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_num_ref_idx_l1_default_active_minus1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("num_ref_idx_l1_default_active_minus1"));
    /// The byte offset of `weighted_bipred_idc`.
    public static final long OFFSET_weighted_bipred_idc = LAYOUT.byteOffset(PathElement.groupElement("weighted_bipred_idc"));
    /// The memory layout of `weighted_bipred_idc`.
    public static final MemoryLayout LAYOUT_weighted_bipred_idc = LAYOUT.select(PathElement.groupElement("weighted_bipred_idc"));
    /// The [VarHandle] of `weighted_bipred_idc` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_weighted_bipred_idc = LAYOUT.arrayElementVarHandle(PathElement.groupElement("weighted_bipred_idc"));
    /// The byte offset of `pic_init_qp_minus26`.
    public static final long OFFSET_pic_init_qp_minus26 = LAYOUT.byteOffset(PathElement.groupElement("pic_init_qp_minus26"));
    /// The memory layout of `pic_init_qp_minus26`.
    public static final MemoryLayout LAYOUT_pic_init_qp_minus26 = LAYOUT.select(PathElement.groupElement("pic_init_qp_minus26"));
    /// The [VarHandle] of `pic_init_qp_minus26` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pic_init_qp_minus26 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pic_init_qp_minus26"));
    /// The byte offset of `pic_init_qs_minus26`.
    public static final long OFFSET_pic_init_qs_minus26 = LAYOUT.byteOffset(PathElement.groupElement("pic_init_qs_minus26"));
    /// The memory layout of `pic_init_qs_minus26`.
    public static final MemoryLayout LAYOUT_pic_init_qs_minus26 = LAYOUT.select(PathElement.groupElement("pic_init_qs_minus26"));
    /// The [VarHandle] of `pic_init_qs_minus26` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pic_init_qs_minus26 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pic_init_qs_minus26"));
    /// The byte offset of `chroma_qp_index_offset`.
    public static final long OFFSET_chroma_qp_index_offset = LAYOUT.byteOffset(PathElement.groupElement("chroma_qp_index_offset"));
    /// The memory layout of `chroma_qp_index_offset`.
    public static final MemoryLayout LAYOUT_chroma_qp_index_offset = LAYOUT.select(PathElement.groupElement("chroma_qp_index_offset"));
    /// The [VarHandle] of `chroma_qp_index_offset` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_chroma_qp_index_offset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("chroma_qp_index_offset"));
    /// The byte offset of `second_chroma_qp_index_offset`.
    public static final long OFFSET_second_chroma_qp_index_offset = LAYOUT.byteOffset(PathElement.groupElement("second_chroma_qp_index_offset"));
    /// The memory layout of `second_chroma_qp_index_offset`.
    public static final MemoryLayout LAYOUT_second_chroma_qp_index_offset = LAYOUT.select(PathElement.groupElement("second_chroma_qp_index_offset"));
    /// The [VarHandle] of `second_chroma_qp_index_offset` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_second_chroma_qp_index_offset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("second_chroma_qp_index_offset"));
    /// The byte offset of `pScalingLists`.
    public static final long OFFSET_pScalingLists = LAYOUT.byteOffset(PathElement.groupElement("pScalingLists"));
    /// The memory layout of `pScalingLists`.
    public static final MemoryLayout LAYOUT_pScalingLists = LAYOUT.select(PathElement.groupElement("pScalingLists"));
    /// The [VarHandle] of `pScalingLists` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pScalingLists = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pScalingLists"));

    /// Creates `StdVideoH264PictureParameterSet` with the given segment.
    /// @param segment the memory segment
    public StdVideoH264PictureParameterSet(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `StdVideoH264PictureParameterSet` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `StdVideoH264PictureParameterSet` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoH264PictureParameterSet ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoH264PictureParameterSet(segment.reinterpret(LAYOUT.byteSize())); }

    /// Creates `StdVideoH264PictureParameterSet` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `StdVideoH264PictureParameterSet` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoH264PictureParameterSet`
    public static StdVideoH264PictureParameterSet alloc(SegmentAllocator allocator) { return new StdVideoH264PictureParameterSet(allocator.allocate(LAYOUT)); }

    /// Allocates a `StdVideoH264PictureParameterSet` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `StdVideoH264PictureParameterSet`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `StdVideoH264PictureParameterSet` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param flags `flags`
    /// @param seq_parameter_set_id `seq_parameter_set_id`
    /// @param pic_parameter_set_id `pic_parameter_set_id`
    /// @param num_ref_idx_l0_default_active_minus1 `num_ref_idx_l0_default_active_minus1`
    /// @param num_ref_idx_l1_default_active_minus1 `num_ref_idx_l1_default_active_minus1`
    /// @param weighted_bipred_idc `weighted_bipred_idc`
    /// @param pic_init_qp_minus26 `pic_init_qp_minus26`
    /// @param pic_init_qs_minus26 `pic_init_qs_minus26`
    /// @param chroma_qp_index_offset `chroma_qp_index_offset`
    /// @param second_chroma_qp_index_offset `second_chroma_qp_index_offset`
    /// @param pScalingLists `pScalingLists`
    /// @return the allocated `StdVideoH264PictureParameterSet`
    public static StdVideoH264PictureParameterSet allocInit(SegmentAllocator allocator, MemorySegment flags, byte seq_parameter_set_id, byte pic_parameter_set_id, byte num_ref_idx_l0_default_active_minus1, byte num_ref_idx_l1_default_active_minus1, int weighted_bipred_idc, byte pic_init_qp_minus26, byte pic_init_qs_minus26, byte chroma_qp_index_offset, byte second_chroma_qp_index_offset, MemorySegment pScalingLists) {
        return alloc(allocator).flags(flags).seq_parameter_set_id(seq_parameter_set_id).pic_parameter_set_id(pic_parameter_set_id).num_ref_idx_l0_default_active_minus1(num_ref_idx_l0_default_active_minus1).num_ref_idx_l1_default_active_minus1(num_ref_idx_l1_default_active_minus1).weighted_bipred_idc(weighted_bipred_idc).pic_init_qp_minus26(pic_init_qp_minus26).pic_init_qs_minus26(pic_init_qs_minus26).chroma_qp_index_offset(chroma_qp_index_offset).second_chroma_qp_index_offset(second_chroma_qp_index_offset).pScalingLists(pScalingLists);
    }

    /// Allocates a `StdVideoH264PictureParameterSet` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param flags `flags`
    /// @param seq_parameter_set_id `seq_parameter_set_id`
    /// @param pic_parameter_set_id `pic_parameter_set_id`
    /// @param num_ref_idx_l0_default_active_minus1 `num_ref_idx_l0_default_active_minus1`
    /// @param num_ref_idx_l1_default_active_minus1 `num_ref_idx_l1_default_active_minus1`
    /// @param weighted_bipred_idc `weighted_bipred_idc`
    /// @param pic_init_qp_minus26 `pic_init_qp_minus26`
    /// @param pic_init_qs_minus26 `pic_init_qs_minus26`
    /// @param chroma_qp_index_offset `chroma_qp_index_offset`
    /// @param second_chroma_qp_index_offset `second_chroma_qp_index_offset`
    /// @return the allocated `StdVideoH264PictureParameterSet`
    public static StdVideoH264PictureParameterSet allocInit(SegmentAllocator allocator, MemorySegment flags, byte seq_parameter_set_id, byte pic_parameter_set_id, byte num_ref_idx_l0_default_active_minus1, byte num_ref_idx_l1_default_active_minus1, int weighted_bipred_idc, byte pic_init_qp_minus26, byte pic_init_qs_minus26, byte chroma_qp_index_offset, byte second_chroma_qp_index_offset) {
        return alloc(allocator).flags(flags).seq_parameter_set_id(seq_parameter_set_id).pic_parameter_set_id(pic_parameter_set_id).num_ref_idx_l0_default_active_minus1(num_ref_idx_l0_default_active_minus1).num_ref_idx_l1_default_active_minus1(num_ref_idx_l1_default_active_minus1).weighted_bipred_idc(weighted_bipred_idc).pic_init_qp_minus26(pic_init_qp_minus26).pic_init_qs_minus26(pic_init_qs_minus26).chroma_qp_index_offset(chroma_qp_index_offset).second_chroma_qp_index_offset(second_chroma_qp_index_offset);
    }

    /// Allocates a `StdVideoH264PictureParameterSet` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param flags `flags`
    /// @param seq_parameter_set_id `seq_parameter_set_id`
    /// @param pic_parameter_set_id `pic_parameter_set_id`
    /// @param num_ref_idx_l0_default_active_minus1 `num_ref_idx_l0_default_active_minus1`
    /// @param num_ref_idx_l1_default_active_minus1 `num_ref_idx_l1_default_active_minus1`
    /// @param weighted_bipred_idc `weighted_bipred_idc`
    /// @param pic_init_qp_minus26 `pic_init_qp_minus26`
    /// @param pic_init_qs_minus26 `pic_init_qs_minus26`
    /// @param chroma_qp_index_offset `chroma_qp_index_offset`
    /// @return the allocated `StdVideoH264PictureParameterSet`
    public static StdVideoH264PictureParameterSet allocInit(SegmentAllocator allocator, MemorySegment flags, byte seq_parameter_set_id, byte pic_parameter_set_id, byte num_ref_idx_l0_default_active_minus1, byte num_ref_idx_l1_default_active_minus1, int weighted_bipred_idc, byte pic_init_qp_minus26, byte pic_init_qs_minus26, byte chroma_qp_index_offset) {
        return alloc(allocator).flags(flags).seq_parameter_set_id(seq_parameter_set_id).pic_parameter_set_id(pic_parameter_set_id).num_ref_idx_l0_default_active_minus1(num_ref_idx_l0_default_active_minus1).num_ref_idx_l1_default_active_minus1(num_ref_idx_l1_default_active_minus1).weighted_bipred_idc(weighted_bipred_idc).pic_init_qp_minus26(pic_init_qp_minus26).pic_init_qs_minus26(pic_init_qs_minus26).chroma_qp_index_offset(chroma_qp_index_offset);
    }

    /// Allocates a `StdVideoH264PictureParameterSet` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param flags `flags`
    /// @param seq_parameter_set_id `seq_parameter_set_id`
    /// @param pic_parameter_set_id `pic_parameter_set_id`
    /// @param num_ref_idx_l0_default_active_minus1 `num_ref_idx_l0_default_active_minus1`
    /// @param num_ref_idx_l1_default_active_minus1 `num_ref_idx_l1_default_active_minus1`
    /// @param weighted_bipred_idc `weighted_bipred_idc`
    /// @param pic_init_qp_minus26 `pic_init_qp_minus26`
    /// @param pic_init_qs_minus26 `pic_init_qs_minus26`
    /// @return the allocated `StdVideoH264PictureParameterSet`
    public static StdVideoH264PictureParameterSet allocInit(SegmentAllocator allocator, MemorySegment flags, byte seq_parameter_set_id, byte pic_parameter_set_id, byte num_ref_idx_l0_default_active_minus1, byte num_ref_idx_l1_default_active_minus1, int weighted_bipred_idc, byte pic_init_qp_minus26, byte pic_init_qs_minus26) {
        return alloc(allocator).flags(flags).seq_parameter_set_id(seq_parameter_set_id).pic_parameter_set_id(pic_parameter_set_id).num_ref_idx_l0_default_active_minus1(num_ref_idx_l0_default_active_minus1).num_ref_idx_l1_default_active_minus1(num_ref_idx_l1_default_active_minus1).weighted_bipred_idc(weighted_bipred_idc).pic_init_qp_minus26(pic_init_qp_minus26).pic_init_qs_minus26(pic_init_qs_minus26);
    }

    /// Allocates a `StdVideoH264PictureParameterSet` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param flags `flags`
    /// @param seq_parameter_set_id `seq_parameter_set_id`
    /// @param pic_parameter_set_id `pic_parameter_set_id`
    /// @param num_ref_idx_l0_default_active_minus1 `num_ref_idx_l0_default_active_minus1`
    /// @param num_ref_idx_l1_default_active_minus1 `num_ref_idx_l1_default_active_minus1`
    /// @param weighted_bipred_idc `weighted_bipred_idc`
    /// @param pic_init_qp_minus26 `pic_init_qp_minus26`
    /// @return the allocated `StdVideoH264PictureParameterSet`
    public static StdVideoH264PictureParameterSet allocInit(SegmentAllocator allocator, MemorySegment flags, byte seq_parameter_set_id, byte pic_parameter_set_id, byte num_ref_idx_l0_default_active_minus1, byte num_ref_idx_l1_default_active_minus1, int weighted_bipred_idc, byte pic_init_qp_minus26) {
        return alloc(allocator).flags(flags).seq_parameter_set_id(seq_parameter_set_id).pic_parameter_set_id(pic_parameter_set_id).num_ref_idx_l0_default_active_minus1(num_ref_idx_l0_default_active_minus1).num_ref_idx_l1_default_active_minus1(num_ref_idx_l1_default_active_minus1).weighted_bipred_idc(weighted_bipred_idc).pic_init_qp_minus26(pic_init_qp_minus26);
    }

    /// Allocates a `StdVideoH264PictureParameterSet` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param flags `flags`
    /// @param seq_parameter_set_id `seq_parameter_set_id`
    /// @param pic_parameter_set_id `pic_parameter_set_id`
    /// @param num_ref_idx_l0_default_active_minus1 `num_ref_idx_l0_default_active_minus1`
    /// @param num_ref_idx_l1_default_active_minus1 `num_ref_idx_l1_default_active_minus1`
    /// @param weighted_bipred_idc `weighted_bipred_idc`
    /// @return the allocated `StdVideoH264PictureParameterSet`
    public static StdVideoH264PictureParameterSet allocInit(SegmentAllocator allocator, MemorySegment flags, byte seq_parameter_set_id, byte pic_parameter_set_id, byte num_ref_idx_l0_default_active_minus1, byte num_ref_idx_l1_default_active_minus1, int weighted_bipred_idc) {
        return alloc(allocator).flags(flags).seq_parameter_set_id(seq_parameter_set_id).pic_parameter_set_id(pic_parameter_set_id).num_ref_idx_l0_default_active_minus1(num_ref_idx_l0_default_active_minus1).num_ref_idx_l1_default_active_minus1(num_ref_idx_l1_default_active_minus1).weighted_bipred_idc(weighted_bipred_idc);
    }

    /// Allocates a `StdVideoH264PictureParameterSet` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param flags `flags`
    /// @param seq_parameter_set_id `seq_parameter_set_id`
    /// @param pic_parameter_set_id `pic_parameter_set_id`
    /// @param num_ref_idx_l0_default_active_minus1 `num_ref_idx_l0_default_active_minus1`
    /// @param num_ref_idx_l1_default_active_minus1 `num_ref_idx_l1_default_active_minus1`
    /// @return the allocated `StdVideoH264PictureParameterSet`
    public static StdVideoH264PictureParameterSet allocInit(SegmentAllocator allocator, MemorySegment flags, byte seq_parameter_set_id, byte pic_parameter_set_id, byte num_ref_idx_l0_default_active_minus1, byte num_ref_idx_l1_default_active_minus1) {
        return alloc(allocator).flags(flags).seq_parameter_set_id(seq_parameter_set_id).pic_parameter_set_id(pic_parameter_set_id).num_ref_idx_l0_default_active_minus1(num_ref_idx_l0_default_active_minus1).num_ref_idx_l1_default_active_minus1(num_ref_idx_l1_default_active_minus1);
    }

    /// Allocates a `StdVideoH264PictureParameterSet` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param flags `flags`
    /// @param seq_parameter_set_id `seq_parameter_set_id`
    /// @param pic_parameter_set_id `pic_parameter_set_id`
    /// @param num_ref_idx_l0_default_active_minus1 `num_ref_idx_l0_default_active_minus1`
    /// @return the allocated `StdVideoH264PictureParameterSet`
    public static StdVideoH264PictureParameterSet allocInit(SegmentAllocator allocator, MemorySegment flags, byte seq_parameter_set_id, byte pic_parameter_set_id, byte num_ref_idx_l0_default_active_minus1) {
        return alloc(allocator).flags(flags).seq_parameter_set_id(seq_parameter_set_id).pic_parameter_set_id(pic_parameter_set_id).num_ref_idx_l0_default_active_minus1(num_ref_idx_l0_default_active_minus1);
    }

    /// Allocates a `StdVideoH264PictureParameterSet` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param flags `flags`
    /// @param seq_parameter_set_id `seq_parameter_set_id`
    /// @param pic_parameter_set_id `pic_parameter_set_id`
    /// @return the allocated `StdVideoH264PictureParameterSet`
    public static StdVideoH264PictureParameterSet allocInit(SegmentAllocator allocator, MemorySegment flags, byte seq_parameter_set_id, byte pic_parameter_set_id) {
        return alloc(allocator).flags(flags).seq_parameter_set_id(seq_parameter_set_id).pic_parameter_set_id(pic_parameter_set_id);
    }

    /// Allocates a `StdVideoH264PictureParameterSet` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param flags `flags`
    /// @param seq_parameter_set_id `seq_parameter_set_id`
    /// @return the allocated `StdVideoH264PictureParameterSet`
    public static StdVideoH264PictureParameterSet allocInit(SegmentAllocator allocator, MemorySegment flags, byte seq_parameter_set_id) {
        return alloc(allocator).flags(flags).seq_parameter_set_id(seq_parameter_set_id);
    }

    /// Allocates a `StdVideoH264PictureParameterSet` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param flags `flags`
    /// @return the allocated `StdVideoH264PictureParameterSet`
    public static StdVideoH264PictureParameterSet allocInit(SegmentAllocator allocator, MemorySegment flags) {
        return alloc(allocator).flags(flags);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public StdVideoH264PictureParameterSet copyFrom(StdVideoH264PictureParameterSet src) { this.segment().copyFrom(src.segment()); return this; }

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
    public StdVideoH264PictureParameterSet flags(MemorySegment value) { flags(this.segment(), 0L, value); return this; }
    /// Accepts `flags` with the given function.
    /// @param func the function
    /// @return `this`
    public StdVideoH264PictureParameterSet flags(Consumer<overrungl.vulkan.video.StdVideoH264PpsFlags> func) { func.accept(overrungl.vulkan.video.StdVideoH264PpsFlags.of(flags())); return this; }

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
    public StdVideoH264PictureParameterSet seq_parameter_set_id(byte value) { seq_parameter_set_id(this.segment(), 0L, value); return this; }

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
    public StdVideoH264PictureParameterSet pic_parameter_set_id(byte value) { pic_parameter_set_id(this.segment(), 0L, value); return this; }

    /// {@return `num_ref_idx_l0_default_active_minus1` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte num_ref_idx_l0_default_active_minus1(MemorySegment segment, long index) { return (byte) VH_num_ref_idx_l0_default_active_minus1.get(segment, 0L, index); }
    /// {@return `num_ref_idx_l0_default_active_minus1`}
    public byte num_ref_idx_l0_default_active_minus1() { return num_ref_idx_l0_default_active_minus1(this.segment(), 0L); }
    /// Sets `num_ref_idx_l0_default_active_minus1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void num_ref_idx_l0_default_active_minus1(MemorySegment segment, long index, byte value) { VH_num_ref_idx_l0_default_active_minus1.set(segment, 0L, index, value); }
    /// Sets `num_ref_idx_l0_default_active_minus1` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH264PictureParameterSet num_ref_idx_l0_default_active_minus1(byte value) { num_ref_idx_l0_default_active_minus1(this.segment(), 0L, value); return this; }

    /// {@return `num_ref_idx_l1_default_active_minus1` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte num_ref_idx_l1_default_active_minus1(MemorySegment segment, long index) { return (byte) VH_num_ref_idx_l1_default_active_minus1.get(segment, 0L, index); }
    /// {@return `num_ref_idx_l1_default_active_minus1`}
    public byte num_ref_idx_l1_default_active_minus1() { return num_ref_idx_l1_default_active_minus1(this.segment(), 0L); }
    /// Sets `num_ref_idx_l1_default_active_minus1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void num_ref_idx_l1_default_active_minus1(MemorySegment segment, long index, byte value) { VH_num_ref_idx_l1_default_active_minus1.set(segment, 0L, index, value); }
    /// Sets `num_ref_idx_l1_default_active_minus1` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH264PictureParameterSet num_ref_idx_l1_default_active_minus1(byte value) { num_ref_idx_l1_default_active_minus1(this.segment(), 0L, value); return this; }

    /// {@return `weighted_bipred_idc` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int weighted_bipred_idc(MemorySegment segment, long index) { return (int) VH_weighted_bipred_idc.get(segment, 0L, index); }
    /// {@return `weighted_bipred_idc`}
    public int weighted_bipred_idc() { return weighted_bipred_idc(this.segment(), 0L); }
    /// Sets `weighted_bipred_idc` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void weighted_bipred_idc(MemorySegment segment, long index, int value) { VH_weighted_bipred_idc.set(segment, 0L, index, value); }
    /// Sets `weighted_bipred_idc` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH264PictureParameterSet weighted_bipred_idc(int value) { weighted_bipred_idc(this.segment(), 0L, value); return this; }

    /// {@return `pic_init_qp_minus26` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte pic_init_qp_minus26(MemorySegment segment, long index) { return (byte) VH_pic_init_qp_minus26.get(segment, 0L, index); }
    /// {@return `pic_init_qp_minus26`}
    public byte pic_init_qp_minus26() { return pic_init_qp_minus26(this.segment(), 0L); }
    /// Sets `pic_init_qp_minus26` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pic_init_qp_minus26(MemorySegment segment, long index, byte value) { VH_pic_init_qp_minus26.set(segment, 0L, index, value); }
    /// Sets `pic_init_qp_minus26` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH264PictureParameterSet pic_init_qp_minus26(byte value) { pic_init_qp_minus26(this.segment(), 0L, value); return this; }

    /// {@return `pic_init_qs_minus26` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte pic_init_qs_minus26(MemorySegment segment, long index) { return (byte) VH_pic_init_qs_minus26.get(segment, 0L, index); }
    /// {@return `pic_init_qs_minus26`}
    public byte pic_init_qs_minus26() { return pic_init_qs_minus26(this.segment(), 0L); }
    /// Sets `pic_init_qs_minus26` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pic_init_qs_minus26(MemorySegment segment, long index, byte value) { VH_pic_init_qs_minus26.set(segment, 0L, index, value); }
    /// Sets `pic_init_qs_minus26` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH264PictureParameterSet pic_init_qs_minus26(byte value) { pic_init_qs_minus26(this.segment(), 0L, value); return this; }

    /// {@return `chroma_qp_index_offset` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte chroma_qp_index_offset(MemorySegment segment, long index) { return (byte) VH_chroma_qp_index_offset.get(segment, 0L, index); }
    /// {@return `chroma_qp_index_offset`}
    public byte chroma_qp_index_offset() { return chroma_qp_index_offset(this.segment(), 0L); }
    /// Sets `chroma_qp_index_offset` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void chroma_qp_index_offset(MemorySegment segment, long index, byte value) { VH_chroma_qp_index_offset.set(segment, 0L, index, value); }
    /// Sets `chroma_qp_index_offset` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH264PictureParameterSet chroma_qp_index_offset(byte value) { chroma_qp_index_offset(this.segment(), 0L, value); return this; }

    /// {@return `second_chroma_qp_index_offset` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte second_chroma_qp_index_offset(MemorySegment segment, long index) { return (byte) VH_second_chroma_qp_index_offset.get(segment, 0L, index); }
    /// {@return `second_chroma_qp_index_offset`}
    public byte second_chroma_qp_index_offset() { return second_chroma_qp_index_offset(this.segment(), 0L); }
    /// Sets `second_chroma_qp_index_offset` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void second_chroma_qp_index_offset(MemorySegment segment, long index, byte value) { VH_second_chroma_qp_index_offset.set(segment, 0L, index, value); }
    /// Sets `second_chroma_qp_index_offset` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH264PictureParameterSet second_chroma_qp_index_offset(byte value) { second_chroma_qp_index_offset(this.segment(), 0L, value); return this; }

    /// {@return `pScalingLists` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pScalingLists(MemorySegment segment, long index) { return (MemorySegment) VH_pScalingLists.get(segment, 0L, index); }
    /// {@return `pScalingLists`}
    public MemorySegment pScalingLists() { return pScalingLists(this.segment(), 0L); }
    /// Sets `pScalingLists` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pScalingLists(MemorySegment segment, long index, MemorySegment value) { VH_pScalingLists.set(segment, 0L, index, value); }
    /// Sets `pScalingLists` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH264PictureParameterSet pScalingLists(MemorySegment value) { pScalingLists(this.segment(), 0L, value); return this; }

    /// A buffer of [StdVideoH264PictureParameterSet].
    public static final class Buffer extends StdVideoH264PictureParameterSet {
        private final long elementCount;

        /// Creates `StdVideoH264PictureParameterSet.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `StdVideoH264PictureParameterSet`.
        /// @param index the index of the struct buffer
        /// @return the slice of `StdVideoH264PictureParameterSet`
        public StdVideoH264PictureParameterSet asSlice(long index) { return new StdVideoH264PictureParameterSet(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `StdVideoH264PictureParameterSet`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `StdVideoH264PictureParameterSet`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `flags` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment flagsAt(long index) { return flags(this.segment(), index); }
        /// Sets `flags` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer flagsAt(long index, MemorySegment value) { flags(this.segment(), index, value); return this; }
        /// Accepts `flags` with the given function.
        /// @param index the index of the struct buffer
        /// @param func the function
        /// @return `this`
        public Buffer flagsAt(long index, Consumer<overrungl.vulkan.video.StdVideoH264PpsFlags> func) { func.accept(overrungl.vulkan.video.StdVideoH264PpsFlags.of(flagsAt(index))); return this; }

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

        /// {@return `num_ref_idx_l0_default_active_minus1` at the given index}
        /// @param index the index of the struct buffer
        public byte num_ref_idx_l0_default_active_minus1At(long index) { return num_ref_idx_l0_default_active_minus1(this.segment(), index); }
        /// Sets `num_ref_idx_l0_default_active_minus1` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer num_ref_idx_l0_default_active_minus1At(long index, byte value) { num_ref_idx_l0_default_active_minus1(this.segment(), index, value); return this; }

        /// {@return `num_ref_idx_l1_default_active_minus1` at the given index}
        /// @param index the index of the struct buffer
        public byte num_ref_idx_l1_default_active_minus1At(long index) { return num_ref_idx_l1_default_active_minus1(this.segment(), index); }
        /// Sets `num_ref_idx_l1_default_active_minus1` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer num_ref_idx_l1_default_active_minus1At(long index, byte value) { num_ref_idx_l1_default_active_minus1(this.segment(), index, value); return this; }

        /// {@return `weighted_bipred_idc` at the given index}
        /// @param index the index of the struct buffer
        public int weighted_bipred_idcAt(long index) { return weighted_bipred_idc(this.segment(), index); }
        /// Sets `weighted_bipred_idc` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer weighted_bipred_idcAt(long index, int value) { weighted_bipred_idc(this.segment(), index, value); return this; }

        /// {@return `pic_init_qp_minus26` at the given index}
        /// @param index the index of the struct buffer
        public byte pic_init_qp_minus26At(long index) { return pic_init_qp_minus26(this.segment(), index); }
        /// Sets `pic_init_qp_minus26` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer pic_init_qp_minus26At(long index, byte value) { pic_init_qp_minus26(this.segment(), index, value); return this; }

        /// {@return `pic_init_qs_minus26` at the given index}
        /// @param index the index of the struct buffer
        public byte pic_init_qs_minus26At(long index) { return pic_init_qs_minus26(this.segment(), index); }
        /// Sets `pic_init_qs_minus26` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer pic_init_qs_minus26At(long index, byte value) { pic_init_qs_minus26(this.segment(), index, value); return this; }

        /// {@return `chroma_qp_index_offset` at the given index}
        /// @param index the index of the struct buffer
        public byte chroma_qp_index_offsetAt(long index) { return chroma_qp_index_offset(this.segment(), index); }
        /// Sets `chroma_qp_index_offset` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer chroma_qp_index_offsetAt(long index, byte value) { chroma_qp_index_offset(this.segment(), index, value); return this; }

        /// {@return `second_chroma_qp_index_offset` at the given index}
        /// @param index the index of the struct buffer
        public byte second_chroma_qp_index_offsetAt(long index) { return second_chroma_qp_index_offset(this.segment(), index); }
        /// Sets `second_chroma_qp_index_offset` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer second_chroma_qp_index_offsetAt(long index, byte value) { second_chroma_qp_index_offset(this.segment(), index, value); return this; }

        /// {@return `pScalingLists` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment pScalingListsAt(long index) { return pScalingLists(this.segment(), index); }
        /// Sets `pScalingLists` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer pScalingListsAt(long index, MemorySegment value) { pScalingLists(this.segment(), index, value); return this; }

    }
}
