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
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;
import java.util.*;
public class VK11 extends VK10 {
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
    public static final int VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_D3D11_FENCE_BIT = VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_D3D12_FENCE_BIT;
    public static final int VK_PIPELINE_CREATE_DISPATCH_BASE = VK_PIPELINE_CREATE_DISPATCH_BASE_BIT;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VARIABLE_POINTER_FEATURES = VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VARIABLE_POINTERS_FEATURES;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_DRAW_PARAMETER_FEATURES = VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_DRAW_PARAMETERS_FEATURES;
    private final Handles handles;
    public static final class Descriptors {
        public static final FunctionDescriptor FD_vkEnumerateInstanceVersion = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkBindBufferMemory2 = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkBindImageMemory2 = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkGetDeviceGroupPeerMemoryFeatures = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkCmdSetDeviceMask = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_vkCmdDispatchBase = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_vkEnumeratePhysicalDeviceGroups = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkGetImageMemoryRequirements2 = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkGetBufferMemoryRequirements2 = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkGetImageSparseMemoryRequirements2 = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkGetPhysicalDeviceFeatures2 = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkGetPhysicalDeviceProperties2 = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkGetPhysicalDeviceFormatProperties2 = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkGetPhysicalDeviceImageFormatProperties2 = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkGetPhysicalDeviceQueueFamilyProperties2 = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkGetPhysicalDeviceMemoryProperties2 = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkGetPhysicalDeviceSparseImageFormatProperties2 = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkTrimCommandPool = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_vkGetDeviceQueue2 = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkCreateSamplerYcbcrConversion = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkDestroySamplerYcbcrConversion = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkCreateDescriptorUpdateTemplate = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkDestroyDescriptorUpdateTemplate = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkUpdateDescriptorSetWithTemplate = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkGetPhysicalDeviceExternalBufferProperties = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkGetPhysicalDeviceExternalFenceProperties = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkGetPhysicalDeviceExternalSemaphoreProperties = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkGetDescriptorSetLayoutSupport = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final List<FunctionDescriptor> LIST = List.of(
            FD_vkEnumerateInstanceVersion,
            FD_vkBindBufferMemory2,
            FD_vkBindImageMemory2,
            FD_vkGetDeviceGroupPeerMemoryFeatures,
            FD_vkCmdSetDeviceMask,
            FD_vkCmdDispatchBase,
            FD_vkEnumeratePhysicalDeviceGroups,
            FD_vkGetImageMemoryRequirements2,
            FD_vkGetBufferMemoryRequirements2,
            FD_vkGetImageSparseMemoryRequirements2,
            FD_vkGetPhysicalDeviceFeatures2,
            FD_vkGetPhysicalDeviceProperties2,
            FD_vkGetPhysicalDeviceFormatProperties2,
            FD_vkGetPhysicalDeviceImageFormatProperties2,
            FD_vkGetPhysicalDeviceQueueFamilyProperties2,
            FD_vkGetPhysicalDeviceMemoryProperties2,
            FD_vkGetPhysicalDeviceSparseImageFormatProperties2,
            FD_vkTrimCommandPool,
            FD_vkGetDeviceQueue2,
            FD_vkCreateSamplerYcbcrConversion,
            FD_vkDestroySamplerYcbcrConversion,
            FD_vkCreateDescriptorUpdateTemplate,
            FD_vkDestroyDescriptorUpdateTemplate,
            FD_vkUpdateDescriptorSetWithTemplate,
            FD_vkGetPhysicalDeviceExternalBufferProperties,
            FD_vkGetPhysicalDeviceExternalFenceProperties,
            FD_vkGetPhysicalDeviceExternalSemaphoreProperties,
            FD_vkGetDescriptorSetLayoutSupport
        );
        private Descriptors() {}
    }
    public static final class Handles {
        public static final MethodHandle MH_vkEnumerateInstanceVersion = RuntimeHelper.downcall(Descriptors.FD_vkEnumerateInstanceVersion);
        public static final MethodHandle MH_vkBindBufferMemory2 = RuntimeHelper.downcall(Descriptors.FD_vkBindBufferMemory2);
        public static final MethodHandle MH_vkBindImageMemory2 = RuntimeHelper.downcall(Descriptors.FD_vkBindImageMemory2);
        public static final MethodHandle MH_vkGetDeviceGroupPeerMemoryFeatures = RuntimeHelper.downcall(Descriptors.FD_vkGetDeviceGroupPeerMemoryFeatures);
        public static final MethodHandle MH_vkCmdSetDeviceMask = RuntimeHelper.downcall(Descriptors.FD_vkCmdSetDeviceMask);
        public static final MethodHandle MH_vkCmdDispatchBase = RuntimeHelper.downcall(Descriptors.FD_vkCmdDispatchBase);
        public static final MethodHandle MH_vkEnumeratePhysicalDeviceGroups = RuntimeHelper.downcall(Descriptors.FD_vkEnumeratePhysicalDeviceGroups);
        public static final MethodHandle MH_vkGetImageMemoryRequirements2 = RuntimeHelper.downcall(Descriptors.FD_vkGetImageMemoryRequirements2);
        public static final MethodHandle MH_vkGetBufferMemoryRequirements2 = RuntimeHelper.downcall(Descriptors.FD_vkGetBufferMemoryRequirements2);
        public static final MethodHandle MH_vkGetImageSparseMemoryRequirements2 = RuntimeHelper.downcall(Descriptors.FD_vkGetImageSparseMemoryRequirements2);
        public static final MethodHandle MH_vkGetPhysicalDeviceFeatures2 = RuntimeHelper.downcall(Descriptors.FD_vkGetPhysicalDeviceFeatures2);
        public static final MethodHandle MH_vkGetPhysicalDeviceProperties2 = RuntimeHelper.downcall(Descriptors.FD_vkGetPhysicalDeviceProperties2);
        public static final MethodHandle MH_vkGetPhysicalDeviceFormatProperties2 = RuntimeHelper.downcall(Descriptors.FD_vkGetPhysicalDeviceFormatProperties2);
        public static final MethodHandle MH_vkGetPhysicalDeviceImageFormatProperties2 = RuntimeHelper.downcall(Descriptors.FD_vkGetPhysicalDeviceImageFormatProperties2);
        public static final MethodHandle MH_vkGetPhysicalDeviceQueueFamilyProperties2 = RuntimeHelper.downcall(Descriptors.FD_vkGetPhysicalDeviceQueueFamilyProperties2);
        public static final MethodHandle MH_vkGetPhysicalDeviceMemoryProperties2 = RuntimeHelper.downcall(Descriptors.FD_vkGetPhysicalDeviceMemoryProperties2);
        public static final MethodHandle MH_vkGetPhysicalDeviceSparseImageFormatProperties2 = RuntimeHelper.downcall(Descriptors.FD_vkGetPhysicalDeviceSparseImageFormatProperties2);
        public static final MethodHandle MH_vkTrimCommandPool = RuntimeHelper.downcall(Descriptors.FD_vkTrimCommandPool);
        public static final MethodHandle MH_vkGetDeviceQueue2 = RuntimeHelper.downcall(Descriptors.FD_vkGetDeviceQueue2);
        public static final MethodHandle MH_vkCreateSamplerYcbcrConversion = RuntimeHelper.downcall(Descriptors.FD_vkCreateSamplerYcbcrConversion);
        public static final MethodHandle MH_vkDestroySamplerYcbcrConversion = RuntimeHelper.downcall(Descriptors.FD_vkDestroySamplerYcbcrConversion);
        public static final MethodHandle MH_vkCreateDescriptorUpdateTemplate = RuntimeHelper.downcall(Descriptors.FD_vkCreateDescriptorUpdateTemplate);
        public static final MethodHandle MH_vkDestroyDescriptorUpdateTemplate = RuntimeHelper.downcall(Descriptors.FD_vkDestroyDescriptorUpdateTemplate);
        public static final MethodHandle MH_vkUpdateDescriptorSetWithTemplate = RuntimeHelper.downcall(Descriptors.FD_vkUpdateDescriptorSetWithTemplate);
        public static final MethodHandle MH_vkGetPhysicalDeviceExternalBufferProperties = RuntimeHelper.downcall(Descriptors.FD_vkGetPhysicalDeviceExternalBufferProperties);
        public static final MethodHandle MH_vkGetPhysicalDeviceExternalFenceProperties = RuntimeHelper.downcall(Descriptors.FD_vkGetPhysicalDeviceExternalFenceProperties);
        public static final MethodHandle MH_vkGetPhysicalDeviceExternalSemaphoreProperties = RuntimeHelper.downcall(Descriptors.FD_vkGetPhysicalDeviceExternalSemaphoreProperties);
        public static final MethodHandle MH_vkGetDescriptorSetLayoutSupport = RuntimeHelper.downcall(Descriptors.FD_vkGetDescriptorSetLayoutSupport);
        public final MemorySegment PFN_vkEnumerateInstanceVersion;
        public final MemorySegment PFN_vkBindBufferMemory2;
        public final MemorySegment PFN_vkBindImageMemory2;
        public final MemorySegment PFN_vkGetDeviceGroupPeerMemoryFeatures;
        public final MemorySegment PFN_vkCmdSetDeviceMask;
        public final MemorySegment PFN_vkCmdDispatchBase;
        public final MemorySegment PFN_vkEnumeratePhysicalDeviceGroups;
        public final MemorySegment PFN_vkGetImageMemoryRequirements2;
        public final MemorySegment PFN_vkGetBufferMemoryRequirements2;
        public final MemorySegment PFN_vkGetImageSparseMemoryRequirements2;
        public final MemorySegment PFN_vkGetPhysicalDeviceFeatures2;
        public final MemorySegment PFN_vkGetPhysicalDeviceProperties2;
        public final MemorySegment PFN_vkGetPhysicalDeviceFormatProperties2;
        public final MemorySegment PFN_vkGetPhysicalDeviceImageFormatProperties2;
        public final MemorySegment PFN_vkGetPhysicalDeviceQueueFamilyProperties2;
        public final MemorySegment PFN_vkGetPhysicalDeviceMemoryProperties2;
        public final MemorySegment PFN_vkGetPhysicalDeviceSparseImageFormatProperties2;
        public final MemorySegment PFN_vkTrimCommandPool;
        public final MemorySegment PFN_vkGetDeviceQueue2;
        public final MemorySegment PFN_vkCreateSamplerYcbcrConversion;
        public final MemorySegment PFN_vkDestroySamplerYcbcrConversion;
        public final MemorySegment PFN_vkCreateDescriptorUpdateTemplate;
        public final MemorySegment PFN_vkDestroyDescriptorUpdateTemplate;
        public final MemorySegment PFN_vkUpdateDescriptorSetWithTemplate;
        public final MemorySegment PFN_vkGetPhysicalDeviceExternalBufferProperties;
        public final MemorySegment PFN_vkGetPhysicalDeviceExternalFenceProperties;
        public final MemorySegment PFN_vkGetPhysicalDeviceExternalSemaphoreProperties;
        public final MemorySegment PFN_vkGetDescriptorSetLayoutSupport;
        private Handles(@CType("VkInstance") MemorySegment instance, VKLoadFunc func) {
            PFN_vkEnumerateInstanceVersion = func.invoke(instance, "vkEnumerateInstanceVersion");
            PFN_vkBindBufferMemory2 = func.invoke(instance, "vkBindBufferMemory2", "vkBindBufferMemory2KHR");
            PFN_vkBindImageMemory2 = func.invoke(instance, "vkBindImageMemory2", "vkBindImageMemory2KHR");
            PFN_vkGetDeviceGroupPeerMemoryFeatures = func.invoke(instance, "vkGetDeviceGroupPeerMemoryFeatures", "vkGetDeviceGroupPeerMemoryFeaturesKHR");
            PFN_vkCmdSetDeviceMask = func.invoke(instance, "vkCmdSetDeviceMask", "vkCmdSetDeviceMaskKHR");
            PFN_vkCmdDispatchBase = func.invoke(instance, "vkCmdDispatchBase", "vkCmdDispatchBaseKHR");
            PFN_vkEnumeratePhysicalDeviceGroups = func.invoke(instance, "vkEnumeratePhysicalDeviceGroups", "vkEnumeratePhysicalDeviceGroupsKHR");
            PFN_vkGetImageMemoryRequirements2 = func.invoke(instance, "vkGetImageMemoryRequirements2", "vkGetImageMemoryRequirements2KHR");
            PFN_vkGetBufferMemoryRequirements2 = func.invoke(instance, "vkGetBufferMemoryRequirements2", "vkGetBufferMemoryRequirements2KHR");
            PFN_vkGetImageSparseMemoryRequirements2 = func.invoke(instance, "vkGetImageSparseMemoryRequirements2", "vkGetImageSparseMemoryRequirements2KHR");
            PFN_vkGetPhysicalDeviceFeatures2 = func.invoke(instance, "vkGetPhysicalDeviceFeatures2", "vkGetPhysicalDeviceFeatures2KHR");
            PFN_vkGetPhysicalDeviceProperties2 = func.invoke(instance, "vkGetPhysicalDeviceProperties2", "vkGetPhysicalDeviceProperties2KHR");
            PFN_vkGetPhysicalDeviceFormatProperties2 = func.invoke(instance, "vkGetPhysicalDeviceFormatProperties2", "vkGetPhysicalDeviceFormatProperties2KHR");
            PFN_vkGetPhysicalDeviceImageFormatProperties2 = func.invoke(instance, "vkGetPhysicalDeviceImageFormatProperties2", "vkGetPhysicalDeviceImageFormatProperties2KHR");
            PFN_vkGetPhysicalDeviceQueueFamilyProperties2 = func.invoke(instance, "vkGetPhysicalDeviceQueueFamilyProperties2", "vkGetPhysicalDeviceQueueFamilyProperties2KHR");
            PFN_vkGetPhysicalDeviceMemoryProperties2 = func.invoke(instance, "vkGetPhysicalDeviceMemoryProperties2", "vkGetPhysicalDeviceMemoryProperties2KHR");
            PFN_vkGetPhysicalDeviceSparseImageFormatProperties2 = func.invoke(instance, "vkGetPhysicalDeviceSparseImageFormatProperties2", "vkGetPhysicalDeviceSparseImageFormatProperties2KHR");
            PFN_vkTrimCommandPool = func.invoke(instance, "vkTrimCommandPool", "vkTrimCommandPoolKHR");
            PFN_vkGetDeviceQueue2 = func.invoke(instance, "vkGetDeviceQueue2");
            PFN_vkCreateSamplerYcbcrConversion = func.invoke(instance, "vkCreateSamplerYcbcrConversion", "vkCreateSamplerYcbcrConversionKHR");
            PFN_vkDestroySamplerYcbcrConversion = func.invoke(instance, "vkDestroySamplerYcbcrConversion", "vkDestroySamplerYcbcrConversionKHR");
            PFN_vkCreateDescriptorUpdateTemplate = func.invoke(instance, "vkCreateDescriptorUpdateTemplate", "vkCreateDescriptorUpdateTemplateKHR");
            PFN_vkDestroyDescriptorUpdateTemplate = func.invoke(instance, "vkDestroyDescriptorUpdateTemplate", "vkDestroyDescriptorUpdateTemplateKHR");
            PFN_vkUpdateDescriptorSetWithTemplate = func.invoke(instance, "vkUpdateDescriptorSetWithTemplate", "vkUpdateDescriptorSetWithTemplateKHR");
            PFN_vkGetPhysicalDeviceExternalBufferProperties = func.invoke(instance, "vkGetPhysicalDeviceExternalBufferProperties", "vkGetPhysicalDeviceExternalBufferPropertiesKHR");
            PFN_vkGetPhysicalDeviceExternalFenceProperties = func.invoke(instance, "vkGetPhysicalDeviceExternalFenceProperties", "vkGetPhysicalDeviceExternalFencePropertiesKHR");
            PFN_vkGetPhysicalDeviceExternalSemaphoreProperties = func.invoke(instance, "vkGetPhysicalDeviceExternalSemaphoreProperties", "vkGetPhysicalDeviceExternalSemaphorePropertiesKHR");
            PFN_vkGetDescriptorSetLayoutSupport = func.invoke(instance, "vkGetDescriptorSetLayoutSupport", "vkGetDescriptorSetLayoutSupportKHR");
        }
    }

