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
package overrungl.vulkan.khr;
import java.lang.foreign.*;
import java.lang.invoke.*;
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;
import overrungl.vulkan.*;
import static overrungl.vulkan.VK14.*;
public class VKKHRLineRasterization {
    public static final int VK_KHR_LINE_RASTERIZATION_SPEC_VERSION = 1;
    public static final String VK_KHR_LINE_RASTERIZATION_EXTENSION_NAME = "VK_KHR_line_rasterization";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_LINE_RASTERIZATION_FEATURES_KHR = VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_LINE_RASTERIZATION_FEATURES;
    public static final int VK_STRUCTURE_TYPE_PIPELINE_RASTERIZATION_LINE_STATE_CREATE_INFO_KHR = VK_STRUCTURE_TYPE_PIPELINE_RASTERIZATION_LINE_STATE_CREATE_INFO;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_LINE_RASTERIZATION_PROPERTIES_KHR = VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_LINE_RASTERIZATION_PROPERTIES;
    public static final int VK_DYNAMIC_STATE_LINE_STIPPLE_KHR = VK_DYNAMIC_STATE_LINE_STIPPLE;
    public static final int VK_LINE_RASTERIZATION_MODE_DEFAULT_KHR = VK_LINE_RASTERIZATION_MODE_DEFAULT;
    public static final int VK_LINE_RASTERIZATION_MODE_RECTANGULAR_KHR = VK_LINE_RASTERIZATION_MODE_RECTANGULAR;
    public static final int VK_LINE_RASTERIZATION_MODE_BRESENHAM_KHR = VK_LINE_RASTERIZATION_MODE_BRESENHAM;
    public static final int VK_LINE_RASTERIZATION_MODE_RECTANGULAR_SMOOTH_KHR = VK_LINE_RASTERIZATION_MODE_RECTANGULAR_SMOOTH;
    private final Handles handles;
    public static final class Descriptors {
        public static final FunctionDescriptor FD_vkCmdSetLineStippleKHR = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_SHORT);
        private Descriptors() {}
    }
    public static final class Handles {
        public static final MethodHandle MH_vkCmdSetLineStippleKHR = RuntimeHelper.downcall(Descriptors.FD_vkCmdSetLineStippleKHR);
        public final MemorySegment PFN_vkCmdSetLineStippleKHR;
        private Handles(@CType("VkDevice") MemorySegment device, VKLoadFunc func) {
            PFN_vkCmdSetLineStippleKHR = func.invoke(device, "vkCmdSetLineStippleKHR", "vkCmdSetLineStipple");
        }
    }

    public VKKHRLineRasterization(@CType("VkDevice") MemorySegment device, VKLoadFunc func) {
        this.handles = new Handles(device, func);
    }

    public void CmdSetLineStippleKHR(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("uint32_t") int lineStippleFactor, @CType("uint16_t") short lineStipplePattern) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCmdSetLineStippleKHR)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetLineStippleKHR");
        try { Handles.MH_vkCmdSetLineStippleKHR.invokeExact(handles.PFN_vkCmdSetLineStippleKHR, commandBuffer, lineStippleFactor, lineStipplePattern); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetLineStippleKHR", e); }
    }

}
