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
import static overrungl.internal.RuntimeHelper.*;
import overrungl.util.*;
import overrungl.vulkan.*;
public final class VKEXTExtendedDynamicState {
    public static final int VK_EXT_EXTENDED_DYNAMIC_STATE_SPEC_VERSION = 1;
    public static final String VK_EXT_EXTENDED_DYNAMIC_STATE_EXTENSION_NAME = "VK_EXT_extended_dynamic_state";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTENDED_DYNAMIC_STATE_FEATURES_EXT = 1000267000;
    public static final int VK_DYNAMIC_STATE_CULL_MODE_EXT = 1000267000;
    public static final int VK_DYNAMIC_STATE_FRONT_FACE_EXT = 1000267001;
    public static final int VK_DYNAMIC_STATE_PRIMITIVE_TOPOLOGY_EXT = 1000267002;
    public static final int VK_DYNAMIC_STATE_VIEWPORT_WITH_COUNT_EXT = 1000267003;
    public static final int VK_DYNAMIC_STATE_SCISSOR_WITH_COUNT_EXT = 1000267004;
    public static final int VK_DYNAMIC_STATE_VERTEX_INPUT_BINDING_STRIDE_EXT = 1000267005;
    public static final int VK_DYNAMIC_STATE_DEPTH_TEST_ENABLE_EXT = 1000267006;
    public static final int VK_DYNAMIC_STATE_DEPTH_WRITE_ENABLE_EXT = 1000267007;
    public static final int VK_DYNAMIC_STATE_DEPTH_COMPARE_OP_EXT = 1000267008;
    public static final int VK_DYNAMIC_STATE_DEPTH_BOUNDS_TEST_ENABLE_EXT = 1000267009;
    public static final int VK_DYNAMIC_STATE_STENCIL_TEST_ENABLE_EXT = 1000267010;
    public static final int VK_DYNAMIC_STATE_STENCIL_OP_EXT = 1000267011;
    public static final class Handles {
        public static final MethodHandle MH_vkCmdSetCullModeEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_vkCmdSetFrontFaceEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_vkCmdSetPrimitiveTopologyEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_vkCmdSetViewportWithCountEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdSetScissorWithCountEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdBindVertexBuffers2EXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdSetDepthTestEnableEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_vkCmdSetDepthWriteEnableEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_vkCmdSetDepthCompareOpEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_vkCmdSetDepthBoundsTestEnableEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_vkCmdSetStencilTestEnableEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_vkCmdSetStencilOpEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        private Handles() {}
    }

    private VKEXTExtendedDynamicState() {}

