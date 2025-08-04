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
/// struct StdVideoH264ScalingLists {
///     uint16_t scaling_list_present_mask;
///     uint16_t use_default_scaling_matrix_mask;
///     uint8_t ScalingList4x4[6][16];
///     uint8_t ScalingList8x8[6][64];
/// };
/// ```
public final class StdVideoH264ScalingLists extends GroupType {
    /// The struct layout of `StdVideoH264ScalingLists`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_SHORT.withName("scaling_list_present_mask"),
        ValueLayout.JAVA_SHORT.withName("use_default_scaling_matrix_mask"),
        MemoryLayout.sequenceLayout(16, MemoryLayout.sequenceLayout(6, ValueLayout.JAVA_BYTE)).withName("ScalingList4x4"),
        MemoryLayout.sequenceLayout(64, MemoryLayout.sequenceLayout(6, ValueLayout.JAVA_BYTE)).withName("ScalingList8x8")
    );
    /// The byte offset of `scaling_list_present_mask`.
    public static final long OFFSET_scaling_list_present_mask = LAYOUT.byteOffset(PathElement.groupElement("scaling_list_present_mask"));
    /// The memory layout of `scaling_list_present_mask`.
    public static final MemoryLayout LAYOUT_scaling_list_present_mask = LAYOUT.select(PathElement.groupElement("scaling_list_present_mask"));
    /// The [VarHandle] of `scaling_list_present_mask` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_scaling_list_present_mask = LAYOUT.arrayElementVarHandle(PathElement.groupElement("scaling_list_present_mask"));
    /// The byte offset of `use_default_scaling_matrix_mask`.
    public static final long OFFSET_use_default_scaling_matrix_mask = LAYOUT.byteOffset(PathElement.groupElement("use_default_scaling_matrix_mask"));
    /// The memory layout of `use_default_scaling_matrix_mask`.
    public static final MemoryLayout LAYOUT_use_default_scaling_matrix_mask = LAYOUT.select(PathElement.groupElement("use_default_scaling_matrix_mask"));
    /// The [VarHandle] of `use_default_scaling_matrix_mask` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_use_default_scaling_matrix_mask = LAYOUT.arrayElementVarHandle(PathElement.groupElement("use_default_scaling_matrix_mask"));
    /// The byte offset of `ScalingList4x4`.
    public static final long OFFSET_ScalingList4x4 = LAYOUT.byteOffset(PathElement.groupElement("ScalingList4x4"));
    /// The memory layout of `ScalingList4x4`.
    public static final MemoryLayout LAYOUT_ScalingList4x4 = LAYOUT.select(PathElement.groupElement("ScalingList4x4"));
    /// The [VarHandle] of `ScalingList4x4` of type `(MemorySegment base, long baseOffset, long index, long index0, long index1)MemorySegment`.
    public static final VarHandle VH_ScalingList4x4 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("ScalingList4x4"), PathElement.sequenceElement(), PathElement.sequenceElement());
    /// The byte offset of `ScalingList8x8`.
    public static final long OFFSET_ScalingList8x8 = LAYOUT.byteOffset(PathElement.groupElement("ScalingList8x8"));
    /// The memory layout of `ScalingList8x8`.
    public static final MemoryLayout LAYOUT_ScalingList8x8 = LAYOUT.select(PathElement.groupElement("ScalingList8x8"));
    /// The [VarHandle] of `ScalingList8x8` of type `(MemorySegment base, long baseOffset, long index, long index0, long index1)MemorySegment`.
    public static final VarHandle VH_ScalingList8x8 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("ScalingList8x8"), PathElement.sequenceElement(), PathElement.sequenceElement());

    /// Creates `StdVideoH264ScalingLists` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public StdVideoH264ScalingLists(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `StdVideoH264ScalingLists` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoH264ScalingLists of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoH264ScalingLists(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `StdVideoH264ScalingLists` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoH264ScalingLists ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoH264ScalingLists(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `StdVideoH264ScalingLists` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoH264ScalingLists ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoH264ScalingLists(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `StdVideoH264ScalingLists` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoH264ScalingLists`
    public static StdVideoH264ScalingLists alloc(SegmentAllocator allocator) { return new StdVideoH264ScalingLists(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `StdVideoH264ScalingLists` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `StdVideoH264ScalingLists`
    public static StdVideoH264ScalingLists alloc(SegmentAllocator allocator, long count) { return new StdVideoH264ScalingLists(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public StdVideoH264ScalingLists copyFrom(StdVideoH264ScalingLists src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public StdVideoH264ScalingLists reinterpret(long count) { return new StdVideoH264ScalingLists(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// {@return `scaling_list_present_mask` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static short scaling_list_present_mask(MemorySegment segment, long index) { return (short) VH_scaling_list_present_mask.get(segment, 0L, index); }
    /// {@return `scaling_list_present_mask`}
    public short scaling_list_present_mask() { return scaling_list_present_mask(this.segment(), 0L); }
    /// Sets `scaling_list_present_mask` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void scaling_list_present_mask(MemorySegment segment, long index, short value) { VH_scaling_list_present_mask.set(segment, 0L, index, value); }
    /// Sets `scaling_list_present_mask` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH264ScalingLists scaling_list_present_mask(short value) { scaling_list_present_mask(this.segment(), 0L, value); return this; }

    /// {@return `use_default_scaling_matrix_mask` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static short use_default_scaling_matrix_mask(MemorySegment segment, long index) { return (short) VH_use_default_scaling_matrix_mask.get(segment, 0L, index); }
    /// {@return `use_default_scaling_matrix_mask`}
    public short use_default_scaling_matrix_mask() { return use_default_scaling_matrix_mask(this.segment(), 0L); }
    /// Sets `use_default_scaling_matrix_mask` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void use_default_scaling_matrix_mask(MemorySegment segment, long index, short value) { VH_use_default_scaling_matrix_mask.set(segment, 0L, index, value); }
    /// Sets `use_default_scaling_matrix_mask` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH264ScalingLists use_default_scaling_matrix_mask(short value) { use_default_scaling_matrix_mask(this.segment(), 0L, value); return this; }

    /// {@return `ScalingList4x4` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment ScalingList4x4(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_ScalingList4x4, index), LAYOUT_ScalingList4x4); }
    /// {@return `ScalingList4x4` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param index1 the Index 1 of the array
    public static byte ScalingList4x4(MemorySegment segment, long index, long index0, long index1) { return (byte) VH_ScalingList4x4.get(segment, 0L, index, index0, index1); }
    /// {@return `ScalingList4x4`}
    public MemorySegment ScalingList4x4() { return ScalingList4x4(this.segment(), 0L); }
    /// {@return `ScalingList4x4`}
    /// @param index0 the Index 0 of the array
    /// @param index1 the Index 1 of the array
    public byte ScalingList4x4(long index0, long index1) { return ScalingList4x4(this.segment(), 0L, index0, index1); }
    /// Sets `ScalingList4x4` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void ScalingList4x4(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_ScalingList4x4, index), LAYOUT_ScalingList4x4.byteSize()); }
    /// Sets `ScalingList4x4` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param index1 the Index 1 of the array
    /// @param value the value
    public static void ScalingList4x4(MemorySegment segment, long index, long index0, long index1, byte value) { VH_ScalingList4x4.set(segment, 0L, index, index0, index1, value); }
    /// Sets `ScalingList4x4` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH264ScalingLists ScalingList4x4(MemorySegment value) { ScalingList4x4(this.segment(), 0L, value); return this; }
    /// Sets `ScalingList4x4` with the given value.
    /// @param index0 the Index 0 of the array
    /// @param index1 the Index 1 of the array
    /// @param value the value
    /// @return `this`
    public StdVideoH264ScalingLists ScalingList4x4(long index0, long index1, byte value) { ScalingList4x4(this.segment(), 0L, index0, index1, value); return this; }

    /// {@return `ScalingList8x8` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment ScalingList8x8(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_ScalingList8x8, index), LAYOUT_ScalingList8x8); }
    /// {@return `ScalingList8x8` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param index1 the Index 1 of the array
    public static byte ScalingList8x8(MemorySegment segment, long index, long index0, long index1) { return (byte) VH_ScalingList8x8.get(segment, 0L, index, index0, index1); }
    /// {@return `ScalingList8x8`}
    public MemorySegment ScalingList8x8() { return ScalingList8x8(this.segment(), 0L); }
    /// {@return `ScalingList8x8`}
    /// @param index0 the Index 0 of the array
    /// @param index1 the Index 1 of the array
    public byte ScalingList8x8(long index0, long index1) { return ScalingList8x8(this.segment(), 0L, index0, index1); }
    /// Sets `ScalingList8x8` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void ScalingList8x8(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_ScalingList8x8, index), LAYOUT_ScalingList8x8.byteSize()); }
    /// Sets `ScalingList8x8` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param index1 the Index 1 of the array
    /// @param value the value
    public static void ScalingList8x8(MemorySegment segment, long index, long index0, long index1, byte value) { VH_ScalingList8x8.set(segment, 0L, index, index0, index1, value); }
    /// Sets `ScalingList8x8` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH264ScalingLists ScalingList8x8(MemorySegment value) { ScalingList8x8(this.segment(), 0L, value); return this; }
    /// Sets `ScalingList8x8` with the given value.
    /// @param index0 the Index 0 of the array
    /// @param index1 the Index 1 of the array
    /// @param value the value
    /// @return `this`
    public StdVideoH264ScalingLists ScalingList8x8(long index0, long index1, byte value) { ScalingList8x8(this.segment(), 0L, index0, index1, value); return this; }

    /// Creates a slice of `StdVideoH264ScalingLists`.
    /// @param index the index of the struct buffer
    /// @return the slice of `StdVideoH264ScalingLists`
    public StdVideoH264ScalingLists asSlice(long index) { return new StdVideoH264ScalingLists(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `StdVideoH264ScalingLists`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `StdVideoH264ScalingLists`
    public StdVideoH264ScalingLists asSlice(long index, long count) { return new StdVideoH264ScalingLists(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `StdVideoH264ScalingLists` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public StdVideoH264ScalingLists at(long index, Consumer<StdVideoH264ScalingLists> func) { func.accept(asSlice(index)); return this; }

    /// {@return `scaling_list_present_mask` at the given index}
    /// @param index the index of the struct buffer
    public short scaling_list_present_maskAt(long index) { return scaling_list_present_mask(this.segment(), index); }
    /// Sets `scaling_list_present_mask` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoH264ScalingLists scaling_list_present_maskAt(long index, short value) { scaling_list_present_mask(this.segment(), index, value); return this; }

    /// {@return `use_default_scaling_matrix_mask` at the given index}
    /// @param index the index of the struct buffer
    public short use_default_scaling_matrix_maskAt(long index) { return use_default_scaling_matrix_mask(this.segment(), index); }
    /// Sets `use_default_scaling_matrix_mask` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoH264ScalingLists use_default_scaling_matrix_maskAt(long index, short value) { use_default_scaling_matrix_mask(this.segment(), index, value); return this; }

    /// {@return `ScalingList4x4` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment ScalingList4x4At(long index) { return ScalingList4x4(this.segment(), index); }
    /// {@return `ScalingList4x4` at the given index}
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param index1 the Index 1 of the array
        public byte ScalingList4x4At(long index, long index0, long index1) { return ScalingList4x4(this.segment(), index, index0, index1); }
    /// Sets `ScalingList4x4` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoH264ScalingLists ScalingList4x4At(long index, MemorySegment value) { ScalingList4x4(this.segment(), index, value); return this; }
    /// Sets `ScalingList4x4` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param index1 the Index 1 of the array
    /// @param value the value
    /// @return `this`
    public StdVideoH264ScalingLists ScalingList4x4At(long index, long index0, long index1, byte value) { ScalingList4x4(this.segment(), index, index0, index1, value); return this; }

    /// {@return `ScalingList8x8` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment ScalingList8x8At(long index) { return ScalingList8x8(this.segment(), index); }
    /// {@return `ScalingList8x8` at the given index}
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param index1 the Index 1 of the array
        public byte ScalingList8x8At(long index, long index0, long index1) { return ScalingList8x8(this.segment(), index, index0, index1); }
    /// Sets `ScalingList8x8` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoH264ScalingLists ScalingList8x8At(long index, MemorySegment value) { ScalingList8x8(this.segment(), index, value); return this; }
    /// Sets `ScalingList8x8` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param index1 the Index 1 of the array
    /// @param value the value
    /// @return `this`
    public StdVideoH264ScalingLists ScalingList8x8At(long index, long index0, long index1, byte value) { ScalingList8x8(this.segment(), index, index0, index1, value); return this; }

}
