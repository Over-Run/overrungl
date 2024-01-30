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
 * This is the function pointer type for cursor position callbacks. A cursor
 * position callback function has the following signature:
 * {@snippet :
 * void functionName(MemorySegment window, double xpos, double ypos); // @link regex="functionName" target="#invoke"
 * }
 *
 * @author squid233
 * @see GLFW#setCursorPosCallback
 * @since 0.1.0
 */
@FunctionalInterface
public interface GLFWCursorPosFun extends Upcall {
    /**
     * The type.
     */
    Type<GLFWCursorPosFun> TYPE = Upcall.type();

    /**
     * The function pointer type for cursor position callbacks.
     *
     * @param window The window that received the event.
     * @param xpos   The new cursor x-coordinate, relative to the left edge of the content area.
     * @param ypos   The new cursor y-coordinate, relative to the top edge of the content area.
     */
    @Stub
    void invoke(MemorySegment window, double xpos, double ypos);

    @Override
    default MemorySegment stub(Arena arena) {
        return TYPE.of(arena, this);
    }
}
