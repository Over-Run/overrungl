// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.qcom;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.vulkan.*;
import static overrungl.internal.RuntimeHelper.*;
/// `VK_QCOM_tile_memory_heap` - device extension
public final class VKQCOMTileMemoryHeap {
    public static final int VK_QCOM_TILE_MEMORY_HEAP_SPEC_VERSION = 1;
    public static final String VK_QCOM_TILE_MEMORY_HEAP_EXTENSION_NAME = "VK_QCOM_tile_memory_heap";
    public static final int VK_MEMORY_HEAP_TILE_MEMORY_BIT_QCOM = 0x00000008;
    public static final int VK_BUFFER_USAGE_TILE_MEMORY_BIT_QCOM = 0x08000000;
    public static final long VK_BUFFER_USAGE_2_TILE_MEMORY_BIT_QCOM = 0x08000000L;
    public static final int VK_IMAGE_USAGE_TILE_MEMORY_BIT_QCOM = 0x08000000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TILE_MEMORY_HEAP_FEATURES_QCOM = 1000547000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TILE_MEMORY_HEAP_PROPERTIES_QCOM = 1000547001;
    public static final int VK_STRUCTURE_TYPE_TILE_MEMORY_REQUIREMENTS_QCOM = 1000547002;
    public static final int VK_STRUCTURE_TYPE_TILE_MEMORY_BIND_INFO_QCOM = 1000547003;
    public static final int VK_STRUCTURE_TYPE_TILE_MEMORY_SIZE_INFO_QCOM = 1000547004;
    public static final class Handles {
        public static final MethodHandle MH_vkCmdBindTileMemoryQCOM = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        private Handles() {}
    }

    private VKQCOMTileMemoryHeap() {}

    /// Invokes `vkCmdBindTileMemoryQCOM`.
    /// ```
    /// void vkCmdBindTileMemoryQCOM((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, const VkTileMemoryBindInfoQCOM* pTileMemoryBindInfo);
    /// ```
    public static void vkCmdBindTileMemoryQCOM(@NonNull VkCommandBuffer commandBuffer, @NonNull MemorySegment pTileMemoryBindInfo) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdBindTileMemoryQCOM)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdBindTileMemoryQCOM");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdBindTileMemoryQCOM", commandBuffer, pTileMemoryBindInfo); }
        Handles.MH_vkCmdBindTileMemoryQCOM.invokeExact(commandBuffer.capabilities().PFN_vkCmdBindTileMemoryQCOM, commandBuffer.segment(), pTileMemoryBindInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdBindTileMemoryQCOM", e); }
    }

}
