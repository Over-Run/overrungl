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
 * This is the function pointer type for window maximize callbacks. A window
 * maximize callback function has the following signature:
 * {@snippet :
 * @Invoker(IGLFWWindowMaximizeFun::invoke)
 * void functionName(MemoryAddress window, boolean maximized);
 * }
 *
 * @author squid233
 * @see GLFW#setWindowMaximizeCallback
 * @since 0.1.0
 */
@FunctionalInterface
public interface IGLFWWindowMaximizeFun extends ICallback {
    FunctionDescriptor DESC = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT);
    MethodType MTYPE = MethodType.methodType(void.class, MemoryAddress.class, int.class);

    /**
     * The function pointer type for window maximize callbacks.
     *
     * @param window    The window that was maximized or restored.
     * @param maximized {@code true} if the window was maximized, or
     *                  {@code false} if it was restored.
     */
    void invoke(MemoryAddress window, boolean maximized);

    default void ninvoke(MemoryAddress window, int maximized) {
        invoke(window, maximized == GLFW.TRUE);
    }

    @Override
    default FunctionDescriptor descriptor() {
        return DESC;
    }

    @Override
    default MethodHandle handle(MethodHandles.Lookup lookup) throws NoSuchMethodException, IllegalAccessException {
        return lookup.findVirtual(IGLFWWindowMaximizeFun.class, "ninvoke", MTYPE);
    }
}
