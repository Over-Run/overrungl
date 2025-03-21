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
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct StdVideoH265ProfileTierLevel {
///     (struct StdVideoH265ProfileTierLevelFlags) StdVideoH265ProfileTierLevelFlags flags;
///     (int) StdVideoH265ProfileIdc general_profile_idc;
///     (int) StdVideoH265LevelIdc general_level_idc;
/// };
/// ```
public sealed class StdVideoH265ProfileTierLevel extends GroupType {
    /// The struct layout of `StdVideoH265ProfileTierLevel`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        overrungl.vulkan.video.StdVideoH265ProfileTierLevelFlags.LAYOUT.withName("flags"),
        ValueLayout.JAVA_INT.withName("general_profile_idc"),
        ValueLayout.JAVA_INT.withName("general_level_idc")
    );
    /// The byte offset of `flags`.
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    /// The memory layout of `flags`.
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    /// The byte offset of `general_profile_idc`.
    public static final long OFFSET_general_profile_idc = LAYOUT.byteOffset(PathElement.groupElement("general_profile_idc"));
    /// The memory layout of `general_profile_idc`.
    public static final MemoryLayout LAYOUT_general_profile_idc = LAYOUT.select(PathElement.groupElement("general_profile_idc"));
    /// The [VarHandle] of `general_profile_idc` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_general_profile_idc = LAYOUT.arrayElementVarHandle(PathElement.groupElement("general_profile_idc"));
    /// The byte offset of `general_level_idc`.
    public static final long OFFSET_general_level_idc = LAYOUT.byteOffset(PathElement.groupElement("general_level_idc"));
    /// The memory layout of `general_level_idc`.
    public static final MemoryLayout LAYOUT_general_level_idc = LAYOUT.select(PathElement.groupElement("general_level_idc"));
    /// The [VarHandle] of `general_level_idc` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_general_level_idc = LAYOUT.arrayElementVarHandle(PathElement.groupElement("general_level_idc"));

    /// Creates `StdVideoH265ProfileTierLevel` with the given segment.
    /// @param segment the memory segment
    public StdVideoH265ProfileTierLevel(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `StdVideoH265ProfileTierLevel` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `StdVideoH265ProfileTierLevel` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoH265ProfileTierLevel ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoH265ProfileTierLevel(segment.reinterpret(LAYOUT.byteSize())); }

    /// Creates `StdVideoH265ProfileTierLevel` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `StdVideoH265ProfileTierLevel` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoH265ProfileTierLevel`
    public static StdVideoH265ProfileTierLevel alloc(SegmentAllocator allocator) { return new StdVideoH265ProfileTierLevel(allocator.allocate(LAYOUT)); }

    /// Allocates a `StdVideoH265ProfileTierLevel` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `StdVideoH265ProfileTierLevel`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public StdVideoH265ProfileTierLevel copyFrom(StdVideoH265ProfileTierLevel src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { if (this instanceof Buffer buf) return buf; else return new Buffer(this.segment(), this.estimateCount()); }

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
    public StdVideoH265ProfileTierLevel flags(MemorySegment value) { flags(this.segment(), 0L, value); return this; }

    /// {@return `general_profile_idc` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int general_profile_idc(MemorySegment segment, long index) { return (int) VH_general_profile_idc.get(segment, 0L, index); }
    /// {@return `general_profile_idc`}
    public int general_profile_idc() { return general_profile_idc(this.segment(), 0L); }
    /// Sets `general_profile_idc` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void general_profile_idc(MemorySegment segment, long index, int value) { VH_general_profile_idc.set(segment, 0L, index, value); }
    /// Sets `general_profile_idc` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265ProfileTierLevel general_profile_idc(int value) { general_profile_idc(this.segment(), 0L, value); return this; }

    /// {@return `general_level_idc` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int general_level_idc(MemorySegment segment, long index) { return (int) VH_general_level_idc.get(segment, 0L, index); }
    /// {@return `general_level_idc`}
    public int general_level_idc() { return general_level_idc(this.segment(), 0L); }
    /// Sets `general_level_idc` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void general_level_idc(MemorySegment segment, long index, int value) { VH_general_level_idc.set(segment, 0L, index, value); }
    /// Sets `general_level_idc` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265ProfileTierLevel general_level_idc(int value) { general_level_idc(this.segment(), 0L, value); return this; }

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
        /// @param index the index of the struct buffer
        public MemorySegment flagsAt(long index) { return flags(this.segment(), index); }
        /// Sets `flags` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer flagsAt(long index, MemorySegment value) { flags(this.segment(), index, value); return this; }

        /// {@return `general_profile_idc` at the given index}
        /// @param index the index of the struct buffer
        public int general_profile_idcAt(long index) { return general_profile_idc(this.segment(), index); }
        /// Sets `general_profile_idc` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer general_profile_idcAt(long index, int value) { general_profile_idc(this.segment(), index, value); return this; }

        /// {@return `general_level_idc` at the given index}
        /// @param index the index of the struct buffer
        public int general_level_idcAt(long index) { return general_level_idc(this.segment(), index); }
        /// Sets `general_level_idc` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer general_level_idcAt(long index, int value) { general_level_idc(this.segment(), index, value); return this; }

    }
}
