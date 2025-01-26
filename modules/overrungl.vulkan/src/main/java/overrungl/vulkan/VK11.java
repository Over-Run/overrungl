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
public final class VK11 {
    public static final int VK_SUBGROUP_FEATURE_BASIC_BIT = 0x00000001;
    public static final int VK_SUBGROUP_FEATURE_VOTE_BIT = 0x00000002;
    public static final int VK_SUBGROUP_FEATURE_ARITHMETIC_BIT = 0x00000004;
    public static final int VK_SUBGROUP_FEATURE_BALLOT_BIT = 0x00000008;
    public static final int VK_SUBGROUP_FEATURE_SHUFFLE_BIT = 0x00000010;
    public static final int VK_SUBGROUP_FEATURE_SHUFFLE_RELATIVE_BIT = 0x00000020;
    public static final int VK_SUBGROUP_FEATURE_CLUSTERED_BIT = 0x00000040;
    public static final int VK_SUBGROUP_FEATURE_QUAD_BIT = 0x00000080;
    public static final int VK_PEER_MEMORY_FEATURE_COPY_SRC_BIT = 0x00000001;
    public static final int VK_PEER_MEMORY_FEATURE_COPY_DST_BIT = 0x00000002;
    public static final int VK_PEER_MEMORY_FEATURE_GENERIC_SRC_BIT = 0x00000004;
    public static final int VK_PEER_MEMORY_FEATURE_GENERIC_DST_BIT = 0x00000008;
    public static final int VK_MEMORY_ALLOCATE_DEVICE_MASK_BIT = 0x00000001;
    public static final int VK_POINT_CLIPPING_BEHAVIOR_ALL_CLIP_PLANES = 0;
    public static final int VK_POINT_CLIPPING_BEHAVIOR_USER_CLIP_PLANES_ONLY = 1;
    public static final int VK_TESSELLATION_DOMAIN_ORIGIN_UPPER_LEFT = 0;
    public static final int VK_TESSELLATION_DOMAIN_ORIGIN_LOWER_LEFT = 1;
    public static final int VK_SAMPLER_YCBCR_MODEL_CONVERSION_RGB_IDENTITY = 0;
    public static final int VK_SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_IDENTITY = 1;
    public static final int VK_SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_709 = 2;
    public static final int VK_SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_601 = 3;
    public static final int VK_SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_2020 = 4;
    public static final int VK_SAMPLER_YCBCR_RANGE_ITU_FULL = 0;
    public static final int VK_SAMPLER_YCBCR_RANGE_ITU_NARROW = 1;
    public static final int VK_CHROMA_LOCATION_COSITED_EVEN = 0;
    public static final int VK_CHROMA_LOCATION_MIDPOINT = 1;
    public static final int VK_DESCRIPTOR_UPDATE_TEMPLATE_TYPE_DESCRIPTOR_SET = 0;
    public static final int VK_EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_FD_BIT = 0x00000001;
    public static final int VK_EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_WIN32_BIT = 0x00000002;
    public static final int VK_EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_WIN32_KMT_BIT = 0x00000004;
    public static final int VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_TEXTURE_BIT = 0x00000008;
    public static final int VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_TEXTURE_KMT_BIT = 0x00000010;
    public static final int VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D12_HEAP_BIT = 0x00000020;
    public static final int VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D12_RESOURCE_BIT = 0x00000040;
    public static final int VK_EXTERNAL_MEMORY_FEATURE_DEDICATED_ONLY_BIT = 0x00000001;
    public static final int VK_EXTERNAL_MEMORY_FEATURE_EXPORTABLE_BIT = 0x00000002;
    public static final int VK_EXTERNAL_MEMORY_FEATURE_IMPORTABLE_BIT = 0x00000004;
    public static final int VK_EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_FD_BIT = 0x00000001;
    public static final int VK_EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_WIN32_BIT = 0x00000002;
    public static final int VK_EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_WIN32_KMT_BIT = 0x00000004;
    public static final int VK_EXTERNAL_FENCE_HANDLE_TYPE_SYNC_FD_BIT = 0x00000008;
    public static final int VK_EXTERNAL_FENCE_FEATURE_EXPORTABLE_BIT = 0x00000001;
    public static final int VK_EXTERNAL_FENCE_FEATURE_IMPORTABLE_BIT = 0x00000002;
    public static final int VK_FENCE_IMPORT_TEMPORARY_BIT = 0x00000001;
    public static final int VK_SEMAPHORE_IMPORT_TEMPORARY_BIT = 0x00000001;
    public static final int VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_FD_BIT = 0x00000001;
    public static final int VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_WIN32_BIT = 0x00000002;
    public static final int VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_WIN32_KMT_BIT = 0x00000004;
    public static final int VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_D3D12_FENCE_BIT = 0x00000008;
    public static final int VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_D3D11_FENCE_BIT = 0x00000008;
    public static final int VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_SYNC_FD_BIT = 0x00000010;
    public static final int VK_EXTERNAL_SEMAPHORE_FEATURE_EXPORTABLE_BIT = 0x00000001;
    public static final int VK_EXTERNAL_SEMAPHORE_FEATURE_IMPORTABLE_BIT = 0x00000002;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SUBGROUP_PROPERTIES = 1000094000;
    public static final int VK_STRUCTURE_TYPE_BIND_BUFFER_MEMORY_INFO = 1000157000;
    public static final int VK_STRUCTURE_TYPE_BIND_IMAGE_MEMORY_INFO = 1000157001;
    public static final int VK_IMAGE_CREATE_ALIAS_BIT = 0x00000400;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_16BIT_STORAGE_FEATURES = 1000083000;
    public static final int VK_STRUCTURE_TYPE_MEMORY_DEDICATED_REQUIREMENTS = 1000127000;
    public static final int VK_STRUCTURE_TYPE_MEMORY_DEDICATED_ALLOCATE_INFO = 1000127001;
    public static final int VK_STRUCTURE_TYPE_MEMORY_ALLOCATE_FLAGS_INFO = 1000060000;
    public static final int VK_STRUCTURE_TYPE_DEVICE_GROUP_RENDER_PASS_BEGIN_INFO = 1000060003;
    public static final int VK_STRUCTURE_TYPE_DEVICE_GROUP_COMMAND_BUFFER_BEGIN_INFO = 1000060004;
    public static final int VK_STRUCTURE_TYPE_DEVICE_GROUP_SUBMIT_INFO = 1000060005;
    public static final int VK_STRUCTURE_TYPE_DEVICE_GROUP_BIND_SPARSE_INFO = 1000060006;
    public static final int VK_PIPELINE_CREATE_VIEW_INDEX_FROM_DEVICE_INDEX_BIT = 0x00000008;
    public static final int VK_PIPELINE_CREATE_DISPATCH_BASE_BIT = 0x00000010;
    public static final int VK_PIPELINE_CREATE_DISPATCH_BASE = 0x00000010;
    public static final int VK_DEPENDENCY_DEVICE_GROUP_BIT = 0x00000004;
    public static final int VK_STRUCTURE_TYPE_BIND_BUFFER_MEMORY_DEVICE_GROUP_INFO = 1000060013;
    public static final int VK_STRUCTURE_TYPE_BIND_IMAGE_MEMORY_DEVICE_GROUP_INFO = 1000060014;
    public static final int VK_IMAGE_CREATE_SPLIT_INSTANCE_BIND_REGIONS_BIT = 0x00000040;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_GROUP_PROPERTIES = 1000070000;
    public static final int VK_STRUCTURE_TYPE_DEVICE_GROUP_DEVICE_CREATE_INFO = 1000070001;
    public static final int VK_MAX_DEVICE_GROUP_SIZE = 32;
    public static final int VK_MEMORY_HEAP_MULTI_INSTANCE_BIT = 0x00000002;
    public static final int VK_STRUCTURE_TYPE_BUFFER_MEMORY_REQUIREMENTS_INFO_2 = 1000146000;
    public static final int VK_STRUCTURE_TYPE_IMAGE_MEMORY_REQUIREMENTS_INFO_2 = 1000146001;
    public static final int VK_STRUCTURE_TYPE_IMAGE_SPARSE_MEMORY_REQUIREMENTS_INFO_2 = 1000146002;
    public static final int VK_STRUCTURE_TYPE_MEMORY_REQUIREMENTS_2 = 1000146003;
    public static final int VK_STRUCTURE_TYPE_SPARSE_IMAGE_MEMORY_REQUIREMENTS_2 = 1000146004;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FEATURES_2 = 1000059000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PROPERTIES_2 = 1000059001;
    public static final int VK_STRUCTURE_TYPE_FORMAT_PROPERTIES_2 = 1000059002;
    public static final int VK_STRUCTURE_TYPE_IMAGE_FORMAT_PROPERTIES_2 = 1000059003;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_FORMAT_INFO_2 = 1000059004;
    public static final int VK_STRUCTURE_TYPE_QUEUE_FAMILY_PROPERTIES_2 = 1000059005;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MEMORY_PROPERTIES_2 = 1000059006;
    public static final int VK_STRUCTURE_TYPE_SPARSE_IMAGE_FORMAT_PROPERTIES_2 = 1000059007;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SPARSE_IMAGE_FORMAT_INFO_2 = 1000059008;
    public static final int VK_ERROR_OUT_OF_POOL_MEMORY = -1000069000;
    public static final int VK_FORMAT_FEATURE_TRANSFER_SRC_BIT = 0x00004000;
    public static final int VK_FORMAT_FEATURE_TRANSFER_DST_BIT = 0x00008000;
    public static final int VK_IMAGE_CREATE_2D_ARRAY_COMPATIBLE_BIT = 0x00000020;
    public static final int VK_IMAGE_CREATE_BLOCK_TEXEL_VIEW_COMPATIBLE_BIT = 0x00000080;
    public static final int VK_IMAGE_CREATE_EXTENDED_USAGE_BIT = 0x00000100;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_POINT_CLIPPING_PROPERTIES = 1000117000;
    public static final int VK_STRUCTURE_TYPE_RENDER_PASS_INPUT_ATTACHMENT_ASPECT_CREATE_INFO = 1000117001;
    public static final int VK_STRUCTURE_TYPE_IMAGE_VIEW_USAGE_CREATE_INFO = 1000117002;
    public static final int VK_STRUCTURE_TYPE_PIPELINE_TESSELLATION_DOMAIN_ORIGIN_STATE_CREATE_INFO = 1000117003;
    public static final int VK_IMAGE_LAYOUT_DEPTH_READ_ONLY_STENCIL_ATTACHMENT_OPTIMAL = 1000117000;
    public static final int VK_IMAGE_LAYOUT_DEPTH_ATTACHMENT_STENCIL_READ_ONLY_OPTIMAL = 1000117001;
    public static final int VK_STRUCTURE_TYPE_RENDER_PASS_MULTIVIEW_CREATE_INFO = 1000053000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MULTIVIEW_FEATURES = 1000053001;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MULTIVIEW_PROPERTIES = 1000053002;
    public static final int VK_DEPENDENCY_VIEW_LOCAL_BIT = 0x00000002;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VARIABLE_POINTERS_FEATURES = 1000120000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VARIABLE_POINTER_FEATURES = 1000120000;
    public static final int VK_STRUCTURE_TYPE_PROTECTED_SUBMIT_INFO = 1000145000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PROTECTED_MEMORY_FEATURES = 1000145001;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PROTECTED_MEMORY_PROPERTIES = 1000145002;
    public static final int VK_STRUCTURE_TYPE_DEVICE_QUEUE_INFO_2 = 1000145003;
    public static final int VK_QUEUE_PROTECTED_BIT = 0x00000010;
    public static final int VK_DEVICE_QUEUE_CREATE_PROTECTED_BIT = 0x00000001;
    public static final int VK_MEMORY_PROPERTY_PROTECTED_BIT = 0x00000020;
    public static final int VK_BUFFER_CREATE_PROTECTED_BIT = 0x00000008;
    public static final int VK_IMAGE_CREATE_PROTECTED_BIT = 0x00000800;
    public static final int VK_COMMAND_POOL_CREATE_PROTECTED_BIT = 0x00000004;
    public static final int VK_STRUCTURE_TYPE_SAMPLER_YCBCR_CONVERSION_CREATE_INFO = 1000156000;
    public static final int VK_STRUCTURE_TYPE_SAMPLER_YCBCR_CONVERSION_INFO = 1000156001;
    public static final int VK_STRUCTURE_TYPE_BIND_IMAGE_PLANE_MEMORY_INFO = 1000156002;
    public static final int VK_STRUCTURE_TYPE_IMAGE_PLANE_MEMORY_REQUIREMENTS_INFO = 1000156003;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SAMPLER_YCBCR_CONVERSION_FEATURES = 1000156004;
    public static final int VK_STRUCTURE_TYPE_SAMPLER_YCBCR_CONVERSION_IMAGE_FORMAT_PROPERTIES = 1000156005;
    public static final int VK_OBJECT_TYPE_SAMPLER_YCBCR_CONVERSION = 1000156000;
    public static final int VK_FORMAT_G8B8G8R8_422_UNORM = 1000156000;
    public static final int VK_FORMAT_B8G8R8G8_422_UNORM = 1000156001;
    public static final int VK_FORMAT_G8_B8_R8_3PLANE_420_UNORM = 1000156002;
    public static final int VK_FORMAT_G8_B8R8_2PLANE_420_UNORM = 1000156003;
    public static final int VK_FORMAT_G8_B8_R8_3PLANE_422_UNORM = 1000156004;
    public static final int VK_FORMAT_G8_B8R8_2PLANE_422_UNORM = 1000156005;
    public static final int VK_FORMAT_G8_B8_R8_3PLANE_444_UNORM = 1000156006;
    public static final int VK_FORMAT_R10X6_UNORM_PACK16 = 1000156007;
    public static final int VK_FORMAT_R10X6G10X6_UNORM_2PACK16 = 1000156008;
    public static final int VK_FORMAT_R10X6G10X6B10X6A10X6_UNORM_4PACK16 = 1000156009;
    public static final int VK_FORMAT_G10X6B10X6G10X6R10X6_422_UNORM_4PACK16 = 1000156010;
    public static final int VK_FORMAT_B10X6G10X6R10X6G10X6_422_UNORM_4PACK16 = 1000156011;
    public static final int VK_FORMAT_G10X6_B10X6_R10X6_3PLANE_420_UNORM_3PACK16 = 1000156012;
    public static final int VK_FORMAT_G10X6_B10X6R10X6_2PLANE_420_UNORM_3PACK16 = 1000156013;
    public static final int VK_FORMAT_G10X6_B10X6_R10X6_3PLANE_422_UNORM_3PACK16 = 1000156014;
    public static final int VK_FORMAT_G10X6_B10X6R10X6_2PLANE_422_UNORM_3PACK16 = 1000156015;
    public static final int VK_FORMAT_G10X6_B10X6_R10X6_3PLANE_444_UNORM_3PACK16 = 1000156016;
    public static final int VK_FORMAT_R12X4_UNORM_PACK16 = 1000156017;
    public static final int VK_FORMAT_R12X4G12X4_UNORM_2PACK16 = 1000156018;
    public static final int VK_FORMAT_R12X4G12X4B12X4A12X4_UNORM_4PACK16 = 1000156019;
    public static final int VK_FORMAT_G12X4B12X4G12X4R12X4_422_UNORM_4PACK16 = 1000156020;
    public static final int VK_FORMAT_B12X4G12X4R12X4G12X4_422_UNORM_4PACK16 = 1000156021;
    public static final int VK_FORMAT_G12X4_B12X4_R12X4_3PLANE_420_UNORM_3PACK16 = 1000156022;
    public static final int VK_FORMAT_G12X4_B12X4R12X4_2PLANE_420_UNORM_3PACK16 = 1000156023;
    public static final int VK_FORMAT_G12X4_B12X4_R12X4_3PLANE_422_UNORM_3PACK16 = 1000156024;
    public static final int VK_FORMAT_G12X4_B12X4R12X4_2PLANE_422_UNORM_3PACK16 = 1000156025;
    public static final int VK_FORMAT_G12X4_B12X4_R12X4_3PLANE_444_UNORM_3PACK16 = 1000156026;
    public static final int VK_FORMAT_G16B16G16R16_422_UNORM = 1000156027;
    public static final int VK_FORMAT_B16G16R16G16_422_UNORM = 1000156028;
    public static final int VK_FORMAT_G16_B16_R16_3PLANE_420_UNORM = 1000156029;
    public static final int VK_FORMAT_G16_B16R16_2PLANE_420_UNORM = 1000156030;
    public static final int VK_FORMAT_G16_B16_R16_3PLANE_422_UNORM = 1000156031;
    public static final int VK_FORMAT_G16_B16R16_2PLANE_422_UNORM = 1000156032;
    public static final int VK_FORMAT_G16_B16_R16_3PLANE_444_UNORM = 1000156033;
    public static final int VK_IMAGE_ASPECT_PLANE_0_BIT = 0x00000010;
    public static final int VK_IMAGE_ASPECT_PLANE_1_BIT = 0x00000020;
    public static final int VK_IMAGE_ASPECT_PLANE_2_BIT = 0x00000040;
    public static final int VK_IMAGE_CREATE_DISJOINT_BIT = 0x00000200;
    public static final int VK_FORMAT_FEATURE_MIDPOINT_CHROMA_SAMPLES_BIT = 0x00020000;
    public static final int VK_FORMAT_FEATURE_SAMPLED_IMAGE_YCBCR_CONVERSION_LINEAR_FILTER_BIT = 0x00040000;
    public static final int VK_FORMAT_FEATURE_SAMPLED_IMAGE_YCBCR_CONVERSION_SEPARATE_RECONSTRUCTION_FILTER_BIT = 0x00080000;
    public static final int VK_FORMAT_FEATURE_SAMPLED_IMAGE_YCBCR_CONVERSION_CHROMA_RECONSTRUCTION_EXPLICIT_BIT = 0x00100000;
    public static final int VK_FORMAT_FEATURE_SAMPLED_IMAGE_YCBCR_CONVERSION_CHROMA_RECONSTRUCTION_EXPLICIT_FORCEABLE_BIT = 0x00200000;
    public static final int VK_FORMAT_FEATURE_DISJOINT_BIT = 0x00400000;
    public static final int VK_FORMAT_FEATURE_COSITED_CHROMA_SAMPLES_BIT = 0x00800000;
    public static final int VK_STRUCTURE_TYPE_DESCRIPTOR_UPDATE_TEMPLATE_CREATE_INFO = 1000085000;
    public static final int VK_OBJECT_TYPE_DESCRIPTOR_UPDATE_TEMPLATE = 1000085000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_IMAGE_FORMAT_INFO = 1000071000;
    public static final int VK_STRUCTURE_TYPE_EXTERNAL_IMAGE_FORMAT_PROPERTIES = 1000071001;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_BUFFER_INFO = 1000071002;
    public static final int VK_STRUCTURE_TYPE_EXTERNAL_BUFFER_PROPERTIES = 1000071003;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_ID_PROPERTIES = 1000071004;
    public static final int VK_LUID_SIZE = 8;
    public static final int VK_STRUCTURE_TYPE_EXTERNAL_MEMORY_BUFFER_CREATE_INFO = 1000072000;
    public static final int VK_STRUCTURE_TYPE_EXTERNAL_MEMORY_IMAGE_CREATE_INFO = 1000072001;
    public static final int VK_STRUCTURE_TYPE_EXPORT_MEMORY_ALLOCATE_INFO = 1000072002;
    public static final int VK_ERROR_INVALID_EXTERNAL_HANDLE = -1000072003;
    public static final int VK_QUEUE_FAMILY_EXTERNAL = (~1);
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_FENCE_INFO = 1000112000;
    public static final int VK_STRUCTURE_TYPE_EXTERNAL_FENCE_PROPERTIES = 1000112001;
    public static final int VK_STRUCTURE_TYPE_EXPORT_FENCE_CREATE_INFO = 1000113000;
    public static final int VK_STRUCTURE_TYPE_EXPORT_SEMAPHORE_CREATE_INFO = 1000077000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_SEMAPHORE_INFO = 1000076000;
    public static final int VK_STRUCTURE_TYPE_EXTERNAL_SEMAPHORE_PROPERTIES = 1000076001;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_3_PROPERTIES = 1000168000;
    public static final int VK_STRUCTURE_TYPE_DESCRIPTOR_SET_LAYOUT_SUPPORT = 1000168001;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_DRAW_PARAMETERS_FEATURES = 1000063000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_DRAW_PARAMETER_FEATURES = 1000063000;
    public static final class Handles {
        public static final MethodHandle MH_vkEnumerateInstanceVersion = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkBindBufferMemory2 = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkBindImageMemory2 = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetDeviceGroupPeerMemoryFeatures = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdSetDeviceMask = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_vkCmdDispatchBase = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_vkEnumeratePhysicalDeviceGroups = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetImageMemoryRequirements2 = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetBufferMemoryRequirements2 = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetImageSparseMemoryRequirements2 = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetPhysicalDeviceFeatures2 = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetPhysicalDeviceProperties2 = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetPhysicalDeviceFormatProperties2 = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetPhysicalDeviceImageFormatProperties2 = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetPhysicalDeviceQueueFamilyProperties2 = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetPhysicalDeviceMemoryProperties2 = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetPhysicalDeviceSparseImageFormatProperties2 = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkTrimCommandPool = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_vkGetDeviceQueue2 = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCreateSamplerYcbcrConversion = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkDestroySamplerYcbcrConversion = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCreateDescriptorUpdateTemplate = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkDestroyDescriptorUpdateTemplate = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkUpdateDescriptorSetWithTemplate = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetPhysicalDeviceExternalBufferProperties = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetPhysicalDeviceExternalFenceProperties = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetPhysicalDeviceExternalSemaphoreProperties = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetDescriptorSetLayoutSupport = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        private Handles() {}
    }

