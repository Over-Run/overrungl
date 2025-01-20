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
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;
import overrungl.vulkan.*;
public class VKEXTPageableDeviceLocalMemory {
    public static final int VK_EXT_PAGEABLE_DEVICE_LOCAL_MEMORY_SPEC_VERSION = 1;
    public static final String VK_EXT_PAGEABLE_DEVICE_LOCAL_MEMORY_EXTENSION_NAME = "VK_EXT_pageable_device_local_memory";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PAGEABLE_DEVICE_LOCAL_MEMORY_FEATURES_EXT = 1000412000;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_vkSetDeviceMemoryPriorityEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT));
        public final MemorySegment PFN_vkSetDeviceMemoryPriorityEXT;
        private Handles(@CType("VkDevice") MemorySegment device, VKLoadFunc func) {
            PFN_vkSetDeviceMemoryPriorityEXT = func.invoke(device, "vkSetDeviceMemoryPriorityEXT");
        }
    }

    public VKEXTPageableDeviceLocalMemory(@CType("VkDevice") MemorySegment device, VKLoadFunc func) {
        this.handles = new Handles(device, func);
    }

    public void SetDeviceMemoryPriorityEXT(@CType("VkDevice") MemorySegment device, @CType("VkDeviceMemory") MemorySegment memory, float priority) {
        if (Unmarshal.isNullPointer(handles.PFN_vkSetDeviceMemoryPriorityEXT)) throw new SymbolNotFoundError("Symbol not found: vkSetDeviceMemoryPriorityEXT");
        try { Handles.MH_vkSetDeviceMemoryPriorityEXT.invokeExact(handles.PFN_vkSetDeviceMemoryPriorityEXT, device, memory, priority); }
        catch (Throwable e) { throw new RuntimeException("error in vkSetDeviceMemoryPriorityEXT", e); }
    }

}
