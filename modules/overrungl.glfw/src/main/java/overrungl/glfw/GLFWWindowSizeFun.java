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
 * This is the function pointer type for window size callbacks. A window size
 * callback function has the following signature:
 * {@snippet :
 * void callbackName(MemorySegment window, int width, int height); // @link regex="functionName" target="#invoke"
 * }
 *
 * @author squid233
 * @see GLFW#setWindowSizeCallback
 * @since 0.1.0
 */
@FunctionalInterface
public interface GLFWWindowSizeFun extends Upcall {
    /**
     * The type.
     */
    Type<GLFWWindowSizeFun> TYPE = Upcall.type();

    /**
     * The function pointer type for window size callbacks.
     *
     * @param window The window that was resized.
     * @param width  The new width, in screen coordinates, of the window.
     * @param height The new height, in screen coordinates, of the window.
     */
    @Stub
    void invoke(MemorySegment window, int width, int height);

    @Override
    default MemorySegment stub(Arena arena) {
        return TYPE.of(arena, this);
    }
}
