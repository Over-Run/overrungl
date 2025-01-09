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
/// ### TileCols
/// [VarHandle][#VH_TileCols] - [Getter][#TileCols()] - [Setter][#TileCols(byte)]
/// ### TileRows
/// [VarHandle][#VH_TileRows] - [Getter][#TileRows()] - [Setter][#TileRows(byte)]
/// ### context_update_tile_id
/// [VarHandle][#VH_context_update_tile_id] - [Getter][#context_update_tile_id()] - [Setter][#context_update_tile_id(short)]
/// ### tile_size_bytes_minus_1
/// [VarHandle][#VH_tile_size_bytes_minus_1] - [Getter][#tile_size_bytes_minus_1()] - [Setter][#tile_size_bytes_minus_1(byte)]
/// ### reserved1
/// [VarHandle][#VH_reserved1] - [Getter][#reserved1()] - [Setter][#reserved1(byte)]
/// ### pMiColStarts
/// [VarHandle][#VH_pMiColStarts] - [Getter][#pMiColStarts()] - [Setter][#pMiColStarts(java.lang.foreign.MemorySegment)]
/// ### pMiRowStarts
/// [VarHandle][#VH_pMiRowStarts] - [Getter][#pMiRowStarts()] - [Setter][#pMiRowStarts(java.lang.foreign.MemorySegment)]
/// ### pWidthInSbsMinus1
/// [VarHandle][#VH_pWidthInSbsMinus1] - [Getter][#pWidthInSbsMinus1()] - [Setter][#pWidthInSbsMinus1(java.lang.foreign.MemorySegment)]
/// ### pHeightInSbsMinus1
/// [VarHandle][#VH_pHeightInSbsMinus1] - [Getter][#pHeightInSbsMinus1()] - [Setter][#pHeightInSbsMinus1(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct StdVideoAV1TileInfo {
///     StdVideoAV1TileInfoFlags flags;
///     uint8_t TileCols;
///     uint8_t TileRows;
///     uint16_t context_update_tile_id;
///     uint8_t tile_size_bytes_minus_1;
///     uint8_t [7] reserved1;
///     const uint16_t * pMiColStarts;
///     const uint16_t * pMiRowStarts;
///     const uint16_t * pWidthInSbsMinus1;
///     const uint16_t * pHeightInSbsMinus1;
/// } StdVideoAV1TileInfo;
/// ```
public final class StdVideoAV1TileInfo extends Struct {
    /// The struct layout of `StdVideoAV1TileInfo`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        StdVideoAV1TileInfoFlags.LAYOUT.withName("flags"),
        ValueLayout.JAVA_BYTE.withName("TileCols"),
        ValueLayout.JAVA_BYTE.withName("TileRows"),
        ValueLayout.JAVA_SHORT.withName("context_update_tile_id"),
        ValueLayout.JAVA_BYTE.withName("tile_size_bytes_minus_1"),
        ValueLayout.JAVA_BYTE.withName("reserved1"),
        ValueLayout.ADDRESS.withName("pMiColStarts"),
        ValueLayout.ADDRESS.withName("pMiRowStarts"),
        ValueLayout.ADDRESS.withName("pWidthInSbsMinus1"),
        ValueLayout.ADDRESS.withName("pHeightInSbsMinus1")
    );
    /// The [VarHandle] of `flags` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    /// The [VarHandle] of `TileCols` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_TileCols = LAYOUT.arrayElementVarHandle(PathElement.groupElement("TileCols"));
    /// The [VarHandle] of `TileRows` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_TileRows = LAYOUT.arrayElementVarHandle(PathElement.groupElement("TileRows"));
    /// The [VarHandle] of `context_update_tile_id` of type `(MemorySegment base, long baseOffset, long index)short`.
    public static final VarHandle VH_context_update_tile_id = LAYOUT.arrayElementVarHandle(PathElement.groupElement("context_update_tile_id"));
    /// The [VarHandle] of `tile_size_bytes_minus_1` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_tile_size_bytes_minus_1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("tile_size_bytes_minus_1"));
    /// The [VarHandle] of `reserved1` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_reserved1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("reserved1"));
    /// The [VarHandle] of `pMiColStarts` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pMiColStarts = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pMiColStarts"));
    /// The [VarHandle] of `pMiRowStarts` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pMiRowStarts = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pMiRowStarts"));
    /// The [VarHandle] of `pWidthInSbsMinus1` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pWidthInSbsMinus1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pWidthInSbsMinus1"));
    /// The [VarHandle] of `pHeightInSbsMinus1` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pHeightInSbsMinus1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pHeightInSbsMinus1"));

    /// Creates `StdVideoAV1TileInfo` with the given segment.
    /// @param segment the memory segment
    public StdVideoAV1TileInfo(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `StdVideoAV1TileInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoAV1TileInfo of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new StdVideoAV1TileInfo(segment); }

    /// Creates `StdVideoAV1TileInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoAV1TileInfo ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new StdVideoAV1TileInfo(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `StdVideoAV1TileInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoAV1TileInfo ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new StdVideoAV1TileInfo(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `StdVideoAV1TileInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoAV1TileInfo`
    public static StdVideoAV1TileInfo alloc(SegmentAllocator allocator) { return new StdVideoAV1TileInfo(allocator.allocate(LAYOUT)); }

    /// Allocates a `StdVideoAV1TileInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `StdVideoAV1TileInfo`
    public static StdVideoAV1TileInfo alloc(SegmentAllocator allocator, long count) { return new StdVideoAV1TileInfo(allocator.allocate(LAYOUT, count)); }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("StdVideoAV1TileInfoFlags") java.lang.foreign.MemorySegment get_flags(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_flags.get(segment, 0L, index); }
    /// {@return `flags`}
    /// @param segment the segment of the struct
    public static @CType("StdVideoAV1TileInfoFlags") java.lang.foreign.MemorySegment get_flags(MemorySegment segment) { return StdVideoAV1TileInfo.get_flags(segment, 0L); }
    /// {@return `flags` at the given index}
    /// @param index the index
    public @CType("StdVideoAV1TileInfoFlags") java.lang.foreign.MemorySegment flagsAt(long index) { return StdVideoAV1TileInfo.get_flags(this.segment(), index); }
    /// {@return `flags`}
    public @CType("StdVideoAV1TileInfoFlags") java.lang.foreign.MemorySegment flags() { return StdVideoAV1TileInfo.get_flags(this.segment()); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_flags(MemorySegment segment, long index, @CType("StdVideoAV1TileInfoFlags") java.lang.foreign.MemorySegment value) { VH_flags.set(segment, 0L, index, value); }
    /// Sets `flags` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_flags(MemorySegment segment, @CType("StdVideoAV1TileInfoFlags") java.lang.foreign.MemorySegment value) { StdVideoAV1TileInfo.set_flags(segment, 0L, value); }
    /// Sets `flags` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoAV1TileInfo flagsAt(long index, @CType("StdVideoAV1TileInfoFlags") java.lang.foreign.MemorySegment value) { StdVideoAV1TileInfo.set_flags(this.segment(), index, value); return this; }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoAV1TileInfo flags(@CType("StdVideoAV1TileInfoFlags") java.lang.foreign.MemorySegment value) { StdVideoAV1TileInfo.set_flags(this.segment(), value); return this; }

    /// {@return `TileCols` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t") byte get_TileCols(MemorySegment segment, long index) { return (byte) VH_TileCols.get(segment, 0L, index); }
    /// {@return `TileCols`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t") byte get_TileCols(MemorySegment segment) { return StdVideoAV1TileInfo.get_TileCols(segment, 0L); }
    /// {@return `TileCols` at the given index}
    /// @param index the index
    public @CType("uint8_t") byte TileColsAt(long index) { return StdVideoAV1TileInfo.get_TileCols(this.segment(), index); }
    /// {@return `TileCols`}
    public @CType("uint8_t") byte TileCols() { return StdVideoAV1TileInfo.get_TileCols(this.segment()); }
    /// Sets `TileCols` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_TileCols(MemorySegment segment, long index, @CType("uint8_t") byte value) { VH_TileCols.set(segment, 0L, index, value); }
    /// Sets `TileCols` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_TileCols(MemorySegment segment, @CType("uint8_t") byte value) { StdVideoAV1TileInfo.set_TileCols(segment, 0L, value); }
    /// Sets `TileCols` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoAV1TileInfo TileColsAt(long index, @CType("uint8_t") byte value) { StdVideoAV1TileInfo.set_TileCols(this.segment(), index, value); return this; }
    /// Sets `TileCols` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoAV1TileInfo TileCols(@CType("uint8_t") byte value) { StdVideoAV1TileInfo.set_TileCols(this.segment(), value); return this; }

    /// {@return `TileRows` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t") byte get_TileRows(MemorySegment segment, long index) { return (byte) VH_TileRows.get(segment, 0L, index); }
    /// {@return `TileRows`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t") byte get_TileRows(MemorySegment segment) { return StdVideoAV1TileInfo.get_TileRows(segment, 0L); }
    /// {@return `TileRows` at the given index}
    /// @param index the index
    public @CType("uint8_t") byte TileRowsAt(long index) { return StdVideoAV1TileInfo.get_TileRows(this.segment(), index); }
    /// {@return `TileRows`}
    public @CType("uint8_t") byte TileRows() { return StdVideoAV1TileInfo.get_TileRows(this.segment()); }
    /// Sets `TileRows` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_TileRows(MemorySegment segment, long index, @CType("uint8_t") byte value) { VH_TileRows.set(segment, 0L, index, value); }
    /// Sets `TileRows` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_TileRows(MemorySegment segment, @CType("uint8_t") byte value) { StdVideoAV1TileInfo.set_TileRows(segment, 0L, value); }
    /// Sets `TileRows` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoAV1TileInfo TileRowsAt(long index, @CType("uint8_t") byte value) { StdVideoAV1TileInfo.set_TileRows(this.segment(), index, value); return this; }
    /// Sets `TileRows` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoAV1TileInfo TileRows(@CType("uint8_t") byte value) { StdVideoAV1TileInfo.set_TileRows(this.segment(), value); return this; }

    /// {@return `context_update_tile_id` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint16_t") short get_context_update_tile_id(MemorySegment segment, long index) { return (short) VH_context_update_tile_id.get(segment, 0L, index); }
    /// {@return `context_update_tile_id`}
    /// @param segment the segment of the struct
    public static @CType("uint16_t") short get_context_update_tile_id(MemorySegment segment) { return StdVideoAV1TileInfo.get_context_update_tile_id(segment, 0L); }
    /// {@return `context_update_tile_id` at the given index}
    /// @param index the index
    public @CType("uint16_t") short context_update_tile_idAt(long index) { return StdVideoAV1TileInfo.get_context_update_tile_id(this.segment(), index); }
    /// {@return `context_update_tile_id`}
    public @CType("uint16_t") short context_update_tile_id() { return StdVideoAV1TileInfo.get_context_update_tile_id(this.segment()); }
    /// Sets `context_update_tile_id` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_context_update_tile_id(MemorySegment segment, long index, @CType("uint16_t") short value) { VH_context_update_tile_id.set(segment, 0L, index, value); }
    /// Sets `context_update_tile_id` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_context_update_tile_id(MemorySegment segment, @CType("uint16_t") short value) { StdVideoAV1TileInfo.set_context_update_tile_id(segment, 0L, value); }
    /// Sets `context_update_tile_id` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoAV1TileInfo context_update_tile_idAt(long index, @CType("uint16_t") short value) { StdVideoAV1TileInfo.set_context_update_tile_id(this.segment(), index, value); return this; }
    /// Sets `context_update_tile_id` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoAV1TileInfo context_update_tile_id(@CType("uint16_t") short value) { StdVideoAV1TileInfo.set_context_update_tile_id(this.segment(), value); return this; }

    /// {@return `tile_size_bytes_minus_1` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t") byte get_tile_size_bytes_minus_1(MemorySegment segment, long index) { return (byte) VH_tile_size_bytes_minus_1.get(segment, 0L, index); }
    /// {@return `tile_size_bytes_minus_1`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t") byte get_tile_size_bytes_minus_1(MemorySegment segment) { return StdVideoAV1TileInfo.get_tile_size_bytes_minus_1(segment, 0L); }
    /// {@return `tile_size_bytes_minus_1` at the given index}
    /// @param index the index
    public @CType("uint8_t") byte tile_size_bytes_minus_1At(long index) { return StdVideoAV1TileInfo.get_tile_size_bytes_minus_1(this.segment(), index); }
    /// {@return `tile_size_bytes_minus_1`}
    public @CType("uint8_t") byte tile_size_bytes_minus_1() { return StdVideoAV1TileInfo.get_tile_size_bytes_minus_1(this.segment()); }
    /// Sets `tile_size_bytes_minus_1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_tile_size_bytes_minus_1(MemorySegment segment, long index, @CType("uint8_t") byte value) { VH_tile_size_bytes_minus_1.set(segment, 0L, index, value); }
    /// Sets `tile_size_bytes_minus_1` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_tile_size_bytes_minus_1(MemorySegment segment, @CType("uint8_t") byte value) { StdVideoAV1TileInfo.set_tile_size_bytes_minus_1(segment, 0L, value); }
    /// Sets `tile_size_bytes_minus_1` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoAV1TileInfo tile_size_bytes_minus_1At(long index, @CType("uint8_t") byte value) { StdVideoAV1TileInfo.set_tile_size_bytes_minus_1(this.segment(), index, value); return this; }
    /// Sets `tile_size_bytes_minus_1` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoAV1TileInfo tile_size_bytes_minus_1(@CType("uint8_t") byte value) { StdVideoAV1TileInfo.set_tile_size_bytes_minus_1(this.segment(), value); return this; }

    /// {@return `reserved1` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t [7]") byte get_reserved1(MemorySegment segment, long index) { return (byte) VH_reserved1.get(segment, 0L, index); }
    /// {@return `reserved1`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t [7]") byte get_reserved1(MemorySegment segment) { return StdVideoAV1TileInfo.get_reserved1(segment, 0L); }
    /// {@return `reserved1` at the given index}
    /// @param index the index
    public @CType("uint8_t [7]") byte reserved1At(long index) { return StdVideoAV1TileInfo.get_reserved1(this.segment(), index); }
    /// {@return `reserved1`}
    public @CType("uint8_t [7]") byte reserved1() { return StdVideoAV1TileInfo.get_reserved1(this.segment()); }
    /// Sets `reserved1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_reserved1(MemorySegment segment, long index, @CType("uint8_t [7]") byte value) { VH_reserved1.set(segment, 0L, index, value); }
    /// Sets `reserved1` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_reserved1(MemorySegment segment, @CType("uint8_t [7]") byte value) { StdVideoAV1TileInfo.set_reserved1(segment, 0L, value); }
    /// Sets `reserved1` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoAV1TileInfo reserved1At(long index, @CType("uint8_t [7]") byte value) { StdVideoAV1TileInfo.set_reserved1(this.segment(), index, value); return this; }
    /// Sets `reserved1` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoAV1TileInfo reserved1(@CType("uint8_t [7]") byte value) { StdVideoAV1TileInfo.set_reserved1(this.segment(), value); return this; }

    /// {@return `pMiColStarts` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const uint16_t *") java.lang.foreign.MemorySegment get_pMiColStarts(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pMiColStarts.get(segment, 0L, index); }
    /// {@return `pMiColStarts`}
    /// @param segment the segment of the struct
    public static @CType("const uint16_t *") java.lang.foreign.MemorySegment get_pMiColStarts(MemorySegment segment) { return StdVideoAV1TileInfo.get_pMiColStarts(segment, 0L); }
    /// {@return `pMiColStarts` at the given index}
    /// @param index the index
    public @CType("const uint16_t *") java.lang.foreign.MemorySegment pMiColStartsAt(long index) { return StdVideoAV1TileInfo.get_pMiColStarts(this.segment(), index); }
    /// {@return `pMiColStarts`}
    public @CType("const uint16_t *") java.lang.foreign.MemorySegment pMiColStarts() { return StdVideoAV1TileInfo.get_pMiColStarts(this.segment()); }
    /// Sets `pMiColStarts` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pMiColStarts(MemorySegment segment, long index, @CType("const uint16_t *") java.lang.foreign.MemorySegment value) { VH_pMiColStarts.set(segment, 0L, index, value); }
    /// Sets `pMiColStarts` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pMiColStarts(MemorySegment segment, @CType("const uint16_t *") java.lang.foreign.MemorySegment value) { StdVideoAV1TileInfo.set_pMiColStarts(segment, 0L, value); }
    /// Sets `pMiColStarts` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoAV1TileInfo pMiColStartsAt(long index, @CType("const uint16_t *") java.lang.foreign.MemorySegment value) { StdVideoAV1TileInfo.set_pMiColStarts(this.segment(), index, value); return this; }
    /// Sets `pMiColStarts` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoAV1TileInfo pMiColStarts(@CType("const uint16_t *") java.lang.foreign.MemorySegment value) { StdVideoAV1TileInfo.set_pMiColStarts(this.segment(), value); return this; }

    /// {@return `pMiRowStarts` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const uint16_t *") java.lang.foreign.MemorySegment get_pMiRowStarts(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pMiRowStarts.get(segment, 0L, index); }
    /// {@return `pMiRowStarts`}
    /// @param segment the segment of the struct
    public static @CType("const uint16_t *") java.lang.foreign.MemorySegment get_pMiRowStarts(MemorySegment segment) { return StdVideoAV1TileInfo.get_pMiRowStarts(segment, 0L); }
    /// {@return `pMiRowStarts` at the given index}
    /// @param index the index
    public @CType("const uint16_t *") java.lang.foreign.MemorySegment pMiRowStartsAt(long index) { return StdVideoAV1TileInfo.get_pMiRowStarts(this.segment(), index); }
    /// {@return `pMiRowStarts`}
    public @CType("const uint16_t *") java.lang.foreign.MemorySegment pMiRowStarts() { return StdVideoAV1TileInfo.get_pMiRowStarts(this.segment()); }
    /// Sets `pMiRowStarts` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pMiRowStarts(MemorySegment segment, long index, @CType("const uint16_t *") java.lang.foreign.MemorySegment value) { VH_pMiRowStarts.set(segment, 0L, index, value); }
    /// Sets `pMiRowStarts` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pMiRowStarts(MemorySegment segment, @CType("const uint16_t *") java.lang.foreign.MemorySegment value) { StdVideoAV1TileInfo.set_pMiRowStarts(segment, 0L, value); }
    /// Sets `pMiRowStarts` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoAV1TileInfo pMiRowStartsAt(long index, @CType("const uint16_t *") java.lang.foreign.MemorySegment value) { StdVideoAV1TileInfo.set_pMiRowStarts(this.segment(), index, value); return this; }
    /// Sets `pMiRowStarts` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoAV1TileInfo pMiRowStarts(@CType("const uint16_t *") java.lang.foreign.MemorySegment value) { StdVideoAV1TileInfo.set_pMiRowStarts(this.segment(), value); return this; }

    /// {@return `pWidthInSbsMinus1` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const uint16_t *") java.lang.foreign.MemorySegment get_pWidthInSbsMinus1(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pWidthInSbsMinus1.get(segment, 0L, index); }
    /// {@return `pWidthInSbsMinus1`}
    /// @param segment the segment of the struct
    public static @CType("const uint16_t *") java.lang.foreign.MemorySegment get_pWidthInSbsMinus1(MemorySegment segment) { return StdVideoAV1TileInfo.get_pWidthInSbsMinus1(segment, 0L); }
    /// {@return `pWidthInSbsMinus1` at the given index}
    /// @param index the index
    public @CType("const uint16_t *") java.lang.foreign.MemorySegment pWidthInSbsMinus1At(long index) { return StdVideoAV1TileInfo.get_pWidthInSbsMinus1(this.segment(), index); }
    /// {@return `pWidthInSbsMinus1`}
    public @CType("const uint16_t *") java.lang.foreign.MemorySegment pWidthInSbsMinus1() { return StdVideoAV1TileInfo.get_pWidthInSbsMinus1(this.segment()); }
    /// Sets `pWidthInSbsMinus1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pWidthInSbsMinus1(MemorySegment segment, long index, @CType("const uint16_t *") java.lang.foreign.MemorySegment value) { VH_pWidthInSbsMinus1.set(segment, 0L, index, value); }
    /// Sets `pWidthInSbsMinus1` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pWidthInSbsMinus1(MemorySegment segment, @CType("const uint16_t *") java.lang.foreign.MemorySegment value) { StdVideoAV1TileInfo.set_pWidthInSbsMinus1(segment, 0L, value); }
    /// Sets `pWidthInSbsMinus1` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoAV1TileInfo pWidthInSbsMinus1At(long index, @CType("const uint16_t *") java.lang.foreign.MemorySegment value) { StdVideoAV1TileInfo.set_pWidthInSbsMinus1(this.segment(), index, value); return this; }
    /// Sets `pWidthInSbsMinus1` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoAV1TileInfo pWidthInSbsMinus1(@CType("const uint16_t *") java.lang.foreign.MemorySegment value) { StdVideoAV1TileInfo.set_pWidthInSbsMinus1(this.segment(), value); return this; }

    /// {@return `pHeightInSbsMinus1` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const uint16_t *") java.lang.foreign.MemorySegment get_pHeightInSbsMinus1(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pHeightInSbsMinus1.get(segment, 0L, index); }
    /// {@return `pHeightInSbsMinus1`}
    /// @param segment the segment of the struct
    public static @CType("const uint16_t *") java.lang.foreign.MemorySegment get_pHeightInSbsMinus1(MemorySegment segment) { return StdVideoAV1TileInfo.get_pHeightInSbsMinus1(segment, 0L); }
    /// {@return `pHeightInSbsMinus1` at the given index}
    /// @param index the index
    public @CType("const uint16_t *") java.lang.foreign.MemorySegment pHeightInSbsMinus1At(long index) { return StdVideoAV1TileInfo.get_pHeightInSbsMinus1(this.segment(), index); }
    /// {@return `pHeightInSbsMinus1`}
    public @CType("const uint16_t *") java.lang.foreign.MemorySegment pHeightInSbsMinus1() { return StdVideoAV1TileInfo.get_pHeightInSbsMinus1(this.segment()); }
    /// Sets `pHeightInSbsMinus1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pHeightInSbsMinus1(MemorySegment segment, long index, @CType("const uint16_t *") java.lang.foreign.MemorySegment value) { VH_pHeightInSbsMinus1.set(segment, 0L, index, value); }
    /// Sets `pHeightInSbsMinus1` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pHeightInSbsMinus1(MemorySegment segment, @CType("const uint16_t *") java.lang.foreign.MemorySegment value) { StdVideoAV1TileInfo.set_pHeightInSbsMinus1(segment, 0L, value); }
    /// Sets `pHeightInSbsMinus1` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoAV1TileInfo pHeightInSbsMinus1At(long index, @CType("const uint16_t *") java.lang.foreign.MemorySegment value) { StdVideoAV1TileInfo.set_pHeightInSbsMinus1(this.segment(), index, value); return this; }
    /// Sets `pHeightInSbsMinus1` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoAV1TileInfo pHeightInSbsMinus1(@CType("const uint16_t *") java.lang.foreign.MemorySegment value) { StdVideoAV1TileInfo.set_pHeightInSbsMinus1(this.segment(), value); return this; }

}
