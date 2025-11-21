// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.amd;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.vulkan.*;
import static overrungl.internal.RuntimeHelper.*;
/// `VK_AMD_display_native_hdr` - device extension
public final class VKAMDDisplayNativeHdr {
    public static final int VK_AMD_DISPLAY_NATIVE_HDR_SPEC_VERSION = 1;
    public static final String VK_AMD_DISPLAY_NATIVE_HDR_EXTENSION_NAME = "VK_AMD_display_native_hdr";
    public static final int VK_STRUCTURE_TYPE_DISPLAY_NATIVE_HDR_SURFACE_CAPABILITIES_AMD = 1000213000;
    public static final int VK_STRUCTURE_TYPE_SWAPCHAIN_DISPLAY_NATIVE_HDR_CREATE_INFO_AMD = 1000213001;
    public static final int VK_COLOR_SPACE_DISPLAY_NATIVE_AMD = 1000213000;
    private VKAMDDisplayNativeHdr() {}
    public static final class Handles {
        public static final MethodHandle MH_vkSetLocalDimmingAMD = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT));
        private Handles() {}
    }

    /// Invokes `vkSetLocalDimmingAMD`.
    /// ```
    /// void vkSetLocalDimmingAMD(VkDevice device, VkSwapchainKHR swapChain, VkBool32 localDimmingEnable);
    /// ```
    public static void vkSetLocalDimmingAMD(@NonNull VkDevice device, long swapChain, int localDimmingEnable) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkSetLocalDimmingAMD)) throw new VKSymbolNotFoundError("Symbol not found: vkSetLocalDimmingAMD");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkSetLocalDimmingAMD", device, swapChain, localDimmingEnable); }
        Handles.MH_vkSetLocalDimmingAMD.invokeExact(device.capabilities().PFN_vkSetLocalDimmingAMD, device.segment(), swapChain, localDimmingEnable); }
        catch (Throwable e) { throw new RuntimeException("error in vkSetLocalDimmingAMD", e); }
    }

}
