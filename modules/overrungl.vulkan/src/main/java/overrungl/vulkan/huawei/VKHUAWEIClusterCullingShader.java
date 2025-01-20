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
package overrungl.vulkan.huawei;
import java.lang.foreign.*;
import java.lang.invoke.*;
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;
import overrungl.vulkan.*;
public class VKHUAWEIClusterCullingShader {
    public static final int VK_HUAWEI_CLUSTER_CULLING_SHADER_SPEC_VERSION = 3;
    public static final String VK_HUAWEI_CLUSTER_CULLING_SHADER_EXTENSION_NAME = "VK_HUAWEI_cluster_culling_shader";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_CLUSTER_CULLING_SHADER_FEATURES_HUAWEI = 1000404000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_CLUSTER_CULLING_SHADER_PROPERTIES_HUAWEI = 1000404001;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_CLUSTER_CULLING_SHADER_VRS_FEATURES_HUAWEI = 1000404002;
    public static final long VK_PIPELINE_STAGE_2_CLUSTER_CULLING_SHADER_BIT_HUAWEI = 0x20000000000L;
    public static final int VK_SHADER_STAGE_CLUSTER_CULLING_BIT_HUAWEI = 0x00080000;
    public static final int VK_QUERY_PIPELINE_STATISTIC_CLUSTER_CULLING_SHADER_INVOCATIONS_BIT_HUAWEI = 0x00002000;
    private final Handles handles;
    public static final class Descriptors {
        public static final FunctionDescriptor FD_vkCmdDrawClusterHUAWEI = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_vkCmdDrawClusterIndirectHUAWEI = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG);
        private Descriptors() {}
    }
    public static final class Handles {
        public static final MethodHandle MH_vkCmdDrawClusterHUAWEI = RuntimeHelper.downcall(Descriptors.FD_vkCmdDrawClusterHUAWEI);
        public static final MethodHandle MH_vkCmdDrawClusterIndirectHUAWEI = RuntimeHelper.downcall(Descriptors.FD_vkCmdDrawClusterIndirectHUAWEI);
        public final MemorySegment PFN_vkCmdDrawClusterHUAWEI;
        public final MemorySegment PFN_vkCmdDrawClusterIndirectHUAWEI;
        private Handles(@CType("VkDevice") MemorySegment device, VKLoadFunc func) {
            PFN_vkCmdDrawClusterHUAWEI = func.invoke(device, "vkCmdDrawClusterHUAWEI");
            PFN_vkCmdDrawClusterIndirectHUAWEI = func.invoke(device, "vkCmdDrawClusterIndirectHUAWEI");
        }
    }

    public VKHUAWEIClusterCullingShader(@CType("VkDevice") MemorySegment device, VKLoadFunc func) {
        this.handles = new Handles(device, func);
    }

    public void CmdDrawClusterHUAWEI(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("uint32_t") int groupCountX, @CType("uint32_t") int groupCountY, @CType("uint32_t") int groupCountZ) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCmdDrawClusterHUAWEI)) throw new SymbolNotFoundError("Symbol not found: vkCmdDrawClusterHUAWEI");
        try { Handles.MH_vkCmdDrawClusterHUAWEI.invokeExact(handles.PFN_vkCmdDrawClusterHUAWEI, commandBuffer, groupCountX, groupCountY, groupCountZ); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdDrawClusterHUAWEI", e); }
    }

    public void CmdDrawClusterIndirectHUAWEI(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("VkBuffer") MemorySegment buffer, @CType("VkDeviceSize") long offset) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCmdDrawClusterIndirectHUAWEI)) throw new SymbolNotFoundError("Symbol not found: vkCmdDrawClusterIndirectHUAWEI");
        try { Handles.MH_vkCmdDrawClusterIndirectHUAWEI.invokeExact(handles.PFN_vkCmdDrawClusterIndirectHUAWEI, commandBuffer, buffer, offset); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdDrawClusterIndirectHUAWEI", e); }
    }

}
