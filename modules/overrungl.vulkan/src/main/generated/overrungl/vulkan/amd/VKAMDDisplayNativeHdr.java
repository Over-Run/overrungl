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
package overrungl.vulkan.amd;
import java.lang.foreign.*;
import java.lang.invoke.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;
import overrungl.vulkan.*;
public final class VKAMDDisplayNativeHdr {
    public static final int VK_AMD_DISPLAY_NATIVE_HDR_SPEC_VERSION = 1;
    public static final String VK_AMD_DISPLAY_NATIVE_HDR_EXTENSION_NAME = "VK_AMD_display_native_hdr";
    public static final int VK_STRUCTURE_TYPE_DISPLAY_NATIVE_HDR_SURFACE_CAPABILITIES_AMD = 1000213000;
    public static final int VK_STRUCTURE_TYPE_SWAPCHAIN_DISPLAY_NATIVE_HDR_CREATE_INFO_AMD = 1000213001;
    public static final int VK_COLOR_SPACE_DISPLAY_NATIVE_AMD = 1000213000;
    public static final class Handles {
        public static final MethodHandle MH_vkSetLocalDimmingAMD = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT));
        private Handles() {}
    }

    private VKAMDDisplayNativeHdr() {}

    /// ```
    /// void vkSetLocalDimmingAMD((struct VkDevice*) VkDevice device, (uint64_t) VkSwapchainKHR swapChain, (uint32_t) VkBool32 localDimmingEnable);
    /// ```
    public static void vkSetLocalDimmingAMD(VkDevice device, long swapChain, int localDimmingEnable) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkSetLocalDimmingAMD)) throw new VKSymbolNotFoundError("Symbol not found: vkSetLocalDimmingAMD");
        try { Handles.MH_vkSetLocalDimmingAMD.invokeExact(device.capabilities().PFN_vkSetLocalDimmingAMD, device.segment(), swapChain, localDimmingEnable); }
        catch (Throwable e) { throw new RuntimeException("error in vkSetLocalDimmingAMD", e); }
    }

}
