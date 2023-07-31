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

import overrungl.Struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.VarHandle;

/**
 * This describes the input state of a gamepad.
 *
 * <h2>Layout</h2>
 * <pre><code>
 * struct GLFWgamepadstate {
 *     unsigned char {@link #buttons() buttons}[15];
 *     float {@link #axes() axes}[6];
 * }</code></pre>
 *
 * @author squid233
 * @since 0.1.0
 */
public final class GLFWGamepadState extends Struct {
    /**
     * The struct member layout.
     */
    public static final SequenceLayout
        BUTTONS_LAYOUT = MemoryLayout.sequenceLayout(15, ValueLayout.JAVA_BYTE).withName("buttons"),
        AXES_LAYOUT = MemoryLayout.sequenceLayout(6, ValueLayout.JAVA_FLOAT).withName("axes");
    /**
     * The struct layout.
     */
    public static final StructLayout LAYOUT = MemoryLayout.structLayout(
        BUTTONS_LAYOUT,
        MemoryLayout.paddingLayout(8), // padding needed. will FFM API adds padding automatically in the future?
        AXES_LAYOUT
    );
    private static final VarHandle
        pButtons = LAYOUT.varHandle(PathElement.groupElement("buttons"), PathElement.sequenceElement()),
        pAxes = LAYOUT.varHandle(PathElement.groupElement("axes"), PathElement.sequenceElement());

    /**
     * Create a {@code GLFWgamepadstate} instance.
     *
     * @param address the address.
     */
    public GLFWGamepadState(MemorySegment address) {
        super(address, LAYOUT);
    }

    /**
     * {@return the elements size of this struct in bytes}
     */
    public static long sizeof() {
        return LAYOUT.byteSize();
    }

    /**
     * Creates a {@code GLFWgamepadstate} instance with the given allocator.
     *
     * @param allocator the allocator
     * @return the instance
     */
    public static GLFWGamepadState create(SegmentAllocator allocator) {
        return new GLFWGamepadState(allocator.allocate(LAYOUT));
    }

    /**
     * Gets the button state array.
     *
     * @return The states of each <a href="https://www.glfw.org/docs/latest/group__gamepad__buttons.html">gamepad button</a>,
     * {@code PRESS} or {@code RELEASE}.
     */
    public byte[] buttons() {
        byte[] arr = new byte[15];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (byte) pButtons.get(segment(), (long) i);
        }
        return arr;
    }

    /**
     * Gets the button state at the given index.
     *
     * @param index the index
     * @return the state, {@code PRESS} or {@code RELEASE}
     */
    public boolean button(int index) {
        return (byte) pButtons.get(segment(), (long) index) == GLFW.PRESS;
    }

    /**
     * Gets the axe state array.
     *
     * @return The states of each <a href="https://www.glfw.org/docs/latest/group__gamepad__axes.html">gamepad axis</a>,
     * in the range -1.0 to 1.0 inclusive.
     */
    public float[] axes() {
        float[] arr = new float[6];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float) pAxes.get(segment(), (long) i);
        }
        return arr;
    }

    /**
     * Gets the axe state at the given index.
     *
     * @param index the index
     * @return the state, in the range -1.0 to 1.0 inclusive
     */
    public float axe(int index) {
        return (float) pAxes.get(segment(), (long) index);
    }
}
