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
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;
import overrungl.vulkan.*;
import static overrungl.vulkan.VK14.*;
import static overrungl.vulkan.khr.VKKHRMaintenance5.*;
public class VKKHRMaintenance5 {
    public static final int VK_KHR_MAINTENANCE_5_SPEC_VERSION = 1;
    public static final String VK_KHR_MAINTENANCE_5_EXTENSION_NAME = "VK_KHR_maintenance5";
    public static final long VK_PIPELINE_CREATE_2_DEFER_COMPILE_BIT_NV = 0x00000020L;
    public static final long VK_PIPELINE_CREATE_2_CAPTURE_STATISTICS_BIT_KHR = 0x00000040L;
    public static final long VK_PIPELINE_CREATE_2_CAPTURE_INTERNAL_REPRESENTATIONS_BIT_KHR = 0x00000080L;
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
    public static final long VK_PIPELINE_CREATE_2_RAY_TRACING_DISPLACEMENT_MICROMAP_BIT_NV = 0x10000000L;
    public static final long VK_PIPELINE_CREATE_2_DESCRIPTOR_BUFFER_BIT_EXT = 0x20000000L;
    public static final long VK_BUFFER_USAGE_2_CONDITIONAL_RENDERING_BIT_EXT = 0x00000200L;
    public static final long VK_BUFFER_USAGE_2_SHADER_BINDING_TABLE_BIT_KHR = 0x00000400L;
    public static final long VK_BUFFER_USAGE_2_TRANSFORM_FEEDBACK_BUFFER_BIT_EXT = 0x00000800L;
    public static final long VK_BUFFER_USAGE_2_TRANSFORM_FEEDBACK_COUNTER_BUFFER_BIT_EXT = 0x00001000L;
    public static final long VK_BUFFER_USAGE_2_VIDEO_DECODE_SRC_BIT_KHR = 0x00002000L;
    public static final long VK_BUFFER_USAGE_2_VIDEO_DECODE_DST_BIT_KHR = 0x00004000L;
    public static final long VK_BUFFER_USAGE_2_VIDEO_ENCODE_DST_BIT_KHR = 0x00008000L;
    public static final long VK_BUFFER_USAGE_2_VIDEO_ENCODE_SRC_BIT_KHR = 0x00010000L;
    public static final long VK_BUFFER_USAGE_2_ACCELERATION_STRUCTURE_BUILD_INPUT_READ_ONLY_BIT_KHR = 0x00080000L;
    public static final long VK_BUFFER_USAGE_2_ACCELERATION_STRUCTURE_STORAGE_BIT_KHR = 0x00100000L;
    public static final long VK_BUFFER_USAGE_2_SAMPLER_DESCRIPTOR_BUFFER_BIT_EXT = 0x00200000L;
    public static final long VK_BUFFER_USAGE_2_RESOURCE_DESCRIPTOR_BUFFER_BIT_EXT = 0x00400000L;
    public static final long VK_BUFFER_USAGE_2_PUSH_DESCRIPTORS_DESCRIPTOR_BUFFER_BIT_EXT = 0x04000000L;
    public static final long VK_BUFFER_USAGE_2_MICROMAP_BUILD_INPUT_READ_ONLY_BIT_EXT = 0x00800000L;
    public static final long VK_BUFFER_USAGE_2_MICROMAP_STORAGE_BIT_EXT = 0x01000000L;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_5_FEATURES_KHR = VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_5_FEATURES;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_5_PROPERTIES_KHR = VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_5_PROPERTIES;
    public static final int VK_STRUCTURE_TYPE_RENDERING_AREA_INFO_KHR = VK_STRUCTURE_TYPE_RENDERING_AREA_INFO;
    public static final int VK_STRUCTURE_TYPE_DEVICE_IMAGE_SUBRESOURCE_INFO_KHR = VK_STRUCTURE_TYPE_DEVICE_IMAGE_SUBRESOURCE_INFO;
    public static final int VK_FORMAT_A1B5G5R5_UNORM_PACK16_KHR = VK_FORMAT_A1B5G5R5_UNORM_PACK16;
    public static final int VK_FORMAT_A8_UNORM_KHR = VK_FORMAT_A8_UNORM;
    public static final int VK_STRUCTURE_TYPE_SUBRESOURCE_LAYOUT_2_KHR = VK_STRUCTURE_TYPE_SUBRESOURCE_LAYOUT_2;
    public static final int VK_STRUCTURE_TYPE_IMAGE_SUBRESOURCE_2_KHR = VK_STRUCTURE_TYPE_IMAGE_SUBRESOURCE_2;
    public static final long VK_PIPELINE_CREATE_2_DISABLE_OPTIMIZATION_BIT_KHR = VK_PIPELINE_CREATE_2_DISABLE_OPTIMIZATION_BIT;
    public static final long VK_PIPELINE_CREATE_2_ALLOW_DERIVATIVES_BIT_KHR = VK_PIPELINE_CREATE_2_ALLOW_DERIVATIVES_BIT;
    public static final long VK_PIPELINE_CREATE_2_DERIVATIVE_BIT_KHR = VK_PIPELINE_CREATE_2_DERIVATIVE_BIT;
    public static final long VK_PIPELINE_CREATE_2_VIEW_INDEX_FROM_DEVICE_INDEX_BIT_KHR = VK_PIPELINE_CREATE_2_VIEW_INDEX_FROM_DEVICE_INDEX_BIT;
    public static final long VK_PIPELINE_CREATE_2_DISPATCH_BASE_BIT_KHR = VK_PIPELINE_CREATE_2_DISPATCH_BASE_BIT;
    public static final long VK_BUFFER_USAGE_2_TRANSFER_SRC_BIT_KHR = VK_BUFFER_USAGE_2_TRANSFER_SRC_BIT;
    public static final long VK_BUFFER_USAGE_2_TRANSFER_DST_BIT_KHR = VK_BUFFER_USAGE_2_TRANSFER_DST_BIT;
    public static final long VK_BUFFER_USAGE_2_UNIFORM_TEXEL_BUFFER_BIT_KHR = VK_BUFFER_USAGE_2_UNIFORM_TEXEL_BUFFER_BIT;
    public static final long VK_BUFFER_USAGE_2_STORAGE_TEXEL_BUFFER_BIT_KHR = VK_BUFFER_USAGE_2_STORAGE_TEXEL_BUFFER_BIT;
    public static final long VK_BUFFER_USAGE_2_UNIFORM_BUFFER_BIT_KHR = VK_BUFFER_USAGE_2_UNIFORM_BUFFER_BIT;
    public static final long VK_BUFFER_USAGE_2_STORAGE_BUFFER_BIT_KHR = VK_BUFFER_USAGE_2_STORAGE_BUFFER_BIT;
    public static final long VK_BUFFER_USAGE_2_INDEX_BUFFER_BIT_KHR = VK_BUFFER_USAGE_2_INDEX_BUFFER_BIT;
    public static final long VK_BUFFER_USAGE_2_VERTEX_BUFFER_BIT_KHR = VK_BUFFER_USAGE_2_VERTEX_BUFFER_BIT;
    public static final long VK_BUFFER_USAGE_2_INDIRECT_BUFFER_BIT_KHR = VK_BUFFER_USAGE_2_INDIRECT_BUFFER_BIT;
    public static final int VK_STRUCTURE_TYPE_PIPELINE_CREATE_FLAGS_2_CREATE_INFO_KHR = VK_STRUCTURE_TYPE_PIPELINE_CREATE_FLAGS_2_CREATE_INFO;
    public static final int VK_STRUCTURE_TYPE_BUFFER_USAGE_FLAGS_2_CREATE_INFO_KHR = VK_STRUCTURE_TYPE_BUFFER_USAGE_FLAGS_2_CREATE_INFO;
    public static final long VK_PIPELINE_CREATE_2_FAIL_ON_PIPELINE_COMPILE_REQUIRED_BIT_KHR = VK_PIPELINE_CREATE_2_FAIL_ON_PIPELINE_COMPILE_REQUIRED_BIT;
    public static final long VK_PIPELINE_CREATE_2_EARLY_RETURN_ON_FAILURE_BIT_KHR = VK_PIPELINE_CREATE_2_EARLY_RETURN_ON_FAILURE_BIT;
    public static final long VK_PIPELINE_CREATE_2_NO_PROTECTED_ACCESS_BIT_EXT = VK_PIPELINE_CREATE_2_NO_PROTECTED_ACCESS_BIT;
    public static final long VK_PIPELINE_CREATE_2_PROTECTED_ACCESS_ONLY_BIT_EXT = VK_PIPELINE_CREATE_2_PROTECTED_ACCESS_ONLY_BIT;
    public static final long VK_BUFFER_USAGE_2_RAY_TRACING_BIT_NV = VK_BUFFER_USAGE_2_SHADER_BINDING_TABLE_BIT_KHR;
    public static final long VK_BUFFER_USAGE_2_SHADER_DEVICE_ADDRESS_BIT_KHR = VK_BUFFER_USAGE_2_SHADER_DEVICE_ADDRESS_BIT;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_vkCmdBindIndexBuffer2KHR = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_vkGetRenderingAreaGranularityKHR = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetDeviceImageSubresourceLayoutKHR = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetImageSubresourceLayout2KHR = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public final MemorySegment PFN_vkCmdBindIndexBuffer2KHR;
        public final MemorySegment PFN_vkGetRenderingAreaGranularityKHR;
        public final MemorySegment PFN_vkGetDeviceImageSubresourceLayoutKHR;
        public final MemorySegment PFN_vkGetImageSubresourceLayout2KHR;
        private Handles(@CType("VkDevice") MemorySegment device, VKLoadFunc func) {
            PFN_vkCmdBindIndexBuffer2KHR = func.invoke(device, "vkCmdBindIndexBuffer2KHR", "vkCmdBindIndexBuffer2");
            PFN_vkGetRenderingAreaGranularityKHR = func.invoke(device, "vkGetRenderingAreaGranularityKHR", "vkGetRenderingAreaGranularity");
            PFN_vkGetDeviceImageSubresourceLayoutKHR = func.invoke(device, "vkGetDeviceImageSubresourceLayoutKHR", "vkGetDeviceImageSubresourceLayout");
            PFN_vkGetImageSubresourceLayout2KHR = func.invoke(device, "vkGetImageSubresourceLayout2KHR", "vkGetImageSubresourceLayout2");
        }
    }

    public VKKHRMaintenance5(@CType("VkDevice") MemorySegment device, VKLoadFunc func) {
        this.handles = new Handles(device, func);
    }

    public void CmdBindIndexBuffer2KHR(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("VkBuffer") MemorySegment buffer, @CType("VkDeviceSize") long offset, @CType("VkDeviceSize") long size, @CType("VkIndexType") int indexType) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCmdBindIndexBuffer2KHR)) throw new SymbolNotFoundError("Symbol not found: vkCmdBindIndexBuffer2KHR");
        try { Handles.MH_vkCmdBindIndexBuffer2KHR.invokeExact(handles.PFN_vkCmdBindIndexBuffer2KHR, commandBuffer, buffer, offset, size, indexType); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdBindIndexBuffer2KHR", e); }
    }

    public void GetRenderingAreaGranularityKHR(@CType("VkDevice") MemorySegment device, @CType("const VkRenderingAreaInfo *") MemorySegment pRenderingAreaInfo, @CType("VkExtent2D *") MemorySegment pGranularity) {
        if (Unmarshal.isNullPointer(handles.PFN_vkGetRenderingAreaGranularityKHR)) throw new SymbolNotFoundError("Symbol not found: vkGetRenderingAreaGranularityKHR");
        try { Handles.MH_vkGetRenderingAreaGranularityKHR.invokeExact(handles.PFN_vkGetRenderingAreaGranularityKHR, device, pRenderingAreaInfo, pGranularity); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetRenderingAreaGranularityKHR", e); }
    }

    public void GetDeviceImageSubresourceLayoutKHR(@CType("VkDevice") MemorySegment device, @CType("const VkDeviceImageSubresourceInfo *") MemorySegment pInfo, @CType("VkSubresourceLayout2 *") MemorySegment pLayout) {
        if (Unmarshal.isNullPointer(handles.PFN_vkGetDeviceImageSubresourceLayoutKHR)) throw new SymbolNotFoundError("Symbol not found: vkGetDeviceImageSubresourceLayoutKHR");
        try { Handles.MH_vkGetDeviceImageSubresourceLayoutKHR.invokeExact(handles.PFN_vkGetDeviceImageSubresourceLayoutKHR, device, pInfo, pLayout); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetDeviceImageSubresourceLayoutKHR", e); }
    }

    public void GetImageSubresourceLayout2KHR(@CType("VkDevice") MemorySegment device, @CType("VkImage") MemorySegment image, @CType("const VkImageSubresource2 *") MemorySegment pSubresource, @CType("VkSubresourceLayout2 *") MemorySegment pLayout) {
        if (Unmarshal.isNullPointer(handles.PFN_vkGetImageSubresourceLayout2KHR)) throw new SymbolNotFoundError("Symbol not found: vkGetImageSubresourceLayout2KHR");
        try { Handles.MH_vkGetImageSubresourceLayout2KHR.invokeExact(handles.PFN_vkGetImageSubresourceLayout2KHR, device, image, pSubresource, pLayout); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetImageSubresourceLayout2KHR", e); }
    }

}
