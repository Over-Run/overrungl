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
import static overrungl.internal.RuntimeHelper.*;
import overrungl.util.*;
import overrungl.vulkan.*;
public final class VKHUAWEIClusterCullingShader {
    public static final int VK_HUAWEI_CLUSTER_CULLING_SHADER_SPEC_VERSION = 3;
    public static final String VK_HUAWEI_CLUSTER_CULLING_SHADER_EXTENSION_NAME = "VK_HUAWEI_cluster_culling_shader";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_CLUSTER_CULLING_SHADER_FEATURES_HUAWEI = 1000404000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_CLUSTER_CULLING_SHADER_PROPERTIES_HUAWEI = 1000404001;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_CLUSTER_CULLING_SHADER_VRS_FEATURES_HUAWEI = 1000404002;
    public static final long VK_PIPELINE_STAGE_2_CLUSTER_CULLING_SHADER_BIT_HUAWEI = 0x20000000000L;
    public static final int VK_SHADER_STAGE_CLUSTER_CULLING_BIT_HUAWEI = 0x00080000;
    public static final int VK_QUERY_PIPELINE_STATISTIC_CLUSTER_CULLING_SHADER_INVOCATIONS_BIT_HUAWEI = 0x00002000;
    public static final class Handles {
        public static final MethodHandle MH_vkCmdDrawClusterHUAWEI = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_vkCmdDrawClusterIndirectHUAWEI = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG));
        private Handles() {}
    }

    private VKHUAWEIClusterCullingShader() {}

    /// ```
    /// void vkCmdDrawClusterHUAWEI((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, uint32_t groupCountX, uint32_t groupCountY, uint32_t groupCountZ);
    /// ```
    public static void vkCmdDrawClusterHUAWEI(VkCommandBuffer commandBuffer, int groupCountX, int groupCountY, int groupCountZ) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdDrawClusterHUAWEI)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdDrawClusterHUAWEI");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdDrawClusterHUAWEI", commandBuffer, groupCountX, groupCountY, groupCountZ); }
        Handles.MH_vkCmdDrawClusterHUAWEI.invokeExact(commandBuffer.capabilities().PFN_vkCmdDrawClusterHUAWEI, commandBuffer.segment(), groupCountX, groupCountY, groupCountZ); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdDrawClusterHUAWEI", e); }
    }

    /// ```
    /// void vkCmdDrawClusterIndirectHUAWEI((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, (uint64_t) VkBuffer buffer, (uint64_t) VkDeviceSize offset);
    /// ```
    public static void vkCmdDrawClusterIndirectHUAWEI(VkCommandBuffer commandBuffer, long buffer, long offset) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdDrawClusterIndirectHUAWEI)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdDrawClusterIndirectHUAWEI");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdDrawClusterIndirectHUAWEI", commandBuffer, buffer, offset); }
        Handles.MH_vkCmdDrawClusterIndirectHUAWEI.invokeExact(commandBuffer.capabilities().PFN_vkCmdDrawClusterIndirectHUAWEI, commandBuffer.segment(), buffer, offset); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdDrawClusterIndirectHUAWEI", e); }
    }

}
