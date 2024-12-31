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

/// The function pointer type for memory allocation callbacks.
/// 
/// This is the function pointer type for memory allocation callbacks.  A memory
/// allocation callback function has the following signature:
/// ```java
/// MemorySegment function_name(long size, MemorySegment user)
/// ```
/// 
/// @see GLFWAllocator
@FunctionalInterface
public interface GLFWAllocateFun extends Upcall {
    /// The function descriptor.
    FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS);
    /// The method handle of the target method.
    MethodHandle HANDLE = Upcall.findTarget(GLFWAllocateFun.class, "invoke", DESCRIPTOR);

    ///The target method of the upcall.
    ///
    ///This function must return either a memory block at least `size` bytes long,
    ///or `NULL` if allocation failed.  Note that not all parts of GLFW handle allocation
    ///failures gracefully yet.
    ///
    ///This function must support being called during [glfwInit][GLFW#glfwInit()] but before the library is
    ///flagged as initialized, as well as during [glfwTerminate][GLFW#glfwTerminate()] after the library is no
    ///longer flagged as initialized.
    ///
    ///Any memory allocated via this function will be deallocated via the same allocator
    ///during library termination or earlier.
    ///
    ///Any memory allocated via this function must be suitably aligned for any object type.
    ///If you are using C99 or earlier, this alignment is platform-dependent but will be the
    ///same as what `malloc` provides.  If you are using C11 or later, this is the value of
    ///`alignof(max_align_t)`.
    ///
    ///The size will always be greater than zero.  Allocations of size zero are filtered out
    ///before reaching the custom allocator.
    ///
    ///If this function returns `NULL`, GLFW will emit [GLFW_OUT_OF_MEMORY][GLFW#GLFW_OUT_OF_MEMORY].
    ///
    ///This function must not call any GLFW function.
    ///
    ///@param size The minimum size, in bytes, of the memory block.
    ///@param user The user-defined pointer from the allocator.
    ///@return The address of the newly allocated memory block, or `NULL` if an
    ///error occurred.
    ///
    ///@glfw.pointer_lifetime The returned memory block must be valid at least until it
    ///is deallocated.
    ///
    ///@glfw.reentrancy This function should not call any GLFW function.
    ///
    ///@glfw.thread_safety This function must support being called from any thread that calls GLFW
    ///functions.
    @CType("void*") java.lang.foreign.MemorySegment invoke(@CType("size_t") long size, @CType("void*") java.lang.foreign.MemorySegment user);

    @Override
    default MemorySegment stub(Arena arena) { return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, arena); }

    ///A static invoker of the target method.
    ///
    ///This function must return either a memory block at least `size` bytes long,
    ///or `NULL` if allocation failed.  Note that not all parts of GLFW handle allocation
    ///failures gracefully yet.
    ///
    ///This function must support being called during [glfwInit][GLFW#glfwInit()] but before the library is
    ///flagged as initialized, as well as during [glfwTerminate][GLFW#glfwTerminate()] after the library is no
    ///longer flagged as initialized.
    ///
    ///Any memory allocated via this function will be deallocated via the same allocator
    ///during library termination or earlier.
    ///
    ///Any memory allocated via this function must be suitably aligned for any object type.
    ///If you are using C99 or earlier, this alignment is platform-dependent but will be the
    ///same as what `malloc` provides.  If you are using C11 or later, this is the value of
    ///`alignof(max_align_t)`.
    ///
    ///The size will always be greater than zero.  Allocations of size zero are filtered out
    ///before reaching the custom allocator.
    ///
    ///If this function returns `NULL`, GLFW will emit [GLFW_OUT_OF_MEMORY][GLFW#GLFW_OUT_OF_MEMORY].
    ///
    ///This function must not call any GLFW function.
    ///
    ///@param size The minimum size, in bytes, of the memory block.
    ///@param user The user-defined pointer from the allocator.
    ///@return The address of the newly allocated memory block, or `NULL` if an
    ///error occurred.
    ///
    ///@glfw.pointer_lifetime The returned memory block must be valid at least until it
    ///is deallocated.
    ///
    ///@glfw.reentrancy This function should not call any GLFW function.
    ///
    ///@glfw.thread_safety This function must support being called from any thread that calls GLFW
    ///functions.
    ///@param stub the upcall stub
    static @CType("void*") java.lang.foreign.MemorySegment invoke(MemorySegment stub, @CType("size_t") long size, @CType("void*") java.lang.foreign.MemorySegment user) {
        try { return (java.lang.foreign.MemorySegment) HANDLE.invokeExact(stub, size, user); }
        catch (Throwable e) { throw new RuntimeException("error in GLFWAllocateFun::invoke (static invoker)", e); }
    }

    /// A wrapper for the target method.
    /// @param stub the upcall stub
    /// @return an instance that wraps the static invoker
    static GLFWAllocateFun wrap(MemorySegment stub) {
        return (size, user) ->
            invoke(stub, size, user);
    }
}
