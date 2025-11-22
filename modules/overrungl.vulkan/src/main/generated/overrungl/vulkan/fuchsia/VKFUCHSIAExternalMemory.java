// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.fuchsia;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.vulkan.*;
import static overrungl.internal.RuntimeHelper.*;
/// `VK_FUCHSIA_external_memory` - device extension
public final class VKFUCHSIAExternalMemory {
    public static final int VK_FUCHSIA_EXTERNAL_MEMORY_SPEC_VERSION = 1;
    public static final String VK_FUCHSIA_EXTERNAL_MEMORY_EXTENSION_NAME = "VK_FUCHSIA_external_memory";
    public static final int VK_STRUCTURE_TYPE_IMPORT_MEMORY_ZIRCON_HANDLE_INFO_FUCHSIA = 1000364000;
    public static final int VK_STRUCTURE_TYPE_MEMORY_ZIRCON_HANDLE_PROPERTIES_FUCHSIA = 1000364001;
    public static final int VK_STRUCTURE_TYPE_MEMORY_GET_ZIRCON_HANDLE_INFO_FUCHSIA = 1000364002;
    public static final int VK_EXTERNAL_MEMORY_HANDLE_TYPE_ZIRCON_VMO_BIT_FUCHSIA = 0x00000800;
    private VKFUCHSIAExternalMemory() {}
    public static final class Handles {
        public static final MethodHandle MH_vkGetMemoryZirconHandleFUCHSIA = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetMemoryZirconHandlePropertiesFUCHSIA = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        private Handles() {}
    }

    /// Invokes `vkGetMemoryZirconHandleFUCHSIA`.
    /// ```
    /// VkResult vkGetMemoryZirconHandleFUCHSIA(VkDevice device, const VkMemoryGetZirconHandleInfoFUCHSIA* pGetZirconHandleInfo, zx_handle_t* pZirconHandle);
    /// ```
    public static int vkGetMemoryZirconHandleFUCHSIA(@NonNull VkDevice device, @NonNull MemorySegment pGetZirconHandleInfo, @NonNull MemorySegment pZirconHandle) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkGetMemoryZirconHandleFUCHSIA)) throw new VKSymbolNotFoundError("Symbol not found: vkGetMemoryZirconHandleFUCHSIA");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkGetMemoryZirconHandleFUCHSIA", device, pGetZirconHandleInfo, pZirconHandle); }
        return (int) Handles.MH_vkGetMemoryZirconHandleFUCHSIA.invokeExact(device.capabilities().PFN_vkGetMemoryZirconHandleFUCHSIA, device.segment(), pGetZirconHandleInfo, pZirconHandle); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetMemoryZirconHandleFUCHSIA", e); }
    }

    /// Invokes `vkGetMemoryZirconHandlePropertiesFUCHSIA`.
    /// ```
    /// VkResult vkGetMemoryZirconHandlePropertiesFUCHSIA(VkDevice device, VkExternalMemoryHandleTypeFlagBits handleType, zx_handle_t zirconHandle, VkMemoryZirconHandlePropertiesFUCHSIA* pMemoryZirconHandleProperties);
    /// ```
    public static int vkGetMemoryZirconHandlePropertiesFUCHSIA(@NonNull VkDevice device, int handleType, int zirconHandle, @NonNull MemorySegment pMemoryZirconHandleProperties) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkGetMemoryZirconHandlePropertiesFUCHSIA)) throw new VKSymbolNotFoundError("Symbol not found: vkGetMemoryZirconHandlePropertiesFUCHSIA");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkGetMemoryZirconHandlePropertiesFUCHSIA", device, handleType, zirconHandle, pMemoryZirconHandleProperties); }
        return (int) Handles.MH_vkGetMemoryZirconHandlePropertiesFUCHSIA.invokeExact(device.capabilities().PFN_vkGetMemoryZirconHandlePropertiesFUCHSIA, device.segment(), handleType, zirconHandle, pMemoryZirconHandleProperties); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetMemoryZirconHandlePropertiesFUCHSIA", e); }
    }

}
