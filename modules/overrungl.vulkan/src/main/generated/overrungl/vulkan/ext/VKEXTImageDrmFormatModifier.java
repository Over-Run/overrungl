// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext;
import java.lang.foreign.*;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.vulkan.*;
import static overrungl.internal.RuntimeHelper.*;
/// `VK_EXT_image_drm_format_modifier` - device extension
public final class VKEXTImageDrmFormatModifier {
    public static final int VK_EXT_IMAGE_DRM_FORMAT_MODIFIER_SPEC_VERSION = 2;
    public static final String VK_EXT_IMAGE_DRM_FORMAT_MODIFIER_EXTENSION_NAME = "VK_EXT_image_drm_format_modifier";
    public static final int VK_ERROR_INVALID_DRM_FORMAT_MODIFIER_PLANE_LAYOUT_EXT = -1000158000;
    public static final int VK_STRUCTURE_TYPE_DRM_FORMAT_MODIFIER_PROPERTIES_LIST_EXT = 1000158000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_DRM_FORMAT_MODIFIER_INFO_EXT = 1000158002;
    public static final int VK_STRUCTURE_TYPE_IMAGE_DRM_FORMAT_MODIFIER_LIST_CREATE_INFO_EXT = 1000158003;
    public static final int VK_STRUCTURE_TYPE_IMAGE_DRM_FORMAT_MODIFIER_EXPLICIT_CREATE_INFO_EXT = 1000158004;
    public static final int VK_STRUCTURE_TYPE_IMAGE_DRM_FORMAT_MODIFIER_PROPERTIES_EXT = 1000158005;
    public static final int VK_IMAGE_TILING_DRM_FORMAT_MODIFIER_EXT = 1000158000;
    public static final int VK_IMAGE_ASPECT_MEMORY_PLANE_0_BIT_EXT = 0x00000080;
    public static final int VK_IMAGE_ASPECT_MEMORY_PLANE_1_BIT_EXT = 0x00000100;
    public static final int VK_IMAGE_ASPECT_MEMORY_PLANE_2_BIT_EXT = 0x00000200;
    public static final int VK_IMAGE_ASPECT_MEMORY_PLANE_3_BIT_EXT = 0x00000400;
    public static final int VK_STRUCTURE_TYPE_DRM_FORMAT_MODIFIER_PROPERTIES_LIST_2_EXT = 1000158006;
    public static final class Handles {
        public static final Supplier<MethodHandle> MH_vkGetImageDrmFormatModifierPropertiesEXT = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)));
        private Handles() {}
    }

    private VKEXTImageDrmFormatModifier() {}

    /// Invokes `vkGetImageDrmFormatModifierPropertiesEXT`.
    /// ```
    /// (int) VkResult vkGetImageDrmFormatModifierPropertiesEXT((struct VkDevice*) VkDevice device, (uint64_t) VkImage image, VkImageDrmFormatModifierPropertiesEXT* pProperties);
    /// ```
    public static int vkGetImageDrmFormatModifierPropertiesEXT(@NonNull VkDevice device, long image, @NonNull MemorySegment pProperties) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkGetImageDrmFormatModifierPropertiesEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkGetImageDrmFormatModifierPropertiesEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkGetImageDrmFormatModifierPropertiesEXT", device, image, pProperties); }
        return (int) Handles.MH_vkGetImageDrmFormatModifierPropertiesEXT.get().invokeExact(device.capabilities().PFN_vkGetImageDrmFormatModifierPropertiesEXT, device.segment(), image, pProperties); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetImageDrmFormatModifierPropertiesEXT", e); }
    }

}
