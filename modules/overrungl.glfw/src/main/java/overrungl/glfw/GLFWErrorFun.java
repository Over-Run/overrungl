/*
 * MIT License
 *
 * Copyright (c) 2022-2024 Overrun Organization
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

import overrun.marshal.Unmarshal;
import overrun.marshal.Upcall;
import overrungl.NativeType;

import java.lang.foreign.Arena;
import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;

import static java.lang.foreign.ValueLayout.*;

/**
 * This is the function pointer type for error callbacks. An error callback
 * function has the following signature:
 * {@snippet lang = java:
 * void callbackName(int errorCode, String description); // @link regex="functionName" target="#invoke"
 * }
 * <h2>Pointer lifetime</h2>
 * The error description string is valid until the callback
 * function returns.
 *
 * @author squid233
 * @see GLFW#setErrorCallback
 * @since 0.1.0
 */
@FunctionalInterface
public interface GLFWErrorFun extends Upcall {
    /**
     * The type.
     */
    Type<GLFWErrorFun> TYPE = Upcall.type("ninvoke", FunctionDescriptor.ofVoid(JAVA_INT, ADDRESS.withTargetLayout(MemoryLayout.sequenceLayout(Unmarshal.STR_SIZE, JAVA_BYTE))));

    /**
     * The function pointer type for error callbacks.
     *
     * @param errorCode   An <a href="https://www.glfw.org/docs/latest/group__errors.html">error code</a>. Future releases may add more error codes.
     * @param description A UTF-8 encoded string describing the error.
     */
    void invoke(int errorCode, String description);

    /**
     * The function pointer type for error callbacks.
     *
     * @param errorCode   An <a href="https://www.glfw.org/docs/latest/group__errors.html">error code</a>.
     *                    Future releases may add more error codes.
     * @param description A UTF-8 encoded string describing the error.
     */
    default void ninvoke(int errorCode, @NativeType("const char*") MemorySegment description) {
        invoke(errorCode, Unmarshal.unmarshalAsString(description));
    }

    /**
     * Sets the error callback.
     *
     * @return The previously set callback, or {@link MemorySegment#NULL NULL} if no callback was set.
     */
    default MemorySegment set() {
        return GLFW.INSTANCE.setErrorCallback(this);
    }

    @Override
    default MemorySegment stub(Arena arena) {
        return TYPE.of(arena, this);
    }
}
