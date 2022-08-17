package org.overrun.glib.glfw;

import org.overrun.glib.ICallback;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemoryAddress;
import java.lang.foreign.MemorySession;
import java.lang.foreign.ValueLayout;
import java.lang.invoke.MethodType;

/**
 * This is the function pointer type for mouse button callback functions.
 * A mouse button callback function has the following signature:
 * {@snippet :
 * @Invoker(IGLFWMouseButtonFun::invoke)
 * void functionName(MemoryAddress window, int button, int action, int mods);
 * }
 *
 * @author squid233
 * @see GLFW#setMouseButtonCallback
 * @since 0.1.0
 */
@FunctionalInterface
public interface IGLFWMouseButtonFun extends ICallback {
    FunctionDescriptor DESC = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
    MethodType MTYPE = MethodType.methodType(void.class, MemoryAddress.class, int.class, int.class, int.class);

    /**
     * The function pointer type for mouse button callbacks.
     *
     * @param window The window that received the event.
     * @param button The <a href="https://www.glfw.org/docs/latest/group__buttons.html">mouse button</a> that was pressed or released.
     * @param action One of {@code PRESS} or {@code RELEASE}. Future releases may add more actions.
     * @param mods   Bit field describing which <a href="https://www.glfw.org/docs/latest/group__mods.html">modifier keys</a> were held down.
     * @throws Throwable anything thrown by the underlying method propagates unchanged through the method handle call
     */
    void invoke(MemoryAddress window, int button, int action, int mods) throws Throwable;

    @Override
    default MemoryAddress address(MemorySession session) throws Exception {
        return address(session, IGLFWMouseButtonFun.class, "invoke", MTYPE, DESC);
    }
}
