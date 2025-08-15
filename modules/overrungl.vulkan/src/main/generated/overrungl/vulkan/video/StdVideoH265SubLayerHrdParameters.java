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
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `StdVideoH265SubLayerHrdParameters`.
/// ## Layout
/// ```
/// struct StdVideoH265SubLayerHrdParameters {
///     uint32_t bit_rate_value_minus1[32];
///     uint32_t cpb_size_value_minus1[32];
///     uint32_t cpb_size_du_value_minus1[32];
///     uint32_t bit_rate_du_value_minus1[32];
///     uint32_t cbr_flag;
/// };
/// ```
public final class StdVideoH265SubLayerHrdParameters extends GroupType {
    /// The struct layout of `StdVideoH265SubLayerHrdParameters`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        MemoryLayout.sequenceLayout(32, ValueLayout.JAVA_INT).withName("bit_rate_value_minus1"),
        MemoryLayout.sequenceLayout(32, ValueLayout.JAVA_INT).withName("cpb_size_value_minus1"),
        MemoryLayout.sequenceLayout(32, ValueLayout.JAVA_INT).withName("cpb_size_du_value_minus1"),
        MemoryLayout.sequenceLayout(32, ValueLayout.JAVA_INT).withName("bit_rate_du_value_minus1"),
        ValueLayout.JAVA_INT.withName("cbr_flag")
    );
    /// The byte offset of `bit_rate_value_minus1`.
    public static final long OFFSET_bit_rate_value_minus1 = LAYOUT.byteOffset(PathElement.groupElement("bit_rate_value_minus1"));
    /// The memory layout of `bit_rate_value_minus1`.
    public static final MemoryLayout LAYOUT_bit_rate_value_minus1 = LAYOUT.select(PathElement.groupElement("bit_rate_value_minus1"));
    /// The [VarHandle] of `bit_rate_value_minus1` of type `(MemorySegment base, long baseOffset, long index, long index0)MemorySegment`.
    public static final VarHandle VH_bit_rate_value_minus1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("bit_rate_value_minus1"), PathElement.sequenceElement());
    /// The byte offset of `cpb_size_value_minus1`.
    public static final long OFFSET_cpb_size_value_minus1 = LAYOUT.byteOffset(PathElement.groupElement("cpb_size_value_minus1"));
    /// The memory layout of `cpb_size_value_minus1`.
    public static final MemoryLayout LAYOUT_cpb_size_value_minus1 = LAYOUT.select(PathElement.groupElement("cpb_size_value_minus1"));
    /// The [VarHandle] of `cpb_size_value_minus1` of type `(MemorySegment base, long baseOffset, long index, long index0)MemorySegment`.
    public static final VarHandle VH_cpb_size_value_minus1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("cpb_size_value_minus1"), PathElement.sequenceElement());
    /// The byte offset of `cpb_size_du_value_minus1`.
    public static final long OFFSET_cpb_size_du_value_minus1 = LAYOUT.byteOffset(PathElement.groupElement("cpb_size_du_value_minus1"));
    /// The memory layout of `cpb_size_du_value_minus1`.
    public static final MemoryLayout LAYOUT_cpb_size_du_value_minus1 = LAYOUT.select(PathElement.groupElement("cpb_size_du_value_minus1"));
    /// The [VarHandle] of `cpb_size_du_value_minus1` of type `(MemorySegment base, long baseOffset, long index, long index0)MemorySegment`.
    public static final VarHandle VH_cpb_size_du_value_minus1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("cpb_size_du_value_minus1"), PathElement.sequenceElement());
    /// The byte offset of `bit_rate_du_value_minus1`.
    public static final long OFFSET_bit_rate_du_value_minus1 = LAYOUT.byteOffset(PathElement.groupElement("bit_rate_du_value_minus1"));
    /// The memory layout of `bit_rate_du_value_minus1`.
    public static final MemoryLayout LAYOUT_bit_rate_du_value_minus1 = LAYOUT.select(PathElement.groupElement("bit_rate_du_value_minus1"));
    /// The [VarHandle] of `bit_rate_du_value_minus1` of type `(MemorySegment base, long baseOffset, long index, long index0)MemorySegment`.
    public static final VarHandle VH_bit_rate_du_value_minus1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("bit_rate_du_value_minus1"), PathElement.sequenceElement());
    /// The byte offset of `cbr_flag`.
    public static final long OFFSET_cbr_flag = LAYOUT.byteOffset(PathElement.groupElement("cbr_flag"));
    /// The memory layout of `cbr_flag`.
    public static final MemoryLayout LAYOUT_cbr_flag = LAYOUT.select(PathElement.groupElement("cbr_flag"));
    /// The [VarHandle] of `cbr_flag` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_cbr_flag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("cbr_flag"));

    /// Creates `StdVideoH265SubLayerHrdParameters` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public StdVideoH265SubLayerHrdParameters(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `StdVideoH265SubLayerHrdParameters` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoH265SubLayerHrdParameters of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoH265SubLayerHrdParameters(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `StdVideoH265SubLayerHrdParameters` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoH265SubLayerHrdParameters ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoH265SubLayerHrdParameters(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `StdVideoH265SubLayerHrdParameters` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoH265SubLayerHrdParameters ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoH265SubLayerHrdParameters(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `StdVideoH265SubLayerHrdParameters` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoH265SubLayerHrdParameters`
    public static StdVideoH265SubLayerHrdParameters alloc(SegmentAllocator allocator) { return new StdVideoH265SubLayerHrdParameters(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `StdVideoH265SubLayerHrdParameters` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `StdVideoH265SubLayerHrdParameters`
    public static StdVideoH265SubLayerHrdParameters alloc(SegmentAllocator allocator, long count) { return new StdVideoH265SubLayerHrdParameters(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public StdVideoH265SubLayerHrdParameters copyFrom(StdVideoH265SubLayerHrdParameters src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public StdVideoH265SubLayerHrdParameters reinterpret(long count) { return new StdVideoH265SubLayerHrdParameters(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// {@return `bit_rate_value_minus1` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment bit_rate_value_minus1(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_bit_rate_value_minus1, index), LAYOUT_bit_rate_value_minus1); }
    /// {@return `bit_rate_value_minus1` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    public static int bit_rate_value_minus1(MemorySegment segment, long index, long index0) { return (int) VH_bit_rate_value_minus1.get(segment, 0L, index, index0); }
    /// {@return `bit_rate_value_minus1`}
    public MemorySegment bit_rate_value_minus1() { return bit_rate_value_minus1(this.segment(), 0L); }
    /// {@return `bit_rate_value_minus1`}
    /// @param index0 the Index 0 of the array
    public int bit_rate_value_minus1(long index0) { return bit_rate_value_minus1(this.segment(), 0L, index0); }
    /// Sets `bit_rate_value_minus1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void bit_rate_value_minus1(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_bit_rate_value_minus1, index), LAYOUT_bit_rate_value_minus1.byteSize()); }
    /// Sets `bit_rate_value_minus1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    public static void bit_rate_value_minus1(MemorySegment segment, long index, long index0, int value) { VH_bit_rate_value_minus1.set(segment, 0L, index, index0, value); }
    /// Sets `bit_rate_value_minus1` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265SubLayerHrdParameters bit_rate_value_minus1(MemorySegment value) { bit_rate_value_minus1(this.segment(), 0L, value); return this; }
    /// Sets `bit_rate_value_minus1` with the given value.
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public StdVideoH265SubLayerHrdParameters bit_rate_value_minus1(long index0, int value) { bit_rate_value_minus1(this.segment(), 0L, index0, value); return this; }

    /// {@return `cpb_size_value_minus1` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment cpb_size_value_minus1(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_cpb_size_value_minus1, index), LAYOUT_cpb_size_value_minus1); }
    /// {@return `cpb_size_value_minus1` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    public static int cpb_size_value_minus1(MemorySegment segment, long index, long index0) { return (int) VH_cpb_size_value_minus1.get(segment, 0L, index, index0); }
    /// {@return `cpb_size_value_minus1`}
    public MemorySegment cpb_size_value_minus1() { return cpb_size_value_minus1(this.segment(), 0L); }
    /// {@return `cpb_size_value_minus1`}
    /// @param index0 the Index 0 of the array
    public int cpb_size_value_minus1(long index0) { return cpb_size_value_minus1(this.segment(), 0L, index0); }
    /// Sets `cpb_size_value_minus1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void cpb_size_value_minus1(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_cpb_size_value_minus1, index), LAYOUT_cpb_size_value_minus1.byteSize()); }
    /// Sets `cpb_size_value_minus1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    public static void cpb_size_value_minus1(MemorySegment segment, long index, long index0, int value) { VH_cpb_size_value_minus1.set(segment, 0L, index, index0, value); }
    /// Sets `cpb_size_value_minus1` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265SubLayerHrdParameters cpb_size_value_minus1(MemorySegment value) { cpb_size_value_minus1(this.segment(), 0L, value); return this; }
    /// Sets `cpb_size_value_minus1` with the given value.
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public StdVideoH265SubLayerHrdParameters cpb_size_value_minus1(long index0, int value) { cpb_size_value_minus1(this.segment(), 0L, index0, value); return this; }

    /// {@return `cpb_size_du_value_minus1` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment cpb_size_du_value_minus1(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_cpb_size_du_value_minus1, index), LAYOUT_cpb_size_du_value_minus1); }
    /// {@return `cpb_size_du_value_minus1` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    public static int cpb_size_du_value_minus1(MemorySegment segment, long index, long index0) { return (int) VH_cpb_size_du_value_minus1.get(segment, 0L, index, index0); }
    /// {@return `cpb_size_du_value_minus1`}
    public MemorySegment cpb_size_du_value_minus1() { return cpb_size_du_value_minus1(this.segment(), 0L); }
    /// {@return `cpb_size_du_value_minus1`}
    /// @param index0 the Index 0 of the array
    public int cpb_size_du_value_minus1(long index0) { return cpb_size_du_value_minus1(this.segment(), 0L, index0); }
    /// Sets `cpb_size_du_value_minus1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void cpb_size_du_value_minus1(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_cpb_size_du_value_minus1, index), LAYOUT_cpb_size_du_value_minus1.byteSize()); }
    /// Sets `cpb_size_du_value_minus1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    public static void cpb_size_du_value_minus1(MemorySegment segment, long index, long index0, int value) { VH_cpb_size_du_value_minus1.set(segment, 0L, index, index0, value); }
    /// Sets `cpb_size_du_value_minus1` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265SubLayerHrdParameters cpb_size_du_value_minus1(MemorySegment value) { cpb_size_du_value_minus1(this.segment(), 0L, value); return this; }
    /// Sets `cpb_size_du_value_minus1` with the given value.
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public StdVideoH265SubLayerHrdParameters cpb_size_du_value_minus1(long index0, int value) { cpb_size_du_value_minus1(this.segment(), 0L, index0, value); return this; }

    /// {@return `bit_rate_du_value_minus1` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment bit_rate_du_value_minus1(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_bit_rate_du_value_minus1, index), LAYOUT_bit_rate_du_value_minus1); }
    /// {@return `bit_rate_du_value_minus1` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    public static int bit_rate_du_value_minus1(MemorySegment segment, long index, long index0) { return (int) VH_bit_rate_du_value_minus1.get(segment, 0L, index, index0); }
    /// {@return `bit_rate_du_value_minus1`}
    public MemorySegment bit_rate_du_value_minus1() { return bit_rate_du_value_minus1(this.segment(), 0L); }
    /// {@return `bit_rate_du_value_minus1`}
    /// @param index0 the Index 0 of the array
    public int bit_rate_du_value_minus1(long index0) { return bit_rate_du_value_minus1(this.segment(), 0L, index0); }
    /// Sets `bit_rate_du_value_minus1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void bit_rate_du_value_minus1(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_bit_rate_du_value_minus1, index), LAYOUT_bit_rate_du_value_minus1.byteSize()); }
    /// Sets `bit_rate_du_value_minus1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    public static void bit_rate_du_value_minus1(MemorySegment segment, long index, long index0, int value) { VH_bit_rate_du_value_minus1.set(segment, 0L, index, index0, value); }
    /// Sets `bit_rate_du_value_minus1` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265SubLayerHrdParameters bit_rate_du_value_minus1(MemorySegment value) { bit_rate_du_value_minus1(this.segment(), 0L, value); return this; }
    /// Sets `bit_rate_du_value_minus1` with the given value.
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public StdVideoH265SubLayerHrdParameters bit_rate_du_value_minus1(long index0, int value) { bit_rate_du_value_minus1(this.segment(), 0L, index0, value); return this; }

    /// {@return `cbr_flag` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int cbr_flag(MemorySegment segment, long index) { return (int) VH_cbr_flag.get(segment, 0L, index); }
    /// {@return `cbr_flag`}
    public int cbr_flag() { return cbr_flag(this.segment(), 0L); }
    /// Sets `cbr_flag` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void cbr_flag(MemorySegment segment, long index, int value) { VH_cbr_flag.set(segment, 0L, index, value); }
    /// Sets `cbr_flag` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265SubLayerHrdParameters cbr_flag(int value) { cbr_flag(this.segment(), 0L, value); return this; }

    /// Creates a slice of `StdVideoH265SubLayerHrdParameters`.
    /// @param index the index of the struct buffer
    /// @return the slice of `StdVideoH265SubLayerHrdParameters`
    public StdVideoH265SubLayerHrdParameters asSlice(long index) { return new StdVideoH265SubLayerHrdParameters(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `StdVideoH265SubLayerHrdParameters`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `StdVideoH265SubLayerHrdParameters`
    public StdVideoH265SubLayerHrdParameters asSlice(long index, long count) { return new StdVideoH265SubLayerHrdParameters(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `StdVideoH265SubLayerHrdParameters` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public StdVideoH265SubLayerHrdParameters at(long index, Consumer<StdVideoH265SubLayerHrdParameters> func) { func.accept(asSlice(index)); return this; }

    /// {@return `bit_rate_value_minus1` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment bit_rate_value_minus1At(long index) { return bit_rate_value_minus1(this.segment(), index); }
    /// {@return `bit_rate_value_minus1` at the given index}
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
        public int bit_rate_value_minus1At(long index, long index0) { return bit_rate_value_minus1(this.segment(), index, index0); }
    /// Sets `bit_rate_value_minus1` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoH265SubLayerHrdParameters bit_rate_value_minus1At(long index, MemorySegment value) { bit_rate_value_minus1(this.segment(), index, value); return this; }
    /// Sets `bit_rate_value_minus1` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public StdVideoH265SubLayerHrdParameters bit_rate_value_minus1At(long index, long index0, int value) { bit_rate_value_minus1(this.segment(), index, index0, value); return this; }

    /// {@return `cpb_size_value_minus1` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment cpb_size_value_minus1At(long index) { return cpb_size_value_minus1(this.segment(), index); }
    /// {@return `cpb_size_value_minus1` at the given index}
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
        public int cpb_size_value_minus1At(long index, long index0) { return cpb_size_value_minus1(this.segment(), index, index0); }
    /// Sets `cpb_size_value_minus1` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoH265SubLayerHrdParameters cpb_size_value_minus1At(long index, MemorySegment value) { cpb_size_value_minus1(this.segment(), index, value); return this; }
    /// Sets `cpb_size_value_minus1` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public StdVideoH265SubLayerHrdParameters cpb_size_value_minus1At(long index, long index0, int value) { cpb_size_value_minus1(this.segment(), index, index0, value); return this; }

    /// {@return `cpb_size_du_value_minus1` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment cpb_size_du_value_minus1At(long index) { return cpb_size_du_value_minus1(this.segment(), index); }
    /// {@return `cpb_size_du_value_minus1` at the given index}
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
        public int cpb_size_du_value_minus1At(long index, long index0) { return cpb_size_du_value_minus1(this.segment(), index, index0); }
    /// Sets `cpb_size_du_value_minus1` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoH265SubLayerHrdParameters cpb_size_du_value_minus1At(long index, MemorySegment value) { cpb_size_du_value_minus1(this.segment(), index, value); return this; }
    /// Sets `cpb_size_du_value_minus1` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public StdVideoH265SubLayerHrdParameters cpb_size_du_value_minus1At(long index, long index0, int value) { cpb_size_du_value_minus1(this.segment(), index, index0, value); return this; }

    /// {@return `bit_rate_du_value_minus1` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment bit_rate_du_value_minus1At(long index) { return bit_rate_du_value_minus1(this.segment(), index); }
    /// {@return `bit_rate_du_value_minus1` at the given index}
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
        public int bit_rate_du_value_minus1At(long index, long index0) { return bit_rate_du_value_minus1(this.segment(), index, index0); }
    /// Sets `bit_rate_du_value_minus1` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoH265SubLayerHrdParameters bit_rate_du_value_minus1At(long index, MemorySegment value) { bit_rate_du_value_minus1(this.segment(), index, value); return this; }
    /// Sets `bit_rate_du_value_minus1` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public StdVideoH265SubLayerHrdParameters bit_rate_du_value_minus1At(long index, long index0, int value) { bit_rate_du_value_minus1(this.segment(), index, index0, value); return this; }

    /// {@return `cbr_flag` at the given index}
    /// @param index the index of the struct buffer
    public int cbr_flagAt(long index) { return cbr_flag(this.segment(), index); }
    /// Sets `cbr_flag` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoH265SubLayerHrdParameters cbr_flagAt(long index, int value) { cbr_flag(this.segment(), index, value); return this; }

}
