/*
 * MIT License
 *
 * Copyright (c) 2022-2024 Overrun Organization
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

package overrungl.opengl;

import overrun.marshal.struct.Struct;
import overrun.marshal.struct.StructHandle;

import java.lang.foreign.*;

/**
 * The OpenGL 4.2 draw arrays indirect command.
 * <h2>Layout</h2>
 * <pre><code>
 * struct DrawArraysIndirectCommand {
 *     unsigned int {@link #count};
 *     unsigned int {@link #primCount};
 *     unsigned int {@link #first};
 *     unsigned int {@link #baseInstance};
 * }</code></pre>
 *
 * @author squid233
 * @since 0.1.0
 */
public final class DrawArraysIndirectCommand extends Struct {
    /**
     * The struct layout.
     */
    public static final StructLayout LAYOUT = MemoryLayout.structLayout(
        ValueLayout.JAVA_INT.withName("count"),
        ValueLayout.JAVA_INT.withName("primCount"),
        ValueLayout.JAVA_INT.withName("first"),
        ValueLayout.JAVA_INT.withName("baseInstance")
    );
    /**
     * the count
     */
    public static final StructHandle.Int count = StructHandle.ofInt(LAYOUT, "count");
    /**
     * the primCount
     */
    public static final StructHandle.Int primCount = StructHandle.ofInt(LAYOUT, "primCount");
    /**
     * the first
     */
    public static final StructHandle.Int first = StructHandle.ofInt(LAYOUT, "first");
    /**
     * the baseInstance
     */
    public static final StructHandle.Int baseInstance = StructHandle.ofInt(LAYOUT, "baseInstance");

    /**
     * Creates a struct with the given layout.
     *
     * @param segment      the segment
     * @param elementCount the element count
     */
    public DrawArraysIndirectCommand(MemorySegment segment, long elementCount) {
        super(segment, elementCount, LAYOUT);
    }

    /**
     * Allocates a struct with the given layout.
     *
     * @param allocator    the allocator
     * @param elementCount the element count
     */
    public DrawArraysIndirectCommand(SegmentAllocator allocator, long elementCount) {
        super(allocator, elementCount, LAYOUT);
    }

    /**
     * Creates a struct with the given layout.
     *
     * @param segment the segment
     */
    public DrawArraysIndirectCommand(MemorySegment segment) {
        super(segment, LAYOUT);
    }

    /**
     * Allocates a struct with the given layout.
     *
     * @param allocator the allocator
     */
    public DrawArraysIndirectCommand(SegmentAllocator allocator) {
        super(allocator, LAYOUT);
    }
}
