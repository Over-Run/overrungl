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
public final class VKEXTDiscardRectangles {
    public static final int VK_DISCARD_RECTANGLE_MODE_INCLUSIVE_EXT = 0;
    public static final int VK_DISCARD_RECTANGLE_MODE_EXCLUSIVE_EXT = 1;
    public static final int VK_EXT_DISCARD_RECTANGLES_SPEC_VERSION = 2;
    public static final String VK_EXT_DISCARD_RECTANGLES_EXTENSION_NAME = "VK_EXT_discard_rectangles";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DISCARD_RECTANGLE_PROPERTIES_EXT = 1000099000;
    public static final int VK_STRUCTURE_TYPE_PIPELINE_DISCARD_RECTANGLE_STATE_CREATE_INFO_EXT = 1000099001;
    public static final int VK_DYNAMIC_STATE_DISCARD_RECTANGLE_EXT = 1000099000;
    public static final int VK_DYNAMIC_STATE_DISCARD_RECTANGLE_ENABLE_EXT = 1000099001;
    public static final int VK_DYNAMIC_STATE_DISCARD_RECTANGLE_MODE_EXT = 1000099002;
    public static final class Handles {
        public static final MethodHandle MH_vkCmdSetDiscardRectangleEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdSetDiscardRectangleEnableEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_vkCmdSetDiscardRectangleModeEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        private Handles() {}
    }

    private VKEXTDiscardRectangles() {}

    /// ```
    /// void vkCmdSetDiscardRectangleEXT((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, uint32_t firstDiscardRectangle, uint32_t discardRectangleCount, const VkRect2D* pDiscardRectangles);
    /// ```
    public static void vkCmdSetDiscardRectangleEXT(VkCommandBuffer commandBuffer, int firstDiscardRectangle, int discardRectangleCount, MemorySegment pDiscardRectangles) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetDiscardRectangleEXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetDiscardRectangleEXT");
        try { Handles.MH_vkCmdSetDiscardRectangleEXT.invokeExact(commandBuffer.capabilities().PFN_vkCmdSetDiscardRectangleEXT, commandBuffer.segment(), firstDiscardRectangle, discardRectangleCount, pDiscardRectangles); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetDiscardRectangleEXT", e); }
    }

    /// ```
    /// void vkCmdSetDiscardRectangleEnableEXT((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, (uint32_t) VkBool32 discardRectangleEnable);
    /// ```
    public static void vkCmdSetDiscardRectangleEnableEXT(VkCommandBuffer commandBuffer, int discardRectangleEnable) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetDiscardRectangleEnableEXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetDiscardRectangleEnableEXT");
        try { Handles.MH_vkCmdSetDiscardRectangleEnableEXT.invokeExact(commandBuffer.capabilities().PFN_vkCmdSetDiscardRectangleEnableEXT, commandBuffer.segment(), discardRectangleEnable); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetDiscardRectangleEnableEXT", e); }
    }

    /// ```
    /// void vkCmdSetDiscardRectangleModeEXT((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, (int) VkDiscardRectangleModeEXT discardRectangleMode);
    /// ```
    public static void vkCmdSetDiscardRectangleModeEXT(VkCommandBuffer commandBuffer, int discardRectangleMode) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetDiscardRectangleModeEXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetDiscardRectangleModeEXT");
        try { Handles.MH_vkCmdSetDiscardRectangleModeEXT.invokeExact(commandBuffer.capabilities().PFN_vkCmdSetDiscardRectangleModeEXT, commandBuffer.segment(), discardRectangleMode); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetDiscardRectangleModeEXT", e); }
    }

}
