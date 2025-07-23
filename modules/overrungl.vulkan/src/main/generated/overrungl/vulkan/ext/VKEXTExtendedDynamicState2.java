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
package overrungl.vulkan.ext;
import java.lang.foreign.*;
import java.lang.invoke.*;
import static overrungl.internal.RuntimeHelper.*;
import overrungl.util.*;
import overrungl.vulkan.*;
public final class VKEXTExtendedDynamicState2 {
    public static final int VK_EXT_EXTENDED_DYNAMIC_STATE_2_SPEC_VERSION = 1;
    public static final String VK_EXT_EXTENDED_DYNAMIC_STATE_2_EXTENSION_NAME = "VK_EXT_extended_dynamic_state2";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTENDED_DYNAMIC_STATE_2_FEATURES_EXT = 1000377000;
    public static final int VK_DYNAMIC_STATE_PATCH_CONTROL_POINTS_EXT = 1000377000;
    public static final int VK_DYNAMIC_STATE_RASTERIZER_DISCARD_ENABLE_EXT = 1000377001;
    public static final int VK_DYNAMIC_STATE_DEPTH_BIAS_ENABLE_EXT = 1000377002;
    public static final int VK_DYNAMIC_STATE_LOGIC_OP_EXT = 1000377003;
    public static final int VK_DYNAMIC_STATE_PRIMITIVE_RESTART_ENABLE_EXT = 1000377004;
    public static final class Handles {
        public static final MethodHandle MH_vkCmdSetPatchControlPointsEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_vkCmdSetRasterizerDiscardEnableEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_vkCmdSetDepthBiasEnableEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_vkCmdSetLogicOpEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_vkCmdSetPrimitiveRestartEnableEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        private Handles() {}
    }

    private VKEXTExtendedDynamicState2() {}

    /// ```
    /// void vkCmdSetPatchControlPointsEXT((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, uint32_t patchControlPoints);
    /// ```
    public static void vkCmdSetPatchControlPointsEXT(VkCommandBuffer commandBuffer, int patchControlPoints) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetPatchControlPointsEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdSetPatchControlPointsEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdSetPatchControlPointsEXT", commandBuffer, patchControlPoints); }
        Handles.MH_vkCmdSetPatchControlPointsEXT.invokeExact(commandBuffer.capabilities().PFN_vkCmdSetPatchControlPointsEXT, commandBuffer.segment(), patchControlPoints); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetPatchControlPointsEXT", e); }
    }

    /// ```
    /// void vkCmdSetRasterizerDiscardEnableEXT((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, (uint32_t) VkBool32 rasterizerDiscardEnable);
    /// ```
    public static void vkCmdSetRasterizerDiscardEnableEXT(VkCommandBuffer commandBuffer, int rasterizerDiscardEnable) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetRasterizerDiscardEnableEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdSetRasterizerDiscardEnableEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdSetRasterizerDiscardEnableEXT", commandBuffer, rasterizerDiscardEnable); }
        Handles.MH_vkCmdSetRasterizerDiscardEnableEXT.invokeExact(commandBuffer.capabilities().PFN_vkCmdSetRasterizerDiscardEnableEXT, commandBuffer.segment(), rasterizerDiscardEnable); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetRasterizerDiscardEnableEXT", e); }
    }

    /// ```
    /// void vkCmdSetDepthBiasEnableEXT((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, (uint32_t) VkBool32 depthBiasEnable);
    /// ```
    public static void vkCmdSetDepthBiasEnableEXT(VkCommandBuffer commandBuffer, int depthBiasEnable) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetDepthBiasEnableEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdSetDepthBiasEnableEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdSetDepthBiasEnableEXT", commandBuffer, depthBiasEnable); }
        Handles.MH_vkCmdSetDepthBiasEnableEXT.invokeExact(commandBuffer.capabilities().PFN_vkCmdSetDepthBiasEnableEXT, commandBuffer.segment(), depthBiasEnable); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetDepthBiasEnableEXT", e); }
    }

    /// ```
    /// void vkCmdSetLogicOpEXT((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, (int) VkLogicOp logicOp);
    /// ```
    public static void vkCmdSetLogicOpEXT(VkCommandBuffer commandBuffer, int logicOp) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetLogicOpEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdSetLogicOpEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdSetLogicOpEXT", commandBuffer, logicOp); }
        Handles.MH_vkCmdSetLogicOpEXT.invokeExact(commandBuffer.capabilities().PFN_vkCmdSetLogicOpEXT, commandBuffer.segment(), logicOp); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetLogicOpEXT", e); }
    }

    /// ```
    /// void vkCmdSetPrimitiveRestartEnableEXT((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, (uint32_t) VkBool32 primitiveRestartEnable);
    /// ```
    public static void vkCmdSetPrimitiveRestartEnableEXT(VkCommandBuffer commandBuffer, int primitiveRestartEnable) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetPrimitiveRestartEnableEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdSetPrimitiveRestartEnableEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdSetPrimitiveRestartEnableEXT", commandBuffer, primitiveRestartEnable); }
        Handles.MH_vkCmdSetPrimitiveRestartEnableEXT.invokeExact(commandBuffer.capabilities().PFN_vkCmdSetPrimitiveRestartEnableEXT, commandBuffer.segment(), primitiveRestartEnable); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetPrimitiveRestartEnableEXT", e); }
    }

}
