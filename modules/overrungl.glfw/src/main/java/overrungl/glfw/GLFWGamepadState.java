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
import overrun.marshal.struct.Struct;
import overrun.marshal.struct.StructAllocator;

import java.lang.foreign.*;
import java.lang.invoke.MethodHandles;

/**
 * This describes the input state of a gamepad.
 * <h2>Layout</h2>
 * <pre><code>
 * struct GLFWgamepadstate {
 *     unsigned char {@link #buttons}[15];
 *     float {@link #axes}[6];
 * }</code></pre>
 *
 * @author squid233
 * @since 0.1.0
 */
public interface GLFWGamepadState extends Struct<GLFWGamepadState> {
    /**
     * The allocator
     */
    StructAllocator<GLFWGamepadState> OF = new StructAllocator<>(
        MethodHandles.lookup(),
        LayoutBuilder.struct()
            .cArray("buttons", 15, ValueLayout.JAVA_BYTE)
            .cArray("axes", 6, ValueLayout.JAVA_FLOAT)
            .build()
    );

    /**
     * The states of each <a href="https://www.glfw.org/docs/latest/group__gamepad__buttons.html">gamepad button</a>,
     * {@link GLFW#PRESS} or {@link GLFW#RELEASE}.
     *
     * @param index the index
     * @return the state
     */
    byte buttons(long index);

    /**
     * The states of each <a href="https://www.glfw.org/docs/latest/group__gamepad__axes.html">gamepad axis</a>,
     * in the range -1.0 to 1.0 inclusive.
     *
     * @param index the index
     * @return the state
     */
    float axes(long index);

    /**
     * Gets the button state at the given index.
     *
     * @param index the index
     * @return the state, {@code PRESS} or {@code RELEASE}
     */
    default boolean button(int index) {
        return buttons(index) == GLFW.PRESS;
    }

    /**
     * Gets the axe state at the given index.
     *
     * @param index the index
     * @return the state, in the range -1.0 to 1.0 inclusive
     */
    default float axe(int index) {
        return axes(index);
    }
}
