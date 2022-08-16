package org.overrun.glib.gl;

import java.lang.foreign.MemoryAddress;

/**
 * The OpenGL loading function.
 *
 * <h3>Example</h3>
 * {@code GL.load(GLFW::getProcAddress)}
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
     * @throws Throwable anything thrown by the underlying method propagates unchanged through the method handle call
     */
    MemoryAddress invoke(String procName) throws Throwable;
}
