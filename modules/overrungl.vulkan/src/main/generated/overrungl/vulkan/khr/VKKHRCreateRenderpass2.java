// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr;
import java.lang.foreign.*;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.vulkan.*;
import static overrungl.internal.RuntimeHelper.*;
/// `VK_KHR_create_renderpass2` - device extension
public final class VKKHRCreateRenderpass2 {
    public static final int VK_KHR_CREATE_RENDERPASS_2_SPEC_VERSION = 1;
    public static final String VK_KHR_CREATE_RENDERPASS_2_EXTENSION_NAME = "VK_KHR_create_renderpass2";
    public static final int VK_STRUCTURE_TYPE_ATTACHMENT_DESCRIPTION_2_KHR = 1000109000;
    public static final int VK_STRUCTURE_TYPE_ATTACHMENT_REFERENCE_2_KHR = 1000109001;
    public static final int VK_STRUCTURE_TYPE_SUBPASS_DESCRIPTION_2_KHR = 1000109002;
    public static final int VK_STRUCTURE_TYPE_SUBPASS_DEPENDENCY_2_KHR = 1000109003;
    public static final int VK_STRUCTURE_TYPE_RENDER_PASS_CREATE_INFO_2_KHR = 1000109004;
    public static final int VK_STRUCTURE_TYPE_SUBPASS_BEGIN_INFO_KHR = 1000109005;
    public static final int VK_STRUCTURE_TYPE_SUBPASS_END_INFO_KHR = 1000109006;
    public static final class Handles {
        public static final Supplier<MethodHandle> MH_vkCreateRenderPass2KHR = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_vkCmdBeginRenderPass2KHR = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_vkCmdNextSubpass2KHR = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_vkCmdEndRenderPass2KHR = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        private Handles() {}
    }

    private VKKHRCreateRenderpass2() {}

    /// Invokes `vkCreateRenderPass2KHR`.
    /// ```
    /// (int) VkResult vkCreateRenderPass2KHR((struct VkDevice*) VkDevice device, const VkRenderPassCreateInfo2* pCreateInfo, const VkAllocationCallbacks* pAllocator, VkRenderPass* pRenderPass);
    /// ```
    public static int vkCreateRenderPass2KHR(@NonNull VkDevice device, @NonNull MemorySegment pCreateInfo, @NonNull MemorySegment pAllocator, @NonNull MemorySegment pRenderPass) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkCreateRenderPass2KHR)) throw new VKSymbolNotFoundError("Symbol not found: vkCreateRenderPass2KHR");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCreateRenderPass2KHR", device, pCreateInfo, pAllocator, pRenderPass); }
        return (int) Handles.MH_vkCreateRenderPass2KHR.get().invokeExact(device.capabilities().PFN_vkCreateRenderPass2KHR, device.segment(), pCreateInfo, pAllocator, pRenderPass); }
        catch (Throwable e) { throw new RuntimeException("error in vkCreateRenderPass2KHR", e); }
    }

    /// Invokes `vkCmdBeginRenderPass2KHR`.
    /// ```
    /// void vkCmdBeginRenderPass2KHR((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, const VkRenderPassBeginInfo* pRenderPassBegin, const VkSubpassBeginInfo* pSubpassBeginInfo);
    /// ```
    public static void vkCmdBeginRenderPass2KHR(@NonNull VkCommandBuffer commandBuffer, @NonNull MemorySegment pRenderPassBegin, @NonNull MemorySegment pSubpassBeginInfo) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdBeginRenderPass2KHR)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdBeginRenderPass2KHR");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdBeginRenderPass2KHR", commandBuffer, pRenderPassBegin, pSubpassBeginInfo); }
        Handles.MH_vkCmdBeginRenderPass2KHR.get().invokeExact(commandBuffer.capabilities().PFN_vkCmdBeginRenderPass2KHR, commandBuffer.segment(), pRenderPassBegin, pSubpassBeginInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdBeginRenderPass2KHR", e); }
    }

    /// Invokes `vkCmdNextSubpass2KHR`.
    /// ```
    /// void vkCmdNextSubpass2KHR((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, const VkSubpassBeginInfo* pSubpassBeginInfo, const VkSubpassEndInfo* pSubpassEndInfo);
    /// ```
    public static void vkCmdNextSubpass2KHR(@NonNull VkCommandBuffer commandBuffer, @NonNull MemorySegment pSubpassBeginInfo, @NonNull MemorySegment pSubpassEndInfo) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdNextSubpass2KHR)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdNextSubpass2KHR");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdNextSubpass2KHR", commandBuffer, pSubpassBeginInfo, pSubpassEndInfo); }
        Handles.MH_vkCmdNextSubpass2KHR.get().invokeExact(commandBuffer.capabilities().PFN_vkCmdNextSubpass2KHR, commandBuffer.segment(), pSubpassBeginInfo, pSubpassEndInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdNextSubpass2KHR", e); }
    }

    /// Invokes `vkCmdEndRenderPass2KHR`.
    /// ```
    /// void vkCmdEndRenderPass2KHR((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, const VkSubpassEndInfo* pSubpassEndInfo);
    /// ```
    public static void vkCmdEndRenderPass2KHR(@NonNull VkCommandBuffer commandBuffer, @NonNull MemorySegment pSubpassEndInfo) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdEndRenderPass2KHR)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdEndRenderPass2KHR");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdEndRenderPass2KHR", commandBuffer, pSubpassEndInfo); }
        Handles.MH_vkCmdEndRenderPass2KHR.get().invokeExact(commandBuffer.capabilities().PFN_vkCmdEndRenderPass2KHR, commandBuffer.segment(), pSubpassEndInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdEndRenderPass2KHR", e); }
    }

}
