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
public class VKHUAWEIInvocationMask {
    public static final int VK_HUAWEI_INVOCATION_MASK_SPEC_VERSION = 1;
    public static final String VK_HUAWEI_INVOCATION_MASK_EXTENSION_NAME = "VK_HUAWEI_invocation_mask";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_INVOCATION_MASK_FEATURES_HUAWEI = 1000370000;
    public static final long VK_ACCESS_2_INVOCATION_MASK_READ_BIT_HUAWEI = 0x8000000000L;
    public static final int VK_IMAGE_USAGE_INVOCATION_MASK_BIT_HUAWEI = 0x00040000;
    public static final long VK_PIPELINE_STAGE_2_INVOCATION_MASK_BIT_HUAWEI = 0x10000000000L;
    public static final MethodHandle MH_vkCmdBindInvocationMaskHUAWEI = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_vkCmdBindInvocationMaskHUAWEI;

    public VKHUAWEIInvocationMask(@CType("VkDevice") MemorySegment device, VKLoadFunc func) {
        PFN_vkCmdBindInvocationMaskHUAWEI = func.invoke(device, "vkCmdBindInvocationMaskHUAWEI");
    }

    public void CmdBindInvocationMaskHUAWEI(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("VkImageView") MemorySegment imageView, @CType("VkImageLayout") int imageLayout) {
        if (Unmarshal.isNullPointer(PFN_vkCmdBindInvocationMaskHUAWEI)) throw new SymbolNotFoundError("Symbol not found: vkCmdBindInvocationMaskHUAWEI");
        try { MH_vkCmdBindInvocationMaskHUAWEI.invokeExact(PFN_vkCmdBindInvocationMaskHUAWEI, commandBuffer, imageView, imageLayout); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdBindInvocationMaskHUAWEI", e); }
    }

}
