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
/// struct StdVideoH265ScalingLists {
///     uint8_t ScalingList4x4[6][16];
///     uint8_t ScalingList8x8[6][64];
///     uint8_t ScalingList16x16[6][64];
///     uint8_t ScalingList32x32[2][64];
///     uint8_t ScalingListDCCoef16x16[6];
///     uint8_t ScalingListDCCoef32x32[2];
/// };
/// ```
public final class StdVideoH265ScalingLists extends GroupType {
    /// The struct layout of `StdVideoH265ScalingLists`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        MemoryLayout.sequenceLayout(16, MemoryLayout.sequenceLayout(6, ValueLayout.JAVA_BYTE)).withName("ScalingList4x4"),
        MemoryLayout.sequenceLayout(64, MemoryLayout.sequenceLayout(6, ValueLayout.JAVA_BYTE)).withName("ScalingList8x8"),
        MemoryLayout.sequenceLayout(64, MemoryLayout.sequenceLayout(6, ValueLayout.JAVA_BYTE)).withName("ScalingList16x16"),
        MemoryLayout.sequenceLayout(64, MemoryLayout.sequenceLayout(2, ValueLayout.JAVA_BYTE)).withName("ScalingList32x32"),
        MemoryLayout.sequenceLayout(6, ValueLayout.JAVA_BYTE).withName("ScalingListDCCoef16x16"),
        MemoryLayout.sequenceLayout(2, ValueLayout.JAVA_BYTE).withName("ScalingListDCCoef32x32")
    );
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
    /// The byte offset of `ScalingList16x16`.
    public static final long OFFSET_ScalingList16x16 = LAYOUT.byteOffset(PathElement.groupElement("ScalingList16x16"));
    /// The memory layout of `ScalingList16x16`.
    public static final MemoryLayout LAYOUT_ScalingList16x16 = LAYOUT.select(PathElement.groupElement("ScalingList16x16"));
    /// The [VarHandle] of `ScalingList16x16` of type `(MemorySegment base, long baseOffset, long index, long index0, long index1)MemorySegment`.
    public static final VarHandle VH_ScalingList16x16 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("ScalingList16x16"), PathElement.sequenceElement(), PathElement.sequenceElement());
    /// The byte offset of `ScalingList32x32`.
    public static final long OFFSET_ScalingList32x32 = LAYOUT.byteOffset(PathElement.groupElement("ScalingList32x32"));
    /// The memory layout of `ScalingList32x32`.
    public static final MemoryLayout LAYOUT_ScalingList32x32 = LAYOUT.select(PathElement.groupElement("ScalingList32x32"));
    /// The [VarHandle] of `ScalingList32x32` of type `(MemorySegment base, long baseOffset, long index, long index0, long index1)MemorySegment`.
    public static final VarHandle VH_ScalingList32x32 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("ScalingList32x32"), PathElement.sequenceElement(), PathElement.sequenceElement());
    /// The byte offset of `ScalingListDCCoef16x16`.
    public static final long OFFSET_ScalingListDCCoef16x16 = LAYOUT.byteOffset(PathElement.groupElement("ScalingListDCCoef16x16"));
    /// The memory layout of `ScalingListDCCoef16x16`.
    public static final MemoryLayout LAYOUT_ScalingListDCCoef16x16 = LAYOUT.select(PathElement.groupElement("ScalingListDCCoef16x16"));
    /// The [VarHandle] of `ScalingListDCCoef16x16` of type `(MemorySegment base, long baseOffset, long index, long index0)MemorySegment`.
    public static final VarHandle VH_ScalingListDCCoef16x16 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("ScalingListDCCoef16x16"), PathElement.sequenceElement());
    /// The byte offset of `ScalingListDCCoef32x32`.
    public static final long OFFSET_ScalingListDCCoef32x32 = LAYOUT.byteOffset(PathElement.groupElement("ScalingListDCCoef32x32"));
    /// The memory layout of `ScalingListDCCoef32x32`.
    public static final MemoryLayout LAYOUT_ScalingListDCCoef32x32 = LAYOUT.select(PathElement.groupElement("ScalingListDCCoef32x32"));
    /// The [VarHandle] of `ScalingListDCCoef32x32` of type `(MemorySegment base, long baseOffset, long index, long index0)MemorySegment`.
    public static final VarHandle VH_ScalingListDCCoef32x32 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("ScalingListDCCoef32x32"), PathElement.sequenceElement());

    /// Creates `StdVideoH265ScalingLists` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public StdVideoH265ScalingLists(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `StdVideoH265ScalingLists` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoH265ScalingLists of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoH265ScalingLists(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `StdVideoH265ScalingLists` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoH265ScalingLists ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoH265ScalingLists(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `StdVideoH265ScalingLists` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoH265ScalingLists ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoH265ScalingLists(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `StdVideoH265ScalingLists` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoH265ScalingLists`
    public static StdVideoH265ScalingLists alloc(SegmentAllocator allocator) { return new StdVideoH265ScalingLists(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `StdVideoH265ScalingLists` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `StdVideoH265ScalingLists`
    public static StdVideoH265ScalingLists alloc(SegmentAllocator allocator, long count) { return new StdVideoH265ScalingLists(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `StdVideoH265ScalingLists` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param ScalingList4x4 `ScalingList4x4`
    /// @param ScalingList8x8 `ScalingList8x8`
    /// @param ScalingList16x16 `ScalingList16x16`
    /// @param ScalingList32x32 `ScalingList32x32`
    /// @param ScalingListDCCoef16x16 `ScalingListDCCoef16x16`
    /// @param ScalingListDCCoef32x32 `ScalingListDCCoef32x32`
    /// @return the allocated `StdVideoH265ScalingLists`
    public static StdVideoH265ScalingLists allocInit(SegmentAllocator allocator, MemorySegment ScalingList4x4, MemorySegment ScalingList8x8, MemorySegment ScalingList16x16, MemorySegment ScalingList32x32, MemorySegment ScalingListDCCoef16x16, MemorySegment ScalingListDCCoef32x32) {
        return alloc(allocator).ScalingList4x4(ScalingList4x4).ScalingList8x8(ScalingList8x8).ScalingList16x16(ScalingList16x16).ScalingList32x32(ScalingList32x32).ScalingListDCCoef16x16(ScalingListDCCoef16x16).ScalingListDCCoef32x32(ScalingListDCCoef32x32);
    }

    /// Allocates a `StdVideoH265ScalingLists` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param ScalingList4x4 `ScalingList4x4`
    /// @param ScalingList8x8 `ScalingList8x8`
    /// @param ScalingList16x16 `ScalingList16x16`
    /// @param ScalingList32x32 `ScalingList32x32`
    /// @param ScalingListDCCoef16x16 `ScalingListDCCoef16x16`
    /// @return the allocated `StdVideoH265ScalingLists`
    public static StdVideoH265ScalingLists allocInit(SegmentAllocator allocator, MemorySegment ScalingList4x4, MemorySegment ScalingList8x8, MemorySegment ScalingList16x16, MemorySegment ScalingList32x32, MemorySegment ScalingListDCCoef16x16) {
        return alloc(allocator).ScalingList4x4(ScalingList4x4).ScalingList8x8(ScalingList8x8).ScalingList16x16(ScalingList16x16).ScalingList32x32(ScalingList32x32).ScalingListDCCoef16x16(ScalingListDCCoef16x16);
    }

    /// Allocates a `StdVideoH265ScalingLists` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param ScalingList4x4 `ScalingList4x4`
    /// @param ScalingList8x8 `ScalingList8x8`
    /// @param ScalingList16x16 `ScalingList16x16`
    /// @param ScalingList32x32 `ScalingList32x32`
    /// @return the allocated `StdVideoH265ScalingLists`
    public static StdVideoH265ScalingLists allocInit(SegmentAllocator allocator, MemorySegment ScalingList4x4, MemorySegment ScalingList8x8, MemorySegment ScalingList16x16, MemorySegment ScalingList32x32) {
        return alloc(allocator).ScalingList4x4(ScalingList4x4).ScalingList8x8(ScalingList8x8).ScalingList16x16(ScalingList16x16).ScalingList32x32(ScalingList32x32);
    }

    /// Allocates a `StdVideoH265ScalingLists` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param ScalingList4x4 `ScalingList4x4`
    /// @param ScalingList8x8 `ScalingList8x8`
    /// @param ScalingList16x16 `ScalingList16x16`
    /// @return the allocated `StdVideoH265ScalingLists`
    public static StdVideoH265ScalingLists allocInit(SegmentAllocator allocator, MemorySegment ScalingList4x4, MemorySegment ScalingList8x8, MemorySegment ScalingList16x16) {
        return alloc(allocator).ScalingList4x4(ScalingList4x4).ScalingList8x8(ScalingList8x8).ScalingList16x16(ScalingList16x16);
    }

    /// Allocates a `StdVideoH265ScalingLists` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param ScalingList4x4 `ScalingList4x4`
    /// @param ScalingList8x8 `ScalingList8x8`
    /// @return the allocated `StdVideoH265ScalingLists`
    public static StdVideoH265ScalingLists allocInit(SegmentAllocator allocator, MemorySegment ScalingList4x4, MemorySegment ScalingList8x8) {
        return alloc(allocator).ScalingList4x4(ScalingList4x4).ScalingList8x8(ScalingList8x8);
    }

    /// Allocates a `StdVideoH265ScalingLists` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param ScalingList4x4 `ScalingList4x4`
    /// @return the allocated `StdVideoH265ScalingLists`
    public static StdVideoH265ScalingLists allocInit(SegmentAllocator allocator, MemorySegment ScalingList4x4) {
        return alloc(allocator).ScalingList4x4(ScalingList4x4);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public StdVideoH265ScalingLists copyFrom(StdVideoH265ScalingLists src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public StdVideoH265ScalingLists reinterpret(long count) { return new StdVideoH265ScalingLists(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public StdVideoH265ScalingLists ScalingList4x4(MemorySegment value) { ScalingList4x4(this.segment(), 0L, value); return this; }
    /// Sets `ScalingList4x4` with the given value.
    /// @param index0 the Index 0 of the array
    /// @param index1 the Index 1 of the array
    /// @param value the value
    /// @return `this`
    public StdVideoH265ScalingLists ScalingList4x4(long index0, long index1, byte value) { ScalingList4x4(this.segment(), 0L, index0, index1, value); return this; }

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
    public StdVideoH265ScalingLists ScalingList8x8(MemorySegment value) { ScalingList8x8(this.segment(), 0L, value); return this; }
    /// Sets `ScalingList8x8` with the given value.
    /// @param index0 the Index 0 of the array
    /// @param index1 the Index 1 of the array
    /// @param value the value
    /// @return `this`
    public StdVideoH265ScalingLists ScalingList8x8(long index0, long index1, byte value) { ScalingList8x8(this.segment(), 0L, index0, index1, value); return this; }

    /// {@return `ScalingList16x16` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment ScalingList16x16(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_ScalingList16x16, index), LAYOUT_ScalingList16x16); }
    /// {@return `ScalingList16x16` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param index1 the Index 1 of the array
    public static byte ScalingList16x16(MemorySegment segment, long index, long index0, long index1) { return (byte) VH_ScalingList16x16.get(segment, 0L, index, index0, index1); }
    /// {@return `ScalingList16x16`}
    public MemorySegment ScalingList16x16() { return ScalingList16x16(this.segment(), 0L); }
    /// {@return `ScalingList16x16`}
    /// @param index0 the Index 0 of the array
    /// @param index1 the Index 1 of the array
    public byte ScalingList16x16(long index0, long index1) { return ScalingList16x16(this.segment(), 0L, index0, index1); }
    /// Sets `ScalingList16x16` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void ScalingList16x16(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_ScalingList16x16, index), LAYOUT_ScalingList16x16.byteSize()); }
    /// Sets `ScalingList16x16` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param index1 the Index 1 of the array
    /// @param value the value
    public static void ScalingList16x16(MemorySegment segment, long index, long index0, long index1, byte value) { VH_ScalingList16x16.set(segment, 0L, index, index0, index1, value); }
    /// Sets `ScalingList16x16` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265ScalingLists ScalingList16x16(MemorySegment value) { ScalingList16x16(this.segment(), 0L, value); return this; }
    /// Sets `ScalingList16x16` with the given value.
    /// @param index0 the Index 0 of the array
    /// @param index1 the Index 1 of the array
    /// @param value the value
    /// @return `this`
    public StdVideoH265ScalingLists ScalingList16x16(long index0, long index1, byte value) { ScalingList16x16(this.segment(), 0L, index0, index1, value); return this; }

    /// {@return `ScalingList32x32` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment ScalingList32x32(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_ScalingList32x32, index), LAYOUT_ScalingList32x32); }
    /// {@return `ScalingList32x32` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param index1 the Index 1 of the array
    public static byte ScalingList32x32(MemorySegment segment, long index, long index0, long index1) { return (byte) VH_ScalingList32x32.get(segment, 0L, index, index0, index1); }
    /// {@return `ScalingList32x32`}
    public MemorySegment ScalingList32x32() { return ScalingList32x32(this.segment(), 0L); }
    /// {@return `ScalingList32x32`}
    /// @param index0 the Index 0 of the array
    /// @param index1 the Index 1 of the array
    public byte ScalingList32x32(long index0, long index1) { return ScalingList32x32(this.segment(), 0L, index0, index1); }
    /// Sets `ScalingList32x32` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void ScalingList32x32(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_ScalingList32x32, index), LAYOUT_ScalingList32x32.byteSize()); }
    /// Sets `ScalingList32x32` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param index1 the Index 1 of the array
    /// @param value the value
    public static void ScalingList32x32(MemorySegment segment, long index, long index0, long index1, byte value) { VH_ScalingList32x32.set(segment, 0L, index, index0, index1, value); }
    /// Sets `ScalingList32x32` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265ScalingLists ScalingList32x32(MemorySegment value) { ScalingList32x32(this.segment(), 0L, value); return this; }
    /// Sets `ScalingList32x32` with the given value.
    /// @param index0 the Index 0 of the array
    /// @param index1 the Index 1 of the array
    /// @param value the value
    /// @return `this`
    public StdVideoH265ScalingLists ScalingList32x32(long index0, long index1, byte value) { ScalingList32x32(this.segment(), 0L, index0, index1, value); return this; }

    /// {@return `ScalingListDCCoef16x16` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment ScalingListDCCoef16x16(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_ScalingListDCCoef16x16, index), LAYOUT_ScalingListDCCoef16x16); }
    /// {@return `ScalingListDCCoef16x16` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    public static byte ScalingListDCCoef16x16(MemorySegment segment, long index, long index0) { return (byte) VH_ScalingListDCCoef16x16.get(segment, 0L, index, index0); }
    /// {@return `ScalingListDCCoef16x16`}
    public MemorySegment ScalingListDCCoef16x16() { return ScalingListDCCoef16x16(this.segment(), 0L); }
    /// {@return `ScalingListDCCoef16x16`}
    /// @param index0 the Index 0 of the array
    public byte ScalingListDCCoef16x16(long index0) { return ScalingListDCCoef16x16(this.segment(), 0L, index0); }
    /// Sets `ScalingListDCCoef16x16` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void ScalingListDCCoef16x16(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_ScalingListDCCoef16x16, index), LAYOUT_ScalingListDCCoef16x16.byteSize()); }
    /// Sets `ScalingListDCCoef16x16` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    public static void ScalingListDCCoef16x16(MemorySegment segment, long index, long index0, byte value) { VH_ScalingListDCCoef16x16.set(segment, 0L, index, index0, value); }
    /// Sets `ScalingListDCCoef16x16` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265ScalingLists ScalingListDCCoef16x16(MemorySegment value) { ScalingListDCCoef16x16(this.segment(), 0L, value); return this; }
    /// Sets `ScalingListDCCoef16x16` with the given value.
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public StdVideoH265ScalingLists ScalingListDCCoef16x16(long index0, byte value) { ScalingListDCCoef16x16(this.segment(), 0L, index0, value); return this; }

    /// {@return `ScalingListDCCoef32x32` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment ScalingListDCCoef32x32(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_ScalingListDCCoef32x32, index), LAYOUT_ScalingListDCCoef32x32); }
    /// {@return `ScalingListDCCoef32x32` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    public static byte ScalingListDCCoef32x32(MemorySegment segment, long index, long index0) { return (byte) VH_ScalingListDCCoef32x32.get(segment, 0L, index, index0); }
    /// {@return `ScalingListDCCoef32x32`}
    public MemorySegment ScalingListDCCoef32x32() { return ScalingListDCCoef32x32(this.segment(), 0L); }
    /// {@return `ScalingListDCCoef32x32`}
    /// @param index0 the Index 0 of the array
    public byte ScalingListDCCoef32x32(long index0) { return ScalingListDCCoef32x32(this.segment(), 0L, index0); }
    /// Sets `ScalingListDCCoef32x32` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void ScalingListDCCoef32x32(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_ScalingListDCCoef32x32, index), LAYOUT_ScalingListDCCoef32x32.byteSize()); }
    /// Sets `ScalingListDCCoef32x32` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    public static void ScalingListDCCoef32x32(MemorySegment segment, long index, long index0, byte value) { VH_ScalingListDCCoef32x32.set(segment, 0L, index, index0, value); }
    /// Sets `ScalingListDCCoef32x32` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265ScalingLists ScalingListDCCoef32x32(MemorySegment value) { ScalingListDCCoef32x32(this.segment(), 0L, value); return this; }
    /// Sets `ScalingListDCCoef32x32` with the given value.
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public StdVideoH265ScalingLists ScalingListDCCoef32x32(long index0, byte value) { ScalingListDCCoef32x32(this.segment(), 0L, index0, value); return this; }

    /// Creates a slice of `StdVideoH265ScalingLists`.
    /// @param index the index of the struct buffer
    /// @return the slice of `StdVideoH265ScalingLists`
    public StdVideoH265ScalingLists asSlice(long index) { return new StdVideoH265ScalingLists(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `StdVideoH265ScalingLists`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `StdVideoH265ScalingLists`
    public StdVideoH265ScalingLists asSlice(long index, long count) { return new StdVideoH265ScalingLists(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `StdVideoH265ScalingLists` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public StdVideoH265ScalingLists at(long index, Consumer<StdVideoH265ScalingLists> func) { func.accept(asSlice(index)); return this; }

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
    public StdVideoH265ScalingLists ScalingList4x4At(long index, MemorySegment value) { ScalingList4x4(this.segment(), index, value); return this; }
    /// Sets `ScalingList4x4` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param index1 the Index 1 of the array
    /// @param value the value
    /// @return `this`
    public StdVideoH265ScalingLists ScalingList4x4At(long index, long index0, long index1, byte value) { ScalingList4x4(this.segment(), index, index0, index1, value); return this; }

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
    public StdVideoH265ScalingLists ScalingList8x8At(long index, MemorySegment value) { ScalingList8x8(this.segment(), index, value); return this; }
    /// Sets `ScalingList8x8` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param index1 the Index 1 of the array
    /// @param value the value
    /// @return `this`
    public StdVideoH265ScalingLists ScalingList8x8At(long index, long index0, long index1, byte value) { ScalingList8x8(this.segment(), index, index0, index1, value); return this; }

    /// {@return `ScalingList16x16` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment ScalingList16x16At(long index) { return ScalingList16x16(this.segment(), index); }
    /// {@return `ScalingList16x16` at the given index}
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param index1 the Index 1 of the array
        public byte ScalingList16x16At(long index, long index0, long index1) { return ScalingList16x16(this.segment(), index, index0, index1); }
    /// Sets `ScalingList16x16` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoH265ScalingLists ScalingList16x16At(long index, MemorySegment value) { ScalingList16x16(this.segment(), index, value); return this; }
    /// Sets `ScalingList16x16` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param index1 the Index 1 of the array
    /// @param value the value
    /// @return `this`
    public StdVideoH265ScalingLists ScalingList16x16At(long index, long index0, long index1, byte value) { ScalingList16x16(this.segment(), index, index0, index1, value); return this; }

    /// {@return `ScalingList32x32` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment ScalingList32x32At(long index) { return ScalingList32x32(this.segment(), index); }
    /// {@return `ScalingList32x32` at the given index}
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param index1 the Index 1 of the array
        public byte ScalingList32x32At(long index, long index0, long index1) { return ScalingList32x32(this.segment(), index, index0, index1); }
    /// Sets `ScalingList32x32` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoH265ScalingLists ScalingList32x32At(long index, MemorySegment value) { ScalingList32x32(this.segment(), index, value); return this; }
    /// Sets `ScalingList32x32` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param index1 the Index 1 of the array
    /// @param value the value
    /// @return `this`
    public StdVideoH265ScalingLists ScalingList32x32At(long index, long index0, long index1, byte value) { ScalingList32x32(this.segment(), index, index0, index1, value); return this; }

    /// {@return `ScalingListDCCoef16x16` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment ScalingListDCCoef16x16At(long index) { return ScalingListDCCoef16x16(this.segment(), index); }
    /// {@return `ScalingListDCCoef16x16` at the given index}
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
        public byte ScalingListDCCoef16x16At(long index, long index0) { return ScalingListDCCoef16x16(this.segment(), index, index0); }
    /// Sets `ScalingListDCCoef16x16` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoH265ScalingLists ScalingListDCCoef16x16At(long index, MemorySegment value) { ScalingListDCCoef16x16(this.segment(), index, value); return this; }
    /// Sets `ScalingListDCCoef16x16` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public StdVideoH265ScalingLists ScalingListDCCoef16x16At(long index, long index0, byte value) { ScalingListDCCoef16x16(this.segment(), index, index0, value); return this; }

    /// {@return `ScalingListDCCoef32x32` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment ScalingListDCCoef32x32At(long index) { return ScalingListDCCoef32x32(this.segment(), index); }
    /// {@return `ScalingListDCCoef32x32` at the given index}
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
        public byte ScalingListDCCoef32x32At(long index, long index0) { return ScalingListDCCoef32x32(this.segment(), index, index0); }
    /// Sets `ScalingListDCCoef32x32` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoH265ScalingLists ScalingListDCCoef32x32At(long index, MemorySegment value) { ScalingListDCCoef32x32(this.segment(), index, value); return this; }
    /// Sets `ScalingListDCCoef32x32` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public StdVideoH265ScalingLists ScalingListDCCoef32x32At(long index, long index0, byte value) { ScalingListDCCoef32x32(this.segment(), index, index0, value); return this; }

}
