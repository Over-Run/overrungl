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
public final class VKNVDeviceDiagnosticCheckpoints {
    public static final int VK_NV_DEVICE_DIAGNOSTIC_CHECKPOINTS_SPEC_VERSION = 2;
    public static final String VK_NV_DEVICE_DIAGNOSTIC_CHECKPOINTS_EXTENSION_NAME = "VK_NV_device_diagnostic_checkpoints";
    public static final int VK_STRUCTURE_TYPE_CHECKPOINT_DATA_NV = 1000206000;
    public static final int VK_STRUCTURE_TYPE_QUEUE_FAMILY_CHECKPOINT_PROPERTIES_NV = 1000206001;
    public static final int VK_STRUCTURE_TYPE_QUEUE_FAMILY_CHECKPOINT_PROPERTIES_2_NV = 1000206008;
    public static final int VK_STRUCTURE_TYPE_CHECKPOINT_DATA_2_NV = 1000206009;
    public static final class Handles {
        public static final MethodHandle MH_vkCmdSetCheckpointNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetQueueCheckpointDataNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetQueueCheckpointData2NV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        private Handles() {}
    }

    private VKNVDeviceDiagnosticCheckpoints() {}

    /// ```
    /// void vkCmdSetCheckpointNV((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, const void* pCheckpointMarker);
    /// ```
    public static void vkCmdSetCheckpointNV(VkCommandBuffer commandBuffer, MemorySegment pCheckpointMarker) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetCheckpointNV)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdSetCheckpointNV");
        try { Handles.MH_vkCmdSetCheckpointNV.invokeExact(commandBuffer.capabilities().PFN_vkCmdSetCheckpointNV, commandBuffer.segment(), pCheckpointMarker); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetCheckpointNV", e); }
    }

    /// ```
    /// void vkGetQueueCheckpointDataNV((struct VkQueue*) VkQueue queue, uint32_t* pCheckpointDataCount, VkCheckpointDataNV* pCheckpointData);
    /// ```
    public static void vkGetQueueCheckpointDataNV(VkQueue queue, MemorySegment pCheckpointDataCount, MemorySegment pCheckpointData) {
        if (MemoryUtil.isNullPointer(queue.capabilities().PFN_vkGetQueueCheckpointDataNV)) throw new VKSymbolNotFoundError("Symbol not found: vkGetQueueCheckpointDataNV");
        try { Handles.MH_vkGetQueueCheckpointDataNV.invokeExact(queue.capabilities().PFN_vkGetQueueCheckpointDataNV, queue.segment(), pCheckpointDataCount, pCheckpointData); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetQueueCheckpointDataNV", e); }
    }

    /// ```
    /// void vkGetQueueCheckpointData2NV((struct VkQueue*) VkQueue queue, uint32_t* pCheckpointDataCount, VkCheckpointData2NV* pCheckpointData);
    /// ```
    public static void vkGetQueueCheckpointData2NV(VkQueue queue, MemorySegment pCheckpointDataCount, MemorySegment pCheckpointData) {
        if (MemoryUtil.isNullPointer(queue.capabilities().PFN_vkGetQueueCheckpointData2NV)) throw new VKSymbolNotFoundError("Symbol not found: vkGetQueueCheckpointData2NV");
        try { Handles.MH_vkGetQueueCheckpointData2NV.invokeExact(queue.capabilities().PFN_vkGetQueueCheckpointData2NV, queue.segment(), pCheckpointDataCount, pCheckpointData); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetQueueCheckpointData2NV", e); }
    }

}
