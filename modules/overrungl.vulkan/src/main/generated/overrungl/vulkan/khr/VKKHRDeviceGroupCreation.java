// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr;
import java.lang.foreign.*;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.vulkan.*;
import static overrungl.internal.RuntimeHelper.*;
/// `VK_KHR_device_group_creation` - instance extension
public final class VKKHRDeviceGroupCreation {
    public static final int VK_KHR_DEVICE_GROUP_CREATION_SPEC_VERSION = 1;
    public static final String VK_KHR_DEVICE_GROUP_CREATION_EXTENSION_NAME = "VK_KHR_device_group_creation";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_GROUP_PROPERTIES_KHR = 1000070000;
    public static final int VK_STRUCTURE_TYPE_DEVICE_GROUP_DEVICE_CREATE_INFO_KHR = 1000070001;
    public static final int VK_MAX_DEVICE_GROUP_SIZE_KHR = 32;
    public static final int VK_MEMORY_HEAP_MULTI_INSTANCE_BIT_KHR = 0x00000002;
    public static final class Handles {
        public static final Supplier<MethodHandle> MH_vkEnumeratePhysicalDeviceGroupsKHR = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        private Handles() {}
    }

    private VKKHRDeviceGroupCreation() {}

    /// Invokes `vkEnumeratePhysicalDeviceGroupsKHR`.
    /// ```
    /// (int) VkResult vkEnumeratePhysicalDeviceGroupsKHR((struct VkInstance*) VkInstance instance, uint32_t* pPhysicalDeviceGroupCount, VkPhysicalDeviceGroupProperties* pPhysicalDeviceGroupProperties);
    /// ```
    public static int vkEnumeratePhysicalDeviceGroupsKHR(@NonNull VkInstance instance, @NonNull MemorySegment pPhysicalDeviceGroupCount, @NonNull MemorySegment pPhysicalDeviceGroupProperties) {
        if (MemoryUtil.isNullPointer(instance.capabilities().PFN_vkEnumeratePhysicalDeviceGroupsKHR)) throw new VKSymbolNotFoundError("Symbol not found: vkEnumeratePhysicalDeviceGroupsKHR");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkEnumeratePhysicalDeviceGroupsKHR", instance, pPhysicalDeviceGroupCount, pPhysicalDeviceGroupProperties); }
        return (int) Handles.MH_vkEnumeratePhysicalDeviceGroupsKHR.get().invokeExact(instance.capabilities().PFN_vkEnumeratePhysicalDeviceGroupsKHR, instance.segment(), pPhysicalDeviceGroupCount, pPhysicalDeviceGroupProperties); }
        catch (Throwable e) { throw new RuntimeException("error in vkEnumeratePhysicalDeviceGroupsKHR", e); }
    }

}
