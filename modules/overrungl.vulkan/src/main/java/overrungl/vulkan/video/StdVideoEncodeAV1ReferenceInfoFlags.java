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
/// ### disable_frame_end_update_cdf
/// [VarHandle][#VH_disable_frame_end_update_cdf] - [Getter][#disable_frame_end_update_cdf()] - [Setter][#disable_frame_end_update_cdf(int)]
/// ### segmentation_enabled
/// [VarHandle][#VH_segmentation_enabled] - [Getter][#segmentation_enabled()] - [Setter][#segmentation_enabled(int)]
/// ### reserved
/// [VarHandle][#VH_reserved] - [Getter][#reserved()] - [Setter][#reserved(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct StdVideoEncodeAV1ReferenceInfoFlags {
///     uint32_t : 1 disable_frame_end_update_cdf;
///     uint32_t : 1 segmentation_enabled;
///     uint32_t : 30 reserved;
/// } StdVideoEncodeAV1ReferenceInfoFlags;
/// ```
public sealed class StdVideoEncodeAV1ReferenceInfoFlags extends Struct {
    /// The struct layout of `StdVideoEncodeAV1ReferenceInfoFlags`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("disable_frame_end_update_cdf"),
        ValueLayout.JAVA_INT.withName("segmentation_enabled"),
        ValueLayout.JAVA_INT.withName("reserved")
    );
    /// The [VarHandle] of `disable_frame_end_update_cdf` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_disable_frame_end_update_cdf = LAYOUT.arrayElementVarHandle(PathElement.groupElement("disable_frame_end_update_cdf"));
    /// The [VarHandle] of `segmentation_enabled` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_segmentation_enabled = LAYOUT.arrayElementVarHandle(PathElement.groupElement("segmentation_enabled"));
    /// The [VarHandle] of `reserved` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_reserved = LAYOUT.arrayElementVarHandle(PathElement.groupElement("reserved"));

    /// Creates `StdVideoEncodeAV1ReferenceInfoFlags` with the given segment.
    /// @param segment the memory segment
    public StdVideoEncodeAV1ReferenceInfoFlags(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `StdVideoEncodeAV1ReferenceInfoFlags` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoEncodeAV1ReferenceInfoFlags of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new StdVideoEncodeAV1ReferenceInfoFlags(segment); }

    /// Creates `StdVideoEncodeAV1ReferenceInfoFlags` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `StdVideoEncodeAV1ReferenceInfoFlags` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoEncodeAV1ReferenceInfoFlags ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new StdVideoEncodeAV1ReferenceInfoFlags(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `StdVideoEncodeAV1ReferenceInfoFlags` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `StdVideoEncodeAV1ReferenceInfoFlags` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoEncodeAV1ReferenceInfoFlags`
    public static StdVideoEncodeAV1ReferenceInfoFlags alloc(SegmentAllocator allocator) { return new StdVideoEncodeAV1ReferenceInfoFlags(allocator.allocate(LAYOUT)); }

    /// Allocates a `StdVideoEncodeAV1ReferenceInfoFlags` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `StdVideoEncodeAV1ReferenceInfoFlags`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `StdVideoEncodeAV1ReferenceInfoFlags` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoEncodeAV1ReferenceInfoFlags`
    public static StdVideoEncodeAV1ReferenceInfoFlags allocInit(SegmentAllocator allocator, @CType("uint32_t : 1") int disable_frame_end_update_cdf, @CType("uint32_t : 1") int segmentation_enabled, @CType("uint32_t : 30") int reserved) { return alloc(allocator).disable_frame_end_update_cdf(disable_frame_end_update_cdf).segmentation_enabled(segmentation_enabled).reserved(reserved); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public StdVideoEncodeAV1ReferenceInfoFlags copyFrom(StdVideoEncodeAV1ReferenceInfoFlags src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `disable_frame_end_update_cdf` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_disable_frame_end_update_cdf(MemorySegment segment, long index) { return (int) VH_disable_frame_end_update_cdf.get(segment, 0L, index); }
    /// {@return `disable_frame_end_update_cdf`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_disable_frame_end_update_cdf(MemorySegment segment) { return StdVideoEncodeAV1ReferenceInfoFlags.get_disable_frame_end_update_cdf(segment, 0L); }
    /// {@return `disable_frame_end_update_cdf`}
    public @CType("uint32_t : 1") int disable_frame_end_update_cdf() { return StdVideoEncodeAV1ReferenceInfoFlags.get_disable_frame_end_update_cdf(this.segment()); }
    /// Sets `disable_frame_end_update_cdf` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_disable_frame_end_update_cdf(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_disable_frame_end_update_cdf.set(segment, 0L, index, value); }
    /// Sets `disable_frame_end_update_cdf` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_disable_frame_end_update_cdf(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoEncodeAV1ReferenceInfoFlags.set_disable_frame_end_update_cdf(segment, 0L, value); }
    /// Sets `disable_frame_end_update_cdf` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeAV1ReferenceInfoFlags disable_frame_end_update_cdf(@CType("uint32_t : 1") int value) { StdVideoEncodeAV1ReferenceInfoFlags.set_disable_frame_end_update_cdf(this.segment(), value); return this; }

    /// {@return `segmentation_enabled` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_segmentation_enabled(MemorySegment segment, long index) { return (int) VH_segmentation_enabled.get(segment, 0L, index); }
    /// {@return `segmentation_enabled`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_segmentation_enabled(MemorySegment segment) { return StdVideoEncodeAV1ReferenceInfoFlags.get_segmentation_enabled(segment, 0L); }
    /// {@return `segmentation_enabled`}
    public @CType("uint32_t : 1") int segmentation_enabled() { return StdVideoEncodeAV1ReferenceInfoFlags.get_segmentation_enabled(this.segment()); }
    /// Sets `segmentation_enabled` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_segmentation_enabled(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_segmentation_enabled.set(segment, 0L, index, value); }
    /// Sets `segmentation_enabled` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_segmentation_enabled(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoEncodeAV1ReferenceInfoFlags.set_segmentation_enabled(segment, 0L, value); }
    /// Sets `segmentation_enabled` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeAV1ReferenceInfoFlags segmentation_enabled(@CType("uint32_t : 1") int value) { StdVideoEncodeAV1ReferenceInfoFlags.set_segmentation_enabled(this.segment(), value); return this; }

    /// {@return `reserved` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 30") int get_reserved(MemorySegment segment, long index) { return (int) VH_reserved.get(segment, 0L, index); }
    /// {@return `reserved`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 30") int get_reserved(MemorySegment segment) { return StdVideoEncodeAV1ReferenceInfoFlags.get_reserved(segment, 0L); }
    /// {@return `reserved`}
    public @CType("uint32_t : 30") int reserved() { return StdVideoEncodeAV1ReferenceInfoFlags.get_reserved(this.segment()); }
    /// Sets `reserved` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_reserved(MemorySegment segment, long index, @CType("uint32_t : 30") int value) { VH_reserved.set(segment, 0L, index, value); }
    /// Sets `reserved` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_reserved(MemorySegment segment, @CType("uint32_t : 30") int value) { StdVideoEncodeAV1ReferenceInfoFlags.set_reserved(segment, 0L, value); }
    /// Sets `reserved` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeAV1ReferenceInfoFlags reserved(@CType("uint32_t : 30") int value) { StdVideoEncodeAV1ReferenceInfoFlags.set_reserved(this.segment(), value); return this; }

    /// A buffer of [StdVideoEncodeAV1ReferenceInfoFlags].
    public static final class Buffer extends StdVideoEncodeAV1ReferenceInfoFlags {
        private final long elementCount;

        /// Creates `StdVideoEncodeAV1ReferenceInfoFlags.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `StdVideoEncodeAV1ReferenceInfoFlags`.
        /// @param index the index of the struct buffer
        /// @return the slice of `StdVideoEncodeAV1ReferenceInfoFlags`
        public StdVideoEncodeAV1ReferenceInfoFlags asSlice(long index) { return new StdVideoEncodeAV1ReferenceInfoFlags(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `StdVideoEncodeAV1ReferenceInfoFlags`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `StdVideoEncodeAV1ReferenceInfoFlags`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `disable_frame_end_update_cdf` at the given index}
        /// @param index the index
        public @CType("uint32_t : 1") int disable_frame_end_update_cdfAt(long index) { return StdVideoEncodeAV1ReferenceInfoFlags.get_disable_frame_end_update_cdf(this.segment(), index); }
        /// Sets `disable_frame_end_update_cdf` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer disable_frame_end_update_cdfAt(long index, @CType("uint32_t : 1") int value) { StdVideoEncodeAV1ReferenceInfoFlags.set_disable_frame_end_update_cdf(this.segment(), index, value); return this; }

        /// {@return `segmentation_enabled` at the given index}
        /// @param index the index
        public @CType("uint32_t : 1") int segmentation_enabledAt(long index) { return StdVideoEncodeAV1ReferenceInfoFlags.get_segmentation_enabled(this.segment(), index); }
        /// Sets `segmentation_enabled` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer segmentation_enabledAt(long index, @CType("uint32_t : 1") int value) { StdVideoEncodeAV1ReferenceInfoFlags.set_segmentation_enabled(this.segment(), index, value); return this; }

        /// {@return `reserved` at the given index}
        /// @param index the index
        public @CType("uint32_t : 30") int reservedAt(long index) { return StdVideoEncodeAV1ReferenceInfoFlags.get_reserved(this.segment(), index); }
        /// Sets `reserved` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer reservedAt(long index, @CType("uint32_t : 30") int value) { StdVideoEncodeAV1ReferenceInfoFlags.set_reserved(this.segment(), index, value); return this; }

    }
}
