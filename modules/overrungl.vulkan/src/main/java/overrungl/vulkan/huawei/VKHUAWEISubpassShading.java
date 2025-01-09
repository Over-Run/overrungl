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
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;
import overrungl.vulkan.*;
import static overrungl.vulkan.huawei.VKHUAWEISubpassShading.*;
public class VKHUAWEISubpassShading {
    public static final int VK_HUAWEI_SUBPASS_SHADING_SPEC_VERSION = 3;
    public static final String VK_HUAWEI_SUBPASS_SHADING_EXTENSION_NAME = "VK_HUAWEI_subpass_shading";
    public static final int VK_STRUCTURE_TYPE_SUBPASS_SHADING_PIPELINE_CREATE_INFO_HUAWEI = 1000369000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SUBPASS_SHADING_FEATURES_HUAWEI = 1000369001;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SUBPASS_SHADING_PROPERTIES_HUAWEI = 1000369002;
    public static final int VK_PIPELINE_BIND_POINT_SUBPASS_SHADING_HUAWEI = 1000369003;
    public static final long VK_PIPELINE_STAGE_2_SUBPASS_SHADER_BIT_HUAWEI = 0x8000000000L;
    public static final int VK_SHADER_STAGE_SUBPASS_SHADING_BIT_HUAWEI = 0x00004000;
    public static final long VK_PIPELINE_STAGE_2_SUBPASS_SHADING_BIT_HUAWEI = VK_PIPELINE_STAGE_2_SUBPASS_SHADER_BIT_HUAWEI;
    public static final MethodHandle MH_vkGetDeviceSubpassShadingMaxWorkgroupSizeHUAWEI = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public static final MethodHandle MH_vkCmdSubpassShadingHUAWEI = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
    public final MemorySegment PFN_vkGetDeviceSubpassShadingMaxWorkgroupSizeHUAWEI;
    public final MemorySegment PFN_vkCmdSubpassShadingHUAWEI;

    public VKHUAWEISubpassShading(@CType("VkDevice") MemorySegment device, VKLoadFunc func) {
        PFN_vkGetDeviceSubpassShadingMaxWorkgroupSizeHUAWEI = func.invoke(device, "vkGetDeviceSubpassShadingMaxWorkgroupSizeHUAWEI");
        PFN_vkCmdSubpassShadingHUAWEI = func.invoke(device, "vkCmdSubpassShadingHUAWEI");
    }

    public @CType("VkResult") int GetDeviceSubpassShadingMaxWorkgroupSizeHUAWEI(@CType("VkDevice") MemorySegment device, @CType("VkRenderPass") MemorySegment renderpass, @CType("VkExtent2D *") MemorySegment pMaxWorkgroupSize) {
        if (Unmarshal.isNullPointer(PFN_vkGetDeviceSubpassShadingMaxWorkgroupSizeHUAWEI)) throw new SymbolNotFoundError("Symbol not found: vkGetDeviceSubpassShadingMaxWorkgroupSizeHUAWEI");
        try { return (int) MH_vkGetDeviceSubpassShadingMaxWorkgroupSizeHUAWEI.invokeExact(PFN_vkGetDeviceSubpassShadingMaxWorkgroupSizeHUAWEI, device, renderpass, pMaxWorkgroupSize); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetDeviceSubpassShadingMaxWorkgroupSizeHUAWEI", e); }
    }

    public void CmdSubpassShadingHUAWEI(@CType("VkCommandBuffer") MemorySegment commandBuffer) {
        if (Unmarshal.isNullPointer(PFN_vkCmdSubpassShadingHUAWEI)) throw new SymbolNotFoundError("Symbol not found: vkCmdSubpassShadingHUAWEI");
        try { MH_vkCmdSubpassShadingHUAWEI.invokeExact(PFN_vkCmdSubpassShadingHUAWEI, commandBuffer); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSubpassShadingHUAWEI", e); }
    }

}