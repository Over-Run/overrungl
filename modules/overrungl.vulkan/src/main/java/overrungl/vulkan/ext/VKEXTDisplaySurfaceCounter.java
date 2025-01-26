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
public class VKEXTDisplaySurfaceCounter {
    public static final int VK_SURFACE_COUNTER_VBLANK_BIT_EXT = 0x00000001;
    public static final int VK_SURFACE_COUNTER_VBLANK_EXT = 0x00000001;
    public static final int VK_EXT_DISPLAY_SURFACE_COUNTER_SPEC_VERSION = 1;
    public static final String VK_EXT_DISPLAY_SURFACE_COUNTER_EXTENSION_NAME = "VK_EXT_display_surface_counter";
    public static final int VK_STRUCTURE_TYPE_SURFACE_CAPABILITIES_2_EXT = 1000090000;
    public static final int VK_STRUCTURE_TYPE_SURFACE_CAPABILITIES2_EXT = 1000090000;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_vkGetPhysicalDeviceSurfaceCapabilities2EXT = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS));
        public final MemorySegment PFN_vkGetPhysicalDeviceSurfaceCapabilities2EXT;
        private Handles(MemorySegment instance, VKLoadFunc func) {
            PFN_vkGetPhysicalDeviceSurfaceCapabilities2EXT = func.invoke(instance, "vkGetPhysicalDeviceSurfaceCapabilities2EXT");
        }
    }

    public VKEXTDisplaySurfaceCounter(MemorySegment instance, VKLoadFunc func) {
        this.handles = new Handles(instance, func);
    }

    /// ```
    /// VkResult vkGetPhysicalDeviceSurfaceCapabilities2EXT(VkPhysicalDevice physicalDevice, VkSurfaceKHR surface, VkSurfaceCapabilities2EXT* pSurfaceCapabilities);
    /// ```
    public int GetPhysicalDeviceSurfaceCapabilities2EXT(MemorySegment physicalDevice, long surface, MemorySegment pSurfaceCapabilities) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkGetPhysicalDeviceSurfaceCapabilities2EXT)) throw new SymbolNotFoundError("Symbol not found: vkGetPhysicalDeviceSurfaceCapabilities2EXT");
        try { return (int) Handles.MH_vkGetPhysicalDeviceSurfaceCapabilities2EXT.invokeExact(handles.PFN_vkGetPhysicalDeviceSurfaceCapabilities2EXT, physicalDevice, surface, pSurfaceCapabilities); }
        catch (Throwable e) { throw new RuntimeException("error in GetPhysicalDeviceSurfaceCapabilities2EXT", e); }
    }

}
