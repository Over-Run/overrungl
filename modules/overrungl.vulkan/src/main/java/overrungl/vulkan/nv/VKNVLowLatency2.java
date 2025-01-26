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
public class VKNVLowLatency2 {
    public static final int VK_LATENCY_MARKER_SIMULATION_START_NV = 0;
    public static final int VK_LATENCY_MARKER_SIMULATION_END_NV = 1;
    public static final int VK_LATENCY_MARKER_RENDERSUBMIT_START_NV = 2;
    public static final int VK_LATENCY_MARKER_RENDERSUBMIT_END_NV = 3;
    public static final int VK_LATENCY_MARKER_PRESENT_START_NV = 4;
    public static final int VK_LATENCY_MARKER_PRESENT_END_NV = 5;
    public static final int VK_LATENCY_MARKER_INPUT_SAMPLE_NV = 6;
    public static final int VK_LATENCY_MARKER_TRIGGER_FLASH_NV = 7;
    public static final int VK_LATENCY_MARKER_OUT_OF_BAND_RENDERSUBMIT_START_NV = 8;
    public static final int VK_LATENCY_MARKER_OUT_OF_BAND_RENDERSUBMIT_END_NV = 9;
    public static final int VK_LATENCY_MARKER_OUT_OF_BAND_PRESENT_START_NV = 10;
    public static final int VK_LATENCY_MARKER_OUT_OF_BAND_PRESENT_END_NV = 11;
    public static final int VK_OUT_OF_BAND_QUEUE_TYPE_RENDER_NV = 0;
    public static final int VK_OUT_OF_BAND_QUEUE_TYPE_PRESENT_NV = 1;
    public static final int VK_NV_LOW_LATENCY_2_SPEC_VERSION = 2;
    public static final String VK_NV_LOW_LATENCY_2_EXTENSION_NAME = "VK_NV_low_latency2";
    public static final int VK_STRUCTURE_TYPE_LATENCY_SLEEP_MODE_INFO_NV = 1000505000;
    public static final int VK_STRUCTURE_TYPE_LATENCY_SLEEP_INFO_NV = 1000505001;
    public static final int VK_STRUCTURE_TYPE_SET_LATENCY_MARKER_INFO_NV = 1000505002;
    public static final int VK_STRUCTURE_TYPE_GET_LATENCY_MARKER_INFO_NV = 1000505003;
    public static final int VK_STRUCTURE_TYPE_LATENCY_TIMINGS_FRAME_REPORT_NV = 1000505004;
    public static final int VK_STRUCTURE_TYPE_LATENCY_SUBMISSION_PRESENT_ID_NV = 1000505005;
    public static final int VK_STRUCTURE_TYPE_OUT_OF_BAND_QUEUE_TYPE_INFO_NV = 1000505006;
    public static final int VK_STRUCTURE_TYPE_SWAPCHAIN_LATENCY_CREATE_INFO_NV = 1000505007;
    public static final int VK_STRUCTURE_TYPE_LATENCY_SURFACE_CAPABILITIES_NV = 1000505008;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_vkSetLatencySleepModeNV = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkLatencySleepNV = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkSetLatencyMarkerNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetLatencyTimingsNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkQueueNotifyOutOfBandNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public final MemorySegment PFN_vkSetLatencySleepModeNV;
        public final MemorySegment PFN_vkLatencySleepNV;
        public final MemorySegment PFN_vkSetLatencyMarkerNV;
        public final MemorySegment PFN_vkGetLatencyTimingsNV;
        public final MemorySegment PFN_vkQueueNotifyOutOfBandNV;
        private Handles(MemorySegment device, VKLoadFunc func) {
            PFN_vkSetLatencySleepModeNV = func.invoke(device, "vkSetLatencySleepModeNV");
            PFN_vkLatencySleepNV = func.invoke(device, "vkLatencySleepNV");
            PFN_vkSetLatencyMarkerNV = func.invoke(device, "vkSetLatencyMarkerNV");
            PFN_vkGetLatencyTimingsNV = func.invoke(device, "vkGetLatencyTimingsNV");
            PFN_vkQueueNotifyOutOfBandNV = func.invoke(device, "vkQueueNotifyOutOfBandNV");
        }
    }

    public VKNVLowLatency2(MemorySegment device, VKLoadFunc func) {
        this.handles = new Handles(device, func);
    }

    /// ```
    /// VkResult vkSetLatencySleepModeNV(VkDevice device, VkSwapchainKHR swapchain, const VkLatencySleepModeInfoNV* pSleepModeInfo);
    /// ```
    public int SetLatencySleepModeNV(MemorySegment device, long swapchain, MemorySegment pSleepModeInfo) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkSetLatencySleepModeNV)) throw new SymbolNotFoundError("Symbol not found: vkSetLatencySleepModeNV");
        try { return (int) Handles.MH_vkSetLatencySleepModeNV.invokeExact(handles.PFN_vkSetLatencySleepModeNV, device, swapchain, pSleepModeInfo); }
        catch (Throwable e) { throw new RuntimeException("error in SetLatencySleepModeNV", e); }
    }

    /// ```
    /// VkResult vkLatencySleepNV(VkDevice device, VkSwapchainKHR swapchain, const VkLatencySleepInfoNV* pSleepInfo);
    /// ```
    public int LatencySleepNV(MemorySegment device, long swapchain, MemorySegment pSleepInfo) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkLatencySleepNV)) throw new SymbolNotFoundError("Symbol not found: vkLatencySleepNV");
        try { return (int) Handles.MH_vkLatencySleepNV.invokeExact(handles.PFN_vkLatencySleepNV, device, swapchain, pSleepInfo); }
        catch (Throwable e) { throw new RuntimeException("error in LatencySleepNV", e); }
    }

    /// ```
    /// void vkSetLatencyMarkerNV(VkDevice device, VkSwapchainKHR swapchain, const VkSetLatencyMarkerInfoNV* pLatencyMarkerInfo);
    /// ```
    public void SetLatencyMarkerNV(MemorySegment device, long swapchain, MemorySegment pLatencyMarkerInfo) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkSetLatencyMarkerNV)) throw new SymbolNotFoundError("Symbol not found: vkSetLatencyMarkerNV");
        try { Handles.MH_vkSetLatencyMarkerNV.invokeExact(handles.PFN_vkSetLatencyMarkerNV, device, swapchain, pLatencyMarkerInfo); }
        catch (Throwable e) { throw new RuntimeException("error in SetLatencyMarkerNV", e); }
    }

    /// ```
    /// void vkGetLatencyTimingsNV(VkDevice device, VkSwapchainKHR swapchain, VkGetLatencyMarkerInfoNV* pLatencyMarkerInfo);
    /// ```
    public void GetLatencyTimingsNV(MemorySegment device, long swapchain, MemorySegment pLatencyMarkerInfo) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkGetLatencyTimingsNV)) throw new SymbolNotFoundError("Symbol not found: vkGetLatencyTimingsNV");
        try { Handles.MH_vkGetLatencyTimingsNV.invokeExact(handles.PFN_vkGetLatencyTimingsNV, device, swapchain, pLatencyMarkerInfo); }
        catch (Throwable e) { throw new RuntimeException("error in GetLatencyTimingsNV", e); }
    }

    /// ```
    /// void vkQueueNotifyOutOfBandNV(VkQueue queue, const VkOutOfBandQueueTypeInfoNV* pQueueTypeInfo);
    /// ```
    public void QueueNotifyOutOfBandNV(MemorySegment queue, MemorySegment pQueueTypeInfo) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkQueueNotifyOutOfBandNV)) throw new SymbolNotFoundError("Symbol not found: vkQueueNotifyOutOfBandNV");
        try { Handles.MH_vkQueueNotifyOutOfBandNV.invokeExact(handles.PFN_vkQueueNotifyOutOfBandNV, queue, pQueueTypeInfo); }
        catch (Throwable e) { throw new RuntimeException("error in QueueNotifyOutOfBandNV", e); }
    }

}
