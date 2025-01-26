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
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;
import overrungl.vulkan.*;
public final class VKNVScissorExclusive {
    public static final int VK_NV_SCISSOR_EXCLUSIVE_SPEC_VERSION = 2;
    public static final String VK_NV_SCISSOR_EXCLUSIVE_EXTENSION_NAME = "VK_NV_scissor_exclusive";
    public static final int VK_STRUCTURE_TYPE_PIPELINE_VIEWPORT_EXCLUSIVE_SCISSOR_STATE_CREATE_INFO_NV = 1000205000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXCLUSIVE_SCISSOR_FEATURES_NV = 1000205002;
    public static final int VK_DYNAMIC_STATE_EXCLUSIVE_SCISSOR_ENABLE_NV = 1000205000;
    public static final int VK_DYNAMIC_STATE_EXCLUSIVE_SCISSOR_NV = 1000205001;
    public static final class Handles {
        public static final MethodHandle MH_vkCmdSetExclusiveScissorEnableNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdSetExclusiveScissorNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        private Handles() {}
    }

    private VKNVScissorExclusive() {}

    /// ```
    /// void vkCmdSetExclusiveScissorEnableNV((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, uint32_t firstExclusiveScissor, uint32_t exclusiveScissorCount, const VkBool32* pExclusiveScissorEnables);
    /// ```
    public static void vkCmdSetExclusiveScissorEnableNV(VkCommandBuffer commandBuffer, int firstExclusiveScissor, int exclusiveScissorCount, MemorySegment pExclusiveScissorEnables) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetExclusiveScissorEnableNV)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetExclusiveScissorEnableNV");
        try { Handles.MH_vkCmdSetExclusiveScissorEnableNV.invokeExact(commandBuffer.capabilities().PFN_vkCmdSetExclusiveScissorEnableNV, commandBuffer.segment(), firstExclusiveScissor, exclusiveScissorCount, pExclusiveScissorEnables); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetExclusiveScissorEnableNV", e); }
    }

    /// ```
    /// void vkCmdSetExclusiveScissorNV((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, uint32_t firstExclusiveScissor, uint32_t exclusiveScissorCount, const VkRect2D* pExclusiveScissors);
    /// ```
    public static void vkCmdSetExclusiveScissorNV(VkCommandBuffer commandBuffer, int firstExclusiveScissor, int exclusiveScissorCount, MemorySegment pExclusiveScissors) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetExclusiveScissorNV)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetExclusiveScissorNV");
        try { Handles.MH_vkCmdSetExclusiveScissorNV.invokeExact(commandBuffer.capabilities().PFN_vkCmdSetExclusiveScissorNV, commandBuffer.segment(), firstExclusiveScissor, exclusiveScissorCount, pExclusiveScissors); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetExclusiveScissorNV", e); }
    }

}
