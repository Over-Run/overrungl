// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.vulkan.*;
import static overrungl.internal.RuntimeHelper.*;
/// `VK_EXT_host_image_copy` - device extension
public final class VKEXTHostImageCopy {
    public static final int VK_EXT_HOST_IMAGE_COPY_SPEC_VERSION = 1;
    public static final String VK_EXT_HOST_IMAGE_COPY_EXTENSION_NAME = "VK_EXT_host_image_copy";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_HOST_IMAGE_COPY_FEATURES_EXT = 1000270000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_HOST_IMAGE_COPY_PROPERTIES_EXT = 1000270001;
    public static final int VK_STRUCTURE_TYPE_MEMORY_TO_IMAGE_COPY_EXT = 1000270002;
    public static final int VK_STRUCTURE_TYPE_IMAGE_TO_MEMORY_COPY_EXT = 1000270003;
    public static final int VK_STRUCTURE_TYPE_COPY_IMAGE_TO_MEMORY_INFO_EXT = 1000270004;
    public static final int VK_STRUCTURE_TYPE_COPY_MEMORY_TO_IMAGE_INFO_EXT = 1000270005;
    public static final int VK_STRUCTURE_TYPE_HOST_IMAGE_LAYOUT_TRANSITION_INFO_EXT = 1000270006;
    public static final int VK_STRUCTURE_TYPE_COPY_IMAGE_TO_IMAGE_INFO_EXT = 1000270007;
    public static final int VK_STRUCTURE_TYPE_SUBRESOURCE_HOST_MEMCPY_SIZE_EXT = 1000270008;
    public static final int VK_STRUCTURE_TYPE_HOST_IMAGE_COPY_DEVICE_PERFORMANCE_QUERY_EXT = 1000270009;
    public static final int VK_IMAGE_USAGE_HOST_TRANSFER_BIT_EXT = 0x00400000;
    public static final long VK_FORMAT_FEATURE_2_HOST_IMAGE_TRANSFER_BIT_EXT = 0x400000000000L;
    public static final int VK_HOST_IMAGE_COPY_MEMCPY_BIT_EXT = 0x00000001;
    public static final int VK_HOST_IMAGE_COPY_MEMCPY_EXT = 0x00000001;
    private VKEXTHostImageCopy() {}
    public static final class Handles {
        public static final MethodHandle MH_vkCopyMemoryToImageEXT = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCopyImageToMemoryEXT = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCopyImageToImageEXT = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkTransitionImageLayoutEXT = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetImageSubresourceLayout2EXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        private Handles() {}
    }

    /// Invokes `vkCopyMemoryToImageEXT`.
    /// ```
    /// VkResult vkCopyMemoryToImageEXT(VkDevice device, const VkCopyMemoryToImageInfo* pCopyMemoryToImageInfo);
    /// ```
    public static int vkCopyMemoryToImageEXT(@NonNull VkDevice device, @NonNull MemorySegment pCopyMemoryToImageInfo) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkCopyMemoryToImageEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkCopyMemoryToImageEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCopyMemoryToImageEXT", device, pCopyMemoryToImageInfo); }
        return (int) Handles.MH_vkCopyMemoryToImageEXT.invokeExact(device.capabilities().PFN_vkCopyMemoryToImageEXT, device.segment(), pCopyMemoryToImageInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkCopyMemoryToImageEXT", e); }
    }

    /// Invokes `vkCopyImageToMemoryEXT`.
    /// ```
    /// VkResult vkCopyImageToMemoryEXT(VkDevice device, const VkCopyImageToMemoryInfo* pCopyImageToMemoryInfo);
    /// ```
    public static int vkCopyImageToMemoryEXT(@NonNull VkDevice device, @NonNull MemorySegment pCopyImageToMemoryInfo) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkCopyImageToMemoryEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkCopyImageToMemoryEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCopyImageToMemoryEXT", device, pCopyImageToMemoryInfo); }
        return (int) Handles.MH_vkCopyImageToMemoryEXT.invokeExact(device.capabilities().PFN_vkCopyImageToMemoryEXT, device.segment(), pCopyImageToMemoryInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkCopyImageToMemoryEXT", e); }
    }

    /// Invokes `vkCopyImageToImageEXT`.
    /// ```
    /// VkResult vkCopyImageToImageEXT(VkDevice device, const VkCopyImageToImageInfo* pCopyImageToImageInfo);
    /// ```
    public static int vkCopyImageToImageEXT(@NonNull VkDevice device, @NonNull MemorySegment pCopyImageToImageInfo) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkCopyImageToImageEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkCopyImageToImageEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCopyImageToImageEXT", device, pCopyImageToImageInfo); }
        return (int) Handles.MH_vkCopyImageToImageEXT.invokeExact(device.capabilities().PFN_vkCopyImageToImageEXT, device.segment(), pCopyImageToImageInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkCopyImageToImageEXT", e); }
    }

    /// Invokes `vkTransitionImageLayoutEXT`.
    /// ```
    /// VkResult vkTransitionImageLayoutEXT(VkDevice device, uint32_t transitionCount, const VkHostImageLayoutTransitionInfo* pTransitions);
    /// ```
    public static int vkTransitionImageLayoutEXT(@NonNull VkDevice device, int transitionCount, @NonNull MemorySegment pTransitions) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkTransitionImageLayoutEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkTransitionImageLayoutEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkTransitionImageLayoutEXT", device, transitionCount, pTransitions); }
        return (int) Handles.MH_vkTransitionImageLayoutEXT.invokeExact(device.capabilities().PFN_vkTransitionImageLayoutEXT, device.segment(), transitionCount, pTransitions); }
        catch (Throwable e) { throw new RuntimeException("error in vkTransitionImageLayoutEXT", e); }
    }

    /// Invokes `vkGetImageSubresourceLayout2EXT`.
    /// ```
    /// void vkGetImageSubresourceLayout2EXT(VkDevice device, VkImage image, const VkImageSubresource2* pSubresource, VkSubresourceLayout2* pLayout);
    /// ```
    public static void vkGetImageSubresourceLayout2EXT(@NonNull VkDevice device, long image, @NonNull MemorySegment pSubresource, @NonNull MemorySegment pLayout) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkGetImageSubresourceLayout2EXT)) throw new VKSymbolNotFoundError("Symbol not found: vkGetImageSubresourceLayout2EXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkGetImageSubresourceLayout2EXT", device, image, pSubresource, pLayout); }
        Handles.MH_vkGetImageSubresourceLayout2EXT.invokeExact(device.capabilities().PFN_vkGetImageSubresourceLayout2EXT, device.segment(), image, pSubresource, pLayout); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetImageSubresourceLayout2EXT", e); }
    }

}
