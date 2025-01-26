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
/// typedef (uint32_t) VkBool32 (*VkDebugUtilsMessengerCallbackEXT)((int) VkDebugUtilsMessageSeverityFlagBitsEXT messageSeverity, ((uint32_t) VkFlags) VkDebugUtilsMessageTypeFlagsEXT messageTypes, const VkDebugUtilsMessengerCallbackDataEXT* pCallbackData, void* pUserData);
/// ```
@FunctionalInterface
public interface VkDebugUtilsMessengerCallbackEXT extends Upcall {
    /// The function descriptor.
    FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
    /// The method handle of the target method.
    MethodHandle HANDLE = Upcall.findTarget(VkDebugUtilsMessengerCallbackEXT.class, "invoke_", DESCRIPTOR);

    /// Allocates `VkDebugUtilsMessengerCallbackEXT`.
    /// @param arena the arena
    /// @param func  the function
    /// @return the upcall stub
    static MemorySegment alloc(Arena arena, VkDebugUtilsMessengerCallbackEXT func) {
        if (func == null) return MemorySegment.NULL;
        return func.stub(arena);
    }

    /// The target method of the upcall.
    int invoke(int messageSeverity, int messageTypes, MemorySegment pCallbackData, MemorySegment pUserData);

    /// The target method of the upcall.
    default int invoke_(int messageSeverity, int messageTypes, MemorySegment pCallbackData, MemorySegment pUserData) {
        return invoke(messageSeverity, messageTypes, pCallbackData, pUserData);
    }

    @Override
    default MemorySegment stub(Arena arena) { return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, arena); }

}
