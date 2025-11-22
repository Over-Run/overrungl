// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.nv;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.vulkan.*;
import static overrungl.internal.RuntimeHelper.*;
/// `VK_NV_memory_decompression` - device extension
public final class VKNVMemoryDecompression {
    public static final int VK_NV_MEMORY_DECOMPRESSION_SPEC_VERSION = 1;
    public static final String VK_NV_MEMORY_DECOMPRESSION_EXTENSION_NAME = "VK_NV_memory_decompression";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MEMORY_DECOMPRESSION_FEATURES_NV = 1000427000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MEMORY_DECOMPRESSION_PROPERTIES_NV = 1000427001;
    private VKNVMemoryDecompression() {}
    public static final class Handles {
        public static final MethodHandle MH_vkCmdDecompressMemoryNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdDecompressMemoryIndirectCountNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT));
        private Handles() {}
    }

    /// Invokes `vkCmdDecompressMemoryNV`.
    /// ```
    /// void vkCmdDecompressMemoryNV(VkCommandBuffer commandBuffer, uint32_t decompressRegionCount, const VkDecompressMemoryRegionNV* pDecompressMemoryRegions);
    /// ```
    public static void vkCmdDecompressMemoryNV(@NonNull VkCommandBuffer commandBuffer, int decompressRegionCount, @NonNull MemorySegment pDecompressMemoryRegions) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdDecompressMemoryNV)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdDecompressMemoryNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdDecompressMemoryNV", commandBuffer, decompressRegionCount, pDecompressMemoryRegions); }
        Handles.MH_vkCmdDecompressMemoryNV.invokeExact(commandBuffer.capabilities().PFN_vkCmdDecompressMemoryNV, commandBuffer.segment(), decompressRegionCount, pDecompressMemoryRegions); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdDecompressMemoryNV", e); }
    }

    /// Invokes `vkCmdDecompressMemoryIndirectCountNV`.
    /// ```
    /// void vkCmdDecompressMemoryIndirectCountNV(VkCommandBuffer commandBuffer, VkDeviceAddress indirectCommandsAddress, VkDeviceAddress indirectCommandsCountAddress, uint32_t stride);
    /// ```
    public static void vkCmdDecompressMemoryIndirectCountNV(@NonNull VkCommandBuffer commandBuffer, long indirectCommandsAddress, long indirectCommandsCountAddress, int stride) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdDecompressMemoryIndirectCountNV)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdDecompressMemoryIndirectCountNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdDecompressMemoryIndirectCountNV", commandBuffer, indirectCommandsAddress, indirectCommandsCountAddress, stride); }
        Handles.MH_vkCmdDecompressMemoryIndirectCountNV.invokeExact(commandBuffer.capabilities().PFN_vkCmdDecompressMemoryIndirectCountNV, commandBuffer.segment(), indirectCommandsAddress, indirectCommandsCountAddress, stride); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdDecompressMemoryIndirectCountNV", e); }
    }

}
