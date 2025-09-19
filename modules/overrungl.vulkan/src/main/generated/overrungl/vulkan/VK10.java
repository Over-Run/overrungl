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
import org.jspecify.annotations.*;
import overrungl.util.*;
import static overrungl.internal.RuntimeHelper.*;
/// Constants and functions of Vulkan 1.0.
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
    public static final int VK_ERROR_VALIDATION_FAILED = -1000011001;
    public static final class Handles {
        public static final MethodHandle MH_vkCreateInstance = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkDestroyInstance = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkEnumeratePhysicalDevices = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetPhysicalDeviceFeatures = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetPhysicalDeviceFormatProperties = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetPhysicalDeviceImageFormatProperties = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetPhysicalDeviceProperties = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetPhysicalDeviceQueueFamilyProperties = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetPhysicalDeviceMemoryProperties = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetInstanceProcAddr = downcallHandle(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetDeviceProcAddr = downcallHandle(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCreateDevice = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkDestroyDevice = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkEnumerateInstanceExtensionProperties = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkEnumerateDeviceExtensionProperties = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkEnumerateInstanceLayerProperties = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkEnumerateDeviceLayerProperties = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetDeviceQueue = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkQueueSubmit = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG));
        public static final MethodHandle MH_vkQueueWaitIdle = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkDeviceWaitIdle = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkAllocateMemory = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkFreeMemory = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkMapMemory = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkUnmapMemory = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG));
        public static final MethodHandle MH_vkFlushMappedMemoryRanges = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkInvalidateMappedMemoryRanges = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetDeviceMemoryCommitment = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkBindBufferMemory = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG));
        public static final MethodHandle MH_vkBindImageMemory = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG));
        public static final MethodHandle MH_vkGetBufferMemoryRequirements = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetImageMemoryRequirements = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetImageSparseMemoryRequirements = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetPhysicalDeviceSparseImageFormatProperties = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkQueueBindSparse = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG));
        public static final MethodHandle MH_vkCreateFence = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkDestroyFence = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkResetFences = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetFenceStatus = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG));
        public static final MethodHandle MH_vkWaitForFences = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));
        public static final MethodHandle MH_vkCreateSemaphore = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkDestroySemaphore = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCreateEvent = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkDestroyEvent = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetEventStatus = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG));
        public static final MethodHandle MH_vkSetEvent = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG));
        public static final MethodHandle MH_vkResetEvent = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG));
        public static final MethodHandle MH_vkCreateQueryPool = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkDestroyQueryPool = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetQueryPoolResults = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, CanonicalTypes.SIZE_T, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_vkCreateBuffer = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkDestroyBuffer = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCreateBufferView = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkDestroyBufferView = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCreateImage = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkDestroyImage = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetImageSubresourceLayout = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCreateImageView = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkDestroyImageView = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCreateShaderModule = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkDestroyShaderModule = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCreatePipelineCache = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkDestroyPipelineCache = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetPipelineCacheData = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkMergePipelineCaches = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCreateGraphicsPipelines = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCreateComputePipelines = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkDestroyPipeline = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCreatePipelineLayout = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkDestroyPipelineLayout = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCreateSampler = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkDestroySampler = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCreateDescriptorSetLayout = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkDestroyDescriptorSetLayout = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCreateDescriptorPool = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkDestroyDescriptorPool = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkResetDescriptorPool = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_vkAllocateDescriptorSets = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkFreeDescriptorSets = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkUpdateDescriptorSets = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCreateFramebuffer = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkDestroyFramebuffer = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCreateRenderPass = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkDestroyRenderPass = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetRenderAreaGranularity = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCreateCommandPool = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkDestroyCommandPool = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkResetCommandPool = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_vkAllocateCommandBuffers = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkFreeCommandBuffers = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkBeginCommandBuffer = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkEndCommandBuffer = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkResetCommandBuffer = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_vkCmdBindPipeline = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));
        public static final MethodHandle MH_vkCmdSetViewport = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdSetScissor = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdSetLineWidth = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT));
        public static final MethodHandle MH_vkCmdSetDepthBias = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));
        public static final MethodHandle MH_vkCmdSetBlendConstants = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdSetDepthBounds = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));
        public static final MethodHandle MH_vkCmdSetStencilCompareMask = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_vkCmdSetStencilWriteMask = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_vkCmdSetStencilReference = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_vkCmdBindDescriptorSets = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdBindIndexBuffer = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_vkCmdBindVertexBuffers = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdDraw = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_vkCmdDrawIndexed = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_vkCmdDrawIndirect = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_vkCmdDrawIndexedIndirect = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_vkCmdDispatch = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_vkCmdDispatchIndirect = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG));
        public static final MethodHandle MH_vkCmdCopyBuffer = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdCopyImage = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdBlitImage = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_vkCmdCopyBufferToImage = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdCopyImageToBuffer = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdUpdateBuffer = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdFillBuffer = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_vkCmdClearColorImage = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdClearDepthStencilImage = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdClearAttachments = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdResolveImage = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdSetEvent = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_vkCmdResetEvent = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_vkCmdWaitEvents = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdPipelineBarrier = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdBeginQuery = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_vkCmdEndQuery = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_vkCmdResetQueryPool = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_vkCmdWriteTimestamp = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_vkCmdCopyQueryPoolResults = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_vkCmdPushConstants = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdBeginRenderPass = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_vkCmdNextSubpass = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_vkCmdEndRenderPass = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdExecuteCommands = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        private Handles() {}
    }

    private VK10() {}

    /// Invokes `vkCreateInstance`.
    /// ```
    /// (int) VkResult vkCreateInstance(const VkInstanceCreateInfo* pCreateInfo, const VkAllocationCallbacks* pAllocator, VkInstance* pInstance);
    /// ```
    public static int vkCreateInstance(@NonNull MemorySegment pCreateInfo, @NonNull MemorySegment pAllocator, @NonNull MemorySegment pInstance) {
        if (MemoryUtil.isNullPointer(VK.globalCommands().PFN_vkCreateInstance)) throw new VKSymbolNotFoundError("Symbol not found: vkCreateInstance");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCreateInstance", pCreateInfo, pAllocator, pInstance); }
        return (int) Handles.MH_vkCreateInstance.invokeExact(VK.globalCommands().PFN_vkCreateInstance, pCreateInfo, pAllocator, pInstance); }
        catch (Throwable e) { throw new RuntimeException("error in vkCreateInstance", e); }
    }

    /// Invokes `vkDestroyInstance`.
    /// ```
    /// void vkDestroyInstance((struct VkInstance*) VkInstance instance, const VkAllocationCallbacks* pAllocator);
    /// ```
    public static void vkDestroyInstance(@NonNull VkInstance instance, @NonNull MemorySegment pAllocator) {
        if (MemoryUtil.isNullPointer(instance.capabilities().PFN_vkDestroyInstance)) throw new VKSymbolNotFoundError("Symbol not found: vkDestroyInstance");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkDestroyInstance", instance, pAllocator); }
        Handles.MH_vkDestroyInstance.invokeExact(instance.capabilities().PFN_vkDestroyInstance, instance.segment(), pAllocator); }
        catch (Throwable e) { throw new RuntimeException("error in vkDestroyInstance", e); }
    }

    /// Invokes `vkEnumeratePhysicalDevices`.
    /// ```
    /// (int) VkResult vkEnumeratePhysicalDevices((struct VkInstance*) VkInstance instance, uint32_t* pPhysicalDeviceCount, VkPhysicalDevice* pPhysicalDevices);
    /// ```
    public static int vkEnumeratePhysicalDevices(@NonNull VkInstance instance, @NonNull MemorySegment pPhysicalDeviceCount, @NonNull MemorySegment pPhysicalDevices) {
        if (MemoryUtil.isNullPointer(instance.capabilities().PFN_vkEnumeratePhysicalDevices)) throw new VKSymbolNotFoundError("Symbol not found: vkEnumeratePhysicalDevices");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkEnumeratePhysicalDevices", instance, pPhysicalDeviceCount, pPhysicalDevices); }
        return (int) Handles.MH_vkEnumeratePhysicalDevices.invokeExact(instance.capabilities().PFN_vkEnumeratePhysicalDevices, instance.segment(), pPhysicalDeviceCount, pPhysicalDevices); }
        catch (Throwable e) { throw new RuntimeException("error in vkEnumeratePhysicalDevices", e); }
    }

    /// Invokes `vkGetPhysicalDeviceFeatures`.
    /// ```
    /// void vkGetPhysicalDeviceFeatures((struct VkPhysicalDevice*) VkPhysicalDevice physicalDevice, VkPhysicalDeviceFeatures* pFeatures);
    /// ```
    public static void vkGetPhysicalDeviceFeatures(@NonNull VkPhysicalDevice physicalDevice, @NonNull MemorySegment pFeatures) {
        if (MemoryUtil.isNullPointer(physicalDevice.capabilities().PFN_vkGetPhysicalDeviceFeatures)) throw new VKSymbolNotFoundError("Symbol not found: vkGetPhysicalDeviceFeatures");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkGetPhysicalDeviceFeatures", physicalDevice, pFeatures); }
        Handles.MH_vkGetPhysicalDeviceFeatures.invokeExact(physicalDevice.capabilities().PFN_vkGetPhysicalDeviceFeatures, physicalDevice.segment(), pFeatures); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetPhysicalDeviceFeatures", e); }
    }

    /// Invokes `vkGetPhysicalDeviceFormatProperties`.
    /// ```
    /// void vkGetPhysicalDeviceFormatProperties((struct VkPhysicalDevice*) VkPhysicalDevice physicalDevice, (int) VkFormat format, VkFormatProperties* pFormatProperties);
    /// ```
    public static void vkGetPhysicalDeviceFormatProperties(@NonNull VkPhysicalDevice physicalDevice, int format, @NonNull MemorySegment pFormatProperties) {
        if (MemoryUtil.isNullPointer(physicalDevice.capabilities().PFN_vkGetPhysicalDeviceFormatProperties)) throw new VKSymbolNotFoundError("Symbol not found: vkGetPhysicalDeviceFormatProperties");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkGetPhysicalDeviceFormatProperties", physicalDevice, format, pFormatProperties); }
        Handles.MH_vkGetPhysicalDeviceFormatProperties.invokeExact(physicalDevice.capabilities().PFN_vkGetPhysicalDeviceFormatProperties, physicalDevice.segment(), format, pFormatProperties); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetPhysicalDeviceFormatProperties", e); }
    }

    /// Invokes `vkGetPhysicalDeviceImageFormatProperties`.
    /// ```
    /// (int) VkResult vkGetPhysicalDeviceImageFormatProperties((struct VkPhysicalDevice*) VkPhysicalDevice physicalDevice, (int) VkFormat format, (int) VkImageType type, (int) VkImageTiling tiling, ((uint32_t) VkFlags) VkImageUsageFlags usage, ((uint32_t) VkFlags) VkImageCreateFlags flags, VkImageFormatProperties* pImageFormatProperties);
    /// ```
    public static int vkGetPhysicalDeviceImageFormatProperties(@NonNull VkPhysicalDevice physicalDevice, int format, int type, int tiling, int usage, int flags, @NonNull MemorySegment pImageFormatProperties) {
        if (MemoryUtil.isNullPointer(physicalDevice.capabilities().PFN_vkGetPhysicalDeviceImageFormatProperties)) throw new VKSymbolNotFoundError("Symbol not found: vkGetPhysicalDeviceImageFormatProperties");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkGetPhysicalDeviceImageFormatProperties", physicalDevice, format, type, tiling, usage, flags, pImageFormatProperties); }
        return (int) Handles.MH_vkGetPhysicalDeviceImageFormatProperties.invokeExact(physicalDevice.capabilities().PFN_vkGetPhysicalDeviceImageFormatProperties, physicalDevice.segment(), format, type, tiling, usage, flags, pImageFormatProperties); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetPhysicalDeviceImageFormatProperties", e); }
    }

    /// Invokes `vkGetPhysicalDeviceProperties`.
    /// ```
    /// void vkGetPhysicalDeviceProperties((struct VkPhysicalDevice*) VkPhysicalDevice physicalDevice, VkPhysicalDeviceProperties* pProperties);
    /// ```
    public static void vkGetPhysicalDeviceProperties(@NonNull VkPhysicalDevice physicalDevice, @NonNull MemorySegment pProperties) {
        if (MemoryUtil.isNullPointer(physicalDevice.capabilities().PFN_vkGetPhysicalDeviceProperties)) throw new VKSymbolNotFoundError("Symbol not found: vkGetPhysicalDeviceProperties");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkGetPhysicalDeviceProperties", physicalDevice, pProperties); }
        Handles.MH_vkGetPhysicalDeviceProperties.invokeExact(physicalDevice.capabilities().PFN_vkGetPhysicalDeviceProperties, physicalDevice.segment(), pProperties); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetPhysicalDeviceProperties", e); }
    }

    /// Invokes `vkGetPhysicalDeviceQueueFamilyProperties`.
    /// ```
    /// void vkGetPhysicalDeviceQueueFamilyProperties((struct VkPhysicalDevice*) VkPhysicalDevice physicalDevice, uint32_t* pQueueFamilyPropertyCount, VkQueueFamilyProperties* pQueueFamilyProperties);
    /// ```
    public static void vkGetPhysicalDeviceQueueFamilyProperties(@NonNull VkPhysicalDevice physicalDevice, @NonNull MemorySegment pQueueFamilyPropertyCount, @NonNull MemorySegment pQueueFamilyProperties) {
        if (MemoryUtil.isNullPointer(physicalDevice.capabilities().PFN_vkGetPhysicalDeviceQueueFamilyProperties)) throw new VKSymbolNotFoundError("Symbol not found: vkGetPhysicalDeviceQueueFamilyProperties");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkGetPhysicalDeviceQueueFamilyProperties", physicalDevice, pQueueFamilyPropertyCount, pQueueFamilyProperties); }
        Handles.MH_vkGetPhysicalDeviceQueueFamilyProperties.invokeExact(physicalDevice.capabilities().PFN_vkGetPhysicalDeviceQueueFamilyProperties, physicalDevice.segment(), pQueueFamilyPropertyCount, pQueueFamilyProperties); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetPhysicalDeviceQueueFamilyProperties", e); }
    }

    /// Invokes `vkGetPhysicalDeviceMemoryProperties`.
    /// ```
    /// void vkGetPhysicalDeviceMemoryProperties((struct VkPhysicalDevice*) VkPhysicalDevice physicalDevice, VkPhysicalDeviceMemoryProperties* pMemoryProperties);
    /// ```
    public static void vkGetPhysicalDeviceMemoryProperties(@NonNull VkPhysicalDevice physicalDevice, @NonNull MemorySegment pMemoryProperties) {
        if (MemoryUtil.isNullPointer(physicalDevice.capabilities().PFN_vkGetPhysicalDeviceMemoryProperties)) throw new VKSymbolNotFoundError("Symbol not found: vkGetPhysicalDeviceMemoryProperties");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkGetPhysicalDeviceMemoryProperties", physicalDevice, pMemoryProperties); }
        Handles.MH_vkGetPhysicalDeviceMemoryProperties.invokeExact(physicalDevice.capabilities().PFN_vkGetPhysicalDeviceMemoryProperties, physicalDevice.segment(), pMemoryProperties); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetPhysicalDeviceMemoryProperties", e); }
    }

    /// Invokes `vkGetInstanceProcAddr`.
    /// ```
    /// (void (*VkVoidFunction)()) PFN_vkVoidFunction vkGetInstanceProcAddr((struct VkInstance*) VkInstance instance, const char* pName);
    /// ```
    public static @NonNull MemorySegment vkGetInstanceProcAddr(@NonNull VkInstance instance, @NonNull MemorySegment pName) {
        if (MemoryUtil.isNullPointer(instance.capabilities().PFN_vkGetInstanceProcAddr)) throw new VKSymbolNotFoundError("Symbol not found: vkGetInstanceProcAddr");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkGetInstanceProcAddr", instance, pName); }
        return (MemorySegment) Handles.MH_vkGetInstanceProcAddr.invokeExact(instance.capabilities().PFN_vkGetInstanceProcAddr, instance.segment(), pName); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetInstanceProcAddr", e); }
    }

    /// Invokes `vkGetDeviceProcAddr`.
    /// ```
    /// (void (*VkVoidFunction)()) PFN_vkVoidFunction vkGetDeviceProcAddr((struct VkDevice*) VkDevice device, const char* pName);
    /// ```
    public static @NonNull MemorySegment vkGetDeviceProcAddr(@NonNull VkDevice device, @NonNull MemorySegment pName) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkGetDeviceProcAddr)) throw new VKSymbolNotFoundError("Symbol not found: vkGetDeviceProcAddr");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkGetDeviceProcAddr", device, pName); }
        return (MemorySegment) Handles.MH_vkGetDeviceProcAddr.invokeExact(device.capabilities().PFN_vkGetDeviceProcAddr, device.segment(), pName); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetDeviceProcAddr", e); }
    }

    /// Invokes `vkCreateDevice`.
    /// ```
    /// (int) VkResult vkCreateDevice((struct VkPhysicalDevice*) VkPhysicalDevice physicalDevice, const VkDeviceCreateInfo* pCreateInfo, const VkAllocationCallbacks* pAllocator, VkDevice* pDevice);
    /// ```
    public static int vkCreateDevice(@NonNull VkPhysicalDevice physicalDevice, @NonNull MemorySegment pCreateInfo, @NonNull MemorySegment pAllocator, @NonNull MemorySegment pDevice) {
        if (MemoryUtil.isNullPointer(physicalDevice.capabilities().PFN_vkCreateDevice)) throw new VKSymbolNotFoundError("Symbol not found: vkCreateDevice");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCreateDevice", physicalDevice, pCreateInfo, pAllocator, pDevice); }
        return (int) Handles.MH_vkCreateDevice.invokeExact(physicalDevice.capabilities().PFN_vkCreateDevice, physicalDevice.segment(), pCreateInfo, pAllocator, pDevice); }
        catch (Throwable e) { throw new RuntimeException("error in vkCreateDevice", e); }
    }

    /// Invokes `vkDestroyDevice`.
    /// ```
    /// void vkDestroyDevice((struct VkDevice*) VkDevice device, const VkAllocationCallbacks* pAllocator);
    /// ```
    public static void vkDestroyDevice(@NonNull VkDevice device, @NonNull MemorySegment pAllocator) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkDestroyDevice)) throw new VKSymbolNotFoundError("Symbol not found: vkDestroyDevice");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkDestroyDevice", device, pAllocator); }
        Handles.MH_vkDestroyDevice.invokeExact(device.capabilities().PFN_vkDestroyDevice, device.segment(), pAllocator); }
        catch (Throwable e) { throw new RuntimeException("error in vkDestroyDevice", e); }
    }

    /// Invokes `vkEnumerateInstanceExtensionProperties`.
    /// ```
    /// (int) VkResult vkEnumerateInstanceExtensionProperties(const char* pLayerName, uint32_t* pPropertyCount, VkExtensionProperties* pProperties);
    /// ```
    public static int vkEnumerateInstanceExtensionProperties(@NonNull MemorySegment pLayerName, @NonNull MemorySegment pPropertyCount, @NonNull MemorySegment pProperties) {
        if (MemoryUtil.isNullPointer(VK.globalCommands().PFN_vkEnumerateInstanceExtensionProperties)) throw new VKSymbolNotFoundError("Symbol not found: vkEnumerateInstanceExtensionProperties");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkEnumerateInstanceExtensionProperties", pLayerName, pPropertyCount, pProperties); }
        return (int) Handles.MH_vkEnumerateInstanceExtensionProperties.invokeExact(VK.globalCommands().PFN_vkEnumerateInstanceExtensionProperties, pLayerName, pPropertyCount, pProperties); }
        catch (Throwable e) { throw new RuntimeException("error in vkEnumerateInstanceExtensionProperties", e); }
    }

    /// Invokes `vkEnumerateDeviceExtensionProperties`.
    /// ```
    /// (int) VkResult vkEnumerateDeviceExtensionProperties((struct VkPhysicalDevice*) VkPhysicalDevice physicalDevice, const char* pLayerName, uint32_t* pPropertyCount, VkExtensionProperties* pProperties);
    /// ```
    public static int vkEnumerateDeviceExtensionProperties(@NonNull VkPhysicalDevice physicalDevice, @NonNull MemorySegment pLayerName, @NonNull MemorySegment pPropertyCount, @NonNull MemorySegment pProperties) {
        if (MemoryUtil.isNullPointer(physicalDevice.capabilities().PFN_vkEnumerateDeviceExtensionProperties)) throw new VKSymbolNotFoundError("Symbol not found: vkEnumerateDeviceExtensionProperties");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkEnumerateDeviceExtensionProperties", physicalDevice, pLayerName, pPropertyCount, pProperties); }
        return (int) Handles.MH_vkEnumerateDeviceExtensionProperties.invokeExact(physicalDevice.capabilities().PFN_vkEnumerateDeviceExtensionProperties, physicalDevice.segment(), pLayerName, pPropertyCount, pProperties); }
        catch (Throwable e) { throw new RuntimeException("error in vkEnumerateDeviceExtensionProperties", e); }
    }

    /// Invokes `vkEnumerateInstanceLayerProperties`.
    /// ```
    /// (int) VkResult vkEnumerateInstanceLayerProperties(uint32_t* pPropertyCount, VkLayerProperties* pProperties);
    /// ```
    public static int vkEnumerateInstanceLayerProperties(@NonNull MemorySegment pPropertyCount, @NonNull MemorySegment pProperties) {
        if (MemoryUtil.isNullPointer(VK.globalCommands().PFN_vkEnumerateInstanceLayerProperties)) throw new VKSymbolNotFoundError("Symbol not found: vkEnumerateInstanceLayerProperties");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkEnumerateInstanceLayerProperties", pPropertyCount, pProperties); }
        return (int) Handles.MH_vkEnumerateInstanceLayerProperties.invokeExact(VK.globalCommands().PFN_vkEnumerateInstanceLayerProperties, pPropertyCount, pProperties); }
        catch (Throwable e) { throw new RuntimeException("error in vkEnumerateInstanceLayerProperties", e); }
    }

    /// Invokes `vkEnumerateDeviceLayerProperties`.
    /// ```
    /// (int) VkResult vkEnumerateDeviceLayerProperties((struct VkPhysicalDevice*) VkPhysicalDevice physicalDevice, uint32_t* pPropertyCount, VkLayerProperties* pProperties);
    /// ```
    public static int vkEnumerateDeviceLayerProperties(@NonNull VkPhysicalDevice physicalDevice, @NonNull MemorySegment pPropertyCount, @NonNull MemorySegment pProperties) {
        if (MemoryUtil.isNullPointer(physicalDevice.capabilities().PFN_vkEnumerateDeviceLayerProperties)) throw new VKSymbolNotFoundError("Symbol not found: vkEnumerateDeviceLayerProperties");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkEnumerateDeviceLayerProperties", physicalDevice, pPropertyCount, pProperties); }
        return (int) Handles.MH_vkEnumerateDeviceLayerProperties.invokeExact(physicalDevice.capabilities().PFN_vkEnumerateDeviceLayerProperties, physicalDevice.segment(), pPropertyCount, pProperties); }
        catch (Throwable e) { throw new RuntimeException("error in vkEnumerateDeviceLayerProperties", e); }
    }

    /// Invokes `vkGetDeviceQueue`.
    /// ```
    /// void vkGetDeviceQueue((struct VkDevice*) VkDevice device, uint32_t queueFamilyIndex, uint32_t queueIndex, VkQueue* pQueue);
    /// ```
    public static void vkGetDeviceQueue(@NonNull VkDevice device, int queueFamilyIndex, int queueIndex, @NonNull MemorySegment pQueue) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkGetDeviceQueue)) throw new VKSymbolNotFoundError("Symbol not found: vkGetDeviceQueue");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkGetDeviceQueue", device, queueFamilyIndex, queueIndex, pQueue); }
        Handles.MH_vkGetDeviceQueue.invokeExact(device.capabilities().PFN_vkGetDeviceQueue, device.segment(), queueFamilyIndex, queueIndex, pQueue); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetDeviceQueue", e); }
    }

    /// Invokes `vkQueueSubmit`.
    /// ```
    /// (int) VkResult vkQueueSubmit((struct VkQueue*) VkQueue queue, uint32_t submitCount, const VkSubmitInfo* pSubmits, (uint64_t) VkFence fence);
    /// ```
    public static int vkQueueSubmit(@NonNull VkQueue queue, int submitCount, @NonNull MemorySegment pSubmits, long fence) {
        if (MemoryUtil.isNullPointer(queue.capabilities().PFN_vkQueueSubmit)) throw new VKSymbolNotFoundError("Symbol not found: vkQueueSubmit");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkQueueSubmit", queue, submitCount, pSubmits, fence); }
        return (int) Handles.MH_vkQueueSubmit.invokeExact(queue.capabilities().PFN_vkQueueSubmit, queue.segment(), submitCount, pSubmits, fence); }
        catch (Throwable e) { throw new RuntimeException("error in vkQueueSubmit", e); }
    }

    /// Invokes `vkQueueWaitIdle`.
    /// ```
    /// (int) VkResult vkQueueWaitIdle((struct VkQueue*) VkQueue queue);
    /// ```
    public static int vkQueueWaitIdle(@NonNull VkQueue queue) {
        if (MemoryUtil.isNullPointer(queue.capabilities().PFN_vkQueueWaitIdle)) throw new VKSymbolNotFoundError("Symbol not found: vkQueueWaitIdle");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkQueueWaitIdle", queue); }
        return (int) Handles.MH_vkQueueWaitIdle.invokeExact(queue.capabilities().PFN_vkQueueWaitIdle, queue.segment()); }
        catch (Throwable e) { throw new RuntimeException("error in vkQueueWaitIdle", e); }
    }

    /// Invokes `vkDeviceWaitIdle`.
    /// ```
    /// (int) VkResult vkDeviceWaitIdle((struct VkDevice*) VkDevice device);
    /// ```
    public static int vkDeviceWaitIdle(@NonNull VkDevice device) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkDeviceWaitIdle)) throw new VKSymbolNotFoundError("Symbol not found: vkDeviceWaitIdle");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkDeviceWaitIdle", device); }
        return (int) Handles.MH_vkDeviceWaitIdle.invokeExact(device.capabilities().PFN_vkDeviceWaitIdle, device.segment()); }
        catch (Throwable e) { throw new RuntimeException("error in vkDeviceWaitIdle", e); }
    }

    /// Invokes `vkAllocateMemory`.
    /// ```
    /// (int) VkResult vkAllocateMemory((struct VkDevice*) VkDevice device, const VkMemoryAllocateInfo* pAllocateInfo, const VkAllocationCallbacks* pAllocator, VkDeviceMemory* pMemory);
    /// ```
    public static int vkAllocateMemory(@NonNull VkDevice device, @NonNull MemorySegment pAllocateInfo, @NonNull MemorySegment pAllocator, @NonNull MemorySegment pMemory) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkAllocateMemory)) throw new VKSymbolNotFoundError("Symbol not found: vkAllocateMemory");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkAllocateMemory", device, pAllocateInfo, pAllocator, pMemory); }
        return (int) Handles.MH_vkAllocateMemory.invokeExact(device.capabilities().PFN_vkAllocateMemory, device.segment(), pAllocateInfo, pAllocator, pMemory); }
        catch (Throwable e) { throw new RuntimeException("error in vkAllocateMemory", e); }
    }

    /// Invokes `vkFreeMemory`.
    /// ```
    /// void vkFreeMemory((struct VkDevice*) VkDevice device, (uint64_t) VkDeviceMemory memory, const VkAllocationCallbacks* pAllocator);
    /// ```
    public static void vkFreeMemory(@NonNull VkDevice device, long memory, @NonNull MemorySegment pAllocator) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkFreeMemory)) throw new VKSymbolNotFoundError("Symbol not found: vkFreeMemory");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkFreeMemory", device, memory, pAllocator); }
        Handles.MH_vkFreeMemory.invokeExact(device.capabilities().PFN_vkFreeMemory, device.segment(), memory, pAllocator); }
        catch (Throwable e) { throw new RuntimeException("error in vkFreeMemory", e); }
    }

    /// Invokes `vkMapMemory`.
    /// ```
    /// (int) VkResult vkMapMemory((struct VkDevice*) VkDevice device, (uint64_t) VkDeviceMemory memory, (uint64_t) VkDeviceSize offset, (uint64_t) VkDeviceSize size, ((uint32_t) VkFlags) VkMemoryMapFlags flags, void** ppData);
    /// ```
    public static int vkMapMemory(@NonNull VkDevice device, long memory, long offset, long size, int flags, @NonNull MemorySegment ppData) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkMapMemory)) throw new VKSymbolNotFoundError("Symbol not found: vkMapMemory");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkMapMemory", device, memory, offset, size, flags, ppData); }
        return (int) Handles.MH_vkMapMemory.invokeExact(device.capabilities().PFN_vkMapMemory, device.segment(), memory, offset, size, flags, ppData); }
        catch (Throwable e) { throw new RuntimeException("error in vkMapMemory", e); }
    }

    /// Invokes `vkUnmapMemory`.
    /// ```
    /// void vkUnmapMemory((struct VkDevice*) VkDevice device, (uint64_t) VkDeviceMemory memory);
    /// ```
    public static void vkUnmapMemory(@NonNull VkDevice device, long memory) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkUnmapMemory)) throw new VKSymbolNotFoundError("Symbol not found: vkUnmapMemory");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkUnmapMemory", device, memory); }
        Handles.MH_vkUnmapMemory.invokeExact(device.capabilities().PFN_vkUnmapMemory, device.segment(), memory); }
        catch (Throwable e) { throw new RuntimeException("error in vkUnmapMemory", e); }
    }

    /// Invokes `vkFlushMappedMemoryRanges`.
    /// ```
    /// (int) VkResult vkFlushMappedMemoryRanges((struct VkDevice*) VkDevice device, uint32_t memoryRangeCount, const VkMappedMemoryRange* pMemoryRanges);
    /// ```
    public static int vkFlushMappedMemoryRanges(@NonNull VkDevice device, int memoryRangeCount, @NonNull MemorySegment pMemoryRanges) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkFlushMappedMemoryRanges)) throw new VKSymbolNotFoundError("Symbol not found: vkFlushMappedMemoryRanges");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkFlushMappedMemoryRanges", device, memoryRangeCount, pMemoryRanges); }
        return (int) Handles.MH_vkFlushMappedMemoryRanges.invokeExact(device.capabilities().PFN_vkFlushMappedMemoryRanges, device.segment(), memoryRangeCount, pMemoryRanges); }
        catch (Throwable e) { throw new RuntimeException("error in vkFlushMappedMemoryRanges", e); }
    }

    /// Invokes `vkInvalidateMappedMemoryRanges`.
    /// ```
    /// (int) VkResult vkInvalidateMappedMemoryRanges((struct VkDevice*) VkDevice device, uint32_t memoryRangeCount, const VkMappedMemoryRange* pMemoryRanges);
    /// ```
    public static int vkInvalidateMappedMemoryRanges(@NonNull VkDevice device, int memoryRangeCount, @NonNull MemorySegment pMemoryRanges) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkInvalidateMappedMemoryRanges)) throw new VKSymbolNotFoundError("Symbol not found: vkInvalidateMappedMemoryRanges");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkInvalidateMappedMemoryRanges", device, memoryRangeCount, pMemoryRanges); }
        return (int) Handles.MH_vkInvalidateMappedMemoryRanges.invokeExact(device.capabilities().PFN_vkInvalidateMappedMemoryRanges, device.segment(), memoryRangeCount, pMemoryRanges); }
        catch (Throwable e) { throw new RuntimeException("error in vkInvalidateMappedMemoryRanges", e); }
    }

    /// Invokes `vkGetDeviceMemoryCommitment`.
    /// ```
    /// void vkGetDeviceMemoryCommitment((struct VkDevice*) VkDevice device, (uint64_t) VkDeviceMemory memory, VkDeviceSize* pCommittedMemoryInBytes);
    /// ```
    public static void vkGetDeviceMemoryCommitment(@NonNull VkDevice device, long memory, @NonNull MemorySegment pCommittedMemoryInBytes) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkGetDeviceMemoryCommitment)) throw new VKSymbolNotFoundError("Symbol not found: vkGetDeviceMemoryCommitment");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkGetDeviceMemoryCommitment", device, memory, pCommittedMemoryInBytes); }
        Handles.MH_vkGetDeviceMemoryCommitment.invokeExact(device.capabilities().PFN_vkGetDeviceMemoryCommitment, device.segment(), memory, pCommittedMemoryInBytes); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetDeviceMemoryCommitment", e); }
    }

    /// Invokes `vkBindBufferMemory`.
    /// ```
    /// (int) VkResult vkBindBufferMemory((struct VkDevice*) VkDevice device, (uint64_t) VkBuffer buffer, (uint64_t) VkDeviceMemory memory, (uint64_t) VkDeviceSize memoryOffset);
    /// ```
    public static int vkBindBufferMemory(@NonNull VkDevice device, long buffer, long memory, long memoryOffset) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkBindBufferMemory)) throw new VKSymbolNotFoundError("Symbol not found: vkBindBufferMemory");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkBindBufferMemory", device, buffer, memory, memoryOffset); }
        return (int) Handles.MH_vkBindBufferMemory.invokeExact(device.capabilities().PFN_vkBindBufferMemory, device.segment(), buffer, memory, memoryOffset); }
        catch (Throwable e) { throw new RuntimeException("error in vkBindBufferMemory", e); }
    }

    /// Invokes `vkBindImageMemory`.
    /// ```
    /// (int) VkResult vkBindImageMemory((struct VkDevice*) VkDevice device, (uint64_t) VkImage image, (uint64_t) VkDeviceMemory memory, (uint64_t) VkDeviceSize memoryOffset);
    /// ```
    public static int vkBindImageMemory(@NonNull VkDevice device, long image, long memory, long memoryOffset) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkBindImageMemory)) throw new VKSymbolNotFoundError("Symbol not found: vkBindImageMemory");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkBindImageMemory", device, image, memory, memoryOffset); }
        return (int) Handles.MH_vkBindImageMemory.invokeExact(device.capabilities().PFN_vkBindImageMemory, device.segment(), image, memory, memoryOffset); }
        catch (Throwable e) { throw new RuntimeException("error in vkBindImageMemory", e); }
    }

    /// Invokes `vkGetBufferMemoryRequirements`.
    /// ```
    /// void vkGetBufferMemoryRequirements((struct VkDevice*) VkDevice device, (uint64_t) VkBuffer buffer, VkMemoryRequirements* pMemoryRequirements);
    /// ```
    public static void vkGetBufferMemoryRequirements(@NonNull VkDevice device, long buffer, @NonNull MemorySegment pMemoryRequirements) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkGetBufferMemoryRequirements)) throw new VKSymbolNotFoundError("Symbol not found: vkGetBufferMemoryRequirements");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkGetBufferMemoryRequirements", device, buffer, pMemoryRequirements); }
        Handles.MH_vkGetBufferMemoryRequirements.invokeExact(device.capabilities().PFN_vkGetBufferMemoryRequirements, device.segment(), buffer, pMemoryRequirements); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetBufferMemoryRequirements", e); }
    }

    /// Invokes `vkGetImageMemoryRequirements`.
    /// ```
    /// void vkGetImageMemoryRequirements((struct VkDevice*) VkDevice device, (uint64_t) VkImage image, VkMemoryRequirements* pMemoryRequirements);
    /// ```
    public static void vkGetImageMemoryRequirements(@NonNull VkDevice device, long image, @NonNull MemorySegment pMemoryRequirements) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkGetImageMemoryRequirements)) throw new VKSymbolNotFoundError("Symbol not found: vkGetImageMemoryRequirements");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkGetImageMemoryRequirements", device, image, pMemoryRequirements); }
        Handles.MH_vkGetImageMemoryRequirements.invokeExact(device.capabilities().PFN_vkGetImageMemoryRequirements, device.segment(), image, pMemoryRequirements); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetImageMemoryRequirements", e); }
    }

    /// Invokes `vkGetImageSparseMemoryRequirements`.
    /// ```
    /// void vkGetImageSparseMemoryRequirements((struct VkDevice*) VkDevice device, (uint64_t) VkImage image, uint32_t* pSparseMemoryRequirementCount, VkSparseImageMemoryRequirements* pSparseMemoryRequirements);
    /// ```
    public static void vkGetImageSparseMemoryRequirements(@NonNull VkDevice device, long image, @NonNull MemorySegment pSparseMemoryRequirementCount, @NonNull MemorySegment pSparseMemoryRequirements) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkGetImageSparseMemoryRequirements)) throw new VKSymbolNotFoundError("Symbol not found: vkGetImageSparseMemoryRequirements");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkGetImageSparseMemoryRequirements", device, image, pSparseMemoryRequirementCount, pSparseMemoryRequirements); }
        Handles.MH_vkGetImageSparseMemoryRequirements.invokeExact(device.capabilities().PFN_vkGetImageSparseMemoryRequirements, device.segment(), image, pSparseMemoryRequirementCount, pSparseMemoryRequirements); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetImageSparseMemoryRequirements", e); }
    }

    /// Invokes `vkGetPhysicalDeviceSparseImageFormatProperties`.
    /// ```
    /// void vkGetPhysicalDeviceSparseImageFormatProperties((struct VkPhysicalDevice*) VkPhysicalDevice physicalDevice, (int) VkFormat format, (int) VkImageType type, (int) VkSampleCountFlagBits samples, ((uint32_t) VkFlags) VkImageUsageFlags usage, (int) VkImageTiling tiling, uint32_t* pPropertyCount, VkSparseImageFormatProperties* pProperties);
    /// ```
    public static void vkGetPhysicalDeviceSparseImageFormatProperties(@NonNull VkPhysicalDevice physicalDevice, int format, int type, int samples, int usage, int tiling, @NonNull MemorySegment pPropertyCount, @NonNull MemorySegment pProperties) {
        if (MemoryUtil.isNullPointer(physicalDevice.capabilities().PFN_vkGetPhysicalDeviceSparseImageFormatProperties)) throw new VKSymbolNotFoundError("Symbol not found: vkGetPhysicalDeviceSparseImageFormatProperties");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkGetPhysicalDeviceSparseImageFormatProperties", physicalDevice, format, type, samples, usage, tiling, pPropertyCount, pProperties); }
        Handles.MH_vkGetPhysicalDeviceSparseImageFormatProperties.invokeExact(physicalDevice.capabilities().PFN_vkGetPhysicalDeviceSparseImageFormatProperties, physicalDevice.segment(), format, type, samples, usage, tiling, pPropertyCount, pProperties); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetPhysicalDeviceSparseImageFormatProperties", e); }
    }

    /// Invokes `vkQueueBindSparse`.
    /// ```
    /// (int) VkResult vkQueueBindSparse((struct VkQueue*) VkQueue queue, uint32_t bindInfoCount, const VkBindSparseInfo* pBindInfo, (uint64_t) VkFence fence);
    /// ```
    public static int vkQueueBindSparse(@NonNull VkQueue queue, int bindInfoCount, @NonNull MemorySegment pBindInfo, long fence) {
        if (MemoryUtil.isNullPointer(queue.capabilities().PFN_vkQueueBindSparse)) throw new VKSymbolNotFoundError("Symbol not found: vkQueueBindSparse");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkQueueBindSparse", queue, bindInfoCount, pBindInfo, fence); }
        return (int) Handles.MH_vkQueueBindSparse.invokeExact(queue.capabilities().PFN_vkQueueBindSparse, queue.segment(), bindInfoCount, pBindInfo, fence); }
        catch (Throwable e) { throw new RuntimeException("error in vkQueueBindSparse", e); }
    }

    /// Invokes `vkCreateFence`.
    /// ```
    /// (int) VkResult vkCreateFence((struct VkDevice*) VkDevice device, const VkFenceCreateInfo* pCreateInfo, const VkAllocationCallbacks* pAllocator, VkFence* pFence);
    /// ```
    public static int vkCreateFence(@NonNull VkDevice device, @NonNull MemorySegment pCreateInfo, @NonNull MemorySegment pAllocator, @NonNull MemorySegment pFence) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkCreateFence)) throw new VKSymbolNotFoundError("Symbol not found: vkCreateFence");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCreateFence", device, pCreateInfo, pAllocator, pFence); }
        return (int) Handles.MH_vkCreateFence.invokeExact(device.capabilities().PFN_vkCreateFence, device.segment(), pCreateInfo, pAllocator, pFence); }
        catch (Throwable e) { throw new RuntimeException("error in vkCreateFence", e); }
    }

    /// Invokes `vkDestroyFence`.
    /// ```
    /// void vkDestroyFence((struct VkDevice*) VkDevice device, (uint64_t) VkFence fence, const VkAllocationCallbacks* pAllocator);
    /// ```
    public static void vkDestroyFence(@NonNull VkDevice device, long fence, @NonNull MemorySegment pAllocator) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkDestroyFence)) throw new VKSymbolNotFoundError("Symbol not found: vkDestroyFence");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkDestroyFence", device, fence, pAllocator); }
        Handles.MH_vkDestroyFence.invokeExact(device.capabilities().PFN_vkDestroyFence, device.segment(), fence, pAllocator); }
        catch (Throwable e) { throw new RuntimeException("error in vkDestroyFence", e); }
    }

    /// Invokes `vkResetFences`.
    /// ```
    /// (int) VkResult vkResetFences((struct VkDevice*) VkDevice device, uint32_t fenceCount, const VkFence* pFences);
    /// ```
    public static int vkResetFences(@NonNull VkDevice device, int fenceCount, @NonNull MemorySegment pFences) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkResetFences)) throw new VKSymbolNotFoundError("Symbol not found: vkResetFences");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkResetFences", device, fenceCount, pFences); }
        return (int) Handles.MH_vkResetFences.invokeExact(device.capabilities().PFN_vkResetFences, device.segment(), fenceCount, pFences); }
        catch (Throwable e) { throw new RuntimeException("error in vkResetFences", e); }
    }

    /// Invokes `vkGetFenceStatus`.
    /// ```
    /// (int) VkResult vkGetFenceStatus((struct VkDevice*) VkDevice device, (uint64_t) VkFence fence);
    /// ```
    public static int vkGetFenceStatus(@NonNull VkDevice device, long fence) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkGetFenceStatus)) throw new VKSymbolNotFoundError("Symbol not found: vkGetFenceStatus");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkGetFenceStatus", device, fence); }
        return (int) Handles.MH_vkGetFenceStatus.invokeExact(device.capabilities().PFN_vkGetFenceStatus, device.segment(), fence); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetFenceStatus", e); }
    }

    /// Invokes `vkWaitForFences`.
    /// ```
    /// (int) VkResult vkWaitForFences((struct VkDevice*) VkDevice device, uint32_t fenceCount, const VkFence* pFences, (uint32_t) VkBool32 waitAll, uint64_t timeout);
    /// ```
    public static int vkWaitForFences(@NonNull VkDevice device, int fenceCount, @NonNull MemorySegment pFences, int waitAll, long timeout) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkWaitForFences)) throw new VKSymbolNotFoundError("Symbol not found: vkWaitForFences");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkWaitForFences", device, fenceCount, pFences, waitAll, timeout); }
        return (int) Handles.MH_vkWaitForFences.invokeExact(device.capabilities().PFN_vkWaitForFences, device.segment(), fenceCount, pFences, waitAll, timeout); }
        catch (Throwable e) { throw new RuntimeException("error in vkWaitForFences", e); }
    }

    /// Invokes `vkCreateSemaphore`.
    /// ```
    /// (int) VkResult vkCreateSemaphore((struct VkDevice*) VkDevice device, const VkSemaphoreCreateInfo* pCreateInfo, const VkAllocationCallbacks* pAllocator, VkSemaphore* pSemaphore);
    /// ```
    public static int vkCreateSemaphore(@NonNull VkDevice device, @NonNull MemorySegment pCreateInfo, @NonNull MemorySegment pAllocator, @NonNull MemorySegment pSemaphore) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkCreateSemaphore)) throw new VKSymbolNotFoundError("Symbol not found: vkCreateSemaphore");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCreateSemaphore", device, pCreateInfo, pAllocator, pSemaphore); }
        return (int) Handles.MH_vkCreateSemaphore.invokeExact(device.capabilities().PFN_vkCreateSemaphore, device.segment(), pCreateInfo, pAllocator, pSemaphore); }
        catch (Throwable e) { throw new RuntimeException("error in vkCreateSemaphore", e); }
    }

    /// Invokes `vkDestroySemaphore`.
    /// ```
    /// void vkDestroySemaphore((struct VkDevice*) VkDevice device, (uint64_t) VkSemaphore semaphore, const VkAllocationCallbacks* pAllocator);
    /// ```
    public static void vkDestroySemaphore(@NonNull VkDevice device, long semaphore, @NonNull MemorySegment pAllocator) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkDestroySemaphore)) throw new VKSymbolNotFoundError("Symbol not found: vkDestroySemaphore");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkDestroySemaphore", device, semaphore, pAllocator); }
        Handles.MH_vkDestroySemaphore.invokeExact(device.capabilities().PFN_vkDestroySemaphore, device.segment(), semaphore, pAllocator); }
        catch (Throwable e) { throw new RuntimeException("error in vkDestroySemaphore", e); }
    }

    /// Invokes `vkCreateEvent`.
    /// ```
    /// (int) VkResult vkCreateEvent((struct VkDevice*) VkDevice device, const VkEventCreateInfo* pCreateInfo, const VkAllocationCallbacks* pAllocator, VkEvent* pEvent);
    /// ```
    public static int vkCreateEvent(@NonNull VkDevice device, @NonNull MemorySegment pCreateInfo, @NonNull MemorySegment pAllocator, @NonNull MemorySegment pEvent) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkCreateEvent)) throw new VKSymbolNotFoundError("Symbol not found: vkCreateEvent");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCreateEvent", device, pCreateInfo, pAllocator, pEvent); }
        return (int) Handles.MH_vkCreateEvent.invokeExact(device.capabilities().PFN_vkCreateEvent, device.segment(), pCreateInfo, pAllocator, pEvent); }
        catch (Throwable e) { throw new RuntimeException("error in vkCreateEvent", e); }
    }

    /// Invokes `vkDestroyEvent`.
    /// ```
    /// void vkDestroyEvent((struct VkDevice*) VkDevice device, (uint64_t) VkEvent event, const VkAllocationCallbacks* pAllocator);
    /// ```
    public static void vkDestroyEvent(@NonNull VkDevice device, long event, @NonNull MemorySegment pAllocator) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkDestroyEvent)) throw new VKSymbolNotFoundError("Symbol not found: vkDestroyEvent");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkDestroyEvent", device, event, pAllocator); }
        Handles.MH_vkDestroyEvent.invokeExact(device.capabilities().PFN_vkDestroyEvent, device.segment(), event, pAllocator); }
        catch (Throwable e) { throw new RuntimeException("error in vkDestroyEvent", e); }
    }

    /// Invokes `vkGetEventStatus`.
    /// ```
    /// (int) VkResult vkGetEventStatus((struct VkDevice*) VkDevice device, (uint64_t) VkEvent event);
    /// ```
    public static int vkGetEventStatus(@NonNull VkDevice device, long event) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkGetEventStatus)) throw new VKSymbolNotFoundError("Symbol not found: vkGetEventStatus");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkGetEventStatus", device, event); }
        return (int) Handles.MH_vkGetEventStatus.invokeExact(device.capabilities().PFN_vkGetEventStatus, device.segment(), event); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetEventStatus", e); }
    }

    /// Invokes `vkSetEvent`.
    /// ```
    /// (int) VkResult vkSetEvent((struct VkDevice*) VkDevice device, (uint64_t) VkEvent event);
    /// ```
    public static int vkSetEvent(@NonNull VkDevice device, long event) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkSetEvent)) throw new VKSymbolNotFoundError("Symbol not found: vkSetEvent");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkSetEvent", device, event); }
        return (int) Handles.MH_vkSetEvent.invokeExact(device.capabilities().PFN_vkSetEvent, device.segment(), event); }
        catch (Throwable e) { throw new RuntimeException("error in vkSetEvent", e); }
    }

    /// Invokes `vkResetEvent`.
    /// ```
    /// (int) VkResult vkResetEvent((struct VkDevice*) VkDevice device, (uint64_t) VkEvent event);
    /// ```
    public static int vkResetEvent(@NonNull VkDevice device, long event) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkResetEvent)) throw new VKSymbolNotFoundError("Symbol not found: vkResetEvent");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkResetEvent", device, event); }
        return (int) Handles.MH_vkResetEvent.invokeExact(device.capabilities().PFN_vkResetEvent, device.segment(), event); }
        catch (Throwable e) { throw new RuntimeException("error in vkResetEvent", e); }
    }

    /// Invokes `vkCreateQueryPool`.
    /// ```
    /// (int) VkResult vkCreateQueryPool((struct VkDevice*) VkDevice device, const VkQueryPoolCreateInfo* pCreateInfo, const VkAllocationCallbacks* pAllocator, VkQueryPool* pQueryPool);
    /// ```
    public static int vkCreateQueryPool(@NonNull VkDevice device, @NonNull MemorySegment pCreateInfo, @NonNull MemorySegment pAllocator, @NonNull MemorySegment pQueryPool) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkCreateQueryPool)) throw new VKSymbolNotFoundError("Symbol not found: vkCreateQueryPool");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCreateQueryPool", device, pCreateInfo, pAllocator, pQueryPool); }
        return (int) Handles.MH_vkCreateQueryPool.invokeExact(device.capabilities().PFN_vkCreateQueryPool, device.segment(), pCreateInfo, pAllocator, pQueryPool); }
        catch (Throwable e) { throw new RuntimeException("error in vkCreateQueryPool", e); }
    }

    /// Invokes `vkDestroyQueryPool`.
    /// ```
    /// void vkDestroyQueryPool((struct VkDevice*) VkDevice device, (uint64_t) VkQueryPool queryPool, const VkAllocationCallbacks* pAllocator);
    /// ```
    public static void vkDestroyQueryPool(@NonNull VkDevice device, long queryPool, @NonNull MemorySegment pAllocator) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkDestroyQueryPool)) throw new VKSymbolNotFoundError("Symbol not found: vkDestroyQueryPool");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkDestroyQueryPool", device, queryPool, pAllocator); }
        Handles.MH_vkDestroyQueryPool.invokeExact(device.capabilities().PFN_vkDestroyQueryPool, device.segment(), queryPool, pAllocator); }
        catch (Throwable e) { throw new RuntimeException("error in vkDestroyQueryPool", e); }
    }

    /// Invokes `vkGetQueryPoolResults`.
    /// ```
    /// (int) VkResult vkGetQueryPoolResults((struct VkDevice*) VkDevice device, (uint64_t) VkQueryPool queryPool, uint32_t firstQuery, uint32_t queryCount, size_t dataSize, void* pData, (uint64_t) VkDeviceSize stride, ((uint32_t) VkFlags) VkQueryResultFlags flags);
    /// ```
    public static int vkGetQueryPoolResults(@NonNull VkDevice device, long queryPool, int firstQuery, int queryCount, long dataSize, @NonNull MemorySegment pData, long stride, int flags) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkGetQueryPoolResults)) throw new VKSymbolNotFoundError("Symbol not found: vkGetQueryPoolResults");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkGetQueryPoolResults", device, queryPool, firstQuery, queryCount, dataSize, pData, stride, flags); }
        return (int) Handles.MH_vkGetQueryPoolResults.invoke(device.capabilities().PFN_vkGetQueryPoolResults, device.segment(), queryPool, firstQuery, queryCount, MemoryUtil.narrowingLong(CanonicalTypes.SIZE_T, dataSize), pData, stride, flags); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetQueryPoolResults", e); }
    }

    /// Invokes `vkCreateBuffer`.
    /// ```
    /// (int) VkResult vkCreateBuffer((struct VkDevice*) VkDevice device, const VkBufferCreateInfo* pCreateInfo, const VkAllocationCallbacks* pAllocator, VkBuffer* pBuffer);
    /// ```
    public static int vkCreateBuffer(@NonNull VkDevice device, @NonNull MemorySegment pCreateInfo, @NonNull MemorySegment pAllocator, @NonNull MemorySegment pBuffer) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkCreateBuffer)) throw new VKSymbolNotFoundError("Symbol not found: vkCreateBuffer");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCreateBuffer", device, pCreateInfo, pAllocator, pBuffer); }
        return (int) Handles.MH_vkCreateBuffer.invokeExact(device.capabilities().PFN_vkCreateBuffer, device.segment(), pCreateInfo, pAllocator, pBuffer); }
        catch (Throwable e) { throw new RuntimeException("error in vkCreateBuffer", e); }
    }

    /// Invokes `vkDestroyBuffer`.
    /// ```
    /// void vkDestroyBuffer((struct VkDevice*) VkDevice device, (uint64_t) VkBuffer buffer, const VkAllocationCallbacks* pAllocator);
    /// ```
    public static void vkDestroyBuffer(@NonNull VkDevice device, long buffer, @NonNull MemorySegment pAllocator) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkDestroyBuffer)) throw new VKSymbolNotFoundError("Symbol not found: vkDestroyBuffer");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkDestroyBuffer", device, buffer, pAllocator); }
        Handles.MH_vkDestroyBuffer.invokeExact(device.capabilities().PFN_vkDestroyBuffer, device.segment(), buffer, pAllocator); }
        catch (Throwable e) { throw new RuntimeException("error in vkDestroyBuffer", e); }
    }

    /// Invokes `vkCreateBufferView`.
    /// ```
    /// (int) VkResult vkCreateBufferView((struct VkDevice*) VkDevice device, const VkBufferViewCreateInfo* pCreateInfo, const VkAllocationCallbacks* pAllocator, VkBufferView* pView);
    /// ```
    public static int vkCreateBufferView(@NonNull VkDevice device, @NonNull MemorySegment pCreateInfo, @NonNull MemorySegment pAllocator, @NonNull MemorySegment pView) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkCreateBufferView)) throw new VKSymbolNotFoundError("Symbol not found: vkCreateBufferView");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCreateBufferView", device, pCreateInfo, pAllocator, pView); }
        return (int) Handles.MH_vkCreateBufferView.invokeExact(device.capabilities().PFN_vkCreateBufferView, device.segment(), pCreateInfo, pAllocator, pView); }
        catch (Throwable e) { throw new RuntimeException("error in vkCreateBufferView", e); }
    }

    /// Invokes `vkDestroyBufferView`.
    /// ```
    /// void vkDestroyBufferView((struct VkDevice*) VkDevice device, (uint64_t) VkBufferView bufferView, const VkAllocationCallbacks* pAllocator);
    /// ```
    public static void vkDestroyBufferView(@NonNull VkDevice device, long bufferView, @NonNull MemorySegment pAllocator) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkDestroyBufferView)) throw new VKSymbolNotFoundError("Symbol not found: vkDestroyBufferView");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkDestroyBufferView", device, bufferView, pAllocator); }
        Handles.MH_vkDestroyBufferView.invokeExact(device.capabilities().PFN_vkDestroyBufferView, device.segment(), bufferView, pAllocator); }
        catch (Throwable e) { throw new RuntimeException("error in vkDestroyBufferView", e); }
    }

    /// Invokes `vkCreateImage`.
    /// ```
    /// (int) VkResult vkCreateImage((struct VkDevice*) VkDevice device, const VkImageCreateInfo* pCreateInfo, const VkAllocationCallbacks* pAllocator, VkImage* pImage);
    /// ```
    public static int vkCreateImage(@NonNull VkDevice device, @NonNull MemorySegment pCreateInfo, @NonNull MemorySegment pAllocator, @NonNull MemorySegment pImage) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkCreateImage)) throw new VKSymbolNotFoundError("Symbol not found: vkCreateImage");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCreateImage", device, pCreateInfo, pAllocator, pImage); }
        return (int) Handles.MH_vkCreateImage.invokeExact(device.capabilities().PFN_vkCreateImage, device.segment(), pCreateInfo, pAllocator, pImage); }
        catch (Throwable e) { throw new RuntimeException("error in vkCreateImage", e); }
    }

    /// Invokes `vkDestroyImage`.
    /// ```
    /// void vkDestroyImage((struct VkDevice*) VkDevice device, (uint64_t) VkImage image, const VkAllocationCallbacks* pAllocator);
    /// ```
    public static void vkDestroyImage(@NonNull VkDevice device, long image, @NonNull MemorySegment pAllocator) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkDestroyImage)) throw new VKSymbolNotFoundError("Symbol not found: vkDestroyImage");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkDestroyImage", device, image, pAllocator); }
        Handles.MH_vkDestroyImage.invokeExact(device.capabilities().PFN_vkDestroyImage, device.segment(), image, pAllocator); }
        catch (Throwable e) { throw new RuntimeException("error in vkDestroyImage", e); }
    }

    /// Invokes `vkGetImageSubresourceLayout`.
    /// ```
    /// void vkGetImageSubresourceLayout((struct VkDevice*) VkDevice device, (uint64_t) VkImage image, const VkImageSubresource* pSubresource, VkSubresourceLayout* pLayout);
    /// ```
    public static void vkGetImageSubresourceLayout(@NonNull VkDevice device, long image, @NonNull MemorySegment pSubresource, @NonNull MemorySegment pLayout) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkGetImageSubresourceLayout)) throw new VKSymbolNotFoundError("Symbol not found: vkGetImageSubresourceLayout");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkGetImageSubresourceLayout", device, image, pSubresource, pLayout); }
        Handles.MH_vkGetImageSubresourceLayout.invokeExact(device.capabilities().PFN_vkGetImageSubresourceLayout, device.segment(), image, pSubresource, pLayout); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetImageSubresourceLayout", e); }
    }

    /// Invokes `vkCreateImageView`.
    /// ```
    /// (int) VkResult vkCreateImageView((struct VkDevice*) VkDevice device, const VkImageViewCreateInfo* pCreateInfo, const VkAllocationCallbacks* pAllocator, VkImageView* pView);
    /// ```
    public static int vkCreateImageView(@NonNull VkDevice device, @NonNull MemorySegment pCreateInfo, @NonNull MemorySegment pAllocator, @NonNull MemorySegment pView) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkCreateImageView)) throw new VKSymbolNotFoundError("Symbol not found: vkCreateImageView");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCreateImageView", device, pCreateInfo, pAllocator, pView); }
        return (int) Handles.MH_vkCreateImageView.invokeExact(device.capabilities().PFN_vkCreateImageView, device.segment(), pCreateInfo, pAllocator, pView); }
        catch (Throwable e) { throw new RuntimeException("error in vkCreateImageView", e); }
    }

    /// Invokes `vkDestroyImageView`.
    /// ```
    /// void vkDestroyImageView((struct VkDevice*) VkDevice device, (uint64_t) VkImageView imageView, const VkAllocationCallbacks* pAllocator);
    /// ```
    public static void vkDestroyImageView(@NonNull VkDevice device, long imageView, @NonNull MemorySegment pAllocator) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkDestroyImageView)) throw new VKSymbolNotFoundError("Symbol not found: vkDestroyImageView");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkDestroyImageView", device, imageView, pAllocator); }
        Handles.MH_vkDestroyImageView.invokeExact(device.capabilities().PFN_vkDestroyImageView, device.segment(), imageView, pAllocator); }
        catch (Throwable e) { throw new RuntimeException("error in vkDestroyImageView", e); }
    }

    /// Invokes `vkCreateShaderModule`.
    /// ```
    /// (int) VkResult vkCreateShaderModule((struct VkDevice*) VkDevice device, const VkShaderModuleCreateInfo* pCreateInfo, const VkAllocationCallbacks* pAllocator, VkShaderModule* pShaderModule);
    /// ```
    public static int vkCreateShaderModule(@NonNull VkDevice device, @NonNull MemorySegment pCreateInfo, @NonNull MemorySegment pAllocator, @NonNull MemorySegment pShaderModule) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkCreateShaderModule)) throw new VKSymbolNotFoundError("Symbol not found: vkCreateShaderModule");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCreateShaderModule", device, pCreateInfo, pAllocator, pShaderModule); }
        return (int) Handles.MH_vkCreateShaderModule.invokeExact(device.capabilities().PFN_vkCreateShaderModule, device.segment(), pCreateInfo, pAllocator, pShaderModule); }
        catch (Throwable e) { throw new RuntimeException("error in vkCreateShaderModule", e); }
    }

    /// Invokes `vkDestroyShaderModule`.
    /// ```
    /// void vkDestroyShaderModule((struct VkDevice*) VkDevice device, (uint64_t) VkShaderModule shaderModule, const VkAllocationCallbacks* pAllocator);
    /// ```
    public static void vkDestroyShaderModule(@NonNull VkDevice device, long shaderModule, @NonNull MemorySegment pAllocator) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkDestroyShaderModule)) throw new VKSymbolNotFoundError("Symbol not found: vkDestroyShaderModule");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkDestroyShaderModule", device, shaderModule, pAllocator); }
        Handles.MH_vkDestroyShaderModule.invokeExact(device.capabilities().PFN_vkDestroyShaderModule, device.segment(), shaderModule, pAllocator); }
        catch (Throwable e) { throw new RuntimeException("error in vkDestroyShaderModule", e); }
    }

    /// Invokes `vkCreatePipelineCache`.
    /// ```
    /// (int) VkResult vkCreatePipelineCache((struct VkDevice*) VkDevice device, const VkPipelineCacheCreateInfo* pCreateInfo, const VkAllocationCallbacks* pAllocator, VkPipelineCache* pPipelineCache);
    /// ```
    public static int vkCreatePipelineCache(@NonNull VkDevice device, @NonNull MemorySegment pCreateInfo, @NonNull MemorySegment pAllocator, @NonNull MemorySegment pPipelineCache) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkCreatePipelineCache)) throw new VKSymbolNotFoundError("Symbol not found: vkCreatePipelineCache");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCreatePipelineCache", device, pCreateInfo, pAllocator, pPipelineCache); }
        return (int) Handles.MH_vkCreatePipelineCache.invokeExact(device.capabilities().PFN_vkCreatePipelineCache, device.segment(), pCreateInfo, pAllocator, pPipelineCache); }
        catch (Throwable e) { throw new RuntimeException("error in vkCreatePipelineCache", e); }
    }

    /// Invokes `vkDestroyPipelineCache`.
    /// ```
    /// void vkDestroyPipelineCache((struct VkDevice*) VkDevice device, (uint64_t) VkPipelineCache pipelineCache, const VkAllocationCallbacks* pAllocator);
    /// ```
    public static void vkDestroyPipelineCache(@NonNull VkDevice device, long pipelineCache, @NonNull MemorySegment pAllocator) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkDestroyPipelineCache)) throw new VKSymbolNotFoundError("Symbol not found: vkDestroyPipelineCache");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkDestroyPipelineCache", device, pipelineCache, pAllocator); }
        Handles.MH_vkDestroyPipelineCache.invokeExact(device.capabilities().PFN_vkDestroyPipelineCache, device.segment(), pipelineCache, pAllocator); }
        catch (Throwable e) { throw new RuntimeException("error in vkDestroyPipelineCache", e); }
    }

    /// Invokes `vkGetPipelineCacheData`.
    /// ```
    /// (int) VkResult vkGetPipelineCacheData((struct VkDevice*) VkDevice device, (uint64_t) VkPipelineCache pipelineCache, size_t* pDataSize, void* pData);
    /// ```
    public static int vkGetPipelineCacheData(@NonNull VkDevice device, long pipelineCache, @NonNull MemorySegment pDataSize, @NonNull MemorySegment pData) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkGetPipelineCacheData)) throw new VKSymbolNotFoundError("Symbol not found: vkGetPipelineCacheData");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkGetPipelineCacheData", device, pipelineCache, pDataSize, pData); }
        return (int) Handles.MH_vkGetPipelineCacheData.invokeExact(device.capabilities().PFN_vkGetPipelineCacheData, device.segment(), pipelineCache, pDataSize, pData); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetPipelineCacheData", e); }
    }

    /// Invokes `vkMergePipelineCaches`.
    /// ```
    /// (int) VkResult vkMergePipelineCaches((struct VkDevice*) VkDevice device, (uint64_t) VkPipelineCache dstCache, uint32_t srcCacheCount, const VkPipelineCache* pSrcCaches);
    /// ```
    public static int vkMergePipelineCaches(@NonNull VkDevice device, long dstCache, int srcCacheCount, @NonNull MemorySegment pSrcCaches) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkMergePipelineCaches)) throw new VKSymbolNotFoundError("Symbol not found: vkMergePipelineCaches");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkMergePipelineCaches", device, dstCache, srcCacheCount, pSrcCaches); }
        return (int) Handles.MH_vkMergePipelineCaches.invokeExact(device.capabilities().PFN_vkMergePipelineCaches, device.segment(), dstCache, srcCacheCount, pSrcCaches); }
        catch (Throwable e) { throw new RuntimeException("error in vkMergePipelineCaches", e); }
    }

    /// Invokes `vkCreateGraphicsPipelines`.
    /// ```
    /// (int) VkResult vkCreateGraphicsPipelines((struct VkDevice*) VkDevice device, (uint64_t) VkPipelineCache pipelineCache, uint32_t createInfoCount, const VkGraphicsPipelineCreateInfo* pCreateInfos, const VkAllocationCallbacks* pAllocator, VkPipeline* pPipelines);
    /// ```
    public static int vkCreateGraphicsPipelines(@NonNull VkDevice device, long pipelineCache, int createInfoCount, @NonNull MemorySegment pCreateInfos, @NonNull MemorySegment pAllocator, @NonNull MemorySegment pPipelines) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkCreateGraphicsPipelines)) throw new VKSymbolNotFoundError("Symbol not found: vkCreateGraphicsPipelines");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCreateGraphicsPipelines", device, pipelineCache, createInfoCount, pCreateInfos, pAllocator, pPipelines); }
        return (int) Handles.MH_vkCreateGraphicsPipelines.invokeExact(device.capabilities().PFN_vkCreateGraphicsPipelines, device.segment(), pipelineCache, createInfoCount, pCreateInfos, pAllocator, pPipelines); }
        catch (Throwable e) { throw new RuntimeException("error in vkCreateGraphicsPipelines", e); }
    }

    /// Invokes `vkCreateComputePipelines`.
    /// ```
    /// (int) VkResult vkCreateComputePipelines((struct VkDevice*) VkDevice device, (uint64_t) VkPipelineCache pipelineCache, uint32_t createInfoCount, const VkComputePipelineCreateInfo* pCreateInfos, const VkAllocationCallbacks* pAllocator, VkPipeline* pPipelines);
    /// ```
    public static int vkCreateComputePipelines(@NonNull VkDevice device, long pipelineCache, int createInfoCount, @NonNull MemorySegment pCreateInfos, @NonNull MemorySegment pAllocator, @NonNull MemorySegment pPipelines) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkCreateComputePipelines)) throw new VKSymbolNotFoundError("Symbol not found: vkCreateComputePipelines");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCreateComputePipelines", device, pipelineCache, createInfoCount, pCreateInfos, pAllocator, pPipelines); }
        return (int) Handles.MH_vkCreateComputePipelines.invokeExact(device.capabilities().PFN_vkCreateComputePipelines, device.segment(), pipelineCache, createInfoCount, pCreateInfos, pAllocator, pPipelines); }
        catch (Throwable e) { throw new RuntimeException("error in vkCreateComputePipelines", e); }
    }

    /// Invokes `vkDestroyPipeline`.
    /// ```
    /// void vkDestroyPipeline((struct VkDevice*) VkDevice device, (uint64_t) VkPipeline pipeline, const VkAllocationCallbacks* pAllocator);
    /// ```
    public static void vkDestroyPipeline(@NonNull VkDevice device, long pipeline, @NonNull MemorySegment pAllocator) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkDestroyPipeline)) throw new VKSymbolNotFoundError("Symbol not found: vkDestroyPipeline");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkDestroyPipeline", device, pipeline, pAllocator); }
        Handles.MH_vkDestroyPipeline.invokeExact(device.capabilities().PFN_vkDestroyPipeline, device.segment(), pipeline, pAllocator); }
        catch (Throwable e) { throw new RuntimeException("error in vkDestroyPipeline", e); }
    }

    /// Invokes `vkCreatePipelineLayout`.
    /// ```
    /// (int) VkResult vkCreatePipelineLayout((struct VkDevice*) VkDevice device, const VkPipelineLayoutCreateInfo* pCreateInfo, const VkAllocationCallbacks* pAllocator, VkPipelineLayout* pPipelineLayout);
    /// ```
    public static int vkCreatePipelineLayout(@NonNull VkDevice device, @NonNull MemorySegment pCreateInfo, @NonNull MemorySegment pAllocator, @NonNull MemorySegment pPipelineLayout) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkCreatePipelineLayout)) throw new VKSymbolNotFoundError("Symbol not found: vkCreatePipelineLayout");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCreatePipelineLayout", device, pCreateInfo, pAllocator, pPipelineLayout); }
        return (int) Handles.MH_vkCreatePipelineLayout.invokeExact(device.capabilities().PFN_vkCreatePipelineLayout, device.segment(), pCreateInfo, pAllocator, pPipelineLayout); }
        catch (Throwable e) { throw new RuntimeException("error in vkCreatePipelineLayout", e); }
    }

    /// Invokes `vkDestroyPipelineLayout`.
    /// ```
    /// void vkDestroyPipelineLayout((struct VkDevice*) VkDevice device, (uint64_t) VkPipelineLayout pipelineLayout, const VkAllocationCallbacks* pAllocator);
    /// ```
    public static void vkDestroyPipelineLayout(@NonNull VkDevice device, long pipelineLayout, @NonNull MemorySegment pAllocator) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkDestroyPipelineLayout)) throw new VKSymbolNotFoundError("Symbol not found: vkDestroyPipelineLayout");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkDestroyPipelineLayout", device, pipelineLayout, pAllocator); }
        Handles.MH_vkDestroyPipelineLayout.invokeExact(device.capabilities().PFN_vkDestroyPipelineLayout, device.segment(), pipelineLayout, pAllocator); }
        catch (Throwable e) { throw new RuntimeException("error in vkDestroyPipelineLayout", e); }
    }

    /// Invokes `vkCreateSampler`.
    /// ```
    /// (int) VkResult vkCreateSampler((struct VkDevice*) VkDevice device, const VkSamplerCreateInfo* pCreateInfo, const VkAllocationCallbacks* pAllocator, VkSampler* pSampler);
    /// ```
    public static int vkCreateSampler(@NonNull VkDevice device, @NonNull MemorySegment pCreateInfo, @NonNull MemorySegment pAllocator, @NonNull MemorySegment pSampler) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkCreateSampler)) throw new VKSymbolNotFoundError("Symbol not found: vkCreateSampler");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCreateSampler", device, pCreateInfo, pAllocator, pSampler); }
        return (int) Handles.MH_vkCreateSampler.invokeExact(device.capabilities().PFN_vkCreateSampler, device.segment(), pCreateInfo, pAllocator, pSampler); }
        catch (Throwable e) { throw new RuntimeException("error in vkCreateSampler", e); }
    }

    /// Invokes `vkDestroySampler`.
    /// ```
    /// void vkDestroySampler((struct VkDevice*) VkDevice device, (uint64_t) VkSampler sampler, const VkAllocationCallbacks* pAllocator);
    /// ```
    public static void vkDestroySampler(@NonNull VkDevice device, long sampler, @NonNull MemorySegment pAllocator) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkDestroySampler)) throw new VKSymbolNotFoundError("Symbol not found: vkDestroySampler");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkDestroySampler", device, sampler, pAllocator); }
        Handles.MH_vkDestroySampler.invokeExact(device.capabilities().PFN_vkDestroySampler, device.segment(), sampler, pAllocator); }
        catch (Throwable e) { throw new RuntimeException("error in vkDestroySampler", e); }
    }

    /// Invokes `vkCreateDescriptorSetLayout`.
    /// ```
    /// (int) VkResult vkCreateDescriptorSetLayout((struct VkDevice*) VkDevice device, const VkDescriptorSetLayoutCreateInfo* pCreateInfo, const VkAllocationCallbacks* pAllocator, VkDescriptorSetLayout* pSetLayout);
    /// ```
    public static int vkCreateDescriptorSetLayout(@NonNull VkDevice device, @NonNull MemorySegment pCreateInfo, @NonNull MemorySegment pAllocator, @NonNull MemorySegment pSetLayout) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkCreateDescriptorSetLayout)) throw new VKSymbolNotFoundError("Symbol not found: vkCreateDescriptorSetLayout");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCreateDescriptorSetLayout", device, pCreateInfo, pAllocator, pSetLayout); }
        return (int) Handles.MH_vkCreateDescriptorSetLayout.invokeExact(device.capabilities().PFN_vkCreateDescriptorSetLayout, device.segment(), pCreateInfo, pAllocator, pSetLayout); }
        catch (Throwable e) { throw new RuntimeException("error in vkCreateDescriptorSetLayout", e); }
    }

    /// Invokes `vkDestroyDescriptorSetLayout`.
    /// ```
    /// void vkDestroyDescriptorSetLayout((struct VkDevice*) VkDevice device, (uint64_t) VkDescriptorSetLayout descriptorSetLayout, const VkAllocationCallbacks* pAllocator);
    /// ```
    public static void vkDestroyDescriptorSetLayout(@NonNull VkDevice device, long descriptorSetLayout, @NonNull MemorySegment pAllocator) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkDestroyDescriptorSetLayout)) throw new VKSymbolNotFoundError("Symbol not found: vkDestroyDescriptorSetLayout");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkDestroyDescriptorSetLayout", device, descriptorSetLayout, pAllocator); }
        Handles.MH_vkDestroyDescriptorSetLayout.invokeExact(device.capabilities().PFN_vkDestroyDescriptorSetLayout, device.segment(), descriptorSetLayout, pAllocator); }
        catch (Throwable e) { throw new RuntimeException("error in vkDestroyDescriptorSetLayout", e); }
    }

    /// Invokes `vkCreateDescriptorPool`.
    /// ```
    /// (int) VkResult vkCreateDescriptorPool((struct VkDevice*) VkDevice device, const VkDescriptorPoolCreateInfo* pCreateInfo, const VkAllocationCallbacks* pAllocator, VkDescriptorPool* pDescriptorPool);
    /// ```
    public static int vkCreateDescriptorPool(@NonNull VkDevice device, @NonNull MemorySegment pCreateInfo, @NonNull MemorySegment pAllocator, @NonNull MemorySegment pDescriptorPool) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkCreateDescriptorPool)) throw new VKSymbolNotFoundError("Symbol not found: vkCreateDescriptorPool");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCreateDescriptorPool", device, pCreateInfo, pAllocator, pDescriptorPool); }
        return (int) Handles.MH_vkCreateDescriptorPool.invokeExact(device.capabilities().PFN_vkCreateDescriptorPool, device.segment(), pCreateInfo, pAllocator, pDescriptorPool); }
        catch (Throwable e) { throw new RuntimeException("error in vkCreateDescriptorPool", e); }
    }

    /// Invokes `vkDestroyDescriptorPool`.
    /// ```
    /// void vkDestroyDescriptorPool((struct VkDevice*) VkDevice device, (uint64_t) VkDescriptorPool descriptorPool, const VkAllocationCallbacks* pAllocator);
    /// ```
    public static void vkDestroyDescriptorPool(@NonNull VkDevice device, long descriptorPool, @NonNull MemorySegment pAllocator) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkDestroyDescriptorPool)) throw new VKSymbolNotFoundError("Symbol not found: vkDestroyDescriptorPool");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkDestroyDescriptorPool", device, descriptorPool, pAllocator); }
        Handles.MH_vkDestroyDescriptorPool.invokeExact(device.capabilities().PFN_vkDestroyDescriptorPool, device.segment(), descriptorPool, pAllocator); }
        catch (Throwable e) { throw new RuntimeException("error in vkDestroyDescriptorPool", e); }
    }

    /// Invokes `vkResetDescriptorPool`.
    /// ```
    /// (int) VkResult vkResetDescriptorPool((struct VkDevice*) VkDevice device, (uint64_t) VkDescriptorPool descriptorPool, ((uint32_t) VkFlags) VkDescriptorPoolResetFlags flags);
    /// ```
    public static int vkResetDescriptorPool(@NonNull VkDevice device, long descriptorPool, int flags) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkResetDescriptorPool)) throw new VKSymbolNotFoundError("Symbol not found: vkResetDescriptorPool");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkResetDescriptorPool", device, descriptorPool, flags); }
        return (int) Handles.MH_vkResetDescriptorPool.invokeExact(device.capabilities().PFN_vkResetDescriptorPool, device.segment(), descriptorPool, flags); }
        catch (Throwable e) { throw new RuntimeException("error in vkResetDescriptorPool", e); }
    }

    /// Invokes `vkAllocateDescriptorSets`.
    /// ```
    /// (int) VkResult vkAllocateDescriptorSets((struct VkDevice*) VkDevice device, const VkDescriptorSetAllocateInfo* pAllocateInfo, VkDescriptorSet* pDescriptorSets);
    /// ```
    public static int vkAllocateDescriptorSets(@NonNull VkDevice device, @NonNull MemorySegment pAllocateInfo, @NonNull MemorySegment pDescriptorSets) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkAllocateDescriptorSets)) throw new VKSymbolNotFoundError("Symbol not found: vkAllocateDescriptorSets");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkAllocateDescriptorSets", device, pAllocateInfo, pDescriptorSets); }
        return (int) Handles.MH_vkAllocateDescriptorSets.invokeExact(device.capabilities().PFN_vkAllocateDescriptorSets, device.segment(), pAllocateInfo, pDescriptorSets); }
        catch (Throwable e) { throw new RuntimeException("error in vkAllocateDescriptorSets", e); }
    }

    /// Invokes `vkFreeDescriptorSets`.
    /// ```
    /// (int) VkResult vkFreeDescriptorSets((struct VkDevice*) VkDevice device, (uint64_t) VkDescriptorPool descriptorPool, uint32_t descriptorSetCount, const VkDescriptorSet* pDescriptorSets);
    /// ```
    public static int vkFreeDescriptorSets(@NonNull VkDevice device, long descriptorPool, int descriptorSetCount, @NonNull MemorySegment pDescriptorSets) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkFreeDescriptorSets)) throw new VKSymbolNotFoundError("Symbol not found: vkFreeDescriptorSets");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkFreeDescriptorSets", device, descriptorPool, descriptorSetCount, pDescriptorSets); }
        return (int) Handles.MH_vkFreeDescriptorSets.invokeExact(device.capabilities().PFN_vkFreeDescriptorSets, device.segment(), descriptorPool, descriptorSetCount, pDescriptorSets); }
        catch (Throwable e) { throw new RuntimeException("error in vkFreeDescriptorSets", e); }
    }

    /// Invokes `vkUpdateDescriptorSets`.
    /// ```
    /// void vkUpdateDescriptorSets((struct VkDevice*) VkDevice device, uint32_t descriptorWriteCount, const VkWriteDescriptorSet* pDescriptorWrites, uint32_t descriptorCopyCount, const VkCopyDescriptorSet* pDescriptorCopies);
    /// ```
    public static void vkUpdateDescriptorSets(@NonNull VkDevice device, int descriptorWriteCount, @NonNull MemorySegment pDescriptorWrites, int descriptorCopyCount, @NonNull MemorySegment pDescriptorCopies) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkUpdateDescriptorSets)) throw new VKSymbolNotFoundError("Symbol not found: vkUpdateDescriptorSets");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkUpdateDescriptorSets", device, descriptorWriteCount, pDescriptorWrites, descriptorCopyCount, pDescriptorCopies); }
        Handles.MH_vkUpdateDescriptorSets.invokeExact(device.capabilities().PFN_vkUpdateDescriptorSets, device.segment(), descriptorWriteCount, pDescriptorWrites, descriptorCopyCount, pDescriptorCopies); }
        catch (Throwable e) { throw new RuntimeException("error in vkUpdateDescriptorSets", e); }
    }

    /// Invokes `vkCreateFramebuffer`.
    /// ```
    /// (int) VkResult vkCreateFramebuffer((struct VkDevice*) VkDevice device, const VkFramebufferCreateInfo* pCreateInfo, const VkAllocationCallbacks* pAllocator, VkFramebuffer* pFramebuffer);
    /// ```
    public static int vkCreateFramebuffer(@NonNull VkDevice device, @NonNull MemorySegment pCreateInfo, @NonNull MemorySegment pAllocator, @NonNull MemorySegment pFramebuffer) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkCreateFramebuffer)) throw new VKSymbolNotFoundError("Symbol not found: vkCreateFramebuffer");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCreateFramebuffer", device, pCreateInfo, pAllocator, pFramebuffer); }
        return (int) Handles.MH_vkCreateFramebuffer.invokeExact(device.capabilities().PFN_vkCreateFramebuffer, device.segment(), pCreateInfo, pAllocator, pFramebuffer); }
        catch (Throwable e) { throw new RuntimeException("error in vkCreateFramebuffer", e); }
    }

    /// Invokes `vkDestroyFramebuffer`.
    /// ```
    /// void vkDestroyFramebuffer((struct VkDevice*) VkDevice device, (uint64_t) VkFramebuffer framebuffer, const VkAllocationCallbacks* pAllocator);
    /// ```
    public static void vkDestroyFramebuffer(@NonNull VkDevice device, long framebuffer, @NonNull MemorySegment pAllocator) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkDestroyFramebuffer)) throw new VKSymbolNotFoundError("Symbol not found: vkDestroyFramebuffer");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkDestroyFramebuffer", device, framebuffer, pAllocator); }
        Handles.MH_vkDestroyFramebuffer.invokeExact(device.capabilities().PFN_vkDestroyFramebuffer, device.segment(), framebuffer, pAllocator); }
        catch (Throwable e) { throw new RuntimeException("error in vkDestroyFramebuffer", e); }
    }

    /// Invokes `vkCreateRenderPass`.
    /// ```
    /// (int) VkResult vkCreateRenderPass((struct VkDevice*) VkDevice device, const VkRenderPassCreateInfo* pCreateInfo, const VkAllocationCallbacks* pAllocator, VkRenderPass* pRenderPass);
    /// ```
    public static int vkCreateRenderPass(@NonNull VkDevice device, @NonNull MemorySegment pCreateInfo, @NonNull MemorySegment pAllocator, @NonNull MemorySegment pRenderPass) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkCreateRenderPass)) throw new VKSymbolNotFoundError("Symbol not found: vkCreateRenderPass");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCreateRenderPass", device, pCreateInfo, pAllocator, pRenderPass); }
        return (int) Handles.MH_vkCreateRenderPass.invokeExact(device.capabilities().PFN_vkCreateRenderPass, device.segment(), pCreateInfo, pAllocator, pRenderPass); }
        catch (Throwable e) { throw new RuntimeException("error in vkCreateRenderPass", e); }
    }

    /// Invokes `vkDestroyRenderPass`.
    /// ```
    /// void vkDestroyRenderPass((struct VkDevice*) VkDevice device, (uint64_t) VkRenderPass renderPass, const VkAllocationCallbacks* pAllocator);
    /// ```
    public static void vkDestroyRenderPass(@NonNull VkDevice device, long renderPass, @NonNull MemorySegment pAllocator) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkDestroyRenderPass)) throw new VKSymbolNotFoundError("Symbol not found: vkDestroyRenderPass");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkDestroyRenderPass", device, renderPass, pAllocator); }
        Handles.MH_vkDestroyRenderPass.invokeExact(device.capabilities().PFN_vkDestroyRenderPass, device.segment(), renderPass, pAllocator); }
        catch (Throwable e) { throw new RuntimeException("error in vkDestroyRenderPass", e); }
    }

    /// Invokes `vkGetRenderAreaGranularity`.
    /// ```
    /// void vkGetRenderAreaGranularity((struct VkDevice*) VkDevice device, (uint64_t) VkRenderPass renderPass, VkExtent2D* pGranularity);
    /// ```
    public static void vkGetRenderAreaGranularity(@NonNull VkDevice device, long renderPass, @NonNull MemorySegment pGranularity) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkGetRenderAreaGranularity)) throw new VKSymbolNotFoundError("Symbol not found: vkGetRenderAreaGranularity");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkGetRenderAreaGranularity", device, renderPass, pGranularity); }
        Handles.MH_vkGetRenderAreaGranularity.invokeExact(device.capabilities().PFN_vkGetRenderAreaGranularity, device.segment(), renderPass, pGranularity); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetRenderAreaGranularity", e); }
    }

    /// Invokes `vkCreateCommandPool`.
    /// ```
    /// (int) VkResult vkCreateCommandPool((struct VkDevice*) VkDevice device, const VkCommandPoolCreateInfo* pCreateInfo, const VkAllocationCallbacks* pAllocator, VkCommandPool* pCommandPool);
    /// ```
    public static int vkCreateCommandPool(@NonNull VkDevice device, @NonNull MemorySegment pCreateInfo, @NonNull MemorySegment pAllocator, @NonNull MemorySegment pCommandPool) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkCreateCommandPool)) throw new VKSymbolNotFoundError("Symbol not found: vkCreateCommandPool");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCreateCommandPool", device, pCreateInfo, pAllocator, pCommandPool); }
        return (int) Handles.MH_vkCreateCommandPool.invokeExact(device.capabilities().PFN_vkCreateCommandPool, device.segment(), pCreateInfo, pAllocator, pCommandPool); }
        catch (Throwable e) { throw new RuntimeException("error in vkCreateCommandPool", e); }
    }

    /// Invokes `vkDestroyCommandPool`.
    /// ```
    /// void vkDestroyCommandPool((struct VkDevice*) VkDevice device, (uint64_t) VkCommandPool commandPool, const VkAllocationCallbacks* pAllocator);
    /// ```
    public static void vkDestroyCommandPool(@NonNull VkDevice device, long commandPool, @NonNull MemorySegment pAllocator) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkDestroyCommandPool)) throw new VKSymbolNotFoundError("Symbol not found: vkDestroyCommandPool");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkDestroyCommandPool", device, commandPool, pAllocator); }
        Handles.MH_vkDestroyCommandPool.invokeExact(device.capabilities().PFN_vkDestroyCommandPool, device.segment(), commandPool, pAllocator); }
        catch (Throwable e) { throw new RuntimeException("error in vkDestroyCommandPool", e); }
    }

    /// Invokes `vkResetCommandPool`.
    /// ```
    /// (int) VkResult vkResetCommandPool((struct VkDevice*) VkDevice device, (uint64_t) VkCommandPool commandPool, ((uint32_t) VkFlags) VkCommandPoolResetFlags flags);
    /// ```
    public static int vkResetCommandPool(@NonNull VkDevice device, long commandPool, int flags) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkResetCommandPool)) throw new VKSymbolNotFoundError("Symbol not found: vkResetCommandPool");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkResetCommandPool", device, commandPool, flags); }
        return (int) Handles.MH_vkResetCommandPool.invokeExact(device.capabilities().PFN_vkResetCommandPool, device.segment(), commandPool, flags); }
        catch (Throwable e) { throw new RuntimeException("error in vkResetCommandPool", e); }
    }

    /// Invokes `vkAllocateCommandBuffers`.
    /// ```
    /// (int) VkResult vkAllocateCommandBuffers((struct VkDevice*) VkDevice device, const VkCommandBufferAllocateInfo* pAllocateInfo, VkCommandBuffer* pCommandBuffers);
    /// ```
    public static int vkAllocateCommandBuffers(@NonNull VkDevice device, @NonNull MemorySegment pAllocateInfo, @NonNull MemorySegment pCommandBuffers) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkAllocateCommandBuffers)) throw new VKSymbolNotFoundError("Symbol not found: vkAllocateCommandBuffers");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkAllocateCommandBuffers", device, pAllocateInfo, pCommandBuffers); }
        return (int) Handles.MH_vkAllocateCommandBuffers.invokeExact(device.capabilities().PFN_vkAllocateCommandBuffers, device.segment(), pAllocateInfo, pCommandBuffers); }
        catch (Throwable e) { throw new RuntimeException("error in vkAllocateCommandBuffers", e); }
    }

    /// Invokes `vkFreeCommandBuffers`.
    /// ```
    /// void vkFreeCommandBuffers((struct VkDevice*) VkDevice device, (uint64_t) VkCommandPool commandPool, uint32_t commandBufferCount, const VkCommandBuffer* pCommandBuffers);
    /// ```
    public static void vkFreeCommandBuffers(@NonNull VkDevice device, long commandPool, int commandBufferCount, @NonNull MemorySegment pCommandBuffers) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkFreeCommandBuffers)) throw new VKSymbolNotFoundError("Symbol not found: vkFreeCommandBuffers");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkFreeCommandBuffers", device, commandPool, commandBufferCount, pCommandBuffers); }
        Handles.MH_vkFreeCommandBuffers.invokeExact(device.capabilities().PFN_vkFreeCommandBuffers, device.segment(), commandPool, commandBufferCount, pCommandBuffers); }
        catch (Throwable e) { throw new RuntimeException("error in vkFreeCommandBuffers", e); }
    }

    /// Invokes `vkBeginCommandBuffer`.
    /// ```
    /// (int) VkResult vkBeginCommandBuffer((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, const VkCommandBufferBeginInfo* pBeginInfo);
    /// ```
    public static int vkBeginCommandBuffer(@NonNull VkCommandBuffer commandBuffer, @NonNull MemorySegment pBeginInfo) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkBeginCommandBuffer)) throw new VKSymbolNotFoundError("Symbol not found: vkBeginCommandBuffer");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkBeginCommandBuffer", commandBuffer, pBeginInfo); }
        return (int) Handles.MH_vkBeginCommandBuffer.invokeExact(commandBuffer.capabilities().PFN_vkBeginCommandBuffer, commandBuffer.segment(), pBeginInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkBeginCommandBuffer", e); }
    }

    /// Invokes `vkEndCommandBuffer`.
    /// ```
    /// (int) VkResult vkEndCommandBuffer((struct VkCommandBuffer*) VkCommandBuffer commandBuffer);
    /// ```
    public static int vkEndCommandBuffer(@NonNull VkCommandBuffer commandBuffer) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkEndCommandBuffer)) throw new VKSymbolNotFoundError("Symbol not found: vkEndCommandBuffer");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkEndCommandBuffer", commandBuffer); }
        return (int) Handles.MH_vkEndCommandBuffer.invokeExact(commandBuffer.capabilities().PFN_vkEndCommandBuffer, commandBuffer.segment()); }
        catch (Throwable e) { throw new RuntimeException("error in vkEndCommandBuffer", e); }
    }

    /// Invokes `vkResetCommandBuffer`.
    /// ```
    /// (int) VkResult vkResetCommandBuffer((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, ((uint32_t) VkFlags) VkCommandBufferResetFlags flags);
    /// ```
    public static int vkResetCommandBuffer(@NonNull VkCommandBuffer commandBuffer, int flags) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkResetCommandBuffer)) throw new VKSymbolNotFoundError("Symbol not found: vkResetCommandBuffer");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkResetCommandBuffer", commandBuffer, flags); }
        return (int) Handles.MH_vkResetCommandBuffer.invokeExact(commandBuffer.capabilities().PFN_vkResetCommandBuffer, commandBuffer.segment(), flags); }
        catch (Throwable e) { throw new RuntimeException("error in vkResetCommandBuffer", e); }
    }

    /// Invokes `vkCmdBindPipeline`.
    /// ```
    /// void vkCmdBindPipeline((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, (int) VkPipelineBindPoint pipelineBindPoint, (uint64_t) VkPipeline pipeline);
    /// ```
    public static void vkCmdBindPipeline(@NonNull VkCommandBuffer commandBuffer, int pipelineBindPoint, long pipeline) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdBindPipeline)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdBindPipeline");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdBindPipeline", commandBuffer, pipelineBindPoint, pipeline); }
        Handles.MH_vkCmdBindPipeline.invokeExact(commandBuffer.capabilities().PFN_vkCmdBindPipeline, commandBuffer.segment(), pipelineBindPoint, pipeline); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdBindPipeline", e); }
    }

    /// Invokes `vkCmdSetViewport`.
    /// ```
    /// void vkCmdSetViewport((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, uint32_t firstViewport, uint32_t viewportCount, const VkViewport* pViewports);
    /// ```
    public static void vkCmdSetViewport(@NonNull VkCommandBuffer commandBuffer, int firstViewport, int viewportCount, @NonNull MemorySegment pViewports) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetViewport)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdSetViewport");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdSetViewport", commandBuffer, firstViewport, viewportCount, pViewports); }
        Handles.MH_vkCmdSetViewport.invokeExact(commandBuffer.capabilities().PFN_vkCmdSetViewport, commandBuffer.segment(), firstViewport, viewportCount, pViewports); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetViewport", e); }
    }

    /// Invokes `vkCmdSetScissor`.
    /// ```
    /// void vkCmdSetScissor((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, uint32_t firstScissor, uint32_t scissorCount, const VkRect2D* pScissors);
    /// ```
    public static void vkCmdSetScissor(@NonNull VkCommandBuffer commandBuffer, int firstScissor, int scissorCount, @NonNull MemorySegment pScissors) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetScissor)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdSetScissor");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdSetScissor", commandBuffer, firstScissor, scissorCount, pScissors); }
        Handles.MH_vkCmdSetScissor.invokeExact(commandBuffer.capabilities().PFN_vkCmdSetScissor, commandBuffer.segment(), firstScissor, scissorCount, pScissors); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetScissor", e); }
    }

    /// Invokes `vkCmdSetLineWidth`.
    /// ```
    /// void vkCmdSetLineWidth((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, float lineWidth);
    /// ```
    public static void vkCmdSetLineWidth(@NonNull VkCommandBuffer commandBuffer, float lineWidth) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetLineWidth)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdSetLineWidth");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdSetLineWidth", commandBuffer, lineWidth); }
        Handles.MH_vkCmdSetLineWidth.invokeExact(commandBuffer.capabilities().PFN_vkCmdSetLineWidth, commandBuffer.segment(), lineWidth); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetLineWidth", e); }
    }

    /// Invokes `vkCmdSetDepthBias`.
    /// ```
    /// void vkCmdSetDepthBias((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, float depthBiasConstantFactor, float depthBiasClamp, float depthBiasSlopeFactor);
    /// ```
    public static void vkCmdSetDepthBias(@NonNull VkCommandBuffer commandBuffer, float depthBiasConstantFactor, float depthBiasClamp, float depthBiasSlopeFactor) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetDepthBias)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdSetDepthBias");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdSetDepthBias", commandBuffer, depthBiasConstantFactor, depthBiasClamp, depthBiasSlopeFactor); }
        Handles.MH_vkCmdSetDepthBias.invokeExact(commandBuffer.capabilities().PFN_vkCmdSetDepthBias, commandBuffer.segment(), depthBiasConstantFactor, depthBiasClamp, depthBiasSlopeFactor); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetDepthBias", e); }
    }

    /// Invokes `vkCmdSetBlendConstants`.
    /// ```
    /// void vkCmdSetBlendConstants((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, float blendConstants[4]);
    /// ```
    public static void vkCmdSetBlendConstants(@NonNull VkCommandBuffer commandBuffer, @NonNull MemorySegment blendConstants) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetBlendConstants)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdSetBlendConstants");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdSetBlendConstants", commandBuffer, blendConstants); }
        Handles.MH_vkCmdSetBlendConstants.invokeExact(commandBuffer.capabilities().PFN_vkCmdSetBlendConstants, commandBuffer.segment(), blendConstants); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetBlendConstants", e); }
    }

    /// Invokes `vkCmdSetDepthBounds`.
    /// ```
    /// void vkCmdSetDepthBounds((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, float minDepthBounds, float maxDepthBounds);
    /// ```
    public static void vkCmdSetDepthBounds(@NonNull VkCommandBuffer commandBuffer, float minDepthBounds, float maxDepthBounds) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetDepthBounds)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdSetDepthBounds");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdSetDepthBounds", commandBuffer, minDepthBounds, maxDepthBounds); }
        Handles.MH_vkCmdSetDepthBounds.invokeExact(commandBuffer.capabilities().PFN_vkCmdSetDepthBounds, commandBuffer.segment(), minDepthBounds, maxDepthBounds); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetDepthBounds", e); }
    }

    /// Invokes `vkCmdSetStencilCompareMask`.
    /// ```
    /// void vkCmdSetStencilCompareMask((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, ((uint32_t) VkFlags) VkStencilFaceFlags faceMask, uint32_t compareMask);
    /// ```
    public static void vkCmdSetStencilCompareMask(@NonNull VkCommandBuffer commandBuffer, int faceMask, int compareMask) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetStencilCompareMask)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdSetStencilCompareMask");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdSetStencilCompareMask", commandBuffer, faceMask, compareMask); }
        Handles.MH_vkCmdSetStencilCompareMask.invokeExact(commandBuffer.capabilities().PFN_vkCmdSetStencilCompareMask, commandBuffer.segment(), faceMask, compareMask); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetStencilCompareMask", e); }
    }

    /// Invokes `vkCmdSetStencilWriteMask`.
    /// ```
    /// void vkCmdSetStencilWriteMask((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, ((uint32_t) VkFlags) VkStencilFaceFlags faceMask, uint32_t writeMask);
    /// ```
    public static void vkCmdSetStencilWriteMask(@NonNull VkCommandBuffer commandBuffer, int faceMask, int writeMask) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetStencilWriteMask)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdSetStencilWriteMask");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdSetStencilWriteMask", commandBuffer, faceMask, writeMask); }
        Handles.MH_vkCmdSetStencilWriteMask.invokeExact(commandBuffer.capabilities().PFN_vkCmdSetStencilWriteMask, commandBuffer.segment(), faceMask, writeMask); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetStencilWriteMask", e); }
    }

    /// Invokes `vkCmdSetStencilReference`.
    /// ```
    /// void vkCmdSetStencilReference((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, ((uint32_t) VkFlags) VkStencilFaceFlags faceMask, uint32_t reference);
    /// ```
    public static void vkCmdSetStencilReference(@NonNull VkCommandBuffer commandBuffer, int faceMask, int reference) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetStencilReference)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdSetStencilReference");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdSetStencilReference", commandBuffer, faceMask, reference); }
        Handles.MH_vkCmdSetStencilReference.invokeExact(commandBuffer.capabilities().PFN_vkCmdSetStencilReference, commandBuffer.segment(), faceMask, reference); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetStencilReference", e); }
    }

    /// Invokes `vkCmdBindDescriptorSets`.
    /// ```
    /// void vkCmdBindDescriptorSets((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, (int) VkPipelineBindPoint pipelineBindPoint, (uint64_t) VkPipelineLayout layout, uint32_t firstSet, uint32_t descriptorSetCount, const VkDescriptorSet* pDescriptorSets, uint32_t dynamicOffsetCount, const uint32_t* pDynamicOffsets);
    /// ```
    public static void vkCmdBindDescriptorSets(@NonNull VkCommandBuffer commandBuffer, int pipelineBindPoint, long layout, int firstSet, int descriptorSetCount, @NonNull MemorySegment pDescriptorSets, int dynamicOffsetCount, @NonNull MemorySegment pDynamicOffsets) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdBindDescriptorSets)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdBindDescriptorSets");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdBindDescriptorSets", commandBuffer, pipelineBindPoint, layout, firstSet, descriptorSetCount, pDescriptorSets, dynamicOffsetCount, pDynamicOffsets); }
        Handles.MH_vkCmdBindDescriptorSets.invokeExact(commandBuffer.capabilities().PFN_vkCmdBindDescriptorSets, commandBuffer.segment(), pipelineBindPoint, layout, firstSet, descriptorSetCount, pDescriptorSets, dynamicOffsetCount, pDynamicOffsets); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdBindDescriptorSets", e); }
    }

    /// Invokes `vkCmdBindIndexBuffer`.
    /// ```
    /// void vkCmdBindIndexBuffer((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, (uint64_t) VkBuffer buffer, (uint64_t) VkDeviceSize offset, (int) VkIndexType indexType);
    /// ```
    public static void vkCmdBindIndexBuffer(@NonNull VkCommandBuffer commandBuffer, long buffer, long offset, int indexType) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdBindIndexBuffer)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdBindIndexBuffer");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdBindIndexBuffer", commandBuffer, buffer, offset, indexType); }
        Handles.MH_vkCmdBindIndexBuffer.invokeExact(commandBuffer.capabilities().PFN_vkCmdBindIndexBuffer, commandBuffer.segment(), buffer, offset, indexType); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdBindIndexBuffer", e); }
    }

    /// Invokes `vkCmdBindVertexBuffers`.
    /// ```
    /// void vkCmdBindVertexBuffers((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, uint32_t firstBinding, uint32_t bindingCount, const VkBuffer* pBuffers, const VkDeviceSize* pOffsets);
    /// ```
    public static void vkCmdBindVertexBuffers(@NonNull VkCommandBuffer commandBuffer, int firstBinding, int bindingCount, @NonNull MemorySegment pBuffers, @NonNull MemorySegment pOffsets) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdBindVertexBuffers)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdBindVertexBuffers");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdBindVertexBuffers", commandBuffer, firstBinding, bindingCount, pBuffers, pOffsets); }
        Handles.MH_vkCmdBindVertexBuffers.invokeExact(commandBuffer.capabilities().PFN_vkCmdBindVertexBuffers, commandBuffer.segment(), firstBinding, bindingCount, pBuffers, pOffsets); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdBindVertexBuffers", e); }
    }

    /// Invokes `vkCmdDraw`.
    /// ```
    /// void vkCmdDraw((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, uint32_t vertexCount, uint32_t instanceCount, uint32_t firstVertex, uint32_t firstInstance);
    /// ```
    public static void vkCmdDraw(@NonNull VkCommandBuffer commandBuffer, int vertexCount, int instanceCount, int firstVertex, int firstInstance) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdDraw)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdDraw");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdDraw", commandBuffer, vertexCount, instanceCount, firstVertex, firstInstance); }
        Handles.MH_vkCmdDraw.invokeExact(commandBuffer.capabilities().PFN_vkCmdDraw, commandBuffer.segment(), vertexCount, instanceCount, firstVertex, firstInstance); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdDraw", e); }
    }

    /// Invokes `vkCmdDrawIndexed`.
    /// ```
    /// void vkCmdDrawIndexed((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, uint32_t indexCount, uint32_t instanceCount, uint32_t firstIndex, int32_t vertexOffset, uint32_t firstInstance);
    /// ```
    public static void vkCmdDrawIndexed(@NonNull VkCommandBuffer commandBuffer, int indexCount, int instanceCount, int firstIndex, int vertexOffset, int firstInstance) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdDrawIndexed)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdDrawIndexed");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdDrawIndexed", commandBuffer, indexCount, instanceCount, firstIndex, vertexOffset, firstInstance); }
        Handles.MH_vkCmdDrawIndexed.invokeExact(commandBuffer.capabilities().PFN_vkCmdDrawIndexed, commandBuffer.segment(), indexCount, instanceCount, firstIndex, vertexOffset, firstInstance); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdDrawIndexed", e); }
    }

    /// Invokes `vkCmdDrawIndirect`.
    /// ```
    /// void vkCmdDrawIndirect((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, (uint64_t) VkBuffer buffer, (uint64_t) VkDeviceSize offset, uint32_t drawCount, uint32_t stride);
    /// ```
    public static void vkCmdDrawIndirect(@NonNull VkCommandBuffer commandBuffer, long buffer, long offset, int drawCount, int stride) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdDrawIndirect)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdDrawIndirect");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdDrawIndirect", commandBuffer, buffer, offset, drawCount, stride); }
        Handles.MH_vkCmdDrawIndirect.invokeExact(commandBuffer.capabilities().PFN_vkCmdDrawIndirect, commandBuffer.segment(), buffer, offset, drawCount, stride); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdDrawIndirect", e); }
    }

    /// Invokes `vkCmdDrawIndexedIndirect`.
    /// ```
    /// void vkCmdDrawIndexedIndirect((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, (uint64_t) VkBuffer buffer, (uint64_t) VkDeviceSize offset, uint32_t drawCount, uint32_t stride);
    /// ```
    public static void vkCmdDrawIndexedIndirect(@NonNull VkCommandBuffer commandBuffer, long buffer, long offset, int drawCount, int stride) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdDrawIndexedIndirect)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdDrawIndexedIndirect");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdDrawIndexedIndirect", commandBuffer, buffer, offset, drawCount, stride); }
        Handles.MH_vkCmdDrawIndexedIndirect.invokeExact(commandBuffer.capabilities().PFN_vkCmdDrawIndexedIndirect, commandBuffer.segment(), buffer, offset, drawCount, stride); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdDrawIndexedIndirect", e); }
    }

    /// Invokes `vkCmdDispatch`.
    /// ```
    /// void vkCmdDispatch((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, uint32_t groupCountX, uint32_t groupCountY, uint32_t groupCountZ);
    /// ```
    public static void vkCmdDispatch(@NonNull VkCommandBuffer commandBuffer, int groupCountX, int groupCountY, int groupCountZ) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdDispatch)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdDispatch");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdDispatch", commandBuffer, groupCountX, groupCountY, groupCountZ); }
        Handles.MH_vkCmdDispatch.invokeExact(commandBuffer.capabilities().PFN_vkCmdDispatch, commandBuffer.segment(), groupCountX, groupCountY, groupCountZ); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdDispatch", e); }
    }

    /// Invokes `vkCmdDispatchIndirect`.
    /// ```
    /// void vkCmdDispatchIndirect((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, (uint64_t) VkBuffer buffer, (uint64_t) VkDeviceSize offset);
    /// ```
    public static void vkCmdDispatchIndirect(@NonNull VkCommandBuffer commandBuffer, long buffer, long offset) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdDispatchIndirect)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdDispatchIndirect");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdDispatchIndirect", commandBuffer, buffer, offset); }
        Handles.MH_vkCmdDispatchIndirect.invokeExact(commandBuffer.capabilities().PFN_vkCmdDispatchIndirect, commandBuffer.segment(), buffer, offset); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdDispatchIndirect", e); }
    }

    /// Invokes `vkCmdCopyBuffer`.
    /// ```
    /// void vkCmdCopyBuffer((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, (uint64_t) VkBuffer srcBuffer, (uint64_t) VkBuffer dstBuffer, uint32_t regionCount, const VkBufferCopy* pRegions);
    /// ```
    public static void vkCmdCopyBuffer(@NonNull VkCommandBuffer commandBuffer, long srcBuffer, long dstBuffer, int regionCount, @NonNull MemorySegment pRegions) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdCopyBuffer)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdCopyBuffer");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdCopyBuffer", commandBuffer, srcBuffer, dstBuffer, regionCount, pRegions); }
        Handles.MH_vkCmdCopyBuffer.invokeExact(commandBuffer.capabilities().PFN_vkCmdCopyBuffer, commandBuffer.segment(), srcBuffer, dstBuffer, regionCount, pRegions); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdCopyBuffer", e); }
    }

    /// Invokes `vkCmdCopyImage`.
    /// ```
    /// void vkCmdCopyImage((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, (uint64_t) VkImage srcImage, (int) VkImageLayout srcImageLayout, (uint64_t) VkImage dstImage, (int) VkImageLayout dstImageLayout, uint32_t regionCount, const VkImageCopy* pRegions);
    /// ```
    public static void vkCmdCopyImage(@NonNull VkCommandBuffer commandBuffer, long srcImage, int srcImageLayout, long dstImage, int dstImageLayout, int regionCount, @NonNull MemorySegment pRegions) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdCopyImage)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdCopyImage");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdCopyImage", commandBuffer, srcImage, srcImageLayout, dstImage, dstImageLayout, regionCount, pRegions); }
        Handles.MH_vkCmdCopyImage.invokeExact(commandBuffer.capabilities().PFN_vkCmdCopyImage, commandBuffer.segment(), srcImage, srcImageLayout, dstImage, dstImageLayout, regionCount, pRegions); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdCopyImage", e); }
    }

    /// Invokes `vkCmdBlitImage`.
    /// ```
    /// void vkCmdBlitImage((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, (uint64_t) VkImage srcImage, (int) VkImageLayout srcImageLayout, (uint64_t) VkImage dstImage, (int) VkImageLayout dstImageLayout, uint32_t regionCount, const VkImageBlit* pRegions, (int) VkFilter filter);
    /// ```
    public static void vkCmdBlitImage(@NonNull VkCommandBuffer commandBuffer, long srcImage, int srcImageLayout, long dstImage, int dstImageLayout, int regionCount, @NonNull MemorySegment pRegions, int filter) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdBlitImage)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdBlitImage");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdBlitImage", commandBuffer, srcImage, srcImageLayout, dstImage, dstImageLayout, regionCount, pRegions, filter); }
        Handles.MH_vkCmdBlitImage.invokeExact(commandBuffer.capabilities().PFN_vkCmdBlitImage, commandBuffer.segment(), srcImage, srcImageLayout, dstImage, dstImageLayout, regionCount, pRegions, filter); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdBlitImage", e); }
    }

    /// Invokes `vkCmdCopyBufferToImage`.
    /// ```
    /// void vkCmdCopyBufferToImage((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, (uint64_t) VkBuffer srcBuffer, (uint64_t) VkImage dstImage, (int) VkImageLayout dstImageLayout, uint32_t regionCount, const VkBufferImageCopy* pRegions);
    /// ```
    public static void vkCmdCopyBufferToImage(@NonNull VkCommandBuffer commandBuffer, long srcBuffer, long dstImage, int dstImageLayout, int regionCount, @NonNull MemorySegment pRegions) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdCopyBufferToImage)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdCopyBufferToImage");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdCopyBufferToImage", commandBuffer, srcBuffer, dstImage, dstImageLayout, regionCount, pRegions); }
        Handles.MH_vkCmdCopyBufferToImage.invokeExact(commandBuffer.capabilities().PFN_vkCmdCopyBufferToImage, commandBuffer.segment(), srcBuffer, dstImage, dstImageLayout, regionCount, pRegions); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdCopyBufferToImage", e); }
    }

    /// Invokes `vkCmdCopyImageToBuffer`.
    /// ```
    /// void vkCmdCopyImageToBuffer((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, (uint64_t) VkImage srcImage, (int) VkImageLayout srcImageLayout, (uint64_t) VkBuffer dstBuffer, uint32_t regionCount, const VkBufferImageCopy* pRegions);
    /// ```
    public static void vkCmdCopyImageToBuffer(@NonNull VkCommandBuffer commandBuffer, long srcImage, int srcImageLayout, long dstBuffer, int regionCount, @NonNull MemorySegment pRegions) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdCopyImageToBuffer)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdCopyImageToBuffer");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdCopyImageToBuffer", commandBuffer, srcImage, srcImageLayout, dstBuffer, regionCount, pRegions); }
        Handles.MH_vkCmdCopyImageToBuffer.invokeExact(commandBuffer.capabilities().PFN_vkCmdCopyImageToBuffer, commandBuffer.segment(), srcImage, srcImageLayout, dstBuffer, regionCount, pRegions); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdCopyImageToBuffer", e); }
    }

    /// Invokes `vkCmdUpdateBuffer`.
    /// ```
    /// void vkCmdUpdateBuffer((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, (uint64_t) VkBuffer dstBuffer, (uint64_t) VkDeviceSize dstOffset, (uint64_t) VkDeviceSize dataSize, const void* pData);
    /// ```
    public static void vkCmdUpdateBuffer(@NonNull VkCommandBuffer commandBuffer, long dstBuffer, long dstOffset, long dataSize, @NonNull MemorySegment pData) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdUpdateBuffer)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdUpdateBuffer");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdUpdateBuffer", commandBuffer, dstBuffer, dstOffset, dataSize, pData); }
        Handles.MH_vkCmdUpdateBuffer.invokeExact(commandBuffer.capabilities().PFN_vkCmdUpdateBuffer, commandBuffer.segment(), dstBuffer, dstOffset, dataSize, pData); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdUpdateBuffer", e); }
    }

    /// Invokes `vkCmdFillBuffer`.
    /// ```
    /// void vkCmdFillBuffer((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, (uint64_t) VkBuffer dstBuffer, (uint64_t) VkDeviceSize dstOffset, (uint64_t) VkDeviceSize size, uint32_t data);
    /// ```
    public static void vkCmdFillBuffer(@NonNull VkCommandBuffer commandBuffer, long dstBuffer, long dstOffset, long size, int data) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdFillBuffer)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdFillBuffer");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdFillBuffer", commandBuffer, dstBuffer, dstOffset, size, data); }
        Handles.MH_vkCmdFillBuffer.invokeExact(commandBuffer.capabilities().PFN_vkCmdFillBuffer, commandBuffer.segment(), dstBuffer, dstOffset, size, data); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdFillBuffer", e); }
    }

    /// Invokes `vkCmdClearColorImage`.
    /// ```
    /// void vkCmdClearColorImage((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, (uint64_t) VkImage image, (int) VkImageLayout imageLayout, const VkClearColorValue* pColor, uint32_t rangeCount, const VkImageSubresourceRange* pRanges);
    /// ```
    public static void vkCmdClearColorImage(@NonNull VkCommandBuffer commandBuffer, long image, int imageLayout, @NonNull MemorySegment pColor, int rangeCount, @NonNull MemorySegment pRanges) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdClearColorImage)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdClearColorImage");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdClearColorImage", commandBuffer, image, imageLayout, pColor, rangeCount, pRanges); }
        Handles.MH_vkCmdClearColorImage.invokeExact(commandBuffer.capabilities().PFN_vkCmdClearColorImage, commandBuffer.segment(), image, imageLayout, pColor, rangeCount, pRanges); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdClearColorImage", e); }
    }

    /// Invokes `vkCmdClearDepthStencilImage`.
    /// ```
    /// void vkCmdClearDepthStencilImage((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, (uint64_t) VkImage image, (int) VkImageLayout imageLayout, const VkClearDepthStencilValue* pDepthStencil, uint32_t rangeCount, const VkImageSubresourceRange* pRanges);
    /// ```
    public static void vkCmdClearDepthStencilImage(@NonNull VkCommandBuffer commandBuffer, long image, int imageLayout, @NonNull MemorySegment pDepthStencil, int rangeCount, @NonNull MemorySegment pRanges) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdClearDepthStencilImage)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdClearDepthStencilImage");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdClearDepthStencilImage", commandBuffer, image, imageLayout, pDepthStencil, rangeCount, pRanges); }
        Handles.MH_vkCmdClearDepthStencilImage.invokeExact(commandBuffer.capabilities().PFN_vkCmdClearDepthStencilImage, commandBuffer.segment(), image, imageLayout, pDepthStencil, rangeCount, pRanges); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdClearDepthStencilImage", e); }
    }

    /// Invokes `vkCmdClearAttachments`.
    /// ```
    /// void vkCmdClearAttachments((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, uint32_t attachmentCount, const VkClearAttachment* pAttachments, uint32_t rectCount, const VkClearRect* pRects);
    /// ```
    public static void vkCmdClearAttachments(@NonNull VkCommandBuffer commandBuffer, int attachmentCount, @NonNull MemorySegment pAttachments, int rectCount, @NonNull MemorySegment pRects) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdClearAttachments)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdClearAttachments");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdClearAttachments", commandBuffer, attachmentCount, pAttachments, rectCount, pRects); }
        Handles.MH_vkCmdClearAttachments.invokeExact(commandBuffer.capabilities().PFN_vkCmdClearAttachments, commandBuffer.segment(), attachmentCount, pAttachments, rectCount, pRects); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdClearAttachments", e); }
    }

    /// Invokes `vkCmdResolveImage`.
    /// ```
    /// void vkCmdResolveImage((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, (uint64_t) VkImage srcImage, (int) VkImageLayout srcImageLayout, (uint64_t) VkImage dstImage, (int) VkImageLayout dstImageLayout, uint32_t regionCount, const VkImageResolve* pRegions);
    /// ```
    public static void vkCmdResolveImage(@NonNull VkCommandBuffer commandBuffer, long srcImage, int srcImageLayout, long dstImage, int dstImageLayout, int regionCount, @NonNull MemorySegment pRegions) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdResolveImage)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdResolveImage");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdResolveImage", commandBuffer, srcImage, srcImageLayout, dstImage, dstImageLayout, regionCount, pRegions); }
        Handles.MH_vkCmdResolveImage.invokeExact(commandBuffer.capabilities().PFN_vkCmdResolveImage, commandBuffer.segment(), srcImage, srcImageLayout, dstImage, dstImageLayout, regionCount, pRegions); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdResolveImage", e); }
    }

    /// Invokes `vkCmdSetEvent`.
    /// ```
    /// void vkCmdSetEvent((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, (uint64_t) VkEvent event, ((uint32_t) VkFlags) VkPipelineStageFlags stageMask);
    /// ```
    public static void vkCmdSetEvent(@NonNull VkCommandBuffer commandBuffer, long event, int stageMask) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetEvent)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdSetEvent");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdSetEvent", commandBuffer, event, stageMask); }
        Handles.MH_vkCmdSetEvent.invokeExact(commandBuffer.capabilities().PFN_vkCmdSetEvent, commandBuffer.segment(), event, stageMask); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetEvent", e); }
    }

    /// Invokes `vkCmdResetEvent`.
    /// ```
    /// void vkCmdResetEvent((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, (uint64_t) VkEvent event, ((uint32_t) VkFlags) VkPipelineStageFlags stageMask);
    /// ```
    public static void vkCmdResetEvent(@NonNull VkCommandBuffer commandBuffer, long event, int stageMask) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdResetEvent)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdResetEvent");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdResetEvent", commandBuffer, event, stageMask); }
        Handles.MH_vkCmdResetEvent.invokeExact(commandBuffer.capabilities().PFN_vkCmdResetEvent, commandBuffer.segment(), event, stageMask); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdResetEvent", e); }
    }

    /// Invokes `vkCmdWaitEvents`.
    /// ```
    /// void vkCmdWaitEvents((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, uint32_t eventCount, const VkEvent* pEvents, ((uint32_t) VkFlags) VkPipelineStageFlags srcStageMask, ((uint32_t) VkFlags) VkPipelineStageFlags dstStageMask, uint32_t memoryBarrierCount, const VkMemoryBarrier* pMemoryBarriers, uint32_t bufferMemoryBarrierCount, const VkBufferMemoryBarrier* pBufferMemoryBarriers, uint32_t imageMemoryBarrierCount, const VkImageMemoryBarrier* pImageMemoryBarriers);
    /// ```
    public static void vkCmdWaitEvents(@NonNull VkCommandBuffer commandBuffer, int eventCount, @NonNull MemorySegment pEvents, int srcStageMask, int dstStageMask, int memoryBarrierCount, @NonNull MemorySegment pMemoryBarriers, int bufferMemoryBarrierCount, @NonNull MemorySegment pBufferMemoryBarriers, int imageMemoryBarrierCount, @NonNull MemorySegment pImageMemoryBarriers) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdWaitEvents)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdWaitEvents");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdWaitEvents", commandBuffer, eventCount, pEvents, srcStageMask, dstStageMask, memoryBarrierCount, pMemoryBarriers, bufferMemoryBarrierCount, pBufferMemoryBarriers, imageMemoryBarrierCount, pImageMemoryBarriers); }
        Handles.MH_vkCmdWaitEvents.invokeExact(commandBuffer.capabilities().PFN_vkCmdWaitEvents, commandBuffer.segment(), eventCount, pEvents, srcStageMask, dstStageMask, memoryBarrierCount, pMemoryBarriers, bufferMemoryBarrierCount, pBufferMemoryBarriers, imageMemoryBarrierCount, pImageMemoryBarriers); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdWaitEvents", e); }
    }

    /// Invokes `vkCmdPipelineBarrier`.
    /// ```
    /// void vkCmdPipelineBarrier((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, ((uint32_t) VkFlags) VkPipelineStageFlags srcStageMask, ((uint32_t) VkFlags) VkPipelineStageFlags dstStageMask, ((uint32_t) VkFlags) VkDependencyFlags dependencyFlags, uint32_t memoryBarrierCount, const VkMemoryBarrier* pMemoryBarriers, uint32_t bufferMemoryBarrierCount, const VkBufferMemoryBarrier* pBufferMemoryBarriers, uint32_t imageMemoryBarrierCount, const VkImageMemoryBarrier* pImageMemoryBarriers);
    /// ```
    public static void vkCmdPipelineBarrier(@NonNull VkCommandBuffer commandBuffer, int srcStageMask, int dstStageMask, int dependencyFlags, int memoryBarrierCount, @NonNull MemorySegment pMemoryBarriers, int bufferMemoryBarrierCount, @NonNull MemorySegment pBufferMemoryBarriers, int imageMemoryBarrierCount, @NonNull MemorySegment pImageMemoryBarriers) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdPipelineBarrier)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdPipelineBarrier");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdPipelineBarrier", commandBuffer, srcStageMask, dstStageMask, dependencyFlags, memoryBarrierCount, pMemoryBarriers, bufferMemoryBarrierCount, pBufferMemoryBarriers, imageMemoryBarrierCount, pImageMemoryBarriers); }
        Handles.MH_vkCmdPipelineBarrier.invokeExact(commandBuffer.capabilities().PFN_vkCmdPipelineBarrier, commandBuffer.segment(), srcStageMask, dstStageMask, dependencyFlags, memoryBarrierCount, pMemoryBarriers, bufferMemoryBarrierCount, pBufferMemoryBarriers, imageMemoryBarrierCount, pImageMemoryBarriers); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdPipelineBarrier", e); }
    }

    /// Invokes `vkCmdBeginQuery`.
    /// ```
    /// void vkCmdBeginQuery((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, (uint64_t) VkQueryPool queryPool, uint32_t query, ((uint32_t) VkFlags) VkQueryControlFlags flags);
    /// ```
    public static void vkCmdBeginQuery(@NonNull VkCommandBuffer commandBuffer, long queryPool, int query, int flags) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdBeginQuery)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdBeginQuery");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdBeginQuery", commandBuffer, queryPool, query, flags); }
        Handles.MH_vkCmdBeginQuery.invokeExact(commandBuffer.capabilities().PFN_vkCmdBeginQuery, commandBuffer.segment(), queryPool, query, flags); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdBeginQuery", e); }
    }

    /// Invokes `vkCmdEndQuery`.
    /// ```
    /// void vkCmdEndQuery((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, (uint64_t) VkQueryPool queryPool, uint32_t query);
    /// ```
    public static void vkCmdEndQuery(@NonNull VkCommandBuffer commandBuffer, long queryPool, int query) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdEndQuery)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdEndQuery");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdEndQuery", commandBuffer, queryPool, query); }
        Handles.MH_vkCmdEndQuery.invokeExact(commandBuffer.capabilities().PFN_vkCmdEndQuery, commandBuffer.segment(), queryPool, query); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdEndQuery", e); }
    }

    /// Invokes `vkCmdResetQueryPool`.
    /// ```
    /// void vkCmdResetQueryPool((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, (uint64_t) VkQueryPool queryPool, uint32_t firstQuery, uint32_t queryCount);
    /// ```
    public static void vkCmdResetQueryPool(@NonNull VkCommandBuffer commandBuffer, long queryPool, int firstQuery, int queryCount) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdResetQueryPool)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdResetQueryPool");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdResetQueryPool", commandBuffer, queryPool, firstQuery, queryCount); }
        Handles.MH_vkCmdResetQueryPool.invokeExact(commandBuffer.capabilities().PFN_vkCmdResetQueryPool, commandBuffer.segment(), queryPool, firstQuery, queryCount); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdResetQueryPool", e); }
    }

    /// Invokes `vkCmdWriteTimestamp`.
    /// ```
    /// void vkCmdWriteTimestamp((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, (int) VkPipelineStageFlagBits pipelineStage, (uint64_t) VkQueryPool queryPool, uint32_t query);
    /// ```
    public static void vkCmdWriteTimestamp(@NonNull VkCommandBuffer commandBuffer, int pipelineStage, long queryPool, int query) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdWriteTimestamp)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdWriteTimestamp");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdWriteTimestamp", commandBuffer, pipelineStage, queryPool, query); }
        Handles.MH_vkCmdWriteTimestamp.invokeExact(commandBuffer.capabilities().PFN_vkCmdWriteTimestamp, commandBuffer.segment(), pipelineStage, queryPool, query); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdWriteTimestamp", e); }
    }

    /// Invokes `vkCmdCopyQueryPoolResults`.
    /// ```
    /// void vkCmdCopyQueryPoolResults((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, (uint64_t) VkQueryPool queryPool, uint32_t firstQuery, uint32_t queryCount, (uint64_t) VkBuffer dstBuffer, (uint64_t) VkDeviceSize dstOffset, (uint64_t) VkDeviceSize stride, ((uint32_t) VkFlags) VkQueryResultFlags flags);
    /// ```
    public static void vkCmdCopyQueryPoolResults(@NonNull VkCommandBuffer commandBuffer, long queryPool, int firstQuery, int queryCount, long dstBuffer, long dstOffset, long stride, int flags) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdCopyQueryPoolResults)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdCopyQueryPoolResults");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdCopyQueryPoolResults", commandBuffer, queryPool, firstQuery, queryCount, dstBuffer, dstOffset, stride, flags); }
        Handles.MH_vkCmdCopyQueryPoolResults.invokeExact(commandBuffer.capabilities().PFN_vkCmdCopyQueryPoolResults, commandBuffer.segment(), queryPool, firstQuery, queryCount, dstBuffer, dstOffset, stride, flags); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdCopyQueryPoolResults", e); }
    }

    /// Invokes `vkCmdPushConstants`.
    /// ```
    /// void vkCmdPushConstants((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, (uint64_t) VkPipelineLayout layout, ((uint32_t) VkFlags) VkShaderStageFlags stageFlags, uint32_t offset, uint32_t size, const void* pValues);
    /// ```
    public static void vkCmdPushConstants(@NonNull VkCommandBuffer commandBuffer, long layout, int stageFlags, int offset, int size, @NonNull MemorySegment pValues) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdPushConstants)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdPushConstants");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdPushConstants", commandBuffer, layout, stageFlags, offset, size, pValues); }
        Handles.MH_vkCmdPushConstants.invokeExact(commandBuffer.capabilities().PFN_vkCmdPushConstants, commandBuffer.segment(), layout, stageFlags, offset, size, pValues); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdPushConstants", e); }
    }

    /// Invokes `vkCmdBeginRenderPass`.
    /// ```
    /// void vkCmdBeginRenderPass((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, const VkRenderPassBeginInfo* pRenderPassBegin, (int) VkSubpassContents contents);
    /// ```
    public static void vkCmdBeginRenderPass(@NonNull VkCommandBuffer commandBuffer, @NonNull MemorySegment pRenderPassBegin, int contents) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdBeginRenderPass)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdBeginRenderPass");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdBeginRenderPass", commandBuffer, pRenderPassBegin, contents); }
        Handles.MH_vkCmdBeginRenderPass.invokeExact(commandBuffer.capabilities().PFN_vkCmdBeginRenderPass, commandBuffer.segment(), pRenderPassBegin, contents); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdBeginRenderPass", e); }
    }

    /// Invokes `vkCmdNextSubpass`.
    /// ```
    /// void vkCmdNextSubpass((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, (int) VkSubpassContents contents);
    /// ```
    public static void vkCmdNextSubpass(@NonNull VkCommandBuffer commandBuffer, int contents) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdNextSubpass)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdNextSubpass");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdNextSubpass", commandBuffer, contents); }
        Handles.MH_vkCmdNextSubpass.invokeExact(commandBuffer.capabilities().PFN_vkCmdNextSubpass, commandBuffer.segment(), contents); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdNextSubpass", e); }
    }

    /// Invokes `vkCmdEndRenderPass`.
    /// ```
    /// void vkCmdEndRenderPass((struct VkCommandBuffer*) VkCommandBuffer commandBuffer);
    /// ```
    public static void vkCmdEndRenderPass(@NonNull VkCommandBuffer commandBuffer) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdEndRenderPass)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdEndRenderPass");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdEndRenderPass", commandBuffer); }
        Handles.MH_vkCmdEndRenderPass.invokeExact(commandBuffer.capabilities().PFN_vkCmdEndRenderPass, commandBuffer.segment()); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdEndRenderPass", e); }
    }

    /// Invokes `vkCmdExecuteCommands`.
    /// ```
    /// void vkCmdExecuteCommands((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, uint32_t commandBufferCount, const VkCommandBuffer* pCommandBuffers);
    /// ```
    public static void vkCmdExecuteCommands(@NonNull VkCommandBuffer commandBuffer, int commandBufferCount, @NonNull MemorySegment pCommandBuffers) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdExecuteCommands)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdExecuteCommands");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdExecuteCommands", commandBuffer, commandBufferCount, pCommandBuffers); }
        Handles.MH_vkCmdExecuteCommands.invokeExact(commandBuffer.capabilities().PFN_vkCmdExecuteCommands, commandBuffer.segment(), commandBufferCount, pCommandBuffers); }
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
