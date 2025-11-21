// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ohos;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.vulkan.*;
import static overrungl.internal.RuntimeHelper.*;
/// `VK_OHOS_external_memory` - device extension
public final class VKOHOSExternalMemory {
    public static final int VK_OHOS_EXTERNAL_MEMORY_SPEC_VERSION = 1;
    public static final String VK_OHOS_EXTERNAL_MEMORY_EXTENSION_NAME = "VK_OHOS_external_memory";
    public static final int VK_STRUCTURE_TYPE_NATIVE_BUFFER_USAGE_OHOS = 1000452000;
    public static final int VK_STRUCTURE_TYPE_NATIVE_BUFFER_PROPERTIES_OHOS = 1000452001;
    public static final int VK_STRUCTURE_TYPE_NATIVE_BUFFER_FORMAT_PROPERTIES_OHOS = 1000452002;
    public static final int VK_STRUCTURE_TYPE_IMPORT_NATIVE_BUFFER_INFO_OHOS = 1000452003;
    public static final int VK_STRUCTURE_TYPE_MEMORY_GET_NATIVE_BUFFER_INFO_OHOS = 1000452004;
    public static final int VK_STRUCTURE_TYPE_EXTERNAL_FORMAT_OHOS = 1000452005;
    public static final int VK_EXTERNAL_MEMORY_HANDLE_TYPE_OH_NATIVE_BUFFER_BIT_OHOS = 0x00008000;
    private VKOHOSExternalMemory() {}
    public static final class Handles {
        public static final MethodHandle MH_vkGetNativeBufferPropertiesOHOS = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetMemoryNativeBufferOHOS = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        private Handles() {}
    }

    /// Invokes `vkGetNativeBufferPropertiesOHOS`.
    /// ```
    /// VkResult vkGetNativeBufferPropertiesOHOS(VkDevice device, const struct OH_NativeBuffer* buffer, VkNativeBufferPropertiesOHOS* pProperties);
    /// ```
    public static int vkGetNativeBufferPropertiesOHOS(@NonNull VkDevice device, @NonNull MemorySegment buffer, @NonNull MemorySegment pProperties) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkGetNativeBufferPropertiesOHOS)) throw new VKSymbolNotFoundError("Symbol not found: vkGetNativeBufferPropertiesOHOS");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkGetNativeBufferPropertiesOHOS", device, buffer, pProperties); }
        return (int) Handles.MH_vkGetNativeBufferPropertiesOHOS.invokeExact(device.capabilities().PFN_vkGetNativeBufferPropertiesOHOS, device.segment(), buffer, pProperties); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetNativeBufferPropertiesOHOS", e); }
    }

    /// Invokes `vkGetMemoryNativeBufferOHOS`.
    /// ```
    /// VkResult vkGetMemoryNativeBufferOHOS(VkDevice device, const VkMemoryGetNativeBufferInfoOHOS* pInfo, struct OH_NativeBuffer** pBuffer);
    /// ```
    public static int vkGetMemoryNativeBufferOHOS(@NonNull VkDevice device, @NonNull MemorySegment pInfo, @NonNull MemorySegment pBuffer) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkGetMemoryNativeBufferOHOS)) throw new VKSymbolNotFoundError("Symbol not found: vkGetMemoryNativeBufferOHOS");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkGetMemoryNativeBufferOHOS", device, pInfo, pBuffer); }
        return (int) Handles.MH_vkGetMemoryNativeBufferOHOS.invokeExact(device.capabilities().PFN_vkGetMemoryNativeBufferOHOS, device.segment(), pInfo, pBuffer); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetMemoryNativeBufferOHOS", e); }
    }

}
