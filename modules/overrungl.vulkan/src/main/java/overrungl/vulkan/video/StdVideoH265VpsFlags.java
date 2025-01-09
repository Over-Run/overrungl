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
/// ### vps_temporal_id_nesting_flag
/// [VarHandle][#VH_vps_temporal_id_nesting_flag] - [Getter][#vps_temporal_id_nesting_flag()] - [Setter][#vps_temporal_id_nesting_flag(int)]
/// ### vps_sub_layer_ordering_info_present_flag
/// [VarHandle][#VH_vps_sub_layer_ordering_info_present_flag] - [Getter][#vps_sub_layer_ordering_info_present_flag()] - [Setter][#vps_sub_layer_ordering_info_present_flag(int)]
/// ### vps_timing_info_present_flag
/// [VarHandle][#VH_vps_timing_info_present_flag] - [Getter][#vps_timing_info_present_flag()] - [Setter][#vps_timing_info_present_flag(int)]
/// ### vps_poc_proportional_to_timing_flag
/// [VarHandle][#VH_vps_poc_proportional_to_timing_flag] - [Getter][#vps_poc_proportional_to_timing_flag()] - [Setter][#vps_poc_proportional_to_timing_flag(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct StdVideoH265VpsFlags {
///     uint32_t : 1 vps_temporal_id_nesting_flag;
///     uint32_t : 1 vps_sub_layer_ordering_info_present_flag;
///     uint32_t : 1 vps_timing_info_present_flag;
///     uint32_t : 1 vps_poc_proportional_to_timing_flag;
/// } StdVideoH265VpsFlags;
/// ```
public final class StdVideoH265VpsFlags extends Struct {
    /// The struct layout of `StdVideoH265VpsFlags`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("vps_temporal_id_nesting_flag"),
        ValueLayout.JAVA_INT.withName("vps_sub_layer_ordering_info_present_flag"),
        ValueLayout.JAVA_INT.withName("vps_timing_info_present_flag"),
        ValueLayout.JAVA_INT.withName("vps_poc_proportional_to_timing_flag")
    );
    /// The [VarHandle] of `vps_temporal_id_nesting_flag` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_vps_temporal_id_nesting_flag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("vps_temporal_id_nesting_flag"));
    /// The [VarHandle] of `vps_sub_layer_ordering_info_present_flag` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_vps_sub_layer_ordering_info_present_flag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("vps_sub_layer_ordering_info_present_flag"));
    /// The [VarHandle] of `vps_timing_info_present_flag` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_vps_timing_info_present_flag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("vps_timing_info_present_flag"));
    /// The [VarHandle] of `vps_poc_proportional_to_timing_flag` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_vps_poc_proportional_to_timing_flag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("vps_poc_proportional_to_timing_flag"));

    /// Creates `StdVideoH265VpsFlags` with the given segment.
    /// @param segment the memory segment
    public StdVideoH265VpsFlags(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `StdVideoH265VpsFlags` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoH265VpsFlags of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new StdVideoH265VpsFlags(segment); }

    /// Creates `StdVideoH265VpsFlags` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoH265VpsFlags ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new StdVideoH265VpsFlags(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `StdVideoH265VpsFlags` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoH265VpsFlags ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new StdVideoH265VpsFlags(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `StdVideoH265VpsFlags` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoH265VpsFlags`
    public static StdVideoH265VpsFlags alloc(SegmentAllocator allocator) { return new StdVideoH265VpsFlags(allocator.allocate(LAYOUT)); }

    /// Allocates a `StdVideoH265VpsFlags` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `StdVideoH265VpsFlags`
    public static StdVideoH265VpsFlags alloc(SegmentAllocator allocator, long count) { return new StdVideoH265VpsFlags(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `StdVideoH265VpsFlags`.
    /// @param index the index of the struct buffer
    /// @return the slice of `StdVideoH265VpsFlags`
    public StdVideoH265VpsFlags asSlice(long index) { return new StdVideoH265VpsFlags(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `StdVideoH265VpsFlags`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `StdVideoH265VpsFlags`
    public StdVideoH265VpsFlags asSlice(long index, long count) { return new StdVideoH265VpsFlags(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

    /// {@return `vps_temporal_id_nesting_flag` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_vps_temporal_id_nesting_flag(MemorySegment segment, long index) { return (int) VH_vps_temporal_id_nesting_flag.get(segment, 0L, index); }
    /// {@return `vps_temporal_id_nesting_flag`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_vps_temporal_id_nesting_flag(MemorySegment segment) { return StdVideoH265VpsFlags.get_vps_temporal_id_nesting_flag(segment, 0L); }
    /// {@return `vps_temporal_id_nesting_flag` at the given index}
    /// @param index the index
    public @CType("uint32_t : 1") int vps_temporal_id_nesting_flagAt(long index) { return StdVideoH265VpsFlags.get_vps_temporal_id_nesting_flag(this.segment(), index); }
    /// {@return `vps_temporal_id_nesting_flag`}
    public @CType("uint32_t : 1") int vps_temporal_id_nesting_flag() { return StdVideoH265VpsFlags.get_vps_temporal_id_nesting_flag(this.segment()); }
    /// Sets `vps_temporal_id_nesting_flag` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_vps_temporal_id_nesting_flag(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_vps_temporal_id_nesting_flag.set(segment, 0L, index, value); }
    /// Sets `vps_temporal_id_nesting_flag` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_vps_temporal_id_nesting_flag(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoH265VpsFlags.set_vps_temporal_id_nesting_flag(segment, 0L, value); }
    /// Sets `vps_temporal_id_nesting_flag` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoH265VpsFlags vps_temporal_id_nesting_flagAt(long index, @CType("uint32_t : 1") int value) { StdVideoH265VpsFlags.set_vps_temporal_id_nesting_flag(this.segment(), index, value); return this; }
    /// Sets `vps_temporal_id_nesting_flag` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265VpsFlags vps_temporal_id_nesting_flag(@CType("uint32_t : 1") int value) { StdVideoH265VpsFlags.set_vps_temporal_id_nesting_flag(this.segment(), value); return this; }

    /// {@return `vps_sub_layer_ordering_info_present_flag` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_vps_sub_layer_ordering_info_present_flag(MemorySegment segment, long index) { return (int) VH_vps_sub_layer_ordering_info_present_flag.get(segment, 0L, index); }
    /// {@return `vps_sub_layer_ordering_info_present_flag`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_vps_sub_layer_ordering_info_present_flag(MemorySegment segment) { return StdVideoH265VpsFlags.get_vps_sub_layer_ordering_info_present_flag(segment, 0L); }
    /// {@return `vps_sub_layer_ordering_info_present_flag` at the given index}
    /// @param index the index
    public @CType("uint32_t : 1") int vps_sub_layer_ordering_info_present_flagAt(long index) { return StdVideoH265VpsFlags.get_vps_sub_layer_ordering_info_present_flag(this.segment(), index); }
    /// {@return `vps_sub_layer_ordering_info_present_flag`}
    public @CType("uint32_t : 1") int vps_sub_layer_ordering_info_present_flag() { return StdVideoH265VpsFlags.get_vps_sub_layer_ordering_info_present_flag(this.segment()); }
    /// Sets `vps_sub_layer_ordering_info_present_flag` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_vps_sub_layer_ordering_info_present_flag(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_vps_sub_layer_ordering_info_present_flag.set(segment, 0L, index, value); }
    /// Sets `vps_sub_layer_ordering_info_present_flag` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_vps_sub_layer_ordering_info_present_flag(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoH265VpsFlags.set_vps_sub_layer_ordering_info_present_flag(segment, 0L, value); }
    /// Sets `vps_sub_layer_ordering_info_present_flag` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoH265VpsFlags vps_sub_layer_ordering_info_present_flagAt(long index, @CType("uint32_t : 1") int value) { StdVideoH265VpsFlags.set_vps_sub_layer_ordering_info_present_flag(this.segment(), index, value); return this; }
    /// Sets `vps_sub_layer_ordering_info_present_flag` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265VpsFlags vps_sub_layer_ordering_info_present_flag(@CType("uint32_t : 1") int value) { StdVideoH265VpsFlags.set_vps_sub_layer_ordering_info_present_flag(this.segment(), value); return this; }

    /// {@return `vps_timing_info_present_flag` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_vps_timing_info_present_flag(MemorySegment segment, long index) { return (int) VH_vps_timing_info_present_flag.get(segment, 0L, index); }
    /// {@return `vps_timing_info_present_flag`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_vps_timing_info_present_flag(MemorySegment segment) { return StdVideoH265VpsFlags.get_vps_timing_info_present_flag(segment, 0L); }
    /// {@return `vps_timing_info_present_flag` at the given index}
    /// @param index the index
    public @CType("uint32_t : 1") int vps_timing_info_present_flagAt(long index) { return StdVideoH265VpsFlags.get_vps_timing_info_present_flag(this.segment(), index); }
    /// {@return `vps_timing_info_present_flag`}
    public @CType("uint32_t : 1") int vps_timing_info_present_flag() { return StdVideoH265VpsFlags.get_vps_timing_info_present_flag(this.segment()); }
    /// Sets `vps_timing_info_present_flag` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_vps_timing_info_present_flag(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_vps_timing_info_present_flag.set(segment, 0L, index, value); }
    /// Sets `vps_timing_info_present_flag` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_vps_timing_info_present_flag(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoH265VpsFlags.set_vps_timing_info_present_flag(segment, 0L, value); }
    /// Sets `vps_timing_info_present_flag` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoH265VpsFlags vps_timing_info_present_flagAt(long index, @CType("uint32_t : 1") int value) { StdVideoH265VpsFlags.set_vps_timing_info_present_flag(this.segment(), index, value); return this; }
    /// Sets `vps_timing_info_present_flag` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265VpsFlags vps_timing_info_present_flag(@CType("uint32_t : 1") int value) { StdVideoH265VpsFlags.set_vps_timing_info_present_flag(this.segment(), value); return this; }

    /// {@return `vps_poc_proportional_to_timing_flag` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_vps_poc_proportional_to_timing_flag(MemorySegment segment, long index) { return (int) VH_vps_poc_proportional_to_timing_flag.get(segment, 0L, index); }
    /// {@return `vps_poc_proportional_to_timing_flag`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_vps_poc_proportional_to_timing_flag(MemorySegment segment) { return StdVideoH265VpsFlags.get_vps_poc_proportional_to_timing_flag(segment, 0L); }
    /// {@return `vps_poc_proportional_to_timing_flag` at the given index}
    /// @param index the index
    public @CType("uint32_t : 1") int vps_poc_proportional_to_timing_flagAt(long index) { return StdVideoH265VpsFlags.get_vps_poc_proportional_to_timing_flag(this.segment(), index); }
    /// {@return `vps_poc_proportional_to_timing_flag`}
    public @CType("uint32_t : 1") int vps_poc_proportional_to_timing_flag() { return StdVideoH265VpsFlags.get_vps_poc_proportional_to_timing_flag(this.segment()); }
    /// Sets `vps_poc_proportional_to_timing_flag` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_vps_poc_proportional_to_timing_flag(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_vps_poc_proportional_to_timing_flag.set(segment, 0L, index, value); }
    /// Sets `vps_poc_proportional_to_timing_flag` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_vps_poc_proportional_to_timing_flag(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoH265VpsFlags.set_vps_poc_proportional_to_timing_flag(segment, 0L, value); }
    /// Sets `vps_poc_proportional_to_timing_flag` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoH265VpsFlags vps_poc_proportional_to_timing_flagAt(long index, @CType("uint32_t : 1") int value) { StdVideoH265VpsFlags.set_vps_poc_proportional_to_timing_flag(this.segment(), index, value); return this; }
    /// Sets `vps_poc_proportional_to_timing_flag` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265VpsFlags vps_poc_proportional_to_timing_flag(@CType("uint32_t : 1") int value) { StdVideoH265VpsFlags.set_vps_poc_proportional_to_timing_flag(this.segment(), value); return this; }

}
