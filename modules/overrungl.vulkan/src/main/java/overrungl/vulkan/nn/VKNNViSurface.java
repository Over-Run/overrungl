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
package overrungl.vulkan.nn;
import java.lang.foreign.*;
import java.lang.invoke.*;
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;
import overrungl.vulkan.*;
public class VKNNViSurface {
    public static final int VK_NN_VI_SURFACE_SPEC_VERSION = 1;
    public static final String VK_NN_VI_SURFACE_EXTENSION_NAME = "VK_NN_vi_surface";
    public static final int VK_STRUCTURE_TYPE_VI_SURFACE_CREATE_INFO_NN = 1000062000;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_vkCreateViSurfaceNN = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public final MemorySegment PFN_vkCreateViSurfaceNN;
        private Handles(@CType("VkInstance") MemorySegment instance, VKLoadFunc func) {
            PFN_vkCreateViSurfaceNN = func.invoke(instance, "vkCreateViSurfaceNN");
        }
    }

    public VKNNViSurface(@CType("VkInstance") MemorySegment instance, VKLoadFunc func) {
        this.handles = new Handles(instance, func);
    }

    public @CType("VkResult") int CreateViSurfaceNN(@CType("VkInstance") MemorySegment instance, @CType("const VkViSurfaceCreateInfoNN *") MemorySegment pCreateInfo, @CType("const VkAllocationCallbacks *") MemorySegment pAllocator, @CType("VkSurfaceKHR *") MemorySegment pSurface) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCreateViSurfaceNN)) throw new SymbolNotFoundError("Symbol not found: vkCreateViSurfaceNN");
        try { return (int) Handles.MH_vkCreateViSurfaceNN.invokeExact(handles.PFN_vkCreateViSurfaceNN, instance, pCreateInfo, pAllocator, pSurface); }
        catch (Throwable e) { throw new RuntimeException("error in vkCreateViSurfaceNN", e); }
    }

}
