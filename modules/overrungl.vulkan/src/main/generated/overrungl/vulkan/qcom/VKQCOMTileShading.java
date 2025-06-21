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
package overrungl.vulkan.qcom;
import java.lang.foreign.*;
import java.lang.invoke.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;
import overrungl.vulkan.*;
public final class VKQCOMTileShading {
    public static final int VK_TILE_SHADING_RENDER_PASS_ENABLE_BIT_QCOM = 0x00000001;
    public static final int VK_TILE_SHADING_RENDER_PASS_PER_TILE_EXECUTION_BIT_QCOM = 0x00000002;
    public static final int VK_QCOM_TILE_SHADING_SPEC_VERSION = 1;
    public static final String VK_QCOM_TILE_SHADING_EXTENSION_NAME = "VK_QCOM_tile_shading";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TILE_SHADING_FEATURES_QCOM = 1000309000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TILE_SHADING_PROPERTIES_QCOM = 1000309001;
    public static final int VK_STRUCTURE_TYPE_RENDER_PASS_TILE_SHADING_CREATE_INFO_QCOM = 1000309002;
    public static final int VK_STRUCTURE_TYPE_PER_TILE_BEGIN_INFO_QCOM = 1000309003;
    public static final int VK_STRUCTURE_TYPE_PER_TILE_END_INFO_QCOM = 1000309004;
    public static final int VK_STRUCTURE_TYPE_DISPATCH_TILE_INFO_QCOM = 1000309005;
    public static final long VK_ACCESS_2_SHADER_TILE_ATTACHMENT_READ_BIT_QCOM = 0x8000000000000L;
    public static final long VK_ACCESS_2_SHADER_TILE_ATTACHMENT_WRITE_BIT_QCOM = 0x10000000000000L;
    public static final int VK_SUBPASS_DESCRIPTION_TILE_SHADING_APRON_BIT_QCOM = 0x00000100;
    public static final class Handles {
        public static final MethodHandle MH_vkCmdDispatchTileQCOM = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdBeginPerTileExecutionQCOM = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdEndPerTileExecutionQCOM = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        private Handles() {}
    }

    private VKQCOMTileShading() {}

    /// ```
    /// void vkCmdDispatchTileQCOM((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, const VkDispatchTileInfoQCOM* pDispatchTileInfo);
    /// ```
    public static void vkCmdDispatchTileQCOM(VkCommandBuffer commandBuffer, MemorySegment pDispatchTileInfo) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdDispatchTileQCOM)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdDispatchTileQCOM");
        try { Handles.MH_vkCmdDispatchTileQCOM.invokeExact(commandBuffer.capabilities().PFN_vkCmdDispatchTileQCOM, commandBuffer.segment(), pDispatchTileInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdDispatchTileQCOM", e); }
    }

    /// ```
    /// void vkCmdBeginPerTileExecutionQCOM((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, const VkPerTileBeginInfoQCOM* pPerTileBeginInfo);
    /// ```
    public static void vkCmdBeginPerTileExecutionQCOM(VkCommandBuffer commandBuffer, MemorySegment pPerTileBeginInfo) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdBeginPerTileExecutionQCOM)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdBeginPerTileExecutionQCOM");
        try { Handles.MH_vkCmdBeginPerTileExecutionQCOM.invokeExact(commandBuffer.capabilities().PFN_vkCmdBeginPerTileExecutionQCOM, commandBuffer.segment(), pPerTileBeginInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdBeginPerTileExecutionQCOM", e); }
    }

    /// ```
    /// void vkCmdEndPerTileExecutionQCOM((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, const VkPerTileEndInfoQCOM* pPerTileEndInfo);
    /// ```
    public static void vkCmdEndPerTileExecutionQCOM(VkCommandBuffer commandBuffer, MemorySegment pPerTileEndInfo) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdEndPerTileExecutionQCOM)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdEndPerTileExecutionQCOM");
        try { Handles.MH_vkCmdEndPerTileExecutionQCOM.invokeExact(commandBuffer.capabilities().PFN_vkCmdEndPerTileExecutionQCOM, commandBuffer.segment(), pPerTileEndInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdEndPerTileExecutionQCOM", e); }
    }

}
