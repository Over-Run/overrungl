// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.vulkan.*;
import static overrungl.internal.RuntimeHelper.*;
/// `VK_KHR_device_group` - device extension
public final class VKKHRDeviceGroup {
    public static final int VK_DEVICE_GROUP_PRESENT_MODE_LOCAL_BIT_KHR = 0x00000001;
    public static final int VK_DEVICE_GROUP_PRESENT_MODE_REMOTE_BIT_KHR = 0x00000002;
    public static final int VK_DEVICE_GROUP_PRESENT_MODE_SUM_BIT_KHR = 0x00000004;
    public static final int VK_DEVICE_GROUP_PRESENT_MODE_LOCAL_MULTI_DEVICE_BIT_KHR = 0x00000008;
    public static final int VK_KHR_DEVICE_GROUP_SPEC_VERSION = 4;
    public static final String VK_KHR_DEVICE_GROUP_EXTENSION_NAME = "VK_KHR_device_group";
    public static final int VK_STRUCTURE_TYPE_MEMORY_ALLOCATE_FLAGS_INFO_KHR = 1000060000;
    public static final int VK_STRUCTURE_TYPE_DEVICE_GROUP_RENDER_PASS_BEGIN_INFO_KHR = 1000060003;
    public static final int VK_STRUCTURE_TYPE_DEVICE_GROUP_COMMAND_BUFFER_BEGIN_INFO_KHR = 1000060004;
    public static final int VK_STRUCTURE_TYPE_DEVICE_GROUP_SUBMIT_INFO_KHR = 1000060005;
    public static final int VK_STRUCTURE_TYPE_DEVICE_GROUP_BIND_SPARSE_INFO_KHR = 1000060006;
    public static final int VK_PEER_MEMORY_FEATURE_COPY_SRC_BIT_KHR = 0x00000001;
    public static final int VK_PEER_MEMORY_FEATURE_COPY_DST_BIT_KHR = 0x00000002;
    public static final int VK_PEER_MEMORY_FEATURE_GENERIC_SRC_BIT_KHR = 0x00000004;
    public static final int VK_PEER_MEMORY_FEATURE_GENERIC_DST_BIT_KHR = 0x00000008;
    public static final int VK_MEMORY_ALLOCATE_DEVICE_MASK_BIT_KHR = 0x00000001;
    public static final int VK_PIPELINE_CREATE_VIEW_INDEX_FROM_DEVICE_INDEX_BIT_KHR = 0x00000008;
    public static final int VK_PIPELINE_CREATE_DISPATCH_BASE_BIT_KHR = 0x00000010;
    public static final int VK_PIPELINE_CREATE_DISPATCH_BASE_KHR = 0x00000010;
    public static final int VK_DEPENDENCY_DEVICE_GROUP_BIT_KHR = 0x00000004;
    public static final int VK_STRUCTURE_TYPE_BIND_BUFFER_MEMORY_DEVICE_GROUP_INFO_KHR = 1000060013;
    public static final int VK_STRUCTURE_TYPE_BIND_IMAGE_MEMORY_DEVICE_GROUP_INFO_KHR = 1000060014;
    public static final int VK_IMAGE_CREATE_SPLIT_INSTANCE_BIND_REGIONS_BIT_KHR = 0x00000040;
    public static final int VK_STRUCTURE_TYPE_DEVICE_GROUP_PRESENT_CAPABILITIES_KHR = 1000060007;
    public static final int VK_STRUCTURE_TYPE_IMAGE_SWAPCHAIN_CREATE_INFO_KHR = 1000060008;
    public static final int VK_STRUCTURE_TYPE_BIND_IMAGE_MEMORY_SWAPCHAIN_INFO_KHR = 1000060009;
    public static final int VK_STRUCTURE_TYPE_ACQUIRE_NEXT_IMAGE_INFO_KHR = 1000060010;
    public static final int VK_STRUCTURE_TYPE_DEVICE_GROUP_PRESENT_INFO_KHR = 1000060011;
    public static final int VK_STRUCTURE_TYPE_DEVICE_GROUP_SWAPCHAIN_CREATE_INFO_KHR = 1000060012;
    public static final int VK_SWAPCHAIN_CREATE_SPLIT_INSTANCE_BIND_REGIONS_BIT_KHR = 0x00000001;
    public static final class Handles {
        public static final MethodHandle MH_vkGetDeviceGroupPeerMemoryFeaturesKHR = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdSetDeviceMaskKHR = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_vkCmdDispatchBaseKHR = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_vkGetDeviceGroupPresentCapabilitiesKHR = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetDeviceGroupSurfacePresentModesKHR = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetPhysicalDevicePresentRectanglesKHR = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkAcquireNextImage2KHR = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        private Handles() {}
    }

