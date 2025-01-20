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
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;
import overrungl.vulkan.*;
import static overrungl.vulkan.nv.VKNVOpticalFlow.*;
public class VKNVOpticalFlow {
    public static final int VK_OPTICAL_FLOW_USAGE_UNKNOWN_NV = 0;
    public static final int VK_OPTICAL_FLOW_USAGE_INPUT_BIT_NV = 0x00000001;
    public static final int VK_OPTICAL_FLOW_USAGE_OUTPUT_BIT_NV = 0x00000002;
    public static final int VK_OPTICAL_FLOW_USAGE_HINT_BIT_NV = 0x00000004;
    public static final int VK_OPTICAL_FLOW_USAGE_COST_BIT_NV = 0x00000008;
    public static final int VK_OPTICAL_FLOW_USAGE_GLOBAL_FLOW_BIT_NV = 0x00000010;
    public static final int VK_OPTICAL_FLOW_GRID_SIZE_UNKNOWN_NV = 0;
    public static final int VK_OPTICAL_FLOW_GRID_SIZE_1X1_BIT_NV = 0x00000001;
    public static final int VK_OPTICAL_FLOW_GRID_SIZE_2X2_BIT_NV = 0x00000002;
    public static final int VK_OPTICAL_FLOW_GRID_SIZE_4X4_BIT_NV = 0x00000004;
    public static final int VK_OPTICAL_FLOW_GRID_SIZE_8X8_BIT_NV = 0x00000008;
    public static final int VK_OPTICAL_FLOW_PERFORMANCE_LEVEL_UNKNOWN_NV = 0;
    public static final int VK_OPTICAL_FLOW_PERFORMANCE_LEVEL_SLOW_NV = 1;
    public static final int VK_OPTICAL_FLOW_PERFORMANCE_LEVEL_MEDIUM_NV = 2;
    public static final int VK_OPTICAL_FLOW_PERFORMANCE_LEVEL_FAST_NV = 3;
    public static final int VK_OPTICAL_FLOW_SESSION_BINDING_POINT_UNKNOWN_NV = 0;
    public static final int VK_OPTICAL_FLOW_SESSION_BINDING_POINT_INPUT_NV = 1;
    public static final int VK_OPTICAL_FLOW_SESSION_BINDING_POINT_REFERENCE_NV = 2;
    public static final int VK_OPTICAL_FLOW_SESSION_BINDING_POINT_HINT_NV = 3;
    public static final int VK_OPTICAL_FLOW_SESSION_BINDING_POINT_FLOW_VECTOR_NV = 4;
    public static final int VK_OPTICAL_FLOW_SESSION_BINDING_POINT_BACKWARD_FLOW_VECTOR_NV = 5;
    public static final int VK_OPTICAL_FLOW_SESSION_BINDING_POINT_COST_NV = 6;
    public static final int VK_OPTICAL_FLOW_SESSION_BINDING_POINT_BACKWARD_COST_NV = 7;
    public static final int VK_OPTICAL_FLOW_SESSION_BINDING_POINT_GLOBAL_FLOW_NV = 8;
    public static final int VK_OPTICAL_FLOW_SESSION_CREATE_ENABLE_HINT_BIT_NV = 0x00000001;
    public static final int VK_OPTICAL_FLOW_SESSION_CREATE_ENABLE_COST_BIT_NV = 0x00000002;
    public static final int VK_OPTICAL_FLOW_SESSION_CREATE_ENABLE_GLOBAL_FLOW_BIT_NV = 0x00000004;
    public static final int VK_OPTICAL_FLOW_SESSION_CREATE_ALLOW_REGIONS_BIT_NV = 0x00000008;
    public static final int VK_OPTICAL_FLOW_SESSION_CREATE_BOTH_DIRECTIONS_BIT_NV = 0x00000010;
    public static final int VK_OPTICAL_FLOW_EXECUTE_DISABLE_TEMPORAL_HINTS_BIT_NV = 0x00000001;
    public static final int VK_NV_OPTICAL_FLOW_SPEC_VERSION = 1;
    public static final String VK_NV_OPTICAL_FLOW_EXTENSION_NAME = "VK_NV_optical_flow";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_OPTICAL_FLOW_FEATURES_NV = 1000464000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_OPTICAL_FLOW_PROPERTIES_NV = 1000464001;
    public static final int VK_STRUCTURE_TYPE_OPTICAL_FLOW_IMAGE_FORMAT_INFO_NV = 1000464002;
    public static final int VK_STRUCTURE_TYPE_OPTICAL_FLOW_IMAGE_FORMAT_PROPERTIES_NV = 1000464003;
    public static final int VK_STRUCTURE_TYPE_OPTICAL_FLOW_SESSION_CREATE_INFO_NV = 1000464004;
    public static final int VK_STRUCTURE_TYPE_OPTICAL_FLOW_EXECUTE_INFO_NV = 1000464005;
    public static final int VK_STRUCTURE_TYPE_OPTICAL_FLOW_SESSION_CREATE_PRIVATE_DATA_INFO_NV = 1000464010;
    public static final int VK_FORMAT_R16G16_SFIXED5_NV = 1000464000;
    public static final int VK_OBJECT_TYPE_OPTICAL_FLOW_SESSION_NV = 1000464000;
    public static final int VK_QUEUE_OPTICAL_FLOW_BIT_NV = 0x00000100;
    public static final long VK_PIPELINE_STAGE_2_OPTICAL_FLOW_BIT_NV = 0x20000000L;
    public static final long VK_ACCESS_2_OPTICAL_FLOW_READ_BIT_NV = 0x40000000000L;
    public static final long VK_ACCESS_2_OPTICAL_FLOW_WRITE_BIT_NV = 0x80000000000L;
    public static final long VK_FORMAT_FEATURE_2_OPTICAL_FLOW_IMAGE_BIT_NV = 0x10000000000L;
    public static final long VK_FORMAT_FEATURE_2_OPTICAL_FLOW_VECTOR_BIT_NV = 0x20000000000L;
    public static final long VK_FORMAT_FEATURE_2_OPTICAL_FLOW_COST_BIT_NV = 0x40000000000L;
    public static final int VK_FORMAT_R16G16_S10_5_NV = VK_FORMAT_R16G16_SFIXED5_NV;
    private final Handles handles;
    public static final class Descriptors {
        public static final FunctionDescriptor FD_vkGetPhysicalDeviceOpticalFlowImageFormatsNV = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkCreateOpticalFlowSessionNV = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkDestroyOpticalFlowSessionNV = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkBindOpticalFlowSessionImageNV = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_vkCmdOpticalFlowExecuteNV = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        private Descriptors() {}
    }
    public static final class Handles {
        public static final MethodHandle MH_vkGetPhysicalDeviceOpticalFlowImageFormatsNV = RuntimeHelper.downcall(Descriptors.FD_vkGetPhysicalDeviceOpticalFlowImageFormatsNV);
        public static final MethodHandle MH_vkCreateOpticalFlowSessionNV = RuntimeHelper.downcall(Descriptors.FD_vkCreateOpticalFlowSessionNV);
        public static final MethodHandle MH_vkDestroyOpticalFlowSessionNV = RuntimeHelper.downcall(Descriptors.FD_vkDestroyOpticalFlowSessionNV);
        public static final MethodHandle MH_vkBindOpticalFlowSessionImageNV = RuntimeHelper.downcall(Descriptors.FD_vkBindOpticalFlowSessionImageNV);
        public static final MethodHandle MH_vkCmdOpticalFlowExecuteNV = RuntimeHelper.downcall(Descriptors.FD_vkCmdOpticalFlowExecuteNV);
        public final MemorySegment PFN_vkGetPhysicalDeviceOpticalFlowImageFormatsNV;
        public final MemorySegment PFN_vkCreateOpticalFlowSessionNV;
        public final MemorySegment PFN_vkDestroyOpticalFlowSessionNV;
        public final MemorySegment PFN_vkBindOpticalFlowSessionImageNV;
        public final MemorySegment PFN_vkCmdOpticalFlowExecuteNV;
        private Handles(@CType("VkDevice") MemorySegment device, VKLoadFunc func) {
            PFN_vkGetPhysicalDeviceOpticalFlowImageFormatsNV = func.invoke(device, "vkGetPhysicalDeviceOpticalFlowImageFormatsNV");
            PFN_vkCreateOpticalFlowSessionNV = func.invoke(device, "vkCreateOpticalFlowSessionNV");
            PFN_vkDestroyOpticalFlowSessionNV = func.invoke(device, "vkDestroyOpticalFlowSessionNV");
            PFN_vkBindOpticalFlowSessionImageNV = func.invoke(device, "vkBindOpticalFlowSessionImageNV");
            PFN_vkCmdOpticalFlowExecuteNV = func.invoke(device, "vkCmdOpticalFlowExecuteNV");
        }
    }

