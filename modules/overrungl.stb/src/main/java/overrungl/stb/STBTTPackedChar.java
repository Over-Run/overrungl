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

import static java.lang.foreign.ValueLayout.*;

/**
 * <h2>Layout</h2>
 * <pre><code>
 * typedef struct
 * {
 *    unsigned short {@link #x0},{@link #y0},{@link #x1},{@link #y1}; // coordinates of bbox in bitmap
 *    float {@link #xoff},{@link #yoff},{@link #xadvance};
 *    float {@link #xoff2},{@link #yoff2};
 * } stbtt_packedchar;
 * </code></pre>
 *
 * @author squid233
 * @since 0.1.0
 */
public final class STBTTPackedChar extends Struct {
    /**
     * The struct layout.
     */
    public static final StructLayout LAYOUT = MemoryLayout.structLayout(
        JAVA_SHORT.withName("x0"),
        JAVA_SHORT.withName("y0"),
        JAVA_SHORT.withName("x1"),
        JAVA_SHORT.withName("y1"),
        JAVA_FLOAT.withName("xoff"),
        JAVA_FLOAT.withName("yoff"),
        JAVA_FLOAT.withName("xadvance"),
        JAVA_FLOAT.withName("xoff2"),
        JAVA_FLOAT.withName("yoff2")
    );
    /**
     * coordinates of bbox in bitmap
     */
    public static final StructHandle.Short x0 = StructHandle.ofShort(LAYOUT, "x0"),
        y0 = StructHandle.ofShort(LAYOUT, "y0"),
        x1 = StructHandle.ofShort(LAYOUT, "x1"),
        y1 = StructHandle.ofShort(LAYOUT, "y1");
    /**
     * xoff
     */
    public static final StructHandle.Float xoff = StructHandle.ofFloat(LAYOUT, "xoff");
    /**
     * yoff
     */
    public static final StructHandle.Float yoff = StructHandle.ofFloat(LAYOUT, "yoff");
    /**
     * xadvance
     */
    public static final StructHandle.Float xadvance = StructHandle.ofFloat(LAYOUT, "xadvance");
    /**
     * xoff2
     */
    public static final StructHandle.Float xoff2 = StructHandle.ofFloat(LAYOUT, "xoff2");
    /**
     * yoff2
     */
    public static final StructHandle.Float yoff2 = StructHandle.ofFloat(LAYOUT, "yoff2");

    /**
     * Creates a struct with the given layout.
     *
     * @param segment      the segment
     * @param elementCount the element count
     */
    public STBTTPackedChar(MemorySegment segment, long elementCount) {
        super(segment, elementCount, LAYOUT);
    }

    /**
     * Allocates a struct with the given layout.
     *
     * @param allocator    the allocator
     * @param elementCount the element count
     */
    public STBTTPackedChar(SegmentAllocator allocator, long elementCount) {
        super(allocator, elementCount, LAYOUT);
    }

    /**
     * Creates a struct with the given layout.
     *
     * @param segment the segment
     */
    public STBTTPackedChar(MemorySegment segment) {
        super(segment, LAYOUT);
    }

    /**
     * Allocates a struct with the given layout.
     *
     * @param allocator the allocator
     */
    public STBTTPackedChar(SegmentAllocator allocator) {
        super(allocator, LAYOUT);
    }
}
