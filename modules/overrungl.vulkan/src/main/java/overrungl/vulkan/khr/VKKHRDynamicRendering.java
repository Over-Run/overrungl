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
import static overrungl.vulkan.VK13.*;
public class VKKHRDynamicRendering {
    public static final int VK_KHR_DYNAMIC_RENDERING_SPEC_VERSION = 1;
    public static final String VK_KHR_DYNAMIC_RENDERING_EXTENSION_NAME = "VK_KHR_dynamic_rendering";
    public static final int VK_STRUCTURE_TYPE_RENDERING_INFO_KHR = VK_STRUCTURE_TYPE_RENDERING_INFO;
    public static final int VK_STRUCTURE_TYPE_RENDERING_ATTACHMENT_INFO_KHR = VK_STRUCTURE_TYPE_RENDERING_ATTACHMENT_INFO;
    public static final int VK_STRUCTURE_TYPE_PIPELINE_RENDERING_CREATE_INFO_KHR = VK_STRUCTURE_TYPE_PIPELINE_RENDERING_CREATE_INFO;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DYNAMIC_RENDERING_FEATURES_KHR = VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DYNAMIC_RENDERING_FEATURES;
    public static final int VK_STRUCTURE_TYPE_COMMAND_BUFFER_INHERITANCE_RENDERING_INFO_KHR = VK_STRUCTURE_TYPE_COMMAND_BUFFER_INHERITANCE_RENDERING_INFO;
    public static final int VK_ATTACHMENT_STORE_OP_NONE_KHR = VK_ATTACHMENT_STORE_OP_NONE;
    public static final int VK_RENDERING_CONTENTS_SECONDARY_COMMAND_BUFFERS_BIT_KHR = VK_RENDERING_CONTENTS_SECONDARY_COMMAND_BUFFERS_BIT;
    public static final int VK_RENDERING_SUSPENDING_BIT_KHR = VK_RENDERING_SUSPENDING_BIT;
    public static final int VK_RENDERING_RESUMING_BIT_KHR = VK_RENDERING_RESUMING_BIT;
    public static final MethodHandle MH_vkCmdBeginRenderingKHR = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public static final MethodHandle MH_vkCmdEndRenderingKHR = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
    public final MemorySegment PFN_vkCmdBeginRenderingKHR;
    public final MemorySegment PFN_vkCmdEndRenderingKHR;

    public VKKHRDynamicRendering(@CType("VkDevice") MemorySegment device, VKLoadFunc func) {
        PFN_vkCmdBeginRenderingKHR = func.invoke(device, "vkCmdBeginRenderingKHR", "vkCmdBeginRendering");
        PFN_vkCmdEndRenderingKHR = func.invoke(device, "vkCmdEndRenderingKHR", "vkCmdEndRendering");
    }

    public void CmdBeginRenderingKHR(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("const VkRenderingInfo *") MemorySegment pRenderingInfo) {
        if (Unmarshal.isNullPointer(PFN_vkCmdBeginRenderingKHR)) throw new SymbolNotFoundError("Symbol not found: vkCmdBeginRenderingKHR");
        try { MH_vkCmdBeginRenderingKHR.invokeExact(PFN_vkCmdBeginRenderingKHR, commandBuffer, pRenderingInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdBeginRenderingKHR", e); }
    }

    public void CmdEndRenderingKHR(@CType("VkCommandBuffer") MemorySegment commandBuffer) {
        if (Unmarshal.isNullPointer(PFN_vkCmdEndRenderingKHR)) throw new SymbolNotFoundError("Symbol not found: vkCmdEndRenderingKHR");
        try { MH_vkCmdEndRenderingKHR.invokeExact(PFN_vkCmdEndRenderingKHR, commandBuffer); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdEndRenderingKHR", e); }
    }

}