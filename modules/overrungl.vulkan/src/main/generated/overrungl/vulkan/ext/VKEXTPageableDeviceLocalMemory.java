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
package overrungl.vulkan.ext;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.vulkan.*;
import static overrungl.internal.RuntimeHelper.*;
/// `VK_EXT_pageable_device_local_memory` - device extension
public final class VKEXTPageableDeviceLocalMemory {
    public static final int VK_EXT_PAGEABLE_DEVICE_LOCAL_MEMORY_SPEC_VERSION = 1;
    public static final String VK_EXT_PAGEABLE_DEVICE_LOCAL_MEMORY_EXTENSION_NAME = "VK_EXT_pageable_device_local_memory";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PAGEABLE_DEVICE_LOCAL_MEMORY_FEATURES_EXT = 1000412000;
    public static final class Handles {
        public static final MethodHandle MH_vkSetDeviceMemoryPriorityEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_FLOAT));
        private Handles() {}
    }

    private VKEXTPageableDeviceLocalMemory() {}

    /// Invokes `vkSetDeviceMemoryPriorityEXT`.
    /// ```
    /// void vkSetDeviceMemoryPriorityEXT((struct VkDevice*) VkDevice device, (uint64_t) VkDeviceMemory memory, float priority);
    /// ```
    public static void vkSetDeviceMemoryPriorityEXT(@NonNull VkDevice device, long memory, float priority) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkSetDeviceMemoryPriorityEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkSetDeviceMemoryPriorityEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkSetDeviceMemoryPriorityEXT", device, memory, priority); }
        Handles.MH_vkSetDeviceMemoryPriorityEXT.invokeExact(device.capabilities().PFN_vkSetDeviceMemoryPriorityEXT, device.segment(), memory, priority); }
        catch (Throwable e) { throw new RuntimeException("error in vkSetDeviceMemoryPriorityEXT", e); }
    }

}