    private VK11() {}

    /// ```
    /// (int) VkResult vkEnumerateInstanceVersion(uint32_t* pApiVersion);
    /// ```
    public static int vkEnumerateInstanceVersion(MemorySegment pApiVersion) {
        if (MemoryUtil.isNullPointer(VK.globalCommands().PFN_vkEnumerateInstanceVersion)) throw new SymbolNotFoundError("Symbol not found: vkEnumerateInstanceVersion");
        try { return (int) Handles.MH_vkEnumerateInstanceVersion.invokeExact(VK.globalCommands().PFN_vkEnumerateInstanceVersion, pApiVersion); }
        catch (Throwable e) { throw new RuntimeException("error in vkEnumerateInstanceVersion", e); }
    }

    /// ```
    /// (int) VkResult vkBindBufferMemory2((struct VkDevice*) VkDevice device, uint32_t bindInfoCount, const VkBindBufferMemoryInfo* pBindInfos);
    /// ```
    public static int vkBindBufferMemory2(VkDevice device, int bindInfoCount, MemorySegment pBindInfos) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkBindBufferMemory2)) throw new SymbolNotFoundError("Symbol not found: vkBindBufferMemory2");
        try { return (int) Handles.MH_vkBindBufferMemory2.invokeExact(device.capabilities().PFN_vkBindBufferMemory2, device.segment(), bindInfoCount, pBindInfos); }
        catch (Throwable e) { throw new RuntimeException("error in vkBindBufferMemory2", e); }
    }

    /// ```
    /// (int) VkResult vkBindImageMemory2((struct VkDevice*) VkDevice device, uint32_t bindInfoCount, const VkBindImageMemoryInfo* pBindInfos);
    /// ```
    public static int vkBindImageMemory2(VkDevice device, int bindInfoCount, MemorySegment pBindInfos) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkBindImageMemory2)) throw new SymbolNotFoundError("Symbol not found: vkBindImageMemory2");
        try { return (int) Handles.MH_vkBindImageMemory2.invokeExact(device.capabilities().PFN_vkBindImageMemory2, device.segment(), bindInfoCount, pBindInfos); }
        catch (Throwable e) { throw new RuntimeException("error in vkBindImageMemory2", e); }
    }

    /// ```
    /// void vkGetDeviceGroupPeerMemoryFeatures((struct VkDevice*) VkDevice device, uint32_t heapIndex, uint32_t localDeviceIndex, uint32_t remoteDeviceIndex, VkPeerMemoryFeatureFlags* pPeerMemoryFeatures);
    /// ```
    public static void vkGetDeviceGroupPeerMemoryFeatures(VkDevice device, int heapIndex, int localDeviceIndex, int remoteDeviceIndex, MemorySegment pPeerMemoryFeatures) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkGetDeviceGroupPeerMemoryFeatures)) throw new SymbolNotFoundError("Symbol not found: vkGetDeviceGroupPeerMemoryFeatures");
        try { Handles.MH_vkGetDeviceGroupPeerMemoryFeatures.invokeExact(device.capabilities().PFN_vkGetDeviceGroupPeerMemoryFeatures, device.segment(), heapIndex, localDeviceIndex, remoteDeviceIndex, pPeerMemoryFeatures); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetDeviceGroupPeerMemoryFeatures", e); }
    }

    /// ```
    /// void vkCmdSetDeviceMask((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, uint32_t deviceMask);
    /// ```
    public static void vkCmdSetDeviceMask(VkCommandBuffer commandBuffer, int deviceMask) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetDeviceMask)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetDeviceMask");
        try { Handles.MH_vkCmdSetDeviceMask.invokeExact(commandBuffer.capabilities().PFN_vkCmdSetDeviceMask, commandBuffer.segment(), deviceMask); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetDeviceMask", e); }
    }

    /// ```
    /// void vkCmdDispatchBase((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, uint32_t baseGroupX, uint32_t baseGroupY, uint32_t baseGroupZ, uint32_t groupCountX, uint32_t groupCountY, uint32_t groupCountZ);
    /// ```
    public static void vkCmdDispatchBase(VkCommandBuffer commandBuffer, int baseGroupX, int baseGroupY, int baseGroupZ, int groupCountX, int groupCountY, int groupCountZ) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdDispatchBase)) throw new SymbolNotFoundError("Symbol not found: vkCmdDispatchBase");
        try { Handles.MH_vkCmdDispatchBase.invokeExact(commandBuffer.capabilities().PFN_vkCmdDispatchBase, commandBuffer.segment(), baseGroupX, baseGroupY, baseGroupZ, groupCountX, groupCountY, groupCountZ); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdDispatchBase", e); }
    }

    /// ```
    /// (int) VkResult vkEnumeratePhysicalDeviceGroups((struct VkInstance*) VkInstance instance, uint32_t* pPhysicalDeviceGroupCount, VkPhysicalDeviceGroupProperties* pPhysicalDeviceGroupProperties);
    /// ```
    public static int vkEnumeratePhysicalDeviceGroups(VkInstance instance, MemorySegment pPhysicalDeviceGroupCount, MemorySegment pPhysicalDeviceGroupProperties) {
        if (MemoryUtil.isNullPointer(instance.capabilities().PFN_vkEnumeratePhysicalDeviceGroups)) throw new SymbolNotFoundError("Symbol not found: vkEnumeratePhysicalDeviceGroups");
        try { return (int) Handles.MH_vkEnumeratePhysicalDeviceGroups.invokeExact(instance.capabilities().PFN_vkEnumeratePhysicalDeviceGroups, instance.segment(), pPhysicalDeviceGroupCount, pPhysicalDeviceGroupProperties); }
        catch (Throwable e) { throw new RuntimeException("error in vkEnumeratePhysicalDeviceGroups", e); }
    }

    /// ```
    /// void vkGetImageMemoryRequirements2((struct VkDevice*) VkDevice device, const VkImageMemoryRequirementsInfo2* pInfo, VkMemoryRequirements2* pMemoryRequirements);
    /// ```
    public static void vkGetImageMemoryRequirements2(VkDevice device, MemorySegment pInfo, MemorySegment pMemoryRequirements) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkGetImageMemoryRequirements2)) throw new SymbolNotFoundError("Symbol not found: vkGetImageMemoryRequirements2");
        try { Handles.MH_vkGetImageMemoryRequirements2.invokeExact(device.capabilities().PFN_vkGetImageMemoryRequirements2, device.segment(), pInfo, pMemoryRequirements); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetImageMemoryRequirements2", e); }
    }

    /// ```
    /// void vkGetBufferMemoryRequirements2((struct VkDevice*) VkDevice device, const VkBufferMemoryRequirementsInfo2* pInfo, VkMemoryRequirements2* pMemoryRequirements);
    /// ```
    public static void vkGetBufferMemoryRequirements2(VkDevice device, MemorySegment pInfo, MemorySegment pMemoryRequirements) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkGetBufferMemoryRequirements2)) throw new SymbolNotFoundError("Symbol not found: vkGetBufferMemoryRequirements2");
        try { Handles.MH_vkGetBufferMemoryRequirements2.invokeExact(device.capabilities().PFN_vkGetBufferMemoryRequirements2, device.segment(), pInfo, pMemoryRequirements); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetBufferMemoryRequirements2", e); }
    }

    /// ```
    /// void vkGetImageSparseMemoryRequirements2((struct VkDevice*) VkDevice device, const VkImageSparseMemoryRequirementsInfo2* pInfo, uint32_t* pSparseMemoryRequirementCount, VkSparseImageMemoryRequirements2* pSparseMemoryRequirements);
    /// ```
    public static void vkGetImageSparseMemoryRequirements2(VkDevice device, MemorySegment pInfo, MemorySegment pSparseMemoryRequirementCount, MemorySegment pSparseMemoryRequirements) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkGetImageSparseMemoryRequirements2)) throw new SymbolNotFoundError("Symbol not found: vkGetImageSparseMemoryRequirements2");
        try { Handles.MH_vkGetImageSparseMemoryRequirements2.invokeExact(device.capabilities().PFN_vkGetImageSparseMemoryRequirements2, device.segment(), pInfo, pSparseMemoryRequirementCount, pSparseMemoryRequirements); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetImageSparseMemoryRequirements2", e); }
    }

    /// ```
    /// void vkGetPhysicalDeviceFeatures2((struct VkPhysicalDevice*) VkPhysicalDevice physicalDevice, VkPhysicalDeviceFeatures2* pFeatures);
    /// ```
    public static void vkGetPhysicalDeviceFeatures2(VkPhysicalDevice physicalDevice, MemorySegment pFeatures) {
        if (MemoryUtil.isNullPointer(physicalDevice.capabilities().PFN_vkGetPhysicalDeviceFeatures2)) throw new SymbolNotFoundError("Symbol not found: vkGetPhysicalDeviceFeatures2");
        try { Handles.MH_vkGetPhysicalDeviceFeatures2.invokeExact(physicalDevice.capabilities().PFN_vkGetPhysicalDeviceFeatures2, physicalDevice.segment(), pFeatures); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetPhysicalDeviceFeatures2", e); }
    }

    /// ```
    /// void vkGetPhysicalDeviceProperties2((struct VkPhysicalDevice*) VkPhysicalDevice physicalDevice, VkPhysicalDeviceProperties2* pProperties);
    /// ```
    public static void vkGetPhysicalDeviceProperties2(VkPhysicalDevice physicalDevice, MemorySegment pProperties) {
        if (MemoryUtil.isNullPointer(physicalDevice.capabilities().PFN_vkGetPhysicalDeviceProperties2)) throw new SymbolNotFoundError("Symbol not found: vkGetPhysicalDeviceProperties2");
        try { Handles.MH_vkGetPhysicalDeviceProperties2.invokeExact(physicalDevice.capabilities().PFN_vkGetPhysicalDeviceProperties2, physicalDevice.segment(), pProperties); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetPhysicalDeviceProperties2", e); }
    }

    /// ```
    /// void vkGetPhysicalDeviceFormatProperties2((struct VkPhysicalDevice*) VkPhysicalDevice physicalDevice, (int) VkFormat format, VkFormatProperties2* pFormatProperties);
    /// ```
    public static void vkGetPhysicalDeviceFormatProperties2(VkPhysicalDevice physicalDevice, int format, MemorySegment pFormatProperties) {
        if (MemoryUtil.isNullPointer(physicalDevice.capabilities().PFN_vkGetPhysicalDeviceFormatProperties2)) throw new SymbolNotFoundError("Symbol not found: vkGetPhysicalDeviceFormatProperties2");
        try { Handles.MH_vkGetPhysicalDeviceFormatProperties2.invokeExact(physicalDevice.capabilities().PFN_vkGetPhysicalDeviceFormatProperties2, physicalDevice.segment(), format, pFormatProperties); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetPhysicalDeviceFormatProperties2", e); }
    }

    /// ```
    /// (int) VkResult vkGetPhysicalDeviceImageFormatProperties2((struct VkPhysicalDevice*) VkPhysicalDevice physicalDevice, const VkPhysicalDeviceImageFormatInfo2* pImageFormatInfo, VkImageFormatProperties2* pImageFormatProperties);
    /// ```
    public static int vkGetPhysicalDeviceImageFormatProperties2(VkPhysicalDevice physicalDevice, MemorySegment pImageFormatInfo, MemorySegment pImageFormatProperties) {
        if (MemoryUtil.isNullPointer(physicalDevice.capabilities().PFN_vkGetPhysicalDeviceImageFormatProperties2)) throw new SymbolNotFoundError("Symbol not found: vkGetPhysicalDeviceImageFormatProperties2");
        try { return (int) Handles.MH_vkGetPhysicalDeviceImageFormatProperties2.invokeExact(physicalDevice.capabilities().PFN_vkGetPhysicalDeviceImageFormatProperties2, physicalDevice.segment(), pImageFormatInfo, pImageFormatProperties); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetPhysicalDeviceImageFormatProperties2", e); }
    }

    /// ```
    /// void vkGetPhysicalDeviceQueueFamilyProperties2((struct VkPhysicalDevice*) VkPhysicalDevice physicalDevice, uint32_t* pQueueFamilyPropertyCount, VkQueueFamilyProperties2* pQueueFamilyProperties);
    /// ```
    public static void vkGetPhysicalDeviceQueueFamilyProperties2(VkPhysicalDevice physicalDevice, MemorySegment pQueueFamilyPropertyCount, MemorySegment pQueueFamilyProperties) {
        if (MemoryUtil.isNullPointer(physicalDevice.capabilities().PFN_vkGetPhysicalDeviceQueueFamilyProperties2)) throw new SymbolNotFoundError("Symbol not found: vkGetPhysicalDeviceQueueFamilyProperties2");
        try { Handles.MH_vkGetPhysicalDeviceQueueFamilyProperties2.invokeExact(physicalDevice.capabilities().PFN_vkGetPhysicalDeviceQueueFamilyProperties2, physicalDevice.segment(), pQueueFamilyPropertyCount, pQueueFamilyProperties); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetPhysicalDeviceQueueFamilyProperties2", e); }
    }

    /// ```
    /// void vkGetPhysicalDeviceMemoryProperties2((struct VkPhysicalDevice*) VkPhysicalDevice physicalDevice, VkPhysicalDeviceMemoryProperties2* pMemoryProperties);
    /// ```
    public static void vkGetPhysicalDeviceMemoryProperties2(VkPhysicalDevice physicalDevice, MemorySegment pMemoryProperties) {
        if (MemoryUtil.isNullPointer(physicalDevice.capabilities().PFN_vkGetPhysicalDeviceMemoryProperties2)) throw new SymbolNotFoundError("Symbol not found: vkGetPhysicalDeviceMemoryProperties2");
        try { Handles.MH_vkGetPhysicalDeviceMemoryProperties2.invokeExact(physicalDevice.capabilities().PFN_vkGetPhysicalDeviceMemoryProperties2, physicalDevice.segment(), pMemoryProperties); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetPhysicalDeviceMemoryProperties2", e); }
    }

    /// ```
    /// void vkGetPhysicalDeviceSparseImageFormatProperties2((struct VkPhysicalDevice*) VkPhysicalDevice physicalDevice, const VkPhysicalDeviceSparseImageFormatInfo2* pFormatInfo, uint32_t* pPropertyCount, VkSparseImageFormatProperties2* pProperties);
    /// ```
    public static void vkGetPhysicalDeviceSparseImageFormatProperties2(VkPhysicalDevice physicalDevice, MemorySegment pFormatInfo, MemorySegment pPropertyCount, MemorySegment pProperties) {
        if (MemoryUtil.isNullPointer(physicalDevice.capabilities().PFN_vkGetPhysicalDeviceSparseImageFormatProperties2)) throw new SymbolNotFoundError("Symbol not found: vkGetPhysicalDeviceSparseImageFormatProperties2");
        try { Handles.MH_vkGetPhysicalDeviceSparseImageFormatProperties2.invokeExact(physicalDevice.capabilities().PFN_vkGetPhysicalDeviceSparseImageFormatProperties2, physicalDevice.segment(), pFormatInfo, pPropertyCount, pProperties); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetPhysicalDeviceSparseImageFormatProperties2", e); }
    }

    /// ```
    /// void vkTrimCommandPool((struct VkDevice*) VkDevice device, (uint64_t) VkCommandPool commandPool, ((uint32_t) VkFlags) VkCommandPoolTrimFlags flags);
    /// ```
    public static void vkTrimCommandPool(VkDevice device, long commandPool, int flags) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkTrimCommandPool)) throw new SymbolNotFoundError("Symbol not found: vkTrimCommandPool");
        try { Handles.MH_vkTrimCommandPool.invokeExact(device.capabilities().PFN_vkTrimCommandPool, device.segment(), commandPool, flags); }
        catch (Throwable e) { throw new RuntimeException("error in vkTrimCommandPool", e); }
    }

    /// ```
    /// void vkGetDeviceQueue2((struct VkDevice*) VkDevice device, const VkDeviceQueueInfo2* pQueueInfo, VkQueue* pQueue);
    /// ```
    public static void vkGetDeviceQueue2(VkDevice device, MemorySegment pQueueInfo, MemorySegment pQueue) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkGetDeviceQueue2)) throw new SymbolNotFoundError("Symbol not found: vkGetDeviceQueue2");
        try { Handles.MH_vkGetDeviceQueue2.invokeExact(device.capabilities().PFN_vkGetDeviceQueue2, device.segment(), pQueueInfo, pQueue); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetDeviceQueue2", e); }
    }

    /// ```
    /// (int) VkResult vkCreateSamplerYcbcrConversion((struct VkDevice*) VkDevice device, const VkSamplerYcbcrConversionCreateInfo* pCreateInfo, const VkAllocationCallbacks* pAllocator, VkSamplerYcbcrConversion* pYcbcrConversion);
    /// ```
    public static int vkCreateSamplerYcbcrConversion(VkDevice device, MemorySegment pCreateInfo, MemorySegment pAllocator, MemorySegment pYcbcrConversion) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkCreateSamplerYcbcrConversion)) throw new SymbolNotFoundError("Symbol not found: vkCreateSamplerYcbcrConversion");
        try { return (int) Handles.MH_vkCreateSamplerYcbcrConversion.invokeExact(device.capabilities().PFN_vkCreateSamplerYcbcrConversion, device.segment(), pCreateInfo, pAllocator, pYcbcrConversion); }
        catch (Throwable e) { throw new RuntimeException("error in vkCreateSamplerYcbcrConversion", e); }
    }

    /// ```
    /// void vkDestroySamplerYcbcrConversion((struct VkDevice*) VkDevice device, (uint64_t) VkSamplerYcbcrConversion ycbcrConversion, const VkAllocationCallbacks* pAllocator);
    /// ```
    public static void vkDestroySamplerYcbcrConversion(VkDevice device, long ycbcrConversion, MemorySegment pAllocator) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkDestroySamplerYcbcrConversion)) throw new SymbolNotFoundError("Symbol not found: vkDestroySamplerYcbcrConversion");
        try { Handles.MH_vkDestroySamplerYcbcrConversion.invokeExact(device.capabilities().PFN_vkDestroySamplerYcbcrConversion, device.segment(), ycbcrConversion, pAllocator); }
        catch (Throwable e) { throw new RuntimeException("error in vkDestroySamplerYcbcrConversion", e); }
    }

    /// ```
    /// (int) VkResult vkCreateDescriptorUpdateTemplate((struct VkDevice*) VkDevice device, const VkDescriptorUpdateTemplateCreateInfo* pCreateInfo, const VkAllocationCallbacks* pAllocator, VkDescriptorUpdateTemplate* pDescriptorUpdateTemplate);
    /// ```
    public static int vkCreateDescriptorUpdateTemplate(VkDevice device, MemorySegment pCreateInfo, MemorySegment pAllocator, MemorySegment pDescriptorUpdateTemplate) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkCreateDescriptorUpdateTemplate)) throw new SymbolNotFoundError("Symbol not found: vkCreateDescriptorUpdateTemplate");
        try { return (int) Handles.MH_vkCreateDescriptorUpdateTemplate.invokeExact(device.capabilities().PFN_vkCreateDescriptorUpdateTemplate, device.segment(), pCreateInfo, pAllocator, pDescriptorUpdateTemplate); }
        catch (Throwable e) { throw new RuntimeException("error in vkCreateDescriptorUpdateTemplate", e); }
    }

    /// ```
    /// void vkDestroyDescriptorUpdateTemplate((struct VkDevice*) VkDevice device, (uint64_t) VkDescriptorUpdateTemplate descriptorUpdateTemplate, const VkAllocationCallbacks* pAllocator);
    /// ```
    public static void vkDestroyDescriptorUpdateTemplate(VkDevice device, long descriptorUpdateTemplate, MemorySegment pAllocator) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkDestroyDescriptorUpdateTemplate)) throw new SymbolNotFoundError("Symbol not found: vkDestroyDescriptorUpdateTemplate");
        try { Handles.MH_vkDestroyDescriptorUpdateTemplate.invokeExact(device.capabilities().PFN_vkDestroyDescriptorUpdateTemplate, device.segment(), descriptorUpdateTemplate, pAllocator); }
        catch (Throwable e) { throw new RuntimeException("error in vkDestroyDescriptorUpdateTemplate", e); }
    }

    /// ```
    /// void vkUpdateDescriptorSetWithTemplate((struct VkDevice*) VkDevice device, (uint64_t) VkDescriptorSet descriptorSet, (uint64_t) VkDescriptorUpdateTemplate descriptorUpdateTemplate, const void* pData);
    /// ```
    public static void vkUpdateDescriptorSetWithTemplate(VkDevice device, long descriptorSet, long descriptorUpdateTemplate, MemorySegment pData) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkUpdateDescriptorSetWithTemplate)) throw new SymbolNotFoundError("Symbol not found: vkUpdateDescriptorSetWithTemplate");
        try { Handles.MH_vkUpdateDescriptorSetWithTemplate.invokeExact(device.capabilities().PFN_vkUpdateDescriptorSetWithTemplate, device.segment(), descriptorSet, descriptorUpdateTemplate, pData); }
        catch (Throwable e) { throw new RuntimeException("error in vkUpdateDescriptorSetWithTemplate", e); }
    }

    /// ```
    /// void vkGetPhysicalDeviceExternalBufferProperties((struct VkPhysicalDevice*) VkPhysicalDevice physicalDevice, const VkPhysicalDeviceExternalBufferInfo* pExternalBufferInfo, VkExternalBufferProperties* pExternalBufferProperties);
    /// ```
    public static void vkGetPhysicalDeviceExternalBufferProperties(VkPhysicalDevice physicalDevice, MemorySegment pExternalBufferInfo, MemorySegment pExternalBufferProperties) {
        if (MemoryUtil.isNullPointer(physicalDevice.capabilities().PFN_vkGetPhysicalDeviceExternalBufferProperties)) throw new SymbolNotFoundError("Symbol not found: vkGetPhysicalDeviceExternalBufferProperties");
        try { Handles.MH_vkGetPhysicalDeviceExternalBufferProperties.invokeExact(physicalDevice.capabilities().PFN_vkGetPhysicalDeviceExternalBufferProperties, physicalDevice.segment(), pExternalBufferInfo, pExternalBufferProperties); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetPhysicalDeviceExternalBufferProperties", e); }
    }

    /// ```
    /// void vkGetPhysicalDeviceExternalFenceProperties((struct VkPhysicalDevice*) VkPhysicalDevice physicalDevice, const VkPhysicalDeviceExternalFenceInfo* pExternalFenceInfo, VkExternalFenceProperties* pExternalFenceProperties);
    /// ```
    public static void vkGetPhysicalDeviceExternalFenceProperties(VkPhysicalDevice physicalDevice, MemorySegment pExternalFenceInfo, MemorySegment pExternalFenceProperties) {
        if (MemoryUtil.isNullPointer(physicalDevice.capabilities().PFN_vkGetPhysicalDeviceExternalFenceProperties)) throw new SymbolNotFoundError("Symbol not found: vkGetPhysicalDeviceExternalFenceProperties");
        try { Handles.MH_vkGetPhysicalDeviceExternalFenceProperties.invokeExact(physicalDevice.capabilities().PFN_vkGetPhysicalDeviceExternalFenceProperties, physicalDevice.segment(), pExternalFenceInfo, pExternalFenceProperties); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetPhysicalDeviceExternalFenceProperties", e); }
    }

    /// ```
    /// void vkGetPhysicalDeviceExternalSemaphoreProperties((struct VkPhysicalDevice*) VkPhysicalDevice physicalDevice, const VkPhysicalDeviceExternalSemaphoreInfo* pExternalSemaphoreInfo, VkExternalSemaphoreProperties* pExternalSemaphoreProperties);
    /// ```
    public static void vkGetPhysicalDeviceExternalSemaphoreProperties(VkPhysicalDevice physicalDevice, MemorySegment pExternalSemaphoreInfo, MemorySegment pExternalSemaphoreProperties) {
        if (MemoryUtil.isNullPointer(physicalDevice.capabilities().PFN_vkGetPhysicalDeviceExternalSemaphoreProperties)) throw new SymbolNotFoundError("Symbol not found: vkGetPhysicalDeviceExternalSemaphoreProperties");
        try { Handles.MH_vkGetPhysicalDeviceExternalSemaphoreProperties.invokeExact(physicalDevice.capabilities().PFN_vkGetPhysicalDeviceExternalSemaphoreProperties, physicalDevice.segment(), pExternalSemaphoreInfo, pExternalSemaphoreProperties); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetPhysicalDeviceExternalSemaphoreProperties", e); }
    }

    /// ```
    /// void vkGetDescriptorSetLayoutSupport((struct VkDevice*) VkDevice device, const VkDescriptorSetLayoutCreateInfo* pCreateInfo, VkDescriptorSetLayoutSupport* pSupport);
    /// ```
    public static void vkGetDescriptorSetLayoutSupport(VkDevice device, MemorySegment pCreateInfo, MemorySegment pSupport) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkGetDescriptorSetLayoutSupport)) throw new SymbolNotFoundError("Symbol not found: vkGetDescriptorSetLayoutSupport");
        try { Handles.MH_vkGetDescriptorSetLayoutSupport.invokeExact(device.capabilities().PFN_vkGetDescriptorSetLayoutSupport, device.segment(), pCreateInfo, pSupport); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetDescriptorSetLayoutSupport", e); }
    }

}
