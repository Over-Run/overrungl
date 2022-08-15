package org.overrun.glib.glfw;

import org.overrun.glib.ICallback;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemoryAddress;
import java.lang.foreign.MemorySession;
import java.lang.foreign.ValueLayout;
import java.lang.invoke.MethodType;

/**
 * This is the function pointer type for Unicode character callbacks.
 * A Unicode character callback function has the following signature:
 * {@snippet :
 * @Invoker(IGLFWCharFun::invoke)
 * void functionName(MemoryAddress window, int codepoint);
 * }
 *
 * @author squid233
 * @see GLFW#setCharCallback
 * @since 0.1.0
 */
@FunctionalInterface
public interface IGLFWCharFun extends ICallback {
    FunctionDescriptor DESC = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT);
    MethodType MTYPE = MethodType.methodType(void.class, MemoryAddress.class, int.class);

    /**
     * The function pointer type for Unicode character callbacks.
     *
     * @param window    The window that received the event.
     * @param codepoint The Unicode code point of the character.
     */
    void invoke(MemoryAddress window, int codepoint);

    @Override
    default MemoryAddress address(MemorySession session) throws Exception {
        return address(session, IGLFWCharFun.class, "invoke", MTYPE, DESC);
    }
}
