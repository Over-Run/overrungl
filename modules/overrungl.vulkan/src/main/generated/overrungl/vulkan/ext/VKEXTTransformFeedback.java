// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext;
import java.lang.foreign.*;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.vulkan.*;
import static overrungl.internal.RuntimeHelper.*;
/// `VK_EXT_transform_feedback` - device extension
public final class VKEXTTransformFeedback {
    public static final int VK_EXT_TRANSFORM_FEEDBACK_SPEC_VERSION = 1;
    public static final String VK_EXT_TRANSFORM_FEEDBACK_EXTENSION_NAME = "VK_EXT_transform_feedback";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TRANSFORM_FEEDBACK_FEATURES_EXT = 1000028000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TRANSFORM_FEEDBACK_PROPERTIES_EXT = 1000028001;
    public static final int VK_STRUCTURE_TYPE_PIPELINE_RASTERIZATION_STATE_STREAM_CREATE_INFO_EXT = 1000028002;
    public static final int VK_QUERY_TYPE_TRANSFORM_FEEDBACK_STREAM_EXT = 1000028004;
    public static final int VK_BUFFER_USAGE_TRANSFORM_FEEDBACK_BUFFER_BIT_EXT = 0x00000800;
    public static final int VK_BUFFER_USAGE_TRANSFORM_FEEDBACK_COUNTER_BUFFER_BIT_EXT = 0x00001000;
    public static final int VK_ACCESS_TRANSFORM_FEEDBACK_WRITE_BIT_EXT = 0x02000000;
    public static final int VK_ACCESS_TRANSFORM_FEEDBACK_COUNTER_READ_BIT_EXT = 0x04000000;
    public static final int VK_ACCESS_TRANSFORM_FEEDBACK_COUNTER_WRITE_BIT_EXT = 0x08000000;
    public static final int VK_PIPELINE_STAGE_TRANSFORM_FEEDBACK_BIT_EXT = 0x01000000;
    public static final class Handles {
        public static final Supplier<MethodHandle> MH_vkCmdBindTransformFeedbackBuffersEXT = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_vkCmdBeginTransformFeedbackEXT = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_vkCmdEndTransformFeedbackEXT = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_vkCmdBeginQueryIndexedEXT = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)));
        public static final Supplier<MethodHandle> MH_vkCmdEndQueryIndexedEXT = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)));
        public static final Supplier<MethodHandle> MH_vkCmdDrawIndirectByteCountEXT = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)));
        private Handles() {}
    }

    private VKEXTTransformFeedback() {}

    /// Invokes `vkCmdBindTransformFeedbackBuffersEXT`.
    /// ```
    /// void vkCmdBindTransformFeedbackBuffersEXT((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, uint32_t firstBinding, uint32_t bindingCount, const VkBuffer* pBuffers, const VkDeviceSize* pOffsets, const VkDeviceSize* pSizes);
    /// ```
    public static void vkCmdBindTransformFeedbackBuffersEXT(@NonNull VkCommandBuffer commandBuffer, int firstBinding, int bindingCount, @NonNull MemorySegment pBuffers, @NonNull MemorySegment pOffsets, @NonNull MemorySegment pSizes) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdBindTransformFeedbackBuffersEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdBindTransformFeedbackBuffersEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdBindTransformFeedbackBuffersEXT", commandBuffer, firstBinding, bindingCount, pBuffers, pOffsets, pSizes); }
        Handles.MH_vkCmdBindTransformFeedbackBuffersEXT.get().invokeExact(commandBuffer.capabilities().PFN_vkCmdBindTransformFeedbackBuffersEXT, commandBuffer.segment(), firstBinding, bindingCount, pBuffers, pOffsets, pSizes); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdBindTransformFeedbackBuffersEXT", e); }
    }

    /// Invokes `vkCmdBeginTransformFeedbackEXT`.
    /// ```
    /// void vkCmdBeginTransformFeedbackEXT((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, uint32_t firstCounterBuffer, uint32_t counterBufferCount, const VkBuffer* pCounterBuffers, const VkDeviceSize* pCounterBufferOffsets);
    /// ```
    public static void vkCmdBeginTransformFeedbackEXT(@NonNull VkCommandBuffer commandBuffer, int firstCounterBuffer, int counterBufferCount, @NonNull MemorySegment pCounterBuffers, @NonNull MemorySegment pCounterBufferOffsets) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdBeginTransformFeedbackEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdBeginTransformFeedbackEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdBeginTransformFeedbackEXT", commandBuffer, firstCounterBuffer, counterBufferCount, pCounterBuffers, pCounterBufferOffsets); }
        Handles.MH_vkCmdBeginTransformFeedbackEXT.get().invokeExact(commandBuffer.capabilities().PFN_vkCmdBeginTransformFeedbackEXT, commandBuffer.segment(), firstCounterBuffer, counterBufferCount, pCounterBuffers, pCounterBufferOffsets); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdBeginTransformFeedbackEXT", e); }
    }

    /// Invokes `vkCmdEndTransformFeedbackEXT`.
    /// ```
    /// void vkCmdEndTransformFeedbackEXT((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, uint32_t firstCounterBuffer, uint32_t counterBufferCount, const VkBuffer* pCounterBuffers, const VkDeviceSize* pCounterBufferOffsets);
    /// ```
    public static void vkCmdEndTransformFeedbackEXT(@NonNull VkCommandBuffer commandBuffer, int firstCounterBuffer, int counterBufferCount, @NonNull MemorySegment pCounterBuffers, @NonNull MemorySegment pCounterBufferOffsets) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdEndTransformFeedbackEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdEndTransformFeedbackEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdEndTransformFeedbackEXT", commandBuffer, firstCounterBuffer, counterBufferCount, pCounterBuffers, pCounterBufferOffsets); }
        Handles.MH_vkCmdEndTransformFeedbackEXT.get().invokeExact(commandBuffer.capabilities().PFN_vkCmdEndTransformFeedbackEXT, commandBuffer.segment(), firstCounterBuffer, counterBufferCount, pCounterBuffers, pCounterBufferOffsets); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdEndTransformFeedbackEXT", e); }
    }

    /// Invokes `vkCmdBeginQueryIndexedEXT`.
    /// ```
    /// void vkCmdBeginQueryIndexedEXT((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, (uint64_t) VkQueryPool queryPool, uint32_t query, ((uint32_t) VkFlags) VkQueryControlFlags flags, uint32_t index);
    /// ```
    public static void vkCmdBeginQueryIndexedEXT(@NonNull VkCommandBuffer commandBuffer, long queryPool, int query, int flags, int index) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdBeginQueryIndexedEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdBeginQueryIndexedEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdBeginQueryIndexedEXT", commandBuffer, queryPool, query, flags, index); }
        Handles.MH_vkCmdBeginQueryIndexedEXT.get().invokeExact(commandBuffer.capabilities().PFN_vkCmdBeginQueryIndexedEXT, commandBuffer.segment(), queryPool, query, flags, index); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdBeginQueryIndexedEXT", e); }
    }

    /// Invokes `vkCmdEndQueryIndexedEXT`.
    /// ```
    /// void vkCmdEndQueryIndexedEXT((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, (uint64_t) VkQueryPool queryPool, uint32_t query, uint32_t index);
    /// ```
    public static void vkCmdEndQueryIndexedEXT(@NonNull VkCommandBuffer commandBuffer, long queryPool, int query, int index) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdEndQueryIndexedEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdEndQueryIndexedEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdEndQueryIndexedEXT", commandBuffer, queryPool, query, index); }
        Handles.MH_vkCmdEndQueryIndexedEXT.get().invokeExact(commandBuffer.capabilities().PFN_vkCmdEndQueryIndexedEXT, commandBuffer.segment(), queryPool, query, index); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdEndQueryIndexedEXT", e); }
    }

    /// Invokes `vkCmdDrawIndirectByteCountEXT`.
    /// ```
    /// void vkCmdDrawIndirectByteCountEXT((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, uint32_t instanceCount, uint32_t firstInstance, (uint64_t) VkBuffer counterBuffer, (uint64_t) VkDeviceSize counterBufferOffset, uint32_t counterOffset, uint32_t vertexStride);
    /// ```
    public static void vkCmdDrawIndirectByteCountEXT(@NonNull VkCommandBuffer commandBuffer, int instanceCount, int firstInstance, long counterBuffer, long counterBufferOffset, int counterOffset, int vertexStride) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdDrawIndirectByteCountEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdDrawIndirectByteCountEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdDrawIndirectByteCountEXT", commandBuffer, instanceCount, firstInstance, counterBuffer, counterBufferOffset, counterOffset, vertexStride); }
        Handles.MH_vkCmdDrawIndirectByteCountEXT.get().invokeExact(commandBuffer.capabilities().PFN_vkCmdDrawIndirectByteCountEXT, commandBuffer.segment(), instanceCount, firstInstance, counterBuffer, counterBufferOffset, counterOffset, vertexStride); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdDrawIndirectByteCountEXT", e); }
    }

}
