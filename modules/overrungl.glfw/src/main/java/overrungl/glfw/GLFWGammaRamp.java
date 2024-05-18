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

import overrun.marshal.LayoutBuilder;
import overrun.marshal.Marshal;
import overrun.marshal.Unmarshal;
import overrun.marshal.struct.Struct;
import overrun.marshal.struct.StructAllocator;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.ValueLayout;
import java.lang.invoke.MethodHandles;

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
public interface GLFWGammaRamp extends Struct<GLFWGammaRamp> {
    /**
     * The allocator
     */
    StructAllocator<GLFWGammaRamp> OF = new StructAllocator<>(
        MethodHandles.lookup(),
        LayoutBuilder.struct()
            .cAddress("red")
            .cAddress("green")
            .cAddress("blue")
            .cInt("size")
            .build()
    );

    /**
     * {@return an array of value describing the response of the red channel}
     */
    MemorySegment red();

    /**
     * Sets {@link #red()}.
     *
     * @param val the value
     * @return this
     */
    GLFWGammaRamp red(MemorySegment val);

    /**
     * {@return an array of value describing the response of the green channel}
     */
    MemorySegment green();

    /**
     * Sets {@link #green()}.
     *
     * @param val the value
     * @return this
     */
    GLFWGammaRamp green(MemorySegment val);

    /**
     * {@return an array of value describing the response of the blue channel}
     */
    MemorySegment blue();

    /**
     * Sets {@link #blue()}.
     *
     * @param val the value
     * @return this
     */
    GLFWGammaRamp blue(MemorySegment val);

    /**
     * {@return the number of elements in each array}
     */
    int size();

    /**
     * Sets {@link #size()}.
     *
     * @param val the value
     * @return this
     */
    GLFWGammaRamp size(int val);

    /**
     * {@return {@link #red()}}
     *
     * @param size the size
     */
    default short[] javaRed(int size) {
        return Unmarshal.unmarshalAsShortArray(red().reinterpret(ValueLayout.JAVA_SHORT.scale(0L, size)));
    }

    /**
     * Sets {@link #red()}.
     *
     * @param allocator the allocator
     * @param val       the value
     * @return this
     */
    default GLFWGammaRamp javaRed(SegmentAllocator allocator, short[] val) {
        return red(Marshal.marshal(allocator, val));
    }

    /**
     * {@return {@link #green()}}
     *
     * @param size the size
     */
    default short[] javaGreen(int size) {
        return Unmarshal.unmarshalAsShortArray(green().reinterpret(ValueLayout.JAVA_SHORT.scale(0L, size)));
    }

    /**
     * Sets {@link #green()}.
     *
     * @param allocator the allocator
     * @param val       the value
     * @return this
     */
    default GLFWGammaRamp javaGreen(SegmentAllocator allocator, short[] val) {
        return green(Marshal.marshal(allocator, val));
    }

    /**
     * {@return {@link #blue()}}
     *
     * @param size the size
     */
    default short[] javaBlue(int size) {
        return Unmarshal.unmarshalAsShortArray(blue().reinterpret(ValueLayout.JAVA_SHORT.scale(0L, size)));
    }

    /**
     * Sets {@link #blue()}.
     *
     * @param allocator the allocator
     * @param val       the value
     * @return this
     */
    default GLFWGammaRamp javaBlue(SegmentAllocator allocator, short[] val) {
        return blue(Marshal.marshal(allocator, val));
    }
}
