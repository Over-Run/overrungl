// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.vulkan.*;
import static overrungl.internal.RuntimeHelper.*;
/// `VK_KHR_map_memory2` - device extension
public final class VKKHRMapMemory2 {
    public static final int VK_KHR_MAP_MEMORY_2_SPEC_VERSION = 1;
    public static final String VK_KHR_MAP_MEMORY_2_EXTENSION_NAME = "VK_KHR_map_memory2";
    public static final int VK_STRUCTURE_TYPE_MEMORY_MAP_INFO_KHR = 1000271000;
    public static final int VK_STRUCTURE_TYPE_MEMORY_UNMAP_INFO_KHR = 1000271001;
    public static final class Handles {
        public static final MethodHandle MH_vkMapMemory2KHR = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkUnmapMemory2KHR = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        private Handles() {}
    }

    private VKKHRMapMemory2() {}

    /// Invokes `vkMapMemory2KHR`.
    /// ```
    /// (int) VkResult vkMapMemory2KHR((struct VkDevice*) VkDevice device, const VkMemoryMapInfo* pMemoryMapInfo, void** ppData);
    /// ```
    public static int vkMapMemory2KHR(@NonNull VkDevice device, @NonNull MemorySegment pMemoryMapInfo, @NonNull MemorySegment ppData) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkMapMemory2KHR)) throw new VKSymbolNotFoundError("Symbol not found: vkMapMemory2KHR");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkMapMemory2KHR", device, pMemoryMapInfo, ppData); }
        return (int) Handles.MH_vkMapMemory2KHR.invokeExact(device.capabilities().PFN_vkMapMemory2KHR, device.segment(), pMemoryMapInfo, ppData); }
        catch (Throwable e) { throw new RuntimeException("error in vkMapMemory2KHR", e); }
    }

    /// Invokes `vkUnmapMemory2KHR`.
    /// ```
    /// (int) VkResult vkUnmapMemory2KHR((struct VkDevice*) VkDevice device, const VkMemoryUnmapInfo* pMemoryUnmapInfo);
    /// ```
    public static int vkUnmapMemory2KHR(@NonNull VkDevice device, @NonNull MemorySegment pMemoryUnmapInfo) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkUnmapMemory2KHR)) throw new VKSymbolNotFoundError("Symbol not found: vkUnmapMemory2KHR");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkUnmapMemory2KHR", device, pMemoryUnmapInfo); }
        return (int) Handles.MH_vkUnmapMemory2KHR.invokeExact(device.capabilities().PFN_vkUnmapMemory2KHR, device.segment(), pMemoryUnmapInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkUnmapMemory2KHR", e); }
    }

}
