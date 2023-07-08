/*
 * MIT License
 *
 * Copyright (c) 2022-2023 Overrun Organization
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

import overrungl.ArrayPointer;
import overrungl.Struct;

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
public class GLFWVidMode extends Struct {
    /**
     * The struct layout.
     */
    public static final StructLayout LAYOUT = MemoryLayout.structLayout(
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
     * @param address   the address.
     * @param allocator the allocator of this address.
     */
    public GLFWVidMode(MemorySegment address, SegmentAllocator allocator) {
        super(address, allocator, LAYOUT);
    }

    /**
     * Creates a struct instance with the given memory layout.
     *
     * @param address   the address.
     * @param allocator the allocator of this address.
     * @param layout    the memory layout of this struct.
     */
    protected GLFWVidMode(MemorySegment address, SegmentAllocator allocator, MemoryLayout layout) {
        super(address, allocator, layout);
    }

    /**
     * Creates a {@code GLFWVidMode} instance with the given allocator.
     *
     * @param allocator the allocator
     * @return the instance
     */
    public static GLFWVidMode create(SegmentAllocator allocator) {
        return new GLFWVidMode(allocator.allocate(LAYOUT), allocator);
    }

    /**
     * Creates a {@code GLFWVidMode.Buffer} instance with the given allocator and count.
     *
     * @param allocator the allocator
     * @param count     the count
     * @return the instance
     */
    public static Buffer create(SegmentAllocator allocator, long count) {
        return new Buffer(allocator.allocateArray(LAYOUT, count), allocator, count);
    }

    /**
     * {@code const_cast<GLFWVidMode>(this)}
     *
     * @return the immutable state
     */
    public Value constCast() {
        return new Value(address(), allocator(), this);
    }

    /**
     * {@return the width, in screen coordinates, of the video mode}
     */
    public int width() {
        return (int) pWidth.get(segment());
    }

    /**
     * {@return the height, in screen coordinates, of the video mode}
     */
    public int height() {
        return (int) pHeight.get(segment());
    }

    /**
     * {@return the bit depth of the red channel of the video mode}
     */
    public int redBits() {
        return (int) pRedBits.get(segment());
    }

    /**
     * {@return the bit depth of the green channel of the video mode}
     */
    public int greenBits() {
        return (int) pGreenBits.get(segment());
    }

    /**
     * {@return the bit depth of the blue channel of the video mode}
     */
    public int blueBits() {
        return (int) pBlueBits.get(segment());
    }

    /**
     * {@return the refresh rate, in Hz, of the video mode}
     */
    public int refreshRate() {
        return (int) pRefreshRate.get(segment());
    }

    /**
     * The immutable state of {@link GLFWVidMode}.
     *
     * @author squid233
     * @since 0.1.0
     */
    public static final /* value */ class Value extends GLFWVidMode {
        private final int width;
        private final int height;
        private final int redBits;
        private final int greenBits;
        private final int blueBits;
        private final int refreshRate;

        private Value(MemorySegment address, SegmentAllocator allocator, GLFWVidMode mode) {
            super(address, allocator);
            this.width = mode.width();
            this.height = mode.height();
            this.redBits = mode.redBits();
            this.greenBits = mode.greenBits();
            this.blueBits = mode.blueBits();
            this.refreshRate = mode.refreshRate();
        }

        /**
         * {@return this}
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
    public static class Buffer extends GLFWVidMode implements ArrayPointer {
        private final VarHandle pWidth, pHeight, pRedBits, pGreenBits, pBlueBits, pRefreshRate;

        /**
         * Create a {@code GLFWvidmode.Buffer} instance.
         *
         * @param address      the address.
         * @param allocator    the allocator of this address.
         * @param elementCount the element count
         */
        public Buffer(MemorySegment address, SegmentAllocator allocator, long elementCount) {
            super(address, allocator, MemoryLayout.sequenceLayout(elementCount, LAYOUT));
            pWidth = layout().varHandle(PathElement.sequenceElement(), PathElement.groupElement("width"));
            pHeight = layout().varHandle(PathElement.sequenceElement(), PathElement.groupElement("height"));
            pRedBits = layout().varHandle(PathElement.sequenceElement(), PathElement.groupElement("redBits"));
            pGreenBits = layout().varHandle(PathElement.sequenceElement(), PathElement.groupElement("greenBits"));
            pBlueBits = layout().varHandle(PathElement.sequenceElement(), PathElement.groupElement("blueBits"));
            pRefreshRate = layout().varHandle(PathElement.sequenceElement(), PathElement.groupElement("refreshRate"));
        }

        /**
         * Gets the width at the given index.
         *
         * @param index the index
         * @return The width, in screen coordinates, of the video mode.
         */
        public int widthAt(long index) {
            return (int) pWidth.get(segment(), index);
        }

        /**
         * Gets the height at the given index.
         *
         * @param index the index
         * @return The height, in screen coordinates, of the video mode.
         */
        public int heightAt(long index) {
            return (int) pHeight.get(segment(), index);
        }

        /**
         * Gets the red bits at the given index.
         *
         * @param index the index
         * @return The bit depth of the red channel of the video mode.
         */
        public int redBitsAt(long index) {
            return (int) pRedBits.get(segment(), index);
        }

        /**
         * Gets the green bits at the given index.
         *
         * @param index the index
         * @return The bit depth of the green channel of the video mode.
         */
        public int greenBitsAt(long index) {
            return (int) pGreenBits.get(segment(), index);
        }

        /**
         * Gets the blue bits at the given index.
         *
         * @param index the index
         * @return The bit depth of the blue channel of the video mode.
         */
        public int blueBitsAt(long index) {
            return (int) pBlueBits.get(segment(), index);
        }

        /**
         * Gets the refresh rate at the given index.
         *
         * @param index the index
         * @return The refresh rate, in Hz, of the video mode.
         */
        public int refreshRateAt(long index) {
            return (int) pRefreshRate.get(segment(), index);
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
    }
}
