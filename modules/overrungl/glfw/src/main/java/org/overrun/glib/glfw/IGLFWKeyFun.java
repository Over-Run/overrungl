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

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;

/**
 * This is the function pointer type for keyboard key callbacks. A keyboard
 * key callback function has the following signature:
 * {@snippet :
 * @Invoker(IGLFWKeyFun::invoke)
 * void functionName(MemoryAddress window, int key, int scancode, int action, int mods);
 * }
 *
 * @author squid233
 * @see GLFW#setKeyCallback
 * @since 0.1.0
 */
@FunctionalInterface
public interface IGLFWKeyFun extends ICallback {
    FunctionDescriptor DESC = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
    MethodType MTYPE = DESC.toMethodType();

    /**
     * The function pointer type for keyboard key callbacks.
     *
     * @param window   The window that received the event.
     * @param key      The <a href="https://www.glfw.org/docs/latest/group__keys.html">keyboard key</a>
     *                 that was pressed or released.
     * @param scancode The system-specific scancode of the key.
     * @param action   {@code PRESS}, {@code RELEASE} or {@code REPEAT}. Future releases may add more actions.
     * @param mods     Bit field describing which <a href="https://www.glfw.org/docs/latest/group__mods.html">modifier keys</a>
     *                 were held down.
     */
    void invoke(MemorySegment window, int key, int scancode, int action, int mods);

    @Override
    default FunctionDescriptor descriptor() {
        return DESC;
    }

    @Override
    default MethodHandle handle(MethodHandles.Lookup lookup) throws NoSuchMethodException, IllegalAccessException {
        return lookup.findVirtual(IGLFWKeyFun.class, "invoke", MTYPE);
    }
}
