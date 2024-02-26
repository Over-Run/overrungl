/*
 * MIT License
 *
 * Copyright (c) 2023-2024 Overrun Organization
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

package overrungl.stb;

import overrun.marshal.struct.Struct;
import overrun.marshal.struct.StructHandle;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.StructLayout;

import static java.lang.foreign.ValueLayout.JAVA_INT;

/**
 * <h2>Layout</h2>
 * <pre><code>
 * typedef struct
 * {
 *    unsigned int {@link #sampleRate sample_rate};
 *    int {@link #channels channels};
 *
 *    unsigned int {@link #setupMemoryRequired setup_memory_required};
 *    unsigned int {@link #setupTempMemoryRequired setup_temp_memory_required};
 *    unsigned int {@link #tempMemoryRequired temp_memory_required};
 *
 *    int {@link #maxFrameSize max_frame_size};
 * } stb_vorbis_info;
 * </code></pre>
 *
 * @author squid233
 * @since 0.1.0
 */
public final class STBVorbisInfo extends Struct {
    /**
     * The struct layout.
     */
    public static final StructLayout LAYOUT = MemoryLayout.structLayout(
        JAVA_INT.withName("sample_rate"),
        JAVA_INT.withName("channels"),
        JAVA_INT.withName("setup_memory_required"),
        JAVA_INT.withName("setup_temp_memory_required"),
        JAVA_INT.withName("temp_memory_required"),
        JAVA_INT.withName("max_frame_size")
    );
    /**
     * sample_rate
     */
    public static final StructHandle.Int sampleRate = StructHandle.ofInt(LAYOUT, "sample_rate");
    /**
     * channels
     */
    public static final StructHandle.Int channels = StructHandle.ofInt(LAYOUT, "channels");
    /**
     * setup_memory_required
     */
    public static final StructHandle.Int setupMemoryRequired = StructHandle.ofInt(LAYOUT, "setup_memory_required");
    /**
     * setup_temp_memory_required
     */
    public static final StructHandle.Int setupTempMemoryRequired = StructHandle.ofInt(LAYOUT, "setup_temp_memory_required");
    /**
     * temp_memory_required
     */
    public static final StructHandle.Int tempMemoryRequired = StructHandle.ofInt(LAYOUT, "temp_memory_required");
    /**
     * max_frame_size
     */
    public static final StructHandle.Int maxFrameSize = StructHandle.ofInt(LAYOUT, "max_frame_size");

    /**
     * Creates a struct with the given layout.
     *
     * @param segment      the segment
     * @param elementCount the element count
     */
    public STBVorbisInfo(MemorySegment segment, long elementCount) {
        super(segment, elementCount, LAYOUT);
    }

    /**
     * Allocates a struct with the given layout.
     *
     * @param allocator    the allocator
     * @param elementCount the element count
     */
    public STBVorbisInfo(SegmentAllocator allocator, long elementCount) {
        super(allocator, elementCount, LAYOUT);
    }

    /**
     * Creates a struct with the given layout.
     *
     * @param segment the segment
     */
    public STBVorbisInfo(MemorySegment segment) {
        super(segment, LAYOUT);
    }

    /**
     * Allocates a struct with the given layout.
     *
     * @param allocator the allocator
     */
    public STBVorbisInfo(SegmentAllocator allocator) {
        super(allocator, LAYOUT);
    }
}
