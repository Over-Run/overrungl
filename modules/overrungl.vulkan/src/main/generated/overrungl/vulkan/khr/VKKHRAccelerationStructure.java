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
public final class VKKHRAccelerationStructure {
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
    public static final int VK_GEOMETRY_INSTANCE_TRIANGLE_FRONT_COUNTERCLOCKWISE_BIT_KHR = 0x00000002;
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
    public static final class Handles {
        public static final MethodHandle MH_vkCreateAccelerationStructureKHR = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkDestroyAccelerationStructureKHR = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdBuildAccelerationStructuresKHR = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdBuildAccelerationStructuresIndirectKHR = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkBuildAccelerationStructuresKHR = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCopyAccelerationStructureKHR = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCopyAccelerationStructureToMemoryKHR = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCopyMemoryToAccelerationStructureKHR = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkWriteAccelerationStructuresPropertiesKHR = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, CanonicalTypes.SIZE_T, ValueLayout.ADDRESS, CanonicalTypes.SIZE_T));
        public static final MethodHandle MH_vkCmdCopyAccelerationStructureKHR = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdCopyAccelerationStructureToMemoryKHR = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdCopyMemoryToAccelerationStructureKHR = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetAccelerationStructureDeviceAddressKHR = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdWriteAccelerationStructuresPropertiesKHR = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_vkGetDeviceAccelerationStructureCompatibilityKHR = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetAccelerationStructureBuildSizesKHR = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        private Handles() {}
    }

    private VKKHRAccelerationStructure() {}

    /// ```
    /// (int) VkResult vkCreateAccelerationStructureKHR((struct VkDevice*) VkDevice device, const VkAccelerationStructureCreateInfoKHR* pCreateInfo, const VkAllocationCallbacks* pAllocator, VkAccelerationStructureKHR* pAccelerationStructure);
    /// ```
    public static int vkCreateAccelerationStructureKHR(VkDevice device, MemorySegment pCreateInfo, MemorySegment pAllocator, MemorySegment pAccelerationStructure) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkCreateAccelerationStructureKHR)) throw new SymbolNotFoundError("Symbol not found: vkCreateAccelerationStructureKHR");
        try { return (int) Handles.MH_vkCreateAccelerationStructureKHR.invokeExact(device.capabilities().PFN_vkCreateAccelerationStructureKHR, device.segment(), pCreateInfo, pAllocator, pAccelerationStructure); }
        catch (Throwable e) { throw new RuntimeException("error in vkCreateAccelerationStructureKHR", e); }
    }

    /// ```
    /// void vkDestroyAccelerationStructureKHR((struct VkDevice*) VkDevice device, (uint64_t) VkAccelerationStructureKHR accelerationStructure, const VkAllocationCallbacks* pAllocator);
    /// ```
    public static void vkDestroyAccelerationStructureKHR(VkDevice device, long accelerationStructure, MemorySegment pAllocator) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkDestroyAccelerationStructureKHR)) throw new SymbolNotFoundError("Symbol not found: vkDestroyAccelerationStructureKHR");
        try { Handles.MH_vkDestroyAccelerationStructureKHR.invokeExact(device.capabilities().PFN_vkDestroyAccelerationStructureKHR, device.segment(), accelerationStructure, pAllocator); }
        catch (Throwable e) { throw new RuntimeException("error in vkDestroyAccelerationStructureKHR", e); }
    }

    /// ```
    /// void vkCmdBuildAccelerationStructuresKHR((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, uint32_t infoCount, const VkAccelerationStructureBuildGeometryInfoKHR* pInfos, const VkAccelerationStructureBuildRangeInfoKHR* const * ppBuildRangeInfos);
    /// ```
    public static void vkCmdBuildAccelerationStructuresKHR(VkCommandBuffer commandBuffer, int infoCount, MemorySegment pInfos, MemorySegment ppBuildRangeInfos) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdBuildAccelerationStructuresKHR)) throw new SymbolNotFoundError("Symbol not found: vkCmdBuildAccelerationStructuresKHR");
        try { Handles.MH_vkCmdBuildAccelerationStructuresKHR.invokeExact(commandBuffer.capabilities().PFN_vkCmdBuildAccelerationStructuresKHR, commandBuffer.segment(), infoCount, pInfos, ppBuildRangeInfos); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdBuildAccelerationStructuresKHR", e); }
    }

    /// ```
    /// void vkCmdBuildAccelerationStructuresIndirectKHR((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, uint32_t infoCount, const VkAccelerationStructureBuildGeometryInfoKHR* pInfos, const VkDeviceAddress* pIndirectDeviceAddresses, const uint32_t* pIndirectStrides, const uint32_t* const * ppMaxPrimitiveCounts);
    /// ```
    public static void vkCmdBuildAccelerationStructuresIndirectKHR(VkCommandBuffer commandBuffer, int infoCount, MemorySegment pInfos, MemorySegment pIndirectDeviceAddresses, MemorySegment pIndirectStrides, MemorySegment ppMaxPrimitiveCounts) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdBuildAccelerationStructuresIndirectKHR)) throw new SymbolNotFoundError("Symbol not found: vkCmdBuildAccelerationStructuresIndirectKHR");
        try { Handles.MH_vkCmdBuildAccelerationStructuresIndirectKHR.invokeExact(commandBuffer.capabilities().PFN_vkCmdBuildAccelerationStructuresIndirectKHR, commandBuffer.segment(), infoCount, pInfos, pIndirectDeviceAddresses, pIndirectStrides, ppMaxPrimitiveCounts); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdBuildAccelerationStructuresIndirectKHR", e); }
    }

    /// ```
    /// (int) VkResult vkBuildAccelerationStructuresKHR((struct VkDevice*) VkDevice device, (uint64_t) VkDeferredOperationKHR deferredOperation, uint32_t infoCount, const VkAccelerationStructureBuildGeometryInfoKHR* pInfos, const VkAccelerationStructureBuildRangeInfoKHR* const * ppBuildRangeInfos);
    /// ```
    public static int vkBuildAccelerationStructuresKHR(VkDevice device, long deferredOperation, int infoCount, MemorySegment pInfos, MemorySegment ppBuildRangeInfos) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkBuildAccelerationStructuresKHR)) throw new SymbolNotFoundError("Symbol not found: vkBuildAccelerationStructuresKHR");
        try { return (int) Handles.MH_vkBuildAccelerationStructuresKHR.invokeExact(device.capabilities().PFN_vkBuildAccelerationStructuresKHR, device.segment(), deferredOperation, infoCount, pInfos, ppBuildRangeInfos); }
        catch (Throwable e) { throw new RuntimeException("error in vkBuildAccelerationStructuresKHR", e); }
    }

    /// ```
    /// (int) VkResult vkCopyAccelerationStructureKHR((struct VkDevice*) VkDevice device, (uint64_t) VkDeferredOperationKHR deferredOperation, const VkCopyAccelerationStructureInfoKHR* pInfo);
    /// ```
    public static int vkCopyAccelerationStructureKHR(VkDevice device, long deferredOperation, MemorySegment pInfo) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkCopyAccelerationStructureKHR)) throw new SymbolNotFoundError("Symbol not found: vkCopyAccelerationStructureKHR");
        try { return (int) Handles.MH_vkCopyAccelerationStructureKHR.invokeExact(device.capabilities().PFN_vkCopyAccelerationStructureKHR, device.segment(), deferredOperation, pInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkCopyAccelerationStructureKHR", e); }
    }

    /// ```
    /// (int) VkResult vkCopyAccelerationStructureToMemoryKHR((struct VkDevice*) VkDevice device, (uint64_t) VkDeferredOperationKHR deferredOperation, const VkCopyAccelerationStructureToMemoryInfoKHR* pInfo);
    /// ```
    public static int vkCopyAccelerationStructureToMemoryKHR(VkDevice device, long deferredOperation, MemorySegment pInfo) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkCopyAccelerationStructureToMemoryKHR)) throw new SymbolNotFoundError("Symbol not found: vkCopyAccelerationStructureToMemoryKHR");
        try { return (int) Handles.MH_vkCopyAccelerationStructureToMemoryKHR.invokeExact(device.capabilities().PFN_vkCopyAccelerationStructureToMemoryKHR, device.segment(), deferredOperation, pInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkCopyAccelerationStructureToMemoryKHR", e); }
    }

    /// ```
    /// (int) VkResult vkCopyMemoryToAccelerationStructureKHR((struct VkDevice*) VkDevice device, (uint64_t) VkDeferredOperationKHR deferredOperation, const VkCopyMemoryToAccelerationStructureInfoKHR* pInfo);
    /// ```
    public static int vkCopyMemoryToAccelerationStructureKHR(VkDevice device, long deferredOperation, MemorySegment pInfo) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkCopyMemoryToAccelerationStructureKHR)) throw new SymbolNotFoundError("Symbol not found: vkCopyMemoryToAccelerationStructureKHR");
        try { return (int) Handles.MH_vkCopyMemoryToAccelerationStructureKHR.invokeExact(device.capabilities().PFN_vkCopyMemoryToAccelerationStructureKHR, device.segment(), deferredOperation, pInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkCopyMemoryToAccelerationStructureKHR", e); }
    }

    /// ```
    /// (int) VkResult vkWriteAccelerationStructuresPropertiesKHR((struct VkDevice*) VkDevice device, uint32_t accelerationStructureCount, const VkAccelerationStructureKHR* pAccelerationStructures, (int) VkQueryType queryType, size_t dataSize, void* pData, size_t stride);
    /// ```
    public static int vkWriteAccelerationStructuresPropertiesKHR(VkDevice device, int accelerationStructureCount, MemorySegment pAccelerationStructures, int queryType, long dataSize, MemorySegment pData, long stride) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkWriteAccelerationStructuresPropertiesKHR)) throw new SymbolNotFoundError("Symbol not found: vkWriteAccelerationStructuresPropertiesKHR");
        try { return (int) Handles.MH_vkWriteAccelerationStructuresPropertiesKHR.invoke(device.capabilities().PFN_vkWriteAccelerationStructuresPropertiesKHR, device.segment(), accelerationStructureCount, pAccelerationStructures, queryType, MemoryUtil.narrowingLong(CanonicalTypes.SIZE_T, dataSize), pData, MemoryUtil.narrowingLong(CanonicalTypes.SIZE_T, stride)); }
        catch (Throwable e) { throw new RuntimeException("error in vkWriteAccelerationStructuresPropertiesKHR", e); }
    }

    /// ```
    /// void vkCmdCopyAccelerationStructureKHR((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, const VkCopyAccelerationStructureInfoKHR* pInfo);
    /// ```
    public static void vkCmdCopyAccelerationStructureKHR(VkCommandBuffer commandBuffer, MemorySegment pInfo) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdCopyAccelerationStructureKHR)) throw new SymbolNotFoundError("Symbol not found: vkCmdCopyAccelerationStructureKHR");
        try { Handles.MH_vkCmdCopyAccelerationStructureKHR.invokeExact(commandBuffer.capabilities().PFN_vkCmdCopyAccelerationStructureKHR, commandBuffer.segment(), pInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdCopyAccelerationStructureKHR", e); }
    }

    /// ```
    /// void vkCmdCopyAccelerationStructureToMemoryKHR((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, const VkCopyAccelerationStructureToMemoryInfoKHR* pInfo);
    /// ```
    public static void vkCmdCopyAccelerationStructureToMemoryKHR(VkCommandBuffer commandBuffer, MemorySegment pInfo) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdCopyAccelerationStructureToMemoryKHR)) throw new SymbolNotFoundError("Symbol not found: vkCmdCopyAccelerationStructureToMemoryKHR");
        try { Handles.MH_vkCmdCopyAccelerationStructureToMemoryKHR.invokeExact(commandBuffer.capabilities().PFN_vkCmdCopyAccelerationStructureToMemoryKHR, commandBuffer.segment(), pInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdCopyAccelerationStructureToMemoryKHR", e); }
    }

    /// ```
    /// void vkCmdCopyMemoryToAccelerationStructureKHR((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, const VkCopyMemoryToAccelerationStructureInfoKHR* pInfo);
    /// ```
    public static void vkCmdCopyMemoryToAccelerationStructureKHR(VkCommandBuffer commandBuffer, MemorySegment pInfo) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdCopyMemoryToAccelerationStructureKHR)) throw new SymbolNotFoundError("Symbol not found: vkCmdCopyMemoryToAccelerationStructureKHR");
        try { Handles.MH_vkCmdCopyMemoryToAccelerationStructureKHR.invokeExact(commandBuffer.capabilities().PFN_vkCmdCopyMemoryToAccelerationStructureKHR, commandBuffer.segment(), pInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdCopyMemoryToAccelerationStructureKHR", e); }
    }

    /// ```
    /// (uint64_t) VkDeviceAddress vkGetAccelerationStructureDeviceAddressKHR((struct VkDevice*) VkDevice device, const VkAccelerationStructureDeviceAddressInfoKHR* pInfo);
    /// ```
    public static long vkGetAccelerationStructureDeviceAddressKHR(VkDevice device, MemorySegment pInfo) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkGetAccelerationStructureDeviceAddressKHR)) throw new SymbolNotFoundError("Symbol not found: vkGetAccelerationStructureDeviceAddressKHR");
        try { return (long) Handles.MH_vkGetAccelerationStructureDeviceAddressKHR.invokeExact(device.capabilities().PFN_vkGetAccelerationStructureDeviceAddressKHR, device.segment(), pInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetAccelerationStructureDeviceAddressKHR", e); }
    }

    /// ```
    /// void vkCmdWriteAccelerationStructuresPropertiesKHR((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, uint32_t accelerationStructureCount, const VkAccelerationStructureKHR* pAccelerationStructures, (int) VkQueryType queryType, (uint64_t) VkQueryPool queryPool, uint32_t firstQuery);
    /// ```
    public static void vkCmdWriteAccelerationStructuresPropertiesKHR(VkCommandBuffer commandBuffer, int accelerationStructureCount, MemorySegment pAccelerationStructures, int queryType, long queryPool, int firstQuery) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdWriteAccelerationStructuresPropertiesKHR)) throw new SymbolNotFoundError("Symbol not found: vkCmdWriteAccelerationStructuresPropertiesKHR");
        try { Handles.MH_vkCmdWriteAccelerationStructuresPropertiesKHR.invokeExact(commandBuffer.capabilities().PFN_vkCmdWriteAccelerationStructuresPropertiesKHR, commandBuffer.segment(), accelerationStructureCount, pAccelerationStructures, queryType, queryPool, firstQuery); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdWriteAccelerationStructuresPropertiesKHR", e); }
    }

    /// ```
    /// void vkGetDeviceAccelerationStructureCompatibilityKHR((struct VkDevice*) VkDevice device, const VkAccelerationStructureVersionInfoKHR* pVersionInfo, VkAccelerationStructureCompatibilityKHR* pCompatibility);
    /// ```
    public static void vkGetDeviceAccelerationStructureCompatibilityKHR(VkDevice device, MemorySegment pVersionInfo, MemorySegment pCompatibility) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkGetDeviceAccelerationStructureCompatibilityKHR)) throw new SymbolNotFoundError("Symbol not found: vkGetDeviceAccelerationStructureCompatibilityKHR");
        try { Handles.MH_vkGetDeviceAccelerationStructureCompatibilityKHR.invokeExact(device.capabilities().PFN_vkGetDeviceAccelerationStructureCompatibilityKHR, device.segment(), pVersionInfo, pCompatibility); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetDeviceAccelerationStructureCompatibilityKHR", e); }
    }

    /// ```
    /// void vkGetAccelerationStructureBuildSizesKHR((struct VkDevice*) VkDevice device, (int) VkAccelerationStructureBuildTypeKHR buildType, const VkAccelerationStructureBuildGeometryInfoKHR* pBuildInfo, const uint32_t* pMaxPrimitiveCounts, VkAccelerationStructureBuildSizesInfoKHR* pSizeInfo);
    /// ```
    public static void vkGetAccelerationStructureBuildSizesKHR(VkDevice device, int buildType, MemorySegment pBuildInfo, MemorySegment pMaxPrimitiveCounts, MemorySegment pSizeInfo) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkGetAccelerationStructureBuildSizesKHR)) throw new SymbolNotFoundError("Symbol not found: vkGetAccelerationStructureBuildSizesKHR");
        try { Handles.MH_vkGetAccelerationStructureBuildSizesKHR.invokeExact(device.capabilities().PFN_vkGetAccelerationStructureBuildSizesKHR, device.segment(), buildType, pBuildInfo, pMaxPrimitiveCounts, pSizeInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetAccelerationStructureBuildSizesKHR", e); }
    }

}
