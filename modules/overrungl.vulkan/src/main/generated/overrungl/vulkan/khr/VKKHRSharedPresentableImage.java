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
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;
import overrungl.vulkan.*;
public final class VKKHRSharedPresentableImage {
    public static final int VK_KHR_SHARED_PRESENTABLE_IMAGE_SPEC_VERSION = 1;
    public static final String VK_KHR_SHARED_PRESENTABLE_IMAGE_EXTENSION_NAME = "VK_KHR_shared_presentable_image";
    public static final int VK_STRUCTURE_TYPE_SHARED_PRESENT_SURFACE_CAPABILITIES_KHR = 1000111000;
    public static final int VK_PRESENT_MODE_SHARED_DEMAND_REFRESH_KHR = 1000111000;
    public static final int VK_PRESENT_MODE_SHARED_CONTINUOUS_REFRESH_KHR = 1000111001;
    public static final int VK_IMAGE_LAYOUT_SHARED_PRESENT_KHR = 1000111000;
    public static final class Handles {
        public static final MethodHandle MH_vkGetSwapchainStatusKHR = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG));
        private Handles() {}
    }

    private VKKHRSharedPresentableImage() {}

    /// ```
    /// (int) VkResult vkGetSwapchainStatusKHR((struct VkDevice*) VkDevice device, (uint64_t) VkSwapchainKHR swapchain);
    /// ```
    public static int vkGetSwapchainStatusKHR(VkDevice device, long swapchain) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkGetSwapchainStatusKHR)) throw new VKSymbolNotFoundError("Symbol not found: vkGetSwapchainStatusKHR");
        try { return (int) Handles.MH_vkGetSwapchainStatusKHR.invokeExact(device.capabilities().PFN_vkGetSwapchainStatusKHR, device.segment(), swapchain); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetSwapchainStatusKHR", e); }
    }

}
