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
import static overrungl.internal.RuntimeHelper.*;
import overrungl.util.*;
import overrungl.vulkan.*;
public final class VKKHRPresentWait {
    public static final int VK_KHR_PRESENT_WAIT_SPEC_VERSION = 1;
    public static final String VK_KHR_PRESENT_WAIT_EXTENSION_NAME = "VK_KHR_present_wait";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PRESENT_WAIT_FEATURES_KHR = 1000248000;
    public static final class Handles {
        public static final MethodHandle MH_vkWaitForPresentKHR = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG));
        private Handles() {}
    }

    private VKKHRPresentWait() {}

    /// ```
    /// (int) VkResult vkWaitForPresentKHR((struct VkDevice*) VkDevice device, (uint64_t) VkSwapchainKHR swapchain, uint64_t presentId, uint64_t timeout);
    /// ```
    public static int vkWaitForPresentKHR(VkDevice device, long swapchain, long presentId, long timeout) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkWaitForPresentKHR)) throw new VKSymbolNotFoundError("Symbol not found: vkWaitForPresentKHR");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkWaitForPresentKHR", device, swapchain, presentId, timeout); }
        return (int) Handles.MH_vkWaitForPresentKHR.invokeExact(device.capabilities().PFN_vkWaitForPresentKHR, device.segment(), swapchain, presentId, timeout); }
        catch (Throwable e) { throw new RuntimeException("error in vkWaitForPresentKHR", e); }
    }

}
