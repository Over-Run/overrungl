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
public class VKEXTConditionalRendering {
    public static final int VK_CONDITIONAL_RENDERING_INVERTED_BIT_EXT = 0x00000001;
    public static final int VK_EXT_CONDITIONAL_RENDERING_SPEC_VERSION = 2;
    public static final String VK_EXT_CONDITIONAL_RENDERING_EXTENSION_NAME = "VK_EXT_conditional_rendering";
    public static final int VK_STRUCTURE_TYPE_COMMAND_BUFFER_INHERITANCE_CONDITIONAL_RENDERING_INFO_EXT = 1000081000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_CONDITIONAL_RENDERING_FEATURES_EXT = 1000081001;
    public static final int VK_STRUCTURE_TYPE_CONDITIONAL_RENDERING_BEGIN_INFO_EXT = 1000081002;
    public static final int VK_ACCESS_CONDITIONAL_RENDERING_READ_BIT_EXT = 0x00100000;
    public static final int VK_BUFFER_USAGE_CONDITIONAL_RENDERING_BIT_EXT = 0x00000200;
    public static final int VK_PIPELINE_STAGE_CONDITIONAL_RENDERING_BIT_EXT = 0x00040000;
    public static final MethodHandle MH_vkCmdBeginConditionalRenderingEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public static final MethodHandle MH_vkCmdEndConditionalRenderingEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
    public final MemorySegment PFN_vkCmdBeginConditionalRenderingEXT;
    public final MemorySegment PFN_vkCmdEndConditionalRenderingEXT;

    public VKEXTConditionalRendering(@CType("VkDevice") MemorySegment device, VKLoadFunc func) {
        PFN_vkCmdBeginConditionalRenderingEXT = func.invoke(device, "vkCmdBeginConditionalRenderingEXT");
        PFN_vkCmdEndConditionalRenderingEXT = func.invoke(device, "vkCmdEndConditionalRenderingEXT");
    }

    public void CmdBeginConditionalRenderingEXT(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("const VkConditionalRenderingBeginInfoEXT *") MemorySegment pConditionalRenderingBegin) {
        if (Unmarshal.isNullPointer(PFN_vkCmdBeginConditionalRenderingEXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdBeginConditionalRenderingEXT");
        try { MH_vkCmdBeginConditionalRenderingEXT.invokeExact(PFN_vkCmdBeginConditionalRenderingEXT, commandBuffer, pConditionalRenderingBegin); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdBeginConditionalRenderingEXT", e); }
    }

    public void CmdEndConditionalRenderingEXT(@CType("VkCommandBuffer") MemorySegment commandBuffer) {
        if (Unmarshal.isNullPointer(PFN_vkCmdEndConditionalRenderingEXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdEndConditionalRenderingEXT");
        try { MH_vkCmdEndConditionalRenderingEXT.invokeExact(PFN_vkCmdEndConditionalRenderingEXT, commandBuffer); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdEndConditionalRenderingEXT", e); }
    }

}