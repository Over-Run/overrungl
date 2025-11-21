// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.vulkan.*;
import static overrungl.internal.RuntimeHelper.*;
/// `VK_EXT_hdr_metadata` - device extension
public final class VKEXTHdrMetadata {
    public static final int VK_EXT_HDR_METADATA_SPEC_VERSION = 3;
    public static final String VK_EXT_HDR_METADATA_EXTENSION_NAME = "VK_EXT_hdr_metadata";
    public static final int VK_STRUCTURE_TYPE_HDR_METADATA_EXT = 1000105000;
    private VKEXTHdrMetadata() {}
    public static final class Handles {
        public static final MethodHandle MH_vkSetHdrMetadataEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        private Handles() {}
    }

    /// Invokes `vkSetHdrMetadataEXT`.
    /// ```
    /// void vkSetHdrMetadataEXT(VkDevice device, uint32_t swapchainCount, const VkSwapchainKHR* pSwapchains, const VkHdrMetadataEXT* pMetadata);
    /// ```
    public static void vkSetHdrMetadataEXT(@NonNull VkDevice device, int swapchainCount, @NonNull MemorySegment pSwapchains, @NonNull MemorySegment pMetadata) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkSetHdrMetadataEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkSetHdrMetadataEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkSetHdrMetadataEXT", device, swapchainCount, pSwapchains, pMetadata); }
        Handles.MH_vkSetHdrMetadataEXT.invokeExact(device.capabilities().PFN_vkSetHdrMetadataEXT, device.segment(), swapchainCount, pSwapchains, pMetadata); }
        catch (Throwable e) { throw new RuntimeException("error in vkSetHdrMetadataEXT", e); }
    }

}
