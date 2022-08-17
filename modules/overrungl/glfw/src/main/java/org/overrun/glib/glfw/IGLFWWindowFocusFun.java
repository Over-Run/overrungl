package org.overrun.glib.glfw;

import org.overrun.glib.ICallback;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemoryAddress;
import java.lang.foreign.MemorySession;
import java.lang.foreign.ValueLayout;
import java.lang.invoke.MethodType;

/**
 * This is the function pointer type for window focus callbacks.  A window
 * focus callback function has the following signature:
 * {@snippet :
 * @Invoker(IGLFWWindowFocusFun::invoke)
 * void functionName(MemoryAddress window, boolean focused);
 * }
 *
 * @author squid233
 * @see GLFW#setWindowFocusCallback
 * @since 0.1.0
 */
@FunctionalInterface
public interface IGLFWWindowFocusFun extends ICallback {
    FunctionDescriptor DESC = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT);
    MethodType MTYPE = MethodType.methodType(void.class, MemoryAddress.class, int.class);

    /**
     * The function pointer type for window focus callbacks.
     *
     * @param window  The window that gained or lost input focus.
     * @param focused {@code true} if the window was given input focus, or
     *                {@code false} if it lost it.
     */
    void invoke(MemoryAddress window, boolean focused);

    default void ninvoke(MemoryAddress window, int focused) {
        invoke(window, focused == GLFW.TRUE);
    }

    @Override
    default MemoryAddress address(MemorySession session) {
        return address(session, IGLFWWindowFocusFun.class, "ninvoke", MTYPE, DESC);
    }
}
