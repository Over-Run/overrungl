package org.overrun.glib.glfw;

import org.overrun.glib.ICallback;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemoryAddress;
import java.lang.foreign.MemorySession;
import java.lang.foreign.ValueLayout;
import java.lang.invoke.MethodType;

/**
 * This is the function pointer type for window content scale callbacks.
 * A window content scale callback function has the following signature:
 * {@snippet :
 * @Invoker(IGLFWWindowContentScaleFun::invoke)
 * void functionName(MemoryAddress window, float xscale, float yscale);
 * }
 *
 * @author squid233
 * @see GLFW#setWindowContentScaleCallback
 * @since 0.1.0
 */
@FunctionalInterface
public interface IGLFWWindowContentScaleFun extends ICallback {
    FunctionDescriptor DESC = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT);
    MethodType MTYPE = MethodType.methodType(void.class, MemoryAddress.class, float.class, float.class);

    /**
     * The function pointer type for window content scale callbacks.
     *
     * @param window The window whose content scale changed.
     * @param xscale The new x-axis content scale of the window.
     * @param yscale The new y-axis content scale of the window.
     */
    void invoke(MemoryAddress window, float xscale, float yscale);

    @Override
    default MemoryAddress address(MemorySession session) throws Exception {
        return address(session, IGLFWWindowContentScaleFun.class, "invoke", MTYPE, DESC);
    }
}
