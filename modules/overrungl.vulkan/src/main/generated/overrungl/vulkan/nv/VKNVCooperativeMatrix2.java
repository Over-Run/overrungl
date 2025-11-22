// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.nv;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.vulkan.*;
import static overrungl.internal.RuntimeHelper.*;
/// `VK_NV_cooperative_matrix2` - device extension
public final class VKNVCooperativeMatrix2 {
    public static final int VK_NV_COOPERATIVE_MATRIX_2_SPEC_VERSION = 1;
    public static final String VK_NV_COOPERATIVE_MATRIX_2_EXTENSION_NAME = "VK_NV_cooperative_matrix2";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COOPERATIVE_MATRIX_2_FEATURES_NV = 1000593000;
    public static final int VK_STRUCTURE_TYPE_COOPERATIVE_MATRIX_FLEXIBLE_DIMENSIONS_PROPERTIES_NV = 1000593001;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COOPERATIVE_MATRIX_2_PROPERTIES_NV = 1000593002;
    private VKNVCooperativeMatrix2() {}
    public static final class Handles {
        public static final MethodHandle MH_vkGetPhysicalDeviceCooperativeMatrixFlexibleDimensionsPropertiesNV = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        private Handles() {}
    }

    /// Invokes `vkGetPhysicalDeviceCooperativeMatrixFlexibleDimensionsPropertiesNV`.
    /// ```
    /// VkResult vkGetPhysicalDeviceCooperativeMatrixFlexibleDimensionsPropertiesNV(VkPhysicalDevice physicalDevice, uint32_t* pPropertyCount, VkCooperativeMatrixFlexibleDimensionsPropertiesNV* pProperties);
    /// ```
    public static int vkGetPhysicalDeviceCooperativeMatrixFlexibleDimensionsPropertiesNV(@NonNull VkPhysicalDevice physicalDevice, @NonNull MemorySegment pPropertyCount, @NonNull MemorySegment pProperties) {
        if (MemoryUtil.isNullPointer(physicalDevice.capabilities().PFN_vkGetPhysicalDeviceCooperativeMatrixFlexibleDimensionsPropertiesNV)) throw new VKSymbolNotFoundError("Symbol not found: vkGetPhysicalDeviceCooperativeMatrixFlexibleDimensionsPropertiesNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkGetPhysicalDeviceCooperativeMatrixFlexibleDimensionsPropertiesNV", physicalDevice, pPropertyCount, pProperties); }
        return (int) Handles.MH_vkGetPhysicalDeviceCooperativeMatrixFlexibleDimensionsPropertiesNV.invokeExact(physicalDevice.capabilities().PFN_vkGetPhysicalDeviceCooperativeMatrixFlexibleDimensionsPropertiesNV, physicalDevice.segment(), pPropertyCount, pProperties); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetPhysicalDeviceCooperativeMatrixFlexibleDimensionsPropertiesNV", e); }
    }

}
