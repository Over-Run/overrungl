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
public class VKEXTTransformFeedback {
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
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_vkCmdBindTransformFeedbackBuffersEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdBeginTransformFeedbackEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdEndTransformFeedbackEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdBeginQueryIndexedEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_vkCmdEndQueryIndexedEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_vkCmdDrawIndirectByteCountEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public final MemorySegment PFN_vkCmdBindTransformFeedbackBuffersEXT;
        public final MemorySegment PFN_vkCmdBeginTransformFeedbackEXT;
        public final MemorySegment PFN_vkCmdEndTransformFeedbackEXT;
        public final MemorySegment PFN_vkCmdBeginQueryIndexedEXT;
        public final MemorySegment PFN_vkCmdEndQueryIndexedEXT;
        public final MemorySegment PFN_vkCmdDrawIndirectByteCountEXT;
        private Handles(MemorySegment device, VKLoadFunc func) {
            PFN_vkCmdBindTransformFeedbackBuffersEXT = func.invoke(device, "vkCmdBindTransformFeedbackBuffersEXT");
            PFN_vkCmdBeginTransformFeedbackEXT = func.invoke(device, "vkCmdBeginTransformFeedbackEXT");
            PFN_vkCmdEndTransformFeedbackEXT = func.invoke(device, "vkCmdEndTransformFeedbackEXT");
            PFN_vkCmdBeginQueryIndexedEXT = func.invoke(device, "vkCmdBeginQueryIndexedEXT");
            PFN_vkCmdEndQueryIndexedEXT = func.invoke(device, "vkCmdEndQueryIndexedEXT");
            PFN_vkCmdDrawIndirectByteCountEXT = func.invoke(device, "vkCmdDrawIndirectByteCountEXT");
        }
    }

    public VKEXTTransformFeedback(MemorySegment device, VKLoadFunc func) {
        this.handles = new Handles(device, func);
    }

    /// ```
    /// void vkCmdBindTransformFeedbackBuffersEXT(VkCommandBuffer commandBuffer, uint32_t firstBinding, uint32_t bindingCount, const VkBuffer* pBuffers, const VkDeviceSize* pOffsets, const VkDeviceSize* pSizes);
    /// ```
    public void CmdBindTransformFeedbackBuffersEXT(MemorySegment commandBuffer, int firstBinding, int bindingCount, MemorySegment pBuffers, MemorySegment pOffsets, MemorySegment pSizes) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCmdBindTransformFeedbackBuffersEXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdBindTransformFeedbackBuffersEXT");
        try { Handles.MH_vkCmdBindTransformFeedbackBuffersEXT.invokeExact(handles.PFN_vkCmdBindTransformFeedbackBuffersEXT, commandBuffer, firstBinding, bindingCount, pBuffers, pOffsets, pSizes); }
        catch (Throwable e) { throw new RuntimeException("error in CmdBindTransformFeedbackBuffersEXT", e); }
    }

    /// ```
    /// void vkCmdBeginTransformFeedbackEXT(VkCommandBuffer commandBuffer, uint32_t firstCounterBuffer, uint32_t counterBufferCount, const VkBuffer* pCounterBuffers, const VkDeviceSize* pCounterBufferOffsets);
    /// ```
    public void CmdBeginTransformFeedbackEXT(MemorySegment commandBuffer, int firstCounterBuffer, int counterBufferCount, MemorySegment pCounterBuffers, MemorySegment pCounterBufferOffsets) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCmdBeginTransformFeedbackEXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdBeginTransformFeedbackEXT");
        try { Handles.MH_vkCmdBeginTransformFeedbackEXT.invokeExact(handles.PFN_vkCmdBeginTransformFeedbackEXT, commandBuffer, firstCounterBuffer, counterBufferCount, pCounterBuffers, pCounterBufferOffsets); }
        catch (Throwable e) { throw new RuntimeException("error in CmdBeginTransformFeedbackEXT", e); }
    }

    /// ```
    /// void vkCmdEndTransformFeedbackEXT(VkCommandBuffer commandBuffer, uint32_t firstCounterBuffer, uint32_t counterBufferCount, const VkBuffer* pCounterBuffers, const VkDeviceSize* pCounterBufferOffsets);
    /// ```
    public void CmdEndTransformFeedbackEXT(MemorySegment commandBuffer, int firstCounterBuffer, int counterBufferCount, MemorySegment pCounterBuffers, MemorySegment pCounterBufferOffsets) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCmdEndTransformFeedbackEXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdEndTransformFeedbackEXT");
        try { Handles.MH_vkCmdEndTransformFeedbackEXT.invokeExact(handles.PFN_vkCmdEndTransformFeedbackEXT, commandBuffer, firstCounterBuffer, counterBufferCount, pCounterBuffers, pCounterBufferOffsets); }
        catch (Throwable e) { throw new RuntimeException("error in CmdEndTransformFeedbackEXT", e); }
    }

    /// ```
    /// void vkCmdBeginQueryIndexedEXT(VkCommandBuffer commandBuffer, VkQueryPool queryPool, uint32_t query, VkQueryControlFlags flags, uint32_t index);
    /// ```
    public void CmdBeginQueryIndexedEXT(MemorySegment commandBuffer, long queryPool, int query, int flags, int index) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCmdBeginQueryIndexedEXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdBeginQueryIndexedEXT");
        try { Handles.MH_vkCmdBeginQueryIndexedEXT.invokeExact(handles.PFN_vkCmdBeginQueryIndexedEXT, commandBuffer, queryPool, query, flags, index); }
        catch (Throwable e) { throw new RuntimeException("error in CmdBeginQueryIndexedEXT", e); }
    }

    /// ```
    /// void vkCmdEndQueryIndexedEXT(VkCommandBuffer commandBuffer, VkQueryPool queryPool, uint32_t query, uint32_t index);
    /// ```
    public void CmdEndQueryIndexedEXT(MemorySegment commandBuffer, long queryPool, int query, int index) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCmdEndQueryIndexedEXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdEndQueryIndexedEXT");
        try { Handles.MH_vkCmdEndQueryIndexedEXT.invokeExact(handles.PFN_vkCmdEndQueryIndexedEXT, commandBuffer, queryPool, query, index); }
        catch (Throwable e) { throw new RuntimeException("error in CmdEndQueryIndexedEXT", e); }
    }

    /// ```
    /// void vkCmdDrawIndirectByteCountEXT(VkCommandBuffer commandBuffer, uint32_t instanceCount, uint32_t firstInstance, VkBuffer counterBuffer, VkDeviceSize counterBufferOffset, uint32_t counterOffset, uint32_t vertexStride);
    /// ```
    public void CmdDrawIndirectByteCountEXT(MemorySegment commandBuffer, int instanceCount, int firstInstance, long counterBuffer, long counterBufferOffset, int counterOffset, int vertexStride) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCmdDrawIndirectByteCountEXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdDrawIndirectByteCountEXT");
        try { Handles.MH_vkCmdDrawIndirectByteCountEXT.invokeExact(handles.PFN_vkCmdDrawIndirectByteCountEXT, commandBuffer, instanceCount, firstInstance, counterBuffer, counterBufferOffset, counterOffset, vertexStride); }
        catch (Throwable e) { throw new RuntimeException("error in CmdDrawIndirectByteCountEXT", e); }
    }

}
