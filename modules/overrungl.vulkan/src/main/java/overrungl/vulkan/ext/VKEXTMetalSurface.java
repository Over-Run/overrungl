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
public class VKEXTMetalSurface {
    public static final int VK_EXT_METAL_SURFACE_SPEC_VERSION = 1;
    public static final String VK_EXT_METAL_SURFACE_EXTENSION_NAME = "VK_EXT_metal_surface";
    public static final int VK_STRUCTURE_TYPE_METAL_SURFACE_CREATE_INFO_EXT = 1000217000;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_vkCreateMetalSurfaceEXT = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public final MemorySegment PFN_vkCreateMetalSurfaceEXT;
        private Handles(@CType("VkInstance") MemorySegment instance, VKLoadFunc func) {
            PFN_vkCreateMetalSurfaceEXT = func.invoke(instance, "vkCreateMetalSurfaceEXT");
        }
    }

    public VKEXTMetalSurface(@CType("VkInstance") MemorySegment instance, VKLoadFunc func) {
        this.handles = new Handles(instance, func);
    }

    public @CType("VkResult") int CreateMetalSurfaceEXT(@CType("VkInstance") MemorySegment instance, @CType("const VkMetalSurfaceCreateInfoEXT *") MemorySegment pCreateInfo, @CType("const VkAllocationCallbacks *") MemorySegment pAllocator, @CType("VkSurfaceKHR *") MemorySegment pSurface) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCreateMetalSurfaceEXT)) throw new SymbolNotFoundError("Symbol not found: vkCreateMetalSurfaceEXT");
        try { return (int) Handles.MH_vkCreateMetalSurfaceEXT.invokeExact(handles.PFN_vkCreateMetalSurfaceEXT, instance, pCreateInfo, pAllocator, pSurface); }
        catch (Throwable e) { throw new RuntimeException("error in vkCreateMetalSurfaceEXT", e); }
    }

}
