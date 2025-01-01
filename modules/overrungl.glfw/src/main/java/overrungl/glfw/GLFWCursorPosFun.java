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

/// The function pointer type for cursor position callbacks.
/// 
/// This is the function pointer type for cursor position callbacks.  A cursor
/// position callback function has the following signature:
/// ```java
/// void function_name(MemorySegment window, double xpos, double ypos);
/// ```
/// 
/// @see GLFW#glfwSetCursorPosCallback(MemorySegment, MemorySegment)
@FunctionalInterface
public interface GLFWCursorPosFun extends Upcall {
    /// The function descriptor.
    FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE);
    /// The method handle of the target method.
    MethodHandle HANDLE = Upcall.findTarget(GLFWCursorPosFun.class, "invoke", DESCRIPTOR);

    ///The target method of the upcall.
    ///
    ///Invoke
    ///
    ///@param window The window that received the event.
    ///@param xpos The new cursor x-coordinate, relative to the left edge of
    ///the content area.
    ///@param ypos The new cursor y-coordinate, relative to the top edge of the
    ///content area.
    void invoke(@CType("GLFWwindow*") java.lang.foreign.MemorySegment window, @CType("double") double xpos, @CType("double") double ypos);

    @Override
    default MemorySegment stub(Arena arena) { return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, arena); }

    ///A static invoker of the target method.
    ///
    ///Invoke
    ///
    ///@param window The window that received the event.
    ///@param xpos The new cursor x-coordinate, relative to the left edge of
    ///the content area.
    ///@param ypos The new cursor y-coordinate, relative to the top edge of the
    ///content area.
    ///@param stub the upcall stub
    static void invoke(MemorySegment stub, @CType("GLFWwindow*") java.lang.foreign.MemorySegment window, @CType("double") double xpos, @CType("double") double ypos) {
        try { HANDLE.invokeExact(stub, window, xpos, ypos); }
        catch (Throwable e) { throw new RuntimeException("error in GLFWCursorPosFun::invoke (static invoker)", e); }
    }

    /// A wrapper for the target method.
    /// @param stub the upcall stub
    /// @return an instance that wraps the static invoker
    static GLFWCursorPosFun wrap(MemorySegment stub) {
        return (window, xpos, ypos) ->
            invoke(stub, window, xpos, ypos);
    }
}
