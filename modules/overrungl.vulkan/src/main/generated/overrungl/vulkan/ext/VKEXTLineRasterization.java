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
public final class VKEXTLineRasterization {
    public static final int VK_EXT_LINE_RASTERIZATION_SPEC_VERSION = 1;
    public static final String VK_EXT_LINE_RASTERIZATION_EXTENSION_NAME = "VK_EXT_line_rasterization";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_LINE_RASTERIZATION_FEATURES_EXT = 1000259000;
    public static final int VK_STRUCTURE_TYPE_PIPELINE_RASTERIZATION_LINE_STATE_CREATE_INFO_EXT = 1000259001;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_LINE_RASTERIZATION_PROPERTIES_EXT = 1000259002;
    public static final int VK_DYNAMIC_STATE_LINE_STIPPLE_EXT = 1000259000;
    public static final int VK_LINE_RASTERIZATION_MODE_DEFAULT_EXT = 0;
    public static final int VK_LINE_RASTERIZATION_MODE_RECTANGULAR_EXT = 1;
    public static final int VK_LINE_RASTERIZATION_MODE_BRESENHAM_EXT = 2;
    public static final int VK_LINE_RASTERIZATION_MODE_RECTANGULAR_SMOOTH_EXT = 3;
    public static final class Handles {
        public static final MethodHandle MH_vkCmdSetLineStippleEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_SHORT));
        private Handles() {}
    }

    private VKEXTLineRasterization() {}

    /// ```
    /// void vkCmdSetLineStippleEXT((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, uint32_t lineStippleFactor, uint16_t lineStipplePattern);
    /// ```
    public static void vkCmdSetLineStippleEXT(VkCommandBuffer commandBuffer, int lineStippleFactor, short lineStipplePattern) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetLineStippleEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdSetLineStippleEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdSetLineStippleEXT", commandBuffer, lineStippleFactor, lineStipplePattern); }
        Handles.MH_vkCmdSetLineStippleEXT.invokeExact(commandBuffer.capabilities().PFN_vkCmdSetLineStippleEXT, commandBuffer.segment(), lineStippleFactor, lineStipplePattern); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetLineStippleEXT", e); }
    }

}
