// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.vulkan.*;
import static overrungl.internal.RuntimeHelper.*;
/// `VK_EXT_present_timing` - device extension
public final class VKEXTPresentTiming {
    public static final int VK_EXT_PRESENT_TIMING_SPEC_VERSION = 3;
    public static final String VK_EXT_PRESENT_TIMING_EXTENSION_NAME = "VK_EXT_present_timing";
    public static final int VK_PRESENT_STAGE_QUEUE_OPERATIONS_END_BIT_EXT = 0x00000001;
    public static final int VK_PRESENT_STAGE_REQUEST_DEQUEUED_BIT_EXT = 0x00000002;
    public static final int VK_PRESENT_STAGE_IMAGE_FIRST_PIXEL_OUT_BIT_EXT = 0x00000004;
    public static final int VK_PRESENT_STAGE_IMAGE_FIRST_PIXEL_VISIBLE_BIT_EXT = 0x00000008;
    public static final int VK_PRESENT_TIMING_INFO_PRESENT_AT_RELATIVE_TIME_BIT_EXT = 0x00000001;
    public static final int VK_PRESENT_TIMING_INFO_PRESENT_AT_NEAREST_REFRESH_CYCLE_BIT_EXT = 0x00000002;
    public static final int VK_PAST_PRESENTATION_TIMING_ALLOW_PARTIAL_RESULTS_BIT_EXT = 0x00000001;
    public static final int VK_PAST_PRESENTATION_TIMING_ALLOW_OUT_OF_ORDER_RESULTS_BIT_EXT = 0x00000002;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PRESENT_TIMING_FEATURES_EXT = 1000208000;
    public static final int VK_STRUCTURE_TYPE_SWAPCHAIN_TIMING_PROPERTIES_EXT = 1000208001;
    public static final int VK_STRUCTURE_TYPE_SWAPCHAIN_TIME_DOMAIN_PROPERTIES_EXT = 1000208002;
    public static final int VK_STRUCTURE_TYPE_PRESENT_TIMINGS_INFO_EXT = 1000208003;
    public static final int VK_STRUCTURE_TYPE_PRESENT_TIMING_INFO_EXT = 1000208004;
    public static final int VK_STRUCTURE_TYPE_PAST_PRESENTATION_TIMING_INFO_EXT = 1000208005;
    public static final int VK_STRUCTURE_TYPE_PAST_PRESENTATION_TIMING_PROPERTIES_EXT = 1000208006;
    public static final int VK_STRUCTURE_TYPE_PAST_PRESENTATION_TIMING_EXT = 1000208007;
    public static final int VK_STRUCTURE_TYPE_PRESENT_TIMING_SURFACE_CAPABILITIES_EXT = 1000208008;
    public static final int VK_STRUCTURE_TYPE_SWAPCHAIN_CALIBRATED_TIMESTAMP_INFO_EXT = 1000208009;
    public static final int VK_TIME_DOMAIN_PRESENT_STAGE_LOCAL_EXT = 1000208000;
    public static final int VK_TIME_DOMAIN_SWAPCHAIN_LOCAL_EXT = 1000208001;
    public static final int VK_ERROR_PRESENT_TIMING_QUEUE_FULL_EXT = -1000208000;
    public static final int VK_SWAPCHAIN_CREATE_PRESENT_TIMING_BIT_EXT = 0x00000200;
    private VKEXTPresentTiming() {}
    public static final class Handles {
        public static final MethodHandle MH_vkSetSwapchainPresentTimingQueueSizeEXT = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_vkGetSwapchainTimingPropertiesEXT = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetSwapchainTimeDomainPropertiesEXT = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetPastPresentationTimingEXT = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        private Handles() {}
    }

