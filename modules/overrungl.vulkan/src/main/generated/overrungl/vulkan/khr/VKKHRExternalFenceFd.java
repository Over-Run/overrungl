// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr;
import java.lang.foreign.*;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.vulkan.*;
import static overrungl.internal.RuntimeHelper.*;
/// `VK_KHR_external_fence_fd` - device extension
public final class VKKHRExternalFenceFd {
    public static final int VK_KHR_EXTERNAL_FENCE_FD_SPEC_VERSION = 1;
    public static final String VK_KHR_EXTERNAL_FENCE_FD_EXTENSION_NAME = "VK_KHR_external_fence_fd";
    public static final int VK_STRUCTURE_TYPE_IMPORT_FENCE_FD_INFO_KHR = 1000115000;
    public static final int VK_STRUCTURE_TYPE_FENCE_GET_FD_INFO_KHR = 1000115001;
    public static final class Handles {
        public static final Supplier<MethodHandle> MH_vkImportFenceFdKHR = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_vkGetFenceFdKHR = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        private Handles() {}
    }

    private VKKHRExternalFenceFd() {}

    /// Invokes `vkImportFenceFdKHR`.
    /// ```
    /// (int) VkResult vkImportFenceFdKHR((struct VkDevice*) VkDevice device, const VkImportFenceFdInfoKHR* pImportFenceFdInfo);
    /// ```
    public static int vkImportFenceFdKHR(@NonNull VkDevice device, @NonNull MemorySegment pImportFenceFdInfo) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkImportFenceFdKHR)) throw new VKSymbolNotFoundError("Symbol not found: vkImportFenceFdKHR");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkImportFenceFdKHR", device, pImportFenceFdInfo); }
        return (int) Handles.MH_vkImportFenceFdKHR.get().invokeExact(device.capabilities().PFN_vkImportFenceFdKHR, device.segment(), pImportFenceFdInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkImportFenceFdKHR", e); }
    }

    /// Invokes `vkGetFenceFdKHR`.
    /// ```
    /// (int) VkResult vkGetFenceFdKHR((struct VkDevice*) VkDevice device, const VkFenceGetFdInfoKHR* pGetFdInfo, int* pFd);
    /// ```
    public static int vkGetFenceFdKHR(@NonNull VkDevice device, @NonNull MemorySegment pGetFdInfo, @NonNull MemorySegment pFd) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkGetFenceFdKHR)) throw new VKSymbolNotFoundError("Symbol not found: vkGetFenceFdKHR");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkGetFenceFdKHR", device, pGetFdInfo, pFd); }
        return (int) Handles.MH_vkGetFenceFdKHR.get().invokeExact(device.capabilities().PFN_vkGetFenceFdKHR, device.segment(), pGetFdInfo, pFd); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetFenceFdKHR", e); }
    }

}
