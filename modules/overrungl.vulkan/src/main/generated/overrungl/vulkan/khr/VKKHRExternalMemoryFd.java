// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr;
import java.lang.foreign.*;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.vulkan.*;
import static overrungl.internal.RuntimeHelper.*;
/// `VK_KHR_external_memory_fd` - device extension
public final class VKKHRExternalMemoryFd {
    public static final int VK_KHR_EXTERNAL_MEMORY_FD_SPEC_VERSION = 1;
    public static final String VK_KHR_EXTERNAL_MEMORY_FD_EXTENSION_NAME = "VK_KHR_external_memory_fd";
    public static final int VK_STRUCTURE_TYPE_IMPORT_MEMORY_FD_INFO_KHR = 1000074000;
    public static final int VK_STRUCTURE_TYPE_MEMORY_FD_PROPERTIES_KHR = 1000074001;
    public static final int VK_STRUCTURE_TYPE_MEMORY_GET_FD_INFO_KHR = 1000074002;
    public static final class Handles {
        public static final Supplier<MethodHandle> MH_vkGetMemoryFdKHR = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_vkGetMemoryFdPropertiesKHR = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        private Handles() {}
    }

    private VKKHRExternalMemoryFd() {}

    /// Invokes `vkGetMemoryFdKHR`.
    /// ```
    /// (int) VkResult vkGetMemoryFdKHR((struct VkDevice*) VkDevice device, const VkMemoryGetFdInfoKHR* pGetFdInfo, int* pFd);
    /// ```
    public static int vkGetMemoryFdKHR(@NonNull VkDevice device, @NonNull MemorySegment pGetFdInfo, @NonNull MemorySegment pFd) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkGetMemoryFdKHR)) throw new VKSymbolNotFoundError("Symbol not found: vkGetMemoryFdKHR");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkGetMemoryFdKHR", device, pGetFdInfo, pFd); }
        return (int) Handles.MH_vkGetMemoryFdKHR.get().invokeExact(device.capabilities().PFN_vkGetMemoryFdKHR, device.segment(), pGetFdInfo, pFd); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetMemoryFdKHR", e); }
    }

    /// Invokes `vkGetMemoryFdPropertiesKHR`.
    /// ```
    /// (int) VkResult vkGetMemoryFdPropertiesKHR((struct VkDevice*) VkDevice device, (int) VkExternalMemoryHandleTypeFlagBits handleType, int fd, VkMemoryFdPropertiesKHR* pMemoryFdProperties);
    /// ```
    public static int vkGetMemoryFdPropertiesKHR(@NonNull VkDevice device, int handleType, int fd, @NonNull MemorySegment pMemoryFdProperties) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkGetMemoryFdPropertiesKHR)) throw new VKSymbolNotFoundError("Symbol not found: vkGetMemoryFdPropertiesKHR");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkGetMemoryFdPropertiesKHR", device, handleType, fd, pMemoryFdProperties); }
        return (int) Handles.MH_vkGetMemoryFdPropertiesKHR.get().invokeExact(device.capabilities().PFN_vkGetMemoryFdPropertiesKHR, device.segment(), handleType, fd, pMemoryFdProperties); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetMemoryFdPropertiesKHR", e); }
    }

}
