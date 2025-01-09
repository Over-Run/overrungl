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
package overrungl.vulkan.khr;
import java.lang.foreign.*;
import java.lang.invoke.*;
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;
import overrungl.vulkan.*;
public class VKKHRAndroidSurface {
    public static final int VK_KHR_ANDROID_SURFACE_SPEC_VERSION = 6;
    public static final String VK_KHR_ANDROID_SURFACE_EXTENSION_NAME = "VK_KHR_android_surface";
    public static final int VK_STRUCTURE_TYPE_ANDROID_SURFACE_CREATE_INFO_KHR = 1000008000;
    public static final MethodHandle MH_vkCreateAndroidSurfaceKHR = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public final MemorySegment PFN_vkCreateAndroidSurfaceKHR;

    public VKKHRAndroidSurface(@CType("VkInstance") MemorySegment instance, VKLoadFunc func) {
        PFN_vkCreateAndroidSurfaceKHR = func.invoke(instance, "vkCreateAndroidSurfaceKHR");
    }

    public @CType("VkResult") int CreateAndroidSurfaceKHR(@CType("VkInstance") MemorySegment instance, @CType("const VkAndroidSurfaceCreateInfoKHR *") MemorySegment pCreateInfo, @CType("const VkAllocationCallbacks *") MemorySegment pAllocator, @CType("VkSurfaceKHR *") MemorySegment pSurface) {
        if (Unmarshal.isNullPointer(PFN_vkCreateAndroidSurfaceKHR)) throw new SymbolNotFoundError("Symbol not found: vkCreateAndroidSurfaceKHR");
        try { return (int) MH_vkCreateAndroidSurfaceKHR.invokeExact(PFN_vkCreateAndroidSurfaceKHR, instance, pCreateInfo, pAllocator, pSurface); }
        catch (Throwable e) { throw new RuntimeException("error in vkCreateAndroidSurfaceKHR", e); }
    }

}
