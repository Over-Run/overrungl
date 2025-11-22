// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.arm;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.vulkan.*;
import static overrungl.internal.RuntimeHelper.*;
/// `VK_ARM_performance_counters_by_region` - device extension
public final class VKARMPerformanceCountersByRegion {
    public static final int VK_ARM_PERFORMANCE_COUNTERS_BY_REGION_SPEC_VERSION = 1;
    public static final String VK_ARM_PERFORMANCE_COUNTERS_BY_REGION_EXTENSION_NAME = "VK_ARM_performance_counters_by_region";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PERFORMANCE_COUNTERS_BY_REGION_FEATURES_ARM = 1000605000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PERFORMANCE_COUNTERS_BY_REGION_PROPERTIES_ARM = 1000605001;
    public static final int VK_STRUCTURE_TYPE_PERFORMANCE_COUNTER_ARM = 1000605002;
    public static final int VK_STRUCTURE_TYPE_PERFORMANCE_COUNTER_DESCRIPTION_ARM = 1000605003;
    public static final int VK_STRUCTURE_TYPE_RENDER_PASS_PERFORMANCE_COUNTERS_BY_REGION_BEGIN_INFO_ARM = 1000605004;
    private VKARMPerformanceCountersByRegion() {}
    public static final class Handles {
        public static final MethodHandle MH_vkEnumeratePhysicalDeviceQueueFamilyPerformanceCountersByRegionARM = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        private Handles() {}
    }

    /// Invokes `vkEnumeratePhysicalDeviceQueueFamilyPerformanceCountersByRegionARM`.
    /// ```
    /// VkResult vkEnumeratePhysicalDeviceQueueFamilyPerformanceCountersByRegionARM(VkPhysicalDevice physicalDevice, uint32_t queueFamilyIndex, uint32_t* pCounterCount, VkPerformanceCounterARM* pCounters, VkPerformanceCounterDescriptionARM* pCounterDescriptions);
    /// ```
    public static int vkEnumeratePhysicalDeviceQueueFamilyPerformanceCountersByRegionARM(@NonNull VkPhysicalDevice physicalDevice, int queueFamilyIndex, @NonNull MemorySegment pCounterCount, @NonNull MemorySegment pCounters, @NonNull MemorySegment pCounterDescriptions) {
        if (MemoryUtil.isNullPointer(physicalDevice.capabilities().PFN_vkEnumeratePhysicalDeviceQueueFamilyPerformanceCountersByRegionARM)) throw new VKSymbolNotFoundError("Symbol not found: vkEnumeratePhysicalDeviceQueueFamilyPerformanceCountersByRegionARM");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkEnumeratePhysicalDeviceQueueFamilyPerformanceCountersByRegionARM", physicalDevice, queueFamilyIndex, pCounterCount, pCounters, pCounterDescriptions); }
        return (int) Handles.MH_vkEnumeratePhysicalDeviceQueueFamilyPerformanceCountersByRegionARM.invokeExact(physicalDevice.capabilities().PFN_vkEnumeratePhysicalDeviceQueueFamilyPerformanceCountersByRegionARM, physicalDevice.segment(), queueFamilyIndex, pCounterCount, pCounters, pCounterDescriptions); }
        catch (Throwable e) { throw new RuntimeException("error in vkEnumeratePhysicalDeviceQueueFamilyPerformanceCountersByRegionARM", e); }
    }

}
