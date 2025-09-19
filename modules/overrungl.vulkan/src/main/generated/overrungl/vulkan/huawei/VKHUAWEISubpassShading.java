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
package overrungl.vulkan.huawei;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.vulkan.*;
import static overrungl.internal.RuntimeHelper.*;
/// `VK_HUAWEI_subpass_shading` - device extension
public final class VKHUAWEISubpassShading {
    public static final int VK_HUAWEI_SUBPASS_SHADING_SPEC_VERSION = 3;
    public static final String VK_HUAWEI_SUBPASS_SHADING_EXTENSION_NAME = "VK_HUAWEI_subpass_shading";
    public static final int VK_STRUCTURE_TYPE_SUBPASS_SHADING_PIPELINE_CREATE_INFO_HUAWEI = 1000369000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SUBPASS_SHADING_FEATURES_HUAWEI = 1000369001;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SUBPASS_SHADING_PROPERTIES_HUAWEI = 1000369002;
    public static final int VK_PIPELINE_BIND_POINT_SUBPASS_SHADING_HUAWEI = 1000369003;
    public static final long VK_PIPELINE_STAGE_2_SUBPASS_SHADER_BIT_HUAWEI = 0x8000000000L;
    public static final long VK_PIPELINE_STAGE_2_SUBPASS_SHADING_BIT_HUAWEI = 0x8000000000L;
    public static final int VK_SHADER_STAGE_SUBPASS_SHADING_BIT_HUAWEI = 0x00004000;
    public static final class Handles {
        public static final MethodHandle MH_vkGetDeviceSubpassShadingMaxWorkgroupSizeHUAWEI = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdSubpassShadingHUAWEI = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
        private Handles() {}
    }

    private VKHUAWEISubpassShading() {}

    /// Invokes `vkGetDeviceSubpassShadingMaxWorkgroupSizeHUAWEI`.
    /// ```
    /// (int) VkResult vkGetDeviceSubpassShadingMaxWorkgroupSizeHUAWEI((struct VkDevice*) VkDevice device, (uint64_t) VkRenderPass renderpass, VkExtent2D* pMaxWorkgroupSize);
    /// ```
    public static int vkGetDeviceSubpassShadingMaxWorkgroupSizeHUAWEI(@NonNull VkDevice device, long renderpass, @NonNull MemorySegment pMaxWorkgroupSize) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkGetDeviceSubpassShadingMaxWorkgroupSizeHUAWEI)) throw new VKSymbolNotFoundError("Symbol not found: vkGetDeviceSubpassShadingMaxWorkgroupSizeHUAWEI");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkGetDeviceSubpassShadingMaxWorkgroupSizeHUAWEI", device, renderpass, pMaxWorkgroupSize); }
        return (int) Handles.MH_vkGetDeviceSubpassShadingMaxWorkgroupSizeHUAWEI.invokeExact(device.capabilities().PFN_vkGetDeviceSubpassShadingMaxWorkgroupSizeHUAWEI, device.segment(), renderpass, pMaxWorkgroupSize); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetDeviceSubpassShadingMaxWorkgroupSizeHUAWEI", e); }
    }

    /// Invokes `vkCmdSubpassShadingHUAWEI`.
    /// ```
    /// void vkCmdSubpassShadingHUAWEI((struct VkCommandBuffer*) VkCommandBuffer commandBuffer);
    /// ```
    public static void vkCmdSubpassShadingHUAWEI(@NonNull VkCommandBuffer commandBuffer) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSubpassShadingHUAWEI)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdSubpassShadingHUAWEI");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdSubpassShadingHUAWEI", commandBuffer); }
        Handles.MH_vkCmdSubpassShadingHUAWEI.invokeExact(commandBuffer.capabilities().PFN_vkCmdSubpassShadingHUAWEI, commandBuffer.segment()); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSubpassShadingHUAWEI", e); }
    }

}
