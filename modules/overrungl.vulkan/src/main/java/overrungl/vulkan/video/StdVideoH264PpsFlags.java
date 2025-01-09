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
/// ### transform_8x8_mode_flag
/// [VarHandle][#VH_transform_8x8_mode_flag] - [Getter][#transform_8x8_mode_flag()] - [Setter][#transform_8x8_mode_flag(int)]
/// ### redundant_pic_cnt_present_flag
/// [VarHandle][#VH_redundant_pic_cnt_present_flag] - [Getter][#redundant_pic_cnt_present_flag()] - [Setter][#redundant_pic_cnt_present_flag(int)]
/// ### constrained_intra_pred_flag
/// [VarHandle][#VH_constrained_intra_pred_flag] - [Getter][#constrained_intra_pred_flag()] - [Setter][#constrained_intra_pred_flag(int)]
/// ### deblocking_filter_control_present_flag
/// [VarHandle][#VH_deblocking_filter_control_present_flag] - [Getter][#deblocking_filter_control_present_flag()] - [Setter][#deblocking_filter_control_present_flag(int)]
/// ### weighted_pred_flag
/// [VarHandle][#VH_weighted_pred_flag] - [Getter][#weighted_pred_flag()] - [Setter][#weighted_pred_flag(int)]
/// ### bottom_field_pic_order_in_frame_present_flag
/// [VarHandle][#VH_bottom_field_pic_order_in_frame_present_flag] - [Getter][#bottom_field_pic_order_in_frame_present_flag()] - [Setter][#bottom_field_pic_order_in_frame_present_flag(int)]
/// ### entropy_coding_mode_flag
/// [VarHandle][#VH_entropy_coding_mode_flag] - [Getter][#entropy_coding_mode_flag()] - [Setter][#entropy_coding_mode_flag(int)]
/// ### pic_scaling_matrix_present_flag
/// [VarHandle][#VH_pic_scaling_matrix_present_flag] - [Getter][#pic_scaling_matrix_present_flag()] - [Setter][#pic_scaling_matrix_present_flag(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct StdVideoH264PpsFlags {
///     uint32_t : 1 transform_8x8_mode_flag;
///     uint32_t : 1 redundant_pic_cnt_present_flag;
///     uint32_t : 1 constrained_intra_pred_flag;
///     uint32_t : 1 deblocking_filter_control_present_flag;
///     uint32_t : 1 weighted_pred_flag;
///     uint32_t : 1 bottom_field_pic_order_in_frame_present_flag;
///     uint32_t : 1 entropy_coding_mode_flag;
///     uint32_t : 1 pic_scaling_matrix_present_flag;
/// } StdVideoH264PpsFlags;
/// ```
public final class StdVideoH264PpsFlags extends Struct {
    /// The struct layout of `StdVideoH264PpsFlags`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("transform_8x8_mode_flag"),
        ValueLayout.JAVA_INT.withName("redundant_pic_cnt_present_flag"),
        ValueLayout.JAVA_INT.withName("constrained_intra_pred_flag"),
        ValueLayout.JAVA_INT.withName("deblocking_filter_control_present_flag"),
        ValueLayout.JAVA_INT.withName("weighted_pred_flag"),
        ValueLayout.JAVA_INT.withName("bottom_field_pic_order_in_frame_present_flag"),
        ValueLayout.JAVA_INT.withName("entropy_coding_mode_flag"),
        ValueLayout.JAVA_INT.withName("pic_scaling_matrix_present_flag")
    );
    /// The [VarHandle] of `transform_8x8_mode_flag` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_transform_8x8_mode_flag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("transform_8x8_mode_flag"));
    /// The [VarHandle] of `redundant_pic_cnt_present_flag` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_redundant_pic_cnt_present_flag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("redundant_pic_cnt_present_flag"));
    /// The [VarHandle] of `constrained_intra_pred_flag` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_constrained_intra_pred_flag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("constrained_intra_pred_flag"));
    /// The [VarHandle] of `deblocking_filter_control_present_flag` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_deblocking_filter_control_present_flag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("deblocking_filter_control_present_flag"));
    /// The [VarHandle] of `weighted_pred_flag` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_weighted_pred_flag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("weighted_pred_flag"));
    /// The [VarHandle] of `bottom_field_pic_order_in_frame_present_flag` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_bottom_field_pic_order_in_frame_present_flag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("bottom_field_pic_order_in_frame_present_flag"));
    /// The [VarHandle] of `entropy_coding_mode_flag` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_entropy_coding_mode_flag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("entropy_coding_mode_flag"));
    /// The [VarHandle] of `pic_scaling_matrix_present_flag` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_pic_scaling_matrix_present_flag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pic_scaling_matrix_present_flag"));

    /// Creates `StdVideoH264PpsFlags` with the given segment.
    /// @param segment the memory segment
    public StdVideoH264PpsFlags(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `StdVideoH264PpsFlags` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoH264PpsFlags of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new StdVideoH264PpsFlags(segment); }

    /// Creates `StdVideoH264PpsFlags` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoH264PpsFlags ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new StdVideoH264PpsFlags(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `StdVideoH264PpsFlags` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoH264PpsFlags ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new StdVideoH264PpsFlags(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `StdVideoH264PpsFlags` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoH264PpsFlags`
    public static StdVideoH264PpsFlags alloc(SegmentAllocator allocator) { return new StdVideoH264PpsFlags(allocator.allocate(LAYOUT)); }

    /// Allocates a `StdVideoH264PpsFlags` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `StdVideoH264PpsFlags`
    public static StdVideoH264PpsFlags alloc(SegmentAllocator allocator, long count) { return new StdVideoH264PpsFlags(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `StdVideoH264PpsFlags`.
    /// @param index the index of the struct buffer
    /// @return the slice of `StdVideoH264PpsFlags`
    public StdVideoH264PpsFlags asSlice(long index) { return new StdVideoH264PpsFlags(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `StdVideoH264PpsFlags`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `StdVideoH264PpsFlags`
    public StdVideoH264PpsFlags asSlice(long index, long count) { return new StdVideoH264PpsFlags(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

    /// {@return `transform_8x8_mode_flag` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_transform_8x8_mode_flag(MemorySegment segment, long index) { return (int) VH_transform_8x8_mode_flag.get(segment, 0L, index); }
    /// {@return `transform_8x8_mode_flag`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_transform_8x8_mode_flag(MemorySegment segment) { return StdVideoH264PpsFlags.get_transform_8x8_mode_flag(segment, 0L); }
    /// {@return `transform_8x8_mode_flag` at the given index}
    /// @param index the index
    public @CType("uint32_t : 1") int transform_8x8_mode_flagAt(long index) { return StdVideoH264PpsFlags.get_transform_8x8_mode_flag(this.segment(), index); }
    /// {@return `transform_8x8_mode_flag`}
    public @CType("uint32_t : 1") int transform_8x8_mode_flag() { return StdVideoH264PpsFlags.get_transform_8x8_mode_flag(this.segment()); }
    /// Sets `transform_8x8_mode_flag` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_transform_8x8_mode_flag(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_transform_8x8_mode_flag.set(segment, 0L, index, value); }
    /// Sets `transform_8x8_mode_flag` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_transform_8x8_mode_flag(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoH264PpsFlags.set_transform_8x8_mode_flag(segment, 0L, value); }
    /// Sets `transform_8x8_mode_flag` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoH264PpsFlags transform_8x8_mode_flagAt(long index, @CType("uint32_t : 1") int value) { StdVideoH264PpsFlags.set_transform_8x8_mode_flag(this.segment(), index, value); return this; }
    /// Sets `transform_8x8_mode_flag` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH264PpsFlags transform_8x8_mode_flag(@CType("uint32_t : 1") int value) { StdVideoH264PpsFlags.set_transform_8x8_mode_flag(this.segment(), value); return this; }

    /// {@return `redundant_pic_cnt_present_flag` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_redundant_pic_cnt_present_flag(MemorySegment segment, long index) { return (int) VH_redundant_pic_cnt_present_flag.get(segment, 0L, index); }
    /// {@return `redundant_pic_cnt_present_flag`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_redundant_pic_cnt_present_flag(MemorySegment segment) { return StdVideoH264PpsFlags.get_redundant_pic_cnt_present_flag(segment, 0L); }
    /// {@return `redundant_pic_cnt_present_flag` at the given index}
    /// @param index the index
    public @CType("uint32_t : 1") int redundant_pic_cnt_present_flagAt(long index) { return StdVideoH264PpsFlags.get_redundant_pic_cnt_present_flag(this.segment(), index); }
    /// {@return `redundant_pic_cnt_present_flag`}
    public @CType("uint32_t : 1") int redundant_pic_cnt_present_flag() { return StdVideoH264PpsFlags.get_redundant_pic_cnt_present_flag(this.segment()); }
    /// Sets `redundant_pic_cnt_present_flag` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_redundant_pic_cnt_present_flag(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_redundant_pic_cnt_present_flag.set(segment, 0L, index, value); }
    /// Sets `redundant_pic_cnt_present_flag` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_redundant_pic_cnt_present_flag(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoH264PpsFlags.set_redundant_pic_cnt_present_flag(segment, 0L, value); }
    /// Sets `redundant_pic_cnt_present_flag` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoH264PpsFlags redundant_pic_cnt_present_flagAt(long index, @CType("uint32_t : 1") int value) { StdVideoH264PpsFlags.set_redundant_pic_cnt_present_flag(this.segment(), index, value); return this; }
    /// Sets `redundant_pic_cnt_present_flag` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH264PpsFlags redundant_pic_cnt_present_flag(@CType("uint32_t : 1") int value) { StdVideoH264PpsFlags.set_redundant_pic_cnt_present_flag(this.segment(), value); return this; }

    /// {@return `constrained_intra_pred_flag` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_constrained_intra_pred_flag(MemorySegment segment, long index) { return (int) VH_constrained_intra_pred_flag.get(segment, 0L, index); }
    /// {@return `constrained_intra_pred_flag`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_constrained_intra_pred_flag(MemorySegment segment) { return StdVideoH264PpsFlags.get_constrained_intra_pred_flag(segment, 0L); }
    /// {@return `constrained_intra_pred_flag` at the given index}
    /// @param index the index
    public @CType("uint32_t : 1") int constrained_intra_pred_flagAt(long index) { return StdVideoH264PpsFlags.get_constrained_intra_pred_flag(this.segment(), index); }
    /// {@return `constrained_intra_pred_flag`}
    public @CType("uint32_t : 1") int constrained_intra_pred_flag() { return StdVideoH264PpsFlags.get_constrained_intra_pred_flag(this.segment()); }
    /// Sets `constrained_intra_pred_flag` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_constrained_intra_pred_flag(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_constrained_intra_pred_flag.set(segment, 0L, index, value); }
    /// Sets `constrained_intra_pred_flag` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_constrained_intra_pred_flag(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoH264PpsFlags.set_constrained_intra_pred_flag(segment, 0L, value); }
    /// Sets `constrained_intra_pred_flag` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoH264PpsFlags constrained_intra_pred_flagAt(long index, @CType("uint32_t : 1") int value) { StdVideoH264PpsFlags.set_constrained_intra_pred_flag(this.segment(), index, value); return this; }
    /// Sets `constrained_intra_pred_flag` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH264PpsFlags constrained_intra_pred_flag(@CType("uint32_t : 1") int value) { StdVideoH264PpsFlags.set_constrained_intra_pred_flag(this.segment(), value); return this; }

    /// {@return `deblocking_filter_control_present_flag` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_deblocking_filter_control_present_flag(MemorySegment segment, long index) { return (int) VH_deblocking_filter_control_present_flag.get(segment, 0L, index); }
    /// {@return `deblocking_filter_control_present_flag`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_deblocking_filter_control_present_flag(MemorySegment segment) { return StdVideoH264PpsFlags.get_deblocking_filter_control_present_flag(segment, 0L); }
    /// {@return `deblocking_filter_control_present_flag` at the given index}
    /// @param index the index
    public @CType("uint32_t : 1") int deblocking_filter_control_present_flagAt(long index) { return StdVideoH264PpsFlags.get_deblocking_filter_control_present_flag(this.segment(), index); }
    /// {@return `deblocking_filter_control_present_flag`}
    public @CType("uint32_t : 1") int deblocking_filter_control_present_flag() { return StdVideoH264PpsFlags.get_deblocking_filter_control_present_flag(this.segment()); }
    /// Sets `deblocking_filter_control_present_flag` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_deblocking_filter_control_present_flag(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_deblocking_filter_control_present_flag.set(segment, 0L, index, value); }
    /// Sets `deblocking_filter_control_present_flag` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_deblocking_filter_control_present_flag(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoH264PpsFlags.set_deblocking_filter_control_present_flag(segment, 0L, value); }
    /// Sets `deblocking_filter_control_present_flag` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoH264PpsFlags deblocking_filter_control_present_flagAt(long index, @CType("uint32_t : 1") int value) { StdVideoH264PpsFlags.set_deblocking_filter_control_present_flag(this.segment(), index, value); return this; }
    /// Sets `deblocking_filter_control_present_flag` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH264PpsFlags deblocking_filter_control_present_flag(@CType("uint32_t : 1") int value) { StdVideoH264PpsFlags.set_deblocking_filter_control_present_flag(this.segment(), value); return this; }

    /// {@return `weighted_pred_flag` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_weighted_pred_flag(MemorySegment segment, long index) { return (int) VH_weighted_pred_flag.get(segment, 0L, index); }
    /// {@return `weighted_pred_flag`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_weighted_pred_flag(MemorySegment segment) { return StdVideoH264PpsFlags.get_weighted_pred_flag(segment, 0L); }
    /// {@return `weighted_pred_flag` at the given index}
    /// @param index the index
    public @CType("uint32_t : 1") int weighted_pred_flagAt(long index) { return StdVideoH264PpsFlags.get_weighted_pred_flag(this.segment(), index); }
    /// {@return `weighted_pred_flag`}
    public @CType("uint32_t : 1") int weighted_pred_flag() { return StdVideoH264PpsFlags.get_weighted_pred_flag(this.segment()); }
    /// Sets `weighted_pred_flag` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_weighted_pred_flag(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_weighted_pred_flag.set(segment, 0L, index, value); }
    /// Sets `weighted_pred_flag` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_weighted_pred_flag(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoH264PpsFlags.set_weighted_pred_flag(segment, 0L, value); }
    /// Sets `weighted_pred_flag` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoH264PpsFlags weighted_pred_flagAt(long index, @CType("uint32_t : 1") int value) { StdVideoH264PpsFlags.set_weighted_pred_flag(this.segment(), index, value); return this; }
    /// Sets `weighted_pred_flag` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH264PpsFlags weighted_pred_flag(@CType("uint32_t : 1") int value) { StdVideoH264PpsFlags.set_weighted_pred_flag(this.segment(), value); return this; }

    /// {@return `bottom_field_pic_order_in_frame_present_flag` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_bottom_field_pic_order_in_frame_present_flag(MemorySegment segment, long index) { return (int) VH_bottom_field_pic_order_in_frame_present_flag.get(segment, 0L, index); }
    /// {@return `bottom_field_pic_order_in_frame_present_flag`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_bottom_field_pic_order_in_frame_present_flag(MemorySegment segment) { return StdVideoH264PpsFlags.get_bottom_field_pic_order_in_frame_present_flag(segment, 0L); }
    /// {@return `bottom_field_pic_order_in_frame_present_flag` at the given index}
    /// @param index the index
    public @CType("uint32_t : 1") int bottom_field_pic_order_in_frame_present_flagAt(long index) { return StdVideoH264PpsFlags.get_bottom_field_pic_order_in_frame_present_flag(this.segment(), index); }
    /// {@return `bottom_field_pic_order_in_frame_present_flag`}
    public @CType("uint32_t : 1") int bottom_field_pic_order_in_frame_present_flag() { return StdVideoH264PpsFlags.get_bottom_field_pic_order_in_frame_present_flag(this.segment()); }
    /// Sets `bottom_field_pic_order_in_frame_present_flag` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_bottom_field_pic_order_in_frame_present_flag(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_bottom_field_pic_order_in_frame_present_flag.set(segment, 0L, index, value); }
    /// Sets `bottom_field_pic_order_in_frame_present_flag` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_bottom_field_pic_order_in_frame_present_flag(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoH264PpsFlags.set_bottom_field_pic_order_in_frame_present_flag(segment, 0L, value); }
    /// Sets `bottom_field_pic_order_in_frame_present_flag` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoH264PpsFlags bottom_field_pic_order_in_frame_present_flagAt(long index, @CType("uint32_t : 1") int value) { StdVideoH264PpsFlags.set_bottom_field_pic_order_in_frame_present_flag(this.segment(), index, value); return this; }
    /// Sets `bottom_field_pic_order_in_frame_present_flag` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH264PpsFlags bottom_field_pic_order_in_frame_present_flag(@CType("uint32_t : 1") int value) { StdVideoH264PpsFlags.set_bottom_field_pic_order_in_frame_present_flag(this.segment(), value); return this; }

    /// {@return `entropy_coding_mode_flag` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_entropy_coding_mode_flag(MemorySegment segment, long index) { return (int) VH_entropy_coding_mode_flag.get(segment, 0L, index); }
    /// {@return `entropy_coding_mode_flag`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_entropy_coding_mode_flag(MemorySegment segment) { return StdVideoH264PpsFlags.get_entropy_coding_mode_flag(segment, 0L); }
    /// {@return `entropy_coding_mode_flag` at the given index}
    /// @param index the index
    public @CType("uint32_t : 1") int entropy_coding_mode_flagAt(long index) { return StdVideoH264PpsFlags.get_entropy_coding_mode_flag(this.segment(), index); }
    /// {@return `entropy_coding_mode_flag`}
    public @CType("uint32_t : 1") int entropy_coding_mode_flag() { return StdVideoH264PpsFlags.get_entropy_coding_mode_flag(this.segment()); }
    /// Sets `entropy_coding_mode_flag` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_entropy_coding_mode_flag(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_entropy_coding_mode_flag.set(segment, 0L, index, value); }
    /// Sets `entropy_coding_mode_flag` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_entropy_coding_mode_flag(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoH264PpsFlags.set_entropy_coding_mode_flag(segment, 0L, value); }
    /// Sets `entropy_coding_mode_flag` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoH264PpsFlags entropy_coding_mode_flagAt(long index, @CType("uint32_t : 1") int value) { StdVideoH264PpsFlags.set_entropy_coding_mode_flag(this.segment(), index, value); return this; }
    /// Sets `entropy_coding_mode_flag` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH264PpsFlags entropy_coding_mode_flag(@CType("uint32_t : 1") int value) { StdVideoH264PpsFlags.set_entropy_coding_mode_flag(this.segment(), value); return this; }

    /// {@return `pic_scaling_matrix_present_flag` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_pic_scaling_matrix_present_flag(MemorySegment segment, long index) { return (int) VH_pic_scaling_matrix_present_flag.get(segment, 0L, index); }
    /// {@return `pic_scaling_matrix_present_flag`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_pic_scaling_matrix_present_flag(MemorySegment segment) { return StdVideoH264PpsFlags.get_pic_scaling_matrix_present_flag(segment, 0L); }
    /// {@return `pic_scaling_matrix_present_flag` at the given index}
    /// @param index the index
    public @CType("uint32_t : 1") int pic_scaling_matrix_present_flagAt(long index) { return StdVideoH264PpsFlags.get_pic_scaling_matrix_present_flag(this.segment(), index); }
    /// {@return `pic_scaling_matrix_present_flag`}
    public @CType("uint32_t : 1") int pic_scaling_matrix_present_flag() { return StdVideoH264PpsFlags.get_pic_scaling_matrix_present_flag(this.segment()); }
    /// Sets `pic_scaling_matrix_present_flag` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pic_scaling_matrix_present_flag(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_pic_scaling_matrix_present_flag.set(segment, 0L, index, value); }
    /// Sets `pic_scaling_matrix_present_flag` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pic_scaling_matrix_present_flag(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoH264PpsFlags.set_pic_scaling_matrix_present_flag(segment, 0L, value); }
    /// Sets `pic_scaling_matrix_present_flag` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoH264PpsFlags pic_scaling_matrix_present_flagAt(long index, @CType("uint32_t : 1") int value) { StdVideoH264PpsFlags.set_pic_scaling_matrix_present_flag(this.segment(), index, value); return this; }
    /// Sets `pic_scaling_matrix_present_flag` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH264PpsFlags pic_scaling_matrix_present_flag(@CType("uint32_t : 1") int value) { StdVideoH264PpsFlags.set_pic_scaling_matrix_present_flag(this.segment(), value); return this; }

}
