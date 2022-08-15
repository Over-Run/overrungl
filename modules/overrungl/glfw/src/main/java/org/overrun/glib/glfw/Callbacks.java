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
    public static void glfwFreeCallbacks(MemoryAddress window) {
        if (SESSION_MAP.containsKey(window)) {
            SESSION_MAP.remove(window).close();
        }
    }
}
