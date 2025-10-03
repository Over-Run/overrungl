// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.vulkan.*;
import static overrungl.internal.RuntimeHelper.*;
/// `VK_KHR_draw_indirect_count` - device extension
public final class VKKHRDrawIndirectCount {
    public static final int VK_KHR_DRAW_INDIRECT_COUNT_SPEC_VERSION = 1;
    public static final String VK_KHR_DRAW_INDIRECT_COUNT_EXTENSION_NAME = "VK_KHR_draw_indirect_count";
    public static final class Handles {
        public static final MethodHandle MH_vkCmdDrawIndirectCountKHR = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_vkCmdDrawIndexedIndirectCountKHR = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        private Handles() {}
    }

    private VKKHRDrawIndirectCount() {}

    /// Invokes `vkCmdDrawIndirectCountKHR`.
    /// ```
    /// void vkCmdDrawIndirectCountKHR((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, (uint64_t) VkBuffer buffer, (uint64_t) VkDeviceSize offset, (uint64_t) VkBuffer countBuffer, (uint64_t) VkDeviceSize countBufferOffset, uint32_t maxDrawCount, uint32_t stride);
    /// ```
    public static void vkCmdDrawIndirectCountKHR(@NonNull VkCommandBuffer commandBuffer, long buffer, long offset, long countBuffer, long countBufferOffset, int maxDrawCount, int stride) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdDrawIndirectCountKHR)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdDrawIndirectCountKHR");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdDrawIndirectCountKHR", commandBuffer, buffer, offset, countBuffer, countBufferOffset, maxDrawCount, stride); }
        Handles.MH_vkCmdDrawIndirectCountKHR.invokeExact(commandBuffer.capabilities().PFN_vkCmdDrawIndirectCountKHR, commandBuffer.segment(), buffer, offset, countBuffer, countBufferOffset, maxDrawCount, stride); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdDrawIndirectCountKHR", e); }
    }

    /// Invokes `vkCmdDrawIndexedIndirectCountKHR`.
    /// ```
    /// void vkCmdDrawIndexedIndirectCountKHR((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, (uint64_t) VkBuffer buffer, (uint64_t) VkDeviceSize offset, (uint64_t) VkBuffer countBuffer, (uint64_t) VkDeviceSize countBufferOffset, uint32_t maxDrawCount, uint32_t stride);
    /// ```
    public static void vkCmdDrawIndexedIndirectCountKHR(@NonNull VkCommandBuffer commandBuffer, long buffer, long offset, long countBuffer, long countBufferOffset, int maxDrawCount, int stride) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdDrawIndexedIndirectCountKHR)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdDrawIndexedIndirectCountKHR");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdDrawIndexedIndirectCountKHR", commandBuffer, buffer, offset, countBuffer, countBufferOffset, maxDrawCount, stride); }
        Handles.MH_vkCmdDrawIndexedIndirectCountKHR.invokeExact(commandBuffer.capabilities().PFN_vkCmdDrawIndexedIndirectCountKHR, commandBuffer.segment(), buffer, offset, countBuffer, countBufferOffset, maxDrawCount, stride); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdDrawIndexedIndirectCountKHR", e); }
    }

}
