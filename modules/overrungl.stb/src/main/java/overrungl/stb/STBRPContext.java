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

import java.lang.foreign.*;

/**
 * the details of the following structures don't matter to you, but they must
 * be visible so you can handle the memory allocations for them
 * @author squid233
 * @since 0.1.0
 */
public final class STBRPContext extends Struct {
    /**
     * The layout.
     */
    public static final StructLayout LAYOUT= MemoryLayout.structLayout(
        ValueLayout.JAVA_INT.withName("width"),
        ValueLayout.JAVA_INT.withName("height"),
        ValueLayout.JAVA_INT.withName("align"),
        ValueLayout.JAVA_INT.withName("init_mode"),
        ValueLayout.JAVA_INT.withName("heuristic"),
        ValueLayout.JAVA_INT.withName("num_nodes"),
        ValueLayout.ADDRESS.withName("active_head").withTargetLayout(MemoryLayout.sequenceLayout(0L, STBRPNode.LAYOUT)),
        ValueLayout.ADDRESS.withName("free_head").withTargetLayout(MemoryLayout.sequenceLayout(0L, STBRPNode.LAYOUT)),
        MemoryLayout.sequenceLayout(2L, STBRPNode.LAYOUT)
    );

    /**
     * Creates a struct with the given layout.
     *
     * @param segment      the segment
     * @param elementCount the element count
     */
    public STBRPContext(MemorySegment segment, long elementCount) {
        super(segment, elementCount, LAYOUT);
    }

    /**
     * Allocates a struct with the given layout.
     *
     * @param allocator    the allocator
     * @param elementCount the element count
     */
    public STBRPContext(SegmentAllocator allocator, long elementCount) {
        super(allocator, elementCount, LAYOUT);
    }

    /**
     * Creates a struct with the given layout.
     *
     * @param segment the segment
     */
    public STBRPContext(MemorySegment segment) {
        super(segment, LAYOUT);
    }

    /**
     * Allocates a struct with the given layout.
     *
     * @param allocator the allocator
     */
    public STBRPContext(SegmentAllocator allocator) {
        super(allocator, LAYOUT);
    }
}
