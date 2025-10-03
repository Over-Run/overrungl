// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext;
import java.lang.foreign.*;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.vulkan.*;
import static overrungl.internal.RuntimeHelper.*;
/// `VK_EXT_tooling_info` - device extension
public final class VKEXTToolingInfo {
    public static final int VK_EXT_TOOLING_INFO_SPEC_VERSION = 1;
    public static final String VK_EXT_TOOLING_INFO_EXTENSION_NAME = "VK_EXT_tooling_info";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TOOL_PROPERTIES_EXT = 1000245000;
    public static final int VK_TOOL_PURPOSE_VALIDATION_BIT_EXT = 0x00000001;
    public static final int VK_TOOL_PURPOSE_PROFILING_BIT_EXT = 0x00000002;
    public static final int VK_TOOL_PURPOSE_TRACING_BIT_EXT = 0x00000004;
    public static final int VK_TOOL_PURPOSE_ADDITIONAL_FEATURES_BIT_EXT = 0x00000008;
    public static final int VK_TOOL_PURPOSE_MODIFYING_FEATURES_BIT_EXT = 0x00000010;
    public static final int VK_TOOL_PURPOSE_DEBUG_REPORTING_BIT_EXT = 0x00000020;
    public static final int VK_TOOL_PURPOSE_DEBUG_MARKERS_BIT_EXT = 0x00000040;
    public static final class Handles {
        public static final Supplier<MethodHandle> MH_vkGetPhysicalDeviceToolPropertiesEXT = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        private Handles() {}
    }

    private VKEXTToolingInfo() {}

    /// Invokes `vkGetPhysicalDeviceToolPropertiesEXT`.
    /// ```
    /// (int) VkResult vkGetPhysicalDeviceToolPropertiesEXT((struct VkPhysicalDevice*) VkPhysicalDevice physicalDevice, uint32_t* pToolCount, VkPhysicalDeviceToolProperties* pToolProperties);
    /// ```
    public static int vkGetPhysicalDeviceToolPropertiesEXT(@NonNull VkPhysicalDevice physicalDevice, @NonNull MemorySegment pToolCount, @NonNull MemorySegment pToolProperties) {
        if (MemoryUtil.isNullPointer(physicalDevice.capabilities().PFN_vkGetPhysicalDeviceToolPropertiesEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkGetPhysicalDeviceToolPropertiesEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkGetPhysicalDeviceToolPropertiesEXT", physicalDevice, pToolCount, pToolProperties); }
        return (int) Handles.MH_vkGetPhysicalDeviceToolPropertiesEXT.get().invokeExact(physicalDevice.capabilities().PFN_vkGetPhysicalDeviceToolPropertiesEXT, physicalDevice.segment(), pToolCount, pToolProperties); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetPhysicalDeviceToolPropertiesEXT", e); }
    }

}
