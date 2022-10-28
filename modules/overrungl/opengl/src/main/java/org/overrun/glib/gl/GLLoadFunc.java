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

import org.jetbrains.annotations.Nullable;
import org.overrun.glib.FunctionDescriptors;
import org.overrun.glib.RuntimeHelper;

import java.lang.foreign.MemoryAddress;
import java.lang.foreign.MemorySession;
import java.lang.invoke.MethodHandle;
import java.lang.ref.Cleaner;
import java.util.function.BiFunction;

/**
 * The OpenGL loading function.
 *
 * <h2>Example</h2>
 * <pre>{@code
 * try (var func = GLLoadFunc.ofShared(GLFW::getProcAddress)) {
 *     if (GLCaps.load(func) == 0)
 *         throw new IllegalStateException("Failed to load OpenGL");
 * }
 * }</pre>
 *
 * @author squid233
 * @since 0.1.0
 */
@FunctionalInterface
public interface GLLoadFunc extends AutoCloseable {
    /**
     * Creates a load function.
     *
     * @param function the function pointer getter
     * @return the load function
     */
    static GLLoadFunc ofShared(BiFunction<MemorySession, String, MemoryAddress> function) {
        return new GLLoadFunc() {
            private final MemorySession session = MemorySession.openShared(Cleaner.create());

            @Override
            public MemoryAddress invoke(String procName) {
                return function.apply(session, procName);
            }

            @Override
            public void close() {
                session.close();
            }
        };
    }

    /**
     * Load a function by the given name.
     *
     * @param procName the function name
     * @return the function address
     */
    MemoryAddress invoke(String procName);

    @Override
    default void close() {
    }

    /**
     * Load a function by the given name and creates a downcall handle or {@code null}.
     *
     * @param procName the function name
     * @param function the function descriptor of the target function.
     * @return a downcall method handle. or {@code null} if the symbol {@link MemoryAddress#NULL}
     */
    @Nullable
    default MethodHandle invoke(String procName, FunctionDescriptors function) {
        return RuntimeHelper.downcallSafe(invoke(procName), function);
    }
}
