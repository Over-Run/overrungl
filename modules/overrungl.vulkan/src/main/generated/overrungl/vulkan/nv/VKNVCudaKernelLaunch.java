// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.nv;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.vulkan.*;
import static overrungl.internal.RuntimeHelper.*;
/// `VK_NV_cuda_kernel_launch` - device extension
public final class VKNVCudaKernelLaunch {
    public static final int VK_NV_CUDA_KERNEL_LAUNCH_SPEC_VERSION = 2;
    public static final String VK_NV_CUDA_KERNEL_LAUNCH_EXTENSION_NAME = "VK_NV_cuda_kernel_launch";
    public static final int VK_STRUCTURE_TYPE_CUDA_MODULE_CREATE_INFO_NV = 1000307000;
    public static final int VK_STRUCTURE_TYPE_CUDA_FUNCTION_CREATE_INFO_NV = 1000307001;
    public static final int VK_STRUCTURE_TYPE_CUDA_LAUNCH_INFO_NV = 1000307002;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_CUDA_KERNEL_LAUNCH_FEATURES_NV = 1000307003;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_CUDA_KERNEL_LAUNCH_PROPERTIES_NV = 1000307004;
    public static final int VK_OBJECT_TYPE_CUDA_MODULE_NV = 1000307000;
    public static final int VK_OBJECT_TYPE_CUDA_FUNCTION_NV = 1000307001;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_CUDA_MODULE_NV_EXT = 1000307000;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_CUDA_FUNCTION_NV_EXT = 1000307001;
    public static final class Handles {
        public static final MethodHandle MH_vkCreateCudaModuleNV = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetCudaModuleCacheNV = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCreateCudaFunctionNV = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkDestroyCudaModuleNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkDestroyCudaFunctionNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdCudaLaunchKernelNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        private Handles() {}
    }

    private VKNVCudaKernelLaunch() {}

    /// Invokes `vkCreateCudaModuleNV`.
    /// ```
    /// (int) VkResult vkCreateCudaModuleNV((struct VkDevice*) VkDevice device, const VkCudaModuleCreateInfoNV* pCreateInfo, const VkAllocationCallbacks* pAllocator, VkCudaModuleNV* pModule);
    /// ```
    public static int vkCreateCudaModuleNV(@NonNull VkDevice device, @NonNull MemorySegment pCreateInfo, @NonNull MemorySegment pAllocator, @NonNull MemorySegment pModule) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkCreateCudaModuleNV)) throw new VKSymbolNotFoundError("Symbol not found: vkCreateCudaModuleNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCreateCudaModuleNV", device, pCreateInfo, pAllocator, pModule); }
        return (int) Handles.MH_vkCreateCudaModuleNV.invokeExact(device.capabilities().PFN_vkCreateCudaModuleNV, device.segment(), pCreateInfo, pAllocator, pModule); }
        catch (Throwable e) { throw new RuntimeException("error in vkCreateCudaModuleNV", e); }
    }

    /// Invokes `vkGetCudaModuleCacheNV`.
    /// ```
    /// (int) VkResult vkGetCudaModuleCacheNV((struct VkDevice*) VkDevice device, (uint64_t) VkCudaModuleNV module, size_t* pCacheSize, void* pCacheData);
    /// ```
    public static int vkGetCudaModuleCacheNV(@NonNull VkDevice device, long module, @NonNull MemorySegment pCacheSize, @NonNull MemorySegment pCacheData) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkGetCudaModuleCacheNV)) throw new VKSymbolNotFoundError("Symbol not found: vkGetCudaModuleCacheNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkGetCudaModuleCacheNV", device, module, pCacheSize, pCacheData); }
        return (int) Handles.MH_vkGetCudaModuleCacheNV.invokeExact(device.capabilities().PFN_vkGetCudaModuleCacheNV, device.segment(), module, pCacheSize, pCacheData); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetCudaModuleCacheNV", e); }
    }

    /// Invokes `vkCreateCudaFunctionNV`.
    /// ```
    /// (int) VkResult vkCreateCudaFunctionNV((struct VkDevice*) VkDevice device, const VkCudaFunctionCreateInfoNV* pCreateInfo, const VkAllocationCallbacks* pAllocator, VkCudaFunctionNV* pFunction);
    /// ```
    public static int vkCreateCudaFunctionNV(@NonNull VkDevice device, @NonNull MemorySegment pCreateInfo, @NonNull MemorySegment pAllocator, @NonNull MemorySegment pFunction) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkCreateCudaFunctionNV)) throw new VKSymbolNotFoundError("Symbol not found: vkCreateCudaFunctionNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCreateCudaFunctionNV", device, pCreateInfo, pAllocator, pFunction); }
        return (int) Handles.MH_vkCreateCudaFunctionNV.invokeExact(device.capabilities().PFN_vkCreateCudaFunctionNV, device.segment(), pCreateInfo, pAllocator, pFunction); }
        catch (Throwable e) { throw new RuntimeException("error in vkCreateCudaFunctionNV", e); }
    }

    /// Invokes `vkDestroyCudaModuleNV`.
    /// ```
    /// void vkDestroyCudaModuleNV((struct VkDevice*) VkDevice device, (uint64_t) VkCudaModuleNV module, const VkAllocationCallbacks* pAllocator);
    /// ```
    public static void vkDestroyCudaModuleNV(@NonNull VkDevice device, long module, @NonNull MemorySegment pAllocator) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkDestroyCudaModuleNV)) throw new VKSymbolNotFoundError("Symbol not found: vkDestroyCudaModuleNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkDestroyCudaModuleNV", device, module, pAllocator); }
        Handles.MH_vkDestroyCudaModuleNV.invokeExact(device.capabilities().PFN_vkDestroyCudaModuleNV, device.segment(), module, pAllocator); }
        catch (Throwable e) { throw new RuntimeException("error in vkDestroyCudaModuleNV", e); }
    }

    /// Invokes `vkDestroyCudaFunctionNV`.
    /// ```
    /// void vkDestroyCudaFunctionNV((struct VkDevice*) VkDevice device, (uint64_t) VkCudaFunctionNV function, const VkAllocationCallbacks* pAllocator);
    /// ```
    public static void vkDestroyCudaFunctionNV(@NonNull VkDevice device, long function, @NonNull MemorySegment pAllocator) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkDestroyCudaFunctionNV)) throw new VKSymbolNotFoundError("Symbol not found: vkDestroyCudaFunctionNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkDestroyCudaFunctionNV", device, function, pAllocator); }
        Handles.MH_vkDestroyCudaFunctionNV.invokeExact(device.capabilities().PFN_vkDestroyCudaFunctionNV, device.segment(), function, pAllocator); }
        catch (Throwable e) { throw new RuntimeException("error in vkDestroyCudaFunctionNV", e); }
    }

    /// Invokes `vkCmdCudaLaunchKernelNV`.
    /// ```
    /// void vkCmdCudaLaunchKernelNV((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, const VkCudaLaunchInfoNV* pLaunchInfo);
    /// ```
    public static void vkCmdCudaLaunchKernelNV(@NonNull VkCommandBuffer commandBuffer, @NonNull MemorySegment pLaunchInfo) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdCudaLaunchKernelNV)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdCudaLaunchKernelNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdCudaLaunchKernelNV", commandBuffer, pLaunchInfo); }
        Handles.MH_vkCmdCudaLaunchKernelNV.invokeExact(commandBuffer.capabilities().PFN_vkCmdCudaLaunchKernelNV, commandBuffer.segment(), pLaunchInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdCudaLaunchKernelNV", e); }
    }

}
