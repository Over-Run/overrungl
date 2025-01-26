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
package overrungl.vulkan.intel;
import java.lang.foreign.*;
import java.lang.invoke.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;
import overrungl.vulkan.*;
public class VKINTELPerformanceQuery {
    public static final int VK_PERFORMANCE_CONFIGURATION_TYPE_COMMAND_QUEUE_METRICS_DISCOVERY_ACTIVATED_INTEL = 0;
    public static final int VK_QUERY_POOL_SAMPLING_MODE_MANUAL_INTEL = 0;
    public static final int VK_PERFORMANCE_OVERRIDE_TYPE_NULL_HARDWARE_INTEL = 0;
    public static final int VK_PERFORMANCE_OVERRIDE_TYPE_FLUSH_GPU_CACHES_INTEL = 1;
    public static final int VK_PERFORMANCE_PARAMETER_TYPE_HW_COUNTERS_SUPPORTED_INTEL = 0;
    public static final int VK_PERFORMANCE_PARAMETER_TYPE_STREAM_MARKER_VALID_BITS_INTEL = 1;
    public static final int VK_PERFORMANCE_VALUE_TYPE_UINT32_INTEL = 0;
    public static final int VK_PERFORMANCE_VALUE_TYPE_UINT64_INTEL = 1;
    public static final int VK_PERFORMANCE_VALUE_TYPE_FLOAT_INTEL = 2;
    public static final int VK_PERFORMANCE_VALUE_TYPE_BOOL_INTEL = 3;
    public static final int VK_PERFORMANCE_VALUE_TYPE_STRING_INTEL = 4;
    public static final int VK_INTEL_PERFORMANCE_QUERY_SPEC_VERSION = 2;
    public static final String VK_INTEL_PERFORMANCE_QUERY_EXTENSION_NAME = "VK_INTEL_performance_query";
    public static final int VK_STRUCTURE_TYPE_QUERY_POOL_PERFORMANCE_QUERY_CREATE_INFO_INTEL = 1000210000;
    public static final int VK_STRUCTURE_TYPE_QUERY_POOL_CREATE_INFO_INTEL = 1000210000;
    public static final int VK_STRUCTURE_TYPE_INITIALIZE_PERFORMANCE_API_INFO_INTEL = 1000210001;
    public static final int VK_STRUCTURE_TYPE_PERFORMANCE_MARKER_INFO_INTEL = 1000210002;
    public static final int VK_STRUCTURE_TYPE_PERFORMANCE_STREAM_MARKER_INFO_INTEL = 1000210003;
    public static final int VK_STRUCTURE_TYPE_PERFORMANCE_OVERRIDE_INFO_INTEL = 1000210004;
    public static final int VK_STRUCTURE_TYPE_PERFORMANCE_CONFIGURATION_ACQUIRE_INFO_INTEL = 1000210005;
    public static final int VK_QUERY_TYPE_PERFORMANCE_QUERY_INTEL = 1000210000;
    public static final int VK_OBJECT_TYPE_PERFORMANCE_CONFIGURATION_INTEL = 1000210000;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_vkInitializePerformanceApiINTEL = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkUninitializePerformanceApiINTEL = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdSetPerformanceMarkerINTEL = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdSetPerformanceStreamMarkerINTEL = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdSetPerformanceOverrideINTEL = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkAcquirePerformanceConfigurationINTEL = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkReleasePerformanceConfigurationINTEL = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG));
        public static final MethodHandle MH_vkQueueSetPerformanceConfigurationINTEL = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG));
        public static final MethodHandle MH_vkGetPerformanceParameterINTEL = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public final MemorySegment PFN_vkInitializePerformanceApiINTEL;
        public final MemorySegment PFN_vkUninitializePerformanceApiINTEL;
        public final MemorySegment PFN_vkCmdSetPerformanceMarkerINTEL;
        public final MemorySegment PFN_vkCmdSetPerformanceStreamMarkerINTEL;
        public final MemorySegment PFN_vkCmdSetPerformanceOverrideINTEL;
        public final MemorySegment PFN_vkAcquirePerformanceConfigurationINTEL;
        public final MemorySegment PFN_vkReleasePerformanceConfigurationINTEL;
        public final MemorySegment PFN_vkQueueSetPerformanceConfigurationINTEL;
        public final MemorySegment PFN_vkGetPerformanceParameterINTEL;
        private Handles(MemorySegment device, VKLoadFunc func) {
            PFN_vkInitializePerformanceApiINTEL = func.invoke(device, "vkInitializePerformanceApiINTEL");
            PFN_vkUninitializePerformanceApiINTEL = func.invoke(device, "vkUninitializePerformanceApiINTEL");
            PFN_vkCmdSetPerformanceMarkerINTEL = func.invoke(device, "vkCmdSetPerformanceMarkerINTEL");
            PFN_vkCmdSetPerformanceStreamMarkerINTEL = func.invoke(device, "vkCmdSetPerformanceStreamMarkerINTEL");
            PFN_vkCmdSetPerformanceOverrideINTEL = func.invoke(device, "vkCmdSetPerformanceOverrideINTEL");
            PFN_vkAcquirePerformanceConfigurationINTEL = func.invoke(device, "vkAcquirePerformanceConfigurationINTEL");
            PFN_vkReleasePerformanceConfigurationINTEL = func.invoke(device, "vkReleasePerformanceConfigurationINTEL");
            PFN_vkQueueSetPerformanceConfigurationINTEL = func.invoke(device, "vkQueueSetPerformanceConfigurationINTEL");
            PFN_vkGetPerformanceParameterINTEL = func.invoke(device, "vkGetPerformanceParameterINTEL");
        }
    }

    public VKINTELPerformanceQuery(MemorySegment device, VKLoadFunc func) {
        this.handles = new Handles(device, func);
    }

    /// ```
    /// VkResult vkInitializePerformanceApiINTEL(VkDevice device, const VkInitializePerformanceApiInfoINTEL* pInitializeInfo);
    /// ```
    public int InitializePerformanceApiINTEL(MemorySegment device, MemorySegment pInitializeInfo) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkInitializePerformanceApiINTEL)) throw new SymbolNotFoundError("Symbol not found: vkInitializePerformanceApiINTEL");
        try { return (int) Handles.MH_vkInitializePerformanceApiINTEL.invokeExact(handles.PFN_vkInitializePerformanceApiINTEL, device, pInitializeInfo); }
        catch (Throwable e) { throw new RuntimeException("error in InitializePerformanceApiINTEL", e); }
    }

    /// ```
    /// void vkUninitializePerformanceApiINTEL(VkDevice device);
    /// ```
    public void UninitializePerformanceApiINTEL(MemorySegment device) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkUninitializePerformanceApiINTEL)) throw new SymbolNotFoundError("Symbol not found: vkUninitializePerformanceApiINTEL");
        try { Handles.MH_vkUninitializePerformanceApiINTEL.invokeExact(handles.PFN_vkUninitializePerformanceApiINTEL, device); }
        catch (Throwable e) { throw new RuntimeException("error in UninitializePerformanceApiINTEL", e); }
    }

    /// ```
    /// VkResult vkCmdSetPerformanceMarkerINTEL(VkCommandBuffer commandBuffer, const VkPerformanceMarkerInfoINTEL* pMarkerInfo);
    /// ```
    public int CmdSetPerformanceMarkerINTEL(MemorySegment commandBuffer, MemorySegment pMarkerInfo) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCmdSetPerformanceMarkerINTEL)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetPerformanceMarkerINTEL");
        try { return (int) Handles.MH_vkCmdSetPerformanceMarkerINTEL.invokeExact(handles.PFN_vkCmdSetPerformanceMarkerINTEL, commandBuffer, pMarkerInfo); }
        catch (Throwable e) { throw new RuntimeException("error in CmdSetPerformanceMarkerINTEL", e); }
    }

    /// ```
    /// VkResult vkCmdSetPerformanceStreamMarkerINTEL(VkCommandBuffer commandBuffer, const VkPerformanceStreamMarkerInfoINTEL* pMarkerInfo);
    /// ```
    public int CmdSetPerformanceStreamMarkerINTEL(MemorySegment commandBuffer, MemorySegment pMarkerInfo) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCmdSetPerformanceStreamMarkerINTEL)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetPerformanceStreamMarkerINTEL");
        try { return (int) Handles.MH_vkCmdSetPerformanceStreamMarkerINTEL.invokeExact(handles.PFN_vkCmdSetPerformanceStreamMarkerINTEL, commandBuffer, pMarkerInfo); }
        catch (Throwable e) { throw new RuntimeException("error in CmdSetPerformanceStreamMarkerINTEL", e); }
    }

    /// ```
    /// VkResult vkCmdSetPerformanceOverrideINTEL(VkCommandBuffer commandBuffer, const VkPerformanceOverrideInfoINTEL* pOverrideInfo);
    /// ```
    public int CmdSetPerformanceOverrideINTEL(MemorySegment commandBuffer, MemorySegment pOverrideInfo) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCmdSetPerformanceOverrideINTEL)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetPerformanceOverrideINTEL");
        try { return (int) Handles.MH_vkCmdSetPerformanceOverrideINTEL.invokeExact(handles.PFN_vkCmdSetPerformanceOverrideINTEL, commandBuffer, pOverrideInfo); }
        catch (Throwable e) { throw new RuntimeException("error in CmdSetPerformanceOverrideINTEL", e); }
    }

    /// ```
    /// VkResult vkAcquirePerformanceConfigurationINTEL(VkDevice device, const VkPerformanceConfigurationAcquireInfoINTEL* pAcquireInfo, VkPerformanceConfigurationINTEL* pConfiguration);
    /// ```
    public int AcquirePerformanceConfigurationINTEL(MemorySegment device, MemorySegment pAcquireInfo, MemorySegment pConfiguration) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkAcquirePerformanceConfigurationINTEL)) throw new SymbolNotFoundError("Symbol not found: vkAcquirePerformanceConfigurationINTEL");
        try { return (int) Handles.MH_vkAcquirePerformanceConfigurationINTEL.invokeExact(handles.PFN_vkAcquirePerformanceConfigurationINTEL, device, pAcquireInfo, pConfiguration); }
        catch (Throwable e) { throw new RuntimeException("error in AcquirePerformanceConfigurationINTEL", e); }
    }

    /// ```
    /// VkResult vkReleasePerformanceConfigurationINTEL(VkDevice device, VkPerformanceConfigurationINTEL configuration);
    /// ```
    public int ReleasePerformanceConfigurationINTEL(MemorySegment device, long configuration) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkReleasePerformanceConfigurationINTEL)) throw new SymbolNotFoundError("Symbol not found: vkReleasePerformanceConfigurationINTEL");
        try { return (int) Handles.MH_vkReleasePerformanceConfigurationINTEL.invokeExact(handles.PFN_vkReleasePerformanceConfigurationINTEL, device, configuration); }
        catch (Throwable e) { throw new RuntimeException("error in ReleasePerformanceConfigurationINTEL", e); }
    }

    /// ```
    /// VkResult vkQueueSetPerformanceConfigurationINTEL(VkQueue queue, VkPerformanceConfigurationINTEL configuration);
    /// ```
    public int QueueSetPerformanceConfigurationINTEL(MemorySegment queue, long configuration) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkQueueSetPerformanceConfigurationINTEL)) throw new SymbolNotFoundError("Symbol not found: vkQueueSetPerformanceConfigurationINTEL");
        try { return (int) Handles.MH_vkQueueSetPerformanceConfigurationINTEL.invokeExact(handles.PFN_vkQueueSetPerformanceConfigurationINTEL, queue, configuration); }
        catch (Throwable e) { throw new RuntimeException("error in QueueSetPerformanceConfigurationINTEL", e); }
    }

    /// ```
    /// VkResult vkGetPerformanceParameterINTEL(VkDevice device, VkPerformanceParameterTypeINTEL parameter, VkPerformanceValueINTEL* pValue);
    /// ```
    public int GetPerformanceParameterINTEL(MemorySegment device, int parameter, MemorySegment pValue) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkGetPerformanceParameterINTEL)) throw new SymbolNotFoundError("Symbol not found: vkGetPerformanceParameterINTEL");
        try { return (int) Handles.MH_vkGetPerformanceParameterINTEL.invokeExact(handles.PFN_vkGetPerformanceParameterINTEL, device, parameter, pValue); }
        catch (Throwable e) { throw new RuntimeException("error in GetPerformanceParameterINTEL", e); }
    }

}
