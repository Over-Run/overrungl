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
package overrungl.vma;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VmaDefragmentationPassMoveInfo {
///     uint32_t moveCount;
///     VmaDefragmentationMove* pMoves;
/// };
/// ```
public final class VmaDefragmentationPassMoveInfo extends GroupType {
    /// The struct layout of `VmaDefragmentationPassMoveInfo`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("moveCount"),
        ValueLayout.ADDRESS.withName("pMoves")
    );
    /// The byte offset of `moveCount`.
    public static final long OFFSET_moveCount = LAYOUT.byteOffset(PathElement.groupElement("moveCount"));
    /// The memory layout of `moveCount`.
    public static final MemoryLayout LAYOUT_moveCount = LAYOUT.select(PathElement.groupElement("moveCount"));
    /// The [VarHandle] of `moveCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_moveCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("moveCount"));
    /// The byte offset of `pMoves`.
    public static final long OFFSET_pMoves = LAYOUT.byteOffset(PathElement.groupElement("pMoves"));
    /// The memory layout of `pMoves`.
    public static final MemoryLayout LAYOUT_pMoves = LAYOUT.select(PathElement.groupElement("pMoves"));
    /// The [VarHandle] of `pMoves` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pMoves = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pMoves"));

    /// Creates `VmaDefragmentationPassMoveInfo` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VmaDefragmentationPassMoveInfo(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VmaDefragmentationPassMoveInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VmaDefragmentationPassMoveInfo of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VmaDefragmentationPassMoveInfo(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VmaDefragmentationPassMoveInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VmaDefragmentationPassMoveInfo ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VmaDefragmentationPassMoveInfo(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VmaDefragmentationPassMoveInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VmaDefragmentationPassMoveInfo ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VmaDefragmentationPassMoveInfo(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VmaDefragmentationPassMoveInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VmaDefragmentationPassMoveInfo`
    public static VmaDefragmentationPassMoveInfo alloc(SegmentAllocator allocator) { return new VmaDefragmentationPassMoveInfo(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VmaDefragmentationPassMoveInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VmaDefragmentationPassMoveInfo`
    public static VmaDefragmentationPassMoveInfo alloc(SegmentAllocator allocator, long count) { return new VmaDefragmentationPassMoveInfo(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VmaDefragmentationPassMoveInfo copyFrom(VmaDefragmentationPassMoveInfo src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VmaDefragmentationPassMoveInfo reinterpret(long count) { return new VmaDefragmentationPassMoveInfo(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// {@return `moveCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int moveCount(MemorySegment segment, long index) { return (int) VH_moveCount.get(segment, 0L, index); }
    /// {@return `moveCount`}
    public int moveCount() { return moveCount(this.segment(), 0L); }
    /// Sets `moveCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void moveCount(MemorySegment segment, long index, int value) { VH_moveCount.set(segment, 0L, index, value); }
    /// Sets `moveCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VmaDefragmentationPassMoveInfo moveCount(int value) { moveCount(this.segment(), 0L, value); return this; }

    /// {@return `pMoves` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pMoves(MemorySegment segment, long index) { return (MemorySegment) VH_pMoves.get(segment, 0L, index); }
    /// {@return `pMoves`}
    public MemorySegment pMoves() { return pMoves(this.segment(), 0L); }
    /// Sets `pMoves` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pMoves(MemorySegment segment, long index, MemorySegment value) { VH_pMoves.set(segment, 0L, index, value); }
    /// Sets `pMoves` with the given value.
    /// @param value the value
    /// @return `this`
    public VmaDefragmentationPassMoveInfo pMoves(MemorySegment value) { pMoves(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VmaDefragmentationPassMoveInfo`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VmaDefragmentationPassMoveInfo`
    public VmaDefragmentationPassMoveInfo asSlice(long index) { return new VmaDefragmentationPassMoveInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VmaDefragmentationPassMoveInfo`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VmaDefragmentationPassMoveInfo`
    public VmaDefragmentationPassMoveInfo asSlice(long index, long count) { return new VmaDefragmentationPassMoveInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VmaDefragmentationPassMoveInfo` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VmaDefragmentationPassMoveInfo at(long index, Consumer<VmaDefragmentationPassMoveInfo> func) { func.accept(asSlice(index)); return this; }

    /// {@return `moveCount` at the given index}
    /// @param index the index of the struct buffer
    public int moveCountAt(long index) { return moveCount(this.segment(), index); }
    /// Sets `moveCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VmaDefragmentationPassMoveInfo moveCountAt(long index, int value) { moveCount(this.segment(), index, value); return this; }

    /// {@return `pMoves` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pMovesAt(long index) { return pMoves(this.segment(), index); }
    /// Sets `pMoves` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VmaDefragmentationPassMoveInfo pMovesAt(long index, MemorySegment value) { pMoves(this.segment(), index, value); return this; }

}
