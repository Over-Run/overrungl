/*
 * MIT License
 *
 * Copyright (c) 2023 Overrun Organization
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

import overrungl.Struct;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;

import static java.lang.foreign.ValueLayout.JAVA_INT;

/**
 * <h2>Layout</h2>
 * <pre><code>
 * typedef struct
 * {
 *    unsigned int {@link #sampleRate() sample_rate};
 *    int {@link #channels() channels};
 *
 *    unsigned int {@link #setupMemoryRequired() setup_memory_required};
 *    unsigned int {@link #setupTempMemoryRequired() setup_temp_memory_required};
 *    unsigned int {@link #tempMemoryRequired() temp_memory_required};
 *
 *    int {@link #maxFrameSize() max_frame_size};
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
    private static final VarHandle
        sample_rate = LAYOUT.varHandle(PathElement.groupElement("sample_rate")),
        channels = LAYOUT.varHandle(PathElement.groupElement("channels")),
        setup_memory_required = LAYOUT.varHandle(PathElement.groupElement("setup_memory_required")),
        setup_temp_memory_required = LAYOUT.varHandle(PathElement.groupElement("setup_temp_memory_required")),
        temp_memory_required = LAYOUT.varHandle(PathElement.groupElement("temp_memory_required")),
        max_frame_size = LAYOUT.varHandle(PathElement.groupElement("max_frame_size"));

    public STBVorbisInfo(MemorySegment address) {
        super(address, LAYOUT);
    }

    public int sampleRate() {
        return (int) sample_rate.get(segment());
    }

    public int channels() {
        return (int) channels.get(segment());
    }

    public int setupMemoryRequired() {
        return (int) setup_memory_required.get(segment());
    }

    public int setupTempMemoryRequired() {
        return (int) setup_temp_memory_required.get(segment());
    }

    public int tempMemoryRequired() {
        return (int) temp_memory_required.get(segment());
    }

    public int maxFrameSize() {
        return (int) max_frame_size.get(segment());
    }
}
