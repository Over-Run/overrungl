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
public class VKKHRMaintenance1 {
    public static final int VK_KHR_MAINTENANCE_1_SPEC_VERSION = 2;
    public static final String VK_KHR_MAINTENANCE_1_EXTENSION_NAME = "VK_KHR_maintenance1";
    public static final int VK_KHR_MAINTENANCE1_SPEC_VERSION = 2;
    public static final String VK_KHR_MAINTENANCE1_EXTENSION_NAME = "VK_KHR_maintenance1";
    public static final int VK_ERROR_OUT_OF_POOL_MEMORY_KHR = -1000069000;
    public static final int VK_FORMAT_FEATURE_TRANSFER_SRC_BIT_KHR = 0x00004000;
    public static final int VK_FORMAT_FEATURE_TRANSFER_DST_BIT_KHR = 0x00008000;
    public static final int VK_IMAGE_CREATE_2D_ARRAY_COMPATIBLE_BIT_KHR = 0x00000020;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_vkTrimCommandPoolKHR = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT));
        public final MemorySegment PFN_vkTrimCommandPoolKHR;
        private Handles(MemorySegment device, VKLoadFunc func) {
            PFN_vkTrimCommandPoolKHR = func.invoke(device, "vkTrimCommandPoolKHR", "vkTrimCommandPool");
        }
    }

    public VKKHRMaintenance1(MemorySegment device, VKLoadFunc func) {
        this.handles = new Handles(device, func);
    }

    /// ```
    /// void vkTrimCommandPoolKHR(VkDevice device, VkCommandPool commandPool, VkCommandPoolTrimFlags flags);
    /// ```
    public void TrimCommandPoolKHR(MemorySegment device, long commandPool, int flags) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkTrimCommandPoolKHR)) throw new SymbolNotFoundError("Symbol not found: vkTrimCommandPoolKHR");
        try { Handles.MH_vkTrimCommandPoolKHR.invokeExact(handles.PFN_vkTrimCommandPoolKHR, device, commandPool, flags); }
        catch (Throwable e) { throw new RuntimeException("error in TrimCommandPoolKHR", e); }
    }

}
