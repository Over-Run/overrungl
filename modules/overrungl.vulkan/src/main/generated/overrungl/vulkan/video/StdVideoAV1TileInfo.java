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
/// struct StdVideoAV1TileInfo {
///     (struct StdVideoAV1TileInfoFlags) StdVideoAV1TileInfoFlags flags;
///     uint8_t TileCols;
///     uint8_t TileRows;
///     uint16_t context_update_tile_id;
///     uint8_t tile_size_bytes_minus_1;
///     uint8_t reserved1[7];
///     const uint16_t* pMiColStarts;
///     const uint16_t* pMiRowStarts;
///     const uint16_t* pWidthInSbsMinus1;
///     const uint16_t* pHeightInSbsMinus1;
/// };
/// ```
public final class StdVideoAV1TileInfo extends GroupType {
    /// The struct layout of `StdVideoAV1TileInfo`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        overrungl.vulkan.video.StdVideoAV1TileInfoFlags.LAYOUT.withName("flags"),
        ValueLayout.JAVA_BYTE.withName("TileCols"),
        ValueLayout.JAVA_BYTE.withName("TileRows"),
        ValueLayout.JAVA_SHORT.withName("context_update_tile_id"),
        ValueLayout.JAVA_BYTE.withName("tile_size_bytes_minus_1"),
        MemoryLayout.sequenceLayout(7, ValueLayout.JAVA_BYTE).withName("reserved1"),
        ValueLayout.ADDRESS.withName("pMiColStarts"),
        ValueLayout.ADDRESS.withName("pMiRowStarts"),
        ValueLayout.ADDRESS.withName("pWidthInSbsMinus1"),
        ValueLayout.ADDRESS.withName("pHeightInSbsMinus1")
    );
    /// The byte offset of `flags`.
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    /// The memory layout of `flags`.
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    /// The byte offset of `TileCols`.
    public static final long OFFSET_TileCols = LAYOUT.byteOffset(PathElement.groupElement("TileCols"));
    /// The memory layout of `TileCols`.
    public static final MemoryLayout LAYOUT_TileCols = LAYOUT.select(PathElement.groupElement("TileCols"));
    /// The [VarHandle] of `TileCols` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_TileCols = LAYOUT.arrayElementVarHandle(PathElement.groupElement("TileCols"));
    /// The byte offset of `TileRows`.
    public static final long OFFSET_TileRows = LAYOUT.byteOffset(PathElement.groupElement("TileRows"));
    /// The memory layout of `TileRows`.
    public static final MemoryLayout LAYOUT_TileRows = LAYOUT.select(PathElement.groupElement("TileRows"));
    /// The [VarHandle] of `TileRows` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_TileRows = LAYOUT.arrayElementVarHandle(PathElement.groupElement("TileRows"));
    /// The byte offset of `context_update_tile_id`.
    public static final long OFFSET_context_update_tile_id = LAYOUT.byteOffset(PathElement.groupElement("context_update_tile_id"));
    /// The memory layout of `context_update_tile_id`.
    public static final MemoryLayout LAYOUT_context_update_tile_id = LAYOUT.select(PathElement.groupElement("context_update_tile_id"));
    /// The [VarHandle] of `context_update_tile_id` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_context_update_tile_id = LAYOUT.arrayElementVarHandle(PathElement.groupElement("context_update_tile_id"));
    /// The byte offset of `tile_size_bytes_minus_1`.
    public static final long OFFSET_tile_size_bytes_minus_1 = LAYOUT.byteOffset(PathElement.groupElement("tile_size_bytes_minus_1"));
    /// The memory layout of `tile_size_bytes_minus_1`.
    public static final MemoryLayout LAYOUT_tile_size_bytes_minus_1 = LAYOUT.select(PathElement.groupElement("tile_size_bytes_minus_1"));
    /// The [VarHandle] of `tile_size_bytes_minus_1` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_tile_size_bytes_minus_1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("tile_size_bytes_minus_1"));
    /// The byte offset of `reserved1`.
    public static final long OFFSET_reserved1 = LAYOUT.byteOffset(PathElement.groupElement("reserved1"));
    /// The memory layout of `reserved1`.
    public static final MemoryLayout LAYOUT_reserved1 = LAYOUT.select(PathElement.groupElement("reserved1"));
    /// The [VarHandle] of `reserved1` of type `(MemorySegment base, long baseOffset, long index, long index0)MemorySegment`.
    public static final VarHandle VH_reserved1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("reserved1"), PathElement.sequenceElement());
    /// The byte offset of `pMiColStarts`.
    public static final long OFFSET_pMiColStarts = LAYOUT.byteOffset(PathElement.groupElement("pMiColStarts"));
    /// The memory layout of `pMiColStarts`.
    public static final MemoryLayout LAYOUT_pMiColStarts = LAYOUT.select(PathElement.groupElement("pMiColStarts"));
    /// The [VarHandle] of `pMiColStarts` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pMiColStarts = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pMiColStarts"));
    /// The byte offset of `pMiRowStarts`.
    public static final long OFFSET_pMiRowStarts = LAYOUT.byteOffset(PathElement.groupElement("pMiRowStarts"));
    /// The memory layout of `pMiRowStarts`.
    public static final MemoryLayout LAYOUT_pMiRowStarts = LAYOUT.select(PathElement.groupElement("pMiRowStarts"));
    /// The [VarHandle] of `pMiRowStarts` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pMiRowStarts = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pMiRowStarts"));
    /// The byte offset of `pWidthInSbsMinus1`.
    public static final long OFFSET_pWidthInSbsMinus1 = LAYOUT.byteOffset(PathElement.groupElement("pWidthInSbsMinus1"));
    /// The memory layout of `pWidthInSbsMinus1`.
    public static final MemoryLayout LAYOUT_pWidthInSbsMinus1 = LAYOUT.select(PathElement.groupElement("pWidthInSbsMinus1"));
    /// The [VarHandle] of `pWidthInSbsMinus1` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pWidthInSbsMinus1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pWidthInSbsMinus1"));
    /// The byte offset of `pHeightInSbsMinus1`.
    public static final long OFFSET_pHeightInSbsMinus1 = LAYOUT.byteOffset(PathElement.groupElement("pHeightInSbsMinus1"));
    /// The memory layout of `pHeightInSbsMinus1`.
    public static final MemoryLayout LAYOUT_pHeightInSbsMinus1 = LAYOUT.select(PathElement.groupElement("pHeightInSbsMinus1"));
    /// The [VarHandle] of `pHeightInSbsMinus1` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pHeightInSbsMinus1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pHeightInSbsMinus1"));

    /// Creates `StdVideoAV1TileInfo` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public StdVideoAV1TileInfo(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `StdVideoAV1TileInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoAV1TileInfo of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoAV1TileInfo(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `StdVideoAV1TileInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoAV1TileInfo ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoAV1TileInfo(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `StdVideoAV1TileInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoAV1TileInfo ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoAV1TileInfo(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `StdVideoAV1TileInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoAV1TileInfo`
    public static StdVideoAV1TileInfo alloc(SegmentAllocator allocator) { return new StdVideoAV1TileInfo(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `StdVideoAV1TileInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `StdVideoAV1TileInfo`
    public static StdVideoAV1TileInfo alloc(SegmentAllocator allocator, long count) { return new StdVideoAV1TileInfo(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `StdVideoAV1TileInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param flags `flags`
    /// @param TileCols `TileCols`
    /// @param TileRows `TileRows`
    /// @param context_update_tile_id `context_update_tile_id`
    /// @param tile_size_bytes_minus_1 `tile_size_bytes_minus_1`
    /// @param reserved1 `reserved1`
    /// @param pMiColStarts `pMiColStarts`
    /// @param pMiRowStarts `pMiRowStarts`
    /// @param pWidthInSbsMinus1 `pWidthInSbsMinus1`
    /// @param pHeightInSbsMinus1 `pHeightInSbsMinus1`
    /// @return the allocated `StdVideoAV1TileInfo`
    public static StdVideoAV1TileInfo allocInit(SegmentAllocator allocator, MemorySegment flags, byte TileCols, byte TileRows, short context_update_tile_id, byte tile_size_bytes_minus_1, MemorySegment reserved1, MemorySegment pMiColStarts, MemorySegment pMiRowStarts, MemorySegment pWidthInSbsMinus1, MemorySegment pHeightInSbsMinus1) {
        return alloc(allocator).flags(flags).TileCols(TileCols).TileRows(TileRows).context_update_tile_id(context_update_tile_id).tile_size_bytes_minus_1(tile_size_bytes_minus_1).reserved1(reserved1).pMiColStarts(pMiColStarts).pMiRowStarts(pMiRowStarts).pWidthInSbsMinus1(pWidthInSbsMinus1).pHeightInSbsMinus1(pHeightInSbsMinus1);
    }

    /// Allocates a `StdVideoAV1TileInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param flags `flags`
    /// @param TileCols `TileCols`
    /// @param TileRows `TileRows`
    /// @param context_update_tile_id `context_update_tile_id`
    /// @param tile_size_bytes_minus_1 `tile_size_bytes_minus_1`
    /// @param reserved1 `reserved1`
    /// @param pMiColStarts `pMiColStarts`
    /// @param pMiRowStarts `pMiRowStarts`
    /// @param pWidthInSbsMinus1 `pWidthInSbsMinus1`
    /// @return the allocated `StdVideoAV1TileInfo`
    public static StdVideoAV1TileInfo allocInit(SegmentAllocator allocator, MemorySegment flags, byte TileCols, byte TileRows, short context_update_tile_id, byte tile_size_bytes_minus_1, MemorySegment reserved1, MemorySegment pMiColStarts, MemorySegment pMiRowStarts, MemorySegment pWidthInSbsMinus1) {
        return alloc(allocator).flags(flags).TileCols(TileCols).TileRows(TileRows).context_update_tile_id(context_update_tile_id).tile_size_bytes_minus_1(tile_size_bytes_minus_1).reserved1(reserved1).pMiColStarts(pMiColStarts).pMiRowStarts(pMiRowStarts).pWidthInSbsMinus1(pWidthInSbsMinus1);
    }

    /// Allocates a `StdVideoAV1TileInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param flags `flags`
    /// @param TileCols `TileCols`
    /// @param TileRows `TileRows`
    /// @param context_update_tile_id `context_update_tile_id`
    /// @param tile_size_bytes_minus_1 `tile_size_bytes_minus_1`
    /// @param reserved1 `reserved1`
    /// @param pMiColStarts `pMiColStarts`
    /// @param pMiRowStarts `pMiRowStarts`
    /// @return the allocated `StdVideoAV1TileInfo`
    public static StdVideoAV1TileInfo allocInit(SegmentAllocator allocator, MemorySegment flags, byte TileCols, byte TileRows, short context_update_tile_id, byte tile_size_bytes_minus_1, MemorySegment reserved1, MemorySegment pMiColStarts, MemorySegment pMiRowStarts) {
        return alloc(allocator).flags(flags).TileCols(TileCols).TileRows(TileRows).context_update_tile_id(context_update_tile_id).tile_size_bytes_minus_1(tile_size_bytes_minus_1).reserved1(reserved1).pMiColStarts(pMiColStarts).pMiRowStarts(pMiRowStarts);
    }

    /// Allocates a `StdVideoAV1TileInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param flags `flags`
    /// @param TileCols `TileCols`
    /// @param TileRows `TileRows`
    /// @param context_update_tile_id `context_update_tile_id`
    /// @param tile_size_bytes_minus_1 `tile_size_bytes_minus_1`
    /// @param reserved1 `reserved1`
    /// @param pMiColStarts `pMiColStarts`
    /// @return the allocated `StdVideoAV1TileInfo`
    public static StdVideoAV1TileInfo allocInit(SegmentAllocator allocator, MemorySegment flags, byte TileCols, byte TileRows, short context_update_tile_id, byte tile_size_bytes_minus_1, MemorySegment reserved1, MemorySegment pMiColStarts) {
        return alloc(allocator).flags(flags).TileCols(TileCols).TileRows(TileRows).context_update_tile_id(context_update_tile_id).tile_size_bytes_minus_1(tile_size_bytes_minus_1).reserved1(reserved1).pMiColStarts(pMiColStarts);
    }

    /// Allocates a `StdVideoAV1TileInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param flags `flags`
    /// @param TileCols `TileCols`
    /// @param TileRows `TileRows`
    /// @param context_update_tile_id `context_update_tile_id`
    /// @param tile_size_bytes_minus_1 `tile_size_bytes_minus_1`
    /// @param reserved1 `reserved1`
    /// @return the allocated `StdVideoAV1TileInfo`
    public static StdVideoAV1TileInfo allocInit(SegmentAllocator allocator, MemorySegment flags, byte TileCols, byte TileRows, short context_update_tile_id, byte tile_size_bytes_minus_1, MemorySegment reserved1) {
        return alloc(allocator).flags(flags).TileCols(TileCols).TileRows(TileRows).context_update_tile_id(context_update_tile_id).tile_size_bytes_minus_1(tile_size_bytes_minus_1).reserved1(reserved1);
    }

    /// Allocates a `StdVideoAV1TileInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param flags `flags`
    /// @param TileCols `TileCols`
    /// @param TileRows `TileRows`
    /// @param context_update_tile_id `context_update_tile_id`
    /// @param tile_size_bytes_minus_1 `tile_size_bytes_minus_1`
    /// @return the allocated `StdVideoAV1TileInfo`
    public static StdVideoAV1TileInfo allocInit(SegmentAllocator allocator, MemorySegment flags, byte TileCols, byte TileRows, short context_update_tile_id, byte tile_size_bytes_minus_1) {
        return alloc(allocator).flags(flags).TileCols(TileCols).TileRows(TileRows).context_update_tile_id(context_update_tile_id).tile_size_bytes_minus_1(tile_size_bytes_minus_1);
    }

    /// Allocates a `StdVideoAV1TileInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param flags `flags`
    /// @param TileCols `TileCols`
    /// @param TileRows `TileRows`
    /// @param context_update_tile_id `context_update_tile_id`
    /// @return the allocated `StdVideoAV1TileInfo`
    public static StdVideoAV1TileInfo allocInit(SegmentAllocator allocator, MemorySegment flags, byte TileCols, byte TileRows, short context_update_tile_id) {
        return alloc(allocator).flags(flags).TileCols(TileCols).TileRows(TileRows).context_update_tile_id(context_update_tile_id);
    }

    /// Allocates a `StdVideoAV1TileInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param flags `flags`
    /// @param TileCols `TileCols`
    /// @param TileRows `TileRows`
    /// @return the allocated `StdVideoAV1TileInfo`
    public static StdVideoAV1TileInfo allocInit(SegmentAllocator allocator, MemorySegment flags, byte TileCols, byte TileRows) {
        return alloc(allocator).flags(flags).TileCols(TileCols).TileRows(TileRows);
    }

    /// Allocates a `StdVideoAV1TileInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param flags `flags`
    /// @param TileCols `TileCols`
    /// @return the allocated `StdVideoAV1TileInfo`
    public static StdVideoAV1TileInfo allocInit(SegmentAllocator allocator, MemorySegment flags, byte TileCols) {
        return alloc(allocator).flags(flags).TileCols(TileCols);
    }

    /// Allocates a `StdVideoAV1TileInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param flags `flags`
    /// @return the allocated `StdVideoAV1TileInfo`
    public static StdVideoAV1TileInfo allocInit(SegmentAllocator allocator, MemorySegment flags) {
        return alloc(allocator).flags(flags);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public StdVideoAV1TileInfo copyFrom(StdVideoAV1TileInfo src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public StdVideoAV1TileInfo reinterpret(long count) { return new StdVideoAV1TileInfo(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public StdVideoAV1TileInfo flags(MemorySegment value) { flags(this.segment(), 0L, value); return this; }
    /// Accepts `flags` with the given function.
    /// @param func the function
    /// @return `this`
    public StdVideoAV1TileInfo flags(Consumer<overrungl.vulkan.video.StdVideoAV1TileInfoFlags> func) { func.accept(overrungl.vulkan.video.StdVideoAV1TileInfoFlags.of(flags())); return this; }

    /// {@return `TileCols` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte TileCols(MemorySegment segment, long index) { return (byte) VH_TileCols.get(segment, 0L, index); }
    /// {@return `TileCols`}
    public byte TileCols() { return TileCols(this.segment(), 0L); }
    /// Sets `TileCols` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void TileCols(MemorySegment segment, long index, byte value) { VH_TileCols.set(segment, 0L, index, value); }
    /// Sets `TileCols` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoAV1TileInfo TileCols(byte value) { TileCols(this.segment(), 0L, value); return this; }

    /// {@return `TileRows` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte TileRows(MemorySegment segment, long index) { return (byte) VH_TileRows.get(segment, 0L, index); }
    /// {@return `TileRows`}
    public byte TileRows() { return TileRows(this.segment(), 0L); }
    /// Sets `TileRows` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void TileRows(MemorySegment segment, long index, byte value) { VH_TileRows.set(segment, 0L, index, value); }
    /// Sets `TileRows` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoAV1TileInfo TileRows(byte value) { TileRows(this.segment(), 0L, value); return this; }

    /// {@return `context_update_tile_id` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static short context_update_tile_id(MemorySegment segment, long index) { return (short) VH_context_update_tile_id.get(segment, 0L, index); }
    /// {@return `context_update_tile_id`}
    public short context_update_tile_id() { return context_update_tile_id(this.segment(), 0L); }
    /// Sets `context_update_tile_id` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void context_update_tile_id(MemorySegment segment, long index, short value) { VH_context_update_tile_id.set(segment, 0L, index, value); }
    /// Sets `context_update_tile_id` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoAV1TileInfo context_update_tile_id(short value) { context_update_tile_id(this.segment(), 0L, value); return this; }

    /// {@return `tile_size_bytes_minus_1` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte tile_size_bytes_minus_1(MemorySegment segment, long index) { return (byte) VH_tile_size_bytes_minus_1.get(segment, 0L, index); }
    /// {@return `tile_size_bytes_minus_1`}
    public byte tile_size_bytes_minus_1() { return tile_size_bytes_minus_1(this.segment(), 0L); }
    /// Sets `tile_size_bytes_minus_1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void tile_size_bytes_minus_1(MemorySegment segment, long index, byte value) { VH_tile_size_bytes_minus_1.set(segment, 0L, index, value); }
    /// Sets `tile_size_bytes_minus_1` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoAV1TileInfo tile_size_bytes_minus_1(byte value) { tile_size_bytes_minus_1(this.segment(), 0L, value); return this; }

    /// {@return `reserved1` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment reserved1(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_reserved1, index), LAYOUT_reserved1); }
    /// {@return `reserved1` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    public static byte reserved1(MemorySegment segment, long index, long index0) { return (byte) VH_reserved1.get(segment, 0L, index, index0); }
    /// {@return `reserved1`}
    public MemorySegment reserved1() { return reserved1(this.segment(), 0L); }
    /// {@return `reserved1`}
    /// @param index0 the Index 0 of the array
    public byte reserved1(long index0) { return reserved1(this.segment(), 0L, index0); }
    /// Sets `reserved1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void reserved1(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_reserved1, index), LAYOUT_reserved1.byteSize()); }
    /// Sets `reserved1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    public static void reserved1(MemorySegment segment, long index, long index0, byte value) { VH_reserved1.set(segment, 0L, index, index0, value); }
    /// Sets `reserved1` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoAV1TileInfo reserved1(MemorySegment value) { reserved1(this.segment(), 0L, value); return this; }
    /// Sets `reserved1` with the given value.
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public StdVideoAV1TileInfo reserved1(long index0, byte value) { reserved1(this.segment(), 0L, index0, value); return this; }

    /// {@return `pMiColStarts` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pMiColStarts(MemorySegment segment, long index) { return (MemorySegment) VH_pMiColStarts.get(segment, 0L, index); }
    /// {@return `pMiColStarts`}
    public MemorySegment pMiColStarts() { return pMiColStarts(this.segment(), 0L); }
    /// Sets `pMiColStarts` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pMiColStarts(MemorySegment segment, long index, MemorySegment value) { VH_pMiColStarts.set(segment, 0L, index, value); }
    /// Sets `pMiColStarts` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoAV1TileInfo pMiColStarts(MemorySegment value) { pMiColStarts(this.segment(), 0L, value); return this; }

    /// {@return `pMiRowStarts` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pMiRowStarts(MemorySegment segment, long index) { return (MemorySegment) VH_pMiRowStarts.get(segment, 0L, index); }
    /// {@return `pMiRowStarts`}
    public MemorySegment pMiRowStarts() { return pMiRowStarts(this.segment(), 0L); }
    /// Sets `pMiRowStarts` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pMiRowStarts(MemorySegment segment, long index, MemorySegment value) { VH_pMiRowStarts.set(segment, 0L, index, value); }
    /// Sets `pMiRowStarts` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoAV1TileInfo pMiRowStarts(MemorySegment value) { pMiRowStarts(this.segment(), 0L, value); return this; }

    /// {@return `pWidthInSbsMinus1` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pWidthInSbsMinus1(MemorySegment segment, long index) { return (MemorySegment) VH_pWidthInSbsMinus1.get(segment, 0L, index); }
    /// {@return `pWidthInSbsMinus1`}
    public MemorySegment pWidthInSbsMinus1() { return pWidthInSbsMinus1(this.segment(), 0L); }
    /// Sets `pWidthInSbsMinus1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pWidthInSbsMinus1(MemorySegment segment, long index, MemorySegment value) { VH_pWidthInSbsMinus1.set(segment, 0L, index, value); }
    /// Sets `pWidthInSbsMinus1` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoAV1TileInfo pWidthInSbsMinus1(MemorySegment value) { pWidthInSbsMinus1(this.segment(), 0L, value); return this; }

    /// {@return `pHeightInSbsMinus1` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pHeightInSbsMinus1(MemorySegment segment, long index) { return (MemorySegment) VH_pHeightInSbsMinus1.get(segment, 0L, index); }
    /// {@return `pHeightInSbsMinus1`}
    public MemorySegment pHeightInSbsMinus1() { return pHeightInSbsMinus1(this.segment(), 0L); }
    /// Sets `pHeightInSbsMinus1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pHeightInSbsMinus1(MemorySegment segment, long index, MemorySegment value) { VH_pHeightInSbsMinus1.set(segment, 0L, index, value); }
    /// Sets `pHeightInSbsMinus1` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoAV1TileInfo pHeightInSbsMinus1(MemorySegment value) { pHeightInSbsMinus1(this.segment(), 0L, value); return this; }

    /// Creates a slice of `StdVideoAV1TileInfo`.
    /// @param index the index of the struct buffer
    /// @return the slice of `StdVideoAV1TileInfo`
    public StdVideoAV1TileInfo asSlice(long index) { return new StdVideoAV1TileInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `StdVideoAV1TileInfo`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `StdVideoAV1TileInfo`
    public StdVideoAV1TileInfo asSlice(long index, long count) { return new StdVideoAV1TileInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `StdVideoAV1TileInfo` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public StdVideoAV1TileInfo at(long index, Consumer<StdVideoAV1TileInfo> func) { func.accept(asSlice(index)); return this; }

    /// {@return `flags` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment flagsAt(long index) { return flags(this.segment(), index); }
    /// Sets `flags` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoAV1TileInfo flagsAt(long index, MemorySegment value) { flags(this.segment(), index, value); return this; }
    /// Accepts `flags` with the given function.
    /// @param index the index of the struct buffer
    /// @param func the function
    /// @return `this`
    public StdVideoAV1TileInfo flagsAt(long index, Consumer<overrungl.vulkan.video.StdVideoAV1TileInfoFlags> func) { func.accept(overrungl.vulkan.video.StdVideoAV1TileInfoFlags.of(flagsAt(index))); return this; }

    /// {@return `TileCols` at the given index}
    /// @param index the index of the struct buffer
    public byte TileColsAt(long index) { return TileCols(this.segment(), index); }
    /// Sets `TileCols` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoAV1TileInfo TileColsAt(long index, byte value) { TileCols(this.segment(), index, value); return this; }

    /// {@return `TileRows` at the given index}
    /// @param index the index of the struct buffer
    public byte TileRowsAt(long index) { return TileRows(this.segment(), index); }
    /// Sets `TileRows` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoAV1TileInfo TileRowsAt(long index, byte value) { TileRows(this.segment(), index, value); return this; }

    /// {@return `context_update_tile_id` at the given index}
    /// @param index the index of the struct buffer
    public short context_update_tile_idAt(long index) { return context_update_tile_id(this.segment(), index); }
    /// Sets `context_update_tile_id` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoAV1TileInfo context_update_tile_idAt(long index, short value) { context_update_tile_id(this.segment(), index, value); return this; }

    /// {@return `tile_size_bytes_minus_1` at the given index}
    /// @param index the index of the struct buffer
    public byte tile_size_bytes_minus_1At(long index) { return tile_size_bytes_minus_1(this.segment(), index); }
    /// Sets `tile_size_bytes_minus_1` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoAV1TileInfo tile_size_bytes_minus_1At(long index, byte value) { tile_size_bytes_minus_1(this.segment(), index, value); return this; }

    /// {@return `reserved1` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment reserved1At(long index) { return reserved1(this.segment(), index); }
    /// {@return `reserved1` at the given index}
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
        public byte reserved1At(long index, long index0) { return reserved1(this.segment(), index, index0); }
    /// Sets `reserved1` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoAV1TileInfo reserved1At(long index, MemorySegment value) { reserved1(this.segment(), index, value); return this; }
    /// Sets `reserved1` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public StdVideoAV1TileInfo reserved1At(long index, long index0, byte value) { reserved1(this.segment(), index, index0, value); return this; }

    /// {@return `pMiColStarts` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pMiColStartsAt(long index) { return pMiColStarts(this.segment(), index); }
    /// Sets `pMiColStarts` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoAV1TileInfo pMiColStartsAt(long index, MemorySegment value) { pMiColStarts(this.segment(), index, value); return this; }

    /// {@return `pMiRowStarts` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pMiRowStartsAt(long index) { return pMiRowStarts(this.segment(), index); }
    /// Sets `pMiRowStarts` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoAV1TileInfo pMiRowStartsAt(long index, MemorySegment value) { pMiRowStarts(this.segment(), index, value); return this; }

    /// {@return `pWidthInSbsMinus1` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pWidthInSbsMinus1At(long index) { return pWidthInSbsMinus1(this.segment(), index); }
    /// Sets `pWidthInSbsMinus1` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoAV1TileInfo pWidthInSbsMinus1At(long index, MemorySegment value) { pWidthInSbsMinus1(this.segment(), index, value); return this; }

    /// {@return `pHeightInSbsMinus1` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pHeightInSbsMinus1At(long index) { return pHeightInSbsMinus1(this.segment(), index); }
    /// Sets `pHeightInSbsMinus1` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoAV1TileInfo pHeightInSbsMinus1At(long index, MemorySegment value) { pHeightInSbsMinus1(this.segment(), index, value); return this; }

}
