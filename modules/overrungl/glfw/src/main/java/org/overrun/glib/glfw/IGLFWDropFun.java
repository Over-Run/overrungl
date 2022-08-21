package org.overrun.glib.glfw;

import org.overrun.glib.ICallback;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemoryAddress;
import java.lang.foreign.MemorySession;
import java.lang.foreign.ValueLayout;
import java.lang.invoke.MethodType;

/**
 * This is the function pointer type for path drop callbacks. A path drop
 * callback function has the following signature:
 * {@snippet :
 * @Invoker(IGLFWDropFun::invoke)
 * void functionName(MemoryAddress window, String[] paths);
 * }
 *
 * <h3>Pointer lifetime</h3>
 * The path array and its strings are valid until the callback function returns.
 *
 * @author squid233
 * @see GLFW#setDropCallback
 * @since 0.1.0
 */
@FunctionalInterface
public interface IGLFWDropFun extends ICallback {
    FunctionDescriptor DESC = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
    MethodType MTYPE = MethodType.methodType(void.class, MemoryAddress.class, int.class, MemoryAddress.class);

    /**
     * The function pointer type for path drop callbacks.
     *
     * @param window    The window that received the event.
     * @param paths     The UTF-8 encoded file and/or directory path names.
     */
    void invoke(MemoryAddress window, String[] paths);

    default void ninvoke(MemoryAddress window, int pathCount, MemoryAddress paths) {
        String[] pathArr = new String[pathCount];
        for (int i = 0; i < pathCount; i++) {
            var ptr = paths.address().getAtIndex(ValueLayout.ADDRESS, i);
            pathArr[i] = ptr.getUtf8String(0L);
        }
        invoke(window, pathArr);
    }

    @Override
    default MemoryAddress address(MemorySession session) {
        return address(session, IGLFWDropFun.class, "ninvoke", MTYPE, DESC);
    }
}
