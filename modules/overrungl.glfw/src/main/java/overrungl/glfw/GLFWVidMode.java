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

import java.lang.invoke.MethodHandles;

/**
 * This describes a single video mode.
 * <h2>Layout</h2>
 * <pre><code>
 * struct GLFWvidmode {
 *     int {@link #width};
 *     int {@link #height};
 *     int {@link #redBits};
 *     int {@link #greenBits};
 *     int {@link #blueBits};
 *     int {@link #refreshRate};
 * }</code></pre>
 *
 * @author squid233
 * @see GLFW#getVideoMode
 * @see GLFW#getVideoModes
 * @since 0.1.0
 */
public interface GLFWVidMode extends Struct<GLFWVidMode> {
    /**
     * The allocator
     */
    StructAllocator<GLFWVidMode> OF = new StructAllocator<>(
        MethodHandles.lookup(),
        LayoutBuilder.struct()
            .cInt("width")
            .cInt("height")
            .cInt("redBits")
            .cInt("greenBits")
            .cInt("blueBits")
            .cInt("refreshRate")
            .build()
    );

    /**
     * {@return the width, in screen coordinates, of the video mode}
     */
    int width();

    /**
     * {@return the height, in screen coordinates, of the video mode}
     */
    int height();

    /**
     * {@return the bit depth of the red channel of the video mode}
     */
    int redBits();

    /**
     * {@return the bit depth of the green channel of the video mode}
     */
    int greenBits();

    /**
     * {@return the bit depth of the blue channel of the video mode}
     */
    int blueBits();

    /**
     * {@return the refresh rate, in Hz, of the video mode}
     */
    int refreshRate();
}
