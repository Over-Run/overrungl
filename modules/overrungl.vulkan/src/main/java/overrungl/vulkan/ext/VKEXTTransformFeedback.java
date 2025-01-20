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
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;
import overrungl.vulkan.*;
import java.util.*;
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
    public static final class Descriptors {
        public static final FunctionDescriptor FD_vkCmdBindTransformFeedbackBuffersEXT = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkCmdBeginTransformFeedbackEXT = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkCmdEndTransformFeedbackEXT = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkCmdBeginQueryIndexedEXT = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_vkCmdEndQueryIndexedEXT = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_vkCmdDrawIndirectByteCountEXT = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final List<FunctionDescriptor> LIST = List.of(
            FD_vkCmdBindTransformFeedbackBuffersEXT,
            FD_vkCmdBeginTransformFeedbackEXT,
            FD_vkCmdEndTransformFeedbackEXT,
            FD_vkCmdBeginQueryIndexedEXT,
            FD_vkCmdEndQueryIndexedEXT,
            FD_vkCmdDrawIndirectByteCountEXT
        );
        private Descriptors() {}
    }
    public static final class Handles {
        public static final MethodHandle MH_vkCmdBindTransformFeedbackBuffersEXT = RuntimeHelper.downcall(Descriptors.FD_vkCmdBindTransformFeedbackBuffersEXT);
        public static final MethodHandle MH_vkCmdBeginTransformFeedbackEXT = RuntimeHelper.downcall(Descriptors.FD_vkCmdBeginTransformFeedbackEXT);
        public static final MethodHandle MH_vkCmdEndTransformFeedbackEXT = RuntimeHelper.downcall(Descriptors.FD_vkCmdEndTransformFeedbackEXT);
        public static final MethodHandle MH_vkCmdBeginQueryIndexedEXT = RuntimeHelper.downcall(Descriptors.FD_vkCmdBeginQueryIndexedEXT);
        public static final MethodHandle MH_vkCmdEndQueryIndexedEXT = RuntimeHelper.downcall(Descriptors.FD_vkCmdEndQueryIndexedEXT);
        public static final MethodHandle MH_vkCmdDrawIndirectByteCountEXT = RuntimeHelper.downcall(Descriptors.FD_vkCmdDrawIndirectByteCountEXT);
        public final MemorySegment PFN_vkCmdBindTransformFeedbackBuffersEXT;
        public final MemorySegment PFN_vkCmdBeginTransformFeedbackEXT;
        public final MemorySegment PFN_vkCmdEndTransformFeedbackEXT;
        public final MemorySegment PFN_vkCmdBeginQueryIndexedEXT;
        public final MemorySegment PFN_vkCmdEndQueryIndexedEXT;
        public final MemorySegment PFN_vkCmdDrawIndirectByteCountEXT;
        private Handles(@CType("VkDevice") MemorySegment device, VKLoadFunc func) {
            PFN_vkCmdBindTransformFeedbackBuffersEXT = func.invoke(device, "vkCmdBindTransformFeedbackBuffersEXT");
            PFN_vkCmdBeginTransformFeedbackEXT = func.invoke(device, "vkCmdBeginTransformFeedbackEXT");
            PFN_vkCmdEndTransformFeedbackEXT = func.invoke(device, "vkCmdEndTransformFeedbackEXT");
            PFN_vkCmdBeginQueryIndexedEXT = func.invoke(device, "vkCmdBeginQueryIndexedEXT");
            PFN_vkCmdEndQueryIndexedEXT = func.invoke(device, "vkCmdEndQueryIndexedEXT");
            PFN_vkCmdDrawIndirectByteCountEXT = func.invoke(device, "vkCmdDrawIndirectByteCountEXT");
        }
    }

    public VKEXTTransformFeedback(@CType("VkDevice") MemorySegment device, VKLoadFunc func) {
        this.handles = new Handles(device, func);
    }

    public void CmdBindTransformFeedbackBuffersEXT(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("uint32_t") int firstBinding, @CType("uint32_t") int bindingCount, @CType("const VkBuffer *") MemorySegment pBuffers, @CType("const VkDeviceSize *") MemorySegment pOffsets, @CType("const VkDeviceSize *") MemorySegment pSizes) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCmdBindTransformFeedbackBuffersEXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdBindTransformFeedbackBuffersEXT");
        try { Handles.MH_vkCmdBindTransformFeedbackBuffersEXT.invokeExact(handles.PFN_vkCmdBindTransformFeedbackBuffersEXT, commandBuffer, firstBinding, bindingCount, pBuffers, pOffsets, pSizes); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdBindTransformFeedbackBuffersEXT", e); }
    }

    public void CmdBeginTransformFeedbackEXT(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("uint32_t") int firstCounterBuffer, @CType("uint32_t") int counterBufferCount, @CType("const VkBuffer *") MemorySegment pCounterBuffers, @CType("const VkDeviceSize *") MemorySegment pCounterBufferOffsets) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCmdBeginTransformFeedbackEXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdBeginTransformFeedbackEXT");
        try { Handles.MH_vkCmdBeginTransformFeedbackEXT.invokeExact(handles.PFN_vkCmdBeginTransformFeedbackEXT, commandBuffer, firstCounterBuffer, counterBufferCount, pCounterBuffers, pCounterBufferOffsets); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdBeginTransformFeedbackEXT", e); }
    }

    public void CmdEndTransformFeedbackEXT(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("uint32_t") int firstCounterBuffer, @CType("uint32_t") int counterBufferCount, @CType("const VkBuffer *") MemorySegment pCounterBuffers, @CType("const VkDeviceSize *") MemorySegment pCounterBufferOffsets) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCmdEndTransformFeedbackEXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdEndTransformFeedbackEXT");
        try { Handles.MH_vkCmdEndTransformFeedbackEXT.invokeExact(handles.PFN_vkCmdEndTransformFeedbackEXT, commandBuffer, firstCounterBuffer, counterBufferCount, pCounterBuffers, pCounterBufferOffsets); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdEndTransformFeedbackEXT", e); }
    }

    public void CmdBeginQueryIndexedEXT(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("VkQueryPool") MemorySegment queryPool, @CType("uint32_t") int query, @CType("VkQueryControlFlags") int flags, @CType("uint32_t") int index) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCmdBeginQueryIndexedEXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdBeginQueryIndexedEXT");
        try { Handles.MH_vkCmdBeginQueryIndexedEXT.invokeExact(handles.PFN_vkCmdBeginQueryIndexedEXT, commandBuffer, queryPool, query, flags, index); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdBeginQueryIndexedEXT", e); }
    }

    public void CmdEndQueryIndexedEXT(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("VkQueryPool") MemorySegment queryPool, @CType("uint32_t") int query, @CType("uint32_t") int index) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCmdEndQueryIndexedEXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdEndQueryIndexedEXT");
        try { Handles.MH_vkCmdEndQueryIndexedEXT.invokeExact(handles.PFN_vkCmdEndQueryIndexedEXT, commandBuffer, queryPool, query, index); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdEndQueryIndexedEXT", e); }
    }

    public void CmdDrawIndirectByteCountEXT(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("uint32_t") int instanceCount, @CType("uint32_t") int firstInstance, @CType("VkBuffer") MemorySegment counterBuffer, @CType("VkDeviceSize") long counterBufferOffset, @CType("uint32_t") int counterOffset, @CType("uint32_t") int vertexStride) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCmdDrawIndirectByteCountEXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdDrawIndirectByteCountEXT");
        try { Handles.MH_vkCmdDrawIndirectByteCountEXT.invokeExact(handles.PFN_vkCmdDrawIndirectByteCountEXT, commandBuffer, instanceCount, firstInstance, counterBuffer, counterBufferOffset, counterOffset, vertexStride); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdDrawIndirectByteCountEXT", e); }
    }

}
