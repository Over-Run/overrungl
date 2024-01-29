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

import static java.lang.foreign.ValueLayout.JAVA_BYTE;
import static java.lang.foreign.ValueLayout.JAVA_SHORT;

/**
 * <h2>Layout</h2>
 * <pre><code>
 * typedef struct
 * {
 *    stbtt_vertex_type {@link #x},{@link #y},{@link #cx},{@link #cy},{@link #cx1},{@link #cy1};
 *    unsigned char {@link #type},{@link #padding};
 * } stbtt_vertex;
 * </code></pre>
 *
 * @author squid233
 * @since 0.1.0
 */
public final class STBTTVertex extends Struct {
    /**
     * The struct layout.
     */
    public static final StructLayout LAYOUT = MemoryLayout.structLayout(
        JAVA_SHORT.withName("x"),
        JAVA_SHORT.withName("y"),
        JAVA_SHORT.withName("cx"),
        JAVA_SHORT.withName("cy"),
        JAVA_SHORT.withName("cx1"),
        JAVA_SHORT.withName("cy1"),
        JAVA_BYTE.withName("type"),
        JAVA_BYTE.withName("padding")

    );
    /**
     * x
     */
    public final StructHandle.Short x = StructHandle.ofShort(this, "x");
    /**
     * y
     */
    public final StructHandle.Short y = StructHandle.ofShort(this, "y");
    /**
     * cx
     */
    public final StructHandle.Short cx = StructHandle.ofShort(this, "cx");
    /**
     * cy
     */
    public final StructHandle.Short cy = StructHandle.ofShort(this, "cy");
    /**
     * cx1
     */
    public final StructHandle.Short cx1 = StructHandle.ofShort(this, "cx1");
    /**
     * cy1
     */
    public final StructHandle.Short cy1 = StructHandle.ofShort(this, "cy1");
    /**
     * type
     */
    public final StructHandle.Byte type = StructHandle.ofByte(this, "type");
    /**
     * padding
     */
    public final StructHandle.Byte padding = StructHandle.ofByte(this, "padding");

    /**
     * Creates a struct with the given layout.
     *
     * @param segment      the segment
     * @param elementCount the element count
     */
    public STBTTVertex(MemorySegment segment, long elementCount) {
        super(segment, elementCount, LAYOUT);
    }

    /**
     * Allocates a struct with the given layout.
     *
     * @param allocator    the allocator
     * @param elementCount the element count
     */
    public STBTTVertex(SegmentAllocator allocator, long elementCount) {
        super(allocator, elementCount, LAYOUT);
    }

    /**
     * Creates a struct with the given layout.
     *
     * @param segment the segment
     */
    public STBTTVertex(MemorySegment segment) {
        super(segment, LAYOUT);
    }

    /**
     * Allocates a struct with the given layout.
     *
     * @param allocator the allocator
     */
    public STBTTVertex(SegmentAllocator allocator) {
        super(allocator, LAYOUT);
    }
}
