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
 * This is the function pointer type for cursor enter/leave callbacks.
 * A cursor enter/leave callback function has the following signature:
 * {@snippet :
 * void functionName(MemorySegment window, boolean entered); // @link regex="functionName" target="#invoke"
 * }
 *
 * @author squid233
 * @see GLFW#setCursorEnterCallback
 * @since 0.1.0
 */
@FunctionalInterface
public interface GLFWCursorEnterFun extends Upcall {
    /**
     * The type.
     */
    Type<GLFWCursorEnterFun> TYPE = Upcall.type("ninvoke", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT));

    /**
     * The function pointer type for cursor enter/leave callbacks.
     *
     * @param window  The window that received the event.
     * @param entered {@code true} if the cursor entered the window's content
     *                area, or {@code false} if it left it.
     */
    void invoke(MemorySegment window, boolean entered);

    /**
     * The function pointer type for cursor enter/leave callbacks.
     *
     * @param window  The window that received the event.
     * @param entered {@code true} if the cursor entered the window's content
     *                area, or {@code false} if it left it.
     */
    default void ninvoke(MemorySegment window, int entered) {
        invoke(window, entered != GLFW.FALSE);
    }

    @Override
    default MemorySegment stub(Arena arena) {
        return TYPE.of(arena, this);
    }
}
