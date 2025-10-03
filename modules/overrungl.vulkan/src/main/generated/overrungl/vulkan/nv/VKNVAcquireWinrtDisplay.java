// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.nv;
import java.lang.foreign.*;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.vulkan.*;
import static overrungl.internal.RuntimeHelper.*;
/// `VK_NV_acquire_winrt_display` - device extension
public final class VKNVAcquireWinrtDisplay {
    public static final int VK_NV_ACQUIRE_WINRT_DISPLAY_SPEC_VERSION = 1;
    public static final String VK_NV_ACQUIRE_WINRT_DISPLAY_EXTENSION_NAME = "VK_NV_acquire_winrt_display";
    public static final class Handles {
        public static final Supplier<MethodHandle> MH_vkAcquireWinrtDisplayNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)));
        public static final Supplier<MethodHandle> MH_vkGetWinrtDisplayNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        private Handles() {}
    }

    private VKNVAcquireWinrtDisplay() {}

    /// Invokes `vkAcquireWinrtDisplayNV`.
    /// ```
    /// (int) VkResult vkAcquireWinrtDisplayNV((struct VkPhysicalDevice*) VkPhysicalDevice physicalDevice, (uint64_t) VkDisplayKHR display);
    /// ```
    public static int vkAcquireWinrtDisplayNV(@NonNull VkPhysicalDevice physicalDevice, long display) {
        if (MemoryUtil.isNullPointer(physicalDevice.capabilities().PFN_vkAcquireWinrtDisplayNV)) throw new VKSymbolNotFoundError("Symbol not found: vkAcquireWinrtDisplayNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkAcquireWinrtDisplayNV", physicalDevice, display); }
        return (int) Handles.MH_vkAcquireWinrtDisplayNV.get().invokeExact(physicalDevice.capabilities().PFN_vkAcquireWinrtDisplayNV, physicalDevice.segment(), display); }
        catch (Throwable e) { throw new RuntimeException("error in vkAcquireWinrtDisplayNV", e); }
    }

    /// Invokes `vkGetWinrtDisplayNV`.
    /// ```
    /// (int) VkResult vkGetWinrtDisplayNV((struct VkPhysicalDevice*) VkPhysicalDevice physicalDevice, uint32_t deviceRelativeId, VkDisplayKHR* pDisplay);
    /// ```
    public static int vkGetWinrtDisplayNV(@NonNull VkPhysicalDevice physicalDevice, int deviceRelativeId, @NonNull MemorySegment pDisplay) {
        if (MemoryUtil.isNullPointer(physicalDevice.capabilities().PFN_vkGetWinrtDisplayNV)) throw new VKSymbolNotFoundError("Symbol not found: vkGetWinrtDisplayNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkGetWinrtDisplayNV", physicalDevice, deviceRelativeId, pDisplay); }
        return (int) Handles.MH_vkGetWinrtDisplayNV.get().invokeExact(physicalDevice.capabilities().PFN_vkGetWinrtDisplayNV, physicalDevice.segment(), deviceRelativeId, pDisplay); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetWinrtDisplayNV", e); }
    }

}
