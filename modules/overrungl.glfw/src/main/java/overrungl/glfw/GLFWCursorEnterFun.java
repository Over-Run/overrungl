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

/// The function pointer type for cursor enter/leave callbacks.
/// 
/// This is the function pointer type for cursor enter/leave callbacks.
/// A cursor enter/leave callback function has the following signature:
/// ```java
/// void function_name(MemorySegment window, boolean entered)
/// ```
/// 
/// TODO
/// @see GLFW#glfwSetCursorEnterCallback()
@FunctionalInterface
public interface GLFWCursorEnterFun extends Upcall {
    /// The function descriptor.
    FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT);
    /// The method handle of the target method.
    MethodHandle HANDLE = Upcall.findTarget(GLFWCursorEnterFun.class, "invoke", DESCRIPTOR);

    ///The interface target method of the upcall.
    ///
    ///Invoke
    ///
    ///@param window The window that received the event.
    ///@param entered `GLFW_TRUE` if the cursor entered the window's content
    ///area, or `GLFW_FALSE` if it left it.
    void invoke(@CType("GLFWwindow*") java.lang.foreign.MemorySegment window, @CType("int") boolean entered);

    ///The target method of the upcall.
    ///
    ///Invoke
    ///
    ///@param window The window that received the event.
    ///@param entered `GLFW_TRUE` if the cursor entered the window's content
    ///area, or `GLFW_FALSE` if it left it.
    default void invoke(@CType("GLFWwindow*") java.lang.foreign.MemorySegment window, @CType("int") int entered) {
        invoke(window, entered != GLFW.GLFW_FALSE);
    }

    @Override
    default MemorySegment stub(Arena arena) { return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, arena); }

    ///A static invoker of the target method.
    ///
    ///Invoke
    ///
    ///@param window The window that received the event.
    ///@param entered `GLFW_TRUE` if the cursor entered the window's content
    ///area, or `GLFW_FALSE` if it left it.
    ///@param stub the upcall stub
    static void invoke(MemorySegment stub, @CType("GLFWwindow*") java.lang.foreign.MemorySegment window, @CType("int") int entered) {
        try { HANDLE.invokeExact(stub, window, entered); }
        catch (Throwable e) { throw new RuntimeException("error in GLFWCursorEnterFun::invoke (static invoker)", e); }
    }

    /// A wrapper for the target method.
    /// @param stub the upcall stub
    /// @return an instance that wraps the static invoker
    static GLFWCursorEnterFun wrap(MemorySegment stub) {
        return (window, entered) ->
            invoke(stub, window, entered ? GLFW.GLFW_TRUE : GLFW.GLFW_FALSE);
    }
}
