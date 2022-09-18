/*
 * MIT License
 *
 * Copyright (c) 2022 Overrun Organization
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
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package org.overrun.glib.glfw;

import org.overrun.glib.Pointer;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.VarHandle;

/**
 * This describes a single video mode.
 *
 * <h3>Layout</h3>
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
public class GLFWVidMode extends Pointer {
    /**
     * The struct layout.
     */
    public static final GroupLayout LAYOUT = MemoryLayout.structLayout(
        ValueLayout.JAVA_INT.withName("width"),
        ValueLayout.JAVA_INT.withName("height"),
        ValueLayout.JAVA_INT.withName("redBits"),
        ValueLayout.JAVA_INT.withName("greenBits"),
        ValueLayout.JAVA_INT.withName("blueBits"),
        ValueLayout.JAVA_INT.withName("refreshRate")
    );
    private static final VarHandle
        pWidth = LAYOUT.varHandle(PathElement.groupElement("width")),
        pHeight = LAYOUT.varHandle(PathElement.groupElement("height")),
        pRedBits = LAYOUT.varHandle(PathElement.groupElement("redBits")),
        pGreenBits = LAYOUT.varHandle(PathElement.groupElement("greenBits")),
        pBlueBits = LAYOUT.varHandle(PathElement.groupElement("blueBits")),
        pRefreshRate = LAYOUT.varHandle(PathElement.groupElement("refreshRate"));

    /**
     * Create a {@code GLFWvidmode} instance.
     *
     * @param address the address
     */
    public GLFWVidMode(Addressable address) {
        super(address);
    }

    /**
     * Creates a {@code GLFWvidmode} instance with the given memory session.
     *
     * @param session the memory session
     * @return the instance
     */
    public static GLFWVidMode create(MemorySession session) {
        return new GLFWVidMode(session.allocate(LAYOUT));
    }

    /**
     * Gets the width.
     *
     * @return The width, in screen coordinates, of the video mode.
     */
    public int width() {
        try (var session = MemorySession.openShared()) {
            return (int) pWidth.get(segment(LAYOUT, session));
        }
    }

    /**
     * Gets the height.
     *
     * @return The height, in screen coordinates, of the video mode.
     */
    public int height() {
        try (var session = MemorySession.openShared()) {
            return (int) pHeight.get(segment(LAYOUT, session));
        }
    }

    /**
     * Gets the red bits.
     *
     * @return The bit depth of the red channel of the video mode.
     */
    public int redBits() {
        try (var session = MemorySession.openShared()) {
            return (int) pRedBits.get(segment(LAYOUT, session));
        }
    }

    /**
     * Gets the green bits.
     *
     * @return The bit depth of the green channel of the video mode.
     */
    public int greenBits() {
        try (var session = MemorySession.openShared()) {
            return (int) pGreenBits.get(segment(LAYOUT, session));
        }
    }

    /**
     * Gets the blue bits.
     *
     * @return The bit depth of the blue channel of the video mode.
     */
    public int blueBits() {
        try (var session = MemorySession.openShared()) {
            return (int) pBlueBits.get(segment(LAYOUT, session));
        }
    }

    /**
     * Gets the refresh rate.
     *
     * @return The refresh rate, in Hz, of the video mode.
     */
    public int refreshRate() {
        try (var session = MemorySession.openShared()) {
            return (int) pRefreshRate.get(segment(LAYOUT, session));
        }
    }
}
