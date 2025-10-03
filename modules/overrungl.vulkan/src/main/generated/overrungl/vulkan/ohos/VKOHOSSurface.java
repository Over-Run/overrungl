// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ohos;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.vulkan.*;
import static overrungl.internal.RuntimeHelper.*;
/// `VK_OHOS_surface` - instance extension
public final class VKOHOSSurface {
    public static final int VK_OHOS_SURFACE_SPEC_VERSION = 1;
    public static final String VK_OHOS_SURFACE_EXTENSION_NAME = "VK_OHOS_surface";
    public static final int VK_STRUCTURE_TYPE_SURFACE_CREATE_INFO_OHOS = 1000685000;
    public static final class Handles {
        public static final MethodHandle MH_vkCreateSurfaceOHOS = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        private Handles() {}
    }

    private VKOHOSSurface() {}

    /// Invokes `vkCreateSurfaceOHOS`.
    /// ```
    /// (int) VkResult vkCreateSurfaceOHOS((struct VkInstance*) VkInstance instance, const VkSurfaceCreateInfoOHOS* pCreateInfo, const VkAllocationCallbacks* pAllocator, VkSurfaceKHR* pSurface);
    /// ```
    public static int vkCreateSurfaceOHOS(@NonNull VkInstance instance, @NonNull MemorySegment pCreateInfo, @NonNull MemorySegment pAllocator, @NonNull MemorySegment pSurface) {
        if (MemoryUtil.isNullPointer(instance.capabilities().PFN_vkCreateSurfaceOHOS)) throw new VKSymbolNotFoundError("Symbol not found: vkCreateSurfaceOHOS");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCreateSurfaceOHOS", instance, pCreateInfo, pAllocator, pSurface); }
        return (int) Handles.MH_vkCreateSurfaceOHOS.invokeExact(instance.capabilities().PFN_vkCreateSurfaceOHOS, instance.segment(), pCreateInfo, pAllocator, pSurface); }
        catch (Throwable e) { throw new RuntimeException("error in vkCreateSurfaceOHOS", e); }
    }

}
