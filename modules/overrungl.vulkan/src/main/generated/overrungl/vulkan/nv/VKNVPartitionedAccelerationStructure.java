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
import static overrungl.internal.RuntimeHelper.*;
import overrungl.util.*;
import overrungl.vulkan.*;
public final class VKNVPartitionedAccelerationStructure {
    public static final int VK_PARTITIONED_ACCELERATION_STRUCTURE_OP_TYPE_WRITE_INSTANCE_NV = 0;
    public static final int VK_PARTITIONED_ACCELERATION_STRUCTURE_OP_TYPE_UPDATE_INSTANCE_NV = 1;
    public static final int VK_PARTITIONED_ACCELERATION_STRUCTURE_OP_TYPE_WRITE_PARTITION_TRANSLATION_NV = 2;
    public static final int VK_PARTITIONED_ACCELERATION_STRUCTURE_INSTANCE_FLAG_TRIANGLE_FACING_CULL_DISABLE_BIT_NV = 0x00000001;
    public static final int VK_PARTITIONED_ACCELERATION_STRUCTURE_INSTANCE_FLAG_TRIANGLE_FLIP_FACING_BIT_NV = 0x00000002;
    public static final int VK_PARTITIONED_ACCELERATION_STRUCTURE_INSTANCE_FLAG_FORCE_OPAQUE_BIT_NV = 0x00000004;
    public static final int VK_PARTITIONED_ACCELERATION_STRUCTURE_INSTANCE_FLAG_FORCE_NO_OPAQUE_BIT_NV = 0x00000008;
    public static final int VK_PARTITIONED_ACCELERATION_STRUCTURE_INSTANCE_FLAG_ENABLE_EXPLICIT_BOUNDING_BOX_NV = 0x00000010;
    public static final int VK_NV_PARTITIONED_ACCELERATION_STRUCTURE_SPEC_VERSION = 1;
    public static final String VK_NV_PARTITIONED_ACCELERATION_STRUCTURE_EXTENSION_NAME = "VK_NV_partitioned_acceleration_structure";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PARTITIONED_ACCELERATION_STRUCTURE_FEATURES_NV = 1000570000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PARTITIONED_ACCELERATION_STRUCTURE_PROPERTIES_NV = 1000570001;
    public static final int VK_STRUCTURE_TYPE_WRITE_DESCRIPTOR_SET_PARTITIONED_ACCELERATION_STRUCTURE_NV = 1000570002;
    public static final int VK_STRUCTURE_TYPE_PARTITIONED_ACCELERATION_STRUCTURE_INSTANCES_INPUT_NV = 1000570003;
    public static final int VK_STRUCTURE_TYPE_BUILD_PARTITIONED_ACCELERATION_STRUCTURE_INFO_NV = 1000570004;
    public static final int VK_STRUCTURE_TYPE_PARTITIONED_ACCELERATION_STRUCTURE_FLAGS_NV = 1000570005;
    public static final int VK_DESCRIPTOR_TYPE_PARTITIONED_ACCELERATION_STRUCTURE_NV = 1000570000;
    public static final int VK_PARTITIONED_ACCELERATION_STRUCTURE_PARTITION_INDEX_GLOBAL_NV = (~0);
    public static final class Handles {
        public static final MethodHandle MH_vkGetPartitionedAccelerationStructuresBuildSizesNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdBuildPartitionedAccelerationStructuresNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        private Handles() {}
    }

    private VKNVPartitionedAccelerationStructure() {}

    /// ```
    /// void vkGetPartitionedAccelerationStructuresBuildSizesNV((struct VkDevice*) VkDevice device, const VkPartitionedAccelerationStructureInstancesInputNV* pInfo, VkAccelerationStructureBuildSizesInfoKHR* pSizeInfo);
    /// ```
    public static void vkGetPartitionedAccelerationStructuresBuildSizesNV(VkDevice device, MemorySegment pInfo, MemorySegment pSizeInfo) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkGetPartitionedAccelerationStructuresBuildSizesNV)) throw new VKSymbolNotFoundError("Symbol not found: vkGetPartitionedAccelerationStructuresBuildSizesNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkGetPartitionedAccelerationStructuresBuildSizesNV", device, pInfo, pSizeInfo); }
        Handles.MH_vkGetPartitionedAccelerationStructuresBuildSizesNV.invokeExact(device.capabilities().PFN_vkGetPartitionedAccelerationStructuresBuildSizesNV, device.segment(), pInfo, pSizeInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetPartitionedAccelerationStructuresBuildSizesNV", e); }
    }

    /// ```
    /// void vkCmdBuildPartitionedAccelerationStructuresNV((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, const VkBuildPartitionedAccelerationStructureInfoNV* pBuildInfo);
    /// ```
    public static void vkCmdBuildPartitionedAccelerationStructuresNV(VkCommandBuffer commandBuffer, MemorySegment pBuildInfo) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdBuildPartitionedAccelerationStructuresNV)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdBuildPartitionedAccelerationStructuresNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdBuildPartitionedAccelerationStructuresNV", commandBuffer, pBuildInfo); }
        Handles.MH_vkCmdBuildPartitionedAccelerationStructuresNV.invokeExact(commandBuffer.capabilities().PFN_vkCmdBuildPartitionedAccelerationStructuresNV, commandBuffer.segment(), pBuildInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdBuildPartitionedAccelerationStructuresNV", e); }
    }

}
