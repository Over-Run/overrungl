/*
 * MIT License
 *
 * Copyright (c) 2022 Overrun Organization
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package org.overrun.glib.glfw;

import org.overrun.glib.ICallback;

import java.lang.foreign.*;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;

/**
 * This is the function pointer type for window focus callbacks.  A window
 * focus callback function has the following signature:
 * {@snippet :
 * @Invoker(IGLFWWindowFocusFun::invoke)
 * void functionName(MemoryAddress window, boolean focused);
 * }
 *
 * @author squid233
 * @see GLFW#setWindowFocusCallback
 * @since 0.1.0
 */
@FunctionalInterface
public interface IGLFWWindowFocusFun extends ICallback {
    FunctionDescriptor DESC = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT);
    MethodType MTYPE = MethodType.methodType(void.class, MemoryAddress.class, int.class);

    /**
     * The function pointer type for window focus callbacks.
     *
     * @param window  The window that gained or lost input focus.
     * @param focused {@code true} if the window was given input focus, or
     *                {@code false} if it lost it.
     */
    void invoke(MemoryAddress window, boolean focused);

    default void ninvoke(MemoryAddress window, int focused) {
        invoke(window, focused == GLFW.TRUE);
    }

    @Override
    default FunctionDescriptor descriptor() {
        return DESC;
    }

    @Override
    default MethodHandle handle(MethodHandles.Lookup lookup) throws NoSuchMethodException, IllegalAccessException {
        return lookup.findVirtual(IGLFWWindowFocusFun.class, "ninvoke", MTYPE);
    }
}
