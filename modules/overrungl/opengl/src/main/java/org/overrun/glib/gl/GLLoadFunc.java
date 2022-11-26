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
import org.overrun.glib.util.value.Value2;

import java.lang.foreign.MemoryAddress;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.MemorySession;
import java.lang.foreign.SegmentAllocator;
import java.lang.invoke.MethodHandle;
import java.util.function.BiFunction;

/**
 * The OpenGL loading function.
 *
 * <h2>Example</h2>
 * <pre>{@code
 * if (GLLoader.loadShared(GLFW::getProcAddress) == 0)
 *     throw new IllegalStateException("Failed to load OpenGL");
 * }</pre>
 *
 * @author squid233
 * @since 0.1.0
 */
public interface GLLoadFunc extends BiFunction<SegmentAllocator, String, MemoryAddress> {
    /**
     * Creates a load function with shared arena.
     *
     * @param function the function pointer getter
     * @return the load function and the arena
     */
    static Value2<GLLoadFunc, MemorySession> ofShared(Getter function) {
        final var arena = MemorySession.openShared();
        return new Value2<>(of(arena, function), arena);
    }

    /**
     * Creates a load function with given segment allocator.
     *
     * @param allocator the segment allocator.
     * @param function  the function pointer getter
     * @return the load function
     */
    static GLLoadFunc of(SegmentAllocator allocator, Getter function) {
        return new GLLoadFunc.Delegate(allocator, function);
    }

    @Override
    default MemoryAddress apply(SegmentAllocator allocator, String s) {
        return invoke(allocator, s);
    }

    /**
     * Load a function by the given name.
     *
     * @param allocator the segment allocator to allocate function name string
     * @param procName  the function name
     * @return the function address
     */
    MemoryAddress invoke(SegmentAllocator allocator, String procName);

    /**
     * Load a function by the given name and creates a downcall handle or {@code null}.
     *
     * @param procName the function name
     * @param function the function descriptor of the target function.
     * @return a downcall method handle. or {@code null} if the symbol {@link MemorySegment#NULL}
     */
    @Nullable
    MethodHandle invoke(String procName, FunctionDescriptors function);

    /**
     * The function pointer getter.
     *
     * @author squid233
     * @since 0.1.0
     */
    @FunctionalInterface
    interface Getter extends BiFunction<SegmentAllocator, String, MemoryAddress> {
    }

    /**
     * The delegate contained a segment allocator and the callback.
     *
     * @author squid233
     * @since 0.1.0
     */
    class Delegate implements GLLoadFunc {
        private final SegmentAllocator allocator;
        private final Getter func;

        /**
         * Creates a delegate.
         *
         * @param allocator the segment allocator
         * @param func      the loading function
         */
        public Delegate(SegmentAllocator allocator,
                        Getter func) {
            this.allocator = allocator;
            this.func = func;
        }

        @Override
        public MemoryAddress invoke(SegmentAllocator allocator, String procName) {
            return func.apply(allocator, procName);
        }

        @Override
        public @Nullable MethodHandle invoke(String procName, FunctionDescriptors function) {
            return RuntimeHelper.downcallSafe(invoke(allocator, procName), function);
        }
    }
}
