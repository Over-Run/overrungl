// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext;
import java.lang.foreign.*;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.vulkan.*;
import static overrungl.internal.RuntimeHelper.*;
/// `VK_EXT_attachment_feedback_loop_dynamic_state` - device extension
public final class VKEXTAttachmentFeedbackLoopDynamicState {
    public static final int VK_EXT_ATTACHMENT_FEEDBACK_LOOP_DYNAMIC_STATE_SPEC_VERSION = 1;
    public static final String VK_EXT_ATTACHMENT_FEEDBACK_LOOP_DYNAMIC_STATE_EXTENSION_NAME = "VK_EXT_attachment_feedback_loop_dynamic_state";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_ATTACHMENT_FEEDBACK_LOOP_DYNAMIC_STATE_FEATURES_EXT = 1000524000;
    public static final int VK_DYNAMIC_STATE_ATTACHMENT_FEEDBACK_LOOP_ENABLE_EXT = 1000524000;
    public static final class Handles {
        public static final Supplier<MethodHandle> MH_vkCmdSetAttachmentFeedbackLoopEnableEXT = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)));
        private Handles() {}
    }

    private VKEXTAttachmentFeedbackLoopDynamicState() {}

    /// Invokes `vkCmdSetAttachmentFeedbackLoopEnableEXT`.
    /// ```
    /// void vkCmdSetAttachmentFeedbackLoopEnableEXT((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, ((uint32_t) VkFlags) VkImageAspectFlags aspectMask);
    /// ```
    public static void vkCmdSetAttachmentFeedbackLoopEnableEXT(@NonNull VkCommandBuffer commandBuffer, int aspectMask) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetAttachmentFeedbackLoopEnableEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdSetAttachmentFeedbackLoopEnableEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdSetAttachmentFeedbackLoopEnableEXT", commandBuffer, aspectMask); }
        Handles.MH_vkCmdSetAttachmentFeedbackLoopEnableEXT.get().invokeExact(commandBuffer.capabilities().PFN_vkCmdSetAttachmentFeedbackLoopEnableEXT, commandBuffer.segment(), aspectMask); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetAttachmentFeedbackLoopEnableEXT", e); }
    }

}
