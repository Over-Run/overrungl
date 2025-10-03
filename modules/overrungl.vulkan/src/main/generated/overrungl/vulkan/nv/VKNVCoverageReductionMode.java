// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.nv;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.vulkan.*;
import static overrungl.internal.RuntimeHelper.*;
/// `VK_NV_coverage_reduction_mode` - device extension
public final class VKNVCoverageReductionMode {
    public static final int VK_COVERAGE_REDUCTION_MODE_MERGE_NV = 0;
    public static final int VK_COVERAGE_REDUCTION_MODE_TRUNCATE_NV = 1;
    public static final int VK_NV_COVERAGE_REDUCTION_MODE_SPEC_VERSION = 1;
    public static final String VK_NV_COVERAGE_REDUCTION_MODE_EXTENSION_NAME = "VK_NV_coverage_reduction_mode";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COVERAGE_REDUCTION_MODE_FEATURES_NV = 1000250000;
    public static final int VK_STRUCTURE_TYPE_PIPELINE_COVERAGE_REDUCTION_STATE_CREATE_INFO_NV = 1000250001;
    public static final int VK_STRUCTURE_TYPE_FRAMEBUFFER_MIXED_SAMPLES_COMBINATION_NV = 1000250002;
    public static final class Handles {
        public static final MethodHandle MH_vkGetPhysicalDeviceSupportedFramebufferMixedSamplesCombinationsNV = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        private Handles() {}
    }

    private VKNVCoverageReductionMode() {}

    /// Invokes `vkGetPhysicalDeviceSupportedFramebufferMixedSamplesCombinationsNV`.
    /// ```
    /// (int) VkResult vkGetPhysicalDeviceSupportedFramebufferMixedSamplesCombinationsNV((struct VkPhysicalDevice*) VkPhysicalDevice physicalDevice, uint32_t* pCombinationCount, VkFramebufferMixedSamplesCombinationNV* pCombinations);
    /// ```
    public static int vkGetPhysicalDeviceSupportedFramebufferMixedSamplesCombinationsNV(@NonNull VkPhysicalDevice physicalDevice, @NonNull MemorySegment pCombinationCount, @NonNull MemorySegment pCombinations) {
        if (MemoryUtil.isNullPointer(physicalDevice.capabilities().PFN_vkGetPhysicalDeviceSupportedFramebufferMixedSamplesCombinationsNV)) throw new VKSymbolNotFoundError("Symbol not found: vkGetPhysicalDeviceSupportedFramebufferMixedSamplesCombinationsNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkGetPhysicalDeviceSupportedFramebufferMixedSamplesCombinationsNV", physicalDevice, pCombinationCount, pCombinations); }
        return (int) Handles.MH_vkGetPhysicalDeviceSupportedFramebufferMixedSamplesCombinationsNV.invokeExact(physicalDevice.capabilities().PFN_vkGetPhysicalDeviceSupportedFramebufferMixedSamplesCombinationsNV, physicalDevice.segment(), pCombinationCount, pCombinations); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetPhysicalDeviceSupportedFramebufferMixedSamplesCombinationsNV", e); }
    }

}
