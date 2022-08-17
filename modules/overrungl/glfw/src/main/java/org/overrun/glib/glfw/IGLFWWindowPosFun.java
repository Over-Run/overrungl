package org.overrun.glib.glfw;

import org.overrun.glib.ICallback;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemoryAddress;
import java.lang.foreign.MemorySession;
import java.lang.foreign.ValueLayout;
import java.lang.invoke.MethodType;

/**
 * This is the function pointer type for window position callbacks.A window
 * position callback function has the following signature:
 * {@snippet :
 * @Invoker(IGLFWWindowPosFun::invoke)
 * void callbackName(MemoryAddress window, int xpos, int ypos);
 * }
 *
 * @author squid233
 * @see GLFW#setWindowPosCallback
 * @since 0.1.0
 */
@FunctionalInterface
public interface IGLFWWindowPosFun extends ICallback {
    FunctionDescriptor DESC = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
    MethodType MTYPE = MethodType.methodType(void.class, MemoryAddress.class, int.class, int.class);

    /**
     * The function pointer type for window position callbacks.
     *
     * @param window The window that was moved.
     * @param xpos   The new x-coordinate, in screen coordinates, of the
     *               upper-left corner of the content area of the window.
     * @param ypos   The new y-coordinate, in screen coordinates, of the
     *               upper-left corner of the content area of the window.
     */
    void invoke(MemoryAddress window, int xpos, int ypos);

    @Override
    default MemoryAddress address(MemorySession session) {
        return address(session, IGLFWWindowPosFun.class, "invoke", MTYPE, DESC);
    }
}
