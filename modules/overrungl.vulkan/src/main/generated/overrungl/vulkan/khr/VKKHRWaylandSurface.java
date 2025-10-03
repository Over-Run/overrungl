// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.vulkan.*;
import static overrungl.internal.RuntimeHelper.*;
/// `VK_KHR_wayland_surface` - instance extension
public final class VKKHRWaylandSurface {
    public static final int VK_KHR_WAYLAND_SURFACE_SPEC_VERSION = 6;
    public static final String VK_KHR_WAYLAND_SURFACE_EXTENSION_NAME = "VK_KHR_wayland_surface";
    public static final int VK_STRUCTURE_TYPE_WAYLAND_SURFACE_CREATE_INFO_KHR = 1000006000;
    public static final class Handles {
        public static final MethodHandle MH_vkCreateWaylandSurfaceKHR = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetPhysicalDeviceWaylandPresentationSupportKHR = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        private Handles() {}
    }

    private VKKHRWaylandSurface() {}

    /// Invokes `vkCreateWaylandSurfaceKHR`.
    /// ```
    /// (int) VkResult vkCreateWaylandSurfaceKHR((struct VkInstance*) VkInstance instance, const VkWaylandSurfaceCreateInfoKHR* pCreateInfo, const VkAllocationCallbacks* pAllocator, VkSurfaceKHR* pSurface);
    /// ```
    public static int vkCreateWaylandSurfaceKHR(@NonNull VkInstance instance, @NonNull MemorySegment pCreateInfo, @NonNull MemorySegment pAllocator, @NonNull MemorySegment pSurface) {
        if (MemoryUtil.isNullPointer(instance.capabilities().PFN_vkCreateWaylandSurfaceKHR)) throw new VKSymbolNotFoundError("Symbol not found: vkCreateWaylandSurfaceKHR");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCreateWaylandSurfaceKHR", instance, pCreateInfo, pAllocator, pSurface); }
        return (int) Handles.MH_vkCreateWaylandSurfaceKHR.invokeExact(instance.capabilities().PFN_vkCreateWaylandSurfaceKHR, instance.segment(), pCreateInfo, pAllocator, pSurface); }
        catch (Throwable e) { throw new RuntimeException("error in vkCreateWaylandSurfaceKHR", e); }
    }

    /// Invokes `vkGetPhysicalDeviceWaylandPresentationSupportKHR`.
    /// ```
    /// (uint32_t) VkBool32 vkGetPhysicalDeviceWaylandPresentationSupportKHR((struct VkPhysicalDevice*) VkPhysicalDevice physicalDevice, uint32_t queueFamilyIndex, struct wl_display * display);
    /// ```
    public static int vkGetPhysicalDeviceWaylandPresentationSupportKHR(@NonNull VkPhysicalDevice physicalDevice, int queueFamilyIndex, @NonNull MemorySegment display) {
        if (MemoryUtil.isNullPointer(physicalDevice.capabilities().PFN_vkGetPhysicalDeviceWaylandPresentationSupportKHR)) throw new VKSymbolNotFoundError("Symbol not found: vkGetPhysicalDeviceWaylandPresentationSupportKHR");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkGetPhysicalDeviceWaylandPresentationSupportKHR", physicalDevice, queueFamilyIndex, display); }
        return (int) Handles.MH_vkGetPhysicalDeviceWaylandPresentationSupportKHR.invokeExact(physicalDevice.capabilities().PFN_vkGetPhysicalDeviceWaylandPresentationSupportKHR, physicalDevice.segment(), queueFamilyIndex, display); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetPhysicalDeviceWaylandPresentationSupportKHR", e); }
    }

}
