package org.overrun.glib.glfw;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemoryAddress;
import java.lang.foreign.ValueLayout;
import java.lang.invoke.MethodType;

/**
 * This is the function pointer type for framebuffer size callbacks.
 * A framebuffer size callback function has the following signature:
 * {@snippet :
 * @Invoker(IGLFWFramebufferSizeFun::invoke)
 * void functionName(MemoryAddress window, int width, int height);
 * }
 *
 * @author squid233
 * @see GLFW#setFramebufferSizeCallback
 * @since 0.1.0
 */
@FunctionalInterface
public interface IGLFWFramebufferSizeFun {
    FunctionDescriptor DESC = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
    MethodType MTYPE = MethodType.methodType(void.class, MemoryAddress.class, int.class, int.class);

    /**
     * The function pointer type for framebuffer size callbacks.
     *
     * @param window The window whose framebuffer was resized.
     * @param width  The new width, in pixels, of the framebuffer.
     * @param height The new height, in pixels, of the framebuffer.
     */
    void invoke(MemoryAddress window, int width, int height);
}
