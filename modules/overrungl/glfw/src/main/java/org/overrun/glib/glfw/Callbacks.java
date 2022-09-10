/*
 * MIT License
 *
 * Copyright (c) 2022 Overrun Organization
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
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package org.overrun.glib.glfw;

import java.lang.foreign.MemoryAddress;
import java.lang.foreign.MemorySession;
import java.lang.ref.Cleaner;
import java.util.HashMap;
import java.util.Map;

/**
 * The GLFW window callbacks.
 *
 * @author squid233
 * @since 0.1.0
 */
public class Callbacks {
    private static final Map<MemoryAddress, MemorySession> SESSION_MAP = new HashMap<>();

    /**
     * Creates a memory session for the given window.
     *
     * @param window the window address
     * @return the memory session
     */
    public static MemorySession create(MemoryAddress window) {
        return SESSION_MAP.computeIfAbsent(window, k -> MemorySession.openShared(Cleaner.create()));
    }

    /**
     * Free the memory session for the given window.
     *
     * @param window the window
     */
    public static void free(MemoryAddress window) {
        if (SESSION_MAP.containsKey(window)) {
            SESSION_MAP.remove(window).close();
        }
    }
}
