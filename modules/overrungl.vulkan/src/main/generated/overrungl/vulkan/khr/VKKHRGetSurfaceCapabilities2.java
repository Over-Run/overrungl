// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr;
import java.lang.foreign.*;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.vulkan.*;
import static overrungl.internal.RuntimeHelper.*;
/// `VK_KHR_get_surface_capabilities2` - instance extension
public final class VKKHRGetSurfaceCapabilities2 {
    public static final int VK_KHR_GET_SURFACE_CAPABILITIES_2_SPEC_VERSION = 1;
    public static final String VK_KHR_GET_SURFACE_CAPABILITIES_2_EXTENSION_NAME = "VK_KHR_get_surface_capabilities2";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SURFACE_INFO_2_KHR = 1000119000;
    public static final int VK_STRUCTURE_TYPE_SURFACE_CAPABILITIES_2_KHR = 1000119001;
    public static final int VK_STRUCTURE_TYPE_SURFACE_FORMAT_2_KHR = 1000119002;
    public static final class Handles {
        public static final Supplier<MethodHandle> MH_vkGetPhysicalDeviceSurfaceCapabilities2KHR = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_vkGetPhysicalDeviceSurfaceFormats2KHR = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        private Handles() {}
    }

    private VKKHRGetSurfaceCapabilities2() {}

    /// Invokes `vkGetPhysicalDeviceSurfaceCapabilities2KHR`.
    /// ```
    /// (int) VkResult vkGetPhysicalDeviceSurfaceCapabilities2KHR((struct VkPhysicalDevice*) VkPhysicalDevice physicalDevice, const VkPhysicalDeviceSurfaceInfo2KHR* pSurfaceInfo, VkSurfaceCapabilities2KHR* pSurfaceCapabilities);
    /// ```
    public static int vkGetPhysicalDeviceSurfaceCapabilities2KHR(@NonNull VkPhysicalDevice physicalDevice, @NonNull MemorySegment pSurfaceInfo, @NonNull MemorySegment pSurfaceCapabilities) {
        if (MemoryUtil.isNullPointer(physicalDevice.capabilities().PFN_vkGetPhysicalDeviceSurfaceCapabilities2KHR)) throw new VKSymbolNotFoundError("Symbol not found: vkGetPhysicalDeviceSurfaceCapabilities2KHR");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkGetPhysicalDeviceSurfaceCapabilities2KHR", physicalDevice, pSurfaceInfo, pSurfaceCapabilities); }
        return (int) Handles.MH_vkGetPhysicalDeviceSurfaceCapabilities2KHR.get().invokeExact(physicalDevice.capabilities().PFN_vkGetPhysicalDeviceSurfaceCapabilities2KHR, physicalDevice.segment(), pSurfaceInfo, pSurfaceCapabilities); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetPhysicalDeviceSurfaceCapabilities2KHR", e); }
    }

    /// Invokes `vkGetPhysicalDeviceSurfaceFormats2KHR`.
    /// ```
    /// (int) VkResult vkGetPhysicalDeviceSurfaceFormats2KHR((struct VkPhysicalDevice*) VkPhysicalDevice physicalDevice, const VkPhysicalDeviceSurfaceInfo2KHR* pSurfaceInfo, uint32_t* pSurfaceFormatCount, VkSurfaceFormat2KHR* pSurfaceFormats);
    /// ```
    public static int vkGetPhysicalDeviceSurfaceFormats2KHR(@NonNull VkPhysicalDevice physicalDevice, @NonNull MemorySegment pSurfaceInfo, @NonNull MemorySegment pSurfaceFormatCount, @NonNull MemorySegment pSurfaceFormats) {
        if (MemoryUtil.isNullPointer(physicalDevice.capabilities().PFN_vkGetPhysicalDeviceSurfaceFormats2KHR)) throw new VKSymbolNotFoundError("Symbol not found: vkGetPhysicalDeviceSurfaceFormats2KHR");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkGetPhysicalDeviceSurfaceFormats2KHR", physicalDevice, pSurfaceInfo, pSurfaceFormatCount, pSurfaceFormats); }
        return (int) Handles.MH_vkGetPhysicalDeviceSurfaceFormats2KHR.get().invokeExact(physicalDevice.capabilities().PFN_vkGetPhysicalDeviceSurfaceFormats2KHR, physicalDevice.segment(), pSurfaceInfo, pSurfaceFormatCount, pSurfaceFormats); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetPhysicalDeviceSurfaceFormats2KHR", e); }
    }

}
