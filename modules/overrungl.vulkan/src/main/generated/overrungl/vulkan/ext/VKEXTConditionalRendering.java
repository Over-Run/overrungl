// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.vulkan.*;
import static overrungl.internal.RuntimeHelper.*;
/// `VK_EXT_conditional_rendering` - device extension
public final class VKEXTConditionalRendering {
    public static final int VK_CONDITIONAL_RENDERING_INVERTED_BIT_EXT = 0x00000001;
    public static final int VK_EXT_CONDITIONAL_RENDERING_SPEC_VERSION = 2;
    public static final String VK_EXT_CONDITIONAL_RENDERING_EXTENSION_NAME = "VK_EXT_conditional_rendering";
    public static final int VK_STRUCTURE_TYPE_COMMAND_BUFFER_INHERITANCE_CONDITIONAL_RENDERING_INFO_EXT = 1000081000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_CONDITIONAL_RENDERING_FEATURES_EXT = 1000081001;
    public static final int VK_STRUCTURE_TYPE_CONDITIONAL_RENDERING_BEGIN_INFO_EXT = 1000081002;
    public static final int VK_ACCESS_CONDITIONAL_RENDERING_READ_BIT_EXT = 0x00100000;
    public static final int VK_BUFFER_USAGE_CONDITIONAL_RENDERING_BIT_EXT = 0x00000200;
    public static final int VK_PIPELINE_STAGE_CONDITIONAL_RENDERING_BIT_EXT = 0x00040000;
    public static final class Handles {
        public static final MethodHandle MH_vkCmdBeginConditionalRenderingEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdEndConditionalRenderingEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
        private Handles() {}
    }

    private VKEXTConditionalRendering() {}

    /// Invokes `vkCmdBeginConditionalRenderingEXT`.
    /// ```
    /// void vkCmdBeginConditionalRenderingEXT((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, const VkConditionalRenderingBeginInfoEXT* pConditionalRenderingBegin);
    /// ```
    public static void vkCmdBeginConditionalRenderingEXT(@NonNull VkCommandBuffer commandBuffer, @NonNull MemorySegment pConditionalRenderingBegin) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdBeginConditionalRenderingEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdBeginConditionalRenderingEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdBeginConditionalRenderingEXT", commandBuffer, pConditionalRenderingBegin); }
        Handles.MH_vkCmdBeginConditionalRenderingEXT.invokeExact(commandBuffer.capabilities().PFN_vkCmdBeginConditionalRenderingEXT, commandBuffer.segment(), pConditionalRenderingBegin); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdBeginConditionalRenderingEXT", e); }
    }

    /// Invokes `vkCmdEndConditionalRenderingEXT`.
    /// ```
    /// void vkCmdEndConditionalRenderingEXT((struct VkCommandBuffer*) VkCommandBuffer commandBuffer);
    /// ```
    public static void vkCmdEndConditionalRenderingEXT(@NonNull VkCommandBuffer commandBuffer) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdEndConditionalRenderingEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdEndConditionalRenderingEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdEndConditionalRenderingEXT", commandBuffer); }
        Handles.MH_vkCmdEndConditionalRenderingEXT.invokeExact(commandBuffer.capabilities().PFN_vkCmdEndConditionalRenderingEXT, commandBuffer.segment()); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdEndConditionalRenderingEXT", e); }
    }

}
