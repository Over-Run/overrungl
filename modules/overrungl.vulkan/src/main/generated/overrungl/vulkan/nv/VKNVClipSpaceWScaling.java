// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.nv;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.vulkan.*;
import static overrungl.internal.RuntimeHelper.*;
/// `VK_NV_clip_space_w_scaling` - device extension
public final class VKNVClipSpaceWScaling {
    public static final int VK_NV_CLIP_SPACE_W_SCALING_SPEC_VERSION = 1;
    public static final String VK_NV_CLIP_SPACE_W_SCALING_EXTENSION_NAME = "VK_NV_clip_space_w_scaling";
    public static final int VK_STRUCTURE_TYPE_PIPELINE_VIEWPORT_W_SCALING_STATE_CREATE_INFO_NV = 1000087000;
    public static final int VK_DYNAMIC_STATE_VIEWPORT_W_SCALING_NV = 1000087000;
    public static final class Handles {
        public static final MethodHandle MH_vkCmdSetViewportWScalingNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        private Handles() {}
    }

    private VKNVClipSpaceWScaling() {}

    /// Invokes `vkCmdSetViewportWScalingNV`.
    /// ```
    /// void vkCmdSetViewportWScalingNV((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, uint32_t firstViewport, uint32_t viewportCount, const VkViewportWScalingNV* pViewportWScalings);
    /// ```
    public static void vkCmdSetViewportWScalingNV(@NonNull VkCommandBuffer commandBuffer, int firstViewport, int viewportCount, @NonNull MemorySegment pViewportWScalings) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetViewportWScalingNV)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdSetViewportWScalingNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdSetViewportWScalingNV", commandBuffer, firstViewport, viewportCount, pViewportWScalings); }
        Handles.MH_vkCmdSetViewportWScalingNV.invokeExact(commandBuffer.capabilities().PFN_vkCmdSetViewportWScalingNV, commandBuffer.segment(), firstViewport, viewportCount, pViewportWScalings); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetViewportWScalingNV", e); }
    }

}
