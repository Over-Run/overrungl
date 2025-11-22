// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.vulkan.*;
import static overrungl.internal.RuntimeHelper.*;
/// `VK_EXT_custom_resolve` - device extension
public final class VKEXTCustomResolve {
    public static final int VK_EXT_CUSTOM_RESOLVE_SPEC_VERSION = 1;
    public static final String VK_EXT_CUSTOM_RESOLVE_EXTENSION_NAME = "VK_EXT_custom_resolve";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_CUSTOM_RESOLVE_FEATURES_EXT = 1000628000;
    public static final int VK_SUBPASS_DESCRIPTION_FRAGMENT_REGION_BIT_EXT = 0x00000004;
    public static final int VK_SUBPASS_DESCRIPTION_CUSTOM_RESOLVE_BIT_EXT = 0x00000008;
    public static final int VK_RENDERING_FRAGMENT_REGION_BIT_EXT = 0x00000040;
    public static final int VK_RENDERING_CUSTOM_RESOLVE_BIT_EXT = 0x00000080;
    public static final int VK_RESOLVE_MODE_CUSTOM_BIT_EXT = 0x00000020;
    public static final int VK_STRUCTURE_TYPE_BEGIN_CUSTOM_RESOLVE_INFO_EXT = 1000628001;
    public static final int VK_STRUCTURE_TYPE_CUSTOM_RESOLVE_CREATE_INFO_EXT = 1000628002;
    private VKEXTCustomResolve() {}
    public static final class Handles {
        public static final MethodHandle MH_vkCmdBeginCustomResolveEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        private Handles() {}
    }

    /// Invokes `vkCmdBeginCustomResolveEXT`.
    /// ```
    /// void vkCmdBeginCustomResolveEXT(VkCommandBuffer commandBuffer, const VkBeginCustomResolveInfoEXT* pBeginCustomResolveInfo);
    /// ```
    public static void vkCmdBeginCustomResolveEXT(@NonNull VkCommandBuffer commandBuffer, @NonNull MemorySegment pBeginCustomResolveInfo) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdBeginCustomResolveEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdBeginCustomResolveEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdBeginCustomResolveEXT", commandBuffer, pBeginCustomResolveInfo); }
        Handles.MH_vkCmdBeginCustomResolveEXT.invokeExact(commandBuffer.capabilities().PFN_vkCmdBeginCustomResolveEXT, commandBuffer.segment(), pBeginCustomResolveInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdBeginCustomResolveEXT", e); }
    }

}
