// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr;
import java.lang.foreign.*;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.vulkan.*;
import static overrungl.internal.RuntimeHelper.*;
/// `VK_KHR_win32_surface` - instance extension
public final class VKKHRWin32Surface {
    public static final int VK_KHR_WIN32_SURFACE_SPEC_VERSION = 6;
    public static final String VK_KHR_WIN32_SURFACE_EXTENSION_NAME = "VK_KHR_win32_surface";
    public static final int VK_STRUCTURE_TYPE_WIN32_SURFACE_CREATE_INFO_KHR = 1000009000;
    public static final class Handles {
        public static final Supplier<MethodHandle> MH_vkCreateWin32SurfaceKHR = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_vkGetPhysicalDeviceWin32PresentationSupportKHR = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)));
        private Handles() {}
    }

    private VKKHRWin32Surface() {}

    /// Invokes `vkCreateWin32SurfaceKHR`.
    /// ```
    /// (int) VkResult vkCreateWin32SurfaceKHR((struct VkInstance*) VkInstance instance, const VkWin32SurfaceCreateInfoKHR* pCreateInfo, const VkAllocationCallbacks* pAllocator, VkSurfaceKHR* pSurface);
    /// ```
    public static int vkCreateWin32SurfaceKHR(@NonNull VkInstance instance, @NonNull MemorySegment pCreateInfo, @NonNull MemorySegment pAllocator, @NonNull MemorySegment pSurface) {
        if (MemoryUtil.isNullPointer(instance.capabilities().PFN_vkCreateWin32SurfaceKHR)) throw new VKSymbolNotFoundError("Symbol not found: vkCreateWin32SurfaceKHR");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCreateWin32SurfaceKHR", instance, pCreateInfo, pAllocator, pSurface); }
        return (int) Handles.MH_vkCreateWin32SurfaceKHR.get().invokeExact(instance.capabilities().PFN_vkCreateWin32SurfaceKHR, instance.segment(), pCreateInfo, pAllocator, pSurface); }
        catch (Throwable e) { throw new RuntimeException("error in vkCreateWin32SurfaceKHR", e); }
    }

    /// Invokes `vkGetPhysicalDeviceWin32PresentationSupportKHR`.
    /// ```
    /// (uint32_t) VkBool32 vkGetPhysicalDeviceWin32PresentationSupportKHR((struct VkPhysicalDevice*) VkPhysicalDevice physicalDevice, uint32_t queueFamilyIndex);
    /// ```
    public static int vkGetPhysicalDeviceWin32PresentationSupportKHR(@NonNull VkPhysicalDevice physicalDevice, int queueFamilyIndex) {
        if (MemoryUtil.isNullPointer(physicalDevice.capabilities().PFN_vkGetPhysicalDeviceWin32PresentationSupportKHR)) throw new VKSymbolNotFoundError("Symbol not found: vkGetPhysicalDeviceWin32PresentationSupportKHR");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkGetPhysicalDeviceWin32PresentationSupportKHR", physicalDevice, queueFamilyIndex); }
        return (int) Handles.MH_vkGetPhysicalDeviceWin32PresentationSupportKHR.get().invokeExact(physicalDevice.capabilities().PFN_vkGetPhysicalDeviceWin32PresentationSupportKHR, physicalDevice.segment(), queueFamilyIndex); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetPhysicalDeviceWin32PresentationSupportKHR", e); }
    }

}
