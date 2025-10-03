// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.vulkan.*;
import static overrungl.internal.RuntimeHelper.*;
/// `VK_KHR_calibrated_timestamps` - device extension
public final class VKKHRCalibratedTimestamps {
    public static final int VK_TIME_DOMAIN_DEVICE_KHR = 0;
    public static final int VK_TIME_DOMAIN_CLOCK_MONOTONIC_KHR = 1;
    public static final int VK_TIME_DOMAIN_CLOCK_MONOTONIC_RAW_KHR = 2;
    public static final int VK_TIME_DOMAIN_QUERY_PERFORMANCE_COUNTER_KHR = 3;
    public static final int VK_KHR_CALIBRATED_TIMESTAMPS_SPEC_VERSION = 1;
    public static final String VK_KHR_CALIBRATED_TIMESTAMPS_EXTENSION_NAME = "VK_KHR_calibrated_timestamps";
    public static final int VK_STRUCTURE_TYPE_CALIBRATED_TIMESTAMP_INFO_KHR = 1000543000;
    public static final class Handles {
        public static final MethodHandle MH_vkGetPhysicalDeviceCalibrateableTimeDomainsKHR = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetCalibratedTimestampsKHR = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        private Handles() {}
    }

    private VKKHRCalibratedTimestamps() {}

    /// Invokes `vkGetPhysicalDeviceCalibrateableTimeDomainsKHR`.
    /// ```
    /// (int) VkResult vkGetPhysicalDeviceCalibrateableTimeDomainsKHR((struct VkPhysicalDevice*) VkPhysicalDevice physicalDevice, uint32_t* pTimeDomainCount, VkTimeDomainKHR* pTimeDomains);
    /// ```
    public static int vkGetPhysicalDeviceCalibrateableTimeDomainsKHR(@NonNull VkPhysicalDevice physicalDevice, @NonNull MemorySegment pTimeDomainCount, @NonNull MemorySegment pTimeDomains) {
        if (MemoryUtil.isNullPointer(physicalDevice.capabilities().PFN_vkGetPhysicalDeviceCalibrateableTimeDomainsKHR)) throw new VKSymbolNotFoundError("Symbol not found: vkGetPhysicalDeviceCalibrateableTimeDomainsKHR");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkGetPhysicalDeviceCalibrateableTimeDomainsKHR", physicalDevice, pTimeDomainCount, pTimeDomains); }
        return (int) Handles.MH_vkGetPhysicalDeviceCalibrateableTimeDomainsKHR.invokeExact(physicalDevice.capabilities().PFN_vkGetPhysicalDeviceCalibrateableTimeDomainsKHR, physicalDevice.segment(), pTimeDomainCount, pTimeDomains); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetPhysicalDeviceCalibrateableTimeDomainsKHR", e); }
    }

    /// Invokes `vkGetCalibratedTimestampsKHR`.
    /// ```
    /// (int) VkResult vkGetCalibratedTimestampsKHR((struct VkDevice*) VkDevice device, uint32_t timestampCount, const VkCalibratedTimestampInfoKHR* pTimestampInfos, uint64_t* pTimestamps, uint64_t* pMaxDeviation);
    /// ```
    public static int vkGetCalibratedTimestampsKHR(@NonNull VkDevice device, int timestampCount, @NonNull MemorySegment pTimestampInfos, @NonNull MemorySegment pTimestamps, @NonNull MemorySegment pMaxDeviation) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkGetCalibratedTimestampsKHR)) throw new VKSymbolNotFoundError("Symbol not found: vkGetCalibratedTimestampsKHR");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkGetCalibratedTimestampsKHR", device, timestampCount, pTimestampInfos, pTimestamps, pMaxDeviation); }
        return (int) Handles.MH_vkGetCalibratedTimestampsKHR.invokeExact(device.capabilities().PFN_vkGetCalibratedTimestampsKHR, device.segment(), timestampCount, pTimestampInfos, pTimestamps, pMaxDeviation); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetCalibratedTimestampsKHR", e); }
    }

}
