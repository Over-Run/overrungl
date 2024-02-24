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

import static java.lang.foreign.ValueLayout.JAVA_FLOAT;

/**
 * <h2>Layout</h2>
 * <pre><code>
 * typedef struct
 * {
 *    float {@link #x0},{@link #y0},{@link #s0},{@link #t0}; // top-left
 *    float {@link #x1},{@link #y1},{@link #s1},{@link #t1}; // bottom-right
 * } stbtt_aligned_quad;
 * </code></pre>
 *
 * @author squid233
 * @since 0.1.0
 */
public final class STBTTAlignedQuad extends Struct {
    /**
     * The struct layout.
     */
    public static final StructLayout LAYOUT = MemoryLayout.structLayout(
        JAVA_FLOAT.withName("x0"),
        JAVA_FLOAT.withName("y0"),
        JAVA_FLOAT.withName("s0"),
        JAVA_FLOAT.withName("t0"),
        JAVA_FLOAT.withName("x1"),
        JAVA_FLOAT.withName("y1"),
        JAVA_FLOAT.withName("s1"),
        JAVA_FLOAT.withName("t1")
    );
    /**
     * top-left
     */
    public static final StructHandle.Float x0 = StructHandle.ofFloat(LAYOUT, "x0"),
        y0 = StructHandle.ofFloat(LAYOUT, "y0"),
        s0 = StructHandle.ofFloat(LAYOUT, "s0"),
        t0 = StructHandle.ofFloat(LAYOUT, "t0");
    /**
     * bottom-right
     */
    public static final StructHandle.Float x1 = StructHandle.ofFloat(LAYOUT, "x1"),
        y1 = StructHandle.ofFloat(LAYOUT, "y1"),
        s1 = StructHandle.ofFloat(LAYOUT, "s1"),
        t1 = StructHandle.ofFloat(LAYOUT, "t1");

    /**
     * Creates a struct with the given layout.
     *
     * @param segment      the segment
     * @param elementCount the element count
     */
    public STBTTAlignedQuad(MemorySegment segment, long elementCount) {
        super(segment, elementCount, LAYOUT);
    }

    /**
     * Allocates a struct with the given layout.
     *
     * @param allocator    the allocator
     * @param elementCount the element count
     */
    public STBTTAlignedQuad(SegmentAllocator allocator, long elementCount) {
        super(allocator, elementCount, LAYOUT);
    }

    /**
     * Creates a struct with the given layout.
     *
     * @param segment the segment
     */
    public STBTTAlignedQuad(MemorySegment segment) {
        super(segment, LAYOUT);
    }

    /**
     * Allocates a struct with the given layout.
     *
     * @param allocator the allocator
     */
    public STBTTAlignedQuad(SegmentAllocator allocator) {
        super(allocator, LAYOUT);
    }
}
