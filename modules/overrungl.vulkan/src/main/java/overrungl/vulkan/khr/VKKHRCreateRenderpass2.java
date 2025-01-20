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
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;
import overrungl.vulkan.*;
import static overrungl.vulkan.VK12.*;
public class VKKHRCreateRenderpass2 {
    public static final int VK_KHR_CREATE_RENDERPASS_2_SPEC_VERSION = 1;
    public static final String VK_KHR_CREATE_RENDERPASS_2_EXTENSION_NAME = "VK_KHR_create_renderpass2";
    public static final int VK_STRUCTURE_TYPE_ATTACHMENT_DESCRIPTION_2_KHR = VK_STRUCTURE_TYPE_ATTACHMENT_DESCRIPTION_2;
    public static final int VK_STRUCTURE_TYPE_ATTACHMENT_REFERENCE_2_KHR = VK_STRUCTURE_TYPE_ATTACHMENT_REFERENCE_2;
    public static final int VK_STRUCTURE_TYPE_SUBPASS_DESCRIPTION_2_KHR = VK_STRUCTURE_TYPE_SUBPASS_DESCRIPTION_2;
    public static final int VK_STRUCTURE_TYPE_SUBPASS_DEPENDENCY_2_KHR = VK_STRUCTURE_TYPE_SUBPASS_DEPENDENCY_2;
    public static final int VK_STRUCTURE_TYPE_RENDER_PASS_CREATE_INFO_2_KHR = VK_STRUCTURE_TYPE_RENDER_PASS_CREATE_INFO_2;
    public static final int VK_STRUCTURE_TYPE_SUBPASS_BEGIN_INFO_KHR = VK_STRUCTURE_TYPE_SUBPASS_BEGIN_INFO;
    public static final int VK_STRUCTURE_TYPE_SUBPASS_END_INFO_KHR = VK_STRUCTURE_TYPE_SUBPASS_END_INFO;
    private final Handles handles;
    public static final class Descriptors {
        public static final FunctionDescriptor FD_vkCreateRenderPass2KHR = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkCmdBeginRenderPass2KHR = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkCmdNextSubpass2KHR = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkCmdEndRenderPass2KHR = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        private Descriptors() {}
    }
    public static final class Handles {
        public static final MethodHandle MH_vkCreateRenderPass2KHR = RuntimeHelper.downcall(Descriptors.FD_vkCreateRenderPass2KHR);
        public static final MethodHandle MH_vkCmdBeginRenderPass2KHR = RuntimeHelper.downcall(Descriptors.FD_vkCmdBeginRenderPass2KHR);
        public static final MethodHandle MH_vkCmdNextSubpass2KHR = RuntimeHelper.downcall(Descriptors.FD_vkCmdNextSubpass2KHR);
        public static final MethodHandle MH_vkCmdEndRenderPass2KHR = RuntimeHelper.downcall(Descriptors.FD_vkCmdEndRenderPass2KHR);
        public final MemorySegment PFN_vkCreateRenderPass2KHR;
        public final MemorySegment PFN_vkCmdBeginRenderPass2KHR;
        public final MemorySegment PFN_vkCmdNextSubpass2KHR;
        public final MemorySegment PFN_vkCmdEndRenderPass2KHR;
        private Handles(@CType("VkDevice") MemorySegment device, VKLoadFunc func) {
            PFN_vkCreateRenderPass2KHR = func.invoke(device, "vkCreateRenderPass2KHR", "vkCreateRenderPass2");
            PFN_vkCmdBeginRenderPass2KHR = func.invoke(device, "vkCmdBeginRenderPass2KHR", "vkCmdBeginRenderPass2");
            PFN_vkCmdNextSubpass2KHR = func.invoke(device, "vkCmdNextSubpass2KHR", "vkCmdNextSubpass2");
            PFN_vkCmdEndRenderPass2KHR = func.invoke(device, "vkCmdEndRenderPass2KHR", "vkCmdEndRenderPass2");
        }
    }

    public VKKHRCreateRenderpass2(@CType("VkDevice") MemorySegment device, VKLoadFunc func) {
        this.handles = new Handles(device, func);
    }

    public @CType("VkResult") int CreateRenderPass2KHR(@CType("VkDevice") MemorySegment device, @CType("const VkRenderPassCreateInfo2 *") MemorySegment pCreateInfo, @CType("const VkAllocationCallbacks *") MemorySegment pAllocator, @CType("VkRenderPass *") MemorySegment pRenderPass) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCreateRenderPass2KHR)) throw new SymbolNotFoundError("Symbol not found: vkCreateRenderPass2KHR");
        try { return (int) Handles.MH_vkCreateRenderPass2KHR.invokeExact(handles.PFN_vkCreateRenderPass2KHR, device, pCreateInfo, pAllocator, pRenderPass); }
        catch (Throwable e) { throw new RuntimeException("error in vkCreateRenderPass2KHR", e); }
    }

    public void CmdBeginRenderPass2KHR(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("const VkRenderPassBeginInfo *") MemorySegment pRenderPassBegin, @CType("const VkSubpassBeginInfo *") MemorySegment pSubpassBeginInfo) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCmdBeginRenderPass2KHR)) throw new SymbolNotFoundError("Symbol not found: vkCmdBeginRenderPass2KHR");
        try { Handles.MH_vkCmdBeginRenderPass2KHR.invokeExact(handles.PFN_vkCmdBeginRenderPass2KHR, commandBuffer, pRenderPassBegin, pSubpassBeginInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdBeginRenderPass2KHR", e); }
    }

    public void CmdNextSubpass2KHR(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("const VkSubpassBeginInfo *") MemorySegment pSubpassBeginInfo, @CType("const VkSubpassEndInfo *") MemorySegment pSubpassEndInfo) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCmdNextSubpass2KHR)) throw new SymbolNotFoundError("Symbol not found: vkCmdNextSubpass2KHR");
        try { Handles.MH_vkCmdNextSubpass2KHR.invokeExact(handles.PFN_vkCmdNextSubpass2KHR, commandBuffer, pSubpassBeginInfo, pSubpassEndInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdNextSubpass2KHR", e); }
    }

    public void CmdEndRenderPass2KHR(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("const VkSubpassEndInfo *") MemorySegment pSubpassEndInfo) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCmdEndRenderPass2KHR)) throw new SymbolNotFoundError("Symbol not found: vkCmdEndRenderPass2KHR");
        try { Handles.MH_vkCmdEndRenderPass2KHR.invokeExact(handles.PFN_vkCmdEndRenderPass2KHR, commandBuffer, pSubpassEndInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdEndRenderPass2KHR", e); }
    }

}
