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
import java.lang.invoke.MethodType;

/**
 * This is the function pointer type for path drop callbacks. A path drop
 * callback function has the following signature:
 * {@snippet :
 * @Invoker(IGLFWDropFun::invoke)
 * void functionName(MemoryAddress window, String[] paths);
 * }
 *
 * <h3>Pointer lifetime</h3>
 * The path array and its strings are valid until the callback function returns.
 *
 * @author squid233
 * @see GLFW#setDropCallback
 * @since 0.1.0
 */
@FunctionalInterface
public interface IGLFWDropFun extends ICallback {
    FunctionDescriptor DESC = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
    MethodType MTYPE = MethodType.methodType(void.class, MemoryAddress.class, int.class, MemoryAddress.class);

    /**
     * The function pointer type for path drop callbacks.
     *
     * @param window    The window that received the event.
     * @param paths     The UTF-8 encoded file and/or directory path names.
     */
    void invoke(MemoryAddress window, String[] paths);

    default void ninvoke(MemoryAddress window, int pathCount, MemoryAddress paths) {
        String[] pathArr = new String[pathCount];
        for (int i = 0; i < pathCount; i++) {
            var ptr = paths.getAtIndex(ValueLayout.ADDRESS, i);
            pathArr[i] = ptr.getUtf8String(0L);
        }
        invoke(window, pathArr);
    }

    @Override
    default Addressable address(MemorySession session) {
        return segment(session, IGLFWDropFun.class, "ninvoke", MTYPE, DESC);
    }
}
