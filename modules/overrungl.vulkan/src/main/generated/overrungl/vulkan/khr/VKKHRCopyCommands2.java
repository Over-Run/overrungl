// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.vulkan.*;
import static overrungl.internal.RuntimeHelper.*;
/// `VK_KHR_copy_commands2` - device extension
public final class VKKHRCopyCommands2 {
    public static final int VK_KHR_COPY_COMMANDS_2_SPEC_VERSION = 1;
    public static final String VK_KHR_COPY_COMMANDS_2_EXTENSION_NAME = "VK_KHR_copy_commands2";
    public static final int VK_STRUCTURE_TYPE_COPY_BUFFER_INFO_2_KHR = 1000337000;
    public static final int VK_STRUCTURE_TYPE_COPY_IMAGE_INFO_2_KHR = 1000337001;
    public static final int VK_STRUCTURE_TYPE_COPY_BUFFER_TO_IMAGE_INFO_2_KHR = 1000337002;
    public static final int VK_STRUCTURE_TYPE_COPY_IMAGE_TO_BUFFER_INFO_2_KHR = 1000337003;
    public static final int VK_STRUCTURE_TYPE_BLIT_IMAGE_INFO_2_KHR = 1000337004;
    public static final int VK_STRUCTURE_TYPE_RESOLVE_IMAGE_INFO_2_KHR = 1000337005;
    public static final int VK_STRUCTURE_TYPE_BUFFER_COPY_2_KHR = 1000337006;
    public static final int VK_STRUCTURE_TYPE_IMAGE_COPY_2_KHR = 1000337007;
    public static final int VK_STRUCTURE_TYPE_IMAGE_BLIT_2_KHR = 1000337008;
    public static final int VK_STRUCTURE_TYPE_BUFFER_IMAGE_COPY_2_KHR = 1000337009;
    public static final int VK_STRUCTURE_TYPE_IMAGE_RESOLVE_2_KHR = 1000337010;
    private VKKHRCopyCommands2() {}
    public static final class Handles {
        public static final MethodHandle MH_vkCmdCopyBuffer2KHR = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdCopyImage2KHR = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdCopyBufferToImage2KHR = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdCopyImageToBuffer2KHR = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdBlitImage2KHR = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdResolveImage2KHR = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        private Handles() {}
    }

    /// Invokes `vkCmdCopyBuffer2KHR`.
    /// ```
    /// void vkCmdCopyBuffer2KHR(VkCommandBuffer commandBuffer, const VkCopyBufferInfo2* pCopyBufferInfo);
    /// ```
    public static void vkCmdCopyBuffer2KHR(@NonNull VkCommandBuffer commandBuffer, @NonNull MemorySegment pCopyBufferInfo) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdCopyBuffer2KHR)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdCopyBuffer2KHR");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdCopyBuffer2KHR", commandBuffer, pCopyBufferInfo); }
        Handles.MH_vkCmdCopyBuffer2KHR.invokeExact(commandBuffer.capabilities().PFN_vkCmdCopyBuffer2KHR, commandBuffer.segment(), pCopyBufferInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdCopyBuffer2KHR", e); }
    }

    /// Invokes `vkCmdCopyImage2KHR`.
    /// ```
    /// void vkCmdCopyImage2KHR(VkCommandBuffer commandBuffer, const VkCopyImageInfo2* pCopyImageInfo);
    /// ```
    public static void vkCmdCopyImage2KHR(@NonNull VkCommandBuffer commandBuffer, @NonNull MemorySegment pCopyImageInfo) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdCopyImage2KHR)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdCopyImage2KHR");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdCopyImage2KHR", commandBuffer, pCopyImageInfo); }
        Handles.MH_vkCmdCopyImage2KHR.invokeExact(commandBuffer.capabilities().PFN_vkCmdCopyImage2KHR, commandBuffer.segment(), pCopyImageInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdCopyImage2KHR", e); }
    }

    /// Invokes `vkCmdCopyBufferToImage2KHR`.
    /// ```
    /// void vkCmdCopyBufferToImage2KHR(VkCommandBuffer commandBuffer, const VkCopyBufferToImageInfo2* pCopyBufferToImageInfo);
    /// ```
    public static void vkCmdCopyBufferToImage2KHR(@NonNull VkCommandBuffer commandBuffer, @NonNull MemorySegment pCopyBufferToImageInfo) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdCopyBufferToImage2KHR)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdCopyBufferToImage2KHR");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdCopyBufferToImage2KHR", commandBuffer, pCopyBufferToImageInfo); }
        Handles.MH_vkCmdCopyBufferToImage2KHR.invokeExact(commandBuffer.capabilities().PFN_vkCmdCopyBufferToImage2KHR, commandBuffer.segment(), pCopyBufferToImageInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdCopyBufferToImage2KHR", e); }
    }

    /// Invokes `vkCmdCopyImageToBuffer2KHR`.
    /// ```
    /// void vkCmdCopyImageToBuffer2KHR(VkCommandBuffer commandBuffer, const VkCopyImageToBufferInfo2* pCopyImageToBufferInfo);
    /// ```
    public static void vkCmdCopyImageToBuffer2KHR(@NonNull VkCommandBuffer commandBuffer, @NonNull MemorySegment pCopyImageToBufferInfo) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdCopyImageToBuffer2KHR)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdCopyImageToBuffer2KHR");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdCopyImageToBuffer2KHR", commandBuffer, pCopyImageToBufferInfo); }
        Handles.MH_vkCmdCopyImageToBuffer2KHR.invokeExact(commandBuffer.capabilities().PFN_vkCmdCopyImageToBuffer2KHR, commandBuffer.segment(), pCopyImageToBufferInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdCopyImageToBuffer2KHR", e); }
    }

    /// Invokes `vkCmdBlitImage2KHR`.
    /// ```
    /// void vkCmdBlitImage2KHR(VkCommandBuffer commandBuffer, const VkBlitImageInfo2* pBlitImageInfo);
    /// ```
    public static void vkCmdBlitImage2KHR(@NonNull VkCommandBuffer commandBuffer, @NonNull MemorySegment pBlitImageInfo) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdBlitImage2KHR)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdBlitImage2KHR");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdBlitImage2KHR", commandBuffer, pBlitImageInfo); }
        Handles.MH_vkCmdBlitImage2KHR.invokeExact(commandBuffer.capabilities().PFN_vkCmdBlitImage2KHR, commandBuffer.segment(), pBlitImageInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdBlitImage2KHR", e); }
    }

    /// Invokes `vkCmdResolveImage2KHR`.
    /// ```
    /// void vkCmdResolveImage2KHR(VkCommandBuffer commandBuffer, const VkResolveImageInfo2* pResolveImageInfo);
    /// ```
    public static void vkCmdResolveImage2KHR(@NonNull VkCommandBuffer commandBuffer, @NonNull MemorySegment pResolveImageInfo) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdResolveImage2KHR)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdResolveImage2KHR");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdResolveImage2KHR", commandBuffer, pResolveImageInfo); }
        Handles.MH_vkCmdResolveImage2KHR.invokeExact(commandBuffer.capabilities().PFN_vkCmdResolveImage2KHR, commandBuffer.segment(), pResolveImageInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdResolveImage2KHR", e); }
    }

}
