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
import java.util.*;
public class VKMVKMacosSurface {
    public static final int VK_MVK_MACOS_SURFACE_SPEC_VERSION = 3;
    public static final String VK_MVK_MACOS_SURFACE_EXTENSION_NAME = "VK_MVK_macos_surface";
    public static final int VK_STRUCTURE_TYPE_MACOS_SURFACE_CREATE_INFO_MVK = 1000123000;
    private final Handles handles;
    public static final class Descriptors {
        public static final FunctionDescriptor FD_vkCreateMacOSSurfaceMVK = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final List<FunctionDescriptor> LIST = List.of(
            FD_vkCreateMacOSSurfaceMVK
        );
        private Descriptors() {}
    }
    public static final class Handles {
        public static final MethodHandle MH_vkCreateMacOSSurfaceMVK = RuntimeHelper.downcall(Descriptors.FD_vkCreateMacOSSurfaceMVK);
        public final MemorySegment PFN_vkCreateMacOSSurfaceMVK;
        private Handles(@CType("VkInstance") MemorySegment instance, VKLoadFunc func) {
            PFN_vkCreateMacOSSurfaceMVK = func.invoke(instance, "vkCreateMacOSSurfaceMVK");
        }
    }

    public VKMVKMacosSurface(@CType("VkInstance") MemorySegment instance, VKLoadFunc func) {
        this.handles = new Handles(instance, func);
    }

    public @CType("VkResult") int CreateMacOSSurfaceMVK(@CType("VkInstance") MemorySegment instance, @CType("const VkMacOSSurfaceCreateInfoMVK *") MemorySegment pCreateInfo, @CType("const VkAllocationCallbacks *") MemorySegment pAllocator, @CType("VkSurfaceKHR *") MemorySegment pSurface) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCreateMacOSSurfaceMVK)) throw new SymbolNotFoundError("Symbol not found: vkCreateMacOSSurfaceMVK");
        try { return (int) Handles.MH_vkCreateMacOSSurfaceMVK.invokeExact(handles.PFN_vkCreateMacOSSurfaceMVK, instance, pCreateInfo, pAllocator, pSurface); }
        catch (Throwable e) { throw new RuntimeException("error in vkCreateMacOSSurfaceMVK", e); }
    }

}
