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
     */
    void invoke(int errorCode, String description);

    default void ninvoke(int errorCode, MemoryAddress description) {
        invoke(errorCode, description.getUtf8String(0));
    }

    /**
     * Sets the error callback.
     *
     * @return The previous callback or {@code NULL}.
     */
    default MemoryAddress set() {
        return GLFW.setErrorCallback(this);
    }

    @Override
    default FunctionDescriptor descriptor() {
        return DESC;
    }

    @Override
    default MethodHandle handle(MethodHandles.Lookup lookup) throws NoSuchMethodException, IllegalAccessException {
        return lookup.findVirtual(IGLFWErrorFun.class, "ninvoke", MTYPE);
    }
}
