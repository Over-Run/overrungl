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
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;
import overrungl.vulkan.*;
public class VKAMDDisplayNativeHdr {
    public static final int VK_AMD_DISPLAY_NATIVE_HDR_SPEC_VERSION = 1;
    public static final String VK_AMD_DISPLAY_NATIVE_HDR_EXTENSION_NAME = "VK_AMD_display_native_hdr";
    public static final int VK_STRUCTURE_TYPE_DISPLAY_NATIVE_HDR_SURFACE_CAPABILITIES_AMD = 1000213000;
    public static final int VK_STRUCTURE_TYPE_SWAPCHAIN_DISPLAY_NATIVE_HDR_CREATE_INFO_AMD = 1000213001;
    public static final int VK_COLOR_SPACE_DISPLAY_NATIVE_AMD = 1000213000;
    public static final MethodHandle MH_vkSetLocalDimmingAMD = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_vkSetLocalDimmingAMD;

    public VKAMDDisplayNativeHdr(@CType("VkDevice") MemorySegment device, VKLoadFunc func) {
        PFN_vkSetLocalDimmingAMD = func.invoke(device, "vkSetLocalDimmingAMD");
    }

    public void SetLocalDimmingAMD(@CType("VkDevice") MemorySegment device, @CType("VkSwapchainKHR") MemorySegment swapChain, @CType("VkBool32") int localDimmingEnable) {
        if (Unmarshal.isNullPointer(PFN_vkSetLocalDimmingAMD)) throw new SymbolNotFoundError("Symbol not found: vkSetLocalDimmingAMD");
        try { MH_vkSetLocalDimmingAMD.invokeExact(PFN_vkSetLocalDimmingAMD, device, swapChain, localDimmingEnable); }
        catch (Throwable e) { throw new RuntimeException("error in vkSetLocalDimmingAMD", e); }
    }

}
