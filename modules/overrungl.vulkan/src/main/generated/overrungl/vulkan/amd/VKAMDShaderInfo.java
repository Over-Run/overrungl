// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.amd;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.vulkan.*;
import static overrungl.internal.RuntimeHelper.*;
/// `VK_AMD_shader_info` - device extension
public final class VKAMDShaderInfo {
    public static final int VK_AMD_SHADER_INFO_SPEC_VERSION = 1;
    public static final String VK_AMD_SHADER_INFO_EXTENSION_NAME = "VK_AMD_shader_info";
    public static final int VK_SHADER_INFO_TYPE_STATISTICS_AMD = 0;
    public static final int VK_SHADER_INFO_TYPE_BINARY_AMD = 1;
    public static final int VK_SHADER_INFO_TYPE_DISASSEMBLY_AMD = 2;
    private VKAMDShaderInfo() {}
    public static final class Handles {
        public static final MethodHandle MH_vkGetShaderInfoAMD = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        private Handles() {}
    }

    /// Invokes `vkGetShaderInfoAMD`.
    /// ```
    /// VkResult vkGetShaderInfoAMD(VkDevice device, VkPipeline pipeline, VkShaderStageFlagBits shaderStage, VkShaderInfoTypeAMD infoType, size_t* pInfoSize, void* pInfo);
    /// ```
    public static int vkGetShaderInfoAMD(@NonNull VkDevice device, long pipeline, int shaderStage, int infoType, @NonNull MemorySegment pInfoSize, @NonNull MemorySegment pInfo) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkGetShaderInfoAMD)) throw new VKSymbolNotFoundError("Symbol not found: vkGetShaderInfoAMD");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkGetShaderInfoAMD", device, pipeline, shaderStage, infoType, pInfoSize, pInfo); }
        return (int) Handles.MH_vkGetShaderInfoAMD.invokeExact(device.capabilities().PFN_vkGetShaderInfoAMD, device.segment(), pipeline, shaderStage, infoType, pInfoSize, pInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetShaderInfoAMD", e); }
    }

}
