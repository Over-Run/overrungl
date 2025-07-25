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
import static overrungl.internal.RuntimeHelper.*;
import overrungl.util.*;
import overrungl.vulkan.*;
public final class VKKHRCreateRenderpass2 {
    public static final int VK_KHR_CREATE_RENDERPASS_2_SPEC_VERSION = 1;
    public static final String VK_KHR_CREATE_RENDERPASS_2_EXTENSION_NAME = "VK_KHR_create_renderpass2";
    public static final int VK_STRUCTURE_TYPE_ATTACHMENT_DESCRIPTION_2_KHR = 1000109000;
    public static final int VK_STRUCTURE_TYPE_ATTACHMENT_REFERENCE_2_KHR = 1000109001;
    public static final int VK_STRUCTURE_TYPE_SUBPASS_DESCRIPTION_2_KHR = 1000109002;
    public static final int VK_STRUCTURE_TYPE_SUBPASS_DEPENDENCY_2_KHR = 1000109003;
    public static final int VK_STRUCTURE_TYPE_RENDER_PASS_CREATE_INFO_2_KHR = 1000109004;
    public static final int VK_STRUCTURE_TYPE_SUBPASS_BEGIN_INFO_KHR = 1000109005;
    public static final int VK_STRUCTURE_TYPE_SUBPASS_END_INFO_KHR = 1000109006;
    public static final class Handles {
        public static final MethodHandle MH_vkCreateRenderPass2KHR = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdBeginRenderPass2KHR = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdNextSubpass2KHR = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdEndRenderPass2KHR = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        private Handles() {}
    }

    private VKKHRCreateRenderpass2() {}

    /// ```
    /// (int) VkResult vkCreateRenderPass2KHR((struct VkDevice*) VkDevice device, const VkRenderPassCreateInfo2* pCreateInfo, const VkAllocationCallbacks* pAllocator, VkRenderPass* pRenderPass);
    /// ```
    public static int vkCreateRenderPass2KHR(VkDevice device, MemorySegment pCreateInfo, MemorySegment pAllocator, MemorySegment pRenderPass) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkCreateRenderPass2KHR)) throw new VKSymbolNotFoundError("Symbol not found: vkCreateRenderPass2KHR");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCreateRenderPass2KHR", device, pCreateInfo, pAllocator, pRenderPass); }
        return (int) Handles.MH_vkCreateRenderPass2KHR.invokeExact(device.capabilities().PFN_vkCreateRenderPass2KHR, device.segment(), pCreateInfo, pAllocator, pRenderPass); }
        catch (Throwable e) { throw new RuntimeException("error in vkCreateRenderPass2KHR", e); }
    }

    /// ```
    /// void vkCmdBeginRenderPass2KHR((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, const VkRenderPassBeginInfo* pRenderPassBegin, const VkSubpassBeginInfo* pSubpassBeginInfo);
    /// ```
    public static void vkCmdBeginRenderPass2KHR(VkCommandBuffer commandBuffer, MemorySegment pRenderPassBegin, MemorySegment pSubpassBeginInfo) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdBeginRenderPass2KHR)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdBeginRenderPass2KHR");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdBeginRenderPass2KHR", commandBuffer, pRenderPassBegin, pSubpassBeginInfo); }
        Handles.MH_vkCmdBeginRenderPass2KHR.invokeExact(commandBuffer.capabilities().PFN_vkCmdBeginRenderPass2KHR, commandBuffer.segment(), pRenderPassBegin, pSubpassBeginInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdBeginRenderPass2KHR", e); }
    }

    /// ```
    /// void vkCmdNextSubpass2KHR((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, const VkSubpassBeginInfo* pSubpassBeginInfo, const VkSubpassEndInfo* pSubpassEndInfo);
    /// ```
    public static void vkCmdNextSubpass2KHR(VkCommandBuffer commandBuffer, MemorySegment pSubpassBeginInfo, MemorySegment pSubpassEndInfo) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdNextSubpass2KHR)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdNextSubpass2KHR");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdNextSubpass2KHR", commandBuffer, pSubpassBeginInfo, pSubpassEndInfo); }
        Handles.MH_vkCmdNextSubpass2KHR.invokeExact(commandBuffer.capabilities().PFN_vkCmdNextSubpass2KHR, commandBuffer.segment(), pSubpassBeginInfo, pSubpassEndInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdNextSubpass2KHR", e); }
    }

    /// ```
    /// void vkCmdEndRenderPass2KHR((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, const VkSubpassEndInfo* pSubpassEndInfo);
    /// ```
    public static void vkCmdEndRenderPass2KHR(VkCommandBuffer commandBuffer, MemorySegment pSubpassEndInfo) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdEndRenderPass2KHR)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdEndRenderPass2KHR");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdEndRenderPass2KHR", commandBuffer, pSubpassEndInfo); }
        Handles.MH_vkCmdEndRenderPass2KHR.invokeExact(commandBuffer.capabilities().PFN_vkCmdEndRenderPass2KHR, commandBuffer.segment(), pSubpassEndInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdEndRenderPass2KHR", e); }
    }

}
