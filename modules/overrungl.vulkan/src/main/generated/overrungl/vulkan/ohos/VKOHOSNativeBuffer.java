// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ohos;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.vulkan.*;
import static overrungl.internal.RuntimeHelper.*;
/// `VK_OHOS_native_buffer` - device extension
public final class VKOHOSNativeBuffer {
    public static final int VK_OHOS_NATIVE_BUFFER_SPEC_VERSION = 1;
    public static final String VK_OHOS_NATIVE_BUFFER_EXTENSION_NAME = "VK_OHOS_native_buffer";
    public static final int VK_SWAPCHAIN_IMAGE_USAGE_SHARED_BIT_OHOS = 0x00000001;
    public static final int VK_STRUCTURE_TYPE_NATIVE_BUFFER_OHOS = 1000453001;
    public static final int VK_STRUCTURE_TYPE_SWAPCHAIN_IMAGE_CREATE_INFO_OHOS = 1000453002;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PRESENTATION_PROPERTIES_OHOS = 1000453003;
    private VKOHOSNativeBuffer() {}
    public static final class Handles {
        public static final MethodHandle MH_vkGetSwapchainGrallocUsageOHOS = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkAcquireImageOHOS = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG));
        public static final MethodHandle MH_vkQueueSignalReleaseImageOHOS = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS));
        private Handles() {}
    }

    /// Invokes `vkGetSwapchainGrallocUsageOHOS`.
    /// ```
    /// VkResult vkGetSwapchainGrallocUsageOHOS(VkDevice device, VkFormat format, VkImageUsageFlags imageUsage, uint64_t* grallocUsage);
    /// ```
    public static int vkGetSwapchainGrallocUsageOHOS(@NonNull VkDevice device, int format, int imageUsage, @NonNull MemorySegment grallocUsage) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkGetSwapchainGrallocUsageOHOS)) throw new VKSymbolNotFoundError("Symbol not found: vkGetSwapchainGrallocUsageOHOS");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkGetSwapchainGrallocUsageOHOS", device, format, imageUsage, grallocUsage); }
        return (int) Handles.MH_vkGetSwapchainGrallocUsageOHOS.invokeExact(device.capabilities().PFN_vkGetSwapchainGrallocUsageOHOS, device.segment(), format, imageUsage, grallocUsage); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetSwapchainGrallocUsageOHOS", e); }
    }

    /// Invokes `vkAcquireImageOHOS`.
    /// ```
    /// VkResult vkAcquireImageOHOS(VkDevice device, VkImage image, int32_t nativeFenceFd, VkSemaphore semaphore, VkFence fence);
    /// ```
    public static int vkAcquireImageOHOS(@NonNull VkDevice device, long image, int nativeFenceFd, long semaphore, long fence) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkAcquireImageOHOS)) throw new VKSymbolNotFoundError("Symbol not found: vkAcquireImageOHOS");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkAcquireImageOHOS", device, image, nativeFenceFd, semaphore, fence); }
        return (int) Handles.MH_vkAcquireImageOHOS.invokeExact(device.capabilities().PFN_vkAcquireImageOHOS, device.segment(), image, nativeFenceFd, semaphore, fence); }
        catch (Throwable e) { throw new RuntimeException("error in vkAcquireImageOHOS", e); }
    }

    /// Invokes `vkQueueSignalReleaseImageOHOS`.
    /// ```
    /// VkResult vkQueueSignalReleaseImageOHOS(VkQueue queue, uint32_t waitSemaphoreCount, const VkSemaphore* pWaitSemaphores, VkImage image, int32_t* pNativeFenceFd);
    /// ```
    public static int vkQueueSignalReleaseImageOHOS(@NonNull VkQueue queue, int waitSemaphoreCount, @NonNull MemorySegment pWaitSemaphores, long image, @NonNull MemorySegment pNativeFenceFd) {
        if (MemoryUtil.isNullPointer(queue.capabilities().PFN_vkQueueSignalReleaseImageOHOS)) throw new VKSymbolNotFoundError("Symbol not found: vkQueueSignalReleaseImageOHOS");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkQueueSignalReleaseImageOHOS", queue, waitSemaphoreCount, pWaitSemaphores, image, pNativeFenceFd); }
        return (int) Handles.MH_vkQueueSignalReleaseImageOHOS.invokeExact(queue.capabilities().PFN_vkQueueSignalReleaseImageOHOS, queue.segment(), waitSemaphoreCount, pWaitSemaphores, image, pNativeFenceFd); }
        catch (Throwable e) { throw new RuntimeException("error in vkQueueSignalReleaseImageOHOS", e); }
    }

}
