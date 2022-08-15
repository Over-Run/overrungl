package org.overrun.glib.glfw;

import org.overrun.glib.ICallback;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemoryAddress;
import java.lang.foreign.MemorySession;
import java.lang.foreign.ValueLayout;
import java.lang.invoke.MethodType;

/**
 * This is the function pointer type for cursor position callbacks. A cursor
 * position callback function has the following signature:
 * {@snippet :
 * @Invoker(IGLFWCursorPosFun::invoke)
 * void functionName(MemoryAddress window, double xpos, double ypos);
 * }
 *
 * @author squid233
 * @see GLFW#setCursorPosCallback
 * @since 0.1.0
 */
@FunctionalInterface
public interface IGLFWCursorPosFun extends ICallback {
    FunctionDescriptor DESC = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE);
    MethodType MTYPE = MethodType.methodType(void.class, MemoryAddress.class, double.class, double.class);

    /**
     * The function pointer type for cursor position callbacks.
     *
     * @param window The window that received the event.
     * @param xpos   The new cursor x-coordinate, relative to the left edge of the content area.
     * @param ypos   The new cursor y-coordinate, relative to the top edge of the content area.
     */
    void invoke(MemoryAddress window, double xpos, double ypos);

    @Override
    default MemoryAddress address(MemorySession session) throws Exception {
        return address(session, IGLFWCursorPosFun.class, "invoke", MTYPE, DESC);
    }
}
