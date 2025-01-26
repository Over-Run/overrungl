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
public class VKNVDeviceDiagnosticCheckpoints {
    public static final int VK_NV_DEVICE_DIAGNOSTIC_CHECKPOINTS_SPEC_VERSION = 2;
    public static final String VK_NV_DEVICE_DIAGNOSTIC_CHECKPOINTS_EXTENSION_NAME = "VK_NV_device_diagnostic_checkpoints";
    public static final int VK_STRUCTURE_TYPE_CHECKPOINT_DATA_NV = 1000206000;
    public static final int VK_STRUCTURE_TYPE_QUEUE_FAMILY_CHECKPOINT_PROPERTIES_NV = 1000206001;
    public static final int VK_STRUCTURE_TYPE_QUEUE_FAMILY_CHECKPOINT_PROPERTIES_2_NV = 1000206008;
    public static final int VK_STRUCTURE_TYPE_CHECKPOINT_DATA_2_NV = 1000206009;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_vkCmdSetCheckpointNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetQueueCheckpointDataNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetQueueCheckpointData2NV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public final MemorySegment PFN_vkCmdSetCheckpointNV;
        public final MemorySegment PFN_vkGetQueueCheckpointDataNV;
        public final MemorySegment PFN_vkGetQueueCheckpointData2NV;
        private Handles(MemorySegment device, VKLoadFunc func) {
            PFN_vkCmdSetCheckpointNV = func.invoke(device, "vkCmdSetCheckpointNV");
            PFN_vkGetQueueCheckpointDataNV = func.invoke(device, "vkGetQueueCheckpointDataNV");
            PFN_vkGetQueueCheckpointData2NV = func.invoke(device, "vkGetQueueCheckpointData2NV");
        }
    }

    public VKNVDeviceDiagnosticCheckpoints(MemorySegment device, VKLoadFunc func) {
        this.handles = new Handles(device, func);
    }

    /// ```
    /// void vkCmdSetCheckpointNV(VkCommandBuffer commandBuffer, const void* pCheckpointMarker);
    /// ```
    public void CmdSetCheckpointNV(MemorySegment commandBuffer, MemorySegment pCheckpointMarker) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCmdSetCheckpointNV)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetCheckpointNV");
        try { Handles.MH_vkCmdSetCheckpointNV.invokeExact(handles.PFN_vkCmdSetCheckpointNV, commandBuffer, pCheckpointMarker); }
        catch (Throwable e) { throw new RuntimeException("error in CmdSetCheckpointNV", e); }
    }

    /// ```
    /// void vkGetQueueCheckpointDataNV(VkQueue queue, uint32_t* pCheckpointDataCount, VkCheckpointDataNV* pCheckpointData);
    /// ```
    public void GetQueueCheckpointDataNV(MemorySegment queue, MemorySegment pCheckpointDataCount, MemorySegment pCheckpointData) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkGetQueueCheckpointDataNV)) throw new SymbolNotFoundError("Symbol not found: vkGetQueueCheckpointDataNV");
        try { Handles.MH_vkGetQueueCheckpointDataNV.invokeExact(handles.PFN_vkGetQueueCheckpointDataNV, queue, pCheckpointDataCount, pCheckpointData); }
        catch (Throwable e) { throw new RuntimeException("error in GetQueueCheckpointDataNV", e); }
    }

    /// ```
    /// void vkGetQueueCheckpointData2NV(VkQueue queue, uint32_t* pCheckpointDataCount, VkCheckpointData2NV* pCheckpointData);
    /// ```
    public void GetQueueCheckpointData2NV(MemorySegment queue, MemorySegment pCheckpointDataCount, MemorySegment pCheckpointData) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkGetQueueCheckpointData2NV)) throw new SymbolNotFoundError("Symbol not found: vkGetQueueCheckpointData2NV");
        try { Handles.MH_vkGetQueueCheckpointData2NV.invokeExact(handles.PFN_vkGetQueueCheckpointData2NV, queue, pCheckpointDataCount, pCheckpointData); }
        catch (Throwable e) { throw new RuntimeException("error in GetQueueCheckpointData2NV", e); }
    }

}
