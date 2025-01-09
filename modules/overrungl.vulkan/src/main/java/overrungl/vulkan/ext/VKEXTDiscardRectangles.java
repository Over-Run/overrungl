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
public class VKEXTDiscardRectangles {
    public static final int VK_DISCARD_RECTANGLE_MODE_INCLUSIVE_EXT = 0;
    public static final int VK_DISCARD_RECTANGLE_MODE_EXCLUSIVE_EXT = 1;
    public static final int VK_EXT_DISCARD_RECTANGLES_SPEC_VERSION = 2;
    public static final String VK_EXT_DISCARD_RECTANGLES_EXTENSION_NAME = "VK_EXT_discard_rectangles";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DISCARD_RECTANGLE_PROPERTIES_EXT = 1000099000;
    public static final int VK_STRUCTURE_TYPE_PIPELINE_DISCARD_RECTANGLE_STATE_CREATE_INFO_EXT = 1000099001;
    public static final int VK_DYNAMIC_STATE_DISCARD_RECTANGLE_EXT = 1000099000;
    public static final int VK_DYNAMIC_STATE_DISCARD_RECTANGLE_ENABLE_EXT = 1000099001;
    public static final int VK_DYNAMIC_STATE_DISCARD_RECTANGLE_MODE_EXT = 1000099002;
    public static final MethodHandle MH_vkCmdSetDiscardRectangleEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public static final MethodHandle MH_vkCmdSetDiscardRectangleEnableEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
    public static final MethodHandle MH_vkCmdSetDiscardRectangleModeEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_vkCmdSetDiscardRectangleEXT;
    public final MemorySegment PFN_vkCmdSetDiscardRectangleEnableEXT;
    public final MemorySegment PFN_vkCmdSetDiscardRectangleModeEXT;

    public VKEXTDiscardRectangles(@CType("VkDevice") MemorySegment device, VKLoadFunc func) {
        PFN_vkCmdSetDiscardRectangleEXT = func.invoke(device, "vkCmdSetDiscardRectangleEXT");
        PFN_vkCmdSetDiscardRectangleEnableEXT = func.invoke(device, "vkCmdSetDiscardRectangleEnableEXT");
        PFN_vkCmdSetDiscardRectangleModeEXT = func.invoke(device, "vkCmdSetDiscardRectangleModeEXT");
    }

    public void CmdSetDiscardRectangleEXT(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("uint32_t") int firstDiscardRectangle, @CType("uint32_t") int discardRectangleCount, @CType("const VkRect2D *") MemorySegment pDiscardRectangles) {
        if (Unmarshal.isNullPointer(PFN_vkCmdSetDiscardRectangleEXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetDiscardRectangleEXT");
        try { MH_vkCmdSetDiscardRectangleEXT.invokeExact(PFN_vkCmdSetDiscardRectangleEXT, commandBuffer, firstDiscardRectangle, discardRectangleCount, pDiscardRectangles); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetDiscardRectangleEXT", e); }
    }

    public void CmdSetDiscardRectangleEnableEXT(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("VkBool32") int discardRectangleEnable) {
        if (Unmarshal.isNullPointer(PFN_vkCmdSetDiscardRectangleEnableEXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetDiscardRectangleEnableEXT");
        try { MH_vkCmdSetDiscardRectangleEnableEXT.invokeExact(PFN_vkCmdSetDiscardRectangleEnableEXT, commandBuffer, discardRectangleEnable); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetDiscardRectangleEnableEXT", e); }
    }

    public void CmdSetDiscardRectangleModeEXT(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("VkDiscardRectangleModeEXT") int discardRectangleMode) {
        if (Unmarshal.isNullPointer(PFN_vkCmdSetDiscardRectangleModeEXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetDiscardRectangleModeEXT");
        try { MH_vkCmdSetDiscardRectangleModeEXT.invokeExact(PFN_vkCmdSetDiscardRectangleModeEXT, commandBuffer, discardRectangleMode); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetDiscardRectangleModeEXT", e); }
    }

}
