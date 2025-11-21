// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.arm;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.vulkan.*;
import static overrungl.internal.RuntimeHelper.*;
/// `VK_ARM_data_graph` - device extension
public final class VKARMDataGraph {
    public static final int VK_ARM_DATA_GRAPH_SPEC_VERSION = 1;
    public static final String VK_ARM_DATA_GRAPH_EXTENSION_NAME = "VK_ARM_data_graph";
    public static final int VK_MAX_PHYSICAL_DEVICE_DATA_GRAPH_OPERATION_SET_NAME_SIZE_ARM = 128;
    public static final int VK_DATA_GRAPH_PIPELINE_SESSION_BIND_POINT_TRANSIENT_ARM = 0;
    public static final int VK_DATA_GRAPH_PIPELINE_SESSION_BIND_POINT_TYPE_MEMORY_ARM = 0;
    public static final long VK_DATA_GRAPH_PIPELINE_SESSION_CREATE_PROTECTED_BIT_ARM = 0x00000001L;
    public static final int VK_DATA_GRAPH_PIPELINE_PROPERTY_CREATION_LOG_ARM = 0;
    public static final int VK_DATA_GRAPH_PIPELINE_PROPERTY_IDENTIFIER_ARM = 1;
    public static final int VK_PHYSICAL_DEVICE_DATA_GRAPH_PROCESSING_ENGINE_TYPE_DEFAULT_ARM = 0;
    public static final int VK_PHYSICAL_DEVICE_DATA_GRAPH_OPERATION_TYPE_SPIRV_EXTENDED_INSTRUCTION_SET_ARM = 0;
    public static final int VK_STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_CREATE_INFO_ARM = 1000507000;
    public static final int VK_STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_SESSION_CREATE_INFO_ARM = 1000507001;
    public static final int VK_STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_RESOURCE_INFO_ARM = 1000507002;
    public static final int VK_STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_CONSTANT_ARM = 1000507003;
    public static final int VK_STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_SESSION_MEMORY_REQUIREMENTS_INFO_ARM = 1000507004;
    public static final int VK_STRUCTURE_TYPE_BIND_DATA_GRAPH_PIPELINE_SESSION_MEMORY_INFO_ARM = 1000507005;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DATA_GRAPH_FEATURES_ARM = 1000507006;
    public static final int VK_STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_SHADER_MODULE_CREATE_INFO_ARM = 1000507007;
    public static final int VK_STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_PROPERTY_QUERY_RESULT_ARM = 1000507008;
    public static final int VK_STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_INFO_ARM = 1000507009;
    public static final int VK_STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_COMPILER_CONTROL_CREATE_INFO_ARM = 1000507010;
    public static final int VK_STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_SESSION_BIND_POINT_REQUIREMENTS_INFO_ARM = 1000507011;
    public static final int VK_STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_SESSION_BIND_POINT_REQUIREMENT_ARM = 1000507012;
    public static final int VK_STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_IDENTIFIER_CREATE_INFO_ARM = 1000507013;
    public static final int VK_STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_DISPATCH_INFO_ARM = 1000507014;
    public static final int VK_STRUCTURE_TYPE_DATA_GRAPH_PROCESSING_ENGINE_CREATE_INFO_ARM = 1000507016;
    public static final int VK_STRUCTURE_TYPE_QUEUE_FAMILY_DATA_GRAPH_PROCESSING_ENGINE_PROPERTIES_ARM = 1000507017;
    public static final int VK_STRUCTURE_TYPE_QUEUE_FAMILY_DATA_GRAPH_PROPERTIES_ARM = 1000507018;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_QUEUE_FAMILY_DATA_GRAPH_PROCESSING_ENGINE_INFO_ARM = 1000507019;
    public static final int VK_OBJECT_TYPE_DATA_GRAPH_PIPELINE_SESSION_ARM = 1000507000;
    public static final int VK_PIPELINE_BIND_POINT_DATA_GRAPH_ARM = 1000507000;
    public static final int VK_QUEUE_DATA_GRAPH_BIT_ARM = 0x00000400;
    public static final long VK_PIPELINE_STAGE_2_DATA_GRAPH_BIT_ARM = 0x40000000000L;
    public static final long VK_ACCESS_2_DATA_GRAPH_READ_BIT_ARM = 0x800000000000L;
    public static final long VK_ACCESS_2_DATA_GRAPH_WRITE_BIT_ARM = 0x1000000000000L;
    public static final long VK_TENSOR_USAGE_DATA_GRAPH_BIT_ARM = 0x00000020L;
    public static final long VK_FORMAT_FEATURE_2_TENSOR_DATA_GRAPH_BIT_ARM = 0x1000000000000L;
    public static final long VK_BUFFER_USAGE_2_DATA_GRAPH_FOREIGN_DESCRIPTOR_BIT_ARM = 0x20000000L;
    public static final int VK_STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_CONSTANT_TENSOR_SEMI_STRUCTURED_SPARSITY_INFO_ARM = 1000507015;
    private VKARMDataGraph() {}
    public static final class Handles {
        public static final MethodHandle MH_vkCreateDataGraphPipelinesARM = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCreateDataGraphPipelineSessionARM = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetDataGraphPipelineSessionBindPointRequirementsARM = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetDataGraphPipelineSessionMemoryRequirementsARM = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkBindDataGraphPipelineSessionMemoryARM = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkDestroyDataGraphPipelineSessionARM = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdDispatchDataGraphARM = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetDataGraphPipelineAvailablePropertiesARM = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetDataGraphPipelinePropertiesARM = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetPhysicalDeviceQueueFamilyDataGraphPropertiesARM = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetPhysicalDeviceQueueFamilyDataGraphProcessingEnginePropertiesARM = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        private Handles() {}
    }

