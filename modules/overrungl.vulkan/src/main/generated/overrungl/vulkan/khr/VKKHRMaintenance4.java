// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.vulkan.*;
import static overrungl.internal.RuntimeHelper.*;
/// `VK_KHR_maintenance4` - device extension
public final class VKKHRMaintenance4 {
    public static final int VK_KHR_MAINTENANCE_4_SPEC_VERSION = 2;
    public static final String VK_KHR_MAINTENANCE_4_EXTENSION_NAME = "VK_KHR_maintenance4";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_4_FEATURES_KHR = 1000413000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_4_PROPERTIES_KHR = 1000413001;
    public static final int VK_STRUCTURE_TYPE_DEVICE_BUFFER_MEMORY_REQUIREMENTS_KHR = 1000413002;
    public static final int VK_STRUCTURE_TYPE_DEVICE_IMAGE_MEMORY_REQUIREMENTS_KHR = 1000413003;
    public static final int VK_IMAGE_ASPECT_NONE_KHR = 0;
    public static final class Handles {
        public static final MethodHandle MH_vkGetDeviceBufferMemoryRequirementsKHR = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetDeviceImageMemoryRequirementsKHR = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetDeviceImageSparseMemoryRequirementsKHR = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        private Handles() {}
    }

    private VKKHRMaintenance4() {}

    /// Invokes `vkGetDeviceBufferMemoryRequirementsKHR`.
    /// ```
    /// void vkGetDeviceBufferMemoryRequirementsKHR((struct VkDevice*) VkDevice device, const VkDeviceBufferMemoryRequirements* pInfo, VkMemoryRequirements2* pMemoryRequirements);
    /// ```
    public static void vkGetDeviceBufferMemoryRequirementsKHR(@NonNull VkDevice device, @NonNull MemorySegment pInfo, @NonNull MemorySegment pMemoryRequirements) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkGetDeviceBufferMemoryRequirementsKHR)) throw new VKSymbolNotFoundError("Symbol not found: vkGetDeviceBufferMemoryRequirementsKHR");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkGetDeviceBufferMemoryRequirementsKHR", device, pInfo, pMemoryRequirements); }
        Handles.MH_vkGetDeviceBufferMemoryRequirementsKHR.invokeExact(device.capabilities().PFN_vkGetDeviceBufferMemoryRequirementsKHR, device.segment(), pInfo, pMemoryRequirements); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetDeviceBufferMemoryRequirementsKHR", e); }
    }

    /// Invokes `vkGetDeviceImageMemoryRequirementsKHR`.
    /// ```
    /// void vkGetDeviceImageMemoryRequirementsKHR((struct VkDevice*) VkDevice device, const VkDeviceImageMemoryRequirements* pInfo, VkMemoryRequirements2* pMemoryRequirements);
    /// ```
    public static void vkGetDeviceImageMemoryRequirementsKHR(@NonNull VkDevice device, @NonNull MemorySegment pInfo, @NonNull MemorySegment pMemoryRequirements) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkGetDeviceImageMemoryRequirementsKHR)) throw new VKSymbolNotFoundError("Symbol not found: vkGetDeviceImageMemoryRequirementsKHR");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkGetDeviceImageMemoryRequirementsKHR", device, pInfo, pMemoryRequirements); }
        Handles.MH_vkGetDeviceImageMemoryRequirementsKHR.invokeExact(device.capabilities().PFN_vkGetDeviceImageMemoryRequirementsKHR, device.segment(), pInfo, pMemoryRequirements); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetDeviceImageMemoryRequirementsKHR", e); }
    }

    /// Invokes `vkGetDeviceImageSparseMemoryRequirementsKHR`.
    /// ```
    /// void vkGetDeviceImageSparseMemoryRequirementsKHR((struct VkDevice*) VkDevice device, const VkDeviceImageMemoryRequirements* pInfo, uint32_t* pSparseMemoryRequirementCount, VkSparseImageMemoryRequirements2* pSparseMemoryRequirements);
    /// ```
    public static void vkGetDeviceImageSparseMemoryRequirementsKHR(@NonNull VkDevice device, @NonNull MemorySegment pInfo, @NonNull MemorySegment pSparseMemoryRequirementCount, @NonNull MemorySegment pSparseMemoryRequirements) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkGetDeviceImageSparseMemoryRequirementsKHR)) throw new VKSymbolNotFoundError("Symbol not found: vkGetDeviceImageSparseMemoryRequirementsKHR");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkGetDeviceImageSparseMemoryRequirementsKHR", device, pInfo, pSparseMemoryRequirementCount, pSparseMemoryRequirements); }
        Handles.MH_vkGetDeviceImageSparseMemoryRequirementsKHR.invokeExact(device.capabilities().PFN_vkGetDeviceImageSparseMemoryRequirementsKHR, device.segment(), pInfo, pSparseMemoryRequirementCount, pSparseMemoryRequirements); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetDeviceImageSparseMemoryRequirementsKHR", e); }
    }

}
