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
public class VKEXTMultiDraw {
    public static final int VK_EXT_MULTI_DRAW_SPEC_VERSION = 1;
    public static final String VK_EXT_MULTI_DRAW_EXTENSION_NAME = "VK_EXT_multi_draw";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MULTI_DRAW_FEATURES_EXT = 1000392000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MULTI_DRAW_PROPERTIES_EXT = 1000392001;
    public static final MethodHandle MH_vkCmdDrawMultiEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public static final MethodHandle MH_vkCmdDrawMultiIndexedEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_vkCmdDrawMultiEXT;
    public final MemorySegment PFN_vkCmdDrawMultiIndexedEXT;

    public VKEXTMultiDraw(@CType("VkDevice") MemorySegment device, VKLoadFunc func) {
        PFN_vkCmdDrawMultiEXT = func.invoke(device, "vkCmdDrawMultiEXT");
        PFN_vkCmdDrawMultiIndexedEXT = func.invoke(device, "vkCmdDrawMultiIndexedEXT");
    }

    public void CmdDrawMultiEXT(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("uint32_t") int drawCount, @CType("const VkMultiDrawInfoEXT *") MemorySegment pVertexInfo, @CType("uint32_t") int instanceCount, @CType("uint32_t") int firstInstance, @CType("uint32_t") int stride) {
        if (Unmarshal.isNullPointer(PFN_vkCmdDrawMultiEXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdDrawMultiEXT");
        try { MH_vkCmdDrawMultiEXT.invokeExact(PFN_vkCmdDrawMultiEXT, commandBuffer, drawCount, pVertexInfo, instanceCount, firstInstance, stride); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdDrawMultiEXT", e); }
    }

    public void CmdDrawMultiIndexedEXT(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("uint32_t") int drawCount, @CType("const VkMultiDrawIndexedInfoEXT *") MemorySegment pIndexInfo, @CType("uint32_t") int instanceCount, @CType("uint32_t") int firstInstance, @CType("uint32_t") int stride, @CType("const int32_t *") MemorySegment pVertexOffset) {
        if (Unmarshal.isNullPointer(PFN_vkCmdDrawMultiIndexedEXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdDrawMultiIndexedEXT");
        try { MH_vkCmdDrawMultiIndexedEXT.invokeExact(PFN_vkCmdDrawMultiIndexedEXT, commandBuffer, drawCount, pIndexInfo, instanceCount, firstInstance, stride, pVertexOffset); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdDrawMultiIndexedEXT", e); }
    }

}
