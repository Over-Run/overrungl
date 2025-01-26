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
    private final Handles handles;
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
        private Handles(MemorySegment device, VKLoadFunc func) {
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
    }

    public VKKHRAccelerationStructure(MemorySegment device, VKLoadFunc func) {
        this.handles = new Handles(device, func);
    }

    /// ```
    /// VkResult vkCreateAccelerationStructureKHR(VkDevice device, const VkAccelerationStructureCreateInfoKHR* pCreateInfo, const VkAllocationCallbacks* pAllocator, VkAccelerationStructureKHR* pAccelerationStructure);
    /// ```
    public int CreateAccelerationStructureKHR(MemorySegment device, MemorySegment pCreateInfo, MemorySegment pAllocator, MemorySegment pAccelerationStructure) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCreateAccelerationStructureKHR)) throw new SymbolNotFoundError("Symbol not found: vkCreateAccelerationStructureKHR");
        try { return (int) Handles.MH_vkCreateAccelerationStructureKHR.invokeExact(handles.PFN_vkCreateAccelerationStructureKHR, device, pCreateInfo, pAllocator, pAccelerationStructure); }
        catch (Throwable e) { throw new RuntimeException("error in CreateAccelerationStructureKHR", e); }
    }

    /// ```
    /// void vkDestroyAccelerationStructureKHR(VkDevice device, VkAccelerationStructureKHR accelerationStructure, const VkAllocationCallbacks* pAllocator);
    /// ```
    public void DestroyAccelerationStructureKHR(MemorySegment device, long accelerationStructure, MemorySegment pAllocator) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkDestroyAccelerationStructureKHR)) throw new SymbolNotFoundError("Symbol not found: vkDestroyAccelerationStructureKHR");
        try { Handles.MH_vkDestroyAccelerationStructureKHR.invokeExact(handles.PFN_vkDestroyAccelerationStructureKHR, device, accelerationStructure, pAllocator); }
        catch (Throwable e) { throw new RuntimeException("error in DestroyAccelerationStructureKHR", e); }
    }

    /// ```
    /// void vkCmdBuildAccelerationStructuresKHR(VkCommandBuffer commandBuffer, uint32_t infoCount, const VkAccelerationStructureBuildGeometryInfoKHR* pInfos, const VkAccelerationStructureBuildRangeInfoKHR* const * ppBuildRangeInfos);
    /// ```
    public void CmdBuildAccelerationStructuresKHR(MemorySegment commandBuffer, int infoCount, MemorySegment pInfos, MemorySegment ppBuildRangeInfos) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCmdBuildAccelerationStructuresKHR)) throw new SymbolNotFoundError("Symbol not found: vkCmdBuildAccelerationStructuresKHR");
        try { Handles.MH_vkCmdBuildAccelerationStructuresKHR.invokeExact(handles.PFN_vkCmdBuildAccelerationStructuresKHR, commandBuffer, infoCount, pInfos, ppBuildRangeInfos); }
        catch (Throwable e) { throw new RuntimeException("error in CmdBuildAccelerationStructuresKHR", e); }
    }

    /// ```
    /// void vkCmdBuildAccelerationStructuresIndirectKHR(VkCommandBuffer commandBuffer, uint32_t infoCount, const VkAccelerationStructureBuildGeometryInfoKHR* pInfos, const VkDeviceAddress* pIndirectDeviceAddresses, const uint32_t* pIndirectStrides, const uint32_t* const * ppMaxPrimitiveCounts);
    /// ```
    public void CmdBuildAccelerationStructuresIndirectKHR(MemorySegment commandBuffer, int infoCount, MemorySegment pInfos, MemorySegment pIndirectDeviceAddresses, MemorySegment pIndirectStrides, MemorySegment ppMaxPrimitiveCounts) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCmdBuildAccelerationStructuresIndirectKHR)) throw new SymbolNotFoundError("Symbol not found: vkCmdBuildAccelerationStructuresIndirectKHR");
        try { Handles.MH_vkCmdBuildAccelerationStructuresIndirectKHR.invokeExact(handles.PFN_vkCmdBuildAccelerationStructuresIndirectKHR, commandBuffer, infoCount, pInfos, pIndirectDeviceAddresses, pIndirectStrides, ppMaxPrimitiveCounts); }
        catch (Throwable e) { throw new RuntimeException("error in CmdBuildAccelerationStructuresIndirectKHR", e); }
    }

    /// ```
    /// VkResult vkBuildAccelerationStructuresKHR(VkDevice device, VkDeferredOperationKHR deferredOperation, uint32_t infoCount, const VkAccelerationStructureBuildGeometryInfoKHR* pInfos, const VkAccelerationStructureBuildRangeInfoKHR* const * ppBuildRangeInfos);
    /// ```
    public int BuildAccelerationStructuresKHR(MemorySegment device, long deferredOperation, int infoCount, MemorySegment pInfos, MemorySegment ppBuildRangeInfos) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkBuildAccelerationStructuresKHR)) throw new SymbolNotFoundError("Symbol not found: vkBuildAccelerationStructuresKHR");
        try { return (int) Handles.MH_vkBuildAccelerationStructuresKHR.invokeExact(handles.PFN_vkBuildAccelerationStructuresKHR, device, deferredOperation, infoCount, pInfos, ppBuildRangeInfos); }
        catch (Throwable e) { throw new RuntimeException("error in BuildAccelerationStructuresKHR", e); }
    }

    /// ```
    /// VkResult vkCopyAccelerationStructureKHR(VkDevice device, VkDeferredOperationKHR deferredOperation, const VkCopyAccelerationStructureInfoKHR* pInfo);
    /// ```
    public int CopyAccelerationStructureKHR(MemorySegment device, long deferredOperation, MemorySegment pInfo) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCopyAccelerationStructureKHR)) throw new SymbolNotFoundError("Symbol not found: vkCopyAccelerationStructureKHR");
        try { return (int) Handles.MH_vkCopyAccelerationStructureKHR.invokeExact(handles.PFN_vkCopyAccelerationStructureKHR, device, deferredOperation, pInfo); }
        catch (Throwable e) { throw new RuntimeException("error in CopyAccelerationStructureKHR", e); }
    }

    /// ```
    /// VkResult vkCopyAccelerationStructureToMemoryKHR(VkDevice device, VkDeferredOperationKHR deferredOperation, const VkCopyAccelerationStructureToMemoryInfoKHR* pInfo);
    /// ```
    public int CopyAccelerationStructureToMemoryKHR(MemorySegment device, long deferredOperation, MemorySegment pInfo) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCopyAccelerationStructureToMemoryKHR)) throw new SymbolNotFoundError("Symbol not found: vkCopyAccelerationStructureToMemoryKHR");
        try { return (int) Handles.MH_vkCopyAccelerationStructureToMemoryKHR.invokeExact(handles.PFN_vkCopyAccelerationStructureToMemoryKHR, device, deferredOperation, pInfo); }
        catch (Throwable e) { throw new RuntimeException("error in CopyAccelerationStructureToMemoryKHR", e); }
    }

    /// ```
    /// VkResult vkCopyMemoryToAccelerationStructureKHR(VkDevice device, VkDeferredOperationKHR deferredOperation, const VkCopyMemoryToAccelerationStructureInfoKHR* pInfo);
    /// ```
    public int CopyMemoryToAccelerationStructureKHR(MemorySegment device, long deferredOperation, MemorySegment pInfo) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCopyMemoryToAccelerationStructureKHR)) throw new SymbolNotFoundError("Symbol not found: vkCopyMemoryToAccelerationStructureKHR");
        try { return (int) Handles.MH_vkCopyMemoryToAccelerationStructureKHR.invokeExact(handles.PFN_vkCopyMemoryToAccelerationStructureKHR, device, deferredOperation, pInfo); }
        catch (Throwable e) { throw new RuntimeException("error in CopyMemoryToAccelerationStructureKHR", e); }
    }

    /// ```
    /// VkResult vkWriteAccelerationStructuresPropertiesKHR(VkDevice device, uint32_t accelerationStructureCount, const VkAccelerationStructureKHR* pAccelerationStructures, VkQueryType queryType, size_t dataSize, void* pData, size_t stride);
    /// ```
    public int WriteAccelerationStructuresPropertiesKHR(MemorySegment device, int accelerationStructureCount, MemorySegment pAccelerationStructures, int queryType, long dataSize, MemorySegment pData, long stride) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkWriteAccelerationStructuresPropertiesKHR)) throw new SymbolNotFoundError("Symbol not found: vkWriteAccelerationStructuresPropertiesKHR");
        try { return (int) Handles.MH_vkWriteAccelerationStructuresPropertiesKHR.invoke(handles.PFN_vkWriteAccelerationStructuresPropertiesKHR, device, accelerationStructureCount, pAccelerationStructures, queryType, MemoryUtil.narrowingLong(CanonicalTypes.SIZE_T, dataSize), pData, MemoryUtil.narrowingLong(CanonicalTypes.SIZE_T, stride)); }
        catch (Throwable e) { throw new RuntimeException("error in WriteAccelerationStructuresPropertiesKHR", e); }
    }

    /// ```
    /// void vkCmdCopyAccelerationStructureKHR(VkCommandBuffer commandBuffer, const VkCopyAccelerationStructureInfoKHR* pInfo);
    /// ```
    public void CmdCopyAccelerationStructureKHR(MemorySegment commandBuffer, MemorySegment pInfo) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCmdCopyAccelerationStructureKHR)) throw new SymbolNotFoundError("Symbol not found: vkCmdCopyAccelerationStructureKHR");
        try { Handles.MH_vkCmdCopyAccelerationStructureKHR.invokeExact(handles.PFN_vkCmdCopyAccelerationStructureKHR, commandBuffer, pInfo); }
        catch (Throwable e) { throw new RuntimeException("error in CmdCopyAccelerationStructureKHR", e); }
    }

    /// ```
    /// void vkCmdCopyAccelerationStructureToMemoryKHR(VkCommandBuffer commandBuffer, const VkCopyAccelerationStructureToMemoryInfoKHR* pInfo);
    /// ```
    public void CmdCopyAccelerationStructureToMemoryKHR(MemorySegment commandBuffer, MemorySegment pInfo) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCmdCopyAccelerationStructureToMemoryKHR)) throw new SymbolNotFoundError("Symbol not found: vkCmdCopyAccelerationStructureToMemoryKHR");
        try { Handles.MH_vkCmdCopyAccelerationStructureToMemoryKHR.invokeExact(handles.PFN_vkCmdCopyAccelerationStructureToMemoryKHR, commandBuffer, pInfo); }
        catch (Throwable e) { throw new RuntimeException("error in CmdCopyAccelerationStructureToMemoryKHR", e); }
    }

    /// ```
    /// void vkCmdCopyMemoryToAccelerationStructureKHR(VkCommandBuffer commandBuffer, const VkCopyMemoryToAccelerationStructureInfoKHR* pInfo);
    /// ```
    public void CmdCopyMemoryToAccelerationStructureKHR(MemorySegment commandBuffer, MemorySegment pInfo) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCmdCopyMemoryToAccelerationStructureKHR)) throw new SymbolNotFoundError("Symbol not found: vkCmdCopyMemoryToAccelerationStructureKHR");
        try { Handles.MH_vkCmdCopyMemoryToAccelerationStructureKHR.invokeExact(handles.PFN_vkCmdCopyMemoryToAccelerationStructureKHR, commandBuffer, pInfo); }
        catch (Throwable e) { throw new RuntimeException("error in CmdCopyMemoryToAccelerationStructureKHR", e); }
    }

    /// ```
    /// VkDeviceAddress vkGetAccelerationStructureDeviceAddressKHR(VkDevice device, const VkAccelerationStructureDeviceAddressInfoKHR* pInfo);
    /// ```
    public long GetAccelerationStructureDeviceAddressKHR(MemorySegment device, MemorySegment pInfo) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkGetAccelerationStructureDeviceAddressKHR)) throw new SymbolNotFoundError("Symbol not found: vkGetAccelerationStructureDeviceAddressKHR");
        try { return (long) Handles.MH_vkGetAccelerationStructureDeviceAddressKHR.invokeExact(handles.PFN_vkGetAccelerationStructureDeviceAddressKHR, device, pInfo); }
        catch (Throwable e) { throw new RuntimeException("error in GetAccelerationStructureDeviceAddressKHR", e); }
    }

    /// ```
    /// void vkCmdWriteAccelerationStructuresPropertiesKHR(VkCommandBuffer commandBuffer, uint32_t accelerationStructureCount, const VkAccelerationStructureKHR* pAccelerationStructures, VkQueryType queryType, VkQueryPool queryPool, uint32_t firstQuery);
    /// ```
    public void CmdWriteAccelerationStructuresPropertiesKHR(MemorySegment commandBuffer, int accelerationStructureCount, MemorySegment pAccelerationStructures, int queryType, long queryPool, int firstQuery) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCmdWriteAccelerationStructuresPropertiesKHR)) throw new SymbolNotFoundError("Symbol not found: vkCmdWriteAccelerationStructuresPropertiesKHR");
        try { Handles.MH_vkCmdWriteAccelerationStructuresPropertiesKHR.invokeExact(handles.PFN_vkCmdWriteAccelerationStructuresPropertiesKHR, commandBuffer, accelerationStructureCount, pAccelerationStructures, queryType, queryPool, firstQuery); }
        catch (Throwable e) { throw new RuntimeException("error in CmdWriteAccelerationStructuresPropertiesKHR", e); }
    }

    /// ```
    /// void vkGetDeviceAccelerationStructureCompatibilityKHR(VkDevice device, const VkAccelerationStructureVersionInfoKHR* pVersionInfo, VkAccelerationStructureCompatibilityKHR* pCompatibility);
    /// ```
    public void GetDeviceAccelerationStructureCompatibilityKHR(MemorySegment device, MemorySegment pVersionInfo, MemorySegment pCompatibility) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkGetDeviceAccelerationStructureCompatibilityKHR)) throw new SymbolNotFoundError("Symbol not found: vkGetDeviceAccelerationStructureCompatibilityKHR");
        try { Handles.MH_vkGetDeviceAccelerationStructureCompatibilityKHR.invokeExact(handles.PFN_vkGetDeviceAccelerationStructureCompatibilityKHR, device, pVersionInfo, pCompatibility); }
        catch (Throwable e) { throw new RuntimeException("error in GetDeviceAccelerationStructureCompatibilityKHR", e); }
    }

    /// ```
    /// void vkGetAccelerationStructureBuildSizesKHR(VkDevice device, VkAccelerationStructureBuildTypeKHR buildType, const VkAccelerationStructureBuildGeometryInfoKHR* pBuildInfo, const uint32_t* pMaxPrimitiveCounts, VkAccelerationStructureBuildSizesInfoKHR* pSizeInfo);
    /// ```
    public void GetAccelerationStructureBuildSizesKHR(MemorySegment device, int buildType, MemorySegment pBuildInfo, MemorySegment pMaxPrimitiveCounts, MemorySegment pSizeInfo) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkGetAccelerationStructureBuildSizesKHR)) throw new SymbolNotFoundError("Symbol not found: vkGetAccelerationStructureBuildSizesKHR");
        try { Handles.MH_vkGetAccelerationStructureBuildSizesKHR.invokeExact(handles.PFN_vkGetAccelerationStructureBuildSizesKHR, device, buildType, pBuildInfo, pMaxPrimitiveCounts, pSizeInfo); }
        catch (Throwable e) { throw new RuntimeException("error in GetAccelerationStructureBuildSizesKHR", e); }
    }

}
