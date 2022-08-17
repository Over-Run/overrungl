package org.overrun.glib.glfw;

import org.overrun.glib.ICallback;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemoryAddress;
import java.lang.foreign.MemorySession;
import java.lang.foreign.ValueLayout;
import java.lang.invoke.MethodType;

/**
 * This is the function pointer type for window maximize callbacks. A window
 * maximize callback function has the following signature:
 * {@snippet :
 * @Invoker(IGLFWWindowMaximizeFun::invoke)
 * void functionName(MemoryAddress window, boolean maximized);
 * }
 *
 * @author squid233
 * @see GLFW#setWindowMaximizeCallback
 * @since 0.1.0
 */
@FunctionalInterface
public interface IGLFWWindowMaximizeFun extends ICallback {
    FunctionDescriptor DESC = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT);
    MethodType MTYPE = MethodType.methodType(void.class, MemoryAddress.class, int.class);

    /**
     * The function pointer type for window maximize callbacks.
     *
     * @param window    The window that was maximized or restored.
     * @param maximized {@code true} if the window was maximized, or
     *                  {@code false} if it was restored.
     * @throws Throwable anything thrown by the underlying method propagates unchanged through the method handle call
     */
    void invoke(MemoryAddress window, boolean maximized) throws Throwable;

    default void ninvoke(MemoryAddress window, int maximized) throws Throwable {
        invoke(window, maximized == GLFW.TRUE);
    }

    @Override
    default MemoryAddress address(MemorySession session) throws Exception {
        return address(session, IGLFWWindowMaximizeFun.class, "ninvoke", MTYPE, DESC);
    }
}
