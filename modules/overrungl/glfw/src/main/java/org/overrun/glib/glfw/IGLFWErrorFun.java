package org.overrun.glib.glfw;

import org.overrun.glib.ICallback;

import java.lang.foreign.*;
import java.lang.invoke.MethodType;

/**
 * This is the function pointer type for error callbacks. An error callback
 * function has the following signature:
 * {@snippet :
 * @Invoker(IGLFWErrorFun::invoke)
 * void callbackName(int errorCode, String description);
 * }
 *
 * <h3>Pointer lifetime</h3>
 * The error description string is valid until the callback
 * function returns.
 *
 * @author squid233
 * @see GLFW#setErrorCallback
 * @since 0.1.0
 */
@FunctionalInterface
public interface IGLFWErrorFun extends ICallback {
    FunctionDescriptor DESC = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
    MethodType MTYPE = MethodType.methodType(void.class, int.class, MemoryAddress.class);

    /**
     * The function pointer type for error callbacks.
     *
     * @param errorCode   An <a href="https://www.glfw.org/docs/latest/group__errors.html">error code</a>. Future releases may add more error codes.
     * @param description A UTF-8 encoded string describing the error.
     * @throws Throwable anything thrown by the underlying method propagates unchanged through the method handle call
     */
    void invoke(int errorCode, String description) throws Throwable;

    default void ninvoke(int errorCode, MemoryAddress description) throws Throwable {
        invoke(errorCode, description.getUtf8String(0L));
    }

    @Override
    default MemoryAddress address(MemorySession session) throws Exception {
        return address(session, IGLFWErrorFun.class, "ninvoke", MTYPE, DESC);
    }
}
