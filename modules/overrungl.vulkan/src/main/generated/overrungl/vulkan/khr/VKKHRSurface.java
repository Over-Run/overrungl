// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.vulkan.*;
import static overrungl.internal.RuntimeHelper.*;
/// `VK_KHR_surface` - instance extension
public final class VKKHRSurface {
    public static final int VK_KHR_SURFACE_SPEC_VERSION = 25;
    public static final String VK_KHR_SURFACE_EXTENSION_NAME = "VK_KHR_surface";
    public static final int VK_SURFACE_TRANSFORM_IDENTITY_BIT_KHR = 0x00000001;
    public static final int VK_SURFACE_TRANSFORM_ROTATE_90_BIT_KHR = 0x00000002;
    public static final int VK_SURFACE_TRANSFORM_ROTATE_180_BIT_KHR = 0x00000004;
    public static final int VK_SURFACE_TRANSFORM_ROTATE_270_BIT_KHR = 0x00000008;
    public static final int VK_SURFACE_TRANSFORM_HORIZONTAL_MIRROR_BIT_KHR = 0x00000010;
    public static final int VK_SURFACE_TRANSFORM_HORIZONTAL_MIRROR_ROTATE_90_BIT_KHR = 0x00000020;
    public static final int VK_SURFACE_TRANSFORM_HORIZONTAL_MIRROR_ROTATE_180_BIT_KHR = 0x00000040;
    public static final int VK_SURFACE_TRANSFORM_HORIZONTAL_MIRROR_ROTATE_270_BIT_KHR = 0x00000080;
    public static final int VK_SURFACE_TRANSFORM_INHERIT_BIT_KHR = 0x00000100;
    public static final int VK_PRESENT_MODE_IMMEDIATE_KHR = 0;
    public static final int VK_PRESENT_MODE_MAILBOX_KHR = 1;
    public static final int VK_PRESENT_MODE_FIFO_KHR = 2;
    public static final int VK_PRESENT_MODE_FIFO_RELAXED_KHR = 3;
    public static final int VK_COLOR_SPACE_SRGB_NONLINEAR_KHR = 0;
    public static final int VK_COLORSPACE_SRGB_NONLINEAR_KHR = 0;
    public static final int VK_COMPOSITE_ALPHA_OPAQUE_BIT_KHR = 0x00000001;
    public static final int VK_COMPOSITE_ALPHA_PRE_MULTIPLIED_BIT_KHR = 0x00000002;
    public static final int VK_COMPOSITE_ALPHA_POST_MULTIPLIED_BIT_KHR = 0x00000004;
    public static final int VK_COMPOSITE_ALPHA_INHERIT_BIT_KHR = 0x00000008;
    public static final int VK_ERROR_SURFACE_LOST_KHR = -1000000000;
    public static final int VK_ERROR_NATIVE_WINDOW_IN_USE_KHR = -1000000001;
    public static final int VK_OBJECT_TYPE_SURFACE_KHR = 1000000000;
    private VKKHRSurface() {}
    public static final class Handles {
        public static final MethodHandle MH_vkDestroySurfaceKHR = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetPhysicalDeviceSurfaceSupportKHR = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetPhysicalDeviceSurfaceCapabilitiesKHR = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetPhysicalDeviceSurfaceFormatsKHR = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetPhysicalDeviceSurfacePresentModesKHR = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        private Handles() {}
    }

