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
public final class VKEXTMultiDraw {
    public static final int VK_EXT_MULTI_DRAW_SPEC_VERSION = 1;
    public static final String VK_EXT_MULTI_DRAW_EXTENSION_NAME = "VK_EXT_multi_draw";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MULTI_DRAW_FEATURES_EXT = 1000392000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MULTI_DRAW_PROPERTIES_EXT = 1000392001;
    public static final class Handles {
        public static final MethodHandle MH_vkCmdDrawMultiEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_vkCmdDrawMultiIndexedEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        private Handles() {}
    }

    private VKEXTMultiDraw() {}

    /// ```
    /// void vkCmdDrawMultiEXT((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, uint32_t drawCount, const VkMultiDrawInfoEXT* pVertexInfo, uint32_t instanceCount, uint32_t firstInstance, uint32_t stride);
    /// ```
    public static void vkCmdDrawMultiEXT(VkCommandBuffer commandBuffer, int drawCount, MemorySegment pVertexInfo, int instanceCount, int firstInstance, int stride) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdDrawMultiEXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdDrawMultiEXT");
        try { Handles.MH_vkCmdDrawMultiEXT.invokeExact(commandBuffer.capabilities().PFN_vkCmdDrawMultiEXT, commandBuffer.segment(), drawCount, pVertexInfo, instanceCount, firstInstance, stride); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdDrawMultiEXT", e); }
    }

    /// ```
    /// void vkCmdDrawMultiIndexedEXT((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, uint32_t drawCount, const VkMultiDrawIndexedInfoEXT* pIndexInfo, uint32_t instanceCount, uint32_t firstInstance, uint32_t stride, const int32_t* pVertexOffset);
    /// ```
    public static void vkCmdDrawMultiIndexedEXT(VkCommandBuffer commandBuffer, int drawCount, MemorySegment pIndexInfo, int instanceCount, int firstInstance, int stride, MemorySegment pVertexOffset) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdDrawMultiIndexedEXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdDrawMultiIndexedEXT");
        try { Handles.MH_vkCmdDrawMultiIndexedEXT.invokeExact(commandBuffer.capabilities().PFN_vkCmdDrawMultiIndexedEXT, commandBuffer.segment(), drawCount, pIndexInfo, instanceCount, firstInstance, stride, pVertexOffset); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdDrawMultiIndexedEXT", e); }
    }

}
