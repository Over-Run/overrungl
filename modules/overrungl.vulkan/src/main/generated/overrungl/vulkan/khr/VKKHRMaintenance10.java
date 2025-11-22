// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.vulkan.*;
import static overrungl.internal.RuntimeHelper.*;
/// `VK_KHR_maintenance10` - device extension
public final class VKKHRMaintenance10 {
    public static final int VK_KHR_MAINTENANCE_10_SPEC_VERSION = 1;
    public static final String VK_KHR_MAINTENANCE_10_EXTENSION_NAME = "VK_KHR_maintenance10";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_10_FEATURES_KHR = 1000630000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_10_PROPERTIES_KHR = 1000630001;
    public static final int VK_STRUCTURE_TYPE_RENDERING_ATTACHMENT_FLAGS_INFO_KHR = 1000630002;
    public static final int VK_STRUCTURE_TYPE_RENDERING_END_INFO_KHR = 1000619003;
    public static final int VK_STRUCTURE_TYPE_RESOLVE_IMAGE_MODE_INFO_KHR = 1000630004;
    public static final int VK_ATTACHMENT_DESCRIPTION_RESOLVE_SKIP_TRANSFER_FUNCTION_BIT_KHR = 0x00000002;
    public static final int VK_ATTACHMENT_DESCRIPTION_RESOLVE_ENABLE_TRANSFER_FUNCTION_BIT_KHR = 0x00000004;
    public static final int VK_RENDERING_LOCAL_READ_CONCURRENT_ACCESS_CONTROL_BIT_KHR = 0x00000100;
    public static final int VK_RENDERING_ATTACHMENT_INPUT_ATTACHMENT_FEEDBACK_BIT_KHR = 0x00000001;
    public static final long VK_FORMAT_FEATURE_2_DEPTH_COPY_ON_COMPUTE_QUEUE_BIT_KHR = 0x10000000000000L;
    public static final long VK_FORMAT_FEATURE_2_DEPTH_COPY_ON_TRANSFER_QUEUE_BIT_KHR = 0x20000000000000L;
    public static final long VK_FORMAT_FEATURE_2_STENCIL_COPY_ON_COMPUTE_QUEUE_BIT_KHR = 0x40000000000000L;
    public static final long VK_FORMAT_FEATURE_2_STENCIL_COPY_ON_TRANSFER_QUEUE_BIT_KHR = 0x80000000000000L;
    public static final int VK_RENDERING_ATTACHMENT_RESOLVE_SKIP_TRANSFER_FUNCTION_BIT_KHR = 0x00000002;
    public static final int VK_RENDERING_ATTACHMENT_RESOLVE_ENABLE_TRANSFER_FUNCTION_BIT_KHR = 0x00000004;
    public static final int VK_RESOLVE_IMAGE_SKIP_TRANSFER_FUNCTION_BIT_KHR = 0x00000001;
    public static final int VK_RESOLVE_IMAGE_ENABLE_TRANSFER_FUNCTION_BIT_KHR = 0x00000002;
    private VKKHRMaintenance10() {}
    public static final class Handles {
        public static final MethodHandle MH_vkCmdEndRendering2KHR = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        private Handles() {}
    }

    /// Invokes `vkCmdEndRendering2KHR`.
    /// ```
    /// void vkCmdEndRendering2KHR(VkCommandBuffer commandBuffer, const VkRenderingEndInfoKHR* pRenderingEndInfo);
    /// ```
    public static void vkCmdEndRendering2KHR(@NonNull VkCommandBuffer commandBuffer, @NonNull MemorySegment pRenderingEndInfo) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdEndRendering2KHR)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdEndRendering2KHR");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdEndRendering2KHR", commandBuffer, pRenderingEndInfo); }
        Handles.MH_vkCmdEndRendering2KHR.invokeExact(commandBuffer.capabilities().PFN_vkCmdEndRendering2KHR, commandBuffer.segment(), pRenderingEndInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdEndRendering2KHR", e); }
    }

}
