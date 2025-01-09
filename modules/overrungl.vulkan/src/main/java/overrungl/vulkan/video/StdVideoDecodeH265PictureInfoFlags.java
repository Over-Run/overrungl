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
/// ### IrapPicFlag
/// [VarHandle][#VH_IrapPicFlag] - [Getter][#IrapPicFlag()] - [Setter][#IrapPicFlag(int)]
/// ### IdrPicFlag
/// [VarHandle][#VH_IdrPicFlag] - [Getter][#IdrPicFlag()] - [Setter][#IdrPicFlag(int)]
/// ### IsReference
/// [VarHandle][#VH_IsReference] - [Getter][#IsReference()] - [Setter][#IsReference(int)]
/// ### short_term_ref_pic_set_sps_flag
/// [VarHandle][#VH_short_term_ref_pic_set_sps_flag] - [Getter][#short_term_ref_pic_set_sps_flag()] - [Setter][#short_term_ref_pic_set_sps_flag(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct StdVideoDecodeH265PictureInfoFlags {
///     uint32_t : 1 IrapPicFlag;
///     uint32_t : 1 IdrPicFlag;
///     uint32_t : 1 IsReference;
///     uint32_t : 1 short_term_ref_pic_set_sps_flag;
/// } StdVideoDecodeH265PictureInfoFlags;
/// ```
public final class StdVideoDecodeH265PictureInfoFlags extends Struct {
    /// The struct layout of `StdVideoDecodeH265PictureInfoFlags`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("IrapPicFlag"),
        ValueLayout.JAVA_INT.withName("IdrPicFlag"),
        ValueLayout.JAVA_INT.withName("IsReference"),
        ValueLayout.JAVA_INT.withName("short_term_ref_pic_set_sps_flag")
    );
    /// The [VarHandle] of `IrapPicFlag` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_IrapPicFlag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("IrapPicFlag"));
    /// The [VarHandle] of `IdrPicFlag` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_IdrPicFlag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("IdrPicFlag"));
    /// The [VarHandle] of `IsReference` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_IsReference = LAYOUT.arrayElementVarHandle(PathElement.groupElement("IsReference"));
    /// The [VarHandle] of `short_term_ref_pic_set_sps_flag` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_short_term_ref_pic_set_sps_flag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("short_term_ref_pic_set_sps_flag"));

    /// Creates `StdVideoDecodeH265PictureInfoFlags` with the given segment.
    /// @param segment the memory segment
    public StdVideoDecodeH265PictureInfoFlags(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `StdVideoDecodeH265PictureInfoFlags` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoDecodeH265PictureInfoFlags of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new StdVideoDecodeH265PictureInfoFlags(segment); }

    /// Creates `StdVideoDecodeH265PictureInfoFlags` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoDecodeH265PictureInfoFlags ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new StdVideoDecodeH265PictureInfoFlags(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `StdVideoDecodeH265PictureInfoFlags` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoDecodeH265PictureInfoFlags ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new StdVideoDecodeH265PictureInfoFlags(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `StdVideoDecodeH265PictureInfoFlags` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoDecodeH265PictureInfoFlags`
    public static StdVideoDecodeH265PictureInfoFlags alloc(SegmentAllocator allocator) { return new StdVideoDecodeH265PictureInfoFlags(allocator.allocate(LAYOUT)); }

    /// Allocates a `StdVideoDecodeH265PictureInfoFlags` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `StdVideoDecodeH265PictureInfoFlags`
    public static StdVideoDecodeH265PictureInfoFlags alloc(SegmentAllocator allocator, long count) { return new StdVideoDecodeH265PictureInfoFlags(allocator.allocate(LAYOUT, count)); }

    /// {@return `IrapPicFlag` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_IrapPicFlag(MemorySegment segment, long index) { return (int) VH_IrapPicFlag.get(segment, 0L, index); }
    /// {@return `IrapPicFlag`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_IrapPicFlag(MemorySegment segment) { return StdVideoDecodeH265PictureInfoFlags.get_IrapPicFlag(segment, 0L); }
    /// {@return `IrapPicFlag` at the given index}
    /// @param index the index
    public @CType("uint32_t : 1") int IrapPicFlagAt(long index) { return StdVideoDecodeH265PictureInfoFlags.get_IrapPicFlag(this.segment(), index); }
    /// {@return `IrapPicFlag`}
    public @CType("uint32_t : 1") int IrapPicFlag() { return StdVideoDecodeH265PictureInfoFlags.get_IrapPicFlag(this.segment()); }
    /// Sets `IrapPicFlag` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_IrapPicFlag(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_IrapPicFlag.set(segment, 0L, index, value); }
    /// Sets `IrapPicFlag` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_IrapPicFlag(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoDecodeH265PictureInfoFlags.set_IrapPicFlag(segment, 0L, value); }
    /// Sets `IrapPicFlag` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoDecodeH265PictureInfoFlags IrapPicFlagAt(long index, @CType("uint32_t : 1") int value) { StdVideoDecodeH265PictureInfoFlags.set_IrapPicFlag(this.segment(), index, value); return this; }
    /// Sets `IrapPicFlag` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoDecodeH265PictureInfoFlags IrapPicFlag(@CType("uint32_t : 1") int value) { StdVideoDecodeH265PictureInfoFlags.set_IrapPicFlag(this.segment(), value); return this; }

    /// {@return `IdrPicFlag` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_IdrPicFlag(MemorySegment segment, long index) { return (int) VH_IdrPicFlag.get(segment, 0L, index); }
    /// {@return `IdrPicFlag`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_IdrPicFlag(MemorySegment segment) { return StdVideoDecodeH265PictureInfoFlags.get_IdrPicFlag(segment, 0L); }
    /// {@return `IdrPicFlag` at the given index}
    /// @param index the index
    public @CType("uint32_t : 1") int IdrPicFlagAt(long index) { return StdVideoDecodeH265PictureInfoFlags.get_IdrPicFlag(this.segment(), index); }
    /// {@return `IdrPicFlag`}
    public @CType("uint32_t : 1") int IdrPicFlag() { return StdVideoDecodeH265PictureInfoFlags.get_IdrPicFlag(this.segment()); }
    /// Sets `IdrPicFlag` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_IdrPicFlag(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_IdrPicFlag.set(segment, 0L, index, value); }
    /// Sets `IdrPicFlag` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_IdrPicFlag(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoDecodeH265PictureInfoFlags.set_IdrPicFlag(segment, 0L, value); }
    /// Sets `IdrPicFlag` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoDecodeH265PictureInfoFlags IdrPicFlagAt(long index, @CType("uint32_t : 1") int value) { StdVideoDecodeH265PictureInfoFlags.set_IdrPicFlag(this.segment(), index, value); return this; }
    /// Sets `IdrPicFlag` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoDecodeH265PictureInfoFlags IdrPicFlag(@CType("uint32_t : 1") int value) { StdVideoDecodeH265PictureInfoFlags.set_IdrPicFlag(this.segment(), value); return this; }

    /// {@return `IsReference` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_IsReference(MemorySegment segment, long index) { return (int) VH_IsReference.get(segment, 0L, index); }
    /// {@return `IsReference`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_IsReference(MemorySegment segment) { return StdVideoDecodeH265PictureInfoFlags.get_IsReference(segment, 0L); }
    /// {@return `IsReference` at the given index}
    /// @param index the index
    public @CType("uint32_t : 1") int IsReferenceAt(long index) { return StdVideoDecodeH265PictureInfoFlags.get_IsReference(this.segment(), index); }
    /// {@return `IsReference`}
    public @CType("uint32_t : 1") int IsReference() { return StdVideoDecodeH265PictureInfoFlags.get_IsReference(this.segment()); }
    /// Sets `IsReference` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_IsReference(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_IsReference.set(segment, 0L, index, value); }
    /// Sets `IsReference` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_IsReference(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoDecodeH265PictureInfoFlags.set_IsReference(segment, 0L, value); }
    /// Sets `IsReference` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoDecodeH265PictureInfoFlags IsReferenceAt(long index, @CType("uint32_t : 1") int value) { StdVideoDecodeH265PictureInfoFlags.set_IsReference(this.segment(), index, value); return this; }
    /// Sets `IsReference` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoDecodeH265PictureInfoFlags IsReference(@CType("uint32_t : 1") int value) { StdVideoDecodeH265PictureInfoFlags.set_IsReference(this.segment(), value); return this; }

    /// {@return `short_term_ref_pic_set_sps_flag` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_short_term_ref_pic_set_sps_flag(MemorySegment segment, long index) { return (int) VH_short_term_ref_pic_set_sps_flag.get(segment, 0L, index); }
    /// {@return `short_term_ref_pic_set_sps_flag`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_short_term_ref_pic_set_sps_flag(MemorySegment segment) { return StdVideoDecodeH265PictureInfoFlags.get_short_term_ref_pic_set_sps_flag(segment, 0L); }
    /// {@return `short_term_ref_pic_set_sps_flag` at the given index}
    /// @param index the index
    public @CType("uint32_t : 1") int short_term_ref_pic_set_sps_flagAt(long index) { return StdVideoDecodeH265PictureInfoFlags.get_short_term_ref_pic_set_sps_flag(this.segment(), index); }
    /// {@return `short_term_ref_pic_set_sps_flag`}
    public @CType("uint32_t : 1") int short_term_ref_pic_set_sps_flag() { return StdVideoDecodeH265PictureInfoFlags.get_short_term_ref_pic_set_sps_flag(this.segment()); }
    /// Sets `short_term_ref_pic_set_sps_flag` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_short_term_ref_pic_set_sps_flag(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_short_term_ref_pic_set_sps_flag.set(segment, 0L, index, value); }
    /// Sets `short_term_ref_pic_set_sps_flag` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_short_term_ref_pic_set_sps_flag(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoDecodeH265PictureInfoFlags.set_short_term_ref_pic_set_sps_flag(segment, 0L, value); }
    /// Sets `short_term_ref_pic_set_sps_flag` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoDecodeH265PictureInfoFlags short_term_ref_pic_set_sps_flagAt(long index, @CType("uint32_t : 1") int value) { StdVideoDecodeH265PictureInfoFlags.set_short_term_ref_pic_set_sps_flag(this.segment(), index, value); return this; }
    /// Sets `short_term_ref_pic_set_sps_flag` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoDecodeH265PictureInfoFlags short_term_ref_pic_set_sps_flag(@CType("uint32_t : 1") int value) { StdVideoDecodeH265PictureInfoFlags.set_short_term_ref_pic_set_sps_flag(this.segment(), value); return this; }

}
