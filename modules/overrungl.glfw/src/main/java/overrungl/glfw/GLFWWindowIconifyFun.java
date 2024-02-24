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
 * This is the function pointer type for window iconify callbacks. A window
 * iconify callback function has the following signature:
 * {@snippet :
 * void functionName(MemorySegment window, boolean iconified); // @link regex="functionName" target="#invoke"
 * }
 *
 * @author squid233
 * @see GLFW#setWindowIconifyCallback
 * @since 0.1.0
 */
@FunctionalInterface
public interface GLFWWindowIconifyFun extends Upcall {
    /**
     * The type.
     */
    Type<GLFWWindowIconifyFun> TYPE = Upcall.type("ninvoke", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT));

    /**
     * The function pointer type for window iconify callbacks.
     *
     * @param window    The window that was iconified or restored.
     * @param iconified {@code true} if the window was iconified, or
     *                  {@code false} if it was restored.
     */
    void invoke(MemorySegment window, boolean iconified);

    /**
     * The function pointer type for window iconify callbacks.
     *
     * @param window    The window that was iconified or restored.
     * @param iconified {@code true} if the window was iconified, or
     *                  {@code false} if it was restored.
     */
    default void ninvoke(MemorySegment window, int iconified) {
        invoke(window, iconified != GLFW.FALSE);
    }

    @Override
    default MemorySegment stub(Arena arena) {
        return TYPE.of(arena, this);
    }
}
