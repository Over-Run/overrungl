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
package overrungl.stb;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.annotation.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Members
/// ### sample_rate
/// [VarHandle][#VH_sample_rate] - [Getter][#sample_rate()] - [Setter][#sample_rate(int)]
/// ### channels
/// [VarHandle][#VH_channels] - [Getter][#channels()] - [Setter][#channels(int)]
/// ### setup_memory_required
/// [VarHandle][#VH_setup_memory_required] - [Getter][#setup_memory_required()] - [Setter][#setup_memory_required(int)]
/// ### setup_temp_memory_required
/// [VarHandle][#VH_setup_temp_memory_required] - [Getter][#setup_temp_memory_required()] - [Setter][#setup_temp_memory_required(int)]
/// ### temp_memory_required
/// [VarHandle][#VH_temp_memory_required] - [Getter][#temp_memory_required()] - [Setter][#temp_memory_required(int)]
/// ### max_frame_size
/// [VarHandle][#VH_max_frame_size] - [Getter][#max_frame_size()] - [Setter][#max_frame_size(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct stb_vorbis_info {
///     unsigned int sample_rate;
///     int channels;
///     unsigned int setup_memory_required;
///     unsigned int setup_temp_memory_required;
///     unsigned int temp_memory_required;
///     int max_frame_size;
/// } STBVorbisInfo;
/// ```
public sealed class STBVorbisInfo extends Struct {
    /// The struct layout of `stb_vorbis_info`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sample_rate"),
        ValueLayout.JAVA_INT.withName("channels"),
        ValueLayout.JAVA_INT.withName("setup_memory_required"),
        ValueLayout.JAVA_INT.withName("setup_temp_memory_required"),
        ValueLayout.JAVA_INT.withName("temp_memory_required"),
        ValueLayout.JAVA_INT.withName("max_frame_size")
    );
    /// The [VarHandle] of `sample_rate` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sample_rate = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sample_rate"));
    /// The [VarHandle] of `channels` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_channels = LAYOUT.arrayElementVarHandle(PathElement.groupElement("channels"));
    /// The [VarHandle] of `setup_memory_required` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_setup_memory_required = LAYOUT.arrayElementVarHandle(PathElement.groupElement("setup_memory_required"));
    /// The [VarHandle] of `setup_temp_memory_required` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_setup_temp_memory_required = LAYOUT.arrayElementVarHandle(PathElement.groupElement("setup_temp_memory_required"));
    /// The [VarHandle] of `temp_memory_required` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_temp_memory_required = LAYOUT.arrayElementVarHandle(PathElement.groupElement("temp_memory_required"));
    /// The [VarHandle] of `max_frame_size` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_max_frame_size = LAYOUT.arrayElementVarHandle(PathElement.groupElement("max_frame_size"));

    /// Creates `STBVorbisInfo` with the given segment.
    /// @param segment the memory segment
    public STBVorbisInfo(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `STBVorbisInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static STBVorbisInfo of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new STBVorbisInfo(segment); }

    /// Creates `STBVorbisInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `STBVorbisInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static STBVorbisInfo ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new STBVorbisInfo(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `STBVorbisInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `STBVorbisInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `STBVorbisInfo`
    public static STBVorbisInfo alloc(SegmentAllocator allocator) { return new STBVorbisInfo(allocator.allocate(LAYOUT)); }

    /// Allocates a `STBVorbisInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `STBVorbisInfo`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `STBVorbisInfo` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `STBVorbisInfo`
    public static STBVorbisInfo allocInit(SegmentAllocator allocator, @CType("unsigned int") int sample_rate, @CType("int") int channels, @CType("unsigned int") int setup_memory_required, @CType("unsigned int") int setup_temp_memory_required, @CType("unsigned int") int temp_memory_required, @CType("int") int max_frame_size) { return alloc(allocator).sample_rate(sample_rate).channels(channels).setup_memory_required(setup_memory_required).setup_temp_memory_required(setup_temp_memory_required).temp_memory_required(temp_memory_required).max_frame_size(max_frame_size); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public STBVorbisInfo copyFrom(STBVorbisInfo src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sample_rate` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("unsigned int") int get_sample_rate(MemorySegment segment, long index) { return (int) VH_sample_rate.get(segment, 0L, index); }
    /// {@return `sample_rate`}
    /// @param segment the segment of the struct
    public static @CType("unsigned int") int get_sample_rate(MemorySegment segment) { return STBVorbisInfo.get_sample_rate(segment, 0L); }
    /// {@return `sample_rate`}
    public @CType("unsigned int") int sample_rate() { return STBVorbisInfo.get_sample_rate(this.segment()); }
    /// Sets `sample_rate` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sample_rate(MemorySegment segment, long index, @CType("unsigned int") int value) { VH_sample_rate.set(segment, 0L, index, value); }
    /// Sets `sample_rate` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sample_rate(MemorySegment segment, @CType("unsigned int") int value) { STBVorbisInfo.set_sample_rate(segment, 0L, value); }
    /// Sets `sample_rate` with the given value.
    /// @param value the value
    /// @return `this`
    public STBVorbisInfo sample_rate(@CType("unsigned int") int value) { STBVorbisInfo.set_sample_rate(this.segment(), value); return this; }

    /// {@return `channels` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("int") int get_channels(MemorySegment segment, long index) { return (int) VH_channels.get(segment, 0L, index); }
    /// {@return `channels`}
    /// @param segment the segment of the struct
    public static @CType("int") int get_channels(MemorySegment segment) { return STBVorbisInfo.get_channels(segment, 0L); }
    /// {@return `channels`}
    public @CType("int") int channels() { return STBVorbisInfo.get_channels(this.segment()); }
    /// Sets `channels` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_channels(MemorySegment segment, long index, @CType("int") int value) { VH_channels.set(segment, 0L, index, value); }
    /// Sets `channels` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_channels(MemorySegment segment, @CType("int") int value) { STBVorbisInfo.set_channels(segment, 0L, value); }
    /// Sets `channels` with the given value.
    /// @param value the value
    /// @return `this`
    public STBVorbisInfo channels(@CType("int") int value) { STBVorbisInfo.set_channels(this.segment(), value); return this; }

    /// {@return `setup_memory_required` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("unsigned int") int get_setup_memory_required(MemorySegment segment, long index) { return (int) VH_setup_memory_required.get(segment, 0L, index); }
    /// {@return `setup_memory_required`}
    /// @param segment the segment of the struct
    public static @CType("unsigned int") int get_setup_memory_required(MemorySegment segment) { return STBVorbisInfo.get_setup_memory_required(segment, 0L); }
    /// {@return `setup_memory_required`}
    public @CType("unsigned int") int setup_memory_required() { return STBVorbisInfo.get_setup_memory_required(this.segment()); }
    /// Sets `setup_memory_required` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_setup_memory_required(MemorySegment segment, long index, @CType("unsigned int") int value) { VH_setup_memory_required.set(segment, 0L, index, value); }
    /// Sets `setup_memory_required` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_setup_memory_required(MemorySegment segment, @CType("unsigned int") int value) { STBVorbisInfo.set_setup_memory_required(segment, 0L, value); }
    /// Sets `setup_memory_required` with the given value.
    /// @param value the value
    /// @return `this`
    public STBVorbisInfo setup_memory_required(@CType("unsigned int") int value) { STBVorbisInfo.set_setup_memory_required(this.segment(), value); return this; }

    /// {@return `setup_temp_memory_required` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("unsigned int") int get_setup_temp_memory_required(MemorySegment segment, long index) { return (int) VH_setup_temp_memory_required.get(segment, 0L, index); }
    /// {@return `setup_temp_memory_required`}
    /// @param segment the segment of the struct
    public static @CType("unsigned int") int get_setup_temp_memory_required(MemorySegment segment) { return STBVorbisInfo.get_setup_temp_memory_required(segment, 0L); }
    /// {@return `setup_temp_memory_required`}
    public @CType("unsigned int") int setup_temp_memory_required() { return STBVorbisInfo.get_setup_temp_memory_required(this.segment()); }
    /// Sets `setup_temp_memory_required` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_setup_temp_memory_required(MemorySegment segment, long index, @CType("unsigned int") int value) { VH_setup_temp_memory_required.set(segment, 0L, index, value); }
    /// Sets `setup_temp_memory_required` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_setup_temp_memory_required(MemorySegment segment, @CType("unsigned int") int value) { STBVorbisInfo.set_setup_temp_memory_required(segment, 0L, value); }
    /// Sets `setup_temp_memory_required` with the given value.
    /// @param value the value
    /// @return `this`
    public STBVorbisInfo setup_temp_memory_required(@CType("unsigned int") int value) { STBVorbisInfo.set_setup_temp_memory_required(this.segment(), value); return this; }

    /// {@return `temp_memory_required` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("unsigned int") int get_temp_memory_required(MemorySegment segment, long index) { return (int) VH_temp_memory_required.get(segment, 0L, index); }
    /// {@return `temp_memory_required`}
    /// @param segment the segment of the struct
    public static @CType("unsigned int") int get_temp_memory_required(MemorySegment segment) { return STBVorbisInfo.get_temp_memory_required(segment, 0L); }
    /// {@return `temp_memory_required`}
    public @CType("unsigned int") int temp_memory_required() { return STBVorbisInfo.get_temp_memory_required(this.segment()); }
    /// Sets `temp_memory_required` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_temp_memory_required(MemorySegment segment, long index, @CType("unsigned int") int value) { VH_temp_memory_required.set(segment, 0L, index, value); }
    /// Sets `temp_memory_required` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_temp_memory_required(MemorySegment segment, @CType("unsigned int") int value) { STBVorbisInfo.set_temp_memory_required(segment, 0L, value); }
    /// Sets `temp_memory_required` with the given value.
    /// @param value the value
    /// @return `this`
    public STBVorbisInfo temp_memory_required(@CType("unsigned int") int value) { STBVorbisInfo.set_temp_memory_required(this.segment(), value); return this; }

    /// {@return `max_frame_size` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("int") int get_max_frame_size(MemorySegment segment, long index) { return (int) VH_max_frame_size.get(segment, 0L, index); }
    /// {@return `max_frame_size`}
    /// @param segment the segment of the struct
    public static @CType("int") int get_max_frame_size(MemorySegment segment) { return STBVorbisInfo.get_max_frame_size(segment, 0L); }
    /// {@return `max_frame_size`}
    public @CType("int") int max_frame_size() { return STBVorbisInfo.get_max_frame_size(this.segment()); }
    /// Sets `max_frame_size` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_max_frame_size(MemorySegment segment, long index, @CType("int") int value) { VH_max_frame_size.set(segment, 0L, index, value); }
    /// Sets `max_frame_size` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_max_frame_size(MemorySegment segment, @CType("int") int value) { STBVorbisInfo.set_max_frame_size(segment, 0L, value); }
    /// Sets `max_frame_size` with the given value.
    /// @param value the value
    /// @return `this`
    public STBVorbisInfo max_frame_size(@CType("int") int value) { STBVorbisInfo.set_max_frame_size(this.segment(), value); return this; }

    /// A buffer of [STBVorbisInfo].
    public static final class Buffer extends STBVorbisInfo {
        private final long elementCount;

        /// Creates `STBVorbisInfo.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `STBVorbisInfo`.
        /// @param index the index of the struct buffer
        /// @return the slice of `STBVorbisInfo`
        public STBVorbisInfo asSlice(long index) { return new STBVorbisInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `STBVorbisInfo`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `STBVorbisInfo`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sample_rate` at the given index}
        /// @param index the index
        public @CType("unsigned int") int sample_rateAt(long index) { return STBVorbisInfo.get_sample_rate(this.segment(), index); }
        /// Sets `sample_rate` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sample_rateAt(long index, @CType("unsigned int") int value) { STBVorbisInfo.set_sample_rate(this.segment(), index, value); return this; }

        /// {@return `channels` at the given index}
        /// @param index the index
        public @CType("int") int channelsAt(long index) { return STBVorbisInfo.get_channels(this.segment(), index); }
        /// Sets `channels` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer channelsAt(long index, @CType("int") int value) { STBVorbisInfo.set_channels(this.segment(), index, value); return this; }

        /// {@return `setup_memory_required` at the given index}
        /// @param index the index
        public @CType("unsigned int") int setup_memory_requiredAt(long index) { return STBVorbisInfo.get_setup_memory_required(this.segment(), index); }
        /// Sets `setup_memory_required` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer setup_memory_requiredAt(long index, @CType("unsigned int") int value) { STBVorbisInfo.set_setup_memory_required(this.segment(), index, value); return this; }

        /// {@return `setup_temp_memory_required` at the given index}
        /// @param index the index
        public @CType("unsigned int") int setup_temp_memory_requiredAt(long index) { return STBVorbisInfo.get_setup_temp_memory_required(this.segment(), index); }
        /// Sets `setup_temp_memory_required` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer setup_temp_memory_requiredAt(long index, @CType("unsigned int") int value) { STBVorbisInfo.set_setup_temp_memory_required(this.segment(), index, value); return this; }

        /// {@return `temp_memory_required` at the given index}
        /// @param index the index
        public @CType("unsigned int") int temp_memory_requiredAt(long index) { return STBVorbisInfo.get_temp_memory_required(this.segment(), index); }
        /// Sets `temp_memory_required` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer temp_memory_requiredAt(long index, @CType("unsigned int") int value) { STBVorbisInfo.set_temp_memory_required(this.segment(), index, value); return this; }

        /// {@return `max_frame_size` at the given index}
        /// @param index the index
        public @CType("int") int max_frame_sizeAt(long index) { return STBVorbisInfo.get_max_frame_size(this.segment(), index); }
        /// Sets `max_frame_size` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer max_frame_sizeAt(long index, @CType("int") int value) { STBVorbisInfo.set_max_frame_size(this.segment(), index, value); return this; }

    }
}
