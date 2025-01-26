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
public class VKKHRCreateRenderpass2 {
    public static final int VK_KHR_CREATE_RENDERPASS_2_SPEC_VERSION = 1;
    public static final String VK_KHR_CREATE_RENDERPASS_2_EXTENSION_NAME = "VK_KHR_create_renderpass2";
    public static final int VK_STRUCTURE_TYPE_ATTACHMENT_DESCRIPTION_2_KHR = 1000109000;
    public static final int VK_STRUCTURE_TYPE_ATTACHMENT_REFERENCE_2_KHR = 1000109001;
    public static final int VK_STRUCTURE_TYPE_SUBPASS_DESCRIPTION_2_KHR = 1000109002;
    public static final int VK_STRUCTURE_TYPE_SUBPASS_DEPENDENCY_2_KHR = 1000109003;
    public static final int VK_STRUCTURE_TYPE_RENDER_PASS_CREATE_INFO_2_KHR = 1000109004;
    public static final int VK_STRUCTURE_TYPE_SUBPASS_BEGIN_INFO_KHR = 1000109005;
    public static final int VK_STRUCTURE_TYPE_SUBPASS_END_INFO_KHR = 1000109006;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_vkCreateRenderPass2KHR = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdBeginRenderPass2KHR = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdNextSubpass2KHR = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdEndRenderPass2KHR = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public final MemorySegment PFN_vkCreateRenderPass2KHR;
        public final MemorySegment PFN_vkCmdBeginRenderPass2KHR;
        public final MemorySegment PFN_vkCmdNextSubpass2KHR;
        public final MemorySegment PFN_vkCmdEndRenderPass2KHR;
        private Handles(MemorySegment device, VKLoadFunc func) {
            PFN_vkCreateRenderPass2KHR = func.invoke(device, "vkCreateRenderPass2KHR", "vkCreateRenderPass2");
            PFN_vkCmdBeginRenderPass2KHR = func.invoke(device, "vkCmdBeginRenderPass2KHR", "vkCmdBeginRenderPass2");
            PFN_vkCmdNextSubpass2KHR = func.invoke(device, "vkCmdNextSubpass2KHR", "vkCmdNextSubpass2");
            PFN_vkCmdEndRenderPass2KHR = func.invoke(device, "vkCmdEndRenderPass2KHR", "vkCmdEndRenderPass2");
        }
    }

    public VKKHRCreateRenderpass2(MemorySegment device, VKLoadFunc func) {
        this.handles = new Handles(device, func);
    }

    /// ```
    /// VkResult vkCreateRenderPass2KHR(VkDevice device, const VkRenderPassCreateInfo2* pCreateInfo, const VkAllocationCallbacks* pAllocator, VkRenderPass* pRenderPass);
    /// ```
    public int CreateRenderPass2KHR(MemorySegment device, MemorySegment pCreateInfo, MemorySegment pAllocator, MemorySegment pRenderPass) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCreateRenderPass2KHR)) throw new SymbolNotFoundError("Symbol not found: vkCreateRenderPass2KHR");
        try { return (int) Handles.MH_vkCreateRenderPass2KHR.invokeExact(handles.PFN_vkCreateRenderPass2KHR, device, pCreateInfo, pAllocator, pRenderPass); }
        catch (Throwable e) { throw new RuntimeException("error in CreateRenderPass2KHR", e); }
    }

    /// ```
    /// void vkCmdBeginRenderPass2KHR(VkCommandBuffer commandBuffer, const VkRenderPassBeginInfo* pRenderPassBegin, const VkSubpassBeginInfo* pSubpassBeginInfo);
    /// ```
    public void CmdBeginRenderPass2KHR(MemorySegment commandBuffer, MemorySegment pRenderPassBegin, MemorySegment pSubpassBeginInfo) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCmdBeginRenderPass2KHR)) throw new SymbolNotFoundError("Symbol not found: vkCmdBeginRenderPass2KHR");
        try { Handles.MH_vkCmdBeginRenderPass2KHR.invokeExact(handles.PFN_vkCmdBeginRenderPass2KHR, commandBuffer, pRenderPassBegin, pSubpassBeginInfo); }
        catch (Throwable e) { throw new RuntimeException("error in CmdBeginRenderPass2KHR", e); }
    }

    /// ```
    /// void vkCmdNextSubpass2KHR(VkCommandBuffer commandBuffer, const VkSubpassBeginInfo* pSubpassBeginInfo, const VkSubpassEndInfo* pSubpassEndInfo);
    /// ```
    public void CmdNextSubpass2KHR(MemorySegment commandBuffer, MemorySegment pSubpassBeginInfo, MemorySegment pSubpassEndInfo) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCmdNextSubpass2KHR)) throw new SymbolNotFoundError("Symbol not found: vkCmdNextSubpass2KHR");
        try { Handles.MH_vkCmdNextSubpass2KHR.invokeExact(handles.PFN_vkCmdNextSubpass2KHR, commandBuffer, pSubpassBeginInfo, pSubpassEndInfo); }
        catch (Throwable e) { throw new RuntimeException("error in CmdNextSubpass2KHR", e); }
    }

    /// ```
    /// void vkCmdEndRenderPass2KHR(VkCommandBuffer commandBuffer, const VkSubpassEndInfo* pSubpassEndInfo);
    /// ```
    public void CmdEndRenderPass2KHR(MemorySegment commandBuffer, MemorySegment pSubpassEndInfo) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCmdEndRenderPass2KHR)) throw new SymbolNotFoundError("Symbol not found: vkCmdEndRenderPass2KHR");
        try { Handles.MH_vkCmdEndRenderPass2KHR.invokeExact(handles.PFN_vkCmdEndRenderPass2KHR, commandBuffer, pSubpassEndInfo); }
        catch (Throwable e) { throw new RuntimeException("error in CmdEndRenderPass2KHR", e); }
    }

}
