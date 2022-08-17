package org.overrun.glib.glfw;

import org.overrun.glib.ICallback;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemoryAddress;
import java.lang.foreign.MemorySession;
import java.lang.foreign.ValueLayout;
import java.lang.invoke.MethodType;

/**
 * This is the function pointer type for keyboard key callbacks. A keyboard
 * key callback function has the following signature:
 * {@snippet :
 * @Invoker(IGLFWKeyFun::invoke)
 * void functionName(MemoryAddress window, int key, int scancode, int action, int mods);
 * }
 *
 * @author squid233
 * @see GLFW#setKeyCallback
 * @since 0.1.0
 */
@FunctionalInterface
public interface IGLFWKeyFun extends ICallback {
    FunctionDescriptor DESC = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
    MethodType MTYPE = MethodType.methodType(void.class, MemoryAddress.class, int.class, int.class, int.class, int.class);

    /**
     * The function pointer type for keyboard key callbacks.
     *
     * @param window   The window that received the event.
     * @param key      The <a href="https://www.glfw.org/docs/latest/group__keys.html">keyboard key</a>
     *                 that was pressed or released.
     * @param scancode The system-specific scancode of the key.
     * @param action   {@code PRESS}, {@code RELEASE} or {@code REPEAT}. Future releases may add more actions.
     * @param mods     Bit field describing which <a href="https://www.glfw.org/docs/latest/group__mods.html">modifier keys</a>
     *                 were held down.
     */
    void invoke(MemoryAddress window, int key, int scancode, int action, int mods);

    @Override
    default MemoryAddress address(MemorySession session) {
        return address(session, IGLFWKeyFun.class, "invoke", MTYPE, DESC);
    }
}
