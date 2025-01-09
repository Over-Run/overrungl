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
/// ### PicOrderCntVal
/// [VarHandle][#VH_PicOrderCntVal] - [Getter][#PicOrderCntVal()] - [Setter][#PicOrderCntVal(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct StdVideoDecodeH265ReferenceInfo {
///     StdVideoDecodeH265ReferenceInfoFlags flags;
///     int32_t PicOrderCntVal;
/// } StdVideoDecodeH265ReferenceInfo;
/// ```
public final class StdVideoDecodeH265ReferenceInfo extends Struct {
    /// The struct layout of `StdVideoDecodeH265ReferenceInfo`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        StdVideoDecodeH265ReferenceInfoFlags.LAYOUT.withName("flags"),
        ValueLayout.JAVA_INT.withName("PicOrderCntVal")
    );
    /// The [VarHandle] of `flags` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    /// The [VarHandle] of `PicOrderCntVal` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_PicOrderCntVal = LAYOUT.arrayElementVarHandle(PathElement.groupElement("PicOrderCntVal"));

    /// Creates `StdVideoDecodeH265ReferenceInfo` with the given segment.
    /// @param segment the memory segment
    public StdVideoDecodeH265ReferenceInfo(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `StdVideoDecodeH265ReferenceInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoDecodeH265ReferenceInfo of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new StdVideoDecodeH265ReferenceInfo(segment); }

    /// Creates `StdVideoDecodeH265ReferenceInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoDecodeH265ReferenceInfo ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new StdVideoDecodeH265ReferenceInfo(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `StdVideoDecodeH265ReferenceInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoDecodeH265ReferenceInfo ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new StdVideoDecodeH265ReferenceInfo(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `StdVideoDecodeH265ReferenceInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoDecodeH265ReferenceInfo`
    public static StdVideoDecodeH265ReferenceInfo alloc(SegmentAllocator allocator) { return new StdVideoDecodeH265ReferenceInfo(allocator.allocate(LAYOUT)); }

    /// Allocates a `StdVideoDecodeH265ReferenceInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `StdVideoDecodeH265ReferenceInfo`
    public static StdVideoDecodeH265ReferenceInfo alloc(SegmentAllocator allocator, long count) { return new StdVideoDecodeH265ReferenceInfo(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `StdVideoDecodeH265ReferenceInfo`.
    /// @param index the index of the struct buffer
    /// @return the slice of `StdVideoDecodeH265ReferenceInfo`
    public StdVideoDecodeH265ReferenceInfo asSlice(long index) { return new StdVideoDecodeH265ReferenceInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `StdVideoDecodeH265ReferenceInfo`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `StdVideoDecodeH265ReferenceInfo`
    public StdVideoDecodeH265ReferenceInfo asSlice(long index, long count) { return new StdVideoDecodeH265ReferenceInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("StdVideoDecodeH265ReferenceInfoFlags") java.lang.foreign.MemorySegment get_flags(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_flags.get(segment, 0L, index); }
    /// {@return `flags`}
    /// @param segment the segment of the struct
    public static @CType("StdVideoDecodeH265ReferenceInfoFlags") java.lang.foreign.MemorySegment get_flags(MemorySegment segment) { return StdVideoDecodeH265ReferenceInfo.get_flags(segment, 0L); }
    /// {@return `flags` at the given index}
    /// @param index the index
    public @CType("StdVideoDecodeH265ReferenceInfoFlags") java.lang.foreign.MemorySegment flagsAt(long index) { return StdVideoDecodeH265ReferenceInfo.get_flags(this.segment(), index); }
    /// {@return `flags`}
    public @CType("StdVideoDecodeH265ReferenceInfoFlags") java.lang.foreign.MemorySegment flags() { return StdVideoDecodeH265ReferenceInfo.get_flags(this.segment()); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_flags(MemorySegment segment, long index, @CType("StdVideoDecodeH265ReferenceInfoFlags") java.lang.foreign.MemorySegment value) { VH_flags.set(segment, 0L, index, value); }
    /// Sets `flags` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_flags(MemorySegment segment, @CType("StdVideoDecodeH265ReferenceInfoFlags") java.lang.foreign.MemorySegment value) { StdVideoDecodeH265ReferenceInfo.set_flags(segment, 0L, value); }
    /// Sets `flags` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoDecodeH265ReferenceInfo flagsAt(long index, @CType("StdVideoDecodeH265ReferenceInfoFlags") java.lang.foreign.MemorySegment value) { StdVideoDecodeH265ReferenceInfo.set_flags(this.segment(), index, value); return this; }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoDecodeH265ReferenceInfo flags(@CType("StdVideoDecodeH265ReferenceInfoFlags") java.lang.foreign.MemorySegment value) { StdVideoDecodeH265ReferenceInfo.set_flags(this.segment(), value); return this; }

    /// {@return `PicOrderCntVal` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("int32_t") int get_PicOrderCntVal(MemorySegment segment, long index) { return (int) VH_PicOrderCntVal.get(segment, 0L, index); }
    /// {@return `PicOrderCntVal`}
    /// @param segment the segment of the struct
    public static @CType("int32_t") int get_PicOrderCntVal(MemorySegment segment) { return StdVideoDecodeH265ReferenceInfo.get_PicOrderCntVal(segment, 0L); }
    /// {@return `PicOrderCntVal` at the given index}
    /// @param index the index
    public @CType("int32_t") int PicOrderCntValAt(long index) { return StdVideoDecodeH265ReferenceInfo.get_PicOrderCntVal(this.segment(), index); }
    /// {@return `PicOrderCntVal`}
    public @CType("int32_t") int PicOrderCntVal() { return StdVideoDecodeH265ReferenceInfo.get_PicOrderCntVal(this.segment()); }
    /// Sets `PicOrderCntVal` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_PicOrderCntVal(MemorySegment segment, long index, @CType("int32_t") int value) { VH_PicOrderCntVal.set(segment, 0L, index, value); }
    /// Sets `PicOrderCntVal` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_PicOrderCntVal(MemorySegment segment, @CType("int32_t") int value) { StdVideoDecodeH265ReferenceInfo.set_PicOrderCntVal(segment, 0L, value); }
    /// Sets `PicOrderCntVal` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoDecodeH265ReferenceInfo PicOrderCntValAt(long index, @CType("int32_t") int value) { StdVideoDecodeH265ReferenceInfo.set_PicOrderCntVal(this.segment(), index, value); return this; }
    /// Sets `PicOrderCntVal` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoDecodeH265ReferenceInfo PicOrderCntVal(@CType("int32_t") int value) { StdVideoDecodeH265ReferenceInfo.set_PicOrderCntVal(this.segment(), value); return this; }

}
