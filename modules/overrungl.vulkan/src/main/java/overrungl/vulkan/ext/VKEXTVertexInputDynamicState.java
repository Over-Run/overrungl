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
public class VKEXTVertexInputDynamicState {
    public static final int VK_EXT_VERTEX_INPUT_DYNAMIC_STATE_SPEC_VERSION = 2;
    public static final String VK_EXT_VERTEX_INPUT_DYNAMIC_STATE_EXTENSION_NAME = "VK_EXT_vertex_input_dynamic_state";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VERTEX_INPUT_DYNAMIC_STATE_FEATURES_EXT = 1000352000;
    public static final int VK_STRUCTURE_TYPE_VERTEX_INPUT_BINDING_DESCRIPTION_2_EXT = 1000482001;
    public static final int VK_STRUCTURE_TYPE_VERTEX_INPUT_ATTRIBUTE_DESCRIPTION_2_EXT = 1000482002;
    public static final int VK_DYNAMIC_STATE_VERTEX_INPUT_EXT = 1000352000;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_vkCmdSetVertexInputEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public final MemorySegment PFN_vkCmdSetVertexInputEXT;
        private Handles(MemorySegment device, VKLoadFunc func) {
            PFN_vkCmdSetVertexInputEXT = func.invoke(device, "vkCmdSetVertexInputEXT");
        }
    }

    public VKEXTVertexInputDynamicState(MemorySegment device, VKLoadFunc func) {
        this.handles = new Handles(device, func);
    }

    /// ```
    /// void vkCmdSetVertexInputEXT(VkCommandBuffer commandBuffer, uint32_t vertexBindingDescriptionCount, const VkVertexInputBindingDescription2EXT* pVertexBindingDescriptions, uint32_t vertexAttributeDescriptionCount, const VkVertexInputAttributeDescription2EXT* pVertexAttributeDescriptions);
    /// ```
    public void CmdSetVertexInputEXT(MemorySegment commandBuffer, int vertexBindingDescriptionCount, MemorySegment pVertexBindingDescriptions, int vertexAttributeDescriptionCount, MemorySegment pVertexAttributeDescriptions) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCmdSetVertexInputEXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetVertexInputEXT");
        try { Handles.MH_vkCmdSetVertexInputEXT.invokeExact(handles.PFN_vkCmdSetVertexInputEXT, commandBuffer, vertexBindingDescriptionCount, pVertexBindingDescriptions, vertexAttributeDescriptionCount, pVertexAttributeDescriptions); }
        catch (Throwable e) { throw new RuntimeException("error in CmdSetVertexInputEXT", e); }
    }

}
