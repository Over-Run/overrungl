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
/// ### list_entry_l0
/// [VarHandle][#VH_list_entry_l0] - [Getter][#list_entry_l0()] - [Setter][#list_entry_l0(byte)]
/// ### list_entry_l1
/// [VarHandle][#VH_list_entry_l1] - [Getter][#list_entry_l1()] - [Setter][#list_entry_l1(byte)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct StdVideoEncodeH265ReferenceListsInfo {
///     StdVideoEncodeH265ReferenceListsInfoFlags flags;
///     uint8_t num_ref_idx_l0_active_minus1;
///     uint8_t num_ref_idx_l1_active_minus1;
///     uint8_t [STD_VIDEO_H265_MAX_NUM_LIST_REF] RefPicList0;
///     uint8_t [STD_VIDEO_H265_MAX_NUM_LIST_REF] RefPicList1;
///     uint8_t [STD_VIDEO_H265_MAX_NUM_LIST_REF] list_entry_l0;
///     uint8_t [STD_VIDEO_H265_MAX_NUM_LIST_REF] list_entry_l1;
/// } StdVideoEncodeH265ReferenceListsInfo;
/// ```
public final class StdVideoEncodeH265ReferenceListsInfo extends Struct {
    /// The struct layout of `StdVideoEncodeH265ReferenceListsInfo`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        StdVideoEncodeH265ReferenceListsInfoFlags.LAYOUT.withName("flags"),
        ValueLayout.JAVA_BYTE.withName("num_ref_idx_l0_active_minus1"),
        ValueLayout.JAVA_BYTE.withName("num_ref_idx_l1_active_minus1"),
        ValueLayout.JAVA_BYTE.withName("RefPicList0"),
        ValueLayout.JAVA_BYTE.withName("RefPicList1"),
        ValueLayout.JAVA_BYTE.withName("list_entry_l0"),
        ValueLayout.JAVA_BYTE.withName("list_entry_l1")
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
    /// The [VarHandle] of `list_entry_l0` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_list_entry_l0 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("list_entry_l0"));
    /// The [VarHandle] of `list_entry_l1` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_list_entry_l1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("list_entry_l1"));