    private VKKHRDeviceGroup() {}

    /// Invokes `vkGetDeviceGroupPeerMemoryFeaturesKHR`.
    /// ```
    /// void vkGetDeviceGroupPeerMemoryFeaturesKHR((struct VkDevice*) VkDevice device, uint32_t heapIndex, uint32_t localDeviceIndex, uint32_t remoteDeviceIndex, VkPeerMemoryFeatureFlags* pPeerMemoryFeatures);
    /// ```
    public static void vkGetDeviceGroupPeerMemoryFeaturesKHR(@NonNull VkDevice device, int heapIndex, int localDeviceIndex, int remoteDeviceIndex, @NonNull MemorySegment pPeerMemoryFeatures) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkGetDeviceGroupPeerMemoryFeaturesKHR)) throw new VKSymbolNotFoundError("Symbol not found: vkGetDeviceGroupPeerMemoryFeaturesKHR");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkGetDeviceGroupPeerMemoryFeaturesKHR", device, heapIndex, localDeviceIndex, remoteDeviceIndex, pPeerMemoryFeatures); }
        Handles.MH_vkGetDeviceGroupPeerMemoryFeaturesKHR.invokeExact(device.capabilities().PFN_vkGetDeviceGroupPeerMemoryFeaturesKHR, device.segment(), heapIndex, localDeviceIndex, remoteDeviceIndex, pPeerMemoryFeatures); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetDeviceGroupPeerMemoryFeaturesKHR", e); }
    }

    /// Invokes `vkCmdSetDeviceMaskKHR`.
    /// ```
    /// void vkCmdSetDeviceMaskKHR((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, uint32_t deviceMask);
    /// ```
    public static void vkCmdSetDeviceMaskKHR(@NonNull VkCommandBuffer commandBuffer, int deviceMask) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetDeviceMaskKHR)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdSetDeviceMaskKHR");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdSetDeviceMaskKHR", commandBuffer, deviceMask); }
        Handles.MH_vkCmdSetDeviceMaskKHR.invokeExact(commandBuffer.capabilities().PFN_vkCmdSetDeviceMaskKHR, commandBuffer.segment(), deviceMask); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetDeviceMaskKHR", e); }
    }

    /// Invokes `vkCmdDispatchBaseKHR`.
    /// ```
    /// void vkCmdDispatchBaseKHR((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, uint32_t baseGroupX, uint32_t baseGroupY, uint32_t baseGroupZ, uint32_t groupCountX, uint32_t groupCountY, uint32_t groupCountZ);
    /// ```
    public static void vkCmdDispatchBaseKHR(@NonNull VkCommandBuffer commandBuffer, int baseGroupX, int baseGroupY, int baseGroupZ, int groupCountX, int groupCountY, int groupCountZ) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdDispatchBaseKHR)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdDispatchBaseKHR");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdDispatchBaseKHR", commandBuffer, baseGroupX, baseGroupY, baseGroupZ, groupCountX, groupCountY, groupCountZ); }
        Handles.MH_vkCmdDispatchBaseKHR.invokeExact(commandBuffer.capabilities().PFN_vkCmdDispatchBaseKHR, commandBuffer.segment(), baseGroupX, baseGroupY, baseGroupZ, groupCountX, groupCountY, groupCountZ); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdDispatchBaseKHR", e); }
    }

    /// Invokes `vkGetDeviceGroupPresentCapabilitiesKHR`.
    /// ```
    /// (int) VkResult vkGetDeviceGroupPresentCapabilitiesKHR((struct VkDevice*) VkDevice device, VkDeviceGroupPresentCapabilitiesKHR* pDeviceGroupPresentCapabilities);
    /// ```
    public static int vkGetDeviceGroupPresentCapabilitiesKHR(@NonNull VkDevice device, @NonNull MemorySegment pDeviceGroupPresentCapabilities) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkGetDeviceGroupPresentCapabilitiesKHR)) throw new VKSymbolNotFoundError("Symbol not found: vkGetDeviceGroupPresentCapabilitiesKHR");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkGetDeviceGroupPresentCapabilitiesKHR", device, pDeviceGroupPresentCapabilities); }
        return (int) Handles.MH_vkGetDeviceGroupPresentCapabilitiesKHR.invokeExact(device.capabilities().PFN_vkGetDeviceGroupPresentCapabilitiesKHR, device.segment(), pDeviceGroupPresentCapabilities); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetDeviceGroupPresentCapabilitiesKHR", e); }
    }

    /// Invokes `vkGetDeviceGroupSurfacePresentModesKHR`.
    /// ```
    /// (int) VkResult vkGetDeviceGroupSurfacePresentModesKHR((struct VkDevice*) VkDevice device, (uint64_t) VkSurfaceKHR surface, VkDeviceGroupPresentModeFlagsKHR* pModes);
    /// ```
    public static int vkGetDeviceGroupSurfacePresentModesKHR(@NonNull VkDevice device, long surface, @NonNull MemorySegment pModes) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkGetDeviceGroupSurfacePresentModesKHR)) throw new VKSymbolNotFoundError("Symbol not found: vkGetDeviceGroupSurfacePresentModesKHR");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkGetDeviceGroupSurfacePresentModesKHR", device, surface, pModes); }
        return (int) Handles.MH_vkGetDeviceGroupSurfacePresentModesKHR.invokeExact(device.capabilities().PFN_vkGetDeviceGroupSurfacePresentModesKHR, device.segment(), surface, pModes); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetDeviceGroupSurfacePresentModesKHR", e); }
    }

    /// Invokes `vkGetPhysicalDevicePresentRectanglesKHR`.
    /// ```
    /// (int) VkResult vkGetPhysicalDevicePresentRectanglesKHR((struct VkPhysicalDevice*) VkPhysicalDevice physicalDevice, (uint64_t) VkSurfaceKHR surface, uint32_t* pRectCount, VkRect2D* pRects);
    /// ```
    public static int vkGetPhysicalDevicePresentRectanglesKHR(@NonNull VkPhysicalDevice physicalDevice, long surface, @NonNull MemorySegment pRectCount, @NonNull MemorySegment pRects) {
        if (MemoryUtil.isNullPointer(physicalDevice.capabilities().PFN_vkGetPhysicalDevicePresentRectanglesKHR)) throw new VKSymbolNotFoundError("Symbol not found: vkGetPhysicalDevicePresentRectanglesKHR");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkGetPhysicalDevicePresentRectanglesKHR", physicalDevice, surface, pRectCount, pRects); }
        return (int) Handles.MH_vkGetPhysicalDevicePresentRectanglesKHR.invokeExact(physicalDevice.capabilities().PFN_vkGetPhysicalDevicePresentRectanglesKHR, physicalDevice.segment(), surface, pRectCount, pRects); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetPhysicalDevicePresentRectanglesKHR", e); }
    }

    /// Invokes `vkAcquireNextImage2KHR`.
    /// ```
    /// (int) VkResult vkAcquireNextImage2KHR((struct VkDevice*) VkDevice device, const VkAcquireNextImageInfoKHR* pAcquireInfo, uint32_t* pImageIndex);
    /// ```
    public static int vkAcquireNextImage2KHR(@NonNull VkDevice device, @NonNull MemorySegment pAcquireInfo, @NonNull MemorySegment pImageIndex) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkAcquireNextImage2KHR)) throw new VKSymbolNotFoundError("Symbol not found: vkAcquireNextImage2KHR");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkAcquireNextImage2KHR", device, pAcquireInfo, pImageIndex); }
        return (int) Handles.MH_vkAcquireNextImage2KHR.invokeExact(device.capabilities().PFN_vkAcquireNextImage2KHR, device.segment(), pAcquireInfo, pImageIndex); }
        catch (Throwable e) { throw new RuntimeException("error in vkAcquireNextImage2KHR", e); }
    }

}
