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
 * This is the function pointer type for window maximize callbacks. A window
 * maximize callback function has the following signature:
 * {@snippet :
 * void functionName(MemorySegment window, boolean maximized); // @link regex="functionName" target="#invoke"
 * }
 *
 * @author squid233
 * @see GLFW#setWindowMaximizeCallback
 * @since 0.1.0
 */
@FunctionalInterface
public interface GLFWWindowMaximizeFun extends Upcall {
    /**
     * The type.
     */
    Type<GLFWWindowMaximizeFun> TYPE = Upcall.type();

    /**
     * The function pointer type for window maximize callbacks.
     *
     * @param window    The window that was maximized or restored.
     * @param maximized {@code true} if the window was maximized, or
     *                  {@code false} if it was restored.
     */
    void invoke(MemorySegment window, boolean maximized);

    /**
     * The function pointer type for window maximize callbacks.
     *
     * @param window    The window that was maximized or restored.
     * @param maximized {@code true} if the window was maximized, or
     *                  {@code false} if it was restored.
     */
    @Stub
    default void ninvoke(MemorySegment window, int maximized) {
        invoke(window, maximized != GLFW.FALSE);
    }

    @Override
    default MemorySegment stub(Arena arena) {
        return TYPE.of(arena, this);
    }
}
