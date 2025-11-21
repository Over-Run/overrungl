// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import static overrungl.internal.RuntimeHelper.*;
/// `VK_VERSION_1_3` - core API
public final class VK13 {
    public static final int VK_TOOL_PURPOSE_VALIDATION_BIT = 0x00000001;
    public static final int VK_TOOL_PURPOSE_VALIDATION_BIT_EXT = 0x00000001;
    public static final int VK_TOOL_PURPOSE_PROFILING_BIT = 0x00000002;
    public static final int VK_TOOL_PURPOSE_PROFILING_BIT_EXT = 0x00000002;
    public static final int VK_TOOL_PURPOSE_TRACING_BIT = 0x00000004;
    public static final int VK_TOOL_PURPOSE_TRACING_BIT_EXT = 0x00000004;
    public static final int VK_TOOL_PURPOSE_ADDITIONAL_FEATURES_BIT = 0x00000008;
    public static final int VK_TOOL_PURPOSE_ADDITIONAL_FEATURES_BIT_EXT = 0x00000008;
    public static final int VK_TOOL_PURPOSE_MODIFYING_FEATURES_BIT = 0x00000010;
    public static final int VK_TOOL_PURPOSE_MODIFYING_FEATURES_BIT_EXT = 0x00000010;
    public static final long VK_PIPELINE_STAGE_2_NONE = 0;
    public static final long VK_PIPELINE_STAGE_2_NONE_KHR = 0;
    public static final long VK_PIPELINE_STAGE_2_TOP_OF_PIPE_BIT = 0x00000001L;
    public static final long VK_PIPELINE_STAGE_2_TOP_OF_PIPE_BIT_KHR = 0x00000001L;
    public static final long VK_PIPELINE_STAGE_2_DRAW_INDIRECT_BIT = 0x00000002L;
    public static final long VK_PIPELINE_STAGE_2_DRAW_INDIRECT_BIT_KHR = 0x00000002L;
    public static final long VK_PIPELINE_STAGE_2_VERTEX_INPUT_BIT = 0x00000004L;
    public static final long VK_PIPELINE_STAGE_2_VERTEX_INPUT_BIT_KHR = 0x00000004L;
    public static final long VK_PIPELINE_STAGE_2_VERTEX_SHADER_BIT = 0x00000008L;
    public static final long VK_PIPELINE_STAGE_2_VERTEX_SHADER_BIT_KHR = 0x00000008L;
    public static final long VK_PIPELINE_STAGE_2_TESSELLATION_CONTROL_SHADER_BIT = 0x00000010L;
    public static final long VK_PIPELINE_STAGE_2_TESSELLATION_CONTROL_SHADER_BIT_KHR = 0x00000010L;
    public static final long VK_PIPELINE_STAGE_2_TESSELLATION_EVALUATION_SHADER_BIT = 0x00000020L;
    public static final long VK_PIPELINE_STAGE_2_TESSELLATION_EVALUATION_SHADER_BIT_KHR = 0x00000020L;
    public static final long VK_PIPELINE_STAGE_2_GEOMETRY_SHADER_BIT = 0x00000040L;
    public static final long VK_PIPELINE_STAGE_2_GEOMETRY_SHADER_BIT_KHR = 0x00000040L;
    public static final long VK_PIPELINE_STAGE_2_FRAGMENT_SHADER_BIT = 0x00000080L;
    public static final long VK_PIPELINE_STAGE_2_FRAGMENT_SHADER_BIT_KHR = 0x00000080L;
    public static final long VK_PIPELINE_STAGE_2_EARLY_FRAGMENT_TESTS_BIT = 0x00000100L;
    public static final long VK_PIPELINE_STAGE_2_EARLY_FRAGMENT_TESTS_BIT_KHR = 0x00000100L;
    public static final long VK_PIPELINE_STAGE_2_LATE_FRAGMENT_TESTS_BIT = 0x00000200L;
    public static final long VK_PIPELINE_STAGE_2_LATE_FRAGMENT_TESTS_BIT_KHR = 0x00000200L;
    public static final long VK_PIPELINE_STAGE_2_COLOR_ATTACHMENT_OUTPUT_BIT = 0x00000400L;
    public static final long VK_PIPELINE_STAGE_2_COLOR_ATTACHMENT_OUTPUT_BIT_KHR = 0x00000400L;
    public static final long VK_PIPELINE_STAGE_2_COMPUTE_SHADER_BIT = 0x00000800L;
    public static final long VK_PIPELINE_STAGE_2_COMPUTE_SHADER_BIT_KHR = 0x00000800L;
    public static final long VK_PIPELINE_STAGE_2_ALL_TRANSFER_BIT = 0x00001000L;
    public static final long VK_PIPELINE_STAGE_2_TRANSFER_BIT = 0x00001000L;
    public static final long VK_PIPELINE_STAGE_2_ALL_TRANSFER_BIT_KHR = 0x00001000L;
    public static final long VK_PIPELINE_STAGE_2_TRANSFER_BIT_KHR = 0x00001000L;
    public static final long VK_PIPELINE_STAGE_2_BOTTOM_OF_PIPE_BIT = 0x00002000L;
    public static final long VK_PIPELINE_STAGE_2_BOTTOM_OF_PIPE_BIT_KHR = 0x00002000L;
    public static final long VK_PIPELINE_STAGE_2_HOST_BIT = 0x00004000L;
    public static final long VK_PIPELINE_STAGE_2_HOST_BIT_KHR = 0x00004000L;
    public static final long VK_PIPELINE_STAGE_2_ALL_GRAPHICS_BIT = 0x00008000L;
    public static final long VK_PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR = 0x00008000L;
    public static final long VK_PIPELINE_STAGE_2_ALL_COMMANDS_BIT = 0x00010000L;
    public static final long VK_PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR = 0x00010000L;
    public static final long VK_PIPELINE_STAGE_2_COPY_BIT = 0x100000000L;
    public static final long VK_PIPELINE_STAGE_2_COPY_BIT_KHR = 0x100000000L;
    public static final long VK_PIPELINE_STAGE_2_RESOLVE_BIT = 0x200000000L;
    public static final long VK_PIPELINE_STAGE_2_RESOLVE_BIT_KHR = 0x200000000L;
    public static final long VK_PIPELINE_STAGE_2_BLIT_BIT = 0x400000000L;
    public static final long VK_PIPELINE_STAGE_2_BLIT_BIT_KHR = 0x400000000L;
    public static final long VK_PIPELINE_STAGE_2_CLEAR_BIT = 0x800000000L;
    public static final long VK_PIPELINE_STAGE_2_CLEAR_BIT_KHR = 0x800000000L;
    public static final long VK_PIPELINE_STAGE_2_INDEX_INPUT_BIT = 0x1000000000L;
    public static final long VK_PIPELINE_STAGE_2_INDEX_INPUT_BIT_KHR = 0x1000000000L;
    public static final long VK_PIPELINE_STAGE_2_VERTEX_ATTRIBUTE_INPUT_BIT = 0x2000000000L;
    public static final long VK_PIPELINE_STAGE_2_VERTEX_ATTRIBUTE_INPUT_BIT_KHR = 0x2000000000L;
    public static final long VK_PIPELINE_STAGE_2_PRE_RASTERIZATION_SHADERS_BIT = 0x4000000000L;
    public static final long VK_PIPELINE_STAGE_2_PRE_RASTERIZATION_SHADERS_BIT_KHR = 0x4000000000L;
    public static final long VK_ACCESS_2_NONE = 0;
    public static final long VK_ACCESS_2_NONE_KHR = 0;
    public static final long VK_ACCESS_2_INDIRECT_COMMAND_READ_BIT = 0x00000001L;
    public static final long VK_ACCESS_2_INDIRECT_COMMAND_READ_BIT_KHR = 0x00000001L;
    public static final long VK_ACCESS_2_INDEX_READ_BIT = 0x00000002L;
    public static final long VK_ACCESS_2_INDEX_READ_BIT_KHR = 0x00000002L;
    public static final long VK_ACCESS_2_VERTEX_ATTRIBUTE_READ_BIT = 0x00000004L;
    public static final long VK_ACCESS_2_VERTEX_ATTRIBUTE_READ_BIT_KHR = 0x00000004L;
    public static final long VK_ACCESS_2_UNIFORM_READ_BIT = 0x00000008L;
    public static final long VK_ACCESS_2_UNIFORM_READ_BIT_KHR = 0x00000008L;
    public static final long VK_ACCESS_2_INPUT_ATTACHMENT_READ_BIT = 0x00000010L;
    public static final long VK_ACCESS_2_INPUT_ATTACHMENT_READ_BIT_KHR = 0x00000010L;
    public static final long VK_ACCESS_2_SHADER_READ_BIT = 0x00000020L;
    public static final long VK_ACCESS_2_SHADER_READ_BIT_KHR = 0x00000020L;
    public static final long VK_ACCESS_2_SHADER_WRITE_BIT = 0x00000040L;
    public static final long VK_ACCESS_2_SHADER_WRITE_BIT_KHR = 0x00000040L;
    public static final long VK_ACCESS_2_COLOR_ATTACHMENT_READ_BIT = 0x00000080L;
    public static final long VK_ACCESS_2_COLOR_ATTACHMENT_READ_BIT_KHR = 0x00000080L;
    public static final long VK_ACCESS_2_COLOR_ATTACHMENT_WRITE_BIT = 0x00000100L;
    public static final long VK_ACCESS_2_COLOR_ATTACHMENT_WRITE_BIT_KHR = 0x00000100L;
    public static final long VK_ACCESS_2_DEPTH_STENCIL_ATTACHMENT_READ_BIT = 0x00000200L;
    public static final long VK_ACCESS_2_DEPTH_STENCIL_ATTACHMENT_READ_BIT_KHR = 0x00000200L;
    public static final long VK_ACCESS_2_DEPTH_STENCIL_ATTACHMENT_WRITE_BIT = 0x00000400L;
    public static final long VK_ACCESS_2_DEPTH_STENCIL_ATTACHMENT_WRITE_BIT_KHR = 0x00000400L;
    public static final long VK_ACCESS_2_TRANSFER_READ_BIT = 0x00000800L;
    public static final long VK_ACCESS_2_TRANSFER_READ_BIT_KHR = 0x00000800L;
    public static final long VK_ACCESS_2_TRANSFER_WRITE_BIT = 0x00001000L;
    public static final long VK_ACCESS_2_TRANSFER_WRITE_BIT_KHR = 0x00001000L;
    public static final long VK_ACCESS_2_HOST_READ_BIT = 0x00002000L;
    public static final long VK_ACCESS_2_HOST_READ_BIT_KHR = 0x00002000L;
    public static final long VK_ACCESS_2_HOST_WRITE_BIT = 0x00004000L;
    public static final long VK_ACCESS_2_HOST_WRITE_BIT_KHR = 0x00004000L;
    public static final long VK_ACCESS_2_MEMORY_READ_BIT = 0x00008000L;
    public static final long VK_ACCESS_2_MEMORY_READ_BIT_KHR = 0x00008000L;
    public static final long VK_ACCESS_2_MEMORY_WRITE_BIT = 0x00010000L;
    public static final long VK_ACCESS_2_MEMORY_WRITE_BIT_KHR = 0x00010000L;
    public static final long VK_ACCESS_2_SHADER_SAMPLED_READ_BIT = 0x100000000L;
    public static final long VK_ACCESS_2_SHADER_SAMPLED_READ_BIT_KHR = 0x100000000L;
    public static final long VK_ACCESS_2_SHADER_STORAGE_READ_BIT = 0x200000000L;
    public static final long VK_ACCESS_2_SHADER_STORAGE_READ_BIT_KHR = 0x200000000L;
    public static final long VK_ACCESS_2_SHADER_STORAGE_WRITE_BIT = 0x400000000L;
    public static final long VK_ACCESS_2_SHADER_STORAGE_WRITE_BIT_KHR = 0x400000000L;
    public static final int VK_SUBMIT_PROTECTED_BIT = 0x00000001;
    public static final int VK_SUBMIT_PROTECTED_BIT_KHR = 0x00000001;
    public static final long VK_FORMAT_FEATURE_2_SAMPLED_IMAGE_BIT = 0x00000001L;
    public static final long VK_FORMAT_FEATURE_2_SAMPLED_IMAGE_BIT_KHR = 0x00000001L;
    public static final long VK_FORMAT_FEATURE_2_STORAGE_IMAGE_BIT = 0x00000002L;
    public static final long VK_FORMAT_FEATURE_2_STORAGE_IMAGE_BIT_KHR = 0x00000002L;
    public static final long VK_FORMAT_FEATURE_2_STORAGE_IMAGE_ATOMIC_BIT = 0x00000004L;
    public static final long VK_FORMAT_FEATURE_2_STORAGE_IMAGE_ATOMIC_BIT_KHR = 0x00000004L;
    public static final long VK_FORMAT_FEATURE_2_UNIFORM_TEXEL_BUFFER_BIT = 0x00000008L;
    public static final long VK_FORMAT_FEATURE_2_UNIFORM_TEXEL_BUFFER_BIT_KHR = 0x00000008L;
    public static final long VK_FORMAT_FEATURE_2_STORAGE_TEXEL_BUFFER_BIT = 0x00000010L;
    public static final long VK_FORMAT_FEATURE_2_STORAGE_TEXEL_BUFFER_BIT_KHR = 0x00000010L;
    public static final long VK_FORMAT_FEATURE_2_STORAGE_TEXEL_BUFFER_ATOMIC_BIT = 0x00000020L;
    public static final long VK_FORMAT_FEATURE_2_STORAGE_TEXEL_BUFFER_ATOMIC_BIT_KHR = 0x00000020L;
    public static final long VK_FORMAT_FEATURE_2_VERTEX_BUFFER_BIT = 0x00000040L;
    public static final long VK_FORMAT_FEATURE_2_VERTEX_BUFFER_BIT_KHR = 0x00000040L;
    public static final long VK_FORMAT_FEATURE_2_COLOR_ATTACHMENT_BIT = 0x00000080L;
    public static final long VK_FORMAT_FEATURE_2_COLOR_ATTACHMENT_BIT_KHR = 0x00000080L;
    public static final long VK_FORMAT_FEATURE_2_COLOR_ATTACHMENT_BLEND_BIT = 0x00000100L;
    public static final long VK_FORMAT_FEATURE_2_COLOR_ATTACHMENT_BLEND_BIT_KHR = 0x00000100L;
    public static final long VK_FORMAT_FEATURE_2_DEPTH_STENCIL_ATTACHMENT_BIT = 0x00000200L;
    public static final long VK_FORMAT_FEATURE_2_DEPTH_STENCIL_ATTACHMENT_BIT_KHR = 0x00000200L;
    public static final long VK_FORMAT_FEATURE_2_BLIT_SRC_BIT = 0x00000400L;
    public static final long VK_FORMAT_FEATURE_2_BLIT_SRC_BIT_KHR = 0x00000400L;
    public static final long VK_FORMAT_FEATURE_2_BLIT_DST_BIT = 0x00000800L;
    public static final long VK_FORMAT_FEATURE_2_BLIT_DST_BIT_KHR = 0x00000800L;
    public static final long VK_FORMAT_FEATURE_2_SAMPLED_IMAGE_FILTER_LINEAR_BIT = 0x00001000L;
    public static final long VK_FORMAT_FEATURE_2_SAMPLED_IMAGE_FILTER_LINEAR_BIT_KHR = 0x00001000L;
    public static final long VK_FORMAT_FEATURE_2_TRANSFER_SRC_BIT = 0x00004000L;
    public static final long VK_FORMAT_FEATURE_2_TRANSFER_SRC_BIT_KHR = 0x00004000L;
    public static final long VK_FORMAT_FEATURE_2_TRANSFER_DST_BIT = 0x00008000L;
    public static final long VK_FORMAT_FEATURE_2_TRANSFER_DST_BIT_KHR = 0x00008000L;
    public static final long VK_FORMAT_FEATURE_2_SAMPLED_IMAGE_FILTER_MINMAX_BIT = 0x00010000L;
    public static final long VK_FORMAT_FEATURE_2_SAMPLED_IMAGE_FILTER_MINMAX_BIT_KHR = 0x00010000L;
    public static final long VK_FORMAT_FEATURE_2_MIDPOINT_CHROMA_SAMPLES_BIT = 0x00020000L;
    public static final long VK_FORMAT_FEATURE_2_MIDPOINT_CHROMA_SAMPLES_BIT_KHR = 0x00020000L;
    public static final long VK_FORMAT_FEATURE_2_SAMPLED_IMAGE_YCBCR_CONVERSION_LINEAR_FILTER_BIT = 0x00040000L;
    public static final long VK_FORMAT_FEATURE_2_SAMPLED_IMAGE_YCBCR_CONVERSION_LINEAR_FILTER_BIT_KHR = 0x00040000L;
    public static final long VK_FORMAT_FEATURE_2_SAMPLED_IMAGE_YCBCR_CONVERSION_SEPARATE_RECONSTRUCTION_FILTER_BIT = 0x00080000L;
    public static final long VK_FORMAT_FEATURE_2_SAMPLED_IMAGE_YCBCR_CONVERSION_SEPARATE_RECONSTRUCTION_FILTER_BIT_KHR = 0x00080000L;
    public static final long VK_FORMAT_FEATURE_2_SAMPLED_IMAGE_YCBCR_CONVERSION_CHROMA_RECONSTRUCTION_EXPLICIT_BIT = 0x00100000L;
    public static final long VK_FORMAT_FEATURE_2_SAMPLED_IMAGE_YCBCR_CONVERSION_CHROMA_RECONSTRUCTION_EXPLICIT_BIT_KHR = 0x00100000L;
    public static final long VK_FORMAT_FEATURE_2_SAMPLED_IMAGE_YCBCR_CONVERSION_CHROMA_RECONSTRUCTION_EXPLICIT_FORCEABLE_BIT = 0x00200000L;
    public static final long VK_FORMAT_FEATURE_2_SAMPLED_IMAGE_YCBCR_CONVERSION_CHROMA_RECONSTRUCTION_EXPLICIT_FORCEABLE_BIT_KHR = 0x00200000L;
    public static final long VK_FORMAT_FEATURE_2_DISJOINT_BIT = 0x00400000L;
    public static final long VK_FORMAT_FEATURE_2_DISJOINT_BIT_KHR = 0x00400000L;
    public static final long VK_FORMAT_FEATURE_2_COSITED_CHROMA_SAMPLES_BIT = 0x00800000L;
    public static final long VK_FORMAT_FEATURE_2_COSITED_CHROMA_SAMPLES_BIT_KHR = 0x00800000L;
    public static final long VK_FORMAT_FEATURE_2_STORAGE_READ_WITHOUT_FORMAT_BIT = 0x80000000L;
    public static final long VK_FORMAT_FEATURE_2_STORAGE_READ_WITHOUT_FORMAT_BIT_KHR = 0x80000000L;
    public static final long VK_FORMAT_FEATURE_2_STORAGE_WRITE_WITHOUT_FORMAT_BIT = 0x100000000L;
    public static final long VK_FORMAT_FEATURE_2_STORAGE_WRITE_WITHOUT_FORMAT_BIT_KHR = 0x100000000L;
    public static final long VK_FORMAT_FEATURE_2_SAMPLED_IMAGE_DEPTH_COMPARISON_BIT = 0x200000000L;
    public static final long VK_FORMAT_FEATURE_2_SAMPLED_IMAGE_DEPTH_COMPARISON_BIT_KHR = 0x200000000L;
    public static final int VK_PIPELINE_CREATION_FEEDBACK_VALID_BIT = 0x00000001;
    public static final int VK_PIPELINE_CREATION_FEEDBACK_VALID_BIT_EXT = 0x00000001;
    public static final int VK_PIPELINE_CREATION_FEEDBACK_APPLICATION_PIPELINE_CACHE_HIT_BIT = 0x00000002;
    public static final int VK_PIPELINE_CREATION_FEEDBACK_APPLICATION_PIPELINE_CACHE_HIT_BIT_EXT = 0x00000002;
    public static final int VK_PIPELINE_CREATION_FEEDBACK_BASE_PIPELINE_ACCELERATION_BIT = 0x00000004;
    public static final int VK_PIPELINE_CREATION_FEEDBACK_BASE_PIPELINE_ACCELERATION_BIT_EXT = 0x00000004;
    public static final int VK_RENDERING_CONTENTS_SECONDARY_COMMAND_BUFFERS_BIT = 0x00000001;
    public static final int VK_RENDERING_CONTENTS_SECONDARY_COMMAND_BUFFERS_BIT_KHR = 0x00000001;
    public static final int VK_RENDERING_SUSPENDING_BIT = 0x00000002;
    public static final int VK_RENDERING_SUSPENDING_BIT_KHR = 0x00000002;
    public static final int VK_RENDERING_RESUMING_BIT = 0x00000004;
    public static final int VK_RENDERING_RESUMING_BIT_KHR = 0x00000004;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_3_FEATURES = 53;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_3_PROPERTIES = 54;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TOOL_PROPERTIES = 1000245000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PRIVATE_DATA_FEATURES = 1000295000;
    public static final int VK_STRUCTURE_TYPE_DEVICE_PRIVATE_DATA_CREATE_INFO = 1000295001;
    public static final int VK_STRUCTURE_TYPE_PRIVATE_DATA_SLOT_CREATE_INFO = 1000295002;
    public static final int VK_STRUCTURE_TYPE_MEMORY_BARRIER_2 = 1000314000;
    public static final int VK_STRUCTURE_TYPE_BUFFER_MEMORY_BARRIER_2 = 1000314001;
    public static final int VK_STRUCTURE_TYPE_IMAGE_MEMORY_BARRIER_2 = 1000314002;
    public static final int VK_STRUCTURE_TYPE_DEPENDENCY_INFO = 1000314003;
    public static final int VK_STRUCTURE_TYPE_SUBMIT_INFO_2 = 1000314004;
    public static final int VK_STRUCTURE_TYPE_SEMAPHORE_SUBMIT_INFO = 1000314005;
    public static final int VK_STRUCTURE_TYPE_COMMAND_BUFFER_SUBMIT_INFO = 1000314006;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SYNCHRONIZATION_2_FEATURES = 1000314007;
    public static final int VK_STRUCTURE_TYPE_COPY_BUFFER_INFO_2 = 1000337000;
    public static final int VK_STRUCTURE_TYPE_COPY_IMAGE_INFO_2 = 1000337001;
    public static final int VK_STRUCTURE_TYPE_COPY_BUFFER_TO_IMAGE_INFO_2 = 1000337002;
    public static final int VK_STRUCTURE_TYPE_COPY_IMAGE_TO_BUFFER_INFO_2 = 1000337003;
    public static final int VK_STRUCTURE_TYPE_BUFFER_COPY_2 = 1000337006;
    public static final int VK_STRUCTURE_TYPE_IMAGE_COPY_2 = 1000337007;
    public static final int VK_STRUCTURE_TYPE_BUFFER_IMAGE_COPY_2 = 1000337009;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TEXTURE_COMPRESSION_ASTC_HDR_FEATURES = 1000066000;
    public static final int VK_STRUCTURE_TYPE_FORMAT_PROPERTIES_3 = 1000360000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_4_FEATURES = 1000413000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_4_PROPERTIES = 1000413001;
    public static final int VK_STRUCTURE_TYPE_DEVICE_BUFFER_MEMORY_REQUIREMENTS = 1000413002;
    public static final int VK_STRUCTURE_TYPE_DEVICE_IMAGE_MEMORY_REQUIREMENTS = 1000413003;
    public static final int VK_STRUCTURE_TYPE_PIPELINE_CREATION_FEEDBACK_CREATE_INFO = 1000192000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_TERMINATE_INVOCATION_FEATURES = 1000215000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_DEMOTE_TO_HELPER_INVOCATION_FEATURES = 1000276000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_CREATION_CACHE_CONTROL_FEATURES = 1000297000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_ZERO_INITIALIZE_WORKGROUP_MEMORY_FEATURES = 1000325000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_ROBUSTNESS_FEATURES = 1000335000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SUBGROUP_SIZE_CONTROL_PROPERTIES = 1000225000;
    public static final int VK_STRUCTURE_TYPE_PIPELINE_SHADER_STAGE_REQUIRED_SUBGROUP_SIZE_CREATE_INFO = 1000225001;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SUBGROUP_SIZE_CONTROL_FEATURES = 1000225002;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_INLINE_UNIFORM_BLOCK_FEATURES = 1000138000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_INLINE_UNIFORM_BLOCK_PROPERTIES = 1000138001;
    public static final int VK_STRUCTURE_TYPE_WRITE_DESCRIPTOR_SET_INLINE_UNIFORM_BLOCK = 1000138002;
    public static final int VK_STRUCTURE_TYPE_DESCRIPTOR_POOL_INLINE_UNIFORM_BLOCK_CREATE_INFO = 1000138003;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_INTEGER_DOT_PRODUCT_FEATURES = 1000280000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_INTEGER_DOT_PRODUCT_PROPERTIES = 1000280001;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TEXEL_BUFFER_ALIGNMENT_PROPERTIES = 1000281001;
    public static final int VK_STRUCTURE_TYPE_BLIT_IMAGE_INFO_2 = 1000337004;
    public static final int VK_STRUCTURE_TYPE_RESOLVE_IMAGE_INFO_2 = 1000337005;
    public static final int VK_STRUCTURE_TYPE_IMAGE_BLIT_2 = 1000337008;
    public static final int VK_STRUCTURE_TYPE_IMAGE_RESOLVE_2 = 1000337010;
    public static final int VK_STRUCTURE_TYPE_RENDERING_INFO = 1000044000;
    public static final int VK_STRUCTURE_TYPE_RENDERING_ATTACHMENT_INFO = 1000044001;
    public static final int VK_STRUCTURE_TYPE_PIPELINE_RENDERING_CREATE_INFO = 1000044002;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DYNAMIC_RENDERING_FEATURES = 1000044003;
    public static final int VK_STRUCTURE_TYPE_COMMAND_BUFFER_INHERITANCE_RENDERING_INFO = 1000044004;
    public static final int VK_OBJECT_TYPE_PRIVATE_DATA_SLOT = 1000295000;
    public static final int VK_IMAGE_LAYOUT_READ_ONLY_OPTIMAL = 1000314000;
    public static final int VK_IMAGE_LAYOUT_ATTACHMENT_OPTIMAL = 1000314001;
    public static final int VK_PIPELINE_STAGE_NONE = 0;
    public static final int VK_ACCESS_NONE = 0;
    public static final int VK_FORMAT_G8_B8R8_2PLANE_444_UNORM = 1000330000;
    public static final int VK_FORMAT_G10X6_B10X6R10X6_2PLANE_444_UNORM_3PACK16 = 1000330001;
    public static final int VK_FORMAT_G12X4_B12X4R12X4_2PLANE_444_UNORM_3PACK16 = 1000330002;
    public static final int VK_FORMAT_G16_B16R16_2PLANE_444_UNORM = 1000330003;
    public static final int VK_FORMAT_A4R4G4B4_UNORM_PACK16 = 1000340000;
    public static final int VK_FORMAT_A4B4G4R4_UNORM_PACK16 = 1000340001;
    public static final int VK_FORMAT_ASTC_4x4_SFLOAT_BLOCK = 1000066000;
    public static final int VK_FORMAT_ASTC_5x4_SFLOAT_BLOCK = 1000066001;
    public static final int VK_FORMAT_ASTC_5x5_SFLOAT_BLOCK = 1000066002;
    public static final int VK_FORMAT_ASTC_6x5_SFLOAT_BLOCK = 1000066003;
    public static final int VK_FORMAT_ASTC_6x6_SFLOAT_BLOCK = 1000066004;
    public static final int VK_FORMAT_ASTC_8x5_SFLOAT_BLOCK = 1000066005;
    public static final int VK_FORMAT_ASTC_8x6_SFLOAT_BLOCK = 1000066006;
    public static final int VK_FORMAT_ASTC_8x8_SFLOAT_BLOCK = 1000066007;
    public static final int VK_FORMAT_ASTC_10x5_SFLOAT_BLOCK = 1000066008;
    public static final int VK_FORMAT_ASTC_10x6_SFLOAT_BLOCK = 1000066009;
    public static final int VK_FORMAT_ASTC_10x8_SFLOAT_BLOCK = 1000066010;
    public static final int VK_FORMAT_ASTC_10x10_SFLOAT_BLOCK = 1000066011;
    public static final int VK_FORMAT_ASTC_12x10_SFLOAT_BLOCK = 1000066012;
    public static final int VK_FORMAT_ASTC_12x12_SFLOAT_BLOCK = 1000066013;
    public static final long VK_FORMAT_FEATURE_2_SAMPLED_IMAGE_FILTER_CUBIC_BIT = 0x00002000L;
    public static final int VK_IMAGE_ASPECT_NONE = 0;
    public static final int VK_PIPELINE_CREATE_FAIL_ON_PIPELINE_COMPILE_REQUIRED_BIT = 0x00000100;
    public static final int VK_PIPELINE_CREATE_EARLY_RETURN_ON_FAILURE_BIT = 0x00000200;
    public static final int VK_PIPELINE_COMPILE_REQUIRED = 1000297000;
    public static final int VK_PIPELINE_CACHE_CREATE_EXTERNALLY_SYNCHRONIZED_BIT = 0x00000001;
    public static final int VK_EVENT_CREATE_DEVICE_ONLY_BIT = 0x00000001;
    public static final int VK_PIPELINE_SHADER_STAGE_CREATE_ALLOW_VARYING_SUBGROUP_SIZE_BIT = 0x00000001;
    public static final int VK_PIPELINE_SHADER_STAGE_CREATE_REQUIRE_FULL_SUBGROUPS_BIT = 0x00000002;
    public static final int VK_DESCRIPTOR_TYPE_INLINE_UNIFORM_BLOCK = 1000138000;
    public static final int VK_ATTACHMENT_STORE_OP_NONE = 1000301000;
    public static final int VK_DYNAMIC_STATE_CULL_MODE = 1000267000;
    public static final int VK_DYNAMIC_STATE_FRONT_FACE = 1000267001;
    public static final int VK_DYNAMIC_STATE_PRIMITIVE_TOPOLOGY = 1000267002;
    public static final int VK_DYNAMIC_STATE_VIEWPORT_WITH_COUNT = 1000267003;
    public static final int VK_DYNAMIC_STATE_SCISSOR_WITH_COUNT = 1000267004;
    public static final int VK_DYNAMIC_STATE_VERTEX_INPUT_BINDING_STRIDE = 1000267005;
    public static final int VK_DYNAMIC_STATE_DEPTH_TEST_ENABLE = 1000267006;
    public static final int VK_DYNAMIC_STATE_DEPTH_WRITE_ENABLE = 1000267007;
    public static final int VK_DYNAMIC_STATE_DEPTH_COMPARE_OP = 1000267008;
    public static final int VK_DYNAMIC_STATE_DEPTH_BOUNDS_TEST_ENABLE = 1000267009;
    public static final int VK_DYNAMIC_STATE_STENCIL_TEST_ENABLE = 1000267010;
    public static final int VK_DYNAMIC_STATE_STENCIL_OP = 1000267011;
    public static final int VK_DYNAMIC_STATE_RASTERIZER_DISCARD_ENABLE = 1000377001;
    public static final int VK_DYNAMIC_STATE_DEPTH_BIAS_ENABLE = 1000377002;
    public static final int VK_DYNAMIC_STATE_PRIMITIVE_RESTART_ENABLE = 1000377004;
    public static final int VK_API_VERSION_1_3 = VK10.VK_MAKE_API_VERSION(0, 1, 3, 0);
    private VK13() {}
    public static final class Handles {
        public static final MethodHandle MH_vkGetPhysicalDeviceToolProperties = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCreatePrivateDataSlot = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkDestroyPrivateDataSlot = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkSetPrivateData = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG));
        public static final MethodHandle MH_vkGetPrivateData = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdPipelineBarrier2 = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdWriteTimestamp2 = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_vkQueueSubmit2 = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG));
        public static final MethodHandle MH_vkCmdCopyBuffer2 = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdCopyImage2 = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdCopyBufferToImage2 = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdCopyImageToBuffer2 = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetDeviceBufferMemoryRequirements = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetDeviceImageMemoryRequirements = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetDeviceImageSparseMemoryRequirements = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdSetEvent2 = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdResetEvent2 = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG));
        public static final MethodHandle MH_vkCmdWaitEvents2 = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdBlitImage2 = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdResolveImage2 = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdBeginRendering = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdEndRendering = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdSetCullMode = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_vkCmdSetFrontFace = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_vkCmdSetPrimitiveTopology = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_vkCmdSetViewportWithCount = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdSetScissorWithCount = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdBindVertexBuffers2 = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdSetDepthTestEnable = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_vkCmdSetDepthWriteEnable = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_vkCmdSetDepthCompareOp = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_vkCmdSetDepthBoundsTestEnable = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_vkCmdSetStencilTestEnable = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_vkCmdSetStencilOp = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_vkCmdSetRasterizerDiscardEnable = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_vkCmdSetDepthBiasEnable = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_vkCmdSetPrimitiveRestartEnable = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        private Handles() {}
    }

    /// Invokes `vkGetPhysicalDeviceToolProperties`.
    /// ```
    /// VkResult vkGetPhysicalDeviceToolProperties(VkPhysicalDevice physicalDevice, uint32_t* pToolCount, VkPhysicalDeviceToolProperties* pToolProperties);
    /// ```
    public static int vkGetPhysicalDeviceToolProperties(@NonNull VkPhysicalDevice physicalDevice, @NonNull MemorySegment pToolCount, @NonNull MemorySegment pToolProperties) {
        if (MemoryUtil.isNullPointer(physicalDevice.capabilities().PFN_vkGetPhysicalDeviceToolProperties)) throw new VKSymbolNotFoundError("Symbol not found: vkGetPhysicalDeviceToolProperties");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkGetPhysicalDeviceToolProperties", physicalDevice, pToolCount, pToolProperties); }
        return (int) Handles.MH_vkGetPhysicalDeviceToolProperties.invokeExact(physicalDevice.capabilities().PFN_vkGetPhysicalDeviceToolProperties, physicalDevice.segment(), pToolCount, pToolProperties); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetPhysicalDeviceToolProperties", e); }
    }

    /// Invokes `vkCreatePrivateDataSlot`.
    /// ```
    /// VkResult vkCreatePrivateDataSlot(VkDevice device, const VkPrivateDataSlotCreateInfo* pCreateInfo, const VkAllocationCallbacks* pAllocator, VkPrivateDataSlot* pPrivateDataSlot);
    /// ```
    public static int vkCreatePrivateDataSlot(@NonNull VkDevice device, @NonNull MemorySegment pCreateInfo, @NonNull MemorySegment pAllocator, @NonNull MemorySegment pPrivateDataSlot) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkCreatePrivateDataSlot)) throw new VKSymbolNotFoundError("Symbol not found: vkCreatePrivateDataSlot");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCreatePrivateDataSlot", device, pCreateInfo, pAllocator, pPrivateDataSlot); }
        return (int) Handles.MH_vkCreatePrivateDataSlot.invokeExact(device.capabilities().PFN_vkCreatePrivateDataSlot, device.segment(), pCreateInfo, pAllocator, pPrivateDataSlot); }
        catch (Throwable e) { throw new RuntimeException("error in vkCreatePrivateDataSlot", e); }
    }

    /// Invokes `vkDestroyPrivateDataSlot`.
    /// ```
    /// void vkDestroyPrivateDataSlot(VkDevice device, VkPrivateDataSlot privateDataSlot, const VkAllocationCallbacks* pAllocator);
    /// ```
    public static void vkDestroyPrivateDataSlot(@NonNull VkDevice device, long privateDataSlot, @NonNull MemorySegment pAllocator) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkDestroyPrivateDataSlot)) throw new VKSymbolNotFoundError("Symbol not found: vkDestroyPrivateDataSlot");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkDestroyPrivateDataSlot", device, privateDataSlot, pAllocator); }
        Handles.MH_vkDestroyPrivateDataSlot.invokeExact(device.capabilities().PFN_vkDestroyPrivateDataSlot, device.segment(), privateDataSlot, pAllocator); }
        catch (Throwable e) { throw new RuntimeException("error in vkDestroyPrivateDataSlot", e); }
    }

    /// Invokes `vkSetPrivateData`.
    /// ```
    /// VkResult vkSetPrivateData(VkDevice device, VkObjectType objectType, uint64_t objectHandle, VkPrivateDataSlot privateDataSlot, uint64_t data);
    /// ```
    public static int vkSetPrivateData(@NonNull VkDevice device, int objectType, long objectHandle, long privateDataSlot, long data) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkSetPrivateData)) throw new VKSymbolNotFoundError("Symbol not found: vkSetPrivateData");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkSetPrivateData", device, objectType, objectHandle, privateDataSlot, data); }
        return (int) Handles.MH_vkSetPrivateData.invokeExact(device.capabilities().PFN_vkSetPrivateData, device.segment(), objectType, objectHandle, privateDataSlot, data); }
        catch (Throwable e) { throw new RuntimeException("error in vkSetPrivateData", e); }
    }

    /// Invokes `vkGetPrivateData`.
    /// ```
    /// void vkGetPrivateData(VkDevice device, VkObjectType objectType, uint64_t objectHandle, VkPrivateDataSlot privateDataSlot, uint64_t* pData);
    /// ```
    public static void vkGetPrivateData(@NonNull VkDevice device, int objectType, long objectHandle, long privateDataSlot, @NonNull MemorySegment pData) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkGetPrivateData)) throw new VKSymbolNotFoundError("Symbol not found: vkGetPrivateData");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkGetPrivateData", device, objectType, objectHandle, privateDataSlot, pData); }
        Handles.MH_vkGetPrivateData.invokeExact(device.capabilities().PFN_vkGetPrivateData, device.segment(), objectType, objectHandle, privateDataSlot, pData); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetPrivateData", e); }
    }

    /// Invokes `vkCmdPipelineBarrier2`.
    /// ```
    /// void vkCmdPipelineBarrier2(VkCommandBuffer commandBuffer, const VkDependencyInfo* pDependencyInfo);
    /// ```
    public static void vkCmdPipelineBarrier2(@NonNull VkCommandBuffer commandBuffer, @NonNull MemorySegment pDependencyInfo) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdPipelineBarrier2)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdPipelineBarrier2");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdPipelineBarrier2", commandBuffer, pDependencyInfo); }
        Handles.MH_vkCmdPipelineBarrier2.invokeExact(commandBuffer.capabilities().PFN_vkCmdPipelineBarrier2, commandBuffer.segment(), pDependencyInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdPipelineBarrier2", e); }
    }

    /// Invokes `vkCmdWriteTimestamp2`.
    /// ```
    /// void vkCmdWriteTimestamp2(VkCommandBuffer commandBuffer, VkPipelineStageFlags2 stage, VkQueryPool queryPool, uint32_t query);
    /// ```
    public static void vkCmdWriteTimestamp2(@NonNull VkCommandBuffer commandBuffer, long stage, long queryPool, int query) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdWriteTimestamp2)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdWriteTimestamp2");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdWriteTimestamp2", commandBuffer, stage, queryPool, query); }
        Handles.MH_vkCmdWriteTimestamp2.invokeExact(commandBuffer.capabilities().PFN_vkCmdWriteTimestamp2, commandBuffer.segment(), stage, queryPool, query); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdWriteTimestamp2", e); }
    }

    /// Invokes `vkQueueSubmit2`.
    /// ```
    /// VkResult vkQueueSubmit2(VkQueue queue, uint32_t submitCount, const VkSubmitInfo2* pSubmits, VkFence fence);
    /// ```
    public static int vkQueueSubmit2(@NonNull VkQueue queue, int submitCount, @NonNull MemorySegment pSubmits, long fence) {
        if (MemoryUtil.isNullPointer(queue.capabilities().PFN_vkQueueSubmit2)) throw new VKSymbolNotFoundError("Symbol not found: vkQueueSubmit2");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkQueueSubmit2", queue, submitCount, pSubmits, fence); }
        return (int) Handles.MH_vkQueueSubmit2.invokeExact(queue.capabilities().PFN_vkQueueSubmit2, queue.segment(), submitCount, pSubmits, fence); }
        catch (Throwable e) { throw new RuntimeException("error in vkQueueSubmit2", e); }
    }

    /// Invokes `vkCmdCopyBuffer2`.
    /// ```
    /// void vkCmdCopyBuffer2(VkCommandBuffer commandBuffer, const VkCopyBufferInfo2* pCopyBufferInfo);
    /// ```
    public static void vkCmdCopyBuffer2(@NonNull VkCommandBuffer commandBuffer, @NonNull MemorySegment pCopyBufferInfo) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdCopyBuffer2)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdCopyBuffer2");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdCopyBuffer2", commandBuffer, pCopyBufferInfo); }
        Handles.MH_vkCmdCopyBuffer2.invokeExact(commandBuffer.capabilities().PFN_vkCmdCopyBuffer2, commandBuffer.segment(), pCopyBufferInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdCopyBuffer2", e); }
    }

    /// Invokes `vkCmdCopyImage2`.
    /// ```
    /// void vkCmdCopyImage2(VkCommandBuffer commandBuffer, const VkCopyImageInfo2* pCopyImageInfo);
    /// ```
    public static void vkCmdCopyImage2(@NonNull VkCommandBuffer commandBuffer, @NonNull MemorySegment pCopyImageInfo) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdCopyImage2)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdCopyImage2");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdCopyImage2", commandBuffer, pCopyImageInfo); }
        Handles.MH_vkCmdCopyImage2.invokeExact(commandBuffer.capabilities().PFN_vkCmdCopyImage2, commandBuffer.segment(), pCopyImageInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdCopyImage2", e); }
    }

    /// Invokes `vkCmdCopyBufferToImage2`.
    /// ```
    /// void vkCmdCopyBufferToImage2(VkCommandBuffer commandBuffer, const VkCopyBufferToImageInfo2* pCopyBufferToImageInfo);
    /// ```
    public static void vkCmdCopyBufferToImage2(@NonNull VkCommandBuffer commandBuffer, @NonNull MemorySegment pCopyBufferToImageInfo) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdCopyBufferToImage2)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdCopyBufferToImage2");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdCopyBufferToImage2", commandBuffer, pCopyBufferToImageInfo); }
        Handles.MH_vkCmdCopyBufferToImage2.invokeExact(commandBuffer.capabilities().PFN_vkCmdCopyBufferToImage2, commandBuffer.segment(), pCopyBufferToImageInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdCopyBufferToImage2", e); }
    }

    /// Invokes `vkCmdCopyImageToBuffer2`.
    /// ```
    /// void vkCmdCopyImageToBuffer2(VkCommandBuffer commandBuffer, const VkCopyImageToBufferInfo2* pCopyImageToBufferInfo);
    /// ```
    public static void vkCmdCopyImageToBuffer2(@NonNull VkCommandBuffer commandBuffer, @NonNull MemorySegment pCopyImageToBufferInfo) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdCopyImageToBuffer2)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdCopyImageToBuffer2");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdCopyImageToBuffer2", commandBuffer, pCopyImageToBufferInfo); }
        Handles.MH_vkCmdCopyImageToBuffer2.invokeExact(commandBuffer.capabilities().PFN_vkCmdCopyImageToBuffer2, commandBuffer.segment(), pCopyImageToBufferInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdCopyImageToBuffer2", e); }
    }

    /// Invokes `vkGetDeviceBufferMemoryRequirements`.
    /// ```
    /// void vkGetDeviceBufferMemoryRequirements(VkDevice device, const VkDeviceBufferMemoryRequirements* pInfo, VkMemoryRequirements2* pMemoryRequirements);
    /// ```
    public static void vkGetDeviceBufferMemoryRequirements(@NonNull VkDevice device, @NonNull MemorySegment pInfo, @NonNull MemorySegment pMemoryRequirements) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkGetDeviceBufferMemoryRequirements)) throw new VKSymbolNotFoundError("Symbol not found: vkGetDeviceBufferMemoryRequirements");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkGetDeviceBufferMemoryRequirements", device, pInfo, pMemoryRequirements); }
        Handles.MH_vkGetDeviceBufferMemoryRequirements.invokeExact(device.capabilities().PFN_vkGetDeviceBufferMemoryRequirements, device.segment(), pInfo, pMemoryRequirements); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetDeviceBufferMemoryRequirements", e); }
    }

    /// Invokes `vkGetDeviceImageMemoryRequirements`.
    /// ```
    /// void vkGetDeviceImageMemoryRequirements(VkDevice device, const VkDeviceImageMemoryRequirements* pInfo, VkMemoryRequirements2* pMemoryRequirements);
    /// ```
    public static void vkGetDeviceImageMemoryRequirements(@NonNull VkDevice device, @NonNull MemorySegment pInfo, @NonNull MemorySegment pMemoryRequirements) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkGetDeviceImageMemoryRequirements)) throw new VKSymbolNotFoundError("Symbol not found: vkGetDeviceImageMemoryRequirements");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkGetDeviceImageMemoryRequirements", device, pInfo, pMemoryRequirements); }
        Handles.MH_vkGetDeviceImageMemoryRequirements.invokeExact(device.capabilities().PFN_vkGetDeviceImageMemoryRequirements, device.segment(), pInfo, pMemoryRequirements); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetDeviceImageMemoryRequirements", e); }
    }

    /// Invokes `vkGetDeviceImageSparseMemoryRequirements`.
    /// ```
    /// void vkGetDeviceImageSparseMemoryRequirements(VkDevice device, const VkDeviceImageMemoryRequirements* pInfo, uint32_t* pSparseMemoryRequirementCount, VkSparseImageMemoryRequirements2* pSparseMemoryRequirements);
    /// ```
    public static void vkGetDeviceImageSparseMemoryRequirements(@NonNull VkDevice device, @NonNull MemorySegment pInfo, @NonNull MemorySegment pSparseMemoryRequirementCount, @NonNull MemorySegment pSparseMemoryRequirements) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkGetDeviceImageSparseMemoryRequirements)) throw new VKSymbolNotFoundError("Symbol not found: vkGetDeviceImageSparseMemoryRequirements");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkGetDeviceImageSparseMemoryRequirements", device, pInfo, pSparseMemoryRequirementCount, pSparseMemoryRequirements); }
        Handles.MH_vkGetDeviceImageSparseMemoryRequirements.invokeExact(device.capabilities().PFN_vkGetDeviceImageSparseMemoryRequirements, device.segment(), pInfo, pSparseMemoryRequirementCount, pSparseMemoryRequirements); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetDeviceImageSparseMemoryRequirements", e); }
    }

    /// Invokes `vkCmdSetEvent2`.
    /// ```
    /// void vkCmdSetEvent2(VkCommandBuffer commandBuffer, VkEvent event, const VkDependencyInfo* pDependencyInfo);
    /// ```
    public static void vkCmdSetEvent2(@NonNull VkCommandBuffer commandBuffer, long event, @NonNull MemorySegment pDependencyInfo) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetEvent2)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdSetEvent2");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdSetEvent2", commandBuffer, event, pDependencyInfo); }
        Handles.MH_vkCmdSetEvent2.invokeExact(commandBuffer.capabilities().PFN_vkCmdSetEvent2, commandBuffer.segment(), event, pDependencyInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetEvent2", e); }
    }

    /// Invokes `vkCmdResetEvent2`.
    /// ```
    /// void vkCmdResetEvent2(VkCommandBuffer commandBuffer, VkEvent event, VkPipelineStageFlags2 stageMask);
    /// ```
    public static void vkCmdResetEvent2(@NonNull VkCommandBuffer commandBuffer, long event, long stageMask) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdResetEvent2)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdResetEvent2");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdResetEvent2", commandBuffer, event, stageMask); }
        Handles.MH_vkCmdResetEvent2.invokeExact(commandBuffer.capabilities().PFN_vkCmdResetEvent2, commandBuffer.segment(), event, stageMask); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdResetEvent2", e); }
    }

    /// Invokes `vkCmdWaitEvents2`.
    /// ```
    /// void vkCmdWaitEvents2(VkCommandBuffer commandBuffer, uint32_t eventCount, const VkEvent* pEvents, const VkDependencyInfo* pDependencyInfos);
    /// ```
    public static void vkCmdWaitEvents2(@NonNull VkCommandBuffer commandBuffer, int eventCount, @NonNull MemorySegment pEvents, @NonNull MemorySegment pDependencyInfos) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdWaitEvents2)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdWaitEvents2");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdWaitEvents2", commandBuffer, eventCount, pEvents, pDependencyInfos); }
        Handles.MH_vkCmdWaitEvents2.invokeExact(commandBuffer.capabilities().PFN_vkCmdWaitEvents2, commandBuffer.segment(), eventCount, pEvents, pDependencyInfos); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdWaitEvents2", e); }
    }

    /// Invokes `vkCmdBlitImage2`.
    /// ```
    /// void vkCmdBlitImage2(VkCommandBuffer commandBuffer, const VkBlitImageInfo2* pBlitImageInfo);
    /// ```
    public static void vkCmdBlitImage2(@NonNull VkCommandBuffer commandBuffer, @NonNull MemorySegment pBlitImageInfo) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdBlitImage2)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdBlitImage2");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdBlitImage2", commandBuffer, pBlitImageInfo); }
        Handles.MH_vkCmdBlitImage2.invokeExact(commandBuffer.capabilities().PFN_vkCmdBlitImage2, commandBuffer.segment(), pBlitImageInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdBlitImage2", e); }
    }

    /// Invokes `vkCmdResolveImage2`.
    /// ```
    /// void vkCmdResolveImage2(VkCommandBuffer commandBuffer, const VkResolveImageInfo2* pResolveImageInfo);
    /// ```
    public static void vkCmdResolveImage2(@NonNull VkCommandBuffer commandBuffer, @NonNull MemorySegment pResolveImageInfo) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdResolveImage2)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdResolveImage2");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdResolveImage2", commandBuffer, pResolveImageInfo); }
        Handles.MH_vkCmdResolveImage2.invokeExact(commandBuffer.capabilities().PFN_vkCmdResolveImage2, commandBuffer.segment(), pResolveImageInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdResolveImage2", e); }
    }

    /// Invokes `vkCmdBeginRendering`.
    /// ```
    /// void vkCmdBeginRendering(VkCommandBuffer commandBuffer, const VkRenderingInfo* pRenderingInfo);
    /// ```
    public static void vkCmdBeginRendering(@NonNull VkCommandBuffer commandBuffer, @NonNull MemorySegment pRenderingInfo) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdBeginRendering)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdBeginRendering");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdBeginRendering", commandBuffer, pRenderingInfo); }
        Handles.MH_vkCmdBeginRendering.invokeExact(commandBuffer.capabilities().PFN_vkCmdBeginRendering, commandBuffer.segment(), pRenderingInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdBeginRendering", e); }
    }

    /// Invokes `vkCmdEndRendering`.
    /// ```
    /// void vkCmdEndRendering(VkCommandBuffer commandBuffer);
    /// ```
    public static void vkCmdEndRendering(@NonNull VkCommandBuffer commandBuffer) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdEndRendering)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdEndRendering");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdEndRendering", commandBuffer); }
        Handles.MH_vkCmdEndRendering.invokeExact(commandBuffer.capabilities().PFN_vkCmdEndRendering, commandBuffer.segment()); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdEndRendering", e); }
    }

    /// Invokes `vkCmdSetCullMode`.
    /// ```
    /// void vkCmdSetCullMode(VkCommandBuffer commandBuffer, VkCullModeFlags cullMode);
    /// ```
    public static void vkCmdSetCullMode(@NonNull VkCommandBuffer commandBuffer, int cullMode) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetCullMode)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdSetCullMode");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdSetCullMode", commandBuffer, cullMode); }
        Handles.MH_vkCmdSetCullMode.invokeExact(commandBuffer.capabilities().PFN_vkCmdSetCullMode, commandBuffer.segment(), cullMode); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetCullMode", e); }
    }

    /// Invokes `vkCmdSetFrontFace`.
    /// ```
    /// void vkCmdSetFrontFace(VkCommandBuffer commandBuffer, VkFrontFace frontFace);
    /// ```
    public static void vkCmdSetFrontFace(@NonNull VkCommandBuffer commandBuffer, int frontFace) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetFrontFace)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdSetFrontFace");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdSetFrontFace", commandBuffer, frontFace); }
        Handles.MH_vkCmdSetFrontFace.invokeExact(commandBuffer.capabilities().PFN_vkCmdSetFrontFace, commandBuffer.segment(), frontFace); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetFrontFace", e); }
    }

    /// Invokes `vkCmdSetPrimitiveTopology`.
    /// ```
    /// void vkCmdSetPrimitiveTopology(VkCommandBuffer commandBuffer, VkPrimitiveTopology primitiveTopology);
    /// ```
    public static void vkCmdSetPrimitiveTopology(@NonNull VkCommandBuffer commandBuffer, int primitiveTopology) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetPrimitiveTopology)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdSetPrimitiveTopology");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdSetPrimitiveTopology", commandBuffer, primitiveTopology); }
        Handles.MH_vkCmdSetPrimitiveTopology.invokeExact(commandBuffer.capabilities().PFN_vkCmdSetPrimitiveTopology, commandBuffer.segment(), primitiveTopology); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetPrimitiveTopology", e); }
    }

    /// Invokes `vkCmdSetViewportWithCount`.
    /// ```
    /// void vkCmdSetViewportWithCount(VkCommandBuffer commandBuffer, uint32_t viewportCount, const VkViewport* pViewports);
    /// ```
    public static void vkCmdSetViewportWithCount(@NonNull VkCommandBuffer commandBuffer, int viewportCount, @NonNull MemorySegment pViewports) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetViewportWithCount)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdSetViewportWithCount");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdSetViewportWithCount", commandBuffer, viewportCount, pViewports); }
        Handles.MH_vkCmdSetViewportWithCount.invokeExact(commandBuffer.capabilities().PFN_vkCmdSetViewportWithCount, commandBuffer.segment(), viewportCount, pViewports); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetViewportWithCount", e); }
    }

    /// Invokes `vkCmdSetScissorWithCount`.
    /// ```
    /// void vkCmdSetScissorWithCount(VkCommandBuffer commandBuffer, uint32_t scissorCount, const VkRect2D* pScissors);
    /// ```
    public static void vkCmdSetScissorWithCount(@NonNull VkCommandBuffer commandBuffer, int scissorCount, @NonNull MemorySegment pScissors) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetScissorWithCount)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdSetScissorWithCount");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdSetScissorWithCount", commandBuffer, scissorCount, pScissors); }
        Handles.MH_vkCmdSetScissorWithCount.invokeExact(commandBuffer.capabilities().PFN_vkCmdSetScissorWithCount, commandBuffer.segment(), scissorCount, pScissors); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetScissorWithCount", e); }
    }

    /// Invokes `vkCmdBindVertexBuffers2`.
    /// ```
    /// void vkCmdBindVertexBuffers2(VkCommandBuffer commandBuffer, uint32_t firstBinding, uint32_t bindingCount, const VkBuffer* pBuffers, const VkDeviceSize* pOffsets, const VkDeviceSize* pSizes, const VkDeviceSize* pStrides);
    /// ```
    public static void vkCmdBindVertexBuffers2(@NonNull VkCommandBuffer commandBuffer, int firstBinding, int bindingCount, @NonNull MemorySegment pBuffers, @NonNull MemorySegment pOffsets, @NonNull MemorySegment pSizes, @NonNull MemorySegment pStrides) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdBindVertexBuffers2)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdBindVertexBuffers2");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdBindVertexBuffers2", commandBuffer, firstBinding, bindingCount, pBuffers, pOffsets, pSizes, pStrides); }
        Handles.MH_vkCmdBindVertexBuffers2.invokeExact(commandBuffer.capabilities().PFN_vkCmdBindVertexBuffers2, commandBuffer.segment(), firstBinding, bindingCount, pBuffers, pOffsets, pSizes, pStrides); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdBindVertexBuffers2", e); }
    }

    /// Invokes `vkCmdSetDepthTestEnable`.
    /// ```
    /// void vkCmdSetDepthTestEnable(VkCommandBuffer commandBuffer, VkBool32 depthTestEnable);
    /// ```
    public static void vkCmdSetDepthTestEnable(@NonNull VkCommandBuffer commandBuffer, int depthTestEnable) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetDepthTestEnable)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdSetDepthTestEnable");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdSetDepthTestEnable", commandBuffer, depthTestEnable); }
        Handles.MH_vkCmdSetDepthTestEnable.invokeExact(commandBuffer.capabilities().PFN_vkCmdSetDepthTestEnable, commandBuffer.segment(), depthTestEnable); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetDepthTestEnable", e); }
    }

    /// Invokes `vkCmdSetDepthWriteEnable`.
    /// ```
    /// void vkCmdSetDepthWriteEnable(VkCommandBuffer commandBuffer, VkBool32 depthWriteEnable);
    /// ```
    public static void vkCmdSetDepthWriteEnable(@NonNull VkCommandBuffer commandBuffer, int depthWriteEnable) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetDepthWriteEnable)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdSetDepthWriteEnable");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdSetDepthWriteEnable", commandBuffer, depthWriteEnable); }
        Handles.MH_vkCmdSetDepthWriteEnable.invokeExact(commandBuffer.capabilities().PFN_vkCmdSetDepthWriteEnable, commandBuffer.segment(), depthWriteEnable); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetDepthWriteEnable", e); }
    }

    /// Invokes `vkCmdSetDepthCompareOp`.
    /// ```
    /// void vkCmdSetDepthCompareOp(VkCommandBuffer commandBuffer, VkCompareOp depthCompareOp);
    /// ```
    public static void vkCmdSetDepthCompareOp(@NonNull VkCommandBuffer commandBuffer, int depthCompareOp) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetDepthCompareOp)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdSetDepthCompareOp");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdSetDepthCompareOp", commandBuffer, depthCompareOp); }
        Handles.MH_vkCmdSetDepthCompareOp.invokeExact(commandBuffer.capabilities().PFN_vkCmdSetDepthCompareOp, commandBuffer.segment(), depthCompareOp); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetDepthCompareOp", e); }
    }

    /// Invokes `vkCmdSetDepthBoundsTestEnable`.
    /// ```
    /// void vkCmdSetDepthBoundsTestEnable(VkCommandBuffer commandBuffer, VkBool32 depthBoundsTestEnable);
    /// ```
    public static void vkCmdSetDepthBoundsTestEnable(@NonNull VkCommandBuffer commandBuffer, int depthBoundsTestEnable) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetDepthBoundsTestEnable)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdSetDepthBoundsTestEnable");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdSetDepthBoundsTestEnable", commandBuffer, depthBoundsTestEnable); }
        Handles.MH_vkCmdSetDepthBoundsTestEnable.invokeExact(commandBuffer.capabilities().PFN_vkCmdSetDepthBoundsTestEnable, commandBuffer.segment(), depthBoundsTestEnable); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetDepthBoundsTestEnable", e); }
    }

    /// Invokes `vkCmdSetStencilTestEnable`.
    /// ```
    /// void vkCmdSetStencilTestEnable(VkCommandBuffer commandBuffer, VkBool32 stencilTestEnable);
    /// ```
    public static void vkCmdSetStencilTestEnable(@NonNull VkCommandBuffer commandBuffer, int stencilTestEnable) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetStencilTestEnable)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdSetStencilTestEnable");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdSetStencilTestEnable", commandBuffer, stencilTestEnable); }
        Handles.MH_vkCmdSetStencilTestEnable.invokeExact(commandBuffer.capabilities().PFN_vkCmdSetStencilTestEnable, commandBuffer.segment(), stencilTestEnable); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetStencilTestEnable", e); }
    }

    /// Invokes `vkCmdSetStencilOp`.
    /// ```
    /// void vkCmdSetStencilOp(VkCommandBuffer commandBuffer, VkStencilFaceFlags faceMask, VkStencilOp failOp, VkStencilOp passOp, VkStencilOp depthFailOp, VkCompareOp compareOp);
    /// ```
    public static void vkCmdSetStencilOp(@NonNull VkCommandBuffer commandBuffer, int faceMask, int failOp, int passOp, int depthFailOp, int compareOp) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetStencilOp)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdSetStencilOp");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdSetStencilOp", commandBuffer, faceMask, failOp, passOp, depthFailOp, compareOp); }
        Handles.MH_vkCmdSetStencilOp.invokeExact(commandBuffer.capabilities().PFN_vkCmdSetStencilOp, commandBuffer.segment(), faceMask, failOp, passOp, depthFailOp, compareOp); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetStencilOp", e); }
    }

    /// Invokes `vkCmdSetRasterizerDiscardEnable`.
    /// ```
    /// void vkCmdSetRasterizerDiscardEnable(VkCommandBuffer commandBuffer, VkBool32 rasterizerDiscardEnable);
    /// ```
    public static void vkCmdSetRasterizerDiscardEnable(@NonNull VkCommandBuffer commandBuffer, int rasterizerDiscardEnable) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetRasterizerDiscardEnable)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdSetRasterizerDiscardEnable");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdSetRasterizerDiscardEnable", commandBuffer, rasterizerDiscardEnable); }
        Handles.MH_vkCmdSetRasterizerDiscardEnable.invokeExact(commandBuffer.capabilities().PFN_vkCmdSetRasterizerDiscardEnable, commandBuffer.segment(), rasterizerDiscardEnable); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetRasterizerDiscardEnable", e); }
    }

    /// Invokes `vkCmdSetDepthBiasEnable`.
    /// ```
    /// void vkCmdSetDepthBiasEnable(VkCommandBuffer commandBuffer, VkBool32 depthBiasEnable);
    /// ```
    public static void vkCmdSetDepthBiasEnable(@NonNull VkCommandBuffer commandBuffer, int depthBiasEnable) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetDepthBiasEnable)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdSetDepthBiasEnable");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdSetDepthBiasEnable", commandBuffer, depthBiasEnable); }
        Handles.MH_vkCmdSetDepthBiasEnable.invokeExact(commandBuffer.capabilities().PFN_vkCmdSetDepthBiasEnable, commandBuffer.segment(), depthBiasEnable); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetDepthBiasEnable", e); }
    }

    /// Invokes `vkCmdSetPrimitiveRestartEnable`.
    /// ```
    /// void vkCmdSetPrimitiveRestartEnable(VkCommandBuffer commandBuffer, VkBool32 primitiveRestartEnable);
    /// ```
    public static void vkCmdSetPrimitiveRestartEnable(@NonNull VkCommandBuffer commandBuffer, int primitiveRestartEnable) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetPrimitiveRestartEnable)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdSetPrimitiveRestartEnable");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdSetPrimitiveRestartEnable", commandBuffer, primitiveRestartEnable); }
        Handles.MH_vkCmdSetPrimitiveRestartEnable.invokeExact(commandBuffer.capabilities().PFN_vkCmdSetPrimitiveRestartEnable, commandBuffer.segment(), primitiveRestartEnable); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetPrimitiveRestartEnable", e); }
    }

}
