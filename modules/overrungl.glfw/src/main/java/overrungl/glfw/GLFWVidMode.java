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

import overrun.marshal.struct.Struct;
import overrun.marshal.struct.StructHandle;

import java.lang.foreign.*;

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
public final class GLFWVidMode extends Struct {
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
    /**
     * the width, in screen coordinates, of the video mode
     */
    public final StructHandle.Int width = StructHandle.ofInt(this, "width");
    /**
     * the height, in screen coordinates, of the video mode
     */
    public final StructHandle.Int height = StructHandle.ofInt(this, "height");
    /**
     * the bit depth of the red channel of the video mode
     */
    public final StructHandle.Int redBits = StructHandle.ofInt(this, "redBits");
    /**
     * the bit depth of the green channel of the video mode
     */
    public final StructHandle.Int greenBits = StructHandle.ofInt(this, "greenBits");
    /**
     * the bit depth of the blue channel of the video mode
     */
    public final StructHandle.Int blueBits = StructHandle.ofInt(this, "blueBits");
    /**
     * the refresh rate, in Hz, of the video mode
     */
    public final StructHandle.Int refreshRate = StructHandle.ofInt(this, "refreshRate");

    /**
     * Creates a struct with the given layout.
     *
     * @param segment      the segment
     * @param elementCount the element count
     */
    public GLFWVidMode(MemorySegment segment, long elementCount) {
        super(segment, elementCount, LAYOUT);
    }

    /**
     * Allocates a struct with the given layout.
     *
     * @param allocator    the allocator
     * @param elementCount the element count
     */
    public GLFWVidMode(SegmentAllocator allocator, long elementCount) {
        super(allocator, elementCount, LAYOUT);
    }

    /**
     * Creates a struct with the given layout.
     *
     * @param segment the segment
     */
    public GLFWVidMode(MemorySegment segment) {
        super(segment, LAYOUT);
    }

    /**
     * Allocates a struct with the given layout.
     *
     * @param allocator the allocator
     */
    public GLFWVidMode(SegmentAllocator allocator) {
        super(allocator, LAYOUT);
    }

    /**
     * {@return an immutable state of this struct}
     */
    public Value value() {
        return new Value(width.get(), height.get(), redBits.get(), greenBits.get(), blueBits.get(), refreshRate.get());
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
}
