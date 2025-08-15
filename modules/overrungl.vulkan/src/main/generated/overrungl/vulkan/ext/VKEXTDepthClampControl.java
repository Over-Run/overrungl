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
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.vulkan.*;
import static overrungl.internal.RuntimeHelper.*;
/// `VK_EXT_depth_clamp_control` - device extension
public final class VKEXTDepthClampControl {
    public static final int VK_DEPTH_CLAMP_MODE_VIEWPORT_RANGE_EXT = 0;
    public static final int VK_DEPTH_CLAMP_MODE_USER_DEFINED_RANGE_EXT = 1;
    public static final int VK_EXT_DEPTH_CLAMP_CONTROL_SPEC_VERSION = 1;
    public static final String VK_EXT_DEPTH_CLAMP_CONTROL_EXTENSION_NAME = "VK_EXT_depth_clamp_control";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DEPTH_CLAMP_CONTROL_FEATURES_EXT = 1000582000;
    public static final int VK_STRUCTURE_TYPE_PIPELINE_VIEWPORT_DEPTH_CLAMP_CONTROL_CREATE_INFO_EXT = 1000582001;
    public static final int VK_DYNAMIC_STATE_DEPTH_CLAMP_RANGE_EXT = 1000582000;
    public static final class Handles {
        public static final MethodHandle MH_vkCmdSetDepthClampRangeEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        private Handles() {}
    }

    private VKEXTDepthClampControl() {}

    /// Invokes `vkCmdSetDepthClampRangeEXT`.
    /// ```
    /// void vkCmdSetDepthClampRangeEXT((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, (int) VkDepthClampModeEXT depthClampMode, const VkDepthClampRangeEXT* pDepthClampRange);
    /// ```
    public static void vkCmdSetDepthClampRangeEXT(@NonNull VkCommandBuffer commandBuffer, int depthClampMode, @NonNull MemorySegment pDepthClampRange) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetDepthClampRangeEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdSetDepthClampRangeEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdSetDepthClampRangeEXT", commandBuffer, depthClampMode, pDepthClampRange); }
        Handles.MH_vkCmdSetDepthClampRangeEXT.invokeExact(commandBuffer.capabilities().PFN_vkCmdSetDepthClampRangeEXT, commandBuffer.segment(), depthClampMode, pDepthClampRange); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetDepthClampRangeEXT", e); }
    }

}
