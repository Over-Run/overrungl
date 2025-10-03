// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.vulkan.*;
import static overrungl.internal.RuntimeHelper.*;
/// `VK_EXT_metal_surface` - instance extension
public final class VKEXTMetalSurface {
    public static final int VK_EXT_METAL_SURFACE_SPEC_VERSION = 1;
    public static final String VK_EXT_METAL_SURFACE_EXTENSION_NAME = "VK_EXT_metal_surface";
    public static final int VK_STRUCTURE_TYPE_METAL_SURFACE_CREATE_INFO_EXT = 1000217000;
    public static final class Handles {
        public static final MethodHandle MH_vkCreateMetalSurfaceEXT = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        private Handles() {}
    }

    private VKEXTMetalSurface() {}

    /// Invokes `vkCreateMetalSurfaceEXT`.
    /// ```
    /// (int) VkResult vkCreateMetalSurfaceEXT((struct VkInstance*) VkInstance instance, const VkMetalSurfaceCreateInfoEXT* pCreateInfo, const VkAllocationCallbacks* pAllocator, VkSurfaceKHR* pSurface);
    /// ```
    public static int vkCreateMetalSurfaceEXT(@NonNull VkInstance instance, @NonNull MemorySegment pCreateInfo, @NonNull MemorySegment pAllocator, @NonNull MemorySegment pSurface) {
        if (MemoryUtil.isNullPointer(instance.capabilities().PFN_vkCreateMetalSurfaceEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkCreateMetalSurfaceEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCreateMetalSurfaceEXT", instance, pCreateInfo, pAllocator, pSurface); }
        return (int) Handles.MH_vkCreateMetalSurfaceEXT.invokeExact(instance.capabilities().PFN_vkCreateMetalSurfaceEXT, instance.segment(), pCreateInfo, pAllocator, pSurface); }
        catch (Throwable e) { throw new RuntimeException("error in vkCreateMetalSurfaceEXT", e); }
    }

}
