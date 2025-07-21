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
import java.util.function.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct StdVideoEncodeH264SliceHeader {
///     (struct StdVideoEncodeH264SliceHeaderFlags) StdVideoEncodeH264SliceHeaderFlags flags;
///     uint32_t first_mb_in_slice;
///     (int) StdVideoH264SliceType slice_type;
///     int8_t slice_alpha_c0_offset_div2;
///     int8_t slice_beta_offset_div2;
///     int8_t slice_qp_delta;
///     uint8_t reserved1;
///     (int) StdVideoH264CabacInitIdc cabac_init_idc;
///     (int) StdVideoH264DisableDeblockingFilterIdc disable_deblocking_filter_idc;
///     const StdVideoEncodeH264WeightTable* pWeightTable;
/// };
/// ```
public final class StdVideoEncodeH264SliceHeader extends GroupType {
    /// The struct layout of `StdVideoEncodeH264SliceHeader`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        overrungl.vulkan.video.StdVideoEncodeH264SliceHeaderFlags.LAYOUT.withName("flags"),
        ValueLayout.JAVA_INT.withName("first_mb_in_slice"),
        ValueLayout.JAVA_INT.withName("slice_type"),
        ValueLayout.JAVA_BYTE.withName("slice_alpha_c0_offset_div2"),
        ValueLayout.JAVA_BYTE.withName("slice_beta_offset_div2"),
        ValueLayout.JAVA_BYTE.withName("slice_qp_delta"),
        ValueLayout.JAVA_BYTE.withName("reserved1"),
        ValueLayout.JAVA_INT.withName("cabac_init_idc"),
        ValueLayout.JAVA_INT.withName("disable_deblocking_filter_idc"),
        ValueLayout.ADDRESS.withName("pWeightTable")
    );
    /// The byte offset of `flags`.
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    /// The memory layout of `flags`.
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    /// The byte offset of `first_mb_in_slice`.
    public static final long OFFSET_first_mb_in_slice = LAYOUT.byteOffset(PathElement.groupElement("first_mb_in_slice"));
    /// The memory layout of `first_mb_in_slice`.
    public static final MemoryLayout LAYOUT_first_mb_in_slice = LAYOUT.select(PathElement.groupElement("first_mb_in_slice"));
    /// The [VarHandle] of `first_mb_in_slice` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_first_mb_in_slice = LAYOUT.arrayElementVarHandle(PathElement.groupElement("first_mb_in_slice"));
    /// The byte offset of `slice_type`.
    public static final long OFFSET_slice_type = LAYOUT.byteOffset(PathElement.groupElement("slice_type"));
    /// The memory layout of `slice_type`.
    public static final MemoryLayout LAYOUT_slice_type = LAYOUT.select(PathElement.groupElement("slice_type"));
    /// The [VarHandle] of `slice_type` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_slice_type = LAYOUT.arrayElementVarHandle(PathElement.groupElement("slice_type"));
    /// The byte offset of `slice_alpha_c0_offset_div2`.
    public static final long OFFSET_slice_alpha_c0_offset_div2 = LAYOUT.byteOffset(PathElement.groupElement("slice_alpha_c0_offset_div2"));
    /// The memory layout of `slice_alpha_c0_offset_div2`.
    public static final MemoryLayout LAYOUT_slice_alpha_c0_offset_div2 = LAYOUT.select(PathElement.groupElement("slice_alpha_c0_offset_div2"));
    /// The [VarHandle] of `slice_alpha_c0_offset_div2` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_slice_alpha_c0_offset_div2 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("slice_alpha_c0_offset_div2"));
    /// The byte offset of `slice_beta_offset_div2`.
    public static final long OFFSET_slice_beta_offset_div2 = LAYOUT.byteOffset(PathElement.groupElement("slice_beta_offset_div2"));
    /// The memory layout of `slice_beta_offset_div2`.
    public static final MemoryLayout LAYOUT_slice_beta_offset_div2 = LAYOUT.select(PathElement.groupElement("slice_beta_offset_div2"));
    /// The [VarHandle] of `slice_beta_offset_div2` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_slice_beta_offset_div2 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("slice_beta_offset_div2"));
    /// The byte offset of `slice_qp_delta`.
    public static final long OFFSET_slice_qp_delta = LAYOUT.byteOffset(PathElement.groupElement("slice_qp_delta"));
    /// The memory layout of `slice_qp_delta`.
    public static final MemoryLayout LAYOUT_slice_qp_delta = LAYOUT.select(PathElement.groupElement("slice_qp_delta"));
    /// The [VarHandle] of `slice_qp_delta` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_slice_qp_delta = LAYOUT.arrayElementVarHandle(PathElement.groupElement("slice_qp_delta"));
    /// The byte offset of `reserved1`.
    public static final long OFFSET_reserved1 = LAYOUT.byteOffset(PathElement.groupElement("reserved1"));
    /// The memory layout of `reserved1`.
    public static final MemoryLayout LAYOUT_reserved1 = LAYOUT.select(PathElement.groupElement("reserved1"));
    /// The [VarHandle] of `reserved1` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_reserved1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("reserved1"));
    /// The byte offset of `cabac_init_idc`.
    public static final long OFFSET_cabac_init_idc = LAYOUT.byteOffset(PathElement.groupElement("cabac_init_idc"));
    /// The memory layout of `cabac_init_idc`.
    public static final MemoryLayout LAYOUT_cabac_init_idc = LAYOUT.select(PathElement.groupElement("cabac_init_idc"));
    /// The [VarHandle] of `cabac_init_idc` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_cabac_init_idc = LAYOUT.arrayElementVarHandle(PathElement.groupElement("cabac_init_idc"));
    /// The byte offset of `disable_deblocking_filter_idc`.
    public static final long OFFSET_disable_deblocking_filter_idc = LAYOUT.byteOffset(PathElement.groupElement("disable_deblocking_filter_idc"));
    /// The memory layout of `disable_deblocking_filter_idc`.
    public static final MemoryLayout LAYOUT_disable_deblocking_filter_idc = LAYOUT.select(PathElement.groupElement("disable_deblocking_filter_idc"));
    /// The [VarHandle] of `disable_deblocking_filter_idc` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_disable_deblocking_filter_idc = LAYOUT.arrayElementVarHandle(PathElement.groupElement("disable_deblocking_filter_idc"));
    /// The byte offset of `pWeightTable`.
    public static final long OFFSET_pWeightTable = LAYOUT.byteOffset(PathElement.groupElement("pWeightTable"));
    /// The memory layout of `pWeightTable`.
    public static final MemoryLayout LAYOUT_pWeightTable = LAYOUT.select(PathElement.groupElement("pWeightTable"));
    /// The [VarHandle] of `pWeightTable` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pWeightTable = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pWeightTable"));

    /// Creates `StdVideoEncodeH264SliceHeader` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public StdVideoEncodeH264SliceHeader(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `StdVideoEncodeH264SliceHeader` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoEncodeH264SliceHeader of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoEncodeH264SliceHeader(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `StdVideoEncodeH264SliceHeader` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoEncodeH264SliceHeader ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoEncodeH264SliceHeader(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `StdVideoEncodeH264SliceHeader` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoEncodeH264SliceHeader ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoEncodeH264SliceHeader(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `StdVideoEncodeH264SliceHeader` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoEncodeH264SliceHeader`
    public static StdVideoEncodeH264SliceHeader alloc(SegmentAllocator allocator) { return new StdVideoEncodeH264SliceHeader(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `StdVideoEncodeH264SliceHeader` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `StdVideoEncodeH264SliceHeader`
    public static StdVideoEncodeH264SliceHeader alloc(SegmentAllocator allocator, long count) { return new StdVideoEncodeH264SliceHeader(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `StdVideoEncodeH264SliceHeader` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param flags `flags`
    /// @param first_mb_in_slice `first_mb_in_slice`
    /// @param slice_type `slice_type`
    /// @param slice_alpha_c0_offset_div2 `slice_alpha_c0_offset_div2`
    /// @param slice_beta_offset_div2 `slice_beta_offset_div2`
    /// @param slice_qp_delta `slice_qp_delta`
    /// @param reserved1 `reserved1`
    /// @param cabac_init_idc `cabac_init_idc`
    /// @param disable_deblocking_filter_idc `disable_deblocking_filter_idc`
    /// @param pWeightTable `pWeightTable`
    /// @return the allocated `StdVideoEncodeH264SliceHeader`
    public static StdVideoEncodeH264SliceHeader allocInit(SegmentAllocator allocator, MemorySegment flags, int first_mb_in_slice, int slice_type, byte slice_alpha_c0_offset_div2, byte slice_beta_offset_div2, byte slice_qp_delta, byte reserved1, int cabac_init_idc, int disable_deblocking_filter_idc, MemorySegment pWeightTable) {
        return alloc(allocator).flags(flags).first_mb_in_slice(first_mb_in_slice).slice_type(slice_type).slice_alpha_c0_offset_div2(slice_alpha_c0_offset_div2).slice_beta_offset_div2(slice_beta_offset_div2).slice_qp_delta(slice_qp_delta).reserved1(reserved1).cabac_init_idc(cabac_init_idc).disable_deblocking_filter_idc(disable_deblocking_filter_idc).pWeightTable(pWeightTable);
    }

    /// Allocates a `StdVideoEncodeH264SliceHeader` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param flags `flags`
    /// @param first_mb_in_slice `first_mb_in_slice`
    /// @param slice_type `slice_type`
    /// @param slice_alpha_c0_offset_div2 `slice_alpha_c0_offset_div2`
    /// @param slice_beta_offset_div2 `slice_beta_offset_div2`
    /// @param slice_qp_delta `slice_qp_delta`
    /// @param reserved1 `reserved1`
    /// @param cabac_init_idc `cabac_init_idc`
    /// @param disable_deblocking_filter_idc `disable_deblocking_filter_idc`
    /// @return the allocated `StdVideoEncodeH264SliceHeader`
    public static StdVideoEncodeH264SliceHeader allocInit(SegmentAllocator allocator, MemorySegment flags, int first_mb_in_slice, int slice_type, byte slice_alpha_c0_offset_div2, byte slice_beta_offset_div2, byte slice_qp_delta, byte reserved1, int cabac_init_idc, int disable_deblocking_filter_idc) {
        return alloc(allocator).flags(flags).first_mb_in_slice(first_mb_in_slice).slice_type(slice_type).slice_alpha_c0_offset_div2(slice_alpha_c0_offset_div2).slice_beta_offset_div2(slice_beta_offset_div2).slice_qp_delta(slice_qp_delta).reserved1(reserved1).cabac_init_idc(cabac_init_idc).disable_deblocking_filter_idc(disable_deblocking_filter_idc);
    }

    /// Allocates a `StdVideoEncodeH264SliceHeader` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param flags `flags`
    /// @param first_mb_in_slice `first_mb_in_slice`
    /// @param slice_type `slice_type`
    /// @param slice_alpha_c0_offset_div2 `slice_alpha_c0_offset_div2`
    /// @param slice_beta_offset_div2 `slice_beta_offset_div2`
    /// @param slice_qp_delta `slice_qp_delta`
    /// @param reserved1 `reserved1`
    /// @param cabac_init_idc `cabac_init_idc`
    /// @return the allocated `StdVideoEncodeH264SliceHeader`
    public static StdVideoEncodeH264SliceHeader allocInit(SegmentAllocator allocator, MemorySegment flags, int first_mb_in_slice, int slice_type, byte slice_alpha_c0_offset_div2, byte slice_beta_offset_div2, byte slice_qp_delta, byte reserved1, int cabac_init_idc) {
        return alloc(allocator).flags(flags).first_mb_in_slice(first_mb_in_slice).slice_type(slice_type).slice_alpha_c0_offset_div2(slice_alpha_c0_offset_div2).slice_beta_offset_div2(slice_beta_offset_div2).slice_qp_delta(slice_qp_delta).reserved1(reserved1).cabac_init_idc(cabac_init_idc);
    }

    /// Allocates a `StdVideoEncodeH264SliceHeader` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param flags `flags`
    /// @param first_mb_in_slice `first_mb_in_slice`
    /// @param slice_type `slice_type`
    /// @param slice_alpha_c0_offset_div2 `slice_alpha_c0_offset_div2`
    /// @param slice_beta_offset_div2 `slice_beta_offset_div2`
    /// @param slice_qp_delta `slice_qp_delta`
    /// @param reserved1 `reserved1`
    /// @return the allocated `StdVideoEncodeH264SliceHeader`
    public static StdVideoEncodeH264SliceHeader allocInit(SegmentAllocator allocator, MemorySegment flags, int first_mb_in_slice, int slice_type, byte slice_alpha_c0_offset_div2, byte slice_beta_offset_div2, byte slice_qp_delta, byte reserved1) {
        return alloc(allocator).flags(flags).first_mb_in_slice(first_mb_in_slice).slice_type(slice_type).slice_alpha_c0_offset_div2(slice_alpha_c0_offset_div2).slice_beta_offset_div2(slice_beta_offset_div2).slice_qp_delta(slice_qp_delta).reserved1(reserved1);
    }

    /// Allocates a `StdVideoEncodeH264SliceHeader` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param flags `flags`
    /// @param first_mb_in_slice `first_mb_in_slice`
    /// @param slice_type `slice_type`
    /// @param slice_alpha_c0_offset_div2 `slice_alpha_c0_offset_div2`
    /// @param slice_beta_offset_div2 `slice_beta_offset_div2`
    /// @param slice_qp_delta `slice_qp_delta`
    /// @return the allocated `StdVideoEncodeH264SliceHeader`
    public static StdVideoEncodeH264SliceHeader allocInit(SegmentAllocator allocator, MemorySegment flags, int first_mb_in_slice, int slice_type, byte slice_alpha_c0_offset_div2, byte slice_beta_offset_div2, byte slice_qp_delta) {
        return alloc(allocator).flags(flags).first_mb_in_slice(first_mb_in_slice).slice_type(slice_type).slice_alpha_c0_offset_div2(slice_alpha_c0_offset_div2).slice_beta_offset_div2(slice_beta_offset_div2).slice_qp_delta(slice_qp_delta);
    }

    /// Allocates a `StdVideoEncodeH264SliceHeader` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param flags `flags`
    /// @param first_mb_in_slice `first_mb_in_slice`
    /// @param slice_type `slice_type`
    /// @param slice_alpha_c0_offset_div2 `slice_alpha_c0_offset_div2`
    /// @param slice_beta_offset_div2 `slice_beta_offset_div2`
    /// @return the allocated `StdVideoEncodeH264SliceHeader`
    public static StdVideoEncodeH264SliceHeader allocInit(SegmentAllocator allocator, MemorySegment flags, int first_mb_in_slice, int slice_type, byte slice_alpha_c0_offset_div2, byte slice_beta_offset_div2) {
        return alloc(allocator).flags(flags).first_mb_in_slice(first_mb_in_slice).slice_type(slice_type).slice_alpha_c0_offset_div2(slice_alpha_c0_offset_div2).slice_beta_offset_div2(slice_beta_offset_div2);
    }

    /// Allocates a `StdVideoEncodeH264SliceHeader` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param flags `flags`
    /// @param first_mb_in_slice `first_mb_in_slice`
    /// @param slice_type `slice_type`
    /// @param slice_alpha_c0_offset_div2 `slice_alpha_c0_offset_div2`
    /// @return the allocated `StdVideoEncodeH264SliceHeader`
    public static StdVideoEncodeH264SliceHeader allocInit(SegmentAllocator allocator, MemorySegment flags, int first_mb_in_slice, int slice_type, byte slice_alpha_c0_offset_div2) {
        return alloc(allocator).flags(flags).first_mb_in_slice(first_mb_in_slice).slice_type(slice_type).slice_alpha_c0_offset_div2(slice_alpha_c0_offset_div2);
    }

    /// Allocates a `StdVideoEncodeH264SliceHeader` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param flags `flags`
    /// @param first_mb_in_slice `first_mb_in_slice`
    /// @param slice_type `slice_type`
    /// @return the allocated `StdVideoEncodeH264SliceHeader`
    public static StdVideoEncodeH264SliceHeader allocInit(SegmentAllocator allocator, MemorySegment flags, int first_mb_in_slice, int slice_type) {
        return alloc(allocator).flags(flags).first_mb_in_slice(first_mb_in_slice).slice_type(slice_type);
    }

    /// Allocates a `StdVideoEncodeH264SliceHeader` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param flags `flags`
    /// @param first_mb_in_slice `first_mb_in_slice`
    /// @return the allocated `StdVideoEncodeH264SliceHeader`
    public static StdVideoEncodeH264SliceHeader allocInit(SegmentAllocator allocator, MemorySegment flags, int first_mb_in_slice) {
        return alloc(allocator).flags(flags).first_mb_in_slice(first_mb_in_slice);
    }

    /// Allocates a `StdVideoEncodeH264SliceHeader` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param flags `flags`
    /// @return the allocated `StdVideoEncodeH264SliceHeader`
    public static StdVideoEncodeH264SliceHeader allocInit(SegmentAllocator allocator, MemorySegment flags) {
        return alloc(allocator).flags(flags);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public StdVideoEncodeH264SliceHeader copyFrom(StdVideoEncodeH264SliceHeader src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public StdVideoEncodeH264SliceHeader reinterpret(long count) { return new StdVideoEncodeH264SliceHeader(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public StdVideoEncodeH264SliceHeader flags(MemorySegment value) { flags(this.segment(), 0L, value); return this; }
    /// Accepts `flags` with the given function.
    /// @param func the function
    /// @return `this`
    public StdVideoEncodeH264SliceHeader flags(Consumer<overrungl.vulkan.video.StdVideoEncodeH264SliceHeaderFlags> func) { func.accept(overrungl.vulkan.video.StdVideoEncodeH264SliceHeaderFlags.of(flags())); return this; }

    /// {@return `first_mb_in_slice` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int first_mb_in_slice(MemorySegment segment, long index) { return (int) VH_first_mb_in_slice.get(segment, 0L, index); }
    /// {@return `first_mb_in_slice`}
    public int first_mb_in_slice() { return first_mb_in_slice(this.segment(), 0L); }
    /// Sets `first_mb_in_slice` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void first_mb_in_slice(MemorySegment segment, long index, int value) { VH_first_mb_in_slice.set(segment, 0L, index, value); }
    /// Sets `first_mb_in_slice` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264SliceHeader first_mb_in_slice(int value) { first_mb_in_slice(this.segment(), 0L, value); return this; }

    /// {@return `slice_type` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int slice_type(MemorySegment segment, long index) { return (int) VH_slice_type.get(segment, 0L, index); }
    /// {@return `slice_type`}
    public int slice_type() { return slice_type(this.segment(), 0L); }
    /// Sets `slice_type` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void slice_type(MemorySegment segment, long index, int value) { VH_slice_type.set(segment, 0L, index, value); }
    /// Sets `slice_type` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264SliceHeader slice_type(int value) { slice_type(this.segment(), 0L, value); return this; }

    /// {@return `slice_alpha_c0_offset_div2` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte slice_alpha_c0_offset_div2(MemorySegment segment, long index) { return (byte) VH_slice_alpha_c0_offset_div2.get(segment, 0L, index); }
    /// {@return `slice_alpha_c0_offset_div2`}
    public byte slice_alpha_c0_offset_div2() { return slice_alpha_c0_offset_div2(this.segment(), 0L); }
    /// Sets `slice_alpha_c0_offset_div2` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void slice_alpha_c0_offset_div2(MemorySegment segment, long index, byte value) { VH_slice_alpha_c0_offset_div2.set(segment, 0L, index, value); }
    /// Sets `slice_alpha_c0_offset_div2` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264SliceHeader slice_alpha_c0_offset_div2(byte value) { slice_alpha_c0_offset_div2(this.segment(), 0L, value); return this; }

    /// {@return `slice_beta_offset_div2` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte slice_beta_offset_div2(MemorySegment segment, long index) { return (byte) VH_slice_beta_offset_div2.get(segment, 0L, index); }
    /// {@return `slice_beta_offset_div2`}
    public byte slice_beta_offset_div2() { return slice_beta_offset_div2(this.segment(), 0L); }
    /// Sets `slice_beta_offset_div2` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void slice_beta_offset_div2(MemorySegment segment, long index, byte value) { VH_slice_beta_offset_div2.set(segment, 0L, index, value); }
    /// Sets `slice_beta_offset_div2` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264SliceHeader slice_beta_offset_div2(byte value) { slice_beta_offset_div2(this.segment(), 0L, value); return this; }

    /// {@return `slice_qp_delta` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte slice_qp_delta(MemorySegment segment, long index) { return (byte) VH_slice_qp_delta.get(segment, 0L, index); }
    /// {@return `slice_qp_delta`}
    public byte slice_qp_delta() { return slice_qp_delta(this.segment(), 0L); }
    /// Sets `slice_qp_delta` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void slice_qp_delta(MemorySegment segment, long index, byte value) { VH_slice_qp_delta.set(segment, 0L, index, value); }
    /// Sets `slice_qp_delta` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264SliceHeader slice_qp_delta(byte value) { slice_qp_delta(this.segment(), 0L, value); return this; }

    /// {@return `reserved1` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte reserved1(MemorySegment segment, long index) { return (byte) VH_reserved1.get(segment, 0L, index); }
    /// {@return `reserved1`}
    public byte reserved1() { return reserved1(this.segment(), 0L); }
    /// Sets `reserved1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void reserved1(MemorySegment segment, long index, byte value) { VH_reserved1.set(segment, 0L, index, value); }
    /// Sets `reserved1` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264SliceHeader reserved1(byte value) { reserved1(this.segment(), 0L, value); return this; }

    /// {@return `cabac_init_idc` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int cabac_init_idc(MemorySegment segment, long index) { return (int) VH_cabac_init_idc.get(segment, 0L, index); }
    /// {@return `cabac_init_idc`}
    public int cabac_init_idc() { return cabac_init_idc(this.segment(), 0L); }
    /// Sets `cabac_init_idc` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void cabac_init_idc(MemorySegment segment, long index, int value) { VH_cabac_init_idc.set(segment, 0L, index, value); }
    /// Sets `cabac_init_idc` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264SliceHeader cabac_init_idc(int value) { cabac_init_idc(this.segment(), 0L, value); return this; }

    /// {@return `disable_deblocking_filter_idc` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int disable_deblocking_filter_idc(MemorySegment segment, long index) { return (int) VH_disable_deblocking_filter_idc.get(segment, 0L, index); }
    /// {@return `disable_deblocking_filter_idc`}
    public int disable_deblocking_filter_idc() { return disable_deblocking_filter_idc(this.segment(), 0L); }
    /// Sets `disable_deblocking_filter_idc` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void disable_deblocking_filter_idc(MemorySegment segment, long index, int value) { VH_disable_deblocking_filter_idc.set(segment, 0L, index, value); }
    /// Sets `disable_deblocking_filter_idc` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264SliceHeader disable_deblocking_filter_idc(int value) { disable_deblocking_filter_idc(this.segment(), 0L, value); return this; }

    /// {@return `pWeightTable` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pWeightTable(MemorySegment segment, long index) { return (MemorySegment) VH_pWeightTable.get(segment, 0L, index); }
    /// {@return `pWeightTable`}
    public MemorySegment pWeightTable() { return pWeightTable(this.segment(), 0L); }
    /// Sets `pWeightTable` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pWeightTable(MemorySegment segment, long index, MemorySegment value) { VH_pWeightTable.set(segment, 0L, index, value); }
    /// Sets `pWeightTable` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264SliceHeader pWeightTable(MemorySegment value) { pWeightTable(this.segment(), 0L, value); return this; }

    /// Creates a slice of `StdVideoEncodeH264SliceHeader`.
    /// @param index the index of the struct buffer
    /// @return the slice of `StdVideoEncodeH264SliceHeader`
    public StdVideoEncodeH264SliceHeader asSlice(long index) { return new StdVideoEncodeH264SliceHeader(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `StdVideoEncodeH264SliceHeader`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `StdVideoEncodeH264SliceHeader`
    public StdVideoEncodeH264SliceHeader asSlice(long index, long count) { return new StdVideoEncodeH264SliceHeader(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `StdVideoEncodeH264SliceHeader` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public StdVideoEncodeH264SliceHeader at(long index, Consumer<StdVideoEncodeH264SliceHeader> func) { func.accept(asSlice(index)); return this; }

    /// {@return `flags` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment flagsAt(long index) { return flags(this.segment(), index); }
    /// Sets `flags` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264SliceHeader flagsAt(long index, MemorySegment value) { flags(this.segment(), index, value); return this; }
    /// Accepts `flags` with the given function.
    /// @param index the index of the struct buffer
    /// @param func the function
    /// @return `this`
    public StdVideoEncodeH264SliceHeader flagsAt(long index, Consumer<overrungl.vulkan.video.StdVideoEncodeH264SliceHeaderFlags> func) { func.accept(overrungl.vulkan.video.StdVideoEncodeH264SliceHeaderFlags.of(flagsAt(index))); return this; }

    /// {@return `first_mb_in_slice` at the given index}
    /// @param index the index of the struct buffer
    public int first_mb_in_sliceAt(long index) { return first_mb_in_slice(this.segment(), index); }
    /// Sets `first_mb_in_slice` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264SliceHeader first_mb_in_sliceAt(long index, int value) { first_mb_in_slice(this.segment(), index, value); return this; }

    /// {@return `slice_type` at the given index}
    /// @param index the index of the struct buffer
    public int slice_typeAt(long index) { return slice_type(this.segment(), index); }
    /// Sets `slice_type` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264SliceHeader slice_typeAt(long index, int value) { slice_type(this.segment(), index, value); return this; }

    /// {@return `slice_alpha_c0_offset_div2` at the given index}
    /// @param index the index of the struct buffer
    public byte slice_alpha_c0_offset_div2At(long index) { return slice_alpha_c0_offset_div2(this.segment(), index); }
    /// Sets `slice_alpha_c0_offset_div2` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264SliceHeader slice_alpha_c0_offset_div2At(long index, byte value) { slice_alpha_c0_offset_div2(this.segment(), index, value); return this; }

    /// {@return `slice_beta_offset_div2` at the given index}
    /// @param index the index of the struct buffer
    public byte slice_beta_offset_div2At(long index) { return slice_beta_offset_div2(this.segment(), index); }
    /// Sets `slice_beta_offset_div2` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264SliceHeader slice_beta_offset_div2At(long index, byte value) { slice_beta_offset_div2(this.segment(), index, value); return this; }

    /// {@return `slice_qp_delta` at the given index}
    /// @param index the index of the struct buffer
    public byte slice_qp_deltaAt(long index) { return slice_qp_delta(this.segment(), index); }
    /// Sets `slice_qp_delta` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264SliceHeader slice_qp_deltaAt(long index, byte value) { slice_qp_delta(this.segment(), index, value); return this; }

    /// {@return `reserved1` at the given index}
    /// @param index the index of the struct buffer
    public byte reserved1At(long index) { return reserved1(this.segment(), index); }
    /// Sets `reserved1` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264SliceHeader reserved1At(long index, byte value) { reserved1(this.segment(), index, value); return this; }

    /// {@return `cabac_init_idc` at the given index}
    /// @param index the index of the struct buffer
    public int cabac_init_idcAt(long index) { return cabac_init_idc(this.segment(), index); }
    /// Sets `cabac_init_idc` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264SliceHeader cabac_init_idcAt(long index, int value) { cabac_init_idc(this.segment(), index, value); return this; }

    /// {@return `disable_deblocking_filter_idc` at the given index}
    /// @param index the index of the struct buffer
    public int disable_deblocking_filter_idcAt(long index) { return disable_deblocking_filter_idc(this.segment(), index); }
    /// Sets `disable_deblocking_filter_idc` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264SliceHeader disable_deblocking_filter_idcAt(long index, int value) { disable_deblocking_filter_idc(this.segment(), index, value); return this; }

    /// {@return `pWeightTable` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pWeightTableAt(long index) { return pWeightTable(this.segment(), index); }
    /// Sets `pWeightTable` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264SliceHeader pWeightTableAt(long index, MemorySegment value) { pWeightTable(this.segment(), index, value); return this; }

}