    public VK11(@CType("VkInstance") MemorySegment instance, VKLoadFunc func) {
        super(instance, func);
        this.handles = new Handles(instance, func);
    }

    public @CType("VkResult") int EnumerateInstanceVersion(@CType("uint32_t *") MemorySegment pApiVersion) {
        if (Unmarshal.isNullPointer(handles.PFN_vkEnumerateInstanceVersion)) throw new SymbolNotFoundError("Symbol not found: vkEnumerateInstanceVersion");
        try { return (int) Handles.MH_vkEnumerateInstanceVersion.invokeExact(handles.PFN_vkEnumerateInstanceVersion, pApiVersion); }
        catch (Throwable e) { throw new RuntimeException("error in vkEnumerateInstanceVersion", e); }
    }

    public @CType("VkResult") int BindBufferMemory2(@CType("VkDevice") MemorySegment device, @CType("uint32_t") int bindInfoCount, @CType("const VkBindBufferMemoryInfo *") MemorySegment pBindInfos) {
        if (Unmarshal.isNullPointer(handles.PFN_vkBindBufferMemory2)) throw new SymbolNotFoundError("Symbol not found: vkBindBufferMemory2");
        try { return (int) Handles.MH_vkBindBufferMemory2.invokeExact(handles.PFN_vkBindBufferMemory2, device, bindInfoCount, pBindInfos); }
        catch (Throwable e) { throw new RuntimeException("error in vkBindBufferMemory2", e); }
    }

