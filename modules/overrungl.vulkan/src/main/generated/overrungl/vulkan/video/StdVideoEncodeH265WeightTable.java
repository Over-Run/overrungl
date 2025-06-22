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
import java.util.function.*;

/// ## Layout
/// ```
/// struct StdVideoEncodeH265WeightTable {
///     (struct StdVideoEncodeH265WeightTableFlags) StdVideoEncodeH265WeightTableFlags flags;
///     uint8_t luma_log2_weight_denom;
///     int8_t delta_chroma_log2_weight_denom;
///     int8_t delta_luma_weight_l0[15];
///     int8_t luma_offset_l0[15];
///     int8_t delta_chroma_weight_l0[15][2];
///     int8_t delta_chroma_offset_l0[15][2];
///     int8_t delta_luma_weight_l1[15];
///     int8_t luma_offset_l1[15];
///     int8_t delta_chroma_weight_l1[15][2];
///     int8_t delta_chroma_offset_l1[15][2];
/// };
/// ```
public sealed class StdVideoEncodeH265WeightTable extends GroupType {
    /// The struct layout of `StdVideoEncodeH265WeightTable`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        overrungl.vulkan.video.StdVideoEncodeH265WeightTableFlags.LAYOUT.withName("flags"),
        ValueLayout.JAVA_BYTE.withName("luma_log2_weight_denom"),
        ValueLayout.JAVA_BYTE.withName("delta_chroma_log2_weight_denom"),
        MemoryLayout.sequenceLayout(15, ValueLayout.JAVA_BYTE).withName("delta_luma_weight_l0"),
        MemoryLayout.sequenceLayout(15, ValueLayout.JAVA_BYTE).withName("luma_offset_l0"),
        MemoryLayout.sequenceLayout(2, MemoryLayout.sequenceLayout(15, ValueLayout.JAVA_BYTE)).withName("delta_chroma_weight_l0"),
        MemoryLayout.sequenceLayout(2, MemoryLayout.sequenceLayout(15, ValueLayout.JAVA_BYTE)).withName("delta_chroma_offset_l0"),
        MemoryLayout.sequenceLayout(15, ValueLayout.JAVA_BYTE).withName("delta_luma_weight_l1"),
        MemoryLayout.sequenceLayout(15, ValueLayout.JAVA_BYTE).withName("luma_offset_l1"),
        MemoryLayout.sequenceLayout(2, MemoryLayout.sequenceLayout(15, ValueLayout.JAVA_BYTE)).withName("delta_chroma_weight_l1"),
        MemoryLayout.sequenceLayout(2, MemoryLayout.sequenceLayout(15, ValueLayout.JAVA_BYTE)).withName("delta_chroma_offset_l1")
    );
    /// The byte offset of `flags`.
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    /// The memory layout of `flags`.
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    /// The byte offset of `luma_log2_weight_denom`.
    public static final long OFFSET_luma_log2_weight_denom = LAYOUT.byteOffset(PathElement.groupElement("luma_log2_weight_denom"));
    /// The memory layout of `luma_log2_weight_denom`.
    public static final MemoryLayout LAYOUT_luma_log2_weight_denom = LAYOUT.select(PathElement.groupElement("luma_log2_weight_denom"));
    /// The [VarHandle] of `luma_log2_weight_denom` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_luma_log2_weight_denom = LAYOUT.arrayElementVarHandle(PathElement.groupElement("luma_log2_weight_denom"));
    /// The byte offset of `delta_chroma_log2_weight_denom`.
    public static final long OFFSET_delta_chroma_log2_weight_denom = LAYOUT.byteOffset(PathElement.groupElement("delta_chroma_log2_weight_denom"));
    /// The memory layout of `delta_chroma_log2_weight_denom`.
    public static final MemoryLayout LAYOUT_delta_chroma_log2_weight_denom = LAYOUT.select(PathElement.groupElement("delta_chroma_log2_weight_denom"));
    /// The [VarHandle] of `delta_chroma_log2_weight_denom` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_delta_chroma_log2_weight_denom = LAYOUT.arrayElementVarHandle(PathElement.groupElement("delta_chroma_log2_weight_denom"));
    /// The byte offset of `delta_luma_weight_l0`.
    public static final long OFFSET_delta_luma_weight_l0 = LAYOUT.byteOffset(PathElement.groupElement("delta_luma_weight_l0"));
    /// The memory layout of `delta_luma_weight_l0`.
    public static final MemoryLayout LAYOUT_delta_luma_weight_l0 = LAYOUT.select(PathElement.groupElement("delta_luma_weight_l0"));
    /// The [VarHandle] of `delta_luma_weight_l0` of type `(MemorySegment base, long baseOffset, long index, long index0)MemorySegment`.
    public static final VarHandle VH_delta_luma_weight_l0 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("delta_luma_weight_l0"), PathElement.sequenceElement());
    /// The byte offset of `luma_offset_l0`.
    public static final long OFFSET_luma_offset_l0 = LAYOUT.byteOffset(PathElement.groupElement("luma_offset_l0"));
    /// The memory layout of `luma_offset_l0`.
    public static final MemoryLayout LAYOUT_luma_offset_l0 = LAYOUT.select(PathElement.groupElement("luma_offset_l0"));
    /// The [VarHandle] of `luma_offset_l0` of type `(MemorySegment base, long baseOffset, long index, long index0)MemorySegment`.
    public static final VarHandle VH_luma_offset_l0 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("luma_offset_l0"), PathElement.sequenceElement());
    /// The byte offset of `delta_chroma_weight_l0`.
    public static final long OFFSET_delta_chroma_weight_l0 = LAYOUT.byteOffset(PathElement.groupElement("delta_chroma_weight_l0"));
    /// The memory layout of `delta_chroma_weight_l0`.
    public static final MemoryLayout LAYOUT_delta_chroma_weight_l0 = LAYOUT.select(PathElement.groupElement("delta_chroma_weight_l0"));
    /// The [VarHandle] of `delta_chroma_weight_l0` of type `(MemorySegment base, long baseOffset, long index, long index0, long index1)MemorySegment`.
    public static final VarHandle VH_delta_chroma_weight_l0 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("delta_chroma_weight_l0"), PathElement.sequenceElement(), PathElement.sequenceElement());
    /// The byte offset of `delta_chroma_offset_l0`.
    public static final long OFFSET_delta_chroma_offset_l0 = LAYOUT.byteOffset(PathElement.groupElement("delta_chroma_offset_l0"));
    /// The memory layout of `delta_chroma_offset_l0`.
    public static final MemoryLayout LAYOUT_delta_chroma_offset_l0 = LAYOUT.select(PathElement.groupElement("delta_chroma_offset_l0"));
    /// The [VarHandle] of `delta_chroma_offset_l0` of type `(MemorySegment base, long baseOffset, long index, long index0, long index1)MemorySegment`.
    public static final VarHandle VH_delta_chroma_offset_l0 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("delta_chroma_offset_l0"), PathElement.sequenceElement(), PathElement.sequenceElement());
    /// The byte offset of `delta_luma_weight_l1`.
    public static final long OFFSET_delta_luma_weight_l1 = LAYOUT.byteOffset(PathElement.groupElement("delta_luma_weight_l1"));
    /// The memory layout of `delta_luma_weight_l1`.
    public static final MemoryLayout LAYOUT_delta_luma_weight_l1 = LAYOUT.select(PathElement.groupElement("delta_luma_weight_l1"));
    /// The [VarHandle] of `delta_luma_weight_l1` of type `(MemorySegment base, long baseOffset, long index, long index0)MemorySegment`.
    public static final VarHandle VH_delta_luma_weight_l1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("delta_luma_weight_l1"), PathElement.sequenceElement());
    /// The byte offset of `luma_offset_l1`.
    public static final long OFFSET_luma_offset_l1 = LAYOUT.byteOffset(PathElement.groupElement("luma_offset_l1"));
    /// The memory layout of `luma_offset_l1`.
    public static final MemoryLayout LAYOUT_luma_offset_l1 = LAYOUT.select(PathElement.groupElement("luma_offset_l1"));
    /// The [VarHandle] of `luma_offset_l1` of type `(MemorySegment base, long baseOffset, long index, long index0)MemorySegment`.
    public static final VarHandle VH_luma_offset_l1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("luma_offset_l1"), PathElement.sequenceElement());
    /// The byte offset of `delta_chroma_weight_l1`.
    public static final long OFFSET_delta_chroma_weight_l1 = LAYOUT.byteOffset(PathElement.groupElement("delta_chroma_weight_l1"));
    /// The memory layout of `delta_chroma_weight_l1`.
    public static final MemoryLayout LAYOUT_delta_chroma_weight_l1 = LAYOUT.select(PathElement.groupElement("delta_chroma_weight_l1"));
    /// The [VarHandle] of `delta_chroma_weight_l1` of type `(MemorySegment base, long baseOffset, long index, long index0, long index1)MemorySegment`.
    public static final VarHandle VH_delta_chroma_weight_l1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("delta_chroma_weight_l1"), PathElement.sequenceElement(), PathElement.sequenceElement());
    /// The byte offset of `delta_chroma_offset_l1`.
    public static final long OFFSET_delta_chroma_offset_l1 = LAYOUT.byteOffset(PathElement.groupElement("delta_chroma_offset_l1"));
    /// The memory layout of `delta_chroma_offset_l1`.
    public static final MemoryLayout LAYOUT_delta_chroma_offset_l1 = LAYOUT.select(PathElement.groupElement("delta_chroma_offset_l1"));
    /// The [VarHandle] of `delta_chroma_offset_l1` of type `(MemorySegment base, long baseOffset, long index, long index0, long index1)MemorySegment`.
    public static final VarHandle VH_delta_chroma_offset_l1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("delta_chroma_offset_l1"), PathElement.sequenceElement(), PathElement.sequenceElement());

    /// Creates `StdVideoEncodeH265WeightTable` with the given segment.
    /// @param segment the memory segment
    public StdVideoEncodeH265WeightTable(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `StdVideoEncodeH265WeightTable` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `StdVideoEncodeH265WeightTable` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoEncodeH265WeightTable ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoEncodeH265WeightTable(segment.reinterpret(LAYOUT.byteSize())); }

    /// Creates `StdVideoEncodeH265WeightTable` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `StdVideoEncodeH265WeightTable` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoEncodeH265WeightTable`
    public static StdVideoEncodeH265WeightTable alloc(SegmentAllocator allocator) { return new StdVideoEncodeH265WeightTable(allocator.allocate(LAYOUT)); }

    /// Allocates a `StdVideoEncodeH265WeightTable` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `StdVideoEncodeH265WeightTable`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `StdVideoEncodeH265WeightTable` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param flags `flags`
    /// @param luma_log2_weight_denom `luma_log2_weight_denom`
    /// @param delta_chroma_log2_weight_denom `delta_chroma_log2_weight_denom`
    /// @param delta_luma_weight_l0 `delta_luma_weight_l0`
    /// @param luma_offset_l0 `luma_offset_l0`
    /// @param delta_chroma_weight_l0 `delta_chroma_weight_l0`
    /// @param delta_chroma_offset_l0 `delta_chroma_offset_l0`
    /// @param delta_luma_weight_l1 `delta_luma_weight_l1`
    /// @param luma_offset_l1 `luma_offset_l1`
    /// @param delta_chroma_weight_l1 `delta_chroma_weight_l1`
    /// @param delta_chroma_offset_l1 `delta_chroma_offset_l1`
    /// @return the allocated `StdVideoEncodeH265WeightTable`
    public static StdVideoEncodeH265WeightTable allocInit(SegmentAllocator allocator, MemorySegment flags, byte luma_log2_weight_denom, byte delta_chroma_log2_weight_denom, MemorySegment delta_luma_weight_l0, MemorySegment luma_offset_l0, MemorySegment delta_chroma_weight_l0, MemorySegment delta_chroma_offset_l0, MemorySegment delta_luma_weight_l1, MemorySegment luma_offset_l1, MemorySegment delta_chroma_weight_l1, MemorySegment delta_chroma_offset_l1) {
        return alloc(allocator).flags(flags).luma_log2_weight_denom(luma_log2_weight_denom).delta_chroma_log2_weight_denom(delta_chroma_log2_weight_denom).delta_luma_weight_l0(delta_luma_weight_l0).luma_offset_l0(luma_offset_l0).delta_chroma_weight_l0(delta_chroma_weight_l0).delta_chroma_offset_l0(delta_chroma_offset_l0).delta_luma_weight_l1(delta_luma_weight_l1).luma_offset_l1(luma_offset_l1).delta_chroma_weight_l1(delta_chroma_weight_l1).delta_chroma_offset_l1(delta_chroma_offset_l1);
    }

    /// Allocates a `StdVideoEncodeH265WeightTable` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param flags `flags`
    /// @param luma_log2_weight_denom `luma_log2_weight_denom`
    /// @param delta_chroma_log2_weight_denom `delta_chroma_log2_weight_denom`
    /// @param delta_luma_weight_l0 `delta_luma_weight_l0`
    /// @param luma_offset_l0 `luma_offset_l0`
    /// @param delta_chroma_weight_l0 `delta_chroma_weight_l0`
    /// @param delta_chroma_offset_l0 `delta_chroma_offset_l0`
    /// @param delta_luma_weight_l1 `delta_luma_weight_l1`
    /// @param luma_offset_l1 `luma_offset_l1`
    /// @param delta_chroma_weight_l1 `delta_chroma_weight_l1`
    /// @return the allocated `StdVideoEncodeH265WeightTable`
    public static StdVideoEncodeH265WeightTable allocInit(SegmentAllocator allocator, MemorySegment flags, byte luma_log2_weight_denom, byte delta_chroma_log2_weight_denom, MemorySegment delta_luma_weight_l0, MemorySegment luma_offset_l0, MemorySegment delta_chroma_weight_l0, MemorySegment delta_chroma_offset_l0, MemorySegment delta_luma_weight_l1, MemorySegment luma_offset_l1, MemorySegment delta_chroma_weight_l1) {
        return alloc(allocator).flags(flags).luma_log2_weight_denom(luma_log2_weight_denom).delta_chroma_log2_weight_denom(delta_chroma_log2_weight_denom).delta_luma_weight_l0(delta_luma_weight_l0).luma_offset_l0(luma_offset_l0).delta_chroma_weight_l0(delta_chroma_weight_l0).delta_chroma_offset_l0(delta_chroma_offset_l0).delta_luma_weight_l1(delta_luma_weight_l1).luma_offset_l1(luma_offset_l1).delta_chroma_weight_l1(delta_chroma_weight_l1);
    }

    /// Allocates a `StdVideoEncodeH265WeightTable` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param flags `flags`
    /// @param luma_log2_weight_denom `luma_log2_weight_denom`
    /// @param delta_chroma_log2_weight_denom `delta_chroma_log2_weight_denom`
    /// @param delta_luma_weight_l0 `delta_luma_weight_l0`
    /// @param luma_offset_l0 `luma_offset_l0`
    /// @param delta_chroma_weight_l0 `delta_chroma_weight_l0`
    /// @param delta_chroma_offset_l0 `delta_chroma_offset_l0`
    /// @param delta_luma_weight_l1 `delta_luma_weight_l1`
    /// @param luma_offset_l1 `luma_offset_l1`
    /// @return the allocated `StdVideoEncodeH265WeightTable`
    public static StdVideoEncodeH265WeightTable allocInit(SegmentAllocator allocator, MemorySegment flags, byte luma_log2_weight_denom, byte delta_chroma_log2_weight_denom, MemorySegment delta_luma_weight_l0, MemorySegment luma_offset_l0, MemorySegment delta_chroma_weight_l0, MemorySegment delta_chroma_offset_l0, MemorySegment delta_luma_weight_l1, MemorySegment luma_offset_l1) {
        return alloc(allocator).flags(flags).luma_log2_weight_denom(luma_log2_weight_denom).delta_chroma_log2_weight_denom(delta_chroma_log2_weight_denom).delta_luma_weight_l0(delta_luma_weight_l0).luma_offset_l0(luma_offset_l0).delta_chroma_weight_l0(delta_chroma_weight_l0).delta_chroma_offset_l0(delta_chroma_offset_l0).delta_luma_weight_l1(delta_luma_weight_l1).luma_offset_l1(luma_offset_l1);
    }

    /// Allocates a `StdVideoEncodeH265WeightTable` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param flags `flags`
    /// @param luma_log2_weight_denom `luma_log2_weight_denom`
    /// @param delta_chroma_log2_weight_denom `delta_chroma_log2_weight_denom`
    /// @param delta_luma_weight_l0 `delta_luma_weight_l0`
    /// @param luma_offset_l0 `luma_offset_l0`
    /// @param delta_chroma_weight_l0 `delta_chroma_weight_l0`
    /// @param delta_chroma_offset_l0 `delta_chroma_offset_l0`
    /// @param delta_luma_weight_l1 `delta_luma_weight_l1`
    /// @return the allocated `StdVideoEncodeH265WeightTable`
    public static StdVideoEncodeH265WeightTable allocInit(SegmentAllocator allocator, MemorySegment flags, byte luma_log2_weight_denom, byte delta_chroma_log2_weight_denom, MemorySegment delta_luma_weight_l0, MemorySegment luma_offset_l0, MemorySegment delta_chroma_weight_l0, MemorySegment delta_chroma_offset_l0, MemorySegment delta_luma_weight_l1) {
        return alloc(allocator).flags(flags).luma_log2_weight_denom(luma_log2_weight_denom).delta_chroma_log2_weight_denom(delta_chroma_log2_weight_denom).delta_luma_weight_l0(delta_luma_weight_l0).luma_offset_l0(luma_offset_l0).delta_chroma_weight_l0(delta_chroma_weight_l0).delta_chroma_offset_l0(delta_chroma_offset_l0).delta_luma_weight_l1(delta_luma_weight_l1);
    }

    /// Allocates a `StdVideoEncodeH265WeightTable` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param flags `flags`
    /// @param luma_log2_weight_denom `luma_log2_weight_denom`
    /// @param delta_chroma_log2_weight_denom `delta_chroma_log2_weight_denom`
    /// @param delta_luma_weight_l0 `delta_luma_weight_l0`
    /// @param luma_offset_l0 `luma_offset_l0`
    /// @param delta_chroma_weight_l0 `delta_chroma_weight_l0`
    /// @param delta_chroma_offset_l0 `delta_chroma_offset_l0`
    /// @return the allocated `StdVideoEncodeH265WeightTable`
    public static StdVideoEncodeH265WeightTable allocInit(SegmentAllocator allocator, MemorySegment flags, byte luma_log2_weight_denom, byte delta_chroma_log2_weight_denom, MemorySegment delta_luma_weight_l0, MemorySegment luma_offset_l0, MemorySegment delta_chroma_weight_l0, MemorySegment delta_chroma_offset_l0) {
        return alloc(allocator).flags(flags).luma_log2_weight_denom(luma_log2_weight_denom).delta_chroma_log2_weight_denom(delta_chroma_log2_weight_denom).delta_luma_weight_l0(delta_luma_weight_l0).luma_offset_l0(luma_offset_l0).delta_chroma_weight_l0(delta_chroma_weight_l0).delta_chroma_offset_l0(delta_chroma_offset_l0);
    }

    /// Allocates a `StdVideoEncodeH265WeightTable` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param flags `flags`
    /// @param luma_log2_weight_denom `luma_log2_weight_denom`
    /// @param delta_chroma_log2_weight_denom `delta_chroma_log2_weight_denom`
    /// @param delta_luma_weight_l0 `delta_luma_weight_l0`
    /// @param luma_offset_l0 `luma_offset_l0`
    /// @param delta_chroma_weight_l0 `delta_chroma_weight_l0`
    /// @return the allocated `StdVideoEncodeH265WeightTable`
    public static StdVideoEncodeH265WeightTable allocInit(SegmentAllocator allocator, MemorySegment flags, byte luma_log2_weight_denom, byte delta_chroma_log2_weight_denom, MemorySegment delta_luma_weight_l0, MemorySegment luma_offset_l0, MemorySegment delta_chroma_weight_l0) {
        return alloc(allocator).flags(flags).luma_log2_weight_denom(luma_log2_weight_denom).delta_chroma_log2_weight_denom(delta_chroma_log2_weight_denom).delta_luma_weight_l0(delta_luma_weight_l0).luma_offset_l0(luma_offset_l0).delta_chroma_weight_l0(delta_chroma_weight_l0);
    }

    /// Allocates a `StdVideoEncodeH265WeightTable` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param flags `flags`
    /// @param luma_log2_weight_denom `luma_log2_weight_denom`
    /// @param delta_chroma_log2_weight_denom `delta_chroma_log2_weight_denom`
    /// @param delta_luma_weight_l0 `delta_luma_weight_l0`
    /// @param luma_offset_l0 `luma_offset_l0`
    /// @return the allocated `StdVideoEncodeH265WeightTable`
    public static StdVideoEncodeH265WeightTable allocInit(SegmentAllocator allocator, MemorySegment flags, byte luma_log2_weight_denom, byte delta_chroma_log2_weight_denom, MemorySegment delta_luma_weight_l0, MemorySegment luma_offset_l0) {
        return alloc(allocator).flags(flags).luma_log2_weight_denom(luma_log2_weight_denom).delta_chroma_log2_weight_denom(delta_chroma_log2_weight_denom).delta_luma_weight_l0(delta_luma_weight_l0).luma_offset_l0(luma_offset_l0);
    }

    /// Allocates a `StdVideoEncodeH265WeightTable` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param flags `flags`
    /// @param luma_log2_weight_denom `luma_log2_weight_denom`
    /// @param delta_chroma_log2_weight_denom `delta_chroma_log2_weight_denom`
    /// @param delta_luma_weight_l0 `delta_luma_weight_l0`
    /// @return the allocated `StdVideoEncodeH265WeightTable`
    public static StdVideoEncodeH265WeightTable allocInit(SegmentAllocator allocator, MemorySegment flags, byte luma_log2_weight_denom, byte delta_chroma_log2_weight_denom, MemorySegment delta_luma_weight_l0) {
        return alloc(allocator).flags(flags).luma_log2_weight_denom(luma_log2_weight_denom).delta_chroma_log2_weight_denom(delta_chroma_log2_weight_denom).delta_luma_weight_l0(delta_luma_weight_l0);
    }

    /// Allocates a `StdVideoEncodeH265WeightTable` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param flags `flags`
    /// @param luma_log2_weight_denom `luma_log2_weight_denom`
    /// @param delta_chroma_log2_weight_denom `delta_chroma_log2_weight_denom`
    /// @return the allocated `StdVideoEncodeH265WeightTable`
    public static StdVideoEncodeH265WeightTable allocInit(SegmentAllocator allocator, MemorySegment flags, byte luma_log2_weight_denom, byte delta_chroma_log2_weight_denom) {
        return alloc(allocator).flags(flags).luma_log2_weight_denom(luma_log2_weight_denom).delta_chroma_log2_weight_denom(delta_chroma_log2_weight_denom);
    }

    /// Allocates a `StdVideoEncodeH265WeightTable` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param flags `flags`
    /// @param luma_log2_weight_denom `luma_log2_weight_denom`
    /// @return the allocated `StdVideoEncodeH265WeightTable`
    public static StdVideoEncodeH265WeightTable allocInit(SegmentAllocator allocator, MemorySegment flags, byte luma_log2_weight_denom) {
        return alloc(allocator).flags(flags).luma_log2_weight_denom(luma_log2_weight_denom);
    }

    /// Allocates a `StdVideoEncodeH265WeightTable` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param flags `flags`
    /// @return the allocated `StdVideoEncodeH265WeightTable`
    public static StdVideoEncodeH265WeightTable allocInit(SegmentAllocator allocator, MemorySegment flags) {
        return alloc(allocator).flags(flags);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public StdVideoEncodeH265WeightTable copyFrom(StdVideoEncodeH265WeightTable src) { this.segment().copyFrom(src.segment()); return this; }

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
    public StdVideoEncodeH265WeightTable flags(MemorySegment value) { flags(this.segment(), 0L, value); return this; }
    /// Accepts `flags` with the given function.
    /// @param func the function
    /// @return `this`
    public StdVideoEncodeH265WeightTable flags(Consumer<overrungl.vulkan.video.StdVideoEncodeH265WeightTableFlags> func) { func.accept(overrungl.vulkan.video.StdVideoEncodeH265WeightTableFlags.of(flags())); return this; }

    /// {@return `luma_log2_weight_denom` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte luma_log2_weight_denom(MemorySegment segment, long index) { return (byte) VH_luma_log2_weight_denom.get(segment, 0L, index); }
    /// {@return `luma_log2_weight_denom`}
    public byte luma_log2_weight_denom() { return luma_log2_weight_denom(this.segment(), 0L); }
    /// Sets `luma_log2_weight_denom` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void luma_log2_weight_denom(MemorySegment segment, long index, byte value) { VH_luma_log2_weight_denom.set(segment, 0L, index, value); }
    /// Sets `luma_log2_weight_denom` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265WeightTable luma_log2_weight_denom(byte value) { luma_log2_weight_denom(this.segment(), 0L, value); return this; }

    /// {@return `delta_chroma_log2_weight_denom` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte delta_chroma_log2_weight_denom(MemorySegment segment, long index) { return (byte) VH_delta_chroma_log2_weight_denom.get(segment, 0L, index); }
    /// {@return `delta_chroma_log2_weight_denom`}
    public byte delta_chroma_log2_weight_denom() { return delta_chroma_log2_weight_denom(this.segment(), 0L); }
    /// Sets `delta_chroma_log2_weight_denom` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void delta_chroma_log2_weight_denom(MemorySegment segment, long index, byte value) { VH_delta_chroma_log2_weight_denom.set(segment, 0L, index, value); }
    /// Sets `delta_chroma_log2_weight_denom` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265WeightTable delta_chroma_log2_weight_denom(byte value) { delta_chroma_log2_weight_denom(this.segment(), 0L, value); return this; }

    /// {@return `delta_luma_weight_l0` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment delta_luma_weight_l0(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_delta_luma_weight_l0, index), LAYOUT_delta_luma_weight_l0); }
    /// {@return `delta_luma_weight_l0` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    public static byte delta_luma_weight_l0(MemorySegment segment, long index, long index0) { return (byte) VH_delta_luma_weight_l0.get(segment, 0L, index, index0); }
    /// {@return `delta_luma_weight_l0`}
    public MemorySegment delta_luma_weight_l0() { return delta_luma_weight_l0(this.segment(), 0L); }
    /// {@return `delta_luma_weight_l0`}
    /// @param index0 the Index 0 of the array
    public byte delta_luma_weight_l0(long index0) { return delta_luma_weight_l0(this.segment(), 0L, index0); }
    /// Sets `delta_luma_weight_l0` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void delta_luma_weight_l0(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_delta_luma_weight_l0, index), LAYOUT_delta_luma_weight_l0.byteSize()); }
    /// Sets `delta_luma_weight_l0` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    public static void delta_luma_weight_l0(MemorySegment segment, long index, long index0, byte value) { VH_delta_luma_weight_l0.set(segment, 0L, index, index0, value); }
    /// Sets `delta_luma_weight_l0` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265WeightTable delta_luma_weight_l0(MemorySegment value) { delta_luma_weight_l0(this.segment(), 0L, value); return this; }
    /// Sets `delta_luma_weight_l0` with the given value.
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265WeightTable delta_luma_weight_l0(long index0, byte value) { delta_luma_weight_l0(this.segment(), 0L, index0, value); return this; }

    /// {@return `luma_offset_l0` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment luma_offset_l0(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_luma_offset_l0, index), LAYOUT_luma_offset_l0); }
    /// {@return `luma_offset_l0` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    public static byte luma_offset_l0(MemorySegment segment, long index, long index0) { return (byte) VH_luma_offset_l0.get(segment, 0L, index, index0); }
    /// {@return `luma_offset_l0`}
    public MemorySegment luma_offset_l0() { return luma_offset_l0(this.segment(), 0L); }
    /// {@return `luma_offset_l0`}
    /// @param index0 the Index 0 of the array
    public byte luma_offset_l0(long index0) { return luma_offset_l0(this.segment(), 0L, index0); }
    /// Sets `luma_offset_l0` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void luma_offset_l0(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_luma_offset_l0, index), LAYOUT_luma_offset_l0.byteSize()); }
    /// Sets `luma_offset_l0` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    public static void luma_offset_l0(MemorySegment segment, long index, long index0, byte value) { VH_luma_offset_l0.set(segment, 0L, index, index0, value); }
    /// Sets `luma_offset_l0` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265WeightTable luma_offset_l0(MemorySegment value) { luma_offset_l0(this.segment(), 0L, value); return this; }
    /// Sets `luma_offset_l0` with the given value.
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265WeightTable luma_offset_l0(long index0, byte value) { luma_offset_l0(this.segment(), 0L, index0, value); return this; }

    /// {@return `delta_chroma_weight_l0` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment delta_chroma_weight_l0(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_delta_chroma_weight_l0, index), LAYOUT_delta_chroma_weight_l0); }
    /// {@return `delta_chroma_weight_l0` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param index1 the Index 1 of the array
    public static byte delta_chroma_weight_l0(MemorySegment segment, long index, long index0, long index1) { return (byte) VH_delta_chroma_weight_l0.get(segment, 0L, index, index0, index1); }
    /// {@return `delta_chroma_weight_l0`}
    public MemorySegment delta_chroma_weight_l0() { return delta_chroma_weight_l0(this.segment(), 0L); }
    /// {@return `delta_chroma_weight_l0`}
    /// @param index0 the Index 0 of the array
    /// @param index1 the Index 1 of the array
    public byte delta_chroma_weight_l0(long index0, long index1) { return delta_chroma_weight_l0(this.segment(), 0L, index0, index1); }
    /// Sets `delta_chroma_weight_l0` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void delta_chroma_weight_l0(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_delta_chroma_weight_l0, index), LAYOUT_delta_chroma_weight_l0.byteSize()); }
    /// Sets `delta_chroma_weight_l0` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param index1 the Index 1 of the array
    /// @param value the value
    public static void delta_chroma_weight_l0(MemorySegment segment, long index, long index0, long index1, byte value) { VH_delta_chroma_weight_l0.set(segment, 0L, index, index0, index1, value); }
    /// Sets `delta_chroma_weight_l0` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265WeightTable delta_chroma_weight_l0(MemorySegment value) { delta_chroma_weight_l0(this.segment(), 0L, value); return this; }
    /// Sets `delta_chroma_weight_l0` with the given value.
    /// @param index0 the Index 0 of the array
    /// @param index1 the Index 1 of the array
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265WeightTable delta_chroma_weight_l0(long index0, long index1, byte value) { delta_chroma_weight_l0(this.segment(), 0L, index0, index1, value); return this; }

    /// {@return `delta_chroma_offset_l0` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment delta_chroma_offset_l0(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_delta_chroma_offset_l0, index), LAYOUT_delta_chroma_offset_l0); }
    /// {@return `delta_chroma_offset_l0` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param index1 the Index 1 of the array
    public static byte delta_chroma_offset_l0(MemorySegment segment, long index, long index0, long index1) { return (byte) VH_delta_chroma_offset_l0.get(segment, 0L, index, index0, index1); }
    /// {@return `delta_chroma_offset_l0`}
    public MemorySegment delta_chroma_offset_l0() { return delta_chroma_offset_l0(this.segment(), 0L); }
    /// {@return `delta_chroma_offset_l0`}
    /// @param index0 the Index 0 of the array
    /// @param index1 the Index 1 of the array
    public byte delta_chroma_offset_l0(long index0, long index1) { return delta_chroma_offset_l0(this.segment(), 0L, index0, index1); }
    /// Sets `delta_chroma_offset_l0` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void delta_chroma_offset_l0(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_delta_chroma_offset_l0, index), LAYOUT_delta_chroma_offset_l0.byteSize()); }
    /// Sets `delta_chroma_offset_l0` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param index1 the Index 1 of the array
    /// @param value the value
    public static void delta_chroma_offset_l0(MemorySegment segment, long index, long index0, long index1, byte value) { VH_delta_chroma_offset_l0.set(segment, 0L, index, index0, index1, value); }
    /// Sets `delta_chroma_offset_l0` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265WeightTable delta_chroma_offset_l0(MemorySegment value) { delta_chroma_offset_l0(this.segment(), 0L, value); return this; }
    /// Sets `delta_chroma_offset_l0` with the given value.
    /// @param index0 the Index 0 of the array
    /// @param index1 the Index 1 of the array
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265WeightTable delta_chroma_offset_l0(long index0, long index1, byte value) { delta_chroma_offset_l0(this.segment(), 0L, index0, index1, value); return this; }

    /// {@return `delta_luma_weight_l1` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment delta_luma_weight_l1(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_delta_luma_weight_l1, index), LAYOUT_delta_luma_weight_l1); }
    /// {@return `delta_luma_weight_l1` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    public static byte delta_luma_weight_l1(MemorySegment segment, long index, long index0) { return (byte) VH_delta_luma_weight_l1.get(segment, 0L, index, index0); }
    /// {@return `delta_luma_weight_l1`}
    public MemorySegment delta_luma_weight_l1() { return delta_luma_weight_l1(this.segment(), 0L); }
    /// {@return `delta_luma_weight_l1`}
    /// @param index0 the Index 0 of the array
    public byte delta_luma_weight_l1(long index0) { return delta_luma_weight_l1(this.segment(), 0L, index0); }
    /// Sets `delta_luma_weight_l1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void delta_luma_weight_l1(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_delta_luma_weight_l1, index), LAYOUT_delta_luma_weight_l1.byteSize()); }
    /// Sets `delta_luma_weight_l1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    public static void delta_luma_weight_l1(MemorySegment segment, long index, long index0, byte value) { VH_delta_luma_weight_l1.set(segment, 0L, index, index0, value); }
    /// Sets `delta_luma_weight_l1` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265WeightTable delta_luma_weight_l1(MemorySegment value) { delta_luma_weight_l1(this.segment(), 0L, value); return this; }
    /// Sets `delta_luma_weight_l1` with the given value.
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265WeightTable delta_luma_weight_l1(long index0, byte value) { delta_luma_weight_l1(this.segment(), 0L, index0, value); return this; }

    /// {@return `luma_offset_l1` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment luma_offset_l1(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_luma_offset_l1, index), LAYOUT_luma_offset_l1); }
    /// {@return `luma_offset_l1` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    public static byte luma_offset_l1(MemorySegment segment, long index, long index0) { return (byte) VH_luma_offset_l1.get(segment, 0L, index, index0); }
    /// {@return `luma_offset_l1`}
    public MemorySegment luma_offset_l1() { return luma_offset_l1(this.segment(), 0L); }
    /// {@return `luma_offset_l1`}
    /// @param index0 the Index 0 of the array
    public byte luma_offset_l1(long index0) { return luma_offset_l1(this.segment(), 0L, index0); }
    /// Sets `luma_offset_l1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void luma_offset_l1(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_luma_offset_l1, index), LAYOUT_luma_offset_l1.byteSize()); }
    /// Sets `luma_offset_l1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    public static void luma_offset_l1(MemorySegment segment, long index, long index0, byte value) { VH_luma_offset_l1.set(segment, 0L, index, index0, value); }
    /// Sets `luma_offset_l1` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265WeightTable luma_offset_l1(MemorySegment value) { luma_offset_l1(this.segment(), 0L, value); return this; }
    /// Sets `luma_offset_l1` with the given value.
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265WeightTable luma_offset_l1(long index0, byte value) { luma_offset_l1(this.segment(), 0L, index0, value); return this; }

    /// {@return `delta_chroma_weight_l1` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment delta_chroma_weight_l1(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_delta_chroma_weight_l1, index), LAYOUT_delta_chroma_weight_l1); }
    /// {@return `delta_chroma_weight_l1` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param index1 the Index 1 of the array
    public static byte delta_chroma_weight_l1(MemorySegment segment, long index, long index0, long index1) { return (byte) VH_delta_chroma_weight_l1.get(segment, 0L, index, index0, index1); }
    /// {@return `delta_chroma_weight_l1`}
    public MemorySegment delta_chroma_weight_l1() { return delta_chroma_weight_l1(this.segment(), 0L); }
    /// {@return `delta_chroma_weight_l1`}
    /// @param index0 the Index 0 of the array
    /// @param index1 the Index 1 of the array
    public byte delta_chroma_weight_l1(long index0, long index1) { return delta_chroma_weight_l1(this.segment(), 0L, index0, index1); }
    /// Sets `delta_chroma_weight_l1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void delta_chroma_weight_l1(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_delta_chroma_weight_l1, index), LAYOUT_delta_chroma_weight_l1.byteSize()); }
    /// Sets `delta_chroma_weight_l1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param index1 the Index 1 of the array
    /// @param value the value
    public static void delta_chroma_weight_l1(MemorySegment segment, long index, long index0, long index1, byte value) { VH_delta_chroma_weight_l1.set(segment, 0L, index, index0, index1, value); }
    /// Sets `delta_chroma_weight_l1` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265WeightTable delta_chroma_weight_l1(MemorySegment value) { delta_chroma_weight_l1(this.segment(), 0L, value); return this; }
    /// Sets `delta_chroma_weight_l1` with the given value.
    /// @param index0 the Index 0 of the array
    /// @param index1 the Index 1 of the array
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265WeightTable delta_chroma_weight_l1(long index0, long index1, byte value) { delta_chroma_weight_l1(this.segment(), 0L, index0, index1, value); return this; }

    /// {@return `delta_chroma_offset_l1` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment delta_chroma_offset_l1(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_delta_chroma_offset_l1, index), LAYOUT_delta_chroma_offset_l1); }
    /// {@return `delta_chroma_offset_l1` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param index1 the Index 1 of the array
    public static byte delta_chroma_offset_l1(MemorySegment segment, long index, long index0, long index1) { return (byte) VH_delta_chroma_offset_l1.get(segment, 0L, index, index0, index1); }
    /// {@return `delta_chroma_offset_l1`}
    public MemorySegment delta_chroma_offset_l1() { return delta_chroma_offset_l1(this.segment(), 0L); }
    /// {@return `delta_chroma_offset_l1`}
    /// @param index0 the Index 0 of the array
    /// @param index1 the Index 1 of the array
    public byte delta_chroma_offset_l1(long index0, long index1) { return delta_chroma_offset_l1(this.segment(), 0L, index0, index1); }
    /// Sets `delta_chroma_offset_l1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void delta_chroma_offset_l1(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_delta_chroma_offset_l1, index), LAYOUT_delta_chroma_offset_l1.byteSize()); }
    /// Sets `delta_chroma_offset_l1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param index1 the Index 1 of the array
    /// @param value the value
    public static void delta_chroma_offset_l1(MemorySegment segment, long index, long index0, long index1, byte value) { VH_delta_chroma_offset_l1.set(segment, 0L, index, index0, index1, value); }
    /// Sets `delta_chroma_offset_l1` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265WeightTable delta_chroma_offset_l1(MemorySegment value) { delta_chroma_offset_l1(this.segment(), 0L, value); return this; }
    /// Sets `delta_chroma_offset_l1` with the given value.
    /// @param index0 the Index 0 of the array
    /// @param index1 the Index 1 of the array
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265WeightTable delta_chroma_offset_l1(long index0, long index1, byte value) { delta_chroma_offset_l1(this.segment(), 0L, index0, index1, value); return this; }

    /// A buffer of [StdVideoEncodeH265WeightTable].
    public static final class Buffer extends StdVideoEncodeH265WeightTable {
        private final long elementCount;

        /// Creates `StdVideoEncodeH265WeightTable.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `StdVideoEncodeH265WeightTable`.
        /// @param index the index of the struct buffer
        /// @return the slice of `StdVideoEncodeH265WeightTable`
        public StdVideoEncodeH265WeightTable asSlice(long index) { return new StdVideoEncodeH265WeightTable(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `StdVideoEncodeH265WeightTable`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `StdVideoEncodeH265WeightTable`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `flags` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment flagsAt(long index) { return flags(this.segment(), index); }
        /// Sets `flags` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer flagsAt(long index, MemorySegment value) { flags(this.segment(), index, value); return this; }
        /// Accepts `flags` with the given function.
        /// @param index the index of the struct buffer
        /// @param func the function
        /// @return `this`
        public Buffer flagsAt(long index, Consumer<overrungl.vulkan.video.StdVideoEncodeH265WeightTableFlags> func) { func.accept(overrungl.vulkan.video.StdVideoEncodeH265WeightTableFlags.of(flagsAt(index))); return this; }

        /// {@return `luma_log2_weight_denom` at the given index}
        /// @param index the index of the struct buffer
        public byte luma_log2_weight_denomAt(long index) { return luma_log2_weight_denom(this.segment(), index); }
        /// Sets `luma_log2_weight_denom` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer luma_log2_weight_denomAt(long index, byte value) { luma_log2_weight_denom(this.segment(), index, value); return this; }

        /// {@return `delta_chroma_log2_weight_denom` at the given index}
        /// @param index the index of the struct buffer
        public byte delta_chroma_log2_weight_denomAt(long index) { return delta_chroma_log2_weight_denom(this.segment(), index); }
        /// Sets `delta_chroma_log2_weight_denom` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer delta_chroma_log2_weight_denomAt(long index, byte value) { delta_chroma_log2_weight_denom(this.segment(), index, value); return this; }

        /// {@return `delta_luma_weight_l0` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment delta_luma_weight_l0At(long index) { return delta_luma_weight_l0(this.segment(), index); }
        /// {@return `delta_luma_weight_l0` at the given index}
        /// @param index the index of the struct buffer
        /// @param index0 the Index 0 of the array
        public byte delta_luma_weight_l0At(long index, long index0) { return delta_luma_weight_l0(this.segment(), index, index0); }
        /// Sets `delta_luma_weight_l0` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer delta_luma_weight_l0At(long index, MemorySegment value) { delta_luma_weight_l0(this.segment(), index, value); return this; }
        /// Sets `delta_luma_weight_l0` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param index0 the Index 0 of the array
        /// @param value the value
        /// @return `this`
        public Buffer delta_luma_weight_l0At(long index, long index0, byte value) { delta_luma_weight_l0(this.segment(), index, index0, value); return this; }

        /// {@return `luma_offset_l0` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment luma_offset_l0At(long index) { return luma_offset_l0(this.segment(), index); }
        /// {@return `luma_offset_l0` at the given index}
        /// @param index the index of the struct buffer
        /// @param index0 the Index 0 of the array
        public byte luma_offset_l0At(long index, long index0) { return luma_offset_l0(this.segment(), index, index0); }
        /// Sets `luma_offset_l0` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer luma_offset_l0At(long index, MemorySegment value) { luma_offset_l0(this.segment(), index, value); return this; }
        /// Sets `luma_offset_l0` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param index0 the Index 0 of the array
        /// @param value the value
        /// @return `this`
        public Buffer luma_offset_l0At(long index, long index0, byte value) { luma_offset_l0(this.segment(), index, index0, value); return this; }

        /// {@return `delta_chroma_weight_l0` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment delta_chroma_weight_l0At(long index) { return delta_chroma_weight_l0(this.segment(), index); }
        /// {@return `delta_chroma_weight_l0` at the given index}
        /// @param index the index of the struct buffer
        /// @param index0 the Index 0 of the array
        /// @param index1 the Index 1 of the array
        public byte delta_chroma_weight_l0At(long index, long index0, long index1) { return delta_chroma_weight_l0(this.segment(), index, index0, index1); }
        /// Sets `delta_chroma_weight_l0` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer delta_chroma_weight_l0At(long index, MemorySegment value) { delta_chroma_weight_l0(this.segment(), index, value); return this; }
        /// Sets `delta_chroma_weight_l0` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param index0 the Index 0 of the array
        /// @param index1 the Index 1 of the array
        /// @param value the value
        /// @return `this`
        public Buffer delta_chroma_weight_l0At(long index, long index0, long index1, byte value) { delta_chroma_weight_l0(this.segment(), index, index0, index1, value); return this; }

        /// {@return `delta_chroma_offset_l0` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment delta_chroma_offset_l0At(long index) { return delta_chroma_offset_l0(this.segment(), index); }
        /// {@return `delta_chroma_offset_l0` at the given index}
        /// @param index the index of the struct buffer
        /// @param index0 the Index 0 of the array
        /// @param index1 the Index 1 of the array
        public byte delta_chroma_offset_l0At(long index, long index0, long index1) { return delta_chroma_offset_l0(this.segment(), index, index0, index1); }
        /// Sets `delta_chroma_offset_l0` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer delta_chroma_offset_l0At(long index, MemorySegment value) { delta_chroma_offset_l0(this.segment(), index, value); return this; }
        /// Sets `delta_chroma_offset_l0` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param index0 the Index 0 of the array
        /// @param index1 the Index 1 of the array
        /// @param value the value
        /// @return `this`
        public Buffer delta_chroma_offset_l0At(long index, long index0, long index1, byte value) { delta_chroma_offset_l0(this.segment(), index, index0, index1, value); return this; }

        /// {@return `delta_luma_weight_l1` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment delta_luma_weight_l1At(long index) { return delta_luma_weight_l1(this.segment(), index); }
        /// {@return `delta_luma_weight_l1` at the given index}
        /// @param index the index of the struct buffer
        /// @param index0 the Index 0 of the array
        public byte delta_luma_weight_l1At(long index, long index0) { return delta_luma_weight_l1(this.segment(), index, index0); }
        /// Sets `delta_luma_weight_l1` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer delta_luma_weight_l1At(long index, MemorySegment value) { delta_luma_weight_l1(this.segment(), index, value); return this; }
        /// Sets `delta_luma_weight_l1` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param index0 the Index 0 of the array
        /// @param value the value
        /// @return `this`
        public Buffer delta_luma_weight_l1At(long index, long index0, byte value) { delta_luma_weight_l1(this.segment(), index, index0, value); return this; }

        /// {@return `luma_offset_l1` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment luma_offset_l1At(long index) { return luma_offset_l1(this.segment(), index); }
        /// {@return `luma_offset_l1` at the given index}
        /// @param index the index of the struct buffer
        /// @param index0 the Index 0 of the array
        public byte luma_offset_l1At(long index, long index0) { return luma_offset_l1(this.segment(), index, index0); }
        /// Sets `luma_offset_l1` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer luma_offset_l1At(long index, MemorySegment value) { luma_offset_l1(this.segment(), index, value); return this; }
        /// Sets `luma_offset_l1` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param index0 the Index 0 of the array
        /// @param value the value
        /// @return `this`
        public Buffer luma_offset_l1At(long index, long index0, byte value) { luma_offset_l1(this.segment(), index, index0, value); return this; }

        /// {@return `delta_chroma_weight_l1` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment delta_chroma_weight_l1At(long index) { return delta_chroma_weight_l1(this.segment(), index); }
        /// {@return `delta_chroma_weight_l1` at the given index}
        /// @param index the index of the struct buffer
        /// @param index0 the Index 0 of the array
        /// @param index1 the Index 1 of the array
        public byte delta_chroma_weight_l1At(long index, long index0, long index1) { return delta_chroma_weight_l1(this.segment(), index, index0, index1); }
        /// Sets `delta_chroma_weight_l1` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer delta_chroma_weight_l1At(long index, MemorySegment value) { delta_chroma_weight_l1(this.segment(), index, value); return this; }
        /// Sets `delta_chroma_weight_l1` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param index0 the Index 0 of the array
        /// @param index1 the Index 1 of the array
        /// @param value the value
        /// @return `this`
        public Buffer delta_chroma_weight_l1At(long index, long index0, long index1, byte value) { delta_chroma_weight_l1(this.segment(), index, index0, index1, value); return this; }

        /// {@return `delta_chroma_offset_l1` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment delta_chroma_offset_l1At(long index) { return delta_chroma_offset_l1(this.segment(), index); }
        /// {@return `delta_chroma_offset_l1` at the given index}
        /// @param index the index of the struct buffer
        /// @param index0 the Index 0 of the array
        /// @param index1 the Index 1 of the array
        public byte delta_chroma_offset_l1At(long index, long index0, long index1) { return delta_chroma_offset_l1(this.segment(), index, index0, index1); }
        /// Sets `delta_chroma_offset_l1` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer delta_chroma_offset_l1At(long index, MemorySegment value) { delta_chroma_offset_l1(this.segment(), index, value); return this; }
        /// Sets `delta_chroma_offset_l1` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param index0 the Index 0 of the array
        /// @param index1 the Index 1 of the array
        /// @param value the value
        /// @return `this`
        public Buffer delta_chroma_offset_l1At(long index, long index0, long index1, byte value) { delta_chroma_offset_l1(this.segment(), index, index0, index1, value); return this; }

    }
}
