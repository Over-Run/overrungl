// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.vulkan.*;
import static overrungl.internal.RuntimeHelper.*;
/// `VK_EXT_swapchain_maintenance1` - device extension
public final class VKEXTSwapchainMaintenance1 {
    public static final int VK_EXT_SWAPCHAIN_MAINTENANCE_1_SPEC_VERSION = 1;
    public static final String VK_EXT_SWAPCHAIN_MAINTENANCE_1_EXTENSION_NAME = "VK_EXT_swapchain_maintenance1";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SWAPCHAIN_MAINTENANCE_1_FEATURES_EXT = 1000487000;
    public static final int VK_STRUCTURE_TYPE_SWAPCHAIN_PRESENT_FENCE_INFO_EXT = 1000487001;
    public static final int VK_STRUCTURE_TYPE_SWAPCHAIN_PRESENT_MODES_CREATE_INFO_EXT = 1000487002;
    public static final int VK_STRUCTURE_TYPE_SWAPCHAIN_PRESENT_MODE_INFO_EXT = 1000487003;
    public static final int VK_STRUCTURE_TYPE_SWAPCHAIN_PRESENT_SCALING_CREATE_INFO_EXT = 1000487004;
    public static final int VK_STRUCTURE_TYPE_RELEASE_SWAPCHAIN_IMAGES_INFO_EXT = 1000487005;
    public static final int VK_SWAPCHAIN_CREATE_DEFERRED_MEMORY_ALLOCATION_BIT_EXT = 0x00000008;
    public static final class Handles {
        public static final MethodHandle MH_vkReleaseSwapchainImagesEXT = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        private Handles() {}
    }

    private VKEXTSwapchainMaintenance1() {}

    /// Invokes `vkReleaseSwapchainImagesEXT`.
    /// ```
    /// (int) VkResult vkReleaseSwapchainImagesEXT((struct VkDevice*) VkDevice device, const VkReleaseSwapchainImagesInfoKHR* pReleaseInfo);
    /// ```
    public static int vkReleaseSwapchainImagesEXT(@NonNull VkDevice device, @NonNull MemorySegment pReleaseInfo) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkReleaseSwapchainImagesEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkReleaseSwapchainImagesEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkReleaseSwapchainImagesEXT", device, pReleaseInfo); }
        return (int) Handles.MH_vkReleaseSwapchainImagesEXT.invokeExact(device.capabilities().PFN_vkReleaseSwapchainImagesEXT, device.segment(), pReleaseInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkReleaseSwapchainImagesEXT", e); }
    }

}
