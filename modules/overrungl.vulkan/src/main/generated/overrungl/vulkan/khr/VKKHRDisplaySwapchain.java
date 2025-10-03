// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr;
import java.lang.foreign.*;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.vulkan.*;
import static overrungl.internal.RuntimeHelper.*;
/// `VK_KHR_display_swapchain` - device extension
public final class VKKHRDisplaySwapchain {
    public static final int VK_KHR_DISPLAY_SWAPCHAIN_SPEC_VERSION = 10;
    public static final String VK_KHR_DISPLAY_SWAPCHAIN_EXTENSION_NAME = "VK_KHR_display_swapchain";
    public static final int VK_STRUCTURE_TYPE_DISPLAY_PRESENT_INFO_KHR = 1000003000;
    public static final int VK_ERROR_INCOMPATIBLE_DISPLAY_KHR = -1000003001;
    public static final class Handles {
        public static final Supplier<MethodHandle> MH_vkCreateSharedSwapchainsKHR = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        private Handles() {}
    }

    private VKKHRDisplaySwapchain() {}

    /// Invokes `vkCreateSharedSwapchainsKHR`.
    /// ```
    /// (int) VkResult vkCreateSharedSwapchainsKHR((struct VkDevice*) VkDevice device, uint32_t swapchainCount, const VkSwapchainCreateInfoKHR* pCreateInfos, const VkAllocationCallbacks* pAllocator, VkSwapchainKHR* pSwapchains);
    /// ```
    public static int vkCreateSharedSwapchainsKHR(@NonNull VkDevice device, int swapchainCount, @NonNull MemorySegment pCreateInfos, @NonNull MemorySegment pAllocator, @NonNull MemorySegment pSwapchains) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkCreateSharedSwapchainsKHR)) throw new VKSymbolNotFoundError("Symbol not found: vkCreateSharedSwapchainsKHR");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCreateSharedSwapchainsKHR", device, swapchainCount, pCreateInfos, pAllocator, pSwapchains); }
        return (int) Handles.MH_vkCreateSharedSwapchainsKHR.get().invokeExact(device.capabilities().PFN_vkCreateSharedSwapchainsKHR, device.segment(), swapchainCount, pCreateInfos, pAllocator, pSwapchains); }
        catch (Throwable e) { throw new RuntimeException("error in vkCreateSharedSwapchainsKHR", e); }
    }

}
