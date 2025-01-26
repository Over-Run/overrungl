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
package overrungl.vulkan.mvk;
import java.lang.foreign.*;
import java.lang.invoke.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;
import overrungl.vulkan.*;
public class VKMVKIosSurface {
    public static final int VK_MVK_IOS_SURFACE_SPEC_VERSION = 3;
    public static final String VK_MVK_IOS_SURFACE_EXTENSION_NAME = "VK_MVK_ios_surface";
    public static final int VK_STRUCTURE_TYPE_IOS_SURFACE_CREATE_INFO_MVK = 1000122000;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_vkCreateIOSSurfaceMVK = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public final MemorySegment PFN_vkCreateIOSSurfaceMVK;
        private Handles(MemorySegment instance, VKLoadFunc func) {
            PFN_vkCreateIOSSurfaceMVK = func.invoke(instance, "vkCreateIOSSurfaceMVK");
        }
    }

    public VKMVKIosSurface(MemorySegment instance, VKLoadFunc func) {
        this.handles = new Handles(instance, func);
    }

    /// ```
    /// VkResult vkCreateIOSSurfaceMVK(VkInstance instance, const VkIOSSurfaceCreateInfoMVK* pCreateInfo, const VkAllocationCallbacks* pAllocator, VkSurfaceKHR* pSurface);
    /// ```
    public int CreateIOSSurfaceMVK(MemorySegment instance, MemorySegment pCreateInfo, MemorySegment pAllocator, MemorySegment pSurface) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCreateIOSSurfaceMVK)) throw new SymbolNotFoundError("Symbol not found: vkCreateIOSSurfaceMVK");
        try { return (int) Handles.MH_vkCreateIOSSurfaceMVK.invokeExact(handles.PFN_vkCreateIOSSurfaceMVK, instance, pCreateInfo, pAllocator, pSurface); }
        catch (Throwable e) { throw new RuntimeException("error in CreateIOSSurfaceMVK", e); }
    }

}
