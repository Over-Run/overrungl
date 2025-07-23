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
import static overrungl.internal.RuntimeHelper.*;
import overrungl.util.*;
import overrungl.vulkan.*;
public final class VKEXTDisplaySurfaceCounter {
    public static final int VK_SURFACE_COUNTER_VBLANK_BIT_EXT = 0x00000001;
    public static final int VK_SURFACE_COUNTER_VBLANK_EXT = 0x00000001;
    public static final int VK_EXT_DISPLAY_SURFACE_COUNTER_SPEC_VERSION = 1;
    public static final String VK_EXT_DISPLAY_SURFACE_COUNTER_EXTENSION_NAME = "VK_EXT_display_surface_counter";
    public static final int VK_STRUCTURE_TYPE_SURFACE_CAPABILITIES_2_EXT = 1000090000;
    public static final int VK_STRUCTURE_TYPE_SURFACE_CAPABILITIES2_EXT = 1000090000;
    public static final class Handles {
        public static final MethodHandle MH_vkGetPhysicalDeviceSurfaceCapabilities2EXT = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS));
        private Handles() {}
    }

    private VKEXTDisplaySurfaceCounter() {}

    /// ```
    /// (int) VkResult vkGetPhysicalDeviceSurfaceCapabilities2EXT((struct VkPhysicalDevice*) VkPhysicalDevice physicalDevice, (uint64_t) VkSurfaceKHR surface, VkSurfaceCapabilities2EXT* pSurfaceCapabilities);
    /// ```
    public static int vkGetPhysicalDeviceSurfaceCapabilities2EXT(VkPhysicalDevice physicalDevice, long surface, MemorySegment pSurfaceCapabilities) {
        if (MemoryUtil.isNullPointer(physicalDevice.capabilities().PFN_vkGetPhysicalDeviceSurfaceCapabilities2EXT)) throw new VKSymbolNotFoundError("Symbol not found: vkGetPhysicalDeviceSurfaceCapabilities2EXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkGetPhysicalDeviceSurfaceCapabilities2EXT", physicalDevice, surface, pSurfaceCapabilities); }
        return (int) Handles.MH_vkGetPhysicalDeviceSurfaceCapabilities2EXT.invokeExact(physicalDevice.capabilities().PFN_vkGetPhysicalDeviceSurfaceCapabilities2EXT, physicalDevice.segment(), surface, pSurfaceCapabilities); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetPhysicalDeviceSurfaceCapabilities2EXT", e); }
    }

}
