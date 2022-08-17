package org.overrun.glib.glfw;

import org.overrun.glib.ICallback;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemoryAddress;
import java.lang.foreign.MemorySession;
import java.lang.foreign.ValueLayout;
import java.lang.invoke.MethodType;

/**
 * This is the function pointer type for Unicode character with modifiers
 * callbacks. It is called for each input character, regardless of what
 * modifier keys are held down.  A Unicode character with modifiers callback
 * function has the following signature:
 * {@snippet :
 * @Invoker(IGLFWCharModsFun::invoke)
 * void functionName(MemoryAddress window, int codepoint, int mods);
 * }
 *
 * @author squid233
 * @see GLFW#setCharModsCallback
 * @since 0.1.0
 * @deprecated Scheduled for removal in version GLFW 4.0.
 */
@FunctionalInterface
@Deprecated(forRemoval = true)
public interface IGLFWCharModsFun extends ICallback {
    FunctionDescriptor DESC = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
    MethodType MTYPE = MethodType.methodType(void.class, MemoryAddress.class, int.class, int.class);

    /**
     * The function pointer type for Unicode character with modifiers callbacks.
     *
     * @param window    The window that received the event.
     * @param codepoint The Unicode code point of the character.
     * @param mods      Bit field describing which <a href="https://www.glfw.org/docs/latest/group__mods.html">modifier keys</a> were
     *                  held down.
     * @throws Throwable anything thrown by the underlying method propagates unchanged through the method handle call
     */
    void invoke(MemoryAddress window, int codepoint, int mods) throws Throwable;

    @Override
    default MemoryAddress address(MemorySession session) throws Exception {
        return address(session, IGLFWCharModsFun.class, "invoke", MTYPE, DESC);
    }
}
