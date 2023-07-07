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

package org.overrun.gl.glfw;

import org.overrun.gl.Callback;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;

/**
 * This is the function pointer type for window content scale callbacks.
 * A window content scale callback function has the following signature:
 * {@snippet :
 * @Invoker(IGLFWWindowContentScaleFun::invoke)
 * void functionName(MemorySegment window, float xscale, float yscale);
 * }
 *
 * @author squid233
 * @see GLFW#setWindowContentScaleCallback
 * @since 0.1.0
 */
@FunctionalInterface
public interface IGLFWWindowContentScaleFun extends Callback {
    FunctionDescriptor DESC = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT);
    MethodType MTYPE = DESC.toMethodType();

    /**
     * The function pointer type for window content scale callbacks.
     *
     * @param window The window whose content scale changed.
     * @param xscale The new x-axis content scale of the window.
     * @param yscale The new y-axis content scale of the window.
     */
    void invoke(MemorySegment window, float xscale, float yscale);

    @Override
    default FunctionDescriptor descriptor() {
        return DESC;
    }

    @Override
    default MethodHandle handle(MethodHandles.Lookup lookup) throws NoSuchMethodException, IllegalAccessException {
        return lookup.findVirtual(IGLFWWindowContentScaleFun.class, "invoke", MTYPE);
    }
}
