// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.amd;
import java.lang.foreign.*;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.vulkan.*;
import static overrungl.internal.RuntimeHelper.*;
/// `VK_AMD_anti_lag` - device extension
public final class VKAMDAntiLag {
    public static final int VK_ANTI_LAG_MODE_DRIVER_CONTROL_AMD = 0;
    public static final int VK_ANTI_LAG_MODE_ON_AMD = 1;
    public static final int VK_ANTI_LAG_MODE_OFF_AMD = 2;
    public static final int VK_ANTI_LAG_STAGE_INPUT_AMD = 0;
    public static final int VK_ANTI_LAG_STAGE_PRESENT_AMD = 1;
    public static final int VK_AMD_ANTI_LAG_SPEC_VERSION = 1;
    public static final String VK_AMD_ANTI_LAG_EXTENSION_NAME = "VK_AMD_anti_lag";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_ANTI_LAG_FEATURES_AMD = 1000476000;
    public static final int VK_STRUCTURE_TYPE_ANTI_LAG_DATA_AMD = 1000476001;
    public static final int VK_STRUCTURE_TYPE_ANTI_LAG_PRESENTATION_INFO_AMD = 1000476002;
    public static final class Handles {
        public static final Supplier<MethodHandle> MH_vkAntiLagUpdateAMD = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        private Handles() {}
    }

    private VKAMDAntiLag() {}

    /// Invokes `vkAntiLagUpdateAMD`.
    /// ```
    /// void vkAntiLagUpdateAMD((struct VkDevice*) VkDevice device, const VkAntiLagDataAMD* pData);
    /// ```
    public static void vkAntiLagUpdateAMD(@NonNull VkDevice device, @NonNull MemorySegment pData) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkAntiLagUpdateAMD)) throw new VKSymbolNotFoundError("Symbol not found: vkAntiLagUpdateAMD");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkAntiLagUpdateAMD", device, pData); }
        Handles.MH_vkAntiLagUpdateAMD.get().invokeExact(device.capabilities().PFN_vkAntiLagUpdateAMD, device.segment(), pData); }
        catch (Throwable e) { throw new RuntimeException("error in vkAntiLagUpdateAMD", e); }
    }

}
