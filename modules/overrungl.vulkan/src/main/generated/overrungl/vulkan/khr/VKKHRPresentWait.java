// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.vulkan.*;
import static overrungl.internal.RuntimeHelper.*;
/// `VK_KHR_present_wait` - device extension
public final class VKKHRPresentWait {
    public static final int VK_KHR_PRESENT_WAIT_SPEC_VERSION = 1;
    public static final String VK_KHR_PRESENT_WAIT_EXTENSION_NAME = "VK_KHR_present_wait";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PRESENT_WAIT_FEATURES_KHR = 1000248000;
    private VKKHRPresentWait() {}
    public static final class Handles {
        public static final MethodHandle MH_vkWaitForPresentKHR = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG));
        private Handles() {}
    }

    /// Invokes `vkWaitForPresentKHR`.
    /// ```
    /// VkResult vkWaitForPresentKHR(VkDevice device, VkSwapchainKHR swapchain, uint64_t presentId, uint64_t timeout);
    /// ```
    public static int vkWaitForPresentKHR(@NonNull VkDevice device, long swapchain, long presentId, long timeout) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkWaitForPresentKHR)) throw new VKSymbolNotFoundError("Symbol not found: vkWaitForPresentKHR");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkWaitForPresentKHR", device, swapchain, presentId, timeout); }
        return (int) Handles.MH_vkWaitForPresentKHR.invokeExact(device.capabilities().PFN_vkWaitForPresentKHR, device.segment(), swapchain, presentId, timeout); }
        catch (Throwable e) { throw new RuntimeException("error in vkWaitForPresentKHR", e); }
    }

}
