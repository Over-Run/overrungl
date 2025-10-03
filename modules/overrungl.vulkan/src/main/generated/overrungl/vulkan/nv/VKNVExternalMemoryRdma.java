// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.nv;
import java.lang.foreign.*;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.vulkan.*;
import static overrungl.internal.RuntimeHelper.*;
/// `VK_NV_external_memory_rdma` - device extension
public final class VKNVExternalMemoryRdma {
    public static final int VK_NV_EXTERNAL_MEMORY_RDMA_SPEC_VERSION = 1;
    public static final String VK_NV_EXTERNAL_MEMORY_RDMA_EXTENSION_NAME = "VK_NV_external_memory_rdma";
    public static final int VK_STRUCTURE_TYPE_MEMORY_GET_REMOTE_ADDRESS_INFO_NV = 1000371000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_MEMORY_RDMA_FEATURES_NV = 1000371001;
    public static final int VK_MEMORY_PROPERTY_RDMA_CAPABLE_BIT_NV = 0x00000100;
    public static final int VK_EXTERNAL_MEMORY_HANDLE_TYPE_RDMA_ADDRESS_BIT_NV = 0x00001000;
    public static final class Handles {
        public static final Supplier<MethodHandle> MH_vkGetMemoryRemoteAddressNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        private Handles() {}
    }

    private VKNVExternalMemoryRdma() {}

    /// Invokes `vkGetMemoryRemoteAddressNV`.
    /// ```
    /// (int) VkResult vkGetMemoryRemoteAddressNV((struct VkDevice*) VkDevice device, const VkMemoryGetRemoteAddressInfoNV* pMemoryGetRemoteAddressInfo, VkRemoteAddressNV* pAddress);
    /// ```
    public static int vkGetMemoryRemoteAddressNV(@NonNull VkDevice device, @NonNull MemorySegment pMemoryGetRemoteAddressInfo, @NonNull MemorySegment pAddress) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkGetMemoryRemoteAddressNV)) throw new VKSymbolNotFoundError("Symbol not found: vkGetMemoryRemoteAddressNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkGetMemoryRemoteAddressNV", device, pMemoryGetRemoteAddressInfo, pAddress); }
        return (int) Handles.MH_vkGetMemoryRemoteAddressNV.get().invokeExact(device.capabilities().PFN_vkGetMemoryRemoteAddressNV, device.segment(), pMemoryGetRemoteAddressInfo, pAddress); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetMemoryRemoteAddressNV", e); }
    }

}
