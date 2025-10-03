// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.mvk;
import java.lang.foreign.*;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.vulkan.*;
import static overrungl.internal.RuntimeHelper.*;
/// `VK_MVK_macos_surface` - instance extension
public final class VKMVKMacosSurface {
    public static final int VK_MVK_MACOS_SURFACE_SPEC_VERSION = 3;
    public static final String VK_MVK_MACOS_SURFACE_EXTENSION_NAME = "VK_MVK_macos_surface";
    public static final int VK_STRUCTURE_TYPE_MACOS_SURFACE_CREATE_INFO_MVK = 1000123000;
    public static final class Handles {
        public static final Supplier<MethodHandle> MH_vkCreateMacOSSurfaceMVK = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        private Handles() {}
    }

    private VKMVKMacosSurface() {}

    /// Invokes `vkCreateMacOSSurfaceMVK`.
    /// ```
    /// (int) VkResult vkCreateMacOSSurfaceMVK((struct VkInstance*) VkInstance instance, const VkMacOSSurfaceCreateInfoMVK* pCreateInfo, const VkAllocationCallbacks* pAllocator, VkSurfaceKHR* pSurface);
    /// ```
    public static int vkCreateMacOSSurfaceMVK(@NonNull VkInstance instance, @NonNull MemorySegment pCreateInfo, @NonNull MemorySegment pAllocator, @NonNull MemorySegment pSurface) {
        if (MemoryUtil.isNullPointer(instance.capabilities().PFN_vkCreateMacOSSurfaceMVK)) throw new VKSymbolNotFoundError("Symbol not found: vkCreateMacOSSurfaceMVK");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCreateMacOSSurfaceMVK", instance, pCreateInfo, pAllocator, pSurface); }
        return (int) Handles.MH_vkCreateMacOSSurfaceMVK.get().invokeExact(instance.capabilities().PFN_vkCreateMacOSSurfaceMVK, instance.segment(), pCreateInfo, pAllocator, pSurface); }
        catch (Throwable e) { throw new RuntimeException("error in vkCreateMacOSSurfaceMVK", e); }
    }

}
