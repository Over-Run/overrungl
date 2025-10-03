// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.amd;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.vulkan.*;
import static overrungl.internal.RuntimeHelper.*;
/// `VK_AMD_buffer_marker` - device extension
public final class VKAMDBufferMarker {
    public static final int VK_AMD_BUFFER_MARKER_SPEC_VERSION = 1;
    public static final String VK_AMD_BUFFER_MARKER_EXTENSION_NAME = "VK_AMD_buffer_marker";
    public static final class Handles {
        public static final MethodHandle MH_vkCmdWriteBufferMarkerAMD = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_vkCmdWriteBufferMarker2AMD = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT));
        private Handles() {}
    }

    private VKAMDBufferMarker() {}

    /// Invokes `vkCmdWriteBufferMarkerAMD`.
    /// ```
    /// void vkCmdWriteBufferMarkerAMD((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, (int) VkPipelineStageFlagBits pipelineStage, (uint64_t) VkBuffer dstBuffer, (uint64_t) VkDeviceSize dstOffset, uint32_t marker);
    /// ```
    public static void vkCmdWriteBufferMarkerAMD(@NonNull VkCommandBuffer commandBuffer, int pipelineStage, long dstBuffer, long dstOffset, int marker) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdWriteBufferMarkerAMD)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdWriteBufferMarkerAMD");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdWriteBufferMarkerAMD", commandBuffer, pipelineStage, dstBuffer, dstOffset, marker); }
        Handles.MH_vkCmdWriteBufferMarkerAMD.invokeExact(commandBuffer.capabilities().PFN_vkCmdWriteBufferMarkerAMD, commandBuffer.segment(), pipelineStage, dstBuffer, dstOffset, marker); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdWriteBufferMarkerAMD", e); }
    }

    /// Invokes `vkCmdWriteBufferMarker2AMD`.
    /// ```
    /// void vkCmdWriteBufferMarker2AMD((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, ((uint64_t) VkFlags64) VkPipelineStageFlags2 stage, (uint64_t) VkBuffer dstBuffer, (uint64_t) VkDeviceSize dstOffset, uint32_t marker);
    /// ```
    public static void vkCmdWriteBufferMarker2AMD(@NonNull VkCommandBuffer commandBuffer, long stage, long dstBuffer, long dstOffset, int marker) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdWriteBufferMarker2AMD)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdWriteBufferMarker2AMD");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdWriteBufferMarker2AMD", commandBuffer, stage, dstBuffer, dstOffset, marker); }
        Handles.MH_vkCmdWriteBufferMarker2AMD.invokeExact(commandBuffer.capabilities().PFN_vkCmdWriteBufferMarker2AMD, commandBuffer.segment(), stage, dstBuffer, dstOffset, marker); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdWriteBufferMarker2AMD", e); }
    }

}
