package org.overrun.glib.glfw;

import org.overrun.glib.ICallback;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemoryAddress;
import java.lang.foreign.MemorySession;
import java.lang.foreign.ValueLayout;
import java.lang.invoke.MethodType;

/**
 * This is the function pointer type for cursor enter/leave callbacks.
 * A cursor enter/leave callback function has the following signature:
 * {@snippet :
 * @Invoker(IGLFWCursorEnterFun::invoke)
 * void functionName(MemoryAddress window, boolean entered);
 * }
 *
 * @author squid233
 * @see GLFW#setCursorEnterCallback
 * @since 0.1.0
 */
@FunctionalInterface
public interface IGLFWCursorEnterFun extends ICallback {
    FunctionDescriptor DESC = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT);
    MethodType MTYPE = MethodType.methodType(void.class, MemoryAddress.class, int.class);

    /**
     * The function pointer type for cursor enter/leave callbacks.
     *
     * @param window  The window that received the event.
     * @param entered {@code true} if the cursor entered the window's content
     *                area, or {@code false} if it left it.
     */
    void invoke(MemoryAddress window, boolean entered);

    default void ninvoke(MemoryAddress window, int entered) {
        invoke(window, entered == GLFW.TRUE);
    }

    @Override
    default MemoryAddress address(MemorySession session) throws Exception {
        return address(session, IGLFWCursorEnterFun.class, "ninvoke", MTYPE, DESC);
    }
}
