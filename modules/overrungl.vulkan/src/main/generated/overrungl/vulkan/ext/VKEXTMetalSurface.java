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
public final class VKEXTMetalSurface {
    public static final int VK_EXT_METAL_SURFACE_SPEC_VERSION = 1;
    public static final String VK_EXT_METAL_SURFACE_EXTENSION_NAME = "VK_EXT_metal_surface";
    public static final int VK_STRUCTURE_TYPE_METAL_SURFACE_CREATE_INFO_EXT = 1000217000;
    public static final class Handles {
        public static final MethodHandle MH_vkCreateMetalSurfaceEXT = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        private Handles() {}
    }

    private VKEXTMetalSurface() {}

    /// ```
    /// (int) VkResult vkCreateMetalSurfaceEXT((struct VkInstance*) VkInstance instance, const VkMetalSurfaceCreateInfoEXT* pCreateInfo, const VkAllocationCallbacks* pAllocator, VkSurfaceKHR* pSurface);
    /// ```
    public static int vkCreateMetalSurfaceEXT(VkInstance instance, MemorySegment pCreateInfo, MemorySegment pAllocator, MemorySegment pSurface) {
        if (MemoryUtil.isNullPointer(instance.capabilities().PFN_vkCreateMetalSurfaceEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkCreateMetalSurfaceEXT");
        try { return (int) Handles.MH_vkCreateMetalSurfaceEXT.invokeExact(instance.capabilities().PFN_vkCreateMetalSurfaceEXT, instance.segment(), pCreateInfo, pAllocator, pSurface); }
        catch (Throwable e) { throw new RuntimeException("error in vkCreateMetalSurfaceEXT", e); }
    }

}
