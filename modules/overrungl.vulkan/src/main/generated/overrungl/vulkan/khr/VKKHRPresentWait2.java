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
public final class VKKHRPresentWait2 {
    public static final int VK_KHR_PRESENT_WAIT_2_SPEC_VERSION = 1;
    public static final String VK_KHR_PRESENT_WAIT_2_EXTENSION_NAME = "VK_KHR_present_wait2";
    public static final int VK_SWAPCHAIN_CREATE_PRESENT_WAIT_2_BIT_KHR = 0x00000080;
    public static final int VK_STRUCTURE_TYPE_SURFACE_CAPABILITIES_PRESENT_WAIT_2_KHR = 1000480000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PRESENT_WAIT_2_FEATURES_KHR = 1000480001;
    public static final int VK_STRUCTURE_TYPE_PRESENT_WAIT_2_INFO_KHR = 1000480002;
    public static final class Handles {
        public static final MethodHandle MH_vkWaitForPresent2KHR = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS));
        private Handles() {}
    }

    private VKKHRPresentWait2() {}

    /// ```
    /// (int) VkResult vkWaitForPresent2KHR((struct VkDevice*) VkDevice device, (uint64_t) VkSwapchainKHR swapchain, const VkPresentWait2InfoKHR* pPresentWait2Info);
    /// ```
    public static int vkWaitForPresent2KHR(VkDevice device, long swapchain, MemorySegment pPresentWait2Info) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkWaitForPresent2KHR)) throw new VKSymbolNotFoundError("Symbol not found: vkWaitForPresent2KHR");
        try { return (int) Handles.MH_vkWaitForPresent2KHR.invokeExact(device.capabilities().PFN_vkWaitForPresent2KHR, device.segment(), swapchain, pPresentWait2Info); }
        catch (Throwable e) { throw new RuntimeException("error in vkWaitForPresent2KHR", e); }
    }

}
