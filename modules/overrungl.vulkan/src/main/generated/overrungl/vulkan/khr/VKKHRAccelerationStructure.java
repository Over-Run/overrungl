// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr;
import java.lang.foreign.*;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.vulkan.*;
import static overrungl.internal.RuntimeHelper.*;
/// `VK_KHR_acceleration_structure` - device extension
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
        public static final Supplier<MethodHandle> MH_vkCreateAccelerationStructureKHR = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_vkDestroyAccelerationStructureKHR = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_vkCmdBuildAccelerationStructuresKHR = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_vkCmdBuildAccelerationStructuresIndirectKHR = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_vkBuildAccelerationStructuresKHR = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_vkCopyAccelerationStructureKHR = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_vkCopyAccelerationStructureToMemoryKHR = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_vkCopyMemoryToAccelerationStructureKHR = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_vkWriteAccelerationStructuresPropertiesKHR = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, CanonicalTypes.SIZE_T, ValueLayout.ADDRESS, CanonicalTypes.SIZE_T)));
        public static final Supplier<MethodHandle> MH_vkCmdCopyAccelerationStructureKHR = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_vkCmdCopyAccelerationStructureToMemoryKHR = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_vkCmdCopyMemoryToAccelerationStructureKHR = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_vkGetAccelerationStructureDeviceAddressKHR = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_vkCmdWriteAccelerationStructuresPropertiesKHR = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT)));
        public static final Supplier<MethodHandle> MH_vkGetDeviceAccelerationStructureCompatibilityKHR = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_vkGetAccelerationStructureBuildSizesKHR = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        private Handles() {}
    }

    private VKKHRAccelerationStructure() {}

    /// Invokes `vkCreateAccelerationStructureKHR`.
    /// ```
    /// (int) VkResult vkCreateAccelerationStructureKHR((struct VkDevice*) VkDevice device, const VkAccelerationStructureCreateInfoKHR* pCreateInfo, const VkAllocationCallbacks* pAllocator, VkAccelerationStructureKHR* pAccelerationStructure);
    /// ```
    public static int vkCreateAccelerationStructureKHR(@NonNull VkDevice device, @NonNull MemorySegment pCreateInfo, @NonNull MemorySegment pAllocator, @NonNull MemorySegment pAccelerationStructure) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkCreateAccelerationStructureKHR)) throw new VKSymbolNotFoundError("Symbol not found: vkCreateAccelerationStructureKHR");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCreateAccelerationStructureKHR", device, pCreateInfo, pAllocator, pAccelerationStructure); }
        return (int) Handles.MH_vkCreateAccelerationStructureKHR.get().invokeExact(device.capabilities().PFN_vkCreateAccelerationStructureKHR, device.segment(), pCreateInfo, pAllocator, pAccelerationStructure); }
        catch (Throwable e) { throw new RuntimeException("error in vkCreateAccelerationStructureKHR", e); }
    }

    /// Invokes `vkDestroyAccelerationStructureKHR`.
    /// ```
    /// void vkDestroyAccelerationStructureKHR((struct VkDevice*) VkDevice device, (uint64_t) VkAccelerationStructureKHR accelerationStructure, const VkAllocationCallbacks* pAllocator);
    /// ```
    public static void vkDestroyAccelerationStructureKHR(@NonNull VkDevice device, long accelerationStructure, @NonNull MemorySegment pAllocator) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkDestroyAccelerationStructureKHR)) throw new VKSymbolNotFoundError("Symbol not found: vkDestroyAccelerationStructureKHR");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkDestroyAccelerationStructureKHR", device, accelerationStructure, pAllocator); }
        Handles.MH_vkDestroyAccelerationStructureKHR.get().invokeExact(device.capabilities().PFN_vkDestroyAccelerationStructureKHR, device.segment(), accelerationStructure, pAllocator); }
        catch (Throwable e) { throw new RuntimeException("error in vkDestroyAccelerationStructureKHR", e); }
    }

    /// Invokes `vkCmdBuildAccelerationStructuresKHR`.
    /// ```
    /// void vkCmdBuildAccelerationStructuresKHR((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, uint32_t infoCount, const VkAccelerationStructureBuildGeometryInfoKHR* pInfos, const VkAccelerationStructureBuildRangeInfoKHR* const * ppBuildRangeInfos);
    /// ```
    public static void vkCmdBuildAccelerationStructuresKHR(@NonNull VkCommandBuffer commandBuffer, int infoCount, @NonNull MemorySegment pInfos, @NonNull MemorySegment ppBuildRangeInfos) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdBuildAccelerationStructuresKHR)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdBuildAccelerationStructuresKHR");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdBuildAccelerationStructuresKHR", commandBuffer, infoCount, pInfos, ppBuildRangeInfos); }
        Handles.MH_vkCmdBuildAccelerationStructuresKHR.get().invokeExact(commandBuffer.capabilities().PFN_vkCmdBuildAccelerationStructuresKHR, commandBuffer.segment(), infoCount, pInfos, ppBuildRangeInfos); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdBuildAccelerationStructuresKHR", e); }
    }

    /// Invokes `vkCmdBuildAccelerationStructuresIndirectKHR`.
    /// ```
    /// void vkCmdBuildAccelerationStructuresIndirectKHR((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, uint32_t infoCount, const VkAccelerationStructureBuildGeometryInfoKHR* pInfos, const VkDeviceAddress* pIndirectDeviceAddresses, const uint32_t* pIndirectStrides, const uint32_t* const * ppMaxPrimitiveCounts);
    /// ```
    public static void vkCmdBuildAccelerationStructuresIndirectKHR(@NonNull VkCommandBuffer commandBuffer, int infoCount, @NonNull MemorySegment pInfos, @NonNull MemorySegment pIndirectDeviceAddresses, @NonNull MemorySegment pIndirectStrides, @NonNull MemorySegment ppMaxPrimitiveCounts) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdBuildAccelerationStructuresIndirectKHR)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdBuildAccelerationStructuresIndirectKHR");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdBuildAccelerationStructuresIndirectKHR", commandBuffer, infoCount, pInfos, pIndirectDeviceAddresses, pIndirectStrides, ppMaxPrimitiveCounts); }
        Handles.MH_vkCmdBuildAccelerationStructuresIndirectKHR.get().invokeExact(commandBuffer.capabilities().PFN_vkCmdBuildAccelerationStructuresIndirectKHR, commandBuffer.segment(), infoCount, pInfos, pIndirectDeviceAddresses, pIndirectStrides, ppMaxPrimitiveCounts); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdBuildAccelerationStructuresIndirectKHR", e); }
    }

    /// Invokes `vkBuildAccelerationStructuresKHR`.
    /// ```
    /// (int) VkResult vkBuildAccelerationStructuresKHR((struct VkDevice*) VkDevice device, (uint64_t) VkDeferredOperationKHR deferredOperation, uint32_t infoCount, const VkAccelerationStructureBuildGeometryInfoKHR* pInfos, const VkAccelerationStructureBuildRangeInfoKHR* const * ppBuildRangeInfos);
    /// ```
    public static int vkBuildAccelerationStructuresKHR(@NonNull VkDevice device, long deferredOperation, int infoCount, @NonNull MemorySegment pInfos, @NonNull MemorySegment ppBuildRangeInfos) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkBuildAccelerationStructuresKHR)) throw new VKSymbolNotFoundError("Symbol not found: vkBuildAccelerationStructuresKHR");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkBuildAccelerationStructuresKHR", device, deferredOperation, infoCount, pInfos, ppBuildRangeInfos); }
        return (int) Handles.MH_vkBuildAccelerationStructuresKHR.get().invokeExact(device.capabilities().PFN_vkBuildAccelerationStructuresKHR, device.segment(), deferredOperation, infoCount, pInfos, ppBuildRangeInfos); }
        catch (Throwable e) { throw new RuntimeException("error in vkBuildAccelerationStructuresKHR", e); }
    }

    /// Invokes `vkCopyAccelerationStructureKHR`.
    /// ```
    /// (int) VkResult vkCopyAccelerationStructureKHR((struct VkDevice*) VkDevice device, (uint64_t) VkDeferredOperationKHR deferredOperation, const VkCopyAccelerationStructureInfoKHR* pInfo);
    /// ```
    public static int vkCopyAccelerationStructureKHR(@NonNull VkDevice device, long deferredOperation, @NonNull MemorySegment pInfo) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkCopyAccelerationStructureKHR)) throw new VKSymbolNotFoundError("Symbol not found: vkCopyAccelerationStructureKHR");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCopyAccelerationStructureKHR", device, deferredOperation, pInfo); }
        return (int) Handles.MH_vkCopyAccelerationStructureKHR.get().invokeExact(device.capabilities().PFN_vkCopyAccelerationStructureKHR, device.segment(), deferredOperation, pInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkCopyAccelerationStructureKHR", e); }
    }

    /// Invokes `vkCopyAccelerationStructureToMemoryKHR`.
    /// ```
    /// (int) VkResult vkCopyAccelerationStructureToMemoryKHR((struct VkDevice*) VkDevice device, (uint64_t) VkDeferredOperationKHR deferredOperation, const VkCopyAccelerationStructureToMemoryInfoKHR* pInfo);
    /// ```
    public static int vkCopyAccelerationStructureToMemoryKHR(@NonNull VkDevice device, long deferredOperation, @NonNull MemorySegment pInfo) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkCopyAccelerationStructureToMemoryKHR)) throw new VKSymbolNotFoundError("Symbol not found: vkCopyAccelerationStructureToMemoryKHR");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCopyAccelerationStructureToMemoryKHR", device, deferredOperation, pInfo); }
        return (int) Handles.MH_vkCopyAccelerationStructureToMemoryKHR.get().invokeExact(device.capabilities().PFN_vkCopyAccelerationStructureToMemoryKHR, device.segment(), deferredOperation, pInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkCopyAccelerationStructureToMemoryKHR", e); }
    }

    /// Invokes `vkCopyMemoryToAccelerationStructureKHR`.
    /// ```
    /// (int) VkResult vkCopyMemoryToAccelerationStructureKHR((struct VkDevice*) VkDevice device, (uint64_t) VkDeferredOperationKHR deferredOperation, const VkCopyMemoryToAccelerationStructureInfoKHR* pInfo);
    /// ```
    public static int vkCopyMemoryToAccelerationStructureKHR(@NonNull VkDevice device, long deferredOperation, @NonNull MemorySegment pInfo) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkCopyMemoryToAccelerationStructureKHR)) throw new VKSymbolNotFoundError("Symbol not found: vkCopyMemoryToAccelerationStructureKHR");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCopyMemoryToAccelerationStructureKHR", device, deferredOperation, pInfo); }
        return (int) Handles.MH_vkCopyMemoryToAccelerationStructureKHR.get().invokeExact(device.capabilities().PFN_vkCopyMemoryToAccelerationStructureKHR, device.segment(), deferredOperation, pInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkCopyMemoryToAccelerationStructureKHR", e); }
    }

    /// Invokes `vkWriteAccelerationStructuresPropertiesKHR`.
    /// ```
    /// (int) VkResult vkWriteAccelerationStructuresPropertiesKHR((struct VkDevice*) VkDevice device, uint32_t accelerationStructureCount, const VkAccelerationStructureKHR* pAccelerationStructures, (int) VkQueryType queryType, size_t dataSize, void* pData, size_t stride);
    /// ```
    public static int vkWriteAccelerationStructuresPropertiesKHR(@NonNull VkDevice device, int accelerationStructureCount, @NonNull MemorySegment pAccelerationStructures, int queryType, long dataSize, @NonNull MemorySegment pData, long stride) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkWriteAccelerationStructuresPropertiesKHR)) throw new VKSymbolNotFoundError("Symbol not found: vkWriteAccelerationStructuresPropertiesKHR");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkWriteAccelerationStructuresPropertiesKHR", device, accelerationStructureCount, pAccelerationStructures, queryType, dataSize, pData, stride); }
        return (int) Handles.MH_vkWriteAccelerationStructuresPropertiesKHR.get().invoke(device.capabilities().PFN_vkWriteAccelerationStructuresPropertiesKHR, device.segment(), accelerationStructureCount, pAccelerationStructures, queryType, MemoryUtil.narrowingLong(CanonicalTypes.SIZE_T, dataSize), pData, MemoryUtil.narrowingLong(CanonicalTypes.SIZE_T, stride)); }
        catch (Throwable e) { throw new RuntimeException("error in vkWriteAccelerationStructuresPropertiesKHR", e); }
    }

    /// Invokes `vkCmdCopyAccelerationStructureKHR`.
    /// ```
    /// void vkCmdCopyAccelerationStructureKHR((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, const VkCopyAccelerationStructureInfoKHR* pInfo);
    /// ```
    public static void vkCmdCopyAccelerationStructureKHR(@NonNull VkCommandBuffer commandBuffer, @NonNull MemorySegment pInfo) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdCopyAccelerationStructureKHR)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdCopyAccelerationStructureKHR");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdCopyAccelerationStructureKHR", commandBuffer, pInfo); }
        Handles.MH_vkCmdCopyAccelerationStructureKHR.get().invokeExact(commandBuffer.capabilities().PFN_vkCmdCopyAccelerationStructureKHR, commandBuffer.segment(), pInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdCopyAccelerationStructureKHR", e); }
    }

    /// Invokes `vkCmdCopyAccelerationStructureToMemoryKHR`.
    /// ```
    /// void vkCmdCopyAccelerationStructureToMemoryKHR((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, const VkCopyAccelerationStructureToMemoryInfoKHR* pInfo);
    /// ```
    public static void vkCmdCopyAccelerationStructureToMemoryKHR(@NonNull VkCommandBuffer commandBuffer, @NonNull MemorySegment pInfo) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdCopyAccelerationStructureToMemoryKHR)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdCopyAccelerationStructureToMemoryKHR");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdCopyAccelerationStructureToMemoryKHR", commandBuffer, pInfo); }
        Handles.MH_vkCmdCopyAccelerationStructureToMemoryKHR.get().invokeExact(commandBuffer.capabilities().PFN_vkCmdCopyAccelerationStructureToMemoryKHR, commandBuffer.segment(), pInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdCopyAccelerationStructureToMemoryKHR", e); }
    }

    /// Invokes `vkCmdCopyMemoryToAccelerationStructureKHR`.
    /// ```
    /// void vkCmdCopyMemoryToAccelerationStructureKHR((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, const VkCopyMemoryToAccelerationStructureInfoKHR* pInfo);
    /// ```
    public static void vkCmdCopyMemoryToAccelerationStructureKHR(@NonNull VkCommandBuffer commandBuffer, @NonNull MemorySegment pInfo) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdCopyMemoryToAccelerationStructureKHR)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdCopyMemoryToAccelerationStructureKHR");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdCopyMemoryToAccelerationStructureKHR", commandBuffer, pInfo); }
        Handles.MH_vkCmdCopyMemoryToAccelerationStructureKHR.get().invokeExact(commandBuffer.capabilities().PFN_vkCmdCopyMemoryToAccelerationStructureKHR, commandBuffer.segment(), pInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdCopyMemoryToAccelerationStructureKHR", e); }
    }

    /// Invokes `vkGetAccelerationStructureDeviceAddressKHR`.
    /// ```
    /// (uint64_t) VkDeviceAddress vkGetAccelerationStructureDeviceAddressKHR((struct VkDevice*) VkDevice device, const VkAccelerationStructureDeviceAddressInfoKHR* pInfo);
    /// ```
    public static long vkGetAccelerationStructureDeviceAddressKHR(@NonNull VkDevice device, @NonNull MemorySegment pInfo) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkGetAccelerationStructureDeviceAddressKHR)) throw new VKSymbolNotFoundError("Symbol not found: vkGetAccelerationStructureDeviceAddressKHR");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkGetAccelerationStructureDeviceAddressKHR", device, pInfo); }
        return (long) Handles.MH_vkGetAccelerationStructureDeviceAddressKHR.get().invokeExact(device.capabilities().PFN_vkGetAccelerationStructureDeviceAddressKHR, device.segment(), pInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetAccelerationStructureDeviceAddressKHR", e); }
    }

    /// Invokes `vkCmdWriteAccelerationStructuresPropertiesKHR`.
    /// ```
    /// void vkCmdWriteAccelerationStructuresPropertiesKHR((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, uint32_t accelerationStructureCount, const VkAccelerationStructureKHR* pAccelerationStructures, (int) VkQueryType queryType, (uint64_t) VkQueryPool queryPool, uint32_t firstQuery);
    /// ```
    public static void vkCmdWriteAccelerationStructuresPropertiesKHR(@NonNull VkCommandBuffer commandBuffer, int accelerationStructureCount, @NonNull MemorySegment pAccelerationStructures, int queryType, long queryPool, int firstQuery) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdWriteAccelerationStructuresPropertiesKHR)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdWriteAccelerationStructuresPropertiesKHR");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdWriteAccelerationStructuresPropertiesKHR", commandBuffer, accelerationStructureCount, pAccelerationStructures, queryType, queryPool, firstQuery); }
        Handles.MH_vkCmdWriteAccelerationStructuresPropertiesKHR.get().invokeExact(commandBuffer.capabilities().PFN_vkCmdWriteAccelerationStructuresPropertiesKHR, commandBuffer.segment(), accelerationStructureCount, pAccelerationStructures, queryType, queryPool, firstQuery); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdWriteAccelerationStructuresPropertiesKHR", e); }
    }

    /// Invokes `vkGetDeviceAccelerationStructureCompatibilityKHR`.
    /// ```
    /// void vkGetDeviceAccelerationStructureCompatibilityKHR((struct VkDevice*) VkDevice device, const VkAccelerationStructureVersionInfoKHR* pVersionInfo, VkAccelerationStructureCompatibilityKHR* pCompatibility);
    /// ```
    public static void vkGetDeviceAccelerationStructureCompatibilityKHR(@NonNull VkDevice device, @NonNull MemorySegment pVersionInfo, @NonNull MemorySegment pCompatibility) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkGetDeviceAccelerationStructureCompatibilityKHR)) throw new VKSymbolNotFoundError("Symbol not found: vkGetDeviceAccelerationStructureCompatibilityKHR");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkGetDeviceAccelerationStructureCompatibilityKHR", device, pVersionInfo, pCompatibility); }
        Handles.MH_vkGetDeviceAccelerationStructureCompatibilityKHR.get().invokeExact(device.capabilities().PFN_vkGetDeviceAccelerationStructureCompatibilityKHR, device.segment(), pVersionInfo, pCompatibility); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetDeviceAccelerationStructureCompatibilityKHR", e); }
    }

    /// Invokes `vkGetAccelerationStructureBuildSizesKHR`.
    /// ```
    /// void vkGetAccelerationStructureBuildSizesKHR((struct VkDevice*) VkDevice device, (int) VkAccelerationStructureBuildTypeKHR buildType, const VkAccelerationStructureBuildGeometryInfoKHR* pBuildInfo, const uint32_t* pMaxPrimitiveCounts, VkAccelerationStructureBuildSizesInfoKHR* pSizeInfo);
    /// ```
    public static void vkGetAccelerationStructureBuildSizesKHR(@NonNull VkDevice device, int buildType, @NonNull MemorySegment pBuildInfo, @NonNull MemorySegment pMaxPrimitiveCounts, @NonNull MemorySegment pSizeInfo) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkGetAccelerationStructureBuildSizesKHR)) throw new VKSymbolNotFoundError("Symbol not found: vkGetAccelerationStructureBuildSizesKHR");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkGetAccelerationStructureBuildSizesKHR", device, buildType, pBuildInfo, pMaxPrimitiveCounts, pSizeInfo); }
        Handles.MH_vkGetAccelerationStructureBuildSizesKHR.get().invokeExact(device.capabilities().PFN_vkGetAccelerationStructureBuildSizesKHR, device.segment(), buildType, pBuildInfo, pMaxPrimitiveCounts, pSizeInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetAccelerationStructureBuildSizesKHR", e); }
    }

}
