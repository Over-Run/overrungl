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

import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandles;

/**
 * normally stb_vorbis uses malloc() to allocate memory at startup,
 * and alloca() to allocate temporary memory during a frame on the
 * stack. (Memory consumption will depend on the amount of setup
 * data in the file and how you set the compile flags for speed
 * vs. size. In my test files the maximal-size usage is ~150KB.)
 * <p>
 * You can modify the wrapper functions in the source (setup_malloc,
 * setup_temp_malloc, temp_malloc) to change this behavior, or you
 * can use a simpler allocation model: you pass in a buffer from
 * which stb_vorbis will allocate _all_ its memory (including the
 * temp memory). "open" may fail with a VORBIS_outofmem if you
 * do not pass in enough data; there is no way to determine how
 * much you do need except to succeed (at which point you can
 * query get_info to find the exact amount required. yes I know
 * this is lame).
 * <p>
 * If you pass in a non-NULL buffer of the type below, allocation
 * will occur from it as described above. Otherwise just pass NULL
 * to use malloc()/alloca()
 * <h2>Layout</h2>
 * <pre><code>
 * typedef struct
 * {
 *    char *{@link #alloc_buffer};
 *    int   {@link #alloc_buffer_length_in_bytes};
 * } stb_vorbis_alloc;
 * </code></pre>
 *
 * @author squid233
 * @since 0.1.0
 */
public interface STBVorbisAlloc extends Struct<STBVorbisAlloc> {
    /**
     * The allocator
     */
    StructAllocator<STBVorbisAlloc> OF = new StructAllocator<>(
        MethodHandles.lookup(),
        LayoutBuilder.struct()
            .cAddress("alloc_buffer")
            .cInt("alloc_buffer_length_in_bytes")
            .build()
    );

    /**
     * {@return alloc_buffer}
     */
    MemorySegment alloc_buffer();

    /**
     * Sets {@link #alloc_buffer()}.
     *
     * @param val the value
     * @return this
     */
    STBVorbisAlloc alloc_buffer(MemorySegment val);

    /**
     * {@return alloc_buffer_length_in_bytes}
     */
    int alloc_buffer_length_in_bytes();

    /**
     * Sets {@link #alloc_buffer_length_in_bytes()}.
     *
     * @param val the value
     * @return this
     */
    STBVorbisAlloc alloc_buffer_length_in_bytes(int val);
}
