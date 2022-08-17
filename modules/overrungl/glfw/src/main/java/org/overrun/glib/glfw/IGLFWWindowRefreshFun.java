package org.overrun.glib.glfw;

import org.overrun.glib.ICallback;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemoryAddress;
import java.lang.foreign.MemorySession;
import java.lang.foreign.ValueLayout;
import java.lang.invoke.MethodType;

/**
 * This is the function pointer type for window content refresh callbacks.
 * A window content refresh callback function has the following signature:
 * {@snippet :
 * @Invoker(IGLFWWindowRefreshFun::invoke)
 * void functionName(MemoryAddress window);
 * }
 *
 * @author squid233
 * @see GLFW#setWindowRefreshCallback
 * @since 0.1.0
 */
@FunctionalInterface
public interface IGLFWWindowRefreshFun extends ICallback {
    FunctionDescriptor DESC = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS);
    MethodType MTYPE = MethodType.methodType(void.class, MemoryAddress.class);

    /**
     * The function pointer type for window content refresh callbacks.
     *
     * @param window The window whose content needs to be refreshed.
     * @throws Throwable anything thrown by the underlying method propagates unchanged through the method handle call
     */
    void invoke(MemoryAddress window) throws Throwable;

    @Override
    default MemoryAddress address(MemorySession session) throws Exception {
        return address(session, IGLFWWindowRefreshFun.class, "invoke", MTYPE, DESC);
    }
}
