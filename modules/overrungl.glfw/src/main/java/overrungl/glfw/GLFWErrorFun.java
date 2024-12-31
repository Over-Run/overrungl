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

// This file is auto-generated. DO NOT EDIT!
package overrungl.glfw;

import java.lang.foreign.*;
import java.lang.invoke.*;
import overrungl.annotation.*;
import overrungl.upcall.*;
import overrungl.util.*;

/// The function pointer type for error callbacks.
/// 
/// This is the function pointer type for error callbacks.  An error callback
/// function has the following signature:
/// ```java
/// void callback_name(int error_code, String description)
/// ```
/// 
/// @see GLFW#glfwSetErrorCallback(MemorySegment)
@FunctionalInterface
public interface GLFWErrorFun extends Upcall {
    /// The function descriptor.
    FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, Unmarshal.STR_LAYOUT);
    /// The method handle of the target method.
    MethodHandle HANDLE = Upcall.findTarget(GLFWErrorFun.class, "invoke", DESCRIPTOR);

    ///The interface target method of the upcall.
    ///
    ///Invoke
    ///
    ///@param error_code An error code.  Future releases may add
    ///more error codes.
    ///@param description A UTF-8 encoded string describing the error.
    ///
    ///@glfw.pointer_lifetime The error description string is valid until the callback
    ///function returns.
    void invoke(@CType("int") int error_code, @CType("const char*") java.lang.String description);

    ///The target method of the upcall.
    ///
    ///Invoke
    ///
    ///@param error_code An error code.  Future releases may add
    ///more error codes.
    ///@param description A UTF-8 encoded string describing the error.
    ///
    ///@glfw.pointer_lifetime The error description string is valid until the callback
    ///function returns.
    default void invoke(@CType("int") int error_code, @CType("const char*") java.lang.foreign.MemorySegment description) {
        invoke(error_code, Unmarshal.unmarshalAsString(description));
    }

    @Override
    default MemorySegment stub(Arena arena) { return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, arena); }

    ///A static invoker of the target method.
    ///
    ///Invoke
    ///
    ///@param error_code An error code.  Future releases may add
    ///more error codes.
    ///@param description A UTF-8 encoded string describing the error.
    ///
    ///@glfw.pointer_lifetime The error description string is valid until the callback
    ///function returns.
    ///@param stub the upcall stub
    static void invoke(MemorySegment stub, @CType("int") int error_code, @CType("const char*") java.lang.foreign.MemorySegment description) {
        try { HANDLE.invokeExact(stub, error_code, description); }
        catch (Throwable e) { throw new RuntimeException("error in GLFWErrorFun::invoke (static invoker)", e); }
    }

    /// A wrapper for the target method.
    /// @param stub the upcall stub
    /// @return an instance that wraps the static invoker
    static GLFWErrorFun wrap(MemorySegment stub) {
        return (error_code, description) -> { try (var __overrungl_stack = MemoryStack.pushLocal()) {
            invoke(stub, error_code, Marshal.marshal(__overrungl_stack, description));
        } };
    }
}
