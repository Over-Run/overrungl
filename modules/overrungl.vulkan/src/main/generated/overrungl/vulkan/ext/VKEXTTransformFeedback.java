/*
 * MIT License
 *
 * Copyright (c) 2022-2025 Overrun Organization
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 */

// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext;
import java.lang.foreign.*;
import java.lang.invoke.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;
import overrungl.vulkan.*;
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
        public static final MethodHandle MH_vkCmdBindTransformFeedbackBuffersEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdBeginTransformFeedbackEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdEndTransformFeedbackEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdBeginQueryIndexedEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_vkCmdEndQueryIndexedEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_vkCmdDrawIndirectByteCountEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        private Handles() {}
    }

    private VKEXTTransformFeedback() {}

    /// ```
    /// void vkCmdBindTransformFeedbackBuffersEXT((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, uint32_t firstBinding, uint32_t bindingCount, const VkBuffer* pBuffers, const VkDeviceSize* pOffsets, const VkDeviceSize* pSizes);
    /// ```
    public static void vkCmdBindTransformFeedbackBuffersEXT(VkCommandBuffer commandBuffer, int firstBinding, int bindingCount, MemorySegment pBuffers, MemorySegment pOffsets, MemorySegment pSizes) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdBindTransformFeedbackBuffersEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdBindTransformFeedbackBuffersEXT");
        try { Handles.MH_vkCmdBindTransformFeedbackBuffersEXT.invokeExact(commandBuffer.capabilities().PFN_vkCmdBindTransformFeedbackBuffersEXT, commandBuffer.segment(), firstBinding, bindingCount, pBuffers, pOffsets, pSizes); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdBindTransformFeedbackBuffersEXT", e); }
    }

    /// ```
    /// void vkCmdBeginTransformFeedbackEXT((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, uint32_t firstCounterBuffer, uint32_t counterBufferCount, const VkBuffer* pCounterBuffers, const VkDeviceSize* pCounterBufferOffsets);
    /// ```
    public static void vkCmdBeginTransformFeedbackEXT(VkCommandBuffer commandBuffer, int firstCounterBuffer, int counterBufferCount, MemorySegment pCounterBuffers, MemorySegment pCounterBufferOffsets) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdBeginTransformFeedbackEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdBeginTransformFeedbackEXT");
        try { Handles.MH_vkCmdBeginTransformFeedbackEXT.invokeExact(commandBuffer.capabilities().PFN_vkCmdBeginTransformFeedbackEXT, commandBuffer.segment(), firstCounterBuffer, counterBufferCount, pCounterBuffers, pCounterBufferOffsets); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdBeginTransformFeedbackEXT", e); }
    }

    /// ```
    /// void vkCmdEndTransformFeedbackEXT((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, uint32_t firstCounterBuffer, uint32_t counterBufferCount, const VkBuffer* pCounterBuffers, const VkDeviceSize* pCounterBufferOffsets);
    /// ```
    public static void vkCmdEndTransformFeedbackEXT(VkCommandBuffer commandBuffer, int firstCounterBuffer, int counterBufferCount, MemorySegment pCounterBuffers, MemorySegment pCounterBufferOffsets) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdEndTransformFeedbackEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdEndTransformFeedbackEXT");
        try { Handles.MH_vkCmdEndTransformFeedbackEXT.invokeExact(commandBuffer.capabilities().PFN_vkCmdEndTransformFeedbackEXT, commandBuffer.segment(), firstCounterBuffer, counterBufferCount, pCounterBuffers, pCounterBufferOffsets); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdEndTransformFeedbackEXT", e); }
    }

    /// ```
    /// void vkCmdBeginQueryIndexedEXT((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, (uint64_t) VkQueryPool queryPool, uint32_t query, ((uint32_t) VkFlags) VkQueryControlFlags flags, uint32_t index);
    /// ```
    public static void vkCmdBeginQueryIndexedEXT(VkCommandBuffer commandBuffer, long queryPool, int query, int flags, int index) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdBeginQueryIndexedEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdBeginQueryIndexedEXT");
        try { Handles.MH_vkCmdBeginQueryIndexedEXT.invokeExact(commandBuffer.capabilities().PFN_vkCmdBeginQueryIndexedEXT, commandBuffer.segment(), queryPool, query, flags, index); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdBeginQueryIndexedEXT", e); }
    }

    /// ```
    /// void vkCmdEndQueryIndexedEXT((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, (uint64_t) VkQueryPool queryPool, uint32_t query, uint32_t index);
    /// ```
    public static void vkCmdEndQueryIndexedEXT(VkCommandBuffer commandBuffer, long queryPool, int query, int index) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdEndQueryIndexedEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdEndQueryIndexedEXT");
        try { Handles.MH_vkCmdEndQueryIndexedEXT.invokeExact(commandBuffer.capabilities().PFN_vkCmdEndQueryIndexedEXT, commandBuffer.segment(), queryPool, query, index); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdEndQueryIndexedEXT", e); }
    }

    /// ```
    /// void vkCmdDrawIndirectByteCountEXT((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, uint32_t instanceCount, uint32_t firstInstance, (uint64_t) VkBuffer counterBuffer, (uint64_t) VkDeviceSize counterBufferOffset, uint32_t counterOffset, uint32_t vertexStride);
    /// ```
    public static void vkCmdDrawIndirectByteCountEXT(VkCommandBuffer commandBuffer, int instanceCount, int firstInstance, long counterBuffer, long counterBufferOffset, int counterOffset, int vertexStride) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdDrawIndirectByteCountEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdDrawIndirectByteCountEXT");
        try { Handles.MH_vkCmdDrawIndirectByteCountEXT.invokeExact(commandBuffer.capabilities().PFN_vkCmdDrawIndirectByteCountEXT, commandBuffer.segment(), instanceCount, firstInstance, counterBuffer, counterBufferOffset, counterOffset, vertexStride); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdDrawIndirectByteCountEXT", e); }
    }

}
