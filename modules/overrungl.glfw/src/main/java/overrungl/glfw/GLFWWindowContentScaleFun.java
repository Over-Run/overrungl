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
 * This is the function pointer type for window content scale callbacks.
 * A window content scale callback function has the following signature:
 * {@snippet :
 * void functionName(MemorySegment window, float xscale, float yscale); // @link regex="functionName" target="#invoke"
 * }
 *
 * @author squid233
 * @see GLFW#setWindowContentScaleCallback
 * @since 0.1.0
 */
@FunctionalInterface
public interface GLFWWindowContentScaleFun extends Upcall {
    /**
     * The type.
     */
    Type<GLFWWindowContentScaleFun> TYPE = Upcall.type();

    /**
     * The function pointer type for window content scale callbacks.
     *
     * @param window The window whose content scale changed.
     * @param xscale The new x-axis content scale of the window.
     * @param yscale The new y-axis content scale of the window.
     */
    @Stub
    void invoke(MemorySegment window, float xscale, float yscale);

    @Override
    default MemorySegment stub(Arena arena) {
        return TYPE.of(arena, this);
    }
}