    public @CType("VkResult") int BindImageMemory2(@CType("VkDevice") MemorySegment device, @CType("uint32_t") int bindInfoCount, @CType("const VkBindImageMemoryInfo *") MemorySegment pBindInfos) {
        if (Unmarshal.isNullPointer(handles.PFN_vkBindImageMemory2)) throw new SymbolNotFoundError("Symbol not found: vkBindImageMemory2");
        try { return (int) Handles.MH_vkBindImageMemory2.invokeExact(handles.PFN_vkBindImageMemory2, device, bindInfoCount, pBindInfos); }
        catch (Throwable e) { throw new RuntimeException("error in vkBindImageMemory2", e); }
    }

    public void GetDeviceGroupPeerMemoryFeatures(@CType("VkDevice") MemorySegment device, @CType("uint32_t") int heapIndex, @CType("uint32_t") int localDeviceIndex, @CType("uint32_t") int remoteDeviceIndex, @CType("VkPeerMemoryFeatureFlags *") MemorySegment pPeerMemoryFeatures) {
        if (Unmarshal.isNullPointer(handles.PFN_vkGetDeviceGroupPeerMemoryFeatures)) throw new SymbolNotFoundError("Symbol not found: vkGetDeviceGroupPeerMemoryFeatures");
        try { Handles.MH_vkGetDeviceGroupPeerMemoryFeatures.invokeExact(handles.PFN_vkGetDeviceGroupPeerMemoryFeatures, device, heapIndex, localDeviceIndex, remoteDeviceIndex, pPeerMemoryFeatures); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetDeviceGroupPeerMemoryFeatures", e); }
    }

    public void CmdSetDeviceMask(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("uint32_t") int deviceMask) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCmdSetDeviceMask)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetDeviceMask");
        try { Handles.MH_vkCmdSetDeviceMask.invokeExact(handles.PFN_vkCmdSetDeviceMask, commandBuffer, deviceMask); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetDeviceMask", e); }
    }

