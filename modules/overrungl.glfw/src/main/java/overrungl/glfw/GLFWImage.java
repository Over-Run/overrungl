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

import overrungl.ArrayPointer;
import overrungl.Struct;
import overrungl.internal.RuntimeHelper;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.VarHandle;

import static java.lang.foreign.ValueLayout.*;

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
public sealed class GLFWImage extends Struct {
    /**
     * The struct layout.
     */
    public static final StructLayout LAYOUT = MemoryLayout.structLayout(
        JAVA_INT.withName("width"),
        JAVA_INT.withName("height"),
        ADDRESS.withTargetLayout(RuntimeHelper.ADDRESS_UNBOUNDED).withName("pixels")
    );
    private static final VarHandle
        pWidth = LAYOUT.varHandle(PathElement.groupElement("width")),
        pHeight = LAYOUT.varHandle(PathElement.groupElement("height")),
        pPixels = LAYOUT.varHandle(PathElement.groupElement("pixels"));

    /**
     * Create a {@code GLFWImage} instance.
     *
     * @param address the address.
     */
    public GLFWImage(MemorySegment address) {
        super(address, LAYOUT);
    }

    /**
     * Creates a struct instance with the given memory layout.
     *
     * @param address the address.
     * @param layout  the memory layout of this struct.
     */
    protected GLFWImage(MemorySegment address, MemoryLayout layout) {
        super(address, layout);
    }

    /**
     * {@return the elements size of this struct in bytes}
     */
    public static long sizeof() {
        return LAYOUT.byteSize();
    }

    /**
     * Creates a {@code GLFWImage} instance with the given allocator.
     *
     * @param allocator the allocator
     * @return the instance
     */
    public static GLFWImage create(SegmentAllocator allocator) {
        return new GLFWImage(allocator.allocate(LAYOUT));
    }

    /**
     * Creates a {@code GLFWImage.Buffer} instance with the given allocator and count.
     *
     * @param allocator the allocator
     * @param count     the count
     * @return the instance
     */
    public static Buffer create(SegmentAllocator allocator, long count) {
        return new Buffer(allocator.allocate(LAYOUT, count), count);
    }

    /**
     * Sets the image width.
     *
     * @param width The width, in pixels, of this image.
     * @return this
     */
    public GLFWImage width(int width) {
        pWidth.set(segment(), width);
        return this;
    }

    /**
     * Sets the image height.
     *
     * @param height The height, in pixels, of this image.
     * @return this
     */
    public GLFWImage height(int height) {
        pHeight.set(segment(), height);
        return this;
    }

    /**
     * Sets the image pixels address.
     *
     * @param pixels The pixel data address of this image, arranged left-to-right, top-to-bottom.
     * @return this
     */
    public GLFWImage pixels(MemorySegment pixels) {
        pPixels.set(segment(), pixels);
        return this;
    }

    /**
     * Gets the image width.
     *
     * @return The width, in pixels, of this image.
     */
    public int width() {
        return (int) pWidth.get(segment());
    }

    /**
     * Gets the image height.
     *
     * @return The height, in pixels, of this image.
     */
    public int height() {
        return (int) pHeight.get(segment());
    }

    /**
     * Gets the image pixels address.
     *
     * @return The pixel data address of this image, arranged left-to-right, top-to-bottom.
     */
    public MemorySegment pixels() {
        return (MemorySegment) pPixels.get(segment());
    }

    /**
     * This describes 2D images.
     *
     * @author squid233
     * @since 0.1.0
     */
    public static final class Buffer extends GLFWImage implements ArrayPointer {
        private final VarHandle pWidth, pHeight, pPixels;

        /**
         * Create a {@code GLFWImage.Buffer} instance.
         *
         * @param address      the address.
         * @param elementCount the element count
         */
        public Buffer(MemorySegment address, long elementCount) {
            super(address, MemoryLayout.sequenceLayout(elementCount, LAYOUT));
            pWidth = layout().varHandle(PathElement.sequenceElement(), PathElement.groupElement("width"));
            pHeight = layout().varHandle(PathElement.sequenceElement(), PathElement.groupElement("height"));
            pPixels = layout().varHandle(PathElement.sequenceElement(), PathElement.groupElement("pixels"));
        }

        /**
         * Sets the image width at the given index.
         *
         * @param index the index
         * @param width The width, in pixels, of this image.
         * @return this
         */
        public Buffer width(long index, int width) {
            pWidth.set(segment(), index, width);
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
            pHeight.set(segment(), index, height);
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
            pPixels.set(segment(), index, pixels);
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
            return (int) pWidth.get(segment(), index);
        }

        /**
         * Gets the image height at the given index.
         *
         * @param index the index
         * @return The height, in pixels, of this image.
         */
        public int heightAt(long index) {
            return (int) pHeight.get(segment(), index);
        }

        /**
         * Gets the image pixels address at the given index.
         *
         * @param index the index
         * @return The pixel data address of this image, arranged left-to-right, top-to-bottom.
         */
        public MemorySegment pixelsAt(long index) {
            return (MemorySegment) pPixels.get(segment(), index);
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
    }
}
