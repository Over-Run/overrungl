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
package overrungl.vulkan.nv;
import java.lang.foreign.*;
import java.lang.invoke.*;
import static overrungl.internal.RuntimeHelper.*;
import overrungl.util.*;
import overrungl.vulkan.*;
public final class VKNVClipSpaceWScaling {
    public static final int VK_NV_CLIP_SPACE_W_SCALING_SPEC_VERSION = 1;
    public static final String VK_NV_CLIP_SPACE_W_SCALING_EXTENSION_NAME = "VK_NV_clip_space_w_scaling";
    public static final int VK_STRUCTURE_TYPE_PIPELINE_VIEWPORT_W_SCALING_STATE_CREATE_INFO_NV = 1000087000;
    public static final int VK_DYNAMIC_STATE_VIEWPORT_W_SCALING_NV = 1000087000;
    public static final class Handles {
        public static final MethodHandle MH_vkCmdSetViewportWScalingNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        private Handles() {}
    }

    private VKNVClipSpaceWScaling() {}

    /// ```
    /// void vkCmdSetViewportWScalingNV((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, uint32_t firstViewport, uint32_t viewportCount, const VkViewportWScalingNV* pViewportWScalings);
    /// ```
    public static void vkCmdSetViewportWScalingNV(VkCommandBuffer commandBuffer, int firstViewport, int viewportCount, MemorySegment pViewportWScalings) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetViewportWScalingNV)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdSetViewportWScalingNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdSetViewportWScalingNV", commandBuffer, firstViewport, viewportCount, pViewportWScalings); }
        Handles.MH_vkCmdSetViewportWScalingNV.invokeExact(commandBuffer.capabilities().PFN_vkCmdSetViewportWScalingNV, commandBuffer.segment(), firstViewport, viewportCount, pViewportWScalings); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetViewportWScalingNV", e); }
    }

}
