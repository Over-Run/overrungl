// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr;
import java.lang.foreign.*;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.vulkan.*;
import static overrungl.internal.RuntimeHelper.*;
/// `VK_KHR_maintenance3` - device extension
public final class VKKHRMaintenance3 {
    public static final int VK_KHR_MAINTENANCE_3_SPEC_VERSION = 1;
    public static final String VK_KHR_MAINTENANCE_3_EXTENSION_NAME = "VK_KHR_maintenance3";
    public static final int VK_KHR_MAINTENANCE3_SPEC_VERSION = 1;
    public static final String VK_KHR_MAINTENANCE3_EXTENSION_NAME = "VK_KHR_maintenance3";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_3_PROPERTIES_KHR = 1000168000;
    public static final int VK_STRUCTURE_TYPE_DESCRIPTOR_SET_LAYOUT_SUPPORT_KHR = 1000168001;
    public static final class Handles {
        public static final Supplier<MethodHandle> MH_vkGetDescriptorSetLayoutSupportKHR = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        private Handles() {}
    }

    private VKKHRMaintenance3() {}

    /// Invokes `vkGetDescriptorSetLayoutSupportKHR`.
    /// ```
    /// void vkGetDescriptorSetLayoutSupportKHR((struct VkDevice*) VkDevice device, const VkDescriptorSetLayoutCreateInfo* pCreateInfo, VkDescriptorSetLayoutSupport* pSupport);
    /// ```
    public static void vkGetDescriptorSetLayoutSupportKHR(@NonNull VkDevice device, @NonNull MemorySegment pCreateInfo, @NonNull MemorySegment pSupport) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkGetDescriptorSetLayoutSupportKHR)) throw new VKSymbolNotFoundError("Symbol not found: vkGetDescriptorSetLayoutSupportKHR");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkGetDescriptorSetLayoutSupportKHR", device, pCreateInfo, pSupport); }
        Handles.MH_vkGetDescriptorSetLayoutSupportKHR.get().invokeExact(device.capabilities().PFN_vkGetDescriptorSetLayoutSupportKHR, device.segment(), pCreateInfo, pSupport); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetDescriptorSetLayoutSupportKHR", e); }
    }

}
