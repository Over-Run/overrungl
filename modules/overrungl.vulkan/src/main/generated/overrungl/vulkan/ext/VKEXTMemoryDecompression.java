// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.vulkan.*;
import static overrungl.internal.RuntimeHelper.*;
/// `VK_EXT_memory_decompression` - device extension
public final class VKEXTMemoryDecompression {
    public static final int VK_EXT_MEMORY_DECOMPRESSION_SPEC_VERSION = 1;
    public static final String VK_EXT_MEMORY_DECOMPRESSION_EXTENSION_NAME = "VK_EXT_memory_decompression";
    public static final long VK_MEMORY_DECOMPRESSION_METHOD_GDEFLATE_1_0_BIT_EXT = 0x00000001L;
    public static final long VK_MEMORY_DECOMPRESSION_METHOD_GDEFLATE_1_0_BIT_NV = 0x00000001L;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MEMORY_DECOMPRESSION_FEATURES_EXT = 1000427000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MEMORY_DECOMPRESSION_PROPERTIES_EXT = 1000427001;
    public static final int VK_STRUCTURE_TYPE_DECOMPRESS_MEMORY_INFO_EXT = 1000550002;
    public static final long VK_PIPELINE_STAGE_2_MEMORY_DECOMPRESSION_BIT_EXT = 0x200000000000L;
    public static final long VK_ACCESS_2_MEMORY_DECOMPRESSION_READ_BIT_EXT = 0x80000000000000L;
    public static final long VK_ACCESS_2_MEMORY_DECOMPRESSION_WRITE_BIT_EXT = 0x100000000000000L;
    public static final long VK_BUFFER_USAGE_2_MEMORY_DECOMPRESSION_BIT_EXT = 0x100000000L;
    private VKEXTMemoryDecompression() {}
    public static final class Handles {
        public static final MethodHandle MH_vkCmdDecompressMemoryEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdDecompressMemoryIndirectCountEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        private Handles() {}
    }

    /// Invokes `vkCmdDecompressMemoryEXT`.
    /// ```
    /// void vkCmdDecompressMemoryEXT(VkCommandBuffer commandBuffer, const VkDecompressMemoryInfoEXT* pDecompressMemoryInfoEXT);
    /// ```
    public static void vkCmdDecompressMemoryEXT(@NonNull VkCommandBuffer commandBuffer, @NonNull MemorySegment pDecompressMemoryInfoEXT) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdDecompressMemoryEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdDecompressMemoryEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdDecompressMemoryEXT", commandBuffer, pDecompressMemoryInfoEXT); }
        Handles.MH_vkCmdDecompressMemoryEXT.invokeExact(commandBuffer.capabilities().PFN_vkCmdDecompressMemoryEXT, commandBuffer.segment(), pDecompressMemoryInfoEXT); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdDecompressMemoryEXT", e); }
    }

    /// Invokes `vkCmdDecompressMemoryIndirectCountEXT`.
    /// ```
    /// void vkCmdDecompressMemoryIndirectCountEXT(VkCommandBuffer commandBuffer, VkMemoryDecompressionMethodFlagsEXT decompressionMethod, VkDeviceAddress indirectCommandsAddress, VkDeviceAddress indirectCommandsCountAddress, uint32_t maxDecompressionCount, uint32_t stride);
    /// ```
    public static void vkCmdDecompressMemoryIndirectCountEXT(@NonNull VkCommandBuffer commandBuffer, long decompressionMethod, long indirectCommandsAddress, long indirectCommandsCountAddress, int maxDecompressionCount, int stride) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdDecompressMemoryIndirectCountEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdDecompressMemoryIndirectCountEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdDecompressMemoryIndirectCountEXT", commandBuffer, decompressionMethod, indirectCommandsAddress, indirectCommandsCountAddress, maxDecompressionCount, stride); }
        Handles.MH_vkCmdDecompressMemoryIndirectCountEXT.invokeExact(commandBuffer.capabilities().PFN_vkCmdDecompressMemoryIndirectCountEXT, commandBuffer.segment(), decompressionMethod, indirectCommandsAddress, indirectCommandsCountAddress, maxDecompressionCount, stride); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdDecompressMemoryIndirectCountEXT", e); }
    }

}
