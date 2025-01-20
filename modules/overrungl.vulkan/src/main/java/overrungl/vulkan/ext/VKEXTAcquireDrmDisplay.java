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
public class VKEXTAcquireDrmDisplay {
    public static final int VK_EXT_ACQUIRE_DRM_DISPLAY_SPEC_VERSION = 1;
    public static final String VK_EXT_ACQUIRE_DRM_DISPLAY_EXTENSION_NAME = "VK_EXT_acquire_drm_display";
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_vkAcquireDrmDisplayEXT = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetDrmDisplayEXT = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public final MemorySegment PFN_vkAcquireDrmDisplayEXT;
        public final MemorySegment PFN_vkGetDrmDisplayEXT;
        private Handles(@CType("VkInstance") MemorySegment instance, VKLoadFunc func) {
            PFN_vkAcquireDrmDisplayEXT = func.invoke(instance, "vkAcquireDrmDisplayEXT");
            PFN_vkGetDrmDisplayEXT = func.invoke(instance, "vkGetDrmDisplayEXT");
        }
    }

    public VKEXTAcquireDrmDisplay(@CType("VkInstance") MemorySegment instance, VKLoadFunc func) {
        this.handles = new Handles(instance, func);
    }

    public @CType("VkResult") int AcquireDrmDisplayEXT(@CType("VkPhysicalDevice") MemorySegment physicalDevice, @CType("int32_t") int drmFd, @CType("VkDisplayKHR") MemorySegment display) {
        if (Unmarshal.isNullPointer(handles.PFN_vkAcquireDrmDisplayEXT)) throw new SymbolNotFoundError("Symbol not found: vkAcquireDrmDisplayEXT");
        try { return (int) Handles.MH_vkAcquireDrmDisplayEXT.invokeExact(handles.PFN_vkAcquireDrmDisplayEXT, physicalDevice, drmFd, display); }
        catch (Throwable e) { throw new RuntimeException("error in vkAcquireDrmDisplayEXT", e); }
    }

    public @CType("VkResult") int GetDrmDisplayEXT(@CType("VkPhysicalDevice") MemorySegment physicalDevice, @CType("int32_t") int drmFd, @CType("uint32_t") int connectorId, @CType("VkDisplayKHR *") MemorySegment display) {
        if (Unmarshal.isNullPointer(handles.PFN_vkGetDrmDisplayEXT)) throw new SymbolNotFoundError("Symbol not found: vkGetDrmDisplayEXT");
        try { return (int) Handles.MH_vkGetDrmDisplayEXT.invokeExact(handles.PFN_vkGetDrmDisplayEXT, physicalDevice, drmFd, connectorId, display); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetDrmDisplayEXT", e); }
    }

}
