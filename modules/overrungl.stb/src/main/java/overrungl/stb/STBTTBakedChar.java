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
 * } stbtt_bakedchar;
 * </code></pre>
 *
 * @author squid233
 * @since 0.1.0
 */
public final class STBTTBakedChar extends Struct {
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
        JAVA_FLOAT.withName("xadvance")
    );
    /**
     * coordinates of bbox in bitmap
     */
    public final StructHandle.Short x0 = StructHandle.ofShort(this, "x0"),
        y0 = StructHandle.ofShort(this, "y0"),
        x1 = StructHandle.ofShort(this, "x1"),
        y1 = StructHandle.ofShort(this, "y1");
    /**
     * xoff
     */
    public final StructHandle.Float xoff = StructHandle.ofFloat(this, "xoff");
    /**
     * yoff
     */
    public final StructHandle.Float yoff = StructHandle.ofFloat(this, "yoff");
    /**
     * xadvance
     */
    public final StructHandle.Float xadvance = StructHandle.ofFloat(this, "xadvance");

    /**
     * Creates a struct with the given layout.
     *
     * @param segment      the segment
     * @param elementCount the element count
     */
    public STBTTBakedChar(MemorySegment segment, long elementCount) {
        super(segment, elementCount, LAYOUT);
    }

    /**
     * Allocates a struct with the given layout.
     *
     * @param allocator    the allocator
     * @param elementCount the element count
     */
    public STBTTBakedChar(SegmentAllocator allocator, long elementCount) {
        super(allocator, elementCount, LAYOUT);
    }

    /**
     * Creates a struct with the given layout.
     *
     * @param segment the segment
     */
    public STBTTBakedChar(MemorySegment segment) {
        super(segment, LAYOUT);
    }

    /**
     * Allocates a struct with the given layout.
     *
     * @param allocator the allocator
     */
    public STBTTBakedChar(SegmentAllocator allocator) {
        super(allocator, LAYOUT);
    }
}
