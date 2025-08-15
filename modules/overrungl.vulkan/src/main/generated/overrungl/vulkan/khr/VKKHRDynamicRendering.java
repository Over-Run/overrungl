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
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.vulkan.*;
import static overrungl.internal.RuntimeHelper.*;
/// `VK_KHR_dynamic_rendering` - device extension
public final class VKKHRDynamicRendering {
    public static final int VK_KHR_DYNAMIC_RENDERING_SPEC_VERSION = 1;
    public static final String VK_KHR_DYNAMIC_RENDERING_EXTENSION_NAME = "VK_KHR_dynamic_rendering";
    public static final int VK_STRUCTURE_TYPE_RENDERING_INFO_KHR = 1000044000;
    public static final int VK_STRUCTURE_TYPE_RENDERING_ATTACHMENT_INFO_KHR = 1000044001;
    public static final int VK_STRUCTURE_TYPE_PIPELINE_RENDERING_CREATE_INFO_KHR = 1000044002;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DYNAMIC_RENDERING_FEATURES_KHR = 1000044003;
    public static final int VK_STRUCTURE_TYPE_COMMAND_BUFFER_INHERITANCE_RENDERING_INFO_KHR = 1000044004;
    public static final int VK_ATTACHMENT_STORE_OP_NONE_KHR = 1000301000;
    public static final int VK_RENDERING_CONTENTS_SECONDARY_COMMAND_BUFFERS_BIT_KHR = 0x00000001;
    public static final int VK_RENDERING_SUSPENDING_BIT_KHR = 0x00000002;
    public static final int VK_RENDERING_RESUMING_BIT_KHR = 0x00000004;
    public static final class Handles {
        public static final MethodHandle MH_vkCmdBeginRenderingKHR = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdEndRenderingKHR = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
        private Handles() {}
    }

    private VKKHRDynamicRendering() {}

    /// Invokes `vkCmdBeginRenderingKHR`.
    /// ```
    /// void vkCmdBeginRenderingKHR((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, const VkRenderingInfo* pRenderingInfo);
    /// ```
    public static void vkCmdBeginRenderingKHR(@NonNull VkCommandBuffer commandBuffer, @NonNull MemorySegment pRenderingInfo) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdBeginRenderingKHR)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdBeginRenderingKHR");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdBeginRenderingKHR", commandBuffer, pRenderingInfo); }
        Handles.MH_vkCmdBeginRenderingKHR.invokeExact(commandBuffer.capabilities().PFN_vkCmdBeginRenderingKHR, commandBuffer.segment(), pRenderingInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdBeginRenderingKHR", e); }
    }

    /// Invokes `vkCmdEndRenderingKHR`.
    /// ```
    /// void vkCmdEndRenderingKHR((struct VkCommandBuffer*) VkCommandBuffer commandBuffer);
    /// ```
    public static void vkCmdEndRenderingKHR(@NonNull VkCommandBuffer commandBuffer) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdEndRenderingKHR)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdEndRenderingKHR");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdEndRenderingKHR", commandBuffer); }
        Handles.MH_vkCmdEndRenderingKHR.invokeExact(commandBuffer.capabilities().PFN_vkCmdEndRenderingKHR, commandBuffer.segment()); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdEndRenderingKHR", e); }
    }

}
