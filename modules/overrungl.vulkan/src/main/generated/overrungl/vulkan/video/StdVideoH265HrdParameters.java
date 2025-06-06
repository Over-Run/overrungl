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
//@formatter:off
package overrungl.vulkan.video;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct StdVideoH265HrdParameters {
///     (struct StdVideoH265HrdFlags) StdVideoH265HrdFlags flags;
///     uint8_t tick_divisor_minus2;
///     uint8_t du_cpb_removal_delay_increment_length_minus1;
///     uint8_t dpb_output_delay_du_length_minus1;
///     uint8_t bit_rate_scale;
///     uint8_t cpb_size_scale;
///     uint8_t cpb_size_du_scale;
///     uint8_t initial_cpb_removal_delay_length_minus1;
///     uint8_t au_cpb_removal_delay_length_minus1;
///     uint8_t dpb_output_delay_length_minus1;
///     uint8_t cpb_cnt_minus1[7];
///     uint16_t elemental_duration_in_tc_minus1[7];
///     uint16_t reserved[3];
///     const StdVideoH265SubLayerHrdParameters* pSubLayerHrdParametersNal;
///     const StdVideoH265SubLayerHrdParameters* pSubLayerHrdParametersVcl;
/// };
/// ```
public sealed class StdVideoH265HrdParameters extends GroupType {
    /// The struct layout of `StdVideoH265HrdParameters`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        overrungl.vulkan.video.StdVideoH265HrdFlags.LAYOUT.withName("flags"),
        ValueLayout.JAVA_BYTE.withName("tick_divisor_minus2"),
        ValueLayout.JAVA_BYTE.withName("du_cpb_removal_delay_increment_length_minus1"),
        ValueLayout.JAVA_BYTE.withName("dpb_output_delay_du_length_minus1"),
        ValueLayout.JAVA_BYTE.withName("bit_rate_scale"),
        ValueLayout.JAVA_BYTE.withName("cpb_size_scale"),
        ValueLayout.JAVA_BYTE.withName("cpb_size_du_scale"),
        ValueLayout.JAVA_BYTE.withName("initial_cpb_removal_delay_length_minus1"),
        ValueLayout.JAVA_BYTE.withName("au_cpb_removal_delay_length_minus1"),
        ValueLayout.JAVA_BYTE.withName("dpb_output_delay_length_minus1"),
        MemoryLayout.sequenceLayout(7, ValueLayout.JAVA_BYTE).withName("cpb_cnt_minus1"),
        MemoryLayout.sequenceLayout(7, ValueLayout.JAVA_SHORT).withName("elemental_duration_in_tc_minus1"),
        MemoryLayout.sequenceLayout(3, ValueLayout.JAVA_SHORT).withName("reserved"),
        ValueLayout.ADDRESS.withName("pSubLayerHrdParametersNal"),
        ValueLayout.ADDRESS.withName("pSubLayerHrdParametersVcl")
    );
    /// The byte offset of `flags`.
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    /// The memory layout of `flags`.
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    /// The byte offset of `tick_divisor_minus2`.
    public static final long OFFSET_tick_divisor_minus2 = LAYOUT.byteOffset(PathElement.groupElement("tick_divisor_minus2"));
    /// The memory layout of `tick_divisor_minus2`.
    public static final MemoryLayout LAYOUT_tick_divisor_minus2 = LAYOUT.select(PathElement.groupElement("tick_divisor_minus2"));
    /// The [VarHandle] of `tick_divisor_minus2` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_tick_divisor_minus2 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("tick_divisor_minus2"));
    /// The byte offset of `du_cpb_removal_delay_increment_length_minus1`.
    public static final long OFFSET_du_cpb_removal_delay_increment_length_minus1 = LAYOUT.byteOffset(PathElement.groupElement("du_cpb_removal_delay_increment_length_minus1"));
    /// The memory layout of `du_cpb_removal_delay_increment_length_minus1`.
    public static final MemoryLayout LAYOUT_du_cpb_removal_delay_increment_length_minus1 = LAYOUT.select(PathElement.groupElement("du_cpb_removal_delay_increment_length_minus1"));
    /// The [VarHandle] of `du_cpb_removal_delay_increment_length_minus1` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_du_cpb_removal_delay_increment_length_minus1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("du_cpb_removal_delay_increment_length_minus1"));
    /// The byte offset of `dpb_output_delay_du_length_minus1`.
    public static final long OFFSET_dpb_output_delay_du_length_minus1 = LAYOUT.byteOffset(PathElement.groupElement("dpb_output_delay_du_length_minus1"));
    /// The memory layout of `dpb_output_delay_du_length_minus1`.
    public static final MemoryLayout LAYOUT_dpb_output_delay_du_length_minus1 = LAYOUT.select(PathElement.groupElement("dpb_output_delay_du_length_minus1"));
    /// The [VarHandle] of `dpb_output_delay_du_length_minus1` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_dpb_output_delay_du_length_minus1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dpb_output_delay_du_length_minus1"));
    /// The byte offset of `bit_rate_scale`.
    public static final long OFFSET_bit_rate_scale = LAYOUT.byteOffset(PathElement.groupElement("bit_rate_scale"));
    /// The memory layout of `bit_rate_scale`.
    public static final MemoryLayout LAYOUT_bit_rate_scale = LAYOUT.select(PathElement.groupElement("bit_rate_scale"));
    /// The [VarHandle] of `bit_rate_scale` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_bit_rate_scale = LAYOUT.arrayElementVarHandle(PathElement.groupElement("bit_rate_scale"));
    /// The byte offset of `cpb_size_scale`.
    public static final long OFFSET_cpb_size_scale = LAYOUT.byteOffset(PathElement.groupElement("cpb_size_scale"));
    /// The memory layout of `cpb_size_scale`.
    public static final MemoryLayout LAYOUT_cpb_size_scale = LAYOUT.select(PathElement.groupElement("cpb_size_scale"));
    /// The [VarHandle] of `cpb_size_scale` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_cpb_size_scale = LAYOUT.arrayElementVarHandle(PathElement.groupElement("cpb_size_scale"));
    /// The byte offset of `cpb_size_du_scale`.
    public static final long OFFSET_cpb_size_du_scale = LAYOUT.byteOffset(PathElement.groupElement("cpb_size_du_scale"));
    /// The memory layout of `cpb_size_du_scale`.
    public static final MemoryLayout LAYOUT_cpb_size_du_scale = LAYOUT.select(PathElement.groupElement("cpb_size_du_scale"));
    /// The [VarHandle] of `cpb_size_du_scale` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_cpb_size_du_scale = LAYOUT.arrayElementVarHandle(PathElement.groupElement("cpb_size_du_scale"));
    /// The byte offset of `initial_cpb_removal_delay_length_minus1`.
    public static final long OFFSET_initial_cpb_removal_delay_length_minus1 = LAYOUT.byteOffset(PathElement.groupElement("initial_cpb_removal_delay_length_minus1"));
    /// The memory layout of `initial_cpb_removal_delay_length_minus1`.
    public static final MemoryLayout LAYOUT_initial_cpb_removal_delay_length_minus1 = LAYOUT.select(PathElement.groupElement("initial_cpb_removal_delay_length_minus1"));
    /// The [VarHandle] of `initial_cpb_removal_delay_length_minus1` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_initial_cpb_removal_delay_length_minus1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("initial_cpb_removal_delay_length_minus1"));
    /// The byte offset of `au_cpb_removal_delay_length_minus1`.
    public static final long OFFSET_au_cpb_removal_delay_length_minus1 = LAYOUT.byteOffset(PathElement.groupElement("au_cpb_removal_delay_length_minus1"));
    /// The memory layout of `au_cpb_removal_delay_length_minus1`.
    public static final MemoryLayout LAYOUT_au_cpb_removal_delay_length_minus1 = LAYOUT.select(PathElement.groupElement("au_cpb_removal_delay_length_minus1"));
    /// The [VarHandle] of `au_cpb_removal_delay_length_minus1` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_au_cpb_removal_delay_length_minus1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("au_cpb_removal_delay_length_minus1"));
    /// The byte offset of `dpb_output_delay_length_minus1`.
    public static final long OFFSET_dpb_output_delay_length_minus1 = LAYOUT.byteOffset(PathElement.groupElement("dpb_output_delay_length_minus1"));
    /// The memory layout of `dpb_output_delay_length_minus1`.
    public static final MemoryLayout LAYOUT_dpb_output_delay_length_minus1 = LAYOUT.select(PathElement.groupElement("dpb_output_delay_length_minus1"));
    /// The [VarHandle] of `dpb_output_delay_length_minus1` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_dpb_output_delay_length_minus1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dpb_output_delay_length_minus1"));
    /// The byte offset of `cpb_cnt_minus1`.
    public static final long OFFSET_cpb_cnt_minus1 = LAYOUT.byteOffset(PathElement.groupElement("cpb_cnt_minus1"));
    /// The memory layout of `cpb_cnt_minus1`.
    public static final MemoryLayout LAYOUT_cpb_cnt_minus1 = LAYOUT.select(PathElement.groupElement("cpb_cnt_minus1"));
    /// The [VarHandle] of `cpb_cnt_minus1` of type `(MemorySegment base, long baseOffset, long index, long index0)MemorySegment`.
    public static final VarHandle VH_cpb_cnt_minus1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("cpb_cnt_minus1"), PathElement.sequenceElement());
    /// The byte offset of `elemental_duration_in_tc_minus1`.
    public static final long OFFSET_elemental_duration_in_tc_minus1 = LAYOUT.byteOffset(PathElement.groupElement("elemental_duration_in_tc_minus1"));
    /// The memory layout of `elemental_duration_in_tc_minus1`.
    public static final MemoryLayout LAYOUT_elemental_duration_in_tc_minus1 = LAYOUT.select(PathElement.groupElement("elemental_duration_in_tc_minus1"));
    /// The [VarHandle] of `elemental_duration_in_tc_minus1` of type `(MemorySegment base, long baseOffset, long index, long index0)MemorySegment`.
    public static final VarHandle VH_elemental_duration_in_tc_minus1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("elemental_duration_in_tc_minus1"), PathElement.sequenceElement());
    /// The byte offset of `reserved`.
    public static final long OFFSET_reserved = LAYOUT.byteOffset(PathElement.groupElement("reserved"));
    /// The memory layout of `reserved`.
    public static final MemoryLayout LAYOUT_reserved = LAYOUT.select(PathElement.groupElement("reserved"));
    /// The [VarHandle] of `reserved` of type `(MemorySegment base, long baseOffset, long index, long index0)MemorySegment`.
    public static final VarHandle VH_reserved = LAYOUT.arrayElementVarHandle(PathElement.groupElement("reserved"), PathElement.sequenceElement());
    /// The byte offset of `pSubLayerHrdParametersNal`.
    public static final long OFFSET_pSubLayerHrdParametersNal = LAYOUT.byteOffset(PathElement.groupElement("pSubLayerHrdParametersNal"));
    /// The memory layout of `pSubLayerHrdParametersNal`.
    public static final MemoryLayout LAYOUT_pSubLayerHrdParametersNal = LAYOUT.select(PathElement.groupElement("pSubLayerHrdParametersNal"));
    /// The [VarHandle] of `pSubLayerHrdParametersNal` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pSubLayerHrdParametersNal = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pSubLayerHrdParametersNal"));
    /// The byte offset of `pSubLayerHrdParametersVcl`.
    public static final long OFFSET_pSubLayerHrdParametersVcl = LAYOUT.byteOffset(PathElement.groupElement("pSubLayerHrdParametersVcl"));
    /// The memory layout of `pSubLayerHrdParametersVcl`.
    public static final MemoryLayout LAYOUT_pSubLayerHrdParametersVcl = LAYOUT.select(PathElement.groupElement("pSubLayerHrdParametersVcl"));
    /// The [VarHandle] of `pSubLayerHrdParametersVcl` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pSubLayerHrdParametersVcl = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pSubLayerHrdParametersVcl"));

    /// Creates `StdVideoH265HrdParameters` with the given segment.
    /// @param segment the memory segment
    public StdVideoH265HrdParameters(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `StdVideoH265HrdParameters` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `StdVideoH265HrdParameters` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoH265HrdParameters ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoH265HrdParameters(segment.reinterpret(LAYOUT.byteSize())); }

    /// Creates `StdVideoH265HrdParameters` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `StdVideoH265HrdParameters` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoH265HrdParameters`
    public static StdVideoH265HrdParameters alloc(SegmentAllocator allocator) { return new StdVideoH265HrdParameters(allocator.allocate(LAYOUT)); }

    /// Allocates a `StdVideoH265HrdParameters` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `StdVideoH265HrdParameters`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `StdVideoH265HrdParameters` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param flags `flags`
    /// @param tick_divisor_minus2 `tick_divisor_minus2`
    /// @param du_cpb_removal_delay_increment_length_minus1 `du_cpb_removal_delay_increment_length_minus1`
    /// @param dpb_output_delay_du_length_minus1 `dpb_output_delay_du_length_minus1`
    /// @param bit_rate_scale `bit_rate_scale`
    /// @param cpb_size_scale `cpb_size_scale`
    /// @param cpb_size_du_scale `cpb_size_du_scale`
    /// @param initial_cpb_removal_delay_length_minus1 `initial_cpb_removal_delay_length_minus1`
    /// @param au_cpb_removal_delay_length_minus1 `au_cpb_removal_delay_length_minus1`
    /// @param dpb_output_delay_length_minus1 `dpb_output_delay_length_minus1`
    /// @param cpb_cnt_minus1 `cpb_cnt_minus1`
    /// @param elemental_duration_in_tc_minus1 `elemental_duration_in_tc_minus1`
    /// @param reserved `reserved`
    /// @param pSubLayerHrdParametersNal `pSubLayerHrdParametersNal`
    /// @param pSubLayerHrdParametersVcl `pSubLayerHrdParametersVcl`
    /// @return the allocated `StdVideoH265HrdParameters`
    public static StdVideoH265HrdParameters allocInit(SegmentAllocator allocator, MemorySegment flags, byte tick_divisor_minus2, byte du_cpb_removal_delay_increment_length_minus1, byte dpb_output_delay_du_length_minus1, byte bit_rate_scale, byte cpb_size_scale, byte cpb_size_du_scale, byte initial_cpb_removal_delay_length_minus1, byte au_cpb_removal_delay_length_minus1, byte dpb_output_delay_length_minus1, MemorySegment cpb_cnt_minus1, MemorySegment elemental_duration_in_tc_minus1, MemorySegment reserved, MemorySegment pSubLayerHrdParametersNal, MemorySegment pSubLayerHrdParametersVcl) {
        return alloc(allocator).flags(flags).tick_divisor_minus2(tick_divisor_minus2).du_cpb_removal_delay_increment_length_minus1(du_cpb_removal_delay_increment_length_minus1).dpb_output_delay_du_length_minus1(dpb_output_delay_du_length_minus1).bit_rate_scale(bit_rate_scale).cpb_size_scale(cpb_size_scale).cpb_size_du_scale(cpb_size_du_scale).initial_cpb_removal_delay_length_minus1(initial_cpb_removal_delay_length_minus1).au_cpb_removal_delay_length_minus1(au_cpb_removal_delay_length_minus1).dpb_output_delay_length_minus1(dpb_output_delay_length_minus1).cpb_cnt_minus1(cpb_cnt_minus1).elemental_duration_in_tc_minus1(elemental_duration_in_tc_minus1).reserved(reserved).pSubLayerHrdParametersNal(pSubLayerHrdParametersNal).pSubLayerHrdParametersVcl(pSubLayerHrdParametersVcl);
    }

    /// Allocates a `StdVideoH265HrdParameters` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param flags `flags`
    /// @param tick_divisor_minus2 `tick_divisor_minus2`
    /// @param du_cpb_removal_delay_increment_length_minus1 `du_cpb_removal_delay_increment_length_minus1`
    /// @param dpb_output_delay_du_length_minus1 `dpb_output_delay_du_length_minus1`
    /// @param bit_rate_scale `bit_rate_scale`
    /// @param cpb_size_scale `cpb_size_scale`
    /// @param cpb_size_du_scale `cpb_size_du_scale`
    /// @param initial_cpb_removal_delay_length_minus1 `initial_cpb_removal_delay_length_minus1`
    /// @param au_cpb_removal_delay_length_minus1 `au_cpb_removal_delay_length_minus1`
    /// @param dpb_output_delay_length_minus1 `dpb_output_delay_length_minus1`
    /// @param cpb_cnt_minus1 `cpb_cnt_minus1`
    /// @param elemental_duration_in_tc_minus1 `elemental_duration_in_tc_minus1`
    /// @param reserved `reserved`
    /// @param pSubLayerHrdParametersNal `pSubLayerHrdParametersNal`
    /// @return the allocated `StdVideoH265HrdParameters`
    public static StdVideoH265HrdParameters allocInit(SegmentAllocator allocator, MemorySegment flags, byte tick_divisor_minus2, byte du_cpb_removal_delay_increment_length_minus1, byte dpb_output_delay_du_length_minus1, byte bit_rate_scale, byte cpb_size_scale, byte cpb_size_du_scale, byte initial_cpb_removal_delay_length_minus1, byte au_cpb_removal_delay_length_minus1, byte dpb_output_delay_length_minus1, MemorySegment cpb_cnt_minus1, MemorySegment elemental_duration_in_tc_minus1, MemorySegment reserved, MemorySegment pSubLayerHrdParametersNal) {
        return alloc(allocator).flags(flags).tick_divisor_minus2(tick_divisor_minus2).du_cpb_removal_delay_increment_length_minus1(du_cpb_removal_delay_increment_length_minus1).dpb_output_delay_du_length_minus1(dpb_output_delay_du_length_minus1).bit_rate_scale(bit_rate_scale).cpb_size_scale(cpb_size_scale).cpb_size_du_scale(cpb_size_du_scale).initial_cpb_removal_delay_length_minus1(initial_cpb_removal_delay_length_minus1).au_cpb_removal_delay_length_minus1(au_cpb_removal_delay_length_minus1).dpb_output_delay_length_minus1(dpb_output_delay_length_minus1).cpb_cnt_minus1(cpb_cnt_minus1).elemental_duration_in_tc_minus1(elemental_duration_in_tc_minus1).reserved(reserved).pSubLayerHrdParametersNal(pSubLayerHrdParametersNal);
    }

    /// Allocates a `StdVideoH265HrdParameters` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param flags `flags`
    /// @param tick_divisor_minus2 `tick_divisor_minus2`
    /// @param du_cpb_removal_delay_increment_length_minus1 `du_cpb_removal_delay_increment_length_minus1`
    /// @param dpb_output_delay_du_length_minus1 `dpb_output_delay_du_length_minus1`
    /// @param bit_rate_scale `bit_rate_scale`
    /// @param cpb_size_scale `cpb_size_scale`
    /// @param cpb_size_du_scale `cpb_size_du_scale`
    /// @param initial_cpb_removal_delay_length_minus1 `initial_cpb_removal_delay_length_minus1`
    /// @param au_cpb_removal_delay_length_minus1 `au_cpb_removal_delay_length_minus1`
    /// @param dpb_output_delay_length_minus1 `dpb_output_delay_length_minus1`
    /// @param cpb_cnt_minus1 `cpb_cnt_minus1`
    /// @param elemental_duration_in_tc_minus1 `elemental_duration_in_tc_minus1`
    /// @param reserved `reserved`
    /// @return the allocated `StdVideoH265HrdParameters`
    public static StdVideoH265HrdParameters allocInit(SegmentAllocator allocator, MemorySegment flags, byte tick_divisor_minus2, byte du_cpb_removal_delay_increment_length_minus1, byte dpb_output_delay_du_length_minus1, byte bit_rate_scale, byte cpb_size_scale, byte cpb_size_du_scale, byte initial_cpb_removal_delay_length_minus1, byte au_cpb_removal_delay_length_minus1, byte dpb_output_delay_length_minus1, MemorySegment cpb_cnt_minus1, MemorySegment elemental_duration_in_tc_minus1, MemorySegment reserved) {
        return alloc(allocator).flags(flags).tick_divisor_minus2(tick_divisor_minus2).du_cpb_removal_delay_increment_length_minus1(du_cpb_removal_delay_increment_length_minus1).dpb_output_delay_du_length_minus1(dpb_output_delay_du_length_minus1).bit_rate_scale(bit_rate_scale).cpb_size_scale(cpb_size_scale).cpb_size_du_scale(cpb_size_du_scale).initial_cpb_removal_delay_length_minus1(initial_cpb_removal_delay_length_minus1).au_cpb_removal_delay_length_minus1(au_cpb_removal_delay_length_minus1).dpb_output_delay_length_minus1(dpb_output_delay_length_minus1).cpb_cnt_minus1(cpb_cnt_minus1).elemental_duration_in_tc_minus1(elemental_duration_in_tc_minus1).reserved(reserved);
    }

    /// Allocates a `StdVideoH265HrdParameters` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param flags `flags`
    /// @param tick_divisor_minus2 `tick_divisor_minus2`
    /// @param du_cpb_removal_delay_increment_length_minus1 `du_cpb_removal_delay_increment_length_minus1`
    /// @param dpb_output_delay_du_length_minus1 `dpb_output_delay_du_length_minus1`
    /// @param bit_rate_scale `bit_rate_scale`
    /// @param cpb_size_scale `cpb_size_scale`
    /// @param cpb_size_du_scale `cpb_size_du_scale`
    /// @param initial_cpb_removal_delay_length_minus1 `initial_cpb_removal_delay_length_minus1`
    /// @param au_cpb_removal_delay_length_minus1 `au_cpb_removal_delay_length_minus1`
    /// @param dpb_output_delay_length_minus1 `dpb_output_delay_length_minus1`
    /// @param cpb_cnt_minus1 `cpb_cnt_minus1`
    /// @param elemental_duration_in_tc_minus1 `elemental_duration_in_tc_minus1`
    /// @return the allocated `StdVideoH265HrdParameters`
    public static StdVideoH265HrdParameters allocInit(SegmentAllocator allocator, MemorySegment flags, byte tick_divisor_minus2, byte du_cpb_removal_delay_increment_length_minus1, byte dpb_output_delay_du_length_minus1, byte bit_rate_scale, byte cpb_size_scale, byte cpb_size_du_scale, byte initial_cpb_removal_delay_length_minus1, byte au_cpb_removal_delay_length_minus1, byte dpb_output_delay_length_minus1, MemorySegment cpb_cnt_minus1, MemorySegment elemental_duration_in_tc_minus1) {
        return alloc(allocator).flags(flags).tick_divisor_minus2(tick_divisor_minus2).du_cpb_removal_delay_increment_length_minus1(du_cpb_removal_delay_increment_length_minus1).dpb_output_delay_du_length_minus1(dpb_output_delay_du_length_minus1).bit_rate_scale(bit_rate_scale).cpb_size_scale(cpb_size_scale).cpb_size_du_scale(cpb_size_du_scale).initial_cpb_removal_delay_length_minus1(initial_cpb_removal_delay_length_minus1).au_cpb_removal_delay_length_minus1(au_cpb_removal_delay_length_minus1).dpb_output_delay_length_minus1(dpb_output_delay_length_minus1).cpb_cnt_minus1(cpb_cnt_minus1).elemental_duration_in_tc_minus1(elemental_duration_in_tc_minus1);
    }

    /// Allocates a `StdVideoH265HrdParameters` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param flags `flags`
    /// @param tick_divisor_minus2 `tick_divisor_minus2`
    /// @param du_cpb_removal_delay_increment_length_minus1 `du_cpb_removal_delay_increment_length_minus1`
    /// @param dpb_output_delay_du_length_minus1 `dpb_output_delay_du_length_minus1`
    /// @param bit_rate_scale `bit_rate_scale`
    /// @param cpb_size_scale `cpb_size_scale`
    /// @param cpb_size_du_scale `cpb_size_du_scale`
    /// @param initial_cpb_removal_delay_length_minus1 `initial_cpb_removal_delay_length_minus1`
    /// @param au_cpb_removal_delay_length_minus1 `au_cpb_removal_delay_length_minus1`
    /// @param dpb_output_delay_length_minus1 `dpb_output_delay_length_minus1`
    /// @param cpb_cnt_minus1 `cpb_cnt_minus1`
    /// @return the allocated `StdVideoH265HrdParameters`
    public static StdVideoH265HrdParameters allocInit(SegmentAllocator allocator, MemorySegment flags, byte tick_divisor_minus2, byte du_cpb_removal_delay_increment_length_minus1, byte dpb_output_delay_du_length_minus1, byte bit_rate_scale, byte cpb_size_scale, byte cpb_size_du_scale, byte initial_cpb_removal_delay_length_minus1, byte au_cpb_removal_delay_length_minus1, byte dpb_output_delay_length_minus1, MemorySegment cpb_cnt_minus1) {
        return alloc(allocator).flags(flags).tick_divisor_minus2(tick_divisor_minus2).du_cpb_removal_delay_increment_length_minus1(du_cpb_removal_delay_increment_length_minus1).dpb_output_delay_du_length_minus1(dpb_output_delay_du_length_minus1).bit_rate_scale(bit_rate_scale).cpb_size_scale(cpb_size_scale).cpb_size_du_scale(cpb_size_du_scale).initial_cpb_removal_delay_length_minus1(initial_cpb_removal_delay_length_minus1).au_cpb_removal_delay_length_minus1(au_cpb_removal_delay_length_minus1).dpb_output_delay_length_minus1(dpb_output_delay_length_minus1).cpb_cnt_minus1(cpb_cnt_minus1);
    }

    /// Allocates a `StdVideoH265HrdParameters` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param flags `flags`
    /// @param tick_divisor_minus2 `tick_divisor_minus2`
    /// @param du_cpb_removal_delay_increment_length_minus1 `du_cpb_removal_delay_increment_length_minus1`
    /// @param dpb_output_delay_du_length_minus1 `dpb_output_delay_du_length_minus1`
    /// @param bit_rate_scale `bit_rate_scale`
    /// @param cpb_size_scale `cpb_size_scale`
    /// @param cpb_size_du_scale `cpb_size_du_scale`
    /// @param initial_cpb_removal_delay_length_minus1 `initial_cpb_removal_delay_length_minus1`
    /// @param au_cpb_removal_delay_length_minus1 `au_cpb_removal_delay_length_minus1`
    /// @param dpb_output_delay_length_minus1 `dpb_output_delay_length_minus1`
    /// @return the allocated `StdVideoH265HrdParameters`
    public static StdVideoH265HrdParameters allocInit(SegmentAllocator allocator, MemorySegment flags, byte tick_divisor_minus2, byte du_cpb_removal_delay_increment_length_minus1, byte dpb_output_delay_du_length_minus1, byte bit_rate_scale, byte cpb_size_scale, byte cpb_size_du_scale, byte initial_cpb_removal_delay_length_minus1, byte au_cpb_removal_delay_length_minus1, byte dpb_output_delay_length_minus1) {
        return alloc(allocator).flags(flags).tick_divisor_minus2(tick_divisor_minus2).du_cpb_removal_delay_increment_length_minus1(du_cpb_removal_delay_increment_length_minus1).dpb_output_delay_du_length_minus1(dpb_output_delay_du_length_minus1).bit_rate_scale(bit_rate_scale).cpb_size_scale(cpb_size_scale).cpb_size_du_scale(cpb_size_du_scale).initial_cpb_removal_delay_length_minus1(initial_cpb_removal_delay_length_minus1).au_cpb_removal_delay_length_minus1(au_cpb_removal_delay_length_minus1).dpb_output_delay_length_minus1(dpb_output_delay_length_minus1);
    }

    /// Allocates a `StdVideoH265HrdParameters` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param flags `flags`
    /// @param tick_divisor_minus2 `tick_divisor_minus2`
    /// @param du_cpb_removal_delay_increment_length_minus1 `du_cpb_removal_delay_increment_length_minus1`
    /// @param dpb_output_delay_du_length_minus1 `dpb_output_delay_du_length_minus1`
    /// @param bit_rate_scale `bit_rate_scale`
    /// @param cpb_size_scale `cpb_size_scale`
    /// @param cpb_size_du_scale `cpb_size_du_scale`
    /// @param initial_cpb_removal_delay_length_minus1 `initial_cpb_removal_delay_length_minus1`
    /// @param au_cpb_removal_delay_length_minus1 `au_cpb_removal_delay_length_minus1`
    /// @return the allocated `StdVideoH265HrdParameters`
    public static StdVideoH265HrdParameters allocInit(SegmentAllocator allocator, MemorySegment flags, byte tick_divisor_minus2, byte du_cpb_removal_delay_increment_length_minus1, byte dpb_output_delay_du_length_minus1, byte bit_rate_scale, byte cpb_size_scale, byte cpb_size_du_scale, byte initial_cpb_removal_delay_length_minus1, byte au_cpb_removal_delay_length_minus1) {
        return alloc(allocator).flags(flags).tick_divisor_minus2(tick_divisor_minus2).du_cpb_removal_delay_increment_length_minus1(du_cpb_removal_delay_increment_length_minus1).dpb_output_delay_du_length_minus1(dpb_output_delay_du_length_minus1).bit_rate_scale(bit_rate_scale).cpb_size_scale(cpb_size_scale).cpb_size_du_scale(cpb_size_du_scale).initial_cpb_removal_delay_length_minus1(initial_cpb_removal_delay_length_minus1).au_cpb_removal_delay_length_minus1(au_cpb_removal_delay_length_minus1);
    }

    /// Allocates a `StdVideoH265HrdParameters` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param flags `flags`
    /// @param tick_divisor_minus2 `tick_divisor_minus2`
    /// @param du_cpb_removal_delay_increment_length_minus1 `du_cpb_removal_delay_increment_length_minus1`
    /// @param dpb_output_delay_du_length_minus1 `dpb_output_delay_du_length_minus1`
    /// @param bit_rate_scale `bit_rate_scale`
    /// @param cpb_size_scale `cpb_size_scale`
    /// @param cpb_size_du_scale `cpb_size_du_scale`
    /// @param initial_cpb_removal_delay_length_minus1 `initial_cpb_removal_delay_length_minus1`
    /// @return the allocated `StdVideoH265HrdParameters`
    public static StdVideoH265HrdParameters allocInit(SegmentAllocator allocator, MemorySegment flags, byte tick_divisor_minus2, byte du_cpb_removal_delay_increment_length_minus1, byte dpb_output_delay_du_length_minus1, byte bit_rate_scale, byte cpb_size_scale, byte cpb_size_du_scale, byte initial_cpb_removal_delay_length_minus1) {
        return alloc(allocator).flags(flags).tick_divisor_minus2(tick_divisor_minus2).du_cpb_removal_delay_increment_length_minus1(du_cpb_removal_delay_increment_length_minus1).dpb_output_delay_du_length_minus1(dpb_output_delay_du_length_minus1).bit_rate_scale(bit_rate_scale).cpb_size_scale(cpb_size_scale).cpb_size_du_scale(cpb_size_du_scale).initial_cpb_removal_delay_length_minus1(initial_cpb_removal_delay_length_minus1);
    }

    /// Allocates a `StdVideoH265HrdParameters` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param flags `flags`
    /// @param tick_divisor_minus2 `tick_divisor_minus2`
    /// @param du_cpb_removal_delay_increment_length_minus1 `du_cpb_removal_delay_increment_length_minus1`
    /// @param dpb_output_delay_du_length_minus1 `dpb_output_delay_du_length_minus1`
    /// @param bit_rate_scale `bit_rate_scale`
    /// @param cpb_size_scale `cpb_size_scale`
    /// @param cpb_size_du_scale `cpb_size_du_scale`
    /// @return the allocated `StdVideoH265HrdParameters`
    public static StdVideoH265HrdParameters allocInit(SegmentAllocator allocator, MemorySegment flags, byte tick_divisor_minus2, byte du_cpb_removal_delay_increment_length_minus1, byte dpb_output_delay_du_length_minus1, byte bit_rate_scale, byte cpb_size_scale, byte cpb_size_du_scale) {
        return alloc(allocator).flags(flags).tick_divisor_minus2(tick_divisor_minus2).du_cpb_removal_delay_increment_length_minus1(du_cpb_removal_delay_increment_length_minus1).dpb_output_delay_du_length_minus1(dpb_output_delay_du_length_minus1).bit_rate_scale(bit_rate_scale).cpb_size_scale(cpb_size_scale).cpb_size_du_scale(cpb_size_du_scale);
    }

    /// Allocates a `StdVideoH265HrdParameters` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param flags `flags`
    /// @param tick_divisor_minus2 `tick_divisor_minus2`
    /// @param du_cpb_removal_delay_increment_length_minus1 `du_cpb_removal_delay_increment_length_minus1`
    /// @param dpb_output_delay_du_length_minus1 `dpb_output_delay_du_length_minus1`
    /// @param bit_rate_scale `bit_rate_scale`
    /// @param cpb_size_scale `cpb_size_scale`
    /// @return the allocated `StdVideoH265HrdParameters`
    public static StdVideoH265HrdParameters allocInit(SegmentAllocator allocator, MemorySegment flags, byte tick_divisor_minus2, byte du_cpb_removal_delay_increment_length_minus1, byte dpb_output_delay_du_length_minus1, byte bit_rate_scale, byte cpb_size_scale) {
        return alloc(allocator).flags(flags).tick_divisor_minus2(tick_divisor_minus2).du_cpb_removal_delay_increment_length_minus1(du_cpb_removal_delay_increment_length_minus1).dpb_output_delay_du_length_minus1(dpb_output_delay_du_length_minus1).bit_rate_scale(bit_rate_scale).cpb_size_scale(cpb_size_scale);
    }

    /// Allocates a `StdVideoH265HrdParameters` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param flags `flags`
    /// @param tick_divisor_minus2 `tick_divisor_minus2`
    /// @param du_cpb_removal_delay_increment_length_minus1 `du_cpb_removal_delay_increment_length_minus1`
    /// @param dpb_output_delay_du_length_minus1 `dpb_output_delay_du_length_minus1`
    /// @param bit_rate_scale `bit_rate_scale`
    /// @return the allocated `StdVideoH265HrdParameters`
    public static StdVideoH265HrdParameters allocInit(SegmentAllocator allocator, MemorySegment flags, byte tick_divisor_minus2, byte du_cpb_removal_delay_increment_length_minus1, byte dpb_output_delay_du_length_minus1, byte bit_rate_scale) {
        return alloc(allocator).flags(flags).tick_divisor_minus2(tick_divisor_minus2).du_cpb_removal_delay_increment_length_minus1(du_cpb_removal_delay_increment_length_minus1).dpb_output_delay_du_length_minus1(dpb_output_delay_du_length_minus1).bit_rate_scale(bit_rate_scale);
    }

    /// Allocates a `StdVideoH265HrdParameters` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param flags `flags`
    /// @param tick_divisor_minus2 `tick_divisor_minus2`
    /// @param du_cpb_removal_delay_increment_length_minus1 `du_cpb_removal_delay_increment_length_minus1`
    /// @param dpb_output_delay_du_length_minus1 `dpb_output_delay_du_length_minus1`
    /// @return the allocated `StdVideoH265HrdParameters`
    public static StdVideoH265HrdParameters allocInit(SegmentAllocator allocator, MemorySegment flags, byte tick_divisor_minus2, byte du_cpb_removal_delay_increment_length_minus1, byte dpb_output_delay_du_length_minus1) {
        return alloc(allocator).flags(flags).tick_divisor_minus2(tick_divisor_minus2).du_cpb_removal_delay_increment_length_minus1(du_cpb_removal_delay_increment_length_minus1).dpb_output_delay_du_length_minus1(dpb_output_delay_du_length_minus1);
    }

    /// Allocates a `StdVideoH265HrdParameters` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param flags `flags`
    /// @param tick_divisor_minus2 `tick_divisor_minus2`
    /// @param du_cpb_removal_delay_increment_length_minus1 `du_cpb_removal_delay_increment_length_minus1`
    /// @return the allocated `StdVideoH265HrdParameters`
    public static StdVideoH265HrdParameters allocInit(SegmentAllocator allocator, MemorySegment flags, byte tick_divisor_minus2, byte du_cpb_removal_delay_increment_length_minus1) {
        return alloc(allocator).flags(flags).tick_divisor_minus2(tick_divisor_minus2).du_cpb_removal_delay_increment_length_minus1(du_cpb_removal_delay_increment_length_minus1);
    }

    /// Allocates a `StdVideoH265HrdParameters` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param flags `flags`
    /// @param tick_divisor_minus2 `tick_divisor_minus2`
    /// @return the allocated `StdVideoH265HrdParameters`
    public static StdVideoH265HrdParameters allocInit(SegmentAllocator allocator, MemorySegment flags, byte tick_divisor_minus2) {
        return alloc(allocator).flags(flags).tick_divisor_minus2(tick_divisor_minus2);
    }

    /// Allocates a `StdVideoH265HrdParameters` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param flags `flags`
    /// @return the allocated `StdVideoH265HrdParameters`
    public static StdVideoH265HrdParameters allocInit(SegmentAllocator allocator, MemorySegment flags) {
        return alloc(allocator).flags(flags);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public StdVideoH265HrdParameters copyFrom(StdVideoH265HrdParameters src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { if (this instanceof Buffer buf) return buf; else return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment flags(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_flags, index), LAYOUT_flags); }
    /// {@return `flags`}
    public MemorySegment flags() { return flags(this.segment(), 0L); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void flags(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_flags, index), LAYOUT_flags.byteSize()); }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265HrdParameters flags(MemorySegment value) { flags(this.segment(), 0L, value); return this; }

    /// {@return `tick_divisor_minus2` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte tick_divisor_minus2(MemorySegment segment, long index) { return (byte) VH_tick_divisor_minus2.get(segment, 0L, index); }
    /// {@return `tick_divisor_minus2`}
    public byte tick_divisor_minus2() { return tick_divisor_minus2(this.segment(), 0L); }
    /// Sets `tick_divisor_minus2` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void tick_divisor_minus2(MemorySegment segment, long index, byte value) { VH_tick_divisor_minus2.set(segment, 0L, index, value); }
    /// Sets `tick_divisor_minus2` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265HrdParameters tick_divisor_minus2(byte value) { tick_divisor_minus2(this.segment(), 0L, value); return this; }

    /// {@return `du_cpb_removal_delay_increment_length_minus1` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte du_cpb_removal_delay_increment_length_minus1(MemorySegment segment, long index) { return (byte) VH_du_cpb_removal_delay_increment_length_minus1.get(segment, 0L, index); }
    /// {@return `du_cpb_removal_delay_increment_length_minus1`}
    public byte du_cpb_removal_delay_increment_length_minus1() { return du_cpb_removal_delay_increment_length_minus1(this.segment(), 0L); }
    /// Sets `du_cpb_removal_delay_increment_length_minus1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void du_cpb_removal_delay_increment_length_minus1(MemorySegment segment, long index, byte value) { VH_du_cpb_removal_delay_increment_length_minus1.set(segment, 0L, index, value); }
    /// Sets `du_cpb_removal_delay_increment_length_minus1` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265HrdParameters du_cpb_removal_delay_increment_length_minus1(byte value) { du_cpb_removal_delay_increment_length_minus1(this.segment(), 0L, value); return this; }

    /// {@return `dpb_output_delay_du_length_minus1` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte dpb_output_delay_du_length_minus1(MemorySegment segment, long index) { return (byte) VH_dpb_output_delay_du_length_minus1.get(segment, 0L, index); }
    /// {@return `dpb_output_delay_du_length_minus1`}
    public byte dpb_output_delay_du_length_minus1() { return dpb_output_delay_du_length_minus1(this.segment(), 0L); }
    /// Sets `dpb_output_delay_du_length_minus1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void dpb_output_delay_du_length_minus1(MemorySegment segment, long index, byte value) { VH_dpb_output_delay_du_length_minus1.set(segment, 0L, index, value); }
    /// Sets `dpb_output_delay_du_length_minus1` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265HrdParameters dpb_output_delay_du_length_minus1(byte value) { dpb_output_delay_du_length_minus1(this.segment(), 0L, value); return this; }

    /// {@return `bit_rate_scale` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte bit_rate_scale(MemorySegment segment, long index) { return (byte) VH_bit_rate_scale.get(segment, 0L, index); }
    /// {@return `bit_rate_scale`}
    public byte bit_rate_scale() { return bit_rate_scale(this.segment(), 0L); }
    /// Sets `bit_rate_scale` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void bit_rate_scale(MemorySegment segment, long index, byte value) { VH_bit_rate_scale.set(segment, 0L, index, value); }
    /// Sets `bit_rate_scale` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265HrdParameters bit_rate_scale(byte value) { bit_rate_scale(this.segment(), 0L, value); return this; }

    /// {@return `cpb_size_scale` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte cpb_size_scale(MemorySegment segment, long index) { return (byte) VH_cpb_size_scale.get(segment, 0L, index); }
    /// {@return `cpb_size_scale`}
    public byte cpb_size_scale() { return cpb_size_scale(this.segment(), 0L); }
    /// Sets `cpb_size_scale` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void cpb_size_scale(MemorySegment segment, long index, byte value) { VH_cpb_size_scale.set(segment, 0L, index, value); }
    /// Sets `cpb_size_scale` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265HrdParameters cpb_size_scale(byte value) { cpb_size_scale(this.segment(), 0L, value); return this; }

    /// {@return `cpb_size_du_scale` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte cpb_size_du_scale(MemorySegment segment, long index) { return (byte) VH_cpb_size_du_scale.get(segment, 0L, index); }
    /// {@return `cpb_size_du_scale`}
    public byte cpb_size_du_scale() { return cpb_size_du_scale(this.segment(), 0L); }
    /// Sets `cpb_size_du_scale` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void cpb_size_du_scale(MemorySegment segment, long index, byte value) { VH_cpb_size_du_scale.set(segment, 0L, index, value); }
    /// Sets `cpb_size_du_scale` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265HrdParameters cpb_size_du_scale(byte value) { cpb_size_du_scale(this.segment(), 0L, value); return this; }

    /// {@return `initial_cpb_removal_delay_length_minus1` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte initial_cpb_removal_delay_length_minus1(MemorySegment segment, long index) { return (byte) VH_initial_cpb_removal_delay_length_minus1.get(segment, 0L, index); }
    /// {@return `initial_cpb_removal_delay_length_minus1`}
    public byte initial_cpb_removal_delay_length_minus1() { return initial_cpb_removal_delay_length_minus1(this.segment(), 0L); }
    /// Sets `initial_cpb_removal_delay_length_minus1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void initial_cpb_removal_delay_length_minus1(MemorySegment segment, long index, byte value) { VH_initial_cpb_removal_delay_length_minus1.set(segment, 0L, index, value); }
    /// Sets `initial_cpb_removal_delay_length_minus1` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265HrdParameters initial_cpb_removal_delay_length_minus1(byte value) { initial_cpb_removal_delay_length_minus1(this.segment(), 0L, value); return this; }

    /// {@return `au_cpb_removal_delay_length_minus1` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte au_cpb_removal_delay_length_minus1(MemorySegment segment, long index) { return (byte) VH_au_cpb_removal_delay_length_minus1.get(segment, 0L, index); }
    /// {@return `au_cpb_removal_delay_length_minus1`}
    public byte au_cpb_removal_delay_length_minus1() { return au_cpb_removal_delay_length_minus1(this.segment(), 0L); }
    /// Sets `au_cpb_removal_delay_length_minus1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void au_cpb_removal_delay_length_minus1(MemorySegment segment, long index, byte value) { VH_au_cpb_removal_delay_length_minus1.set(segment, 0L, index, value); }
    /// Sets `au_cpb_removal_delay_length_minus1` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265HrdParameters au_cpb_removal_delay_length_minus1(byte value) { au_cpb_removal_delay_length_minus1(this.segment(), 0L, value); return this; }

    /// {@return `dpb_output_delay_length_minus1` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte dpb_output_delay_length_minus1(MemorySegment segment, long index) { return (byte) VH_dpb_output_delay_length_minus1.get(segment, 0L, index); }
    /// {@return `dpb_output_delay_length_minus1`}
    public byte dpb_output_delay_length_minus1() { return dpb_output_delay_length_minus1(this.segment(), 0L); }
    /// Sets `dpb_output_delay_length_minus1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void dpb_output_delay_length_minus1(MemorySegment segment, long index, byte value) { VH_dpb_output_delay_length_minus1.set(segment, 0L, index, value); }
    /// Sets `dpb_output_delay_length_minus1` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265HrdParameters dpb_output_delay_length_minus1(byte value) { dpb_output_delay_length_minus1(this.segment(), 0L, value); return this; }

    /// {@return `cpb_cnt_minus1` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment cpb_cnt_minus1(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_cpb_cnt_minus1, index), LAYOUT_cpb_cnt_minus1); }
    /// {@return `cpb_cnt_minus1` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    public static byte cpb_cnt_minus1(MemorySegment segment, long index, long index0) { return (byte) VH_cpb_cnt_minus1.get(segment, 0L, index, index0); }
    /// {@return `cpb_cnt_minus1`}
    public MemorySegment cpb_cnt_minus1() { return cpb_cnt_minus1(this.segment(), 0L); }
    /// {@return `cpb_cnt_minus1`}
    /// @param index0 the Index 0 of the array
    public byte cpb_cnt_minus1(long index0) { return cpb_cnt_minus1(this.segment(), 0L, index0); }
    /// Sets `cpb_cnt_minus1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void cpb_cnt_minus1(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_cpb_cnt_minus1, index), LAYOUT_cpb_cnt_minus1.byteSize()); }
    /// Sets `cpb_cnt_minus1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    public static void cpb_cnt_minus1(MemorySegment segment, long index, long index0, byte value) { VH_cpb_cnt_minus1.set(segment, 0L, index, index0, value); }
    /// Sets `cpb_cnt_minus1` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265HrdParameters cpb_cnt_minus1(MemorySegment value) { cpb_cnt_minus1(this.segment(), 0L, value); return this; }
    /// Sets `cpb_cnt_minus1` with the given value.
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public StdVideoH265HrdParameters cpb_cnt_minus1(long index0, byte value) { cpb_cnt_minus1(this.segment(), 0L, index0, value); return this; }

    /// {@return `elemental_duration_in_tc_minus1` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment elemental_duration_in_tc_minus1(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_elemental_duration_in_tc_minus1, index), LAYOUT_elemental_duration_in_tc_minus1); }
    /// {@return `elemental_duration_in_tc_minus1` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    public static short elemental_duration_in_tc_minus1(MemorySegment segment, long index, long index0) { return (short) VH_elemental_duration_in_tc_minus1.get(segment, 0L, index, index0); }
    /// {@return `elemental_duration_in_tc_minus1`}
    public MemorySegment elemental_duration_in_tc_minus1() { return elemental_duration_in_tc_minus1(this.segment(), 0L); }
    /// {@return `elemental_duration_in_tc_minus1`}
    /// @param index0 the Index 0 of the array
    public short elemental_duration_in_tc_minus1(long index0) { return elemental_duration_in_tc_minus1(this.segment(), 0L, index0); }
    /// Sets `elemental_duration_in_tc_minus1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void elemental_duration_in_tc_minus1(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_elemental_duration_in_tc_minus1, index), LAYOUT_elemental_duration_in_tc_minus1.byteSize()); }
    /// Sets `elemental_duration_in_tc_minus1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    public static void elemental_duration_in_tc_minus1(MemorySegment segment, long index, long index0, short value) { VH_elemental_duration_in_tc_minus1.set(segment, 0L, index, index0, value); }
    /// Sets `elemental_duration_in_tc_minus1` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265HrdParameters elemental_duration_in_tc_minus1(MemorySegment value) { elemental_duration_in_tc_minus1(this.segment(), 0L, value); return this; }
    /// Sets `elemental_duration_in_tc_minus1` with the given value.
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public StdVideoH265HrdParameters elemental_duration_in_tc_minus1(long index0, short value) { elemental_duration_in_tc_minus1(this.segment(), 0L, index0, value); return this; }

    /// {@return `reserved` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment reserved(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_reserved, index), LAYOUT_reserved); }
    /// {@return `reserved` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    public static short reserved(MemorySegment segment, long index, long index0) { return (short) VH_reserved.get(segment, 0L, index, index0); }
    /// {@return `reserved`}
    public MemorySegment reserved() { return reserved(this.segment(), 0L); }
    /// {@return `reserved`}
    /// @param index0 the Index 0 of the array
    public short reserved(long index0) { return reserved(this.segment(), 0L, index0); }
    /// Sets `reserved` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void reserved(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_reserved, index), LAYOUT_reserved.byteSize()); }
    /// Sets `reserved` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    public static void reserved(MemorySegment segment, long index, long index0, short value) { VH_reserved.set(segment, 0L, index, index0, value); }
    /// Sets `reserved` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265HrdParameters reserved(MemorySegment value) { reserved(this.segment(), 0L, value); return this; }
    /// Sets `reserved` with the given value.
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public StdVideoH265HrdParameters reserved(long index0, short value) { reserved(this.segment(), 0L, index0, value); return this; }

    /// {@return `pSubLayerHrdParametersNal` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pSubLayerHrdParametersNal(MemorySegment segment, long index) { return (MemorySegment) VH_pSubLayerHrdParametersNal.get(segment, 0L, index); }
    /// {@return `pSubLayerHrdParametersNal`}
    public MemorySegment pSubLayerHrdParametersNal() { return pSubLayerHrdParametersNal(this.segment(), 0L); }
    /// Sets `pSubLayerHrdParametersNal` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pSubLayerHrdParametersNal(MemorySegment segment, long index, MemorySegment value) { VH_pSubLayerHrdParametersNal.set(segment, 0L, index, value); }
    /// Sets `pSubLayerHrdParametersNal` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265HrdParameters pSubLayerHrdParametersNal(MemorySegment value) { pSubLayerHrdParametersNal(this.segment(), 0L, value); return this; }

    /// {@return `pSubLayerHrdParametersVcl` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pSubLayerHrdParametersVcl(MemorySegment segment, long index) { return (MemorySegment) VH_pSubLayerHrdParametersVcl.get(segment, 0L, index); }
    /// {@return `pSubLayerHrdParametersVcl`}
    public MemorySegment pSubLayerHrdParametersVcl() { return pSubLayerHrdParametersVcl(this.segment(), 0L); }
    /// Sets `pSubLayerHrdParametersVcl` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pSubLayerHrdParametersVcl(MemorySegment segment, long index, MemorySegment value) { VH_pSubLayerHrdParametersVcl.set(segment, 0L, index, value); }
    /// Sets `pSubLayerHrdParametersVcl` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265HrdParameters pSubLayerHrdParametersVcl(MemorySegment value) { pSubLayerHrdParametersVcl(this.segment(), 0L, value); return this; }

    /// A buffer of [StdVideoH265HrdParameters].
    public static final class Buffer extends StdVideoH265HrdParameters {
        private final long elementCount;

        /// Creates `StdVideoH265HrdParameters.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `StdVideoH265HrdParameters`.
        /// @param index the index of the struct buffer
        /// @return the slice of `StdVideoH265HrdParameters`
        public StdVideoH265HrdParameters asSlice(long index) { return new StdVideoH265HrdParameters(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `StdVideoH265HrdParameters`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `StdVideoH265HrdParameters`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `flags` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment flagsAt(long index) { return flags(this.segment(), index); }
        /// Sets `flags` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer flagsAt(long index, MemorySegment value) { flags(this.segment(), index, value); return this; }

        /// {@return `tick_divisor_minus2` at the given index}
        /// @param index the index of the struct buffer
        public byte tick_divisor_minus2At(long index) { return tick_divisor_minus2(this.segment(), index); }
        /// Sets `tick_divisor_minus2` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer tick_divisor_minus2At(long index, byte value) { tick_divisor_minus2(this.segment(), index, value); return this; }

        /// {@return `du_cpb_removal_delay_increment_length_minus1` at the given index}
        /// @param index the index of the struct buffer
        public byte du_cpb_removal_delay_increment_length_minus1At(long index) { return du_cpb_removal_delay_increment_length_minus1(this.segment(), index); }
        /// Sets `du_cpb_removal_delay_increment_length_minus1` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer du_cpb_removal_delay_increment_length_minus1At(long index, byte value) { du_cpb_removal_delay_increment_length_minus1(this.segment(), index, value); return this; }

        /// {@return `dpb_output_delay_du_length_minus1` at the given index}
        /// @param index the index of the struct buffer
        public byte dpb_output_delay_du_length_minus1At(long index) { return dpb_output_delay_du_length_minus1(this.segment(), index); }
        /// Sets `dpb_output_delay_du_length_minus1` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer dpb_output_delay_du_length_minus1At(long index, byte value) { dpb_output_delay_du_length_minus1(this.segment(), index, value); return this; }

        /// {@return `bit_rate_scale` at the given index}
        /// @param index the index of the struct buffer
        public byte bit_rate_scaleAt(long index) { return bit_rate_scale(this.segment(), index); }
        /// Sets `bit_rate_scale` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer bit_rate_scaleAt(long index, byte value) { bit_rate_scale(this.segment(), index, value); return this; }

        /// {@return `cpb_size_scale` at the given index}
        /// @param index the index of the struct buffer
        public byte cpb_size_scaleAt(long index) { return cpb_size_scale(this.segment(), index); }
        /// Sets `cpb_size_scale` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer cpb_size_scaleAt(long index, byte value) { cpb_size_scale(this.segment(), index, value); return this; }

        /// {@return `cpb_size_du_scale` at the given index}
        /// @param index the index of the struct buffer
        public byte cpb_size_du_scaleAt(long index) { return cpb_size_du_scale(this.segment(), index); }
        /// Sets `cpb_size_du_scale` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer cpb_size_du_scaleAt(long index, byte value) { cpb_size_du_scale(this.segment(), index, value); return this; }

        /// {@return `initial_cpb_removal_delay_length_minus1` at the given index}
        /// @param index the index of the struct buffer
        public byte initial_cpb_removal_delay_length_minus1At(long index) { return initial_cpb_removal_delay_length_minus1(this.segment(), index); }
        /// Sets `initial_cpb_removal_delay_length_minus1` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer initial_cpb_removal_delay_length_minus1At(long index, byte value) { initial_cpb_removal_delay_length_minus1(this.segment(), index, value); return this; }

        /// {@return `au_cpb_removal_delay_length_minus1` at the given index}
        /// @param index the index of the struct buffer
        public byte au_cpb_removal_delay_length_minus1At(long index) { return au_cpb_removal_delay_length_minus1(this.segment(), index); }
        /// Sets `au_cpb_removal_delay_length_minus1` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer au_cpb_removal_delay_length_minus1At(long index, byte value) { au_cpb_removal_delay_length_minus1(this.segment(), index, value); return this; }

        /// {@return `dpb_output_delay_length_minus1` at the given index}
        /// @param index the index of the struct buffer
        public byte dpb_output_delay_length_minus1At(long index) { return dpb_output_delay_length_minus1(this.segment(), index); }
        /// Sets `dpb_output_delay_length_minus1` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer dpb_output_delay_length_minus1At(long index, byte value) { dpb_output_delay_length_minus1(this.segment(), index, value); return this; }

        /// {@return `cpb_cnt_minus1` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment cpb_cnt_minus1At(long index) { return cpb_cnt_minus1(this.segment(), index); }
        /// {@return `cpb_cnt_minus1` at the given index}
        /// @param index the index of the struct buffer
        /// @param index0 the Index 0 of the array
        public byte cpb_cnt_minus1At(long index, long index0) { return cpb_cnt_minus1(this.segment(), index, index0); }
        /// Sets `cpb_cnt_minus1` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer cpb_cnt_minus1At(long index, MemorySegment value) { cpb_cnt_minus1(this.segment(), index, value); return this; }
        /// Sets `cpb_cnt_minus1` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param index0 the Index 0 of the array
        /// @param value the value
        /// @return `this`
        public Buffer cpb_cnt_minus1At(long index, long index0, byte value) { cpb_cnt_minus1(this.segment(), index, index0, value); return this; }

        /// {@return `elemental_duration_in_tc_minus1` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment elemental_duration_in_tc_minus1At(long index) { return elemental_duration_in_tc_minus1(this.segment(), index); }
        /// {@return `elemental_duration_in_tc_minus1` at the given index}
        /// @param index the index of the struct buffer
        /// @param index0 the Index 0 of the array
        public short elemental_duration_in_tc_minus1At(long index, long index0) { return elemental_duration_in_tc_minus1(this.segment(), index, index0); }
        /// Sets `elemental_duration_in_tc_minus1` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer elemental_duration_in_tc_minus1At(long index, MemorySegment value) { elemental_duration_in_tc_minus1(this.segment(), index, value); return this; }
        /// Sets `elemental_duration_in_tc_minus1` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param index0 the Index 0 of the array
        /// @param value the value
        /// @return `this`
        public Buffer elemental_duration_in_tc_minus1At(long index, long index0, short value) { elemental_duration_in_tc_minus1(this.segment(), index, index0, value); return this; }

        /// {@return `reserved` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment reservedAt(long index) { return reserved(this.segment(), index); }
        /// {@return `reserved` at the given index}
        /// @param index the index of the struct buffer
        /// @param index0 the Index 0 of the array
        public short reservedAt(long index, long index0) { return reserved(this.segment(), index, index0); }
        /// Sets `reserved` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer reservedAt(long index, MemorySegment value) { reserved(this.segment(), index, value); return this; }
        /// Sets `reserved` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param index0 the Index 0 of the array
        /// @param value the value
        /// @return `this`
        public Buffer reservedAt(long index, long index0, short value) { reserved(this.segment(), index, index0, value); return this; }

        /// {@return `pSubLayerHrdParametersNal` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment pSubLayerHrdParametersNalAt(long index) { return pSubLayerHrdParametersNal(this.segment(), index); }
        /// Sets `pSubLayerHrdParametersNal` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer pSubLayerHrdParametersNalAt(long index, MemorySegment value) { pSubLayerHrdParametersNal(this.segment(), index, value); return this; }

        /// {@return `pSubLayerHrdParametersVcl` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment pSubLayerHrdParametersVclAt(long index) { return pSubLayerHrdParametersVcl(this.segment(), index); }
        /// Sets `pSubLayerHrdParametersVcl` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer pSubLayerHrdParametersVclAt(long index, MemorySegment value) { pSubLayerHrdParametersVcl(this.segment(), index, value); return this; }

    }
}
