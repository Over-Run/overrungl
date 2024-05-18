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

import overrun.marshal.LayoutBuilder;
import overrun.marshal.struct.Struct;
import overrun.marshal.struct.StructAllocator;

import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandles;

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
public interface GLFWImage extends Struct<GLFWImage> {
    /**
     * The allocator
     */
    StructAllocator<GLFWImage> OF = new StructAllocator<>(
        MethodHandles.lookup(),
        LayoutBuilder.struct()
            .cInt("width")
            .cInt("height")
            .cAddress("pixels")
            .build()
    );

    /**
     * {@return the width, in pixels, of this image}
     */
    int width();

    /**
     * Sets {@link #width()}.
     *
     * @param val the value
     * @return this
     */
    GLFWImage width(int val);

    /**
     * {@return the height, in pixels, of this image}
     */
    int height();

    /**
     * Sets {@link #height()}.
     *
     * @param val the value
     * @return this
     */
    GLFWImage height(int val);

    /**
     * {@return the pixel data address of this image, arranged left-to-right, top-to-bottom}
     */
    MemorySegment pixels();

    /**
     * Sets {@link #pixels()}.
     *
     * @param val the value
     * @return this
     */
    GLFWImage pixels(MemorySegment val);
}
