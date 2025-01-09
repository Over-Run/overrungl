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
public class VKKHRAccelerationStructure {
    public static final int VK_ACCELERATION_STRUCTURE_TYPE_TOP_LEVEL_KHR = 0;
    public static final int VK_ACCELERATION_STRUCTURE_TYPE_BOTTOM_LEVEL_KHR = 1;
    public static final int VK_ACCELERATION_STRUCTURE_TYPE_GENERIC_KHR = 2;
    public static final int VK_ACCELERATION_STRUCTURE_BUILD_TYPE_HOST_KHR = 0;
    public static final int VK_ACCELERATION_STRUCTURE_BUILD_TYPE_DEVICE_KHR = 1;
    public static final int VK_ACCELERATION_STRUCTURE_BUILD_TYPE_HOST_OR_DEVICE_KHR = 2;
    public static final int VK_GEOMETRY_OPAQUE_BIT_KHR = 0x00000001;
    public static final int VK_GEOMETRY_NO_DUPLICATE_ANY_HIT_INVOCATION_BIT_KHR = 0x00000002;
    public static final int VK_GEOMETRY_INSTANCE_TRIANGLE_FACING_CULL_DISABLE_BIT_KHR = 0x00000001;
    public static final int VK_GEOMETRY_INSTANCE_TRIANGLE_FLIP_FACING_BIT_KHR = 0x00000002;
    public static final int VK_GEOMETRY_INSTANCE_FORCE_OPAQUE_BIT_KHR = 0x00000004;
    public static final int VK_GEOMETRY_INSTANCE_FORCE_NO_OPAQUE_BIT_KHR = 0x00000008;
    public static final int VK_BUILD_ACCELERATION_STRUCTURE_ALLOW_UPDATE_BIT_KHR = 0x00000001;
    public static final int VK_BUILD_ACCELERATION_STRUCTURE_ALLOW_COMPACTION_BIT_KHR = 0x00000002;
    public static final int VK_BUILD_ACCELERATION_STRUCTURE_PREFER_FAST_TRACE_BIT_KHR = 0x00000004;
    public static final int VK_BUILD_ACCELERATION_STRUCTURE_PREFER_FAST_BUILD_BIT_KHR = 0x00000008;
    public static final int VK_BUILD_ACCELERATION_STRUCTURE_LOW_MEMORY_BIT_KHR = 0x00000010;
    public static final int VK_COPY_ACCELERATION_STRUCTURE_MODE_CLONE_KHR = 0;
    public static final int VK_COPY_ACCELERATION_STRUCTURE_MODE_COMPACT_KHR = 1;
    public static final int VK_GEOMETRY_TYPE_TRIANGLES_KHR = 0;
    public static final int VK_GEOMETRY_TYPE_AABBS_KHR = 1;
    public static final int VK_GEOMETRY_TYPE_INSTANCES_KHR = 2;
    public static final int VK_ACCELERATION_STRUCTURE_COMPATIBILITY_COMPATIBLE_KHR = 0;
    public static final int VK_ACCELERATION_STRUCTURE_COMPATIBILITY_INCOMPATIBLE_KHR = 1;
    public static final int VK_ACCELERATION_STRUCTURE_CREATE_DEVICE_ADDRESS_CAPTURE_REPLAY_BIT_KHR = 0x00000001;
    public static final int VK_BUILD_ACCELERATION_STRUCTURE_MODE_BUILD_KHR = 0;
    public static final int VK_BUILD_ACCELERATION_STRUCTURE_MODE_UPDATE_KHR = 1;
    public static final int VK_KHR_ACCELERATION_STRUCTURE_SPEC_VERSION = 13;
    public static final String VK_KHR_ACCELERATION_STRUCTURE_EXTENSION_NAME = "VK_KHR_acceleration_structure";
    public static final int VK_STRUCTURE_TYPE_WRITE_DESCRIPTOR_SET_ACCELERATION_STRUCTURE_KHR = 1000150007;
    public static final int VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_BUILD_GEOMETRY_INFO_KHR = 1000150000;
    public static final int VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_DEVICE_ADDRESS_INFO_KHR = 1000150002;
    public static final int VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_GEOMETRY_AABBS_DATA_KHR = 1000150003;
    public static final int VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_GEOMETRY_INSTANCES_DATA_KHR = 1000150004;
    public static final int VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_GEOMETRY_TRIANGLES_DATA_KHR = 1000150005;
    public static final int VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_GEOMETRY_KHR = 1000150006;
    public static final int VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_VERSION_INFO_KHR = 1000150009;
    public static final int VK_STRUCTURE_TYPE_COPY_ACCELERATION_STRUCTURE_INFO_KHR = 1000150010;
    public static final int VK_STRUCTURE_TYPE_COPY_ACCELERATION_STRUCTURE_TO_MEMORY_INFO_KHR = 1000150011;
    public static final int VK_STRUCTURE_TYPE_COPY_MEMORY_TO_ACCELERATION_STRUCTURE_INFO_KHR = 1000150012;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_ACCELERATION_STRUCTURE_FEATURES_KHR = 1000150013;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_ACCELERATION_STRUCTURE_PROPERTIES_KHR = 1000150014;
    public static final int VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_CREATE_INFO_KHR = 1000150017;
    public static final int VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_BUILD_SIZES_INFO_KHR = 1000150020;
    public static final int VK_PIPELINE_STAGE_ACCELERATION_STRUCTURE_BUILD_BIT_KHR = 0x02000000;
    public static final int VK_DESCRIPTOR_TYPE_ACCELERATION_STRUCTURE_KHR = 1000150000;
    public static final int VK_ACCESS_ACCELERATION_STRUCTURE_READ_BIT_KHR = 0x00200000;
    public static final int VK_ACCESS_ACCELERATION_STRUCTURE_WRITE_BIT_KHR = 0x00400000;
    public static final int VK_QUERY_TYPE_ACCELERATION_STRUCTURE_COMPACTED_SIZE_KHR = 1000150000;
    public static final int VK_QUERY_TYPE_ACCELERATION_STRUCTURE_SERIALIZATION_SIZE_KHR = 1000150001;
    public static final int VK_OBJECT_TYPE_ACCELERATION_STRUCTURE_KHR = 1000150000;
    public static final int VK_INDEX_TYPE_NONE_KHR = 1000150000;
    public static final int VK_FORMAT_FEATURE_ACCELERATION_STRUCTURE_VERTEX_BUFFER_BIT_KHR = 0x20000000;
    public static final int VK_BUFFER_USAGE_ACCELERATION_STRUCTURE_BUILD_INPUT_READ_ONLY_BIT_KHR = 0x00080000;
    public static final int VK_BUFFER_USAGE_ACCELERATION_STRUCTURE_STORAGE_BIT_KHR = 0x00100000;
    public static final int VK_COPY_ACCELERATION_STRUCTURE_MODE_SERIALIZE_KHR = 2;
    public static final int VK_COPY_ACCELERATION_STRUCTURE_MODE_DESERIALIZE_KHR = 3;
    public static final long VK_FORMAT_FEATURE_2_ACCELERATION_STRUCTURE_VERTEX_BUFFER_BIT_KHR = 0x20000000L;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_ACCELERATION_STRUCTURE_KHR_EXT = 1000150000;
    public static final int VK_GEOMETRY_INSTANCE_TRIANGLE_FRONT_COUNTERCLOCKWISE_BIT_KHR = VK_GEOMETRY_INSTANCE_TRIANGLE_FLIP_FACING_BIT_KHR;
    public static final MethodHandle MH_vkCreateAccelerationStructureKHR = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public static final MethodHandle MH_vkDestroyAccelerationStructureKHR = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public static final MethodHandle MH_vkCmdBuildAccelerationStructuresKHR = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public static final MethodHandle MH_vkCmdBuildAccelerationStructuresIndirectKHR = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public static final MethodHandle MH_vkBuildAccelerationStructuresKHR = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public static final MethodHandle MH_vkCopyAccelerationStructureKHR = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public static final MethodHandle MH_vkCopyAccelerationStructureToMemoryKHR = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public static final MethodHandle MH_vkCopyMemoryToAccelerationStructureKHR = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public static final MethodHandle MH_vkWriteAccelerationStructuresPropertiesKHR = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG));
    public static final MethodHandle MH_vkCmdCopyAccelerationStructureKHR = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public static final MethodHandle MH_vkCmdCopyAccelerationStructureToMemoryKHR = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public static final MethodHandle MH_vkCmdCopyMemoryToAccelerationStructureKHR = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public static final MethodHandle MH_vkGetAccelerationStructureDeviceAddressKHR = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public static final MethodHandle MH_vkCmdWriteAccelerationStructuresPropertiesKHR = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
    public static final MethodHandle MH_vkGetDeviceAccelerationStructureCompatibilityKHR = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public static final MethodHandle MH_vkGetAccelerationStructureBuildSizesKHR = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public final MemorySegment PFN_vkCreateAccelerationStructureKHR;
    public final MemorySegment PFN_vkDestroyAccelerationStructureKHR;
    public final MemorySegment PFN_vkCmdBuildAccelerationStructuresKHR;
    public final MemorySegment PFN_vkCmdBuildAccelerationStructuresIndirectKHR;
    public final MemorySegment PFN_vkBuildAccelerationStructuresKHR;
    public final MemorySegment PFN_vkCopyAccelerationStructureKHR;
    public final MemorySegment PFN_vkCopyAccelerationStructureToMemoryKHR;
    public final MemorySegment PFN_vkCopyMemoryToAccelerationStructureKHR;
    public final MemorySegment PFN_vkWriteAccelerationStructuresPropertiesKHR;
    public final MemorySegment PFN_vkCmdCopyAccelerationStructureKHR;
    public final MemorySegment PFN_vkCmdCopyAccelerationStructureToMemoryKHR;
    public final MemorySegment PFN_vkCmdCopyMemoryToAccelerationStructureKHR;
    public final MemorySegment PFN_vkGetAccelerationStructureDeviceAddressKHR;
    public final MemorySegment PFN_vkCmdWriteAccelerationStructuresPropertiesKHR;
    public final MemorySegment PFN_vkGetDeviceAccelerationStructureCompatibilityKHR;
    public final MemorySegment PFN_vkGetAccelerationStructureBuildSizesKHR;

    public VKKHRAccelerationStructure(@CType("VkDevice") MemorySegment device, VKLoadFunc func) {
        PFN_vkCreateAccelerationStructureKHR = func.invoke(device, "vkCreateAccelerationStructureKHR");
        PFN_vkDestroyAccelerationStructureKHR = func.invoke(device, "vkDestroyAccelerationStructureKHR");
        PFN_vkCmdBuildAccelerationStructuresKHR = func.invoke(device, "vkCmdBuildAccelerationStructuresKHR");
        PFN_vkCmdBuildAccelerationStructuresIndirectKHR = func.invoke(device, "vkCmdBuildAccelerationStructuresIndirectKHR");
        PFN_vkBuildAccelerationStructuresKHR = func.invoke(device, "vkBuildAccelerationStructuresKHR");
        PFN_vkCopyAccelerationStructureKHR = func.invoke(device, "vkCopyAccelerationStructureKHR");
        PFN_vkCopyAccelerationStructureToMemoryKHR = func.invoke(device, "vkCopyAccelerationStructureToMemoryKHR");
        PFN_vkCopyMemoryToAccelerationStructureKHR = func.invoke(device, "vkCopyMemoryToAccelerationStructureKHR");
        PFN_vkWriteAccelerationStructuresPropertiesKHR = func.invoke(device, "vkWriteAccelerationStructuresPropertiesKHR");
        PFN_vkCmdCopyAccelerationStructureKHR = func.invoke(device, "vkCmdCopyAccelerationStructureKHR");
        PFN_vkCmdCopyAccelerationStructureToMemoryKHR = func.invoke(device, "vkCmdCopyAccelerationStructureToMemoryKHR");
        PFN_vkCmdCopyMemoryToAccelerationStructureKHR = func.invoke(device, "vkCmdCopyMemoryToAccelerationStructureKHR");
        PFN_vkGetAccelerationStructureDeviceAddressKHR = func.invoke(device, "vkGetAccelerationStructureDeviceAddressKHR");
        PFN_vkCmdWriteAccelerationStructuresPropertiesKHR = func.invoke(device, "vkCmdWriteAccelerationStructuresPropertiesKHR");
        PFN_vkGetDeviceAccelerationStructureCompatibilityKHR = func.invoke(device, "vkGetDeviceAccelerationStructureCompatibilityKHR");
        PFN_vkGetAccelerationStructureBuildSizesKHR = func.invoke(device, "vkGetAccelerationStructureBuildSizesKHR");
    }

    public @CType("VkResult") int CreateAccelerationStructureKHR(@CType("VkDevice") MemorySegment device, @CType("const VkAccelerationStructureCreateInfoKHR *") MemorySegment pCreateInfo, @CType("const VkAllocationCallbacks *") MemorySegment pAllocator, @CType("VkAccelerationStructureKHR *") MemorySegment pAccelerationStructure) {
        if (Unmarshal.isNullPointer(PFN_vkCreateAccelerationStructureKHR)) throw new SymbolNotFoundError("Symbol not found: vkCreateAccelerationStructureKHR");
        try { return (int) MH_vkCreateAccelerationStructureKHR.invokeExact(PFN_vkCreateAccelerationStructureKHR, device, pCreateInfo, pAllocator, pAccelerationStructure); }
        catch (Throwable e) { throw new RuntimeException("error in vkCreateAccelerationStructureKHR", e); }
    }

    public void DestroyAccelerationStructureKHR(@CType("VkDevice") MemorySegment device, @CType("VkAccelerationStructureKHR") MemorySegment accelerationStructure, @CType("const VkAllocationCallbacks *") MemorySegment pAllocator) {
        if (Unmarshal.isNullPointer(PFN_vkDestroyAccelerationStructureKHR)) throw new SymbolNotFoundError("Symbol not found: vkDestroyAccelerationStructureKHR");
        try { MH_vkDestroyAccelerationStructureKHR.invokeExact(PFN_vkDestroyAccelerationStructureKHR, device, accelerationStructure, pAllocator); }
        catch (Throwable e) { throw new RuntimeException("error in vkDestroyAccelerationStructureKHR", e); }
    }

    public void CmdBuildAccelerationStructuresKHR(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("uint32_t") int infoCount, @CType("const VkAccelerationStructureBuildGeometryInfoKHR *") MemorySegment pInfos, @CType("const VkAccelerationStructureBuildRangeInfoKHR * const*") MemorySegment ppBuildRangeInfos) {
        if (Unmarshal.isNullPointer(PFN_vkCmdBuildAccelerationStructuresKHR)) throw new SymbolNotFoundError("Symbol not found: vkCmdBuildAccelerationStructuresKHR");
        try { MH_vkCmdBuildAccelerationStructuresKHR.invokeExact(PFN_vkCmdBuildAccelerationStructuresKHR, commandBuffer, infoCount, pInfos, ppBuildRangeInfos); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdBuildAccelerationStructuresKHR", e); }
    }

    public void CmdBuildAccelerationStructuresIndirectKHR(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("uint32_t") int infoCount, @CType("const VkAccelerationStructureBuildGeometryInfoKHR *") MemorySegment pInfos, @CType("const VkDeviceAddress *") MemorySegment pIndirectDeviceAddresses, @CType("const uint32_t *") MemorySegment pIndirectStrides, @CType("const uint32_t * const*") MemorySegment ppMaxPrimitiveCounts) {
        if (Unmarshal.isNullPointer(PFN_vkCmdBuildAccelerationStructuresIndirectKHR)) throw new SymbolNotFoundError("Symbol not found: vkCmdBuildAccelerationStructuresIndirectKHR");
        try { MH_vkCmdBuildAccelerationStructuresIndirectKHR.invokeExact(PFN_vkCmdBuildAccelerationStructuresIndirectKHR, commandBuffer, infoCount, pInfos, pIndirectDeviceAddresses, pIndirectStrides, ppMaxPrimitiveCounts); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdBuildAccelerationStructuresIndirectKHR", e); }
    }

    public @CType("VkResult") int BuildAccelerationStructuresKHR(@CType("VkDevice") MemorySegment device, @CType("VkDeferredOperationKHR") MemorySegment deferredOperation, @CType("uint32_t") int infoCount, @CType("const VkAccelerationStructureBuildGeometryInfoKHR *") MemorySegment pInfos, @CType("const VkAccelerationStructureBuildRangeInfoKHR * const*") MemorySegment ppBuildRangeInfos) {
        if (Unmarshal.isNullPointer(PFN_vkBuildAccelerationStructuresKHR)) throw new SymbolNotFoundError("Symbol not found: vkBuildAccelerationStructuresKHR");
        try { return (int) MH_vkBuildAccelerationStructuresKHR.invokeExact(PFN_vkBuildAccelerationStructuresKHR, device, deferredOperation, infoCount, pInfos, ppBuildRangeInfos); }
        catch (Throwable e) { throw new RuntimeException("error in vkBuildAccelerationStructuresKHR", e); }
    }

    public @CType("VkResult") int CopyAccelerationStructureKHR(@CType("VkDevice") MemorySegment device, @CType("VkDeferredOperationKHR") MemorySegment deferredOperation, @CType("const VkCopyAccelerationStructureInfoKHR *") MemorySegment pInfo) {
        if (Unmarshal.isNullPointer(PFN_vkCopyAccelerationStructureKHR)) throw new SymbolNotFoundError("Symbol not found: vkCopyAccelerationStructureKHR");
        try { return (int) MH_vkCopyAccelerationStructureKHR.invokeExact(PFN_vkCopyAccelerationStructureKHR, device, deferredOperation, pInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkCopyAccelerationStructureKHR", e); }
    }

    public @CType("VkResult") int CopyAccelerationStructureToMemoryKHR(@CType("VkDevice") MemorySegment device, @CType("VkDeferredOperationKHR") MemorySegment deferredOperation, @CType("const VkCopyAccelerationStructureToMemoryInfoKHR *") MemorySegment pInfo) {
        if (Unmarshal.isNullPointer(PFN_vkCopyAccelerationStructureToMemoryKHR)) throw new SymbolNotFoundError("Symbol not found: vkCopyAccelerationStructureToMemoryKHR");
        try { return (int) MH_vkCopyAccelerationStructureToMemoryKHR.invokeExact(PFN_vkCopyAccelerationStructureToMemoryKHR, device, deferredOperation, pInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkCopyAccelerationStructureToMemoryKHR", e); }
    }

    public @CType("VkResult") int CopyMemoryToAccelerationStructureKHR(@CType("VkDevice") MemorySegment device, @CType("VkDeferredOperationKHR") MemorySegment deferredOperation, @CType("const VkCopyMemoryToAccelerationStructureInfoKHR *") MemorySegment pInfo) {
        if (Unmarshal.isNullPointer(PFN_vkCopyMemoryToAccelerationStructureKHR)) throw new SymbolNotFoundError("Symbol not found: vkCopyMemoryToAccelerationStructureKHR");
        try { return (int) MH_vkCopyMemoryToAccelerationStructureKHR.invokeExact(PFN_vkCopyMemoryToAccelerationStructureKHR, device, deferredOperation, pInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkCopyMemoryToAccelerationStructureKHR", e); }
    }

    public @CType("VkResult") int WriteAccelerationStructuresPropertiesKHR(@CType("VkDevice") MemorySegment device, @CType("uint32_t") int accelerationStructureCount, @CType("const VkAccelerationStructureKHR *") MemorySegment pAccelerationStructures, @CType("VkQueryType") int queryType, @CType("size_t") long dataSize, @CType("void *") MemorySegment pData, @CType("size_t") long stride) {
        if (Unmarshal.isNullPointer(PFN_vkWriteAccelerationStructuresPropertiesKHR)) throw new SymbolNotFoundError("Symbol not found: vkWriteAccelerationStructuresPropertiesKHR");
        try { return (int) MH_vkWriteAccelerationStructuresPropertiesKHR.invokeExact(PFN_vkWriteAccelerationStructuresPropertiesKHR, device, accelerationStructureCount, pAccelerationStructures, queryType, dataSize, pData, stride); }
        catch (Throwable e) { throw new RuntimeException("error in vkWriteAccelerationStructuresPropertiesKHR", e); }
    }

    public void CmdCopyAccelerationStructureKHR(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("const VkCopyAccelerationStructureInfoKHR *") MemorySegment pInfo) {
        if (Unmarshal.isNullPointer(PFN_vkCmdCopyAccelerationStructureKHR)) throw new SymbolNotFoundError("Symbol not found: vkCmdCopyAccelerationStructureKHR");
        try { MH_vkCmdCopyAccelerationStructureKHR.invokeExact(PFN_vkCmdCopyAccelerationStructureKHR, commandBuffer, pInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdCopyAccelerationStructureKHR", e); }
    }

    public void CmdCopyAccelerationStructureToMemoryKHR(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("const VkCopyAccelerationStructureToMemoryInfoKHR *") MemorySegment pInfo) {
        if (Unmarshal.isNullPointer(PFN_vkCmdCopyAccelerationStructureToMemoryKHR)) throw new SymbolNotFoundError("Symbol not found: vkCmdCopyAccelerationStructureToMemoryKHR");
        try { MH_vkCmdCopyAccelerationStructureToMemoryKHR.invokeExact(PFN_vkCmdCopyAccelerationStructureToMemoryKHR, commandBuffer, pInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdCopyAccelerationStructureToMemoryKHR", e); }
    }

    public void CmdCopyMemoryToAccelerationStructureKHR(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("const VkCopyMemoryToAccelerationStructureInfoKHR *") MemorySegment pInfo) {
        if (Unmarshal.isNullPointer(PFN_vkCmdCopyMemoryToAccelerationStructureKHR)) throw new SymbolNotFoundError("Symbol not found: vkCmdCopyMemoryToAccelerationStructureKHR");
        try { MH_vkCmdCopyMemoryToAccelerationStructureKHR.invokeExact(PFN_vkCmdCopyMemoryToAccelerationStructureKHR, commandBuffer, pInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdCopyMemoryToAccelerationStructureKHR", e); }
    }

    public @CType("VkDeviceAddress") long GetAccelerationStructureDeviceAddressKHR(@CType("VkDevice") MemorySegment device, @CType("const VkAccelerationStructureDeviceAddressInfoKHR *") MemorySegment pInfo) {
        if (Unmarshal.isNullPointer(PFN_vkGetAccelerationStructureDeviceAddressKHR)) throw new SymbolNotFoundError("Symbol not found: vkGetAccelerationStructureDeviceAddressKHR");
        try { return (long) MH_vkGetAccelerationStructureDeviceAddressKHR.invokeExact(PFN_vkGetAccelerationStructureDeviceAddressKHR, device, pInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetAccelerationStructureDeviceAddressKHR", e); }
    }

    public void CmdWriteAccelerationStructuresPropertiesKHR(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("uint32_t") int accelerationStructureCount, @CType("const VkAccelerationStructureKHR *") MemorySegment pAccelerationStructures, @CType("VkQueryType") int queryType, @CType("VkQueryPool") MemorySegment queryPool, @CType("uint32_t") int firstQuery) {
        if (Unmarshal.isNullPointer(PFN_vkCmdWriteAccelerationStructuresPropertiesKHR)) throw new SymbolNotFoundError("Symbol not found: vkCmdWriteAccelerationStructuresPropertiesKHR");
        try { MH_vkCmdWriteAccelerationStructuresPropertiesKHR.invokeExact(PFN_vkCmdWriteAccelerationStructuresPropertiesKHR, commandBuffer, accelerationStructureCount, pAccelerationStructures, queryType, queryPool, firstQuery); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdWriteAccelerationStructuresPropertiesKHR", e); }
    }

    public void GetDeviceAccelerationStructureCompatibilityKHR(@CType("VkDevice") MemorySegment device, @CType("const VkAccelerationStructureVersionInfoKHR *") MemorySegment pVersionInfo, @CType("VkAccelerationStructureCompatibilityKHR *") MemorySegment pCompatibility) {
        if (Unmarshal.isNullPointer(PFN_vkGetDeviceAccelerationStructureCompatibilityKHR)) throw new SymbolNotFoundError("Symbol not found: vkGetDeviceAccelerationStructureCompatibilityKHR");
        try { MH_vkGetDeviceAccelerationStructureCompatibilityKHR.invokeExact(PFN_vkGetDeviceAccelerationStructureCompatibilityKHR, device, pVersionInfo, pCompatibility); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetDeviceAccelerationStructureCompatibilityKHR", e); }
    }

    public void GetAccelerationStructureBuildSizesKHR(@CType("VkDevice") MemorySegment device, @CType("VkAccelerationStructureBuildTypeKHR") int buildType, @CType("const VkAccelerationStructureBuildGeometryInfoKHR *") MemorySegment pBuildInfo, @CType("const uint32_t *") MemorySegment pMaxPrimitiveCounts, @CType("VkAccelerationStructureBuildSizesInfoKHR *") MemorySegment pSizeInfo) {
        if (Unmarshal.isNullPointer(PFN_vkGetAccelerationStructureBuildSizesKHR)) throw new SymbolNotFoundError("Symbol not found: vkGetAccelerationStructureBuildSizesKHR");
        try { MH_vkGetAccelerationStructureBuildSizesKHR.invokeExact(PFN_vkGetAccelerationStructureBuildSizesKHR, device, buildType, pBuildInfo, pMaxPrimitiveCounts, pSizeInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetAccelerationStructureBuildSizesKHR", e); }
    }

}