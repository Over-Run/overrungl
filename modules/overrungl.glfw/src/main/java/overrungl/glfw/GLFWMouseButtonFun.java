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

/// The function pointer type for mouse button callbacks.
/// 
/// This is the function pointer type for mouse button callback functions.
/// A mouse button callback function has the following signature:
/// ```java
/// void function_name(MemorySegment window, int button, int action, int mods)
/// ```
/// 
/// @see GLFW#glfwSetMouseButtonCallback(MemorySegment, MemorySegment)
@FunctionalInterface
public interface GLFWMouseButtonFun extends Upcall {
    /// The function descriptor.
    FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
    /// The method handle of the target method.
    MethodHandle HANDLE = Upcall.findTarget(GLFWMouseButtonFun.class, "invoke", DESCRIPTOR);

    ///The target method of the upcall.
    ///
    ///Invoke
    ///
    ///@param window The window that received the event.
    ///@param button The mouse button that was pressed or
    ///released.
    ///@param action One of `GLFW_PRESS` or `GLFW_RELEASE`.  Future releases
    ///may add more actions.
    ///@param mods Bit field describing which modifier keys were
    ///held down.
    void invoke(@CType("GLFWwindow*") java.lang.foreign.MemorySegment window, @CType("int") int button, @CType("int") int action, @CType("int") int mods);

    @Override
    default MemorySegment stub(Arena arena) { return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, arena); }

    ///A static invoker of the target method.
    ///
    ///Invoke
    ///
    ///@param window The window that received the event.
    ///@param button The mouse button that was pressed or
    ///released.
    ///@param action One of `GLFW_PRESS` or `GLFW_RELEASE`.  Future releases
    ///may add more actions.
    ///@param mods Bit field describing which modifier keys were
    ///held down.
    ///@param stub the upcall stub
    static void invoke(MemorySegment stub, @CType("GLFWwindow*") java.lang.foreign.MemorySegment window, @CType("int") int button, @CType("int") int action, @CType("int") int mods) {
        try { HANDLE.invokeExact(stub, window, button, action, mods); }
        catch (Throwable e) { throw new RuntimeException("error in GLFWMouseButtonFun::invoke (static invoker)", e); }
    }

    /// A wrapper for the target method.
    /// @param stub the upcall stub
    /// @return an instance that wraps the static invoker
    static GLFWMouseButtonFun wrap(MemorySegment stub) {
        return (window, button, action, mods) ->
            invoke(stub, window, button, action, mods);
    }
}
