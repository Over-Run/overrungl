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
public class VKEXTHeadlessSurface {
    public static final int VK_EXT_HEADLESS_SURFACE_SPEC_VERSION = 1;
    public static final String VK_EXT_HEADLESS_SURFACE_EXTENSION_NAME = "VK_EXT_headless_surface";
    public static final int VK_STRUCTURE_TYPE_HEADLESS_SURFACE_CREATE_INFO_EXT = 1000256000;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_vkCreateHeadlessSurfaceEXT = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public final MemorySegment PFN_vkCreateHeadlessSurfaceEXT;
        private Handles(@CType("VkInstance") MemorySegment instance, VKLoadFunc func) {
            PFN_vkCreateHeadlessSurfaceEXT = func.invoke(instance, "vkCreateHeadlessSurfaceEXT");
        }
    }

    public VKEXTHeadlessSurface(@CType("VkInstance") MemorySegment instance, VKLoadFunc func) {
        this.handles = new Handles(instance, func);
    }

    public @CType("VkResult") int CreateHeadlessSurfaceEXT(@CType("VkInstance") MemorySegment instance, @CType("const VkHeadlessSurfaceCreateInfoEXT *") MemorySegment pCreateInfo, @CType("const VkAllocationCallbacks *") MemorySegment pAllocator, @CType("VkSurfaceKHR *") MemorySegment pSurface) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCreateHeadlessSurfaceEXT)) throw new SymbolNotFoundError("Symbol not found: vkCreateHeadlessSurfaceEXT");
        try { return (int) Handles.MH_vkCreateHeadlessSurfaceEXT.invokeExact(handles.PFN_vkCreateHeadlessSurfaceEXT, instance, pCreateInfo, pAllocator, pSurface); }
        catch (Throwable e) { throw new RuntimeException("error in vkCreateHeadlessSurfaceEXT", e); }
    }

}
