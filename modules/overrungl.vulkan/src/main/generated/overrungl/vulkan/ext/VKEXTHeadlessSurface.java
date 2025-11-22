// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.vulkan.*;
import static overrungl.internal.RuntimeHelper.*;
/// `VK_EXT_headless_surface` - instance extension
public final class VKEXTHeadlessSurface {
    public static final int VK_EXT_HEADLESS_SURFACE_SPEC_VERSION = 1;
    public static final String VK_EXT_HEADLESS_SURFACE_EXTENSION_NAME = "VK_EXT_headless_surface";
    public static final int VK_STRUCTURE_TYPE_HEADLESS_SURFACE_CREATE_INFO_EXT = 1000256000;
    private VKEXTHeadlessSurface() {}
    public static final class Handles {
        public static final MethodHandle MH_vkCreateHeadlessSurfaceEXT = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        private Handles() {}
    }

    /// Invokes `vkCreateHeadlessSurfaceEXT`.
    /// ```
    /// VkResult vkCreateHeadlessSurfaceEXT(VkInstance instance, const VkHeadlessSurfaceCreateInfoEXT* pCreateInfo, const VkAllocationCallbacks* pAllocator, VkSurfaceKHR* pSurface);
    /// ```
    public static int vkCreateHeadlessSurfaceEXT(@NonNull VkInstance instance, @NonNull MemorySegment pCreateInfo, @NonNull MemorySegment pAllocator, @NonNull MemorySegment pSurface) {
        if (MemoryUtil.isNullPointer(instance.capabilities().PFN_vkCreateHeadlessSurfaceEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkCreateHeadlessSurfaceEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCreateHeadlessSurfaceEXT", instance, pCreateInfo, pAllocator, pSurface); }
        return (int) Handles.MH_vkCreateHeadlessSurfaceEXT.invokeExact(instance.capabilities().PFN_vkCreateHeadlessSurfaceEXT, instance.segment(), pCreateInfo, pAllocator, pSurface); }
        catch (Throwable e) { throw new RuntimeException("error in vkCreateHeadlessSurfaceEXT", e); }
    }

}
