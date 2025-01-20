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
package overrungl.vulkan.ggp;
import java.lang.foreign.*;
import java.lang.invoke.*;
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;
import overrungl.vulkan.*;
public class VKGGPStreamDescriptorSurface {
    public static final int VK_GGP_STREAM_DESCRIPTOR_SURFACE_SPEC_VERSION = 1;
    public static final String VK_GGP_STREAM_DESCRIPTOR_SURFACE_EXTENSION_NAME = "VK_GGP_stream_descriptor_surface";
    public static final int VK_STRUCTURE_TYPE_STREAM_DESCRIPTOR_SURFACE_CREATE_INFO_GGP = 1000049000;
    private final Handles handles;
    public static final class Descriptors {
        public static final FunctionDescriptor FD_vkCreateStreamDescriptorSurfaceGGP = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        private Descriptors() {}
    }
    public static final class Handles {
        public static final MethodHandle MH_vkCreateStreamDescriptorSurfaceGGP = RuntimeHelper.downcall(Descriptors.FD_vkCreateStreamDescriptorSurfaceGGP);
        public final MemorySegment PFN_vkCreateStreamDescriptorSurfaceGGP;
        private Handles(@CType("VkInstance") MemorySegment instance, VKLoadFunc func) {
            PFN_vkCreateStreamDescriptorSurfaceGGP = func.invoke(instance, "vkCreateStreamDescriptorSurfaceGGP");
        }
    }

    public VKGGPStreamDescriptorSurface(@CType("VkInstance") MemorySegment instance, VKLoadFunc func) {
        this.handles = new Handles(instance, func);
    }

    public @CType("VkResult") int CreateStreamDescriptorSurfaceGGP(@CType("VkInstance") MemorySegment instance, @CType("const VkStreamDescriptorSurfaceCreateInfoGGP *") MemorySegment pCreateInfo, @CType("const VkAllocationCallbacks *") MemorySegment pAllocator, @CType("VkSurfaceKHR *") MemorySegment pSurface) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCreateStreamDescriptorSurfaceGGP)) throw new SymbolNotFoundError("Symbol not found: vkCreateStreamDescriptorSurfaceGGP");
        try { return (int) Handles.MH_vkCreateStreamDescriptorSurfaceGGP.invokeExact(handles.PFN_vkCreateStreamDescriptorSurfaceGGP, instance, pCreateInfo, pAllocator, pSurface); }
        catch (Throwable e) { throw new RuntimeException("error in vkCreateStreamDescriptorSurfaceGGP", e); }
    }

}
