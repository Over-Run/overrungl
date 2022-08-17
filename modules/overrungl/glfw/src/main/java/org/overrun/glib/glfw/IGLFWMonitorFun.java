package org.overrun.glib.glfw;

import org.overrun.glib.ICallback;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemoryAddress;
import java.lang.foreign.MemorySession;
import java.lang.foreign.ValueLayout;
import java.lang.invoke.MethodType;

/**
 * This is the function pointer type for monitor configuration callbacks.
 * A monitor callback function has the following signature:
 * {@snippet :
 * @Invoker(IGLFWMonitorFun::invoke)
 * void functionName(MemoryAddress monitor, int event);
 * }
 *
 * @author squid233
 * @see GLFW#setMonitorCallback
 * @since 0.1.0
 */
@FunctionalInterface
public interface IGLFWMonitorFun extends ICallback {
    FunctionDescriptor DESC = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT);
    MethodType MTYPE = MethodType.methodType(void.class, MemoryAddress.class, int.class);

    /**
     * The function pointer type for monitor configuration callbacks.
     *
     * @param monitor The monitor that was connected or disconnected.
     * @param event   One of {@code CONNECTED} or {@code DISCONNECTED}. Future
     *                releases may add more events.
     * @throws Throwable anything thrown by the underlying method propagates unchanged through the method handle call
     */
    void invoke(MemoryAddress monitor, int event) throws Throwable;

    @Override
    default MemoryAddress address(MemorySession session) throws Exception {
        return address(session, IGLFWMonitorFun.class, "invoke", MTYPE, DESC);
    }
}
