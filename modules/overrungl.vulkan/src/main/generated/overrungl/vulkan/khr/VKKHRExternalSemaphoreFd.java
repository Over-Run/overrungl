// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr;
import java.lang.foreign.*;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.vulkan.*;
import static overrungl.internal.RuntimeHelper.*;
/// `VK_KHR_external_semaphore_fd` - device extension
public final class VKKHRExternalSemaphoreFd {
    public static final int VK_KHR_EXTERNAL_SEMAPHORE_FD_SPEC_VERSION = 1;
    public static final String VK_KHR_EXTERNAL_SEMAPHORE_FD_EXTENSION_NAME = "VK_KHR_external_semaphore_fd";
    public static final int VK_STRUCTURE_TYPE_IMPORT_SEMAPHORE_FD_INFO_KHR = 1000079000;
    public static final int VK_STRUCTURE_TYPE_SEMAPHORE_GET_FD_INFO_KHR = 1000079001;
    public static final class Handles {
        public static final Supplier<MethodHandle> MH_vkImportSemaphoreFdKHR = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_vkGetSemaphoreFdKHR = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        private Handles() {}
    }

    private VKKHRExternalSemaphoreFd() {}

    /// Invokes `vkImportSemaphoreFdKHR`.
    /// ```
    /// (int) VkResult vkImportSemaphoreFdKHR((struct VkDevice*) VkDevice device, const VkImportSemaphoreFdInfoKHR* pImportSemaphoreFdInfo);
    /// ```
    public static int vkImportSemaphoreFdKHR(@NonNull VkDevice device, @NonNull MemorySegment pImportSemaphoreFdInfo) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkImportSemaphoreFdKHR)) throw new VKSymbolNotFoundError("Symbol not found: vkImportSemaphoreFdKHR");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkImportSemaphoreFdKHR", device, pImportSemaphoreFdInfo); }
        return (int) Handles.MH_vkImportSemaphoreFdKHR.get().invokeExact(device.capabilities().PFN_vkImportSemaphoreFdKHR, device.segment(), pImportSemaphoreFdInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkImportSemaphoreFdKHR", e); }
    }

    /// Invokes `vkGetSemaphoreFdKHR`.
    /// ```
    /// (int) VkResult vkGetSemaphoreFdKHR((struct VkDevice*) VkDevice device, const VkSemaphoreGetFdInfoKHR* pGetFdInfo, int* pFd);
    /// ```
    public static int vkGetSemaphoreFdKHR(@NonNull VkDevice device, @NonNull MemorySegment pGetFdInfo, @NonNull MemorySegment pFd) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkGetSemaphoreFdKHR)) throw new VKSymbolNotFoundError("Symbol not found: vkGetSemaphoreFdKHR");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkGetSemaphoreFdKHR", device, pGetFdInfo, pFd); }
        return (int) Handles.MH_vkGetSemaphoreFdKHR.get().invokeExact(device.capabilities().PFN_vkGetSemaphoreFdKHR, device.segment(), pGetFdInfo, pFd); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetSemaphoreFdKHR", e); }
    }

}
