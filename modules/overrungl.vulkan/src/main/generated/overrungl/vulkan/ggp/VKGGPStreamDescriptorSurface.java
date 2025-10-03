// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ggp;
import java.lang.foreign.*;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.vulkan.*;
import static overrungl.internal.RuntimeHelper.*;
/// `VK_GGP_stream_descriptor_surface` - instance extension
public final class VKGGPStreamDescriptorSurface {
    public static final int VK_GGP_STREAM_DESCRIPTOR_SURFACE_SPEC_VERSION = 1;
    public static final String VK_GGP_STREAM_DESCRIPTOR_SURFACE_EXTENSION_NAME = "VK_GGP_stream_descriptor_surface";
    public static final int VK_STRUCTURE_TYPE_STREAM_DESCRIPTOR_SURFACE_CREATE_INFO_GGP = 1000049000;
    public static final class Handles {
        public static final Supplier<MethodHandle> MH_vkCreateStreamDescriptorSurfaceGGP = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        private Handles() {}
    }

    private VKGGPStreamDescriptorSurface() {}

    /// Invokes `vkCreateStreamDescriptorSurfaceGGP`.
    /// ```
    /// (int) VkResult vkCreateStreamDescriptorSurfaceGGP((struct VkInstance*) VkInstance instance, const VkStreamDescriptorSurfaceCreateInfoGGP* pCreateInfo, const VkAllocationCallbacks* pAllocator, VkSurfaceKHR* pSurface);
    /// ```
    public static int vkCreateStreamDescriptorSurfaceGGP(@NonNull VkInstance instance, @NonNull MemorySegment pCreateInfo, @NonNull MemorySegment pAllocator, @NonNull MemorySegment pSurface) {
        if (MemoryUtil.isNullPointer(instance.capabilities().PFN_vkCreateStreamDescriptorSurfaceGGP)) throw new VKSymbolNotFoundError("Symbol not found: vkCreateStreamDescriptorSurfaceGGP");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCreateStreamDescriptorSurfaceGGP", instance, pCreateInfo, pAllocator, pSurface); }
        return (int) Handles.MH_vkCreateStreamDescriptorSurfaceGGP.get().invokeExact(instance.capabilities().PFN_vkCreateStreamDescriptorSurfaceGGP, instance.segment(), pCreateInfo, pAllocator, pSurface); }
        catch (Throwable e) { throw new RuntimeException("error in vkCreateStreamDescriptorSurfaceGGP", e); }
    }

}
