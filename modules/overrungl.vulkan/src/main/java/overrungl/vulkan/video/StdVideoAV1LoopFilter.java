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
/// struct StdVideoAV1LoopFilter {
///     (struct StdVideoAV1LoopFilterFlags) StdVideoAV1LoopFilterFlags flags;
///     uint8_t loop_filter_level[4];
///     uint8_t loop_filter_sharpness;
///     uint8_t update_ref_delta;
///     int8_t loop_filter_ref_deltas[8];
///     uint8_t update_mode_delta;
///     int8_t loop_filter_mode_deltas[2];
/// };
/// ```
public sealed class StdVideoAV1LoopFilter extends GroupType {
    /// The struct layout of `StdVideoAV1LoopFilter`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        overrungl.vulkan.video.StdVideoAV1LoopFilterFlags.LAYOUT.withName("flags"),
        MemoryLayout.sequenceLayout(4L, ValueLayout.JAVA_BYTE).withName("loop_filter_level"),
        ValueLayout.JAVA_BYTE.withName("loop_filter_sharpness"),
        ValueLayout.JAVA_BYTE.withName("update_ref_delta"),
        MemoryLayout.sequenceLayout(8L, ValueLayout.JAVA_BYTE).withName("loop_filter_ref_deltas"),
        ValueLayout.JAVA_BYTE.withName("update_mode_delta"),
        MemoryLayout.sequenceLayout(2L, ValueLayout.JAVA_BYTE).withName("loop_filter_mode_deltas")
    );
    /// The byte offset of `flags`.
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    /// The memory layout of `flags`.
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    /// The byte offset of `loop_filter_level`.
    public static final long OFFSET_loop_filter_level = LAYOUT.byteOffset(PathElement.groupElement("loop_filter_level"));
    /// The memory layout of `loop_filter_level`.
    public static final MemoryLayout LAYOUT_loop_filter_level = LAYOUT.select(PathElement.groupElement("loop_filter_level"));
    /// The [VarHandle] of `loop_filter_level` of type `(MemorySegment base, long baseOffset, long index, long index0)MemorySegment`.
    public static final VarHandle VH_loop_filter_level = LAYOUT.arrayElementVarHandle(PathElement.groupElement("loop_filter_level"), PathElement.sequenceElement());
    /// The byte offset of `loop_filter_sharpness`.
    public static final long OFFSET_loop_filter_sharpness = LAYOUT.byteOffset(PathElement.groupElement("loop_filter_sharpness"));
    /// The memory layout of `loop_filter_sharpness`.
    public static final MemoryLayout LAYOUT_loop_filter_sharpness = LAYOUT.select(PathElement.groupElement("loop_filter_sharpness"));
    /// The [VarHandle] of `loop_filter_sharpness` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_loop_filter_sharpness = LAYOUT.arrayElementVarHandle(PathElement.groupElement("loop_filter_sharpness"));
    /// The byte offset of `update_ref_delta`.
    public static final long OFFSET_update_ref_delta = LAYOUT.byteOffset(PathElement.groupElement("update_ref_delta"));
    /// The memory layout of `update_ref_delta`.
    public static final MemoryLayout LAYOUT_update_ref_delta = LAYOUT.select(PathElement.groupElement("update_ref_delta"));
    /// The [VarHandle] of `update_ref_delta` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_update_ref_delta = LAYOUT.arrayElementVarHandle(PathElement.groupElement("update_ref_delta"));
    /// The byte offset of `loop_filter_ref_deltas`.
    public static final long OFFSET_loop_filter_ref_deltas = LAYOUT.byteOffset(PathElement.groupElement("loop_filter_ref_deltas"));
    /// The memory layout of `loop_filter_ref_deltas`.
    public static final MemoryLayout LAYOUT_loop_filter_ref_deltas = LAYOUT.select(PathElement.groupElement("loop_filter_ref_deltas"));
    /// The [VarHandle] of `loop_filter_ref_deltas` of type `(MemorySegment base, long baseOffset, long index, long index0)MemorySegment`.
    public static final VarHandle VH_loop_filter_ref_deltas = LAYOUT.arrayElementVarHandle(PathElement.groupElement("loop_filter_ref_deltas"), PathElement.sequenceElement());
    /// The byte offset of `update_mode_delta`.
    public static final long OFFSET_update_mode_delta = LAYOUT.byteOffset(PathElement.groupElement("update_mode_delta"));
    /// The memory layout of `update_mode_delta`.
    public static final MemoryLayout LAYOUT_update_mode_delta = LAYOUT.select(PathElement.groupElement("update_mode_delta"));
    /// The [VarHandle] of `update_mode_delta` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_update_mode_delta = LAYOUT.arrayElementVarHandle(PathElement.groupElement("update_mode_delta"));
    /// The byte offset of `loop_filter_mode_deltas`.
    public static final long OFFSET_loop_filter_mode_deltas = LAYOUT.byteOffset(PathElement.groupElement("loop_filter_mode_deltas"));
    /// The memory layout of `loop_filter_mode_deltas`.
    public static final MemoryLayout LAYOUT_loop_filter_mode_deltas = LAYOUT.select(PathElement.groupElement("loop_filter_mode_deltas"));
    /// The [VarHandle] of `loop_filter_mode_deltas` of type `(MemorySegment base, long baseOffset, long index, long index0)MemorySegment`.
    public static final VarHandle VH_loop_filter_mode_deltas = LAYOUT.arrayElementVarHandle(PathElement.groupElement("loop_filter_mode_deltas"), PathElement.sequenceElement());

    /// Creates `StdVideoAV1LoopFilter` with the given segment.
    /// @param segment the memory segment
    public StdVideoAV1LoopFilter(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `StdVideoAV1LoopFilter` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `StdVideoAV1LoopFilter` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoAV1LoopFilter ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoAV1LoopFilter(segment.reinterpret(LAYOUT.byteSize())); }

    /// Creates `StdVideoAV1LoopFilter` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `StdVideoAV1LoopFilter` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoAV1LoopFilter`
    public static StdVideoAV1LoopFilter alloc(SegmentAllocator allocator) { return new StdVideoAV1LoopFilter(allocator.allocate(LAYOUT)); }

    /// Allocates a `StdVideoAV1LoopFilter` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `StdVideoAV1LoopFilter`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public StdVideoAV1LoopFilter copyFrom(StdVideoAV1LoopFilter src) { this.segment().copyFrom(src.segment()); return this; }

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
    public StdVideoAV1LoopFilter flags(MemorySegment value) { flags(this.segment(), 0L, value); return this; }

    /// {@return `loop_filter_level` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment loop_filter_level(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_loop_filter_level, index), LAYOUT_loop_filter_level); }
    /// {@return `loop_filter_level` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    public static byte loop_filter_level(MemorySegment segment, long index, long index0) { return (byte) VH_loop_filter_level.get(segment, 0L, index, index0); }
    /// {@return `loop_filter_level`}
    public MemorySegment loop_filter_level() { return loop_filter_level(this.segment(), 0L); }
    /// {@return `loop_filter_level`}
    /// @param index0 the Index 0 of the array
    public byte loop_filter_level(long index0) { return loop_filter_level(this.segment(), 0L, index0); }
    /// Sets `loop_filter_level` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void loop_filter_level(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_loop_filter_level, index), LAYOUT_loop_filter_level.byteSize()); }
    /// Sets `loop_filter_level` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    public static void loop_filter_level(MemorySegment segment, long index, long index0, byte value) { VH_loop_filter_level.set(segment, 0L, index, index0, value); }
    /// Sets `loop_filter_level` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoAV1LoopFilter loop_filter_level(MemorySegment value) { loop_filter_level(this.segment(), 0L, value); return this; }
    /// Sets `loop_filter_level` with the given value.
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public StdVideoAV1LoopFilter loop_filter_level(long index0, byte value) { loop_filter_level(this.segment(), 0L, index0, value); return this; }

    /// {@return `loop_filter_sharpness` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte loop_filter_sharpness(MemorySegment segment, long index) { return (byte) VH_loop_filter_sharpness.get(segment, 0L, index); }
    /// {@return `loop_filter_sharpness`}
    public byte loop_filter_sharpness() { return loop_filter_sharpness(this.segment(), 0L); }
    /// Sets `loop_filter_sharpness` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void loop_filter_sharpness(MemorySegment segment, long index, byte value) { VH_loop_filter_sharpness.set(segment, 0L, index, value); }
    /// Sets `loop_filter_sharpness` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoAV1LoopFilter loop_filter_sharpness(byte value) { loop_filter_sharpness(this.segment(), 0L, value); return this; }

    /// {@return `update_ref_delta` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte update_ref_delta(MemorySegment segment, long index) { return (byte) VH_update_ref_delta.get(segment, 0L, index); }
    /// {@return `update_ref_delta`}
    public byte update_ref_delta() { return update_ref_delta(this.segment(), 0L); }
    /// Sets `update_ref_delta` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void update_ref_delta(MemorySegment segment, long index, byte value) { VH_update_ref_delta.set(segment, 0L, index, value); }
    /// Sets `update_ref_delta` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoAV1LoopFilter update_ref_delta(byte value) { update_ref_delta(this.segment(), 0L, value); return this; }

    /// {@return `loop_filter_ref_deltas` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment loop_filter_ref_deltas(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_loop_filter_ref_deltas, index), LAYOUT_loop_filter_ref_deltas); }
    /// {@return `loop_filter_ref_deltas` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    public static byte loop_filter_ref_deltas(MemorySegment segment, long index, long index0) { return (byte) VH_loop_filter_ref_deltas.get(segment, 0L, index, index0); }
    /// {@return `loop_filter_ref_deltas`}
    public MemorySegment loop_filter_ref_deltas() { return loop_filter_ref_deltas(this.segment(), 0L); }
    /// {@return `loop_filter_ref_deltas`}
    /// @param index0 the Index 0 of the array
    public byte loop_filter_ref_deltas(long index0) { return loop_filter_ref_deltas(this.segment(), 0L, index0); }
    /// Sets `loop_filter_ref_deltas` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void loop_filter_ref_deltas(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_loop_filter_ref_deltas, index), LAYOUT_loop_filter_ref_deltas.byteSize()); }
    /// Sets `loop_filter_ref_deltas` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    public static void loop_filter_ref_deltas(MemorySegment segment, long index, long index0, byte value) { VH_loop_filter_ref_deltas.set(segment, 0L, index, index0, value); }
    /// Sets `loop_filter_ref_deltas` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoAV1LoopFilter loop_filter_ref_deltas(MemorySegment value) { loop_filter_ref_deltas(this.segment(), 0L, value); return this; }
    /// Sets `loop_filter_ref_deltas` with the given value.
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public StdVideoAV1LoopFilter loop_filter_ref_deltas(long index0, byte value) { loop_filter_ref_deltas(this.segment(), 0L, index0, value); return this; }

    /// {@return `update_mode_delta` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte update_mode_delta(MemorySegment segment, long index) { return (byte) VH_update_mode_delta.get(segment, 0L, index); }
    /// {@return `update_mode_delta`}
    public byte update_mode_delta() { return update_mode_delta(this.segment(), 0L); }
    /// Sets `update_mode_delta` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void update_mode_delta(MemorySegment segment, long index, byte value) { VH_update_mode_delta.set(segment, 0L, index, value); }
    /// Sets `update_mode_delta` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoAV1LoopFilter update_mode_delta(byte value) { update_mode_delta(this.segment(), 0L, value); return this; }

    /// {@return `loop_filter_mode_deltas` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment loop_filter_mode_deltas(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_loop_filter_mode_deltas, index), LAYOUT_loop_filter_mode_deltas); }
    /// {@return `loop_filter_mode_deltas` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    public static byte loop_filter_mode_deltas(MemorySegment segment, long index, long index0) { return (byte) VH_loop_filter_mode_deltas.get(segment, 0L, index, index0); }
    /// {@return `loop_filter_mode_deltas`}
    public MemorySegment loop_filter_mode_deltas() { return loop_filter_mode_deltas(this.segment(), 0L); }
    /// {@return `loop_filter_mode_deltas`}
    /// @param index0 the Index 0 of the array
    public byte loop_filter_mode_deltas(long index0) { return loop_filter_mode_deltas(this.segment(), 0L, index0); }
    /// Sets `loop_filter_mode_deltas` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void loop_filter_mode_deltas(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_loop_filter_mode_deltas, index), LAYOUT_loop_filter_mode_deltas.byteSize()); }
    /// Sets `loop_filter_mode_deltas` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    public static void loop_filter_mode_deltas(MemorySegment segment, long index, long index0, byte value) { VH_loop_filter_mode_deltas.set(segment, 0L, index, index0, value); }
    /// Sets `loop_filter_mode_deltas` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoAV1LoopFilter loop_filter_mode_deltas(MemorySegment value) { loop_filter_mode_deltas(this.segment(), 0L, value); return this; }
    /// Sets `loop_filter_mode_deltas` with the given value.
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public StdVideoAV1LoopFilter loop_filter_mode_deltas(long index0, byte value) { loop_filter_mode_deltas(this.segment(), 0L, index0, value); return this; }

    /// A buffer of [StdVideoAV1LoopFilter].
    public static final class Buffer extends StdVideoAV1LoopFilter {
        private final long elementCount;

        /// Creates `StdVideoAV1LoopFilter.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `StdVideoAV1LoopFilter`.
        /// @param index the index of the struct buffer
        /// @return the slice of `StdVideoAV1LoopFilter`
        public StdVideoAV1LoopFilter asSlice(long index) { return new StdVideoAV1LoopFilter(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `StdVideoAV1LoopFilter`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `StdVideoAV1LoopFilter`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `flags` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment flagsAt(long index) { return flags(this.segment(), index); }
        /// Sets `flags` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer flagsAt(long index, MemorySegment value) { flags(this.segment(), index, value); return this; }

        /// {@return `loop_filter_level` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment loop_filter_levelAt(long index) { return loop_filter_level(this.segment(), index); }
        /// {@return `loop_filter_level` at the given index}
        /// @param index the index of the struct buffer
        /// @param index0 the Index 0 of the array
        public byte loop_filter_levelAt(long index, long index0) { return loop_filter_level(this.segment(), index, index0); }
        /// Sets `loop_filter_level` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer loop_filter_levelAt(long index, MemorySegment value) { loop_filter_level(this.segment(), index, value); return this; }
        /// Sets `loop_filter_level` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param index0 the Index 0 of the array
        /// @param value the value
        /// @return `this`
        public Buffer loop_filter_levelAt(long index, long index0, byte value) { loop_filter_level(this.segment(), index, index0, value); return this; }

        /// {@return `loop_filter_sharpness` at the given index}
        /// @param index the index of the struct buffer
        public byte loop_filter_sharpnessAt(long index) { return loop_filter_sharpness(this.segment(), index); }
        /// Sets `loop_filter_sharpness` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer loop_filter_sharpnessAt(long index, byte value) { loop_filter_sharpness(this.segment(), index, value); return this; }

        /// {@return `update_ref_delta` at the given index}
        /// @param index the index of the struct buffer
        public byte update_ref_deltaAt(long index) { return update_ref_delta(this.segment(), index); }
        /// Sets `update_ref_delta` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer update_ref_deltaAt(long index, byte value) { update_ref_delta(this.segment(), index, value); return this; }

        /// {@return `loop_filter_ref_deltas` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment loop_filter_ref_deltasAt(long index) { return loop_filter_ref_deltas(this.segment(), index); }
        /// {@return `loop_filter_ref_deltas` at the given index}
        /// @param index the index of the struct buffer
        /// @param index0 the Index 0 of the array
        public byte loop_filter_ref_deltasAt(long index, long index0) { return loop_filter_ref_deltas(this.segment(), index, index0); }
        /// Sets `loop_filter_ref_deltas` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer loop_filter_ref_deltasAt(long index, MemorySegment value) { loop_filter_ref_deltas(this.segment(), index, value); return this; }
        /// Sets `loop_filter_ref_deltas` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param index0 the Index 0 of the array
        /// @param value the value
        /// @return `this`
        public Buffer loop_filter_ref_deltasAt(long index, long index0, byte value) { loop_filter_ref_deltas(this.segment(), index, index0, value); return this; }

        /// {@return `update_mode_delta` at the given index}
        /// @param index the index of the struct buffer
        public byte update_mode_deltaAt(long index) { return update_mode_delta(this.segment(), index); }
        /// Sets `update_mode_delta` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer update_mode_deltaAt(long index, byte value) { update_mode_delta(this.segment(), index, value); return this; }

        /// {@return `loop_filter_mode_deltas` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment loop_filter_mode_deltasAt(long index) { return loop_filter_mode_deltas(this.segment(), index); }
        /// {@return `loop_filter_mode_deltas` at the given index}
        /// @param index the index of the struct buffer
        /// @param index0 the Index 0 of the array
        public byte loop_filter_mode_deltasAt(long index, long index0) { return loop_filter_mode_deltas(this.segment(), index, index0); }
        /// Sets `loop_filter_mode_deltas` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer loop_filter_mode_deltasAt(long index, MemorySegment value) { loop_filter_mode_deltas(this.segment(), index, value); return this; }
        /// Sets `loop_filter_mode_deltas` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param index0 the Index 0 of the array
        /// @param value the value
        /// @return `this`
        public Buffer loop_filter_mode_deltasAt(long index, long index0, byte value) { loop_filter_mode_deltas(this.segment(), index, index0, value); return this; }

    }
}
