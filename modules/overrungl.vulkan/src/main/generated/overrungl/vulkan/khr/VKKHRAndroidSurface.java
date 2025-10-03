// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr;
import java.lang.foreign.*;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.vulkan.*;
import static overrungl.internal.RuntimeHelper.*;
/// `VK_KHR_android_surface` - instance extension
public final class VKKHRAndroidSurface {
    public static final int VK_KHR_ANDROID_SURFACE_SPEC_VERSION = 6;
    public static final String VK_KHR_ANDROID_SURFACE_EXTENSION_NAME = "VK_KHR_android_surface";
    public static final int VK_STRUCTURE_TYPE_ANDROID_SURFACE_CREATE_INFO_KHR = 1000008000;
    public static final class Handles {
        public static final Supplier<MethodHandle> MH_vkCreateAndroidSurfaceKHR = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        private Handles() {}
    }

    private VKKHRAndroidSurface() {}

    /// Invokes `vkCreateAndroidSurfaceKHR`.
    /// ```
    /// (int) VkResult vkCreateAndroidSurfaceKHR((struct VkInstance*) VkInstance instance, const VkAndroidSurfaceCreateInfoKHR* pCreateInfo, const VkAllocationCallbacks* pAllocator, VkSurfaceKHR* pSurface);
    /// ```
    public static int vkCreateAndroidSurfaceKHR(@NonNull VkInstance instance, @NonNull MemorySegment pCreateInfo, @NonNull MemorySegment pAllocator, @NonNull MemorySegment pSurface) {
        if (MemoryUtil.isNullPointer(instance.capabilities().PFN_vkCreateAndroidSurfaceKHR)) throw new VKSymbolNotFoundError("Symbol not found: vkCreateAndroidSurfaceKHR");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCreateAndroidSurfaceKHR", instance, pCreateInfo, pAllocator, pSurface); }
        return (int) Handles.MH_vkCreateAndroidSurfaceKHR.get().invokeExact(instance.capabilities().PFN_vkCreateAndroidSurfaceKHR, instance.segment(), pCreateInfo, pAllocator, pSurface); }
        catch (Throwable e) { throw new RuntimeException("error in vkCreateAndroidSurfaceKHR", e); }
    }

}
