package org.overrun.glib.glfw;

/**
 * The GLFW error callback.
 *
 * @author squid233
 * @since 0.1.0
 */
public class GLFWErrorCallback {
    /**
     * Returns a {@code GLFWErrorCallback} instance that throws an {@link IllegalStateException} when an error occurs.
     *
     * @return the GLFWerrorCallback
     */
    public static IGLFWErrorFun createThrow() {
        return (errorCode, description) -> {
            throw new IllegalStateException(String.format("GLFW error [0x%X]: %s", errorCode, description));
        };
    }
}
