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

import overrun.marshal.Marshal;
import overrun.marshal.Unmarshal;
import overrun.marshal.struct.Struct;
import overrun.marshal.struct.StructHandle;

import java.lang.foreign.*;

import static java.lang.foreign.ValueLayout.*;

/**
 * This describes the gamma ramp for a monitor.
 * <h2>Layout</h2>
 * <pre><code>
 * struct GLFWgammaramp {
 *     unsigned short* {@link #red};
 *     unsigned short* {@link #green};
 *     unsigned short* {@link #blue};
 *     unsigned int {@link #size};
 * }</code></pre>
 *
 * @author squid233
 * @see GLFW#getGammaRamp
 * @see GLFW#setGammaRamp
 * @since 0.1.0
 */
public final class GLFWGammaRamp extends Struct {
    private static final AddressLayout SHORT_ARRAY = ADDRESS.withTargetLayout(MemoryLayout.sequenceLayout(0L, JAVA_SHORT));
    /**
     * The struct layout.
     */
    public static final StructLayout LAYOUT = MemoryLayout.structLayout(
        SHORT_ARRAY.withName("red"),
        SHORT_ARRAY.withName("green"),
        SHORT_ARRAY.withName("blue"),
        JAVA_INT.withName("size")
    );
    /**
     * An array of value describing the response of the red channel.
     */
    public static final StructHandle.Array<short[]> red = StructHandle.ofArray(LAYOUT, "red", Marshal::marshal, Unmarshal::unmarshalAsShortArray);
    /**
     * An array of value describing the response of the green channel.
     */
    public static final StructHandle.Array<short[]> green = StructHandle.ofArray(LAYOUT, "green", Marshal::marshal, Unmarshal::unmarshalAsShortArray);
    /**
     * An array of value describing the response of the blue channel.
     */
    public static final StructHandle.Array<short[]> blue = StructHandle.ofArray(LAYOUT, "blue", Marshal::marshal, Unmarshal::unmarshalAsShortArray);
    /**
     * The number of elements in each array.
     */
    public static final StructHandle.Int size = StructHandle.ofInt(LAYOUT, "size");

    /**
     * Creates a struct with the given layout.
     *
     * @param segment      the segment
     * @param elementCount the element count
     */
    public GLFWGammaRamp(MemorySegment segment, long elementCount) {
        super(segment, elementCount, LAYOUT);
    }

    /**
     * Allocates a struct with the given layout.
     *
     * @param allocator    the allocator
     * @param elementCount the element count
     */
    public GLFWGammaRamp(SegmentAllocator allocator, long elementCount) {
        super(allocator, elementCount, LAYOUT);
    }

    /**
     * Creates a struct with the given layout.
     *
     * @param segment the segment
     */
    public GLFWGammaRamp(MemorySegment segment) {
        super(segment, LAYOUT);
    }

    /**
     * Allocates a struct with the given layout.
     *
     * @param allocator the allocator
     */
    public GLFWGammaRamp(SegmentAllocator allocator) {
        super(allocator, LAYOUT);
    }
}
