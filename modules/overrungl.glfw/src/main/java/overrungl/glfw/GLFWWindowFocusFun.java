/*
 * MIT License
 *
 * Copyright (c) 2022-2025 Overrun Organization
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

/// The function pointer type for window focus callbacks.
/// 
/// This is the function pointer type for window focus callbacks.  A window
/// focus callback function has the following signature:
/// ```java
/// void function_name(MemorySegment window, boolean focused)
/// ```
/// 
/// @see GLFW#glfwSetWindowFocusCallback(MemorySegment, MemorySegment)
@FunctionalInterface
public interface GLFWWindowFocusFun extends Upcall {
    /// The function descriptor.
    FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT);
    /// The method handle of the target method.
    MethodHandle HANDLE = Upcall.findTarget(GLFWWindowFocusFun.class, "invoke", DESCRIPTOR);

    ///The interface target method of the upcall.
    ///
    ///Invoke
    ///
    ///@param window The window that gained or lost input focus.
    ///@param focused `true` if the window was given input focus, or
    ///`false` if it lost it.
    void invoke(@CType("GLFWwindow*") java.lang.foreign.MemorySegment window, @CType("int") boolean focused);

    ///The target method of the upcall.
    ///
    ///Invoke
    ///
    ///@param window The window that gained or lost input focus.
    ///@param focused `GLFW_TRUE` if the window was given input focus, or
    ///`GLFW_FALSE` if it lost it.
    default void invoke(@CType("GLFWwindow*") java.lang.foreign.MemorySegment window, @CType("int") int focused) {
        invoke(window, focused != GLFW.GLFW_FALSE);
    }

    @Override
    default MemorySegment stub(Arena arena) { return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, arena); }

    ///A static invoker of the target method.
    ///
    ///Invoke
    ///
    ///@param window The window that gained or lost input focus.
    ///@param focused `GLFW_TRUE` if the window was given input focus, or
    ///`GLFW_FALSE` if it lost it.
    ///@param stub the upcall stub
    static void invoke(MemorySegment stub, @CType("GLFWwindow*") java.lang.foreign.MemorySegment window, @CType("int") int focused) {
        try { HANDLE.invokeExact(stub, window, focused); }
        catch (Throwable e) { throw new RuntimeException("error in GLFWWindowFocusFun::invoke (static invoker)", e); }
    }

    /// A wrapper for the target method.
    /// @param stub the upcall stub
    /// @return an instance that wraps the static invoker
    static GLFWWindowFocusFun wrap(MemorySegment stub) {
        return (window, focused) ->
            invoke(stub, window, focused ? GLFW.GLFW_TRUE : GLFW.GLFW_FALSE);
    }
}
