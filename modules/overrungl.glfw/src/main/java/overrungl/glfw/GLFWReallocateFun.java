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
//@formatter:off
package overrungl.glfw;

import java.lang.foreign.*;
import java.lang.invoke.*;
import overrungl.internal.*;
import overrungl.upcall.*;
import overrungl.util.*;

/// ```
/// typedef void* (*GLFWReallocateFun)(void* block, size_t size, void* user);
/// ```
@FunctionalInterface
public interface GLFWReallocateFun extends Upcall {
    /// The function descriptor.
    FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, CanonicalTypes.SIZE_T, ValueLayout.ADDRESS);
    /// The method handle of the target method.
    MethodHandle HANDLE = Upcall.findTarget(GLFWReallocateFun.class, RuntimeHelper.upcallTarget("invoke", DESCRIPTOR), DESCRIPTOR);

    /// Allocates `GLFWReallocateFun`.
    /// @param arena the arena
    /// @param func  the function
    /// @return the upcall stub
    static MemorySegment alloc(Arena arena, GLFWReallocateFun func) {
        if (func == null) return MemorySegment.NULL;
        return func.stub(arena);
    }

    /// The target method of the upcall.
    MemorySegment invoke(MemorySegment block, long size, MemorySegment user);

    /// The target method of the upcall. Chosen at runtime.
    default MemorySegment invokePPIP(MemorySegment block, int size, MemorySegment user) {
        return invoke(block, MemoryUtil.wideningToLong(CanonicalTypes.SIZE_T, size), user);
    }

    /// The target method of the upcall. Chosen at runtime.
    default MemorySegment invokePPJP(MemorySegment block, long size, MemorySegment user) {
        return invoke(block, MemoryUtil.wideningToLong(CanonicalTypes.SIZE_T, size), user);
    }

    @Override
    default MemorySegment stub(Arena arena) { return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, arena); }

}
