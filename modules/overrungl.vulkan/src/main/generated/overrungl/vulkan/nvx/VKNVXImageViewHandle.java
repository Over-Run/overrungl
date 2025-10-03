// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.nvx;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.vulkan.*;
import static overrungl.internal.RuntimeHelper.*;
/// `VK_NVX_image_view_handle` - device extension
public final class VKNVXImageViewHandle {
    public static final int VK_NVX_IMAGE_VIEW_HANDLE_SPEC_VERSION = 3;
    public static final String VK_NVX_IMAGE_VIEW_HANDLE_EXTENSION_NAME = "VK_NVX_image_view_handle";
    public static final int VK_STRUCTURE_TYPE_IMAGE_VIEW_HANDLE_INFO_NVX = 1000030000;
    public static final int VK_STRUCTURE_TYPE_IMAGE_VIEW_ADDRESS_PROPERTIES_NVX = 1000030001;
    public static final class Handles {
        public static final MethodHandle MH_vkGetImageViewHandleNVX = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetImageViewHandle64NVX = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetImageViewAddressNVX = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS));
        private Handles() {}
    }

    private VKNVXImageViewHandle() {}

    /// Invokes `vkGetImageViewHandleNVX`.
    /// ```
    /// uint32_t vkGetImageViewHandleNVX((struct VkDevice*) VkDevice device, const VkImageViewHandleInfoNVX* pInfo);
    /// ```
    public static int vkGetImageViewHandleNVX(@NonNull VkDevice device, @NonNull MemorySegment pInfo) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkGetImageViewHandleNVX)) throw new VKSymbolNotFoundError("Symbol not found: vkGetImageViewHandleNVX");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkGetImageViewHandleNVX", device, pInfo); }
        return (int) Handles.MH_vkGetImageViewHandleNVX.invokeExact(device.capabilities().PFN_vkGetImageViewHandleNVX, device.segment(), pInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetImageViewHandleNVX", e); }
    }

    /// Invokes `vkGetImageViewHandle64NVX`.
    /// ```
    /// uint64_t vkGetImageViewHandle64NVX((struct VkDevice*) VkDevice device, const VkImageViewHandleInfoNVX* pInfo);
    /// ```
    public static long vkGetImageViewHandle64NVX(@NonNull VkDevice device, @NonNull MemorySegment pInfo) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkGetImageViewHandle64NVX)) throw new VKSymbolNotFoundError("Symbol not found: vkGetImageViewHandle64NVX");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkGetImageViewHandle64NVX", device, pInfo); }
        return (long) Handles.MH_vkGetImageViewHandle64NVX.invokeExact(device.capabilities().PFN_vkGetImageViewHandle64NVX, device.segment(), pInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetImageViewHandle64NVX", e); }
    }

    /// Invokes `vkGetImageViewAddressNVX`.
    /// ```
    /// (int) VkResult vkGetImageViewAddressNVX((struct VkDevice*) VkDevice device, (uint64_t) VkImageView imageView, VkImageViewAddressPropertiesNVX* pProperties);
    /// ```
    public static int vkGetImageViewAddressNVX(@NonNull VkDevice device, long imageView, @NonNull MemorySegment pProperties) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkGetImageViewAddressNVX)) throw new VKSymbolNotFoundError("Symbol not found: vkGetImageViewAddressNVX");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkGetImageViewAddressNVX", device, imageView, pProperties); }
        return (int) Handles.MH_vkGetImageViewAddressNVX.invokeExact(device.capabilities().PFN_vkGetImageViewAddressNVX, device.segment(), imageView, pProperties); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetImageViewAddressNVX", e); }
    }

}
