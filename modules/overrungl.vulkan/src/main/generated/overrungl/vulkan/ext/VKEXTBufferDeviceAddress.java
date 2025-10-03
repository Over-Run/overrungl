// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext;
import java.lang.foreign.*;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.vulkan.*;
import static overrungl.internal.RuntimeHelper.*;
/// `VK_EXT_buffer_device_address` - device extension
public final class VKEXTBufferDeviceAddress {
    public static final int VK_EXT_BUFFER_DEVICE_ADDRESS_SPEC_VERSION = 2;
    public static final String VK_EXT_BUFFER_DEVICE_ADDRESS_EXTENSION_NAME = "VK_EXT_buffer_device_address";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_BUFFER_DEVICE_ADDRESS_FEATURES_EXT = 1000244000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_BUFFER_ADDRESS_FEATURES_EXT = 1000244000;
    public static final int VK_STRUCTURE_TYPE_BUFFER_DEVICE_ADDRESS_INFO_EXT = 1000244001;
    public static final int VK_STRUCTURE_TYPE_BUFFER_DEVICE_ADDRESS_CREATE_INFO_EXT = 1000244002;
    public static final int VK_BUFFER_USAGE_SHADER_DEVICE_ADDRESS_BIT_EXT = 0x00020000;
    public static final int VK_BUFFER_CREATE_DEVICE_ADDRESS_CAPTURE_REPLAY_BIT_EXT = 0x00000010;
    public static final int VK_ERROR_INVALID_DEVICE_ADDRESS_EXT = -1000257000;
    public static final class Handles {
        public static final Supplier<MethodHandle> MH_vkGetBufferDeviceAddressEXT = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        private Handles() {}
    }

    private VKEXTBufferDeviceAddress() {}

    /// Invokes `vkGetBufferDeviceAddressEXT`.
    /// ```
    /// (uint64_t) VkDeviceAddress vkGetBufferDeviceAddressEXT((struct VkDevice*) VkDevice device, const VkBufferDeviceAddressInfo* pInfo);
    /// ```
    public static long vkGetBufferDeviceAddressEXT(@NonNull VkDevice device, @NonNull MemorySegment pInfo) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkGetBufferDeviceAddressEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkGetBufferDeviceAddressEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkGetBufferDeviceAddressEXT", device, pInfo); }
        return (long) Handles.MH_vkGetBufferDeviceAddressEXT.get().invokeExact(device.capabilities().PFN_vkGetBufferDeviceAddressEXT, device.segment(), pInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetBufferDeviceAddressEXT", e); }
    }

}
