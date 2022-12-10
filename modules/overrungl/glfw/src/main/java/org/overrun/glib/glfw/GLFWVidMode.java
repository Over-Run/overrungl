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
    ).withName("GLFWvidmode");
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
     * @param scope   the segment scope
     */
    public GLFWVidMode(MemorySegment address, SegmentScope scope) {
        super(address, scope);
    }

    /**
     * Creates a {@code GLFWvidmode} instance with the given segment scope.
     *
     * @param scope the segment scope
     * @return the instance
     */
    public static GLFWVidMode create(SegmentScope scope) {
        return new GLFWVidMode(MemorySegment.allocateNative(LAYOUT, scope), scope);
    }

    /**
     * Creates a {@code GLFWvidmode} instance with the given segment scope and count.
     *
     * @param scope the segment scope
     * @param count the count
     * @return the instance
     */
    public static Buffer create(SegmentScope scope, long count) {
        return new Buffer(MemorySegment.allocateNative(MemoryLayout.sequenceLayout(count, LAYOUT), scope), scope, count);
    }

    /**
     * {@code const_cast<GLFWVidMode>(this)}
     *
     * @return the immutable state
     */
    public Value constCast() {
        return new Value(address(), scope(), this);
    }

    /**
     * Gets the width.
     *
     * @return The width, in screen coordinates, of the video mode.
     */
    public int width() {
        return (int) pWidth.get(segment(LAYOUT, scope));
    }

    /**
     * Gets the height.
     *
     * @return The height, in screen coordinates, of the video mode.
     */
    public int height() {
        return (int) pHeight.get(segment(LAYOUT, scope));
    }

    /**
     * Gets the red bits.
     *
     * @return The bit depth of the red channel of the video mode.
     */
    public int redBits() {
        return (int) pRedBits.get(segment(LAYOUT, scope));
    }

    /**
     * Gets the green bits.
     *
     * @return The bit depth of the green channel of the video mode.
     */
    public int greenBits() {
        return (int) pGreenBits.get(segment(LAYOUT, scope));
    }

    /**
     * Gets the blue bits.
     *
     * @return The bit depth of the blue channel of the video mode.
     */
    public int blueBits() {
        return (int) pBlueBits.get(segment(LAYOUT, scope));
    }

    /**
     * Gets the refresh rate.
     *
     * @return The refresh rate, in Hz, of the video mode.
     */
    public int refreshRate() {
        return (int) pRefreshRate.get(segment(LAYOUT, scope));
    }

    /**
     * The immutable state of {@link GLFWVidMode}.
     *
     * @author squid233
     * @since 0.1.0
     */
    public static final class Value extends GLFWVidMode {
        private final int width;
        private final int height;
        private final int redBits;
        private final int greenBits;
        private final int blueBits;
        private final int refreshRate;

        private Value(MemorySegment address, SegmentScope scope, GLFWVidMode mode) {
            super(address, scope);
            this.width = mode.width();
            this.height = mode.height();
            this.redBits = mode.redBits();
            this.greenBits = mode.greenBits();
            this.blueBits = mode.blueBits();
            this.refreshRate = mode.refreshRate();
        }

        /**
         * returns this
         *
         * @return this
         */
        @Override
        public Value constCast() {
            return this;
        }

        @Override
        public int width() {
            return width;
        }

        @Override
        public int height() {
            return height;
        }

        @Override
        public int redBits() {
            return redBits;
        }

        @Override
        public int greenBits() {
            return greenBits;
        }

        @Override
        public int blueBits() {
            return blueBits;
        }

        @Override
        public int refreshRate() {
            return refreshRate;
        }
    }

    /**
     * This describes video modes.
     *
     * @author squid233
     * @since 0.1.0
     */
    public static class Buffer extends GLFWVidMode {
        private final long elementCount;
        private final VarHandle pWidth, pHeight, pRedBits, pGreenBits, pBlueBits, pRefreshRate;

        /**
         * Create a {@code GLFWvidmode.Buffer} instance.
         *
         * @param address      the address
         * @param scope        the segment scope
         * @param elementCount the element count
         */
        public Buffer(MemorySegment address, SegmentScope scope, long elementCount) {
            super(address, scope);
            this.elementCount = elementCount;
            var layout = MemoryLayout.sequenceLayout(elementCount, LAYOUT);
            pWidth = layout.varHandle(PathElement.sequenceElement(), PathElement.groupElement("width"));
            pHeight = layout.varHandle(PathElement.sequenceElement(), PathElement.groupElement("height"));
            pRedBits = layout.varHandle(PathElement.sequenceElement(), PathElement.groupElement("redBits"));
            pGreenBits = layout.varHandle(PathElement.sequenceElement(), PathElement.groupElement("greenBits"));
            pBlueBits = layout.varHandle(PathElement.sequenceElement(), PathElement.groupElement("blueBits"));
            pRefreshRate = layout.varHandle(PathElement.sequenceElement(), PathElement.groupElement("refreshRate"));
        }

        /**
         * Gets the element count.
         *
         * @return the element count
         */
        public long elementCount() {
            return elementCount;
        }

        /**
         * Converts to the {@link Segmented segmented buffer}.
         *
         * @return The {@link Buffer} with instanced memory segment.
         */
        public Segmented toSegmented() {
            return new Segmented(address(), scope(), elementCount());
        }

        /**
         * Gets the width at the given index.
         *
         * @param index the index
         * @return The width, in screen coordinates, of the video mode.
         */
        public int widthAt(long index) {
            return (int) pWidth.get(segment(LAYOUT, scope), index);
        }

        /**
         * Gets the height at the given index.
         *
         * @param index the index
         * @return The height, in screen coordinates, of the video mode.
         */
        public int heightAt(long index) {
            return (int) pHeight.get(segment(LAYOUT, scope), index);
        }

        /**
         * Gets the red bits at the given index.
         *
         * @param index the index
         * @return The bit depth of the red channel of the video mode.
         */
        public int redBitsAt(long index) {
            return (int) pRedBits.get(segment(LAYOUT, scope), index);
        }

        /**
         * Gets the green bits at the given index.
         *
         * @param index the index
         * @return The bit depth of the green channel of the video mode.
         */
        public int greenBitsAt(long index) {
            return (int) pGreenBits.get(segment(LAYOUT, scope), index);
        }

        /**
         * Gets the blue bits at the given index.
         *
         * @param index the index
         * @return The bit depth of the blue channel of the video mode.
         */
        public int blueBitsAt(long index) {
            return (int) pBlueBits.get(segment(LAYOUT, scope), index);
        }

        /**
         * Gets the refresh rate at the given index.
         *
         * @param index the index
         * @return The refresh rate, in Hz, of the video mode.
         */
        public int refreshRateAt(long index) {
            return (int) pRefreshRate.get(segment(LAYOUT, scope), index);
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
        public int redBits() {
            return redBitsAt(0);
        }

        @Override
        public int greenBits() {
            return greenBitsAt(0);
        }

        @Override
        public int blueBits() {
            return blueBitsAt(0);
        }

        @Override
        public int refreshRate() {
            return refreshRateAt(0);
        }

        /**
         * The {@link Buffer} with instanced memory segment.
         *
         * @author squid233
         * @since 0.1.0
         */
        public static final class Segmented extends Buffer {
            private final MemorySegment segment;

            private Segmented(MemorySegment address, SegmentScope scope, long elementCount) {
                super(address, scope, elementCount);
                segment = segment(LAYOUT, scope);
            }

            @Override
            public MemorySegment segment(MemoryLayout layout, SegmentScope scope) {
                return segment;
            }
        }
    }
}
