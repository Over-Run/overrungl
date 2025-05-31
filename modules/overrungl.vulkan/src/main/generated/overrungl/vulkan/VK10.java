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
public final class VK10 {
    public static final int VK_API_VERSION_1_0 = VK_MAKE_API_VERSION(0, 1, 0, 0);
    public static final int VK_API_VERSION_1_1 = VK_MAKE_API_VERSION(0, 1, 1, 0);
    public static final int VK_API_VERSION_1_2 = VK_MAKE_API_VERSION(0, 1, 2, 0);
    public static final int VK_API_VERSION_1_3 = VK_MAKE_API_VERSION(0, 1, 3, 0);
    public static final int VK_API_VERSION_1_4 = VK_MAKE_API_VERSION(0, 1, 4, 0);
    public static final int VK_SUCCESS = 0;
    public static final int VK_NOT_READY = 1;
    public static final int VK_TIMEOUT = 2;
    public static final int VK_EVENT_SET = 3;
    public static final int VK_EVENT_RESET = 4;
    public static final int VK_INCOMPLETE = 5;
    public static final int VK_ERROR_OUT_OF_HOST_MEMORY = -1;
    public static final int VK_ERROR_OUT_OF_DEVICE_MEMORY = -2;
    public static final int VK_ERROR_INITIALIZATION_FAILED = -3;
    public static final int VK_ERROR_DEVICE_LOST = -4;
    public static final int VK_ERROR_MEMORY_MAP_FAILED = -5;
    public static final int VK_ERROR_LAYER_NOT_PRESENT = -6;
    public static final int VK_ERROR_EXTENSION_NOT_PRESENT = -7;
    public static final int VK_ERROR_FEATURE_NOT_PRESENT = -8;
    public static final int VK_ERROR_INCOMPATIBLE_DRIVER = -9;
    public static final int VK_ERROR_TOO_MANY_OBJECTS = -10;
    public static final int VK_ERROR_FORMAT_NOT_SUPPORTED = -11;
    public static final int VK_ERROR_FRAGMENTED_POOL = -12;
    public static final int VK_ERROR_UNKNOWN = -13;
    public static final int VK_STRUCTURE_TYPE_APPLICATION_INFO = 0;
    public static final int VK_STRUCTURE_TYPE_INSTANCE_CREATE_INFO = 1;
    public static final int VK_STRUCTURE_TYPE_DEVICE_QUEUE_CREATE_INFO = 2;
    public static final int VK_STRUCTURE_TYPE_DEVICE_CREATE_INFO = 3;
    public static final int VK_STRUCTURE_TYPE_SUBMIT_INFO = 4;
    public static final int VK_STRUCTURE_TYPE_MEMORY_ALLOCATE_INFO = 5;
    public static final int VK_STRUCTURE_TYPE_MAPPED_MEMORY_RANGE = 6;
    public static final int VK_STRUCTURE_TYPE_BIND_SPARSE_INFO = 7;
    public static final int VK_STRUCTURE_TYPE_FENCE_CREATE_INFO = 8;
    public static final int VK_STRUCTURE_TYPE_SEMAPHORE_CREATE_INFO = 9;
    public static final int VK_STRUCTURE_TYPE_EVENT_CREATE_INFO = 10;
    public static final int VK_STRUCTURE_TYPE_QUERY_POOL_CREATE_INFO = 11;
    public static final int VK_STRUCTURE_TYPE_BUFFER_CREATE_INFO = 12;
    public static final int VK_STRUCTURE_TYPE_BUFFER_VIEW_CREATE_INFO = 13;
    public static final int VK_STRUCTURE_TYPE_IMAGE_CREATE_INFO = 14;
    public static final int VK_STRUCTURE_TYPE_IMAGE_VIEW_CREATE_INFO = 15;
    public static final int VK_STRUCTURE_TYPE_SHADER_MODULE_CREATE_INFO = 16;
    public static final int VK_STRUCTURE_TYPE_PIPELINE_CACHE_CREATE_INFO = 17;
    public static final int VK_STRUCTURE_TYPE_PIPELINE_SHADER_STAGE_CREATE_INFO = 18;
    public static final int VK_STRUCTURE_TYPE_PIPELINE_VERTEX_INPUT_STATE_CREATE_INFO = 19;
    public static final int VK_STRUCTURE_TYPE_PIPELINE_INPUT_ASSEMBLY_STATE_CREATE_INFO = 20;
    public static final int VK_STRUCTURE_TYPE_PIPELINE_TESSELLATION_STATE_CREATE_INFO = 21;
    public static final int VK_STRUCTURE_TYPE_PIPELINE_VIEWPORT_STATE_CREATE_INFO = 22;
    public static final int VK_STRUCTURE_TYPE_PIPELINE_RASTERIZATION_STATE_CREATE_INFO = 23;
    public static final int VK_STRUCTURE_TYPE_PIPELINE_MULTISAMPLE_STATE_CREATE_INFO = 24;
    public static final int VK_STRUCTURE_TYPE_PIPELINE_DEPTH_STENCIL_STATE_CREATE_INFO = 25;
    public static final int VK_STRUCTURE_TYPE_PIPELINE_COLOR_BLEND_STATE_CREATE_INFO = 26;
    public static final int VK_STRUCTURE_TYPE_PIPELINE_DYNAMIC_STATE_CREATE_INFO = 27;
    public static final int VK_STRUCTURE_TYPE_GRAPHICS_PIPELINE_CREATE_INFO = 28;
    public static final int VK_STRUCTURE_TYPE_COMPUTE_PIPELINE_CREATE_INFO = 29;
    public static final int VK_STRUCTURE_TYPE_PIPELINE_LAYOUT_CREATE_INFO = 30;
    public static final int VK_STRUCTURE_TYPE_SAMPLER_CREATE_INFO = 31;
    public static final int VK_STRUCTURE_TYPE_DESCRIPTOR_SET_LAYOUT_CREATE_INFO = 32;
    public static final int VK_STRUCTURE_TYPE_DESCRIPTOR_POOL_CREATE_INFO = 33;
    public static final int VK_STRUCTURE_TYPE_DESCRIPTOR_SET_ALLOCATE_INFO = 34;
    public static final int VK_STRUCTURE_TYPE_WRITE_DESCRIPTOR_SET = 35;
    public static final int VK_STRUCTURE_TYPE_COPY_DESCRIPTOR_SET = 36;
    public static final int VK_STRUCTURE_TYPE_FRAMEBUFFER_CREATE_INFO = 37;
    public static final int VK_STRUCTURE_TYPE_RENDER_PASS_CREATE_INFO = 38;
    public static final int VK_STRUCTURE_TYPE_COMMAND_POOL_CREATE_INFO = 39;
    public static final int VK_STRUCTURE_TYPE_COMMAND_BUFFER_ALLOCATE_INFO = 40;
    public static final int VK_STRUCTURE_TYPE_COMMAND_BUFFER_INHERITANCE_INFO = 41;
    public static final int VK_STRUCTURE_TYPE_COMMAND_BUFFER_BEGIN_INFO = 42;
    public static final int VK_STRUCTURE_TYPE_RENDER_PASS_BEGIN_INFO = 43;
    public static final int VK_STRUCTURE_TYPE_BUFFER_MEMORY_BARRIER = 44;
    public static final int VK_STRUCTURE_TYPE_IMAGE_MEMORY_BARRIER = 45;
    public static final int VK_STRUCTURE_TYPE_MEMORY_BARRIER = 46;
    public static final int VK_STRUCTURE_TYPE_LOADER_INSTANCE_CREATE_INFO = 47;
    public static final int VK_STRUCTURE_TYPE_LOADER_DEVICE_CREATE_INFO = 48;
    public static final int VK_PIPELINE_CACHE_HEADER_VERSION_ONE = 1;
    public static final int VK_OBJECT_TYPE_UNKNOWN = 0;
    public static final int VK_OBJECT_TYPE_INSTANCE = 1;
    public static final int VK_OBJECT_TYPE_PHYSICAL_DEVICE = 2;
    public static final int VK_OBJECT_TYPE_DEVICE = 3;
    public static final int VK_OBJECT_TYPE_QUEUE = 4;
    public static final int VK_OBJECT_TYPE_SEMAPHORE = 5;
    public static final int VK_OBJECT_TYPE_COMMAND_BUFFER = 6;
    public static final int VK_OBJECT_TYPE_FENCE = 7;
    public static final int VK_OBJECT_TYPE_DEVICE_MEMORY = 8;
    public static final int VK_OBJECT_TYPE_BUFFER = 9;
    public static final int VK_OBJECT_TYPE_IMAGE = 10;
    public static final int VK_OBJECT_TYPE_EVENT = 11;
    public static final int VK_OBJECT_TYPE_QUERY_POOL = 12;
    public static final int VK_OBJECT_TYPE_BUFFER_VIEW = 13;
    public static final int VK_OBJECT_TYPE_IMAGE_VIEW = 14;
    public static final int VK_OBJECT_TYPE_SHADER_MODULE = 15;
    public static final int VK_OBJECT_TYPE_PIPELINE_CACHE = 16;
    public static final int VK_OBJECT_TYPE_PIPELINE_LAYOUT = 17;
    public static final int VK_OBJECT_TYPE_RENDER_PASS = 18;
    public static final int VK_OBJECT_TYPE_PIPELINE = 19;
    public static final int VK_OBJECT_TYPE_DESCRIPTOR_SET_LAYOUT = 20;
    public static final int VK_OBJECT_TYPE_SAMPLER = 21;
    public static final int VK_OBJECT_TYPE_DESCRIPTOR_POOL = 22;
    public static final int VK_OBJECT_TYPE_DESCRIPTOR_SET = 23;
    public static final int VK_OBJECT_TYPE_FRAMEBUFFER = 24;
    public static final int VK_OBJECT_TYPE_COMMAND_POOL = 25;
    public static final int VK_VENDOR_ID_KHRONOS = 0x10000;
    public static final int VK_VENDOR_ID_VIV = 0x10001;
    public static final int VK_VENDOR_ID_VSI = 0x10002;
    public static final int VK_VENDOR_ID_KAZAN = 0x10003;
    public static final int VK_VENDOR_ID_CODEPLAY = 0x10004;
    public static final int VK_VENDOR_ID_MESA = 0x10005;
    public static final int VK_VENDOR_ID_POCL = 0x10006;
    public static final int VK_VENDOR_ID_MOBILEYE = 0x10007;
    public static final int VK_FORMAT_UNDEFINED = 0;
    public static final int VK_FORMAT_R4G4_UNORM_PACK8 = 1;
    public static final int VK_FORMAT_R4G4B4A4_UNORM_PACK16 = 2;
    public static final int VK_FORMAT_B4G4R4A4_UNORM_PACK16 = 3;
    public static final int VK_FORMAT_R5G6B5_UNORM_PACK16 = 4;
    public static final int VK_FORMAT_B5G6R5_UNORM_PACK16 = 5;
    public static final int VK_FORMAT_R5G5B5A1_UNORM_PACK16 = 6;
    public static final int VK_FORMAT_B5G5R5A1_UNORM_PACK16 = 7;
    public static final int VK_FORMAT_A1R5G5B5_UNORM_PACK16 = 8;
    public static final int VK_FORMAT_R8_UNORM = 9;
    public static final int VK_FORMAT_R8_SNORM = 10;
    public static final int VK_FORMAT_R8_USCALED = 11;
    public static final int VK_FORMAT_R8_SSCALED = 12;
    public static final int VK_FORMAT_R8_UINT = 13;
    public static final int VK_FORMAT_R8_SINT = 14;
    public static final int VK_FORMAT_R8_SRGB = 15;
    public static final int VK_FORMAT_R8G8_UNORM = 16;
    public static final int VK_FORMAT_R8G8_SNORM = 17;
    public static final int VK_FORMAT_R8G8_USCALED = 18;
    public static final int VK_FORMAT_R8G8_SSCALED = 19;
    public static final int VK_FORMAT_R8G8_UINT = 20;
    public static final int VK_FORMAT_R8G8_SINT = 21;
    public static final int VK_FORMAT_R8G8_SRGB = 22;
    public static final int VK_FORMAT_R8G8B8_UNORM = 23;
    public static final int VK_FORMAT_R8G8B8_SNORM = 24;
    public static final int VK_FORMAT_R8G8B8_USCALED = 25;
    public static final int VK_FORMAT_R8G8B8_SSCALED = 26;
    public static final int VK_FORMAT_R8G8B8_UINT = 27;
    public static final int VK_FORMAT_R8G8B8_SINT = 28;
    public static final int VK_FORMAT_R8G8B8_SRGB = 29;
    public static final int VK_FORMAT_B8G8R8_UNORM = 30;
    public static final int VK_FORMAT_B8G8R8_SNORM = 31;
    public static final int VK_FORMAT_B8G8R8_USCALED = 32;
    public static final int VK_FORMAT_B8G8R8_SSCALED = 33;
    public static final int VK_FORMAT_B8G8R8_UINT = 34;
    public static final int VK_FORMAT_B8G8R8_SINT = 35;
    public static final int VK_FORMAT_B8G8R8_SRGB = 36;
    public static final int VK_FORMAT_R8G8B8A8_UNORM = 37;
    public static final int VK_FORMAT_R8G8B8A8_SNORM = 38;
    public static final int VK_FORMAT_R8G8B8A8_USCALED = 39;
    public static final int VK_FORMAT_R8G8B8A8_SSCALED = 40;
    public static final int VK_FORMAT_R8G8B8A8_UINT = 41;
    public static final int VK_FORMAT_R8G8B8A8_SINT = 42;
    public static final int VK_FORMAT_R8G8B8A8_SRGB = 43;
    public static final int VK_FORMAT_B8G8R8A8_UNORM = 44;
    public static final int VK_FORMAT_B8G8R8A8_SNORM = 45;
    public static final int VK_FORMAT_B8G8R8A8_USCALED = 46;
    public static final int VK_FORMAT_B8G8R8A8_SSCALED = 47;
    public static final int VK_FORMAT_B8G8R8A8_UINT = 48;
    public static final int VK_FORMAT_B8G8R8A8_SINT = 49;
    public static final int VK_FORMAT_B8G8R8A8_SRGB = 50;
    public static final int VK_FORMAT_A8B8G8R8_UNORM_PACK32 = 51;
    public static final int VK_FORMAT_A8B8G8R8_SNORM_PACK32 = 52;
    public static final int VK_FORMAT_A8B8G8R8_USCALED_PACK32 = 53;
    public static final int VK_FORMAT_A8B8G8R8_SSCALED_PACK32 = 54;
    public static final int VK_FORMAT_A8B8G8R8_UINT_PACK32 = 55;
    public static final int VK_FORMAT_A8B8G8R8_SINT_PACK32 = 56;
    public static final int VK_FORMAT_A8B8G8R8_SRGB_PACK32 = 57;
    public static final int VK_FORMAT_A2R10G10B10_UNORM_PACK32 = 58;
    public static final int VK_FORMAT_A2R10G10B10_SNORM_PACK32 = 59;
    public static final int VK_FORMAT_A2R10G10B10_USCALED_PACK32 = 60;
    public static final int VK_FORMAT_A2R10G10B10_SSCALED_PACK32 = 61;
    public static final int VK_FORMAT_A2R10G10B10_UINT_PACK32 = 62;
    public static final int VK_FORMAT_A2R10G10B10_SINT_PACK32 = 63;
    public static final int VK_FORMAT_A2B10G10R10_UNORM_PACK32 = 64;
    public static final int VK_FORMAT_A2B10G10R10_SNORM_PACK32 = 65;
    public static final int VK_FORMAT_A2B10G10R10_USCALED_PACK32 = 66;
    public static final int VK_FORMAT_A2B10G10R10_SSCALED_PACK32 = 67;
    public static final int VK_FORMAT_A2B10G10R10_UINT_PACK32 = 68;
    public static final int VK_FORMAT_A2B10G10R10_SINT_PACK32 = 69;
    public static final int VK_FORMAT_R16_UNORM = 70;
    public static final int VK_FORMAT_R16_SNORM = 71;
    public static final int VK_FORMAT_R16_USCALED = 72;
    public static final int VK_FORMAT_R16_SSCALED = 73;
    public static final int VK_FORMAT_R16_UINT = 74;
    public static final int VK_FORMAT_R16_SINT = 75;
    public static final int VK_FORMAT_R16_SFLOAT = 76;
    public static final int VK_FORMAT_R16G16_UNORM = 77;
    public static final int VK_FORMAT_R16G16_SNORM = 78;
    public static final int VK_FORMAT_R16G16_USCALED = 79;
    public static final int VK_FORMAT_R16G16_SSCALED = 80;
    public static final int VK_FORMAT_R16G16_UINT = 81;
    public static final int VK_FORMAT_R16G16_SINT = 82;
    public static final int VK_FORMAT_R16G16_SFLOAT = 83;
    public static final int VK_FORMAT_R16G16B16_UNORM = 84;
    public static final int VK_FORMAT_R16G16B16_SNORM = 85;
    public static final int VK_FORMAT_R16G16B16_USCALED = 86;
    public static final int VK_FORMAT_R16G16B16_SSCALED = 87;
    public static final int VK_FORMAT_R16G16B16_UINT = 88;
    public static final int VK_FORMAT_R16G16B16_SINT = 89;
    public static final int VK_FORMAT_R16G16B16_SFLOAT = 90;
    public static final int VK_FORMAT_R16G16B16A16_UNORM = 91;
    public static final int VK_FORMAT_R16G16B16A16_SNORM = 92;
    public static final int VK_FORMAT_R16G16B16A16_USCALED = 93;
    public static final int VK_FORMAT_R16G16B16A16_SSCALED = 94;
    public static final int VK_FORMAT_R16G16B16A16_UINT = 95;
    public static final int VK_FORMAT_R16G16B16A16_SINT = 96;
    public static final int VK_FORMAT_R16G16B16A16_SFLOAT = 97;
    public static final int VK_FORMAT_R32_UINT = 98;
    public static final int VK_FORMAT_R32_SINT = 99;
    public static final int VK_FORMAT_R32_SFLOAT = 100;
    public static final int VK_FORMAT_R32G32_UINT = 101;
    public static final int VK_FORMAT_R32G32_SINT = 102;
    public static final int VK_FORMAT_R32G32_SFLOAT = 103;
    public static final int VK_FORMAT_R32G32B32_UINT = 104;
    public static final int VK_FORMAT_R32G32B32_SINT = 105;
    public static final int VK_FORMAT_R32G32B32_SFLOAT = 106;
    public static final int VK_FORMAT_R32G32B32A32_UINT = 107;
    public static final int VK_FORMAT_R32G32B32A32_SINT = 108;
    public static final int VK_FORMAT_R32G32B32A32_SFLOAT = 109;
    public static final int VK_FORMAT_R64_UINT = 110;
    public static final int VK_FORMAT_R64_SINT = 111;
    public static final int VK_FORMAT_R64_SFLOAT = 112;
    public static final int VK_FORMAT_R64G64_UINT = 113;
    public static final int VK_FORMAT_R64G64_SINT = 114;
    public static final int VK_FORMAT_R64G64_SFLOAT = 115;
    public static final int VK_FORMAT_R64G64B64_UINT = 116;
    public static final int VK_FORMAT_R64G64B64_SINT = 117;
    public static final int VK_FORMAT_R64G64B64_SFLOAT = 118;
    public static final int VK_FORMAT_R64G64B64A64_UINT = 119;
    public static final int VK_FORMAT_R64G64B64A64_SINT = 120;
    public static final int VK_FORMAT_R64G64B64A64_SFLOAT = 121;
    public static final int VK_FORMAT_B10G11R11_UFLOAT_PACK32 = 122;
    public static final int VK_FORMAT_E5B9G9R9_UFLOAT_PACK32 = 123;
    public static final int VK_FORMAT_D16_UNORM = 124;
    public static final int VK_FORMAT_X8_D24_UNORM_PACK32 = 125;
    public static final int VK_FORMAT_D32_SFLOAT = 126;
    public static final int VK_FORMAT_S8_UINT = 127;
    public static final int VK_FORMAT_D16_UNORM_S8_UINT = 128;
    public static final int VK_FORMAT_D24_UNORM_S8_UINT = 129;
    public static final int VK_FORMAT_D32_SFLOAT_S8_UINT = 130;
    public static final int VK_FORMAT_BC1_RGB_UNORM_BLOCK = 131;
    public static final int VK_FORMAT_BC1_RGB_SRGB_BLOCK = 132;
    public static final int VK_FORMAT_BC1_RGBA_UNORM_BLOCK = 133;
    public static final int VK_FORMAT_BC1_RGBA_SRGB_BLOCK = 134;
    public static final int VK_FORMAT_BC2_UNORM_BLOCK = 135;
    public static final int VK_FORMAT_BC2_SRGB_BLOCK = 136;
    public static final int VK_FORMAT_BC3_UNORM_BLOCK = 137;
    public static final int VK_FORMAT_BC3_SRGB_BLOCK = 138;
    public static final int VK_FORMAT_BC4_UNORM_BLOCK = 139;
    public static final int VK_FORMAT_BC4_SNORM_BLOCK = 140;
    public static final int VK_FORMAT_BC5_UNORM_BLOCK = 141;
    public static final int VK_FORMAT_BC5_SNORM_BLOCK = 142;
    public static final int VK_FORMAT_BC6H_UFLOAT_BLOCK = 143;
    public static final int VK_FORMAT_BC6H_SFLOAT_BLOCK = 144;
    public static final int VK_FORMAT_BC7_UNORM_BLOCK = 145;
    public static final int VK_FORMAT_BC7_SRGB_BLOCK = 146;
    public static final int VK_FORMAT_ETC2_R8G8B8_UNORM_BLOCK = 147;
    public static final int VK_FORMAT_ETC2_R8G8B8_SRGB_BLOCK = 148;
    public static final int VK_FORMAT_ETC2_R8G8B8A1_UNORM_BLOCK = 149;
    public static final int VK_FORMAT_ETC2_R8G8B8A1_SRGB_BLOCK = 150;
    public static final int VK_FORMAT_ETC2_R8G8B8A8_UNORM_BLOCK = 151;
    public static final int VK_FORMAT_ETC2_R8G8B8A8_SRGB_BLOCK = 152;
    public static final int VK_FORMAT_EAC_R11_UNORM_BLOCK = 153;
    public static final int VK_FORMAT_EAC_R11_SNORM_BLOCK = 154;
    public static final int VK_FORMAT_EAC_R11G11_UNORM_BLOCK = 155;
    public static final int VK_FORMAT_EAC_R11G11_SNORM_BLOCK = 156;
    public static final int VK_FORMAT_ASTC_4x4_UNORM_BLOCK = 157;
    public static final int VK_FORMAT_ASTC_4x4_SRGB_BLOCK = 158;
    public static final int VK_FORMAT_ASTC_5x4_UNORM_BLOCK = 159;
    public static final int VK_FORMAT_ASTC_5x4_SRGB_BLOCK = 160;
    public static final int VK_FORMAT_ASTC_5x5_UNORM_BLOCK = 161;
    public static final int VK_FORMAT_ASTC_5x5_SRGB_BLOCK = 162;
    public static final int VK_FORMAT_ASTC_6x5_UNORM_BLOCK = 163;
    public static final int VK_FORMAT_ASTC_6x5_SRGB_BLOCK = 164;
    public static final int VK_FORMAT_ASTC_6x6_UNORM_BLOCK = 165;
    public static final int VK_FORMAT_ASTC_6x6_SRGB_BLOCK = 166;
    public static final int VK_FORMAT_ASTC_8x5_UNORM_BLOCK = 167;
    public static final int VK_FORMAT_ASTC_8x5_SRGB_BLOCK = 168;
    public static final int VK_FORMAT_ASTC_8x6_UNORM_BLOCK = 169;
    public static final int VK_FORMAT_ASTC_8x6_SRGB_BLOCK = 170;
    public static final int VK_FORMAT_ASTC_8x8_UNORM_BLOCK = 171;
    public static final int VK_FORMAT_ASTC_8x8_SRGB_BLOCK = 172;
    public static final int VK_FORMAT_ASTC_10x5_UNORM_BLOCK = 173;
    public static final int VK_FORMAT_ASTC_10x5_SRGB_BLOCK = 174;
    public static final int VK_FORMAT_ASTC_10x6_UNORM_BLOCK = 175;
    public static final int VK_FORMAT_ASTC_10x6_SRGB_BLOCK = 176;
    public static final int VK_FORMAT_ASTC_10x8_UNORM_BLOCK = 177;
    public static final int VK_FORMAT_ASTC_10x8_SRGB_BLOCK = 178;
    public static final int VK_FORMAT_ASTC_10x10_UNORM_BLOCK = 179;
    public static final int VK_FORMAT_ASTC_10x10_SRGB_BLOCK = 180;
    public static final int VK_FORMAT_ASTC_12x10_UNORM_BLOCK = 181;
    public static final int VK_FORMAT_ASTC_12x10_SRGB_BLOCK = 182;
    public static final int VK_FORMAT_ASTC_12x12_UNORM_BLOCK = 183;
    public static final int VK_FORMAT_ASTC_12x12_SRGB_BLOCK = 184;
    public static final int VK_FORMAT_FEATURE_SAMPLED_IMAGE_BIT = 0x00000001;
    public static final int VK_FORMAT_FEATURE_STORAGE_IMAGE_BIT = 0x00000002;
    public static final int VK_FORMAT_FEATURE_STORAGE_IMAGE_ATOMIC_BIT = 0x00000004;
    public static final int VK_FORMAT_FEATURE_UNIFORM_TEXEL_BUFFER_BIT = 0x00000008;
    public static final int VK_FORMAT_FEATURE_STORAGE_TEXEL_BUFFER_BIT = 0x00000010;
    public static final int VK_FORMAT_FEATURE_STORAGE_TEXEL_BUFFER_ATOMIC_BIT = 0x00000020;
    public static final int VK_FORMAT_FEATURE_VERTEX_BUFFER_BIT = 0x00000040;
    public static final int VK_FORMAT_FEATURE_COLOR_ATTACHMENT_BIT = 0x00000080;
    public static final int VK_FORMAT_FEATURE_COLOR_ATTACHMENT_BLEND_BIT = 0x00000100;
    public static final int VK_FORMAT_FEATURE_DEPTH_STENCIL_ATTACHMENT_BIT = 0x00000200;
    public static final int VK_FORMAT_FEATURE_BLIT_SRC_BIT = 0x00000400;
    public static final int VK_FORMAT_FEATURE_BLIT_DST_BIT = 0x00000800;
    public static final int VK_FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_LINEAR_BIT = 0x00001000;
    public static final int VK_IMAGE_CREATE_SPARSE_BINDING_BIT = 0x00000001;
    public static final int VK_IMAGE_CREATE_SPARSE_RESIDENCY_BIT = 0x00000002;
    public static final int VK_IMAGE_CREATE_SPARSE_ALIASED_BIT = 0x00000004;
    public static final int VK_IMAGE_CREATE_MUTABLE_FORMAT_BIT = 0x00000008;
    public static final int VK_IMAGE_CREATE_CUBE_COMPATIBLE_BIT = 0x00000010;
    public static final int VK_IMAGE_TILING_OPTIMAL = 0;
    public static final int VK_IMAGE_TILING_LINEAR = 1;
    public static final int VK_IMAGE_TYPE_1D = 0;
    public static final int VK_IMAGE_TYPE_2D = 1;
    public static final int VK_IMAGE_TYPE_3D = 2;
    public static final int VK_IMAGE_USAGE_TRANSFER_SRC_BIT = 0x00000001;
    public static final int VK_IMAGE_USAGE_TRANSFER_DST_BIT = 0x00000002;
    public static final int VK_IMAGE_USAGE_SAMPLED_BIT = 0x00000004;
    public static final int VK_IMAGE_USAGE_STORAGE_BIT = 0x00000008;
    public static final int VK_IMAGE_USAGE_COLOR_ATTACHMENT_BIT = 0x00000010;
    public static final int VK_IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT = 0x00000020;
    public static final int VK_IMAGE_USAGE_TRANSIENT_ATTACHMENT_BIT = 0x00000040;
    public static final int VK_IMAGE_USAGE_INPUT_ATTACHMENT_BIT = 0x00000080;
    public static final int VK_INTERNAL_ALLOCATION_TYPE_EXECUTABLE = 0;
    public static final int VK_MEMORY_HEAP_DEVICE_LOCAL_BIT = 0x00000001;
    public static final int VK_MEMORY_PROPERTY_DEVICE_LOCAL_BIT = 0x00000001;
    public static final int VK_MEMORY_PROPERTY_HOST_VISIBLE_BIT = 0x00000002;
    public static final int VK_MEMORY_PROPERTY_HOST_COHERENT_BIT = 0x00000004;
    public static final int VK_MEMORY_PROPERTY_HOST_CACHED_BIT = 0x00000008;
    public static final int VK_MEMORY_PROPERTY_LAZILY_ALLOCATED_BIT = 0x00000010;
    public static final int VK_PHYSICAL_DEVICE_TYPE_OTHER = 0;
    public static final int VK_PHYSICAL_DEVICE_TYPE_INTEGRATED_GPU = 1;
    public static final int VK_PHYSICAL_DEVICE_TYPE_DISCRETE_GPU = 2;
    public static final int VK_PHYSICAL_DEVICE_TYPE_VIRTUAL_GPU = 3;
    public static final int VK_PHYSICAL_DEVICE_TYPE_CPU = 4;
    public static final int VK_QUEUE_GRAPHICS_BIT = 0x00000001;
    public static final int VK_QUEUE_COMPUTE_BIT = 0x00000002;
    public static final int VK_QUEUE_TRANSFER_BIT = 0x00000004;
    public static final int VK_QUEUE_SPARSE_BINDING_BIT = 0x00000008;
    public static final int VK_SAMPLE_COUNT_1_BIT = 0x00000001;
    public static final int VK_SAMPLE_COUNT_2_BIT = 0x00000002;
    public static final int VK_SAMPLE_COUNT_4_BIT = 0x00000004;
    public static final int VK_SAMPLE_COUNT_8_BIT = 0x00000008;
    public static final int VK_SAMPLE_COUNT_16_BIT = 0x00000010;
    public static final int VK_SAMPLE_COUNT_32_BIT = 0x00000020;
    public static final int VK_SAMPLE_COUNT_64_BIT = 0x00000040;
    public static final int VK_SYSTEM_ALLOCATION_SCOPE_COMMAND = 0;
    public static final int VK_SYSTEM_ALLOCATION_SCOPE_OBJECT = 1;
    public static final int VK_SYSTEM_ALLOCATION_SCOPE_CACHE = 2;
    public static final int VK_SYSTEM_ALLOCATION_SCOPE_DEVICE = 3;
    public static final int VK_SYSTEM_ALLOCATION_SCOPE_INSTANCE = 4;
    public static final int VK_PIPELINE_STAGE_TOP_OF_PIPE_BIT = 0x00000001;
    public static final int VK_PIPELINE_STAGE_DRAW_INDIRECT_BIT = 0x00000002;
    public static final int VK_PIPELINE_STAGE_VERTEX_INPUT_BIT = 0x00000004;
    public static final int VK_PIPELINE_STAGE_VERTEX_SHADER_BIT = 0x00000008;
    public static final int VK_PIPELINE_STAGE_TESSELLATION_CONTROL_SHADER_BIT = 0x00000010;
    public static final int VK_PIPELINE_STAGE_TESSELLATION_EVALUATION_SHADER_BIT = 0x00000020;
    public static final int VK_PIPELINE_STAGE_GEOMETRY_SHADER_BIT = 0x00000040;
    public static final int VK_PIPELINE_STAGE_FRAGMENT_SHADER_BIT = 0x00000080;
    public static final int VK_PIPELINE_STAGE_EARLY_FRAGMENT_TESTS_BIT = 0x00000100;
    public static final int VK_PIPELINE_STAGE_LATE_FRAGMENT_TESTS_BIT = 0x00000200;
    public static final int VK_PIPELINE_STAGE_COLOR_ATTACHMENT_OUTPUT_BIT = 0x00000400;
    public static final int VK_PIPELINE_STAGE_COMPUTE_SHADER_BIT = 0x00000800;
    public static final int VK_PIPELINE_STAGE_TRANSFER_BIT = 0x00001000;
    public static final int VK_PIPELINE_STAGE_BOTTOM_OF_PIPE_BIT = 0x00002000;
    public static final int VK_PIPELINE_STAGE_HOST_BIT = 0x00004000;
    public static final int VK_PIPELINE_STAGE_ALL_GRAPHICS_BIT = 0x00008000;
    public static final int VK_PIPELINE_STAGE_ALL_COMMANDS_BIT = 0x00010000;
    public static final int VK_IMAGE_ASPECT_COLOR_BIT = 0x00000001;
    public static final int VK_IMAGE_ASPECT_DEPTH_BIT = 0x00000002;
    public static final int VK_IMAGE_ASPECT_STENCIL_BIT = 0x00000004;
    public static final int VK_IMAGE_ASPECT_METADATA_BIT = 0x00000008;
    public static final int VK_SPARSE_IMAGE_FORMAT_SINGLE_MIPTAIL_BIT = 0x00000001;
    public static final int VK_SPARSE_IMAGE_FORMAT_ALIGNED_MIP_SIZE_BIT = 0x00000002;
    public static final int VK_SPARSE_IMAGE_FORMAT_NONSTANDARD_BLOCK_SIZE_BIT = 0x00000004;
    public static final int VK_SPARSE_MEMORY_BIND_METADATA_BIT = 0x00000001;
    public static final int VK_FENCE_CREATE_SIGNALED_BIT = 0x00000001;
    public static final int VK_QUERY_PIPELINE_STATISTIC_INPUT_ASSEMBLY_VERTICES_BIT = 0x00000001;
    public static final int VK_QUERY_PIPELINE_STATISTIC_INPUT_ASSEMBLY_PRIMITIVES_BIT = 0x00000002;
    public static final int VK_QUERY_PIPELINE_STATISTIC_VERTEX_SHADER_INVOCATIONS_BIT = 0x00000004;
    public static final int VK_QUERY_PIPELINE_STATISTIC_GEOMETRY_SHADER_INVOCATIONS_BIT = 0x00000008;
    public static final int VK_QUERY_PIPELINE_STATISTIC_GEOMETRY_SHADER_PRIMITIVES_BIT = 0x00000010;
    public static final int VK_QUERY_PIPELINE_STATISTIC_CLIPPING_INVOCATIONS_BIT = 0x00000020;
    public static final int VK_QUERY_PIPELINE_STATISTIC_CLIPPING_PRIMITIVES_BIT = 0x00000040;
    public static final int VK_QUERY_PIPELINE_STATISTIC_FRAGMENT_SHADER_INVOCATIONS_BIT = 0x00000080;
    public static final int VK_QUERY_PIPELINE_STATISTIC_TESSELLATION_CONTROL_SHADER_PATCHES_BIT = 0x00000100;
    public static final int VK_QUERY_PIPELINE_STATISTIC_TESSELLATION_EVALUATION_SHADER_INVOCATIONS_BIT = 0x00000200;
    public static final int VK_QUERY_PIPELINE_STATISTIC_COMPUTE_SHADER_INVOCATIONS_BIT = 0x00000400;
    public static final int VK_QUERY_RESULT_64_BIT = 0x00000001;
    public static final int VK_QUERY_RESULT_WAIT_BIT = 0x00000002;
    public static final int VK_QUERY_RESULT_WITH_AVAILABILITY_BIT = 0x00000004;
    public static final int VK_QUERY_RESULT_PARTIAL_BIT = 0x00000008;
    public static final int VK_QUERY_TYPE_OCCLUSION = 0;
    public static final int VK_QUERY_TYPE_PIPELINE_STATISTICS = 1;
    public static final int VK_QUERY_TYPE_TIMESTAMP = 2;
    public static final int VK_BUFFER_CREATE_SPARSE_BINDING_BIT = 0x00000001;
    public static final int VK_BUFFER_CREATE_SPARSE_RESIDENCY_BIT = 0x00000002;
    public static final int VK_BUFFER_CREATE_SPARSE_ALIASED_BIT = 0x00000004;
    public static final int VK_BUFFER_USAGE_TRANSFER_SRC_BIT = 0x00000001;
    public static final int VK_BUFFER_USAGE_TRANSFER_DST_BIT = 0x00000002;
    public static final int VK_BUFFER_USAGE_UNIFORM_TEXEL_BUFFER_BIT = 0x00000004;
    public static final int VK_BUFFER_USAGE_STORAGE_TEXEL_BUFFER_BIT = 0x00000008;
    public static final int VK_BUFFER_USAGE_UNIFORM_BUFFER_BIT = 0x00000010;
    public static final int VK_BUFFER_USAGE_STORAGE_BUFFER_BIT = 0x00000020;
    public static final int VK_BUFFER_USAGE_INDEX_BUFFER_BIT = 0x00000040;
    public static final int VK_BUFFER_USAGE_VERTEX_BUFFER_BIT = 0x00000080;
    public static final int VK_BUFFER_USAGE_INDIRECT_BUFFER_BIT = 0x00000100;
    public static final int VK_SHARING_MODE_EXCLUSIVE = 0;
    public static final int VK_SHARING_MODE_CONCURRENT = 1;
    public static final int VK_IMAGE_LAYOUT_UNDEFINED = 0;
    public static final int VK_IMAGE_LAYOUT_GENERAL = 1;
    public static final int VK_IMAGE_LAYOUT_COLOR_ATTACHMENT_OPTIMAL = 2;
    public static final int VK_IMAGE_LAYOUT_DEPTH_STENCIL_ATTACHMENT_OPTIMAL = 3;
    public static final int VK_IMAGE_LAYOUT_DEPTH_STENCIL_READ_ONLY_OPTIMAL = 4;
    public static final int VK_IMAGE_LAYOUT_SHADER_READ_ONLY_OPTIMAL = 5;
    public static final int VK_IMAGE_LAYOUT_TRANSFER_SRC_OPTIMAL = 6;
    public static final int VK_IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL = 7;
    public static final int VK_IMAGE_LAYOUT_PREINITIALIZED = 8;
    public static final int VK_COMPONENT_SWIZZLE_IDENTITY = 0;
    public static final int VK_COMPONENT_SWIZZLE_ZERO = 1;
    public static final int VK_COMPONENT_SWIZZLE_ONE = 2;
    public static final int VK_COMPONENT_SWIZZLE_R = 3;
    public static final int VK_COMPONENT_SWIZZLE_G = 4;
    public static final int VK_COMPONENT_SWIZZLE_B = 5;
    public static final int VK_COMPONENT_SWIZZLE_A = 6;
    public static final int VK_IMAGE_VIEW_TYPE_1D = 0;
    public static final int VK_IMAGE_VIEW_TYPE_2D = 1;
    public static final int VK_IMAGE_VIEW_TYPE_3D = 2;
    public static final int VK_IMAGE_VIEW_TYPE_CUBE = 3;
    public static final int VK_IMAGE_VIEW_TYPE_1D_ARRAY = 4;
    public static final int VK_IMAGE_VIEW_TYPE_2D_ARRAY = 5;
    public static final int VK_IMAGE_VIEW_TYPE_CUBE_ARRAY = 6;
    public static final int VK_BLEND_FACTOR_ZERO = 0;
    public static final int VK_BLEND_FACTOR_ONE = 1;
    public static final int VK_BLEND_FACTOR_SRC_COLOR = 2;
    public static final int VK_BLEND_FACTOR_ONE_MINUS_SRC_COLOR = 3;
    public static final int VK_BLEND_FACTOR_DST_COLOR = 4;
    public static final int VK_BLEND_FACTOR_ONE_MINUS_DST_COLOR = 5;
    public static final int VK_BLEND_FACTOR_SRC_ALPHA = 6;
    public static final int VK_BLEND_FACTOR_ONE_MINUS_SRC_ALPHA = 7;
    public static final int VK_BLEND_FACTOR_DST_ALPHA = 8;
    public static final int VK_BLEND_FACTOR_ONE_MINUS_DST_ALPHA = 9;
    public static final int VK_BLEND_FACTOR_CONSTANT_COLOR = 10;
    public static final int VK_BLEND_FACTOR_ONE_MINUS_CONSTANT_COLOR = 11;
    public static final int VK_BLEND_FACTOR_CONSTANT_ALPHA = 12;
    public static final int VK_BLEND_FACTOR_ONE_MINUS_CONSTANT_ALPHA = 13;
    public static final int VK_BLEND_FACTOR_SRC_ALPHA_SATURATE = 14;
    public static final int VK_BLEND_FACTOR_SRC1_COLOR = 15;
    public static final int VK_BLEND_FACTOR_ONE_MINUS_SRC1_COLOR = 16;
    public static final int VK_BLEND_FACTOR_SRC1_ALPHA = 17;
    public static final int VK_BLEND_FACTOR_ONE_MINUS_SRC1_ALPHA = 18;
    public static final int VK_BLEND_OP_ADD = 0;
    public static final int VK_BLEND_OP_SUBTRACT = 1;
    public static final int VK_BLEND_OP_REVERSE_SUBTRACT = 2;
    public static final int VK_BLEND_OP_MIN = 3;
    public static final int VK_BLEND_OP_MAX = 4;
    public static final int VK_COLOR_COMPONENT_R_BIT = 0x00000001;
    public static final int VK_COLOR_COMPONENT_G_BIT = 0x00000002;
    public static final int VK_COLOR_COMPONENT_B_BIT = 0x00000004;
    public static final int VK_COLOR_COMPONENT_A_BIT = 0x00000008;
    public static final int VK_COMPARE_OP_NEVER = 0;
    public static final int VK_COMPARE_OP_LESS = 1;
    public static final int VK_COMPARE_OP_EQUAL = 2;
    public static final int VK_COMPARE_OP_LESS_OR_EQUAL = 3;
    public static final int VK_COMPARE_OP_GREATER = 4;
    public static final int VK_COMPARE_OP_NOT_EQUAL = 5;
    public static final int VK_COMPARE_OP_GREATER_OR_EQUAL = 6;
    public static final int VK_COMPARE_OP_ALWAYS = 7;
    public static final int VK_CULL_MODE_NONE = 0;
    public static final int VK_CULL_MODE_FRONT_BIT = 0x00000001;
    public static final int VK_CULL_MODE_BACK_BIT = 0x00000002;
    public static final int VK_CULL_MODE_FRONT_AND_BACK = 0x00000003;
    public static final int VK_DYNAMIC_STATE_VIEWPORT = 0;
    public static final int VK_DYNAMIC_STATE_SCISSOR = 1;
    public static final int VK_DYNAMIC_STATE_LINE_WIDTH = 2;
    public static final int VK_DYNAMIC_STATE_DEPTH_BIAS = 3;
    public static final int VK_DYNAMIC_STATE_BLEND_CONSTANTS = 4;
    public static final int VK_DYNAMIC_STATE_DEPTH_BOUNDS = 5;
    public static final int VK_DYNAMIC_STATE_STENCIL_COMPARE_MASK = 6;
    public static final int VK_DYNAMIC_STATE_STENCIL_WRITE_MASK = 7;
    public static final int VK_DYNAMIC_STATE_STENCIL_REFERENCE = 8;
    public static final int VK_FRONT_FACE_COUNTER_CLOCKWISE = 0;
    public static final int VK_FRONT_FACE_CLOCKWISE = 1;
    public static final int VK_LOGIC_OP_CLEAR = 0;
    public static final int VK_LOGIC_OP_AND = 1;
    public static final int VK_LOGIC_OP_AND_REVERSE = 2;
    public static final int VK_LOGIC_OP_COPY = 3;
    public static final int VK_LOGIC_OP_AND_INVERTED = 4;
    public static final int VK_LOGIC_OP_NO_OP = 5;
    public static final int VK_LOGIC_OP_XOR = 6;
    public static final int VK_LOGIC_OP_OR = 7;
    public static final int VK_LOGIC_OP_NOR = 8;
    public static final int VK_LOGIC_OP_EQUIVALENT = 9;
    public static final int VK_LOGIC_OP_INVERT = 10;
    public static final int VK_LOGIC_OP_OR_REVERSE = 11;
    public static final int VK_LOGIC_OP_COPY_INVERTED = 12;
    public static final int VK_LOGIC_OP_OR_INVERTED = 13;
    public static final int VK_LOGIC_OP_NAND = 14;
    public static final int VK_LOGIC_OP_SET = 15;
    public static final int VK_PIPELINE_CREATE_DISABLE_OPTIMIZATION_BIT = 0x00000001;
    public static final int VK_PIPELINE_CREATE_ALLOW_DERIVATIVES_BIT = 0x00000002;
    public static final int VK_PIPELINE_CREATE_DERIVATIVE_BIT = 0x00000004;
    public static final int VK_POLYGON_MODE_FILL = 0;
    public static final int VK_POLYGON_MODE_LINE = 1;
    public static final int VK_POLYGON_MODE_POINT = 2;
    public static final int VK_PRIMITIVE_TOPOLOGY_POINT_LIST = 0;
    public static final int VK_PRIMITIVE_TOPOLOGY_LINE_LIST = 1;
    public static final int VK_PRIMITIVE_TOPOLOGY_LINE_STRIP = 2;
    public static final int VK_PRIMITIVE_TOPOLOGY_TRIANGLE_LIST = 3;
    public static final int VK_PRIMITIVE_TOPOLOGY_TRIANGLE_STRIP = 4;
    public static final int VK_PRIMITIVE_TOPOLOGY_TRIANGLE_FAN = 5;
    public static final int VK_PRIMITIVE_TOPOLOGY_LINE_LIST_WITH_ADJACENCY = 6;
    public static final int VK_PRIMITIVE_TOPOLOGY_LINE_STRIP_WITH_ADJACENCY = 7;
    public static final int VK_PRIMITIVE_TOPOLOGY_TRIANGLE_LIST_WITH_ADJACENCY = 8;
    public static final int VK_PRIMITIVE_TOPOLOGY_TRIANGLE_STRIP_WITH_ADJACENCY = 9;
    public static final int VK_PRIMITIVE_TOPOLOGY_PATCH_LIST = 10;
    public static final int VK_SHADER_STAGE_VERTEX_BIT = 0x00000001;
    public static final int VK_SHADER_STAGE_TESSELLATION_CONTROL_BIT = 0x00000002;
    public static final int VK_SHADER_STAGE_TESSELLATION_EVALUATION_BIT = 0x00000004;
    public static final int VK_SHADER_STAGE_GEOMETRY_BIT = 0x00000008;
    public static final int VK_SHADER_STAGE_FRAGMENT_BIT = 0x00000010;
    public static final int VK_SHADER_STAGE_COMPUTE_BIT = 0x00000020;
    public static final int VK_SHADER_STAGE_ALL_GRAPHICS = 0x0000001F;
    public static final int VK_SHADER_STAGE_ALL = 0x7FFFFFFF;
    public static final int VK_STENCIL_OP_KEEP = 0;
    public static final int VK_STENCIL_OP_ZERO = 1;
    public static final int VK_STENCIL_OP_REPLACE = 2;
    public static final int VK_STENCIL_OP_INCREMENT_AND_CLAMP = 3;
    public static final int VK_STENCIL_OP_DECREMENT_AND_CLAMP = 4;
    public static final int VK_STENCIL_OP_INVERT = 5;
    public static final int VK_STENCIL_OP_INCREMENT_AND_WRAP = 6;
    public static final int VK_STENCIL_OP_DECREMENT_AND_WRAP = 7;
    public static final int VK_VERTEX_INPUT_RATE_VERTEX = 0;
    public static final int VK_VERTEX_INPUT_RATE_INSTANCE = 1;
    public static final int VK_BORDER_COLOR_FLOAT_TRANSPARENT_BLACK = 0;
    public static final int VK_BORDER_COLOR_INT_TRANSPARENT_BLACK = 1;
    public static final int VK_BORDER_COLOR_FLOAT_OPAQUE_BLACK = 2;
    public static final int VK_BORDER_COLOR_INT_OPAQUE_BLACK = 3;
    public static final int VK_BORDER_COLOR_FLOAT_OPAQUE_WHITE = 4;
    public static final int VK_BORDER_COLOR_INT_OPAQUE_WHITE = 5;
    public static final int VK_FILTER_NEAREST = 0;
    public static final int VK_FILTER_LINEAR = 1;
    public static final int VK_SAMPLER_ADDRESS_MODE_REPEAT = 0;
    public static final int VK_SAMPLER_ADDRESS_MODE_MIRRORED_REPEAT = 1;
    public static final int VK_SAMPLER_ADDRESS_MODE_CLAMP_TO_EDGE = 2;
    public static final int VK_SAMPLER_ADDRESS_MODE_CLAMP_TO_BORDER = 3;
    public static final int VK_SAMPLER_MIPMAP_MODE_NEAREST = 0;
    public static final int VK_SAMPLER_MIPMAP_MODE_LINEAR = 1;
    public static final int VK_DESCRIPTOR_POOL_CREATE_FREE_DESCRIPTOR_SET_BIT = 0x00000001;
    public static final int VK_DESCRIPTOR_TYPE_SAMPLER = 0;
    public static final int VK_DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER = 1;
    public static final int VK_DESCRIPTOR_TYPE_SAMPLED_IMAGE = 2;
    public static final int VK_DESCRIPTOR_TYPE_STORAGE_IMAGE = 3;
    public static final int VK_DESCRIPTOR_TYPE_UNIFORM_TEXEL_BUFFER = 4;
    public static final int VK_DESCRIPTOR_TYPE_STORAGE_TEXEL_BUFFER = 5;
    public static final int VK_DESCRIPTOR_TYPE_UNIFORM_BUFFER = 6;
    public static final int VK_DESCRIPTOR_TYPE_STORAGE_BUFFER = 7;
    public static final int VK_DESCRIPTOR_TYPE_UNIFORM_BUFFER_DYNAMIC = 8;
    public static final int VK_DESCRIPTOR_TYPE_STORAGE_BUFFER_DYNAMIC = 9;
    public static final int VK_DESCRIPTOR_TYPE_INPUT_ATTACHMENT = 10;
    public static final int VK_ACCESS_INDIRECT_COMMAND_READ_BIT = 0x00000001;
    public static final int VK_ACCESS_INDEX_READ_BIT = 0x00000002;
    public static final int VK_ACCESS_VERTEX_ATTRIBUTE_READ_BIT = 0x00000004;
    public static final int VK_ACCESS_UNIFORM_READ_BIT = 0x00000008;
    public static final int VK_ACCESS_INPUT_ATTACHMENT_READ_BIT = 0x00000010;
    public static final int VK_ACCESS_SHADER_READ_BIT = 0x00000020;
    public static final int VK_ACCESS_SHADER_WRITE_BIT = 0x00000040;
    public static final int VK_ACCESS_COLOR_ATTACHMENT_READ_BIT = 0x00000080;
    public static final int VK_ACCESS_COLOR_ATTACHMENT_WRITE_BIT = 0x00000100;
    public static final int VK_ACCESS_DEPTH_STENCIL_ATTACHMENT_READ_BIT = 0x00000200;
    public static final int VK_ACCESS_DEPTH_STENCIL_ATTACHMENT_WRITE_BIT = 0x00000400;
    public static final int VK_ACCESS_TRANSFER_READ_BIT = 0x00000800;
    public static final int VK_ACCESS_TRANSFER_WRITE_BIT = 0x00001000;
    public static final int VK_ACCESS_HOST_READ_BIT = 0x00002000;
    public static final int VK_ACCESS_HOST_WRITE_BIT = 0x00004000;
    public static final int VK_ACCESS_MEMORY_READ_BIT = 0x00008000;
    public static final int VK_ACCESS_MEMORY_WRITE_BIT = 0x00010000;
    public static final int VK_ATTACHMENT_DESCRIPTION_MAY_ALIAS_BIT = 0x00000001;
    public static final int VK_ATTACHMENT_LOAD_OP_LOAD = 0;
    public static final int VK_ATTACHMENT_LOAD_OP_CLEAR = 1;
    public static final int VK_ATTACHMENT_LOAD_OP_DONT_CARE = 2;
    public static final int VK_ATTACHMENT_STORE_OP_STORE = 0;
    public static final int VK_ATTACHMENT_STORE_OP_DONT_CARE = 1;
    public static final int VK_DEPENDENCY_BY_REGION_BIT = 0x00000001;
    public static final int VK_PIPELINE_BIND_POINT_GRAPHICS = 0;
    public static final int VK_PIPELINE_BIND_POINT_COMPUTE = 1;
    public static final int VK_COMMAND_POOL_CREATE_TRANSIENT_BIT = 0x00000001;
    public static final int VK_COMMAND_POOL_CREATE_RESET_COMMAND_BUFFER_BIT = 0x00000002;
    public static final int VK_COMMAND_POOL_RESET_RELEASE_RESOURCES_BIT = 0x00000001;
    public static final int VK_COMMAND_BUFFER_LEVEL_PRIMARY = 0;
    public static final int VK_COMMAND_BUFFER_LEVEL_SECONDARY = 1;
    public static final int VK_COMMAND_BUFFER_RESET_RELEASE_RESOURCES_BIT = 0x00000001;
    public static final int VK_COMMAND_BUFFER_USAGE_ONE_TIME_SUBMIT_BIT = 0x00000001;
    public static final int VK_COMMAND_BUFFER_USAGE_RENDER_PASS_CONTINUE_BIT = 0x00000002;
    public static final int VK_COMMAND_BUFFER_USAGE_SIMULTANEOUS_USE_BIT = 0x00000004;
    public static final int VK_QUERY_CONTROL_PRECISE_BIT = 0x00000001;
    public static final int VK_INDEX_TYPE_UINT16 = 0;
    public static final int VK_INDEX_TYPE_UINT32 = 1;
    public static final int VK_STENCIL_FACE_FRONT_BIT = 0x00000001;
    public static final int VK_STENCIL_FACE_BACK_BIT = 0x00000002;
    public static final int VK_STENCIL_FACE_FRONT_AND_BACK = 0x00000003;
    public static final int VK_STENCIL_FRONT_AND_BACK = 0x00000003;
    public static final int VK_SUBPASS_CONTENTS_INLINE = 0;
    public static final int VK_SUBPASS_CONTENTS_SECONDARY_COMMAND_BUFFERS = 1;
    public static final int VK_ATTACHMENT_UNUSED = (~0);
    public static final int VK_FALSE = 0;
    public static final float VK_LOD_CLAMP_NONE = 1000.0F;
    public static final int VK_QUEUE_FAMILY_IGNORED = (~0);
    public static final int VK_REMAINING_ARRAY_LAYERS = (~0);
    public static final int VK_REMAINING_MIP_LEVELS = (~0);
    public static final int VK_SUBPASS_EXTERNAL = (~0);
    public static final int VK_TRUE = 1;
    public static final long VK_WHOLE_SIZE = (~0L);
    public static final int VK_MAX_MEMORY_TYPES = 32;
    public static final int VK_MAX_PHYSICAL_DEVICE_NAME_SIZE = 256;
    public static final int VK_UUID_SIZE = 16;
    public static final int VK_MAX_EXTENSION_NAME_SIZE = 256;
    public static final int VK_MAX_DESCRIPTION_SIZE = 256;
    public static final int VK_MAX_MEMORY_HEAPS = 16;
    public static final class Handles {
        public static final MethodHandle MH_vkCreateInstance = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkDestroyInstance = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkEnumeratePhysicalDevices = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetPhysicalDeviceFeatures = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetPhysicalDeviceFormatProperties = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetPhysicalDeviceImageFormatProperties = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetPhysicalDeviceProperties = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetPhysicalDeviceQueueFamilyProperties = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetPhysicalDeviceMemoryProperties = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetInstanceProcAddr = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetDeviceProcAddr = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCreateDevice = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkDestroyDevice = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkEnumerateInstanceExtensionProperties = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkEnumerateDeviceExtensionProperties = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkEnumerateInstanceLayerProperties = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkEnumerateDeviceLayerProperties = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetDeviceQueue = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkQueueSubmit = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG));
        public static final MethodHandle MH_vkQueueWaitIdle = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkDeviceWaitIdle = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkAllocateMemory = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkFreeMemory = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkMapMemory = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkUnmapMemory = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG));
        public static final MethodHandle MH_vkFlushMappedMemoryRanges = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkInvalidateMappedMemoryRanges = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetDeviceMemoryCommitment = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkBindBufferMemory = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG));
        public static final MethodHandle MH_vkBindImageMemory = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG));
        public static final MethodHandle MH_vkGetBufferMemoryRequirements = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetImageMemoryRequirements = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetImageSparseMemoryRequirements = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetPhysicalDeviceSparseImageFormatProperties = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkQueueBindSparse = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG));
        public static final MethodHandle MH_vkCreateFence = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkDestroyFence = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkResetFences = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetFenceStatus = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG));
        public static final MethodHandle MH_vkWaitForFences = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));
        public static final MethodHandle MH_vkCreateSemaphore = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkDestroySemaphore = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCreateEvent = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkDestroyEvent = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetEventStatus = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG));
        public static final MethodHandle MH_vkSetEvent = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG));
        public static final MethodHandle MH_vkResetEvent = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG));
        public static final MethodHandle MH_vkCreateQueryPool = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkDestroyQueryPool = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetQueryPoolResults = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, CanonicalTypes.SIZE_T, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_vkCreateBuffer = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkDestroyBuffer = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCreateBufferView = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkDestroyBufferView = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCreateImage = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkDestroyImage = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetImageSubresourceLayout = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCreateImageView = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkDestroyImageView = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCreateShaderModule = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkDestroyShaderModule = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCreatePipelineCache = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkDestroyPipelineCache = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetPipelineCacheData = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkMergePipelineCaches = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCreateGraphicsPipelines = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCreateComputePipelines = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkDestroyPipeline = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCreatePipelineLayout = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkDestroyPipelineLayout = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCreateSampler = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkDestroySampler = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCreateDescriptorSetLayout = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkDestroyDescriptorSetLayout = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCreateDescriptorPool = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkDestroyDescriptorPool = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkResetDescriptorPool = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_vkAllocateDescriptorSets = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkFreeDescriptorSets = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkUpdateDescriptorSets = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCreateFramebuffer = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkDestroyFramebuffer = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCreateRenderPass = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkDestroyRenderPass = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetRenderAreaGranularity = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCreateCommandPool = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkDestroyCommandPool = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkResetCommandPool = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_vkAllocateCommandBuffers = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkFreeCommandBuffers = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkBeginCommandBuffer = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkEndCommandBuffer = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkResetCommandBuffer = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_vkCmdBindPipeline = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));
        public static final MethodHandle MH_vkCmdSetViewport = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdSetScissor = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdSetLineWidth = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT));
        public static final MethodHandle MH_vkCmdSetDepthBias = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));
        public static final MethodHandle MH_vkCmdSetBlendConstants = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdSetDepthBounds = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));
        public static final MethodHandle MH_vkCmdSetStencilCompareMask = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_vkCmdSetStencilWriteMask = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_vkCmdSetStencilReference = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_vkCmdBindDescriptorSets = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdBindIndexBuffer = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_vkCmdBindVertexBuffers = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdDraw = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_vkCmdDrawIndexed = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_vkCmdDrawIndirect = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_vkCmdDrawIndexedIndirect = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_vkCmdDispatch = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_vkCmdDispatchIndirect = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG));
        public static final MethodHandle MH_vkCmdCopyBuffer = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdCopyImage = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdBlitImage = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_vkCmdCopyBufferToImage = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdCopyImageToBuffer = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdUpdateBuffer = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdFillBuffer = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_vkCmdClearColorImage = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdClearDepthStencilImage = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdClearAttachments = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdResolveImage = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdSetEvent = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_vkCmdResetEvent = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_vkCmdWaitEvents = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdPipelineBarrier = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdBeginQuery = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_vkCmdEndQuery = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_vkCmdResetQueryPool = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_vkCmdWriteTimestamp = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_vkCmdCopyQueryPoolResults = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_vkCmdPushConstants = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdBeginRenderPass = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_vkCmdNextSubpass = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_vkCmdEndRenderPass = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdExecuteCommands = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        private Handles() {}
    }

    private VK10() {}

    /// ```
    /// (int) VkResult vkCreateInstance(const VkInstanceCreateInfo* pCreateInfo, const VkAllocationCallbacks* pAllocator, VkInstance* pInstance);
    /// ```
    public static int vkCreateInstance(MemorySegment pCreateInfo, MemorySegment pAllocator, MemorySegment pInstance) {
        if (MemoryUtil.isNullPointer(VK.globalCommands().PFN_vkCreateInstance)) throw new SymbolNotFoundError("Symbol not found: vkCreateInstance");
        try { return (int) Handles.MH_vkCreateInstance.invokeExact(VK.globalCommands().PFN_vkCreateInstance, pCreateInfo, pAllocator, pInstance); }
        catch (Throwable e) { throw new RuntimeException("error in vkCreateInstance", e); }
    }

    /// ```
    /// void vkDestroyInstance((struct VkInstance*) VkInstance instance, const VkAllocationCallbacks* pAllocator);
    /// ```
    public static void vkDestroyInstance(VkInstance instance, MemorySegment pAllocator) {
        if (MemoryUtil.isNullPointer(instance.capabilities().PFN_vkDestroyInstance)) throw new SymbolNotFoundError("Symbol not found: vkDestroyInstance");
        try { Handles.MH_vkDestroyInstance.invokeExact(instance.capabilities().PFN_vkDestroyInstance, instance.segment(), pAllocator); }
        catch (Throwable e) { throw new RuntimeException("error in vkDestroyInstance", e); }
    }

    /// ```
    /// (int) VkResult vkEnumeratePhysicalDevices((struct VkInstance*) VkInstance instance, uint32_t* pPhysicalDeviceCount, VkPhysicalDevice* pPhysicalDevices);
    /// ```
    public static int vkEnumeratePhysicalDevices(VkInstance instance, MemorySegment pPhysicalDeviceCount, MemorySegment pPhysicalDevices) {
        if (MemoryUtil.isNullPointer(instance.capabilities().PFN_vkEnumeratePhysicalDevices)) throw new SymbolNotFoundError("Symbol not found: vkEnumeratePhysicalDevices");
        try { return (int) Handles.MH_vkEnumeratePhysicalDevices.invokeExact(instance.capabilities().PFN_vkEnumeratePhysicalDevices, instance.segment(), pPhysicalDeviceCount, pPhysicalDevices); }
        catch (Throwable e) { throw new RuntimeException("error in vkEnumeratePhysicalDevices", e); }
    }

    /// ```
    /// void vkGetPhysicalDeviceFeatures((struct VkPhysicalDevice*) VkPhysicalDevice physicalDevice, VkPhysicalDeviceFeatures* pFeatures);
    /// ```
    public static void vkGetPhysicalDeviceFeatures(VkPhysicalDevice physicalDevice, MemorySegment pFeatures) {
        if (MemoryUtil.isNullPointer(physicalDevice.capabilities().PFN_vkGetPhysicalDeviceFeatures)) throw new SymbolNotFoundError("Symbol not found: vkGetPhysicalDeviceFeatures");
        try { Handles.MH_vkGetPhysicalDeviceFeatures.invokeExact(physicalDevice.capabilities().PFN_vkGetPhysicalDeviceFeatures, physicalDevice.segment(), pFeatures); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetPhysicalDeviceFeatures", e); }
    }

    /// ```
    /// void vkGetPhysicalDeviceFormatProperties((struct VkPhysicalDevice*) VkPhysicalDevice physicalDevice, (int) VkFormat format, VkFormatProperties* pFormatProperties);
    /// ```
    public static void vkGetPhysicalDeviceFormatProperties(VkPhysicalDevice physicalDevice, int format, MemorySegment pFormatProperties) {
        if (MemoryUtil.isNullPointer(physicalDevice.capabilities().PFN_vkGetPhysicalDeviceFormatProperties)) throw new SymbolNotFoundError("Symbol not found: vkGetPhysicalDeviceFormatProperties");
        try { Handles.MH_vkGetPhysicalDeviceFormatProperties.invokeExact(physicalDevice.capabilities().PFN_vkGetPhysicalDeviceFormatProperties, physicalDevice.segment(), format, pFormatProperties); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetPhysicalDeviceFormatProperties", e); }
    }

    /// ```
    /// (int) VkResult vkGetPhysicalDeviceImageFormatProperties((struct VkPhysicalDevice*) VkPhysicalDevice physicalDevice, (int) VkFormat format, (int) VkImageType type, (int) VkImageTiling tiling, ((uint32_t) VkFlags) VkImageUsageFlags usage, ((uint32_t) VkFlags) VkImageCreateFlags flags, VkImageFormatProperties* pImageFormatProperties);
    /// ```
    public static int vkGetPhysicalDeviceImageFormatProperties(VkPhysicalDevice physicalDevice, int format, int type, int tiling, int usage, int flags, MemorySegment pImageFormatProperties) {
        if (MemoryUtil.isNullPointer(physicalDevice.capabilities().PFN_vkGetPhysicalDeviceImageFormatProperties)) throw new SymbolNotFoundError("Symbol not found: vkGetPhysicalDeviceImageFormatProperties");
        try { return (int) Handles.MH_vkGetPhysicalDeviceImageFormatProperties.invokeExact(physicalDevice.capabilities().PFN_vkGetPhysicalDeviceImageFormatProperties, physicalDevice.segment(), format, type, tiling, usage, flags, pImageFormatProperties); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetPhysicalDeviceImageFormatProperties", e); }
    }

    /// ```
    /// void vkGetPhysicalDeviceProperties((struct VkPhysicalDevice*) VkPhysicalDevice physicalDevice, VkPhysicalDeviceProperties* pProperties);
    /// ```
    public static void vkGetPhysicalDeviceProperties(VkPhysicalDevice physicalDevice, MemorySegment pProperties) {
        if (MemoryUtil.isNullPointer(physicalDevice.capabilities().PFN_vkGetPhysicalDeviceProperties)) throw new SymbolNotFoundError("Symbol not found: vkGetPhysicalDeviceProperties");
        try { Handles.MH_vkGetPhysicalDeviceProperties.invokeExact(physicalDevice.capabilities().PFN_vkGetPhysicalDeviceProperties, physicalDevice.segment(), pProperties); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetPhysicalDeviceProperties", e); }
    }

    /// ```
    /// void vkGetPhysicalDeviceQueueFamilyProperties((struct VkPhysicalDevice*) VkPhysicalDevice physicalDevice, uint32_t* pQueueFamilyPropertyCount, VkQueueFamilyProperties* pQueueFamilyProperties);
    /// ```
    public static void vkGetPhysicalDeviceQueueFamilyProperties(VkPhysicalDevice physicalDevice, MemorySegment pQueueFamilyPropertyCount, MemorySegment pQueueFamilyProperties) {
        if (MemoryUtil.isNullPointer(physicalDevice.capabilities().PFN_vkGetPhysicalDeviceQueueFamilyProperties)) throw new SymbolNotFoundError("Symbol not found: vkGetPhysicalDeviceQueueFamilyProperties");
        try { Handles.MH_vkGetPhysicalDeviceQueueFamilyProperties.invokeExact(physicalDevice.capabilities().PFN_vkGetPhysicalDeviceQueueFamilyProperties, physicalDevice.segment(), pQueueFamilyPropertyCount, pQueueFamilyProperties); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetPhysicalDeviceQueueFamilyProperties", e); }
    }

    /// ```
    /// void vkGetPhysicalDeviceMemoryProperties((struct VkPhysicalDevice*) VkPhysicalDevice physicalDevice, VkPhysicalDeviceMemoryProperties* pMemoryProperties);
    /// ```
    public static void vkGetPhysicalDeviceMemoryProperties(VkPhysicalDevice physicalDevice, MemorySegment pMemoryProperties) {
        if (MemoryUtil.isNullPointer(physicalDevice.capabilities().PFN_vkGetPhysicalDeviceMemoryProperties)) throw new SymbolNotFoundError("Symbol not found: vkGetPhysicalDeviceMemoryProperties");
        try { Handles.MH_vkGetPhysicalDeviceMemoryProperties.invokeExact(physicalDevice.capabilities().PFN_vkGetPhysicalDeviceMemoryProperties, physicalDevice.segment(), pMemoryProperties); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetPhysicalDeviceMemoryProperties", e); }
    }

    /// ```
    /// (void (*VkVoidFunction)()) PFN_vkVoidFunction vkGetInstanceProcAddr((struct VkInstance*) VkInstance instance, const char* pName);
    /// ```
    public static MemorySegment vkGetInstanceProcAddr(VkInstance instance, MemorySegment pName) {
        if (MemoryUtil.isNullPointer(instance.capabilities().PFN_vkGetInstanceProcAddr)) throw new SymbolNotFoundError("Symbol not found: vkGetInstanceProcAddr");
        try { return (MemorySegment) Handles.MH_vkGetInstanceProcAddr.invokeExact(instance.capabilities().PFN_vkGetInstanceProcAddr, instance.segment(), pName); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetInstanceProcAddr", e); }
    }

    /// ```
    /// (void (*VkVoidFunction)()) PFN_vkVoidFunction vkGetDeviceProcAddr((struct VkDevice*) VkDevice device, const char* pName);
    /// ```
    public static MemorySegment vkGetDeviceProcAddr(VkDevice device, MemorySegment pName) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkGetDeviceProcAddr)) throw new SymbolNotFoundError("Symbol not found: vkGetDeviceProcAddr");
        try { return (MemorySegment) Handles.MH_vkGetDeviceProcAddr.invokeExact(device.capabilities().PFN_vkGetDeviceProcAddr, device.segment(), pName); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetDeviceProcAddr", e); }
    }

    /// ```
    /// (int) VkResult vkCreateDevice((struct VkPhysicalDevice*) VkPhysicalDevice physicalDevice, const VkDeviceCreateInfo* pCreateInfo, const VkAllocationCallbacks* pAllocator, VkDevice* pDevice);
    /// ```
    public static int vkCreateDevice(VkPhysicalDevice physicalDevice, MemorySegment pCreateInfo, MemorySegment pAllocator, MemorySegment pDevice) {
        if (MemoryUtil.isNullPointer(physicalDevice.capabilities().PFN_vkCreateDevice)) throw new SymbolNotFoundError("Symbol not found: vkCreateDevice");
        try { return (int) Handles.MH_vkCreateDevice.invokeExact(physicalDevice.capabilities().PFN_vkCreateDevice, physicalDevice.segment(), pCreateInfo, pAllocator, pDevice); }
        catch (Throwable e) { throw new RuntimeException("error in vkCreateDevice", e); }
    }

    /// ```
    /// void vkDestroyDevice((struct VkDevice*) VkDevice device, const VkAllocationCallbacks* pAllocator);
    /// ```
    public static void vkDestroyDevice(VkDevice device, MemorySegment pAllocator) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkDestroyDevice)) throw new SymbolNotFoundError("Symbol not found: vkDestroyDevice");
        try { Handles.MH_vkDestroyDevice.invokeExact(device.capabilities().PFN_vkDestroyDevice, device.segment(), pAllocator); }
        catch (Throwable e) { throw new RuntimeException("error in vkDestroyDevice", e); }
    }

    /// ```
    /// (int) VkResult vkEnumerateInstanceExtensionProperties(const char* pLayerName, uint32_t* pPropertyCount, VkExtensionProperties* pProperties);
    /// ```
    public static int vkEnumerateInstanceExtensionProperties(MemorySegment pLayerName, MemorySegment pPropertyCount, MemorySegment pProperties) {
        if (MemoryUtil.isNullPointer(VK.globalCommands().PFN_vkEnumerateInstanceExtensionProperties)) throw new SymbolNotFoundError("Symbol not found: vkEnumerateInstanceExtensionProperties");
        try { return (int) Handles.MH_vkEnumerateInstanceExtensionProperties.invokeExact(VK.globalCommands().PFN_vkEnumerateInstanceExtensionProperties, pLayerName, pPropertyCount, pProperties); }
        catch (Throwable e) { throw new RuntimeException("error in vkEnumerateInstanceExtensionProperties", e); }
    }

    /// ```
    /// (int) VkResult vkEnumerateDeviceExtensionProperties((struct VkPhysicalDevice*) VkPhysicalDevice physicalDevice, const char* pLayerName, uint32_t* pPropertyCount, VkExtensionProperties* pProperties);
    /// ```
    public static int vkEnumerateDeviceExtensionProperties(VkPhysicalDevice physicalDevice, MemorySegment pLayerName, MemorySegment pPropertyCount, MemorySegment pProperties) {
        if (MemoryUtil.isNullPointer(physicalDevice.capabilities().PFN_vkEnumerateDeviceExtensionProperties)) throw new SymbolNotFoundError("Symbol not found: vkEnumerateDeviceExtensionProperties");
        try { return (int) Handles.MH_vkEnumerateDeviceExtensionProperties.invokeExact(physicalDevice.capabilities().PFN_vkEnumerateDeviceExtensionProperties, physicalDevice.segment(), pLayerName, pPropertyCount, pProperties); }
        catch (Throwable e) { throw new RuntimeException("error in vkEnumerateDeviceExtensionProperties", e); }
    }

    /// ```
    /// (int) VkResult vkEnumerateInstanceLayerProperties(uint32_t* pPropertyCount, VkLayerProperties* pProperties);
    /// ```
    public static int vkEnumerateInstanceLayerProperties(MemorySegment pPropertyCount, MemorySegment pProperties) {
        if (MemoryUtil.isNullPointer(VK.globalCommands().PFN_vkEnumerateInstanceLayerProperties)) throw new SymbolNotFoundError("Symbol not found: vkEnumerateInstanceLayerProperties");
        try { return (int) Handles.MH_vkEnumerateInstanceLayerProperties.invokeExact(VK.globalCommands().PFN_vkEnumerateInstanceLayerProperties, pPropertyCount, pProperties); }
        catch (Throwable e) { throw new RuntimeException("error in vkEnumerateInstanceLayerProperties", e); }
    }

    /// ```
    /// (int) VkResult vkEnumerateDeviceLayerProperties((struct VkPhysicalDevice*) VkPhysicalDevice physicalDevice, uint32_t* pPropertyCount, VkLayerProperties* pProperties);
    /// ```
    public static int vkEnumerateDeviceLayerProperties(VkPhysicalDevice physicalDevice, MemorySegment pPropertyCount, MemorySegment pProperties) {
        if (MemoryUtil.isNullPointer(physicalDevice.capabilities().PFN_vkEnumerateDeviceLayerProperties)) throw new SymbolNotFoundError("Symbol not found: vkEnumerateDeviceLayerProperties");
        try { return (int) Handles.MH_vkEnumerateDeviceLayerProperties.invokeExact(physicalDevice.capabilities().PFN_vkEnumerateDeviceLayerProperties, physicalDevice.segment(), pPropertyCount, pProperties); }
        catch (Throwable e) { throw new RuntimeException("error in vkEnumerateDeviceLayerProperties", e); }
    }

    /// ```
    /// void vkGetDeviceQueue((struct VkDevice*) VkDevice device, uint32_t queueFamilyIndex, uint32_t queueIndex, VkQueue* pQueue);
    /// ```
    public static void vkGetDeviceQueue(VkDevice device, int queueFamilyIndex, int queueIndex, MemorySegment pQueue) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkGetDeviceQueue)) throw new SymbolNotFoundError("Symbol not found: vkGetDeviceQueue");
        try { Handles.MH_vkGetDeviceQueue.invokeExact(device.capabilities().PFN_vkGetDeviceQueue, device.segment(), queueFamilyIndex, queueIndex, pQueue); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetDeviceQueue", e); }
    }

    /// ```
    /// (int) VkResult vkQueueSubmit((struct VkQueue*) VkQueue queue, uint32_t submitCount, const VkSubmitInfo* pSubmits, (uint64_t) VkFence fence);
    /// ```
    public static int vkQueueSubmit(VkQueue queue, int submitCount, MemorySegment pSubmits, long fence) {
        if (MemoryUtil.isNullPointer(queue.capabilities().PFN_vkQueueSubmit)) throw new SymbolNotFoundError("Symbol not found: vkQueueSubmit");
        try { return (int) Handles.MH_vkQueueSubmit.invokeExact(queue.capabilities().PFN_vkQueueSubmit, queue.segment(), submitCount, pSubmits, fence); }
        catch (Throwable e) { throw new RuntimeException("error in vkQueueSubmit", e); }
    }

    /// ```
    /// (int) VkResult vkQueueWaitIdle((struct VkQueue*) VkQueue queue);
    /// ```
    public static int vkQueueWaitIdle(VkQueue queue) {
        if (MemoryUtil.isNullPointer(queue.capabilities().PFN_vkQueueWaitIdle)) throw new SymbolNotFoundError("Symbol not found: vkQueueWaitIdle");
        try { return (int) Handles.MH_vkQueueWaitIdle.invokeExact(queue.capabilities().PFN_vkQueueWaitIdle, queue.segment()); }
        catch (Throwable e) { throw new RuntimeException("error in vkQueueWaitIdle", e); }
    }

    /// ```
    /// (int) VkResult vkDeviceWaitIdle((struct VkDevice*) VkDevice device);
    /// ```
    public static int vkDeviceWaitIdle(VkDevice device) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkDeviceWaitIdle)) throw new SymbolNotFoundError("Symbol not found: vkDeviceWaitIdle");
        try { return (int) Handles.MH_vkDeviceWaitIdle.invokeExact(device.capabilities().PFN_vkDeviceWaitIdle, device.segment()); }
        catch (Throwable e) { throw new RuntimeException("error in vkDeviceWaitIdle", e); }
    }

    /// ```
    /// (int) VkResult vkAllocateMemory((struct VkDevice*) VkDevice device, const VkMemoryAllocateInfo* pAllocateInfo, const VkAllocationCallbacks* pAllocator, VkDeviceMemory* pMemory);
    /// ```
    public static int vkAllocateMemory(VkDevice device, MemorySegment pAllocateInfo, MemorySegment pAllocator, MemorySegment pMemory) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkAllocateMemory)) throw new SymbolNotFoundError("Symbol not found: vkAllocateMemory");
        try { return (int) Handles.MH_vkAllocateMemory.invokeExact(device.capabilities().PFN_vkAllocateMemory, device.segment(), pAllocateInfo, pAllocator, pMemory); }
        catch (Throwable e) { throw new RuntimeException("error in vkAllocateMemory", e); }
    }

    /// ```
    /// void vkFreeMemory((struct VkDevice*) VkDevice device, (uint64_t) VkDeviceMemory memory, const VkAllocationCallbacks* pAllocator);
    /// ```
    public static void vkFreeMemory(VkDevice device, long memory, MemorySegment pAllocator) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkFreeMemory)) throw new SymbolNotFoundError("Symbol not found: vkFreeMemory");
        try { Handles.MH_vkFreeMemory.invokeExact(device.capabilities().PFN_vkFreeMemory, device.segment(), memory, pAllocator); }
        catch (Throwable e) { throw new RuntimeException("error in vkFreeMemory", e); }
    }

    /// ```
    /// (int) VkResult vkMapMemory((struct VkDevice*) VkDevice device, (uint64_t) VkDeviceMemory memory, (uint64_t) VkDeviceSize offset, (uint64_t) VkDeviceSize size, ((uint32_t) VkFlags) VkMemoryMapFlags flags, void** ppData);
    /// ```
    public static int vkMapMemory(VkDevice device, long memory, long offset, long size, int flags, MemorySegment ppData) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkMapMemory)) throw new SymbolNotFoundError("Symbol not found: vkMapMemory");
        try { return (int) Handles.MH_vkMapMemory.invokeExact(device.capabilities().PFN_vkMapMemory, device.segment(), memory, offset, size, flags, ppData); }
        catch (Throwable e) { throw new RuntimeException("error in vkMapMemory", e); }
    }

    /// ```
    /// void vkUnmapMemory((struct VkDevice*) VkDevice device, (uint64_t) VkDeviceMemory memory);
    /// ```
    public static void vkUnmapMemory(VkDevice device, long memory) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkUnmapMemory)) throw new SymbolNotFoundError("Symbol not found: vkUnmapMemory");
        try { Handles.MH_vkUnmapMemory.invokeExact(device.capabilities().PFN_vkUnmapMemory, device.segment(), memory); }
        catch (Throwable e) { throw new RuntimeException("error in vkUnmapMemory", e); }
    }

    /// ```
    /// (int) VkResult vkFlushMappedMemoryRanges((struct VkDevice*) VkDevice device, uint32_t memoryRangeCount, const VkMappedMemoryRange* pMemoryRanges);
    /// ```
    public static int vkFlushMappedMemoryRanges(VkDevice device, int memoryRangeCount, MemorySegment pMemoryRanges) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkFlushMappedMemoryRanges)) throw new SymbolNotFoundError("Symbol not found: vkFlushMappedMemoryRanges");
        try { return (int) Handles.MH_vkFlushMappedMemoryRanges.invokeExact(device.capabilities().PFN_vkFlushMappedMemoryRanges, device.segment(), memoryRangeCount, pMemoryRanges); }
        catch (Throwable e) { throw new RuntimeException("error in vkFlushMappedMemoryRanges", e); }
    }

    /// ```
    /// (int) VkResult vkInvalidateMappedMemoryRanges((struct VkDevice*) VkDevice device, uint32_t memoryRangeCount, const VkMappedMemoryRange* pMemoryRanges);
    /// ```
    public static int vkInvalidateMappedMemoryRanges(VkDevice device, int memoryRangeCount, MemorySegment pMemoryRanges) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkInvalidateMappedMemoryRanges)) throw new SymbolNotFoundError("Symbol not found: vkInvalidateMappedMemoryRanges");
        try { return (int) Handles.MH_vkInvalidateMappedMemoryRanges.invokeExact(device.capabilities().PFN_vkInvalidateMappedMemoryRanges, device.segment(), memoryRangeCount, pMemoryRanges); }
        catch (Throwable e) { throw new RuntimeException("error in vkInvalidateMappedMemoryRanges", e); }
    }

    /// ```
    /// void vkGetDeviceMemoryCommitment((struct VkDevice*) VkDevice device, (uint64_t) VkDeviceMemory memory, VkDeviceSize* pCommittedMemoryInBytes);
    /// ```
    public static void vkGetDeviceMemoryCommitment(VkDevice device, long memory, MemorySegment pCommittedMemoryInBytes) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkGetDeviceMemoryCommitment)) throw new SymbolNotFoundError("Symbol not found: vkGetDeviceMemoryCommitment");
        try { Handles.MH_vkGetDeviceMemoryCommitment.invokeExact(device.capabilities().PFN_vkGetDeviceMemoryCommitment, device.segment(), memory, pCommittedMemoryInBytes); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetDeviceMemoryCommitment", e); }
    }

    /// ```
    /// (int) VkResult vkBindBufferMemory((struct VkDevice*) VkDevice device, (uint64_t) VkBuffer buffer, (uint64_t) VkDeviceMemory memory, (uint64_t) VkDeviceSize memoryOffset);
    /// ```
    public static int vkBindBufferMemory(VkDevice device, long buffer, long memory, long memoryOffset) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkBindBufferMemory)) throw new SymbolNotFoundError("Symbol not found: vkBindBufferMemory");
        try { return (int) Handles.MH_vkBindBufferMemory.invokeExact(device.capabilities().PFN_vkBindBufferMemory, device.segment(), buffer, memory, memoryOffset); }
        catch (Throwable e) { throw new RuntimeException("error in vkBindBufferMemory", e); }
    }

    /// ```
    /// (int) VkResult vkBindImageMemory((struct VkDevice*) VkDevice device, (uint64_t) VkImage image, (uint64_t) VkDeviceMemory memory, (uint64_t) VkDeviceSize memoryOffset);
    /// ```
    public static int vkBindImageMemory(VkDevice device, long image, long memory, long memoryOffset) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkBindImageMemory)) throw new SymbolNotFoundError("Symbol not found: vkBindImageMemory");
        try { return (int) Handles.MH_vkBindImageMemory.invokeExact(device.capabilities().PFN_vkBindImageMemory, device.segment(), image, memory, memoryOffset); }
        catch (Throwable e) { throw new RuntimeException("error in vkBindImageMemory", e); }
    }

    /// ```
    /// void vkGetBufferMemoryRequirements((struct VkDevice*) VkDevice device, (uint64_t) VkBuffer buffer, VkMemoryRequirements* pMemoryRequirements);
    /// ```
    public static void vkGetBufferMemoryRequirements(VkDevice device, long buffer, MemorySegment pMemoryRequirements) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkGetBufferMemoryRequirements)) throw new SymbolNotFoundError("Symbol not found: vkGetBufferMemoryRequirements");
        try { Handles.MH_vkGetBufferMemoryRequirements.invokeExact(device.capabilities().PFN_vkGetBufferMemoryRequirements, device.segment(), buffer, pMemoryRequirements); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetBufferMemoryRequirements", e); }
    }

    /// ```
    /// void vkGetImageMemoryRequirements((struct VkDevice*) VkDevice device, (uint64_t) VkImage image, VkMemoryRequirements* pMemoryRequirements);
    /// ```
    public static void vkGetImageMemoryRequirements(VkDevice device, long image, MemorySegment pMemoryRequirements) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkGetImageMemoryRequirements)) throw new SymbolNotFoundError("Symbol not found: vkGetImageMemoryRequirements");
        try { Handles.MH_vkGetImageMemoryRequirements.invokeExact(device.capabilities().PFN_vkGetImageMemoryRequirements, device.segment(), image, pMemoryRequirements); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetImageMemoryRequirements", e); }
    }

    /// ```
    /// void vkGetImageSparseMemoryRequirements((struct VkDevice*) VkDevice device, (uint64_t) VkImage image, uint32_t* pSparseMemoryRequirementCount, VkSparseImageMemoryRequirements* pSparseMemoryRequirements);
    /// ```
    public static void vkGetImageSparseMemoryRequirements(VkDevice device, long image, MemorySegment pSparseMemoryRequirementCount, MemorySegment pSparseMemoryRequirements) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkGetImageSparseMemoryRequirements)) throw new SymbolNotFoundError("Symbol not found: vkGetImageSparseMemoryRequirements");
        try { Handles.MH_vkGetImageSparseMemoryRequirements.invokeExact(device.capabilities().PFN_vkGetImageSparseMemoryRequirements, device.segment(), image, pSparseMemoryRequirementCount, pSparseMemoryRequirements); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetImageSparseMemoryRequirements", e); }
    }

    /// ```
    /// void vkGetPhysicalDeviceSparseImageFormatProperties((struct VkPhysicalDevice*) VkPhysicalDevice physicalDevice, (int) VkFormat format, (int) VkImageType type, (int) VkSampleCountFlagBits samples, ((uint32_t) VkFlags) VkImageUsageFlags usage, (int) VkImageTiling tiling, uint32_t* pPropertyCount, VkSparseImageFormatProperties* pProperties);
    /// ```
    public static void vkGetPhysicalDeviceSparseImageFormatProperties(VkPhysicalDevice physicalDevice, int format, int type, int samples, int usage, int tiling, MemorySegment pPropertyCount, MemorySegment pProperties) {
        if (MemoryUtil.isNullPointer(physicalDevice.capabilities().PFN_vkGetPhysicalDeviceSparseImageFormatProperties)) throw new SymbolNotFoundError("Symbol not found: vkGetPhysicalDeviceSparseImageFormatProperties");
        try { Handles.MH_vkGetPhysicalDeviceSparseImageFormatProperties.invokeExact(physicalDevice.capabilities().PFN_vkGetPhysicalDeviceSparseImageFormatProperties, physicalDevice.segment(), format, type, samples, usage, tiling, pPropertyCount, pProperties); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetPhysicalDeviceSparseImageFormatProperties", e); }
    }

    /// ```
    /// (int) VkResult vkQueueBindSparse((struct VkQueue*) VkQueue queue, uint32_t bindInfoCount, const VkBindSparseInfo* pBindInfo, (uint64_t) VkFence fence);
    /// ```
    public static int vkQueueBindSparse(VkQueue queue, int bindInfoCount, MemorySegment pBindInfo, long fence) {
        if (MemoryUtil.isNullPointer(queue.capabilities().PFN_vkQueueBindSparse)) throw new SymbolNotFoundError("Symbol not found: vkQueueBindSparse");
        try { return (int) Handles.MH_vkQueueBindSparse.invokeExact(queue.capabilities().PFN_vkQueueBindSparse, queue.segment(), bindInfoCount, pBindInfo, fence); }
        catch (Throwable e) { throw new RuntimeException("error in vkQueueBindSparse", e); }
    }

    /// ```
    /// (int) VkResult vkCreateFence((struct VkDevice*) VkDevice device, const VkFenceCreateInfo* pCreateInfo, const VkAllocationCallbacks* pAllocator, VkFence* pFence);
    /// ```
    public static int vkCreateFence(VkDevice device, MemorySegment pCreateInfo, MemorySegment pAllocator, MemorySegment pFence) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkCreateFence)) throw new SymbolNotFoundError("Symbol not found: vkCreateFence");
        try { return (int) Handles.MH_vkCreateFence.invokeExact(device.capabilities().PFN_vkCreateFence, device.segment(), pCreateInfo, pAllocator, pFence); }
        catch (Throwable e) { throw new RuntimeException("error in vkCreateFence", e); }
    }

    /// ```
    /// void vkDestroyFence((struct VkDevice*) VkDevice device, (uint64_t) VkFence fence, const VkAllocationCallbacks* pAllocator);
    /// ```
    public static void vkDestroyFence(VkDevice device, long fence, MemorySegment pAllocator) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkDestroyFence)) throw new SymbolNotFoundError("Symbol not found: vkDestroyFence");
        try { Handles.MH_vkDestroyFence.invokeExact(device.capabilities().PFN_vkDestroyFence, device.segment(), fence, pAllocator); }
        catch (Throwable e) { throw new RuntimeException("error in vkDestroyFence", e); }
    }

    /// ```
    /// (int) VkResult vkResetFences((struct VkDevice*) VkDevice device, uint32_t fenceCount, const VkFence* pFences);
    /// ```
    public static int vkResetFences(VkDevice device, int fenceCount, MemorySegment pFences) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkResetFences)) throw new SymbolNotFoundError("Symbol not found: vkResetFences");
        try { return (int) Handles.MH_vkResetFences.invokeExact(device.capabilities().PFN_vkResetFences, device.segment(), fenceCount, pFences); }
        catch (Throwable e) { throw new RuntimeException("error in vkResetFences", e); }
    }

    /// ```
    /// (int) VkResult vkGetFenceStatus((struct VkDevice*) VkDevice device, (uint64_t) VkFence fence);
    /// ```
    public static int vkGetFenceStatus(VkDevice device, long fence) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkGetFenceStatus)) throw new SymbolNotFoundError("Symbol not found: vkGetFenceStatus");
        try { return (int) Handles.MH_vkGetFenceStatus.invokeExact(device.capabilities().PFN_vkGetFenceStatus, device.segment(), fence); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetFenceStatus", e); }
    }

    /// ```
    /// (int) VkResult vkWaitForFences((struct VkDevice*) VkDevice device, uint32_t fenceCount, const VkFence* pFences, (uint32_t) VkBool32 waitAll, uint64_t timeout);
    /// ```
    public static int vkWaitForFences(VkDevice device, int fenceCount, MemorySegment pFences, int waitAll, long timeout) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkWaitForFences)) throw new SymbolNotFoundError("Symbol not found: vkWaitForFences");
        try { return (int) Handles.MH_vkWaitForFences.invokeExact(device.capabilities().PFN_vkWaitForFences, device.segment(), fenceCount, pFences, waitAll, timeout); }
        catch (Throwable e) { throw new RuntimeException("error in vkWaitForFences", e); }
    }

    /// ```
    /// (int) VkResult vkCreateSemaphore((struct VkDevice*) VkDevice device, const VkSemaphoreCreateInfo* pCreateInfo, const VkAllocationCallbacks* pAllocator, VkSemaphore* pSemaphore);
    /// ```
    public static int vkCreateSemaphore(VkDevice device, MemorySegment pCreateInfo, MemorySegment pAllocator, MemorySegment pSemaphore) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkCreateSemaphore)) throw new SymbolNotFoundError("Symbol not found: vkCreateSemaphore");
        try { return (int) Handles.MH_vkCreateSemaphore.invokeExact(device.capabilities().PFN_vkCreateSemaphore, device.segment(), pCreateInfo, pAllocator, pSemaphore); }
        catch (Throwable e) { throw new RuntimeException("error in vkCreateSemaphore", e); }
    }

    /// ```
    /// void vkDestroySemaphore((struct VkDevice*) VkDevice device, (uint64_t) VkSemaphore semaphore, const VkAllocationCallbacks* pAllocator);
    /// ```
    public static void vkDestroySemaphore(VkDevice device, long semaphore, MemorySegment pAllocator) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkDestroySemaphore)) throw new SymbolNotFoundError("Symbol not found: vkDestroySemaphore");
        try { Handles.MH_vkDestroySemaphore.invokeExact(device.capabilities().PFN_vkDestroySemaphore, device.segment(), semaphore, pAllocator); }
        catch (Throwable e) { throw new RuntimeException("error in vkDestroySemaphore", e); }
    }

    /// ```
    /// (int) VkResult vkCreateEvent((struct VkDevice*) VkDevice device, const VkEventCreateInfo* pCreateInfo, const VkAllocationCallbacks* pAllocator, VkEvent* pEvent);
    /// ```
    public static int vkCreateEvent(VkDevice device, MemorySegment pCreateInfo, MemorySegment pAllocator, MemorySegment pEvent) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkCreateEvent)) throw new SymbolNotFoundError("Symbol not found: vkCreateEvent");
        try { return (int) Handles.MH_vkCreateEvent.invokeExact(device.capabilities().PFN_vkCreateEvent, device.segment(), pCreateInfo, pAllocator, pEvent); }
        catch (Throwable e) { throw new RuntimeException("error in vkCreateEvent", e); }
    }

    /// ```
    /// void vkDestroyEvent((struct VkDevice*) VkDevice device, (uint64_t) VkEvent event, const VkAllocationCallbacks* pAllocator);
    /// ```
    public static void vkDestroyEvent(VkDevice device, long event, MemorySegment pAllocator) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkDestroyEvent)) throw new SymbolNotFoundError("Symbol not found: vkDestroyEvent");
        try { Handles.MH_vkDestroyEvent.invokeExact(device.capabilities().PFN_vkDestroyEvent, device.segment(), event, pAllocator); }
        catch (Throwable e) { throw new RuntimeException("error in vkDestroyEvent", e); }
    }

    /// ```
    /// (int) VkResult vkGetEventStatus((struct VkDevice*) VkDevice device, (uint64_t) VkEvent event);
    /// ```
    public static int vkGetEventStatus(VkDevice device, long event) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkGetEventStatus)) throw new SymbolNotFoundError("Symbol not found: vkGetEventStatus");
        try { return (int) Handles.MH_vkGetEventStatus.invokeExact(device.capabilities().PFN_vkGetEventStatus, device.segment(), event); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetEventStatus", e); }
    }

    /// ```
    /// (int) VkResult vkSetEvent((struct VkDevice*) VkDevice device, (uint64_t) VkEvent event);
    /// ```
    public static int vkSetEvent(VkDevice device, long event) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkSetEvent)) throw new SymbolNotFoundError("Symbol not found: vkSetEvent");
        try { return (int) Handles.MH_vkSetEvent.invokeExact(device.capabilities().PFN_vkSetEvent, device.segment(), event); }
        catch (Throwable e) { throw new RuntimeException("error in vkSetEvent", e); }
    }

    /// ```
    /// (int) VkResult vkResetEvent((struct VkDevice*) VkDevice device, (uint64_t) VkEvent event);
    /// ```
    public static int vkResetEvent(VkDevice device, long event) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkResetEvent)) throw new SymbolNotFoundError("Symbol not found: vkResetEvent");
        try { return (int) Handles.MH_vkResetEvent.invokeExact(device.capabilities().PFN_vkResetEvent, device.segment(), event); }
        catch (Throwable e) { throw new RuntimeException("error in vkResetEvent", e); }
    }

    /// ```
    /// (int) VkResult vkCreateQueryPool((struct VkDevice*) VkDevice device, const VkQueryPoolCreateInfo* pCreateInfo, const VkAllocationCallbacks* pAllocator, VkQueryPool* pQueryPool);
    /// ```
    public static int vkCreateQueryPool(VkDevice device, MemorySegment pCreateInfo, MemorySegment pAllocator, MemorySegment pQueryPool) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkCreateQueryPool)) throw new SymbolNotFoundError("Symbol not found: vkCreateQueryPool");
        try { return (int) Handles.MH_vkCreateQueryPool.invokeExact(device.capabilities().PFN_vkCreateQueryPool, device.segment(), pCreateInfo, pAllocator, pQueryPool); }
        catch (Throwable e) { throw new RuntimeException("error in vkCreateQueryPool", e); }
    }

    /// ```
    /// void vkDestroyQueryPool((struct VkDevice*) VkDevice device, (uint64_t) VkQueryPool queryPool, const VkAllocationCallbacks* pAllocator);
    /// ```
    public static void vkDestroyQueryPool(VkDevice device, long queryPool, MemorySegment pAllocator) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkDestroyQueryPool)) throw new SymbolNotFoundError("Symbol not found: vkDestroyQueryPool");
        try { Handles.MH_vkDestroyQueryPool.invokeExact(device.capabilities().PFN_vkDestroyQueryPool, device.segment(), queryPool, pAllocator); }
        catch (Throwable e) { throw new RuntimeException("error in vkDestroyQueryPool", e); }
    }

    /// ```
    /// (int) VkResult vkGetQueryPoolResults((struct VkDevice*) VkDevice device, (uint64_t) VkQueryPool queryPool, uint32_t firstQuery, uint32_t queryCount, size_t dataSize, void* pData, (uint64_t) VkDeviceSize stride, ((uint32_t) VkFlags) VkQueryResultFlags flags);
    /// ```
    public static int vkGetQueryPoolResults(VkDevice device, long queryPool, int firstQuery, int queryCount, long dataSize, MemorySegment pData, long stride, int flags) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkGetQueryPoolResults)) throw new SymbolNotFoundError("Symbol not found: vkGetQueryPoolResults");
        try { return (int) Handles.MH_vkGetQueryPoolResults.invoke(device.capabilities().PFN_vkGetQueryPoolResults, device.segment(), queryPool, firstQuery, queryCount, MemoryUtil.narrowingLong(CanonicalTypes.SIZE_T, dataSize), pData, stride, flags); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetQueryPoolResults", e); }
    }

    /// ```
    /// (int) VkResult vkCreateBuffer((struct VkDevice*) VkDevice device, const VkBufferCreateInfo* pCreateInfo, const VkAllocationCallbacks* pAllocator, VkBuffer* pBuffer);
    /// ```
    public static int vkCreateBuffer(VkDevice device, MemorySegment pCreateInfo, MemorySegment pAllocator, MemorySegment pBuffer) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkCreateBuffer)) throw new SymbolNotFoundError("Symbol not found: vkCreateBuffer");
        try { return (int) Handles.MH_vkCreateBuffer.invokeExact(device.capabilities().PFN_vkCreateBuffer, device.segment(), pCreateInfo, pAllocator, pBuffer); }
        catch (Throwable e) { throw new RuntimeException("error in vkCreateBuffer", e); }
    }

    /// ```
    /// void vkDestroyBuffer((struct VkDevice*) VkDevice device, (uint64_t) VkBuffer buffer, const VkAllocationCallbacks* pAllocator);
    /// ```
    public static void vkDestroyBuffer(VkDevice device, long buffer, MemorySegment pAllocator) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkDestroyBuffer)) throw new SymbolNotFoundError("Symbol not found: vkDestroyBuffer");
        try { Handles.MH_vkDestroyBuffer.invokeExact(device.capabilities().PFN_vkDestroyBuffer, device.segment(), buffer, pAllocator); }
        catch (Throwable e) { throw new RuntimeException("error in vkDestroyBuffer", e); }
    }

    /// ```
    /// (int) VkResult vkCreateBufferView((struct VkDevice*) VkDevice device, const VkBufferViewCreateInfo* pCreateInfo, const VkAllocationCallbacks* pAllocator, VkBufferView* pView);
    /// ```
    public static int vkCreateBufferView(VkDevice device, MemorySegment pCreateInfo, MemorySegment pAllocator, MemorySegment pView) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkCreateBufferView)) throw new SymbolNotFoundError("Symbol not found: vkCreateBufferView");
        try { return (int) Handles.MH_vkCreateBufferView.invokeExact(device.capabilities().PFN_vkCreateBufferView, device.segment(), pCreateInfo, pAllocator, pView); }
        catch (Throwable e) { throw new RuntimeException("error in vkCreateBufferView", e); }
    }

    /// ```
    /// void vkDestroyBufferView((struct VkDevice*) VkDevice device, (uint64_t) VkBufferView bufferView, const VkAllocationCallbacks* pAllocator);
    /// ```
    public static void vkDestroyBufferView(VkDevice device, long bufferView, MemorySegment pAllocator) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkDestroyBufferView)) throw new SymbolNotFoundError("Symbol not found: vkDestroyBufferView");
        try { Handles.MH_vkDestroyBufferView.invokeExact(device.capabilities().PFN_vkDestroyBufferView, device.segment(), bufferView, pAllocator); }
        catch (Throwable e) { throw new RuntimeException("error in vkDestroyBufferView", e); }
    }

    /// ```
    /// (int) VkResult vkCreateImage((struct VkDevice*) VkDevice device, const VkImageCreateInfo* pCreateInfo, const VkAllocationCallbacks* pAllocator, VkImage* pImage);
    /// ```
    public static int vkCreateImage(VkDevice device, MemorySegment pCreateInfo, MemorySegment pAllocator, MemorySegment pImage) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkCreateImage)) throw new SymbolNotFoundError("Symbol not found: vkCreateImage");
        try { return (int) Handles.MH_vkCreateImage.invokeExact(device.capabilities().PFN_vkCreateImage, device.segment(), pCreateInfo, pAllocator, pImage); }
        catch (Throwable e) { throw new RuntimeException("error in vkCreateImage", e); }
    }

    /// ```
    /// void vkDestroyImage((struct VkDevice*) VkDevice device, (uint64_t) VkImage image, const VkAllocationCallbacks* pAllocator);
    /// ```
    public static void vkDestroyImage(VkDevice device, long image, MemorySegment pAllocator) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkDestroyImage)) throw new SymbolNotFoundError("Symbol not found: vkDestroyImage");
        try { Handles.MH_vkDestroyImage.invokeExact(device.capabilities().PFN_vkDestroyImage, device.segment(), image, pAllocator); }
        catch (Throwable e) { throw new RuntimeException("error in vkDestroyImage", e); }
    }

    /// ```
    /// void vkGetImageSubresourceLayout((struct VkDevice*) VkDevice device, (uint64_t) VkImage image, const VkImageSubresource* pSubresource, VkSubresourceLayout* pLayout);
    /// ```
    public static void vkGetImageSubresourceLayout(VkDevice device, long image, MemorySegment pSubresource, MemorySegment pLayout) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkGetImageSubresourceLayout)) throw new SymbolNotFoundError("Symbol not found: vkGetImageSubresourceLayout");
        try { Handles.MH_vkGetImageSubresourceLayout.invokeExact(device.capabilities().PFN_vkGetImageSubresourceLayout, device.segment(), image, pSubresource, pLayout); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetImageSubresourceLayout", e); }
    }

    /// ```
    /// (int) VkResult vkCreateImageView((struct VkDevice*) VkDevice device, const VkImageViewCreateInfo* pCreateInfo, const VkAllocationCallbacks* pAllocator, VkImageView* pView);
    /// ```
    public static int vkCreateImageView(VkDevice device, MemorySegment pCreateInfo, MemorySegment pAllocator, MemorySegment pView) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkCreateImageView)) throw new SymbolNotFoundError("Symbol not found: vkCreateImageView");
        try { return (int) Handles.MH_vkCreateImageView.invokeExact(device.capabilities().PFN_vkCreateImageView, device.segment(), pCreateInfo, pAllocator, pView); }
        catch (Throwable e) { throw new RuntimeException("error in vkCreateImageView", e); }
    }

    /// ```
    /// void vkDestroyImageView((struct VkDevice*) VkDevice device, (uint64_t) VkImageView imageView, const VkAllocationCallbacks* pAllocator);
    /// ```
    public static void vkDestroyImageView(VkDevice device, long imageView, MemorySegment pAllocator) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkDestroyImageView)) throw new SymbolNotFoundError("Symbol not found: vkDestroyImageView");
        try { Handles.MH_vkDestroyImageView.invokeExact(device.capabilities().PFN_vkDestroyImageView, device.segment(), imageView, pAllocator); }
        catch (Throwable e) { throw new RuntimeException("error in vkDestroyImageView", e); }
    }

    /// ```
    /// (int) VkResult vkCreateShaderModule((struct VkDevice*) VkDevice device, const VkShaderModuleCreateInfo* pCreateInfo, const VkAllocationCallbacks* pAllocator, VkShaderModule* pShaderModule);
    /// ```
    public static int vkCreateShaderModule(VkDevice device, MemorySegment pCreateInfo, MemorySegment pAllocator, MemorySegment pShaderModule) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkCreateShaderModule)) throw new SymbolNotFoundError("Symbol not found: vkCreateShaderModule");
        try { return (int) Handles.MH_vkCreateShaderModule.invokeExact(device.capabilities().PFN_vkCreateShaderModule, device.segment(), pCreateInfo, pAllocator, pShaderModule); }
        catch (Throwable e) { throw new RuntimeException("error in vkCreateShaderModule", e); }
    }

    /// ```
    /// void vkDestroyShaderModule((struct VkDevice*) VkDevice device, (uint64_t) VkShaderModule shaderModule, const VkAllocationCallbacks* pAllocator);
    /// ```
    public static void vkDestroyShaderModule(VkDevice device, long shaderModule, MemorySegment pAllocator) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkDestroyShaderModule)) throw new SymbolNotFoundError("Symbol not found: vkDestroyShaderModule");
        try { Handles.MH_vkDestroyShaderModule.invokeExact(device.capabilities().PFN_vkDestroyShaderModule, device.segment(), shaderModule, pAllocator); }
        catch (Throwable e) { throw new RuntimeException("error in vkDestroyShaderModule", e); }
    }

    /// ```
    /// (int) VkResult vkCreatePipelineCache((struct VkDevice*) VkDevice device, const VkPipelineCacheCreateInfo* pCreateInfo, const VkAllocationCallbacks* pAllocator, VkPipelineCache* pPipelineCache);
    /// ```
    public static int vkCreatePipelineCache(VkDevice device, MemorySegment pCreateInfo, MemorySegment pAllocator, MemorySegment pPipelineCache) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkCreatePipelineCache)) throw new SymbolNotFoundError("Symbol not found: vkCreatePipelineCache");
        try { return (int) Handles.MH_vkCreatePipelineCache.invokeExact(device.capabilities().PFN_vkCreatePipelineCache, device.segment(), pCreateInfo, pAllocator, pPipelineCache); }
        catch (Throwable e) { throw new RuntimeException("error in vkCreatePipelineCache", e); }
    }

    /// ```
    /// void vkDestroyPipelineCache((struct VkDevice*) VkDevice device, (uint64_t) VkPipelineCache pipelineCache, const VkAllocationCallbacks* pAllocator);
    /// ```
    public static void vkDestroyPipelineCache(VkDevice device, long pipelineCache, MemorySegment pAllocator) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkDestroyPipelineCache)) throw new SymbolNotFoundError("Symbol not found: vkDestroyPipelineCache");
        try { Handles.MH_vkDestroyPipelineCache.invokeExact(device.capabilities().PFN_vkDestroyPipelineCache, device.segment(), pipelineCache, pAllocator); }
        catch (Throwable e) { throw new RuntimeException("error in vkDestroyPipelineCache", e); }
    }

    /// ```
    /// (int) VkResult vkGetPipelineCacheData((struct VkDevice*) VkDevice device, (uint64_t) VkPipelineCache pipelineCache, size_t* pDataSize, void* pData);
    /// ```
    public static int vkGetPipelineCacheData(VkDevice device, long pipelineCache, MemorySegment pDataSize, MemorySegment pData) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkGetPipelineCacheData)) throw new SymbolNotFoundError("Symbol not found: vkGetPipelineCacheData");
        try { return (int) Handles.MH_vkGetPipelineCacheData.invokeExact(device.capabilities().PFN_vkGetPipelineCacheData, device.segment(), pipelineCache, pDataSize, pData); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetPipelineCacheData", e); }
    }

    /// ```
    /// (int) VkResult vkMergePipelineCaches((struct VkDevice*) VkDevice device, (uint64_t) VkPipelineCache dstCache, uint32_t srcCacheCount, const VkPipelineCache* pSrcCaches);
    /// ```
    public static int vkMergePipelineCaches(VkDevice device, long dstCache, int srcCacheCount, MemorySegment pSrcCaches) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkMergePipelineCaches)) throw new SymbolNotFoundError("Symbol not found: vkMergePipelineCaches");
        try { return (int) Handles.MH_vkMergePipelineCaches.invokeExact(device.capabilities().PFN_vkMergePipelineCaches, device.segment(), dstCache, srcCacheCount, pSrcCaches); }
        catch (Throwable e) { throw new RuntimeException("error in vkMergePipelineCaches", e); }
    }

    /// ```
    /// (int) VkResult vkCreateGraphicsPipelines((struct VkDevice*) VkDevice device, (uint64_t) VkPipelineCache pipelineCache, uint32_t createInfoCount, const VkGraphicsPipelineCreateInfo* pCreateInfos, const VkAllocationCallbacks* pAllocator, VkPipeline* pPipelines);
    /// ```
    public static int vkCreateGraphicsPipelines(VkDevice device, long pipelineCache, int createInfoCount, MemorySegment pCreateInfos, MemorySegment pAllocator, MemorySegment pPipelines) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkCreateGraphicsPipelines)) throw new SymbolNotFoundError("Symbol not found: vkCreateGraphicsPipelines");
        try { return (int) Handles.MH_vkCreateGraphicsPipelines.invokeExact(device.capabilities().PFN_vkCreateGraphicsPipelines, device.segment(), pipelineCache, createInfoCount, pCreateInfos, pAllocator, pPipelines); }
        catch (Throwable e) { throw new RuntimeException("error in vkCreateGraphicsPipelines", e); }
    }

    /// ```
    /// (int) VkResult vkCreateComputePipelines((struct VkDevice*) VkDevice device, (uint64_t) VkPipelineCache pipelineCache, uint32_t createInfoCount, const VkComputePipelineCreateInfo* pCreateInfos, const VkAllocationCallbacks* pAllocator, VkPipeline* pPipelines);
    /// ```
    public static int vkCreateComputePipelines(VkDevice device, long pipelineCache, int createInfoCount, MemorySegment pCreateInfos, MemorySegment pAllocator, MemorySegment pPipelines) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkCreateComputePipelines)) throw new SymbolNotFoundError("Symbol not found: vkCreateComputePipelines");
        try { return (int) Handles.MH_vkCreateComputePipelines.invokeExact(device.capabilities().PFN_vkCreateComputePipelines, device.segment(), pipelineCache, createInfoCount, pCreateInfos, pAllocator, pPipelines); }
        catch (Throwable e) { throw new RuntimeException("error in vkCreateComputePipelines", e); }
    }

    /// ```
    /// void vkDestroyPipeline((struct VkDevice*) VkDevice device, (uint64_t) VkPipeline pipeline, const VkAllocationCallbacks* pAllocator);
    /// ```
    public static void vkDestroyPipeline(VkDevice device, long pipeline, MemorySegment pAllocator) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkDestroyPipeline)) throw new SymbolNotFoundError("Symbol not found: vkDestroyPipeline");
        try { Handles.MH_vkDestroyPipeline.invokeExact(device.capabilities().PFN_vkDestroyPipeline, device.segment(), pipeline, pAllocator); }
        catch (Throwable e) { throw new RuntimeException("error in vkDestroyPipeline", e); }
    }

    /// ```
    /// (int) VkResult vkCreatePipelineLayout((struct VkDevice*) VkDevice device, const VkPipelineLayoutCreateInfo* pCreateInfo, const VkAllocationCallbacks* pAllocator, VkPipelineLayout* pPipelineLayout);
    /// ```
    public static int vkCreatePipelineLayout(VkDevice device, MemorySegment pCreateInfo, MemorySegment pAllocator, MemorySegment pPipelineLayout) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkCreatePipelineLayout)) throw new SymbolNotFoundError("Symbol not found: vkCreatePipelineLayout");
        try { return (int) Handles.MH_vkCreatePipelineLayout.invokeExact(device.capabilities().PFN_vkCreatePipelineLayout, device.segment(), pCreateInfo, pAllocator, pPipelineLayout); }
        catch (Throwable e) { throw new RuntimeException("error in vkCreatePipelineLayout", e); }
    }

    /// ```
    /// void vkDestroyPipelineLayout((struct VkDevice*) VkDevice device, (uint64_t) VkPipelineLayout pipelineLayout, const VkAllocationCallbacks* pAllocator);
    /// ```
    public static void vkDestroyPipelineLayout(VkDevice device, long pipelineLayout, MemorySegment pAllocator) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkDestroyPipelineLayout)) throw new SymbolNotFoundError("Symbol not found: vkDestroyPipelineLayout");
        try { Handles.MH_vkDestroyPipelineLayout.invokeExact(device.capabilities().PFN_vkDestroyPipelineLayout, device.segment(), pipelineLayout, pAllocator); }
        catch (Throwable e) { throw new RuntimeException("error in vkDestroyPipelineLayout", e); }
    }

    /// ```
    /// (int) VkResult vkCreateSampler((struct VkDevice*) VkDevice device, const VkSamplerCreateInfo* pCreateInfo, const VkAllocationCallbacks* pAllocator, VkSampler* pSampler);
    /// ```
    public static int vkCreateSampler(VkDevice device, MemorySegment pCreateInfo, MemorySegment pAllocator, MemorySegment pSampler) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkCreateSampler)) throw new SymbolNotFoundError("Symbol not found: vkCreateSampler");
        try { return (int) Handles.MH_vkCreateSampler.invokeExact(device.capabilities().PFN_vkCreateSampler, device.segment(), pCreateInfo, pAllocator, pSampler); }
        catch (Throwable e) { throw new RuntimeException("error in vkCreateSampler", e); }
    }

    /// ```
    /// void vkDestroySampler((struct VkDevice*) VkDevice device, (uint64_t) VkSampler sampler, const VkAllocationCallbacks* pAllocator);
    /// ```
    public static void vkDestroySampler(VkDevice device, long sampler, MemorySegment pAllocator) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkDestroySampler)) throw new SymbolNotFoundError("Symbol not found: vkDestroySampler");
        try { Handles.MH_vkDestroySampler.invokeExact(device.capabilities().PFN_vkDestroySampler, device.segment(), sampler, pAllocator); }
        catch (Throwable e) { throw new RuntimeException("error in vkDestroySampler", e); }
    }

    /// ```
    /// (int) VkResult vkCreateDescriptorSetLayout((struct VkDevice*) VkDevice device, const VkDescriptorSetLayoutCreateInfo* pCreateInfo, const VkAllocationCallbacks* pAllocator, VkDescriptorSetLayout* pSetLayout);
    /// ```
    public static int vkCreateDescriptorSetLayout(VkDevice device, MemorySegment pCreateInfo, MemorySegment pAllocator, MemorySegment pSetLayout) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkCreateDescriptorSetLayout)) throw new SymbolNotFoundError("Symbol not found: vkCreateDescriptorSetLayout");
        try { return (int) Handles.MH_vkCreateDescriptorSetLayout.invokeExact(device.capabilities().PFN_vkCreateDescriptorSetLayout, device.segment(), pCreateInfo, pAllocator, pSetLayout); }
        catch (Throwable e) { throw new RuntimeException("error in vkCreateDescriptorSetLayout", e); }
    }

    /// ```
    /// void vkDestroyDescriptorSetLayout((struct VkDevice*) VkDevice device, (uint64_t) VkDescriptorSetLayout descriptorSetLayout, const VkAllocationCallbacks* pAllocator);
    /// ```
    public static void vkDestroyDescriptorSetLayout(VkDevice device, long descriptorSetLayout, MemorySegment pAllocator) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkDestroyDescriptorSetLayout)) throw new SymbolNotFoundError("Symbol not found: vkDestroyDescriptorSetLayout");
        try { Handles.MH_vkDestroyDescriptorSetLayout.invokeExact(device.capabilities().PFN_vkDestroyDescriptorSetLayout, device.segment(), descriptorSetLayout, pAllocator); }
        catch (Throwable e) { throw new RuntimeException("error in vkDestroyDescriptorSetLayout", e); }
    }

    /// ```
    /// (int) VkResult vkCreateDescriptorPool((struct VkDevice*) VkDevice device, const VkDescriptorPoolCreateInfo* pCreateInfo, const VkAllocationCallbacks* pAllocator, VkDescriptorPool* pDescriptorPool);
    /// ```
    public static int vkCreateDescriptorPool(VkDevice device, MemorySegment pCreateInfo, MemorySegment pAllocator, MemorySegment pDescriptorPool) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkCreateDescriptorPool)) throw new SymbolNotFoundError("Symbol not found: vkCreateDescriptorPool");
        try { return (int) Handles.MH_vkCreateDescriptorPool.invokeExact(device.capabilities().PFN_vkCreateDescriptorPool, device.segment(), pCreateInfo, pAllocator, pDescriptorPool); }
        catch (Throwable e) { throw new RuntimeException("error in vkCreateDescriptorPool", e); }
    }

    /// ```
    /// void vkDestroyDescriptorPool((struct VkDevice*) VkDevice device, (uint64_t) VkDescriptorPool descriptorPool, const VkAllocationCallbacks* pAllocator);
    /// ```
    public static void vkDestroyDescriptorPool(VkDevice device, long descriptorPool, MemorySegment pAllocator) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkDestroyDescriptorPool)) throw new SymbolNotFoundError("Symbol not found: vkDestroyDescriptorPool");
        try { Handles.MH_vkDestroyDescriptorPool.invokeExact(device.capabilities().PFN_vkDestroyDescriptorPool, device.segment(), descriptorPool, pAllocator); }
        catch (Throwable e) { throw new RuntimeException("error in vkDestroyDescriptorPool", e); }
    }

    /// ```
    /// (int) VkResult vkResetDescriptorPool((struct VkDevice*) VkDevice device, (uint64_t) VkDescriptorPool descriptorPool, ((uint32_t) VkFlags) VkDescriptorPoolResetFlags flags);
    /// ```
    public static int vkResetDescriptorPool(VkDevice device, long descriptorPool, int flags) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkResetDescriptorPool)) throw new SymbolNotFoundError("Symbol not found: vkResetDescriptorPool");
        try { return (int) Handles.MH_vkResetDescriptorPool.invokeExact(device.capabilities().PFN_vkResetDescriptorPool, device.segment(), descriptorPool, flags); }
        catch (Throwable e) { throw new RuntimeException("error in vkResetDescriptorPool", e); }
    }

    /// ```
    /// (int) VkResult vkAllocateDescriptorSets((struct VkDevice*) VkDevice device, const VkDescriptorSetAllocateInfo* pAllocateInfo, VkDescriptorSet* pDescriptorSets);
    /// ```
    public static int vkAllocateDescriptorSets(VkDevice device, MemorySegment pAllocateInfo, MemorySegment pDescriptorSets) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkAllocateDescriptorSets)) throw new SymbolNotFoundError("Symbol not found: vkAllocateDescriptorSets");
        try { return (int) Handles.MH_vkAllocateDescriptorSets.invokeExact(device.capabilities().PFN_vkAllocateDescriptorSets, device.segment(), pAllocateInfo, pDescriptorSets); }
        catch (Throwable e) { throw new RuntimeException("error in vkAllocateDescriptorSets", e); }
    }

    /// ```
    /// (int) VkResult vkFreeDescriptorSets((struct VkDevice*) VkDevice device, (uint64_t) VkDescriptorPool descriptorPool, uint32_t descriptorSetCount, const VkDescriptorSet* pDescriptorSets);
    /// ```
    public static int vkFreeDescriptorSets(VkDevice device, long descriptorPool, int descriptorSetCount, MemorySegment pDescriptorSets) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkFreeDescriptorSets)) throw new SymbolNotFoundError("Symbol not found: vkFreeDescriptorSets");
        try { return (int) Handles.MH_vkFreeDescriptorSets.invokeExact(device.capabilities().PFN_vkFreeDescriptorSets, device.segment(), descriptorPool, descriptorSetCount, pDescriptorSets); }
        catch (Throwable e) { throw new RuntimeException("error in vkFreeDescriptorSets", e); }
    }

    /// ```
    /// void vkUpdateDescriptorSets((struct VkDevice*) VkDevice device, uint32_t descriptorWriteCount, const VkWriteDescriptorSet* pDescriptorWrites, uint32_t descriptorCopyCount, const VkCopyDescriptorSet* pDescriptorCopies);
    /// ```
    public static void vkUpdateDescriptorSets(VkDevice device, int descriptorWriteCount, MemorySegment pDescriptorWrites, int descriptorCopyCount, MemorySegment pDescriptorCopies) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkUpdateDescriptorSets)) throw new SymbolNotFoundError("Symbol not found: vkUpdateDescriptorSets");
        try { Handles.MH_vkUpdateDescriptorSets.invokeExact(device.capabilities().PFN_vkUpdateDescriptorSets, device.segment(), descriptorWriteCount, pDescriptorWrites, descriptorCopyCount, pDescriptorCopies); }
        catch (Throwable e) { throw new RuntimeException("error in vkUpdateDescriptorSets", e); }
    }

    /// ```
    /// (int) VkResult vkCreateFramebuffer((struct VkDevice*) VkDevice device, const VkFramebufferCreateInfo* pCreateInfo, const VkAllocationCallbacks* pAllocator, VkFramebuffer* pFramebuffer);
    /// ```
    public static int vkCreateFramebuffer(VkDevice device, MemorySegment pCreateInfo, MemorySegment pAllocator, MemorySegment pFramebuffer) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkCreateFramebuffer)) throw new SymbolNotFoundError("Symbol not found: vkCreateFramebuffer");
        try { return (int) Handles.MH_vkCreateFramebuffer.invokeExact(device.capabilities().PFN_vkCreateFramebuffer, device.segment(), pCreateInfo, pAllocator, pFramebuffer); }
        catch (Throwable e) { throw new RuntimeException("error in vkCreateFramebuffer", e); }
    }

    /// ```
    /// void vkDestroyFramebuffer((struct VkDevice*) VkDevice device, (uint64_t) VkFramebuffer framebuffer, const VkAllocationCallbacks* pAllocator);
    /// ```
    public static void vkDestroyFramebuffer(VkDevice device, long framebuffer, MemorySegment pAllocator) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkDestroyFramebuffer)) throw new SymbolNotFoundError("Symbol not found: vkDestroyFramebuffer");
        try { Handles.MH_vkDestroyFramebuffer.invokeExact(device.capabilities().PFN_vkDestroyFramebuffer, device.segment(), framebuffer, pAllocator); }
        catch (Throwable e) { throw new RuntimeException("error in vkDestroyFramebuffer", e); }
    }

    /// ```
    /// (int) VkResult vkCreateRenderPass((struct VkDevice*) VkDevice device, const VkRenderPassCreateInfo* pCreateInfo, const VkAllocationCallbacks* pAllocator, VkRenderPass* pRenderPass);
    /// ```
    public static int vkCreateRenderPass(VkDevice device, MemorySegment pCreateInfo, MemorySegment pAllocator, MemorySegment pRenderPass) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkCreateRenderPass)) throw new SymbolNotFoundError("Symbol not found: vkCreateRenderPass");
        try { return (int) Handles.MH_vkCreateRenderPass.invokeExact(device.capabilities().PFN_vkCreateRenderPass, device.segment(), pCreateInfo, pAllocator, pRenderPass); }
        catch (Throwable e) { throw new RuntimeException("error in vkCreateRenderPass", e); }
    }

    /// ```
    /// void vkDestroyRenderPass((struct VkDevice*) VkDevice device, (uint64_t) VkRenderPass renderPass, const VkAllocationCallbacks* pAllocator);
    /// ```
    public static void vkDestroyRenderPass(VkDevice device, long renderPass, MemorySegment pAllocator) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkDestroyRenderPass)) throw new SymbolNotFoundError("Symbol not found: vkDestroyRenderPass");
        try { Handles.MH_vkDestroyRenderPass.invokeExact(device.capabilities().PFN_vkDestroyRenderPass, device.segment(), renderPass, pAllocator); }
        catch (Throwable e) { throw new RuntimeException("error in vkDestroyRenderPass", e); }
    }

    /// ```
    /// void vkGetRenderAreaGranularity((struct VkDevice*) VkDevice device, (uint64_t) VkRenderPass renderPass, VkExtent2D* pGranularity);
    /// ```
    public static void vkGetRenderAreaGranularity(VkDevice device, long renderPass, MemorySegment pGranularity) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkGetRenderAreaGranularity)) throw new SymbolNotFoundError("Symbol not found: vkGetRenderAreaGranularity");
        try { Handles.MH_vkGetRenderAreaGranularity.invokeExact(device.capabilities().PFN_vkGetRenderAreaGranularity, device.segment(), renderPass, pGranularity); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetRenderAreaGranularity", e); }
    }

    /// ```
    /// (int) VkResult vkCreateCommandPool((struct VkDevice*) VkDevice device, const VkCommandPoolCreateInfo* pCreateInfo, const VkAllocationCallbacks* pAllocator, VkCommandPool* pCommandPool);
    /// ```
    public static int vkCreateCommandPool(VkDevice device, MemorySegment pCreateInfo, MemorySegment pAllocator, MemorySegment pCommandPool) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkCreateCommandPool)) throw new SymbolNotFoundError("Symbol not found: vkCreateCommandPool");
        try { return (int) Handles.MH_vkCreateCommandPool.invokeExact(device.capabilities().PFN_vkCreateCommandPool, device.segment(), pCreateInfo, pAllocator, pCommandPool); }
        catch (Throwable e) { throw new RuntimeException("error in vkCreateCommandPool", e); }
    }

    /// ```
    /// void vkDestroyCommandPool((struct VkDevice*) VkDevice device, (uint64_t) VkCommandPool commandPool, const VkAllocationCallbacks* pAllocator);
    /// ```
    public static void vkDestroyCommandPool(VkDevice device, long commandPool, MemorySegment pAllocator) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkDestroyCommandPool)) throw new SymbolNotFoundError("Symbol not found: vkDestroyCommandPool");
        try { Handles.MH_vkDestroyCommandPool.invokeExact(device.capabilities().PFN_vkDestroyCommandPool, device.segment(), commandPool, pAllocator); }
        catch (Throwable e) { throw new RuntimeException("error in vkDestroyCommandPool", e); }
    }

    /// ```
    /// (int) VkResult vkResetCommandPool((struct VkDevice*) VkDevice device, (uint64_t) VkCommandPool commandPool, ((uint32_t) VkFlags) VkCommandPoolResetFlags flags);
    /// ```
    public static int vkResetCommandPool(VkDevice device, long commandPool, int flags) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkResetCommandPool)) throw new SymbolNotFoundError("Symbol not found: vkResetCommandPool");
        try { return (int) Handles.MH_vkResetCommandPool.invokeExact(device.capabilities().PFN_vkResetCommandPool, device.segment(), commandPool, flags); }
        catch (Throwable e) { throw new RuntimeException("error in vkResetCommandPool", e); }
    }

    /// ```
    /// (int) VkResult vkAllocateCommandBuffers((struct VkDevice*) VkDevice device, const VkCommandBufferAllocateInfo* pAllocateInfo, VkCommandBuffer* pCommandBuffers);
    /// ```
    public static int vkAllocateCommandBuffers(VkDevice device, MemorySegment pAllocateInfo, MemorySegment pCommandBuffers) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkAllocateCommandBuffers)) throw new SymbolNotFoundError("Symbol not found: vkAllocateCommandBuffers");
        try { return (int) Handles.MH_vkAllocateCommandBuffers.invokeExact(device.capabilities().PFN_vkAllocateCommandBuffers, device.segment(), pAllocateInfo, pCommandBuffers); }
        catch (Throwable e) { throw new RuntimeException("error in vkAllocateCommandBuffers", e); }
    }

    /// ```
    /// void vkFreeCommandBuffers((struct VkDevice*) VkDevice device, (uint64_t) VkCommandPool commandPool, uint32_t commandBufferCount, const VkCommandBuffer* pCommandBuffers);
    /// ```
    public static void vkFreeCommandBuffers(VkDevice device, long commandPool, int commandBufferCount, MemorySegment pCommandBuffers) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkFreeCommandBuffers)) throw new SymbolNotFoundError("Symbol not found: vkFreeCommandBuffers");
        try { Handles.MH_vkFreeCommandBuffers.invokeExact(device.capabilities().PFN_vkFreeCommandBuffers, device.segment(), commandPool, commandBufferCount, pCommandBuffers); }
        catch (Throwable e) { throw new RuntimeException("error in vkFreeCommandBuffers", e); }
    }

    /// ```
    /// (int) VkResult vkBeginCommandBuffer((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, const VkCommandBufferBeginInfo* pBeginInfo);
    /// ```
    public static int vkBeginCommandBuffer(VkCommandBuffer commandBuffer, MemorySegment pBeginInfo) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkBeginCommandBuffer)) throw new SymbolNotFoundError("Symbol not found: vkBeginCommandBuffer");
        try { return (int) Handles.MH_vkBeginCommandBuffer.invokeExact(commandBuffer.capabilities().PFN_vkBeginCommandBuffer, commandBuffer.segment(), pBeginInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkBeginCommandBuffer", e); }
    }

    /// ```
    /// (int) VkResult vkEndCommandBuffer((struct VkCommandBuffer*) VkCommandBuffer commandBuffer);
    /// ```
    public static int vkEndCommandBuffer(VkCommandBuffer commandBuffer) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkEndCommandBuffer)) throw new SymbolNotFoundError("Symbol not found: vkEndCommandBuffer");
        try { return (int) Handles.MH_vkEndCommandBuffer.invokeExact(commandBuffer.capabilities().PFN_vkEndCommandBuffer, commandBuffer.segment()); }
        catch (Throwable e) { throw new RuntimeException("error in vkEndCommandBuffer", e); }
    }

    /// ```
    /// (int) VkResult vkResetCommandBuffer((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, ((uint32_t) VkFlags) VkCommandBufferResetFlags flags);
    /// ```
    public static int vkResetCommandBuffer(VkCommandBuffer commandBuffer, int flags) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkResetCommandBuffer)) throw new SymbolNotFoundError("Symbol not found: vkResetCommandBuffer");
        try { return (int) Handles.MH_vkResetCommandBuffer.invokeExact(commandBuffer.capabilities().PFN_vkResetCommandBuffer, commandBuffer.segment(), flags); }
        catch (Throwable e) { throw new RuntimeException("error in vkResetCommandBuffer", e); }
    }

    /// ```
    /// void vkCmdBindPipeline((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, (int) VkPipelineBindPoint pipelineBindPoint, (uint64_t) VkPipeline pipeline);
    /// ```
    public static void vkCmdBindPipeline(VkCommandBuffer commandBuffer, int pipelineBindPoint, long pipeline) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdBindPipeline)) throw new SymbolNotFoundError("Symbol not found: vkCmdBindPipeline");
        try { Handles.MH_vkCmdBindPipeline.invokeExact(commandBuffer.capabilities().PFN_vkCmdBindPipeline, commandBuffer.segment(), pipelineBindPoint, pipeline); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdBindPipeline", e); }
    }

    /// ```
    /// void vkCmdSetViewport((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, uint32_t firstViewport, uint32_t viewportCount, const VkViewport* pViewports);
    /// ```
    public static void vkCmdSetViewport(VkCommandBuffer commandBuffer, int firstViewport, int viewportCount, MemorySegment pViewports) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetViewport)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetViewport");
        try { Handles.MH_vkCmdSetViewport.invokeExact(commandBuffer.capabilities().PFN_vkCmdSetViewport, commandBuffer.segment(), firstViewport, viewportCount, pViewports); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetViewport", e); }
    }

    /// ```
    /// void vkCmdSetScissor((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, uint32_t firstScissor, uint32_t scissorCount, const VkRect2D* pScissors);
    /// ```
    public static void vkCmdSetScissor(VkCommandBuffer commandBuffer, int firstScissor, int scissorCount, MemorySegment pScissors) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetScissor)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetScissor");
        try { Handles.MH_vkCmdSetScissor.invokeExact(commandBuffer.capabilities().PFN_vkCmdSetScissor, commandBuffer.segment(), firstScissor, scissorCount, pScissors); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetScissor", e); }
    }

    /// ```
    /// void vkCmdSetLineWidth((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, float lineWidth);
    /// ```
    public static void vkCmdSetLineWidth(VkCommandBuffer commandBuffer, float lineWidth) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetLineWidth)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetLineWidth");
        try { Handles.MH_vkCmdSetLineWidth.invokeExact(commandBuffer.capabilities().PFN_vkCmdSetLineWidth, commandBuffer.segment(), lineWidth); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetLineWidth", e); }
    }

    /// ```
    /// void vkCmdSetDepthBias((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, float depthBiasConstantFactor, float depthBiasClamp, float depthBiasSlopeFactor);
    /// ```
    public static void vkCmdSetDepthBias(VkCommandBuffer commandBuffer, float depthBiasConstantFactor, float depthBiasClamp, float depthBiasSlopeFactor) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetDepthBias)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetDepthBias");
        try { Handles.MH_vkCmdSetDepthBias.invokeExact(commandBuffer.capabilities().PFN_vkCmdSetDepthBias, commandBuffer.segment(), depthBiasConstantFactor, depthBiasClamp, depthBiasSlopeFactor); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetDepthBias", e); }
    }

    /// ```
    /// void vkCmdSetBlendConstants((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, float blendConstants[4]);
    /// ```
    public static void vkCmdSetBlendConstants(VkCommandBuffer commandBuffer, MemorySegment blendConstants) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetBlendConstants)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetBlendConstants");
        try { Handles.MH_vkCmdSetBlendConstants.invokeExact(commandBuffer.capabilities().PFN_vkCmdSetBlendConstants, commandBuffer.segment(), blendConstants); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetBlendConstants", e); }
    }

    /// ```
    /// void vkCmdSetDepthBounds((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, float minDepthBounds, float maxDepthBounds);
    /// ```
    public static void vkCmdSetDepthBounds(VkCommandBuffer commandBuffer, float minDepthBounds, float maxDepthBounds) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetDepthBounds)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetDepthBounds");
        try { Handles.MH_vkCmdSetDepthBounds.invokeExact(commandBuffer.capabilities().PFN_vkCmdSetDepthBounds, commandBuffer.segment(), minDepthBounds, maxDepthBounds); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetDepthBounds", e); }
    }

    /// ```
    /// void vkCmdSetStencilCompareMask((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, ((uint32_t) VkFlags) VkStencilFaceFlags faceMask, uint32_t compareMask);
    /// ```
    public static void vkCmdSetStencilCompareMask(VkCommandBuffer commandBuffer, int faceMask, int compareMask) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetStencilCompareMask)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetStencilCompareMask");
        try { Handles.MH_vkCmdSetStencilCompareMask.invokeExact(commandBuffer.capabilities().PFN_vkCmdSetStencilCompareMask, commandBuffer.segment(), faceMask, compareMask); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetStencilCompareMask", e); }
    }

    /// ```
    /// void vkCmdSetStencilWriteMask((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, ((uint32_t) VkFlags) VkStencilFaceFlags faceMask, uint32_t writeMask);
    /// ```
    public static void vkCmdSetStencilWriteMask(VkCommandBuffer commandBuffer, int faceMask, int writeMask) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetStencilWriteMask)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetStencilWriteMask");
        try { Handles.MH_vkCmdSetStencilWriteMask.invokeExact(commandBuffer.capabilities().PFN_vkCmdSetStencilWriteMask, commandBuffer.segment(), faceMask, writeMask); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetStencilWriteMask", e); }
    }

    /// ```
    /// void vkCmdSetStencilReference((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, ((uint32_t) VkFlags) VkStencilFaceFlags faceMask, uint32_t reference);
    /// ```
    public static void vkCmdSetStencilReference(VkCommandBuffer commandBuffer, int faceMask, int reference) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetStencilReference)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetStencilReference");
        try { Handles.MH_vkCmdSetStencilReference.invokeExact(commandBuffer.capabilities().PFN_vkCmdSetStencilReference, commandBuffer.segment(), faceMask, reference); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetStencilReference", e); }
    }

    /// ```
    /// void vkCmdBindDescriptorSets((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, (int) VkPipelineBindPoint pipelineBindPoint, (uint64_t) VkPipelineLayout layout, uint32_t firstSet, uint32_t descriptorSetCount, const VkDescriptorSet* pDescriptorSets, uint32_t dynamicOffsetCount, const uint32_t* pDynamicOffsets);
    /// ```
    public static void vkCmdBindDescriptorSets(VkCommandBuffer commandBuffer, int pipelineBindPoint, long layout, int firstSet, int descriptorSetCount, MemorySegment pDescriptorSets, int dynamicOffsetCount, MemorySegment pDynamicOffsets) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdBindDescriptorSets)) throw new SymbolNotFoundError("Symbol not found: vkCmdBindDescriptorSets");
        try { Handles.MH_vkCmdBindDescriptorSets.invokeExact(commandBuffer.capabilities().PFN_vkCmdBindDescriptorSets, commandBuffer.segment(), pipelineBindPoint, layout, firstSet, descriptorSetCount, pDescriptorSets, dynamicOffsetCount, pDynamicOffsets); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdBindDescriptorSets", e); }
    }

    /// ```
    /// void vkCmdBindIndexBuffer((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, (uint64_t) VkBuffer buffer, (uint64_t) VkDeviceSize offset, (int) VkIndexType indexType);
    /// ```
    public static void vkCmdBindIndexBuffer(VkCommandBuffer commandBuffer, long buffer, long offset, int indexType) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdBindIndexBuffer)) throw new SymbolNotFoundError("Symbol not found: vkCmdBindIndexBuffer");
        try { Handles.MH_vkCmdBindIndexBuffer.invokeExact(commandBuffer.capabilities().PFN_vkCmdBindIndexBuffer, commandBuffer.segment(), buffer, offset, indexType); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdBindIndexBuffer", e); }
    }

    /// ```
    /// void vkCmdBindVertexBuffers((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, uint32_t firstBinding, uint32_t bindingCount, const VkBuffer* pBuffers, const VkDeviceSize* pOffsets);
    /// ```
    public static void vkCmdBindVertexBuffers(VkCommandBuffer commandBuffer, int firstBinding, int bindingCount, MemorySegment pBuffers, MemorySegment pOffsets) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdBindVertexBuffers)) throw new SymbolNotFoundError("Symbol not found: vkCmdBindVertexBuffers");
        try { Handles.MH_vkCmdBindVertexBuffers.invokeExact(commandBuffer.capabilities().PFN_vkCmdBindVertexBuffers, commandBuffer.segment(), firstBinding, bindingCount, pBuffers, pOffsets); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdBindVertexBuffers", e); }
    }

    /// ```
    /// void vkCmdDraw((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, uint32_t vertexCount, uint32_t instanceCount, uint32_t firstVertex, uint32_t firstInstance);
    /// ```
    public static void vkCmdDraw(VkCommandBuffer commandBuffer, int vertexCount, int instanceCount, int firstVertex, int firstInstance) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdDraw)) throw new SymbolNotFoundError("Symbol not found: vkCmdDraw");
        try { Handles.MH_vkCmdDraw.invokeExact(commandBuffer.capabilities().PFN_vkCmdDraw, commandBuffer.segment(), vertexCount, instanceCount, firstVertex, firstInstance); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdDraw", e); }
    }

    /// ```
    /// void vkCmdDrawIndexed((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, uint32_t indexCount, uint32_t instanceCount, uint32_t firstIndex, int32_t vertexOffset, uint32_t firstInstance);
    /// ```
    public static void vkCmdDrawIndexed(VkCommandBuffer commandBuffer, int indexCount, int instanceCount, int firstIndex, int vertexOffset, int firstInstance) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdDrawIndexed)) throw new SymbolNotFoundError("Symbol not found: vkCmdDrawIndexed");
        try { Handles.MH_vkCmdDrawIndexed.invokeExact(commandBuffer.capabilities().PFN_vkCmdDrawIndexed, commandBuffer.segment(), indexCount, instanceCount, firstIndex, vertexOffset, firstInstance); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdDrawIndexed", e); }
    }

    /// ```
    /// void vkCmdDrawIndirect((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, (uint64_t) VkBuffer buffer, (uint64_t) VkDeviceSize offset, uint32_t drawCount, uint32_t stride);
    /// ```
    public static void vkCmdDrawIndirect(VkCommandBuffer commandBuffer, long buffer, long offset, int drawCount, int stride) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdDrawIndirect)) throw new SymbolNotFoundError("Symbol not found: vkCmdDrawIndirect");
        try { Handles.MH_vkCmdDrawIndirect.invokeExact(commandBuffer.capabilities().PFN_vkCmdDrawIndirect, commandBuffer.segment(), buffer, offset, drawCount, stride); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdDrawIndirect", e); }
    }

    /// ```
    /// void vkCmdDrawIndexedIndirect((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, (uint64_t) VkBuffer buffer, (uint64_t) VkDeviceSize offset, uint32_t drawCount, uint32_t stride);
    /// ```
    public static void vkCmdDrawIndexedIndirect(VkCommandBuffer commandBuffer, long buffer, long offset, int drawCount, int stride) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdDrawIndexedIndirect)) throw new SymbolNotFoundError("Symbol not found: vkCmdDrawIndexedIndirect");
        try { Handles.MH_vkCmdDrawIndexedIndirect.invokeExact(commandBuffer.capabilities().PFN_vkCmdDrawIndexedIndirect, commandBuffer.segment(), buffer, offset, drawCount, stride); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdDrawIndexedIndirect", e); }
    }

    /// ```
    /// void vkCmdDispatch((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, uint32_t groupCountX, uint32_t groupCountY, uint32_t groupCountZ);
    /// ```
    public static void vkCmdDispatch(VkCommandBuffer commandBuffer, int groupCountX, int groupCountY, int groupCountZ) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdDispatch)) throw new SymbolNotFoundError("Symbol not found: vkCmdDispatch");
        try { Handles.MH_vkCmdDispatch.invokeExact(commandBuffer.capabilities().PFN_vkCmdDispatch, commandBuffer.segment(), groupCountX, groupCountY, groupCountZ); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdDispatch", e); }
    }

    /// ```
    /// void vkCmdDispatchIndirect((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, (uint64_t) VkBuffer buffer, (uint64_t) VkDeviceSize offset);
    /// ```
    public static void vkCmdDispatchIndirect(VkCommandBuffer commandBuffer, long buffer, long offset) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdDispatchIndirect)) throw new SymbolNotFoundError("Symbol not found: vkCmdDispatchIndirect");
        try { Handles.MH_vkCmdDispatchIndirect.invokeExact(commandBuffer.capabilities().PFN_vkCmdDispatchIndirect, commandBuffer.segment(), buffer, offset); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdDispatchIndirect", e); }
    }

    /// ```
    /// void vkCmdCopyBuffer((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, (uint64_t) VkBuffer srcBuffer, (uint64_t) VkBuffer dstBuffer, uint32_t regionCount, const VkBufferCopy* pRegions);
    /// ```
    public static void vkCmdCopyBuffer(VkCommandBuffer commandBuffer, long srcBuffer, long dstBuffer, int regionCount, MemorySegment pRegions) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdCopyBuffer)) throw new SymbolNotFoundError("Symbol not found: vkCmdCopyBuffer");
        try { Handles.MH_vkCmdCopyBuffer.invokeExact(commandBuffer.capabilities().PFN_vkCmdCopyBuffer, commandBuffer.segment(), srcBuffer, dstBuffer, regionCount, pRegions); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdCopyBuffer", e); }
    }

    /// ```
    /// void vkCmdCopyImage((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, (uint64_t) VkImage srcImage, (int) VkImageLayout srcImageLayout, (uint64_t) VkImage dstImage, (int) VkImageLayout dstImageLayout, uint32_t regionCount, const VkImageCopy* pRegions);
    /// ```
    public static void vkCmdCopyImage(VkCommandBuffer commandBuffer, long srcImage, int srcImageLayout, long dstImage, int dstImageLayout, int regionCount, MemorySegment pRegions) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdCopyImage)) throw new SymbolNotFoundError("Symbol not found: vkCmdCopyImage");
        try { Handles.MH_vkCmdCopyImage.invokeExact(commandBuffer.capabilities().PFN_vkCmdCopyImage, commandBuffer.segment(), srcImage, srcImageLayout, dstImage, dstImageLayout, regionCount, pRegions); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdCopyImage", e); }
    }

    /// ```
    /// void vkCmdBlitImage((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, (uint64_t) VkImage srcImage, (int) VkImageLayout srcImageLayout, (uint64_t) VkImage dstImage, (int) VkImageLayout dstImageLayout, uint32_t regionCount, const VkImageBlit* pRegions, (int) VkFilter filter);
    /// ```
    public static void vkCmdBlitImage(VkCommandBuffer commandBuffer, long srcImage, int srcImageLayout, long dstImage, int dstImageLayout, int regionCount, MemorySegment pRegions, int filter) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdBlitImage)) throw new SymbolNotFoundError("Symbol not found: vkCmdBlitImage");
        try { Handles.MH_vkCmdBlitImage.invokeExact(commandBuffer.capabilities().PFN_vkCmdBlitImage, commandBuffer.segment(), srcImage, srcImageLayout, dstImage, dstImageLayout, regionCount, pRegions, filter); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdBlitImage", e); }
    }

    /// ```
    /// void vkCmdCopyBufferToImage((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, (uint64_t) VkBuffer srcBuffer, (uint64_t) VkImage dstImage, (int) VkImageLayout dstImageLayout, uint32_t regionCount, const VkBufferImageCopy* pRegions);
    /// ```
    public static void vkCmdCopyBufferToImage(VkCommandBuffer commandBuffer, long srcBuffer, long dstImage, int dstImageLayout, int regionCount, MemorySegment pRegions) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdCopyBufferToImage)) throw new SymbolNotFoundError("Symbol not found: vkCmdCopyBufferToImage");
        try { Handles.MH_vkCmdCopyBufferToImage.invokeExact(commandBuffer.capabilities().PFN_vkCmdCopyBufferToImage, commandBuffer.segment(), srcBuffer, dstImage, dstImageLayout, regionCount, pRegions); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdCopyBufferToImage", e); }
    }

    /// ```
    /// void vkCmdCopyImageToBuffer((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, (uint64_t) VkImage srcImage, (int) VkImageLayout srcImageLayout, (uint64_t) VkBuffer dstBuffer, uint32_t regionCount, const VkBufferImageCopy* pRegions);
    /// ```
    public static void vkCmdCopyImageToBuffer(VkCommandBuffer commandBuffer, long srcImage, int srcImageLayout, long dstBuffer, int regionCount, MemorySegment pRegions) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdCopyImageToBuffer)) throw new SymbolNotFoundError("Symbol not found: vkCmdCopyImageToBuffer");
        try { Handles.MH_vkCmdCopyImageToBuffer.invokeExact(commandBuffer.capabilities().PFN_vkCmdCopyImageToBuffer, commandBuffer.segment(), srcImage, srcImageLayout, dstBuffer, regionCount, pRegions); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdCopyImageToBuffer", e); }
    }

    /// ```
    /// void vkCmdUpdateBuffer((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, (uint64_t) VkBuffer dstBuffer, (uint64_t) VkDeviceSize dstOffset, (uint64_t) VkDeviceSize dataSize, const void* pData);
    /// ```
    public static void vkCmdUpdateBuffer(VkCommandBuffer commandBuffer, long dstBuffer, long dstOffset, long dataSize, MemorySegment pData) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdUpdateBuffer)) throw new SymbolNotFoundError("Symbol not found: vkCmdUpdateBuffer");
        try { Handles.MH_vkCmdUpdateBuffer.invokeExact(commandBuffer.capabilities().PFN_vkCmdUpdateBuffer, commandBuffer.segment(), dstBuffer, dstOffset, dataSize, pData); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdUpdateBuffer", e); }
    }

    /// ```
    /// void vkCmdFillBuffer((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, (uint64_t) VkBuffer dstBuffer, (uint64_t) VkDeviceSize dstOffset, (uint64_t) VkDeviceSize size, uint32_t data);
    /// ```
    public static void vkCmdFillBuffer(VkCommandBuffer commandBuffer, long dstBuffer, long dstOffset, long size, int data) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdFillBuffer)) throw new SymbolNotFoundError("Symbol not found: vkCmdFillBuffer");
        try { Handles.MH_vkCmdFillBuffer.invokeExact(commandBuffer.capabilities().PFN_vkCmdFillBuffer, commandBuffer.segment(), dstBuffer, dstOffset, size, data); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdFillBuffer", e); }
    }

    /// ```
    /// void vkCmdClearColorImage((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, (uint64_t) VkImage image, (int) VkImageLayout imageLayout, const VkClearColorValue* pColor, uint32_t rangeCount, const VkImageSubresourceRange* pRanges);
    /// ```
    public static void vkCmdClearColorImage(VkCommandBuffer commandBuffer, long image, int imageLayout, MemorySegment pColor, int rangeCount, MemorySegment pRanges) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdClearColorImage)) throw new SymbolNotFoundError("Symbol not found: vkCmdClearColorImage");
        try { Handles.MH_vkCmdClearColorImage.invokeExact(commandBuffer.capabilities().PFN_vkCmdClearColorImage, commandBuffer.segment(), image, imageLayout, pColor, rangeCount, pRanges); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdClearColorImage", e); }
    }

    /// ```
    /// void vkCmdClearDepthStencilImage((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, (uint64_t) VkImage image, (int) VkImageLayout imageLayout, const VkClearDepthStencilValue* pDepthStencil, uint32_t rangeCount, const VkImageSubresourceRange* pRanges);
    /// ```
    public static void vkCmdClearDepthStencilImage(VkCommandBuffer commandBuffer, long image, int imageLayout, MemorySegment pDepthStencil, int rangeCount, MemorySegment pRanges) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdClearDepthStencilImage)) throw new SymbolNotFoundError("Symbol not found: vkCmdClearDepthStencilImage");
        try { Handles.MH_vkCmdClearDepthStencilImage.invokeExact(commandBuffer.capabilities().PFN_vkCmdClearDepthStencilImage, commandBuffer.segment(), image, imageLayout, pDepthStencil, rangeCount, pRanges); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdClearDepthStencilImage", e); }
    }

    /// ```
    /// void vkCmdClearAttachments((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, uint32_t attachmentCount, const VkClearAttachment* pAttachments, uint32_t rectCount, const VkClearRect* pRects);
    /// ```
    public static void vkCmdClearAttachments(VkCommandBuffer commandBuffer, int attachmentCount, MemorySegment pAttachments, int rectCount, MemorySegment pRects) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdClearAttachments)) throw new SymbolNotFoundError("Symbol not found: vkCmdClearAttachments");
        try { Handles.MH_vkCmdClearAttachments.invokeExact(commandBuffer.capabilities().PFN_vkCmdClearAttachments, commandBuffer.segment(), attachmentCount, pAttachments, rectCount, pRects); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdClearAttachments", e); }
    }

    /// ```
    /// void vkCmdResolveImage((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, (uint64_t) VkImage srcImage, (int) VkImageLayout srcImageLayout, (uint64_t) VkImage dstImage, (int) VkImageLayout dstImageLayout, uint32_t regionCount, const VkImageResolve* pRegions);
    /// ```
    public static void vkCmdResolveImage(VkCommandBuffer commandBuffer, long srcImage, int srcImageLayout, long dstImage, int dstImageLayout, int regionCount, MemorySegment pRegions) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdResolveImage)) throw new SymbolNotFoundError("Symbol not found: vkCmdResolveImage");
        try { Handles.MH_vkCmdResolveImage.invokeExact(commandBuffer.capabilities().PFN_vkCmdResolveImage, commandBuffer.segment(), srcImage, srcImageLayout, dstImage, dstImageLayout, regionCount, pRegions); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdResolveImage", e); }
    }

    /// ```
    /// void vkCmdSetEvent((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, (uint64_t) VkEvent event, ((uint32_t) VkFlags) VkPipelineStageFlags stageMask);
    /// ```
    public static void vkCmdSetEvent(VkCommandBuffer commandBuffer, long event, int stageMask) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetEvent)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetEvent");
        try { Handles.MH_vkCmdSetEvent.invokeExact(commandBuffer.capabilities().PFN_vkCmdSetEvent, commandBuffer.segment(), event, stageMask); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetEvent", e); }
    }

    /// ```
    /// void vkCmdResetEvent((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, (uint64_t) VkEvent event, ((uint32_t) VkFlags) VkPipelineStageFlags stageMask);
    /// ```
    public static void vkCmdResetEvent(VkCommandBuffer commandBuffer, long event, int stageMask) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdResetEvent)) throw new SymbolNotFoundError("Symbol not found: vkCmdResetEvent");
        try { Handles.MH_vkCmdResetEvent.invokeExact(commandBuffer.capabilities().PFN_vkCmdResetEvent, commandBuffer.segment(), event, stageMask); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdResetEvent", e); }
    }

    /// ```
    /// void vkCmdWaitEvents((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, uint32_t eventCount, const VkEvent* pEvents, ((uint32_t) VkFlags) VkPipelineStageFlags srcStageMask, ((uint32_t) VkFlags) VkPipelineStageFlags dstStageMask, uint32_t memoryBarrierCount, const VkMemoryBarrier* pMemoryBarriers, uint32_t bufferMemoryBarrierCount, const VkBufferMemoryBarrier* pBufferMemoryBarriers, uint32_t imageMemoryBarrierCount, const VkImageMemoryBarrier* pImageMemoryBarriers);
    /// ```
    public static void vkCmdWaitEvents(VkCommandBuffer commandBuffer, int eventCount, MemorySegment pEvents, int srcStageMask, int dstStageMask, int memoryBarrierCount, MemorySegment pMemoryBarriers, int bufferMemoryBarrierCount, MemorySegment pBufferMemoryBarriers, int imageMemoryBarrierCount, MemorySegment pImageMemoryBarriers) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdWaitEvents)) throw new SymbolNotFoundError("Symbol not found: vkCmdWaitEvents");
        try { Handles.MH_vkCmdWaitEvents.invokeExact(commandBuffer.capabilities().PFN_vkCmdWaitEvents, commandBuffer.segment(), eventCount, pEvents, srcStageMask, dstStageMask, memoryBarrierCount, pMemoryBarriers, bufferMemoryBarrierCount, pBufferMemoryBarriers, imageMemoryBarrierCount, pImageMemoryBarriers); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdWaitEvents", e); }
    }

    /// ```
    /// void vkCmdPipelineBarrier((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, ((uint32_t) VkFlags) VkPipelineStageFlags srcStageMask, ((uint32_t) VkFlags) VkPipelineStageFlags dstStageMask, ((uint32_t) VkFlags) VkDependencyFlags dependencyFlags, uint32_t memoryBarrierCount, const VkMemoryBarrier* pMemoryBarriers, uint32_t bufferMemoryBarrierCount, const VkBufferMemoryBarrier* pBufferMemoryBarriers, uint32_t imageMemoryBarrierCount, const VkImageMemoryBarrier* pImageMemoryBarriers);
    /// ```
    public static void vkCmdPipelineBarrier(VkCommandBuffer commandBuffer, int srcStageMask, int dstStageMask, int dependencyFlags, int memoryBarrierCount, MemorySegment pMemoryBarriers, int bufferMemoryBarrierCount, MemorySegment pBufferMemoryBarriers, int imageMemoryBarrierCount, MemorySegment pImageMemoryBarriers) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdPipelineBarrier)) throw new SymbolNotFoundError("Symbol not found: vkCmdPipelineBarrier");
        try { Handles.MH_vkCmdPipelineBarrier.invokeExact(commandBuffer.capabilities().PFN_vkCmdPipelineBarrier, commandBuffer.segment(), srcStageMask, dstStageMask, dependencyFlags, memoryBarrierCount, pMemoryBarriers, bufferMemoryBarrierCount, pBufferMemoryBarriers, imageMemoryBarrierCount, pImageMemoryBarriers); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdPipelineBarrier", e); }
    }

    /// ```
    /// void vkCmdBeginQuery((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, (uint64_t) VkQueryPool queryPool, uint32_t query, ((uint32_t) VkFlags) VkQueryControlFlags flags);
    /// ```
    public static void vkCmdBeginQuery(VkCommandBuffer commandBuffer, long queryPool, int query, int flags) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdBeginQuery)) throw new SymbolNotFoundError("Symbol not found: vkCmdBeginQuery");
        try { Handles.MH_vkCmdBeginQuery.invokeExact(commandBuffer.capabilities().PFN_vkCmdBeginQuery, commandBuffer.segment(), queryPool, query, flags); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdBeginQuery", e); }
    }

    /// ```
    /// void vkCmdEndQuery((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, (uint64_t) VkQueryPool queryPool, uint32_t query);
    /// ```
    public static void vkCmdEndQuery(VkCommandBuffer commandBuffer, long queryPool, int query) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdEndQuery)) throw new SymbolNotFoundError("Symbol not found: vkCmdEndQuery");
        try { Handles.MH_vkCmdEndQuery.invokeExact(commandBuffer.capabilities().PFN_vkCmdEndQuery, commandBuffer.segment(), queryPool, query); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdEndQuery", e); }
    }

    /// ```
    /// void vkCmdResetQueryPool((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, (uint64_t) VkQueryPool queryPool, uint32_t firstQuery, uint32_t queryCount);
    /// ```
    public static void vkCmdResetQueryPool(VkCommandBuffer commandBuffer, long queryPool, int firstQuery, int queryCount) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdResetQueryPool)) throw new SymbolNotFoundError("Symbol not found: vkCmdResetQueryPool");
        try { Handles.MH_vkCmdResetQueryPool.invokeExact(commandBuffer.capabilities().PFN_vkCmdResetQueryPool, commandBuffer.segment(), queryPool, firstQuery, queryCount); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdResetQueryPool", e); }
    }

    /// ```
    /// void vkCmdWriteTimestamp((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, (int) VkPipelineStageFlagBits pipelineStage, (uint64_t) VkQueryPool queryPool, uint32_t query);
    /// ```
    public static void vkCmdWriteTimestamp(VkCommandBuffer commandBuffer, int pipelineStage, long queryPool, int query) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdWriteTimestamp)) throw new SymbolNotFoundError("Symbol not found: vkCmdWriteTimestamp");
        try { Handles.MH_vkCmdWriteTimestamp.invokeExact(commandBuffer.capabilities().PFN_vkCmdWriteTimestamp, commandBuffer.segment(), pipelineStage, queryPool, query); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdWriteTimestamp", e); }
    }

    /// ```
    /// void vkCmdCopyQueryPoolResults((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, (uint64_t) VkQueryPool queryPool, uint32_t firstQuery, uint32_t queryCount, (uint64_t) VkBuffer dstBuffer, (uint64_t) VkDeviceSize dstOffset, (uint64_t) VkDeviceSize stride, ((uint32_t) VkFlags) VkQueryResultFlags flags);
    /// ```
    public static void vkCmdCopyQueryPoolResults(VkCommandBuffer commandBuffer, long queryPool, int firstQuery, int queryCount, long dstBuffer, long dstOffset, long stride, int flags) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdCopyQueryPoolResults)) throw new SymbolNotFoundError("Symbol not found: vkCmdCopyQueryPoolResults");
        try { Handles.MH_vkCmdCopyQueryPoolResults.invokeExact(commandBuffer.capabilities().PFN_vkCmdCopyQueryPoolResults, commandBuffer.segment(), queryPool, firstQuery, queryCount, dstBuffer, dstOffset, stride, flags); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdCopyQueryPoolResults", e); }
    }

    /// ```
    /// void vkCmdPushConstants((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, (uint64_t) VkPipelineLayout layout, ((uint32_t) VkFlags) VkShaderStageFlags stageFlags, uint32_t offset, uint32_t size, const void* pValues);
    /// ```
    public static void vkCmdPushConstants(VkCommandBuffer commandBuffer, long layout, int stageFlags, int offset, int size, MemorySegment pValues) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdPushConstants)) throw new SymbolNotFoundError("Symbol not found: vkCmdPushConstants");
        try { Handles.MH_vkCmdPushConstants.invokeExact(commandBuffer.capabilities().PFN_vkCmdPushConstants, commandBuffer.segment(), layout, stageFlags, offset, size, pValues); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdPushConstants", e); }
    }

    /// ```
    /// void vkCmdBeginRenderPass((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, const VkRenderPassBeginInfo* pRenderPassBegin, (int) VkSubpassContents contents);
    /// ```
    public static void vkCmdBeginRenderPass(VkCommandBuffer commandBuffer, MemorySegment pRenderPassBegin, int contents) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdBeginRenderPass)) throw new SymbolNotFoundError("Symbol not found: vkCmdBeginRenderPass");
        try { Handles.MH_vkCmdBeginRenderPass.invokeExact(commandBuffer.capabilities().PFN_vkCmdBeginRenderPass, commandBuffer.segment(), pRenderPassBegin, contents); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdBeginRenderPass", e); }
    }

    /// ```
    /// void vkCmdNextSubpass((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, (int) VkSubpassContents contents);
    /// ```
    public static void vkCmdNextSubpass(VkCommandBuffer commandBuffer, int contents) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdNextSubpass)) throw new SymbolNotFoundError("Symbol not found: vkCmdNextSubpass");
        try { Handles.MH_vkCmdNextSubpass.invokeExact(commandBuffer.capabilities().PFN_vkCmdNextSubpass, commandBuffer.segment(), contents); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdNextSubpass", e); }
    }

    /// ```
    /// void vkCmdEndRenderPass((struct VkCommandBuffer*) VkCommandBuffer commandBuffer);
    /// ```
    public static void vkCmdEndRenderPass(VkCommandBuffer commandBuffer) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdEndRenderPass)) throw new SymbolNotFoundError("Symbol not found: vkCmdEndRenderPass");
        try { Handles.MH_vkCmdEndRenderPass.invokeExact(commandBuffer.capabilities().PFN_vkCmdEndRenderPass, commandBuffer.segment()); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdEndRenderPass", e); }
    }

    /// ```
    /// void vkCmdExecuteCommands((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, uint32_t commandBufferCount, const VkCommandBuffer* pCommandBuffers);
    /// ```
    public static void vkCmdExecuteCommands(VkCommandBuffer commandBuffer, int commandBufferCount, MemorySegment pCommandBuffers) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdExecuteCommands)) throw new SymbolNotFoundError("Symbol not found: vkCmdExecuteCommands");
        try { Handles.MH_vkCmdExecuteCommands.invokeExact(commandBuffer.capabilities().PFN_vkCmdExecuteCommands, commandBuffer.segment(), commandBufferCount, pCommandBuffers); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdExecuteCommands", e); }
    }

    // --- OverrunGL custom code ---
    public static final long VK_NULL_HANDLE = 0L;
    
    public static int VK_MAKE_API_VERSION(int variant, int major, int minor, int patch) {
        return (variant << 29) | (major << 22) | (minor << 12) | patch;
    }
    public static int VK_API_VERSION_VARIANT(int version) { return version >> 29; }
    public static int VK_API_VERSION_MAJOR(int version) { return (version >> 22) & 0x7F; }
    public static int VK_API_VERSION_MINOR(int version) { return (version >> 12) & 0x3FF; }
    public static int VK_API_VERSION_PATCH(int version) { return version & 0xFFF; }
}
