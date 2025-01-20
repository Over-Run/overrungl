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
public class VKKHRDisplaySwapchain {
    public static final int VK_KHR_DISPLAY_SWAPCHAIN_SPEC_VERSION = 10;
    public static final String VK_KHR_DISPLAY_SWAPCHAIN_EXTENSION_NAME = "VK_KHR_display_swapchain";
    public static final int VK_STRUCTURE_TYPE_DISPLAY_PRESENT_INFO_KHR = 1000003000;
    public static final int VK_ERROR_INCOMPATIBLE_DISPLAY_KHR = -1000003001;
    private final Handles handles;
    public static final class Descriptors {
        public static final FunctionDescriptor FD_vkCreateSharedSwapchainsKHR = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        private Descriptors() {}
    }
    public static final class Handles {
        public static final MethodHandle MH_vkCreateSharedSwapchainsKHR = RuntimeHelper.downcall(Descriptors.FD_vkCreateSharedSwapchainsKHR);
        public final MemorySegment PFN_vkCreateSharedSwapchainsKHR;
        private Handles(@CType("VkDevice") MemorySegment device, VKLoadFunc func) {
            PFN_vkCreateSharedSwapchainsKHR = func.invoke(device, "vkCreateSharedSwapchainsKHR");
        }
    }

    public VKKHRDisplaySwapchain(@CType("VkDevice") MemorySegment device, VKLoadFunc func) {
        this.handles = new Handles(device, func);
    }

    public @CType("VkResult") int CreateSharedSwapchainsKHR(@CType("VkDevice") MemorySegment device, @CType("uint32_t") int swapchainCount, @CType("const VkSwapchainCreateInfoKHR *") MemorySegment pCreateInfos, @CType("const VkAllocationCallbacks *") MemorySegment pAllocator, @CType("VkSwapchainKHR *") MemorySegment pSwapchains) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCreateSharedSwapchainsKHR)) throw new SymbolNotFoundError("Symbol not found: vkCreateSharedSwapchainsKHR");
        try { return (int) Handles.MH_vkCreateSharedSwapchainsKHR.invokeExact(handles.PFN_vkCreateSharedSwapchainsKHR, device, swapchainCount, pCreateInfos, pAllocator, pSwapchains); }
        catch (Throwable e) { throw new RuntimeException("error in vkCreateSharedSwapchainsKHR", e); }
    }

}
