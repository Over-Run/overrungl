// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.vulkan.*;
import static overrungl.internal.RuntimeHelper.*;
/// `VK_EXT_vertex_input_dynamic_state` - device extension
public final class VKEXTVertexInputDynamicState {
    public static final int VK_EXT_VERTEX_INPUT_DYNAMIC_STATE_SPEC_VERSION = 2;
    public static final String VK_EXT_VERTEX_INPUT_DYNAMIC_STATE_EXTENSION_NAME = "VK_EXT_vertex_input_dynamic_state";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VERTEX_INPUT_DYNAMIC_STATE_FEATURES_EXT = 1000352000;
    public static final int VK_STRUCTURE_TYPE_VERTEX_INPUT_BINDING_DESCRIPTION_2_EXT = 1000352001;
    public static final int VK_STRUCTURE_TYPE_VERTEX_INPUT_ATTRIBUTE_DESCRIPTION_2_EXT = 1000352002;
    public static final int VK_DYNAMIC_STATE_VERTEX_INPUT_EXT = 1000352000;
    private VKEXTVertexInputDynamicState() {}
    public static final class Handles {
        public static final MethodHandle MH_vkCmdSetVertexInputEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        private Handles() {}
    }

    /// Invokes `vkCmdSetVertexInputEXT`.
    /// ```
    /// void vkCmdSetVertexInputEXT(VkCommandBuffer commandBuffer, uint32_t vertexBindingDescriptionCount, const VkVertexInputBindingDescription2EXT* pVertexBindingDescriptions, uint32_t vertexAttributeDescriptionCount, const VkVertexInputAttributeDescription2EXT* pVertexAttributeDescriptions);
    /// ```
    public static void vkCmdSetVertexInputEXT(@NonNull VkCommandBuffer commandBuffer, int vertexBindingDescriptionCount, @NonNull MemorySegment pVertexBindingDescriptions, int vertexAttributeDescriptionCount, @NonNull MemorySegment pVertexAttributeDescriptions) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetVertexInputEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdSetVertexInputEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdSetVertexInputEXT", commandBuffer, vertexBindingDescriptionCount, pVertexBindingDescriptions, vertexAttributeDescriptionCount, pVertexAttributeDescriptions); }
        Handles.MH_vkCmdSetVertexInputEXT.invokeExact(commandBuffer.capabilities().PFN_vkCmdSetVertexInputEXT, commandBuffer.segment(), vertexBindingDescriptionCount, pVertexBindingDescriptions, vertexAttributeDescriptionCount, pVertexAttributeDescriptions); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetVertexInputEXT", e); }
    }

}
