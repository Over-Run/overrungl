// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.vulkan.*;
import static overrungl.internal.RuntimeHelper.*;
/// `VK_KHR_external_fence_win32` - device extension
public final class VKKHRExternalFenceWin32 {
    public static final int VK_KHR_EXTERNAL_FENCE_WIN32_SPEC_VERSION = 1;
    public static final String VK_KHR_EXTERNAL_FENCE_WIN32_EXTENSION_NAME = "VK_KHR_external_fence_win32";
    public static final int VK_STRUCTURE_TYPE_IMPORT_FENCE_WIN32_HANDLE_INFO_KHR = 1000114000;
    public static final int VK_STRUCTURE_TYPE_EXPORT_FENCE_WIN32_HANDLE_INFO_KHR = 1000114001;
    public static final int VK_STRUCTURE_TYPE_FENCE_GET_WIN32_HANDLE_INFO_KHR = 1000114002;
    public static final class Handles {
        public static final MethodHandle MH_vkImportFenceWin32HandleKHR = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetFenceWin32HandleKHR = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        private Handles() {}
    }

    private VKKHRExternalFenceWin32() {}

    /// Invokes `vkImportFenceWin32HandleKHR`.
    /// ```
    /// (int) VkResult vkImportFenceWin32HandleKHR((struct VkDevice*) VkDevice device, const VkImportFenceWin32HandleInfoKHR* pImportFenceWin32HandleInfo);
    /// ```
    public static int vkImportFenceWin32HandleKHR(@NonNull VkDevice device, @NonNull MemorySegment pImportFenceWin32HandleInfo) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkImportFenceWin32HandleKHR)) throw new VKSymbolNotFoundError("Symbol not found: vkImportFenceWin32HandleKHR");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkImportFenceWin32HandleKHR", device, pImportFenceWin32HandleInfo); }
        return (int) Handles.MH_vkImportFenceWin32HandleKHR.invokeExact(device.capabilities().PFN_vkImportFenceWin32HandleKHR, device.segment(), pImportFenceWin32HandleInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkImportFenceWin32HandleKHR", e); }
    }

    /// Invokes `vkGetFenceWin32HandleKHR`.
    /// ```
    /// (int) VkResult vkGetFenceWin32HandleKHR((struct VkDevice*) VkDevice device, const VkFenceGetWin32HandleInfoKHR* pGetWin32HandleInfo, HANDLE* pHandle);
    /// ```
    public static int vkGetFenceWin32HandleKHR(@NonNull VkDevice device, @NonNull MemorySegment pGetWin32HandleInfo, @NonNull MemorySegment pHandle) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkGetFenceWin32HandleKHR)) throw new VKSymbolNotFoundError("Symbol not found: vkGetFenceWin32HandleKHR");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkGetFenceWin32HandleKHR", device, pGetWin32HandleInfo, pHandle); }
        return (int) Handles.MH_vkGetFenceWin32HandleKHR.invokeExact(device.capabilities().PFN_vkGetFenceWin32HandleKHR, device.segment(), pGetWin32HandleInfo, pHandle); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetFenceWin32HandleKHR", e); }
    }

}
