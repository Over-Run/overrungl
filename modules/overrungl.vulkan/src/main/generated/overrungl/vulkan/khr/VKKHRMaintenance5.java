// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr;
import java.lang.foreign.*;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.vulkan.*;
import static overrungl.internal.RuntimeHelper.*;
/// `VK_KHR_maintenance5` - device extension
public final class VKKHRMaintenance5 {
    public static final int VK_KHR_MAINTENANCE_5_SPEC_VERSION = 1;
    public static final String VK_KHR_MAINTENANCE_5_EXTENSION_NAME = "VK_KHR_maintenance5";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_5_FEATURES_KHR = 1000470000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_5_PROPERTIES_KHR = 1000470001;
    public static final int VK_STRUCTURE_TYPE_RENDERING_AREA_INFO_KHR = 1000470003;
    public static final int VK_STRUCTURE_TYPE_DEVICE_IMAGE_SUBRESOURCE_INFO_KHR = 1000470004;
    public static final int VK_FORMAT_A1B5G5R5_UNORM_PACK16_KHR = 1000470000;
    public static final int VK_FORMAT_A8_UNORM_KHR = 1000470001;
    public static final int VK_STRUCTURE_TYPE_SUBRESOURCE_LAYOUT_2_KHR = 1000338002;
    public static final int VK_STRUCTURE_TYPE_IMAGE_SUBRESOURCE_2_KHR = 1000338003;
    public static final long VK_PIPELINE_CREATE_2_DISABLE_OPTIMIZATION_BIT_KHR = 0x00000001L;
    public static final long VK_PIPELINE_CREATE_2_ALLOW_DERIVATIVES_BIT_KHR = 0x00000002L;
    public static final long VK_PIPELINE_CREATE_2_DERIVATIVE_BIT_KHR = 0x00000004L;
    public static final long VK_PIPELINE_CREATE_2_VIEW_INDEX_FROM_DEVICE_INDEX_BIT_KHR = 0x00000008L;
    public static final long VK_PIPELINE_CREATE_2_DISPATCH_BASE_BIT_KHR = 0x00000010L;
    public static final long VK_BUFFER_USAGE_2_TRANSFER_SRC_BIT_KHR = 0x00000001L;
    public static final long VK_BUFFER_USAGE_2_TRANSFER_DST_BIT_KHR = 0x00000002L;
    public static final long VK_BUFFER_USAGE_2_UNIFORM_TEXEL_BUFFER_BIT_KHR = 0x00000004L;
    public static final long VK_BUFFER_USAGE_2_STORAGE_TEXEL_BUFFER_BIT_KHR = 0x00000008L;
    public static final long VK_BUFFER_USAGE_2_UNIFORM_BUFFER_BIT_KHR = 0x00000010L;
    public static final long VK_BUFFER_USAGE_2_STORAGE_BUFFER_BIT_KHR = 0x00000020L;
    public static final long VK_BUFFER_USAGE_2_INDEX_BUFFER_BIT_KHR = 0x00000040L;
    public static final long VK_BUFFER_USAGE_2_VERTEX_BUFFER_BIT_KHR = 0x00000080L;
    public static final long VK_BUFFER_USAGE_2_INDIRECT_BUFFER_BIT_KHR = 0x00000100L;
    public static final int VK_STRUCTURE_TYPE_PIPELINE_CREATE_FLAGS_2_CREATE_INFO_KHR = 1000470005;
    public static final int VK_STRUCTURE_TYPE_BUFFER_USAGE_FLAGS_2_CREATE_INFO_KHR = 1000470006;
    public static final long VK_PIPELINE_CREATE_2_DEFER_COMPILE_BIT_NV = 0x00000020L;
    public static final long VK_PIPELINE_CREATE_2_CAPTURE_STATISTICS_BIT_KHR = 0x00000040L;
    public static final long VK_PIPELINE_CREATE_2_CAPTURE_INTERNAL_REPRESENTATIONS_BIT_KHR = 0x00000080L;
    public static final long VK_PIPELINE_CREATE_2_FAIL_ON_PIPELINE_COMPILE_REQUIRED_BIT_KHR = 0x00000100L;
    public static final long VK_PIPELINE_CREATE_2_EARLY_RETURN_ON_FAILURE_BIT_KHR = 0x00000200L;
    public static final long VK_PIPELINE_CREATE_2_LINK_TIME_OPTIMIZATION_BIT_EXT = 0x00000400L;
    public static final long VK_PIPELINE_CREATE_2_RETAIN_LINK_TIME_OPTIMIZATION_INFO_BIT_EXT = 0x00800000L;
    public static final long VK_PIPELINE_CREATE_2_LIBRARY_BIT_KHR = 0x00000800L;
    public static final long VK_PIPELINE_CREATE_2_RAY_TRACING_SKIP_TRIANGLES_BIT_KHR = 0x00001000L;
    public static final long VK_PIPELINE_CREATE_2_RAY_TRACING_SKIP_AABBS_BIT_KHR = 0x00002000L;
    public static final long VK_PIPELINE_CREATE_2_RAY_TRACING_NO_NULL_ANY_HIT_SHADERS_BIT_KHR = 0x00004000L;
    public static final long VK_PIPELINE_CREATE_2_RAY_TRACING_NO_NULL_CLOSEST_HIT_SHADERS_BIT_KHR = 0x00008000L;
    public static final long VK_PIPELINE_CREATE_2_RAY_TRACING_NO_NULL_MISS_SHADERS_BIT_KHR = 0x00010000L;
    public static final long VK_PIPELINE_CREATE_2_RAY_TRACING_NO_NULL_INTERSECTION_SHADERS_BIT_KHR = 0x00020000L;
    public static final long VK_PIPELINE_CREATE_2_RAY_TRACING_SHADER_GROUP_HANDLE_CAPTURE_REPLAY_BIT_KHR = 0x00080000L;
    public static final long VK_PIPELINE_CREATE_2_INDIRECT_BINDABLE_BIT_NV = 0x00040000L;
    public static final long VK_PIPELINE_CREATE_2_RAY_TRACING_ALLOW_MOTION_BIT_NV = 0x00100000L;
    public static final long VK_PIPELINE_CREATE_2_RENDERING_FRAGMENT_SHADING_RATE_ATTACHMENT_BIT_KHR = 0x00200000L;
    public static final long VK_PIPELINE_CREATE_2_RENDERING_FRAGMENT_DENSITY_MAP_ATTACHMENT_BIT_EXT = 0x00400000L;
    public static final long VK_PIPELINE_CREATE_2_RAY_TRACING_OPACITY_MICROMAP_BIT_EXT = 0x01000000L;
    public static final long VK_PIPELINE_CREATE_2_COLOR_ATTACHMENT_FEEDBACK_LOOP_BIT_EXT = 0x02000000L;
    public static final long VK_PIPELINE_CREATE_2_DEPTH_STENCIL_ATTACHMENT_FEEDBACK_LOOP_BIT_EXT = 0x04000000L;
    public static final long VK_PIPELINE_CREATE_2_NO_PROTECTED_ACCESS_BIT_EXT = 0x08000000L;
    public static final long VK_PIPELINE_CREATE_2_PROTECTED_ACCESS_ONLY_BIT_EXT = 0x40000000L;
    public static final long VK_PIPELINE_CREATE_2_RAY_TRACING_DISPLACEMENT_MICROMAP_BIT_NV = 0x10000000L;
    public static final long VK_PIPELINE_CREATE_2_DESCRIPTOR_BUFFER_BIT_EXT = 0x20000000L;
    public static final long VK_BUFFER_USAGE_2_CONDITIONAL_RENDERING_BIT_EXT = 0x00000200L;
    public static final long VK_BUFFER_USAGE_2_SHADER_BINDING_TABLE_BIT_KHR = 0x00000400L;
    public static final long VK_BUFFER_USAGE_2_RAY_TRACING_BIT_NV = 0x00000400L;
    public static final long VK_BUFFER_USAGE_2_TRANSFORM_FEEDBACK_BUFFER_BIT_EXT = 0x00000800L;
    public static final long VK_BUFFER_USAGE_2_TRANSFORM_FEEDBACK_COUNTER_BUFFER_BIT_EXT = 0x00001000L;
    public static final long VK_BUFFER_USAGE_2_VIDEO_DECODE_SRC_BIT_KHR = 0x00002000L;
    public static final long VK_BUFFER_USAGE_2_VIDEO_DECODE_DST_BIT_KHR = 0x00004000L;
    public static final long VK_BUFFER_USAGE_2_VIDEO_ENCODE_DST_BIT_KHR = 0x00008000L;
    public static final long VK_BUFFER_USAGE_2_VIDEO_ENCODE_SRC_BIT_KHR = 0x00010000L;
    public static final long VK_BUFFER_USAGE_2_SHADER_DEVICE_ADDRESS_BIT_KHR = 0x00020000L;
    public static final long VK_BUFFER_USAGE_2_ACCELERATION_STRUCTURE_BUILD_INPUT_READ_ONLY_BIT_KHR = 0x00080000L;
    public static final long VK_BUFFER_USAGE_2_ACCELERATION_STRUCTURE_STORAGE_BIT_KHR = 0x00100000L;
    public static final long VK_BUFFER_USAGE_2_SAMPLER_DESCRIPTOR_BUFFER_BIT_EXT = 0x00200000L;
    public static final long VK_BUFFER_USAGE_2_RESOURCE_DESCRIPTOR_BUFFER_BIT_EXT = 0x00400000L;
    public static final long VK_BUFFER_USAGE_2_PUSH_DESCRIPTORS_DESCRIPTOR_BUFFER_BIT_EXT = 0x04000000L;
    public static final long VK_BUFFER_USAGE_2_MICROMAP_BUILD_INPUT_READ_ONLY_BIT_EXT = 0x00800000L;
    public static final long VK_BUFFER_USAGE_2_MICROMAP_STORAGE_BIT_EXT = 0x01000000L;
    public static final long VK_PIPELINE_CREATE_2_DISALLOW_OPACITY_MICROMAP_BIT_ARM = 0x2000000000L;
    public static final class Handles {
        public static final Supplier<MethodHandle> MH_vkCmdBindIndexBuffer2KHR = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT)));
        public static final Supplier<MethodHandle> MH_vkGetRenderingAreaGranularityKHR = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_vkGetDeviceImageSubresourceLayoutKHR = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_vkGetImageSubresourceLayout2KHR = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        private Handles() {}
    }

    private VKKHRMaintenance5() {}

    /// Invokes `vkCmdBindIndexBuffer2KHR`.
    /// ```
    /// void vkCmdBindIndexBuffer2KHR((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, (uint64_t) VkBuffer buffer, (uint64_t) VkDeviceSize offset, (uint64_t) VkDeviceSize size, (int) VkIndexType indexType);
    /// ```
    public static void vkCmdBindIndexBuffer2KHR(@NonNull VkCommandBuffer commandBuffer, long buffer, long offset, long size, int indexType) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdBindIndexBuffer2KHR)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdBindIndexBuffer2KHR");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdBindIndexBuffer2KHR", commandBuffer, buffer, offset, size, indexType); }
        Handles.MH_vkCmdBindIndexBuffer2KHR.get().invokeExact(commandBuffer.capabilities().PFN_vkCmdBindIndexBuffer2KHR, commandBuffer.segment(), buffer, offset, size, indexType); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdBindIndexBuffer2KHR", e); }
    }

    /// Invokes `vkGetRenderingAreaGranularityKHR`.
    /// ```
    /// void vkGetRenderingAreaGranularityKHR((struct VkDevice*) VkDevice device, const VkRenderingAreaInfo* pRenderingAreaInfo, VkExtent2D* pGranularity);
    /// ```
    public static void vkGetRenderingAreaGranularityKHR(@NonNull VkDevice device, @NonNull MemorySegment pRenderingAreaInfo, @NonNull MemorySegment pGranularity) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkGetRenderingAreaGranularityKHR)) throw new VKSymbolNotFoundError("Symbol not found: vkGetRenderingAreaGranularityKHR");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkGetRenderingAreaGranularityKHR", device, pRenderingAreaInfo, pGranularity); }
        Handles.MH_vkGetRenderingAreaGranularityKHR.get().invokeExact(device.capabilities().PFN_vkGetRenderingAreaGranularityKHR, device.segment(), pRenderingAreaInfo, pGranularity); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetRenderingAreaGranularityKHR", e); }
    }

    /// Invokes `vkGetDeviceImageSubresourceLayoutKHR`.
    /// ```
    /// void vkGetDeviceImageSubresourceLayoutKHR((struct VkDevice*) VkDevice device, const VkDeviceImageSubresourceInfo* pInfo, VkSubresourceLayout2* pLayout);
    /// ```
    public static void vkGetDeviceImageSubresourceLayoutKHR(@NonNull VkDevice device, @NonNull MemorySegment pInfo, @NonNull MemorySegment pLayout) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkGetDeviceImageSubresourceLayoutKHR)) throw new VKSymbolNotFoundError("Symbol not found: vkGetDeviceImageSubresourceLayoutKHR");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkGetDeviceImageSubresourceLayoutKHR", device, pInfo, pLayout); }
        Handles.MH_vkGetDeviceImageSubresourceLayoutKHR.get().invokeExact(device.capabilities().PFN_vkGetDeviceImageSubresourceLayoutKHR, device.segment(), pInfo, pLayout); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetDeviceImageSubresourceLayoutKHR", e); }
    }

    /// Invokes `vkGetImageSubresourceLayout2KHR`.
    /// ```
    /// void vkGetImageSubresourceLayout2KHR((struct VkDevice*) VkDevice device, (uint64_t) VkImage image, const VkImageSubresource2* pSubresource, VkSubresourceLayout2* pLayout);
    /// ```
    public static void vkGetImageSubresourceLayout2KHR(@NonNull VkDevice device, long image, @NonNull MemorySegment pSubresource, @NonNull MemorySegment pLayout) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkGetImageSubresourceLayout2KHR)) throw new VKSymbolNotFoundError("Symbol not found: vkGetImageSubresourceLayout2KHR");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkGetImageSubresourceLayout2KHR", device, image, pSubresource, pLayout); }
        Handles.MH_vkGetImageSubresourceLayout2KHR.get().invokeExact(device.capabilities().PFN_vkGetImageSubresourceLayout2KHR, device.segment(), image, pSubresource, pLayout); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetImageSubresourceLayout2KHR", e); }
    }

}
