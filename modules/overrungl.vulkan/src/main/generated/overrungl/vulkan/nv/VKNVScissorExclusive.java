// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.nv;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.vulkan.*;
import static overrungl.internal.RuntimeHelper.*;
/// `VK_NV_scissor_exclusive` - device extension
public final class VKNVScissorExclusive {
    public static final int VK_NV_SCISSOR_EXCLUSIVE_SPEC_VERSION = 2;
    public static final String VK_NV_SCISSOR_EXCLUSIVE_EXTENSION_NAME = "VK_NV_scissor_exclusive";
    public static final int VK_STRUCTURE_TYPE_PIPELINE_VIEWPORT_EXCLUSIVE_SCISSOR_STATE_CREATE_INFO_NV = 1000205000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXCLUSIVE_SCISSOR_FEATURES_NV = 1000205002;
    public static final int VK_DYNAMIC_STATE_EXCLUSIVE_SCISSOR_ENABLE_NV = 1000205000;
    public static final int VK_DYNAMIC_STATE_EXCLUSIVE_SCISSOR_NV = 1000205001;
    public static final class Handles {
        public static final MethodHandle MH_vkCmdSetExclusiveScissorEnableNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdSetExclusiveScissorNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        private Handles() {}
    }

    private VKNVScissorExclusive() {}

    /// Invokes `vkCmdSetExclusiveScissorEnableNV`.
    /// ```
    /// void vkCmdSetExclusiveScissorEnableNV((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, uint32_t firstExclusiveScissor, uint32_t exclusiveScissorCount, const VkBool32* pExclusiveScissorEnables);
    /// ```
    public static void vkCmdSetExclusiveScissorEnableNV(@NonNull VkCommandBuffer commandBuffer, int firstExclusiveScissor, int exclusiveScissorCount, @NonNull MemorySegment pExclusiveScissorEnables) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetExclusiveScissorEnableNV)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdSetExclusiveScissorEnableNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdSetExclusiveScissorEnableNV", commandBuffer, firstExclusiveScissor, exclusiveScissorCount, pExclusiveScissorEnables); }
        Handles.MH_vkCmdSetExclusiveScissorEnableNV.invokeExact(commandBuffer.capabilities().PFN_vkCmdSetExclusiveScissorEnableNV, commandBuffer.segment(), firstExclusiveScissor, exclusiveScissorCount, pExclusiveScissorEnables); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetExclusiveScissorEnableNV", e); }
    }

    /// Invokes `vkCmdSetExclusiveScissorNV`.
    /// ```
    /// void vkCmdSetExclusiveScissorNV((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, uint32_t firstExclusiveScissor, uint32_t exclusiveScissorCount, const VkRect2D* pExclusiveScissors);
    /// ```
    public static void vkCmdSetExclusiveScissorNV(@NonNull VkCommandBuffer commandBuffer, int firstExclusiveScissor, int exclusiveScissorCount, @NonNull MemorySegment pExclusiveScissors) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetExclusiveScissorNV)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdSetExclusiveScissorNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdSetExclusiveScissorNV", commandBuffer, firstExclusiveScissor, exclusiveScissorCount, pExclusiveScissors); }
        Handles.MH_vkCmdSetExclusiveScissorNV.invokeExact(commandBuffer.capabilities().PFN_vkCmdSetExclusiveScissorNV, commandBuffer.segment(), firstExclusiveScissor, exclusiveScissorCount, pExclusiveScissors); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetExclusiveScissorNV", e); }
    }

}
