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

import overrun.marshal.Unmarshal;
import overrun.marshal.Upcall;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;

/**
 * This is the function pointer type for path drop callbacks. A path drop
 * callback function has the following signature:
 * {@snippet lang = java:
 * void functionName(MemorySegment window, String[] paths); // @link regex="functionName" target="#invoke"
 * }
 * <h2>Pointer lifetime</h2>
 * The path array and its strings are valid until the callback function returns.
 *
 * @author squid233
 * @see GLFW#setDropCallback
 * @since 0.1.0
 */
@FunctionalInterface
public interface GLFWDropFun extends Upcall {
    /**
     * The type.
     */
    Type<GLFWDropFun> TYPE = Upcall.type();

    /**
     * The function pointer type for path drop callbacks.
     *
     * @param window The window that received the event.
     * @param paths  The UTF-8 encoded file and/or directory path names.
     */
    void invoke(MemorySegment window, String[] paths);

    /**
     * The function pointer type for path drop callbacks.
     *
     * @param window    The window that received the event.
     * @param pathCount The number of dropped paths.
     * @param paths     The UTF-8 encoded file and/or directory path names.
     */
    @Stub
    default void ninvoke(MemorySegment window, int pathCount, MemorySegment paths) {
        invoke(window, Unmarshal.unmarshalAsStringArray(paths.reinterpret(ValueLayout.ADDRESS.scale(0L, pathCount))));
    }

    @Override
    default MemorySegment stub(Arena arena) {
        return TYPE.of(arena, this);
    }
}
