// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.vulkan.*;
import static overrungl.internal.RuntimeHelper.*;
/// `VK_KHR_copy_memory_indirect` - device extension
public final class VKKHRCopyMemoryIndirect {
    public static final int VK_ADDRESS_COPY_DEVICE_LOCAL_BIT_KHR = 0x00000001;
    public static final int VK_ADDRESS_COPY_SPARSE_BIT_KHR = 0x00000002;
    public static final int VK_ADDRESS_COPY_PROTECTED_BIT_KHR = 0x00000004;
    public static final int VK_KHR_COPY_MEMORY_INDIRECT_SPEC_VERSION = 1;
    public static final String VK_KHR_COPY_MEMORY_INDIRECT_EXTENSION_NAME = "VK_KHR_copy_memory_indirect";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COPY_MEMORY_INDIRECT_FEATURES_KHR = 1000549000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COPY_MEMORY_INDIRECT_PROPERTIES_KHR = 1000549001;
    public static final int VK_STRUCTURE_TYPE_COPY_MEMORY_INDIRECT_INFO_KHR = 1000549002;
    public static final int VK_STRUCTURE_TYPE_COPY_MEMORY_TO_IMAGE_INDIRECT_INFO_KHR = 1000549003;
    public static final long VK_PIPELINE_STAGE_2_COPY_INDIRECT_BIT_KHR = 0x400000000000L;
    public static final long VK_FORMAT_FEATURE_2_COPY_IMAGE_INDIRECT_DST_BIT_KHR = 0x800000000000000L;
    public static final class Handles {
        public static final MethodHandle MH_vkCmdCopyMemoryIndirectKHR = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdCopyMemoryToImageIndirectKHR = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        private Handles() {}
    }

    private VKKHRCopyMemoryIndirect() {}

    /// Invokes `vkCmdCopyMemoryIndirectKHR`.
    /// ```
    /// void vkCmdCopyMemoryIndirectKHR((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, const VkCopyMemoryIndirectInfoKHR* pCopyMemoryIndirectInfo);
    /// ```
    public static void vkCmdCopyMemoryIndirectKHR(@NonNull VkCommandBuffer commandBuffer, @NonNull MemorySegment pCopyMemoryIndirectInfo) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdCopyMemoryIndirectKHR)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdCopyMemoryIndirectKHR");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdCopyMemoryIndirectKHR", commandBuffer, pCopyMemoryIndirectInfo); }
        Handles.MH_vkCmdCopyMemoryIndirectKHR.invokeExact(commandBuffer.capabilities().PFN_vkCmdCopyMemoryIndirectKHR, commandBuffer.segment(), pCopyMemoryIndirectInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdCopyMemoryIndirectKHR", e); }
    }

    /// Invokes `vkCmdCopyMemoryToImageIndirectKHR`.
    /// ```
    /// void vkCmdCopyMemoryToImageIndirectKHR((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, const VkCopyMemoryToImageIndirectInfoKHR* pCopyMemoryToImageIndirectInfo);
    /// ```
    public static void vkCmdCopyMemoryToImageIndirectKHR(@NonNull VkCommandBuffer commandBuffer, @NonNull MemorySegment pCopyMemoryToImageIndirectInfo) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdCopyMemoryToImageIndirectKHR)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdCopyMemoryToImageIndirectKHR");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdCopyMemoryToImageIndirectKHR", commandBuffer, pCopyMemoryToImageIndirectInfo); }
        Handles.MH_vkCmdCopyMemoryToImageIndirectKHR.invokeExact(commandBuffer.capabilities().PFN_vkCmdCopyMemoryToImageIndirectKHR, commandBuffer.segment(), pCopyMemoryToImageIndirectInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdCopyMemoryToImageIndirectKHR", e); }
    }

}
