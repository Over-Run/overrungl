// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.vulkan.*;
import static overrungl.internal.RuntimeHelper.*;
/// `VK_KHR_pipeline_executable_properties` - device extension
public final class VKKHRPipelineExecutableProperties {
    public static final int VK_KHR_PIPELINE_EXECUTABLE_PROPERTIES_SPEC_VERSION = 1;
    public static final String VK_KHR_PIPELINE_EXECUTABLE_PROPERTIES_EXTENSION_NAME = "VK_KHR_pipeline_executable_properties";
    public static final int VK_PIPELINE_EXECUTABLE_STATISTIC_FORMAT_BOOL32_KHR = 0;
    public static final int VK_PIPELINE_EXECUTABLE_STATISTIC_FORMAT_INT64_KHR = 1;
    public static final int VK_PIPELINE_EXECUTABLE_STATISTIC_FORMAT_UINT64_KHR = 2;
    public static final int VK_PIPELINE_EXECUTABLE_STATISTIC_FORMAT_FLOAT64_KHR = 3;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_EXECUTABLE_PROPERTIES_FEATURES_KHR = 1000269000;
    public static final int VK_STRUCTURE_TYPE_PIPELINE_INFO_KHR = 1000269001;
    public static final int VK_STRUCTURE_TYPE_PIPELINE_EXECUTABLE_PROPERTIES_KHR = 1000269002;
    public static final int VK_STRUCTURE_TYPE_PIPELINE_EXECUTABLE_INFO_KHR = 1000269003;
    public static final int VK_STRUCTURE_TYPE_PIPELINE_EXECUTABLE_STATISTIC_KHR = 1000269004;
    public static final int VK_STRUCTURE_TYPE_PIPELINE_EXECUTABLE_INTERNAL_REPRESENTATION_KHR = 1000269005;
    public static final int VK_PIPELINE_CREATE_CAPTURE_STATISTICS_BIT_KHR = 0x00000040;
    public static final int VK_PIPELINE_CREATE_CAPTURE_INTERNAL_REPRESENTATIONS_BIT_KHR = 0x00000080;
    private VKKHRPipelineExecutableProperties() {}
    public static final class Handles {
        public static final MethodHandle MH_vkGetPipelineExecutablePropertiesKHR = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetPipelineExecutableStatisticsKHR = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetPipelineExecutableInternalRepresentationsKHR = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        private Handles() {}
    }

    /// Invokes `vkGetPipelineExecutablePropertiesKHR`.
    /// ```
    /// VkResult vkGetPipelineExecutablePropertiesKHR(VkDevice device, const VkPipelineInfoKHR* pPipelineInfo, uint32_t* pExecutableCount, VkPipelineExecutablePropertiesKHR* pProperties);
    /// ```
    public static int vkGetPipelineExecutablePropertiesKHR(@NonNull VkDevice device, @NonNull MemorySegment pPipelineInfo, @NonNull MemorySegment pExecutableCount, @NonNull MemorySegment pProperties) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkGetPipelineExecutablePropertiesKHR)) throw new VKSymbolNotFoundError("Symbol not found: vkGetPipelineExecutablePropertiesKHR");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkGetPipelineExecutablePropertiesKHR", device, pPipelineInfo, pExecutableCount, pProperties); }
        return (int) Handles.MH_vkGetPipelineExecutablePropertiesKHR.invokeExact(device.capabilities().PFN_vkGetPipelineExecutablePropertiesKHR, device.segment(), pPipelineInfo, pExecutableCount, pProperties); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetPipelineExecutablePropertiesKHR", e); }
    }

    /// Invokes `vkGetPipelineExecutableStatisticsKHR`.
    /// ```
    /// VkResult vkGetPipelineExecutableStatisticsKHR(VkDevice device, const VkPipelineExecutableInfoKHR* pExecutableInfo, uint32_t* pStatisticCount, VkPipelineExecutableStatisticKHR* pStatistics);
    /// ```
    public static int vkGetPipelineExecutableStatisticsKHR(@NonNull VkDevice device, @NonNull MemorySegment pExecutableInfo, @NonNull MemorySegment pStatisticCount, @NonNull MemorySegment pStatistics) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkGetPipelineExecutableStatisticsKHR)) throw new VKSymbolNotFoundError("Symbol not found: vkGetPipelineExecutableStatisticsKHR");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkGetPipelineExecutableStatisticsKHR", device, pExecutableInfo, pStatisticCount, pStatistics); }
        return (int) Handles.MH_vkGetPipelineExecutableStatisticsKHR.invokeExact(device.capabilities().PFN_vkGetPipelineExecutableStatisticsKHR, device.segment(), pExecutableInfo, pStatisticCount, pStatistics); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetPipelineExecutableStatisticsKHR", e); }
    }

    /// Invokes `vkGetPipelineExecutableInternalRepresentationsKHR`.
    /// ```
    /// VkResult vkGetPipelineExecutableInternalRepresentationsKHR(VkDevice device, const VkPipelineExecutableInfoKHR* pExecutableInfo, uint32_t* pInternalRepresentationCount, VkPipelineExecutableInternalRepresentationKHR* pInternalRepresentations);
    /// ```
    public static int vkGetPipelineExecutableInternalRepresentationsKHR(@NonNull VkDevice device, @NonNull MemorySegment pExecutableInfo, @NonNull MemorySegment pInternalRepresentationCount, @NonNull MemorySegment pInternalRepresentations) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkGetPipelineExecutableInternalRepresentationsKHR)) throw new VKSymbolNotFoundError("Symbol not found: vkGetPipelineExecutableInternalRepresentationsKHR");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkGetPipelineExecutableInternalRepresentationsKHR", device, pExecutableInfo, pInternalRepresentationCount, pInternalRepresentations); }
        return (int) Handles.MH_vkGetPipelineExecutableInternalRepresentationsKHR.invokeExact(device.capabilities().PFN_vkGetPipelineExecutableInternalRepresentationsKHR, device.segment(), pExecutableInfo, pInternalRepresentationCount, pInternalRepresentations); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetPipelineExecutableInternalRepresentationsKHR", e); }
    }

}
