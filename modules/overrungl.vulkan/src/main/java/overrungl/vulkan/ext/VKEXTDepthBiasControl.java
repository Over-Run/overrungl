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
import java.util.*;
public class VKEXTDepthBiasControl {
    public static final int VK_DEPTH_BIAS_REPRESENTATION_LEAST_REPRESENTABLE_VALUE_FORMAT_EXT = 0;
    public static final int VK_DEPTH_BIAS_REPRESENTATION_LEAST_REPRESENTABLE_VALUE_FORCE_UNORM_EXT = 1;
    public static final int VK_DEPTH_BIAS_REPRESENTATION_FLOAT_EXT = 2;
    public static final int VK_EXT_DEPTH_BIAS_CONTROL_SPEC_VERSION = 1;
    public static final String VK_EXT_DEPTH_BIAS_CONTROL_EXTENSION_NAME = "VK_EXT_depth_bias_control";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DEPTH_BIAS_CONTROL_FEATURES_EXT = 1000283000;
    public static final int VK_STRUCTURE_TYPE_DEPTH_BIAS_INFO_EXT = 1000283001;
    public static final int VK_STRUCTURE_TYPE_DEPTH_BIAS_REPRESENTATION_INFO_EXT = 1000283002;
    private final Handles handles;
    public static final class Descriptors {
        public static final FunctionDescriptor FD_vkCmdSetDepthBias2EXT = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final List<FunctionDescriptor> LIST = List.of(
            FD_vkCmdSetDepthBias2EXT
        );
        private Descriptors() {}
    }
    public static final class Handles {
        public static final MethodHandle MH_vkCmdSetDepthBias2EXT = RuntimeHelper.downcall(Descriptors.FD_vkCmdSetDepthBias2EXT);
        public final MemorySegment PFN_vkCmdSetDepthBias2EXT;
        private Handles(@CType("VkDevice") MemorySegment device, VKLoadFunc func) {
            PFN_vkCmdSetDepthBias2EXT = func.invoke(device, "vkCmdSetDepthBias2EXT");
        }
    }

    public VKEXTDepthBiasControl(@CType("VkDevice") MemorySegment device, VKLoadFunc func) {
        this.handles = new Handles(device, func);
    }

    public void CmdSetDepthBias2EXT(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("const VkDepthBiasInfoEXT *") MemorySegment pDepthBiasInfo) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCmdSetDepthBias2EXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetDepthBias2EXT");
        try { Handles.MH_vkCmdSetDepthBias2EXT.invokeExact(handles.PFN_vkCmdSetDepthBias2EXT, commandBuffer, pDepthBiasInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetDepthBias2EXT", e); }
    }

}
