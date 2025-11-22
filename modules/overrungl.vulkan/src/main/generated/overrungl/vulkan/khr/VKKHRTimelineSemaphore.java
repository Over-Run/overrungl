// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.vulkan.*;
import static overrungl.internal.RuntimeHelper.*;
/// `VK_KHR_timeline_semaphore` - device extension
public final class VKKHRTimelineSemaphore {
    public static final int VK_KHR_TIMELINE_SEMAPHORE_SPEC_VERSION = 2;
    public static final String VK_KHR_TIMELINE_SEMAPHORE_EXTENSION_NAME = "VK_KHR_timeline_semaphore";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TIMELINE_SEMAPHORE_FEATURES_KHR = 1000207000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TIMELINE_SEMAPHORE_PROPERTIES_KHR = 1000207001;
    public static final int VK_STRUCTURE_TYPE_SEMAPHORE_TYPE_CREATE_INFO_KHR = 1000207002;
    public static final int VK_STRUCTURE_TYPE_TIMELINE_SEMAPHORE_SUBMIT_INFO_KHR = 1000207003;
    public static final int VK_STRUCTURE_TYPE_SEMAPHORE_WAIT_INFO_KHR = 1000207004;
    public static final int VK_STRUCTURE_TYPE_SEMAPHORE_SIGNAL_INFO_KHR = 1000207005;
    public static final int VK_SEMAPHORE_TYPE_BINARY_KHR = 0;
    public static final int VK_SEMAPHORE_TYPE_TIMELINE_KHR = 1;
    public static final int VK_SEMAPHORE_WAIT_ANY_BIT_KHR = 0x00000001;
    private VKKHRTimelineSemaphore() {}
    public static final class Handles {
        public static final MethodHandle MH_vkGetSemaphoreCounterValueKHR = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkWaitSemaphoresKHR = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG));
        public static final MethodHandle MH_vkSignalSemaphoreKHR = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        private Handles() {}
    }

    /// Invokes `vkGetSemaphoreCounterValueKHR`.
    /// ```
    /// VkResult vkGetSemaphoreCounterValueKHR(VkDevice device, VkSemaphore semaphore, uint64_t* pValue);
    /// ```
    public static int vkGetSemaphoreCounterValueKHR(@NonNull VkDevice device, long semaphore, @NonNull MemorySegment pValue) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkGetSemaphoreCounterValueKHR)) throw new VKSymbolNotFoundError("Symbol not found: vkGetSemaphoreCounterValueKHR");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkGetSemaphoreCounterValueKHR", device, semaphore, pValue); }
        return (int) Handles.MH_vkGetSemaphoreCounterValueKHR.invokeExact(device.capabilities().PFN_vkGetSemaphoreCounterValueKHR, device.segment(), semaphore, pValue); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetSemaphoreCounterValueKHR", e); }
    }

    /// Invokes `vkWaitSemaphoresKHR`.
    /// ```
    /// VkResult vkWaitSemaphoresKHR(VkDevice device, const VkSemaphoreWaitInfo* pWaitInfo, uint64_t timeout);
    /// ```
    public static int vkWaitSemaphoresKHR(@NonNull VkDevice device, @NonNull MemorySegment pWaitInfo, long timeout) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkWaitSemaphoresKHR)) throw new VKSymbolNotFoundError("Symbol not found: vkWaitSemaphoresKHR");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkWaitSemaphoresKHR", device, pWaitInfo, timeout); }
        return (int) Handles.MH_vkWaitSemaphoresKHR.invokeExact(device.capabilities().PFN_vkWaitSemaphoresKHR, device.segment(), pWaitInfo, timeout); }
        catch (Throwable e) { throw new RuntimeException("error in vkWaitSemaphoresKHR", e); }
    }

    /// Invokes `vkSignalSemaphoreKHR`.
    /// ```
    /// VkResult vkSignalSemaphoreKHR(VkDevice device, const VkSemaphoreSignalInfo* pSignalInfo);
    /// ```
    public static int vkSignalSemaphoreKHR(@NonNull VkDevice device, @NonNull MemorySegment pSignalInfo) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkSignalSemaphoreKHR)) throw new VKSymbolNotFoundError("Symbol not found: vkSignalSemaphoreKHR");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkSignalSemaphoreKHR", device, pSignalInfo); }
        return (int) Handles.MH_vkSignalSemaphoreKHR.invokeExact(device.capabilities().PFN_vkSignalSemaphoreKHR, device.segment(), pSignalInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkSignalSemaphoreKHR", e); }
    }

}
