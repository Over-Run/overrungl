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
import java.lang.foreign.MemorySegment;

/**
 * This is the function pointer type for window focus callbacks.  A window
 * focus callback function has the following signature:
 * {@snippet :
 * void functionName(MemorySegment window, boolean focused); // @link regex="functionName" target="#invoke"
 * }
 *
 * @author squid233
 * @see GLFW#setWindowFocusCallback
 * @since 0.1.0
 */
@FunctionalInterface
public interface GLFWWindowFocusFun extends Upcall {
    /**
     * The type.
     */
    Type<GLFWWindowFocusFun> TYPE = Upcall.type();

    /**
     * The function pointer type for window focus callbacks.
     *
     * @param window  The window that gained or lost input focus.
     * @param focused {@code true} if the window was given input focus, or
     *                {@code false} if it lost it.
     */
    void invoke(MemorySegment window, boolean focused);

    /**
     * The function pointer type for window focus callbacks.
     *
     * @param window  The window that gained or lost input focus.
     * @param focused {@code true} if the window was given input focus, or
     *                {@code false} if it lost it.
     */
    @Stub
    default void ninvoke(MemorySegment window, int focused) {
        invoke(window, focused != GLFW.FALSE);
    }

    @Override
    default MemorySegment stub(Arena arena) {
        return TYPE.of(arena, this);
    }
}