    /// Invokes `vkSetSwapchainPresentTimingQueueSizeEXT`.
    /// ```
    /// VkResult vkSetSwapchainPresentTimingQueueSizeEXT(VkDevice device, VkSwapchainKHR swapchain, uint32_t size);
    /// ```
    public static int vkSetSwapchainPresentTimingQueueSizeEXT(@NonNull VkDevice device, long swapchain, int size) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkSetSwapchainPresentTimingQueueSizeEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkSetSwapchainPresentTimingQueueSizeEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkSetSwapchainPresentTimingQueueSizeEXT", device, swapchain, size); }
        return (int) Handles.MH_vkSetSwapchainPresentTimingQueueSizeEXT.invokeExact(device.capabilities().PFN_vkSetSwapchainPresentTimingQueueSizeEXT, device.segment(), swapchain, size); }
        catch (Throwable e) { throw new RuntimeException("error in vkSetSwapchainPresentTimingQueueSizeEXT", e); }
    }

    /// Invokes `vkGetSwapchainTimingPropertiesEXT`.
    /// ```
    /// VkResult vkGetSwapchainTimingPropertiesEXT(VkDevice device, VkSwapchainKHR swapchain, VkSwapchainTimingPropertiesEXT* pSwapchainTimingProperties, uint64_t* pSwapchainTimingPropertiesCounter);
    /// ```
    public static int vkGetSwapchainTimingPropertiesEXT(@NonNull VkDevice device, long swapchain, @NonNull MemorySegment pSwapchainTimingProperties, @NonNull MemorySegment pSwapchainTimingPropertiesCounter) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkGetSwapchainTimingPropertiesEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkGetSwapchainTimingPropertiesEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkGetSwapchainTimingPropertiesEXT", device, swapchain, pSwapchainTimingProperties, pSwapchainTimingPropertiesCounter); }
        return (int) Handles.MH_vkGetSwapchainTimingPropertiesEXT.invokeExact(device.capabilities().PFN_vkGetSwapchainTimingPropertiesEXT, device.segment(), swapchain, pSwapchainTimingProperties, pSwapchainTimingPropertiesCounter); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetSwapchainTimingPropertiesEXT", e); }
    }

    /// Invokes `vkGetSwapchainTimeDomainPropertiesEXT`.
    /// ```
    /// VkResult vkGetSwapchainTimeDomainPropertiesEXT(VkDevice device, VkSwapchainKHR swapchain, VkSwapchainTimeDomainPropertiesEXT* pSwapchainTimeDomainProperties, uint64_t* pTimeDomainsCounter);
    /// ```
    public static int vkGetSwapchainTimeDomainPropertiesEXT(@NonNull VkDevice device, long swapchain, @NonNull MemorySegment pSwapchainTimeDomainProperties, @NonNull MemorySegment pTimeDomainsCounter) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkGetSwapchainTimeDomainPropertiesEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkGetSwapchainTimeDomainPropertiesEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkGetSwapchainTimeDomainPropertiesEXT", device, swapchain, pSwapchainTimeDomainProperties, pTimeDomainsCounter); }
        return (int) Handles.MH_vkGetSwapchainTimeDomainPropertiesEXT.invokeExact(device.capabilities().PFN_vkGetSwapchainTimeDomainPropertiesEXT, device.segment(), swapchain, pSwapchainTimeDomainProperties, pTimeDomainsCounter); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetSwapchainTimeDomainPropertiesEXT", e); }
    }

    /// Invokes `vkGetPastPresentationTimingEXT`.
    /// ```
    /// VkResult vkGetPastPresentationTimingEXT(VkDevice device, const VkPastPresentationTimingInfoEXT* pPastPresentationTimingInfo, VkPastPresentationTimingPropertiesEXT* pPastPresentationTimingProperties);
    /// ```
    public static int vkGetPastPresentationTimingEXT(@NonNull VkDevice device, @NonNull MemorySegment pPastPresentationTimingInfo, @NonNull MemorySegment pPastPresentationTimingProperties) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkGetPastPresentationTimingEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkGetPastPresentationTimingEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkGetPastPresentationTimingEXT", device, pPastPresentationTimingInfo, pPastPresentationTimingProperties); }
        return (int) Handles.MH_vkGetPastPresentationTimingEXT.invokeExact(device.capabilities().PFN_vkGetPastPresentationTimingEXT, device.segment(), pPastPresentationTimingInfo, pPastPresentationTimingProperties); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetPastPresentationTimingEXT", e); }
    }

}
