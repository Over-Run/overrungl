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
public final class VKEXTAttachmentFeedbackLoopDynamicState {
    public static final int VK_EXT_ATTACHMENT_FEEDBACK_LOOP_DYNAMIC_STATE_SPEC_VERSION = 1;
    public static final String VK_EXT_ATTACHMENT_FEEDBACK_LOOP_DYNAMIC_STATE_EXTENSION_NAME = "VK_EXT_attachment_feedback_loop_dynamic_state";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_ATTACHMENT_FEEDBACK_LOOP_DYNAMIC_STATE_FEATURES_EXT = 1000524000;
    public static final int VK_DYNAMIC_STATE_ATTACHMENT_FEEDBACK_LOOP_ENABLE_EXT = 1000524000;
    public static final class Handles {
        public static final MethodHandle MH_vkCmdSetAttachmentFeedbackLoopEnableEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        private Handles() {}
    }

    private VKEXTAttachmentFeedbackLoopDynamicState() {}

    /// ```
    /// void vkCmdSetAttachmentFeedbackLoopEnableEXT((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, ((uint32_t) VkFlags) VkImageAspectFlags aspectMask);
    /// ```
    public static void vkCmdSetAttachmentFeedbackLoopEnableEXT(VkCommandBuffer commandBuffer, int aspectMask) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetAttachmentFeedbackLoopEnableEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdSetAttachmentFeedbackLoopEnableEXT");
        try { Handles.MH_vkCmdSetAttachmentFeedbackLoopEnableEXT.invokeExact(commandBuffer.capabilities().PFN_vkCmdSetAttachmentFeedbackLoopEnableEXT, commandBuffer.segment(), aspectMask); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetAttachmentFeedbackLoopEnableEXT", e); }
    }

}
