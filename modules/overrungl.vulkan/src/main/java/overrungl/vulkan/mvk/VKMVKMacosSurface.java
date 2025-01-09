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
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;
import overrungl.vulkan.*;
public class VKMVKMacosSurface {
    public static final int VK_MVK_MACOS_SURFACE_SPEC_VERSION = 3;
    public static final String VK_MVK_MACOS_SURFACE_EXTENSION_NAME = "VK_MVK_macos_surface";
    public static final int VK_STRUCTURE_TYPE_MACOS_SURFACE_CREATE_INFO_MVK = 1000123000;
    public static final MethodHandle MH_vkCreateMacOSSurfaceMVK = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public final MemorySegment PFN_vkCreateMacOSSurfaceMVK;

    public VKMVKMacosSurface(@CType("VkInstance") MemorySegment instance, VKLoadFunc func) {
        PFN_vkCreateMacOSSurfaceMVK = func.invoke(instance, "vkCreateMacOSSurfaceMVK");
    }

    public @CType("VkResult") int CreateMacOSSurfaceMVK(@CType("VkInstance") MemorySegment instance, @CType("const VkMacOSSurfaceCreateInfoMVK *") MemorySegment pCreateInfo, @CType("const VkAllocationCallbacks *") MemorySegment pAllocator, @CType("VkSurfaceKHR *") MemorySegment pSurface) {
        if (Unmarshal.isNullPointer(PFN_vkCreateMacOSSurfaceMVK)) throw new SymbolNotFoundError("Symbol not found: vkCreateMacOSSurfaceMVK");
        try { return (int) MH_vkCreateMacOSSurfaceMVK.invokeExact(PFN_vkCreateMacOSSurfaceMVK, instance, pCreateInfo, pAllocator, pSurface); }
        catch (Throwable e) { throw new RuntimeException("error in vkCreateMacOSSurfaceMVK", e); }
    }

}