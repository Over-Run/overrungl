// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.vulkan.*;
import static overrungl.internal.RuntimeHelper.*;
/// `VK_EXT_directfb_surface` - instance extension
public final class VKEXTDirectfbSurface {
    public static final int VK_EXT_DIRECTFB_SURFACE_SPEC_VERSION = 1;
    public static final String VK_EXT_DIRECTFB_SURFACE_EXTENSION_NAME = "VK_EXT_directfb_surface";
    public static final int VK_STRUCTURE_TYPE_DIRECTFB_SURFACE_CREATE_INFO_EXT = 1000346000;
    private VKEXTDirectfbSurface() {}
    public static final class Handles {
        public static final MethodHandle MH_vkCreateDirectFBSurfaceEXT = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetPhysicalDeviceDirectFBPresentationSupportEXT = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        private Handles() {}
    }

    /// Invokes `vkCreateDirectFBSurfaceEXT`.
    /// ```
    /// VkResult vkCreateDirectFBSurfaceEXT(VkInstance instance, const VkDirectFBSurfaceCreateInfoEXT* pCreateInfo, const VkAllocationCallbacks* pAllocator, VkSurfaceKHR* pSurface);
    /// ```
    public static int vkCreateDirectFBSurfaceEXT(@NonNull VkInstance instance, @NonNull MemorySegment pCreateInfo, @NonNull MemorySegment pAllocator, @NonNull MemorySegment pSurface) {
        if (MemoryUtil.isNullPointer(instance.capabilities().PFN_vkCreateDirectFBSurfaceEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkCreateDirectFBSurfaceEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCreateDirectFBSurfaceEXT", instance, pCreateInfo, pAllocator, pSurface); }
        return (int) Handles.MH_vkCreateDirectFBSurfaceEXT.invokeExact(instance.capabilities().PFN_vkCreateDirectFBSurfaceEXT, instance.segment(), pCreateInfo, pAllocator, pSurface); }
        catch (Throwable e) { throw new RuntimeException("error in vkCreateDirectFBSurfaceEXT", e); }
    }

    /// Invokes `vkGetPhysicalDeviceDirectFBPresentationSupportEXT`.
    /// ```
    /// VkBool32 vkGetPhysicalDeviceDirectFBPresentationSupportEXT(VkPhysicalDevice physicalDevice, uint32_t queueFamilyIndex, IDirectFB* dfb);
    /// ```
    public static int vkGetPhysicalDeviceDirectFBPresentationSupportEXT(@NonNull VkPhysicalDevice physicalDevice, int queueFamilyIndex, @NonNull MemorySegment dfb) {
        if (MemoryUtil.isNullPointer(physicalDevice.capabilities().PFN_vkGetPhysicalDeviceDirectFBPresentationSupportEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkGetPhysicalDeviceDirectFBPresentationSupportEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkGetPhysicalDeviceDirectFBPresentationSupportEXT", physicalDevice, queueFamilyIndex, dfb); }
        return (int) Handles.MH_vkGetPhysicalDeviceDirectFBPresentationSupportEXT.invokeExact(physicalDevice.capabilities().PFN_vkGetPhysicalDeviceDirectFBPresentationSupportEXT, physicalDevice.segment(), queueFamilyIndex, dfb); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetPhysicalDeviceDirectFBPresentationSupportEXT", e); }
    }

}
