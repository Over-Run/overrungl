// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.vulkan.*;
import static overrungl.internal.RuntimeHelper.*;
/// `VK_EXT_direct_mode_display` - instance extension
public final class VKEXTDirectModeDisplay {
    public static final int VK_EXT_DIRECT_MODE_DISPLAY_SPEC_VERSION = 1;
    public static final String VK_EXT_DIRECT_MODE_DISPLAY_EXTENSION_NAME = "VK_EXT_direct_mode_display";
    private VKEXTDirectModeDisplay() {}
    public static final class Handles {
        public static final MethodHandle MH_vkReleaseDisplayEXT = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG));
        private Handles() {}
    }

    /// Invokes `vkReleaseDisplayEXT`.
    /// ```
    /// VkResult vkReleaseDisplayEXT(VkPhysicalDevice physicalDevice, VkDisplayKHR display);
    /// ```
    public static int vkReleaseDisplayEXT(@NonNull VkPhysicalDevice physicalDevice, long display) {
        if (MemoryUtil.isNullPointer(physicalDevice.capabilities().PFN_vkReleaseDisplayEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkReleaseDisplayEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkReleaseDisplayEXT", physicalDevice, display); }
        return (int) Handles.MH_vkReleaseDisplayEXT.invokeExact(physicalDevice.capabilities().PFN_vkReleaseDisplayEXT, physicalDevice.segment(), display); }
        catch (Throwable e) { throw new RuntimeException("error in vkReleaseDisplayEXT", e); }
    }

}
