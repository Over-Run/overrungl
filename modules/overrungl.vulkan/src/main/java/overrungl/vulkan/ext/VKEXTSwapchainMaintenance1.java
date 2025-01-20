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
import java.util.*;
public class VKEXTSwapchainMaintenance1 {
    public static final int VK_EXT_SWAPCHAIN_MAINTENANCE_1_SPEC_VERSION = 1;
    public static final String VK_EXT_SWAPCHAIN_MAINTENANCE_1_EXTENSION_NAME = "VK_EXT_swapchain_maintenance1";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SWAPCHAIN_MAINTENANCE_1_FEATURES_EXT = 1000275000;
    public static final int VK_STRUCTURE_TYPE_SWAPCHAIN_PRESENT_FENCE_INFO_EXT = 1000275001;
    public static final int VK_STRUCTURE_TYPE_SWAPCHAIN_PRESENT_MODES_CREATE_INFO_EXT = 1000275002;
    public static final int VK_STRUCTURE_TYPE_SWAPCHAIN_PRESENT_MODE_INFO_EXT = 1000275003;
    public static final int VK_STRUCTURE_TYPE_SWAPCHAIN_PRESENT_SCALING_CREATE_INFO_EXT = 1000275004;
    public static final int VK_STRUCTURE_TYPE_RELEASE_SWAPCHAIN_IMAGES_INFO_EXT = 1000275005;
    public static final int VK_SWAPCHAIN_CREATE_DEFERRED_MEMORY_ALLOCATION_BIT_EXT = 0x00000008;
    private final Handles handles;
    public static final class Descriptors {
        public static final FunctionDescriptor FD_vkReleaseSwapchainImagesEXT = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final List<FunctionDescriptor> LIST = List.of(
            FD_vkReleaseSwapchainImagesEXT
        );
        private Descriptors() {}
    }
    public static final class Handles {
        public static final MethodHandle MH_vkReleaseSwapchainImagesEXT = RuntimeHelper.downcall(Descriptors.FD_vkReleaseSwapchainImagesEXT);
        public final MemorySegment PFN_vkReleaseSwapchainImagesEXT;
        private Handles(@CType("VkDevice") MemorySegment device, VKLoadFunc func) {
            PFN_vkReleaseSwapchainImagesEXT = func.invoke(device, "vkReleaseSwapchainImagesEXT");
        }
    }

    public VKEXTSwapchainMaintenance1(@CType("VkDevice") MemorySegment device, VKLoadFunc func) {
        this.handles = new Handles(device, func);
    }

    public @CType("VkResult") int ReleaseSwapchainImagesEXT(@CType("VkDevice") MemorySegment device, @CType("const VkReleaseSwapchainImagesInfoEXT *") MemorySegment pReleaseInfo) {
        if (Unmarshal.isNullPointer(handles.PFN_vkReleaseSwapchainImagesEXT)) throw new SymbolNotFoundError("Symbol not found: vkReleaseSwapchainImagesEXT");
        try { return (int) Handles.MH_vkReleaseSwapchainImagesEXT.invokeExact(handles.PFN_vkReleaseSwapchainImagesEXT, device, pReleaseInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkReleaseSwapchainImagesEXT", e); }
    }

}
