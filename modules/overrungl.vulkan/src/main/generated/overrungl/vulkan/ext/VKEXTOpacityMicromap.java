// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.vulkan.*;
import static overrungl.internal.RuntimeHelper.*;
/// `VK_EXT_opacity_micromap` - device extension
public final class VKEXTOpacityMicromap {
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
    public static final int VK_GEOMETRY_INSTANCE_FORCE_OPACITY_MICROMAP_2_STATE_BIT_EXT = 0x00000010;
    public static final int VK_GEOMETRY_INSTANCE_FORCE_OPACITY_MICROMAP_2_STATE_EXT = 0x00000010;
    public static final int VK_GEOMETRY_INSTANCE_DISABLE_OPACITY_MICROMAPS_BIT_EXT = 0x00000020;
    public static final int VK_GEOMETRY_INSTANCE_DISABLE_OPACITY_MICROMAPS_EXT = 0x00000020;
    public static final int VK_BUILD_ACCELERATION_STRUCTURE_ALLOW_OPACITY_MICROMAP_UPDATE_BIT_EXT = 0x00000040;
    public static final int VK_BUILD_ACCELERATION_STRUCTURE_ALLOW_OPACITY_MICROMAP_UPDATE_EXT = 0x00000040;
    public static final int VK_BUILD_ACCELERATION_STRUCTURE_ALLOW_DISABLE_OPACITY_MICROMAPS_BIT_EXT = 0x00000080;
    public static final int VK_BUILD_ACCELERATION_STRUCTURE_ALLOW_DISABLE_OPACITY_MICROMAPS_EXT = 0x00000080;
    public static final int VK_BUILD_ACCELERATION_STRUCTURE_ALLOW_OPACITY_MICROMAP_DATA_UPDATE_BIT_EXT = 0x00000100;
    public static final int VK_BUILD_ACCELERATION_STRUCTURE_ALLOW_OPACITY_MICROMAP_DATA_UPDATE_EXT = 0x00000100;
    public static final class Handles {
        public static final MethodHandle MH_vkCreateMicromapEXT = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkDestroyMicromapEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdBuildMicromapsEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkBuildMicromapsEXT = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCopyMicromapEXT = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCopyMicromapToMemoryEXT = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCopyMemoryToMicromapEXT = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkWriteMicromapsPropertiesEXT = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, CanonicalTypes.SIZE_T, ValueLayout.ADDRESS, CanonicalTypes.SIZE_T));
        public static final MethodHandle MH_vkCmdCopyMicromapEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdCopyMicromapToMemoryEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdCopyMemoryToMicromapEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdWriteMicromapsPropertiesEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_vkGetDeviceMicromapCompatibilityEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetMicromapBuildSizesEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        private Handles() {}
    }

    private VKEXTOpacityMicromap() {}

    /// Invokes `vkCreateMicromapEXT`.
    /// ```
    /// (int) VkResult vkCreateMicromapEXT((struct VkDevice*) VkDevice device, const VkMicromapCreateInfoEXT* pCreateInfo, const VkAllocationCallbacks* pAllocator, VkMicromapEXT* pMicromap);
    /// ```
    public static int vkCreateMicromapEXT(@NonNull VkDevice device, @NonNull MemorySegment pCreateInfo, @NonNull MemorySegment pAllocator, @NonNull MemorySegment pMicromap) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkCreateMicromapEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkCreateMicromapEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCreateMicromapEXT", device, pCreateInfo, pAllocator, pMicromap); }
        return (int) Handles.MH_vkCreateMicromapEXT.invokeExact(device.capabilities().PFN_vkCreateMicromapEXT, device.segment(), pCreateInfo, pAllocator, pMicromap); }
        catch (Throwable e) { throw new RuntimeException("error in vkCreateMicromapEXT", e); }
    }

    /// Invokes `vkDestroyMicromapEXT`.
    /// ```
    /// void vkDestroyMicromapEXT((struct VkDevice*) VkDevice device, (uint64_t) VkMicromapEXT micromap, const VkAllocationCallbacks* pAllocator);
    /// ```
    public static void vkDestroyMicromapEXT(@NonNull VkDevice device, long micromap, @NonNull MemorySegment pAllocator) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkDestroyMicromapEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkDestroyMicromapEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkDestroyMicromapEXT", device, micromap, pAllocator); }
        Handles.MH_vkDestroyMicromapEXT.invokeExact(device.capabilities().PFN_vkDestroyMicromapEXT, device.segment(), micromap, pAllocator); }
        catch (Throwable e) { throw new RuntimeException("error in vkDestroyMicromapEXT", e); }
    }

    /// Invokes `vkCmdBuildMicromapsEXT`.
    /// ```
    /// void vkCmdBuildMicromapsEXT((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, uint32_t infoCount, const VkMicromapBuildInfoEXT* pInfos);
    /// ```
    public static void vkCmdBuildMicromapsEXT(@NonNull VkCommandBuffer commandBuffer, int infoCount, @NonNull MemorySegment pInfos) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdBuildMicromapsEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdBuildMicromapsEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdBuildMicromapsEXT", commandBuffer, infoCount, pInfos); }
        Handles.MH_vkCmdBuildMicromapsEXT.invokeExact(commandBuffer.capabilities().PFN_vkCmdBuildMicromapsEXT, commandBuffer.segment(), infoCount, pInfos); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdBuildMicromapsEXT", e); }
    }

    /// Invokes `vkBuildMicromapsEXT`.
    /// ```
    /// (int) VkResult vkBuildMicromapsEXT((struct VkDevice*) VkDevice device, (uint64_t) VkDeferredOperationKHR deferredOperation, uint32_t infoCount, const VkMicromapBuildInfoEXT* pInfos);
    /// ```
    public static int vkBuildMicromapsEXT(@NonNull VkDevice device, long deferredOperation, int infoCount, @NonNull MemorySegment pInfos) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkBuildMicromapsEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkBuildMicromapsEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkBuildMicromapsEXT", device, deferredOperation, infoCount, pInfos); }
        return (int) Handles.MH_vkBuildMicromapsEXT.invokeExact(device.capabilities().PFN_vkBuildMicromapsEXT, device.segment(), deferredOperation, infoCount, pInfos); }
        catch (Throwable e) { throw new RuntimeException("error in vkBuildMicromapsEXT", e); }
    }

    /// Invokes `vkCopyMicromapEXT`.
    /// ```
    /// (int) VkResult vkCopyMicromapEXT((struct VkDevice*) VkDevice device, (uint64_t) VkDeferredOperationKHR deferredOperation, const VkCopyMicromapInfoEXT* pInfo);
    /// ```
    public static int vkCopyMicromapEXT(@NonNull VkDevice device, long deferredOperation, @NonNull MemorySegment pInfo) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkCopyMicromapEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkCopyMicromapEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCopyMicromapEXT", device, deferredOperation, pInfo); }
        return (int) Handles.MH_vkCopyMicromapEXT.invokeExact(device.capabilities().PFN_vkCopyMicromapEXT, device.segment(), deferredOperation, pInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkCopyMicromapEXT", e); }
    }

    /// Invokes `vkCopyMicromapToMemoryEXT`.
    /// ```
    /// (int) VkResult vkCopyMicromapToMemoryEXT((struct VkDevice*) VkDevice device, (uint64_t) VkDeferredOperationKHR deferredOperation, const VkCopyMicromapToMemoryInfoEXT* pInfo);
    /// ```
    public static int vkCopyMicromapToMemoryEXT(@NonNull VkDevice device, long deferredOperation, @NonNull MemorySegment pInfo) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkCopyMicromapToMemoryEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkCopyMicromapToMemoryEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCopyMicromapToMemoryEXT", device, deferredOperation, pInfo); }
        return (int) Handles.MH_vkCopyMicromapToMemoryEXT.invokeExact(device.capabilities().PFN_vkCopyMicromapToMemoryEXT, device.segment(), deferredOperation, pInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkCopyMicromapToMemoryEXT", e); }
    }

    /// Invokes `vkCopyMemoryToMicromapEXT`.
    /// ```
    /// (int) VkResult vkCopyMemoryToMicromapEXT((struct VkDevice*) VkDevice device, (uint64_t) VkDeferredOperationKHR deferredOperation, const VkCopyMemoryToMicromapInfoEXT* pInfo);
    /// ```
    public static int vkCopyMemoryToMicromapEXT(@NonNull VkDevice device, long deferredOperation, @NonNull MemorySegment pInfo) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkCopyMemoryToMicromapEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkCopyMemoryToMicromapEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCopyMemoryToMicromapEXT", device, deferredOperation, pInfo); }
        return (int) Handles.MH_vkCopyMemoryToMicromapEXT.invokeExact(device.capabilities().PFN_vkCopyMemoryToMicromapEXT, device.segment(), deferredOperation, pInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkCopyMemoryToMicromapEXT", e); }
    }

    /// Invokes `vkWriteMicromapsPropertiesEXT`.
    /// ```
    /// (int) VkResult vkWriteMicromapsPropertiesEXT((struct VkDevice*) VkDevice device, uint32_t micromapCount, const VkMicromapEXT* pMicromaps, (int) VkQueryType queryType, size_t dataSize, void* pData, size_t stride);
    /// ```
    public static int vkWriteMicromapsPropertiesEXT(@NonNull VkDevice device, int micromapCount, @NonNull MemorySegment pMicromaps, int queryType, long dataSize, @NonNull MemorySegment pData, long stride) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkWriteMicromapsPropertiesEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkWriteMicromapsPropertiesEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkWriteMicromapsPropertiesEXT", device, micromapCount, pMicromaps, queryType, dataSize, pData, stride); }
        return (int) Handles.MH_vkWriteMicromapsPropertiesEXT.invoke(device.capabilities().PFN_vkWriteMicromapsPropertiesEXT, device.segment(), micromapCount, pMicromaps, queryType, MemoryUtil.narrowingLong(CanonicalTypes.SIZE_T, dataSize), pData, MemoryUtil.narrowingLong(CanonicalTypes.SIZE_T, stride)); }
        catch (Throwable e) { throw new RuntimeException("error in vkWriteMicromapsPropertiesEXT", e); }
    }

    /// Invokes `vkCmdCopyMicromapEXT`.
    /// ```
    /// void vkCmdCopyMicromapEXT((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, const VkCopyMicromapInfoEXT* pInfo);
    /// ```
    public static void vkCmdCopyMicromapEXT(@NonNull VkCommandBuffer commandBuffer, @NonNull MemorySegment pInfo) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdCopyMicromapEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdCopyMicromapEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdCopyMicromapEXT", commandBuffer, pInfo); }
        Handles.MH_vkCmdCopyMicromapEXT.invokeExact(commandBuffer.capabilities().PFN_vkCmdCopyMicromapEXT, commandBuffer.segment(), pInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdCopyMicromapEXT", e); }
    }

    /// Invokes `vkCmdCopyMicromapToMemoryEXT`.
    /// ```
    /// void vkCmdCopyMicromapToMemoryEXT((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, const VkCopyMicromapToMemoryInfoEXT* pInfo);
    /// ```
    public static void vkCmdCopyMicromapToMemoryEXT(@NonNull VkCommandBuffer commandBuffer, @NonNull MemorySegment pInfo) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdCopyMicromapToMemoryEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdCopyMicromapToMemoryEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdCopyMicromapToMemoryEXT", commandBuffer, pInfo); }
        Handles.MH_vkCmdCopyMicromapToMemoryEXT.invokeExact(commandBuffer.capabilities().PFN_vkCmdCopyMicromapToMemoryEXT, commandBuffer.segment(), pInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdCopyMicromapToMemoryEXT", e); }
    }

    /// Invokes `vkCmdCopyMemoryToMicromapEXT`.
    /// ```
    /// void vkCmdCopyMemoryToMicromapEXT((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, const VkCopyMemoryToMicromapInfoEXT* pInfo);
    /// ```
    public static void vkCmdCopyMemoryToMicromapEXT(@NonNull VkCommandBuffer commandBuffer, @NonNull MemorySegment pInfo) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdCopyMemoryToMicromapEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdCopyMemoryToMicromapEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdCopyMemoryToMicromapEXT", commandBuffer, pInfo); }
        Handles.MH_vkCmdCopyMemoryToMicromapEXT.invokeExact(commandBuffer.capabilities().PFN_vkCmdCopyMemoryToMicromapEXT, commandBuffer.segment(), pInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdCopyMemoryToMicromapEXT", e); }
    }

    /// Invokes `vkCmdWriteMicromapsPropertiesEXT`.
    /// ```
    /// void vkCmdWriteMicromapsPropertiesEXT((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, uint32_t micromapCount, const VkMicromapEXT* pMicromaps, (int) VkQueryType queryType, (uint64_t) VkQueryPool queryPool, uint32_t firstQuery);
    /// ```
    public static void vkCmdWriteMicromapsPropertiesEXT(@NonNull VkCommandBuffer commandBuffer, int micromapCount, @NonNull MemorySegment pMicromaps, int queryType, long queryPool, int firstQuery) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdWriteMicromapsPropertiesEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdWriteMicromapsPropertiesEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdWriteMicromapsPropertiesEXT", commandBuffer, micromapCount, pMicromaps, queryType, queryPool, firstQuery); }
        Handles.MH_vkCmdWriteMicromapsPropertiesEXT.invokeExact(commandBuffer.capabilities().PFN_vkCmdWriteMicromapsPropertiesEXT, commandBuffer.segment(), micromapCount, pMicromaps, queryType, queryPool, firstQuery); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdWriteMicromapsPropertiesEXT", e); }
    }

    /// Invokes `vkGetDeviceMicromapCompatibilityEXT`.
    /// ```
    /// void vkGetDeviceMicromapCompatibilityEXT((struct VkDevice*) VkDevice device, const VkMicromapVersionInfoEXT* pVersionInfo, VkAccelerationStructureCompatibilityKHR* pCompatibility);
    /// ```
    public static void vkGetDeviceMicromapCompatibilityEXT(@NonNull VkDevice device, @NonNull MemorySegment pVersionInfo, @NonNull MemorySegment pCompatibility) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkGetDeviceMicromapCompatibilityEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkGetDeviceMicromapCompatibilityEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkGetDeviceMicromapCompatibilityEXT", device, pVersionInfo, pCompatibility); }
        Handles.MH_vkGetDeviceMicromapCompatibilityEXT.invokeExact(device.capabilities().PFN_vkGetDeviceMicromapCompatibilityEXT, device.segment(), pVersionInfo, pCompatibility); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetDeviceMicromapCompatibilityEXT", e); }
    }

    /// Invokes `vkGetMicromapBuildSizesEXT`.
    /// ```
    /// void vkGetMicromapBuildSizesEXT((struct VkDevice*) VkDevice device, (int) VkAccelerationStructureBuildTypeKHR buildType, const VkMicromapBuildInfoEXT* pBuildInfo, VkMicromapBuildSizesInfoEXT* pSizeInfo);
    /// ```
    public static void vkGetMicromapBuildSizesEXT(@NonNull VkDevice device, int buildType, @NonNull MemorySegment pBuildInfo, @NonNull MemorySegment pSizeInfo) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkGetMicromapBuildSizesEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkGetMicromapBuildSizesEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkGetMicromapBuildSizesEXT", device, buildType, pBuildInfo, pSizeInfo); }
        Handles.MH_vkGetMicromapBuildSizesEXT.invokeExact(device.capabilities().PFN_vkGetMicromapBuildSizesEXT, device.segment(), buildType, pBuildInfo, pSizeInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetMicromapBuildSizesEXT", e); }
    }

}
