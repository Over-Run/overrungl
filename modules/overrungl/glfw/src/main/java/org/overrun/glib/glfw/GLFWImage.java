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
 * This describes a single 2D image. See the documentation for each related
 * function what the expected pixel format is.
 *
 * <h2>Layout</h2>
 * <pre><code>
 * struct GLFWimage {
 *     int {@link #width() width};
 *     int {@link #height() height};
 *     unsigned char* {@link #pixels() pixels};
 * }</code></pre>
 *
 * @author squid233
 * @since 0.1.0
 */
public class GLFWImage extends Pointer {
    /**
     * The struct layout.
     */
    public static final GroupLayout LAYOUT = MemoryLayout.structLayout(
        ValueLayout.JAVA_INT.withName("width"),
        ValueLayout.JAVA_INT.withName("height"),
        ValueLayout.ADDRESS.withName("pixels")
    );
    private static final VarHandle
        pWidth = LAYOUT.varHandle(PathElement.groupElement("width")),
        pHeight = LAYOUT.varHandle(PathElement.groupElement("height")),
        pPixels = LAYOUT.varHandle(PathElement.groupElement("pixels"));

    /**
     * Create a {@code GLFWimage} instance.
     *
     * @param address the address
     * @param session the memory session
     */
    public GLFWImage(Addressable address, MemorySession session) {
        super(address, session);
    }

    /**
     * Creates a {@code GLFWimage} instance with the given memory session.
     *
     * @param session the memory session
     * @return the instance
     */
    public static GLFWImage create(MemorySession session) {
        return new GLFWImage(session.allocate(LAYOUT), session);
    }

    /**
     * Creates a {@code GLFWimage} instance with the given memory session and count.
     *
     * @param session the memory session
     * @param count   the count
     * @return the instance
     */
    public static Buffer create(MemorySession session, long count) {
        return new Buffer(session.allocateArray(LAYOUT, count), session);
    }

    /**
     * Sets the image width.
     *
     * @param width The width, in pixels, of this image.
     * @return this
     */
    public GLFWImage width(int width) {
        pWidth.set(segment(LAYOUT, session), width);
        return this;
    }

    /**
     * Sets the image height.
     *
     * @param height The height, in pixels, of this image.
     * @return this
     */
    public GLFWImage height(int height) {
        pHeight.set(segment(LAYOUT, session), height);
        return this;
    }

    /**
     * Sets the image pixels address.
     *
     * @param pixels The pixel data address of this image, arranged left-to-right, top-to-bottom.
     * @return this
     */
    public GLFWImage pixels(Addressable pixels) {
        pPixels.set(segment(LAYOUT, session), pixels);
        return this;
    }

    /**
     * Gets the image width.
     *
     * @return The width, in pixels, of this image.
     */
    public int width() {
        return (int) pWidth.get(segment(LAYOUT, session));
    }

    /**
     * Gets the image height.
     *
     * @return The height, in pixels, of this image.
     */
    public int height() {
        return (int) pHeight.get(segment(LAYOUT, session));
    }

    /**
     * Gets the image pixels address.
     *
     * @return The pixel data address of this image, arranged left-to-right, top-to-bottom.
     */
    public MemoryAddress pixels() {
        return (MemoryAddress) pPixels.get(segment(LAYOUT, session));
    }

    /**
     * This describes 2D images.
     *
     * @author squid233
     * @since 0.1.0
     */
    public static class Buffer extends GLFWImage {
        private static final VarHandle
            pWidth = LAYOUT.varHandle(PathElement.sequenceElement(), PathElement.groupElement("width")),
            pHeight = LAYOUT.varHandle(PathElement.sequenceElement(), PathElement.groupElement("height")),
            pPixels = LAYOUT.varHandle(PathElement.sequenceElement(), PathElement.groupElement("pixels"));

        /**
         * Create a {@code GLFWimage.Buffer} instance.
         *
         * @param address the address
         * @param session the memory session
         */
        public Buffer(Addressable address, MemorySession session) {
            super(address, session);
        }

        /**
         * Sets the image width at the given index.
         *
         * @param index the index
         * @param width The width, in pixels, of this image.
         * @return this
         */
        public Buffer width(long index, int width) {
            pWidth.set(segment(LAYOUT, session), index, width);
            return this;
        }

        /**
         * Sets the image height at the given index.
         *
         * @param index  the index
         * @param height The height, in pixels, of this image.
         * @return this
         */
        public Buffer height(long index, int height) {
            pHeight.set(segment(LAYOUT, session), index, height);
            return this;
        }

        /**
         * Sets the image pixels address at the given index.
         *
         * @param index  the index
         * @param pixels The pixel data address of this image, arranged left-to-right, top-to-bottom.
         * @return this
         */
        public Buffer pixels(long index, Addressable pixels) {
            pPixels.set(segment(LAYOUT, session), index, pixels);
            return this;
        }

        @Override
        public Buffer width(int width) {
            return width(0, width);
        }

        @Override
        public Buffer height(int height) {
            return height(0, height);
        }

        @Override
        public Buffer pixels(Addressable pixels) {
            return pixels(0, pixels);
        }

        /**
         * Gets the image width at the given index.
         *
         * @param index the index
         * @return The width, in pixels, of this image.
         */
        public int widthAt(long index) {
            return (int) pWidth.get(segment(LAYOUT, session), index);
        }

        /**
         * Gets the image height at the given index.
         *
         * @param index the index
         * @return The height, in pixels, of this image.
         */
        public int heightAt(long index) {
            return (int) pHeight.get(segment(LAYOUT, session), index);
        }

        /**
         * Gets the image pixels address at the given index.
         *
         * @param index the index
         * @return The pixel data address of this image, arranged left-to-right, top-to-bottom.
         */
        public MemoryAddress pixelsAt(long index) {
            return (MemoryAddress) pPixels.get(segment(LAYOUT, session), index);
        }

        @Override
        public int width() {
            return widthAt(0);
        }

        @Override
        public int height() {
            return heightAt(0);
        }

        @Override
        public MemoryAddress pixels() {
            return pixelsAt(0);
        }
    }
}
