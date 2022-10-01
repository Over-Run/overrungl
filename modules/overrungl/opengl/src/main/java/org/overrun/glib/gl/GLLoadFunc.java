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

package org.overrun.glib.gl;

import org.overrun.glib.FunctionDescriptors;

import java.lang.foreign.MemoryAddress;
import java.lang.invoke.MethodHandle;

/**
 * The OpenGL loading function.
 *
 * <h3>Example</h3>
 * {@code GLCaps.load(GLFW::getProcAddress)}
 *
 * @author squid233
 * @since 0.1.0
 */
@FunctionalInterface
public interface GLLoadFunc {
    /**
     * Load a function by the given name.
     *
     * @param procName the function name
     * @return the function address
     */
    MemoryAddress invoke(String procName);

    /**
     * Load a function by the given name and creates a downcall handle or {@code null}.
     *
     * @param procName the function name
     * @param function the function descriptor of the target function.
     * @return a downcall method handle. or {@code null} if the symbol {@link MemoryAddress#NULL}
     */
    default MethodHandle invoke(String procName, FunctionDescriptors function) {
        return function.downcallSafe(invoke(procName));
    }
}
