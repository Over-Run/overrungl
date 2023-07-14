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

package overrungl.glfw;

import overrungl.Callback;
import overrungl.RuntimeHelper;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;
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
 * <h2>Pointer lifetime</h2>
 * The error description string is valid until the callback
 * function returns.
 *
 * @author squid233
 * @see GLFW#setErrorCallback
 * @since 0.1.0
 */
@FunctionalInterface
public interface IGLFWErrorFun extends Callback {
    FunctionDescriptor DESC = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, RuntimeHelper.ADDRESS_UNBOUNDED);
    MethodType MTYPE = DESC.toMethodType();

    /**
     * The function pointer type for error callbacks.
     *
     * @param errorCode   An <a href="https://www.glfw.org/docs/latest/group__errors.html">error code</a>. Future releases may add more error codes.
     * @param description A UTF-8 encoded string describing the error.
     */
    void invoke(int errorCode, String description);

    default void ninvoke(int errorCode, MemorySegment description) {
        invoke(errorCode, description.getUtf8String(0));
    }

    /**
     * Sets the error callback.
     *
     * @return The previous callback or {@code NULL}.
     */
    default MemorySegment set() {
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
