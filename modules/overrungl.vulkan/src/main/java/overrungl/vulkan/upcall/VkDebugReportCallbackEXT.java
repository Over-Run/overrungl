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
public interface VkDebugReportCallbackEXT extends Upcall {
    /// The function descriptor.
    FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
    /// The method handle of the target method.
    MethodHandle HANDLE = Upcall.findTarget(VkDebugReportCallbackEXT.class, "invoke", DESCRIPTOR);

    /// The target method of the upcall.
    @CType("VkBool32") int invoke(@CType("VkDebugReportFlagsEXT") int flags, @CType("VkDebugReportObjectTypeEXT") int objectType, @CType("uint64_t") long object, @CType("size_t") long location, @CType("int32_t") int messageCode, @CType("const char *") java.lang.foreign.MemorySegment pLayerPrefix, @CType("const char *") java.lang.foreign.MemorySegment pMessage, @CType("void *") java.lang.foreign.MemorySegment pUserData);

    @Override
    default MemorySegment stub(Arena arena) { return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, arena); }

    /// A static invoker of the target method.
    /// @param stub the upcall stub
    static @CType("VkBool32") int invoke(MemorySegment stub, @CType("VkDebugReportFlagsEXT") int flags, @CType("VkDebugReportObjectTypeEXT") int objectType, @CType("uint64_t") long object, @CType("size_t") long location, @CType("int32_t") int messageCode, @CType("const char *") java.lang.foreign.MemorySegment pLayerPrefix, @CType("const char *") java.lang.foreign.MemorySegment pMessage, @CType("void *") java.lang.foreign.MemorySegment pUserData) {
        try { return (int) HANDLE.invokeExact(stub, flags, objectType, object, location, messageCode, pLayerPrefix, pMessage, pUserData); }
        catch (Throwable e) { throw new RuntimeException("error in VkDebugReportCallbackEXT::invoke (static invoker)", e); }
    }

    /// A wrapper for the target method.
    /// @param stub the upcall stub
    /// @return an instance that wraps the static invoker
    static VkDebugReportCallbackEXT wrap(MemorySegment stub) {
        return (flags, objectType, object, location, messageCode, pLayerPrefix, pMessage, pUserData) ->
            invoke(stub, flags, objectType, object, location, messageCode, pLayerPrefix, pMessage, pUserData);
    }
}
