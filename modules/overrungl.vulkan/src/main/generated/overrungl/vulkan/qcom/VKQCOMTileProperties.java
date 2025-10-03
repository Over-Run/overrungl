// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.qcom;
import java.lang.foreign.*;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.vulkan.*;
import static overrungl.internal.RuntimeHelper.*;
/// `VK_QCOM_tile_properties` - device extension
public final class VKQCOMTileProperties {
    public static final int VK_QCOM_TILE_PROPERTIES_SPEC_VERSION = 1;
    public static final String VK_QCOM_TILE_PROPERTIES_EXTENSION_NAME = "VK_QCOM_tile_properties";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TILE_PROPERTIES_FEATURES_QCOM = 1000484000;
    public static final int VK_STRUCTURE_TYPE_TILE_PROPERTIES_QCOM = 1000484001;
    public static final class Handles {
        public static final Supplier<MethodHandle> MH_vkGetFramebufferTilePropertiesQCOM = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_vkGetDynamicRenderingTilePropertiesQCOM = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        private Handles() {}
    }

    private VKQCOMTileProperties() {}

    /// Invokes `vkGetFramebufferTilePropertiesQCOM`.
    /// ```
    /// (int) VkResult vkGetFramebufferTilePropertiesQCOM((struct VkDevice*) VkDevice device, (uint64_t) VkFramebuffer framebuffer, uint32_t* pPropertiesCount, VkTilePropertiesQCOM* pProperties);
    /// ```
    public static int vkGetFramebufferTilePropertiesQCOM(@NonNull VkDevice device, long framebuffer, @NonNull MemorySegment pPropertiesCount, @NonNull MemorySegment pProperties) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkGetFramebufferTilePropertiesQCOM)) throw new VKSymbolNotFoundError("Symbol not found: vkGetFramebufferTilePropertiesQCOM");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkGetFramebufferTilePropertiesQCOM", device, framebuffer, pPropertiesCount, pProperties); }
        return (int) Handles.MH_vkGetFramebufferTilePropertiesQCOM.get().invokeExact(device.capabilities().PFN_vkGetFramebufferTilePropertiesQCOM, device.segment(), framebuffer, pPropertiesCount, pProperties); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetFramebufferTilePropertiesQCOM", e); }
    }

    /// Invokes `vkGetDynamicRenderingTilePropertiesQCOM`.
    /// ```
    /// (int) VkResult vkGetDynamicRenderingTilePropertiesQCOM((struct VkDevice*) VkDevice device, const VkRenderingInfo* pRenderingInfo, VkTilePropertiesQCOM* pProperties);
    /// ```
    public static int vkGetDynamicRenderingTilePropertiesQCOM(@NonNull VkDevice device, @NonNull MemorySegment pRenderingInfo, @NonNull MemorySegment pProperties) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkGetDynamicRenderingTilePropertiesQCOM)) throw new VKSymbolNotFoundError("Symbol not found: vkGetDynamicRenderingTilePropertiesQCOM");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkGetDynamicRenderingTilePropertiesQCOM", device, pRenderingInfo, pProperties); }
        return (int) Handles.MH_vkGetDynamicRenderingTilePropertiesQCOM.get().invokeExact(device.capabilities().PFN_vkGetDynamicRenderingTilePropertiesQCOM, device.segment(), pRenderingInfo, pProperties); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetDynamicRenderingTilePropertiesQCOM", e); }
    }

}
