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
/// struct StdVideoEncodeH264WeightTable {
///     (struct StdVideoEncodeH264WeightTableFlags) StdVideoEncodeH264WeightTableFlags flags;
///     uint8_t luma_log2_weight_denom;
///     uint8_t chroma_log2_weight_denom;
///     int8_t luma_weight_l0[32];
///     int8_t luma_offset_l0[32];
///     int8_t chroma_weight_l0[32][2];
///     int8_t chroma_offset_l0[32][2];
///     int8_t luma_weight_l1[32];
///     int8_t luma_offset_l1[32];
///     int8_t chroma_weight_l1[32][2];
///     int8_t chroma_offset_l1[32][2];
/// };
/// ```
public sealed class StdVideoEncodeH264WeightTable extends GroupType {
    /// The struct layout of `StdVideoEncodeH264WeightTable`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        overrungl.vulkan.video.StdVideoEncodeH264WeightTableFlags.LAYOUT.withName("flags"),
        ValueLayout.JAVA_BYTE.withName("luma_log2_weight_denom"),
        ValueLayout.JAVA_BYTE.withName("chroma_log2_weight_denom"),
        MemoryLayout.sequenceLayout(32, ValueLayout.JAVA_BYTE).withName("luma_weight_l0"),
        MemoryLayout.sequenceLayout(32, ValueLayout.JAVA_BYTE).withName("luma_offset_l0"),
        MemoryLayout.sequenceLayout(2, MemoryLayout.sequenceLayout(32, ValueLayout.JAVA_BYTE)).withName("chroma_weight_l0"),
        MemoryLayout.sequenceLayout(2, MemoryLayout.sequenceLayout(32, ValueLayout.JAVA_BYTE)).withName("chroma_offset_l0"),
        MemoryLayout.sequenceLayout(32, ValueLayout.JAVA_BYTE).withName("luma_weight_l1"),
        MemoryLayout.sequenceLayout(32, ValueLayout.JAVA_BYTE).withName("luma_offset_l1"),
        MemoryLayout.sequenceLayout(2, MemoryLayout.sequenceLayout(32, ValueLayout.JAVA_BYTE)).withName("chroma_weight_l1"),
        MemoryLayout.sequenceLayout(2, MemoryLayout.sequenceLayout(32, ValueLayout.JAVA_BYTE)).withName("chroma_offset_l1")
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
    /// The byte offset of `chroma_log2_weight_denom`.
    public static final long OFFSET_chroma_log2_weight_denom = LAYOUT.byteOffset(PathElement.groupElement("chroma_log2_weight_denom"));
    /// The memory layout of `chroma_log2_weight_denom`.
    public static final MemoryLayout LAYOUT_chroma_log2_weight_denom = LAYOUT.select(PathElement.groupElement("chroma_log2_weight_denom"));
    /// The [VarHandle] of `chroma_log2_weight_denom` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_chroma_log2_weight_denom = LAYOUT.arrayElementVarHandle(PathElement.groupElement("chroma_log2_weight_denom"));
    /// The byte offset of `luma_weight_l0`.
    public static final long OFFSET_luma_weight_l0 = LAYOUT.byteOffset(PathElement.groupElement("luma_weight_l0"));
    /// The memory layout of `luma_weight_l0`.
    public static final MemoryLayout LAYOUT_luma_weight_l0 = LAYOUT.select(PathElement.groupElement("luma_weight_l0"));
    /// The [VarHandle] of `luma_weight_l0` of type `(MemorySegment base, long baseOffset, long index, long index0)MemorySegment`.
    public static final VarHandle VH_luma_weight_l0 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("luma_weight_l0"), PathElement.sequenceElement());
    /// The byte offset of `luma_offset_l0`.
    public static final long OFFSET_luma_offset_l0 = LAYOUT.byteOffset(PathElement.groupElement("luma_offset_l0"));
    /// The memory layout of `luma_offset_l0`.
    public static final MemoryLayout LAYOUT_luma_offset_l0 = LAYOUT.select(PathElement.groupElement("luma_offset_l0"));
    /// The [VarHandle] of `luma_offset_l0` of type `(MemorySegment base, long baseOffset, long index, long index0)MemorySegment`.
    public static final VarHandle VH_luma_offset_l0 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("luma_offset_l0"), PathElement.sequenceElement());
    /// The byte offset of `chroma_weight_l0`.
    public static final long OFFSET_chroma_weight_l0 = LAYOUT.byteOffset(PathElement.groupElement("chroma_weight_l0"));
    /// The memory layout of `chroma_weight_l0`.
    public static final MemoryLayout LAYOUT_chroma_weight_l0 = LAYOUT.select(PathElement.groupElement("chroma_weight_l0"));
    /// The [VarHandle] of `chroma_weight_l0` of type `(MemorySegment base, long baseOffset, long index, long index0, long index1)MemorySegment`.
    public static final VarHandle VH_chroma_weight_l0 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("chroma_weight_l0"), PathElement.sequenceElement(), PathElement.sequenceElement());
    /// The byte offset of `chroma_offset_l0`.
    public static final long OFFSET_chroma_offset_l0 = LAYOUT.byteOffset(PathElement.groupElement("chroma_offset_l0"));
    /// The memory layout of `chroma_offset_l0`.
    public static final MemoryLayout LAYOUT_chroma_offset_l0 = LAYOUT.select(PathElement.groupElement("chroma_offset_l0"));
    /// The [VarHandle] of `chroma_offset_l0` of type `(MemorySegment base, long baseOffset, long index, long index0, long index1)MemorySegment`.
    public static final VarHandle VH_chroma_offset_l0 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("chroma_offset_l0"), PathElement.sequenceElement(), PathElement.sequenceElement());
    /// The byte offset of `luma_weight_l1`.
    public static final long OFFSET_luma_weight_l1 = LAYOUT.byteOffset(PathElement.groupElement("luma_weight_l1"));
    /// The memory layout of `luma_weight_l1`.
    public static final MemoryLayout LAYOUT_luma_weight_l1 = LAYOUT.select(PathElement.groupElement("luma_weight_l1"));
    /// The [VarHandle] of `luma_weight_l1` of type `(MemorySegment base, long baseOffset, long index, long index0)MemorySegment`.
    public static final VarHandle VH_luma_weight_l1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("luma_weight_l1"), PathElement.sequenceElement());
    /// The byte offset of `luma_offset_l1`.
    public static final long OFFSET_luma_offset_l1 = LAYOUT.byteOffset(PathElement.groupElement("luma_offset_l1"));
    /// The memory layout of `luma_offset_l1`.
    public static final MemoryLayout LAYOUT_luma_offset_l1 = LAYOUT.select(PathElement.groupElement("luma_offset_l1"));
    /// The [VarHandle] of `luma_offset_l1` of type `(MemorySegment base, long baseOffset, long index, long index0)MemorySegment`.
    public static final VarHandle VH_luma_offset_l1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("luma_offset_l1"), PathElement.sequenceElement());
    /// The byte offset of `chroma_weight_l1`.
    public static final long OFFSET_chroma_weight_l1 = LAYOUT.byteOffset(PathElement.groupElement("chroma_weight_l1"));
    /// The memory layout of `chroma_weight_l1`.
    public static final MemoryLayout LAYOUT_chroma_weight_l1 = LAYOUT.select(PathElement.groupElement("chroma_weight_l1"));
    /// The [VarHandle] of `chroma_weight_l1` of type `(MemorySegment base, long baseOffset, long index, long index0, long index1)MemorySegment`.
    public static final VarHandle VH_chroma_weight_l1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("chroma_weight_l1"), PathElement.sequenceElement(), PathElement.sequenceElement());
    /// The byte offset of `chroma_offset_l1`.
    public static final long OFFSET_chroma_offset_l1 = LAYOUT.byteOffset(PathElement.groupElement("chroma_offset_l1"));
    /// The memory layout of `chroma_offset_l1`.
    public static final MemoryLayout LAYOUT_chroma_offset_l1 = LAYOUT.select(PathElement.groupElement("chroma_offset_l1"));
    /// The [VarHandle] of `chroma_offset_l1` of type `(MemorySegment base, long baseOffset, long index, long index0, long index1)MemorySegment`.
    public static final VarHandle VH_chroma_offset_l1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("chroma_offset_l1"), PathElement.sequenceElement(), PathElement.sequenceElement());

    /// Creates `StdVideoEncodeH264WeightTable` with the given segment.
    /// @param segment the memory segment
    public StdVideoEncodeH264WeightTable(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `StdVideoEncodeH264WeightTable` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `StdVideoEncodeH264WeightTable` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoEncodeH264WeightTable ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoEncodeH264WeightTable(segment.reinterpret(LAYOUT.byteSize())); }

    /// Creates `StdVideoEncodeH264WeightTable` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `StdVideoEncodeH264WeightTable` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoEncodeH264WeightTable`
    public static StdVideoEncodeH264WeightTable alloc(SegmentAllocator allocator) { return new StdVideoEncodeH264WeightTable(allocator.allocate(LAYOUT)); }

    /// Allocates a `StdVideoEncodeH264WeightTable` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `StdVideoEncodeH264WeightTable`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public StdVideoEncodeH264WeightTable copyFrom(StdVideoEncodeH264WeightTable src) { this.segment().copyFrom(src.segment()); return this; }

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
    public StdVideoEncodeH264WeightTable flags(MemorySegment value) { flags(this.segment(), 0L, value); return this; }

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
    public StdVideoEncodeH264WeightTable luma_log2_weight_denom(byte value) { luma_log2_weight_denom(this.segment(), 0L, value); return this; }

    /// {@return `chroma_log2_weight_denom` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte chroma_log2_weight_denom(MemorySegment segment, long index) { return (byte) VH_chroma_log2_weight_denom.get(segment, 0L, index); }
    /// {@return `chroma_log2_weight_denom`}
    public byte chroma_log2_weight_denom() { return chroma_log2_weight_denom(this.segment(), 0L); }
    /// Sets `chroma_log2_weight_denom` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void chroma_log2_weight_denom(MemorySegment segment, long index, byte value) { VH_chroma_log2_weight_denom.set(segment, 0L, index, value); }
    /// Sets `chroma_log2_weight_denom` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264WeightTable chroma_log2_weight_denom(byte value) { chroma_log2_weight_denom(this.segment(), 0L, value); return this; }

    /// {@return `luma_weight_l0` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment luma_weight_l0(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_luma_weight_l0, index), LAYOUT_luma_weight_l0); }
    /// {@return `luma_weight_l0` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    public static byte luma_weight_l0(MemorySegment segment, long index, long index0) { return (byte) VH_luma_weight_l0.get(segment, 0L, index, index0); }
    /// {@return `luma_weight_l0`}
    public MemorySegment luma_weight_l0() { return luma_weight_l0(this.segment(), 0L); }
    /// {@return `luma_weight_l0`}
    /// @param index0 the Index 0 of the array
    public byte luma_weight_l0(long index0) { return luma_weight_l0(this.segment(), 0L, index0); }
    /// Sets `luma_weight_l0` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void luma_weight_l0(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_luma_weight_l0, index), LAYOUT_luma_weight_l0.byteSize()); }
    /// Sets `luma_weight_l0` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    public static void luma_weight_l0(MemorySegment segment, long index, long index0, byte value) { VH_luma_weight_l0.set(segment, 0L, index, index0, value); }
    /// Sets `luma_weight_l0` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264WeightTable luma_weight_l0(MemorySegment value) { luma_weight_l0(this.segment(), 0L, value); return this; }
    /// Sets `luma_weight_l0` with the given value.
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264WeightTable luma_weight_l0(long index0, byte value) { luma_weight_l0(this.segment(), 0L, index0, value); return this; }

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
    public StdVideoEncodeH264WeightTable luma_offset_l0(MemorySegment value) { luma_offset_l0(this.segment(), 0L, value); return this; }
    /// Sets `luma_offset_l0` with the given value.
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264WeightTable luma_offset_l0(long index0, byte value) { luma_offset_l0(this.segment(), 0L, index0, value); return this; }

    /// {@return `chroma_weight_l0` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment chroma_weight_l0(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_chroma_weight_l0, index), LAYOUT_chroma_weight_l0); }
    /// {@return `chroma_weight_l0` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param index1 the Index 1 of the array
    public static byte chroma_weight_l0(MemorySegment segment, long index, long index0, long index1) { return (byte) VH_chroma_weight_l0.get(segment, 0L, index, index0, index1); }
    /// {@return `chroma_weight_l0`}
    public MemorySegment chroma_weight_l0() { return chroma_weight_l0(this.segment(), 0L); }
    /// {@return `chroma_weight_l0`}
    /// @param index0 the Index 0 of the array
    /// @param index1 the Index 1 of the array
    public byte chroma_weight_l0(long index0, long index1) { return chroma_weight_l0(this.segment(), 0L, index0, index1); }
    /// Sets `chroma_weight_l0` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void chroma_weight_l0(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_chroma_weight_l0, index), LAYOUT_chroma_weight_l0.byteSize()); }
    /// Sets `chroma_weight_l0` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param index1 the Index 1 of the array
    /// @param value the value
    public static void chroma_weight_l0(MemorySegment segment, long index, long index0, long index1, byte value) { VH_chroma_weight_l0.set(segment, 0L, index, index0, index1, value); }
    /// Sets `chroma_weight_l0` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264WeightTable chroma_weight_l0(MemorySegment value) { chroma_weight_l0(this.segment(), 0L, value); return this; }
    /// Sets `chroma_weight_l0` with the given value.
    /// @param index0 the Index 0 of the array
    /// @param index1 the Index 1 of the array
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264WeightTable chroma_weight_l0(long index0, long index1, byte value) { chroma_weight_l0(this.segment(), 0L, index0, index1, value); return this; }

    /// {@return `chroma_offset_l0` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment chroma_offset_l0(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_chroma_offset_l0, index), LAYOUT_chroma_offset_l0); }
    /// {@return `chroma_offset_l0` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param index1 the Index 1 of the array
    public static byte chroma_offset_l0(MemorySegment segment, long index, long index0, long index1) { return (byte) VH_chroma_offset_l0.get(segment, 0L, index, index0, index1); }
    /// {@return `chroma_offset_l0`}
    public MemorySegment chroma_offset_l0() { return chroma_offset_l0(this.segment(), 0L); }
    /// {@return `chroma_offset_l0`}
    /// @param index0 the Index 0 of the array
    /// @param index1 the Index 1 of the array
    public byte chroma_offset_l0(long index0, long index1) { return chroma_offset_l0(this.segment(), 0L, index0, index1); }
    /// Sets `chroma_offset_l0` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void chroma_offset_l0(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_chroma_offset_l0, index), LAYOUT_chroma_offset_l0.byteSize()); }
    /// Sets `chroma_offset_l0` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param index1 the Index 1 of the array
    /// @param value the value
    public static void chroma_offset_l0(MemorySegment segment, long index, long index0, long index1, byte value) { VH_chroma_offset_l0.set(segment, 0L, index, index0, index1, value); }
    /// Sets `chroma_offset_l0` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264WeightTable chroma_offset_l0(MemorySegment value) { chroma_offset_l0(this.segment(), 0L, value); return this; }
    /// Sets `chroma_offset_l0` with the given value.
    /// @param index0 the Index 0 of the array
    /// @param index1 the Index 1 of the array
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264WeightTable chroma_offset_l0(long index0, long index1, byte value) { chroma_offset_l0(this.segment(), 0L, index0, index1, value); return this; }

    /// {@return `luma_weight_l1` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment luma_weight_l1(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_luma_weight_l1, index), LAYOUT_luma_weight_l1); }
    /// {@return `luma_weight_l1` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    public static byte luma_weight_l1(MemorySegment segment, long index, long index0) { return (byte) VH_luma_weight_l1.get(segment, 0L, index, index0); }
    /// {@return `luma_weight_l1`}
    public MemorySegment luma_weight_l1() { return luma_weight_l1(this.segment(), 0L); }
    /// {@return `luma_weight_l1`}
    /// @param index0 the Index 0 of the array
    public byte luma_weight_l1(long index0) { return luma_weight_l1(this.segment(), 0L, index0); }
    /// Sets `luma_weight_l1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void luma_weight_l1(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_luma_weight_l1, index), LAYOUT_luma_weight_l1.byteSize()); }
    /// Sets `luma_weight_l1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    public static void luma_weight_l1(MemorySegment segment, long index, long index0, byte value) { VH_luma_weight_l1.set(segment, 0L, index, index0, value); }
    /// Sets `luma_weight_l1` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264WeightTable luma_weight_l1(MemorySegment value) { luma_weight_l1(this.segment(), 0L, value); return this; }
    /// Sets `luma_weight_l1` with the given value.
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264WeightTable luma_weight_l1(long index0, byte value) { luma_weight_l1(this.segment(), 0L, index0, value); return this; }

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
    public StdVideoEncodeH264WeightTable luma_offset_l1(MemorySegment value) { luma_offset_l1(this.segment(), 0L, value); return this; }
    /// Sets `luma_offset_l1` with the given value.
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264WeightTable luma_offset_l1(long index0, byte value) { luma_offset_l1(this.segment(), 0L, index0, value); return this; }

    /// {@return `chroma_weight_l1` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment chroma_weight_l1(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_chroma_weight_l1, index), LAYOUT_chroma_weight_l1); }
    /// {@return `chroma_weight_l1` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param index1 the Index 1 of the array
    public static byte chroma_weight_l1(MemorySegment segment, long index, long index0, long index1) { return (byte) VH_chroma_weight_l1.get(segment, 0L, index, index0, index1); }
    /// {@return `chroma_weight_l1`}
    public MemorySegment chroma_weight_l1() { return chroma_weight_l1(this.segment(), 0L); }
    /// {@return `chroma_weight_l1`}
    /// @param index0 the Index 0 of the array
    /// @param index1 the Index 1 of the array
    public byte chroma_weight_l1(long index0, long index1) { return chroma_weight_l1(this.segment(), 0L, index0, index1); }
    /// Sets `chroma_weight_l1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void chroma_weight_l1(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_chroma_weight_l1, index), LAYOUT_chroma_weight_l1.byteSize()); }
    /// Sets `chroma_weight_l1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param index1 the Index 1 of the array
    /// @param value the value
    public static void chroma_weight_l1(MemorySegment segment, long index, long index0, long index1, byte value) { VH_chroma_weight_l1.set(segment, 0L, index, index0, index1, value); }
    /// Sets `chroma_weight_l1` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264WeightTable chroma_weight_l1(MemorySegment value) { chroma_weight_l1(this.segment(), 0L, value); return this; }
    /// Sets `chroma_weight_l1` with the given value.
    /// @param index0 the Index 0 of the array
    /// @param index1 the Index 1 of the array
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264WeightTable chroma_weight_l1(long index0, long index1, byte value) { chroma_weight_l1(this.segment(), 0L, index0, index1, value); return this; }

    /// {@return `chroma_offset_l1` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment chroma_offset_l1(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_chroma_offset_l1, index), LAYOUT_chroma_offset_l1); }
    /// {@return `chroma_offset_l1` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param index1 the Index 1 of the array
    public static byte chroma_offset_l1(MemorySegment segment, long index, long index0, long index1) { return (byte) VH_chroma_offset_l1.get(segment, 0L, index, index0, index1); }
    /// {@return `chroma_offset_l1`}
    public MemorySegment chroma_offset_l1() { return chroma_offset_l1(this.segment(), 0L); }
    /// {@return `chroma_offset_l1`}
    /// @param index0 the Index 0 of the array
    /// @param index1 the Index 1 of the array
    public byte chroma_offset_l1(long index0, long index1) { return chroma_offset_l1(this.segment(), 0L, index0, index1); }
    /// Sets `chroma_offset_l1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void chroma_offset_l1(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_chroma_offset_l1, index), LAYOUT_chroma_offset_l1.byteSize()); }
    /// Sets `chroma_offset_l1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param index1 the Index 1 of the array
    /// @param value the value
    public static void chroma_offset_l1(MemorySegment segment, long index, long index0, long index1, byte value) { VH_chroma_offset_l1.set(segment, 0L, index, index0, index1, value); }
    /// Sets `chroma_offset_l1` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264WeightTable chroma_offset_l1(MemorySegment value) { chroma_offset_l1(this.segment(), 0L, value); return this; }
    /// Sets `chroma_offset_l1` with the given value.
    /// @param index0 the Index 0 of the array
    /// @param index1 the Index 1 of the array
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264WeightTable chroma_offset_l1(long index0, long index1, byte value) { chroma_offset_l1(this.segment(), 0L, index0, index1, value); return this; }

    /// A buffer of [StdVideoEncodeH264WeightTable].
    public static final class Buffer extends StdVideoEncodeH264WeightTable {
        private final long elementCount;

        /// Creates `StdVideoEncodeH264WeightTable.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `StdVideoEncodeH264WeightTable`.
        /// @param index the index of the struct buffer
        /// @return the slice of `StdVideoEncodeH264WeightTable`
        public StdVideoEncodeH264WeightTable asSlice(long index) { return new StdVideoEncodeH264WeightTable(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `StdVideoEncodeH264WeightTable`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `StdVideoEncodeH264WeightTable`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `flags` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment flagsAt(long index) { return flags(this.segment(), index); }
        /// Sets `flags` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer flagsAt(long index, MemorySegment value) { flags(this.segment(), index, value); return this; }

        /// {@return `luma_log2_weight_denom` at the given index}
        /// @param index the index of the struct buffer
        public byte luma_log2_weight_denomAt(long index) { return luma_log2_weight_denom(this.segment(), index); }
        /// Sets `luma_log2_weight_denom` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer luma_log2_weight_denomAt(long index, byte value) { luma_log2_weight_denom(this.segment(), index, value); return this; }

        /// {@return `chroma_log2_weight_denom` at the given index}
        /// @param index the index of the struct buffer
        public byte chroma_log2_weight_denomAt(long index) { return chroma_log2_weight_denom(this.segment(), index); }
        /// Sets `chroma_log2_weight_denom` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer chroma_log2_weight_denomAt(long index, byte value) { chroma_log2_weight_denom(this.segment(), index, value); return this; }

        /// {@return `luma_weight_l0` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment luma_weight_l0At(long index) { return luma_weight_l0(this.segment(), index); }
        /// {@return `luma_weight_l0` at the given index}
        /// @param index the index of the struct buffer
        /// @param index0 the Index 0 of the array
        public byte luma_weight_l0At(long index, long index0) { return luma_weight_l0(this.segment(), index, index0); }
        /// Sets `luma_weight_l0` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer luma_weight_l0At(long index, MemorySegment value) { luma_weight_l0(this.segment(), index, value); return this; }
        /// Sets `luma_weight_l0` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param index0 the Index 0 of the array
        /// @param value the value
        /// @return `this`
        public Buffer luma_weight_l0At(long index, long index0, byte value) { luma_weight_l0(this.segment(), index, index0, value); return this; }

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

        /// {@return `chroma_weight_l0` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment chroma_weight_l0At(long index) { return chroma_weight_l0(this.segment(), index); }
        /// {@return `chroma_weight_l0` at the given index}
        /// @param index the index of the struct buffer
        /// @param index0 the Index 0 of the array
        /// @param index1 the Index 1 of the array
        public byte chroma_weight_l0At(long index, long index0, long index1) { return chroma_weight_l0(this.segment(), index, index0, index1); }
        /// Sets `chroma_weight_l0` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer chroma_weight_l0At(long index, MemorySegment value) { chroma_weight_l0(this.segment(), index, value); return this; }
        /// Sets `chroma_weight_l0` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param index0 the Index 0 of the array
        /// @param index1 the Index 1 of the array
        /// @param value the value
        /// @return `this`
        public Buffer chroma_weight_l0At(long index, long index0, long index1, byte value) { chroma_weight_l0(this.segment(), index, index0, index1, value); return this; }

        /// {@return `chroma_offset_l0` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment chroma_offset_l0At(long index) { return chroma_offset_l0(this.segment(), index); }
        /// {@return `chroma_offset_l0` at the given index}
        /// @param index the index of the struct buffer
        /// @param index0 the Index 0 of the array
        /// @param index1 the Index 1 of the array
        public byte chroma_offset_l0At(long index, long index0, long index1) { return chroma_offset_l0(this.segment(), index, index0, index1); }
        /// Sets `chroma_offset_l0` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer chroma_offset_l0At(long index, MemorySegment value) { chroma_offset_l0(this.segment(), index, value); return this; }
        /// Sets `chroma_offset_l0` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param index0 the Index 0 of the array
        /// @param index1 the Index 1 of the array
        /// @param value the value
        /// @return `this`
        public Buffer chroma_offset_l0At(long index, long index0, long index1, byte value) { chroma_offset_l0(this.segment(), index, index0, index1, value); return this; }

        /// {@return `luma_weight_l1` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment luma_weight_l1At(long index) { return luma_weight_l1(this.segment(), index); }
        /// {@return `luma_weight_l1` at the given index}
        /// @param index the index of the struct buffer
        /// @param index0 the Index 0 of the array
        public byte luma_weight_l1At(long index, long index0) { return luma_weight_l1(this.segment(), index, index0); }
        /// Sets `luma_weight_l1` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer luma_weight_l1At(long index, MemorySegment value) { luma_weight_l1(this.segment(), index, value); return this; }
        /// Sets `luma_weight_l1` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param index0 the Index 0 of the array
        /// @param value the value
        /// @return `this`
        public Buffer luma_weight_l1At(long index, long index0, byte value) { luma_weight_l1(this.segment(), index, index0, value); return this; }

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

        /// {@return `chroma_weight_l1` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment chroma_weight_l1At(long index) { return chroma_weight_l1(this.segment(), index); }
        /// {@return `chroma_weight_l1` at the given index}
        /// @param index the index of the struct buffer
        /// @param index0 the Index 0 of the array
        /// @param index1 the Index 1 of the array
        public byte chroma_weight_l1At(long index, long index0, long index1) { return chroma_weight_l1(this.segment(), index, index0, index1); }
        /// Sets `chroma_weight_l1` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer chroma_weight_l1At(long index, MemorySegment value) { chroma_weight_l1(this.segment(), index, value); return this; }
        /// Sets `chroma_weight_l1` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param index0 the Index 0 of the array
        /// @param index1 the Index 1 of the array
        /// @param value the value
        /// @return `this`
        public Buffer chroma_weight_l1At(long index, long index0, long index1, byte value) { chroma_weight_l1(this.segment(), index, index0, index1, value); return this; }

        /// {@return `chroma_offset_l1` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment chroma_offset_l1At(long index) { return chroma_offset_l1(this.segment(), index); }
        /// {@return `chroma_offset_l1` at the given index}
        /// @param index the index of the struct buffer
        /// @param index0 the Index 0 of the array
        /// @param index1 the Index 1 of the array
        public byte chroma_offset_l1At(long index, long index0, long index1) { return chroma_offset_l1(this.segment(), index, index0, index1); }
        /// Sets `chroma_offset_l1` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer chroma_offset_l1At(long index, MemorySegment value) { chroma_offset_l1(this.segment(), index, value); return this; }
        /// Sets `chroma_offset_l1` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param index0 the Index 0 of the array
        /// @param index1 the Index 1 of the array
        /// @param value the value
        /// @return `this`
        public Buffer chroma_offset_l1At(long index, long index0, long index1, byte value) { chroma_offset_l1(this.segment(), index, index0, index1, value); return this; }

    }
}
