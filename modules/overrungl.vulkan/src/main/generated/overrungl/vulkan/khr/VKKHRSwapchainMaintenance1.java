// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.vulkan.*;
import static overrungl.internal.RuntimeHelper.*;
/// `VK_KHR_swapchain_maintenance1` - device extension
public final class VKKHRSwapchainMaintenance1 {
    public static final int VK_KHR_SWAPCHAIN_MAINTENANCE_1_SPEC_VERSION = 1;
    public static final String VK_KHR_SWAPCHAIN_MAINTENANCE_1_EXTENSION_NAME = "VK_KHR_swapchain_maintenance1";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SWAPCHAIN_MAINTENANCE_1_FEATURES_KHR = 1000275000;
    public static final int VK_STRUCTURE_TYPE_SWAPCHAIN_PRESENT_FENCE_INFO_KHR = 1000275001;
    public static final int VK_STRUCTURE_TYPE_SWAPCHAIN_PRESENT_MODES_CREATE_INFO_KHR = 1000275002;
    public static final int VK_STRUCTURE_TYPE_SWAPCHAIN_PRESENT_MODE_INFO_KHR = 1000275003;
    public static final int VK_STRUCTURE_TYPE_SWAPCHAIN_PRESENT_SCALING_CREATE_INFO_KHR = 1000275004;
    public static final int VK_STRUCTURE_TYPE_RELEASE_SWAPCHAIN_IMAGES_INFO_KHR = 1000275005;
    public static final int VK_SWAPCHAIN_CREATE_DEFERRED_MEMORY_ALLOCATION_BIT_KHR = 0x00000008;
    private VKKHRSwapchainMaintenance1() {}
    public static final class Handles {
        public static final MethodHandle MH_vkReleaseSwapchainImagesKHR = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        private Handles() {}
    }

    /// Invokes `vkReleaseSwapchainImagesKHR`.
    /// ```
    /// VkResult vkReleaseSwapchainImagesKHR(VkDevice device, const VkReleaseSwapchainImagesInfoKHR* pReleaseInfo);
    /// ```
    public static int vkReleaseSwapchainImagesKHR(@NonNull VkDevice device, @NonNull MemorySegment pReleaseInfo) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkReleaseSwapchainImagesKHR)) throw new VKSymbolNotFoundError("Symbol not found: vkReleaseSwapchainImagesKHR");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkReleaseSwapchainImagesKHR", device, pReleaseInfo); }
        return (int) Handles.MH_vkReleaseSwapchainImagesKHR.invokeExact(device.capabilities().PFN_vkReleaseSwapchainImagesKHR, device.segment(), pReleaseInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkReleaseSwapchainImagesKHR", e); }
    }

}
