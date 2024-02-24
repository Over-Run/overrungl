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

import java.lang.foreign.*;

/**
 * <h2>Layout</h2>
 * <pre><code>
 * typedef struct stbtt_kerningentry
 * {
 *    int {@link #glyph1}; // use stbtt_FindGlyphIndex
 *    int {@link #glyph2};
 *    int {@link #advance};
 * } stbtt_kerningentry;
 * </code></pre>
 *
 * @author squid233
 * @since 0.1.0
 */
public final class STBTTKerningEntry extends Struct {
    /**
     * The struct layout.
     */
    public static final StructLayout LAYOUT = MemoryLayout.structLayout(
        ValueLayout.JAVA_INT.withName("glyph1"),
        ValueLayout.JAVA_INT.withName("glyph2"),
        ValueLayout.JAVA_INT.withName("advance")
    );
    /**
     * use stbtt_FindGlyphIndex
     */
    public static final StructHandle.Int glyph1 = StructHandle.ofInt(LAYOUT, "glyph1");
    /**
     * glyph2
     */
    public static final StructHandle.Int glyph2 = StructHandle.ofInt(LAYOUT, "glyph2");
    /**
     * advance
     */
    public static final StructHandle.Int advance = StructHandle.ofInt(LAYOUT, "advance");

    /**
     * Creates a struct with the given layout.
     *
     * @param segment      the segment
     * @param elementCount the element count
     */
    public STBTTKerningEntry(MemorySegment segment, long elementCount) {
        super(segment, elementCount, LAYOUT);
    }

    /**
     * Allocates a struct with the given layout.
     *
     * @param allocator    the allocator
     * @param elementCount the element count
     */
    public STBTTKerningEntry(SegmentAllocator allocator, long elementCount) {
        super(allocator, elementCount, LAYOUT);
    }

    /**
     * Creates a struct with the given layout.
     *
     * @param segment the segment
     */
    public STBTTKerningEntry(MemorySegment segment) {
        super(segment, LAYOUT);
    }

    /**
     * Allocates a struct with the given layout.
     *
     * @param allocator the allocator
     */
    public STBTTKerningEntry(SegmentAllocator allocator) {
        super(allocator, LAYOUT);
    }
}
