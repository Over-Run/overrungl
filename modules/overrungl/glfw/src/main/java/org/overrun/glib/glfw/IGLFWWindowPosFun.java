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
 * This is the function pointer type for window position callbacks.A window
 * position callback function has the following signature:
 * {@snippet :
 * @Invoker(IGLFWWindowPosFun::invoke)
 * void callbackName(MemoryAddress window, int xpos, int ypos);
 * }
 *
 * @author squid233
 * @see GLFW#setWindowPosCallback
 * @since 0.1.0
 */
@FunctionalInterface
public interface IGLFWWindowPosFun extends ICallback {
    FunctionDescriptor DESC = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
    MethodType MTYPE = MethodType.methodType(void.class, MemoryAddress.class, int.class, int.class);

    /**
     * The function pointer type for window position callbacks.
     *
     * @param window The window that was moved.
     * @param xpos   The new x-coordinate, in screen coordinates, of the
     *               upper-left corner of the content area of the window.
     * @param ypos   The new y-coordinate, in screen coordinates, of the
     *               upper-left corner of the content area of the window.
     */
    void invoke(MemoryAddress window, int xpos, int ypos);

    @Override
    default Addressable address(MemorySession session) {
        return segment(session, IGLFWWindowPosFun.class, "invoke", MTYPE, DESC);
    }
}
