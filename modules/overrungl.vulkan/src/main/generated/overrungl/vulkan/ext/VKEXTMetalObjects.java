// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.vulkan.*;
import static overrungl.internal.RuntimeHelper.*;
/// `VK_EXT_metal_objects` - device extension
public final class VKEXTMetalObjects {
    public static final int VK_EXT_METAL_OBJECTS_SPEC_VERSION = 2;
    public static final String VK_EXT_METAL_OBJECTS_EXTENSION_NAME = "VK_EXT_metal_objects";
    public static final int VK_EXPORT_METAL_OBJECT_TYPE_METAL_DEVICE_BIT_EXT = 0x00000001;
    public static final int VK_EXPORT_METAL_OBJECT_TYPE_METAL_COMMAND_QUEUE_BIT_EXT = 0x00000002;
    public static final int VK_EXPORT_METAL_OBJECT_TYPE_METAL_BUFFER_BIT_EXT = 0x00000004;
    public static final int VK_EXPORT_METAL_OBJECT_TYPE_METAL_TEXTURE_BIT_EXT = 0x00000008;
    public static final int VK_EXPORT_METAL_OBJECT_TYPE_METAL_IOSURFACE_BIT_EXT = 0x00000010;
    public static final int VK_EXPORT_METAL_OBJECT_TYPE_METAL_SHARED_EVENT_BIT_EXT = 0x00000020;
    public static final int VK_STRUCTURE_TYPE_EXPORT_METAL_OBJECT_CREATE_INFO_EXT = 1000311000;
    public static final int VK_STRUCTURE_TYPE_EXPORT_METAL_OBJECTS_INFO_EXT = 1000311001;
    public static final int VK_STRUCTURE_TYPE_EXPORT_METAL_DEVICE_INFO_EXT = 1000311002;
    public static final int VK_STRUCTURE_TYPE_EXPORT_METAL_COMMAND_QUEUE_INFO_EXT = 1000311003;
    public static final int VK_STRUCTURE_TYPE_EXPORT_METAL_BUFFER_INFO_EXT = 1000311004;
    public static final int VK_STRUCTURE_TYPE_IMPORT_METAL_BUFFER_INFO_EXT = 1000311005;
    public static final int VK_STRUCTURE_TYPE_EXPORT_METAL_TEXTURE_INFO_EXT = 1000311006;
    public static final int VK_STRUCTURE_TYPE_IMPORT_METAL_TEXTURE_INFO_EXT = 1000311007;
    public static final int VK_STRUCTURE_TYPE_EXPORT_METAL_IO_SURFACE_INFO_EXT = 1000311008;
    public static final int VK_STRUCTURE_TYPE_IMPORT_METAL_IO_SURFACE_INFO_EXT = 1000311009;
    public static final int VK_STRUCTURE_TYPE_EXPORT_METAL_SHARED_EVENT_INFO_EXT = 1000311010;
    public static final int VK_STRUCTURE_TYPE_IMPORT_METAL_SHARED_EVENT_INFO_EXT = 1000311011;
    private VKEXTMetalObjects() {}
    public static final class Handles {
        public static final MethodHandle MH_vkExportMetalObjectsEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        private Handles() {}
    }

    /// Invokes `vkExportMetalObjectsEXT`.
    /// ```
    /// void vkExportMetalObjectsEXT(VkDevice device, VkExportMetalObjectsInfoEXT* pMetalObjectsInfo);
    /// ```
    public static void vkExportMetalObjectsEXT(@NonNull VkDevice device, @NonNull MemorySegment pMetalObjectsInfo) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkExportMetalObjectsEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkExportMetalObjectsEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkExportMetalObjectsEXT", device, pMetalObjectsInfo); }
        Handles.MH_vkExportMetalObjectsEXT.invokeExact(device.capabilities().PFN_vkExportMetalObjectsEXT, device.segment(), pMetalObjectsInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkExportMetalObjectsEXT", e); }
    }

}
