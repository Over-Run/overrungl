// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.nv;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.vulkan.*;
import static overrungl.internal.RuntimeHelper.*;
/// `VK_NV_cluster_acceleration_structure` - device extension
public final class VKNVClusterAccelerationStructure {
    public static final int VK_NV_CLUSTER_ACCELERATION_STRUCTURE_SPEC_VERSION = 4;
    public static final String VK_NV_CLUSTER_ACCELERATION_STRUCTURE_EXTENSION_NAME = "VK_NV_cluster_acceleration_structure";
    public static final int VK_CLUSTER_ACCELERATION_STRUCTURE_CLUSTER_ALLOW_DISABLE_OPACITY_MICROMAPS_NV = 0x00000001;
    public static final int VK_CLUSTER_ACCELERATION_STRUCTURE_GEOMETRY_CULL_DISABLE_BIT_NV = 0x00000001;
    public static final int VK_CLUSTER_ACCELERATION_STRUCTURE_GEOMETRY_NO_DUPLICATE_ANYHIT_INVOCATION_BIT_NV = 0x00000002;
    public static final int VK_CLUSTER_ACCELERATION_STRUCTURE_GEOMETRY_OPAQUE_BIT_NV = 0x00000004;
    public static final int VK_CLUSTER_ACCELERATION_STRUCTURE_ADDRESS_RESOLUTION_NONE_NV = 0;
    public static final int VK_CLUSTER_ACCELERATION_STRUCTURE_ADDRESS_RESOLUTION_INDIRECTED_DST_IMPLICIT_DATA_BIT_NV = 0x00000001;
    public static final int VK_CLUSTER_ACCELERATION_STRUCTURE_ADDRESS_RESOLUTION_INDIRECTED_SCRATCH_DATA_BIT_NV = 0x00000002;
    public static final int VK_CLUSTER_ACCELERATION_STRUCTURE_ADDRESS_RESOLUTION_INDIRECTED_DST_ADDRESS_ARRAY_BIT_NV = 0x00000004;
    public static final int VK_CLUSTER_ACCELERATION_STRUCTURE_ADDRESS_RESOLUTION_INDIRECTED_DST_SIZES_ARRAY_BIT_NV = 0x00000008;
    public static final int VK_CLUSTER_ACCELERATION_STRUCTURE_ADDRESS_RESOLUTION_INDIRECTED_SRC_INFOS_ARRAY_BIT_NV = 0x00000010;
    public static final int VK_CLUSTER_ACCELERATION_STRUCTURE_ADDRESS_RESOLUTION_INDIRECTED_SRC_INFOS_COUNT_BIT_NV = 0x00000020;
    public static final int VK_CLUSTER_ACCELERATION_STRUCTURE_INDEX_FORMAT_8BIT_NV = 0x00000001;
    public static final int VK_CLUSTER_ACCELERATION_STRUCTURE_INDEX_FORMAT_16BIT_NV = 0x00000002;
    public static final int VK_CLUSTER_ACCELERATION_STRUCTURE_INDEX_FORMAT_32BIT_NV = 0x00000004;
    public static final int VK_CLUSTER_ACCELERATION_STRUCTURE_TYPE_CLUSTERS_BOTTOM_LEVEL_NV = 0;
    public static final int VK_CLUSTER_ACCELERATION_STRUCTURE_TYPE_TRIANGLE_CLUSTER_NV = 1;
    public static final int VK_CLUSTER_ACCELERATION_STRUCTURE_TYPE_TRIANGLE_CLUSTER_TEMPLATE_NV = 2;
    public static final int VK_CLUSTER_ACCELERATION_STRUCTURE_OP_TYPE_MOVE_OBJECTS_NV = 0;
    public static final int VK_CLUSTER_ACCELERATION_STRUCTURE_OP_TYPE_BUILD_CLUSTERS_BOTTOM_LEVEL_NV = 1;
    public static final int VK_CLUSTER_ACCELERATION_STRUCTURE_OP_TYPE_BUILD_TRIANGLE_CLUSTER_NV = 2;
    public static final int VK_CLUSTER_ACCELERATION_STRUCTURE_OP_TYPE_BUILD_TRIANGLE_CLUSTER_TEMPLATE_NV = 3;
    public static final int VK_CLUSTER_ACCELERATION_STRUCTURE_OP_TYPE_INSTANTIATE_TRIANGLE_CLUSTER_NV = 4;
    public static final int VK_CLUSTER_ACCELERATION_STRUCTURE_OP_TYPE_GET_CLUSTER_TEMPLATE_INDICES_NV = 5;
    public static final int VK_CLUSTER_ACCELERATION_STRUCTURE_OP_MODE_IMPLICIT_DESTINATIONS_NV = 0;
    public static final int VK_CLUSTER_ACCELERATION_STRUCTURE_OP_MODE_EXPLICIT_DESTINATIONS_NV = 1;
    public static final int VK_CLUSTER_ACCELERATION_STRUCTURE_OP_MODE_COMPUTE_SIZES_NV = 2;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_CLUSTER_ACCELERATION_STRUCTURE_FEATURES_NV = 1000569000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_CLUSTER_ACCELERATION_STRUCTURE_PROPERTIES_NV = 1000569001;
    public static final int VK_STRUCTURE_TYPE_CLUSTER_ACCELERATION_STRUCTURE_CLUSTERS_BOTTOM_LEVEL_INPUT_NV = 1000569002;
    public static final int VK_STRUCTURE_TYPE_CLUSTER_ACCELERATION_STRUCTURE_TRIANGLE_CLUSTER_INPUT_NV = 1000569003;
    public static final int VK_STRUCTURE_TYPE_CLUSTER_ACCELERATION_STRUCTURE_MOVE_OBJECTS_INPUT_NV = 1000569004;
    public static final int VK_STRUCTURE_TYPE_CLUSTER_ACCELERATION_STRUCTURE_INPUT_INFO_NV = 1000569005;
    public static final int VK_STRUCTURE_TYPE_CLUSTER_ACCELERATION_STRUCTURE_COMMANDS_INFO_NV = 1000569006;
    public static final int VK_STRUCTURE_TYPE_RAY_TRACING_PIPELINE_CLUSTER_ACCELERATION_STRUCTURE_CREATE_INFO_NV = 1000569007;
    public static final int VK_BUILD_ACCELERATION_STRUCTURE_ALLOW_CLUSTER_OPACITY_MICROMAPS_BIT_NV = 0x00001000;
    public static final int VK_OPACITY_MICROMAP_SPECIAL_INDEX_CLUSTER_GEOMETRY_DISABLE_OPACITY_MICROMAP_NV = -5;
    private VKNVClusterAccelerationStructure() {}
    public static final class Handles {
        public static final MethodHandle MH_vkGetClusterAccelerationStructureBuildSizesNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdBuildClusterAccelerationStructureIndirectNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        private Handles() {}
    }

