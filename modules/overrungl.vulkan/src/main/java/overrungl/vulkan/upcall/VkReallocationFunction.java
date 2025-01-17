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
package overrungl.vulkan.upcall;

import java.lang.foreign.*;
import java.lang.invoke.*;
import overrungl.annotation.*;
import overrungl.upcall.*;
import overrungl.util.*;

@FunctionalInterface
public interface VkReallocationFunction extends Upcall {
    /// The function descriptor.
    FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT);
    /// The method handle of the target method.
    MethodHandle HANDLE = Upcall.findTarget(VkReallocationFunction.class, "invoke", DESCRIPTOR);

    /// The target method of the upcall.
    @CType("void *") java.lang.foreign.MemorySegment invoke(@CType("void *") java.lang.foreign.MemorySegment pUserData, @CType("void *") java.lang.foreign.MemorySegment pOriginal, @CType("size_t") long size, @CType("size_t") long alignment, @CType("VkSystemAllocationScope") int allocationScope);

    @Override
    default MemorySegment stub(Arena arena) { return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, arena); }

    /// A static invoker of the target method.
    /// @param stub the upcall stub
    static @CType("void *") java.lang.foreign.MemorySegment invoke(MemorySegment stub, @CType("void *") java.lang.foreign.MemorySegment pUserData, @CType("void *") java.lang.foreign.MemorySegment pOriginal, @CType("size_t") long size, @CType("size_t") long alignment, @CType("VkSystemAllocationScope") int allocationScope) {
        try { return (java.lang.foreign.MemorySegment) HANDLE.invokeExact(stub, pUserData, pOriginal, size, alignment, allocationScope); }
        catch (Throwable e) { throw new RuntimeException("error in VkReallocationFunction::invoke (static invoker)", e); }
    }

    /// A wrapper for the target method.
    /// @param stub the upcall stub
    /// @return an instance that wraps the static invoker
    static VkReallocationFunction wrap(MemorySegment stub) {
        return (pUserData, pOriginal, size, alignment, allocationScope) ->
            invoke(stub, pUserData, pOriginal, size, alignment, allocationScope);
    }
}
