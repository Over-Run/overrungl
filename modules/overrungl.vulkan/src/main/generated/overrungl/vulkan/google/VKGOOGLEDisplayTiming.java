// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.google;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.vulkan.*;
import static overrungl.internal.RuntimeHelper.*;
/// `VK_GOOGLE_display_timing` - device extension
public final class VKGOOGLEDisplayTiming {
    public static final int VK_GOOGLE_DISPLAY_TIMING_SPEC_VERSION = 1;
    public static final String VK_GOOGLE_DISPLAY_TIMING_EXTENSION_NAME = "VK_GOOGLE_display_timing";
    public static final int VK_STRUCTURE_TYPE_PRESENT_TIMES_INFO_GOOGLE = 1000092000;
    private VKGOOGLEDisplayTiming() {}
    public static final class Handles {
        public static final MethodHandle MH_vkGetRefreshCycleDurationGOOGLE = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetPastPresentationTimingGOOGLE = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        private Handles() {}
    }

    /// Invokes `vkGetRefreshCycleDurationGOOGLE`.
    /// ```
    /// VkResult vkGetRefreshCycleDurationGOOGLE(VkDevice device, VkSwapchainKHR swapchain, VkRefreshCycleDurationGOOGLE* pDisplayTimingProperties);
    /// ```
    public static int vkGetRefreshCycleDurationGOOGLE(@NonNull VkDevice device, long swapchain, @NonNull MemorySegment pDisplayTimingProperties) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkGetRefreshCycleDurationGOOGLE)) throw new VKSymbolNotFoundError("Symbol not found: vkGetRefreshCycleDurationGOOGLE");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkGetRefreshCycleDurationGOOGLE", device, swapchain, pDisplayTimingProperties); }
        return (int) Handles.MH_vkGetRefreshCycleDurationGOOGLE.invokeExact(device.capabilities().PFN_vkGetRefreshCycleDurationGOOGLE, device.segment(), swapchain, pDisplayTimingProperties); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetRefreshCycleDurationGOOGLE", e); }
    }

    /// Invokes `vkGetPastPresentationTimingGOOGLE`.
    /// ```
    /// VkResult vkGetPastPresentationTimingGOOGLE(VkDevice device, VkSwapchainKHR swapchain, uint32_t* pPresentationTimingCount, VkPastPresentationTimingGOOGLE* pPresentationTimings);
    /// ```
    public static int vkGetPastPresentationTimingGOOGLE(@NonNull VkDevice device, long swapchain, @NonNull MemorySegment pPresentationTimingCount, @NonNull MemorySegment pPresentationTimings) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkGetPastPresentationTimingGOOGLE)) throw new VKSymbolNotFoundError("Symbol not found: vkGetPastPresentationTimingGOOGLE");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkGetPastPresentationTimingGOOGLE", device, swapchain, pPresentationTimingCount, pPresentationTimings); }
        return (int) Handles.MH_vkGetPastPresentationTimingGOOGLE.invokeExact(device.capabilities().PFN_vkGetPastPresentationTimingGOOGLE, device.segment(), swapchain, pPresentationTimingCount, pPresentationTimings); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetPastPresentationTimingGOOGLE", e); }
    }

}
