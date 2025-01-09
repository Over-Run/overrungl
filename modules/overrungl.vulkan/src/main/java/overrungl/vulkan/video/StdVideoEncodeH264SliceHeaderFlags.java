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
/// ### direct_spatial_mv_pred_flag
/// [VarHandle][#VH_direct_spatial_mv_pred_flag] - [Getter][#direct_spatial_mv_pred_flag()] - [Setter][#direct_spatial_mv_pred_flag(int)]
/// ### num_ref_idx_active_override_flag
/// [VarHandle][#VH_num_ref_idx_active_override_flag] - [Getter][#num_ref_idx_active_override_flag()] - [Setter][#num_ref_idx_active_override_flag(int)]
/// ### reserved
/// [VarHandle][#VH_reserved] - [Getter][#reserved()] - [Setter][#reserved(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct StdVideoEncodeH264SliceHeaderFlags {
///     uint32_t : 1 direct_spatial_mv_pred_flag;
///     uint32_t : 1 num_ref_idx_active_override_flag;
///     uint32_t : 30 reserved;
/// } StdVideoEncodeH264SliceHeaderFlags;
/// ```
public final class StdVideoEncodeH264SliceHeaderFlags extends Struct {
    /// The struct layout of `StdVideoEncodeH264SliceHeaderFlags`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("direct_spatial_mv_pred_flag"),
        ValueLayout.JAVA_INT.withName("num_ref_idx_active_override_flag"),
        ValueLayout.JAVA_INT.withName("reserved")
    );
    /// The [VarHandle] of `direct_spatial_mv_pred_flag` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_direct_spatial_mv_pred_flag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("direct_spatial_mv_pred_flag"));
    /// The [VarHandle] of `num_ref_idx_active_override_flag` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_num_ref_idx_active_override_flag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("num_ref_idx_active_override_flag"));
    /// The [VarHandle] of `reserved` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_reserved = LAYOUT.arrayElementVarHandle(PathElement.groupElement("reserved"));

    /// Creates `StdVideoEncodeH264SliceHeaderFlags` with the given segment.
    /// @param segment the memory segment
    public StdVideoEncodeH264SliceHeaderFlags(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `StdVideoEncodeH264SliceHeaderFlags` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoEncodeH264SliceHeaderFlags of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new StdVideoEncodeH264SliceHeaderFlags(segment); }

    /// Creates `StdVideoEncodeH264SliceHeaderFlags` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoEncodeH264SliceHeaderFlags ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new StdVideoEncodeH264SliceHeaderFlags(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `StdVideoEncodeH264SliceHeaderFlags` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoEncodeH264SliceHeaderFlags ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new StdVideoEncodeH264SliceHeaderFlags(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `StdVideoEncodeH264SliceHeaderFlags` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoEncodeH264SliceHeaderFlags`
    public static StdVideoEncodeH264SliceHeaderFlags alloc(SegmentAllocator allocator) { return new StdVideoEncodeH264SliceHeaderFlags(allocator.allocate(LAYOUT)); }

    /// Allocates a `StdVideoEncodeH264SliceHeaderFlags` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `StdVideoEncodeH264SliceHeaderFlags`
    public static StdVideoEncodeH264SliceHeaderFlags alloc(SegmentAllocator allocator, long count) { return new StdVideoEncodeH264SliceHeaderFlags(allocator.allocate(LAYOUT, count)); }

    /// {@return `direct_spatial_mv_pred_flag` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_direct_spatial_mv_pred_flag(MemorySegment segment, long index) { return (int) VH_direct_spatial_mv_pred_flag.get(segment, 0L, index); }
    /// {@return `direct_spatial_mv_pred_flag`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_direct_spatial_mv_pred_flag(MemorySegment segment) { return StdVideoEncodeH264SliceHeaderFlags.get_direct_spatial_mv_pred_flag(segment, 0L); }
    /// {@return `direct_spatial_mv_pred_flag` at the given index}
    /// @param index the index
    public @CType("uint32_t : 1") int direct_spatial_mv_pred_flagAt(long index) { return StdVideoEncodeH264SliceHeaderFlags.get_direct_spatial_mv_pred_flag(this.segment(), index); }
    /// {@return `direct_spatial_mv_pred_flag`}
    public @CType("uint32_t : 1") int direct_spatial_mv_pred_flag() { return StdVideoEncodeH264SliceHeaderFlags.get_direct_spatial_mv_pred_flag(this.segment()); }
    /// Sets `direct_spatial_mv_pred_flag` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_direct_spatial_mv_pred_flag(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_direct_spatial_mv_pred_flag.set(segment, 0L, index, value); }
    /// Sets `direct_spatial_mv_pred_flag` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_direct_spatial_mv_pred_flag(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoEncodeH264SliceHeaderFlags.set_direct_spatial_mv_pred_flag(segment, 0L, value); }
    /// Sets `direct_spatial_mv_pred_flag` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264SliceHeaderFlags direct_spatial_mv_pred_flagAt(long index, @CType("uint32_t : 1") int value) { StdVideoEncodeH264SliceHeaderFlags.set_direct_spatial_mv_pred_flag(this.segment(), index, value); return this; }
    /// Sets `direct_spatial_mv_pred_flag` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264SliceHeaderFlags direct_spatial_mv_pred_flag(@CType("uint32_t : 1") int value) { StdVideoEncodeH264SliceHeaderFlags.set_direct_spatial_mv_pred_flag(this.segment(), value); return this; }

    /// {@return `num_ref_idx_active_override_flag` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_num_ref_idx_active_override_flag(MemorySegment segment, long index) { return (int) VH_num_ref_idx_active_override_flag.get(segment, 0L, index); }
    /// {@return `num_ref_idx_active_override_flag`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_num_ref_idx_active_override_flag(MemorySegment segment) { return StdVideoEncodeH264SliceHeaderFlags.get_num_ref_idx_active_override_flag(segment, 0L); }
    /// {@return `num_ref_idx_active_override_flag` at the given index}
    /// @param index the index
    public @CType("uint32_t : 1") int num_ref_idx_active_override_flagAt(long index) { return StdVideoEncodeH264SliceHeaderFlags.get_num_ref_idx_active_override_flag(this.segment(), index); }
    /// {@return `num_ref_idx_active_override_flag`}
    public @CType("uint32_t : 1") int num_ref_idx_active_override_flag() { return StdVideoEncodeH264SliceHeaderFlags.get_num_ref_idx_active_override_flag(this.segment()); }
    /// Sets `num_ref_idx_active_override_flag` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_num_ref_idx_active_override_flag(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_num_ref_idx_active_override_flag.set(segment, 0L, index, value); }
    /// Sets `num_ref_idx_active_override_flag` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_num_ref_idx_active_override_flag(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoEncodeH264SliceHeaderFlags.set_num_ref_idx_active_override_flag(segment, 0L, value); }
    /// Sets `num_ref_idx_active_override_flag` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264SliceHeaderFlags num_ref_idx_active_override_flagAt(long index, @CType("uint32_t : 1") int value) { StdVideoEncodeH264SliceHeaderFlags.set_num_ref_idx_active_override_flag(this.segment(), index, value); return this; }
    /// Sets `num_ref_idx_active_override_flag` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264SliceHeaderFlags num_ref_idx_active_override_flag(@CType("uint32_t : 1") int value) { StdVideoEncodeH264SliceHeaderFlags.set_num_ref_idx_active_override_flag(this.segment(), value); return this; }

    /// {@return `reserved` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 30") int get_reserved(MemorySegment segment, long index) { return (int) VH_reserved.get(segment, 0L, index); }
    /// {@return `reserved`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 30") int get_reserved(MemorySegment segment) { return StdVideoEncodeH264SliceHeaderFlags.get_reserved(segment, 0L); }
    /// {@return `reserved` at the given index}
    /// @param index the index
    public @CType("uint32_t : 30") int reservedAt(long index) { return StdVideoEncodeH264SliceHeaderFlags.get_reserved(this.segment(), index); }
    /// {@return `reserved`}
    public @CType("uint32_t : 30") int reserved() { return StdVideoEncodeH264SliceHeaderFlags.get_reserved(this.segment()); }
    /// Sets `reserved` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_reserved(MemorySegment segment, long index, @CType("uint32_t : 30") int value) { VH_reserved.set(segment, 0L, index, value); }
    /// Sets `reserved` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_reserved(MemorySegment segment, @CType("uint32_t : 30") int value) { StdVideoEncodeH264SliceHeaderFlags.set_reserved(segment, 0L, value); }
    /// Sets `reserved` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264SliceHeaderFlags reservedAt(long index, @CType("uint32_t : 30") int value) { StdVideoEncodeH264SliceHeaderFlags.set_reserved(this.segment(), index, value); return this; }
    /// Sets `reserved` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264SliceHeaderFlags reserved(@CType("uint32_t : 30") int value) { StdVideoEncodeH264SliceHeaderFlags.set_reserved(this.segment(), value); return this; }

}
