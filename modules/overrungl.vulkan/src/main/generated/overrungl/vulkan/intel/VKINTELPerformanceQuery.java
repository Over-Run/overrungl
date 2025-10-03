// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.intel;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.vulkan.*;
import static overrungl.internal.RuntimeHelper.*;
/// `VK_INTEL_performance_query` - device extension
public final class VKINTELPerformanceQuery {
    public static final int VK_PERFORMANCE_CONFIGURATION_TYPE_COMMAND_QUEUE_METRICS_DISCOVERY_ACTIVATED_INTEL = 0;
    public static final int VK_QUERY_POOL_SAMPLING_MODE_MANUAL_INTEL = 0;
    public static final int VK_PERFORMANCE_OVERRIDE_TYPE_NULL_HARDWARE_INTEL = 0;
    public static final int VK_PERFORMANCE_OVERRIDE_TYPE_FLUSH_GPU_CACHES_INTEL = 1;
    public static final int VK_PERFORMANCE_PARAMETER_TYPE_HW_COUNTERS_SUPPORTED_INTEL = 0;
    public static final int VK_PERFORMANCE_PARAMETER_TYPE_STREAM_MARKER_VALID_BITS_INTEL = 1;
    public static final int VK_PERFORMANCE_VALUE_TYPE_UINT32_INTEL = 0;
    public static final int VK_PERFORMANCE_VALUE_TYPE_UINT64_INTEL = 1;
    public static final int VK_PERFORMANCE_VALUE_TYPE_FLOAT_INTEL = 2;
    public static final int VK_PERFORMANCE_VALUE_TYPE_BOOL_INTEL = 3;
    public static final int VK_PERFORMANCE_VALUE_TYPE_STRING_INTEL = 4;
    public static final int VK_INTEL_PERFORMANCE_QUERY_SPEC_VERSION = 2;
    public static final String VK_INTEL_PERFORMANCE_QUERY_EXTENSION_NAME = "VK_INTEL_performance_query";
    public static final int VK_STRUCTURE_TYPE_QUERY_POOL_PERFORMANCE_QUERY_CREATE_INFO_INTEL = 1000210000;
    public static final int VK_STRUCTURE_TYPE_QUERY_POOL_CREATE_INFO_INTEL = 1000210000;
    public static final int VK_STRUCTURE_TYPE_INITIALIZE_PERFORMANCE_API_INFO_INTEL = 1000210001;
    public static final int VK_STRUCTURE_TYPE_PERFORMANCE_MARKER_INFO_INTEL = 1000210002;
    public static final int VK_STRUCTURE_TYPE_PERFORMANCE_STREAM_MARKER_INFO_INTEL = 1000210003;
    public static final int VK_STRUCTURE_TYPE_PERFORMANCE_OVERRIDE_INFO_INTEL = 1000210004;
    public static final int VK_STRUCTURE_TYPE_PERFORMANCE_CONFIGURATION_ACQUIRE_INFO_INTEL = 1000210005;
    public static final int VK_QUERY_TYPE_PERFORMANCE_QUERY_INTEL = 1000210000;
    public static final int VK_OBJECT_TYPE_PERFORMANCE_CONFIGURATION_INTEL = 1000210000;
    public static final class Handles {
        public static final MethodHandle MH_vkInitializePerformanceApiINTEL = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkUninitializePerformanceApiINTEL = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdSetPerformanceMarkerINTEL = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdSetPerformanceStreamMarkerINTEL = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdSetPerformanceOverrideINTEL = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkAcquirePerformanceConfigurationINTEL = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkReleasePerformanceConfigurationINTEL = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG));
        public static final MethodHandle MH_vkQueueSetPerformanceConfigurationINTEL = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG));
        public static final MethodHandle MH_vkGetPerformanceParameterINTEL = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        private Handles() {}
    }

    private VKINTELPerformanceQuery() {}

    /// Invokes `vkInitializePerformanceApiINTEL`.
    /// ```
    /// (int) VkResult vkInitializePerformanceApiINTEL((struct VkDevice*) VkDevice device, const VkInitializePerformanceApiInfoINTEL* pInitializeInfo);
    /// ```
    public static int vkInitializePerformanceApiINTEL(@NonNull VkDevice device, @NonNull MemorySegment pInitializeInfo) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkInitializePerformanceApiINTEL)) throw new VKSymbolNotFoundError("Symbol not found: vkInitializePerformanceApiINTEL");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkInitializePerformanceApiINTEL", device, pInitializeInfo); }
        return (int) Handles.MH_vkInitializePerformanceApiINTEL.invokeExact(device.capabilities().PFN_vkInitializePerformanceApiINTEL, device.segment(), pInitializeInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkInitializePerformanceApiINTEL", e); }
    }

    /// Invokes `vkUninitializePerformanceApiINTEL`.
    /// ```
    /// void vkUninitializePerformanceApiINTEL((struct VkDevice*) VkDevice device);
    /// ```
    public static void vkUninitializePerformanceApiINTEL(@NonNull VkDevice device) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkUninitializePerformanceApiINTEL)) throw new VKSymbolNotFoundError("Symbol not found: vkUninitializePerformanceApiINTEL");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkUninitializePerformanceApiINTEL", device); }
        Handles.MH_vkUninitializePerformanceApiINTEL.invokeExact(device.capabilities().PFN_vkUninitializePerformanceApiINTEL, device.segment()); }
        catch (Throwable e) { throw new RuntimeException("error in vkUninitializePerformanceApiINTEL", e); }
    }

    /// Invokes `vkCmdSetPerformanceMarkerINTEL`.
    /// ```
    /// (int) VkResult vkCmdSetPerformanceMarkerINTEL((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, const VkPerformanceMarkerInfoINTEL* pMarkerInfo);
    /// ```
    public static int vkCmdSetPerformanceMarkerINTEL(@NonNull VkCommandBuffer commandBuffer, @NonNull MemorySegment pMarkerInfo) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetPerformanceMarkerINTEL)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdSetPerformanceMarkerINTEL");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdSetPerformanceMarkerINTEL", commandBuffer, pMarkerInfo); }
        return (int) Handles.MH_vkCmdSetPerformanceMarkerINTEL.invokeExact(commandBuffer.capabilities().PFN_vkCmdSetPerformanceMarkerINTEL, commandBuffer.segment(), pMarkerInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetPerformanceMarkerINTEL", e); }
    }

    /// Invokes `vkCmdSetPerformanceStreamMarkerINTEL`.
    /// ```
    /// (int) VkResult vkCmdSetPerformanceStreamMarkerINTEL((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, const VkPerformanceStreamMarkerInfoINTEL* pMarkerInfo);
    /// ```
    public static int vkCmdSetPerformanceStreamMarkerINTEL(@NonNull VkCommandBuffer commandBuffer, @NonNull MemorySegment pMarkerInfo) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetPerformanceStreamMarkerINTEL)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdSetPerformanceStreamMarkerINTEL");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdSetPerformanceStreamMarkerINTEL", commandBuffer, pMarkerInfo); }
        return (int) Handles.MH_vkCmdSetPerformanceStreamMarkerINTEL.invokeExact(commandBuffer.capabilities().PFN_vkCmdSetPerformanceStreamMarkerINTEL, commandBuffer.segment(), pMarkerInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetPerformanceStreamMarkerINTEL", e); }
    }

    /// Invokes `vkCmdSetPerformanceOverrideINTEL`.
    /// ```
    /// (int) VkResult vkCmdSetPerformanceOverrideINTEL((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, const VkPerformanceOverrideInfoINTEL* pOverrideInfo);
    /// ```
    public static int vkCmdSetPerformanceOverrideINTEL(@NonNull VkCommandBuffer commandBuffer, @NonNull MemorySegment pOverrideInfo) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetPerformanceOverrideINTEL)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdSetPerformanceOverrideINTEL");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdSetPerformanceOverrideINTEL", commandBuffer, pOverrideInfo); }
        return (int) Handles.MH_vkCmdSetPerformanceOverrideINTEL.invokeExact(commandBuffer.capabilities().PFN_vkCmdSetPerformanceOverrideINTEL, commandBuffer.segment(), pOverrideInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetPerformanceOverrideINTEL", e); }
    }

    /// Invokes `vkAcquirePerformanceConfigurationINTEL`.
    /// ```
    /// (int) VkResult vkAcquirePerformanceConfigurationINTEL((struct VkDevice*) VkDevice device, const VkPerformanceConfigurationAcquireInfoINTEL* pAcquireInfo, VkPerformanceConfigurationINTEL* pConfiguration);
    /// ```
    public static int vkAcquirePerformanceConfigurationINTEL(@NonNull VkDevice device, @NonNull MemorySegment pAcquireInfo, @NonNull MemorySegment pConfiguration) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkAcquirePerformanceConfigurationINTEL)) throw new VKSymbolNotFoundError("Symbol not found: vkAcquirePerformanceConfigurationINTEL");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkAcquirePerformanceConfigurationINTEL", device, pAcquireInfo, pConfiguration); }
        return (int) Handles.MH_vkAcquirePerformanceConfigurationINTEL.invokeExact(device.capabilities().PFN_vkAcquirePerformanceConfigurationINTEL, device.segment(), pAcquireInfo, pConfiguration); }
        catch (Throwable e) { throw new RuntimeException("error in vkAcquirePerformanceConfigurationINTEL", e); }
    }

    /// Invokes `vkReleasePerformanceConfigurationINTEL`.
    /// ```
    /// (int) VkResult vkReleasePerformanceConfigurationINTEL((struct VkDevice*) VkDevice device, (uint64_t) VkPerformanceConfigurationINTEL configuration);
    /// ```
    public static int vkReleasePerformanceConfigurationINTEL(@NonNull VkDevice device, long configuration) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkReleasePerformanceConfigurationINTEL)) throw new VKSymbolNotFoundError("Symbol not found: vkReleasePerformanceConfigurationINTEL");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkReleasePerformanceConfigurationINTEL", device, configuration); }
        return (int) Handles.MH_vkReleasePerformanceConfigurationINTEL.invokeExact(device.capabilities().PFN_vkReleasePerformanceConfigurationINTEL, device.segment(), configuration); }
        catch (Throwable e) { throw new RuntimeException("error in vkReleasePerformanceConfigurationINTEL", e); }
    }

    /// Invokes `vkQueueSetPerformanceConfigurationINTEL`.
    /// ```
    /// (int) VkResult vkQueueSetPerformanceConfigurationINTEL((struct VkQueue*) VkQueue queue, (uint64_t) VkPerformanceConfigurationINTEL configuration);
    /// ```
    public static int vkQueueSetPerformanceConfigurationINTEL(@NonNull VkQueue queue, long configuration) {
        if (MemoryUtil.isNullPointer(queue.capabilities().PFN_vkQueueSetPerformanceConfigurationINTEL)) throw new VKSymbolNotFoundError("Symbol not found: vkQueueSetPerformanceConfigurationINTEL");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkQueueSetPerformanceConfigurationINTEL", queue, configuration); }
        return (int) Handles.MH_vkQueueSetPerformanceConfigurationINTEL.invokeExact(queue.capabilities().PFN_vkQueueSetPerformanceConfigurationINTEL, queue.segment(), configuration); }
        catch (Throwable e) { throw new RuntimeException("error in vkQueueSetPerformanceConfigurationINTEL", e); }
    }

    /// Invokes `vkGetPerformanceParameterINTEL`.
    /// ```
    /// (int) VkResult vkGetPerformanceParameterINTEL((struct VkDevice*) VkDevice device, (int) VkPerformanceParameterTypeINTEL parameter, VkPerformanceValueINTEL* pValue);
    /// ```
    public static int vkGetPerformanceParameterINTEL(@NonNull VkDevice device, int parameter, @NonNull MemorySegment pValue) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkGetPerformanceParameterINTEL)) throw new VKSymbolNotFoundError("Symbol not found: vkGetPerformanceParameterINTEL");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkGetPerformanceParameterINTEL", device, parameter, pValue); }
        return (int) Handles.MH_vkGetPerformanceParameterINTEL.invokeExact(device.capabilities().PFN_vkGetPerformanceParameterINTEL, device.segment(), parameter, pValue); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetPerformanceParameterINTEL", e); }
    }

}
