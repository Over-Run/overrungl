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
package overrungl.vulkan.upcall;

import java.lang.foreign.*;
import java.lang.invoke.*;
import overrungl.internal.*;
import overrungl.upcall.*;
import overrungl.util.*;

/// ```
/// typedef void* (*VkReallocationFunction)(void* pUserData, void* pOriginal, size_t size, size_t alignment, VkSystemAllocationScope allocationScope);
/// ```
@FunctionalInterface
public interface VkReallocationFunction extends Upcall {
    /// The function descriptor.
    FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, CanonicalTypes.SIZE_T, CanonicalTypes.SIZE_T, ValueLayout.JAVA_INT);
    /// The method handle of the target method.
    MethodHandle HANDLE = Upcall.findTarget(VkReallocationFunction.class, RuntimeHelper.upcallTarget("invoke", DESCRIPTOR), DESCRIPTOR);

    /// Allocates `VkReallocationFunction`.
    /// @param arena the arena
    /// @param func  the function
    /// @return the upcall stub
    static MemorySegment alloc(Arena arena, VkReallocationFunction func) {
        if (func == null) return MemorySegment.NULL;
        return func.stub(arena);
    }

    /// The target method of the upcall.
    MemorySegment invoke(MemorySegment pUserData, MemorySegment pOriginal, long size, long alignment, int allocationScope);

    /// The target method of the upcall. Chosen at runtime.
    default MemorySegment invokePPPIII(MemorySegment pUserData, MemorySegment pOriginal, int size, int alignment, int allocationScope) {
        return invoke(pUserData, pOriginal, MemoryUtil.wideningToLong(CanonicalTypes.SIZE_T, size), MemoryUtil.wideningToLong(CanonicalTypes.SIZE_T, alignment), allocationScope);
    }

    /// The target method of the upcall. Chosen at runtime.
    default MemorySegment invokePPPJJI(MemorySegment pUserData, MemorySegment pOriginal, long size, long alignment, int allocationScope) {
        return invoke(pUserData, pOriginal, MemoryUtil.wideningToLong(CanonicalTypes.SIZE_T, size), MemoryUtil.wideningToLong(CanonicalTypes.SIZE_T, alignment), allocationScope);
    }

    @Override
    default MemorySegment stub(Arena arena) { return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, arena); }

}
