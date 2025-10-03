// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext;
import java.lang.foreign.*;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.vulkan.*;
import static overrungl.internal.RuntimeHelper.*;
/// `VK_EXT_depth_bias_control` - device extension
public final class VKEXTDepthBiasControl {
    public static final int VK_DEPTH_BIAS_REPRESENTATION_LEAST_REPRESENTABLE_VALUE_FORMAT_EXT = 0;
    public static final int VK_DEPTH_BIAS_REPRESENTATION_LEAST_REPRESENTABLE_VALUE_FORCE_UNORM_EXT = 1;
    public static final int VK_DEPTH_BIAS_REPRESENTATION_FLOAT_EXT = 2;
    public static final int VK_EXT_DEPTH_BIAS_CONTROL_SPEC_VERSION = 1;
    public static final String VK_EXT_DEPTH_BIAS_CONTROL_EXTENSION_NAME = "VK_EXT_depth_bias_control";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DEPTH_BIAS_CONTROL_FEATURES_EXT = 1000283000;
    public static final int VK_STRUCTURE_TYPE_DEPTH_BIAS_INFO_EXT = 1000283001;
    public static final int VK_STRUCTURE_TYPE_DEPTH_BIAS_REPRESENTATION_INFO_EXT = 1000283002;
    public static final class Handles {
        public static final Supplier<MethodHandle> MH_vkCmdSetDepthBias2EXT = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        private Handles() {}
    }

    private VKEXTDepthBiasControl() {}

    /// Invokes `vkCmdSetDepthBias2EXT`.
    /// ```
    /// void vkCmdSetDepthBias2EXT((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, const VkDepthBiasInfoEXT* pDepthBiasInfo);
    /// ```
    public static void vkCmdSetDepthBias2EXT(@NonNull VkCommandBuffer commandBuffer, @NonNull MemorySegment pDepthBiasInfo) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetDepthBias2EXT)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdSetDepthBias2EXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdSetDepthBias2EXT", commandBuffer, pDepthBiasInfo); }
        Handles.MH_vkCmdSetDepthBias2EXT.get().invokeExact(commandBuffer.capabilities().PFN_vkCmdSetDepthBias2EXT, commandBuffer.segment(), pDepthBiasInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetDepthBias2EXT", e); }
    }

}
