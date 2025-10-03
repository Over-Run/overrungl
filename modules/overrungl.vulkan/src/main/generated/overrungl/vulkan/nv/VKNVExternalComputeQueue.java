// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.nv;
import java.lang.foreign.*;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.vulkan.*;
import static overrungl.internal.RuntimeHelper.*;
/// `VK_NV_external_compute_queue` - device extension
public final class VKNVExternalComputeQueue {
    public static final int VK_NV_EXTERNAL_COMPUTE_QUEUE_SPEC_VERSION = 1;
    public static final String VK_NV_EXTERNAL_COMPUTE_QUEUE_EXTENSION_NAME = "VK_NV_external_compute_queue";
    public static final int VK_STRUCTURE_TYPE_EXTERNAL_COMPUTE_QUEUE_DEVICE_CREATE_INFO_NV = 1000556000;
    public static final int VK_STRUCTURE_TYPE_EXTERNAL_COMPUTE_QUEUE_CREATE_INFO_NV = 1000556001;
    public static final int VK_STRUCTURE_TYPE_EXTERNAL_COMPUTE_QUEUE_DATA_PARAMS_NV = 1000556002;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_COMPUTE_QUEUE_PROPERTIES_NV = 1000556003;
    public static final int VK_OBJECT_TYPE_EXTERNAL_COMPUTE_QUEUE_NV = 1000556000;
    public static final class Handles {
        public static final Supplier<MethodHandle> MH_vkCreateExternalComputeQueueNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_vkDestroyExternalComputeQueueNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_vkGetExternalComputeQueueDataNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        private Handles() {}
    }

    private VKNVExternalComputeQueue() {}

    /// Invokes `vkCreateExternalComputeQueueNV`.
    /// ```
    /// (int) VkResult vkCreateExternalComputeQueueNV((struct VkDevice*) VkDevice device, const VkExternalComputeQueueCreateInfoNV* pCreateInfo, const VkAllocationCallbacks* pAllocator, VkExternalComputeQueueNV* pExternalQueue);
    /// ```
    public static int vkCreateExternalComputeQueueNV(@NonNull VkDevice device, @NonNull MemorySegment pCreateInfo, @NonNull MemorySegment pAllocator, @NonNull MemorySegment pExternalQueue) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkCreateExternalComputeQueueNV)) throw new VKSymbolNotFoundError("Symbol not found: vkCreateExternalComputeQueueNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCreateExternalComputeQueueNV", device, pCreateInfo, pAllocator, pExternalQueue); }
        return (int) Handles.MH_vkCreateExternalComputeQueueNV.get().invokeExact(device.capabilities().PFN_vkCreateExternalComputeQueueNV, device.segment(), pCreateInfo, pAllocator, pExternalQueue); }
        catch (Throwable e) { throw new RuntimeException("error in vkCreateExternalComputeQueueNV", e); }
    }

    /// Invokes `vkDestroyExternalComputeQueueNV`.
    /// ```
    /// void vkDestroyExternalComputeQueueNV((struct VkDevice*) VkDevice device, (struct VkExternalComputeQueueNV*) VkExternalComputeQueueNV externalQueue, const VkAllocationCallbacks* pAllocator);
    /// ```
    public static void vkDestroyExternalComputeQueueNV(@NonNull VkDevice device, @NonNull MemorySegment externalQueue, @NonNull MemorySegment pAllocator) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkDestroyExternalComputeQueueNV)) throw new VKSymbolNotFoundError("Symbol not found: vkDestroyExternalComputeQueueNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkDestroyExternalComputeQueueNV", device, externalQueue, pAllocator); }
        Handles.MH_vkDestroyExternalComputeQueueNV.get().invokeExact(device.capabilities().PFN_vkDestroyExternalComputeQueueNV, device.segment(), externalQueue, pAllocator); }
        catch (Throwable e) { throw new RuntimeException("error in vkDestroyExternalComputeQueueNV", e); }
    }

    /// Invokes `vkGetExternalComputeQueueDataNV`.
    /// ```
    /// void vkGetExternalComputeQueueDataNV((struct VkExternalComputeQueueNV*) VkExternalComputeQueueNV externalQueue, VkExternalComputeQueueDataParamsNV* params, void* pData);
    /// ```
    public static void vkGetExternalComputeQueueDataNV(@NonNull VkExternalComputeQueueNV externalQueue, @NonNull MemorySegment params, @NonNull MemorySegment pData) {
        if (MemoryUtil.isNullPointer(externalQueue.capabilities().PFN_vkGetExternalComputeQueueDataNV)) throw new VKSymbolNotFoundError("Symbol not found: vkGetExternalComputeQueueDataNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkGetExternalComputeQueueDataNV", externalQueue, params, pData); }
        Handles.MH_vkGetExternalComputeQueueDataNV.get().invokeExact(externalQueue.capabilities().PFN_vkGetExternalComputeQueueDataNV, externalQueue.segment(), params, pData); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetExternalComputeQueueDataNV", e); }
    }

}