    /// ```
    /// void vkCmdSetCullModeEXT((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, ((uint32_t) VkFlags) VkCullModeFlags cullMode);
    /// ```
    public static void vkCmdSetCullModeEXT(VkCommandBuffer commandBuffer, int cullMode) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetCullModeEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdSetCullModeEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdSetCullModeEXT", commandBuffer, cullMode); }
        Handles.MH_vkCmdSetCullModeEXT.invokeExact(commandBuffer.capabilities().PFN_vkCmdSetCullModeEXT, commandBuffer.segment(), cullMode); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetCullModeEXT", e); }
    }

    /// ```
    /// void vkCmdSetFrontFaceEXT((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, (int) VkFrontFace frontFace);
    /// ```
    public static void vkCmdSetFrontFaceEXT(VkCommandBuffer commandBuffer, int frontFace) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetFrontFaceEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdSetFrontFaceEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdSetFrontFaceEXT", commandBuffer, frontFace); }
        Handles.MH_vkCmdSetFrontFaceEXT.invokeExact(commandBuffer.capabilities().PFN_vkCmdSetFrontFaceEXT, commandBuffer.segment(), frontFace); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetFrontFaceEXT", e); }
    }

    /// ```
    /// void vkCmdSetPrimitiveTopologyEXT((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, (int) VkPrimitiveTopology primitiveTopology);
    /// ```
    public static void vkCmdSetPrimitiveTopologyEXT(VkCommandBuffer commandBuffer, int primitiveTopology) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetPrimitiveTopologyEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdSetPrimitiveTopologyEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdSetPrimitiveTopologyEXT", commandBuffer, primitiveTopology); }
        Handles.MH_vkCmdSetPrimitiveTopologyEXT.invokeExact(commandBuffer.capabilities().PFN_vkCmdSetPrimitiveTopologyEXT, commandBuffer.segment(), primitiveTopology); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetPrimitiveTopologyEXT", e); }
    }

    /// ```
    /// void vkCmdSetViewportWithCountEXT((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, uint32_t viewportCount, const VkViewport* pViewports);
    /// ```
    public static void vkCmdSetViewportWithCountEXT(VkCommandBuffer commandBuffer, int viewportCount, MemorySegment pViewports) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetViewportWithCountEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdSetViewportWithCountEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdSetViewportWithCountEXT", commandBuffer, viewportCount, pViewports); }
        Handles.MH_vkCmdSetViewportWithCountEXT.invokeExact(commandBuffer.capabilities().PFN_vkCmdSetViewportWithCountEXT, commandBuffer.segment(), viewportCount, pViewports); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetViewportWithCountEXT", e); }
    }

    /// ```
    /// void vkCmdSetScissorWithCountEXT((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, uint32_t scissorCount, const VkRect2D* pScissors);
    /// ```
    public static void vkCmdSetScissorWithCountEXT(VkCommandBuffer commandBuffer, int scissorCount, MemorySegment pScissors) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetScissorWithCountEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdSetScissorWithCountEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdSetScissorWithCountEXT", commandBuffer, scissorCount, pScissors); }
        Handles.MH_vkCmdSetScissorWithCountEXT.invokeExact(commandBuffer.capabilities().PFN_vkCmdSetScissorWithCountEXT, commandBuffer.segment(), scissorCount, pScissors); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetScissorWithCountEXT", e); }
    }

    /// ```
    /// void vkCmdBindVertexBuffers2EXT((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, uint32_t firstBinding, uint32_t bindingCount, const VkBuffer* pBuffers, const VkDeviceSize* pOffsets, const VkDeviceSize* pSizes, const VkDeviceSize* pStrides);
    /// ```
    public static void vkCmdBindVertexBuffers2EXT(VkCommandBuffer commandBuffer, int firstBinding, int bindingCount, MemorySegment pBuffers, MemorySegment pOffsets, MemorySegment pSizes, MemorySegment pStrides) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdBindVertexBuffers2EXT)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdBindVertexBuffers2EXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdBindVertexBuffers2EXT", commandBuffer, firstBinding, bindingCount, pBuffers, pOffsets, pSizes, pStrides); }
        Handles.MH_vkCmdBindVertexBuffers2EXT.invokeExact(commandBuffer.capabilities().PFN_vkCmdBindVertexBuffers2EXT, commandBuffer.segment(), firstBinding, bindingCount, pBuffers, pOffsets, pSizes, pStrides); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdBindVertexBuffers2EXT", e); }
    }

    /// ```
    /// void vkCmdSetDepthTestEnableEXT((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, (uint32_t) VkBool32 depthTestEnable);
    /// ```
    public static void vkCmdSetDepthTestEnableEXT(VkCommandBuffer commandBuffer, int depthTestEnable) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetDepthTestEnableEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdSetDepthTestEnableEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdSetDepthTestEnableEXT", commandBuffer, depthTestEnable); }
        Handles.MH_vkCmdSetDepthTestEnableEXT.invokeExact(commandBuffer.capabilities().PFN_vkCmdSetDepthTestEnableEXT, commandBuffer.segment(), depthTestEnable); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetDepthTestEnableEXT", e); }
    }

    /// ```
    /// void vkCmdSetDepthWriteEnableEXT((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, (uint32_t) VkBool32 depthWriteEnable);
    /// ```
    public static void vkCmdSetDepthWriteEnableEXT(VkCommandBuffer commandBuffer, int depthWriteEnable) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetDepthWriteEnableEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdSetDepthWriteEnableEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdSetDepthWriteEnableEXT", commandBuffer, depthWriteEnable); }
        Handles.MH_vkCmdSetDepthWriteEnableEXT.invokeExact(commandBuffer.capabilities().PFN_vkCmdSetDepthWriteEnableEXT, commandBuffer.segment(), depthWriteEnable); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetDepthWriteEnableEXT", e); }
    }

    /// ```
    /// void vkCmdSetDepthCompareOpEXT((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, (int) VkCompareOp depthCompareOp);
    /// ```
    public static void vkCmdSetDepthCompareOpEXT(VkCommandBuffer commandBuffer, int depthCompareOp) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetDepthCompareOpEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdSetDepthCompareOpEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdSetDepthCompareOpEXT", commandBuffer, depthCompareOp); }
        Handles.MH_vkCmdSetDepthCompareOpEXT.invokeExact(commandBuffer.capabilities().PFN_vkCmdSetDepthCompareOpEXT, commandBuffer.segment(), depthCompareOp); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetDepthCompareOpEXT", e); }
    }

    /// ```
    /// void vkCmdSetDepthBoundsTestEnableEXT((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, (uint32_t) VkBool32 depthBoundsTestEnable);
    /// ```
    public static void vkCmdSetDepthBoundsTestEnableEXT(VkCommandBuffer commandBuffer, int depthBoundsTestEnable) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetDepthBoundsTestEnableEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdSetDepthBoundsTestEnableEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdSetDepthBoundsTestEnableEXT", commandBuffer, depthBoundsTestEnable); }
        Handles.MH_vkCmdSetDepthBoundsTestEnableEXT.invokeExact(commandBuffer.capabilities().PFN_vkCmdSetDepthBoundsTestEnableEXT, commandBuffer.segment(), depthBoundsTestEnable); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetDepthBoundsTestEnableEXT", e); }
    }

    /// ```
    /// void vkCmdSetStencilTestEnableEXT((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, (uint32_t) VkBool32 stencilTestEnable);
    /// ```
    public static void vkCmdSetStencilTestEnableEXT(VkCommandBuffer commandBuffer, int stencilTestEnable) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetStencilTestEnableEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdSetStencilTestEnableEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdSetStencilTestEnableEXT", commandBuffer, stencilTestEnable); }
        Handles.MH_vkCmdSetStencilTestEnableEXT.invokeExact(commandBuffer.capabilities().PFN_vkCmdSetStencilTestEnableEXT, commandBuffer.segment(), stencilTestEnable); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetStencilTestEnableEXT", e); }
    }

    /// ```
    /// void vkCmdSetStencilOpEXT((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, ((uint32_t) VkFlags) VkStencilFaceFlags faceMask, (int) VkStencilOp failOp, (int) VkStencilOp passOp, (int) VkStencilOp depthFailOp, (int) VkCompareOp compareOp);
    /// ```
    public static void vkCmdSetStencilOpEXT(VkCommandBuffer commandBuffer, int faceMask, int failOp, int passOp, int depthFailOp, int compareOp) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetStencilOpEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdSetStencilOpEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdSetStencilOpEXT", commandBuffer, faceMask, failOp, passOp, depthFailOp, compareOp); }
        Handles.MH_vkCmdSetStencilOpEXT.invokeExact(commandBuffer.capabilities().PFN_vkCmdSetStencilOpEXT, commandBuffer.segment(), faceMask, failOp, passOp, depthFailOp, compareOp); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetStencilOpEXT", e); }
    }

}
