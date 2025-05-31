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
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;
import overrungl.vulkan.*;
public final class VKEXTAcquireDrmDisplay {
    public static final int VK_EXT_ACQUIRE_DRM_DISPLAY_SPEC_VERSION = 1;
    public static final String VK_EXT_ACQUIRE_DRM_DISPLAY_EXTENSION_NAME = "VK_EXT_acquire_drm_display";
    public static final class Handles {
        public static final MethodHandle MH_vkAcquireDrmDisplayEXT = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));
        public static final MethodHandle MH_vkGetDrmDisplayEXT = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        private Handles() {}
    }

    private VKEXTAcquireDrmDisplay() {}

    /// ```
    /// (int) VkResult vkAcquireDrmDisplayEXT((struct VkPhysicalDevice*) VkPhysicalDevice physicalDevice, int32_t drmFd, (uint64_t) VkDisplayKHR display);
    /// ```
    public static int vkAcquireDrmDisplayEXT(VkPhysicalDevice physicalDevice, int drmFd, long display) {
        if (MemoryUtil.isNullPointer(physicalDevice.capabilities().PFN_vkAcquireDrmDisplayEXT)) throw new SymbolNotFoundError("Symbol not found: vkAcquireDrmDisplayEXT");
        try { return (int) Handles.MH_vkAcquireDrmDisplayEXT.invokeExact(physicalDevice.capabilities().PFN_vkAcquireDrmDisplayEXT, physicalDevice.segment(), drmFd, display); }
        catch (Throwable e) { throw new RuntimeException("error in vkAcquireDrmDisplayEXT", e); }
    }

    /// ```
    /// (int) VkResult vkGetDrmDisplayEXT((struct VkPhysicalDevice*) VkPhysicalDevice physicalDevice, int32_t drmFd, uint32_t connectorId, VkDisplayKHR* display);
    /// ```
    public static int vkGetDrmDisplayEXT(VkPhysicalDevice physicalDevice, int drmFd, int connectorId, MemorySegment display) {
        if (MemoryUtil.isNullPointer(physicalDevice.capabilities().PFN_vkGetDrmDisplayEXT)) throw new SymbolNotFoundError("Symbol not found: vkGetDrmDisplayEXT");
        try { return (int) Handles.MH_vkGetDrmDisplayEXT.invokeExact(physicalDevice.capabilities().PFN_vkGetDrmDisplayEXT, physicalDevice.segment(), drmFd, connectorId, display); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetDrmDisplayEXT", e); }
    }

}
