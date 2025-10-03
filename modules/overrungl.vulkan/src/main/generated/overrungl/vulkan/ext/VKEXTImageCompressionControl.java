// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext;
import java.lang.foreign.*;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.vulkan.*;
import static overrungl.internal.RuntimeHelper.*;
/// `VK_EXT_image_compression_control` - device extension
public final class VKEXTImageCompressionControl {
    public static final int VK_IMAGE_COMPRESSION_DEFAULT_EXT = 0;
    public static final int VK_IMAGE_COMPRESSION_FIXED_RATE_DEFAULT_EXT = 0x00000001;
    public static final int VK_IMAGE_COMPRESSION_FIXED_RATE_EXPLICIT_EXT = 0x00000002;
    public static final int VK_IMAGE_COMPRESSION_DISABLED_EXT = 0x00000004;
    public static final int VK_IMAGE_COMPRESSION_FIXED_RATE_NONE_EXT = 0;
    public static final int VK_IMAGE_COMPRESSION_FIXED_RATE_1BPC_BIT_EXT = 0x00000001;
    public static final int VK_IMAGE_COMPRESSION_FIXED_RATE_2BPC_BIT_EXT = 0x00000002;
    public static final int VK_IMAGE_COMPRESSION_FIXED_RATE_3BPC_BIT_EXT = 0x00000004;
    public static final int VK_IMAGE_COMPRESSION_FIXED_RATE_4BPC_BIT_EXT = 0x00000008;
    public static final int VK_IMAGE_COMPRESSION_FIXED_RATE_5BPC_BIT_EXT = 0x00000010;
    public static final int VK_IMAGE_COMPRESSION_FIXED_RATE_6BPC_BIT_EXT = 0x00000020;
    public static final int VK_IMAGE_COMPRESSION_FIXED_RATE_7BPC_BIT_EXT = 0x00000040;
    public static final int VK_IMAGE_COMPRESSION_FIXED_RATE_8BPC_BIT_EXT = 0x00000080;
    public static final int VK_IMAGE_COMPRESSION_FIXED_RATE_9BPC_BIT_EXT = 0x00000100;
    public static final int VK_IMAGE_COMPRESSION_FIXED_RATE_10BPC_BIT_EXT = 0x00000200;
    public static final int VK_IMAGE_COMPRESSION_FIXED_RATE_11BPC_BIT_EXT = 0x00000400;
    public static final int VK_IMAGE_COMPRESSION_FIXED_RATE_12BPC_BIT_EXT = 0x00000800;
    public static final int VK_IMAGE_COMPRESSION_FIXED_RATE_13BPC_BIT_EXT = 0x00001000;
    public static final int VK_IMAGE_COMPRESSION_FIXED_RATE_14BPC_BIT_EXT = 0x00002000;
    public static final int VK_IMAGE_COMPRESSION_FIXED_RATE_15BPC_BIT_EXT = 0x00004000;
    public static final int VK_IMAGE_COMPRESSION_FIXED_RATE_16BPC_BIT_EXT = 0x00008000;
    public static final int VK_IMAGE_COMPRESSION_FIXED_RATE_17BPC_BIT_EXT = 0x00010000;
    public static final int VK_IMAGE_COMPRESSION_FIXED_RATE_18BPC_BIT_EXT = 0x00020000;
    public static final int VK_IMAGE_COMPRESSION_FIXED_RATE_19BPC_BIT_EXT = 0x00040000;
    public static final int VK_IMAGE_COMPRESSION_FIXED_RATE_20BPC_BIT_EXT = 0x00080000;
    public static final int VK_IMAGE_COMPRESSION_FIXED_RATE_21BPC_BIT_EXT = 0x00100000;
    public static final int VK_IMAGE_COMPRESSION_FIXED_RATE_22BPC_BIT_EXT = 0x00200000;
    public static final int VK_IMAGE_COMPRESSION_FIXED_RATE_23BPC_BIT_EXT = 0x00400000;
    public static final int VK_IMAGE_COMPRESSION_FIXED_RATE_24BPC_BIT_EXT = 0x00800000;
    public static final int VK_EXT_IMAGE_COMPRESSION_CONTROL_SPEC_VERSION = 1;
    public static final String VK_EXT_IMAGE_COMPRESSION_CONTROL_EXTENSION_NAME = "VK_EXT_image_compression_control";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_COMPRESSION_CONTROL_FEATURES_EXT = 1000338000;
    public static final int VK_STRUCTURE_TYPE_IMAGE_COMPRESSION_CONTROL_EXT = 1000338001;
    public static final int VK_STRUCTURE_TYPE_SUBRESOURCE_LAYOUT_2_EXT = 1000338002;
    public static final int VK_STRUCTURE_TYPE_IMAGE_SUBRESOURCE_2_EXT = 1000338003;
    public static final int VK_STRUCTURE_TYPE_IMAGE_COMPRESSION_PROPERTIES_EXT = 1000338004;
    public static final int VK_ERROR_COMPRESSION_EXHAUSTED_EXT = -1000338000;
    public static final class Handles {
        public static final Supplier<MethodHandle> MH_vkGetImageSubresourceLayout2EXT = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        private Handles() {}
    }

    private VKEXTImageCompressionControl() {}

    /// Invokes `vkGetImageSubresourceLayout2EXT`.
    /// ```
    /// void vkGetImageSubresourceLayout2EXT((struct VkDevice*) VkDevice device, (uint64_t) VkImage image, const VkImageSubresource2* pSubresource, VkSubresourceLayout2* pLayout);
    /// ```
    public static void vkGetImageSubresourceLayout2EXT(@NonNull VkDevice device, long image, @NonNull MemorySegment pSubresource, @NonNull MemorySegment pLayout) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkGetImageSubresourceLayout2EXT)) throw new VKSymbolNotFoundError("Symbol not found: vkGetImageSubresourceLayout2EXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkGetImageSubresourceLayout2EXT", device, image, pSubresource, pLayout); }
        Handles.MH_vkGetImageSubresourceLayout2EXT.get().invokeExact(device.capabilities().PFN_vkGetImageSubresourceLayout2EXT, device.segment(), image, pSubresource, pLayout); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetImageSubresourceLayout2EXT", e); }
    }

}
