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

package org.overrun.glib.glfw;

import org.overrun.glib.Callback;
import org.overrun.glib.RuntimeHelper;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;

/**
 * This is the function pointer type for path drop callbacks. A path drop
 * callback function has the following signature:
 * {@snippet :
 * @Invoker(IGLFWDropFun::invoke)
 * void functionName(MemorySegment window, String[] paths);
 * }
 *
 * <h2>Pointer lifetime</h2>
 * The path array and its strings are valid until the callback function returns.
 *
 * @author squid233
 * @see GLFW#setDropCallback
 * @since 0.1.0
 */
@FunctionalInterface
public interface IGLFWDropFun extends Callback {
    FunctionDescriptor DESC = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, RuntimeHelper.ADDRESS_UNBOUNDED);
    MethodType MTYPE = DESC.toMethodType();

    /**
     * The function pointer type for path drop callbacks.
     *
     * @param window    The window that received the event.
     * @param paths     The UTF-8 encoded file and/or directory path names.
     */
    void invoke(MemorySegment window, String[] paths);

    default void ninvoke(MemorySegment window, int pathCount, MemorySegment paths) {
        invoke(window, RuntimeHelper.toUnboundedArray(paths, new String[pathCount]));
    }

    @Override
    default FunctionDescriptor descriptor() {
        return DESC;
    }

    @Override
    default MethodHandle handle(MethodHandles.Lookup lookup) throws NoSuchMethodException, IllegalAccessException {
        return lookup.findVirtual(IGLFWDropFun.class, "ninvoke", MTYPE);
    }
}
