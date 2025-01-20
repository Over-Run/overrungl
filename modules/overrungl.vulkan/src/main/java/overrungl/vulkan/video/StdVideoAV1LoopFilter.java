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
/// [VarHandle][#VH_flags] - [Getter][#flags()] - [Setter][#flags(MemorySegment)]
/// ### loop_filter_level
/// [VarHandle][#VH_loop_filter_level] - [Getter][#loop_filter_level()] - [Setter][#loop_filter_level(byte)]
/// ### loop_filter_sharpness
/// [VarHandle][#VH_loop_filter_sharpness] - [Getter][#loop_filter_sharpness()] - [Setter][#loop_filter_sharpness(byte)]
/// ### update_ref_delta
/// [VarHandle][#VH_update_ref_delta] - [Getter][#update_ref_delta()] - [Setter][#update_ref_delta(byte)]
/// ### loop_filter_ref_deltas
/// [VarHandle][#VH_loop_filter_ref_deltas] - [Getter][#loop_filter_ref_deltas()] - [Setter][#loop_filter_ref_deltas(byte)]
/// ### update_mode_delta
/// [VarHandle][#VH_update_mode_delta] - [Getter][#update_mode_delta()] - [Setter][#update_mode_delta(byte)]
/// ### loop_filter_mode_deltas
/// [VarHandle][#VH_loop_filter_mode_deltas] - [Getter][#loop_filter_mode_deltas()] - [Setter][#loop_filter_mode_deltas(byte)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct StdVideoAV1LoopFilter {
///     StdVideoAV1LoopFilterFlags flags;
///     uint8_t [ ] loop_filter_level;
///     uint8_t loop_filter_sharpness;
///     uint8_t update_ref_delta;
///     int8_t [ ] loop_filter_ref_deltas;
///     uint8_t update_mode_delta;
///     int8_t [ ] loop_filter_mode_deltas;
/// } StdVideoAV1LoopFilter;
/// ```
public sealed class StdVideoAV1LoopFilter extends Struct {
    /// The struct layout of `StdVideoAV1LoopFilter`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        StdVideoAV1LoopFilterFlags.LAYOUT.withName("flags"),
        ValueLayout.JAVA_BYTE.withName("loop_filter_level"),
        ValueLayout.JAVA_BYTE.withName("loop_filter_sharpness"),
        ValueLayout.JAVA_BYTE.withName("update_ref_delta"),
        ValueLayout.JAVA_BYTE.withName("loop_filter_ref_deltas"),
        ValueLayout.JAVA_BYTE.withName("update_mode_delta"),
        ValueLayout.JAVA_BYTE.withName("loop_filter_mode_deltas")
    );
    /// The [VarHandle] of `flags` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    /// The [VarHandle] of `loop_filter_level` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_loop_filter_level = LAYOUT.arrayElementVarHandle(PathElement.groupElement("loop_filter_level"));
    /// The [VarHandle] of `loop_filter_sharpness` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_loop_filter_sharpness = LAYOUT.arrayElementVarHandle(PathElement.groupElement("loop_filter_sharpness"));
    /// The [VarHandle] of `update_ref_delta` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_update_ref_delta = LAYOUT.arrayElementVarHandle(PathElement.groupElement("update_ref_delta"));
    /// The [VarHandle] of `loop_filter_ref_deltas` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_loop_filter_ref_deltas = LAYOUT.arrayElementVarHandle(PathElement.groupElement("loop_filter_ref_deltas"));
    /// The [VarHandle] of `update_mode_delta` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_update_mode_delta = LAYOUT.arrayElementVarHandle(PathElement.groupElement("update_mode_delta"));
    /// The [VarHandle] of `loop_filter_mode_deltas` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_loop_filter_mode_deltas = LAYOUT.arrayElementVarHandle(PathElement.groupElement("loop_filter_mode_deltas"));

    /// Creates `StdVideoAV1LoopFilter` with the given segment.
    /// @param segment the memory segment
    public StdVideoAV1LoopFilter(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `StdVideoAV1LoopFilter` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoAV1LoopFilter of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new StdVideoAV1LoopFilter(segment); }

    /// Creates `StdVideoAV1LoopFilter` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `StdVideoAV1LoopFilter` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoAV1LoopFilter ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new StdVideoAV1LoopFilter(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `StdVideoAV1LoopFilter` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `StdVideoAV1LoopFilter` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoAV1LoopFilter`
    public static StdVideoAV1LoopFilter alloc(SegmentAllocator allocator) { return new StdVideoAV1LoopFilter(allocator.allocate(LAYOUT)); }

    /// Allocates a `StdVideoAV1LoopFilter` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `StdVideoAV1LoopFilter`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `StdVideoAV1LoopFilter` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoAV1LoopFilter`
    public static StdVideoAV1LoopFilter allocInit(SegmentAllocator allocator, @CType("StdVideoAV1LoopFilterFlags") MemorySegment flags, @CType("uint8_t [ ]") byte loop_filter_level, @CType("uint8_t") byte loop_filter_sharpness, @CType("uint8_t") byte update_ref_delta, @CType("int8_t [ ]") byte loop_filter_ref_deltas, @CType("uint8_t") byte update_mode_delta, @CType("int8_t [ ]") byte loop_filter_mode_deltas) { return alloc(allocator).flags(flags).loop_filter_level(loop_filter_level).loop_filter_sharpness(loop_filter_sharpness).update_ref_delta(update_ref_delta).loop_filter_ref_deltas(loop_filter_ref_deltas).update_mode_delta(update_mode_delta).loop_filter_mode_deltas(loop_filter_mode_deltas); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public StdVideoAV1LoopFilter copyFrom(StdVideoAV1LoopFilter src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("StdVideoAV1LoopFilterFlags") MemorySegment get_flags(MemorySegment segment, long index) { return (MemorySegment) VH_flags.get(segment, 0L, index); }
    /// {@return `flags`}
    /// @param segment the segment of the struct
    public static @CType("StdVideoAV1LoopFilterFlags") MemorySegment get_flags(MemorySegment segment) { return StdVideoAV1LoopFilter.get_flags(segment, 0L); }
    /// {@return `flags`}
    public @CType("StdVideoAV1LoopFilterFlags") MemorySegment flags() { return StdVideoAV1LoopFilter.get_flags(this.segment()); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_flags(MemorySegment segment, long index, @CType("StdVideoAV1LoopFilterFlags") MemorySegment value) { VH_flags.set(segment, 0L, index, value); }
    /// Sets `flags` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_flags(MemorySegment segment, @CType("StdVideoAV1LoopFilterFlags") MemorySegment value) { StdVideoAV1LoopFilter.set_flags(segment, 0L, value); }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoAV1LoopFilter flags(@CType("StdVideoAV1LoopFilterFlags") MemorySegment value) { StdVideoAV1LoopFilter.set_flags(this.segment(), value); return this; }

    /// {@return `loop_filter_level` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t [ ]") byte get_loop_filter_level(MemorySegment segment, long index) { return (byte) VH_loop_filter_level.get(segment, 0L, index); }
    /// {@return `loop_filter_level`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t [ ]") byte get_loop_filter_level(MemorySegment segment) { return StdVideoAV1LoopFilter.get_loop_filter_level(segment, 0L); }
    /// {@return `loop_filter_level`}
    public @CType("uint8_t [ ]") byte loop_filter_level() { return StdVideoAV1LoopFilter.get_loop_filter_level(this.segment()); }
    /// Sets `loop_filter_level` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_loop_filter_level(MemorySegment segment, long index, @CType("uint8_t [ ]") byte value) { VH_loop_filter_level.set(segment, 0L, index, value); }
    /// Sets `loop_filter_level` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_loop_filter_level(MemorySegment segment, @CType("uint8_t [ ]") byte value) { StdVideoAV1LoopFilter.set_loop_filter_level(segment, 0L, value); }
    /// Sets `loop_filter_level` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoAV1LoopFilter loop_filter_level(@CType("uint8_t [ ]") byte value) { StdVideoAV1LoopFilter.set_loop_filter_level(this.segment(), value); return this; }

    /// {@return `loop_filter_sharpness` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t") byte get_loop_filter_sharpness(MemorySegment segment, long index) { return (byte) VH_loop_filter_sharpness.get(segment, 0L, index); }
    /// {@return `loop_filter_sharpness`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t") byte get_loop_filter_sharpness(MemorySegment segment) { return StdVideoAV1LoopFilter.get_loop_filter_sharpness(segment, 0L); }
    /// {@return `loop_filter_sharpness`}
    public @CType("uint8_t") byte loop_filter_sharpness() { return StdVideoAV1LoopFilter.get_loop_filter_sharpness(this.segment()); }
    /// Sets `loop_filter_sharpness` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_loop_filter_sharpness(MemorySegment segment, long index, @CType("uint8_t") byte value) { VH_loop_filter_sharpness.set(segment, 0L, index, value); }
    /// Sets `loop_filter_sharpness` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_loop_filter_sharpness(MemorySegment segment, @CType("uint8_t") byte value) { StdVideoAV1LoopFilter.set_loop_filter_sharpness(segment, 0L, value); }
    /// Sets `loop_filter_sharpness` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoAV1LoopFilter loop_filter_sharpness(@CType("uint8_t") byte value) { StdVideoAV1LoopFilter.set_loop_filter_sharpness(this.segment(), value); return this; }

    /// {@return `update_ref_delta` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t") byte get_update_ref_delta(MemorySegment segment, long index) { return (byte) VH_update_ref_delta.get(segment, 0L, index); }
    /// {@return `update_ref_delta`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t") byte get_update_ref_delta(MemorySegment segment) { return StdVideoAV1LoopFilter.get_update_ref_delta(segment, 0L); }
    /// {@return `update_ref_delta`}
    public @CType("uint8_t") byte update_ref_delta() { return StdVideoAV1LoopFilter.get_update_ref_delta(this.segment()); }
    /// Sets `update_ref_delta` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_update_ref_delta(MemorySegment segment, long index, @CType("uint8_t") byte value) { VH_update_ref_delta.set(segment, 0L, index, value); }
    /// Sets `update_ref_delta` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_update_ref_delta(MemorySegment segment, @CType("uint8_t") byte value) { StdVideoAV1LoopFilter.set_update_ref_delta(segment, 0L, value); }
    /// Sets `update_ref_delta` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoAV1LoopFilter update_ref_delta(@CType("uint8_t") byte value) { StdVideoAV1LoopFilter.set_update_ref_delta(this.segment(), value); return this; }

    /// {@return `loop_filter_ref_deltas` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("int8_t [ ]") byte get_loop_filter_ref_deltas(MemorySegment segment, long index) { return (byte) VH_loop_filter_ref_deltas.get(segment, 0L, index); }
    /// {@return `loop_filter_ref_deltas`}
    /// @param segment the segment of the struct
    public static @CType("int8_t [ ]") byte get_loop_filter_ref_deltas(MemorySegment segment) { return StdVideoAV1LoopFilter.get_loop_filter_ref_deltas(segment, 0L); }
    /// {@return `loop_filter_ref_deltas`}
    public @CType("int8_t [ ]") byte loop_filter_ref_deltas() { return StdVideoAV1LoopFilter.get_loop_filter_ref_deltas(this.segment()); }
    /// Sets `loop_filter_ref_deltas` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_loop_filter_ref_deltas(MemorySegment segment, long index, @CType("int8_t [ ]") byte value) { VH_loop_filter_ref_deltas.set(segment, 0L, index, value); }
    /// Sets `loop_filter_ref_deltas` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_loop_filter_ref_deltas(MemorySegment segment, @CType("int8_t [ ]") byte value) { StdVideoAV1LoopFilter.set_loop_filter_ref_deltas(segment, 0L, value); }
    /// Sets `loop_filter_ref_deltas` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoAV1LoopFilter loop_filter_ref_deltas(@CType("int8_t [ ]") byte value) { StdVideoAV1LoopFilter.set_loop_filter_ref_deltas(this.segment(), value); return this; }

    /// {@return `update_mode_delta` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t") byte get_update_mode_delta(MemorySegment segment, long index) { return (byte) VH_update_mode_delta.get(segment, 0L, index); }
    /// {@return `update_mode_delta`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t") byte get_update_mode_delta(MemorySegment segment) { return StdVideoAV1LoopFilter.get_update_mode_delta(segment, 0L); }
    /// {@return `update_mode_delta`}
    public @CType("uint8_t") byte update_mode_delta() { return StdVideoAV1LoopFilter.get_update_mode_delta(this.segment()); }
    /// Sets `update_mode_delta` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_update_mode_delta(MemorySegment segment, long index, @CType("uint8_t") byte value) { VH_update_mode_delta.set(segment, 0L, index, value); }
    /// Sets `update_mode_delta` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_update_mode_delta(MemorySegment segment, @CType("uint8_t") byte value) { StdVideoAV1LoopFilter.set_update_mode_delta(segment, 0L, value); }
    /// Sets `update_mode_delta` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoAV1LoopFilter update_mode_delta(@CType("uint8_t") byte value) { StdVideoAV1LoopFilter.set_update_mode_delta(this.segment(), value); return this; }

    /// {@return `loop_filter_mode_deltas` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("int8_t [ ]") byte get_loop_filter_mode_deltas(MemorySegment segment, long index) { return (byte) VH_loop_filter_mode_deltas.get(segment, 0L, index); }
    /// {@return `loop_filter_mode_deltas`}
    /// @param segment the segment of the struct
    public static @CType("int8_t [ ]") byte get_loop_filter_mode_deltas(MemorySegment segment) { return StdVideoAV1LoopFilter.get_loop_filter_mode_deltas(segment, 0L); }
    /// {@return `loop_filter_mode_deltas`}
    public @CType("int8_t [ ]") byte loop_filter_mode_deltas() { return StdVideoAV1LoopFilter.get_loop_filter_mode_deltas(this.segment()); }
    /// Sets `loop_filter_mode_deltas` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_loop_filter_mode_deltas(MemorySegment segment, long index, @CType("int8_t [ ]") byte value) { VH_loop_filter_mode_deltas.set(segment, 0L, index, value); }
    /// Sets `loop_filter_mode_deltas` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_loop_filter_mode_deltas(MemorySegment segment, @CType("int8_t [ ]") byte value) { StdVideoAV1LoopFilter.set_loop_filter_mode_deltas(segment, 0L, value); }
    /// Sets `loop_filter_mode_deltas` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoAV1LoopFilter loop_filter_mode_deltas(@CType("int8_t [ ]") byte value) { StdVideoAV1LoopFilter.set_loop_filter_mode_deltas(this.segment(), value); return this; }

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
        /// @param index the index
        public @CType("StdVideoAV1LoopFilterFlags") MemorySegment flagsAt(long index) { return StdVideoAV1LoopFilter.get_flags(this.segment(), index); }
        /// Sets `flags` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer flagsAt(long index, @CType("StdVideoAV1LoopFilterFlags") MemorySegment value) { StdVideoAV1LoopFilter.set_flags(this.segment(), index, value); return this; }

        /// {@return `loop_filter_level` at the given index}
        /// @param index the index
        public @CType("uint8_t [ ]") byte loop_filter_levelAt(long index) { return StdVideoAV1LoopFilter.get_loop_filter_level(this.segment(), index); }
        /// Sets `loop_filter_level` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer loop_filter_levelAt(long index, @CType("uint8_t [ ]") byte value) { StdVideoAV1LoopFilter.set_loop_filter_level(this.segment(), index, value); return this; }

        /// {@return `loop_filter_sharpness` at the given index}
        /// @param index the index
        public @CType("uint8_t") byte loop_filter_sharpnessAt(long index) { return StdVideoAV1LoopFilter.get_loop_filter_sharpness(this.segment(), index); }
        /// Sets `loop_filter_sharpness` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer loop_filter_sharpnessAt(long index, @CType("uint8_t") byte value) { StdVideoAV1LoopFilter.set_loop_filter_sharpness(this.segment(), index, value); return this; }

        /// {@return `update_ref_delta` at the given index}
        /// @param index the index
        public @CType("uint8_t") byte update_ref_deltaAt(long index) { return StdVideoAV1LoopFilter.get_update_ref_delta(this.segment(), index); }
        /// Sets `update_ref_delta` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer update_ref_deltaAt(long index, @CType("uint8_t") byte value) { StdVideoAV1LoopFilter.set_update_ref_delta(this.segment(), index, value); return this; }

        /// {@return `loop_filter_ref_deltas` at the given index}
        /// @param index the index
        public @CType("int8_t [ ]") byte loop_filter_ref_deltasAt(long index) { return StdVideoAV1LoopFilter.get_loop_filter_ref_deltas(this.segment(), index); }
        /// Sets `loop_filter_ref_deltas` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer loop_filter_ref_deltasAt(long index, @CType("int8_t [ ]") byte value) { StdVideoAV1LoopFilter.set_loop_filter_ref_deltas(this.segment(), index, value); return this; }

        /// {@return `update_mode_delta` at the given index}
        /// @param index the index
        public @CType("uint8_t") byte update_mode_deltaAt(long index) { return StdVideoAV1LoopFilter.get_update_mode_delta(this.segment(), index); }
        /// Sets `update_mode_delta` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer update_mode_deltaAt(long index, @CType("uint8_t") byte value) { StdVideoAV1LoopFilter.set_update_mode_delta(this.segment(), index, value); return this; }

        /// {@return `loop_filter_mode_deltas` at the given index}
        /// @param index the index
        public @CType("int8_t [ ]") byte loop_filter_mode_deltasAt(long index) { return StdVideoAV1LoopFilter.get_loop_filter_mode_deltas(this.segment(), index); }
        /// Sets `loop_filter_mode_deltas` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer loop_filter_mode_deltasAt(long index, @CType("int8_t [ ]") byte value) { StdVideoAV1LoopFilter.set_loop_filter_mode_deltas(this.segment(), index, value); return this; }

    }
}
