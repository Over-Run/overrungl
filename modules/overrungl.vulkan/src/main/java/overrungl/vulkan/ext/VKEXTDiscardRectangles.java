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
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_vkCmdSetDiscardRectangleEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdSetDiscardRectangleEnableEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_vkCmdSetDiscardRectangleModeEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        public final MemorySegment PFN_vkCmdSetDiscardRectangleEXT;
        public final MemorySegment PFN_vkCmdSetDiscardRectangleEnableEXT;
        public final MemorySegment PFN_vkCmdSetDiscardRectangleModeEXT;
        private Handles(MemorySegment device, VKLoadFunc func) {
            PFN_vkCmdSetDiscardRectangleEXT = func.invoke(device, "vkCmdSetDiscardRectangleEXT");
            PFN_vkCmdSetDiscardRectangleEnableEXT = func.invoke(device, "vkCmdSetDiscardRectangleEnableEXT");
            PFN_vkCmdSetDiscardRectangleModeEXT = func.invoke(device, "vkCmdSetDiscardRectangleModeEXT");
        }
    }

    public VKEXTDiscardRectangles(MemorySegment device, VKLoadFunc func) {
        this.handles = new Handles(device, func);
    }

    /// ```
    /// void vkCmdSetDiscardRectangleEXT(VkCommandBuffer commandBuffer, uint32_t firstDiscardRectangle, uint32_t discardRectangleCount, const VkRect2D* pDiscardRectangles);
    /// ```
    public void CmdSetDiscardRectangleEXT(MemorySegment commandBuffer, int firstDiscardRectangle, int discardRectangleCount, MemorySegment pDiscardRectangles) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCmdSetDiscardRectangleEXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetDiscardRectangleEXT");
        try { Handles.MH_vkCmdSetDiscardRectangleEXT.invokeExact(handles.PFN_vkCmdSetDiscardRectangleEXT, commandBuffer, firstDiscardRectangle, discardRectangleCount, pDiscardRectangles); }
        catch (Throwable e) { throw new RuntimeException("error in CmdSetDiscardRectangleEXT", e); }
    }

    /// ```
    /// void vkCmdSetDiscardRectangleEnableEXT(VkCommandBuffer commandBuffer, VkBool32 discardRectangleEnable);
    /// ```
    public void CmdSetDiscardRectangleEnableEXT(MemorySegment commandBuffer, int discardRectangleEnable) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCmdSetDiscardRectangleEnableEXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetDiscardRectangleEnableEXT");
        try { Handles.MH_vkCmdSetDiscardRectangleEnableEXT.invokeExact(handles.PFN_vkCmdSetDiscardRectangleEnableEXT, commandBuffer, discardRectangleEnable); }
        catch (Throwable e) { throw new RuntimeException("error in CmdSetDiscardRectangleEnableEXT", e); }
    }

    /// ```
    /// void vkCmdSetDiscardRectangleModeEXT(VkCommandBuffer commandBuffer, VkDiscardRectangleModeEXT discardRectangleMode);
    /// ```
    public void CmdSetDiscardRectangleModeEXT(MemorySegment commandBuffer, int discardRectangleMode) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCmdSetDiscardRectangleModeEXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetDiscardRectangleModeEXT");
        try { Handles.MH_vkCmdSetDiscardRectangleModeEXT.invokeExact(handles.PFN_vkCmdSetDiscardRectangleModeEXT, commandBuffer, discardRectangleMode); }
        catch (Throwable e) { throw new RuntimeException("error in CmdSetDiscardRectangleModeEXT", e); }
    }

}