    /// Invokes `vkCreateDataGraphPipelinesARM`.
    /// ```
    /// VkResult vkCreateDataGraphPipelinesARM(VkDevice device, VkDeferredOperationKHR deferredOperation, VkPipelineCache pipelineCache, uint32_t createInfoCount, const VkDataGraphPipelineCreateInfoARM* pCreateInfos, const VkAllocationCallbacks* pAllocator, VkPipeline* pPipelines);
    /// ```
    public static int vkCreateDataGraphPipelinesARM(@NonNull VkDevice device, long deferredOperation, long pipelineCache, int createInfoCount, @NonNull MemorySegment pCreateInfos, @NonNull MemorySegment pAllocator, @NonNull MemorySegment pPipelines) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkCreateDataGraphPipelinesARM)) throw new VKSymbolNotFoundError("Symbol not found: vkCreateDataGraphPipelinesARM");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCreateDataGraphPipelinesARM", device, deferredOperation, pipelineCache, createInfoCount, pCreateInfos, pAllocator, pPipelines); }
        return (int) Handles.MH_vkCreateDataGraphPipelinesARM.invokeExact(device.capabilities().PFN_vkCreateDataGraphPipelinesARM, device.segment(), deferredOperation, pipelineCache, createInfoCount, pCreateInfos, pAllocator, pPipelines); }
        catch (Throwable e) { throw new RuntimeException("error in vkCreateDataGraphPipelinesARM", e); }
    }

    /// Invokes `vkCreateDataGraphPipelineSessionARM`.
    /// ```
    /// VkResult vkCreateDataGraphPipelineSessionARM(VkDevice device, const VkDataGraphPipelineSessionCreateInfoARM* pCreateInfo, const VkAllocationCallbacks* pAllocator, VkDataGraphPipelineSessionARM* pSession);
    /// ```
    public static int vkCreateDataGraphPipelineSessionARM(@NonNull VkDevice device, @NonNull MemorySegment pCreateInfo, @NonNull MemorySegment pAllocator, @NonNull MemorySegment pSession) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkCreateDataGraphPipelineSessionARM)) throw new VKSymbolNotFoundError("Symbol not found: vkCreateDataGraphPipelineSessionARM");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCreateDataGraphPipelineSessionARM", device, pCreateInfo, pAllocator, pSession); }
        return (int) Handles.MH_vkCreateDataGraphPipelineSessionARM.invokeExact(device.capabilities().PFN_vkCreateDataGraphPipelineSessionARM, device.segment(), pCreateInfo, pAllocator, pSession); }
        catch (Throwable e) { throw new RuntimeException("error in vkCreateDataGraphPipelineSessionARM", e); }
    }

    /// Invokes `vkGetDataGraphPipelineSessionBindPointRequirementsARM`.
    /// ```
    /// VkResult vkGetDataGraphPipelineSessionBindPointRequirementsARM(VkDevice device, const VkDataGraphPipelineSessionBindPointRequirementsInfoARM* pInfo, uint32_t* pBindPointRequirementCount, VkDataGraphPipelineSessionBindPointRequirementARM* pBindPointRequirements);
    /// ```
    public static int vkGetDataGraphPipelineSessionBindPointRequirementsARM(@NonNull VkDevice device, @NonNull MemorySegment pInfo, @NonNull MemorySegment pBindPointRequirementCount, @NonNull MemorySegment pBindPointRequirements) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkGetDataGraphPipelineSessionBindPointRequirementsARM)) throw new VKSymbolNotFoundError("Symbol not found: vkGetDataGraphPipelineSessionBindPointRequirementsARM");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkGetDataGraphPipelineSessionBindPointRequirementsARM", device, pInfo, pBindPointRequirementCount, pBindPointRequirements); }
        return (int) Handles.MH_vkGetDataGraphPipelineSessionBindPointRequirementsARM.invokeExact(device.capabilities().PFN_vkGetDataGraphPipelineSessionBindPointRequirementsARM, device.segment(), pInfo, pBindPointRequirementCount, pBindPointRequirements); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetDataGraphPipelineSessionBindPointRequirementsARM", e); }
    }

    /// Invokes `vkGetDataGraphPipelineSessionMemoryRequirementsARM`.
    /// ```
    /// void vkGetDataGraphPipelineSessionMemoryRequirementsARM(VkDevice device, const VkDataGraphPipelineSessionMemoryRequirementsInfoARM* pInfo, VkMemoryRequirements2* pMemoryRequirements);
    /// ```
    public static void vkGetDataGraphPipelineSessionMemoryRequirementsARM(@NonNull VkDevice device, @NonNull MemorySegment pInfo, @NonNull MemorySegment pMemoryRequirements) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkGetDataGraphPipelineSessionMemoryRequirementsARM)) throw new VKSymbolNotFoundError("Symbol not found: vkGetDataGraphPipelineSessionMemoryRequirementsARM");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkGetDataGraphPipelineSessionMemoryRequirementsARM", device, pInfo, pMemoryRequirements); }
        Handles.MH_vkGetDataGraphPipelineSessionMemoryRequirementsARM.invokeExact(device.capabilities().PFN_vkGetDataGraphPipelineSessionMemoryRequirementsARM, device.segment(), pInfo, pMemoryRequirements); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetDataGraphPipelineSessionMemoryRequirementsARM", e); }
    }

    /// Invokes `vkBindDataGraphPipelineSessionMemoryARM`.
    /// ```
    /// VkResult vkBindDataGraphPipelineSessionMemoryARM(VkDevice device, uint32_t bindInfoCount, const VkBindDataGraphPipelineSessionMemoryInfoARM* pBindInfos);
    /// ```
    public static int vkBindDataGraphPipelineSessionMemoryARM(@NonNull VkDevice device, int bindInfoCount, @NonNull MemorySegment pBindInfos) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkBindDataGraphPipelineSessionMemoryARM)) throw new VKSymbolNotFoundError("Symbol not found: vkBindDataGraphPipelineSessionMemoryARM");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkBindDataGraphPipelineSessionMemoryARM", device, bindInfoCount, pBindInfos); }
        return (int) Handles.MH_vkBindDataGraphPipelineSessionMemoryARM.invokeExact(device.capabilities().PFN_vkBindDataGraphPipelineSessionMemoryARM, device.segment(), bindInfoCount, pBindInfos); }
        catch (Throwable e) { throw new RuntimeException("error in vkBindDataGraphPipelineSessionMemoryARM", e); }
    }

    /// Invokes `vkDestroyDataGraphPipelineSessionARM`.
    /// ```
    /// void vkDestroyDataGraphPipelineSessionARM(VkDevice device, VkDataGraphPipelineSessionARM session, const VkAllocationCallbacks* pAllocator);
    /// ```
    public static void vkDestroyDataGraphPipelineSessionARM(@NonNull VkDevice device, long session, @NonNull MemorySegment pAllocator) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkDestroyDataGraphPipelineSessionARM)) throw new VKSymbolNotFoundError("Symbol not found: vkDestroyDataGraphPipelineSessionARM");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkDestroyDataGraphPipelineSessionARM", device, session, pAllocator); }
        Handles.MH_vkDestroyDataGraphPipelineSessionARM.invokeExact(device.capabilities().PFN_vkDestroyDataGraphPipelineSessionARM, device.segment(), session, pAllocator); }
        catch (Throwable e) { throw new RuntimeException("error in vkDestroyDataGraphPipelineSessionARM", e); }
    }

    /// Invokes `vkCmdDispatchDataGraphARM`.
    /// ```
    /// void vkCmdDispatchDataGraphARM(VkCommandBuffer commandBuffer, VkDataGraphPipelineSessionARM session, const VkDataGraphPipelineDispatchInfoARM* pInfo);
    /// ```
    public static void vkCmdDispatchDataGraphARM(@NonNull VkCommandBuffer commandBuffer, long session, @NonNull MemorySegment pInfo) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdDispatchDataGraphARM)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdDispatchDataGraphARM");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdDispatchDataGraphARM", commandBuffer, session, pInfo); }
        Handles.MH_vkCmdDispatchDataGraphARM.invokeExact(commandBuffer.capabilities().PFN_vkCmdDispatchDataGraphARM, commandBuffer.segment(), session, pInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdDispatchDataGraphARM", e); }
    }

    /// Invokes `vkGetDataGraphPipelineAvailablePropertiesARM`.
    /// ```
    /// VkResult vkGetDataGraphPipelineAvailablePropertiesARM(VkDevice device, const VkDataGraphPipelineInfoARM* pPipelineInfo, uint32_t* pPropertiesCount, VkDataGraphPipelinePropertyARM* pProperties);
    /// ```
    public static int vkGetDataGraphPipelineAvailablePropertiesARM(@NonNull VkDevice device, @NonNull MemorySegment pPipelineInfo, @NonNull MemorySegment pPropertiesCount, @NonNull MemorySegment pProperties) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkGetDataGraphPipelineAvailablePropertiesARM)) throw new VKSymbolNotFoundError("Symbol not found: vkGetDataGraphPipelineAvailablePropertiesARM");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkGetDataGraphPipelineAvailablePropertiesARM", device, pPipelineInfo, pPropertiesCount, pProperties); }
        return (int) Handles.MH_vkGetDataGraphPipelineAvailablePropertiesARM.invokeExact(device.capabilities().PFN_vkGetDataGraphPipelineAvailablePropertiesARM, device.segment(), pPipelineInfo, pPropertiesCount, pProperties); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetDataGraphPipelineAvailablePropertiesARM", e); }
    }

    /// Invokes `vkGetDataGraphPipelinePropertiesARM`.
    /// ```
    /// VkResult vkGetDataGraphPipelinePropertiesARM(VkDevice device, const VkDataGraphPipelineInfoARM* pPipelineInfo, uint32_t propertiesCount, VkDataGraphPipelinePropertyQueryResultARM* pProperties);
    /// ```
    public static int vkGetDataGraphPipelinePropertiesARM(@NonNull VkDevice device, @NonNull MemorySegment pPipelineInfo, int propertiesCount, @NonNull MemorySegment pProperties) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkGetDataGraphPipelinePropertiesARM)) throw new VKSymbolNotFoundError("Symbol not found: vkGetDataGraphPipelinePropertiesARM");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkGetDataGraphPipelinePropertiesARM", device, pPipelineInfo, propertiesCount, pProperties); }
        return (int) Handles.MH_vkGetDataGraphPipelinePropertiesARM.invokeExact(device.capabilities().PFN_vkGetDataGraphPipelinePropertiesARM, device.segment(), pPipelineInfo, propertiesCount, pProperties); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetDataGraphPipelinePropertiesARM", e); }
    }

    /// Invokes `vkGetPhysicalDeviceQueueFamilyDataGraphPropertiesARM`.
    /// ```
    /// VkResult vkGetPhysicalDeviceQueueFamilyDataGraphPropertiesARM(VkPhysicalDevice physicalDevice, uint32_t queueFamilyIndex, uint32_t* pQueueFamilyDataGraphPropertyCount, VkQueueFamilyDataGraphPropertiesARM* pQueueFamilyDataGraphProperties);
    /// ```
    public static int vkGetPhysicalDeviceQueueFamilyDataGraphPropertiesARM(@NonNull VkPhysicalDevice physicalDevice, int queueFamilyIndex, @NonNull MemorySegment pQueueFamilyDataGraphPropertyCount, @NonNull MemorySegment pQueueFamilyDataGraphProperties) {
        if (MemoryUtil.isNullPointer(physicalDevice.capabilities().PFN_vkGetPhysicalDeviceQueueFamilyDataGraphPropertiesARM)) throw new VKSymbolNotFoundError("Symbol not found: vkGetPhysicalDeviceQueueFamilyDataGraphPropertiesARM");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkGetPhysicalDeviceQueueFamilyDataGraphPropertiesARM", physicalDevice, queueFamilyIndex, pQueueFamilyDataGraphPropertyCount, pQueueFamilyDataGraphProperties); }
        return (int) Handles.MH_vkGetPhysicalDeviceQueueFamilyDataGraphPropertiesARM.invokeExact(physicalDevice.capabilities().PFN_vkGetPhysicalDeviceQueueFamilyDataGraphPropertiesARM, physicalDevice.segment(), queueFamilyIndex, pQueueFamilyDataGraphPropertyCount, pQueueFamilyDataGraphProperties); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetPhysicalDeviceQueueFamilyDataGraphPropertiesARM", e); }
    }

    /// Invokes `vkGetPhysicalDeviceQueueFamilyDataGraphProcessingEnginePropertiesARM`.
    /// ```
    /// void vkGetPhysicalDeviceQueueFamilyDataGraphProcessingEnginePropertiesARM(VkPhysicalDevice physicalDevice, const VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM* pQueueFamilyDataGraphProcessingEngineInfo, VkQueueFamilyDataGraphProcessingEnginePropertiesARM* pQueueFamilyDataGraphProcessingEngineProperties);
    /// ```
    public static void vkGetPhysicalDeviceQueueFamilyDataGraphProcessingEnginePropertiesARM(@NonNull VkPhysicalDevice physicalDevice, @NonNull MemorySegment pQueueFamilyDataGraphProcessingEngineInfo, @NonNull MemorySegment pQueueFamilyDataGraphProcessingEngineProperties) {
        if (MemoryUtil.isNullPointer(physicalDevice.capabilities().PFN_vkGetPhysicalDeviceQueueFamilyDataGraphProcessingEnginePropertiesARM)) throw new VKSymbolNotFoundError("Symbol not found: vkGetPhysicalDeviceQueueFamilyDataGraphProcessingEnginePropertiesARM");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkGetPhysicalDeviceQueueFamilyDataGraphProcessingEnginePropertiesARM", physicalDevice, pQueueFamilyDataGraphProcessingEngineInfo, pQueueFamilyDataGraphProcessingEngineProperties); }
        Handles.MH_vkGetPhysicalDeviceQueueFamilyDataGraphProcessingEnginePropertiesARM.invokeExact(physicalDevice.capabilities().PFN_vkGetPhysicalDeviceQueueFamilyDataGraphProcessingEnginePropertiesARM, physicalDevice.segment(), pQueueFamilyDataGraphProcessingEngineInfo, pQueueFamilyDataGraphProcessingEngineProperties); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetPhysicalDeviceQueueFamilyDataGraphProcessingEnginePropertiesARM", e); }
    }

}
