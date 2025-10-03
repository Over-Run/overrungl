// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr;
import java.lang.foreign.*;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.vulkan.*;
import static overrungl.internal.RuntimeHelper.*;
/// `VK_KHR_sampler_ycbcr_conversion` - device extension
public final class VKKHRSamplerYcbcrConversion {
    public static final int VK_KHR_SAMPLER_YCBCR_CONVERSION_SPEC_VERSION = 14;
    public static final String VK_KHR_SAMPLER_YCBCR_CONVERSION_EXTENSION_NAME = "VK_KHR_sampler_ycbcr_conversion";
    public static final int VK_STRUCTURE_TYPE_SAMPLER_YCBCR_CONVERSION_CREATE_INFO_KHR = 1000156000;
    public static final int VK_STRUCTURE_TYPE_SAMPLER_YCBCR_CONVERSION_INFO_KHR = 1000156001;
    public static final int VK_STRUCTURE_TYPE_BIND_IMAGE_PLANE_MEMORY_INFO_KHR = 1000156002;
    public static final int VK_STRUCTURE_TYPE_IMAGE_PLANE_MEMORY_REQUIREMENTS_INFO_KHR = 1000156003;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SAMPLER_YCBCR_CONVERSION_FEATURES_KHR = 1000156004;
    public static final int VK_STRUCTURE_TYPE_SAMPLER_YCBCR_CONVERSION_IMAGE_FORMAT_PROPERTIES_KHR = 1000156005;
    public static final int VK_OBJECT_TYPE_SAMPLER_YCBCR_CONVERSION_KHR = 1000156000;
    public static final int VK_FORMAT_G8B8G8R8_422_UNORM_KHR = 1000156000;
    public static final int VK_FORMAT_B8G8R8G8_422_UNORM_KHR = 1000156001;
    public static final int VK_FORMAT_G8_B8_R8_3PLANE_420_UNORM_KHR = 1000156002;
    public static final int VK_FORMAT_G8_B8R8_2PLANE_420_UNORM_KHR = 1000156003;
    public static final int VK_FORMAT_G8_B8_R8_3PLANE_422_UNORM_KHR = 1000156004;
    public static final int VK_FORMAT_G8_B8R8_2PLANE_422_UNORM_KHR = 1000156005;
    public static final int VK_FORMAT_G8_B8_R8_3PLANE_444_UNORM_KHR = 1000156006;
    public static final int VK_FORMAT_R10X6_UNORM_PACK16_KHR = 1000156007;
    public static final int VK_FORMAT_R10X6G10X6_UNORM_2PACK16_KHR = 1000156008;
    public static final int VK_FORMAT_R10X6G10X6B10X6A10X6_UNORM_4PACK16_KHR = 1000156009;
    public static final int VK_FORMAT_G10X6B10X6G10X6R10X6_422_UNORM_4PACK16_KHR = 1000156010;
    public static final int VK_FORMAT_B10X6G10X6R10X6G10X6_422_UNORM_4PACK16_KHR = 1000156011;
    public static final int VK_FORMAT_G10X6_B10X6_R10X6_3PLANE_420_UNORM_3PACK16_KHR = 1000156012;
    public static final int VK_FORMAT_G10X6_B10X6R10X6_2PLANE_420_UNORM_3PACK16_KHR = 1000156013;
    public static final int VK_FORMAT_G10X6_B10X6_R10X6_3PLANE_422_UNORM_3PACK16_KHR = 1000156014;
    public static final int VK_FORMAT_G10X6_B10X6R10X6_2PLANE_422_UNORM_3PACK16_KHR = 1000156015;
    public static final int VK_FORMAT_G10X6_B10X6_R10X6_3PLANE_444_UNORM_3PACK16_KHR = 1000156016;
    public static final int VK_FORMAT_R12X4_UNORM_PACK16_KHR = 1000156017;
    public static final int VK_FORMAT_R12X4G12X4_UNORM_2PACK16_KHR = 1000156018;
    public static final int VK_FORMAT_R12X4G12X4B12X4A12X4_UNORM_4PACK16_KHR = 1000156019;
    public static final int VK_FORMAT_G12X4B12X4G12X4R12X4_422_UNORM_4PACK16_KHR = 1000156020;
    public static final int VK_FORMAT_B12X4G12X4R12X4G12X4_422_UNORM_4PACK16_KHR = 1000156021;
    public static final int VK_FORMAT_G12X4_B12X4_R12X4_3PLANE_420_UNORM_3PACK16_KHR = 1000156022;
    public static final int VK_FORMAT_G12X4_B12X4R12X4_2PLANE_420_UNORM_3PACK16_KHR = 1000156023;
    public static final int VK_FORMAT_G12X4_B12X4_R12X4_3PLANE_422_UNORM_3PACK16_KHR = 1000156024;
    public static final int VK_FORMAT_G12X4_B12X4R12X4_2PLANE_422_UNORM_3PACK16_KHR = 1000156025;
    public static final int VK_FORMAT_G12X4_B12X4_R12X4_3PLANE_444_UNORM_3PACK16_KHR = 1000156026;
    public static final int VK_FORMAT_G16B16G16R16_422_UNORM_KHR = 1000156027;
    public static final int VK_FORMAT_B16G16R16G16_422_UNORM_KHR = 1000156028;
    public static final int VK_FORMAT_G16_B16_R16_3PLANE_420_UNORM_KHR = 1000156029;
    public static final int VK_FORMAT_G16_B16R16_2PLANE_420_UNORM_KHR = 1000156030;
    public static final int VK_FORMAT_G16_B16_R16_3PLANE_422_UNORM_KHR = 1000156031;
    public static final int VK_FORMAT_G16_B16R16_2PLANE_422_UNORM_KHR = 1000156032;
    public static final int VK_FORMAT_G16_B16_R16_3PLANE_444_UNORM_KHR = 1000156033;
    public static final int VK_IMAGE_ASPECT_PLANE_0_BIT_KHR = 0x00000010;
    public static final int VK_IMAGE_ASPECT_PLANE_1_BIT_KHR = 0x00000020;
    public static final int VK_IMAGE_ASPECT_PLANE_2_BIT_KHR = 0x00000040;
    public static final int VK_IMAGE_CREATE_DISJOINT_BIT_KHR = 0x00000200;
    public static final int VK_FORMAT_FEATURE_MIDPOINT_CHROMA_SAMPLES_BIT_KHR = 0x00020000;
    public static final int VK_FORMAT_FEATURE_SAMPLED_IMAGE_YCBCR_CONVERSION_LINEAR_FILTER_BIT_KHR = 0x00040000;
    public static final int VK_FORMAT_FEATURE_SAMPLED_IMAGE_YCBCR_CONVERSION_SEPARATE_RECONSTRUCTION_FILTER_BIT_KHR = 0x00080000;
    public static final int VK_FORMAT_FEATURE_SAMPLED_IMAGE_YCBCR_CONVERSION_CHROMA_RECONSTRUCTION_EXPLICIT_BIT_KHR = 0x00100000;
    public static final int VK_FORMAT_FEATURE_SAMPLED_IMAGE_YCBCR_CONVERSION_CHROMA_RECONSTRUCTION_EXPLICIT_FORCEABLE_BIT_KHR = 0x00200000;
    public static final int VK_FORMAT_FEATURE_DISJOINT_BIT_KHR = 0x00400000;
    public static final int VK_FORMAT_FEATURE_COSITED_CHROMA_SAMPLES_BIT_KHR = 0x00800000;
    public static final int VK_SAMPLER_YCBCR_MODEL_CONVERSION_RGB_IDENTITY_KHR = 0;
    public static final int VK_SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_IDENTITY_KHR = 1;
    public static final int VK_SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_709_KHR = 2;
    public static final int VK_SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_601_KHR = 3;
    public static final int VK_SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_2020_KHR = 4;
    public static final int VK_SAMPLER_YCBCR_RANGE_ITU_FULL_KHR = 0;
    public static final int VK_SAMPLER_YCBCR_RANGE_ITU_NARROW_KHR = 1;
    public static final int VK_CHROMA_LOCATION_COSITED_EVEN_KHR = 0;
    public static final int VK_CHROMA_LOCATION_MIDPOINT_KHR = 1;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_SAMPLER_YCBCR_CONVERSION_EXT = 1000156000;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_SAMPLER_YCBCR_CONVERSION_KHR_EXT = 1000156000;
    public static final class Handles {
        public static final Supplier<MethodHandle> MH_vkCreateSamplerYcbcrConversionKHR = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_vkDestroySamplerYcbcrConversionKHR = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)));
        private Handles() {}
    }

    private VKKHRSamplerYcbcrConversion() {}

    /// Invokes `vkCreateSamplerYcbcrConversionKHR`.
    /// ```
    /// (int) VkResult vkCreateSamplerYcbcrConversionKHR((struct VkDevice*) VkDevice device, const VkSamplerYcbcrConversionCreateInfo* pCreateInfo, const VkAllocationCallbacks* pAllocator, VkSamplerYcbcrConversion* pYcbcrConversion);
    /// ```
    public static int vkCreateSamplerYcbcrConversionKHR(@NonNull VkDevice device, @NonNull MemorySegment pCreateInfo, @NonNull MemorySegment pAllocator, @NonNull MemorySegment pYcbcrConversion) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkCreateSamplerYcbcrConversionKHR)) throw new VKSymbolNotFoundError("Symbol not found: vkCreateSamplerYcbcrConversionKHR");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCreateSamplerYcbcrConversionKHR", device, pCreateInfo, pAllocator, pYcbcrConversion); }
        return (int) Handles.MH_vkCreateSamplerYcbcrConversionKHR.get().invokeExact(device.capabilities().PFN_vkCreateSamplerYcbcrConversionKHR, device.segment(), pCreateInfo, pAllocator, pYcbcrConversion); }
        catch (Throwable e) { throw new RuntimeException("error in vkCreateSamplerYcbcrConversionKHR", e); }
    }

    /// Invokes `vkDestroySamplerYcbcrConversionKHR`.
    /// ```
    /// void vkDestroySamplerYcbcrConversionKHR((struct VkDevice*) VkDevice device, (uint64_t) VkSamplerYcbcrConversion ycbcrConversion, const VkAllocationCallbacks* pAllocator);
    /// ```
    public static void vkDestroySamplerYcbcrConversionKHR(@NonNull VkDevice device, long ycbcrConversion, @NonNull MemorySegment pAllocator) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkDestroySamplerYcbcrConversionKHR)) throw new VKSymbolNotFoundError("Symbol not found: vkDestroySamplerYcbcrConversionKHR");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkDestroySamplerYcbcrConversionKHR", device, ycbcrConversion, pAllocator); }
        Handles.MH_vkDestroySamplerYcbcrConversionKHR.get().invokeExact(device.capabilities().PFN_vkDestroySamplerYcbcrConversionKHR, device.segment(), ycbcrConversion, pAllocator); }
        catch (Throwable e) { throw new RuntimeException("error in vkDestroySamplerYcbcrConversionKHR", e); }
    }

}
