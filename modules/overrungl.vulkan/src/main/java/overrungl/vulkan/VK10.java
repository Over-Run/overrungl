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
import overrungl.vulkan.*;
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
    public static final int VK_STENCIL_FRONT_AND_BACK = VK_STENCIL_FACE_FRONT_AND_BACK;
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
    public static final MethodHandle MH_vkQueueSubmit = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public static final MethodHandle MH_vkQueueWaitIdle = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public static final MethodHandle MH_vkDeviceWaitIdle = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public static final MethodHandle MH_vkAllocateMemory = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public static final MethodHandle MH_vkFreeMemory = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public static final MethodHandle MH_vkMapMemory = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public static final MethodHandle MH_vkUnmapMemory = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public static final MethodHandle MH_vkFlushMappedMemoryRanges = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public static final MethodHandle MH_vkInvalidateMappedMemoryRanges = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public static final MethodHandle MH_vkGetDeviceMemoryCommitment = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public static final MethodHandle MH_vkBindBufferMemory = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG));
    public static final MethodHandle MH_vkBindImageMemory = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG));
    public static final MethodHandle MH_vkGetBufferMemoryRequirements = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public static final MethodHandle MH_vkGetImageMemoryRequirements = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public static final MethodHandle MH_vkGetImageSparseMemoryRequirements = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public static final MethodHandle MH_vkGetPhysicalDeviceSparseImageFormatProperties = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public static final MethodHandle MH_vkQueueBindSparse = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public static final MethodHandle MH_vkCreateFence = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public static final MethodHandle MH_vkDestroyFence = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public static final MethodHandle MH_vkResetFences = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public static final MethodHandle MH_vkGetFenceStatus = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public static final MethodHandle MH_vkWaitForFences = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));
    public static final MethodHandle MH_vkCreateSemaphore = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public static final MethodHandle MH_vkDestroySemaphore = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public static final MethodHandle MH_vkCreateEvent = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public static final MethodHandle MH_vkDestroyEvent = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public static final MethodHandle MH_vkGetEventStatus = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public static final MethodHandle MH_vkSetEvent = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public static final MethodHandle MH_vkResetEvent = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public static final MethodHandle MH_vkCreateQueryPool = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public static final MethodHandle MH_vkDestroyQueryPool = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public static final MethodHandle MH_vkGetQueryPoolResults = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT));
    public static final MethodHandle MH_vkCreateBuffer = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public static final MethodHandle MH_vkDestroyBuffer = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public static final MethodHandle MH_vkCreateBufferView = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public static final MethodHandle MH_vkDestroyBufferView = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public static final MethodHandle MH_vkCreateImage = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public static final MethodHandle MH_vkDestroyImage = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public static final MethodHandle MH_vkGetImageSubresourceLayout = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public static final MethodHandle MH_vkCreateImageView = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public static final MethodHandle MH_vkDestroyImageView = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public static final MethodHandle MH_vkCreateShaderModule = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public static final MethodHandle MH_vkDestroyShaderModule = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public static final MethodHandle MH_vkCreatePipelineCache = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public static final MethodHandle MH_vkDestroyPipelineCache = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public static final MethodHandle MH_vkGetPipelineCacheData = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public static final MethodHandle MH_vkMergePipelineCaches = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public static final MethodHandle MH_vkCreateGraphicsPipelines = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public static final MethodHandle MH_vkCreateComputePipelines = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public static final MethodHandle MH_vkDestroyPipeline = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public static final MethodHandle MH_vkCreatePipelineLayout = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public static final MethodHandle MH_vkDestroyPipelineLayout = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public static final MethodHandle MH_vkCreateSampler = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public static final MethodHandle MH_vkDestroySampler = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public static final MethodHandle MH_vkCreateDescriptorSetLayout = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public static final MethodHandle MH_vkDestroyDescriptorSetLayout = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public static final MethodHandle MH_vkCreateDescriptorPool = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public static final MethodHandle MH_vkDestroyDescriptorPool = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public static final MethodHandle MH_vkResetDescriptorPool = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
    public static final MethodHandle MH_vkAllocateDescriptorSets = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public static final MethodHandle MH_vkFreeDescriptorSets = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public static final MethodHandle MH_vkUpdateDescriptorSets = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public static final MethodHandle MH_vkCreateFramebuffer = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public static final MethodHandle MH_vkDestroyFramebuffer = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public static final MethodHandle MH_vkCreateRenderPass = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public static final MethodHandle MH_vkDestroyRenderPass = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public static final MethodHandle MH_vkGetRenderAreaGranularity = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public static final MethodHandle MH_vkCreateCommandPool = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public static final MethodHandle MH_vkDestroyCommandPool = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public static final MethodHandle MH_vkResetCommandPool = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
    public static final MethodHandle MH_vkAllocateCommandBuffers = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public static final MethodHandle MH_vkFreeCommandBuffers = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public static final MethodHandle MH_vkBeginCommandBuffer = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public static final MethodHandle MH_vkEndCommandBuffer = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public static final MethodHandle MH_vkResetCommandBuffer = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
    public static final MethodHandle MH_vkCmdBindPipeline = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public static final MethodHandle MH_vkCmdSetViewport = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public static final MethodHandle MH_vkCmdSetScissor = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public static final MethodHandle MH_vkCmdSetLineWidth = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT));
    public static final MethodHandle MH_vkCmdSetDepthBias = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));
    public static final MethodHandle MH_vkCmdSetBlendConstants = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT));
    public static final MethodHandle MH_vkCmdSetDepthBounds = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));
    public static final MethodHandle MH_vkCmdSetStencilCompareMask = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public static final MethodHandle MH_vkCmdSetStencilWriteMask = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public static final MethodHandle MH_vkCmdSetStencilReference = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public static final MethodHandle MH_vkCmdBindDescriptorSets = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public static final MethodHandle MH_vkCmdBindIndexBuffer = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT));
    public static final MethodHandle MH_vkCmdBindVertexBuffers = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public static final MethodHandle MH_vkCmdDraw = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public static final MethodHandle MH_vkCmdDrawIndexed = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public static final MethodHandle MH_vkCmdDrawIndirect = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public static final MethodHandle MH_vkCmdDrawIndexedIndirect = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public static final MethodHandle MH_vkCmdDispatch = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public static final MethodHandle MH_vkCmdDispatchIndirect = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG));
    public static final MethodHandle MH_vkCmdCopyBuffer = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public static final MethodHandle MH_vkCmdCopyImage = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public static final MethodHandle MH_vkCmdBlitImage = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
    public static final MethodHandle MH_vkCmdCopyBufferToImage = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public static final MethodHandle MH_vkCmdCopyImageToBuffer = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public static final MethodHandle MH_vkCmdUpdateBuffer = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS));
    public static final MethodHandle MH_vkCmdFillBuffer = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT));
    public static final MethodHandle MH_vkCmdClearColorImage = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public static final MethodHandle MH_vkCmdClearDepthStencilImage = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public static final MethodHandle MH_vkCmdClearAttachments = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public static final MethodHandle MH_vkCmdResolveImage = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public static final MethodHandle MH_vkCmdSetEvent = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
    public static final MethodHandle MH_vkCmdResetEvent = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
    public static final MethodHandle MH_vkCmdWaitEvents = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public static final MethodHandle MH_vkCmdPipelineBarrier = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public static final MethodHandle MH_vkCmdBeginQuery = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public static final MethodHandle MH_vkCmdEndQuery = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
    public static final MethodHandle MH_vkCmdResetQueryPool = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public static final MethodHandle MH_vkCmdWriteTimestamp = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
    public static final MethodHandle MH_vkCmdCopyQueryPoolResults = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT));
    public static final MethodHandle MH_vkCmdPushConstants = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
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

    public VK10(@CType("VkInstance") MemorySegment instance, VKLoadFunc func) {
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

    public @CType("VkResult") int CreateInstance(@CType("const VkInstanceCreateInfo *") MemorySegment pCreateInfo, @CType("const VkAllocationCallbacks *") MemorySegment pAllocator, @CType("VkInstance *") MemorySegment pInstance) {
        if (Unmarshal.isNullPointer(PFN_vkCreateInstance)) throw new SymbolNotFoundError("Symbol not found: vkCreateInstance");
        try { return (int) MH_vkCreateInstance.invokeExact(PFN_vkCreateInstance, pCreateInfo, pAllocator, pInstance); }
        catch (Throwable e) { throw new RuntimeException("error in vkCreateInstance", e); }
    }

    public void DestroyInstance(@CType("VkInstance") MemorySegment instance, @CType("const VkAllocationCallbacks *") MemorySegment pAllocator) {
        if (Unmarshal.isNullPointer(PFN_vkDestroyInstance)) throw new SymbolNotFoundError("Symbol not found: vkDestroyInstance");
        try { MH_vkDestroyInstance.invokeExact(PFN_vkDestroyInstance, instance, pAllocator); }
        catch (Throwable e) { throw new RuntimeException("error in vkDestroyInstance", e); }
    }

    public @CType("VkResult") int EnumeratePhysicalDevices(@CType("VkInstance") MemorySegment instance, @CType("uint32_t *") MemorySegment pPhysicalDeviceCount, @CType("VkPhysicalDevice *") MemorySegment pPhysicalDevices) {
        if (Unmarshal.isNullPointer(PFN_vkEnumeratePhysicalDevices)) throw new SymbolNotFoundError("Symbol not found: vkEnumeratePhysicalDevices");
        try { return (int) MH_vkEnumeratePhysicalDevices.invokeExact(PFN_vkEnumeratePhysicalDevices, instance, pPhysicalDeviceCount, pPhysicalDevices); }
        catch (Throwable e) { throw new RuntimeException("error in vkEnumeratePhysicalDevices", e); }
    }

    public void GetPhysicalDeviceFeatures(@CType("VkPhysicalDevice") MemorySegment physicalDevice, @CType("VkPhysicalDeviceFeatures *") MemorySegment pFeatures) {
        if (Unmarshal.isNullPointer(PFN_vkGetPhysicalDeviceFeatures)) throw new SymbolNotFoundError("Symbol not found: vkGetPhysicalDeviceFeatures");
        try { MH_vkGetPhysicalDeviceFeatures.invokeExact(PFN_vkGetPhysicalDeviceFeatures, physicalDevice, pFeatures); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetPhysicalDeviceFeatures", e); }
    }

    public void GetPhysicalDeviceFormatProperties(@CType("VkPhysicalDevice") MemorySegment physicalDevice, @CType("VkFormat") int format, @CType("VkFormatProperties *") MemorySegment pFormatProperties) {
        if (Unmarshal.isNullPointer(PFN_vkGetPhysicalDeviceFormatProperties)) throw new SymbolNotFoundError("Symbol not found: vkGetPhysicalDeviceFormatProperties");
        try { MH_vkGetPhysicalDeviceFormatProperties.invokeExact(PFN_vkGetPhysicalDeviceFormatProperties, physicalDevice, format, pFormatProperties); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetPhysicalDeviceFormatProperties", e); }
    }

    public @CType("VkResult") int GetPhysicalDeviceImageFormatProperties(@CType("VkPhysicalDevice") MemorySegment physicalDevice, @CType("VkFormat") int format, @CType("VkImageType") int type, @CType("VkImageTiling") int tiling, @CType("VkImageUsageFlags") int usage, @CType("VkImageCreateFlags") int flags, @CType("VkImageFormatProperties *") MemorySegment pImageFormatProperties) {
        if (Unmarshal.isNullPointer(PFN_vkGetPhysicalDeviceImageFormatProperties)) throw new SymbolNotFoundError("Symbol not found: vkGetPhysicalDeviceImageFormatProperties");
        try { return (int) MH_vkGetPhysicalDeviceImageFormatProperties.invokeExact(PFN_vkGetPhysicalDeviceImageFormatProperties, physicalDevice, format, type, tiling, usage, flags, pImageFormatProperties); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetPhysicalDeviceImageFormatProperties", e); }
    }

    public void GetPhysicalDeviceProperties(@CType("VkPhysicalDevice") MemorySegment physicalDevice, @CType("VkPhysicalDeviceProperties *") MemorySegment pProperties) {
        if (Unmarshal.isNullPointer(PFN_vkGetPhysicalDeviceProperties)) throw new SymbolNotFoundError("Symbol not found: vkGetPhysicalDeviceProperties");
        try { MH_vkGetPhysicalDeviceProperties.invokeExact(PFN_vkGetPhysicalDeviceProperties, physicalDevice, pProperties); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetPhysicalDeviceProperties", e); }
    }

    public void GetPhysicalDeviceQueueFamilyProperties(@CType("VkPhysicalDevice") MemorySegment physicalDevice, @CType("uint32_t *") MemorySegment pQueueFamilyPropertyCount, @CType("VkQueueFamilyProperties *") MemorySegment pQueueFamilyProperties) {
        if (Unmarshal.isNullPointer(PFN_vkGetPhysicalDeviceQueueFamilyProperties)) throw new SymbolNotFoundError("Symbol not found: vkGetPhysicalDeviceQueueFamilyProperties");
        try { MH_vkGetPhysicalDeviceQueueFamilyProperties.invokeExact(PFN_vkGetPhysicalDeviceQueueFamilyProperties, physicalDevice, pQueueFamilyPropertyCount, pQueueFamilyProperties); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetPhysicalDeviceQueueFamilyProperties", e); }
    }

    public void GetPhysicalDeviceMemoryProperties(@CType("VkPhysicalDevice") MemorySegment physicalDevice, @CType("VkPhysicalDeviceMemoryProperties *") MemorySegment pMemoryProperties) {
        if (Unmarshal.isNullPointer(PFN_vkGetPhysicalDeviceMemoryProperties)) throw new SymbolNotFoundError("Symbol not found: vkGetPhysicalDeviceMemoryProperties");
        try { MH_vkGetPhysicalDeviceMemoryProperties.invokeExact(PFN_vkGetPhysicalDeviceMemoryProperties, physicalDevice, pMemoryProperties); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetPhysicalDeviceMemoryProperties", e); }
    }

    public @CType("PFN_vkVoidFunction") MemorySegment GetInstanceProcAddr(@CType("VkInstance") MemorySegment instance, @CType("const char *") MemorySegment pName) {
        if (Unmarshal.isNullPointer(PFN_vkGetInstanceProcAddr)) throw new SymbolNotFoundError("Symbol not found: vkGetInstanceProcAddr");
        try { return (MemorySegment) MH_vkGetInstanceProcAddr.invokeExact(PFN_vkGetInstanceProcAddr, instance, pName); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetInstanceProcAddr", e); }
    }

    public @CType("PFN_vkVoidFunction") MemorySegment GetDeviceProcAddr(@CType("VkDevice") MemorySegment device, @CType("const char *") MemorySegment pName) {
        if (Unmarshal.isNullPointer(PFN_vkGetDeviceProcAddr)) throw new SymbolNotFoundError("Symbol not found: vkGetDeviceProcAddr");
        try { return (MemorySegment) MH_vkGetDeviceProcAddr.invokeExact(PFN_vkGetDeviceProcAddr, device, pName); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetDeviceProcAddr", e); }
    }

    public @CType("VkResult") int CreateDevice(@CType("VkPhysicalDevice") MemorySegment physicalDevice, @CType("const VkDeviceCreateInfo *") MemorySegment pCreateInfo, @CType("const VkAllocationCallbacks *") MemorySegment pAllocator, @CType("VkDevice *") MemorySegment pDevice) {
        if (Unmarshal.isNullPointer(PFN_vkCreateDevice)) throw new SymbolNotFoundError("Symbol not found: vkCreateDevice");
        try { return (int) MH_vkCreateDevice.invokeExact(PFN_vkCreateDevice, physicalDevice, pCreateInfo, pAllocator, pDevice); }
        catch (Throwable e) { throw new RuntimeException("error in vkCreateDevice", e); }
    }

    public void DestroyDevice(@CType("VkDevice") MemorySegment device, @CType("const VkAllocationCallbacks *") MemorySegment pAllocator) {
        if (Unmarshal.isNullPointer(PFN_vkDestroyDevice)) throw new SymbolNotFoundError("Symbol not found: vkDestroyDevice");
        try { MH_vkDestroyDevice.invokeExact(PFN_vkDestroyDevice, device, pAllocator); }
        catch (Throwable e) { throw new RuntimeException("error in vkDestroyDevice", e); }
    }

    public @CType("VkResult") int EnumerateInstanceExtensionProperties(@CType("const char *") MemorySegment pLayerName, @CType("uint32_t *") MemorySegment pPropertyCount, @CType("VkExtensionProperties *") MemorySegment pProperties) {
        if (Unmarshal.isNullPointer(PFN_vkEnumerateInstanceExtensionProperties)) throw new SymbolNotFoundError("Symbol not found: vkEnumerateInstanceExtensionProperties");
        try { return (int) MH_vkEnumerateInstanceExtensionProperties.invokeExact(PFN_vkEnumerateInstanceExtensionProperties, pLayerName, pPropertyCount, pProperties); }
        catch (Throwable e) { throw new RuntimeException("error in vkEnumerateInstanceExtensionProperties", e); }
    }

    public @CType("VkResult") int EnumerateDeviceExtensionProperties(@CType("VkPhysicalDevice") MemorySegment physicalDevice, @CType("const char *") MemorySegment pLayerName, @CType("uint32_t *") MemorySegment pPropertyCount, @CType("VkExtensionProperties *") MemorySegment pProperties) {
        if (Unmarshal.isNullPointer(PFN_vkEnumerateDeviceExtensionProperties)) throw new SymbolNotFoundError("Symbol not found: vkEnumerateDeviceExtensionProperties");
        try { return (int) MH_vkEnumerateDeviceExtensionProperties.invokeExact(PFN_vkEnumerateDeviceExtensionProperties, physicalDevice, pLayerName, pPropertyCount, pProperties); }
        catch (Throwable e) { throw new RuntimeException("error in vkEnumerateDeviceExtensionProperties", e); }
    }

    public @CType("VkResult") int EnumerateInstanceLayerProperties(@CType("uint32_t *") MemorySegment pPropertyCount, @CType("VkLayerProperties *") MemorySegment pProperties) {
        if (Unmarshal.isNullPointer(PFN_vkEnumerateInstanceLayerProperties)) throw new SymbolNotFoundError("Symbol not found: vkEnumerateInstanceLayerProperties");
        try { return (int) MH_vkEnumerateInstanceLayerProperties.invokeExact(PFN_vkEnumerateInstanceLayerProperties, pPropertyCount, pProperties); }
        catch (Throwable e) { throw new RuntimeException("error in vkEnumerateInstanceLayerProperties", e); }
    }

    public @CType("VkResult") int EnumerateDeviceLayerProperties(@CType("VkPhysicalDevice") MemorySegment physicalDevice, @CType("uint32_t *") MemorySegment pPropertyCount, @CType("VkLayerProperties *") MemorySegment pProperties) {
        if (Unmarshal.isNullPointer(PFN_vkEnumerateDeviceLayerProperties)) throw new SymbolNotFoundError("Symbol not found: vkEnumerateDeviceLayerProperties");
        try { return (int) MH_vkEnumerateDeviceLayerProperties.invokeExact(PFN_vkEnumerateDeviceLayerProperties, physicalDevice, pPropertyCount, pProperties); }
        catch (Throwable e) { throw new RuntimeException("error in vkEnumerateDeviceLayerProperties", e); }
    }

    public void GetDeviceQueue(@CType("VkDevice") MemorySegment device, @CType("uint32_t") int queueFamilyIndex, @CType("uint32_t") int queueIndex, @CType("VkQueue *") MemorySegment pQueue) {
        if (Unmarshal.isNullPointer(PFN_vkGetDeviceQueue)) throw new SymbolNotFoundError("Symbol not found: vkGetDeviceQueue");
        try { MH_vkGetDeviceQueue.invokeExact(PFN_vkGetDeviceQueue, device, queueFamilyIndex, queueIndex, pQueue); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetDeviceQueue", e); }
    }

    public @CType("VkResult") int QueueSubmit(@CType("VkQueue") MemorySegment queue, @CType("uint32_t") int submitCount, @CType("const VkSubmitInfo *") MemorySegment pSubmits, @CType("VkFence") MemorySegment fence) {
        if (Unmarshal.isNullPointer(PFN_vkQueueSubmit)) throw new SymbolNotFoundError("Symbol not found: vkQueueSubmit");
        try { return (int) MH_vkQueueSubmit.invokeExact(PFN_vkQueueSubmit, queue, submitCount, pSubmits, fence); }
        catch (Throwable e) { throw new RuntimeException("error in vkQueueSubmit", e); }
    }

    public @CType("VkResult") int QueueWaitIdle(@CType("VkQueue") MemorySegment queue) {
        if (Unmarshal.isNullPointer(PFN_vkQueueWaitIdle)) throw new SymbolNotFoundError("Symbol not found: vkQueueWaitIdle");
        try { return (int) MH_vkQueueWaitIdle.invokeExact(PFN_vkQueueWaitIdle, queue); }
        catch (Throwable e) { throw new RuntimeException("error in vkQueueWaitIdle", e); }
    }

    public @CType("VkResult") int DeviceWaitIdle(@CType("VkDevice") MemorySegment device) {
        if (Unmarshal.isNullPointer(PFN_vkDeviceWaitIdle)) throw new SymbolNotFoundError("Symbol not found: vkDeviceWaitIdle");
        try { return (int) MH_vkDeviceWaitIdle.invokeExact(PFN_vkDeviceWaitIdle, device); }
        catch (Throwable e) { throw new RuntimeException("error in vkDeviceWaitIdle", e); }
    }

    public @CType("VkResult") int AllocateMemory(@CType("VkDevice") MemorySegment device, @CType("const VkMemoryAllocateInfo *") MemorySegment pAllocateInfo, @CType("const VkAllocationCallbacks *") MemorySegment pAllocator, @CType("VkDeviceMemory *") MemorySegment pMemory) {
        if (Unmarshal.isNullPointer(PFN_vkAllocateMemory)) throw new SymbolNotFoundError("Symbol not found: vkAllocateMemory");
        try { return (int) MH_vkAllocateMemory.invokeExact(PFN_vkAllocateMemory, device, pAllocateInfo, pAllocator, pMemory); }
        catch (Throwable e) { throw new RuntimeException("error in vkAllocateMemory", e); }
    }

    public void FreeMemory(@CType("VkDevice") MemorySegment device, @CType("VkDeviceMemory") MemorySegment memory, @CType("const VkAllocationCallbacks *") MemorySegment pAllocator) {
        if (Unmarshal.isNullPointer(PFN_vkFreeMemory)) throw new SymbolNotFoundError("Symbol not found: vkFreeMemory");
        try { MH_vkFreeMemory.invokeExact(PFN_vkFreeMemory, device, memory, pAllocator); }
        catch (Throwable e) { throw new RuntimeException("error in vkFreeMemory", e); }
    }

    public @CType("VkResult") int MapMemory(@CType("VkDevice") MemorySegment device, @CType("VkDeviceMemory") MemorySegment memory, @CType("VkDeviceSize") long offset, @CType("VkDeviceSize") long size, @CType("VkMemoryMapFlags") int flags, @CType("void **") MemorySegment ppData) {
        if (Unmarshal.isNullPointer(PFN_vkMapMemory)) throw new SymbolNotFoundError("Symbol not found: vkMapMemory");
        try { return (int) MH_vkMapMemory.invokeExact(PFN_vkMapMemory, device, memory, offset, size, flags, ppData); }
        catch (Throwable e) { throw new RuntimeException("error in vkMapMemory", e); }
    }

    public void UnmapMemory(@CType("VkDevice") MemorySegment device, @CType("VkDeviceMemory") MemorySegment memory) {
        if (Unmarshal.isNullPointer(PFN_vkUnmapMemory)) throw new SymbolNotFoundError("Symbol not found: vkUnmapMemory");
        try { MH_vkUnmapMemory.invokeExact(PFN_vkUnmapMemory, device, memory); }
        catch (Throwable e) { throw new RuntimeException("error in vkUnmapMemory", e); }
    }

    public @CType("VkResult") int FlushMappedMemoryRanges(@CType("VkDevice") MemorySegment device, @CType("uint32_t") int memoryRangeCount, @CType("const VkMappedMemoryRange *") MemorySegment pMemoryRanges) {
        if (Unmarshal.isNullPointer(PFN_vkFlushMappedMemoryRanges)) throw new SymbolNotFoundError("Symbol not found: vkFlushMappedMemoryRanges");
        try { return (int) MH_vkFlushMappedMemoryRanges.invokeExact(PFN_vkFlushMappedMemoryRanges, device, memoryRangeCount, pMemoryRanges); }
        catch (Throwable e) { throw new RuntimeException("error in vkFlushMappedMemoryRanges", e); }
    }

    public @CType("VkResult") int InvalidateMappedMemoryRanges(@CType("VkDevice") MemorySegment device, @CType("uint32_t") int memoryRangeCount, @CType("const VkMappedMemoryRange *") MemorySegment pMemoryRanges) {
        if (Unmarshal.isNullPointer(PFN_vkInvalidateMappedMemoryRanges)) throw new SymbolNotFoundError("Symbol not found: vkInvalidateMappedMemoryRanges");
        try { return (int) MH_vkInvalidateMappedMemoryRanges.invokeExact(PFN_vkInvalidateMappedMemoryRanges, device, memoryRangeCount, pMemoryRanges); }
        catch (Throwable e) { throw new RuntimeException("error in vkInvalidateMappedMemoryRanges", e); }
    }

    public void GetDeviceMemoryCommitment(@CType("VkDevice") MemorySegment device, @CType("VkDeviceMemory") MemorySegment memory, @CType("VkDeviceSize *") MemorySegment pCommittedMemoryInBytes) {
        if (Unmarshal.isNullPointer(PFN_vkGetDeviceMemoryCommitment)) throw new SymbolNotFoundError("Symbol not found: vkGetDeviceMemoryCommitment");
        try { MH_vkGetDeviceMemoryCommitment.invokeExact(PFN_vkGetDeviceMemoryCommitment, device, memory, pCommittedMemoryInBytes); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetDeviceMemoryCommitment", e); }
    }

    public @CType("VkResult") int BindBufferMemory(@CType("VkDevice") MemorySegment device, @CType("VkBuffer") MemorySegment buffer, @CType("VkDeviceMemory") MemorySegment memory, @CType("VkDeviceSize") long memoryOffset) {
        if (Unmarshal.isNullPointer(PFN_vkBindBufferMemory)) throw new SymbolNotFoundError("Symbol not found: vkBindBufferMemory");
        try { return (int) MH_vkBindBufferMemory.invokeExact(PFN_vkBindBufferMemory, device, buffer, memory, memoryOffset); }
        catch (Throwable e) { throw new RuntimeException("error in vkBindBufferMemory", e); }
    }

    public @CType("VkResult") int BindImageMemory(@CType("VkDevice") MemorySegment device, @CType("VkImage") MemorySegment image, @CType("VkDeviceMemory") MemorySegment memory, @CType("VkDeviceSize") long memoryOffset) {
        if (Unmarshal.isNullPointer(PFN_vkBindImageMemory)) throw new SymbolNotFoundError("Symbol not found: vkBindImageMemory");
        try { return (int) MH_vkBindImageMemory.invokeExact(PFN_vkBindImageMemory, device, image, memory, memoryOffset); }
        catch (Throwable e) { throw new RuntimeException("error in vkBindImageMemory", e); }
    }

    public void GetBufferMemoryRequirements(@CType("VkDevice") MemorySegment device, @CType("VkBuffer") MemorySegment buffer, @CType("VkMemoryRequirements *") MemorySegment pMemoryRequirements) {
        if (Unmarshal.isNullPointer(PFN_vkGetBufferMemoryRequirements)) throw new SymbolNotFoundError("Symbol not found: vkGetBufferMemoryRequirements");
        try { MH_vkGetBufferMemoryRequirements.invokeExact(PFN_vkGetBufferMemoryRequirements, device, buffer, pMemoryRequirements); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetBufferMemoryRequirements", e); }
    }

    public void GetImageMemoryRequirements(@CType("VkDevice") MemorySegment device, @CType("VkImage") MemorySegment image, @CType("VkMemoryRequirements *") MemorySegment pMemoryRequirements) {
        if (Unmarshal.isNullPointer(PFN_vkGetImageMemoryRequirements)) throw new SymbolNotFoundError("Symbol not found: vkGetImageMemoryRequirements");
        try { MH_vkGetImageMemoryRequirements.invokeExact(PFN_vkGetImageMemoryRequirements, device, image, pMemoryRequirements); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetImageMemoryRequirements", e); }
    }

    public void GetImageSparseMemoryRequirements(@CType("VkDevice") MemorySegment device, @CType("VkImage") MemorySegment image, @CType("uint32_t *") MemorySegment pSparseMemoryRequirementCount, @CType("VkSparseImageMemoryRequirements *") MemorySegment pSparseMemoryRequirements) {
        if (Unmarshal.isNullPointer(PFN_vkGetImageSparseMemoryRequirements)) throw new SymbolNotFoundError("Symbol not found: vkGetImageSparseMemoryRequirements");
        try { MH_vkGetImageSparseMemoryRequirements.invokeExact(PFN_vkGetImageSparseMemoryRequirements, device, image, pSparseMemoryRequirementCount, pSparseMemoryRequirements); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetImageSparseMemoryRequirements", e); }
    }

    public void GetPhysicalDeviceSparseImageFormatProperties(@CType("VkPhysicalDevice") MemorySegment physicalDevice, @CType("VkFormat") int format, @CType("VkImageType") int type, @CType("VkSampleCountFlagBits") int samples, @CType("VkImageUsageFlags") int usage, @CType("VkImageTiling") int tiling, @CType("uint32_t *") MemorySegment pPropertyCount, @CType("VkSparseImageFormatProperties *") MemorySegment pProperties) {
        if (Unmarshal.isNullPointer(PFN_vkGetPhysicalDeviceSparseImageFormatProperties)) throw new SymbolNotFoundError("Symbol not found: vkGetPhysicalDeviceSparseImageFormatProperties");
        try { MH_vkGetPhysicalDeviceSparseImageFormatProperties.invokeExact(PFN_vkGetPhysicalDeviceSparseImageFormatProperties, physicalDevice, format, type, samples, usage, tiling, pPropertyCount, pProperties); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetPhysicalDeviceSparseImageFormatProperties", e); }
    }

    public @CType("VkResult") int QueueBindSparse(@CType("VkQueue") MemorySegment queue, @CType("uint32_t") int bindInfoCount, @CType("const VkBindSparseInfo *") MemorySegment pBindInfo, @CType("VkFence") MemorySegment fence) {
        if (Unmarshal.isNullPointer(PFN_vkQueueBindSparse)) throw new SymbolNotFoundError("Symbol not found: vkQueueBindSparse");
        try { return (int) MH_vkQueueBindSparse.invokeExact(PFN_vkQueueBindSparse, queue, bindInfoCount, pBindInfo, fence); }
        catch (Throwable e) { throw new RuntimeException("error in vkQueueBindSparse", e); }
    }

    public @CType("VkResult") int CreateFence(@CType("VkDevice") MemorySegment device, @CType("const VkFenceCreateInfo *") MemorySegment pCreateInfo, @CType("const VkAllocationCallbacks *") MemorySegment pAllocator, @CType("VkFence *") MemorySegment pFence) {
        if (Unmarshal.isNullPointer(PFN_vkCreateFence)) throw new SymbolNotFoundError("Symbol not found: vkCreateFence");
        try { return (int) MH_vkCreateFence.invokeExact(PFN_vkCreateFence, device, pCreateInfo, pAllocator, pFence); }
        catch (Throwable e) { throw new RuntimeException("error in vkCreateFence", e); }
    }

    public void DestroyFence(@CType("VkDevice") MemorySegment device, @CType("VkFence") MemorySegment fence, @CType("const VkAllocationCallbacks *") MemorySegment pAllocator) {
        if (Unmarshal.isNullPointer(PFN_vkDestroyFence)) throw new SymbolNotFoundError("Symbol not found: vkDestroyFence");
        try { MH_vkDestroyFence.invokeExact(PFN_vkDestroyFence, device, fence, pAllocator); }
        catch (Throwable e) { throw new RuntimeException("error in vkDestroyFence", e); }
    }

    public @CType("VkResult") int ResetFences(@CType("VkDevice") MemorySegment device, @CType("uint32_t") int fenceCount, @CType("const VkFence *") MemorySegment pFences) {
        if (Unmarshal.isNullPointer(PFN_vkResetFences)) throw new SymbolNotFoundError("Symbol not found: vkResetFences");
        try { return (int) MH_vkResetFences.invokeExact(PFN_vkResetFences, device, fenceCount, pFences); }
        catch (Throwable e) { throw new RuntimeException("error in vkResetFences", e); }
    }

    public @CType("VkResult") int GetFenceStatus(@CType("VkDevice") MemorySegment device, @CType("VkFence") MemorySegment fence) {
        if (Unmarshal.isNullPointer(PFN_vkGetFenceStatus)) throw new SymbolNotFoundError("Symbol not found: vkGetFenceStatus");
        try { return (int) MH_vkGetFenceStatus.invokeExact(PFN_vkGetFenceStatus, device, fence); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetFenceStatus", e); }
    }

    public @CType("VkResult") int WaitForFences(@CType("VkDevice") MemorySegment device, @CType("uint32_t") int fenceCount, @CType("const VkFence *") MemorySegment pFences, @CType("VkBool32") int waitAll, @CType("uint64_t") long timeout) {
        if (Unmarshal.isNullPointer(PFN_vkWaitForFences)) throw new SymbolNotFoundError("Symbol not found: vkWaitForFences");
        try { return (int) MH_vkWaitForFences.invokeExact(PFN_vkWaitForFences, device, fenceCount, pFences, waitAll, timeout); }
        catch (Throwable e) { throw new RuntimeException("error in vkWaitForFences", e); }
    }

    public @CType("VkResult") int CreateSemaphore(@CType("VkDevice") MemorySegment device, @CType("const VkSemaphoreCreateInfo *") MemorySegment pCreateInfo, @CType("const VkAllocationCallbacks *") MemorySegment pAllocator, @CType("VkSemaphore *") MemorySegment pSemaphore) {
        if (Unmarshal.isNullPointer(PFN_vkCreateSemaphore)) throw new SymbolNotFoundError("Symbol not found: vkCreateSemaphore");
        try { return (int) MH_vkCreateSemaphore.invokeExact(PFN_vkCreateSemaphore, device, pCreateInfo, pAllocator, pSemaphore); }
        catch (Throwable e) { throw new RuntimeException("error in vkCreateSemaphore", e); }
    }

    public void DestroySemaphore(@CType("VkDevice") MemorySegment device, @CType("VkSemaphore") MemorySegment semaphore, @CType("const VkAllocationCallbacks *") MemorySegment pAllocator) {
        if (Unmarshal.isNullPointer(PFN_vkDestroySemaphore)) throw new SymbolNotFoundError("Symbol not found: vkDestroySemaphore");
        try { MH_vkDestroySemaphore.invokeExact(PFN_vkDestroySemaphore, device, semaphore, pAllocator); }
        catch (Throwable e) { throw new RuntimeException("error in vkDestroySemaphore", e); }
    }

    public @CType("VkResult") int CreateEvent(@CType("VkDevice") MemorySegment device, @CType("const VkEventCreateInfo *") MemorySegment pCreateInfo, @CType("const VkAllocationCallbacks *") MemorySegment pAllocator, @CType("VkEvent *") MemorySegment pEvent) {
        if (Unmarshal.isNullPointer(PFN_vkCreateEvent)) throw new SymbolNotFoundError("Symbol not found: vkCreateEvent");
        try { return (int) MH_vkCreateEvent.invokeExact(PFN_vkCreateEvent, device, pCreateInfo, pAllocator, pEvent); }
        catch (Throwable e) { throw new RuntimeException("error in vkCreateEvent", e); }
    }

    public void DestroyEvent(@CType("VkDevice") MemorySegment device, @CType("VkEvent") MemorySegment event, @CType("const VkAllocationCallbacks *") MemorySegment pAllocator) {
        if (Unmarshal.isNullPointer(PFN_vkDestroyEvent)) throw new SymbolNotFoundError("Symbol not found: vkDestroyEvent");
        try { MH_vkDestroyEvent.invokeExact(PFN_vkDestroyEvent, device, event, pAllocator); }
        catch (Throwable e) { throw new RuntimeException("error in vkDestroyEvent", e); }
    }

    public @CType("VkResult") int GetEventStatus(@CType("VkDevice") MemorySegment device, @CType("VkEvent") MemorySegment event) {
        if (Unmarshal.isNullPointer(PFN_vkGetEventStatus)) throw new SymbolNotFoundError("Symbol not found: vkGetEventStatus");
        try { return (int) MH_vkGetEventStatus.invokeExact(PFN_vkGetEventStatus, device, event); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetEventStatus", e); }
    }

    public @CType("VkResult") int SetEvent(@CType("VkDevice") MemorySegment device, @CType("VkEvent") MemorySegment event) {
        if (Unmarshal.isNullPointer(PFN_vkSetEvent)) throw new SymbolNotFoundError("Symbol not found: vkSetEvent");
        try { return (int) MH_vkSetEvent.invokeExact(PFN_vkSetEvent, device, event); }
        catch (Throwable e) { throw new RuntimeException("error in vkSetEvent", e); }
    }

    public @CType("VkResult") int ResetEvent(@CType("VkDevice") MemorySegment device, @CType("VkEvent") MemorySegment event) {
        if (Unmarshal.isNullPointer(PFN_vkResetEvent)) throw new SymbolNotFoundError("Symbol not found: vkResetEvent");
        try { return (int) MH_vkResetEvent.invokeExact(PFN_vkResetEvent, device, event); }
        catch (Throwable e) { throw new RuntimeException("error in vkResetEvent", e); }
    }

    public @CType("VkResult") int CreateQueryPool(@CType("VkDevice") MemorySegment device, @CType("const VkQueryPoolCreateInfo *") MemorySegment pCreateInfo, @CType("const VkAllocationCallbacks *") MemorySegment pAllocator, @CType("VkQueryPool *") MemorySegment pQueryPool) {
        if (Unmarshal.isNullPointer(PFN_vkCreateQueryPool)) throw new SymbolNotFoundError("Symbol not found: vkCreateQueryPool");
        try { return (int) MH_vkCreateQueryPool.invokeExact(PFN_vkCreateQueryPool, device, pCreateInfo, pAllocator, pQueryPool); }
        catch (Throwable e) { throw new RuntimeException("error in vkCreateQueryPool", e); }
    }

    public void DestroyQueryPool(@CType("VkDevice") MemorySegment device, @CType("VkQueryPool") MemorySegment queryPool, @CType("const VkAllocationCallbacks *") MemorySegment pAllocator) {
        if (Unmarshal.isNullPointer(PFN_vkDestroyQueryPool)) throw new SymbolNotFoundError("Symbol not found: vkDestroyQueryPool");
        try { MH_vkDestroyQueryPool.invokeExact(PFN_vkDestroyQueryPool, device, queryPool, pAllocator); }
        catch (Throwable e) { throw new RuntimeException("error in vkDestroyQueryPool", e); }
    }

    public @CType("VkResult") int GetQueryPoolResults(@CType("VkDevice") MemorySegment device, @CType("VkQueryPool") MemorySegment queryPool, @CType("uint32_t") int firstQuery, @CType("uint32_t") int queryCount, @CType("size_t") long dataSize, @CType("void *") MemorySegment pData, @CType("VkDeviceSize") long stride, @CType("VkQueryResultFlags") int flags) {
        if (Unmarshal.isNullPointer(PFN_vkGetQueryPoolResults)) throw new SymbolNotFoundError("Symbol not found: vkGetQueryPoolResults");
        try { return (int) MH_vkGetQueryPoolResults.invokeExact(PFN_vkGetQueryPoolResults, device, queryPool, firstQuery, queryCount, dataSize, pData, stride, flags); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetQueryPoolResults", e); }
    }

    public @CType("VkResult") int CreateBuffer(@CType("VkDevice") MemorySegment device, @CType("const VkBufferCreateInfo *") MemorySegment pCreateInfo, @CType("const VkAllocationCallbacks *") MemorySegment pAllocator, @CType("VkBuffer *") MemorySegment pBuffer) {
        if (Unmarshal.isNullPointer(PFN_vkCreateBuffer)) throw new SymbolNotFoundError("Symbol not found: vkCreateBuffer");
        try { return (int) MH_vkCreateBuffer.invokeExact(PFN_vkCreateBuffer, device, pCreateInfo, pAllocator, pBuffer); }
        catch (Throwable e) { throw new RuntimeException("error in vkCreateBuffer", e); }
    }

    public void DestroyBuffer(@CType("VkDevice") MemorySegment device, @CType("VkBuffer") MemorySegment buffer, @CType("const VkAllocationCallbacks *") MemorySegment pAllocator) {
        if (Unmarshal.isNullPointer(PFN_vkDestroyBuffer)) throw new SymbolNotFoundError("Symbol not found: vkDestroyBuffer");
        try { MH_vkDestroyBuffer.invokeExact(PFN_vkDestroyBuffer, device, buffer, pAllocator); }
        catch (Throwable e) { throw new RuntimeException("error in vkDestroyBuffer", e); }
    }

    public @CType("VkResult") int CreateBufferView(@CType("VkDevice") MemorySegment device, @CType("const VkBufferViewCreateInfo *") MemorySegment pCreateInfo, @CType("const VkAllocationCallbacks *") MemorySegment pAllocator, @CType("VkBufferView *") MemorySegment pView) {
        if (Unmarshal.isNullPointer(PFN_vkCreateBufferView)) throw new SymbolNotFoundError("Symbol not found: vkCreateBufferView");
        try { return (int) MH_vkCreateBufferView.invokeExact(PFN_vkCreateBufferView, device, pCreateInfo, pAllocator, pView); }
        catch (Throwable e) { throw new RuntimeException("error in vkCreateBufferView", e); }
    }

    public void DestroyBufferView(@CType("VkDevice") MemorySegment device, @CType("VkBufferView") MemorySegment bufferView, @CType("const VkAllocationCallbacks *") MemorySegment pAllocator) {
        if (Unmarshal.isNullPointer(PFN_vkDestroyBufferView)) throw new SymbolNotFoundError("Symbol not found: vkDestroyBufferView");
        try { MH_vkDestroyBufferView.invokeExact(PFN_vkDestroyBufferView, device, bufferView, pAllocator); }
        catch (Throwable e) { throw new RuntimeException("error in vkDestroyBufferView", e); }
    }

    public @CType("VkResult") int CreateImage(@CType("VkDevice") MemorySegment device, @CType("const VkImageCreateInfo *") MemorySegment pCreateInfo, @CType("const VkAllocationCallbacks *") MemorySegment pAllocator, @CType("VkImage *") MemorySegment pImage) {
        if (Unmarshal.isNullPointer(PFN_vkCreateImage)) throw new SymbolNotFoundError("Symbol not found: vkCreateImage");
        try { return (int) MH_vkCreateImage.invokeExact(PFN_vkCreateImage, device, pCreateInfo, pAllocator, pImage); }
        catch (Throwable e) { throw new RuntimeException("error in vkCreateImage", e); }
    }

    public void DestroyImage(@CType("VkDevice") MemorySegment device, @CType("VkImage") MemorySegment image, @CType("const VkAllocationCallbacks *") MemorySegment pAllocator) {
        if (Unmarshal.isNullPointer(PFN_vkDestroyImage)) throw new SymbolNotFoundError("Symbol not found: vkDestroyImage");
        try { MH_vkDestroyImage.invokeExact(PFN_vkDestroyImage, device, image, pAllocator); }
        catch (Throwable e) { throw new RuntimeException("error in vkDestroyImage", e); }
    }

    public void GetImageSubresourceLayout(@CType("VkDevice") MemorySegment device, @CType("VkImage") MemorySegment image, @CType("const VkImageSubresource *") MemorySegment pSubresource, @CType("VkSubresourceLayout *") MemorySegment pLayout) {
        if (Unmarshal.isNullPointer(PFN_vkGetImageSubresourceLayout)) throw new SymbolNotFoundError("Symbol not found: vkGetImageSubresourceLayout");
        try { MH_vkGetImageSubresourceLayout.invokeExact(PFN_vkGetImageSubresourceLayout, device, image, pSubresource, pLayout); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetImageSubresourceLayout", e); }
    }

    public @CType("VkResult") int CreateImageView(@CType("VkDevice") MemorySegment device, @CType("const VkImageViewCreateInfo *") MemorySegment pCreateInfo, @CType("const VkAllocationCallbacks *") MemorySegment pAllocator, @CType("VkImageView *") MemorySegment pView) {
        if (Unmarshal.isNullPointer(PFN_vkCreateImageView)) throw new SymbolNotFoundError("Symbol not found: vkCreateImageView");
        try { return (int) MH_vkCreateImageView.invokeExact(PFN_vkCreateImageView, device, pCreateInfo, pAllocator, pView); }
        catch (Throwable e) { throw new RuntimeException("error in vkCreateImageView", e); }
    }

    public void DestroyImageView(@CType("VkDevice") MemorySegment device, @CType("VkImageView") MemorySegment imageView, @CType("const VkAllocationCallbacks *") MemorySegment pAllocator) {
        if (Unmarshal.isNullPointer(PFN_vkDestroyImageView)) throw new SymbolNotFoundError("Symbol not found: vkDestroyImageView");
        try { MH_vkDestroyImageView.invokeExact(PFN_vkDestroyImageView, device, imageView, pAllocator); }
        catch (Throwable e) { throw new RuntimeException("error in vkDestroyImageView", e); }
    }

    public @CType("VkResult") int CreateShaderModule(@CType("VkDevice") MemorySegment device, @CType("const VkShaderModuleCreateInfo *") MemorySegment pCreateInfo, @CType("const VkAllocationCallbacks *") MemorySegment pAllocator, @CType("VkShaderModule *") MemorySegment pShaderModule) {
        if (Unmarshal.isNullPointer(PFN_vkCreateShaderModule)) throw new SymbolNotFoundError("Symbol not found: vkCreateShaderModule");
        try { return (int) MH_vkCreateShaderModule.invokeExact(PFN_vkCreateShaderModule, device, pCreateInfo, pAllocator, pShaderModule); }
        catch (Throwable e) { throw new RuntimeException("error in vkCreateShaderModule", e); }
    }

    public void DestroyShaderModule(@CType("VkDevice") MemorySegment device, @CType("VkShaderModule") MemorySegment shaderModule, @CType("const VkAllocationCallbacks *") MemorySegment pAllocator) {
        if (Unmarshal.isNullPointer(PFN_vkDestroyShaderModule)) throw new SymbolNotFoundError("Symbol not found: vkDestroyShaderModule");
        try { MH_vkDestroyShaderModule.invokeExact(PFN_vkDestroyShaderModule, device, shaderModule, pAllocator); }
        catch (Throwable e) { throw new RuntimeException("error in vkDestroyShaderModule", e); }
    }

    public @CType("VkResult") int CreatePipelineCache(@CType("VkDevice") MemorySegment device, @CType("const VkPipelineCacheCreateInfo *") MemorySegment pCreateInfo, @CType("const VkAllocationCallbacks *") MemorySegment pAllocator, @CType("VkPipelineCache *") MemorySegment pPipelineCache) {
        if (Unmarshal.isNullPointer(PFN_vkCreatePipelineCache)) throw new SymbolNotFoundError("Symbol not found: vkCreatePipelineCache");
        try { return (int) MH_vkCreatePipelineCache.invokeExact(PFN_vkCreatePipelineCache, device, pCreateInfo, pAllocator, pPipelineCache); }
        catch (Throwable e) { throw new RuntimeException("error in vkCreatePipelineCache", e); }
    }

    public void DestroyPipelineCache(@CType("VkDevice") MemorySegment device, @CType("VkPipelineCache") MemorySegment pipelineCache, @CType("const VkAllocationCallbacks *") MemorySegment pAllocator) {
        if (Unmarshal.isNullPointer(PFN_vkDestroyPipelineCache)) throw new SymbolNotFoundError("Symbol not found: vkDestroyPipelineCache");
        try { MH_vkDestroyPipelineCache.invokeExact(PFN_vkDestroyPipelineCache, device, pipelineCache, pAllocator); }
        catch (Throwable e) { throw new RuntimeException("error in vkDestroyPipelineCache", e); }
    }

    public @CType("VkResult") int GetPipelineCacheData(@CType("VkDevice") MemorySegment device, @CType("VkPipelineCache") MemorySegment pipelineCache, @CType("size_t *") MemorySegment pDataSize, @CType("void *") MemorySegment pData) {
        if (Unmarshal.isNullPointer(PFN_vkGetPipelineCacheData)) throw new SymbolNotFoundError("Symbol not found: vkGetPipelineCacheData");
        try { return (int) MH_vkGetPipelineCacheData.invokeExact(PFN_vkGetPipelineCacheData, device, pipelineCache, pDataSize, pData); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetPipelineCacheData", e); }
    }

    public @CType("VkResult") int MergePipelineCaches(@CType("VkDevice") MemorySegment device, @CType("VkPipelineCache") MemorySegment dstCache, @CType("uint32_t") int srcCacheCount, @CType("const VkPipelineCache *") MemorySegment pSrcCaches) {
        if (Unmarshal.isNullPointer(PFN_vkMergePipelineCaches)) throw new SymbolNotFoundError("Symbol not found: vkMergePipelineCaches");
        try { return (int) MH_vkMergePipelineCaches.invokeExact(PFN_vkMergePipelineCaches, device, dstCache, srcCacheCount, pSrcCaches); }
        catch (Throwable e) { throw new RuntimeException("error in vkMergePipelineCaches", e); }
    }

    public @CType("VkResult") int CreateGraphicsPipelines(@CType("VkDevice") MemorySegment device, @CType("VkPipelineCache") MemorySegment pipelineCache, @CType("uint32_t") int createInfoCount, @CType("const VkGraphicsPipelineCreateInfo *") MemorySegment pCreateInfos, @CType("const VkAllocationCallbacks *") MemorySegment pAllocator, @CType("VkPipeline *") MemorySegment pPipelines) {
        if (Unmarshal.isNullPointer(PFN_vkCreateGraphicsPipelines)) throw new SymbolNotFoundError("Symbol not found: vkCreateGraphicsPipelines");
        try { return (int) MH_vkCreateGraphicsPipelines.invokeExact(PFN_vkCreateGraphicsPipelines, device, pipelineCache, createInfoCount, pCreateInfos, pAllocator, pPipelines); }
        catch (Throwable e) { throw new RuntimeException("error in vkCreateGraphicsPipelines", e); }
    }

    public @CType("VkResult") int CreateComputePipelines(@CType("VkDevice") MemorySegment device, @CType("VkPipelineCache") MemorySegment pipelineCache, @CType("uint32_t") int createInfoCount, @CType("const VkComputePipelineCreateInfo *") MemorySegment pCreateInfos, @CType("const VkAllocationCallbacks *") MemorySegment pAllocator, @CType("VkPipeline *") MemorySegment pPipelines) {
        if (Unmarshal.isNullPointer(PFN_vkCreateComputePipelines)) throw new SymbolNotFoundError("Symbol not found: vkCreateComputePipelines");
        try { return (int) MH_vkCreateComputePipelines.invokeExact(PFN_vkCreateComputePipelines, device, pipelineCache, createInfoCount, pCreateInfos, pAllocator, pPipelines); }
        catch (Throwable e) { throw new RuntimeException("error in vkCreateComputePipelines", e); }
    }

    public void DestroyPipeline(@CType("VkDevice") MemorySegment device, @CType("VkPipeline") MemorySegment pipeline, @CType("const VkAllocationCallbacks *") MemorySegment pAllocator) {
        if (Unmarshal.isNullPointer(PFN_vkDestroyPipeline)) throw new SymbolNotFoundError("Symbol not found: vkDestroyPipeline");
        try { MH_vkDestroyPipeline.invokeExact(PFN_vkDestroyPipeline, device, pipeline, pAllocator); }
        catch (Throwable e) { throw new RuntimeException("error in vkDestroyPipeline", e); }
    }

    public @CType("VkResult") int CreatePipelineLayout(@CType("VkDevice") MemorySegment device, @CType("const VkPipelineLayoutCreateInfo *") MemorySegment pCreateInfo, @CType("const VkAllocationCallbacks *") MemorySegment pAllocator, @CType("VkPipelineLayout *") MemorySegment pPipelineLayout) {
        if (Unmarshal.isNullPointer(PFN_vkCreatePipelineLayout)) throw new SymbolNotFoundError("Symbol not found: vkCreatePipelineLayout");
        try { return (int) MH_vkCreatePipelineLayout.invokeExact(PFN_vkCreatePipelineLayout, device, pCreateInfo, pAllocator, pPipelineLayout); }
        catch (Throwable e) { throw new RuntimeException("error in vkCreatePipelineLayout", e); }
    }

    public void DestroyPipelineLayout(@CType("VkDevice") MemorySegment device, @CType("VkPipelineLayout") MemorySegment pipelineLayout, @CType("const VkAllocationCallbacks *") MemorySegment pAllocator) {
        if (Unmarshal.isNullPointer(PFN_vkDestroyPipelineLayout)) throw new SymbolNotFoundError("Symbol not found: vkDestroyPipelineLayout");
        try { MH_vkDestroyPipelineLayout.invokeExact(PFN_vkDestroyPipelineLayout, device, pipelineLayout, pAllocator); }
        catch (Throwable e) { throw new RuntimeException("error in vkDestroyPipelineLayout", e); }
    }

    public @CType("VkResult") int CreateSampler(@CType("VkDevice") MemorySegment device, @CType("const VkSamplerCreateInfo *") MemorySegment pCreateInfo, @CType("const VkAllocationCallbacks *") MemorySegment pAllocator, @CType("VkSampler *") MemorySegment pSampler) {
        if (Unmarshal.isNullPointer(PFN_vkCreateSampler)) throw new SymbolNotFoundError("Symbol not found: vkCreateSampler");
        try { return (int) MH_vkCreateSampler.invokeExact(PFN_vkCreateSampler, device, pCreateInfo, pAllocator, pSampler); }
        catch (Throwable e) { throw new RuntimeException("error in vkCreateSampler", e); }
    }

    public void DestroySampler(@CType("VkDevice") MemorySegment device, @CType("VkSampler") MemorySegment sampler, @CType("const VkAllocationCallbacks *") MemorySegment pAllocator) {
        if (Unmarshal.isNullPointer(PFN_vkDestroySampler)) throw new SymbolNotFoundError("Symbol not found: vkDestroySampler");
        try { MH_vkDestroySampler.invokeExact(PFN_vkDestroySampler, device, sampler, pAllocator); }
        catch (Throwable e) { throw new RuntimeException("error in vkDestroySampler", e); }
    }

    public @CType("VkResult") int CreateDescriptorSetLayout(@CType("VkDevice") MemorySegment device, @CType("const VkDescriptorSetLayoutCreateInfo *") MemorySegment pCreateInfo, @CType("const VkAllocationCallbacks *") MemorySegment pAllocator, @CType("VkDescriptorSetLayout *") MemorySegment pSetLayout) {
        if (Unmarshal.isNullPointer(PFN_vkCreateDescriptorSetLayout)) throw new SymbolNotFoundError("Symbol not found: vkCreateDescriptorSetLayout");
        try { return (int) MH_vkCreateDescriptorSetLayout.invokeExact(PFN_vkCreateDescriptorSetLayout, device, pCreateInfo, pAllocator, pSetLayout); }
        catch (Throwable e) { throw new RuntimeException("error in vkCreateDescriptorSetLayout", e); }
    }

    public void DestroyDescriptorSetLayout(@CType("VkDevice") MemorySegment device, @CType("VkDescriptorSetLayout") MemorySegment descriptorSetLayout, @CType("const VkAllocationCallbacks *") MemorySegment pAllocator) {
        if (Unmarshal.isNullPointer(PFN_vkDestroyDescriptorSetLayout)) throw new SymbolNotFoundError("Symbol not found: vkDestroyDescriptorSetLayout");
        try { MH_vkDestroyDescriptorSetLayout.invokeExact(PFN_vkDestroyDescriptorSetLayout, device, descriptorSetLayout, pAllocator); }
        catch (Throwable e) { throw new RuntimeException("error in vkDestroyDescriptorSetLayout", e); }
    }

    public @CType("VkResult") int CreateDescriptorPool(@CType("VkDevice") MemorySegment device, @CType("const VkDescriptorPoolCreateInfo *") MemorySegment pCreateInfo, @CType("const VkAllocationCallbacks *") MemorySegment pAllocator, @CType("VkDescriptorPool *") MemorySegment pDescriptorPool) {
        if (Unmarshal.isNullPointer(PFN_vkCreateDescriptorPool)) throw new SymbolNotFoundError("Symbol not found: vkCreateDescriptorPool");
        try { return (int) MH_vkCreateDescriptorPool.invokeExact(PFN_vkCreateDescriptorPool, device, pCreateInfo, pAllocator, pDescriptorPool); }
        catch (Throwable e) { throw new RuntimeException("error in vkCreateDescriptorPool", e); }
    }

    public void DestroyDescriptorPool(@CType("VkDevice") MemorySegment device, @CType("VkDescriptorPool") MemorySegment descriptorPool, @CType("const VkAllocationCallbacks *") MemorySegment pAllocator) {
        if (Unmarshal.isNullPointer(PFN_vkDestroyDescriptorPool)) throw new SymbolNotFoundError("Symbol not found: vkDestroyDescriptorPool");
        try { MH_vkDestroyDescriptorPool.invokeExact(PFN_vkDestroyDescriptorPool, device, descriptorPool, pAllocator); }
        catch (Throwable e) { throw new RuntimeException("error in vkDestroyDescriptorPool", e); }
    }

    public @CType("VkResult") int ResetDescriptorPool(@CType("VkDevice") MemorySegment device, @CType("VkDescriptorPool") MemorySegment descriptorPool, @CType("VkDescriptorPoolResetFlags") int flags) {
        if (Unmarshal.isNullPointer(PFN_vkResetDescriptorPool)) throw new SymbolNotFoundError("Symbol not found: vkResetDescriptorPool");
        try { return (int) MH_vkResetDescriptorPool.invokeExact(PFN_vkResetDescriptorPool, device, descriptorPool, flags); }
        catch (Throwable e) { throw new RuntimeException("error in vkResetDescriptorPool", e); }
    }

    public @CType("VkResult") int AllocateDescriptorSets(@CType("VkDevice") MemorySegment device, @CType("const VkDescriptorSetAllocateInfo *") MemorySegment pAllocateInfo, @CType("VkDescriptorSet *") MemorySegment pDescriptorSets) {
        if (Unmarshal.isNullPointer(PFN_vkAllocateDescriptorSets)) throw new SymbolNotFoundError("Symbol not found: vkAllocateDescriptorSets");
        try { return (int) MH_vkAllocateDescriptorSets.invokeExact(PFN_vkAllocateDescriptorSets, device, pAllocateInfo, pDescriptorSets); }
        catch (Throwable e) { throw new RuntimeException("error in vkAllocateDescriptorSets", e); }
    }

    public @CType("VkResult") int FreeDescriptorSets(@CType("VkDevice") MemorySegment device, @CType("VkDescriptorPool") MemorySegment descriptorPool, @CType("uint32_t") int descriptorSetCount, @CType("const VkDescriptorSet *") MemorySegment pDescriptorSets) {
        if (Unmarshal.isNullPointer(PFN_vkFreeDescriptorSets)) throw new SymbolNotFoundError("Symbol not found: vkFreeDescriptorSets");
        try { return (int) MH_vkFreeDescriptorSets.invokeExact(PFN_vkFreeDescriptorSets, device, descriptorPool, descriptorSetCount, pDescriptorSets); }
        catch (Throwable e) { throw new RuntimeException("error in vkFreeDescriptorSets", e); }
    }

    public void UpdateDescriptorSets(@CType("VkDevice") MemorySegment device, @CType("uint32_t") int descriptorWriteCount, @CType("const VkWriteDescriptorSet *") MemorySegment pDescriptorWrites, @CType("uint32_t") int descriptorCopyCount, @CType("const VkCopyDescriptorSet *") MemorySegment pDescriptorCopies) {
        if (Unmarshal.isNullPointer(PFN_vkUpdateDescriptorSets)) throw new SymbolNotFoundError("Symbol not found: vkUpdateDescriptorSets");
        try { MH_vkUpdateDescriptorSets.invokeExact(PFN_vkUpdateDescriptorSets, device, descriptorWriteCount, pDescriptorWrites, descriptorCopyCount, pDescriptorCopies); }
        catch (Throwable e) { throw new RuntimeException("error in vkUpdateDescriptorSets", e); }
    }

    public @CType("VkResult") int CreateFramebuffer(@CType("VkDevice") MemorySegment device, @CType("const VkFramebufferCreateInfo *") MemorySegment pCreateInfo, @CType("const VkAllocationCallbacks *") MemorySegment pAllocator, @CType("VkFramebuffer *") MemorySegment pFramebuffer) {
        if (Unmarshal.isNullPointer(PFN_vkCreateFramebuffer)) throw new SymbolNotFoundError("Symbol not found: vkCreateFramebuffer");
        try { return (int) MH_vkCreateFramebuffer.invokeExact(PFN_vkCreateFramebuffer, device, pCreateInfo, pAllocator, pFramebuffer); }
        catch (Throwable e) { throw new RuntimeException("error in vkCreateFramebuffer", e); }
    }

    public void DestroyFramebuffer(@CType("VkDevice") MemorySegment device, @CType("VkFramebuffer") MemorySegment framebuffer, @CType("const VkAllocationCallbacks *") MemorySegment pAllocator) {
        if (Unmarshal.isNullPointer(PFN_vkDestroyFramebuffer)) throw new SymbolNotFoundError("Symbol not found: vkDestroyFramebuffer");
        try { MH_vkDestroyFramebuffer.invokeExact(PFN_vkDestroyFramebuffer, device, framebuffer, pAllocator); }
        catch (Throwable e) { throw new RuntimeException("error in vkDestroyFramebuffer", e); }
    }

    public @CType("VkResult") int CreateRenderPass(@CType("VkDevice") MemorySegment device, @CType("const VkRenderPassCreateInfo *") MemorySegment pCreateInfo, @CType("const VkAllocationCallbacks *") MemorySegment pAllocator, @CType("VkRenderPass *") MemorySegment pRenderPass) {
        if (Unmarshal.isNullPointer(PFN_vkCreateRenderPass)) throw new SymbolNotFoundError("Symbol not found: vkCreateRenderPass");
        try { return (int) MH_vkCreateRenderPass.invokeExact(PFN_vkCreateRenderPass, device, pCreateInfo, pAllocator, pRenderPass); }
        catch (Throwable e) { throw new RuntimeException("error in vkCreateRenderPass", e); }
    }

    public void DestroyRenderPass(@CType("VkDevice") MemorySegment device, @CType("VkRenderPass") MemorySegment renderPass, @CType("const VkAllocationCallbacks *") MemorySegment pAllocator) {
        if (Unmarshal.isNullPointer(PFN_vkDestroyRenderPass)) throw new SymbolNotFoundError("Symbol not found: vkDestroyRenderPass");
        try { MH_vkDestroyRenderPass.invokeExact(PFN_vkDestroyRenderPass, device, renderPass, pAllocator); }
        catch (Throwable e) { throw new RuntimeException("error in vkDestroyRenderPass", e); }
    }

    public void GetRenderAreaGranularity(@CType("VkDevice") MemorySegment device, @CType("VkRenderPass") MemorySegment renderPass, @CType("VkExtent2D *") MemorySegment pGranularity) {
        if (Unmarshal.isNullPointer(PFN_vkGetRenderAreaGranularity)) throw new SymbolNotFoundError("Symbol not found: vkGetRenderAreaGranularity");
        try { MH_vkGetRenderAreaGranularity.invokeExact(PFN_vkGetRenderAreaGranularity, device, renderPass, pGranularity); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetRenderAreaGranularity", e); }
    }

    public @CType("VkResult") int CreateCommandPool(@CType("VkDevice") MemorySegment device, @CType("const VkCommandPoolCreateInfo *") MemorySegment pCreateInfo, @CType("const VkAllocationCallbacks *") MemorySegment pAllocator, @CType("VkCommandPool *") MemorySegment pCommandPool) {
        if (Unmarshal.isNullPointer(PFN_vkCreateCommandPool)) throw new SymbolNotFoundError("Symbol not found: vkCreateCommandPool");
        try { return (int) MH_vkCreateCommandPool.invokeExact(PFN_vkCreateCommandPool, device, pCreateInfo, pAllocator, pCommandPool); }
        catch (Throwable e) { throw new RuntimeException("error in vkCreateCommandPool", e); }
    }

    public void DestroyCommandPool(@CType("VkDevice") MemorySegment device, @CType("VkCommandPool") MemorySegment commandPool, @CType("const VkAllocationCallbacks *") MemorySegment pAllocator) {
        if (Unmarshal.isNullPointer(PFN_vkDestroyCommandPool)) throw new SymbolNotFoundError("Symbol not found: vkDestroyCommandPool");
        try { MH_vkDestroyCommandPool.invokeExact(PFN_vkDestroyCommandPool, device, commandPool, pAllocator); }
        catch (Throwable e) { throw new RuntimeException("error in vkDestroyCommandPool", e); }
    }

    public @CType("VkResult") int ResetCommandPool(@CType("VkDevice") MemorySegment device, @CType("VkCommandPool") MemorySegment commandPool, @CType("VkCommandPoolResetFlags") int flags) {
        if (Unmarshal.isNullPointer(PFN_vkResetCommandPool)) throw new SymbolNotFoundError("Symbol not found: vkResetCommandPool");
        try { return (int) MH_vkResetCommandPool.invokeExact(PFN_vkResetCommandPool, device, commandPool, flags); }
        catch (Throwable e) { throw new RuntimeException("error in vkResetCommandPool", e); }
    }

    public @CType("VkResult") int AllocateCommandBuffers(@CType("VkDevice") MemorySegment device, @CType("const VkCommandBufferAllocateInfo *") MemorySegment pAllocateInfo, @CType("VkCommandBuffer *") MemorySegment pCommandBuffers) {
        if (Unmarshal.isNullPointer(PFN_vkAllocateCommandBuffers)) throw new SymbolNotFoundError("Symbol not found: vkAllocateCommandBuffers");
        try { return (int) MH_vkAllocateCommandBuffers.invokeExact(PFN_vkAllocateCommandBuffers, device, pAllocateInfo, pCommandBuffers); }
        catch (Throwable e) { throw new RuntimeException("error in vkAllocateCommandBuffers", e); }
    }

    public void FreeCommandBuffers(@CType("VkDevice") MemorySegment device, @CType("VkCommandPool") MemorySegment commandPool, @CType("uint32_t") int commandBufferCount, @CType("const VkCommandBuffer *") MemorySegment pCommandBuffers) {
        if (Unmarshal.isNullPointer(PFN_vkFreeCommandBuffers)) throw new SymbolNotFoundError("Symbol not found: vkFreeCommandBuffers");
        try { MH_vkFreeCommandBuffers.invokeExact(PFN_vkFreeCommandBuffers, device, commandPool, commandBufferCount, pCommandBuffers); }
        catch (Throwable e) { throw new RuntimeException("error in vkFreeCommandBuffers", e); }
    }

    public @CType("VkResult") int BeginCommandBuffer(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("const VkCommandBufferBeginInfo *") MemorySegment pBeginInfo) {
        if (Unmarshal.isNullPointer(PFN_vkBeginCommandBuffer)) throw new SymbolNotFoundError("Symbol not found: vkBeginCommandBuffer");
        try { return (int) MH_vkBeginCommandBuffer.invokeExact(PFN_vkBeginCommandBuffer, commandBuffer, pBeginInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkBeginCommandBuffer", e); }
    }

    public @CType("VkResult") int EndCommandBuffer(@CType("VkCommandBuffer") MemorySegment commandBuffer) {
        if (Unmarshal.isNullPointer(PFN_vkEndCommandBuffer)) throw new SymbolNotFoundError("Symbol not found: vkEndCommandBuffer");
        try { return (int) MH_vkEndCommandBuffer.invokeExact(PFN_vkEndCommandBuffer, commandBuffer); }
        catch (Throwable e) { throw new RuntimeException("error in vkEndCommandBuffer", e); }
    }

    public @CType("VkResult") int ResetCommandBuffer(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("VkCommandBufferResetFlags") int flags) {
        if (Unmarshal.isNullPointer(PFN_vkResetCommandBuffer)) throw new SymbolNotFoundError("Symbol not found: vkResetCommandBuffer");
        try { return (int) MH_vkResetCommandBuffer.invokeExact(PFN_vkResetCommandBuffer, commandBuffer, flags); }
        catch (Throwable e) { throw new RuntimeException("error in vkResetCommandBuffer", e); }
    }

    public void CmdBindPipeline(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("VkPipelineBindPoint") int pipelineBindPoint, @CType("VkPipeline") MemorySegment pipeline) {
        if (Unmarshal.isNullPointer(PFN_vkCmdBindPipeline)) throw new SymbolNotFoundError("Symbol not found: vkCmdBindPipeline");
        try { MH_vkCmdBindPipeline.invokeExact(PFN_vkCmdBindPipeline, commandBuffer, pipelineBindPoint, pipeline); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdBindPipeline", e); }
    }

    public void CmdSetViewport(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("uint32_t") int firstViewport, @CType("uint32_t") int viewportCount, @CType("const VkViewport *") MemorySegment pViewports) {
        if (Unmarshal.isNullPointer(PFN_vkCmdSetViewport)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetViewport");
        try { MH_vkCmdSetViewport.invokeExact(PFN_vkCmdSetViewport, commandBuffer, firstViewport, viewportCount, pViewports); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetViewport", e); }
    }

    public void CmdSetScissor(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("uint32_t") int firstScissor, @CType("uint32_t") int scissorCount, @CType("const VkRect2D *") MemorySegment pScissors) {
        if (Unmarshal.isNullPointer(PFN_vkCmdSetScissor)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetScissor");
        try { MH_vkCmdSetScissor.invokeExact(PFN_vkCmdSetScissor, commandBuffer, firstScissor, scissorCount, pScissors); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetScissor", e); }
    }

    public void CmdSetLineWidth(@CType("VkCommandBuffer") MemorySegment commandBuffer, float lineWidth) {
        if (Unmarshal.isNullPointer(PFN_vkCmdSetLineWidth)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetLineWidth");
        try { MH_vkCmdSetLineWidth.invokeExact(PFN_vkCmdSetLineWidth, commandBuffer, lineWidth); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetLineWidth", e); }
    }

    public void CmdSetDepthBias(@CType("VkCommandBuffer") MemorySegment commandBuffer, float depthBiasConstantFactor, float depthBiasClamp, float depthBiasSlopeFactor) {
        if (Unmarshal.isNullPointer(PFN_vkCmdSetDepthBias)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetDepthBias");
        try { MH_vkCmdSetDepthBias.invokeExact(PFN_vkCmdSetDepthBias, commandBuffer, depthBiasConstantFactor, depthBiasClamp, depthBiasSlopeFactor); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetDepthBias", e); }
    }

    public void CmdSetBlendConstants(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("const float [4]") float blendConstants) {
        if (Unmarshal.isNullPointer(PFN_vkCmdSetBlendConstants)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetBlendConstants");
        try { MH_vkCmdSetBlendConstants.invokeExact(PFN_vkCmdSetBlendConstants, commandBuffer, blendConstants); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetBlendConstants", e); }
    }

    public void CmdSetDepthBounds(@CType("VkCommandBuffer") MemorySegment commandBuffer, float minDepthBounds, float maxDepthBounds) {
        if (Unmarshal.isNullPointer(PFN_vkCmdSetDepthBounds)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetDepthBounds");
        try { MH_vkCmdSetDepthBounds.invokeExact(PFN_vkCmdSetDepthBounds, commandBuffer, minDepthBounds, maxDepthBounds); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetDepthBounds", e); }
    }

    public void CmdSetStencilCompareMask(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("VkStencilFaceFlags") int faceMask, @CType("uint32_t") int compareMask) {
        if (Unmarshal.isNullPointer(PFN_vkCmdSetStencilCompareMask)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetStencilCompareMask");
        try { MH_vkCmdSetStencilCompareMask.invokeExact(PFN_vkCmdSetStencilCompareMask, commandBuffer, faceMask, compareMask); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetStencilCompareMask", e); }
    }

    public void CmdSetStencilWriteMask(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("VkStencilFaceFlags") int faceMask, @CType("uint32_t") int writeMask) {
        if (Unmarshal.isNullPointer(PFN_vkCmdSetStencilWriteMask)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetStencilWriteMask");
        try { MH_vkCmdSetStencilWriteMask.invokeExact(PFN_vkCmdSetStencilWriteMask, commandBuffer, faceMask, writeMask); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetStencilWriteMask", e); }
    }

    public void CmdSetStencilReference(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("VkStencilFaceFlags") int faceMask, @CType("uint32_t") int reference) {
        if (Unmarshal.isNullPointer(PFN_vkCmdSetStencilReference)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetStencilReference");
        try { MH_vkCmdSetStencilReference.invokeExact(PFN_vkCmdSetStencilReference, commandBuffer, faceMask, reference); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetStencilReference", e); }
    }

    public void CmdBindDescriptorSets(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("VkPipelineBindPoint") int pipelineBindPoint, @CType("VkPipelineLayout") MemorySegment layout, @CType("uint32_t") int firstSet, @CType("uint32_t") int descriptorSetCount, @CType("const VkDescriptorSet *") MemorySegment pDescriptorSets, @CType("uint32_t") int dynamicOffsetCount, @CType("const uint32_t *") MemorySegment pDynamicOffsets) {
        if (Unmarshal.isNullPointer(PFN_vkCmdBindDescriptorSets)) throw new SymbolNotFoundError("Symbol not found: vkCmdBindDescriptorSets");
        try { MH_vkCmdBindDescriptorSets.invokeExact(PFN_vkCmdBindDescriptorSets, commandBuffer, pipelineBindPoint, layout, firstSet, descriptorSetCount, pDescriptorSets, dynamicOffsetCount, pDynamicOffsets); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdBindDescriptorSets", e); }
    }

    public void CmdBindIndexBuffer(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("VkBuffer") MemorySegment buffer, @CType("VkDeviceSize") long offset, @CType("VkIndexType") int indexType) {
        if (Unmarshal.isNullPointer(PFN_vkCmdBindIndexBuffer)) throw new SymbolNotFoundError("Symbol not found: vkCmdBindIndexBuffer");
        try { MH_vkCmdBindIndexBuffer.invokeExact(PFN_vkCmdBindIndexBuffer, commandBuffer, buffer, offset, indexType); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdBindIndexBuffer", e); }
    }

    public void CmdBindVertexBuffers(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("uint32_t") int firstBinding, @CType("uint32_t") int bindingCount, @CType("const VkBuffer *") MemorySegment pBuffers, @CType("const VkDeviceSize *") MemorySegment pOffsets) {
        if (Unmarshal.isNullPointer(PFN_vkCmdBindVertexBuffers)) throw new SymbolNotFoundError("Symbol not found: vkCmdBindVertexBuffers");
        try { MH_vkCmdBindVertexBuffers.invokeExact(PFN_vkCmdBindVertexBuffers, commandBuffer, firstBinding, bindingCount, pBuffers, pOffsets); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdBindVertexBuffers", e); }
    }

    public void CmdDraw(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("uint32_t") int vertexCount, @CType("uint32_t") int instanceCount, @CType("uint32_t") int firstVertex, @CType("uint32_t") int firstInstance) {
        if (Unmarshal.isNullPointer(PFN_vkCmdDraw)) throw new SymbolNotFoundError("Symbol not found: vkCmdDraw");
        try { MH_vkCmdDraw.invokeExact(PFN_vkCmdDraw, commandBuffer, vertexCount, instanceCount, firstVertex, firstInstance); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdDraw", e); }
    }

    public void CmdDrawIndexed(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("uint32_t") int indexCount, @CType("uint32_t") int instanceCount, @CType("uint32_t") int firstIndex, @CType("int32_t") int vertexOffset, @CType("uint32_t") int firstInstance) {
        if (Unmarshal.isNullPointer(PFN_vkCmdDrawIndexed)) throw new SymbolNotFoundError("Symbol not found: vkCmdDrawIndexed");
        try { MH_vkCmdDrawIndexed.invokeExact(PFN_vkCmdDrawIndexed, commandBuffer, indexCount, instanceCount, firstIndex, vertexOffset, firstInstance); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdDrawIndexed", e); }
    }

    public void CmdDrawIndirect(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("VkBuffer") MemorySegment buffer, @CType("VkDeviceSize") long offset, @CType("uint32_t") int drawCount, @CType("uint32_t") int stride) {
        if (Unmarshal.isNullPointer(PFN_vkCmdDrawIndirect)) throw new SymbolNotFoundError("Symbol not found: vkCmdDrawIndirect");
        try { MH_vkCmdDrawIndirect.invokeExact(PFN_vkCmdDrawIndirect, commandBuffer, buffer, offset, drawCount, stride); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdDrawIndirect", e); }
    }

    public void CmdDrawIndexedIndirect(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("VkBuffer") MemorySegment buffer, @CType("VkDeviceSize") long offset, @CType("uint32_t") int drawCount, @CType("uint32_t") int stride) {
        if (Unmarshal.isNullPointer(PFN_vkCmdDrawIndexedIndirect)) throw new SymbolNotFoundError("Symbol not found: vkCmdDrawIndexedIndirect");
        try { MH_vkCmdDrawIndexedIndirect.invokeExact(PFN_vkCmdDrawIndexedIndirect, commandBuffer, buffer, offset, drawCount, stride); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdDrawIndexedIndirect", e); }
    }

    public void CmdDispatch(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("uint32_t") int groupCountX, @CType("uint32_t") int groupCountY, @CType("uint32_t") int groupCountZ) {
        if (Unmarshal.isNullPointer(PFN_vkCmdDispatch)) throw new SymbolNotFoundError("Symbol not found: vkCmdDispatch");
        try { MH_vkCmdDispatch.invokeExact(PFN_vkCmdDispatch, commandBuffer, groupCountX, groupCountY, groupCountZ); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdDispatch", e); }
    }

    public void CmdDispatchIndirect(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("VkBuffer") MemorySegment buffer, @CType("VkDeviceSize") long offset) {
        if (Unmarshal.isNullPointer(PFN_vkCmdDispatchIndirect)) throw new SymbolNotFoundError("Symbol not found: vkCmdDispatchIndirect");
        try { MH_vkCmdDispatchIndirect.invokeExact(PFN_vkCmdDispatchIndirect, commandBuffer, buffer, offset); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdDispatchIndirect", e); }
    }

    public void CmdCopyBuffer(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("VkBuffer") MemorySegment srcBuffer, @CType("VkBuffer") MemorySegment dstBuffer, @CType("uint32_t") int regionCount, @CType("const VkBufferCopy *") MemorySegment pRegions) {
        if (Unmarshal.isNullPointer(PFN_vkCmdCopyBuffer)) throw new SymbolNotFoundError("Symbol not found: vkCmdCopyBuffer");
        try { MH_vkCmdCopyBuffer.invokeExact(PFN_vkCmdCopyBuffer, commandBuffer, srcBuffer, dstBuffer, regionCount, pRegions); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdCopyBuffer", e); }
    }

    public void CmdCopyImage(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("VkImage") MemorySegment srcImage, @CType("VkImageLayout") int srcImageLayout, @CType("VkImage") MemorySegment dstImage, @CType("VkImageLayout") int dstImageLayout, @CType("uint32_t") int regionCount, @CType("const VkImageCopy *") MemorySegment pRegions) {
        if (Unmarshal.isNullPointer(PFN_vkCmdCopyImage)) throw new SymbolNotFoundError("Symbol not found: vkCmdCopyImage");
        try { MH_vkCmdCopyImage.invokeExact(PFN_vkCmdCopyImage, commandBuffer, srcImage, srcImageLayout, dstImage, dstImageLayout, regionCount, pRegions); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdCopyImage", e); }
    }

    public void CmdBlitImage(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("VkImage") MemorySegment srcImage, @CType("VkImageLayout") int srcImageLayout, @CType("VkImage") MemorySegment dstImage, @CType("VkImageLayout") int dstImageLayout, @CType("uint32_t") int regionCount, @CType("const VkImageBlit *") MemorySegment pRegions, @CType("VkFilter") int filter) {
        if (Unmarshal.isNullPointer(PFN_vkCmdBlitImage)) throw new SymbolNotFoundError("Symbol not found: vkCmdBlitImage");
        try { MH_vkCmdBlitImage.invokeExact(PFN_vkCmdBlitImage, commandBuffer, srcImage, srcImageLayout, dstImage, dstImageLayout, regionCount, pRegions, filter); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdBlitImage", e); }
    }

    public void CmdCopyBufferToImage(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("VkBuffer") MemorySegment srcBuffer, @CType("VkImage") MemorySegment dstImage, @CType("VkImageLayout") int dstImageLayout, @CType("uint32_t") int regionCount, @CType("const VkBufferImageCopy *") MemorySegment pRegions) {
        if (Unmarshal.isNullPointer(PFN_vkCmdCopyBufferToImage)) throw new SymbolNotFoundError("Symbol not found: vkCmdCopyBufferToImage");
        try { MH_vkCmdCopyBufferToImage.invokeExact(PFN_vkCmdCopyBufferToImage, commandBuffer, srcBuffer, dstImage, dstImageLayout, regionCount, pRegions); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdCopyBufferToImage", e); }
    }

    public void CmdCopyImageToBuffer(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("VkImage") MemorySegment srcImage, @CType("VkImageLayout") int srcImageLayout, @CType("VkBuffer") MemorySegment dstBuffer, @CType("uint32_t") int regionCount, @CType("const VkBufferImageCopy *") MemorySegment pRegions) {
        if (Unmarshal.isNullPointer(PFN_vkCmdCopyImageToBuffer)) throw new SymbolNotFoundError("Symbol not found: vkCmdCopyImageToBuffer");
        try { MH_vkCmdCopyImageToBuffer.invokeExact(PFN_vkCmdCopyImageToBuffer, commandBuffer, srcImage, srcImageLayout, dstBuffer, regionCount, pRegions); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdCopyImageToBuffer", e); }
    }

    public void CmdUpdateBuffer(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("VkBuffer") MemorySegment dstBuffer, @CType("VkDeviceSize") long dstOffset, @CType("VkDeviceSize") long dataSize, @CType("const void *") MemorySegment pData) {
        if (Unmarshal.isNullPointer(PFN_vkCmdUpdateBuffer)) throw new SymbolNotFoundError("Symbol not found: vkCmdUpdateBuffer");
        try { MH_vkCmdUpdateBuffer.invokeExact(PFN_vkCmdUpdateBuffer, commandBuffer, dstBuffer, dstOffset, dataSize, pData); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdUpdateBuffer", e); }
    }

    public void CmdFillBuffer(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("VkBuffer") MemorySegment dstBuffer, @CType("VkDeviceSize") long dstOffset, @CType("VkDeviceSize") long size, @CType("uint32_t") int data) {
        if (Unmarshal.isNullPointer(PFN_vkCmdFillBuffer)) throw new SymbolNotFoundError("Symbol not found: vkCmdFillBuffer");
        try { MH_vkCmdFillBuffer.invokeExact(PFN_vkCmdFillBuffer, commandBuffer, dstBuffer, dstOffset, size, data); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdFillBuffer", e); }
    }

    public void CmdClearColorImage(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("VkImage") MemorySegment image, @CType("VkImageLayout") int imageLayout, @CType("const VkClearColorValue *") MemorySegment pColor, @CType("uint32_t") int rangeCount, @CType("const VkImageSubresourceRange *") MemorySegment pRanges) {
        if (Unmarshal.isNullPointer(PFN_vkCmdClearColorImage)) throw new SymbolNotFoundError("Symbol not found: vkCmdClearColorImage");
        try { MH_vkCmdClearColorImage.invokeExact(PFN_vkCmdClearColorImage, commandBuffer, image, imageLayout, pColor, rangeCount, pRanges); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdClearColorImage", e); }
    }

    public void CmdClearDepthStencilImage(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("VkImage") MemorySegment image, @CType("VkImageLayout") int imageLayout, @CType("const VkClearDepthStencilValue *") MemorySegment pDepthStencil, @CType("uint32_t") int rangeCount, @CType("const VkImageSubresourceRange *") MemorySegment pRanges) {
        if (Unmarshal.isNullPointer(PFN_vkCmdClearDepthStencilImage)) throw new SymbolNotFoundError("Symbol not found: vkCmdClearDepthStencilImage");
        try { MH_vkCmdClearDepthStencilImage.invokeExact(PFN_vkCmdClearDepthStencilImage, commandBuffer, image, imageLayout, pDepthStencil, rangeCount, pRanges); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdClearDepthStencilImage", e); }
    }

    public void CmdClearAttachments(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("uint32_t") int attachmentCount, @CType("const VkClearAttachment *") MemorySegment pAttachments, @CType("uint32_t") int rectCount, @CType("const VkClearRect *") MemorySegment pRects) {
        if (Unmarshal.isNullPointer(PFN_vkCmdClearAttachments)) throw new SymbolNotFoundError("Symbol not found: vkCmdClearAttachments");
        try { MH_vkCmdClearAttachments.invokeExact(PFN_vkCmdClearAttachments, commandBuffer, attachmentCount, pAttachments, rectCount, pRects); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdClearAttachments", e); }
    }

    public void CmdResolveImage(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("VkImage") MemorySegment srcImage, @CType("VkImageLayout") int srcImageLayout, @CType("VkImage") MemorySegment dstImage, @CType("VkImageLayout") int dstImageLayout, @CType("uint32_t") int regionCount, @CType("const VkImageResolve *") MemorySegment pRegions) {
        if (Unmarshal.isNullPointer(PFN_vkCmdResolveImage)) throw new SymbolNotFoundError("Symbol not found: vkCmdResolveImage");
        try { MH_vkCmdResolveImage.invokeExact(PFN_vkCmdResolveImage, commandBuffer, srcImage, srcImageLayout, dstImage, dstImageLayout, regionCount, pRegions); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdResolveImage", e); }
    }

    public void CmdSetEvent(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("VkEvent") MemorySegment event, @CType("VkPipelineStageFlags") int stageMask) {
        if (Unmarshal.isNullPointer(PFN_vkCmdSetEvent)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetEvent");
        try { MH_vkCmdSetEvent.invokeExact(PFN_vkCmdSetEvent, commandBuffer, event, stageMask); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetEvent", e); }
    }

    public void CmdResetEvent(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("VkEvent") MemorySegment event, @CType("VkPipelineStageFlags") int stageMask) {
        if (Unmarshal.isNullPointer(PFN_vkCmdResetEvent)) throw new SymbolNotFoundError("Symbol not found: vkCmdResetEvent");
        try { MH_vkCmdResetEvent.invokeExact(PFN_vkCmdResetEvent, commandBuffer, event, stageMask); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdResetEvent", e); }
    }

    public void CmdWaitEvents(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("uint32_t") int eventCount, @CType("const VkEvent *") MemorySegment pEvents, @CType("VkPipelineStageFlags") int srcStageMask, @CType("VkPipelineStageFlags") int dstStageMask, @CType("uint32_t") int memoryBarrierCount, @CType("const VkMemoryBarrier *") MemorySegment pMemoryBarriers, @CType("uint32_t") int bufferMemoryBarrierCount, @CType("const VkBufferMemoryBarrier *") MemorySegment pBufferMemoryBarriers, @CType("uint32_t") int imageMemoryBarrierCount, @CType("const VkImageMemoryBarrier *") MemorySegment pImageMemoryBarriers) {
        if (Unmarshal.isNullPointer(PFN_vkCmdWaitEvents)) throw new SymbolNotFoundError("Symbol not found: vkCmdWaitEvents");
        try { MH_vkCmdWaitEvents.invokeExact(PFN_vkCmdWaitEvents, commandBuffer, eventCount, pEvents, srcStageMask, dstStageMask, memoryBarrierCount, pMemoryBarriers, bufferMemoryBarrierCount, pBufferMemoryBarriers, imageMemoryBarrierCount, pImageMemoryBarriers); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdWaitEvents", e); }
    }

    public void CmdPipelineBarrier(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("VkPipelineStageFlags") int srcStageMask, @CType("VkPipelineStageFlags") int dstStageMask, @CType("VkDependencyFlags") int dependencyFlags, @CType("uint32_t") int memoryBarrierCount, @CType("const VkMemoryBarrier *") MemorySegment pMemoryBarriers, @CType("uint32_t") int bufferMemoryBarrierCount, @CType("const VkBufferMemoryBarrier *") MemorySegment pBufferMemoryBarriers, @CType("uint32_t") int imageMemoryBarrierCount, @CType("const VkImageMemoryBarrier *") MemorySegment pImageMemoryBarriers) {
        if (Unmarshal.isNullPointer(PFN_vkCmdPipelineBarrier)) throw new SymbolNotFoundError("Symbol not found: vkCmdPipelineBarrier");
        try { MH_vkCmdPipelineBarrier.invokeExact(PFN_vkCmdPipelineBarrier, commandBuffer, srcStageMask, dstStageMask, dependencyFlags, memoryBarrierCount, pMemoryBarriers, bufferMemoryBarrierCount, pBufferMemoryBarriers, imageMemoryBarrierCount, pImageMemoryBarriers); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdPipelineBarrier", e); }
    }

    public void CmdBeginQuery(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("VkQueryPool") MemorySegment queryPool, @CType("uint32_t") int query, @CType("VkQueryControlFlags") int flags) {
        if (Unmarshal.isNullPointer(PFN_vkCmdBeginQuery)) throw new SymbolNotFoundError("Symbol not found: vkCmdBeginQuery");
        try { MH_vkCmdBeginQuery.invokeExact(PFN_vkCmdBeginQuery, commandBuffer, queryPool, query, flags); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdBeginQuery", e); }
    }

    public void CmdEndQuery(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("VkQueryPool") MemorySegment queryPool, @CType("uint32_t") int query) {
        if (Unmarshal.isNullPointer(PFN_vkCmdEndQuery)) throw new SymbolNotFoundError("Symbol not found: vkCmdEndQuery");
        try { MH_vkCmdEndQuery.invokeExact(PFN_vkCmdEndQuery, commandBuffer, queryPool, query); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdEndQuery", e); }
    }

    public void CmdResetQueryPool(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("VkQueryPool") MemorySegment queryPool, @CType("uint32_t") int firstQuery, @CType("uint32_t") int queryCount) {
        if (Unmarshal.isNullPointer(PFN_vkCmdResetQueryPool)) throw new SymbolNotFoundError("Symbol not found: vkCmdResetQueryPool");
        try { MH_vkCmdResetQueryPool.invokeExact(PFN_vkCmdResetQueryPool, commandBuffer, queryPool, firstQuery, queryCount); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdResetQueryPool", e); }
    }

    public void CmdWriteTimestamp(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("VkPipelineStageFlagBits") int pipelineStage, @CType("VkQueryPool") MemorySegment queryPool, @CType("uint32_t") int query) {
        if (Unmarshal.isNullPointer(PFN_vkCmdWriteTimestamp)) throw new SymbolNotFoundError("Symbol not found: vkCmdWriteTimestamp");
        try { MH_vkCmdWriteTimestamp.invokeExact(PFN_vkCmdWriteTimestamp, commandBuffer, pipelineStage, queryPool, query); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdWriteTimestamp", e); }
    }

    public void CmdCopyQueryPoolResults(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("VkQueryPool") MemorySegment queryPool, @CType("uint32_t") int firstQuery, @CType("uint32_t") int queryCount, @CType("VkBuffer") MemorySegment dstBuffer, @CType("VkDeviceSize") long dstOffset, @CType("VkDeviceSize") long stride, @CType("VkQueryResultFlags") int flags) {
        if (Unmarshal.isNullPointer(PFN_vkCmdCopyQueryPoolResults)) throw new SymbolNotFoundError("Symbol not found: vkCmdCopyQueryPoolResults");
        try { MH_vkCmdCopyQueryPoolResults.invokeExact(PFN_vkCmdCopyQueryPoolResults, commandBuffer, queryPool, firstQuery, queryCount, dstBuffer, dstOffset, stride, flags); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdCopyQueryPoolResults", e); }
    }

    public void CmdPushConstants(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("VkPipelineLayout") MemorySegment layout, @CType("VkShaderStageFlags") int stageFlags, @CType("uint32_t") int offset, @CType("uint32_t") int size, @CType("const void *") MemorySegment pValues) {
        if (Unmarshal.isNullPointer(PFN_vkCmdPushConstants)) throw new SymbolNotFoundError("Symbol not found: vkCmdPushConstants");
        try { MH_vkCmdPushConstants.invokeExact(PFN_vkCmdPushConstants, commandBuffer, layout, stageFlags, offset, size, pValues); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdPushConstants", e); }
    }

    public void CmdBeginRenderPass(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("const VkRenderPassBeginInfo *") MemorySegment pRenderPassBegin, @CType("VkSubpassContents") int contents) {
        if (Unmarshal.isNullPointer(PFN_vkCmdBeginRenderPass)) throw new SymbolNotFoundError("Symbol not found: vkCmdBeginRenderPass");
        try { MH_vkCmdBeginRenderPass.invokeExact(PFN_vkCmdBeginRenderPass, commandBuffer, pRenderPassBegin, contents); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdBeginRenderPass", e); }
    }

    public void CmdNextSubpass(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("VkSubpassContents") int contents) {
        if (Unmarshal.isNullPointer(PFN_vkCmdNextSubpass)) throw new SymbolNotFoundError("Symbol not found: vkCmdNextSubpass");
        try { MH_vkCmdNextSubpass.invokeExact(PFN_vkCmdNextSubpass, commandBuffer, contents); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdNextSubpass", e); }
    }

    public void CmdEndRenderPass(@CType("VkCommandBuffer") MemorySegment commandBuffer) {
        if (Unmarshal.isNullPointer(PFN_vkCmdEndRenderPass)) throw new SymbolNotFoundError("Symbol not found: vkCmdEndRenderPass");
        try { MH_vkCmdEndRenderPass.invokeExact(PFN_vkCmdEndRenderPass, commandBuffer); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdEndRenderPass", e); }
    }

    public void CmdExecuteCommands(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("uint32_t") int commandBufferCount, @CType("const VkCommandBuffer *") MemorySegment pCommandBuffers) {
        if (Unmarshal.isNullPointer(PFN_vkCmdExecuteCommands)) throw new SymbolNotFoundError("Symbol not found: vkCmdExecuteCommands");
        try { MH_vkCmdExecuteCommands.invokeExact(PFN_vkCmdExecuteCommands, commandBuffer, commandBufferCount, pCommandBuffers); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdExecuteCommands", e); }
    }

    // --- OverrunGL custom code ---
    public static int VK_MAKE_API_VERSION(int variant, int major, int minor, int patch) {
        return (variant << 29) | (major << 22) | (minor << 12) | patch;
    }
    public static int VK_API_VERSION_VARIANT(int version) { return version >> 29; }
    public static int VK_API_VERSION_MAJOR(int version) { return (version >> 22) & 0x7F; }
    public static int VK_API_VERSION_MINOR(int version) { return (version >> 12) & 0x3FF; }
    public static int VK_API_VERSION_PATCH(int version) { return version & 0xFFF; }
    
    public static @CType("VkResult") int vkEnumerateInstanceExtensionProperties(VKLoadFunc func, @CType("const char *") MemorySegment pLayerName, @CType("uint32_t *") MemorySegment pPropertyCount, @CType("VkExtensionProperties *") MemorySegment pProperties) {
        var p = func.invoke(MemorySegment.NULL, "vkEnumerateInstanceExtensionProperties");
        if (Unmarshal.isNullPointer(p)) throw new SymbolNotFoundError("Symbol not found: vkEnumerateInstanceExtensionProperties");
        try { return (int) MH_vkEnumerateInstanceExtensionProperties.invokeExact(p, pLayerName, pPropertyCount, pProperties); }
        catch (Throwable e) { throw new RuntimeException("error in vkEnumerateInstanceExtensionProperties", e); }
    }
    
    public static @CType("VkResult") int vkEnumerateInstanceLayerProperties(VKLoadFunc func, @CType("uint32_t *") MemorySegment pPropertyCount, @CType("VkLayerProperties *") MemorySegment pProperties) {
        var p = func.invoke(MemorySegment.NULL, "vkEnumerateInstanceLayerProperties");
        if (Unmarshal.isNullPointer(p)) throw new SymbolNotFoundError("Symbol not found: vkEnumerateInstanceLayerProperties");
        try { return (int) MH_vkEnumerateInstanceLayerProperties.invokeExact(p, pPropertyCount, pProperties); }
        catch (Throwable e) { throw new RuntimeException("error in vkEnumerateInstanceLayerProperties", e); }
    }
    
    public static @CType("VkResult") int vkCreateInstance(VKLoadFunc func, @CType("const VkInstanceCreateInfo *") MemorySegment pCreateInfo, @CType("const VkAllocationCallbacks *") MemorySegment pAllocator, @CType("VkInstance *") MemorySegment pInstance) {
        var p = func.invoke(MemorySegment.NULL, "vkCreateInstance");
        if (Unmarshal.isNullPointer(p)) throw new SymbolNotFoundError("Symbol not found: vkCreateInstance");
        try { return (int) MH_vkCreateInstance.invokeExact(p, pCreateInfo, pAllocator, pInstance); }
        catch (Throwable e) { throw new RuntimeException("error in vkCreateInstance", e); }
    }
    
    public static @CType("PFN_vkVoidFunction") MemorySegment vkGetInstanceProcAddr(VKLoadFunc func, @CType("VkInstance") MemorySegment instance, @CType("const char *") MemorySegment pName) {
        var p = func.invoke(MemorySegment.NULL, "vkGetInstanceProcAddr");
        if (Unmarshal.isNullPointer(p)) throw new SymbolNotFoundError("Symbol not found: vkGetInstanceProcAddr");
        try { return (MemorySegment) MH_vkGetInstanceProcAddr.invokeExact(p, instance, pName); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetInstanceProcAddr", e); }
    }
}
