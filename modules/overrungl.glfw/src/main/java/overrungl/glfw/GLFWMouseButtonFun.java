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

import overrun.marshal.Upcall;

import java.lang.foreign.Arena;
import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;

/**
 * This is the function pointer type for mouse button callback functions.
 * A mouse button callback function has the following signature:
 * {@snippet :
 * void functionName(MemorySegment window, int button, int action, int mods); // @link regex="functionName" target="#invoke"
 * }
 *
 * @author squid233
 * @see GLFW#setMouseButtonCallback
 * @since 0.1.0
 */
@FunctionalInterface
public interface GLFWMouseButtonFun extends Upcall {
    /**
     * The type.
     */
    Type<GLFWMouseButtonFun> TYPE = Upcall.type("invoke", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));

    /**
     * The function pointer type for mouse button callbacks.
     *
     * @param window The window that received the event.
     * @param button The <a href="https://www.glfw.org/docs/latest/group__buttons.html">mouse button</a> that was pressed or released.
     * @param action One of {@code PRESS} or {@code RELEASE}. Future releases may add more actions.
     * @param mods   Bit field describing which <a href="https://www.glfw.org/docs/latest/group__mods.html">modifier keys</a> were held down.
     */
    void invoke(MemorySegment window, int button, int action, int mods);

    @Override
    default MemorySegment stub(Arena arena) {
        return TYPE.of(arena, this);
    }
}
