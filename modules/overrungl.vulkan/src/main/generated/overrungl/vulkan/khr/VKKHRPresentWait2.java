// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr;
import java.lang.foreign.*;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.vulkan.*;
import static overrungl.internal.RuntimeHelper.*;
/// `VK_KHR_present_wait2` - device extension
public final class VKKHRPresentWait2 {
    public static final int VK_KHR_PRESENT_WAIT_2_SPEC_VERSION = 1;
    public static final String VK_KHR_PRESENT_WAIT_2_EXTENSION_NAME = "VK_KHR_present_wait2";
    public static final int VK_SWAPCHAIN_CREATE_PRESENT_WAIT_2_BIT_KHR = 0x00000080;
    public static final int VK_STRUCTURE_TYPE_SURFACE_CAPABILITIES_PRESENT_WAIT_2_KHR = 1000480000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PRESENT_WAIT_2_FEATURES_KHR = 1000480001;
    public static final int VK_STRUCTURE_TYPE_PRESENT_WAIT_2_INFO_KHR = 1000480002;
    public static final class Handles {
        public static final Supplier<MethodHandle> MH_vkWaitForPresent2KHR = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)));
        private Handles() {}
    }

    private VKKHRPresentWait2() {}

    /// Invokes `vkWaitForPresent2KHR`.
    /// ```
    /// (int) VkResult vkWaitForPresent2KHR((struct VkDevice*) VkDevice device, (uint64_t) VkSwapchainKHR swapchain, const VkPresentWait2InfoKHR* pPresentWait2Info);
    /// ```
    public static int vkWaitForPresent2KHR(@NonNull VkDevice device, long swapchain, @NonNull MemorySegment pPresentWait2Info) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkWaitForPresent2KHR)) throw new VKSymbolNotFoundError("Symbol not found: vkWaitForPresent2KHR");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkWaitForPresent2KHR", device, swapchain, pPresentWait2Info); }
        return (int) Handles.MH_vkWaitForPresent2KHR.get().invokeExact(device.capabilities().PFN_vkWaitForPresent2KHR, device.segment(), swapchain, pPresentWait2Info); }
        catch (Throwable e) { throw new RuntimeException("error in vkWaitForPresent2KHR", e); }
    }

}
