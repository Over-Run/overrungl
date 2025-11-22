// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.fuchsia;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.vulkan.*;
import static overrungl.internal.RuntimeHelper.*;
/// `VK_FUCHSIA_external_semaphore` - device extension
public final class VKFUCHSIAExternalSemaphore {
    public static final int VK_FUCHSIA_EXTERNAL_SEMAPHORE_SPEC_VERSION = 1;
    public static final String VK_FUCHSIA_EXTERNAL_SEMAPHORE_EXTENSION_NAME = "VK_FUCHSIA_external_semaphore";
    public static final int VK_STRUCTURE_TYPE_IMPORT_SEMAPHORE_ZIRCON_HANDLE_INFO_FUCHSIA = 1000365000;
    public static final int VK_STRUCTURE_TYPE_SEMAPHORE_GET_ZIRCON_HANDLE_INFO_FUCHSIA = 1000365001;
    public static final int VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_ZIRCON_EVENT_BIT_FUCHSIA = 0x00000080;
    private VKFUCHSIAExternalSemaphore() {}
    public static final class Handles {
        public static final MethodHandle MH_vkImportSemaphoreZirconHandleFUCHSIA = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetSemaphoreZirconHandleFUCHSIA = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        private Handles() {}
    }

    /// Invokes `vkImportSemaphoreZirconHandleFUCHSIA`.
    /// ```
    /// VkResult vkImportSemaphoreZirconHandleFUCHSIA(VkDevice device, const VkImportSemaphoreZirconHandleInfoFUCHSIA* pImportSemaphoreZirconHandleInfo);
    /// ```
    public static int vkImportSemaphoreZirconHandleFUCHSIA(@NonNull VkDevice device, @NonNull MemorySegment pImportSemaphoreZirconHandleInfo) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkImportSemaphoreZirconHandleFUCHSIA)) throw new VKSymbolNotFoundError("Symbol not found: vkImportSemaphoreZirconHandleFUCHSIA");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkImportSemaphoreZirconHandleFUCHSIA", device, pImportSemaphoreZirconHandleInfo); }
        return (int) Handles.MH_vkImportSemaphoreZirconHandleFUCHSIA.invokeExact(device.capabilities().PFN_vkImportSemaphoreZirconHandleFUCHSIA, device.segment(), pImportSemaphoreZirconHandleInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkImportSemaphoreZirconHandleFUCHSIA", e); }
    }

    /// Invokes `vkGetSemaphoreZirconHandleFUCHSIA`.
    /// ```
    /// VkResult vkGetSemaphoreZirconHandleFUCHSIA(VkDevice device, const VkSemaphoreGetZirconHandleInfoFUCHSIA* pGetZirconHandleInfo, zx_handle_t* pZirconHandle);
    /// ```
    public static int vkGetSemaphoreZirconHandleFUCHSIA(@NonNull VkDevice device, @NonNull MemorySegment pGetZirconHandleInfo, @NonNull MemorySegment pZirconHandle) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkGetSemaphoreZirconHandleFUCHSIA)) throw new VKSymbolNotFoundError("Symbol not found: vkGetSemaphoreZirconHandleFUCHSIA");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkGetSemaphoreZirconHandleFUCHSIA", device, pGetZirconHandleInfo, pZirconHandle); }
        return (int) Handles.MH_vkGetSemaphoreZirconHandleFUCHSIA.invokeExact(device.capabilities().PFN_vkGetSemaphoreZirconHandleFUCHSIA, device.segment(), pGetZirconHandleInfo, pZirconHandle); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetSemaphoreZirconHandleFUCHSIA", e); }
    }

}
