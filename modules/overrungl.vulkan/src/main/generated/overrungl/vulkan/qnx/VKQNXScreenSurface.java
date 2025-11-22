// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.qnx;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.vulkan.*;
import static overrungl.internal.RuntimeHelper.*;
/// `VK_QNX_screen_surface` - instance extension
public final class VKQNXScreenSurface {
    public static final int VK_QNX_SCREEN_SURFACE_SPEC_VERSION = 1;
    public static final String VK_QNX_SCREEN_SURFACE_EXTENSION_NAME = "VK_QNX_screen_surface";
    public static final int VK_STRUCTURE_TYPE_SCREEN_SURFACE_CREATE_INFO_QNX = 1000378000;
    private VKQNXScreenSurface() {}
    public static final class Handles {
        public static final MethodHandle MH_vkCreateScreenSurfaceQNX = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetPhysicalDeviceScreenPresentationSupportQNX = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        private Handles() {}
    }

    /// Invokes `vkCreateScreenSurfaceQNX`.
    /// ```
    /// VkResult vkCreateScreenSurfaceQNX(VkInstance instance, const VkScreenSurfaceCreateInfoQNX* pCreateInfo, const VkAllocationCallbacks* pAllocator, VkSurfaceKHR* pSurface);
    /// ```
    public static int vkCreateScreenSurfaceQNX(@NonNull VkInstance instance, @NonNull MemorySegment pCreateInfo, @NonNull MemorySegment pAllocator, @NonNull MemorySegment pSurface) {
        if (MemoryUtil.isNullPointer(instance.capabilities().PFN_vkCreateScreenSurfaceQNX)) throw new VKSymbolNotFoundError("Symbol not found: vkCreateScreenSurfaceQNX");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCreateScreenSurfaceQNX", instance, pCreateInfo, pAllocator, pSurface); }
        return (int) Handles.MH_vkCreateScreenSurfaceQNX.invokeExact(instance.capabilities().PFN_vkCreateScreenSurfaceQNX, instance.segment(), pCreateInfo, pAllocator, pSurface); }
        catch (Throwable e) { throw new RuntimeException("error in vkCreateScreenSurfaceQNX", e); }
    }

    /// Invokes `vkGetPhysicalDeviceScreenPresentationSupportQNX`.
    /// ```
    /// VkBool32 vkGetPhysicalDeviceScreenPresentationSupportQNX(VkPhysicalDevice physicalDevice, uint32_t queueFamilyIndex, struct _screen_window* window);
    /// ```
    public static int vkGetPhysicalDeviceScreenPresentationSupportQNX(@NonNull VkPhysicalDevice physicalDevice, int queueFamilyIndex, @NonNull MemorySegment window) {
        if (MemoryUtil.isNullPointer(physicalDevice.capabilities().PFN_vkGetPhysicalDeviceScreenPresentationSupportQNX)) throw new VKSymbolNotFoundError("Symbol not found: vkGetPhysicalDeviceScreenPresentationSupportQNX");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkGetPhysicalDeviceScreenPresentationSupportQNX", physicalDevice, queueFamilyIndex, window); }
        return (int) Handles.MH_vkGetPhysicalDeviceScreenPresentationSupportQNX.invokeExact(physicalDevice.capabilities().PFN_vkGetPhysicalDeviceScreenPresentationSupportQNX, physicalDevice.segment(), queueFamilyIndex, window); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetPhysicalDeviceScreenPresentationSupportQNX", e); }
    }

}
