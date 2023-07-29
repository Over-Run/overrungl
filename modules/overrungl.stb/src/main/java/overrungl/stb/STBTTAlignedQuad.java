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

import static java.lang.foreign.ValueLayout.JAVA_FLOAT;

/**
 * <h2>Layout</h2>
 * <pre><code>
 * typedef struct
 * {
 *    float {@link #x0() x0},{@link #y0() y0},{@link #s0() s0},{@link #t0() t0}; // top-left
 *    float {@link #x1() x1},{@link #y1() y1},{@link #s1() s1},{@link #t1() t1}; // bottom-right
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
    private static final VarHandle
        x0 = LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("x0")),
        y0 = LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("y0")),
        s0 = LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("s0")),
        t0 = LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("t0")),
        x1 = LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("x1")),
        y1 = LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("y1")),
        s1 = LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("s1")),
        t1 = LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("t1"));

    public STBTTAlignedQuad(MemorySegment address) {
        super(address, LAYOUT);
    }

    public static STBTTAlignedQuad create(SegmentAllocator allocator) {
        return new STBTTAlignedQuad(allocator.allocate(LAYOUT));
    }

    public float x0() {
        return (float) x0.get(segment());
    }

    public float y0() {
        return (float) y0.get(segment());
    }

    public float s0() {
        return (float) s0.get(segment());
    }

    public float t0() {
        return (float) t0.get(segment());
    }

    public float x1() {
        return (float) x1.get(segment());
    }

    public float y1() {
        return (float) y1.get(segment());
    }

    public float s1() {
        return (float) s1.get(segment());
    }

    public float t1() {
        return (float) t1.get(segment());
    }
}
