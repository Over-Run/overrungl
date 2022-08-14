package org.overrun.glib.glfw;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemoryAddress;
import java.lang.foreign.ValueLayout;
import java.lang.invoke.MethodType;

/**
 * This is the function pointer type for scroll callbacks. A scroll callback
 * function has the following signature:
 * {@snippet :
 * @Invoker(IGLFWScrollFun::invoke)
 * void functionName(MemoryAddress window, double xoffset, double yoffset);
 * }
 *
 * @author squid233
 * @see GLFW#setScrollCallback
 * @since 0.1.0
 */
@FunctionalInterface
public interface IGLFWScrollFun {
    FunctionDescriptor DESC = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE);
    MethodType MTYPE = MethodType.methodType(void.class, MemoryAddress.class, double.class, double.class);

    /**
     * The function pointer type for scroll callbacks.
     *
     * @param window  The window that received the event.
     * @param xoffset The scroll offset along the x-axis.
     * @param yoffset The scroll offset along the y-axis.
     */
    void invoke(MemoryAddress window, double xoffset, double yoffset);
}
