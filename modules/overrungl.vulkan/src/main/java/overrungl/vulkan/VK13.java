/*
 * MIT License
 *
 * Copyright (c) 2022-2025 Overrun Organization
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 */

// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan;
import java.lang.foreign.*;
import java.lang.invoke.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;
public class VK13 extends VK12 {
    public static final int VK_PIPELINE_CREATION_FEEDBACK_VALID_BIT = 0x00000001;
    public static final int VK_PIPELINE_CREATION_FEEDBACK_APPLICATION_PIPELINE_CACHE_HIT_BIT = 0x00000002;
    public static final int VK_PIPELINE_CREATION_FEEDBACK_BASE_PIPELINE_ACCELERATION_BIT = 0x00000004;
    public static final int VK_TOOL_PURPOSE_VALIDATION_BIT = 0x00000001;
    public static final int VK_TOOL_PURPOSE_PROFILING_BIT = 0x00000002;
    public static final int VK_TOOL_PURPOSE_TRACING_BIT = 0x00000004;
    public static final int VK_TOOL_PURPOSE_ADDITIONAL_FEATURES_BIT = 0x00000008;
    public static final int VK_TOOL_PURPOSE_MODIFYING_FEATURES_BIT = 0x00000010;
    public static final long VK_PIPELINE_STAGE_2_NONE = 0;
    public static final long VK_PIPELINE_STAGE_2_TOP_OF_PIPE_BIT = 0x00000001L;
    public static final long VK_PIPELINE_STAGE_2_DRAW_INDIRECT_BIT = 0x00000002L;
    public static final long VK_PIPELINE_STAGE_2_VERTEX_INPUT_BIT = 0x00000004L;
    public static final long VK_PIPELINE_STAGE_2_VERTEX_SHADER_BIT = 0x00000008L;
    public static final long VK_PIPELINE_STAGE_2_TESSELLATION_CONTROL_SHADER_BIT = 0x00000010L;
    public static final long VK_PIPELINE_STAGE_2_TESSELLATION_EVALUATION_SHADER_BIT = 0x00000020L;
    public static final long VK_PIPELINE_STAGE_2_GEOMETRY_SHADER_BIT = 0x00000040L;
    public static final long VK_PIPELINE_STAGE_2_FRAGMENT_SHADER_BIT = 0x00000080L;
    public static final long VK_PIPELINE_STAGE_2_EARLY_FRAGMENT_TESTS_BIT = 0x00000100L;
    public static final long VK_PIPELINE_STAGE_2_LATE_FRAGMENT_TESTS_BIT = 0x00000200L;
    public static final long VK_PIPELINE_STAGE_2_COLOR_ATTACHMENT_OUTPUT_BIT = 0x00000400L;
    public static final long VK_PIPELINE_STAGE_2_COMPUTE_SHADER_BIT = 0x00000800L;
    public static final long VK_PIPELINE_STAGE_2_ALL_TRANSFER_BIT = 0x00001000L;
    public static final long VK_PIPELINE_STAGE_2_TRANSFER_BIT = 0x00001000L;
    public static final long VK_PIPELINE_STAGE_2_BOTTOM_OF_PIPE_BIT = 0x00002000L;
    public static final long VK_PIPELINE_STAGE_2_HOST_BIT = 0x00004000L;
    public static final long VK_PIPELINE_STAGE_2_ALL_GRAPHICS_BIT = 0x00008000L;
    public static final long VK_PIPELINE_STAGE_2_ALL_COMMANDS_BIT = 0x00010000L;
    public static final long VK_PIPELINE_STAGE_2_COPY_BIT = 0x100000000L;
    public static final long VK_PIPELINE_STAGE_2_RESOLVE_BIT = 0x200000000L;
    public static final long VK_PIPELINE_STAGE_2_BLIT_BIT = 0x400000000L;
    public static final long VK_PIPELINE_STAGE_2_CLEAR_BIT = 0x800000000L;
    public static final long VK_PIPELINE_STAGE_2_INDEX_INPUT_BIT = 0x1000000000L;
    public static final long VK_PIPELINE_STAGE_2_VERTEX_ATTRIBUTE_INPUT_BIT = 0x2000000000L;
    public static final long VK_PIPELINE_STAGE_2_PRE_RASTERIZATION_SHADERS_BIT = 0x4000000000L;
    public static final long VK_ACCESS_2_NONE = 0;
    public static final long VK_ACCESS_2_INDIRECT_COMMAND_READ_BIT = 0x00000001L;
    public static final long VK_ACCESS_2_INDEX_READ_BIT = 0x00000002L;
    public static final long VK_ACCESS_2_VERTEX_ATTRIBUTE_READ_BIT = 0x00000004L;
    public static final long VK_ACCESS_2_UNIFORM_READ_BIT = 0x00000008L;
    public static final long VK_ACCESS_2_INPUT_ATTACHMENT_READ_BIT = 0x00000010L;
    public static final long VK_ACCESS_2_SHADER_READ_BIT = 0x00000020L;
    public static final long VK_ACCESS_2_SHADER_WRITE_BIT = 0x00000040L;
    public static final long VK_ACCESS_2_COLOR_ATTACHMENT_READ_BIT = 0x00000080L;
    public static final long VK_ACCESS_2_COLOR_ATTACHMENT_WRITE_BIT = 0x00000100L;
    public static final long VK_ACCESS_2_DEPTH_STENCIL_ATTACHMENT_READ_BIT = 0x00000200L;
    public static final long VK_ACCESS_2_DEPTH_STENCIL_ATTACHMENT_WRITE_BIT = 0x00000400L;
    public static final long VK_ACCESS_2_TRANSFER_READ_BIT = 0x00000800L;
    public static final long VK_ACCESS_2_TRANSFER_WRITE_BIT = 0x00001000L;
    public static final long VK_ACCESS_2_HOST_READ_BIT = 0x00002000L;
    public static final long VK_ACCESS_2_HOST_WRITE_BIT = 0x00004000L;
    public static final long VK_ACCESS_2_MEMORY_READ_BIT = 0x00008000L;
    public static final long VK_ACCESS_2_MEMORY_WRITE_BIT = 0x00010000L;
    public static final long VK_ACCESS_2_SHADER_SAMPLED_READ_BIT = 0x100000000L;
    public static final long VK_ACCESS_2_SHADER_STORAGE_READ_BIT = 0x200000000L;
    public static final long VK_ACCESS_2_SHADER_STORAGE_WRITE_BIT = 0x400000000L;
    public static final int VK_SUBMIT_PROTECTED_BIT = 0x00000001;
    public static final int VK_RENDERING_CONTENTS_SECONDARY_COMMAND_BUFFERS_BIT = 0x00000001;
    public static final int VK_RENDERING_SUSPENDING_BIT = 0x00000002;
    public static final int VK_RENDERING_RESUMING_BIT = 0x00000004;
    public static final long VK_FORMAT_FEATURE_2_SAMPLED_IMAGE_BIT = 0x00000001L;
    public static final long VK_FORMAT_FEATURE_2_STORAGE_IMAGE_BIT = 0x00000002L;
    public static final long VK_FORMAT_FEATURE_2_STORAGE_IMAGE_ATOMIC_BIT = 0x00000004L;
    public static final long VK_FORMAT_FEATURE_2_UNIFORM_TEXEL_BUFFER_BIT = 0x00000008L;
    public static final long VK_FORMAT_FEATURE_2_STORAGE_TEXEL_BUFFER_BIT = 0x00000010L;
    public static final long VK_FORMAT_FEATURE_2_STORAGE_TEXEL_BUFFER_ATOMIC_BIT = 0x00000020L;
    public static final long VK_FORMAT_FEATURE_2_VERTEX_BUFFER_BIT = 0x00000040L;
    public static final long VK_FORMAT_FEATURE_2_COLOR_ATTACHMENT_BIT = 0x00000080L;
    public static final long VK_FORMAT_FEATURE_2_COLOR_ATTACHMENT_BLEND_BIT = 0x00000100L;
    public static final long VK_FORMAT_FEATURE_2_DEPTH_STENCIL_ATTACHMENT_BIT = 0x00000200L;
    public static final long VK_FORMAT_FEATURE_2_BLIT_SRC_BIT = 0x00000400L;
    public static final long VK_FORMAT_FEATURE_2_BLIT_DST_BIT = 0x00000800L;
    public static final long VK_FORMAT_FEATURE_2_SAMPLED_IMAGE_FILTER_LINEAR_BIT = 0x00001000L;
    public static final long VK_FORMAT_FEATURE_2_TRANSFER_SRC_BIT = 0x00004000L;
    public static final long VK_FORMAT_FEATURE_2_TRANSFER_DST_BIT = 0x00008000L;
    public static final long VK_FORMAT_FEATURE_2_SAMPLED_IMAGE_FILTER_MINMAX_BIT = 0x00010000L;
    public static final long VK_FORMAT_FEATURE_2_MIDPOINT_CHROMA_SAMPLES_BIT = 0x00020000L;
    public static final long VK_FORMAT_FEATURE_2_SAMPLED_IMAGE_YCBCR_CONVERSION_LINEAR_FILTER_BIT = 0x00040000L;
    public static final long VK_FORMAT_FEATURE_2_SAMPLED_IMAGE_YCBCR_CONVERSION_SEPARATE_RECONSTRUCTION_FILTER_BIT = 0x00080000L;
    public static final long VK_FORMAT_FEATURE_2_SAMPLED_IMAGE_YCBCR_CONVERSION_CHROMA_RECONSTRUCTION_EXPLICIT_BIT = 0x00100000L;
    public static final long VK_FORMAT_FEATURE_2_SAMPLED_IMAGE_YCBCR_CONVERSION_CHROMA_RECONSTRUCTION_EXPLICIT_FORCEABLE_BIT = 0x00200000L;
    public static final long VK_FORMAT_FEATURE_2_DISJOINT_BIT = 0x00400000L;
    public static final long VK_FORMAT_FEATURE_2_COSITED_CHROMA_SAMPLES_BIT = 0x00800000L;
    public static final long VK_FORMAT_FEATURE_2_STORAGE_READ_WITHOUT_FORMAT_BIT = 0x80000000L;
    public static final long VK_FORMAT_FEATURE_2_STORAGE_WRITE_WITHOUT_FORMAT_BIT = 0x100000000L;
    public static final long VK_FORMAT_FEATURE_2_SAMPLED_IMAGE_DEPTH_COMPARISON_BIT = 0x200000000L;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_3_FEATURES = 53;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_3_PROPERTIES = 54;
    public static final int VK_STRUCTURE_TYPE_PIPELINE_CREATION_FEEDBACK_CREATE_INFO = 1000192000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_TERMINATE_INVOCATION_FEATURES = 1000215000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TOOL_PROPERTIES = 1000245000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_DEMOTE_TO_HELPER_INVOCATION_FEATURES = 1000276000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PRIVATE_DATA_FEATURES = 1000295000;
    public static final int VK_STRUCTURE_TYPE_DEVICE_PRIVATE_DATA_CREATE_INFO = 1000295001;
    public static final int VK_STRUCTURE_TYPE_PRIVATE_DATA_SLOT_CREATE_INFO = 1000295002;
    public static final int VK_OBJECT_TYPE_PRIVATE_DATA_SLOT = 1000295000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_CREATION_CACHE_CONTROL_FEATURES = 1000297000;
    public static final int VK_PIPELINE_CREATE_FAIL_ON_PIPELINE_COMPILE_REQUIRED_BIT = 0x00000100;
    public static final int VK_PIPELINE_CREATE_EARLY_RETURN_ON_FAILURE_BIT = 0x00000200;
    public static final int VK_PIPELINE_COMPILE_REQUIRED = 1000297000;
    public static final int VK_PIPELINE_CACHE_CREATE_EXTERNALLY_SYNCHRONIZED_BIT = 0x00000001;
    public static final int VK_STRUCTURE_TYPE_MEMORY_BARRIER_2 = 1000314000;
    public static final int VK_STRUCTURE_TYPE_BUFFER_MEMORY_BARRIER_2 = 1000314001;
    public static final int VK_STRUCTURE_TYPE_IMAGE_MEMORY_BARRIER_2 = 1000314002;
    public static final int VK_STRUCTURE_TYPE_DEPENDENCY_INFO = 1000314003;
    public static final int VK_STRUCTURE_TYPE_SUBMIT_INFO_2 = 1000314004;
    public static final int VK_STRUCTURE_TYPE_SEMAPHORE_SUBMIT_INFO = 1000314005;
    public static final int VK_STRUCTURE_TYPE_COMMAND_BUFFER_SUBMIT_INFO = 1000314006;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SYNCHRONIZATION_2_FEATURES = 1000314007;
    public static final int VK_EVENT_CREATE_DEVICE_ONLY_BIT = 0x00000001;
    public static final int VK_IMAGE_LAYOUT_READ_ONLY_OPTIMAL = 1000314000;
    public static final int VK_IMAGE_LAYOUT_ATTACHMENT_OPTIMAL = 1000314001;
    public static final int VK_PIPELINE_STAGE_NONE = 0;
    public static final int VK_ACCESS_NONE = 0;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_ZERO_INITIALIZE_WORKGROUP_MEMORY_FEATURES = 1000325000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_ROBUSTNESS_FEATURES = 1000335000;
    public static final int VK_STRUCTURE_TYPE_COPY_BUFFER_INFO_2 = 1000337000;
    public static final int VK_STRUCTURE_TYPE_COPY_IMAGE_INFO_2 = 1000337001;
    public static final int VK_STRUCTURE_TYPE_COPY_BUFFER_TO_IMAGE_INFO_2 = 1000337002;
    public static final int VK_STRUCTURE_TYPE_COPY_IMAGE_TO_BUFFER_INFO_2 = 1000337003;
    public static final int VK_STRUCTURE_TYPE_BLIT_IMAGE_INFO_2 = 1000337004;
    public static final int VK_STRUCTURE_TYPE_RESOLVE_IMAGE_INFO_2 = 1000337005;
    public static final int VK_STRUCTURE_TYPE_BUFFER_COPY_2 = 1000337006;
    public static final int VK_STRUCTURE_TYPE_IMAGE_COPY_2 = 1000337007;
    public static final int VK_STRUCTURE_TYPE_IMAGE_BLIT_2 = 1000337008;
    public static final int VK_STRUCTURE_TYPE_BUFFER_IMAGE_COPY_2 = 1000337009;
    public static final int VK_STRUCTURE_TYPE_IMAGE_RESOLVE_2 = 1000337010;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SUBGROUP_SIZE_CONTROL_PROPERTIES = 1000225000;
    public static final int VK_STRUCTURE_TYPE_PIPELINE_SHADER_STAGE_REQUIRED_SUBGROUP_SIZE_CREATE_INFO = 1000225001;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SUBGROUP_SIZE_CONTROL_FEATURES = 1000225002;
    public static final int VK_PIPELINE_SHADER_STAGE_CREATE_ALLOW_VARYING_SUBGROUP_SIZE_BIT = 0x00000001;
    public static final int VK_PIPELINE_SHADER_STAGE_CREATE_REQUIRE_FULL_SUBGROUPS_BIT = 0x00000002;
    public static final int VK_DESCRIPTOR_TYPE_INLINE_UNIFORM_BLOCK = 1000138000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_INLINE_UNIFORM_BLOCK_FEATURES = 1000138000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_INLINE_UNIFORM_BLOCK_PROPERTIES = 1000138001;
    public static final int VK_STRUCTURE_TYPE_WRITE_DESCRIPTOR_SET_INLINE_UNIFORM_BLOCK = 1000138002;
    public static final int VK_STRUCTURE_TYPE_DESCRIPTOR_POOL_INLINE_UNIFORM_BLOCK_CREATE_INFO = 1000138003;
    public static final int VK_FORMAT_G8_B8R8_2PLANE_444_UNORM = 1000330000;
    public static final int VK_FORMAT_G10X6_B10X6R10X6_2PLANE_444_UNORM_3PACK16 = 1000330001;
    public static final int VK_FORMAT_G12X4_B12X4R12X4_2PLANE_444_UNORM_3PACK16 = 1000330002;
    public static final int VK_FORMAT_G16_B16R16_2PLANE_444_UNORM = 1000330003;
    public static final int VK_FORMAT_A4R4G4B4_UNORM_PACK16 = 1000340000;
    public static final int VK_FORMAT_A4B4G4R4_UNORM_PACK16 = 1000340001;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TEXTURE_COMPRESSION_ASTC_HDR_FEATURES = 1000066000;
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
    public static final int VK_STRUCTURE_TYPE_RENDERING_INFO = 1000044000;
    public static final int VK_STRUCTURE_TYPE_RENDERING_ATTACHMENT_INFO = 1000044001;
    public static final int VK_STRUCTURE_TYPE_PIPELINE_RENDERING_CREATE_INFO = 1000044002;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DYNAMIC_RENDERING_FEATURES = 1000044003;
    public static final int VK_STRUCTURE_TYPE_COMMAND_BUFFER_INHERITANCE_RENDERING_INFO = 1000044004;
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
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_INTEGER_DOT_PRODUCT_FEATURES = 1000280000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_INTEGER_DOT_PRODUCT_PROPERTIES = 1000280001;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TEXEL_BUFFER_ALIGNMENT_PROPERTIES = 1000281001;
    public static final int VK_STRUCTURE_TYPE_FORMAT_PROPERTIES_3 = 1000360000;
    public static final long VK_FORMAT_FEATURE_2_SAMPLED_IMAGE_FILTER_CUBIC_BIT = 0x00002000L;
    public static final int VK_DYNAMIC_STATE_RASTERIZER_DISCARD_ENABLE = 1000377001;
    public static final int VK_DYNAMIC_STATE_DEPTH_BIAS_ENABLE = 1000377002;
    public static final int VK_DYNAMIC_STATE_PRIMITIVE_RESTART_ENABLE = 1000377004;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_4_FEATURES = 1000413000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_4_PROPERTIES = 1000413001;
    public static final int VK_STRUCTURE_TYPE_DEVICE_BUFFER_MEMORY_REQUIREMENTS = 1000413002;
    public static final int VK_STRUCTURE_TYPE_DEVICE_IMAGE_MEMORY_REQUIREMENTS = 1000413003;
    public static final int VK_IMAGE_ASPECT_NONE = 0;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_vkGetPhysicalDeviceToolProperties = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCreatePrivateDataSlot = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkDestroyPrivateDataSlot = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkSetPrivateData = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG));
        public static final MethodHandle MH_vkGetPrivateData = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdSetEvent2 = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdResetEvent2 = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG));
        public static final MethodHandle MH_vkCmdWaitEvents2 = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdPipelineBarrier2 = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdWriteTimestamp2 = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_vkQueueSubmit2 = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG));
        public static final MethodHandle MH_vkCmdCopyBuffer2 = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdCopyImage2 = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdCopyBufferToImage2 = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdCopyImageToBuffer2 = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdBlitImage2 = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdResolveImage2 = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdBeginRendering = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdEndRendering = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdSetCullMode = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_vkCmdSetFrontFace = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_vkCmdSetPrimitiveTopology = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_vkCmdSetViewportWithCount = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdSetScissorWithCount = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdBindVertexBuffers2 = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdSetDepthTestEnable = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_vkCmdSetDepthWriteEnable = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_vkCmdSetDepthCompareOp = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_vkCmdSetDepthBoundsTestEnable = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_vkCmdSetStencilTestEnable = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_vkCmdSetStencilOp = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_vkCmdSetRasterizerDiscardEnable = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_vkCmdSetDepthBiasEnable = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_vkCmdSetPrimitiveRestartEnable = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_vkGetDeviceBufferMemoryRequirements = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetDeviceImageMemoryRequirements = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetDeviceImageSparseMemoryRequirements = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public final MemorySegment PFN_vkGetPhysicalDeviceToolProperties;
        public final MemorySegment PFN_vkCreatePrivateDataSlot;
        public final MemorySegment PFN_vkDestroyPrivateDataSlot;
        public final MemorySegment PFN_vkSetPrivateData;
        public final MemorySegment PFN_vkGetPrivateData;
        public final MemorySegment PFN_vkCmdSetEvent2;
        public final MemorySegment PFN_vkCmdResetEvent2;
        public final MemorySegment PFN_vkCmdWaitEvents2;
        public final MemorySegment PFN_vkCmdPipelineBarrier2;
        public final MemorySegment PFN_vkCmdWriteTimestamp2;
        public final MemorySegment PFN_vkQueueSubmit2;
        public final MemorySegment PFN_vkCmdCopyBuffer2;
        public final MemorySegment PFN_vkCmdCopyImage2;
        public final MemorySegment PFN_vkCmdCopyBufferToImage2;
        public final MemorySegment PFN_vkCmdCopyImageToBuffer2;
        public final MemorySegment PFN_vkCmdBlitImage2;
        public final MemorySegment PFN_vkCmdResolveImage2;
        public final MemorySegment PFN_vkCmdBeginRendering;
        public final MemorySegment PFN_vkCmdEndRendering;
        public final MemorySegment PFN_vkCmdSetCullMode;
        public final MemorySegment PFN_vkCmdSetFrontFace;
        public final MemorySegment PFN_vkCmdSetPrimitiveTopology;
        public final MemorySegment PFN_vkCmdSetViewportWithCount;
        public final MemorySegment PFN_vkCmdSetScissorWithCount;
        public final MemorySegment PFN_vkCmdBindVertexBuffers2;
        public final MemorySegment PFN_vkCmdSetDepthTestEnable;
        public final MemorySegment PFN_vkCmdSetDepthWriteEnable;
        public final MemorySegment PFN_vkCmdSetDepthCompareOp;
        public final MemorySegment PFN_vkCmdSetDepthBoundsTestEnable;
        public final MemorySegment PFN_vkCmdSetStencilTestEnable;
        public final MemorySegment PFN_vkCmdSetStencilOp;
        public final MemorySegment PFN_vkCmdSetRasterizerDiscardEnable;
        public final MemorySegment PFN_vkCmdSetDepthBiasEnable;
        public final MemorySegment PFN_vkCmdSetPrimitiveRestartEnable;
        public final MemorySegment PFN_vkGetDeviceBufferMemoryRequirements;
        public final MemorySegment PFN_vkGetDeviceImageMemoryRequirements;
        public final MemorySegment PFN_vkGetDeviceImageSparseMemoryRequirements;
        private Handles(MemorySegment instance, VKLoadFunc func) {
            PFN_vkGetPhysicalDeviceToolProperties = func.invoke(instance, "vkGetPhysicalDeviceToolProperties", "vkGetPhysicalDeviceToolPropertiesEXT");
            PFN_vkCreatePrivateDataSlot = func.invoke(instance, "vkCreatePrivateDataSlot", "vkCreatePrivateDataSlotEXT");
            PFN_vkDestroyPrivateDataSlot = func.invoke(instance, "vkDestroyPrivateDataSlot", "vkDestroyPrivateDataSlotEXT");
            PFN_vkSetPrivateData = func.invoke(instance, "vkSetPrivateData", "vkSetPrivateDataEXT");
            PFN_vkGetPrivateData = func.invoke(instance, "vkGetPrivateData", "vkGetPrivateDataEXT");
            PFN_vkCmdSetEvent2 = func.invoke(instance, "vkCmdSetEvent2", "vkCmdSetEvent2KHR");
            PFN_vkCmdResetEvent2 = func.invoke(instance, "vkCmdResetEvent2", "vkCmdResetEvent2KHR");
            PFN_vkCmdWaitEvents2 = func.invoke(instance, "vkCmdWaitEvents2", "vkCmdWaitEvents2KHR");
            PFN_vkCmdPipelineBarrier2 = func.invoke(instance, "vkCmdPipelineBarrier2", "vkCmdPipelineBarrier2KHR");
            PFN_vkCmdWriteTimestamp2 = func.invoke(instance, "vkCmdWriteTimestamp2", "vkCmdWriteTimestamp2KHR");
            PFN_vkQueueSubmit2 = func.invoke(instance, "vkQueueSubmit2", "vkQueueSubmit2KHR");
            PFN_vkCmdCopyBuffer2 = func.invoke(instance, "vkCmdCopyBuffer2", "vkCmdCopyBuffer2KHR");
            PFN_vkCmdCopyImage2 = func.invoke(instance, "vkCmdCopyImage2", "vkCmdCopyImage2KHR");
            PFN_vkCmdCopyBufferToImage2 = func.invoke(instance, "vkCmdCopyBufferToImage2", "vkCmdCopyBufferToImage2KHR");
            PFN_vkCmdCopyImageToBuffer2 = func.invoke(instance, "vkCmdCopyImageToBuffer2", "vkCmdCopyImageToBuffer2KHR");
            PFN_vkCmdBlitImage2 = func.invoke(instance, "vkCmdBlitImage2", "vkCmdBlitImage2KHR");
            PFN_vkCmdResolveImage2 = func.invoke(instance, "vkCmdResolveImage2", "vkCmdResolveImage2KHR");
            PFN_vkCmdBeginRendering = func.invoke(instance, "vkCmdBeginRendering", "vkCmdBeginRenderingKHR");
            PFN_vkCmdEndRendering = func.invoke(instance, "vkCmdEndRendering", "vkCmdEndRenderingKHR");
            PFN_vkCmdSetCullMode = func.invoke(instance, "vkCmdSetCullMode", "vkCmdSetCullModeEXT");
            PFN_vkCmdSetFrontFace = func.invoke(instance, "vkCmdSetFrontFace", "vkCmdSetFrontFaceEXT");
            PFN_vkCmdSetPrimitiveTopology = func.invoke(instance, "vkCmdSetPrimitiveTopology", "vkCmdSetPrimitiveTopologyEXT");
            PFN_vkCmdSetViewportWithCount = func.invoke(instance, "vkCmdSetViewportWithCount", "vkCmdSetViewportWithCountEXT");
            PFN_vkCmdSetScissorWithCount = func.invoke(instance, "vkCmdSetScissorWithCount", "vkCmdSetScissorWithCountEXT");
            PFN_vkCmdBindVertexBuffers2 = func.invoke(instance, "vkCmdBindVertexBuffers2", "vkCmdBindVertexBuffers2EXT");
            PFN_vkCmdSetDepthTestEnable = func.invoke(instance, "vkCmdSetDepthTestEnable", "vkCmdSetDepthTestEnableEXT");
            PFN_vkCmdSetDepthWriteEnable = func.invoke(instance, "vkCmdSetDepthWriteEnable", "vkCmdSetDepthWriteEnableEXT");
            PFN_vkCmdSetDepthCompareOp = func.invoke(instance, "vkCmdSetDepthCompareOp", "vkCmdSetDepthCompareOpEXT");
            PFN_vkCmdSetDepthBoundsTestEnable = func.invoke(instance, "vkCmdSetDepthBoundsTestEnable", "vkCmdSetDepthBoundsTestEnableEXT");
            PFN_vkCmdSetStencilTestEnable = func.invoke(instance, "vkCmdSetStencilTestEnable", "vkCmdSetStencilTestEnableEXT");
            PFN_vkCmdSetStencilOp = func.invoke(instance, "vkCmdSetStencilOp", "vkCmdSetStencilOpEXT");
            PFN_vkCmdSetRasterizerDiscardEnable = func.invoke(instance, "vkCmdSetRasterizerDiscardEnable", "vkCmdSetRasterizerDiscardEnableEXT");
            PFN_vkCmdSetDepthBiasEnable = func.invoke(instance, "vkCmdSetDepthBiasEnable", "vkCmdSetDepthBiasEnableEXT");
            PFN_vkCmdSetPrimitiveRestartEnable = func.invoke(instance, "vkCmdSetPrimitiveRestartEnable", "vkCmdSetPrimitiveRestartEnableEXT");
            PFN_vkGetDeviceBufferMemoryRequirements = func.invoke(instance, "vkGetDeviceBufferMemoryRequirements", "vkGetDeviceBufferMemoryRequirementsKHR");
            PFN_vkGetDeviceImageMemoryRequirements = func.invoke(instance, "vkGetDeviceImageMemoryRequirements", "vkGetDeviceImageMemoryRequirementsKHR");
            PFN_vkGetDeviceImageSparseMemoryRequirements = func.invoke(instance, "vkGetDeviceImageSparseMemoryRequirements", "vkGetDeviceImageSparseMemoryRequirementsKHR");
        }
    }

    public VK13(MemorySegment instance, VKLoadFunc func) {
        super(instance, func);
        this.handles = new Handles(instance, func);
    }

    /// ```
    /// VkResult vkGetPhysicalDeviceToolProperties(VkPhysicalDevice physicalDevice, uint32_t* pToolCount, VkPhysicalDeviceToolProperties* pToolProperties);
    /// ```
    public int GetPhysicalDeviceToolProperties(MemorySegment physicalDevice, MemorySegment pToolCount, MemorySegment pToolProperties) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkGetPhysicalDeviceToolProperties)) throw new SymbolNotFoundError("Symbol not found: vkGetPhysicalDeviceToolProperties");
        try { return (int) Handles.MH_vkGetPhysicalDeviceToolProperties.invokeExact(handles.PFN_vkGetPhysicalDeviceToolProperties, physicalDevice, pToolCount, pToolProperties); }
        catch (Throwable e) { throw new RuntimeException("error in GetPhysicalDeviceToolProperties", e); }
    }

    /// ```
    /// VkResult vkCreatePrivateDataSlot(VkDevice device, const VkPrivateDataSlotCreateInfo* pCreateInfo, const VkAllocationCallbacks* pAllocator, VkPrivateDataSlot* pPrivateDataSlot);
    /// ```
    public int CreatePrivateDataSlot(MemorySegment device, MemorySegment pCreateInfo, MemorySegment pAllocator, MemorySegment pPrivateDataSlot) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCreatePrivateDataSlot)) throw new SymbolNotFoundError("Symbol not found: vkCreatePrivateDataSlot");
        try { return (int) Handles.MH_vkCreatePrivateDataSlot.invokeExact(handles.PFN_vkCreatePrivateDataSlot, device, pCreateInfo, pAllocator, pPrivateDataSlot); }
        catch (Throwable e) { throw new RuntimeException("error in CreatePrivateDataSlot", e); }
    }

    /// ```
    /// void vkDestroyPrivateDataSlot(VkDevice device, VkPrivateDataSlot privateDataSlot, const VkAllocationCallbacks* pAllocator);
    /// ```
    public void DestroyPrivateDataSlot(MemorySegment device, long privateDataSlot, MemorySegment pAllocator) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkDestroyPrivateDataSlot)) throw new SymbolNotFoundError("Symbol not found: vkDestroyPrivateDataSlot");
        try { Handles.MH_vkDestroyPrivateDataSlot.invokeExact(handles.PFN_vkDestroyPrivateDataSlot, device, privateDataSlot, pAllocator); }
        catch (Throwable e) { throw new RuntimeException("error in DestroyPrivateDataSlot", e); }
    }

    /// ```
    /// VkResult vkSetPrivateData(VkDevice device, VkObjectType objectType, uint64_t objectHandle, VkPrivateDataSlot privateDataSlot, uint64_t data);
    /// ```
    public int SetPrivateData(MemorySegment device, int objectType, long objectHandle, long privateDataSlot, long data) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkSetPrivateData)) throw new SymbolNotFoundError("Symbol not found: vkSetPrivateData");
        try { return (int) Handles.MH_vkSetPrivateData.invokeExact(handles.PFN_vkSetPrivateData, device, objectType, objectHandle, privateDataSlot, data); }
        catch (Throwable e) { throw new RuntimeException("error in SetPrivateData", e); }
    }

    /// ```
    /// void vkGetPrivateData(VkDevice device, VkObjectType objectType, uint64_t objectHandle, VkPrivateDataSlot privateDataSlot, uint64_t* pData);
    /// ```
    public void GetPrivateData(MemorySegment device, int objectType, long objectHandle, long privateDataSlot, MemorySegment pData) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkGetPrivateData)) throw new SymbolNotFoundError("Symbol not found: vkGetPrivateData");
        try { Handles.MH_vkGetPrivateData.invokeExact(handles.PFN_vkGetPrivateData, device, objectType, objectHandle, privateDataSlot, pData); }
        catch (Throwable e) { throw new RuntimeException("error in GetPrivateData", e); }
    }

    /// ```
    /// void vkCmdSetEvent2(VkCommandBuffer commandBuffer, VkEvent event, const VkDependencyInfo* pDependencyInfo);
    /// ```
    public void CmdSetEvent2(MemorySegment commandBuffer, long event, MemorySegment pDependencyInfo) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCmdSetEvent2)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetEvent2");
        try { Handles.MH_vkCmdSetEvent2.invokeExact(handles.PFN_vkCmdSetEvent2, commandBuffer, event, pDependencyInfo); }
        catch (Throwable e) { throw new RuntimeException("error in CmdSetEvent2", e); }
    }

    /// ```
    /// void vkCmdResetEvent2(VkCommandBuffer commandBuffer, VkEvent event, VkPipelineStageFlags2 stageMask);
    /// ```
    public void CmdResetEvent2(MemorySegment commandBuffer, long event, long stageMask) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCmdResetEvent2)) throw new SymbolNotFoundError("Symbol not found: vkCmdResetEvent2");
        try { Handles.MH_vkCmdResetEvent2.invokeExact(handles.PFN_vkCmdResetEvent2, commandBuffer, event, stageMask); }
        catch (Throwable e) { throw new RuntimeException("error in CmdResetEvent2", e); }
    }

    /// ```
    /// void vkCmdWaitEvents2(VkCommandBuffer commandBuffer, uint32_t eventCount, const VkEvent* pEvents, const VkDependencyInfo* pDependencyInfos);
    /// ```
    public void CmdWaitEvents2(MemorySegment commandBuffer, int eventCount, MemorySegment pEvents, MemorySegment pDependencyInfos) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCmdWaitEvents2)) throw new SymbolNotFoundError("Symbol not found: vkCmdWaitEvents2");
        try { Handles.MH_vkCmdWaitEvents2.invokeExact(handles.PFN_vkCmdWaitEvents2, commandBuffer, eventCount, pEvents, pDependencyInfos); }
        catch (Throwable e) { throw new RuntimeException("error in CmdWaitEvents2", e); }
    }

    /// ```
    /// void vkCmdPipelineBarrier2(VkCommandBuffer commandBuffer, const VkDependencyInfo* pDependencyInfo);
    /// ```
    public void CmdPipelineBarrier2(MemorySegment commandBuffer, MemorySegment pDependencyInfo) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCmdPipelineBarrier2)) throw new SymbolNotFoundError("Symbol not found: vkCmdPipelineBarrier2");
        try { Handles.MH_vkCmdPipelineBarrier2.invokeExact(handles.PFN_vkCmdPipelineBarrier2, commandBuffer, pDependencyInfo); }
        catch (Throwable e) { throw new RuntimeException("error in CmdPipelineBarrier2", e); }
    }

    /// ```
    /// void vkCmdWriteTimestamp2(VkCommandBuffer commandBuffer, VkPipelineStageFlags2 stage, VkQueryPool queryPool, uint32_t query);
    /// ```
    public void CmdWriteTimestamp2(MemorySegment commandBuffer, long stage, long queryPool, int query) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCmdWriteTimestamp2)) throw new SymbolNotFoundError("Symbol not found: vkCmdWriteTimestamp2");
        try { Handles.MH_vkCmdWriteTimestamp2.invokeExact(handles.PFN_vkCmdWriteTimestamp2, commandBuffer, stage, queryPool, query); }
        catch (Throwable e) { throw new RuntimeException("error in CmdWriteTimestamp2", e); }
    }

    /// ```
    /// VkResult vkQueueSubmit2(VkQueue queue, uint32_t submitCount, const VkSubmitInfo2* pSubmits, VkFence fence);
    /// ```
    public int QueueSubmit2(MemorySegment queue, int submitCount, MemorySegment pSubmits, long fence) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkQueueSubmit2)) throw new SymbolNotFoundError("Symbol not found: vkQueueSubmit2");
        try { return (int) Handles.MH_vkQueueSubmit2.invokeExact(handles.PFN_vkQueueSubmit2, queue, submitCount, pSubmits, fence); }
        catch (Throwable e) { throw new RuntimeException("error in QueueSubmit2", e); }
    }

    /// ```
    /// void vkCmdCopyBuffer2(VkCommandBuffer commandBuffer, const VkCopyBufferInfo2* pCopyBufferInfo);
    /// ```
    public void CmdCopyBuffer2(MemorySegment commandBuffer, MemorySegment pCopyBufferInfo) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCmdCopyBuffer2)) throw new SymbolNotFoundError("Symbol not found: vkCmdCopyBuffer2");
        try { Handles.MH_vkCmdCopyBuffer2.invokeExact(handles.PFN_vkCmdCopyBuffer2, commandBuffer, pCopyBufferInfo); }
        catch (Throwable e) { throw new RuntimeException("error in CmdCopyBuffer2", e); }
    }

    /// ```
    /// void vkCmdCopyImage2(VkCommandBuffer commandBuffer, const VkCopyImageInfo2* pCopyImageInfo);
    /// ```
    public void CmdCopyImage2(MemorySegment commandBuffer, MemorySegment pCopyImageInfo) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCmdCopyImage2)) throw new SymbolNotFoundError("Symbol not found: vkCmdCopyImage2");
        try { Handles.MH_vkCmdCopyImage2.invokeExact(handles.PFN_vkCmdCopyImage2, commandBuffer, pCopyImageInfo); }
        catch (Throwable e) { throw new RuntimeException("error in CmdCopyImage2", e); }
    }

    /// ```
    /// void vkCmdCopyBufferToImage2(VkCommandBuffer commandBuffer, const VkCopyBufferToImageInfo2* pCopyBufferToImageInfo);
    /// ```
    public void CmdCopyBufferToImage2(MemorySegment commandBuffer, MemorySegment pCopyBufferToImageInfo) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCmdCopyBufferToImage2)) throw new SymbolNotFoundError("Symbol not found: vkCmdCopyBufferToImage2");
        try { Handles.MH_vkCmdCopyBufferToImage2.invokeExact(handles.PFN_vkCmdCopyBufferToImage2, commandBuffer, pCopyBufferToImageInfo); }
        catch (Throwable e) { throw new RuntimeException("error in CmdCopyBufferToImage2", e); }
    }

    /// ```
    /// void vkCmdCopyImageToBuffer2(VkCommandBuffer commandBuffer, const VkCopyImageToBufferInfo2* pCopyImageToBufferInfo);
    /// ```
    public void CmdCopyImageToBuffer2(MemorySegment commandBuffer, MemorySegment pCopyImageToBufferInfo) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCmdCopyImageToBuffer2)) throw new SymbolNotFoundError("Symbol not found: vkCmdCopyImageToBuffer2");
        try { Handles.MH_vkCmdCopyImageToBuffer2.invokeExact(handles.PFN_vkCmdCopyImageToBuffer2, commandBuffer, pCopyImageToBufferInfo); }
        catch (Throwable e) { throw new RuntimeException("error in CmdCopyImageToBuffer2", e); }
    }

    /// ```
    /// void vkCmdBlitImage2(VkCommandBuffer commandBuffer, const VkBlitImageInfo2* pBlitImageInfo);
    /// ```
    public void CmdBlitImage2(MemorySegment commandBuffer, MemorySegment pBlitImageInfo) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCmdBlitImage2)) throw new SymbolNotFoundError("Symbol not found: vkCmdBlitImage2");
        try { Handles.MH_vkCmdBlitImage2.invokeExact(handles.PFN_vkCmdBlitImage2, commandBuffer, pBlitImageInfo); }
        catch (Throwable e) { throw new RuntimeException("error in CmdBlitImage2", e); }
    }

    /// ```
    /// void vkCmdResolveImage2(VkCommandBuffer commandBuffer, const VkResolveImageInfo2* pResolveImageInfo);
    /// ```
    public void CmdResolveImage2(MemorySegment commandBuffer, MemorySegment pResolveImageInfo) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCmdResolveImage2)) throw new SymbolNotFoundError("Symbol not found: vkCmdResolveImage2");
        try { Handles.MH_vkCmdResolveImage2.invokeExact(handles.PFN_vkCmdResolveImage2, commandBuffer, pResolveImageInfo); }
        catch (Throwable e) { throw new RuntimeException("error in CmdResolveImage2", e); }
    }

    /// ```
    /// void vkCmdBeginRendering(VkCommandBuffer commandBuffer, const VkRenderingInfo* pRenderingInfo);
    /// ```
    public void CmdBeginRendering(MemorySegment commandBuffer, MemorySegment pRenderingInfo) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCmdBeginRendering)) throw new SymbolNotFoundError("Symbol not found: vkCmdBeginRendering");
        try { Handles.MH_vkCmdBeginRendering.invokeExact(handles.PFN_vkCmdBeginRendering, commandBuffer, pRenderingInfo); }
        catch (Throwable e) { throw new RuntimeException("error in CmdBeginRendering", e); }
    }

    /// ```
    /// void vkCmdEndRendering(VkCommandBuffer commandBuffer);
    /// ```
    public void CmdEndRendering(MemorySegment commandBuffer) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCmdEndRendering)) throw new SymbolNotFoundError("Symbol not found: vkCmdEndRendering");
        try { Handles.MH_vkCmdEndRendering.invokeExact(handles.PFN_vkCmdEndRendering, commandBuffer); }
        catch (Throwable e) { throw new RuntimeException("error in CmdEndRendering", e); }
    }

    /// ```
    /// void vkCmdSetCullMode(VkCommandBuffer commandBuffer, VkCullModeFlags cullMode);
    /// ```
    public void CmdSetCullMode(MemorySegment commandBuffer, int cullMode) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCmdSetCullMode)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetCullMode");
        try { Handles.MH_vkCmdSetCullMode.invokeExact(handles.PFN_vkCmdSetCullMode, commandBuffer, cullMode); }
        catch (Throwable e) { throw new RuntimeException("error in CmdSetCullMode", e); }
    }

    /// ```
    /// void vkCmdSetFrontFace(VkCommandBuffer commandBuffer, VkFrontFace frontFace);
    /// ```
    public void CmdSetFrontFace(MemorySegment commandBuffer, int frontFace) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCmdSetFrontFace)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetFrontFace");
        try { Handles.MH_vkCmdSetFrontFace.invokeExact(handles.PFN_vkCmdSetFrontFace, commandBuffer, frontFace); }
        catch (Throwable e) { throw new RuntimeException("error in CmdSetFrontFace", e); }
    }

    /// ```
    /// void vkCmdSetPrimitiveTopology(VkCommandBuffer commandBuffer, VkPrimitiveTopology primitiveTopology);
    /// ```
    public void CmdSetPrimitiveTopology(MemorySegment commandBuffer, int primitiveTopology) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCmdSetPrimitiveTopology)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetPrimitiveTopology");
        try { Handles.MH_vkCmdSetPrimitiveTopology.invokeExact(handles.PFN_vkCmdSetPrimitiveTopology, commandBuffer, primitiveTopology); }
        catch (Throwable e) { throw new RuntimeException("error in CmdSetPrimitiveTopology", e); }
    }

    /// ```
    /// void vkCmdSetViewportWithCount(VkCommandBuffer commandBuffer, uint32_t viewportCount, const VkViewport* pViewports);
    /// ```
    public void CmdSetViewportWithCount(MemorySegment commandBuffer, int viewportCount, MemorySegment pViewports) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCmdSetViewportWithCount)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetViewportWithCount");
        try { Handles.MH_vkCmdSetViewportWithCount.invokeExact(handles.PFN_vkCmdSetViewportWithCount, commandBuffer, viewportCount, pViewports); }
        catch (Throwable e) { throw new RuntimeException("error in CmdSetViewportWithCount", e); }
    }

    /// ```
    /// void vkCmdSetScissorWithCount(VkCommandBuffer commandBuffer, uint32_t scissorCount, const VkRect2D* pScissors);
    /// ```
    public void CmdSetScissorWithCount(MemorySegment commandBuffer, int scissorCount, MemorySegment pScissors) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCmdSetScissorWithCount)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetScissorWithCount");
        try { Handles.MH_vkCmdSetScissorWithCount.invokeExact(handles.PFN_vkCmdSetScissorWithCount, commandBuffer, scissorCount, pScissors); }
        catch (Throwable e) { throw new RuntimeException("error in CmdSetScissorWithCount", e); }
    }

    /// ```
    /// void vkCmdBindVertexBuffers2(VkCommandBuffer commandBuffer, uint32_t firstBinding, uint32_t bindingCount, const VkBuffer* pBuffers, const VkDeviceSize* pOffsets, const VkDeviceSize* pSizes, const VkDeviceSize* pStrides);
    /// ```
    public void CmdBindVertexBuffers2(MemorySegment commandBuffer, int firstBinding, int bindingCount, MemorySegment pBuffers, MemorySegment pOffsets, MemorySegment pSizes, MemorySegment pStrides) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCmdBindVertexBuffers2)) throw new SymbolNotFoundError("Symbol not found: vkCmdBindVertexBuffers2");
        try { Handles.MH_vkCmdBindVertexBuffers2.invokeExact(handles.PFN_vkCmdBindVertexBuffers2, commandBuffer, firstBinding, bindingCount, pBuffers, pOffsets, pSizes, pStrides); }
        catch (Throwable e) { throw new RuntimeException("error in CmdBindVertexBuffers2", e); }
    }

    /// ```
    /// void vkCmdSetDepthTestEnable(VkCommandBuffer commandBuffer, VkBool32 depthTestEnable);
    /// ```
    public void CmdSetDepthTestEnable(MemorySegment commandBuffer, int depthTestEnable) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCmdSetDepthTestEnable)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetDepthTestEnable");
        try { Handles.MH_vkCmdSetDepthTestEnable.invokeExact(handles.PFN_vkCmdSetDepthTestEnable, commandBuffer, depthTestEnable); }
        catch (Throwable e) { throw new RuntimeException("error in CmdSetDepthTestEnable", e); }
    }

    /// ```
    /// void vkCmdSetDepthWriteEnable(VkCommandBuffer commandBuffer, VkBool32 depthWriteEnable);
    /// ```
    public void CmdSetDepthWriteEnable(MemorySegment commandBuffer, int depthWriteEnable) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCmdSetDepthWriteEnable)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetDepthWriteEnable");
        try { Handles.MH_vkCmdSetDepthWriteEnable.invokeExact(handles.PFN_vkCmdSetDepthWriteEnable, commandBuffer, depthWriteEnable); }
        catch (Throwable e) { throw new RuntimeException("error in CmdSetDepthWriteEnable", e); }
    }

    /// ```
    /// void vkCmdSetDepthCompareOp(VkCommandBuffer commandBuffer, VkCompareOp depthCompareOp);
    /// ```
    public void CmdSetDepthCompareOp(MemorySegment commandBuffer, int depthCompareOp) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCmdSetDepthCompareOp)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetDepthCompareOp");
        try { Handles.MH_vkCmdSetDepthCompareOp.invokeExact(handles.PFN_vkCmdSetDepthCompareOp, commandBuffer, depthCompareOp); }
        catch (Throwable e) { throw new RuntimeException("error in CmdSetDepthCompareOp", e); }
    }

    /// ```
    /// void vkCmdSetDepthBoundsTestEnable(VkCommandBuffer commandBuffer, VkBool32 depthBoundsTestEnable);
    /// ```
    public void CmdSetDepthBoundsTestEnable(MemorySegment commandBuffer, int depthBoundsTestEnable) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCmdSetDepthBoundsTestEnable)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetDepthBoundsTestEnable");
        try { Handles.MH_vkCmdSetDepthBoundsTestEnable.invokeExact(handles.PFN_vkCmdSetDepthBoundsTestEnable, commandBuffer, depthBoundsTestEnable); }
        catch (Throwable e) { throw new RuntimeException("error in CmdSetDepthBoundsTestEnable", e); }
    }

    /// ```
    /// void vkCmdSetStencilTestEnable(VkCommandBuffer commandBuffer, VkBool32 stencilTestEnable);
    /// ```
    public void CmdSetStencilTestEnable(MemorySegment commandBuffer, int stencilTestEnable) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCmdSetStencilTestEnable)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetStencilTestEnable");
        try { Handles.MH_vkCmdSetStencilTestEnable.invokeExact(handles.PFN_vkCmdSetStencilTestEnable, commandBuffer, stencilTestEnable); }
        catch (Throwable e) { throw new RuntimeException("error in CmdSetStencilTestEnable", e); }
    }

    /// ```
    /// void vkCmdSetStencilOp(VkCommandBuffer commandBuffer, VkStencilFaceFlags faceMask, VkStencilOp failOp, VkStencilOp passOp, VkStencilOp depthFailOp, VkCompareOp compareOp);
    /// ```
    public void CmdSetStencilOp(MemorySegment commandBuffer, int faceMask, int failOp, int passOp, int depthFailOp, int compareOp) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCmdSetStencilOp)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetStencilOp");
        try { Handles.MH_vkCmdSetStencilOp.invokeExact(handles.PFN_vkCmdSetStencilOp, commandBuffer, faceMask, failOp, passOp, depthFailOp, compareOp); }
        catch (Throwable e) { throw new RuntimeException("error in CmdSetStencilOp", e); }
    }

    /// ```
    /// void vkCmdSetRasterizerDiscardEnable(VkCommandBuffer commandBuffer, VkBool32 rasterizerDiscardEnable);
    /// ```
    public void CmdSetRasterizerDiscardEnable(MemorySegment commandBuffer, int rasterizerDiscardEnable) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCmdSetRasterizerDiscardEnable)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetRasterizerDiscardEnable");
        try { Handles.MH_vkCmdSetRasterizerDiscardEnable.invokeExact(handles.PFN_vkCmdSetRasterizerDiscardEnable, commandBuffer, rasterizerDiscardEnable); }
        catch (Throwable e) { throw new RuntimeException("error in CmdSetRasterizerDiscardEnable", e); }
    }

    /// ```
    /// void vkCmdSetDepthBiasEnable(VkCommandBuffer commandBuffer, VkBool32 depthBiasEnable);
    /// ```
    public void CmdSetDepthBiasEnable(MemorySegment commandBuffer, int depthBiasEnable) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCmdSetDepthBiasEnable)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetDepthBiasEnable");
        try { Handles.MH_vkCmdSetDepthBiasEnable.invokeExact(handles.PFN_vkCmdSetDepthBiasEnable, commandBuffer, depthBiasEnable); }
        catch (Throwable e) { throw new RuntimeException("error in CmdSetDepthBiasEnable", e); }
    }

    /// ```
    /// void vkCmdSetPrimitiveRestartEnable(VkCommandBuffer commandBuffer, VkBool32 primitiveRestartEnable);
    /// ```
    public void CmdSetPrimitiveRestartEnable(MemorySegment commandBuffer, int primitiveRestartEnable) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCmdSetPrimitiveRestartEnable)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetPrimitiveRestartEnable");
        try { Handles.MH_vkCmdSetPrimitiveRestartEnable.invokeExact(handles.PFN_vkCmdSetPrimitiveRestartEnable, commandBuffer, primitiveRestartEnable); }
        catch (Throwable e) { throw new RuntimeException("error in CmdSetPrimitiveRestartEnable", e); }
    }

    /// ```
    /// void vkGetDeviceBufferMemoryRequirements(VkDevice device, const VkDeviceBufferMemoryRequirements* pInfo, VkMemoryRequirements2* pMemoryRequirements);
    /// ```
    public void GetDeviceBufferMemoryRequirements(MemorySegment device, MemorySegment pInfo, MemorySegment pMemoryRequirements) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkGetDeviceBufferMemoryRequirements)) throw new SymbolNotFoundError("Symbol not found: vkGetDeviceBufferMemoryRequirements");
        try { Handles.MH_vkGetDeviceBufferMemoryRequirements.invokeExact(handles.PFN_vkGetDeviceBufferMemoryRequirements, device, pInfo, pMemoryRequirements); }
        catch (Throwable e) { throw new RuntimeException("error in GetDeviceBufferMemoryRequirements", e); }
    }

    /// ```
    /// void vkGetDeviceImageMemoryRequirements(VkDevice device, const VkDeviceImageMemoryRequirements* pInfo, VkMemoryRequirements2* pMemoryRequirements);
    /// ```
    public void GetDeviceImageMemoryRequirements(MemorySegment device, MemorySegment pInfo, MemorySegment pMemoryRequirements) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkGetDeviceImageMemoryRequirements)) throw new SymbolNotFoundError("Symbol not found: vkGetDeviceImageMemoryRequirements");
        try { Handles.MH_vkGetDeviceImageMemoryRequirements.invokeExact(handles.PFN_vkGetDeviceImageMemoryRequirements, device, pInfo, pMemoryRequirements); }
        catch (Throwable e) { throw new RuntimeException("error in GetDeviceImageMemoryRequirements", e); }
    }

    /// ```
    /// void vkGetDeviceImageSparseMemoryRequirements(VkDevice device, const VkDeviceImageMemoryRequirements* pInfo, uint32_t* pSparseMemoryRequirementCount, VkSparseImageMemoryRequirements2* pSparseMemoryRequirements);
    /// ```
    public void GetDeviceImageSparseMemoryRequirements(MemorySegment device, MemorySegment pInfo, MemorySegment pSparseMemoryRequirementCount, MemorySegment pSparseMemoryRequirements) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkGetDeviceImageSparseMemoryRequirements)) throw new SymbolNotFoundError("Symbol not found: vkGetDeviceImageSparseMemoryRequirements");
        try { Handles.MH_vkGetDeviceImageSparseMemoryRequirements.invokeExact(handles.PFN_vkGetDeviceImageSparseMemoryRequirements, device, pInfo, pSparseMemoryRequirementCount, pSparseMemoryRequirements); }
        catch (Throwable e) { throw new RuntimeException("error in GetDeviceImageSparseMemoryRequirements", e); }
    }

}
