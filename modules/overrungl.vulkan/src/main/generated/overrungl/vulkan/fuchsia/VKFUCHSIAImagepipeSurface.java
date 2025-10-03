// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.fuchsia;
import java.lang.foreign.*;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.vulkan.*;
import static overrungl.internal.RuntimeHelper.*;
/// `VK_FUCHSIA_imagepipe_surface` - instance extension
public final class VKFUCHSIAImagepipeSurface {
    public static final int VK_FUCHSIA_IMAGEPIPE_SURFACE_SPEC_VERSION = 1;
    public static final String VK_FUCHSIA_IMAGEPIPE_SURFACE_EXTENSION_NAME = "VK_FUCHSIA_imagepipe_surface";
    public static final int VK_STRUCTURE_TYPE_IMAGEPIPE_SURFACE_CREATE_INFO_FUCHSIA = 1000214000;
    public static final class Handles {
        public static final Supplier<MethodHandle> MH_vkCreateImagePipeSurfaceFUCHSIA = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        private Handles() {}
    }

    private VKFUCHSIAImagepipeSurface() {}

    /// Invokes `vkCreateImagePipeSurfaceFUCHSIA`.
    /// ```
    /// (int) VkResult vkCreateImagePipeSurfaceFUCHSIA((struct VkInstance*) VkInstance instance, const VkImagePipeSurfaceCreateInfoFUCHSIA* pCreateInfo, const VkAllocationCallbacks* pAllocator, VkSurfaceKHR* pSurface);
    /// ```
    public static int vkCreateImagePipeSurfaceFUCHSIA(@NonNull VkInstance instance, @NonNull MemorySegment pCreateInfo, @NonNull MemorySegment pAllocator, @NonNull MemorySegment pSurface) {
        if (MemoryUtil.isNullPointer(instance.capabilities().PFN_vkCreateImagePipeSurfaceFUCHSIA)) throw new VKSymbolNotFoundError("Symbol not found: vkCreateImagePipeSurfaceFUCHSIA");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCreateImagePipeSurfaceFUCHSIA", instance, pCreateInfo, pAllocator, pSurface); }
        return (int) Handles.MH_vkCreateImagePipeSurfaceFUCHSIA.get().invokeExact(instance.capabilities().PFN_vkCreateImagePipeSurfaceFUCHSIA, instance.segment(), pCreateInfo, pAllocator, pSurface); }
        catch (Throwable e) { throw new RuntimeException("error in vkCreateImagePipeSurfaceFUCHSIA", e); }
    }

}
