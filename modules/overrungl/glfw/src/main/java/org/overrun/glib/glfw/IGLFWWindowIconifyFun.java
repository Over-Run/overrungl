package org.overrun.glib.glfw;

import org.overrun.glib.ICallback;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemoryAddress;
import java.lang.foreign.MemorySession;
import java.lang.foreign.ValueLayout;
import java.lang.invoke.MethodType;

/**
 * This is the function pointer type for window iconify callbacks. A window
 * iconify callback function has the following signature:
 * {@snippet :
 * @Invoker(IGLFWWindowIconifyFun::invoke)
 * void functionName(MemoryAddress window, boolean iconified);
 * }
 *
 * @author squid233
 * @see GLFW#setWindowIconifyCallback
 * @since 0.1.0
 */
@FunctionalInterface
public interface IGLFWWindowIconifyFun extends ICallback {
    FunctionDescriptor DESC = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT);
    MethodType MTYPE = MethodType.methodType(void.class, MemoryAddress.class, int.class);

    /**
     * The function pointer type for window iconify callbacks.
     *
     * @param window    The window that was iconified or restored.
     * @param iconified {@code true} if the window was iconified, or
     *                  {@code false} if it was restored.
     */
    void invoke(MemoryAddress window, boolean iconified);

    default void ninvoke(MemoryAddress window, int iconified) {
        invoke(window, iconified == GLFW.TRUE);
    }

    @Override
    default MemoryAddress address(MemorySession session) {
        return address(session, IGLFWWindowIconifyFun.class, "ninvoke", MTYPE, DESC);
    }
}
