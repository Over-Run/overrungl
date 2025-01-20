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
package overrungl.vulkan;
import java.lang.foreign.*;
import java.lang.invoke.*;
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;
public class VK12 extends VK11 {
    public static final int VK_DRIVER_ID_AMD_PROPRIETARY = 1;
    public static final int VK_DRIVER_ID_AMD_OPEN_SOURCE = 2;
    public static final int VK_DRIVER_ID_MESA_RADV = 3;
    public static final int VK_DRIVER_ID_NVIDIA_PROPRIETARY = 4;
    public static final int VK_DRIVER_ID_INTEL_PROPRIETARY_WINDOWS = 5;
    public static final int VK_DRIVER_ID_INTEL_OPEN_SOURCE_MESA = 6;
    public static final int VK_DRIVER_ID_IMAGINATION_PROPRIETARY = 7;
    public static final int VK_DRIVER_ID_QUALCOMM_PROPRIETARY = 8;
    public static final int VK_DRIVER_ID_ARM_PROPRIETARY = 9;
    public static final int VK_DRIVER_ID_GOOGLE_SWIFTSHADER = 10;
    public static final int VK_DRIVER_ID_GGP_PROPRIETARY = 11;
    public static final int VK_DRIVER_ID_BROADCOM_PROPRIETARY = 12;
    public static final int VK_DRIVER_ID_MESA_LLVMPIPE = 13;
    public static final int VK_DRIVER_ID_MOLTENVK = 14;
    public static final int VK_DRIVER_ID_COREAVI_PROPRIETARY = 15;
    public static final int VK_DRIVER_ID_JUICE_PROPRIETARY = 16;
    public static final int VK_DRIVER_ID_VERISILICON_PROPRIETARY = 17;
    public static final int VK_DRIVER_ID_MESA_TURNIP = 18;
    public static final int VK_DRIVER_ID_MESA_V3DV = 19;
    public static final int VK_DRIVER_ID_MESA_PANVK = 20;
    public static final int VK_DRIVER_ID_SAMSUNG_PROPRIETARY = 21;
    public static final int VK_DRIVER_ID_MESA_VENUS = 22;
    public static final int VK_DRIVER_ID_MESA_DOZEN = 23;
    public static final int VK_DRIVER_ID_MESA_NVK = 24;
    public static final int VK_DRIVER_ID_IMAGINATION_OPEN_SOURCE_MESA = 25;
    public static final int VK_DRIVER_ID_MESA_HONEYKRISP = 26;
    public static final int VK_DRIVER_ID_VULKAN_SC_EMULATION_ON_VULKAN = 27;
    public static final int VK_SHADER_FLOAT_CONTROLS_INDEPENDENCE_32_BIT_ONLY = 0;
    public static final int VK_SHADER_FLOAT_CONTROLS_INDEPENDENCE_ALL = 1;
    public static final int VK_SHADER_FLOAT_CONTROLS_INDEPENDENCE_NONE = 2;
    public static final int VK_DESCRIPTOR_BINDING_UPDATE_AFTER_BIND_BIT = 0x00000001;
    public static final int VK_DESCRIPTOR_BINDING_UPDATE_UNUSED_WHILE_PENDING_BIT = 0x00000002;
    public static final int VK_DESCRIPTOR_BINDING_PARTIALLY_BOUND_BIT = 0x00000004;
    public static final int VK_DESCRIPTOR_BINDING_VARIABLE_DESCRIPTOR_COUNT_BIT = 0x00000008;
    public static final int VK_RESOLVE_MODE_NONE = 0;
    public static final int VK_RESOLVE_MODE_SAMPLE_ZERO_BIT = 0x00000001;
    public static final int VK_RESOLVE_MODE_AVERAGE_BIT = 0x00000002;
    public static final int VK_RESOLVE_MODE_MIN_BIT = 0x00000004;
    public static final int VK_RESOLVE_MODE_MAX_BIT = 0x00000008;
    public static final int VK_SAMPLER_REDUCTION_MODE_WEIGHTED_AVERAGE = 0;
    public static final int VK_SAMPLER_REDUCTION_MODE_MIN = 1;
    public static final int VK_SAMPLER_REDUCTION_MODE_MAX = 2;
    public static final int VK_SEMAPHORE_TYPE_BINARY = 0;
    public static final int VK_SEMAPHORE_TYPE_TIMELINE = 1;
    public static final int VK_SEMAPHORE_WAIT_ANY_BIT = 0x00000001;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_1_FEATURES = 49;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_1_PROPERTIES = 50;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_2_FEATURES = 51;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_2_PROPERTIES = 52;
    public static final int VK_STRUCTURE_TYPE_IMAGE_FORMAT_LIST_CREATE_INFO = 1000147000;
    public static final int VK_SAMPLER_ADDRESS_MODE_MIRROR_CLAMP_TO_EDGE = 4;
    public static final int VK_STRUCTURE_TYPE_ATTACHMENT_DESCRIPTION_2 = 1000109000;
    public static final int VK_STRUCTURE_TYPE_ATTACHMENT_REFERENCE_2 = 1000109001;
    public static final int VK_STRUCTURE_TYPE_SUBPASS_DESCRIPTION_2 = 1000109002;
    public static final int VK_STRUCTURE_TYPE_SUBPASS_DEPENDENCY_2 = 1000109003;
    public static final int VK_STRUCTURE_TYPE_RENDER_PASS_CREATE_INFO_2 = 1000109004;
    public static final int VK_STRUCTURE_TYPE_SUBPASS_BEGIN_INFO = 1000109005;
    public static final int VK_STRUCTURE_TYPE_SUBPASS_END_INFO = 1000109006;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_8BIT_STORAGE_FEATURES = 1000177000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DRIVER_PROPERTIES = 1000196000;
    public static final int VK_MAX_DRIVER_NAME_SIZE = 256;
    public static final int VK_MAX_DRIVER_INFO_SIZE = 256;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_ATOMIC_INT64_FEATURES = 1000180000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_FLOAT16_INT8_FEATURES = 1000082000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FLOAT_CONTROLS_PROPERTIES = 1000197000;
    public static final int VK_STRUCTURE_TYPE_DESCRIPTOR_SET_LAYOUT_BINDING_FLAGS_CREATE_INFO = 1000161000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_INDEXING_FEATURES = 1000161001;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_INDEXING_PROPERTIES = 1000161002;
    public static final int VK_STRUCTURE_TYPE_DESCRIPTOR_SET_VARIABLE_DESCRIPTOR_COUNT_ALLOCATE_INFO = 1000161003;
    public static final int VK_STRUCTURE_TYPE_DESCRIPTOR_SET_VARIABLE_DESCRIPTOR_COUNT_LAYOUT_SUPPORT = 1000161004;
    public static final int VK_DESCRIPTOR_POOL_CREATE_UPDATE_AFTER_BIND_BIT = 0x00000002;
    public static final int VK_DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT = 0x00000002;
    public static final int VK_ERROR_FRAGMENTATION = -1000161000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DEPTH_STENCIL_RESOLVE_PROPERTIES = 1000199000;
    public static final int VK_STRUCTURE_TYPE_SUBPASS_DESCRIPTION_DEPTH_STENCIL_RESOLVE = 1000199001;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SCALAR_BLOCK_LAYOUT_FEATURES = 1000221000;
    public static final int VK_STRUCTURE_TYPE_IMAGE_STENCIL_USAGE_CREATE_INFO = 1000246000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SAMPLER_FILTER_MINMAX_PROPERTIES = 1000130000;
    public static final int VK_STRUCTURE_TYPE_SAMPLER_REDUCTION_MODE_CREATE_INFO = 1000130001;
    public static final int VK_FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_MINMAX_BIT = 0x00010000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_MEMORY_MODEL_FEATURES = 1000211000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGELESS_FRAMEBUFFER_FEATURES = 1000108000;
    public static final int VK_STRUCTURE_TYPE_FRAMEBUFFER_ATTACHMENTS_CREATE_INFO = 1000108001;
    public static final int VK_STRUCTURE_TYPE_FRAMEBUFFER_ATTACHMENT_IMAGE_INFO = 1000108002;
    public static final int VK_STRUCTURE_TYPE_RENDER_PASS_ATTACHMENT_BEGIN_INFO = 1000108003;
    public static final int VK_FRAMEBUFFER_CREATE_IMAGELESS_BIT = 0x00000001;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_UNIFORM_BUFFER_STANDARD_LAYOUT_FEATURES = 1000253000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_SUBGROUP_EXTENDED_TYPES_FEATURES = 1000175000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SEPARATE_DEPTH_STENCIL_LAYOUTS_FEATURES = 1000241000;
    public static final int VK_STRUCTURE_TYPE_ATTACHMENT_REFERENCE_STENCIL_LAYOUT = 1000241001;
    public static final int VK_STRUCTURE_TYPE_ATTACHMENT_DESCRIPTION_STENCIL_LAYOUT = 1000241002;
    public static final int VK_IMAGE_LAYOUT_DEPTH_ATTACHMENT_OPTIMAL = 1000241000;
    public static final int VK_IMAGE_LAYOUT_DEPTH_READ_ONLY_OPTIMAL = 1000241001;
    public static final int VK_IMAGE_LAYOUT_STENCIL_ATTACHMENT_OPTIMAL = 1000241002;
    public static final int VK_IMAGE_LAYOUT_STENCIL_READ_ONLY_OPTIMAL = 1000241003;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_HOST_QUERY_RESET_FEATURES = 1000261000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TIMELINE_SEMAPHORE_FEATURES = 1000207000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TIMELINE_SEMAPHORE_PROPERTIES = 1000207001;
    public static final int VK_STRUCTURE_TYPE_SEMAPHORE_TYPE_CREATE_INFO = 1000207002;
    public static final int VK_STRUCTURE_TYPE_TIMELINE_SEMAPHORE_SUBMIT_INFO = 1000207003;
    public static final int VK_STRUCTURE_TYPE_SEMAPHORE_WAIT_INFO = 1000207004;
    public static final int VK_STRUCTURE_TYPE_SEMAPHORE_SIGNAL_INFO = 1000207005;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_BUFFER_DEVICE_ADDRESS_FEATURES = 1000257000;
    public static final int VK_STRUCTURE_TYPE_BUFFER_DEVICE_ADDRESS_INFO = 1000244001;
    public static final int VK_STRUCTURE_TYPE_BUFFER_OPAQUE_CAPTURE_ADDRESS_CREATE_INFO = 1000257002;
    public static final int VK_STRUCTURE_TYPE_MEMORY_OPAQUE_CAPTURE_ADDRESS_ALLOCATE_INFO = 1000257003;
    public static final int VK_STRUCTURE_TYPE_DEVICE_MEMORY_OPAQUE_CAPTURE_ADDRESS_INFO = 1000257004;
    public static final int VK_BUFFER_USAGE_SHADER_DEVICE_ADDRESS_BIT = 0x00020000;
    public static final int VK_BUFFER_CREATE_DEVICE_ADDRESS_CAPTURE_REPLAY_BIT = 0x00000010;
    public static final int VK_MEMORY_ALLOCATE_DEVICE_ADDRESS_BIT = 0x00000002;
    public static final int VK_MEMORY_ALLOCATE_DEVICE_ADDRESS_CAPTURE_REPLAY_BIT = 0x00000004;
    public static final int VK_ERROR_INVALID_OPAQUE_CAPTURE_ADDRESS = -1000257000;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_vkCmdDrawIndirectCount = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_vkCmdDrawIndexedIndirectCount = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_vkCreateRenderPass2 = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdBeginRenderPass2 = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdNextSubpass2 = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdEndRenderPass2 = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkResetQueryPool = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_vkGetSemaphoreCounterValue = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkWaitSemaphores = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG));
        public static final MethodHandle MH_vkSignalSemaphore = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetBufferDeviceAddress = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetBufferOpaqueCaptureAddress = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetDeviceMemoryOpaqueCaptureAddress = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public final MemorySegment PFN_vkCmdDrawIndirectCount;
        public final MemorySegment PFN_vkCmdDrawIndexedIndirectCount;
        public final MemorySegment PFN_vkCreateRenderPass2;
        public final MemorySegment PFN_vkCmdBeginRenderPass2;
        public final MemorySegment PFN_vkCmdNextSubpass2;
        public final MemorySegment PFN_vkCmdEndRenderPass2;
        public final MemorySegment PFN_vkResetQueryPool;
        public final MemorySegment PFN_vkGetSemaphoreCounterValue;
        public final MemorySegment PFN_vkWaitSemaphores;
        public final MemorySegment PFN_vkSignalSemaphore;
        public final MemorySegment PFN_vkGetBufferDeviceAddress;
        public final MemorySegment PFN_vkGetBufferOpaqueCaptureAddress;
        public final MemorySegment PFN_vkGetDeviceMemoryOpaqueCaptureAddress;
        private Handles(@CType("VkInstance") MemorySegment instance, VKLoadFunc func) {
            PFN_vkCmdDrawIndirectCount = func.invoke(instance, "vkCmdDrawIndirectCount", "vkCmdDrawIndirectCountKHR", "vkCmdDrawIndirectCountAMD");
            PFN_vkCmdDrawIndexedIndirectCount = func.invoke(instance, "vkCmdDrawIndexedIndirectCount", "vkCmdDrawIndexedIndirectCountKHR", "vkCmdDrawIndexedIndirectCountAMD");
            PFN_vkCreateRenderPass2 = func.invoke(instance, "vkCreateRenderPass2", "vkCreateRenderPass2KHR");
            PFN_vkCmdBeginRenderPass2 = func.invoke(instance, "vkCmdBeginRenderPass2", "vkCmdBeginRenderPass2KHR");
            PFN_vkCmdNextSubpass2 = func.invoke(instance, "vkCmdNextSubpass2", "vkCmdNextSubpass2KHR");
            PFN_vkCmdEndRenderPass2 = func.invoke(instance, "vkCmdEndRenderPass2", "vkCmdEndRenderPass2KHR");
            PFN_vkResetQueryPool = func.invoke(instance, "vkResetQueryPool", "vkResetQueryPoolEXT");
            PFN_vkGetSemaphoreCounterValue = func.invoke(instance, "vkGetSemaphoreCounterValue", "vkGetSemaphoreCounterValueKHR");
            PFN_vkWaitSemaphores = func.invoke(instance, "vkWaitSemaphores", "vkWaitSemaphoresKHR");
            PFN_vkSignalSemaphore = func.invoke(instance, "vkSignalSemaphore", "vkSignalSemaphoreKHR");
            PFN_vkGetBufferDeviceAddress = func.invoke(instance, "vkGetBufferDeviceAddress", "vkGetBufferDeviceAddressKHR", "vkGetBufferDeviceAddressEXT");
            PFN_vkGetBufferOpaqueCaptureAddress = func.invoke(instance, "vkGetBufferOpaqueCaptureAddress", "vkGetBufferOpaqueCaptureAddressKHR");
            PFN_vkGetDeviceMemoryOpaqueCaptureAddress = func.invoke(instance, "vkGetDeviceMemoryOpaqueCaptureAddress", "vkGetDeviceMemoryOpaqueCaptureAddressKHR");
        }
    }

    public VK12(@CType("VkInstance") MemorySegment instance, VKLoadFunc func) {
        super(instance, func);
        this.handles = new Handles(instance, func);
    }

    public void CmdDrawIndirectCount(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("VkBuffer") MemorySegment buffer, @CType("VkDeviceSize") long offset, @CType("VkBuffer") MemorySegment countBuffer, @CType("VkDeviceSize") long countBufferOffset, @CType("uint32_t") int maxDrawCount, @CType("uint32_t") int stride) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCmdDrawIndirectCount)) throw new SymbolNotFoundError("Symbol not found: vkCmdDrawIndirectCount");
        try { Handles.MH_vkCmdDrawIndirectCount.invokeExact(handles.PFN_vkCmdDrawIndirectCount, commandBuffer, buffer, offset, countBuffer, countBufferOffset, maxDrawCount, stride); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdDrawIndirectCount", e); }
    }

    public void CmdDrawIndexedIndirectCount(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("VkBuffer") MemorySegment buffer, @CType("VkDeviceSize") long offset, @CType("VkBuffer") MemorySegment countBuffer, @CType("VkDeviceSize") long countBufferOffset, @CType("uint32_t") int maxDrawCount, @CType("uint32_t") int stride) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCmdDrawIndexedIndirectCount)) throw new SymbolNotFoundError("Symbol not found: vkCmdDrawIndexedIndirectCount");
        try { Handles.MH_vkCmdDrawIndexedIndirectCount.invokeExact(handles.PFN_vkCmdDrawIndexedIndirectCount, commandBuffer, buffer, offset, countBuffer, countBufferOffset, maxDrawCount, stride); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdDrawIndexedIndirectCount", e); }
    }

    public @CType("VkResult") int CreateRenderPass2(@CType("VkDevice") MemorySegment device, @CType("const VkRenderPassCreateInfo2 *") MemorySegment pCreateInfo, @CType("const VkAllocationCallbacks *") MemorySegment pAllocator, @CType("VkRenderPass *") MemorySegment pRenderPass) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCreateRenderPass2)) throw new SymbolNotFoundError("Symbol not found: vkCreateRenderPass2");
        try { return (int) Handles.MH_vkCreateRenderPass2.invokeExact(handles.PFN_vkCreateRenderPass2, device, pCreateInfo, pAllocator, pRenderPass); }
        catch (Throwable e) { throw new RuntimeException("error in vkCreateRenderPass2", e); }
    }

    public void CmdBeginRenderPass2(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("const VkRenderPassBeginInfo *") MemorySegment pRenderPassBegin, @CType("const VkSubpassBeginInfo *") MemorySegment pSubpassBeginInfo) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCmdBeginRenderPass2)) throw new SymbolNotFoundError("Symbol not found: vkCmdBeginRenderPass2");
        try { Handles.MH_vkCmdBeginRenderPass2.invokeExact(handles.PFN_vkCmdBeginRenderPass2, commandBuffer, pRenderPassBegin, pSubpassBeginInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdBeginRenderPass2", e); }
    }

    public void CmdNextSubpass2(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("const VkSubpassBeginInfo *") MemorySegment pSubpassBeginInfo, @CType("const VkSubpassEndInfo *") MemorySegment pSubpassEndInfo) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCmdNextSubpass2)) throw new SymbolNotFoundError("Symbol not found: vkCmdNextSubpass2");
        try { Handles.MH_vkCmdNextSubpass2.invokeExact(handles.PFN_vkCmdNextSubpass2, commandBuffer, pSubpassBeginInfo, pSubpassEndInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdNextSubpass2", e); }
    }

    public void CmdEndRenderPass2(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("const VkSubpassEndInfo *") MemorySegment pSubpassEndInfo) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCmdEndRenderPass2)) throw new SymbolNotFoundError("Symbol not found: vkCmdEndRenderPass2");
        try { Handles.MH_vkCmdEndRenderPass2.invokeExact(handles.PFN_vkCmdEndRenderPass2, commandBuffer, pSubpassEndInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdEndRenderPass2", e); }
    }

    public void ResetQueryPool(@CType("VkDevice") MemorySegment device, @CType("VkQueryPool") MemorySegment queryPool, @CType("uint32_t") int firstQuery, @CType("uint32_t") int queryCount) {
        if (Unmarshal.isNullPointer(handles.PFN_vkResetQueryPool)) throw new SymbolNotFoundError("Symbol not found: vkResetQueryPool");
        try { Handles.MH_vkResetQueryPool.invokeExact(handles.PFN_vkResetQueryPool, device, queryPool, firstQuery, queryCount); }
        catch (Throwable e) { throw new RuntimeException("error in vkResetQueryPool", e); }
    }

    public @CType("VkResult") int GetSemaphoreCounterValue(@CType("VkDevice") MemorySegment device, @CType("VkSemaphore") MemorySegment semaphore, @CType("uint64_t *") MemorySegment pValue) {
        if (Unmarshal.isNullPointer(handles.PFN_vkGetSemaphoreCounterValue)) throw new SymbolNotFoundError("Symbol not found: vkGetSemaphoreCounterValue");
        try { return (int) Handles.MH_vkGetSemaphoreCounterValue.invokeExact(handles.PFN_vkGetSemaphoreCounterValue, device, semaphore, pValue); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetSemaphoreCounterValue", e); }
    }

    public @CType("VkResult") int WaitSemaphores(@CType("VkDevice") MemorySegment device, @CType("const VkSemaphoreWaitInfo *") MemorySegment pWaitInfo, @CType("uint64_t") long timeout) {
        if (Unmarshal.isNullPointer(handles.PFN_vkWaitSemaphores)) throw new SymbolNotFoundError("Symbol not found: vkWaitSemaphores");
        try { return (int) Handles.MH_vkWaitSemaphores.invokeExact(handles.PFN_vkWaitSemaphores, device, pWaitInfo, timeout); }
        catch (Throwable e) { throw new RuntimeException("error in vkWaitSemaphores", e); }
    }

    public @CType("VkResult") int SignalSemaphore(@CType("VkDevice") MemorySegment device, @CType("const VkSemaphoreSignalInfo *") MemorySegment pSignalInfo) {
        if (Unmarshal.isNullPointer(handles.PFN_vkSignalSemaphore)) throw new SymbolNotFoundError("Symbol not found: vkSignalSemaphore");
        try { return (int) Handles.MH_vkSignalSemaphore.invokeExact(handles.PFN_vkSignalSemaphore, device, pSignalInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkSignalSemaphore", e); }
    }

    public @CType("VkDeviceAddress") long GetBufferDeviceAddress(@CType("VkDevice") MemorySegment device, @CType("const VkBufferDeviceAddressInfo *") MemorySegment pInfo) {
        if (Unmarshal.isNullPointer(handles.PFN_vkGetBufferDeviceAddress)) throw new SymbolNotFoundError("Symbol not found: vkGetBufferDeviceAddress");
        try { return (long) Handles.MH_vkGetBufferDeviceAddress.invokeExact(handles.PFN_vkGetBufferDeviceAddress, device, pInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetBufferDeviceAddress", e); }
    }

    public @CType("uint64_t") long GetBufferOpaqueCaptureAddress(@CType("VkDevice") MemorySegment device, @CType("const VkBufferDeviceAddressInfo *") MemorySegment pInfo) {
        if (Unmarshal.isNullPointer(handles.PFN_vkGetBufferOpaqueCaptureAddress)) throw new SymbolNotFoundError("Symbol not found: vkGetBufferOpaqueCaptureAddress");
        try { return (long) Handles.MH_vkGetBufferOpaqueCaptureAddress.invokeExact(handles.PFN_vkGetBufferOpaqueCaptureAddress, device, pInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetBufferOpaqueCaptureAddress", e); }
    }

    public @CType("uint64_t") long GetDeviceMemoryOpaqueCaptureAddress(@CType("VkDevice") MemorySegment device, @CType("const VkDeviceMemoryOpaqueCaptureAddressInfo *") MemorySegment pInfo) {
        if (Unmarshal.isNullPointer(handles.PFN_vkGetDeviceMemoryOpaqueCaptureAddress)) throw new SymbolNotFoundError("Symbol not found: vkGetDeviceMemoryOpaqueCaptureAddress");
        try { return (long) Handles.MH_vkGetDeviceMemoryOpaqueCaptureAddress.invokeExact(handles.PFN_vkGetDeviceMemoryOpaqueCaptureAddress, device, pInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetDeviceMemoryOpaqueCaptureAddress", e); }
    }

}