    /// Creates `StdVideoEncodeH265ReferenceListsInfo` with the given segment.
    /// @param segment the memory segment
    public StdVideoEncodeH265ReferenceListsInfo(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `StdVideoEncodeH265ReferenceListsInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoEncodeH265ReferenceListsInfo of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new StdVideoEncodeH265ReferenceListsInfo(segment); }

    /// Creates `StdVideoEncodeH265ReferenceListsInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoEncodeH265ReferenceListsInfo ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new StdVideoEncodeH265ReferenceListsInfo(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `StdVideoEncodeH265ReferenceListsInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoEncodeH265ReferenceListsInfo ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new StdVideoEncodeH265ReferenceListsInfo(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `StdVideoEncodeH265ReferenceListsInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoEncodeH265ReferenceListsInfo`
    public static StdVideoEncodeH265ReferenceListsInfo alloc(SegmentAllocator allocator) { return new StdVideoEncodeH265ReferenceListsInfo(allocator.allocate(LAYOUT)); }

    /// Allocates a `StdVideoEncodeH265ReferenceListsInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `StdVideoEncodeH265ReferenceListsInfo`
    public static StdVideoEncodeH265ReferenceListsInfo alloc(SegmentAllocator allocator, long count) { return new StdVideoEncodeH265ReferenceListsInfo(allocator.allocate(LAYOUT, count)); }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("StdVideoEncodeH265ReferenceListsInfoFlags") java.lang.foreign.MemorySegment get_flags(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_flags.get(segment, 0L, index); }
    /// {@return `flags`}
    /// @param segment the segment of the struct
    public static @CType("StdVideoEncodeH265ReferenceListsInfoFlags") java.lang.foreign.MemorySegment get_flags(MemorySegment segment) { return StdVideoEncodeH265ReferenceListsInfo.get_flags(segment, 0L); }
    /// {@return `flags` at the given index}
    /// @param index the index
    public @CType("StdVideoEncodeH265ReferenceListsInfoFlags") java.lang.foreign.MemorySegment flagsAt(long index) { return StdVideoEncodeH265ReferenceListsInfo.get_flags(this.segment(), index); }
    /// {@return `flags`}
    public @CType("StdVideoEncodeH265ReferenceListsInfoFlags") java.lang.foreign.MemorySegment flags() { return StdVideoEncodeH265ReferenceListsInfo.get_flags(this.segment()); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_flags(MemorySegment segment, long index, @CType("StdVideoEncodeH265ReferenceListsInfoFlags") java.lang.foreign.MemorySegment value) { VH_flags.set(segment, 0L, index, value); }
    /// Sets `flags` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_flags(MemorySegment segment, @CType("StdVideoEncodeH265ReferenceListsInfoFlags") java.lang.foreign.MemorySegment value) { StdVideoEncodeH265ReferenceListsInfo.set_flags(segment, 0L, value); }
    /// Sets `flags` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265ReferenceListsInfo flagsAt(long index, @CType("StdVideoEncodeH265ReferenceListsInfoFlags") java.lang.foreign.MemorySegment value) { StdVideoEncodeH265ReferenceListsInfo.set_flags(this.segment(), index, value); return this; }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265ReferenceListsInfo flags(@CType("StdVideoEncodeH265ReferenceListsInfoFlags") java.lang.foreign.MemorySegment value) { StdVideoEncodeH265ReferenceListsInfo.set_flags(this.segment(), value); return this; }

    /// {@return `num_ref_idx_l0_active_minus1` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t") byte get_num_ref_idx_l0_active_minus1(MemorySegment segment, long index) { return (byte) VH_num_ref_idx_l0_active_minus1.get(segment, 0L, index); }
    /// {@return `num_ref_idx_l0_active_minus1`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t") byte get_num_ref_idx_l0_active_minus1(MemorySegment segment) { return StdVideoEncodeH265ReferenceListsInfo.get_num_ref_idx_l0_active_minus1(segment, 0L); }
    /// {@return `num_ref_idx_l0_active_minus1` at the given index}
    /// @param index the index
    public @CType("uint8_t") byte num_ref_idx_l0_active_minus1At(long index) { return StdVideoEncodeH265ReferenceListsInfo.get_num_ref_idx_l0_active_minus1(this.segment(), index); }
    /// {@return `num_ref_idx_l0_active_minus1`}
    public @CType("uint8_t") byte num_ref_idx_l0_active_minus1() { return StdVideoEncodeH265ReferenceListsInfo.get_num_ref_idx_l0_active_minus1(this.segment()); }
    /// Sets `num_ref_idx_l0_active_minus1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_num_ref_idx_l0_active_minus1(MemorySegment segment, long index, @CType("uint8_t") byte value) { VH_num_ref_idx_l0_active_minus1.set(segment, 0L, index, value); }
    /// Sets `num_ref_idx_l0_active_minus1` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_num_ref_idx_l0_active_minus1(MemorySegment segment, @CType("uint8_t") byte value) { StdVideoEncodeH265ReferenceListsInfo.set_num_ref_idx_l0_active_minus1(segment, 0L, value); }
    /// Sets `num_ref_idx_l0_active_minus1` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265ReferenceListsInfo num_ref_idx_l0_active_minus1At(long index, @CType("uint8_t") byte value) { StdVideoEncodeH265ReferenceListsInfo.set_num_ref_idx_l0_active_minus1(this.segment(), index, value); return this; }
    /// Sets `num_ref_idx_l0_active_minus1` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265ReferenceListsInfo num_ref_idx_l0_active_minus1(@CType("uint8_t") byte value) { StdVideoEncodeH265ReferenceListsInfo.set_num_ref_idx_l0_active_minus1(this.segment(), value); return this; }

    /// {@return `num_ref_idx_l1_active_minus1` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t") byte get_num_ref_idx_l1_active_minus1(MemorySegment segment, long index) { return (byte) VH_num_ref_idx_l1_active_minus1.get(segment, 0L, index); }
    /// {@return `num_ref_idx_l1_active_minus1`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t") byte get_num_ref_idx_l1_active_minus1(MemorySegment segment) { return StdVideoEncodeH265ReferenceListsInfo.get_num_ref_idx_l1_active_minus1(segment, 0L); }
    /// {@return `num_ref_idx_l1_active_minus1` at the given index}
    /// @param index the index
    public @CType("uint8_t") byte num_ref_idx_l1_active_minus1At(long index) { return StdVideoEncodeH265ReferenceListsInfo.get_num_ref_idx_l1_active_minus1(this.segment(), index); }
    /// {@return `num_ref_idx_l1_active_minus1`}
    public @CType("uint8_t") byte num_ref_idx_l1_active_minus1() { return StdVideoEncodeH265ReferenceListsInfo.get_num_ref_idx_l1_active_minus1(this.segment()); }
    /// Sets `num_ref_idx_l1_active_minus1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_num_ref_idx_l1_active_minus1(MemorySegment segment, long index, @CType("uint8_t") byte value) { VH_num_ref_idx_l1_active_minus1.set(segment, 0L, index, value); }
    /// Sets `num_ref_idx_l1_active_minus1` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_num_ref_idx_l1_active_minus1(MemorySegment segment, @CType("uint8_t") byte value) { StdVideoEncodeH265ReferenceListsInfo.set_num_ref_idx_l1_active_minus1(segment, 0L, value); }
    /// Sets `num_ref_idx_l1_active_minus1` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265ReferenceListsInfo num_ref_idx_l1_active_minus1At(long index, @CType("uint8_t") byte value) { StdVideoEncodeH265ReferenceListsInfo.set_num_ref_idx_l1_active_minus1(this.segment(), index, value); return this; }
    /// Sets `num_ref_idx_l1_active_minus1` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265ReferenceListsInfo num_ref_idx_l1_active_minus1(@CType("uint8_t") byte value) { StdVideoEncodeH265ReferenceListsInfo.set_num_ref_idx_l1_active_minus1(this.segment(), value); return this; }

    /// {@return `RefPicList0` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t [STD_VIDEO_H265_MAX_NUM_LIST_REF]") byte get_RefPicList0(MemorySegment segment, long index) { return (byte) VH_RefPicList0.get(segment, 0L, index); }
    /// {@return `RefPicList0`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t [STD_VIDEO_H265_MAX_NUM_LIST_REF]") byte get_RefPicList0(MemorySegment segment) { return StdVideoEncodeH265ReferenceListsInfo.get_RefPicList0(segment, 0L); }
    /// {@return `RefPicList0` at the given index}
    /// @param index the index
    public @CType("uint8_t [STD_VIDEO_H265_MAX_NUM_LIST_REF]") byte RefPicList0At(long index) { return StdVideoEncodeH265ReferenceListsInfo.get_RefPicList0(this.segment(), index); }
    /// {@return `RefPicList0`}
    public @CType("uint8_t [STD_VIDEO_H265_MAX_NUM_LIST_REF]") byte RefPicList0() { return StdVideoEncodeH265ReferenceListsInfo.get_RefPicList0(this.segment()); }
    /// Sets `RefPicList0` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_RefPicList0(MemorySegment segment, long index, @CType("uint8_t [STD_VIDEO_H265_MAX_NUM_LIST_REF]") byte value) { VH_RefPicList0.set(segment, 0L, index, value); }
    /// Sets `RefPicList0` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_RefPicList0(MemorySegment segment, @CType("uint8_t [STD_VIDEO_H265_MAX_NUM_LIST_REF]") byte value) { StdVideoEncodeH265ReferenceListsInfo.set_RefPicList0(segment, 0L, value); }
    /// Sets `RefPicList0` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265ReferenceListsInfo RefPicList0At(long index, @CType("uint8_t [STD_VIDEO_H265_MAX_NUM_LIST_REF]") byte value) { StdVideoEncodeH265ReferenceListsInfo.set_RefPicList0(this.segment(), index, value); return this; }
    /// Sets `RefPicList0` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265ReferenceListsInfo RefPicList0(@CType("uint8_t [STD_VIDEO_H265_MAX_NUM_LIST_REF]") byte value) { StdVideoEncodeH265ReferenceListsInfo.set_RefPicList0(this.segment(), value); return this; }

    /// {@return `RefPicList1` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t [STD_VIDEO_H265_MAX_NUM_LIST_REF]") byte get_RefPicList1(MemorySegment segment, long index) { return (byte) VH_RefPicList1.get(segment, 0L, index); }
    /// {@return `RefPicList1`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t [STD_VIDEO_H265_MAX_NUM_LIST_REF]") byte get_RefPicList1(MemorySegment segment) { return StdVideoEncodeH265ReferenceListsInfo.get_RefPicList1(segment, 0L); }
    /// {@return `RefPicList1` at the given index}
    /// @param index the index
    public @CType("uint8_t [STD_VIDEO_H265_MAX_NUM_LIST_REF]") byte RefPicList1At(long index) { return StdVideoEncodeH265ReferenceListsInfo.get_RefPicList1(this.segment(), index); }
    /// {@return `RefPicList1`}
    public @CType("uint8_t [STD_VIDEO_H265_MAX_NUM_LIST_REF]") byte RefPicList1() { return StdVideoEncodeH265ReferenceListsInfo.get_RefPicList1(this.segment()); }
    /// Sets `RefPicList1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_RefPicList1(MemorySegment segment, long index, @CType("uint8_t [STD_VIDEO_H265_MAX_NUM_LIST_REF]") byte value) { VH_RefPicList1.set(segment, 0L, index, value); }
    /// Sets `RefPicList1` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_RefPicList1(MemorySegment segment, @CType("uint8_t [STD_VIDEO_H265_MAX_NUM_LIST_REF]") byte value) { StdVideoEncodeH265ReferenceListsInfo.set_RefPicList1(segment, 0L, value); }
    /// Sets `RefPicList1` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265ReferenceListsInfo RefPicList1At(long index, @CType("uint8_t [STD_VIDEO_H265_MAX_NUM_LIST_REF]") byte value) { StdVideoEncodeH265ReferenceListsInfo.set_RefPicList1(this.segment(), index, value); return this; }
    /// Sets `RefPicList1` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265ReferenceListsInfo RefPicList1(@CType("uint8_t [STD_VIDEO_H265_MAX_NUM_LIST_REF]") byte value) { StdVideoEncodeH265ReferenceListsInfo.set_RefPicList1(this.segment(), value); return this; }

    /// {@return `list_entry_l0` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t [STD_VIDEO_H265_MAX_NUM_LIST_REF]") byte get_list_entry_l0(MemorySegment segment, long index) { return (byte) VH_list_entry_l0.get(segment, 0L, index); }
    /// {@return `list_entry_l0`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t [STD_VIDEO_H265_MAX_NUM_LIST_REF]") byte get_list_entry_l0(MemorySegment segment) { return StdVideoEncodeH265ReferenceListsInfo.get_list_entry_l0(segment, 0L); }
    /// {@return `list_entry_l0` at the given index}
    /// @param index the index
    public @CType("uint8_t [STD_VIDEO_H265_MAX_NUM_LIST_REF]") byte list_entry_l0At(long index) { return StdVideoEncodeH265ReferenceListsInfo.get_list_entry_l0(this.segment(), index); }
    /// {@return `list_entry_l0`}
    public @CType("uint8_t [STD_VIDEO_H265_MAX_NUM_LIST_REF]") byte list_entry_l0() { return StdVideoEncodeH265ReferenceListsInfo.get_list_entry_l0(this.segment()); }
    /// Sets `list_entry_l0` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_list_entry_l0(MemorySegment segment, long index, @CType("uint8_t [STD_VIDEO_H265_MAX_NUM_LIST_REF]") byte value) { VH_list_entry_l0.set(segment, 0L, index, value); }
    /// Sets `list_entry_l0` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_list_entry_l0(MemorySegment segment, @CType("uint8_t [STD_VIDEO_H265_MAX_NUM_LIST_REF]") byte value) { StdVideoEncodeH265ReferenceListsInfo.set_list_entry_l0(segment, 0L, value); }
    /// Sets `list_entry_l0` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265ReferenceListsInfo list_entry_l0At(long index, @CType("uint8_t [STD_VIDEO_H265_MAX_NUM_LIST_REF]") byte value) { StdVideoEncodeH265ReferenceListsInfo.set_list_entry_l0(this.segment(), index, value); return this; }
    /// Sets `list_entry_l0` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265ReferenceListsInfo list_entry_l0(@CType("uint8_t [STD_VIDEO_H265_MAX_NUM_LIST_REF]") byte value) { StdVideoEncodeH265ReferenceListsInfo.set_list_entry_l0(this.segment(), value); return this; }

    /// {@return `list_entry_l1` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t [STD_VIDEO_H265_MAX_NUM_LIST_REF]") byte get_list_entry_l1(MemorySegment segment, long index) { return (byte) VH_list_entry_l1.get(segment, 0L, index); }
    /// {@return `list_entry_l1`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t [STD_VIDEO_H265_MAX_NUM_LIST_REF]") byte get_list_entry_l1(MemorySegment segment) { return StdVideoEncodeH265ReferenceListsInfo.get_list_entry_l1(segment, 0L); }
    /// {@return `list_entry_l1` at the given index}
    /// @param index the index
    public @CType("uint8_t [STD_VIDEO_H265_MAX_NUM_LIST_REF]") byte list_entry_l1At(long index) { return StdVideoEncodeH265ReferenceListsInfo.get_list_entry_l1(this.segment(), index); }
    /// {@return `list_entry_l1`}
    public @CType("uint8_t [STD_VIDEO_H265_MAX_NUM_LIST_REF]") byte list_entry_l1() { return StdVideoEncodeH265ReferenceListsInfo.get_list_entry_l1(this.segment()); }
    /// Sets `list_entry_l1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_list_entry_l1(MemorySegment segment, long index, @CType("uint8_t [STD_VIDEO_H265_MAX_NUM_LIST_REF]") byte value) { VH_list_entry_l1.set(segment, 0L, index, value); }
    /// Sets `list_entry_l1` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_list_entry_l1(MemorySegment segment, @CType("uint8_t [STD_VIDEO_H265_MAX_NUM_LIST_REF]") byte value) { StdVideoEncodeH265ReferenceListsInfo.set_list_entry_l1(segment, 0L, value); }
    /// Sets `list_entry_l1` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265ReferenceListsInfo list_entry_l1At(long index, @CType("uint8_t [STD_VIDEO_H265_MAX_NUM_LIST_REF]") byte value) { StdVideoEncodeH265ReferenceListsInfo.set_list_entry_l1(this.segment(), index, value); return this; }
    /// Sets `list_entry_l1` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265ReferenceListsInfo list_entry_l1(@CType("uint8_t [STD_VIDEO_H265_MAX_NUM_LIST_REF]") byte value) { StdVideoEncodeH265ReferenceListsInfo.set_list_entry_l1(this.segment(), value); return this; }

}
