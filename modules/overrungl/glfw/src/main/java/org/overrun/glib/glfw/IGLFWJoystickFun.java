package org.overrun.glib.glfw;

import org.overrun.glib.ICallback;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemoryAddress;
import java.lang.foreign.MemorySession;
import java.lang.foreign.ValueLayout;
import java.lang.invoke.MethodType;

/**
 * This is the function pointer type for joystick configuration callbacks.
 * A joystick configuration callback function has the following signature:
 * {@snippet :
 * @Invoker(IGLFWJoystickFun::invoke)
 * void functionName(int jid, int event);
 * }
 *
 * @author squid233
 * @see GLFW#setJoystickCallback
 * @since 0.1.0
 */
@FunctionalInterface
public interface IGLFWJoystickFun extends ICallback {
    FunctionDescriptor DESC = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
    MethodType MTYPE = MethodType.methodType(void.class, int.class, int.class);

    /**
     * The function pointer type for joystick configuration callbacks.
     *
     * @param jid   The joystick that was connected or disconnected.
     * @param event One of {@code CONNECTED} or {@code DISCONNECTED}. Future
     *              releases may add more events.
     */
    void invoke(int jid, int event);

    @Override
    default MemoryAddress address(MemorySession session) throws Exception {
        return address(session, IGLFWJoystickFun.class, "invoke", MTYPE, DESC);
    }
}