    /// Invokes `vkGetClusterAccelerationStructureBuildSizesNV`.
    /// ```
    /// void vkGetClusterAccelerationStructureBuildSizesNV(VkDevice device, const VkClusterAccelerationStructureInputInfoNV* pInfo, VkAccelerationStructureBuildSizesInfoKHR* pSizeInfo);
    /// ```
    public static void vkGetClusterAccelerationStructureBuildSizesNV(@NonNull VkDevice device, @NonNull MemorySegment pInfo, @NonNull MemorySegment pSizeInfo) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkGetClusterAccelerationStructureBuildSizesNV)) throw new VKSymbolNotFoundError("Symbol not found: vkGetClusterAccelerationStructureBuildSizesNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkGetClusterAccelerationStructureBuildSizesNV", device, pInfo, pSizeInfo); }
        Handles.MH_vkGetClusterAccelerationStructureBuildSizesNV.invokeExact(device.capabilities().PFN_vkGetClusterAccelerationStructureBuildSizesNV, device.segment(), pInfo, pSizeInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetClusterAccelerationStructureBuildSizesNV", e); }
    }

    /// Invokes `vkCmdBuildClusterAccelerationStructureIndirectNV`.
    /// ```
    /// void vkCmdBuildClusterAccelerationStructureIndirectNV(VkCommandBuffer commandBuffer, const VkClusterAccelerationStructureCommandsInfoNV* pCommandInfos);
    /// ```
    public static void vkCmdBuildClusterAccelerationStructureIndirectNV(@NonNull VkCommandBuffer commandBuffer, @NonNull MemorySegment pCommandInfos) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdBuildClusterAccelerationStructureIndirectNV)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdBuildClusterAccelerationStructureIndirectNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdBuildClusterAccelerationStructureIndirectNV", commandBuffer, pCommandInfos); }
        Handles.MH_vkCmdBuildClusterAccelerationStructureIndirectNV.invokeExact(commandBuffer.capabilities().PFN_vkCmdBuildClusterAccelerationStructureIndirectNV, commandBuffer.segment(), pCommandInfos); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdBuildClusterAccelerationStructureIndirectNV", e); }
    }

}
