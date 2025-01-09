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
/// ### constraint_set0_flag
/// [VarHandle][#VH_constraint_set0_flag] - [Getter][#constraint_set0_flag()] - [Setter][#constraint_set0_flag(int)]
/// ### constraint_set1_flag
/// [VarHandle][#VH_constraint_set1_flag] - [Getter][#constraint_set1_flag()] - [Setter][#constraint_set1_flag(int)]
/// ### constraint_set2_flag
/// [VarHandle][#VH_constraint_set2_flag] - [Getter][#constraint_set2_flag()] - [Setter][#constraint_set2_flag(int)]
/// ### constraint_set3_flag
/// [VarHandle][#VH_constraint_set3_flag] - [Getter][#constraint_set3_flag()] - [Setter][#constraint_set3_flag(int)]
/// ### constraint_set4_flag
/// [VarHandle][#VH_constraint_set4_flag] - [Getter][#constraint_set4_flag()] - [Setter][#constraint_set4_flag(int)]
/// ### constraint_set5_flag
/// [VarHandle][#VH_constraint_set5_flag] - [Getter][#constraint_set5_flag()] - [Setter][#constraint_set5_flag(int)]
/// ### direct_8x8_inference_flag
/// [VarHandle][#VH_direct_8x8_inference_flag] - [Getter][#direct_8x8_inference_flag()] - [Setter][#direct_8x8_inference_flag(int)]
/// ### mb_adaptive_frame_field_flag
/// [VarHandle][#VH_mb_adaptive_frame_field_flag] - [Getter][#mb_adaptive_frame_field_flag()] - [Setter][#mb_adaptive_frame_field_flag(int)]
/// ### frame_mbs_only_flag
/// [VarHandle][#VH_frame_mbs_only_flag] - [Getter][#frame_mbs_only_flag()] - [Setter][#frame_mbs_only_flag(int)]
/// ### delta_pic_order_always_zero_flag
/// [VarHandle][#VH_delta_pic_order_always_zero_flag] - [Getter][#delta_pic_order_always_zero_flag()] - [Setter][#delta_pic_order_always_zero_flag(int)]
/// ### separate_colour_plane_flag
/// [VarHandle][#VH_separate_colour_plane_flag] - [Getter][#separate_colour_plane_flag()] - [Setter][#separate_colour_plane_flag(int)]
/// ### gaps_in_frame_num_value_allowed_flag
/// [VarHandle][#VH_gaps_in_frame_num_value_allowed_flag] - [Getter][#gaps_in_frame_num_value_allowed_flag()] - [Setter][#gaps_in_frame_num_value_allowed_flag(int)]
/// ### qpprime_y_zero_transform_bypass_flag
/// [VarHandle][#VH_qpprime_y_zero_transform_bypass_flag] - [Getter][#qpprime_y_zero_transform_bypass_flag()] - [Setter][#qpprime_y_zero_transform_bypass_flag(int)]
/// ### frame_cropping_flag
/// [VarHandle][#VH_frame_cropping_flag] - [Getter][#frame_cropping_flag()] - [Setter][#frame_cropping_flag(int)]
/// ### seq_scaling_matrix_present_flag
/// [VarHandle][#VH_seq_scaling_matrix_present_flag] - [Getter][#seq_scaling_matrix_present_flag()] - [Setter][#seq_scaling_matrix_present_flag(int)]
/// ### vui_parameters_present_flag
/// [VarHandle][#VH_vui_parameters_present_flag] - [Getter][#vui_parameters_present_flag()] - [Setter][#vui_parameters_present_flag(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct StdVideoH264SpsFlags {
///     uint32_t : 1 constraint_set0_flag;
///     uint32_t : 1 constraint_set1_flag;
///     uint32_t : 1 constraint_set2_flag;
///     uint32_t : 1 constraint_set3_flag;
///     uint32_t : 1 constraint_set4_flag;
///     uint32_t : 1 constraint_set5_flag;
///     uint32_t : 1 direct_8x8_inference_flag;
///     uint32_t : 1 mb_adaptive_frame_field_flag;
///     uint32_t : 1 frame_mbs_only_flag;
///     uint32_t : 1 delta_pic_order_always_zero_flag;
///     uint32_t : 1 separate_colour_plane_flag;
///     uint32_t : 1 gaps_in_frame_num_value_allowed_flag;
///     uint32_t : 1 qpprime_y_zero_transform_bypass_flag;
///     uint32_t : 1 frame_cropping_flag;
///     uint32_t : 1 seq_scaling_matrix_present_flag;
///     uint32_t : 1 vui_parameters_present_flag;
/// } StdVideoH264SpsFlags;
/// ```
public final class StdVideoH264SpsFlags extends Struct {
    /// The struct layout of `StdVideoH264SpsFlags`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("constraint_set0_flag"),
        ValueLayout.JAVA_INT.withName("constraint_set1_flag"),
        ValueLayout.JAVA_INT.withName("constraint_set2_flag"),
        ValueLayout.JAVA_INT.withName("constraint_set3_flag"),
        ValueLayout.JAVA_INT.withName("constraint_set4_flag"),
        ValueLayout.JAVA_INT.withName("constraint_set5_flag"),
        ValueLayout.JAVA_INT.withName("direct_8x8_inference_flag"),
        ValueLayout.JAVA_INT.withName("mb_adaptive_frame_field_flag"),
        ValueLayout.JAVA_INT.withName("frame_mbs_only_flag"),
        ValueLayout.JAVA_INT.withName("delta_pic_order_always_zero_flag"),
        ValueLayout.JAVA_INT.withName("separate_colour_plane_flag"),
        ValueLayout.JAVA_INT.withName("gaps_in_frame_num_value_allowed_flag"),
        ValueLayout.JAVA_INT.withName("qpprime_y_zero_transform_bypass_flag"),
        ValueLayout.JAVA_INT.withName("frame_cropping_flag"),
        ValueLayout.JAVA_INT.withName("seq_scaling_matrix_present_flag"),
        ValueLayout.JAVA_INT.withName("vui_parameters_present_flag")
    );
    /// The [VarHandle] of `constraint_set0_flag` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_constraint_set0_flag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("constraint_set0_flag"));
    /// The [VarHandle] of `constraint_set1_flag` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_constraint_set1_flag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("constraint_set1_flag"));
    /// The [VarHandle] of `constraint_set2_flag` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_constraint_set2_flag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("constraint_set2_flag"));
    /// The [VarHandle] of `constraint_set3_flag` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_constraint_set3_flag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("constraint_set3_flag"));
    /// The [VarHandle] of `constraint_set4_flag` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_constraint_set4_flag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("constraint_set4_flag"));
    /// The [VarHandle] of `constraint_set5_flag` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_constraint_set5_flag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("constraint_set5_flag"));
    /// The [VarHandle] of `direct_8x8_inference_flag` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_direct_8x8_inference_flag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("direct_8x8_inference_flag"));
    /// The [VarHandle] of `mb_adaptive_frame_field_flag` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_mb_adaptive_frame_field_flag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("mb_adaptive_frame_field_flag"));
    /// The [VarHandle] of `frame_mbs_only_flag` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_frame_mbs_only_flag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("frame_mbs_only_flag"));
    /// The [VarHandle] of `delta_pic_order_always_zero_flag` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_delta_pic_order_always_zero_flag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("delta_pic_order_always_zero_flag"));
    /// The [VarHandle] of `separate_colour_plane_flag` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_separate_colour_plane_flag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("separate_colour_plane_flag"));
    /// The [VarHandle] of `gaps_in_frame_num_value_allowed_flag` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_gaps_in_frame_num_value_allowed_flag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("gaps_in_frame_num_value_allowed_flag"));
    /// The [VarHandle] of `qpprime_y_zero_transform_bypass_flag` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_qpprime_y_zero_transform_bypass_flag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("qpprime_y_zero_transform_bypass_flag"));
    /// The [VarHandle] of `frame_cropping_flag` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_frame_cropping_flag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("frame_cropping_flag"));
    /// The [VarHandle] of `seq_scaling_matrix_present_flag` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_seq_scaling_matrix_present_flag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("seq_scaling_matrix_present_flag"));
    /// The [VarHandle] of `vui_parameters_present_flag` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_vui_parameters_present_flag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("vui_parameters_present_flag"));

    /// Creates `StdVideoH264SpsFlags` with the given segment.
    /// @param segment the memory segment
    public StdVideoH264SpsFlags(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `StdVideoH264SpsFlags` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoH264SpsFlags of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new StdVideoH264SpsFlags(segment); }

    /// Creates `StdVideoH264SpsFlags` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoH264SpsFlags ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new StdVideoH264SpsFlags(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `StdVideoH264SpsFlags` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoH264SpsFlags ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new StdVideoH264SpsFlags(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `StdVideoH264SpsFlags` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoH264SpsFlags`
    public static StdVideoH264SpsFlags alloc(SegmentAllocator allocator) { return new StdVideoH264SpsFlags(allocator.allocate(LAYOUT)); }

    /// Allocates a `StdVideoH264SpsFlags` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `StdVideoH264SpsFlags`
    public static StdVideoH264SpsFlags alloc(SegmentAllocator allocator, long count) { return new StdVideoH264SpsFlags(allocator.allocate(LAYOUT, count)); }

    /// {@return `constraint_set0_flag` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_constraint_set0_flag(MemorySegment segment, long index) { return (int) VH_constraint_set0_flag.get(segment, 0L, index); }
    /// {@return `constraint_set0_flag`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_constraint_set0_flag(MemorySegment segment) { return StdVideoH264SpsFlags.get_constraint_set0_flag(segment, 0L); }
    /// {@return `constraint_set0_flag` at the given index}
    /// @param index the index
    public @CType("uint32_t : 1") int constraint_set0_flagAt(long index) { return StdVideoH264SpsFlags.get_constraint_set0_flag(this.segment(), index); }
    /// {@return `constraint_set0_flag`}
    public @CType("uint32_t : 1") int constraint_set0_flag() { return StdVideoH264SpsFlags.get_constraint_set0_flag(this.segment()); }
    /// Sets `constraint_set0_flag` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_constraint_set0_flag(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_constraint_set0_flag.set(segment, 0L, index, value); }
    /// Sets `constraint_set0_flag` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_constraint_set0_flag(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoH264SpsFlags.set_constraint_set0_flag(segment, 0L, value); }
    /// Sets `constraint_set0_flag` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoH264SpsFlags constraint_set0_flagAt(long index, @CType("uint32_t : 1") int value) { StdVideoH264SpsFlags.set_constraint_set0_flag(this.segment(), index, value); return this; }
    /// Sets `constraint_set0_flag` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH264SpsFlags constraint_set0_flag(@CType("uint32_t : 1") int value) { StdVideoH264SpsFlags.set_constraint_set0_flag(this.segment(), value); return this; }

    /// {@return `constraint_set1_flag` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_constraint_set1_flag(MemorySegment segment, long index) { return (int) VH_constraint_set1_flag.get(segment, 0L, index); }
    /// {@return `constraint_set1_flag`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_constraint_set1_flag(MemorySegment segment) { return StdVideoH264SpsFlags.get_constraint_set1_flag(segment, 0L); }
    /// {@return `constraint_set1_flag` at the given index}
    /// @param index the index
    public @CType("uint32_t : 1") int constraint_set1_flagAt(long index) { return StdVideoH264SpsFlags.get_constraint_set1_flag(this.segment(), index); }
    /// {@return `constraint_set1_flag`}
    public @CType("uint32_t : 1") int constraint_set1_flag() { return StdVideoH264SpsFlags.get_constraint_set1_flag(this.segment()); }
    /// Sets `constraint_set1_flag` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_constraint_set1_flag(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_constraint_set1_flag.set(segment, 0L, index, value); }
    /// Sets `constraint_set1_flag` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_constraint_set1_flag(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoH264SpsFlags.set_constraint_set1_flag(segment, 0L, value); }
    /// Sets `constraint_set1_flag` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoH264SpsFlags constraint_set1_flagAt(long index, @CType("uint32_t : 1") int value) { StdVideoH264SpsFlags.set_constraint_set1_flag(this.segment(), index, value); return this; }
    /// Sets `constraint_set1_flag` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH264SpsFlags constraint_set1_flag(@CType("uint32_t : 1") int value) { StdVideoH264SpsFlags.set_constraint_set1_flag(this.segment(), value); return this; }

    /// {@return `constraint_set2_flag` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_constraint_set2_flag(MemorySegment segment, long index) { return (int) VH_constraint_set2_flag.get(segment, 0L, index); }
    /// {@return `constraint_set2_flag`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_constraint_set2_flag(MemorySegment segment) { return StdVideoH264SpsFlags.get_constraint_set2_flag(segment, 0L); }
    /// {@return `constraint_set2_flag` at the given index}
    /// @param index the index
    public @CType("uint32_t : 1") int constraint_set2_flagAt(long index) { return StdVideoH264SpsFlags.get_constraint_set2_flag(this.segment(), index); }
    /// {@return `constraint_set2_flag`}
    public @CType("uint32_t : 1") int constraint_set2_flag() { return StdVideoH264SpsFlags.get_constraint_set2_flag(this.segment()); }
    /// Sets `constraint_set2_flag` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_constraint_set2_flag(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_constraint_set2_flag.set(segment, 0L, index, value); }
    /// Sets `constraint_set2_flag` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_constraint_set2_flag(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoH264SpsFlags.set_constraint_set2_flag(segment, 0L, value); }
    /// Sets `constraint_set2_flag` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoH264SpsFlags constraint_set2_flagAt(long index, @CType("uint32_t : 1") int value) { StdVideoH264SpsFlags.set_constraint_set2_flag(this.segment(), index, value); return this; }
    /// Sets `constraint_set2_flag` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH264SpsFlags constraint_set2_flag(@CType("uint32_t : 1") int value) { StdVideoH264SpsFlags.set_constraint_set2_flag(this.segment(), value); return this; }

    /// {@return `constraint_set3_flag` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_constraint_set3_flag(MemorySegment segment, long index) { return (int) VH_constraint_set3_flag.get(segment, 0L, index); }
    /// {@return `constraint_set3_flag`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_constraint_set3_flag(MemorySegment segment) { return StdVideoH264SpsFlags.get_constraint_set3_flag(segment, 0L); }
    /// {@return `constraint_set3_flag` at the given index}
    /// @param index the index
    public @CType("uint32_t : 1") int constraint_set3_flagAt(long index) { return StdVideoH264SpsFlags.get_constraint_set3_flag(this.segment(), index); }
    /// {@return `constraint_set3_flag`}
    public @CType("uint32_t : 1") int constraint_set3_flag() { return StdVideoH264SpsFlags.get_constraint_set3_flag(this.segment()); }
    /// Sets `constraint_set3_flag` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_constraint_set3_flag(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_constraint_set3_flag.set(segment, 0L, index, value); }
    /// Sets `constraint_set3_flag` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_constraint_set3_flag(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoH264SpsFlags.set_constraint_set3_flag(segment, 0L, value); }
    /// Sets `constraint_set3_flag` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoH264SpsFlags constraint_set3_flagAt(long index, @CType("uint32_t : 1") int value) { StdVideoH264SpsFlags.set_constraint_set3_flag(this.segment(), index, value); return this; }
    /// Sets `constraint_set3_flag` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH264SpsFlags constraint_set3_flag(@CType("uint32_t : 1") int value) { StdVideoH264SpsFlags.set_constraint_set3_flag(this.segment(), value); return this; }

    /// {@return `constraint_set4_flag` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_constraint_set4_flag(MemorySegment segment, long index) { return (int) VH_constraint_set4_flag.get(segment, 0L, index); }
    /// {@return `constraint_set4_flag`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_constraint_set4_flag(MemorySegment segment) { return StdVideoH264SpsFlags.get_constraint_set4_flag(segment, 0L); }
    /// {@return `constraint_set4_flag` at the given index}
    /// @param index the index
    public @CType("uint32_t : 1") int constraint_set4_flagAt(long index) { return StdVideoH264SpsFlags.get_constraint_set4_flag(this.segment(), index); }
    /// {@return `constraint_set4_flag`}
    public @CType("uint32_t : 1") int constraint_set4_flag() { return StdVideoH264SpsFlags.get_constraint_set4_flag(this.segment()); }
    /// Sets `constraint_set4_flag` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_constraint_set4_flag(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_constraint_set4_flag.set(segment, 0L, index, value); }
    /// Sets `constraint_set4_flag` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_constraint_set4_flag(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoH264SpsFlags.set_constraint_set4_flag(segment, 0L, value); }
    /// Sets `constraint_set4_flag` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoH264SpsFlags constraint_set4_flagAt(long index, @CType("uint32_t : 1") int value) { StdVideoH264SpsFlags.set_constraint_set4_flag(this.segment(), index, value); return this; }
    /// Sets `constraint_set4_flag` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH264SpsFlags constraint_set4_flag(@CType("uint32_t : 1") int value) { StdVideoH264SpsFlags.set_constraint_set4_flag(this.segment(), value); return this; }

    /// {@return `constraint_set5_flag` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_constraint_set5_flag(MemorySegment segment, long index) { return (int) VH_constraint_set5_flag.get(segment, 0L, index); }
    /// {@return `constraint_set5_flag`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_constraint_set5_flag(MemorySegment segment) { return StdVideoH264SpsFlags.get_constraint_set5_flag(segment, 0L); }
    /// {@return `constraint_set5_flag` at the given index}
    /// @param index the index
    public @CType("uint32_t : 1") int constraint_set5_flagAt(long index) { return StdVideoH264SpsFlags.get_constraint_set5_flag(this.segment(), index); }
    /// {@return `constraint_set5_flag`}
    public @CType("uint32_t : 1") int constraint_set5_flag() { return StdVideoH264SpsFlags.get_constraint_set5_flag(this.segment()); }
    /// Sets `constraint_set5_flag` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_constraint_set5_flag(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_constraint_set5_flag.set(segment, 0L, index, value); }
    /// Sets `constraint_set5_flag` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_constraint_set5_flag(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoH264SpsFlags.set_constraint_set5_flag(segment, 0L, value); }
    /// Sets `constraint_set5_flag` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoH264SpsFlags constraint_set5_flagAt(long index, @CType("uint32_t : 1") int value) { StdVideoH264SpsFlags.set_constraint_set5_flag(this.segment(), index, value); return this; }
    /// Sets `constraint_set5_flag` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH264SpsFlags constraint_set5_flag(@CType("uint32_t : 1") int value) { StdVideoH264SpsFlags.set_constraint_set5_flag(this.segment(), value); return this; }

    /// {@return `direct_8x8_inference_flag` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_direct_8x8_inference_flag(MemorySegment segment, long index) { return (int) VH_direct_8x8_inference_flag.get(segment, 0L, index); }
    /// {@return `direct_8x8_inference_flag`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_direct_8x8_inference_flag(MemorySegment segment) { return StdVideoH264SpsFlags.get_direct_8x8_inference_flag(segment, 0L); }
    /// {@return `direct_8x8_inference_flag` at the given index}
    /// @param index the index
    public @CType("uint32_t : 1") int direct_8x8_inference_flagAt(long index) { return StdVideoH264SpsFlags.get_direct_8x8_inference_flag(this.segment(), index); }
    /// {@return `direct_8x8_inference_flag`}
    public @CType("uint32_t : 1") int direct_8x8_inference_flag() { return StdVideoH264SpsFlags.get_direct_8x8_inference_flag(this.segment()); }
    /// Sets `direct_8x8_inference_flag` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_direct_8x8_inference_flag(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_direct_8x8_inference_flag.set(segment, 0L, index, value); }
    /// Sets `direct_8x8_inference_flag` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_direct_8x8_inference_flag(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoH264SpsFlags.set_direct_8x8_inference_flag(segment, 0L, value); }
    /// Sets `direct_8x8_inference_flag` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoH264SpsFlags direct_8x8_inference_flagAt(long index, @CType("uint32_t : 1") int value) { StdVideoH264SpsFlags.set_direct_8x8_inference_flag(this.segment(), index, value); return this; }
    /// Sets `direct_8x8_inference_flag` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH264SpsFlags direct_8x8_inference_flag(@CType("uint32_t : 1") int value) { StdVideoH264SpsFlags.set_direct_8x8_inference_flag(this.segment(), value); return this; }

    /// {@return `mb_adaptive_frame_field_flag` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_mb_adaptive_frame_field_flag(MemorySegment segment, long index) { return (int) VH_mb_adaptive_frame_field_flag.get(segment, 0L, index); }
    /// {@return `mb_adaptive_frame_field_flag`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_mb_adaptive_frame_field_flag(MemorySegment segment) { return StdVideoH264SpsFlags.get_mb_adaptive_frame_field_flag(segment, 0L); }
    /// {@return `mb_adaptive_frame_field_flag` at the given index}
    /// @param index the index
    public @CType("uint32_t : 1") int mb_adaptive_frame_field_flagAt(long index) { return StdVideoH264SpsFlags.get_mb_adaptive_frame_field_flag(this.segment(), index); }
    /// {@return `mb_adaptive_frame_field_flag`}
    public @CType("uint32_t : 1") int mb_adaptive_frame_field_flag() { return StdVideoH264SpsFlags.get_mb_adaptive_frame_field_flag(this.segment()); }
    /// Sets `mb_adaptive_frame_field_flag` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_mb_adaptive_frame_field_flag(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_mb_adaptive_frame_field_flag.set(segment, 0L, index, value); }
    /// Sets `mb_adaptive_frame_field_flag` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_mb_adaptive_frame_field_flag(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoH264SpsFlags.set_mb_adaptive_frame_field_flag(segment, 0L, value); }
    /// Sets `mb_adaptive_frame_field_flag` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoH264SpsFlags mb_adaptive_frame_field_flagAt(long index, @CType("uint32_t : 1") int value) { StdVideoH264SpsFlags.set_mb_adaptive_frame_field_flag(this.segment(), index, value); return this; }
    /// Sets `mb_adaptive_frame_field_flag` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH264SpsFlags mb_adaptive_frame_field_flag(@CType("uint32_t : 1") int value) { StdVideoH264SpsFlags.set_mb_adaptive_frame_field_flag(this.segment(), value); return this; }

    /// {@return `frame_mbs_only_flag` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_frame_mbs_only_flag(MemorySegment segment, long index) { return (int) VH_frame_mbs_only_flag.get(segment, 0L, index); }
    /// {@return `frame_mbs_only_flag`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_frame_mbs_only_flag(MemorySegment segment) { return StdVideoH264SpsFlags.get_frame_mbs_only_flag(segment, 0L); }
    /// {@return `frame_mbs_only_flag` at the given index}
    /// @param index the index
    public @CType("uint32_t : 1") int frame_mbs_only_flagAt(long index) { return StdVideoH264SpsFlags.get_frame_mbs_only_flag(this.segment(), index); }
    /// {@return `frame_mbs_only_flag`}
    public @CType("uint32_t : 1") int frame_mbs_only_flag() { return StdVideoH264SpsFlags.get_frame_mbs_only_flag(this.segment()); }
    /// Sets `frame_mbs_only_flag` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_frame_mbs_only_flag(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_frame_mbs_only_flag.set(segment, 0L, index, value); }
    /// Sets `frame_mbs_only_flag` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_frame_mbs_only_flag(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoH264SpsFlags.set_frame_mbs_only_flag(segment, 0L, value); }
    /// Sets `frame_mbs_only_flag` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoH264SpsFlags frame_mbs_only_flagAt(long index, @CType("uint32_t : 1") int value) { StdVideoH264SpsFlags.set_frame_mbs_only_flag(this.segment(), index, value); return this; }
    /// Sets `frame_mbs_only_flag` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH264SpsFlags frame_mbs_only_flag(@CType("uint32_t : 1") int value) { StdVideoH264SpsFlags.set_frame_mbs_only_flag(this.segment(), value); return this; }

    /// {@return `delta_pic_order_always_zero_flag` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_delta_pic_order_always_zero_flag(MemorySegment segment, long index) { return (int) VH_delta_pic_order_always_zero_flag.get(segment, 0L, index); }
    /// {@return `delta_pic_order_always_zero_flag`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_delta_pic_order_always_zero_flag(MemorySegment segment) { return StdVideoH264SpsFlags.get_delta_pic_order_always_zero_flag(segment, 0L); }
    /// {@return `delta_pic_order_always_zero_flag` at the given index}
    /// @param index the index
    public @CType("uint32_t : 1") int delta_pic_order_always_zero_flagAt(long index) { return StdVideoH264SpsFlags.get_delta_pic_order_always_zero_flag(this.segment(), index); }
    /// {@return `delta_pic_order_always_zero_flag`}
    public @CType("uint32_t : 1") int delta_pic_order_always_zero_flag() { return StdVideoH264SpsFlags.get_delta_pic_order_always_zero_flag(this.segment()); }
    /// Sets `delta_pic_order_always_zero_flag` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_delta_pic_order_always_zero_flag(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_delta_pic_order_always_zero_flag.set(segment, 0L, index, value); }
    /// Sets `delta_pic_order_always_zero_flag` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_delta_pic_order_always_zero_flag(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoH264SpsFlags.set_delta_pic_order_always_zero_flag(segment, 0L, value); }
    /// Sets `delta_pic_order_always_zero_flag` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoH264SpsFlags delta_pic_order_always_zero_flagAt(long index, @CType("uint32_t : 1") int value) { StdVideoH264SpsFlags.set_delta_pic_order_always_zero_flag(this.segment(), index, value); return this; }
    /// Sets `delta_pic_order_always_zero_flag` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH264SpsFlags delta_pic_order_always_zero_flag(@CType("uint32_t : 1") int value) { StdVideoH264SpsFlags.set_delta_pic_order_always_zero_flag(this.segment(), value); return this; }

    /// {@return `separate_colour_plane_flag` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_separate_colour_plane_flag(MemorySegment segment, long index) { return (int) VH_separate_colour_plane_flag.get(segment, 0L, index); }
    /// {@return `separate_colour_plane_flag`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_separate_colour_plane_flag(MemorySegment segment) { return StdVideoH264SpsFlags.get_separate_colour_plane_flag(segment, 0L); }
    /// {@return `separate_colour_plane_flag` at the given index}
    /// @param index the index
    public @CType("uint32_t : 1") int separate_colour_plane_flagAt(long index) { return StdVideoH264SpsFlags.get_separate_colour_plane_flag(this.segment(), index); }
    /// {@return `separate_colour_plane_flag`}
    public @CType("uint32_t : 1") int separate_colour_plane_flag() { return StdVideoH264SpsFlags.get_separate_colour_plane_flag(this.segment()); }
    /// Sets `separate_colour_plane_flag` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_separate_colour_plane_flag(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_separate_colour_plane_flag.set(segment, 0L, index, value); }
    /// Sets `separate_colour_plane_flag` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_separate_colour_plane_flag(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoH264SpsFlags.set_separate_colour_plane_flag(segment, 0L, value); }
    /// Sets `separate_colour_plane_flag` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoH264SpsFlags separate_colour_plane_flagAt(long index, @CType("uint32_t : 1") int value) { StdVideoH264SpsFlags.set_separate_colour_plane_flag(this.segment(), index, value); return this; }
    /// Sets `separate_colour_plane_flag` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH264SpsFlags separate_colour_plane_flag(@CType("uint32_t : 1") int value) { StdVideoH264SpsFlags.set_separate_colour_plane_flag(this.segment(), value); return this; }

    /// {@return `gaps_in_frame_num_value_allowed_flag` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_gaps_in_frame_num_value_allowed_flag(MemorySegment segment, long index) { return (int) VH_gaps_in_frame_num_value_allowed_flag.get(segment, 0L, index); }
    /// {@return `gaps_in_frame_num_value_allowed_flag`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_gaps_in_frame_num_value_allowed_flag(MemorySegment segment) { return StdVideoH264SpsFlags.get_gaps_in_frame_num_value_allowed_flag(segment, 0L); }
    /// {@return `gaps_in_frame_num_value_allowed_flag` at the given index}
    /// @param index the index
    public @CType("uint32_t : 1") int gaps_in_frame_num_value_allowed_flagAt(long index) { return StdVideoH264SpsFlags.get_gaps_in_frame_num_value_allowed_flag(this.segment(), index); }
    /// {@return `gaps_in_frame_num_value_allowed_flag`}
    public @CType("uint32_t : 1") int gaps_in_frame_num_value_allowed_flag() { return StdVideoH264SpsFlags.get_gaps_in_frame_num_value_allowed_flag(this.segment()); }
    /// Sets `gaps_in_frame_num_value_allowed_flag` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_gaps_in_frame_num_value_allowed_flag(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_gaps_in_frame_num_value_allowed_flag.set(segment, 0L, index, value); }
    /// Sets `gaps_in_frame_num_value_allowed_flag` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_gaps_in_frame_num_value_allowed_flag(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoH264SpsFlags.set_gaps_in_frame_num_value_allowed_flag(segment, 0L, value); }
    /// Sets `gaps_in_frame_num_value_allowed_flag` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoH264SpsFlags gaps_in_frame_num_value_allowed_flagAt(long index, @CType("uint32_t : 1") int value) { StdVideoH264SpsFlags.set_gaps_in_frame_num_value_allowed_flag(this.segment(), index, value); return this; }
    /// Sets `gaps_in_frame_num_value_allowed_flag` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH264SpsFlags gaps_in_frame_num_value_allowed_flag(@CType("uint32_t : 1") int value) { StdVideoH264SpsFlags.set_gaps_in_frame_num_value_allowed_flag(this.segment(), value); return this; }

    /// {@return `qpprime_y_zero_transform_bypass_flag` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_qpprime_y_zero_transform_bypass_flag(MemorySegment segment, long index) { return (int) VH_qpprime_y_zero_transform_bypass_flag.get(segment, 0L, index); }
    /// {@return `qpprime_y_zero_transform_bypass_flag`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_qpprime_y_zero_transform_bypass_flag(MemorySegment segment) { return StdVideoH264SpsFlags.get_qpprime_y_zero_transform_bypass_flag(segment, 0L); }
    /// {@return `qpprime_y_zero_transform_bypass_flag` at the given index}
    /// @param index the index
    public @CType("uint32_t : 1") int qpprime_y_zero_transform_bypass_flagAt(long index) { return StdVideoH264SpsFlags.get_qpprime_y_zero_transform_bypass_flag(this.segment(), index); }
    /// {@return `qpprime_y_zero_transform_bypass_flag`}
    public @CType("uint32_t : 1") int qpprime_y_zero_transform_bypass_flag() { return StdVideoH264SpsFlags.get_qpprime_y_zero_transform_bypass_flag(this.segment()); }
    /// Sets `qpprime_y_zero_transform_bypass_flag` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_qpprime_y_zero_transform_bypass_flag(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_qpprime_y_zero_transform_bypass_flag.set(segment, 0L, index, value); }
    /// Sets `qpprime_y_zero_transform_bypass_flag` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_qpprime_y_zero_transform_bypass_flag(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoH264SpsFlags.set_qpprime_y_zero_transform_bypass_flag(segment, 0L, value); }
    /// Sets `qpprime_y_zero_transform_bypass_flag` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoH264SpsFlags qpprime_y_zero_transform_bypass_flagAt(long index, @CType("uint32_t : 1") int value) { StdVideoH264SpsFlags.set_qpprime_y_zero_transform_bypass_flag(this.segment(), index, value); return this; }
    /// Sets `qpprime_y_zero_transform_bypass_flag` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH264SpsFlags qpprime_y_zero_transform_bypass_flag(@CType("uint32_t : 1") int value) { StdVideoH264SpsFlags.set_qpprime_y_zero_transform_bypass_flag(this.segment(), value); return this; }

    /// {@return `frame_cropping_flag` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_frame_cropping_flag(MemorySegment segment, long index) { return (int) VH_frame_cropping_flag.get(segment, 0L, index); }
    /// {@return `frame_cropping_flag`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_frame_cropping_flag(MemorySegment segment) { return StdVideoH264SpsFlags.get_frame_cropping_flag(segment, 0L); }
    /// {@return `frame_cropping_flag` at the given index}
    /// @param index the index
    public @CType("uint32_t : 1") int frame_cropping_flagAt(long index) { return StdVideoH264SpsFlags.get_frame_cropping_flag(this.segment(), index); }
    /// {@return `frame_cropping_flag`}
    public @CType("uint32_t : 1") int frame_cropping_flag() { return StdVideoH264SpsFlags.get_frame_cropping_flag(this.segment()); }
    /// Sets `frame_cropping_flag` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_frame_cropping_flag(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_frame_cropping_flag.set(segment, 0L, index, value); }
    /// Sets `frame_cropping_flag` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_frame_cropping_flag(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoH264SpsFlags.set_frame_cropping_flag(segment, 0L, value); }
    /// Sets `frame_cropping_flag` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoH264SpsFlags frame_cropping_flagAt(long index, @CType("uint32_t : 1") int value) { StdVideoH264SpsFlags.set_frame_cropping_flag(this.segment(), index, value); return this; }
    /// Sets `frame_cropping_flag` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH264SpsFlags frame_cropping_flag(@CType("uint32_t : 1") int value) { StdVideoH264SpsFlags.set_frame_cropping_flag(this.segment(), value); return this; }

    /// {@return `seq_scaling_matrix_present_flag` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_seq_scaling_matrix_present_flag(MemorySegment segment, long index) { return (int) VH_seq_scaling_matrix_present_flag.get(segment, 0L, index); }
    /// {@return `seq_scaling_matrix_present_flag`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_seq_scaling_matrix_present_flag(MemorySegment segment) { return StdVideoH264SpsFlags.get_seq_scaling_matrix_present_flag(segment, 0L); }
    /// {@return `seq_scaling_matrix_present_flag` at the given index}
    /// @param index the index
    public @CType("uint32_t : 1") int seq_scaling_matrix_present_flagAt(long index) { return StdVideoH264SpsFlags.get_seq_scaling_matrix_present_flag(this.segment(), index); }
    /// {@return `seq_scaling_matrix_present_flag`}
    public @CType("uint32_t : 1") int seq_scaling_matrix_present_flag() { return StdVideoH264SpsFlags.get_seq_scaling_matrix_present_flag(this.segment()); }
    /// Sets `seq_scaling_matrix_present_flag` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_seq_scaling_matrix_present_flag(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_seq_scaling_matrix_present_flag.set(segment, 0L, index, value); }
    /// Sets `seq_scaling_matrix_present_flag` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_seq_scaling_matrix_present_flag(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoH264SpsFlags.set_seq_scaling_matrix_present_flag(segment, 0L, value); }
    /// Sets `seq_scaling_matrix_present_flag` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoH264SpsFlags seq_scaling_matrix_present_flagAt(long index, @CType("uint32_t : 1") int value) { StdVideoH264SpsFlags.set_seq_scaling_matrix_present_flag(this.segment(), index, value); return this; }
    /// Sets `seq_scaling_matrix_present_flag` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH264SpsFlags seq_scaling_matrix_present_flag(@CType("uint32_t : 1") int value) { StdVideoH264SpsFlags.set_seq_scaling_matrix_present_flag(this.segment(), value); return this; }

    /// {@return `vui_parameters_present_flag` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_vui_parameters_present_flag(MemorySegment segment, long index) { return (int) VH_vui_parameters_present_flag.get(segment, 0L, index); }
    /// {@return `vui_parameters_present_flag`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_vui_parameters_present_flag(MemorySegment segment) { return StdVideoH264SpsFlags.get_vui_parameters_present_flag(segment, 0L); }
    /// {@return `vui_parameters_present_flag` at the given index}
    /// @param index the index
    public @CType("uint32_t : 1") int vui_parameters_present_flagAt(long index) { return StdVideoH264SpsFlags.get_vui_parameters_present_flag(this.segment(), index); }
    /// {@return `vui_parameters_present_flag`}
    public @CType("uint32_t : 1") int vui_parameters_present_flag() { return StdVideoH264SpsFlags.get_vui_parameters_present_flag(this.segment()); }
    /// Sets `vui_parameters_present_flag` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_vui_parameters_present_flag(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_vui_parameters_present_flag.set(segment, 0L, index, value); }
    /// Sets `vui_parameters_present_flag` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_vui_parameters_present_flag(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoH264SpsFlags.set_vui_parameters_present_flag(segment, 0L, value); }
    /// Sets `vui_parameters_present_flag` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoH264SpsFlags vui_parameters_present_flagAt(long index, @CType("uint32_t : 1") int value) { StdVideoH264SpsFlags.set_vui_parameters_present_flag(this.segment(), index, value); return this; }
    /// Sets `vui_parameters_present_flag` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH264SpsFlags vui_parameters_present_flag(@CType("uint32_t : 1") int value) { StdVideoH264SpsFlags.set_vui_parameters_present_flag(this.segment(), value); return this; }

}
