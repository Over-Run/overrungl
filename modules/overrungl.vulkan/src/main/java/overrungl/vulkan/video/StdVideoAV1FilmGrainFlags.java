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
/// ### chroma_scaling_from_luma
/// [VarHandle][#VH_chroma_scaling_from_luma] - [Getter][#chroma_scaling_from_luma()] - [Setter][#chroma_scaling_from_luma(int)]
/// ### overlap_flag
/// [VarHandle][#VH_overlap_flag] - [Getter][#overlap_flag()] - [Setter][#overlap_flag(int)]
/// ### clip_to_restricted_range
/// [VarHandle][#VH_clip_to_restricted_range] - [Getter][#clip_to_restricted_range()] - [Setter][#clip_to_restricted_range(int)]
/// ### update_grain
/// [VarHandle][#VH_update_grain] - [Getter][#update_grain()] - [Setter][#update_grain(int)]
/// ### reserved
/// [VarHandle][#VH_reserved] - [Getter][#reserved()] - [Setter][#reserved(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct StdVideoAV1FilmGrainFlags {
///     uint32_t : 1 chroma_scaling_from_luma;
///     uint32_t : 1 overlap_flag;
///     uint32_t : 1 clip_to_restricted_range;
///     uint32_t : 1 update_grain;
///     uint32_t : 28 reserved;
/// } StdVideoAV1FilmGrainFlags;
/// ```
public final class StdVideoAV1FilmGrainFlags extends Struct {
    /// The struct layout of `StdVideoAV1FilmGrainFlags`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("chroma_scaling_from_luma"),
        ValueLayout.JAVA_INT.withName("overlap_flag"),
        ValueLayout.JAVA_INT.withName("clip_to_restricted_range"),
        ValueLayout.JAVA_INT.withName("update_grain"),
        ValueLayout.JAVA_INT.withName("reserved")
    );
    /// The [VarHandle] of `chroma_scaling_from_luma` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_chroma_scaling_from_luma = LAYOUT.arrayElementVarHandle(PathElement.groupElement("chroma_scaling_from_luma"));
    /// The [VarHandle] of `overlap_flag` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_overlap_flag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("overlap_flag"));
    /// The [VarHandle] of `clip_to_restricted_range` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_clip_to_restricted_range = LAYOUT.arrayElementVarHandle(PathElement.groupElement("clip_to_restricted_range"));
    /// The [VarHandle] of `update_grain` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_update_grain = LAYOUT.arrayElementVarHandle(PathElement.groupElement("update_grain"));
    /// The [VarHandle] of `reserved` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_reserved = LAYOUT.arrayElementVarHandle(PathElement.groupElement("reserved"));

    /// Creates `StdVideoAV1FilmGrainFlags` with the given segment.
    /// @param segment the memory segment
    public StdVideoAV1FilmGrainFlags(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `StdVideoAV1FilmGrainFlags` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoAV1FilmGrainFlags of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new StdVideoAV1FilmGrainFlags(segment); }

    /// Creates `StdVideoAV1FilmGrainFlags` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoAV1FilmGrainFlags ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new StdVideoAV1FilmGrainFlags(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `StdVideoAV1FilmGrainFlags` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoAV1FilmGrainFlags ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new StdVideoAV1FilmGrainFlags(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `StdVideoAV1FilmGrainFlags` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoAV1FilmGrainFlags`
    public static StdVideoAV1FilmGrainFlags alloc(SegmentAllocator allocator) { return new StdVideoAV1FilmGrainFlags(allocator.allocate(LAYOUT)); }

    /// Allocates a `StdVideoAV1FilmGrainFlags` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `StdVideoAV1FilmGrainFlags`
    public static StdVideoAV1FilmGrainFlags alloc(SegmentAllocator allocator, long count) { return new StdVideoAV1FilmGrainFlags(allocator.allocate(LAYOUT, count)); }

    /// {@return `chroma_scaling_from_luma` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_chroma_scaling_from_luma(MemorySegment segment, long index) { return (int) VH_chroma_scaling_from_luma.get(segment, 0L, index); }
    /// {@return `chroma_scaling_from_luma`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_chroma_scaling_from_luma(MemorySegment segment) { return StdVideoAV1FilmGrainFlags.get_chroma_scaling_from_luma(segment, 0L); }
    /// {@return `chroma_scaling_from_luma` at the given index}
    /// @param index the index
    public @CType("uint32_t : 1") int chroma_scaling_from_lumaAt(long index) { return StdVideoAV1FilmGrainFlags.get_chroma_scaling_from_luma(this.segment(), index); }
    /// {@return `chroma_scaling_from_luma`}
    public @CType("uint32_t : 1") int chroma_scaling_from_luma() { return StdVideoAV1FilmGrainFlags.get_chroma_scaling_from_luma(this.segment()); }
    /// Sets `chroma_scaling_from_luma` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_chroma_scaling_from_luma(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_chroma_scaling_from_luma.set(segment, 0L, index, value); }
    /// Sets `chroma_scaling_from_luma` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_chroma_scaling_from_luma(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoAV1FilmGrainFlags.set_chroma_scaling_from_luma(segment, 0L, value); }
    /// Sets `chroma_scaling_from_luma` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoAV1FilmGrainFlags chroma_scaling_from_lumaAt(long index, @CType("uint32_t : 1") int value) { StdVideoAV1FilmGrainFlags.set_chroma_scaling_from_luma(this.segment(), index, value); return this; }
    /// Sets `chroma_scaling_from_luma` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoAV1FilmGrainFlags chroma_scaling_from_luma(@CType("uint32_t : 1") int value) { StdVideoAV1FilmGrainFlags.set_chroma_scaling_from_luma(this.segment(), value); return this; }

    /// {@return `overlap_flag` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_overlap_flag(MemorySegment segment, long index) { return (int) VH_overlap_flag.get(segment, 0L, index); }
    /// {@return `overlap_flag`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_overlap_flag(MemorySegment segment) { return StdVideoAV1FilmGrainFlags.get_overlap_flag(segment, 0L); }
    /// {@return `overlap_flag` at the given index}
    /// @param index the index
    public @CType("uint32_t : 1") int overlap_flagAt(long index) { return StdVideoAV1FilmGrainFlags.get_overlap_flag(this.segment(), index); }
    /// {@return `overlap_flag`}
    public @CType("uint32_t : 1") int overlap_flag() { return StdVideoAV1FilmGrainFlags.get_overlap_flag(this.segment()); }
    /// Sets `overlap_flag` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_overlap_flag(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_overlap_flag.set(segment, 0L, index, value); }
    /// Sets `overlap_flag` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_overlap_flag(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoAV1FilmGrainFlags.set_overlap_flag(segment, 0L, value); }
    /// Sets `overlap_flag` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoAV1FilmGrainFlags overlap_flagAt(long index, @CType("uint32_t : 1") int value) { StdVideoAV1FilmGrainFlags.set_overlap_flag(this.segment(), index, value); return this; }
    /// Sets `overlap_flag` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoAV1FilmGrainFlags overlap_flag(@CType("uint32_t : 1") int value) { StdVideoAV1FilmGrainFlags.set_overlap_flag(this.segment(), value); return this; }

    /// {@return `clip_to_restricted_range` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_clip_to_restricted_range(MemorySegment segment, long index) { return (int) VH_clip_to_restricted_range.get(segment, 0L, index); }
    /// {@return `clip_to_restricted_range`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_clip_to_restricted_range(MemorySegment segment) { return StdVideoAV1FilmGrainFlags.get_clip_to_restricted_range(segment, 0L); }
    /// {@return `clip_to_restricted_range` at the given index}
    /// @param index the index
    public @CType("uint32_t : 1") int clip_to_restricted_rangeAt(long index) { return StdVideoAV1FilmGrainFlags.get_clip_to_restricted_range(this.segment(), index); }
    /// {@return `clip_to_restricted_range`}
    public @CType("uint32_t : 1") int clip_to_restricted_range() { return StdVideoAV1FilmGrainFlags.get_clip_to_restricted_range(this.segment()); }
    /// Sets `clip_to_restricted_range` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_clip_to_restricted_range(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_clip_to_restricted_range.set(segment, 0L, index, value); }
    /// Sets `clip_to_restricted_range` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_clip_to_restricted_range(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoAV1FilmGrainFlags.set_clip_to_restricted_range(segment, 0L, value); }
    /// Sets `clip_to_restricted_range` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoAV1FilmGrainFlags clip_to_restricted_rangeAt(long index, @CType("uint32_t : 1") int value) { StdVideoAV1FilmGrainFlags.set_clip_to_restricted_range(this.segment(), index, value); return this; }
    /// Sets `clip_to_restricted_range` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoAV1FilmGrainFlags clip_to_restricted_range(@CType("uint32_t : 1") int value) { StdVideoAV1FilmGrainFlags.set_clip_to_restricted_range(this.segment(), value); return this; }

    /// {@return `update_grain` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_update_grain(MemorySegment segment, long index) { return (int) VH_update_grain.get(segment, 0L, index); }
    /// {@return `update_grain`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_update_grain(MemorySegment segment) { return StdVideoAV1FilmGrainFlags.get_update_grain(segment, 0L); }
    /// {@return `update_grain` at the given index}
    /// @param index the index
    public @CType("uint32_t : 1") int update_grainAt(long index) { return StdVideoAV1FilmGrainFlags.get_update_grain(this.segment(), index); }
    /// {@return `update_grain`}
    public @CType("uint32_t : 1") int update_grain() { return StdVideoAV1FilmGrainFlags.get_update_grain(this.segment()); }
    /// Sets `update_grain` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_update_grain(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_update_grain.set(segment, 0L, index, value); }
    /// Sets `update_grain` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_update_grain(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoAV1FilmGrainFlags.set_update_grain(segment, 0L, value); }
    /// Sets `update_grain` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoAV1FilmGrainFlags update_grainAt(long index, @CType("uint32_t : 1") int value) { StdVideoAV1FilmGrainFlags.set_update_grain(this.segment(), index, value); return this; }
    /// Sets `update_grain` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoAV1FilmGrainFlags update_grain(@CType("uint32_t : 1") int value) { StdVideoAV1FilmGrainFlags.set_update_grain(this.segment(), value); return this; }

    /// {@return `reserved` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 28") int get_reserved(MemorySegment segment, long index) { return (int) VH_reserved.get(segment, 0L, index); }
    /// {@return `reserved`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 28") int get_reserved(MemorySegment segment) { return StdVideoAV1FilmGrainFlags.get_reserved(segment, 0L); }
    /// {@return `reserved` at the given index}
    /// @param index the index
    public @CType("uint32_t : 28") int reservedAt(long index) { return StdVideoAV1FilmGrainFlags.get_reserved(this.segment(), index); }
    /// {@return `reserved`}
    public @CType("uint32_t : 28") int reserved() { return StdVideoAV1FilmGrainFlags.get_reserved(this.segment()); }
    /// Sets `reserved` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_reserved(MemorySegment segment, long index, @CType("uint32_t : 28") int value) { VH_reserved.set(segment, 0L, index, value); }
    /// Sets `reserved` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_reserved(MemorySegment segment, @CType("uint32_t : 28") int value) { StdVideoAV1FilmGrainFlags.set_reserved(segment, 0L, value); }
    /// Sets `reserved` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoAV1FilmGrainFlags reservedAt(long index, @CType("uint32_t : 28") int value) { StdVideoAV1FilmGrainFlags.set_reserved(this.segment(), index, value); return this; }
    /// Sets `reserved` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoAV1FilmGrainFlags reserved(@CType("uint32_t : 28") int value) { StdVideoAV1FilmGrainFlags.set_reserved(this.segment(), value); return this; }

}
