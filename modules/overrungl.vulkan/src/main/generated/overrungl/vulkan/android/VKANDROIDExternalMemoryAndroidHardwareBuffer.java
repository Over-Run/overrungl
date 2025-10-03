// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.android;
import java.lang.foreign.*;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.vulkan.*;
import static overrungl.internal.RuntimeHelper.*;
/// `VK_ANDROID_external_memory_android_hardware_buffer` - device extension
public final class VKANDROIDExternalMemoryAndroidHardwareBuffer {
    public static final int VK_ANDROID_EXTERNAL_MEMORY_ANDROID_HARDWARE_BUFFER_SPEC_VERSION = 5;
    public static final String VK_ANDROID_EXTERNAL_MEMORY_ANDROID_HARDWARE_BUFFER_EXTENSION_NAME = "VK_ANDROID_external_memory_android_hardware_buffer";
    public static final int VK_EXTERNAL_MEMORY_HANDLE_TYPE_ANDROID_HARDWARE_BUFFER_BIT_ANDROID = 0x00000400;
    public static final int VK_STRUCTURE_TYPE_ANDROID_HARDWARE_BUFFER_USAGE_ANDROID = 1000129000;
    public static final int VK_STRUCTURE_TYPE_ANDROID_HARDWARE_BUFFER_PROPERTIES_ANDROID = 1000129001;
    public static final int VK_STRUCTURE_TYPE_ANDROID_HARDWARE_BUFFER_FORMAT_PROPERTIES_ANDROID = 1000129002;
    public static final int VK_STRUCTURE_TYPE_IMPORT_ANDROID_HARDWARE_BUFFER_INFO_ANDROID = 1000129003;
    public static final int VK_STRUCTURE_TYPE_MEMORY_GET_ANDROID_HARDWARE_BUFFER_INFO_ANDROID = 1000129004;
    public static final int VK_STRUCTURE_TYPE_EXTERNAL_FORMAT_ANDROID = 1000129005;
    public static final int VK_STRUCTURE_TYPE_ANDROID_HARDWARE_BUFFER_FORMAT_PROPERTIES_2_ANDROID = 1000129006;
    public static final class Handles {
        public static final Supplier<MethodHandle> MH_vkGetAndroidHardwareBufferPropertiesANDROID = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_vkGetMemoryAndroidHardwareBufferANDROID = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        private Handles() {}
    }

    private VKANDROIDExternalMemoryAndroidHardwareBuffer() {}

    /// Invokes `vkGetAndroidHardwareBufferPropertiesANDROID`.
    /// ```
    /// (int) VkResult vkGetAndroidHardwareBufferPropertiesANDROID((struct VkDevice*) VkDevice device, const struct AHardwareBuffer * buffer, VkAndroidHardwareBufferPropertiesANDROID* pProperties);
    /// ```
    public static int vkGetAndroidHardwareBufferPropertiesANDROID(@NonNull VkDevice device, @NonNull MemorySegment buffer, @NonNull MemorySegment pProperties) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkGetAndroidHardwareBufferPropertiesANDROID)) throw new VKSymbolNotFoundError("Symbol not found: vkGetAndroidHardwareBufferPropertiesANDROID");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkGetAndroidHardwareBufferPropertiesANDROID", device, buffer, pProperties); }
        return (int) Handles.MH_vkGetAndroidHardwareBufferPropertiesANDROID.get().invokeExact(device.capabilities().PFN_vkGetAndroidHardwareBufferPropertiesANDROID, device.segment(), buffer, pProperties); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetAndroidHardwareBufferPropertiesANDROID", e); }
    }

    /// Invokes `vkGetMemoryAndroidHardwareBufferANDROID`.
    /// ```
    /// (int) VkResult vkGetMemoryAndroidHardwareBufferANDROID((struct VkDevice*) VkDevice device, const VkMemoryGetAndroidHardwareBufferInfoANDROID* pInfo, struct AHardwareBuffer ** pBuffer);
    /// ```
    public static int vkGetMemoryAndroidHardwareBufferANDROID(@NonNull VkDevice device, @NonNull MemorySegment pInfo, @NonNull MemorySegment pBuffer) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkGetMemoryAndroidHardwareBufferANDROID)) throw new VKSymbolNotFoundError("Symbol not found: vkGetMemoryAndroidHardwareBufferANDROID");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkGetMemoryAndroidHardwareBufferANDROID", device, pInfo, pBuffer); }
        return (int) Handles.MH_vkGetMemoryAndroidHardwareBufferANDROID.get().invokeExact(device.capabilities().PFN_vkGetMemoryAndroidHardwareBufferANDROID, device.segment(), pInfo, pBuffer); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetMemoryAndroidHardwareBufferANDROID", e); }
    }

}
