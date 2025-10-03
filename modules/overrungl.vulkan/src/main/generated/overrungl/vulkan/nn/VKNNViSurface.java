// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.nn;
import java.lang.foreign.*;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.vulkan.*;
import static overrungl.internal.RuntimeHelper.*;
/// `VK_NN_vi_surface` - instance extension
public final class VKNNViSurface {
    public static final int VK_NN_VI_SURFACE_SPEC_VERSION = 1;
    public static final String VK_NN_VI_SURFACE_EXTENSION_NAME = "VK_NN_vi_surface";
    public static final int VK_STRUCTURE_TYPE_VI_SURFACE_CREATE_INFO_NN = 1000062000;
    public static final class Handles {
        public static final Supplier<MethodHandle> MH_vkCreateViSurfaceNN = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        private Handles() {}
    }

    private VKNNViSurface() {}

    /// Invokes `vkCreateViSurfaceNN`.
    /// ```
    /// (int) VkResult vkCreateViSurfaceNN((struct VkInstance*) VkInstance instance, const VkViSurfaceCreateInfoNN* pCreateInfo, const VkAllocationCallbacks* pAllocator, VkSurfaceKHR* pSurface);
    /// ```
    public static int vkCreateViSurfaceNN(@NonNull VkInstance instance, @NonNull MemorySegment pCreateInfo, @NonNull MemorySegment pAllocator, @NonNull MemorySegment pSurface) {
        if (MemoryUtil.isNullPointer(instance.capabilities().PFN_vkCreateViSurfaceNN)) throw new VKSymbolNotFoundError("Symbol not found: vkCreateViSurfaceNN");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCreateViSurfaceNN", instance, pCreateInfo, pAllocator, pSurface); }
        return (int) Handles.MH_vkCreateViSurfaceNN.get().invokeExact(instance.capabilities().PFN_vkCreateViSurfaceNN, instance.segment(), pCreateInfo, pAllocator, pSurface); }
        catch (Throwable e) { throw new RuntimeException("error in vkCreateViSurfaceNN", e); }
    }

}
