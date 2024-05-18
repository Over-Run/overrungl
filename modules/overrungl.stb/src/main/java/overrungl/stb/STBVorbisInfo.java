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

import overrun.marshal.LayoutBuilder;
import overrun.marshal.struct.Struct;
import overrun.marshal.struct.StructAllocator;

import java.lang.invoke.MethodHandles;

/**
 * <h2>Layout</h2>
 * <pre><code>
 * typedef struct
 * {
 *    unsigned int {@link #sample_rate};
 *    int {@link #channels};
 *
 *    unsigned int {@link #setup_memory_required};
 *    unsigned int {@link #setup_temp_memory_required};
 *    unsigned int {@link #temp_memory_required};
 *
 *    int {@link #max_frame_size};
 * } stb_vorbis_info;
 * </code></pre>
 *
 * @author squid233
 * @since 0.1.0
 */
public interface STBVorbisInfo extends Struct<STBVorbisInfo> {
    /**
     * The allocator
     */
    StructAllocator<STBVorbisInfo> OF = new StructAllocator<>(
        MethodHandles.lookup(),
        LayoutBuilder.struct()
            .cInt("sample_rate")
            .cInt("channels")
            .cInt("setup_memory_required")
            .cInt("setup_temp_memory_required")
            .cInt("temp_memory_required")
            .cInt("max_frame_size")
            .build()
    );

    /**
     * {@return sample_rate}
     */
    int sample_rate();

    /**
     * Sets {@link #sample_rate()}.
     *
     * @param val the value
     * @return this
     */
    STBVorbisInfo sample_rate(int val);

    /**
     * {@return channels}
     */
    int channels();

    /**
     * Sets {@link #channels()}.
     *
     * @param val the value
     * @return this
     */
    STBVorbisInfo channels(int val);

    /**
     * {@return setup_memory_required}
     */
    int setup_memory_required();

    /**
     * Sets {@link #setup_memory_required()}.
     *
     * @param val the value
     * @return this
     */
    STBVorbisInfo setup_memory_required(int val);

    /**
     * {@return setup_temp_memory_required}
     */
    int setup_temp_memory_required();

    /**
     * Sets {@link #setup_temp_memory_required()}.
     *
     * @param val the value
     * @return this
     */
    STBVorbisInfo setup_temp_memory_required(int val);

    /**
     * {@return temp_memory_required}
     */
    int temp_memory_required();

    /**
     * Sets {@link #temp_memory_required()}.
     *
     * @param val the value
     * @return this
     */
    STBVorbisInfo temp_memory_required(int val);

    /**
     * {@return max_frame_size}
     */
    int max_frame_size();

    /**
     * Sets {@link #max_frame_size()}.
     *
     * @param val the value
     * @return this
     */
    STBVorbisInfo max_frame_size(int val);
}
