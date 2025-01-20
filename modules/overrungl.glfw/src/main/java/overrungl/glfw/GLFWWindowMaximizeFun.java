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

@FunctionalInterface
public interface GLFWWindowMaximizeFun extends Upcall {
    /// The function descriptor.
    FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT);
    /// The method handle of the target method.
    MethodHandle HANDLE = Upcall.findTarget(GLFWWindowMaximizeFun.class, "invoke", DESCRIPTOR);

    /// The interface target method of the upcall.
    void invoke(@CType("GLFWwindow*") MemorySegment window, @CType("int") boolean maximized);

    /// The target method of the upcall.
    default void invoke(@CType("GLFWwindow*") MemorySegment window, @CType("int") int maximized) {
        invoke(window, maximized != GLFW.GLFW_FALSE);
    }

    @Override
    default MemorySegment stub(Arena arena) { return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, arena); }

    /// A static invoker of the target method.
    /// @param stub the upcall stub
    static void invoke(MemorySegment stub, @CType("GLFWwindow*") MemorySegment window, @CType("int") int maximized) {
        try { HANDLE.invokeExact(stub, window, maximized); }
        catch (Throwable e) { throw new RuntimeException("error in GLFWWindowMaximizeFun::invoke (static invoker)", e); }
    }

    /// A wrapper for the target method.
    /// @param stub the upcall stub
    /// @return an instance that wraps the static invoker
    static GLFWWindowMaximizeFun wrap(MemorySegment stub) {
        return (window, maximized) ->
            invoke(stub, window, maximized ? GLFW.GLFW_TRUE : GLFW.GLFW_FALSE);
    }
}
