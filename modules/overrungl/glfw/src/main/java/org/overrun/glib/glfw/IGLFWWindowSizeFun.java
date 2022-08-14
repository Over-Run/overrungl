package org.overrun.glib.glfw;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemoryAddress;
import java.lang.foreign.ValueLayout;
import java.lang.invoke.MethodType;

/**
 * This is the function pointer type for window size callbacks. A window size
 * callback function has the following signature:
 * {@snippet :
 * @Invoker(IGLFWWindowSizeFun::invoke)
 * void callbackName(MemoryAddress window, int width, int height);
 * }
 *
 * @author squid233
 * @see GLFW#setWindowSizeCallback
 * @since 0.1.0
 */
@FunctionalInterface
public interface IGLFWWindowSizeFun {
    FunctionDescriptor DESC = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
    MethodType MTYPE = MethodType.methodType(void.class, MemoryAddress.class, int.class, int.class);

    /**
     * The function pointer type for window size callbacks.
     *
     * @param window The window that was resized.
     * @param width  The new width, in screen coordinates, of the window.
     * @param height The new height, in screen coordinates, of the window.
     */
    void invoke(MemoryAddress window, int width, int height);
}
