// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr;
import java.lang.foreign.*;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.vulkan.*;
import static overrungl.internal.RuntimeHelper.*;
/// `VK_KHR_get_memory_requirements2` - device extension
public final class VKKHRGetMemoryRequirements2 {
    public static final int VK_KHR_GET_MEMORY_REQUIREMENTS_2_SPEC_VERSION = 1;
    public static final String VK_KHR_GET_MEMORY_REQUIREMENTS_2_EXTENSION_NAME = "VK_KHR_get_memory_requirements2";
    public static final int VK_STRUCTURE_TYPE_BUFFER_MEMORY_REQUIREMENTS_INFO_2_KHR = 1000146000;
    public static final int VK_STRUCTURE_TYPE_IMAGE_MEMORY_REQUIREMENTS_INFO_2_KHR = 1000146001;
    public static final int VK_STRUCTURE_TYPE_IMAGE_SPARSE_MEMORY_REQUIREMENTS_INFO_2_KHR = 1000146002;
    public static final int VK_STRUCTURE_TYPE_MEMORY_REQUIREMENTS_2_KHR = 1000146003;
    public static final int VK_STRUCTURE_TYPE_SPARSE_IMAGE_MEMORY_REQUIREMENTS_2_KHR = 1000146004;
    public static final class Handles {
        public static final Supplier<MethodHandle> MH_vkGetImageMemoryRequirements2KHR = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_vkGetBufferMemoryRequirements2KHR = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_vkGetImageSparseMemoryRequirements2KHR = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        private Handles() {}
    }

    private VKKHRGetMemoryRequirements2() {}

    /// Invokes `vkGetImageMemoryRequirements2KHR`.
    /// ```
    /// void vkGetImageMemoryRequirements2KHR((struct VkDevice*) VkDevice device, const VkImageMemoryRequirementsInfo2* pInfo, VkMemoryRequirements2* pMemoryRequirements);
    /// ```
    public static void vkGetImageMemoryRequirements2KHR(@NonNull VkDevice device, @NonNull MemorySegment pInfo, @NonNull MemorySegment pMemoryRequirements) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkGetImageMemoryRequirements2KHR)) throw new VKSymbolNotFoundError("Symbol not found: vkGetImageMemoryRequirements2KHR");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkGetImageMemoryRequirements2KHR", device, pInfo, pMemoryRequirements); }
        Handles.MH_vkGetImageMemoryRequirements2KHR.get().invokeExact(device.capabilities().PFN_vkGetImageMemoryRequirements2KHR, device.segment(), pInfo, pMemoryRequirements); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetImageMemoryRequirements2KHR", e); }
    }

    /// Invokes `vkGetBufferMemoryRequirements2KHR`.
    /// ```
    /// void vkGetBufferMemoryRequirements2KHR((struct VkDevice*) VkDevice device, const VkBufferMemoryRequirementsInfo2* pInfo, VkMemoryRequirements2* pMemoryRequirements);
    /// ```
    public static void vkGetBufferMemoryRequirements2KHR(@NonNull VkDevice device, @NonNull MemorySegment pInfo, @NonNull MemorySegment pMemoryRequirements) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkGetBufferMemoryRequirements2KHR)) throw new VKSymbolNotFoundError("Symbol not found: vkGetBufferMemoryRequirements2KHR");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkGetBufferMemoryRequirements2KHR", device, pInfo, pMemoryRequirements); }
        Handles.MH_vkGetBufferMemoryRequirements2KHR.get().invokeExact(device.capabilities().PFN_vkGetBufferMemoryRequirements2KHR, device.segment(), pInfo, pMemoryRequirements); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetBufferMemoryRequirements2KHR", e); }
    }

    /// Invokes `vkGetImageSparseMemoryRequirements2KHR`.
    /// ```
    /// void vkGetImageSparseMemoryRequirements2KHR((struct VkDevice*) VkDevice device, const VkImageSparseMemoryRequirementsInfo2* pInfo, uint32_t* pSparseMemoryRequirementCount, VkSparseImageMemoryRequirements2* pSparseMemoryRequirements);
    /// ```
    public static void vkGetImageSparseMemoryRequirements2KHR(@NonNull VkDevice device, @NonNull MemorySegment pInfo, @NonNull MemorySegment pSparseMemoryRequirementCount, @NonNull MemorySegment pSparseMemoryRequirements) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkGetImageSparseMemoryRequirements2KHR)) throw new VKSymbolNotFoundError("Symbol not found: vkGetImageSparseMemoryRequirements2KHR");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkGetImageSparseMemoryRequirements2KHR", device, pInfo, pSparseMemoryRequirementCount, pSparseMemoryRequirements); }
        Handles.MH_vkGetImageSparseMemoryRequirements2KHR.get().invokeExact(device.capabilities().PFN_vkGetImageSparseMemoryRequirements2KHR, device.segment(), pInfo, pSparseMemoryRequirementCount, pSparseMemoryRequirements); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetImageSparseMemoryRequirements2KHR", e); }
    }

}
