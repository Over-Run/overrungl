// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.vulkan.*;
import static overrungl.internal.RuntimeHelper.*;
/// `VK_KHR_display` - instance extension
public final class VKKHRDisplay {
    public static final int VK_KHR_DISPLAY_SPEC_VERSION = 23;
    public static final String VK_KHR_DISPLAY_EXTENSION_NAME = "VK_KHR_display";
    public static final int VK_DISPLAY_PLANE_ALPHA_OPAQUE_BIT_KHR = 0x00000001;
    public static final int VK_DISPLAY_PLANE_ALPHA_GLOBAL_BIT_KHR = 0x00000002;
    public static final int VK_DISPLAY_PLANE_ALPHA_PER_PIXEL_BIT_KHR = 0x00000004;
    public static final int VK_DISPLAY_PLANE_ALPHA_PER_PIXEL_PREMULTIPLIED_BIT_KHR = 0x00000008;
    public static final int VK_STRUCTURE_TYPE_DISPLAY_MODE_CREATE_INFO_KHR = 1000002000;
    public static final int VK_STRUCTURE_TYPE_DISPLAY_SURFACE_CREATE_INFO_KHR = 1000002001;
    public static final int VK_OBJECT_TYPE_DISPLAY_KHR = 1000002000;
    public static final int VK_OBJECT_TYPE_DISPLAY_MODE_KHR = 1000002001;
    private VKKHRDisplay() {}
    public static final class Handles {
        public static final MethodHandle MH_vkGetPhysicalDeviceDisplayPropertiesKHR = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetPhysicalDeviceDisplayPlanePropertiesKHR = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetDisplayPlaneSupportedDisplaysKHR = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetDisplayModePropertiesKHR = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCreateDisplayModeKHR = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetDisplayPlaneCapabilitiesKHR = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCreateDisplayPlaneSurfaceKHR = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        private Handles() {}
    }

    /// Invokes `vkGetPhysicalDeviceDisplayPropertiesKHR`.
    /// ```
    /// VkResult vkGetPhysicalDeviceDisplayPropertiesKHR(VkPhysicalDevice physicalDevice, uint32_t* pPropertyCount, VkDisplayPropertiesKHR* pProperties);
    /// ```
    public static int vkGetPhysicalDeviceDisplayPropertiesKHR(@NonNull VkPhysicalDevice physicalDevice, @NonNull MemorySegment pPropertyCount, @NonNull MemorySegment pProperties) {
        if (MemoryUtil.isNullPointer(physicalDevice.capabilities().PFN_vkGetPhysicalDeviceDisplayPropertiesKHR)) throw new VKSymbolNotFoundError("Symbol not found: vkGetPhysicalDeviceDisplayPropertiesKHR");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkGetPhysicalDeviceDisplayPropertiesKHR", physicalDevice, pPropertyCount, pProperties); }
        return (int) Handles.MH_vkGetPhysicalDeviceDisplayPropertiesKHR.invokeExact(physicalDevice.capabilities().PFN_vkGetPhysicalDeviceDisplayPropertiesKHR, physicalDevice.segment(), pPropertyCount, pProperties); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetPhysicalDeviceDisplayPropertiesKHR", e); }
    }

    /// Invokes `vkGetPhysicalDeviceDisplayPlanePropertiesKHR`.
    /// ```
    /// VkResult vkGetPhysicalDeviceDisplayPlanePropertiesKHR(VkPhysicalDevice physicalDevice, uint32_t* pPropertyCount, VkDisplayPlanePropertiesKHR* pProperties);
    /// ```
    public static int vkGetPhysicalDeviceDisplayPlanePropertiesKHR(@NonNull VkPhysicalDevice physicalDevice, @NonNull MemorySegment pPropertyCount, @NonNull MemorySegment pProperties) {
        if (MemoryUtil.isNullPointer(physicalDevice.capabilities().PFN_vkGetPhysicalDeviceDisplayPlanePropertiesKHR)) throw new VKSymbolNotFoundError("Symbol not found: vkGetPhysicalDeviceDisplayPlanePropertiesKHR");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkGetPhysicalDeviceDisplayPlanePropertiesKHR", physicalDevice, pPropertyCount, pProperties); }
        return (int) Handles.MH_vkGetPhysicalDeviceDisplayPlanePropertiesKHR.invokeExact(physicalDevice.capabilities().PFN_vkGetPhysicalDeviceDisplayPlanePropertiesKHR, physicalDevice.segment(), pPropertyCount, pProperties); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetPhysicalDeviceDisplayPlanePropertiesKHR", e); }
    }

    /// Invokes `vkGetDisplayPlaneSupportedDisplaysKHR`.
    /// ```
    /// VkResult vkGetDisplayPlaneSupportedDisplaysKHR(VkPhysicalDevice physicalDevice, uint32_t planeIndex, uint32_t* pDisplayCount, VkDisplayKHR* pDisplays);
    /// ```
    public static int vkGetDisplayPlaneSupportedDisplaysKHR(@NonNull VkPhysicalDevice physicalDevice, int planeIndex, @NonNull MemorySegment pDisplayCount, @NonNull MemorySegment pDisplays) {
        if (MemoryUtil.isNullPointer(physicalDevice.capabilities().PFN_vkGetDisplayPlaneSupportedDisplaysKHR)) throw new VKSymbolNotFoundError("Symbol not found: vkGetDisplayPlaneSupportedDisplaysKHR");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkGetDisplayPlaneSupportedDisplaysKHR", physicalDevice, planeIndex, pDisplayCount, pDisplays); }
        return (int) Handles.MH_vkGetDisplayPlaneSupportedDisplaysKHR.invokeExact(physicalDevice.capabilities().PFN_vkGetDisplayPlaneSupportedDisplaysKHR, physicalDevice.segment(), planeIndex, pDisplayCount, pDisplays); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetDisplayPlaneSupportedDisplaysKHR", e); }
    }

