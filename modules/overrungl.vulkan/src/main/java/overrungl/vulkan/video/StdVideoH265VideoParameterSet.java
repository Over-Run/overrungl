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
/// ### vps_video_parameter_set_id
/// [VarHandle][#VH_vps_video_parameter_set_id] - [Getter][#vps_video_parameter_set_id()] - [Setter][#vps_video_parameter_set_id(byte)]
/// ### vps_max_sub_layers_minus1
/// [VarHandle][#VH_vps_max_sub_layers_minus1] - [Getter][#vps_max_sub_layers_minus1()] - [Setter][#vps_max_sub_layers_minus1(byte)]
/// ### reserved1
/// [VarHandle][#VH_reserved1] - [Getter][#reserved1()] - [Setter][#reserved1(byte)]
/// ### reserved2
/// [VarHandle][#VH_reserved2] - [Getter][#reserved2()] - [Setter][#reserved2(byte)]
/// ### vps_num_units_in_tick
/// [VarHandle][#VH_vps_num_units_in_tick] - [Getter][#vps_num_units_in_tick()] - [Setter][#vps_num_units_in_tick(int)]
/// ### vps_time_scale
/// [VarHandle][#VH_vps_time_scale] - [Getter][#vps_time_scale()] - [Setter][#vps_time_scale(int)]
/// ### vps_num_ticks_poc_diff_one_minus1
/// [VarHandle][#VH_vps_num_ticks_poc_diff_one_minus1] - [Getter][#vps_num_ticks_poc_diff_one_minus1()] - [Setter][#vps_num_ticks_poc_diff_one_minus1(int)]
/// ### reserved3
/// [VarHandle][#VH_reserved3] - [Getter][#reserved3()] - [Setter][#reserved3(int)]
/// ### pDecPicBufMgr
/// [VarHandle][#VH_pDecPicBufMgr] - [Getter][#pDecPicBufMgr()] - [Setter][#pDecPicBufMgr(java.lang.foreign.MemorySegment)]
/// ### pHrdParameters
/// [VarHandle][#VH_pHrdParameters] - [Getter][#pHrdParameters()] - [Setter][#pHrdParameters(java.lang.foreign.MemorySegment)]
/// ### pProfileTierLevel
/// [VarHandle][#VH_pProfileTierLevel] - [Getter][#pProfileTierLevel()] - [Setter][#pProfileTierLevel(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct StdVideoH265VideoParameterSet {
///     StdVideoH265VpsFlags flags;
///     uint8_t vps_video_parameter_set_id;
///     uint8_t vps_max_sub_layers_minus1;
///     uint8_t reserved1;
///     uint8_t reserved2;
///     uint32_t vps_num_units_in_tick;
///     uint32_t vps_time_scale;
///     uint32_t vps_num_ticks_poc_diff_one_minus1;
///     uint32_t reserved3;
///     const StdVideoH265DecPicBufMgr * pDecPicBufMgr;
///     const StdVideoH265HrdParameters * pHrdParameters;
///     const StdVideoH265ProfileTierLevel * pProfileTierLevel;
/// } StdVideoH265VideoParameterSet;
/// ```
public final class StdVideoH265VideoParameterSet extends Struct {
    /// The struct layout of `StdVideoH265VideoParameterSet`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        StdVideoH265VpsFlags.LAYOUT.withName("flags"),
        ValueLayout.JAVA_BYTE.withName("vps_video_parameter_set_id"),
        ValueLayout.JAVA_BYTE.withName("vps_max_sub_layers_minus1"),
        ValueLayout.JAVA_BYTE.withName("reserved1"),
        ValueLayout.JAVA_BYTE.withName("reserved2"),
        ValueLayout.JAVA_INT.withName("vps_num_units_in_tick"),
        ValueLayout.JAVA_INT.withName("vps_time_scale"),
        ValueLayout.JAVA_INT.withName("vps_num_ticks_poc_diff_one_minus1"),
        ValueLayout.JAVA_INT.withName("reserved3"),
        ValueLayout.ADDRESS.withName("pDecPicBufMgr"),
        ValueLayout.ADDRESS.withName("pHrdParameters"),
        ValueLayout.ADDRESS.withName("pProfileTierLevel")
    );
    /// The [VarHandle] of `flags` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    /// The [VarHandle] of `vps_video_parameter_set_id` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_vps_video_parameter_set_id = LAYOUT.arrayElementVarHandle(PathElement.groupElement("vps_video_parameter_set_id"));
    /// The [VarHandle] of `vps_max_sub_layers_minus1` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_vps_max_sub_layers_minus1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("vps_max_sub_layers_minus1"));
    /// The [VarHandle] of `reserved1` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_reserved1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("reserved1"));
    /// The [VarHandle] of `reserved2` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_reserved2 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("reserved2"));
    /// The [VarHandle] of `vps_num_units_in_tick` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_vps_num_units_in_tick = LAYOUT.arrayElementVarHandle(PathElement.groupElement("vps_num_units_in_tick"));
    /// The [VarHandle] of `vps_time_scale` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_vps_time_scale = LAYOUT.arrayElementVarHandle(PathElement.groupElement("vps_time_scale"));
    /// The [VarHandle] of `vps_num_ticks_poc_diff_one_minus1` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_vps_num_ticks_poc_diff_one_minus1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("vps_num_ticks_poc_diff_one_minus1"));
    /// The [VarHandle] of `reserved3` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_reserved3 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("reserved3"));
    /// The [VarHandle] of `pDecPicBufMgr` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pDecPicBufMgr = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pDecPicBufMgr"));
    /// The [VarHandle] of `pHrdParameters` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pHrdParameters = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pHrdParameters"));
    /// The [VarHandle] of `pProfileTierLevel` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pProfileTierLevel = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pProfileTierLevel"));

    /// Creates `StdVideoH265VideoParameterSet` with the given segment.
    /// @param segment the memory segment
    public StdVideoH265VideoParameterSet(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `StdVideoH265VideoParameterSet` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoH265VideoParameterSet of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new StdVideoH265VideoParameterSet(segment); }

    /// Creates `StdVideoH265VideoParameterSet` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoH265VideoParameterSet ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new StdVideoH265VideoParameterSet(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `StdVideoH265VideoParameterSet` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoH265VideoParameterSet ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new StdVideoH265VideoParameterSet(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `StdVideoH265VideoParameterSet` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoH265VideoParameterSet`
    public static StdVideoH265VideoParameterSet alloc(SegmentAllocator allocator) { return new StdVideoH265VideoParameterSet(allocator.allocate(LAYOUT)); }

    /// Allocates a `StdVideoH265VideoParameterSet` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `StdVideoH265VideoParameterSet`
    public static StdVideoH265VideoParameterSet alloc(SegmentAllocator allocator, long count) { return new StdVideoH265VideoParameterSet(allocator.allocate(LAYOUT, count)); }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("StdVideoH265VpsFlags") java.lang.foreign.MemorySegment get_flags(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_flags.get(segment, 0L, index); }
    /// {@return `flags`}
    /// @param segment the segment of the struct
    public static @CType("StdVideoH265VpsFlags") java.lang.foreign.MemorySegment get_flags(MemorySegment segment) { return StdVideoH265VideoParameterSet.get_flags(segment, 0L); }
    /// {@return `flags` at the given index}
    /// @param index the index
    public @CType("StdVideoH265VpsFlags") java.lang.foreign.MemorySegment flagsAt(long index) { return StdVideoH265VideoParameterSet.get_flags(this.segment(), index); }
    /// {@return `flags`}
    public @CType("StdVideoH265VpsFlags") java.lang.foreign.MemorySegment flags() { return StdVideoH265VideoParameterSet.get_flags(this.segment()); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_flags(MemorySegment segment, long index, @CType("StdVideoH265VpsFlags") java.lang.foreign.MemorySegment value) { VH_flags.set(segment, 0L, index, value); }
    /// Sets `flags` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_flags(MemorySegment segment, @CType("StdVideoH265VpsFlags") java.lang.foreign.MemorySegment value) { StdVideoH265VideoParameterSet.set_flags(segment, 0L, value); }
    /// Sets `flags` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoH265VideoParameterSet flagsAt(long index, @CType("StdVideoH265VpsFlags") java.lang.foreign.MemorySegment value) { StdVideoH265VideoParameterSet.set_flags(this.segment(), index, value); return this; }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265VideoParameterSet flags(@CType("StdVideoH265VpsFlags") java.lang.foreign.MemorySegment value) { StdVideoH265VideoParameterSet.set_flags(this.segment(), value); return this; }

    /// {@return `vps_video_parameter_set_id` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t") byte get_vps_video_parameter_set_id(MemorySegment segment, long index) { return (byte) VH_vps_video_parameter_set_id.get(segment, 0L, index); }
    /// {@return `vps_video_parameter_set_id`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t") byte get_vps_video_parameter_set_id(MemorySegment segment) { return StdVideoH265VideoParameterSet.get_vps_video_parameter_set_id(segment, 0L); }
    /// {@return `vps_video_parameter_set_id` at the given index}
    /// @param index the index
    public @CType("uint8_t") byte vps_video_parameter_set_idAt(long index) { return StdVideoH265VideoParameterSet.get_vps_video_parameter_set_id(this.segment(), index); }
    /// {@return `vps_video_parameter_set_id`}
    public @CType("uint8_t") byte vps_video_parameter_set_id() { return StdVideoH265VideoParameterSet.get_vps_video_parameter_set_id(this.segment()); }
    /// Sets `vps_video_parameter_set_id` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_vps_video_parameter_set_id(MemorySegment segment, long index, @CType("uint8_t") byte value) { VH_vps_video_parameter_set_id.set(segment, 0L, index, value); }
    /// Sets `vps_video_parameter_set_id` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_vps_video_parameter_set_id(MemorySegment segment, @CType("uint8_t") byte value) { StdVideoH265VideoParameterSet.set_vps_video_parameter_set_id(segment, 0L, value); }
    /// Sets `vps_video_parameter_set_id` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoH265VideoParameterSet vps_video_parameter_set_idAt(long index, @CType("uint8_t") byte value) { StdVideoH265VideoParameterSet.set_vps_video_parameter_set_id(this.segment(), index, value); return this; }
    /// Sets `vps_video_parameter_set_id` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265VideoParameterSet vps_video_parameter_set_id(@CType("uint8_t") byte value) { StdVideoH265VideoParameterSet.set_vps_video_parameter_set_id(this.segment(), value); return this; }

    /// {@return `vps_max_sub_layers_minus1` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t") byte get_vps_max_sub_layers_minus1(MemorySegment segment, long index) { return (byte) VH_vps_max_sub_layers_minus1.get(segment, 0L, index); }
    /// {@return `vps_max_sub_layers_minus1`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t") byte get_vps_max_sub_layers_minus1(MemorySegment segment) { return StdVideoH265VideoParameterSet.get_vps_max_sub_layers_minus1(segment, 0L); }
    /// {@return `vps_max_sub_layers_minus1` at the given index}
    /// @param index the index
    public @CType("uint8_t") byte vps_max_sub_layers_minus1At(long index) { return StdVideoH265VideoParameterSet.get_vps_max_sub_layers_minus1(this.segment(), index); }
    /// {@return `vps_max_sub_layers_minus1`}
    public @CType("uint8_t") byte vps_max_sub_layers_minus1() { return StdVideoH265VideoParameterSet.get_vps_max_sub_layers_minus1(this.segment()); }
    /// Sets `vps_max_sub_layers_minus1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_vps_max_sub_layers_minus1(MemorySegment segment, long index, @CType("uint8_t") byte value) { VH_vps_max_sub_layers_minus1.set(segment, 0L, index, value); }
    /// Sets `vps_max_sub_layers_minus1` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_vps_max_sub_layers_minus1(MemorySegment segment, @CType("uint8_t") byte value) { StdVideoH265VideoParameterSet.set_vps_max_sub_layers_minus1(segment, 0L, value); }
    /// Sets `vps_max_sub_layers_minus1` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoH265VideoParameterSet vps_max_sub_layers_minus1At(long index, @CType("uint8_t") byte value) { StdVideoH265VideoParameterSet.set_vps_max_sub_layers_minus1(this.segment(), index, value); return this; }
    /// Sets `vps_max_sub_layers_minus1` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265VideoParameterSet vps_max_sub_layers_minus1(@CType("uint8_t") byte value) { StdVideoH265VideoParameterSet.set_vps_max_sub_layers_minus1(this.segment(), value); return this; }

    /// {@return `reserved1` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t") byte get_reserved1(MemorySegment segment, long index) { return (byte) VH_reserved1.get(segment, 0L, index); }
    /// {@return `reserved1`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t") byte get_reserved1(MemorySegment segment) { return StdVideoH265VideoParameterSet.get_reserved1(segment, 0L); }
    /// {@return `reserved1` at the given index}
    /// @param index the index
    public @CType("uint8_t") byte reserved1At(long index) { return StdVideoH265VideoParameterSet.get_reserved1(this.segment(), index); }
    /// {@return `reserved1`}
    public @CType("uint8_t") byte reserved1() { return StdVideoH265VideoParameterSet.get_reserved1(this.segment()); }
    /// Sets `reserved1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_reserved1(MemorySegment segment, long index, @CType("uint8_t") byte value) { VH_reserved1.set(segment, 0L, index, value); }
    /// Sets `reserved1` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_reserved1(MemorySegment segment, @CType("uint8_t") byte value) { StdVideoH265VideoParameterSet.set_reserved1(segment, 0L, value); }
    /// Sets `reserved1` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoH265VideoParameterSet reserved1At(long index, @CType("uint8_t") byte value) { StdVideoH265VideoParameterSet.set_reserved1(this.segment(), index, value); return this; }
    /// Sets `reserved1` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265VideoParameterSet reserved1(@CType("uint8_t") byte value) { StdVideoH265VideoParameterSet.set_reserved1(this.segment(), value); return this; }

    /// {@return `reserved2` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t") byte get_reserved2(MemorySegment segment, long index) { return (byte) VH_reserved2.get(segment, 0L, index); }
    /// {@return `reserved2`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t") byte get_reserved2(MemorySegment segment) { return StdVideoH265VideoParameterSet.get_reserved2(segment, 0L); }
    /// {@return `reserved2` at the given index}
    /// @param index the index
    public @CType("uint8_t") byte reserved2At(long index) { return StdVideoH265VideoParameterSet.get_reserved2(this.segment(), index); }
    /// {@return `reserved2`}
    public @CType("uint8_t") byte reserved2() { return StdVideoH265VideoParameterSet.get_reserved2(this.segment()); }
    /// Sets `reserved2` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_reserved2(MemorySegment segment, long index, @CType("uint8_t") byte value) { VH_reserved2.set(segment, 0L, index, value); }
    /// Sets `reserved2` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_reserved2(MemorySegment segment, @CType("uint8_t") byte value) { StdVideoH265VideoParameterSet.set_reserved2(segment, 0L, value); }
    /// Sets `reserved2` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoH265VideoParameterSet reserved2At(long index, @CType("uint8_t") byte value) { StdVideoH265VideoParameterSet.set_reserved2(this.segment(), index, value); return this; }
    /// Sets `reserved2` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265VideoParameterSet reserved2(@CType("uint8_t") byte value) { StdVideoH265VideoParameterSet.set_reserved2(this.segment(), value); return this; }

    /// {@return `vps_num_units_in_tick` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_vps_num_units_in_tick(MemorySegment segment, long index) { return (int) VH_vps_num_units_in_tick.get(segment, 0L, index); }
    /// {@return `vps_num_units_in_tick`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_vps_num_units_in_tick(MemorySegment segment) { return StdVideoH265VideoParameterSet.get_vps_num_units_in_tick(segment, 0L); }
    /// {@return `vps_num_units_in_tick` at the given index}
    /// @param index the index
    public @CType("uint32_t") int vps_num_units_in_tickAt(long index) { return StdVideoH265VideoParameterSet.get_vps_num_units_in_tick(this.segment(), index); }
    /// {@return `vps_num_units_in_tick`}
    public @CType("uint32_t") int vps_num_units_in_tick() { return StdVideoH265VideoParameterSet.get_vps_num_units_in_tick(this.segment()); }
    /// Sets `vps_num_units_in_tick` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_vps_num_units_in_tick(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_vps_num_units_in_tick.set(segment, 0L, index, value); }
    /// Sets `vps_num_units_in_tick` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_vps_num_units_in_tick(MemorySegment segment, @CType("uint32_t") int value) { StdVideoH265VideoParameterSet.set_vps_num_units_in_tick(segment, 0L, value); }
    /// Sets `vps_num_units_in_tick` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoH265VideoParameterSet vps_num_units_in_tickAt(long index, @CType("uint32_t") int value) { StdVideoH265VideoParameterSet.set_vps_num_units_in_tick(this.segment(), index, value); return this; }
    /// Sets `vps_num_units_in_tick` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265VideoParameterSet vps_num_units_in_tick(@CType("uint32_t") int value) { StdVideoH265VideoParameterSet.set_vps_num_units_in_tick(this.segment(), value); return this; }

    /// {@return `vps_time_scale` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_vps_time_scale(MemorySegment segment, long index) { return (int) VH_vps_time_scale.get(segment, 0L, index); }
    /// {@return `vps_time_scale`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_vps_time_scale(MemorySegment segment) { return StdVideoH265VideoParameterSet.get_vps_time_scale(segment, 0L); }
    /// {@return `vps_time_scale` at the given index}
    /// @param index the index
    public @CType("uint32_t") int vps_time_scaleAt(long index) { return StdVideoH265VideoParameterSet.get_vps_time_scale(this.segment(), index); }
    /// {@return `vps_time_scale`}
    public @CType("uint32_t") int vps_time_scale() { return StdVideoH265VideoParameterSet.get_vps_time_scale(this.segment()); }
    /// Sets `vps_time_scale` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_vps_time_scale(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_vps_time_scale.set(segment, 0L, index, value); }
    /// Sets `vps_time_scale` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_vps_time_scale(MemorySegment segment, @CType("uint32_t") int value) { StdVideoH265VideoParameterSet.set_vps_time_scale(segment, 0L, value); }
    /// Sets `vps_time_scale` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoH265VideoParameterSet vps_time_scaleAt(long index, @CType("uint32_t") int value) { StdVideoH265VideoParameterSet.set_vps_time_scale(this.segment(), index, value); return this; }
    /// Sets `vps_time_scale` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265VideoParameterSet vps_time_scale(@CType("uint32_t") int value) { StdVideoH265VideoParameterSet.set_vps_time_scale(this.segment(), value); return this; }

    /// {@return `vps_num_ticks_poc_diff_one_minus1` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_vps_num_ticks_poc_diff_one_minus1(MemorySegment segment, long index) { return (int) VH_vps_num_ticks_poc_diff_one_minus1.get(segment, 0L, index); }
    /// {@return `vps_num_ticks_poc_diff_one_minus1`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_vps_num_ticks_poc_diff_one_minus1(MemorySegment segment) { return StdVideoH265VideoParameterSet.get_vps_num_ticks_poc_diff_one_minus1(segment, 0L); }
    /// {@return `vps_num_ticks_poc_diff_one_minus1` at the given index}
    /// @param index the index
    public @CType("uint32_t") int vps_num_ticks_poc_diff_one_minus1At(long index) { return StdVideoH265VideoParameterSet.get_vps_num_ticks_poc_diff_one_minus1(this.segment(), index); }
    /// {@return `vps_num_ticks_poc_diff_one_minus1`}
    public @CType("uint32_t") int vps_num_ticks_poc_diff_one_minus1() { return StdVideoH265VideoParameterSet.get_vps_num_ticks_poc_diff_one_minus1(this.segment()); }
    /// Sets `vps_num_ticks_poc_diff_one_minus1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_vps_num_ticks_poc_diff_one_minus1(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_vps_num_ticks_poc_diff_one_minus1.set(segment, 0L, index, value); }
    /// Sets `vps_num_ticks_poc_diff_one_minus1` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_vps_num_ticks_poc_diff_one_minus1(MemorySegment segment, @CType("uint32_t") int value) { StdVideoH265VideoParameterSet.set_vps_num_ticks_poc_diff_one_minus1(segment, 0L, value); }
    /// Sets `vps_num_ticks_poc_diff_one_minus1` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoH265VideoParameterSet vps_num_ticks_poc_diff_one_minus1At(long index, @CType("uint32_t") int value) { StdVideoH265VideoParameterSet.set_vps_num_ticks_poc_diff_one_minus1(this.segment(), index, value); return this; }
    /// Sets `vps_num_ticks_poc_diff_one_minus1` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265VideoParameterSet vps_num_ticks_poc_diff_one_minus1(@CType("uint32_t") int value) { StdVideoH265VideoParameterSet.set_vps_num_ticks_poc_diff_one_minus1(this.segment(), value); return this; }

    /// {@return `reserved3` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_reserved3(MemorySegment segment, long index) { return (int) VH_reserved3.get(segment, 0L, index); }
    /// {@return `reserved3`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_reserved3(MemorySegment segment) { return StdVideoH265VideoParameterSet.get_reserved3(segment, 0L); }
    /// {@return `reserved3` at the given index}
    /// @param index the index
    public @CType("uint32_t") int reserved3At(long index) { return StdVideoH265VideoParameterSet.get_reserved3(this.segment(), index); }
    /// {@return `reserved3`}
    public @CType("uint32_t") int reserved3() { return StdVideoH265VideoParameterSet.get_reserved3(this.segment()); }
    /// Sets `reserved3` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_reserved3(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_reserved3.set(segment, 0L, index, value); }
    /// Sets `reserved3` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_reserved3(MemorySegment segment, @CType("uint32_t") int value) { StdVideoH265VideoParameterSet.set_reserved3(segment, 0L, value); }
    /// Sets `reserved3` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoH265VideoParameterSet reserved3At(long index, @CType("uint32_t") int value) { StdVideoH265VideoParameterSet.set_reserved3(this.segment(), index, value); return this; }
    /// Sets `reserved3` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265VideoParameterSet reserved3(@CType("uint32_t") int value) { StdVideoH265VideoParameterSet.set_reserved3(this.segment(), value); return this; }

    /// {@return `pDecPicBufMgr` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const StdVideoH265DecPicBufMgr *") java.lang.foreign.MemorySegment get_pDecPicBufMgr(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pDecPicBufMgr.get(segment, 0L, index); }
    /// {@return `pDecPicBufMgr`}
    /// @param segment the segment of the struct
    public static @CType("const StdVideoH265DecPicBufMgr *") java.lang.foreign.MemorySegment get_pDecPicBufMgr(MemorySegment segment) { return StdVideoH265VideoParameterSet.get_pDecPicBufMgr(segment, 0L); }
    /// {@return `pDecPicBufMgr` at the given index}
    /// @param index the index
    public @CType("const StdVideoH265DecPicBufMgr *") java.lang.foreign.MemorySegment pDecPicBufMgrAt(long index) { return StdVideoH265VideoParameterSet.get_pDecPicBufMgr(this.segment(), index); }
    /// {@return `pDecPicBufMgr`}
    public @CType("const StdVideoH265DecPicBufMgr *") java.lang.foreign.MemorySegment pDecPicBufMgr() { return StdVideoH265VideoParameterSet.get_pDecPicBufMgr(this.segment()); }
    /// Sets `pDecPicBufMgr` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pDecPicBufMgr(MemorySegment segment, long index, @CType("const StdVideoH265DecPicBufMgr *") java.lang.foreign.MemorySegment value) { VH_pDecPicBufMgr.set(segment, 0L, index, value); }
    /// Sets `pDecPicBufMgr` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pDecPicBufMgr(MemorySegment segment, @CType("const StdVideoH265DecPicBufMgr *") java.lang.foreign.MemorySegment value) { StdVideoH265VideoParameterSet.set_pDecPicBufMgr(segment, 0L, value); }
    /// Sets `pDecPicBufMgr` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoH265VideoParameterSet pDecPicBufMgrAt(long index, @CType("const StdVideoH265DecPicBufMgr *") java.lang.foreign.MemorySegment value) { StdVideoH265VideoParameterSet.set_pDecPicBufMgr(this.segment(), index, value); return this; }
    /// Sets `pDecPicBufMgr` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265VideoParameterSet pDecPicBufMgr(@CType("const StdVideoH265DecPicBufMgr *") java.lang.foreign.MemorySegment value) { StdVideoH265VideoParameterSet.set_pDecPicBufMgr(this.segment(), value); return this; }

    /// {@return `pHrdParameters` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const StdVideoH265HrdParameters *") java.lang.foreign.MemorySegment get_pHrdParameters(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pHrdParameters.get(segment, 0L, index); }
    /// {@return `pHrdParameters`}
    /// @param segment the segment of the struct
    public static @CType("const StdVideoH265HrdParameters *") java.lang.foreign.MemorySegment get_pHrdParameters(MemorySegment segment) { return StdVideoH265VideoParameterSet.get_pHrdParameters(segment, 0L); }
    /// {@return `pHrdParameters` at the given index}
    /// @param index the index
    public @CType("const StdVideoH265HrdParameters *") java.lang.foreign.MemorySegment pHrdParametersAt(long index) { return StdVideoH265VideoParameterSet.get_pHrdParameters(this.segment(), index); }
    /// {@return `pHrdParameters`}
    public @CType("const StdVideoH265HrdParameters *") java.lang.foreign.MemorySegment pHrdParameters() { return StdVideoH265VideoParameterSet.get_pHrdParameters(this.segment()); }
    /// Sets `pHrdParameters` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pHrdParameters(MemorySegment segment, long index, @CType("const StdVideoH265HrdParameters *") java.lang.foreign.MemorySegment value) { VH_pHrdParameters.set(segment, 0L, index, value); }
    /// Sets `pHrdParameters` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pHrdParameters(MemorySegment segment, @CType("const StdVideoH265HrdParameters *") java.lang.foreign.MemorySegment value) { StdVideoH265VideoParameterSet.set_pHrdParameters(segment, 0L, value); }
    /// Sets `pHrdParameters` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoH265VideoParameterSet pHrdParametersAt(long index, @CType("const StdVideoH265HrdParameters *") java.lang.foreign.MemorySegment value) { StdVideoH265VideoParameterSet.set_pHrdParameters(this.segment(), index, value); return this; }
    /// Sets `pHrdParameters` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265VideoParameterSet pHrdParameters(@CType("const StdVideoH265HrdParameters *") java.lang.foreign.MemorySegment value) { StdVideoH265VideoParameterSet.set_pHrdParameters(this.segment(), value); return this; }

    /// {@return `pProfileTierLevel` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const StdVideoH265ProfileTierLevel *") java.lang.foreign.MemorySegment get_pProfileTierLevel(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pProfileTierLevel.get(segment, 0L, index); }
    /// {@return `pProfileTierLevel`}
    /// @param segment the segment of the struct
    public static @CType("const StdVideoH265ProfileTierLevel *") java.lang.foreign.MemorySegment get_pProfileTierLevel(MemorySegment segment) { return StdVideoH265VideoParameterSet.get_pProfileTierLevel(segment, 0L); }
    /// {@return `pProfileTierLevel` at the given index}
    /// @param index the index
    public @CType("const StdVideoH265ProfileTierLevel *") java.lang.foreign.MemorySegment pProfileTierLevelAt(long index) { return StdVideoH265VideoParameterSet.get_pProfileTierLevel(this.segment(), index); }
    /// {@return `pProfileTierLevel`}
    public @CType("const StdVideoH265ProfileTierLevel *") java.lang.foreign.MemorySegment pProfileTierLevel() { return StdVideoH265VideoParameterSet.get_pProfileTierLevel(this.segment()); }
    /// Sets `pProfileTierLevel` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pProfileTierLevel(MemorySegment segment, long index, @CType("const StdVideoH265ProfileTierLevel *") java.lang.foreign.MemorySegment value) { VH_pProfileTierLevel.set(segment, 0L, index, value); }
    /// Sets `pProfileTierLevel` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pProfileTierLevel(MemorySegment segment, @CType("const StdVideoH265ProfileTierLevel *") java.lang.foreign.MemorySegment value) { StdVideoH265VideoParameterSet.set_pProfileTierLevel(segment, 0L, value); }
    /// Sets `pProfileTierLevel` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoH265VideoParameterSet pProfileTierLevelAt(long index, @CType("const StdVideoH265ProfileTierLevel *") java.lang.foreign.MemorySegment value) { StdVideoH265VideoParameterSet.set_pProfileTierLevel(this.segment(), index, value); return this; }
    /// Sets `pProfileTierLevel` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265VideoParameterSet pProfileTierLevel(@CType("const StdVideoH265ProfileTierLevel *") java.lang.foreign.MemorySegment value) { StdVideoH265VideoParameterSet.set_pProfileTierLevel(this.segment(), value); return this; }

}
