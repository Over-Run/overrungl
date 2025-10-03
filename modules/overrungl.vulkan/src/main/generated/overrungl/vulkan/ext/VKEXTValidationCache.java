// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext;
import java.lang.foreign.*;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.vulkan.*;
import static overrungl.internal.RuntimeHelper.*;
/// `VK_EXT_validation_cache` - device extension
public final class VKEXTValidationCache {
    public static final int VK_VALIDATION_CACHE_HEADER_VERSION_ONE_EXT = 1;
    public static final int VK_EXT_VALIDATION_CACHE_SPEC_VERSION = 1;
    public static final String VK_EXT_VALIDATION_CACHE_EXTENSION_NAME = "VK_EXT_validation_cache";
    public static final int VK_STRUCTURE_TYPE_VALIDATION_CACHE_CREATE_INFO_EXT = 1000160000;
    public static final int VK_STRUCTURE_TYPE_SHADER_MODULE_VALIDATION_CACHE_CREATE_INFO_EXT = 1000160001;
    public static final int VK_OBJECT_TYPE_VALIDATION_CACHE_EXT = 1000160000;
    public static final class Handles {
        public static final Supplier<MethodHandle> MH_vkCreateValidationCacheEXT = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_vkDestroyValidationCacheEXT = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_vkMergeValidationCachesEXT = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_vkGetValidationCacheDataEXT = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        private Handles() {}
    }

    private VKEXTValidationCache() {}

    /// Invokes `vkCreateValidationCacheEXT`.
    /// ```
    /// (int) VkResult vkCreateValidationCacheEXT((struct VkDevice*) VkDevice device, const VkValidationCacheCreateInfoEXT* pCreateInfo, const VkAllocationCallbacks* pAllocator, VkValidationCacheEXT* pValidationCache);
    /// ```
    public static int vkCreateValidationCacheEXT(@NonNull VkDevice device, @NonNull MemorySegment pCreateInfo, @NonNull MemorySegment pAllocator, @NonNull MemorySegment pValidationCache) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkCreateValidationCacheEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkCreateValidationCacheEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCreateValidationCacheEXT", device, pCreateInfo, pAllocator, pValidationCache); }
        return (int) Handles.MH_vkCreateValidationCacheEXT.get().invokeExact(device.capabilities().PFN_vkCreateValidationCacheEXT, device.segment(), pCreateInfo, pAllocator, pValidationCache); }
        catch (Throwable e) { throw new RuntimeException("error in vkCreateValidationCacheEXT", e); }
    }

    /// Invokes `vkDestroyValidationCacheEXT`.
    /// ```
    /// void vkDestroyValidationCacheEXT((struct VkDevice*) VkDevice device, (uint64_t) VkValidationCacheEXT validationCache, const VkAllocationCallbacks* pAllocator);
    /// ```
    public static void vkDestroyValidationCacheEXT(@NonNull VkDevice device, long validationCache, @NonNull MemorySegment pAllocator) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkDestroyValidationCacheEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkDestroyValidationCacheEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkDestroyValidationCacheEXT", device, validationCache, pAllocator); }
        Handles.MH_vkDestroyValidationCacheEXT.get().invokeExact(device.capabilities().PFN_vkDestroyValidationCacheEXT, device.segment(), validationCache, pAllocator); }
        catch (Throwable e) { throw new RuntimeException("error in vkDestroyValidationCacheEXT", e); }
    }

    /// Invokes `vkMergeValidationCachesEXT`.
    /// ```
    /// (int) VkResult vkMergeValidationCachesEXT((struct VkDevice*) VkDevice device, (uint64_t) VkValidationCacheEXT dstCache, uint32_t srcCacheCount, const VkValidationCacheEXT* pSrcCaches);
    /// ```
    public static int vkMergeValidationCachesEXT(@NonNull VkDevice device, long dstCache, int srcCacheCount, @NonNull MemorySegment pSrcCaches) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkMergeValidationCachesEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkMergeValidationCachesEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkMergeValidationCachesEXT", device, dstCache, srcCacheCount, pSrcCaches); }
        return (int) Handles.MH_vkMergeValidationCachesEXT.get().invokeExact(device.capabilities().PFN_vkMergeValidationCachesEXT, device.segment(), dstCache, srcCacheCount, pSrcCaches); }
        catch (Throwable e) { throw new RuntimeException("error in vkMergeValidationCachesEXT", e); }
    }

    /// Invokes `vkGetValidationCacheDataEXT`.
    /// ```
    /// (int) VkResult vkGetValidationCacheDataEXT((struct VkDevice*) VkDevice device, (uint64_t) VkValidationCacheEXT validationCache, size_t* pDataSize, void* pData);
    /// ```
    public static int vkGetValidationCacheDataEXT(@NonNull VkDevice device, long validationCache, @NonNull MemorySegment pDataSize, @NonNull MemorySegment pData) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkGetValidationCacheDataEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkGetValidationCacheDataEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkGetValidationCacheDataEXT", device, validationCache, pDataSize, pData); }
        return (int) Handles.MH_vkGetValidationCacheDataEXT.get().invokeExact(device.capabilities().PFN_vkGetValidationCacheDataEXT, device.segment(), validationCache, pDataSize, pData); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetValidationCacheDataEXT", e); }
    }

}
