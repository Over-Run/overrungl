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

package overrungl.glfw;

import overrun.marshal.struct.Struct;
import overrun.marshal.struct.StructHandle;

import java.lang.foreign.*;

/**
 * This describes a single 2D image. See the documentation for each related
 * function what the expected pixel format is.
 * <h2>Layout</h2>
 * <pre><code>
 * struct GLFWimage {
 *     int {@link #width};
 *     int {@link #height};
 *     unsigned char* {@link #pixels};
 * }</code></pre>
 *
 * @author squid233
 * @since 0.1.0
 */
public final class GLFWImage extends Struct {
    /**
     * The struct layout.
     */
    public static final StructLayout LAYOUT = MemoryLayout.structLayout(
        ValueLayout.JAVA_INT.withName("width"),
        ValueLayout.JAVA_INT.withName("height"),
        ValueLayout.ADDRESS.withName("pixels")
    );
    /**
     * The width, in pixels, of this image.
     */
    public final StructHandle.Int width = StructHandle.ofInt(this, "width");
    /**
     * The height, in pixels, of this image.
     */
    public final StructHandle.Int height = StructHandle.ofInt(this, "height");
    /**
     * The pixel data address of this image, arranged left-to-right, top-to-bottom.
     */
    public final StructHandle.Address pixels = StructHandle.ofAddress(this, "pixels");

    /**
     * Creates a struct with the given layout.
     *
     * @param segment      the segment
     * @param elementCount the element count
     */
    public GLFWImage(MemorySegment segment, long elementCount) {
        super(segment, elementCount, LAYOUT);
    }

    /**
     * Allocates a struct with the given layout.
     *
     * @param allocator    the allocator
     * @param elementCount the element count
     */
    public GLFWImage(SegmentAllocator allocator, long elementCount) {
        super(allocator, elementCount, LAYOUT);
    }

    /**
     * Creates a struct with the given layout.
     *
     * @param segment the segment
     */
    public GLFWImage(MemorySegment segment) {
        super(segment, LAYOUT);
    }

    /**
     * Allocates a struct with the given layout.
     *
     * @param allocator the allocator
     */
    public GLFWImage(SegmentAllocator allocator) {
        super(allocator, LAYOUT);
    }
}
