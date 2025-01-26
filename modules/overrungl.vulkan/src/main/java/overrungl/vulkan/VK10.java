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
public class VK10 {
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
    private final Handles handles;
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
        public final MemorySegment PFN_vkCreateInstance;
        public final MemorySegment PFN_vkDestroyInstance;
        public final MemorySegment PFN_vkEnumeratePhysicalDevices;
        public final MemorySegment PFN_vkGetPhysicalDeviceFeatures;
        public final MemorySegment PFN_vkGetPhysicalDeviceFormatProperties;
        public final MemorySegment PFN_vkGetPhysicalDeviceImageFormatProperties;
        public final MemorySegment PFN_vkGetPhysicalDeviceProperties;
        public final MemorySegment PFN_vkGetPhysicalDeviceQueueFamilyProperties;
        public final MemorySegment PFN_vkGetPhysicalDeviceMemoryProperties;
        public final MemorySegment PFN_vkGetInstanceProcAddr;
        public final MemorySegment PFN_vkGetDeviceProcAddr;
        public final MemorySegment PFN_vkCreateDevice;
        public final MemorySegment PFN_vkDestroyDevice;
        public final MemorySegment PFN_vkEnumerateInstanceExtensionProperties;
        public final MemorySegment PFN_vkEnumerateDeviceExtensionProperties;
        public final MemorySegment PFN_vkEnumerateInstanceLayerProperties;
        public final MemorySegment PFN_vkEnumerateDeviceLayerProperties;
        public final MemorySegment PFN_vkGetDeviceQueue;
        public final MemorySegment PFN_vkQueueSubmit;
        public final MemorySegment PFN_vkQueueWaitIdle;
        public final MemorySegment PFN_vkDeviceWaitIdle;
        public final MemorySegment PFN_vkAllocateMemory;
        public final MemorySegment PFN_vkFreeMemory;
        public final MemorySegment PFN_vkMapMemory;
        public final MemorySegment PFN_vkUnmapMemory;
        public final MemorySegment PFN_vkFlushMappedMemoryRanges;
        public final MemorySegment PFN_vkInvalidateMappedMemoryRanges;
        public final MemorySegment PFN_vkGetDeviceMemoryCommitment;
        public final MemorySegment PFN_vkBindBufferMemory;
        public final MemorySegment PFN_vkBindImageMemory;
        public final MemorySegment PFN_vkGetBufferMemoryRequirements;
        public final MemorySegment PFN_vkGetImageMemoryRequirements;
        public final MemorySegment PFN_vkGetImageSparseMemoryRequirements;
        public final MemorySegment PFN_vkGetPhysicalDeviceSparseImageFormatProperties;
        public final MemorySegment PFN_vkQueueBindSparse;
        public final MemorySegment PFN_vkCreateFence;
        public final MemorySegment PFN_vkDestroyFence;
        public final MemorySegment PFN_vkResetFences;
        public final MemorySegment PFN_vkGetFenceStatus;
        public final MemorySegment PFN_vkWaitForFences;
        public final MemorySegment PFN_vkCreateSemaphore;
        public final MemorySegment PFN_vkDestroySemaphore;
        public final MemorySegment PFN_vkCreateEvent;
        public final MemorySegment PFN_vkDestroyEvent;
        public final MemorySegment PFN_vkGetEventStatus;
        public final MemorySegment PFN_vkSetEvent;
        public final MemorySegment PFN_vkResetEvent;
        public final MemorySegment PFN_vkCreateQueryPool;
        public final MemorySegment PFN_vkDestroyQueryPool;
        public final MemorySegment PFN_vkGetQueryPoolResults;
        public final MemorySegment PFN_vkCreateBuffer;
        public final MemorySegment PFN_vkDestroyBuffer;
        public final MemorySegment PFN_vkCreateBufferView;
        public final MemorySegment PFN_vkDestroyBufferView;
        public final MemorySegment PFN_vkCreateImage;
        public final MemorySegment PFN_vkDestroyImage;
        public final MemorySegment PFN_vkGetImageSubresourceLayout;
        public final MemorySegment PFN_vkCreateImageView;
        public final MemorySegment PFN_vkDestroyImageView;
        public final MemorySegment PFN_vkCreateShaderModule;
        public final MemorySegment PFN_vkDestroyShaderModule;
        public final MemorySegment PFN_vkCreatePipelineCache;
        public final MemorySegment PFN_vkDestroyPipelineCache;
        public final MemorySegment PFN_vkGetPipelineCacheData;
        public final MemorySegment PFN_vkMergePipelineCaches;
        public final MemorySegment PFN_vkCreateGraphicsPipelines;
        public final MemorySegment PFN_vkCreateComputePipelines;
        public final MemorySegment PFN_vkDestroyPipeline;
        public final MemorySegment PFN_vkCreatePipelineLayout;
        public final MemorySegment PFN_vkDestroyPipelineLayout;
        public final MemorySegment PFN_vkCreateSampler;
        public final MemorySegment PFN_vkDestroySampler;
        public final MemorySegment PFN_vkCreateDescriptorSetLayout;
        public final MemorySegment PFN_vkDestroyDescriptorSetLayout;
        public final MemorySegment PFN_vkCreateDescriptorPool;
        public final MemorySegment PFN_vkDestroyDescriptorPool;
        public final MemorySegment PFN_vkResetDescriptorPool;
        public final MemorySegment PFN_vkAllocateDescriptorSets;
        public final MemorySegment PFN_vkFreeDescriptorSets;
        public final MemorySegment PFN_vkUpdateDescriptorSets;
        public final MemorySegment PFN_vkCreateFramebuffer;
        public final MemorySegment PFN_vkDestroyFramebuffer;
        public final MemorySegment PFN_vkCreateRenderPass;
        public final MemorySegment PFN_vkDestroyRenderPass;
        public final MemorySegment PFN_vkGetRenderAreaGranularity;
        public final MemorySegment PFN_vkCreateCommandPool;
        public final MemorySegment PFN_vkDestroyCommandPool;
        public final MemorySegment PFN_vkResetCommandPool;
        public final MemorySegment PFN_vkAllocateCommandBuffers;
        public final MemorySegment PFN_vkFreeCommandBuffers;
        public final MemorySegment PFN_vkBeginCommandBuffer;
        public final MemorySegment PFN_vkEndCommandBuffer;
        public final MemorySegment PFN_vkResetCommandBuffer;
        public final MemorySegment PFN_vkCmdBindPipeline;
        public final MemorySegment PFN_vkCmdSetViewport;
        public final MemorySegment PFN_vkCmdSetScissor;
        public final MemorySegment PFN_vkCmdSetLineWidth;
        public final MemorySegment PFN_vkCmdSetDepthBias;
        public final MemorySegment PFN_vkCmdSetBlendConstants;
        public final MemorySegment PFN_vkCmdSetDepthBounds;
        public final MemorySegment PFN_vkCmdSetStencilCompareMask;
        public final MemorySegment PFN_vkCmdSetStencilWriteMask;
        public final MemorySegment PFN_vkCmdSetStencilReference;
        public final MemorySegment PFN_vkCmdBindDescriptorSets;
        public final MemorySegment PFN_vkCmdBindIndexBuffer;
        public final MemorySegment PFN_vkCmdBindVertexBuffers;
        public final MemorySegment PFN_vkCmdDraw;
        public final MemorySegment PFN_vkCmdDrawIndexed;
        public final MemorySegment PFN_vkCmdDrawIndirect;
        public final MemorySegment PFN_vkCmdDrawIndexedIndirect;
        public final MemorySegment PFN_vkCmdDispatch;
        public final MemorySegment PFN_vkCmdDispatchIndirect;
        public final MemorySegment PFN_vkCmdCopyBuffer;
        public final MemorySegment PFN_vkCmdCopyImage;
        public final MemorySegment PFN_vkCmdBlitImage;
        public final MemorySegment PFN_vkCmdCopyBufferToImage;
        public final MemorySegment PFN_vkCmdCopyImageToBuffer;
        public final MemorySegment PFN_vkCmdUpdateBuffer;
        public final MemorySegment PFN_vkCmdFillBuffer;
        public final MemorySegment PFN_vkCmdClearColorImage;
        public final MemorySegment PFN_vkCmdClearDepthStencilImage;
        public final MemorySegment PFN_vkCmdClearAttachments;
        public final MemorySegment PFN_vkCmdResolveImage;
        public final MemorySegment PFN_vkCmdSetEvent;
        public final MemorySegment PFN_vkCmdResetEvent;
        public final MemorySegment PFN_vkCmdWaitEvents;
        public final MemorySegment PFN_vkCmdPipelineBarrier;
        public final MemorySegment PFN_vkCmdBeginQuery;
        public final MemorySegment PFN_vkCmdEndQuery;
        public final MemorySegment PFN_vkCmdResetQueryPool;
        public final MemorySegment PFN_vkCmdWriteTimestamp;
        public final MemorySegment PFN_vkCmdCopyQueryPoolResults;
        public final MemorySegment PFN_vkCmdPushConstants;
        public final MemorySegment PFN_vkCmdBeginRenderPass;
        public final MemorySegment PFN_vkCmdNextSubpass;
        public final MemorySegment PFN_vkCmdEndRenderPass;
        public final MemorySegment PFN_vkCmdExecuteCommands;
        private Handles(MemorySegment instance, VKLoadFunc func) {
            PFN_vkCreateInstance = func.invoke(instance, "vkCreateInstance");
            PFN_vkDestroyInstance = func.invoke(instance, "vkDestroyInstance");
            PFN_vkEnumeratePhysicalDevices = func.invoke(instance, "vkEnumeratePhysicalDevices");
            PFN_vkGetPhysicalDeviceFeatures = func.invoke(instance, "vkGetPhysicalDeviceFeatures");
            PFN_vkGetPhysicalDeviceFormatProperties = func.invoke(instance, "vkGetPhysicalDeviceFormatProperties");
            PFN_vkGetPhysicalDeviceImageFormatProperties = func.invoke(instance, "vkGetPhysicalDeviceImageFormatProperties");
            PFN_vkGetPhysicalDeviceProperties = func.invoke(instance, "vkGetPhysicalDeviceProperties");
            PFN_vkGetPhysicalDeviceQueueFamilyProperties = func.invoke(instance, "vkGetPhysicalDeviceQueueFamilyProperties");
            PFN_vkGetPhysicalDeviceMemoryProperties = func.invoke(instance, "vkGetPhysicalDeviceMemoryProperties");
            PFN_vkGetInstanceProcAddr = func.invoke(instance, "vkGetInstanceProcAddr");
            PFN_vkGetDeviceProcAddr = func.invoke(instance, "vkGetDeviceProcAddr");
            PFN_vkCreateDevice = func.invoke(instance, "vkCreateDevice");
            PFN_vkDestroyDevice = func.invoke(instance, "vkDestroyDevice");
            PFN_vkEnumerateInstanceExtensionProperties = func.invoke(instance, "vkEnumerateInstanceExtensionProperties");
            PFN_vkEnumerateDeviceExtensionProperties = func.invoke(instance, "vkEnumerateDeviceExtensionProperties");
            PFN_vkEnumerateInstanceLayerProperties = func.invoke(instance, "vkEnumerateInstanceLayerProperties");
            PFN_vkEnumerateDeviceLayerProperties = func.invoke(instance, "vkEnumerateDeviceLayerProperties");
            PFN_vkGetDeviceQueue = func.invoke(instance, "vkGetDeviceQueue");
            PFN_vkQueueSubmit = func.invoke(instance, "vkQueueSubmit");
            PFN_vkQueueWaitIdle = func.invoke(instance, "vkQueueWaitIdle");
            PFN_vkDeviceWaitIdle = func.invoke(instance, "vkDeviceWaitIdle");
            PFN_vkAllocateMemory = func.invoke(instance, "vkAllocateMemory");
            PFN_vkFreeMemory = func.invoke(instance, "vkFreeMemory");
            PFN_vkMapMemory = func.invoke(instance, "vkMapMemory");
            PFN_vkUnmapMemory = func.invoke(instance, "vkUnmapMemory");
            PFN_vkFlushMappedMemoryRanges = func.invoke(instance, "vkFlushMappedMemoryRanges");
            PFN_vkInvalidateMappedMemoryRanges = func.invoke(instance, "vkInvalidateMappedMemoryRanges");
            PFN_vkGetDeviceMemoryCommitment = func.invoke(instance, "vkGetDeviceMemoryCommitment");
            PFN_vkBindBufferMemory = func.invoke(instance, "vkBindBufferMemory");
            PFN_vkBindImageMemory = func.invoke(instance, "vkBindImageMemory");
            PFN_vkGetBufferMemoryRequirements = func.invoke(instance, "vkGetBufferMemoryRequirements");
            PFN_vkGetImageMemoryRequirements = func.invoke(instance, "vkGetImageMemoryRequirements");
            PFN_vkGetImageSparseMemoryRequirements = func.invoke(instance, "vkGetImageSparseMemoryRequirements");
            PFN_vkGetPhysicalDeviceSparseImageFormatProperties = func.invoke(instance, "vkGetPhysicalDeviceSparseImageFormatProperties");
            PFN_vkQueueBindSparse = func.invoke(instance, "vkQueueBindSparse");
            PFN_vkCreateFence = func.invoke(instance, "vkCreateFence");
            PFN_vkDestroyFence = func.invoke(instance, "vkDestroyFence");
            PFN_vkResetFences = func.invoke(instance, "vkResetFences");
            PFN_vkGetFenceStatus = func.invoke(instance, "vkGetFenceStatus");
            PFN_vkWaitForFences = func.invoke(instance, "vkWaitForFences");
            PFN_vkCreateSemaphore = func.invoke(instance, "vkCreateSemaphore");
            PFN_vkDestroySemaphore = func.invoke(instance, "vkDestroySemaphore");
            PFN_vkCreateEvent = func.invoke(instance, "vkCreateEvent");
            PFN_vkDestroyEvent = func.invoke(instance, "vkDestroyEvent");
            PFN_vkGetEventStatus = func.invoke(instance, "vkGetEventStatus");
            PFN_vkSetEvent = func.invoke(instance, "vkSetEvent");
            PFN_vkResetEvent = func.invoke(instance, "vkResetEvent");
            PFN_vkCreateQueryPool = func.invoke(instance, "vkCreateQueryPool");
            PFN_vkDestroyQueryPool = func.invoke(instance, "vkDestroyQueryPool");
            PFN_vkGetQueryPoolResults = func.invoke(instance, "vkGetQueryPoolResults");
            PFN_vkCreateBuffer = func.invoke(instance, "vkCreateBuffer");
            PFN_vkDestroyBuffer = func.invoke(instance, "vkDestroyBuffer");
            PFN_vkCreateBufferView = func.invoke(instance, "vkCreateBufferView");
            PFN_vkDestroyBufferView = func.invoke(instance, "vkDestroyBufferView");
            PFN_vkCreateImage = func.invoke(instance, "vkCreateImage");
            PFN_vkDestroyImage = func.invoke(instance, "vkDestroyImage");
            PFN_vkGetImageSubresourceLayout = func.invoke(instance, "vkGetImageSubresourceLayout");
            PFN_vkCreateImageView = func.invoke(instance, "vkCreateImageView");
            PFN_vkDestroyImageView = func.invoke(instance, "vkDestroyImageView");
            PFN_vkCreateShaderModule = func.invoke(instance, "vkCreateShaderModule");
            PFN_vkDestroyShaderModule = func.invoke(instance, "vkDestroyShaderModule");
            PFN_vkCreatePipelineCache = func.invoke(instance, "vkCreatePipelineCache");
            PFN_vkDestroyPipelineCache = func.invoke(instance, "vkDestroyPipelineCache");
            PFN_vkGetPipelineCacheData = func.invoke(instance, "vkGetPipelineCacheData");
            PFN_vkMergePipelineCaches = func.invoke(instance, "vkMergePipelineCaches");
            PFN_vkCreateGraphicsPipelines = func.invoke(instance, "vkCreateGraphicsPipelines");
            PFN_vkCreateComputePipelines = func.invoke(instance, "vkCreateComputePipelines");
            PFN_vkDestroyPipeline = func.invoke(instance, "vkDestroyPipeline");
            PFN_vkCreatePipelineLayout = func.invoke(instance, "vkCreatePipelineLayout");
            PFN_vkDestroyPipelineLayout = func.invoke(instance, "vkDestroyPipelineLayout");
            PFN_vkCreateSampler = func.invoke(instance, "vkCreateSampler");
            PFN_vkDestroySampler = func.invoke(instance, "vkDestroySampler");
            PFN_vkCreateDescriptorSetLayout = func.invoke(instance, "vkCreateDescriptorSetLayout");
            PFN_vkDestroyDescriptorSetLayout = func.invoke(instance, "vkDestroyDescriptorSetLayout");
            PFN_vkCreateDescriptorPool = func.invoke(instance, "vkCreateDescriptorPool");
            PFN_vkDestroyDescriptorPool = func.invoke(instance, "vkDestroyDescriptorPool");
            PFN_vkResetDescriptorPool = func.invoke(instance, "vkResetDescriptorPool");
            PFN_vkAllocateDescriptorSets = func.invoke(instance, "vkAllocateDescriptorSets");
            PFN_vkFreeDescriptorSets = func.invoke(instance, "vkFreeDescriptorSets");
            PFN_vkUpdateDescriptorSets = func.invoke(instance, "vkUpdateDescriptorSets");
            PFN_vkCreateFramebuffer = func.invoke(instance, "vkCreateFramebuffer");
            PFN_vkDestroyFramebuffer = func.invoke(instance, "vkDestroyFramebuffer");
            PFN_vkCreateRenderPass = func.invoke(instance, "vkCreateRenderPass");
            PFN_vkDestroyRenderPass = func.invoke(instance, "vkDestroyRenderPass");
            PFN_vkGetRenderAreaGranularity = func.invoke(instance, "vkGetRenderAreaGranularity");
            PFN_vkCreateCommandPool = func.invoke(instance, "vkCreateCommandPool");
            PFN_vkDestroyCommandPool = func.invoke(instance, "vkDestroyCommandPool");
            PFN_vkResetCommandPool = func.invoke(instance, "vkResetCommandPool");
            PFN_vkAllocateCommandBuffers = func.invoke(instance, "vkAllocateCommandBuffers");
            PFN_vkFreeCommandBuffers = func.invoke(instance, "vkFreeCommandBuffers");
            PFN_vkBeginCommandBuffer = func.invoke(instance, "vkBeginCommandBuffer");
            PFN_vkEndCommandBuffer = func.invoke(instance, "vkEndCommandBuffer");
            PFN_vkResetCommandBuffer = func.invoke(instance, "vkResetCommandBuffer");
            PFN_vkCmdBindPipeline = func.invoke(instance, "vkCmdBindPipeline");
            PFN_vkCmdSetViewport = func.invoke(instance, "vkCmdSetViewport");
            PFN_vkCmdSetScissor = func.invoke(instance, "vkCmdSetScissor");
            PFN_vkCmdSetLineWidth = func.invoke(instance, "vkCmdSetLineWidth");
            PFN_vkCmdSetDepthBias = func.invoke(instance, "vkCmdSetDepthBias");
            PFN_vkCmdSetBlendConstants = func.invoke(instance, "vkCmdSetBlendConstants");
            PFN_vkCmdSetDepthBounds = func.invoke(instance, "vkCmdSetDepthBounds");
            PFN_vkCmdSetStencilCompareMask = func.invoke(instance, "vkCmdSetStencilCompareMask");
            PFN_vkCmdSetStencilWriteMask = func.invoke(instance, "vkCmdSetStencilWriteMask");
            PFN_vkCmdSetStencilReference = func.invoke(instance, "vkCmdSetStencilReference");
            PFN_vkCmdBindDescriptorSets = func.invoke(instance, "vkCmdBindDescriptorSets");
            PFN_vkCmdBindIndexBuffer = func.invoke(instance, "vkCmdBindIndexBuffer");
            PFN_vkCmdBindVertexBuffers = func.invoke(instance, "vkCmdBindVertexBuffers");
            PFN_vkCmdDraw = func.invoke(instance, "vkCmdDraw");
            PFN_vkCmdDrawIndexed = func.invoke(instance, "vkCmdDrawIndexed");
            PFN_vkCmdDrawIndirect = func.invoke(instance, "vkCmdDrawIndirect");
            PFN_vkCmdDrawIndexedIndirect = func.invoke(instance, "vkCmdDrawIndexedIndirect");
            PFN_vkCmdDispatch = func.invoke(instance, "vkCmdDispatch");
            PFN_vkCmdDispatchIndirect = func.invoke(instance, "vkCmdDispatchIndirect");
            PFN_vkCmdCopyBuffer = func.invoke(instance, "vkCmdCopyBuffer");
            PFN_vkCmdCopyImage = func.invoke(instance, "vkCmdCopyImage");
            PFN_vkCmdBlitImage = func.invoke(instance, "vkCmdBlitImage");
            PFN_vkCmdCopyBufferToImage = func.invoke(instance, "vkCmdCopyBufferToImage");
            PFN_vkCmdCopyImageToBuffer = func.invoke(instance, "vkCmdCopyImageToBuffer");
            PFN_vkCmdUpdateBuffer = func.invoke(instance, "vkCmdUpdateBuffer");
            PFN_vkCmdFillBuffer = func.invoke(instance, "vkCmdFillBuffer");
            PFN_vkCmdClearColorImage = func.invoke(instance, "vkCmdClearColorImage");
            PFN_vkCmdClearDepthStencilImage = func.invoke(instance, "vkCmdClearDepthStencilImage");
            PFN_vkCmdClearAttachments = func.invoke(instance, "vkCmdClearAttachments");
            PFN_vkCmdResolveImage = func.invoke(instance, "vkCmdResolveImage");
            PFN_vkCmdSetEvent = func.invoke(instance, "vkCmdSetEvent");
            PFN_vkCmdResetEvent = func.invoke(instance, "vkCmdResetEvent");
            PFN_vkCmdWaitEvents = func.invoke(instance, "vkCmdWaitEvents");
            PFN_vkCmdPipelineBarrier = func.invoke(instance, "vkCmdPipelineBarrier");
            PFN_vkCmdBeginQuery = func.invoke(instance, "vkCmdBeginQuery");
            PFN_vkCmdEndQuery = func.invoke(instance, "vkCmdEndQuery");
            PFN_vkCmdResetQueryPool = func.invoke(instance, "vkCmdResetQueryPool");
            PFN_vkCmdWriteTimestamp = func.invoke(instance, "vkCmdWriteTimestamp");
            PFN_vkCmdCopyQueryPoolResults = func.invoke(instance, "vkCmdCopyQueryPoolResults");
            PFN_vkCmdPushConstants = func.invoke(instance, "vkCmdPushConstants");
            PFN_vkCmdBeginRenderPass = func.invoke(instance, "vkCmdBeginRenderPass");
            PFN_vkCmdNextSubpass = func.invoke(instance, "vkCmdNextSubpass");
            PFN_vkCmdEndRenderPass = func.invoke(instance, "vkCmdEndRenderPass");
            PFN_vkCmdExecuteCommands = func.invoke(instance, "vkCmdExecuteCommands");
        }
    }

    public VK10(MemorySegment instance, VKLoadFunc func) {
        this.handles = new Handles(instance, func);
    }

    /// ```
    /// VkResult vkCreateInstance(const VkInstanceCreateInfo* pCreateInfo, const VkAllocationCallbacks* pAllocator, VkInstance* pInstance);
    /// ```
    public int CreateInstance(MemorySegment pCreateInfo, MemorySegment pAllocator, MemorySegment pInstance) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCreateInstance)) throw new SymbolNotFoundError("Symbol not found: vkCreateInstance");
        try { return (int) Handles.MH_vkCreateInstance.invokeExact(handles.PFN_vkCreateInstance, pCreateInfo, pAllocator, pInstance); }
        catch (Throwable e) { throw new RuntimeException("error in CreateInstance", e); }
    }

    /// ```
    /// void vkDestroyInstance(VkInstance instance, const VkAllocationCallbacks* pAllocator);
    /// ```
    public void DestroyInstance(MemorySegment instance, MemorySegment pAllocator) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkDestroyInstance)) throw new SymbolNotFoundError("Symbol not found: vkDestroyInstance");
        try { Handles.MH_vkDestroyInstance.invokeExact(handles.PFN_vkDestroyInstance, instance, pAllocator); }
        catch (Throwable e) { throw new RuntimeException("error in DestroyInstance", e); }
    }

    /// ```
    /// VkResult vkEnumeratePhysicalDevices(VkInstance instance, uint32_t* pPhysicalDeviceCount, VkPhysicalDevice* pPhysicalDevices);
    /// ```
    public int EnumeratePhysicalDevices(MemorySegment instance, MemorySegment pPhysicalDeviceCount, MemorySegment pPhysicalDevices) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkEnumeratePhysicalDevices)) throw new SymbolNotFoundError("Symbol not found: vkEnumeratePhysicalDevices");
        try { return (int) Handles.MH_vkEnumeratePhysicalDevices.invokeExact(handles.PFN_vkEnumeratePhysicalDevices, instance, pPhysicalDeviceCount, pPhysicalDevices); }
        catch (Throwable e) { throw new RuntimeException("error in EnumeratePhysicalDevices", e); }
    }

    /// ```
    /// void vkGetPhysicalDeviceFeatures(VkPhysicalDevice physicalDevice, VkPhysicalDeviceFeatures* pFeatures);
    /// ```
    public void GetPhysicalDeviceFeatures(MemorySegment physicalDevice, MemorySegment pFeatures) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkGetPhysicalDeviceFeatures)) throw new SymbolNotFoundError("Symbol not found: vkGetPhysicalDeviceFeatures");
        try { Handles.MH_vkGetPhysicalDeviceFeatures.invokeExact(handles.PFN_vkGetPhysicalDeviceFeatures, physicalDevice, pFeatures); }
        catch (Throwable e) { throw new RuntimeException("error in GetPhysicalDeviceFeatures", e); }
    }

    /// ```
    /// void vkGetPhysicalDeviceFormatProperties(VkPhysicalDevice physicalDevice, VkFormat format, VkFormatProperties* pFormatProperties);
    /// ```
    public void GetPhysicalDeviceFormatProperties(MemorySegment physicalDevice, int format, MemorySegment pFormatProperties) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkGetPhysicalDeviceFormatProperties)) throw new SymbolNotFoundError("Symbol not found: vkGetPhysicalDeviceFormatProperties");
        try { Handles.MH_vkGetPhysicalDeviceFormatProperties.invokeExact(handles.PFN_vkGetPhysicalDeviceFormatProperties, physicalDevice, format, pFormatProperties); }
        catch (Throwable e) { throw new RuntimeException("error in GetPhysicalDeviceFormatProperties", e); }
    }

    /// ```
    /// VkResult vkGetPhysicalDeviceImageFormatProperties(VkPhysicalDevice physicalDevice, VkFormat format, VkImageType type, VkImageTiling tiling, VkImageUsageFlags usage, VkImageCreateFlags flags, VkImageFormatProperties* pImageFormatProperties);
    /// ```
    public int GetPhysicalDeviceImageFormatProperties(MemorySegment physicalDevice, int format, int type, int tiling, int usage, int flags, MemorySegment pImageFormatProperties) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkGetPhysicalDeviceImageFormatProperties)) throw new SymbolNotFoundError("Symbol not found: vkGetPhysicalDeviceImageFormatProperties");
        try { return (int) Handles.MH_vkGetPhysicalDeviceImageFormatProperties.invokeExact(handles.PFN_vkGetPhysicalDeviceImageFormatProperties, physicalDevice, format, type, tiling, usage, flags, pImageFormatProperties); }
        catch (Throwable e) { throw new RuntimeException("error in GetPhysicalDeviceImageFormatProperties", e); }
    }

    /// ```
    /// void vkGetPhysicalDeviceProperties(VkPhysicalDevice physicalDevice, VkPhysicalDeviceProperties* pProperties);
    /// ```
    public void GetPhysicalDeviceProperties(MemorySegment physicalDevice, MemorySegment pProperties) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkGetPhysicalDeviceProperties)) throw new SymbolNotFoundError("Symbol not found: vkGetPhysicalDeviceProperties");
        try { Handles.MH_vkGetPhysicalDeviceProperties.invokeExact(handles.PFN_vkGetPhysicalDeviceProperties, physicalDevice, pProperties); }
        catch (Throwable e) { throw new RuntimeException("error in GetPhysicalDeviceProperties", e); }
    }

    /// ```
    /// void vkGetPhysicalDeviceQueueFamilyProperties(VkPhysicalDevice physicalDevice, uint32_t* pQueueFamilyPropertyCount, VkQueueFamilyProperties* pQueueFamilyProperties);
    /// ```
    public void GetPhysicalDeviceQueueFamilyProperties(MemorySegment physicalDevice, MemorySegment pQueueFamilyPropertyCount, MemorySegment pQueueFamilyProperties) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkGetPhysicalDeviceQueueFamilyProperties)) throw new SymbolNotFoundError("Symbol not found: vkGetPhysicalDeviceQueueFamilyProperties");
        try { Handles.MH_vkGetPhysicalDeviceQueueFamilyProperties.invokeExact(handles.PFN_vkGetPhysicalDeviceQueueFamilyProperties, physicalDevice, pQueueFamilyPropertyCount, pQueueFamilyProperties); }
        catch (Throwable e) { throw new RuntimeException("error in GetPhysicalDeviceQueueFamilyProperties", e); }
    }

    /// ```
    /// void vkGetPhysicalDeviceMemoryProperties(VkPhysicalDevice physicalDevice, VkPhysicalDeviceMemoryProperties* pMemoryProperties);
    /// ```
    public void GetPhysicalDeviceMemoryProperties(MemorySegment physicalDevice, MemorySegment pMemoryProperties) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkGetPhysicalDeviceMemoryProperties)) throw new SymbolNotFoundError("Symbol not found: vkGetPhysicalDeviceMemoryProperties");
        try { Handles.MH_vkGetPhysicalDeviceMemoryProperties.invokeExact(handles.PFN_vkGetPhysicalDeviceMemoryProperties, physicalDevice, pMemoryProperties); }
        catch (Throwable e) { throw new RuntimeException("error in GetPhysicalDeviceMemoryProperties", e); }
    }

    /// ```
    /// PFN_vkVoidFunction vkGetInstanceProcAddr(VkInstance instance, const char* pName);
    /// ```
    public MemorySegment GetInstanceProcAddr(MemorySegment instance, MemorySegment pName) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkGetInstanceProcAddr)) throw new SymbolNotFoundError("Symbol not found: vkGetInstanceProcAddr");
        try { return (MemorySegment) Handles.MH_vkGetInstanceProcAddr.invokeExact(handles.PFN_vkGetInstanceProcAddr, instance, pName); }
        catch (Throwable e) { throw new RuntimeException("error in GetInstanceProcAddr", e); }
    }

    /// ```
    /// PFN_vkVoidFunction vkGetDeviceProcAddr(VkDevice device, const char* pName);
    /// ```
    public MemorySegment GetDeviceProcAddr(MemorySegment device, MemorySegment pName) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkGetDeviceProcAddr)) throw new SymbolNotFoundError("Symbol not found: vkGetDeviceProcAddr");
        try { return (MemorySegment) Handles.MH_vkGetDeviceProcAddr.invokeExact(handles.PFN_vkGetDeviceProcAddr, device, pName); }
        catch (Throwable e) { throw new RuntimeException("error in GetDeviceProcAddr", e); }
    }

    /// ```
    /// VkResult vkCreateDevice(VkPhysicalDevice physicalDevice, const VkDeviceCreateInfo* pCreateInfo, const VkAllocationCallbacks* pAllocator, VkDevice* pDevice);
    /// ```
    public int CreateDevice(MemorySegment physicalDevice, MemorySegment pCreateInfo, MemorySegment pAllocator, MemorySegment pDevice) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCreateDevice)) throw new SymbolNotFoundError("Symbol not found: vkCreateDevice");
        try { return (int) Handles.MH_vkCreateDevice.invokeExact(handles.PFN_vkCreateDevice, physicalDevice, pCreateInfo, pAllocator, pDevice); }
        catch (Throwable e) { throw new RuntimeException("error in CreateDevice", e); }
    }

    /// ```
    /// void vkDestroyDevice(VkDevice device, const VkAllocationCallbacks* pAllocator);
    /// ```
    public void DestroyDevice(MemorySegment device, MemorySegment pAllocator) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkDestroyDevice)) throw new SymbolNotFoundError("Symbol not found: vkDestroyDevice");
        try { Handles.MH_vkDestroyDevice.invokeExact(handles.PFN_vkDestroyDevice, device, pAllocator); }
        catch (Throwable e) { throw new RuntimeException("error in DestroyDevice", e); }
    }

    /// ```
    /// VkResult vkEnumerateInstanceExtensionProperties(const char* pLayerName, uint32_t* pPropertyCount, VkExtensionProperties* pProperties);
    /// ```
    public int EnumerateInstanceExtensionProperties(MemorySegment pLayerName, MemorySegment pPropertyCount, MemorySegment pProperties) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkEnumerateInstanceExtensionProperties)) throw new SymbolNotFoundError("Symbol not found: vkEnumerateInstanceExtensionProperties");
        try { return (int) Handles.MH_vkEnumerateInstanceExtensionProperties.invokeExact(handles.PFN_vkEnumerateInstanceExtensionProperties, pLayerName, pPropertyCount, pProperties); }
        catch (Throwable e) { throw new RuntimeException("error in EnumerateInstanceExtensionProperties", e); }
    }

    /// ```
    /// VkResult vkEnumerateDeviceExtensionProperties(VkPhysicalDevice physicalDevice, const char* pLayerName, uint32_t* pPropertyCount, VkExtensionProperties* pProperties);
    /// ```
    public int EnumerateDeviceExtensionProperties(MemorySegment physicalDevice, MemorySegment pLayerName, MemorySegment pPropertyCount, MemorySegment pProperties) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkEnumerateDeviceExtensionProperties)) throw new SymbolNotFoundError("Symbol not found: vkEnumerateDeviceExtensionProperties");
        try { return (int) Handles.MH_vkEnumerateDeviceExtensionProperties.invokeExact(handles.PFN_vkEnumerateDeviceExtensionProperties, physicalDevice, pLayerName, pPropertyCount, pProperties); }
        catch (Throwable e) { throw new RuntimeException("error in EnumerateDeviceExtensionProperties", e); }
    }

    /// ```
    /// VkResult vkEnumerateInstanceLayerProperties(uint32_t* pPropertyCount, VkLayerProperties* pProperties);
    /// ```
    public int EnumerateInstanceLayerProperties(MemorySegment pPropertyCount, MemorySegment pProperties) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkEnumerateInstanceLayerProperties)) throw new SymbolNotFoundError("Symbol not found: vkEnumerateInstanceLayerProperties");
        try { return (int) Handles.MH_vkEnumerateInstanceLayerProperties.invokeExact(handles.PFN_vkEnumerateInstanceLayerProperties, pPropertyCount, pProperties); }
        catch (Throwable e) { throw new RuntimeException("error in EnumerateInstanceLayerProperties", e); }
    }

    /// ```
    /// VkResult vkEnumerateDeviceLayerProperties(VkPhysicalDevice physicalDevice, uint32_t* pPropertyCount, VkLayerProperties* pProperties);
    /// ```
    public int EnumerateDeviceLayerProperties(MemorySegment physicalDevice, MemorySegment pPropertyCount, MemorySegment pProperties) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkEnumerateDeviceLayerProperties)) throw new SymbolNotFoundError("Symbol not found: vkEnumerateDeviceLayerProperties");
        try { return (int) Handles.MH_vkEnumerateDeviceLayerProperties.invokeExact(handles.PFN_vkEnumerateDeviceLayerProperties, physicalDevice, pPropertyCount, pProperties); }
        catch (Throwable e) { throw new RuntimeException("error in EnumerateDeviceLayerProperties", e); }
    }

    /// ```
    /// void vkGetDeviceQueue(VkDevice device, uint32_t queueFamilyIndex, uint32_t queueIndex, VkQueue* pQueue);
    /// ```
    public void GetDeviceQueue(MemorySegment device, int queueFamilyIndex, int queueIndex, MemorySegment pQueue) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkGetDeviceQueue)) throw new SymbolNotFoundError("Symbol not found: vkGetDeviceQueue");
        try { Handles.MH_vkGetDeviceQueue.invokeExact(handles.PFN_vkGetDeviceQueue, device, queueFamilyIndex, queueIndex, pQueue); }
        catch (Throwable e) { throw new RuntimeException("error in GetDeviceQueue", e); }
    }

    /// ```
    /// VkResult vkQueueSubmit(VkQueue queue, uint32_t submitCount, const VkSubmitInfo* pSubmits, VkFence fence);
    /// ```
    public int QueueSubmit(MemorySegment queue, int submitCount, MemorySegment pSubmits, long fence) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkQueueSubmit)) throw new SymbolNotFoundError("Symbol not found: vkQueueSubmit");
        try { return (int) Handles.MH_vkQueueSubmit.invokeExact(handles.PFN_vkQueueSubmit, queue, submitCount, pSubmits, fence); }
        catch (Throwable e) { throw new RuntimeException("error in QueueSubmit", e); }
    }

    /// ```
    /// VkResult vkQueueWaitIdle(VkQueue queue);
    /// ```
    public int QueueWaitIdle(MemorySegment queue) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkQueueWaitIdle)) throw new SymbolNotFoundError("Symbol not found: vkQueueWaitIdle");
        try { return (int) Handles.MH_vkQueueWaitIdle.invokeExact(handles.PFN_vkQueueWaitIdle, queue); }
        catch (Throwable e) { throw new RuntimeException("error in QueueWaitIdle", e); }
    }

    /// ```
    /// VkResult vkDeviceWaitIdle(VkDevice device);
    /// ```
    public int DeviceWaitIdle(MemorySegment device) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkDeviceWaitIdle)) throw new SymbolNotFoundError("Symbol not found: vkDeviceWaitIdle");
        try { return (int) Handles.MH_vkDeviceWaitIdle.invokeExact(handles.PFN_vkDeviceWaitIdle, device); }
        catch (Throwable e) { throw new RuntimeException("error in DeviceWaitIdle", e); }
    }

    /// ```
    /// VkResult vkAllocateMemory(VkDevice device, const VkMemoryAllocateInfo* pAllocateInfo, const VkAllocationCallbacks* pAllocator, VkDeviceMemory* pMemory);
    /// ```
    public int AllocateMemory(MemorySegment device, MemorySegment pAllocateInfo, MemorySegment pAllocator, MemorySegment pMemory) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkAllocateMemory)) throw new SymbolNotFoundError("Symbol not found: vkAllocateMemory");
        try { return (int) Handles.MH_vkAllocateMemory.invokeExact(handles.PFN_vkAllocateMemory, device, pAllocateInfo, pAllocator, pMemory); }
        catch (Throwable e) { throw new RuntimeException("error in AllocateMemory", e); }
    }

    /// ```
    /// void vkFreeMemory(VkDevice device, VkDeviceMemory memory, const VkAllocationCallbacks* pAllocator);
    /// ```
    public void FreeMemory(MemorySegment device, long memory, MemorySegment pAllocator) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkFreeMemory)) throw new SymbolNotFoundError("Symbol not found: vkFreeMemory");
        try { Handles.MH_vkFreeMemory.invokeExact(handles.PFN_vkFreeMemory, device, memory, pAllocator); }
        catch (Throwable e) { throw new RuntimeException("error in FreeMemory", e); }
    }

    /// ```
    /// VkResult vkMapMemory(VkDevice device, VkDeviceMemory memory, VkDeviceSize offset, VkDeviceSize size, VkMemoryMapFlags flags, void** ppData);
    /// ```
    public int MapMemory(MemorySegment device, long memory, long offset, long size, int flags, MemorySegment ppData) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkMapMemory)) throw new SymbolNotFoundError("Symbol not found: vkMapMemory");
        try { return (int) Handles.MH_vkMapMemory.invokeExact(handles.PFN_vkMapMemory, device, memory, offset, size, flags, ppData); }
        catch (Throwable e) { throw new RuntimeException("error in MapMemory", e); }
    }

    /// ```
    /// void vkUnmapMemory(VkDevice device, VkDeviceMemory memory);
    /// ```
    public void UnmapMemory(MemorySegment device, long memory) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkUnmapMemory)) throw new SymbolNotFoundError("Symbol not found: vkUnmapMemory");
        try { Handles.MH_vkUnmapMemory.invokeExact(handles.PFN_vkUnmapMemory, device, memory); }
        catch (Throwable e) { throw new RuntimeException("error in UnmapMemory", e); }
    }

    /// ```
    /// VkResult vkFlushMappedMemoryRanges(VkDevice device, uint32_t memoryRangeCount, const VkMappedMemoryRange* pMemoryRanges);
    /// ```
    public int FlushMappedMemoryRanges(MemorySegment device, int memoryRangeCount, MemorySegment pMemoryRanges) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkFlushMappedMemoryRanges)) throw new SymbolNotFoundError("Symbol not found: vkFlushMappedMemoryRanges");
        try { return (int) Handles.MH_vkFlushMappedMemoryRanges.invokeExact(handles.PFN_vkFlushMappedMemoryRanges, device, memoryRangeCount, pMemoryRanges); }
        catch (Throwable e) { throw new RuntimeException("error in FlushMappedMemoryRanges", e); }
    }

    /// ```
    /// VkResult vkInvalidateMappedMemoryRanges(VkDevice device, uint32_t memoryRangeCount, const VkMappedMemoryRange* pMemoryRanges);
    /// ```
    public int InvalidateMappedMemoryRanges(MemorySegment device, int memoryRangeCount, MemorySegment pMemoryRanges) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkInvalidateMappedMemoryRanges)) throw new SymbolNotFoundError("Symbol not found: vkInvalidateMappedMemoryRanges");
        try { return (int) Handles.MH_vkInvalidateMappedMemoryRanges.invokeExact(handles.PFN_vkInvalidateMappedMemoryRanges, device, memoryRangeCount, pMemoryRanges); }
        catch (Throwable e) { throw new RuntimeException("error in InvalidateMappedMemoryRanges", e); }
    }

    /// ```
    /// void vkGetDeviceMemoryCommitment(VkDevice device, VkDeviceMemory memory, VkDeviceSize* pCommittedMemoryInBytes);
    /// ```
    public void GetDeviceMemoryCommitment(MemorySegment device, long memory, MemorySegment pCommittedMemoryInBytes) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkGetDeviceMemoryCommitment)) throw new SymbolNotFoundError("Symbol not found: vkGetDeviceMemoryCommitment");
        try { Handles.MH_vkGetDeviceMemoryCommitment.invokeExact(handles.PFN_vkGetDeviceMemoryCommitment, device, memory, pCommittedMemoryInBytes); }
        catch (Throwable e) { throw new RuntimeException("error in GetDeviceMemoryCommitment", e); }
    }

    /// ```
    /// VkResult vkBindBufferMemory(VkDevice device, VkBuffer buffer, VkDeviceMemory memory, VkDeviceSize memoryOffset);
    /// ```
    public int BindBufferMemory(MemorySegment device, long buffer, long memory, long memoryOffset) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkBindBufferMemory)) throw new SymbolNotFoundError("Symbol not found: vkBindBufferMemory");
        try { return (int) Handles.MH_vkBindBufferMemory.invokeExact(handles.PFN_vkBindBufferMemory, device, buffer, memory, memoryOffset); }
        catch (Throwable e) { throw new RuntimeException("error in BindBufferMemory", e); }
    }

    /// ```
    /// VkResult vkBindImageMemory(VkDevice device, VkImage image, VkDeviceMemory memory, VkDeviceSize memoryOffset);
    /// ```
    public int BindImageMemory(MemorySegment device, long image, long memory, long memoryOffset) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkBindImageMemory)) throw new SymbolNotFoundError("Symbol not found: vkBindImageMemory");
        try { return (int) Handles.MH_vkBindImageMemory.invokeExact(handles.PFN_vkBindImageMemory, device, image, memory, memoryOffset); }
        catch (Throwable e) { throw new RuntimeException("error in BindImageMemory", e); }
    }

    /// ```
    /// void vkGetBufferMemoryRequirements(VkDevice device, VkBuffer buffer, VkMemoryRequirements* pMemoryRequirements);
    /// ```
    public void GetBufferMemoryRequirements(MemorySegment device, long buffer, MemorySegment pMemoryRequirements) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkGetBufferMemoryRequirements)) throw new SymbolNotFoundError("Symbol not found: vkGetBufferMemoryRequirements");
        try { Handles.MH_vkGetBufferMemoryRequirements.invokeExact(handles.PFN_vkGetBufferMemoryRequirements, device, buffer, pMemoryRequirements); }
        catch (Throwable e) { throw new RuntimeException("error in GetBufferMemoryRequirements", e); }
    }

    /// ```
    /// void vkGetImageMemoryRequirements(VkDevice device, VkImage image, VkMemoryRequirements* pMemoryRequirements);
    /// ```
    public void GetImageMemoryRequirements(MemorySegment device, long image, MemorySegment pMemoryRequirements) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkGetImageMemoryRequirements)) throw new SymbolNotFoundError("Symbol not found: vkGetImageMemoryRequirements");
        try { Handles.MH_vkGetImageMemoryRequirements.invokeExact(handles.PFN_vkGetImageMemoryRequirements, device, image, pMemoryRequirements); }
        catch (Throwable e) { throw new RuntimeException("error in GetImageMemoryRequirements", e); }
    }

    /// ```
    /// void vkGetImageSparseMemoryRequirements(VkDevice device, VkImage image, uint32_t* pSparseMemoryRequirementCount, VkSparseImageMemoryRequirements* pSparseMemoryRequirements);
    /// ```
    public void GetImageSparseMemoryRequirements(MemorySegment device, long image, MemorySegment pSparseMemoryRequirementCount, MemorySegment pSparseMemoryRequirements) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkGetImageSparseMemoryRequirements)) throw new SymbolNotFoundError("Symbol not found: vkGetImageSparseMemoryRequirements");
        try { Handles.MH_vkGetImageSparseMemoryRequirements.invokeExact(handles.PFN_vkGetImageSparseMemoryRequirements, device, image, pSparseMemoryRequirementCount, pSparseMemoryRequirements); }
        catch (Throwable e) { throw new RuntimeException("error in GetImageSparseMemoryRequirements", e); }
    }

    /// ```
    /// void vkGetPhysicalDeviceSparseImageFormatProperties(VkPhysicalDevice physicalDevice, VkFormat format, VkImageType type, VkSampleCountFlagBits samples, VkImageUsageFlags usage, VkImageTiling tiling, uint32_t* pPropertyCount, VkSparseImageFormatProperties* pProperties);
    /// ```
    public void GetPhysicalDeviceSparseImageFormatProperties(MemorySegment physicalDevice, int format, int type, int samples, int usage, int tiling, MemorySegment pPropertyCount, MemorySegment pProperties) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkGetPhysicalDeviceSparseImageFormatProperties)) throw new SymbolNotFoundError("Symbol not found: vkGetPhysicalDeviceSparseImageFormatProperties");
        try { Handles.MH_vkGetPhysicalDeviceSparseImageFormatProperties.invokeExact(handles.PFN_vkGetPhysicalDeviceSparseImageFormatProperties, physicalDevice, format, type, samples, usage, tiling, pPropertyCount, pProperties); }
        catch (Throwable e) { throw new RuntimeException("error in GetPhysicalDeviceSparseImageFormatProperties", e); }
    }

    /// ```
    /// VkResult vkQueueBindSparse(VkQueue queue, uint32_t bindInfoCount, const VkBindSparseInfo* pBindInfo, VkFence fence);
    /// ```
    public int QueueBindSparse(MemorySegment queue, int bindInfoCount, MemorySegment pBindInfo, long fence) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkQueueBindSparse)) throw new SymbolNotFoundError("Symbol not found: vkQueueBindSparse");
        try { return (int) Handles.MH_vkQueueBindSparse.invokeExact(handles.PFN_vkQueueBindSparse, queue, bindInfoCount, pBindInfo, fence); }
        catch (Throwable e) { throw new RuntimeException("error in QueueBindSparse", e); }
    }

    /// ```
    /// VkResult vkCreateFence(VkDevice device, const VkFenceCreateInfo* pCreateInfo, const VkAllocationCallbacks* pAllocator, VkFence* pFence);
    /// ```
    public int CreateFence(MemorySegment device, MemorySegment pCreateInfo, MemorySegment pAllocator, MemorySegment pFence) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCreateFence)) throw new SymbolNotFoundError("Symbol not found: vkCreateFence");
        try { return (int) Handles.MH_vkCreateFence.invokeExact(handles.PFN_vkCreateFence, device, pCreateInfo, pAllocator, pFence); }
        catch (Throwable e) { throw new RuntimeException("error in CreateFence", e); }
    }

    /// ```
    /// void vkDestroyFence(VkDevice device, VkFence fence, const VkAllocationCallbacks* pAllocator);
    /// ```
    public void DestroyFence(MemorySegment device, long fence, MemorySegment pAllocator) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkDestroyFence)) throw new SymbolNotFoundError("Symbol not found: vkDestroyFence");
        try { Handles.MH_vkDestroyFence.invokeExact(handles.PFN_vkDestroyFence, device, fence, pAllocator); }
        catch (Throwable e) { throw new RuntimeException("error in DestroyFence", e); }
    }

    /// ```
    /// VkResult vkResetFences(VkDevice device, uint32_t fenceCount, const VkFence* pFences);
    /// ```
    public int ResetFences(MemorySegment device, int fenceCount, MemorySegment pFences) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkResetFences)) throw new SymbolNotFoundError("Symbol not found: vkResetFences");
        try { return (int) Handles.MH_vkResetFences.invokeExact(handles.PFN_vkResetFences, device, fenceCount, pFences); }
        catch (Throwable e) { throw new RuntimeException("error in ResetFences", e); }
    }

    /// ```
    /// VkResult vkGetFenceStatus(VkDevice device, VkFence fence);
    /// ```
    public int GetFenceStatus(MemorySegment device, long fence) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkGetFenceStatus)) throw new SymbolNotFoundError("Symbol not found: vkGetFenceStatus");
        try { return (int) Handles.MH_vkGetFenceStatus.invokeExact(handles.PFN_vkGetFenceStatus, device, fence); }
        catch (Throwable e) { throw new RuntimeException("error in GetFenceStatus", e); }
    }

    /// ```
    /// VkResult vkWaitForFences(VkDevice device, uint32_t fenceCount, const VkFence* pFences, VkBool32 waitAll, uint64_t timeout);
    /// ```
    public int WaitForFences(MemorySegment device, int fenceCount, MemorySegment pFences, int waitAll, long timeout) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkWaitForFences)) throw new SymbolNotFoundError("Symbol not found: vkWaitForFences");
        try { return (int) Handles.MH_vkWaitForFences.invokeExact(handles.PFN_vkWaitForFences, device, fenceCount, pFences, waitAll, timeout); }
        catch (Throwable e) { throw new RuntimeException("error in WaitForFences", e); }
    }

    /// ```
    /// VkResult vkCreateSemaphore(VkDevice device, const VkSemaphoreCreateInfo* pCreateInfo, const VkAllocationCallbacks* pAllocator, VkSemaphore* pSemaphore);
    /// ```
    public int CreateSemaphore(MemorySegment device, MemorySegment pCreateInfo, MemorySegment pAllocator, MemorySegment pSemaphore) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCreateSemaphore)) throw new SymbolNotFoundError("Symbol not found: vkCreateSemaphore");
        try { return (int) Handles.MH_vkCreateSemaphore.invokeExact(handles.PFN_vkCreateSemaphore, device, pCreateInfo, pAllocator, pSemaphore); }
        catch (Throwable e) { throw new RuntimeException("error in CreateSemaphore", e); }
    }

    /// ```
    /// void vkDestroySemaphore(VkDevice device, VkSemaphore semaphore, const VkAllocationCallbacks* pAllocator);
    /// ```
    public void DestroySemaphore(MemorySegment device, long semaphore, MemorySegment pAllocator) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkDestroySemaphore)) throw new SymbolNotFoundError("Symbol not found: vkDestroySemaphore");
        try { Handles.MH_vkDestroySemaphore.invokeExact(handles.PFN_vkDestroySemaphore, device, semaphore, pAllocator); }
        catch (Throwable e) { throw new RuntimeException("error in DestroySemaphore", e); }
    }

    /// ```
    /// VkResult vkCreateEvent(VkDevice device, const VkEventCreateInfo* pCreateInfo, const VkAllocationCallbacks* pAllocator, VkEvent* pEvent);
    /// ```
    public int CreateEvent(MemorySegment device, MemorySegment pCreateInfo, MemorySegment pAllocator, MemorySegment pEvent) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCreateEvent)) throw new SymbolNotFoundError("Symbol not found: vkCreateEvent");
        try { return (int) Handles.MH_vkCreateEvent.invokeExact(handles.PFN_vkCreateEvent, device, pCreateInfo, pAllocator, pEvent); }
        catch (Throwable e) { throw new RuntimeException("error in CreateEvent", e); }
    }

    /// ```
    /// void vkDestroyEvent(VkDevice device, VkEvent event, const VkAllocationCallbacks* pAllocator);
    /// ```
    public void DestroyEvent(MemorySegment device, long event, MemorySegment pAllocator) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkDestroyEvent)) throw new SymbolNotFoundError("Symbol not found: vkDestroyEvent");
        try { Handles.MH_vkDestroyEvent.invokeExact(handles.PFN_vkDestroyEvent, device, event, pAllocator); }
        catch (Throwable e) { throw new RuntimeException("error in DestroyEvent", e); }
    }

    /// ```
    /// VkResult vkGetEventStatus(VkDevice device, VkEvent event);
    /// ```
    public int GetEventStatus(MemorySegment device, long event) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkGetEventStatus)) throw new SymbolNotFoundError("Symbol not found: vkGetEventStatus");
        try { return (int) Handles.MH_vkGetEventStatus.invokeExact(handles.PFN_vkGetEventStatus, device, event); }
        catch (Throwable e) { throw new RuntimeException("error in GetEventStatus", e); }
    }

    /// ```
    /// VkResult vkSetEvent(VkDevice device, VkEvent event);
    /// ```
    public int SetEvent(MemorySegment device, long event) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkSetEvent)) throw new SymbolNotFoundError("Symbol not found: vkSetEvent");
        try { return (int) Handles.MH_vkSetEvent.invokeExact(handles.PFN_vkSetEvent, device, event); }
        catch (Throwable e) { throw new RuntimeException("error in SetEvent", e); }
    }

    /// ```
    /// VkResult vkResetEvent(VkDevice device, VkEvent event);
    /// ```
    public int ResetEvent(MemorySegment device, long event) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkResetEvent)) throw new SymbolNotFoundError("Symbol not found: vkResetEvent");
        try { return (int) Handles.MH_vkResetEvent.invokeExact(handles.PFN_vkResetEvent, device, event); }
        catch (Throwable e) { throw new RuntimeException("error in ResetEvent", e); }
    }

    /// ```
    /// VkResult vkCreateQueryPool(VkDevice device, const VkQueryPoolCreateInfo* pCreateInfo, const VkAllocationCallbacks* pAllocator, VkQueryPool* pQueryPool);
    /// ```
    public int CreateQueryPool(MemorySegment device, MemorySegment pCreateInfo, MemorySegment pAllocator, MemorySegment pQueryPool) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCreateQueryPool)) throw new SymbolNotFoundError("Symbol not found: vkCreateQueryPool");
        try { return (int) Handles.MH_vkCreateQueryPool.invokeExact(handles.PFN_vkCreateQueryPool, device, pCreateInfo, pAllocator, pQueryPool); }
        catch (Throwable e) { throw new RuntimeException("error in CreateQueryPool", e); }
    }

    /// ```
    /// void vkDestroyQueryPool(VkDevice device, VkQueryPool queryPool, const VkAllocationCallbacks* pAllocator);
    /// ```
    public void DestroyQueryPool(MemorySegment device, long queryPool, MemorySegment pAllocator) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkDestroyQueryPool)) throw new SymbolNotFoundError("Symbol not found: vkDestroyQueryPool");
        try { Handles.MH_vkDestroyQueryPool.invokeExact(handles.PFN_vkDestroyQueryPool, device, queryPool, pAllocator); }
        catch (Throwable e) { throw new RuntimeException("error in DestroyQueryPool", e); }
    }

    /// ```
    /// VkResult vkGetQueryPoolResults(VkDevice device, VkQueryPool queryPool, uint32_t firstQuery, uint32_t queryCount, size_t dataSize, void* pData, VkDeviceSize stride, VkQueryResultFlags flags);
    /// ```
    public int GetQueryPoolResults(MemorySegment device, long queryPool, int firstQuery, int queryCount, long dataSize, MemorySegment pData, long stride, int flags) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkGetQueryPoolResults)) throw new SymbolNotFoundError("Symbol not found: vkGetQueryPoolResults");
        try { return (int) Handles.MH_vkGetQueryPoolResults.invoke(handles.PFN_vkGetQueryPoolResults, device, queryPool, firstQuery, queryCount, MemoryUtil.narrowingLong(CanonicalTypes.SIZE_T, dataSize), pData, stride, flags); }
        catch (Throwable e) { throw new RuntimeException("error in GetQueryPoolResults", e); }
    }

    /// ```
    /// VkResult vkCreateBuffer(VkDevice device, const VkBufferCreateInfo* pCreateInfo, const VkAllocationCallbacks* pAllocator, VkBuffer* pBuffer);
    /// ```
    public int CreateBuffer(MemorySegment device, MemorySegment pCreateInfo, MemorySegment pAllocator, MemorySegment pBuffer) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCreateBuffer)) throw new SymbolNotFoundError("Symbol not found: vkCreateBuffer");
        try { return (int) Handles.MH_vkCreateBuffer.invokeExact(handles.PFN_vkCreateBuffer, device, pCreateInfo, pAllocator, pBuffer); }
        catch (Throwable e) { throw new RuntimeException("error in CreateBuffer", e); }
    }

    /// ```
    /// void vkDestroyBuffer(VkDevice device, VkBuffer buffer, const VkAllocationCallbacks* pAllocator);
    /// ```
    public void DestroyBuffer(MemorySegment device, long buffer, MemorySegment pAllocator) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkDestroyBuffer)) throw new SymbolNotFoundError("Symbol not found: vkDestroyBuffer");
        try { Handles.MH_vkDestroyBuffer.invokeExact(handles.PFN_vkDestroyBuffer, device, buffer, pAllocator); }
        catch (Throwable e) { throw new RuntimeException("error in DestroyBuffer", e); }
    }

    /// ```
    /// VkResult vkCreateBufferView(VkDevice device, const VkBufferViewCreateInfo* pCreateInfo, const VkAllocationCallbacks* pAllocator, VkBufferView* pView);
    /// ```
    public int CreateBufferView(MemorySegment device, MemorySegment pCreateInfo, MemorySegment pAllocator, MemorySegment pView) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCreateBufferView)) throw new SymbolNotFoundError("Symbol not found: vkCreateBufferView");
        try { return (int) Handles.MH_vkCreateBufferView.invokeExact(handles.PFN_vkCreateBufferView, device, pCreateInfo, pAllocator, pView); }
        catch (Throwable e) { throw new RuntimeException("error in CreateBufferView", e); }
    }

    /// ```
    /// void vkDestroyBufferView(VkDevice device, VkBufferView bufferView, const VkAllocationCallbacks* pAllocator);
    /// ```
    public void DestroyBufferView(MemorySegment device, long bufferView, MemorySegment pAllocator) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkDestroyBufferView)) throw new SymbolNotFoundError("Symbol not found: vkDestroyBufferView");
        try { Handles.MH_vkDestroyBufferView.invokeExact(handles.PFN_vkDestroyBufferView, device, bufferView, pAllocator); }
        catch (Throwable e) { throw new RuntimeException("error in DestroyBufferView", e); }
    }

    /// ```
    /// VkResult vkCreateImage(VkDevice device, const VkImageCreateInfo* pCreateInfo, const VkAllocationCallbacks* pAllocator, VkImage* pImage);
    /// ```
    public int CreateImage(MemorySegment device, MemorySegment pCreateInfo, MemorySegment pAllocator, MemorySegment pImage) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCreateImage)) throw new SymbolNotFoundError("Symbol not found: vkCreateImage");
        try { return (int) Handles.MH_vkCreateImage.invokeExact(handles.PFN_vkCreateImage, device, pCreateInfo, pAllocator, pImage); }
        catch (Throwable e) { throw new RuntimeException("error in CreateImage", e); }
    }

    /// ```
    /// void vkDestroyImage(VkDevice device, VkImage image, const VkAllocationCallbacks* pAllocator);
    /// ```
    public void DestroyImage(MemorySegment device, long image, MemorySegment pAllocator) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkDestroyImage)) throw new SymbolNotFoundError("Symbol not found: vkDestroyImage");
        try { Handles.MH_vkDestroyImage.invokeExact(handles.PFN_vkDestroyImage, device, image, pAllocator); }
        catch (Throwable e) { throw new RuntimeException("error in DestroyImage", e); }
    }

    /// ```
    /// void vkGetImageSubresourceLayout(VkDevice device, VkImage image, const VkImageSubresource* pSubresource, VkSubresourceLayout* pLayout);
    /// ```
    public void GetImageSubresourceLayout(MemorySegment device, long image, MemorySegment pSubresource, MemorySegment pLayout) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkGetImageSubresourceLayout)) throw new SymbolNotFoundError("Symbol not found: vkGetImageSubresourceLayout");
        try { Handles.MH_vkGetImageSubresourceLayout.invokeExact(handles.PFN_vkGetImageSubresourceLayout, device, image, pSubresource, pLayout); }
        catch (Throwable e) { throw new RuntimeException("error in GetImageSubresourceLayout", e); }
    }

    /// ```
    /// VkResult vkCreateImageView(VkDevice device, const VkImageViewCreateInfo* pCreateInfo, const VkAllocationCallbacks* pAllocator, VkImageView* pView);
    /// ```
    public int CreateImageView(MemorySegment device, MemorySegment pCreateInfo, MemorySegment pAllocator, MemorySegment pView) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCreateImageView)) throw new SymbolNotFoundError("Symbol not found: vkCreateImageView");
        try { return (int) Handles.MH_vkCreateImageView.invokeExact(handles.PFN_vkCreateImageView, device, pCreateInfo, pAllocator, pView); }
        catch (Throwable e) { throw new RuntimeException("error in CreateImageView", e); }
    }

    /// ```
    /// void vkDestroyImageView(VkDevice device, VkImageView imageView, const VkAllocationCallbacks* pAllocator);
    /// ```
    public void DestroyImageView(MemorySegment device, long imageView, MemorySegment pAllocator) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkDestroyImageView)) throw new SymbolNotFoundError("Symbol not found: vkDestroyImageView");
        try { Handles.MH_vkDestroyImageView.invokeExact(handles.PFN_vkDestroyImageView, device, imageView, pAllocator); }
        catch (Throwable e) { throw new RuntimeException("error in DestroyImageView", e); }
    }

    /// ```
    /// VkResult vkCreateShaderModule(VkDevice device, const VkShaderModuleCreateInfo* pCreateInfo, const VkAllocationCallbacks* pAllocator, VkShaderModule* pShaderModule);
    /// ```
    public int CreateShaderModule(MemorySegment device, MemorySegment pCreateInfo, MemorySegment pAllocator, MemorySegment pShaderModule) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCreateShaderModule)) throw new SymbolNotFoundError("Symbol not found: vkCreateShaderModule");
        try { return (int) Handles.MH_vkCreateShaderModule.invokeExact(handles.PFN_vkCreateShaderModule, device, pCreateInfo, pAllocator, pShaderModule); }
        catch (Throwable e) { throw new RuntimeException("error in CreateShaderModule", e); }
    }

    /// ```
    /// void vkDestroyShaderModule(VkDevice device, VkShaderModule shaderModule, const VkAllocationCallbacks* pAllocator);
    /// ```
    public void DestroyShaderModule(MemorySegment device, long shaderModule, MemorySegment pAllocator) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkDestroyShaderModule)) throw new SymbolNotFoundError("Symbol not found: vkDestroyShaderModule");
        try { Handles.MH_vkDestroyShaderModule.invokeExact(handles.PFN_vkDestroyShaderModule, device, shaderModule, pAllocator); }
        catch (Throwable e) { throw new RuntimeException("error in DestroyShaderModule", e); }
    }

    /// ```
    /// VkResult vkCreatePipelineCache(VkDevice device, const VkPipelineCacheCreateInfo* pCreateInfo, const VkAllocationCallbacks* pAllocator, VkPipelineCache* pPipelineCache);
    /// ```
    public int CreatePipelineCache(MemorySegment device, MemorySegment pCreateInfo, MemorySegment pAllocator, MemorySegment pPipelineCache) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCreatePipelineCache)) throw new SymbolNotFoundError("Symbol not found: vkCreatePipelineCache");
        try { return (int) Handles.MH_vkCreatePipelineCache.invokeExact(handles.PFN_vkCreatePipelineCache, device, pCreateInfo, pAllocator, pPipelineCache); }
        catch (Throwable e) { throw new RuntimeException("error in CreatePipelineCache", e); }
    }

    /// ```
    /// void vkDestroyPipelineCache(VkDevice device, VkPipelineCache pipelineCache, const VkAllocationCallbacks* pAllocator);
    /// ```
    public void DestroyPipelineCache(MemorySegment device, long pipelineCache, MemorySegment pAllocator) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkDestroyPipelineCache)) throw new SymbolNotFoundError("Symbol not found: vkDestroyPipelineCache");
        try { Handles.MH_vkDestroyPipelineCache.invokeExact(handles.PFN_vkDestroyPipelineCache, device, pipelineCache, pAllocator); }
        catch (Throwable e) { throw new RuntimeException("error in DestroyPipelineCache", e); }
    }

    /// ```
    /// VkResult vkGetPipelineCacheData(VkDevice device, VkPipelineCache pipelineCache, size_t* pDataSize, void* pData);
    /// ```
    public int GetPipelineCacheData(MemorySegment device, long pipelineCache, MemorySegment pDataSize, MemorySegment pData) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkGetPipelineCacheData)) throw new SymbolNotFoundError("Symbol not found: vkGetPipelineCacheData");
        try { return (int) Handles.MH_vkGetPipelineCacheData.invokeExact(handles.PFN_vkGetPipelineCacheData, device, pipelineCache, pDataSize, pData); }
        catch (Throwable e) { throw new RuntimeException("error in GetPipelineCacheData", e); }
    }

    /// ```
    /// VkResult vkMergePipelineCaches(VkDevice device, VkPipelineCache dstCache, uint32_t srcCacheCount, const VkPipelineCache* pSrcCaches);
    /// ```
    public int MergePipelineCaches(MemorySegment device, long dstCache, int srcCacheCount, MemorySegment pSrcCaches) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkMergePipelineCaches)) throw new SymbolNotFoundError("Symbol not found: vkMergePipelineCaches");
        try { return (int) Handles.MH_vkMergePipelineCaches.invokeExact(handles.PFN_vkMergePipelineCaches, device, dstCache, srcCacheCount, pSrcCaches); }
        catch (Throwable e) { throw new RuntimeException("error in MergePipelineCaches", e); }
    }

    /// ```
    /// VkResult vkCreateGraphicsPipelines(VkDevice device, VkPipelineCache pipelineCache, uint32_t createInfoCount, const VkGraphicsPipelineCreateInfo* pCreateInfos, const VkAllocationCallbacks* pAllocator, VkPipeline* pPipelines);
    /// ```
    public int CreateGraphicsPipelines(MemorySegment device, long pipelineCache, int createInfoCount, MemorySegment pCreateInfos, MemorySegment pAllocator, MemorySegment pPipelines) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCreateGraphicsPipelines)) throw new SymbolNotFoundError("Symbol not found: vkCreateGraphicsPipelines");
        try { return (int) Handles.MH_vkCreateGraphicsPipelines.invokeExact(handles.PFN_vkCreateGraphicsPipelines, device, pipelineCache, createInfoCount, pCreateInfos, pAllocator, pPipelines); }
        catch (Throwable e) { throw new RuntimeException("error in CreateGraphicsPipelines", e); }
    }

    /// ```
    /// VkResult vkCreateComputePipelines(VkDevice device, VkPipelineCache pipelineCache, uint32_t createInfoCount, const VkComputePipelineCreateInfo* pCreateInfos, const VkAllocationCallbacks* pAllocator, VkPipeline* pPipelines);
    /// ```
    public int CreateComputePipelines(MemorySegment device, long pipelineCache, int createInfoCount, MemorySegment pCreateInfos, MemorySegment pAllocator, MemorySegment pPipelines) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCreateComputePipelines)) throw new SymbolNotFoundError("Symbol not found: vkCreateComputePipelines");
        try { return (int) Handles.MH_vkCreateComputePipelines.invokeExact(handles.PFN_vkCreateComputePipelines, device, pipelineCache, createInfoCount, pCreateInfos, pAllocator, pPipelines); }
        catch (Throwable e) { throw new RuntimeException("error in CreateComputePipelines", e); }
    }

    /// ```
    /// void vkDestroyPipeline(VkDevice device, VkPipeline pipeline, const VkAllocationCallbacks* pAllocator);
    /// ```
    public void DestroyPipeline(MemorySegment device, long pipeline, MemorySegment pAllocator) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkDestroyPipeline)) throw new SymbolNotFoundError("Symbol not found: vkDestroyPipeline");
        try { Handles.MH_vkDestroyPipeline.invokeExact(handles.PFN_vkDestroyPipeline, device, pipeline, pAllocator); }
        catch (Throwable e) { throw new RuntimeException("error in DestroyPipeline", e); }
    }

    /// ```
    /// VkResult vkCreatePipelineLayout(VkDevice device, const VkPipelineLayoutCreateInfo* pCreateInfo, const VkAllocationCallbacks* pAllocator, VkPipelineLayout* pPipelineLayout);
    /// ```
    public int CreatePipelineLayout(MemorySegment device, MemorySegment pCreateInfo, MemorySegment pAllocator, MemorySegment pPipelineLayout) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCreatePipelineLayout)) throw new SymbolNotFoundError("Symbol not found: vkCreatePipelineLayout");
        try { return (int) Handles.MH_vkCreatePipelineLayout.invokeExact(handles.PFN_vkCreatePipelineLayout, device, pCreateInfo, pAllocator, pPipelineLayout); }
        catch (Throwable e) { throw new RuntimeException("error in CreatePipelineLayout", e); }
    }

    /// ```
    /// void vkDestroyPipelineLayout(VkDevice device, VkPipelineLayout pipelineLayout, const VkAllocationCallbacks* pAllocator);
    /// ```
    public void DestroyPipelineLayout(MemorySegment device, long pipelineLayout, MemorySegment pAllocator) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkDestroyPipelineLayout)) throw new SymbolNotFoundError("Symbol not found: vkDestroyPipelineLayout");
        try { Handles.MH_vkDestroyPipelineLayout.invokeExact(handles.PFN_vkDestroyPipelineLayout, device, pipelineLayout, pAllocator); }
        catch (Throwable e) { throw new RuntimeException("error in DestroyPipelineLayout", e); }
    }

    /// ```
    /// VkResult vkCreateSampler(VkDevice device, const VkSamplerCreateInfo* pCreateInfo, const VkAllocationCallbacks* pAllocator, VkSampler* pSampler);
    /// ```
    public int CreateSampler(MemorySegment device, MemorySegment pCreateInfo, MemorySegment pAllocator, MemorySegment pSampler) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCreateSampler)) throw new SymbolNotFoundError("Symbol not found: vkCreateSampler");
        try { return (int) Handles.MH_vkCreateSampler.invokeExact(handles.PFN_vkCreateSampler, device, pCreateInfo, pAllocator, pSampler); }
        catch (Throwable e) { throw new RuntimeException("error in CreateSampler", e); }
    }

    /// ```
    /// void vkDestroySampler(VkDevice device, VkSampler sampler, const VkAllocationCallbacks* pAllocator);
    /// ```
    public void DestroySampler(MemorySegment device, long sampler, MemorySegment pAllocator) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkDestroySampler)) throw new SymbolNotFoundError("Symbol not found: vkDestroySampler");
        try { Handles.MH_vkDestroySampler.invokeExact(handles.PFN_vkDestroySampler, device, sampler, pAllocator); }
        catch (Throwable e) { throw new RuntimeException("error in DestroySampler", e); }
    }

    /// ```
    /// VkResult vkCreateDescriptorSetLayout(VkDevice device, const VkDescriptorSetLayoutCreateInfo* pCreateInfo, const VkAllocationCallbacks* pAllocator, VkDescriptorSetLayout* pSetLayout);
    /// ```
    public int CreateDescriptorSetLayout(MemorySegment device, MemorySegment pCreateInfo, MemorySegment pAllocator, MemorySegment pSetLayout) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCreateDescriptorSetLayout)) throw new SymbolNotFoundError("Symbol not found: vkCreateDescriptorSetLayout");
        try { return (int) Handles.MH_vkCreateDescriptorSetLayout.invokeExact(handles.PFN_vkCreateDescriptorSetLayout, device, pCreateInfo, pAllocator, pSetLayout); }
        catch (Throwable e) { throw new RuntimeException("error in CreateDescriptorSetLayout", e); }
    }

    /// ```
    /// void vkDestroyDescriptorSetLayout(VkDevice device, VkDescriptorSetLayout descriptorSetLayout, const VkAllocationCallbacks* pAllocator);
    /// ```
    public void DestroyDescriptorSetLayout(MemorySegment device, long descriptorSetLayout, MemorySegment pAllocator) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkDestroyDescriptorSetLayout)) throw new SymbolNotFoundError("Symbol not found: vkDestroyDescriptorSetLayout");
        try { Handles.MH_vkDestroyDescriptorSetLayout.invokeExact(handles.PFN_vkDestroyDescriptorSetLayout, device, descriptorSetLayout, pAllocator); }
        catch (Throwable e) { throw new RuntimeException("error in DestroyDescriptorSetLayout", e); }
    }

    /// ```
    /// VkResult vkCreateDescriptorPool(VkDevice device, const VkDescriptorPoolCreateInfo* pCreateInfo, const VkAllocationCallbacks* pAllocator, VkDescriptorPool* pDescriptorPool);
    /// ```
    public int CreateDescriptorPool(MemorySegment device, MemorySegment pCreateInfo, MemorySegment pAllocator, MemorySegment pDescriptorPool) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCreateDescriptorPool)) throw new SymbolNotFoundError("Symbol not found: vkCreateDescriptorPool");
        try { return (int) Handles.MH_vkCreateDescriptorPool.invokeExact(handles.PFN_vkCreateDescriptorPool, device, pCreateInfo, pAllocator, pDescriptorPool); }
        catch (Throwable e) { throw new RuntimeException("error in CreateDescriptorPool", e); }
    }

    /// ```
    /// void vkDestroyDescriptorPool(VkDevice device, VkDescriptorPool descriptorPool, const VkAllocationCallbacks* pAllocator);
    /// ```
    public void DestroyDescriptorPool(MemorySegment device, long descriptorPool, MemorySegment pAllocator) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkDestroyDescriptorPool)) throw new SymbolNotFoundError("Symbol not found: vkDestroyDescriptorPool");
        try { Handles.MH_vkDestroyDescriptorPool.invokeExact(handles.PFN_vkDestroyDescriptorPool, device, descriptorPool, pAllocator); }
        catch (Throwable e) { throw new RuntimeException("error in DestroyDescriptorPool", e); }
    }

    /// ```
    /// VkResult vkResetDescriptorPool(VkDevice device, VkDescriptorPool descriptorPool, VkDescriptorPoolResetFlags flags);
    /// ```
    public int ResetDescriptorPool(MemorySegment device, long descriptorPool, int flags) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkResetDescriptorPool)) throw new SymbolNotFoundError("Symbol not found: vkResetDescriptorPool");
        try { return (int) Handles.MH_vkResetDescriptorPool.invokeExact(handles.PFN_vkResetDescriptorPool, device, descriptorPool, flags); }
        catch (Throwable e) { throw new RuntimeException("error in ResetDescriptorPool", e); }
    }

    /// ```
    /// VkResult vkAllocateDescriptorSets(VkDevice device, const VkDescriptorSetAllocateInfo* pAllocateInfo, VkDescriptorSet* pDescriptorSets);
    /// ```
    public int AllocateDescriptorSets(MemorySegment device, MemorySegment pAllocateInfo, MemorySegment pDescriptorSets) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkAllocateDescriptorSets)) throw new SymbolNotFoundError("Symbol not found: vkAllocateDescriptorSets");
        try { return (int) Handles.MH_vkAllocateDescriptorSets.invokeExact(handles.PFN_vkAllocateDescriptorSets, device, pAllocateInfo, pDescriptorSets); }
        catch (Throwable e) { throw new RuntimeException("error in AllocateDescriptorSets", e); }
    }

    /// ```
    /// VkResult vkFreeDescriptorSets(VkDevice device, VkDescriptorPool descriptorPool, uint32_t descriptorSetCount, const VkDescriptorSet* pDescriptorSets);
    /// ```
    public int FreeDescriptorSets(MemorySegment device, long descriptorPool, int descriptorSetCount, MemorySegment pDescriptorSets) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkFreeDescriptorSets)) throw new SymbolNotFoundError("Symbol not found: vkFreeDescriptorSets");
        try { return (int) Handles.MH_vkFreeDescriptorSets.invokeExact(handles.PFN_vkFreeDescriptorSets, device, descriptorPool, descriptorSetCount, pDescriptorSets); }
        catch (Throwable e) { throw new RuntimeException("error in FreeDescriptorSets", e); }
    }

    /// ```
    /// void vkUpdateDescriptorSets(VkDevice device, uint32_t descriptorWriteCount, const VkWriteDescriptorSet* pDescriptorWrites, uint32_t descriptorCopyCount, const VkCopyDescriptorSet* pDescriptorCopies);
    /// ```
    public void UpdateDescriptorSets(MemorySegment device, int descriptorWriteCount, MemorySegment pDescriptorWrites, int descriptorCopyCount, MemorySegment pDescriptorCopies) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkUpdateDescriptorSets)) throw new SymbolNotFoundError("Symbol not found: vkUpdateDescriptorSets");
        try { Handles.MH_vkUpdateDescriptorSets.invokeExact(handles.PFN_vkUpdateDescriptorSets, device, descriptorWriteCount, pDescriptorWrites, descriptorCopyCount, pDescriptorCopies); }
        catch (Throwable e) { throw new RuntimeException("error in UpdateDescriptorSets", e); }
    }

    /// ```
    /// VkResult vkCreateFramebuffer(VkDevice device, const VkFramebufferCreateInfo* pCreateInfo, const VkAllocationCallbacks* pAllocator, VkFramebuffer* pFramebuffer);
    /// ```
    public int CreateFramebuffer(MemorySegment device, MemorySegment pCreateInfo, MemorySegment pAllocator, MemorySegment pFramebuffer) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCreateFramebuffer)) throw new SymbolNotFoundError("Symbol not found: vkCreateFramebuffer");
        try { return (int) Handles.MH_vkCreateFramebuffer.invokeExact(handles.PFN_vkCreateFramebuffer, device, pCreateInfo, pAllocator, pFramebuffer); }
        catch (Throwable e) { throw new RuntimeException("error in CreateFramebuffer", e); }
    }

    /// ```
    /// void vkDestroyFramebuffer(VkDevice device, VkFramebuffer framebuffer, const VkAllocationCallbacks* pAllocator);
    /// ```
    public void DestroyFramebuffer(MemorySegment device, long framebuffer, MemorySegment pAllocator) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkDestroyFramebuffer)) throw new SymbolNotFoundError("Symbol not found: vkDestroyFramebuffer");
        try { Handles.MH_vkDestroyFramebuffer.invokeExact(handles.PFN_vkDestroyFramebuffer, device, framebuffer, pAllocator); }
        catch (Throwable e) { throw new RuntimeException("error in DestroyFramebuffer", e); }
    }

    /// ```
    /// VkResult vkCreateRenderPass(VkDevice device, const VkRenderPassCreateInfo* pCreateInfo, const VkAllocationCallbacks* pAllocator, VkRenderPass* pRenderPass);
    /// ```
    public int CreateRenderPass(MemorySegment device, MemorySegment pCreateInfo, MemorySegment pAllocator, MemorySegment pRenderPass) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCreateRenderPass)) throw new SymbolNotFoundError("Symbol not found: vkCreateRenderPass");
        try { return (int) Handles.MH_vkCreateRenderPass.invokeExact(handles.PFN_vkCreateRenderPass, device, pCreateInfo, pAllocator, pRenderPass); }
        catch (Throwable e) { throw new RuntimeException("error in CreateRenderPass", e); }
    }

    /// ```
    /// void vkDestroyRenderPass(VkDevice device, VkRenderPass renderPass, const VkAllocationCallbacks* pAllocator);
    /// ```
    public void DestroyRenderPass(MemorySegment device, long renderPass, MemorySegment pAllocator) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkDestroyRenderPass)) throw new SymbolNotFoundError("Symbol not found: vkDestroyRenderPass");
        try { Handles.MH_vkDestroyRenderPass.invokeExact(handles.PFN_vkDestroyRenderPass, device, renderPass, pAllocator); }
        catch (Throwable e) { throw new RuntimeException("error in DestroyRenderPass", e); }
    }

    /// ```
    /// void vkGetRenderAreaGranularity(VkDevice device, VkRenderPass renderPass, VkExtent2D* pGranularity);
    /// ```
    public void GetRenderAreaGranularity(MemorySegment device, long renderPass, MemorySegment pGranularity) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkGetRenderAreaGranularity)) throw new SymbolNotFoundError("Symbol not found: vkGetRenderAreaGranularity");
        try { Handles.MH_vkGetRenderAreaGranularity.invokeExact(handles.PFN_vkGetRenderAreaGranularity, device, renderPass, pGranularity); }
        catch (Throwable e) { throw new RuntimeException("error in GetRenderAreaGranularity", e); }
    }

    /// ```
    /// VkResult vkCreateCommandPool(VkDevice device, const VkCommandPoolCreateInfo* pCreateInfo, const VkAllocationCallbacks* pAllocator, VkCommandPool* pCommandPool);
    /// ```
    public int CreateCommandPool(MemorySegment device, MemorySegment pCreateInfo, MemorySegment pAllocator, MemorySegment pCommandPool) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCreateCommandPool)) throw new SymbolNotFoundError("Symbol not found: vkCreateCommandPool");
        try { return (int) Handles.MH_vkCreateCommandPool.invokeExact(handles.PFN_vkCreateCommandPool, device, pCreateInfo, pAllocator, pCommandPool); }
        catch (Throwable e) { throw new RuntimeException("error in CreateCommandPool", e); }
    }

    /// ```
    /// void vkDestroyCommandPool(VkDevice device, VkCommandPool commandPool, const VkAllocationCallbacks* pAllocator);
    /// ```
    public void DestroyCommandPool(MemorySegment device, long commandPool, MemorySegment pAllocator) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkDestroyCommandPool)) throw new SymbolNotFoundError("Symbol not found: vkDestroyCommandPool");
        try { Handles.MH_vkDestroyCommandPool.invokeExact(handles.PFN_vkDestroyCommandPool, device, commandPool, pAllocator); }
        catch (Throwable e) { throw new RuntimeException("error in DestroyCommandPool", e); }
    }

    /// ```
    /// VkResult vkResetCommandPool(VkDevice device, VkCommandPool commandPool, VkCommandPoolResetFlags flags);
    /// ```
    public int ResetCommandPool(MemorySegment device, long commandPool, int flags) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkResetCommandPool)) throw new SymbolNotFoundError("Symbol not found: vkResetCommandPool");
        try { return (int) Handles.MH_vkResetCommandPool.invokeExact(handles.PFN_vkResetCommandPool, device, commandPool, flags); }
        catch (Throwable e) { throw new RuntimeException("error in ResetCommandPool", e); }
    }

    /// ```
    /// VkResult vkAllocateCommandBuffers(VkDevice device, const VkCommandBufferAllocateInfo* pAllocateInfo, VkCommandBuffer* pCommandBuffers);
    /// ```
    public int AllocateCommandBuffers(MemorySegment device, MemorySegment pAllocateInfo, MemorySegment pCommandBuffers) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkAllocateCommandBuffers)) throw new SymbolNotFoundError("Symbol not found: vkAllocateCommandBuffers");
        try { return (int) Handles.MH_vkAllocateCommandBuffers.invokeExact(handles.PFN_vkAllocateCommandBuffers, device, pAllocateInfo, pCommandBuffers); }
        catch (Throwable e) { throw new RuntimeException("error in AllocateCommandBuffers", e); }
    }

    /// ```
    /// void vkFreeCommandBuffers(VkDevice device, VkCommandPool commandPool, uint32_t commandBufferCount, const VkCommandBuffer* pCommandBuffers);
    /// ```
    public void FreeCommandBuffers(MemorySegment device, long commandPool, int commandBufferCount, MemorySegment pCommandBuffers) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkFreeCommandBuffers)) throw new SymbolNotFoundError("Symbol not found: vkFreeCommandBuffers");
        try { Handles.MH_vkFreeCommandBuffers.invokeExact(handles.PFN_vkFreeCommandBuffers, device, commandPool, commandBufferCount, pCommandBuffers); }
        catch (Throwable e) { throw new RuntimeException("error in FreeCommandBuffers", e); }
    }

    /// ```
    /// VkResult vkBeginCommandBuffer(VkCommandBuffer commandBuffer, const VkCommandBufferBeginInfo* pBeginInfo);
    /// ```
    public int BeginCommandBuffer(MemorySegment commandBuffer, MemorySegment pBeginInfo) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkBeginCommandBuffer)) throw new SymbolNotFoundError("Symbol not found: vkBeginCommandBuffer");
        try { return (int) Handles.MH_vkBeginCommandBuffer.invokeExact(handles.PFN_vkBeginCommandBuffer, commandBuffer, pBeginInfo); }
        catch (Throwable e) { throw new RuntimeException("error in BeginCommandBuffer", e); }
    }

    /// ```
    /// VkResult vkEndCommandBuffer(VkCommandBuffer commandBuffer);
    /// ```
    public int EndCommandBuffer(MemorySegment commandBuffer) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkEndCommandBuffer)) throw new SymbolNotFoundError("Symbol not found: vkEndCommandBuffer");
        try { return (int) Handles.MH_vkEndCommandBuffer.invokeExact(handles.PFN_vkEndCommandBuffer, commandBuffer); }
        catch (Throwable e) { throw new RuntimeException("error in EndCommandBuffer", e); }
    }

    /// ```
    /// VkResult vkResetCommandBuffer(VkCommandBuffer commandBuffer, VkCommandBufferResetFlags flags);
    /// ```
    public int ResetCommandBuffer(MemorySegment commandBuffer, int flags) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkResetCommandBuffer)) throw new SymbolNotFoundError("Symbol not found: vkResetCommandBuffer");
        try { return (int) Handles.MH_vkResetCommandBuffer.invokeExact(handles.PFN_vkResetCommandBuffer, commandBuffer, flags); }
        catch (Throwable e) { throw new RuntimeException("error in ResetCommandBuffer", e); }
    }

    /// ```
    /// void vkCmdBindPipeline(VkCommandBuffer commandBuffer, VkPipelineBindPoint pipelineBindPoint, VkPipeline pipeline);
    /// ```
    public void CmdBindPipeline(MemorySegment commandBuffer, int pipelineBindPoint, long pipeline) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCmdBindPipeline)) throw new SymbolNotFoundError("Symbol not found: vkCmdBindPipeline");
        try { Handles.MH_vkCmdBindPipeline.invokeExact(handles.PFN_vkCmdBindPipeline, commandBuffer, pipelineBindPoint, pipeline); }
        catch (Throwable e) { throw new RuntimeException("error in CmdBindPipeline", e); }
    }

    /// ```
    /// void vkCmdSetViewport(VkCommandBuffer commandBuffer, uint32_t firstViewport, uint32_t viewportCount, const VkViewport* pViewports);
    /// ```
    public void CmdSetViewport(MemorySegment commandBuffer, int firstViewport, int viewportCount, MemorySegment pViewports) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCmdSetViewport)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetViewport");
        try { Handles.MH_vkCmdSetViewport.invokeExact(handles.PFN_vkCmdSetViewport, commandBuffer, firstViewport, viewportCount, pViewports); }
        catch (Throwable e) { throw new RuntimeException("error in CmdSetViewport", e); }
    }

    /// ```
    /// void vkCmdSetScissor(VkCommandBuffer commandBuffer, uint32_t firstScissor, uint32_t scissorCount, const VkRect2D* pScissors);
    /// ```
    public void CmdSetScissor(MemorySegment commandBuffer, int firstScissor, int scissorCount, MemorySegment pScissors) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCmdSetScissor)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetScissor");
        try { Handles.MH_vkCmdSetScissor.invokeExact(handles.PFN_vkCmdSetScissor, commandBuffer, firstScissor, scissorCount, pScissors); }
        catch (Throwable e) { throw new RuntimeException("error in CmdSetScissor", e); }
    }

    /// ```
    /// void vkCmdSetLineWidth(VkCommandBuffer commandBuffer, float lineWidth);
    /// ```
    public void CmdSetLineWidth(MemorySegment commandBuffer, float lineWidth) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCmdSetLineWidth)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetLineWidth");
        try { Handles.MH_vkCmdSetLineWidth.invokeExact(handles.PFN_vkCmdSetLineWidth, commandBuffer, lineWidth); }
        catch (Throwable e) { throw new RuntimeException("error in CmdSetLineWidth", e); }
    }

    /// ```
    /// void vkCmdSetDepthBias(VkCommandBuffer commandBuffer, float depthBiasConstantFactor, float depthBiasClamp, float depthBiasSlopeFactor);
    /// ```
    public void CmdSetDepthBias(MemorySegment commandBuffer, float depthBiasConstantFactor, float depthBiasClamp, float depthBiasSlopeFactor) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCmdSetDepthBias)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetDepthBias");
        try { Handles.MH_vkCmdSetDepthBias.invokeExact(handles.PFN_vkCmdSetDepthBias, commandBuffer, depthBiasConstantFactor, depthBiasClamp, depthBiasSlopeFactor); }
        catch (Throwable e) { throw new RuntimeException("error in CmdSetDepthBias", e); }
    }

    /// ```
    /// void vkCmdSetBlendConstants(VkCommandBuffer commandBuffer, float blendConstants[4]);
    /// ```
    public void CmdSetBlendConstants(MemorySegment commandBuffer, MemorySegment blendConstants) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCmdSetBlendConstants)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetBlendConstants");
        try { Handles.MH_vkCmdSetBlendConstants.invokeExact(handles.PFN_vkCmdSetBlendConstants, commandBuffer, blendConstants); }
        catch (Throwable e) { throw new RuntimeException("error in CmdSetBlendConstants", e); }
    }

    /// ```
    /// void vkCmdSetDepthBounds(VkCommandBuffer commandBuffer, float minDepthBounds, float maxDepthBounds);
    /// ```
    public void CmdSetDepthBounds(MemorySegment commandBuffer, float minDepthBounds, float maxDepthBounds) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCmdSetDepthBounds)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetDepthBounds");
        try { Handles.MH_vkCmdSetDepthBounds.invokeExact(handles.PFN_vkCmdSetDepthBounds, commandBuffer, minDepthBounds, maxDepthBounds); }
        catch (Throwable e) { throw new RuntimeException("error in CmdSetDepthBounds", e); }
    }

    /// ```
    /// void vkCmdSetStencilCompareMask(VkCommandBuffer commandBuffer, VkStencilFaceFlags faceMask, uint32_t compareMask);
    /// ```
    public void CmdSetStencilCompareMask(MemorySegment commandBuffer, int faceMask, int compareMask) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCmdSetStencilCompareMask)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetStencilCompareMask");
        try { Handles.MH_vkCmdSetStencilCompareMask.invokeExact(handles.PFN_vkCmdSetStencilCompareMask, commandBuffer, faceMask, compareMask); }
        catch (Throwable e) { throw new RuntimeException("error in CmdSetStencilCompareMask", e); }
    }

    /// ```
    /// void vkCmdSetStencilWriteMask(VkCommandBuffer commandBuffer, VkStencilFaceFlags faceMask, uint32_t writeMask);
    /// ```
    public void CmdSetStencilWriteMask(MemorySegment commandBuffer, int faceMask, int writeMask) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCmdSetStencilWriteMask)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetStencilWriteMask");
        try { Handles.MH_vkCmdSetStencilWriteMask.invokeExact(handles.PFN_vkCmdSetStencilWriteMask, commandBuffer, faceMask, writeMask); }
        catch (Throwable e) { throw new RuntimeException("error in CmdSetStencilWriteMask", e); }
    }

    /// ```
    /// void vkCmdSetStencilReference(VkCommandBuffer commandBuffer, VkStencilFaceFlags faceMask, uint32_t reference);
    /// ```
    public void CmdSetStencilReference(MemorySegment commandBuffer, int faceMask, int reference) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCmdSetStencilReference)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetStencilReference");
        try { Handles.MH_vkCmdSetStencilReference.invokeExact(handles.PFN_vkCmdSetStencilReference, commandBuffer, faceMask, reference); }
        catch (Throwable e) { throw new RuntimeException("error in CmdSetStencilReference", e); }
    }

    /// ```
    /// void vkCmdBindDescriptorSets(VkCommandBuffer commandBuffer, VkPipelineBindPoint pipelineBindPoint, VkPipelineLayout layout, uint32_t firstSet, uint32_t descriptorSetCount, const VkDescriptorSet* pDescriptorSets, uint32_t dynamicOffsetCount, const uint32_t* pDynamicOffsets);
    /// ```
    public void CmdBindDescriptorSets(MemorySegment commandBuffer, int pipelineBindPoint, long layout, int firstSet, int descriptorSetCount, MemorySegment pDescriptorSets, int dynamicOffsetCount, MemorySegment pDynamicOffsets) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCmdBindDescriptorSets)) throw new SymbolNotFoundError("Symbol not found: vkCmdBindDescriptorSets");
        try { Handles.MH_vkCmdBindDescriptorSets.invokeExact(handles.PFN_vkCmdBindDescriptorSets, commandBuffer, pipelineBindPoint, layout, firstSet, descriptorSetCount, pDescriptorSets, dynamicOffsetCount, pDynamicOffsets); }
        catch (Throwable e) { throw new RuntimeException("error in CmdBindDescriptorSets", e); }
    }

    /// ```
    /// void vkCmdBindIndexBuffer(VkCommandBuffer commandBuffer, VkBuffer buffer, VkDeviceSize offset, VkIndexType indexType);
    /// ```
    public void CmdBindIndexBuffer(MemorySegment commandBuffer, long buffer, long offset, int indexType) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCmdBindIndexBuffer)) throw new SymbolNotFoundError("Symbol not found: vkCmdBindIndexBuffer");
        try { Handles.MH_vkCmdBindIndexBuffer.invokeExact(handles.PFN_vkCmdBindIndexBuffer, commandBuffer, buffer, offset, indexType); }
        catch (Throwable e) { throw new RuntimeException("error in CmdBindIndexBuffer", e); }
    }

    /// ```
    /// void vkCmdBindVertexBuffers(VkCommandBuffer commandBuffer, uint32_t firstBinding, uint32_t bindingCount, const VkBuffer* pBuffers, const VkDeviceSize* pOffsets);
    /// ```
    public void CmdBindVertexBuffers(MemorySegment commandBuffer, int firstBinding, int bindingCount, MemorySegment pBuffers, MemorySegment pOffsets) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCmdBindVertexBuffers)) throw new SymbolNotFoundError("Symbol not found: vkCmdBindVertexBuffers");
        try { Handles.MH_vkCmdBindVertexBuffers.invokeExact(handles.PFN_vkCmdBindVertexBuffers, commandBuffer, firstBinding, bindingCount, pBuffers, pOffsets); }
        catch (Throwable e) { throw new RuntimeException("error in CmdBindVertexBuffers", e); }
    }

    /// ```
    /// void vkCmdDraw(VkCommandBuffer commandBuffer, uint32_t vertexCount, uint32_t instanceCount, uint32_t firstVertex, uint32_t firstInstance);
    /// ```
    public void CmdDraw(MemorySegment commandBuffer, int vertexCount, int instanceCount, int firstVertex, int firstInstance) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCmdDraw)) throw new SymbolNotFoundError("Symbol not found: vkCmdDraw");
        try { Handles.MH_vkCmdDraw.invokeExact(handles.PFN_vkCmdDraw, commandBuffer, vertexCount, instanceCount, firstVertex, firstInstance); }
        catch (Throwable e) { throw new RuntimeException("error in CmdDraw", e); }
    }

    /// ```
    /// void vkCmdDrawIndexed(VkCommandBuffer commandBuffer, uint32_t indexCount, uint32_t instanceCount, uint32_t firstIndex, int32_t vertexOffset, uint32_t firstInstance);
    /// ```
    public void CmdDrawIndexed(MemorySegment commandBuffer, int indexCount, int instanceCount, int firstIndex, int vertexOffset, int firstInstance) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCmdDrawIndexed)) throw new SymbolNotFoundError("Symbol not found: vkCmdDrawIndexed");
        try { Handles.MH_vkCmdDrawIndexed.invokeExact(handles.PFN_vkCmdDrawIndexed, commandBuffer, indexCount, instanceCount, firstIndex, vertexOffset, firstInstance); }
        catch (Throwable e) { throw new RuntimeException("error in CmdDrawIndexed", e); }
    }

    /// ```
    /// void vkCmdDrawIndirect(VkCommandBuffer commandBuffer, VkBuffer buffer, VkDeviceSize offset, uint32_t drawCount, uint32_t stride);
    /// ```
    public void CmdDrawIndirect(MemorySegment commandBuffer, long buffer, long offset, int drawCount, int stride) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCmdDrawIndirect)) throw new SymbolNotFoundError("Symbol not found: vkCmdDrawIndirect");
        try { Handles.MH_vkCmdDrawIndirect.invokeExact(handles.PFN_vkCmdDrawIndirect, commandBuffer, buffer, offset, drawCount, stride); }
        catch (Throwable e) { throw new RuntimeException("error in CmdDrawIndirect", e); }
    }

    /// ```
    /// void vkCmdDrawIndexedIndirect(VkCommandBuffer commandBuffer, VkBuffer buffer, VkDeviceSize offset, uint32_t drawCount, uint32_t stride);
    /// ```
    public void CmdDrawIndexedIndirect(MemorySegment commandBuffer, long buffer, long offset, int drawCount, int stride) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCmdDrawIndexedIndirect)) throw new SymbolNotFoundError("Symbol not found: vkCmdDrawIndexedIndirect");
        try { Handles.MH_vkCmdDrawIndexedIndirect.invokeExact(handles.PFN_vkCmdDrawIndexedIndirect, commandBuffer, buffer, offset, drawCount, stride); }
        catch (Throwable e) { throw new RuntimeException("error in CmdDrawIndexedIndirect", e); }
    }

    /// ```
    /// void vkCmdDispatch(VkCommandBuffer commandBuffer, uint32_t groupCountX, uint32_t groupCountY, uint32_t groupCountZ);
    /// ```
    public void CmdDispatch(MemorySegment commandBuffer, int groupCountX, int groupCountY, int groupCountZ) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCmdDispatch)) throw new SymbolNotFoundError("Symbol not found: vkCmdDispatch");
        try { Handles.MH_vkCmdDispatch.invokeExact(handles.PFN_vkCmdDispatch, commandBuffer, groupCountX, groupCountY, groupCountZ); }
        catch (Throwable e) { throw new RuntimeException("error in CmdDispatch", e); }
    }

    /// ```
    /// void vkCmdDispatchIndirect(VkCommandBuffer commandBuffer, VkBuffer buffer, VkDeviceSize offset);
    /// ```
    public void CmdDispatchIndirect(MemorySegment commandBuffer, long buffer, long offset) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCmdDispatchIndirect)) throw new SymbolNotFoundError("Symbol not found: vkCmdDispatchIndirect");
        try { Handles.MH_vkCmdDispatchIndirect.invokeExact(handles.PFN_vkCmdDispatchIndirect, commandBuffer, buffer, offset); }
        catch (Throwable e) { throw new RuntimeException("error in CmdDispatchIndirect", e); }
    }

    /// ```
    /// void vkCmdCopyBuffer(VkCommandBuffer commandBuffer, VkBuffer srcBuffer, VkBuffer dstBuffer, uint32_t regionCount, const VkBufferCopy* pRegions);
    /// ```
    public void CmdCopyBuffer(MemorySegment commandBuffer, long srcBuffer, long dstBuffer, int regionCount, MemorySegment pRegions) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCmdCopyBuffer)) throw new SymbolNotFoundError("Symbol not found: vkCmdCopyBuffer");
        try { Handles.MH_vkCmdCopyBuffer.invokeExact(handles.PFN_vkCmdCopyBuffer, commandBuffer, srcBuffer, dstBuffer, regionCount, pRegions); }
        catch (Throwable e) { throw new RuntimeException("error in CmdCopyBuffer", e); }
    }

    /// ```
    /// void vkCmdCopyImage(VkCommandBuffer commandBuffer, VkImage srcImage, VkImageLayout srcImageLayout, VkImage dstImage, VkImageLayout dstImageLayout, uint32_t regionCount, const VkImageCopy* pRegions);
    /// ```
    public void CmdCopyImage(MemorySegment commandBuffer, long srcImage, int srcImageLayout, long dstImage, int dstImageLayout, int regionCount, MemorySegment pRegions) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCmdCopyImage)) throw new SymbolNotFoundError("Symbol not found: vkCmdCopyImage");
        try { Handles.MH_vkCmdCopyImage.invokeExact(handles.PFN_vkCmdCopyImage, commandBuffer, srcImage, srcImageLayout, dstImage, dstImageLayout, regionCount, pRegions); }
        catch (Throwable e) { throw new RuntimeException("error in CmdCopyImage", e); }
    }

    /// ```
    /// void vkCmdBlitImage(VkCommandBuffer commandBuffer, VkImage srcImage, VkImageLayout srcImageLayout, VkImage dstImage, VkImageLayout dstImageLayout, uint32_t regionCount, const VkImageBlit* pRegions, VkFilter filter);
    /// ```
    public void CmdBlitImage(MemorySegment commandBuffer, long srcImage, int srcImageLayout, long dstImage, int dstImageLayout, int regionCount, MemorySegment pRegions, int filter) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCmdBlitImage)) throw new SymbolNotFoundError("Symbol not found: vkCmdBlitImage");
        try { Handles.MH_vkCmdBlitImage.invokeExact(handles.PFN_vkCmdBlitImage, commandBuffer, srcImage, srcImageLayout, dstImage, dstImageLayout, regionCount, pRegions, filter); }
        catch (Throwable e) { throw new RuntimeException("error in CmdBlitImage", e); }
    }

    /// ```
    /// void vkCmdCopyBufferToImage(VkCommandBuffer commandBuffer, VkBuffer srcBuffer, VkImage dstImage, VkImageLayout dstImageLayout, uint32_t regionCount, const VkBufferImageCopy* pRegions);
    /// ```
    public void CmdCopyBufferToImage(MemorySegment commandBuffer, long srcBuffer, long dstImage, int dstImageLayout, int regionCount, MemorySegment pRegions) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCmdCopyBufferToImage)) throw new SymbolNotFoundError("Symbol not found: vkCmdCopyBufferToImage");
        try { Handles.MH_vkCmdCopyBufferToImage.invokeExact(handles.PFN_vkCmdCopyBufferToImage, commandBuffer, srcBuffer, dstImage, dstImageLayout, regionCount, pRegions); }
        catch (Throwable e) { throw new RuntimeException("error in CmdCopyBufferToImage", e); }
    }

    /// ```
    /// void vkCmdCopyImageToBuffer(VkCommandBuffer commandBuffer, VkImage srcImage, VkImageLayout srcImageLayout, VkBuffer dstBuffer, uint32_t regionCount, const VkBufferImageCopy* pRegions);
    /// ```
    public void CmdCopyImageToBuffer(MemorySegment commandBuffer, long srcImage, int srcImageLayout, long dstBuffer, int regionCount, MemorySegment pRegions) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCmdCopyImageToBuffer)) throw new SymbolNotFoundError("Symbol not found: vkCmdCopyImageToBuffer");
        try { Handles.MH_vkCmdCopyImageToBuffer.invokeExact(handles.PFN_vkCmdCopyImageToBuffer, commandBuffer, srcImage, srcImageLayout, dstBuffer, regionCount, pRegions); }
        catch (Throwable e) { throw new RuntimeException("error in CmdCopyImageToBuffer", e); }
    }

    /// ```
    /// void vkCmdUpdateBuffer(VkCommandBuffer commandBuffer, VkBuffer dstBuffer, VkDeviceSize dstOffset, VkDeviceSize dataSize, const void* pData);
    /// ```
    public void CmdUpdateBuffer(MemorySegment commandBuffer, long dstBuffer, long dstOffset, long dataSize, MemorySegment pData) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCmdUpdateBuffer)) throw new SymbolNotFoundError("Symbol not found: vkCmdUpdateBuffer");
        try { Handles.MH_vkCmdUpdateBuffer.invokeExact(handles.PFN_vkCmdUpdateBuffer, commandBuffer, dstBuffer, dstOffset, dataSize, pData); }
        catch (Throwable e) { throw new RuntimeException("error in CmdUpdateBuffer", e); }
    }

    /// ```
    /// void vkCmdFillBuffer(VkCommandBuffer commandBuffer, VkBuffer dstBuffer, VkDeviceSize dstOffset, VkDeviceSize size, uint32_t data);
    /// ```
    public void CmdFillBuffer(MemorySegment commandBuffer, long dstBuffer, long dstOffset, long size, int data) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCmdFillBuffer)) throw new SymbolNotFoundError("Symbol not found: vkCmdFillBuffer");
        try { Handles.MH_vkCmdFillBuffer.invokeExact(handles.PFN_vkCmdFillBuffer, commandBuffer, dstBuffer, dstOffset, size, data); }
        catch (Throwable e) { throw new RuntimeException("error in CmdFillBuffer", e); }
    }

    /// ```
    /// void vkCmdClearColorImage(VkCommandBuffer commandBuffer, VkImage image, VkImageLayout imageLayout, const VkClearColorValue* pColor, uint32_t rangeCount, const VkImageSubresourceRange* pRanges);
    /// ```
    public void CmdClearColorImage(MemorySegment commandBuffer, long image, int imageLayout, MemorySegment pColor, int rangeCount, MemorySegment pRanges) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCmdClearColorImage)) throw new SymbolNotFoundError("Symbol not found: vkCmdClearColorImage");
        try { Handles.MH_vkCmdClearColorImage.invokeExact(handles.PFN_vkCmdClearColorImage, commandBuffer, image, imageLayout, pColor, rangeCount, pRanges); }
        catch (Throwable e) { throw new RuntimeException("error in CmdClearColorImage", e); }
    }

    /// ```
    /// void vkCmdClearDepthStencilImage(VkCommandBuffer commandBuffer, VkImage image, VkImageLayout imageLayout, const VkClearDepthStencilValue* pDepthStencil, uint32_t rangeCount, const VkImageSubresourceRange* pRanges);
    /// ```
    public void CmdClearDepthStencilImage(MemorySegment commandBuffer, long image, int imageLayout, MemorySegment pDepthStencil, int rangeCount, MemorySegment pRanges) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCmdClearDepthStencilImage)) throw new SymbolNotFoundError("Symbol not found: vkCmdClearDepthStencilImage");
        try { Handles.MH_vkCmdClearDepthStencilImage.invokeExact(handles.PFN_vkCmdClearDepthStencilImage, commandBuffer, image, imageLayout, pDepthStencil, rangeCount, pRanges); }
        catch (Throwable e) { throw new RuntimeException("error in CmdClearDepthStencilImage", e); }
    }

    /// ```
    /// void vkCmdClearAttachments(VkCommandBuffer commandBuffer, uint32_t attachmentCount, const VkClearAttachment* pAttachments, uint32_t rectCount, const VkClearRect* pRects);
    /// ```
    public void CmdClearAttachments(MemorySegment commandBuffer, int attachmentCount, MemorySegment pAttachments, int rectCount, MemorySegment pRects) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCmdClearAttachments)) throw new SymbolNotFoundError("Symbol not found: vkCmdClearAttachments");
        try { Handles.MH_vkCmdClearAttachments.invokeExact(handles.PFN_vkCmdClearAttachments, commandBuffer, attachmentCount, pAttachments, rectCount, pRects); }
        catch (Throwable e) { throw new RuntimeException("error in CmdClearAttachments", e); }
    }

    /// ```
    /// void vkCmdResolveImage(VkCommandBuffer commandBuffer, VkImage srcImage, VkImageLayout srcImageLayout, VkImage dstImage, VkImageLayout dstImageLayout, uint32_t regionCount, const VkImageResolve* pRegions);
    /// ```
    public void CmdResolveImage(MemorySegment commandBuffer, long srcImage, int srcImageLayout, long dstImage, int dstImageLayout, int regionCount, MemorySegment pRegions) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCmdResolveImage)) throw new SymbolNotFoundError("Symbol not found: vkCmdResolveImage");
        try { Handles.MH_vkCmdResolveImage.invokeExact(handles.PFN_vkCmdResolveImage, commandBuffer, srcImage, srcImageLayout, dstImage, dstImageLayout, regionCount, pRegions); }
        catch (Throwable e) { throw new RuntimeException("error in CmdResolveImage", e); }
    }

    /// ```
    /// void vkCmdSetEvent(VkCommandBuffer commandBuffer, VkEvent event, VkPipelineStageFlags stageMask);
    /// ```
    public void CmdSetEvent(MemorySegment commandBuffer, long event, int stageMask) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCmdSetEvent)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetEvent");
        try { Handles.MH_vkCmdSetEvent.invokeExact(handles.PFN_vkCmdSetEvent, commandBuffer, event, stageMask); }
        catch (Throwable e) { throw new RuntimeException("error in CmdSetEvent", e); }
    }

    /// ```
    /// void vkCmdResetEvent(VkCommandBuffer commandBuffer, VkEvent event, VkPipelineStageFlags stageMask);
    /// ```
    public void CmdResetEvent(MemorySegment commandBuffer, long event, int stageMask) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCmdResetEvent)) throw new SymbolNotFoundError("Symbol not found: vkCmdResetEvent");
        try { Handles.MH_vkCmdResetEvent.invokeExact(handles.PFN_vkCmdResetEvent, commandBuffer, event, stageMask); }
        catch (Throwable e) { throw new RuntimeException("error in CmdResetEvent", e); }
    }

    /// ```
    /// void vkCmdWaitEvents(VkCommandBuffer commandBuffer, uint32_t eventCount, const VkEvent* pEvents, VkPipelineStageFlags srcStageMask, VkPipelineStageFlags dstStageMask, uint32_t memoryBarrierCount, const VkMemoryBarrier* pMemoryBarriers, uint32_t bufferMemoryBarrierCount, const VkBufferMemoryBarrier* pBufferMemoryBarriers, uint32_t imageMemoryBarrierCount, const VkImageMemoryBarrier* pImageMemoryBarriers);
    /// ```
    public void CmdWaitEvents(MemorySegment commandBuffer, int eventCount, MemorySegment pEvents, int srcStageMask, int dstStageMask, int memoryBarrierCount, MemorySegment pMemoryBarriers, int bufferMemoryBarrierCount, MemorySegment pBufferMemoryBarriers, int imageMemoryBarrierCount, MemorySegment pImageMemoryBarriers) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCmdWaitEvents)) throw new SymbolNotFoundError("Symbol not found: vkCmdWaitEvents");
        try { Handles.MH_vkCmdWaitEvents.invokeExact(handles.PFN_vkCmdWaitEvents, commandBuffer, eventCount, pEvents, srcStageMask, dstStageMask, memoryBarrierCount, pMemoryBarriers, bufferMemoryBarrierCount, pBufferMemoryBarriers, imageMemoryBarrierCount, pImageMemoryBarriers); }
        catch (Throwable e) { throw new RuntimeException("error in CmdWaitEvents", e); }
    }

    /// ```
    /// void vkCmdPipelineBarrier(VkCommandBuffer commandBuffer, VkPipelineStageFlags srcStageMask, VkPipelineStageFlags dstStageMask, VkDependencyFlags dependencyFlags, uint32_t memoryBarrierCount, const VkMemoryBarrier* pMemoryBarriers, uint32_t bufferMemoryBarrierCount, const VkBufferMemoryBarrier* pBufferMemoryBarriers, uint32_t imageMemoryBarrierCount, const VkImageMemoryBarrier* pImageMemoryBarriers);
    /// ```
    public void CmdPipelineBarrier(MemorySegment commandBuffer, int srcStageMask, int dstStageMask, int dependencyFlags, int memoryBarrierCount, MemorySegment pMemoryBarriers, int bufferMemoryBarrierCount, MemorySegment pBufferMemoryBarriers, int imageMemoryBarrierCount, MemorySegment pImageMemoryBarriers) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCmdPipelineBarrier)) throw new SymbolNotFoundError("Symbol not found: vkCmdPipelineBarrier");
        try { Handles.MH_vkCmdPipelineBarrier.invokeExact(handles.PFN_vkCmdPipelineBarrier, commandBuffer, srcStageMask, dstStageMask, dependencyFlags, memoryBarrierCount, pMemoryBarriers, bufferMemoryBarrierCount, pBufferMemoryBarriers, imageMemoryBarrierCount, pImageMemoryBarriers); }
        catch (Throwable e) { throw new RuntimeException("error in CmdPipelineBarrier", e); }
    }

    /// ```
    /// void vkCmdBeginQuery(VkCommandBuffer commandBuffer, VkQueryPool queryPool, uint32_t query, VkQueryControlFlags flags);
    /// ```
    public void CmdBeginQuery(MemorySegment commandBuffer, long queryPool, int query, int flags) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCmdBeginQuery)) throw new SymbolNotFoundError("Symbol not found: vkCmdBeginQuery");
        try { Handles.MH_vkCmdBeginQuery.invokeExact(handles.PFN_vkCmdBeginQuery, commandBuffer, queryPool, query, flags); }
        catch (Throwable e) { throw new RuntimeException("error in CmdBeginQuery", e); }
    }

    /// ```
    /// void vkCmdEndQuery(VkCommandBuffer commandBuffer, VkQueryPool queryPool, uint32_t query);
    /// ```
    public void CmdEndQuery(MemorySegment commandBuffer, long queryPool, int query) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCmdEndQuery)) throw new SymbolNotFoundError("Symbol not found: vkCmdEndQuery");
        try { Handles.MH_vkCmdEndQuery.invokeExact(handles.PFN_vkCmdEndQuery, commandBuffer, queryPool, query); }
        catch (Throwable e) { throw new RuntimeException("error in CmdEndQuery", e); }
    }

    /// ```
    /// void vkCmdResetQueryPool(VkCommandBuffer commandBuffer, VkQueryPool queryPool, uint32_t firstQuery, uint32_t queryCount);
    /// ```
    public void CmdResetQueryPool(MemorySegment commandBuffer, long queryPool, int firstQuery, int queryCount) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCmdResetQueryPool)) throw new SymbolNotFoundError("Symbol not found: vkCmdResetQueryPool");
        try { Handles.MH_vkCmdResetQueryPool.invokeExact(handles.PFN_vkCmdResetQueryPool, commandBuffer, queryPool, firstQuery, queryCount); }
        catch (Throwable e) { throw new RuntimeException("error in CmdResetQueryPool", e); }
    }

    /// ```
    /// void vkCmdWriteTimestamp(VkCommandBuffer commandBuffer, VkPipelineStageFlagBits pipelineStage, VkQueryPool queryPool, uint32_t query);
    /// ```
    public void CmdWriteTimestamp(MemorySegment commandBuffer, int pipelineStage, long queryPool, int query) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCmdWriteTimestamp)) throw new SymbolNotFoundError("Symbol not found: vkCmdWriteTimestamp");
        try { Handles.MH_vkCmdWriteTimestamp.invokeExact(handles.PFN_vkCmdWriteTimestamp, commandBuffer, pipelineStage, queryPool, query); }
        catch (Throwable e) { throw new RuntimeException("error in CmdWriteTimestamp", e); }
    }

    /// ```
    /// void vkCmdCopyQueryPoolResults(VkCommandBuffer commandBuffer, VkQueryPool queryPool, uint32_t firstQuery, uint32_t queryCount, VkBuffer dstBuffer, VkDeviceSize dstOffset, VkDeviceSize stride, VkQueryResultFlags flags);
    /// ```
    public void CmdCopyQueryPoolResults(MemorySegment commandBuffer, long queryPool, int firstQuery, int queryCount, long dstBuffer, long dstOffset, long stride, int flags) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCmdCopyQueryPoolResults)) throw new SymbolNotFoundError("Symbol not found: vkCmdCopyQueryPoolResults");
        try { Handles.MH_vkCmdCopyQueryPoolResults.invokeExact(handles.PFN_vkCmdCopyQueryPoolResults, commandBuffer, queryPool, firstQuery, queryCount, dstBuffer, dstOffset, stride, flags); }
        catch (Throwable e) { throw new RuntimeException("error in CmdCopyQueryPoolResults", e); }
    }

    /// ```
    /// void vkCmdPushConstants(VkCommandBuffer commandBuffer, VkPipelineLayout layout, VkShaderStageFlags stageFlags, uint32_t offset, uint32_t size, const void* pValues);
    /// ```
    public void CmdPushConstants(MemorySegment commandBuffer, long layout, int stageFlags, int offset, int size, MemorySegment pValues) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCmdPushConstants)) throw new SymbolNotFoundError("Symbol not found: vkCmdPushConstants");
        try { Handles.MH_vkCmdPushConstants.invokeExact(handles.PFN_vkCmdPushConstants, commandBuffer, layout, stageFlags, offset, size, pValues); }
        catch (Throwable e) { throw new RuntimeException("error in CmdPushConstants", e); }
    }

    /// ```
    /// void vkCmdBeginRenderPass(VkCommandBuffer commandBuffer, const VkRenderPassBeginInfo* pRenderPassBegin, VkSubpassContents contents);
    /// ```
    public void CmdBeginRenderPass(MemorySegment commandBuffer, MemorySegment pRenderPassBegin, int contents) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCmdBeginRenderPass)) throw new SymbolNotFoundError("Symbol not found: vkCmdBeginRenderPass");
        try { Handles.MH_vkCmdBeginRenderPass.invokeExact(handles.PFN_vkCmdBeginRenderPass, commandBuffer, pRenderPassBegin, contents); }
        catch (Throwable e) { throw new RuntimeException("error in CmdBeginRenderPass", e); }
    }

    /// ```
    /// void vkCmdNextSubpass(VkCommandBuffer commandBuffer, VkSubpassContents contents);
    /// ```
    public void CmdNextSubpass(MemorySegment commandBuffer, int contents) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCmdNextSubpass)) throw new SymbolNotFoundError("Symbol not found: vkCmdNextSubpass");
        try { Handles.MH_vkCmdNextSubpass.invokeExact(handles.PFN_vkCmdNextSubpass, commandBuffer, contents); }
        catch (Throwable e) { throw new RuntimeException("error in CmdNextSubpass", e); }
    }

    /// ```
    /// void vkCmdEndRenderPass(VkCommandBuffer commandBuffer);
    /// ```
    public void CmdEndRenderPass(MemorySegment commandBuffer) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCmdEndRenderPass)) throw new SymbolNotFoundError("Symbol not found: vkCmdEndRenderPass");
        try { Handles.MH_vkCmdEndRenderPass.invokeExact(handles.PFN_vkCmdEndRenderPass, commandBuffer); }
        catch (Throwable e) { throw new RuntimeException("error in CmdEndRenderPass", e); }
    }

    /// ```
    /// void vkCmdExecuteCommands(VkCommandBuffer commandBuffer, uint32_t commandBufferCount, const VkCommandBuffer* pCommandBuffers);
    /// ```
    public void CmdExecuteCommands(MemorySegment commandBuffer, int commandBufferCount, MemorySegment pCommandBuffers) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCmdExecuteCommands)) throw new SymbolNotFoundError("Symbol not found: vkCmdExecuteCommands");
        try { Handles.MH_vkCmdExecuteCommands.invokeExact(handles.PFN_vkCmdExecuteCommands, commandBuffer, commandBufferCount, pCommandBuffers); }
        catch (Throwable e) { throw new RuntimeException("error in CmdExecuteCommands", e); }
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
    
    /// ```
    /// VkResult vkEnumerateInstanceExtensionProperties(const char* pLayerName, uint32_t* pPropertyCount, VkExtensionProperties* pProperties);
    /// ```
    public static int vkEnumerateInstanceExtensionProperties(VKLoadFunc func, MemorySegment pLayerName, MemorySegment pPropertyCount, MemorySegment pProperties) {
        var p = func.invoke(MemorySegment.NULL, "vkEnumerateInstanceExtensionProperties");
        if (MemoryUtil.isNullPointer(p)) throw new SymbolNotFoundError("Symbol not found: vkEnumerateInstanceExtensionProperties");
        try { return (int) Handles.MH_vkEnumerateInstanceExtensionProperties.invokeExact(p, pLayerName, pPropertyCount, pProperties); }
        catch (Throwable e) { throw new RuntimeException("error in vkEnumerateInstanceExtensionProperties", e); }
    }
    
    /// ```
    /// VkResult vkEnumerateInstanceLayerProperties(uint32_t* pPropertyCount, VkLayerProperties* pProperties);
    /// ```
    public static int vkEnumerateInstanceLayerProperties(VKLoadFunc func, MemorySegment pPropertyCount, MemorySegment pProperties) {
        var p = func.invoke(MemorySegment.NULL, "vkEnumerateInstanceLayerProperties");
        if (MemoryUtil.isNullPointer(p)) throw new SymbolNotFoundError("Symbol not found: vkEnumerateInstanceLayerProperties");
        try { return (int) Handles.MH_vkEnumerateInstanceLayerProperties.invokeExact(p, pPropertyCount, pProperties); }
        catch (Throwable e) { throw new RuntimeException("error in vkEnumerateInstanceLayerProperties", e); }
    }
    
    /// ```
    /// VkResult vkCreateInstance(const VkInstanceCreateInfo* pCreateInfo, const VkAllocationCallbacks* pAllocator, VkInstance* pInstance);
    /// ```
    public static int vkCreateInstance(VKLoadFunc func, MemorySegment pCreateInfo, MemorySegment pAllocator, MemorySegment pInstance) {
        var p = func.invoke(MemorySegment.NULL, "vkCreateInstance");
        if (MemoryUtil.isNullPointer(p)) throw new SymbolNotFoundError("Symbol not found: vkCreateInstance");
        try { return (int) Handles.MH_vkCreateInstance.invokeExact(p, pCreateInfo, pAllocator, pInstance); }
        catch (Throwable e) { throw new RuntimeException("error in vkCreateInstance", e); }
    }
    
    /// ```
    /// PFN_vkVoidFunction vkGetInstanceProcAddr(VkInstance instance, const char* pName);
    /// ```
    public static MemorySegment vkGetInstanceProcAddr(VKLoadFunc func, MemorySegment instance, MemorySegment pName) {
        var p = func.invoke(MemorySegment.NULL, "vkGetInstanceProcAddr");
        if (MemoryUtil.isNullPointer(p)) throw new SymbolNotFoundError("Symbol not found: vkGetInstanceProcAddr");
        try { return (MemorySegment) Handles.MH_vkGetInstanceProcAddr.invokeExact(p, instance, pName); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetInstanceProcAddr", e); }
    }
}
