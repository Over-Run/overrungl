/*
 * MIT License
 *
 * Copyright (c) 2024 Overrun Organization
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

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.StructLayout;

import static java.lang.foreign.ValueLayout.ADDRESS;
import static java.lang.foreign.ValueLayout.JAVA_INT;

/**
 * The following structure is defined publicly so you can declare one on
 * the stack or as a global or etc, but you should treat it as opaque.
 *
 * @author squid233
 * @since 0.1.0
 */
public final class STBTTFontInfo extends Struct {
    /**
     * The layout.
     */
    public static final StructLayout LAYOUT = MemoryLayout.structLayout(
        ADDRESS.withName("userdata"),
        ADDRESS.withName("data"),
        JAVA_INT.withName("fontstart"),
        JAVA_INT.withName("numGlyphs"),
        JAVA_INT.withName("loca"),
        JAVA_INT.withName("head"),
        JAVA_INT.withName("glyf"),
        JAVA_INT.withName("hhea"),
        JAVA_INT.withName("hmtx"),
        JAVA_INT.withName("kern"),
        JAVA_INT.withName("gpos"),
        JAVA_INT.withName("svg"),
        JAVA_INT.withName("index_map"),
        JAVA_INT.withName("indexToLocFormat"),
        STBTTBuf.LAYOUT.withName("cff"),
        STBTTBuf.LAYOUT.withName("charstrings"),
        STBTTBuf.LAYOUT.withName("gsubrs"),
        STBTTBuf.LAYOUT.withName("subrs"),
        STBTTBuf.LAYOUT.withName("fontdicts"),
        STBTTBuf.LAYOUT.withName("fdselect")
    );

    /**
     * Creates a struct with the given layout.
     *
     * @param segment      the segment
     * @param elementCount the element count
     */
    public STBTTFontInfo(MemorySegment segment, long elementCount) {
        super(segment, elementCount, LAYOUT);
    }

    /**
     * Allocates a struct with the given layout.
     *
     * @param allocator    the allocator
     * @param elementCount the element count
     */
    public STBTTFontInfo(SegmentAllocator allocator, long elementCount) {
        super(allocator, elementCount, LAYOUT);
    }

    /**
     * Creates a struct with the given layout.
     *
     * @param segment the segment
     */
    public STBTTFontInfo(MemorySegment segment) {
        super(segment, LAYOUT);
    }

    /**
     * Allocates a struct with the given layout.
     *
     * @param allocator the allocator
     */
    public STBTTFontInfo(SegmentAllocator allocator) {
        super(allocator, LAYOUT);
    }
}
