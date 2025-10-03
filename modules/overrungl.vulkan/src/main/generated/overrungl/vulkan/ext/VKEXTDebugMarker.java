// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.vulkan.*;
import static overrungl.internal.RuntimeHelper.*;
/// `VK_EXT_debug_marker` - device extension
public final class VKEXTDebugMarker {
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_UNKNOWN_EXT = 0;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_INSTANCE_EXT = 1;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_PHYSICAL_DEVICE_EXT = 2;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_DEVICE_EXT = 3;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_QUEUE_EXT = 4;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_SEMAPHORE_EXT = 5;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_COMMAND_BUFFER_EXT = 6;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_FENCE_EXT = 7;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_DEVICE_MEMORY_EXT = 8;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_BUFFER_EXT = 9;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_IMAGE_EXT = 10;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_EVENT_EXT = 11;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_QUERY_POOL_EXT = 12;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_BUFFER_VIEW_EXT = 13;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_IMAGE_VIEW_EXT = 14;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_SHADER_MODULE_EXT = 15;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_PIPELINE_CACHE_EXT = 16;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_PIPELINE_LAYOUT_EXT = 17;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_RENDER_PASS_EXT = 18;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_PIPELINE_EXT = 19;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_DESCRIPTOR_SET_LAYOUT_EXT = 20;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_SAMPLER_EXT = 21;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_DESCRIPTOR_POOL_EXT = 22;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_DESCRIPTOR_SET_EXT = 23;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_FRAMEBUFFER_EXT = 24;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_COMMAND_POOL_EXT = 25;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_SURFACE_KHR_EXT = 26;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_SWAPCHAIN_KHR_EXT = 27;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_DEBUG_REPORT_CALLBACK_EXT_EXT = 28;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_DEBUG_REPORT_EXT = 28;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_DISPLAY_KHR_EXT = 29;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_DISPLAY_MODE_KHR_EXT = 30;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_VALIDATION_CACHE_EXT_EXT = 33;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_VALIDATION_CACHE_EXT = 33;
    public static final int VK_EXT_DEBUG_MARKER_SPEC_VERSION = 4;
    public static final String VK_EXT_DEBUG_MARKER_EXTENSION_NAME = "VK_EXT_debug_marker";
    public static final int VK_STRUCTURE_TYPE_DEBUG_MARKER_OBJECT_NAME_INFO_EXT = 1000022000;
    public static final int VK_STRUCTURE_TYPE_DEBUG_MARKER_OBJECT_TAG_INFO_EXT = 1000022001;
    public static final int VK_STRUCTURE_TYPE_DEBUG_MARKER_MARKER_INFO_EXT = 1000022002;
    public static final class Handles {
        public static final MethodHandle MH_vkDebugMarkerSetObjectTagEXT = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkDebugMarkerSetObjectNameEXT = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdDebugMarkerBeginEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdDebugMarkerEndEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdDebugMarkerInsertEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        private Handles() {}
    }

    private VKEXTDebugMarker() {}

    /// Invokes `vkDebugMarkerSetObjectTagEXT`.
    /// ```
    /// (int) VkResult vkDebugMarkerSetObjectTagEXT((struct VkDevice*) VkDevice device, const VkDebugMarkerObjectTagInfoEXT* pTagInfo);
    /// ```
    public static int vkDebugMarkerSetObjectTagEXT(@NonNull VkDevice device, @NonNull MemorySegment pTagInfo) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkDebugMarkerSetObjectTagEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkDebugMarkerSetObjectTagEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkDebugMarkerSetObjectTagEXT", device, pTagInfo); }
        return (int) Handles.MH_vkDebugMarkerSetObjectTagEXT.invokeExact(device.capabilities().PFN_vkDebugMarkerSetObjectTagEXT, device.segment(), pTagInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkDebugMarkerSetObjectTagEXT", e); }
    }

    /// Invokes `vkDebugMarkerSetObjectNameEXT`.
    /// ```
    /// (int) VkResult vkDebugMarkerSetObjectNameEXT((struct VkDevice*) VkDevice device, const VkDebugMarkerObjectNameInfoEXT* pNameInfo);
    /// ```
    public static int vkDebugMarkerSetObjectNameEXT(@NonNull VkDevice device, @NonNull MemorySegment pNameInfo) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkDebugMarkerSetObjectNameEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkDebugMarkerSetObjectNameEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkDebugMarkerSetObjectNameEXT", device, pNameInfo); }
        return (int) Handles.MH_vkDebugMarkerSetObjectNameEXT.invokeExact(device.capabilities().PFN_vkDebugMarkerSetObjectNameEXT, device.segment(), pNameInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkDebugMarkerSetObjectNameEXT", e); }
    }

    /// Invokes `vkCmdDebugMarkerBeginEXT`.
    /// ```
    /// void vkCmdDebugMarkerBeginEXT((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, const VkDebugMarkerMarkerInfoEXT* pMarkerInfo);
    /// ```
    public static void vkCmdDebugMarkerBeginEXT(@NonNull VkCommandBuffer commandBuffer, @NonNull MemorySegment pMarkerInfo) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdDebugMarkerBeginEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdDebugMarkerBeginEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdDebugMarkerBeginEXT", commandBuffer, pMarkerInfo); }
        Handles.MH_vkCmdDebugMarkerBeginEXT.invokeExact(commandBuffer.capabilities().PFN_vkCmdDebugMarkerBeginEXT, commandBuffer.segment(), pMarkerInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdDebugMarkerBeginEXT", e); }
    }

    /// Invokes `vkCmdDebugMarkerEndEXT`.
    /// ```
    /// void vkCmdDebugMarkerEndEXT((struct VkCommandBuffer*) VkCommandBuffer commandBuffer);
    /// ```
    public static void vkCmdDebugMarkerEndEXT(@NonNull VkCommandBuffer commandBuffer) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdDebugMarkerEndEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdDebugMarkerEndEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdDebugMarkerEndEXT", commandBuffer); }
        Handles.MH_vkCmdDebugMarkerEndEXT.invokeExact(commandBuffer.capabilities().PFN_vkCmdDebugMarkerEndEXT, commandBuffer.segment()); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdDebugMarkerEndEXT", e); }
    }

    /// Invokes `vkCmdDebugMarkerInsertEXT`.
    /// ```
    /// void vkCmdDebugMarkerInsertEXT((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, const VkDebugMarkerMarkerInfoEXT* pMarkerInfo);
    /// ```
    public static void vkCmdDebugMarkerInsertEXT(@NonNull VkCommandBuffer commandBuffer, @NonNull MemorySegment pMarkerInfo) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdDebugMarkerInsertEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdDebugMarkerInsertEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdDebugMarkerInsertEXT", commandBuffer, pMarkerInfo); }
        Handles.MH_vkCmdDebugMarkerInsertEXT.invokeExact(commandBuffer.capabilities().PFN_vkCmdDebugMarkerInsertEXT, commandBuffer.segment(), pMarkerInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdDebugMarkerInsertEXT", e); }
    }

}
