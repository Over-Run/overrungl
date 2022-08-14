package org.overrun.glib.glfw;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemoryAddress;
import java.lang.foreign.ValueLayout;
import java.lang.invoke.MethodType;

/**
 * This is the function pointer type for window close callbacks. A window
 * close callback function has the following signature:
 * {@snippet :
 * @Invoker(IGLFWWindowCloseFun::invoke)
 * void functionName(MemoryAddress window);
 * }
 *
 * @author squid233
 * @see GLFW#setWindowCloseCallback
 * @since 0.1.0
 */
@FunctionalInterface
public interface IGLFWWindowCloseFun {
    FunctionDescriptor DESC = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS);
    MethodType MTYPE = MethodType.methodType(void.class, MemoryAddress.class);

    /**
     * The function pointer type for window close callbacks.
     *
     * @param window The window that the user attempted to close.
     */
    void invoke(MemoryAddress window);
}
