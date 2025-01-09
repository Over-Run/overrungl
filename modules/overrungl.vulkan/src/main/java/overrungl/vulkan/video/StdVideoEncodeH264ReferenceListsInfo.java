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
/// [VarHandle][#VH_flags] - [Getter][#flags()] - [Setter][#flags(java.lang.foreign.MemorySegment)]
/// ### num_ref_idx_l0_active_minus1
/// [VarHandle][#VH_num_ref_idx_l0_active_minus1] - [Getter][#num_ref_idx_l0_active_minus1()] - [Setter][#num_ref_idx_l0_active_minus1(byte)]
/// ### num_ref_idx_l1_active_minus1
/// [VarHandle][#VH_num_ref_idx_l1_active_minus1] - [Getter][#num_ref_idx_l1_active_minus1()] - [Setter][#num_ref_idx_l1_active_minus1(byte)]
/// ### RefPicList0
/// [VarHandle][#VH_RefPicList0] - [Getter][#RefPicList0()] - [Setter][#RefPicList0(byte)]
/// ### RefPicList1
/// [VarHandle][#VH_RefPicList1] - [Getter][#RefPicList1()] - [Setter][#RefPicList1(byte)]
/// ### refList0ModOpCount
/// [VarHandle][#VH_refList0ModOpCount] - [Getter][#refList0ModOpCount()] - [Setter][#refList0ModOpCount(byte)]
/// ### refList1ModOpCount
/// [VarHandle][#VH_refList1ModOpCount] - [Getter][#refList1ModOpCount()] - [Setter][#refList1ModOpCount(byte)]
/// ### refPicMarkingOpCount
/// [VarHandle][#VH_refPicMarkingOpCount] - [Getter][#refPicMarkingOpCount()] - [Setter][#refPicMarkingOpCount(byte)]
/// ### reserved1
/// [VarHandle][#VH_reserved1] - [Getter][#reserved1()] - [Setter][#reserved1(byte)]
/// ### pRefList0ModOperations
/// [VarHandle][#VH_pRefList0ModOperations] - [Getter][#pRefList0ModOperations()] - [Setter][#pRefList0ModOperations(java.lang.foreign.MemorySegment)]
/// ### pRefList1ModOperations
/// [VarHandle][#VH_pRefList1ModOperations] - [Getter][#pRefList1ModOperations()] - [Setter][#pRefList1ModOperations(java.lang.foreign.MemorySegment)]
/// ### pRefPicMarkingOperations
/// [VarHandle][#VH_pRefPicMarkingOperations] - [Getter][#pRefPicMarkingOperations()] - [Setter][#pRefPicMarkingOperations(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct StdVideoEncodeH264ReferenceListsInfo {
///     StdVideoEncodeH264ReferenceListsInfoFlags flags;
///     uint8_t num_ref_idx_l0_active_minus1;
///     uint8_t num_ref_idx_l1_active_minus1;
///     uint8_t [STD_VIDEO_H264_MAX_NUM_LIST_REF] RefPicList0;
///     uint8_t [STD_VIDEO_H264_MAX_NUM_LIST_REF] RefPicList1;
///     uint8_t refList0ModOpCount;
///     uint8_t refList1ModOpCount;
///     uint8_t refPicMarkingOpCount;
///     uint8_t [7] reserved1;
///     const StdVideoEncodeH264RefListModEntry * pRefList0ModOperations;
///     const StdVideoEncodeH264RefListModEntry * pRefList1ModOperations;
///     const StdVideoEncodeH264RefPicMarkingEntry * pRefPicMarkingOperations;
/// } StdVideoEncodeH264ReferenceListsInfo;
/// ```
public final class StdVideoEncodeH264ReferenceListsInfo extends Struct {
    /// The struct layout of `StdVideoEncodeH264ReferenceListsInfo`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        StdVideoEncodeH264ReferenceListsInfoFlags.LAYOUT.withName("flags"),
        ValueLayout.JAVA_BYTE.withName("num_ref_idx_l0_active_minus1"),
        ValueLayout.JAVA_BYTE.withName("num_ref_idx_l1_active_minus1"),
        ValueLayout.JAVA_BYTE.withName("RefPicList0"),
        ValueLayout.JAVA_BYTE.withName("RefPicList1"),
        ValueLayout.JAVA_BYTE.withName("refList0ModOpCount"),
        ValueLayout.JAVA_BYTE.withName("refList1ModOpCount"),
        ValueLayout.JAVA_BYTE.withName("refPicMarkingOpCount"),
        ValueLayout.JAVA_BYTE.withName("reserved1"),
        ValueLayout.ADDRESS.withName("pRefList0ModOperations"),
        ValueLayout.ADDRESS.withName("pRefList1ModOperations"),
        ValueLayout.ADDRESS.withName("pRefPicMarkingOperations")
    );
    /// The [VarHandle] of `flags` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    /// The [VarHandle] of `num_ref_idx_l0_active_minus1` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_num_ref_idx_l0_active_minus1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("num_ref_idx_l0_active_minus1"));
    /// The [VarHandle] of `num_ref_idx_l1_active_minus1` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_num_ref_idx_l1_active_minus1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("num_ref_idx_l1_active_minus1"));
    /// The [VarHandle] of `RefPicList0` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_RefPicList0 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("RefPicList0"));
    /// The [VarHandle] of `RefPicList1` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_RefPicList1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("RefPicList1"));
    /// The [VarHandle] of `refList0ModOpCount` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_refList0ModOpCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("refList0ModOpCount"));
    /// The [VarHandle] of `refList1ModOpCount` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_refList1ModOpCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("refList1ModOpCount"));
    /// The [VarHandle] of `refPicMarkingOpCount` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_refPicMarkingOpCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("refPicMarkingOpCount"));
    /// The [VarHandle] of `reserved1` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_reserved1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("reserved1"));
    /// The [VarHandle] of `pRefList0ModOperations` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pRefList0ModOperations = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pRefList0ModOperations"));
    /// The [VarHandle] of `pRefList1ModOperations` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pRefList1ModOperations = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pRefList1ModOperations"));
    /// The [VarHandle] of `pRefPicMarkingOperations` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pRefPicMarkingOperations = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pRefPicMarkingOperations"));

    /// Creates `StdVideoEncodeH264ReferenceListsInfo` with the given segment.
    /// @param segment the memory segment
    public StdVideoEncodeH264ReferenceListsInfo(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `StdVideoEncodeH264ReferenceListsInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoEncodeH264ReferenceListsInfo of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new StdVideoEncodeH264ReferenceListsInfo(segment); }

    /// Creates `StdVideoEncodeH264ReferenceListsInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoEncodeH264ReferenceListsInfo ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new StdVideoEncodeH264ReferenceListsInfo(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `StdVideoEncodeH264ReferenceListsInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoEncodeH264ReferenceListsInfo ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new StdVideoEncodeH264ReferenceListsInfo(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `StdVideoEncodeH264ReferenceListsInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoEncodeH264ReferenceListsInfo`
    public static StdVideoEncodeH264ReferenceListsInfo alloc(SegmentAllocator allocator) { return new StdVideoEncodeH264ReferenceListsInfo(allocator.allocate(LAYOUT)); }

    /// Allocates a `StdVideoEncodeH264ReferenceListsInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `StdVideoEncodeH264ReferenceListsInfo`
    public static StdVideoEncodeH264ReferenceListsInfo alloc(SegmentAllocator allocator, long count) { return new StdVideoEncodeH264ReferenceListsInfo(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `StdVideoEncodeH264ReferenceListsInfo`.
    /// @param index the index of the struct buffer
    /// @return the slice of `StdVideoEncodeH264ReferenceListsInfo`
    public StdVideoEncodeH264ReferenceListsInfo asSlice(long index) { return new StdVideoEncodeH264ReferenceListsInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `StdVideoEncodeH264ReferenceListsInfo`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `StdVideoEncodeH264ReferenceListsInfo`
    public StdVideoEncodeH264ReferenceListsInfo asSlice(long index, long count) { return new StdVideoEncodeH264ReferenceListsInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("StdVideoEncodeH264ReferenceListsInfoFlags") java.lang.foreign.MemorySegment get_flags(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_flags.get(segment, 0L, index); }
    /// {@return `flags`}
    /// @param segment the segment of the struct
    public static @CType("StdVideoEncodeH264ReferenceListsInfoFlags") java.lang.foreign.MemorySegment get_flags(MemorySegment segment) { return StdVideoEncodeH264ReferenceListsInfo.get_flags(segment, 0L); }
    /// {@return `flags` at the given index}
    /// @param index the index
    public @CType("StdVideoEncodeH264ReferenceListsInfoFlags") java.lang.foreign.MemorySegment flagsAt(long index) { return StdVideoEncodeH264ReferenceListsInfo.get_flags(this.segment(), index); }
    /// {@return `flags`}
    public @CType("StdVideoEncodeH264ReferenceListsInfoFlags") java.lang.foreign.MemorySegment flags() { return StdVideoEncodeH264ReferenceListsInfo.get_flags(this.segment()); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_flags(MemorySegment segment, long index, @CType("StdVideoEncodeH264ReferenceListsInfoFlags") java.lang.foreign.MemorySegment value) { VH_flags.set(segment, 0L, index, value); }
    /// Sets `flags` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_flags(MemorySegment segment, @CType("StdVideoEncodeH264ReferenceListsInfoFlags") java.lang.foreign.MemorySegment value) { StdVideoEncodeH264ReferenceListsInfo.set_flags(segment, 0L, value); }
    /// Sets `flags` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264ReferenceListsInfo flagsAt(long index, @CType("StdVideoEncodeH264ReferenceListsInfoFlags") java.lang.foreign.MemorySegment value) { StdVideoEncodeH264ReferenceListsInfo.set_flags(this.segment(), index, value); return this; }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264ReferenceListsInfo flags(@CType("StdVideoEncodeH264ReferenceListsInfoFlags") java.lang.foreign.MemorySegment value) { StdVideoEncodeH264ReferenceListsInfo.set_flags(this.segment(), value); return this; }

    /// {@return `num_ref_idx_l0_active_minus1` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t") byte get_num_ref_idx_l0_active_minus1(MemorySegment segment, long index) { return (byte) VH_num_ref_idx_l0_active_minus1.get(segment, 0L, index); }
    /// {@return `num_ref_idx_l0_active_minus1`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t") byte get_num_ref_idx_l0_active_minus1(MemorySegment segment) { return StdVideoEncodeH264ReferenceListsInfo.get_num_ref_idx_l0_active_minus1(segment, 0L); }
    /// {@return `num_ref_idx_l0_active_minus1` at the given index}
    /// @param index the index
    public @CType("uint8_t") byte num_ref_idx_l0_active_minus1At(long index) { return StdVideoEncodeH264ReferenceListsInfo.get_num_ref_idx_l0_active_minus1(this.segment(), index); }
    /// {@return `num_ref_idx_l0_active_minus1`}
    public @CType("uint8_t") byte num_ref_idx_l0_active_minus1() { return StdVideoEncodeH264ReferenceListsInfo.get_num_ref_idx_l0_active_minus1(this.segment()); }
    /// Sets `num_ref_idx_l0_active_minus1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_num_ref_idx_l0_active_minus1(MemorySegment segment, long index, @CType("uint8_t") byte value) { VH_num_ref_idx_l0_active_minus1.set(segment, 0L, index, value); }
    /// Sets `num_ref_idx_l0_active_minus1` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_num_ref_idx_l0_active_minus1(MemorySegment segment, @CType("uint8_t") byte value) { StdVideoEncodeH264ReferenceListsInfo.set_num_ref_idx_l0_active_minus1(segment, 0L, value); }
    /// Sets `num_ref_idx_l0_active_minus1` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264ReferenceListsInfo num_ref_idx_l0_active_minus1At(long index, @CType("uint8_t") byte value) { StdVideoEncodeH264ReferenceListsInfo.set_num_ref_idx_l0_active_minus1(this.segment(), index, value); return this; }
    /// Sets `num_ref_idx_l0_active_minus1` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264ReferenceListsInfo num_ref_idx_l0_active_minus1(@CType("uint8_t") byte value) { StdVideoEncodeH264ReferenceListsInfo.set_num_ref_idx_l0_active_minus1(this.segment(), value); return this; }

    /// {@return `num_ref_idx_l1_active_minus1` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t") byte get_num_ref_idx_l1_active_minus1(MemorySegment segment, long index) { return (byte) VH_num_ref_idx_l1_active_minus1.get(segment, 0L, index); }
    /// {@return `num_ref_idx_l1_active_minus1`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t") byte get_num_ref_idx_l1_active_minus1(MemorySegment segment) { return StdVideoEncodeH264ReferenceListsInfo.get_num_ref_idx_l1_active_minus1(segment, 0L); }
    /// {@return `num_ref_idx_l1_active_minus1` at the given index}
    /// @param index the index
    public @CType("uint8_t") byte num_ref_idx_l1_active_minus1At(long index) { return StdVideoEncodeH264ReferenceListsInfo.get_num_ref_idx_l1_active_minus1(this.segment(), index); }
    /// {@return `num_ref_idx_l1_active_minus1`}
    public @CType("uint8_t") byte num_ref_idx_l1_active_minus1() { return StdVideoEncodeH264ReferenceListsInfo.get_num_ref_idx_l1_active_minus1(this.segment()); }
    /// Sets `num_ref_idx_l1_active_minus1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_num_ref_idx_l1_active_minus1(MemorySegment segment, long index, @CType("uint8_t") byte value) { VH_num_ref_idx_l1_active_minus1.set(segment, 0L, index, value); }
    /// Sets `num_ref_idx_l1_active_minus1` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_num_ref_idx_l1_active_minus1(MemorySegment segment, @CType("uint8_t") byte value) { StdVideoEncodeH264ReferenceListsInfo.set_num_ref_idx_l1_active_minus1(segment, 0L, value); }
    /// Sets `num_ref_idx_l1_active_minus1` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264ReferenceListsInfo num_ref_idx_l1_active_minus1At(long index, @CType("uint8_t") byte value) { StdVideoEncodeH264ReferenceListsInfo.set_num_ref_idx_l1_active_minus1(this.segment(), index, value); return this; }
    /// Sets `num_ref_idx_l1_active_minus1` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264ReferenceListsInfo num_ref_idx_l1_active_minus1(@CType("uint8_t") byte value) { StdVideoEncodeH264ReferenceListsInfo.set_num_ref_idx_l1_active_minus1(this.segment(), value); return this; }

    /// {@return `RefPicList0` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t [STD_VIDEO_H264_MAX_NUM_LIST_REF]") byte get_RefPicList0(MemorySegment segment, long index) { return (byte) VH_RefPicList0.get(segment, 0L, index); }
    /// {@return `RefPicList0`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t [STD_VIDEO_H264_MAX_NUM_LIST_REF]") byte get_RefPicList0(MemorySegment segment) { return StdVideoEncodeH264ReferenceListsInfo.get_RefPicList0(segment, 0L); }
    /// {@return `RefPicList0` at the given index}
    /// @param index the index
    public @CType("uint8_t [STD_VIDEO_H264_MAX_NUM_LIST_REF]") byte RefPicList0At(long index) { return StdVideoEncodeH264ReferenceListsInfo.get_RefPicList0(this.segment(), index); }
    /// {@return `RefPicList0`}
    public @CType("uint8_t [STD_VIDEO_H264_MAX_NUM_LIST_REF]") byte RefPicList0() { return StdVideoEncodeH264ReferenceListsInfo.get_RefPicList0(this.segment()); }
    /// Sets `RefPicList0` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_RefPicList0(MemorySegment segment, long index, @CType("uint8_t [STD_VIDEO_H264_MAX_NUM_LIST_REF]") byte value) { VH_RefPicList0.set(segment, 0L, index, value); }
    /// Sets `RefPicList0` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_RefPicList0(MemorySegment segment, @CType("uint8_t [STD_VIDEO_H264_MAX_NUM_LIST_REF]") byte value) { StdVideoEncodeH264ReferenceListsInfo.set_RefPicList0(segment, 0L, value); }
    /// Sets `RefPicList0` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264ReferenceListsInfo RefPicList0At(long index, @CType("uint8_t [STD_VIDEO_H264_MAX_NUM_LIST_REF]") byte value) { StdVideoEncodeH264ReferenceListsInfo.set_RefPicList0(this.segment(), index, value); return this; }
    /// Sets `RefPicList0` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264ReferenceListsInfo RefPicList0(@CType("uint8_t [STD_VIDEO_H264_MAX_NUM_LIST_REF]") byte value) { StdVideoEncodeH264ReferenceListsInfo.set_RefPicList0(this.segment(), value); return this; }

    /// {@return `RefPicList1` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t [STD_VIDEO_H264_MAX_NUM_LIST_REF]") byte get_RefPicList1(MemorySegment segment, long index) { return (byte) VH_RefPicList1.get(segment, 0L, index); }
    /// {@return `RefPicList1`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t [STD_VIDEO_H264_MAX_NUM_LIST_REF]") byte get_RefPicList1(MemorySegment segment) { return StdVideoEncodeH264ReferenceListsInfo.get_RefPicList1(segment, 0L); }
    /// {@return `RefPicList1` at the given index}
    /// @param index the index
    public @CType("uint8_t [STD_VIDEO_H264_MAX_NUM_LIST_REF]") byte RefPicList1At(long index) { return StdVideoEncodeH264ReferenceListsInfo.get_RefPicList1(this.segment(), index); }
    /// {@return `RefPicList1`}
    public @CType("uint8_t [STD_VIDEO_H264_MAX_NUM_LIST_REF]") byte RefPicList1() { return StdVideoEncodeH264ReferenceListsInfo.get_RefPicList1(this.segment()); }
    /// Sets `RefPicList1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_RefPicList1(MemorySegment segment, long index, @CType("uint8_t [STD_VIDEO_H264_MAX_NUM_LIST_REF]") byte value) { VH_RefPicList1.set(segment, 0L, index, value); }
    /// Sets `RefPicList1` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_RefPicList1(MemorySegment segment, @CType("uint8_t [STD_VIDEO_H264_MAX_NUM_LIST_REF]") byte value) { StdVideoEncodeH264ReferenceListsInfo.set_RefPicList1(segment, 0L, value); }
    /// Sets `RefPicList1` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264ReferenceListsInfo RefPicList1At(long index, @CType("uint8_t [STD_VIDEO_H264_MAX_NUM_LIST_REF]") byte value) { StdVideoEncodeH264ReferenceListsInfo.set_RefPicList1(this.segment(), index, value); return this; }
    /// Sets `RefPicList1` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264ReferenceListsInfo RefPicList1(@CType("uint8_t [STD_VIDEO_H264_MAX_NUM_LIST_REF]") byte value) { StdVideoEncodeH264ReferenceListsInfo.set_RefPicList1(this.segment(), value); return this; }

    /// {@return `refList0ModOpCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t") byte get_refList0ModOpCount(MemorySegment segment, long index) { return (byte) VH_refList0ModOpCount.get(segment, 0L, index); }
    /// {@return `refList0ModOpCount`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t") byte get_refList0ModOpCount(MemorySegment segment) { return StdVideoEncodeH264ReferenceListsInfo.get_refList0ModOpCount(segment, 0L); }
    /// {@return `refList0ModOpCount` at the given index}
    /// @param index the index
    public @CType("uint8_t") byte refList0ModOpCountAt(long index) { return StdVideoEncodeH264ReferenceListsInfo.get_refList0ModOpCount(this.segment(), index); }
    /// {@return `refList0ModOpCount`}
    public @CType("uint8_t") byte refList0ModOpCount() { return StdVideoEncodeH264ReferenceListsInfo.get_refList0ModOpCount(this.segment()); }
    /// Sets `refList0ModOpCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_refList0ModOpCount(MemorySegment segment, long index, @CType("uint8_t") byte value) { VH_refList0ModOpCount.set(segment, 0L, index, value); }
    /// Sets `refList0ModOpCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_refList0ModOpCount(MemorySegment segment, @CType("uint8_t") byte value) { StdVideoEncodeH264ReferenceListsInfo.set_refList0ModOpCount(segment, 0L, value); }
    /// Sets `refList0ModOpCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264ReferenceListsInfo refList0ModOpCountAt(long index, @CType("uint8_t") byte value) { StdVideoEncodeH264ReferenceListsInfo.set_refList0ModOpCount(this.segment(), index, value); return this; }
    /// Sets `refList0ModOpCount` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264ReferenceListsInfo refList0ModOpCount(@CType("uint8_t") byte value) { StdVideoEncodeH264ReferenceListsInfo.set_refList0ModOpCount(this.segment(), value); return this; }

    /// {@return `refList1ModOpCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t") byte get_refList1ModOpCount(MemorySegment segment, long index) { return (byte) VH_refList1ModOpCount.get(segment, 0L, index); }
    /// {@return `refList1ModOpCount`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t") byte get_refList1ModOpCount(MemorySegment segment) { return StdVideoEncodeH264ReferenceListsInfo.get_refList1ModOpCount(segment, 0L); }
    /// {@return `refList1ModOpCount` at the given index}
    /// @param index the index
    public @CType("uint8_t") byte refList1ModOpCountAt(long index) { return StdVideoEncodeH264ReferenceListsInfo.get_refList1ModOpCount(this.segment(), index); }
    /// {@return `refList1ModOpCount`}
    public @CType("uint8_t") byte refList1ModOpCount() { return StdVideoEncodeH264ReferenceListsInfo.get_refList1ModOpCount(this.segment()); }
    /// Sets `refList1ModOpCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_refList1ModOpCount(MemorySegment segment, long index, @CType("uint8_t") byte value) { VH_refList1ModOpCount.set(segment, 0L, index, value); }
    /// Sets `refList1ModOpCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_refList1ModOpCount(MemorySegment segment, @CType("uint8_t") byte value) { StdVideoEncodeH264ReferenceListsInfo.set_refList1ModOpCount(segment, 0L, value); }
    /// Sets `refList1ModOpCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264ReferenceListsInfo refList1ModOpCountAt(long index, @CType("uint8_t") byte value) { StdVideoEncodeH264ReferenceListsInfo.set_refList1ModOpCount(this.segment(), index, value); return this; }
    /// Sets `refList1ModOpCount` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264ReferenceListsInfo refList1ModOpCount(@CType("uint8_t") byte value) { StdVideoEncodeH264ReferenceListsInfo.set_refList1ModOpCount(this.segment(), value); return this; }

    /// {@return `refPicMarkingOpCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t") byte get_refPicMarkingOpCount(MemorySegment segment, long index) { return (byte) VH_refPicMarkingOpCount.get(segment, 0L, index); }
    /// {@return `refPicMarkingOpCount`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t") byte get_refPicMarkingOpCount(MemorySegment segment) { return StdVideoEncodeH264ReferenceListsInfo.get_refPicMarkingOpCount(segment, 0L); }
    /// {@return `refPicMarkingOpCount` at the given index}
    /// @param index the index
    public @CType("uint8_t") byte refPicMarkingOpCountAt(long index) { return StdVideoEncodeH264ReferenceListsInfo.get_refPicMarkingOpCount(this.segment(), index); }
    /// {@return `refPicMarkingOpCount`}
    public @CType("uint8_t") byte refPicMarkingOpCount() { return StdVideoEncodeH264ReferenceListsInfo.get_refPicMarkingOpCount(this.segment()); }
    /// Sets `refPicMarkingOpCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_refPicMarkingOpCount(MemorySegment segment, long index, @CType("uint8_t") byte value) { VH_refPicMarkingOpCount.set(segment, 0L, index, value); }
    /// Sets `refPicMarkingOpCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_refPicMarkingOpCount(MemorySegment segment, @CType("uint8_t") byte value) { StdVideoEncodeH264ReferenceListsInfo.set_refPicMarkingOpCount(segment, 0L, value); }
    /// Sets `refPicMarkingOpCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264ReferenceListsInfo refPicMarkingOpCountAt(long index, @CType("uint8_t") byte value) { StdVideoEncodeH264ReferenceListsInfo.set_refPicMarkingOpCount(this.segment(), index, value); return this; }
    /// Sets `refPicMarkingOpCount` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264ReferenceListsInfo refPicMarkingOpCount(@CType("uint8_t") byte value) { StdVideoEncodeH264ReferenceListsInfo.set_refPicMarkingOpCount(this.segment(), value); return this; }

    /// {@return `reserved1` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t [7]") byte get_reserved1(MemorySegment segment, long index) { return (byte) VH_reserved1.get(segment, 0L, index); }
    /// {@return `reserved1`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t [7]") byte get_reserved1(MemorySegment segment) { return StdVideoEncodeH264ReferenceListsInfo.get_reserved1(segment, 0L); }
    /// {@return `reserved1` at the given index}
    /// @param index the index
    public @CType("uint8_t [7]") byte reserved1At(long index) { return StdVideoEncodeH264ReferenceListsInfo.get_reserved1(this.segment(), index); }
    /// {@return `reserved1`}
    public @CType("uint8_t [7]") byte reserved1() { return StdVideoEncodeH264ReferenceListsInfo.get_reserved1(this.segment()); }
    /// Sets `reserved1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_reserved1(MemorySegment segment, long index, @CType("uint8_t [7]") byte value) { VH_reserved1.set(segment, 0L, index, value); }
    /// Sets `reserved1` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_reserved1(MemorySegment segment, @CType("uint8_t [7]") byte value) { StdVideoEncodeH264ReferenceListsInfo.set_reserved1(segment, 0L, value); }
    /// Sets `reserved1` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264ReferenceListsInfo reserved1At(long index, @CType("uint8_t [7]") byte value) { StdVideoEncodeH264ReferenceListsInfo.set_reserved1(this.segment(), index, value); return this; }
    /// Sets `reserved1` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264ReferenceListsInfo reserved1(@CType("uint8_t [7]") byte value) { StdVideoEncodeH264ReferenceListsInfo.set_reserved1(this.segment(), value); return this; }

    /// {@return `pRefList0ModOperations` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const StdVideoEncodeH264RefListModEntry *") java.lang.foreign.MemorySegment get_pRefList0ModOperations(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pRefList0ModOperations.get(segment, 0L, index); }
    /// {@return `pRefList0ModOperations`}
    /// @param segment the segment of the struct
    public static @CType("const StdVideoEncodeH264RefListModEntry *") java.lang.foreign.MemorySegment get_pRefList0ModOperations(MemorySegment segment) { return StdVideoEncodeH264ReferenceListsInfo.get_pRefList0ModOperations(segment, 0L); }
    /// {@return `pRefList0ModOperations` at the given index}
    /// @param index the index
    public @CType("const StdVideoEncodeH264RefListModEntry *") java.lang.foreign.MemorySegment pRefList0ModOperationsAt(long index) { return StdVideoEncodeH264ReferenceListsInfo.get_pRefList0ModOperations(this.segment(), index); }
    /// {@return `pRefList0ModOperations`}
    public @CType("const StdVideoEncodeH264RefListModEntry *") java.lang.foreign.MemorySegment pRefList0ModOperations() { return StdVideoEncodeH264ReferenceListsInfo.get_pRefList0ModOperations(this.segment()); }
    /// Sets `pRefList0ModOperations` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pRefList0ModOperations(MemorySegment segment, long index, @CType("const StdVideoEncodeH264RefListModEntry *") java.lang.foreign.MemorySegment value) { VH_pRefList0ModOperations.set(segment, 0L, index, value); }
    /// Sets `pRefList0ModOperations` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pRefList0ModOperations(MemorySegment segment, @CType("const StdVideoEncodeH264RefListModEntry *") java.lang.foreign.MemorySegment value) { StdVideoEncodeH264ReferenceListsInfo.set_pRefList0ModOperations(segment, 0L, value); }
    /// Sets `pRefList0ModOperations` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264ReferenceListsInfo pRefList0ModOperationsAt(long index, @CType("const StdVideoEncodeH264RefListModEntry *") java.lang.foreign.MemorySegment value) { StdVideoEncodeH264ReferenceListsInfo.set_pRefList0ModOperations(this.segment(), index, value); return this; }
    /// Sets `pRefList0ModOperations` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264ReferenceListsInfo pRefList0ModOperations(@CType("const StdVideoEncodeH264RefListModEntry *") java.lang.foreign.MemorySegment value) { StdVideoEncodeH264ReferenceListsInfo.set_pRefList0ModOperations(this.segment(), value); return this; }

    /// {@return `pRefList1ModOperations` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const StdVideoEncodeH264RefListModEntry *") java.lang.foreign.MemorySegment get_pRefList1ModOperations(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pRefList1ModOperations.get(segment, 0L, index); }
    /// {@return `pRefList1ModOperations`}
    /// @param segment the segment of the struct
    public static @CType("const StdVideoEncodeH264RefListModEntry *") java.lang.foreign.MemorySegment get_pRefList1ModOperations(MemorySegment segment) { return StdVideoEncodeH264ReferenceListsInfo.get_pRefList1ModOperations(segment, 0L); }
    /// {@return `pRefList1ModOperations` at the given index}
    /// @param index the index
    public @CType("const StdVideoEncodeH264RefListModEntry *") java.lang.foreign.MemorySegment pRefList1ModOperationsAt(long index) { return StdVideoEncodeH264ReferenceListsInfo.get_pRefList1ModOperations(this.segment(), index); }
    /// {@return `pRefList1ModOperations`}
    public @CType("const StdVideoEncodeH264RefListModEntry *") java.lang.foreign.MemorySegment pRefList1ModOperations() { return StdVideoEncodeH264ReferenceListsInfo.get_pRefList1ModOperations(this.segment()); }
    /// Sets `pRefList1ModOperations` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pRefList1ModOperations(MemorySegment segment, long index, @CType("const StdVideoEncodeH264RefListModEntry *") java.lang.foreign.MemorySegment value) { VH_pRefList1ModOperations.set(segment, 0L, index, value); }
    /// Sets `pRefList1ModOperations` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pRefList1ModOperations(MemorySegment segment, @CType("const StdVideoEncodeH264RefListModEntry *") java.lang.foreign.MemorySegment value) { StdVideoEncodeH264ReferenceListsInfo.set_pRefList1ModOperations(segment, 0L, value); }
    /// Sets `pRefList1ModOperations` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264ReferenceListsInfo pRefList1ModOperationsAt(long index, @CType("const StdVideoEncodeH264RefListModEntry *") java.lang.foreign.MemorySegment value) { StdVideoEncodeH264ReferenceListsInfo.set_pRefList1ModOperations(this.segment(), index, value); return this; }
    /// Sets `pRefList1ModOperations` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264ReferenceListsInfo pRefList1ModOperations(@CType("const StdVideoEncodeH264RefListModEntry *") java.lang.foreign.MemorySegment value) { StdVideoEncodeH264ReferenceListsInfo.set_pRefList1ModOperations(this.segment(), value); return this; }

    /// {@return `pRefPicMarkingOperations` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const StdVideoEncodeH264RefPicMarkingEntry *") java.lang.foreign.MemorySegment get_pRefPicMarkingOperations(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pRefPicMarkingOperations.get(segment, 0L, index); }
    /// {@return `pRefPicMarkingOperations`}
    /// @param segment the segment of the struct
    public static @CType("const StdVideoEncodeH264RefPicMarkingEntry *") java.lang.foreign.MemorySegment get_pRefPicMarkingOperations(MemorySegment segment) { return StdVideoEncodeH264ReferenceListsInfo.get_pRefPicMarkingOperations(segment, 0L); }
    /// {@return `pRefPicMarkingOperations` at the given index}
    /// @param index the index
    public @CType("const StdVideoEncodeH264RefPicMarkingEntry *") java.lang.foreign.MemorySegment pRefPicMarkingOperationsAt(long index) { return StdVideoEncodeH264ReferenceListsInfo.get_pRefPicMarkingOperations(this.segment(), index); }
    /// {@return `pRefPicMarkingOperations`}
    public @CType("const StdVideoEncodeH264RefPicMarkingEntry *") java.lang.foreign.MemorySegment pRefPicMarkingOperations() { return StdVideoEncodeH264ReferenceListsInfo.get_pRefPicMarkingOperations(this.segment()); }
    /// Sets `pRefPicMarkingOperations` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pRefPicMarkingOperations(MemorySegment segment, long index, @CType("const StdVideoEncodeH264RefPicMarkingEntry *") java.lang.foreign.MemorySegment value) { VH_pRefPicMarkingOperations.set(segment, 0L, index, value); }
    /// Sets `pRefPicMarkingOperations` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pRefPicMarkingOperations(MemorySegment segment, @CType("const StdVideoEncodeH264RefPicMarkingEntry *") java.lang.foreign.MemorySegment value) { StdVideoEncodeH264ReferenceListsInfo.set_pRefPicMarkingOperations(segment, 0L, value); }
    /// Sets `pRefPicMarkingOperations` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264ReferenceListsInfo pRefPicMarkingOperationsAt(long index, @CType("const StdVideoEncodeH264RefPicMarkingEntry *") java.lang.foreign.MemorySegment value) { StdVideoEncodeH264ReferenceListsInfo.set_pRefPicMarkingOperations(this.segment(), index, value); return this; }
    /// Sets `pRefPicMarkingOperations` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264ReferenceListsInfo pRefPicMarkingOperations(@CType("const StdVideoEncodeH264RefPicMarkingEntry *") java.lang.foreign.MemorySegment value) { StdVideoEncodeH264ReferenceListsInfo.set_pRefPicMarkingOperations(this.segment(), value); return this; }

}
