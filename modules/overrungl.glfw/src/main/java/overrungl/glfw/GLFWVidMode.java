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
public sealed class GLFWVidMode extends Struct {
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
     * @param address the address.
     */
    public GLFWVidMode(MemorySegment address) {
        super(address, LAYOUT);
    }

    /**
     * Creates a struct instance with the given memory layout.
     *
     * @param address the address.
     * @param layout  the memory layout of this struct.
     */
    protected GLFWVidMode(MemorySegment address, MemoryLayout layout) {
        super(address, layout);
    }

    /**
     * {@return the elements size of this struct in bytes}
     */
    public static long sizeof() {
        return LAYOUT.byteSize();
    }

    /**
     * Creates a {@code GLFWVidMode} instance with the given allocator.
     *
     * @param allocator the allocator
     * @return the instance
     */
    public static GLFWVidMode create(SegmentAllocator allocator) {
        return new GLFWVidMode(allocator.allocate(LAYOUT));
    }

    /**
     * Creates a {@code GLFWVidMode.Buffer} instance with the given allocator and count.
     *
     * @param allocator the allocator
     * @param count     the count
     * @return the instance
     */
    public static Buffer create(SegmentAllocator allocator, long count) {
        return new Buffer(allocator.allocate(LAYOUT, count), count);
    }

    /**
     * {@return an immutable state of this struct}
     */
    public Value value() {
        return new Value(width(), height(), redBits(), greenBits(), blueBits(), refreshRate());
    }

    /**
     * {@return the width, in screen coordinates, of the video mode}
     */
    public int width() {
        return (int) pWidth.get(segment(), 0L);
    }

    /**
     * {@return the height, in screen coordinates, of the video mode}
     */
    public int height() {
        return (int) pHeight.get(segment(), 0L);
    }

    /**
     * {@return the bit depth of the red channel of the video mode}
     */
    public int redBits() {
        return (int) pRedBits.get(segment(), 0L);
    }

    /**
     * {@return the bit depth of the green channel of the video mode}
     */
    public int greenBits() {
        return (int) pGreenBits.get(segment(), 0L);
    }

    /**
     * {@return the bit depth of the blue channel of the video mode}
     */
    public int blueBits() {
        return (int) pBlueBits.get(segment(), 0L);
    }

    /**
     * {@return the refresh rate, in Hz, of the video mode}
     */
    public int refreshRate() {
        return (int) pRefreshRate.get(segment(), 0L);
    }

    /**
     * The immutable state of {@link GLFWVidMode}.
     *
     * @param width       the width, in screen coordinates, of the video mode
     * @param height      the height, in screen coordinates, of the video mode
     * @param redBits     the bit depth of the red channel, of the video mode
     * @param greenBits   the bit depth of the green channel, of the video mode
     * @param blueBits    the bit depth of the blue channel, of the video mode
     * @param refreshRate the refresh rate, in Hz, of the video mode
     * @author squid233
     * @since 0.1.0
     */
    public /* value */ record Value(
        int width,
        int height,
        int redBits,
        int greenBits,
        int blueBits,
        int refreshRate
    ) {
    }

    /**
     * This describes video modes.
     *
     * @author squid233
     * @since 0.1.0
     */
    public static final class Buffer extends GLFWVidMode implements ArrayPointer {
        private final VarHandle pWidth, pHeight, pRedBits, pGreenBits, pBlueBits, pRefreshRate;

        /**
         * Create a {@code GLFWvidmode.Buffer} instance.
         *
         * @param address      the address.
         * @param elementCount the element count
         */
        public Buffer(MemorySegment address, long elementCount) {
            super(address, MemoryLayout.sequenceLayout(elementCount, LAYOUT));
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
         * @return The bit depth of the red channel, of the video mode.
         */
        public int redBitsAt(long index) {
            return (int) pRedBits.get(segment(), index);
        }

        /**
         * Gets the green bits at the given index.
         *
         * @param index the index
         * @return The bit depth of the green channel, of the video mode.
         */
        public int greenBitsAt(long index) {
            return (int) pGreenBits.get(segment(), index);
        }

        /**
         * Gets the blue bits at the given index.
         *
         * @param index the index
         * @return The bit depth of the blue channel, of the video mode.
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
