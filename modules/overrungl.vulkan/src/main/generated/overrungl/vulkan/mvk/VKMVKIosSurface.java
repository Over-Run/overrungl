// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.mvk;
import java.lang.foreign.*;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.vulkan.*;
import static overrungl.internal.RuntimeHelper.*;
/// `VK_MVK_ios_surface` - instance extension
public final class VKMVKIosSurface {
    public static final int VK_MVK_IOS_SURFACE_SPEC_VERSION = 3;
    public static final String VK_MVK_IOS_SURFACE_EXTENSION_NAME = "VK_MVK_ios_surface";
    public static final int VK_STRUCTURE_TYPE_IOS_SURFACE_CREATE_INFO_MVK = 1000122000;
    public static final class Handles {
        public static final Supplier<MethodHandle> MH_vkCreateIOSSurfaceMVK = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        private Handles() {}
    }

    private VKMVKIosSurface() {}

    /// Invokes `vkCreateIOSSurfaceMVK`.
    /// ```
    /// (int) VkResult vkCreateIOSSurfaceMVK((struct VkInstance*) VkInstance instance, const VkIOSSurfaceCreateInfoMVK* pCreateInfo, const VkAllocationCallbacks* pAllocator, VkSurfaceKHR* pSurface);
    /// ```
    public static int vkCreateIOSSurfaceMVK(@NonNull VkInstance instance, @NonNull MemorySegment pCreateInfo, @NonNull MemorySegment pAllocator, @NonNull MemorySegment pSurface) {
        if (MemoryUtil.isNullPointer(instance.capabilities().PFN_vkCreateIOSSurfaceMVK)) throw new VKSymbolNotFoundError("Symbol not found: vkCreateIOSSurfaceMVK");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCreateIOSSurfaceMVK", instance, pCreateInfo, pAllocator, pSurface); }
        return (int) Handles.MH_vkCreateIOSSurfaceMVK.get().invokeExact(instance.capabilities().PFN_vkCreateIOSSurfaceMVK, instance.segment(), pCreateInfo, pAllocator, pSurface); }
        catch (Throwable e) { throw new RuntimeException("error in vkCreateIOSSurfaceMVK", e); }
    }

}
