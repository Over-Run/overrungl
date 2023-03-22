/*
 * MIT License
 *
 * Copyright (c) 2022-2023 Overrun Organization
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
 */

package org.overrun.glib.gl;

import org.jetbrains.annotations.Nullable;
import org.overrun.glib.FunctionDescriptors;
import org.overrun.glib.RuntimeHelper;
import org.overrun.glib.util.value.Value2;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.invoke.MethodHandle;
import java.util.function.BiFunction;

/**
 * The OpenGL loading function.
 *
 * <h2>Example</h2>
 * <pre>{@code
 * if (GLLoader.loadConfined(true, GLFW::getProcAddress) == 0)
 *     throw new IllegalStateException("Failed to load OpenGL");
 * }</pre>
 *
 * @author squid233
 * @since 0.1.0
 */
public interface GLLoadFunc extends BiFunction<SegmentAllocator, String, MemorySegment> {
    /**
     * Creates a load function with the shared arena.
     *
     * @param function the function pointer getter
     * @return the load function and the arena
     */
    static Value2<GLLoadFunc, Arena> ofShared(Getter function) {
        final var arena = Arena.openShared();
        return new Value2<>(of(arena, function), arena);
    }

    /**
     * Creates a load function with the confined arena.
     *
     * @param function the function pointer getter
     * @return the load function and the arena
     */
    static Value2<GLLoadFunc, Arena> ofConfined(Getter function) {
        final var arena = Arena.openConfined();
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
    default MemorySegment apply(SegmentAllocator allocator, String s) {
        return invoke(allocator, s);
    }

    /**
     * Load a function by the given name.
     *
     * @param allocator the segment allocator to allocate function name string
     * @param procName  the function name
     * @return the function address
     */
    MemorySegment invoke(SegmentAllocator allocator, String procName);

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
    interface Getter extends BiFunction<SegmentAllocator, String, MemorySegment> {
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
        public MemorySegment invoke(SegmentAllocator allocator, String procName) {
            return func.apply(allocator, procName);
        }

        @Override
        public @Nullable MethodHandle invoke(String procName, FunctionDescriptors function) {
            return RuntimeHelper.downcallSafe(invoke(allocator, procName), function);
        }
    }
}
