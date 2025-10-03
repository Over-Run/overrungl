// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.vulkan.*;
import static overrungl.internal.RuntimeHelper.*;
/// `VK_KHR_xcb_surface` - instance extension
public final class VKKHRXcbSurface {
    public static final int VK_KHR_XCB_SURFACE_SPEC_VERSION = 6;
    public static final String VK_KHR_XCB_SURFACE_EXTENSION_NAME = "VK_KHR_xcb_surface";
    public static final int VK_STRUCTURE_TYPE_XCB_SURFACE_CREATE_INFO_KHR = 1000005000;
    public static final class Handles {
        public static final MethodHandle MH_vkCreateXcbSurfaceKHR = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetPhysicalDeviceXcbPresentationSupportKHR = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        private Handles() {}
    }

    private VKKHRXcbSurface() {}

    /// Invokes `vkCreateXcbSurfaceKHR`.
    /// ```
    /// (int) VkResult vkCreateXcbSurfaceKHR((struct VkInstance*) VkInstance instance, const VkXcbSurfaceCreateInfoKHR* pCreateInfo, const VkAllocationCallbacks* pAllocator, VkSurfaceKHR* pSurface);
    /// ```
    public static int vkCreateXcbSurfaceKHR(@NonNull VkInstance instance, @NonNull MemorySegment pCreateInfo, @NonNull MemorySegment pAllocator, @NonNull MemorySegment pSurface) {
        if (MemoryUtil.isNullPointer(instance.capabilities().PFN_vkCreateXcbSurfaceKHR)) throw new VKSymbolNotFoundError("Symbol not found: vkCreateXcbSurfaceKHR");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCreateXcbSurfaceKHR", instance, pCreateInfo, pAllocator, pSurface); }
        return (int) Handles.MH_vkCreateXcbSurfaceKHR.invokeExact(instance.capabilities().PFN_vkCreateXcbSurfaceKHR, instance.segment(), pCreateInfo, pAllocator, pSurface); }
        catch (Throwable e) { throw new RuntimeException("error in vkCreateXcbSurfaceKHR", e); }
    }

    /// Invokes `vkGetPhysicalDeviceXcbPresentationSupportKHR`.
    /// ```
    /// (uint32_t) VkBool32 vkGetPhysicalDeviceXcbPresentationSupportKHR((struct VkPhysicalDevice*) VkPhysicalDevice physicalDevice, uint32_t queueFamilyIndex, xcb_connection_t* connection, (uint32_t) xcb_visualid_t visual_id);
    /// ```
    public static int vkGetPhysicalDeviceXcbPresentationSupportKHR(@NonNull VkPhysicalDevice physicalDevice, int queueFamilyIndex, @NonNull MemorySegment connection, int visual_id) {
        if (MemoryUtil.isNullPointer(physicalDevice.capabilities().PFN_vkGetPhysicalDeviceXcbPresentationSupportKHR)) throw new VKSymbolNotFoundError("Symbol not found: vkGetPhysicalDeviceXcbPresentationSupportKHR");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkGetPhysicalDeviceXcbPresentationSupportKHR", physicalDevice, queueFamilyIndex, connection, visual_id); }
        return (int) Handles.MH_vkGetPhysicalDeviceXcbPresentationSupportKHR.invokeExact(physicalDevice.capabilities().PFN_vkGetPhysicalDeviceXcbPresentationSupportKHR, physicalDevice.segment(), queueFamilyIndex, connection, visual_id); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetPhysicalDeviceXcbPresentationSupportKHR", e); }
    }

}
