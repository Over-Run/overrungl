// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext;
import java.lang.foreign.*;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.vulkan.*;
import static overrungl.internal.RuntimeHelper.*;
/// `VK_EXT_pipeline_properties` - device extension
public final class VKEXTPipelineProperties {
    public static final int VK_EXT_PIPELINE_PROPERTIES_SPEC_VERSION = 1;
    public static final String VK_EXT_PIPELINE_PROPERTIES_EXTENSION_NAME = "VK_EXT_pipeline_properties";
    public static final int VK_STRUCTURE_TYPE_PIPELINE_PROPERTIES_IDENTIFIER_EXT = 1000372000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_PROPERTIES_FEATURES_EXT = 1000372001;
    public static final int VK_STRUCTURE_TYPE_PIPELINE_INFO_EXT = 1000269001;
    public static final class Handles {
        public static final Supplier<MethodHandle> MH_vkGetPipelinePropertiesEXT = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        private Handles() {}
    }

    private VKEXTPipelineProperties() {}

    /// Invokes `vkGetPipelinePropertiesEXT`.
    /// ```
    /// (int) VkResult vkGetPipelinePropertiesEXT((struct VkDevice*) VkDevice device, const VkPipelineInfoEXT* pPipelineInfo, VkBaseOutStructure* pPipelineProperties);
    /// ```
    public static int vkGetPipelinePropertiesEXT(@NonNull VkDevice device, @NonNull MemorySegment pPipelineInfo, @NonNull MemorySegment pPipelineProperties) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkGetPipelinePropertiesEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkGetPipelinePropertiesEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkGetPipelinePropertiesEXT", device, pPipelineInfo, pPipelineProperties); }
        return (int) Handles.MH_vkGetPipelinePropertiesEXT.get().invokeExact(device.capabilities().PFN_vkGetPipelinePropertiesEXT, device.segment(), pPipelineInfo, pPipelineProperties); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetPipelinePropertiesEXT", e); }
    }

}
