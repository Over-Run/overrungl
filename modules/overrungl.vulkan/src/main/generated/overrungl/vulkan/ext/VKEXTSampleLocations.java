// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext;
import java.lang.foreign.*;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.vulkan.*;
import static overrungl.internal.RuntimeHelper.*;
/// `VK_EXT_sample_locations` - device extension
public final class VKEXTSampleLocations {
    public static final int VK_EXT_SAMPLE_LOCATIONS_SPEC_VERSION = 1;
    public static final String VK_EXT_SAMPLE_LOCATIONS_EXTENSION_NAME = "VK_EXT_sample_locations";
    public static final int VK_IMAGE_CREATE_SAMPLE_LOCATIONS_COMPATIBLE_DEPTH_BIT_EXT = 0x00001000;
    public static final int VK_STRUCTURE_TYPE_SAMPLE_LOCATIONS_INFO_EXT = 1000143000;
    public static final int VK_STRUCTURE_TYPE_RENDER_PASS_SAMPLE_LOCATIONS_BEGIN_INFO_EXT = 1000143001;
    public static final int VK_STRUCTURE_TYPE_PIPELINE_SAMPLE_LOCATIONS_STATE_CREATE_INFO_EXT = 1000143002;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SAMPLE_LOCATIONS_PROPERTIES_EXT = 1000143003;
    public static final int VK_STRUCTURE_TYPE_MULTISAMPLE_PROPERTIES_EXT = 1000143004;
    public static final int VK_DYNAMIC_STATE_SAMPLE_LOCATIONS_EXT = 1000143000;
    public static final class Handles {
        public static final Supplier<MethodHandle> MH_vkCmdSetSampleLocationsEXT = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_vkGetPhysicalDeviceMultisamplePropertiesEXT = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        private Handles() {}
    }

    private VKEXTSampleLocations() {}

    /// Invokes `vkCmdSetSampleLocationsEXT`.
    /// ```
    /// void vkCmdSetSampleLocationsEXT((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, const VkSampleLocationsInfoEXT* pSampleLocationsInfo);
    /// ```
    public static void vkCmdSetSampleLocationsEXT(@NonNull VkCommandBuffer commandBuffer, @NonNull MemorySegment pSampleLocationsInfo) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetSampleLocationsEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdSetSampleLocationsEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdSetSampleLocationsEXT", commandBuffer, pSampleLocationsInfo); }
        Handles.MH_vkCmdSetSampleLocationsEXT.get().invokeExact(commandBuffer.capabilities().PFN_vkCmdSetSampleLocationsEXT, commandBuffer.segment(), pSampleLocationsInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetSampleLocationsEXT", e); }
    }

    /// Invokes `vkGetPhysicalDeviceMultisamplePropertiesEXT`.
    /// ```
    /// void vkGetPhysicalDeviceMultisamplePropertiesEXT((struct VkPhysicalDevice*) VkPhysicalDevice physicalDevice, (int) VkSampleCountFlagBits samples, VkMultisamplePropertiesEXT* pMultisampleProperties);
    /// ```
    public static void vkGetPhysicalDeviceMultisamplePropertiesEXT(@NonNull VkPhysicalDevice physicalDevice, int samples, @NonNull MemorySegment pMultisampleProperties) {
        if (MemoryUtil.isNullPointer(physicalDevice.capabilities().PFN_vkGetPhysicalDeviceMultisamplePropertiesEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkGetPhysicalDeviceMultisamplePropertiesEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkGetPhysicalDeviceMultisamplePropertiesEXT", physicalDevice, samples, pMultisampleProperties); }
        Handles.MH_vkGetPhysicalDeviceMultisamplePropertiesEXT.get().invokeExact(physicalDevice.capabilities().PFN_vkGetPhysicalDeviceMultisamplePropertiesEXT, physicalDevice.segment(), samples, pMultisampleProperties); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetPhysicalDeviceMultisamplePropertiesEXT", e); }
    }

}