    public void CmdDispatchBase(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("uint32_t") int baseGroupX, @CType("uint32_t") int baseGroupY, @CType("uint32_t") int baseGroupZ, @CType("uint32_t") int groupCountX, @CType("uint32_t") int groupCountY, @CType("uint32_t") int groupCountZ) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCmdDispatchBase)) throw new SymbolNotFoundError("Symbol not found: vkCmdDispatchBase");
        try { Handles.MH_vkCmdDispatchBase.invokeExact(handles.PFN_vkCmdDispatchBase, commandBuffer, baseGroupX, baseGroupY, baseGroupZ, groupCountX, groupCountY, groupCountZ); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdDispatchBase", e); }
    }

    public @CType("VkResult") int EnumeratePhysicalDeviceGroups(@CType("VkInstance") MemorySegment instance, @CType("uint32_t *") MemorySegment pPhysicalDeviceGroupCount, @CType("VkPhysicalDeviceGroupProperties *") MemorySegment pPhysicalDeviceGroupProperties) {
        if (Unmarshal.isNullPointer(handles.PFN_vkEnumeratePhysicalDeviceGroups)) throw new SymbolNotFoundError("Symbol not found: vkEnumeratePhysicalDeviceGroups");
        try { return (int) Handles.MH_vkEnumeratePhysicalDeviceGroups.invokeExact(handles.PFN_vkEnumeratePhysicalDeviceGroups, instance, pPhysicalDeviceGroupCount, pPhysicalDeviceGroupProperties); }
        catch (Throwable e) { throw new RuntimeException("error in vkEnumeratePhysicalDeviceGroups", e); }
    }

    public void GetImageMemoryRequirements2(@CType("VkDevice") MemorySegment device, @CType("const VkImageMemoryRequirementsInfo2 *") MemorySegment pInfo, @CType("VkMemoryRequirements2 *") MemorySegment pMemoryRequirements) {
        if (Unmarshal.isNullPointer(handles.PFN_vkGetImageMemoryRequirements2)) throw new SymbolNotFoundError("Symbol not found: vkGetImageMemoryRequirements2");
        try { Handles.MH_vkGetImageMemoryRequirements2.invokeExact(handles.PFN_vkGetImageMemoryRequirements2, device, pInfo, pMemoryRequirements); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetImageMemoryRequirements2", e); }
    }

    public void GetBufferMemoryRequirements2(@CType("VkDevice") MemorySegment device, @CType("const VkBufferMemoryRequirementsInfo2 *") MemorySegment pInfo, @CType("VkMemoryRequirements2 *") MemorySegment pMemoryRequirements) {
        if (Unmarshal.isNullPointer(handles.PFN_vkGetBufferMemoryRequirements2)) throw new SymbolNotFoundError("Symbol not found: vkGetBufferMemoryRequirements2");
        try { Handles.MH_vkGetBufferMemoryRequirements2.invokeExact(handles.PFN_vkGetBufferMemoryRequirements2, device, pInfo, pMemoryRequirements); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetBufferMemoryRequirements2", e); }
    }

    public void GetImageSparseMemoryRequirements2(@CType("VkDevice") MemorySegment device, @CType("const VkImageSparseMemoryRequirementsInfo2 *") MemorySegment pInfo, @CType("uint32_t *") MemorySegment pSparseMemoryRequirementCount, @CType("VkSparseImageMemoryRequirements2 *") MemorySegment pSparseMemoryRequirements) {
        if (Unmarshal.isNullPointer(handles.PFN_vkGetImageSparseMemoryRequirements2)) throw new SymbolNotFoundError("Symbol not found: vkGetImageSparseMemoryRequirements2");
        try { Handles.MH_vkGetImageSparseMemoryRequirements2.invokeExact(handles.PFN_vkGetImageSparseMemoryRequirements2, device, pInfo, pSparseMemoryRequirementCount, pSparseMemoryRequirements); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetImageSparseMemoryRequirements2", e); }
    }

    public void GetPhysicalDeviceFeatures2(@CType("VkPhysicalDevice") MemorySegment physicalDevice, @CType("VkPhysicalDeviceFeatures2 *") MemorySegment pFeatures) {
        if (Unmarshal.isNullPointer(handles.PFN_vkGetPhysicalDeviceFeatures2)) throw new SymbolNotFoundError("Symbol not found: vkGetPhysicalDeviceFeatures2");
        try { Handles.MH_vkGetPhysicalDeviceFeatures2.invokeExact(handles.PFN_vkGetPhysicalDeviceFeatures2, physicalDevice, pFeatures); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetPhysicalDeviceFeatures2", e); }
    }

    public void GetPhysicalDeviceProperties2(@CType("VkPhysicalDevice") MemorySegment physicalDevice, @CType("VkPhysicalDeviceProperties2 *") MemorySegment pProperties) {
        if (Unmarshal.isNullPointer(handles.PFN_vkGetPhysicalDeviceProperties2)) throw new SymbolNotFoundError("Symbol not found: vkGetPhysicalDeviceProperties2");
        try { Handles.MH_vkGetPhysicalDeviceProperties2.invokeExact(handles.PFN_vkGetPhysicalDeviceProperties2, physicalDevice, pProperties); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetPhysicalDeviceProperties2", e); }
    }

    public void GetPhysicalDeviceFormatProperties2(@CType("VkPhysicalDevice") MemorySegment physicalDevice, @CType("VkFormat") int format, @CType("VkFormatProperties2 *") MemorySegment pFormatProperties) {
        if (Unmarshal.isNullPointer(handles.PFN_vkGetPhysicalDeviceFormatProperties2)) throw new SymbolNotFoundError("Symbol not found: vkGetPhysicalDeviceFormatProperties2");
        try { Handles.MH_vkGetPhysicalDeviceFormatProperties2.invokeExact(handles.PFN_vkGetPhysicalDeviceFormatProperties2, physicalDevice, format, pFormatProperties); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetPhysicalDeviceFormatProperties2", e); }
    }

    public @CType("VkResult") int GetPhysicalDeviceImageFormatProperties2(@CType("VkPhysicalDevice") MemorySegment physicalDevice, @CType("const VkPhysicalDeviceImageFormatInfo2 *") MemorySegment pImageFormatInfo, @CType("VkImageFormatProperties2 *") MemorySegment pImageFormatProperties) {
        if (Unmarshal.isNullPointer(handles.PFN_vkGetPhysicalDeviceImageFormatProperties2)) throw new SymbolNotFoundError("Symbol not found: vkGetPhysicalDeviceImageFormatProperties2");
        try { return (int) Handles.MH_vkGetPhysicalDeviceImageFormatProperties2.invokeExact(handles.PFN_vkGetPhysicalDeviceImageFormatProperties2, physicalDevice, pImageFormatInfo, pImageFormatProperties); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetPhysicalDeviceImageFormatProperties2", e); }
    }

    public void GetPhysicalDeviceQueueFamilyProperties2(@CType("VkPhysicalDevice") MemorySegment physicalDevice, @CType("uint32_t *") MemorySegment pQueueFamilyPropertyCount, @CType("VkQueueFamilyProperties2 *") MemorySegment pQueueFamilyProperties) {
        if (Unmarshal.isNullPointer(handles.PFN_vkGetPhysicalDeviceQueueFamilyProperties2)) throw new SymbolNotFoundError("Symbol not found: vkGetPhysicalDeviceQueueFamilyProperties2");
        try { Handles.MH_vkGetPhysicalDeviceQueueFamilyProperties2.invokeExact(handles.PFN_vkGetPhysicalDeviceQueueFamilyProperties2, physicalDevice, pQueueFamilyPropertyCount, pQueueFamilyProperties); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetPhysicalDeviceQueueFamilyProperties2", e); }
    }

    public void GetPhysicalDeviceMemoryProperties2(@CType("VkPhysicalDevice") MemorySegment physicalDevice, @CType("VkPhysicalDeviceMemoryProperties2 *") MemorySegment pMemoryProperties) {
        if (Unmarshal.isNullPointer(handles.PFN_vkGetPhysicalDeviceMemoryProperties2)) throw new SymbolNotFoundError("Symbol not found: vkGetPhysicalDeviceMemoryProperties2");
        try { Handles.MH_vkGetPhysicalDeviceMemoryProperties2.invokeExact(handles.PFN_vkGetPhysicalDeviceMemoryProperties2, physicalDevice, pMemoryProperties); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetPhysicalDeviceMemoryProperties2", e); }
    }

    public void GetPhysicalDeviceSparseImageFormatProperties2(@CType("VkPhysicalDevice") MemorySegment physicalDevice, @CType("const VkPhysicalDeviceSparseImageFormatInfo2 *") MemorySegment pFormatInfo, @CType("uint32_t *") MemorySegment pPropertyCount, @CType("VkSparseImageFormatProperties2 *") MemorySegment pProperties) {
        if (Unmarshal.isNullPointer(handles.PFN_vkGetPhysicalDeviceSparseImageFormatProperties2)) throw new SymbolNotFoundError("Symbol not found: vkGetPhysicalDeviceSparseImageFormatProperties2");
        try { Handles.MH_vkGetPhysicalDeviceSparseImageFormatProperties2.invokeExact(handles.PFN_vkGetPhysicalDeviceSparseImageFormatProperties2, physicalDevice, pFormatInfo, pPropertyCount, pProperties); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetPhysicalDeviceSparseImageFormatProperties2", e); }
    }

    public void TrimCommandPool(@CType("VkDevice") MemorySegment device, @CType("VkCommandPool") MemorySegment commandPool, @CType("VkCommandPoolTrimFlags") int flags) {
        if (Unmarshal.isNullPointer(handles.PFN_vkTrimCommandPool)) throw new SymbolNotFoundError("Symbol not found: vkTrimCommandPool");
        try { Handles.MH_vkTrimCommandPool.invokeExact(handles.PFN_vkTrimCommandPool, device, commandPool, flags); }
        catch (Throwable e) { throw new RuntimeException("error in vkTrimCommandPool", e); }
    }

    public void GetDeviceQueue2(@CType("VkDevice") MemorySegment device, @CType("const VkDeviceQueueInfo2 *") MemorySegment pQueueInfo, @CType("VkQueue *") MemorySegment pQueue) {
        if (Unmarshal.isNullPointer(handles.PFN_vkGetDeviceQueue2)) throw new SymbolNotFoundError("Symbol not found: vkGetDeviceQueue2");
        try { Handles.MH_vkGetDeviceQueue2.invokeExact(handles.PFN_vkGetDeviceQueue2, device, pQueueInfo, pQueue); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetDeviceQueue2", e); }
    }

    public @CType("VkResult") int CreateSamplerYcbcrConversion(@CType("VkDevice") MemorySegment device, @CType("const VkSamplerYcbcrConversionCreateInfo *") MemorySegment pCreateInfo, @CType("const VkAllocationCallbacks *") MemorySegment pAllocator, @CType("VkSamplerYcbcrConversion *") MemorySegment pYcbcrConversion) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCreateSamplerYcbcrConversion)) throw new SymbolNotFoundError("Symbol not found: vkCreateSamplerYcbcrConversion");
        try { return (int) Handles.MH_vkCreateSamplerYcbcrConversion.invokeExact(handles.PFN_vkCreateSamplerYcbcrConversion, device, pCreateInfo, pAllocator, pYcbcrConversion); }
        catch (Throwable e) { throw new RuntimeException("error in vkCreateSamplerYcbcrConversion", e); }
    }

    public void DestroySamplerYcbcrConversion(@CType("VkDevice") MemorySegment device, @CType("VkSamplerYcbcrConversion") MemorySegment ycbcrConversion, @CType("const VkAllocationCallbacks *") MemorySegment pAllocator) {
        if (Unmarshal.isNullPointer(handles.PFN_vkDestroySamplerYcbcrConversion)) throw new SymbolNotFoundError("Symbol not found: vkDestroySamplerYcbcrConversion");
        try { Handles.MH_vkDestroySamplerYcbcrConversion.invokeExact(handles.PFN_vkDestroySamplerYcbcrConversion, device, ycbcrConversion, pAllocator); }
        catch (Throwable e) { throw new RuntimeException("error in vkDestroySamplerYcbcrConversion", e); }
    }

    public @CType("VkResult") int CreateDescriptorUpdateTemplate(@CType("VkDevice") MemorySegment device, @CType("const VkDescriptorUpdateTemplateCreateInfo *") MemorySegment pCreateInfo, @CType("const VkAllocationCallbacks *") MemorySegment pAllocator, @CType("VkDescriptorUpdateTemplate *") MemorySegment pDescriptorUpdateTemplate) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCreateDescriptorUpdateTemplate)) throw new SymbolNotFoundError("Symbol not found: vkCreateDescriptorUpdateTemplate");
        try { return (int) Handles.MH_vkCreateDescriptorUpdateTemplate.invokeExact(handles.PFN_vkCreateDescriptorUpdateTemplate, device, pCreateInfo, pAllocator, pDescriptorUpdateTemplate); }
        catch (Throwable e) { throw new RuntimeException("error in vkCreateDescriptorUpdateTemplate", e); }
    }

    public void DestroyDescriptorUpdateTemplate(@CType("VkDevice") MemorySegment device, @CType("VkDescriptorUpdateTemplate") MemorySegment descriptorUpdateTemplate, @CType("const VkAllocationCallbacks *") MemorySegment pAllocator) {
        if (Unmarshal.isNullPointer(handles.PFN_vkDestroyDescriptorUpdateTemplate)) throw new SymbolNotFoundError("Symbol not found: vkDestroyDescriptorUpdateTemplate");
        try { Handles.MH_vkDestroyDescriptorUpdateTemplate.invokeExact(handles.PFN_vkDestroyDescriptorUpdateTemplate, device, descriptorUpdateTemplate, pAllocator); }
        catch (Throwable e) { throw new RuntimeException("error in vkDestroyDescriptorUpdateTemplate", e); }
    }

    public void UpdateDescriptorSetWithTemplate(@CType("VkDevice") MemorySegment device, @CType("VkDescriptorSet") MemorySegment descriptorSet, @CType("VkDescriptorUpdateTemplate") MemorySegment descriptorUpdateTemplate, @CType("const void *") MemorySegment pData) {
        if (Unmarshal.isNullPointer(handles.PFN_vkUpdateDescriptorSetWithTemplate)) throw new SymbolNotFoundError("Symbol not found: vkUpdateDescriptorSetWithTemplate");
        try { Handles.MH_vkUpdateDescriptorSetWithTemplate.invokeExact(handles.PFN_vkUpdateDescriptorSetWithTemplate, device, descriptorSet, descriptorUpdateTemplate, pData); }
        catch (Throwable e) { throw new RuntimeException("error in vkUpdateDescriptorSetWithTemplate", e); }
    }

    public void GetPhysicalDeviceExternalBufferProperties(@CType("VkPhysicalDevice") MemorySegment physicalDevice, @CType("const VkPhysicalDeviceExternalBufferInfo *") MemorySegment pExternalBufferInfo, @CType("VkExternalBufferProperties *") MemorySegment pExternalBufferProperties) {
        if (Unmarshal.isNullPointer(handles.PFN_vkGetPhysicalDeviceExternalBufferProperties)) throw new SymbolNotFoundError("Symbol not found: vkGetPhysicalDeviceExternalBufferProperties");
        try { Handles.MH_vkGetPhysicalDeviceExternalBufferProperties.invokeExact(handles.PFN_vkGetPhysicalDeviceExternalBufferProperties, physicalDevice, pExternalBufferInfo, pExternalBufferProperties); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetPhysicalDeviceExternalBufferProperties", e); }
    }

    public void GetPhysicalDeviceExternalFenceProperties(@CType("VkPhysicalDevice") MemorySegment physicalDevice, @CType("const VkPhysicalDeviceExternalFenceInfo *") MemorySegment pExternalFenceInfo, @CType("VkExternalFenceProperties *") MemorySegment pExternalFenceProperties) {
        if (Unmarshal.isNullPointer(handles.PFN_vkGetPhysicalDeviceExternalFenceProperties)) throw new SymbolNotFoundError("Symbol not found: vkGetPhysicalDeviceExternalFenceProperties");
        try { Handles.MH_vkGetPhysicalDeviceExternalFenceProperties.invokeExact(handles.PFN_vkGetPhysicalDeviceExternalFenceProperties, physicalDevice, pExternalFenceInfo, pExternalFenceProperties); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetPhysicalDeviceExternalFenceProperties", e); }
    }

    public void GetPhysicalDeviceExternalSemaphoreProperties(@CType("VkPhysicalDevice") MemorySegment physicalDevice, @CType("const VkPhysicalDeviceExternalSemaphoreInfo *") MemorySegment pExternalSemaphoreInfo, @CType("VkExternalSemaphoreProperties *") MemorySegment pExternalSemaphoreProperties) {
        if (Unmarshal.isNullPointer(handles.PFN_vkGetPhysicalDeviceExternalSemaphoreProperties)) throw new SymbolNotFoundError("Symbol not found: vkGetPhysicalDeviceExternalSemaphoreProperties");
        try { Handles.MH_vkGetPhysicalDeviceExternalSemaphoreProperties.invokeExact(handles.PFN_vkGetPhysicalDeviceExternalSemaphoreProperties, physicalDevice, pExternalSemaphoreInfo, pExternalSemaphoreProperties); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetPhysicalDeviceExternalSemaphoreProperties", e); }
    }

    public void GetDescriptorSetLayoutSupport(@CType("VkDevice") MemorySegment device, @CType("const VkDescriptorSetLayoutCreateInfo *") MemorySegment pCreateInfo, @CType("VkDescriptorSetLayoutSupport *") MemorySegment pSupport) {
        if (Unmarshal.isNullPointer(handles.PFN_vkGetDescriptorSetLayoutSupport)) throw new SymbolNotFoundError("Symbol not found: vkGetDescriptorSetLayoutSupport");
        try { Handles.MH_vkGetDescriptorSetLayoutSupport.invokeExact(handles.PFN_vkGetDescriptorSetLayoutSupport, device, pCreateInfo, pSupport); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetDescriptorSetLayoutSupport", e); }
    }

}
