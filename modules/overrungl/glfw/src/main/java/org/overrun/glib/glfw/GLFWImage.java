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
public class GLFWImage extends Struct {
    /**
     * The struct layout.
     */
    public static final StructLayout LAYOUT = MemoryLayout.structLayout(
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
     * @param address the address.
     * @param arena   the arena of this address.
     */
    public GLFWImage(MemorySegment address, Arena arena) {
        super(address, arena);
    }

    /**
     * Creates a {@code GLFWimage} instance with the given arena.
     *
     * @param arena the arena
     * @return the instance
     */
    public static GLFWImage create(Arena arena) {
        return new GLFWImage(arena.allocate(LAYOUT), arena);
    }

    /**
     * Creates a {@code GLFWimage} instance with the given arena and count.
     *
     * @param arena the arena
     * @param count the count
     * @return the instance
     */
    public static Buffer create(Arena arena, long count) {
        return new Buffer(arena.allocateArray(LAYOUT, count), arena, count);
    }

    /**
     * Sets the image width.
     *
     * @param width The width, in pixels, of this image.
     * @return this
     */
    public GLFWImage width(int width) {
        pWidth.set(managedSegment, width);
        return this;
    }

    /**
     * Sets the image height.
     *
     * @param height The height, in pixels, of this image.
     * @return this
     */
    public GLFWImage height(int height) {
        pHeight.set(managedSegment, height);
        return this;
    }

    /**
     * Sets the image pixels address.
     *
     * @param pixels The pixel data address of this image, arranged left-to-right, top-to-bottom.
     * @return this
     */
    public GLFWImage pixels(MemorySegment pixels) {
        pPixels.set(managedSegment, pixels);
        return this;
    }

    /**
     * Gets the image width.
     *
     * @return The width, in pixels, of this image.
     */
    public int width() {
        return (int) pWidth.get(managedSegment);
    }

    /**
     * Gets the image height.
     *
     * @return The height, in pixels, of this image.
     */
    public int height() {
        return (int) pHeight.get(managedSegment);
    }

    /**
     * Gets the image pixels address.
     *
     * @return The pixel data address of this image, arranged left-to-right, top-to-bottom.
     */
    public MemorySegment pixels() {
        return (MemorySegment) pPixels.get(managedSegment);
    }

    @Override
    public MemoryLayout layout() {
        return LAYOUT;
    }

    /**
     * This describes 2D images.
     *
     * @author squid233
     * @since 0.1.0
     */
    public static class Buffer extends GLFWImage {
        private final long elementCount;
        private final VarHandle pWidth, pHeight, pPixels;
        private final SequenceLayout layout;

        /**
         * Create a {@code GLFWimage.Buffer} instance.
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
            pPixels = layout.varHandle(PathElement.sequenceElement(), PathElement.groupElement("pixels"));
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
         * Sets the image width at the given index.
         *
         * @param index the index
         * @param width The width, in pixels, of this image.
         * @return this
         */
        public Buffer width(long index, int width) {
            pWidth.set(managedSegment, index, width);
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
            pHeight.set(managedSegment, index, height);
            return this;
        }

        /**
         * Sets the image pixels address at the given index.
         *
         * @param index  the index
         * @param pixels The pixel data address of this image, arranged left-to-right, top-to-bottom.
         * @return this
         */
        public Buffer pixels(long index, MemorySegment pixels) {
            pPixels.set(managedSegment, index, pixels);
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
        public Buffer pixels(MemorySegment pixels) {
            return pixels(0, pixels);
        }

        /**
         * Gets the image width at the given index.
         *
         * @param index the index
         * @return The width, in pixels, of this image.
         */
        public int widthAt(long index) {
            return (int) pWidth.get(managedSegment, index);
        }

        /**
         * Gets the image height at the given index.
         *
         * @param index the index
         * @return The height, in pixels, of this image.
         */
        public int heightAt(long index) {
            return (int) pHeight.get(managedSegment, index);
        }

        /**
         * Gets the image pixels address at the given index.
         *
         * @param index the index
         * @return The pixel data address of this image, arranged left-to-right, top-to-bottom.
         */
        public MemorySegment pixelsAt(long index) {
            return (MemorySegment) pPixels.get(managedSegment, index);
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
        public MemorySegment pixels() {
            return pixelsAt(0);
        }

        @Override
        public SequenceLayout layout() {
            return layout;
        }
    }
}
