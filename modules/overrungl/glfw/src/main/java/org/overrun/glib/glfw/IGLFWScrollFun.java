package org.overrun.glib.glfw;

import org.overrun.glib.ICallback;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemoryAddress;
import java.lang.foreign.MemorySession;
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
public interface IGLFWScrollFun extends ICallback {
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

    @Override
    default MemoryAddress address(MemorySession session) throws Exception {
        return address(session, IGLFWScrollFun.class, "invoke", MTYPE, DESC);
    }
}
