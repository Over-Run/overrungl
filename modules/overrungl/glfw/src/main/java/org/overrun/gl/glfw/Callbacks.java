/*
 * MIT License
 *
 * Copyright (c) 2022-2023 Overrun Organization
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

package org.overrun.gl.glfw;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.util.HashMap;
import java.util.Map;

/**
 * The GLFW window callbacks.
 *
 * @author squid233
 * @since 0.1.0
 */
public final class Callbacks {
    private static final Map<MemorySegment, Arena> ARENA_MAP = new HashMap<>();

    private Callbacks() {
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
        return ARENA_MAP.computeIfAbsent(window, k -> Arena.ofConfined());
    }

    /**
     * Closes the arena for the given window.
     *
     * @param window the window address.
     */
    public static void free(MemorySegment window) {
        if (ARENA_MAP.containsKey(window)) {
            ARENA_MAP.remove(window).close();
        }
    }
}
