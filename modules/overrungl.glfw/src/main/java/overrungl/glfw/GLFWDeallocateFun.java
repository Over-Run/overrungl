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

/// The function pointer type for memory deallocation callbacks.
/// 
/// This is the function pointer type for memory deallocation callbacks.
/// A memory deallocation callback function has the following signature:
/// ```java
/// void function_name(MemorySegment block, MemorySegment user)
/// ```
/// 
/// @see GLFWAllocator
@FunctionalInterface
public interface GLFWDeallocateFun extends Upcall {
    /// The function descriptor.
    FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
    /// The method handle of the target method.
    MethodHandle HANDLE = Upcall.findTarget(GLFWDeallocateFun.class, "invoke", DESCRIPTOR);

    ///The target method of the upcall.
    ///
    ///This function may deallocate the specified memory block.  This memory block
    ///will have been allocated with the same allocator.
    ///
    ///This function must support being called during [glfwInit][GLFW#glfwInit()] but before the library is
    ///flagged as initialized, as well as during [glfwTerminate][GLFW#glfwTerminate()] after the library is no
    ///longer flagged as initialized.
    ///
    ///The block address will never be `NULL`.  Deallocations of `NULL` are filtered out
    ///before reaching the custom allocator.
    ///
    ///If this function returns `NULL`, GLFW will emit [GLFW_OUT_OF_MEMORY][GLFW#GLFW_OUT_OF_MEMORY].
    ///
    ///This function must not call any GLFW function.
    ///
    ///@param block The address of the memory block to deallocate.
    ///@param user The user-defined pointer from the allocator.
    ///
    ///@glfw.pointer_lifetime The specified memory block will not be accessed by GLFW
    ///after this function is called.
    ///
    ///@glfw.reentrancy This function should not call any GLFW function.
    ///
    ///@glfw.thread_safety This function must support being called from any thread that calls GLFW
    ///functions.
    void invoke(@CType("void*") java.lang.foreign.MemorySegment block, @CType("void*") java.lang.foreign.MemorySegment user);

    @Override
    default MemorySegment stub(Arena arena) { return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, arena); }

    ///A static invoker of the target method.
    ///
    ///This function may deallocate the specified memory block.  This memory block
    ///will have been allocated with the same allocator.
    ///
    ///This function must support being called during [glfwInit][GLFW#glfwInit()] but before the library is
    ///flagged as initialized, as well as during [glfwTerminate][GLFW#glfwTerminate()] after the library is no
    ///longer flagged as initialized.
    ///
    ///The block address will never be `NULL`.  Deallocations of `NULL` are filtered out
    ///before reaching the custom allocator.
    ///
    ///If this function returns `NULL`, GLFW will emit [GLFW_OUT_OF_MEMORY][GLFW#GLFW_OUT_OF_MEMORY].
    ///
    ///This function must not call any GLFW function.
    ///
    ///@param block The address of the memory block to deallocate.
    ///@param user The user-defined pointer from the allocator.
    ///
    ///@glfw.pointer_lifetime The specified memory block will not be accessed by GLFW
    ///after this function is called.
    ///
    ///@glfw.reentrancy This function should not call any GLFW function.
    ///
    ///@glfw.thread_safety This function must support being called from any thread that calls GLFW
    ///functions.
    ///@param stub the upcall stub
    static void invoke(MemorySegment stub, @CType("void*") java.lang.foreign.MemorySegment block, @CType("void*") java.lang.foreign.MemorySegment user) {
        try { HANDLE.invokeExact(stub, block, user); }
        catch (Throwable e) { throw new RuntimeException("error in GLFWDeallocateFun::invoke (static invoker)", e); }
    }

    /// A wrapper for the target method.
    /// @param stub the upcall stub
    /// @return an instance that wraps the static invoker
    static GLFWDeallocateFun wrap(MemorySegment stub) {
        return (block, user) ->
            invoke(stub, block, user);
    }
}
