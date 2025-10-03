// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.nv;
import java.lang.foreign.*;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.vulkan.*;
import static overrungl.internal.RuntimeHelper.*;
/// `VK_NV_memory_decompression` - device extension
public final class VKNVMemoryDecompression {
    public static final long VK_MEMORY_DECOMPRESSION_METHOD_GDEFLATE_1_0_BIT_NV = 0x00000001L;
    public static final int VK_NV_MEMORY_DECOMPRESSION_SPEC_VERSION = 1;
    public static final String VK_NV_MEMORY_DECOMPRESSION_EXTENSION_NAME = "VK_NV_memory_decompression";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MEMORY_DECOMPRESSION_FEATURES_NV = 1000427000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MEMORY_DECOMPRESSION_PROPERTIES_NV = 1000427001;
    public static final class Handles {
        public static final Supplier<MethodHandle> MH_vkCmdDecompressMemoryNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_vkCmdDecompressMemoryIndirectCountNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT)));
        private Handles() {}
    }

    private VKNVMemoryDecompression() {}

    /// Invokes `vkCmdDecompressMemoryNV`.
    /// ```
    /// void vkCmdDecompressMemoryNV((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, uint32_t decompressRegionCount, const VkDecompressMemoryRegionNV* pDecompressMemoryRegions);
    /// ```
    public static void vkCmdDecompressMemoryNV(@NonNull VkCommandBuffer commandBuffer, int decompressRegionCount, @NonNull MemorySegment pDecompressMemoryRegions) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdDecompressMemoryNV)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdDecompressMemoryNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdDecompressMemoryNV", commandBuffer, decompressRegionCount, pDecompressMemoryRegions); }
        Handles.MH_vkCmdDecompressMemoryNV.get().invokeExact(commandBuffer.capabilities().PFN_vkCmdDecompressMemoryNV, commandBuffer.segment(), decompressRegionCount, pDecompressMemoryRegions); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdDecompressMemoryNV", e); }
    }

    /// Invokes `vkCmdDecompressMemoryIndirectCountNV`.
    /// ```
    /// void vkCmdDecompressMemoryIndirectCountNV((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, (uint64_t) VkDeviceAddress indirectCommandsAddress, (uint64_t) VkDeviceAddress indirectCommandsCountAddress, uint32_t stride);
    /// ```
    public static void vkCmdDecompressMemoryIndirectCountNV(@NonNull VkCommandBuffer commandBuffer, long indirectCommandsAddress, long indirectCommandsCountAddress, int stride) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdDecompressMemoryIndirectCountNV)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdDecompressMemoryIndirectCountNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdDecompressMemoryIndirectCountNV", commandBuffer, indirectCommandsAddress, indirectCommandsCountAddress, stride); }
        Handles.MH_vkCmdDecompressMemoryIndirectCountNV.get().invokeExact(commandBuffer.capabilities().PFN_vkCmdDecompressMemoryIndirectCountNV, commandBuffer.segment(), indirectCommandsAddress, indirectCommandsCountAddress, stride); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdDecompressMemoryIndirectCountNV", e); }
    }

}
