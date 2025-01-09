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
/// ### mono_chrome
/// [VarHandle][#VH_mono_chrome] - [Getter][#mono_chrome()] - [Setter][#mono_chrome(int)]
/// ### color_range
/// [VarHandle][#VH_color_range] - [Getter][#color_range()] - [Setter][#color_range(int)]
/// ### separate_uv_delta_q
/// [VarHandle][#VH_separate_uv_delta_q] - [Getter][#separate_uv_delta_q()] - [Setter][#separate_uv_delta_q(int)]
/// ### color_description_present_flag
/// [VarHandle][#VH_color_description_present_flag] - [Getter][#color_description_present_flag()] - [Setter][#color_description_present_flag(int)]
/// ### reserved
/// [VarHandle][#VH_reserved] - [Getter][#reserved()] - [Setter][#reserved(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct StdVideoAV1ColorConfigFlags {
///     uint32_t : 1 mono_chrome;
///     uint32_t : 1 color_range;
///     uint32_t : 1 separate_uv_delta_q;
///     uint32_t : 1 color_description_present_flag;
///     uint32_t : 28 reserved;
/// } StdVideoAV1ColorConfigFlags;
/// ```
public final class StdVideoAV1ColorConfigFlags extends Struct {
    /// The struct layout of `StdVideoAV1ColorConfigFlags`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("mono_chrome"),
        ValueLayout.JAVA_INT.withName("color_range"),
        ValueLayout.JAVA_INT.withName("separate_uv_delta_q"),
        ValueLayout.JAVA_INT.withName("color_description_present_flag"),
        ValueLayout.JAVA_INT.withName("reserved")
    );
    /// The [VarHandle] of `mono_chrome` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_mono_chrome = LAYOUT.arrayElementVarHandle(PathElement.groupElement("mono_chrome"));
    /// The [VarHandle] of `color_range` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_color_range = LAYOUT.arrayElementVarHandle(PathElement.groupElement("color_range"));
    /// The [VarHandle] of `separate_uv_delta_q` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_separate_uv_delta_q = LAYOUT.arrayElementVarHandle(PathElement.groupElement("separate_uv_delta_q"));
    /// The [VarHandle] of `color_description_present_flag` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_color_description_present_flag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("color_description_present_flag"));
    /// The [VarHandle] of `reserved` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_reserved = LAYOUT.arrayElementVarHandle(PathElement.groupElement("reserved"));

    /// Creates `StdVideoAV1ColorConfigFlags` with the given segment.
    /// @param segment the memory segment
    public StdVideoAV1ColorConfigFlags(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `StdVideoAV1ColorConfigFlags` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoAV1ColorConfigFlags of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new StdVideoAV1ColorConfigFlags(segment); }

    /// Creates `StdVideoAV1ColorConfigFlags` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoAV1ColorConfigFlags ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new StdVideoAV1ColorConfigFlags(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `StdVideoAV1ColorConfigFlags` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoAV1ColorConfigFlags ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new StdVideoAV1ColorConfigFlags(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `StdVideoAV1ColorConfigFlags` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoAV1ColorConfigFlags`
    public static StdVideoAV1ColorConfigFlags alloc(SegmentAllocator allocator) { return new StdVideoAV1ColorConfigFlags(allocator.allocate(LAYOUT)); }

    /// Allocates a `StdVideoAV1ColorConfigFlags` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `StdVideoAV1ColorConfigFlags`
    public static StdVideoAV1ColorConfigFlags alloc(SegmentAllocator allocator, long count) { return new StdVideoAV1ColorConfigFlags(allocator.allocate(LAYOUT, count)); }

    /// {@return `mono_chrome` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_mono_chrome(MemorySegment segment, long index) { return (int) VH_mono_chrome.get(segment, 0L, index); }
    /// {@return `mono_chrome`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_mono_chrome(MemorySegment segment) { return StdVideoAV1ColorConfigFlags.get_mono_chrome(segment, 0L); }
    /// {@return `mono_chrome` at the given index}
    /// @param index the index
    public @CType("uint32_t : 1") int mono_chromeAt(long index) { return StdVideoAV1ColorConfigFlags.get_mono_chrome(this.segment(), index); }
    /// {@return `mono_chrome`}
    public @CType("uint32_t : 1") int mono_chrome() { return StdVideoAV1ColorConfigFlags.get_mono_chrome(this.segment()); }
    /// Sets `mono_chrome` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_mono_chrome(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_mono_chrome.set(segment, 0L, index, value); }
    /// Sets `mono_chrome` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_mono_chrome(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoAV1ColorConfigFlags.set_mono_chrome(segment, 0L, value); }
    /// Sets `mono_chrome` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoAV1ColorConfigFlags mono_chromeAt(long index, @CType("uint32_t : 1") int value) { StdVideoAV1ColorConfigFlags.set_mono_chrome(this.segment(), index, value); return this; }
    /// Sets `mono_chrome` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoAV1ColorConfigFlags mono_chrome(@CType("uint32_t : 1") int value) { StdVideoAV1ColorConfigFlags.set_mono_chrome(this.segment(), value); return this; }

    /// {@return `color_range` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_color_range(MemorySegment segment, long index) { return (int) VH_color_range.get(segment, 0L, index); }
    /// {@return `color_range`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_color_range(MemorySegment segment) { return StdVideoAV1ColorConfigFlags.get_color_range(segment, 0L); }
    /// {@return `color_range` at the given index}
    /// @param index the index
    public @CType("uint32_t : 1") int color_rangeAt(long index) { return StdVideoAV1ColorConfigFlags.get_color_range(this.segment(), index); }
    /// {@return `color_range`}
    public @CType("uint32_t : 1") int color_range() { return StdVideoAV1ColorConfigFlags.get_color_range(this.segment()); }
    /// Sets `color_range` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_color_range(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_color_range.set(segment, 0L, index, value); }
    /// Sets `color_range` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_color_range(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoAV1ColorConfigFlags.set_color_range(segment, 0L, value); }
    /// Sets `color_range` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoAV1ColorConfigFlags color_rangeAt(long index, @CType("uint32_t : 1") int value) { StdVideoAV1ColorConfigFlags.set_color_range(this.segment(), index, value); return this; }
    /// Sets `color_range` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoAV1ColorConfigFlags color_range(@CType("uint32_t : 1") int value) { StdVideoAV1ColorConfigFlags.set_color_range(this.segment(), value); return this; }

    /// {@return `separate_uv_delta_q` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_separate_uv_delta_q(MemorySegment segment, long index) { return (int) VH_separate_uv_delta_q.get(segment, 0L, index); }
    /// {@return `separate_uv_delta_q`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_separate_uv_delta_q(MemorySegment segment) { return StdVideoAV1ColorConfigFlags.get_separate_uv_delta_q(segment, 0L); }
    /// {@return `separate_uv_delta_q` at the given index}
    /// @param index the index
    public @CType("uint32_t : 1") int separate_uv_delta_qAt(long index) { return StdVideoAV1ColorConfigFlags.get_separate_uv_delta_q(this.segment(), index); }
    /// {@return `separate_uv_delta_q`}
    public @CType("uint32_t : 1") int separate_uv_delta_q() { return StdVideoAV1ColorConfigFlags.get_separate_uv_delta_q(this.segment()); }
    /// Sets `separate_uv_delta_q` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_separate_uv_delta_q(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_separate_uv_delta_q.set(segment, 0L, index, value); }
    /// Sets `separate_uv_delta_q` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_separate_uv_delta_q(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoAV1ColorConfigFlags.set_separate_uv_delta_q(segment, 0L, value); }
    /// Sets `separate_uv_delta_q` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoAV1ColorConfigFlags separate_uv_delta_qAt(long index, @CType("uint32_t : 1") int value) { StdVideoAV1ColorConfigFlags.set_separate_uv_delta_q(this.segment(), index, value); return this; }
    /// Sets `separate_uv_delta_q` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoAV1ColorConfigFlags separate_uv_delta_q(@CType("uint32_t : 1") int value) { StdVideoAV1ColorConfigFlags.set_separate_uv_delta_q(this.segment(), value); return this; }

    /// {@return `color_description_present_flag` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_color_description_present_flag(MemorySegment segment, long index) { return (int) VH_color_description_present_flag.get(segment, 0L, index); }
    /// {@return `color_description_present_flag`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_color_description_present_flag(MemorySegment segment) { return StdVideoAV1ColorConfigFlags.get_color_description_present_flag(segment, 0L); }
    /// {@return `color_description_present_flag` at the given index}
    /// @param index the index
    public @CType("uint32_t : 1") int color_description_present_flagAt(long index) { return StdVideoAV1ColorConfigFlags.get_color_description_present_flag(this.segment(), index); }
    /// {@return `color_description_present_flag`}
    public @CType("uint32_t : 1") int color_description_present_flag() { return StdVideoAV1ColorConfigFlags.get_color_description_present_flag(this.segment()); }
    /// Sets `color_description_present_flag` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_color_description_present_flag(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_color_description_present_flag.set(segment, 0L, index, value); }
    /// Sets `color_description_present_flag` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_color_description_present_flag(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoAV1ColorConfigFlags.set_color_description_present_flag(segment, 0L, value); }
    /// Sets `color_description_present_flag` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoAV1ColorConfigFlags color_description_present_flagAt(long index, @CType("uint32_t : 1") int value) { StdVideoAV1ColorConfigFlags.set_color_description_present_flag(this.segment(), index, value); return this; }
    /// Sets `color_description_present_flag` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoAV1ColorConfigFlags color_description_present_flag(@CType("uint32_t : 1") int value) { StdVideoAV1ColorConfigFlags.set_color_description_present_flag(this.segment(), value); return this; }

    /// {@return `reserved` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 28") int get_reserved(MemorySegment segment, long index) { return (int) VH_reserved.get(segment, 0L, index); }
    /// {@return `reserved`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 28") int get_reserved(MemorySegment segment) { return StdVideoAV1ColorConfigFlags.get_reserved(segment, 0L); }
    /// {@return `reserved` at the given index}
    /// @param index the index
    public @CType("uint32_t : 28") int reservedAt(long index) { return StdVideoAV1ColorConfigFlags.get_reserved(this.segment(), index); }
    /// {@return `reserved`}
    public @CType("uint32_t : 28") int reserved() { return StdVideoAV1ColorConfigFlags.get_reserved(this.segment()); }
    /// Sets `reserved` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_reserved(MemorySegment segment, long index, @CType("uint32_t : 28") int value) { VH_reserved.set(segment, 0L, index, value); }
    /// Sets `reserved` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_reserved(MemorySegment segment, @CType("uint32_t : 28") int value) { StdVideoAV1ColorConfigFlags.set_reserved(segment, 0L, value); }
    /// Sets `reserved` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoAV1ColorConfigFlags reservedAt(long index, @CType("uint32_t : 28") int value) { StdVideoAV1ColorConfigFlags.set_reserved(this.segment(), index, value); return this; }
    /// Sets `reserved` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoAV1ColorConfigFlags reserved(@CType("uint32_t : 28") int value) { StdVideoAV1ColorConfigFlags.set_reserved(this.segment(), value); return this; }

}
