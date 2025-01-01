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

/// The function pointer type for joystick configuration callbacks.
/// 
/// This is the function pointer type for joystick configuration callbacks.
/// A joystick configuration callback function has the following signature:
/// ```java
/// void function_name(int jid, int event)
/// ```
/// 
/// @see GLFW#glfwSetJoystickCallback(MemorySegment)
@FunctionalInterface
public interface GLFWJoystickFun extends Upcall {
    /// The function descriptor.
    FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
    /// The method handle of the target method.
    MethodHandle HANDLE = Upcall.findTarget(GLFWJoystickFun.class, "invoke", DESCRIPTOR);

    ///The target method of the upcall.
    ///
    ///Invoke
    ///
    ///@param jid The joystick that was connected or disconnected.
    ///@param event One of `GLFW_CONNECTED` or `GLFW_DISCONNECTED`.  Future
    ///releases may add more events.
    void invoke(@CType("int") int jid, @CType("int") int event);

    @Override
    default MemorySegment stub(Arena arena) { return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, arena); }

    ///A static invoker of the target method.
    ///
    ///Invoke
    ///
    ///@param jid The joystick that was connected or disconnected.
    ///@param event One of `GLFW_CONNECTED` or `GLFW_DISCONNECTED`.  Future
    ///releases may add more events.
    ///@param stub the upcall stub
    static void invoke(MemorySegment stub, @CType("int") int jid, @CType("int") int event) {
        try { HANDLE.invokeExact(stub, jid, event); }
        catch (Throwable e) { throw new RuntimeException("error in GLFWJoystickFun::invoke (static invoker)", e); }
    }

    /// A wrapper for the target method.
    /// @param stub the upcall stub
    /// @return an instance that wraps the static invoker
    static GLFWJoystickFun wrap(MemorySegment stub) {
        return (jid, event) ->
            invoke(stub, jid, event);
    }
}
