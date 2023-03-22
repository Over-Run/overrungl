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

package org.overrun.glib.glfw;

import org.overrun.glib.Struct;

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
     * @param address the address.
     * @param arena   the arena of this address.
     */
    public GLFWVidMode(MemorySegment address, Arena arena) {
        super(address, arena);
    }

    /**
     * Creates a {@code GLFWvidmode} instance with the given arena.
     *
     * @param arena the arena
     * @return the instance
     */
    public static GLFWVidMode create(Arena arena) {
        return new GLFWVidMode(arena.allocate(LAYOUT), arena);
    }

    /**
     * Creates a {@code GLFWvidmode} instance with the given arena and count.
     *
     * @param arena the arena
     * @param count the count
     * @return the instance
     */
    public static Buffer create(Arena arena, long count) {
        return new Buffer(arena.allocateArray(LAYOUT, count), arena, count);
    }

    /**
     * {@code const_cast<GLFWVidMode>(this)}
     *
     * @return the immutable state
     */
    public Value constCast() {
        return new Value(address(), arena(), this);
    }

    /**
     * Gets the width.
     *
     * @return The width, in screen coordinates, of the video mode.
     */
    public int width() {
        return (int) pWidth.get(managedSegment);
    }

    /**
     * Gets the height.
     *
     * @return The height, in screen coordinates, of the video mode.
     */
    public int height() {
        return (int) pHeight.get(managedSegment);
    }

    /**
     * Gets the red bits.
     *
     * @return The bit depth of the red channel of the video mode.
     */
    public int redBits() {
        return (int) pRedBits.get(managedSegment);
    }

    /**
     * Gets the green bits.
     *
     * @return The bit depth of the green channel of the video mode.
     */
    public int greenBits() {
        return (int) pGreenBits.get(managedSegment);
    }

    /**
     * Gets the blue bits.
     *
     * @return The bit depth of the blue channel of the video mode.
     */
    public int blueBits() {
        return (int) pBlueBits.get(managedSegment);
    }

    /**
     * Gets the refresh rate.
     *
     * @return The refresh rate, in Hz, of the video mode.
     */
    public int refreshRate() {
        return (int) pRefreshRate.get(managedSegment);
    }

    @Override
    public MemoryLayout layout() {
        return LAYOUT;
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

        private Value(MemorySegment address, Arena arena, GLFWVidMode mode) {
            super(address, arena);
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
        private final SequenceLayout layout;

        /**
         * Create a {@code GLFWvidmode.Buffer} instance.
         *
         * @param address      the address.
         * @param arena        the arena of this address.
         * @param elementCount the element count
         */
        public Buffer(MemorySegment address, Arena arena, long elementCount) {
            super(address, arena);
            this.elementCount = elementCount;
            this.layout = MemoryLayout.sequenceLayout(elementCount, LAYOUT);
            pWidth = layout.varHandle(PathElement.sequenceElement(), PathElement.groupElement("width"));
            pHeight = layout.varHandle(PathElement.sequenceElement(), PathElement.groupElement("height"));
            pRedBits = layout.varHandle(PathElement.sequenceElement(), PathElement.groupElement("redBits"));
            pGreenBits = layout.varHandle(PathElement.sequenceElement(), PathElement.groupElement("greenBits"));
            pBlueBits = layout.varHandle(PathElement.sequenceElement(), PathElement.groupElement("blueBits"));
            pRefreshRate = layout.varHandle(PathElement.sequenceElement(), PathElement.groupElement("refreshRate"));
            managedSegment = segment(layout, arena);
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
         * Gets the width at the given index.
         *
         * @param index the index
         * @return The width, in screen coordinates, of the video mode.
         */
        public int widthAt(long index) {
            return (int) pWidth.get(managedSegment, index);
        }

        /**
         * Gets the height at the given index.
         *
         * @param index the index
         * @return The height, in screen coordinates, of the video mode.
         */
        public int heightAt(long index) {
            return (int) pHeight.get(managedSegment, index);
        }

        /**
         * Gets the red bits at the given index.
         *
         * @param index the index
         * @return The bit depth of the red channel of the video mode.
         */
        public int redBitsAt(long index) {
            return (int) pRedBits.get(managedSegment, index);
        }

        /**
         * Gets the green bits at the given index.
         *
         * @param index the index
         * @return The bit depth of the green channel of the video mode.
         */
        public int greenBitsAt(long index) {
            return (int) pGreenBits.get(managedSegment, index);
        }

        /**
         * Gets the blue bits at the given index.
         *
         * @param index the index
         * @return The bit depth of the blue channel of the video mode.
         */
        public int blueBitsAt(long index) {
            return (int) pBlueBits.get(managedSegment, index);
        }

        /**
         * Gets the refresh rate at the given index.
         *
         * @param index the index
         * @return The refresh rate, in Hz, of the video mode.
         */
        public int refreshRateAt(long index) {
            return (int) pRefreshRate.get(managedSegment, index);
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

        @Override
        public SequenceLayout layout() {
            return layout;
        }
    }
}
