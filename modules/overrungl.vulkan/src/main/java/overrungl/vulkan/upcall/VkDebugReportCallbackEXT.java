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
/// typedef VkBool32 (*VkDebugReportCallbackEXT)(VkDebugReportFlagsEXT flags, VkDebugReportObjectTypeEXT objectType, uint64_t object, size_t location, int32_t messageCode, const char* pLayerPrefix, const char* pMessage, void* pUserData);
/// ```
@FunctionalInterface
public interface VkDebugReportCallbackEXT extends Upcall {
    /// The function descriptor.
    FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, CanonicalTypes.SIZE_T, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
    /// The method handle of the target method.
    MethodHandle HANDLE = Upcall.findTarget(VkDebugReportCallbackEXT.class, RuntimeHelper.upcallTarget("invoke", DESCRIPTOR), DESCRIPTOR);

    /// Allocates `VkDebugReportCallbackEXT`.
    /// @param arena the arena
    /// @param func  the function
    /// @return the upcall stub
    static MemorySegment alloc(Arena arena, VkDebugReportCallbackEXT func) {
        if (func == null) return MemorySegment.NULL;
        return func.stub(arena);
    }

    /// The target method of the upcall.
    int invoke(int flags, int objectType, long object, long location, int messageCode, MemorySegment pLayerPrefix, MemorySegment pMessage, MemorySegment pUserData);

    /// The target method of the upcall. Chosen at runtime.
    default int invokeIIIJIIPPP(int flags, int objectType, long object, int location, int messageCode, MemorySegment pLayerPrefix, MemorySegment pMessage, MemorySegment pUserData) {
        return invoke(flags, objectType, object, MemoryUtil.wideningToLong(CanonicalTypes.SIZE_T, location), messageCode, pLayerPrefix, pMessage, pUserData);
    }

    /// The target method of the upcall. Chosen at runtime.
    default int invokeIIIJJIPPP(int flags, int objectType, long object, long location, int messageCode, MemorySegment pLayerPrefix, MemorySegment pMessage, MemorySegment pUserData) {
        return invoke(flags, objectType, object, MemoryUtil.wideningToLong(CanonicalTypes.SIZE_T, location), messageCode, pLayerPrefix, pMessage, pUserData);
    }

    @Override
    default MemorySegment stub(Arena arena) { return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, arena); }

}
