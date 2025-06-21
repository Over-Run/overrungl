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
public final class VKEXTFragmentDensityMapOffset {
    public static final int VK_EXT_FRAGMENT_DENSITY_MAP_OFFSET_SPEC_VERSION = 1;
    public static final String VK_EXT_FRAGMENT_DENSITY_MAP_OFFSET_EXTENSION_NAME = "VK_EXT_fragment_density_map_offset";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_DENSITY_MAP_OFFSET_FEATURES_EXT = 1000619000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_DENSITY_MAP_OFFSET_PROPERTIES_EXT = 1000619001;
    public static final int VK_STRUCTURE_TYPE_RENDER_PASS_FRAGMENT_DENSITY_MAP_OFFSET_END_INFO_EXT = 1000619002;
    public static final int VK_STRUCTURE_TYPE_RENDERING_END_INFO_EXT = 1000619003;
    public static final int VK_IMAGE_CREATE_FRAGMENT_DENSITY_MAP_OFFSET_BIT_EXT = 0x00008000;
    public static final class Handles {
        public static final MethodHandle MH_vkCmdEndRendering2EXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        private Handles() {}
    }

    private VKEXTFragmentDensityMapOffset() {}

    /// ```
    /// void vkCmdEndRendering2EXT((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, const VkRenderingEndInfoEXT* pRenderingEndInfo);
    /// ```
    public static void vkCmdEndRendering2EXT(VkCommandBuffer commandBuffer, MemorySegment pRenderingEndInfo) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdEndRendering2EXT)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdEndRendering2EXT");
        try { Handles.MH_vkCmdEndRendering2EXT.invokeExact(commandBuffer.capabilities().PFN_vkCmdEndRendering2EXT, commandBuffer.segment(), pRenderingEndInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdEndRendering2EXT", e); }
    }

}
