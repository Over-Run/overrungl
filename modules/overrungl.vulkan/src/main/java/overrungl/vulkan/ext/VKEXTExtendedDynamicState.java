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
import static overrungl.vulkan.VK13.*;
public class VKEXTExtendedDynamicState {
    public static final int VK_EXT_EXTENDED_DYNAMIC_STATE_SPEC_VERSION = 1;
    public static final String VK_EXT_EXTENDED_DYNAMIC_STATE_EXTENSION_NAME = "VK_EXT_extended_dynamic_state";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTENDED_DYNAMIC_STATE_FEATURES_EXT = 1000267000;
    public static final int VK_DYNAMIC_STATE_CULL_MODE_EXT = VK_DYNAMIC_STATE_CULL_MODE;
    public static final int VK_DYNAMIC_STATE_FRONT_FACE_EXT = VK_DYNAMIC_STATE_FRONT_FACE;
    public static final int VK_DYNAMIC_STATE_PRIMITIVE_TOPOLOGY_EXT = VK_DYNAMIC_STATE_PRIMITIVE_TOPOLOGY;
    public static final int VK_DYNAMIC_STATE_VIEWPORT_WITH_COUNT_EXT = VK_DYNAMIC_STATE_VIEWPORT_WITH_COUNT;
    public static final int VK_DYNAMIC_STATE_SCISSOR_WITH_COUNT_EXT = VK_DYNAMIC_STATE_SCISSOR_WITH_COUNT;
    public static final int VK_DYNAMIC_STATE_VERTEX_INPUT_BINDING_STRIDE_EXT = VK_DYNAMIC_STATE_VERTEX_INPUT_BINDING_STRIDE;
    public static final int VK_DYNAMIC_STATE_DEPTH_TEST_ENABLE_EXT = VK_DYNAMIC_STATE_DEPTH_TEST_ENABLE;
    public static final int VK_DYNAMIC_STATE_DEPTH_WRITE_ENABLE_EXT = VK_DYNAMIC_STATE_DEPTH_WRITE_ENABLE;
    public static final int VK_DYNAMIC_STATE_DEPTH_COMPARE_OP_EXT = VK_DYNAMIC_STATE_DEPTH_COMPARE_OP;
    public static final int VK_DYNAMIC_STATE_DEPTH_BOUNDS_TEST_ENABLE_EXT = VK_DYNAMIC_STATE_DEPTH_BOUNDS_TEST_ENABLE;
    public static final int VK_DYNAMIC_STATE_STENCIL_TEST_ENABLE_EXT = VK_DYNAMIC_STATE_STENCIL_TEST_ENABLE;
    public static final int VK_DYNAMIC_STATE_STENCIL_OP_EXT = VK_DYNAMIC_STATE_STENCIL_OP;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_vkCmdSetCullModeEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_vkCmdSetFrontFaceEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_vkCmdSetPrimitiveTopologyEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_vkCmdSetViewportWithCountEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdSetScissorWithCountEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdBindVertexBuffers2EXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdSetDepthTestEnableEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_vkCmdSetDepthWriteEnableEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_vkCmdSetDepthCompareOpEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_vkCmdSetDepthBoundsTestEnableEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_vkCmdSetStencilTestEnableEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_vkCmdSetStencilOpEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public final MemorySegment PFN_vkCmdSetCullModeEXT;
        public final MemorySegment PFN_vkCmdSetFrontFaceEXT;
        public final MemorySegment PFN_vkCmdSetPrimitiveTopologyEXT;
        public final MemorySegment PFN_vkCmdSetViewportWithCountEXT;
        public final MemorySegment PFN_vkCmdSetScissorWithCountEXT;
        public final MemorySegment PFN_vkCmdBindVertexBuffers2EXT;
        public final MemorySegment PFN_vkCmdSetDepthTestEnableEXT;
        public final MemorySegment PFN_vkCmdSetDepthWriteEnableEXT;
        public final MemorySegment PFN_vkCmdSetDepthCompareOpEXT;
        public final MemorySegment PFN_vkCmdSetDepthBoundsTestEnableEXT;
        public final MemorySegment PFN_vkCmdSetStencilTestEnableEXT;
        public final MemorySegment PFN_vkCmdSetStencilOpEXT;
        private Handles(@CType("VkDevice") MemorySegment device, VKLoadFunc func) {
            PFN_vkCmdSetCullModeEXT = func.invoke(device, "vkCmdSetCullModeEXT", "vkCmdSetCullMode");
            PFN_vkCmdSetFrontFaceEXT = func.invoke(device, "vkCmdSetFrontFaceEXT", "vkCmdSetFrontFace");
            PFN_vkCmdSetPrimitiveTopologyEXT = func.invoke(device, "vkCmdSetPrimitiveTopologyEXT", "vkCmdSetPrimitiveTopology");
            PFN_vkCmdSetViewportWithCountEXT = func.invoke(device, "vkCmdSetViewportWithCountEXT", "vkCmdSetViewportWithCount");
            PFN_vkCmdSetScissorWithCountEXT = func.invoke(device, "vkCmdSetScissorWithCountEXT", "vkCmdSetScissorWithCount");
            PFN_vkCmdBindVertexBuffers2EXT = func.invoke(device, "vkCmdBindVertexBuffers2EXT", "vkCmdBindVertexBuffers2");
            PFN_vkCmdSetDepthTestEnableEXT = func.invoke(device, "vkCmdSetDepthTestEnableEXT", "vkCmdSetDepthTestEnable");
            PFN_vkCmdSetDepthWriteEnableEXT = func.invoke(device, "vkCmdSetDepthWriteEnableEXT", "vkCmdSetDepthWriteEnable");
            PFN_vkCmdSetDepthCompareOpEXT = func.invoke(device, "vkCmdSetDepthCompareOpEXT", "vkCmdSetDepthCompareOp");
            PFN_vkCmdSetDepthBoundsTestEnableEXT = func.invoke(device, "vkCmdSetDepthBoundsTestEnableEXT", "vkCmdSetDepthBoundsTestEnable");
            PFN_vkCmdSetStencilTestEnableEXT = func.invoke(device, "vkCmdSetStencilTestEnableEXT", "vkCmdSetStencilTestEnable");
            PFN_vkCmdSetStencilOpEXT = func.invoke(device, "vkCmdSetStencilOpEXT", "vkCmdSetStencilOp");
        }
    }

    public VKEXTExtendedDynamicState(@CType("VkDevice") MemorySegment device, VKLoadFunc func) {
        this.handles = new Handles(device, func);
    }

    public void CmdSetCullModeEXT(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("VkCullModeFlags") int cullMode) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCmdSetCullModeEXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetCullModeEXT");
        try { Handles.MH_vkCmdSetCullModeEXT.invokeExact(handles.PFN_vkCmdSetCullModeEXT, commandBuffer, cullMode); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetCullModeEXT", e); }
    }

    public void CmdSetFrontFaceEXT(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("VkFrontFace") int frontFace) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCmdSetFrontFaceEXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetFrontFaceEXT");
        try { Handles.MH_vkCmdSetFrontFaceEXT.invokeExact(handles.PFN_vkCmdSetFrontFaceEXT, commandBuffer, frontFace); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetFrontFaceEXT", e); }
    }

    public void CmdSetPrimitiveTopologyEXT(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("VkPrimitiveTopology") int primitiveTopology) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCmdSetPrimitiveTopologyEXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetPrimitiveTopologyEXT");
        try { Handles.MH_vkCmdSetPrimitiveTopologyEXT.invokeExact(handles.PFN_vkCmdSetPrimitiveTopologyEXT, commandBuffer, primitiveTopology); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetPrimitiveTopologyEXT", e); }
    }

    public void CmdSetViewportWithCountEXT(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("uint32_t") int viewportCount, @CType("const VkViewport *") MemorySegment pViewports) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCmdSetViewportWithCountEXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetViewportWithCountEXT");
        try { Handles.MH_vkCmdSetViewportWithCountEXT.invokeExact(handles.PFN_vkCmdSetViewportWithCountEXT, commandBuffer, viewportCount, pViewports); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetViewportWithCountEXT", e); }
    }

    public void CmdSetScissorWithCountEXT(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("uint32_t") int scissorCount, @CType("const VkRect2D *") MemorySegment pScissors) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCmdSetScissorWithCountEXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetScissorWithCountEXT");
        try { Handles.MH_vkCmdSetScissorWithCountEXT.invokeExact(handles.PFN_vkCmdSetScissorWithCountEXT, commandBuffer, scissorCount, pScissors); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetScissorWithCountEXT", e); }
    }

    public void CmdBindVertexBuffers2EXT(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("uint32_t") int firstBinding, @CType("uint32_t") int bindingCount, @CType("const VkBuffer *") MemorySegment pBuffers, @CType("const VkDeviceSize *") MemorySegment pOffsets, @CType("const VkDeviceSize *") MemorySegment pSizes, @CType("const VkDeviceSize *") MemorySegment pStrides) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCmdBindVertexBuffers2EXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdBindVertexBuffers2EXT");
        try { Handles.MH_vkCmdBindVertexBuffers2EXT.invokeExact(handles.PFN_vkCmdBindVertexBuffers2EXT, commandBuffer, firstBinding, bindingCount, pBuffers, pOffsets, pSizes, pStrides); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdBindVertexBuffers2EXT", e); }
    }

    public void CmdSetDepthTestEnableEXT(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("VkBool32") int depthTestEnable) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCmdSetDepthTestEnableEXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetDepthTestEnableEXT");
        try { Handles.MH_vkCmdSetDepthTestEnableEXT.invokeExact(handles.PFN_vkCmdSetDepthTestEnableEXT, commandBuffer, depthTestEnable); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetDepthTestEnableEXT", e); }
    }

    public void CmdSetDepthWriteEnableEXT(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("VkBool32") int depthWriteEnable) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCmdSetDepthWriteEnableEXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetDepthWriteEnableEXT");
        try { Handles.MH_vkCmdSetDepthWriteEnableEXT.invokeExact(handles.PFN_vkCmdSetDepthWriteEnableEXT, commandBuffer, depthWriteEnable); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetDepthWriteEnableEXT", e); }
    }

    public void CmdSetDepthCompareOpEXT(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("VkCompareOp") int depthCompareOp) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCmdSetDepthCompareOpEXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetDepthCompareOpEXT");
        try { Handles.MH_vkCmdSetDepthCompareOpEXT.invokeExact(handles.PFN_vkCmdSetDepthCompareOpEXT, commandBuffer, depthCompareOp); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetDepthCompareOpEXT", e); }
    }

    public void CmdSetDepthBoundsTestEnableEXT(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("VkBool32") int depthBoundsTestEnable) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCmdSetDepthBoundsTestEnableEXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetDepthBoundsTestEnableEXT");
        try { Handles.MH_vkCmdSetDepthBoundsTestEnableEXT.invokeExact(handles.PFN_vkCmdSetDepthBoundsTestEnableEXT, commandBuffer, depthBoundsTestEnable); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetDepthBoundsTestEnableEXT", e); }
    }

    public void CmdSetStencilTestEnableEXT(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("VkBool32") int stencilTestEnable) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCmdSetStencilTestEnableEXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetStencilTestEnableEXT");
        try { Handles.MH_vkCmdSetStencilTestEnableEXT.invokeExact(handles.PFN_vkCmdSetStencilTestEnableEXT, commandBuffer, stencilTestEnable); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetStencilTestEnableEXT", e); }
    }

    public void CmdSetStencilOpEXT(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("VkStencilFaceFlags") int faceMask, @CType("VkStencilOp") int failOp, @CType("VkStencilOp") int passOp, @CType("VkStencilOp") int depthFailOp, @CType("VkCompareOp") int compareOp) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCmdSetStencilOpEXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetStencilOpEXT");
        try { Handles.MH_vkCmdSetStencilOpEXT.invokeExact(handles.PFN_vkCmdSetStencilOpEXT, commandBuffer, faceMask, failOp, passOp, depthFailOp, compareOp); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetStencilOpEXT", e); }
    }

}
