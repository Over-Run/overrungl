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
package overrungl.vulkan.fuchsia;
import java.lang.foreign.*;
import java.lang.invoke.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;
import overrungl.vulkan.*;
public final class VKFUCHSIAImagepipeSurface {
    public static final int VK_FUCHSIA_IMAGEPIPE_SURFACE_SPEC_VERSION = 1;
    public static final String VK_FUCHSIA_IMAGEPIPE_SURFACE_EXTENSION_NAME = "VK_FUCHSIA_imagepipe_surface";
    public static final int VK_STRUCTURE_TYPE_IMAGEPIPE_SURFACE_CREATE_INFO_FUCHSIA = 1000214000;
    public static final class Handles {
        public static final MethodHandle MH_vkCreateImagePipeSurfaceFUCHSIA = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        private Handles() {}
    }

    private VKFUCHSIAImagepipeSurface() {}

    /// ```
    /// (int) VkResult vkCreateImagePipeSurfaceFUCHSIA((struct VkInstance*) VkInstance instance, const VkImagePipeSurfaceCreateInfoFUCHSIA* pCreateInfo, const VkAllocationCallbacks* pAllocator, VkSurfaceKHR* pSurface);
    /// ```
    public static int vkCreateImagePipeSurfaceFUCHSIA(VkInstance instance, MemorySegment pCreateInfo, MemorySegment pAllocator, MemorySegment pSurface) {
        if (MemoryUtil.isNullPointer(instance.capabilities().PFN_vkCreateImagePipeSurfaceFUCHSIA)) throw new SymbolNotFoundError("Symbol not found: vkCreateImagePipeSurfaceFUCHSIA");
        try { return (int) Handles.MH_vkCreateImagePipeSurfaceFUCHSIA.invokeExact(instance.capabilities().PFN_vkCreateImagePipeSurfaceFUCHSIA, instance.segment(), pCreateInfo, pAllocator, pSurface); }
        catch (Throwable e) { throw new RuntimeException("error in vkCreateImagePipeSurfaceFUCHSIA", e); }
    }

}
