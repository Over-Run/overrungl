// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.vulkan.*;
import static overrungl.internal.RuntimeHelper.*;
/// `VK_KHR_external_semaphore_win32` - device extension
public final class VKKHRExternalSemaphoreWin32 {
    public static final int VK_KHR_EXTERNAL_SEMAPHORE_WIN32_SPEC_VERSION = 1;
    public static final String VK_KHR_EXTERNAL_SEMAPHORE_WIN32_EXTENSION_NAME = "VK_KHR_external_semaphore_win32";
    public static final int VK_STRUCTURE_TYPE_IMPORT_SEMAPHORE_WIN32_HANDLE_INFO_KHR = 1000078000;
    public static final int VK_STRUCTURE_TYPE_EXPORT_SEMAPHORE_WIN32_HANDLE_INFO_KHR = 1000078001;
    public static final int VK_STRUCTURE_TYPE_D3D12_FENCE_SUBMIT_INFO_KHR = 1000078002;
    public static final int VK_STRUCTURE_TYPE_SEMAPHORE_GET_WIN32_HANDLE_INFO_KHR = 1000078003;
    private VKKHRExternalSemaphoreWin32() {}
    public static final class Handles {
        public static final MethodHandle MH_vkImportSemaphoreWin32HandleKHR = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetSemaphoreWin32HandleKHR = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        private Handles() {}
    }

    /// Invokes `vkImportSemaphoreWin32HandleKHR`.
    /// ```
    /// VkResult vkImportSemaphoreWin32HandleKHR(VkDevice device, const VkImportSemaphoreWin32HandleInfoKHR* pImportSemaphoreWin32HandleInfo);
    /// ```
    public static int vkImportSemaphoreWin32HandleKHR(@NonNull VkDevice device, @NonNull MemorySegment pImportSemaphoreWin32HandleInfo) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkImportSemaphoreWin32HandleKHR)) throw new VKSymbolNotFoundError("Symbol not found: vkImportSemaphoreWin32HandleKHR");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkImportSemaphoreWin32HandleKHR", device, pImportSemaphoreWin32HandleInfo); }
        return (int) Handles.MH_vkImportSemaphoreWin32HandleKHR.invokeExact(device.capabilities().PFN_vkImportSemaphoreWin32HandleKHR, device.segment(), pImportSemaphoreWin32HandleInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkImportSemaphoreWin32HandleKHR", e); }
    }

    /// Invokes `vkGetSemaphoreWin32HandleKHR`.
    /// ```
    /// VkResult vkGetSemaphoreWin32HandleKHR(VkDevice device, const VkSemaphoreGetWin32HandleInfoKHR* pGetWin32HandleInfo, HANDLE* pHandle);
    /// ```
    public static int vkGetSemaphoreWin32HandleKHR(@NonNull VkDevice device, @NonNull MemorySegment pGetWin32HandleInfo, @NonNull MemorySegment pHandle) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkGetSemaphoreWin32HandleKHR)) throw new VKSymbolNotFoundError("Symbol not found: vkGetSemaphoreWin32HandleKHR");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkGetSemaphoreWin32HandleKHR", device, pGetWin32HandleInfo, pHandle); }
        return (int) Handles.MH_vkGetSemaphoreWin32HandleKHR.invokeExact(device.capabilities().PFN_vkGetSemaphoreWin32HandleKHR, device.segment(), pGetWin32HandleInfo, pHandle); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetSemaphoreWin32HandleKHR", e); }
    }

}