    /// Invokes `vkGetDisplayModePropertiesKHR`.
    /// ```
    /// VkResult vkGetDisplayModePropertiesKHR(VkPhysicalDevice physicalDevice, VkDisplayKHR display, uint32_t* pPropertyCount, VkDisplayModePropertiesKHR* pProperties);
    /// ```
    public static int vkGetDisplayModePropertiesKHR(@NonNull VkPhysicalDevice physicalDevice, long display, @NonNull MemorySegment pPropertyCount, @NonNull MemorySegment pProperties) {
        if (MemoryUtil.isNullPointer(physicalDevice.capabilities().PFN_vkGetDisplayModePropertiesKHR)) throw new VKSymbolNotFoundError("Symbol not found: vkGetDisplayModePropertiesKHR");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkGetDisplayModePropertiesKHR", physicalDevice, display, pPropertyCount, pProperties); }
        return (int) Handles.MH_vkGetDisplayModePropertiesKHR.invokeExact(physicalDevice.capabilities().PFN_vkGetDisplayModePropertiesKHR, physicalDevice.segment(), display, pPropertyCount, pProperties); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetDisplayModePropertiesKHR", e); }
    }

    /// Invokes `vkCreateDisplayModeKHR`.
    /// ```
    /// VkResult vkCreateDisplayModeKHR(VkPhysicalDevice physicalDevice, VkDisplayKHR display, const VkDisplayModeCreateInfoKHR* pCreateInfo, const VkAllocationCallbacks* pAllocator, VkDisplayModeKHR* pMode);
    /// ```
    public static int vkCreateDisplayModeKHR(@NonNull VkPhysicalDevice physicalDevice, long display, @NonNull MemorySegment pCreateInfo, @NonNull MemorySegment pAllocator, @NonNull MemorySegment pMode) {
        if (MemoryUtil.isNullPointer(physicalDevice.capabilities().PFN_vkCreateDisplayModeKHR)) throw new VKSymbolNotFoundError("Symbol not found: vkCreateDisplayModeKHR");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCreateDisplayModeKHR", physicalDevice, display, pCreateInfo, pAllocator, pMode); }
        return (int) Handles.MH_vkCreateDisplayModeKHR.invokeExact(physicalDevice.capabilities().PFN_vkCreateDisplayModeKHR, physicalDevice.segment(), display, pCreateInfo, pAllocator, pMode); }
        catch (Throwable e) { throw new RuntimeException("error in vkCreateDisplayModeKHR", e); }
    }

    /// Invokes `vkGetDisplayPlaneCapabilitiesKHR`.
    /// ```
    /// VkResult vkGetDisplayPlaneCapabilitiesKHR(VkPhysicalDevice physicalDevice, VkDisplayModeKHR mode, uint32_t planeIndex, VkDisplayPlaneCapabilitiesKHR* pCapabilities);
    /// ```
    public static int vkGetDisplayPlaneCapabilitiesKHR(@NonNull VkPhysicalDevice physicalDevice, long mode, int planeIndex, @NonNull MemorySegment pCapabilities) {
        if (MemoryUtil.isNullPointer(physicalDevice.capabilities().PFN_vkGetDisplayPlaneCapabilitiesKHR)) throw new VKSymbolNotFoundError("Symbol not found: vkGetDisplayPlaneCapabilitiesKHR");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkGetDisplayPlaneCapabilitiesKHR", physicalDevice, mode, planeIndex, pCapabilities); }
        return (int) Handles.MH_vkGetDisplayPlaneCapabilitiesKHR.invokeExact(physicalDevice.capabilities().PFN_vkGetDisplayPlaneCapabilitiesKHR, physicalDevice.segment(), mode, planeIndex, pCapabilities); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetDisplayPlaneCapabilitiesKHR", e); }
    }

    /// Invokes `vkCreateDisplayPlaneSurfaceKHR`.
    /// ```
    /// VkResult vkCreateDisplayPlaneSurfaceKHR(VkInstance instance, const VkDisplaySurfaceCreateInfoKHR* pCreateInfo, const VkAllocationCallbacks* pAllocator, VkSurfaceKHR* pSurface);
    /// ```
    public static int vkCreateDisplayPlaneSurfaceKHR(@NonNull VkInstance instance, @NonNull MemorySegment pCreateInfo, @NonNull MemorySegment pAllocator, @NonNull MemorySegment pSurface) {
        if (MemoryUtil.isNullPointer(instance.capabilities().PFN_vkCreateDisplayPlaneSurfaceKHR)) throw new VKSymbolNotFoundError("Symbol not found: vkCreateDisplayPlaneSurfaceKHR");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCreateDisplayPlaneSurfaceKHR", instance, pCreateInfo, pAllocator, pSurface); }
        return (int) Handles.MH_vkCreateDisplayPlaneSurfaceKHR.invokeExact(instance.capabilities().PFN_vkCreateDisplayPlaneSurfaceKHR, instance.segment(), pCreateInfo, pAllocator, pSurface); }
        catch (Throwable e) { throw new RuntimeException("error in vkCreateDisplayPlaneSurfaceKHR", e); }
    }

}
