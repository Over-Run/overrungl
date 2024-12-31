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

/// The function pointer type for window content scale callbacks.
/// 
/// This is the function pointer type for window content scale callbacks.
/// A window content scale callback function has the following signature:
/// ```java
/// void function_name(MemorySegment window, float xscale, float yscale)
/// ```
/// 
/// @see GLFW#glfwSetWindowContentScaleCallback()
@FunctionalInterface
public interface GLFWWindowContentScaleFun extends Upcall {
    /// The function descriptor.
    FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT);
    /// The method handle of the target method.
    MethodHandle HANDLE = Upcall.findTarget(GLFWWindowContentScaleFun.class, "invoke", DESCRIPTOR);

    ///The target method of the upcall.
    ///
    ///Invoke
    ///
    ///@param window The window whose content scale changed.
    ///@param xscale The new x-axis content scale of the window.
    ///@param yscale The new y-axis content scale of the window.
    void invoke(@CType("GLFWwindow*") java.lang.foreign.MemorySegment window, @CType("float") float xscale, @CType("float") float yscale);

    @Override
    default MemorySegment stub(Arena arena) { return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, arena); }

    ///A static invoker of the target method.
    ///
    ///Invoke
    ///
    ///@param window The window whose content scale changed.
    ///@param xscale The new x-axis content scale of the window.
    ///@param yscale The new y-axis content scale of the window.
    ///@param stub the upcall stub
    static void invoke(MemorySegment stub, @CType("GLFWwindow*") java.lang.foreign.MemorySegment window, @CType("float") float xscale, @CType("float") float yscale) {
        try { HANDLE.invokeExact(stub, window, xscale, yscale); }
        catch (Throwable e) { throw new RuntimeException("error in GLFWWindowContentScaleFun::invoke (static invoker)", e); }
    }

    /// A wrapper for the target method.
    /// @param stub the upcall stub
    /// @return an instance that wraps the static invoker
    static GLFWWindowContentScaleFun wrap(MemorySegment stub) {
        return (window, xscale, yscale) ->
            invoke(stub, window, xscale, yscale);
    }
}
