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

/// The function pointer type for window size callbacks.
/// 
/// This is the function pointer type for window size callbacks.  A window size
/// callback function has the following signature:
/// ```java
/// void callback_name(MemorySegment window, int width, int height)
/// ```
/// 
/// TODO
/// @see GLFW#glfwSetWindowSizeCallback()
@FunctionalInterface
public interface GLFWWindowSizeFun extends Upcall {
    /// The function descriptor.
    FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
    /// The method handle of the target method.
    MethodHandle HANDLE = Upcall.findTarget(GLFWWindowSizeFun.class, "invoke", DESCRIPTOR);

    ///The target method of the upcall.
    ///
    ///Invoke
    ///
    ///@param window The window that was resized.
    ///@param width The new width, in screen coordinates, of the window.
    ///@param height The new height, in screen coordinates, of the window.
    void invoke(@CType("GLFWwindow*") java.lang.foreign.MemorySegment window, @CType("int") int width, @CType("int") int height);

    @Override
    default MemorySegment stub(Arena arena) { return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, arena); }

    ///A static invoker of the target method.
    ///
    ///Invoke
    ///
    ///@param window The window that was resized.
    ///@param width The new width, in screen coordinates, of the window.
    ///@param height The new height, in screen coordinates, of the window.
    ///@param stub the upcall stub
    static void invoke(MemorySegment stub, @CType("GLFWwindow*") java.lang.foreign.MemorySegment window, @CType("int") int width, @CType("int") int height) {
        try { HANDLE.invokeExact(stub, window, width, height); }
        catch (Throwable e) { throw new RuntimeException("error in GLFWWindowSizeFun::invoke (static invoker)", e); }
    }

    /// A wrapper for the target method.
    /// @param stub the upcall stub
    /// @return an instance that wraps the static invoker
    static GLFWWindowSizeFun wrap(MemorySegment stub) {
        return (window, width, height) ->
            invoke(stub, window, width, height);
    }
}
