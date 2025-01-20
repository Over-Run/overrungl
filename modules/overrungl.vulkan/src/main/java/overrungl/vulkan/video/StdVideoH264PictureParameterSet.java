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
/// ### flags
/// [VarHandle][#VH_flags] - [Getter][#flags()] - [Setter][#flags(MemorySegment)]
/// ### seq_parameter_set_id
/// [VarHandle][#VH_seq_parameter_set_id] - [Getter][#seq_parameter_set_id()] - [Setter][#seq_parameter_set_id(byte)]
/// ### pic_parameter_set_id
/// [VarHandle][#VH_pic_parameter_set_id] - [Getter][#pic_parameter_set_id()] - [Setter][#pic_parameter_set_id(byte)]
/// ### num_ref_idx_l0_default_active_minus1
/// [VarHandle][#VH_num_ref_idx_l0_default_active_minus1] - [Getter][#num_ref_idx_l0_default_active_minus1()] - [Setter][#num_ref_idx_l0_default_active_minus1(byte)]
/// ### num_ref_idx_l1_default_active_minus1
/// [VarHandle][#VH_num_ref_idx_l1_default_active_minus1] - [Getter][#num_ref_idx_l1_default_active_minus1()] - [Setter][#num_ref_idx_l1_default_active_minus1(byte)]
/// ### weighted_bipred_idc
/// [VarHandle][#VH_weighted_bipred_idc] - [Getter][#weighted_bipred_idc()] - [Setter][#weighted_bipred_idc(int)]
/// ### pic_init_qp_minus26
/// [VarHandle][#VH_pic_init_qp_minus26] - [Getter][#pic_init_qp_minus26()] - [Setter][#pic_init_qp_minus26(byte)]
/// ### pic_init_qs_minus26
/// [VarHandle][#VH_pic_init_qs_minus26] - [Getter][#pic_init_qs_minus26()] - [Setter][#pic_init_qs_minus26(byte)]
/// ### chroma_qp_index_offset
/// [VarHandle][#VH_chroma_qp_index_offset] - [Getter][#chroma_qp_index_offset()] - [Setter][#chroma_qp_index_offset(byte)]
/// ### second_chroma_qp_index_offset
/// [VarHandle][#VH_second_chroma_qp_index_offset] - [Getter][#second_chroma_qp_index_offset()] - [Setter][#second_chroma_qp_index_offset(byte)]
/// ### pScalingLists
/// [VarHandle][#VH_pScalingLists] - [Getter][#pScalingLists()] - [Setter][#pScalingLists(MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct StdVideoH264PictureParameterSet {
///     StdVideoH264PpsFlags flags;
///     uint8_t seq_parameter_set_id;
///     uint8_t pic_parameter_set_id;
///     uint8_t num_ref_idx_l0_default_active_minus1;
///     uint8_t num_ref_idx_l1_default_active_minus1;
///     StdVideoH264WeightedBipredIdc weighted_bipred_idc;
///     int8_t pic_init_qp_minus26;
///     int8_t pic_init_qs_minus26;
///     int8_t chroma_qp_index_offset;
///     int8_t second_chroma_qp_index_offset;
///     const StdVideoH264ScalingLists * pScalingLists;
/// } StdVideoH264PictureParameterSet;
/// ```
public sealed class StdVideoH264PictureParameterSet extends Struct {
    /// The struct layout of `StdVideoH264PictureParameterSet`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        StdVideoH264PpsFlags.LAYOUT.withName("flags"),
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
    /// The [VarHandle] of `flags` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    /// The [VarHandle] of `seq_parameter_set_id` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_seq_parameter_set_id = LAYOUT.arrayElementVarHandle(PathElement.groupElement("seq_parameter_set_id"));
    /// The [VarHandle] of `pic_parameter_set_id` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_pic_parameter_set_id = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pic_parameter_set_id"));
    /// The [VarHandle] of `num_ref_idx_l0_default_active_minus1` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_num_ref_idx_l0_default_active_minus1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("num_ref_idx_l0_default_active_minus1"));
    /// The [VarHandle] of `num_ref_idx_l1_default_active_minus1` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_num_ref_idx_l1_default_active_minus1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("num_ref_idx_l1_default_active_minus1"));
    /// The [VarHandle] of `weighted_bipred_idc` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_weighted_bipred_idc = LAYOUT.arrayElementVarHandle(PathElement.groupElement("weighted_bipred_idc"));
    /// The [VarHandle] of `pic_init_qp_minus26` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_pic_init_qp_minus26 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pic_init_qp_minus26"));
    /// The [VarHandle] of `pic_init_qs_minus26` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_pic_init_qs_minus26 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pic_init_qs_minus26"));
    /// The [VarHandle] of `chroma_qp_index_offset` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_chroma_qp_index_offset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("chroma_qp_index_offset"));
    /// The [VarHandle] of `second_chroma_qp_index_offset` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_second_chroma_qp_index_offset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("second_chroma_qp_index_offset"));
    /// The [VarHandle] of `pScalingLists` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pScalingLists = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pScalingLists"));

