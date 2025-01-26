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
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;
import overrungl.vulkan.*;
public class VKKHRMaintenance5 {
    public static final int VK_KHR_MAINTENANCE_5_SPEC_VERSION = 1;
    public static final String VK_KHR_MAINTENANCE_5_EXTENSION_NAME = "VK_KHR_maintenance5";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_5_FEATURES_KHR = 1000470000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_5_PROPERTIES_KHR = 1000470001;
    public static final int VK_STRUCTURE_TYPE_RENDERING_AREA_INFO_KHR = 1000470003;
    public static final int VK_STRUCTURE_TYPE_DEVICE_IMAGE_SUBRESOURCE_INFO_KHR = 1000470004;
    public static final int VK_FORMAT_A1B5G5R5_UNORM_PACK16_KHR = 1000470000;
    public static final int VK_FORMAT_A8_UNORM_KHR = 1000470001;
    public static final int VK_STRUCTURE_TYPE_SUBRESOURCE_LAYOUT_2_KHR = 1000338002;
    public static final int VK_STRUCTURE_TYPE_IMAGE_SUBRESOURCE_2_KHR = 1000338003;
    public static final long VK_PIPELINE_CREATE_2_DISABLE_OPTIMIZATION_BIT_KHR = 0x00000001L;
    public static final long VK_PIPELINE_CREATE_2_ALLOW_DERIVATIVES_BIT_KHR = 0x00000002L;
    public static final long VK_PIPELINE_CREATE_2_DERIVATIVE_BIT_KHR = 0x00000004L;
    public static final long VK_PIPELINE_CREATE_2_VIEW_INDEX_FROM_DEVICE_INDEX_BIT_KHR = 0x00000008L;
    public static final long VK_PIPELINE_CREATE_2_DISPATCH_BASE_BIT_KHR = 0x00000010L;
    public static final long VK_BUFFER_USAGE_2_TRANSFER_SRC_BIT_KHR = 0x00000001L;
    public static final long VK_BUFFER_USAGE_2_TRANSFER_DST_BIT_KHR = 0x00000002L;
    public static final long VK_BUFFER_USAGE_2_UNIFORM_TEXEL_BUFFER_BIT_KHR = 0x00000004L;
    public static final long VK_BUFFER_USAGE_2_STORAGE_TEXEL_BUFFER_BIT_KHR = 0x00000008L;
    public static final long VK_BUFFER_USAGE_2_UNIFORM_BUFFER_BIT_KHR = 0x00000010L;
    public static final long VK_BUFFER_USAGE_2_STORAGE_BUFFER_BIT_KHR = 0x00000020L;
    public static final long VK_BUFFER_USAGE_2_INDEX_BUFFER_BIT_KHR = 0x00000040L;
    public static final long VK_BUFFER_USAGE_2_VERTEX_BUFFER_BIT_KHR = 0x00000080L;
    public static final long VK_BUFFER_USAGE_2_INDIRECT_BUFFER_BIT_KHR = 0x00000100L;
    public static final int VK_STRUCTURE_TYPE_PIPELINE_CREATE_FLAGS_2_CREATE_INFO_KHR = 1000470005;
    public static final int VK_STRUCTURE_TYPE_BUFFER_USAGE_FLAGS_2_CREATE_INFO_KHR = 1000470006;
    public static final long VK_PIPELINE_CREATE_2_DEFER_COMPILE_BIT_NV = 0x00000020L;
    public static final long VK_PIPELINE_CREATE_2_CAPTURE_STATISTICS_BIT_KHR = 0x00000040L;
    public static final long VK_PIPELINE_CREATE_2_CAPTURE_INTERNAL_REPRESENTATIONS_BIT_KHR = 0x00000080L;
    public static final long VK_PIPELINE_CREATE_2_FAIL_ON_PIPELINE_COMPILE_REQUIRED_BIT_KHR = 0x00000100L;
    public static final long VK_PIPELINE_CREATE_2_EARLY_RETURN_ON_FAILURE_BIT_KHR = 0x00000200L;
    public static final long VK_PIPELINE_CREATE_2_LINK_TIME_OPTIMIZATION_BIT_EXT = 0x00000400L;
    public static final long VK_PIPELINE_CREATE_2_RETAIN_LINK_TIME_OPTIMIZATION_INFO_BIT_EXT = 0x00800000L;
    public static final long VK_PIPELINE_CREATE_2_LIBRARY_BIT_KHR = 0x00000800L;
    public static final long VK_PIPELINE_CREATE_2_RAY_TRACING_SKIP_TRIANGLES_BIT_KHR = 0x00001000L;
    public static final long VK_PIPELINE_CREATE_2_RAY_TRACING_SKIP_AABBS_BIT_KHR = 0x00002000L;
    public static final long VK_PIPELINE_CREATE_2_RAY_TRACING_NO_NULL_ANY_HIT_SHADERS_BIT_KHR = 0x00004000L;
    public static final long VK_PIPELINE_CREATE_2_RAY_TRACING_NO_NULL_CLOSEST_HIT_SHADERS_BIT_KHR = 0x00008000L;
    public static final long VK_PIPELINE_CREATE_2_RAY_TRACING_NO_NULL_MISS_SHADERS_BIT_KHR = 0x00010000L;
    public static final long VK_PIPELINE_CREATE_2_RAY_TRACING_NO_NULL_INTERSECTION_SHADERS_BIT_KHR = 0x00020000L;
    public static final long VK_PIPELINE_CREATE_2_RAY_TRACING_SHADER_GROUP_HANDLE_CAPTURE_REPLAY_BIT_KHR = 0x00080000L;
    public static final long VK_PIPELINE_CREATE_2_INDIRECT_BINDABLE_BIT_NV = 0x00040000L;
    public static final long VK_PIPELINE_CREATE_2_RAY_TRACING_ALLOW_MOTION_BIT_NV = 0x00100000L;
    public static final long VK_PIPELINE_CREATE_2_RENDERING_FRAGMENT_SHADING_RATE_ATTACHMENT_BIT_KHR = 0x00200000L;
    public static final long VK_PIPELINE_CREATE_2_RENDERING_FRAGMENT_DENSITY_MAP_ATTACHMENT_BIT_EXT = 0x00400000L;
    public static final long VK_PIPELINE_CREATE_2_RAY_TRACING_OPACITY_MICROMAP_BIT_EXT = 0x01000000L;
    public static final long VK_PIPELINE_CREATE_2_COLOR_ATTACHMENT_FEEDBACK_LOOP_BIT_EXT = 0x02000000L;
    public static final long VK_PIPELINE_CREATE_2_DEPTH_STENCIL_ATTACHMENT_FEEDBACK_LOOP_BIT_EXT = 0x04000000L;
    public static final long VK_PIPELINE_CREATE_2_NO_PROTECTED_ACCESS_BIT_EXT = 0x08000000L;
    public static final long VK_PIPELINE_CREATE_2_PROTECTED_ACCESS_ONLY_BIT_EXT = 0x40000000L;
    public static final long VK_PIPELINE_CREATE_2_RAY_TRACING_DISPLACEMENT_MICROMAP_BIT_NV = 0x10000000L;
    public static final long VK_PIPELINE_CREATE_2_DESCRIPTOR_BUFFER_BIT_EXT = 0x20000000L;
    public static final long VK_BUFFER_USAGE_2_CONDITIONAL_RENDERING_BIT_EXT = 0x00000200L;
    public static final long VK_BUFFER_USAGE_2_SHADER_BINDING_TABLE_BIT_KHR = 0x00000400L;
    public static final long VK_BUFFER_USAGE_2_RAY_TRACING_BIT_NV = 0x00000400L;
    public static final long VK_BUFFER_USAGE_2_TRANSFORM_FEEDBACK_BUFFER_BIT_EXT = 0x00000800L;
    public static final long VK_BUFFER_USAGE_2_TRANSFORM_FEEDBACK_COUNTER_BUFFER_BIT_EXT = 0x00001000L;
    public static final long VK_BUFFER_USAGE_2_VIDEO_DECODE_SRC_BIT_KHR = 0x00002000L;
    public static final long VK_BUFFER_USAGE_2_VIDEO_DECODE_DST_BIT_KHR = 0x00004000L;
    public static final long VK_BUFFER_USAGE_2_VIDEO_ENCODE_DST_BIT_KHR = 0x00008000L;
    public static final long VK_BUFFER_USAGE_2_VIDEO_ENCODE_SRC_BIT_KHR = 0x00010000L;
    public static final long VK_BUFFER_USAGE_2_SHADER_DEVICE_ADDRESS_BIT_KHR = 0x00020000L;
    public static final long VK_BUFFER_USAGE_2_ACCELERATION_STRUCTURE_BUILD_INPUT_READ_ONLY_BIT_KHR = 0x00080000L;
    public static final long VK_BUFFER_USAGE_2_ACCELERATION_STRUCTURE_STORAGE_BIT_KHR = 0x00100000L;
    public static final long VK_BUFFER_USAGE_2_SAMPLER_DESCRIPTOR_BUFFER_BIT_EXT = 0x00200000L;
    public static final long VK_BUFFER_USAGE_2_RESOURCE_DESCRIPTOR_BUFFER_BIT_EXT = 0x00400000L;
    public static final long VK_BUFFER_USAGE_2_PUSH_DESCRIPTORS_DESCRIPTOR_BUFFER_BIT_EXT = 0x04000000L;
    public static final long VK_BUFFER_USAGE_2_MICROMAP_BUILD_INPUT_READ_ONLY_BIT_EXT = 0x00800000L;
    public static final long VK_BUFFER_USAGE_2_MICROMAP_STORAGE_BIT_EXT = 0x01000000L;
    public static final long VK_PIPELINE_CREATE_2_DISALLOW_OPACITY_MICROMAP_BIT_ARM = 0x2000000000L;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_vkCmdBindIndexBuffer2KHR = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_vkGetRenderingAreaGranularityKHR = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetDeviceImageSubresourceLayoutKHR = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetImageSubresourceLayout2KHR = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public final MemorySegment PFN_vkCmdBindIndexBuffer2KHR;
        public final MemorySegment PFN_vkGetRenderingAreaGranularityKHR;
        public final MemorySegment PFN_vkGetDeviceImageSubresourceLayoutKHR;
        public final MemorySegment PFN_vkGetImageSubresourceLayout2KHR;
        private Handles(MemorySegment device, VKLoadFunc func) {
            PFN_vkCmdBindIndexBuffer2KHR = func.invoke(device, "vkCmdBindIndexBuffer2KHR", "vkCmdBindIndexBuffer2");
            PFN_vkGetRenderingAreaGranularityKHR = func.invoke(device, "vkGetRenderingAreaGranularityKHR", "vkGetRenderingAreaGranularity");
            PFN_vkGetDeviceImageSubresourceLayoutKHR = func.invoke(device, "vkGetDeviceImageSubresourceLayoutKHR", "vkGetDeviceImageSubresourceLayout");
            PFN_vkGetImageSubresourceLayout2KHR = func.invoke(device, "vkGetImageSubresourceLayout2KHR", "vkGetImageSubresourceLayout2");
        }
    }

    public VKKHRMaintenance5(MemorySegment device, VKLoadFunc func) {
        this.handles = new Handles(device, func);
    }

    /// ```
    /// void vkCmdBindIndexBuffer2KHR(VkCommandBuffer commandBuffer, VkBuffer buffer, VkDeviceSize offset, VkDeviceSize size, VkIndexType indexType);
    /// ```
    public void CmdBindIndexBuffer2KHR(MemorySegment commandBuffer, long buffer, long offset, long size, int indexType) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCmdBindIndexBuffer2KHR)) throw new SymbolNotFoundError("Symbol not found: vkCmdBindIndexBuffer2KHR");
        try { Handles.MH_vkCmdBindIndexBuffer2KHR.invokeExact(handles.PFN_vkCmdBindIndexBuffer2KHR, commandBuffer, buffer, offset, size, indexType); }
        catch (Throwable e) { throw new RuntimeException("error in CmdBindIndexBuffer2KHR", e); }
    }

    /// ```
    /// void vkGetRenderingAreaGranularityKHR(VkDevice device, const VkRenderingAreaInfo* pRenderingAreaInfo, VkExtent2D* pGranularity);
    /// ```
    public void GetRenderingAreaGranularityKHR(MemorySegment device, MemorySegment pRenderingAreaInfo, MemorySegment pGranularity) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkGetRenderingAreaGranularityKHR)) throw new SymbolNotFoundError("Symbol not found: vkGetRenderingAreaGranularityKHR");
        try { Handles.MH_vkGetRenderingAreaGranularityKHR.invokeExact(handles.PFN_vkGetRenderingAreaGranularityKHR, device, pRenderingAreaInfo, pGranularity); }
        catch (Throwable e) { throw new RuntimeException("error in GetRenderingAreaGranularityKHR", e); }
    }

    /// ```
    /// void vkGetDeviceImageSubresourceLayoutKHR(VkDevice device, const VkDeviceImageSubresourceInfo* pInfo, VkSubresourceLayout2* pLayout);
    /// ```
    public void GetDeviceImageSubresourceLayoutKHR(MemorySegment device, MemorySegment pInfo, MemorySegment pLayout) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkGetDeviceImageSubresourceLayoutKHR)) throw new SymbolNotFoundError("Symbol not found: vkGetDeviceImageSubresourceLayoutKHR");
        try { Handles.MH_vkGetDeviceImageSubresourceLayoutKHR.invokeExact(handles.PFN_vkGetDeviceImageSubresourceLayoutKHR, device, pInfo, pLayout); }
        catch (Throwable e) { throw new RuntimeException("error in GetDeviceImageSubresourceLayoutKHR", e); }
    }

    /// ```
    /// void vkGetImageSubresourceLayout2KHR(VkDevice device, VkImage image, const VkImageSubresource2* pSubresource, VkSubresourceLayout2* pLayout);
    /// ```
    public void GetImageSubresourceLayout2KHR(MemorySegment device, long image, MemorySegment pSubresource, MemorySegment pLayout) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkGetImageSubresourceLayout2KHR)) throw new SymbolNotFoundError("Symbol not found: vkGetImageSubresourceLayout2KHR");
        try { Handles.MH_vkGetImageSubresourceLayout2KHR.invokeExact(handles.PFN_vkGetImageSubresourceLayout2KHR, device, image, pSubresource, pLayout); }
        catch (Throwable e) { throw new RuntimeException("error in GetImageSubresourceLayout2KHR", e); }
    }

}
