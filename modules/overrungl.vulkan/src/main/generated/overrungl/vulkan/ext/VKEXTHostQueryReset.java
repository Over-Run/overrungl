// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.vulkan.*;
import static overrungl.internal.RuntimeHelper.*;
/// `VK_EXT_host_query_reset` - device extension
public final class VKEXTHostQueryReset {
    public static final int VK_EXT_HOST_QUERY_RESET_SPEC_VERSION = 1;
    public static final String VK_EXT_HOST_QUERY_RESET_EXTENSION_NAME = "VK_EXT_host_query_reset";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_HOST_QUERY_RESET_FEATURES_EXT = 1000261000;
    private VKEXTHostQueryReset() {}
    public static final class Handles {
        public static final MethodHandle MH_vkResetQueryPoolEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        private Handles() {}
    }

    /// Invokes `vkResetQueryPoolEXT`.
    /// ```
    /// void vkResetQueryPoolEXT(VkDevice device, VkQueryPool queryPool, uint32_t firstQuery, uint32_t queryCount);
    /// ```
    public static void vkResetQueryPoolEXT(@NonNull VkDevice device, long queryPool, int firstQuery, int queryCount) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkResetQueryPoolEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkResetQueryPoolEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkResetQueryPoolEXT", device, queryPool, firstQuery, queryCount); }
        Handles.MH_vkResetQueryPoolEXT.invokeExact(device.capabilities().PFN_vkResetQueryPoolEXT, device.segment(), queryPool, firstQuery, queryCount); }
        catch (Throwable e) { throw new RuntimeException("error in vkResetQueryPoolEXT", e); }
    }

}