    /// Invokes `vkDestroySurfaceKHR`.
    /// ```
    /// void vkDestroySurfaceKHR(VkInstance instance, VkSurfaceKHR surface, const VkAllocationCallbacks* pAllocator);
    /// ```
    public static void vkDestroySurfaceKHR(@NonNull VkInstance instance, long surface, @NonNull MemorySegment pAllocator) {
        if (MemoryUtil.isNullPointer(instance.capabilities().PFN_vkDestroySurfaceKHR)) throw new VKSymbolNotFoundError("Symbol not found: vkDestroySurfaceKHR");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkDestroySurfaceKHR", instance, surface, pAllocator); }
        Handles.MH_vkDestroySurfaceKHR.invokeExact(instance.capabilities().PFN_vkDestroySurfaceKHR, instance.segment(), surface, pAllocator); }
        catch (Throwable e) { throw new RuntimeException("error in vkDestroySurfaceKHR", e); }
    }

    /// Invokes `vkGetPhysicalDeviceSurfaceSupportKHR`.
    /// ```
    /// VkResult vkGetPhysicalDeviceSurfaceSupportKHR(VkPhysicalDevice physicalDevice, uint32_t queueFamilyIndex, VkSurfaceKHR surface, VkBool32* pSupported);
    /// ```
    public static int vkGetPhysicalDeviceSurfaceSupportKHR(@NonNull VkPhysicalDevice physicalDevice, int queueFamilyIndex, long surface, @NonNull MemorySegment pSupported) {
        if (MemoryUtil.isNullPointer(physicalDevice.capabilities().PFN_vkGetPhysicalDeviceSurfaceSupportKHR)) throw new VKSymbolNotFoundError("Symbol not found: vkGetPhysicalDeviceSurfaceSupportKHR");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkGetPhysicalDeviceSurfaceSupportKHR", physicalDevice, queueFamilyIndex, surface, pSupported); }
        return (int) Handles.MH_vkGetPhysicalDeviceSurfaceSupportKHR.invokeExact(physicalDevice.capabilities().PFN_vkGetPhysicalDeviceSurfaceSupportKHR, physicalDevice.segment(), queueFamilyIndex, surface, pSupported); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetPhysicalDeviceSurfaceSupportKHR", e); }
    }

    /// Invokes `vkGetPhysicalDeviceSurfaceCapabilitiesKHR`.
    /// ```
    /// VkResult vkGetPhysicalDeviceSurfaceCapabilitiesKHR(VkPhysicalDevice physicalDevice, VkSurfaceKHR surface, VkSurfaceCapabilitiesKHR* pSurfaceCapabilities);
    /// ```
    public static int vkGetPhysicalDeviceSurfaceCapabilitiesKHR(@NonNull VkPhysicalDevice physicalDevice, long surface, @NonNull MemorySegment pSurfaceCapabilities) {
        if (MemoryUtil.isNullPointer(physicalDevice.capabilities().PFN_vkGetPhysicalDeviceSurfaceCapabilitiesKHR)) throw new VKSymbolNotFoundError("Symbol not found: vkGetPhysicalDeviceSurfaceCapabilitiesKHR");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkGetPhysicalDeviceSurfaceCapabilitiesKHR", physicalDevice, surface, pSurfaceCapabilities); }
        return (int) Handles.MH_vkGetPhysicalDeviceSurfaceCapabilitiesKHR.invokeExact(physicalDevice.capabilities().PFN_vkGetPhysicalDeviceSurfaceCapabilitiesKHR, physicalDevice.segment(), surface, pSurfaceCapabilities); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetPhysicalDeviceSurfaceCapabilitiesKHR", e); }
    }

    /// Invokes `vkGetPhysicalDeviceSurfaceFormatsKHR`.
    /// ```
    /// VkResult vkGetPhysicalDeviceSurfaceFormatsKHR(VkPhysicalDevice physicalDevice, VkSurfaceKHR surface, uint32_t* pSurfaceFormatCount, VkSurfaceFormatKHR* pSurfaceFormats);
    /// ```
    public static int vkGetPhysicalDeviceSurfaceFormatsKHR(@NonNull VkPhysicalDevice physicalDevice, long surface, @NonNull MemorySegment pSurfaceFormatCount, @NonNull MemorySegment pSurfaceFormats) {
        if (MemoryUtil.isNullPointer(physicalDevice.capabilities().PFN_vkGetPhysicalDeviceSurfaceFormatsKHR)) throw new VKSymbolNotFoundError("Symbol not found: vkGetPhysicalDeviceSurfaceFormatsKHR");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkGetPhysicalDeviceSurfaceFormatsKHR", physicalDevice, surface, pSurfaceFormatCount, pSurfaceFormats); }
        return (int) Handles.MH_vkGetPhysicalDeviceSurfaceFormatsKHR.invokeExact(physicalDevice.capabilities().PFN_vkGetPhysicalDeviceSurfaceFormatsKHR, physicalDevice.segment(), surface, pSurfaceFormatCount, pSurfaceFormats); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetPhysicalDeviceSurfaceFormatsKHR", e); }
    }

    /// Invokes `vkGetPhysicalDeviceSurfacePresentModesKHR`.
    /// ```
    /// VkResult vkGetPhysicalDeviceSurfacePresentModesKHR(VkPhysicalDevice physicalDevice, VkSurfaceKHR surface, uint32_t* pPresentModeCount, VkPresentModeKHR* pPresentModes);
    /// ```
    public static int vkGetPhysicalDeviceSurfacePresentModesKHR(@NonNull VkPhysicalDevice physicalDevice, long surface, @NonNull MemorySegment pPresentModeCount, @NonNull MemorySegment pPresentModes) {
        if (MemoryUtil.isNullPointer(physicalDevice.capabilities().PFN_vkGetPhysicalDeviceSurfacePresentModesKHR)) throw new VKSymbolNotFoundError("Symbol not found: vkGetPhysicalDeviceSurfacePresentModesKHR");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkGetPhysicalDeviceSurfacePresentModesKHR", physicalDevice, surface, pPresentModeCount, pPresentModes); }
        return (int) Handles.MH_vkGetPhysicalDeviceSurfacePresentModesKHR.invokeExact(physicalDevice.capabilities().PFN_vkGetPhysicalDeviceSurfacePresentModesKHR, physicalDevice.segment(), surface, pPresentModeCount, pPresentModes); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetPhysicalDeviceSurfacePresentModesKHR", e); }
    }

}
