// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.nv;
import java.lang.foreign.*;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.vulkan.*;
import static overrungl.internal.RuntimeHelper.*;
/// `VK_NV_external_memory_win32` - device extension
public final class VKNVExternalMemoryWin32 {
    public static final int VK_NV_EXTERNAL_MEMORY_WIN32_SPEC_VERSION = 1;
    public static final String VK_NV_EXTERNAL_MEMORY_WIN32_EXTENSION_NAME = "VK_NV_external_memory_win32";
    public static final int VK_STRUCTURE_TYPE_IMPORT_MEMORY_WIN32_HANDLE_INFO_NV = 1000057000;
    public static final int VK_STRUCTURE_TYPE_EXPORT_MEMORY_WIN32_HANDLE_INFO_NV = 1000057001;
    public static final class Handles {
        public static final Supplier<MethodHandle> MH_vkGetMemoryWin32HandleNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        private Handles() {}
    }

    private VKNVExternalMemoryWin32() {}

    /// Invokes `vkGetMemoryWin32HandleNV`.
    /// ```
    /// (int) VkResult vkGetMemoryWin32HandleNV((struct VkDevice*) VkDevice device, (uint64_t) VkDeviceMemory memory, ((uint32_t) VkFlags) VkExternalMemoryHandleTypeFlagsNV handleType, HANDLE* pHandle);
    /// ```
    public static int vkGetMemoryWin32HandleNV(@NonNull VkDevice device, long memory, int handleType, @NonNull MemorySegment pHandle) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkGetMemoryWin32HandleNV)) throw new VKSymbolNotFoundError("Symbol not found: vkGetMemoryWin32HandleNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkGetMemoryWin32HandleNV", device, memory, handleType, pHandle); }
        return (int) Handles.MH_vkGetMemoryWin32HandleNV.get().invokeExact(device.capabilities().PFN_vkGetMemoryWin32HandleNV, device.segment(), memory, handleType, pHandle); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetMemoryWin32HandleNV", e); }
    }

}
