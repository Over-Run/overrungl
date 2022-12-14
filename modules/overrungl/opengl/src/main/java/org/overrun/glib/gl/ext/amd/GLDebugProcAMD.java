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

package org.overrun.glib.gl.ext.amd;

import org.overrun.glib.ICallback;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemoryAddress;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;

import static java.lang.foreign.ValueLayout.ADDRESS;
import static java.lang.foreign.ValueLayout.JAVA_INT;

/**
 * The OpenGL debug message callback.
 *
 * @author squid233
 * @since 0.1.0
 */
@FunctionalInterface
public interface GLDebugProcAMD extends ICallback {
    FunctionDescriptor DESC = FunctionDescriptor.ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS, ADDRESS);
    MethodType MTYPE = MethodType.methodType(void.class, int.class, int.class, int.class, int.class, MemoryAddress.class, MemoryAddress.class);

    /**
     * debug callback
     *
     * @param id        the id of the message
     * @param category  The category of debug message
     * @param severity  The severity of debug message
     * @param message   The debug message
     * @param userParam will be set to the value passed in the {@code userParam}
     *                  parameter to the most recent call to {@code glDebugMessageCallback}.
     */
    void invoke(int id, int category, int severity, String message, MemoryAddress userParam);

    default void ninvoke(int id, int category, int severity, int length, MemoryAddress message, MemoryAddress userParam) {
        invoke(id, category, severity, message.getUtf8String(0), userParam);
    }

    @Override
    default FunctionDescriptor descriptor() {
        return DESC;
    }

    @Override
    default MethodHandle handle(MethodHandles.Lookup lookup) throws NoSuchMethodException, IllegalAccessException {
        return lookup.findVirtual(GLDebugProcAMD.class, "ninvoke", MTYPE);
    }
}
