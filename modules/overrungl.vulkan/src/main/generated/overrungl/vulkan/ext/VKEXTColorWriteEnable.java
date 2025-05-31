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
public final class VKEXTColorWriteEnable {
    public static final int VK_EXT_COLOR_WRITE_ENABLE_SPEC_VERSION = 1;
    public static final String VK_EXT_COLOR_WRITE_ENABLE_EXTENSION_NAME = "VK_EXT_color_write_enable";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COLOR_WRITE_ENABLE_FEATURES_EXT = 1000381000;
    public static final int VK_STRUCTURE_TYPE_PIPELINE_COLOR_WRITE_CREATE_INFO_EXT = 1000381001;
    public static final int VK_DYNAMIC_STATE_COLOR_WRITE_ENABLE_EXT = 1000381000;
    public static final class Handles {
        public static final MethodHandle MH_vkCmdSetColorWriteEnableEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        private Handles() {}
    }

    private VKEXTColorWriteEnable() {}

    /// ```
    /// void vkCmdSetColorWriteEnableEXT((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, uint32_t attachmentCount, const VkBool32* pColorWriteEnables);
    /// ```
    public static void vkCmdSetColorWriteEnableEXT(VkCommandBuffer commandBuffer, int attachmentCount, MemorySegment pColorWriteEnables) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetColorWriteEnableEXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetColorWriteEnableEXT");
        try { Handles.MH_vkCmdSetColorWriteEnableEXT.invokeExact(commandBuffer.capabilities().PFN_vkCmdSetColorWriteEnableEXT, commandBuffer.segment(), attachmentCount, pColorWriteEnables); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetColorWriteEnableEXT", e); }
    }

}
