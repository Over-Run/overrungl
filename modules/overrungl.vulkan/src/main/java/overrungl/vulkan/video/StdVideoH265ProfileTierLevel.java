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
/// ### general_profile_idc
/// [VarHandle][#VH_general_profile_idc] - [Getter][#general_profile_idc()] - [Setter][#general_profile_idc(int)]
/// ### general_level_idc
/// [VarHandle][#VH_general_level_idc] - [Getter][#general_level_idc()] - [Setter][#general_level_idc(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct StdVideoH265ProfileTierLevel {
///     StdVideoH265ProfileTierLevelFlags flags;
///     StdVideoH265ProfileIdc general_profile_idc;
///     StdVideoH265LevelIdc general_level_idc;
/// } StdVideoH265ProfileTierLevel;
/// ```
public sealed class StdVideoH265ProfileTierLevel extends Struct {
    /// The struct layout of `StdVideoH265ProfileTierLevel`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        StdVideoH265ProfileTierLevelFlags.LAYOUT.withName("flags"),
        ValueLayout.JAVA_INT.withName("general_profile_idc"),
        ValueLayout.JAVA_INT.withName("general_level_idc")
    );
    /// The [VarHandle] of `flags` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    /// The [VarHandle] of `general_profile_idc` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_general_profile_idc = LAYOUT.arrayElementVarHandle(PathElement.groupElement("general_profile_idc"));
    /// The [VarHandle] of `general_level_idc` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_general_level_idc = LAYOUT.arrayElementVarHandle(PathElement.groupElement("general_level_idc"));

    /// Creates `StdVideoH265ProfileTierLevel` with the given segment.
    /// @param segment the memory segment
    public StdVideoH265ProfileTierLevel(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `StdVideoH265ProfileTierLevel` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoH265ProfileTierLevel of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new StdVideoH265ProfileTierLevel(segment); }

    /// Creates `StdVideoH265ProfileTierLevel` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `StdVideoH265ProfileTierLevel` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoH265ProfileTierLevel ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new StdVideoH265ProfileTierLevel(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `StdVideoH265ProfileTierLevel` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `StdVideoH265ProfileTierLevel` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoH265ProfileTierLevel`
    public static StdVideoH265ProfileTierLevel alloc(SegmentAllocator allocator) { return new StdVideoH265ProfileTierLevel(allocator.allocate(LAYOUT)); }

    /// Allocates a `StdVideoH265ProfileTierLevel` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `StdVideoH265ProfileTierLevel`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `StdVideoH265ProfileTierLevel` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoH265ProfileTierLevel`
    public static StdVideoH265ProfileTierLevel allocInit(SegmentAllocator allocator, @CType("StdVideoH265ProfileTierLevelFlags") java.lang.foreign.MemorySegment flags, @CType("StdVideoH265ProfileIdc") int general_profile_idc, @CType("StdVideoH265LevelIdc") int general_level_idc) { return alloc(allocator).flags(flags).general_profile_idc(general_profile_idc).general_level_idc(general_level_idc); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public StdVideoH265ProfileTierLevel copyFrom(StdVideoH265ProfileTierLevel src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("StdVideoH265ProfileTierLevelFlags") java.lang.foreign.MemorySegment get_flags(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_flags.get(segment, 0L, index); }
    /// {@return `flags`}
    /// @param segment the segment of the struct
    public static @CType("StdVideoH265ProfileTierLevelFlags") java.lang.foreign.MemorySegment get_flags(MemorySegment segment) { return StdVideoH265ProfileTierLevel.get_flags(segment, 0L); }
    /// {@return `flags`}
    public @CType("StdVideoH265ProfileTierLevelFlags") java.lang.foreign.MemorySegment flags() { return StdVideoH265ProfileTierLevel.get_flags(this.segment()); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_flags(MemorySegment segment, long index, @CType("StdVideoH265ProfileTierLevelFlags") java.lang.foreign.MemorySegment value) { VH_flags.set(segment, 0L, index, value); }
    /// Sets `flags` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_flags(MemorySegment segment, @CType("StdVideoH265ProfileTierLevelFlags") java.lang.foreign.MemorySegment value) { StdVideoH265ProfileTierLevel.set_flags(segment, 0L, value); }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265ProfileTierLevel flags(@CType("StdVideoH265ProfileTierLevelFlags") java.lang.foreign.MemorySegment value) { StdVideoH265ProfileTierLevel.set_flags(this.segment(), value); return this; }

    /// {@return `general_profile_idc` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("StdVideoH265ProfileIdc") int get_general_profile_idc(MemorySegment segment, long index) { return (int) VH_general_profile_idc.get(segment, 0L, index); }
    /// {@return `general_profile_idc`}
    /// @param segment the segment of the struct
    public static @CType("StdVideoH265ProfileIdc") int get_general_profile_idc(MemorySegment segment) { return StdVideoH265ProfileTierLevel.get_general_profile_idc(segment, 0L); }
    /// {@return `general_profile_idc`}
    public @CType("StdVideoH265ProfileIdc") int general_profile_idc() { return StdVideoH265ProfileTierLevel.get_general_profile_idc(this.segment()); }
    /// Sets `general_profile_idc` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_general_profile_idc(MemorySegment segment, long index, @CType("StdVideoH265ProfileIdc") int value) { VH_general_profile_idc.set(segment, 0L, index, value); }
    /// Sets `general_profile_idc` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_general_profile_idc(MemorySegment segment, @CType("StdVideoH265ProfileIdc") int value) { StdVideoH265ProfileTierLevel.set_general_profile_idc(segment, 0L, value); }
    /// Sets `general_profile_idc` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265ProfileTierLevel general_profile_idc(@CType("StdVideoH265ProfileIdc") int value) { StdVideoH265ProfileTierLevel.set_general_profile_idc(this.segment(), value); return this; }

    /// {@return `general_level_idc` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("StdVideoH265LevelIdc") int get_general_level_idc(MemorySegment segment, long index) { return (int) VH_general_level_idc.get(segment, 0L, index); }
    /// {@return `general_level_idc`}
    /// @param segment the segment of the struct
    public static @CType("StdVideoH265LevelIdc") int get_general_level_idc(MemorySegment segment) { return StdVideoH265ProfileTierLevel.get_general_level_idc(segment, 0L); }
    /// {@return `general_level_idc`}
    public @CType("StdVideoH265LevelIdc") int general_level_idc() { return StdVideoH265ProfileTierLevel.get_general_level_idc(this.segment()); }
    /// Sets `general_level_idc` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_general_level_idc(MemorySegment segment, long index, @CType("StdVideoH265LevelIdc") int value) { VH_general_level_idc.set(segment, 0L, index, value); }
    /// Sets `general_level_idc` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_general_level_idc(MemorySegment segment, @CType("StdVideoH265LevelIdc") int value) { StdVideoH265ProfileTierLevel.set_general_level_idc(segment, 0L, value); }
    /// Sets `general_level_idc` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265ProfileTierLevel general_level_idc(@CType("StdVideoH265LevelIdc") int value) { StdVideoH265ProfileTierLevel.set_general_level_idc(this.segment(), value); return this; }

    /// A buffer of [StdVideoH265ProfileTierLevel].
    public static final class Buffer extends StdVideoH265ProfileTierLevel {
        private final long elementCount;

        /// Creates `StdVideoH265ProfileTierLevel.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `StdVideoH265ProfileTierLevel`.
        /// @param index the index of the struct buffer
        /// @return the slice of `StdVideoH265ProfileTierLevel`
        public StdVideoH265ProfileTierLevel asSlice(long index) { return new StdVideoH265ProfileTierLevel(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `StdVideoH265ProfileTierLevel`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `StdVideoH265ProfileTierLevel`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `flags` at the given index}
        /// @param index the index
        public @CType("StdVideoH265ProfileTierLevelFlags") java.lang.foreign.MemorySegment flagsAt(long index) { return StdVideoH265ProfileTierLevel.get_flags(this.segment(), index); }
        /// Sets `flags` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer flagsAt(long index, @CType("StdVideoH265ProfileTierLevelFlags") java.lang.foreign.MemorySegment value) { StdVideoH265ProfileTierLevel.set_flags(this.segment(), index, value); return this; }

        /// {@return `general_profile_idc` at the given index}
        /// @param index the index
        public @CType("StdVideoH265ProfileIdc") int general_profile_idcAt(long index) { return StdVideoH265ProfileTierLevel.get_general_profile_idc(this.segment(), index); }
        /// Sets `general_profile_idc` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer general_profile_idcAt(long index, @CType("StdVideoH265ProfileIdc") int value) { StdVideoH265ProfileTierLevel.set_general_profile_idc(this.segment(), index, value); return this; }

        /// {@return `general_level_idc` at the given index}
        /// @param index the index
        public @CType("StdVideoH265LevelIdc") int general_level_idcAt(long index) { return StdVideoH265ProfileTierLevel.get_general_level_idc(this.segment(), index); }
        /// Sets `general_level_idc` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer general_level_idcAt(long index, @CType("StdVideoH265LevelIdc") int value) { StdVideoH265ProfileTierLevel.set_general_level_idc(this.segment(), index, value); return this; }

    }
}
