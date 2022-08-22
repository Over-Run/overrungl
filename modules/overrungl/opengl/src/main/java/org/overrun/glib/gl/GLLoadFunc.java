package org.overrun.glib.gl;

import java.lang.foreign.MemoryAddress;

/**
 * The OpenGL loading function.
 *
 * <h3>Example</h3>
 * {@code GLCaps.load(GLFW::getProcAddress)}
 *
 * @author squid233
 * @since 0.1.0
 */
@FunctionalInterface
public interface GLLoadFunc {
    /**
     * Load a function by the given name.
     *
     * @param procName the function name
     * @return the function address
     */
    MemoryAddress invoke(String procName);
}
