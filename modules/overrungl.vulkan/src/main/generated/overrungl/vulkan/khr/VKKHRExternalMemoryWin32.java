// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr;
import java.lang.foreign.*;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.vulkan.*;
import static overrungl.internal.RuntimeHelper.*;
/// `VK_KHR_external_memory_win32` - device extension
public final class VKKHRExternalMemoryWin32 {
    public static final int VK_KHR_EXTERNAL_MEMORY_WIN32_SPEC_VERSION = 1;
    public static final String VK_KHR_EXTERNAL_MEMORY_WIN32_EXTENSION_NAME = "VK_KHR_external_memory_win32";
    public static final int VK_STRUCTURE_TYPE_IMPORT_MEMORY_WIN32_HANDLE_INFO_KHR = 1000073000;
    public static final int VK_STRUCTURE_TYPE_EXPORT_MEMORY_WIN32_HANDLE_INFO_KHR = 1000073001;
    public static final int VK_STRUCTURE_TYPE_MEMORY_WIN32_HANDLE_PROPERTIES_KHR = 1000073002;
    public static final int VK_STRUCTURE_TYPE_MEMORY_GET_WIN32_HANDLE_INFO_KHR = 1000073003;
    public static final class Handles {
        public static final Supplier<MethodHandle> MH_vkGetMemoryWin32HandleKHR = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_vkGetMemoryWin32HandlePropertiesKHR = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        private Handles() {}
    }

    private VKKHRExternalMemoryWin32() {}

    /// Invokes `vkGetMemoryWin32HandleKHR`.
    /// ```
    /// (int) VkResult vkGetMemoryWin32HandleKHR((struct VkDevice*) VkDevice device, const VkMemoryGetWin32HandleInfoKHR* pGetWin32HandleInfo, HANDLE* pHandle);
    /// ```
    public static int vkGetMemoryWin32HandleKHR(@NonNull VkDevice device, @NonNull MemorySegment pGetWin32HandleInfo, @NonNull MemorySegment pHandle) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkGetMemoryWin32HandleKHR)) throw new VKSymbolNotFoundError("Symbol not found: vkGetMemoryWin32HandleKHR");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkGetMemoryWin32HandleKHR", device, pGetWin32HandleInfo, pHandle); }
        return (int) Handles.MH_vkGetMemoryWin32HandleKHR.get().invokeExact(device.capabilities().PFN_vkGetMemoryWin32HandleKHR, device.segment(), pGetWin32HandleInfo, pHandle); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetMemoryWin32HandleKHR", e); }
    }

    /// Invokes `vkGetMemoryWin32HandlePropertiesKHR`.
    /// ```
    /// (int) VkResult vkGetMemoryWin32HandlePropertiesKHR((struct VkDevice*) VkDevice device, (int) VkExternalMemoryHandleTypeFlagBits handleType, (void*) HANDLE handle, VkMemoryWin32HandlePropertiesKHR* pMemoryWin32HandleProperties);
    /// ```
    public static int vkGetMemoryWin32HandlePropertiesKHR(@NonNull VkDevice device, int handleType, @NonNull MemorySegment handle, @NonNull MemorySegment pMemoryWin32HandleProperties) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkGetMemoryWin32HandlePropertiesKHR)) throw new VKSymbolNotFoundError("Symbol not found: vkGetMemoryWin32HandlePropertiesKHR");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkGetMemoryWin32HandlePropertiesKHR", device, handleType, handle, pMemoryWin32HandleProperties); }
        return (int) Handles.MH_vkGetMemoryWin32HandlePropertiesKHR.get().invokeExact(device.capabilities().PFN_vkGetMemoryWin32HandlePropertiesKHR, device.segment(), handleType, handle, pMemoryWin32HandleProperties); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetMemoryWin32HandlePropertiesKHR", e); }
    }

}
