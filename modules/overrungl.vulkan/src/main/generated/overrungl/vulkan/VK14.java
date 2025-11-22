// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import static overrungl.internal.RuntimeHelper.*;
/// `VK_VERSION_1_4` - core API
public final class VK14 {
    public static final int VK_MAX_GLOBAL_PRIORITY_SIZE = 16;
    public static final int VK_QUEUE_GLOBAL_PRIORITY_LOW = 128;
    public static final int VK_QUEUE_GLOBAL_PRIORITY_LOW_EXT = 128;
    public static final int VK_QUEUE_GLOBAL_PRIORITY_LOW_KHR = 128;
    public static final int VK_QUEUE_GLOBAL_PRIORITY_MEDIUM = 256;
    public static final int VK_QUEUE_GLOBAL_PRIORITY_MEDIUM_EXT = 256;
    public static final int VK_QUEUE_GLOBAL_PRIORITY_MEDIUM_KHR = 256;
    public static final int VK_QUEUE_GLOBAL_PRIORITY_HIGH = 512;
    public static final int VK_QUEUE_GLOBAL_PRIORITY_HIGH_EXT = 512;
    public static final int VK_QUEUE_GLOBAL_PRIORITY_HIGH_KHR = 512;
    public static final int VK_QUEUE_GLOBAL_PRIORITY_REALTIME = 1024;
    public static final int VK_QUEUE_GLOBAL_PRIORITY_REALTIME_EXT = 1024;
    public static final int VK_QUEUE_GLOBAL_PRIORITY_REALTIME_KHR = 1024;
    public static final long VK_BUFFER_USAGE_2_TRANSFER_SRC_BIT = 0x00000001L;
    public static final long VK_BUFFER_USAGE_2_TRANSFER_SRC_BIT_KHR = 0x00000001L;
    public static final long VK_BUFFER_USAGE_2_TRANSFER_DST_BIT = 0x00000002L;
    public static final long VK_BUFFER_USAGE_2_TRANSFER_DST_BIT_KHR = 0x00000002L;
    public static final long VK_BUFFER_USAGE_2_UNIFORM_TEXEL_BUFFER_BIT = 0x00000004L;
    public static final long VK_BUFFER_USAGE_2_UNIFORM_TEXEL_BUFFER_BIT_KHR = 0x00000004L;
    public static final long VK_BUFFER_USAGE_2_STORAGE_TEXEL_BUFFER_BIT = 0x00000008L;
    public static final long VK_BUFFER_USAGE_2_STORAGE_TEXEL_BUFFER_BIT_KHR = 0x00000008L;
    public static final long VK_BUFFER_USAGE_2_UNIFORM_BUFFER_BIT = 0x00000010L;
    public static final long VK_BUFFER_USAGE_2_UNIFORM_BUFFER_BIT_KHR = 0x00000010L;
    public static final long VK_BUFFER_USAGE_2_STORAGE_BUFFER_BIT = 0x00000020L;
    public static final long VK_BUFFER_USAGE_2_STORAGE_BUFFER_BIT_KHR = 0x00000020L;
    public static final long VK_BUFFER_USAGE_2_INDEX_BUFFER_BIT = 0x00000040L;
    public static final long VK_BUFFER_USAGE_2_INDEX_BUFFER_BIT_KHR = 0x00000040L;
    public static final long VK_BUFFER_USAGE_2_VERTEX_BUFFER_BIT = 0x00000080L;
    public static final long VK_BUFFER_USAGE_2_VERTEX_BUFFER_BIT_KHR = 0x00000080L;
    public static final long VK_BUFFER_USAGE_2_INDIRECT_BUFFER_BIT = 0x00000100L;
    public static final long VK_BUFFER_USAGE_2_INDIRECT_BUFFER_BIT_KHR = 0x00000100L;
    public static final int VK_HOST_IMAGE_COPY_MEMCPY_BIT = 0x00000001;
    public static final int VK_HOST_IMAGE_COPY_MEMCPY = 0x00000001;
    public static final int VK_HOST_IMAGE_COPY_MEMCPY_BIT_EXT = 0x00000001;
    public static final int VK_HOST_IMAGE_COPY_MEMCPY_EXT = 0x00000001;
    public static final long VK_PIPELINE_CREATE_2_DISABLE_OPTIMIZATION_BIT = 0x00000001L;
    public static final long VK_PIPELINE_CREATE_2_DISABLE_OPTIMIZATION_BIT_KHR = 0x00000001L;
    public static final long VK_PIPELINE_CREATE_2_ALLOW_DERIVATIVES_BIT = 0x00000002L;
    public static final long VK_PIPELINE_CREATE_2_ALLOW_DERIVATIVES_BIT_KHR = 0x00000002L;
    public static final long VK_PIPELINE_CREATE_2_DERIVATIVE_BIT = 0x00000004L;
    public static final long VK_PIPELINE_CREATE_2_DERIVATIVE_BIT_KHR = 0x00000004L;
    public static final long VK_PIPELINE_CREATE_2_VIEW_INDEX_FROM_DEVICE_INDEX_BIT = 0x00000008L;
    public static final long VK_PIPELINE_CREATE_2_VIEW_INDEX_FROM_DEVICE_INDEX_BIT_KHR = 0x00000008L;
    public static final long VK_PIPELINE_CREATE_2_DISPATCH_BASE_BIT = 0x00000010L;
    public static final long VK_PIPELINE_CREATE_2_DISPATCH_BASE_BIT_KHR = 0x00000010L;
    public static final long VK_PIPELINE_CREATE_2_FAIL_ON_PIPELINE_COMPILE_REQUIRED_BIT = 0x00000100L;
    public static final long VK_PIPELINE_CREATE_2_FAIL_ON_PIPELINE_COMPILE_REQUIRED_BIT_KHR = 0x00000100L;
    public static final long VK_PIPELINE_CREATE_2_EARLY_RETURN_ON_FAILURE_BIT = 0x00000200L;
    public static final long VK_PIPELINE_CREATE_2_EARLY_RETURN_ON_FAILURE_BIT_KHR = 0x00000200L;
    public static final long VK_PIPELINE_CREATE_2_NO_PROTECTED_ACCESS_BIT = 0x08000000L;
    public static final long VK_PIPELINE_CREATE_2_NO_PROTECTED_ACCESS_BIT_EXT = 0x08000000L;
    public static final long VK_PIPELINE_CREATE_2_PROTECTED_ACCESS_ONLY_BIT = 0x40000000L;
    public static final long VK_PIPELINE_CREATE_2_PROTECTED_ACCESS_ONLY_BIT_EXT = 0x40000000L;
    public static final int VK_PIPELINE_ROBUSTNESS_BUFFER_BEHAVIOR_DEVICE_DEFAULT = 0;
    public static final int VK_PIPELINE_ROBUSTNESS_BUFFER_BEHAVIOR_DEVICE_DEFAULT_EXT = 0;
    public static final int VK_PIPELINE_ROBUSTNESS_BUFFER_BEHAVIOR_DISABLED = 1;
    public static final int VK_PIPELINE_ROBUSTNESS_BUFFER_BEHAVIOR_DISABLED_EXT = 1;
    public static final int VK_PIPELINE_ROBUSTNESS_BUFFER_BEHAVIOR_ROBUST_BUFFER_ACCESS = 2;
    public static final int VK_PIPELINE_ROBUSTNESS_BUFFER_BEHAVIOR_ROBUST_BUFFER_ACCESS_EXT = 2;
    public static final int VK_PIPELINE_ROBUSTNESS_BUFFER_BEHAVIOR_ROBUST_BUFFER_ACCESS_2 = 3;
    public static final int VK_PIPELINE_ROBUSTNESS_BUFFER_BEHAVIOR_ROBUST_BUFFER_ACCESS_2_EXT = 3;
    public static final int VK_PIPELINE_ROBUSTNESS_IMAGE_BEHAVIOR_DEVICE_DEFAULT = 0;
    public static final int VK_PIPELINE_ROBUSTNESS_IMAGE_BEHAVIOR_DEVICE_DEFAULT_EXT = 0;
    public static final int VK_PIPELINE_ROBUSTNESS_IMAGE_BEHAVIOR_DISABLED = 1;
    public static final int VK_PIPELINE_ROBUSTNESS_IMAGE_BEHAVIOR_DISABLED_EXT = 1;
    public static final int VK_PIPELINE_ROBUSTNESS_IMAGE_BEHAVIOR_ROBUST_IMAGE_ACCESS = 2;
    public static final int VK_PIPELINE_ROBUSTNESS_IMAGE_BEHAVIOR_ROBUST_IMAGE_ACCESS_EXT = 2;
    public static final int VK_PIPELINE_ROBUSTNESS_IMAGE_BEHAVIOR_ROBUST_IMAGE_ACCESS_2 = 3;
    public static final int VK_PIPELINE_ROBUSTNESS_IMAGE_BEHAVIOR_ROBUST_IMAGE_ACCESS_2_EXT = 3;
    public static final int VK_LINE_RASTERIZATION_MODE_DEFAULT = 0;
    public static final int VK_LINE_RASTERIZATION_MODE_DEFAULT_EXT = 0;
    public static final int VK_LINE_RASTERIZATION_MODE_DEFAULT_KHR = 0;
    public static final int VK_LINE_RASTERIZATION_MODE_RECTANGULAR = 1;
    public static final int VK_LINE_RASTERIZATION_MODE_RECTANGULAR_EXT = 1;
    public static final int VK_LINE_RASTERIZATION_MODE_RECTANGULAR_KHR = 1;
    public static final int VK_LINE_RASTERIZATION_MODE_BRESENHAM = 2;
    public static final int VK_LINE_RASTERIZATION_MODE_BRESENHAM_EXT = 2;
    public static final int VK_LINE_RASTERIZATION_MODE_BRESENHAM_KHR = 2;
    public static final int VK_LINE_RASTERIZATION_MODE_RECTANGULAR_SMOOTH = 3;
    public static final int VK_LINE_RASTERIZATION_MODE_RECTANGULAR_SMOOTH_EXT = 3;
    public static final int VK_LINE_RASTERIZATION_MODE_RECTANGULAR_SMOOTH_KHR = 3;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_4_FEATURES = 55;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_4_PROPERTIES = 56;
    public static final int VK_STRUCTURE_TYPE_DEVICE_QUEUE_GLOBAL_PRIORITY_CREATE_INFO = 1000174000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_GLOBAL_PRIORITY_QUERY_FEATURES = 1000388000;
    public static final int VK_STRUCTURE_TYPE_QUEUE_FAMILY_GLOBAL_PRIORITY_PROPERTIES = 1000388001;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_INDEX_TYPE_UINT8_FEATURES = 1000265000;
    public static final int VK_STRUCTURE_TYPE_MEMORY_MAP_INFO = 1000271000;
    public static final int VK_STRUCTURE_TYPE_MEMORY_UNMAP_INFO = 1000271001;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_5_FEATURES = 1000470000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_5_PROPERTIES = 1000470001;
    public static final int VK_STRUCTURE_TYPE_DEVICE_IMAGE_SUBRESOURCE_INFO = 1000470004;
    public static final int VK_STRUCTURE_TYPE_SUBRESOURCE_LAYOUT_2 = 1000338002;
    public static final int VK_STRUCTURE_TYPE_IMAGE_SUBRESOURCE_2 = 1000338003;
    public static final int VK_STRUCTURE_TYPE_BUFFER_USAGE_FLAGS_2_CREATE_INFO = 1000470006;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_6_FEATURES = 1000545000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_6_PROPERTIES = 1000545001;
    public static final int VK_STRUCTURE_TYPE_BIND_MEMORY_STATUS = 1000545002;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_HOST_IMAGE_COPY_FEATURES = 1000270000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_HOST_IMAGE_COPY_PROPERTIES = 1000270001;
    public static final int VK_STRUCTURE_TYPE_MEMORY_TO_IMAGE_COPY = 1000270002;
    public static final int VK_STRUCTURE_TYPE_IMAGE_TO_MEMORY_COPY = 1000270003;
    public static final int VK_STRUCTURE_TYPE_COPY_IMAGE_TO_MEMORY_INFO = 1000270004;
    public static final int VK_STRUCTURE_TYPE_COPY_MEMORY_TO_IMAGE_INFO = 1000270005;
    public static final int VK_STRUCTURE_TYPE_HOST_IMAGE_LAYOUT_TRANSITION_INFO = 1000270006;
    public static final int VK_STRUCTURE_TYPE_COPY_IMAGE_TO_IMAGE_INFO = 1000270007;
    public static final int VK_STRUCTURE_TYPE_SUBRESOURCE_HOST_MEMCPY_SIZE = 1000270008;
    public static final int VK_STRUCTURE_TYPE_HOST_IMAGE_COPY_DEVICE_PERFORMANCE_QUERY = 1000270009;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_SUBGROUP_ROTATE_FEATURES = 1000416000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_FLOAT_CONTROLS_2_FEATURES = 1000528000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_EXPECT_ASSUME_FEATURES = 1000544000;
    public static final int VK_STRUCTURE_TYPE_PIPELINE_CREATE_FLAGS_2_CREATE_INFO = 1000470005;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PUSH_DESCRIPTOR_PROPERTIES = 1000080000;
    public static final int VK_STRUCTURE_TYPE_BIND_DESCRIPTOR_SETS_INFO = 1000545003;
    public static final int VK_STRUCTURE_TYPE_PUSH_CONSTANTS_INFO = 1000545004;
    public static final int VK_STRUCTURE_TYPE_PUSH_DESCRIPTOR_SET_INFO = 1000545005;
    public static final int VK_STRUCTURE_TYPE_PUSH_DESCRIPTOR_SET_WITH_TEMPLATE_INFO = 1000545006;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_PROTECTED_ACCESS_FEATURES = 1000466000;
    public static final int VK_STRUCTURE_TYPE_PIPELINE_ROBUSTNESS_CREATE_INFO = 1000068000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_ROBUSTNESS_FEATURES = 1000068001;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_ROBUSTNESS_PROPERTIES = 1000068002;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_LINE_RASTERIZATION_FEATURES = 1000259000;
    public static final int VK_STRUCTURE_TYPE_PIPELINE_RASTERIZATION_LINE_STATE_CREATE_INFO = 1000259001;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_LINE_RASTERIZATION_PROPERTIES = 1000259002;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VERTEX_ATTRIBUTE_DIVISOR_PROPERTIES = 1000525000;
    public static final int VK_STRUCTURE_TYPE_PIPELINE_VERTEX_INPUT_DIVISOR_STATE_CREATE_INFO = 1000190001;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VERTEX_ATTRIBUTE_DIVISOR_FEATURES = 1000190002;
    public static final int VK_STRUCTURE_TYPE_RENDERING_AREA_INFO = 1000470003;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DYNAMIC_RENDERING_LOCAL_READ_FEATURES = 1000232000;
    public static final int VK_STRUCTURE_TYPE_RENDERING_ATTACHMENT_LOCATION_INFO = 1000232001;
    public static final int VK_STRUCTURE_TYPE_RENDERING_INPUT_ATTACHMENT_INDEX_INFO = 1000232002;
    public static final int VK_ERROR_NOT_PERMITTED = -1000174001;
    public static final int VK_INDEX_TYPE_UINT8 = 1000265000;
    public static final int VK_FORMAT_A1B5G5R5_UNORM_PACK16 = 1000470000;
    public static final int VK_FORMAT_A8_UNORM = 1000470001;
    public static final long VK_BUFFER_USAGE_2_SHADER_DEVICE_ADDRESS_BIT = 0x00020000L;
    public static final int VK_IMAGE_USAGE_HOST_TRANSFER_BIT = 0x00400000;
    public static final long VK_FORMAT_FEATURE_2_HOST_IMAGE_TRANSFER_BIT = 0x400000000000L;
    public static final int VK_SUBGROUP_FEATURE_ROTATE_BIT = 0x00000200;
    public static final int VK_SUBGROUP_FEATURE_ROTATE_CLUSTERED_BIT = 0x00000400;
    public static final int VK_DESCRIPTOR_SET_LAYOUT_CREATE_PUSH_DESCRIPTOR_BIT = 0x00000001;
    public static final int VK_DESCRIPTOR_UPDATE_TEMPLATE_TYPE_PUSH_DESCRIPTORS = 1;
    public static final int VK_PIPELINE_CREATE_NO_PROTECTED_ACCESS_BIT = 0x08000000;
    public static final int VK_PIPELINE_CREATE_PROTECTED_ACCESS_ONLY_BIT = 0x40000000;
    public static final int VK_ATTACHMENT_LOAD_OP_NONE = 1000400000;
    public static final int VK_DYNAMIC_STATE_LINE_STIPPLE = 1000259000;
    public static final int VK_IMAGE_LAYOUT_RENDERING_LOCAL_READ = 1000232000;
    public static final int VK_API_VERSION_1_4 = VK10.VK_MAKE_API_VERSION(0, 1, 4, 0);
    private VK14() {}
    public static final class Handles {
        public static final MethodHandle MH_vkMapMemory2 = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkUnmapMemory2 = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetDeviceImageSubresourceLayout = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetImageSubresourceLayout2 = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCopyMemoryToImage = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCopyImageToMemory = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCopyImageToImage = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkTransitionImageLayout = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdPushDescriptorSet = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdPushDescriptorSetWithTemplate = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdBindDescriptorSets2 = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdPushConstants2 = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdPushDescriptorSet2 = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdPushDescriptorSetWithTemplate2 = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdSetLineStipple = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_SHORT));
        public static final MethodHandle MH_vkCmdBindIndexBuffer2 = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_vkGetRenderingAreaGranularity = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdSetRenderingAttachmentLocations = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdSetRenderingInputAttachmentIndices = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        private Handles() {}
    }

    /// Invokes `vkMapMemory2`.
    /// ```
    /// VkResult vkMapMemory2(VkDevice device, const VkMemoryMapInfo* pMemoryMapInfo, void** ppData);
    /// ```
    public static int vkMapMemory2(@NonNull VkDevice device, @NonNull MemorySegment pMemoryMapInfo, @NonNull MemorySegment ppData) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkMapMemory2)) throw new VKSymbolNotFoundError("Symbol not found: vkMapMemory2");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkMapMemory2", device, pMemoryMapInfo, ppData); }
        return (int) Handles.MH_vkMapMemory2.invokeExact(device.capabilities().PFN_vkMapMemory2, device.segment(), pMemoryMapInfo, ppData); }
        catch (Throwable e) { throw new RuntimeException("error in vkMapMemory2", e); }
    }

    /// Invokes `vkUnmapMemory2`.
    /// ```
    /// VkResult vkUnmapMemory2(VkDevice device, const VkMemoryUnmapInfo* pMemoryUnmapInfo);
    /// ```
    public static int vkUnmapMemory2(@NonNull VkDevice device, @NonNull MemorySegment pMemoryUnmapInfo) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkUnmapMemory2)) throw new VKSymbolNotFoundError("Symbol not found: vkUnmapMemory2");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkUnmapMemory2", device, pMemoryUnmapInfo); }
        return (int) Handles.MH_vkUnmapMemory2.invokeExact(device.capabilities().PFN_vkUnmapMemory2, device.segment(), pMemoryUnmapInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkUnmapMemory2", e); }
    }

    /// Invokes `vkGetDeviceImageSubresourceLayout`.
    /// ```
    /// void vkGetDeviceImageSubresourceLayout(VkDevice device, const VkDeviceImageSubresourceInfo* pInfo, VkSubresourceLayout2* pLayout);
    /// ```
    public static void vkGetDeviceImageSubresourceLayout(@NonNull VkDevice device, @NonNull MemorySegment pInfo, @NonNull MemorySegment pLayout) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkGetDeviceImageSubresourceLayout)) throw new VKSymbolNotFoundError("Symbol not found: vkGetDeviceImageSubresourceLayout");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkGetDeviceImageSubresourceLayout", device, pInfo, pLayout); }
        Handles.MH_vkGetDeviceImageSubresourceLayout.invokeExact(device.capabilities().PFN_vkGetDeviceImageSubresourceLayout, device.segment(), pInfo, pLayout); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetDeviceImageSubresourceLayout", e); }
    }

    /// Invokes `vkGetImageSubresourceLayout2`.
    /// ```
    /// void vkGetImageSubresourceLayout2(VkDevice device, VkImage image, const VkImageSubresource2* pSubresource, VkSubresourceLayout2* pLayout);
    /// ```
    public static void vkGetImageSubresourceLayout2(@NonNull VkDevice device, long image, @NonNull MemorySegment pSubresource, @NonNull MemorySegment pLayout) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkGetImageSubresourceLayout2)) throw new VKSymbolNotFoundError("Symbol not found: vkGetImageSubresourceLayout2");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkGetImageSubresourceLayout2", device, image, pSubresource, pLayout); }
        Handles.MH_vkGetImageSubresourceLayout2.invokeExact(device.capabilities().PFN_vkGetImageSubresourceLayout2, device.segment(), image, pSubresource, pLayout); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetImageSubresourceLayout2", e); }
    }

    /// Invokes `vkCopyMemoryToImage`.
    /// ```
    /// VkResult vkCopyMemoryToImage(VkDevice device, const VkCopyMemoryToImageInfo* pCopyMemoryToImageInfo);
    /// ```
    public static int vkCopyMemoryToImage(@NonNull VkDevice device, @NonNull MemorySegment pCopyMemoryToImageInfo) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkCopyMemoryToImage)) throw new VKSymbolNotFoundError("Symbol not found: vkCopyMemoryToImage");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCopyMemoryToImage", device, pCopyMemoryToImageInfo); }
        return (int) Handles.MH_vkCopyMemoryToImage.invokeExact(device.capabilities().PFN_vkCopyMemoryToImage, device.segment(), pCopyMemoryToImageInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkCopyMemoryToImage", e); }
    }

    /// Invokes `vkCopyImageToMemory`.
    /// ```
    /// VkResult vkCopyImageToMemory(VkDevice device, const VkCopyImageToMemoryInfo* pCopyImageToMemoryInfo);
    /// ```
    public static int vkCopyImageToMemory(@NonNull VkDevice device, @NonNull MemorySegment pCopyImageToMemoryInfo) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkCopyImageToMemory)) throw new VKSymbolNotFoundError("Symbol not found: vkCopyImageToMemory");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCopyImageToMemory", device, pCopyImageToMemoryInfo); }
        return (int) Handles.MH_vkCopyImageToMemory.invokeExact(device.capabilities().PFN_vkCopyImageToMemory, device.segment(), pCopyImageToMemoryInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkCopyImageToMemory", e); }
    }

    /// Invokes `vkCopyImageToImage`.
    /// ```
    /// VkResult vkCopyImageToImage(VkDevice device, const VkCopyImageToImageInfo* pCopyImageToImageInfo);
    /// ```
    public static int vkCopyImageToImage(@NonNull VkDevice device, @NonNull MemorySegment pCopyImageToImageInfo) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkCopyImageToImage)) throw new VKSymbolNotFoundError("Symbol not found: vkCopyImageToImage");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCopyImageToImage", device, pCopyImageToImageInfo); }
        return (int) Handles.MH_vkCopyImageToImage.invokeExact(device.capabilities().PFN_vkCopyImageToImage, device.segment(), pCopyImageToImageInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkCopyImageToImage", e); }
    }

    /// Invokes `vkTransitionImageLayout`.
    /// ```
    /// VkResult vkTransitionImageLayout(VkDevice device, uint32_t transitionCount, const VkHostImageLayoutTransitionInfo* pTransitions);
    /// ```
    public static int vkTransitionImageLayout(@NonNull VkDevice device, int transitionCount, @NonNull MemorySegment pTransitions) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkTransitionImageLayout)) throw new VKSymbolNotFoundError("Symbol not found: vkTransitionImageLayout");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkTransitionImageLayout", device, transitionCount, pTransitions); }
        return (int) Handles.MH_vkTransitionImageLayout.invokeExact(device.capabilities().PFN_vkTransitionImageLayout, device.segment(), transitionCount, pTransitions); }
        catch (Throwable e) { throw new RuntimeException("error in vkTransitionImageLayout", e); }
    }

    /// Invokes `vkCmdPushDescriptorSet`.
    /// ```
    /// void vkCmdPushDescriptorSet(VkCommandBuffer commandBuffer, VkPipelineBindPoint pipelineBindPoint, VkPipelineLayout layout, uint32_t set, uint32_t descriptorWriteCount, const VkWriteDescriptorSet* pDescriptorWrites);
    /// ```
    public static void vkCmdPushDescriptorSet(@NonNull VkCommandBuffer commandBuffer, int pipelineBindPoint, long layout, int set, int descriptorWriteCount, @NonNull MemorySegment pDescriptorWrites) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdPushDescriptorSet)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdPushDescriptorSet");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdPushDescriptorSet", commandBuffer, pipelineBindPoint, layout, set, descriptorWriteCount, pDescriptorWrites); }
        Handles.MH_vkCmdPushDescriptorSet.invokeExact(commandBuffer.capabilities().PFN_vkCmdPushDescriptorSet, commandBuffer.segment(), pipelineBindPoint, layout, set, descriptorWriteCount, pDescriptorWrites); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdPushDescriptorSet", e); }
    }

    /// Invokes `vkCmdPushDescriptorSetWithTemplate`.
    /// ```
    /// void vkCmdPushDescriptorSetWithTemplate(VkCommandBuffer commandBuffer, VkDescriptorUpdateTemplate descriptorUpdateTemplate, VkPipelineLayout layout, uint32_t set, const void* pData);
    /// ```
    public static void vkCmdPushDescriptorSetWithTemplate(@NonNull VkCommandBuffer commandBuffer, long descriptorUpdateTemplate, long layout, int set, @NonNull MemorySegment pData) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdPushDescriptorSetWithTemplate)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdPushDescriptorSetWithTemplate");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdPushDescriptorSetWithTemplate", commandBuffer, descriptorUpdateTemplate, layout, set, pData); }
        Handles.MH_vkCmdPushDescriptorSetWithTemplate.invokeExact(commandBuffer.capabilities().PFN_vkCmdPushDescriptorSetWithTemplate, commandBuffer.segment(), descriptorUpdateTemplate, layout, set, pData); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdPushDescriptorSetWithTemplate", e); }
    }

    /// Invokes `vkCmdBindDescriptorSets2`.
    /// ```
    /// void vkCmdBindDescriptorSets2(VkCommandBuffer commandBuffer, const VkBindDescriptorSetsInfo* pBindDescriptorSetsInfo);
    /// ```
    public static void vkCmdBindDescriptorSets2(@NonNull VkCommandBuffer commandBuffer, @NonNull MemorySegment pBindDescriptorSetsInfo) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdBindDescriptorSets2)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdBindDescriptorSets2");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdBindDescriptorSets2", commandBuffer, pBindDescriptorSetsInfo); }
        Handles.MH_vkCmdBindDescriptorSets2.invokeExact(commandBuffer.capabilities().PFN_vkCmdBindDescriptorSets2, commandBuffer.segment(), pBindDescriptorSetsInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdBindDescriptorSets2", e); }
    }

    /// Invokes `vkCmdPushConstants2`.
    /// ```
    /// void vkCmdPushConstants2(VkCommandBuffer commandBuffer, const VkPushConstantsInfo* pPushConstantsInfo);
    /// ```
    public static void vkCmdPushConstants2(@NonNull VkCommandBuffer commandBuffer, @NonNull MemorySegment pPushConstantsInfo) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdPushConstants2)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdPushConstants2");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdPushConstants2", commandBuffer, pPushConstantsInfo); }
        Handles.MH_vkCmdPushConstants2.invokeExact(commandBuffer.capabilities().PFN_vkCmdPushConstants2, commandBuffer.segment(), pPushConstantsInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdPushConstants2", e); }
    }

    /// Invokes `vkCmdPushDescriptorSet2`.
    /// ```
    /// void vkCmdPushDescriptorSet2(VkCommandBuffer commandBuffer, const VkPushDescriptorSetInfo* pPushDescriptorSetInfo);
    /// ```
    public static void vkCmdPushDescriptorSet2(@NonNull VkCommandBuffer commandBuffer, @NonNull MemorySegment pPushDescriptorSetInfo) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdPushDescriptorSet2)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdPushDescriptorSet2");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdPushDescriptorSet2", commandBuffer, pPushDescriptorSetInfo); }
        Handles.MH_vkCmdPushDescriptorSet2.invokeExact(commandBuffer.capabilities().PFN_vkCmdPushDescriptorSet2, commandBuffer.segment(), pPushDescriptorSetInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdPushDescriptorSet2", e); }
    }

    /// Invokes `vkCmdPushDescriptorSetWithTemplate2`.
    /// ```
    /// void vkCmdPushDescriptorSetWithTemplate2(VkCommandBuffer commandBuffer, const VkPushDescriptorSetWithTemplateInfo* pPushDescriptorSetWithTemplateInfo);
    /// ```
    public static void vkCmdPushDescriptorSetWithTemplate2(@NonNull VkCommandBuffer commandBuffer, @NonNull MemorySegment pPushDescriptorSetWithTemplateInfo) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdPushDescriptorSetWithTemplate2)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdPushDescriptorSetWithTemplate2");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdPushDescriptorSetWithTemplate2", commandBuffer, pPushDescriptorSetWithTemplateInfo); }
        Handles.MH_vkCmdPushDescriptorSetWithTemplate2.invokeExact(commandBuffer.capabilities().PFN_vkCmdPushDescriptorSetWithTemplate2, commandBuffer.segment(), pPushDescriptorSetWithTemplateInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdPushDescriptorSetWithTemplate2", e); }
    }

    /// Invokes `vkCmdSetLineStipple`.
    /// ```
    /// void vkCmdSetLineStipple(VkCommandBuffer commandBuffer, uint32_t lineStippleFactor, uint16_t lineStipplePattern);
    /// ```
    public static void vkCmdSetLineStipple(@NonNull VkCommandBuffer commandBuffer, int lineStippleFactor, short lineStipplePattern) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetLineStipple)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdSetLineStipple");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdSetLineStipple", commandBuffer, lineStippleFactor, lineStipplePattern); }
        Handles.MH_vkCmdSetLineStipple.invokeExact(commandBuffer.capabilities().PFN_vkCmdSetLineStipple, commandBuffer.segment(), lineStippleFactor, lineStipplePattern); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetLineStipple", e); }
    }

    /// Invokes `vkCmdBindIndexBuffer2`.
    /// ```
    /// void vkCmdBindIndexBuffer2(VkCommandBuffer commandBuffer, VkBuffer buffer, VkDeviceSize offset, VkDeviceSize size, VkIndexType indexType);
    /// ```
    public static void vkCmdBindIndexBuffer2(@NonNull VkCommandBuffer commandBuffer, long buffer, long offset, long size, int indexType) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdBindIndexBuffer2)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdBindIndexBuffer2");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdBindIndexBuffer2", commandBuffer, buffer, offset, size, indexType); }
        Handles.MH_vkCmdBindIndexBuffer2.invokeExact(commandBuffer.capabilities().PFN_vkCmdBindIndexBuffer2, commandBuffer.segment(), buffer, offset, size, indexType); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdBindIndexBuffer2", e); }
    }

    /// Invokes `vkGetRenderingAreaGranularity`.
    /// ```
    /// void vkGetRenderingAreaGranularity(VkDevice device, const VkRenderingAreaInfo* pRenderingAreaInfo, VkExtent2D* pGranularity);
    /// ```
    public static void vkGetRenderingAreaGranularity(@NonNull VkDevice device, @NonNull MemorySegment pRenderingAreaInfo, @NonNull MemorySegment pGranularity) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkGetRenderingAreaGranularity)) throw new VKSymbolNotFoundError("Symbol not found: vkGetRenderingAreaGranularity");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkGetRenderingAreaGranularity", device, pRenderingAreaInfo, pGranularity); }
        Handles.MH_vkGetRenderingAreaGranularity.invokeExact(device.capabilities().PFN_vkGetRenderingAreaGranularity, device.segment(), pRenderingAreaInfo, pGranularity); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetRenderingAreaGranularity", e); }
    }

    /// Invokes `vkCmdSetRenderingAttachmentLocations`.
    /// ```
    /// void vkCmdSetRenderingAttachmentLocations(VkCommandBuffer commandBuffer, const VkRenderingAttachmentLocationInfo* pLocationInfo);
    /// ```
    public static void vkCmdSetRenderingAttachmentLocations(@NonNull VkCommandBuffer commandBuffer, @NonNull MemorySegment pLocationInfo) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetRenderingAttachmentLocations)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdSetRenderingAttachmentLocations");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdSetRenderingAttachmentLocations", commandBuffer, pLocationInfo); }
        Handles.MH_vkCmdSetRenderingAttachmentLocations.invokeExact(commandBuffer.capabilities().PFN_vkCmdSetRenderingAttachmentLocations, commandBuffer.segment(), pLocationInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetRenderingAttachmentLocations", e); }
    }

    /// Invokes `vkCmdSetRenderingInputAttachmentIndices`.
    /// ```
    /// void vkCmdSetRenderingInputAttachmentIndices(VkCommandBuffer commandBuffer, const VkRenderingInputAttachmentIndexInfo* pInputAttachmentIndexInfo);
    /// ```
    public static void vkCmdSetRenderingInputAttachmentIndices(@NonNull VkCommandBuffer commandBuffer, @NonNull MemorySegment pInputAttachmentIndexInfo) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetRenderingInputAttachmentIndices)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdSetRenderingInputAttachmentIndices");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdSetRenderingInputAttachmentIndices", commandBuffer, pInputAttachmentIndexInfo); }
        Handles.MH_vkCmdSetRenderingInputAttachmentIndices.invokeExact(commandBuffer.capabilities().PFN_vkCmdSetRenderingInputAttachmentIndices, commandBuffer.segment(), pInputAttachmentIndexInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetRenderingInputAttachmentIndices", e); }
    }

}
