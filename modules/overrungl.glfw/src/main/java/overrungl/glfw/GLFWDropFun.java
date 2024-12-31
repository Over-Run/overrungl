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
import io.github.overrun.memstack.MemoryStack;

/// The function pointer type for path drop callbacks.
/// 
/// This is the function pointer type for path drop callbacks.  A path drop
/// callback function has the following signature:
/// ```
/// void function_name(MemorySegment window, String[] paths)
/// ```
/// 
/// TODO
/// @see GLFW#glfwSetDropCallback()
@FunctionalInterface
public interface GLFWDropFun extends Upcall {
    /// The function descriptor.
    FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
    /// The method handle of the target method.
    MethodHandle HANDLE = Upcall.findTarget(GLFWDropFun.class, "invoke", DESCRIPTOR);

    ///The interface target method of the upcall.
    ///
    ///Invoke
    ///
    ///@param window The window that received the event.
    ///@param paths The UTF-8 encoded file and/or directory path names.
    ///
    ///@glfw.pointer_lifetime The path array and its strings are valid until the
    ///callback function returns.
    void invoke(@CType("GLFWwindow*") java.lang.foreign.MemorySegment window, java.lang.String[] paths);

    ///The target method of the upcall.
    ///
    ///Invoke
    ///
    ///@param window The window that received the event.
    ///@param path_count The number of dropped paths.
    ///@param paths The UTF-8 encoded file and/or directory path names.
    ///
    ///@glfw.pointer_lifetime The path array and its strings are valid until the
    ///callback function returns.
    default void invoke(@CType("GLFWwindow*") java.lang.foreign.MemorySegment window, @CType("int") int path_count, java.lang.foreign.MemorySegment paths) {
        var a = new String[path_count];
        Unmarshal.copy(paths, a);
        invoke(window, a);
    }

    @Override
    default MemorySegment stub(Arena arena) { return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, arena); }

    ///A static invoker of the target method.
    ///
    ///Invoke
    ///
    ///@param window The window that received the event.
    ///@param path_count The number of dropped paths.
    ///@param paths The UTF-8 encoded file and/or directory path names.
    ///
    ///@glfw.pointer_lifetime The path array and its strings are valid until the
    ///callback function returns.
    ///@param stub the upcall stub
    static void invoke(MemorySegment stub, @CType("GLFWwindow*") java.lang.foreign.MemorySegment window, @CType("int") int path_count, java.lang.foreign.MemorySegment paths) {
        try { HANDLE.invokeExact(stub, window, path_count, paths); }
        catch (Throwable e) { throw new RuntimeException("error in GLFWDropFun::invoke (static invoker)", e); }
    }

    /// A wrapper for the target method.
    /// @param stub the upcall stub
    /// @return an instance that wraps the static invoker
    static GLFWDropFun wrap(MemorySegment stub) {
        return (window, paths) -> { try (var stack = MemoryStack.pushLocal()) {
            invoke(stub, window, paths.length, Marshal.marshal(stack, paths));
        } };
    }
}
