package org.overrun.glib.glfw;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;
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
public interface IGLFWErrorFun {
    FunctionDescriptor DESC = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
    MethodType MTYPE = MethodType.methodType(void.class, int.class, MemorySegment.class);

    /**
     * The function pointer type for error callbacks.
     *
     * @param errorCode   An <a href="https://www.glfw.org/docs/latest/group__errors.html">error code</a>. Future releases may add more error codes.
     * @param description A UTF-8 encoded string describing the error.
     */
    void invoke(int errorCode, String description);

    default void ninvoke(int errorCode, MemorySegment description) {
        invoke(errorCode, description.getUtf8String(0L));
    }
}
