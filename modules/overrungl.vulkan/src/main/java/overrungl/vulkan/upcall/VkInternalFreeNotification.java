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
/// typedef void (*VkInternalFreeNotification)(void* pUserData, size_t size, (int) VkInternalAllocationType allocationType, (int) VkSystemAllocationScope allocationScope);
/// ```
@FunctionalInterface
public interface VkInternalFreeNotification extends Upcall {
    /// The function descriptor.
    FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, CanonicalTypes.SIZE_T, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
    /// The method handle of the target method.
    MethodHandle HANDLE = Upcall.findTarget(VkInternalFreeNotification.class, RuntimeHelper.upcallTarget("invoke", DESCRIPTOR), DESCRIPTOR);

    /// Allocates `VkInternalFreeNotification`.
    /// @param arena the arena
    /// @param func  the function
    /// @return the upcall stub
    static MemorySegment alloc(Arena arena, VkInternalFreeNotification func) {
        if (func == null) return MemorySegment.NULL;
        return func.stub(arena);
    }

    /// The target method of the upcall.
    void invoke(MemorySegment pUserData, long size, int allocationType, int allocationScope);

    /// The target method of the upcall. Chosen at runtime.
    default void invokeVPIII(MemorySegment pUserData, int size, int allocationType, int allocationScope) {
        invoke(pUserData, MemoryUtil.wideningToLong(CanonicalTypes.SIZE_T, size), allocationType, allocationScope);
    }

    /// The target method of the upcall. Chosen at runtime.
    default void invokeVPJII(MemorySegment pUserData, long size, int allocationType, int allocationScope) {
        invoke(pUserData, MemoryUtil.wideningToLong(CanonicalTypes.SIZE_T, size), allocationType, allocationScope);
    }

    @Override
    default MemorySegment stub(Arena arena) { return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, arena); }

}
