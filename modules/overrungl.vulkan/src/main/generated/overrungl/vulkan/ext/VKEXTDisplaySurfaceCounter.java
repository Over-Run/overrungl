// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.vulkan.*;
import static overrungl.internal.RuntimeHelper.*;
/// `VK_EXT_display_surface_counter` - instance extension
public final class VKEXTDisplaySurfaceCounter {
    public static final int VK_SURFACE_COUNTER_VBLANK_BIT_EXT = 0x00000001;
    public static final int VK_SURFACE_COUNTER_VBLANK_EXT = 0x00000001;
    public static final int VK_EXT_DISPLAY_SURFACE_COUNTER_SPEC_VERSION = 1;
    public static final String VK_EXT_DISPLAY_SURFACE_COUNTER_EXTENSION_NAME = "VK_EXT_display_surface_counter";
    public static final int VK_STRUCTURE_TYPE_SURFACE_CAPABILITIES_2_EXT = 1000090000;
    public static final int VK_STRUCTURE_TYPE_SURFACE_CAPABILITIES2_EXT = 1000090000;
    public static final class Handles {
        public static final MethodHandle MH_vkGetPhysicalDeviceSurfaceCapabilities2EXT = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS));
        private Handles() {}
    }

    private VKEXTDisplaySurfaceCounter() {}

    /// Invokes `vkGetPhysicalDeviceSurfaceCapabilities2EXT`.
    /// ```
    /// (int) VkResult vkGetPhysicalDeviceSurfaceCapabilities2EXT((struct VkPhysicalDevice*) VkPhysicalDevice physicalDevice, (uint64_t) VkSurfaceKHR surface, VkSurfaceCapabilities2EXT* pSurfaceCapabilities);
    /// ```
    public static int vkGetPhysicalDeviceSurfaceCapabilities2EXT(@NonNull VkPhysicalDevice physicalDevice, long surface, @NonNull MemorySegment pSurfaceCapabilities) {
        if (MemoryUtil.isNullPointer(physicalDevice.capabilities().PFN_vkGetPhysicalDeviceSurfaceCapabilities2EXT)) throw new VKSymbolNotFoundError("Symbol not found: vkGetPhysicalDeviceSurfaceCapabilities2EXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkGetPhysicalDeviceSurfaceCapabilities2EXT", physicalDevice, surface, pSurfaceCapabilities); }
        return (int) Handles.MH_vkGetPhysicalDeviceSurfaceCapabilities2EXT.invokeExact(physicalDevice.capabilities().PFN_vkGetPhysicalDeviceSurfaceCapabilities2EXT, physicalDevice.segment(), surface, pSurfaceCapabilities); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetPhysicalDeviceSurfaceCapabilities2EXT", e); }
    }

}
