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

/// The function pointer type for window iconify callbacks.
/// 
/// This is the function pointer type for window iconify callbacks.  A window
/// iconify callback function has the following signature:
/// ```java
/// void function_name(MemorySegment window, boolean iconified)
/// ```
/// 
/// @see GLFW#glfwSetWindowIconifyCallback(MemorySegment, MemorySegment)
@FunctionalInterface
public interface GLFWWindowIconifyFun extends Upcall {
    /// The function descriptor.
    FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT);
    /// The method handle of the target method.
    MethodHandle HANDLE = Upcall.findTarget(GLFWWindowIconifyFun.class, "invoke", DESCRIPTOR);

    ///The interface target method of the upcall.
    ///
    ///Invoke
    ///
    ///@param window The window that was iconified or restored.
    ///@param iconified `true` if the window was iconified, or
    ///`false` if it was restored.
    void invoke(@CType("GLFWwindow*") java.lang.foreign.MemorySegment window, @CType("int") boolean iconified);

    ///The target method of the upcall.
    ///
    ///Invoke
    ///
    ///@param window The window that was iconified or restored.
    ///@param iconified `GLFW_TRUE` if the window was iconified, or
    ///`GLFW_FALSE` if it was restored.
    default void invoke(@CType("GLFWwindow*") java.lang.foreign.MemorySegment window, @CType("int") int iconified) {
        invoke(window, iconified != GLFW.GLFW_FALSE);
    }

    @Override
    default MemorySegment stub(Arena arena) { return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, arena); }

    ///A static invoker of the target method.
    ///
    ///Invoke
    ///
    ///@param window The window that was iconified or restored.
    ///@param iconified `GLFW_TRUE` if the window was iconified, or
    ///`GLFW_FALSE` if it was restored.
    ///@param stub the upcall stub
    static void invoke(MemorySegment stub, @CType("GLFWwindow*") java.lang.foreign.MemorySegment window, @CType("int") int iconified) {
        try { HANDLE.invokeExact(stub, window, iconified); }
        catch (Throwable e) { throw new RuntimeException("error in GLFWWindowIconifyFun::invoke (static invoker)", e); }
    }

    /// A wrapper for the target method.
    /// @param stub the upcall stub
    /// @return an instance that wraps the static invoker
    static GLFWWindowIconifyFun wrap(MemorySegment stub) {
        return (window, iconified) ->
            invoke(stub, window, iconified ? GLFW.GLFW_TRUE : GLFW.GLFW_FALSE);
    }
}