    public VKNVOpticalFlow(@CType("VkDevice") MemorySegment device, VKLoadFunc func) {
        this.handles = new Handles(device, func);
    }

    public @CType("VkResult") int GetPhysicalDeviceOpticalFlowImageFormatsNV(@CType("VkPhysicalDevice") MemorySegment physicalDevice, @CType("const VkOpticalFlowImageFormatInfoNV *") MemorySegment pOpticalFlowImageFormatInfo, @CType("uint32_t *") MemorySegment pFormatCount, @CType("VkOpticalFlowImageFormatPropertiesNV *") MemorySegment pImageFormatProperties) {
        if (Unmarshal.isNullPointer(handles.PFN_vkGetPhysicalDeviceOpticalFlowImageFormatsNV)) throw new SymbolNotFoundError("Symbol not found: vkGetPhysicalDeviceOpticalFlowImageFormatsNV");
        try { return (int) Handles.MH_vkGetPhysicalDeviceOpticalFlowImageFormatsNV.invokeExact(handles.PFN_vkGetPhysicalDeviceOpticalFlowImageFormatsNV, physicalDevice, pOpticalFlowImageFormatInfo, pFormatCount, pImageFormatProperties); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetPhysicalDeviceOpticalFlowImageFormatsNV", e); }
    }

    public @CType("VkResult") int CreateOpticalFlowSessionNV(@CType("VkDevice") MemorySegment device, @CType("const VkOpticalFlowSessionCreateInfoNV *") MemorySegment pCreateInfo, @CType("const VkAllocationCallbacks *") MemorySegment pAllocator, @CType("VkOpticalFlowSessionNV *") MemorySegment pSession) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCreateOpticalFlowSessionNV)) throw new SymbolNotFoundError("Symbol not found: vkCreateOpticalFlowSessionNV");
        try { return (int) Handles.MH_vkCreateOpticalFlowSessionNV.invokeExact(handles.PFN_vkCreateOpticalFlowSessionNV, device, pCreateInfo, pAllocator, pSession); }
        catch (Throwable e) { throw new RuntimeException("error in vkCreateOpticalFlowSessionNV", e); }
    }

    public void DestroyOpticalFlowSessionNV(@CType("VkDevice") MemorySegment device, @CType("VkOpticalFlowSessionNV") MemorySegment session, @CType("const VkAllocationCallbacks *") MemorySegment pAllocator) {
        if (Unmarshal.isNullPointer(handles.PFN_vkDestroyOpticalFlowSessionNV)) throw new SymbolNotFoundError("Symbol not found: vkDestroyOpticalFlowSessionNV");
        try { Handles.MH_vkDestroyOpticalFlowSessionNV.invokeExact(handles.PFN_vkDestroyOpticalFlowSessionNV, device, session, pAllocator); }
        catch (Throwable e) { throw new RuntimeException("error in vkDestroyOpticalFlowSessionNV", e); }
    }

    public @CType("VkResult") int BindOpticalFlowSessionImageNV(@CType("VkDevice") MemorySegment device, @CType("VkOpticalFlowSessionNV") MemorySegment session, @CType("VkOpticalFlowSessionBindingPointNV") int bindingPoint, @CType("VkImageView") MemorySegment view, @CType("VkImageLayout") int layout) {
        if (Unmarshal.isNullPointer(handles.PFN_vkBindOpticalFlowSessionImageNV)) throw new SymbolNotFoundError("Symbol not found: vkBindOpticalFlowSessionImageNV");
        try { return (int) Handles.MH_vkBindOpticalFlowSessionImageNV.invokeExact(handles.PFN_vkBindOpticalFlowSessionImageNV, device, session, bindingPoint, view, layout); }
        catch (Throwable e) { throw new RuntimeException("error in vkBindOpticalFlowSessionImageNV", e); }
    }

    public void CmdOpticalFlowExecuteNV(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("VkOpticalFlowSessionNV") MemorySegment session, @CType("const VkOpticalFlowExecuteInfoNV *") MemorySegment pExecuteInfo) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCmdOpticalFlowExecuteNV)) throw new SymbolNotFoundError("Symbol not found: vkCmdOpticalFlowExecuteNV");
        try { Handles.MH_vkCmdOpticalFlowExecuteNV.invokeExact(handles.PFN_vkCmdOpticalFlowExecuteNV, commandBuffer, session, pExecuteInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdOpticalFlowExecuteNV", e); }
    }

}
