// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext;
import java.lang.foreign.*;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.vulkan.*;
import static overrungl.internal.RuntimeHelper.*;
/// `VK_EXT_calibrated_timestamps` - device extension
public final class VKEXTCalibratedTimestamps {
    public static final int VK_EXT_CALIBRATED_TIMESTAMPS_SPEC_VERSION = 2;
    public static final String VK_EXT_CALIBRATED_TIMESTAMPS_EXTENSION_NAME = "VK_EXT_calibrated_timestamps";
    public static final int VK_STRUCTURE_TYPE_CALIBRATED_TIMESTAMP_INFO_EXT = 1000543000;
    public static final int VK_TIME_DOMAIN_DEVICE_EXT = 0;
    public static final int VK_TIME_DOMAIN_CLOCK_MONOTONIC_EXT = 1;
    public static final int VK_TIME_DOMAIN_CLOCK_MONOTONIC_RAW_EXT = 2;
    public static final int VK_TIME_DOMAIN_QUERY_PERFORMANCE_COUNTER_EXT = 3;
    public static final class Handles {
        public static final Supplier<MethodHandle> MH_vkGetPhysicalDeviceCalibrateableTimeDomainsEXT = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_vkGetCalibratedTimestampsEXT = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        private Handles() {}
    }

    private VKEXTCalibratedTimestamps() {}

    /// Invokes `vkGetPhysicalDeviceCalibrateableTimeDomainsEXT`.
    /// ```
    /// (int) VkResult vkGetPhysicalDeviceCalibrateableTimeDomainsEXT((struct VkPhysicalDevice*) VkPhysicalDevice physicalDevice, uint32_t* pTimeDomainCount, VkTimeDomainKHR* pTimeDomains);
    /// ```
    public static int vkGetPhysicalDeviceCalibrateableTimeDomainsEXT(@NonNull VkPhysicalDevice physicalDevice, @NonNull MemorySegment pTimeDomainCount, @NonNull MemorySegment pTimeDomains) {
        if (MemoryUtil.isNullPointer(physicalDevice.capabilities().PFN_vkGetPhysicalDeviceCalibrateableTimeDomainsEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkGetPhysicalDeviceCalibrateableTimeDomainsEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkGetPhysicalDeviceCalibrateableTimeDomainsEXT", physicalDevice, pTimeDomainCount, pTimeDomains); }
        return (int) Handles.MH_vkGetPhysicalDeviceCalibrateableTimeDomainsEXT.get().invokeExact(physicalDevice.capabilities().PFN_vkGetPhysicalDeviceCalibrateableTimeDomainsEXT, physicalDevice.segment(), pTimeDomainCount, pTimeDomains); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetPhysicalDeviceCalibrateableTimeDomainsEXT", e); }
    }

    /// Invokes `vkGetCalibratedTimestampsEXT`.
    /// ```
    /// (int) VkResult vkGetCalibratedTimestampsEXT((struct VkDevice*) VkDevice device, uint32_t timestampCount, const VkCalibratedTimestampInfoKHR* pTimestampInfos, uint64_t* pTimestamps, uint64_t* pMaxDeviation);
    /// ```
    public static int vkGetCalibratedTimestampsEXT(@NonNull VkDevice device, int timestampCount, @NonNull MemorySegment pTimestampInfos, @NonNull MemorySegment pTimestamps, @NonNull MemorySegment pMaxDeviation) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkGetCalibratedTimestampsEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkGetCalibratedTimestampsEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkGetCalibratedTimestampsEXT", device, timestampCount, pTimestampInfos, pTimestamps, pMaxDeviation); }
        return (int) Handles.MH_vkGetCalibratedTimestampsEXT.get().invokeExact(device.capabilities().PFN_vkGetCalibratedTimestampsEXT, device.segment(), timestampCount, pTimestampInfos, pTimestamps, pMaxDeviation); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetCalibratedTimestampsEXT", e); }
    }

}
