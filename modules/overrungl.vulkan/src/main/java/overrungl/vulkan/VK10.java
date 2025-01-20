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
    private final Handles handles;
    public static final class Descriptors {
        public static final FunctionDescriptor FD_vkCreateInstance = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkDestroyInstance = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkEnumeratePhysicalDevices = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkGetPhysicalDeviceFeatures = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkGetPhysicalDeviceFormatProperties = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkGetPhysicalDeviceImageFormatProperties = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkGetPhysicalDeviceProperties = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkGetPhysicalDeviceQueueFamilyProperties = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkGetPhysicalDeviceMemoryProperties = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkGetInstanceProcAddr = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkGetDeviceProcAddr = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkCreateDevice = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkDestroyDevice = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkEnumerateInstanceExtensionProperties = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkEnumerateDeviceExtensionProperties = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkEnumerateInstanceLayerProperties = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkEnumerateDeviceLayerProperties = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkGetDeviceQueue = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkQueueSubmit = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkQueueWaitIdle = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkDeviceWaitIdle = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkAllocateMemory = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkFreeMemory = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkMapMemory = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkUnmapMemory = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkFlushMappedMemoryRanges = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkInvalidateMappedMemoryRanges = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkGetDeviceMemoryCommitment = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkBindBufferMemory = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG);
        public static final FunctionDescriptor FD_vkBindImageMemory = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG);
        public static final FunctionDescriptor FD_vkGetBufferMemoryRequirements = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkGetImageMemoryRequirements = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkGetImageSparseMemoryRequirements = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkGetPhysicalDeviceSparseImageFormatProperties = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkQueueBindSparse = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkCreateFence = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkDestroyFence = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkResetFences = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkGetFenceStatus = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkWaitForFences = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG);
        public static final FunctionDescriptor FD_vkCreateSemaphore = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkDestroySemaphore = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkCreateEvent = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkDestroyEvent = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkGetEventStatus = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkSetEvent = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkResetEvent = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkCreateQueryPool = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkDestroyQueryPool = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkGetQueryPoolResults = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_vkCreateBuffer = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkDestroyBuffer = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkCreateBufferView = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkDestroyBufferView = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkCreateImage = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkDestroyImage = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkGetImageSubresourceLayout = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkCreateImageView = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkDestroyImageView = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkCreateShaderModule = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkDestroyShaderModule = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkCreatePipelineCache = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkDestroyPipelineCache = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkGetPipelineCacheData = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkMergePipelineCaches = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkCreateGraphicsPipelines = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkCreateComputePipelines = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkDestroyPipeline = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkCreatePipelineLayout = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkDestroyPipelineLayout = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkCreateSampler = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkDestroySampler = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkCreateDescriptorSetLayout = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkDestroyDescriptorSetLayout = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkCreateDescriptorPool = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkDestroyDescriptorPool = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkResetDescriptorPool = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_vkAllocateDescriptorSets = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkFreeDescriptorSets = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkUpdateDescriptorSets = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkCreateFramebuffer = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkDestroyFramebuffer = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkCreateRenderPass = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkDestroyRenderPass = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkGetRenderAreaGranularity = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkCreateCommandPool = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkDestroyCommandPool = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkResetCommandPool = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_vkAllocateCommandBuffers = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkFreeCommandBuffers = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkBeginCommandBuffer = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkEndCommandBuffer = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkResetCommandBuffer = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_vkCmdBindPipeline = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkCmdSetViewport = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkCmdSetScissor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkCmdSetLineWidth = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT);
        public static final FunctionDescriptor FD_vkCmdSetDepthBias = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT);
        public static final FunctionDescriptor FD_vkCmdSetBlendConstants = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT);
        public static final FunctionDescriptor FD_vkCmdSetDepthBounds = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT);
        public static final FunctionDescriptor FD_vkCmdSetStencilCompareMask = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_vkCmdSetStencilWriteMask = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_vkCmdSetStencilReference = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_vkCmdBindDescriptorSets = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkCmdBindIndexBuffer = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_vkCmdBindVertexBuffers = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkCmdDraw = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_vkCmdDrawIndexed = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_vkCmdDrawIndirect = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_vkCmdDrawIndexedIndirect = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_vkCmdDispatch = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_vkCmdDispatchIndirect = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG);
        public static final FunctionDescriptor FD_vkCmdCopyBuffer = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkCmdCopyImage = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkCmdBlitImage = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_vkCmdCopyBufferToImage = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkCmdCopyImageToBuffer = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkCmdUpdateBuffer = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkCmdFillBuffer = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_vkCmdClearColorImage = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkCmdClearDepthStencilImage = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkCmdClearAttachments = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkCmdResolveImage = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkCmdSetEvent = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_vkCmdResetEvent = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_vkCmdWaitEvents = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkCmdPipelineBarrier = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkCmdBeginQuery = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_vkCmdEndQuery = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_vkCmdResetQueryPool = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_vkCmdWriteTimestamp = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_vkCmdCopyQueryPoolResults = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_vkCmdPushConstants = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkCmdBeginRenderPass = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_vkCmdNextSubpass = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_vkCmdEndRenderPass = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkCmdExecuteCommands = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final List<FunctionDescriptor> LIST = List.of(
            FD_vkCreateInstance,
            FD_vkDestroyInstance,
            FD_vkEnumeratePhysicalDevices,
            FD_vkGetPhysicalDeviceFeatures,
            FD_vkGetPhysicalDeviceFormatProperties,
            FD_vkGetPhysicalDeviceImageFormatProperties,
            FD_vkGetPhysicalDeviceProperties,
            FD_vkGetPhysicalDeviceQueueFamilyProperties,
            FD_vkGetPhysicalDeviceMemoryProperties,
            FD_vkGetInstanceProcAddr,
            FD_vkGetDeviceProcAddr,
            FD_vkCreateDevice,
            FD_vkDestroyDevice,
            FD_vkEnumerateInstanceExtensionProperties,
            FD_vkEnumerateDeviceExtensionProperties,
            FD_vkEnumerateInstanceLayerProperties,
            FD_vkEnumerateDeviceLayerProperties,
            FD_vkGetDeviceQueue,
            FD_vkQueueSubmit,
            FD_vkQueueWaitIdle,
            FD_vkDeviceWaitIdle,
            FD_vkAllocateMemory,
            FD_vkFreeMemory,
            FD_vkMapMemory,
            FD_vkUnmapMemory,
            FD_vkFlushMappedMemoryRanges,
            FD_vkInvalidateMappedMemoryRanges,
            FD_vkGetDeviceMemoryCommitment,
            FD_vkBindBufferMemory,
            FD_vkBindImageMemory,
            FD_vkGetBufferMemoryRequirements,
            FD_vkGetImageMemoryRequirements,
            FD_vkGetImageSparseMemoryRequirements,
            FD_vkGetPhysicalDeviceSparseImageFormatProperties,
            FD_vkQueueBindSparse,
            FD_vkCreateFence,
            FD_vkDestroyFence,
            FD_vkResetFences,
            FD_vkGetFenceStatus,
            FD_vkWaitForFences,
            FD_vkCreateSemaphore,
            FD_vkDestroySemaphore,
            FD_vkCreateEvent,
            FD_vkDestroyEvent,
            FD_vkGetEventStatus,
            FD_vkSetEvent,
            FD_vkResetEvent,
            FD_vkCreateQueryPool,
            FD_vkDestroyQueryPool,
            FD_vkGetQueryPoolResults,
            FD_vkCreateBuffer,
            FD_vkDestroyBuffer,
            FD_vkCreateBufferView,
            FD_vkDestroyBufferView,
            FD_vkCreateImage,
            FD_vkDestroyImage,
            FD_vkGetImageSubresourceLayout,
            FD_vkCreateImageView,
            FD_vkDestroyImageView,
            FD_vkCreateShaderModule,
            FD_vkDestroyShaderModule,
            FD_vkCreatePipelineCache,
            FD_vkDestroyPipelineCache,
            FD_vkGetPipelineCacheData,
            FD_vkMergePipelineCaches,
            FD_vkCreateGraphicsPipelines,
            FD_vkCreateComputePipelines,
            FD_vkDestroyPipeline,
            FD_vkCreatePipelineLayout,
            FD_vkDestroyPipelineLayout,
            FD_vkCreateSampler,
            FD_vkDestroySampler,
            FD_vkCreateDescriptorSetLayout,
            FD_vkDestroyDescriptorSetLayout,
            FD_vkCreateDescriptorPool,
            FD_vkDestroyDescriptorPool,
            FD_vkResetDescriptorPool,
            FD_vkAllocateDescriptorSets,
            FD_vkFreeDescriptorSets,
            FD_vkUpdateDescriptorSets,
            FD_vkCreateFramebuffer,
            FD_vkDestroyFramebuffer,
            FD_vkCreateRenderPass,
            FD_vkDestroyRenderPass,
            FD_vkGetRenderAreaGranularity,
            FD_vkCreateCommandPool,
            FD_vkDestroyCommandPool,
            FD_vkResetCommandPool,
            FD_vkAllocateCommandBuffers,
            FD_vkFreeCommandBuffers,
            FD_vkBeginCommandBuffer,
            FD_vkEndCommandBuffer,
            FD_vkResetCommandBuffer,
            FD_vkCmdBindPipeline,
            FD_vkCmdSetViewport,
            FD_vkCmdSetScissor,
            FD_vkCmdSetLineWidth,
            FD_vkCmdSetDepthBias,
            FD_vkCmdSetBlendConstants,
            FD_vkCmdSetDepthBounds,
            FD_vkCmdSetStencilCompareMask,
            FD_vkCmdSetStencilWriteMask,
            FD_vkCmdSetStencilReference,
            FD_vkCmdBindDescriptorSets,
            FD_vkCmdBindIndexBuffer,
            FD_vkCmdBindVertexBuffers,
            FD_vkCmdDraw,
            FD_vkCmdDrawIndexed,
            FD_vkCmdDrawIndirect,
            FD_vkCmdDrawIndexedIndirect,
            FD_vkCmdDispatch,
            FD_vkCmdDispatchIndirect,
            FD_vkCmdCopyBuffer,
            FD_vkCmdCopyImage,
            FD_vkCmdBlitImage,
            FD_vkCmdCopyBufferToImage,
            FD_vkCmdCopyImageToBuffer,
            FD_vkCmdUpdateBuffer,
            FD_vkCmdFillBuffer,
            FD_vkCmdClearColorImage,
            FD_vkCmdClearDepthStencilImage,
            FD_vkCmdClearAttachments,
            FD_vkCmdResolveImage,
            FD_vkCmdSetEvent,
            FD_vkCmdResetEvent,
            FD_vkCmdWaitEvents,
            FD_vkCmdPipelineBarrier,
            FD_vkCmdBeginQuery,
            FD_vkCmdEndQuery,
            FD_vkCmdResetQueryPool,
            FD_vkCmdWriteTimestamp,
            FD_vkCmdCopyQueryPoolResults,
            FD_vkCmdPushConstants,
            FD_vkCmdBeginRenderPass,
            FD_vkCmdNextSubpass,
            FD_vkCmdEndRenderPass,
            FD_vkCmdExecuteCommands
        );
        private Descriptors() {}
    }
    public static final class Handles {
        public static final MethodHandle MH_vkCreateInstance = RuntimeHelper.downcall(Descriptors.FD_vkCreateInstance);
        public static final MethodHandle MH_vkDestroyInstance = RuntimeHelper.downcall(Descriptors.FD_vkDestroyInstance);
        public static final MethodHandle MH_vkEnumeratePhysicalDevices = RuntimeHelper.downcall(Descriptors.FD_vkEnumeratePhysicalDevices);
        public static final MethodHandle MH_vkGetPhysicalDeviceFeatures = RuntimeHelper.downcall(Descriptors.FD_vkGetPhysicalDeviceFeatures);
        public static final MethodHandle MH_vkGetPhysicalDeviceFormatProperties = RuntimeHelper.downcall(Descriptors.FD_vkGetPhysicalDeviceFormatProperties);
        public static final MethodHandle MH_vkGetPhysicalDeviceImageFormatProperties = RuntimeHelper.downcall(Descriptors.FD_vkGetPhysicalDeviceImageFormatProperties);
        public static final MethodHandle MH_vkGetPhysicalDeviceProperties = RuntimeHelper.downcall(Descriptors.FD_vkGetPhysicalDeviceProperties);
        public static final MethodHandle MH_vkGetPhysicalDeviceQueueFamilyProperties = RuntimeHelper.downcall(Descriptors.FD_vkGetPhysicalDeviceQueueFamilyProperties);
        public static final MethodHandle MH_vkGetPhysicalDeviceMemoryProperties = RuntimeHelper.downcall(Descriptors.FD_vkGetPhysicalDeviceMemoryProperties);
        public static final MethodHandle MH_vkGetInstanceProcAddr = RuntimeHelper.downcall(Descriptors.FD_vkGetInstanceProcAddr);
        public static final MethodHandle MH_vkGetDeviceProcAddr = RuntimeHelper.downcall(Descriptors.FD_vkGetDeviceProcAddr);
        public static final MethodHandle MH_vkCreateDevice = RuntimeHelper.downcall(Descriptors.FD_vkCreateDevice);
        public static final MethodHandle MH_vkDestroyDevice = RuntimeHelper.downcall(Descriptors.FD_vkDestroyDevice);
        public static final MethodHandle MH_vkEnumerateInstanceExtensionProperties = RuntimeHelper.downcall(Descriptors.FD_vkEnumerateInstanceExtensionProperties);
        public static final MethodHandle MH_vkEnumerateDeviceExtensionProperties = RuntimeHelper.downcall(Descriptors.FD_vkEnumerateDeviceExtensionProperties);
        public static final MethodHandle MH_vkEnumerateInstanceLayerProperties = RuntimeHelper.downcall(Descriptors.FD_vkEnumerateInstanceLayerProperties);
        public static final MethodHandle MH_vkEnumerateDeviceLayerProperties = RuntimeHelper.downcall(Descriptors.FD_vkEnumerateDeviceLayerProperties);
        public static final MethodHandle MH_vkGetDeviceQueue = RuntimeHelper.downcall(Descriptors.FD_vkGetDeviceQueue);
        public static final MethodHandle MH_vkQueueSubmit = RuntimeHelper.downcall(Descriptors.FD_vkQueueSubmit);
        public static final MethodHandle MH_vkQueueWaitIdle = RuntimeHelper.downcall(Descriptors.FD_vkQueueWaitIdle);
        public static final MethodHandle MH_vkDeviceWaitIdle = RuntimeHelper.downcall(Descriptors.FD_vkDeviceWaitIdle);
        public static final MethodHandle MH_vkAllocateMemory = RuntimeHelper.downcall(Descriptors.FD_vkAllocateMemory);
        public static final MethodHandle MH_vkFreeMemory = RuntimeHelper.downcall(Descriptors.FD_vkFreeMemory);
        public static final MethodHandle MH_vkMapMemory = RuntimeHelper.downcall(Descriptors.FD_vkMapMemory);
        public static final MethodHandle MH_vkUnmapMemory = RuntimeHelper.downcall(Descriptors.FD_vkUnmapMemory);
        public static final MethodHandle MH_vkFlushMappedMemoryRanges = RuntimeHelper.downcall(Descriptors.FD_vkFlushMappedMemoryRanges);
        public static final MethodHandle MH_vkInvalidateMappedMemoryRanges = RuntimeHelper.downcall(Descriptors.FD_vkInvalidateMappedMemoryRanges);
        public static final MethodHandle MH_vkGetDeviceMemoryCommitment = RuntimeHelper.downcall(Descriptors.FD_vkGetDeviceMemoryCommitment);
        public static final MethodHandle MH_vkBindBufferMemory = RuntimeHelper.downcall(Descriptors.FD_vkBindBufferMemory);
        public static final MethodHandle MH_vkBindImageMemory = RuntimeHelper.downcall(Descriptors.FD_vkBindImageMemory);
        public static final MethodHandle MH_vkGetBufferMemoryRequirements = RuntimeHelper.downcall(Descriptors.FD_vkGetBufferMemoryRequirements);
        public static final MethodHandle MH_vkGetImageMemoryRequirements = RuntimeHelper.downcall(Descriptors.FD_vkGetImageMemoryRequirements);
        public static final MethodHandle MH_vkGetImageSparseMemoryRequirements = RuntimeHelper.downcall(Descriptors.FD_vkGetImageSparseMemoryRequirements);
        public static final MethodHandle MH_vkGetPhysicalDeviceSparseImageFormatProperties = RuntimeHelper.downcall(Descriptors.FD_vkGetPhysicalDeviceSparseImageFormatProperties);
        public static final MethodHandle MH_vkQueueBindSparse = RuntimeHelper.downcall(Descriptors.FD_vkQueueBindSparse);
        public static final MethodHandle MH_vkCreateFence = RuntimeHelper.downcall(Descriptors.FD_vkCreateFence);
        public static final MethodHandle MH_vkDestroyFence = RuntimeHelper.downcall(Descriptors.FD_vkDestroyFence);
        public static final MethodHandle MH_vkResetFences = RuntimeHelper.downcall(Descriptors.FD_vkResetFences);
        public static final MethodHandle MH_vkGetFenceStatus = RuntimeHelper.downcall(Descriptors.FD_vkGetFenceStatus);
        public static final MethodHandle MH_vkWaitForFences = RuntimeHelper.downcall(Descriptors.FD_vkWaitForFences);
        public static final MethodHandle MH_vkCreateSemaphore = RuntimeHelper.downcall(Descriptors.FD_vkCreateSemaphore);
        public static final MethodHandle MH_vkDestroySemaphore = RuntimeHelper.downcall(Descriptors.FD_vkDestroySemaphore);
        public static final MethodHandle MH_vkCreateEvent = RuntimeHelper.downcall(Descriptors.FD_vkCreateEvent);
        public static final MethodHandle MH_vkDestroyEvent = RuntimeHelper.downcall(Descriptors.FD_vkDestroyEvent);
        public static final MethodHandle MH_vkGetEventStatus = RuntimeHelper.downcall(Descriptors.FD_vkGetEventStatus);
        public static final MethodHandle MH_vkSetEvent = RuntimeHelper.downcall(Descriptors.FD_vkSetEvent);
        public static final MethodHandle MH_vkResetEvent = RuntimeHelper.downcall(Descriptors.FD_vkResetEvent);
        public static final MethodHandle MH_vkCreateQueryPool = RuntimeHelper.downcall(Descriptors.FD_vkCreateQueryPool);
        public static final MethodHandle MH_vkDestroyQueryPool = RuntimeHelper.downcall(Descriptors.FD_vkDestroyQueryPool);
        public static final MethodHandle MH_vkGetQueryPoolResults = RuntimeHelper.downcall(Descriptors.FD_vkGetQueryPoolResults);
        public static final MethodHandle MH_vkCreateBuffer = RuntimeHelper.downcall(Descriptors.FD_vkCreateBuffer);
        public static final MethodHandle MH_vkDestroyBuffer = RuntimeHelper.downcall(Descriptors.FD_vkDestroyBuffer);
        public static final MethodHandle MH_vkCreateBufferView = RuntimeHelper.downcall(Descriptors.FD_vkCreateBufferView);
        public static final MethodHandle MH_vkDestroyBufferView = RuntimeHelper.downcall(Descriptors.FD_vkDestroyBufferView);
        public static final MethodHandle MH_vkCreateImage = RuntimeHelper.downcall(Descriptors.FD_vkCreateImage);
        public static final MethodHandle MH_vkDestroyImage = RuntimeHelper.downcall(Descriptors.FD_vkDestroyImage);
        public static final MethodHandle MH_vkGetImageSubresourceLayout = RuntimeHelper.downcall(Descriptors.FD_vkGetImageSubresourceLayout);
        public static final MethodHandle MH_vkCreateImageView = RuntimeHelper.downcall(Descriptors.FD_vkCreateImageView);
        public static final MethodHandle MH_vkDestroyImageView = RuntimeHelper.downcall(Descriptors.FD_vkDestroyImageView);
        public static final MethodHandle MH_vkCreateShaderModule = RuntimeHelper.downcall(Descriptors.FD_vkCreateShaderModule);
        public static final MethodHandle MH_vkDestroyShaderModule = RuntimeHelper.downcall(Descriptors.FD_vkDestroyShaderModule);
        public static final MethodHandle MH_vkCreatePipelineCache = RuntimeHelper.downcall(Descriptors.FD_vkCreatePipelineCache);
        public static final MethodHandle MH_vkDestroyPipelineCache = RuntimeHelper.downcall(Descriptors.FD_vkDestroyPipelineCache);
        public static final MethodHandle MH_vkGetPipelineCacheData = RuntimeHelper.downcall(Descriptors.FD_vkGetPipelineCacheData);
        public static final MethodHandle MH_vkMergePipelineCaches = RuntimeHelper.downcall(Descriptors.FD_vkMergePipelineCaches);
        public static final MethodHandle MH_vkCreateGraphicsPipelines = RuntimeHelper.downcall(Descriptors.FD_vkCreateGraphicsPipelines);
        public static final MethodHandle MH_vkCreateComputePipelines = RuntimeHelper.downcall(Descriptors.FD_vkCreateComputePipelines);
        public static final MethodHandle MH_vkDestroyPipeline = RuntimeHelper.downcall(Descriptors.FD_vkDestroyPipeline);
        public static final MethodHandle MH_vkCreatePipelineLayout = RuntimeHelper.downcall(Descriptors.FD_vkCreatePipelineLayout);
        public static final MethodHandle MH_vkDestroyPipelineLayout = RuntimeHelper.downcall(Descriptors.FD_vkDestroyPipelineLayout);
        public static final MethodHandle MH_vkCreateSampler = RuntimeHelper.downcall(Descriptors.FD_vkCreateSampler);
        public static final MethodHandle MH_vkDestroySampler = RuntimeHelper.downcall(Descriptors.FD_vkDestroySampler);
        public static final MethodHandle MH_vkCreateDescriptorSetLayout = RuntimeHelper.downcall(Descriptors.FD_vkCreateDescriptorSetLayout);
        public static final MethodHandle MH_vkDestroyDescriptorSetLayout = RuntimeHelper.downcall(Descriptors.FD_vkDestroyDescriptorSetLayout);
        public static final MethodHandle MH_vkCreateDescriptorPool = RuntimeHelper.downcall(Descriptors.FD_vkCreateDescriptorPool);
        public static final MethodHandle MH_vkDestroyDescriptorPool = RuntimeHelper.downcall(Descriptors.FD_vkDestroyDescriptorPool);
        public static final MethodHandle MH_vkResetDescriptorPool = RuntimeHelper.downcall(Descriptors.FD_vkResetDescriptorPool);
        public static final MethodHandle MH_vkAllocateDescriptorSets = RuntimeHelper.downcall(Descriptors.FD_vkAllocateDescriptorSets);
        public static final MethodHandle MH_vkFreeDescriptorSets = RuntimeHelper.downcall(Descriptors.FD_vkFreeDescriptorSets);
        public static final MethodHandle MH_vkUpdateDescriptorSets = RuntimeHelper.downcall(Descriptors.FD_vkUpdateDescriptorSets);
        public static final MethodHandle MH_vkCreateFramebuffer = RuntimeHelper.downcall(Descriptors.FD_vkCreateFramebuffer);
        public static final MethodHandle MH_vkDestroyFramebuffer = RuntimeHelper.downcall(Descriptors.FD_vkDestroyFramebuffer);
        public static final MethodHandle MH_vkCreateRenderPass = RuntimeHelper.downcall(Descriptors.FD_vkCreateRenderPass);
        public static final MethodHandle MH_vkDestroyRenderPass = RuntimeHelper.downcall(Descriptors.FD_vkDestroyRenderPass);
        public static final MethodHandle MH_vkGetRenderAreaGranularity = RuntimeHelper.downcall(Descriptors.FD_vkGetRenderAreaGranularity);
        public static final MethodHandle MH_vkCreateCommandPool = RuntimeHelper.downcall(Descriptors.FD_vkCreateCommandPool);
        public static final MethodHandle MH_vkDestroyCommandPool = RuntimeHelper.downcall(Descriptors.FD_vkDestroyCommandPool);
        public static final MethodHandle MH_vkResetCommandPool = RuntimeHelper.downcall(Descriptors.FD_vkResetCommandPool);
        public static final MethodHandle MH_vkAllocateCommandBuffers = RuntimeHelper.downcall(Descriptors.FD_vkAllocateCommandBuffers);
        public static final MethodHandle MH_vkFreeCommandBuffers = RuntimeHelper.downcall(Descriptors.FD_vkFreeCommandBuffers);
        public static final MethodHandle MH_vkBeginCommandBuffer = RuntimeHelper.downcall(Descriptors.FD_vkBeginCommandBuffer);
        public static final MethodHandle MH_vkEndCommandBuffer = RuntimeHelper.downcall(Descriptors.FD_vkEndCommandBuffer);
        public static final MethodHandle MH_vkResetCommandBuffer = RuntimeHelper.downcall(Descriptors.FD_vkResetCommandBuffer);
        public static final MethodHandle MH_vkCmdBindPipeline = RuntimeHelper.downcall(Descriptors.FD_vkCmdBindPipeline);
        public static final MethodHandle MH_vkCmdSetViewport = RuntimeHelper.downcall(Descriptors.FD_vkCmdSetViewport);
        public static final MethodHandle MH_vkCmdSetScissor = RuntimeHelper.downcall(Descriptors.FD_vkCmdSetScissor);
        public static final MethodHandle MH_vkCmdSetLineWidth = RuntimeHelper.downcall(Descriptors.FD_vkCmdSetLineWidth);
        public static final MethodHandle MH_vkCmdSetDepthBias = RuntimeHelper.downcall(Descriptors.FD_vkCmdSetDepthBias);
        public static final MethodHandle MH_vkCmdSetBlendConstants = RuntimeHelper.downcall(Descriptors.FD_vkCmdSetBlendConstants);
        public static final MethodHandle MH_vkCmdSetDepthBounds = RuntimeHelper.downcall(Descriptors.FD_vkCmdSetDepthBounds);
        public static final MethodHandle MH_vkCmdSetStencilCompareMask = RuntimeHelper.downcall(Descriptors.FD_vkCmdSetStencilCompareMask);
        public static final MethodHandle MH_vkCmdSetStencilWriteMask = RuntimeHelper.downcall(Descriptors.FD_vkCmdSetStencilWriteMask);
        public static final MethodHandle MH_vkCmdSetStencilReference = RuntimeHelper.downcall(Descriptors.FD_vkCmdSetStencilReference);
        public static final MethodHandle MH_vkCmdBindDescriptorSets = RuntimeHelper.downcall(Descriptors.FD_vkCmdBindDescriptorSets);
        public static final MethodHandle MH_vkCmdBindIndexBuffer = RuntimeHelper.downcall(Descriptors.FD_vkCmdBindIndexBuffer);
        public static final MethodHandle MH_vkCmdBindVertexBuffers = RuntimeHelper.downcall(Descriptors.FD_vkCmdBindVertexBuffers);
        public static final MethodHandle MH_vkCmdDraw = RuntimeHelper.downcall(Descriptors.FD_vkCmdDraw);
        public static final MethodHandle MH_vkCmdDrawIndexed = RuntimeHelper.downcall(Descriptors.FD_vkCmdDrawIndexed);
        public static final MethodHandle MH_vkCmdDrawIndirect = RuntimeHelper.downcall(Descriptors.FD_vkCmdDrawIndirect);
        public static final MethodHandle MH_vkCmdDrawIndexedIndirect = RuntimeHelper.downcall(Descriptors.FD_vkCmdDrawIndexedIndirect);
        public static final MethodHandle MH_vkCmdDispatch = RuntimeHelper.downcall(Descriptors.FD_vkCmdDispatch);
        public static final MethodHandle MH_vkCmdDispatchIndirect = RuntimeHelper.downcall(Descriptors.FD_vkCmdDispatchIndirect);
        public static final MethodHandle MH_vkCmdCopyBuffer = RuntimeHelper.downcall(Descriptors.FD_vkCmdCopyBuffer);
        public static final MethodHandle MH_vkCmdCopyImage = RuntimeHelper.downcall(Descriptors.FD_vkCmdCopyImage);
        public static final MethodHandle MH_vkCmdBlitImage = RuntimeHelper.downcall(Descriptors.FD_vkCmdBlitImage);
        public static final MethodHandle MH_vkCmdCopyBufferToImage = RuntimeHelper.downcall(Descriptors.FD_vkCmdCopyBufferToImage);
        public static final MethodHandle MH_vkCmdCopyImageToBuffer = RuntimeHelper.downcall(Descriptors.FD_vkCmdCopyImageToBuffer);
        public static final MethodHandle MH_vkCmdUpdateBuffer = RuntimeHelper.downcall(Descriptors.FD_vkCmdUpdateBuffer);
        public static final MethodHandle MH_vkCmdFillBuffer = RuntimeHelper.downcall(Descriptors.FD_vkCmdFillBuffer);
        public static final MethodHandle MH_vkCmdClearColorImage = RuntimeHelper.downcall(Descriptors.FD_vkCmdClearColorImage);
        public static final MethodHandle MH_vkCmdClearDepthStencilImage = RuntimeHelper.downcall(Descriptors.FD_vkCmdClearDepthStencilImage);
        public static final MethodHandle MH_vkCmdClearAttachments = RuntimeHelper.downcall(Descriptors.FD_vkCmdClearAttachments);
        public static final MethodHandle MH_vkCmdResolveImage = RuntimeHelper.downcall(Descriptors.FD_vkCmdResolveImage);
        public static final MethodHandle MH_vkCmdSetEvent = RuntimeHelper.downcall(Descriptors.FD_vkCmdSetEvent);
        public static final MethodHandle MH_vkCmdResetEvent = RuntimeHelper.downcall(Descriptors.FD_vkCmdResetEvent);
        public static final MethodHandle MH_vkCmdWaitEvents = RuntimeHelper.downcall(Descriptors.FD_vkCmdWaitEvents);
        public static final MethodHandle MH_vkCmdPipelineBarrier = RuntimeHelper.downcall(Descriptors.FD_vkCmdPipelineBarrier);
        public static final MethodHandle MH_vkCmdBeginQuery = RuntimeHelper.downcall(Descriptors.FD_vkCmdBeginQuery);
        public static final MethodHandle MH_vkCmdEndQuery = RuntimeHelper.downcall(Descriptors.FD_vkCmdEndQuery);
        public static final MethodHandle MH_vkCmdResetQueryPool = RuntimeHelper.downcall(Descriptors.FD_vkCmdResetQueryPool);
        public static final MethodHandle MH_vkCmdWriteTimestamp = RuntimeHelper.downcall(Descriptors.FD_vkCmdWriteTimestamp);
        public static final MethodHandle MH_vkCmdCopyQueryPoolResults = RuntimeHelper.downcall(Descriptors.FD_vkCmdCopyQueryPoolResults);
        public static final MethodHandle MH_vkCmdPushConstants = RuntimeHelper.downcall(Descriptors.FD_vkCmdPushConstants);
        public static final MethodHandle MH_vkCmdBeginRenderPass = RuntimeHelper.downcall(Descriptors.FD_vkCmdBeginRenderPass);
        public static final MethodHandle MH_vkCmdNextSubpass = RuntimeHelper.downcall(Descriptors.FD_vkCmdNextSubpass);
        public static final MethodHandle MH_vkCmdEndRenderPass = RuntimeHelper.downcall(Descriptors.FD_vkCmdEndRenderPass);
        public static final MethodHandle MH_vkCmdExecuteCommands = RuntimeHelper.downcall(Descriptors.FD_vkCmdExecuteCommands);
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
        private Handles(@CType("VkInstance") MemorySegment instance, VKLoadFunc func) {
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

    public VK10(@CType("VkInstance") MemorySegment instance, VKLoadFunc func) {
        this.handles = new Handles(instance, func);
    }

    public @CType("VkResult") int CreateInstance(@CType("const VkInstanceCreateInfo *") MemorySegment pCreateInfo, @CType("const VkAllocationCallbacks *") MemorySegment pAllocator, @CType("VkInstance *") MemorySegment pInstance) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCreateInstance)) throw new SymbolNotFoundError("Symbol not found: vkCreateInstance");
        try { return (int) Handles.MH_vkCreateInstance.invokeExact(handles.PFN_vkCreateInstance, pCreateInfo, pAllocator, pInstance); }
        catch (Throwable e) { throw new RuntimeException("error in vkCreateInstance", e); }
    }

    public void DestroyInstance(@CType("VkInstance") MemorySegment instance, @CType("const VkAllocationCallbacks *") MemorySegment pAllocator) {
        if (Unmarshal.isNullPointer(handles.PFN_vkDestroyInstance)) throw new SymbolNotFoundError("Symbol not found: vkDestroyInstance");
        try { Handles.MH_vkDestroyInstance.invokeExact(handles.PFN_vkDestroyInstance, instance, pAllocator); }
        catch (Throwable e) { throw new RuntimeException("error in vkDestroyInstance", e); }
    }

    public @CType("VkResult") int EnumeratePhysicalDevices(@CType("VkInstance") MemorySegment instance, @CType("uint32_t *") MemorySegment pPhysicalDeviceCount, @CType("VkPhysicalDevice *") MemorySegment pPhysicalDevices) {
        if (Unmarshal.isNullPointer(handles.PFN_vkEnumeratePhysicalDevices)) throw new SymbolNotFoundError("Symbol not found: vkEnumeratePhysicalDevices");
        try { return (int) Handles.MH_vkEnumeratePhysicalDevices.invokeExact(handles.PFN_vkEnumeratePhysicalDevices, instance, pPhysicalDeviceCount, pPhysicalDevices); }
        catch (Throwable e) { throw new RuntimeException("error in vkEnumeratePhysicalDevices", e); }
    }

    public void GetPhysicalDeviceFeatures(@CType("VkPhysicalDevice") MemorySegment physicalDevice, @CType("VkPhysicalDeviceFeatures *") MemorySegment pFeatures) {
        if (Unmarshal.isNullPointer(handles.PFN_vkGetPhysicalDeviceFeatures)) throw new SymbolNotFoundError("Symbol not found: vkGetPhysicalDeviceFeatures");
        try { Handles.MH_vkGetPhysicalDeviceFeatures.invokeExact(handles.PFN_vkGetPhysicalDeviceFeatures, physicalDevice, pFeatures); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetPhysicalDeviceFeatures", e); }
    }

    public void GetPhysicalDeviceFormatProperties(@CType("VkPhysicalDevice") MemorySegment physicalDevice, @CType("VkFormat") int format, @CType("VkFormatProperties *") MemorySegment pFormatProperties) {
        if (Unmarshal.isNullPointer(handles.PFN_vkGetPhysicalDeviceFormatProperties)) throw new SymbolNotFoundError("Symbol not found: vkGetPhysicalDeviceFormatProperties");
        try { Handles.MH_vkGetPhysicalDeviceFormatProperties.invokeExact(handles.PFN_vkGetPhysicalDeviceFormatProperties, physicalDevice, format, pFormatProperties); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetPhysicalDeviceFormatProperties", e); }
    }

    public @CType("VkResult") int GetPhysicalDeviceImageFormatProperties(@CType("VkPhysicalDevice") MemorySegment physicalDevice, @CType("VkFormat") int format, @CType("VkImageType") int type, @CType("VkImageTiling") int tiling, @CType("VkImageUsageFlags") int usage, @CType("VkImageCreateFlags") int flags, @CType("VkImageFormatProperties *") MemorySegment pImageFormatProperties) {
        if (Unmarshal.isNullPointer(handles.PFN_vkGetPhysicalDeviceImageFormatProperties)) throw new SymbolNotFoundError("Symbol not found: vkGetPhysicalDeviceImageFormatProperties");
        try { return (int) Handles.MH_vkGetPhysicalDeviceImageFormatProperties.invokeExact(handles.PFN_vkGetPhysicalDeviceImageFormatProperties, physicalDevice, format, type, tiling, usage, flags, pImageFormatProperties); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetPhysicalDeviceImageFormatProperties", e); }
    }

    public void GetPhysicalDeviceProperties(@CType("VkPhysicalDevice") MemorySegment physicalDevice, @CType("VkPhysicalDeviceProperties *") MemorySegment pProperties) {
        if (Unmarshal.isNullPointer(handles.PFN_vkGetPhysicalDeviceProperties)) throw new SymbolNotFoundError("Symbol not found: vkGetPhysicalDeviceProperties");
        try { Handles.MH_vkGetPhysicalDeviceProperties.invokeExact(handles.PFN_vkGetPhysicalDeviceProperties, physicalDevice, pProperties); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetPhysicalDeviceProperties", e); }
    }

    public void GetPhysicalDeviceQueueFamilyProperties(@CType("VkPhysicalDevice") MemorySegment physicalDevice, @CType("uint32_t *") MemorySegment pQueueFamilyPropertyCount, @CType("VkQueueFamilyProperties *") MemorySegment pQueueFamilyProperties) {
        if (Unmarshal.isNullPointer(handles.PFN_vkGetPhysicalDeviceQueueFamilyProperties)) throw new SymbolNotFoundError("Symbol not found: vkGetPhysicalDeviceQueueFamilyProperties");
        try { Handles.MH_vkGetPhysicalDeviceQueueFamilyProperties.invokeExact(handles.PFN_vkGetPhysicalDeviceQueueFamilyProperties, physicalDevice, pQueueFamilyPropertyCount, pQueueFamilyProperties); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetPhysicalDeviceQueueFamilyProperties", e); }
    }

    public void GetPhysicalDeviceMemoryProperties(@CType("VkPhysicalDevice") MemorySegment physicalDevice, @CType("VkPhysicalDeviceMemoryProperties *") MemorySegment pMemoryProperties) {
        if (Unmarshal.isNullPointer(handles.PFN_vkGetPhysicalDeviceMemoryProperties)) throw new SymbolNotFoundError("Symbol not found: vkGetPhysicalDeviceMemoryProperties");
        try { Handles.MH_vkGetPhysicalDeviceMemoryProperties.invokeExact(handles.PFN_vkGetPhysicalDeviceMemoryProperties, physicalDevice, pMemoryProperties); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetPhysicalDeviceMemoryProperties", e); }
    }

    public @CType("PFN_vkVoidFunction") MemorySegment GetInstanceProcAddr(@CType("VkInstance") MemorySegment instance, @CType("const char *") MemorySegment pName) {
        if (Unmarshal.isNullPointer(handles.PFN_vkGetInstanceProcAddr)) throw new SymbolNotFoundError("Symbol not found: vkGetInstanceProcAddr");
        try { return (MemorySegment) Handles.MH_vkGetInstanceProcAddr.invokeExact(handles.PFN_vkGetInstanceProcAddr, instance, pName); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetInstanceProcAddr", e); }
    }

    public @CType("PFN_vkVoidFunction") MemorySegment GetDeviceProcAddr(@CType("VkDevice") MemorySegment device, @CType("const char *") MemorySegment pName) {
        if (Unmarshal.isNullPointer(handles.PFN_vkGetDeviceProcAddr)) throw new SymbolNotFoundError("Symbol not found: vkGetDeviceProcAddr");
        try { return (MemorySegment) Handles.MH_vkGetDeviceProcAddr.invokeExact(handles.PFN_vkGetDeviceProcAddr, device, pName); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetDeviceProcAddr", e); }
    }

    public @CType("VkResult") int CreateDevice(@CType("VkPhysicalDevice") MemorySegment physicalDevice, @CType("const VkDeviceCreateInfo *") MemorySegment pCreateInfo, @CType("const VkAllocationCallbacks *") MemorySegment pAllocator, @CType("VkDevice *") MemorySegment pDevice) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCreateDevice)) throw new SymbolNotFoundError("Symbol not found: vkCreateDevice");
        try { return (int) Handles.MH_vkCreateDevice.invokeExact(handles.PFN_vkCreateDevice, physicalDevice, pCreateInfo, pAllocator, pDevice); }
        catch (Throwable e) { throw new RuntimeException("error in vkCreateDevice", e); }
    }

    public void DestroyDevice(@CType("VkDevice") MemorySegment device, @CType("const VkAllocationCallbacks *") MemorySegment pAllocator) {
        if (Unmarshal.isNullPointer(handles.PFN_vkDestroyDevice)) throw new SymbolNotFoundError("Symbol not found: vkDestroyDevice");
        try { Handles.MH_vkDestroyDevice.invokeExact(handles.PFN_vkDestroyDevice, device, pAllocator); }
        catch (Throwable e) { throw new RuntimeException("error in vkDestroyDevice", e); }
    }

    public @CType("VkResult") int EnumerateInstanceExtensionProperties(@CType("const char *") MemorySegment pLayerName, @CType("uint32_t *") MemorySegment pPropertyCount, @CType("VkExtensionProperties *") MemorySegment pProperties) {
        if (Unmarshal.isNullPointer(handles.PFN_vkEnumerateInstanceExtensionProperties)) throw new SymbolNotFoundError("Symbol not found: vkEnumerateInstanceExtensionProperties");
        try { return (int) Handles.MH_vkEnumerateInstanceExtensionProperties.invokeExact(handles.PFN_vkEnumerateInstanceExtensionProperties, pLayerName, pPropertyCount, pProperties); }
        catch (Throwable e) { throw new RuntimeException("error in vkEnumerateInstanceExtensionProperties", e); }
    }

    public @CType("VkResult") int EnumerateDeviceExtensionProperties(@CType("VkPhysicalDevice") MemorySegment physicalDevice, @CType("const char *") MemorySegment pLayerName, @CType("uint32_t *") MemorySegment pPropertyCount, @CType("VkExtensionProperties *") MemorySegment pProperties) {
        if (Unmarshal.isNullPointer(handles.PFN_vkEnumerateDeviceExtensionProperties)) throw new SymbolNotFoundError("Symbol not found: vkEnumerateDeviceExtensionProperties");
        try { return (int) Handles.MH_vkEnumerateDeviceExtensionProperties.invokeExact(handles.PFN_vkEnumerateDeviceExtensionProperties, physicalDevice, pLayerName, pPropertyCount, pProperties); }
        catch (Throwable e) { throw new RuntimeException("error in vkEnumerateDeviceExtensionProperties", e); }
    }

    public @CType("VkResult") int EnumerateInstanceLayerProperties(@CType("uint32_t *") MemorySegment pPropertyCount, @CType("VkLayerProperties *") MemorySegment pProperties) {
        if (Unmarshal.isNullPointer(handles.PFN_vkEnumerateInstanceLayerProperties)) throw new SymbolNotFoundError("Symbol not found: vkEnumerateInstanceLayerProperties");
        try { return (int) Handles.MH_vkEnumerateInstanceLayerProperties.invokeExact(handles.PFN_vkEnumerateInstanceLayerProperties, pPropertyCount, pProperties); }
        catch (Throwable e) { throw new RuntimeException("error in vkEnumerateInstanceLayerProperties", e); }
    }

    public @CType("VkResult") int EnumerateDeviceLayerProperties(@CType("VkPhysicalDevice") MemorySegment physicalDevice, @CType("uint32_t *") MemorySegment pPropertyCount, @CType("VkLayerProperties *") MemorySegment pProperties) {
        if (Unmarshal.isNullPointer(handles.PFN_vkEnumerateDeviceLayerProperties)) throw new SymbolNotFoundError("Symbol not found: vkEnumerateDeviceLayerProperties");
        try { return (int) Handles.MH_vkEnumerateDeviceLayerProperties.invokeExact(handles.PFN_vkEnumerateDeviceLayerProperties, physicalDevice, pPropertyCount, pProperties); }
        catch (Throwable e) { throw new RuntimeException("error in vkEnumerateDeviceLayerProperties", e); }
    }

    public void GetDeviceQueue(@CType("VkDevice") MemorySegment device, @CType("uint32_t") int queueFamilyIndex, @CType("uint32_t") int queueIndex, @CType("VkQueue *") MemorySegment pQueue) {
        if (Unmarshal.isNullPointer(handles.PFN_vkGetDeviceQueue)) throw new SymbolNotFoundError("Symbol not found: vkGetDeviceQueue");
        try { Handles.MH_vkGetDeviceQueue.invokeExact(handles.PFN_vkGetDeviceQueue, device, queueFamilyIndex, queueIndex, pQueue); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetDeviceQueue", e); }
    }

    public @CType("VkResult") int QueueSubmit(@CType("VkQueue") MemorySegment queue, @CType("uint32_t") int submitCount, @CType("const VkSubmitInfo *") MemorySegment pSubmits, @CType("VkFence") MemorySegment fence) {
        if (Unmarshal.isNullPointer(handles.PFN_vkQueueSubmit)) throw new SymbolNotFoundError("Symbol not found: vkQueueSubmit");
        try { return (int) Handles.MH_vkQueueSubmit.invokeExact(handles.PFN_vkQueueSubmit, queue, submitCount, pSubmits, fence); }
        catch (Throwable e) { throw new RuntimeException("error in vkQueueSubmit", e); }
    }

    public @CType("VkResult") int QueueWaitIdle(@CType("VkQueue") MemorySegment queue) {
        if (Unmarshal.isNullPointer(handles.PFN_vkQueueWaitIdle)) throw new SymbolNotFoundError("Symbol not found: vkQueueWaitIdle");
        try { return (int) Handles.MH_vkQueueWaitIdle.invokeExact(handles.PFN_vkQueueWaitIdle, queue); }
        catch (Throwable e) { throw new RuntimeException("error in vkQueueWaitIdle", e); }
    }

    public @CType("VkResult") int DeviceWaitIdle(@CType("VkDevice") MemorySegment device) {
        if (Unmarshal.isNullPointer(handles.PFN_vkDeviceWaitIdle)) throw new SymbolNotFoundError("Symbol not found: vkDeviceWaitIdle");
        try { return (int) Handles.MH_vkDeviceWaitIdle.invokeExact(handles.PFN_vkDeviceWaitIdle, device); }
        catch (Throwable e) { throw new RuntimeException("error in vkDeviceWaitIdle", e); }
    }

    public @CType("VkResult") int AllocateMemory(@CType("VkDevice") MemorySegment device, @CType("const VkMemoryAllocateInfo *") MemorySegment pAllocateInfo, @CType("const VkAllocationCallbacks *") MemorySegment pAllocator, @CType("VkDeviceMemory *") MemorySegment pMemory) {
        if (Unmarshal.isNullPointer(handles.PFN_vkAllocateMemory)) throw new SymbolNotFoundError("Symbol not found: vkAllocateMemory");
        try { return (int) Handles.MH_vkAllocateMemory.invokeExact(handles.PFN_vkAllocateMemory, device, pAllocateInfo, pAllocator, pMemory); }
        catch (Throwable e) { throw new RuntimeException("error in vkAllocateMemory", e); }
    }

    public void FreeMemory(@CType("VkDevice") MemorySegment device, @CType("VkDeviceMemory") MemorySegment memory, @CType("const VkAllocationCallbacks *") MemorySegment pAllocator) {
        if (Unmarshal.isNullPointer(handles.PFN_vkFreeMemory)) throw new SymbolNotFoundError("Symbol not found: vkFreeMemory");
        try { Handles.MH_vkFreeMemory.invokeExact(handles.PFN_vkFreeMemory, device, memory, pAllocator); }
        catch (Throwable e) { throw new RuntimeException("error in vkFreeMemory", e); }
    }

    public @CType("VkResult") int MapMemory(@CType("VkDevice") MemorySegment device, @CType("VkDeviceMemory") MemorySegment memory, @CType("VkDeviceSize") long offset, @CType("VkDeviceSize") long size, @CType("VkMemoryMapFlags") int flags, @CType("void **") MemorySegment ppData) {
        if (Unmarshal.isNullPointer(handles.PFN_vkMapMemory)) throw new SymbolNotFoundError("Symbol not found: vkMapMemory");
        try { return (int) Handles.MH_vkMapMemory.invokeExact(handles.PFN_vkMapMemory, device, memory, offset, size, flags, ppData); }
        catch (Throwable e) { throw new RuntimeException("error in vkMapMemory", e); }
    }

    public void UnmapMemory(@CType("VkDevice") MemorySegment device, @CType("VkDeviceMemory") MemorySegment memory) {
        if (Unmarshal.isNullPointer(handles.PFN_vkUnmapMemory)) throw new SymbolNotFoundError("Symbol not found: vkUnmapMemory");
        try { Handles.MH_vkUnmapMemory.invokeExact(handles.PFN_vkUnmapMemory, device, memory); }
        catch (Throwable e) { throw new RuntimeException("error in vkUnmapMemory", e); }
    }

    public @CType("VkResult") int FlushMappedMemoryRanges(@CType("VkDevice") MemorySegment device, @CType("uint32_t") int memoryRangeCount, @CType("const VkMappedMemoryRange *") MemorySegment pMemoryRanges) {
        if (Unmarshal.isNullPointer(handles.PFN_vkFlushMappedMemoryRanges)) throw new SymbolNotFoundError("Symbol not found: vkFlushMappedMemoryRanges");
        try { return (int) Handles.MH_vkFlushMappedMemoryRanges.invokeExact(handles.PFN_vkFlushMappedMemoryRanges, device, memoryRangeCount, pMemoryRanges); }
        catch (Throwable e) { throw new RuntimeException("error in vkFlushMappedMemoryRanges", e); }
    }

    public @CType("VkResult") int InvalidateMappedMemoryRanges(@CType("VkDevice") MemorySegment device, @CType("uint32_t") int memoryRangeCount, @CType("const VkMappedMemoryRange *") MemorySegment pMemoryRanges) {
        if (Unmarshal.isNullPointer(handles.PFN_vkInvalidateMappedMemoryRanges)) throw new SymbolNotFoundError("Symbol not found: vkInvalidateMappedMemoryRanges");
        try { return (int) Handles.MH_vkInvalidateMappedMemoryRanges.invokeExact(handles.PFN_vkInvalidateMappedMemoryRanges, device, memoryRangeCount, pMemoryRanges); }
        catch (Throwable e) { throw new RuntimeException("error in vkInvalidateMappedMemoryRanges", e); }
    }

    public void GetDeviceMemoryCommitment(@CType("VkDevice") MemorySegment device, @CType("VkDeviceMemory") MemorySegment memory, @CType("VkDeviceSize *") MemorySegment pCommittedMemoryInBytes) {
        if (Unmarshal.isNullPointer(handles.PFN_vkGetDeviceMemoryCommitment)) throw new SymbolNotFoundError("Symbol not found: vkGetDeviceMemoryCommitment");
        try { Handles.MH_vkGetDeviceMemoryCommitment.invokeExact(handles.PFN_vkGetDeviceMemoryCommitment, device, memory, pCommittedMemoryInBytes); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetDeviceMemoryCommitment", e); }
    }

    public @CType("VkResult") int BindBufferMemory(@CType("VkDevice") MemorySegment device, @CType("VkBuffer") MemorySegment buffer, @CType("VkDeviceMemory") MemorySegment memory, @CType("VkDeviceSize") long memoryOffset) {
        if (Unmarshal.isNullPointer(handles.PFN_vkBindBufferMemory)) throw new SymbolNotFoundError("Symbol not found: vkBindBufferMemory");
        try { return (int) Handles.MH_vkBindBufferMemory.invokeExact(handles.PFN_vkBindBufferMemory, device, buffer, memory, memoryOffset); }
        catch (Throwable e) { throw new RuntimeException("error in vkBindBufferMemory", e); }
    }

    public @CType("VkResult") int BindImageMemory(@CType("VkDevice") MemorySegment device, @CType("VkImage") MemorySegment image, @CType("VkDeviceMemory") MemorySegment memory, @CType("VkDeviceSize") long memoryOffset) {
        if (Unmarshal.isNullPointer(handles.PFN_vkBindImageMemory)) throw new SymbolNotFoundError("Symbol not found: vkBindImageMemory");
        try { return (int) Handles.MH_vkBindImageMemory.invokeExact(handles.PFN_vkBindImageMemory, device, image, memory, memoryOffset); }
        catch (Throwable e) { throw new RuntimeException("error in vkBindImageMemory", e); }
    }

    public void GetBufferMemoryRequirements(@CType("VkDevice") MemorySegment device, @CType("VkBuffer") MemorySegment buffer, @CType("VkMemoryRequirements *") MemorySegment pMemoryRequirements) {
        if (Unmarshal.isNullPointer(handles.PFN_vkGetBufferMemoryRequirements)) throw new SymbolNotFoundError("Symbol not found: vkGetBufferMemoryRequirements");
        try { Handles.MH_vkGetBufferMemoryRequirements.invokeExact(handles.PFN_vkGetBufferMemoryRequirements, device, buffer, pMemoryRequirements); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetBufferMemoryRequirements", e); }
    }

    public void GetImageMemoryRequirements(@CType("VkDevice") MemorySegment device, @CType("VkImage") MemorySegment image, @CType("VkMemoryRequirements *") MemorySegment pMemoryRequirements) {
        if (Unmarshal.isNullPointer(handles.PFN_vkGetImageMemoryRequirements)) throw new SymbolNotFoundError("Symbol not found: vkGetImageMemoryRequirements");
        try { Handles.MH_vkGetImageMemoryRequirements.invokeExact(handles.PFN_vkGetImageMemoryRequirements, device, image, pMemoryRequirements); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetImageMemoryRequirements", e); }
    }

    public void GetImageSparseMemoryRequirements(@CType("VkDevice") MemorySegment device, @CType("VkImage") MemorySegment image, @CType("uint32_t *") MemorySegment pSparseMemoryRequirementCount, @CType("VkSparseImageMemoryRequirements *") MemorySegment pSparseMemoryRequirements) {
        if (Unmarshal.isNullPointer(handles.PFN_vkGetImageSparseMemoryRequirements)) throw new SymbolNotFoundError("Symbol not found: vkGetImageSparseMemoryRequirements");
        try { Handles.MH_vkGetImageSparseMemoryRequirements.invokeExact(handles.PFN_vkGetImageSparseMemoryRequirements, device, image, pSparseMemoryRequirementCount, pSparseMemoryRequirements); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetImageSparseMemoryRequirements", e); }
    }

    public void GetPhysicalDeviceSparseImageFormatProperties(@CType("VkPhysicalDevice") MemorySegment physicalDevice, @CType("VkFormat") int format, @CType("VkImageType") int type, @CType("VkSampleCountFlagBits") int samples, @CType("VkImageUsageFlags") int usage, @CType("VkImageTiling") int tiling, @CType("uint32_t *") MemorySegment pPropertyCount, @CType("VkSparseImageFormatProperties *") MemorySegment pProperties) {
        if (Unmarshal.isNullPointer(handles.PFN_vkGetPhysicalDeviceSparseImageFormatProperties)) throw new SymbolNotFoundError("Symbol not found: vkGetPhysicalDeviceSparseImageFormatProperties");
        try { Handles.MH_vkGetPhysicalDeviceSparseImageFormatProperties.invokeExact(handles.PFN_vkGetPhysicalDeviceSparseImageFormatProperties, physicalDevice, format, type, samples, usage, tiling, pPropertyCount, pProperties); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetPhysicalDeviceSparseImageFormatProperties", e); }
    }

    public @CType("VkResult") int QueueBindSparse(@CType("VkQueue") MemorySegment queue, @CType("uint32_t") int bindInfoCount, @CType("const VkBindSparseInfo *") MemorySegment pBindInfo, @CType("VkFence") MemorySegment fence) {
        if (Unmarshal.isNullPointer(handles.PFN_vkQueueBindSparse)) throw new SymbolNotFoundError("Symbol not found: vkQueueBindSparse");
        try { return (int) Handles.MH_vkQueueBindSparse.invokeExact(handles.PFN_vkQueueBindSparse, queue, bindInfoCount, pBindInfo, fence); }
        catch (Throwable e) { throw new RuntimeException("error in vkQueueBindSparse", e); }
    }

    public @CType("VkResult") int CreateFence(@CType("VkDevice") MemorySegment device, @CType("const VkFenceCreateInfo *") MemorySegment pCreateInfo, @CType("const VkAllocationCallbacks *") MemorySegment pAllocator, @CType("VkFence *") MemorySegment pFence) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCreateFence)) throw new SymbolNotFoundError("Symbol not found: vkCreateFence");
        try { return (int) Handles.MH_vkCreateFence.invokeExact(handles.PFN_vkCreateFence, device, pCreateInfo, pAllocator, pFence); }
        catch (Throwable e) { throw new RuntimeException("error in vkCreateFence", e); }
    }

    public void DestroyFence(@CType("VkDevice") MemorySegment device, @CType("VkFence") MemorySegment fence, @CType("const VkAllocationCallbacks *") MemorySegment pAllocator) {
        if (Unmarshal.isNullPointer(handles.PFN_vkDestroyFence)) throw new SymbolNotFoundError("Symbol not found: vkDestroyFence");
        try { Handles.MH_vkDestroyFence.invokeExact(handles.PFN_vkDestroyFence, device, fence, pAllocator); }
        catch (Throwable e) { throw new RuntimeException("error in vkDestroyFence", e); }
    }

    public @CType("VkResult") int ResetFences(@CType("VkDevice") MemorySegment device, @CType("uint32_t") int fenceCount, @CType("const VkFence *") MemorySegment pFences) {
        if (Unmarshal.isNullPointer(handles.PFN_vkResetFences)) throw new SymbolNotFoundError("Symbol not found: vkResetFences");
        try { return (int) Handles.MH_vkResetFences.invokeExact(handles.PFN_vkResetFences, device, fenceCount, pFences); }
        catch (Throwable e) { throw new RuntimeException("error in vkResetFences", e); }
    }

    public @CType("VkResult") int GetFenceStatus(@CType("VkDevice") MemorySegment device, @CType("VkFence") MemorySegment fence) {
        if (Unmarshal.isNullPointer(handles.PFN_vkGetFenceStatus)) throw new SymbolNotFoundError("Symbol not found: vkGetFenceStatus");
        try { return (int) Handles.MH_vkGetFenceStatus.invokeExact(handles.PFN_vkGetFenceStatus, device, fence); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetFenceStatus", e); }
    }

    public @CType("VkResult") int WaitForFences(@CType("VkDevice") MemorySegment device, @CType("uint32_t") int fenceCount, @CType("const VkFence *") MemorySegment pFences, @CType("VkBool32") int waitAll, @CType("uint64_t") long timeout) {
        if (Unmarshal.isNullPointer(handles.PFN_vkWaitForFences)) throw new SymbolNotFoundError("Symbol not found: vkWaitForFences");
        try { return (int) Handles.MH_vkWaitForFences.invokeExact(handles.PFN_vkWaitForFences, device, fenceCount, pFences, waitAll, timeout); }
        catch (Throwable e) { throw new RuntimeException("error in vkWaitForFences", e); }
    }

    public @CType("VkResult") int CreateSemaphore(@CType("VkDevice") MemorySegment device, @CType("const VkSemaphoreCreateInfo *") MemorySegment pCreateInfo, @CType("const VkAllocationCallbacks *") MemorySegment pAllocator, @CType("VkSemaphore *") MemorySegment pSemaphore) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCreateSemaphore)) throw new SymbolNotFoundError("Symbol not found: vkCreateSemaphore");
        try { return (int) Handles.MH_vkCreateSemaphore.invokeExact(handles.PFN_vkCreateSemaphore, device, pCreateInfo, pAllocator, pSemaphore); }
        catch (Throwable e) { throw new RuntimeException("error in vkCreateSemaphore", e); }
    }

    public void DestroySemaphore(@CType("VkDevice") MemorySegment device, @CType("VkSemaphore") MemorySegment semaphore, @CType("const VkAllocationCallbacks *") MemorySegment pAllocator) {
        if (Unmarshal.isNullPointer(handles.PFN_vkDestroySemaphore)) throw new SymbolNotFoundError("Symbol not found: vkDestroySemaphore");
        try { Handles.MH_vkDestroySemaphore.invokeExact(handles.PFN_vkDestroySemaphore, device, semaphore, pAllocator); }
        catch (Throwable e) { throw new RuntimeException("error in vkDestroySemaphore", e); }
    }

    public @CType("VkResult") int CreateEvent(@CType("VkDevice") MemorySegment device, @CType("const VkEventCreateInfo *") MemorySegment pCreateInfo, @CType("const VkAllocationCallbacks *") MemorySegment pAllocator, @CType("VkEvent *") MemorySegment pEvent) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCreateEvent)) throw new SymbolNotFoundError("Symbol not found: vkCreateEvent");
        try { return (int) Handles.MH_vkCreateEvent.invokeExact(handles.PFN_vkCreateEvent, device, pCreateInfo, pAllocator, pEvent); }
        catch (Throwable e) { throw new RuntimeException("error in vkCreateEvent", e); }
    }

    public void DestroyEvent(@CType("VkDevice") MemorySegment device, @CType("VkEvent") MemorySegment event, @CType("const VkAllocationCallbacks *") MemorySegment pAllocator) {
        if (Unmarshal.isNullPointer(handles.PFN_vkDestroyEvent)) throw new SymbolNotFoundError("Symbol not found: vkDestroyEvent");
        try { Handles.MH_vkDestroyEvent.invokeExact(handles.PFN_vkDestroyEvent, device, event, pAllocator); }
        catch (Throwable e) { throw new RuntimeException("error in vkDestroyEvent", e); }
    }

    public @CType("VkResult") int GetEventStatus(@CType("VkDevice") MemorySegment device, @CType("VkEvent") MemorySegment event) {
        if (Unmarshal.isNullPointer(handles.PFN_vkGetEventStatus)) throw new SymbolNotFoundError("Symbol not found: vkGetEventStatus");
        try { return (int) Handles.MH_vkGetEventStatus.invokeExact(handles.PFN_vkGetEventStatus, device, event); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetEventStatus", e); }
    }

    public @CType("VkResult") int SetEvent(@CType("VkDevice") MemorySegment device, @CType("VkEvent") MemorySegment event) {
        if (Unmarshal.isNullPointer(handles.PFN_vkSetEvent)) throw new SymbolNotFoundError("Symbol not found: vkSetEvent");
        try { return (int) Handles.MH_vkSetEvent.invokeExact(handles.PFN_vkSetEvent, device, event); }
        catch (Throwable e) { throw new RuntimeException("error in vkSetEvent", e); }
    }

    public @CType("VkResult") int ResetEvent(@CType("VkDevice") MemorySegment device, @CType("VkEvent") MemorySegment event) {
        if (Unmarshal.isNullPointer(handles.PFN_vkResetEvent)) throw new SymbolNotFoundError("Symbol not found: vkResetEvent");
        try { return (int) Handles.MH_vkResetEvent.invokeExact(handles.PFN_vkResetEvent, device, event); }
        catch (Throwable e) { throw new RuntimeException("error in vkResetEvent", e); }
    }

    public @CType("VkResult") int CreateQueryPool(@CType("VkDevice") MemorySegment device, @CType("const VkQueryPoolCreateInfo *") MemorySegment pCreateInfo, @CType("const VkAllocationCallbacks *") MemorySegment pAllocator, @CType("VkQueryPool *") MemorySegment pQueryPool) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCreateQueryPool)) throw new SymbolNotFoundError("Symbol not found: vkCreateQueryPool");
        try { return (int) Handles.MH_vkCreateQueryPool.invokeExact(handles.PFN_vkCreateQueryPool, device, pCreateInfo, pAllocator, pQueryPool); }
        catch (Throwable e) { throw new RuntimeException("error in vkCreateQueryPool", e); }
    }

    public void DestroyQueryPool(@CType("VkDevice") MemorySegment device, @CType("VkQueryPool") MemorySegment queryPool, @CType("const VkAllocationCallbacks *") MemorySegment pAllocator) {
        if (Unmarshal.isNullPointer(handles.PFN_vkDestroyQueryPool)) throw new SymbolNotFoundError("Symbol not found: vkDestroyQueryPool");
        try { Handles.MH_vkDestroyQueryPool.invokeExact(handles.PFN_vkDestroyQueryPool, device, queryPool, pAllocator); }
        catch (Throwable e) { throw new RuntimeException("error in vkDestroyQueryPool", e); }
    }

    public @CType("VkResult") int GetQueryPoolResults(@CType("VkDevice") MemorySegment device, @CType("VkQueryPool") MemorySegment queryPool, @CType("uint32_t") int firstQuery, @CType("uint32_t") int queryCount, @CType("size_t") long dataSize, @CType("void *") MemorySegment pData, @CType("VkDeviceSize") long stride, @CType("VkQueryResultFlags") int flags) {
        if (Unmarshal.isNullPointer(handles.PFN_vkGetQueryPoolResults)) throw new SymbolNotFoundError("Symbol not found: vkGetQueryPoolResults");
        try { return (int) Handles.MH_vkGetQueryPoolResults.invokeExact(handles.PFN_vkGetQueryPoolResults, device, queryPool, firstQuery, queryCount, dataSize, pData, stride, flags); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetQueryPoolResults", e); }
    }

    public @CType("VkResult") int CreateBuffer(@CType("VkDevice") MemorySegment device, @CType("const VkBufferCreateInfo *") MemorySegment pCreateInfo, @CType("const VkAllocationCallbacks *") MemorySegment pAllocator, @CType("VkBuffer *") MemorySegment pBuffer) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCreateBuffer)) throw new SymbolNotFoundError("Symbol not found: vkCreateBuffer");
        try { return (int) Handles.MH_vkCreateBuffer.invokeExact(handles.PFN_vkCreateBuffer, device, pCreateInfo, pAllocator, pBuffer); }
        catch (Throwable e) { throw new RuntimeException("error in vkCreateBuffer", e); }
    }

    public void DestroyBuffer(@CType("VkDevice") MemorySegment device, @CType("VkBuffer") MemorySegment buffer, @CType("const VkAllocationCallbacks *") MemorySegment pAllocator) {
        if (Unmarshal.isNullPointer(handles.PFN_vkDestroyBuffer)) throw new SymbolNotFoundError("Symbol not found: vkDestroyBuffer");
        try { Handles.MH_vkDestroyBuffer.invokeExact(handles.PFN_vkDestroyBuffer, device, buffer, pAllocator); }
        catch (Throwable e) { throw new RuntimeException("error in vkDestroyBuffer", e); }
    }

    public @CType("VkResult") int CreateBufferView(@CType("VkDevice") MemorySegment device, @CType("const VkBufferViewCreateInfo *") MemorySegment pCreateInfo, @CType("const VkAllocationCallbacks *") MemorySegment pAllocator, @CType("VkBufferView *") MemorySegment pView) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCreateBufferView)) throw new SymbolNotFoundError("Symbol not found: vkCreateBufferView");
        try { return (int) Handles.MH_vkCreateBufferView.invokeExact(handles.PFN_vkCreateBufferView, device, pCreateInfo, pAllocator, pView); }
        catch (Throwable e) { throw new RuntimeException("error in vkCreateBufferView", e); }
    }

    public void DestroyBufferView(@CType("VkDevice") MemorySegment device, @CType("VkBufferView") MemorySegment bufferView, @CType("const VkAllocationCallbacks *") MemorySegment pAllocator) {
        if (Unmarshal.isNullPointer(handles.PFN_vkDestroyBufferView)) throw new SymbolNotFoundError("Symbol not found: vkDestroyBufferView");
        try { Handles.MH_vkDestroyBufferView.invokeExact(handles.PFN_vkDestroyBufferView, device, bufferView, pAllocator); }
        catch (Throwable e) { throw new RuntimeException("error in vkDestroyBufferView", e); }
    }

    public @CType("VkResult") int CreateImage(@CType("VkDevice") MemorySegment device, @CType("const VkImageCreateInfo *") MemorySegment pCreateInfo, @CType("const VkAllocationCallbacks *") MemorySegment pAllocator, @CType("VkImage *") MemorySegment pImage) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCreateImage)) throw new SymbolNotFoundError("Symbol not found: vkCreateImage");
        try { return (int) Handles.MH_vkCreateImage.invokeExact(handles.PFN_vkCreateImage, device, pCreateInfo, pAllocator, pImage); }
        catch (Throwable e) { throw new RuntimeException("error in vkCreateImage", e); }
    }

    public void DestroyImage(@CType("VkDevice") MemorySegment device, @CType("VkImage") MemorySegment image, @CType("const VkAllocationCallbacks *") MemorySegment pAllocator) {
        if (Unmarshal.isNullPointer(handles.PFN_vkDestroyImage)) throw new SymbolNotFoundError("Symbol not found: vkDestroyImage");
        try { Handles.MH_vkDestroyImage.invokeExact(handles.PFN_vkDestroyImage, device, image, pAllocator); }
        catch (Throwable e) { throw new RuntimeException("error in vkDestroyImage", e); }
    }

    public void GetImageSubresourceLayout(@CType("VkDevice") MemorySegment device, @CType("VkImage") MemorySegment image, @CType("const VkImageSubresource *") MemorySegment pSubresource, @CType("VkSubresourceLayout *") MemorySegment pLayout) {
        if (Unmarshal.isNullPointer(handles.PFN_vkGetImageSubresourceLayout)) throw new SymbolNotFoundError("Symbol not found: vkGetImageSubresourceLayout");
        try { Handles.MH_vkGetImageSubresourceLayout.invokeExact(handles.PFN_vkGetImageSubresourceLayout, device, image, pSubresource, pLayout); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetImageSubresourceLayout", e); }
    }

    public @CType("VkResult") int CreateImageView(@CType("VkDevice") MemorySegment device, @CType("const VkImageViewCreateInfo *") MemorySegment pCreateInfo, @CType("const VkAllocationCallbacks *") MemorySegment pAllocator, @CType("VkImageView *") MemorySegment pView) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCreateImageView)) throw new SymbolNotFoundError("Symbol not found: vkCreateImageView");
        try { return (int) Handles.MH_vkCreateImageView.invokeExact(handles.PFN_vkCreateImageView, device, pCreateInfo, pAllocator, pView); }
        catch (Throwable e) { throw new RuntimeException("error in vkCreateImageView", e); }
    }

    public void DestroyImageView(@CType("VkDevice") MemorySegment device, @CType("VkImageView") MemorySegment imageView, @CType("const VkAllocationCallbacks *") MemorySegment pAllocator) {
        if (Unmarshal.isNullPointer(handles.PFN_vkDestroyImageView)) throw new SymbolNotFoundError("Symbol not found: vkDestroyImageView");
        try { Handles.MH_vkDestroyImageView.invokeExact(handles.PFN_vkDestroyImageView, device, imageView, pAllocator); }
        catch (Throwable e) { throw new RuntimeException("error in vkDestroyImageView", e); }
    }

    public @CType("VkResult") int CreateShaderModule(@CType("VkDevice") MemorySegment device, @CType("const VkShaderModuleCreateInfo *") MemorySegment pCreateInfo, @CType("const VkAllocationCallbacks *") MemorySegment pAllocator, @CType("VkShaderModule *") MemorySegment pShaderModule) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCreateShaderModule)) throw new SymbolNotFoundError("Symbol not found: vkCreateShaderModule");
        try { return (int) Handles.MH_vkCreateShaderModule.invokeExact(handles.PFN_vkCreateShaderModule, device, pCreateInfo, pAllocator, pShaderModule); }
        catch (Throwable e) { throw new RuntimeException("error in vkCreateShaderModule", e); }
    }

    public void DestroyShaderModule(@CType("VkDevice") MemorySegment device, @CType("VkShaderModule") MemorySegment shaderModule, @CType("const VkAllocationCallbacks *") MemorySegment pAllocator) {
        if (Unmarshal.isNullPointer(handles.PFN_vkDestroyShaderModule)) throw new SymbolNotFoundError("Symbol not found: vkDestroyShaderModule");
        try { Handles.MH_vkDestroyShaderModule.invokeExact(handles.PFN_vkDestroyShaderModule, device, shaderModule, pAllocator); }
        catch (Throwable e) { throw new RuntimeException("error in vkDestroyShaderModule", e); }
    }

    public @CType("VkResult") int CreatePipelineCache(@CType("VkDevice") MemorySegment device, @CType("const VkPipelineCacheCreateInfo *") MemorySegment pCreateInfo, @CType("const VkAllocationCallbacks *") MemorySegment pAllocator, @CType("VkPipelineCache *") MemorySegment pPipelineCache) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCreatePipelineCache)) throw new SymbolNotFoundError("Symbol not found: vkCreatePipelineCache");
        try { return (int) Handles.MH_vkCreatePipelineCache.invokeExact(handles.PFN_vkCreatePipelineCache, device, pCreateInfo, pAllocator, pPipelineCache); }
        catch (Throwable e) { throw new RuntimeException("error in vkCreatePipelineCache", e); }
    }

    public void DestroyPipelineCache(@CType("VkDevice") MemorySegment device, @CType("VkPipelineCache") MemorySegment pipelineCache, @CType("const VkAllocationCallbacks *") MemorySegment pAllocator) {
        if (Unmarshal.isNullPointer(handles.PFN_vkDestroyPipelineCache)) throw new SymbolNotFoundError("Symbol not found: vkDestroyPipelineCache");
        try { Handles.MH_vkDestroyPipelineCache.invokeExact(handles.PFN_vkDestroyPipelineCache, device, pipelineCache, pAllocator); }
        catch (Throwable e) { throw new RuntimeException("error in vkDestroyPipelineCache", e); }
    }

    public @CType("VkResult") int GetPipelineCacheData(@CType("VkDevice") MemorySegment device, @CType("VkPipelineCache") MemorySegment pipelineCache, @CType("size_t *") MemorySegment pDataSize, @CType("void *") MemorySegment pData) {
        if (Unmarshal.isNullPointer(handles.PFN_vkGetPipelineCacheData)) throw new SymbolNotFoundError("Symbol not found: vkGetPipelineCacheData");
        try { return (int) Handles.MH_vkGetPipelineCacheData.invokeExact(handles.PFN_vkGetPipelineCacheData, device, pipelineCache, pDataSize, pData); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetPipelineCacheData", e); }
    }

    public @CType("VkResult") int MergePipelineCaches(@CType("VkDevice") MemorySegment device, @CType("VkPipelineCache") MemorySegment dstCache, @CType("uint32_t") int srcCacheCount, @CType("const VkPipelineCache *") MemorySegment pSrcCaches) {
        if (Unmarshal.isNullPointer(handles.PFN_vkMergePipelineCaches)) throw new SymbolNotFoundError("Symbol not found: vkMergePipelineCaches");
        try { return (int) Handles.MH_vkMergePipelineCaches.invokeExact(handles.PFN_vkMergePipelineCaches, device, dstCache, srcCacheCount, pSrcCaches); }
        catch (Throwable e) { throw new RuntimeException("error in vkMergePipelineCaches", e); }
    }

    public @CType("VkResult") int CreateGraphicsPipelines(@CType("VkDevice") MemorySegment device, @CType("VkPipelineCache") MemorySegment pipelineCache, @CType("uint32_t") int createInfoCount, @CType("const VkGraphicsPipelineCreateInfo *") MemorySegment pCreateInfos, @CType("const VkAllocationCallbacks *") MemorySegment pAllocator, @CType("VkPipeline *") MemorySegment pPipelines) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCreateGraphicsPipelines)) throw new SymbolNotFoundError("Symbol not found: vkCreateGraphicsPipelines");
        try { return (int) Handles.MH_vkCreateGraphicsPipelines.invokeExact(handles.PFN_vkCreateGraphicsPipelines, device, pipelineCache, createInfoCount, pCreateInfos, pAllocator, pPipelines); }
        catch (Throwable e) { throw new RuntimeException("error in vkCreateGraphicsPipelines", e); }
    }

    public @CType("VkResult") int CreateComputePipelines(@CType("VkDevice") MemorySegment device, @CType("VkPipelineCache") MemorySegment pipelineCache, @CType("uint32_t") int createInfoCount, @CType("const VkComputePipelineCreateInfo *") MemorySegment pCreateInfos, @CType("const VkAllocationCallbacks *") MemorySegment pAllocator, @CType("VkPipeline *") MemorySegment pPipelines) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCreateComputePipelines)) throw new SymbolNotFoundError("Symbol not found: vkCreateComputePipelines");
        try { return (int) Handles.MH_vkCreateComputePipelines.invokeExact(handles.PFN_vkCreateComputePipelines, device, pipelineCache, createInfoCount, pCreateInfos, pAllocator, pPipelines); }
        catch (Throwable e) { throw new RuntimeException("error in vkCreateComputePipelines", e); }
    }

    public void DestroyPipeline(@CType("VkDevice") MemorySegment device, @CType("VkPipeline") MemorySegment pipeline, @CType("const VkAllocationCallbacks *") MemorySegment pAllocator) {
        if (Unmarshal.isNullPointer(handles.PFN_vkDestroyPipeline)) throw new SymbolNotFoundError("Symbol not found: vkDestroyPipeline");
        try { Handles.MH_vkDestroyPipeline.invokeExact(handles.PFN_vkDestroyPipeline, device, pipeline, pAllocator); }
        catch (Throwable e) { throw new RuntimeException("error in vkDestroyPipeline", e); }
    }

    public @CType("VkResult") int CreatePipelineLayout(@CType("VkDevice") MemorySegment device, @CType("const VkPipelineLayoutCreateInfo *") MemorySegment pCreateInfo, @CType("const VkAllocationCallbacks *") MemorySegment pAllocator, @CType("VkPipelineLayout *") MemorySegment pPipelineLayout) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCreatePipelineLayout)) throw new SymbolNotFoundError("Symbol not found: vkCreatePipelineLayout");
        try { return (int) Handles.MH_vkCreatePipelineLayout.invokeExact(handles.PFN_vkCreatePipelineLayout, device, pCreateInfo, pAllocator, pPipelineLayout); }
        catch (Throwable e) { throw new RuntimeException("error in vkCreatePipelineLayout", e); }
    }

    public void DestroyPipelineLayout(@CType("VkDevice") MemorySegment device, @CType("VkPipelineLayout") MemorySegment pipelineLayout, @CType("const VkAllocationCallbacks *") MemorySegment pAllocator) {
        if (Unmarshal.isNullPointer(handles.PFN_vkDestroyPipelineLayout)) throw new SymbolNotFoundError("Symbol not found: vkDestroyPipelineLayout");
        try { Handles.MH_vkDestroyPipelineLayout.invokeExact(handles.PFN_vkDestroyPipelineLayout, device, pipelineLayout, pAllocator); }
        catch (Throwable e) { throw new RuntimeException("error in vkDestroyPipelineLayout", e); }
    }

    public @CType("VkResult") int CreateSampler(@CType("VkDevice") MemorySegment device, @CType("const VkSamplerCreateInfo *") MemorySegment pCreateInfo, @CType("const VkAllocationCallbacks *") MemorySegment pAllocator, @CType("VkSampler *") MemorySegment pSampler) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCreateSampler)) throw new SymbolNotFoundError("Symbol not found: vkCreateSampler");
        try { return (int) Handles.MH_vkCreateSampler.invokeExact(handles.PFN_vkCreateSampler, device, pCreateInfo, pAllocator, pSampler); }
        catch (Throwable e) { throw new RuntimeException("error in vkCreateSampler", e); }
    }

    public void DestroySampler(@CType("VkDevice") MemorySegment device, @CType("VkSampler") MemorySegment sampler, @CType("const VkAllocationCallbacks *") MemorySegment pAllocator) {
        if (Unmarshal.isNullPointer(handles.PFN_vkDestroySampler)) throw new SymbolNotFoundError("Symbol not found: vkDestroySampler");
        try { Handles.MH_vkDestroySampler.invokeExact(handles.PFN_vkDestroySampler, device, sampler, pAllocator); }
        catch (Throwable e) { throw new RuntimeException("error in vkDestroySampler", e); }
    }

    public @CType("VkResult") int CreateDescriptorSetLayout(@CType("VkDevice") MemorySegment device, @CType("const VkDescriptorSetLayoutCreateInfo *") MemorySegment pCreateInfo, @CType("const VkAllocationCallbacks *") MemorySegment pAllocator, @CType("VkDescriptorSetLayout *") MemorySegment pSetLayout) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCreateDescriptorSetLayout)) throw new SymbolNotFoundError("Symbol not found: vkCreateDescriptorSetLayout");
        try { return (int) Handles.MH_vkCreateDescriptorSetLayout.invokeExact(handles.PFN_vkCreateDescriptorSetLayout, device, pCreateInfo, pAllocator, pSetLayout); }
        catch (Throwable e) { throw new RuntimeException("error in vkCreateDescriptorSetLayout", e); }
    }

    public void DestroyDescriptorSetLayout(@CType("VkDevice") MemorySegment device, @CType("VkDescriptorSetLayout") MemorySegment descriptorSetLayout, @CType("const VkAllocationCallbacks *") MemorySegment pAllocator) {
        if (Unmarshal.isNullPointer(handles.PFN_vkDestroyDescriptorSetLayout)) throw new SymbolNotFoundError("Symbol not found: vkDestroyDescriptorSetLayout");
        try { Handles.MH_vkDestroyDescriptorSetLayout.invokeExact(handles.PFN_vkDestroyDescriptorSetLayout, device, descriptorSetLayout, pAllocator); }
        catch (Throwable e) { throw new RuntimeException("error in vkDestroyDescriptorSetLayout", e); }
    }

    public @CType("VkResult") int CreateDescriptorPool(@CType("VkDevice") MemorySegment device, @CType("const VkDescriptorPoolCreateInfo *") MemorySegment pCreateInfo, @CType("const VkAllocationCallbacks *") MemorySegment pAllocator, @CType("VkDescriptorPool *") MemorySegment pDescriptorPool) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCreateDescriptorPool)) throw new SymbolNotFoundError("Symbol not found: vkCreateDescriptorPool");
        try { return (int) Handles.MH_vkCreateDescriptorPool.invokeExact(handles.PFN_vkCreateDescriptorPool, device, pCreateInfo, pAllocator, pDescriptorPool); }
        catch (Throwable e) { throw new RuntimeException("error in vkCreateDescriptorPool", e); }
    }

    public void DestroyDescriptorPool(@CType("VkDevice") MemorySegment device, @CType("VkDescriptorPool") MemorySegment descriptorPool, @CType("const VkAllocationCallbacks *") MemorySegment pAllocator) {
        if (Unmarshal.isNullPointer(handles.PFN_vkDestroyDescriptorPool)) throw new SymbolNotFoundError("Symbol not found: vkDestroyDescriptorPool");
        try { Handles.MH_vkDestroyDescriptorPool.invokeExact(handles.PFN_vkDestroyDescriptorPool, device, descriptorPool, pAllocator); }
        catch (Throwable e) { throw new RuntimeException("error in vkDestroyDescriptorPool", e); }
    }

    public @CType("VkResult") int ResetDescriptorPool(@CType("VkDevice") MemorySegment device, @CType("VkDescriptorPool") MemorySegment descriptorPool, @CType("VkDescriptorPoolResetFlags") int flags) {
        if (Unmarshal.isNullPointer(handles.PFN_vkResetDescriptorPool)) throw new SymbolNotFoundError("Symbol not found: vkResetDescriptorPool");
        try { return (int) Handles.MH_vkResetDescriptorPool.invokeExact(handles.PFN_vkResetDescriptorPool, device, descriptorPool, flags); }
        catch (Throwable e) { throw new RuntimeException("error in vkResetDescriptorPool", e); }
    }

    public @CType("VkResult") int AllocateDescriptorSets(@CType("VkDevice") MemorySegment device, @CType("const VkDescriptorSetAllocateInfo *") MemorySegment pAllocateInfo, @CType("VkDescriptorSet *") MemorySegment pDescriptorSets) {
        if (Unmarshal.isNullPointer(handles.PFN_vkAllocateDescriptorSets)) throw new SymbolNotFoundError("Symbol not found: vkAllocateDescriptorSets");
        try { return (int) Handles.MH_vkAllocateDescriptorSets.invokeExact(handles.PFN_vkAllocateDescriptorSets, device, pAllocateInfo, pDescriptorSets); }
        catch (Throwable e) { throw new RuntimeException("error in vkAllocateDescriptorSets", e); }
    }

    public @CType("VkResult") int FreeDescriptorSets(@CType("VkDevice") MemorySegment device, @CType("VkDescriptorPool") MemorySegment descriptorPool, @CType("uint32_t") int descriptorSetCount, @CType("const VkDescriptorSet *") MemorySegment pDescriptorSets) {
        if (Unmarshal.isNullPointer(handles.PFN_vkFreeDescriptorSets)) throw new SymbolNotFoundError("Symbol not found: vkFreeDescriptorSets");
        try { return (int) Handles.MH_vkFreeDescriptorSets.invokeExact(handles.PFN_vkFreeDescriptorSets, device, descriptorPool, descriptorSetCount, pDescriptorSets); }
        catch (Throwable e) { throw new RuntimeException("error in vkFreeDescriptorSets", e); }
    }

    public void UpdateDescriptorSets(@CType("VkDevice") MemorySegment device, @CType("uint32_t") int descriptorWriteCount, @CType("const VkWriteDescriptorSet *") MemorySegment pDescriptorWrites, @CType("uint32_t") int descriptorCopyCount, @CType("const VkCopyDescriptorSet *") MemorySegment pDescriptorCopies) {
        if (Unmarshal.isNullPointer(handles.PFN_vkUpdateDescriptorSets)) throw new SymbolNotFoundError("Symbol not found: vkUpdateDescriptorSets");
        try { Handles.MH_vkUpdateDescriptorSets.invokeExact(handles.PFN_vkUpdateDescriptorSets, device, descriptorWriteCount, pDescriptorWrites, descriptorCopyCount, pDescriptorCopies); }
        catch (Throwable e) { throw new RuntimeException("error in vkUpdateDescriptorSets", e); }
    }

    public @CType("VkResult") int CreateFramebuffer(@CType("VkDevice") MemorySegment device, @CType("const VkFramebufferCreateInfo *") MemorySegment pCreateInfo, @CType("const VkAllocationCallbacks *") MemorySegment pAllocator, @CType("VkFramebuffer *") MemorySegment pFramebuffer) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCreateFramebuffer)) throw new SymbolNotFoundError("Symbol not found: vkCreateFramebuffer");
        try { return (int) Handles.MH_vkCreateFramebuffer.invokeExact(handles.PFN_vkCreateFramebuffer, device, pCreateInfo, pAllocator, pFramebuffer); }
        catch (Throwable e) { throw new RuntimeException("error in vkCreateFramebuffer", e); }
    }

    public void DestroyFramebuffer(@CType("VkDevice") MemorySegment device, @CType("VkFramebuffer") MemorySegment framebuffer, @CType("const VkAllocationCallbacks *") MemorySegment pAllocator) {
        if (Unmarshal.isNullPointer(handles.PFN_vkDestroyFramebuffer)) throw new SymbolNotFoundError("Symbol not found: vkDestroyFramebuffer");
        try { Handles.MH_vkDestroyFramebuffer.invokeExact(handles.PFN_vkDestroyFramebuffer, device, framebuffer, pAllocator); }
        catch (Throwable e) { throw new RuntimeException("error in vkDestroyFramebuffer", e); }
    }

    public @CType("VkResult") int CreateRenderPass(@CType("VkDevice") MemorySegment device, @CType("const VkRenderPassCreateInfo *") MemorySegment pCreateInfo, @CType("const VkAllocationCallbacks *") MemorySegment pAllocator, @CType("VkRenderPass *") MemorySegment pRenderPass) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCreateRenderPass)) throw new SymbolNotFoundError("Symbol not found: vkCreateRenderPass");
        try { return (int) Handles.MH_vkCreateRenderPass.invokeExact(handles.PFN_vkCreateRenderPass, device, pCreateInfo, pAllocator, pRenderPass); }
        catch (Throwable e) { throw new RuntimeException("error in vkCreateRenderPass", e); }
    }

    public void DestroyRenderPass(@CType("VkDevice") MemorySegment device, @CType("VkRenderPass") MemorySegment renderPass, @CType("const VkAllocationCallbacks *") MemorySegment pAllocator) {
        if (Unmarshal.isNullPointer(handles.PFN_vkDestroyRenderPass)) throw new SymbolNotFoundError("Symbol not found: vkDestroyRenderPass");
        try { Handles.MH_vkDestroyRenderPass.invokeExact(handles.PFN_vkDestroyRenderPass, device, renderPass, pAllocator); }
        catch (Throwable e) { throw new RuntimeException("error in vkDestroyRenderPass", e); }
    }

    public void GetRenderAreaGranularity(@CType("VkDevice") MemorySegment device, @CType("VkRenderPass") MemorySegment renderPass, @CType("VkExtent2D *") MemorySegment pGranularity) {
        if (Unmarshal.isNullPointer(handles.PFN_vkGetRenderAreaGranularity)) throw new SymbolNotFoundError("Symbol not found: vkGetRenderAreaGranularity");
        try { Handles.MH_vkGetRenderAreaGranularity.invokeExact(handles.PFN_vkGetRenderAreaGranularity, device, renderPass, pGranularity); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetRenderAreaGranularity", e); }
    }

    public @CType("VkResult") int CreateCommandPool(@CType("VkDevice") MemorySegment device, @CType("const VkCommandPoolCreateInfo *") MemorySegment pCreateInfo, @CType("const VkAllocationCallbacks *") MemorySegment pAllocator, @CType("VkCommandPool *") MemorySegment pCommandPool) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCreateCommandPool)) throw new SymbolNotFoundError("Symbol not found: vkCreateCommandPool");
        try { return (int) Handles.MH_vkCreateCommandPool.invokeExact(handles.PFN_vkCreateCommandPool, device, pCreateInfo, pAllocator, pCommandPool); }
        catch (Throwable e) { throw new RuntimeException("error in vkCreateCommandPool", e); }
    }

    public void DestroyCommandPool(@CType("VkDevice") MemorySegment device, @CType("VkCommandPool") MemorySegment commandPool, @CType("const VkAllocationCallbacks *") MemorySegment pAllocator) {
        if (Unmarshal.isNullPointer(handles.PFN_vkDestroyCommandPool)) throw new SymbolNotFoundError("Symbol not found: vkDestroyCommandPool");
        try { Handles.MH_vkDestroyCommandPool.invokeExact(handles.PFN_vkDestroyCommandPool, device, commandPool, pAllocator); }
        catch (Throwable e) { throw new RuntimeException("error in vkDestroyCommandPool", e); }
    }

    public @CType("VkResult") int ResetCommandPool(@CType("VkDevice") MemorySegment device, @CType("VkCommandPool") MemorySegment commandPool, @CType("VkCommandPoolResetFlags") int flags) {
        if (Unmarshal.isNullPointer(handles.PFN_vkResetCommandPool)) throw new SymbolNotFoundError("Symbol not found: vkResetCommandPool");
        try { return (int) Handles.MH_vkResetCommandPool.invokeExact(handles.PFN_vkResetCommandPool, device, commandPool, flags); }
        catch (Throwable e) { throw new RuntimeException("error in vkResetCommandPool", e); }
    }

    public @CType("VkResult") int AllocateCommandBuffers(@CType("VkDevice") MemorySegment device, @CType("const VkCommandBufferAllocateInfo *") MemorySegment pAllocateInfo, @CType("VkCommandBuffer *") MemorySegment pCommandBuffers) {
        if (Unmarshal.isNullPointer(handles.PFN_vkAllocateCommandBuffers)) throw new SymbolNotFoundError("Symbol not found: vkAllocateCommandBuffers");
        try { return (int) Handles.MH_vkAllocateCommandBuffers.invokeExact(handles.PFN_vkAllocateCommandBuffers, device, pAllocateInfo, pCommandBuffers); }
        catch (Throwable e) { throw new RuntimeException("error in vkAllocateCommandBuffers", e); }
    }

    public void FreeCommandBuffers(@CType("VkDevice") MemorySegment device, @CType("VkCommandPool") MemorySegment commandPool, @CType("uint32_t") int commandBufferCount, @CType("const VkCommandBuffer *") MemorySegment pCommandBuffers) {
        if (Unmarshal.isNullPointer(handles.PFN_vkFreeCommandBuffers)) throw new SymbolNotFoundError("Symbol not found: vkFreeCommandBuffers");
        try { Handles.MH_vkFreeCommandBuffers.invokeExact(handles.PFN_vkFreeCommandBuffers, device, commandPool, commandBufferCount, pCommandBuffers); }
        catch (Throwable e) { throw new RuntimeException("error in vkFreeCommandBuffers", e); }
    }

    public @CType("VkResult") int BeginCommandBuffer(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("const VkCommandBufferBeginInfo *") MemorySegment pBeginInfo) {
        if (Unmarshal.isNullPointer(handles.PFN_vkBeginCommandBuffer)) throw new SymbolNotFoundError("Symbol not found: vkBeginCommandBuffer");
        try { return (int) Handles.MH_vkBeginCommandBuffer.invokeExact(handles.PFN_vkBeginCommandBuffer, commandBuffer, pBeginInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkBeginCommandBuffer", e); }
    }

    public @CType("VkResult") int EndCommandBuffer(@CType("VkCommandBuffer") MemorySegment commandBuffer) {
        if (Unmarshal.isNullPointer(handles.PFN_vkEndCommandBuffer)) throw new SymbolNotFoundError("Symbol not found: vkEndCommandBuffer");
        try { return (int) Handles.MH_vkEndCommandBuffer.invokeExact(handles.PFN_vkEndCommandBuffer, commandBuffer); }
        catch (Throwable e) { throw new RuntimeException("error in vkEndCommandBuffer", e); }
    }

    public @CType("VkResult") int ResetCommandBuffer(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("VkCommandBufferResetFlags") int flags) {
        if (Unmarshal.isNullPointer(handles.PFN_vkResetCommandBuffer)) throw new SymbolNotFoundError("Symbol not found: vkResetCommandBuffer");
        try { return (int) Handles.MH_vkResetCommandBuffer.invokeExact(handles.PFN_vkResetCommandBuffer, commandBuffer, flags); }
        catch (Throwable e) { throw new RuntimeException("error in vkResetCommandBuffer", e); }
    }

    public void CmdBindPipeline(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("VkPipelineBindPoint") int pipelineBindPoint, @CType("VkPipeline") MemorySegment pipeline) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCmdBindPipeline)) throw new SymbolNotFoundError("Symbol not found: vkCmdBindPipeline");
        try { Handles.MH_vkCmdBindPipeline.invokeExact(handles.PFN_vkCmdBindPipeline, commandBuffer, pipelineBindPoint, pipeline); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdBindPipeline", e); }
    }

    public void CmdSetViewport(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("uint32_t") int firstViewport, @CType("uint32_t") int viewportCount, @CType("const VkViewport *") MemorySegment pViewports) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCmdSetViewport)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetViewport");
        try { Handles.MH_vkCmdSetViewport.invokeExact(handles.PFN_vkCmdSetViewport, commandBuffer, firstViewport, viewportCount, pViewports); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetViewport", e); }
    }

    public void CmdSetScissor(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("uint32_t") int firstScissor, @CType("uint32_t") int scissorCount, @CType("const VkRect2D *") MemorySegment pScissors) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCmdSetScissor)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetScissor");
        try { Handles.MH_vkCmdSetScissor.invokeExact(handles.PFN_vkCmdSetScissor, commandBuffer, firstScissor, scissorCount, pScissors); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetScissor", e); }
    }

    public void CmdSetLineWidth(@CType("VkCommandBuffer") MemorySegment commandBuffer, float lineWidth) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCmdSetLineWidth)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetLineWidth");
        try { Handles.MH_vkCmdSetLineWidth.invokeExact(handles.PFN_vkCmdSetLineWidth, commandBuffer, lineWidth); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetLineWidth", e); }
    }

    public void CmdSetDepthBias(@CType("VkCommandBuffer") MemorySegment commandBuffer, float depthBiasConstantFactor, float depthBiasClamp, float depthBiasSlopeFactor) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCmdSetDepthBias)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetDepthBias");
        try { Handles.MH_vkCmdSetDepthBias.invokeExact(handles.PFN_vkCmdSetDepthBias, commandBuffer, depthBiasConstantFactor, depthBiasClamp, depthBiasSlopeFactor); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetDepthBias", e); }
    }

    public void CmdSetBlendConstants(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("const float [4]") float blendConstants) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCmdSetBlendConstants)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetBlendConstants");
        try { Handles.MH_vkCmdSetBlendConstants.invokeExact(handles.PFN_vkCmdSetBlendConstants, commandBuffer, blendConstants); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetBlendConstants", e); }
    }

    public void CmdSetDepthBounds(@CType("VkCommandBuffer") MemorySegment commandBuffer, float minDepthBounds, float maxDepthBounds) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCmdSetDepthBounds)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetDepthBounds");
        try { Handles.MH_vkCmdSetDepthBounds.invokeExact(handles.PFN_vkCmdSetDepthBounds, commandBuffer, minDepthBounds, maxDepthBounds); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetDepthBounds", e); }
    }

    public void CmdSetStencilCompareMask(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("VkStencilFaceFlags") int faceMask, @CType("uint32_t") int compareMask) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCmdSetStencilCompareMask)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetStencilCompareMask");
        try { Handles.MH_vkCmdSetStencilCompareMask.invokeExact(handles.PFN_vkCmdSetStencilCompareMask, commandBuffer, faceMask, compareMask); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetStencilCompareMask", e); }
    }

    public void CmdSetStencilWriteMask(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("VkStencilFaceFlags") int faceMask, @CType("uint32_t") int writeMask) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCmdSetStencilWriteMask)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetStencilWriteMask");
        try { Handles.MH_vkCmdSetStencilWriteMask.invokeExact(handles.PFN_vkCmdSetStencilWriteMask, commandBuffer, faceMask, writeMask); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetStencilWriteMask", e); }
    }

    public void CmdSetStencilReference(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("VkStencilFaceFlags") int faceMask, @CType("uint32_t") int reference) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCmdSetStencilReference)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetStencilReference");
        try { Handles.MH_vkCmdSetStencilReference.invokeExact(handles.PFN_vkCmdSetStencilReference, commandBuffer, faceMask, reference); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetStencilReference", e); }
    }

    public void CmdBindDescriptorSets(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("VkPipelineBindPoint") int pipelineBindPoint, @CType("VkPipelineLayout") MemorySegment layout, @CType("uint32_t") int firstSet, @CType("uint32_t") int descriptorSetCount, @CType("const VkDescriptorSet *") MemorySegment pDescriptorSets, @CType("uint32_t") int dynamicOffsetCount, @CType("const uint32_t *") MemorySegment pDynamicOffsets) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCmdBindDescriptorSets)) throw new SymbolNotFoundError("Symbol not found: vkCmdBindDescriptorSets");
        try { Handles.MH_vkCmdBindDescriptorSets.invokeExact(handles.PFN_vkCmdBindDescriptorSets, commandBuffer, pipelineBindPoint, layout, firstSet, descriptorSetCount, pDescriptorSets, dynamicOffsetCount, pDynamicOffsets); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdBindDescriptorSets", e); }
    }

    public void CmdBindIndexBuffer(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("VkBuffer") MemorySegment buffer, @CType("VkDeviceSize") long offset, @CType("VkIndexType") int indexType) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCmdBindIndexBuffer)) throw new SymbolNotFoundError("Symbol not found: vkCmdBindIndexBuffer");
        try { Handles.MH_vkCmdBindIndexBuffer.invokeExact(handles.PFN_vkCmdBindIndexBuffer, commandBuffer, buffer, offset, indexType); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdBindIndexBuffer", e); }
    }

    public void CmdBindVertexBuffers(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("uint32_t") int firstBinding, @CType("uint32_t") int bindingCount, @CType("const VkBuffer *") MemorySegment pBuffers, @CType("const VkDeviceSize *") MemorySegment pOffsets) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCmdBindVertexBuffers)) throw new SymbolNotFoundError("Symbol not found: vkCmdBindVertexBuffers");
        try { Handles.MH_vkCmdBindVertexBuffers.invokeExact(handles.PFN_vkCmdBindVertexBuffers, commandBuffer, firstBinding, bindingCount, pBuffers, pOffsets); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdBindVertexBuffers", e); }
    }

    public void CmdDraw(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("uint32_t") int vertexCount, @CType("uint32_t") int instanceCount, @CType("uint32_t") int firstVertex, @CType("uint32_t") int firstInstance) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCmdDraw)) throw new SymbolNotFoundError("Symbol not found: vkCmdDraw");
        try { Handles.MH_vkCmdDraw.invokeExact(handles.PFN_vkCmdDraw, commandBuffer, vertexCount, instanceCount, firstVertex, firstInstance); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdDraw", e); }
    }

    public void CmdDrawIndexed(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("uint32_t") int indexCount, @CType("uint32_t") int instanceCount, @CType("uint32_t") int firstIndex, @CType("int32_t") int vertexOffset, @CType("uint32_t") int firstInstance) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCmdDrawIndexed)) throw new SymbolNotFoundError("Symbol not found: vkCmdDrawIndexed");
        try { Handles.MH_vkCmdDrawIndexed.invokeExact(handles.PFN_vkCmdDrawIndexed, commandBuffer, indexCount, instanceCount, firstIndex, vertexOffset, firstInstance); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdDrawIndexed", e); }
    }

    public void CmdDrawIndirect(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("VkBuffer") MemorySegment buffer, @CType("VkDeviceSize") long offset, @CType("uint32_t") int drawCount, @CType("uint32_t") int stride) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCmdDrawIndirect)) throw new SymbolNotFoundError("Symbol not found: vkCmdDrawIndirect");
        try { Handles.MH_vkCmdDrawIndirect.invokeExact(handles.PFN_vkCmdDrawIndirect, commandBuffer, buffer, offset, drawCount, stride); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdDrawIndirect", e); }
    }

    public void CmdDrawIndexedIndirect(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("VkBuffer") MemorySegment buffer, @CType("VkDeviceSize") long offset, @CType("uint32_t") int drawCount, @CType("uint32_t") int stride) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCmdDrawIndexedIndirect)) throw new SymbolNotFoundError("Symbol not found: vkCmdDrawIndexedIndirect");
        try { Handles.MH_vkCmdDrawIndexedIndirect.invokeExact(handles.PFN_vkCmdDrawIndexedIndirect, commandBuffer, buffer, offset, drawCount, stride); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdDrawIndexedIndirect", e); }
    }

    public void CmdDispatch(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("uint32_t") int groupCountX, @CType("uint32_t") int groupCountY, @CType("uint32_t") int groupCountZ) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCmdDispatch)) throw new SymbolNotFoundError("Symbol not found: vkCmdDispatch");
        try { Handles.MH_vkCmdDispatch.invokeExact(handles.PFN_vkCmdDispatch, commandBuffer, groupCountX, groupCountY, groupCountZ); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdDispatch", e); }
    }

    public void CmdDispatchIndirect(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("VkBuffer") MemorySegment buffer, @CType("VkDeviceSize") long offset) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCmdDispatchIndirect)) throw new SymbolNotFoundError("Symbol not found: vkCmdDispatchIndirect");
        try { Handles.MH_vkCmdDispatchIndirect.invokeExact(handles.PFN_vkCmdDispatchIndirect, commandBuffer, buffer, offset); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdDispatchIndirect", e); }
    }

    public void CmdCopyBuffer(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("VkBuffer") MemorySegment srcBuffer, @CType("VkBuffer") MemorySegment dstBuffer, @CType("uint32_t") int regionCount, @CType("const VkBufferCopy *") MemorySegment pRegions) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCmdCopyBuffer)) throw new SymbolNotFoundError("Symbol not found: vkCmdCopyBuffer");
        try { Handles.MH_vkCmdCopyBuffer.invokeExact(handles.PFN_vkCmdCopyBuffer, commandBuffer, srcBuffer, dstBuffer, regionCount, pRegions); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdCopyBuffer", e); }
    }

    public void CmdCopyImage(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("VkImage") MemorySegment srcImage, @CType("VkImageLayout") int srcImageLayout, @CType("VkImage") MemorySegment dstImage, @CType("VkImageLayout") int dstImageLayout, @CType("uint32_t") int regionCount, @CType("const VkImageCopy *") MemorySegment pRegions) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCmdCopyImage)) throw new SymbolNotFoundError("Symbol not found: vkCmdCopyImage");
        try { Handles.MH_vkCmdCopyImage.invokeExact(handles.PFN_vkCmdCopyImage, commandBuffer, srcImage, srcImageLayout, dstImage, dstImageLayout, regionCount, pRegions); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdCopyImage", e); }
    }

    public void CmdBlitImage(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("VkImage") MemorySegment srcImage, @CType("VkImageLayout") int srcImageLayout, @CType("VkImage") MemorySegment dstImage, @CType("VkImageLayout") int dstImageLayout, @CType("uint32_t") int regionCount, @CType("const VkImageBlit *") MemorySegment pRegions, @CType("VkFilter") int filter) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCmdBlitImage)) throw new SymbolNotFoundError("Symbol not found: vkCmdBlitImage");
        try { Handles.MH_vkCmdBlitImage.invokeExact(handles.PFN_vkCmdBlitImage, commandBuffer, srcImage, srcImageLayout, dstImage, dstImageLayout, regionCount, pRegions, filter); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdBlitImage", e); }
    }

    public void CmdCopyBufferToImage(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("VkBuffer") MemorySegment srcBuffer, @CType("VkImage") MemorySegment dstImage, @CType("VkImageLayout") int dstImageLayout, @CType("uint32_t") int regionCount, @CType("const VkBufferImageCopy *") MemorySegment pRegions) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCmdCopyBufferToImage)) throw new SymbolNotFoundError("Symbol not found: vkCmdCopyBufferToImage");
        try { Handles.MH_vkCmdCopyBufferToImage.invokeExact(handles.PFN_vkCmdCopyBufferToImage, commandBuffer, srcBuffer, dstImage, dstImageLayout, regionCount, pRegions); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdCopyBufferToImage", e); }
    }

    public void CmdCopyImageToBuffer(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("VkImage") MemorySegment srcImage, @CType("VkImageLayout") int srcImageLayout, @CType("VkBuffer") MemorySegment dstBuffer, @CType("uint32_t") int regionCount, @CType("const VkBufferImageCopy *") MemorySegment pRegions) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCmdCopyImageToBuffer)) throw new SymbolNotFoundError("Symbol not found: vkCmdCopyImageToBuffer");
        try { Handles.MH_vkCmdCopyImageToBuffer.invokeExact(handles.PFN_vkCmdCopyImageToBuffer, commandBuffer, srcImage, srcImageLayout, dstBuffer, regionCount, pRegions); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdCopyImageToBuffer", e); }
    }

    public void CmdUpdateBuffer(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("VkBuffer") MemorySegment dstBuffer, @CType("VkDeviceSize") long dstOffset, @CType("VkDeviceSize") long dataSize, @CType("const void *") MemorySegment pData) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCmdUpdateBuffer)) throw new SymbolNotFoundError("Symbol not found: vkCmdUpdateBuffer");
        try { Handles.MH_vkCmdUpdateBuffer.invokeExact(handles.PFN_vkCmdUpdateBuffer, commandBuffer, dstBuffer, dstOffset, dataSize, pData); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdUpdateBuffer", e); }
    }

    public void CmdFillBuffer(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("VkBuffer") MemorySegment dstBuffer, @CType("VkDeviceSize") long dstOffset, @CType("VkDeviceSize") long size, @CType("uint32_t") int data) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCmdFillBuffer)) throw new SymbolNotFoundError("Symbol not found: vkCmdFillBuffer");
        try { Handles.MH_vkCmdFillBuffer.invokeExact(handles.PFN_vkCmdFillBuffer, commandBuffer, dstBuffer, dstOffset, size, data); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdFillBuffer", e); }
    }

    public void CmdClearColorImage(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("VkImage") MemorySegment image, @CType("VkImageLayout") int imageLayout, @CType("const VkClearColorValue *") MemorySegment pColor, @CType("uint32_t") int rangeCount, @CType("const VkImageSubresourceRange *") MemorySegment pRanges) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCmdClearColorImage)) throw new SymbolNotFoundError("Symbol not found: vkCmdClearColorImage");
        try { Handles.MH_vkCmdClearColorImage.invokeExact(handles.PFN_vkCmdClearColorImage, commandBuffer, image, imageLayout, pColor, rangeCount, pRanges); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdClearColorImage", e); }
    }

    public void CmdClearDepthStencilImage(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("VkImage") MemorySegment image, @CType("VkImageLayout") int imageLayout, @CType("const VkClearDepthStencilValue *") MemorySegment pDepthStencil, @CType("uint32_t") int rangeCount, @CType("const VkImageSubresourceRange *") MemorySegment pRanges) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCmdClearDepthStencilImage)) throw new SymbolNotFoundError("Symbol not found: vkCmdClearDepthStencilImage");
        try { Handles.MH_vkCmdClearDepthStencilImage.invokeExact(handles.PFN_vkCmdClearDepthStencilImage, commandBuffer, image, imageLayout, pDepthStencil, rangeCount, pRanges); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdClearDepthStencilImage", e); }
    }

    public void CmdClearAttachments(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("uint32_t") int attachmentCount, @CType("const VkClearAttachment *") MemorySegment pAttachments, @CType("uint32_t") int rectCount, @CType("const VkClearRect *") MemorySegment pRects) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCmdClearAttachments)) throw new SymbolNotFoundError("Symbol not found: vkCmdClearAttachments");
        try { Handles.MH_vkCmdClearAttachments.invokeExact(handles.PFN_vkCmdClearAttachments, commandBuffer, attachmentCount, pAttachments, rectCount, pRects); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdClearAttachments", e); }
    }

    public void CmdResolveImage(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("VkImage") MemorySegment srcImage, @CType("VkImageLayout") int srcImageLayout, @CType("VkImage") MemorySegment dstImage, @CType("VkImageLayout") int dstImageLayout, @CType("uint32_t") int regionCount, @CType("const VkImageResolve *") MemorySegment pRegions) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCmdResolveImage)) throw new SymbolNotFoundError("Symbol not found: vkCmdResolveImage");
        try { Handles.MH_vkCmdResolveImage.invokeExact(handles.PFN_vkCmdResolveImage, commandBuffer, srcImage, srcImageLayout, dstImage, dstImageLayout, regionCount, pRegions); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdResolveImage", e); }
    }

    public void CmdSetEvent(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("VkEvent") MemorySegment event, @CType("VkPipelineStageFlags") int stageMask) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCmdSetEvent)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetEvent");
        try { Handles.MH_vkCmdSetEvent.invokeExact(handles.PFN_vkCmdSetEvent, commandBuffer, event, stageMask); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetEvent", e); }
    }

    public void CmdResetEvent(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("VkEvent") MemorySegment event, @CType("VkPipelineStageFlags") int stageMask) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCmdResetEvent)) throw new SymbolNotFoundError("Symbol not found: vkCmdResetEvent");
        try { Handles.MH_vkCmdResetEvent.invokeExact(handles.PFN_vkCmdResetEvent, commandBuffer, event, stageMask); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdResetEvent", e); }
    }

    public void CmdWaitEvents(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("uint32_t") int eventCount, @CType("const VkEvent *") MemorySegment pEvents, @CType("VkPipelineStageFlags") int srcStageMask, @CType("VkPipelineStageFlags") int dstStageMask, @CType("uint32_t") int memoryBarrierCount, @CType("const VkMemoryBarrier *") MemorySegment pMemoryBarriers, @CType("uint32_t") int bufferMemoryBarrierCount, @CType("const VkBufferMemoryBarrier *") MemorySegment pBufferMemoryBarriers, @CType("uint32_t") int imageMemoryBarrierCount, @CType("const VkImageMemoryBarrier *") MemorySegment pImageMemoryBarriers) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCmdWaitEvents)) throw new SymbolNotFoundError("Symbol not found: vkCmdWaitEvents");
        try { Handles.MH_vkCmdWaitEvents.invokeExact(handles.PFN_vkCmdWaitEvents, commandBuffer, eventCount, pEvents, srcStageMask, dstStageMask, memoryBarrierCount, pMemoryBarriers, bufferMemoryBarrierCount, pBufferMemoryBarriers, imageMemoryBarrierCount, pImageMemoryBarriers); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdWaitEvents", e); }
    }

    public void CmdPipelineBarrier(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("VkPipelineStageFlags") int srcStageMask, @CType("VkPipelineStageFlags") int dstStageMask, @CType("VkDependencyFlags") int dependencyFlags, @CType("uint32_t") int memoryBarrierCount, @CType("const VkMemoryBarrier *") MemorySegment pMemoryBarriers, @CType("uint32_t") int bufferMemoryBarrierCount, @CType("const VkBufferMemoryBarrier *") MemorySegment pBufferMemoryBarriers, @CType("uint32_t") int imageMemoryBarrierCount, @CType("const VkImageMemoryBarrier *") MemorySegment pImageMemoryBarriers) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCmdPipelineBarrier)) throw new SymbolNotFoundError("Symbol not found: vkCmdPipelineBarrier");
        try { Handles.MH_vkCmdPipelineBarrier.invokeExact(handles.PFN_vkCmdPipelineBarrier, commandBuffer, srcStageMask, dstStageMask, dependencyFlags, memoryBarrierCount, pMemoryBarriers, bufferMemoryBarrierCount, pBufferMemoryBarriers, imageMemoryBarrierCount, pImageMemoryBarriers); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdPipelineBarrier", e); }
    }

    public void CmdBeginQuery(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("VkQueryPool") MemorySegment queryPool, @CType("uint32_t") int query, @CType("VkQueryControlFlags") int flags) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCmdBeginQuery)) throw new SymbolNotFoundError("Symbol not found: vkCmdBeginQuery");
        try { Handles.MH_vkCmdBeginQuery.invokeExact(handles.PFN_vkCmdBeginQuery, commandBuffer, queryPool, query, flags); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdBeginQuery", e); }
    }

    public void CmdEndQuery(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("VkQueryPool") MemorySegment queryPool, @CType("uint32_t") int query) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCmdEndQuery)) throw new SymbolNotFoundError("Symbol not found: vkCmdEndQuery");
        try { Handles.MH_vkCmdEndQuery.invokeExact(handles.PFN_vkCmdEndQuery, commandBuffer, queryPool, query); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdEndQuery", e); }
    }

    public void CmdResetQueryPool(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("VkQueryPool") MemorySegment queryPool, @CType("uint32_t") int firstQuery, @CType("uint32_t") int queryCount) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCmdResetQueryPool)) throw new SymbolNotFoundError("Symbol not found: vkCmdResetQueryPool");
        try { Handles.MH_vkCmdResetQueryPool.invokeExact(handles.PFN_vkCmdResetQueryPool, commandBuffer, queryPool, firstQuery, queryCount); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdResetQueryPool", e); }
    }

    public void CmdWriteTimestamp(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("VkPipelineStageFlagBits") int pipelineStage, @CType("VkQueryPool") MemorySegment queryPool, @CType("uint32_t") int query) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCmdWriteTimestamp)) throw new SymbolNotFoundError("Symbol not found: vkCmdWriteTimestamp");
        try { Handles.MH_vkCmdWriteTimestamp.invokeExact(handles.PFN_vkCmdWriteTimestamp, commandBuffer, pipelineStage, queryPool, query); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdWriteTimestamp", e); }
    }

    public void CmdCopyQueryPoolResults(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("VkQueryPool") MemorySegment queryPool, @CType("uint32_t") int firstQuery, @CType("uint32_t") int queryCount, @CType("VkBuffer") MemorySegment dstBuffer, @CType("VkDeviceSize") long dstOffset, @CType("VkDeviceSize") long stride, @CType("VkQueryResultFlags") int flags) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCmdCopyQueryPoolResults)) throw new SymbolNotFoundError("Symbol not found: vkCmdCopyQueryPoolResults");
        try { Handles.MH_vkCmdCopyQueryPoolResults.invokeExact(handles.PFN_vkCmdCopyQueryPoolResults, commandBuffer, queryPool, firstQuery, queryCount, dstBuffer, dstOffset, stride, flags); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdCopyQueryPoolResults", e); }
    }

    public void CmdPushConstants(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("VkPipelineLayout") MemorySegment layout, @CType("VkShaderStageFlags") int stageFlags, @CType("uint32_t") int offset, @CType("uint32_t") int size, @CType("const void *") MemorySegment pValues) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCmdPushConstants)) throw new SymbolNotFoundError("Symbol not found: vkCmdPushConstants");
        try { Handles.MH_vkCmdPushConstants.invokeExact(handles.PFN_vkCmdPushConstants, commandBuffer, layout, stageFlags, offset, size, pValues); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdPushConstants", e); }
    }

    public void CmdBeginRenderPass(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("const VkRenderPassBeginInfo *") MemorySegment pRenderPassBegin, @CType("VkSubpassContents") int contents) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCmdBeginRenderPass)) throw new SymbolNotFoundError("Symbol not found: vkCmdBeginRenderPass");
        try { Handles.MH_vkCmdBeginRenderPass.invokeExact(handles.PFN_vkCmdBeginRenderPass, commandBuffer, pRenderPassBegin, contents); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdBeginRenderPass", e); }
    }

    public void CmdNextSubpass(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("VkSubpassContents") int contents) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCmdNextSubpass)) throw new SymbolNotFoundError("Symbol not found: vkCmdNextSubpass");
        try { Handles.MH_vkCmdNextSubpass.invokeExact(handles.PFN_vkCmdNextSubpass, commandBuffer, contents); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdNextSubpass", e); }
    }

    public void CmdEndRenderPass(@CType("VkCommandBuffer") MemorySegment commandBuffer) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCmdEndRenderPass)) throw new SymbolNotFoundError("Symbol not found: vkCmdEndRenderPass");
        try { Handles.MH_vkCmdEndRenderPass.invokeExact(handles.PFN_vkCmdEndRenderPass, commandBuffer); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdEndRenderPass", e); }
    }

    public void CmdExecuteCommands(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("uint32_t") int commandBufferCount, @CType("const VkCommandBuffer *") MemorySegment pCommandBuffers) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCmdExecuteCommands)) throw new SymbolNotFoundError("Symbol not found: vkCmdExecuteCommands");
        try { Handles.MH_vkCmdExecuteCommands.invokeExact(handles.PFN_vkCmdExecuteCommands, commandBuffer, commandBufferCount, pCommandBuffers); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdExecuteCommands", e); }
    }

    // --- OverrunGL custom code ---
    public static final MemorySegment VK_NULL_HANDLE = MemorySegment.NULL;
    
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
        try { return (int) Handles.MH_vkEnumerateInstanceExtensionProperties.invokeExact(p, pLayerName, pPropertyCount, pProperties); }
        catch (Throwable e) { throw new RuntimeException("error in vkEnumerateInstanceExtensionProperties", e); }
    }
    
    public static @CType("VkResult") int vkEnumerateInstanceLayerProperties(VKLoadFunc func, @CType("uint32_t *") MemorySegment pPropertyCount, @CType("VkLayerProperties *") MemorySegment pProperties) {
        var p = func.invoke(MemorySegment.NULL, "vkEnumerateInstanceLayerProperties");
        if (Unmarshal.isNullPointer(p)) throw new SymbolNotFoundError("Symbol not found: vkEnumerateInstanceLayerProperties");
        try { return (int) Handles.MH_vkEnumerateInstanceLayerProperties.invokeExact(p, pPropertyCount, pProperties); }
        catch (Throwable e) { throw new RuntimeException("error in vkEnumerateInstanceLayerProperties", e); }
    }
    
    public static @CType("VkResult") int vkCreateInstance(VKLoadFunc func, @CType("const VkInstanceCreateInfo *") MemorySegment pCreateInfo, @CType("const VkAllocationCallbacks *") MemorySegment pAllocator, @CType("VkInstance *") MemorySegment pInstance) {
        var p = func.invoke(MemorySegment.NULL, "vkCreateInstance");
        if (Unmarshal.isNullPointer(p)) throw new SymbolNotFoundError("Symbol not found: vkCreateInstance");
        try { return (int) Handles.MH_vkCreateInstance.invokeExact(p, pCreateInfo, pAllocator, pInstance); }
        catch (Throwable e) { throw new RuntimeException("error in vkCreateInstance", e); }
    }
    
    public static @CType("PFN_vkVoidFunction") MemorySegment vkGetInstanceProcAddr(VKLoadFunc func, @CType("VkInstance") MemorySegment instance, @CType("const char *") MemorySegment pName) {
        var p = func.invoke(MemorySegment.NULL, "vkGetInstanceProcAddr");
        if (Unmarshal.isNullPointer(p)) throw new SymbolNotFoundError("Symbol not found: vkGetInstanceProcAddr");
        try { return (MemorySegment) Handles.MH_vkGetInstanceProcAddr.invokeExact(p, instance, pName); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetInstanceProcAddr", e); }
    }
}
