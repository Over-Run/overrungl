// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.fuchsia;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.vulkan.*;
import static overrungl.internal.RuntimeHelper.*;
/// `VK_FUCHSIA_buffer_collection` - device extension
public final class VKFUCHSIABufferCollection {
    public static final int VK_IMAGE_CONSTRAINTS_INFO_CPU_READ_RARELY_FUCHSIA = 0x00000001;
    public static final int VK_IMAGE_CONSTRAINTS_INFO_CPU_READ_OFTEN_FUCHSIA = 0x00000002;
    public static final int VK_IMAGE_CONSTRAINTS_INFO_CPU_WRITE_RARELY_FUCHSIA = 0x00000004;
    public static final int VK_IMAGE_CONSTRAINTS_INFO_CPU_WRITE_OFTEN_FUCHSIA = 0x00000008;
    public static final int VK_IMAGE_CONSTRAINTS_INFO_PROTECTED_OPTIONAL_FUCHSIA = 0x00000010;
    public static final int VK_FUCHSIA_BUFFER_COLLECTION_SPEC_VERSION = 2;
    public static final String VK_FUCHSIA_BUFFER_COLLECTION_EXTENSION_NAME = "VK_FUCHSIA_buffer_collection";
    public static final int VK_STRUCTURE_TYPE_BUFFER_COLLECTION_CREATE_INFO_FUCHSIA = 1000366000;
    public static final int VK_OBJECT_TYPE_BUFFER_COLLECTION_FUCHSIA = 1000366000;
    public static final int VK_STRUCTURE_TYPE_IMPORT_MEMORY_BUFFER_COLLECTION_FUCHSIA = 1000366001;
    public static final int VK_STRUCTURE_TYPE_BUFFER_COLLECTION_IMAGE_CREATE_INFO_FUCHSIA = 1000366002;
    public static final int VK_STRUCTURE_TYPE_BUFFER_COLLECTION_PROPERTIES_FUCHSIA = 1000366003;
    public static final int VK_STRUCTURE_TYPE_BUFFER_CONSTRAINTS_INFO_FUCHSIA = 1000366004;
    public static final int VK_STRUCTURE_TYPE_BUFFER_COLLECTION_BUFFER_CREATE_INFO_FUCHSIA = 1000366005;
    public static final int VK_STRUCTURE_TYPE_IMAGE_CONSTRAINTS_INFO_FUCHSIA = 1000366006;
    public static final int VK_STRUCTURE_TYPE_IMAGE_FORMAT_CONSTRAINTS_INFO_FUCHSIA = 1000366007;
    public static final int VK_STRUCTURE_TYPE_SYSMEM_COLOR_SPACE_FUCHSIA = 1000366008;
    public static final int VK_STRUCTURE_TYPE_BUFFER_COLLECTION_CONSTRAINTS_INFO_FUCHSIA = 1000366009;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_BUFFER_COLLECTION_FUCHSIA_EXT = 1000366000;
    public static final class Handles {
        public static final MethodHandle MH_vkCreateBufferCollectionFUCHSIA = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkSetBufferCollectionImageConstraintsFUCHSIA = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkSetBufferCollectionBufferConstraintsFUCHSIA = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkDestroyBufferCollectionFUCHSIA = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetBufferCollectionPropertiesFUCHSIA = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS));
        private Handles() {}
    }

    private VKFUCHSIABufferCollection() {}

    /// Invokes `vkCreateBufferCollectionFUCHSIA`.
    /// ```
    /// (int) VkResult vkCreateBufferCollectionFUCHSIA((struct VkDevice*) VkDevice device, const VkBufferCollectionCreateInfoFUCHSIA* pCreateInfo, const VkAllocationCallbacks* pAllocator, VkBufferCollectionFUCHSIA* pCollection);
    /// ```
    public static int vkCreateBufferCollectionFUCHSIA(@NonNull VkDevice device, @NonNull MemorySegment pCreateInfo, @NonNull MemorySegment pAllocator, @NonNull MemorySegment pCollection) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkCreateBufferCollectionFUCHSIA)) throw new VKSymbolNotFoundError("Symbol not found: vkCreateBufferCollectionFUCHSIA");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCreateBufferCollectionFUCHSIA", device, pCreateInfo, pAllocator, pCollection); }
        return (int) Handles.MH_vkCreateBufferCollectionFUCHSIA.invokeExact(device.capabilities().PFN_vkCreateBufferCollectionFUCHSIA, device.segment(), pCreateInfo, pAllocator, pCollection); }
        catch (Throwable e) { throw new RuntimeException("error in vkCreateBufferCollectionFUCHSIA", e); }
    }

    /// Invokes `vkSetBufferCollectionImageConstraintsFUCHSIA`.
    /// ```
    /// (int) VkResult vkSetBufferCollectionImageConstraintsFUCHSIA((struct VkDevice*) VkDevice device, (uint64_t) VkBufferCollectionFUCHSIA collection, const VkImageConstraintsInfoFUCHSIA* pImageConstraintsInfo);
    /// ```
    public static int vkSetBufferCollectionImageConstraintsFUCHSIA(@NonNull VkDevice device, long collection, @NonNull MemorySegment pImageConstraintsInfo) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkSetBufferCollectionImageConstraintsFUCHSIA)) throw new VKSymbolNotFoundError("Symbol not found: vkSetBufferCollectionImageConstraintsFUCHSIA");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkSetBufferCollectionImageConstraintsFUCHSIA", device, collection, pImageConstraintsInfo); }
        return (int) Handles.MH_vkSetBufferCollectionImageConstraintsFUCHSIA.invokeExact(device.capabilities().PFN_vkSetBufferCollectionImageConstraintsFUCHSIA, device.segment(), collection, pImageConstraintsInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkSetBufferCollectionImageConstraintsFUCHSIA", e); }
    }

    /// Invokes `vkSetBufferCollectionBufferConstraintsFUCHSIA`.
    /// ```
    /// (int) VkResult vkSetBufferCollectionBufferConstraintsFUCHSIA((struct VkDevice*) VkDevice device, (uint64_t) VkBufferCollectionFUCHSIA collection, const VkBufferConstraintsInfoFUCHSIA* pBufferConstraintsInfo);
    /// ```
    public static int vkSetBufferCollectionBufferConstraintsFUCHSIA(@NonNull VkDevice device, long collection, @NonNull MemorySegment pBufferConstraintsInfo) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkSetBufferCollectionBufferConstraintsFUCHSIA)) throw new VKSymbolNotFoundError("Symbol not found: vkSetBufferCollectionBufferConstraintsFUCHSIA");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkSetBufferCollectionBufferConstraintsFUCHSIA", device, collection, pBufferConstraintsInfo); }
        return (int) Handles.MH_vkSetBufferCollectionBufferConstraintsFUCHSIA.invokeExact(device.capabilities().PFN_vkSetBufferCollectionBufferConstraintsFUCHSIA, device.segment(), collection, pBufferConstraintsInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkSetBufferCollectionBufferConstraintsFUCHSIA", e); }
    }

    /// Invokes `vkDestroyBufferCollectionFUCHSIA`.
    /// ```
    /// void vkDestroyBufferCollectionFUCHSIA((struct VkDevice*) VkDevice device, (uint64_t) VkBufferCollectionFUCHSIA collection, const VkAllocationCallbacks* pAllocator);
    /// ```
    public static void vkDestroyBufferCollectionFUCHSIA(@NonNull VkDevice device, long collection, @NonNull MemorySegment pAllocator) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkDestroyBufferCollectionFUCHSIA)) throw new VKSymbolNotFoundError("Symbol not found: vkDestroyBufferCollectionFUCHSIA");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkDestroyBufferCollectionFUCHSIA", device, collection, pAllocator); }
        Handles.MH_vkDestroyBufferCollectionFUCHSIA.invokeExact(device.capabilities().PFN_vkDestroyBufferCollectionFUCHSIA, device.segment(), collection, pAllocator); }
        catch (Throwable e) { throw new RuntimeException("error in vkDestroyBufferCollectionFUCHSIA", e); }
    }

    /// Invokes `vkGetBufferCollectionPropertiesFUCHSIA`.
    /// ```
    /// (int) VkResult vkGetBufferCollectionPropertiesFUCHSIA((struct VkDevice*) VkDevice device, (uint64_t) VkBufferCollectionFUCHSIA collection, VkBufferCollectionPropertiesFUCHSIA* pProperties);
    /// ```
    public static int vkGetBufferCollectionPropertiesFUCHSIA(@NonNull VkDevice device, long collection, @NonNull MemorySegment pProperties) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkGetBufferCollectionPropertiesFUCHSIA)) throw new VKSymbolNotFoundError("Symbol not found: vkGetBufferCollectionPropertiesFUCHSIA");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkGetBufferCollectionPropertiesFUCHSIA", device, collection, pProperties); }
        return (int) Handles.MH_vkGetBufferCollectionPropertiesFUCHSIA.invokeExact(device.capabilities().PFN_vkGetBufferCollectionPropertiesFUCHSIA, device.segment(), collection, pProperties); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetBufferCollectionPropertiesFUCHSIA", e); }
    }

}
