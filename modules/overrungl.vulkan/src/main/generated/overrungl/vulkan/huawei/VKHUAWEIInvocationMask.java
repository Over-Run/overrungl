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
/// `VK_HUAWEI_invocation_mask` - device extension
public final class VKHUAWEIInvocationMask {
    public static final int VK_HUAWEI_INVOCATION_MASK_SPEC_VERSION = 1;
    public static final String VK_HUAWEI_INVOCATION_MASK_EXTENSION_NAME = "VK_HUAWEI_invocation_mask";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_INVOCATION_MASK_FEATURES_HUAWEI = 1000370000;
    public static final long VK_ACCESS_2_INVOCATION_MASK_READ_BIT_HUAWEI = 0x8000000000L;
    public static final int VK_IMAGE_USAGE_INVOCATION_MASK_BIT_HUAWEI = 0x00040000;
    public static final long VK_PIPELINE_STAGE_2_INVOCATION_MASK_BIT_HUAWEI = 0x10000000000L;
    public static final class Handles {
        public static final MethodHandle MH_vkCmdBindInvocationMaskHUAWEI = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT));
        private Handles() {}
    }

    private VKHUAWEIInvocationMask() {}

    /// Invokes `vkCmdBindInvocationMaskHUAWEI`.
    /// ```
    /// void vkCmdBindInvocationMaskHUAWEI((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, (uint64_t) VkImageView imageView, (int) VkImageLayout imageLayout);
    /// ```
    public static void vkCmdBindInvocationMaskHUAWEI(@NonNull VkCommandBuffer commandBuffer, long imageView, int imageLayout) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdBindInvocationMaskHUAWEI)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdBindInvocationMaskHUAWEI");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdBindInvocationMaskHUAWEI", commandBuffer, imageView, imageLayout); }
        Handles.MH_vkCmdBindInvocationMaskHUAWEI.invokeExact(commandBuffer.capabilities().PFN_vkCmdBindInvocationMaskHUAWEI, commandBuffer.segment(), imageView, imageLayout); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdBindInvocationMaskHUAWEI", e); }
    }

}
