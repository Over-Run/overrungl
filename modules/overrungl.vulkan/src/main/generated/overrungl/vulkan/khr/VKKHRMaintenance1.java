// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.vulkan.*;
import static overrungl.internal.RuntimeHelper.*;
/// `VK_KHR_maintenance1` - device extension
public final class VKKHRMaintenance1 {
    public static final int VK_KHR_MAINTENANCE_1_SPEC_VERSION = 2;
    public static final String VK_KHR_MAINTENANCE_1_EXTENSION_NAME = "VK_KHR_maintenance1";
    public static final int VK_KHR_MAINTENANCE1_SPEC_VERSION = 2;
    public static final String VK_KHR_MAINTENANCE1_EXTENSION_NAME = "VK_KHR_maintenance1";
    public static final int VK_ERROR_OUT_OF_POOL_MEMORY_KHR = -1000069000;
    public static final int VK_FORMAT_FEATURE_TRANSFER_SRC_BIT_KHR = 0x00004000;
    public static final int VK_FORMAT_FEATURE_TRANSFER_DST_BIT_KHR = 0x00008000;
    public static final int VK_IMAGE_CREATE_2D_ARRAY_COMPATIBLE_BIT_KHR = 0x00000020;
    private VKKHRMaintenance1() {}
    public static final class Handles {
        public static final MethodHandle MH_vkTrimCommandPoolKHR = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT));
        private Handles() {}
    }

    /// Invokes `vkTrimCommandPoolKHR`.
    /// ```
    /// void vkTrimCommandPoolKHR(VkDevice device, VkCommandPool commandPool, VkCommandPoolTrimFlags flags);
    /// ```
    public static void vkTrimCommandPoolKHR(@NonNull VkDevice device, long commandPool, int flags) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkTrimCommandPoolKHR)) throw new VKSymbolNotFoundError("Symbol not found: vkTrimCommandPoolKHR");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkTrimCommandPoolKHR", device, commandPool, flags); }
        Handles.MH_vkTrimCommandPoolKHR.invokeExact(device.capabilities().PFN_vkTrimCommandPoolKHR, device.segment(), commandPool, flags); }
        catch (Throwable e) { throw new RuntimeException("error in vkTrimCommandPoolKHR", e); }
    }

}
