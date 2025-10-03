// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr;
import java.lang.foreign.*;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.vulkan.*;
import static overrungl.internal.RuntimeHelper.*;
/// `VK_KHR_shared_presentable_image` - device extension
public final class VKKHRSharedPresentableImage {
    public static final int VK_KHR_SHARED_PRESENTABLE_IMAGE_SPEC_VERSION = 1;
    public static final String VK_KHR_SHARED_PRESENTABLE_IMAGE_EXTENSION_NAME = "VK_KHR_shared_presentable_image";
    public static final int VK_STRUCTURE_TYPE_SHARED_PRESENT_SURFACE_CAPABILITIES_KHR = 1000111000;
    public static final int VK_PRESENT_MODE_SHARED_DEMAND_REFRESH_KHR = 1000111000;
    public static final int VK_PRESENT_MODE_SHARED_CONTINUOUS_REFRESH_KHR = 1000111001;
    public static final int VK_IMAGE_LAYOUT_SHARED_PRESENT_KHR = 1000111000;
    public static final class Handles {
        public static final Supplier<MethodHandle> MH_vkGetSwapchainStatusKHR = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)));
        private Handles() {}
    }

    private VKKHRSharedPresentableImage() {}

    /// Invokes `vkGetSwapchainStatusKHR`.
    /// ```
    /// (int) VkResult vkGetSwapchainStatusKHR((struct VkDevice*) VkDevice device, (uint64_t) VkSwapchainKHR swapchain);
    /// ```
    public static int vkGetSwapchainStatusKHR(@NonNull VkDevice device, long swapchain) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkGetSwapchainStatusKHR)) throw new VKSymbolNotFoundError("Symbol not found: vkGetSwapchainStatusKHR");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkGetSwapchainStatusKHR", device, swapchain); }
        return (int) Handles.MH_vkGetSwapchainStatusKHR.get().invokeExact(device.capabilities().PFN_vkGetSwapchainStatusKHR, device.segment(), swapchain); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetSwapchainStatusKHR", e); }
    }

}
