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

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * The GLFW window callbacks.
 *
 * @author squid233
 * @since 0.1.0
 */
public final class GLFWCallbacks {
    private static final Map<MemorySegment, Arena> ARENA_MAP = new ConcurrentHashMap<>();

    private GLFWCallbacks() {
        //no instance
    }

    /**
     * Creates an arena for the given window. The callbacks are available until {@link #free(MemorySegment)}
     * has been called.
     *
     * @param window the window address.
     * @return the arena.
     */
    public static Arena create(MemorySegment window) {
        return ARENA_MAP.computeIfAbsent(window, _ -> Arena.ofConfined());
    }

    /**
     * Closes the arena for the given window.
     *
     * @param window the window address.
     */
    public static void free(MemorySegment window) {
        if (ARENA_MAP.containsKey(window)) {
            GLFW.setCharCallback(window, null);
            GLFW.setCursorEnterCallback(window, null);
            GLFW.setCursorPosCallback(window, null);
            GLFW.setDropCallback(window, null);
            GLFW.setFramebufferSizeCallback(window, null);
            GLFW.setKeyCallback(window, null);
            GLFW.setMouseButtonCallback(window, null);
            GLFW.setScrollCallback(window, null);
            GLFW.setWindowCloseCallback(window, null);
            GLFW.setWindowContentScaleCallback(window, null);
            GLFW.setWindowFocusCallback(window, null);
            GLFW.setWindowIconifyCallback(window, null);
            GLFW.setWindowMaximizeCallback(window, null);
            GLFW.setWindowPosCallback(window, null);
            GLFW.setWindowRefreshCallback(window, null);
            GLFW.setWindowSizeCallback(window, null);
            ARENA_MAP.remove(window).close();
        }
    }
}
