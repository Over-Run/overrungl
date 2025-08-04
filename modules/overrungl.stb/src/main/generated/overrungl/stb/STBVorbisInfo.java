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
package overrungl.stb;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct STBVorbisInfo {
///     unsigned int sample_rate;
///     int channels;
///     unsigned int setup_memory_required;
///     unsigned int setup_temp_memory_required;
///     unsigned int temp_memory_required;
///     int max_frame_size;
/// };
/// ```
public final class STBVorbisInfo extends GroupType {
    /// The struct layout of `STBVorbisInfo`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sample_rate"),
        ValueLayout.JAVA_INT.withName("channels"),
        ValueLayout.JAVA_INT.withName("setup_memory_required"),
        ValueLayout.JAVA_INT.withName("setup_temp_memory_required"),
        ValueLayout.JAVA_INT.withName("temp_memory_required"),
        ValueLayout.JAVA_INT.withName("max_frame_size")
    );
    /// The byte offset of `sample_rate`.
    public static final long OFFSET_sample_rate = LAYOUT.byteOffset(PathElement.groupElement("sample_rate"));
    /// The memory layout of `sample_rate`.
    public static final MemoryLayout LAYOUT_sample_rate = LAYOUT.select(PathElement.groupElement("sample_rate"));
    /// The [VarHandle] of `sample_rate` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_sample_rate = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sample_rate"));
    /// The byte offset of `channels`.
    public static final long OFFSET_channels = LAYOUT.byteOffset(PathElement.groupElement("channels"));
    /// The memory layout of `channels`.
    public static final MemoryLayout LAYOUT_channels = LAYOUT.select(PathElement.groupElement("channels"));
    /// The [VarHandle] of `channels` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_channels = LAYOUT.arrayElementVarHandle(PathElement.groupElement("channels"));
    /// The byte offset of `setup_memory_required`.
    public static final long OFFSET_setup_memory_required = LAYOUT.byteOffset(PathElement.groupElement("setup_memory_required"));
    /// The memory layout of `setup_memory_required`.
    public static final MemoryLayout LAYOUT_setup_memory_required = LAYOUT.select(PathElement.groupElement("setup_memory_required"));
    /// The [VarHandle] of `setup_memory_required` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_setup_memory_required = LAYOUT.arrayElementVarHandle(PathElement.groupElement("setup_memory_required"));
    /// The byte offset of `setup_temp_memory_required`.
    public static final long OFFSET_setup_temp_memory_required = LAYOUT.byteOffset(PathElement.groupElement("setup_temp_memory_required"));
    /// The memory layout of `setup_temp_memory_required`.
    public static final MemoryLayout LAYOUT_setup_temp_memory_required = LAYOUT.select(PathElement.groupElement("setup_temp_memory_required"));
    /// The [VarHandle] of `setup_temp_memory_required` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_setup_temp_memory_required = LAYOUT.arrayElementVarHandle(PathElement.groupElement("setup_temp_memory_required"));
    /// The byte offset of `temp_memory_required`.
    public static final long OFFSET_temp_memory_required = LAYOUT.byteOffset(PathElement.groupElement("temp_memory_required"));
    /// The memory layout of `temp_memory_required`.
    public static final MemoryLayout LAYOUT_temp_memory_required = LAYOUT.select(PathElement.groupElement("temp_memory_required"));
    /// The [VarHandle] of `temp_memory_required` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_temp_memory_required = LAYOUT.arrayElementVarHandle(PathElement.groupElement("temp_memory_required"));
    /// The byte offset of `max_frame_size`.
    public static final long OFFSET_max_frame_size = LAYOUT.byteOffset(PathElement.groupElement("max_frame_size"));
    /// The memory layout of `max_frame_size`.
    public static final MemoryLayout LAYOUT_max_frame_size = LAYOUT.select(PathElement.groupElement("max_frame_size"));
    /// The [VarHandle] of `max_frame_size` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_max_frame_size = LAYOUT.arrayElementVarHandle(PathElement.groupElement("max_frame_size"));

    /// Creates `STBVorbisInfo` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public STBVorbisInfo(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `STBVorbisInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static STBVorbisInfo of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new STBVorbisInfo(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `STBVorbisInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static STBVorbisInfo ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new STBVorbisInfo(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `STBVorbisInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static STBVorbisInfo ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new STBVorbisInfo(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `STBVorbisInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `STBVorbisInfo`
    public static STBVorbisInfo alloc(SegmentAllocator allocator) { return new STBVorbisInfo(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `STBVorbisInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `STBVorbisInfo`
    public static STBVorbisInfo alloc(SegmentAllocator allocator, long count) { return new STBVorbisInfo(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public STBVorbisInfo copyFrom(STBVorbisInfo src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public STBVorbisInfo reinterpret(long count) { return new STBVorbisInfo(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// {@return `sample_rate` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int sample_rate(MemorySegment segment, long index) { return (int) VH_sample_rate.get(segment, 0L, index); }
    /// {@return `sample_rate`}
    public int sample_rate() { return sample_rate(this.segment(), 0L); }
    /// Sets `sample_rate` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void sample_rate(MemorySegment segment, long index, int value) { VH_sample_rate.set(segment, 0L, index, value); }
    /// Sets `sample_rate` with the given value.
    /// @param value the value
    /// @return `this`
    public STBVorbisInfo sample_rate(int value) { sample_rate(this.segment(), 0L, value); return this; }

    /// {@return `channels` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int channels(MemorySegment segment, long index) { return (int) VH_channels.get(segment, 0L, index); }
    /// {@return `channels`}
    public int channels() { return channels(this.segment(), 0L); }
    /// Sets `channels` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void channels(MemorySegment segment, long index, int value) { VH_channels.set(segment, 0L, index, value); }
    /// Sets `channels` with the given value.
    /// @param value the value
    /// @return `this`
    public STBVorbisInfo channels(int value) { channels(this.segment(), 0L, value); return this; }

    /// {@return `setup_memory_required` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int setup_memory_required(MemorySegment segment, long index) { return (int) VH_setup_memory_required.get(segment, 0L, index); }
    /// {@return `setup_memory_required`}
    public int setup_memory_required() { return setup_memory_required(this.segment(), 0L); }
    /// Sets `setup_memory_required` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void setup_memory_required(MemorySegment segment, long index, int value) { VH_setup_memory_required.set(segment, 0L, index, value); }
    /// Sets `setup_memory_required` with the given value.
    /// @param value the value
    /// @return `this`
    public STBVorbisInfo setup_memory_required(int value) { setup_memory_required(this.segment(), 0L, value); return this; }

    /// {@return `setup_temp_memory_required` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int setup_temp_memory_required(MemorySegment segment, long index) { return (int) VH_setup_temp_memory_required.get(segment, 0L, index); }
    /// {@return `setup_temp_memory_required`}
    public int setup_temp_memory_required() { return setup_temp_memory_required(this.segment(), 0L); }
    /// Sets `setup_temp_memory_required` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void setup_temp_memory_required(MemorySegment segment, long index, int value) { VH_setup_temp_memory_required.set(segment, 0L, index, value); }
    /// Sets `setup_temp_memory_required` with the given value.
    /// @param value the value
    /// @return `this`
    public STBVorbisInfo setup_temp_memory_required(int value) { setup_temp_memory_required(this.segment(), 0L, value); return this; }

    /// {@return `temp_memory_required` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int temp_memory_required(MemorySegment segment, long index) { return (int) VH_temp_memory_required.get(segment, 0L, index); }
    /// {@return `temp_memory_required`}
    public int temp_memory_required() { return temp_memory_required(this.segment(), 0L); }
    /// Sets `temp_memory_required` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void temp_memory_required(MemorySegment segment, long index, int value) { VH_temp_memory_required.set(segment, 0L, index, value); }
    /// Sets `temp_memory_required` with the given value.
    /// @param value the value
    /// @return `this`
    public STBVorbisInfo temp_memory_required(int value) { temp_memory_required(this.segment(), 0L, value); return this; }

    /// {@return `max_frame_size` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int max_frame_size(MemorySegment segment, long index) { return (int) VH_max_frame_size.get(segment, 0L, index); }
    /// {@return `max_frame_size`}
    public int max_frame_size() { return max_frame_size(this.segment(), 0L); }
    /// Sets `max_frame_size` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void max_frame_size(MemorySegment segment, long index, int value) { VH_max_frame_size.set(segment, 0L, index, value); }
    /// Sets `max_frame_size` with the given value.
    /// @param value the value
    /// @return `this`
    public STBVorbisInfo max_frame_size(int value) { max_frame_size(this.segment(), 0L, value); return this; }

    /// Creates a slice of `STBVorbisInfo`.
    /// @param index the index of the struct buffer
    /// @return the slice of `STBVorbisInfo`
    public STBVorbisInfo asSlice(long index) { return new STBVorbisInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `STBVorbisInfo`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `STBVorbisInfo`
    public STBVorbisInfo asSlice(long index, long count) { return new STBVorbisInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `STBVorbisInfo` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public STBVorbisInfo at(long index, Consumer<STBVorbisInfo> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sample_rate` at the given index}
    /// @param index the index of the struct buffer
    public int sample_rateAt(long index) { return sample_rate(this.segment(), index); }
    /// Sets `sample_rate` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public STBVorbisInfo sample_rateAt(long index, int value) { sample_rate(this.segment(), index, value); return this; }

    /// {@return `channels` at the given index}
    /// @param index the index of the struct buffer
    public int channelsAt(long index) { return channels(this.segment(), index); }
    /// Sets `channels` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public STBVorbisInfo channelsAt(long index, int value) { channels(this.segment(), index, value); return this; }

    /// {@return `setup_memory_required` at the given index}
    /// @param index the index of the struct buffer
    public int setup_memory_requiredAt(long index) { return setup_memory_required(this.segment(), index); }
    /// Sets `setup_memory_required` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public STBVorbisInfo setup_memory_requiredAt(long index, int value) { setup_memory_required(this.segment(), index, value); return this; }

    /// {@return `setup_temp_memory_required` at the given index}
    /// @param index the index of the struct buffer
    public int setup_temp_memory_requiredAt(long index) { return setup_temp_memory_required(this.segment(), index); }
    /// Sets `setup_temp_memory_required` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public STBVorbisInfo setup_temp_memory_requiredAt(long index, int value) { setup_temp_memory_required(this.segment(), index, value); return this; }

    /// {@return `temp_memory_required` at the given index}
    /// @param index the index of the struct buffer
    public int temp_memory_requiredAt(long index) { return temp_memory_required(this.segment(), index); }
    /// Sets `temp_memory_required` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public STBVorbisInfo temp_memory_requiredAt(long index, int value) { temp_memory_required(this.segment(), index, value); return this; }

    /// {@return `max_frame_size` at the given index}
    /// @param index the index of the struct buffer
    public int max_frame_sizeAt(long index) { return max_frame_size(this.segment(), index); }
    /// Sets `max_frame_size` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public STBVorbisInfo max_frame_sizeAt(long index, int value) { max_frame_size(this.segment(), index, value); return this; }

}
