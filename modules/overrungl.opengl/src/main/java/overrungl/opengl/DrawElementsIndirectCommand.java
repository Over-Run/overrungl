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
 * The OpenGL 4.2 draw elements indirect command.
 * <h2>Layout</h2>
 * <pre><code>
 * struct DrawElementsIndirectCommand {
 *     unsigned int {@link #count};
 *     unsigned int {@link #primCount};
 *     unsigned int {@link #firstIndex};
 *     unsigned int {@link #baseVertex};
 *     unsigned int {@link #baseInstance};
 * }</code></pre>
 *
 * @author squid233
 * @since 0.1.0
 */
public final class DrawElementsIndirectCommand extends Struct {
    /**
     * The struct layout.
     */
    public static final StructLayout LAYOUT = MemoryLayout.structLayout(
        ValueLayout.JAVA_INT.withName("count"),
        ValueLayout.JAVA_INT.withName("primCount"),
        ValueLayout.JAVA_INT.withName("firstIndex"),
        ValueLayout.JAVA_INT.withName("baseVertex"),
        ValueLayout.JAVA_INT.withName("baseInstance")
    );
    /**
     * the count
     */
    public final StructHandle.Int count = StructHandle.ofInt(this, "count");
    /**
     * the primCount
     */
    public final StructHandle.Int primCount = StructHandle.ofInt(this, "primCount");
    /**
     * the firstIndex
     */
    public final StructHandle.Int firstIndex = StructHandle.ofInt(this, "firstIndex");
    /**
     * the baseVertex
     */
    public final StructHandle.Int baseVertex = StructHandle.ofInt(this, "baseVertex");
    /**
     * the baseInstance
     */
    public final StructHandle.Int baseInstance = StructHandle.ofInt(this, "baseInstance");

    /**
     * Creates a struct with the given layout.
     *
     * @param segment      the segment
     * @param elementCount the element count
     */
    public DrawElementsIndirectCommand(MemorySegment segment, long elementCount) {
        super(segment, elementCount, LAYOUT);
    }

    /**
     * Allocates a struct with the given layout.
     *
     * @param allocator    the allocator
     * @param elementCount the element count
     */
    public DrawElementsIndirectCommand(SegmentAllocator allocator, long elementCount) {
        super(allocator, elementCount, LAYOUT);
    }

    /**
     * Creates a struct with the given layout.
     *
     * @param segment the segment
     */
    public DrawElementsIndirectCommand(MemorySegment segment) {
        super(segment, LAYOUT);
    }

    /**
     * Allocates a struct with the given layout.
     *
     * @param allocator the allocator
     */
    public DrawElementsIndirectCommand(SegmentAllocator allocator) {
        super(allocator, LAYOUT);
    }
}