    /// Creates `StdVideoH264PictureParameterSet` with the given segment.
    /// @param segment the memory segment
    public StdVideoH264PictureParameterSet(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `StdVideoH264PictureParameterSet` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoH264PictureParameterSet of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new StdVideoH264PictureParameterSet(segment); }

    /// Creates `StdVideoH264PictureParameterSet` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `StdVideoH264PictureParameterSet` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoH264PictureParameterSet ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new StdVideoH264PictureParameterSet(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `StdVideoH264PictureParameterSet` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `StdVideoH264PictureParameterSet` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoH264PictureParameterSet`
    public static StdVideoH264PictureParameterSet alloc(SegmentAllocator allocator) { return new StdVideoH264PictureParameterSet(allocator.allocate(LAYOUT)); }

    /// Allocates a `StdVideoH264PictureParameterSet` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `StdVideoH264PictureParameterSet`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `StdVideoH264PictureParameterSet` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoH264PictureParameterSet`
    public static StdVideoH264PictureParameterSet allocInit(SegmentAllocator allocator, @CType("StdVideoH264PpsFlags") MemorySegment flags, @CType("uint8_t") byte seq_parameter_set_id, @CType("uint8_t") byte pic_parameter_set_id, @CType("uint8_t") byte num_ref_idx_l0_default_active_minus1, @CType("uint8_t") byte num_ref_idx_l1_default_active_minus1, @CType("StdVideoH264WeightedBipredIdc") int weighted_bipred_idc, @CType("int8_t") byte pic_init_qp_minus26, @CType("int8_t") byte pic_init_qs_minus26, @CType("int8_t") byte chroma_qp_index_offset, @CType("int8_t") byte second_chroma_qp_index_offset, @CType("const StdVideoH264ScalingLists *") MemorySegment pScalingLists) { return alloc(allocator).flags(flags).seq_parameter_set_id(seq_parameter_set_id).pic_parameter_set_id(pic_parameter_set_id).num_ref_idx_l0_default_active_minus1(num_ref_idx_l0_default_active_minus1).num_ref_idx_l1_default_active_minus1(num_ref_idx_l1_default_active_minus1).weighted_bipred_idc(weighted_bipred_idc).pic_init_qp_minus26(pic_init_qp_minus26).pic_init_qs_minus26(pic_init_qs_minus26).chroma_qp_index_offset(chroma_qp_index_offset).second_chroma_qp_index_offset(second_chroma_qp_index_offset).pScalingLists(pScalingLists); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public StdVideoH264PictureParameterSet copyFrom(StdVideoH264PictureParameterSet src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("StdVideoH264PpsFlags") MemorySegment get_flags(MemorySegment segment, long index) { return (MemorySegment) VH_flags.get(segment, 0L, index); }
    /// {@return `flags`}
    /// @param segment the segment of the struct
    public static @CType("StdVideoH264PpsFlags") MemorySegment get_flags(MemorySegment segment) { return StdVideoH264PictureParameterSet.get_flags(segment, 0L); }
    /// {@return `flags`}
    public @CType("StdVideoH264PpsFlags") MemorySegment flags() { return StdVideoH264PictureParameterSet.get_flags(this.segment()); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_flags(MemorySegment segment, long index, @CType("StdVideoH264PpsFlags") MemorySegment value) { VH_flags.set(segment, 0L, index, value); }
    /// Sets `flags` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_flags(MemorySegment segment, @CType("StdVideoH264PpsFlags") MemorySegment value) { StdVideoH264PictureParameterSet.set_flags(segment, 0L, value); }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH264PictureParameterSet flags(@CType("StdVideoH264PpsFlags") MemorySegment value) { StdVideoH264PictureParameterSet.set_flags(this.segment(), value); return this; }

    /// {@return `seq_parameter_set_id` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t") byte get_seq_parameter_set_id(MemorySegment segment, long index) { return (byte) VH_seq_parameter_set_id.get(segment, 0L, index); }
    /// {@return `seq_parameter_set_id`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t") byte get_seq_parameter_set_id(MemorySegment segment) { return StdVideoH264PictureParameterSet.get_seq_parameter_set_id(segment, 0L); }
    /// {@return `seq_parameter_set_id`}
    public @CType("uint8_t") byte seq_parameter_set_id() { return StdVideoH264PictureParameterSet.get_seq_parameter_set_id(this.segment()); }
    /// Sets `seq_parameter_set_id` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_seq_parameter_set_id(MemorySegment segment, long index, @CType("uint8_t") byte value) { VH_seq_parameter_set_id.set(segment, 0L, index, value); }
    /// Sets `seq_parameter_set_id` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_seq_parameter_set_id(MemorySegment segment, @CType("uint8_t") byte value) { StdVideoH264PictureParameterSet.set_seq_parameter_set_id(segment, 0L, value); }
    /// Sets `seq_parameter_set_id` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH264PictureParameterSet seq_parameter_set_id(@CType("uint8_t") byte value) { StdVideoH264PictureParameterSet.set_seq_parameter_set_id(this.segment(), value); return this; }

    /// {@return `pic_parameter_set_id` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t") byte get_pic_parameter_set_id(MemorySegment segment, long index) { return (byte) VH_pic_parameter_set_id.get(segment, 0L, index); }
    /// {@return `pic_parameter_set_id`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t") byte get_pic_parameter_set_id(MemorySegment segment) { return StdVideoH264PictureParameterSet.get_pic_parameter_set_id(segment, 0L); }
    /// {@return `pic_parameter_set_id`}
    public @CType("uint8_t") byte pic_parameter_set_id() { return StdVideoH264PictureParameterSet.get_pic_parameter_set_id(this.segment()); }
    /// Sets `pic_parameter_set_id` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pic_parameter_set_id(MemorySegment segment, long index, @CType("uint8_t") byte value) { VH_pic_parameter_set_id.set(segment, 0L, index, value); }
    /// Sets `pic_parameter_set_id` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pic_parameter_set_id(MemorySegment segment, @CType("uint8_t") byte value) { StdVideoH264PictureParameterSet.set_pic_parameter_set_id(segment, 0L, value); }
    /// Sets `pic_parameter_set_id` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH264PictureParameterSet pic_parameter_set_id(@CType("uint8_t") byte value) { StdVideoH264PictureParameterSet.set_pic_parameter_set_id(this.segment(), value); return this; }

    /// {@return `num_ref_idx_l0_default_active_minus1` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t") byte get_num_ref_idx_l0_default_active_minus1(MemorySegment segment, long index) { return (byte) VH_num_ref_idx_l0_default_active_minus1.get(segment, 0L, index); }
    /// {@return `num_ref_idx_l0_default_active_minus1`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t") byte get_num_ref_idx_l0_default_active_minus1(MemorySegment segment) { return StdVideoH264PictureParameterSet.get_num_ref_idx_l0_default_active_minus1(segment, 0L); }
    /// {@return `num_ref_idx_l0_default_active_minus1`}
    public @CType("uint8_t") byte num_ref_idx_l0_default_active_minus1() { return StdVideoH264PictureParameterSet.get_num_ref_idx_l0_default_active_minus1(this.segment()); }
    /// Sets `num_ref_idx_l0_default_active_minus1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_num_ref_idx_l0_default_active_minus1(MemorySegment segment, long index, @CType("uint8_t") byte value) { VH_num_ref_idx_l0_default_active_minus1.set(segment, 0L, index, value); }
    /// Sets `num_ref_idx_l0_default_active_minus1` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_num_ref_idx_l0_default_active_minus1(MemorySegment segment, @CType("uint8_t") byte value) { StdVideoH264PictureParameterSet.set_num_ref_idx_l0_default_active_minus1(segment, 0L, value); }
    /// Sets `num_ref_idx_l0_default_active_minus1` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH264PictureParameterSet num_ref_idx_l0_default_active_minus1(@CType("uint8_t") byte value) { StdVideoH264PictureParameterSet.set_num_ref_idx_l0_default_active_minus1(this.segment(), value); return this; }

    /// {@return `num_ref_idx_l1_default_active_minus1` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t") byte get_num_ref_idx_l1_default_active_minus1(MemorySegment segment, long index) { return (byte) VH_num_ref_idx_l1_default_active_minus1.get(segment, 0L, index); }
    /// {@return `num_ref_idx_l1_default_active_minus1`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t") byte get_num_ref_idx_l1_default_active_minus1(MemorySegment segment) { return StdVideoH264PictureParameterSet.get_num_ref_idx_l1_default_active_minus1(segment, 0L); }
    /// {@return `num_ref_idx_l1_default_active_minus1`}
    public @CType("uint8_t") byte num_ref_idx_l1_default_active_minus1() { return StdVideoH264PictureParameterSet.get_num_ref_idx_l1_default_active_minus1(this.segment()); }
    /// Sets `num_ref_idx_l1_default_active_minus1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_num_ref_idx_l1_default_active_minus1(MemorySegment segment, long index, @CType("uint8_t") byte value) { VH_num_ref_idx_l1_default_active_minus1.set(segment, 0L, index, value); }
    /// Sets `num_ref_idx_l1_default_active_minus1` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_num_ref_idx_l1_default_active_minus1(MemorySegment segment, @CType("uint8_t") byte value) { StdVideoH264PictureParameterSet.set_num_ref_idx_l1_default_active_minus1(segment, 0L, value); }
    /// Sets `num_ref_idx_l1_default_active_minus1` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH264PictureParameterSet num_ref_idx_l1_default_active_minus1(@CType("uint8_t") byte value) { StdVideoH264PictureParameterSet.set_num_ref_idx_l1_default_active_minus1(this.segment(), value); return this; }

    /// {@return `weighted_bipred_idc` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("StdVideoH264WeightedBipredIdc") int get_weighted_bipred_idc(MemorySegment segment, long index) { return (int) VH_weighted_bipred_idc.get(segment, 0L, index); }
    /// {@return `weighted_bipred_idc`}
    /// @param segment the segment of the struct
    public static @CType("StdVideoH264WeightedBipredIdc") int get_weighted_bipred_idc(MemorySegment segment) { return StdVideoH264PictureParameterSet.get_weighted_bipred_idc(segment, 0L); }
    /// {@return `weighted_bipred_idc`}
    public @CType("StdVideoH264WeightedBipredIdc") int weighted_bipred_idc() { return StdVideoH264PictureParameterSet.get_weighted_bipred_idc(this.segment()); }
    /// Sets `weighted_bipred_idc` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_weighted_bipred_idc(MemorySegment segment, long index, @CType("StdVideoH264WeightedBipredIdc") int value) { VH_weighted_bipred_idc.set(segment, 0L, index, value); }
    /// Sets `weighted_bipred_idc` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_weighted_bipred_idc(MemorySegment segment, @CType("StdVideoH264WeightedBipredIdc") int value) { StdVideoH264PictureParameterSet.set_weighted_bipred_idc(segment, 0L, value); }
    /// Sets `weighted_bipred_idc` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH264PictureParameterSet weighted_bipred_idc(@CType("StdVideoH264WeightedBipredIdc") int value) { StdVideoH264PictureParameterSet.set_weighted_bipred_idc(this.segment(), value); return this; }

    /// {@return `pic_init_qp_minus26` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("int8_t") byte get_pic_init_qp_minus26(MemorySegment segment, long index) { return (byte) VH_pic_init_qp_minus26.get(segment, 0L, index); }
    /// {@return `pic_init_qp_minus26`}
    /// @param segment the segment of the struct
    public static @CType("int8_t") byte get_pic_init_qp_minus26(MemorySegment segment) { return StdVideoH264PictureParameterSet.get_pic_init_qp_minus26(segment, 0L); }
    /// {@return `pic_init_qp_minus26`}
    public @CType("int8_t") byte pic_init_qp_minus26() { return StdVideoH264PictureParameterSet.get_pic_init_qp_minus26(this.segment()); }
    /// Sets `pic_init_qp_minus26` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pic_init_qp_minus26(MemorySegment segment, long index, @CType("int8_t") byte value) { VH_pic_init_qp_minus26.set(segment, 0L, index, value); }
    /// Sets `pic_init_qp_minus26` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pic_init_qp_minus26(MemorySegment segment, @CType("int8_t") byte value) { StdVideoH264PictureParameterSet.set_pic_init_qp_minus26(segment, 0L, value); }
    /// Sets `pic_init_qp_minus26` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH264PictureParameterSet pic_init_qp_minus26(@CType("int8_t") byte value) { StdVideoH264PictureParameterSet.set_pic_init_qp_minus26(this.segment(), value); return this; }

    /// {@return `pic_init_qs_minus26` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("int8_t") byte get_pic_init_qs_minus26(MemorySegment segment, long index) { return (byte) VH_pic_init_qs_minus26.get(segment, 0L, index); }
    /// {@return `pic_init_qs_minus26`}
    /// @param segment the segment of the struct
    public static @CType("int8_t") byte get_pic_init_qs_minus26(MemorySegment segment) { return StdVideoH264PictureParameterSet.get_pic_init_qs_minus26(segment, 0L); }
    /// {@return `pic_init_qs_minus26`}
    public @CType("int8_t") byte pic_init_qs_minus26() { return StdVideoH264PictureParameterSet.get_pic_init_qs_minus26(this.segment()); }
    /// Sets `pic_init_qs_minus26` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pic_init_qs_minus26(MemorySegment segment, long index, @CType("int8_t") byte value) { VH_pic_init_qs_minus26.set(segment, 0L, index, value); }
    /// Sets `pic_init_qs_minus26` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pic_init_qs_minus26(MemorySegment segment, @CType("int8_t") byte value) { StdVideoH264PictureParameterSet.set_pic_init_qs_minus26(segment, 0L, value); }
    /// Sets `pic_init_qs_minus26` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH264PictureParameterSet pic_init_qs_minus26(@CType("int8_t") byte value) { StdVideoH264PictureParameterSet.set_pic_init_qs_minus26(this.segment(), value); return this; }

    /// {@return `chroma_qp_index_offset` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("int8_t") byte get_chroma_qp_index_offset(MemorySegment segment, long index) { return (byte) VH_chroma_qp_index_offset.get(segment, 0L, index); }
    /// {@return `chroma_qp_index_offset`}
    /// @param segment the segment of the struct
    public static @CType("int8_t") byte get_chroma_qp_index_offset(MemorySegment segment) { return StdVideoH264PictureParameterSet.get_chroma_qp_index_offset(segment, 0L); }
    /// {@return `chroma_qp_index_offset`}
    public @CType("int8_t") byte chroma_qp_index_offset() { return StdVideoH264PictureParameterSet.get_chroma_qp_index_offset(this.segment()); }
    /// Sets `chroma_qp_index_offset` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_chroma_qp_index_offset(MemorySegment segment, long index, @CType("int8_t") byte value) { VH_chroma_qp_index_offset.set(segment, 0L, index, value); }
    /// Sets `chroma_qp_index_offset` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_chroma_qp_index_offset(MemorySegment segment, @CType("int8_t") byte value) { StdVideoH264PictureParameterSet.set_chroma_qp_index_offset(segment, 0L, value); }
    /// Sets `chroma_qp_index_offset` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH264PictureParameterSet chroma_qp_index_offset(@CType("int8_t") byte value) { StdVideoH264PictureParameterSet.set_chroma_qp_index_offset(this.segment(), value); return this; }

    /// {@return `second_chroma_qp_index_offset` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("int8_t") byte get_second_chroma_qp_index_offset(MemorySegment segment, long index) { return (byte) VH_second_chroma_qp_index_offset.get(segment, 0L, index); }
    /// {@return `second_chroma_qp_index_offset`}
    /// @param segment the segment of the struct
    public static @CType("int8_t") byte get_second_chroma_qp_index_offset(MemorySegment segment) { return StdVideoH264PictureParameterSet.get_second_chroma_qp_index_offset(segment, 0L); }
    /// {@return `second_chroma_qp_index_offset`}
    public @CType("int8_t") byte second_chroma_qp_index_offset() { return StdVideoH264PictureParameterSet.get_second_chroma_qp_index_offset(this.segment()); }
    /// Sets `second_chroma_qp_index_offset` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_second_chroma_qp_index_offset(MemorySegment segment, long index, @CType("int8_t") byte value) { VH_second_chroma_qp_index_offset.set(segment, 0L, index, value); }
    /// Sets `second_chroma_qp_index_offset` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_second_chroma_qp_index_offset(MemorySegment segment, @CType("int8_t") byte value) { StdVideoH264PictureParameterSet.set_second_chroma_qp_index_offset(segment, 0L, value); }
    /// Sets `second_chroma_qp_index_offset` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH264PictureParameterSet second_chroma_qp_index_offset(@CType("int8_t") byte value) { StdVideoH264PictureParameterSet.set_second_chroma_qp_index_offset(this.segment(), value); return this; }

    /// {@return `pScalingLists` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const StdVideoH264ScalingLists *") MemorySegment get_pScalingLists(MemorySegment segment, long index) { return (MemorySegment) VH_pScalingLists.get(segment, 0L, index); }
    /// {@return `pScalingLists`}
    /// @param segment the segment of the struct
    public static @CType("const StdVideoH264ScalingLists *") MemorySegment get_pScalingLists(MemorySegment segment) { return StdVideoH264PictureParameterSet.get_pScalingLists(segment, 0L); }
    /// {@return `pScalingLists`}
    public @CType("const StdVideoH264ScalingLists *") MemorySegment pScalingLists() { return StdVideoH264PictureParameterSet.get_pScalingLists(this.segment()); }
    /// Sets `pScalingLists` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pScalingLists(MemorySegment segment, long index, @CType("const StdVideoH264ScalingLists *") MemorySegment value) { VH_pScalingLists.set(segment, 0L, index, value); }
    /// Sets `pScalingLists` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pScalingLists(MemorySegment segment, @CType("const StdVideoH264ScalingLists *") MemorySegment value) { StdVideoH264PictureParameterSet.set_pScalingLists(segment, 0L, value); }
    /// Sets `pScalingLists` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH264PictureParameterSet pScalingLists(@CType("const StdVideoH264ScalingLists *") MemorySegment value) { StdVideoH264PictureParameterSet.set_pScalingLists(this.segment(), value); return this; }

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
        /// @param index the index
        public @CType("StdVideoH264PpsFlags") MemorySegment flagsAt(long index) { return StdVideoH264PictureParameterSet.get_flags(this.segment(), index); }
        /// Sets `flags` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer flagsAt(long index, @CType("StdVideoH264PpsFlags") MemorySegment value) { StdVideoH264PictureParameterSet.set_flags(this.segment(), index, value); return this; }

        /// {@return `seq_parameter_set_id` at the given index}
        /// @param index the index
        public @CType("uint8_t") byte seq_parameter_set_idAt(long index) { return StdVideoH264PictureParameterSet.get_seq_parameter_set_id(this.segment(), index); }
        /// Sets `seq_parameter_set_id` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer seq_parameter_set_idAt(long index, @CType("uint8_t") byte value) { StdVideoH264PictureParameterSet.set_seq_parameter_set_id(this.segment(), index, value); return this; }

        /// {@return `pic_parameter_set_id` at the given index}
        /// @param index the index
        public @CType("uint8_t") byte pic_parameter_set_idAt(long index) { return StdVideoH264PictureParameterSet.get_pic_parameter_set_id(this.segment(), index); }
        /// Sets `pic_parameter_set_id` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pic_parameter_set_idAt(long index, @CType("uint8_t") byte value) { StdVideoH264PictureParameterSet.set_pic_parameter_set_id(this.segment(), index, value); return this; }

        /// {@return `num_ref_idx_l0_default_active_minus1` at the given index}
        /// @param index the index
        public @CType("uint8_t") byte num_ref_idx_l0_default_active_minus1At(long index) { return StdVideoH264PictureParameterSet.get_num_ref_idx_l0_default_active_minus1(this.segment(), index); }
        /// Sets `num_ref_idx_l0_default_active_minus1` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer num_ref_idx_l0_default_active_minus1At(long index, @CType("uint8_t") byte value) { StdVideoH264PictureParameterSet.set_num_ref_idx_l0_default_active_minus1(this.segment(), index, value); return this; }

        /// {@return `num_ref_idx_l1_default_active_minus1` at the given index}
        /// @param index the index
        public @CType("uint8_t") byte num_ref_idx_l1_default_active_minus1At(long index) { return StdVideoH264PictureParameterSet.get_num_ref_idx_l1_default_active_minus1(this.segment(), index); }
        /// Sets `num_ref_idx_l1_default_active_minus1` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer num_ref_idx_l1_default_active_minus1At(long index, @CType("uint8_t") byte value) { StdVideoH264PictureParameterSet.set_num_ref_idx_l1_default_active_minus1(this.segment(), index, value); return this; }

        /// {@return `weighted_bipred_idc` at the given index}
        /// @param index the index
        public @CType("StdVideoH264WeightedBipredIdc") int weighted_bipred_idcAt(long index) { return StdVideoH264PictureParameterSet.get_weighted_bipred_idc(this.segment(), index); }
        /// Sets `weighted_bipred_idc` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer weighted_bipred_idcAt(long index, @CType("StdVideoH264WeightedBipredIdc") int value) { StdVideoH264PictureParameterSet.set_weighted_bipred_idc(this.segment(), index, value); return this; }

        /// {@return `pic_init_qp_minus26` at the given index}
        /// @param index the index
        public @CType("int8_t") byte pic_init_qp_minus26At(long index) { return StdVideoH264PictureParameterSet.get_pic_init_qp_minus26(this.segment(), index); }
        /// Sets `pic_init_qp_minus26` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pic_init_qp_minus26At(long index, @CType("int8_t") byte value) { StdVideoH264PictureParameterSet.set_pic_init_qp_minus26(this.segment(), index, value); return this; }

        /// {@return `pic_init_qs_minus26` at the given index}
        /// @param index the index
        public @CType("int8_t") byte pic_init_qs_minus26At(long index) { return StdVideoH264PictureParameterSet.get_pic_init_qs_minus26(this.segment(), index); }
        /// Sets `pic_init_qs_minus26` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pic_init_qs_minus26At(long index, @CType("int8_t") byte value) { StdVideoH264PictureParameterSet.set_pic_init_qs_minus26(this.segment(), index, value); return this; }

        /// {@return `chroma_qp_index_offset` at the given index}
        /// @param index the index
        public @CType("int8_t") byte chroma_qp_index_offsetAt(long index) { return StdVideoH264PictureParameterSet.get_chroma_qp_index_offset(this.segment(), index); }
        /// Sets `chroma_qp_index_offset` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer chroma_qp_index_offsetAt(long index, @CType("int8_t") byte value) { StdVideoH264PictureParameterSet.set_chroma_qp_index_offset(this.segment(), index, value); return this; }

        /// {@return `second_chroma_qp_index_offset` at the given index}
        /// @param index the index
        public @CType("int8_t") byte second_chroma_qp_index_offsetAt(long index) { return StdVideoH264PictureParameterSet.get_second_chroma_qp_index_offset(this.segment(), index); }
        /// Sets `second_chroma_qp_index_offset` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer second_chroma_qp_index_offsetAt(long index, @CType("int8_t") byte value) { StdVideoH264PictureParameterSet.set_second_chroma_qp_index_offset(this.segment(), index, value); return this; }

        /// {@return `pScalingLists` at the given index}
        /// @param index the index
        public @CType("const StdVideoH264ScalingLists *") MemorySegment pScalingListsAt(long index) { return StdVideoH264PictureParameterSet.get_pScalingLists(this.segment(), index); }
        /// Sets `pScalingLists` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pScalingListsAt(long index, @CType("const StdVideoH264ScalingLists *") MemorySegment value) { StdVideoH264PictureParameterSet.set_pScalingLists(this.segment(), index, value); return this; }

    }
}
