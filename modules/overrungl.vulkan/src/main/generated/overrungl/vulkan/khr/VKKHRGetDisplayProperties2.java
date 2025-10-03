// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr;
import java.lang.foreign.*;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.vulkan.*;
import static overrungl.internal.RuntimeHelper.*;
/// `VK_KHR_get_display_properties2` - instance extension
public final class VKKHRGetDisplayProperties2 {
    public static final int VK_KHR_GET_DISPLAY_PROPERTIES_2_SPEC_VERSION = 1;
    public static final String VK_KHR_GET_DISPLAY_PROPERTIES_2_EXTENSION_NAME = "VK_KHR_get_display_properties2";
    public static final int VK_STRUCTURE_TYPE_DISPLAY_PROPERTIES_2_KHR = 1000121000;
    public static final int VK_STRUCTURE_TYPE_DISPLAY_PLANE_PROPERTIES_2_KHR = 1000121001;
    public static final int VK_STRUCTURE_TYPE_DISPLAY_MODE_PROPERTIES_2_KHR = 1000121002;
    public static final int VK_STRUCTURE_TYPE_DISPLAY_PLANE_INFO_2_KHR = 1000121003;
    public static final int VK_STRUCTURE_TYPE_DISPLAY_PLANE_CAPABILITIES_2_KHR = 1000121004;
    public static final class Handles {
        public static final Supplier<MethodHandle> MH_vkGetPhysicalDeviceDisplayProperties2KHR = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_vkGetPhysicalDeviceDisplayPlaneProperties2KHR = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_vkGetDisplayModeProperties2KHR = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_vkGetDisplayPlaneCapabilities2KHR = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        private Handles() {}
    }

    private VKKHRGetDisplayProperties2() {}

    /// Invokes `vkGetPhysicalDeviceDisplayProperties2KHR`.
    /// ```
    /// (int) VkResult vkGetPhysicalDeviceDisplayProperties2KHR((struct VkPhysicalDevice*) VkPhysicalDevice physicalDevice, uint32_t* pPropertyCount, VkDisplayProperties2KHR* pProperties);
    /// ```
    public static int vkGetPhysicalDeviceDisplayProperties2KHR(@NonNull VkPhysicalDevice physicalDevice, @NonNull MemorySegment pPropertyCount, @NonNull MemorySegment pProperties) {
        if (MemoryUtil.isNullPointer(physicalDevice.capabilities().PFN_vkGetPhysicalDeviceDisplayProperties2KHR)) throw new VKSymbolNotFoundError("Symbol not found: vkGetPhysicalDeviceDisplayProperties2KHR");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkGetPhysicalDeviceDisplayProperties2KHR", physicalDevice, pPropertyCount, pProperties); }
        return (int) Handles.MH_vkGetPhysicalDeviceDisplayProperties2KHR.get().invokeExact(physicalDevice.capabilities().PFN_vkGetPhysicalDeviceDisplayProperties2KHR, physicalDevice.segment(), pPropertyCount, pProperties); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetPhysicalDeviceDisplayProperties2KHR", e); }
    }

    /// Invokes `vkGetPhysicalDeviceDisplayPlaneProperties2KHR`.
    /// ```
    /// (int) VkResult vkGetPhysicalDeviceDisplayPlaneProperties2KHR((struct VkPhysicalDevice*) VkPhysicalDevice physicalDevice, uint32_t* pPropertyCount, VkDisplayPlaneProperties2KHR* pProperties);
    /// ```
    public static int vkGetPhysicalDeviceDisplayPlaneProperties2KHR(@NonNull VkPhysicalDevice physicalDevice, @NonNull MemorySegment pPropertyCount, @NonNull MemorySegment pProperties) {
        if (MemoryUtil.isNullPointer(physicalDevice.capabilities().PFN_vkGetPhysicalDeviceDisplayPlaneProperties2KHR)) throw new VKSymbolNotFoundError("Symbol not found: vkGetPhysicalDeviceDisplayPlaneProperties2KHR");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkGetPhysicalDeviceDisplayPlaneProperties2KHR", physicalDevice, pPropertyCount, pProperties); }
        return (int) Handles.MH_vkGetPhysicalDeviceDisplayPlaneProperties2KHR.get().invokeExact(physicalDevice.capabilities().PFN_vkGetPhysicalDeviceDisplayPlaneProperties2KHR, physicalDevice.segment(), pPropertyCount, pProperties); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetPhysicalDeviceDisplayPlaneProperties2KHR", e); }
    }

    /// Invokes `vkGetDisplayModeProperties2KHR`.
    /// ```
    /// (int) VkResult vkGetDisplayModeProperties2KHR((struct VkPhysicalDevice*) VkPhysicalDevice physicalDevice, (uint64_t) VkDisplayKHR display, uint32_t* pPropertyCount, VkDisplayModeProperties2KHR* pProperties);
    /// ```
    public static int vkGetDisplayModeProperties2KHR(@NonNull VkPhysicalDevice physicalDevice, long display, @NonNull MemorySegment pPropertyCount, @NonNull MemorySegment pProperties) {
        if (MemoryUtil.isNullPointer(physicalDevice.capabilities().PFN_vkGetDisplayModeProperties2KHR)) throw new VKSymbolNotFoundError("Symbol not found: vkGetDisplayModeProperties2KHR");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkGetDisplayModeProperties2KHR", physicalDevice, display, pPropertyCount, pProperties); }
        return (int) Handles.MH_vkGetDisplayModeProperties2KHR.get().invokeExact(physicalDevice.capabilities().PFN_vkGetDisplayModeProperties2KHR, physicalDevice.segment(), display, pPropertyCount, pProperties); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetDisplayModeProperties2KHR", e); }
    }

    /// Invokes `vkGetDisplayPlaneCapabilities2KHR`.
    /// ```
    /// (int) VkResult vkGetDisplayPlaneCapabilities2KHR((struct VkPhysicalDevice*) VkPhysicalDevice physicalDevice, const VkDisplayPlaneInfo2KHR* pDisplayPlaneInfo, VkDisplayPlaneCapabilities2KHR* pCapabilities);
    /// ```
    public static int vkGetDisplayPlaneCapabilities2KHR(@NonNull VkPhysicalDevice physicalDevice, @NonNull MemorySegment pDisplayPlaneInfo, @NonNull MemorySegment pCapabilities) {
        if (MemoryUtil.isNullPointer(physicalDevice.capabilities().PFN_vkGetDisplayPlaneCapabilities2KHR)) throw new VKSymbolNotFoundError("Symbol not found: vkGetDisplayPlaneCapabilities2KHR");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkGetDisplayPlaneCapabilities2KHR", physicalDevice, pDisplayPlaneInfo, pCapabilities); }
        return (int) Handles.MH_vkGetDisplayPlaneCapabilities2KHR.get().invokeExact(physicalDevice.capabilities().PFN_vkGetDisplayPlaneCapabilities2KHR, physicalDevice.segment(), pDisplayPlaneInfo, pCapabilities); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetDisplayPlaneCapabilities2KHR", e); }
    }

}
