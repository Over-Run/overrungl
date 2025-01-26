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
package overrungl.vulkan.ext;
import java.lang.foreign.*;
import java.lang.invoke.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;
import overrungl.vulkan.*;
public class VKEXTOpacityMicromap {
    public static final int VK_MICROMAP_TYPE_OPACITY_MICROMAP_EXT = 0;
    public static final int VK_BUILD_MICROMAP_PREFER_FAST_TRACE_BIT_EXT = 0x00000001;
    public static final int VK_BUILD_MICROMAP_PREFER_FAST_BUILD_BIT_EXT = 0x00000002;
    public static final int VK_BUILD_MICROMAP_ALLOW_COMPACTION_BIT_EXT = 0x00000004;
    public static final int VK_COPY_MICROMAP_MODE_CLONE_EXT = 0;
    public static final int VK_COPY_MICROMAP_MODE_SERIALIZE_EXT = 1;
    public static final int VK_COPY_MICROMAP_MODE_DESERIALIZE_EXT = 2;
    public static final int VK_COPY_MICROMAP_MODE_COMPACT_EXT = 3;
    public static final int VK_MICROMAP_CREATE_DEVICE_ADDRESS_CAPTURE_REPLAY_BIT_EXT = 0x00000001;
    public static final int VK_BUILD_MICROMAP_MODE_BUILD_EXT = 0;
    public static final int VK_OPACITY_MICROMAP_FORMAT_2_STATE_EXT = 1;
    public static final int VK_OPACITY_MICROMAP_FORMAT_4_STATE_EXT = 2;
    public static final int VK_OPACITY_MICROMAP_SPECIAL_INDEX_FULLY_TRANSPARENT_EXT = -1;
    public static final int VK_OPACITY_MICROMAP_SPECIAL_INDEX_FULLY_OPAQUE_EXT = -2;
    public static final int VK_OPACITY_MICROMAP_SPECIAL_INDEX_FULLY_UNKNOWN_TRANSPARENT_EXT = -3;
    public static final int VK_OPACITY_MICROMAP_SPECIAL_INDEX_FULLY_UNKNOWN_OPAQUE_EXT = -4;
    public static final int VK_EXT_OPACITY_MICROMAP_SPEC_VERSION = 2;
    public static final String VK_EXT_OPACITY_MICROMAP_EXTENSION_NAME = "VK_EXT_opacity_micromap";
    public static final int VK_STRUCTURE_TYPE_MICROMAP_BUILD_INFO_EXT = 1000396000;
    public static final int VK_STRUCTURE_TYPE_MICROMAP_VERSION_INFO_EXT = 1000396001;
    public static final int VK_STRUCTURE_TYPE_COPY_MICROMAP_INFO_EXT = 1000396002;
    public static final int VK_STRUCTURE_TYPE_COPY_MICROMAP_TO_MEMORY_INFO_EXT = 1000396003;
    public static final int VK_STRUCTURE_TYPE_COPY_MEMORY_TO_MICROMAP_INFO_EXT = 1000396004;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_OPACITY_MICROMAP_FEATURES_EXT = 1000396005;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_OPACITY_MICROMAP_PROPERTIES_EXT = 1000396006;
    public static final int VK_STRUCTURE_TYPE_MICROMAP_CREATE_INFO_EXT = 1000396007;
    public static final int VK_STRUCTURE_TYPE_MICROMAP_BUILD_SIZES_INFO_EXT = 1000396008;
    public static final int VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_TRIANGLES_OPACITY_MICROMAP_EXT = 1000396009;
    public static final long VK_PIPELINE_STAGE_2_MICROMAP_BUILD_BIT_EXT = 0x40000000L;
    public static final long VK_ACCESS_2_MICROMAP_READ_BIT_EXT = 0x100000000000L;
    public static final long VK_ACCESS_2_MICROMAP_WRITE_BIT_EXT = 0x200000000000L;
    public static final int VK_QUERY_TYPE_MICROMAP_SERIALIZATION_SIZE_EXT = 1000396000;
    public static final int VK_QUERY_TYPE_MICROMAP_COMPACTED_SIZE_EXT = 1000396001;
    public static final int VK_OBJECT_TYPE_MICROMAP_EXT = 1000396000;
    public static final int VK_BUFFER_USAGE_MICROMAP_BUILD_INPUT_READ_ONLY_BIT_EXT = 0x00800000;
    public static final int VK_BUFFER_USAGE_MICROMAP_STORAGE_BIT_EXT = 0x01000000;
    public static final int VK_PIPELINE_CREATE_RAY_TRACING_OPACITY_MICROMAP_BIT_EXT = 0x01000000;
    public static final int VK_GEOMETRY_INSTANCE_FORCE_OPACITY_MICROMAP_2_STATE_EXT = 0x00000010;
    public static final int VK_GEOMETRY_INSTANCE_DISABLE_OPACITY_MICROMAPS_EXT = 0x00000020;
    public static final int VK_BUILD_ACCELERATION_STRUCTURE_ALLOW_OPACITY_MICROMAP_UPDATE_EXT = 0x00000040;
    public static final int VK_BUILD_ACCELERATION_STRUCTURE_ALLOW_DISABLE_OPACITY_MICROMAPS_EXT = 0x00000080;
    public static final int VK_BUILD_ACCELERATION_STRUCTURE_ALLOW_OPACITY_MICROMAP_DATA_UPDATE_EXT = 0x00000100;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_vkCreateMicromapEXT = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkDestroyMicromapEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdBuildMicromapsEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkBuildMicromapsEXT = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCopyMicromapEXT = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCopyMicromapToMemoryEXT = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCopyMemoryToMicromapEXT = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkWriteMicromapsPropertiesEXT = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, CanonicalTypes.SIZE_T, ValueLayout.ADDRESS, CanonicalTypes.SIZE_T));
        public static final MethodHandle MH_vkCmdCopyMicromapEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdCopyMicromapToMemoryEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdCopyMemoryToMicromapEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdWriteMicromapsPropertiesEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_vkGetDeviceMicromapCompatibilityEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetMicromapBuildSizesEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public final MemorySegment PFN_vkCreateMicromapEXT;
        public final MemorySegment PFN_vkDestroyMicromapEXT;
        public final MemorySegment PFN_vkCmdBuildMicromapsEXT;
        public final MemorySegment PFN_vkBuildMicromapsEXT;
        public final MemorySegment PFN_vkCopyMicromapEXT;
        public final MemorySegment PFN_vkCopyMicromapToMemoryEXT;
        public final MemorySegment PFN_vkCopyMemoryToMicromapEXT;
        public final MemorySegment PFN_vkWriteMicromapsPropertiesEXT;
        public final MemorySegment PFN_vkCmdCopyMicromapEXT;
        public final MemorySegment PFN_vkCmdCopyMicromapToMemoryEXT;
        public final MemorySegment PFN_vkCmdCopyMemoryToMicromapEXT;
        public final MemorySegment PFN_vkCmdWriteMicromapsPropertiesEXT;
        public final MemorySegment PFN_vkGetDeviceMicromapCompatibilityEXT;
        public final MemorySegment PFN_vkGetMicromapBuildSizesEXT;
        private Handles(MemorySegment device, VKLoadFunc func) {
            PFN_vkCreateMicromapEXT = func.invoke(device, "vkCreateMicromapEXT");
            PFN_vkDestroyMicromapEXT = func.invoke(device, "vkDestroyMicromapEXT");
            PFN_vkCmdBuildMicromapsEXT = func.invoke(device, "vkCmdBuildMicromapsEXT");
            PFN_vkBuildMicromapsEXT = func.invoke(device, "vkBuildMicromapsEXT");
            PFN_vkCopyMicromapEXT = func.invoke(device, "vkCopyMicromapEXT");
            PFN_vkCopyMicromapToMemoryEXT = func.invoke(device, "vkCopyMicromapToMemoryEXT");
            PFN_vkCopyMemoryToMicromapEXT = func.invoke(device, "vkCopyMemoryToMicromapEXT");
            PFN_vkWriteMicromapsPropertiesEXT = func.invoke(device, "vkWriteMicromapsPropertiesEXT");
            PFN_vkCmdCopyMicromapEXT = func.invoke(device, "vkCmdCopyMicromapEXT");
            PFN_vkCmdCopyMicromapToMemoryEXT = func.invoke(device, "vkCmdCopyMicromapToMemoryEXT");
            PFN_vkCmdCopyMemoryToMicromapEXT = func.invoke(device, "vkCmdCopyMemoryToMicromapEXT");
            PFN_vkCmdWriteMicromapsPropertiesEXT = func.invoke(device, "vkCmdWriteMicromapsPropertiesEXT");
            PFN_vkGetDeviceMicromapCompatibilityEXT = func.invoke(device, "vkGetDeviceMicromapCompatibilityEXT");
            PFN_vkGetMicromapBuildSizesEXT = func.invoke(device, "vkGetMicromapBuildSizesEXT");
        }
    }

    public VKEXTOpacityMicromap(MemorySegment device, VKLoadFunc func) {
        this.handles = new Handles(device, func);
    }

    /// ```
    /// VkResult vkCreateMicromapEXT(VkDevice device, const VkMicromapCreateInfoEXT* pCreateInfo, const VkAllocationCallbacks* pAllocator, VkMicromapEXT* pMicromap);
    /// ```
    public int CreateMicromapEXT(MemorySegment device, MemorySegment pCreateInfo, MemorySegment pAllocator, MemorySegment pMicromap) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCreateMicromapEXT)) throw new SymbolNotFoundError("Symbol not found: vkCreateMicromapEXT");
        try { return (int) Handles.MH_vkCreateMicromapEXT.invokeExact(handles.PFN_vkCreateMicromapEXT, device, pCreateInfo, pAllocator, pMicromap); }
        catch (Throwable e) { throw new RuntimeException("error in CreateMicromapEXT", e); }
    }

    /// ```
    /// void vkDestroyMicromapEXT(VkDevice device, VkMicromapEXT micromap, const VkAllocationCallbacks* pAllocator);
    /// ```
    public void DestroyMicromapEXT(MemorySegment device, long micromap, MemorySegment pAllocator) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkDestroyMicromapEXT)) throw new SymbolNotFoundError("Symbol not found: vkDestroyMicromapEXT");
        try { Handles.MH_vkDestroyMicromapEXT.invokeExact(handles.PFN_vkDestroyMicromapEXT, device, micromap, pAllocator); }
        catch (Throwable e) { throw new RuntimeException("error in DestroyMicromapEXT", e); }
    }

    /// ```
    /// void vkCmdBuildMicromapsEXT(VkCommandBuffer commandBuffer, uint32_t infoCount, const VkMicromapBuildInfoEXT* pInfos);
    /// ```
    public void CmdBuildMicromapsEXT(MemorySegment commandBuffer, int infoCount, MemorySegment pInfos) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCmdBuildMicromapsEXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdBuildMicromapsEXT");
        try { Handles.MH_vkCmdBuildMicromapsEXT.invokeExact(handles.PFN_vkCmdBuildMicromapsEXT, commandBuffer, infoCount, pInfos); }
        catch (Throwable e) { throw new RuntimeException("error in CmdBuildMicromapsEXT", e); }
    }

    /// ```
    /// VkResult vkBuildMicromapsEXT(VkDevice device, VkDeferredOperationKHR deferredOperation, uint32_t infoCount, const VkMicromapBuildInfoEXT* pInfos);
    /// ```
    public int BuildMicromapsEXT(MemorySegment device, long deferredOperation, int infoCount, MemorySegment pInfos) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkBuildMicromapsEXT)) throw new SymbolNotFoundError("Symbol not found: vkBuildMicromapsEXT");
        try { return (int) Handles.MH_vkBuildMicromapsEXT.invokeExact(handles.PFN_vkBuildMicromapsEXT, device, deferredOperation, infoCount, pInfos); }
        catch (Throwable e) { throw new RuntimeException("error in BuildMicromapsEXT", e); }
    }

    /// ```
    /// VkResult vkCopyMicromapEXT(VkDevice device, VkDeferredOperationKHR deferredOperation, const VkCopyMicromapInfoEXT* pInfo);
    /// ```
    public int CopyMicromapEXT(MemorySegment device, long deferredOperation, MemorySegment pInfo) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCopyMicromapEXT)) throw new SymbolNotFoundError("Symbol not found: vkCopyMicromapEXT");
        try { return (int) Handles.MH_vkCopyMicromapEXT.invokeExact(handles.PFN_vkCopyMicromapEXT, device, deferredOperation, pInfo); }
        catch (Throwable e) { throw new RuntimeException("error in CopyMicromapEXT", e); }
    }

    /// ```
    /// VkResult vkCopyMicromapToMemoryEXT(VkDevice device, VkDeferredOperationKHR deferredOperation, const VkCopyMicromapToMemoryInfoEXT* pInfo);
    /// ```
    public int CopyMicromapToMemoryEXT(MemorySegment device, long deferredOperation, MemorySegment pInfo) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCopyMicromapToMemoryEXT)) throw new SymbolNotFoundError("Symbol not found: vkCopyMicromapToMemoryEXT");
        try { return (int) Handles.MH_vkCopyMicromapToMemoryEXT.invokeExact(handles.PFN_vkCopyMicromapToMemoryEXT, device, deferredOperation, pInfo); }
        catch (Throwable e) { throw new RuntimeException("error in CopyMicromapToMemoryEXT", e); }
    }

    /// ```
    /// VkResult vkCopyMemoryToMicromapEXT(VkDevice device, VkDeferredOperationKHR deferredOperation, const VkCopyMemoryToMicromapInfoEXT* pInfo);
    /// ```
    public int CopyMemoryToMicromapEXT(MemorySegment device, long deferredOperation, MemorySegment pInfo) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCopyMemoryToMicromapEXT)) throw new SymbolNotFoundError("Symbol not found: vkCopyMemoryToMicromapEXT");
        try { return (int) Handles.MH_vkCopyMemoryToMicromapEXT.invokeExact(handles.PFN_vkCopyMemoryToMicromapEXT, device, deferredOperation, pInfo); }
        catch (Throwable e) { throw new RuntimeException("error in CopyMemoryToMicromapEXT", e); }
    }

    /// ```
    /// VkResult vkWriteMicromapsPropertiesEXT(VkDevice device, uint32_t micromapCount, const VkMicromapEXT* pMicromaps, VkQueryType queryType, size_t dataSize, void* pData, size_t stride);
    /// ```
    public int WriteMicromapsPropertiesEXT(MemorySegment device, int micromapCount, MemorySegment pMicromaps, int queryType, long dataSize, MemorySegment pData, long stride) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkWriteMicromapsPropertiesEXT)) throw new SymbolNotFoundError("Symbol not found: vkWriteMicromapsPropertiesEXT");
        try { return (int) Handles.MH_vkWriteMicromapsPropertiesEXT.invoke(handles.PFN_vkWriteMicromapsPropertiesEXT, device, micromapCount, pMicromaps, queryType, MemoryUtil.narrowingLong(CanonicalTypes.SIZE_T, dataSize), pData, MemoryUtil.narrowingLong(CanonicalTypes.SIZE_T, stride)); }
        catch (Throwable e) { throw new RuntimeException("error in WriteMicromapsPropertiesEXT", e); }
    }

    /// ```
    /// void vkCmdCopyMicromapEXT(VkCommandBuffer commandBuffer, const VkCopyMicromapInfoEXT* pInfo);
    /// ```
    public void CmdCopyMicromapEXT(MemorySegment commandBuffer, MemorySegment pInfo) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCmdCopyMicromapEXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdCopyMicromapEXT");
        try { Handles.MH_vkCmdCopyMicromapEXT.invokeExact(handles.PFN_vkCmdCopyMicromapEXT, commandBuffer, pInfo); }
        catch (Throwable e) { throw new RuntimeException("error in CmdCopyMicromapEXT", e); }
    }

    /// ```
    /// void vkCmdCopyMicromapToMemoryEXT(VkCommandBuffer commandBuffer, const VkCopyMicromapToMemoryInfoEXT* pInfo);
    /// ```
    public void CmdCopyMicromapToMemoryEXT(MemorySegment commandBuffer, MemorySegment pInfo) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCmdCopyMicromapToMemoryEXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdCopyMicromapToMemoryEXT");
        try { Handles.MH_vkCmdCopyMicromapToMemoryEXT.invokeExact(handles.PFN_vkCmdCopyMicromapToMemoryEXT, commandBuffer, pInfo); }
        catch (Throwable e) { throw new RuntimeException("error in CmdCopyMicromapToMemoryEXT", e); }
    }

    /// ```
    /// void vkCmdCopyMemoryToMicromapEXT(VkCommandBuffer commandBuffer, const VkCopyMemoryToMicromapInfoEXT* pInfo);
    /// ```
    public void CmdCopyMemoryToMicromapEXT(MemorySegment commandBuffer, MemorySegment pInfo) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCmdCopyMemoryToMicromapEXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdCopyMemoryToMicromapEXT");
        try { Handles.MH_vkCmdCopyMemoryToMicromapEXT.invokeExact(handles.PFN_vkCmdCopyMemoryToMicromapEXT, commandBuffer, pInfo); }
        catch (Throwable e) { throw new RuntimeException("error in CmdCopyMemoryToMicromapEXT", e); }
    }

    /// ```
    /// void vkCmdWriteMicromapsPropertiesEXT(VkCommandBuffer commandBuffer, uint32_t micromapCount, const VkMicromapEXT* pMicromaps, VkQueryType queryType, VkQueryPool queryPool, uint32_t firstQuery);
    /// ```
    public void CmdWriteMicromapsPropertiesEXT(MemorySegment commandBuffer, int micromapCount, MemorySegment pMicromaps, int queryType, long queryPool, int firstQuery) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCmdWriteMicromapsPropertiesEXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdWriteMicromapsPropertiesEXT");
        try { Handles.MH_vkCmdWriteMicromapsPropertiesEXT.invokeExact(handles.PFN_vkCmdWriteMicromapsPropertiesEXT, commandBuffer, micromapCount, pMicromaps, queryType, queryPool, firstQuery); }
        catch (Throwable e) { throw new RuntimeException("error in CmdWriteMicromapsPropertiesEXT", e); }
    }

    /// ```
    /// void vkGetDeviceMicromapCompatibilityEXT(VkDevice device, const VkMicromapVersionInfoEXT* pVersionInfo, VkAccelerationStructureCompatibilityKHR* pCompatibility);
    /// ```
    public void GetDeviceMicromapCompatibilityEXT(MemorySegment device, MemorySegment pVersionInfo, MemorySegment pCompatibility) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkGetDeviceMicromapCompatibilityEXT)) throw new SymbolNotFoundError("Symbol not found: vkGetDeviceMicromapCompatibilityEXT");
        try { Handles.MH_vkGetDeviceMicromapCompatibilityEXT.invokeExact(handles.PFN_vkGetDeviceMicromapCompatibilityEXT, device, pVersionInfo, pCompatibility); }
        catch (Throwable e) { throw new RuntimeException("error in GetDeviceMicromapCompatibilityEXT", e); }
    }

    /// ```
    /// void vkGetMicromapBuildSizesEXT(VkDevice device, VkAccelerationStructureBuildTypeKHR buildType, const VkMicromapBuildInfoEXT* pBuildInfo, VkMicromapBuildSizesInfoEXT* pSizeInfo);
    /// ```
    public void GetMicromapBuildSizesEXT(MemorySegment device, int buildType, MemorySegment pBuildInfo, MemorySegment pSizeInfo) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkGetMicromapBuildSizesEXT)) throw new SymbolNotFoundError("Symbol not found: vkGetMicromapBuildSizesEXT");
        try { Handles.MH_vkGetMicromapBuildSizesEXT.invokeExact(handles.PFN_vkGetMicromapBuildSizesEXT, device, buildType, pBuildInfo, pSizeInfo); }
        catch (Throwable e) { throw new RuntimeException("error in GetMicromapBuildSizesEXT", e); }
    }

}
