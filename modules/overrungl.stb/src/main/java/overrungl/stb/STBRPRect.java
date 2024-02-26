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
import overrun.marshal.struct.StructHandle;

import java.lang.foreign.*;

/**
 * 16 bytes, nominally
 *
 * @author squid233
 * @since 0.1.0
 */
public final class STBRPRect extends Struct {
    /**
     * The layout.
     */
    public static final StructLayout LAYOUT = MemoryLayout.structLayout(
        ValueLayout.JAVA_INT.withName("id"),
        ValueLayout.JAVA_INT.withName("w"),
        ValueLayout.JAVA_INT.withName("h"),
        ValueLayout.JAVA_INT.withName("x"),
        ValueLayout.JAVA_INT.withName("y"),
        ValueLayout.JAVA_INT.withName("was_packed")
    );
    /**
     * reserved for your use
     */
    public static final StructHandle.Int id = StructHandle.ofInt(LAYOUT, "id");
    /**
     * input
     */
    public static final StructHandle.Int w = StructHandle.ofInt(LAYOUT, "w"),
        h = StructHandle.ofInt(LAYOUT, "h");
    /**
     * output
     */
    public static final StructHandle.Int x = StructHandle.ofInt(LAYOUT, "x"),
        y = StructHandle.ofInt(LAYOUT, "y"),
    /**
     * non-zero if valid packing
     */
    wasPacked = StructHandle.ofInt(LAYOUT, "was_packed");

    /**
     * Creates a struct with the given layout.
     *
     * @param segment      the segment
     * @param elementCount the element count
     */
    public STBRPRect(MemorySegment segment, long elementCount) {
        super(segment, elementCount, LAYOUT);
    }

    /**
     * Allocates a struct with the given layout.
     *
     * @param allocator    the allocator
     * @param elementCount the element count
     */
    public STBRPRect(SegmentAllocator allocator, long elementCount) {
        super(allocator, elementCount, LAYOUT);
    }

    /**
     * Creates a struct with the given layout.
     *
     * @param segment the segment
     */
    public STBRPRect(MemorySegment segment) {
        super(segment, LAYOUT);
    }

    /**
     * Allocates a struct with the given layout.
     *
     * @param allocator the allocator
     */
    public STBRPRect(SegmentAllocator allocator) {
        super(allocator, LAYOUT);
    }
}
