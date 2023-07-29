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
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;

import static java.lang.foreign.ValueLayout.*;

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
 *    char *{@link #allocBuffer() alloc_buffer};
 *    int   {@link #allocBufferLength() alloc_buffer_length_in_bytes};
 * } stb_vorbis_alloc;
 * </code></pre>
 *
 * @author squid233
 * @since 0.1.0
 */
public final class STBVorbisAlloc extends Struct {
    /**
     * The struct layout.
     */
    public static final StructLayout LAYOUT = MemoryLayout.structLayout(
        ADDRESS.withTargetLayout(MemoryLayout.sequenceLayout(JAVA_BYTE)).withName("alloc_buffer"),
        JAVA_INT.withName("alloc_buffer_length_in_bytes")
    );
    private static final VarHandle
        ppAllocBuffer = LAYOUT.varHandle(PathElement.groupElement("alloc_buffer")),
        pAllocBufferLengthInBytes = LAYOUT.varHandle(PathElement.groupElement("alloc_buffer_length_in_bytes"));

    /**
     * Creates a {@code STBVorbisAlloc} instance.
     *
     * @param address the address.
     */
    public STBVorbisAlloc(MemorySegment address) {
        super(address, LAYOUT);
    }

    /**
     * Creates a {@code STBVorbisAlloc} instance with the given allocator.
     *
     * @param allocator the allocator.
     * @return the allocator.
     */
    public static STBVorbisAlloc create(SegmentAllocator allocator) {
        return new STBVorbisAlloc(allocator.allocate(LAYOUT));
    }

    public STBVorbisAlloc allocBuffer(MemorySegment allocBuffer) {
        ppAllocBuffer.set(segment(), allocBuffer);
        return this;
    }

    public STBVorbisAlloc allocBufferLength(int allocBufferLength) {
        pAllocBufferLengthInBytes.set(segment(), allocBufferLength);
        return this;
    }

    public MemorySegment allocBuffer() {
        return (MemorySegment) ppAllocBuffer.get(segment());
    }

    public int allocBufferLength() {
        return (int) pAllocBufferLengthInBytes.get(segment());
    }
}
