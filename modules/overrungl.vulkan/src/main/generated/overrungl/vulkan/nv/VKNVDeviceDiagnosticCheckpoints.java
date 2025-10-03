// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.nv;
import java.lang.foreign.*;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.vulkan.*;
import static overrungl.internal.RuntimeHelper.*;
/// `VK_NV_device_diagnostic_checkpoints` - device extension
public final class VKNVDeviceDiagnosticCheckpoints {
    public static final int VK_NV_DEVICE_DIAGNOSTIC_CHECKPOINTS_SPEC_VERSION = 2;
    public static final String VK_NV_DEVICE_DIAGNOSTIC_CHECKPOINTS_EXTENSION_NAME = "VK_NV_device_diagnostic_checkpoints";
    public static final int VK_STRUCTURE_TYPE_CHECKPOINT_DATA_NV = 1000206000;
    public static final int VK_STRUCTURE_TYPE_QUEUE_FAMILY_CHECKPOINT_PROPERTIES_NV = 1000206001;
    public static final int VK_STRUCTURE_TYPE_QUEUE_FAMILY_CHECKPOINT_PROPERTIES_2_NV = 1000206008;
    public static final int VK_STRUCTURE_TYPE_CHECKPOINT_DATA_2_NV = 1000206009;
    public static final class Handles {
        public static final Supplier<MethodHandle> MH_vkCmdSetCheckpointNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_vkGetQueueCheckpointDataNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_vkGetQueueCheckpointData2NV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        private Handles() {}
    }

    private VKNVDeviceDiagnosticCheckpoints() {}

    /// Invokes `vkCmdSetCheckpointNV`.
    /// ```
    /// void vkCmdSetCheckpointNV((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, const void* pCheckpointMarker);
    /// ```
    public static void vkCmdSetCheckpointNV(@NonNull VkCommandBuffer commandBuffer, @NonNull MemorySegment pCheckpointMarker) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetCheckpointNV)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdSetCheckpointNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdSetCheckpointNV", commandBuffer, pCheckpointMarker); }
        Handles.MH_vkCmdSetCheckpointNV.get().invokeExact(commandBuffer.capabilities().PFN_vkCmdSetCheckpointNV, commandBuffer.segment(), pCheckpointMarker); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetCheckpointNV", e); }
    }

    /// Invokes `vkGetQueueCheckpointDataNV`.
    /// ```
    /// void vkGetQueueCheckpointDataNV((struct VkQueue*) VkQueue queue, uint32_t* pCheckpointDataCount, VkCheckpointDataNV* pCheckpointData);
    /// ```
    public static void vkGetQueueCheckpointDataNV(@NonNull VkQueue queue, @NonNull MemorySegment pCheckpointDataCount, @NonNull MemorySegment pCheckpointData) {
        if (MemoryUtil.isNullPointer(queue.capabilities().PFN_vkGetQueueCheckpointDataNV)) throw new VKSymbolNotFoundError("Symbol not found: vkGetQueueCheckpointDataNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkGetQueueCheckpointDataNV", queue, pCheckpointDataCount, pCheckpointData); }
        Handles.MH_vkGetQueueCheckpointDataNV.get().invokeExact(queue.capabilities().PFN_vkGetQueueCheckpointDataNV, queue.segment(), pCheckpointDataCount, pCheckpointData); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetQueueCheckpointDataNV", e); }
    }

    /// Invokes `vkGetQueueCheckpointData2NV`.
    /// ```
    /// void vkGetQueueCheckpointData2NV((struct VkQueue*) VkQueue queue, uint32_t* pCheckpointDataCount, VkCheckpointData2NV* pCheckpointData);
    /// ```
    public static void vkGetQueueCheckpointData2NV(@NonNull VkQueue queue, @NonNull MemorySegment pCheckpointDataCount, @NonNull MemorySegment pCheckpointData) {
        if (MemoryUtil.isNullPointer(queue.capabilities().PFN_vkGetQueueCheckpointData2NV)) throw new VKSymbolNotFoundError("Symbol not found: vkGetQueueCheckpointData2NV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkGetQueueCheckpointData2NV", queue, pCheckpointDataCount, pCheckpointData); }
        Handles.MH_vkGetQueueCheckpointData2NV.get().invokeExact(queue.capabilities().PFN_vkGetQueueCheckpointData2NV, queue.segment(), pCheckpointDataCount, pCheckpointData); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetQueueCheckpointData2NV", e); }
    }

}
