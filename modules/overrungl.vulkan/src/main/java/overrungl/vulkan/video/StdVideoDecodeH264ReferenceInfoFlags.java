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
/// ### top_field_flag
/// [VarHandle][#VH_top_field_flag] - [Getter][#top_field_flag()] - [Setter][#top_field_flag(int)]
/// ### bottom_field_flag
/// [VarHandle][#VH_bottom_field_flag] - [Getter][#bottom_field_flag()] - [Setter][#bottom_field_flag(int)]
/// ### used_for_long_term_reference
/// [VarHandle][#VH_used_for_long_term_reference] - [Getter][#used_for_long_term_reference()] - [Setter][#used_for_long_term_reference(int)]
/// ### is_non_existing
/// [VarHandle][#VH_is_non_existing] - [Getter][#is_non_existing()] - [Setter][#is_non_existing(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct StdVideoDecodeH264ReferenceInfoFlags {
///     uint32_t : 1 top_field_flag;
///     uint32_t : 1 bottom_field_flag;
///     uint32_t : 1 used_for_long_term_reference;
///     uint32_t : 1 is_non_existing;
/// } StdVideoDecodeH264ReferenceInfoFlags;
/// ```
public final class StdVideoDecodeH264ReferenceInfoFlags extends Struct {
    /// The struct layout of `StdVideoDecodeH264ReferenceInfoFlags`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("top_field_flag"),
        ValueLayout.JAVA_INT.withName("bottom_field_flag"),
        ValueLayout.JAVA_INT.withName("used_for_long_term_reference"),
        ValueLayout.JAVA_INT.withName("is_non_existing")
    );
    /// The [VarHandle] of `top_field_flag` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_top_field_flag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("top_field_flag"));
    /// The [VarHandle] of `bottom_field_flag` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_bottom_field_flag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("bottom_field_flag"));
    /// The [VarHandle] of `used_for_long_term_reference` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_used_for_long_term_reference = LAYOUT.arrayElementVarHandle(PathElement.groupElement("used_for_long_term_reference"));
    /// The [VarHandle] of `is_non_existing` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_is_non_existing = LAYOUT.arrayElementVarHandle(PathElement.groupElement("is_non_existing"));

    /// Creates `StdVideoDecodeH264ReferenceInfoFlags` with the given segment.
    /// @param segment the memory segment
    public StdVideoDecodeH264ReferenceInfoFlags(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `StdVideoDecodeH264ReferenceInfoFlags` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoDecodeH264ReferenceInfoFlags of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new StdVideoDecodeH264ReferenceInfoFlags(segment); }

    /// Creates `StdVideoDecodeH264ReferenceInfoFlags` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoDecodeH264ReferenceInfoFlags ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new StdVideoDecodeH264ReferenceInfoFlags(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `StdVideoDecodeH264ReferenceInfoFlags` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoDecodeH264ReferenceInfoFlags ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new StdVideoDecodeH264ReferenceInfoFlags(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `StdVideoDecodeH264ReferenceInfoFlags` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoDecodeH264ReferenceInfoFlags`
    public static StdVideoDecodeH264ReferenceInfoFlags alloc(SegmentAllocator allocator) { return new StdVideoDecodeH264ReferenceInfoFlags(allocator.allocate(LAYOUT)); }

    /// Allocates a `StdVideoDecodeH264ReferenceInfoFlags` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `StdVideoDecodeH264ReferenceInfoFlags`
    public static StdVideoDecodeH264ReferenceInfoFlags alloc(SegmentAllocator allocator, long count) { return new StdVideoDecodeH264ReferenceInfoFlags(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `StdVideoDecodeH264ReferenceInfoFlags`.
    /// @param index the index of the struct buffer
    /// @return the slice of `StdVideoDecodeH264ReferenceInfoFlags`
    public StdVideoDecodeH264ReferenceInfoFlags asSlice(long index) { return new StdVideoDecodeH264ReferenceInfoFlags(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `StdVideoDecodeH264ReferenceInfoFlags`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `StdVideoDecodeH264ReferenceInfoFlags`
    public StdVideoDecodeH264ReferenceInfoFlags asSlice(long index, long count) { return new StdVideoDecodeH264ReferenceInfoFlags(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

    /// {@return `top_field_flag` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_top_field_flag(MemorySegment segment, long index) { return (int) VH_top_field_flag.get(segment, 0L, index); }
    /// {@return `top_field_flag`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_top_field_flag(MemorySegment segment) { return StdVideoDecodeH264ReferenceInfoFlags.get_top_field_flag(segment, 0L); }
    /// {@return `top_field_flag` at the given index}
    /// @param index the index
    public @CType("uint32_t : 1") int top_field_flagAt(long index) { return StdVideoDecodeH264ReferenceInfoFlags.get_top_field_flag(this.segment(), index); }
    /// {@return `top_field_flag`}
    public @CType("uint32_t : 1") int top_field_flag() { return StdVideoDecodeH264ReferenceInfoFlags.get_top_field_flag(this.segment()); }
    /// Sets `top_field_flag` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_top_field_flag(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_top_field_flag.set(segment, 0L, index, value); }
    /// Sets `top_field_flag` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_top_field_flag(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoDecodeH264ReferenceInfoFlags.set_top_field_flag(segment, 0L, value); }
    /// Sets `top_field_flag` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoDecodeH264ReferenceInfoFlags top_field_flagAt(long index, @CType("uint32_t : 1") int value) { StdVideoDecodeH264ReferenceInfoFlags.set_top_field_flag(this.segment(), index, value); return this; }
    /// Sets `top_field_flag` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoDecodeH264ReferenceInfoFlags top_field_flag(@CType("uint32_t : 1") int value) { StdVideoDecodeH264ReferenceInfoFlags.set_top_field_flag(this.segment(), value); return this; }

    /// {@return `bottom_field_flag` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_bottom_field_flag(MemorySegment segment, long index) { return (int) VH_bottom_field_flag.get(segment, 0L, index); }
    /// {@return `bottom_field_flag`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_bottom_field_flag(MemorySegment segment) { return StdVideoDecodeH264ReferenceInfoFlags.get_bottom_field_flag(segment, 0L); }
    /// {@return `bottom_field_flag` at the given index}
    /// @param index the index
    public @CType("uint32_t : 1") int bottom_field_flagAt(long index) { return StdVideoDecodeH264ReferenceInfoFlags.get_bottom_field_flag(this.segment(), index); }
    /// {@return `bottom_field_flag`}
    public @CType("uint32_t : 1") int bottom_field_flag() { return StdVideoDecodeH264ReferenceInfoFlags.get_bottom_field_flag(this.segment()); }
    /// Sets `bottom_field_flag` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_bottom_field_flag(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_bottom_field_flag.set(segment, 0L, index, value); }
    /// Sets `bottom_field_flag` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_bottom_field_flag(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoDecodeH264ReferenceInfoFlags.set_bottom_field_flag(segment, 0L, value); }
    /// Sets `bottom_field_flag` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoDecodeH264ReferenceInfoFlags bottom_field_flagAt(long index, @CType("uint32_t : 1") int value) { StdVideoDecodeH264ReferenceInfoFlags.set_bottom_field_flag(this.segment(), index, value); return this; }
    /// Sets `bottom_field_flag` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoDecodeH264ReferenceInfoFlags bottom_field_flag(@CType("uint32_t : 1") int value) { StdVideoDecodeH264ReferenceInfoFlags.set_bottom_field_flag(this.segment(), value); return this; }

    /// {@return `used_for_long_term_reference` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_used_for_long_term_reference(MemorySegment segment, long index) { return (int) VH_used_for_long_term_reference.get(segment, 0L, index); }
    /// {@return `used_for_long_term_reference`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_used_for_long_term_reference(MemorySegment segment) { return StdVideoDecodeH264ReferenceInfoFlags.get_used_for_long_term_reference(segment, 0L); }
    /// {@return `used_for_long_term_reference` at the given index}
    /// @param index the index
    public @CType("uint32_t : 1") int used_for_long_term_referenceAt(long index) { return StdVideoDecodeH264ReferenceInfoFlags.get_used_for_long_term_reference(this.segment(), index); }
    /// {@return `used_for_long_term_reference`}
    public @CType("uint32_t : 1") int used_for_long_term_reference() { return StdVideoDecodeH264ReferenceInfoFlags.get_used_for_long_term_reference(this.segment()); }
    /// Sets `used_for_long_term_reference` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_used_for_long_term_reference(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_used_for_long_term_reference.set(segment, 0L, index, value); }
    /// Sets `used_for_long_term_reference` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_used_for_long_term_reference(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoDecodeH264ReferenceInfoFlags.set_used_for_long_term_reference(segment, 0L, value); }
    /// Sets `used_for_long_term_reference` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoDecodeH264ReferenceInfoFlags used_for_long_term_referenceAt(long index, @CType("uint32_t : 1") int value) { StdVideoDecodeH264ReferenceInfoFlags.set_used_for_long_term_reference(this.segment(), index, value); return this; }
    /// Sets `used_for_long_term_reference` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoDecodeH264ReferenceInfoFlags used_for_long_term_reference(@CType("uint32_t : 1") int value) { StdVideoDecodeH264ReferenceInfoFlags.set_used_for_long_term_reference(this.segment(), value); return this; }

    /// {@return `is_non_existing` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_is_non_existing(MemorySegment segment, long index) { return (int) VH_is_non_existing.get(segment, 0L, index); }
    /// {@return `is_non_existing`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_is_non_existing(MemorySegment segment) { return StdVideoDecodeH264ReferenceInfoFlags.get_is_non_existing(segment, 0L); }
    /// {@return `is_non_existing` at the given index}
    /// @param index the index
    public @CType("uint32_t : 1") int is_non_existingAt(long index) { return StdVideoDecodeH264ReferenceInfoFlags.get_is_non_existing(this.segment(), index); }
    /// {@return `is_non_existing`}
    public @CType("uint32_t : 1") int is_non_existing() { return StdVideoDecodeH264ReferenceInfoFlags.get_is_non_existing(this.segment()); }
    /// Sets `is_non_existing` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_is_non_existing(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_is_non_existing.set(segment, 0L, index, value); }
    /// Sets `is_non_existing` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_is_non_existing(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoDecodeH264ReferenceInfoFlags.set_is_non_existing(segment, 0L, value); }
    /// Sets `is_non_existing` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoDecodeH264ReferenceInfoFlags is_non_existingAt(long index, @CType("uint32_t : 1") int value) { StdVideoDecodeH264ReferenceInfoFlags.set_is_non_existing(this.segment(), index, value); return this; }
    /// Sets `is_non_existing` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoDecodeH264ReferenceInfoFlags is_non_existing(@CType("uint32_t : 1") int value) { StdVideoDecodeH264ReferenceInfoFlags.set_is_non_existing(this.segment(), value); return this; }

}
