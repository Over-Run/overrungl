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
public interface GLFWReallocateFun extends Upcall {
    /// The function descriptor.
    FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS);
    /// The method handle of the target method.
    MethodHandle HANDLE = Upcall.findTarget(GLFWReallocateFun.class, "invoke", DESCRIPTOR);

    /// The target method of the upcall.
    @CType("void*") MemorySegment invoke(@CType("void*") MemorySegment block, @CType("size_t") long size, @CType("void*") MemorySegment user);

    @Override
    default MemorySegment stub(Arena arena) { return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, arena); }

    /// A static invoker of the target method.
    /// @param stub the upcall stub
    static @CType("void*") MemorySegment invoke(MemorySegment stub, @CType("void*") MemorySegment block, @CType("size_t") long size, @CType("void*") MemorySegment user) {
        try { return (MemorySegment) HANDLE.invokeExact(stub, block, size, user); }
        catch (Throwable e) { throw new RuntimeException("error in GLFWReallocateFun::invoke (static invoker)", e); }
    }

    /// A wrapper for the target method.
    /// @param stub the upcall stub
    /// @return an instance that wraps the static invoker
    static GLFWReallocateFun wrap(MemorySegment stub) {
        return (block, size, user) ->
            invoke(stub, block, size, user);
    }
}
