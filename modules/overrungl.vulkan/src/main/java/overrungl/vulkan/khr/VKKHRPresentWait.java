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
public class VKKHRPresentWait {
    public static final int VK_KHR_PRESENT_WAIT_SPEC_VERSION = 1;
    public static final String VK_KHR_PRESENT_WAIT_EXTENSION_NAME = "VK_KHR_present_wait";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PRESENT_WAIT_FEATURES_KHR = 1000248000;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_vkWaitForPresentKHR = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG));
        public final MemorySegment PFN_vkWaitForPresentKHR;
        private Handles(@CType("VkDevice") MemorySegment device, VKLoadFunc func) {
            PFN_vkWaitForPresentKHR = func.invoke(device, "vkWaitForPresentKHR");
        }
    }

    public VKKHRPresentWait(@CType("VkDevice") MemorySegment device, VKLoadFunc func) {
        this.handles = new Handles(device, func);
    }

    public @CType("VkResult") int WaitForPresentKHR(@CType("VkDevice") MemorySegment device, @CType("VkSwapchainKHR") MemorySegment swapchain, @CType("uint64_t") long presentId, @CType("uint64_t") long timeout) {
        if (Unmarshal.isNullPointer(handles.PFN_vkWaitForPresentKHR)) throw new SymbolNotFoundError("Symbol not found: vkWaitForPresentKHR");
        try { return (int) Handles.MH_vkWaitForPresentKHR.invokeExact(handles.PFN_vkWaitForPresentKHR, device, swapchain, presentId, timeout); }
        catch (Throwable e) { throw new RuntimeException("error in vkWaitForPresentKHR", e); }
    }

}
