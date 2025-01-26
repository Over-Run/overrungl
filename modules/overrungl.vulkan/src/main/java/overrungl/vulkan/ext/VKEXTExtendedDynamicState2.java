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
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;
import overrungl.vulkan.*;
public class VKEXTExtendedDynamicState2 {
    public static final int VK_EXT_EXTENDED_DYNAMIC_STATE_2_SPEC_VERSION = 1;
    public static final String VK_EXT_EXTENDED_DYNAMIC_STATE_2_EXTENSION_NAME = "VK_EXT_extended_dynamic_state2";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTENDED_DYNAMIC_STATE_2_FEATURES_EXT = 1000377000;
    public static final int VK_DYNAMIC_STATE_PATCH_CONTROL_POINTS_EXT = 1000377000;
    public static final int VK_DYNAMIC_STATE_RASTERIZER_DISCARD_ENABLE_EXT = 1000377001;
    public static final int VK_DYNAMIC_STATE_DEPTH_BIAS_ENABLE_EXT = 1000377002;
    public static final int VK_DYNAMIC_STATE_LOGIC_OP_EXT = 1000377003;
    public static final int VK_DYNAMIC_STATE_PRIMITIVE_RESTART_ENABLE_EXT = 1000377004;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_vkCmdSetPatchControlPointsEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_vkCmdSetRasterizerDiscardEnableEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_vkCmdSetDepthBiasEnableEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_vkCmdSetLogicOpEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_vkCmdSetPrimitiveRestartEnableEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        public final MemorySegment PFN_vkCmdSetPatchControlPointsEXT;
        public final MemorySegment PFN_vkCmdSetRasterizerDiscardEnableEXT;
        public final MemorySegment PFN_vkCmdSetDepthBiasEnableEXT;
        public final MemorySegment PFN_vkCmdSetLogicOpEXT;
        public final MemorySegment PFN_vkCmdSetPrimitiveRestartEnableEXT;
        private Handles(MemorySegment device, VKLoadFunc func) {
            PFN_vkCmdSetPatchControlPointsEXT = func.invoke(device, "vkCmdSetPatchControlPointsEXT");
            PFN_vkCmdSetRasterizerDiscardEnableEXT = func.invoke(device, "vkCmdSetRasterizerDiscardEnableEXT", "vkCmdSetRasterizerDiscardEnable");
            PFN_vkCmdSetDepthBiasEnableEXT = func.invoke(device, "vkCmdSetDepthBiasEnableEXT", "vkCmdSetDepthBiasEnable");
            PFN_vkCmdSetLogicOpEXT = func.invoke(device, "vkCmdSetLogicOpEXT");
            PFN_vkCmdSetPrimitiveRestartEnableEXT = func.invoke(device, "vkCmdSetPrimitiveRestartEnableEXT", "vkCmdSetPrimitiveRestartEnable");
        }
    }

    public VKEXTExtendedDynamicState2(MemorySegment device, VKLoadFunc func) {
        this.handles = new Handles(device, func);
    }

    /// ```
    /// void vkCmdSetPatchControlPointsEXT(VkCommandBuffer commandBuffer, uint32_t patchControlPoints);
    /// ```
    public void CmdSetPatchControlPointsEXT(MemorySegment commandBuffer, int patchControlPoints) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCmdSetPatchControlPointsEXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetPatchControlPointsEXT");
        try { Handles.MH_vkCmdSetPatchControlPointsEXT.invokeExact(handles.PFN_vkCmdSetPatchControlPointsEXT, commandBuffer, patchControlPoints); }
        catch (Throwable e) { throw new RuntimeException("error in CmdSetPatchControlPointsEXT", e); }
    }

    /// ```
    /// void vkCmdSetRasterizerDiscardEnableEXT(VkCommandBuffer commandBuffer, VkBool32 rasterizerDiscardEnable);
    /// ```
    public void CmdSetRasterizerDiscardEnableEXT(MemorySegment commandBuffer, int rasterizerDiscardEnable) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCmdSetRasterizerDiscardEnableEXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetRasterizerDiscardEnableEXT");
        try { Handles.MH_vkCmdSetRasterizerDiscardEnableEXT.invokeExact(handles.PFN_vkCmdSetRasterizerDiscardEnableEXT, commandBuffer, rasterizerDiscardEnable); }
        catch (Throwable e) { throw new RuntimeException("error in CmdSetRasterizerDiscardEnableEXT", e); }
    }

    /// ```
    /// void vkCmdSetDepthBiasEnableEXT(VkCommandBuffer commandBuffer, VkBool32 depthBiasEnable);
    /// ```
    public void CmdSetDepthBiasEnableEXT(MemorySegment commandBuffer, int depthBiasEnable) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCmdSetDepthBiasEnableEXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetDepthBiasEnableEXT");
        try { Handles.MH_vkCmdSetDepthBiasEnableEXT.invokeExact(handles.PFN_vkCmdSetDepthBiasEnableEXT, commandBuffer, depthBiasEnable); }
        catch (Throwable e) { throw new RuntimeException("error in CmdSetDepthBiasEnableEXT", e); }
    }

    /// ```
    /// void vkCmdSetLogicOpEXT(VkCommandBuffer commandBuffer, VkLogicOp logicOp);
    /// ```
    public void CmdSetLogicOpEXT(MemorySegment commandBuffer, int logicOp) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCmdSetLogicOpEXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetLogicOpEXT");
        try { Handles.MH_vkCmdSetLogicOpEXT.invokeExact(handles.PFN_vkCmdSetLogicOpEXT, commandBuffer, logicOp); }
        catch (Throwable e) { throw new RuntimeException("error in CmdSetLogicOpEXT", e); }
    }

    /// ```
    /// void vkCmdSetPrimitiveRestartEnableEXT(VkCommandBuffer commandBuffer, VkBool32 primitiveRestartEnable);
    /// ```
    public void CmdSetPrimitiveRestartEnableEXT(MemorySegment commandBuffer, int primitiveRestartEnable) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCmdSetPrimitiveRestartEnableEXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetPrimitiveRestartEnableEXT");
        try { Handles.MH_vkCmdSetPrimitiveRestartEnableEXT.invokeExact(handles.PFN_vkCmdSetPrimitiveRestartEnableEXT, commandBuffer, primitiveRestartEnable); }
        catch (Throwable e) { throw new RuntimeException("error in CmdSetPrimitiveRestartEnableEXT", e); }
    }

}
