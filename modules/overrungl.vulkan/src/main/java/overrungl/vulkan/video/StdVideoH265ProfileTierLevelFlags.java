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
/// ### general_tier_flag
/// [VarHandle][#VH_general_tier_flag] - [Getter][#general_tier_flag()] - [Setter][#general_tier_flag(int)]
/// ### general_progressive_source_flag
/// [VarHandle][#VH_general_progressive_source_flag] - [Getter][#general_progressive_source_flag()] - [Setter][#general_progressive_source_flag(int)]
/// ### general_interlaced_source_flag
/// [VarHandle][#VH_general_interlaced_source_flag] - [Getter][#general_interlaced_source_flag()] - [Setter][#general_interlaced_source_flag(int)]
/// ### general_non_packed_constraint_flag
/// [VarHandle][#VH_general_non_packed_constraint_flag] - [Getter][#general_non_packed_constraint_flag()] - [Setter][#general_non_packed_constraint_flag(int)]
/// ### general_frame_only_constraint_flag
/// [VarHandle][#VH_general_frame_only_constraint_flag] - [Getter][#general_frame_only_constraint_flag()] - [Setter][#general_frame_only_constraint_flag(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct StdVideoH265ProfileTierLevelFlags {
///     uint32_t : 1 general_tier_flag;
///     uint32_t : 1 general_progressive_source_flag;
///     uint32_t : 1 general_interlaced_source_flag;
///     uint32_t : 1 general_non_packed_constraint_flag;
///     uint32_t : 1 general_frame_only_constraint_flag;
/// } StdVideoH265ProfileTierLevelFlags;
/// ```
public sealed class StdVideoH265ProfileTierLevelFlags extends Struct {
    /// The struct layout of `StdVideoH265ProfileTierLevelFlags`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("general_tier_flag"),
        ValueLayout.JAVA_INT.withName("general_progressive_source_flag"),
        ValueLayout.JAVA_INT.withName("general_interlaced_source_flag"),
        ValueLayout.JAVA_INT.withName("general_non_packed_constraint_flag"),
        ValueLayout.JAVA_INT.withName("general_frame_only_constraint_flag")
    );
    /// The [VarHandle] of `general_tier_flag` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_general_tier_flag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("general_tier_flag"));
    /// The [VarHandle] of `general_progressive_source_flag` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_general_progressive_source_flag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("general_progressive_source_flag"));
    /// The [VarHandle] of `general_interlaced_source_flag` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_general_interlaced_source_flag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("general_interlaced_source_flag"));
    /// The [VarHandle] of `general_non_packed_constraint_flag` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_general_non_packed_constraint_flag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("general_non_packed_constraint_flag"));
    /// The [VarHandle] of `general_frame_only_constraint_flag` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_general_frame_only_constraint_flag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("general_frame_only_constraint_flag"));

    /// Creates `StdVideoH265ProfileTierLevelFlags` with the given segment.
    /// @param segment the memory segment
    public StdVideoH265ProfileTierLevelFlags(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `StdVideoH265ProfileTierLevelFlags` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoH265ProfileTierLevelFlags of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new StdVideoH265ProfileTierLevelFlags(segment); }

    /// Creates `StdVideoH265ProfileTierLevelFlags` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `StdVideoH265ProfileTierLevelFlags` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoH265ProfileTierLevelFlags ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new StdVideoH265ProfileTierLevelFlags(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `StdVideoH265ProfileTierLevelFlags` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `StdVideoH265ProfileTierLevelFlags` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoH265ProfileTierLevelFlags`
    public static StdVideoH265ProfileTierLevelFlags alloc(SegmentAllocator allocator) { return new StdVideoH265ProfileTierLevelFlags(allocator.allocate(LAYOUT)); }

    /// Allocates a `StdVideoH265ProfileTierLevelFlags` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `StdVideoH265ProfileTierLevelFlags`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `StdVideoH265ProfileTierLevelFlags` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoH265ProfileTierLevelFlags`
    public static StdVideoH265ProfileTierLevelFlags allocInit(SegmentAllocator allocator, @CType("uint32_t : 1") int general_tier_flag, @CType("uint32_t : 1") int general_progressive_source_flag, @CType("uint32_t : 1") int general_interlaced_source_flag, @CType("uint32_t : 1") int general_non_packed_constraint_flag, @CType("uint32_t : 1") int general_frame_only_constraint_flag) { return alloc(allocator).general_tier_flag(general_tier_flag).general_progressive_source_flag(general_progressive_source_flag).general_interlaced_source_flag(general_interlaced_source_flag).general_non_packed_constraint_flag(general_non_packed_constraint_flag).general_frame_only_constraint_flag(general_frame_only_constraint_flag); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public StdVideoH265ProfileTierLevelFlags copyFrom(StdVideoH265ProfileTierLevelFlags src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `general_tier_flag` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_general_tier_flag(MemorySegment segment, long index) { return (int) VH_general_tier_flag.get(segment, 0L, index); }
    /// {@return `general_tier_flag`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_general_tier_flag(MemorySegment segment) { return StdVideoH265ProfileTierLevelFlags.get_general_tier_flag(segment, 0L); }
    /// {@return `general_tier_flag`}
    public @CType("uint32_t : 1") int general_tier_flag() { return StdVideoH265ProfileTierLevelFlags.get_general_tier_flag(this.segment()); }
    /// Sets `general_tier_flag` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_general_tier_flag(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_general_tier_flag.set(segment, 0L, index, value); }
    /// Sets `general_tier_flag` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_general_tier_flag(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoH265ProfileTierLevelFlags.set_general_tier_flag(segment, 0L, value); }
    /// Sets `general_tier_flag` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265ProfileTierLevelFlags general_tier_flag(@CType("uint32_t : 1") int value) { StdVideoH265ProfileTierLevelFlags.set_general_tier_flag(this.segment(), value); return this; }

    /// {@return `general_progressive_source_flag` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_general_progressive_source_flag(MemorySegment segment, long index) { return (int) VH_general_progressive_source_flag.get(segment, 0L, index); }
    /// {@return `general_progressive_source_flag`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_general_progressive_source_flag(MemorySegment segment) { return StdVideoH265ProfileTierLevelFlags.get_general_progressive_source_flag(segment, 0L); }
    /// {@return `general_progressive_source_flag`}
    public @CType("uint32_t : 1") int general_progressive_source_flag() { return StdVideoH265ProfileTierLevelFlags.get_general_progressive_source_flag(this.segment()); }
    /// Sets `general_progressive_source_flag` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_general_progressive_source_flag(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_general_progressive_source_flag.set(segment, 0L, index, value); }
    /// Sets `general_progressive_source_flag` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_general_progressive_source_flag(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoH265ProfileTierLevelFlags.set_general_progressive_source_flag(segment, 0L, value); }
    /// Sets `general_progressive_source_flag` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265ProfileTierLevelFlags general_progressive_source_flag(@CType("uint32_t : 1") int value) { StdVideoH265ProfileTierLevelFlags.set_general_progressive_source_flag(this.segment(), value); return this; }

    /// {@return `general_interlaced_source_flag` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_general_interlaced_source_flag(MemorySegment segment, long index) { return (int) VH_general_interlaced_source_flag.get(segment, 0L, index); }
    /// {@return `general_interlaced_source_flag`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_general_interlaced_source_flag(MemorySegment segment) { return StdVideoH265ProfileTierLevelFlags.get_general_interlaced_source_flag(segment, 0L); }
    /// {@return `general_interlaced_source_flag`}
    public @CType("uint32_t : 1") int general_interlaced_source_flag() { return StdVideoH265ProfileTierLevelFlags.get_general_interlaced_source_flag(this.segment()); }
    /// Sets `general_interlaced_source_flag` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_general_interlaced_source_flag(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_general_interlaced_source_flag.set(segment, 0L, index, value); }
    /// Sets `general_interlaced_source_flag` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_general_interlaced_source_flag(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoH265ProfileTierLevelFlags.set_general_interlaced_source_flag(segment, 0L, value); }
    /// Sets `general_interlaced_source_flag` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265ProfileTierLevelFlags general_interlaced_source_flag(@CType("uint32_t : 1") int value) { StdVideoH265ProfileTierLevelFlags.set_general_interlaced_source_flag(this.segment(), value); return this; }

    /// {@return `general_non_packed_constraint_flag` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_general_non_packed_constraint_flag(MemorySegment segment, long index) { return (int) VH_general_non_packed_constraint_flag.get(segment, 0L, index); }
    /// {@return `general_non_packed_constraint_flag`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_general_non_packed_constraint_flag(MemorySegment segment) { return StdVideoH265ProfileTierLevelFlags.get_general_non_packed_constraint_flag(segment, 0L); }
    /// {@return `general_non_packed_constraint_flag`}
    public @CType("uint32_t : 1") int general_non_packed_constraint_flag() { return StdVideoH265ProfileTierLevelFlags.get_general_non_packed_constraint_flag(this.segment()); }
    /// Sets `general_non_packed_constraint_flag` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_general_non_packed_constraint_flag(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_general_non_packed_constraint_flag.set(segment, 0L, index, value); }
    /// Sets `general_non_packed_constraint_flag` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_general_non_packed_constraint_flag(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoH265ProfileTierLevelFlags.set_general_non_packed_constraint_flag(segment, 0L, value); }
    /// Sets `general_non_packed_constraint_flag` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265ProfileTierLevelFlags general_non_packed_constraint_flag(@CType("uint32_t : 1") int value) { StdVideoH265ProfileTierLevelFlags.set_general_non_packed_constraint_flag(this.segment(), value); return this; }

    /// {@return `general_frame_only_constraint_flag` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_general_frame_only_constraint_flag(MemorySegment segment, long index) { return (int) VH_general_frame_only_constraint_flag.get(segment, 0L, index); }
    /// {@return `general_frame_only_constraint_flag`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_general_frame_only_constraint_flag(MemorySegment segment) { return StdVideoH265ProfileTierLevelFlags.get_general_frame_only_constraint_flag(segment, 0L); }
    /// {@return `general_frame_only_constraint_flag`}
    public @CType("uint32_t : 1") int general_frame_only_constraint_flag() { return StdVideoH265ProfileTierLevelFlags.get_general_frame_only_constraint_flag(this.segment()); }
    /// Sets `general_frame_only_constraint_flag` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_general_frame_only_constraint_flag(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_general_frame_only_constraint_flag.set(segment, 0L, index, value); }
    /// Sets `general_frame_only_constraint_flag` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_general_frame_only_constraint_flag(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoH265ProfileTierLevelFlags.set_general_frame_only_constraint_flag(segment, 0L, value); }
    /// Sets `general_frame_only_constraint_flag` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265ProfileTierLevelFlags general_frame_only_constraint_flag(@CType("uint32_t : 1") int value) { StdVideoH265ProfileTierLevelFlags.set_general_frame_only_constraint_flag(this.segment(), value); return this; }

    /// A buffer of [StdVideoH265ProfileTierLevelFlags].
    public static final class Buffer extends StdVideoH265ProfileTierLevelFlags {
        private final long elementCount;

        /// Creates `StdVideoH265ProfileTierLevelFlags.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `StdVideoH265ProfileTierLevelFlags`.
        /// @param index the index of the struct buffer
        /// @return the slice of `StdVideoH265ProfileTierLevelFlags`
        public StdVideoH265ProfileTierLevelFlags asSlice(long index) { return new StdVideoH265ProfileTierLevelFlags(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `StdVideoH265ProfileTierLevelFlags`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `StdVideoH265ProfileTierLevelFlags`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `general_tier_flag` at the given index}
        /// @param index the index
        public @CType("uint32_t : 1") int general_tier_flagAt(long index) { return StdVideoH265ProfileTierLevelFlags.get_general_tier_flag(this.segment(), index); }
        /// Sets `general_tier_flag` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer general_tier_flagAt(long index, @CType("uint32_t : 1") int value) { StdVideoH265ProfileTierLevelFlags.set_general_tier_flag(this.segment(), index, value); return this; }

        /// {@return `general_progressive_source_flag` at the given index}
        /// @param index the index
        public @CType("uint32_t : 1") int general_progressive_source_flagAt(long index) { return StdVideoH265ProfileTierLevelFlags.get_general_progressive_source_flag(this.segment(), index); }
        /// Sets `general_progressive_source_flag` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer general_progressive_source_flagAt(long index, @CType("uint32_t : 1") int value) { StdVideoH265ProfileTierLevelFlags.set_general_progressive_source_flag(this.segment(), index, value); return this; }

        /// {@return `general_interlaced_source_flag` at the given index}
        /// @param index the index
        public @CType("uint32_t : 1") int general_interlaced_source_flagAt(long index) { return StdVideoH265ProfileTierLevelFlags.get_general_interlaced_source_flag(this.segment(), index); }
        /// Sets `general_interlaced_source_flag` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer general_interlaced_source_flagAt(long index, @CType("uint32_t : 1") int value) { StdVideoH265ProfileTierLevelFlags.set_general_interlaced_source_flag(this.segment(), index, value); return this; }

        /// {@return `general_non_packed_constraint_flag` at the given index}
        /// @param index the index
        public @CType("uint32_t : 1") int general_non_packed_constraint_flagAt(long index) { return StdVideoH265ProfileTierLevelFlags.get_general_non_packed_constraint_flag(this.segment(), index); }
        /// Sets `general_non_packed_constraint_flag` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer general_non_packed_constraint_flagAt(long index, @CType("uint32_t : 1") int value) { StdVideoH265ProfileTierLevelFlags.set_general_non_packed_constraint_flag(this.segment(), index, value); return this; }

        /// {@return `general_frame_only_constraint_flag` at the given index}
        /// @param index the index
        public @CType("uint32_t : 1") int general_frame_only_constraint_flagAt(long index) { return StdVideoH265ProfileTierLevelFlags.get_general_frame_only_constraint_flag(this.segment(), index); }
        /// Sets `general_frame_only_constraint_flag` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer general_frame_only_constraint_flagAt(long index, @CType("uint32_t : 1") int value) { StdVideoH265ProfileTierLevelFlags.set_general_frame_only_constraint_flag(this.segment(), index, value); return this; }

    }
}
