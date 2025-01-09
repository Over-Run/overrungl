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
/// ### ref_pic_list_modification_flag_l0
/// [VarHandle][#VH_ref_pic_list_modification_flag_l0] - [Getter][#ref_pic_list_modification_flag_l0()] - [Setter][#ref_pic_list_modification_flag_l0(int)]
/// ### ref_pic_list_modification_flag_l1
/// [VarHandle][#VH_ref_pic_list_modification_flag_l1] - [Getter][#ref_pic_list_modification_flag_l1()] - [Setter][#ref_pic_list_modification_flag_l1(int)]
/// ### reserved
/// [VarHandle][#VH_reserved] - [Getter][#reserved()] - [Setter][#reserved(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct StdVideoEncodeH265ReferenceListsInfoFlags {
///     uint32_t : 1 ref_pic_list_modification_flag_l0;
///     uint32_t : 1 ref_pic_list_modification_flag_l1;
///     uint32_t : 30 reserved;
/// } StdVideoEncodeH265ReferenceListsInfoFlags;
/// ```
public final class StdVideoEncodeH265ReferenceListsInfoFlags extends Struct {
    /// The struct layout of `StdVideoEncodeH265ReferenceListsInfoFlags`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("ref_pic_list_modification_flag_l0"),
        ValueLayout.JAVA_INT.withName("ref_pic_list_modification_flag_l1"),
        ValueLayout.JAVA_INT.withName("reserved")
    );
    /// The [VarHandle] of `ref_pic_list_modification_flag_l0` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_ref_pic_list_modification_flag_l0 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("ref_pic_list_modification_flag_l0"));
    /// The [VarHandle] of `ref_pic_list_modification_flag_l1` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_ref_pic_list_modification_flag_l1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("ref_pic_list_modification_flag_l1"));
    /// The [VarHandle] of `reserved` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_reserved = LAYOUT.arrayElementVarHandle(PathElement.groupElement("reserved"));

    /// Creates `StdVideoEncodeH265ReferenceListsInfoFlags` with the given segment.
    /// @param segment the memory segment
    public StdVideoEncodeH265ReferenceListsInfoFlags(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `StdVideoEncodeH265ReferenceListsInfoFlags` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoEncodeH265ReferenceListsInfoFlags of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new StdVideoEncodeH265ReferenceListsInfoFlags(segment); }

    /// Creates `StdVideoEncodeH265ReferenceListsInfoFlags` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoEncodeH265ReferenceListsInfoFlags ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new StdVideoEncodeH265ReferenceListsInfoFlags(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `StdVideoEncodeH265ReferenceListsInfoFlags` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoEncodeH265ReferenceListsInfoFlags ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new StdVideoEncodeH265ReferenceListsInfoFlags(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `StdVideoEncodeH265ReferenceListsInfoFlags` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoEncodeH265ReferenceListsInfoFlags`
    public static StdVideoEncodeH265ReferenceListsInfoFlags alloc(SegmentAllocator allocator) { return new StdVideoEncodeH265ReferenceListsInfoFlags(allocator.allocate(LAYOUT)); }

    /// Allocates a `StdVideoEncodeH265ReferenceListsInfoFlags` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `StdVideoEncodeH265ReferenceListsInfoFlags`
    public static StdVideoEncodeH265ReferenceListsInfoFlags alloc(SegmentAllocator allocator, long count) { return new StdVideoEncodeH265ReferenceListsInfoFlags(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `StdVideoEncodeH265ReferenceListsInfoFlags`.
    /// @param index the index of the struct buffer
    /// @return the slice of `StdVideoEncodeH265ReferenceListsInfoFlags`
    public StdVideoEncodeH265ReferenceListsInfoFlags asSlice(long index) { return new StdVideoEncodeH265ReferenceListsInfoFlags(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `StdVideoEncodeH265ReferenceListsInfoFlags`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `StdVideoEncodeH265ReferenceListsInfoFlags`
    public StdVideoEncodeH265ReferenceListsInfoFlags asSlice(long index, long count) { return new StdVideoEncodeH265ReferenceListsInfoFlags(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

    /// {@return `ref_pic_list_modification_flag_l0` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_ref_pic_list_modification_flag_l0(MemorySegment segment, long index) { return (int) VH_ref_pic_list_modification_flag_l0.get(segment, 0L, index); }
    /// {@return `ref_pic_list_modification_flag_l0`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_ref_pic_list_modification_flag_l0(MemorySegment segment) { return StdVideoEncodeH265ReferenceListsInfoFlags.get_ref_pic_list_modification_flag_l0(segment, 0L); }
    /// {@return `ref_pic_list_modification_flag_l0` at the given index}
    /// @param index the index
    public @CType("uint32_t : 1") int ref_pic_list_modification_flag_l0At(long index) { return StdVideoEncodeH265ReferenceListsInfoFlags.get_ref_pic_list_modification_flag_l0(this.segment(), index); }
    /// {@return `ref_pic_list_modification_flag_l0`}
    public @CType("uint32_t : 1") int ref_pic_list_modification_flag_l0() { return StdVideoEncodeH265ReferenceListsInfoFlags.get_ref_pic_list_modification_flag_l0(this.segment()); }
    /// Sets `ref_pic_list_modification_flag_l0` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_ref_pic_list_modification_flag_l0(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_ref_pic_list_modification_flag_l0.set(segment, 0L, index, value); }
    /// Sets `ref_pic_list_modification_flag_l0` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_ref_pic_list_modification_flag_l0(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoEncodeH265ReferenceListsInfoFlags.set_ref_pic_list_modification_flag_l0(segment, 0L, value); }
    /// Sets `ref_pic_list_modification_flag_l0` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265ReferenceListsInfoFlags ref_pic_list_modification_flag_l0At(long index, @CType("uint32_t : 1") int value) { StdVideoEncodeH265ReferenceListsInfoFlags.set_ref_pic_list_modification_flag_l0(this.segment(), index, value); return this; }
    /// Sets `ref_pic_list_modification_flag_l0` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265ReferenceListsInfoFlags ref_pic_list_modification_flag_l0(@CType("uint32_t : 1") int value) { StdVideoEncodeH265ReferenceListsInfoFlags.set_ref_pic_list_modification_flag_l0(this.segment(), value); return this; }

    /// {@return `ref_pic_list_modification_flag_l1` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_ref_pic_list_modification_flag_l1(MemorySegment segment, long index) { return (int) VH_ref_pic_list_modification_flag_l1.get(segment, 0L, index); }
    /// {@return `ref_pic_list_modification_flag_l1`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_ref_pic_list_modification_flag_l1(MemorySegment segment) { return StdVideoEncodeH265ReferenceListsInfoFlags.get_ref_pic_list_modification_flag_l1(segment, 0L); }
    /// {@return `ref_pic_list_modification_flag_l1` at the given index}
    /// @param index the index
    public @CType("uint32_t : 1") int ref_pic_list_modification_flag_l1At(long index) { return StdVideoEncodeH265ReferenceListsInfoFlags.get_ref_pic_list_modification_flag_l1(this.segment(), index); }
    /// {@return `ref_pic_list_modification_flag_l1`}
    public @CType("uint32_t : 1") int ref_pic_list_modification_flag_l1() { return StdVideoEncodeH265ReferenceListsInfoFlags.get_ref_pic_list_modification_flag_l1(this.segment()); }
    /// Sets `ref_pic_list_modification_flag_l1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_ref_pic_list_modification_flag_l1(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_ref_pic_list_modification_flag_l1.set(segment, 0L, index, value); }
    /// Sets `ref_pic_list_modification_flag_l1` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_ref_pic_list_modification_flag_l1(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoEncodeH265ReferenceListsInfoFlags.set_ref_pic_list_modification_flag_l1(segment, 0L, value); }
    /// Sets `ref_pic_list_modification_flag_l1` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265ReferenceListsInfoFlags ref_pic_list_modification_flag_l1At(long index, @CType("uint32_t : 1") int value) { StdVideoEncodeH265ReferenceListsInfoFlags.set_ref_pic_list_modification_flag_l1(this.segment(), index, value); return this; }
    /// Sets `ref_pic_list_modification_flag_l1` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265ReferenceListsInfoFlags ref_pic_list_modification_flag_l1(@CType("uint32_t : 1") int value) { StdVideoEncodeH265ReferenceListsInfoFlags.set_ref_pic_list_modification_flag_l1(this.segment(), value); return this; }

    /// {@return `reserved` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 30") int get_reserved(MemorySegment segment, long index) { return (int) VH_reserved.get(segment, 0L, index); }
    /// {@return `reserved`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 30") int get_reserved(MemorySegment segment) { return StdVideoEncodeH265ReferenceListsInfoFlags.get_reserved(segment, 0L); }
    /// {@return `reserved` at the given index}
    /// @param index the index
    public @CType("uint32_t : 30") int reservedAt(long index) { return StdVideoEncodeH265ReferenceListsInfoFlags.get_reserved(this.segment(), index); }
    /// {@return `reserved`}
    public @CType("uint32_t : 30") int reserved() { return StdVideoEncodeH265ReferenceListsInfoFlags.get_reserved(this.segment()); }
    /// Sets `reserved` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_reserved(MemorySegment segment, long index, @CType("uint32_t : 30") int value) { VH_reserved.set(segment, 0L, index, value); }
    /// Sets `reserved` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_reserved(MemorySegment segment, @CType("uint32_t : 30") int value) { StdVideoEncodeH265ReferenceListsInfoFlags.set_reserved(segment, 0L, value); }
    /// Sets `reserved` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265ReferenceListsInfoFlags reservedAt(long index, @CType("uint32_t : 30") int value) { StdVideoEncodeH265ReferenceListsInfoFlags.set_reserved(this.segment(), index, value); return this; }
    /// Sets `reserved` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265ReferenceListsInfoFlags reserved(@CType("uint32_t : 30") int value) { StdVideoEncodeH265ReferenceListsInfoFlags.set_reserved(this.segment(), value); return this; }

}
